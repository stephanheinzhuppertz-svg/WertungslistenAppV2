package b4a.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class screensaver_subs_0 {


public static RemoteObject  _b4xpage_appear(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("B4XPage_Appear (screensaver) ","screensaver",4,__ref.getField(false, "ba"),__ref,29);
if (RapidSub.canDelegate("b4xpage_appear")) { return __ref.runUserSub(false, "screensaver","b4xpage_appear", __ref);}
 BA.debugLineNum = 29;BA.debugLine="Public Sub B4XPage_Appear";
Debug.ShouldStop(268435456);
 BA.debugLineNum = 30;BA.debugLine="If B4XPages.MainPage.Status.IsInitialized And B4X";
Debug.ShouldStop(536870912);
if (RemoteObject.solveBoolean(".",screensaver._b4xpages.runMethod(false,"_mainpage" /*RemoteObject*/ ,__ref.getField(false, "ba")).getField(false,"_status" /*RemoteObject*/ ).runMethod(true,"IsInitialized")) && RemoteObject.solveBoolean(">",screensaver._b4xpages.runMethod(false,"_mainpage" /*RemoteObject*/ ,__ref.getField(false, "ba")).getField(false,"_status" /*RemoteObject*/ ).runMethod(true,"getSize"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 31;BA.debugLine="Status = B4XPages.MainPage.Status";
Debug.ShouldStop(1073741824);
__ref.setField ("_status" /*RemoteObject*/ ,screensaver._b4xpages.runMethod(false,"_mainpage" /*RemoteObject*/ ,__ref.getField(false, "ba")).getField(false,"_status" /*RemoteObject*/ ));
 };
 BA.debugLineNum = 33;BA.debugLine="End Sub";
Debug.ShouldStop(1);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _b4xpage_closerequest(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("B4XPage_CloseRequest (screensaver) ","screensaver",4,__ref.getField(false, "ba"),__ref,35);
if (RapidSub.canDelegate("b4xpage_closerequest")) { return __ref.runUserSub(false, "screensaver","b4xpage_closerequest", __ref);}
ResumableSub_B4XPage_CloseRequest rsub = new ResumableSub_B4XPage_CloseRequest(null,__ref);
rsub.remoteResumableSub = anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSubForFilter();
rsub.resume(null, null);
return RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper"), rsub.remoteResumableSub);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_B4XPage_CloseRequest extends BA.ResumableSub {
public ResumableSub_B4XPage_CloseRequest(b4a.example.screensaver parent,RemoteObject __ref) {
this.parent = parent;
this.__ref = __ref;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4a.example.screensaver parent;

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("B4XPage_CloseRequest (screensaver) ","screensaver",4,__ref.getField(false, "ba"),__ref,35);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
{
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,RemoteObject.createImmutable(null));return;}
case 0:
//C
this.state = -1;
;
 BA.debugLineNum = 36;BA.debugLine="Return False";
Debug.ShouldStop(8);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(parent.__c.getField(true,"False")));return;};
 BA.debugLineNum = 37;BA.debugLine="End Sub";
Debug.ShouldStop(16);
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
public static RemoteObject  _b4xpage_created(RemoteObject __ref,RemoteObject _root1) throws Exception{
try {
		Debug.PushSubsStack("B4XPage_Created (screensaver) ","screensaver",4,__ref.getField(false, "ba"),__ref,23);
if (RapidSub.canDelegate("b4xpage_created")) { return __ref.runUserSub(false, "screensaver","b4xpage_created", __ref, _root1);}
Debug.locals.put("Root1", _root1);
 BA.debugLineNum = 23;BA.debugLine="Private Sub B4XPage_Created (Root1 As B4XView)";
Debug.ShouldStop(4194304);
 BA.debugLineNum = 24;BA.debugLine="Root = Root1";
Debug.ShouldStop(8388608);
__ref.setField ("_root" /*RemoteObject*/ ,_root1);
 BA.debugLineNum = 25;BA.debugLine="B4XPages.SetTitle(Me, \"Wertungslisten-App by sthn";
Debug.ShouldStop(16777216);
screensaver._b4xpages.runVoidMethod ("_settitle" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(__ref),(Object)((RemoteObject.createImmutable("Wertungslisten-App by sthnet.de"))));
 BA.debugLineNum = 26;BA.debugLine="BuildUI";
Debug.ShouldStop(33554432);
__ref.runClassMethod (b4a.example.screensaver.class, "_buildui" /*RemoteObject*/ );
 BA.debugLineNum = 27;BA.debugLine="End Sub";
Debug.ShouldStop(67108864);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _btnlogin_down(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("btnLogin_Down (screensaver) ","screensaver",4,__ref.getField(false, "ba"),__ref,71);
if (RapidSub.canDelegate("btnlogin_down")) { return __ref.runUserSub(false, "screensaver","btnlogin_down", __ref);}
 BA.debugLineNum = 71;BA.debugLine="Private Sub btnLogin_Down";
Debug.ShouldStop(64);
 BA.debugLineNum = 72;BA.debugLine="StartConfirmDeviceCredential";
Debug.ShouldStop(128);
__ref.runClassMethod (b4a.example.screensaver.class, "_startconfirmdevicecredential" /*RemoteObject*/ );
 BA.debugLineNum = 73;BA.debugLine="End Sub";
Debug.ShouldStop(256);
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
		Debug.PushSubsStack("BuildUI (screensaver) ","screensaver",4,__ref.getField(false, "ba"),__ref,42);
if (RapidSub.canDelegate("buildui")) { return __ref.runUserSub(false, "screensaver","buildui", __ref);}
RemoteObject _xv = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
 BA.debugLineNum = 42;BA.debugLine="Private Sub BuildUI";
Debug.ShouldStop(512);
 BA.debugLineNum = 43;BA.debugLine="Root.Color = 0xFF222222";
Debug.ShouldStop(1024);
__ref.getField(false,"_root" /*RemoteObject*/ ).runMethod(true,"setColor",BA.numberCast(int.class, ((int)0xff222222)));
 BA.debugLineNum = 45;BA.debugLine="Label1.Initialize(\"\")";
Debug.ShouldStop(4096);
__ref.getField(false,"_label1" /*RemoteObject*/ ).runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 46;BA.debugLine="Label1.Text = \"Erneute Anmeldung erforderlich ...";
Debug.ShouldStop(8192);
__ref.getField(false,"_label1" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToCharSequence("Erneute Anmeldung erforderlich ..."));
 BA.debugLineNum = 47;BA.debugLine="Label1.TextSize = 16";
Debug.ShouldStop(16384);
__ref.getField(false,"_label1" /*RemoteObject*/ ).runMethod(true,"setTextSize",BA.numberCast(float.class, 16));
 BA.debugLineNum = 48;BA.debugLine="Label1.Typeface = Typeface.DEFAULT_BOLD";
Debug.ShouldStop(32768);
__ref.getField(false,"_label1" /*RemoteObject*/ ).runMethod(false,"setTypeface",screensaver.__c.getField(false,"Typeface").getField(false,"DEFAULT_BOLD"));
 BA.debugLineNum = 49;BA.debugLine="Label1.TextColor = Colors.White";
Debug.ShouldStop(65536);
__ref.getField(false,"_label1" /*RemoteObject*/ ).runMethod(true,"setTextColor",screensaver.__c.getField(false,"Colors").getField(true,"White"));
 BA.debugLineNum = 50;BA.debugLine="Label1.Gravity = Gravity.CENTER";
Debug.ShouldStop(131072);
__ref.getField(false,"_label1" /*RemoteObject*/ ).runMethod(true,"setGravity",screensaver.__c.getField(false,"Gravity").getField(true,"CENTER"));
 BA.debugLineNum = 51;BA.debugLine="Root.AddView(Label1, 0, 25dip, 100%x, 40dip)";
Debug.ShouldStop(262144);
__ref.getField(false,"_root" /*RemoteObject*/ ).runVoidMethod ("AddView",(Object)((__ref.getField(false,"_label1" /*RemoteObject*/ ).getObject())),(Object)(BA.numberCast(int.class, 0)),(Object)(screensaver.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 25)))),(Object)(screensaver.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 100)),__ref.getField(false, "ba"))),(Object)(screensaver.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 40)))));
 BA.debugLineNum = 53;BA.debugLine="btnLogin.Initialize(\"btnLogin\")";
