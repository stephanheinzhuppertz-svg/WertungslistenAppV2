package b4a.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class b4xmainpage_subs_0 {


public static RemoteObject  _addteilnehmer(RemoteObject __ref,RemoteObject _teilnehmerliste,RemoteObject _teilnehmer) throws Exception{
try {
		Debug.PushSubsStack("addTeilnehmer (b4xmainpage) ","b4xmainpage",1,__ref.getField(false, "ba"),__ref,540);
if (RapidSub.canDelegate("addteilnehmer")) { return __ref.runUserSub(false, "b4xmainpage","addteilnehmer", __ref, _teilnehmerliste, _teilnehmer);}
RemoteObject _dbteilnehmer = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _item = RemoteObject.createImmutable("");
RemoteObject _nextnum = RemoteObject.createImmutable(0);
RemoteObject _dbkey = RemoteObject.createImmutable("");
RemoteObject _vid = RemoteObject.createImmutable("");
RemoteObject _url = RemoteObject.createImmutable("");
RemoteObject _jg = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.JSONParser.JSONGenerator");
Debug.locals.put("Teilnehmerliste", _teilnehmerliste);
Debug.locals.put("Teilnehmer", _teilnehmer);
 BA.debugLineNum = 540;BA.debugLine="Private Sub addTeilnehmer(Teilnehmerliste As Map,";
Debug.ShouldStop(134217728);
 BA.debugLineNum = 541;BA.debugLine="Dim dbTeilnehmer As List = DBGet(\"Teilnehmer\", Nu";
Debug.ShouldStop(268435456);
_dbteilnehmer = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_dbteilnehmer = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.List"), __ref.runClassMethod (b4a.example.b4xmainpage.class, "_dbget" /*RemoteObject*/ ,(Object)(BA.ObjectToString("Teilnehmer")),(Object)(b4xmainpage.__c.getField(false,"Null"))));Debug.locals.put("dbteilnehmer", _dbteilnehmer);Debug.locals.put("dbTeilnehmer", _dbteilnehmer);
 BA.debugLineNum = 542;BA.debugLine="If dbTeilnehmer <> Null And dbTeilnehmer.IsInitia";
Debug.ShouldStop(536870912);
if (RemoteObject.solveBoolean("N",_dbteilnehmer) && RemoteObject.solveBoolean(".",_dbteilnehmer.runMethod(true,"IsInitialized"))) { 
 BA.debugLineNum = 543;BA.debugLine="For Each item As String In dbTeilnehmer";
Debug.ShouldStop(1073741824);
{
final RemoteObject group3 = _dbteilnehmer;
final int groupLen3 = group3.runMethod(true,"getSize").<Integer>get()
;int index3 = 0;
;
for (; index3 < groupLen3;index3++){
_item = BA.ObjectToString(group3.runMethod(false,"Get",index3));Debug.locals.put("item", _item);
Debug.locals.put("item", _item);
 BA.debugLineNum = 544;BA.debugLine="If Teilnehmer.IndexOf(item.Trim) = -1 Then";
Debug.ShouldStop(-2147483648);
if (RemoteObject.solveBoolean("=",_teilnehmer.runMethod(true,"IndexOf",(Object)((_item.runMethod(true,"trim")))),BA.numberCast(double.class, -(double) (0 + 1)))) { 
 BA.debugLineNum = 545;BA.debugLine="Dim nextNum As Int = TLNlastID.Replace(\"t\", \"\"";
Debug.ShouldStop(1);
_nextnum = BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {BA.numberCast(double.class, __ref.getField(true,"_tlnlastid" /*RemoteObject*/ ).runMethod(true,"replace",(Object)(BA.ObjectToString("t")),(Object)(RemoteObject.createImmutable("")))),RemoteObject.createImmutable(1)}, "+",1, 0));Debug.locals.put("nextnum", _nextnum);Debug.locals.put("nextNum", _nextnum);
 BA.debugLineNum = 546;BA.debugLine="Dim DBkey As String = \"t\" & nextNum";
Debug.ShouldStop(2);
_dbkey = RemoteObject.concat(RemoteObject.createImmutable("t"),_nextnum);Debug.locals.put("dbkey", _dbkey);Debug.locals.put("DBkey", _dbkey);
 BA.debugLineNum = 547;BA.debugLine="TLNlastID = DBkey";
Debug.ShouldStop(4);
__ref.setField ("_tlnlastid" /*RemoteObject*/ ,_dbkey);
 BA.debugLineNum = 548;BA.debugLine="Teilnehmerliste.Put(DBkey, CreateMap(\"Name\": i";
Debug.ShouldStop(8);
_teilnehmerliste.runVoidMethod ("Put",(Object)((_dbkey)),(Object)((b4xmainpage.__c.runMethod(false, "createMap", (Object)(new RemoteObject[] {RemoteObject.createImmutable(("Name")),(_item.runMethod(true,"trim"))})).getObject())));
 };
 }
}Debug.locals.put("item", _item);
;
 };
 BA.debugLineNum = 553;BA.debugLine="If Teilnehmerliste.Size > 0 Then";
Debug.ShouldStop(256);
if (RemoteObject.solveBoolean(">",_teilnehmerliste.runMethod(true,"getSize"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 554;BA.debugLine="Dim vID As String = DBGet(\"VereinsID\", \"[...]\")";
Debug.ShouldStop(512);
_vid = BA.ObjectToString(__ref.runClassMethod (b4a.example.b4xmainpage.class, "_dbget" /*RemoteObject*/ ,(Object)(BA.ObjectToString("VereinsID")),(Object)((RemoteObject.createImmutable("[...]")))));Debug.locals.put("vid", _vid);Debug.locals.put("vID", _vid);
 BA.debugLineNum = 555;BA.debugLine="Dim url As String = URLteilnehmer.Replace(\"[...]";
Debug.ShouldStop(1024);
_url = RemoteObject.concat(__ref.getField(true,"_urlteilnehmer" /*RemoteObject*/ ).runMethod(true,"replace",(Object)(BA.ObjectToString("[...]")),(Object)(_vid)),RemoteObject.createImmutable(".json?auth="),__ref.getField(false,"_status" /*RemoteObject*/ ).runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("idToken"))),(Object)((RemoteObject.createImmutable("")))));Debug.locals.put("url", _url);Debug.locals.put("url", _url);
 BA.debugLineNum = 556;BA.debugLine="Dim jg As JSONGenerator";
Debug.ShouldStop(2048);
_jg = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.JSONParser.JSONGenerator");Debug.locals.put("jg", _jg);
 BA.debugLineNum = 557;BA.debugLine="jg.Initialize(Teilnehmerliste)";
Debug.ShouldStop(4096);
_jg.runVoidMethod ("Initialize",(Object)(_teilnehmerliste));
 BA.debugLineNum = 558;BA.debugLine="SendHttpRequest(\"addTLN\", \"PUT\", url, jg.ToStrin";
Debug.ShouldStop(8192);
__ref.runClassMethod (b4a.example.b4xmainpage.class, "_sendhttprequest" /*void*/ ,(Object)(BA.ObjectToString("addTLN")),(Object)(BA.ObjectToString("PUT")),(Object)(_url),(Object)(_jg.runMethod(true,"ToString")),(Object)(RemoteObject.createImmutable("application/json")));
 };
 BA.debugLineNum = 560;BA.debugLine="End Sub";
Debug.ShouldStop(32768);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static void  _b4xpage_created(RemoteObject __ref,RemoteObject _root1) throws Exception{
try {
		Debug.PushSubsStack("B4XPage_Created (b4xmainpage) ","b4xmainpage",1,__ref.getField(false, "ba"),__ref,66);
if (RapidSub.canDelegate("b4xpage_created")) { __ref.runUserSub(false, "b4xmainpage","b4xpage_created", __ref, _root1); return;}
ResumableSub_B4XPage_Created rsub = new ResumableSub_B4XPage_Created(null,__ref,_root1);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_B4XPage_Created extends BA.ResumableSub {
public ResumableSub_B4XPage_Created(b4a.example.b4xmainpage parent,RemoteObject __ref,RemoteObject _root1) {
this.parent = parent;
this.__ref = __ref;
this._root1 = _root1;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4a.example.b4xmainpage parent;
RemoteObject _root1;

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("B4XPage_Created (b4xmainpage) ","b4xmainpage",1,__ref.getField(false, "ba"),__ref,66);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
;
Debug.locals.put("Root1", _root1);
 BA.debugLineNum = 67;BA.debugLine="Root = Root1";
Debug.ShouldStop(4);
__ref.setField ("_root" /*RemoteObject*/ ,_root1);
 BA.debugLineNum = 68;BA.debugLine="B4XPages.SetTitle(Me, \"Wertungslisten-App by sthn";
Debug.ShouldStop(8);
parent._b4xpages.runVoidMethod ("_settitle" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(__ref),(Object)((RemoteObject.createImmutable("Wertungslisten-App by sthnet.de"))));
 BA.debugLineNum = 71;BA.debugLine="PageMain.Initialize";
Debug.ShouldStop(64);
__ref.getField(false,"_pagemain" /*RemoteObject*/ ).runClassMethod (b4a.example.screenmain.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"));
 BA.debugLineNum = 72;BA.debugLine="B4XPages.AddPage(\"ScreenMain\", PageMain)";
Debug.ShouldStop(128);
parent._b4xpages.runVoidMethod ("_addpage" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(BA.ObjectToString("ScreenMain")),(Object)((__ref.getField(false,"_pagemain" /*RemoteObject*/ ))));
 BA.debugLineNum = 74;BA.debugLine="PageSettings.Initialize";
Debug.ShouldStop(512);
__ref.getField(false,"_pagesettings" /*RemoteObject*/ ).runClassMethod (b4a.example.settings.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"));
 BA.debugLineNum = 75;BA.debugLine="B4XPages.AddPage(\"Settings\", PageSettings)";
Debug.ShouldStop(1024);
parent._b4xpages.runVoidMethod ("_addpage" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(BA.ObjectToString("Settings")),(Object)((__ref.getField(false,"_pagesettings" /*RemoteObject*/ ))));
 BA.debugLineNum = 77;BA.debugLine="PageSaver.Initialize";
Debug.ShouldStop(4096);
__ref.getField(false,"_pagesaver" /*RemoteObject*/ ).runClassMethod (b4a.example.screensaver.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"));
 BA.debugLineNum = 78;BA.debugLine="B4XPages.AddPage(\"ScreenSaver\", PageSaver)";
Debug.ShouldStop(8192);
parent._b4xpages.runVoidMethod ("_addpage" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(BA.ObjectToString("ScreenSaver")),(Object)((__ref.getField(false,"_pagesaver" /*RemoteObject*/ ))));
 BA.debugLineNum = 81;BA.debugLine="BuildUI";
Debug.ShouldStop(65536);
__ref.runClassMethod (b4a.example.b4xmainpage.class, "_buildui" /*RemoteObject*/ );
 BA.debugLineNum = 84;BA.debugLine="Uhrzeit.Enabled = False";
Debug.ShouldStop(524288);
__ref.getField(false,"_uhrzeit" /*RemoteObject*/ ).runMethod(true,"setEnabled",parent.__c.getField(true,"False"));
 BA.debugLineNum = 85;BA.debugLine="refreshToken = DBGet(\"refreshToken\", \"\")";
Debug.ShouldStop(1048576);
__ref.setField ("_refreshtoken" /*RemoteObject*/ ,BA.ObjectToString(__ref.runClassMethod (b4a.example.b4xmainpage.class, "_dbget" /*RemoteObject*/ ,(Object)(BA.ObjectToString("refreshToken")),(Object)((RemoteObject.createImmutable(""))))));
 BA.debugLineNum = 86;BA.debugLine="idToken = DBGet(\"idToken\", \"\")";
Debug.ShouldStop(2097152);
__ref.setField ("_idtoken" /*RemoteObject*/ ,BA.ObjectToString(__ref.runClassMethod (b4a.example.b4xmainpage.class, "_dbget" /*RemoteObject*/ ,(Object)(BA.ObjectToString("idToken")),(Object)((RemoteObject.createImmutable(""))))));
 BA.debugLineNum = 88;BA.debugLine="Status.Put(\"refreshToken\", refreshToken)";
Debug.ShouldStop(8388608);
__ref.getField(false,"_status" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("refreshToken"))),(Object)((__ref.getField(true,"_refreshtoken" /*RemoteObject*/ ))));
 BA.debugLineNum = 89;BA.debugLine="Status.Put(\"idToken\", idToken)";
Debug.ShouldStop(16777216);
__ref.getField(false,"_status" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("idToken"))),(Object)((__ref.getField(true,"_idtoken" /*RemoteObject*/ ))));
 BA.debugLineNum = 90;BA.debugLine="Status.Put(\"debug\", debug)";
Debug.ShouldStop(33554432);
__ref.getField(false,"_status" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("debug"))),(Object)((__ref.getField(true,"_debug" /*RemoteObject*/ ))));
 BA.debugLineNum = 91;BA.debugLine="Status.Put(\"ProgOffline\", False)";
Debug.ShouldStop(67108864);
__ref.getField(false,"_status" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("ProgOffline"))),(Object)((parent.__c.getField(true,"False"))));
 BA.debugLineNum = 93;BA.debugLine="colorgreen = LabelLoading.TextColor";
Debug.ShouldStop(268435456);
__ref.setField ("_colorgreen" /*RemoteObject*/ ,__ref.getField(false,"_labelloading" /*RemoteObject*/ ).runMethod(true,"getTextColor"));
 BA.debugLineNum = 94;BA.debugLine="ignoreTextEvents = True";
Debug.ShouldStop(536870912);
__ref.setField ("_ignoretextevents" /*RemoteObject*/ ,parent.__c.getField(true,"True"));
 BA.debugLineNum = 95;BA.debugLine="tbxEmail.Text = \"\"";
Debug.ShouldStop(1073741824);
__ref.getField(false,"_tbxemail" /*RemoteObject*/ ).runMethodAndSync(true,"setText",BA.ObjectToCharSequence(""));
 BA.debugLineNum = 96;BA.debugLine="TextBoxPassword.Text = \"\"";
Debug.ShouldStop(-2147483648);
__ref.getField(false,"_textboxpassword" /*RemoteObject*/ ).runMethodAndSync(true,"setText",BA.ObjectToCharSequence(""));
 BA.debugLineNum = 97;BA.debugLine="ignoreTextEvents = False";
Debug.ShouldStop(1);
__ref.setField ("_ignoretextevents" /*RemoteObject*/ ,parent.__c.getField(true,"False"));
 BA.debugLineNum = 99;BA.debugLine="If refreshToken <> \"\" And idToken <> \"\" Then";
Debug.ShouldStop(4);
if (true) break;

case 1:
//if
this.state = 6;
if (RemoteObject.solveBoolean("!",__ref.getField(true,"_refreshtoken" /*RemoteObject*/ ),BA.ObjectToString("")) && RemoteObject.solveBoolean("!",__ref.getField(true,"_idtoken" /*RemoteObject*/ ),BA.ObjectToString(""))) { 
this.state = 3;
}else {
this.state = 5;
}if (true) break;

case 3:
//C
this.state = 6;
 BA.debugLineNum = 100;BA.debugLine="VerticalArrangementLoading.Visible = False";
Debug.ShouldStop(8);
__ref.getField(false,"_verticalarrangementloading" /*RemoteObject*/ ).runMethod(true,"setVisible",parent.__c.getField(true,"False"));
 BA.debugLineNum = 101;BA.debugLine="VerticalArrangementLogin.Visible = False";
Debug.ShouldStop(16);
__ref.getField(false,"_verticalarrangementlogin" /*RemoteObject*/ ).runMethod(true,"setVisible",parent.__c.getField(true,"False"));
 BA.debugLineNum = 102;BA.debugLine="VerticalArrangementVereine.Visible = False";
Debug.ShouldStop(32);
__ref.getField(false,"_verticalarrangementvereine" /*RemoteObject*/ ).runMethod(true,"setVisible",parent.__c.getField(true,"False"));
 BA.debugLineNum = 104;BA.debugLine="Sleep(150)";
Debug.ShouldStop(128);
parent.__c.runVoidMethod ("Sleep",__ref.getField(false, "ba"),anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "b4xmainpage", "b4xpage_created"),BA.numberCast(int.class, 150));
this.state = 7;
return;
case 7:
//C
this.state = 6;
;
 BA.debugLineNum = 105;BA.debugLine="StartConfirmDeviceCredential";
Debug.ShouldStop(256);
__ref.runClassMethod (b4a.example.b4xmainpage.class, "_startconfirmdevicecredential" /*RemoteObject*/ );
 if (true) break;

case 5:
//C
this.state = 6;
 BA.debugLineNum = 107;BA.debugLine="VerticalArrangementLoading.Visible = False";
Debug.ShouldStop(1024);
__ref.getField(false,"_verticalarrangementloading" /*RemoteObject*/ ).runMethod(true,"setVisible",parent.__c.getField(true,"False"));
 BA.debugLineNum = 108;BA.debugLine="VerticalArrangementLogin.Visible = True";
Debug.ShouldStop(2048);
__ref.getField(false,"_verticalarrangementlogin" /*RemoteObject*/ ).runMethod(true,"setVisible",parent.__c.getField(true,"True"));
 if (true) break;

case 6:
//C
this.state = -1;
;
 BA.debugLineNum = 111;BA.debugLine="btnVnOK.Enabled = False";
Debug.ShouldStop(16384);
__ref.getField(false,"_btnvnok" /*RemoteObject*/ ).runMethod(true,"setEnabled",parent.__c.getField(true,"False"));
 BA.debugLineNum = 112;BA.debugLine="btnVnOK.TextColor = 0xFF888888";
Debug.ShouldStop(32768);
__ref.getField(false,"_btnvnok" /*RemoteObject*/ ).runMethod(true,"setTextColor",BA.numberCast(int.class, ((int)0xff888888)));
 BA.debugLineNum = 114;BA.debugLine="End Sub";
