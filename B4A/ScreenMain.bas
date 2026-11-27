B4A=true
Group=WertungslistenAppV2
ModulesStructureVersion=1
Type=Class
Version=12.8
@EndOfDesignText@
' B4XPage: ScreenMain (konvertiert aus ScreenMain.scm & ScreenMain.bky)
' Benötigte Bibliotheken: B4XPages, XUI, OkHttpUtils2, JSON, Phone, JavaObject, WebViewExtras (optional, falls nicht vorhanden läuft die eingebaute JS-Bridge!)

Sub Class_Globals
	Private Root As B4XView
	Private xui As XUI
	
	' --- Globale Variablen (aus ScreenMain.bky) ---
	Public DBdatenTyp As String = ""
	Public URLtest As String = "https://console.firebase.google.com"
	Public Teilnehmer As List
	Public URLveranstaltungen As String = "https://wertungslisten-app-default-rtdb.europe-west1.firebasedatabase.app/Vereine/[...]/Veranstaltungen/"
	Public TLNlastID As String = "t0"
	Public URLteilnehmer As String = "https://wertungslisten-app-default-rtdb.europe-west1.firebasedatabase.app/Vereine/[...]/Teilnehmer"
	Public webviewData As List
	Public URLErgebnisse As String = "https://wertungslisten-app-default-rtdb.europe-west1.firebasedatabase.app/Vereine/[...]/Ergebnisse/"
	Public PlatzSelected As Int = 1
	Public URLfdj As String = "https://wertungslisten-app-default-rtdb.europe-west1.firebasedatabase.app/Vereine/[...]/Ergebnisse/fdj[xxxx]"
	Public SelectNewRow As Int = 0
	Public URLlastChange As String = "https://wertungslisten-app-default-rtdb.europe-west1.firebasedatabase.app/Vereine/[...]/LastChange"
	Public dochange As Boolean = True
	Public addTLN As Boolean = False
	Public VSTNGgeschlossen As Boolean = False
	Public Status As Map
	Public colorgreen As Int = 0xFF16AA16
	
	' --- UI-Komponenten (aus ScreenMain.scm) ---
	Private lblVerein As Label
	Private lblVeranstaltung As Label
	Private lblDatum As Label
	Private btnSettings As Button
	
	Private vaEingabe As Panel
	Private btnCloseVstng As Button
	Private btnUp As Button
	Private btnMinus As Button
	Private spnPlatz As Spinner
	Private btnPlus As Button
	Private tbxTeilnehmer As EditText
	Private lsvName As ListView
	
	Private vaErgEingabe As Panel
	Private btnFDJeingabe As Button
	Private tbxGramm As EditText
	Private btnSpeichern As Button
	
	Private vaFDJ As Panel
	Private btnFDJback As Button
	Private tbxFDJgewicht As EditText
	Private btnFDJsave As Button
	
	Private haDown As Panel
	Private btnShare As Button
	Private btnDown As Button
	
	Private webErgebnis As WebView
	
	' --- Nicht-sichtbare Komponenten & Hilfsvariablen ---
	Private Uhrzeit As Timer
	Private DBVerein As Map
	Private DBFileName As String = "DBVerein.dat"
	Private CurrentWebUrl As String = ""
	Private CurrentWebViewString As String = ""
	Private spnItems As List
End Sub

Public Sub Initialize
	Teilnehmer.Initialize
	webviewData.Initialize
	Status.Initialize
	spnItems.Initialize
	LoadTinyDB
	Uhrzeit.Initialize("Uhrzeit", 300000) ' 1000 * 300 ms
End Sub

Private Sub B4XPage_Created (Root1 As B4XView)
	Root = Root1
	B4XPages.SetTitle(Me, "Wertungslisten-App by sthnet.de")
	BuildUI
	B4XPage_Appear
End Sub

Public Sub B4XPage_Appear
	' Status aus B4XMainPage übernehmen (ersetzt getStartValue)
	If B4XPages.MainPage.Status.IsInitialized And B4XPages.MainPage.Status.Size > 0 Then
		Status = B4XPages.MainPage.Status
	End If
	
	colorgreen = lblVerein.TextColor
	
	If Status.GetDefault("idToken", "") = "" Then
		B4XPages.ClosePage(Me)
		Return
	End If
	
	If False = Status.GetDefault("debug", False) Then
		initialisiere
	End If
	startTimer
End Sub

Private Sub B4XPage_CloseRequest As ResumableSub
	Uhrzeit.Enabled = False
	Return True
End Sub

