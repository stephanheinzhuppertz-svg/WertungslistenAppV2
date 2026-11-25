B4A=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=12.8
@EndOfDesignText@
' B4XPage: Settings (konvertiert aus Settings.scm & Settings.bky)
' Benötigte Bibliotheken: B4XPages, XUI, OkHttpUtils2, JSON, Phone, JavaObject

Sub Class_Globals
	Private Root As B4XView
	Private xui As XUI
	
	' --- Globale Variablen (aus Settings.bky) ---
	Public URLveranstaltungen As String = "https://wertungslisten-app-default-rtdb.europe-west1.firebasedatabase.app/Vereine/[...]/Veranstaltungen"
	Public URLteilnehmer As String = "https://wertungslisten-app-default-rtdb.europe-west1.firebasedatabase.app/Vereine/[...]/Teilnehmer"
	Public URLergebnisse As String = "https://wertungslisten-app-default-rtdb.europe-west1.firebasedatabase.app/Vereine/[...]/Ergebnisse"
	Public DBdatenTyp As String = ""
	Public dochange As Boolean = False
	Public Status As Map
	Public Veranstaltungen As Map
	Public webviewVSTGN As List
	Public Veranstaltung_ID As String = "v0"
	Public webviewVSTGN_ID As String = "v0"
	Public VSTGNnewID As String = "v1"
	Public Teilnehmer As List
	Public TLNid As String = "t0"
	Public TLNnewID As String = "t1"
	Public colorgreen As Int = 0xFF16AA16
	Public colorblue As Int = 0xFF3333FF
	
	' --- UI-Komponenten (aus Settings.scm) ---
	Private lblVerein As Label
	Private lblVeranstaltung As Label
	Private lblDatum As Label
	Private btnBack As Button
	
	Private svMain As ScrollView
	Private lblClosed As Label
	Private dprDatum As Button ' Ersetzt App Inventor DatePicker (öffnet Android DatePickerDialog)
	Private btnAuswahl As Button
	Private tbxVeranstaltung As EditText
	Private tbxAnzahl As EditText
	Private btnVerstgDelete As Button
	Private btnVerstgSpeichern As Button
	
	Private lstVeranstaltungen As ListView
	Private lstTeilnehmer As ListView
	
	Private tbxTeilnehmer As EditText
	Private btnTLNDelete As Button
	Private btnTLNSpeichern As Button
		
	' --- Nicht-sichtbare Komponenten & Hilfsvariablen ---
	Private Uhrzeit As Timer
	Private DBVerein As Map
	Private DBFileName As String = "DBVerein.dat"
	Private CurrentWebUrl As String = ""
	Private dprYear As Int
	Private dprMonth As Int
	Private dprDay As Int
End Sub

Public Sub Initialize
	Status.Initialize
	Veranstaltungen.Initialize
	Teilnehmer.Initialize

	LoadTinyDB

	Uhrzeit.Initialize("Uhrzeit", 300000)

	dprYear = DateTime.GetYear(DateTime.Now)
	dprMonth = DateTime.GetMonth(DateTime.Now)
	dprDay = DateTime.GetDayOfMonth(DateTime.Now)
End Sub

Private Sub B4XPage_Created (Root1 As B4XView)
	Root = Root1
	
	'B4XPages.SetTitle(Me, "Wertungslisten-App Einstellungen")
	'BuildUI
	
	Root.LoadLayout("Settings")
	
	' B4XPage_Appear wird von B4XPages automatisch nach B4XPage_Created aufgerufen
End Sub

Public Sub B4XPage_Appear
	
	LoadTinyDB
	
	If B4XPages.MainPage.Status.IsInitialized And B4XPages.MainPage.Status.Size > 0 Then
		Status = B4XPages.MainPage.Status
	End If
	
	Veranstaltung_ID = DBGet("VeranstaltungID", "v0")
	'colorblue = lblVeranstaltung.TextColor
	'colorgreen = lblVerein.TextColor
	
	disableVSTNG
	disableTLN
	setzeHeaderfromDB
	changeURL
	
	If Veranstaltung_ID = "v0" Then
		DBPut("VeranstaltungDatum", "")
	End If
	
	If Status.GetDefault("idToken", "") = "" Then
		CloseSettings
	Else
		holeVeranstaltungen
	End If
	startTimer
End Sub

Private Sub B4XPage_CloseRequest As ResumableSub
	Uhrzeit.Enabled = False
	B4XPages.MainPage.Status = Status
	Return True
End Sub

Private Sub CloseSettings
	Uhrzeit.Enabled = False
	B4XPages.MainPage.Status = Status
	B4XPages.ClosePage(Me)
End Sub