Debug.ShouldStop(131072);
if (true) break;

            }
        }
    }
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}
public static RemoteObject  _btnfyeo_click(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("btnFyeo_Click (b4xmainpage) ","b4xmainpage",1,__ref.getField(false, "ba"),__ref,283);
if (RapidSub.canDelegate("btnfyeo_click")) { return __ref.runUserSub(false, "b4xmainpage","btnfyeo_click", __ref);}
 BA.debugLineNum = 283;BA.debugLine="Private Sub btnFyeo_Click";
Debug.ShouldStop(67108864);
 BA.debugLineNum = 284;BA.debugLine="ignoreTextEvents = True";
Debug.ShouldStop(134217728);
__ref.setField ("_ignoretextevents" /*RemoteObject*/ ,b4xmainpage.__c.getField(true,"True"));
 BA.debugLineNum = 285;BA.debugLine="passwordVisible = Not(passwordVisible)";
Debug.ShouldStop(268435456);
__ref.setField ("_passwordvisible" /*RemoteObject*/ ,b4xmainpage.__c.runMethod(true,"Not",(Object)(__ref.getField(true,"_passwordvisible" /*RemoteObject*/ ))));
 BA.debugLineNum = 286;BA.debugLine="TextBoxPassword.PasswordMode = Not(passwordVisibl";
Debug.ShouldStop(536870912);
__ref.getField(false,"_textboxpassword" /*RemoteObject*/ ).runVoidMethod ("setPasswordMode",b4xmainpage.__c.runMethod(true,"Not",(Object)(__ref.getField(true,"_passwordvisible" /*RemoteObject*/ ))));
 BA.debugLineNum = 287;BA.debugLine="TextBoxPassword.SelectionStart = TextBoxPassword.";
Debug.ShouldStop(1073741824);
__ref.getField(false,"_textboxpassword" /*RemoteObject*/ ).runMethod(true,"setSelectionStart",__ref.getField(false,"_textboxpassword" /*RemoteObject*/ ).runMethod(true,"getText").runMethod(true,"length"));
 BA.debugLineNum = 288;BA.debugLine="ignoreTextEvents = False";
Debug.ShouldStop(-2147483648);
__ref.setField ("_ignoretextevents" /*RemoteObject*/ ,b4xmainpage.__c.getField(true,"False"));
 BA.debugLineNum = 289;BA.debugLine="End Sub";
Debug.ShouldStop(1);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _btnlogin_click(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("btnLogin_Click (b4xmainpage) ","b4xmainpage",1,__ref.getField(false, "ba"),__ref,310);
if (RapidSub.canDelegate("btnlogin_click")) { return __ref.runUserSub(false, "b4xmainpage","btnlogin_click", __ref);}
RemoteObject _url = RemoteObject.createImmutable("");
RemoteObject _bodymap = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _jg = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.JSONParser.JSONGenerator");
 BA.debugLineNum = 310;BA.debugLine="Private Sub btnLogin_Click";
Debug.ShouldStop(2097152);
 BA.debugLineNum = 311;BA.debugLine="HideKeyboard";
Debug.ShouldStop(4194304);
__ref.runClassMethod (b4a.example.b4xmainpage.class, "_hidekeyboard" /*RemoteObject*/ );
 BA.debugLineNum = 312;BA.debugLine="Dim url As String = \"https://identitytoolkit.goog";
Debug.ShouldStop(8388608);
_url = RemoteObject.concat(RemoteObject.createImmutable("https://identitytoolkit.googleapis.com/v1/accounts:signInWithPassword?key="),__ref.getField(true,"_apikey" /*RemoteObject*/ ));Debug.locals.put("url", _url);Debug.locals.put("url", _url);
 BA.debugLineNum = 314;BA.debugLine="Dim bodyMap As Map = CreateMap( _ 		\"email\": tbxE";
Debug.ShouldStop(33554432);
_bodymap = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_bodymap = b4xmainpage.__c.runMethod(false, "createMap", (Object)(new RemoteObject[] {RemoteObject.createImmutable(("email")),(__ref.getField(false,"_tbxemail" /*RemoteObject*/ ).runMethod(true,"getText").runMethod(true,"trim")),RemoteObject.createImmutable(("password")),(__ref.getField(false,"_textboxpassword" /*RemoteObject*/ ).runMethod(true,"getText").runMethod(true,"trim")),RemoteObject.createImmutable(("returnSecureToken")),(b4xmainpage.__c.getField(true,"True"))}));Debug.locals.put("bodymap", _bodymap);Debug.locals.put("bodyMap", _bodymap);
 BA.debugLineNum = 318;BA.debugLine="Dim jg As JSONGenerator";
Debug.ShouldStop(536870912);
_jg = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.JSONParser.JSONGenerator");Debug.locals.put("jg", _jg);
 BA.debugLineNum = 319;BA.debugLine="jg.Initialize(bodyMap)";
Debug.ShouldStop(1073741824);
_jg.runVoidMethod ("Initialize",(Object)(_bodymap));
 BA.debugLineNum = 321;BA.debugLine="SendHttpRequest(\"refreshToken\", \"POST\", url, jg.T";
Debug.ShouldStop(1);
__ref.runClassMethod (b4a.example.b4xmainpage.class, "_sendhttprequest" /*void*/ ,(Object)(BA.ObjectToString("refreshToken")),(Object)(BA.ObjectToString("POST")),(Object)(_url),(Object)(_jg.runMethod(true,"ToString")),(Object)(RemoteObject.createImmutable("application/json")));
 BA.debugLineNum = 322;BA.debugLine="End Sub";
Debug.ShouldStop(2);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _btnvnok_click(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("btnVnOK_Click (b4xmainpage) ","b4xmainpage",1,__ref.getField(false, "ba"),__ref,297);
if (RapidSub.canDelegate("btnvnok_click")) { return __ref.runUserSub(false, "b4xmainpage","btnvnok_click", __ref);}
 BA.debugLineNum = 297;BA.debugLine="Private Sub btnVnOK_Click";
Debug.ShouldStop(256);
 BA.debugLineNum = 298;BA.debugLine="Uhrzeit.Enabled = False";
Debug.ShouldStop(512);
__ref.getField(false,"_uhrzeit" /*RemoteObject*/ ).runMethod(true,"setEnabled",b4xmainpage.__c.getField(true,"False"));
 BA.debugLineNum = 299;BA.debugLine="If selectedVereinIndex < 0 Then Return";
Debug.ShouldStop(1024);
if (RemoteObject.solveBoolean("<",__ref.getField(true,"_selectedvereinindex" /*RemoteObject*/ ),BA.numberCast(double.class, 0))) { 
if (true) return RemoteObject.createImmutable("");};
 BA.debugLineNum = 301;BA.debugLine="DBPut(\"Bezeichnung\", lvwVereine.GetItem(selectedV";
Debug.ShouldStop(4096);
__ref.runClassMethod (b4a.example.b4xmainpage.class, "_dbput" /*RemoteObject*/ ,(Object)(BA.ObjectToString("Bezeichnung")),(Object)(__ref.getField(false,"_lvwvereine" /*RemoteObject*/ ).runMethod(false,"GetItem",(Object)(__ref.getField(true,"_selectedvereinindex" /*RemoteObject*/ )))));
 BA.debugLineNum = 302;BA.debugLine="DBPut(\"VereinsID\", VereineAndKeys.Get(selectedVer";
Debug.ShouldStop(8192);
__ref.runClassMethod (b4a.example.b4xmainpage.class, "_dbput" /*RemoteObject*/ ,(Object)(BA.ObjectToString("VereinsID")),(Object)(__ref.getField(false,"_vereineandkeys" /*RemoteObject*/ ).runMethod(false,"Get",(Object)(__ref.getField(true,"_selectedvereinindex" /*RemoteObject*/ )))));
 BA.debugLineNum = 304;BA.debugLine="B4XPages.ShowPage(\"ScreenMain\")";
Debug.ShouldStop(32768);
b4xmainpage._b4xpages.runVoidMethod ("_showpage" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("ScreenMain")));
 BA.debugLineNum = 305;BA.debugLine="End Sub";
Debug.ShouldStop(65536);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _buildui(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("BuildUI (b4xmainpage) ","b4xmainpage",1,__ref.getField(false, "ba"),__ref,119);
if (RapidSub.canDelegate("buildui")) { return __ref.runUserSub(false, "b4xmainpage","buildui", __ref);}
RemoteObject _boxwidth = RemoteObject.createImmutable(0);
RemoteObject _leftmargin = RemoteObject.createImmutable(0);
RemoteObject _label1 = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
RemoteObject _label2 = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
RemoteObject _label4 = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
 BA.debugLineNum = 119;BA.debugLine="Private Sub BuildUI";
Debug.ShouldStop(4194304);
 BA.debugLineNum = 121;BA.debugLine="If File.Exists(File.DirAssets, \"Screen.png\") Then";
Debug.ShouldStop(16777216);
if (b4xmainpage.__c.getField(false,"File").runMethod(true,"Exists",(Object)(b4xmainpage.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(RemoteObject.createImmutable("Screen.png"))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 122;BA.debugLine="Root.SetBitmap(xui.LoadBitmap(File.DirAssets, \"S";
Debug.ShouldStop(33554432);
__ref.getField(false,"_root" /*RemoteObject*/ ).runVoidMethod ("SetBitmap",(Object)((__ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"LoadBitmap",(Object)(b4xmainpage.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(RemoteObject.createImmutable("Screen.png"))).getObject())));
 }else {
 BA.debugLineNum = 124;BA.debugLine="Root.Color = 0xFFEEFFEE";
Debug.ShouldStop(134217728);
__ref.getField(false,"_root" /*RemoteObject*/ ).runMethod(true,"setColor",BA.numberCast(int.class, ((int)0xffeeffee)));
 };
 BA.debugLineNum = 128;BA.debugLine="VerticalArrangementHeader.Initialize(\"\")";
Debug.ShouldStop(-2147483648);
__ref.getField(false,"_verticalarrangementheader" /*RemoteObject*/ ).runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 129;BA.debugLine="VerticalArrangementHeader.Color = 0xFFEEFFEE";
Debug.ShouldStop(1);
__ref.getField(false,"_verticalarrangementheader" /*RemoteObject*/ ).runVoidMethod ("setColor",BA.numberCast(int.class, ((int)0xffeeffee)));
 BA.debugLineNum = 130;BA.debugLine="Root.AddView(VerticalArrangementHeader, 0, 0, 100";
Debug.ShouldStop(2);
__ref.getField(false,"_root" /*RemoteObject*/ ).runVoidMethod ("AddView",(Object)((__ref.getField(false,"_verticalarrangementheader" /*RemoteObject*/ ).getObject())),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(b4xmainpage.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 100)),__ref.getField(false, "ba"))),(Object)(b4xmainpage.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 40)))));
 BA.debugLineNum = 132;BA.debugLine="lblLogin.Initialize(\"\")";
Debug.ShouldStop(8);
__ref.getField(false,"_lbllogin" /*RemoteObject*/ ).runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 133;BA.debugLine="lblLogin.Text = \"  Login\"";
Debug.ShouldStop(16);
__ref.getField(false,"_lbllogin" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToCharSequence("  Login"));
 BA.debugLineNum = 134;BA.debugLine="lblLogin.TextSize = 20";
Debug.ShouldStop(32);
__ref.getField(false,"_lbllogin" /*RemoteObject*/ ).runMethod(true,"setTextSize",BA.numberCast(float.class, 20));
 BA.debugLineNum = 135;BA.debugLine="lblLogin.Typeface = Typeface.DEFAULT_BOLD";
Debug.ShouldStop(64);
__ref.getField(false,"_lbllogin" /*RemoteObject*/ ).runMethod(false,"setTypeface",b4xmainpage.__c.getField(false,"Typeface").getField(false,"DEFAULT_BOLD"));
 BA.debugLineNum = 136;BA.debugLine="lblLogin.TextColor = 0xFF16AA16";
Debug.ShouldStop(128);
__ref.getField(false,"_lbllogin" /*RemoteObject*/ ).runMethod(true,"setTextColor",BA.numberCast(int.class, ((int)0xff16aa16)));
 BA.debugLineNum = 137;BA.debugLine="lblLogin.Gravity = Gravity.CENTER_VERTICAL";
Debug.ShouldStop(256);
__ref.getField(false,"_lbllogin" /*RemoteObject*/ ).runMethod(true,"setGravity",b4xmainpage.__c.getField(false,"Gravity").getField(true,"CENTER_VERTICAL"));
 BA.debugLineNum = 138;BA.debugLine="VerticalArrangementHeader.AddView(lblLogin, 0, 0,";
Debug.ShouldStop(512);
__ref.getField(false,"_verticalarrangementheader" /*RemoteObject*/ ).runVoidMethod ("AddView",(Object)((__ref.getField(false,"_lbllogin" /*RemoteObject*/ ).getObject())),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(b4xmainpage.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 100)),__ref.getField(false, "ba"))),(Object)(b4xmainpage.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 40)))));
 BA.debugLineNum = 140;BA.debugLine="lblKeineVerbindung.Initialize(\"\")";
Debug.ShouldStop(2048);
__ref.getField(false,"_lblkeineverbindung" /*RemoteObject*/ ).runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 141;BA.debugLine="lblKeineVerbindung.Color = 0xFFFF0000";
Debug.ShouldStop(4096);
__ref.getField(false,"_lblkeineverbindung" /*RemoteObject*/ ).runVoidMethod ("setColor",BA.numberCast(int.class, ((int)0xffff0000)));
 BA.debugLineNum = 142;BA.debugLine="lblKeineVerbindung.Text = \"Keine Internetverbindu";
Debug.ShouldStop(8192);
__ref.getField(false,"_lblkeineverbindung" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToCharSequence("Keine Internetverbindung!"));
 BA.debugLineNum = 143;BA.debugLine="lblKeineVerbindung.TextColor = 0xFFFFFFFF";
Debug.ShouldStop(16384);
__ref.getField(false,"_lblkeineverbindung" /*RemoteObject*/ ).runMethod(true,"setTextColor",BA.numberCast(int.class, ((int)0xffffffff)));
 BA.debugLineNum = 144;BA.debugLine="lblKeineVerbindung.Gravity = Gravity.CENTER";
Debug.ShouldStop(32768);
__ref.getField(false,"_lblkeineverbindung" /*RemoteObject*/ ).runMethod(true,"setGravity",b4xmainpage.__c.getField(false,"Gravity").getField(true,"CENTER"));
 BA.debugLineNum = 145;BA.debugLine="lblKeineVerbindung.Visible = False";
Debug.ShouldStop(65536);
__ref.getField(false,"_lblkeineverbindung" /*RemoteObject*/ ).runMethod(true,"setVisible",b4xmainpage.__c.getField(true,"False"));
 BA.debugLineNum = 146;BA.debugLine="VerticalArrangementHeader.AddView(lblKeineVerbind";
Debug.ShouldStop(131072);
__ref.getField(false,"_verticalarrangementheader" /*RemoteObject*/ ).runVoidMethod ("AddView",(Object)((__ref.getField(false,"_lblkeineverbindung" /*RemoteObject*/ ).getObject())),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(b4xmainpage.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 100)),__ref.getField(false, "ba"))),(Object)(b4xmainpage.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 40)))));
 BA.debugLineNum = 149;BA.debugLine="VerticalArrangementLogin.Initialize(\"\")";
Debug.ShouldStop(1048576);
__ref.getField(false,"_verticalarrangementlogin" /*RemoteObject*/ ).runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 150;BA.debugLine="VerticalArrangementLogin.Color = 0xFFEEFFEE";
Debug.ShouldStop(2097152);
__ref.getField(false,"_verticalarrangementlogin" /*RemoteObject*/ ).runVoidMethod ("setColor",BA.numberCast(int.class, ((int)0xffeeffee)));
 BA.debugLineNum = 151;BA.debugLine="VerticalArrangementLogin.Visible = False";
Debug.ShouldStop(4194304);
__ref.getField(false,"_verticalarrangementlogin" /*RemoteObject*/ ).runMethod(true,"setVisible",b4xmainpage.__c.getField(true,"False"));
 BA.debugLineNum = 152;BA.debugLine="Root.AddView(VerticalArrangementLogin, 0, 40dip,";
Debug.ShouldStop(8388608);
__ref.getField(false,"_root" /*RemoteObject*/ ).runVoidMethod ("AddView",(Object)((__ref.getField(false,"_verticalarrangementlogin" /*RemoteObject*/ ).getObject())),(Object)(BA.numberCast(int.class, 0)),(Object)(b4xmainpage.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 40)))),(Object)(b4xmainpage.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 100)),__ref.getField(false, "ba"))),(Object)(b4xmainpage.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 260)))));
 BA.debugLineNum = 154;BA.debugLine="Dim boxWidth As Int = 80%x";
Debug.ShouldStop(33554432);
_boxwidth = b4xmainpage.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 80)),__ref.getField(false, "ba"));Debug.locals.put("boxwidth", _boxwidth);Debug.locals.put("boxWidth", _boxwidth);
 BA.debugLineNum = 155;BA.debugLine="Dim leftMargin As Int = 10%x";
Debug.ShouldStop(67108864);
_leftmargin = b4xmainpage.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 10)),__ref.getField(false, "ba"));Debug.locals.put("leftmargin", _leftmargin);Debug.locals.put("leftMargin", _leftmargin);
 BA.debugLineNum = 157;BA.debugLine="Dim Label1 As Label";
Debug.ShouldStop(268435456);
_label1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");Debug.locals.put("Label1", _label1);
 BA.debugLineNum = 158;BA.debugLine="Label1.Initialize(\"\")";
Debug.ShouldStop(536870912);
_label1.runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 159;BA.debugLine="Label1.Text = \"eMail-Adresse:\"";
Debug.ShouldStop(1073741824);
_label1.runMethod(true,"setText",BA.ObjectToCharSequence("eMail-Adresse:"));
 BA.debugLineNum = 160;BA.debugLine="Label1.TextSize = 16";
Debug.ShouldStop(-2147483648);
_label1.runMethod(true,"setTextSize",BA.numberCast(float.class, 16));
 BA.debugLineNum = 161;BA.debugLine="Label1.Typeface = Typeface.DEFAULT_BOLD";
Debug.ShouldStop(1);
_label1.runMethod(false,"setTypeface",b4xmainpage.__c.getField(false,"Typeface").getField(false,"DEFAULT_BOLD"));
 BA.debugLineNum = 162;BA.debugLine="Label1.TextColor = Colors.Black";
Debug.ShouldStop(2);
_label1.runMethod(true,"setTextColor",b4xmainpage.__c.getField(false,"Colors").getField(true,"Black"));
 BA.debugLineNum = 163;BA.debugLine="VerticalArrangementLogin.AddView(Label1, leftMarg";
Debug.ShouldStop(4);
__ref.getField(false,"_verticalarrangementlogin" /*RemoteObject*/ ).runVoidMethod ("AddView",(Object)((_label1.getObject())),(Object)(_leftmargin),(Object)(b4xmainpage.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 15)))),(Object)(_boxwidth),(Object)(b4xmainpage.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 25)))));
 BA.debugLineNum = 165;BA.debugLine="tbxEmail.Initialize(\"tbxEmail\")";
Debug.ShouldStop(16);
__ref.getField(false,"_tbxemail" /*RemoteObject*/ ).runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("tbxEmail")));
 BA.debugLineNum = 166;BA.debugLine="tbxEmail.TextSize = 18";
Debug.ShouldStop(32);
__ref.getField(false,"_tbxemail" /*RemoteObject*/ ).runMethod(true,"setTextSize",BA.numberCast(float.class, 18));
 BA.debugLineNum = 167;BA.debugLine="tbxEmail.Typeface = Typeface.DEFAULT_BOLD";
Debug.ShouldStop(64);
__ref.getField(false,"_tbxemail" /*RemoteObject*/ ).runMethod(false,"setTypeface",b4xmainpage.__c.getField(false,"Typeface").getField(false,"DEFAULT_BOLD"));
 BA.debugLineNum = 168;BA.debugLine="tbxEmail.TextColor = 0xFF16AA16";
Debug.ShouldStop(128);
__ref.getField(false,"_tbxemail" /*RemoteObject*/ ).runMethod(true,"setTextColor",BA.numberCast(int.class, ((int)0xff16aa16)));
 BA.debugLineNum = 169;BA.debugLine="tbxEmail.SingleLine = True";
Debug.ShouldStop(256);
__ref.getField(false,"_tbxemail" /*RemoteObject*/ ).runVoidMethod ("setSingleLine",b4xmainpage.__c.getField(true,"True"));
 BA.debugLineNum = 170;BA.debugLine="tbxEmail.InputType = 33";
Debug.ShouldStop(512);
__ref.getField(false,"_tbxemail" /*RemoteObject*/ ).runMethod(true,"setInputType",BA.numberCast(int.class, 33));
 BA.debugLineNum = 171;BA.debugLine="VerticalArrangementLogin.AddView(tbxEmail, leftMa";
Debug.ShouldStop(1024);
__ref.getField(false,"_verticalarrangementlogin" /*RemoteObject*/ ).runVoidMethod ("AddView",(Object)((__ref.getField(false,"_tbxemail" /*RemoteObject*/ ).getObject())),(Object)(_leftmargin),(Object)(b4xmainpage.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 42)))),(Object)(_boxwidth),(Object)(b4xmainpage.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 45)))));
 BA.debugLineNum = 173;BA.debugLine="Dim Label2 As Label";
Debug.ShouldStop(4096);
_label2 = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");Debug.locals.put("Label2", _label2);
 BA.debugLineNum = 174;BA.debugLine="Label2.Initialize(\"\")";
Debug.ShouldStop(8192);
_label2.runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 175;BA.debugLine="Label2.Text = \"Passwort:\"";
Debug.ShouldStop(16384);
_label2.runMethod(true,"setText",BA.ObjectToCharSequence("Passwort:"));
 BA.debugLineNum = 176;BA.debugLine="Label2.TextSize = 16";
Debug.ShouldStop(32768);
_label2.runMethod(true,"setTextSize",BA.numberCast(float.class, 16));
 BA.debugLineNum = 177;BA.debugLine="Label2.Typeface = Typeface.DEFAULT_BOLD";
Debug.ShouldStop(65536);
_label2.runMethod(false,"setTypeface",b4xmainpage.__c.getField(false,"Typeface").getField(false,"DEFAULT_BOLD"));
 BA.debugLineNum = 178;BA.debugLine="Label2.TextColor = Colors.Black";
Debug.ShouldStop(131072);
_label2.runMethod(true,"setTextColor",b4xmainpage.__c.getField(false,"Colors").getField(true,"Black"));
 BA.debugLineNum = 179;BA.debugLine="VerticalArrangementLogin.AddView(Label2, leftMarg";
Debug.ShouldStop(262144);
__ref.getField(false,"_verticalarrangementlogin" /*RemoteObject*/ ).runVoidMethod ("AddView",(Object)((_label2.getObject())),(Object)(_leftmargin),(Object)(b4xmainpage.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 95)))),(Object)(_boxwidth),(Object)(b4xmainpage.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 25)))));
 BA.debugLineNum = 181;BA.debugLine="TextBoxPassword.Initialize(\"TextBoxPassword\")";
Debug.ShouldStop(1048576);
__ref.getField(false,"_textboxpassword" /*RemoteObject*/ ).runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("TextBoxPassword")));
 BA.debugLineNum = 182;BA.debugLine="TextBoxPassword.TextSize = 18";
Debug.ShouldStop(2097152);
__ref.getField(false,"_textboxpassword" /*RemoteObject*/ ).runMethod(true,"setTextSize",BA.numberCast(float.class, 18));
 BA.debugLineNum = 183;BA.debugLine="TextBoxPassword.Typeface = Typeface.DEFAULT_BOLD";
Debug.ShouldStop(4194304);
__ref.getField(false,"_textboxpassword" /*RemoteObject*/ ).runMethod(false,"setTypeface",b4xmainpage.__c.getField(false,"Typeface").getField(false,"DEFAULT_BOLD"));
 BA.debugLineNum = 184;BA.debugLine="TextBoxPassword.TextColor = 0xFF16AA16";
Debug.ShouldStop(8388608);
__ref.getField(false,"_textboxpassword" /*RemoteObject*/ ).runMethod(true,"setTextColor",BA.numberCast(int.class, ((int)0xff16aa16)));
 BA.debugLineNum = 185;BA.debugLine="TextBoxPassword.PasswordMode = True";
Debug.ShouldStop(16777216);
__ref.getField(false,"_textboxpassword" /*RemoteObject*/ ).runVoidMethod ("setPasswordMode",b4xmainpage.__c.getField(true,"True"));
 BA.debugLineNum = 186;BA.debugLine="TextBoxPassword.SingleLine = True";