' ==============================================================================
' 1. UI-AUFBAU (1:1 aus ScreenMain.scm)
' ==============================================================================
Private Sub BuildUI
	Root.Color = Colors.White
	
	' --- Header (VerticalArrangement19) ---
	Dim pnlHeader As Panel
	pnlHeader.Initialize("")
	pnlHeader.Color = Colors.White
	Root.AddView(pnlHeader, 0, 0, 100%x, 80dip)
	
	Dim lblW1 As Int = 115dip
	Dim lblW2 As Int = 100%x - lblW1 - 48dip
	
	Dim Label11 As Label
	Label11.Initialize("")
	Label11.Text = "Verein: "
	Label11.Typeface = Typeface.DEFAULT_BOLD
	Label11.TextColor = Colors.Black
	Label11.Gravity = Gravity.RIGHT + Gravity.CENTER_VERTICAL
	pnlHeader.AddView(Label11, 5dip, 4dip, lblW1, 24dip)
	
	lblVerein.Initialize("")
	lblVerein.Text = "-Vereinsbezeichnung-"
	lblVerein.Typeface = Typeface.DEFAULT_BOLD
	lblVerein.TextColor = 0xFF16AA16
	lblVerein.Gravity = Gravity.LEFT + Gravity.CENTER_VERTICAL
	pnlHeader.AddView(lblVerein, lblW1 + 8dip, 4dip, lblW2, 24dip)
	
	Dim Label12 As Label
	Label12.Initialize("")
	Label12.Text = "Veranstaltung:"
	Label12.Typeface = Typeface.DEFAULT_BOLD
	Label12.TextColor = Colors.Black
	Label12.Gravity = Gravity.RIGHT + Gravity.CENTER_VERTICAL
	pnlHeader.AddView(Label12, 5dip, 28dip, lblW1, 24dip)
	
	lblVeranstaltung.Initialize("")
	lblVeranstaltung.Text = "-Veranstaltung-"
	lblVeranstaltung.Typeface = Typeface.DEFAULT_BOLD
	lblVeranstaltung.TextColor = 0xFF16AA16
	lblVeranstaltung.Gravity = Gravity.LEFT + Gravity.CENTER_VERTICAL
	pnlHeader.AddView(lblVeranstaltung, lblW1 + 8dip, 28dip, lblW2, 24dip)
	
	Dim Label13 As Label
	Label13.Initialize("")
	Label13.Text = "Datum:"
	Label13.Typeface = Typeface.DEFAULT_BOLD
	Label13.TextColor = Colors.Black
	Label13.Gravity = Gravity.RIGHT + Gravity.CENTER_VERTICAL
	pnlHeader.AddView(Label13, 5dip, 52dip, lblW1, 24dip)
	
	lblDatum.Initialize("")
	lblDatum.Text = "-Datum-"
	lblDatum.Typeface = Typeface.DEFAULT_BOLD
	lblDatum.TextColor = 0xFF16AA16
	lblDatum.Gravity = Gravity.LEFT + Gravity.CENTER_VERTICAL
	pnlHeader.AddView(lblDatum, lblW1 + 8dip, 52dip, lblW2, 24dip)
	
	btnSettings.Initialize("btnSettings")
	SetButtonImageSafe(btnSettings, "3Punkte.png", "⋮")
	pnlHeader.AddView(btnSettings, 100%x - 40dip, 22dip, 34dip, 34dip)
	
	' --- Eingabebereich (vaEingabe) ---
	vaEingabe.Initialize("")
	vaEingabe.Color = 0xFFEEFFEE
	Root.AddView(vaEingabe, 0, 80dip, 100%x, 340dip)
	
	btnCloseVstng.Initialize("btnCloseVstng")
	SetButtonImageSafe(btnCloseVstng, "close.png", "🔒")
	vaEingabe.AddView(btnCloseVstng, 8dip, 8dip, 32dip, 32dip)
	
	Dim Label4 As Label
	Label4.Initialize("")
	Label4.Text = "Angelplatz"
	Label4.TextSize = 16
	Label4.Typeface = Typeface.DEFAULT_BOLD
	Label4.TextColor = Colors.Black
	Label4.Gravity = Gravity.CENTER
	vaEingabe.AddView(Label4, 45dip, 8dip, 100%x - 90dip, 32dip)
	
	btnUp.Initialize("btnUp")
	SetButtonImageSafe(btnUp, "up.png", "▲")
	vaEingabe.AddView(btnUp, 100%x - 40dip, 8dip, 32dip, 32dip)
	
	' Platz-Auswahl (- / Spinner / +)
	Dim centerBlockW As Int = 270dip
	Dim startX As Int = (100%x - centerBlockW) / 2
	
	btnMinus.Initialize("btnMinus")
	btnMinus.Text = "-"
	btnMinus.TextSize = 26
	btnMinus.Typeface = Typeface.DEFAULT_BOLD
	btnMinus.TextColor = 0xFF16AA16
	vaEingabe.AddView(btnMinus, startX, 45dip, 60dip, 55dip)
	
	spnPlatz.Initialize("spnPlatz")
	spnPlatz.TextSize = 28
	spnPlatz.TextColor = 0xFF16AA16
	spnPlatz.DropdownBackgroundColor = Colors.White
	spnPlatz.DropdownTextColor = 0xFF16AA16
	vaEingabe.AddView(spnPlatz, startX + 60dip, 45dip, 150dip, 55dip)
	
	btnPlus.Initialize("btnPlus")
	btnPlus.Text = "+"
	btnPlus.TextSize = 26
	btnPlus.Typeface = Typeface.DEFAULT_BOLD
	btnPlus.TextColor = 0xFF16AA16
	vaEingabe.AddView(btnPlus, startX + 210dip, 45dip, 60dip, 55dip)
	
	' Teilnehmer-Eingabe
	Dim Label6 As Label
	Label6.Initialize("")
	Label6.Text = "Teilnehmer"
	Label6.TextSize = 16
	Label6.Typeface = Typeface.DEFAULT_BOLD
	Label6.TextColor = Colors.Black
	Label6.Gravity = Gravity.CENTER
	vaEingabe.AddView(Label6, 0, 110dip, 100%x, 24dip)
	
	tbxTeilnehmer.Initialize("tbxTeilnehmer")
	'tbxTeilnehmer.Text = "---"
	tbxTeilnehmer.TextSize = 20
	tbxTeilnehmer.Typeface = Typeface.DEFAULT_BOLD
	tbxTeilnehmer.TextColor = 0xFF16AA16
	tbxTeilnehmer.SingleLine = True
	vaEingabe.AddView(tbxTeilnehmer, 10%x, 136dip, 80%x, 46dip)
	
	' --- Ergebnis-Eingabe Sub-Panel (vaErgEingabe) ---
	vaErgEingabe.Initialize("")
	vaErgEingabe.Color = 0xFFEEFFEE
	vaEingabe.AddView(vaErgEingabe, 0, 186dip, 100%x, 154dip)
	
	btnFDJeingabe.Initialize("btnFDJeingabe")
	btnFDJeingabe.Text = "Fisch des Jahres"
	btnFDJeingabe.TextSize = 11
	btnFDJeingabe.Typeface = Typeface.DEFAULT_BOLD
	btnFDJeingabe.TextColor = 0xFF16AA16
	vaErgEingabe.AddView(btnFDJeingabe, 100%x - 145dip, 4dip, 130dip, 34dip)
	
	Dim Label7 As Label
	Label7.Initialize("")
	Label7.Text = "Fang:  "
	Label7.TextSize = 16
	Label7.Typeface = Typeface.DEFAULT_BOLD
	Label7.TextColor = Colors.Black
	Label7.Gravity = Gravity.RIGHT + Gravity.CENTER_VERTICAL
	vaErgEingabe.AddView(Label7, 10dip, 44dip, (100%x - 150dip) / 2 - 10dip, 52dip)
	
	tbxGramm.Initialize("tbxGramm")
	tbxGramm.TextSize = 30
	tbxGramm.Typeface = Typeface.DEFAULT_BOLD
	tbxGramm.TextColor = 0xFF16AA16
	tbxGramm.Gravity = Gravity.CENTER
	tbxGramm.InputType = tbxGramm.INPUT_TYPE_NUMBERS
	tbxGramm.SingleLine = True
	vaErgEingabe.AddView(tbxGramm, (100%x - 150dip) / 2, 44dip, 150dip, 52dip)
	
	Dim Label2 As Label
	Label2.Initialize("")
	Label2.Text = " Gramm"
	Label2.TextSize = 16
	Label2.Typeface = Typeface.DEFAULT_BOLD
	Label2.TextColor = Colors.Black
	Label2.Gravity = Gravity.LEFT + Gravity.CENTER_VERTICAL
	vaErgEingabe.AddView(Label2, (100%x + 150dip) / 2, 44dip, (100%x - 150dip) / 2 - 10dip, 52dip)
	
	btnSpeichern.Initialize("btnSpeichern")
	btnSpeichern.Text = "speichern"
	btnSpeichern.TextSize = 16
	btnSpeichern.Typeface = Typeface.DEFAULT_BOLD
	btnSpeichern.TextColor = 0xFF16AA16
	vaErgEingabe.AddView(btnSpeichern, (100%x - 150dip) / 2, 104dip, 150dip, 44dip)
	
	' --- Fisch des Jahres Sub-Panel (vaFDJ) ---
	vaFDJ.Initialize("")
	vaFDJ.Color = 0xFFEEFFEE
	vaFDJ.Visible = False
	vaEingabe.AddView(vaFDJ, 0, 186dip, 100%x, 154dip)
	
	Dim Label18 As Label
	Label18.Initialize("")
	Label18.Text = "Fisch des Jahres"
	Label18.TextSize = 16
	Label18.Typeface = Typeface.DEFAULT_BOLD
	Label18.TextColor = Colors.Black
	Label18.Gravity = Gravity.CENTER
	vaFDJ.AddView(Label18, 40dip, 4dip, 100%x - 80dip, 30dip)
	
	btnFDJback.Initialize("btnFDJback")
	SetButtonImageSafe(btnFDJback, "Left.48.png", "◀")
	vaFDJ.AddView(btnFDJback, 100%x - 38dip, 4dip, 30dip, 30dip)
	
	Dim Label16 As Label
	Label16.Initialize("")
	Label16.Text = "  Fang:  "
	Label16.TextSize = 16
	Label16.Typeface = Typeface.DEFAULT_BOLD
	Label16.TextColor = Colors.Black
	Label16.Gravity = Gravity.RIGHT + Gravity.CENTER_VERTICAL
	vaFDJ.AddView(Label16, 10dip, 44dip, (100%x - 150dip) / 2 - 10dip, 52dip)
	
	tbxFDJgewicht.Initialize("tbxFDJgewicht")
	tbxFDJgewicht.TextSize = 30
	tbxFDJgewicht.Typeface = Typeface.DEFAULT_BOLD
	tbxFDJgewicht.TextColor = 0xFF16AA16
	tbxFDJgewicht.Gravity = Gravity.CENTER
	tbxFDJgewicht.InputType = tbxFDJgewicht.INPUT_TYPE_NUMBERS
	tbxFDJgewicht.SingleLine = True
	vaFDJ.AddView(tbxFDJgewicht, (100%x - 150dip) / 2, 44dip, 150dip, 52dip)
	
	Dim Label17 As Label
	Label17.Initialize("")
	Label17.Text = " Gramm"
	Label17.TextSize = 16
	Label17.Typeface = Typeface.DEFAULT_BOLD
	Label17.TextColor = Colors.Black
	Label17.Gravity = Gravity.LEFT + Gravity.CENTER_VERTICAL
	vaFDJ.AddView(Label17, (100%x + 150dip) / 2, 44dip, (100%x - 150dip) / 2 - 10dip, 52dip)
	
	btnFDJsave.Initialize("btnFDJsave")
	btnFDJsave.Text = "speichern"
	btnFDJsave.TextSize = 16
	btnFDJsave.Typeface = Typeface.DEFAULT_BOLD
	btnFDJsave.TextColor = 0xFF16AA16
	vaFDJ.AddView(btnFDJsave, (100%x - 150dip) / 2, 104dip, 150dip, 44dip)
	
	' --- Minimierte Leiste (haDown) ---
	haDown.Initialize("")
	haDown.Color = 0xFFEEFFEE
	haDown.Visible = False
	Root.AddView(haDown, 0, 80dip, 100%x, 42dip)
	
	btnShare.Initialize("btnShare")
	SetButtonImageSafe(btnShare, "share.png", "📤")
	haDown.AddView(btnShare, 8dip, 7dip, 28dip, 28dip)
	
	Dim Label15 As Label
	Label15.Initialize("")
	Label15.Text = "Ergebnisliste"
	Label15.TextSize = 16
	Label15.Typeface = Typeface.DEFAULT_BOLD
	Label15.TextColor = Colors.Black
	Label15.Gravity = Gravity.CENTER
	haDown.AddView(Label15, 45dip, 5dip, 100%x - 90dip, 32dip)
	
	btnDown.Initialize("btnDown")
	SetButtonImageSafe(btnDown, "down.png", "▼")
	haDown.AddView(btnDown, 100%x - 40dip, 5dip, 32dip, 32dip)
	
	' --- WebView für Ergebnisliste (webErgebnis) ---
	webErgebnis.Initialize("webErgebnis")
	webErgebnis.JavaScriptEnabled = True
	SetupWebViewBridge
	Root.AddView(webErgebnis, 0, 425dip, 100%x, 100%y - 425dip)
	
	' --- Autocomplete-Liste (lsvName) schwebend über der Eingabe ---
	lsvName.Initialize("lsvName")
	lsvName.Color = 0xFFEFEFEF
	lsvName.SingleLineLayout.Label.TextColor = 0xFF3333FF
	lsvName.SingleLineLayout.Label.TextSize = 16
	lsvName.Visible = False
	Root.AddView(lsvName, 10%x, 262dip, 80%x, 150dip)