' ==============================================================================
' 1. UI-AUFBAU (1:1 aus Settings.scm)
' ==============================================================================
Private Sub BuildUI
	Log("BuildUI Anfang")
	dochange = False
	Root.Color = Colors.White
	
	' --- Oberer Header (VerticalArrangement5) ---
	Dim pnlHeader As Panel
	pnlHeader.Initialize("")
	pnlHeader.Color = Colors.White
	Root.AddView(pnlHeader, 0, 0, 100%x, 80dip)
	
	Dim lblW1 As Int = 115dip
	Dim lblW2 As Int = 100%x - lblW1 - 45dip
	
	Dim Label5 As Label
	Label5.Initialize("")
	Label5.Text = "Verein:"
	Label5.Typeface = Typeface.DEFAULT_BOLD
	Label5.TextColor = Colors.Black
	Label5.Gravity = Gravity.RIGHT + Gravity.CENTER_VERTICAL
	pnlHeader.AddView(Label5, 5dip, 4dip, lblW1, 24dip)
	
	lblVerein.Initialize("")
	lblVerein.Text = "- Vereinsbezeichnung -"
	lblVerein.Typeface = Typeface.DEFAULT_BOLD
	lblVerein.TextColor = 0xFF16AA16
	lblVerein.Gravity = Gravity.LEFT + Gravity.CENTER_VERTICAL
	pnlHeader.AddView(lblVerein, lblW1 + 8dip, 4dip, lblW2, 24dip)
	
	Dim Label10 As Label
	Label10.Initialize("")
	Label10.Text = "Veranstaltung:"
	Label10.Typeface = Typeface.DEFAULT_BOLD
	Label10.TextColor = Colors.Black
	Label10.Gravity = Gravity.RIGHT + Gravity.CENTER_VERTICAL
	pnlHeader.AddView(Label10, 5dip, 28dip, lblW1, 24dip)
	
	lblVeranstaltung.Initialize("")
	lblVeranstaltung.Text = "-Veranstaltung-"
	lblVeranstaltung.Typeface = Typeface.DEFAULT_BOLD
	lblVeranstaltung.TextColor = 0xFF3333FF
	lblVeranstaltung.Gravity = Gravity.LEFT + Gravity.CENTER_VERTICAL
	pnlHeader.AddView(lblVeranstaltung, lblW1 + 8dip, 28dip, lblW2, 24dip)
	
	Dim Label12 As Label
	Label12.Initialize("")
	Label12.Text = "Datum:"
	Label12.Typeface = Typeface.DEFAULT_BOLD
	Label12.TextColor = Colors.Black
	Label12.Gravity = Gravity.RIGHT + Gravity.CENTER_VERTICAL
	pnlHeader.AddView(Label12, 5dip, 52dip, lblW1, 24dip)
	
	lblDatum.Initialize("")
	lblDatum.Text = "- Datum -"
	lblDatum.Typeface = Typeface.DEFAULT_BOLD
	lblDatum.TextColor = 0xFF3333FF
	lblDatum.Gravity = Gravity.LEFT + Gravity.CENTER_VERTICAL
	pnlHeader.AddView(lblDatum, lblW1 + 8dip, 52dip, lblW2, 24dip)
	
	btnBack.Initialize("btnBack")
	SetButtonImageSafe(btnBack, "Arrows-Back.png", "◀")
	pnlHeader.AddView(btnBack, 100%x - 36dip, 26dip, 28dip, 28dip)
	
	' --- Scrollbarer Hauptbereich ---
	svMain.Initialize(950dip)
	Root.AddView(svMain, 0, 80dip, 100%x, 100%y - 80dip)
	Dim pnlContent As Panel = svMain.Panel
	pnlContent.Color = Colors.White
	
	Dim curY As Int = 0
	
	' Trenner 1
	AddDivider(pnlContent, curY, 12dip, 0xFFEEFFEE)
	curY = curY + 12dip
	
	' --- Block 1: Veranstaltung bearbeiten ---
	Dim pnlVstng As Panel
	pnlVstng.Initialize("")
	pnlVstng.Color = 0xAAEEFFEE
	pnlContent.AddView(pnlVstng, 0, curY, 100%x, 225dip)
	
	Dim Label6 As Label
	Label6.Initialize("")
	Label6.Text = "Veranstaltung"
	Label6.TextSize = 18
	Label6.Typeface = Typeface.DEFAULT_BOLD
	Label6.TextColor = 0xFF16AA16
	Label6.Gravity = Gravity.CENTER_VERTICAL
	pnlVstng.AddView(Label6, 15dip, 8dip, 140dip, 28dip)
	
	lblClosed.Initialize("")
	lblClosed.Text = "geschlossen"
	lblClosed.Typeface = Typeface.DEFAULT_BOLD
	lblClosed.TextColor = Colors.Red
	lblClosed.Gravity = Gravity.CENTER_VERTICAL
	lblClosed.Visible = False
	pnlVstng.AddView(lblClosed, 160dip, 8dip, 120dip, 28dip)
	
	' Zeile Datum + Auswahl
	Dim Label7 As Label
	Label7.Initialize("")
	Label7.Text = "Datum:"
	Label7.Typeface = Typeface.DEFAULT_BOLD
	Label7.TextColor = Colors.Black
	Label7.Gravity = Gravity.RIGHT + Gravity.CENTER_VERTICAL
	pnlVstng.AddView(Label7, 5dip, 44dip, 115dip, 40dip)
	
	dprDatum.Initialize("dprDatum")
	dprDatum.Text = "Datum"
	dprDatum.Typeface = Typeface.DEFAULT_BOLD
	dprDatum.TextColor = 0xFF16AA16
	pnlVstng.AddView(dprDatum, 128dip, 44dip, 115dip, 40dip)
	
	btnAuswahl.Initialize("btnAuswahl")
	btnAuswahl.Text = "Auswahl"
	btnAuswahl.TextSize = 14
	btnAuswahl.Typeface = Typeface.DEFAULT_BOLD
	btnAuswahl.TextColor = 0xFF3333FF
	pnlVstng.AddView(btnAuswahl, 100%x - 105dip, 44dip, 95dip, 40dip)
	
	' Zeile Bezeichnung
	Dim Label8 As Label
	Label8.Initialize("")
	Label8.Text = "Bezeichnung:"
	Label8.Typeface = Typeface.DEFAULT_BOLD
	Label8.TextColor = Colors.Black
	Label8.Gravity = Gravity.RIGHT + Gravity.CENTER_VERTICAL
	pnlVstng.AddView(Label8, 5dip, 90dip, 115dip, 42dip)
	
	Dim et As EditText
	et.Initialize("Test")
	
	Log("vor Init Veranstaltung")
	'tbxVeranstaltung.Initialize("tbxVeranstaltung")
	tbxVeranstaltung.Initialize("")
	Log("TextSize")	
	tbxVeranstaltung.TextSize = 16
	Log("Typeface")
	tbxVeranstaltung.Typeface = Typeface.DEFAULT_BOLD
	Log("TextColor")
	tbxVeranstaltung.TextColor = 0xFF16AA16
	Log("SingleLine")
	tbxVeranstaltung.SingleLine = True
	tbxVeranstaltung.Initialize("tbxVeranstaltung")
	Log("AddView")
	pnlVstng.AddView(tbxVeranstaltung, 128dip, 90dip, 100%x - 138dip, 42dip)
	Log("nach AddView")
	
	' Zeile Plätze
	Dim Label9 As Label
	Label9.Initialize("")
	Label9.Text = "Plätze:"
	Label9.Typeface = Typeface.DEFAULT_BOLD
	Label9.TextColor = Colors.Black
	Label9.Gravity = Gravity.RIGHT + Gravity.CENTER_VERTICAL
	pnlVstng.AddView(Label9, 5dip, 138dip, 115dip, 42dip)
	
	tbxAnzahl.Initialize("tbxAnzahl")
	tbxAnzahl.TextSize = 16
	tbxAnzahl.Typeface = Typeface.DEFAULT_BOLD
	tbxAnzahl.TextColor = 0xFF16AA16
	tbxAnzahl.Gravity = Gravity.RIGHT + Gravity.CENTER_VERTICAL
	tbxAnzahl.InputType = tbxAnzahl.INPUT_TYPE_NUMBERS
	'tbxAnzahl.SingleLine = True
	pnlVstng.AddView(tbxAnzahl, 128dip, 138dip, 100dip, 42dip)
	
	' Buttons Löschen / Speichern (Veranstaltung)
	btnVerstgDelete.Initialize("btnVerstgDelete")
	btnVerstgDelete.Text = "Löschen"
	btnVerstgDelete.Typeface = Typeface.DEFAULT_BOLD
	btnVerstgDelete.TextColor = 0xFF16AA16
	pnlVstng.AddView(btnVerstgDelete, 25dip, 184dip, 115dip, 36dip)
	
	btnVerstgSpeichern.Initialize("btnVerstgSpeichern")
	btnVerstgSpeichern.Text = "Speichern"
	btnVerstgSpeichern.Typeface = Typeface.DEFAULT_BOLD
	btnVerstgSpeichern.TextColor = 0xFF16AA16
	pnlVstng.AddView(btnVerstgSpeichern, 100%x - 140dip, 184dip, 115dip, 36dip)
	
	curY = curY + 225dip
	AddDivider(pnlContent, curY, 12dip, 0xFFEEFFEE)
	curY = curY + 12dip
	
	' --- WebView Veranstaltungen ---
	'webVeranstaltungen.Initialize("webVeranstaltungen")
	'webVeranstaltungen.JavaScriptEnabled = True
	'SetupWebViewBridge(webVeranstaltungen, "AppInventorVSTGN")
	'pnlContent.AddView(webVeranstaltungen, 0, curY, 100%x, 220dip)
	lstVeranstaltungen.Initialize("lstVeranstaltungen")
	lstVeranstaltungen.SingleLineLayout.Label.TextColor = 0xFF16AA16
	lstVeranstaltungen.SingleLineLayout.Label.TextSize = 16
	pnlContent.AddView(lstVeranstaltungen, 0, curY, 100%x, 220dip)
	curY = curY + 220dip
		
	AddDivider(pnlContent, curY, 12dip, 0xFFEEFFEE)
	curY = curY + 12dip
	
	' --- Block 2: Teilnehmer bearbeiten ---
	Dim pnlTln As Panel
	pnlTln.Initialize("")
	pnlTln.Color = 0xDDEEFFEE
	pnlContent.AddView(pnlTln, 0, curY, 100%x, 145dip)
	
	Dim Label2 As Label
	Label2.Initialize("")
	Label2.Text = "Teilnehmer"
	Label2.TextSize = 18
	Label2.Typeface = Typeface.DEFAULT_BOLD
	Label2.TextColor = 0xFF16AA16
	Label2.Gravity = Gravity.CENTER_VERTICAL
	pnlTln.AddView(Label2, 15dip, 8dip, 110dip, 28dip)
	
	Dim Label15 As Label
	Label15.Initialize("")
	Label15.Text = "(unabhängig von Veranstaltung)"
	Label15.TextSize = 10
	Label15.TextColor = Colors.DarkGray
	Label15.Gravity = Gravity.CENTER_VERTICAL
	pnlTln.AddView(Label15, 125dip, 8dip, 100%x - 135dip, 28dip)
	
	Dim Label14 As Label
	Label14.Initialize("")
	Label14.Text = "Name, Vorname:"
	Label14.Typeface = Typeface.DEFAULT_BOLD
	Label14.TextColor = Colors.Black
	Label14.Gravity = Gravity.RIGHT + Gravity.CENTER_VERTICAL
	pnlTln.AddView(Label14, 5dip, 44dip, 115dip, 42dip)
	
	tbxTeilnehmer.Initialize("tbxTeilnehmer")
	tbxTeilnehmer.TextSize = 16
	tbxTeilnehmer.Typeface = Typeface.DEFAULT_BOLD
	tbxTeilnehmer.TextColor = 0xFF16AA16
	'tbxTeilnehmer.SingleLine = True
	pnlTln.AddView(tbxTeilnehmer, 128dip, 44dip, 100%x - 138dip, 42dip)
	
	btnTLNDelete.Initialize("btnTLNDelete")
	btnTLNDelete.Text = "Löschen"
	btnTLNDelete.Typeface = Typeface.DEFAULT_BOLD
	btnTLNDelete.TextColor = 0xFF16AA16
	pnlTln.AddView(btnTLNDelete, 25dip, 98dip, 115dip, 36dip)
	
	btnTLNSpeichern.Initialize("btnTLNSpeichern")
	btnTLNSpeichern.Text = "Speichern"
	btnTLNSpeichern.Typeface = Typeface.DEFAULT_BOLD
	btnTLNSpeichern.TextColor = 0xFF16AA16
	pnlTln.AddView(btnTLNSpeichern, 100%x - 140dip, 98dip, 115dip, 36dip)
	
	curY = curY + 145dip
	AddDivider(pnlContent, curY, 12dip, 0xFFEEFFEE)
	curY = curY + 12dip
	
	' --- WebView Teilnehmer ---
	'webTeilnehmer.Initialize("webTeilnehmer")
	'webTeilnehmer.JavaScriptEnabled = True
	'SetupWebViewBridge(webTeilnehmer, "AppInventorTLN")
	'pnlContent.AddView(webTeilnehmer, 0, curY, 100%x, 260dip)
	lstTeilnehmer.Initialize("lstTeilnehmer")
	lstTeilnehmer.SingleLineLayout.Label.TextColor = 0xFF16AA16
	lstTeilnehmer.SingleLineLayout.Label.TextSize = 16
	pnlContent.AddView(lstTeilnehmer, 0, curY, 100%x, 260dip)
	curY = curY + 270dip
	
	pnlContent.Height = curY
	Log("BuildUI Ende")
	dochange = True

