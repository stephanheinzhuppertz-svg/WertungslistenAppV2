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

	' --------------------------------------------------
	' Datenquellen
	' --------------------------------------------------
	Public URLVERANSTALTUNGEN As String = "https://wertungslisten-app-default-rtdb.europe-west1.firebasedatabase.app/Vereine/[...]/Veranstaltungen"
	Public URLTEILNEHMER As String = "https://wertungslisten-app-default-rtdb.europe-west1.firebasedatabase.app/Vereine/[...]/Teilnehmer"
	Public URLERGEBNISSE As String = "https://wertungslisten-app-default-rtdb.europe-west1.firebasedatabase.app/Vereine/[...]/Ergebnisse"

	' --------------------------------------------------
	' Statusdaten
	' --------------------------------------------------
	Public DBDATENTYP As String = ""
	Public DOCHANGE As Boolean = False

	Public STATUS As Map
	Public VERANSTALTUNGEN As Map
	Public TEILNEHMER As List

	' --------------------------------------------------
	' Veranstaltungsverwaltung
	' --------------------------------------------------
	Public WEBVIEWVERANSTALTUNGEN As List

	Public VERANSTALTUNG_ID As String = "v0"
	Public WEBVIEWVERANSTALTUNG_ID As String = "v0"
	Public VERANSTALTUNG_NEU_ID As String = "v1"

	Public TEILNEHMER_ID As String = "t0"
	Public TEILNEHMER_NEU_ID As String = "t1"

	' --------------------------------------------------
	' Farben
	' --------------------------------------------------
	Public COLORGREEN As Int = 0xFF16AA16
	Public COLORBLUE As Int = 0xFF3333FF

	' --------------------------------------------------
	' UI-Komponenten
	' --------------------------------------------------
	Private lblVerein As Label
	Private lblVeranstaltung As Label
	Private lblDatum As Label
	Private lblClosed As Label

	Private dprDatum As Button
	Private btnAuswahl As Button

	Private tbxVeranstaltung As EditText
	Private tbxAnzahl As EditText

	Private btnVerstgDelete As Button
	Private btnVerstgSpeichern As Button

	Private svMain As ScrollView

	Private lstVeranstaltungen As CustomListView
	Private lstTeilnehmer As CustomListView

	Private tbxTeilnehmer As EditText

	Private btnTLNDelete As Button
	Private btnTLNSpeichern As Button

	Private pnlVstng As Panel
	Private pnlTeilnehmer As Panel

	' --------------------------------------------------
	' Nicht sichtbare Komponenten
	' --------------------------------------------------
	Private UHRZEIT As Timer

	' --------------------------------------------------
	' Lokale Datenhaltung
	' --------------------------------------------------
	Private DBVEREIN As Map
	Private DBDATEINAME As String = "DBVerein.dat"

	Private AKTUELLEWEBURL As String = ""

	' --------------------------------------------------
	' DatePicker
	' --------------------------------------------------
	Private DPRYEAR As Int
	Private DPRMONTH As Int
	Private DPRDAY As Int

	' --------------------------------------------------
	' Layout-Hilfswerte
	' --------------------------------------------------
	Private DEFAULTVERANSTALTUNGSLISTENHOEHE As Int
	Private DEFAULTTEILNEHMERLISTENHOEHE As Int

End Sub

Public Sub Initialize

	'Initialisiert die Datenstrukturen und Standardwerte der Settings-Seite.

	STATUS.Initialize
	VERANSTALTUNGEN.Initialize
	TEILNEHMER.Initialize

	LoadTinyDB

	UHRZEIT.Initialize("Uhrzeit", 300000)

	DPRYEAR = DateTime.GetYear(DateTime.Now)
	DPRMONTH = DateTime.GetMonth(DateTime.Now)
	DPRDAY = DateTime.GetDayOfMonth(DateTime.Now)

End Sub

Private Sub B4XPage_Created(Root1 As B4XView)

    'Erzeugt die Seite, lädt die Layouts und speichert die Standardgrößen
    'der beiden CustomListViews für spätere Layoutanpassungen.

    Root = Root1

    Root.LoadLayout("Settings")
    svMain.Panel.LoadLayout("SettingsContent")

    DEFAULTVERANSTALTUNGSLISTENHOEHE = lstVeranstaltungen.AsView.Height
    DEFAULTTEILNEHMERLISTENHOEHE = lstTeilnehmer.AsView.Height

	UpdateLayout

End Sub

Private Sub B4XPage_CloseRequest As ResumableSub

	'Stoppt den Bildschirmschoner-Timer und sichert den aktuellen Status
	'bevor die Seite geschlossen wird.

	UHRZEIT.Enabled = False

	B4XPages.MainPage.STATUS = STATUS

	Return True

End Sub

Private Sub CloseSettings

	'Beendet die Settings-Seite und übernimmt den aktuellen Status
	'in die MainPage.

	UHRZEIT.Enabled = False

	B4XPages.MainPage.STATUS = STATUS

	B4XPages.ClosePage(Me)

End Sub


Private Sub disableVSTNG

	'Sperrt die Bearbeitung einer Veranstaltung.

	dprDatum.Enabled = False
	dprDatum.TextColor = 0xFF888888

	btnVerstgDelete.Enabled = False
	btnVerstgDelete.TextColor = 0xFF888888

	btnVerstgSpeichern.Enabled = False
	btnVerstgSpeichern.TextColor = 0xFF888888

	tbxVeranstaltung.Enabled = False
	tbxAnzahl.Enabled = False

	btnAuswahl.TextColor = 0xFF888888

End Sub

Private Sub enableVSTNG

	'Aktiviert die Bearbeitung einer Veranstaltung.

	dprDatum.Enabled = True
	dprDatum.TextColor = COLORGREEN

	btnVerstgDelete.Enabled = True
	btnVerstgDelete.TextColor = COLORGREEN

	btnVerstgSpeichern.Enabled = False
	btnVerstgSpeichern.TextColor = 0xFF888888

	tbxVeranstaltung.Enabled = True
	tbxAnzahl.Enabled = True

	btnAuswahl.TextColor = 0xFF888888

