B4A=true
Group=WertungslistenAppV2
ModulesStructureVersion=1
Type=Class
Version=12.8
@EndOfDesignText@
' B4XPage: ScreenSaver (konvertiert aus ScreenSaver.scm & ScreenSaver.bky)
' Benötigte Bibliotheken: B4XPages, XUI, JavaObject

Sub Class_Globals
	Private Root As B4XView
	Private xui As XUI
	
	' --- Globale Variablen (aus ScreenSaver.bky) ---
	Public Status As Map
	
	' --- UI-Komponenten (aus ScreenSaver.scm) ---
	Private Label1 As Label
	Private btnLogin As Button
	
	' --- Nicht-sichtbare Komponenten ---
	Private ion As Object
End Sub

Public Sub Initialize
	Status.Initialize
End Sub

Private Sub B4XPage_Created (Root1 As B4XView)
	Root = Root1
	B4XPages.SetTitle(Me, "Wertungslisten-App by sthnet.de")
	BuildUI
End Sub

Public Sub B4XPage_Appear
	If B4XPages.MainPage.Status.IsInitialized And B4XPages.MainPage.Status.Size > 0 Then
		Status = B4XPages.MainPage.Status
	End If
End Sub

Private Sub B4XPage_CloseRequest As ResumableSub
	Return False
End Sub

' ==============================================================================
' 1. UI-AUFBAU (1:1 aus ScreenSaver.scm)
' ==============================================================================
Private Sub BuildUI
	Root.Color = 0xFF222222
	
	Label1.Initialize("")
	Label1.Text = "Erneute Anmeldung erforderlich ..."
	Label1.TextSize = 16
	Label1.Typeface = Typeface.DEFAULT_BOLD
	Label1.TextColor = Colors.White
	Label1.Gravity = Gravity.CENTER
	Root.AddView(Label1, 0, 25dip, 100%x, 40dip)
	
	btnLogin.Initialize("btnLogin")
	If File.Exists(File.DirAssets, "Fingerprint.png") Then
		btnLogin.SetBackgroundImage(LoadBitmap(File.DirAssets, "Fingerprint.png"))
	Else
		btnLogin.Text = "🔒"
		btnLogin.TextSize = 24
		btnLogin.TextColor = Colors.White
		btnLogin.Color = 0xFF444444
	End If
	Root.AddView(btnLogin, (100%x - 64dip) / 2, 100%y - 89dip, 64dip, 64dip)
	
	Dim xv As B4XView = btnLogin
	xv.SetColorAndBorder(xv.Color, 0, 0, 32dip)
End Sub

' ==============================================================================
' 2. EVENTS & GERÄTE-ENTSPERRUNG (CONFIRM_DEVICE_CREDENTIAL)
' ==============================================================================
Private Sub btnLogin_Down
	StartConfirmDeviceCredential
End Sub

Private Sub StartConfirmDeviceCredential
	Try
		Dim i As Intent
		i.Initialize("android.app.action.CONFIRM_DEVICE_CREDENTIAL", "")
		StartActivityForResult(i)
	Catch
		Log("StartConfirmDeviceCredential Fehler: " & LastException.Message)
		B4XPages.MainPage.Status = Status
		B4XPages.ClosePage(Me)
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
		B4XPages.MainPage.Status = Status
		B4XPages.ClosePage(Me)
	End If
	Return Null
End Sub

Private Sub GetBA As Object
	Dim jo As JavaObject
	jo.InitializeStatic(Application.PackageName & ".main")
	Return jo.GetField("processBA")
End Sub