Debug.ShouldStop(33554432);
__ref.getField(false,"_textboxpassword" /*RemoteObject*/ ).runVoidMethod ("setSingleLine",b4xmainpage.__c.getField(true,"True"));
 BA.debugLineNum = 187;BA.debugLine="VerticalArrangementLogin.AddView(TextBoxPassword,";
Debug.ShouldStop(67108864);
__ref.getField(false,"_verticalarrangementlogin" /*RemoteObject*/ ).runVoidMethod ("AddView",(Object)((__ref.getField(false,"_textboxpassword" /*RemoteObject*/ ).getObject())),(Object)(_leftmargin),(Object)(b4xmainpage.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 122)))),(Object)(RemoteObject.solve(new RemoteObject[] {_boxwidth,b4xmainpage.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 36)))}, "-",1, 1)),(Object)(b4xmainpage.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 45)))));
 BA.debugLineNum = 189;BA.debugLine="btnFyeo.Initialize(\"btnFyeo\")";
Debug.ShouldStop(268435456);
__ref.getField(false,"_btnfyeo" /*RemoteObject*/ ).runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("btnFyeo")));
 BA.debugLineNum = 190;BA.debugLine="If File.Exists(File.DirAssets, \"fyeo.png\") Then";
Debug.ShouldStop(536870912);
if (b4xmainpage.__c.getField(false,"File").runMethod(true,"Exists",(Object)(b4xmainpage.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(RemoteObject.createImmutable("fyeo.png"))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 191;BA.debugLine="btnFyeo.SetBackgroundImage(LoadBitmap(File.DirAs";
Debug.ShouldStop(1073741824);
__ref.getField(false,"_btnfyeo" /*RemoteObject*/ ).runVoidMethod ("SetBackgroundImageNew",(Object)((b4xmainpage.__c.runMethod(false,"LoadBitmap",(Object)(b4xmainpage.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(RemoteObject.createImmutable("fyeo.png"))).getObject())));
 }else {
 BA.debugLineNum = 193;BA.debugLine="btnFyeo.Text = \"👁\"";
Debug.ShouldStop(1);
__ref.getField(false,"_btnfyeo" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToCharSequence("👁"));
 };
 BA.debugLineNum = 195;BA.debugLine="VerticalArrangementLogin.AddView(btnFyeo, leftMar";
Debug.ShouldStop(4);
__ref.getField(false,"_verticalarrangementlogin" /*RemoteObject*/ ).runVoidMethod ("AddView",(Object)((__ref.getField(false,"_btnfyeo" /*RemoteObject*/ ).getObject())),(Object)(RemoteObject.solve(new RemoteObject[] {_leftmargin,_boxwidth,b4xmainpage.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 32)))}, "+-",2, 1)),(Object)(b4xmainpage.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 130)))),(Object)(b4xmainpage.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 28)))),(Object)(b4xmainpage.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 28)))));
 BA.debugLineNum = 197;BA.debugLine="btnLogin.Initialize(\"btnLogin\")";
Debug.ShouldStop(16);
__ref.getField(false,"_btnlogin" /*RemoteObject*/ ).runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("btnLogin")));
 BA.debugLineNum = 198;BA.debugLine="btnLogin.Text = \"LogIn\"";
Debug.ShouldStop(32);
__ref.getField(false,"_btnlogin" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToCharSequence("LogIn"));
 BA.debugLineNum = 199;BA.debugLine="btnLogin.Typeface = Typeface.DEFAULT_BOLD";
Debug.ShouldStop(64);
__ref.getField(false,"_btnlogin" /*RemoteObject*/ ).runMethod(false,"setTypeface",b4xmainpage.__c.getField(false,"Typeface").getField(false,"DEFAULT_BOLD"));
 BA.debugLineNum = 200;BA.debugLine="btnLogin.TextColor = 0xFF888888";
Debug.ShouldStop(128);
__ref.getField(false,"_btnlogin" /*RemoteObject*/ ).runMethod(true,"setTextColor",BA.numberCast(int.class, ((int)0xff888888)));
 BA.debugLineNum = 201;BA.debugLine="btnLogin.Enabled = False";
Debug.ShouldStop(256);
__ref.getField(false,"_btnlogin" /*RemoteObject*/ ).runMethod(true,"setEnabled",b4xmainpage.__c.getField(true,"False"));
 BA.debugLineNum = 202;BA.debugLine="VerticalArrangementLogin.AddView(btnLogin, (100%x";
Debug.ShouldStop(512);
__ref.getField(false,"_verticalarrangementlogin" /*RemoteObject*/ ).runVoidMethod ("AddView",(Object)((__ref.getField(false,"_btnlogin" /*RemoteObject*/ ).getObject())),(Object)(BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {(RemoteObject.solve(new RemoteObject[] {b4xmainpage.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 100)),__ref.getField(false, "ba")),b4xmainpage.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 120)))}, "-",1, 1)),RemoteObject.createImmutable(2)}, "/",0, 0))),(Object)(b4xmainpage.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 185)))),(Object)(b4xmainpage.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 120)))),(Object)(b4xmainpage.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 45)))));
 BA.debugLineNum = 205;BA.debugLine="VerticalArrangementLoading.Initialize(\"\")";
Debug.ShouldStop(4096);
__ref.getField(false,"_verticalarrangementloading" /*RemoteObject*/ ).runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 206;BA.debugLine="VerticalArrangementLoading.Color = 0xFFEEFFEE";
Debug.ShouldStop(8192);
__ref.getField(false,"_verticalarrangementloading" /*RemoteObject*/ ).runVoidMethod ("setColor",BA.numberCast(int.class, ((int)0xffeeffee)));
 BA.debugLineNum = 207;BA.debugLine="Root.AddView(VerticalArrangementLoading, 0, 40dip";
Debug.ShouldStop(16384);
__ref.getField(false,"_root" /*RemoteObject*/ ).runVoidMethod ("AddView",(Object)((__ref.getField(false,"_verticalarrangementloading" /*RemoteObject*/ ).getObject())),(Object)(BA.numberCast(int.class, 0)),(Object)(b4xmainpage.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 40)))),(Object)(b4xmainpage.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 100)),__ref.getField(false, "ba"))),(Object)(b4xmainpage.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 90)))));
 BA.debugLineNum = 209;BA.debugLine="LabelLoading.Initialize(\"\")";
Debug.ShouldStop(65536);
__ref.getField(false,"_labelloading" /*RemoteObject*/ ).runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 210;BA.debugLine="LabelLoading.Text = \"Lade Daten ...\"";
Debug.ShouldStop(131072);
__ref.getField(false,"_labelloading" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToCharSequence("Lade Daten ..."));
 BA.debugLineNum = 211;BA.debugLine="LabelLoading.Typeface = Typeface.DEFAULT_BOLD";
Debug.ShouldStop(262144);
__ref.getField(false,"_labelloading" /*RemoteObject*/ ).runMethod(false,"setTypeface",b4xmainpage.__c.getField(false,"Typeface").getField(false,"DEFAULT_BOLD"));
 BA.debugLineNum = 212;BA.debugLine="LabelLoading.TextColor = 0xFF16AA16";
Debug.ShouldStop(524288);
__ref.getField(false,"_labelloading" /*RemoteObject*/ ).runMethod(true,"setTextColor",BA.numberCast(int.class, ((int)0xff16aa16)));
 BA.debugLineNum = 213;BA.debugLine="LabelLoading.Gravity = Gravity.CENTER";
Debug.ShouldStop(1048576);
__ref.getField(false,"_labelloading" /*RemoteObject*/ ).runMethod(true,"setGravity",b4xmainpage.__c.getField(false,"Gravity").getField(true,"CENTER"));
 BA.debugLineNum = 214;BA.debugLine="VerticalArrangementLoading.AddView(LabelLoading,";
Debug.ShouldStop(2097152);
__ref.getField(false,"_verticalarrangementloading" /*RemoteObject*/ ).runVoidMethod ("AddView",(Object)((__ref.getField(false,"_labelloading" /*RemoteObject*/ ).getObject())),(Object)(BA.numberCast(int.class, 0)),(Object)(b4xmainpage.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 25)))),(Object)(b4xmainpage.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 100)),__ref.getField(false, "ba"))),(Object)(b4xmainpage.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 40)))));
 BA.debugLineNum = 217;BA.debugLine="VerticalArrangementVereine.Initialize(\"\")";
Debug.ShouldStop(16777216);
__ref.getField(false,"_verticalarrangementvereine" /*RemoteObject*/ ).runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 218;BA.debugLine="VerticalArrangementVereine.Color = 0xDDEEFFEE";
Debug.ShouldStop(33554432);
__ref.getField(false,"_verticalarrangementvereine" /*RemoteObject*/ ).runVoidMethod ("setColor",BA.numberCast(int.class, ((int)0xddeeffee)));
 BA.debugLineNum = 219;BA.debugLine="VerticalArrangementVereine.Visible = False";
Debug.ShouldStop(67108864);
__ref.getField(false,"_verticalarrangementvereine" /*RemoteObject*/ ).runMethod(true,"setVisible",b4xmainpage.__c.getField(true,"False"));
 BA.debugLineNum = 220;BA.debugLine="Root.AddView(VerticalArrangementVereine, 0, 0, 10";
Debug.ShouldStop(134217728);
__ref.getField(false,"_root" /*RemoteObject*/ ).runVoidMethod ("AddView",(Object)((__ref.getField(false,"_verticalarrangementvereine" /*RemoteObject*/ ).getObject())),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(b4xmainpage.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 100)),__ref.getField(false, "ba"))),(Object)(b4xmainpage.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 100)),__ref.getField(false, "ba"))));
 BA.debugLineNum = 222;BA.debugLine="Dim Label4 As Label";
Debug.ShouldStop(536870912);
_label4 = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");Debug.locals.put("Label4", _label4);
 BA.debugLineNum = 223;BA.debugLine="Label4.Initialize(\"\")";
Debug.ShouldStop(1073741824);
_label4.runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 224;BA.debugLine="Label4.Text = \"  Bitte Vereins-Auswahl treffen:\"";
Debug.ShouldStop(-2147483648);
_label4.runMethod(true,"setText",BA.ObjectToCharSequence("  Bitte Vereins-Auswahl treffen:"));
 BA.debugLineNum = 225;BA.debugLine="Label4.TextSize = 16";
Debug.ShouldStop(1);
_label4.runMethod(true,"setTextSize",BA.numberCast(float.class, 16));
 BA.debugLineNum = 226;BA.debugLine="Label4.Typeface = Typeface.DEFAULT_BOLD";
Debug.ShouldStop(2);
_label4.runMethod(false,"setTypeface",b4xmainpage.__c.getField(false,"Typeface").getField(false,"DEFAULT_BOLD"));
 BA.debugLineNum = 227;BA.debugLine="Label4.TextColor = Colors.Black";
Debug.ShouldStop(4);
_label4.runMethod(true,"setTextColor",b4xmainpage.__c.getField(false,"Colors").getField(true,"Black"));
 BA.debugLineNum = 228;BA.debugLine="Label4.Gravity = Gravity.CENTER_VERTICAL";
Debug.ShouldStop(8);
_label4.runMethod(true,"setGravity",b4xmainpage.__c.getField(false,"Gravity").getField(true,"CENTER_VERTICAL"));
 BA.debugLineNum = 229;BA.debugLine="VerticalArrangementVereine.AddView(Label4, 0, 5di";
Debug.ShouldStop(16);
__ref.getField(false,"_verticalarrangementvereine" /*RemoteObject*/ ).runVoidMethod ("AddView",(Object)((_label4.getObject())),(Object)(BA.numberCast(int.class, 0)),(Object)(b4xmainpage.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 5)))),(Object)(RemoteObject.solve(new RemoteObject[] {b4xmainpage.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 100)),__ref.getField(false, "ba")),b4xmainpage.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 80)))}, "-",1, 1)),(Object)(b4xmainpage.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 40)))));
 BA.debugLineNum = 231;BA.debugLine="btnVnOK.Initialize(\"btnVnOK\")";
Debug.ShouldStop(64);
__ref.getField(false,"_btnvnok" /*RemoteObject*/ ).runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("btnVnOK")));
 BA.debugLineNum = 232;BA.debugLine="btnVnOK.Text = \"OK\"";
Debug.ShouldStop(128);
__ref.getField(false,"_btnvnok" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToCharSequence("OK"));
 BA.debugLineNum = 233;BA.debugLine="btnVnOK.Typeface = Typeface.DEFAULT_BOLD";
Debug.ShouldStop(256);
__ref.getField(false,"_btnvnok" /*RemoteObject*/ ).runMethod(false,"setTypeface",b4xmainpage.__c.getField(false,"Typeface").getField(false,"DEFAULT_BOLD"));
 BA.debugLineNum = 234;BA.debugLine="btnVnOK.TextColor = 0xFF888888";
Debug.ShouldStop(512);
__ref.getField(false,"_btnvnok" /*RemoteObject*/ ).runMethod(true,"setTextColor",BA.numberCast(int.class, ((int)0xff888888)));
 BA.debugLineNum = 235;BA.debugLine="btnVnOK.Enabled = False";
Debug.ShouldStop(1024);
__ref.getField(false,"_btnvnok" /*RemoteObject*/ ).runMethod(true,"setEnabled",b4xmainpage.__c.getField(true,"False"));
 BA.debugLineNum = 236;BA.debugLine="VerticalArrangementVereine.AddView(btnVnOK, 100%x";
Debug.ShouldStop(2048);
__ref.getField(false,"_verticalarrangementvereine" /*RemoteObject*/ ).runVoidMethod ("AddView",(Object)((__ref.getField(false,"_btnvnok" /*RemoteObject*/ ).getObject())),(Object)(RemoteObject.solve(new RemoteObject[] {b4xmainpage.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 100)),__ref.getField(false, "ba")),b4xmainpage.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 75)))}, "-",1, 1)),(Object)(b4xmainpage.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 5)))),(Object)(b4xmainpage.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 70)))),(Object)(b4xmainpage.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 40)))));
 BA.debugLineNum = 238;BA.debugLine="lvwVereine.Initialize(\"lvwVereine\")";
Debug.ShouldStop(8192);
__ref.getField(false,"_lvwvereine" /*RemoteObject*/ ).runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("lvwVereine")));
 BA.debugLineNum = 239;BA.debugLine="lvwVereine.SingleLineLayout.Label.TextColor = 0xF";
Debug.ShouldStop(16384);
__ref.getField(false,"_lvwvereine" /*RemoteObject*/ ).runMethod(false,"getSingleLineLayout").getField(false,"Label").runMethod(true,"setTextColor",BA.numberCast(int.class, ((int)0xff16aa16)));
 BA.debugLineNum = 240;BA.debugLine="lvwVereine.SingleLineLayout.Label.TextSize = 18";
Debug.ShouldStop(32768);
__ref.getField(false,"_lvwvereine" /*RemoteObject*/ ).runMethod(false,"getSingleLineLayout").getField(false,"Label").runMethod(true,"setTextSize",BA.numberCast(float.class, 18));
 BA.debugLineNum = 241;BA.debugLine="VerticalArrangementVereine.AddView(lvwVereine, 0,";
Debug.ShouldStop(65536);
__ref.getField(false,"_verticalarrangementvereine" /*RemoteObject*/ ).runVoidMethod ("AddView",(Object)((__ref.getField(false,"_lvwvereine" /*RemoteObject*/ ).getObject())),(Object)(BA.numberCast(int.class, 0)),(Object)(b4xmainpage.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 50)))),(Object)(b4xmainpage.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 100)),__ref.getField(false, "ba"))),(Object)(RemoteObject.solve(new RemoteObject[] {b4xmainpage.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 100)),__ref.getField(false, "ba")),b4xmainpage.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 50)))}, "-",1, 1)));
 BA.debugLineNum = 242;BA.debugLine="End Sub";
