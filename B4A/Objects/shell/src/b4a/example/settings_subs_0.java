package b4a.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class settings_subs_0 {


public static RemoteObject  _b4xpage_appear(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("B4XPage_Appear (settings) ","settings",3,__ref.getField(false, "ba"),__ref,79);
if (RapidSub.canDelegate("b4xpage_appear")) { return __ref.runUserSub(false, "settings","b4xpage_appear", __ref);}
 BA.debugLineNum = 79;BA.debugLine="Public Sub B4XPage_Appear";
Debug.ShouldStop(16384);
 BA.debugLineNum = 81;BA.debugLine="LoadTinyDB";
Debug.ShouldStop(65536);
__ref.runClassMethod (b4a.example.settings.class, "_loadtinydb" /*RemoteObject*/ );
 BA.debugLineNum = 83;BA.debugLine="If B4XPages.MainPage.Status.IsInitialized And B4X";
Debug.ShouldStop(262144);
if (RemoteObject.solveBoolean(".",settings._b4xpages.runMethod(false,"_mainpage" /*RemoteObject*/ ,__ref.getField(false, "ba")).getField(false,"_status" /*RemoteObject*/ ).runMethod(true,"IsInitialized")) && RemoteObject.solveBoolean(">",settings._b4xpages.runMethod(false,"_mainpage" /*RemoteObject*/ ,__ref.getField(false, "ba")).getField(false,"_status" /*RemoteObject*/ ).runMethod(true,"getSize"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 84;BA.debugLine="Status = B4XPages.MainPage.Status";
Debug.ShouldStop(524288);
__ref.setField ("_status" /*RemoteObject*/ ,settings._b4xpages.runMethod(false,"_mainpage" /*RemoteObject*/ ,__ref.getField(false, "ba")).getField(false,"_status" /*RemoteObject*/ ));
 };
 BA.debugLineNum = 87;BA.debugLine="Veranstaltung_ID = DBGet(\"VeranstaltungID\", \"v0\")";
Debug.ShouldStop(4194304);
__ref.setField ("_veranstaltung_id" /*RemoteObject*/ ,BA.ObjectToString(__ref.runClassMethod (b4a.example.settings.class, "_dbget" /*RemoteObject*/ ,(Object)(BA.ObjectToString("VeranstaltungID")),(Object)((RemoteObject.createImmutable("v0"))))));
 BA.debugLineNum = 91;BA.debugLine="disableVSTNG";
Debug.ShouldStop(67108864);
__ref.runClassMethod (b4a.example.settings.class, "_disablevstng" /*RemoteObject*/ );
 BA.debugLineNum = 92;BA.debugLine="disableTLN";
Debug.ShouldStop(134217728);
__ref.runClassMethod (b4a.example.settings.class, "_disabletln" /*RemoteObject*/ );
 BA.debugLineNum = 93;BA.debugLine="setzeHeaderfromDB";
Debug.ShouldStop(268435456);
__ref.runClassMethod (b4a.example.settings.class, "_setzeheaderfromdb" /*RemoteObject*/ );
 BA.debugLineNum = 94;BA.debugLine="changeURL";
Debug.ShouldStop(536870912);
__ref.runClassMethod (b4a.example.settings.class, "_changeurl" /*RemoteObject*/ );
 BA.debugLineNum = 96;BA.debugLine="If Veranstaltung_ID = \"v0\" Then";
Debug.ShouldStop(-2147483648);
if (RemoteObject.solveBoolean("=",__ref.getField(true,"_veranstaltung_id" /*RemoteObject*/ ),BA.ObjectToString("v0"))) { 
 BA.debugLineNum = 97;BA.debugLine="DBPut(\"VeranstaltungDatum\", \"\")";
Debug.ShouldStop(1);
__ref.runClassMethod (b4a.example.settings.class, "_dbput" /*RemoteObject*/ ,(Object)(BA.ObjectToString("VeranstaltungDatum")),(Object)((RemoteObject.createImmutable(""))));
 };
 BA.debugLineNum = 100;BA.debugLine="If Status.GetDefault(\"idToken\", \"\") = \"\" Then";
Debug.ShouldStop(8);
if (RemoteObject.solveBoolean("=",__ref.getField(false,"_status" /*RemoteObject*/ ).runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("idToken"))),(Object)((RemoteObject.createImmutable("")))),RemoteObject.createImmutable(("")))) { 
 BA.debugLineNum = 101;BA.debugLine="CloseSettings";
Debug.ShouldStop(16);
__ref.runClassMethod (b4a.example.settings.class, "_closesettings" /*RemoteObject*/ );
 }else {
 BA.debugLineNum = 103;BA.debugLine="holeVeranstaltungen";
Debug.ShouldStop(64);
__ref.runClassMethod (b4a.example.settings.class, "_holeveranstaltungen" /*RemoteObject*/ );
 };
 BA.debugLineNum = 105;BA.debugLine="startTimer";
Debug.ShouldStop(256);
__ref.runClassMethod (b4a.example.settings.class, "_starttimer" /*RemoteObject*/ );
 BA.debugLineNum = 106;BA.debugLine="End Sub";
Debug.ShouldStop(512);
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
		Debug.PushSubsStack("B4XPage_CloseRequest (settings) ","settings",3,__ref.getField(false, "ba"),__ref,108);
if (RapidSub.canDelegate("b4xpage_closerequest")) { return __ref.runUserSub(false, "settings","b4xpage_closerequest", __ref);}
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
public ResumableSub_B4XPage_CloseRequest(b4a.example.settings parent,RemoteObject __ref) {
this.parent = parent;
this.__ref = __ref;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4a.example.settings parent;

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("B4XPage_CloseRequest (settings) ","settings",3,__ref.getField(false, "ba"),__ref,108);
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
 BA.debugLineNum = 109;BA.debugLine="Uhrzeit.Enabled = False";
Debug.ShouldStop(4096);
__ref.getField(false,"_uhrzeit" /*RemoteObject*/ ).runMethod(true,"setEnabled",parent.__c.getField(true,"False"));
 BA.debugLineNum = 110;BA.debugLine="B4XPages.MainPage.Status = Status";
Debug.ShouldStop(8192);
parent._b4xpages.runMethod(false,"_mainpage" /*RemoteObject*/ ,__ref.getField(false, "ba")).setField ("_status" /*RemoteObject*/ ,__ref.getField(false,"_status" /*RemoteObject*/ ));
 BA.debugLineNum = 111;BA.debugLine="Return True";
Debug.ShouldStop(16384);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(parent.__c.getField(true,"True")));return;};
 BA.debugLineNum = 112;BA.debugLine="End Sub";
Debug.ShouldStop(32768);
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
		Debug.PushSubsStack("B4XPage_Created (settings) ","settings",3,__ref.getField(false, "ba"),__ref,72);
if (RapidSub.canDelegate("b4xpage_created")) { return __ref.runUserSub(false, "settings","b4xpage_created", __ref, _root1);}
Debug.locals.put("Root1", _root1);
 BA.debugLineNum = 72;BA.debugLine="Private Sub B4XPage_Created (Root1 As B4XView)";
Debug.ShouldStop(128);
 BA.debugLineNum = 73;BA.debugLine="Root = Root1";
Debug.ShouldStop(256);
__ref.setField ("_root" /*RemoteObject*/ ,_root1);
 BA.debugLineNum = 74;BA.debugLine="Root.LoadLayout(\"Settings\")";
Debug.ShouldStop(512);
__ref.getField(false,"_root" /*RemoteObject*/ ).runVoidMethodAndSync ("LoadLayout",(Object)(RemoteObject.createImmutable("Settings")),__ref.getField(false, "ba"));
 BA.debugLineNum = 77;BA.debugLine="End Sub";
