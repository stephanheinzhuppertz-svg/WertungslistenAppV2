B4A=true
Group=WertungslistenAppV2
ModulesStructureVersion=1
Type=Class
Version=12.8
@EndOfDesignText@
#Region Shared Files
#CustomBuildAction: folders ready, %WINDIR%\System32\Robocopy.exe,"..\..\Shared Files" "..\Files"
'Ctrl + click to sync files: ide://run?file=%WINDIR%\System32\Robocopy.exe&args=..\..\Shared+Files&args=..\Files&FilesSync=True
#End Region

'Ctrl + click to export as zip: ide://run?File=%B4X%\Zipper.jar&Args=Project.zip

Sub Class_Globals
	Private Root As B4XView
	Private xui As XUI

	
	' --- Seiten-Instanzen (B4XPages) ---
	Public PageMain As ScreenMain
	Public PageSettings As Settings
	Public PageSaver As ScreenSaver
	
	' --- Globale Variablen (aus Screen1.bky) ---
	Public apiKey As String = "AIzaSyBT9m4udg4Bn4GhYGusVsj-H-gnYWmMA6U"
	Public TLNlastID As String = "t0"
	Public URLteilnehmer As String = "https://wertungslisten-app-default-rtdb.europe-west1.firebasedatabase.app/Vereine/[...]/Teilnehmer"
	Public URLErgebnisse As String = "https://wertungslisten-app-default-rtdb.europe-west1.firebasedatabase.app/Vereine/[...]/Ergebnisse/"
	Public VereineAndKeys As List
	Public DBdatenTyp As String = ""
	Public idToken As String = ""
	Public refreshToken As String = ""
	Public debug As Boolean = False
	Public Status As Map
	Private colorgreen As Int = 0xFF16AA16
	Private passwordVisible As Boolean = False
	Private selectedVereinIndex As Int = -1
	Private ignoreTextEvents As Boolean = False
	
	' --- UI-Komponenten (aus Screen1.scm) ---
	Private VerticalArrangementHeader As Panel
	Private lblLogin As Label
	Private lblKeineVerbindung As Label
	
	Private VerticalArrangementLogin As Panel
	Private tbxEmail As EditText
	Private TextBoxPassword As EditText
	Private btnFyeo As Button
	Private btnLogin As Button
	
	Private VerticalArrangementLoading As Panel
	Private LabelLoading As Label
	
	Private VerticalArrangementVereine As Panel
	Private btnVnOK As Button
	Private lvwVereine As ListView
	
	' --- Nicht-sichtbare Komponenten ---
	Private Uhrzeit As Timer
	Private DBVerein As Map ' Ersetzt TinyDB (wird als Datei gespeichert)
	Private DBFileName As String = "DBVerein.dat"
	Private ion As Object ' Für ActivityResult (CONFIRM_DEVICE_CREDENTIAL)
End Sub

Public Sub Initialize
	VereineAndKeys.Initialize
	Status.Initialize
	LoadTinyDB
	Uhrzeit.Initialize("Uhrzeit", 60000)
End Sub

Private Sub B4XPage_Created (Root1 As B4XView)
	Root = Root1
	B4XPages.SetTitle(Me, "Wertungslisten-App by sthnet.de")
	
	' Unterseiten einmalig registrieren
	PageMain.Initialize
	B4XPages.AddPage("ScreenMain", PageMain)
	
	PageSettings.Initialize
	B4XPages.AddPage("Settings", PageSettings)
	
	PageSaver.Initialize
	B4XPages.AddPage("ScreenSaver", PageSaver)
	
	' UI komplett per Code aufbauen
	BuildUI
	
	' --- Logik aus Screen1.Initialize ---
	Uhrzeit.Enabled = False
	refreshToken = DBGet("refreshToken", "")
	idToken = DBGet("idToken", "")
	
	Status.Put("refreshToken", refreshToken)
	Status.Put("idToken", idToken)
	Status.Put("debug", debug)
	Status.Put("ProgOffline", False)
	
	colorgreen = LabelLoading.TextColor
	ignoreTextEvents = True
	tbxEmail.Text = ""
	TextBoxPassword.Text = ""
	ignoreTextEvents = False
	
	If refreshToken <> "" And idToken <> "" Then
		VerticalArrangementLoading.Visible = False
		VerticalArrangementLogin.Visible = False
		VerticalArrangementVereine.Visible = False
		' Kurz warten, bis Activity vollständig im Vordergrund ist
		Sleep(150)
		StartConfirmDeviceCredential
	Else
		VerticalArrangementLoading.Visible = False
		VerticalArrangementLogin.Visible = True
	End If
	
	btnVnOK.Enabled = False
	btnVnOK.TextColor = 0xFF888888
	