End Sub

Private Sub AddDivider(parent As Panel, topPos As Int, h As Int, col As Int)
	Dim p As Panel
	p.Initialize("")
	p.Color = col
	parent.AddView(p, 0, topPos, 100%x, h)
End Sub

Private Sub SetButtonImageSafe(btn As Button, fileName As String, fallbackText As String)
	If File.Exists(File.DirAssets, fileName) Then
		btn.SetBackgroundImage(LoadBitmap(File.DirAssets, fileName))
	Else
		btn.Text = fallbackText
	End If
End Sub

' ==============================================================================
' 2. ZUSTANDS-STEUERUNG & HEADER
' ==============================================================================
Private Sub disableVSTNG
	dprDatum.Enabled = False
	dprDatum.TextColor = 0xFF888888
	btnVerstgDelete.Enabled = False
	btnVerstgDelete.TextColor = 0xFF888888
	btnVerstgSpeichern.Enabled = False
	btnVerstgSpeichern.TextColor = 0xFF888888
	tbxVeranstaltung.Enabled = False
	tbxAnzahl.Enabled = False
	btnAuswahl.Enabled = False
	btnAuswahl.TextColor = 0xFF888888
End Sub

Private Sub enableVSTNG
	dprDatum.Enabled = True
	dprDatum.TextColor = colorgreen
	btnVerstgDelete.Enabled = True
	btnVerstgDelete.TextColor = colorgreen
	btnVerstgSpeichern.Enabled = False
	btnVerstgSpeichern.TextColor = 0xFF888888
	tbxVeranstaltung.Enabled = True
	tbxAnzahl.Enabled = True
	btnAuswahl.Enabled = False
	btnAuswahl.TextColor = 0xFF888888