Debug.ShouldStop(1048576);
__ref.getField(false,"_btnlogin" /*RemoteObject*/ ).runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("btnLogin")));
 BA.debugLineNum = 54;BA.debugLine="If File.Exists(File.DirAssets, \"Fingerprint.png\")";
Debug.ShouldStop(2097152);
if (screensaver.__c.getField(false,"File").runMethod(true,"Exists",(Object)(screensaver.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(RemoteObject.createImmutable("Fingerprint.png"))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 55;BA.debugLine="btnLogin.SetBackgroundImage(LoadBitmap(File.DirA";
Debug.ShouldStop(4194304);
__ref.getField(false,"_btnlogin" /*RemoteObject*/ ).runVoidMethod ("SetBackgroundImageNew",(Object)((screensaver.__c.runMethod(false,"LoadBitmap",(Object)(screensaver.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(RemoteObject.createImmutable("Fingerprint.png"))).getObject())));
 }else {
 BA.debugLineNum = 57;BA.debugLine="btnLogin.Text = \"🔒\"";
Debug.ShouldStop(16777216);
__ref.getField(false,"_btnlogin" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToCharSequence("🔒"));
 BA.debugLineNum = 58;BA.debugLine="btnLogin.TextSize = 24";
Debug.ShouldStop(33554432);
__ref.getField(false,"_btnlogin" /*RemoteObject*/ ).runMethod(true,"setTextSize",BA.numberCast(float.class, 24));
 BA.debugLineNum = 59;BA.debugLine="btnLogin.TextColor = Colors.White";
Debug.ShouldStop(67108864);
__ref.getField(false,"_btnlogin" /*RemoteObject*/ ).runMethod(true,"setTextColor",screensaver.__c.getField(false,"Colors").getField(true,"White"));
 BA.debugLineNum = 60;BA.debugLine="btnLogin.Color = 0xFF444444";
Debug.ShouldStop(134217728);
__ref.getField(false,"_btnlogin" /*RemoteObject*/ ).runVoidMethod ("setColor",BA.numberCast(int.class, ((int)0xff444444)));
 };
 BA.debugLineNum = 62;BA.debugLine="Root.AddView(btnLogin, (100%x - 64dip) / 2, 100%y";
Debug.ShouldStop(536870912);
__ref.getField(false,"_root" /*RemoteObject*/ ).runVoidMethod ("AddView",(Object)((__ref.getField(false,"_btnlogin" /*RemoteObject*/ ).getObject())),(Object)(BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {(RemoteObject.solve(new RemoteObject[] {screensaver.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 100)),__ref.getField(false, "ba")),screensaver.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 64)))}, "-",1, 1)),RemoteObject.createImmutable(2)}, "/",0, 0))),(Object)(RemoteObject.solve(new RemoteObject[] {screensaver.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 100)),__ref.getField(false, "ba")),screensaver.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 89)))}, "-",1, 1)),(Object)(screensaver.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 64)))),(Object)(screensaver.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 64)))));
 BA.debugLineNum = 64;BA.debugLine="Dim xv As B4XView = btnLogin";