Debug.ShouldStop(4096);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _btnauswahl_click(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("btnAuswahl_Click (settings) ","settings",3,__ref.getField(false, "ba"),__ref,905);
if (RapidSub.canDelegate("btnauswahl_click")) { return __ref.runUserSub(false, "settings","btnauswahl_click", __ref);}
 BA.debugLineNum = 905;BA.debugLine="Private Sub btnAuswahl_Click";
Debug.ShouldStop(256);
 BA.debugLineNum = 906;BA.debugLine="Uhrzeit.Enabled = False";
Debug.ShouldStop(512);
__ref.getField(false,"_uhrzeit" /*RemoteObject*/ ).runMethod(true,"setEnabled",settings.__c.getField(true,"False"));
 BA.debugLineNum = 907;BA.debugLine="Veranstaltung_ID = webviewVSTGN_ID";
Debug.ShouldStop(1024);
__ref.setField ("_veranstaltung_id" /*RemoteObject*/ ,__ref.getField(true,"_webviewvstgn_id" /*RemoteObject*/ ));
 BA.debugLineNum = 908;BA.debugLine="saveDBvstng";
Debug.ShouldStop(2048);
__ref.runClassMethod (b4a.example.settings.class, "_savedbvstng" /*RemoteObject*/ );
 BA.debugLineNum = 909;BA.debugLine="CloseSettings";
Debug.ShouldStop(4096);
__ref.runClassMethod (b4a.example.settings.class, "_closesettings" /*RemoteObject*/ );
 BA.debugLineNum = 910;BA.debugLine="End Sub";
Debug.ShouldStop(8192);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _btnback_click(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("btnBack_Click (settings) ","settings",3,__ref.getField(false, "ba"),__ref,826);
if (RapidSub.canDelegate("btnback_click")) { return __ref.runUserSub(false, "settings","btnback_click", __ref);}
 BA.debugLineNum = 826;BA.debugLine="Private Sub btnBack_Click";
Debug.ShouldStop(33554432);
 BA.debugLineNum = 827;BA.debugLine="CloseSettings";
Debug.ShouldStop(67108864);
__ref.runClassMethod (b4a.example.settings.class, "_closesettings" /*RemoteObject*/ );
 BA.debugLineNum = 828;BA.debugLine="End Sub";
Debug.ShouldStop(134217728);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static void  _btntlndelete_click(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("btnTLNDelete_Click (settings) ","settings",3,__ref.getField(false, "ba"),__ref,945);
if (RapidSub.canDelegate("btntlndelete_click")) { __ref.runUserSub(false, "settings","btntlndelete_click", __ref); return;}
ResumableSub_btnTLNDelete_Click rsub = new ResumableSub_btnTLNDelete_Click(null,__ref);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_btnTLNDelete_Click extends BA.ResumableSub {
public ResumableSub_btnTLNDelete_Click(b4a.example.settings parent,RemoteObject __ref) {
this.parent = parent;
this.__ref = __ref;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4a.example.settings parent;
RemoteObject _res;

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("btnTLNDelete_Click (settings) ","settings",3,__ref.getField(false, "ba"),__ref,945);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
;
 BA.debugLineNum = 946;BA.debugLine="startTimer";
Debug.ShouldStop(131072);
__ref.runClassMethod (b4a.example.settings.class, "_starttimer" /*RemoteObject*/ );
 BA.debugLineNum = 947;BA.debugLine="Msgbox2Async(tbxTeilnehmer.Text & \" aus der Liste";
Debug.ShouldStop(262144);
parent.__c.runVoidMethod ("Msgbox2Async",(Object)(BA.ObjectToCharSequence(RemoteObject.concat(__ref.getField(false,"_tbxteilnehmer" /*RemoteObject*/ ).runMethod(true,"getText"),RemoteObject.createImmutable(" aus der Liste der Teilnehmer löschen?")))),(Object)(BA.ObjectToCharSequence("Teilnehmer wirklich löschen?")),(Object)(BA.ObjectToString("Löschen")),(Object)(BA.ObjectToString("")),(Object)(BA.ObjectToString("Abbrechen")),RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper"), parent.__c.getField(false,"Null")),__ref.getField(false, "ba"),(Object)(parent.__c.getField(true,"True")));
 BA.debugLineNum = 948;BA.debugLine="Wait For Msgbox_Result (res As Int)";
Debug.ShouldStop(524288);
parent.__c.runVoidMethod ("WaitFor","msgbox_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "settings", "btntlndelete_click"), null);
this.state = 5;
return;
case 5:
//C
this.state = 1;
_res = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("res", _res);
;
 BA.debugLineNum = 949;BA.debugLine="If res = DialogResponse.POSITIVE Then";
Debug.ShouldStop(1048576);
if (true) break;

case 1:
//if
this.state = 4;
if (RemoteObject.solveBoolean("=",_res,BA.numberCast(double.class, parent.__c.getField(false,"DialogResponse").getField(true,"POSITIVE")))) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
 BA.debugLineNum = 950;BA.debugLine="delTLN(TLNid)";
Debug.ShouldStop(2097152);
__ref.runClassMethod (b4a.example.settings.class, "_deltln" /*RemoteObject*/ ,(Object)(__ref.getField(true,"_tlnid" /*RemoteObject*/ )));
 BA.debugLineNum = 951;BA.debugLine="startTimer";
Debug.ShouldStop(4194304);
__ref.runClassMethod (b4a.example.settings.class, "_starttimer" /*RemoteObject*/ );
 if (true) break;

case 4:
//C
this.state = -1;
;
 BA.debugLineNum = 953;BA.debugLine="End Sub";
Debug.ShouldStop(16777216);
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
public static RemoteObject  _btntlnspeichern_click(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("btnTLNSpeichern_Click (settings) ","settings",3,__ref.getField(false, "ba"),__ref,955);
if (RapidSub.canDelegate("btntlnspeichern_click")) { return __ref.runUserSub(false, "settings","btntlnspeichern_click", __ref);}
 BA.debugLineNum = 955;BA.debugLine="Private Sub btnTLNSpeichern_Click";
Debug.ShouldStop(67108864);
 BA.debugLineNum = 956;BA.debugLine="saveTLN";
Debug.ShouldStop(134217728);
__ref.runClassMethod (b4a.example.settings.class, "_savetln" /*RemoteObject*/ );
 BA.debugLineNum = 957;BA.debugLine="startTimer";
Debug.ShouldStop(268435456);
__ref.runClassMethod (b4a.example.settings.class, "_starttimer" /*RemoteObject*/ );
 BA.debugLineNum = 958;BA.debugLine="End Sub";
Debug.ShouldStop(536870912);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static void  _btnverstgdelete_click(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("btnVerstgDelete_Click (settings) ","settings",3,__ref.getField(false, "ba"),__ref,912);
if (RapidSub.canDelegate("btnverstgdelete_click")) { __ref.runUserSub(false, "settings","btnverstgdelete_click", __ref); return;}
ResumableSub_btnVerstgDelete_Click rsub = new ResumableSub_btnVerstgDelete_Click(null,__ref);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_btnVerstgDelete_Click extends BA.ResumableSub {
public ResumableSub_btnVerstgDelete_Click(b4a.example.settings parent,RemoteObject __ref) {
this.parent = parent;
this.__ref = __ref;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4a.example.settings parent;
RemoteObject _res;

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("btnVerstgDelete_Click (settings) ","settings",3,__ref.getField(false, "ba"),__ref,912);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
;
 BA.debugLineNum = 913;BA.debugLine="startTimer";
Debug.ShouldStop(65536);
__ref.runClassMethod (b4a.example.settings.class, "_starttimer" /*RemoteObject*/ );
 BA.debugLineNum = 914;BA.debugLine="Msgbox2Async(\"Die Veranstaltung und deren Wertung";
Debug.ShouldStop(131072);
parent.__c.runVoidMethod ("Msgbox2Async",(Object)(BA.ObjectToCharSequence("Die Veranstaltung und deren Wertungsliste werden unwiederbringlich gelöscht! Wirklich löschen?")),(Object)(BA.ObjectToCharSequence("Veranstaltung wirklich löschen?")),(Object)(BA.ObjectToString("Löschen")),(Object)(BA.ObjectToString("")),(Object)(BA.ObjectToString("Abbrechen")),RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper"), parent.__c.getField(false,"Null")),__ref.getField(false, "ba"),(Object)(parent.__c.getField(true,"True")));
 BA.debugLineNum = 915;BA.debugLine="Wait For Msgbox_Result (res As Int)";
Debug.ShouldStop(262144);
parent.__c.runVoidMethod ("WaitFor","msgbox_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "settings", "btnverstgdelete_click"), null);
this.state = 5;
return;
case 5:
//C
this.state = 1;
_res = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("res", _res);
;
 BA.debugLineNum = 916;BA.debugLine="If res = DialogResponse.POSITIVE Then";
Debug.ShouldStop(524288);
if (true) break;

case 1:
//if
this.state = 4;
if (RemoteObject.solveBoolean("=",_res,BA.numberCast(double.class, parent.__c.getField(false,"DialogResponse").getField(true,"POSITIVE")))) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
 BA.debugLineNum = 917;BA.debugLine="delWertungsliste(webviewVSTGN_ID)";
Debug.ShouldStop(1048576);
__ref.runClassMethod (b4a.example.settings.class, "_delwertungsliste" /*RemoteObject*/ ,(Object)(__ref.getField(true,"_webviewvstgn_id" /*RemoteObject*/ )));
 BA.debugLineNum = 918;BA.debugLine="startTimer";
Debug.ShouldStop(2097152);
__ref.runClassMethod (b4a.example.settings.class, "_starttimer" /*RemoteObject*/ );
 if (true) break;

case 4:
//C
this.state = -1;
;
 BA.debugLineNum = 920;BA.debugLine="End Sub";
Debug.ShouldStop(8388608);
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
public static void  _btnverstgspeichern_click(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("btnVerstgSpeichern_Click (settings) ","settings",3,__ref.getField(false, "ba"),__ref,922);
if (RapidSub.canDelegate("btnverstgspeichern_click")) { __ref.runUserSub(false, "settings","btnverstgspeichern_click", __ref); return;}
ResumableSub_btnVerstgSpeichern_Click rsub = new ResumableSub_btnVerstgSpeichern_Click(null,__ref);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_btnVerstgSpeichern_Click extends BA.ResumableSub {
public ResumableSub_btnVerstgSpeichern_Click(b4a.example.settings parent,RemoteObject __ref) {
this.parent = parent;
this.__ref = __ref;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4a.example.settings parent;
RemoteObject _neuanz = RemoteObject.createImmutable(0);
RemoteObject _altanz = RemoteObject.createImmutable(0);
RemoteObject _vmap = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _res;

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("btnVerstgSpeichern_Click (settings) ","settings",3,__ref.getField(false, "ba"),__ref,922);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
;
 BA.debugLineNum = 923;BA.debugLine="startTimer";
Debug.ShouldStop(67108864);
__ref.runClassMethod (b4a.example.settings.class, "_starttimer" /*RemoteObject*/ );
 BA.debugLineNum = 924;BA.debugLine="Dim neuAnz As Int = 0";
Debug.ShouldStop(134217728);
_neuanz = BA.numberCast(int.class, 0);Debug.locals.put("neuanz", _neuanz);Debug.locals.put("neuAnz", _neuanz);
 BA.debugLineNum = 925;BA.debugLine="If IsNumber(tbxAnzahl.Text) Then neuAnz = tbxAnza";
Debug.ShouldStop(268435456);
if (true) break;

case 1:
//if
this.state = 6;
if (parent.__c.runMethod(true,"IsNumber",(Object)(__ref.getField(false,"_tbxanzahl" /*RemoteObject*/ ).runMethod(true,"getText"))).<Boolean>get().booleanValue()) { 
this.state = 3;
;}if (true) break;

case 3:
//C
this.state = 6;
_neuanz = BA.numberCast(int.class, __ref.getField(false,"_tbxanzahl" /*RemoteObject*/ ).runMethod(true,"getText"));Debug.locals.put("neuAnz", _neuanz);
if (true) break;

case 6:
//C
this.state = 7;
;
 BA.debugLineNum = 927;BA.debugLine="Dim altAnz As Int = 0";
Debug.ShouldStop(1073741824);
_altanz = BA.numberCast(int.class, 0);Debug.locals.put("altanz", _altanz);Debug.locals.put("altAnz", _altanz);
 BA.debugLineNum = 928;BA.debugLine="If Veranstaltungen.IsInitialized And Veranstaltun";
Debug.ShouldStop(-2147483648);
if (true) break;

case 7:
//if
this.state = 10;
if (RemoteObject.solveBoolean(".",__ref.getField(false,"_veranstaltungen" /*RemoteObject*/ ).runMethod(true,"IsInitialized")) && RemoteObject.solveBoolean(".",__ref.getField(false,"_veranstaltungen" /*RemoteObject*/ ).runMethod(true,"ContainsKey",(Object)((__ref.getField(true,"_veranstaltung_id" /*RemoteObject*/ )))))) { 
this.state = 9;
}if (true) break;

case 9:
//C
this.state = 10;
 BA.debugLineNum = 929;BA.debugLine="Dim vMap As Map = Veranstaltungen.Get(Veranstalt";
Debug.ShouldStop(1);
_vmap = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_vmap = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), __ref.getField(false,"_veranstaltungen" /*RemoteObject*/ ).runMethod(false,"Get",(Object)((__ref.getField(true,"_veranstaltung_id" /*RemoteObject*/ )))));Debug.locals.put("vmap", _vmap);Debug.locals.put("vMap", _vmap);
 BA.debugLineNum = 930;BA.debugLine="altAnz = vMap.GetDefault(\"Teilnehmerzahl\", \"0\")";
Debug.ShouldStop(2);
_altanz = BA.numberCast(int.class, _vmap.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("Teilnehmerzahl"))),(Object)((RemoteObject.createImmutable("0")))));Debug.locals.put("altAnz", _altanz);
 if (true) break;
;
 BA.debugLineNum = 933;BA.debugLine="If neuAnz < altAnz Then";
Debug.ShouldStop(16);

case 10:
//if
this.state = 19;
if (RemoteObject.solveBoolean("<",_neuanz,BA.numberCast(double.class, _altanz))) { 
this.state = 12;
}else {
this.state = 18;
}if (true) break;

case 12:
//C
this.state = 13;
 BA.debugLineNum = 934;BA.debugLine="Msgbox2Async(\"Die Anzahl der Plätze wurde reduzi";
Debug.ShouldStop(32);
parent.__c.runVoidMethod ("Msgbox2Async",(Object)(BA.ObjectToCharSequence("Die Anzahl der Plätze wurde reduziert. Werden die geänderten Daten der Veranstaltung gespeichert, gehen ggf. Informationen in der Wertungsliste der Veranstaltung unwiederbringlich verloren.")),(Object)(BA.ObjectToCharSequence("Veranstaltung - Plätze")),(Object)(BA.ObjectToString("Trotzdem speichern.")),(Object)(BA.ObjectToString("")),(Object)(BA.ObjectToString("Abbrechen")),RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper"), parent.__c.getField(false,"Null")),__ref.getField(false, "ba"),(Object)(parent.__c.getField(true,"True")));
 BA.debugLineNum = 935;BA.debugLine="Wait For Msgbox_Result (res As Int)";
Debug.ShouldStop(64);
parent.__c.runVoidMethod ("WaitFor","msgbox_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "settings", "btnverstgspeichern_click"), null);
this.state = 20;
return;
case 20:
//C
this.state = 13;
_res = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("res", _res);
;
 BA.debugLineNum = 936;BA.debugLine="If res = DialogResponse.POSITIVE Then";
Debug.ShouldStop(128);
if (true) break;

case 13:
//if
this.state = 16;
if (RemoteObject.solveBoolean("=",_res,BA.numberCast(double.class, parent.__c.getField(false,"DialogResponse").getField(true,"POSITIVE")))) { 
this.state = 15;
}if (true) break;

case 15:
//C
this.state = 16;
 BA.debugLineNum = 937;BA.debugLine="saveVSTNG";
Debug.ShouldStop(256);
__ref.runClassMethod (b4a.example.settings.class, "_savevstng" /*RemoteObject*/ );
 BA.debugLineNum = 938;BA.debugLine="startTimer";
Debug.ShouldStop(512);
__ref.runClassMethod (b4a.example.settings.class, "_starttimer" /*RemoteObject*/ );
 if (true) break;

case 16:
//C
this.state = 19;
;
 if (true) break;

case 18:
//C
this.state = 19;
 BA.debugLineNum = 941;BA.debugLine="saveVSTNG";
Debug.ShouldStop(4096);
__ref.runClassMethod (b4a.example.settings.class, "_savevstng" /*RemoteObject*/ );
 if (true) break;

case 19:
//C
this.state = -1;
;
 BA.debugLineNum = 943;BA.debugLine="End Sub";
Debug.ShouldStop(16384);
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
public static RemoteObject  _changeurl(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("changeURL (settings) ","settings",3,__ref.getField(false, "ba"),__ref,441);
if (RapidSub.canDelegate("changeurl")) { return __ref.runUserSub(false, "settings","changeurl", __ref);}
RemoteObject _url = RemoteObject.createImmutable("");
 BA.debugLineNum = 441;BA.debugLine="Private Sub changeURL";
Debug.ShouldStop(16777216);
 BA.debugLineNum = 442;BA.debugLine="Dim url As String = DBGet(\"VereinsID\", \"[...]\")";
Debug.ShouldStop(33554432);
_url = BA.ObjectToString(__ref.runClassMethod (b4a.example.settings.class, "_dbget" /*RemoteObject*/ ,(Object)(BA.ObjectToString("VereinsID")),(Object)((RemoteObject.createImmutable("[...]")))));Debug.locals.put("url", _url);Debug.locals.put("url", _url);
 BA.debugLineNum = 443;BA.debugLine="URLveranstaltungen = \"https://wertungslisten-app-";
Debug.ShouldStop(67108864);
__ref.setField ("_urlveranstaltungen" /*RemoteObject*/ ,RemoteObject.concat(RemoteObject.createImmutable("https://wertungslisten-app-default-rtdb.europe-west1.firebasedatabase.app/Vereine/"),_url,RemoteObject.createImmutable("/Veranstaltungen")));
 BA.debugLineNum = 444;BA.debugLine="URLteilnehmer = \"https://wertungslisten-app-defau";
Debug.ShouldStop(134217728);
__ref.setField ("_urlteilnehmer" /*RemoteObject*/ ,RemoteObject.concat(RemoteObject.createImmutable("https://wertungslisten-app-default-rtdb.europe-west1.firebasedatabase.app/Vereine/"),_url,RemoteObject.createImmutable("/Teilnehmer")));
 BA.debugLineNum = 445;BA.debugLine="URLergebnisse = \"https://wertungslisten-app-defau";
Debug.ShouldStop(268435456);
__ref.setField ("_urlergebnisse" /*RemoteObject*/ ,RemoteObject.concat(RemoteObject.createImmutable("https://wertungslisten-app-default-rtdb.europe-west1.firebasedatabase.app/Vereine/"),_url,RemoteObject.createImmutable("/Ergebnisse")));
 BA.debugLineNum = 446;BA.debugLine="End Sub";
Debug.ShouldStop(536870912);
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
settings._root = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");__ref.setField("_root",settings._root);
 //BA.debugLineNum = 6;BA.debugLine="Private xui As XUI";
settings._xui = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper.XUI");__ref.setField("_xui",settings._xui);
 //BA.debugLineNum = 9;BA.debugLine="Public URLveranstaltungen As String = \"https://we";
settings._urlveranstaltungen = BA.ObjectToString("https://wertungslisten-app-default-rtdb.europe-west1.firebasedatabase.app/Vereine/[...]/Veranstaltungen");__ref.setField("_urlveranstaltungen",settings._urlveranstaltungen);
 //BA.debugLineNum = 10;BA.debugLine="Public URLteilnehmer As String = \"https://wertung";
settings._urlteilnehmer = BA.ObjectToString("https://wertungslisten-app-default-rtdb.europe-west1.firebasedatabase.app/Vereine/[...]/Teilnehmer");__ref.setField("_urlteilnehmer",settings._urlteilnehmer);
 //BA.debugLineNum = 11;BA.debugLine="Public URLergebnisse As String = \"https://wertung";
settings._urlergebnisse = BA.ObjectToString("https://wertungslisten-app-default-rtdb.europe-west1.firebasedatabase.app/Vereine/[...]/Ergebnisse");__ref.setField("_urlergebnisse",settings._urlergebnisse);
 //BA.debugLineNum = 12;BA.debugLine="Public DBdatenTyp As String = \"\"";
settings._dbdatentyp = BA.ObjectToString("");__ref.setField("_dbdatentyp",settings._dbdatentyp);
 //BA.debugLineNum = 13;BA.debugLine="Public dochange As Boolean = False";
settings._dochange = settings.__c.getField(true,"False");__ref.setField("_dochange",settings._dochange);
 //BA.debugLineNum = 14;BA.debugLine="Public Status As Map";
settings._status = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");__ref.setField("_status",settings._status);
 //BA.debugLineNum = 15;BA.debugLine="Public Veranstaltungen As Map";
settings._veranstaltungen = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");__ref.setField("_veranstaltungen",settings._veranstaltungen);
 //BA.debugLineNum = 16;BA.debugLine="Public webviewVSTGN As List";
settings._webviewvstgn = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");__ref.setField("_webviewvstgn",settings._webviewvstgn);
 //BA.debugLineNum = 17;BA.debugLine="Public Veranstaltung_ID As String = \"v0\"";
settings._veranstaltung_id = BA.ObjectToString("v0");__ref.setField("_veranstaltung_id",settings._veranstaltung_id);
 //BA.debugLineNum = 18;BA.debugLine="Public webviewVSTGN_ID As String = \"v0\"";
settings._webviewvstgn_id = BA.ObjectToString("v0");__ref.setField("_webviewvstgn_id",settings._webviewvstgn_id);
 //BA.debugLineNum = 19;BA.debugLine="Public VSTGNnewID As String = \"v1\"";
settings._vstgnnewid = BA.ObjectToString("v1");__ref.setField("_vstgnnewid",settings._vstgnnewid);
 //BA.debugLineNum = 20;BA.debugLine="Public Teilnehmer As List";
settings._teilnehmer = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");__ref.setField("_teilnehmer",settings._teilnehmer);
 //BA.debugLineNum = 21;BA.debugLine="Public TLNid As String = \"t0\"";
settings._tlnid = BA.ObjectToString("t0");__ref.setField("_tlnid",settings._tlnid);
 //BA.debugLineNum = 22;BA.debugLine="Public TLNnewID As String = \"t1\"";
settings._tlnnewid = BA.ObjectToString("t1");__ref.setField("_tlnnewid",settings._tlnnewid);
 //BA.debugLineNum = 23;BA.debugLine="Public colorgreen As Int = 0xFF16AA16";
settings._colorgreen = BA.numberCast(int.class, ((int)0xff16aa16));__ref.setField("_colorgreen",settings._colorgreen);
 //BA.debugLineNum = 24;BA.debugLine="Public colorblue As Int = 0xFF3333FF";
settings._colorblue = BA.numberCast(int.class, ((int)0xff3333ff));__ref.setField("_colorblue",settings._colorblue);
 //BA.debugLineNum = 27;BA.debugLine="Private lblVerein As Label";
settings._lblverein = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");__ref.setField("_lblverein",settings._lblverein);
 //BA.debugLineNum = 28;BA.debugLine="Private lblVeranstaltung As Label";
settings._lblveranstaltung = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");__ref.setField("_lblveranstaltung",settings._lblveranstaltung);
 //BA.debugLineNum = 29;BA.debugLine="Private lblDatum As Label";
settings._lbldatum = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");__ref.setField("_lbldatum",settings._lbldatum);
 //BA.debugLineNum = 30;BA.debugLine="Private btnBack As Button";
settings._btnback = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");__ref.setField("_btnback",settings._btnback);
 //BA.debugLineNum = 32;BA.debugLine="Private svMain As ScrollView";
settings._svmain = RemoteObject.createNew ("anywheresoftware.b4a.objects.ScrollViewWrapper");__ref.setField("_svmain",settings._svmain);
 //BA.debugLineNum = 33;BA.debugLine="Private lblClosed As Label";
settings._lblclosed = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");__ref.setField("_lblclosed",settings._lblclosed);
 //BA.debugLineNum = 34;BA.debugLine="Private dprDatum As Button ' Ersetzt App Inventor";
settings._dprdatum = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");__ref.setField("_dprdatum",settings._dprdatum);
 //BA.debugLineNum = 35;BA.debugLine="Private btnAuswahl As Button";
settings._btnauswahl = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");__ref.setField("_btnauswahl",settings._btnauswahl);
 //BA.debugLineNum = 36;BA.debugLine="Private tbxVeranstaltung As EditText";
settings._tbxveranstaltung = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");__ref.setField("_tbxveranstaltung",settings._tbxveranstaltung);
 //BA.debugLineNum = 37;BA.debugLine="Private tbxAnzahl As EditText";
settings._tbxanzahl = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");__ref.setField("_tbxanzahl",settings._tbxanzahl);
 //BA.debugLineNum = 38;BA.debugLine="Private btnVerstgDelete As Button";
settings._btnverstgdelete = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");__ref.setField("_btnverstgdelete",settings._btnverstgdelete);
 //BA.debugLineNum = 39;BA.debugLine="Private btnVerstgSpeichern As Button";
settings._btnverstgspeichern = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");__ref.setField("_btnverstgspeichern",settings._btnverstgspeichern);
 //BA.debugLineNum = 41;BA.debugLine="Private lstVeranstaltungen As CustomListView";
settings._lstveranstaltungen = RemoteObject.createNew ("b4a.example3.customlistview");__ref.setField("_lstveranstaltungen",settings._lstveranstaltungen);
 //BA.debugLineNum = 42;BA.debugLine="Private lstTeilnehmer As CustomListView";
settings._lstteilnehmer = RemoteObject.createNew ("b4a.example3.customlistview");__ref.setField("_lstteilnehmer",settings._lstteilnehmer);
 //BA.debugLineNum = 44;BA.debugLine="Private tbxTeilnehmer As EditText";
settings._tbxteilnehmer = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");__ref.setField("_tbxteilnehmer",settings._tbxteilnehmer);
 //BA.debugLineNum = 45;BA.debugLine="Private btnTLNDelete As Button";
settings._btntlndelete = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");__ref.setField("_btntlndelete",settings._btntlndelete);
 //BA.debugLineNum = 46;BA.debugLine="Private btnTLNSpeichern As Button";
settings._btntlnspeichern = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");__ref.setField("_btntlnspeichern",settings._btntlnspeichern);
 //BA.debugLineNum = 49;BA.debugLine="Private Uhrzeit As Timer";
settings._uhrzeit = RemoteObject.createNew ("anywheresoftware.b4a.objects.Timer");__ref.setField("_uhrzeit",settings._uhrzeit);
 //BA.debugLineNum = 50;BA.debugLine="Private DBVerein As Map";
settings._dbverein = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");__ref.setField("_dbverein",settings._dbverein);
 //BA.debugLineNum = 51;BA.debugLine="Private DBFileName As String = \"DBVerein.dat\"";
settings._dbfilename = BA.ObjectToString("DBVerein.dat");__ref.setField("_dbfilename",settings._dbfilename);
 //BA.debugLineNum = 52;BA.debugLine="Private CurrentWebUrl As String = \"\"";
settings._currentweburl = BA.ObjectToString("");__ref.setField("_currentweburl",settings._currentweburl);
 //BA.debugLineNum = 53;BA.debugLine="Private dprYear As Int";
settings._dpryear = RemoteObject.createImmutable(0);__ref.setField("_dpryear",settings._dpryear);
 //BA.debugLineNum = 54;BA.debugLine="Private dprMonth As Int";
settings._dprmonth = RemoteObject.createImmutable(0);__ref.setField("_dprmonth",settings._dprmonth);
 //BA.debugLineNum = 55;BA.debugLine="Private dprDay As Int";
settings._dprday = RemoteObject.createImmutable(0);__ref.setField("_dprday",settings._dprday);
 //BA.debugLineNum = 56;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _closesettings(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("CloseSettings (settings) ","settings",3,__ref.getField(false, "ba"),__ref,114);
if (RapidSub.canDelegate("closesettings")) { return __ref.runUserSub(false, "settings","closesettings", __ref);}
 BA.debugLineNum = 114;BA.debugLine="Private Sub CloseSettings";
Debug.ShouldStop(131072);
 BA.debugLineNum = 115;BA.debugLine="Uhrzeit.Enabled = False";
Debug.ShouldStop(262144);
__ref.getField(false,"_uhrzeit" /*RemoteObject*/ ).runMethod(true,"setEnabled",settings.__c.getField(true,"False"));
 BA.debugLineNum = 116;BA.debugLine="B4XPages.MainPage.Status = Status";
Debug.ShouldStop(524288);
settings._b4xpages.runMethod(false,"_mainpage" /*RemoteObject*/ ,__ref.getField(false, "ba")).setField ("_status" /*RemoteObject*/ ,__ref.getField(false,"_status" /*RemoteObject*/ ));
 BA.debugLineNum = 117;BA.debugLine="B4XPages.ClosePage(Me)";
Debug.ShouldStop(1048576);
settings._b4xpages.runVoidMethod ("_closepage" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(__ref));
 BA.debugLineNum = 118;BA.debugLine="End Sub";
Debug.ShouldStop(2097152);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _clvteilnehmer_itemclick(RemoteObject __ref,RemoteObject _index,RemoteObject _value) throws Exception{
try {
		Debug.PushSubsStack("CLVTeilnehmer_ItemClick (settings) ","settings",3,__ref.getField(false, "ba"),__ref,1165);
if (RapidSub.canDelegate("clvteilnehmer_itemclick")) { return __ref.runUserSub(false, "settings","clvteilnehmer_itemclick", __ref, _index, _value);}
Debug.locals.put("Index", _index);
Debug.locals.put("Value", _value);
 BA.debugLineNum = 1165;BA.debugLine="Private Sub CLVTeilnehmer_ItemClick(Index As Int,";
Debug.ShouldStop(4096);
 BA.debugLineNum = 1167;BA.debugLine="TLNid = Value";
Debug.ShouldStop(16384);
__ref.setField ("_tlnid" /*RemoteObject*/ ,BA.ObjectToString(_value));
 BA.debugLineNum = 1168;BA.debugLine="setzeTeilnehmer(TLNid)";
Debug.ShouldStop(32768);
__ref.runClassMethod (b4a.example.settings.class, "_setzeteilnehmer" /*RemoteObject*/ ,(Object)(__ref.getField(true,"_tlnid" /*RemoteObject*/ )));
 BA.debugLineNum = 1170;BA.debugLine="End Sub";
Debug.ShouldStop(131072);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _clvveranstaltungen_itemclick(RemoteObject __ref,RemoteObject _index,RemoteObject _value) throws Exception{
try {
		Debug.PushSubsStack("CLVVeranstaltungen_ItemClick (settings) ","settings",3,__ref.getField(false, "ba"),__ref,1146);
if (RapidSub.canDelegate("clvveranstaltungen_itemclick")) { return __ref.runUserSub(false, "settings","clvveranstaltungen_itemclick", __ref, _index, _value);}
Debug.locals.put("Index", _index);
Debug.locals.put("Value", _value);
 BA.debugLineNum = 1146;BA.debugLine="Private Sub CLVVeranstaltungen_ItemClick(Index As";
Debug.ShouldStop(33554432);
 BA.debugLineNum = 1148;BA.debugLine="webviewVSTGN_ID = Value";
Debug.ShouldStop(134217728);
__ref.setField ("_webviewvstgn_id" /*RemoteObject*/ ,BA.ObjectToString(_value));
 BA.debugLineNum = 1149;BA.debugLine="setzeVeranstaltung(webviewVSTGN_ID)";
Debug.ShouldStop(268435456);
__ref.runClassMethod (b4a.example.settings.class, "_setzeveranstaltung" /*RemoteObject*/ ,(Object)(__ref.getField(true,"_webviewvstgn_id" /*RemoteObject*/ )));
 BA.debugLineNum = 1151;BA.debugLine="End Sub";
Debug.ShouldStop(1073741824);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _dateutils_setdate(RemoteObject __ref,RemoteObject _year,RemoteObject _month,RemoteObject _day) throws Exception{
try {
		Debug.PushSubsStack("DateUtils_SetDate (settings) ","settings",3,__ref.getField(false, "ba"),__ref,895);
if (RapidSub.canDelegate("dateutils_setdate")) { return __ref.runUserSub(false, "settings","dateutils_setdate", __ref, _year, _month, _day);}
RemoteObject _oldformat = RemoteObject.createImmutable("");
RemoteObject _paddedmonth = RemoteObject.createImmutable("");
RemoteObject _paddedday = RemoteObject.createImmutable("");
RemoteObject _ticks = RemoteObject.createImmutable(0L);
Debug.locals.put("Year", _year);
Debug.locals.put("Month", _month);
Debug.locals.put("Day", _day);
 BA.debugLineNum = 895;BA.debugLine="Private Sub DateUtils_SetDate(Year As Int, Month A";
Debug.ShouldStop(1073741824);
 BA.debugLineNum = 896;BA.debugLine="Dim oldFormat As String = DateTime.DateFormat";
Debug.ShouldStop(-2147483648);
_oldformat = settings.__c.getField(false,"DateTime").runMethod(true,"getDateFormat");Debug.locals.put("oldformat", _oldformat);Debug.locals.put("oldFormat", _oldformat);
 BA.debugLineNum = 897;BA.debugLine="DateTime.DateFormat = \"yyyy-MM-dd\"";
Debug.ShouldStop(1);
settings.__c.getField(false,"DateTime").runMethod(true,"setDateFormat",BA.ObjectToString("yyyy-MM-dd"));
 BA.debugLineNum = 898;BA.debugLine="Dim paddedMonth As String = NumberFormat(Month, 2";
Debug.ShouldStop(2);
_paddedmonth = settings.__c.runMethod(true,"NumberFormat",(Object)(BA.numberCast(double.class, _month)),(Object)(BA.numberCast(int.class, 2)),(Object)(BA.numberCast(int.class, 0)));Debug.locals.put("paddedmonth", _paddedmonth);Debug.locals.put("paddedMonth", _paddedmonth);
 BA.debugLineNum = 899;BA.debugLine="Dim paddedDay As String = NumberFormat(Day, 2, 0)";
Debug.ShouldStop(4);
_paddedday = settings.__c.runMethod(true,"NumberFormat",(Object)(BA.numberCast(double.class, _day)),(Object)(BA.numberCast(int.class, 2)),(Object)(BA.numberCast(int.class, 0)));Debug.locals.put("paddedday", _paddedday);Debug.locals.put("paddedDay", _paddedday);
 BA.debugLineNum = 900;BA.debugLine="Dim ticks As Long = DateTime.DateParse(Year & \"-\"";
Debug.ShouldStop(8);
_ticks = settings.__c.getField(false,"DateTime").runMethod(true,"DateParse",(Object)(RemoteObject.concat(_year,RemoteObject.createImmutable("-"),_paddedmonth,RemoteObject.createImmutable("-"),_paddedday)));Debug.locals.put("ticks", _ticks);Debug.locals.put("ticks", _ticks);
 BA.debugLineNum = 901;BA.debugLine="DateTime.DateFormat = oldFormat";
Debug.ShouldStop(16);
settings.__c.getField(false,"DateTime").runMethod(true,"setDateFormat",_oldformat);
 BA.debugLineNum = 902;BA.debugLine="Return ticks";
Debug.ShouldStop(32);
if (true) return _ticks;
 BA.debugLineNum = 903;BA.debugLine="End Sub";
Debug.ShouldStop(64);
return RemoteObject.createImmutable(0L);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _dbget(RemoteObject __ref,RemoteObject _key,RemoteObject _defaultvalue) throws Exception{
try {
		Debug.PushSubsStack("DBGet (settings) ","settings",3,__ref.getField(false, "ba"),__ref,1112);
if (RapidSub.canDelegate("dbget")) { return __ref.runUserSub(false, "settings","dbget", __ref, _key, _defaultvalue);}
RemoteObject _val = RemoteObject.createImmutable("");
RemoteObject _jp = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.JSONParser");
Debug.locals.put("Key", _key);
Debug.locals.put("DefaultValue", _defaultvalue);
 BA.debugLineNum = 1112;BA.debugLine="Private Sub DBGet(Key As String, DefaultValue As O";
Debug.ShouldStop(8388608);
 BA.debugLineNum = 1113;BA.debugLine="If DBVerein.ContainsKey(Key) = False Then Return";
Debug.ShouldStop(16777216);
if (RemoteObject.solveBoolean("=",__ref.getField(false,"_dbverein" /*RemoteObject*/ ).runMethod(true,"ContainsKey",(Object)((_key))),settings.__c.getField(true,"False"))) { 
if (true) return _defaultvalue;};
 BA.debugLineNum = 1114;BA.debugLine="Dim val As String = DBVerein.Get(Key)";
Debug.ShouldStop(33554432);
_val = BA.ObjectToString(__ref.getField(false,"_dbverein" /*RemoteObject*/ ).runMethod(false,"Get",(Object)((_key))));Debug.locals.put("val", _val);Debug.locals.put("val", _val);
 BA.debugLineNum = 1115;BA.debugLine="If val.StartsWith(\"JSON_MAP:\") Then";
Debug.ShouldStop(67108864);
if (_val.runMethod(true,"startsWith",(Object)(RemoteObject.createImmutable("JSON_MAP:"))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 1116;BA.debugLine="Dim jp As JSONParser";
Debug.ShouldStop(134217728);
_jp = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.JSONParser");Debug.locals.put("jp", _jp);
 BA.debugLineNum = 1117;BA.debugLine="jp.Initialize(val.SubString(9))";
Debug.ShouldStop(268435456);
_jp.runVoidMethod ("Initialize",(Object)(_val.runMethod(true,"substring",(Object)(BA.numberCast(int.class, 9)))));
 BA.debugLineNum = 1118;BA.debugLine="Return jp.NextObject";
Debug.ShouldStop(536870912);
if (true) return (_jp.runMethod(false,"NextObject").getObject());
 }else 
{ BA.debugLineNum = 1119;BA.debugLine="Else If val.StartsWith(\"JSON_LIST:\") Then";
Debug.ShouldStop(1073741824);
if (_val.runMethod(true,"startsWith",(Object)(RemoteObject.createImmutable("JSON_LIST:"))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 1120;BA.debugLine="Dim jp As JSONParser";
Debug.ShouldStop(-2147483648);
_jp = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.JSONParser");Debug.locals.put("jp", _jp);
 BA.debugLineNum = 1121;BA.debugLine="jp.Initialize(val.SubString(10))";
Debug.ShouldStop(1);
_jp.runVoidMethod ("Initialize",(Object)(_val.runMethod(true,"substring",(Object)(BA.numberCast(int.class, 10)))));
 BA.debugLineNum = 1122;BA.debugLine="Return jp.NextArray";
Debug.ShouldStop(2);
if (true) return (_jp.runMethod(false,"NextArray").getObject());
 }}
;
 BA.debugLineNum = 1124;BA.debugLine="Return val";
Debug.ShouldStop(8);
if (true) return (_val);
 BA.debugLineNum = 1125;BA.debugLine="End Sub";
Debug.ShouldStop(16);
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
		Debug.PushSubsStack("DBPut (settings) ","settings",3,__ref.getField(false, "ba"),__ref,1097);
if (RapidSub.canDelegate("dbput")) { return __ref.runUserSub(false, "settings","dbput", __ref, _key, _value);}
RemoteObject _jg = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.JSONParser.JSONGenerator");
Debug.locals.put("Key", _key);
Debug.locals.put("Value", _value);
 BA.debugLineNum = 1097;BA.debugLine="Private Sub DBPut(Key As String, Value As Object)";
Debug.ShouldStop(256);
 BA.debugLineNum = 1098;BA.debugLine="If Value Is Map Then";
Debug.ShouldStop(512);
if (RemoteObject.solveBoolean("i",_value, RemoteObject.createImmutable("java.util.Map"))) { 
 BA.debugLineNum = 1099;BA.debugLine="Dim jg As JSONGenerator";
Debug.ShouldStop(1024);
_jg = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.JSONParser.JSONGenerator");Debug.locals.put("jg", _jg);
 BA.debugLineNum = 1100;BA.debugLine="jg.Initialize(Value)";
Debug.ShouldStop(2048);
_jg.runVoidMethod ("Initialize",RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), _value));
 BA.debugLineNum = 1101;BA.debugLine="DBVerein.Put(Key, \"JSON_MAP:\" & jg.ToString)";
Debug.ShouldStop(4096);
__ref.getField(false,"_dbverein" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)((_key)),(Object)((RemoteObject.concat(RemoteObject.createImmutable("JSON_MAP:"),_jg.runMethod(true,"ToString")))));
 }else 
{ BA.debugLineNum = 1102;BA.debugLine="Else If Value Is List Then";
Debug.ShouldStop(8192);
if (RemoteObject.solveBoolean("i",_value, RemoteObject.createImmutable("java.util.List"))) { 
 BA.debugLineNum = 1103;BA.debugLine="Dim jg As JSONGenerator";
Debug.ShouldStop(16384);
_jg = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.JSONParser.JSONGenerator");Debug.locals.put("jg", _jg);
 BA.debugLineNum = 1104;BA.debugLine="jg.Initialize2(Value)";
Debug.ShouldStop(32768);
_jg.runVoidMethod ("Initialize2",RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.List"), _value));
 BA.debugLineNum = 1105;BA.debugLine="DBVerein.Put(Key, \"JSON_LIST:\" & jg.ToString)";
Debug.ShouldStop(65536);
__ref.getField(false,"_dbverein" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)((_key)),(Object)((RemoteObject.concat(RemoteObject.createImmutable("JSON_LIST:"),_jg.runMethod(true,"ToString")))));
 }else {
 BA.debugLineNum = 1107;BA.debugLine="DBVerein.Put(Key, Value)";
Debug.ShouldStop(262144);
__ref.getField(false,"_dbverein" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)((_key)),(Object)(_value));
 }}
;
 BA.debugLineNum = 1109;BA.debugLine="File.WriteMap(File.DirInternal, DBFileName, DBVer";
Debug.ShouldStop(1048576);
settings.__c.getField(false,"File").runVoidMethod ("WriteMap",(Object)(settings.__c.getField(false,"File").runMethod(true,"getDirInternal")),(Object)(__ref.getField(true,"_dbfilename" /*RemoteObject*/ )),(Object)(__ref.getField(false,"_dbverein" /*RemoteObject*/ )));
 BA.debugLineNum = 1110;BA.debugLine="End Sub";
Debug.ShouldStop(2097152);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _deltln(RemoteObject __ref,RemoteObject _tid) throws Exception{
try {
		Debug.PushSubsStack("delTLN (settings) ","settings",3,__ref.getField(false, "ba"),__ref,716);
if (RapidSub.canDelegate("deltln")) { return __ref.runUserSub(false, "settings","deltln", __ref, _tid);}
Debug.locals.put("tid", _tid);
 BA.debugLineNum = 716;BA.debugLine="Private Sub delTLN(tid As String)";
Debug.ShouldStop(2048);
 BA.debugLineNum = 717;BA.debugLine="disableTLN";
Debug.ShouldStop(4096);
__ref.runClassMethod (b4a.example.settings.class, "_disabletln" /*RemoteObject*/ );
 BA.debugLineNum = 718;BA.debugLine="ToastMessageShow(\"Der Teilnehmer wird gelöscht!\",";
Debug.ShouldStop(8192);
settings.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence("Der Teilnehmer wird gelöscht!")),(Object)(settings.__c.getField(true,"False")));
 BA.debugLineNum = 719;BA.debugLine="DBdatenTyp = \"delTeilnehmer\"";
Debug.ShouldStop(16384);
__ref.setField ("_dbdatentyp" /*RemoteObject*/ ,BA.ObjectToString("delTeilnehmer"));
 BA.debugLineNum = 720;BA.debugLine="CurrentWebUrl = URLteilnehmer & \"/\" & tid & \".jso";
Debug.ShouldStop(32768);
__ref.setField ("_currentweburl" /*RemoteObject*/ ,RemoteObject.concat(__ref.getField(true,"_urlteilnehmer" /*RemoteObject*/ ),RemoteObject.createImmutable("/"),_tid,RemoteObject.createImmutable(".json?auth="),__ref.getField(false,"_status" /*RemoteObject*/ ).runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("idToken"))),(Object)((RemoteObject.createImmutable(""))))));
 BA.debugLineNum = 721;BA.debugLine="ExecuteHttp(\"DELETE\", CurrentWebUrl, \"\")";
Debug.ShouldStop(65536);
__ref.runClassMethod (b4a.example.settings.class, "_executehttp" /*void*/ ,(Object)(BA.ObjectToString("DELETE")),(Object)(__ref.getField(true,"_currentweburl" /*RemoteObject*/ )),(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 722;BA.debugLine="enableTLN";
Debug.ShouldStop(131072);
__ref.runClassMethod (b4a.example.settings.class, "_enabletln" /*RemoteObject*/ );
 BA.debugLineNum = 723;BA.debugLine="End Sub";
Debug.ShouldStop(262144);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _delveranstaltung(RemoteObject __ref,RemoteObject _vid) throws Exception{
try {
		Debug.PushSubsStack("delVeranstaltung (settings) ","settings",3,__ref.getField(false, "ba"),__ref,607);
if (RapidSub.canDelegate("delveranstaltung")) { return __ref.runUserSub(false, "settings","delveranstaltung", __ref, _vid);}
RemoteObject _veranstaltung = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _vname = RemoteObject.createImmutable("");
RemoteObject _vdatum = RemoteObject.createImmutable("");
Debug.locals.put("vid", _vid);
 BA.debugLineNum = 607;BA.debugLine="Private Sub delVeranstaltung(vid As String)";
Debug.ShouldStop(1073741824);
 BA.debugLineNum = 608;BA.debugLine="disableVSTNG";
Debug.ShouldStop(-2147483648);
__ref.runClassMethod (b4a.example.settings.class, "_disablevstng" /*RemoteObject*/ );
 BA.debugLineNum = 609;BA.debugLine="If Veranstaltungen.IsInitialized And Veranstaltun";
Debug.ShouldStop(1);
if (RemoteObject.solveBoolean(".",__ref.getField(false,"_veranstaltungen" /*RemoteObject*/ ).runMethod(true,"IsInitialized")) && RemoteObject.solveBoolean(".",__ref.getField(false,"_veranstaltungen" /*RemoteObject*/ ).runMethod(true,"ContainsKey",(Object)((_vid))))) { 
 BA.debugLineNum = 610;BA.debugLine="Dim veranstaltung As Map = Veranstaltungen.Get(v";
Debug.ShouldStop(2);
_veranstaltung = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_veranstaltung = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), __ref.getField(false,"_veranstaltungen" /*RemoteObject*/ ).runMethod(false,"Get",(Object)((_vid))));Debug.locals.put("veranstaltung", _veranstaltung);Debug.locals.put("veranstaltung", _veranstaltung);
 BA.debugLineNum = 611;BA.debugLine="Dim vName As String = veranstaltung.GetDefault(\"";
Debug.ShouldStop(4);
_vname = BA.ObjectToString(_veranstaltung.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("Name"))),(Object)((RemoteObject.createImmutable(" unbenannt ")))));Debug.locals.put("vname", _vname);Debug.locals.put("vName", _vname);
 BA.debugLineNum = 612;BA.debugLine="Dim vDatum As String = veranstaltung.GetDefault(";
Debug.ShouldStop(8);
_vdatum = BA.ObjectToString(_veranstaltung.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("Datum"))),(Object)((__ref.runClassMethod (b4a.example.settings.class, "_formatdatecustom" /*RemoteObject*/ ,(Object)(settings.__c.getField(false,"DateTime").runMethod(true,"getNow")),(Object)(RemoteObject.createImmutable("dd.MM.yyyy")))))));Debug.locals.put("vdatum", _vdatum);Debug.locals.put("vDatum", _vdatum);
 BA.debugLineNum = 613;BA.debugLine="ToastMessageShow(\"Die Veranstaltung \" & vName &";
Debug.ShouldStop(16);
settings.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence(RemoteObject.concat(RemoteObject.createImmutable("Die Veranstaltung "),_vname,RemoteObject.createImmutable(" vom "),_vdatum,RemoteObject.createImmutable(" wird gelöscht!")))),(Object)(settings.__c.getField(true,"False")));
 BA.debugLineNum = 615;BA.debugLine="DBdatenTyp = \"delVeranstaltung\"";
Debug.ShouldStop(64);
__ref.setField ("_dbdatentyp" /*RemoteObject*/ ,BA.ObjectToString("delVeranstaltung"));
 BA.debugLineNum = 616;BA.debugLine="CurrentWebUrl = URLveranstaltungen & \"/\" & vid &";
Debug.ShouldStop(128);
__ref.setField ("_currentweburl" /*RemoteObject*/ ,RemoteObject.concat(__ref.getField(true,"_urlveranstaltungen" /*RemoteObject*/ ),RemoteObject.createImmutable("/"),_vid,RemoteObject.createImmutable(".json?auth="),__ref.getField(false,"_status" /*RemoteObject*/ ).runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("idToken"))),(Object)((RemoteObject.createImmutable(""))))));
 BA.debugLineNum = 617;BA.debugLine="ExecuteHttp(\"DELETE\", CurrentWebUrl, \"\")";
Debug.ShouldStop(256);
__ref.runClassMethod (b4a.example.settings.class, "_executehttp" /*void*/ ,(Object)(BA.ObjectToString("DELETE")),(Object)(__ref.getField(true,"_currentweburl" /*RemoteObject*/ )),(Object)(RemoteObject.createImmutable("")));
 };
 BA.debugLineNum = 619;BA.debugLine="enableVSTNG";
Debug.ShouldStop(1024);
__ref.runClassMethod (b4a.example.settings.class, "_enablevstng" /*RemoteObject*/ );
 BA.debugLineNum = 620;BA.debugLine="End Sub";
Debug.ShouldStop(2048);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _delwertungsliste(RemoteObject __ref,RemoteObject _vid) throws Exception{
try {
		Debug.PushSubsStack("delWertungsliste (settings) ","settings",3,__ref.getField(false, "ba"),__ref,593);
if (RapidSub.canDelegate("delwertungsliste")) { return __ref.runUserSub(false, "settings","delwertungsliste", __ref, _vid);}
RemoteObject _veranstaltung = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _datumstr = RemoteObject.createImmutable("");
RemoteObject _datum_spl = null;
Debug.locals.put("vid", _vid);
 BA.debugLineNum = 593;BA.debugLine="Private Sub delWertungsliste(vid As String)";
Debug.ShouldStop(65536);
 BA.debugLineNum = 594;BA.debugLine="disableVSTNG";
Debug.ShouldStop(131072);
__ref.runClassMethod (b4a.example.settings.class, "_disablevstng" /*RemoteObject*/ );
 BA.debugLineNum = 595;BA.debugLine="If Veranstaltungen.IsInitialized And Veranstaltun";
Debug.ShouldStop(262144);
if (RemoteObject.solveBoolean(".",__ref.getField(false,"_veranstaltungen" /*RemoteObject*/ ).runMethod(true,"IsInitialized")) && RemoteObject.solveBoolean(".",__ref.getField(false,"_veranstaltungen" /*RemoteObject*/ ).runMethod(true,"ContainsKey",(Object)((_vid))))) { 
 BA.debugLineNum = 596;BA.debugLine="Dim veranstaltung As Map = Veranstaltungen.Get(v";
Debug.ShouldStop(524288);
_veranstaltung = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_veranstaltung = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), __ref.getField(false,"_veranstaltungen" /*RemoteObject*/ ).runMethod(false,"Get",(Object)((_vid))));Debug.locals.put("veranstaltung", _veranstaltung);Debug.locals.put("veranstaltung", _veranstaltung);
 BA.debugLineNum = 597;BA.debugLine="Dim datumStr As String = veranstaltung.GetDefaul";
Debug.ShouldStop(1048576);
_datumstr = BA.ObjectToString(_veranstaltung.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("Datum"))),(Object)((RemoteObject.createImmutable("00.00.0000")))));Debug.locals.put("datumstr", _datumstr);Debug.locals.put("datumStr", _datumstr);
 BA.debugLineNum = 598;BA.debugLine="Dim datum_spl() As String = Regex.Split(\"\\.\", da";
Debug.ShouldStop(2097152);
_datum_spl = settings.__c.getField(false,"Regex").runMethod(false,"Split",(Object)(BA.ObjectToString("\\.")),(Object)(_datumstr));Debug.locals.put("datum_spl", _datum_spl);Debug.locals.put("datum_spl", _datum_spl);
 BA.debugLineNum = 599;BA.debugLine="If datum_spl.Length >= 3 Then";
Debug.ShouldStop(4194304);
if (RemoteObject.solveBoolean("g",_datum_spl.getField(true,"length"),BA.numberCast(double.class, 3))) { 
 BA.debugLineNum = 600;BA.debugLine="DBdatenTyp = \"delErgebnis\"";
Debug.ShouldStop(8388608);
__ref.setField ("_dbdatentyp" /*RemoteObject*/ ,BA.ObjectToString("delErgebnis"));
 BA.debugLineNum = 601;BA.debugLine="CurrentWebUrl = URLergebnisse & \"/e\" & datum_sp";
Debug.ShouldStop(16777216);
__ref.setField ("_currentweburl" /*RemoteObject*/ ,RemoteObject.concat(__ref.getField(true,"_urlergebnisse" /*RemoteObject*/ ),RemoteObject.createImmutable("/e"),_datum_spl.getArrayElement(true,BA.numberCast(int.class, 2)),_datum_spl.getArrayElement(true,BA.numberCast(int.class, 1)),_datum_spl.getArrayElement(true,BA.numberCast(int.class, 0)),RemoteObject.createImmutable(".json?auth="),__ref.getField(false,"_status" /*RemoteObject*/ ).runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("idToken"))),(Object)((RemoteObject.createImmutable(""))))));
 BA.debugLineNum = 602;BA.debugLine="ExecuteHttp(\"DELETE\", CurrentWebUrl, \"\")";
Debug.ShouldStop(33554432);
__ref.runClassMethod (b4a.example.settings.class, "_executehttp" /*void*/ ,(Object)(BA.ObjectToString("DELETE")),(Object)(__ref.getField(true,"_currentweburl" /*RemoteObject*/ )),(Object)(RemoteObject.createImmutable("")));
 };
 };
 BA.debugLineNum = 605;BA.debugLine="End Sub";
Debug.ShouldStop(268435456);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _disabletln(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("disableTLN (settings) ","settings",3,__ref.getField(false, "ba"),__ref,419);
if (RapidSub.canDelegate("disabletln")) { return __ref.runUserSub(false, "settings","disabletln", __ref);}
 BA.debugLineNum = 419;BA.debugLine="Private Sub disableTLN";
Debug.ShouldStop(4);
 BA.debugLineNum = 420;BA.debugLine="btnTLNDelete.Enabled = False";
Debug.ShouldStop(8);
__ref.getField(false,"_btntlndelete" /*RemoteObject*/ ).runMethod(true,"setEnabled",settings.__c.getField(true,"False"));
 BA.debugLineNum = 421;BA.debugLine="btnTLNSpeichern.Enabled = False";
Debug.ShouldStop(16);
__ref.getField(false,"_btntlnspeichern" /*RemoteObject*/ ).runMethod(true,"setEnabled",settings.__c.getField(true,"False"));
 BA.debugLineNum = 422;BA.debugLine="tbxTeilnehmer.Enabled = False";
Debug.ShouldStop(32);
__ref.getField(false,"_tbxteilnehmer" /*RemoteObject*/ ).runMethod(true,"setEnabled",settings.__c.getField(true,"False"));
 BA.debugLineNum = 423;BA.debugLine="btnTLNDelete.TextColor = 0xFF888888";
Debug.ShouldStop(64);
__ref.getField(false,"_btntlndelete" /*RemoteObject*/ ).runMethod(true,"setTextColor",BA.numberCast(int.class, ((int)0xff888888)));
 BA.debugLineNum = 424;BA.debugLine="btnTLNSpeichern.TextColor = 0xFF888888";
Debug.ShouldStop(128);
__ref.getField(false,"_btntlnspeichern" /*RemoteObject*/ ).runMethod(true,"setTextColor",BA.numberCast(int.class, ((int)0xff888888)));
 BA.debugLineNum = 425;BA.debugLine="End Sub";
Debug.ShouldStop(256);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _disablevstng(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("disableVSTNG (settings) ","settings",3,__ref.getField(false, "ba"),__ref,393);
if (RapidSub.canDelegate("disablevstng")) { return __ref.runUserSub(false, "settings","disablevstng", __ref);}
 BA.debugLineNum = 393;BA.debugLine="Private Sub disableVSTNG";
Debug.ShouldStop(256);
 BA.debugLineNum = 394;BA.debugLine="dprDatum.Enabled = False";
Debug.ShouldStop(512);
__ref.getField(false,"_dprdatum" /*RemoteObject*/ ).runMethod(true,"setEnabled",settings.__c.getField(true,"False"));
 BA.debugLineNum = 395;BA.debugLine="dprDatum.TextColor = 0xFF888888";
Debug.ShouldStop(1024);
__ref.getField(false,"_dprdatum" /*RemoteObject*/ ).runMethod(true,"setTextColor",BA.numberCast(int.class, ((int)0xff888888)));
 BA.debugLineNum = 396;BA.debugLine="btnVerstgDelete.Enabled = False";
Debug.ShouldStop(2048);
__ref.getField(false,"_btnverstgdelete" /*RemoteObject*/ ).runMethod(true,"setEnabled",settings.__c.getField(true,"False"));
 BA.debugLineNum = 397;BA.debugLine="btnVerstgDelete.TextColor = 0xFF888888";
Debug.ShouldStop(4096);
__ref.getField(false,"_btnverstgdelete" /*RemoteObject*/ ).runMethod(true,"setTextColor",BA.numberCast(int.class, ((int)0xff888888)));
 BA.debugLineNum = 398;BA.debugLine="btnVerstgSpeichern.Enabled = False";
Debug.ShouldStop(8192);
__ref.getField(false,"_btnverstgspeichern" /*RemoteObject*/ ).runMethod(true,"setEnabled",settings.__c.getField(true,"False"));
 BA.debugLineNum = 399;BA.debugLine="btnVerstgSpeichern.TextColor = 0xFF888888";
Debug.ShouldStop(16384);
__ref.getField(false,"_btnverstgspeichern" /*RemoteObject*/ ).runMethod(true,"setTextColor",BA.numberCast(int.class, ((int)0xff888888)));
 BA.debugLineNum = 400;BA.debugLine="tbxVeranstaltung.Enabled = False";
Debug.ShouldStop(32768);
__ref.getField(false,"_tbxveranstaltung" /*RemoteObject*/ ).runMethod(true,"setEnabled",settings.__c.getField(true,"False"));
 BA.debugLineNum = 401;BA.debugLine="tbxAnzahl.Enabled = False";
Debug.ShouldStop(65536);
__ref.getField(false,"_tbxanzahl" /*RemoteObject*/ ).runMethod(true,"setEnabled",settings.__c.getField(true,"False"));
 BA.debugLineNum = 402;BA.debugLine="btnAuswahl.Enabled = False";
Debug.ShouldStop(131072);
__ref.getField(false,"_btnauswahl" /*RemoteObject*/ ).runMethod(true,"setEnabled",settings.__c.getField(true,"False"));
 BA.debugLineNum = 403;BA.debugLine="btnAuswahl.TextColor = 0xFF888888";
Debug.ShouldStop(262144);
__ref.getField(false,"_btnauswahl" /*RemoteObject*/ ).runMethod(true,"setTextColor",BA.numberCast(int.class, ((int)0xff888888)));
 BA.debugLineNum = 404;BA.debugLine="End Sub";
Debug.ShouldStop(524288);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static void  _dprdatum_click(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("dprDatum_Click (settings) ","settings",3,__ref.getField(false, "ba"),__ref,830);
if (RapidSub.canDelegate("dprdatum_click")) { __ref.runUserSub(false, "settings","dprdatum_click", __ref); return;}
ResumableSub_dprDatum_Click rsub = new ResumableSub_dprDatum_Click(null,__ref);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_dprDatum_Click extends BA.ResumableSub {
public ResumableSub_dprDatum_Click(b4a.example.settings parent,RemoteObject __ref) {
this.parent = parent;
this.__ref = __ref;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4a.example.settings parent;
RemoteObject _ctxt = RemoteObject.declareNull("anywheresoftware.b4j.object.JavaObject");
RemoteObject _listener = RemoteObject.declareNull("Object");
RemoteObject _dlg = RemoteObject.declareNull("anywheresoftware.b4j.object.JavaObject");
RemoteObject _methodname;
RemoteObject _args;
RemoteObject _mzerobased = RemoteObject.createImmutable(0);
RemoteObject _ticks = RemoteObject.createImmutable(0L);
RemoteObject _neu = RemoteObject.createImmutable(false);
RemoteObject _key = RemoteObject.createImmutable("");
RemoteObject _veranstaltung = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _datum = RemoteObject.createImmutable("");
RemoteObject _anzval = RemoteObject.createImmutable(0);
RemoteObject group20;
int index20;
int groupLen20;

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("dprDatum_Click (settings) ","settings",3,__ref.getField(false, "ba"),__ref,830);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
;
 BA.debugLineNum = 831;BA.debugLine="Dim ctxt As JavaObject";
Debug.ShouldStop(1073741824);
_ctxt = RemoteObject.createNew ("anywheresoftware.b4j.object.JavaObject");Debug.locals.put("ctxt", _ctxt);
 BA.debugLineNum = 832;BA.debugLine="ctxt.InitializeContext";
Debug.ShouldStop(-2147483648);
_ctxt.runVoidMethod ("InitializeContext",__ref.getField(false, "ba"));
 BA.debugLineNum = 834;BA.debugLine="Dim listener As Object = ctxt.CreateEventFromUI(\"";
Debug.ShouldStop(2);
_listener = _ctxt.runMethod(false,"CreateEventFromUI",__ref.getField(false, "ba"),(Object)(BA.ObjectToString("android.app.DatePickerDialog$OnDateSetListener")),(Object)(BA.ObjectToString("DateSet")),(Object)(parent.__c.getField(false,"Null")));Debug.locals.put("listener", _listener);Debug.locals.put("listener", _listener);
 BA.debugLineNum = 835;BA.debugLine="Dim dlg As JavaObject";
Debug.ShouldStop(4);
_dlg = RemoteObject.createNew ("anywheresoftware.b4j.object.JavaObject");Debug.locals.put("dlg", _dlg);
 BA.debugLineNum = 836;BA.debugLine="dlg.InitializeNewInstance(\"android.app.DatePicker";
Debug.ShouldStop(8);
_dlg.runVoidMethod ("InitializeNewInstance",(Object)(BA.ObjectToString("android.app.DatePickerDialog")),(Object)(RemoteObject.createNewArray("Object",new int[] {5},new Object[] {(_ctxt.getObject()),_listener,(__ref.getField(true,"_dpryear" /*RemoteObject*/ )),(RemoteObject.solve(new RemoteObject[] {__ref.getField(true,"_dprmonth" /*RemoteObject*/ ),RemoteObject.createImmutable(1)}, "-",1, 1)),(__ref.getField(true,"_dprday" /*RemoteObject*/ ))})));
 BA.debugLineNum = 837;BA.debugLine="dlg.RunMethod(\"show\", Null)";
Debug.ShouldStop(16);
_dlg.runVoidMethod ("RunMethod",(Object)(BA.ObjectToString("show")),(Object)((parent.__c.getField(false,"Null"))));
 BA.debugLineNum = 839;BA.debugLine="Wait For DateSet_Event (MethodName As String, Arg";
Debug.ShouldStop(64);
parent.__c.runVoidMethod ("WaitFor","dateset_event", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "settings", "dprdatum_click"), null);
this.state = 28;
return;
case 28:
//C
this.state = 1;
_methodname = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("MethodName", _methodname);
_args = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(2));Debug.locals.put("Args", _args);
;
 BA.debugLineNum = 840;BA.debugLine="If Args.Length >= 4 Then";
Debug.ShouldStop(128);
if (true) break;

case 1:
//if
this.state = 27;
if (RemoteObject.solveBoolean("g",_args.getField(true,"length"),BA.numberCast(double.class, 4))) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
 BA.debugLineNum = 841;BA.debugLine="dprYear = Args(1)";
Debug.ShouldStop(256);
__ref.setField ("_dpryear" /*RemoteObject*/ ,BA.numberCast(int.class, _args.getArrayElement(false,BA.numberCast(int.class, 1))));
 BA.debugLineNum = 842;BA.debugLine="Dim mZeroBased As Int = Args(2)";
Debug.ShouldStop(512);
_mzerobased = BA.numberCast(int.class, _args.getArrayElement(false,BA.numberCast(int.class, 2)));Debug.locals.put("mzerobased", _mzerobased);Debug.locals.put("mZeroBased", _mzerobased);
 BA.debugLineNum = 843;BA.debugLine="dprMonth = mZeroBased + 1";
Debug.ShouldStop(1024);
__ref.setField ("_dprmonth" /*RemoteObject*/ ,RemoteObject.solve(new RemoteObject[] {_mzerobased,RemoteObject.createImmutable(1)}, "+",1, 1));
 BA.debugLineNum = 844;BA.debugLine="dprDay = Args(3)";
Debug.ShouldStop(2048);
__ref.setField ("_dprday" /*RemoteObject*/ ,BA.numberCast(int.class, _args.getArrayElement(false,BA.numberCast(int.class, 3))));
 BA.debugLineNum = 846;BA.debugLine="Dim ticks As Long = DateUtils_SetDate(dprYear, d";
Debug.ShouldStop(8192);
_ticks = __ref.runClassMethod (b4a.example.settings.class, "_dateutils_setdate" /*RemoteObject*/ ,(Object)(__ref.getField(true,"_dpryear" /*RemoteObject*/ )),(Object)(__ref.getField(true,"_dprmonth" /*RemoteObject*/ )),(Object)(__ref.getField(true,"_dprday" /*RemoteObject*/ )));Debug.locals.put("ticks", _ticks);Debug.locals.put("ticks", _ticks);
 BA.debugLineNum = 847;BA.debugLine="dprDatum.Text = FormatDateCustom(ticks, \"dd.MM.y";
Debug.ShouldStop(16384);
__ref.getField(false,"_dprdatum" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToCharSequence(__ref.runClassMethod (b4a.example.settings.class, "_formatdatecustom" /*RemoteObject*/ ,(Object)(_ticks),(Object)(RemoteObject.createImmutable("dd.MM.yyyy")))));
 BA.debugLineNum = 849;BA.debugLine="btnAuswahl.Enabled = False";
Debug.ShouldStop(65536);
__ref.getField(false,"_btnauswahl" /*RemoteObject*/ ).runMethod(true,"setEnabled",parent.__c.getField(true,"False"));
 BA.debugLineNum = 850;BA.debugLine="btnAuswahl.TextColor = 0xFF888888";
Debug.ShouldStop(131072);
__ref.getField(false,"_btnauswahl" /*RemoteObject*/ ).runMethod(true,"setTextColor",BA.numberCast(int.class, ((int)0xff888888)));
 BA.debugLineNum = 852;BA.debugLine="If dprDatum.Text <> DBGet(\"VeranstaltungDatum\",";
Debug.ShouldStop(524288);
if (true) break;

case 4:
//if
this.state = 26;
if (RemoteObject.solveBoolean("!",__ref.getField(false,"_dprdatum" /*RemoteObject*/ ).runMethod(true,"getText"),BA.ObjectToString(__ref.runClassMethod (b4a.example.settings.class, "_dbget" /*RemoteObject*/ ,(Object)(BA.ObjectToString("VeranstaltungDatum")),(Object)((RemoteObject.createImmutable(""))))))) { 
this.state = 6;
}if (true) break;

case 6:
//C
this.state = 7;
 BA.debugLineNum = 853;BA.debugLine="Dim neu As Boolean = True";
Debug.ShouldStop(1048576);
_neu = parent.__c.getField(true,"True");Debug.locals.put("neu", _neu);Debug.locals.put("neu", _neu);
 BA.debugLineNum = 854;BA.debugLine="If Veranstaltungen.IsInitialized Then";
Debug.ShouldStop(2097152);
if (true) break;

case 7:
//if
this.state = 18;
if (__ref.getField(false,"_veranstaltungen" /*RemoteObject*/ ).runMethod(true,"IsInitialized").<Boolean>get().booleanValue()) { 
this.state = 9;
}if (true) break;

case 9:
//C
this.state = 10;
 BA.debugLineNum = 855;BA.debugLine="For Each key As String In Veranstaltungen.Keys";
Debug.ShouldStop(4194304);
if (true) break;

case 10:
//for
this.state = 17;
group20 = __ref.getField(false,"_veranstaltungen" /*RemoteObject*/ ).runMethod(false,"Keys");
index20 = 0;
groupLen20 = group20.runMethod(true,"getSize").<Integer>get();
Debug.locals.put("key", _key);
this.state = 29;
if (true) break;

case 29:
//C
this.state = 17;
if (index20 < groupLen20) {
this.state = 12;
_key = BA.ObjectToString(group20.runMethod(false,"Get",index20));Debug.locals.put("key", _key);}
if (true) break;

case 30:
//C
this.state = 29;
index20++;
Debug.locals.put("key", _key);
if (true) break;

case 12:
//C
this.state = 13;
 BA.debugLineNum = 856;BA.debugLine="Dim veranstaltung As Map = Veranstaltungen.Ge";
Debug.ShouldStop(8388608);
_veranstaltung = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_veranstaltung = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), __ref.getField(false,"_veranstaltungen" /*RemoteObject*/ ).runMethod(false,"Get",(Object)((_key))));Debug.locals.put("veranstaltung", _veranstaltung);Debug.locals.put("veranstaltung", _veranstaltung);
 BA.debugLineNum = 857;BA.debugLine="Dim datum As String = veranstaltung.GetDefaul";
Debug.ShouldStop(16777216);
_datum = BA.ObjectToString(_veranstaltung.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("Datum"))),(Object)((RemoteObject.createImmutable("-")))));Debug.locals.put("datum", _datum);Debug.locals.put("datum", _datum);
 BA.debugLineNum = 858;BA.debugLine="If dprDatum.Text = datum Then";