End Sub

Private Sub disableTLN
	btnTLNDelete.Enabled = False
	btnTLNSpeichern.Enabled = False
	tbxTeilnehmer.Enabled = False
	btnTLNDelete.TextColor = 0xFF888888
	btnTLNSpeichern.TextColor = 0xFF888888
End Sub

Private Sub enableTLN
	btnTLNDelete.Enabled = True
	btnTLNSpeichern.Enabled = False
	tbxTeilnehmer.Enabled = True
	btnTLNDelete.TextColor = colorgreen
	btnTLNSpeichern.TextColor = 0xFF888888
End Sub

Private Sub setzeHeaderfromDB
	lblVerein.Text = DBGet("Bezeichnung", "- nicht gesetzt -")
	lblVeranstaltung.Text = DBGet("VeranstaltungName", "- nicht gesetzt -")
	lblDatum.Text = DBGet("VeranstaltungDatum", "- nicht gesetzt -")
End Sub

Private Sub changeURL
	Dim url As String = DBGet("VereinsID", "[...]")
	URLveranstaltungen = "https://wertungslisten-app-default-rtdb.europe-west1.firebasedatabase.app/Vereine/" & url & "/Veranstaltungen"
	URLteilnehmer = "https://wertungslisten-app-default-rtdb.europe-west1.firebasedatabase.app/Vereine/" & url & "/Teilnehmer"
	URLergebnisse = "https://wertungslisten-app-default-rtdb.europe-west1.firebasedatabase.app/Vereine/" & url & "/Ergebnisse"
End Sub

' ==============================================================================
' 3. VERANSTALTUNGEN LADEN, ANZEIGEN, BEARBEITEN, LÖSCHEN
' ==============================================================================
Private Sub holeVeranstaltungen
	DBdatenTyp = "Veranstaltungen"
	CurrentWebUrl = URLveranstaltungen & ".json?auth=" & Status.GetDefault("idToken", "")
	ExecuteHttp("GET", CurrentWebUrl, "")
End Sub

Private Sub ladeVeranstaltungen
	dprDatum.Enabled = True
	dprDatum.TextColor = colorgreen
	dprDatum.Text = FormatDateCustom(DateTime.Now, "dd.MM.yyyy")
	dprYear = DateTime.GetYear(DateTime.Now)
	dprMonth = DateTime.GetMonth(DateTime.Now)
	dprDay = DateTime.GetDayOfMonth(DateTime.Now)
	
	webviewVSTGN.Initialize
	webviewVSTGN.AddAll(Array As Object("Datum", "Name", "vid"))
	
	If Not(Veranstaltungen.IsInitialized) Or Veranstaltungen.Size = 0 Then
		Veranstaltung_ID = "v0"
		webviewVSTGN_ID = "v0"
		VSTGNnewID = "v1"
		webviewVSTGN.AddAll(Array As Object("Veranstaltungs_ID", "v0"))
		setzeVeranstaltung("v0")
	Else
		For Each key As String In Veranstaltungen.Keys
			Dim newID As Int = key.Replace("v", "") + 1
			Dim curMax As Int = VSTGNnewID.Replace("v", "")
			If newID > curMax Then
				VSTGNnewID = "v" & newID
			End If
			Dim ergebnis As Map = Veranstaltungen.Get(key)
			webviewVSTGN.AddAll(Array As Object( _
				ergebnis.GetDefault("Datum", FormatDateCustom(DateTime.Now, "dd.MM.yyyy")), _
				ergebnis.GetDefault("Name", "- n.n. -"), _
				key))
		Next
		webviewVSTGN.AddAll(Array As Object("Veranstaltungs_ID", webviewVSTGN_ID))
	End If
End Sub