End Sub

' ==============================================================================
' 1. UI-AUFBAU (1:1 aus Screen1.scm)
' ==============================================================================
Private Sub BuildUI
	' Hintergrundbild setzen
	If File.Exists(File.DirAssets, "Screen.png") Then
		Root.SetBitmap(xui.LoadBitmap(File.DirAssets, "Screen.png"))
	Else
		Root.Color = 0xFFEEFFEE
	End If
	
	' --- Header ---
	VerticalArrangementHeader.Initialize("")
	VerticalArrangementHeader.Color = 0xFFEEFFEE
	Root.AddView(VerticalArrangementHeader, 0, 0, 100%x, 40dip)
	
	lblLogin.Initialize("")
	lblLogin.Text = "  Login"
	lblLogin.TextSize = 20
	lblLogin.Typeface = Typeface.DEFAULT_BOLD
	lblLogin.TextColor = 0xFF16AA16
	lblLogin.Gravity = Gravity.CENTER_VERTICAL
	VerticalArrangementHeader.AddView(lblLogin, 0, 0, 100%x, 40dip)
	
	lblKeineVerbindung.Initialize("")
	lblKeineVerbindung.Color = 0xFFFF0000
	lblKeineVerbindung.Text = "Keine Internetverbindung!"
	lblKeineVerbindung.TextColor = 0xFFFFFFFF
	lblKeineVerbindung.Gravity = Gravity.CENTER
	lblKeineVerbindung.Visible = False
	VerticalArrangementHeader.AddView(lblKeineVerbindung, 0, 0, 100%x, 40dip)
	
	' --- Login-Bereich ---
	VerticalArrangementLogin.Initialize("")
	VerticalArrangementLogin.Color = 0xFFEEFFEE
	VerticalArrangementLogin.Visible = False
	Root.AddView(VerticalArrangementLogin, 0, 40dip, 100%x, 260dip)
	
	Dim boxWidth As Int = 80%x
	Dim leftMargin As Int = 10%x
	
	Dim Label1 As Label
	Label1.Initialize("")
	Label1.Text = "eMail-Adresse:"
	Label1.TextSize = 16
	Label1.Typeface = Typeface.DEFAULT_BOLD
	Label1.TextColor = Colors.Black
	VerticalArrangementLogin.AddView(Label1, leftMargin, 15dip, boxWidth, 25dip)
	
	tbxEmail.Initialize("tbxEmail")
	tbxEmail.TextSize = 18
	tbxEmail.Typeface = Typeface.DEFAULT_BOLD
	tbxEmail.TextColor = 0xFF16AA16
	tbxEmail.SingleLine = True
	tbxEmail.InputType = 33
	VerticalArrangementLogin.AddView(tbxEmail, leftMargin, 42dip, boxWidth, 45dip)
	
	Dim Label2 As Label
	Label2.Initialize("")
	Label2.Text = "Passwort:"
	Label2.TextSize = 16
	Label2.Typeface = Typeface.DEFAULT_BOLD
	Label2.TextColor = Colors.Black
	VerticalArrangementLogin.AddView(Label2, leftMargin, 95dip, boxWidth, 25dip)
	
	TextBoxPassword.Initialize("TextBoxPassword")
	TextBoxPassword.TextSize = 18
	TextBoxPassword.Typeface = Typeface.DEFAULT_BOLD
	TextBoxPassword.TextColor = 0xFF16AA16
	TextBoxPassword.PasswordMode = True
	TextBoxPassword.SingleLine = True
	VerticalArrangementLogin.AddView(TextBoxPassword, leftMargin, 122dip, boxWidth - 36dip, 45dip)
	
	btnFyeo.Initialize("btnFyeo")
	If File.Exists(File.DirAssets, "fyeo.png") Then
		btnFyeo.SetBackgroundImage(LoadBitmap(File.DirAssets, "fyeo.png"))
	Else
		btnFyeo.Text = "👁"
	End If
	VerticalArrangementLogin.AddView(btnFyeo, leftMargin + boxWidth - 32dip, 130dip, 28dip, 28dip)
	
	btnLogin.Initialize("btnLogin")
	btnLogin.Text = "LogIn"
	btnLogin.Typeface = Typeface.DEFAULT_BOLD
	btnLogin.TextColor = 0xFF888888
	btnLogin.Enabled = False
	VerticalArrangementLogin.AddView(btnLogin, (100%x - 120dip) / 2, 185dip, 120dip, 45dip)
	
	' --- Loading-Bereich ---
	VerticalArrangementLoading.Initialize("")
	VerticalArrangementLoading.Color = 0xFFEEFFEE
	Root.AddView(VerticalArrangementLoading, 0, 40dip, 100%x, 90dip)
	
	LabelLoading.Initialize("")
	LabelLoading.Text = "Lade Daten ..."
	LabelLoading.Typeface = Typeface.DEFAULT_BOLD
	LabelLoading.TextColor = 0xFF16AA16
	LabelLoading.Gravity = Gravity.CENTER
	VerticalArrangementLoading.AddView(LabelLoading, 0, 25dip, 100%x, 40dip)
	
	' --- Vereins-Auswahl ---
	VerticalArrangementVereine.Initialize("")
	VerticalArrangementVereine.Color = 0xDDEEFFEE
	VerticalArrangementVereine.Visible = False
	Root.AddView(VerticalArrangementVereine, 0, 0, 100%x, 100%y)
	
	Dim Label4 As Label
	Label4.Initialize("")
	Label4.Text = "  Bitte Vereins-Auswahl treffen:"
	Label4.TextSize = 16
	Label4.Typeface = Typeface.DEFAULT_BOLD
	Label4.TextColor = Colors.Black
	Label4.Gravity = Gravity.CENTER_VERTICAL
	VerticalArrangementVereine.AddView(Label4, 0, 5dip, 100%x - 80dip, 40dip)
	
	btnVnOK.Initialize("btnVnOK")
	btnVnOK.Text = "OK"
	btnVnOK.Typeface = Typeface.DEFAULT_BOLD
	btnVnOK.TextColor = 0xFF888888
	btnVnOK.Enabled = False
	VerticalArrangementVereine.AddView(btnVnOK, 100%x - 75dip, 5dip, 70dip, 40dip)
	
	lvwVereine.Initialize("lvwVereine")
	lvwVereine.SingleLineLayout.Label.TextColor = 0xFF16AA16
	lvwVereine.SingleLineLayout.Label.TextSize = 18
	VerticalArrangementVereine.AddView(lvwVereine, 0, 50dip, 100%x, 100%y - 50dip)