End Sub

Private Sub disableTLN

	'Sperrt die Bearbeitung eines Teilnehmers.

	btnTLNDelete.Enabled = False
	btnTLNSpeichern.Enabled = False

	tbxTeilnehmer.Enabled = False

	btnTLNDelete.TextColor = 0xFF888888
	btnTLNSpeichern.TextColor = 0xFF888888

End Sub

Private Sub enableTLN

	'Aktiviert die Bearbeitung eines Teilnehmers.

	btnTLNDelete.Enabled = True
	btnTLNSpeichern.Enabled = False

	tbxTeilnehmer.Enabled = True

	btnTLNDelete.TextColor = COLORGREEN
	btnTLNSpeichern.TextColor = 0xFF888888

End Sub

Private Sub setzeHeaderfromDB

	'Übernimmt die aktuell gespeicherten Vereins- und
	'Veranstaltungsdaten in den Kopfbereich der Seite.

	lblVerein.Text = DBGet("Bezeichnung", "- nicht gesetzt -")
	lblVeranstaltung.Text = DBGet("VeranstaltungName", "- nicht gesetzt -")
	lblDatum.Text = DBGet("VeranstaltungDatum", "- nicht gesetzt -")

End Sub

Private Sub changeURL

	'Erzeugt die Firebase-URLs des aktuell ausgewählten Vereins.

	Dim vereinsid As String = DBGet("VereinsID", "[...]")

	URLVERANSTALTUNGEN = _
        "https://wertungslisten-app-default-rtdb.europe-west1.firebasedatabase.app/Vereine/" & _
        vereinsid & "/Veranstaltungen"

	URLTEILNEHMER = _
        "https://wertungslisten-app-default-rtdb.europe-west1.firebasedatabase.app/Vereine/" & _
        vereinsid & "/Teilnehmer"

	URLERGEBNISSE = _
        "https://wertungslisten-app-default-rtdb.europe-west1.firebasedatabase.app/Vereine/" & _
        vereinsid & "/Ergebnisse"

End Sub

Private Sub holeVeranstaltungen

    'Lädt die Veranstaltungen des aktuell ausgewählten Vereins.

    DBDATENTYP = "Veranstaltungen"

    AKTUELLEWEBURL = _
        URLVERANSTALTUNGEN & _
        ".json?auth=" & _
        STATUS.GetDefault("idToken", "")

	ExecuteHttp("GET", AKTUELLEWEBURL, "")

End Sub

Private Sub ladeVeranstaltungen

	'Bereitet die Veranstaltungsdaten für die Anzeige vor und
	'ermittelt die nächste freie Veranstaltungs-ID.

	dprDatum.Enabled = True
	dprDatum.TextColor = COLORGREEN

	dprDatum.Text = FormatDateCustom(DateTime.Now, "dd.MM.yyyy")

	DPRYEAR = DateTime.GetYear(DateTime.Now)
	DPRMONTH = DateTime.GetMonth(DateTime.Now)
	DPRDAY = DateTime.GetDayOfMonth(DateTime.Now)

	WEBVIEWVERANSTALTUNGEN.Initialize
	WEBVIEWVERANSTALTUNGEN.AddAll(Array As Object("Datum", "Name", "vid"))

	If Not(VERANSTALTUNGEN.IsInitialized) Or VERANSTALTUNGEN.Size = 0 Then

		VERANSTALTUNG_ID = "v0"
		WEBVIEWVERANSTALTUNG_ID = "v0"
		VERANSTALTUNG_NEU_ID = "v1"

		WEBVIEWVERANSTALTUNGEN.AddAll( _
            Array As Object("Veranstaltungs_ID", "v0"))

		setzeVeranstaltung("v0")

	Else

		For Each key As String In VERANSTALTUNGEN.Keys

			Dim newid As Int = key.Replace("v", "") + 1
			Dim curmax As Int = VERANSTALTUNG_NEU_ID.Replace("v", "")

			If newid > curmax Then
				VERANSTALTUNG_NEU_ID = "v" & newid
			End If

			Dim veranstaltung As Map = VERANSTALTUNGEN.Get(key)

			WEBVIEWVERANSTALTUNGEN.AddAll( _
                Array As Object( _
                veranstaltung.GetDefault("Datum", FormatDateCustom(DateTime.Now, "dd.MM.yyyy")), _
                veranstaltung.GetDefault("Name", "- n.n. -"), _
                key))

		Next

		WEBVIEWVERANSTALTUNGEN.AddAll( _
            Array As Object("Veranstaltungs_ID", WEBVIEWVERANSTALTUNG_ID))

	End If

End Sub

Private Sub setzeVeranstaltung(vid As String)

	'Übernimmt die Daten der ausgewählten Veranstaltung
	'in die Eingabefelder der Seite.

	disableVSTNG

	Dim veranstaltung As Map

	If VERANSTALTUNGEN.IsInitialized And VERANSTALTUNGEN.ContainsKey(vid) Then
		veranstaltung = VERANSTALTUNGEN.Get(vid)
	Else
		veranstaltung.Initialize
	End If

	Dim datum As String = _
        veranstaltung.GetDefault( _
        "Datum", _
        FormatDateCustom(DateTime.Now, "dd.MM.yyyy"))

	Dim datumspl() As String = Regex.Split("\.", datum)

	If datumspl.Length >= 3 Then
		DPRYEAR = datumspl(2)
		DPRMONTH = datumspl(1)
		DPRDAY = datumspl(0)
	End If

	dprDatum.Text = datum

	tbxVeranstaltung.Text = _
        veranstaltung.GetDefault( _
        "Name", _
        "unbenannt")

	tbxAnzahl.Text = _
        veranstaltung.GetDefault( _
        "Teilnehmerzahl", _
        "0")

	If veranstaltung.GetDefault("Status", "offen") = "offen" Then

		dprDatum.Enabled = True
		dprDatum.TextColor = COLORGREEN

		tbxVeranstaltung.Enabled = True
		tbxAnzahl.Enabled = True

		lblClosed.Visible = False

	Else

		lblClosed.Visible = True

	End If

	btnVerstgDelete.Enabled = True
	btnVerstgDelete.TextColor = COLORGREEN

	If vid <> "v0" Then

		btnAuswahl.Enabled = True
		btnAuswahl.TextColor = COLORBLUE

	Else

		btnAuswahl.Enabled = False
		btnAuswahl.TextColor = 0xFF888888

	End If