End Sub

Private Sub SetButtonImageSafe(btn As Button, fileName As String, fallbackText As String)
	If File.Exists(File.DirAssets, fileName) Then
		btn.SetBackgroundImage(LoadBitmap(File.DirAssets, fileName))
	Else
		btn.Text = fallbackText
	End If
End Sub

' Emuliert window.AppInventor.getWebViewString() & setWebViewString() im B4A WebView
Private Sub SetupWebViewBridge
	Dim jo As JavaObject = webErgebnis
	jo.RunMethod("addJavascriptInterface", Array As Object(Me, "AppInventor"))
End Sub

' Wird aus JavaScript über window.AppInventor.getWebViewString() aufgerufen
Public Sub getWebViewString As String
	Return CurrentWebViewString
End Sub

' Wird aus JavaScript über window.AppInventor.setWebViewString(val) aufgerufen
Public Sub setWebViewString(val As String)
	CallSubDelayed2(Me, "webErgebnis_WebViewStringChange", val)
End Sub

Private Sub initialisiere
	Teilnehmer.Initialize
	DBdatenTyp = ""
	TLNlastID = "t0"
	webviewData.Initialize
	PlatzSelected = 1
	dochange = True
	addTLN = False
	VSTNGgeschlossen = False
	
	disableEingabe
	setzeHeaderfromDB
	changeURL
	clear
	
	haDown.Visible = False
	vaEingabe.Visible = True
	vaErgEingabe.Visible = True
	vaFDJ.Visible = False
	UpdateLayoutPositions
	
	lsvName.Clear
	lsvName.Visible = False
	btnCloseVstng.Enabled = True
	SetButtonImageSafe(btnCloseVstng, "close.png", "🔒")
	
	spnPlatz.Clear
	spnItems.Clear
	Dim anzahl As Int = DBGet("VeranstaltungAnzahl", "25")
	For i = 1 To anzahl
		spnPlatz.Add(i)
		spnItems.Add(i)
	Next
	
	Dim offline As Boolean = Status.GetDefault("ProgOffline", True)
	Dim vID As String = DBGet("VeranstaltungID", "v0")
	If vID = "v0" Then
		lblVeranstaltung.Text = "- noch nicht ausgewählt -"
		lblDatum.Text = "- bitte auswählen -"
		If offline Then
			btnSettings.Visible = False
			Msgbox2Async("Es wurde noch keine Veranstaltung angelegt oder ausgewählt. Da keine Internet-Verbindung besteht, kann das Programm nicht weiter ausgeführt werden.", "Veranstaltung fehlt", "Beenden", "", "", Null, False)
			Wait For Msgbox_Result (res As Int)
			If res = DialogResponse.POSITIVE Then ExitApplication
		Else
			Msgbox2Async("Es wurde noch keine Veranstaltung angelegt oder ausgewählt. Bitte in den Einstellungen Veranstaltung auswählen.", "Veranstaltung fehlt", "anlegen/auswählen", "", "", Null, False)
			Wait For Msgbox_Result (res As Int)
			If res = DialogResponse.POSITIVE Then OpenSettingsPage
		End If
	Else
		holeTLN
	End If