End Sub

' ==============================================================================
' 2. UI-EVENTS (Login, Textfelder, Listen)
' ==============================================================================
Private Sub tbxEmail_FocusChanged (HasFocus As Boolean)
	If HasFocus Then
		tbxEmail.SelectionStart = tbxEmail.Text.Length
	Else
		HideKeyboard
	End If
End Sub

Private Sub TextBoxPassword_FocusChanged (HasFocus As Boolean)
	If HasFocus Then
		TextBoxPassword.SelectionStart = TextBoxPassword.Text.Length
	Else
		HideKeyboard
	End If
End Sub

Private Sub tbxEmail_TextChanged (Old As String, New As String)
	If ignoreTextEvents Then Return
	CheckLoginButtonState
End Sub

Private Sub TextBoxPassword_TextChanged (Old As String, New As String)
	If ignoreTextEvents Then Return
	CheckLoginButtonState
End Sub

Private Sub CheckLoginButtonState
	If tbxEmail.Text.Trim <> "" And TextBoxPassword.Text.Trim <> "" Then
		btnLogin.Enabled = True
		btnLogin.TextColor = colorgreen
	Else
		btnLogin.Enabled = False
		btnLogin.TextColor = 0xFF888888
	End If
End Sub

Private Sub btnFyeo_Click
	ignoreTextEvents = True
	passwordVisible = Not(passwordVisible)
	TextBoxPassword.PasswordMode = Not(passwordVisible)
	TextBoxPassword.SelectionStart = TextBoxPassword.Text.Length
	ignoreTextEvents = False