Debug.ShouldStop(33554432);
if (true) break;

case 13:
//if
this.state = 16;
if (RemoteObject.solveBoolean("=",__ref.getField(false,"_dprdatum" /*RemoteObject*/ ).runMethod(true,"getText"),_datum)) { 
this.state = 15;
}if (true) break;

case 15:
//C
this.state = 16;
 BA.debugLineNum = 859;BA.debugLine="neu = False";
Debug.ShouldStop(67108864);
_neu = parent.__c.getField(true,"False");Debug.locals.put("neu", _neu);
 BA.debugLineNum = 860;BA.debugLine="disableVSTNG";
Debug.ShouldStop(134217728);
__ref.runClassMethod (b4a.example.settings.class, "_disablevstng" /*RemoteObject*/ );
 BA.debugLineNum = 861;BA.debugLine="webviewVSTGN_ID = key";
Debug.ShouldStop(268435456);
__ref.setField ("_webviewvstgn_id" /*RemoteObject*/ ,_key);
 BA.debugLineNum = 864;BA.debugLine="enableVSTNG";
Debug.ShouldStop(-2147483648);
__ref.runClassMethod (b4a.example.settings.class, "_enablevstng" /*RemoteObject*/ );
 BA.debugLineNum = 865;BA.debugLine="Exit";