End Sub

Private Sub UpdateLayoutPositions
	If vaEingabe.Visible Then
		webErgebnis.Top = 425dip
		webErgebnis.Height = 100%y - 425dip
	Else
		webErgebnis.Top = 126dip
		webErgebnis.Height = 100%y - 126dip
	End If
End Sub

Private Sub disableEingabe
	tbxTeilnehmer.Enabled = False
	btnFDJeingabe.Enabled = False
	btnFDJeingabe.TextColor = 0xFF888888
	btnMinus.Enabled = False
	btnMinus.TextColor = 0xFF888888
	btnPlus.Enabled = False
	btnPlus.TextColor = 0xFF888888
	tbxGramm.Enabled = False
	btnSpeichern.Enabled = False
	btnSpeichern.TextColor = 0xFF888888
	tbxFDJgewicht.Enabled = False
	btnFDJsave.Enabled = False
	btnFDJsave.TextColor = 0xFF888888
	btnCloseVstng.Enabled = False
	spnPlatz.Enabled = False
End Sub

Private Sub clear
	dochange = False
	lsvName.Clear
	lsvName.Visible = False
	tbxGramm.Text = "0"
	tbxTeilnehmer.Text = ""
	dochange = True
End Sub

Private Sub setzeHeaderfromDB
	lblVerein.Text = DBGet("Bezeichnung", "- nicht gesetzt -")
	lblVeranstaltung.Text = DBGet("VeranstaltungName", "- nicht gesetzt -")
	lblDatum.Text = DBGet("VeranstaltungDatum", "- nicht gesetzt -")
End Sub

Private Sub changeURL
	Dim vID As String = DBGet("VereinsID", "[...]")
	URLErgebnisse = URLErgebnisse.Replace("[...]", vID)
	URLveranstaltungen = URLveranstaltungen.Replace("[...]", vID)
	URLteilnehmer = URLteilnehmer.Replace("[...]", vID)
	URLlastChange = URLlastChange.Replace("[...]", vID)
	URLfdj = URLfdj.Replace("[...]", vID)
End Sub

Private Sub setzePlatz(pid As Int)
	dochange = False
	lsvName.Clear
	lsvName.Visible = False
	
	' B4A Listen sind 0-basiert (App Inventor: pid*4 + 2 -> B4A: pid*4 + 1)
	Dim baseIdx As Int = pid * 4
	If webviewData.Size > baseIdx + 2 Then
		Dim tName As String = webviewData.Get(baseIdx + 1)
		tbxTeilnehmer.Text = tName.Trim
		tbxGramm.Text = webviewData.Get(baseIdx + 2)
		
		Dim pStr As String = webviewData.Get(baseIdx)
		Dim spnIdx As Int = spnItems.IndexOf(pStr.Trim)
		If spnIdx >= 0 Then spnPlatz.SelectedIndex = spnIdx
	End If
	
	tbxTeilnehmer.Enabled = True
	tbxGramm.Enabled = True
	spnPlatz.Enabled = True
	
	If tbxTeilnehmer.Text.Trim <> "" Then
		btnFDJeingabe.Enabled = True
		btnFDJeingabe.TextColor = colorgreen
	End If
	If pid > 1 Then
		btnMinus.Enabled = True
		btnMinus.TextColor = colorgreen
	End If
	Dim maxAnzahl As Int = DBGet("VeranstaltungAnzahl", "25")
	If pid < maxAnzahl Then
		btnPlus.Enabled = True
		btnPlus.TextColor = colorgreen
	End If
	If False = Status.GetDefault("ProgOffline", True) Then
		btnCloseVstng.Enabled = True
	End If
	
	dochange = True
	tbxTeilnehmer.RequestFocus
End Sub