End Sub

Private Sub pruefeDBVerein

    'Prüft, ob die zuletzt gespeicherte Veranstaltung
    'im Vereinsbestand vorhanden ist.

    Dim veranstaltunghandenvorhanden As Boolean = False
    Dim gespeicherteid As String = DBGet("VeranstaltungID", "v0")

    If VERANSTALTUNGEN.IsInitialized And VERANSTALTUNGEN.Size > 0 Then

        For Each key As String In VERANSTALTUNGEN.Keys

            WEBVIEWVERANSTALTUNG_ID = key

            If key = gespeicherteid Then
                veranstaltunghandenvorhanden = True
                Exit
            End If

        Next

    End If

    If Not(veranstaltunghandenvorhanden) Then

        lblVeranstaltung.Text = "- noch nicht ausgewählt -"
        lblDatum.Text = "- bitte auswählen -"

        VERANSTALTUNG_ID = "v0"
        VERANSTALTUNG_NEU_ID = "v1"

		DBPut("VeranstaltungID", "v0")

	End If

End Sub

Private Sub saveVSTNG

	'Speichert die aktuell bearbeitete Veranstaltung
	'in der Firebase-Datenbank.

	disableVSTNG

	Dim dbkey As String = WEBVIEWVERANSTALTUNG_ID

	If dbkey = "v0" Then
		dbkey = VERANSTALTUNG_NEU_ID
		WEBVIEWVERANSTALTUNG_ID = VERANSTALTUNG_NEU_ID
	End If

	Dim daten As Map = CreateMap( _
        "Datum": dprDatum.Text, _
        "Name": tbxVeranstaltung.Text, _
        "Teilnehmerzahl": tbxAnzahl.Text, _
        "Status": "offen")

	AKTUELLEWEBURL = _
        URLVERANSTALTUNGEN & "/" & _
        dbkey & _
        ".json?auth=" & _
        STATUS.GetDefault("idToken", "")

	DBDATENTYP = "addVSTNG"

	Dim jg As JSONGenerator
	jg.Initialize(daten)

	ExecuteHttp("PUT", AKTUELLEWEBURL, jg.ToString)

	If VERANSTALTUNG_ID = WEBVIEWVERANSTALTUNG_ID Then
		saveDBvstng
	End If

	enableVSTNG

End Sub

Private Sub saveDBvstng

	'Speichert die aktuell ausgewählte Veranstaltung
	'im lokalen Datenbestand.

	lblVeranstaltung.Text = tbxVeranstaltung.Text
	lblDatum.Text = dprDatum.Text

	DBPut("VeranstaltungID", VERANSTALTUNG_ID)
	DBPut("VeranstaltungName", tbxVeranstaltung.Text)
	DBPut("VeranstaltungDatum", dprDatum.Text)
	DBPut("VeranstaltungAnzahl", tbxAnzahl.Text)

End Sub

Private Sub delWertungsliste(vid As String)

	'Löscht die Ergebnisdaten einer Veranstaltung.

	disableVSTNG

	If VERANSTALTUNGEN.IsInitialized And VERANSTALTUNGEN.ContainsKey(vid) Then

		Dim veranstaltung As Map = VERANSTALTUNGEN.Get(vid)

		Dim datumstr As String = _
            veranstaltung.GetDefault("Datum", "00.00.0000")

		Dim datumspl() As String = Regex.Split("\.", datumstr)

		If datumspl.Length >= 3 Then

			DBDATENTYP = "delErgebnis"

			AKTUELLEWEBURL = _
                URLERGEBNISSE & _
                "/e" & _
                datumspl(2) & _
                datumspl(1) & _
                datumspl(0) & _
                ".json?auth=" & _
                STATUS.GetDefault("idToken", "")

			ExecuteHttp("DELETE", AKTUELLEWEBURL, "")

		End If

	End If

End Sub

Private Sub delVeranstaltung(vid As String)

	'Löscht eine Veranstaltung aus der Datenbank.

	disableVSTNG

	If VERANSTALTUNGEN.IsInitialized And VERANSTALTUNGEN.ContainsKey(vid) Then

		Dim veranstaltung As Map = VERANSTALTUNGEN.Get(vid)

		Dim veranstaltungsname As String = _
            veranstaltung.GetDefault( _
            "Name", _
            "unbenannt")

		Dim veranstaltungsdatum As String = _
            veranstaltung.GetDefault( _
            "Datum", _
            FormatDateCustom(DateTime.Now, "dd.MM.yyyy"))

		ToastMessageShow( _
            "Die Veranstaltung " & _
            veranstaltungsname & _
            " vom " & _
            veranstaltungsdatum & _
            " wird gelöscht!", _
            False)

		DBDATENTYP = "delVeranstaltung"

		AKTUELLEWEBURL = _
            URLVERANSTALTUNGEN & "/" & _
            vid & _
            ".json?auth=" & _
            STATUS.GetDefault("idToken", "")

		ExecuteHttp( _
            "DELETE", _
            AKTUELLEWEBURL, _
            "")

	End If

	enableVSTNG

End Sub

Private Sub pruefeInhalt

    'Prüft die Eingaben einer Veranstaltung und aktiviert
    'gegebenenfalls die Speichern-Funktion.

    btnVerstgSpeichern.Enabled = False
    btnVerstgSpeichern.TextColor = 0xFF888888

    btnAuswahl.Enabled = False
    btnAuswahl.TextColor = 0xFF888888

    If tbxVeranstaltung.Text.Trim <> "" Then

        If IsNumber(tbxAnzahl.Text) Then

            Dim anzahlplaetze As Int = tbxAnzahl.Text

            If anzahlplaetze > 0 Then

                btnVerstgSpeichern.Enabled = True
                btnVerstgSpeichern.TextColor = COLORGREEN

            End If

        End If

	End If