Private Sub setzeVeranstaltung(vid As String)
	disableVSTNG
	Dim veranstaltung As Map
	If Veranstaltungen.IsInitialized And Veranstaltungen.ContainsKey(vid) Then
		veranstaltung = Veranstaltungen.Get(vid)
	Else
		veranstaltung.Initialize
	End If
	
	Dim datum As String = veranstaltung.GetDefault("Datum", FormatDateCustom(DateTime.Now, "dd.MM.yyyy"))
	Dim datum_spl() As String = Regex.Split("\.", datum)
	If datum_spl.Length >= 3 Then
		dprYear = datum_spl(2)
		dprMonth = datum_spl(1)
		dprDay = datum_spl(0)
	End If
	
	dprDatum.Text = datum
	
	'tbxVeranstaltung.Text = veranstaltung.GetDefault("Name", "unbenannt")
	

	tbxAnzahl.Text = veranstaltung.GetDefault("Teilnehmerzahl", "0")
	
	If "offen" = veranstaltung.GetDefault("Status", "offen") Then
		dprDatum.Enabled = True
		dprDatum.TextColor = colorgreen
		tbxVeranstaltung.Enabled = True
		tbxAnzahl.Enabled = True
		lblClosed.Visible = False
	Else
		lblClosed.Visible = True
	End If
	
	btnVerstgDelete.Enabled = True
	btnVerstgDelete.TextColor = colorgreen
	
	If vid <> "v0" Then
		btnAuswahl.TextColor = colorblue
		btnAuswahl.Enabled = True
	End If
End Sub

Private Sub pruefeDBVerein
	Dim VSTNGexists As Boolean = False
	Dim savedID As String = DBGet("VeranstaltungID", "v0")
	
	If Veranstaltungen.IsInitialized And Veranstaltungen.Size > 0 Then
		For Each key As String In Veranstaltungen.Keys
			webviewVSTGN_ID = key
			If key = savedID Then
				VSTNGexists = True
				Exit
			End If
		Next
	End If
	
	If Not(VSTNGexists) Then
		lblVeranstaltung.Text = "- noch nicht ausgewählt -"
		lblDatum.Text = "- bitte auswählen -"
		Veranstaltung_ID = "v0"
		VSTGNnewID = "v1"
		DBPut("VeranstaltungID", "v0")
	End If
End Sub

Private Sub saveVSTNG
	disableVSTNG
	Dim DBkey As String = webviewVSTGN_ID
	If DBkey = "v0" Then
		DBkey = VSTGNnewID
		webviewVSTGN_ID = VSTGNnewID
	End If
	
	Dim body As Map = CreateMap( _
		"Datum": dprDatum.Text, _
		"Name": tbxVeranstaltung.Text, _
		"Teilnehmerzahl": tbxAnzahl.Text, _
		"Status": "offen")
		
	CurrentWebUrl = URLveranstaltungen & "/" & DBkey & ".json?auth=" & Status.GetDefault("idToken", "")
	DBdatenTyp = "addVSTNG"
	
	Dim jg As JSONGenerator
	jg.Initialize(body)
	ExecuteHttp("PUT", CurrentWebUrl, jg.ToString)
	
	If Veranstaltung_ID = webviewVSTGN_ID Then
		saveDBvstng
	End If
	enableVSTNG
End Sub

Private Sub saveDBvstng
	lblVeranstaltung.Text = tbxVeranstaltung.Text
	lblDatum.Text = dprDatum.Text
	DBPut("VeranstaltungID", Veranstaltung_ID)
	DBPut("VeranstaltungName", tbxVeranstaltung.Text)
	DBPut("VeranstaltungDatum", dprDatum.Text)
	DBPut("VeranstaltungAnzahl", tbxAnzahl.Text)
End Sub

Private Sub delWertungsliste(vid As String)
	disableVSTNG
	If Veranstaltungen.IsInitialized And Veranstaltungen.ContainsKey(vid) Then
		Dim veranstaltung As Map = Veranstaltungen.Get(vid)
		Dim datumStr As String = veranstaltung.GetDefault("Datum", "00.00.0000")
		Dim datum_spl() As String = Regex.Split("\.", datumStr)
		If datum_spl.Length >= 3 Then
			DBdatenTyp = "delErgebnis"
			CurrentWebUrl = URLergebnisse & "/e" & datum_spl(2) & datum_spl(1) & datum_spl(0) & ".json?auth=" & Status.GetDefault("idToken", "")
			ExecuteHttp("DELETE", CurrentWebUrl, "")
		End If
	End If
End Sub

Private Sub delVeranstaltung(vid As String)
	disableVSTNG
	If Veranstaltungen.IsInitialized And Veranstaltungen.ContainsKey(vid) Then
		Dim veranstaltung As Map = Veranstaltungen.Get(vid)
		Dim vName As String = veranstaltung.GetDefault("Name", " unbenannt ")
		Dim vDatum As String = veranstaltung.GetDefault("Datum", FormatDateCustom(DateTime.Now, "dd.MM.yyyy"))
		ToastMessageShow("Die Veranstaltung " & vName & " vom " & vDatum & " wird gelöscht!", False)
		
		DBdatenTyp = "delVeranstaltung"
		CurrentWebUrl = URLveranstaltungen & "/" & vid & ".json?auth=" & Status.GetDefault("idToken", "")
		ExecuteHttp("DELETE", CurrentWebUrl, "")
	End If
	enableVSTNG
End Sub

Private Sub pruefeInhalt
	btnVerstgSpeichern.Enabled = False
	btnVerstgSpeichern.TextColor = 0xFF888888
	btnAuswahl.Enabled = False
	btnAuswahl.TextColor = 0xFF888888
	
	If tbxVeranstaltung.Text.Trim <> "" Then
		If IsNumber(tbxAnzahl.Text) Then
			Dim anz As Int = tbxAnzahl.Text
			If anz > 0 Then
				btnVerstgSpeichern.Enabled = True
				btnVerstgSpeichern.TextColor = colorgreen
			End If
		End If
	End If
End Sub

' ==============================================================================
' 4. TEILNEHMER LADEN, ANZEIGEN, BEARBEITEN, LÖSCHEN
' ==============================================================================
Private Sub holeTLN
	DBdatenTyp = "Teilnehmer"
	CurrentWebUrl = URLteilnehmer & ".json?auth=" & Status.GetDefault("idToken", "")
	ExecuteHttp("GET", CurrentWebUrl, "")
End Sub

Private Sub ladeTeilnehmer(response As String)
	Teilnehmer.Initialize
	If response <> "" And response <> "null" Then
		Dim jp As JSONParser
		jp.Initialize(response)
		Dim teilnehmerliste As Map = jp.NextObject
		
		For Each key As String In teilnehmerliste.Keys
			Dim newID As Int = key.Replace("t", "") + 1
			Dim curMax As Int = TLNnewID.Replace("t", "")
			If newID > curMax Then
				TLNnewID = "t" & newID
			End If
			Dim tMap As Map = teilnehmerliste.Get(key)
			Teilnehmer.AddAll(Array As Object(tMap.GetDefault("Name", "unbenannt"), key))
		Next
		Teilnehmer.Add(TLNid)
	End If
	ZeigeTeilnehmerCLV