' ==============================================================================
' 3. WEBVIEW & WERTUNGSLISTEN-LOGIK
' ==============================================================================
Private Sub zeigeWertungsliste
	' Liste als CSV-String für window.AppInventor.getWebViewString() bereitstellen
	Dim sb As StringBuilder
	sb.Initialize
	For i = 0 To webviewData.Size - 1
		If i > 0 Then sb.Append(",")
		sb.Append(webviewData.Get(i))
	Next
	CurrentWebViewString = sb.ToString
	
	If File.Exists(File.DirAssets, "wlfb_tabelle.html") Then
		Dim html As String = File.ReadString(File.DirAssets, "wlfb_tabelle.html")
		webErgebnis.LoadHtml(html)
	Else
		ToastMessageShow("Datei wlfb_tabelle.html fehlt im Dateien-Tab!", True)
	End If
End Sub

Private Sub webErgebnis_PageFinished (Url As String)
	RunJS("init();")
	setzeFDJ
End Sub

Private Sub RunJS(jsCode As String)
	Dim jo As JavaObject = webErgebnis
	jo.RunMethod("evaluateJavascript", Array As Object(jsCode, Null))
End Sub

Private Sub setzeFDJ
	Dim gewicht As String = DBGet("FDJGewicht", "0")
	Dim tlnName As String = DBGet("FDJTeilnehmer", "- noch offen -")
	RunJS("setzeFDJ(" & QUOTE & gewicht & QUOTE & "," & QUOTE & tlnName & QUOTE & ");")
End Sub

Public Sub webErgebnis_WebViewStringChange(value As String)
	If value.StartsWith("rowclick") Then
		Dim rowStr As String = value.SubString(8).Trim
		If IsNumber(rowStr) Then
			Dim rowid As Int = rowStr
			If rowid > 0 Then
				PlatzSelected = rowid
				disableEingabe
				clear
				setzePlatz(rowid)
			End If
		End If
	Else if value.StartsWith("Print:") Then
		Dim shareText As String = value.Replace("Print: ", _
			lblVerein.Text & CRLF & lblVeranstaltung.Text & CRLF & "am: " & lblDatum.Text & CRLF)
		Dim in As Intent
		in.Initialize(in.ACTION_SEND, "")
		in.SetType("text/plain")
		in.PutExtra("android.intent.extra.TEXT", shareText)
		StartActivity(in)
	Else if value.StartsWith("Height") Then
		' Im B4XPages-Layout füllt webErgebnis automatisch den unteren Bereich aus
	Else
		Dim parts() As String = Regex.Split(",", value)
		Dim neueListe As List
		neueListe.Initialize
		For Each p As String In parts
			neueListe.Add(p)
		Next
		webviewData = neueListe
		
		If VSTNGgeschlossen Then
			vaEingabe.Visible = False
			haDown.Visible = True
			btnDown.Visible = False
			UpdateLayoutPositions
		Else
			RunJS("selectRowById(" & PlatzSelected & ");")
		End If
	End If
	startTimer
End Sub

Private Sub initWertungsliste(neueListe As Boolean)
	Dim plaetzeSoll As Int = DBGet("VeranstaltungAnzahl", "25")
	Dim plaetzeIst As Int = Floor(webviewData.Size / 4) - 1
	
	If neueListe Then
		webviewData.Initialize
		plaetzeIst = 0
		webviewData.AddAll(Array As Object("Platz", "Teilnehmer", "Gewicht", "Rang"))
	Else
		plaetzeSoll = plaetzeSoll - plaetzeIst
	End If
	
	If plaetzeSoll > 0 Then
		Dim startIdx As Int = plaetzeIst + 1
		For i = startIdx To plaetzeIst + plaetzeSoll
			webviewData.AddAll(Array As Object(i, "", 0, 0))
		Next
	Else if plaetzeSoll < 0 Then
		Dim diff As Int = Abs(plaetzeSoll)
		Dim removeStart As Int = (plaetzeIst - diff) * 4 + 4 ' 0-basiert!
		For i = 1 To diff * 4
			If webviewData.Size > removeStart Then webviewData.RemoveAt(removeStart)
		Next
	End If
	
	If Not(neueListe) And plaetzeSoll <> 0 Then
		saveWertungsliste("saveOnly")
	End If
End Sub

' ==============================================================================
' 4. DATEN LADEN & SPEICHERN (Firebase + Offline-Fallback)
' ==============================================================================
Private Sub holeWertungsliste
	DBdatenTyp = "Wertungsliste"
	If PlatzSelected <> SelectNewRow And SelectNewRow > 0 Then
		PlatzSelected = SelectNewRow
	End If
	
	Dim verDatum As String = DBGet("VeranstaltungDatum", FormatDateCustom(DateTime.Now, "dd.MM.yyyy"))
	Dim key() As String = Regex.Split("\.", verDatum)
	CurrentWebUrl = URLErgebnisse & "e" & key(2) & key(1) & key(0) & ".json?auth=" & Status.GetDefault("idToken", "")
	GetWeb
End Sub

Private Sub holeTLN
	DBdatenTyp = "Teilnehmer"
	CurrentWebUrl = URLteilnehmer & ".json?auth=" & Status.GetDefault("idToken", "")
	GetWeb
End Sub

Private Sub holeFDJ
	DBdatenTyp = "FDJ"
	Dim verDatum As String = DBGet("VeranstaltungDatum", "00.00.0000")
	Dim parts() As String = Regex.Split("\.", verDatum)
	CurrentWebUrl = URLfdj.Replace("[xxxx]", parts(2)) & ".json?auth=" & Status.GetDefault("idToken", "")
	GetWeb
End Sub

Private Sub speichern
	If Not(IsNumber(tbxGramm.Text)) Then
		tbxGramm.Text = "0"
	Else
		Dim val As Double = tbxGramm.Text
		tbxGramm.Text = NumberFormat2(val, 1, 0, 0, False)
	End If
	
	Dim position As Int = PlatzSelected * 4 ' 0-basiert!
	If webviewData.Size > position + 2 Then
		webviewData.Set(position + 2, tbxGramm.Text)
		webviewData.Set(position + 1, tbxTeilnehmer.Text.Trim)
	End If
	saveWertungsliste("saveWertungsliste")
End Sub