End Sub

Private Sub holeTLN

	'Lädt die Teilnehmerliste des aktuell ausgewählten Vereins.

	DBDATENTYP = "Teilnehmer"

	AKTUELLEWEBURL = _
        URLTEILNEHMER & _
        ".json?auth=" & _
        STATUS.GetDefault("idToken", "")

	ExecuteHttp("GET", AKTUELLEWEBURL, "")

End Sub

Private Sub ladeTeilnehmer(response As String)

	'Bereitet die Teilnehmerdaten für die Anzeige vor und
	'ermittelt die nächste freie Teilnehmer-ID.

	TEILNEHMER.Initialize

	If response <> "" And response <> "null" Then

		Dim jp As JSONParser
		jp.Initialize(response)

		Dim teilnehmerliste As Map = jp.NextObject

		For Each key As String In teilnehmerliste.Keys

			Dim newid As Int = key.Replace("t", "") + 1
			Dim aktuellemaxid As Int = _
                TEILNEHMER_NEU_ID.Replace("t", "")

			If newid > aktuellemaxid Then
				TEILNEHMER_NEU_ID = "t" & newid
			End If

			Dim teilnehmerdatensatz As Map = _
                teilnehmerliste.Get(key)

			TEILNEHMER.AddAll( _
                Array As Object( _
                teilnehmerdatensatz.GetDefault( _
                "Name", _
                "unbenannt"), _
                key))

		Next

		TEILNEHMER.Add(TEILNEHMER_ID)

	End If

	ZeigeTeilnehmerCLV

End Sub

Private Sub setzeTeilnehmer(tid As String)

	'Übernimmt die Daten des ausgewählten Teilnehmers
	'in die Eingabefelder.

	disableTLN

	If tid = "t0" Then

		DOCHANGE = False
		tbxTeilnehmer.Text = ""
		DOCHANGE = True

		enableTLN

		btnTLNDelete.TextColor = 0xFF888888
		btnTLNDelete.Enabled = False

	Else

		If TEILNEHMER.Size > 0 Then

			Dim index As Int = TEILNEHMER.IndexOf(tid)

			If index > 0 Then

				DOCHANGE = False

				tbxTeilnehmer.Text = _
                    TEILNEHMER.Get(index - 1)

				DOCHANGE = True

				enableTLN

			End If

		End If

	End If

	If tbxTeilnehmer.Enabled Then
		tbxTeilnehmer.RequestFocus
	End If

End Sub

Private Sub saveTLN

	'Speichert einen Teilnehmer in der Datenbank.

	disableTLN

	Dim dbkey As String = TEILNEHMER_ID

	If TEILNEHMER_ID = "t0" Then
		dbkey = TEILNEHMER_NEU_ID
	End If

	Dim teilnehmername As String = tbxTeilnehmer.Text.Trim

	If TEILNEHMER.IndexOf(teilnehmername) >= 0 Then

		MsgboxAsync( _
            "Der Teilnehmer " & _
            teilnehmername & _
            " ist bereits in der Teilnehmerliste vorhanden und kann nicht erneut angelegt werden. Zum Ändern bitte Teilnehmer auswählen und die Änderung speichern.", _
            "Speichern nicht möglich!")

	Else

		Dim teilnehmerdaten As Map = _
            CreateMap("Name": teilnehmername)

		AKTUELLEWEBURL = _
            URLTEILNEHMER & "/" & _
            dbkey & _
            ".json?auth=" & _
            STATUS.GetDefault("idToken", "")

		DBDATENTYP = "addTLN"

		Dim jg As JSONGenerator
		jg.Initialize(teilnehmerdaten)

		ExecuteHttp("PUT", AKTUELLEWEBURL, jg.ToString)

	End If

	enableTLN

End Sub

Private Sub delTLN(tid As String)

	'Löscht einen Teilnehmer aus der Datenbank.

	disableTLN

	ToastMessageShow("Der Teilnehmer wird gelöscht!", False)

	DBDATENTYP = "delTeilnehmer"

	AKTUELLEWEBURL = _
        URLTEILNEHMER & "/" & _
        tid & _
        ".json?auth=" & _
        STATUS.GetDefault("idToken", "")

	ExecuteHttp("DELETE", AKTUELLEWEBURL, "")

	enableTLN

End Sub

Private Sub ExecuteHttp(method As String, url As String, payload As String)

	'Führt eine HTTP-Anfrage aus und verarbeitet das Ergebnis.

	Dim datentyp As String = DBDATENTYP

	Dim jobhttp As HttpJob
	jobhttp.Initialize(datentyp, Me)

	Select method

		Case "GET"

			jobhttp.Download(url)

		Case "PUT"

			jobhttp.PutString(url, payload)
			jobhttp.GetRequest.SetContentType("application/json")

		Case "DELETE"

			jobhttp.Delete(url)

	End Select

	Wait For (jobhttp) JobDone(jobhttp As HttpJob)

	If jobhttp.Success Then

		HandleGotText( _
            datentyp, _
            url, _
            jobhttp.GetString)

	Else

		If jobhttp.ErrorMessage.ToLowerCase.Contains("unable to resolve") _
            Or jobhttp.ErrorMessage.ToLowerCase.Contains("connect") _
            Or jobhttp.ErrorMessage.ToLowerCase.Contains("timeout") Then

			setzeOffline

		Else

			ToastMessageShow( _
                "Fehler: " & jobhttp.ErrorMessage, _
                True)

		End If

	End If

	jobhttp.Release

	startTimer

End Sub