Debug.ShouldStop(-2147483648);
_xv = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
_xv = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.B4XViewWrapper"), __ref.getField(false,"_btnlogin" /*RemoteObject*/ ).getObject());Debug.locals.put("xv", _xv);Debug.locals.put("xv", _xv);
 BA.debugLineNum = 65;BA.debugLine="xv.SetColorAndBorder(xv.Color, 0, 0, 32dip)";
Debug.ShouldStop(1);
_xv.runVoidMethod ("SetColorAndBorder",(Object)(_xv.runMethod(true,"getColor")),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(screensaver.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 32)))));
 BA.debugLineNum = 66;BA.debugLine="End Sub";
Debug.ShouldStop(2);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _class_globals(RemoteObject __ref) throws Exception{
 //BA.debugLineNum = 4;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 5;BA.debugLine="Private Root As B4XView";
screensaver._root = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");__ref.setField("_root",screensaver._root);
 //BA.debugLineNum = 6;BA.debugLine="Private xui As XUI";
screensaver._xui = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper.XUI");__ref.setField("_xui",screensaver._xui);
 //BA.debugLineNum = 9;BA.debugLine="Public Status As Map";
screensaver._status = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");__ref.setField("_status",screensaver._status);
 //BA.debugLineNum = 12;BA.debugLine="Private Label1 As Label";
screensaver._label1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");__ref.setField("_label1",screensaver._label1);
 //BA.debugLineNum = 13;BA.debugLine="Private btnLogin As Button";
screensaver._btnlogin = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");__ref.setField("_btnlogin",screensaver._btnlogin);
 //BA.debugLineNum = 16;BA.debugLine="Private ion As Object";
screensaver._ion = RemoteObject.createNew ("Object");__ref.setField("_ion",screensaver._ion);
 //BA.debugLineNum = 17;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _getba(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("GetBA (screensaver) ","screensaver",4,__ref.getField(false, "ba"),__ref,102);
if (RapidSub.canDelegate("getba")) { return __ref.runUserSub(false, "screensaver","getba", __ref);}
RemoteObject _jo = RemoteObject.declareNull("anywheresoftware.b4j.object.JavaObject");
 BA.debugLineNum = 102;BA.debugLine="Private Sub GetBA As Object";
Debug.ShouldStop(32);
 BA.debugLineNum = 103;BA.debugLine="Dim jo As JavaObject";
Debug.ShouldStop(64);
_jo = RemoteObject.createNew ("anywheresoftware.b4j.object.JavaObject");Debug.locals.put("jo", _jo);
 BA.debugLineNum = 104;BA.debugLine="jo.InitializeStatic(Application.PackageName & \".m";
Debug.ShouldStop(128);
_jo.runVoidMethod ("InitializeStatic",(Object)(RemoteObject.concat(screensaver.__c.getField(false,"Application").runMethod(true,"getPackageName"),RemoteObject.createImmutable(".main"))));
 BA.debugLineNum = 105;BA.debugLine="Return jo.GetField(\"processBA\")";
Debug.ShouldStop(256);
if (true) return _jo.runMethod(false,"GetField",(Object)(RemoteObject.createImmutable("processBA")));
 BA.debugLineNum = 106;BA.debugLine="End Sub";
Debug.ShouldStop(512);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _initialize(RemoteObject __ref,RemoteObject _ba) throws Exception{
try {
		Debug.PushSubsStack("Initialize (screensaver) ","screensaver",4,__ref.getField(false, "ba"),__ref,19);
if (RapidSub.canDelegate("initialize")) { return __ref.runUserSub(false, "screensaver","initialize", __ref, _ba);}
__ref.runVoidMethodAndSync("innerInitializeHelper", _ba);
;
 BA.debugLineNum = 19;BA.debugLine="Public Sub Initialize";
Debug.ShouldStop(262144);
 BA.debugLineNum = 20;BA.debugLine="Status.Initialize";
Debug.ShouldStop(524288);
__ref.getField(false,"_status" /*RemoteObject*/ ).runVoidMethod ("Initialize");
 BA.debugLineNum = 21;BA.debugLine="End Sub";
Debug.ShouldStop(1048576);
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
		Debug.PushSubsStack("ion_Event (screensaver) ","screensaver",4,__ref.getField(false, "ba"),__ref,93);
if (RapidSub.canDelegate("ion_event")) { return __ref.runUserSub(false, "screensaver","ion_event", __ref, _methodname, _args);}
RemoteObject _rescode = RemoteObject.createImmutable(0);
Debug.locals.put("MethodName", _methodname);
Debug.locals.put("Args", _args);
 BA.debugLineNum = 93;BA.debugLine="Private Sub ion_Event (MethodName As String, Args(";
Debug.ShouldStop(268435456);
 BA.debugLineNum = 94;BA.debugLine="Dim resCode As Int = Args(0)";
Debug.ShouldStop(536870912);
_rescode = BA.numberCast(int.class, _args.getArrayElement(false,BA.numberCast(int.class, 0)));Debug.locals.put("rescode", _rescode);Debug.locals.put("resCode", _rescode);
 BA.debugLineNum = 95;BA.debugLine="If resCode = -1 Then";
Debug.ShouldStop(1073741824);
if (RemoteObject.solveBoolean("=",_rescode,BA.numberCast(double.class, -(double) (0 + 1)))) { 
 BA.debugLineNum = 96;BA.debugLine="B4XPages.MainPage.Status = Status";
Debug.ShouldStop(-2147483648);
screensaver._b4xpages.runMethod(false,"_mainpage" /*RemoteObject*/ ,__ref.getField(false, "ba")).setField ("_status" /*RemoteObject*/ ,__ref.getField(false,"_status" /*RemoteObject*/ ));
 BA.debugLineNum = 97;BA.debugLine="B4XPages.ClosePage(Me)";
Debug.ShouldStop(1);
screensaver._b4xpages.runVoidMethod ("_closepage" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(__ref));
 };
 BA.debugLineNum = 99;BA.debugLine="Return Null";
Debug.ShouldStop(4);
if (true) return screensaver.__c.getField(false,"Null");
 BA.debugLineNum = 100;BA.debugLine="End Sub";
Debug.ShouldStop(8);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _startactivityforresult(RemoteObject __ref,RemoteObject _i) throws Exception{
try {
		Debug.PushSubsStack("StartActivityForResult (screensaver) ","screensaver",4,__ref.getField(false, "ba"),__ref,87);
if (RapidSub.canDelegate("startactivityforresult")) { return __ref.runUserSub(false, "screensaver","startactivityforresult", __ref, _i);}
RemoteObject _jo = RemoteObject.declareNull("anywheresoftware.b4j.object.JavaObject");
Debug.locals.put("i", _i);
 BA.debugLineNum = 87;BA.debugLine="Private Sub StartActivityForResult(i As Intent)";
Debug.ShouldStop(4194304);
 BA.debugLineNum = 88;BA.debugLine="Dim jo As JavaObject = GetBA";
Debug.ShouldStop(8388608);
_jo = RemoteObject.createNew ("anywheresoftware.b4j.object.JavaObject");
_jo = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.object.JavaObject"), __ref.runClassMethod (b4a.example.screensaver.class, "_getba" /*RemoteObject*/ ));Debug.locals.put("jo", _jo);Debug.locals.put("jo", _jo);
 BA.debugLineNum = 89;BA.debugLine="ion = jo.CreateEvent(\"anywheresoftware.b4a.IOnAct";
Debug.ShouldStop(16777216);
__ref.setField ("_ion" /*RemoteObject*/ ,_jo.runMethod(false,"CreateEvent",__ref.getField(false, "ba"),(Object)(BA.ObjectToString("anywheresoftware.b4a.IOnActivityResult")),(Object)(BA.ObjectToString("ion")),(Object)(screensaver.__c.getField(false,"Null"))));
 BA.debugLineNum = 90;BA.debugLine="jo.RunMethod(\"startActivityForResult\", Array As O";
Debug.ShouldStop(33554432);
_jo.runVoidMethod ("RunMethod",(Object)(BA.ObjectToString("startActivityForResult")),(Object)(RemoteObject.createNewArray("Object",new int[] {2},new Object[] {__ref.getField(false,"_ion" /*RemoteObject*/ ),(_i.getObject())})));
 BA.debugLineNum = 91;BA.debugLine="End Sub";
Debug.ShouldStop(67108864);
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
		Debug.PushSubsStack("StartConfirmDeviceCredential (screensaver) ","screensaver",4,__ref.getField(false, "ba"),__ref,75);
if (RapidSub.canDelegate("startconfirmdevicecredential")) { return __ref.runUserSub(false, "screensaver","startconfirmdevicecredential", __ref);}
RemoteObject _i = RemoteObject.declareNull("anywheresoftware.b4a.objects.IntentWrapper");
 BA.debugLineNum = 75;BA.debugLine="Private Sub StartConfirmDeviceCredential";
Debug.ShouldStop(1024);
 BA.debugLineNum = 76;BA.debugLine="Try";
Debug.ShouldStop(2048);
try { BA.debugLineNum = 77;BA.debugLine="Dim i As Intent";
Debug.ShouldStop(4096);
_i = RemoteObject.createNew ("anywheresoftware.b4a.objects.IntentWrapper");Debug.locals.put("i", _i);
 BA.debugLineNum = 78;BA.debugLine="i.Initialize(\"android.app.action.CONFIRM_DEVICE_";
Debug.ShouldStop(8192);
_i.runVoidMethod ("Initialize",(Object)(BA.ObjectToString("android.app.action.CONFIRM_DEVICE_CREDENTIAL")),(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 79;BA.debugLine="StartActivityForResult(i)";
Debug.ShouldStop(16384);
__ref.runClassMethod (b4a.example.screensaver.class, "_startactivityforresult" /*RemoteObject*/ ,(Object)(_i));
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e6) {
			BA.rdebugUtils.runVoidMethod("setLastException",__ref.getField(false, "ba"), e6.toString()); BA.debugLineNum = 81;BA.debugLine="Log(\"StartConfirmDeviceCredential Fehler: \" & La";
Debug.ShouldStop(65536);
screensaver.__c.runVoidMethod ("LogImpl","848168966",RemoteObject.concat(RemoteObject.createImmutable("StartConfirmDeviceCredential Fehler: "),screensaver.__c.runMethod(false,"LastException",__ref.getField(false, "ba")).runMethod(true,"getMessage")),0);
 BA.debugLineNum = 82;BA.debugLine="B4XPages.MainPage.Status = Status";
Debug.ShouldStop(131072);
screensaver._b4xpages.runMethod(false,"_mainpage" /*RemoteObject*/ ,__ref.getField(false, "ba")).setField ("_status" /*RemoteObject*/ ,__ref.getField(false,"_status" /*RemoteObject*/ ));
 BA.debugLineNum = 83;BA.debugLine="B4XPages.ClosePage(Me)";
Debug.ShouldStop(262144);
screensaver._b4xpages.runVoidMethod ("_closepage" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(__ref));
 };
 BA.debugLineNum = 85;BA.debugLine="End Sub";
Debug.ShouldStop(1048576);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}