Debug.ShouldStop(131072);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _checkloginbuttonstate(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("CheckLoginButtonState (b4xmainpage) ","b4xmainpage",1,__ref.getField(false, "ba"),__ref,273);
if (RapidSub.canDelegate("checkloginbuttonstate")) { return __ref.runUserSub(false, "b4xmainpage","checkloginbuttonstate", __ref);}
 BA.debugLineNum = 273;BA.debugLine="Private Sub CheckLoginButtonState";
Debug.ShouldStop(65536);
 BA.debugLineNum = 274;BA.debugLine="If tbxEmail.Text.Trim <> \"\" And TextBoxPassword.T";
Debug.ShouldStop(131072);
if (RemoteObject.solveBoolean("!",__ref.getField(false,"_tbxemail" /*RemoteObject*/ ).runMethod(true,"getText").runMethod(true,"trim"),BA.ObjectToString("")) && RemoteObject.solveBoolean("!",__ref.getField(false,"_textboxpassword" /*RemoteObject*/ ).runMethod(true,"getText").runMethod(true,"trim"),BA.ObjectToString(""))) { 
 BA.debugLineNum = 275;BA.debugLine="btnLogin.Enabled = True";
Debug.ShouldStop(262144);
__ref.getField(false,"_btnlogin" /*RemoteObject*/ ).runMethod(true,"setEnabled",b4xmainpage.__c.getField(true,"True"));
 BA.debugLineNum = 276;BA.debugLine="btnLogin.TextColor = colorgreen";
Debug.ShouldStop(524288);
__ref.getField(false,"_btnlogin" /*RemoteObject*/ ).runMethod(true,"setTextColor",__ref.getField(true,"_colorgreen" /*RemoteObject*/ ));
 }else {
 BA.debugLineNum = 278;BA.debugLine="btnLogin.Enabled = False";
Debug.ShouldStop(2097152);
__ref.getField(false,"_btnlogin" /*RemoteObject*/ ).runMethod(true,"setEnabled",b4xmainpage.__c.getField(true,"False"));
 BA.debugLineNum = 279;BA.debugLine="btnLogin.TextColor = 0xFF888888";
Debug.ShouldStop(4194304);
__ref.getField(false,"_btnlogin" /*RemoteObject*/ ).runMethod(true,"setTextColor",BA.numberCast(int.class, ((int)0xff888888)));
 };
 BA.debugLineNum = 281;BA.debugLine="End Sub";
Debug.ShouldStop(16777216);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _class_globals(RemoteObject __ref) throws Exception{
 //BA.debugLineNum = 8;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 9;BA.debugLine="Private Root As B4XView";
b4xmainpage._root = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");__ref.setField("_root",b4xmainpage._root);
 //BA.debugLineNum = 10;BA.debugLine="Private xui As XUI";
b4xmainpage._xui = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper.XUI");__ref.setField("_xui",b4xmainpage._xui);
 //BA.debugLineNum = 14;BA.debugLine="Public PageMain As ScreenMain";
b4xmainpage._pagemain = RemoteObject.createNew ("b4a.example.screenmain");__ref.setField("_pagemain",b4xmainpage._pagemain);
 //BA.debugLineNum = 15;BA.debugLine="Public PageSettings As Settings";
b4xmainpage._pagesettings = RemoteObject.createNew ("b4a.example.settings");__ref.setField("_pagesettings",b4xmainpage._pagesettings);
 //BA.debugLineNum = 16;BA.debugLine="Public PageSaver As ScreenSaver";
b4xmainpage._pagesaver = RemoteObject.createNew ("b4a.example.screensaver");__ref.setField("_pagesaver",b4xmainpage._pagesaver);
 //BA.debugLineNum = 19;BA.debugLine="Public apiKey As String = \"AIzaSyBT9m4udg4Bn4GhYG";
b4xmainpage._apikey = BA.ObjectToString("AIzaSyBT9m4udg4Bn4GhYGusVsj-H-gnYWmMA6U");__ref.setField("_apikey",b4xmainpage._apikey);
 //BA.debugLineNum = 20;BA.debugLine="Public TLNlastID As String = \"t0\"";
b4xmainpage._tlnlastid = BA.ObjectToString("t0");__ref.setField("_tlnlastid",b4xmainpage._tlnlastid);
 //BA.debugLineNum = 21;BA.debugLine="Public URLteilnehmer As String = \"https://wertung";
b4xmainpage._urlteilnehmer = BA.ObjectToString("https://wertungslisten-app-default-rtdb.europe-west1.firebasedatabase.app/Vereine/[...]/Teilnehmer");__ref.setField("_urlteilnehmer",b4xmainpage._urlteilnehmer);
 //BA.debugLineNum = 22;BA.debugLine="Public URLErgebnisse As String = \"https://wertung";
b4xmainpage._urlergebnisse = BA.ObjectToString("https://wertungslisten-app-default-rtdb.europe-west1.firebasedatabase.app/Vereine/[...]/Ergebnisse/");__ref.setField("_urlergebnisse",b4xmainpage._urlergebnisse);
 //BA.debugLineNum = 23;BA.debugLine="Public VereineAndKeys As List";
b4xmainpage._vereineandkeys = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");__ref.setField("_vereineandkeys",b4xmainpage._vereineandkeys);
 //BA.debugLineNum = 24;BA.debugLine="Public DBdatenTyp As String = \"\"";
b4xmainpage._dbdatentyp = BA.ObjectToString("");__ref.setField("_dbdatentyp",b4xmainpage._dbdatentyp);
 //BA.debugLineNum = 25;BA.debugLine="Public idToken As String = \"\"";
b4xmainpage._idtoken = BA.ObjectToString("");__ref.setField("_idtoken",b4xmainpage._idtoken);
 //BA.debugLineNum = 26;BA.debugLine="Public refreshToken As String = \"\"";
b4xmainpage._refreshtoken = BA.ObjectToString("");__ref.setField("_refreshtoken",b4xmainpage._refreshtoken);
 //BA.debugLineNum = 27;BA.debugLine="Public debug As Boolean = False";
b4xmainpage._debug = b4xmainpage.__c.getField(true,"False");__ref.setField("_debug",b4xmainpage._debug);
 //BA.debugLineNum = 28;BA.debugLine="Public Status As Map";
b4xmainpage._status = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");__ref.setField("_status",b4xmainpage._status);
 //BA.debugLineNum = 29;BA.debugLine="Private colorgreen As Int = 0xFF16AA16";
b4xmainpage._colorgreen = BA.numberCast(int.class, ((int)0xff16aa16));__ref.setField("_colorgreen",b4xmainpage._colorgreen);
 //BA.debugLineNum = 30;BA.debugLine="Private passwordVisible As Boolean = False";
b4xmainpage._passwordvisible = b4xmainpage.__c.getField(true,"False");__ref.setField("_passwordvisible",b4xmainpage._passwordvisible);
 //BA.debugLineNum = 31;BA.debugLine="Private selectedVereinIndex As Int = -1";
b4xmainpage._selectedvereinindex = BA.numberCast(int.class, -(double) (0 + 1));__ref.setField("_selectedvereinindex",b4xmainpage._selectedvereinindex);
 //BA.debugLineNum = 32;BA.debugLine="Private ignoreTextEvents As Boolean = False";
b4xmainpage._ignoretextevents = b4xmainpage.__c.getField(true,"False");__ref.setField("_ignoretextevents",b4xmainpage._ignoretextevents);
 //BA.debugLineNum = 35;BA.debugLine="Private VerticalArrangementHeader As Panel";
b4xmainpage._verticalarrangementheader = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");__ref.setField("_verticalarrangementheader",b4xmainpage._verticalarrangementheader);
 //BA.debugLineNum = 36;BA.debugLine="Private lblLogin As Label";
b4xmainpage._lbllogin = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");__ref.setField("_lbllogin",b4xmainpage._lbllogin);
 //BA.debugLineNum = 37;BA.debugLine="Private lblKeineVerbindung As Label";
b4xmainpage._lblkeineverbindung = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");__ref.setField("_lblkeineverbindung",b4xmainpage._lblkeineverbindung);
 //BA.debugLineNum = 39;BA.debugLine="Private VerticalArrangementLogin As Panel";
b4xmainpage._verticalarrangementlogin = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");__ref.setField("_verticalarrangementlogin",b4xmainpage._verticalarrangementlogin);
 //BA.debugLineNum = 40;BA.debugLine="Private tbxEmail As EditText";
b4xmainpage._tbxemail = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");__ref.setField("_tbxemail",b4xmainpage._tbxemail);
 //BA.debugLineNum = 41;BA.debugLine="Private TextBoxPassword As EditText";
b4xmainpage._textboxpassword = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");__ref.setField("_textboxpassword",b4xmainpage._textboxpassword);
 //BA.debugLineNum = 42;BA.debugLine="Private btnFyeo As Button";
b4xmainpage._btnfyeo = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");__ref.setField("_btnfyeo",b4xmainpage._btnfyeo);
 //BA.debugLineNum = 43;BA.debugLine="Private btnLogin As Button";
b4xmainpage._btnlogin = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");__ref.setField("_btnlogin",b4xmainpage._btnlogin);
 //BA.debugLineNum = 45;BA.debugLine="Private VerticalArrangementLoading As Panel";
b4xmainpage._verticalarrangementloading = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");__ref.setField("_verticalarrangementloading",b4xmainpage._verticalarrangementloading);
 //BA.debugLineNum = 46;BA.debugLine="Private LabelLoading As Label";
b4xmainpage._labelloading = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");__ref.setField("_labelloading",b4xmainpage._labelloading);
 //BA.debugLineNum = 48;BA.debugLine="Private VerticalArrangementVereine As Panel";
b4xmainpage._verticalarrangementvereine = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");__ref.setField("_verticalarrangementvereine",b4xmainpage._verticalarrangementvereine);
 //BA.debugLineNum = 49;BA.debugLine="Private btnVnOK As Button";
b4xmainpage._btnvnok = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");__ref.setField("_btnvnok",b4xmainpage._btnvnok);
 //BA.debugLineNum = 50;BA.debugLine="Private lvwVereine As ListView";
b4xmainpage._lvwvereine = RemoteObject.createNew ("anywheresoftware.b4a.objects.ListViewWrapper");__ref.setField("_lvwvereine",b4xmainpage._lvwvereine);
 //BA.debugLineNum = 53;BA.debugLine="Private Uhrzeit As Timer";
b4xmainpage._uhrzeit = RemoteObject.createNew ("anywheresoftware.b4a.objects.Timer");__ref.setField("_uhrzeit",b4xmainpage._uhrzeit);
 //BA.debugLineNum = 54;BA.debugLine="Private DBVerein As Map ' Ersetzt TinyDB (wird al";
b4xmainpage._dbverein = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");__ref.setField("_dbverein",b4xmainpage._dbverein);
 //BA.debugLineNum = 55;BA.debugLine="Private DBFileName As String = \"DBVerein.dat\"";
b4xmainpage._dbfilename = BA.ObjectToString("DBVerein.dat");__ref.setField("_dbfilename",b4xmainpage._dbfilename);
 //BA.debugLineNum = 56;BA.debugLine="Private ion As Object ' Für ActivityResult (CONFI";
b4xmainpage._ion = RemoteObject.createNew ("Object");__ref.setField("_ion",b4xmainpage._ion);
 //BA.debugLineNum = 57;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _dbget(RemoteObject __ref,RemoteObject _key,RemoteObject _defaultvalue) throws Exception{
try {
		Debug.PushSubsStack("DBGet (b4xmainpage) ","b4xmainpage",1,__ref.getField(false, "ba"),__ref,645);
if (RapidSub.canDelegate("dbget")) { return __ref.runUserSub(false, "b4xmainpage","dbget", __ref, _key, _defaultvalue);}
RemoteObject _val = RemoteObject.createImmutable("");
RemoteObject _jp = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.JSONParser");
Debug.locals.put("Key", _key);
Debug.locals.put("DefaultValue", _defaultvalue);
 BA.debugLineNum = 645;BA.debugLine="Private Sub DBGet(Key As String, DefaultValue As O";
Debug.ShouldStop(16);
 BA.debugLineNum = 646;BA.debugLine="If DBVerein.ContainsKey(Key) = False Then Return";
Debug.ShouldStop(32);
if (RemoteObject.solveBoolean("=",__ref.getField(false,"_dbverein" /*RemoteObject*/ ).runMethod(true,"ContainsKey",(Object)((_key))),b4xmainpage.__c.getField(true,"False"))) { 
if (true) return _defaultvalue;};
 BA.debugLineNum = 647;BA.debugLine="Dim val As String = DBVerein.Get(Key)";
Debug.ShouldStop(64);
_val = BA.ObjectToString(__ref.getField(false,"_dbverein" /*RemoteObject*/ ).runMethod(false,"Get",(Object)((_key))));Debug.locals.put("val", _val);Debug.locals.put("val", _val);
 BA.debugLineNum = 648;BA.debugLine="If val.StartsWith(\"JSON_MAP:\") Then";
Debug.ShouldStop(128);
if (_val.runMethod(true,"startsWith",(Object)(RemoteObject.createImmutable("JSON_MAP:"))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 649;BA.debugLine="Dim jp As JSONParser";
Debug.ShouldStop(256);
_jp = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.JSONParser");Debug.locals.put("jp", _jp);
 BA.debugLineNum = 650;BA.debugLine="jp.Initialize(val.SubString(9))";
Debug.ShouldStop(512);
_jp.runVoidMethod ("Initialize",(Object)(_val.runMethod(true,"substring",(Object)(BA.numberCast(int.class, 9)))));
 BA.debugLineNum = 651;BA.debugLine="Return jp.NextObject";
Debug.ShouldStop(1024);
if (true) return (_jp.runMethod(false,"NextObject").getObject());
 }else 
{ BA.debugLineNum = 652;BA.debugLine="Else If val.StartsWith(\"JSON_LIST:\") Then";
Debug.ShouldStop(2048);
if (_val.runMethod(true,"startsWith",(Object)(RemoteObject.createImmutable("JSON_LIST:"))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 653;BA.debugLine="Dim jp As JSONParser";
Debug.ShouldStop(4096);
_jp = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.JSONParser");Debug.locals.put("jp", _jp);
 BA.debugLineNum = 654;BA.debugLine="jp.Initialize(val.SubString(10))";
Debug.ShouldStop(8192);
_jp.runVoidMethod ("Initialize",(Object)(_val.runMethod(true,"substring",(Object)(BA.numberCast(int.class, 10)))));
 BA.debugLineNum = 655;BA.debugLine="Return jp.NextArray";
Debug.ShouldStop(16384);
if (true) return (_jp.runMethod(false,"NextArray").getObject());
 }}
;
 BA.debugLineNum = 657;BA.debugLine="Return val";
Debug.ShouldStop(65536);
if (true) return (_val);
 BA.debugLineNum = 658;BA.debugLine="End Sub";
Debug.ShouldStop(131072);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _dbput(RemoteObject __ref,RemoteObject _key,RemoteObject _value) throws Exception{
try {
		Debug.PushSubsStack("DBPut (b4xmainpage) ","b4xmainpage",1,__ref.getField(false, "ba"),__ref,630);
if (RapidSub.canDelegate("dbput")) { return __ref.runUserSub(false, "b4xmainpage","dbput", __ref, _key, _value);}
RemoteObject _jg = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.JSONParser.JSONGenerator");
Debug.locals.put("Key", _key);
Debug.locals.put("Value", _value);
 BA.debugLineNum = 630;BA.debugLine="Private Sub DBPut(Key As String, Value As Object)";
Debug.ShouldStop(2097152);
 BA.debugLineNum = 631;BA.debugLine="If Value Is Map Then";
Debug.ShouldStop(4194304);
if (RemoteObject.solveBoolean("i",_value, RemoteObject.createImmutable("java.util.Map"))) { 
 BA.debugLineNum = 632;BA.debugLine="Dim jg As JSONGenerator";
Debug.ShouldStop(8388608);
_jg = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.JSONParser.JSONGenerator");Debug.locals.put("jg", _jg);
 BA.debugLineNum = 633;BA.debugLine="jg.Initialize(Value)";
Debug.ShouldStop(16777216);
_jg.runVoidMethod ("Initialize",RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), _value));
 BA.debugLineNum = 634;BA.debugLine="DBVerein.Put(Key, \"JSON_MAP:\" & jg.ToString)";
Debug.ShouldStop(33554432);
__ref.getField(false,"_dbverein" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)((_key)),(Object)((RemoteObject.concat(RemoteObject.createImmutable("JSON_MAP:"),_jg.runMethod(true,"ToString")))));
 }else 
{ BA.debugLineNum = 635;BA.debugLine="Else If Value Is List Then";
Debug.ShouldStop(67108864);
if (RemoteObject.solveBoolean("i",_value, RemoteObject.createImmutable("java.util.List"))) { 
 BA.debugLineNum = 636;BA.debugLine="Dim jg As JSONGenerator";
Debug.ShouldStop(134217728);
_jg = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.JSONParser.JSONGenerator");Debug.locals.put("jg", _jg);
 BA.debugLineNum = 637;BA.debugLine="jg.Initialize2(Value)";
Debug.ShouldStop(268435456);
_jg.runVoidMethod ("Initialize2",RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.List"), _value));
 BA.debugLineNum = 638;BA.debugLine="DBVerein.Put(Key, \"JSON_LIST:\" & jg.ToString)";
Debug.ShouldStop(536870912);
__ref.getField(false,"_dbverein" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)((_key)),(Object)((RemoteObject.concat(RemoteObject.createImmutable("JSON_LIST:"),_jg.runMethod(true,"ToString")))));
 }else {
 BA.debugLineNum = 640;BA.debugLine="DBVerein.Put(Key, Value)";
Debug.ShouldStop(-2147483648);
__ref.getField(false,"_dbverein" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)((_key)),(Object)(_value));
 }}
;
 BA.debugLineNum = 642;BA.debugLine="File.WriteMap(File.DirInternal, DBFileName, DBVer";
Debug.ShouldStop(2);
b4xmainpage.__c.getField(false,"File").runVoidMethod ("WriteMap",(Object)(b4xmainpage.__c.getField(false,"File").runMethod(true,"getDirInternal")),(Object)(__ref.getField(true,"_dbfilename" /*RemoteObject*/ )),(Object)(__ref.getField(false,"_dbverein" /*RemoteObject*/ )));
 BA.debugLineNum = 643;BA.debugLine="End Sub";
Debug.ShouldStop(4);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _formatdatecustom(RemoteObject __ref,RemoteObject _ticks,RemoteObject _pattern) throws Exception{
try {
		Debug.PushSubsStack("FormatDateCustom (b4xmainpage) ","b4xmainpage",1,__ref.getField(false, "ba"),__ref,608);
if (RapidSub.canDelegate("formatdatecustom")) { return __ref.runUserSub(false, "b4xmainpage","formatdatecustom", __ref, _ticks, _pattern);}
RemoteObject _oldformat = RemoteObject.createImmutable("");
RemoteObject _res = RemoteObject.createImmutable("");
Debug.locals.put("ticks", _ticks);
Debug.locals.put("pattern", _pattern);
 BA.debugLineNum = 608;BA.debugLine="Private Sub FormatDateCustom(ticks As Long, patter";
Debug.ShouldStop(-2147483648);
 BA.debugLineNum = 609;BA.debugLine="Dim oldFormat As String = DateTime.DateFormat";
Debug.ShouldStop(1);
_oldformat = b4xmainpage.__c.getField(false,"DateTime").runMethod(true,"getDateFormat");Debug.locals.put("oldformat", _oldformat);Debug.locals.put("oldFormat", _oldformat);
 BA.debugLineNum = 610;BA.debugLine="DateTime.DateFormat = pattern";
Debug.ShouldStop(2);
b4xmainpage.__c.getField(false,"DateTime").runMethod(true,"setDateFormat",_pattern);
 BA.debugLineNum = 611;BA.debugLine="Dim res As String = DateTime.Date(ticks)";
Debug.ShouldStop(4);
_res = b4xmainpage.__c.getField(false,"DateTime").runMethod(true,"Date",(Object)(_ticks));Debug.locals.put("res", _res);Debug.locals.put("res", _res);
 BA.debugLineNum = 612;BA.debugLine="DateTime.DateFormat = oldFormat";
Debug.ShouldStop(8);
b4xmainpage.__c.getField(false,"DateTime").runMethod(true,"setDateFormat",_oldformat);
 BA.debugLineNum = 613;BA.debugLine="Return res";
Debug.ShouldStop(16);
if (true) return _res;
 BA.debugLineNum = 614;BA.debugLine="End Sub";
Debug.ShouldStop(32);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getba(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("GetBA (b4xmainpage) ","b4xmainpage",1,__ref.getField(false, "ba"),__ref,687);
if (RapidSub.canDelegate("getba")) { return __ref.runUserSub(false, "b4xmainpage","getba", __ref);}
RemoteObject _jo = RemoteObject.declareNull("anywheresoftware.b4j.object.JavaObject");
 BA.debugLineNum = 687;BA.debugLine="Private Sub GetBA As Object";
Debug.ShouldStop(16384);
 BA.debugLineNum = 688;BA.debugLine="Dim jo As JavaObject";
Debug.ShouldStop(32768);
_jo = RemoteObject.createNew ("anywheresoftware.b4j.object.JavaObject");Debug.locals.put("jo", _jo);
 BA.debugLineNum = 689;BA.debugLine="jo.InitializeStatic(Application.PackageName & \".m";
Debug.ShouldStop(65536);
_jo.runVoidMethod ("InitializeStatic",(Object)(RemoteObject.concat(b4xmainpage.__c.getField(false,"Application").runMethod(true,"getPackageName"),RemoteObject.createImmutable(".main"))));
 BA.debugLineNum = 690;BA.debugLine="Return jo.GetField(\"processBA\")";
Debug.ShouldStop(131072);
if (true) return _jo.runMethod(false,"GetField",(Object)(RemoteObject.createImmutable("processBA")));
 BA.debugLineNum = 691;BA.debugLine="End Sub";
Debug.ShouldStop(262144);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _handlewebresponse(RemoteObject __ref,RemoteObject _typ,RemoteObject _requrl,RemoteObject _responsecontent) throws Exception{
try {
		Debug.PushSubsStack("HandleWebResponse (b4xmainpage) ","b4xmainpage",1,__ref.getField(false, "ba"),__ref,439);
if (RapidSub.canDelegate("handlewebresponse")) { return __ref.runUserSub(false, "b4xmainpage","handlewebresponse", __ref, _typ, _requrl, _responsecontent);}
RemoteObject _jp = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.JSONParser");
RemoteObject _resp = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _vereine = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _k = RemoteObject.createImmutable("");
RemoteObject _bez = RemoteObject.createImmutable("");
RemoteObject _urlparts = null;
RemoteObject _aendmap = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
Debug.locals.put("typ", _typ);
Debug.locals.put("reqUrl", _requrl);
Debug.locals.put("responseContent", _responsecontent);
 BA.debugLineNum = 439;BA.debugLine="Private Sub HandleWebResponse(typ As String, reqUr";
Debug.ShouldStop(4194304);
 BA.debugLineNum = 440;BA.debugLine="Dim jp As JSONParser";
Debug.ShouldStop(8388608);
_jp = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.JSONParser");Debug.locals.put("jp", _jp);
 BA.debugLineNum = 442;BA.debugLine="Select typ";
Debug.ShouldStop(33554432);
switch (BA.switchObjectToInt(_typ,BA.ObjectToString("refreshToken"),BA.ObjectToString("refresh_token"),BA.ObjectToString("holeVereine"),BA.ObjectToString("holeBezeichnungen"),BA.ObjectToString("holeBezeichnung"),BA.ObjectToString("UpdateErgebnisse"),BA.ObjectToString("Teilnehmer"),BA.ObjectToString("addTLN"))) {
case 0: {
 BA.debugLineNum = 444;BA.debugLine="jp.Initialize(responseContent)";
Debug.ShouldStop(134217728);
_jp.runVoidMethod ("Initialize",(Object)(_responsecontent));
 BA.debugLineNum = 445;BA.debugLine="Dim resp As Map = jp.NextObject";
Debug.ShouldStop(268435456);
_resp = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_resp = _jp.runMethod(false,"NextObject");Debug.locals.put("resp", _resp);Debug.locals.put("resp", _resp);
 BA.debugLineNum = 446;BA.debugLine="Status.Put(\"idToken\", resp.GetDefault(\"idToken\"";
Debug.ShouldStop(536870912);
__ref.getField(false,"_status" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("idToken"))),(Object)(_resp.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("idToken"))),(Object)((RemoteObject.createImmutable(""))))));
 BA.debugLineNum = 447;BA.debugLine="Status.Put(\"refreshToken\", resp.GetDefault(\"ref";
Debug.ShouldStop(1073741824);
__ref.getField(false,"_status" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("refreshToken"))),(Object)(_resp.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("refreshToken"))),(Object)((RemoteObject.createImmutable(""))))));
 BA.debugLineNum = 448;BA.debugLine="DBPut(\"idToken\", Status.Get(\"idToken\"))";
Debug.ShouldStop(-2147483648);
__ref.runClassMethod (b4a.example.b4xmainpage.class, "_dbput" /*RemoteObject*/ ,(Object)(BA.ObjectToString("idToken")),(Object)(__ref.getField(false,"_status" /*RemoteObject*/ ).runMethod(false,"Get",(Object)((RemoteObject.createImmutable("idToken"))))));
 BA.debugLineNum = 449;BA.debugLine="DBPut(\"refreshToken\", Status.Get(\"refreshToken\"";
Debug.ShouldStop(1);
__ref.runClassMethod (b4a.example.b4xmainpage.class, "_dbput" /*RemoteObject*/ ,(Object)(BA.ObjectToString("refreshToken")),(Object)(__ref.getField(false,"_status" /*RemoteObject*/ ).runMethod(false,"Get",(Object)((RemoteObject.createImmutable("refreshToken"))))));
 BA.debugLineNum = 450;BA.debugLine="pruefeOfflineAenderung";
Debug.ShouldStop(2);
__ref.runClassMethod (b4a.example.b4xmainpage.class, "_pruefeofflineaenderung" /*void*/ );
 break; }
case 1: {
 BA.debugLineNum = 453;BA.debugLine="jp.Initialize(responseContent)";
Debug.ShouldStop(16);
_jp.runVoidMethod ("Initialize",(Object)(_responsecontent));
 BA.debugLineNum = 454;BA.debugLine="Dim resp As Map = jp.NextObject";
Debug.ShouldStop(32);
_resp = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_resp = _jp.runMethod(false,"NextObject");Debug.locals.put("resp", _resp);Debug.locals.put("resp", _resp);
 BA.debugLineNum = 455;BA.debugLine="Status.Put(\"idToken\", resp.GetDefault(\"access_t";
Debug.ShouldStop(64);
__ref.getField(false,"_status" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("idToken"))),(Object)(_resp.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("access_token"))),(Object)((RemoteObject.createImmutable(""))))));
 BA.debugLineNum = 456;BA.debugLine="Status.Put(\"refreshToken\", resp.GetDefault(\"ref";