Private Sub HandleGotText(datentyp As String, requrl As String, responsecontent As String)

	'Verarbeitet die Antworten der Datenbankabfragen.

	Dim jp As JSONParser

	Select datentyp

		Case "Teilnehmer"

			DBDATENTYP = ""

			ladeTeilnehmer(responsecontent)

		Case "Veranstaltungen"

			If responsecontent = "null" Or responsecontent = "" Then
				VERANSTALTUNGEN.Initialize
			Else
				jp.Initialize(responsecontent)
				VERANSTALTUNGEN = jp.NextObject
			End If

			pruefeDBVerein
			ZeigeVeranstaltungenCLV

			DBDATENTYP = ""

			holeTLN

		Case "addVSTNG"

			DBDATENTYP = ""

			holeVeranstaltungen

		Case "addTLN"

			DBDATENTYP = ""

			holeTLN

		Case "delTeilnehmer"

			DBDATENTYP = ""

			TEILNEHMER_ID = "t0"

			holeTLN

		Case "delVeranstaltung"

			DBDATENTYP = ""

			If WEBVIEWVERANSTALTUNG_ID = _
                DBGet("VeranstaltungID", "v0") Then

				VERANSTALTUNG_ID = "v0"
				WEBVIEWVERANSTALTUNG_ID = "v0"

				DBPut("VeranstaltungID", "v0")

			End If

			holeVeranstaltungen

		Case "delErgebnis"

			DBDATENTYP = ""

			delVeranstaltung(WEBVIEWVERANSTALTUNG_ID)

		Case Else

			MsgboxAsync( _
                "(" & DBDATENTYP & ")" & requrl, _
                "Da stimmt etwas nicht!")

	End Select

End Sub

Private Sub setzeOffline

    'Schaltet die Anwendung nach einem Verbindungsfehler
    'in den Offline-Modus.

    STATUS.Put("ProgOffline", True)

    Msgbox2Async( _
        "Die Datenbank ist nicht mehr erreichbar. Das Programm arbeitet nun offline. Es ist jetzt nur die zuletzt verwendete Wertungsliste verfügbar. Änderungen in den Einstellungen können nicht übernommen werden.", _
        "Internet-Verbindung nicht möglich!", _
        "Einstellungen schließen.", _
        "", _
        "", _
        Null, _
        False)

    Wait For Msgbox_Result(res As Int)

    If res = DialogResponse.POSITIVE Then
		CloseSettings
	End If

End Sub

Private Sub dprDatum_Click

	'Öffnet den DatePicker und übernimmt das ausgewählte Datum.

	Dim ctxt As JavaObject
	ctxt.InitializeContext

	Dim listener As Object = _
        ctxt.CreateEventFromUI( _
        "android.app.DatePickerDialog$OnDateSetListener", _
        "DateSet", _
        Null)

	Dim dlg As JavaObject

	dlg.InitializeNewInstance( _
        "android.app.DatePickerDialog", _
        Array( _
        ctxt, _
        listener, _
        DPRYEAR, _
        DPRMONTH - 1, _
        DPRDAY))

	dlg.RunMethod("show", Null)

	Wait For DateSet_Event(MethodName As String, Args() As Object)

	If Args.Length >= 4 Then

		DPRYEAR = Args(1)

		Dim mzerobased As Int = Args(2)

		DPRMONTH = mzerobased + 1
		DPRDAY = Args(3)

		Dim ticks As Long = _
            DateUtils_SetDate( _
            DPRYEAR, _
            DPRMONTH, _
            DPRDAY)

		dprDatum.Text = _
            FormatDateCustom(ticks, "dd.MM.yyyy")

		btnAuswahl.TextColor = 0xFF888888

		If dprDatum.Text <> _
            DBGet("VeranstaltungDatum", "") Then

			Dim neu As Boolean = True

			If VERANSTALTUNGEN.IsInitialized Then

				For Each key As String In VERANSTALTUNGEN.Keys

					Dim veranstaltung As Map = _
                        VERANSTALTUNGEN.Get(key)

					Dim datum As String = _
                        veranstaltung.GetDefault("Datum", "-")

					If dprDatum.Text = datum Then

						neu = False

						disableVSTNG

						WEBVIEWVERANSTALTUNG_ID = key

						enableVSTNG

						Exit

					End If

				Next

			End If

			If neu Then

				VERANSTALTUNG_ID = VERANSTALTUNG_NEU_ID
				WEBVIEWVERANSTALTUNG_ID = VERANSTALTUNG_NEU_ID

				disableVSTNG

				tbxAnzahl.Text = "0"

				enableVSTNG

				Dim anzahlplaetze As Int = tbxAnzahl.Text

				If anzahlplaetze > 0 Then

					btnVerstgSpeichern.Enabled = True
					btnVerstgSpeichern.TextColor = COLORGREEN

				End If

				btnVerstgDelete.Enabled = False
				btnVerstgDelete.TextColor = 0xFF888888

				btnAuswahl.TextColor = 0xFF888888

			End If

		End If

	End If

	startTimer

End Sub

Private Sub DateUtils_SetDate(Year As Int, Month As Int, Day As Int) As Long

	'Erzeugt aus Jahr, Monat und Tag einen DateTime-Timestamp.

	Dim oldformat As String = DateTime.DateFormat

	DateTime.DateFormat = "yyyy-MM-dd"

	Dim paddedmonth As String = NumberFormat(Month, 2, 0)
	Dim paddedday As String = NumberFormat(Day, 2, 0)

	Dim ticks As Long = _
        DateTime.DateParse( _
        Year & "-" & _
        paddedmonth & "-" & _
        paddedday)

	DateTime.DateFormat = oldformat

	Return ticks

End Sub

Private Sub btnAuswahl_Click

    'Öffnet die Auswahl der Veranstaltungen.

	'Uhrzeit.Enabled = False
	'Veranstaltung_ID = webviewVSTGN_ID
	'saveDBvstng
	'CloseSettings
	
	TestVeranstaltungsliste

End Sub