Debug.ShouldStop(1);
this.state = 17;
if (true) break;
 if (true) break;

case 16:
//C
this.state = 30;
;
 if (true) break;
if (true) break;

case 17:
//C
this.state = 18;
Debug.locals.put("key", _key);
;
 if (true) break;
;
 BA.debugLineNum = 870;BA.debugLine="If neu Then";
Debug.ShouldStop(32);

case 18:
//if
this.state = 25;
if (_neu.<Boolean>get().booleanValue()) { 
this.state = 20;
}if (true) break;

case 20:
//C
this.state = 21;
 BA.debugLineNum = 871;BA.debugLine="Veranstaltung_ID = VSTGNnewID";
Debug.ShouldStop(64);
__ref.setField ("_veranstaltung_id" /*RemoteObject*/ ,__ref.getField(true,"_vstgnnewid" /*RemoteObject*/ ));
 BA.debugLineNum = 872;BA.debugLine="webviewVSTGN_ID = VSTGNnewID";
Debug.ShouldStop(128);
__ref.setField ("_webviewvstgn_id" /*RemoteObject*/ ,__ref.getField(true,"_vstgnnewid" /*RemoteObject*/ ));
 BA.debugLineNum = 873;BA.debugLine="disableVSTNG";
Debug.ShouldStop(256);
__ref.runClassMethod (b4a.example.settings.class, "_disablevstng" /*RemoteObject*/ );
 BA.debugLineNum = 878;BA.debugLine="tbxAnzahl.Text = \"0\"";
Debug.ShouldStop(8192);
__ref.getField(false,"_tbxanzahl" /*RemoteObject*/ ).runMethodAndSync(true,"setText",BA.ObjectToCharSequence("0"));
 BA.debugLineNum = 879;BA.debugLine="enableVSTNG";
Debug.ShouldStop(16384);
__ref.runClassMethod (b4a.example.settings.class, "_enablevstng" /*RemoteObject*/ );
 BA.debugLineNum = 880;BA.debugLine="Dim anzVal As Int = tbxAnzahl.Text";
Debug.ShouldStop(32768);
_anzval = BA.numberCast(int.class, __ref.getField(false,"_tbxanzahl" /*RemoteObject*/ ).runMethod(true,"getText"));Debug.locals.put("anzval", _anzval);Debug.locals.put("anzVal", _anzval);
 BA.debugLineNum = 881;BA.debugLine="If anzVal > 0 Then";
Debug.ShouldStop(65536);
if (true) break;

case 21:
//if
this.state = 24;
if (RemoteObject.solveBoolean(">",_anzval,BA.numberCast(double.class, 0))) { 
this.state = 23;
}if (true) break;

case 23:
//C
this.state = 24;
 BA.debugLineNum = 882;BA.debugLine="btnVerstgSpeichern.Enabled = True";
Debug.ShouldStop(131072);
__ref.getField(false,"_btnverstgspeichern" /*RemoteObject*/ ).runMethod(true,"setEnabled",parent.__c.getField(true,"True"));
 BA.debugLineNum = 883;BA.debugLine="btnVerstgSpeichern.TextColor = colorgreen";
Debug.ShouldStop(262144);
__ref.getField(false,"_btnverstgspeichern" /*RemoteObject*/ ).runMethod(true,"setTextColor",__ref.getField(true,"_colorgreen" /*RemoteObject*/ ));
 if (true) break;

case 24:
//C
this.state = 25;
;
 BA.debugLineNum = 885;BA.debugLine="btnVerstgDelete.Enabled = False";
Debug.ShouldStop(1048576);
__ref.getField(false,"_btnverstgdelete" /*RemoteObject*/ ).runMethod(true,"setEnabled",parent.__c.getField(true,"False"));
 BA.debugLineNum = 886;BA.debugLine="btnVerstgDelete.TextColor = 0xFF888888";
Debug.ShouldStop(2097152);
__ref.getField(false,"_btnverstgdelete" /*RemoteObject*/ ).runMethod(true,"setTextColor",BA.numberCast(int.class, ((int)0xff888888)));
 BA.debugLineNum = 887;BA.debugLine="btnAuswahl.Enabled = False";
Debug.ShouldStop(4194304);
__ref.getField(false,"_btnauswahl" /*RemoteObject*/ ).runMethod(true,"setEnabled",parent.__c.getField(true,"False"));
 BA.debugLineNum = 888;BA.debugLine="btnAuswahl.TextColor = 0xFF888888";
Debug.ShouldStop(8388608);
__ref.getField(false,"_btnauswahl" /*RemoteObject*/ ).runMethod(true,"setTextColor",BA.numberCast(int.class, ((int)0xff888888)));
 if (true) break;

case 25:
//C
this.state = 26;
;
 if (true) break;

case 26:
//C
this.state = 27;
;
 if (true) break;

case 27:
//C
this.state = -1;
;
 BA.debugLineNum = 892;BA.debugLine="startTimer";
Debug.ShouldStop(134217728);
__ref.runClassMethod (b4a.example.settings.class, "_starttimer" /*RemoteObject*/ );
 BA.debugLineNum = 893;BA.debugLine="End Sub";