End Sub

Private Sub lvwVereine_ItemClick (Position As Int, Value As Object)
	selectedVereinIndex = Position
	btnVnOK.TextColor = colorgreen
	btnVnOK.Enabled = True
End Sub

Private Sub btnVnOK_Click
	Uhrzeit.Enabled = False
	If selectedVereinIndex < 0 Then Return
	
	DBPut("Bezeichnung", lvwVereine.GetItem(selectedVereinIndex))
	DBPut("VereinsID", VereineAndKeys.Get(selectedVereinIndex))
	
	B4XPages.ShowPage("ScreenMain")
End Sub

' ==============================================================================
' 3. AUTHENTIFIZIERUNG & WEB-REQUESTS (Firebase REST API)
' ==============================================================================
Private Sub btnLogin_Click
	HideKeyboard
	Dim url As String = "https://identitytoolkit.googleapis.com/v1/accounts:signInWithPassword?key=" & apiKey
	
	Dim bodyMap As Map = CreateMap( _
		"email": tbxEmail.Text.Trim, _
		"password": TextBoxPassword.Text.Trim, _
		"returnSecureToken": True)
	Dim jg As JSONGenerator
	jg.Initialize(bodyMap)
	
	SendHttpRequest("refreshToken", "POST", url, jg.ToString, "application/json")
End Sub

Private Sub RefreshTokenProcedure
	Dim url As String = "https://securetoken.googleapis.com/v1/token?key=" & apiKey
	Dim body As String = "grant_type=refresh_token&refresh_token=" & Status.GetDefault("refreshToken", "")
	SendHttpRequest("refresh_token", "POST", url, body, "application/x-www-form-urlencoded")
End Sub

Private Sub holeVerein
	Dim url As String = "https://wertungslisten-app-default-rtdb.europe-west1.firebasedatabase.app/Vereine.json?shallow=true&auth=" & Status.GetDefault("idToken", "")
	SendHttpRequest("holeVereine", "GET", url, "", "")
End Sub

Private Sub holeBezeichnung(key As String, typ As String)
	Dim url As String = "https://wertungslisten-app-default-rtdb.europe-west1.firebasedatabase.app/Vereine/" & key & "/Bezeichnung.json?auth=" & Status.GetDefault("idToken", "")
	SendHttpRequest(typ, "GET", url, "", "")
End Sub

Private Sub holeTLN
	Dim vID As String = DBGet("VereinsID", "[...]")
	Dim url As String = URLteilnehmer.Replace("[...]", vID) & ".json?auth=" & Status.GetDefault("idToken", "")
	SendHttpRequest("Teilnehmer", "GET", url, "", "")
End Sub

Private Sub saveWertungsliste(webViewData As List)
	Dim verDatum As String = DBGet("VeranstaltungDatum", FormatDateCustom(DateTime.Now, "dd.MM.yyyy"))
	Dim keyParts() As String = Regex.Split("\.", verDatum)
	Dim dateKey As String = keyParts(2) & keyParts(1) & keyParts(0)
	
	Dim vID As String = DBGet("VereinsID", "[...]")
	Dim url As String = URLErgebnisse.Replace("[...]", vID) & "e" & dateKey & ".json?auth=" & Status.GetDefault("idToken", "")
	
	Dim body As Map
	body.Initialize
	body.Put("Datum", verDatum)
	body.Put("Name", DBGet("VeranstaltungName", "- nicht gesetzt -"))
	body.Put("Status", "offen")
	
	For i = 4 To webViewData.Size - 1 Step 4
		Dim platzVal As Int = webViewData.Get(i)
		Dim padded As String = "0000" & platzVal
		Dim id As String = "p" & padded.SubString(padded.Length - 4)
		
		Dim eintrag As Map = CreateMap( _
			"Platz": platzVal, _
			"Teilnehmer": webViewData.Get(i + 1), _
			"Gewicht": webViewData.Get(i + 2), _
			"Rang": webViewData.Get(i + 3))
		body.Put(id, eintrag)
	Next
	
	Dim jg As JSONGenerator
	jg.Initialize(body)
	SendHttpRequest("UpdateErgebnisse", "PUT", url, jg.ToString, "application/json")