Private Sub btnVerstgDelete_Click

	'Löscht die aktuell ausgewählte Veranstaltung
	'nach Bestätigung durch den Benutzer.

	startTimer

	Msgbox2Async( _
        "Die Veranstaltung und deren Wertungsliste werden unwiederbringlich gelöscht! Wirklich löschen?", _
        "Veranstaltung wirklich löschen?", _
        "Löschen", _
        "", _
        "Abbrechen", _
        Null, _
        True)

	Wait For Msgbox_Result(res As Int)

	If res = DialogResponse.POSITIVE Then

		delWertungsliste(WEBVIEWVERANSTALTUNG_ID)

		startTimer

	End If

End Sub

Private Sub btnVerstgSpeichern_Click

	'Speichert die aktuelle Veranstaltung und prüft
	'vorher eine mögliche Reduzierung der Platzanzahl.

	startTimer

	Dim neueplatzanzahl As Int = 0

	If IsNumber(tbxAnzahl.Text) Then
		neueplatzanzahl = tbxAnzahl.Text
	End If

	Dim bisherigeplatzanzahl As Int = 0

	If VERANSTALTUNGEN.IsInitialized And _
        VERANSTALTUNGEN.ContainsKey(VERANSTALTUNG_ID) Then

		Dim veranstaltung As Map = _
            VERANSTALTUNGEN.Get(VERANSTALTUNG_ID)

		bisherigeplatzanzahl = _
            veranstaltung.GetDefault( _
            "Teilnehmerzahl", _
            "0")

	End If

	If neueplatzanzahl < bisherigeplatzanzahl Then

		Msgbox2Async( _
            "Die Anzahl der Plätze wurde reduziert. Werden die geänderten Daten der Veranstaltung gespeichert, gehen ggf. Informationen in der Wertungsliste der Veranstaltung unwiederbringlich verloren.", _
            "Veranstaltung - Plätze", _
            "Trotzdem speichern.", _
            "", _
            "Abbrechen", _
            Null, _
            True)

		Wait For Msgbox_Result(res As Int)

		If res = DialogResponse.POSITIVE Then

			saveVSTNG

			startTimer

		End If

	Else

		saveVSTNG

	End If

End Sub

Private Sub btnTLNDelete_Click

	'Löscht den aktuell ausgewählten Teilnehmer
	'nach Bestätigung durch den Benutzer.

	startTimer

	Msgbox2Async( _
        tbxTeilnehmer.Text & _
        " aus der Liste der Teilnehmer löschen?", _
        "Teilnehmer wirklich löschen?", _
        "Löschen", _
        "", _
        "Abbrechen", _
        Null, _
        True)

	Wait For Msgbox_Result(res As Int)

	If res = DialogResponse.POSITIVE Then

		delTLN(TEILNEHMER_ID)

		startTimer

	End If

End Sub

Private Sub btnTLNSpeichern_Click

	'Speichert den aktuellen Teilnehmer.

	saveTLN

	startTimer

End Sub

Private Sub tbxVeranstaltung_TextChanged(Old As String, New As String)

	'Prüft Änderungen an der Veranstaltungsbezeichnung.

	If DOCHANGE = False Then Return

	DOCHANGE = False

	If tbxVeranstaltung.Enabled Then
		pruefeInhalt
	End If

	DOCHANGE = True

	startTimer

End Sub

Private Sub tbxAnzahl_FocusChanged(HasFocus As Boolean)

	'Positioniert den Cursor am Eingabeende
	'oder blendet die Tastatur aus.

	If HasFocus Then
		tbxAnzahl.SelectionStart = tbxAnzahl.Text.Length
	Else
		HideKeyboard
	End If

End Sub

Private Sub tbxAnzahl_TextChanged(Old As String, New As String)

	'Prüft die Eingabe der Platzanzahl und
	'aktualisiert den Speichern-Status.

	If DOCHANGE = False Then Return

	DOCHANGE = False

	If tbxAnzahl.Enabled Then

		If IsNumber(tbxAnzahl.Text) Then

			Dim wert As Int = Abs(tbxAnzahl.Text)

			tbxAnzahl.Text = wert

		End If

		pruefeInhalt

		tbxAnzahl.SelectionStart = tbxAnzahl.Text.Length

	End If

	DOCHANGE = True

	startTimer

End Sub

Private Sub tbxTeilnehmer_FocusChanged(HasFocus As Boolean)

	'Positioniert den Cursor am Eingabeende
	'oder blendet die Tastatur aus.

	If HasFocus Then
		tbxTeilnehmer.SelectionStart = tbxTeilnehmer.Text.Length
	Else
		HideKeyboard
	End If

End Sub

Private Sub tbxTeilnehmer_TextChanged(Old As String, New As String)

	'Bereinigt die Eingabe und steuert die
	'Freigabe der Teilnehmer-Speicherung.

	If DOCHANGE = False Then Return

	DOCHANGE = False

	Dim cleaned As String = _
        Regex.Replace( _
        "[^a-zA-Z0-9äöüÄÖÜßéèêëáàâçñ -]", _
        tbxTeilnehmer.Text, _
        "")

	Dim sb As StringBuilder
	sb.Initialize

	Dim doupper As Boolean = True

	For i = 0 To cleaned.Length - 1

		Dim letter As String = _
            cleaned.SubString2(i, i + 1)

		If letter = " " Or letter = "-" Then

			doupper = True
			sb.Append(letter)

		Else If letter = "," Then

			'Komma entfernen

		Else If doupper Then

			sb.Append(letter.ToUpperCase)
			doupper = False

		Else

			sb.Append(letter)

		End If

	Next

	tbxTeilnehmer.Text = sb.ToString

	btnTLNDelete.Enabled = False
	btnTLNDelete.TextColor = 0xFF888888

	If tbxTeilnehmer.Text.Length >= 3 Then

		btnTLNSpeichern.Enabled = True
		btnTLNSpeichern.TextColor = COLORGREEN

	Else

		btnTLNSpeichern.Enabled = False
		btnTLNSpeichern.TextColor = 0xFF888888

	End If

	DOCHANGE = True

	tbxTeilnehmer.SelectionStart = tbxTeilnehmer.Text.Length

	startTimer

End Sub