Private Sub saveWertungsliste(saveTyp As String)
	DBdatenTyp = saveTyp
	Dim verDatum As String = DBGet("VeranstaltungDatum", FormatDateCustom(DateTime.Now, "dd.MM.yyyy"))
	Dim key() As String = Regex.Split("\.", verDatum)
	CurrentWebUrl = URLErgebnisse & "e" & key(2) & key(1) & key(0) & ".json?auth=" & Status.GetDefault("idToken", "")
	
	Dim body As Map
	body.Initialize
	body.Put("Datum", lblDatum.Text)
	body.Put("Name", lblVeranstaltung.Text)
	body.Put("Status", "offen")
	
	For i = 4 To webviewData.Size - 1 Step 4
		Dim platzVal As Int = webviewData.Get(i)
		Dim padded As String = "0000" & platzVal
		Dim id As String = "p" & padded.SubString(padded.Length - 4)
		
		Dim eintrag As Map = CreateMap( _
			"Platz": platzVal, _
			"Teilnehmer": webviewData.Get(i + 1), _
			"Gewicht": webviewData.Get(i + 2), _
			"Rang": webviewData.Get(i + 3))
		body.Put(id, eintrag)
	Next
	
	DBPut("letzteÄnderung", CreateMap("Änderung": True, "Datum": Zeitstempel))
	DBPut("webviewData", webviewData)
	
	Dim jg As JSONGenerator
	jg.Initialize(body)
	PutTextWeb(jg.ToString)
End Sub

Private Sub saveFDJ
	DBdatenTyp = "FDJ"
	Dim verDatum As String = DBGet("VeranstaltungDatum", "00.00.0000")
	Dim parts() As String = Regex.Split("\.", verDatum)
	CurrentWebUrl = URLfdj.Replace("[xxxx]", parts(2)) & ".json?auth=" & Status.GetDefault("idToken", "")
	
	Dim body As Map = CreateMap( _
		"Gewicht": DBGet("FDJGewicht", "0"), _
		"Teilnehmer": DBGet("FDJTeilnehmer", "- noch offen -"))
	DBPut("letzteÄnderung", CreateMap("Änderung": True, "Datum": Zeitstempel))
	
	Dim jg As JSONGenerator
	jg.Initialize(body)
	PatchTextWeb(jg.ToString)
End Sub

Private Sub closeVstng(table As String)
	If table = "Ergebnisse" Then
		DBdatenTyp = "ErgClosed"
		Dim verDatum As String = DBGet("VeranstaltungDatum", FormatDateCustom(DateTime.Now, "dd.MM.yyyy"))
		Dim key() As String = Regex.Split("\.", verDatum)
		CurrentWebUrl = URLErgebnisse & "/e" & key(2) & key(1) & key(0) & ".json?auth=" & Status.GetDefault("idToken", "")
	Else
		DBdatenTyp = "VSTNGclosed"
		Dim keyStr As String = DBGet("VeranstaltungID", "v0")
		CurrentWebUrl = URLveranstaltungen & "/" & keyStr & ".json?auth=" & Status.GetDefault("idToken", "")
	End If
	
	Dim body As Map = CreateMap("Status": "geschlossen")
	Dim jg As JSONGenerator
	jg.Initialize(body)
	PatchTextWeb(jg.ToString)
End Sub

Private Sub addTeilnehmer
	Dim tName As String = tbxTeilnehmer.Text.Trim
	If tName <> "" And Teilnehmer.IndexOf(tName) = -1 Then
		addTLN = True
		Teilnehmer.Add(tName)
		Teilnehmer.Sort(True)
		DBPut("letzteÄnderung", CreateMap("Änderung": True, "Datum": DateTime.Now))
		DBPut("Teilnehmer", Teilnehmer)
		
		Dim nextId As Int = TLNlastID.Replace("t", "") + 1
		Dim DBkey As String = "t" & nextId
		TLNlastID = DBkey
		
		Dim tln As Map = CreateMap("Name": tName)
		CurrentWebUrl = URLteilnehmer & "/" & DBkey & ".json?auth=" & Status.GetDefault("idToken", "")
		DBdatenTyp = "addTLN"
		
		Dim jg As JSONGenerator
		jg.Initialize(tln)
		PutTextWeb(jg.ToString)
	End If
End Sub

Private Sub ladeWertungsliste(dictionary As Map)
	webviewData.Initialize
	webviewData.AddAll(Array As Object("Platz", "Teilnehmer", "Gewicht", "Rang"))
	VSTNGgeschlossen = False
	
	For Each key As String In dictionary.Keys
		Dim val As Object = dictionary.Get(key)
		If key = "Status" Then
			If "geschlossen" = val Then VSTNGgeschlossen = True
		End If
		If key.StartsWith("p") Then
			Dim ergebnis As Map = val
			Dim maxAnzahl As Int = DBGet("VeranstaltungAnzahl", "25")
			webviewData.Add(ergebnis.GetDefault("Platz", 0))
			webviewData.Add(ergebnis.GetDefault("Teilnehmer", ""))
			webviewData.Add(ergebnis.GetDefault("Gewicht", 0))
			webviewData.Add(ergebnis.GetDefault("Rang", maxAnzahl))
		End If
	Next
	
	initWertungsliste(False)
	DBPut("webviewData", webviewData)
	zeigeWertungsliste
End Sub

Private Sub ladeTeilnehmer(response As String)
	Teilnehmer.Initialize
	If response <> "" And response <> "null" Then
		Dim jp As JSONParser
		jp.Initialize(response)
		Dim teilnehmerliste As Map = jp.NextObject
		For Each key As String In teilnehmerliste.Keys
			Dim lastID As Int = key.Replace("t", "")
			Dim currentMax As Int = TLNlastID.Replace("t", "")
			If lastID > currentMax Then TLNlastID = "t" & lastID
			Dim tMap As Map = teilnehmerliste.Get(key)
			Teilnehmer.Add(tMap.GetDefault("Name", "unbenannt"))
		Next
		If Teilnehmer.Size > 0 Then Teilnehmer.Sort(True)
	End If
	DBPut("Teilnehmer", Teilnehmer)
End Sub

Private Sub ladeFDJ(response As String)
	If response <> "" And response <> "null" Then
		Dim jp As JSONParser
		jp.Initialize(response)
		Dim fdj As Map = jp.NextObject
		DBPut("FDJTeilnehmer", fdj.GetDefault("Teilnehmer", ""))
		DBPut("FDJGewicht", fdj.GetDefault("Gewicht", ""))
	End If
End Sub