End Sub

Private Sub setzeTeilnehmer(tid As String)
	disableTLN
	If tid = "t0" Then
		dochange = False
		tbxTeilnehmer.Text = ""
		dochange = True
		enableTLN
		btnTLNDelete.TextColor = 0xFF888888
		btnTLNDelete.Enabled = False
	Else
		If Teilnehmer.Size > 0 Then
			Dim idx As Int = Teilnehmer.IndexOf(tid)
			If idx > 0 Then
				dochange = False
				tbxTeilnehmer.Text = Teilnehmer.Get(idx - 1)
				dochange = True
				enableTLN
			End If
		End If
	End If
	If tbxTeilnehmer.Enabled Then
		tbxTeilnehmer.RequestFocus
	End If
End Sub

Private Sub saveTLN
	disableTLN
	Dim DBkey As String = TLNid
	If TLNid = "t0" Then
		DBkey = TLNnewID
	End If
	
	Dim tName As String = tbxTeilnehmer.Text.Trim
	If Teilnehmer.IndexOf(tName) >= 0 Then
		MsgboxAsync("Der Teilnehmer " & tName & " ist bereits in der Teilnehmerliste vorhanden und kann nicht erneut angelegt werden. Zum Ändern bitte Teilnehmer auswählen und die Änderung speichern.", "Speichern nicht möglich!")
	Else
		Dim addTLNMap As Map = CreateMap("Name": tName)
		CurrentWebUrl = URLteilnehmer & "/" & DBkey & ".json?auth=" & Status.GetDefault("idToken", "")
		DBdatenTyp = "addTLN"
		
		Dim jg As JSONGenerator
		jg.Initialize(addTLNMap)
		ExecuteHttp("PUT", CurrentWebUrl, jg.ToString)
	End If
	enableTLN
End Sub

Private Sub delTLN(tid As String)
	disableTLN
	ToastMessageShow("Der Teilnehmer wird gelöscht!", False)
	DBdatenTyp = "delTeilnehmer"
	CurrentWebUrl = URLteilnehmer & "/" & tid & ".json?auth=" & Status.GetDefault("idToken", "")
	ExecuteHttp("DELETE", CurrentWebUrl, "")
	enableTLN
End Sub

' ==============================================================================
' 5. WEBVIEW-EVENTS (PageLoaded & WebViewStringChange)
' ==============================================================================
' entfallen

' ==============================================================================
' 6. HTTP-CLIENT & ANTWORT-VERARBEITUNG (WebDB.GotText)
' ==============================================================================
Private Sub ExecuteHttp(method As String, url As String, payload As String)
	Dim typ As String = DBdatenTyp
	Dim j As HttpJob
	j.Initialize(typ, Me)
	
	Select method
		Case "GET"
			j.Download(url)
		Case "PUT"
			j.PutString(url, payload)
			j.GetRequest.SetContentType("application/json")
		Case "DELETE"
			j.Delete(url)
	End Select
	
	Wait For (j) JobDone(j As HttpJob)
	
	If j.Success Then
		HandleGotText(typ, url, j.GetString)
	Else
		If j.ErrorMessage.ToLowerCase.Contains("unable to resolve") Or j.ErrorMessage.ToLowerCase.Contains("connect") Or j.ErrorMessage.ToLowerCase.Contains("timeout") Then
			setzeOffline
		Else
			ToastMessageShow("Fehler: " & j.ErrorMessage, True)
		End If
	End If
	j.Release
	startTimer
End Sub

Private Sub HandleGotText(typ As String, reqUrl As String, responseContent As String)
	Dim jp As JSONParser
	
	Select typ
		Case "Teilnehmer"
			DBdatenTyp = ""
			ladeTeilnehmer(responseContent)
			
		Case "Veranstaltungen"
			If responseContent = "null" Or responseContent = "" Then
				Veranstaltungen.Initialize
			Else
				jp.Initialize(responseContent)
				Veranstaltungen = jp.NextObject
			End If
			pruefeDBVerein
			ZeigeVeranstaltungenCLV
			DBdatenTyp = ""
			holeTLN
			
		Case "addVSTNG"
			DBdatenTyp = ""
			holeVeranstaltungen
			
		Case "addTLN"
			DBdatenTyp = ""
			holeTLN
			
		Case "delTeilnehmer"
			DBdatenTyp = ""
			TLNid = "t0"
			holeTLN
			
		Case "delVeranstaltung"
			DBdatenTyp = ""
			If webviewVSTGN_ID = DBGet("VeranstaltungID", "v0") Then
				Veranstaltung_ID = "v0"
				webviewVSTGN_ID = "v0"
				DBPut("VeranstaltungID", "v0")
			End If
			holeVeranstaltungen
			
		Case "delErgebnis"
			DBdatenTyp = ""
			delVeranstaltung(webviewVSTGN_ID)
			
		Case Else
			MsgboxAsync("(" & DBdatenTyp & ")" & reqUrl, "Da stimmt etwas nicht!")
	End Select
End Sub

Private Sub setzeOffline
	Status.Put("ProgOffline", True)
	Msgbox2Async("Die Datenbank ist nicht mehr erreichbar. Das Programm arbeitet nun offline. Es ist jetzt nur die zuletzt verwendete Wertungsliste verfügbar. Änderungen in den Einstellungen können nicht übernommen werden.", "Internet-Verbindung nicht möglich!", "Einstellungen schließen.", "", "", Null, False)
	Wait For Msgbox_Result (res As Int)
	If res = DialogResponse.POSITIVE Then
		CloseSettings
	End If
End Sub

' ==============================================================================
' 7. UI-EVENTS (Buttons, DatePicker-Dialog, Textfelder)
' ==============================================================================
Private Sub btnBack_Click
	CloseSettings
End Sub