Private Sub startTimer

	'Startet den Inaktivitäts-Timer neu.

	UHRZEIT.Enabled = False
	UHRZEIT.Interval = 1000 * 300
	UHRZEIT.Enabled = True

End Sub

Private Sub Uhrzeit_Tick

	'Öffnet nach Ablauf der Inaktivitätszeit
	'den Bildschirmschoner.

	UHRZEIT.Enabled = False

	B4XPages.ShowPage("ScreenSaver")

End Sub

Private Sub FormatDateCustom(ticks As Long, pattern As String) As String

	'Formatiert einen DateTime-Wert mit dem
	'übergebenen Datumsformat.

	Dim oldformat As String = DateTime.DateFormat

	DateTime.DateFormat = pattern

	Dim result As String = DateTime.Date(ticks)

	DateTime.DateFormat = oldformat

	Return result

End Sub

Private Sub HideKeyboard

	'Blendet die Bildschirmtastatur aus.

	Dim phone As Phone

	phone.HideKeyboard(B4XPages.GetNativeParent(Me))

End Sub

Private Sub LoadTinyDB

	'Lädt die lokal gespeicherten Vereinsdaten.

	If File.Exists(File.DirInternal, DBDATEINAME) Then
		DBVEREIN = File.ReadMap(File.DirInternal, DBDATEINAME)
	Else
		DBVEREIN.Initialize
	End If

End Sub

Private Sub DBPut(Key As String, Value As Object)

	'Speichert einen Wert im lokalen Datenbestand.

	If Value Is Map Then

		Dim jg As JSONGenerator
		jg.Initialize(Value)

		DBVEREIN.Put( _
            Key, _
            "JSON_MAP:" & jg.ToString)

	Else If Value Is List Then

		Dim jg As JSONGenerator
		jg.Initialize2(Value)

		DBVEREIN.Put( _
            Key, _
            "JSON_LIST:" & jg.ToString)

	Else

		DBVEREIN.Put(Key, Value)

	End If

	File.WriteMap( _
        File.DirInternal, _
        DBDATEINAME, _
        DBVEREIN)

End Sub

Private Sub DBGet(Key As String, DefaultValue As Object) As Object

	'Liest einen Wert aus dem lokalen Datenbestand.

	If DBVEREIN.ContainsKey(Key) = False Then
		Return DefaultValue
	End If

	Dim value As String = DBVEREIN.Get(Key)

	If value.StartsWith("JSON_MAP:") Then

		Dim jp As JSONParser

		jp.Initialize(value.SubString(9))

		Return jp.NextObject

	Else If value.StartsWith("JSON_LIST:") Then

		Dim jp As JSONParser

		jp.Initialize(value.SubString(10))

		Return jp.NextArray

	End If

	Return value

End Sub

Private Sub ZeigeVeranstaltungenCLV

    'Erzeugt die Anzeige der Veranstaltungsliste.

    lstVeranstaltungen.Clear

    For Each key As String In VERANSTALTUNGEN.Keys

    Next

End Sub

Private Sub CLVVeranstaltungen_ItemClick(Index As Int, Value As Object)

	'Übernimmt die ausgewählte Veranstaltung.

	WEBVIEWVERANSTALTUNG_ID = Value

	setzeVeranstaltung(WEBVIEWVERANSTALTUNG_ID)

End Sub

Private Sub ZeigeTeilnehmerCLV

	'Erzeugt die Anzeige der Teilnehmerliste.

	lstTeilnehmer.Clear

	For i = 0 To TEILNEHMER.Size - 1 Step 2

		If i + 1 < TEILNEHMER.Size Then

			'lstTeilnehmer.AddSingleLine2( _
			'    TEILNEHMER.Get(i), _
			'    TEILNEHMER.Get(i + 1))

		End If

	Next

End Sub

Private Sub CLVTeilnehmer_ItemClick(Index As Int, Value As Object)

	'Übernimmt den ausgewählten Teilnehmer.

	TEILNEHMER_ID = Value

	setzeTeilnehmer(TEILNEHMER_ID)

End Sub


Private Sub lstVeranstaltungen_ItemClick(Position As Int, Value As Object)

	'Übernimmt die ausgewählte Veranstaltung.

	WEBVIEWVERANSTALTUNG_ID = Value

	setzeVeranstaltung(WEBVIEWVERANSTALTUNG_ID)

End Sub

Private Sub TestVeranstaltungsliste

	'Erzeugt Testdaten für die Darstellung der
	'Veranstaltungs- und Teilnehmerlisten.

	lstVeranstaltungen.Clear

	Dim panel As B4XView

	panel = CreateVeranstaltungRow("Datum", "Bezeichnung")

	lstVeranstaltungen.Add(panel, 1)

	Dim pnlrow As Panel = panel.GetView(0)

	Dim lbldatum As Label = pnlrow.GetView(0)

	lbldatum.Color = COLORGREEN
	lbldatum.TextColor = 0xFFFFFFFF
	lbldatum.Typeface = Typeface.DEFAULT_BOLD

	Dim lblveranstaltung As Label = pnlrow.GetView(1)

	lblveranstaltung.Color = COLORGREEN
	lblveranstaltung.TextColor = 0xFFFFFFFF
	lblveranstaltung.Gravity = _
        Gravity.CENTER_HORIZONTAL + Gravity.CENTER_VERTICAL

	lblveranstaltung.Padding = _
        Array As Int(5dip, 5dip, 5dip, 5dip)

	lblveranstaltung.Typeface = Typeface.DEFAULT_BOLD

	For i = 2 To 9

		lstVeranstaltungen.Add( _
            CreateVeranstaltungRow( _
            $"0${i}.05.2026"$, _
            $"Veranstaltung ${i - 1}"$), _
            i)

	Next

	lstTeilnehmer.Clear

	Dim anzahlteilnehmer As Int = 10

	panel = CreateTeilnehmerRow( _
        "Teilnehmer (" & anzahlteilnehmer & ")")

	lstTeilnehmer.Add(panel, 1)

	pnlrow = panel.GetView(0)

	Dim lblteilnehmer As Label = pnlrow.GetView(0)

	lblteilnehmer.Color = COLORGREEN
	lblteilnehmer.TextColor = 0xFFFFFFFF
	lblteilnehmer.Typeface = Typeface.DEFAULT_BOLD

	lblteilnehmer.Gravity = _
        Gravity.CENTER_HORIZONTAL + Gravity.CENTER_VERTICAL

	For i = 2 To anzahlteilnehmer - 1

		lstTeilnehmer.Add( _
            CreateTeilnehmerRow( _
            $"Name Vorname ${i - 1}"$), _
            i)

	Next

	UpdateLayout

	lstViewVeranstaltung_markiereZeile(2)
	lstViewTeilnehmer_markiereZeile(2)