Debug.ShouldStop(128);
__ref.getField(false,"_status" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("refreshToken"))),(Object)(_resp.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("refresh_token"))),(Object)((RemoteObject.createImmutable(""))))));
 BA.debugLineNum = 457;BA.debugLine="DBPut(\"idToken\", Status.Get(\"idToken\"))";
Debug.ShouldStop(256);
__ref.runClassMethod (b4a.example.b4xmainpage.class, "_dbput" /*RemoteObject*/ ,(Object)(BA.ObjectToString("idToken")),(Object)(__ref.getField(false,"_status" /*RemoteObject*/ ).runMethod(false,"Get",(Object)((RemoteObject.createImmutable("idToken"))))));
 BA.debugLineNum = 458;BA.debugLine="DBPut(\"refreshToken\", Status.Get(\"refreshToken\"";
Debug.ShouldStop(512);
__ref.runClassMethod (b4a.example.b4xmainpage.class, "_dbput" /*RemoteObject*/ ,(Object)(BA.ObjectToString("refreshToken")),(Object)(__ref.getField(false,"_status" /*RemoteObject*/ ).runMethod(false,"Get",(Object)((RemoteObject.createImmutable("refreshToken"))))));
 BA.debugLineNum = 459;BA.debugLine="pruefeOfflineAenderung";
Debug.ShouldStop(1024);
__ref.runClassMethod (b4a.example.b4xmainpage.class, "_pruefeofflineaenderung" /*void*/ );
 break; }
case 2: {
 BA.debugLineNum = 462;BA.debugLine="jp.Initialize(responseContent)";
Debug.ShouldStop(8192);
_jp.runVoidMethod ("Initialize",(Object)(_responsecontent));
 BA.debugLineNum = 463;BA.debugLine="Dim vereine As Map = jp.NextObject";
Debug.ShouldStop(16384);
_vereine = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_vereine = _jp.runMethod(false,"NextObject");Debug.locals.put("vereine", _vereine);Debug.locals.put("vereine", _vereine);
 BA.debugLineNum = 464;BA.debugLine="If vereine.Size = 1 Then";
Debug.ShouldStop(32768);
if (RemoteObject.solveBoolean("=",_vereine.runMethod(true,"getSize"),BA.numberCast(double.class, 1))) { 
 BA.debugLineNum = 465;BA.debugLine="For Each k As String In vereine.Keys";
Debug.ShouldStop(65536);
{
final RemoteObject group23 = _vereine.runMethod(false,"Keys");
final int groupLen23 = group23.runMethod(true,"getSize").<Integer>get()
;int index23 = 0;
;
for (; index23 < groupLen23;index23++){
_k = BA.ObjectToString(group23.runMethod(false,"Get",index23));Debug.locals.put("k", _k);
Debug.locals.put("k", _k);
 BA.debugLineNum = 466;BA.debugLine="DBPut(\"VereinsID\", k)";
Debug.ShouldStop(131072);
__ref.runClassMethod (b4a.example.b4xmainpage.class, "_dbput" /*RemoteObject*/ ,(Object)(BA.ObjectToString("VereinsID")),(Object)((_k)));
 BA.debugLineNum = 467;BA.debugLine="holeBezeichnung(k, \"holeBezeichnung\")";
Debug.ShouldStop(262144);
__ref.runClassMethod (b4a.example.b4xmainpage.class, "_holebezeichnung" /*RemoteObject*/ ,(Object)(_k),(Object)(RemoteObject.createImmutable("holeBezeichnung")));
 }
}Debug.locals.put("k", _k);
;
 }else 
{ BA.debugLineNum = 469;BA.debugLine="Else If vereine.Size > 1 Then";
Debug.ShouldStop(1048576);
if (RemoteObject.solveBoolean(">",_vereine.runMethod(true,"getSize"),BA.numberCast(double.class, 1))) { 
 BA.debugLineNum = 470;BA.debugLine="VereineAndKeys.Clear";
Debug.ShouldStop(2097152);
__ref.getField(false,"_vereineandkeys" /*RemoteObject*/ ).runVoidMethod ("Clear");
 BA.debugLineNum = 471;BA.debugLine="lvwVereine.Clear";
Debug.ShouldStop(4194304);
__ref.getField(false,"_lvwvereine" /*RemoteObject*/ ).runVoidMethod ("Clear");
 BA.debugLineNum = 472;BA.debugLine="selectedVereinIndex = -1";
Debug.ShouldStop(8388608);
__ref.setField ("_selectedvereinindex" /*RemoteObject*/ ,BA.numberCast(int.class, -(double) (0 + 1)));
 BA.debugLineNum = 473;BA.debugLine="For Each k As String In vereine.Keys";
Debug.ShouldStop(16777216);
{
final RemoteObject group31 = _vereine.runMethod(false,"Keys");
final int groupLen31 = group31.runMethod(true,"getSize").<Integer>get()
;int index31 = 0;
;
for (; index31 < groupLen31;index31++){
_k = BA.ObjectToString(group31.runMethod(false,"Get",index31));Debug.locals.put("k", _k);
Debug.locals.put("k", _k);
 BA.debugLineNum = 474;BA.debugLine="holeBezeichnung(k, \"holeBezeichnungen\")";
Debug.ShouldStop(33554432);
__ref.runClassMethod (b4a.example.b4xmainpage.class, "_holebezeichnung" /*RemoteObject*/ ,(Object)(_k),(Object)(RemoteObject.createImmutable("holeBezeichnungen")));
 }
}Debug.locals.put("k", _k);
;
 BA.debugLineNum = 476;BA.debugLine="VerticalArrangementHeader.Visible = False";
Debug.ShouldStop(134217728);
__ref.getField(false,"_verticalarrangementheader" /*RemoteObject*/ ).runMethod(true,"setVisible",b4xmainpage.__c.getField(true,"False"));
 BA.debugLineNum = 477;BA.debugLine="VerticalArrangementLogin.Visible = False";
Debug.ShouldStop(268435456);
__ref.getField(false,"_verticalarrangementlogin" /*RemoteObject*/ ).runMethod(true,"setVisible",b4xmainpage.__c.getField(true,"False"));
 BA.debugLineNum = 478;BA.debugLine="VerticalArrangementVereine.Visible = True";
Debug.ShouldStop(536870912);
__ref.getField(false,"_verticalarrangementvereine" /*RemoteObject*/ ).runMethod(true,"setVisible",b4xmainpage.__c.getField(true,"True"));
 BA.debugLineNum = 479;BA.debugLine="startTimer";
Debug.ShouldStop(1073741824);
__ref.runClassMethod (b4a.example.b4xmainpage.class, "_starttimer" /*RemoteObject*/ );
 }else {
 BA.debugLineNum = 481;BA.debugLine="ToastMessageShow(\"DB-Fehler, keine Vereine hin";
Debug.ShouldStop(1);
b4xmainpage.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence("DB-Fehler, keine Vereine hinterlegt, Fehler 104")),(Object)(b4xmainpage.__c.getField(true,"True")));
 }}
;
 break; }
case 3: {
 BA.debugLineNum = 485;BA.debugLine="Dim bez As String = responseContent.Replace(QUO";
Debug.ShouldStop(16);
_bez = _responsecontent.runMethod(true,"replace",(Object)(b4xmainpage.__c.getField(true,"QUOTE")),(Object)(RemoteObject.createImmutable("")));Debug.locals.put("bez", _bez);Debug.locals.put("bez", _bez);
 BA.debugLineNum = 486;BA.debugLine="lvwVereine.AddSingleLine(bez)";
Debug.ShouldStop(32);
__ref.getField(false,"_lvwvereine" /*RemoteObject*/ ).runVoidMethod ("AddSingleLine",(Object)(BA.ObjectToCharSequence(_bez)));
 BA.debugLineNum = 487;BA.debugLine="Dim urlparts() As String = Regex.Split(\"/\", req";
Debug.ShouldStop(64);
_urlparts = b4xmainpage.__c.getField(false,"Regex").runMethod(false,"Split",(Object)(BA.ObjectToString("/")),(Object)(_requrl));Debug.locals.put("urlparts", _urlparts);Debug.locals.put("urlparts", _urlparts);
 BA.debugLineNum = 488;BA.debugLine="If urlparts.Length > 4 Then";
Debug.ShouldStop(128);
if (RemoteObject.solveBoolean(">",_urlparts.getField(true,"length"),BA.numberCast(double.class, 4))) { 
 BA.debugLineNum = 489;BA.debugLine="VereineAndKeys.Add(urlparts(4))";
Debug.ShouldStop(256);
__ref.getField(false,"_vereineandkeys" /*RemoteObject*/ ).runVoidMethod ("Add",(Object)((_urlparts.getArrayElement(true,BA.numberCast(int.class, 4)))));
 };
 break; }
case 4: {
 BA.debugLineNum = 493;BA.debugLine="Dim bez As String = responseContent.Replace(QUO";
Debug.ShouldStop(4096);
_bez = _responsecontent.runMethod(true,"replace",(Object)(b4xmainpage.__c.getField(true,"QUOTE")),(Object)(RemoteObject.createImmutable("")));Debug.locals.put("bez", _bez);Debug.locals.put("bez", _bez);
 BA.debugLineNum = 494;BA.debugLine="DBPut(\"Bezeichnung\", bez)";
Debug.ShouldStop(8192);
__ref.runClassMethod (b4a.example.b4xmainpage.class, "_dbput" /*RemoteObject*/ ,(Object)(BA.ObjectToString("Bezeichnung")),(Object)((_bez)));
 BA.debugLineNum = 495;BA.debugLine="Uhrzeit.Enabled = False";
Debug.ShouldStop(16384);
__ref.getField(false,"_uhrzeit" /*RemoteObject*/ ).runMethod(true,"setEnabled",b4xmainpage.__c.getField(true,"False"));
 BA.debugLineNum = 496;BA.debugLine="B4XPages.ShowPage(\"ScreenMain\")";
Debug.ShouldStop(32768);
b4xmainpage._b4xpages.runVoidMethod ("_showpage" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("ScreenMain")));
 break; }
case 5: {
 BA.debugLineNum = 499;BA.debugLine="holeTLN";
Debug.ShouldStop(262144);
__ref.runClassMethod (b4a.example.b4xmainpage.class, "_holetln" /*RemoteObject*/ );
 break; }
case 6: {
 BA.debugLineNum = 502;BA.debugLine="ladeTeilnehmer(responseContent)";
Debug.ShouldStop(2097152);
__ref.runClassMethod (b4a.example.b4xmainpage.class, "_ladeteilnehmer" /*RemoteObject*/ ,(Object)(_responsecontent));
 break; }
case 7: {
 BA.debugLineNum = 505;BA.debugLine="Dim aendMap As Map = CreateMap(\"Änderung\": Fals";
Debug.ShouldStop(16777216);
_aendmap = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_aendmap = b4xmainpage.__c.runMethod(false, "createMap", (Object)(new RemoteObject[] {RemoteObject.createImmutable(("Änderung")),(b4xmainpage.__c.getField(true,"False")),RemoteObject.createImmutable(("Datum")),(__ref.runClassMethod (b4a.example.b4xmainpage.class, "_zeitstempel" /*RemoteObject*/ ))}));Debug.locals.put("aendmap", _aendmap);Debug.locals.put("aendMap", _aendmap);
 BA.debugLineNum = 506;BA.debugLine="DBPut(\"letzteÄnderung\", aendMap)";
Debug.ShouldStop(33554432);
__ref.runClassMethod (b4a.example.b4xmainpage.class, "_dbput" /*RemoteObject*/ ,(Object)(BA.ObjectToString("letzteÄnderung")),(Object)((_aendmap.getObject())));
 BA.debugLineNum = 507;BA.debugLine="holeVerein";
Debug.ShouldStop(67108864);
__ref.runClassMethod (b4a.example.b4xmainpage.class, "_holeverein" /*RemoteObject*/ );
 break; }
}
;
 BA.debugLineNum = 509;BA.debugLine="End Sub";
Debug.ShouldStop(268435456);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _hidekeyboard(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("HideKeyboard (b4xmainpage) ","b4xmainpage",1,__ref.getField(false, "ba"),__ref,616);
if (RapidSub.canDelegate("hidekeyboard")) { return __ref.runUserSub(false, "b4xmainpage","hidekeyboard", __ref);}
RemoteObject _p = RemoteObject.declareNull("anywheresoftware.b4a.phone.Phone");
 BA.debugLineNum = 616;BA.debugLine="Private Sub HideKeyboard";
Debug.ShouldStop(128);
 BA.debugLineNum = 617;BA.debugLine="Dim p As Phone";
Debug.ShouldStop(256);
_p = RemoteObject.createNew ("anywheresoftware.b4a.phone.Phone");Debug.locals.put("p", _p);
 BA.debugLineNum = 618;BA.debugLine="p.HideKeyboard(B4XPages.GetNativeParent(Me))";
Debug.ShouldStop(512);
_p.runVoidMethod ("HideKeyboard",(Object)(b4xmainpage._b4xpages.runMethod(false,"_getnativeparent" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(__ref))));
 BA.debugLineNum = 619;BA.debugLine="End Sub";
Debug.ShouldStop(1024);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _holebezeichnung(RemoteObject __ref,RemoteObject _key,RemoteObject _typ) throws Exception{
try {
		Debug.PushSubsStack("holeBezeichnung (b4xmainpage) ","b4xmainpage",1,__ref.getField(false, "ba"),__ref,335);
if (RapidSub.canDelegate("holebezeichnung")) { return __ref.runUserSub(false, "b4xmainpage","holebezeichnung", __ref, _key, _typ);}
RemoteObject _url = RemoteObject.createImmutable("");
Debug.locals.put("key", _key);
Debug.locals.put("typ", _typ);
 BA.debugLineNum = 335;BA.debugLine="Private Sub holeBezeichnung(key As String, typ As";
Debug.ShouldStop(16384);
 BA.debugLineNum = 336;BA.debugLine="Dim url As String = \"https://wertungslisten-app-d";
Debug.ShouldStop(32768);
_url = RemoteObject.concat(RemoteObject.createImmutable("https://wertungslisten-app-default-rtdb.europe-west1.firebasedatabase.app/Vereine/"),_key,RemoteObject.createImmutable("/Bezeichnung.json?auth="),__ref.getField(false,"_status" /*RemoteObject*/ ).runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("idToken"))),(Object)((RemoteObject.createImmutable("")))));Debug.locals.put("url", _url);Debug.locals.put("url", _url);
 BA.debugLineNum = 337;BA.debugLine="SendHttpRequest(typ, \"GET\", url, \"\", \"\")";
Debug.ShouldStop(65536);
__ref.runClassMethod (b4a.example.b4xmainpage.class, "_sendhttprequest" /*void*/ ,(Object)(_typ),(Object)(BA.ObjectToString("GET")),(Object)(_url),(Object)(BA.ObjectToString("")),(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 338;BA.debugLine="End Sub";
Debug.ShouldStop(131072);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _holetln(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("holeTLN (b4xmainpage) ","b4xmainpage",1,__ref.getField(false, "ba"),__ref,340);
if (RapidSub.canDelegate("holetln")) { return __ref.runUserSub(false, "b4xmainpage","holetln", __ref);}
RemoteObject _vid = RemoteObject.createImmutable("");
RemoteObject _url = RemoteObject.createImmutable("");
 BA.debugLineNum = 340;BA.debugLine="Private Sub holeTLN";
Debug.ShouldStop(524288);
 BA.debugLineNum = 341;BA.debugLine="Dim vID As String = DBGet(\"VereinsID\", \"[...]\")";
Debug.ShouldStop(1048576);
_vid = BA.ObjectToString(__ref.runClassMethod (b4a.example.b4xmainpage.class, "_dbget" /*RemoteObject*/ ,(Object)(BA.ObjectToString("VereinsID")),(Object)((RemoteObject.createImmutable("[...]")))));Debug.locals.put("vid", _vid);Debug.locals.put("vID", _vid);
 BA.debugLineNum = 342;BA.debugLine="Dim url As String = URLteilnehmer.Replace(\"[...]\"";
Debug.ShouldStop(2097152);
_url = RemoteObject.concat(__ref.getField(true,"_urlteilnehmer" /*RemoteObject*/ ).runMethod(true,"replace",(Object)(BA.ObjectToString("[...]")),(Object)(_vid)),RemoteObject.createImmutable(".json?auth="),__ref.getField(false,"_status" /*RemoteObject*/ ).runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("idToken"))),(Object)((RemoteObject.createImmutable("")))));Debug.locals.put("url", _url);Debug.locals.put("url", _url);
 BA.debugLineNum = 343;BA.debugLine="SendHttpRequest(\"Teilnehmer\", \"GET\", url, \"\", \"\")";
Debug.ShouldStop(4194304);
__ref.runClassMethod (b4a.example.b4xmainpage.class, "_sendhttprequest" /*void*/ ,(Object)(BA.ObjectToString("Teilnehmer")),(Object)(BA.ObjectToString("GET")),(Object)(_url),(Object)(BA.ObjectToString("")),(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 344;BA.debugLine="End Sub";
Debug.ShouldStop(8388608);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _holeverein(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("holeVerein (b4xmainpage) ","b4xmainpage",1,__ref.getField(false, "ba"),__ref,330);
if (RapidSub.canDelegate("holeverein")) { return __ref.runUserSub(false, "b4xmainpage","holeverein", __ref);}
RemoteObject _url = RemoteObject.createImmutable("");
 BA.debugLineNum = 330;BA.debugLine="Private Sub holeVerein";
Debug.ShouldStop(512);
 BA.debugLineNum = 331;BA.debugLine="Dim url As String = \"https://wertungslisten-app-d";
Debug.ShouldStop(1024);
_url = RemoteObject.concat(RemoteObject.createImmutable("https://wertungslisten-app-default-rtdb.europe-west1.firebasedatabase.app/Vereine.json?shallow=true&auth="),__ref.getField(false,"_status" /*RemoteObject*/ ).runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("idToken"))),(Object)((RemoteObject.createImmutable("")))));Debug.locals.put("url", _url);Debug.locals.put("url", _url);
 BA.debugLineNum = 332;BA.debugLine="SendHttpRequest(\"holeVereine\", \"GET\", url, \"\", \"\"";