Private Sub dprDatum_Click
	Dim ctxt As JavaObject
	ctxt.InitializeContext
	
	Dim listener As Object = ctxt.CreateEventFromUI("android.app.DatePickerDialog$OnDateSetListener", "DateSet", Null)
	Dim dlg As JavaObject
	dlg.InitializeNewInstance("android.app.DatePickerDialog", Array(ctxt, listener, dprYear, dprMonth - 1, dprDay))
	dlg.RunMethod("show", Null)
	
	Wait For DateSet_Event (MethodName As String, Args() As Object)
	If Args.Length >= 4 Then
		dprYear = Args(1)
		Dim mZeroBased As Int = Args(2)
		dprMonth = mZeroBased + 1
		dprDay = Args(3)
		
		Dim ticks As Long = DateUtils_SetDate(dprYear, dprMonth, dprDay)
		dprDatum.Text = FormatDateCustom(ticks, "dd.MM.yyyy")
		
		btnAuswahl.Enabled = False
		btnAuswahl.TextColor = 0xFF888888
		
		If dprDatum.Text <> DBGet("VeranstaltungDatum", "") Then
			Dim neu As Boolean = True
			If Veranstaltungen.IsInitialized Then
				For Each key As String In Veranstaltungen.Keys
					Dim veranstaltung As Map = Veranstaltungen.Get(key)
					Dim datum As String = veranstaltung.GetDefault("Datum", "-")
					If dprDatum.Text = datum Then
						neu = False
						disableVSTNG
						webviewVSTGN_ID = key
						''Dim numStr As String = key.Replace("v", "")
						''RunJS(webVeranstaltungen, "markiereVeranstaltung(" & numStr & ");")
						enableVSTNG
						Exit
					End If
				Next
			End If
			
			If neu Then
				Veranstaltung_ID = VSTGNnewID
				webviewVSTGN_ID = VSTGNnewID
				disableVSTNG
				
				'Log("BuildUI: setze tbxVeranstaltung")
				'tbxVeranstaltung.Text = "unbenannt"
				
				tbxAnzahl.Text = "0"
				enableVSTNG
				Dim anzVal As Int = tbxAnzahl.Text
				If anzVal > 0 Then
					btnVerstgSpeichern.Enabled = True
					btnVerstgSpeichern.TextColor = colorgreen
				End If
				btnVerstgDelete.Enabled = False
				btnVerstgDelete.TextColor = 0xFF888888
				btnAuswahl.Enabled = False
				btnAuswahl.TextColor = 0xFF888888
			End If
		End If
	End If
	startTimer
End Sub

Private Sub DateUtils_SetDate(Year As Int, Month As Int, Day As Int) As Long
	Dim oldFormat As String = DateTime.DateFormat
	DateTime.DateFormat = "yyyy-MM-dd"
	Dim paddedMonth As String = NumberFormat(Month, 2, 0)
	Dim paddedDay As String = NumberFormat(Day, 2, 0)
	Dim ticks As Long = DateTime.DateParse(Year & "-" & paddedMonth & "-" & paddedDay)
	DateTime.DateFormat = oldFormat
	Return ticks
End Sub

Private Sub btnAuswahl_Click
	Uhrzeit.Enabled = False
	Veranstaltung_ID = webviewVSTGN_ID
	saveDBvstng
	CloseSettings
End Sub

Private Sub btnVerstgDelete_Click
	startTimer
	Msgbox2Async("Die Veranstaltung und deren Wertungsliste werden unwiederbringlich gelöscht! Wirklich löschen?", "Veranstaltung wirklich löschen?", "Löschen", "", "Abbrechen", Null, True)
	Wait For Msgbox_Result (res As Int)
	If res = DialogResponse.POSITIVE Then
		delWertungsliste(webviewVSTGN_ID)
		startTimer
	End If
End Sub

Private Sub btnVerstgSpeichern_Click
	startTimer
	Dim neuAnz As Int = 0
	If IsNumber(tbxAnzahl.Text) Then neuAnz = tbxAnzahl.Text
	
	Dim altAnz As Int = 0
	If Veranstaltungen.IsInitialized And Veranstaltungen.ContainsKey(Veranstaltung_ID) Then
		Dim vMap As Map = Veranstaltungen.Get(Veranstaltung_ID)
		altAnz = vMap.GetDefault("Teilnehmerzahl", "0")
	End If
	
	If neuAnz < altAnz Then
		Msgbox2Async("Die Anzahl der Plätze wurde reduziert. Werden die geänderten Daten der Veranstaltung gespeichert, gehen ggf. Informationen in der Wertungsliste der Veranstaltung unwiederbringlich verloren.", "Veranstaltung - Plätze", "Trotzdem speichern.", "", "Abbrechen", Null, True)
		Wait For Msgbox_Result (res As Int)
		If res = DialogResponse.POSITIVE Then
			saveVSTNG
			startTimer
		End If
	Else
		saveVSTNG
	End If
End Sub

Private Sub btnTLNDelete_Click
	startTimer
	Msgbox2Async(tbxTeilnehmer.Text & " aus der Liste der Teilnehmer löschen?", "Teilnehmer wirklich löschen?", "Löschen", "", "Abbrechen", Null, True)
	Wait For Msgbox_Result (res As Int)
	If res = DialogResponse.POSITIVE Then
		delTLN(TLNid)
		startTimer
	End If
End Sub

Private Sub btnTLNSpeichern_Click
	saveTLN
	startTimer
End Sub

' --- Textbox Events ---
Private Sub tbxVeranstaltung_FocusChanged (HasFocus As Boolean)
	If HasFocus Then
		tbxVeranstaltung.SelectionStart = tbxVeranstaltung.Text.Length
	Else
		HideKeyboard
	End If
End Sub

#RaisesSynchronousEvents: tbxVeranstaltung
Private Sub tbxVeranstaltung_TextChanged (Old As String, New As String)
	Log("tbxVeranstaltung_TextChanged")
	Log("dochange = " & dochange)
	If dochange = False Then Return
		
	dochange = False
	If tbxVeranstaltung.Enabled Then
		pruefeInhalt
	End If
	dochange = True
	startTimer
End Sub

Private Sub tbxAnzahl_FocusChanged (HasFocus As Boolean)
	If HasFocus Then
		tbxAnzahl.SelectionStart = tbxAnzahl.Text.Length
	Else
		HideKeyboard
	End If