End Sub

' Zentraler HTTP-Handler (ersetzt WebDB.Get / PostText / PutText + WebDB.GotText)
Private Sub SendHttpRequest(typ As String, method As String, url As String, payload As String, contentType As String)
	DBdatenTyp = typ
	Dim j As HttpJob
	j.Initialize(typ, Me)
	
	Select method
		Case "GET"
			j.Download(url)
		Case "POST"
			j.PostString(url, payload)
			If contentType <> "" Then j.GetRequest.SetContentType(contentType)
		Case "PUT"
			j.PutString(url, payload)
			If contentType <> "" Then j.GetRequest.SetContentType(contentType)
	End Select
	
	Wait For (j) JobDone(j As HttpJob)
	
	If j.Success Then
		HandleWebResponse(typ, url, j.GetString)
	Else
		Dim statusCode As Int = j.Response.StatusCode
		If statusCode >= 400 And statusCode < 500 Then
			Dim errTxt As String = j.ErrorMessage
			If errTxt.Contains("INVALID_EMAIL") Then
				MsgboxAsync("Die eingegebene eMail-Adresse hat kein gültiges Format.", "Anmeldung fehlgeschlagen")
			Else If errTxt.Contains("INVALID_LOGIN_CREDENTIALS") Or errTxt.Contains("INVALID_PASSWORD") Or errTxt.Contains("EMAIL_NOT_FOUND") Then
				MsgboxAsync("eMail-Adresse oder Passwort ist falsch!", "Anmeldung fehlgeschlagen")
			Else If errTxt.Contains("TOO_MANY_ATTEMPTS_TRY_LATER") Then
				MsgboxAsync("Zu viele Fehlversuche. Bitte später erneut versuchen.", "Anmeldung gesperrt")
			Else
				MsgboxAsync("Anmeldefehler: " & errTxt, "Anmeldung fehlgeschlagen")
			End If
			If typ = "refresh_token" Then
				VerticalArrangementLoading.Visible = False
				VerticalArrangementLogin.Visible = True
			End If
		Else
			Status.Put("ProgOffline", True)
			lblKeineVerbindung.Visible = True
			lblLogin.Visible = False
			
			Dim savedID As String = DBGet("VereinsID", "")
			Dim savedBez As String = DBGet("Bezeichnung", "")
			If savedID.Trim <> "" And savedBez.Trim <> "" Then
				Msgbox2Async("Die Datenbank ist nicht erreichbar. Kein Problem! Das Programm arbeitet offline und synchronisiert sich später mit der Datenbank. Es ist jedoch nur die zuletzt verwendete Wertungsliste verfügbar!", "Internet-Verbindung nicht möglich!", "Offline nutzen", "", "", Null, True)
				Wait For Msgbox_Result (res As Int)
				If res = DialogResponse.POSITIVE Then
					Uhrzeit.Enabled = False
					B4XPages.ShowPage("ScreenMain")
				End If
			Else
				MsgboxAsync("Die Datenbank ist nicht erreichbar. Das Programm kann nicht gestartet werden!" & CRLF & "(" & j.ErrorMessage & ")", "Internet-Verbindung nicht möglich!")
			End If
		End If
	End If
	j.Release
End Sub