Debug.ShouldStop(268435456);
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
public static void  _dateset_event(RemoteObject __ref,RemoteObject _methodname,RemoteObject _args) throws Exception{
}
public static RemoteObject  _enabletln(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("enableTLN (settings) ","settings",3,__ref.getField(false, "ba"),__ref,427);
if (RapidSub.canDelegate("enabletln")) { return __ref.runUserSub(false, "settings","enabletln", __ref);}
 BA.debugLineNum = 427;BA.debugLine="Private Sub enableTLN";
Debug.ShouldStop(1024);
 BA.debugLineNum = 428;BA.debugLine="btnTLNDelete.Enabled = True";
Debug.ShouldStop(2048);
__ref.getField(false,"_btntlndelete" /*RemoteObject*/ ).runMethod(true,"setEnabled",settings.__c.getField(true,"True"));
 BA.debugLineNum = 429;BA.debugLine="btnTLNSpeichern.Enabled = False";
Debug.ShouldStop(4096);
__ref.getField(false,"_btntlnspeichern" /*RemoteObject*/ ).runMethod(true,"setEnabled",settings.__c.getField(true,"False"));
 BA.debugLineNum = 430;BA.debugLine="tbxTeilnehmer.Enabled = True";
Debug.ShouldStop(8192);
__ref.getField(false,"_tbxteilnehmer" /*RemoteObject*/ ).runMethod(true,"setEnabled",settings.__c.getField(true,"True"));
 BA.debugLineNum = 431;BA.debugLine="btnTLNDelete.TextColor = colorgreen";
Debug.ShouldStop(16384);
__ref.getField(false,"_btntlndelete" /*RemoteObject*/ ).runMethod(true,"setTextColor",__ref.getField(true,"_colorgreen" /*RemoteObject*/ ));
 BA.debugLineNum = 432;BA.debugLine="btnTLNSpeichern.TextColor = 0xFF888888";
Debug.ShouldStop(32768);
__ref.getField(false,"_btntlnspeichern" /*RemoteObject*/ ).runMethod(true,"setTextColor",BA.numberCast(int.class, ((int)0xff888888)));
 BA.debugLineNum = 433;BA.debugLine="End Sub";
Debug.ShouldStop(65536);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _enablevstng(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("enableVSTNG (settings) ","settings",3,__ref.getField(false, "ba"),__ref,406);
if (RapidSub.canDelegate("enablevstng")) { return __ref.runUserSub(false, "settings","enablevstng", __ref);}
 BA.debugLineNum = 406;BA.debugLine="Private Sub enableVSTNG";
Debug.ShouldStop(2097152);
 BA.debugLineNum = 407;BA.debugLine="dprDatum.Enabled = True";
Debug.ShouldStop(4194304);
__ref.getField(false,"_dprdatum" /*RemoteObject*/ ).runMethod(true,"setEnabled",settings.__c.getField(true,"True"));
 BA.debugLineNum = 408;BA.debugLine="dprDatum.TextColor = colorgreen";
Debug.ShouldStop(8388608);
__ref.getField(false,"_dprdatum" /*RemoteObject*/ ).runMethod(true,"setTextColor",__ref.getField(true,"_colorgreen" /*RemoteObject*/ ));
 BA.debugLineNum = 409;BA.debugLine="btnVerstgDelete.Enabled = True";
Debug.ShouldStop(16777216);
__ref.getField(false,"_btnverstgdelete" /*RemoteObject*/ ).runMethod(true,"setEnabled",settings.__c.getField(true,"True"));
 BA.debugLineNum = 410;BA.debugLine="btnVerstgDelete.TextColor = colorgreen";
Debug.ShouldStop(33554432);
__ref.getField(false,"_btnverstgdelete" /*RemoteObject*/ ).runMethod(true,"setTextColor",__ref.getField(true,"_colorgreen" /*RemoteObject*/ ));
 BA.debugLineNum = 411;BA.debugLine="btnVerstgSpeichern.Enabled = False";
Debug.ShouldStop(67108864);
__ref.getField(false,"_btnverstgspeichern" /*RemoteObject*/ ).runMethod(true,"setEnabled",settings.__c.getField(true,"False"));
 BA.debugLineNum = 412;BA.debugLine="btnVerstgSpeichern.TextColor = 0xFF888888";
Debug.ShouldStop(134217728);
__ref.getField(false,"_btnverstgspeichern" /*RemoteObject*/ ).runMethod(true,"setTextColor",BA.numberCast(int.class, ((int)0xff888888)));
 BA.debugLineNum = 413;BA.debugLine="tbxVeranstaltung.Enabled = True";
Debug.ShouldStop(268435456);
__ref.getField(false,"_tbxveranstaltung" /*RemoteObject*/ ).runMethod(true,"setEnabled",settings.__c.getField(true,"True"));
 BA.debugLineNum = 414;BA.debugLine="tbxAnzahl.Enabled = True";
Debug.ShouldStop(536870912);
__ref.getField(false,"_tbxanzahl" /*RemoteObject*/ ).runMethod(true,"setEnabled",settings.__c.getField(true,"True"));
 BA.debugLineNum = 415;BA.debugLine="btnAuswahl.Enabled = False";
Debug.ShouldStop(1073741824);
__ref.getField(false,"_btnauswahl" /*RemoteObject*/ ).runMethod(true,"setEnabled",settings.__c.getField(true,"False"));
 BA.debugLineNum = 416;BA.debugLine="btnAuswahl.TextColor = 0xFF888888";
Debug.ShouldStop(-2147483648);
__ref.getField(false,"_btnauswahl" /*RemoteObject*/ ).runMethod(true,"setTextColor",BA.numberCast(int.class, ((int)0xff888888)));
 BA.debugLineNum = 417;BA.debugLine="End Sub";
Debug.ShouldStop(1);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static void  _executehttp(RemoteObject __ref,RemoteObject _method,RemoteObject _url,RemoteObject _payload) throws Exception{
try {
		Debug.PushSubsStack("ExecuteHttp (settings) ","settings",3,__ref.getField(false, "ba"),__ref,733);
if (RapidSub.canDelegate("executehttp")) { __ref.runUserSub(false, "settings","executehttp", __ref, _method, _url, _payload); return;}
ResumableSub_ExecuteHttp rsub = new ResumableSub_ExecuteHttp(null,__ref,_method,_url,_payload);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_ExecuteHttp extends BA.ResumableSub {
public ResumableSub_ExecuteHttp(b4a.example.settings parent,RemoteObject __ref,RemoteObject _method,RemoteObject _url,RemoteObject _payload) {
this.parent = parent;
this.__ref = __ref;
this._method = _method;
this._url = _url;
this._payload = _payload;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4a.example.settings parent;
RemoteObject _method;
RemoteObject _url;
RemoteObject _payload;
RemoteObject _typ = RemoteObject.createImmutable("");
RemoteObject _j;

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("ExecuteHttp (settings) ","settings",3,__ref.getField(false, "ba"),__ref,733);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
;
Debug.locals.put("method", _method);
Debug.locals.put("url", _url);
Debug.locals.put("payload", _payload);
 BA.debugLineNum = 734;BA.debugLine="Dim typ As String = DBdatenTyp";
Debug.ShouldStop(536870912);
_typ = __ref.getField(true,"_dbdatentyp" /*RemoteObject*/ );Debug.locals.put("typ", _typ);Debug.locals.put("typ", _typ);
 BA.debugLineNum = 735;BA.debugLine="Dim j As HttpJob";
Debug.ShouldStop(1073741824);
_j = RemoteObject.createNew ("b4a.example.httpjob");Debug.locals.put("j", _j);
 BA.debugLineNum = 736;BA.debugLine="j.Initialize(typ, Me)";
Debug.ShouldStop(-2147483648);
_j.runClassMethod (b4a.example.httpjob.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(_typ),(Object)(__ref));
 BA.debugLineNum = 738;BA.debugLine="Select method";
Debug.ShouldStop(2);
if (true) break;

case 1:
//select
this.state = 8;
switch (BA.switchObjectToInt(_method,BA.ObjectToString("GET"),BA.ObjectToString("PUT"),BA.ObjectToString("DELETE"))) {
case 0: {
this.state = 3;
if (true) break;
}
case 1: {
this.state = 5;
if (true) break;
}
case 2: {
this.state = 7;
if (true) break;
}
}
if (true) break;

case 3:
//C
this.state = 8;
 BA.debugLineNum = 740;BA.debugLine="j.Download(url)";
Debug.ShouldStop(8);
_j.runClassMethod (b4a.example.httpjob.class, "_download" /*RemoteObject*/ ,(Object)(_url));
 if (true) break;

case 5:
//C
this.state = 8;
 BA.debugLineNum = 742;BA.debugLine="j.PutString(url, payload)";
Debug.ShouldStop(32);
_j.runClassMethod (b4a.example.httpjob.class, "_putstring" /*RemoteObject*/ ,(Object)(_url),(Object)(_payload));
 BA.debugLineNum = 743;BA.debugLine="j.GetRequest.SetContentType(\"application/json\")";
Debug.ShouldStop(64);
_j.runClassMethod (b4a.example.httpjob.class, "_getrequest" /*RemoteObject*/ ).runVoidMethod ("SetContentType",(Object)(RemoteObject.createImmutable("application/json")));
 if (true) break;

case 7:
//C
this.state = 8;
 BA.debugLineNum = 745;BA.debugLine="j.Delete(url)";
Debug.ShouldStop(256);
_j.runClassMethod (b4a.example.httpjob.class, "_delete" /*RemoteObject*/ ,(Object)(_url));
 if (true) break;

case 8:
//C
this.state = 9;
;
 BA.debugLineNum = 748;BA.debugLine="Wait For (j) JobDone(j As HttpJob)";
Debug.ShouldStop(2048);
parent.__c.runVoidMethod ("WaitFor","jobdone", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "settings", "executehttp"), (_j));
this.state = 21;
return;
case 21:
//C
this.state = 9;
_j = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("j", _j);
;
 BA.debugLineNum = 750;BA.debugLine="If j.Success Then";
Debug.ShouldStop(8192);
if (true) break;

case 9:
//if
this.state = 20;
if (_j.getField(true,"_success" /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
this.state = 11;
}else {
this.state = 13;
}if (true) break;

case 11:
//C
this.state = 20;
 BA.debugLineNum = 751;BA.debugLine="HandleGotText(typ, url, j.GetString)";
Debug.ShouldStop(16384);
__ref.runClassMethod (b4a.example.settings.class, "_handlegottext" /*RemoteObject*/ ,(Object)(_typ),(Object)(_url),(Object)(_j.runClassMethod (b4a.example.httpjob.class, "_getstring" /*RemoteObject*/ )));
 if (true) break;

case 13:
//C
this.state = 14;
 BA.debugLineNum = 753;BA.debugLine="If j.ErrorMessage.ToLowerCase.Contains(\"unable t";
Debug.ShouldStop(65536);
if (true) break;

case 14:
//if
this.state = 19;
if (RemoteObject.solveBoolean(".",_j.getField(true,"_errormessage" /*RemoteObject*/ ).runMethod(true,"toLowerCase").runMethod(true,"contains",(Object)(RemoteObject.createImmutable("unable to resolve")))) || RemoteObject.solveBoolean(".",_j.getField(true,"_errormessage" /*RemoteObject*/ ).runMethod(true,"toLowerCase").runMethod(true,"contains",(Object)(RemoteObject.createImmutable("connect")))) || RemoteObject.solveBoolean(".",_j.getField(true,"_errormessage" /*RemoteObject*/ ).runMethod(true,"toLowerCase").runMethod(true,"contains",(Object)(RemoteObject.createImmutable("timeout"))))) { 
this.state = 16;
}else {
this.state = 18;
}if (true) break;

case 16:
//C
this.state = 19;
 BA.debugLineNum = 754;BA.debugLine="setzeOffline";
Debug.ShouldStop(131072);
__ref.runClassMethod (b4a.example.settings.class, "_setzeoffline" /*void*/ );
 if (true) break;

case 18:
//C
this.state = 19;
 BA.debugLineNum = 756;BA.debugLine="ToastMessageShow(\"Fehler: \" & j.ErrorMessage, T";
Debug.ShouldStop(524288);
parent.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence(RemoteObject.concat(RemoteObject.createImmutable("Fehler: "),_j.getField(true,"_errormessage" /*RemoteObject*/ )))),(Object)(parent.__c.getField(true,"True")));
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
 BA.debugLineNum = 759;BA.debugLine="j.Release";
Debug.ShouldStop(4194304);
_j.runClassMethod (b4a.example.httpjob.class, "_release" /*RemoteObject*/ );
 BA.debugLineNum = 760;BA.debugLine="startTimer";
Debug.ShouldStop(8388608);
__ref.runClassMethod (b4a.example.settings.class, "_starttimer" /*RemoteObject*/ );
 BA.debugLineNum = 761;BA.debugLine="End Sub";
Debug.ShouldStop(16777216);
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
public static RemoteObject  _formatdatecustom(RemoteObject __ref,RemoteObject _ticks,RemoteObject _pattern) throws Exception{
try {
		Debug.PushSubsStack("FormatDateCustom (settings) ","settings",3,__ref.getField(false, "ba"),__ref,1076);
if (RapidSub.canDelegate("formatdatecustom")) { return __ref.runUserSub(false, "settings","formatdatecustom", __ref, _ticks, _pattern);}
RemoteObject _oldformat = RemoteObject.createImmutable("");
RemoteObject _res = RemoteObject.createImmutable("");
Debug.locals.put("ticks", _ticks);
Debug.locals.put("pattern", _pattern);
 BA.debugLineNum = 1076;BA.debugLine="Private Sub FormatDateCustom(ticks As Long, patter";
Debug.ShouldStop(524288);
 BA.debugLineNum = 1077;BA.debugLine="Dim oldFormat As String = DateTime.DateFormat";
Debug.ShouldStop(1048576);
_oldformat = settings.__c.getField(false,"DateTime").runMethod(true,"getDateFormat");Debug.locals.put("oldformat", _oldformat);Debug.locals.put("oldFormat", _oldformat);
 BA.debugLineNum = 1078;BA.debugLine="DateTime.DateFormat = pattern";
Debug.ShouldStop(2097152);
settings.__c.getField(false,"DateTime").runMethod(true,"setDateFormat",_pattern);
 BA.debugLineNum = 1079;BA.debugLine="Dim res As String = DateTime.Date(ticks)";
Debug.ShouldStop(4194304);
_res = settings.__c.getField(false,"DateTime").runMethod(true,"Date",(Object)(_ticks));Debug.locals.put("res", _res);Debug.locals.put("res", _res);
 BA.debugLineNum = 1080;BA.debugLine="DateTime.DateFormat = oldFormat";
Debug.ShouldStop(8388608);
settings.__c.getField(false,"DateTime").runMethod(true,"setDateFormat",_oldformat);
 BA.debugLineNum = 1081;BA.debugLine="Return res";
Debug.ShouldStop(16777216);
if (true) return _res;
 BA.debugLineNum = 1082;BA.debugLine="End Sub";
Debug.ShouldStop(33554432);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _handlegottext(RemoteObject __ref,RemoteObject _typ,RemoteObject _requrl,RemoteObject _responsecontent) throws Exception{
try {
		Debug.PushSubsStack("HandleGotText (settings) ","settings",3,__ref.getField(false, "ba"),__ref,763);
if (RapidSub.canDelegate("handlegottext")) { return __ref.runUserSub(false, "settings","handlegottext", __ref, _typ, _requrl, _responsecontent);}
RemoteObject _jp = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.JSONParser");
Debug.locals.put("typ", _typ);
Debug.locals.put("reqUrl", _requrl);
Debug.locals.put("responseContent", _responsecontent);
 BA.debugLineNum = 763;BA.debugLine="Private Sub HandleGotText(typ As String, reqUrl As";
Debug.ShouldStop(67108864);
 BA.debugLineNum = 764;BA.debugLine="Dim jp As JSONParser";
Debug.ShouldStop(134217728);
_jp = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.JSONParser");Debug.locals.put("jp", _jp);
 BA.debugLineNum = 766;BA.debugLine="Select typ";
Debug.ShouldStop(536870912);
switch (BA.switchObjectToInt(_typ,BA.ObjectToString("Teilnehmer"),BA.ObjectToString("Veranstaltungen"),BA.ObjectToString("addVSTNG"),BA.ObjectToString("addTLN"),BA.ObjectToString("delTeilnehmer"),BA.ObjectToString("delVeranstaltung"),BA.ObjectToString("delErgebnis"))) {
case 0: {
 BA.debugLineNum = 768;BA.debugLine="DBdatenTyp = \"\"";
Debug.ShouldStop(-2147483648);
__ref.setField ("_dbdatentyp" /*RemoteObject*/ ,BA.ObjectToString(""));
 BA.debugLineNum = 769;BA.debugLine="ladeTeilnehmer(responseContent)";
Debug.ShouldStop(1);
__ref.runClassMethod (b4a.example.settings.class, "_ladeteilnehmer" /*RemoteObject*/ ,(Object)(_responsecontent));
 break; }
case 1: {
 BA.debugLineNum = 772;BA.debugLine="If responseContent = \"null\" Or responseContent";
Debug.ShouldStop(8);
if (RemoteObject.solveBoolean("=",_responsecontent,BA.ObjectToString("null")) || RemoteObject.solveBoolean("=",_responsecontent,BA.ObjectToString(""))) { 
 BA.debugLineNum = 773;BA.debugLine="Veranstaltungen.Initialize";
Debug.ShouldStop(16);
__ref.getField(false,"_veranstaltungen" /*RemoteObject*/ ).runVoidMethod ("Initialize");
 }else {
 BA.debugLineNum = 775;BA.debugLine="jp.Initialize(responseContent)";
Debug.ShouldStop(64);
_jp.runVoidMethod ("Initialize",(Object)(_responsecontent));
 BA.debugLineNum = 776;BA.debugLine="Veranstaltungen = jp.NextObject";
Debug.ShouldStop(128);
__ref.setField ("_veranstaltungen" /*RemoteObject*/ ,_jp.runMethod(false,"NextObject"));
 };
 BA.debugLineNum = 778;BA.debugLine="pruefeDBVerein";
Debug.ShouldStop(512);
__ref.runClassMethod (b4a.example.settings.class, "_pruefedbverein" /*RemoteObject*/ );
 BA.debugLineNum = 779;BA.debugLine="ZeigeVeranstaltungenCLV";
Debug.ShouldStop(1024);
__ref.runClassMethod (b4a.example.settings.class, "_zeigeveranstaltungenclv" /*RemoteObject*/ );
 BA.debugLineNum = 780;BA.debugLine="DBdatenTyp = \"\"";
Debug.ShouldStop(2048);
__ref.setField ("_dbdatentyp" /*RemoteObject*/ ,BA.ObjectToString(""));
 BA.debugLineNum = 781;BA.debugLine="holeTLN";
Debug.ShouldStop(4096);
__ref.runClassMethod (b4a.example.settings.class, "_holetln" /*RemoteObject*/ );
 break; }
case 2: {
 BA.debugLineNum = 784;BA.debugLine="DBdatenTyp = \"\"";
Debug.ShouldStop(32768);
__ref.setField ("_dbdatentyp" /*RemoteObject*/ ,BA.ObjectToString(""));
 BA.debugLineNum = 785;BA.debugLine="holeVeranstaltungen";
Debug.ShouldStop(65536);
__ref.runClassMethod (b4a.example.settings.class, "_holeveranstaltungen" /*RemoteObject*/ );
 break; }
case 3: {
 BA.debugLineNum = 788;BA.debugLine="DBdatenTyp = \"\"";
Debug.ShouldStop(524288);
__ref.setField ("_dbdatentyp" /*RemoteObject*/ ,BA.ObjectToString(""));
 BA.debugLineNum = 789;BA.debugLine="holeTLN";
Debug.ShouldStop(1048576);
__ref.runClassMethod (b4a.example.settings.class, "_holetln" /*RemoteObject*/ );
 break; }
case 4: {
 BA.debugLineNum = 792;BA.debugLine="DBdatenTyp = \"\"";
Debug.ShouldStop(8388608);
__ref.setField ("_dbdatentyp" /*RemoteObject*/ ,BA.ObjectToString(""));
 BA.debugLineNum = 793;BA.debugLine="TLNid = \"t0\"";
Debug.ShouldStop(16777216);
__ref.setField ("_tlnid" /*RemoteObject*/ ,BA.ObjectToString("t0"));
 BA.debugLineNum = 794;BA.debugLine="holeTLN";
Debug.ShouldStop(33554432);
__ref.runClassMethod (b4a.example.settings.class, "_holetln" /*RemoteObject*/ );
 break; }
case 5: {
 BA.debugLineNum = 797;BA.debugLine="DBdatenTyp = \"\"";
Debug.ShouldStop(268435456);
__ref.setField ("_dbdatentyp" /*RemoteObject*/ ,BA.ObjectToString(""));
 BA.debugLineNum = 798;BA.debugLine="If webviewVSTGN_ID = DBGet(\"VeranstaltungID\", \"";
Debug.ShouldStop(536870912);
if (RemoteObject.solveBoolean("=",__ref.getField(true,"_webviewvstgn_id" /*RemoteObject*/ ),BA.ObjectToString(__ref.runClassMethod (b4a.example.settings.class, "_dbget" /*RemoteObject*/ ,(Object)(BA.ObjectToString("VeranstaltungID")),(Object)((RemoteObject.createImmutable("v0"))))))) { 
 BA.debugLineNum = 799;BA.debugLine="Veranstaltung_ID = \"v0\"";
Debug.ShouldStop(1073741824);
__ref.setField ("_veranstaltung_id" /*RemoteObject*/ ,BA.ObjectToString("v0"));
 BA.debugLineNum = 800;BA.debugLine="webviewVSTGN_ID = \"v0\"";
Debug.ShouldStop(-2147483648);
__ref.setField ("_webviewvstgn_id" /*RemoteObject*/ ,BA.ObjectToString("v0"));
 BA.debugLineNum = 801;BA.debugLine="DBPut(\"VeranstaltungID\", \"v0\")";
Debug.ShouldStop(1);
__ref.runClassMethod (b4a.example.settings.class, "_dbput" /*RemoteObject*/ ,(Object)(BA.ObjectToString("VeranstaltungID")),(Object)((RemoteObject.createImmutable("v0"))));
 };
 BA.debugLineNum = 803;BA.debugLine="holeVeranstaltungen";
Debug.ShouldStop(4);
__ref.runClassMethod (b4a.example.settings.class, "_holeveranstaltungen" /*RemoteObject*/ );
 break; }
case 6: {
 BA.debugLineNum = 806;BA.debugLine="DBdatenTyp = \"\"";
Debug.ShouldStop(32);
__ref.setField ("_dbdatentyp" /*RemoteObject*/ ,BA.ObjectToString(""));
 BA.debugLineNum = 807;BA.debugLine="delVeranstaltung(webviewVSTGN_ID)";
Debug.ShouldStop(64);
__ref.runClassMethod (b4a.example.settings.class, "_delveranstaltung" /*RemoteObject*/ ,(Object)(__ref.getField(true,"_webviewvstgn_id" /*RemoteObject*/ )));
 break; }
default: {
 BA.debugLineNum = 810;BA.debugLine="MsgboxAsync(\"(\" & DBdatenTyp & \")\" & reqUrl, \"D";
Debug.ShouldStop(512);
settings.__c.runVoidMethod ("MsgboxAsync",(Object)(BA.ObjectToCharSequence(RemoteObject.concat(RemoteObject.createImmutable("("),__ref.getField(true,"_dbdatentyp" /*RemoteObject*/ ),RemoteObject.createImmutable(")"),_requrl))),(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("Da stimmt etwas nicht!"))),__ref.getField(false, "ba"));
 break; }
}
;
 BA.debugLineNum = 812;BA.debugLine="End Sub";
Debug.ShouldStop(2048);
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
		Debug.PushSubsStack("HideKeyboard (settings) ","settings",3,__ref.getField(false, "ba"),__ref,1084);
if (RapidSub.canDelegate("hidekeyboard")) { return __ref.runUserSub(false, "settings","hidekeyboard", __ref);}
RemoteObject _p = RemoteObject.declareNull("anywheresoftware.b4a.phone.Phone");
 BA.debugLineNum = 1084;BA.debugLine="Private Sub HideKeyboard";
Debug.ShouldStop(134217728);
 BA.debugLineNum = 1085;BA.debugLine="Dim p As Phone";
Debug.ShouldStop(268435456);
_p = RemoteObject.createNew ("anywheresoftware.b4a.phone.Phone");Debug.locals.put("p", _p);
 BA.debugLineNum = 1086;BA.debugLine="p.HideKeyboard(B4XPages.GetNativeParent(Me))";
Debug.ShouldStop(536870912);
_p.runVoidMethod ("HideKeyboard",(Object)(settings._b4xpages.runMethod(false,"_getnativeparent" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(__ref))));
 BA.debugLineNum = 1087;BA.debugLine="End Sub";
Debug.ShouldStop(1073741824);
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
		Debug.PushSubsStack("holeTLN (settings) ","settings",3,__ref.getField(false, "ba"),__ref,642);
if (RapidSub.canDelegate("holetln")) { return __ref.runUserSub(false, "settings","holetln", __ref);}
 BA.debugLineNum = 642;BA.debugLine="Private Sub holeTLN";
Debug.ShouldStop(2);
 BA.debugLineNum = 643;BA.debugLine="DBdatenTyp = \"Teilnehmer\"";
Debug.ShouldStop(4);
__ref.setField ("_dbdatentyp" /*RemoteObject*/ ,BA.ObjectToString("Teilnehmer"));
 BA.debugLineNum = 644;BA.debugLine="CurrentWebUrl = URLteilnehmer & \".json?auth=\" & S";
Debug.ShouldStop(8);
__ref.setField ("_currentweburl" /*RemoteObject*/ ,RemoteObject.concat(__ref.getField(true,"_urlteilnehmer" /*RemoteObject*/ ),RemoteObject.createImmutable(".json?auth="),__ref.getField(false,"_status" /*RemoteObject*/ ).runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("idToken"))),(Object)((RemoteObject.createImmutable(""))))));
 BA.debugLineNum = 645;BA.debugLine="ExecuteHttp(\"GET\", CurrentWebUrl, \"\")";
Debug.ShouldStop(16);
__ref.runClassMethod (b4a.example.settings.class, "_executehttp" /*void*/ ,(Object)(BA.ObjectToString("GET")),(Object)(__ref.getField(true,"_currentweburl" /*RemoteObject*/ )),(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 646;BA.debugLine="End Sub";
Debug.ShouldStop(32);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _holeveranstaltungen(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("holeVeranstaltungen (settings) ","settings",3,__ref.getField(false, "ba"),__ref,451);
if (RapidSub.canDelegate("holeveranstaltungen")) { return __ref.runUserSub(false, "settings","holeveranstaltungen", __ref);}
 BA.debugLineNum = 451;BA.debugLine="Private Sub holeVeranstaltungen";
Debug.ShouldStop(4);
 BA.debugLineNum = 452;BA.debugLine="DBdatenTyp = \"Veranstaltungen\"";
Debug.ShouldStop(8);
__ref.setField ("_dbdatentyp" /*RemoteObject*/ ,BA.ObjectToString("Veranstaltungen"));
 BA.debugLineNum = 453;BA.debugLine="CurrentWebUrl = URLveranstaltungen & \".json?auth=";
Debug.ShouldStop(16);
__ref.setField ("_currentweburl" /*RemoteObject*/ ,RemoteObject.concat(__ref.getField(true,"_urlveranstaltungen" /*RemoteObject*/ ),RemoteObject.createImmutable(".json?auth="),__ref.getField(false,"_status" /*RemoteObject*/ ).runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("idToken"))),(Object)((RemoteObject.createImmutable(""))))));
 BA.debugLineNum = 454;BA.debugLine="ExecuteHttp(\"GET\", CurrentWebUrl, \"\")";
Debug.ShouldStop(32);
__ref.runClassMethod (b4a.example.settings.class, "_executehttp" /*void*/ ,(Object)(BA.ObjectToString("GET")),(Object)(__ref.getField(true,"_currentweburl" /*RemoteObject*/ )),(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 455;BA.debugLine="End Sub";
Debug.ShouldStop(64);
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
		Debug.PushSubsStack("Initialize (settings) ","settings",3,__ref.getField(false, "ba"),__ref,58);
if (RapidSub.canDelegate("initialize")) { return __ref.runUserSub(false, "settings","initialize", __ref, _ba);}
__ref.runVoidMethodAndSync("innerInitializeHelper", _ba);
;
 BA.debugLineNum = 58;BA.debugLine="Public Sub Initialize";
Debug.ShouldStop(33554432);
 BA.debugLineNum = 59;BA.debugLine="Status.Initialize";
Debug.ShouldStop(67108864);
__ref.getField(false,"_status" /*RemoteObject*/ ).runVoidMethod ("Initialize");
 BA.debugLineNum = 60;BA.debugLine="Veranstaltungen.Initialize";
Debug.ShouldStop(134217728);
__ref.getField(false,"_veranstaltungen" /*RemoteObject*/ ).runVoidMethod ("Initialize");
 BA.debugLineNum = 61;BA.debugLine="Teilnehmer.Initialize";
Debug.ShouldStop(268435456);
__ref.getField(false,"_teilnehmer" /*RemoteObject*/ ).runVoidMethod ("Initialize");
 BA.debugLineNum = 63;BA.debugLine="LoadTinyDB";
Debug.ShouldStop(1073741824);
__ref.runClassMethod (b4a.example.settings.class, "_loadtinydb" /*RemoteObject*/ );
 BA.debugLineNum = 65;BA.debugLine="Uhrzeit.Initialize(\"Uhrzeit\", 300000)";
Debug.ShouldStop(1);
__ref.getField(false,"_uhrzeit" /*RemoteObject*/ ).runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(BA.ObjectToString("Uhrzeit")),(Object)(BA.numberCast(long.class, 300000)));
 BA.debugLineNum = 67;BA.debugLine="dprYear = DateTime.GetYear(DateTime.Now)";
Debug.ShouldStop(4);
__ref.setField ("_dpryear" /*RemoteObject*/ ,settings.__c.getField(false,"DateTime").runMethod(true,"GetYear",(Object)(settings.__c.getField(false,"DateTime").runMethod(true,"getNow"))));
 BA.debugLineNum = 68;BA.debugLine="dprMonth = DateTime.GetMonth(DateTime.Now)";
Debug.ShouldStop(8);
__ref.setField ("_dprmonth" /*RemoteObject*/ ,settings.__c.getField(false,"DateTime").runMethod(true,"GetMonth",(Object)(settings.__c.getField(false,"DateTime").runMethod(true,"getNow"))));
 BA.debugLineNum = 69;BA.debugLine="dprDay = DateTime.GetDayOfMonth(DateTime.Now)";
Debug.ShouldStop(16);
__ref.setField ("_dprday" /*RemoteObject*/ ,settings.__c.getField(false,"DateTime").runMethod(true,"GetDayOfMonth",(Object)(settings.__c.getField(false,"DateTime").runMethod(true,"getNow"))));
 BA.debugLineNum = 70;BA.debugLine="End Sub";
Debug.ShouldStop(32);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _ladeteilnehmer(RemoteObject __ref,RemoteObject _response) throws Exception{
try {
		Debug.PushSubsStack("ladeTeilnehmer (settings) ","settings",3,__ref.getField(false, "ba"),__ref,648);
if (RapidSub.canDelegate("ladeteilnehmer")) { return __ref.runUserSub(false, "settings","ladeteilnehmer", __ref, _response);}
RemoteObject _jp = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.JSONParser");
RemoteObject _teilnehmerliste = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _key = RemoteObject.createImmutable("");
RemoteObject _newid = RemoteObject.createImmutable(0);
RemoteObject _curmax = RemoteObject.createImmutable(0);
RemoteObject _tmap = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
Debug.locals.put("response", _response);
 BA.debugLineNum = 648;BA.debugLine="Private Sub ladeTeilnehmer(response As String)";
Debug.ShouldStop(128);
 BA.debugLineNum = 649;BA.debugLine="Teilnehmer.Initialize";
Debug.ShouldStop(256);
__ref.getField(false,"_teilnehmer" /*RemoteObject*/ ).runVoidMethod ("Initialize");
 BA.debugLineNum = 650;BA.debugLine="If response <> \"\" And response <> \"null\" Then";
Debug.ShouldStop(512);
if (RemoteObject.solveBoolean("!",_response,BA.ObjectToString("")) && RemoteObject.solveBoolean("!",_response,BA.ObjectToString("null"))) { 
 BA.debugLineNum = 651;BA.debugLine="Dim jp As JSONParser";
Debug.ShouldStop(1024);
_jp = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.JSONParser");Debug.locals.put("jp", _jp);
 BA.debugLineNum = 652;BA.debugLine="jp.Initialize(response)";
Debug.ShouldStop(2048);
_jp.runVoidMethod ("Initialize",(Object)(_response));
 BA.debugLineNum = 653;BA.debugLine="Dim teilnehmerliste As Map = jp.NextObject";
Debug.ShouldStop(4096);
_teilnehmerliste = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_teilnehmerliste = _jp.runMethod(false,"NextObject");Debug.locals.put("teilnehmerliste", _teilnehmerliste);Debug.locals.put("teilnehmerliste", _teilnehmerliste);
 BA.debugLineNum = 655;BA.debugLine="For Each key As String In teilnehmerliste.Keys";
Debug.ShouldStop(16384);
{
final RemoteObject group6 = _teilnehmerliste.runMethod(false,"Keys");
final int groupLen6 = group6.runMethod(true,"getSize").<Integer>get()
;int index6 = 0;
;
for (; index6 < groupLen6;index6++){
_key = BA.ObjectToString(group6.runMethod(false,"Get",index6));Debug.locals.put("key", _key);
Debug.locals.put("key", _key);
 BA.debugLineNum = 656;BA.debugLine="Dim newID As Int = key.Replace(\"t\", \"\") + 1";
Debug.ShouldStop(32768);
_newid = BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {BA.numberCast(double.class, _key.runMethod(true,"replace",(Object)(BA.ObjectToString("t")),(Object)(RemoteObject.createImmutable("")))),RemoteObject.createImmutable(1)}, "+",1, 0));Debug.locals.put("newid", _newid);Debug.locals.put("newID", _newid);
 BA.debugLineNum = 657;BA.debugLine="Dim curMax As Int = TLNnewID.Replace(\"t\", \"\")";
Debug.ShouldStop(65536);
_curmax = BA.numberCast(int.class, __ref.getField(true,"_tlnnewid" /*RemoteObject*/ ).runMethod(true,"replace",(Object)(BA.ObjectToString("t")),(Object)(RemoteObject.createImmutable(""))));Debug.locals.put("curmax", _curmax);Debug.locals.put("curMax", _curmax);
 BA.debugLineNum = 658;BA.debugLine="If newID > curMax Then";
Debug.ShouldStop(131072);
if (RemoteObject.solveBoolean(">",_newid,BA.numberCast(double.class, _curmax))) { 
 BA.debugLineNum = 659;BA.debugLine="TLNnewID = \"t\" & newID";
Debug.ShouldStop(262144);
__ref.setField ("_tlnnewid" /*RemoteObject*/ ,RemoteObject.concat(RemoteObject.createImmutable("t"),_newid));
 };
 BA.debugLineNum = 661;BA.debugLine="Dim tMap As Map = teilnehmerliste.Get(key)";
Debug.ShouldStop(1048576);
_tmap = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_tmap = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), _teilnehmerliste.runMethod(false,"Get",(Object)((_key))));Debug.locals.put("tmap", _tmap);Debug.locals.put("tMap", _tmap);
 BA.debugLineNum = 662;BA.debugLine="Teilnehmer.AddAll(Array As Object(tMap.GetDefau";
Debug.ShouldStop(2097152);
__ref.getField(false,"_teilnehmer" /*RemoteObject*/ ).runVoidMethod ("AddAll",(Object)(settings.__c.runMethod(false, "ArrayToList", (Object)(RemoteObject.createNewArray("Object",new int[] {2},new Object[] {_tmap.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("Name"))),(Object)((RemoteObject.createImmutable("unbenannt")))),(_key)})))));
 }
}Debug.locals.put("key", _key);
;
 BA.debugLineNum = 664;BA.debugLine="Teilnehmer.Add(TLNid)";
Debug.ShouldStop(8388608);
__ref.getField(false,"_teilnehmer" /*RemoteObject*/ ).runVoidMethod ("Add",(Object)((__ref.getField(true,"_tlnid" /*RemoteObject*/ ))));
 };
 BA.debugLineNum = 666;BA.debugLine="ZeigeTeilnehmerCLV";
Debug.ShouldStop(33554432);
__ref.runClassMethod (b4a.example.settings.class, "_zeigeteilnehmerclv" /*RemoteObject*/ );
 BA.debugLineNum = 667;BA.debugLine="End Sub";
Debug.ShouldStop(67108864);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _ladeveranstaltungen(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("ladeVeranstaltungen (settings) ","settings",3,__ref.getField(false, "ba"),__ref,457);
if (RapidSub.canDelegate("ladeveranstaltungen")) { return __ref.runUserSub(false, "settings","ladeveranstaltungen", __ref);}
RemoteObject _key = RemoteObject.createImmutable("");
RemoteObject _newid = RemoteObject.createImmutable(0);
RemoteObject _curmax = RemoteObject.createImmutable(0);
RemoteObject _ergebnis = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
 BA.debugLineNum = 457;BA.debugLine="Private Sub ladeVeranstaltungen";
Debug.ShouldStop(256);
 BA.debugLineNum = 458;BA.debugLine="dprDatum.Enabled = True";
Debug.ShouldStop(512);
__ref.getField(false,"_dprdatum" /*RemoteObject*/ ).runMethod(true,"setEnabled",settings.__c.getField(true,"True"));
 BA.debugLineNum = 459;BA.debugLine="dprDatum.TextColor = colorgreen";
Debug.ShouldStop(1024);
__ref.getField(false,"_dprdatum" /*RemoteObject*/ ).runMethod(true,"setTextColor",__ref.getField(true,"_colorgreen" /*RemoteObject*/ ));
 BA.debugLineNum = 460;BA.debugLine="dprDatum.Text = FormatDateCustom(DateTime.Now, \"d";
Debug.ShouldStop(2048);
__ref.getField(false,"_dprdatum" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToCharSequence(__ref.runClassMethod (b4a.example.settings.class, "_formatdatecustom" /*RemoteObject*/ ,(Object)(settings.__c.getField(false,"DateTime").runMethod(true,"getNow")),(Object)(RemoteObject.createImmutable("dd.MM.yyyy")))));
 BA.debugLineNum = 461;BA.debugLine="dprYear = DateTime.GetYear(DateTime.Now)";
Debug.ShouldStop(4096);
__ref.setField ("_dpryear" /*RemoteObject*/ ,settings.__c.getField(false,"DateTime").runMethod(true,"GetYear",(Object)(settings.__c.getField(false,"DateTime").runMethod(true,"getNow"))));
 BA.debugLineNum = 462;BA.debugLine="dprMonth = DateTime.GetMonth(DateTime.Now)";
Debug.ShouldStop(8192);
__ref.setField ("_dprmonth" /*RemoteObject*/ ,settings.__c.getField(false,"DateTime").runMethod(true,"GetMonth",(Object)(settings.__c.getField(false,"DateTime").runMethod(true,"getNow"))));
 BA.debugLineNum = 463;BA.debugLine="dprDay = DateTime.GetDayOfMonth(DateTime.Now)";
Debug.ShouldStop(16384);
__ref.setField ("_dprday" /*RemoteObject*/ ,settings.__c.getField(false,"DateTime").runMethod(true,"GetDayOfMonth",(Object)(settings.__c.getField(false,"DateTime").runMethod(true,"getNow"))));
 BA.debugLineNum = 465;BA.debugLine="webviewVSTGN.Initialize";
Debug.ShouldStop(65536);
__ref.getField(false,"_webviewvstgn" /*RemoteObject*/ ).runVoidMethod ("Initialize");
 BA.debugLineNum = 466;BA.debugLine="webviewVSTGN.AddAll(Array As Object(\"Datum\", \"Nam";
Debug.ShouldStop(131072);
__ref.getField(false,"_webviewvstgn" /*RemoteObject*/ ).runVoidMethod ("AddAll",(Object)(settings.__c.runMethod(false, "ArrayToList", (Object)(RemoteObject.createNewArray("Object",new int[] {3},new Object[] {RemoteObject.createImmutable(("Datum")),RemoteObject.createImmutable(("Name")),(RemoteObject.createImmutable("vid"))})))));
 BA.debugLineNum = 468;BA.debugLine="If Not(Veranstaltungen.IsInitialized) Or Veransta";
Debug.ShouldStop(524288);
if (RemoteObject.solveBoolean(".",settings.__c.runMethod(true,"Not",(Object)(__ref.getField(false,"_veranstaltungen" /*RemoteObject*/ ).runMethod(true,"IsInitialized")))) || RemoteObject.solveBoolean("=",__ref.getField(false,"_veranstaltungen" /*RemoteObject*/ ).runMethod(true,"getSize"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 469;BA.debugLine="Veranstaltung_ID = \"v0\"";
Debug.ShouldStop(1048576);
__ref.setField ("_veranstaltung_id" /*RemoteObject*/ ,BA.ObjectToString("v0"));
 BA.debugLineNum = 470;BA.debugLine="webviewVSTGN_ID = \"v0\"";
Debug.ShouldStop(2097152);
__ref.setField ("_webviewvstgn_id" /*RemoteObject*/ ,BA.ObjectToString("v0"));
 BA.debugLineNum = 471;BA.debugLine="VSTGNnewID = \"v1\"";
Debug.ShouldStop(4194304);
__ref.setField ("_vstgnnewid" /*RemoteObject*/ ,BA.ObjectToString("v1"));
 BA.debugLineNum = 472;BA.debugLine="webviewVSTGN.AddAll(Array As Object(\"Veranstaltu";
Debug.ShouldStop(8388608);
__ref.getField(false,"_webviewvstgn" /*RemoteObject*/ ).runVoidMethod ("AddAll",(Object)(settings.__c.runMethod(false, "ArrayToList", (Object)(RemoteObject.createNewArray("Object",new int[] {2},new Object[] {RemoteObject.createImmutable(("Veranstaltungs_ID")),(RemoteObject.createImmutable("v0"))})))));
 BA.debugLineNum = 473;BA.debugLine="setzeVeranstaltung(\"v0\")";
Debug.ShouldStop(16777216);
__ref.runClassMethod (b4a.example.settings.class, "_setzeveranstaltung" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("v0")));
 }else {
 BA.debugLineNum = 475;BA.debugLine="For Each key As String In Veranstaltungen.Keys";
Debug.ShouldStop(67108864);
{
final RemoteObject group16 = __ref.getField(false,"_veranstaltungen" /*RemoteObject*/ ).runMethod(false,"Keys");
final int groupLen16 = group16.runMethod(true,"getSize").<Integer>get()
;int index16 = 0;
;
for (; index16 < groupLen16;index16++){
_key = BA.ObjectToString(group16.runMethod(false,"Get",index16));Debug.locals.put("key", _key);
Debug.locals.put("key", _key);
 BA.debugLineNum = 476;BA.debugLine="Dim newID As Int = key.Replace(\"v\", \"\") + 1";
Debug.ShouldStop(134217728);
_newid = BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {BA.numberCast(double.class, _key.runMethod(true,"replace",(Object)(BA.ObjectToString("v")),(Object)(RemoteObject.createImmutable("")))),RemoteObject.createImmutable(1)}, "+",1, 0));Debug.locals.put("newid", _newid);Debug.locals.put("newID", _newid);
 BA.debugLineNum = 477;BA.debugLine="Dim curMax As Int = VSTGNnewID.Replace(\"v\", \"\")";
Debug.ShouldStop(268435456);
_curmax = BA.numberCast(int.class, __ref.getField(true,"_vstgnnewid" /*RemoteObject*/ ).runMethod(true,"replace",(Object)(BA.ObjectToString("v")),(Object)(RemoteObject.createImmutable(""))));Debug.locals.put("curmax", _curmax);Debug.locals.put("curMax", _curmax);
 BA.debugLineNum = 478;BA.debugLine="If newID > curMax Then";
Debug.ShouldStop(536870912);
if (RemoteObject.solveBoolean(">",_newid,BA.numberCast(double.class, _curmax))) { 
 BA.debugLineNum = 479;BA.debugLine="VSTGNnewID = \"v\" & newID";
Debug.ShouldStop(1073741824);
__ref.setField ("_vstgnnewid" /*RemoteObject*/ ,RemoteObject.concat(RemoteObject.createImmutable("v"),_newid));
 };
 BA.debugLineNum = 481;BA.debugLine="Dim ergebnis As Map = Veranstaltungen.Get(key)";
Debug.ShouldStop(1);
_ergebnis = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_ergebnis = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), __ref.getField(false,"_veranstaltungen" /*RemoteObject*/ ).runMethod(false,"Get",(Object)((_key))));Debug.locals.put("ergebnis", _ergebnis);Debug.locals.put("ergebnis", _ergebnis);
 BA.debugLineNum = 482;BA.debugLine="webviewVSTGN.AddAll(Array As Object( _ 				erge";
Debug.ShouldStop(2);
__ref.getField(false,"_webviewvstgn" /*RemoteObject*/ ).runVoidMethod ("AddAll",(Object)(settings.__c.runMethod(false, "ArrayToList", (Object)(RemoteObject.createNewArray("Object",new int[] {3},new Object[] {_ergebnis.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("Datum"))),(Object)((__ref.runClassMethod (b4a.example.settings.class, "_formatdatecustom" /*RemoteObject*/ ,(Object)(settings.__c.getField(false,"DateTime").runMethod(true,"getNow")),(Object)(RemoteObject.createImmutable("dd.MM.yyyy")))))),_ergebnis.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("Name"))),(Object)((RemoteObject.createImmutable("- n.n. -")))),(_key)})))));
 }
}Debug.locals.put("key", _key);
;
 BA.debugLineNum = 487;BA.debugLine="webviewVSTGN.AddAll(Array As Object(\"Veranstaltu";