' ==============================================================================
' 5. HTTP-CLIENT & OFFLINE-MODUS (ersetzt WebDB + GotTextOffline)
' ==============================================================================
Private Sub GetWeb
	If True = Status.GetDefault("ProgOffline", True) Then
		btnCloseVstng.Enabled = False
		SetButtonImageSafe(btnCloseVstng, "disconnected.png", "⚠")
		btnSettings.Visible = False
		GotTextOffline
	Else
		ExecuteHttp("GET", CurrentWebUrl, "")
	End If
End Sub

Private Sub PutTextWeb(text As String)
	If True = Status.GetDefault("ProgOffline", True) Then
		GotTextOffline
	Else
		ExecuteHttp("PUT", CurrentWebUrl, text)
	End If
End Sub

Private Sub PatchTextWeb(text As String)
	If True = Status.GetDefault("ProgOffline", True) Then
		GotTextOffline
	Else
		ExecuteHttp("PATCH", CurrentWebUrl, text)
	End If
End Sub

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
		Case "PATCH"
			j.PatchString(url, payload)
			j.GetRequest.SetContentType("application/json")
	End Select
	
	Wait For (j) JobDone(j As HttpJob)
	
	If j.Success Then
		HandleGotText(typ, j.GetString)
	Else
		setzeOffline
	End If
	j.Release
	startTimer
End Sub

Private Sub HandleGotText(typ As String, responseContent As String)
	DBdatenTyp = ""
	Dim jp As JSONParser
	
	Select typ
		Case "Wertungsliste"
			If responseContent = "null" Then
				initWertungsliste(True)
				saveWertungsliste("saveWertungsliste")
			Else
				jp.Initialize(responseContent)
				ladeWertungsliste(jp.NextObject)
			End If
		Case "Teilnehmer"
			ladeTeilnehmer(responseContent)
			holeFDJ
		Case "saveWertungsliste"
			addTLN = False
			addTeilnehmer
			If Not(addTLN) Then holeWertungsliste
		Case "addTLN"
			holeWertungsliste
		Case "ErgClosed"
			vaEingabe.Visible = False
			haDown.Visible = True
			btnDown.Visible = False
			UpdateLayoutPositions
			closeVstng("Verranstaltung")
		Case "saveOnly"
			' Nichts weiter tun
		Case "VSTNGclosed"
			' Veranstaltung geschlossen
		Case "LastChange"
			' LastChange aktualisiert
		Case "FDJ"
			ladeFDJ(responseContent)
			holeWertungsliste
	End Select
End Sub

Private Sub GotTextOffline
	Dim typ As String = DBdatenTyp
	DBdatenTyp = ""
	
	Select typ
		Case "Teilnehmer"
			Teilnehmer = DBGet("Teilnehmer", Teilnehmer)
			holeWertungsliste
		Case "Wertungsliste"
			Dim dbWv As List = DBGet("webviewData", Null)
			If dbWv = Null Or Not(dbWv.IsInitialized) Or dbWv.Size = 0 Then
				initWertungsliste(True)
				saveWertungsliste("saveOnly")
			Else
				webviewData = dbWv
			End If
			zeigeWertungsliste
		Case "saveOnly", "LastChange", "fdj"
			' Nichts weiter tun
		Case "saveWertungsliste"
			addTLN = False
			addTeilnehmer
			If Not(addTLN) Then zeigeWertungsliste
		Case "addTLN"
			zeigeWertungsliste
	End Select
End Sub

Private Sub setzeOffline
	Status.Put("ProgOffline", True)
	MsgboxAsync("Die Datenbank ist nicht mehr erreichbar. Kein Problem! Das Programm arbeitet offline und synchronisiert sich später mit der Datenbank. Es ist jedoch nur die zuletzt verwendete Wertungsliste verfügbar!", "Internet-Verbindung nicht möglich!")
	btnCloseVstng.Enabled = False
	SetButtonImageSafe(btnCloseVstng, "disconnected.png", "⚠")
	btnSettings.Visible = False
End Sub

' ==============================================================================
' 6. UI-EVENTS (Buttons, Spinner, Textfelder)
' ==============================================================================
Private Sub btnSettings_Click
	Uhrzeit.Enabled = False
	OpenSettingsPage
End Sub

Private Sub OpenSettingsPage
	B4XPages.ShowPage("Settings")
	ToastMessageShow("Wechsel zu Settings", False)
End Sub

Private Sub btnUp_Click
	vaEingabe.Visible = False
	haDown.Visible = True
	btnDown.Visible = True
	UpdateLayoutPositions
	startTimer
End Sub

Private Sub btnDown_Click
	vaEingabe.Visible = True
	haDown.Visible = False
	btnDown.Visible = False
	UpdateLayoutPositions
	startTimer
End Sub

Private Sub spnPlatz_ItemClick (Position As Int, Value As Object)
	PlatzSelected = Value
	btnSpeichern.Enabled = True
	btnSpeichern.TextColor = colorgreen
	RunJS("selectRowById(" & PlatzSelected & ");")
	dochange = True
	startTimer
End Sub

Private Sub btnMinus_Click
	If PlatzSelected > 1 Then
		If btnSpeichern.Enabled Then speichern
		SelectNewRow = PlatzSelected - 1
		If Not(btnSpeichern.Enabled) Then
			RunJS("selectRowById(" & SelectNewRow & ");")
		End If
	End If
	startTimer
End Sub

Private Sub btnPlus_Click
	Dim maxAnzahl As Int = DBGet("VeranstaltungAnzahl", "25")
	If PlatzSelected < maxAnzahl Then
		If btnSpeichern.Enabled Then speichern
		SelectNewRow = PlatzSelected + 1
		If Not(btnSpeichern.Enabled) Then
			RunJS("selectRowById(" & SelectNewRow & ");")
		End If
	End If
	startTimer
End Sub

Private Sub btnSpeichern_Click
	HideKeyboard
	speichern
	startTimer
End Sub

Private Sub btnCloseVstng_Click
	Msgbox2Async("Die Veranstaltung " & QUOTE & lblVeranstaltung.Text & QUOTE & " wird zur Bearbeitung gesperrt und kann danach nicht mehr geändert werden. Es wird nur noch die Ergebnisliste angezeigt.", "Veranstaltung abschließen", "Abschließen", "Abbrechen", "", Null, True)
	Wait For Msgbox_Result (res As Int)
	If res = DialogResponse.POSITIVE Then
		closeVstng("Ergebnisse")
	End If
	startTimer
End Sub

Private Sub btnShare_Click
	RunJS("printView();")
	startTimer