End Sub

Private Sub CreateVeranstaltungRow(Datum As String, Name As String) As B4XView

	'Erzeugt eine Zeile für die Veranstaltungsliste.

	Dim panel As B4XView = xui.CreatePanel("")

	panel.SetLayoutAnimated( _
        0, _
        0, _
        0, _
        lstVeranstaltungen.AsView.Width, _
        26dip)

	panel.LoadLayout("rowVeranstaltung")

	Dim row As Panel = panel.GetView(0)

	panel.SetLayoutAnimated( _
        0, _
        0, _
        0, _
        lstVeranstaltungen.AsView.Width, _
        row.Height)

	Dim lblDatum As Label = row.GetView(0)

	lblDatum.Typeface = Typeface.DEFAULT
	lblDatum.TextColor = 0xFF000000
	lblDatum.Padding = Array As Int(5dip, 5dip, 5dip, 5dip)

	Dim lblVeranstaltung As Label = row.GetView(1)

	lblDatum.Text = Datum
	lblVeranstaltung.Text = Name

	lblVeranstaltung.Gravity = _
        Gravity.LEFT + Gravity.CENTER_VERTICAL

	lblVeranstaltung.Typeface = Typeface.DEFAULT
	lblVeranstaltung.TextColor = 0xFF000000
	lblVeranstaltung.Padding = Array As Int(5dip, 5dip, 5dip, 5dip)

	Return panel

End Sub

Private Sub CreateTeilnehmerRow(Name As String) As B4XView

	'Erzeugt eine Zeile für die Teilnehmerliste.

	Dim panel As B4XView = xui.CreatePanel("")

	panel.SetLayoutAnimated( _
        0, _
        0, _
        0, _
        lstTeilnehmer.AsView.Width, _
        26dip)

	panel.LoadLayout("rowTeilnehmer")

	Dim row As Panel = panel.GetView(0)

	panel.SetLayoutAnimated( _
        0, _
        0, _
        0, _
        lstTeilnehmer.AsView.Width, _
        row.Height)

	Dim lblteilnehmer As Label = row.GetView(0)

	lblteilnehmer.Typeface = Typeface.DEFAULT
	lblteilnehmer.TextColor = 0xFF000000
	lblteilnehmer.Padding = _
        Array As Int(5dip, 5dip, 5dip, 5dip)

	lblteilnehmer.Text = Name

	Return panel

End Sub

Private Sub UpdateLayout

	'Passt die Höhen der Listen und die Positionen
	'der nachfolgenden Bereiche dynamisch an.

	Dim veranstaltungshoehe As Int = _
        lstVeranstaltungen.sv.ScrollViewContentHeight

	veranstaltungshoehe = _
        Max( _
        veranstaltungshoehe, _
        DEFAULTVERANSTALTUNGSLISTENHOEHE)

	lstVeranstaltungen.AsView.Height = veranstaltungshoehe

	lstVeranstaltungen.Base_Resize( _
        lstVeranstaltungen.AsView.Width, _
        veranstaltungshoehe)

	Dim neueroberrand As Int = _
        lstVeranstaltungen.AsView.Top + _
        lstVeranstaltungen.AsView.Height + _
        5dip

	Dim verschiebung As Int = _
        neueroberrand - pnlTeilnehmer.Top

	pnlTeilnehmer.Top = neueroberrand

	lstTeilnehmer.AsView.Top = _
        lstTeilnehmer.AsView.Top + verschiebung

	Dim teilnehmerhoehe As Int = _
        lstTeilnehmer.sv.ScrollViewContentHeight

	teilnehmerhoehe = _
        Max( _
        teilnehmerhoehe, _
        DEFAULTTEILNEHMERLISTENHOEHE)

	lstTeilnehmer.AsView.Height = teilnehmerhoehe

	lstTeilnehmer.Base_Resize( _
        lstTeilnehmer.AsView.Width, _
        teilnehmerhoehe)

	svMain.Panel.Height = _
        lstTeilnehmer.AsView.Top + _
        lstTeilnehmer.AsView.Height + _
        20dip

End Sub

Private Sub lstViewVeranstaltung_markiereZeile(Zeile As Int)

	'Markiert eine Zeile in der Veranstaltungsliste.

	Dim index As Int = Zeile - 1

	If index < 0 Or index >= lstVeranstaltungen.Size Then Return

	Dim panelzeile As B4XView = _
        lstVeranstaltungen.GetPanel(index)

	Dim basispanel As B4XView = _
        panelzeile.GetView(0)

	Dim lblDatum As Label = _
        basispanel.GetView(0)

	lblDatum.Color = 0xFFFFCC99

	Dim lblVeranstaltung As Label = _
        basispanel.GetView(1)

	lblVeranstaltung.Color = 0xFFFFCC99

End Sub

Private Sub lstViewTeilnehmer_markiereZeile(Zeile As Int)

	'Markiert eine Zeile in der Teilnehmerliste.

	Dim index As Int = Zeile - 1

	If index < 0 Or index >= lstTeilnehmer.Size Then Return

	Dim panelzeile As B4XView = _
        lstTeilnehmer.GetPanel(index)

	Dim basispanel As B4XView = _
        panelzeile.GetView(0)

	Dim lblteilnehmer As Label = _
        basispanel.GetView(0)

	lblteilnehmer.Color = 0xFFFFCC99

End Sub