Debug.ShouldStop(2048);
__ref.runClassMethod (b4a.example.b4xmainpage.class, "_sendhttprequest" /*void*/ ,(Object)(BA.ObjectToString("holeVereine")),(Object)(BA.ObjectToString("GET")),(Object)(_url),(Object)(BA.ObjectToString("")),(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 333;BA.debugLine="End Sub";
Debug.ShouldStop(4096);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _initialize(RemoteObject __ref,RemoteObject _ba) throws Exception{
try {
		Debug.PushSubsStack("Initialize (b4xmainpage) ","b4xmainpage",1,__ref.getField(false, "ba"),__ref,59);
if (RapidSub.canDelegate("initialize")) { return __ref.runUserSub(false, "b4xmainpage","initialize", __ref, _ba);}
__ref.runVoidMethodAndSync("innerInitializeHelper", _ba);
;
 BA.debugLineNum = 59;BA.debugLine="Public Sub Initialize";
Debug.ShouldStop(67108864);
 BA.debugLineNum = 60;BA.debugLine="VereineAndKeys.Initialize";
Debug.ShouldStop(134217728);
__ref.getField(false,"_vereineandkeys" /*RemoteObject*/ ).runVoidMethod ("Initialize");
 BA.debugLineNum = 61;BA.debugLine="Status.Initialize";
Debug.ShouldStop(268435456);
__ref.getField(false,"_status" /*RemoteObject*/ ).runVoidMethod ("Initialize");
 BA.debugLineNum = 62;BA.debugLine="LoadTinyDB";
Debug.ShouldStop(536870912);
__ref.runClassMethod (b4a.example.b4xmainpage.class, "_loadtinydb" /*RemoteObject*/ );
 BA.debugLineNum = 63;BA.debugLine="Uhrzeit.Initialize(\"Uhrzeit\", 60000)";
Debug.ShouldStop(1073741824);
__ref.getField(false,"_uhrzeit" /*RemoteObject*/ ).runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(BA.ObjectToString("Uhrzeit")),(Object)(BA.numberCast(long.class, 60000)));
 BA.debugLineNum = 64;BA.debugLine="End Sub";
Debug.ShouldStop(-2147483648);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _ion_event(RemoteObject __ref,RemoteObject _methodname,RemoteObject _args) throws Exception{
try {
		Debug.PushSubsStack("ion_Event (b4xmainpage) ","b4xmainpage",1,__ref.getField(false, "ba"),__ref,679);
if (RapidSub.canDelegate("ion_event")) { return __ref.runUserSub(false, "b4xmainpage","ion_event", __ref, _methodname, _args);}
RemoteObject _rescode = RemoteObject.createImmutable(0);
Debug.locals.put("MethodName", _methodname);
Debug.locals.put("Args", _args);
 BA.debugLineNum = 679;BA.debugLine="Private Sub ion_Event (MethodName As String, Args(";
Debug.ShouldStop(64);
 BA.debugLineNum = 680;BA.debugLine="Dim resCode As Int = Args(0)";
Debug.ShouldStop(128);
_rescode = BA.numberCast(int.class, _args.getArrayElement(false,BA.numberCast(int.class, 0)));Debug.locals.put("rescode", _rescode);Debug.locals.put("resCode", _rescode);
 BA.debugLineNum = 681;BA.debugLine="If resCode = -1 Then";
Debug.ShouldStop(256);
if (RemoteObject.solveBoolean("=",_rescode,BA.numberCast(double.class, -(double) (0 + 1)))) { 
 BA.debugLineNum = 682;BA.debugLine="RefreshTokenProcedure";
Debug.ShouldStop(512);
__ref.runClassMethod (b4a.example.b4xmainpage.class, "_refreshtokenprocedure" /*RemoteObject*/ );
 };
 BA.debugLineNum = 684;BA.debugLine="Return Null";
Debug.ShouldStop(2048);
if (true) return b4xmainpage.__c.getField(false,"Null");
 BA.debugLineNum = 685;BA.debugLine="End Sub";
Debug.ShouldStop(4096);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _ladeteilnehmer(RemoteObject __ref,RemoteObject _response) throws Exception{
try {
		Debug.PushSubsStack("ladeTeilnehmer (b4xmainpage) ","b4xmainpage",1,__ref.getField(false, "ba"),__ref,514);
if (RapidSub.canDelegate("ladeteilnehmer")) { return __ref.runUserSub(false, "b4xmainpage","ladeteilnehmer", __ref, _response);}
RemoteObject _teilnehmer = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _jp = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.JSONParser");
RemoteObject _teilnehmerliste = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _key = RemoteObject.createImmutable("");
RemoteObject _lastid = RemoteObject.createImmutable(0);
RemoteObject _currentmax = RemoteObject.createImmutable(0);
RemoteObject _tmap = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _emptymap = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
Debug.locals.put("response", _response);
 BA.debugLineNum = 514;BA.debugLine="Private Sub ladeTeilnehmer(response As String)";
Debug.ShouldStop(2);
 BA.debugLineNum = 515;BA.debugLine="Dim Teilnehmer As List";
Debug.ShouldStop(4);
_teilnehmer = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("Teilnehmer", _teilnehmer);
 BA.debugLineNum = 516;BA.debugLine="Teilnehmer.Initialize";
Debug.ShouldStop(8);
_teilnehmer.runVoidMethod ("Initialize");
 BA.debugLineNum = 518;BA.debugLine="If response <> \"\" And response <> \"null\" Then";
Debug.ShouldStop(32);
if (RemoteObject.solveBoolean("!",_response,BA.ObjectToString("")) && RemoteObject.solveBoolean("!",_response,BA.ObjectToString("null"))) { 
 BA.debugLineNum = 519;BA.debugLine="Dim jp As JSONParser";
Debug.ShouldStop(64);
_jp = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.JSONParser");Debug.locals.put("jp", _jp);
 BA.debugLineNum = 520;BA.debugLine="jp.Initialize(response)";
Debug.ShouldStop(128);
_jp.runVoidMethod ("Initialize",(Object)(_response));
 BA.debugLineNum = 521;BA.debugLine="Dim teilnehmerliste As Map = jp.NextObject";
Debug.ShouldStop(256);
_teilnehmerliste = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_teilnehmerliste = _jp.runMethod(false,"NextObject");Debug.locals.put("teilnehmerliste", _teilnehmerliste);Debug.locals.put("teilnehmerliste", _teilnehmerliste);
 BA.debugLineNum = 523;BA.debugLine="For Each key As String In teilnehmerliste.Keys";
Debug.ShouldStop(1024);
{
final RemoteObject group7 = _teilnehmerliste.runMethod(false,"Keys");
final int groupLen7 = group7.runMethod(true,"getSize").<Integer>get()
;int index7 = 0;
;
for (; index7 < groupLen7;index7++){
_key = BA.ObjectToString(group7.runMethod(false,"Get",index7));Debug.locals.put("key", _key);
Debug.locals.put("key", _key);
 BA.debugLineNum = 524;BA.debugLine="Dim lastID As Int = key.Replace(\"t\", \"\")";
Debug.ShouldStop(2048);
_lastid = BA.numberCast(int.class, _key.runMethod(true,"replace",(Object)(BA.ObjectToString("t")),(Object)(RemoteObject.createImmutable(""))));Debug.locals.put("lastid", _lastid);Debug.locals.put("lastID", _lastid);
 BA.debugLineNum = 525;BA.debugLine="Dim currentMax As Int = TLNlastID.Replace(\"t\",";
Debug.ShouldStop(4096);
_currentmax = BA.numberCast(int.class, __ref.getField(true,"_tlnlastid" /*RemoteObject*/ ).runMethod(true,"replace",(Object)(BA.ObjectToString("t")),(Object)(RemoteObject.createImmutable(""))));Debug.locals.put("currentmax", _currentmax);Debug.locals.put("currentMax", _currentmax);
 BA.debugLineNum = 526;BA.debugLine="If lastID > currentMax Then";
Debug.ShouldStop(8192);
if (RemoteObject.solveBoolean(">",_lastid,BA.numberCast(double.class, _currentmax))) { 
 BA.debugLineNum = 527;BA.debugLine="TLNlastID = \"t\" & lastID";
Debug.ShouldStop(16384);
__ref.setField ("_tlnlastid" /*RemoteObject*/ ,RemoteObject.concat(RemoteObject.createImmutable("t"),_lastid));
 };
 BA.debugLineNum = 529;BA.debugLine="Dim tMap As Map = teilnehmerliste.Get(key)";
Debug.ShouldStop(65536);
_tmap = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_tmap = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), _teilnehmerliste.runMethod(false,"Get",(Object)((_key))));Debug.locals.put("tmap", _tmap);Debug.locals.put("tMap", _tmap);
 BA.debugLineNum = 530;BA.debugLine="Teilnehmer.Add(tMap.GetDefault(\"Name\", \"unbenan";
Debug.ShouldStop(131072);
_teilnehmer.runVoidMethod ("Add",(Object)(_tmap.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("Name"))),(Object)((RemoteObject.createImmutable("unbenannt"))))));
 }
}Debug.locals.put("key", _key);
;
 BA.debugLineNum = 532;BA.debugLine="addTeilnehmer(teilnehmerliste, Teilnehmer)";
Debug.ShouldStop(524288);
__ref.runClassMethod (b4a.example.b4xmainpage.class, "_addteilnehmer" /*RemoteObject*/ ,(Object)(_teilnehmerliste),(Object)(_teilnehmer));
 }else {
 BA.debugLineNum = 534;BA.debugLine="Dim emptyMap As Map";
Debug.ShouldStop(2097152);
_emptymap = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("emptyMap", _emptymap);
 BA.debugLineNum = 535;BA.debugLine="emptyMap.Initialize";
Debug.ShouldStop(4194304);
_emptymap.runVoidMethod ("Initialize");
 BA.debugLineNum = 536;BA.debugLine="addTeilnehmer(emptyMap, Teilnehmer)";
Debug.ShouldStop(8388608);
__ref.runClassMethod (b4a.example.b4xmainpage.class, "_addteilnehmer" /*RemoteObject*/ ,(Object)(_emptymap),(Object)(_teilnehmer));
 };
 BA.debugLineNum = 538;BA.debugLine="End Sub";
Debug.ShouldStop(33554432);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _loadtinydb(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("LoadTinyDB (b4xmainpage) ","b4xmainpage",1,__ref.getField(false, "ba"),__ref,622);
if (RapidSub.canDelegate("loadtinydb")) { return __ref.runUserSub(false, "b4xmainpage","loadtinydb", __ref);}
 BA.debugLineNum = 622;BA.debugLine="Private Sub LoadTinyDB";
Debug.ShouldStop(8192);
 BA.debugLineNum = 623;BA.debugLine="If File.Exists(File.DirInternal, DBFileName) Then";
Debug.ShouldStop(16384);
if (b4xmainpage.__c.getField(false,"File").runMethod(true,"Exists",(Object)(b4xmainpage.__c.getField(false,"File").runMethod(true,"getDirInternal")),(Object)(__ref.getField(true,"_dbfilename" /*RemoteObject*/ ))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 624;BA.debugLine="DBVerein = File.ReadMap(File.DirInternal, DBFile";
Debug.ShouldStop(32768);
__ref.setField ("_dbverein" /*RemoteObject*/ ,b4xmainpage.__c.getField(false,"File").runMethod(false,"ReadMap",(Object)(b4xmainpage.__c.getField(false,"File").runMethod(true,"getDirInternal")),(Object)(__ref.getField(true,"_dbfilename" /*RemoteObject*/ ))));
 }else {
 BA.debugLineNum = 626;BA.debugLine="DBVerein.Initialize";
Debug.ShouldStop(131072);
__ref.getField(false,"_dbverein" /*RemoteObject*/ ).runVoidMethod ("Initialize");
 };
 BA.debugLineNum = 628;BA.debugLine="End Sub";
Debug.ShouldStop(524288);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _lvwvereine_itemclick(RemoteObject __ref,RemoteObject _position,RemoteObject _value) throws Exception{
try {
		Debug.PushSubsStack("lvwVereine_ItemClick (b4xmainpage) ","b4xmainpage",1,__ref.getField(false, "ba"),__ref,291);
if (RapidSub.canDelegate("lvwvereine_itemclick")) { return __ref.runUserSub(false, "b4xmainpage","lvwvereine_itemclick", __ref, _position, _value);}
Debug.locals.put("Position", _position);
Debug.locals.put("Value", _value);
 BA.debugLineNum = 291;BA.debugLine="Private Sub lvwVereine_ItemClick (Position As Int,";
Debug.ShouldStop(4);
 BA.debugLineNum = 292;BA.debugLine="selectedVereinIndex = Position";
Debug.ShouldStop(8);
__ref.setField ("_selectedvereinindex" /*RemoteObject*/ ,_position);
 BA.debugLineNum = 293;BA.debugLine="btnVnOK.TextColor = colorgreen";
Debug.ShouldStop(16);
__ref.getField(false,"_btnvnok" /*RemoteObject*/ ).runMethod(true,"setTextColor",__ref.getField(true,"_colorgreen" /*RemoteObject*/ ));
 BA.debugLineNum = 294;BA.debugLine="btnVnOK.Enabled = True";
Debug.ShouldStop(32);
__ref.getField(false,"_btnvnok" /*RemoteObject*/ ).runMethod(true,"setEnabled",b4xmainpage.__c.getField(true,"True"));
 BA.debugLineNum = 295;BA.debugLine="End Sub";
Debug.ShouldStop(64);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static void  _pruefeofflineaenderung(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("pruefeOfflineAenderung (b4xmainpage) ","b4xmainpage",1,__ref.getField(false, "ba"),__ref,562);
if (RapidSub.canDelegate("pruefeofflineaenderung")) { __ref.runUserSub(false, "b4xmainpage","pruefeofflineaenderung", __ref); return;}
ResumableSub_pruefeOfflineAenderung rsub = new ResumableSub_pruefeOfflineAenderung(null,__ref);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_pruefeOfflineAenderung extends BA.ResumableSub {
public ResumableSub_pruefeOfflineAenderung(b4a.example.b4xmainpage parent,RemoteObject __ref) {
this.parent = parent;
this.__ref = __ref;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4a.example.b4xmainpage parent;
RemoteObject _aendmap = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _msg = RemoteObject.createImmutable("");
RemoteObject _res;
RemoteObject _wvdata = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("pruefeOfflineAenderung (b4xmainpage) ","b4xmainpage",1,__ref.getField(false, "ba"),__ref,562);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
;
 BA.debugLineNum = 563;BA.debugLine="Dim aendMap As Map = DBGet(\"letzteÄnderung\", Null";
Debug.ShouldStop(262144);
_aendmap = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_aendmap = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), __ref.runClassMethod (b4a.example.b4xmainpage.class, "_dbget" /*RemoteObject*/ ,(Object)(BA.ObjectToString("letzteÄnderung")),(Object)(parent.__c.getField(false,"Null"))));Debug.locals.put("aendmap", _aendmap);Debug.locals.put("aendMap", _aendmap);
 BA.debugLineNum = 564;BA.debugLine="If aendMap <> Null And aendMap.IsInitialized And";
Debug.ShouldStop(524288);
if (true) break;

case 1:
//if
this.state = 20;
if (RemoteObject.solveBoolean("N",_aendmap) && RemoteObject.solveBoolean(".",_aendmap.runMethod(true,"IsInitialized")) && RemoteObject.solveBoolean("=",parent.__c.getField(true,"True"),BA.ObjectToBoolean(_aendmap.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("Änderung"))),(Object)((parent.__c.getField(true,"False"))))))) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
 BA.debugLineNum = 565;BA.debugLine="If Zeitstempel <> aendMap.GetDefault(\"Datum\", Ze";
Debug.ShouldStop(1048576);
if (true) break;

case 4:
//if
this.state = 19;
if (RemoteObject.solveBoolean("!",__ref.runClassMethod (b4a.example.b4xmainpage.class, "_zeitstempel" /*RemoteObject*/ ),BA.ObjectToString(_aendmap.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("Datum"))),(Object)((__ref.runClassMethod (b4a.example.b4xmainpage.class, "_zeitstempel" /*RemoteObject*/ ))))))) { 
this.state = 6;
}if (true) break;

case 6:
//C
this.state = 7;
 BA.debugLineNum = 566;BA.debugLine="VerticalArrangementHeader.Visible = False";
Debug.ShouldStop(2097152);
__ref.getField(false,"_verticalarrangementheader" /*RemoteObject*/ ).runMethod(true,"setVisible",parent.__c.getField(true,"False"));
 BA.debugLineNum = 567;BA.debugLine="VerticalArrangementLogin.Visible = False";
Debug.ShouldStop(4194304);
__ref.getField(false,"_verticalarrangementlogin" /*RemoteObject*/ ).runMethod(true,"setVisible",parent.__c.getField(true,"False"));
 BA.debugLineNum = 568;BA.debugLine="VerticalArrangementLoading.Visible = True";
Debug.ShouldStop(8388608);
__ref.getField(false,"_verticalarrangementloading" /*RemoteObject*/ ).runMethod(true,"setVisible",parent.__c.getField(true,"True"));
 BA.debugLineNum = 570;BA.debugLine="Dim msg As String = \"Aus der letzen Verwendung";
Debug.ShouldStop(33554432);
_msg = RemoteObject.concat(RemoteObject.createImmutable("Aus der letzen Verwendung des Programms für den "),__ref.runClassMethod (b4a.example.b4xmainpage.class, "_dbget" /*RemoteObject*/ ,(Object)(BA.ObjectToString("VeranstaltungDatum")),(Object)((RemoteObject.createImmutable("- nicht gesetzt -")))),RemoteObject.createImmutable(" - "),__ref.runClassMethod (b4a.example.b4xmainpage.class, "_dbget" /*RemoteObject*/ ,(Object)(BA.ObjectToString("VeranstaltungName")),(Object)((RemoteObject.createImmutable("- nicht gesetzt -")))),RemoteObject.createImmutable(" - sind nicht gesicherte Daten vorhanden. Sollen diese Daten jetzt gesichert werden?"));Debug.locals.put("msg", _msg);Debug.locals.put("msg", _msg);
 BA.debugLineNum = 575;BA.debugLine="Msgbox2Async(msg, \"Nicht gesicherte Daten vorha";
Debug.ShouldStop(1073741824);
parent.__c.runVoidMethod ("Msgbox2Async",(Object)(BA.ObjectToCharSequence(_msg)),(Object)(BA.ObjectToCharSequence("Nicht gesicherte Daten vorhanden")),(Object)(BA.ObjectToString("Sichern")),(Object)(BA.ObjectToString("")),(Object)(BA.ObjectToString("Verwerfen")),RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper"), parent.__c.getField(false,"Null")),__ref.getField(false, "ba"),(Object)(parent.__c.getField(true,"False")));
 BA.debugLineNum = 576;BA.debugLine="Wait For Msgbox_Result (res As Int)";
Debug.ShouldStop(-2147483648);
parent.__c.runVoidMethod ("WaitFor","msgbox_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "b4xmainpage", "pruefeofflineaenderung"), null);
this.state = 21;
return;
case 21:
//C
this.state = 7;
_res = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("res", _res);
;
 BA.debugLineNum = 577;BA.debugLine="If res = DialogResponse.POSITIVE Then";
Debug.ShouldStop(1);
if (true) break;

case 7:
//if
this.state = 18;
if (RemoteObject.solveBoolean("=",_res,BA.numberCast(double.class, parent.__c.getField(false,"DialogResponse").getField(true,"POSITIVE")))) { 
this.state = 9;
}else 
{ BA.debugLineNum = 580;BA.debugLine="Else If res = DialogResponse.NEGATIVE Then";
Debug.ShouldStop(8);
if (RemoteObject.solveBoolean("=",_res,BA.numberCast(double.class, parent.__c.getField(false,"DialogResponse").getField(true,"NEGATIVE")))) { 
this.state = 17;
}}
if (true) break;

case 9:
//C
this.state = 10;
 BA.debugLineNum = 578;BA.debugLine="Dim wvData As List = DBGet(\"webviewData\", Null";
Debug.ShouldStop(2);
_wvdata = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_wvdata = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.List"), __ref.runClassMethod (b4a.example.b4xmainpage.class, "_dbget" /*RemoteObject*/ ,(Object)(BA.ObjectToString("webviewData")),(Object)(parent.__c.getField(false,"Null"))));Debug.locals.put("wvdata", _wvdata);Debug.locals.put("wvData", _wvdata);
 BA.debugLineNum = 579;BA.debugLine="If wvData <> Null Then saveWertungsliste(wvDat";
Debug.ShouldStop(4);
if (true) break;

case 10:
//if
this.state = 15;
if (RemoteObject.solveBoolean("N",_wvdata)) { 
this.state = 12;
;}if (true) break;

case 12:
//C
this.state = 15;
__ref.runClassMethod (b4a.example.b4xmainpage.class, "_savewertungsliste" /*RemoteObject*/ ,(Object)(_wvdata));
if (true) break;

case 15:
//C
this.state = 18;
;
 if (true) break;

case 17:
//C
this.state = 18;
 BA.debugLineNum = 581;BA.debugLine="DBPut(\"letzteÄnderung\", CreateMap(\"Änderung\":";
Debug.ShouldStop(16);
__ref.runClassMethod (b4a.example.b4xmainpage.class, "_dbput" /*RemoteObject*/ ,(Object)(BA.ObjectToString("letzteÄnderung")),(Object)((parent.__c.runMethod(false, "createMap", (Object)(new RemoteObject[] {RemoteObject.createImmutable(("Änderung")),(parent.__c.getField(true,"False")),RemoteObject.createImmutable(("Datum")),(__ref.runClassMethod (b4a.example.b4xmainpage.class, "_zeitstempel" /*RemoteObject*/ ))})).getObject())));
 BA.debugLineNum = 582;BA.debugLine="holeVerein";
Debug.ShouldStop(32);
__ref.runClassMethod (b4a.example.b4xmainpage.class, "_holeverein" /*RemoteObject*/ );
 if (true) break;

case 18:
//C
this.state = 19;
;
 BA.debugLineNum = 584;BA.debugLine="Return";
Debug.ShouldStop(128);
if (true) return ;
 if (true) break;

case 19:
//C
this.state = 20;
;
 if (true) break;

case 20:
//C
this.state = -1;
;
 BA.debugLineNum = 587;BA.debugLine="holeVerein";
Debug.ShouldStop(1024);
__ref.runClassMethod (b4a.example.b4xmainpage.class, "_holeverein" /*RemoteObject*/ );
 BA.debugLineNum = 588;BA.debugLine="End Sub";
Debug.ShouldStop(2048);
if (true) break;

            }
        }
    }
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}
public static void  _msgbox_result(RemoteObject __ref,RemoteObject _res) throws Exception{
}
public static RemoteObject  _refreshtokenprocedure(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("RefreshTokenProcedure (b4xmainpage) ","b4xmainpage",1,__ref.getField(false, "ba"),__ref,324);
if (RapidSub.canDelegate("refreshtokenprocedure")) { return __ref.runUserSub(false, "b4xmainpage","refreshtokenprocedure", __ref);}
RemoteObject _url = RemoteObject.createImmutable("");
RemoteObject _body = RemoteObject.createImmutable("");
 BA.debugLineNum = 324;BA.debugLine="Private Sub RefreshTokenProcedure";
Debug.ShouldStop(8);
 BA.debugLineNum = 325;BA.debugLine="Dim url As String = \"https://securetoken.googleap";
Debug.ShouldStop(16);
_url = RemoteObject.concat(RemoteObject.createImmutable("https://securetoken.googleapis.com/v1/token?key="),__ref.getField(true,"_apikey" /*RemoteObject*/ ));Debug.locals.put("url", _url);Debug.locals.put("url", _url);
 BA.debugLineNum = 326;BA.debugLine="Dim body As String = \"grant_type=refresh_token&re";
Debug.ShouldStop(32);
_body = RemoteObject.concat(RemoteObject.createImmutable("grant_type=refresh_token&refresh_token="),__ref.getField(false,"_status" /*RemoteObject*/ ).runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("refreshToken"))),(Object)((RemoteObject.createImmutable("")))));Debug.locals.put("body", _body);Debug.locals.put("body", _body);
 BA.debugLineNum = 327;BA.debugLine="SendHttpRequest(\"refresh_token\", \"POST\", url, bod";