' Auswertung der Antworten (entspricht WebDB.GotText)
Private Sub HandleWebResponse(typ As String, reqUrl As String, responseContent As String)
	Dim jp As JSONParser
	
	Select typ
		Case "refreshToken"
			jp.Initialize(responseContent)
			Dim resp As Map = jp.NextObject
			Status.Put("idToken", resp.GetDefault("idToken", ""))
			Status.Put("refreshToken", resp.GetDefault("refreshToken", ""))
			DBPut("idToken", Status.Get("idToken"))
			DBPut("refreshToken", Status.Get("refreshToken"))
			pruefeOfflineAenderung
			
		Case "refresh_token"
			jp.Initialize(responseContent)
			Dim resp As Map = jp.NextObject
			Status.Put("idToken", resp.GetDefault("access_token", ""))
			Status.Put("refreshToken", resp.GetDefault("refresh_token", ""))
			DBPut("idToken", Status.Get("idToken"))
			DBPut("refreshToken", Status.Get("refreshToken"))
			pruefeOfflineAenderung
			
		Case "holeVereine"
			jp.Initialize(responseContent)
			Dim vereine As Map = jp.NextObject
			If vereine.Size = 1 Then
				For Each k As String In vereine.Keys
					DBPut("VereinsID", k)
					holeBezeichnung(k, "holeBezeichnung")
				Next
			Else If vereine.Size > 1 Then
				VereineAndKeys.Clear
				lvwVereine.Clear
				selectedVereinIndex = -1
				For Each k As String In vereine.Keys
					holeBezeichnung(k, "holeBezeichnungen")
				Next
				VerticalArrangementHeader.Visible = False
				VerticalArrangementLogin.Visible = False
				VerticalArrangementVereine.Visible = True
				startTimer
			Else
				ToastMessageShow("DB-Fehler, keine Vereine hinterlegt, Fehler 104", True)
			End If
			
		Case "holeBezeichnungen"
			Dim bez As String = responseContent.Replace(QUOTE, "")
			lvwVereine.AddSingleLine(bez)
			Dim urlparts() As String = Regex.Split("/", reqUrl)
			If urlparts.Length > 4 Then
				VereineAndKeys.Add(urlparts(4))
			End If
			
		Case "holeBezeichnung"
			Dim bez As String = responseContent.Replace(QUOTE, "")
			DBPut("Bezeichnung", bez)
			Uhrzeit.Enabled = False
			B4XPages.ShowPage("ScreenMain")
			
		Case "UpdateErgebnisse"
			holeTLN
			
		Case "Teilnehmer"
			ladeTeilnehmer(responseContent)
			
		Case "addTLN"
			Dim aendMap As Map = CreateMap("Änderung": False, "Datum": Zeitstempel)
			DBPut("letzteÄnderung", aendMap)
			holeVerein
	End Select
End Sub

' ==============================================================================
' 4. TEILNEHMER & OFFLINE-PRÜFUNG
' ==============================================================================
Private Sub ladeTeilnehmer(response As String)
	Dim Teilnehmer As List
	Teilnehmer.Initialize
	
	If response <> "" And response <> "null" Then
		Dim jp As JSONParser
		jp.Initialize(response)
		Dim teilnehmerliste As Map = jp.NextObject
		
		For Each key As String In teilnehmerliste.Keys
			Dim lastID As Int = key.Replace("t", "")
			Dim currentMax As Int = TLNlastID.Replace("t", "")
			If lastID > currentMax Then
				TLNlastID = "t" & lastID
			End If
			Dim tMap As Map = teilnehmerliste.Get(key)
			Teilnehmer.Add(tMap.GetDefault("Name", "unbenannt"))
		Next
		addTeilnehmer(teilnehmerliste, Teilnehmer)
	Else
		Dim emptyMap As Map
		emptyMap.Initialize
		addTeilnehmer(emptyMap, Teilnehmer)
	End If
End Sub