End Sub

#RaisesSynchronousEvents: tbxAnzahl
Private Sub tbxAnzahl_TextChanged (Old As String, New As String)
	Log("tbxAnzahl_TextChanged")
	Log("dochange = " & dochange)
	If dochange = False Then Return
	
	dochange = False
	If tbxAnzahl.Enabled Then
		If IsNumber(tbxAnzahl.Text) Then
			Dim val As Int = Abs(tbxAnzahl.Text)
			tbxAnzahl.Text = val
		End If
		pruefeInhalt
		tbxAnzahl.SelectionStart = tbxAnzahl.Text.Length
	End If
	dochange = True
	startTimer
End Sub

Private Sub tbxTeilnehmer_FocusChanged (HasFocus As Boolean)
	If HasFocus Then
		tbxTeilnehmer.SelectionStart = tbxTeilnehmer.Text.Length
	Else
		HideKeyboard
	End If
End Sub

#RaisesSynchronousEvents: tbxTeilnehmer
Private Sub tbxTeilnehmer_TextChanged (Old As String, New As String)
	Log("tbxTeilnehmer_TextChanged")
	Log("dochange = " & dochange)
	If dochange = False Then Return
	
	dochange = False
	Dim cleaned As String = Regex.Replace("[^a-zA-Z0-9äöüÄÖÜßéèêëáàâçñ -]", tbxTeilnehmer.Text, "")
	
	Dim sb As StringBuilder
	sb.Initialize
	Dim doupper As Boolean = True
	For i = 0 To cleaned.Length - 1
		Dim letter As String = cleaned.SubString2(i, i + 1)
		If letter = " " Or letter = "-" Then
			doupper = True
			sb.Append(letter)
		Else if letter = "," Then
			' Komma entfernen
		Else if doupper Then
			sb.Append(letter.ToUpperCase)
			doupper = False
		Else
			sb.Append(letter)
		End If
	Next
	tbxTeilnehmer.Text = sb.ToString
	
	btnTLNDelete.TextColor = 0xFF888888
	btnTLNDelete.Enabled = False
	
	If tbxTeilnehmer.Text.Length >= 3 Then
		btnTLNSpeichern.TextColor = colorgreen
		btnTLNSpeichern.Enabled = True
	Else
		btnTLNSpeichern.TextColor = 0xFF888888
		btnTLNSpeichern.Enabled = False
	End If
	
	dochange = True
	tbxTeilnehmer.SelectionStart = tbxTeilnehmer.Text.Length
	startTimer
End Sub

' ==============================================================================
' 8. TIMER & TINYDB-ERSATZ
' ==============================================================================
Private Sub startTimer
	Uhrzeit.Enabled = False
	Uhrzeit.Interval = 1000 * 300
	Uhrzeit.Enabled = True
End Sub

Private Sub Uhrzeit_Tick
	Uhrzeit.Enabled = False
	B4XPages.ShowPage("ScreenSaver")
End Sub

Private Sub FormatDateCustom(ticks As Long, pattern As String) As String
	Dim oldFormat As String = DateTime.DateFormat
	DateTime.DateFormat = pattern
	Dim res As String = DateTime.Date(ticks)
	DateTime.DateFormat = oldFormat
	Return res
End Sub

Private Sub HideKeyboard
	Dim p As Phone
	p.HideKeyboard(B4XPages.GetNativeParent(Me))
End Sub

Private Sub LoadTinyDB
	If File.Exists(File.DirInternal, DBFileName) Then
		DBVerein = File.ReadMap(File.DirInternal, DBFileName)
	Else
		DBVerein.Initialize
	End If
End Sub

Private Sub DBPut(Key As String, Value As Object)
	If Value Is Map Then
		Dim jg As JSONGenerator
		jg.Initialize(Value)
		DBVerein.Put(Key, "JSON_MAP:" & jg.ToString)
	Else If Value Is List Then
		Dim jg As JSONGenerator
		jg.Initialize2(Value)
		DBVerein.Put(Key, "JSON_LIST:" & jg.ToString)
	Else
		DBVerein.Put(Key, Value)
	End If
	File.WriteMap(File.DirInternal, DBFileName, DBVerein)
End Sub

Private Sub DBGet(Key As String, DefaultValue As Object) As Object
	If DBVerein.ContainsKey(Key) = False Then Return DefaultValue
	Dim val As String = DBVerein.Get(Key)
	If val.StartsWith("JSON_MAP:") Then
		Dim jp As JSONParser
		jp.Initialize(val.SubString(9))
		Return jp.NextObject
	Else If val.StartsWith("JSON_LIST:") Then
		Dim jp As JSONParser
		jp.Initialize(val.SubString(10))
		Return jp.NextArray
	End If
	Return val
End Sub

Private Sub ZeigeVeranstaltungenCLV

	lstVeranstaltungen.Clear

	For Each KEY As String In Veranstaltungen.Keys

		Dim V As Map = Veranstaltungen.Get(KEY)

		Dim DATUM As String = V.GetDefault("Datum", "")
		Dim NAME As String = V.GetDefault("Name", "")

		lstVeranstaltungen.AddSingleLine2( _
            DATUM & "   " & NAME, _
            KEY)

	Next

End Sub

Private Sub CLVVeranstaltungen_ItemClick(Index As Int, Value As Object)

	webviewVSTGN_ID = Value
	setzeVeranstaltung(webviewVSTGN_ID)

End Sub

Private Sub ZeigeTeilnehmerCLV
	
	lstTeilnehmer.Clear

	For I = 0 To Teilnehmer.Size - 1 Step 2
		If I + 1 < Teilnehmer.Size Then
			lstTeilnehmer.AddSingleLine2(Teilnehmer.Get(I), Teilnehmer.Get(I + 1))
		End If
	Next

End Sub

Private Sub CLVTeilnehmer_ItemClick(Index As Int, Value As Object)

	TLNid = Value
	setzeTeilnehmer(TLNid)

End Sub

Private Sub lstVeranstaltungen_ItemClick (Position As Int, Value As Object)

	webviewVSTGN_ID = Value

	setzeVeranstaltung(webviewVSTGN_ID)

End Sub