Debug.ShouldStop(64);
__ref.runClassMethod (b4a.example.b4xmainpage.class, "_sendhttprequest" /*void*/ ,(Object)(BA.ObjectToString("refresh_token")),(Object)(BA.ObjectToString("POST")),(Object)(_url),(Object)(_body),(Object)(RemoteObject.createImmutable("application/x-www-form-urlencoded")));
 BA.debugLineNum = 328;BA.debugLine="End Sub";
Debug.ShouldStop(128);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _savewertungsliste(RemoteObject __ref,RemoteObject _webviewdata) throws Exception{
try {
		Debug.PushSubsStack("saveWertungsliste (b4xmainpage) ","b4xmainpage",1,__ref.getField(false, "ba"),__ref,346);
if (RapidSub.canDelegate("savewertungsliste")) { return __ref.runUserSub(false, "b4xmainpage","savewertungsliste", __ref, _webviewdata);}
RemoteObject _verdatum = RemoteObject.createImmutable("");
RemoteObject _keyparts = null;
RemoteObject _datekey = RemoteObject.createImmutable("");
RemoteObject _vid = RemoteObject.createImmutable("");
RemoteObject _url = RemoteObject.createImmutable("");
RemoteObject _body = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
int _i = 0;
RemoteObject _platzval = RemoteObject.createImmutable(0);
RemoteObject _padded = RemoteObject.createImmutable("");
RemoteObject _id = RemoteObject.createImmutable("");
RemoteObject _eintrag = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _jg = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.JSONParser.JSONGenerator");
Debug.locals.put("webViewData", _webviewdata);
 BA.debugLineNum = 346;BA.debugLine="Private Sub saveWertungsliste(webViewData As List)";
Debug.ShouldStop(33554432);
 BA.debugLineNum = 347;BA.debugLine="Dim verDatum As String = DBGet(\"VeranstaltungDatu";
Debug.ShouldStop(67108864);
_verdatum = BA.ObjectToString(__ref.runClassMethod (b4a.example.b4xmainpage.class, "_dbget" /*RemoteObject*/ ,(Object)(BA.ObjectToString("VeranstaltungDatum")),(Object)((__ref.runClassMethod (b4a.example.b4xmainpage.class, "_formatdatecustom" /*RemoteObject*/ ,(Object)(b4xmainpage.__c.getField(false,"DateTime").runMethod(true,"getNow")),(Object)(RemoteObject.createImmutable("dd.MM.yyyy")))))));Debug.locals.put("verdatum", _verdatum);Debug.locals.put("verDatum", _verdatum);
 BA.debugLineNum = 348;BA.debugLine="Dim keyParts() As String = Regex.Split(\"\\.\", verD";
Debug.ShouldStop(134217728);
_keyparts = b4xmainpage.__c.getField(false,"Regex").runMethod(false,"Split",(Object)(BA.ObjectToString("\\.")),(Object)(_verdatum));Debug.locals.put("keyparts", _keyparts);Debug.locals.put("keyParts", _keyparts);
 BA.debugLineNum = 349;BA.debugLine="Dim dateKey As String = keyParts(2) & keyParts(1)";
Debug.ShouldStop(268435456);
_datekey = RemoteObject.concat(_keyparts.getArrayElement(true,BA.numberCast(int.class, 2)),_keyparts.getArrayElement(true,BA.numberCast(int.class, 1)),_keyparts.getArrayElement(true,BA.numberCast(int.class, 0)));Debug.locals.put("datekey", _datekey);Debug.locals.put("dateKey", _datekey);
 BA.debugLineNum = 351;BA.debugLine="Dim vID As String = DBGet(\"VereinsID\", \"[...]\")";
Debug.ShouldStop(1073741824);
_vid = BA.ObjectToString(__ref.runClassMethod (b4a.example.b4xmainpage.class, "_dbget" /*RemoteObject*/ ,(Object)(BA.ObjectToString("VereinsID")),(Object)((RemoteObject.createImmutable("[...]")))));Debug.locals.put("vid", _vid);Debug.locals.put("vID", _vid);
 BA.debugLineNum = 352;BA.debugLine="Dim url As String = URLErgebnisse.Replace(\"[...]\"";
Debug.ShouldStop(-2147483648);
_url = RemoteObject.concat(__ref.getField(true,"_urlergebnisse" /*RemoteObject*/ ).runMethod(true,"replace",(Object)(BA.ObjectToString("[...]")),(Object)(_vid)),RemoteObject.createImmutable("e"),_datekey,RemoteObject.createImmutable(".json?auth="),__ref.getField(false,"_status" /*RemoteObject*/ ).runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("idToken"))),(Object)((RemoteObject.createImmutable("")))));Debug.locals.put("url", _url);Debug.locals.put("url", _url);
 BA.debugLineNum = 354;BA.debugLine="Dim body As Map";
Debug.ShouldStop(2);
_body = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("body", _body);
 BA.debugLineNum = 355;BA.debugLine="body.Initialize";
Debug.ShouldStop(4);
_body.runVoidMethod ("Initialize");
 BA.debugLineNum = 356;BA.debugLine="body.Put(\"Datum\", verDatum)";
Debug.ShouldStop(8);
_body.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("Datum"))),(Object)((_verdatum)));
 BA.debugLineNum = 357;BA.debugLine="body.Put(\"Name\", DBGet(\"VeranstaltungName\", \"- ni";
Debug.ShouldStop(16);
_body.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("Name"))),(Object)(__ref.runClassMethod (b4a.example.b4xmainpage.class, "_dbget" /*RemoteObject*/ ,(Object)(BA.ObjectToString("VeranstaltungName")),(Object)((RemoteObject.createImmutable("- nicht gesetzt -"))))));
 BA.debugLineNum = 358;BA.debugLine="body.Put(\"Status\", \"offen\")";
Debug.ShouldStop(32);
_body.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("Status"))),(Object)((RemoteObject.createImmutable("offen"))));
 BA.debugLineNum = 360;BA.debugLine="For i = 4 To webViewData.Size - 1 Step 4";