Private Sub addTeilnehmer(Teilnehmerliste As Map, Teilnehmer As List)
	Dim dbTeilnehmer As List = DBGet("Teilnehmer", Null)
	If dbTeilnehmer <> Null And dbTeilnehmer.IsInitialized Then
		For Each item As String In dbTeilnehmer
			If Teilnehmer.IndexOf(item.Trim) = -1 Then
				Dim nextNum As Int = TLNlastID.Replace("t", "") + 1
				Dim DBkey As String = "t" & nextNum
				TLNlastID = DBkey
				Teilnehmerliste.Put(DBkey, CreateMap("Name": item.Trim))
			End If
		Next
	End If
	
	If Teilnehmerliste.Size > 0 Then
		Dim vID As String = DBGet("VereinsID", "[...]")
		Dim url As String = URLteilnehmer.Replace("[...]", vID) & ".json?auth=" & Status.GetDefault("idToken", "")
		Dim jg As JSONGenerator
		jg.Initialize(Teilnehmerliste)
		SendHttpRequest("addTLN", "PUT", url, jg.ToString, "application/json")
	End If
End Sub

Private Sub pruefeOfflineAenderung
	Dim aendMap As Map = DBGet("letzteÄnderung", Null)
	If aendMap <> Null And aendMap.IsInitialized And True = aendMap.GetDefault("Änderung", False) Then
		If Zeitstempel <> aendMap.GetDefault("Datum", Zeitstempel) Then
			VerticalArrangementHeader.Visible = False
			VerticalArrangementLogin.Visible = False
			VerticalArrangementLoading.Visible = True
			
			Dim msg As String = "Aus der letzen Verwendung des Programms für den " & _
				DBGet("VeranstaltungDatum", "- nicht gesetzt -") & " - " & _
				DBGet("VeranstaltungName", "- nicht gesetzt -") & _
				" - sind nicht gesicherte Daten vorhanden. Sollen diese Daten jetzt gesichert werden?"
				
			Msgbox2Async(msg, "Nicht gesicherte Daten vorhanden", "Sichern", "", "Verwerfen", Null, False)
			Wait For Msgbox_Result (res As Int)
			If res = DialogResponse.POSITIVE Then
				Dim wvData As List = DBGet("webviewData", Null)
				If wvData <> Null Then saveWertungsliste(wvData)
			Else If res = DialogResponse.NEGATIVE Then
				DBPut("letzteÄnderung", CreateMap("Änderung": False, "Datum": Zeitstempel))
				holeVerein
			End If
			Return
		End If
	End If
	holeVerein
End Sub

' ==============================================================================
' 5. HILFSFUNKTIONEN (Timer, TinyDB-Ersatz, Geräte-Sperre, Tastatur)
' ==============================================================================
Private Sub startTimer
	Uhrzeit.Enabled = False
	Uhrzeit.Interval = 1000 * 60
	Uhrzeit.Enabled = True
End Sub

Private Sub Uhrzeit_Tick
	Uhrzeit.Enabled = False
	B4XPages.ShowPage("ScreenSaver")
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

' --- TinyDB-Ersatz (speichert dauerhaft im internen App-Speicher) ---
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

' --- ActivityStarter: android.app.action.CONFIRM_DEVICE_CREDENTIAL ---
Private Sub StartConfirmDeviceCredential
	Try
		Dim i As Intent
		i.Initialize("android.app.action.CONFIRM_DEVICE_CREDENTIAL", "")
		StartActivityForResult(i)
	Catch
		' Fallback, falls Gerät keine Display-Sperre (PIN/Muster/Fingerabdruck) eingerichtet hat
		Log("StartConfirmDeviceCredential Fehler: " & LastException.Message)
		RefreshTokenProcedure
	End Try
End Sub

Private Sub StartActivityForResult(i As Intent)
	Dim jo As JavaObject = GetBA
	ion = jo.CreateEvent("anywheresoftware.b4a.IOnActivityResult", "ion", Null)
	jo.RunMethod("startActivityForResult", Array As Object(ion, i))
End Sub

Private Sub ion_Event (MethodName As String, Args() As Object) As Object
	Dim resCode As Int = Args(0)
	If resCode = -1 Then
		RefreshTokenProcedure
	End If
	Return Null
End Sub

Private Sub GetBA As Object
	Dim jo As JavaObject
	jo.InitializeStatic(Application.PackageName & ".main")
	Return jo.GetField("processBA")
End Sub