Debug.ShouldStop(64);
__ref.getField(false,"_webviewvstgn" /*RemoteObject*/ ).runVoidMethod ("AddAll",(Object)(settings.__c.runMethod(false, "ArrayToList", (Object)(RemoteObject.createNewArray("Object",new int[] {2},new Object[] {RemoteObject.createImmutable(("Veranstaltungs_ID")),(__ref.getField(true,"_webviewvstgn_id" /*RemoteObject*/ ))})))));
 };
 BA.debugLineNum = 489;BA.debugLine="End Sub";
Debug.ShouldStop(256);
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
		Debug.PushSubsStack("LoadTinyDB (settings) ","settings",3,__ref.getField(false, "ba"),__ref,1089);
if (RapidSub.canDelegate("loadtinydb")) { return __ref.runUserSub(false, "settings","loadtinydb", __ref);}
 BA.debugLineNum = 1089;BA.debugLine="Private Sub LoadTinyDB";
Debug.ShouldStop(1);
 BA.debugLineNum = 1090;BA.debugLine="If File.Exists(File.DirInternal, DBFileName) Then";
Debug.ShouldStop(2);
if (settings.__c.getField(false,"File").runMethod(true,"Exists",(Object)(settings.__c.getField(false,"File").runMethod(true,"getDirInternal")),(Object)(__ref.getField(true,"_dbfilename" /*RemoteObject*/ ))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 1091;BA.debugLine="DBVerein = File.ReadMap(File.DirInternal, DBFile";
Debug.ShouldStop(4);
__ref.setField ("_dbverein" /*RemoteObject*/ ,settings.__c.getField(false,"File").runMethod(false,"ReadMap",(Object)(settings.__c.getField(false,"File").runMethod(true,"getDirInternal")),(Object)(__ref.getField(true,"_dbfilename" /*RemoteObject*/ ))));
 }else {
 BA.debugLineNum = 1093;BA.debugLine="DBVerein.Initialize";
Debug.ShouldStop(16);
__ref.getField(false,"_dbverein" /*RemoteObject*/ ).runVoidMethod ("Initialize");
 };
 BA.debugLineNum = 1095;BA.debugLine="End Sub";
Debug.ShouldStop(64);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _lstveranstaltungen_itemclick(RemoteObject __ref,RemoteObject _position,RemoteObject _value) throws Exception{
try {
		Debug.PushSubsStack("lstVeranstaltungen_ItemClick (settings) ","settings",3,__ref.getField(false, "ba"),__ref,1172);
if (RapidSub.canDelegate("lstveranstaltungen_itemclick")) { return __ref.runUserSub(false, "settings","lstveranstaltungen_itemclick", __ref, _position, _value);}
Debug.locals.put("Position", _position);
Debug.locals.put("Value", _value);
 BA.debugLineNum = 1172;BA.debugLine="Private Sub lstVeranstaltungen_ItemClick (Position";
Debug.ShouldStop(524288);
 BA.debugLineNum = 1174;BA.debugLine="webviewVSTGN_ID = Value";
Debug.ShouldStop(2097152);
__ref.setField ("_webviewvstgn_id" /*RemoteObject*/ ,BA.ObjectToString(_value));
 BA.debugLineNum = 1176;BA.debugLine="setzeVeranstaltung(webviewVSTGN_ID)";
Debug.ShouldStop(8388608);
__ref.runClassMethod (b4a.example.settings.class, "_setzeveranstaltung" /*RemoteObject*/ ,(Object)(__ref.getField(true,"_webviewvstgn_id" /*RemoteObject*/ )));
 BA.debugLineNum = 1178;BA.debugLine="End Sub";
Debug.ShouldStop(33554432);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _pruefedbverein(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("pruefeDBVerein (settings) ","settings",3,__ref.getField(false, "ba"),__ref,534);
if (RapidSub.canDelegate("pruefedbverein")) { return __ref.runUserSub(false, "settings","pruefedbverein", __ref);}
RemoteObject _vstngexists = RemoteObject.createImmutable(false);
RemoteObject _savedid = RemoteObject.createImmutable("");
RemoteObject _key = RemoteObject.createImmutable("");
 BA.debugLineNum = 534;BA.debugLine="Private Sub pruefeDBVerein";
Debug.ShouldStop(2097152);
 BA.debugLineNum = 535;BA.debugLine="Dim VSTNGexists As Boolean = False";
Debug.ShouldStop(4194304);
_vstngexists = settings.__c.getField(true,"False");Debug.locals.put("vstngexists", _vstngexists);Debug.locals.put("VSTNGexists", _vstngexists);
 BA.debugLineNum = 536;BA.debugLine="Dim savedID As String = DBGet(\"VeranstaltungID\",";
Debug.ShouldStop(8388608);
_savedid = BA.ObjectToString(__ref.runClassMethod (b4a.example.settings.class, "_dbget" /*RemoteObject*/ ,(Object)(BA.ObjectToString("VeranstaltungID")),(Object)((RemoteObject.createImmutable("v0")))));Debug.locals.put("savedid", _savedid);Debug.locals.put("savedID", _savedid);
 BA.debugLineNum = 538;BA.debugLine="If Veranstaltungen.IsInitialized And Veranstaltun";
Debug.ShouldStop(33554432);
if (RemoteObject.solveBoolean(".",__ref.getField(false,"_veranstaltungen" /*RemoteObject*/ ).runMethod(true,"IsInitialized")) && RemoteObject.solveBoolean(">",__ref.getField(false,"_veranstaltungen" /*RemoteObject*/ ).runMethod(true,"getSize"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 539;BA.debugLine="For Each key As String In Veranstaltungen.Keys";
Debug.ShouldStop(67108864);
{
final RemoteObject group4 = __ref.getField(false,"_veranstaltungen" /*RemoteObject*/ ).runMethod(false,"Keys");
final int groupLen4 = group4.runMethod(true,"getSize").<Integer>get()
;int index4 = 0;
;
for (; index4 < groupLen4;index4++){
_key = BA.ObjectToString(group4.runMethod(false,"Get",index4));Debug.locals.put("key", _key);
Debug.locals.put("key", _key);
 BA.debugLineNum = 540;BA.debugLine="webviewVSTGN_ID = key";
Debug.ShouldStop(134217728);
__ref.setField ("_webviewvstgn_id" /*RemoteObject*/ ,_key);
 BA.debugLineNum = 541;BA.debugLine="If key = savedID Then";
Debug.ShouldStop(268435456);
if (RemoteObject.solveBoolean("=",_key,_savedid)) { 
 BA.debugLineNum = 542;BA.debugLine="VSTNGexists = True";
Debug.ShouldStop(536870912);
_vstngexists = settings.__c.getField(true,"True");Debug.locals.put("VSTNGexists", _vstngexists);
 BA.debugLineNum = 543;BA.debugLine="Exit";
Debug.ShouldStop(1073741824);
if (true) break;
 };
 }
}Debug.locals.put("key", _key);
;
 };
 BA.debugLineNum = 548;BA.debugLine="If Not(VSTNGexists) Then";
Debug.ShouldStop(8);
if (settings.__c.runMethod(true,"Not",(Object)(_vstngexists)).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 549;BA.debugLine="lblVeranstaltung.Text = \"- noch nicht ausgewählt";
Debug.ShouldStop(16);
__ref.getField(false,"_lblveranstaltung" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToCharSequence("- noch nicht ausgewählt -"));
 BA.debugLineNum = 550;BA.debugLine="lblDatum.Text = \"- bitte auswählen -\"";
Debug.ShouldStop(32);
__ref.getField(false,"_lbldatum" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToCharSequence("- bitte auswählen -"));
 BA.debugLineNum = 551;BA.debugLine="Veranstaltung_ID = \"v0\"";
Debug.ShouldStop(64);
__ref.setField ("_veranstaltung_id" /*RemoteObject*/ ,BA.ObjectToString("v0"));
 BA.debugLineNum = 552;BA.debugLine="VSTGNnewID = \"v1\"";
Debug.ShouldStop(128);
__ref.setField ("_vstgnnewid" /*RemoteObject*/ ,BA.ObjectToString("v1"));
 BA.debugLineNum = 553;BA.debugLine="DBPut(\"VeranstaltungID\", \"v0\")";
Debug.ShouldStop(256);
__ref.runClassMethod (b4a.example.settings.class, "_dbput" /*RemoteObject*/ ,(Object)(BA.ObjectToString("VeranstaltungID")),(Object)((RemoteObject.createImmutable("v0"))));
 };
 BA.debugLineNum = 555;BA.debugLine="End Sub";
Debug.ShouldStop(1024);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _pruefeinhalt(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("pruefeInhalt (settings) ","settings",3,__ref.getField(false, "ba"),__ref,622);
if (RapidSub.canDelegate("pruefeinhalt")) { return __ref.runUserSub(false, "settings","pruefeinhalt", __ref);}
RemoteObject _anz = RemoteObject.createImmutable(0);
 BA.debugLineNum = 622;BA.debugLine="Private Sub pruefeInhalt";
Debug.ShouldStop(8192);
 BA.debugLineNum = 623;BA.debugLine="btnVerstgSpeichern.Enabled = False";
Debug.ShouldStop(16384);
__ref.getField(false,"_btnverstgspeichern" /*RemoteObject*/ ).runMethod(true,"setEnabled",settings.__c.getField(true,"False"));
 BA.debugLineNum = 624;BA.debugLine="btnVerstgSpeichern.TextColor = 0xFF888888";
Debug.ShouldStop(32768);
__ref.getField(false,"_btnverstgspeichern" /*RemoteObject*/ ).runMethod(true,"setTextColor",BA.numberCast(int.class, ((int)0xff888888)));
 BA.debugLineNum = 625;BA.debugLine="btnAuswahl.Enabled = False";
Debug.ShouldStop(65536);
__ref.getField(false,"_btnauswahl" /*RemoteObject*/ ).runMethod(true,"setEnabled",settings.__c.getField(true,"False"));
 BA.debugLineNum = 626;BA.debugLine="btnAuswahl.TextColor = 0xFF888888";
Debug.ShouldStop(131072);
__ref.getField(false,"_btnauswahl" /*RemoteObject*/ ).runMethod(true,"setTextColor",BA.numberCast(int.class, ((int)0xff888888)));
 BA.debugLineNum = 628;BA.debugLine="If tbxVeranstaltung.Text.Trim <> \"\" Then";
Debug.ShouldStop(524288);
if (RemoteObject.solveBoolean("!",__ref.getField(false,"_tbxveranstaltung" /*RemoteObject*/ ).runMethod(true,"getText").runMethod(true,"trim"),BA.ObjectToString(""))) { 
 BA.debugLineNum = 629;BA.debugLine="If IsNumber(tbxAnzahl.Text) Then";
Debug.ShouldStop(1048576);
if (settings.__c.runMethod(true,"IsNumber",(Object)(__ref.getField(false,"_tbxanzahl" /*RemoteObject*/ ).runMethod(true,"getText"))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 630;BA.debugLine="Dim anz As Int = tbxAnzahl.Text";
Debug.ShouldStop(2097152);
_anz = BA.numberCast(int.class, __ref.getField(false,"_tbxanzahl" /*RemoteObject*/ ).runMethod(true,"getText"));Debug.locals.put("anz", _anz);Debug.locals.put("anz", _anz);
 BA.debugLineNum = 631;BA.debugLine="If anz > 0 Then";
Debug.ShouldStop(4194304);
if (RemoteObject.solveBoolean(">",_anz,BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 632;BA.debugLine="btnVerstgSpeichern.Enabled = True";
Debug.ShouldStop(8388608);
__ref.getField(false,"_btnverstgspeichern" /*RemoteObject*/ ).runMethod(true,"setEnabled",settings.__c.getField(true,"True"));
 BA.debugLineNum = 633;BA.debugLine="btnVerstgSpeichern.TextColor = colorgreen";
Debug.ShouldStop(16777216);
__ref.getField(false,"_btnverstgspeichern" /*RemoteObject*/ ).runMethod(true,"setTextColor",__ref.getField(true,"_colorgreen" /*RemoteObject*/ ));
 };
 };
 };
 BA.debugLineNum = 637;BA.debugLine="End Sub";
Debug.ShouldStop(268435456);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _savedbvstng(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("saveDBvstng (settings) ","settings",3,__ref.getField(false, "ba"),__ref,584);
if (RapidSub.canDelegate("savedbvstng")) { return __ref.runUserSub(false, "settings","savedbvstng", __ref);}
 BA.debugLineNum = 584;BA.debugLine="Private Sub saveDBvstng";
Debug.ShouldStop(128);
 BA.debugLineNum = 585;BA.debugLine="lblVeranstaltung.Text = tbxVeranstaltung.Text";
Debug.ShouldStop(256);
__ref.getField(false,"_lblveranstaltung" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToCharSequence(__ref.getField(false,"_tbxveranstaltung" /*RemoteObject*/ ).runMethod(true,"getText")));
 BA.debugLineNum = 586;BA.debugLine="lblDatum.Text = dprDatum.Text";
Debug.ShouldStop(512);
__ref.getField(false,"_lbldatum" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToCharSequence(__ref.getField(false,"_dprdatum" /*RemoteObject*/ ).runMethod(true,"getText")));
 BA.debugLineNum = 587;BA.debugLine="DBPut(\"VeranstaltungID\", Veranstaltung_ID)";
Debug.ShouldStop(1024);
__ref.runClassMethod (b4a.example.settings.class, "_dbput" /*RemoteObject*/ ,(Object)(BA.ObjectToString("VeranstaltungID")),(Object)((__ref.getField(true,"_veranstaltung_id" /*RemoteObject*/ ))));
 BA.debugLineNum = 588;BA.debugLine="DBPut(\"VeranstaltungName\", tbxVeranstaltung.Text)";
Debug.ShouldStop(2048);
__ref.runClassMethod (b4a.example.settings.class, "_dbput" /*RemoteObject*/ ,(Object)(BA.ObjectToString("VeranstaltungName")),(Object)((__ref.getField(false,"_tbxveranstaltung" /*RemoteObject*/ ).runMethod(true,"getText"))));
 BA.debugLineNum = 589;BA.debugLine="DBPut(\"VeranstaltungDatum\", dprDatum.Text)";
Debug.ShouldStop(4096);
__ref.runClassMethod (b4a.example.settings.class, "_dbput" /*RemoteObject*/ ,(Object)(BA.ObjectToString("VeranstaltungDatum")),(Object)((__ref.getField(false,"_dprdatum" /*RemoteObject*/ ).runMethod(true,"getText"))));
 BA.debugLineNum = 590;BA.debugLine="DBPut(\"VeranstaltungAnzahl\", tbxAnzahl.Text)";
Debug.ShouldStop(8192);
__ref.runClassMethod (b4a.example.settings.class, "_dbput" /*RemoteObject*/ ,(Object)(BA.ObjectToString("VeranstaltungAnzahl")),(Object)((__ref.getField(false,"_tbxanzahl" /*RemoteObject*/ ).runMethod(true,"getText"))));
 BA.debugLineNum = 591;BA.debugLine="End Sub";
Debug.ShouldStop(16384);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _savetln(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("saveTLN (settings) ","settings",3,__ref.getField(false, "ba"),__ref,694);
if (RapidSub.canDelegate("savetln")) { return __ref.runUserSub(false, "settings","savetln", __ref);}
RemoteObject _dbkey = RemoteObject.createImmutable("");
RemoteObject _tname = RemoteObject.createImmutable("");
RemoteObject _addtlnmap = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _jg = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.JSONParser.JSONGenerator");
 BA.debugLineNum = 694;BA.debugLine="Private Sub saveTLN";
Debug.ShouldStop(2097152);
 BA.debugLineNum = 695;BA.debugLine="disableTLN";
Debug.ShouldStop(4194304);
__ref.runClassMethod (b4a.example.settings.class, "_disabletln" /*RemoteObject*/ );
 BA.debugLineNum = 696;BA.debugLine="Dim DBkey As String = TLNid";
Debug.ShouldStop(8388608);
_dbkey = __ref.getField(true,"_tlnid" /*RemoteObject*/ );Debug.locals.put("dbkey", _dbkey);Debug.locals.put("DBkey", _dbkey);
 BA.debugLineNum = 697;BA.debugLine="If TLNid = \"t0\" Then";
Debug.ShouldStop(16777216);
if (RemoteObject.solveBoolean("=",__ref.getField(true,"_tlnid" /*RemoteObject*/ ),BA.ObjectToString("t0"))) { 
 BA.debugLineNum = 698;BA.debugLine="DBkey = TLNnewID";
Debug.ShouldStop(33554432);
_dbkey = __ref.getField(true,"_tlnnewid" /*RemoteObject*/ );Debug.locals.put("DBkey", _dbkey);
 };
 BA.debugLineNum = 701;BA.debugLine="Dim tName As String = tbxTeilnehmer.Text.Trim";
Debug.ShouldStop(268435456);
_tname = __ref.getField(false,"_tbxteilnehmer" /*RemoteObject*/ ).runMethod(true,"getText").runMethod(true,"trim");Debug.locals.put("tname", _tname);Debug.locals.put("tName", _tname);
 BA.debugLineNum = 702;BA.debugLine="If Teilnehmer.IndexOf(tName) >= 0 Then";
Debug.ShouldStop(536870912);
if (RemoteObject.solveBoolean("g",__ref.getField(false,"_teilnehmer" /*RemoteObject*/ ).runMethod(true,"IndexOf",(Object)((_tname))),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 703;BA.debugLine="MsgboxAsync(\"Der Teilnehmer \" & tName & \" ist be";
Debug.ShouldStop(1073741824);
settings.__c.runVoidMethod ("MsgboxAsync",(Object)(BA.ObjectToCharSequence(RemoteObject.concat(RemoteObject.createImmutable("Der Teilnehmer "),_tname,RemoteObject.createImmutable(" ist bereits in der Teilnehmerliste vorhanden und kann nicht erneut angelegt werden. Zum Ändern bitte Teilnehmer auswählen und die Änderung speichern.")))),(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("Speichern nicht möglich!"))),__ref.getField(false, "ba"));
 }else {
 BA.debugLineNum = 705;BA.debugLine="Dim addTLNMap As Map = CreateMap(\"Name\": tName)";
Debug.ShouldStop(1);
_addtlnmap = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_addtlnmap = settings.__c.runMethod(false, "createMap", (Object)(new RemoteObject[] {RemoteObject.createImmutable(("Name")),(_tname)}));Debug.locals.put("addtlnmap", _addtlnmap);Debug.locals.put("addTLNMap", _addtlnmap);
 BA.debugLineNum = 706;BA.debugLine="CurrentWebUrl = URLteilnehmer & \"/\" & DBkey & \".";
Debug.ShouldStop(2);
__ref.setField ("_currentweburl" /*RemoteObject*/ ,RemoteObject.concat(__ref.getField(true,"_urlteilnehmer" /*RemoteObject*/ ),RemoteObject.createImmutable("/"),_dbkey,RemoteObject.createImmutable(".json?auth="),__ref.getField(false,"_status" /*RemoteObject*/ ).runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("idToken"))),(Object)((RemoteObject.createImmutable(""))))));
 BA.debugLineNum = 707;BA.debugLine="DBdatenTyp = \"addTLN\"";
Debug.ShouldStop(4);
__ref.setField ("_dbdatentyp" /*RemoteObject*/ ,BA.ObjectToString("addTLN"));
 BA.debugLineNum = 709;BA.debugLine="Dim jg As JSONGenerator";
Debug.ShouldStop(16);
_jg = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.JSONParser.JSONGenerator");Debug.locals.put("jg", _jg);
 BA.debugLineNum = 710;BA.debugLine="jg.Initialize(addTLNMap)";
Debug.ShouldStop(32);
_jg.runVoidMethod ("Initialize",(Object)(_addtlnmap));
 BA.debugLineNum = 711;BA.debugLine="ExecuteHttp(\"PUT\", CurrentWebUrl, jg.ToString)";
Debug.ShouldStop(64);
__ref.runClassMethod (b4a.example.settings.class, "_executehttp" /*void*/ ,(Object)(BA.ObjectToString("PUT")),(Object)(__ref.getField(true,"_currentweburl" /*RemoteObject*/ )),(Object)(_jg.runMethod(true,"ToString")));
 };
 BA.debugLineNum = 713;BA.debugLine="enableTLN";
Debug.ShouldStop(256);
__ref.runClassMethod (b4a.example.settings.class, "_enabletln" /*RemoteObject*/ );
 BA.debugLineNum = 714;BA.debugLine="End Sub";
Debug.ShouldStop(512);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _savevstng(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("saveVSTNG (settings) ","settings",3,__ref.getField(false, "ba"),__ref,557);
if (RapidSub.canDelegate("savevstng")) { return __ref.runUserSub(false, "settings","savevstng", __ref);}
RemoteObject _dbkey = RemoteObject.createImmutable("");
RemoteObject _body = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _jg = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.JSONParser.JSONGenerator");
 BA.debugLineNum = 557;BA.debugLine="Private Sub saveVSTNG";
Debug.ShouldStop(4096);
 BA.debugLineNum = 558;BA.debugLine="disableVSTNG";
Debug.ShouldStop(8192);
__ref.runClassMethod (b4a.example.settings.class, "_disablevstng" /*RemoteObject*/ );
 BA.debugLineNum = 559;BA.debugLine="Dim DBkey As String = webviewVSTGN_ID";
Debug.ShouldStop(16384);
_dbkey = __ref.getField(true,"_webviewvstgn_id" /*RemoteObject*/ );Debug.locals.put("dbkey", _dbkey);Debug.locals.put("DBkey", _dbkey);
 BA.debugLineNum = 560;BA.debugLine="If DBkey = \"v0\" Then";
Debug.ShouldStop(32768);
if (RemoteObject.solveBoolean("=",_dbkey,BA.ObjectToString("v0"))) { 
 BA.debugLineNum = 561;BA.debugLine="DBkey = VSTGNnewID";
Debug.ShouldStop(65536);
_dbkey = __ref.getField(true,"_vstgnnewid" /*RemoteObject*/ );Debug.locals.put("DBkey", _dbkey);
 BA.debugLineNum = 562;BA.debugLine="webviewVSTGN_ID = VSTGNnewID";
Debug.ShouldStop(131072);
__ref.setField ("_webviewvstgn_id" /*RemoteObject*/ ,__ref.getField(true,"_vstgnnewid" /*RemoteObject*/ ));
 };
 BA.debugLineNum = 565;BA.debugLine="Dim body As Map = CreateMap( _ 		\"Datum\": dprDatu";
Debug.ShouldStop(1048576);
_body = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_body = settings.__c.runMethod(false, "createMap", (Object)(new RemoteObject[] {RemoteObject.createImmutable(("Datum")),(__ref.getField(false,"_dprdatum" /*RemoteObject*/ ).runMethod(true,"getText")),RemoteObject.createImmutable(("Name")),(__ref.getField(false,"_tbxveranstaltung" /*RemoteObject*/ ).runMethod(true,"getText")),RemoteObject.createImmutable(("Teilnehmerzahl")),(__ref.getField(false,"_tbxanzahl" /*RemoteObject*/ ).runMethod(true,"getText")),RemoteObject.createImmutable(("Status")),(RemoteObject.createImmutable("offen"))}));Debug.locals.put("body", _body);Debug.locals.put("body", _body);
 BA.debugLineNum = 571;BA.debugLine="CurrentWebUrl = URLveranstaltungen & \"/\" & DBkey";
Debug.ShouldStop(67108864);
__ref.setField ("_currentweburl" /*RemoteObject*/ ,RemoteObject.concat(__ref.getField(true,"_urlveranstaltungen" /*RemoteObject*/ ),RemoteObject.createImmutable("/"),_dbkey,RemoteObject.createImmutable(".json?auth="),__ref.getField(false,"_status" /*RemoteObject*/ ).runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("idToken"))),(Object)((RemoteObject.createImmutable(""))))));
 BA.debugLineNum = 572;BA.debugLine="DBdatenTyp = \"addVSTNG\"";
Debug.ShouldStop(134217728);
__ref.setField ("_dbdatentyp" /*RemoteObject*/ ,BA.ObjectToString("addVSTNG"));
 BA.debugLineNum = 574;BA.debugLine="Dim jg As JSONGenerator";
Debug.ShouldStop(536870912);
_jg = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.JSONParser.JSONGenerator");Debug.locals.put("jg", _jg);
 BA.debugLineNum = 575;BA.debugLine="jg.Initialize(body)";
Debug.ShouldStop(1073741824);
_jg.runVoidMethod ("Initialize",(Object)(_body));
 BA.debugLineNum = 576;BA.debugLine="ExecuteHttp(\"PUT\", CurrentWebUrl, jg.ToString)";
Debug.ShouldStop(-2147483648);
__ref.runClassMethod (b4a.example.settings.class, "_executehttp" /*void*/ ,(Object)(BA.ObjectToString("PUT")),(Object)(__ref.getField(true,"_currentweburl" /*RemoteObject*/ )),(Object)(_jg.runMethod(true,"ToString")));
 BA.debugLineNum = 578;BA.debugLine="If Veranstaltung_ID = webviewVSTGN_ID Then";
Debug.ShouldStop(2);
if (RemoteObject.solveBoolean("=",__ref.getField(true,"_veranstaltung_id" /*RemoteObject*/ ),__ref.getField(true,"_webviewvstgn_id" /*RemoteObject*/ ))) { 
 BA.debugLineNum = 579;BA.debugLine="saveDBvstng";
Debug.ShouldStop(4);
__ref.runClassMethod (b4a.example.settings.class, "_savedbvstng" /*RemoteObject*/ );
 };
 BA.debugLineNum = 581;BA.debugLine="enableVSTNG";
Debug.ShouldStop(16);
__ref.runClassMethod (b4a.example.settings.class, "_enablevstng" /*RemoteObject*/ );
 BA.debugLineNum = 582;BA.debugLine="End Sub";
Debug.ShouldStop(32);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setzeheaderfromdb(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("setzeHeaderfromDB (settings) ","settings",3,__ref.getField(false, "ba"),__ref,435);
if (RapidSub.canDelegate("setzeheaderfromdb")) { return __ref.runUserSub(false, "settings","setzeheaderfromdb", __ref);}
 BA.debugLineNum = 435;BA.debugLine="Private Sub setzeHeaderfromDB";
Debug.ShouldStop(262144);
 BA.debugLineNum = 436;BA.debugLine="lblVerein.Text = DBGet(\"Bezeichnung\", \"- nicht ge";
Debug.ShouldStop(524288);
__ref.getField(false,"_lblverein" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToCharSequence(__ref.runClassMethod (b4a.example.settings.class, "_dbget" /*RemoteObject*/ ,(Object)(BA.ObjectToString("Bezeichnung")),(Object)((RemoteObject.createImmutable("- nicht gesetzt -"))))));
 BA.debugLineNum = 437;BA.debugLine="lblVeranstaltung.Text = DBGet(\"VeranstaltungName\"";
Debug.ShouldStop(1048576);
__ref.getField(false,"_lblveranstaltung" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToCharSequence(__ref.runClassMethod (b4a.example.settings.class, "_dbget" /*RemoteObject*/ ,(Object)(BA.ObjectToString("VeranstaltungName")),(Object)((RemoteObject.createImmutable("- nicht gesetzt -"))))));
 BA.debugLineNum = 438;BA.debugLine="lblDatum.Text = DBGet(\"VeranstaltungDatum\", \"- ni";
Debug.ShouldStop(2097152);
__ref.getField(false,"_lbldatum" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToCharSequence(__ref.runClassMethod (b4a.example.settings.class, "_dbget" /*RemoteObject*/ ,(Object)(BA.ObjectToString("VeranstaltungDatum")),(Object)((RemoteObject.createImmutable("- nicht gesetzt -"))))));
 BA.debugLineNum = 439;BA.debugLine="End Sub";
Debug.ShouldStop(4194304);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static void  _setzeoffline(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("setzeOffline (settings) ","settings",3,__ref.getField(false, "ba"),__ref,814);
if (RapidSub.canDelegate("setzeoffline")) { __ref.runUserSub(false, "settings","setzeoffline", __ref); return;}
ResumableSub_setzeOffline rsub = new ResumableSub_setzeOffline(null,__ref);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_setzeOffline extends BA.ResumableSub {
public ResumableSub_setzeOffline(b4a.example.settings parent,RemoteObject __ref) {
this.parent = parent;
this.__ref = __ref;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4a.example.settings parent;
RemoteObject _res;

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("setzeOffline (settings) ","settings",3,__ref.getField(false, "ba"),__ref,814);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
;
 BA.debugLineNum = 815;BA.debugLine="Status.Put(\"ProgOffline\", True)";
Debug.ShouldStop(16384);
__ref.getField(false,"_status" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("ProgOffline"))),(Object)((parent.__c.getField(true,"True"))));
 BA.debugLineNum = 816;BA.debugLine="Msgbox2Async(\"Die Datenbank ist nicht mehr erreic";
Debug.ShouldStop(32768);
parent.__c.runVoidMethod ("Msgbox2Async",(Object)(BA.ObjectToCharSequence("Die Datenbank ist nicht mehr erreichbar. Das Programm arbeitet nun offline. Es ist jetzt nur die zuletzt verwendete Wertungsliste verfügbar. Änderungen in den Einstellungen können nicht übernommen werden.")),(Object)(BA.ObjectToCharSequence("Internet-Verbindung nicht möglich!")),(Object)(BA.ObjectToString("Einstellungen schließen.")),(Object)(BA.ObjectToString("")),(Object)(BA.ObjectToString("")),RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper"), parent.__c.getField(false,"Null")),__ref.getField(false, "ba"),(Object)(parent.__c.getField(true,"False")));
 BA.debugLineNum = 817;BA.debugLine="Wait For Msgbox_Result (res As Int)";
Debug.ShouldStop(65536);
parent.__c.runVoidMethod ("WaitFor","msgbox_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "settings", "setzeoffline"), null);
this.state = 5;
return;
case 5:
//C
this.state = 1;
_res = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("res", _res);
;
 BA.debugLineNum = 818;BA.debugLine="If res = DialogResponse.POSITIVE Then";
Debug.ShouldStop(131072);
if (true) break;

case 1:
//if
this.state = 4;
if (RemoteObject.solveBoolean("=",_res,BA.numberCast(double.class, parent.__c.getField(false,"DialogResponse").getField(true,"POSITIVE")))) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
 BA.debugLineNum = 819;BA.debugLine="CloseSettings";
Debug.ShouldStop(262144);
__ref.runClassMethod (b4a.example.settings.class, "_closesettings" /*RemoteObject*/ );
 if (true) break;

case 4:
//C
this.state = -1;
;
 BA.debugLineNum = 821;BA.debugLine="End Sub";
Debug.ShouldStop(1048576);
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
public static RemoteObject  _setzeteilnehmer(RemoteObject __ref,RemoteObject _tid) throws Exception{
try {
		Debug.PushSubsStack("setzeTeilnehmer (settings) ","settings",3,__ref.getField(false, "ba"),__ref,669);
if (RapidSub.canDelegate("setzeteilnehmer")) { return __ref.runUserSub(false, "settings","setzeteilnehmer", __ref, _tid);}
RemoteObject _idx = RemoteObject.createImmutable(0);
Debug.locals.put("tid", _tid);
 BA.debugLineNum = 669;BA.debugLine="Private Sub setzeTeilnehmer(tid As String)";
Debug.ShouldStop(268435456);
 BA.debugLineNum = 670;BA.debugLine="disableTLN";
Debug.ShouldStop(536870912);
__ref.runClassMethod (b4a.example.settings.class, "_disabletln" /*RemoteObject*/ );
 BA.debugLineNum = 671;BA.debugLine="If tid = \"t0\" Then";
Debug.ShouldStop(1073741824);
if (RemoteObject.solveBoolean("=",_tid,BA.ObjectToString("t0"))) { 
 BA.debugLineNum = 672;BA.debugLine="dochange = False";
Debug.ShouldStop(-2147483648);
__ref.setField ("_dochange" /*RemoteObject*/ ,settings.__c.getField(true,"False"));
 BA.debugLineNum = 673;BA.debugLine="tbxTeilnehmer.Text = \"\"";
Debug.ShouldStop(1);
__ref.getField(false,"_tbxteilnehmer" /*RemoteObject*/ ).runMethodAndSync(true,"setText",BA.ObjectToCharSequence(""));
 BA.debugLineNum = 674;BA.debugLine="dochange = True";
Debug.ShouldStop(2);
__ref.setField ("_dochange" /*RemoteObject*/ ,settings.__c.getField(true,"True"));
 BA.debugLineNum = 675;BA.debugLine="enableTLN";
Debug.ShouldStop(4);
__ref.runClassMethod (b4a.example.settings.class, "_enabletln" /*RemoteObject*/ );
 BA.debugLineNum = 676;BA.debugLine="btnTLNDelete.TextColor = 0xFF888888";
Debug.ShouldStop(8);
__ref.getField(false,"_btntlndelete" /*RemoteObject*/ ).runMethod(true,"setTextColor",BA.numberCast(int.class, ((int)0xff888888)));
 BA.debugLineNum = 677;BA.debugLine="btnTLNDelete.Enabled = False";
Debug.ShouldStop(16);
__ref.getField(false,"_btntlndelete" /*RemoteObject*/ ).runMethod(true,"setEnabled",settings.__c.getField(true,"False"));
 }else {
 BA.debugLineNum = 679;BA.debugLine="If Teilnehmer.Size > 0 Then";
Debug.ShouldStop(64);
if (RemoteObject.solveBoolean(">",__ref.getField(false,"_teilnehmer" /*RemoteObject*/ ).runMethod(true,"getSize"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 680;BA.debugLine="Dim idx As Int = Teilnehmer.IndexOf(tid)";
Debug.ShouldStop(128);
_idx = __ref.getField(false,"_teilnehmer" /*RemoteObject*/ ).runMethod(true,"IndexOf",(Object)((_tid)));Debug.locals.put("idx", _idx);Debug.locals.put("idx", _idx);
 BA.debugLineNum = 681;BA.debugLine="If idx > 0 Then";
Debug.ShouldStop(256);
if (RemoteObject.solveBoolean(">",_idx,BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 682;BA.debugLine="dochange = False";
Debug.ShouldStop(512);
__ref.setField ("_dochange" /*RemoteObject*/ ,settings.__c.getField(true,"False"));
 BA.debugLineNum = 683;BA.debugLine="tbxTeilnehmer.Text = Teilnehmer.Get(idx - 1)";
Debug.ShouldStop(1024);
__ref.getField(false,"_tbxteilnehmer" /*RemoteObject*/ ).runMethodAndSync(true,"setText",BA.ObjectToCharSequence(__ref.getField(false,"_teilnehmer" /*RemoteObject*/ ).runMethod(false,"Get",(Object)(RemoteObject.solve(new RemoteObject[] {_idx,RemoteObject.createImmutable(1)}, "-",1, 1)))));
 BA.debugLineNum = 684;BA.debugLine="dochange = True";
Debug.ShouldStop(2048);
__ref.setField ("_dochange" /*RemoteObject*/ ,settings.__c.getField(true,"True"));
 BA.debugLineNum = 685;BA.debugLine="enableTLN";
Debug.ShouldStop(4096);
__ref.runClassMethod (b4a.example.settings.class, "_enabletln" /*RemoteObject*/ );
 };
 };
 };
 BA.debugLineNum = 689;BA.debugLine="If tbxTeilnehmer.Enabled Then";
Debug.ShouldStop(65536);
if (__ref.getField(false,"_tbxteilnehmer" /*RemoteObject*/ ).runMethod(true,"getEnabled").<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 690;BA.debugLine="tbxTeilnehmer.RequestFocus";
Debug.ShouldStop(131072);
__ref.getField(false,"_tbxteilnehmer" /*RemoteObject*/ ).runVoidMethod ("RequestFocus");
 };
 BA.debugLineNum = 692;BA.debugLine="End Sub";
Debug.ShouldStop(524288);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setzeveranstaltung(RemoteObject __ref,RemoteObject _vid) throws Exception{
try {
		Debug.PushSubsStack("setzeVeranstaltung (settings) ","settings",3,__ref.getField(false, "ba"),__ref,491);
if (RapidSub.canDelegate("setzeveranstaltung")) { return __ref.runUserSub(false, "settings","setzeveranstaltung", __ref, _vid);}
RemoteObject _veranstaltung = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _datum = RemoteObject.createImmutable("");
RemoteObject _datum_spl = null;
Debug.locals.put("vid", _vid);
 BA.debugLineNum = 491;BA.debugLine="Private Sub setzeVeranstaltung(vid As String)";
Debug.ShouldStop(1024);
 BA.debugLineNum = 492;BA.debugLine="disableVSTNG";
Debug.ShouldStop(2048);
__ref.runClassMethod (b4a.example.settings.class, "_disablevstng" /*RemoteObject*/ );
 BA.debugLineNum = 493;BA.debugLine="Dim veranstaltung As Map";
Debug.ShouldStop(4096);
_veranstaltung = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("veranstaltung", _veranstaltung);
 BA.debugLineNum = 494;BA.debugLine="If Veranstaltungen.IsInitialized And Veranstaltun";
Debug.ShouldStop(8192);
if (RemoteObject.solveBoolean(".",__ref.getField(false,"_veranstaltungen" /*RemoteObject*/ ).runMethod(true,"IsInitialized")) && RemoteObject.solveBoolean(".",__ref.getField(false,"_veranstaltungen" /*RemoteObject*/ ).runMethod(true,"ContainsKey",(Object)((_vid))))) { 
 BA.debugLineNum = 495;BA.debugLine="veranstaltung = Veranstaltungen.Get(vid)";
Debug.ShouldStop(16384);
_veranstaltung = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), __ref.getField(false,"_veranstaltungen" /*RemoteObject*/ ).runMethod(false,"Get",(Object)((_vid))));Debug.locals.put("veranstaltung", _veranstaltung);
 }else {
 BA.debugLineNum = 497;BA.debugLine="veranstaltung.Initialize";
Debug.ShouldStop(65536);
_veranstaltung.runVoidMethod ("Initialize");
 };
 BA.debugLineNum = 500;BA.debugLine="Dim datum As String = veranstaltung.GetDefault(\"D";
Debug.ShouldStop(524288);
_datum = BA.ObjectToString(_veranstaltung.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("Datum"))),(Object)((__ref.runClassMethod (b4a.example.settings.class, "_formatdatecustom" /*RemoteObject*/ ,(Object)(settings.__c.getField(false,"DateTime").runMethod(true,"getNow")),(Object)(RemoteObject.createImmutable("dd.MM.yyyy")))))));Debug.locals.put("datum", _datum);Debug.locals.put("datum", _datum);
 BA.debugLineNum = 501;BA.debugLine="Dim datum_spl() As String = Regex.Split(\"\\.\", dat";
Debug.ShouldStop(1048576);
_datum_spl = settings.__c.getField(false,"Regex").runMethod(false,"Split",(Object)(BA.ObjectToString("\\.")),(Object)(_datum));Debug.locals.put("datum_spl", _datum_spl);Debug.locals.put("datum_spl", _datum_spl);
 BA.debugLineNum = 502;BA.debugLine="If datum_spl.Length >= 3 Then";
Debug.ShouldStop(2097152);
if (RemoteObject.solveBoolean("g",_datum_spl.getField(true,"length"),BA.numberCast(double.class, 3))) { 
 BA.debugLineNum = 503;BA.debugLine="dprYear = datum_spl(2)";
Debug.ShouldStop(4194304);
__ref.setField ("_dpryear" /*RemoteObject*/ ,BA.numberCast(int.class, _datum_spl.getArrayElement(true,BA.numberCast(int.class, 2))));
 BA.debugLineNum = 504;BA.debugLine="dprMonth = datum_spl(1)";
Debug.ShouldStop(8388608);
__ref.setField ("_dprmonth" /*RemoteObject*/ ,BA.numberCast(int.class, _datum_spl.getArrayElement(true,BA.numberCast(int.class, 1))));
 BA.debugLineNum = 505;BA.debugLine="dprDay = datum_spl(0)";
Debug.ShouldStop(16777216);
__ref.setField ("_dprday" /*RemoteObject*/ ,BA.numberCast(int.class, _datum_spl.getArrayElement(true,BA.numberCast(int.class, 0))));
 };
 BA.debugLineNum = 508;BA.debugLine="dprDatum.Text = datum";
Debug.ShouldStop(134217728);
__ref.getField(false,"_dprdatum" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToCharSequence(_datum));
 BA.debugLineNum = 513;BA.debugLine="tbxAnzahl.Text = veranstaltung.GetDefault(\"Teilne";
Debug.ShouldStop(1);
__ref.getField(false,"_tbxanzahl" /*RemoteObject*/ ).runMethodAndSync(true,"setText",BA.ObjectToCharSequence(_veranstaltung.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("Teilnehmerzahl"))),(Object)((RemoteObject.createImmutable("0"))))));
 BA.debugLineNum = 515;BA.debugLine="If \"offen\" = veranstaltung.GetDefault(\"Status\", \"";
Debug.ShouldStop(4);
if (RemoteObject.solveBoolean("=",RemoteObject.createImmutable("offen"),BA.ObjectToString(_veranstaltung.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("Status"))),(Object)((RemoteObject.createImmutable("offen"))))))) { 
 BA.debugLineNum = 516;BA.debugLine="dprDatum.Enabled = True";
Debug.ShouldStop(8);
__ref.getField(false,"_dprdatum" /*RemoteObject*/ ).runMethod(true,"setEnabled",settings.__c.getField(true,"True"));
 BA.debugLineNum = 517;BA.debugLine="dprDatum.TextColor = colorgreen";
Debug.ShouldStop(16);
__ref.getField(false,"_dprdatum" /*RemoteObject*/ ).runMethod(true,"setTextColor",__ref.getField(true,"_colorgreen" /*RemoteObject*/ ));
 BA.debugLineNum = 518;BA.debugLine="tbxVeranstaltung.Enabled = True";
Debug.ShouldStop(32);
__ref.getField(false,"_tbxveranstaltung" /*RemoteObject*/ ).runMethod(true,"setEnabled",settings.__c.getField(true,"True"));
 BA.debugLineNum = 519;BA.debugLine="tbxAnzahl.Enabled = True";
Debug.ShouldStop(64);
__ref.getField(false,"_tbxanzahl" /*RemoteObject*/ ).runMethod(true,"setEnabled",settings.__c.getField(true,"True"));
 BA.debugLineNum = 520;BA.debugLine="lblClosed.Visible = False";
Debug.ShouldStop(128);
__ref.getField(false,"_lblclosed" /*RemoteObject*/ ).runMethod(true,"setVisible",settings.__c.getField(true,"False"));
 }else {
 BA.debugLineNum = 522;BA.debugLine="lblClosed.Visible = True";
Debug.ShouldStop(512);
__ref.getField(false,"_lblclosed" /*RemoteObject*/ ).runMethod(true,"setVisible",settings.__c.getField(true,"True"));
 };
 BA.debugLineNum = 525;BA.debugLine="btnVerstgDelete.Enabled = True";
Debug.ShouldStop(4096);
__ref.getField(false,"_btnverstgdelete" /*RemoteObject*/ ).runMethod(true,"setEnabled",settings.__c.getField(true,"True"));
 BA.debugLineNum = 526;BA.debugLine="btnVerstgDelete.TextColor = colorgreen";
Debug.ShouldStop(8192);
__ref.getField(false,"_btnverstgdelete" /*RemoteObject*/ ).runMethod(true,"setTextColor",__ref.getField(true,"_colorgreen" /*RemoteObject*/ ));
 BA.debugLineNum = 528;BA.debugLine="If vid <> \"v0\" Then";
Debug.ShouldStop(32768);
if (RemoteObject.solveBoolean("!",_vid,BA.ObjectToString("v0"))) { 
 BA.debugLineNum = 529;BA.debugLine="btnAuswahl.TextColor = colorblue";
Debug.ShouldStop(65536);
__ref.getField(false,"_btnauswahl" /*RemoteObject*/ ).runMethod(true,"setTextColor",__ref.getField(true,"_colorblue" /*RemoteObject*/ ));
 BA.debugLineNum = 530;BA.debugLine="btnAuswahl.Enabled = True";
Debug.ShouldStop(131072);
__ref.getField(false,"_btnauswahl" /*RemoteObject*/ ).runMethod(true,"setEnabled",settings.__c.getField(true,"True"));
 };
 BA.debugLineNum = 532;BA.debugLine="End Sub";
Debug.ShouldStop(524288);
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
		Debug.PushSubsStack("startTimer (settings) ","settings",3,__ref.getField(false, "ba"),__ref,1065);
if (RapidSub.canDelegate("starttimer")) { return __ref.runUserSub(false, "settings","starttimer", __ref);}
 BA.debugLineNum = 1065;BA.debugLine="Private Sub startTimer";
Debug.ShouldStop(256);
 BA.debugLineNum = 1066;BA.debugLine="Uhrzeit.Enabled = False";
Debug.ShouldStop(512);
__ref.getField(false,"_uhrzeit" /*RemoteObject*/ ).runMethod(true,"setEnabled",settings.__c.getField(true,"False"));
 BA.debugLineNum = 1067;BA.debugLine="Uhrzeit.Interval = 1000 * 300";
Debug.ShouldStop(1024);
__ref.getField(false,"_uhrzeit" /*RemoteObject*/ ).runMethod(true,"setInterval",BA.numberCast(long.class, RemoteObject.solve(new RemoteObject[] {RemoteObject.createImmutable(1000),RemoteObject.createImmutable(300)}, "*",0, 1)));
 BA.debugLineNum = 1068;BA.debugLine="Uhrzeit.Enabled = True";
Debug.ShouldStop(2048);
__ref.getField(false,"_uhrzeit" /*RemoteObject*/ ).runMethod(true,"setEnabled",settings.__c.getField(true,"True"));
 BA.debugLineNum = 1069;BA.debugLine="End Sub";
Debug.ShouldStop(4096);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _tbxanzahl_focuschanged(RemoteObject __ref,RemoteObject _hasfocus) throws Exception{
try {
		Debug.PushSubsStack("tbxAnzahl_FocusChanged (settings) ","settings",3,__ref.getField(false, "ba"),__ref,983);
if (RapidSub.canDelegate("tbxanzahl_focuschanged")) { return __ref.runUserSub(false, "settings","tbxanzahl_focuschanged", __ref, _hasfocus);}
Debug.locals.put("HasFocus", _hasfocus);
 BA.debugLineNum = 983;BA.debugLine="Private Sub tbxAnzahl_FocusChanged (HasFocus As Bo";
Debug.ShouldStop(4194304);
 BA.debugLineNum = 984;BA.debugLine="If HasFocus Then";
Debug.ShouldStop(8388608);
if (_hasfocus.<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 985;BA.debugLine="tbxAnzahl.SelectionStart = tbxAnzahl.Text.Length";
Debug.ShouldStop(16777216);
__ref.getField(false,"_tbxanzahl" /*RemoteObject*/ ).runMethod(true,"setSelectionStart",__ref.getField(false,"_tbxanzahl" /*RemoteObject*/ ).runMethod(true,"getText").runMethod(true,"length"));
 }else {
 BA.debugLineNum = 987;BA.debugLine="HideKeyboard";
Debug.ShouldStop(67108864);
__ref.runClassMethod (b4a.example.settings.class, "_hidekeyboard" /*RemoteObject*/ );
 };
 BA.debugLineNum = 989;BA.debugLine="End Sub";
Debug.ShouldStop(268435456);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _tbxanzahl_textchanged(RemoteObject __ref,RemoteObject _old,RemoteObject _new) throws Exception{
try {
		Debug.PushSubsStack("tbxAnzahl_TextChanged (settings) ","settings",3,__ref.getField(false, "ba"),__ref,992);
if (RapidSub.canDelegate("tbxanzahl_textchanged")) { return __ref.runUserSub(false, "settings","tbxanzahl_textchanged", __ref, _old, _new);}
RemoteObject _val = RemoteObject.createImmutable(0);
Debug.locals.put("Old", _old);
Debug.locals.put("New", _new);
 BA.debugLineNum = 992;BA.debugLine="Private Sub tbxAnzahl_TextChanged (Old As String,";
Debug.ShouldStop(-2147483648);
 BA.debugLineNum = 993;BA.debugLine="Log(\"tbxAnzahl_TextChanged\")";
Debug.ShouldStop(1);
settings.__c.runVoidMethod ("LogImpl","846727169",RemoteObject.createImmutable("tbxAnzahl_TextChanged"),0);
 BA.debugLineNum = 994;BA.debugLine="Log(\"dochange = \" & dochange)";
Debug.ShouldStop(2);
settings.__c.runVoidMethod ("LogImpl","846727170",RemoteObject.concat(RemoteObject.createImmutable("dochange = "),__ref.getField(true,"_dochange" /*RemoteObject*/ )),0);
 BA.debugLineNum = 995;BA.debugLine="If dochange = False Then Return";
Debug.ShouldStop(4);
if (RemoteObject.solveBoolean("=",__ref.getField(true,"_dochange" /*RemoteObject*/ ),settings.__c.getField(true,"False"))) { 
if (true) return RemoteObject.createImmutable("");};
 BA.debugLineNum = 997;BA.debugLine="dochange = False";
Debug.ShouldStop(16);
__ref.setField ("_dochange" /*RemoteObject*/ ,settings.__c.getField(true,"False"));
 BA.debugLineNum = 998;BA.debugLine="If tbxAnzahl.Enabled Then";
Debug.ShouldStop(32);
if (__ref.getField(false,"_tbxanzahl" /*RemoteObject*/ ).runMethod(true,"getEnabled").<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 999;BA.debugLine="If IsNumber(tbxAnzahl.Text) Then";
Debug.ShouldStop(64);
if (settings.__c.runMethod(true,"IsNumber",(Object)(__ref.getField(false,"_tbxanzahl" /*RemoteObject*/ ).runMethod(true,"getText"))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 1000;BA.debugLine="Dim val As Int = Abs(tbxAnzahl.Text)";
Debug.ShouldStop(128);
_val = BA.numberCast(int.class, settings.__c.runMethod(true,"Abs",(Object)(BA.numberCast(double.class, __ref.getField(false,"_tbxanzahl" /*RemoteObject*/ ).runMethod(true,"getText")))));Debug.locals.put("val", _val);Debug.locals.put("val", _val);
 BA.debugLineNum = 1001;BA.debugLine="tbxAnzahl.Text = val";
Debug.ShouldStop(256);
__ref.getField(false,"_tbxanzahl" /*RemoteObject*/ ).runMethodAndSync(true,"setText",BA.ObjectToCharSequence(_val));
 };
 BA.debugLineNum = 1003;BA.debugLine="pruefeInhalt";
Debug.ShouldStop(1024);
__ref.runClassMethod (b4a.example.settings.class, "_pruefeinhalt" /*RemoteObject*/ );
 BA.debugLineNum = 1004;BA.debugLine="tbxAnzahl.SelectionStart = tbxAnzahl.Text.Length";
Debug.ShouldStop(2048);
__ref.getField(false,"_tbxanzahl" /*RemoteObject*/ ).runMethod(true,"setSelectionStart",__ref.getField(false,"_tbxanzahl" /*RemoteObject*/ ).runMethod(true,"getText").runMethod(true,"length"));
 };
 BA.debugLineNum = 1006;BA.debugLine="dochange = True";
Debug.ShouldStop(8192);
__ref.setField ("_dochange" /*RemoteObject*/ ,settings.__c.getField(true,"True"));
 BA.debugLineNum = 1007;BA.debugLine="startTimer";
Debug.ShouldStop(16384);
__ref.runClassMethod (b4a.example.settings.class, "_starttimer" /*RemoteObject*/ );
 BA.debugLineNum = 1008;BA.debugLine="End Sub";
Debug.ShouldStop(32768);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _tbxteilnehmer_focuschanged(RemoteObject __ref,RemoteObject _hasfocus) throws Exception{
try {
		Debug.PushSubsStack("tbxTeilnehmer_FocusChanged (settings) ","settings",3,__ref.getField(false, "ba"),__ref,1010);
if (RapidSub.canDelegate("tbxteilnehmer_focuschanged")) { return __ref.runUserSub(false, "settings","tbxteilnehmer_focuschanged", __ref, _hasfocus);}
Debug.locals.put("HasFocus", _hasfocus);
 BA.debugLineNum = 1010;BA.debugLine="Private Sub tbxTeilnehmer_FocusChanged (HasFocus A";
Debug.ShouldStop(131072);
 BA.debugLineNum = 1011;BA.debugLine="If HasFocus Then";
Debug.ShouldStop(262144);
if (_hasfocus.<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 1012;BA.debugLine="tbxTeilnehmer.SelectionStart = tbxTeilnehmer.Tex";
Debug.ShouldStop(524288);
__ref.getField(false,"_tbxteilnehmer" /*RemoteObject*/ ).runMethod(true,"setSelectionStart",__ref.getField(false,"_tbxteilnehmer" /*RemoteObject*/ ).runMethod(true,"getText").runMethod(true,"length"));
 }else {
 BA.debugLineNum = 1014;BA.debugLine="HideKeyboard";
Debug.ShouldStop(2097152);
__ref.runClassMethod (b4a.example.settings.class, "_hidekeyboard" /*RemoteObject*/ );
 };
 BA.debugLineNum = 1016;BA.debugLine="End Sub";
Debug.ShouldStop(8388608);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _tbxteilnehmer_textchanged(RemoteObject __ref,RemoteObject _old,RemoteObject _new) throws Exception{
try {
		Debug.PushSubsStack("tbxTeilnehmer_TextChanged (settings) ","settings",3,__ref.getField(false, "ba"),__ref,1019);
if (RapidSub.canDelegate("tbxteilnehmer_textchanged")) { return __ref.runUserSub(false, "settings","tbxteilnehmer_textchanged", __ref, _old, _new);}
RemoteObject _cleaned = RemoteObject.createImmutable("");
RemoteObject _sb = RemoteObject.declareNull("anywheresoftware.b4a.keywords.StringBuilderWrapper");
RemoteObject _doupper = RemoteObject.createImmutable(false);
int _i = 0;
RemoteObject _letter = RemoteObject.createImmutable("");
Debug.locals.put("Old", _old);
Debug.locals.put("New", _new);
 BA.debugLineNum = 1019;BA.debugLine="Private Sub tbxTeilnehmer_TextChanged (Old As Stri";
Debug.ShouldStop(67108864);
 BA.debugLineNum = 1020;BA.debugLine="Log(\"tbxTeilnehmer_TextChanged\")";
Debug.ShouldStop(134217728);
settings.__c.runVoidMethod ("LogImpl","846858241",RemoteObject.createImmutable("tbxTeilnehmer_TextChanged"),0);
 BA.debugLineNum = 1021;BA.debugLine="Log(\"dochange = \" & dochange)";
Debug.ShouldStop(268435456);
settings.__c.runVoidMethod ("LogImpl","846858242",RemoteObject.concat(RemoteObject.createImmutable("dochange = "),__ref.getField(true,"_dochange" /*RemoteObject*/ )),0);
 BA.debugLineNum = 1022;BA.debugLine="If dochange = False Then Return";
Debug.ShouldStop(536870912);
if (RemoteObject.solveBoolean("=",__ref.getField(true,"_dochange" /*RemoteObject*/ ),settings.__c.getField(true,"False"))) { 
if (true) return RemoteObject.createImmutable("");};
 BA.debugLineNum = 1024;BA.debugLine="dochange = False";
Debug.ShouldStop(-2147483648);
__ref.setField ("_dochange" /*RemoteObject*/ ,settings.__c.getField(true,"False"));
 BA.debugLineNum = 1025;BA.debugLine="Dim cleaned As String = Regex.Replace(\"[^a-zA-Z0-";
Debug.ShouldStop(1);
_cleaned = settings.__c.getField(false,"Regex").runMethod(true,"Replace",(Object)(BA.ObjectToString("[^a-zA-Z0-9äöüÄÖÜßéèêëáàâçñ -]")),(Object)(__ref.getField(false,"_tbxteilnehmer" /*RemoteObject*/ ).runMethod(true,"getText")),(Object)(RemoteObject.createImmutable("")));Debug.locals.put("cleaned", _cleaned);Debug.locals.put("cleaned", _cleaned);
 BA.debugLineNum = 1027;BA.debugLine="Dim sb As StringBuilder";
Debug.ShouldStop(4);
_sb = RemoteObject.createNew ("anywheresoftware.b4a.keywords.StringBuilderWrapper");Debug.locals.put("sb", _sb);
 BA.debugLineNum = 1028;BA.debugLine="sb.Initialize";
Debug.ShouldStop(8);
_sb.runVoidMethod ("Initialize");
 BA.debugLineNum = 1029;BA.debugLine="Dim doupper As Boolean = True";
Debug.ShouldStop(16);
_doupper = settings.__c.getField(true,"True");Debug.locals.put("doupper", _doupper);Debug.locals.put("doupper", _doupper);
 BA.debugLineNum = 1030;BA.debugLine="For i = 0 To cleaned.Length - 1";
Debug.ShouldStop(32);
{
final int step9 = 1;
final int limit9 = RemoteObject.solve(new RemoteObject[] {_cleaned.runMethod(true,"length"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step9 > 0 && _i <= limit9) || (step9 < 0 && _i >= limit9) ;_i = ((int)(0 + _i + step9))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 1031;BA.debugLine="Dim letter As String = cleaned.SubString2(i, i +";
Debug.ShouldStop(64);
_letter = _cleaned.runMethod(true,"substring",(Object)(BA.numberCast(int.class, _i)),(Object)(RemoteObject.solve(new RemoteObject[] {RemoteObject.createImmutable(_i),RemoteObject.createImmutable(1)}, "+",1, 1)));Debug.locals.put("letter", _letter);Debug.locals.put("letter", _letter);
 BA.debugLineNum = 1032;BA.debugLine="If letter = \" \" Or letter = \"-\" Then";
Debug.ShouldStop(128);
if (RemoteObject.solveBoolean("=",_letter,BA.ObjectToString(" ")) || RemoteObject.solveBoolean("=",_letter,BA.ObjectToString("-"))) { 
 BA.debugLineNum = 1033;BA.debugLine="doupper = True";
Debug.ShouldStop(256);
_doupper = settings.__c.getField(true,"True");Debug.locals.put("doupper", _doupper);
 BA.debugLineNum = 1034;BA.debugLine="sb.Append(letter)";
Debug.ShouldStop(512);
_sb.runVoidMethod ("Append",(Object)(_letter));
 }else 
{ BA.debugLineNum = 1035;BA.debugLine="Else if letter = \",\" Then";
Debug.ShouldStop(1024);
if (RemoteObject.solveBoolean("=",_letter,BA.ObjectToString(","))) { 
 }else 
{ BA.debugLineNum = 1037;BA.debugLine="Else if doupper Then";
Debug.ShouldStop(4096);
if (_doupper.<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 1038;BA.debugLine="sb.Append(letter.ToUpperCase)";
Debug.ShouldStop(8192);
_sb.runVoidMethod ("Append",(Object)(_letter.runMethod(true,"toUpperCase")));
 BA.debugLineNum = 1039;BA.debugLine="doupper = False";
Debug.ShouldStop(16384);
_doupper = settings.__c.getField(true,"False");Debug.locals.put("doupper", _doupper);
 }else {
 BA.debugLineNum = 1041;BA.debugLine="sb.Append(letter)";
Debug.ShouldStop(65536);
_sb.runVoidMethod ("Append",(Object)(_letter));
 }}}
;
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 1044;BA.debugLine="tbxTeilnehmer.Text = sb.ToString";
Debug.ShouldStop(524288);
__ref.getField(false,"_tbxteilnehmer" /*RemoteObject*/ ).runMethodAndSync(true,"setText",BA.ObjectToCharSequence(_sb.runMethod(true,"ToString")));
 BA.debugLineNum = 1046;BA.debugLine="btnTLNDelete.TextColor = 0xFF888888";
Debug.ShouldStop(2097152);
__ref.getField(false,"_btntlndelete" /*RemoteObject*/ ).runMethod(true,"setTextColor",BA.numberCast(int.class, ((int)0xff888888)));
 BA.debugLineNum = 1047;BA.debugLine="btnTLNDelete.Enabled = False";
Debug.ShouldStop(4194304);
__ref.getField(false,"_btntlndelete" /*RemoteObject*/ ).runMethod(true,"setEnabled",settings.__c.getField(true,"False"));
 BA.debugLineNum = 1049;BA.debugLine="If tbxTeilnehmer.Text.Length >= 3 Then";
Debug.ShouldStop(16777216);
if (RemoteObject.solveBoolean("g",__ref.getField(false,"_tbxteilnehmer" /*RemoteObject*/ ).runMethod(true,"getText").runMethod(true,"length"),BA.numberCast(double.class, 3))) { 
 BA.debugLineNum = 1050;BA.debugLine="btnTLNSpeichern.TextColor = colorgreen";
Debug.ShouldStop(33554432);
__ref.getField(false,"_btntlnspeichern" /*RemoteObject*/ ).runMethod(true,"setTextColor",__ref.getField(true,"_colorgreen" /*RemoteObject*/ ));
 BA.debugLineNum = 1051;BA.debugLine="btnTLNSpeichern.Enabled = True";
Debug.ShouldStop(67108864);
__ref.getField(false,"_btntlnspeichern" /*RemoteObject*/ ).runMethod(true,"setEnabled",settings.__c.getField(true,"True"));
 }else {
 BA.debugLineNum = 1053;BA.debugLine="btnTLNSpeichern.TextColor = 0xFF888888";
Debug.ShouldStop(268435456);
__ref.getField(false,"_btntlnspeichern" /*RemoteObject*/ ).runMethod(true,"setTextColor",BA.numberCast(int.class, ((int)0xff888888)));
 BA.debugLineNum = 1054;BA.debugLine="btnTLNSpeichern.Enabled = False";
Debug.ShouldStop(536870912);
__ref.getField(false,"_btntlnspeichern" /*RemoteObject*/ ).runMethod(true,"setEnabled",settings.__c.getField(true,"False"));
 };
 BA.debugLineNum = 1057;BA.debugLine="dochange = True";
Debug.ShouldStop(1);
__ref.setField ("_dochange" /*RemoteObject*/ ,settings.__c.getField(true,"True"));
 BA.debugLineNum = 1058;BA.debugLine="tbxTeilnehmer.SelectionStart = tbxTeilnehmer.Text";
Debug.ShouldStop(2);
__ref.getField(false,"_tbxteilnehmer" /*RemoteObject*/ ).runMethod(true,"setSelectionStart",__ref.getField(false,"_tbxteilnehmer" /*RemoteObject*/ ).runMethod(true,"getText").runMethod(true,"length"));
 BA.debugLineNum = 1059;BA.debugLine="startTimer";
Debug.ShouldStop(4);
__ref.runClassMethod (b4a.example.settings.class, "_starttimer" /*RemoteObject*/ );
 BA.debugLineNum = 1060;BA.debugLine="End Sub";
Debug.ShouldStop(8);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _tbxveranstaltung_focuschanged(RemoteObject __ref,RemoteObject _hasfocus) throws Exception{
try {
		Debug.PushSubsStack("tbxVeranstaltung_FocusChanged (settings) ","settings",3,__ref.getField(false, "ba"),__ref,961);
if (RapidSub.canDelegate("tbxveranstaltung_focuschanged")) { return __ref.runUserSub(false, "settings","tbxveranstaltung_focuschanged", __ref, _hasfocus);}
Debug.locals.put("HasFocus", _hasfocus);
 BA.debugLineNum = 961;BA.debugLine="Private Sub tbxVeranstaltung_FocusChanged (HasFocu";
Debug.ShouldStop(1);
 BA.debugLineNum = 962;BA.debugLine="If HasFocus Then";
Debug.ShouldStop(2);
if (_hasfocus.<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 963;BA.debugLine="tbxVeranstaltung.SelectionStart = tbxVeranstaltu";
Debug.ShouldStop(4);
__ref.getField(false,"_tbxveranstaltung" /*RemoteObject*/ ).runMethod(true,"setSelectionStart",__ref.getField(false,"_tbxveranstaltung" /*RemoteObject*/ ).runMethod(true,"getText").runMethod(true,"length"));
 }else {
 BA.debugLineNum = 965;BA.debugLine="HideKeyboard";
Debug.ShouldStop(16);
__ref.runClassMethod (b4a.example.settings.class, "_hidekeyboard" /*RemoteObject*/ );
 };
 BA.debugLineNum = 967;BA.debugLine="End Sub";
Debug.ShouldStop(64);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _tbxveranstaltung_textchanged(RemoteObject __ref,RemoteObject _old,RemoteObject _new) throws Exception{
try {
		Debug.PushSubsStack("tbxVeranstaltung_TextChanged (settings) ","settings",3,__ref.getField(false, "ba"),__ref,970);
if (RapidSub.canDelegate("tbxveranstaltung_textchanged")) { return __ref.runUserSub(false, "settings","tbxveranstaltung_textchanged", __ref, _old, _new);}
Debug.locals.put("Old", _old);
Debug.locals.put("New", _new);
 BA.debugLineNum = 970;BA.debugLine="Private Sub tbxVeranstaltung_TextChanged (Old As S";
Debug.ShouldStop(512);
 BA.debugLineNum = 971;BA.debugLine="Log(\"tbxVeranstaltung_TextChanged\")";
Debug.ShouldStop(1024);
settings.__c.runVoidMethod ("LogImpl","846596097",RemoteObject.createImmutable("tbxVeranstaltung_TextChanged"),0);
 BA.debugLineNum = 972;BA.debugLine="Log(\"dochange = \" & dochange)";
Debug.ShouldStop(2048);
settings.__c.runVoidMethod ("LogImpl","846596098",RemoteObject.concat(RemoteObject.createImmutable("dochange = "),__ref.getField(true,"_dochange" /*RemoteObject*/ )),0);
 BA.debugLineNum = 973;BA.debugLine="If dochange = False Then Return";
Debug.ShouldStop(4096);
if (RemoteObject.solveBoolean("=",__ref.getField(true,"_dochange" /*RemoteObject*/ ),settings.__c.getField(true,"False"))) { 
if (true) return RemoteObject.createImmutable("");};
 BA.debugLineNum = 975;BA.debugLine="dochange = False";
Debug.ShouldStop(16384);
__ref.setField ("_dochange" /*RemoteObject*/ ,settings.__c.getField(true,"False"));
 BA.debugLineNum = 976;BA.debugLine="If tbxVeranstaltung.Enabled Then";
Debug.ShouldStop(32768);
if (__ref.getField(false,"_tbxveranstaltung" /*RemoteObject*/ ).runMethod(true,"getEnabled").<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 977;BA.debugLine="pruefeInhalt";
Debug.ShouldStop(65536);
__ref.runClassMethod (b4a.example.settings.class, "_pruefeinhalt" /*RemoteObject*/ );
 };
 BA.debugLineNum = 979;BA.debugLine="dochange = True";
Debug.ShouldStop(262144);
__ref.setField ("_dochange" /*RemoteObject*/ ,settings.__c.getField(true,"True"));
 BA.debugLineNum = 980;BA.debugLine="startTimer";
Debug.ShouldStop(524288);
__ref.runClassMethod (b4a.example.settings.class, "_starttimer" /*RemoteObject*/ );
 BA.debugLineNum = 981;BA.debugLine="End Sub";
Debug.ShouldStop(1048576);
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
		Debug.PushSubsStack("Uhrzeit_Tick (settings) ","settings",3,__ref.getField(false, "ba"),__ref,1071);
if (RapidSub.canDelegate("uhrzeit_tick")) { return __ref.runUserSub(false, "settings","uhrzeit_tick", __ref);}
 BA.debugLineNum = 1071;BA.debugLine="Private Sub Uhrzeit_Tick";
Debug.ShouldStop(16384);
 BA.debugLineNum = 1072;BA.debugLine="Uhrzeit.Enabled = False";
Debug.ShouldStop(32768);
__ref.getField(false,"_uhrzeit" /*RemoteObject*/ ).runMethod(true,"setEnabled",settings.__c.getField(true,"False"));
 BA.debugLineNum = 1073;BA.debugLine="B4XPages.ShowPage(\"ScreenSaver\")";
Debug.ShouldStop(65536);
settings._b4xpages.runVoidMethod ("_showpage" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("ScreenSaver")));
 BA.debugLineNum = 1074;BA.debugLine="End Sub";
Debug.ShouldStop(131072);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _zeigeteilnehmerclv(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("ZeigeTeilnehmerCLV (settings) ","settings",3,__ref.getField(false, "ba"),__ref,1153);
if (RapidSub.canDelegate("zeigeteilnehmerclv")) { return __ref.runUserSub(false, "settings","zeigeteilnehmerclv", __ref);}
int _i = 0;
 BA.debugLineNum = 1153;BA.debugLine="Private Sub ZeigeTeilnehmerCLV";
Debug.ShouldStop(1);
 BA.debugLineNum = 1155;BA.debugLine="lstTeilnehmer.Clear";
Debug.ShouldStop(4);
__ref.getField(false,"_lstteilnehmer" /*RemoteObject*/ ).runVoidMethod ("_clear");
 BA.debugLineNum = 1157;BA.debugLine="For I = 0 To Teilnehmer.Size - 1 Step 2";
Debug.ShouldStop(16);
{
final int step2 = 2;
final int limit2 = RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_teilnehmer" /*RemoteObject*/ ).runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step2 > 0 && _i <= limit2) || (step2 < 0 && _i >= limit2) ;_i = ((int)(0 + _i + step2))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 1158;BA.debugLine="If I + 1 < Teilnehmer.Size Then";
Debug.ShouldStop(32);
if (RemoteObject.solveBoolean("<",RemoteObject.solve(new RemoteObject[] {RemoteObject.createImmutable(_i),RemoteObject.createImmutable(1)}, "+",1, 1),BA.numberCast(double.class, __ref.getField(false,"_teilnehmer" /*RemoteObject*/ ).runMethod(true,"getSize")))) { 
 };
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 1163;BA.debugLine="End Sub";
Debug.ShouldStop(1024);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _zeigeveranstaltungenclv(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("ZeigeVeranstaltungenCLV (settings) ","settings",3,__ref.getField(false, "ba"),__ref,1127);
if (RapidSub.canDelegate("zeigeveranstaltungenclv")) { return __ref.runUserSub(false, "settings","zeigeveranstaltungenclv", __ref);}
RemoteObject _key = RemoteObject.createImmutable("");
RemoteObject _v = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _datum = RemoteObject.createImmutable("");
RemoteObject _name = RemoteObject.createImmutable("");
 BA.debugLineNum = 1127;BA.debugLine="Private Sub ZeigeVeranstaltungenCLV";
Debug.ShouldStop(64);
 BA.debugLineNum = 1129;BA.debugLine="lstVeranstaltungen.Clear";
Debug.ShouldStop(256);
__ref.getField(false,"_lstveranstaltungen" /*RemoteObject*/ ).runVoidMethod ("_clear");
 BA.debugLineNum = 1131;BA.debugLine="For Each KEY As String In Veranstaltungen.Keys";
Debug.ShouldStop(1024);
{
final RemoteObject group2 = __ref.getField(false,"_veranstaltungen" /*RemoteObject*/ ).runMethod(false,"Keys");
final int groupLen2 = group2.runMethod(true,"getSize").<Integer>get()
;int index2 = 0;
;
for (; index2 < groupLen2;index2++){
_key = BA.ObjectToString(group2.runMethod(false,"Get",index2));Debug.locals.put("key", _key);
Debug.locals.put("key", _key);
 BA.debugLineNum = 1133;BA.debugLine="Dim V As Map = Veranstaltungen.Get(KEY)";
Debug.ShouldStop(4096);
_v = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_v = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), __ref.getField(false,"_veranstaltungen" /*RemoteObject*/ ).runMethod(false,"Get",(Object)((_key))));Debug.locals.put("v", _v);Debug.locals.put("V", _v);
 BA.debugLineNum = 1135;BA.debugLine="Dim DATUM As String = V.GetDefault(\"Datum\", \"\")";
Debug.ShouldStop(16384);
_datum = BA.ObjectToString(_v.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("Datum"))),(Object)((RemoteObject.createImmutable("")))));Debug.locals.put("datum", _datum);Debug.locals.put("DATUM", _datum);
 BA.debugLineNum = 1136;BA.debugLine="Dim NAME As String = V.GetDefault(\"Name\", \"\")";
Debug.ShouldStop(32768);
_name = BA.ObjectToString(_v.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("Name"))),(Object)((RemoteObject.createImmutable("")))));Debug.locals.put("name", _name);Debug.locals.put("NAME", _name);
 }
}Debug.locals.put("key", _key);
;
 BA.debugLineNum = 1144;BA.debugLine="End Sub";
Debug.ShouldStop(8388608);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}