End Sub

Private Sub btnFDJeingabe_Click
	vaErgEingabe.Visible = False
	vaFDJ.Visible = True
	tbxFDJgewicht.Enabled = True
	btnFDJsave.Enabled = False
	btnFDJsave.TextColor = 0xFF888888
	tbxFDJgewicht.SelectionStart = tbxFDJgewicht.Text.Length
	tbxFDJgewicht.RequestFocus
	startTimer
End Sub

Private Sub btnFDJback_Click
	vaErgEingabe.Visible = True
	vaFDJ.Visible = False
	startTimer
End Sub

Private Sub btnFDJsave_Click
	vaErgEingabe.Visible = True
	vaFDJ.Visible = False
	tbxFDJgewicht.Enabled = False
	btnFDJsave.Enabled = False
	HideKeyboard
	
	RunJS("setzeFDJ(" & QUOTE & tbxFDJgewicht.Text & QUOTE & "," & QUOTE & tbxTeilnehmer.Text & QUOTE & ");")
	DBPut("FDJTeilnehmer", tbxTeilnehmer.Text)
	DBPut("FDJGewicht", tbxFDJgewicht.Text)
	saveFDJ
	startTimer
End Sub

' --- Teilnehmer-Textfeld & Autocomplete ---
Private Sub tbxTeilnehmer_FocusChanged (HasFocus As Boolean)
	If HasFocus Then
		tbxTeilnehmer.SelectionStart = tbxTeilnehmer.Text.Length
		lsvName.Visible = False
	Else
		lsvName.Visible = False
		HideKeyboard
	End If
End Sub

Private Sub tbxTeilnehmer_TextChanged (Old As String, New As String)
	
	If lsvName.IsInitialized = False Then Return
	
	If dochange Then
		dochange = False
		' Unerlaubte Zeichen entfernen (ersetzt Xreg1)
		Dim cleaned As String = Regex.Replace("[^a-zA-ZäöüÄÖÜßéèêëáàâçñ \-.]", tbxTeilnehmer.Text, "")
		
		' Anfangsbuchstaben nach Leerzeichen oder Bindestrich groß schreiben
		Dim sb As StringBuilder
		sb.Initialize
		Dim doupper As Boolean = True
		For i = 0 To cleaned.Length - 1
			Dim ch As String = cleaned.SubString2(i, i + 1)
			If ch = " " Or ch = "-" Then
				doupper = True
				sb.Append(ch)
			Else if ch = "," Then
				' Komma entfernen
			Else if doupper Then
				sb.Append(ch.ToUpperCase)
				doupper = False
			Else
				sb.Append(ch)
			End If
		Next
		tbxTeilnehmer.Text = sb.ToString
		dochange = True
	End If
	
	If dochange And tbxTeilnehmer.Text.Length >= 1 Then
		Dim lsvItems As List
		lsvItems.Initialize
		Dim query As String = tbxTeilnehmer.Text.Trim.ToLowerCase
		If query.Length >= 1 Then
			For Each tName As String In Teilnehmer
				If tName.ToLowerCase.Contains(query) Then
					lsvItems.Add(tName)
				End If
			Next
		End If
		
		If tbxTeilnehmer.Text.Trim.Length >= 2 Or tbxTeilnehmer.Text = "" Then
			btnSpeichern.Enabled = True
			btnSpeichern.TextColor = colorgreen
		End If
		
		lsvName.Clear
		If lsvItems.Size >= 1 Then
			For Each item As String In lsvItems
				lsvName.AddSingleLine(item)
			Next
			lsvName.Visible = True
		Else
			lsvName.Visible = False
		End If
	Else
		lsvName.Clear
		lsvName.Visible = False
		btnSpeichern.Enabled = False
		btnSpeichern.TextColor = 0xFF888888
	End If
	
	tbxTeilnehmer.SelectionStart = tbxTeilnehmer.Text.Length
	startTimer
End Sub

Private Sub lsvName_ItemClick (Position As Int, Value As Object)
	HideKeyboard
	dochange = False
	tbxTeilnehmer.Text = Value
	dochange = True
	lsvName.Visible = False
	btnSpeichern.Enabled = True
	btnSpeichern.TextColor = colorgreen
	startTimer
End Sub

' --- Gewicht-Textfelder ---
Private Sub tbxGramm_FocusChanged (HasFocus As Boolean)
	If HasFocus Then
		tbxGramm.SelectionStart = tbxGramm.Text.Length
	Else
		HideKeyboard
	End If
End Sub

Private Sub tbxGramm_TextChanged (Old As String, New As String)
	If dochange Then
		dochange = False
		If IsNumber(tbxGramm.Text) Then
			Dim val As Int = Abs(tbxGramm.Text)
			tbxGramm.Text = val
			btnSpeichern.Enabled = True
			btnSpeichern.TextColor = colorgreen
		End If
		tbxGramm.SelectionStart = tbxGramm.Text.Length
		dochange = True
	End If
	startTimer
End Sub

Private Sub tbxFDJgewicht_FocusChanged (HasFocus As Boolean)
	If HasFocus Then
		tbxFDJgewicht.SelectionStart = tbxFDJgewicht.Text.Length
	Else
		HideKeyboard
	End If
End Sub

Private Sub tbxFDJgewicht_TextChanged (Old As String, New As String)
	If dochange Then
		dochange = False
		If IsNumber(tbxFDJgewicht.Text) Then
			Dim val As Int = Abs(tbxFDJgewicht.Text)
			tbxFDJgewicht.Text = val
			btnFDJsave.Enabled = True
			btnFDJsave.TextColor = colorgreen
		End If
		tbxFDJgewicht.SelectionStart = tbxFDJgewicht.Text.Length
		dochange = True
	End If
	startTimer
End Sub

' ==============================================================================
' 7. TIMER & TINYDB-ERSATZ
' ==============================================================================
Private Sub startTimer
	Uhrzeit.Enabled = False
	Uhrzeit.Interval = 1000 * 300
	Uhrzeit.Enabled = True
End Sub

Private Sub Uhrzeit_Tick
	Uhrzeit.Enabled = False
	B4XPages.ShowPage("ScreenSaver")
	ToastMessageShow("Timeout -> Wechsel zu ScreenSaver", False)
End Sub

Private Sub Zeitstempel As String
	Return FormatDateCustom(DateTime.Now, "yyyyMMddHHmmss")
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