Debug.ShouldStop(128);
{
final int step11 = 4;
final int limit11 = RemoteObject.solve(new RemoteObject[] {_webviewdata.runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 4 ;
for (;(step11 > 0 && _i <= limit11) || (step11 < 0 && _i >= limit11) ;_i = ((int)(0 + _i + step11))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 361;BA.debugLine="Dim platzVal As Int = webViewData.Get(i)";
Debug.ShouldStop(256);
_platzval = BA.numberCast(int.class, _webviewdata.runMethod(false,"Get",(Object)(BA.numberCast(int.class, _i))));Debug.locals.put("platzval", _platzval);Debug.locals.put("platzVal", _platzval);
 BA.debugLineNum = 362;BA.debugLine="Dim padded As String = \"0000\" & platzVal";
Debug.ShouldStop(512);
_padded = RemoteObject.concat(RemoteObject.createImmutable("0000"),_platzval);Debug.locals.put("padded", _padded);Debug.locals.put("padded", _padded);
 BA.debugLineNum = 363;BA.debugLine="Dim id As String = \"p\" & padded.SubString(padded";
Debug.ShouldStop(1024);
_id = RemoteObject.concat(RemoteObject.createImmutable("p"),_padded.runMethod(true,"substring",(Object)(RemoteObject.solve(new RemoteObject[] {_padded.runMethod(true,"length"),RemoteObject.createImmutable(4)}, "-",1, 1))));Debug.locals.put("id", _id);Debug.locals.put("id", _id);
 BA.debugLineNum = 365;BA.debugLine="Dim eintrag As Map = CreateMap( _ 			\"Platz\": pl";
Debug.ShouldStop(4096);
_eintrag = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_eintrag = b4xmainpage.__c.runMethod(false, "createMap", (Object)(new RemoteObject[] {RemoteObject.createImmutable(("Platz")),(_platzval),RemoteObject.createImmutable(("Teilnehmer")),_webviewdata.runMethod(false,"Get",(Object)(RemoteObject.solve(new RemoteObject[] {RemoteObject.createImmutable(_i),RemoteObject.createImmutable(1)}, "+",1, 1))),RemoteObject.createImmutable(("Gewicht")),_webviewdata.runMethod(false,"Get",(Object)(RemoteObject.solve(new RemoteObject[] {RemoteObject.createImmutable(_i),RemoteObject.createImmutable(2)}, "+",1, 1))),RemoteObject.createImmutable(("Rang")),_webviewdata.runMethod(false,"Get",(Object)(RemoteObject.solve(new RemoteObject[] {RemoteObject.createImmutable(_i),RemoteObject.createImmutable(3)}, "+",1, 1)))}));Debug.locals.put("eintrag", _eintrag);Debug.locals.put("eintrag", _eintrag);
 BA.debugLineNum = 370;BA.debugLine="body.Put(id, eintrag)";
Debug.ShouldStop(131072);
_body.runVoidMethod ("Put",(Object)((_id)),(Object)((_eintrag.getObject())));
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 373;BA.debugLine="Dim jg As JSONGenerator";
Debug.ShouldStop(1048576);
_jg = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.JSONParser.JSONGenerator");Debug.locals.put("jg", _jg);
 BA.debugLineNum = 374;BA.debugLine="jg.Initialize(body)";
Debug.ShouldStop(2097152);
_jg.runVoidMethod ("Initialize",(Object)(_body));
 BA.debugLineNum = 375;BA.debugLine="SendHttpRequest(\"UpdateErgebnisse\", \"PUT\", url, j";
Debug.ShouldStop(4194304);
__ref.runClassMethod (b4a.example.b4xmainpage.class, "_sendhttprequest" /*void*/ ,(Object)(BA.ObjectToString("UpdateErgebnisse")),(Object)(BA.ObjectToString("PUT")),(Object)(_url),(Object)(_jg.runMethod(true,"ToString")),(Object)(RemoteObject.createImmutable("application/json")));
 BA.debugLineNum = 376;BA.debugLine="End Sub";
Debug.ShouldStop(8388608);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static void  _sendhttprequest(RemoteObject __ref,RemoteObject _typ,RemoteObject _method,RemoteObject _url,RemoteObject _payload,RemoteObject _contenttype) throws Exception{
try {
		Debug.PushSubsStack("SendHttpRequest (b4xmainpage) ","b4xmainpage",1,__ref.getField(false, "ba"),__ref,379);
if (RapidSub.canDelegate("sendhttprequest")) { __ref.runUserSub(false, "b4xmainpage","sendhttprequest", __ref, _typ, _method, _url, _payload, _contenttype); return;}
ResumableSub_SendHttpRequest rsub = new ResumableSub_SendHttpRequest(null,__ref,_typ,_method,_url,_payload,_contenttype);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_SendHttpRequest extends BA.ResumableSub {
public ResumableSub_SendHttpRequest(b4a.example.b4xmainpage parent,RemoteObject __ref,RemoteObject _typ,RemoteObject _method,RemoteObject _url,RemoteObject _payload,RemoteObject _contenttype) {
this.parent = parent;
this.__ref = __ref;
this._typ = _typ;
this._method = _method;
this._url = _url;
this._payload = _payload;
this._contenttype = _contenttype;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4a.example.b4xmainpage parent;
RemoteObject _typ;
RemoteObject _method;
RemoteObject _url;
RemoteObject _payload;
RemoteObject _contenttype;
RemoteObject _j;
RemoteObject _statuscode = RemoteObject.createImmutable(0);
RemoteObject _errtxt = RemoteObject.createImmutable("");
RemoteObject _savedid = RemoteObject.createImmutable("");
RemoteObject _savedbez = RemoteObject.createImmutable("");
RemoteObject _res;

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("SendHttpRequest (b4xmainpage) ","b4xmainpage",1,__ref.getField(false, "ba"),__ref,379);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
;
Debug.locals.put("typ", _typ);
Debug.locals.put("method", _method);
Debug.locals.put("url", _url);
Debug.locals.put("payload", _payload);
Debug.locals.put("contentType", _contenttype);
 BA.debugLineNum = 380;BA.debugLine="DBdatenTyp = typ";
Debug.ShouldStop(134217728);
__ref.setField ("_dbdatentyp" /*RemoteObject*/ ,_typ);
 BA.debugLineNum = 381;BA.debugLine="Dim j As HttpJob";
Debug.ShouldStop(268435456);
_j = RemoteObject.createNew ("b4a.example.httpjob");Debug.locals.put("j", _j);
 BA.debugLineNum = 382;BA.debugLine="j.Initialize(typ, Me)";
Debug.ShouldStop(536870912);
_j.runClassMethod (b4a.example.httpjob.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(_typ),(Object)(__ref));
 BA.debugLineNum = 384;BA.debugLine="Select method";
Debug.ShouldStop(-2147483648);
if (true) break;

case 1:
//select
this.state = 20;
switch (BA.switchObjectToInt(_method,BA.ObjectToString("GET"),BA.ObjectToString("POST"),BA.ObjectToString("PUT"))) {
case 0: {
this.state = 3;
if (true) break;
}
case 1: {
this.state = 5;
if (true) break;
}
case 2: {
this.state = 13;
if (true) break;
}
}
if (true) break;

case 3:
//C
this.state = 20;
 BA.debugLineNum = 386;BA.debugLine="j.Download(url)";
Debug.ShouldStop(2);
_j.runClassMethod (b4a.example.httpjob.class, "_download" /*RemoteObject*/ ,(Object)(_url));
 if (true) break;

case 5:
//C
this.state = 6;
 BA.debugLineNum = 388;BA.debugLine="j.PostString(url, payload)";
Debug.ShouldStop(8);
_j.runClassMethod (b4a.example.httpjob.class, "_poststring" /*RemoteObject*/ ,(Object)(_url),(Object)(_payload));
 BA.debugLineNum = 389;BA.debugLine="If contentType <> \"\" Then j.GetRequest.SetConte";
Debug.ShouldStop(16);
if (true) break;

case 6:
//if
this.state = 11;
if (RemoteObject.solveBoolean("!",_contenttype,BA.ObjectToString(""))) { 
this.state = 8;
;}if (true) break;

case 8:
//C
this.state = 11;
_j.runClassMethod (b4a.example.httpjob.class, "_getrequest" /*RemoteObject*/ ).runVoidMethod ("SetContentType",(Object)(_contenttype));
if (true) break;

case 11:
//C
this.state = 20;
;
 if (true) break;

case 13:
//C
this.state = 14;
 BA.debugLineNum = 391;BA.debugLine="j.PutString(url, payload)";
Debug.ShouldStop(64);
_j.runClassMethod (b4a.example.httpjob.class, "_putstring" /*RemoteObject*/ ,(Object)(_url),(Object)(_payload));
 BA.debugLineNum = 392;BA.debugLine="If contentType <> \"\" Then j.GetRequest.SetConte";
Debug.ShouldStop(128);
if (true) break;

case 14:
//if
this.state = 19;
if (RemoteObject.solveBoolean("!",_contenttype,BA.ObjectToString(""))) { 
this.state = 16;
;}if (true) break;

case 16:
//C
this.state = 19;
_j.runClassMethod (b4a.example.httpjob.class, "_getrequest" /*RemoteObject*/ ).runVoidMethod ("SetContentType",(Object)(_contenttype));
if (true) break;

case 19:
//C
this.state = 20;
;
 if (true) break;

case 20:
//C
this.state = 21;
;
 BA.debugLineNum = 395;BA.debugLine="Wait For (j) JobDone(j As HttpJob)";
Debug.ShouldStop(1024);
parent.__c.runVoidMethod ("WaitFor","jobdone", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "b4xmainpage", "sendhttprequest"), (_j));
this.state = 56;
return;
case 56:
//C
this.state = 21;
_j = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("j", _j);
;
 BA.debugLineNum = 397;BA.debugLine="If j.Success Then";
Debug.ShouldStop(4096);
if (true) break;

case 21:
//if
this.state = 55;
if (_j.getField(true,"_success" /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
this.state = 23;
}else {
this.state = 25;
}if (true) break;

case 23:
//C
this.state = 55;
 BA.debugLineNum = 398;BA.debugLine="HandleWebResponse(typ, url, j.GetString)";
Debug.ShouldStop(8192);
__ref.runClassMethod (b4a.example.b4xmainpage.class, "_handlewebresponse" /*RemoteObject*/ ,(Object)(_typ),(Object)(_url),(Object)(_j.runClassMethod (b4a.example.httpjob.class, "_getstring" /*RemoteObject*/ )));
 if (true) break;

case 25:
//C
this.state = 26;
 BA.debugLineNum = 400;BA.debugLine="Dim statusCode As Int = j.Response.StatusCode";
Debug.ShouldStop(32768);
_statuscode = _j.getField(false,"_response" /*RemoteObject*/ ).runMethod(true,"getStatusCode");Debug.locals.put("statuscode", _statuscode);Debug.locals.put("statusCode", _statuscode);
 BA.debugLineNum = 401;BA.debugLine="If statusCode >= 400 And statusCode < 500 Then";
Debug.ShouldStop(65536);
if (true) break;

case 26:
//if
this.state = 54;
if (RemoteObject.solveBoolean("g",_statuscode,BA.numberCast(double.class, 400)) && RemoteObject.solveBoolean("<",_statuscode,BA.numberCast(double.class, 500))) { 
this.state = 28;
}else {
this.state = 43;
}if (true) break;

case 28:
//C
this.state = 29;
 BA.debugLineNum = 402;BA.debugLine="Dim errTxt As String = j.ErrorMessage";
Debug.ShouldStop(131072);
_errtxt = _j.getField(true,"_errormessage" /*RemoteObject*/ );Debug.locals.put("errtxt", _errtxt);Debug.locals.put("errTxt", _errtxt);
 BA.debugLineNum = 403;BA.debugLine="If errTxt.Contains(\"INVALID_EMAIL\") Then";
Debug.ShouldStop(262144);
if (true) break;

case 29:
//if
this.state = 38;
if (_errtxt.runMethod(true,"contains",(Object)(RemoteObject.createImmutable("INVALID_EMAIL"))).<Boolean>get().booleanValue()) { 
this.state = 31;
}else 
{ BA.debugLineNum = 405;BA.debugLine="Else If errTxt.Contains(\"INVALID_LOGIN_CREDENTI";
Debug.ShouldStop(1048576);
if (RemoteObject.solveBoolean(".",_errtxt.runMethod(true,"contains",(Object)(RemoteObject.createImmutable("INVALID_LOGIN_CREDENTIALS")))) || RemoteObject.solveBoolean(".",_errtxt.runMethod(true,"contains",(Object)(RemoteObject.createImmutable("INVALID_PASSWORD")))) || RemoteObject.solveBoolean(".",_errtxt.runMethod(true,"contains",(Object)(RemoteObject.createImmutable("EMAIL_NOT_FOUND"))))) { 
this.state = 33;
}else 
{ BA.debugLineNum = 407;BA.debugLine="Else If errTxt.Contains(\"TOO_MANY_ATTEMPTS_TRY_";
Debug.ShouldStop(4194304);
if (_errtxt.runMethod(true,"contains",(Object)(RemoteObject.createImmutable("TOO_MANY_ATTEMPTS_TRY_LATER"))).<Boolean>get().booleanValue()) { 
this.state = 35;
}else {
this.state = 37;
}}}
if (true) break;

case 31:
//C
this.state = 38;
 BA.debugLineNum = 404;BA.debugLine="MsgboxAsync(\"Die eingegebene eMail-Adresse hat";
Debug.ShouldStop(524288);
parent.__c.runVoidMethod ("MsgboxAsync",(Object)(BA.ObjectToCharSequence("Die eingegebene eMail-Adresse hat kein gültiges Format.")),(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("Anmeldung fehlgeschlagen"))),__ref.getField(false, "ba"));
 if (true) break;

case 33:
//C
this.state = 38;
 BA.debugLineNum = 406;BA.debugLine="MsgboxAsync(\"eMail-Adresse oder Passwort ist f";
Debug.ShouldStop(2097152);
parent.__c.runVoidMethod ("MsgboxAsync",(Object)(BA.ObjectToCharSequence("eMail-Adresse oder Passwort ist falsch!")),(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("Anmeldung fehlgeschlagen"))),__ref.getField(false, "ba"));
 if (true) break;

case 35:
//C
this.state = 38;
 BA.debugLineNum = 408;BA.debugLine="MsgboxAsync(\"Zu viele Fehlversuche. Bitte spät";
Debug.ShouldStop(8388608);
parent.__c.runVoidMethod ("MsgboxAsync",(Object)(BA.ObjectToCharSequence("Zu viele Fehlversuche. Bitte später erneut versuchen.")),(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("Anmeldung gesperrt"))),__ref.getField(false, "ba"));
 if (true) break;

case 37:
//C
this.state = 38;
 BA.debugLineNum = 410;BA.debugLine="MsgboxAsync(\"Anmeldefehler: \" & errTxt, \"Anmel";
Debug.ShouldStop(33554432);
parent.__c.runVoidMethod ("MsgboxAsync",(Object)(BA.ObjectToCharSequence(RemoteObject.concat(RemoteObject.createImmutable("Anmeldefehler: "),_errtxt))),(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("Anmeldung fehlgeschlagen"))),__ref.getField(false, "ba"));
 if (true) break;
;
 BA.debugLineNum = 412;BA.debugLine="If typ = \"refresh_token\" Then";
Debug.ShouldStop(134217728);

case 38:
//if
this.state = 41;
if (RemoteObject.solveBoolean("=",_typ,BA.ObjectToString("refresh_token"))) { 
this.state = 40;
}if (true) break;

case 40:
//C
this.state = 41;
 BA.debugLineNum = 413;BA.debugLine="VerticalArrangementLoading.Visible = False";
Debug.ShouldStop(268435456);
__ref.getField(false,"_verticalarrangementloading" /*RemoteObject*/ ).runMethod(true,"setVisible",parent.__c.getField(true,"False"));
 BA.debugLineNum = 414;BA.debugLine="VerticalArrangementLogin.Visible = True";
Debug.ShouldStop(536870912);
__ref.getField(false,"_verticalarrangementlogin" /*RemoteObject*/ ).runMethod(true,"setVisible",parent.__c.getField(true,"True"));
 if (true) break;

case 41:
//C
this.state = 54;
;
 if (true) break;

case 43:
//C
this.state = 44;
 BA.debugLineNum = 417;BA.debugLine="Status.Put(\"ProgOffline\", True)";
Debug.ShouldStop(1);
__ref.getField(false,"_status" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("ProgOffline"))),(Object)((parent.__c.getField(true,"True"))));
 BA.debugLineNum = 418;BA.debugLine="lblKeineVerbindung.Visible = True";
Debug.ShouldStop(2);
__ref.getField(false,"_lblkeineverbindung" /*RemoteObject*/ ).runMethod(true,"setVisible",parent.__c.getField(true,"True"));
 BA.debugLineNum = 419;BA.debugLine="lblLogin.Visible = False";
Debug.ShouldStop(4);
__ref.getField(false,"_lbllogin" /*RemoteObject*/ ).runMethod(true,"setVisible",parent.__c.getField(true,"False"));
 BA.debugLineNum = 421;BA.debugLine="Dim savedID As String = DBGet(\"VereinsID\", \"\")";
Debug.ShouldStop(16);
_savedid = BA.ObjectToString(__ref.runClassMethod (b4a.example.b4xmainpage.class, "_dbget" /*RemoteObject*/ ,(Object)(BA.ObjectToString("VereinsID")),(Object)((RemoteObject.createImmutable("")))));Debug.locals.put("savedid", _savedid);Debug.locals.put("savedID", _savedid);
 BA.debugLineNum = 422;BA.debugLine="Dim savedBez As String = DBGet(\"Bezeichnung\", \"";
Debug.ShouldStop(32);
_savedbez = BA.ObjectToString(__ref.runClassMethod (b4a.example.b4xmainpage.class, "_dbget" /*RemoteObject*/ ,(Object)(BA.ObjectToString("Bezeichnung")),(Object)((RemoteObject.createImmutable("")))));Debug.locals.put("savedbez", _savedbez);Debug.locals.put("savedBez", _savedbez);
 BA.debugLineNum = 423;BA.debugLine="If savedID.Trim <> \"\" And savedBez.Trim <> \"\" T";
Debug.ShouldStop(64);
if (true) break;

case 44:
//if
this.state = 53;
if (RemoteObject.solveBoolean("!",_savedid.runMethod(true,"trim"),BA.ObjectToString("")) && RemoteObject.solveBoolean("!",_savedbez.runMethod(true,"trim"),BA.ObjectToString(""))) { 
this.state = 46;
}else {
this.state = 52;
}if (true) break;

case 46:
//C
this.state = 47;
 BA.debugLineNum = 424;BA.debugLine="Msgbox2Async(\"Die Datenbank ist nicht erreichb";
Debug.ShouldStop(128);
parent.__c.runVoidMethod ("Msgbox2Async",(Object)(BA.ObjectToCharSequence("Die Datenbank ist nicht erreichbar. Kein Problem! Das Programm arbeitet offline und synchronisiert sich später mit der Datenbank. Es ist jedoch nur die zuletzt verwendete Wertungsliste verfügbar!")),(Object)(BA.ObjectToCharSequence("Internet-Verbindung nicht möglich!")),(Object)(BA.ObjectToString("Offline nutzen")),(Object)(BA.ObjectToString("")),(Object)(BA.ObjectToString("")),RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper"), parent.__c.getField(false,"Null")),__ref.getField(false, "ba"),(Object)(parent.__c.getField(true,"True")));
 BA.debugLineNum = 425;BA.debugLine="Wait For Msgbox_Result (res As Int)";
Debug.ShouldStop(256);
parent.__c.runVoidMethod ("WaitFor","msgbox_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "b4xmainpage", "sendhttprequest"), null);
this.state = 57;
return;
case 57:
//C
this.state = 47;
_res = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("res", _res);
;
 BA.debugLineNum = 426;BA.debugLine="If res = DialogResponse.POSITIVE Then";
Debug.ShouldStop(512);
if (true) break;

case 47:
//if
this.state = 50;
if (RemoteObject.solveBoolean("=",_res,BA.numberCast(double.class, parent.__c.getField(false,"DialogResponse").getField(true,"POSITIVE")))) { 
this.state = 49;
}if (true) break;

case 49:
//C
this.state = 50;
 BA.debugLineNum = 427;BA.debugLine="Uhrzeit.Enabled = False";
Debug.ShouldStop(1024);
__ref.getField(false,"_uhrzeit" /*RemoteObject*/ ).runMethod(true,"setEnabled",parent.__c.getField(true,"False"));
 BA.debugLineNum = 428;BA.debugLine="B4XPages.ShowPage(\"ScreenMain\")";
Debug.ShouldStop(2048);
parent._b4xpages.runVoidMethod ("_showpage" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("ScreenMain")));
 if (true) break;

case 50:
//C
this.state = 53;
;
 if (true) break;

case 52:
//C
this.state = 53;
 BA.debugLineNum = 431;BA.debugLine="MsgboxAsync(\"Die Datenbank ist nicht erreichba";
Debug.ShouldStop(16384);
parent.__c.runVoidMethod ("MsgboxAsync",(Object)(BA.ObjectToCharSequence(RemoteObject.concat(RemoteObject.createImmutable("Die Datenbank ist nicht erreichbar. Das Programm kann nicht gestartet werden!"),parent.__c.getField(true,"CRLF"),RemoteObject.createImmutable("("),_j.getField(true,"_errormessage" /*RemoteObject*/ ),RemoteObject.createImmutable(")")))),(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("Internet-Verbindung nicht möglich!"))),__ref.getField(false, "ba"));
 if (true) break;

case 53:
//C
this.state = 54;
;
 if (true) break;

case 54:
//C
this.state = 55;
;
 if (true) break;

case 55:
//C
this.state = -1;
;
 BA.debugLineNum = 435;BA.debugLine="j.Release";
Debug.ShouldStop(262144);
_j.runClassMethod (b4a.example.httpjob.class, "_release" /*RemoteObject*/ );
 BA.debugLineNum = 436;BA.debugLine="End Sub";
Debug.ShouldStop(524288);
if (true) break;

            }
        }
    }
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}
public static void  _jobdone(RemoteObject __ref,RemoteObject _j) throws Exception{
}
public static RemoteObject  _startactivityforresult(RemoteObject __ref,RemoteObject _i) throws Exception{
try {
		Debug.PushSubsStack("StartActivityForResult (b4xmainpage) ","b4xmainpage",1,__ref.getField(false, "ba"),__ref,673);
if (RapidSub.canDelegate("startactivityforresult")) { return __ref.runUserSub(false, "b4xmainpage","startactivityforresult", __ref, _i);}
RemoteObject _jo = RemoteObject.declareNull("anywheresoftware.b4j.object.JavaObject");
Debug.locals.put("i", _i);
 BA.debugLineNum = 673;BA.debugLine="Private Sub StartActivityForResult(i As Intent)";
Debug.ShouldStop(1);
 BA.debugLineNum = 674;BA.debugLine="Dim jo As JavaObject = GetBA";
Debug.ShouldStop(2);
_jo = RemoteObject.createNew ("anywheresoftware.b4j.object.JavaObject");
_jo = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.object.JavaObject"), __ref.runClassMethod (b4a.example.b4xmainpage.class, "_getba" /*RemoteObject*/ ));Debug.locals.put("jo", _jo);Debug.locals.put("jo", _jo);
 BA.debugLineNum = 675;BA.debugLine="ion = jo.CreateEvent(\"anywheresoftware.b4a.IOnAct";
Debug.ShouldStop(4);
__ref.setField ("_ion" /*RemoteObject*/ ,_jo.runMethod(false,"CreateEvent",__ref.getField(false, "ba"),(Object)(BA.ObjectToString("anywheresoftware.b4a.IOnActivityResult")),(Object)(BA.ObjectToString("ion")),(Object)(b4xmainpage.__c.getField(false,"Null"))));
 BA.debugLineNum = 676;BA.debugLine="jo.RunMethod(\"startActivityForResult\", Array As O";
Debug.ShouldStop(8);
_jo.runVoidMethod ("RunMethod",(Object)(BA.ObjectToString("startActivityForResult")),(Object)(RemoteObject.createNewArray("Object",new int[] {2},new Object[] {__ref.getField(false,"_ion" /*RemoteObject*/ ),(_i.getObject())})));
 BA.debugLineNum = 677;BA.debugLine="End Sub";
Debug.ShouldStop(16);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _startconfirmdevicecredential(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("StartConfirmDeviceCredential (b4xmainpage) ","b4xmainpage",1,__ref.getField(false, "ba"),__ref,661);
if (RapidSub.canDelegate("startconfirmdevicecredential")) { return __ref.runUserSub(false, "b4xmainpage","startconfirmdevicecredential", __ref);}
RemoteObject _i = RemoteObject.declareNull("anywheresoftware.b4a.objects.IntentWrapper");
 BA.debugLineNum = 661;BA.debugLine="Private Sub StartConfirmDeviceCredential";
Debug.ShouldStop(1048576);
 BA.debugLineNum = 662;BA.debugLine="Try";
Debug.ShouldStop(2097152);
try { BA.debugLineNum = 663;BA.debugLine="Dim i As Intent";
Debug.ShouldStop(4194304);
_i = RemoteObject.createNew ("anywheresoftware.b4a.objects.IntentWrapper");Debug.locals.put("i", _i);
 BA.debugLineNum = 664;BA.debugLine="i.Initialize(\"android.app.action.CONFIRM_DEVICE_";
Debug.ShouldStop(8388608);
_i.runVoidMethod ("Initialize",(Object)(BA.ObjectToString("android.app.action.CONFIRM_DEVICE_CREDENTIAL")),(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 665;BA.debugLine="StartActivityForResult(i)";
Debug.ShouldStop(16777216);
__ref.runClassMethod (b4a.example.b4xmainpage.class, "_startactivityforresult" /*RemoteObject*/ ,(Object)(_i));
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e6) {
			BA.rdebugUtils.runVoidMethod("setLastException",__ref.getField(false, "ba"), e6.toString()); BA.debugLineNum = 668;BA.debugLine="Log(\"StartConfirmDeviceCredential Fehler: \" & La";
Debug.ShouldStop(134217728);
b4xmainpage.__c.runVoidMethod ("LogImpl","42686983",RemoteObject.concat(RemoteObject.createImmutable("StartConfirmDeviceCredential Fehler: "),b4xmainpage.__c.runMethod(false,"LastException",__ref.getField(false, "ba")).runMethod(true,"getMessage")),0);
 BA.debugLineNum = 669;BA.debugLine="RefreshTokenProcedure";
Debug.ShouldStop(268435456);
__ref.runClassMethod (b4a.example.b4xmainpage.class, "_refreshtokenprocedure" /*RemoteObject*/ );
 };
 BA.debugLineNum = 671;BA.debugLine="End Sub";
Debug.ShouldStop(1073741824);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _starttimer(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("startTimer (b4xmainpage) ","b4xmainpage",1,__ref.getField(false, "ba"),__ref,593);
if (RapidSub.canDelegate("starttimer")) { return __ref.runUserSub(false, "b4xmainpage","starttimer", __ref);}
 BA.debugLineNum = 593;BA.debugLine="Private Sub startTimer";
Debug.ShouldStop(65536);
 BA.debugLineNum = 594;BA.debugLine="Uhrzeit.Enabled = False";
Debug.ShouldStop(131072);
__ref.getField(false,"_uhrzeit" /*RemoteObject*/ ).runMethod(true,"setEnabled",b4xmainpage.__c.getField(true,"False"));
 BA.debugLineNum = 595;BA.debugLine="Uhrzeit.Interval = 1000 * 60";
Debug.ShouldStop(262144);
__ref.getField(false,"_uhrzeit" /*RemoteObject*/ ).runMethod(true,"setInterval",BA.numberCast(long.class, RemoteObject.solve(new RemoteObject[] {RemoteObject.createImmutable(1000),RemoteObject.createImmutable(60)}, "*",0, 1)));
 BA.debugLineNum = 596;BA.debugLine="Uhrzeit.Enabled = True";
Debug.ShouldStop(524288);
__ref.getField(false,"_uhrzeit" /*RemoteObject*/ ).runMethod(true,"setEnabled",b4xmainpage.__c.getField(true,"True"));
 BA.debugLineNum = 597;BA.debugLine="End Sub";
Debug.ShouldStop(1048576);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _tbxemail_focuschanged(RemoteObject __ref,RemoteObject _hasfocus) throws Exception{
try {
		Debug.PushSubsStack("tbxEmail_FocusChanged (b4xmainpage) ","b4xmainpage",1,__ref.getField(false, "ba"),__ref,247);
if (RapidSub.canDelegate("tbxemail_focuschanged")) { return __ref.runUserSub(false, "b4xmainpage","tbxemail_focuschanged", __ref, _hasfocus);}
Debug.locals.put("HasFocus", _hasfocus);
 BA.debugLineNum = 247;BA.debugLine="Private Sub tbxEmail_FocusChanged (HasFocus As Boo";
Debug.ShouldStop(4194304);
 BA.debugLineNum = 248;BA.debugLine="If HasFocus Then";
Debug.ShouldStop(8388608);
if (_hasfocus.<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 249;BA.debugLine="tbxEmail.SelectionStart = tbxEmail.Text.Length";
Debug.ShouldStop(16777216);
__ref.getField(false,"_tbxemail" /*RemoteObject*/ ).runMethod(true,"setSelectionStart",__ref.getField(false,"_tbxemail" /*RemoteObject*/ ).runMethod(true,"getText").runMethod(true,"length"));
 }else {
 BA.debugLineNum = 251;BA.debugLine="HideKeyboard";
Debug.ShouldStop(67108864);
__ref.runClassMethod (b4a.example.b4xmainpage.class, "_hidekeyboard" /*RemoteObject*/ );
 };
 BA.debugLineNum = 253;BA.debugLine="End Sub";
Debug.ShouldStop(268435456);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _tbxemail_textchanged(RemoteObject __ref,RemoteObject _old,RemoteObject _new) throws Exception{
try {
		Debug.PushSubsStack("tbxEmail_TextChanged (b4xmainpage) ","b4xmainpage",1,__ref.getField(false, "ba"),__ref,263);
if (RapidSub.canDelegate("tbxemail_textchanged")) { return __ref.runUserSub(false, "b4xmainpage","tbxemail_textchanged", __ref, _old, _new);}
Debug.locals.put("Old", _old);
Debug.locals.put("New", _new);
 BA.debugLineNum = 263;BA.debugLine="Private Sub tbxEmail_TextChanged (Old As String, N";
Debug.ShouldStop(64);
 BA.debugLineNum = 264;BA.debugLine="If ignoreTextEvents Then Return";
Debug.ShouldStop(128);
if (__ref.getField(true,"_ignoretextevents" /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
if (true) return RemoteObject.createImmutable("");};
 BA.debugLineNum = 265;BA.debugLine="CheckLoginButtonState";
Debug.ShouldStop(256);
__ref.runClassMethod (b4a.example.b4xmainpage.class, "_checkloginbuttonstate" /*RemoteObject*/ );
 BA.debugLineNum = 266;BA.debugLine="End Sub";
Debug.ShouldStop(512);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _textboxpassword_focuschanged(RemoteObject __ref,RemoteObject _hasfocus) throws Exception{
try {
		Debug.PushSubsStack("TextBoxPassword_FocusChanged (b4xmainpage) ","b4xmainpage",1,__ref.getField(false, "ba"),__ref,255);
if (RapidSub.canDelegate("textboxpassword_focuschanged")) { return __ref.runUserSub(false, "b4xmainpage","textboxpassword_focuschanged", __ref, _hasfocus);}
Debug.locals.put("HasFocus", _hasfocus);
 BA.debugLineNum = 255;BA.debugLine="Private Sub TextBoxPassword_FocusChanged (HasFocus";
Debug.ShouldStop(1073741824);
 BA.debugLineNum = 256;BA.debugLine="If HasFocus Then";
Debug.ShouldStop(-2147483648);
if (_hasfocus.<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 257;BA.debugLine="TextBoxPassword.SelectionStart = TextBoxPassword";
Debug.ShouldStop(1);
__ref.getField(false,"_textboxpassword" /*RemoteObject*/ ).runMethod(true,"setSelectionStart",__ref.getField(false,"_textboxpassword" /*RemoteObject*/ ).runMethod(true,"getText").runMethod(true,"length"));
 }else {
 BA.debugLineNum = 259;BA.debugLine="HideKeyboard";
Debug.ShouldStop(4);
__ref.runClassMethod (b4a.example.b4xmainpage.class, "_hidekeyboard" /*RemoteObject*/ );
 };
 BA.debugLineNum = 261;BA.debugLine="End Sub";
Debug.ShouldStop(16);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _textboxpassword_textchanged(RemoteObject __ref,RemoteObject _old,RemoteObject _new) throws Exception{
try {
		Debug.PushSubsStack("TextBoxPassword_TextChanged (b4xmainpage) ","b4xmainpage",1,__ref.getField(false, "ba"),__ref,268);
if (RapidSub.canDelegate("textboxpassword_textchanged")) { return __ref.runUserSub(false, "b4xmainpage","textboxpassword_textchanged", __ref, _old, _new);}
Debug.locals.put("Old", _old);
Debug.locals.put("New", _new);
 BA.debugLineNum = 268;BA.debugLine="Private Sub TextBoxPassword_TextChanged (Old As St";
Debug.ShouldStop(2048);
 BA.debugLineNum = 269;BA.debugLine="If ignoreTextEvents Then Return";
Debug.ShouldStop(4096);
if (__ref.getField(true,"_ignoretextevents" /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
if (true) return RemoteObject.createImmutable("");};
 BA.debugLineNum = 270;BA.debugLine="CheckLoginButtonState";
Debug.ShouldStop(8192);
__ref.runClassMethod (b4a.example.b4xmainpage.class, "_checkloginbuttonstate" /*RemoteObject*/ );
 BA.debugLineNum = 271;BA.debugLine="End Sub";
Debug.ShouldStop(16384);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _uhrzeit_tick(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("Uhrzeit_Tick (b4xmainpage) ","b4xmainpage",1,__ref.getField(false, "ba"),__ref,599);
if (RapidSub.canDelegate("uhrzeit_tick")) { return __ref.runUserSub(false, "b4xmainpage","uhrzeit_tick", __ref);}
 BA.debugLineNum = 599;BA.debugLine="Private Sub Uhrzeit_Tick";
Debug.ShouldStop(4194304);
 BA.debugLineNum = 600;BA.debugLine="Uhrzeit.Enabled = False";
Debug.ShouldStop(8388608);
__ref.getField(false,"_uhrzeit" /*RemoteObject*/ ).runMethod(true,"setEnabled",b4xmainpage.__c.getField(true,"False"));
 BA.debugLineNum = 601;BA.debugLine="B4XPages.ShowPage(\"ScreenSaver\")";
Debug.ShouldStop(16777216);
b4xmainpage._b4xpages.runVoidMethod ("_showpage" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("ScreenSaver")));
 BA.debugLineNum = 602;BA.debugLine="End Sub";
Debug.ShouldStop(33554432);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _zeitstempel(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("Zeitstempel (b4xmainpage) ","b4xmainpage",1,__ref.getField(false, "ba"),__ref,604);
if (RapidSub.canDelegate("zeitstempel")) { return __ref.runUserSub(false, "b4xmainpage","zeitstempel", __ref);}
 BA.debugLineNum = 604;BA.debugLine="Private Sub Zeitstempel As String";
Debug.ShouldStop(134217728);
 BA.debugLineNum = 605;BA.debugLine="Return FormatDateCustom(DateTime.Now, \"yyyyMMddHH";
Debug.ShouldStop(268435456);
if (true) return __ref.runClassMethod (b4a.example.b4xmainpage.class, "_formatdatecustom" /*RemoteObject*/ ,(Object)(b4xmainpage.__c.getField(false,"DateTime").runMethod(true,"getNow")),(Object)(RemoteObject.createImmutable("yyyyMMddHHmmss")));
 BA.debugLineNum = 606;BA.debugLine="End Sub";
Debug.ShouldStop(536870912);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}