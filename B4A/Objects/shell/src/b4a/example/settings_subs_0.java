package b4a.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class settings_subs_0 {


public static RemoteObject  _adddivider(RemoteObject __ref,RemoteObject _parent,RemoteObject _toppos,RemoteObject _h,RemoteObject _col) throws Exception{
try {
		Debug.PushSubsStack("AddDivider (settings) ","settings",3,__ref.getField(false, "ba"),__ref,376);
if (RapidSub.canDelegate("adddivider")) { return __ref.runUserSub(false, "settings","adddivider", __ref, _parent, _toppos, _h, _col);}
RemoteObject _p = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
Debug.locals.put("parent", _parent);
Debug.locals.put("topPos", _toppos);
Debug.locals.put("h", _h);
Debug.locals.put("col", _col);
 BA.debugLineNum = 376;BA.debugLine="Private Sub AddDivider(parent As Panel, topPos As";
Debug.ShouldStop(8388608);
 BA.debugLineNum = 377;BA.debugLine="Dim p As Panel";
Debug.ShouldStop(16777216);
_p = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");Debug.locals.put("p", _p);
 BA.debugLineNum = 378;BA.debugLine="p.Initialize(\"\")";
Debug.ShouldStop(33554432);
_p.runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 379;BA.debugLine="p.Color = col";
Debug.ShouldStop(67108864);
_p.runVoidMethod ("setColor",_col);
 BA.debugLineNum = 380;BA.debugLine="parent.AddView(p, 0, topPos, 100%x, h)";
Debug.ShouldStop(134217728);
_parent.runVoidMethod ("AddView",(Object)((_p.getObject())),(Object)(BA.numberCast(int.class, 0)),(Object)(_toppos),(Object)(settings.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 100)),__ref.getField(false, "ba"))),(Object)(_h));
 BA.debugLineNum = 381;BA.debugLine="End Sub";
Debug.ShouldStop(268435456);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _b4xpage_appear(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("B4XPage_Appear (settings) ","settings",3,__ref.getField(false, "ba"),__ref,79);
if (RapidSub.canDelegate("b4xpage_appear")) { return __ref.runUserSub(false, "settings","b4xpage_appear", __ref);}
 BA.debugLineNum = 79;BA.debugLine="Public Sub B4XPage_Appear";
Debug.ShouldStop(16384);
 BA.debugLineNum = 80;BA.debugLine="LoadTinyDB";
Debug.ShouldStop(32768);
__ref.runClassMethod (b4a.example.settings.class, "_loadtinydb" /*RemoteObject*/ );
 BA.debugLineNum = 82;BA.debugLine="If B4XPages.MainPage.Status.IsInitialized And B4X";
Debug.ShouldStop(131072);
if (RemoteObject.solveBoolean(".",settings._b4xpages.runMethod(false,"_mainpage" /*RemoteObject*/ ,__ref.getField(false, "ba")).getField(false,"_status" /*RemoteObject*/ ).runMethod(true,"IsInitialized")) && RemoteObject.solveBoolean(">",settings._b4xpages.runMethod(false,"_mainpage" /*RemoteObject*/ ,__ref.getField(false, "ba")).getField(false,"_status" /*RemoteObject*/ ).runMethod(true,"getSize"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 83;BA.debugLine="Status = B4XPages.MainPage.Status";
Debug.ShouldStop(262144);
__ref.setField ("_status" /*RemoteObject*/ ,settings._b4xpages.runMethod(false,"_mainpage" /*RemoteObject*/ ,__ref.getField(false, "ba")).getField(false,"_status" /*RemoteObject*/ ));
 };
 BA.debugLineNum = 86;BA.debugLine="Veranstaltung_ID = DBGet(\"VeranstaltungID\", \"v0\")";
Debug.ShouldStop(2097152);
__ref.setField ("_veranstaltung_id" /*RemoteObject*/ ,BA.ObjectToString(__ref.runClassMethod (b4a.example.settings.class, "_dbget" /*RemoteObject*/ ,(Object)(BA.ObjectToString("VeranstaltungID")),(Object)((RemoteObject.createImmutable("v0"))))));
 BA.debugLineNum = 87;BA.debugLine="colorblue = lblVeranstaltung.TextColor";
Debug.ShouldStop(4194304);
__ref.setField ("_colorblue" /*RemoteObject*/ ,__ref.getField(false,"_lblveranstaltung" /*RemoteObject*/ ).runMethod(true,"getTextColor"));
 BA.debugLineNum = 88;BA.debugLine="colorgreen = lblVerein.TextColor";
Debug.ShouldStop(8388608);
__ref.setField ("_colorgreen" /*RemoteObject*/ ,__ref.getField(false,"_lblverein" /*RemoteObject*/ ).runMethod(true,"getTextColor"));
 BA.debugLineNum = 90;BA.debugLine="disableVSTNG";
Debug.ShouldStop(33554432);
__ref.runClassMethod (b4a.example.settings.class, "_disablevstng" /*RemoteObject*/ );
 BA.debugLineNum = 91;BA.debugLine="disableTLN";
Debug.ShouldStop(67108864);
__ref.runClassMethod (b4a.example.settings.class, "_disabletln" /*RemoteObject*/ );
 BA.debugLineNum = 92;BA.debugLine="setzeHeaderfromDB";
Debug.ShouldStop(134217728);
__ref.runClassMethod (b4a.example.settings.class, "_setzeheaderfromdb" /*RemoteObject*/ );
 BA.debugLineNum = 93;BA.debugLine="changeURL";
Debug.ShouldStop(268435456);
__ref.runClassMethod (b4a.example.settings.class, "_changeurl" /*RemoteObject*/ );
 BA.debugLineNum = 95;BA.debugLine="If Veranstaltung_ID = \"v0\" Then";
Debug.ShouldStop(1073741824);
if (RemoteObject.solveBoolean("=",__ref.getField(true,"_veranstaltung_id" /*RemoteObject*/ ),BA.ObjectToString("v0"))) { 
 BA.debugLineNum = 96;BA.debugLine="DBPut(\"VeranstaltungDatum\", \"\")";
Debug.ShouldStop(-2147483648);
__ref.runClassMethod (b4a.example.settings.class, "_dbput" /*RemoteObject*/ ,(Object)(BA.ObjectToString("VeranstaltungDatum")),(Object)((RemoteObject.createImmutable(""))));
 };
 BA.debugLineNum = 99;BA.debugLine="If Status.GetDefault(\"idToken\", \"\") = \"\" Then";
Debug.ShouldStop(4);
if (RemoteObject.solveBoolean("=",__ref.getField(false,"_status" /*RemoteObject*/ ).runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("idToken"))),(Object)((RemoteObject.createImmutable("")))),RemoteObject.createImmutable(("")))) { 
 BA.debugLineNum = 100;BA.debugLine="CloseSettings";
Debug.ShouldStop(8);
__ref.runClassMethod (b4a.example.settings.class, "_closesettings" /*RemoteObject*/ );
 }else {
 BA.debugLineNum = 102;BA.debugLine="holeVeranstaltungen";
Debug.ShouldStop(32);
__ref.runClassMethod (b4a.example.settings.class, "_holeveranstaltungen" /*RemoteObject*/ );
 };
 BA.debugLineNum = 104;BA.debugLine="startTimer";
Debug.ShouldStop(128);
__ref.runClassMethod (b4a.example.settings.class, "_starttimer" /*RemoteObject*/ );
 BA.debugLineNum = 105;BA.debugLine="End Sub";
Debug.ShouldStop(256);
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
		Debug.PushSubsStack("B4XPage_CloseRequest (settings) ","settings",3,__ref.getField(false, "ba"),__ref,107);
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
		Debug.PushSubsStack("B4XPage_CloseRequest (settings) ","settings",3,__ref.getField(false, "ba"),__ref,107);
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
 BA.debugLineNum = 108;BA.debugLine="Uhrzeit.Enabled = False";
Debug.ShouldStop(2048);
__ref.getField(false,"_uhrzeit" /*RemoteObject*/ ).runMethod(true,"setEnabled",parent.__c.getField(true,"False"));
 BA.debugLineNum = 109;BA.debugLine="B4XPages.MainPage.Status = Status";
Debug.ShouldStop(4096);
parent._b4xpages.runMethod(false,"_mainpage" /*RemoteObject*/ ,__ref.getField(false, "ba")).setField ("_status" /*RemoteObject*/ ,__ref.getField(false,"_status" /*RemoteObject*/ ));
 BA.debugLineNum = 110;BA.debugLine="Return True";
Debug.ShouldStop(8192);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(parent.__c.getField(true,"True")));return;};
 BA.debugLineNum = 111;BA.debugLine="End Sub";
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
 BA.debugLineNum = 74;BA.debugLine="B4XPages.SetTitle(Me, \"Wertungslisten-App Einstel";
Debug.ShouldStop(512);
settings._b4xpages.runVoidMethod ("_settitle" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(__ref),(Object)((RemoteObject.createImmutable("Wertungslisten-App Einstellungen"))));
 BA.debugLineNum = 75;BA.debugLine="BuildUI";
Debug.ShouldStop(1024);
__ref.runClassMethod (b4a.example.settings.class, "_buildui" /*RemoteObject*/ );
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
		Debug.PushSubsStack("btnAuswahl_Click (settings) ","settings",3,__ref.getField(false, "ba"),__ref,906);
if (RapidSub.canDelegate("btnauswahl_click")) { return __ref.runUserSub(false, "settings","btnauswahl_click", __ref);}
 BA.debugLineNum = 906;BA.debugLine="Private Sub btnAuswahl_Click";
Debug.ShouldStop(512);
 BA.debugLineNum = 907;BA.debugLine="Uhrzeit.Enabled = False";
Debug.ShouldStop(1024);
__ref.getField(false,"_uhrzeit" /*RemoteObject*/ ).runMethod(true,"setEnabled",settings.__c.getField(true,"False"));
 BA.debugLineNum = 908;BA.debugLine="Veranstaltung_ID = webviewVSTGN_ID";
Debug.ShouldStop(2048);
__ref.setField ("_veranstaltung_id" /*RemoteObject*/ ,__ref.getField(true,"_webviewvstgn_id" /*RemoteObject*/ ));
 BA.debugLineNum = 909;BA.debugLine="saveDBvstng";
Debug.ShouldStop(4096);
__ref.runClassMethod (b4a.example.settings.class, "_savedbvstng" /*RemoteObject*/ );
 BA.debugLineNum = 910;BA.debugLine="CloseSettings";
Debug.ShouldStop(8192);
__ref.runClassMethod (b4a.example.settings.class, "_closesettings" /*RemoteObject*/ );
 BA.debugLineNum = 911;BA.debugLine="End Sub";
Debug.ShouldStop(16384);
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
		Debug.PushSubsStack("btnBack_Click (settings) ","settings",3,__ref.getField(false, "ba"),__ref,827);
if (RapidSub.canDelegate("btnback_click")) { return __ref.runUserSub(false, "settings","btnback_click", __ref);}
 BA.debugLineNum = 827;BA.debugLine="Private Sub btnBack_Click";
Debug.ShouldStop(67108864);
 BA.debugLineNum = 828;BA.debugLine="CloseSettings";
Debug.ShouldStop(134217728);
__ref.runClassMethod (b4a.example.settings.class, "_closesettings" /*RemoteObject*/ );
 BA.debugLineNum = 829;BA.debugLine="End Sub";
Debug.ShouldStop(268435456);
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
		Debug.PushSubsStack("btnTLNDelete_Click (settings) ","settings",3,__ref.getField(false, "ba"),__ref,946);
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
		Debug.PushSubsStack("btnTLNDelete_Click (settings) ","settings",3,__ref.getField(false, "ba"),__ref,946);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
;
 BA.debugLineNum = 947;BA.debugLine="startTimer";
Debug.ShouldStop(262144);
__ref.runClassMethod (b4a.example.settings.class, "_starttimer" /*RemoteObject*/ );
 BA.debugLineNum = 948;BA.debugLine="Msgbox2Async(tbxTeilnehmer.Text & \" aus der Liste";
Debug.ShouldStop(524288);
parent.__c.runVoidMethod ("Msgbox2Async",(Object)(BA.ObjectToCharSequence(RemoteObject.concat(__ref.getField(false,"_tbxteilnehmer" /*RemoteObject*/ ).runMethod(true,"getText"),RemoteObject.createImmutable(" aus der Liste der Teilnehmer löschen?")))),(Object)(BA.ObjectToCharSequence("Teilnehmer wirklich löschen?")),(Object)(BA.ObjectToString("Löschen")),(Object)(BA.ObjectToString("")),(Object)(BA.ObjectToString("Abbrechen")),RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper"), parent.__c.getField(false,"Null")),__ref.getField(false, "ba"),(Object)(parent.__c.getField(true,"True")));
 BA.debugLineNum = 949;BA.debugLine="Wait For Msgbox_Result (res As Int)";
Debug.ShouldStop(1048576);
parent.__c.runVoidMethod ("WaitFor","msgbox_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "settings", "btntlndelete_click"), null);
this.state = 5;
return;
case 5:
//C
this.state = 1;
_res = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("res", _res);
;
 BA.debugLineNum = 950;BA.debugLine="If res = DialogResponse.POSITIVE Then";
Debug.ShouldStop(2097152);
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
 BA.debugLineNum = 951;BA.debugLine="delTLN(TLNid)";
Debug.ShouldStop(4194304);
__ref.runClassMethod (b4a.example.settings.class, "_deltln" /*RemoteObject*/ ,(Object)(__ref.getField(true,"_tlnid" /*RemoteObject*/ )));
 BA.debugLineNum = 952;BA.debugLine="startTimer";
Debug.ShouldStop(8388608);
__ref.runClassMethod (b4a.example.settings.class, "_starttimer" /*RemoteObject*/ );
 if (true) break;

case 4:
//C
this.state = -1;
;
 BA.debugLineNum = 954;BA.debugLine="End Sub";
Debug.ShouldStop(33554432);
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
		Debug.PushSubsStack("btnTLNSpeichern_Click (settings) ","settings",3,__ref.getField(false, "ba"),__ref,956);
if (RapidSub.canDelegate("btntlnspeichern_click")) { return __ref.runUserSub(false, "settings","btntlnspeichern_click", __ref);}
 BA.debugLineNum = 956;BA.debugLine="Private Sub btnTLNSpeichern_Click";
Debug.ShouldStop(134217728);
 BA.debugLineNum = 957;BA.debugLine="saveTLN";
Debug.ShouldStop(268435456);
__ref.runClassMethod (b4a.example.settings.class, "_savetln" /*RemoteObject*/ );
 BA.debugLineNum = 958;BA.debugLine="startTimer";
Debug.ShouldStop(536870912);
__ref.runClassMethod (b4a.example.settings.class, "_starttimer" /*RemoteObject*/ );
 BA.debugLineNum = 959;BA.debugLine="End Sub";
Debug.ShouldStop(1073741824);
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
		Debug.PushSubsStack("btnVerstgDelete_Click (settings) ","settings",3,__ref.getField(false, "ba"),__ref,913);
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
		Debug.PushSubsStack("btnVerstgDelete_Click (settings) ","settings",3,__ref.getField(false, "ba"),__ref,913);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
;
 BA.debugLineNum = 914;BA.debugLine="startTimer";
Debug.ShouldStop(131072);
__ref.runClassMethod (b4a.example.settings.class, "_starttimer" /*RemoteObject*/ );
 BA.debugLineNum = 915;BA.debugLine="Msgbox2Async(\"Die Veranstaltung und deren Wertung";
Debug.ShouldStop(262144);
parent.__c.runVoidMethod ("Msgbox2Async",(Object)(BA.ObjectToCharSequence("Die Veranstaltung und deren Wertungsliste werden unwiederbringlich gelöscht! Wirklich löschen?")),(Object)(BA.ObjectToCharSequence("Veranstaltung wirklich löschen?")),(Object)(BA.ObjectToString("Löschen")),(Object)(BA.ObjectToString("")),(Object)(BA.ObjectToString("Abbrechen")),RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper"), parent.__c.getField(false,"Null")),__ref.getField(false, "ba"),(Object)(parent.__c.getField(true,"True")));
 BA.debugLineNum = 916;BA.debugLine="Wait For Msgbox_Result (res As Int)";
Debug.ShouldStop(524288);
parent.__c.runVoidMethod ("WaitFor","msgbox_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "settings", "btnverstgdelete_click"), null);
this.state = 5;
return;
case 5:
//C
this.state = 1;
_res = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("res", _res);
;
 BA.debugLineNum = 917;BA.debugLine="If res = DialogResponse.POSITIVE Then";
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
 BA.debugLineNum = 918;BA.debugLine="delWertungsliste(webviewVSTGN_ID)";
Debug.ShouldStop(2097152);
__ref.runClassMethod (b4a.example.settings.class, "_delwertungsliste" /*RemoteObject*/ ,(Object)(__ref.getField(true,"_webviewvstgn_id" /*RemoteObject*/ )));
 BA.debugLineNum = 919;BA.debugLine="startTimer";
Debug.ShouldStop(4194304);
__ref.runClassMethod (b4a.example.settings.class, "_starttimer" /*RemoteObject*/ );
 if (true) break;

case 4:
//C
this.state = -1;
;
 BA.debugLineNum = 921;BA.debugLine="End Sub";
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
public static void  _btnverstgspeichern_click(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("btnVerstgSpeichern_Click (settings) ","settings",3,__ref.getField(false, "ba"),__ref,923);
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
		Debug.PushSubsStack("btnVerstgSpeichern_Click (settings) ","settings",3,__ref.getField(false, "ba"),__ref,923);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
;
 BA.debugLineNum = 924;BA.debugLine="startTimer";
Debug.ShouldStop(134217728);
__ref.runClassMethod (b4a.example.settings.class, "_starttimer" /*RemoteObject*/ );
 BA.debugLineNum = 925;BA.debugLine="Dim neuAnz As Int = 0";
Debug.ShouldStop(268435456);
_neuanz = BA.numberCast(int.class, 0);Debug.locals.put("neuanz", _neuanz);Debug.locals.put("neuAnz", _neuanz);
 BA.debugLineNum = 926;BA.debugLine="If IsNumber(tbxAnzahl.Text) Then neuAnz = tbxAnza";
Debug.ShouldStop(536870912);
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
 BA.debugLineNum = 928;BA.debugLine="Dim altAnz As Int = 0";
Debug.ShouldStop(-2147483648);
_altanz = BA.numberCast(int.class, 0);Debug.locals.put("altanz", _altanz);Debug.locals.put("altAnz", _altanz);
 BA.debugLineNum = 929;BA.debugLine="If Veranstaltungen.IsInitialized And Veranstaltun";
Debug.ShouldStop(1);
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
 BA.debugLineNum = 930;BA.debugLine="Dim vMap As Map = Veranstaltungen.Get(Veranstalt";
Debug.ShouldStop(2);
_vmap = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_vmap = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), __ref.getField(false,"_veranstaltungen" /*RemoteObject*/ ).runMethod(false,"Get",(Object)((__ref.getField(true,"_veranstaltung_id" /*RemoteObject*/ )))));Debug.locals.put("vmap", _vmap);Debug.locals.put("vMap", _vmap);
 BA.debugLineNum = 931;BA.debugLine="altAnz = vMap.GetDefault(\"Teilnehmerzahl\", \"0\")";
Debug.ShouldStop(4);
_altanz = BA.numberCast(int.class, _vmap.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("Teilnehmerzahl"))),(Object)((RemoteObject.createImmutable("0")))));Debug.locals.put("altAnz", _altanz);
 if (true) break;
;
 BA.debugLineNum = 934;BA.debugLine="If neuAnz < altAnz Then";
Debug.ShouldStop(32);

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
 BA.debugLineNum = 935;BA.debugLine="Msgbox2Async(\"Die Anzahl der Plätze wurde reduzi";
Debug.ShouldStop(64);
parent.__c.runVoidMethod ("Msgbox2Async",(Object)(BA.ObjectToCharSequence("Die Anzahl der Plätze wurde reduziert. Werden die geänderten Daten der Veranstaltung gespeichert, gehen ggf. Informationen in der Wertungsliste der Veranstaltung unwiederbringlich verloren.")),(Object)(BA.ObjectToCharSequence("Veranstaltung - Plätze")),(Object)(BA.ObjectToString("Trotzdem speichern.")),(Object)(BA.ObjectToString("")),(Object)(BA.ObjectToString("Abbrechen")),RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper"), parent.__c.getField(false,"Null")),__ref.getField(false, "ba"),(Object)(parent.__c.getField(true,"True")));
 BA.debugLineNum = 936;BA.debugLine="Wait For Msgbox_Result (res As Int)";
Debug.ShouldStop(128);
parent.__c.runVoidMethod ("WaitFor","msgbox_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "settings", "btnverstgspeichern_click"), null);
this.state = 20;
return;
case 20:
//C
this.state = 13;
_res = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("res", _res);
;
 BA.debugLineNum = 937;BA.debugLine="If res = DialogResponse.POSITIVE Then";
Debug.ShouldStop(256);
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
 BA.debugLineNum = 938;BA.debugLine="saveVSTNG";
Debug.ShouldStop(512);
__ref.runClassMethod (b4a.example.settings.class, "_savevstng" /*RemoteObject*/ );
 BA.debugLineNum = 939;BA.debugLine="startTimer";
Debug.ShouldStop(1024);
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
 BA.debugLineNum = 942;BA.debugLine="saveVSTNG";
Debug.ShouldStop(8192);
__ref.runClassMethod (b4a.example.settings.class, "_savevstng" /*RemoteObject*/ );
 if (true) break;

case 19:
//C
this.state = -1;
;
 BA.debugLineNum = 944;BA.debugLine="End Sub";
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
public static RemoteObject  _buildui(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("BuildUI (settings) ","settings",3,__ref.getField(false, "ba"),__ref,122);
if (RapidSub.canDelegate("buildui")) { return __ref.runUserSub(false, "settings","buildui", __ref);}
RemoteObject _pnlheader = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
RemoteObject _lblw1 = RemoteObject.createImmutable(0);
RemoteObject _lblw2 = RemoteObject.createImmutable(0);
RemoteObject _label5 = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
RemoteObject _label10 = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
RemoteObject _label12 = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
RemoteObject _pnlcontent = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
RemoteObject _cury = RemoteObject.createImmutable(0);
RemoteObject _pnlvstng = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
RemoteObject _label6 = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
RemoteObject _label7 = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
RemoteObject _label8 = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
RemoteObject _label9 = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
RemoteObject _pnltln = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
RemoteObject _label2 = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
RemoteObject _label15 = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
RemoteObject _label14 = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
 BA.debugLineNum = 122;BA.debugLine="Private Sub BuildUI";
Debug.ShouldStop(33554432);
 BA.debugLineNum = 123;BA.debugLine="dochange = False";
Debug.ShouldStop(67108864);
__ref.setField ("_dochange" /*RemoteObject*/ ,settings.__c.getField(true,"False"));
 BA.debugLineNum = 124;BA.debugLine="Root.Color = Colors.White";
Debug.ShouldStop(134217728);
__ref.getField(false,"_root" /*RemoteObject*/ ).runMethod(true,"setColor",settings.__c.getField(false,"Colors").getField(true,"White"));
 BA.debugLineNum = 127;BA.debugLine="Dim pnlHeader As Panel";
Debug.ShouldStop(1073741824);
_pnlheader = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");Debug.locals.put("pnlHeader", _pnlheader);
 BA.debugLineNum = 128;BA.debugLine="pnlHeader.Initialize(\"\")";
Debug.ShouldStop(-2147483648);
_pnlheader.runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 129;BA.debugLine="pnlHeader.Color = Colors.White";
Debug.ShouldStop(1);
_pnlheader.runVoidMethod ("setColor",settings.__c.getField(false,"Colors").getField(true,"White"));
 BA.debugLineNum = 130;BA.debugLine="Root.AddView(pnlHeader, 0, 0, 100%x, 80dip)";
Debug.ShouldStop(2);
__ref.getField(false,"_root" /*RemoteObject*/ ).runVoidMethod ("AddView",(Object)((_pnlheader.getObject())),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(settings.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 100)),__ref.getField(false, "ba"))),(Object)(settings.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 80)))));
 BA.debugLineNum = 132;BA.debugLine="Dim lblW1 As Int = 115dip";
Debug.ShouldStop(8);
_lblw1 = settings.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 115)));Debug.locals.put("lblw1", _lblw1);Debug.locals.put("lblW1", _lblw1);
 BA.debugLineNum = 133;BA.debugLine="Dim lblW2 As Int = 100%x - lblW1 - 45dip";
Debug.ShouldStop(16);
_lblw2 = RemoteObject.solve(new RemoteObject[] {settings.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 100)),__ref.getField(false, "ba")),_lblw1,settings.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 45)))}, "--",2, 1);Debug.locals.put("lblw2", _lblw2);Debug.locals.put("lblW2", _lblw2);
 BA.debugLineNum = 135;BA.debugLine="Dim Label5 As Label";
Debug.ShouldStop(64);
_label5 = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");Debug.locals.put("Label5", _label5);
 BA.debugLineNum = 136;BA.debugLine="Label5.Initialize(\"\")";
Debug.ShouldStop(128);
_label5.runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 137;BA.debugLine="Label5.Text = \"Verein:\"";
Debug.ShouldStop(256);
_label5.runMethod(true,"setText",BA.ObjectToCharSequence("Verein:"));
 BA.debugLineNum = 138;BA.debugLine="Label5.Typeface = Typeface.DEFAULT_BOLD";
Debug.ShouldStop(512);
_label5.runMethod(false,"setTypeface",settings.__c.getField(false,"Typeface").getField(false,"DEFAULT_BOLD"));
 BA.debugLineNum = 139;BA.debugLine="Label5.TextColor = Colors.Black";
Debug.ShouldStop(1024);
_label5.runMethod(true,"setTextColor",settings.__c.getField(false,"Colors").getField(true,"Black"));
 BA.debugLineNum = 140;BA.debugLine="Label5.Gravity = Gravity.RIGHT + Gravity.CENTER_V";
Debug.ShouldStop(2048);
_label5.runMethod(true,"setGravity",RemoteObject.solve(new RemoteObject[] {settings.__c.getField(false,"Gravity").getField(true,"RIGHT"),settings.__c.getField(false,"Gravity").getField(true,"CENTER_VERTICAL")}, "+",1, 1));
 BA.debugLineNum = 141;BA.debugLine="pnlHeader.AddView(Label5, 5dip, 4dip, lblW1, 24di";
Debug.ShouldStop(4096);
_pnlheader.runVoidMethod ("AddView",(Object)((_label5.getObject())),(Object)(settings.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 5)))),(Object)(settings.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 4)))),(Object)(_lblw1),(Object)(settings.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 24)))));
 BA.debugLineNum = 143;BA.debugLine="lblVerein.Initialize(\"\")";
Debug.ShouldStop(16384);
__ref.getField(false,"_lblverein" /*RemoteObject*/ ).runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 144;BA.debugLine="lblVerein.Text = \"- Vereinsbezeichnung -\"";
Debug.ShouldStop(32768);
__ref.getField(false,"_lblverein" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToCharSequence("- Vereinsbezeichnung -"));
 BA.debugLineNum = 145;BA.debugLine="lblVerein.Typeface = Typeface.DEFAULT_BOLD";
Debug.ShouldStop(65536);
__ref.getField(false,"_lblverein" /*RemoteObject*/ ).runMethod(false,"setTypeface",settings.__c.getField(false,"Typeface").getField(false,"DEFAULT_BOLD"));
 BA.debugLineNum = 146;BA.debugLine="lblVerein.TextColor = 0xFF16AA16";
Debug.ShouldStop(131072);
__ref.getField(false,"_lblverein" /*RemoteObject*/ ).runMethod(true,"setTextColor",BA.numberCast(int.class, ((int)0xff16aa16)));
 BA.debugLineNum = 147;BA.debugLine="lblVerein.Gravity = Gravity.LEFT + Gravity.CENTER";
Debug.ShouldStop(262144);
__ref.getField(false,"_lblverein" /*RemoteObject*/ ).runMethod(true,"setGravity",RemoteObject.solve(new RemoteObject[] {settings.__c.getField(false,"Gravity").getField(true,"LEFT"),settings.__c.getField(false,"Gravity").getField(true,"CENTER_VERTICAL")}, "+",1, 1));
 BA.debugLineNum = 148;BA.debugLine="pnlHeader.AddView(lblVerein, lblW1 + 8dip, 4dip,";
Debug.ShouldStop(524288);
_pnlheader.runVoidMethod ("AddView",(Object)((__ref.getField(false,"_lblverein" /*RemoteObject*/ ).getObject())),(Object)(RemoteObject.solve(new RemoteObject[] {_lblw1,settings.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 8)))}, "+",1, 1)),(Object)(settings.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 4)))),(Object)(_lblw2),(Object)(settings.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 24)))));
 BA.debugLineNum = 150;BA.debugLine="Dim Label10 As Label";
Debug.ShouldStop(2097152);
_label10 = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");Debug.locals.put("Label10", _label10);
 BA.debugLineNum = 151;BA.debugLine="Label10.Initialize(\"\")";
Debug.ShouldStop(4194304);
_label10.runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 152;BA.debugLine="Label10.Text = \"Veranstaltung:\"";
Debug.ShouldStop(8388608);
_label10.runMethod(true,"setText",BA.ObjectToCharSequence("Veranstaltung:"));
 BA.debugLineNum = 153;BA.debugLine="Label10.Typeface = Typeface.DEFAULT_BOLD";
Debug.ShouldStop(16777216);
_label10.runMethod(false,"setTypeface",settings.__c.getField(false,"Typeface").getField(false,"DEFAULT_BOLD"));
 BA.debugLineNum = 154;BA.debugLine="Label10.TextColor = Colors.Black";
Debug.ShouldStop(33554432);
_label10.runMethod(true,"setTextColor",settings.__c.getField(false,"Colors").getField(true,"Black"));
 BA.debugLineNum = 155;BA.debugLine="Label10.Gravity = Gravity.RIGHT + Gravity.CENTER_";
Debug.ShouldStop(67108864);
_label10.runMethod(true,"setGravity",RemoteObject.solve(new RemoteObject[] {settings.__c.getField(false,"Gravity").getField(true,"RIGHT"),settings.__c.getField(false,"Gravity").getField(true,"CENTER_VERTICAL")}, "+",1, 1));
 BA.debugLineNum = 156;BA.debugLine="pnlHeader.AddView(Label10, 5dip, 28dip, lblW1, 24";
Debug.ShouldStop(134217728);
_pnlheader.runVoidMethod ("AddView",(Object)((_label10.getObject())),(Object)(settings.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 5)))),(Object)(settings.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 28)))),(Object)(_lblw1),(Object)(settings.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 24)))));
 BA.debugLineNum = 158;BA.debugLine="lblVeranstaltung.Initialize(\"\")";
Debug.ShouldStop(536870912);
__ref.getField(false,"_lblveranstaltung" /*RemoteObject*/ ).runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 159;BA.debugLine="lblVeranstaltung.Text = \"-Veranstaltung-\"";
Debug.ShouldStop(1073741824);
__ref.getField(false,"_lblveranstaltung" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToCharSequence("-Veranstaltung-"));
 BA.debugLineNum = 160;BA.debugLine="lblVeranstaltung.Typeface = Typeface.DEFAULT_BOLD";
Debug.ShouldStop(-2147483648);
__ref.getField(false,"_lblveranstaltung" /*RemoteObject*/ ).runMethod(false,"setTypeface",settings.__c.getField(false,"Typeface").getField(false,"DEFAULT_BOLD"));
 BA.debugLineNum = 161;BA.debugLine="lblVeranstaltung.TextColor = 0xFF3333FF";
Debug.ShouldStop(1);
__ref.getField(false,"_lblveranstaltung" /*RemoteObject*/ ).runMethod(true,"setTextColor",BA.numberCast(int.class, ((int)0xff3333ff)));
 BA.debugLineNum = 162;BA.debugLine="lblVeranstaltung.Gravity = Gravity.LEFT + Gravity";
Debug.ShouldStop(2);
__ref.getField(false,"_lblveranstaltung" /*RemoteObject*/ ).runMethod(true,"setGravity",RemoteObject.solve(new RemoteObject[] {settings.__c.getField(false,"Gravity").getField(true,"LEFT"),settings.__c.getField(false,"Gravity").getField(true,"CENTER_VERTICAL")}, "+",1, 1));
 BA.debugLineNum = 163;BA.debugLine="pnlHeader.AddView(lblVeranstaltung, lblW1 + 8dip,";
Debug.ShouldStop(4);
_pnlheader.runVoidMethod ("AddView",(Object)((__ref.getField(false,"_lblveranstaltung" /*RemoteObject*/ ).getObject())),(Object)(RemoteObject.solve(new RemoteObject[] {_lblw1,settings.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 8)))}, "+",1, 1)),(Object)(settings.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 28)))),(Object)(_lblw2),(Object)(settings.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 24)))));
 BA.debugLineNum = 165;BA.debugLine="Dim Label12 As Label";
Debug.ShouldStop(16);
_label12 = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");Debug.locals.put("Label12", _label12);
 BA.debugLineNum = 166;BA.debugLine="Label12.Initialize(\"\")";
Debug.ShouldStop(32);
_label12.runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 167;BA.debugLine="Label12.Text = \"Datum:\"";
Debug.ShouldStop(64);
_label12.runMethod(true,"setText",BA.ObjectToCharSequence("Datum:"));
 BA.debugLineNum = 168;BA.debugLine="Label12.Typeface = Typeface.DEFAULT_BOLD";
Debug.ShouldStop(128);
_label12.runMethod(false,"setTypeface",settings.__c.getField(false,"Typeface").getField(false,"DEFAULT_BOLD"));
 BA.debugLineNum = 169;BA.debugLine="Label12.TextColor = Colors.Black";
Debug.ShouldStop(256);
_label12.runMethod(true,"setTextColor",settings.__c.getField(false,"Colors").getField(true,"Black"));
 BA.debugLineNum = 170;BA.debugLine="Label12.Gravity = Gravity.RIGHT + Gravity.CENTER_";
Debug.ShouldStop(512);
_label12.runMethod(true,"setGravity",RemoteObject.solve(new RemoteObject[] {settings.__c.getField(false,"Gravity").getField(true,"RIGHT"),settings.__c.getField(false,"Gravity").getField(true,"CENTER_VERTICAL")}, "+",1, 1));
 BA.debugLineNum = 171;BA.debugLine="pnlHeader.AddView(Label12, 5dip, 52dip, lblW1, 24";
Debug.ShouldStop(1024);
_pnlheader.runVoidMethod ("AddView",(Object)((_label12.getObject())),(Object)(settings.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 5)))),(Object)(settings.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 52)))),(Object)(_lblw1),(Object)(settings.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 24)))));
 BA.debugLineNum = 173;BA.debugLine="lblDatum.Initialize(\"\")";
Debug.ShouldStop(4096);
__ref.getField(false,"_lbldatum" /*RemoteObject*/ ).runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 174;BA.debugLine="lblDatum.Text = \"- Datum -\"";
Debug.ShouldStop(8192);
__ref.getField(false,"_lbldatum" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToCharSequence("- Datum -"));
 BA.debugLineNum = 175;BA.debugLine="lblDatum.Typeface = Typeface.DEFAULT_BOLD";
Debug.ShouldStop(16384);
__ref.getField(false,"_lbldatum" /*RemoteObject*/ ).runMethod(false,"setTypeface",settings.__c.getField(false,"Typeface").getField(false,"DEFAULT_BOLD"));
 BA.debugLineNum = 176;BA.debugLine="lblDatum.TextColor = 0xFF3333FF";
Debug.ShouldStop(32768);
__ref.getField(false,"_lbldatum" /*RemoteObject*/ ).runMethod(true,"setTextColor",BA.numberCast(int.class, ((int)0xff3333ff)));
 BA.debugLineNum = 177;BA.debugLine="lblDatum.Gravity = Gravity.LEFT + Gravity.CENTER_";
Debug.ShouldStop(65536);
__ref.getField(false,"_lbldatum" /*RemoteObject*/ ).runMethod(true,"setGravity",RemoteObject.solve(new RemoteObject[] {settings.__c.getField(false,"Gravity").getField(true,"LEFT"),settings.__c.getField(false,"Gravity").getField(true,"CENTER_VERTICAL")}, "+",1, 1));
 BA.debugLineNum = 178;BA.debugLine="pnlHeader.AddView(lblDatum, lblW1 + 8dip, 52dip,";
Debug.ShouldStop(131072);
_pnlheader.runVoidMethod ("AddView",(Object)((__ref.getField(false,"_lbldatum" /*RemoteObject*/ ).getObject())),(Object)(RemoteObject.solve(new RemoteObject[] {_lblw1,settings.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 8)))}, "+",1, 1)),(Object)(settings.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 52)))),(Object)(_lblw2),(Object)(settings.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 24)))));
 BA.debugLineNum = 180;BA.debugLine="btnBack.Initialize(\"btnBack\")";
Debug.ShouldStop(524288);
__ref.getField(false,"_btnback" /*RemoteObject*/ ).runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("btnBack")));
 BA.debugLineNum = 181;BA.debugLine="SetButtonImageSafe(btnBack, \"Arrows-Back.png\", \"◀";
Debug.ShouldStop(1048576);
__ref.runClassMethod (b4a.example.settings.class, "_setbuttonimagesafe" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_btnback" /*RemoteObject*/ )),(Object)(BA.ObjectToString("Arrows-Back.png")),(Object)(RemoteObject.createImmutable("◀")));
 BA.debugLineNum = 182;BA.debugLine="pnlHeader.AddView(btnBack, 100%x - 36dip, 26dip,";
Debug.ShouldStop(2097152);
_pnlheader.runVoidMethod ("AddView",(Object)((__ref.getField(false,"_btnback" /*RemoteObject*/ ).getObject())),(Object)(RemoteObject.solve(new RemoteObject[] {settings.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 100)),__ref.getField(false, "ba")),settings.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 36)))}, "-",1, 1)),(Object)(settings.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 26)))),(Object)(settings.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 28)))),(Object)(settings.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 28)))));
 BA.debugLineNum = 185;BA.debugLine="svMain.Initialize(950dip)";
Debug.ShouldStop(16777216);
__ref.getField(false,"_svmain" /*RemoteObject*/ ).runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(settings.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 950)))));
 BA.debugLineNum = 186;BA.debugLine="Root.AddView(svMain, 0, 80dip, 100%x, 100%y - 80d";
Debug.ShouldStop(33554432);
__ref.getField(false,"_root" /*RemoteObject*/ ).runVoidMethod ("AddView",(Object)((__ref.getField(false,"_svmain" /*RemoteObject*/ ).getObject())),(Object)(BA.numberCast(int.class, 0)),(Object)(settings.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 80)))),(Object)(settings.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 100)),__ref.getField(false, "ba"))),(Object)(RemoteObject.solve(new RemoteObject[] {settings.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 100)),__ref.getField(false, "ba")),settings.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 80)))}, "-",1, 1)));
 BA.debugLineNum = 187;BA.debugLine="Dim pnlContent As Panel = svMain.Panel";
Debug.ShouldStop(67108864);
_pnlcontent = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
_pnlcontent = __ref.getField(false,"_svmain" /*RemoteObject*/ ).runMethod(false,"getPanel");Debug.locals.put("pnlcontent", _pnlcontent);Debug.locals.put("pnlContent", _pnlcontent);
 BA.debugLineNum = 188;BA.debugLine="pnlContent.Color = Colors.White";
Debug.ShouldStop(134217728);
_pnlcontent.runVoidMethod ("setColor",settings.__c.getField(false,"Colors").getField(true,"White"));
 BA.debugLineNum = 190;BA.debugLine="Dim curY As Int = 0";
Debug.ShouldStop(536870912);
_cury = BA.numberCast(int.class, 0);Debug.locals.put("cury", _cury);Debug.locals.put("curY", _cury);
 BA.debugLineNum = 193;BA.debugLine="AddDivider(pnlContent, curY, 12dip, 0xFFEEFFEE)";
Debug.ShouldStop(1);
__ref.runClassMethod (b4a.example.settings.class, "_adddivider" /*RemoteObject*/ ,(Object)(_pnlcontent),(Object)(_cury),(Object)(settings.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 12)))),(Object)(BA.numberCast(int.class, ((int)0xffeeffee))));
 BA.debugLineNum = 194;BA.debugLine="curY = curY + 12dip";
Debug.ShouldStop(2);
_cury = RemoteObject.solve(new RemoteObject[] {_cury,settings.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 12)))}, "+",1, 1);Debug.locals.put("curY", _cury);
 BA.debugLineNum = 197;BA.debugLine="Dim pnlVstng As Panel";
Debug.ShouldStop(16);
_pnlvstng = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");Debug.locals.put("pnlVstng", _pnlvstng);
 BA.debugLineNum = 198;BA.debugLine="pnlVstng.Initialize(\"\")";
Debug.ShouldStop(32);
_pnlvstng.runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 199;BA.debugLine="pnlVstng.Color = 0xAAEEFFEE";
Debug.ShouldStop(64);
_pnlvstng.runVoidMethod ("setColor",BA.numberCast(int.class, ((int)0xaaeeffee)));
 BA.debugLineNum = 200;BA.debugLine="pnlContent.AddView(pnlVstng, 0, curY, 100%x, 225d";
Debug.ShouldStop(128);
_pnlcontent.runVoidMethod ("AddView",(Object)((_pnlvstng.getObject())),(Object)(BA.numberCast(int.class, 0)),(Object)(_cury),(Object)(settings.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 100)),__ref.getField(false, "ba"))),(Object)(settings.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 225)))));
 BA.debugLineNum = 202;BA.debugLine="Dim Label6 As Label";
Debug.ShouldStop(512);
_label6 = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");Debug.locals.put("Label6", _label6);
 BA.debugLineNum = 203;BA.debugLine="Label6.Initialize(\"\")";
Debug.ShouldStop(1024);
_label6.runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 204;BA.debugLine="Label6.Text = \"Veranstaltung\"";
Debug.ShouldStop(2048);
_label6.runMethod(true,"setText",BA.ObjectToCharSequence("Veranstaltung"));
 BA.debugLineNum = 205;BA.debugLine="Label6.TextSize = 18";
Debug.ShouldStop(4096);
_label6.runMethod(true,"setTextSize",BA.numberCast(float.class, 18));
 BA.debugLineNum = 206;BA.debugLine="Label6.Typeface = Typeface.DEFAULT_BOLD";
Debug.ShouldStop(8192);
_label6.runMethod(false,"setTypeface",settings.__c.getField(false,"Typeface").getField(false,"DEFAULT_BOLD"));
 BA.debugLineNum = 207;BA.debugLine="Label6.TextColor = 0xFF16AA16";
Debug.ShouldStop(16384);
_label6.runMethod(true,"setTextColor",BA.numberCast(int.class, ((int)0xff16aa16)));
 BA.debugLineNum = 208;BA.debugLine="Label6.Gravity = Gravity.CENTER_VERTICAL";
Debug.ShouldStop(32768);
_label6.runMethod(true,"setGravity",settings.__c.getField(false,"Gravity").getField(true,"CENTER_VERTICAL"));
 BA.debugLineNum = 209;BA.debugLine="pnlVstng.AddView(Label6, 15dip, 8dip, 140dip, 28d";
Debug.ShouldStop(65536);
_pnlvstng.runVoidMethod ("AddView",(Object)((_label6.getObject())),(Object)(settings.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 15)))),(Object)(settings.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 8)))),(Object)(settings.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 140)))),(Object)(settings.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 28)))));
 BA.debugLineNum = 211;BA.debugLine="lblClosed.Initialize(\"\")";
Debug.ShouldStop(262144);
__ref.getField(false,"_lblclosed" /*RemoteObject*/ ).runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 212;BA.debugLine="lblClosed.Text = \"geschlossen\"";
Debug.ShouldStop(524288);
__ref.getField(false,"_lblclosed" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToCharSequence("geschlossen"));
 BA.debugLineNum = 213;BA.debugLine="lblClosed.Typeface = Typeface.DEFAULT_BOLD";
Debug.ShouldStop(1048576);
__ref.getField(false,"_lblclosed" /*RemoteObject*/ ).runMethod(false,"setTypeface",settings.__c.getField(false,"Typeface").getField(false,"DEFAULT_BOLD"));
 BA.debugLineNum = 214;BA.debugLine="lblClosed.TextColor = Colors.Red";
Debug.ShouldStop(2097152);
__ref.getField(false,"_lblclosed" /*RemoteObject*/ ).runMethod(true,"setTextColor",settings.__c.getField(false,"Colors").getField(true,"Red"));
 BA.debugLineNum = 215;BA.debugLine="lblClosed.Gravity = Gravity.CENTER_VERTICAL";
Debug.ShouldStop(4194304);
__ref.getField(false,"_lblclosed" /*RemoteObject*/ ).runMethod(true,"setGravity",settings.__c.getField(false,"Gravity").getField(true,"CENTER_VERTICAL"));
 BA.debugLineNum = 216;BA.debugLine="lblClosed.Visible = False";
Debug.ShouldStop(8388608);
__ref.getField(false,"_lblclosed" /*RemoteObject*/ ).runMethod(true,"setVisible",settings.__c.getField(true,"False"));
 BA.debugLineNum = 217;BA.debugLine="pnlVstng.AddView(lblClosed, 160dip, 8dip, 120dip,";
Debug.ShouldStop(16777216);
_pnlvstng.runVoidMethod ("AddView",(Object)((__ref.getField(false,"_lblclosed" /*RemoteObject*/ ).getObject())),(Object)(settings.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 160)))),(Object)(settings.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 8)))),(Object)(settings.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 120)))),(Object)(settings.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 28)))));
 BA.debugLineNum = 220;BA.debugLine="Dim Label7 As Label";
Debug.ShouldStop(134217728);
_label7 = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");Debug.locals.put("Label7", _label7);
 BA.debugLineNum = 221;BA.debugLine="Label7.Initialize(\"\")";
Debug.ShouldStop(268435456);
_label7.runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 222;BA.debugLine="Label7.Text = \"Datum:\"";
Debug.ShouldStop(536870912);
_label7.runMethod(true,"setText",BA.ObjectToCharSequence("Datum:"));
 BA.debugLineNum = 223;BA.debugLine="Label7.Typeface = Typeface.DEFAULT_BOLD";
Debug.ShouldStop(1073741824);
_label7.runMethod(false,"setTypeface",settings.__c.getField(false,"Typeface").getField(false,"DEFAULT_BOLD"));
 BA.debugLineNum = 224;BA.debugLine="Label7.TextColor = Colors.Black";
Debug.ShouldStop(-2147483648);
_label7.runMethod(true,"setTextColor",settings.__c.getField(false,"Colors").getField(true,"Black"));
 BA.debugLineNum = 225;BA.debugLine="Label7.Gravity = Gravity.RIGHT + Gravity.CENTER_V";
Debug.ShouldStop(1);
_label7.runMethod(true,"setGravity",RemoteObject.solve(new RemoteObject[] {settings.__c.getField(false,"Gravity").getField(true,"RIGHT"),settings.__c.getField(false,"Gravity").getField(true,"CENTER_VERTICAL")}, "+",1, 1));
 BA.debugLineNum = 226;BA.debugLine="pnlVstng.AddView(Label7, 5dip, 44dip, 115dip, 40d";
Debug.ShouldStop(2);
_pnlvstng.runVoidMethod ("AddView",(Object)((_label7.getObject())),(Object)(settings.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 5)))),(Object)(settings.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 44)))),(Object)(settings.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 115)))),(Object)(settings.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 40)))));
 BA.debugLineNum = 228;BA.debugLine="dprDatum.Initialize(\"dprDatum\")";
Debug.ShouldStop(8);
__ref.getField(false,"_dprdatum" /*RemoteObject*/ ).runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("dprDatum")));
 BA.debugLineNum = 229;BA.debugLine="dprDatum.Text = \"Datum\"";
Debug.ShouldStop(16);
__ref.getField(false,"_dprdatum" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToCharSequence("Datum"));
 BA.debugLineNum = 230;BA.debugLine="dprDatum.Typeface = Typeface.DEFAULT_BOLD";
Debug.ShouldStop(32);
__ref.getField(false,"_dprdatum" /*RemoteObject*/ ).runMethod(false,"setTypeface",settings.__c.getField(false,"Typeface").getField(false,"DEFAULT_BOLD"));
 BA.debugLineNum = 231;BA.debugLine="dprDatum.TextColor = 0xFF16AA16";
Debug.ShouldStop(64);
__ref.getField(false,"_dprdatum" /*RemoteObject*/ ).runMethod(true,"setTextColor",BA.numberCast(int.class, ((int)0xff16aa16)));
 BA.debugLineNum = 232;BA.debugLine="pnlVstng.AddView(dprDatum, 128dip, 44dip, 115dip,";
Debug.ShouldStop(128);
_pnlvstng.runVoidMethod ("AddView",(Object)((__ref.getField(false,"_dprdatum" /*RemoteObject*/ ).getObject())),(Object)(settings.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 128)))),(Object)(settings.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 44)))),(Object)(settings.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 115)))),(Object)(settings.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 40)))));
 BA.debugLineNum = 234;BA.debugLine="btnAuswahl.Initialize(\"btnAuswahl\")";
Debug.ShouldStop(512);
__ref.getField(false,"_btnauswahl" /*RemoteObject*/ ).runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("btnAuswahl")));
 BA.debugLineNum = 235;BA.debugLine="btnAuswahl.Text = \"Auswahl\"";
Debug.ShouldStop(1024);
__ref.getField(false,"_btnauswahl" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToCharSequence("Auswahl"));
 BA.debugLineNum = 236;BA.debugLine="btnAuswahl.TextSize = 14";
Debug.ShouldStop(2048);
__ref.getField(false,"_btnauswahl" /*RemoteObject*/ ).runMethod(true,"setTextSize",BA.numberCast(float.class, 14));
 BA.debugLineNum = 237;BA.debugLine="btnAuswahl.Typeface = Typeface.DEFAULT_BOLD";
Debug.ShouldStop(4096);
__ref.getField(false,"_btnauswahl" /*RemoteObject*/ ).runMethod(false,"setTypeface",settings.__c.getField(false,"Typeface").getField(false,"DEFAULT_BOLD"));
 BA.debugLineNum = 238;BA.debugLine="btnAuswahl.TextColor = 0xFF3333FF";
Debug.ShouldStop(8192);
__ref.getField(false,"_btnauswahl" /*RemoteObject*/ ).runMethod(true,"setTextColor",BA.numberCast(int.class, ((int)0xff3333ff)));
 BA.debugLineNum = 239;BA.debugLine="pnlVstng.AddView(btnAuswahl, 100%x - 105dip, 44di";
Debug.ShouldStop(16384);
_pnlvstng.runVoidMethod ("AddView",(Object)((__ref.getField(false,"_btnauswahl" /*RemoteObject*/ ).getObject())),(Object)(RemoteObject.solve(new RemoteObject[] {settings.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 100)),__ref.getField(false, "ba")),settings.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 105)))}, "-",1, 1)),(Object)(settings.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 44)))),(Object)(settings.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 95)))),(Object)(settings.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 40)))));
 BA.debugLineNum = 242;BA.debugLine="Dim Label8 As Label";
Debug.ShouldStop(131072);
_label8 = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");Debug.locals.put("Label8", _label8);
 BA.debugLineNum = 243;BA.debugLine="Label8.Initialize(\"\")";
Debug.ShouldStop(262144);
_label8.runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 244;BA.debugLine="Label8.Text = \"Bezeichnung:\"";
Debug.ShouldStop(524288);
_label8.runMethod(true,"setText",BA.ObjectToCharSequence("Bezeichnung:"));
 BA.debugLineNum = 245;BA.debugLine="Label8.Typeface = Typeface.DEFAULT_BOLD";
Debug.ShouldStop(1048576);
_label8.runMethod(false,"setTypeface",settings.__c.getField(false,"Typeface").getField(false,"DEFAULT_BOLD"));
 BA.debugLineNum = 246;BA.debugLine="Label8.TextColor = Colors.Black";
Debug.ShouldStop(2097152);
_label8.runMethod(true,"setTextColor",settings.__c.getField(false,"Colors").getField(true,"Black"));
 BA.debugLineNum = 247;BA.debugLine="Label8.Gravity = Gravity.RIGHT + Gravity.CENTER_V";
Debug.ShouldStop(4194304);
_label8.runMethod(true,"setGravity",RemoteObject.solve(new RemoteObject[] {settings.__c.getField(false,"Gravity").getField(true,"RIGHT"),settings.__c.getField(false,"Gravity").getField(true,"CENTER_VERTICAL")}, "+",1, 1));
 BA.debugLineNum = 248;BA.debugLine="pnlVstng.AddView(Label8, 5dip, 90dip, 115dip, 42d";
Debug.ShouldStop(8388608);
_pnlvstng.runVoidMethod ("AddView",(Object)((_label8.getObject())),(Object)(settings.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 5)))),(Object)(settings.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 90)))),(Object)(settings.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 115)))),(Object)(settings.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 42)))));
 BA.debugLineNum = 251;BA.debugLine="tbxVeranstaltung.Initialize(\"\")";
Debug.ShouldStop(67108864);
__ref.getField(false,"_tbxveranstaltung" /*RemoteObject*/ ).runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 252;BA.debugLine="tbxVeranstaltung.TextSize = 16";
Debug.ShouldStop(134217728);
__ref.getField(false,"_tbxveranstaltung" /*RemoteObject*/ ).runMethod(true,"setTextSize",BA.numberCast(float.class, 16));
 BA.debugLineNum = 253;BA.debugLine="tbxVeranstaltung.Typeface = Typeface.DEFAULT_BOLD";
Debug.ShouldStop(268435456);
__ref.getField(false,"_tbxveranstaltung" /*RemoteObject*/ ).runMethod(false,"setTypeface",settings.__c.getField(false,"Typeface").getField(false,"DEFAULT_BOLD"));
 BA.debugLineNum = 254;BA.debugLine="tbxVeranstaltung.TextColor = 0xFF16AA16";
Debug.ShouldStop(536870912);
__ref.getField(false,"_tbxveranstaltung" /*RemoteObject*/ ).runMethod(true,"setTextColor",BA.numberCast(int.class, ((int)0xff16aa16)));
 BA.debugLineNum = 255;BA.debugLine="tbxVeranstaltung.SingleLine = True";
Debug.ShouldStop(1073741824);
__ref.getField(false,"_tbxveranstaltung" /*RemoteObject*/ ).runVoidMethod ("setSingleLine",settings.__c.getField(true,"True"));
 BA.debugLineNum = 256;BA.debugLine="pnlVstng.AddView(tbxVeranstaltung, 128dip, 90dip,";
Debug.ShouldStop(-2147483648);
_pnlvstng.runVoidMethod ("AddView",(Object)((__ref.getField(false,"_tbxveranstaltung" /*RemoteObject*/ ).getObject())),(Object)(settings.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 128)))),(Object)(settings.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 90)))),(Object)(RemoteObject.solve(new RemoteObject[] {settings.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 100)),__ref.getField(false, "ba")),settings.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 138)))}, "-",1, 1)),(Object)(settings.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 42)))));
 BA.debugLineNum = 259;BA.debugLine="Dim Label9 As Label";
Debug.ShouldStop(4);
_label9 = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");Debug.locals.put("Label9", _label9);
 BA.debugLineNum = 260;BA.debugLine="Label9.Initialize(\"\")";
Debug.ShouldStop(8);
_label9.runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 261;BA.debugLine="Label9.Text = \"Plätze:\"";
Debug.ShouldStop(16);
_label9.runMethod(true,"setText",BA.ObjectToCharSequence("Plätze:"));
 BA.debugLineNum = 262;BA.debugLine="Label9.Typeface = Typeface.DEFAULT_BOLD";
Debug.ShouldStop(32);
_label9.runMethod(false,"setTypeface",settings.__c.getField(false,"Typeface").getField(false,"DEFAULT_BOLD"));
 BA.debugLineNum = 263;BA.debugLine="Label9.TextColor = Colors.Black";
Debug.ShouldStop(64);
_label9.runMethod(true,"setTextColor",settings.__c.getField(false,"Colors").getField(true,"Black"));
 BA.debugLineNum = 264;BA.debugLine="Label9.Gravity = Gravity.RIGHT + Gravity.CENTER_V";
Debug.ShouldStop(128);
_label9.runMethod(true,"setGravity",RemoteObject.solve(new RemoteObject[] {settings.__c.getField(false,"Gravity").getField(true,"RIGHT"),settings.__c.getField(false,"Gravity").getField(true,"CENTER_VERTICAL")}, "+",1, 1));
 BA.debugLineNum = 265;BA.debugLine="pnlVstng.AddView(Label9, 5dip, 138dip, 115dip, 42";
Debug.ShouldStop(256);
_pnlvstng.runVoidMethod ("AddView",(Object)((_label9.getObject())),(Object)(settings.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 5)))),(Object)(settings.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 138)))),(Object)(settings.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 115)))),(Object)(settings.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 42)))));
 BA.debugLineNum = 267;BA.debugLine="tbxAnzahl.Initialize(\"tbxAnzahl\")";
Debug.ShouldStop(1024);
__ref.getField(false,"_tbxanzahl" /*RemoteObject*/ ).runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("tbxAnzahl")));
 BA.debugLineNum = 268;BA.debugLine="tbxAnzahl.TextSize = 16";
Debug.ShouldStop(2048);
__ref.getField(false,"_tbxanzahl" /*RemoteObject*/ ).runMethod(true,"setTextSize",BA.numberCast(float.class, 16));
 BA.debugLineNum = 269;BA.debugLine="tbxAnzahl.Typeface = Typeface.DEFAULT_BOLD";
Debug.ShouldStop(4096);
__ref.getField(false,"_tbxanzahl" /*RemoteObject*/ ).runMethod(false,"setTypeface",settings.__c.getField(false,"Typeface").getField(false,"DEFAULT_BOLD"));
 BA.debugLineNum = 270;BA.debugLine="tbxAnzahl.TextColor = 0xFF16AA16";
Debug.ShouldStop(8192);
__ref.getField(false,"_tbxanzahl" /*RemoteObject*/ ).runMethod(true,"setTextColor",BA.numberCast(int.class, ((int)0xff16aa16)));
 BA.debugLineNum = 271;BA.debugLine="tbxAnzahl.Gravity = Gravity.RIGHT + Gravity.CENTE";
Debug.ShouldStop(16384);
__ref.getField(false,"_tbxanzahl" /*RemoteObject*/ ).runMethod(true,"setGravity",RemoteObject.solve(new RemoteObject[] {settings.__c.getField(false,"Gravity").getField(true,"RIGHT"),settings.__c.getField(false,"Gravity").getField(true,"CENTER_VERTICAL")}, "+",1, 1));
 BA.debugLineNum = 272;BA.debugLine="tbxAnzahl.InputType = tbxAnzahl.INPUT_TYPE_NUMBER";
Debug.ShouldStop(32768);
__ref.getField(false,"_tbxanzahl" /*RemoteObject*/ ).runMethod(true,"setInputType",__ref.getField(false,"_tbxanzahl" /*RemoteObject*/ ).getField(true,"INPUT_TYPE_NUMBERS"));
 BA.debugLineNum = 273;BA.debugLine="tbxAnzahl.SingleLine = True";
Debug.ShouldStop(65536);
__ref.getField(false,"_tbxanzahl" /*RemoteObject*/ ).runVoidMethod ("setSingleLine",settings.__c.getField(true,"True"));
 BA.debugLineNum = 274;BA.debugLine="pnlVstng.AddView(tbxAnzahl, 128dip, 138dip, 100di";
Debug.ShouldStop(131072);
_pnlvstng.runVoidMethod ("AddView",(Object)((__ref.getField(false,"_tbxanzahl" /*RemoteObject*/ ).getObject())),(Object)(settings.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 128)))),(Object)(settings.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 138)))),(Object)(settings.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 100)))),(Object)(settings.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 42)))));
 BA.debugLineNum = 277;BA.debugLine="btnVerstgDelete.Initialize(\"btnVerstgDelete\")";
Debug.ShouldStop(1048576);
__ref.getField(false,"_btnverstgdelete" /*RemoteObject*/ ).runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("btnVerstgDelete")));
 BA.debugLineNum = 278;BA.debugLine="btnVerstgDelete.Text = \"Löschen\"";
Debug.ShouldStop(2097152);
__ref.getField(false,"_btnverstgdelete" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToCharSequence("Löschen"));
 BA.debugLineNum = 279;BA.debugLine="btnVerstgDelete.Typeface = Typeface.DEFAULT_BOLD";
Debug.ShouldStop(4194304);
__ref.getField(false,"_btnverstgdelete" /*RemoteObject*/ ).runMethod(false,"setTypeface",settings.__c.getField(false,"Typeface").getField(false,"DEFAULT_BOLD"));
 BA.debugLineNum = 280;BA.debugLine="btnVerstgDelete.TextColor = 0xFF16AA16";
Debug.ShouldStop(8388608);
__ref.getField(false,"_btnverstgdelete" /*RemoteObject*/ ).runMethod(true,"setTextColor",BA.numberCast(int.class, ((int)0xff16aa16)));
 BA.debugLineNum = 281;BA.debugLine="pnlVstng.AddView(btnVerstgDelete, 25dip, 184dip,";
Debug.ShouldStop(16777216);
_pnlvstng.runVoidMethod ("AddView",(Object)((__ref.getField(false,"_btnverstgdelete" /*RemoteObject*/ ).getObject())),(Object)(settings.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 25)))),(Object)(settings.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 184)))),(Object)(settings.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 115)))),(Object)(settings.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 36)))));
 BA.debugLineNum = 283;BA.debugLine="btnVerstgSpeichern.Initialize(\"btnVerstgSpeichern";
Debug.ShouldStop(67108864);
__ref.getField(false,"_btnverstgspeichern" /*RemoteObject*/ ).runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("btnVerstgSpeichern")));
 BA.debugLineNum = 284;BA.debugLine="btnVerstgSpeichern.Text = \"Speichern\"";
Debug.ShouldStop(134217728);
__ref.getField(false,"_btnverstgspeichern" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToCharSequence("Speichern"));
 BA.debugLineNum = 285;BA.debugLine="btnVerstgSpeichern.Typeface = Typeface.DEFAULT_BO";
Debug.ShouldStop(268435456);
__ref.getField(false,"_btnverstgspeichern" /*RemoteObject*/ ).runMethod(false,"setTypeface",settings.__c.getField(false,"Typeface").getField(false,"DEFAULT_BOLD"));
 BA.debugLineNum = 286;BA.debugLine="btnVerstgSpeichern.TextColor = 0xFF16AA16";
Debug.ShouldStop(536870912);
__ref.getField(false,"_btnverstgspeichern" /*RemoteObject*/ ).runMethod(true,"setTextColor",BA.numberCast(int.class, ((int)0xff16aa16)));
 BA.debugLineNum = 287;BA.debugLine="pnlVstng.AddView(btnVerstgSpeichern, 100%x - 140d";
Debug.ShouldStop(1073741824);
_pnlvstng.runVoidMethod ("AddView",(Object)((__ref.getField(false,"_btnverstgspeichern" /*RemoteObject*/ ).getObject())),(Object)(RemoteObject.solve(new RemoteObject[] {settings.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 100)),__ref.getField(false, "ba")),settings.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 140)))}, "-",1, 1)),(Object)(settings.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 184)))),(Object)(settings.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 115)))),(Object)(settings.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 36)))));
 BA.debugLineNum = 289;BA.debugLine="curY = curY + 225dip";
Debug.ShouldStop(1);
_cury = RemoteObject.solve(new RemoteObject[] {_cury,settings.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 225)))}, "+",1, 1);Debug.locals.put("curY", _cury);
 BA.debugLineNum = 290;BA.debugLine="AddDivider(pnlContent, curY, 12dip, 0xFFEEFFEE)";
Debug.ShouldStop(2);
__ref.runClassMethod (b4a.example.settings.class, "_adddivider" /*RemoteObject*/ ,(Object)(_pnlcontent),(Object)(_cury),(Object)(settings.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 12)))),(Object)(BA.numberCast(int.class, ((int)0xffeeffee))));
 BA.debugLineNum = 291;BA.debugLine="curY = curY + 12dip";
Debug.ShouldStop(4);
_cury = RemoteObject.solve(new RemoteObject[] {_cury,settings.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 12)))}, "+",1, 1);Debug.locals.put("curY", _cury);
 BA.debugLineNum = 298;BA.debugLine="lstVeranstaltungen.Initialize(\"lstVeranstaltungen";
Debug.ShouldStop(512);
__ref.getField(false,"_lstveranstaltungen" /*RemoteObject*/ ).runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("lstVeranstaltungen")));
 BA.debugLineNum = 299;BA.debugLine="lstVeranstaltungen.SingleLineLayout.Label.TextCol";
Debug.ShouldStop(1024);
__ref.getField(false,"_lstveranstaltungen" /*RemoteObject*/ ).runMethod(false,"getSingleLineLayout").getField(false,"Label").runMethod(true,"setTextColor",BA.numberCast(int.class, ((int)0xff16aa16)));
 BA.debugLineNum = 300;BA.debugLine="lstVeranstaltungen.SingleLineLayout.Label.TextSiz";
Debug.ShouldStop(2048);
__ref.getField(false,"_lstveranstaltungen" /*RemoteObject*/ ).runMethod(false,"getSingleLineLayout").getField(false,"Label").runMethod(true,"setTextSize",BA.numberCast(float.class, 16));
 BA.debugLineNum = 301;BA.debugLine="pnlContent.AddView(lstVeranstaltungen, 0, curY, 1";
Debug.ShouldStop(4096);
_pnlcontent.runVoidMethod ("AddView",(Object)((__ref.getField(false,"_lstveranstaltungen" /*RemoteObject*/ ).getObject())),(Object)(BA.numberCast(int.class, 0)),(Object)(_cury),(Object)(settings.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 100)),__ref.getField(false, "ba"))),(Object)(settings.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 220)))));
 BA.debugLineNum = 302;BA.debugLine="curY = curY + 220dip";
Debug.ShouldStop(8192);
_cury = RemoteObject.solve(new RemoteObject[] {_cury,settings.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 220)))}, "+",1, 1);Debug.locals.put("curY", _cury);
 BA.debugLineNum = 304;BA.debugLine="AddDivider(pnlContent, curY, 12dip, 0xFFEEFFEE)";
Debug.ShouldStop(32768);
__ref.runClassMethod (b4a.example.settings.class, "_adddivider" /*RemoteObject*/ ,(Object)(_pnlcontent),(Object)(_cury),(Object)(settings.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 12)))),(Object)(BA.numberCast(int.class, ((int)0xffeeffee))));
 BA.debugLineNum = 305;BA.debugLine="curY = curY + 12dip";
Debug.ShouldStop(65536);
_cury = RemoteObject.solve(new RemoteObject[] {_cury,settings.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 12)))}, "+",1, 1);Debug.locals.put("curY", _cury);
 BA.debugLineNum = 308;BA.debugLine="Dim pnlTln As Panel";
Debug.ShouldStop(524288);
_pnltln = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");Debug.locals.put("pnlTln", _pnltln);
 BA.debugLineNum = 309;BA.debugLine="pnlTln.Initialize(\"\")";
Debug.ShouldStop(1048576);
_pnltln.runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 310;BA.debugLine="pnlTln.Color = 0xDDEEFFEE";
Debug.ShouldStop(2097152);
_pnltln.runVoidMethod ("setColor",BA.numberCast(int.class, ((int)0xddeeffee)));
 BA.debugLineNum = 311;BA.debugLine="pnlContent.AddView(pnlTln, 0, curY, 100%x, 145dip";
Debug.ShouldStop(4194304);
_pnlcontent.runVoidMethod ("AddView",(Object)((_pnltln.getObject())),(Object)(BA.numberCast(int.class, 0)),(Object)(_cury),(Object)(settings.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 100)),__ref.getField(false, "ba"))),(Object)(settings.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 145)))));
 BA.debugLineNum = 313;BA.debugLine="Dim Label2 As Label";
Debug.ShouldStop(16777216);
_label2 = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");Debug.locals.put("Label2", _label2);
 BA.debugLineNum = 314;BA.debugLine="Label2.Initialize(\"\")";
Debug.ShouldStop(33554432);
_label2.runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 315;BA.debugLine="Label2.Text = \"Teilnehmer\"";
Debug.ShouldStop(67108864);
_label2.runMethod(true,"setText",BA.ObjectToCharSequence("Teilnehmer"));
 BA.debugLineNum = 316;BA.debugLine="Label2.TextSize = 18";
Debug.ShouldStop(134217728);
_label2.runMethod(true,"setTextSize",BA.numberCast(float.class, 18));
 BA.debugLineNum = 317;BA.debugLine="Label2.Typeface = Typeface.DEFAULT_BOLD";
Debug.ShouldStop(268435456);
_label2.runMethod(false,"setTypeface",settings.__c.getField(false,"Typeface").getField(false,"DEFAULT_BOLD"));
 BA.debugLineNum = 318;BA.debugLine="Label2.TextColor = 0xFF16AA16";
Debug.ShouldStop(536870912);
_label2.runMethod(true,"setTextColor",BA.numberCast(int.class, ((int)0xff16aa16)));
 BA.debugLineNum = 319;BA.debugLine="Label2.Gravity = Gravity.CENTER_VERTICAL";
Debug.ShouldStop(1073741824);
_label2.runMethod(true,"setGravity",settings.__c.getField(false,"Gravity").getField(true,"CENTER_VERTICAL"));
 BA.debugLineNum = 320;BA.debugLine="pnlTln.AddView(Label2, 15dip, 8dip, 110dip, 28dip";
Debug.ShouldStop(-2147483648);
_pnltln.runVoidMethod ("AddView",(Object)((_label2.getObject())),(Object)(settings.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 15)))),(Object)(settings.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 8)))),(Object)(settings.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 110)))),(Object)(settings.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 28)))));
 BA.debugLineNum = 322;BA.debugLine="Dim Label15 As Label";
Debug.ShouldStop(2);
_label15 = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");Debug.locals.put("Label15", _label15);
 BA.debugLineNum = 323;BA.debugLine="Label15.Initialize(\"\")";
Debug.ShouldStop(4);
_label15.runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 324;BA.debugLine="Label15.Text = \"(unabhängig von Veranstaltung)\"";
Debug.ShouldStop(8);
_label15.runMethod(true,"setText",BA.ObjectToCharSequence("(unabhängig von Veranstaltung)"));
 BA.debugLineNum = 325;BA.debugLine="Label15.TextSize = 10";
Debug.ShouldStop(16);
_label15.runMethod(true,"setTextSize",BA.numberCast(float.class, 10));
 BA.debugLineNum = 326;BA.debugLine="Label15.TextColor = Colors.DarkGray";
Debug.ShouldStop(32);
_label15.runMethod(true,"setTextColor",settings.__c.getField(false,"Colors").getField(true,"DarkGray"));
 BA.debugLineNum = 327;BA.debugLine="Label15.Gravity = Gravity.CENTER_VERTICAL";
Debug.ShouldStop(64);
_label15.runMethod(true,"setGravity",settings.__c.getField(false,"Gravity").getField(true,"CENTER_VERTICAL"));
 BA.debugLineNum = 328;BA.debugLine="pnlTln.AddView(Label15, 125dip, 8dip, 100%x - 135";
Debug.ShouldStop(128);
_pnltln.runVoidMethod ("AddView",(Object)((_label15.getObject())),(Object)(settings.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 125)))),(Object)(settings.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 8)))),(Object)(RemoteObject.solve(new RemoteObject[] {settings.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 100)),__ref.getField(false, "ba")),settings.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 135)))}, "-",1, 1)),(Object)(settings.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 28)))));
 BA.debugLineNum = 330;BA.debugLine="Dim Label14 As Label";
Debug.ShouldStop(512);
_label14 = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");Debug.locals.put("Label14", _label14);
 BA.debugLineNum = 331;BA.debugLine="Label14.Initialize(\"\")";
Debug.ShouldStop(1024);
_label14.runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 332;BA.debugLine="Label14.Text = \"Name, Vorname:\"";
Debug.ShouldStop(2048);
_label14.runMethod(true,"setText",BA.ObjectToCharSequence("Name, Vorname:"));
 BA.debugLineNum = 333;BA.debugLine="Label14.Typeface = Typeface.DEFAULT_BOLD";
Debug.ShouldStop(4096);
_label14.runMethod(false,"setTypeface",settings.__c.getField(false,"Typeface").getField(false,"DEFAULT_BOLD"));
 BA.debugLineNum = 334;BA.debugLine="Label14.TextColor = Colors.Black";
Debug.ShouldStop(8192);
_label14.runMethod(true,"setTextColor",settings.__c.getField(false,"Colors").getField(true,"Black"));
 BA.debugLineNum = 335;BA.debugLine="Label14.Gravity = Gravity.RIGHT + Gravity.CENTER_";
Debug.ShouldStop(16384);
_label14.runMethod(true,"setGravity",RemoteObject.solve(new RemoteObject[] {settings.__c.getField(false,"Gravity").getField(true,"RIGHT"),settings.__c.getField(false,"Gravity").getField(true,"CENTER_VERTICAL")}, "+",1, 1));
 BA.debugLineNum = 336;BA.debugLine="pnlTln.AddView(Label14, 5dip, 44dip, 115dip, 42di";
Debug.ShouldStop(32768);
_pnltln.runVoidMethod ("AddView",(Object)((_label14.getObject())),(Object)(settings.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 5)))),(Object)(settings.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 44)))),(Object)(settings.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 115)))),(Object)(settings.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 42)))));
 BA.debugLineNum = 338;BA.debugLine="tbxTeilnehmer.Initialize(\"tbxTeilnehmer\")";
Debug.ShouldStop(131072);
__ref.getField(false,"_tbxteilnehmer" /*RemoteObject*/ ).runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("tbxTeilnehmer")));
 BA.debugLineNum = 339;BA.debugLine="tbxTeilnehmer.TextSize = 16";
Debug.ShouldStop(262144);
__ref.getField(false,"_tbxteilnehmer" /*RemoteObject*/ ).runMethod(true,"setTextSize",BA.numberCast(float.class, 16));
 BA.debugLineNum = 340;BA.debugLine="tbxTeilnehmer.Typeface = Typeface.DEFAULT_BOLD";
Debug.ShouldStop(524288);
__ref.getField(false,"_tbxteilnehmer" /*RemoteObject*/ ).runMethod(false,"setTypeface",settings.__c.getField(false,"Typeface").getField(false,"DEFAULT_BOLD"));
 BA.debugLineNum = 341;BA.debugLine="tbxTeilnehmer.TextColor = 0xFF16AA16";
Debug.ShouldStop(1048576);
__ref.getField(false,"_tbxteilnehmer" /*RemoteObject*/ ).runMethod(true,"setTextColor",BA.numberCast(int.class, ((int)0xff16aa16)));
 BA.debugLineNum = 342;BA.debugLine="tbxTeilnehmer.SingleLine = True";
Debug.ShouldStop(2097152);
__ref.getField(false,"_tbxteilnehmer" /*RemoteObject*/ ).runVoidMethod ("setSingleLine",settings.__c.getField(true,"True"));
 BA.debugLineNum = 343;BA.debugLine="pnlTln.AddView(tbxTeilnehmer, 128dip, 44dip, 100%";
Debug.ShouldStop(4194304);
_pnltln.runVoidMethod ("AddView",(Object)((__ref.getField(false,"_tbxteilnehmer" /*RemoteObject*/ ).getObject())),(Object)(settings.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 128)))),(Object)(settings.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 44)))),(Object)(RemoteObject.solve(new RemoteObject[] {settings.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 100)),__ref.getField(false, "ba")),settings.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 138)))}, "-",1, 1)),(Object)(settings.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 42)))));
 BA.debugLineNum = 345;BA.debugLine="btnTLNDelete.Initialize(\"btnTLNDelete\")";
Debug.ShouldStop(16777216);
__ref.getField(false,"_btntlndelete" /*RemoteObject*/ ).runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("btnTLNDelete")));
 BA.debugLineNum = 346;BA.debugLine="btnTLNDelete.Text = \"Löschen\"";
Debug.ShouldStop(33554432);
__ref.getField(false,"_btntlndelete" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToCharSequence("Löschen"));
 BA.debugLineNum = 347;BA.debugLine="btnTLNDelete.Typeface = Typeface.DEFAULT_BOLD";
Debug.ShouldStop(67108864);
__ref.getField(false,"_btntlndelete" /*RemoteObject*/ ).runMethod(false,"setTypeface",settings.__c.getField(false,"Typeface").getField(false,"DEFAULT_BOLD"));
 BA.debugLineNum = 348;BA.debugLine="btnTLNDelete.TextColor = 0xFF16AA16";
Debug.ShouldStop(134217728);
__ref.getField(false,"_btntlndelete" /*RemoteObject*/ ).runMethod(true,"setTextColor",BA.numberCast(int.class, ((int)0xff16aa16)));
 BA.debugLineNum = 349;BA.debugLine="pnlTln.AddView(btnTLNDelete, 25dip, 98dip, 115dip";
Debug.ShouldStop(268435456);
_pnltln.runVoidMethod ("AddView",(Object)((__ref.getField(false,"_btntlndelete" /*RemoteObject*/ ).getObject())),(Object)(settings.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 25)))),(Object)(settings.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 98)))),(Object)(settings.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 115)))),(Object)(settings.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 36)))));
 BA.debugLineNum = 351;BA.debugLine="btnTLNSpeichern.Initialize(\"btnTLNSpeichern\")";
Debug.ShouldStop(1073741824);
__ref.getField(false,"_btntlnspeichern" /*RemoteObject*/ ).runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("btnTLNSpeichern")));
 BA.debugLineNum = 352;BA.debugLine="btnTLNSpeichern.Text = \"Speichern\"";
Debug.ShouldStop(-2147483648);
__ref.getField(false,"_btntlnspeichern" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToCharSequence("Speichern"));
 BA.debugLineNum = 353;BA.debugLine="btnTLNSpeichern.Typeface = Typeface.DEFAULT_BOLD";
Debug.ShouldStop(1);
__ref.getField(false,"_btntlnspeichern" /*RemoteObject*/ ).runMethod(false,"setTypeface",settings.__c.getField(false,"Typeface").getField(false,"DEFAULT_BOLD"));
 BA.debugLineNum = 354;BA.debugLine="btnTLNSpeichern.TextColor = 0xFF16AA16";
Debug.ShouldStop(2);
__ref.getField(false,"_btntlnspeichern" /*RemoteObject*/ ).runMethod(true,"setTextColor",BA.numberCast(int.class, ((int)0xff16aa16)));
 BA.debugLineNum = 355;BA.debugLine="pnlTln.AddView(btnTLNSpeichern, 100%x - 140dip, 9";
Debug.ShouldStop(4);
_pnltln.runVoidMethod ("AddView",(Object)((__ref.getField(false,"_btntlnspeichern" /*RemoteObject*/ ).getObject())),(Object)(RemoteObject.solve(new RemoteObject[] {settings.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 100)),__ref.getField(false, "ba")),settings.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 140)))}, "-",1, 1)),(Object)(settings.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 98)))),(Object)(settings.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 115)))),(Object)(settings.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 36)))));
 BA.debugLineNum = 357;BA.debugLine="curY = curY + 145dip";
Debug.ShouldStop(16);
_cury = RemoteObject.solve(new RemoteObject[] {_cury,settings.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 145)))}, "+",1, 1);Debug.locals.put("curY", _cury);
 BA.debugLineNum = 358;BA.debugLine="AddDivider(pnlContent, curY, 12dip, 0xFFEEFFEE)";
Debug.ShouldStop(32);
__ref.runClassMethod (b4a.example.settings.class, "_adddivider" /*RemoteObject*/ ,(Object)(_pnlcontent),(Object)(_cury),(Object)(settings.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 12)))),(Object)(BA.numberCast(int.class, ((int)0xffeeffee))));
 BA.debugLineNum = 359;BA.debugLine="curY = curY + 12dip";
Debug.ShouldStop(64);
_cury = RemoteObject.solve(new RemoteObject[] {_cury,settings.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 12)))}, "+",1, 1);Debug.locals.put("curY", _cury);
 BA.debugLineNum = 366;BA.debugLine="lstTeilnehmer.Initialize(\"lstTeilnehmer\")";
Debug.ShouldStop(8192);
__ref.getField(false,"_lstteilnehmer" /*RemoteObject*/ ).runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("lstTeilnehmer")));
 BA.debugLineNum = 367;BA.debugLine="lstTeilnehmer.SingleLineLayout.Label.TextColor =";
Debug.ShouldStop(16384);
__ref.getField(false,"_lstteilnehmer" /*RemoteObject*/ ).runMethod(false,"getSingleLineLayout").getField(false,"Label").runMethod(true,"setTextColor",BA.numberCast(int.class, ((int)0xff16aa16)));
 BA.debugLineNum = 368;BA.debugLine="lstTeilnehmer.SingleLineLayout.Label.TextSize = 1";
Debug.ShouldStop(32768);
__ref.getField(false,"_lstteilnehmer" /*RemoteObject*/ ).runMethod(false,"getSingleLineLayout").getField(false,"Label").runMethod(true,"setTextSize",BA.numberCast(float.class, 16));
 BA.debugLineNum = 369;BA.debugLine="pnlContent.AddView(lstTeilnehmer, 0, curY, 100%x,";
Debug.ShouldStop(65536);
_pnlcontent.runVoidMethod ("AddView",(Object)((__ref.getField(false,"_lstteilnehmer" /*RemoteObject*/ ).getObject())),(Object)(BA.numberCast(int.class, 0)),(Object)(_cury),(Object)(settings.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 100)),__ref.getField(false, "ba"))),(Object)(settings.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 260)))));
 BA.debugLineNum = 370;BA.debugLine="curY = curY + 270dip";
Debug.ShouldStop(131072);
_cury = RemoteObject.solve(new RemoteObject[] {_cury,settings.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 270)))}, "+",1, 1);Debug.locals.put("curY", _cury);
 BA.debugLineNum = 372;BA.debugLine="pnlContent.Height = curY";
Debug.ShouldStop(524288);
_pnlcontent.runMethod(true,"setHeight",_cury);
 BA.debugLineNum = 373;BA.debugLine="dochange = True";
Debug.ShouldStop(1048576);
__ref.setField ("_dochange" /*RemoteObject*/ ,settings.__c.getField(true,"True"));
 BA.debugLineNum = 374;BA.debugLine="End Sub";
Debug.ShouldStop(2097152);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _changeurl(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("changeURL (settings) ","settings",3,__ref.getField(false, "ba"),__ref,442);
if (RapidSub.canDelegate("changeurl")) { return __ref.runUserSub(false, "settings","changeurl", __ref);}
RemoteObject _url = RemoteObject.createImmutable("");
 BA.debugLineNum = 442;BA.debugLine="Private Sub changeURL";
Debug.ShouldStop(33554432);
 BA.debugLineNum = 443;BA.debugLine="Dim url As String = DBGet(\"VereinsID\", \"[...]\")";
Debug.ShouldStop(67108864);
_url = BA.ObjectToString(__ref.runClassMethod (b4a.example.settings.class, "_dbget" /*RemoteObject*/ ,(Object)(BA.ObjectToString("VereinsID")),(Object)((RemoteObject.createImmutable("[...]")))));Debug.locals.put("url", _url);Debug.locals.put("url", _url);
 BA.debugLineNum = 444;BA.debugLine="URLveranstaltungen = \"https://wertungslisten-app-";
Debug.ShouldStop(134217728);
__ref.setField ("_urlveranstaltungen" /*RemoteObject*/ ,RemoteObject.concat(RemoteObject.createImmutable("https://wertungslisten-app-default-rtdb.europe-west1.firebasedatabase.app/Vereine/"),_url,RemoteObject.createImmutable("/Veranstaltungen")));
 BA.debugLineNum = 445;BA.debugLine="URLteilnehmer = \"https://wertungslisten-app-defau";
Debug.ShouldStop(268435456);
__ref.setField ("_urlteilnehmer" /*RemoteObject*/ ,RemoteObject.concat(RemoteObject.createImmutable("https://wertungslisten-app-default-rtdb.europe-west1.firebasedatabase.app/Vereine/"),_url,RemoteObject.createImmutable("/Teilnehmer")));
 BA.debugLineNum = 446;BA.debugLine="URLergebnisse = \"https://wertungslisten-app-defau";
Debug.ShouldStop(536870912);
__ref.setField ("_urlergebnisse" /*RemoteObject*/ ,RemoteObject.concat(RemoteObject.createImmutable("https://wertungslisten-app-default-rtdb.europe-west1.firebasedatabase.app/Vereine/"),_url,RemoteObject.createImmutable("/Ergebnisse")));
 BA.debugLineNum = 447;BA.debugLine="End Sub";
Debug.ShouldStop(1073741824);
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
 //BA.debugLineNum = 41;BA.debugLine="Private lstVeranstaltungen As ListView";
settings._lstveranstaltungen = RemoteObject.createNew ("anywheresoftware.b4a.objects.ListViewWrapper");__ref.setField("_lstveranstaltungen",settings._lstveranstaltungen);
 //BA.debugLineNum = 42;BA.debugLine="Private lstTeilnehmer As ListView";
settings._lstteilnehmer = RemoteObject.createNew ("anywheresoftware.b4a.objects.ListViewWrapper");__ref.setField("_lstteilnehmer",settings._lstteilnehmer);
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
		Debug.PushSubsStack("CloseSettings (settings) ","settings",3,__ref.getField(false, "ba"),__ref,113);
if (RapidSub.canDelegate("closesettings")) { return __ref.runUserSub(false, "settings","closesettings", __ref);}
 BA.debugLineNum = 113;BA.debugLine="Private Sub CloseSettings";
Debug.ShouldStop(65536);
 BA.debugLineNum = 114;BA.debugLine="Uhrzeit.Enabled = False";
Debug.ShouldStop(131072);
__ref.getField(false,"_uhrzeit" /*RemoteObject*/ ).runMethod(true,"setEnabled",settings.__c.getField(true,"False"));
 BA.debugLineNum = 115;BA.debugLine="B4XPages.MainPage.Status = Status";
Debug.ShouldStop(262144);
settings._b4xpages.runMethod(false,"_mainpage" /*RemoteObject*/ ,__ref.getField(false, "ba")).setField ("_status" /*RemoteObject*/ ,__ref.getField(false,"_status" /*RemoteObject*/ ));
 BA.debugLineNum = 116;BA.debugLine="B4XPages.ClosePage(Me)";
Debug.ShouldStop(524288);
settings._b4xpages.runVoidMethod ("_closepage" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(__ref));
 BA.debugLineNum = 117;BA.debugLine="End Sub";
Debug.ShouldStop(1048576);
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
		Debug.PushSubsStack("CLVTeilnehmer_ItemClick (settings) ","settings",3,__ref.getField(false, "ba"),__ref,1166);
if (RapidSub.canDelegate("clvteilnehmer_itemclick")) { return __ref.runUserSub(false, "settings","clvteilnehmer_itemclick", __ref, _index, _value);}
Debug.locals.put("Index", _index);
Debug.locals.put("Value", _value);
 BA.debugLineNum = 1166;BA.debugLine="Private Sub CLVTeilnehmer_ItemClick(Index As Int,";
Debug.ShouldStop(8192);
 BA.debugLineNum = 1168;BA.debugLine="TLNid = Value";
Debug.ShouldStop(32768);
__ref.setField ("_tlnid" /*RemoteObject*/ ,BA.ObjectToString(_value));
 BA.debugLineNum = 1169;BA.debugLine="setzeTeilnehmer(TLNid)";
Debug.ShouldStop(65536);
__ref.runClassMethod (b4a.example.settings.class, "_setzeteilnehmer" /*RemoteObject*/ ,(Object)(__ref.getField(true,"_tlnid" /*RemoteObject*/ )));
 BA.debugLineNum = 1171;BA.debugLine="End Sub";
Debug.ShouldStop(262144);
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
		Debug.PushSubsStack("CLVVeranstaltungen_ItemClick (settings) ","settings",3,__ref.getField(false, "ba"),__ref,1147);
if (RapidSub.canDelegate("clvveranstaltungen_itemclick")) { return __ref.runUserSub(false, "settings","clvveranstaltungen_itemclick", __ref, _index, _value);}
Debug.locals.put("Index", _index);
Debug.locals.put("Value", _value);
 BA.debugLineNum = 1147;BA.debugLine="Private Sub CLVVeranstaltungen_ItemClick(Index As";
Debug.ShouldStop(67108864);
 BA.debugLineNum = 1149;BA.debugLine="webviewVSTGN_ID = Value";
Debug.ShouldStop(268435456);
__ref.setField ("_webviewvstgn_id" /*RemoteObject*/ ,BA.ObjectToString(_value));
 BA.debugLineNum = 1150;BA.debugLine="setzeVeranstaltung(webviewVSTGN_ID)";
Debug.ShouldStop(536870912);
__ref.runClassMethod (b4a.example.settings.class, "_setzeveranstaltung" /*RemoteObject*/ ,(Object)(__ref.getField(true,"_webviewvstgn_id" /*RemoteObject*/ )));
 BA.debugLineNum = 1152;BA.debugLine="End Sub";
Debug.ShouldStop(-2147483648);
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
		Debug.PushSubsStack("DateUtils_SetDate (settings) ","settings",3,__ref.getField(false, "ba"),__ref,896);
if (RapidSub.canDelegate("dateutils_setdate")) { return __ref.runUserSub(false, "settings","dateutils_setdate", __ref, _year, _month, _day);}
RemoteObject _oldformat = RemoteObject.createImmutable("");
RemoteObject _paddedmonth = RemoteObject.createImmutable("");
RemoteObject _paddedday = RemoteObject.createImmutable("");
RemoteObject _ticks = RemoteObject.createImmutable(0L);
Debug.locals.put("Year", _year);
Debug.locals.put("Month", _month);
Debug.locals.put("Day", _day);
 BA.debugLineNum = 896;BA.debugLine="Private Sub DateUtils_SetDate(Year As Int, Month A";
Debug.ShouldStop(-2147483648);
 BA.debugLineNum = 897;BA.debugLine="Dim oldFormat As String = DateTime.DateFormat";
Debug.ShouldStop(1);
_oldformat = settings.__c.getField(false,"DateTime").runMethod(true,"getDateFormat");Debug.locals.put("oldformat", _oldformat);Debug.locals.put("oldFormat", _oldformat);
 BA.debugLineNum = 898;BA.debugLine="DateTime.DateFormat = \"yyyy-MM-dd\"";
Debug.ShouldStop(2);
settings.__c.getField(false,"DateTime").runMethod(true,"setDateFormat",BA.ObjectToString("yyyy-MM-dd"));
 BA.debugLineNum = 899;BA.debugLine="Dim paddedMonth As String = NumberFormat(Month, 2";
Debug.ShouldStop(4);
_paddedmonth = settings.__c.runMethod(true,"NumberFormat",(Object)(BA.numberCast(double.class, _month)),(Object)(BA.numberCast(int.class, 2)),(Object)(BA.numberCast(int.class, 0)));Debug.locals.put("paddedmonth", _paddedmonth);Debug.locals.put("paddedMonth", _paddedmonth);
 BA.debugLineNum = 900;BA.debugLine="Dim paddedDay As String = NumberFormat(Day, 2, 0)";
Debug.ShouldStop(8);
_paddedday = settings.__c.runMethod(true,"NumberFormat",(Object)(BA.numberCast(double.class, _day)),(Object)(BA.numberCast(int.class, 2)),(Object)(BA.numberCast(int.class, 0)));Debug.locals.put("paddedday", _paddedday);Debug.locals.put("paddedDay", _paddedday);
 BA.debugLineNum = 901;BA.debugLine="Dim ticks As Long = DateTime.DateParse(Year & \"-\"";
Debug.ShouldStop(16);
_ticks = settings.__c.getField(false,"DateTime").runMethod(true,"DateParse",(Object)(RemoteObject.concat(_year,RemoteObject.createImmutable("-"),_paddedmonth,RemoteObject.createImmutable("-"),_paddedday)));Debug.locals.put("ticks", _ticks);Debug.locals.put("ticks", _ticks);
 BA.debugLineNum = 902;BA.debugLine="DateTime.DateFormat = oldFormat";
Debug.ShouldStop(32);
settings.__c.getField(false,"DateTime").runMethod(true,"setDateFormat",_oldformat);
 BA.debugLineNum = 903;BA.debugLine="Return ticks";
Debug.ShouldStop(64);
if (true) return _ticks;
 BA.debugLineNum = 904;BA.debugLine="End Sub";
Debug.ShouldStop(128);
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
		Debug.PushSubsStack("DBGet (settings) ","settings",3,__ref.getField(false, "ba"),__ref,1113);
if (RapidSub.canDelegate("dbget")) { return __ref.runUserSub(false, "settings","dbget", __ref, _key, _defaultvalue);}
RemoteObject _val = RemoteObject.createImmutable("");
RemoteObject _jp = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.JSONParser");
Debug.locals.put("Key", _key);
Debug.locals.put("DefaultValue", _defaultvalue);
 BA.debugLineNum = 1113;BA.debugLine="Private Sub DBGet(Key As String, DefaultValue As O";
Debug.ShouldStop(16777216);
 BA.debugLineNum = 1114;BA.debugLine="If DBVerein.ContainsKey(Key) = False Then Return";
Debug.ShouldStop(33554432);
if (RemoteObject.solveBoolean("=",__ref.getField(false,"_dbverein" /*RemoteObject*/ ).runMethod(true,"ContainsKey",(Object)((_key))),settings.__c.getField(true,"False"))) { 
if (true) return _defaultvalue;};
 BA.debugLineNum = 1115;BA.debugLine="Dim val As String = DBVerein.Get(Key)";
Debug.ShouldStop(67108864);
_val = BA.ObjectToString(__ref.getField(false,"_dbverein" /*RemoteObject*/ ).runMethod(false,"Get",(Object)((_key))));Debug.locals.put("val", _val);Debug.locals.put("val", _val);
 BA.debugLineNum = 1116;BA.debugLine="If val.StartsWith(\"JSON_MAP:\") Then";
Debug.ShouldStop(134217728);
if (_val.runMethod(true,"startsWith",(Object)(RemoteObject.createImmutable("JSON_MAP:"))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 1117;BA.debugLine="Dim jp As JSONParser";
Debug.ShouldStop(268435456);
_jp = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.JSONParser");Debug.locals.put("jp", _jp);
 BA.debugLineNum = 1118;BA.debugLine="jp.Initialize(val.SubString(9))";
Debug.ShouldStop(536870912);
_jp.runVoidMethod ("Initialize",(Object)(_val.runMethod(true,"substring",(Object)(BA.numberCast(int.class, 9)))));
 BA.debugLineNum = 1119;BA.debugLine="Return jp.NextObject";
Debug.ShouldStop(1073741824);
if (true) return (_jp.runMethod(false,"NextObject").getObject());
 }else 
{ BA.debugLineNum = 1120;BA.debugLine="Else If val.StartsWith(\"JSON_LIST:\") Then";
Debug.ShouldStop(-2147483648);
if (_val.runMethod(true,"startsWith",(Object)(RemoteObject.createImmutable("JSON_LIST:"))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 1121;BA.debugLine="Dim jp As JSONParser";
Debug.ShouldStop(1);
_jp = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.JSONParser");Debug.locals.put("jp", _jp);
 BA.debugLineNum = 1122;BA.debugLine="jp.Initialize(val.SubString(10))";
Debug.ShouldStop(2);
_jp.runVoidMethod ("Initialize",(Object)(_val.runMethod(true,"substring",(Object)(BA.numberCast(int.class, 10)))));
 BA.debugLineNum = 1123;BA.debugLine="Return jp.NextArray";
Debug.ShouldStop(4);
if (true) return (_jp.runMethod(false,"NextArray").getObject());
 }}
;
 BA.debugLineNum = 1125;BA.debugLine="Return val";
Debug.ShouldStop(16);
if (true) return (_val);
 BA.debugLineNum = 1126;BA.debugLine="End Sub";
Debug.ShouldStop(32);
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
		Debug.PushSubsStack("DBPut (settings) ","settings",3,__ref.getField(false, "ba"),__ref,1098);
if (RapidSub.canDelegate("dbput")) { return __ref.runUserSub(false, "settings","dbput", __ref, _key, _value);}
RemoteObject _jg = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.JSONParser.JSONGenerator");
Debug.locals.put("Key", _key);
Debug.locals.put("Value", _value);
 BA.debugLineNum = 1098;BA.debugLine="Private Sub DBPut(Key As String, Value As Object)";
Debug.ShouldStop(512);
 BA.debugLineNum = 1099;BA.debugLine="If Value Is Map Then";
Debug.ShouldStop(1024);
if (RemoteObject.solveBoolean("i",_value, RemoteObject.createImmutable("java.util.Map"))) { 
 BA.debugLineNum = 1100;BA.debugLine="Dim jg As JSONGenerator";
Debug.ShouldStop(2048);
_jg = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.JSONParser.JSONGenerator");Debug.locals.put("jg", _jg);
 BA.debugLineNum = 1101;BA.debugLine="jg.Initialize(Value)";
Debug.ShouldStop(4096);
_jg.runVoidMethod ("Initialize",RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), _value));
 BA.debugLineNum = 1102;BA.debugLine="DBVerein.Put(Key, \"JSON_MAP:\" & jg.ToString)";
Debug.ShouldStop(8192);
__ref.getField(false,"_dbverein" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)((_key)),(Object)((RemoteObject.concat(RemoteObject.createImmutable("JSON_MAP:"),_jg.runMethod(true,"ToString")))));
 }else 
{ BA.debugLineNum = 1103;BA.debugLine="Else If Value Is List Then";
Debug.ShouldStop(16384);
if (RemoteObject.solveBoolean("i",_value, RemoteObject.createImmutable("java.util.List"))) { 
 BA.debugLineNum = 1104;BA.debugLine="Dim jg As JSONGenerator";
Debug.ShouldStop(32768);
_jg = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.JSONParser.JSONGenerator");Debug.locals.put("jg", _jg);
 BA.debugLineNum = 1105;BA.debugLine="jg.Initialize2(Value)";
Debug.ShouldStop(65536);
_jg.runVoidMethod ("Initialize2",RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.List"), _value));
 BA.debugLineNum = 1106;BA.debugLine="DBVerein.Put(Key, \"JSON_LIST:\" & jg.ToString)";
Debug.ShouldStop(131072);
__ref.getField(false,"_dbverein" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)((_key)),(Object)((RemoteObject.concat(RemoteObject.createImmutable("JSON_LIST:"),_jg.runMethod(true,"ToString")))));
 }else {
 BA.debugLineNum = 1108;BA.debugLine="DBVerein.Put(Key, Value)";
Debug.ShouldStop(524288);
__ref.getField(false,"_dbverein" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)((_key)),(Object)(_value));
 }}
;
 BA.debugLineNum = 1110;BA.debugLine="File.WriteMap(File.DirInternal, DBFileName, DBVer";
Debug.ShouldStop(2097152);
settings.__c.getField(false,"File").runVoidMethod ("WriteMap",(Object)(settings.__c.getField(false,"File").runMethod(true,"getDirInternal")),(Object)(__ref.getField(true,"_dbfilename" /*RemoteObject*/ )),(Object)(__ref.getField(false,"_dbverein" /*RemoteObject*/ )));
 BA.debugLineNum = 1111;BA.debugLine="End Sub";
Debug.ShouldStop(4194304);
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
		Debug.PushSubsStack("delTLN (settings) ","settings",3,__ref.getField(false, "ba"),__ref,717);
if (RapidSub.canDelegate("deltln")) { return __ref.runUserSub(false, "settings","deltln", __ref, _tid);}
Debug.locals.put("tid", _tid);
 BA.debugLineNum = 717;BA.debugLine="Private Sub delTLN(tid As String)";
Debug.ShouldStop(4096);
 BA.debugLineNum = 718;BA.debugLine="disableTLN";
Debug.ShouldStop(8192);
__ref.runClassMethod (b4a.example.settings.class, "_disabletln" /*RemoteObject*/ );
 BA.debugLineNum = 719;BA.debugLine="ToastMessageShow(\"Der Teilnehmer wird gelöscht!\",";
Debug.ShouldStop(16384);
settings.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence("Der Teilnehmer wird gelöscht!")),(Object)(settings.__c.getField(true,"False")));
 BA.debugLineNum = 720;BA.debugLine="DBdatenTyp = \"delTeilnehmer\"";
Debug.ShouldStop(32768);
__ref.setField ("_dbdatentyp" /*RemoteObject*/ ,BA.ObjectToString("delTeilnehmer"));
 BA.debugLineNum = 721;BA.debugLine="CurrentWebUrl = URLteilnehmer & \"/\" & tid & \".jso";
Debug.ShouldStop(65536);
__ref.setField ("_currentweburl" /*RemoteObject*/ ,RemoteObject.concat(__ref.getField(true,"_urlteilnehmer" /*RemoteObject*/ ),RemoteObject.createImmutable("/"),_tid,RemoteObject.createImmutable(".json?auth="),__ref.getField(false,"_status" /*RemoteObject*/ ).runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("idToken"))),(Object)((RemoteObject.createImmutable(""))))));
 BA.debugLineNum = 722;BA.debugLine="ExecuteHttp(\"DELETE\", CurrentWebUrl, \"\")";
Debug.ShouldStop(131072);
__ref.runClassMethod (b4a.example.settings.class, "_executehttp" /*void*/ ,(Object)(BA.ObjectToString("DELETE")),(Object)(__ref.getField(true,"_currentweburl" /*RemoteObject*/ )),(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 723;BA.debugLine="enableTLN";
Debug.ShouldStop(262144);
__ref.runClassMethod (b4a.example.settings.class, "_enabletln" /*RemoteObject*/ );
 BA.debugLineNum = 724;BA.debugLine="End Sub";
Debug.ShouldStop(524288);
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
		Debug.PushSubsStack("delVeranstaltung (settings) ","settings",3,__ref.getField(false, "ba"),__ref,608);
if (RapidSub.canDelegate("delveranstaltung")) { return __ref.runUserSub(false, "settings","delveranstaltung", __ref, _vid);}
RemoteObject _veranstaltung = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _vname = RemoteObject.createImmutable("");
RemoteObject _vdatum = RemoteObject.createImmutable("");
Debug.locals.put("vid", _vid);
 BA.debugLineNum = 608;BA.debugLine="Private Sub delVeranstaltung(vid As String)";
Debug.ShouldStop(-2147483648);
 BA.debugLineNum = 609;BA.debugLine="disableVSTNG";
Debug.ShouldStop(1);
__ref.runClassMethod (b4a.example.settings.class, "_disablevstng" /*RemoteObject*/ );
 BA.debugLineNum = 610;BA.debugLine="If Veranstaltungen.IsInitialized And Veranstaltun";
Debug.ShouldStop(2);
if (RemoteObject.solveBoolean(".",__ref.getField(false,"_veranstaltungen" /*RemoteObject*/ ).runMethod(true,"IsInitialized")) && RemoteObject.solveBoolean(".",__ref.getField(false,"_veranstaltungen" /*RemoteObject*/ ).runMethod(true,"ContainsKey",(Object)((_vid))))) { 
 BA.debugLineNum = 611;BA.debugLine="Dim veranstaltung As Map = Veranstaltungen.Get(v";
Debug.ShouldStop(4);
_veranstaltung = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_veranstaltung = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), __ref.getField(false,"_veranstaltungen" /*RemoteObject*/ ).runMethod(false,"Get",(Object)((_vid))));Debug.locals.put("veranstaltung", _veranstaltung);Debug.locals.put("veranstaltung", _veranstaltung);
 BA.debugLineNum = 612;BA.debugLine="Dim vName As String = veranstaltung.GetDefault(\"";
Debug.ShouldStop(8);
_vname = BA.ObjectToString(_veranstaltung.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("Name"))),(Object)((RemoteObject.createImmutable(" unbenannt ")))));Debug.locals.put("vname", _vname);Debug.locals.put("vName", _vname);
 BA.debugLineNum = 613;BA.debugLine="Dim vDatum As String = veranstaltung.GetDefault(";
Debug.ShouldStop(16);
_vdatum = BA.ObjectToString(_veranstaltung.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("Datum"))),(Object)((__ref.runClassMethod (b4a.example.settings.class, "_formatdatecustom" /*RemoteObject*/ ,(Object)(settings.__c.getField(false,"DateTime").runMethod(true,"getNow")),(Object)(RemoteObject.createImmutable("dd.MM.yyyy")))))));Debug.locals.put("vdatum", _vdatum);Debug.locals.put("vDatum", _vdatum);
 BA.debugLineNum = 614;BA.debugLine="ToastMessageShow(\"Die Veranstaltung \" & vName &";
Debug.ShouldStop(32);
settings.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence(RemoteObject.concat(RemoteObject.createImmutable("Die Veranstaltung "),_vname,RemoteObject.createImmutable(" vom "),_vdatum,RemoteObject.createImmutable(" wird gelöscht!")))),(Object)(settings.__c.getField(true,"False")));
 BA.debugLineNum = 616;BA.debugLine="DBdatenTyp = \"delVeranstaltung\"";
Debug.ShouldStop(128);
__ref.setField ("_dbdatentyp" /*RemoteObject*/ ,BA.ObjectToString("delVeranstaltung"));
 BA.debugLineNum = 617;BA.debugLine="CurrentWebUrl = URLveranstaltungen & \"/\" & vid &";
Debug.ShouldStop(256);
__ref.setField ("_currentweburl" /*RemoteObject*/ ,RemoteObject.concat(__ref.getField(true,"_urlveranstaltungen" /*RemoteObject*/ ),RemoteObject.createImmutable("/"),_vid,RemoteObject.createImmutable(".json?auth="),__ref.getField(false,"_status" /*RemoteObject*/ ).runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("idToken"))),(Object)((RemoteObject.createImmutable(""))))));
 BA.debugLineNum = 618;BA.debugLine="ExecuteHttp(\"DELETE\", CurrentWebUrl, \"\")";
Debug.ShouldStop(512);
__ref.runClassMethod (b4a.example.settings.class, "_executehttp" /*void*/ ,(Object)(BA.ObjectToString("DELETE")),(Object)(__ref.getField(true,"_currentweburl" /*RemoteObject*/ )),(Object)(RemoteObject.createImmutable("")));
 };
 BA.debugLineNum = 620;BA.debugLine="enableVSTNG";
Debug.ShouldStop(2048);
__ref.runClassMethod (b4a.example.settings.class, "_enablevstng" /*RemoteObject*/ );
 BA.debugLineNum = 621;BA.debugLine="End Sub";
Debug.ShouldStop(4096);
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
		Debug.PushSubsStack("delWertungsliste (settings) ","settings",3,__ref.getField(false, "ba"),__ref,594);
if (RapidSub.canDelegate("delwertungsliste")) { return __ref.runUserSub(false, "settings","delwertungsliste", __ref, _vid);}
RemoteObject _veranstaltung = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _datumstr = RemoteObject.createImmutable("");
RemoteObject _datum_spl = null;
Debug.locals.put("vid", _vid);
 BA.debugLineNum = 594;BA.debugLine="Private Sub delWertungsliste(vid As String)";
Debug.ShouldStop(131072);
 BA.debugLineNum = 595;BA.debugLine="disableVSTNG";
Debug.ShouldStop(262144);
__ref.runClassMethod (b4a.example.settings.class, "_disablevstng" /*RemoteObject*/ );
 BA.debugLineNum = 596;BA.debugLine="If Veranstaltungen.IsInitialized And Veranstaltun";
Debug.ShouldStop(524288);
if (RemoteObject.solveBoolean(".",__ref.getField(false,"_veranstaltungen" /*RemoteObject*/ ).runMethod(true,"IsInitialized")) && RemoteObject.solveBoolean(".",__ref.getField(false,"_veranstaltungen" /*RemoteObject*/ ).runMethod(true,"ContainsKey",(Object)((_vid))))) { 
 BA.debugLineNum = 597;BA.debugLine="Dim veranstaltung As Map = Veranstaltungen.Get(v";
Debug.ShouldStop(1048576);
_veranstaltung = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_veranstaltung = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), __ref.getField(false,"_veranstaltungen" /*RemoteObject*/ ).runMethod(false,"Get",(Object)((_vid))));Debug.locals.put("veranstaltung", _veranstaltung);Debug.locals.put("veranstaltung", _veranstaltung);
 BA.debugLineNum = 598;BA.debugLine="Dim datumStr As String = veranstaltung.GetDefaul";
Debug.ShouldStop(2097152);
_datumstr = BA.ObjectToString(_veranstaltung.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("Datum"))),(Object)((RemoteObject.createImmutable("00.00.0000")))));Debug.locals.put("datumstr", _datumstr);Debug.locals.put("datumStr", _datumstr);
 BA.debugLineNum = 599;BA.debugLine="Dim datum_spl() As String = Regex.Split(\"\\.\", da";
Debug.ShouldStop(4194304);
_datum_spl = settings.__c.getField(false,"Regex").runMethod(false,"Split",(Object)(BA.ObjectToString("\\.")),(Object)(_datumstr));Debug.locals.put("datum_spl", _datum_spl);Debug.locals.put("datum_spl", _datum_spl);
 BA.debugLineNum = 600;BA.debugLine="If datum_spl.Length >= 3 Then";
Debug.ShouldStop(8388608);
if (RemoteObject.solveBoolean("g",_datum_spl.getField(true,"length"),BA.numberCast(double.class, 3))) { 
 BA.debugLineNum = 601;BA.debugLine="DBdatenTyp = \"delErgebnis\"";
Debug.ShouldStop(16777216);
__ref.setField ("_dbdatentyp" /*RemoteObject*/ ,BA.ObjectToString("delErgebnis"));
 BA.debugLineNum = 602;BA.debugLine="CurrentWebUrl = URLergebnisse & \"/e\" & datum_sp";
Debug.ShouldStop(33554432);
__ref.setField ("_currentweburl" /*RemoteObject*/ ,RemoteObject.concat(__ref.getField(true,"_urlergebnisse" /*RemoteObject*/ ),RemoteObject.createImmutable("/e"),_datum_spl.getArrayElement(true,BA.numberCast(int.class, 2)),_datum_spl.getArrayElement(true,BA.numberCast(int.class, 1)),_datum_spl.getArrayElement(true,BA.numberCast(int.class, 0)),RemoteObject.createImmutable(".json?auth="),__ref.getField(false,"_status" /*RemoteObject*/ ).runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("idToken"))),(Object)((RemoteObject.createImmutable(""))))));
 BA.debugLineNum = 603;BA.debugLine="ExecuteHttp(\"DELETE\", CurrentWebUrl, \"\")";
Debug.ShouldStop(67108864);
__ref.runClassMethod (b4a.example.settings.class, "_executehttp" /*void*/ ,(Object)(BA.ObjectToString("DELETE")),(Object)(__ref.getField(true,"_currentweburl" /*RemoteObject*/ )),(Object)(RemoteObject.createImmutable("")));
 };
 };
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
public static RemoteObject  _disabletln(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("disableTLN (settings) ","settings",3,__ref.getField(false, "ba"),__ref,420);
if (RapidSub.canDelegate("disabletln")) { return __ref.runUserSub(false, "settings","disabletln", __ref);}
 BA.debugLineNum = 420;BA.debugLine="Private Sub disableTLN";
Debug.ShouldStop(8);
 BA.debugLineNum = 421;BA.debugLine="btnTLNDelete.Enabled = False";
Debug.ShouldStop(16);
__ref.getField(false,"_btntlndelete" /*RemoteObject*/ ).runMethod(true,"setEnabled",settings.__c.getField(true,"False"));
 BA.debugLineNum = 422;BA.debugLine="btnTLNSpeichern.Enabled = False";
Debug.ShouldStop(32);
__ref.getField(false,"_btntlnspeichern" /*RemoteObject*/ ).runMethod(true,"setEnabled",settings.__c.getField(true,"False"));
 BA.debugLineNum = 423;BA.debugLine="tbxTeilnehmer.Enabled = False";
Debug.ShouldStop(64);
__ref.getField(false,"_tbxteilnehmer" /*RemoteObject*/ ).runMethod(true,"setEnabled",settings.__c.getField(true,"False"));
 BA.debugLineNum = 424;BA.debugLine="btnTLNDelete.TextColor = 0xFF888888";
Debug.ShouldStop(128);
__ref.getField(false,"_btntlndelete" /*RemoteObject*/ ).runMethod(true,"setTextColor",BA.numberCast(int.class, ((int)0xff888888)));
 BA.debugLineNum = 425;BA.debugLine="btnTLNSpeichern.TextColor = 0xFF888888";
Debug.ShouldStop(256);
__ref.getField(false,"_btntlnspeichern" /*RemoteObject*/ ).runMethod(true,"setTextColor",BA.numberCast(int.class, ((int)0xff888888)));
 BA.debugLineNum = 426;BA.debugLine="End Sub";
Debug.ShouldStop(512);
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
		Debug.PushSubsStack("disableVSTNG (settings) ","settings",3,__ref.getField(false, "ba"),__ref,394);
if (RapidSub.canDelegate("disablevstng")) { return __ref.runUserSub(false, "settings","disablevstng", __ref);}
 BA.debugLineNum = 394;BA.debugLine="Private Sub disableVSTNG";
Debug.ShouldStop(512);
 BA.debugLineNum = 395;BA.debugLine="dprDatum.Enabled = False";
Debug.ShouldStop(1024);
__ref.getField(false,"_dprdatum" /*RemoteObject*/ ).runMethod(true,"setEnabled",settings.__c.getField(true,"False"));
 BA.debugLineNum = 396;BA.debugLine="dprDatum.TextColor = 0xFF888888";
Debug.ShouldStop(2048);
__ref.getField(false,"_dprdatum" /*RemoteObject*/ ).runMethod(true,"setTextColor",BA.numberCast(int.class, ((int)0xff888888)));
 BA.debugLineNum = 397;BA.debugLine="btnVerstgDelete.Enabled = False";
Debug.ShouldStop(4096);
__ref.getField(false,"_btnverstgdelete" /*RemoteObject*/ ).runMethod(true,"setEnabled",settings.__c.getField(true,"False"));
 BA.debugLineNum = 398;BA.debugLine="btnVerstgDelete.TextColor = 0xFF888888";
Debug.ShouldStop(8192);
__ref.getField(false,"_btnverstgdelete" /*RemoteObject*/ ).runMethod(true,"setTextColor",BA.numberCast(int.class, ((int)0xff888888)));
 BA.debugLineNum = 399;BA.debugLine="btnVerstgSpeichern.Enabled = False";
Debug.ShouldStop(16384);
__ref.getField(false,"_btnverstgspeichern" /*RemoteObject*/ ).runMethod(true,"setEnabled",settings.__c.getField(true,"False"));
 BA.debugLineNum = 400;BA.debugLine="btnVerstgSpeichern.TextColor = 0xFF888888";
Debug.ShouldStop(32768);
__ref.getField(false,"_btnverstgspeichern" /*RemoteObject*/ ).runMethod(true,"setTextColor",BA.numberCast(int.class, ((int)0xff888888)));
 BA.debugLineNum = 401;BA.debugLine="tbxVeranstaltung.Enabled = False";
Debug.ShouldStop(65536);
__ref.getField(false,"_tbxveranstaltung" /*RemoteObject*/ ).runMethod(true,"setEnabled",settings.__c.getField(true,"False"));
 BA.debugLineNum = 402;BA.debugLine="tbxAnzahl.Enabled = False";
Debug.ShouldStop(131072);
__ref.getField(false,"_tbxanzahl" /*RemoteObject*/ ).runMethod(true,"setEnabled",settings.__c.getField(true,"False"));
 BA.debugLineNum = 403;BA.debugLine="btnAuswahl.Enabled = False";
Debug.ShouldStop(262144);
__ref.getField(false,"_btnauswahl" /*RemoteObject*/ ).runMethod(true,"setEnabled",settings.__c.getField(true,"False"));
 BA.debugLineNum = 404;BA.debugLine="btnAuswahl.TextColor = 0xFF888888";
Debug.ShouldStop(524288);
__ref.getField(false,"_btnauswahl" /*RemoteObject*/ ).runMethod(true,"setTextColor",BA.numberCast(int.class, ((int)0xff888888)));
 BA.debugLineNum = 405;BA.debugLine="End Sub";
Debug.ShouldStop(1048576);
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
		Debug.PushSubsStack("dprDatum_Click (settings) ","settings",3,__ref.getField(false, "ba"),__ref,831);
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
		Debug.PushSubsStack("dprDatum_Click (settings) ","settings",3,__ref.getField(false, "ba"),__ref,831);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
;
 BA.debugLineNum = 832;BA.debugLine="Dim ctxt As JavaObject";
Debug.ShouldStop(-2147483648);
_ctxt = RemoteObject.createNew ("anywheresoftware.b4j.object.JavaObject");Debug.locals.put("ctxt", _ctxt);
 BA.debugLineNum = 833;BA.debugLine="ctxt.InitializeContext";
Debug.ShouldStop(1);
_ctxt.runVoidMethod ("InitializeContext",__ref.getField(false, "ba"));
 BA.debugLineNum = 835;BA.debugLine="Dim listener As Object = ctxt.CreateEventFromUI(\"";
Debug.ShouldStop(4);
_listener = _ctxt.runMethod(false,"CreateEventFromUI",__ref.getField(false, "ba"),(Object)(BA.ObjectToString("android.app.DatePickerDialog$OnDateSetListener")),(Object)(BA.ObjectToString("DateSet")),(Object)(parent.__c.getField(false,"Null")));Debug.locals.put("listener", _listener);Debug.locals.put("listener", _listener);
 BA.debugLineNum = 836;BA.debugLine="Dim dlg As JavaObject";
Debug.ShouldStop(8);
_dlg = RemoteObject.createNew ("anywheresoftware.b4j.object.JavaObject");Debug.locals.put("dlg", _dlg);
 BA.debugLineNum = 837;BA.debugLine="dlg.InitializeNewInstance(\"android.app.DatePicker";
Debug.ShouldStop(16);
_dlg.runVoidMethod ("InitializeNewInstance",(Object)(BA.ObjectToString("android.app.DatePickerDialog")),(Object)(RemoteObject.createNewArray("Object",new int[] {5},new Object[] {(_ctxt.getObject()),_listener,(__ref.getField(true,"_dpryear" /*RemoteObject*/ )),(RemoteObject.solve(new RemoteObject[] {__ref.getField(true,"_dprmonth" /*RemoteObject*/ ),RemoteObject.createImmutable(1)}, "-",1, 1)),(__ref.getField(true,"_dprday" /*RemoteObject*/ ))})));
 BA.debugLineNum = 838;BA.debugLine="dlg.RunMethod(\"show\", Null)";
Debug.ShouldStop(32);
_dlg.runVoidMethod ("RunMethod",(Object)(BA.ObjectToString("show")),(Object)((parent.__c.getField(false,"Null"))));
 BA.debugLineNum = 840;BA.debugLine="Wait For DateSet_Event (MethodName As String, Arg";
Debug.ShouldStop(128);
parent.__c.runVoidMethod ("WaitFor","dateset_event", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "settings", "dprdatum_click"), null);
this.state = 28;
return;
case 28:
//C
this.state = 1;
_methodname = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("MethodName", _methodname);
_args = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(2));Debug.locals.put("Args", _args);
;
 BA.debugLineNum = 841;BA.debugLine="If Args.Length >= 4 Then";
Debug.ShouldStop(256);
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
 BA.debugLineNum = 842;BA.debugLine="dprYear = Args(1)";
Debug.ShouldStop(512);
__ref.setField ("_dpryear" /*RemoteObject*/ ,BA.numberCast(int.class, _args.getArrayElement(false,BA.numberCast(int.class, 1))));
 BA.debugLineNum = 843;BA.debugLine="Dim mZeroBased As Int = Args(2)";
Debug.ShouldStop(1024);
_mzerobased = BA.numberCast(int.class, _args.getArrayElement(false,BA.numberCast(int.class, 2)));Debug.locals.put("mzerobased", _mzerobased);Debug.locals.put("mZeroBased", _mzerobased);
 BA.debugLineNum = 844;BA.debugLine="dprMonth = mZeroBased + 1";
Debug.ShouldStop(2048);
__ref.setField ("_dprmonth" /*RemoteObject*/ ,RemoteObject.solve(new RemoteObject[] {_mzerobased,RemoteObject.createImmutable(1)}, "+",1, 1));
 BA.debugLineNum = 845;BA.debugLine="dprDay = Args(3)";
Debug.ShouldStop(4096);
__ref.setField ("_dprday" /*RemoteObject*/ ,BA.numberCast(int.class, _args.getArrayElement(false,BA.numberCast(int.class, 3))));
 BA.debugLineNum = 847;BA.debugLine="Dim ticks As Long = DateUtils_SetDate(dprYear, d";
Debug.ShouldStop(16384);
_ticks = __ref.runClassMethod (b4a.example.settings.class, "_dateutils_setdate" /*RemoteObject*/ ,(Object)(__ref.getField(true,"_dpryear" /*RemoteObject*/ )),(Object)(__ref.getField(true,"_dprmonth" /*RemoteObject*/ )),(Object)(__ref.getField(true,"_dprday" /*RemoteObject*/ )));Debug.locals.put("ticks", _ticks);Debug.locals.put("ticks", _ticks);
 BA.debugLineNum = 848;BA.debugLine="dprDatum.Text = FormatDateCustom(ticks, \"dd.MM.y";
Debug.ShouldStop(32768);
__ref.getField(false,"_dprdatum" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToCharSequence(__ref.runClassMethod (b4a.example.settings.class, "_formatdatecustom" /*RemoteObject*/ ,(Object)(_ticks),(Object)(RemoteObject.createImmutable("dd.MM.yyyy")))));
 BA.debugLineNum = 850;BA.debugLine="btnAuswahl.Enabled = False";
Debug.ShouldStop(131072);
__ref.getField(false,"_btnauswahl" /*RemoteObject*/ ).runMethod(true,"setEnabled",parent.__c.getField(true,"False"));
 BA.debugLineNum = 851;BA.debugLine="btnAuswahl.TextColor = 0xFF888888";
Debug.ShouldStop(262144);
__ref.getField(false,"_btnauswahl" /*RemoteObject*/ ).runMethod(true,"setTextColor",BA.numberCast(int.class, ((int)0xff888888)));
 BA.debugLineNum = 853;BA.debugLine="If dprDatum.Text <> DBGet(\"VeranstaltungDatum\",";
Debug.ShouldStop(1048576);
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
 BA.debugLineNum = 854;BA.debugLine="Dim neu As Boolean = True";
Debug.ShouldStop(2097152);
_neu = parent.__c.getField(true,"True");Debug.locals.put("neu", _neu);Debug.locals.put("neu", _neu);
 BA.debugLineNum = 855;BA.debugLine="If Veranstaltungen.IsInitialized Then";
Debug.ShouldStop(4194304);
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
 BA.debugLineNum = 856;BA.debugLine="For Each key As String In Veranstaltungen.Keys";
Debug.ShouldStop(8388608);
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
 BA.debugLineNum = 857;BA.debugLine="Dim veranstaltung As Map = Veranstaltungen.Ge";
Debug.ShouldStop(16777216);
_veranstaltung = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_veranstaltung = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), __ref.getField(false,"_veranstaltungen" /*RemoteObject*/ ).runMethod(false,"Get",(Object)((_key))));Debug.locals.put("veranstaltung", _veranstaltung);Debug.locals.put("veranstaltung", _veranstaltung);
 BA.debugLineNum = 858;BA.debugLine="Dim datum As String = veranstaltung.GetDefaul";
Debug.ShouldStop(33554432);
_datum = BA.ObjectToString(_veranstaltung.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("Datum"))),(Object)((RemoteObject.createImmutable("-")))));Debug.locals.put("datum", _datum);Debug.locals.put("datum", _datum);
 BA.debugLineNum = 859;BA.debugLine="If dprDatum.Text = datum Then";
Debug.ShouldStop(67108864);
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
 BA.debugLineNum = 860;BA.debugLine="neu = False";
Debug.ShouldStop(134217728);
_neu = parent.__c.getField(true,"False");Debug.locals.put("neu", _neu);
 BA.debugLineNum = 861;BA.debugLine="disableVSTNG";
Debug.ShouldStop(268435456);
__ref.runClassMethod (b4a.example.settings.class, "_disablevstng" /*RemoteObject*/ );
 BA.debugLineNum = 862;BA.debugLine="webviewVSTGN_ID = key";
Debug.ShouldStop(536870912);
__ref.setField ("_webviewvstgn_id" /*RemoteObject*/ ,_key);
 BA.debugLineNum = 865;BA.debugLine="enableVSTNG";
Debug.ShouldStop(1);
__ref.runClassMethod (b4a.example.settings.class, "_enablevstng" /*RemoteObject*/ );
 BA.debugLineNum = 866;BA.debugLine="Exit";
Debug.ShouldStop(2);
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
 BA.debugLineNum = 871;BA.debugLine="If neu Then";
Debug.ShouldStop(64);

case 18:
//if
this.state = 25;
if (_neu.<Boolean>get().booleanValue()) { 
this.state = 20;
}if (true) break;

case 20:
//C
this.state = 21;
 BA.debugLineNum = 872;BA.debugLine="Veranstaltung_ID = VSTGNnewID";
Debug.ShouldStop(128);
__ref.setField ("_veranstaltung_id" /*RemoteObject*/ ,__ref.getField(true,"_vstgnnewid" /*RemoteObject*/ ));
 BA.debugLineNum = 873;BA.debugLine="webviewVSTGN_ID = VSTGNnewID";
Debug.ShouldStop(256);
__ref.setField ("_webviewvstgn_id" /*RemoteObject*/ ,__ref.getField(true,"_vstgnnewid" /*RemoteObject*/ ));
 BA.debugLineNum = 874;BA.debugLine="disableVSTNG";
Debug.ShouldStop(512);
__ref.runClassMethod (b4a.example.settings.class, "_disablevstng" /*RemoteObject*/ );
 BA.debugLineNum = 879;BA.debugLine="tbxAnzahl.Text = \"0\"";
Debug.ShouldStop(16384);
__ref.getField(false,"_tbxanzahl" /*RemoteObject*/ ).runMethodAndSync(true,"setText",BA.ObjectToCharSequence("0"));
 BA.debugLineNum = 880;BA.debugLine="enableVSTNG";
Debug.ShouldStop(32768);
__ref.runClassMethod (b4a.example.settings.class, "_enablevstng" /*RemoteObject*/ );
 BA.debugLineNum = 881;BA.debugLine="Dim anzVal As Int = tbxAnzahl.Text";
Debug.ShouldStop(65536);
_anzval = BA.numberCast(int.class, __ref.getField(false,"_tbxanzahl" /*RemoteObject*/ ).runMethod(true,"getText"));Debug.locals.put("anzval", _anzval);Debug.locals.put("anzVal", _anzval);
 BA.debugLineNum = 882;BA.debugLine="If anzVal > 0 Then";
Debug.ShouldStop(131072);
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
 BA.debugLineNum = 883;BA.debugLine="btnVerstgSpeichern.Enabled = True";
Debug.ShouldStop(262144);
__ref.getField(false,"_btnverstgspeichern" /*RemoteObject*/ ).runMethod(true,"setEnabled",parent.__c.getField(true,"True"));
 BA.debugLineNum = 884;BA.debugLine="btnVerstgSpeichern.TextColor = colorgreen";
Debug.ShouldStop(524288);
__ref.getField(false,"_btnverstgspeichern" /*RemoteObject*/ ).runMethod(true,"setTextColor",__ref.getField(true,"_colorgreen" /*RemoteObject*/ ));
 if (true) break;

case 24:
//C
this.state = 25;
;
 BA.debugLineNum = 886;BA.debugLine="btnVerstgDelete.Enabled = False";
Debug.ShouldStop(2097152);
__ref.getField(false,"_btnverstgdelete" /*RemoteObject*/ ).runMethod(true,"setEnabled",parent.__c.getField(true,"False"));
 BA.debugLineNum = 887;BA.debugLine="btnVerstgDelete.TextColor = 0xFF888888";
Debug.ShouldStop(4194304);
__ref.getField(false,"_btnverstgdelete" /*RemoteObject*/ ).runMethod(true,"setTextColor",BA.numberCast(int.class, ((int)0xff888888)));
 BA.debugLineNum = 888;BA.debugLine="btnAuswahl.Enabled = False";
Debug.ShouldStop(8388608);
__ref.getField(false,"_btnauswahl" /*RemoteObject*/ ).runMethod(true,"setEnabled",parent.__c.getField(true,"False"));
 BA.debugLineNum = 889;BA.debugLine="btnAuswahl.TextColor = 0xFF888888";
Debug.ShouldStop(16777216);
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
 BA.debugLineNum = 893;BA.debugLine="startTimer";
Debug.ShouldStop(268435456);
__ref.runClassMethod (b4a.example.settings.class, "_starttimer" /*RemoteObject*/ );
 BA.debugLineNum = 894;BA.debugLine="End Sub";
Debug.ShouldStop(536870912);
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
		Debug.PushSubsStack("enableTLN (settings) ","settings",3,__ref.getField(false, "ba"),__ref,428);
if (RapidSub.canDelegate("enabletln")) { return __ref.runUserSub(false, "settings","enabletln", __ref);}
 BA.debugLineNum = 428;BA.debugLine="Private Sub enableTLN";
Debug.ShouldStop(2048);
 BA.debugLineNum = 429;BA.debugLine="btnTLNDelete.Enabled = True";
Debug.ShouldStop(4096);
__ref.getField(false,"_btntlndelete" /*RemoteObject*/ ).runMethod(true,"setEnabled",settings.__c.getField(true,"True"));
 BA.debugLineNum = 430;BA.debugLine="btnTLNSpeichern.Enabled = False";
Debug.ShouldStop(8192);
__ref.getField(false,"_btntlnspeichern" /*RemoteObject*/ ).runMethod(true,"setEnabled",settings.__c.getField(true,"False"));
 BA.debugLineNum = 431;BA.debugLine="tbxTeilnehmer.Enabled = True";
Debug.ShouldStop(16384);
__ref.getField(false,"_tbxteilnehmer" /*RemoteObject*/ ).runMethod(true,"setEnabled",settings.__c.getField(true,"True"));
 BA.debugLineNum = 432;BA.debugLine="btnTLNDelete.TextColor = colorgreen";
Debug.ShouldStop(32768);
__ref.getField(false,"_btntlndelete" /*RemoteObject*/ ).runMethod(true,"setTextColor",__ref.getField(true,"_colorgreen" /*RemoteObject*/ ));
 BA.debugLineNum = 433;BA.debugLine="btnTLNSpeichern.TextColor = 0xFF888888";
Debug.ShouldStop(65536);
__ref.getField(false,"_btntlnspeichern" /*RemoteObject*/ ).runMethod(true,"setTextColor",BA.numberCast(int.class, ((int)0xff888888)));
 BA.debugLineNum = 434;BA.debugLine="End Sub";
Debug.ShouldStop(131072);
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
		Debug.PushSubsStack("enableVSTNG (settings) ","settings",3,__ref.getField(false, "ba"),__ref,407);
if (RapidSub.canDelegate("enablevstng")) { return __ref.runUserSub(false, "settings","enablevstng", __ref);}
 BA.debugLineNum = 407;BA.debugLine="Private Sub enableVSTNG";
Debug.ShouldStop(4194304);
 BA.debugLineNum = 408;BA.debugLine="dprDatum.Enabled = True";
Debug.ShouldStop(8388608);
__ref.getField(false,"_dprdatum" /*RemoteObject*/ ).runMethod(true,"setEnabled",settings.__c.getField(true,"True"));
 BA.debugLineNum = 409;BA.debugLine="dprDatum.TextColor = colorgreen";
Debug.ShouldStop(16777216);
__ref.getField(false,"_dprdatum" /*RemoteObject*/ ).runMethod(true,"setTextColor",__ref.getField(true,"_colorgreen" /*RemoteObject*/ ));
 BA.debugLineNum = 410;BA.debugLine="btnVerstgDelete.Enabled = True";
Debug.ShouldStop(33554432);
__ref.getField(false,"_btnverstgdelete" /*RemoteObject*/ ).runMethod(true,"setEnabled",settings.__c.getField(true,"True"));
 BA.debugLineNum = 411;BA.debugLine="btnVerstgDelete.TextColor = colorgreen";
Debug.ShouldStop(67108864);
__ref.getField(false,"_btnverstgdelete" /*RemoteObject*/ ).runMethod(true,"setTextColor",__ref.getField(true,"_colorgreen" /*RemoteObject*/ ));
 BA.debugLineNum = 412;BA.debugLine="btnVerstgSpeichern.Enabled = False";
Debug.ShouldStop(134217728);
__ref.getField(false,"_btnverstgspeichern" /*RemoteObject*/ ).runMethod(true,"setEnabled",settings.__c.getField(true,"False"));
 BA.debugLineNum = 413;BA.debugLine="btnVerstgSpeichern.TextColor = 0xFF888888";
Debug.ShouldStop(268435456);
__ref.getField(false,"_btnverstgspeichern" /*RemoteObject*/ ).runMethod(true,"setTextColor",BA.numberCast(int.class, ((int)0xff888888)));
 BA.debugLineNum = 414;BA.debugLine="tbxVeranstaltung.Enabled = True";
Debug.ShouldStop(536870912);
__ref.getField(false,"_tbxveranstaltung" /*RemoteObject*/ ).runMethod(true,"setEnabled",settings.__c.getField(true,"True"));
 BA.debugLineNum = 415;BA.debugLine="tbxAnzahl.Enabled = True";
Debug.ShouldStop(1073741824);
__ref.getField(false,"_tbxanzahl" /*RemoteObject*/ ).runMethod(true,"setEnabled",settings.__c.getField(true,"True"));
 BA.debugLineNum = 416;BA.debugLine="btnAuswahl.Enabled = False";
Debug.ShouldStop(-2147483648);
__ref.getField(false,"_btnauswahl" /*RemoteObject*/ ).runMethod(true,"setEnabled",settings.__c.getField(true,"False"));
 BA.debugLineNum = 417;BA.debugLine="btnAuswahl.TextColor = 0xFF888888";
Debug.ShouldStop(1);
__ref.getField(false,"_btnauswahl" /*RemoteObject*/ ).runMethod(true,"setTextColor",BA.numberCast(int.class, ((int)0xff888888)));
 BA.debugLineNum = 418;BA.debugLine="End Sub";
Debug.ShouldStop(2);
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
		Debug.PushSubsStack("ExecuteHttp (settings) ","settings",3,__ref.getField(false, "ba"),__ref,734);
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
		Debug.PushSubsStack("ExecuteHttp (settings) ","settings",3,__ref.getField(false, "ba"),__ref,734);
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
 BA.debugLineNum = 735;BA.debugLine="Dim typ As String = DBdatenTyp";
Debug.ShouldStop(1073741824);
_typ = __ref.getField(true,"_dbdatentyp" /*RemoteObject*/ );Debug.locals.put("typ", _typ);Debug.locals.put("typ", _typ);
 BA.debugLineNum = 736;BA.debugLine="Dim j As HttpJob";
Debug.ShouldStop(-2147483648);
_j = RemoteObject.createNew ("b4a.example.httpjob");Debug.locals.put("j", _j);
 BA.debugLineNum = 737;BA.debugLine="j.Initialize(typ, Me)";
Debug.ShouldStop(1);
_j.runClassMethod (b4a.example.httpjob.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(_typ),(Object)(__ref));
 BA.debugLineNum = 739;BA.debugLine="Select method";
Debug.ShouldStop(4);
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
 BA.debugLineNum = 741;BA.debugLine="j.Download(url)";
Debug.ShouldStop(16);
_j.runClassMethod (b4a.example.httpjob.class, "_download" /*RemoteObject*/ ,(Object)(_url));
 if (true) break;

case 5:
//C
this.state = 8;
 BA.debugLineNum = 743;BA.debugLine="j.PutString(url, payload)";
Debug.ShouldStop(64);
_j.runClassMethod (b4a.example.httpjob.class, "_putstring" /*RemoteObject*/ ,(Object)(_url),(Object)(_payload));
 BA.debugLineNum = 744;BA.debugLine="j.GetRequest.SetContentType(\"application/json\")";
Debug.ShouldStop(128);
_j.runClassMethod (b4a.example.httpjob.class, "_getrequest" /*RemoteObject*/ ).runVoidMethod ("SetContentType",(Object)(RemoteObject.createImmutable("application/json")));
 if (true) break;

case 7:
//C
this.state = 8;
 BA.debugLineNum = 746;BA.debugLine="j.Delete(url)";
Debug.ShouldStop(512);
_j.runClassMethod (b4a.example.httpjob.class, "_delete" /*RemoteObject*/ ,(Object)(_url));
 if (true) break;

case 8:
//C
this.state = 9;
;
 BA.debugLineNum = 749;BA.debugLine="Wait For (j) JobDone(j As HttpJob)";
Debug.ShouldStop(4096);
parent.__c.runVoidMethod ("WaitFor","jobdone", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "settings", "executehttp"), (_j));
this.state = 21;
return;
case 21:
//C
this.state = 9;
_j = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("j", _j);
;
 BA.debugLineNum = 751;BA.debugLine="If j.Success Then";
Debug.ShouldStop(16384);
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
 BA.debugLineNum = 752;BA.debugLine="HandleGotText(typ, url, j.GetString)";
Debug.ShouldStop(32768);
__ref.runClassMethod (b4a.example.settings.class, "_handlegottext" /*RemoteObject*/ ,(Object)(_typ),(Object)(_url),(Object)(_j.runClassMethod (b4a.example.httpjob.class, "_getstring" /*RemoteObject*/ )));
 if (true) break;

case 13:
//C
this.state = 14;
 BA.debugLineNum = 754;BA.debugLine="If j.ErrorMessage.ToLowerCase.Contains(\"unable t";
Debug.ShouldStop(131072);
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
 BA.debugLineNum = 755;BA.debugLine="setzeOffline";
Debug.ShouldStop(262144);
__ref.runClassMethod (b4a.example.settings.class, "_setzeoffline" /*void*/ );
 if (true) break;

case 18:
//C
this.state = 19;
 BA.debugLineNum = 757;BA.debugLine="ToastMessageShow(\"Fehler: \" & j.ErrorMessage, T";
Debug.ShouldStop(1048576);
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
 BA.debugLineNum = 760;BA.debugLine="j.Release";
Debug.ShouldStop(8388608);
_j.runClassMethod (b4a.example.httpjob.class, "_release" /*RemoteObject*/ );
 BA.debugLineNum = 761;BA.debugLine="startTimer";
Debug.ShouldStop(16777216);
__ref.runClassMethod (b4a.example.settings.class, "_starttimer" /*RemoteObject*/ );
 BA.debugLineNum = 762;BA.debugLine="End Sub";
Debug.ShouldStop(33554432);
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
		Debug.PushSubsStack("FormatDateCustom (settings) ","settings",3,__ref.getField(false, "ba"),__ref,1077);
if (RapidSub.canDelegate("formatdatecustom")) { return __ref.runUserSub(false, "settings","formatdatecustom", __ref, _ticks, _pattern);}
RemoteObject _oldformat = RemoteObject.createImmutable("");
RemoteObject _res = RemoteObject.createImmutable("");
Debug.locals.put("ticks", _ticks);
Debug.locals.put("pattern", _pattern);
 BA.debugLineNum = 1077;BA.debugLine="Private Sub FormatDateCustom(ticks As Long, patter";
Debug.ShouldStop(1048576);
 BA.debugLineNum = 1078;BA.debugLine="Dim oldFormat As String = DateTime.DateFormat";
Debug.ShouldStop(2097152);
_oldformat = settings.__c.getField(false,"DateTime").runMethod(true,"getDateFormat");Debug.locals.put("oldformat", _oldformat);Debug.locals.put("oldFormat", _oldformat);
 BA.debugLineNum = 1079;BA.debugLine="DateTime.DateFormat = pattern";
Debug.ShouldStop(4194304);
settings.__c.getField(false,"DateTime").runMethod(true,"setDateFormat",_pattern);
 BA.debugLineNum = 1080;BA.debugLine="Dim res As String = DateTime.Date(ticks)";
Debug.ShouldStop(8388608);
_res = settings.__c.getField(false,"DateTime").runMethod(true,"Date",(Object)(_ticks));Debug.locals.put("res", _res);Debug.locals.put("res", _res);
 BA.debugLineNum = 1081;BA.debugLine="DateTime.DateFormat = oldFormat";
Debug.ShouldStop(16777216);
settings.__c.getField(false,"DateTime").runMethod(true,"setDateFormat",_oldformat);
 BA.debugLineNum = 1082;BA.debugLine="Return res";
Debug.ShouldStop(33554432);
if (true) return _res;
 BA.debugLineNum = 1083;BA.debugLine="End Sub";
Debug.ShouldStop(67108864);
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
		Debug.PushSubsStack("HandleGotText (settings) ","settings",3,__ref.getField(false, "ba"),__ref,764);
if (RapidSub.canDelegate("handlegottext")) { return __ref.runUserSub(false, "settings","handlegottext", __ref, _typ, _requrl, _responsecontent);}
RemoteObject _jp = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.JSONParser");
Debug.locals.put("typ", _typ);
Debug.locals.put("reqUrl", _requrl);
Debug.locals.put("responseContent", _responsecontent);
 BA.debugLineNum = 764;BA.debugLine="Private Sub HandleGotText(typ As String, reqUrl As";
Debug.ShouldStop(134217728);
 BA.debugLineNum = 765;BA.debugLine="Dim jp As JSONParser";
Debug.ShouldStop(268435456);
_jp = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.JSONParser");Debug.locals.put("jp", _jp);
 BA.debugLineNum = 767;BA.debugLine="Select typ";
Debug.ShouldStop(1073741824);
switch (BA.switchObjectToInt(_typ,BA.ObjectToString("Teilnehmer"),BA.ObjectToString("Veranstaltungen"),BA.ObjectToString("addVSTNG"),BA.ObjectToString("addTLN"),BA.ObjectToString("delTeilnehmer"),BA.ObjectToString("delVeranstaltung"),BA.ObjectToString("delErgebnis"))) {
case 0: {
 BA.debugLineNum = 769;BA.debugLine="DBdatenTyp = \"\"";
Debug.ShouldStop(1);
__ref.setField ("_dbdatentyp" /*RemoteObject*/ ,BA.ObjectToString(""));
 BA.debugLineNum = 770;BA.debugLine="ladeTeilnehmer(responseContent)";
Debug.ShouldStop(2);
__ref.runClassMethod (b4a.example.settings.class, "_ladeteilnehmer" /*RemoteObject*/ ,(Object)(_responsecontent));
 break; }
case 1: {
 BA.debugLineNum = 773;BA.debugLine="If responseContent = \"null\" Or responseContent";
Debug.ShouldStop(16);
if (RemoteObject.solveBoolean("=",_responsecontent,BA.ObjectToString("null")) || RemoteObject.solveBoolean("=",_responsecontent,BA.ObjectToString(""))) { 
 BA.debugLineNum = 774;BA.debugLine="Veranstaltungen.Initialize";
Debug.ShouldStop(32);
__ref.getField(false,"_veranstaltungen" /*RemoteObject*/ ).runVoidMethod ("Initialize");
 }else {
 BA.debugLineNum = 776;BA.debugLine="jp.Initialize(responseContent)";
Debug.ShouldStop(128);
_jp.runVoidMethod ("Initialize",(Object)(_responsecontent));
 BA.debugLineNum = 777;BA.debugLine="Veranstaltungen = jp.NextObject";
Debug.ShouldStop(256);
__ref.setField ("_veranstaltungen" /*RemoteObject*/ ,_jp.runMethod(false,"NextObject"));
 };
 BA.debugLineNum = 779;BA.debugLine="pruefeDBVerein";
Debug.ShouldStop(1024);
__ref.runClassMethod (b4a.example.settings.class, "_pruefedbverein" /*RemoteObject*/ );
 BA.debugLineNum = 780;BA.debugLine="ZeigeVeranstaltungenCLV";
Debug.ShouldStop(2048);
__ref.runClassMethod (b4a.example.settings.class, "_zeigeveranstaltungenclv" /*RemoteObject*/ );
 BA.debugLineNum = 781;BA.debugLine="DBdatenTyp = \"\"";
Debug.ShouldStop(4096);
__ref.setField ("_dbdatentyp" /*RemoteObject*/ ,BA.ObjectToString(""));
 BA.debugLineNum = 782;BA.debugLine="holeTLN";
Debug.ShouldStop(8192);
__ref.runClassMethod (b4a.example.settings.class, "_holetln" /*RemoteObject*/ );
 break; }
case 2: {
 BA.debugLineNum = 785;BA.debugLine="DBdatenTyp = \"\"";
Debug.ShouldStop(65536);
__ref.setField ("_dbdatentyp" /*RemoteObject*/ ,BA.ObjectToString(""));
 BA.debugLineNum = 786;BA.debugLine="holeVeranstaltungen";
Debug.ShouldStop(131072);
__ref.runClassMethod (b4a.example.settings.class, "_holeveranstaltungen" /*RemoteObject*/ );
 break; }
case 3: {
 BA.debugLineNum = 789;BA.debugLine="DBdatenTyp = \"\"";
Debug.ShouldStop(1048576);
__ref.setField ("_dbdatentyp" /*RemoteObject*/ ,BA.ObjectToString(""));
 BA.debugLineNum = 790;BA.debugLine="holeTLN";
Debug.ShouldStop(2097152);
__ref.runClassMethod (b4a.example.settings.class, "_holetln" /*RemoteObject*/ );
 break; }
case 4: {
 BA.debugLineNum = 793;BA.debugLine="DBdatenTyp = \"\"";
Debug.ShouldStop(16777216);
__ref.setField ("_dbdatentyp" /*RemoteObject*/ ,BA.ObjectToString(""));
 BA.debugLineNum = 794;BA.debugLine="TLNid = \"t0\"";
Debug.ShouldStop(33554432);
__ref.setField ("_tlnid" /*RemoteObject*/ ,BA.ObjectToString("t0"));
 BA.debugLineNum = 795;BA.debugLine="holeTLN";
Debug.ShouldStop(67108864);
__ref.runClassMethod (b4a.example.settings.class, "_holetln" /*RemoteObject*/ );
 break; }
case 5: {
 BA.debugLineNum = 798;BA.debugLine="DBdatenTyp = \"\"";
Debug.ShouldStop(536870912);
__ref.setField ("_dbdatentyp" /*RemoteObject*/ ,BA.ObjectToString(""));
 BA.debugLineNum = 799;BA.debugLine="If webviewVSTGN_ID = DBGet(\"VeranstaltungID\", \"";
Debug.ShouldStop(1073741824);
if (RemoteObject.solveBoolean("=",__ref.getField(true,"_webviewvstgn_id" /*RemoteObject*/ ),BA.ObjectToString(__ref.runClassMethod (b4a.example.settings.class, "_dbget" /*RemoteObject*/ ,(Object)(BA.ObjectToString("VeranstaltungID")),(Object)((RemoteObject.createImmutable("v0"))))))) { 
 BA.debugLineNum = 800;BA.debugLine="Veranstaltung_ID = \"v0\"";
Debug.ShouldStop(-2147483648);
__ref.setField ("_veranstaltung_id" /*RemoteObject*/ ,BA.ObjectToString("v0"));
 BA.debugLineNum = 801;BA.debugLine="webviewVSTGN_ID = \"v0\"";
Debug.ShouldStop(1);
__ref.setField ("_webviewvstgn_id" /*RemoteObject*/ ,BA.ObjectToString("v0"));
 BA.debugLineNum = 802;BA.debugLine="DBPut(\"VeranstaltungID\", \"v0\")";
Debug.ShouldStop(2);
__ref.runClassMethod (b4a.example.settings.class, "_dbput" /*RemoteObject*/ ,(Object)(BA.ObjectToString("VeranstaltungID")),(Object)((RemoteObject.createImmutable("v0"))));
 };
 BA.debugLineNum = 804;BA.debugLine="holeVeranstaltungen";
Debug.ShouldStop(8);
__ref.runClassMethod (b4a.example.settings.class, "_holeveranstaltungen" /*RemoteObject*/ );
 break; }
case 6: {
 BA.debugLineNum = 807;BA.debugLine="DBdatenTyp = \"\"";
Debug.ShouldStop(64);
__ref.setField ("_dbdatentyp" /*RemoteObject*/ ,BA.ObjectToString(""));
 BA.debugLineNum = 808;BA.debugLine="delVeranstaltung(webviewVSTGN_ID)";
Debug.ShouldStop(128);
__ref.runClassMethod (b4a.example.settings.class, "_delveranstaltung" /*RemoteObject*/ ,(Object)(__ref.getField(true,"_webviewvstgn_id" /*RemoteObject*/ )));
 break; }
default: {
 BA.debugLineNum = 811;BA.debugLine="MsgboxAsync(\"(\" & DBdatenTyp & \")\" & reqUrl, \"D";
Debug.ShouldStop(1024);
settings.__c.runVoidMethod ("MsgboxAsync",(Object)(BA.ObjectToCharSequence(RemoteObject.concat(RemoteObject.createImmutable("("),__ref.getField(true,"_dbdatentyp" /*RemoteObject*/ ),RemoteObject.createImmutable(")"),_requrl))),(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("Da stimmt etwas nicht!"))),__ref.getField(false, "ba"));
 break; }
}
;
 BA.debugLineNum = 813;BA.debugLine="End Sub";
Debug.ShouldStop(4096);
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
		Debug.PushSubsStack("HideKeyboard (settings) ","settings",3,__ref.getField(false, "ba"),__ref,1085);
if (RapidSub.canDelegate("hidekeyboard")) { return __ref.runUserSub(false, "settings","hidekeyboard", __ref);}
RemoteObject _p = RemoteObject.declareNull("anywheresoftware.b4a.phone.Phone");
 BA.debugLineNum = 1085;BA.debugLine="Private Sub HideKeyboard";
Debug.ShouldStop(268435456);
 BA.debugLineNum = 1086;BA.debugLine="Dim p As Phone";
Debug.ShouldStop(536870912);
_p = RemoteObject.createNew ("anywheresoftware.b4a.phone.Phone");Debug.locals.put("p", _p);
 BA.debugLineNum = 1087;BA.debugLine="p.HideKeyboard(B4XPages.GetNativeParent(Me))";
Debug.ShouldStop(1073741824);
_p.runVoidMethod ("HideKeyboard",(Object)(settings._b4xpages.runMethod(false,"_getnativeparent" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(__ref))));
 BA.debugLineNum = 1088;BA.debugLine="End Sub";
Debug.ShouldStop(-2147483648);
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
		Debug.PushSubsStack("holeTLN (settings) ","settings",3,__ref.getField(false, "ba"),__ref,643);
if (RapidSub.canDelegate("holetln")) { return __ref.runUserSub(false, "settings","holetln", __ref);}
 BA.debugLineNum = 643;BA.debugLine="Private Sub holeTLN";
Debug.ShouldStop(4);
 BA.debugLineNum = 644;BA.debugLine="DBdatenTyp = \"Teilnehmer\"";
Debug.ShouldStop(8);
__ref.setField ("_dbdatentyp" /*RemoteObject*/ ,BA.ObjectToString("Teilnehmer"));
 BA.debugLineNum = 645;BA.debugLine="CurrentWebUrl = URLteilnehmer & \".json?auth=\" & S";
Debug.ShouldStop(16);
__ref.setField ("_currentweburl" /*RemoteObject*/ ,RemoteObject.concat(__ref.getField(true,"_urlteilnehmer" /*RemoteObject*/ ),RemoteObject.createImmutable(".json?auth="),__ref.getField(false,"_status" /*RemoteObject*/ ).runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("idToken"))),(Object)((RemoteObject.createImmutable(""))))));
 BA.debugLineNum = 646;BA.debugLine="ExecuteHttp(\"GET\", CurrentWebUrl, \"\")";
Debug.ShouldStop(32);
__ref.runClassMethod (b4a.example.settings.class, "_executehttp" /*void*/ ,(Object)(BA.ObjectToString("GET")),(Object)(__ref.getField(true,"_currentweburl" /*RemoteObject*/ )),(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 647;BA.debugLine="End Sub";
Debug.ShouldStop(64);
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
		Debug.PushSubsStack("holeVeranstaltungen (settings) ","settings",3,__ref.getField(false, "ba"),__ref,452);
if (RapidSub.canDelegate("holeveranstaltungen")) { return __ref.runUserSub(false, "settings","holeveranstaltungen", __ref);}
 BA.debugLineNum = 452;BA.debugLine="Private Sub holeVeranstaltungen";
Debug.ShouldStop(8);
 BA.debugLineNum = 453;BA.debugLine="DBdatenTyp = \"Veranstaltungen\"";
Debug.ShouldStop(16);
__ref.setField ("_dbdatentyp" /*RemoteObject*/ ,BA.ObjectToString("Veranstaltungen"));
 BA.debugLineNum = 454;BA.debugLine="CurrentWebUrl = URLveranstaltungen & \".json?auth=";
Debug.ShouldStop(32);
__ref.setField ("_currentweburl" /*RemoteObject*/ ,RemoteObject.concat(__ref.getField(true,"_urlveranstaltungen" /*RemoteObject*/ ),RemoteObject.createImmutable(".json?auth="),__ref.getField(false,"_status" /*RemoteObject*/ ).runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("idToken"))),(Object)((RemoteObject.createImmutable(""))))));
 BA.debugLineNum = 455;BA.debugLine="ExecuteHttp(\"GET\", CurrentWebUrl, \"\")";
Debug.ShouldStop(64);
__ref.runClassMethod (b4a.example.settings.class, "_executehttp" /*void*/ ,(Object)(BA.ObjectToString("GET")),(Object)(__ref.getField(true,"_currentweburl" /*RemoteObject*/ )),(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 456;BA.debugLine="End Sub";
Debug.ShouldStop(128);
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
		Debug.PushSubsStack("ladeTeilnehmer (settings) ","settings",3,__ref.getField(false, "ba"),__ref,649);
if (RapidSub.canDelegate("ladeteilnehmer")) { return __ref.runUserSub(false, "settings","ladeteilnehmer", __ref, _response);}
RemoteObject _jp = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.JSONParser");
RemoteObject _teilnehmerliste = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _key = RemoteObject.createImmutable("");
RemoteObject _newid = RemoteObject.createImmutable(0);
RemoteObject _curmax = RemoteObject.createImmutable(0);
RemoteObject _tmap = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
Debug.locals.put("response", _response);
 BA.debugLineNum = 649;BA.debugLine="Private Sub ladeTeilnehmer(response As String)";
Debug.ShouldStop(256);
 BA.debugLineNum = 650;BA.debugLine="Teilnehmer.Initialize";
Debug.ShouldStop(512);
__ref.getField(false,"_teilnehmer" /*RemoteObject*/ ).runVoidMethod ("Initialize");
 BA.debugLineNum = 651;BA.debugLine="If response <> \"\" And response <> \"null\" Then";
Debug.ShouldStop(1024);
if (RemoteObject.solveBoolean("!",_response,BA.ObjectToString("")) && RemoteObject.solveBoolean("!",_response,BA.ObjectToString("null"))) { 
 BA.debugLineNum = 652;BA.debugLine="Dim jp As JSONParser";
Debug.ShouldStop(2048);
_jp = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.JSONParser");Debug.locals.put("jp", _jp);
 BA.debugLineNum = 653;BA.debugLine="jp.Initialize(response)";
Debug.ShouldStop(4096);
_jp.runVoidMethod ("Initialize",(Object)(_response));
 BA.debugLineNum = 654;BA.debugLine="Dim teilnehmerliste As Map = jp.NextObject";
Debug.ShouldStop(8192);
_teilnehmerliste = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_teilnehmerliste = _jp.runMethod(false,"NextObject");Debug.locals.put("teilnehmerliste", _teilnehmerliste);Debug.locals.put("teilnehmerliste", _teilnehmerliste);
 BA.debugLineNum = 656;BA.debugLine="For Each key As String In teilnehmerliste.Keys";
Debug.ShouldStop(32768);
{
final RemoteObject group6 = _teilnehmerliste.runMethod(false,"Keys");
final int groupLen6 = group6.runMethod(true,"getSize").<Integer>get()
;int index6 = 0;
;
for (; index6 < groupLen6;index6++){
_key = BA.ObjectToString(group6.runMethod(false,"Get",index6));Debug.locals.put("key", _key);
Debug.locals.put("key", _key);
 BA.debugLineNum = 657;BA.debugLine="Dim newID As Int = key.Replace(\"t\", \"\") + 1";
Debug.ShouldStop(65536);
_newid = BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {BA.numberCast(double.class, _key.runMethod(true,"replace",(Object)(BA.ObjectToString("t")),(Object)(RemoteObject.createImmutable("")))),RemoteObject.createImmutable(1)}, "+",1, 0));Debug.locals.put("newid", _newid);Debug.locals.put("newID", _newid);
 BA.debugLineNum = 658;BA.debugLine="Dim curMax As Int = TLNnewID.Replace(\"t\", \"\")";
Debug.ShouldStop(131072);
_curmax = BA.numberCast(int.class, __ref.getField(true,"_tlnnewid" /*RemoteObject*/ ).runMethod(true,"replace",(Object)(BA.ObjectToString("t")),(Object)(RemoteObject.createImmutable(""))));Debug.locals.put("curmax", _curmax);Debug.locals.put("curMax", _curmax);
 BA.debugLineNum = 659;BA.debugLine="If newID > curMax Then";
Debug.ShouldStop(262144);
if (RemoteObject.solveBoolean(">",_newid,BA.numberCast(double.class, _curmax))) { 
 BA.debugLineNum = 660;BA.debugLine="TLNnewID = \"t\" & newID";
Debug.ShouldStop(524288);
__ref.setField ("_tlnnewid" /*RemoteObject*/ ,RemoteObject.concat(RemoteObject.createImmutable("t"),_newid));
 };
 BA.debugLineNum = 662;BA.debugLine="Dim tMap As Map = teilnehmerliste.Get(key)";
Debug.ShouldStop(2097152);
_tmap = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_tmap = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), _teilnehmerliste.runMethod(false,"Get",(Object)((_key))));Debug.locals.put("tmap", _tmap);Debug.locals.put("tMap", _tmap);
 BA.debugLineNum = 663;BA.debugLine="Teilnehmer.AddAll(Array As Object(tMap.GetDefau";
Debug.ShouldStop(4194304);
__ref.getField(false,"_teilnehmer" /*RemoteObject*/ ).runVoidMethod ("AddAll",(Object)(settings.__c.runMethod(false, "ArrayToList", (Object)(RemoteObject.createNewArray("Object",new int[] {2},new Object[] {_tmap.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("Name"))),(Object)((RemoteObject.createImmutable("unbenannt")))),(_key)})))));
 }
}Debug.locals.put("key", _key);
;
 BA.debugLineNum = 665;BA.debugLine="Teilnehmer.Add(TLNid)";
Debug.ShouldStop(16777216);
__ref.getField(false,"_teilnehmer" /*RemoteObject*/ ).runVoidMethod ("Add",(Object)((__ref.getField(true,"_tlnid" /*RemoteObject*/ ))));
 };
 BA.debugLineNum = 667;BA.debugLine="ZeigeTeilnehmerCLV";
Debug.ShouldStop(67108864);
__ref.runClassMethod (b4a.example.settings.class, "_zeigeteilnehmerclv" /*RemoteObject*/ );
 BA.debugLineNum = 668;BA.debugLine="End Sub";
Debug.ShouldStop(134217728);
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
		Debug.PushSubsStack("ladeVeranstaltungen (settings) ","settings",3,__ref.getField(false, "ba"),__ref,458);
if (RapidSub.canDelegate("ladeveranstaltungen")) { return __ref.runUserSub(false, "settings","ladeveranstaltungen", __ref);}
RemoteObject _key = RemoteObject.createImmutable("");
RemoteObject _newid = RemoteObject.createImmutable(0);
RemoteObject _curmax = RemoteObject.createImmutable(0);
RemoteObject _ergebnis = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
 BA.debugLineNum = 458;BA.debugLine="Private Sub ladeVeranstaltungen";
Debug.ShouldStop(512);
 BA.debugLineNum = 459;BA.debugLine="dprDatum.Enabled = True";
Debug.ShouldStop(1024);
__ref.getField(false,"_dprdatum" /*RemoteObject*/ ).runMethod(true,"setEnabled",settings.__c.getField(true,"True"));
 BA.debugLineNum = 460;BA.debugLine="dprDatum.TextColor = colorgreen";
Debug.ShouldStop(2048);
__ref.getField(false,"_dprdatum" /*RemoteObject*/ ).runMethod(true,"setTextColor",__ref.getField(true,"_colorgreen" /*RemoteObject*/ ));
 BA.debugLineNum = 461;BA.debugLine="dprDatum.Text = FormatDateCustom(DateTime.Now, \"d";
Debug.ShouldStop(4096);
__ref.getField(false,"_dprdatum" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToCharSequence(__ref.runClassMethod (b4a.example.settings.class, "_formatdatecustom" /*RemoteObject*/ ,(Object)(settings.__c.getField(false,"DateTime").runMethod(true,"getNow")),(Object)(RemoteObject.createImmutable("dd.MM.yyyy")))));
 BA.debugLineNum = 462;BA.debugLine="dprYear = DateTime.GetYear(DateTime.Now)";
Debug.ShouldStop(8192);
__ref.setField ("_dpryear" /*RemoteObject*/ ,settings.__c.getField(false,"DateTime").runMethod(true,"GetYear",(Object)(settings.__c.getField(false,"DateTime").runMethod(true,"getNow"))));
 BA.debugLineNum = 463;BA.debugLine="dprMonth = DateTime.GetMonth(DateTime.Now)";
Debug.ShouldStop(16384);
__ref.setField ("_dprmonth" /*RemoteObject*/ ,settings.__c.getField(false,"DateTime").runMethod(true,"GetMonth",(Object)(settings.__c.getField(false,"DateTime").runMethod(true,"getNow"))));
 BA.debugLineNum = 464;BA.debugLine="dprDay = DateTime.GetDayOfMonth(DateTime.Now)";
Debug.ShouldStop(32768);
__ref.setField ("_dprday" /*RemoteObject*/ ,settings.__c.getField(false,"DateTime").runMethod(true,"GetDayOfMonth",(Object)(settings.__c.getField(false,"DateTime").runMethod(true,"getNow"))));
 BA.debugLineNum = 466;BA.debugLine="webviewVSTGN.Initialize";
Debug.ShouldStop(131072);
__ref.getField(false,"_webviewvstgn" /*RemoteObject*/ ).runVoidMethod ("Initialize");
 BA.debugLineNum = 467;BA.debugLine="webviewVSTGN.AddAll(Array As Object(\"Datum\", \"Nam";
Debug.ShouldStop(262144);
__ref.getField(false,"_webviewvstgn" /*RemoteObject*/ ).runVoidMethod ("AddAll",(Object)(settings.__c.runMethod(false, "ArrayToList", (Object)(RemoteObject.createNewArray("Object",new int[] {3},new Object[] {RemoteObject.createImmutable(("Datum")),RemoteObject.createImmutable(("Name")),(RemoteObject.createImmutable("vid"))})))));
 BA.debugLineNum = 469;BA.debugLine="If Not(Veranstaltungen.IsInitialized) Or Veransta";
Debug.ShouldStop(1048576);
if (RemoteObject.solveBoolean(".",settings.__c.runMethod(true,"Not",(Object)(__ref.getField(false,"_veranstaltungen" /*RemoteObject*/ ).runMethod(true,"IsInitialized")))) || RemoteObject.solveBoolean("=",__ref.getField(false,"_veranstaltungen" /*RemoteObject*/ ).runMethod(true,"getSize"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 470;BA.debugLine="Veranstaltung_ID = \"v0\"";
Debug.ShouldStop(2097152);
__ref.setField ("_veranstaltung_id" /*RemoteObject*/ ,BA.ObjectToString("v0"));
 BA.debugLineNum = 471;BA.debugLine="webviewVSTGN_ID = \"v0\"";
Debug.ShouldStop(4194304);
__ref.setField ("_webviewvstgn_id" /*RemoteObject*/ ,BA.ObjectToString("v0"));
 BA.debugLineNum = 472;BA.debugLine="VSTGNnewID = \"v1\"";
Debug.ShouldStop(8388608);
__ref.setField ("_vstgnnewid" /*RemoteObject*/ ,BA.ObjectToString("v1"));
 BA.debugLineNum = 473;BA.debugLine="webviewVSTGN.AddAll(Array As Object(\"Veranstaltu";
Debug.ShouldStop(16777216);
__ref.getField(false,"_webviewvstgn" /*RemoteObject*/ ).runVoidMethod ("AddAll",(Object)(settings.__c.runMethod(false, "ArrayToList", (Object)(RemoteObject.createNewArray("Object",new int[] {2},new Object[] {RemoteObject.createImmutable(("Veranstaltungs_ID")),(RemoteObject.createImmutable("v0"))})))));
 BA.debugLineNum = 474;BA.debugLine="setzeVeranstaltung(\"v0\")";
Debug.ShouldStop(33554432);
__ref.runClassMethod (b4a.example.settings.class, "_setzeveranstaltung" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("v0")));
 }else {
 BA.debugLineNum = 476;BA.debugLine="For Each key As String In Veranstaltungen.Keys";
Debug.ShouldStop(134217728);
{
final RemoteObject group16 = __ref.getField(false,"_veranstaltungen" /*RemoteObject*/ ).runMethod(false,"Keys");
final int groupLen16 = group16.runMethod(true,"getSize").<Integer>get()
;int index16 = 0;
;
for (; index16 < groupLen16;index16++){
_key = BA.ObjectToString(group16.runMethod(false,"Get",index16));Debug.locals.put("key", _key);
Debug.locals.put("key", _key);
 BA.debugLineNum = 477;BA.debugLine="Dim newID As Int = key.Replace(\"v\", \"\") + 1";
Debug.ShouldStop(268435456);
_newid = BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {BA.numberCast(double.class, _key.runMethod(true,"replace",(Object)(BA.ObjectToString("v")),(Object)(RemoteObject.createImmutable("")))),RemoteObject.createImmutable(1)}, "+",1, 0));Debug.locals.put("newid", _newid);Debug.locals.put("newID", _newid);
 BA.debugLineNum = 478;BA.debugLine="Dim curMax As Int = VSTGNnewID.Replace(\"v\", \"\")";
Debug.ShouldStop(536870912);
_curmax = BA.numberCast(int.class, __ref.getField(true,"_vstgnnewid" /*RemoteObject*/ ).runMethod(true,"replace",(Object)(BA.ObjectToString("v")),(Object)(RemoteObject.createImmutable(""))));Debug.locals.put("curmax", _curmax);Debug.locals.put("curMax", _curmax);
 BA.debugLineNum = 479;BA.debugLine="If newID > curMax Then";
Debug.ShouldStop(1073741824);
if (RemoteObject.solveBoolean(">",_newid,BA.numberCast(double.class, _curmax))) { 
 BA.debugLineNum = 480;BA.debugLine="VSTGNnewID = \"v\" & newID";
Debug.ShouldStop(-2147483648);
__ref.setField ("_vstgnnewid" /*RemoteObject*/ ,RemoteObject.concat(RemoteObject.createImmutable("v"),_newid));
 };
 BA.debugLineNum = 482;BA.debugLine="Dim ergebnis As Map = Veranstaltungen.Get(key)";
Debug.ShouldStop(2);
_ergebnis = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_ergebnis = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), __ref.getField(false,"_veranstaltungen" /*RemoteObject*/ ).runMethod(false,"Get",(Object)((_key))));Debug.locals.put("ergebnis", _ergebnis);Debug.locals.put("ergebnis", _ergebnis);
 BA.debugLineNum = 483;BA.debugLine="webviewVSTGN.AddAll(Array As Object( _ 				erge";
Debug.ShouldStop(4);
__ref.getField(false,"_webviewvstgn" /*RemoteObject*/ ).runVoidMethod ("AddAll",(Object)(settings.__c.runMethod(false, "ArrayToList", (Object)(RemoteObject.createNewArray("Object",new int[] {3},new Object[] {_ergebnis.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("Datum"))),(Object)((__ref.runClassMethod (b4a.example.settings.class, "_formatdatecustom" /*RemoteObject*/ ,(Object)(settings.__c.getField(false,"DateTime").runMethod(true,"getNow")),(Object)(RemoteObject.createImmutable("dd.MM.yyyy")))))),_ergebnis.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("Name"))),(Object)((RemoteObject.createImmutable("- n.n. -")))),(_key)})))));
 }
}Debug.locals.put("key", _key);
;
 BA.debugLineNum = 488;BA.debugLine="webviewVSTGN.AddAll(Array As Object(\"Veranstaltu";
Debug.ShouldStop(128);
__ref.getField(false,"_webviewvstgn" /*RemoteObject*/ ).runVoidMethod ("AddAll",(Object)(settings.__c.runMethod(false, "ArrayToList", (Object)(RemoteObject.createNewArray("Object",new int[] {2},new Object[] {RemoteObject.createImmutable(("Veranstaltungs_ID")),(__ref.getField(true,"_webviewvstgn_id" /*RemoteObject*/ ))})))));
 };
 BA.debugLineNum = 490;BA.debugLine="End Sub";
Debug.ShouldStop(512);
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
		Debug.PushSubsStack("LoadTinyDB (settings) ","settings",3,__ref.getField(false, "ba"),__ref,1090);
if (RapidSub.canDelegate("loadtinydb")) { return __ref.runUserSub(false, "settings","loadtinydb", __ref);}
 BA.debugLineNum = 1090;BA.debugLine="Private Sub LoadTinyDB";
Debug.ShouldStop(2);
 BA.debugLineNum = 1091;BA.debugLine="If File.Exists(File.DirInternal, DBFileName) Then";
Debug.ShouldStop(4);
if (settings.__c.getField(false,"File").runMethod(true,"Exists",(Object)(settings.__c.getField(false,"File").runMethod(true,"getDirInternal")),(Object)(__ref.getField(true,"_dbfilename" /*RemoteObject*/ ))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 1092;BA.debugLine="DBVerein = File.ReadMap(File.DirInternal, DBFile";
Debug.ShouldStop(8);
__ref.setField ("_dbverein" /*RemoteObject*/ ,settings.__c.getField(false,"File").runMethod(false,"ReadMap",(Object)(settings.__c.getField(false,"File").runMethod(true,"getDirInternal")),(Object)(__ref.getField(true,"_dbfilename" /*RemoteObject*/ ))));
 }else {
 BA.debugLineNum = 1094;BA.debugLine="DBVerein.Initialize";
Debug.ShouldStop(32);
__ref.getField(false,"_dbverein" /*RemoteObject*/ ).runVoidMethod ("Initialize");
 };
 BA.debugLineNum = 1096;BA.debugLine="End Sub";
Debug.ShouldStop(128);
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
		Debug.PushSubsStack("lstVeranstaltungen_ItemClick (settings) ","settings",3,__ref.getField(false, "ba"),__ref,1173);
if (RapidSub.canDelegate("lstveranstaltungen_itemclick")) { return __ref.runUserSub(false, "settings","lstveranstaltungen_itemclick", __ref, _position, _value);}
Debug.locals.put("Position", _position);
Debug.locals.put("Value", _value);
 BA.debugLineNum = 1173;BA.debugLine="Private Sub lstVeranstaltungen_ItemClick (Position";
Debug.ShouldStop(1048576);
 BA.debugLineNum = 1175;BA.debugLine="webviewVSTGN_ID = Value";
Debug.ShouldStop(4194304);
__ref.setField ("_webviewvstgn_id" /*RemoteObject*/ ,BA.ObjectToString(_value));
 BA.debugLineNum = 1177;BA.debugLine="setzeVeranstaltung(webviewVSTGN_ID)";
Debug.ShouldStop(16777216);
__ref.runClassMethod (b4a.example.settings.class, "_setzeveranstaltung" /*RemoteObject*/ ,(Object)(__ref.getField(true,"_webviewvstgn_id" /*RemoteObject*/ )));
 BA.debugLineNum = 1179;BA.debugLine="End Sub";
Debug.ShouldStop(67108864);
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
		Debug.PushSubsStack("pruefeDBVerein (settings) ","settings",3,__ref.getField(false, "ba"),__ref,535);
if (RapidSub.canDelegate("pruefedbverein")) { return __ref.runUserSub(false, "settings","pruefedbverein", __ref);}
RemoteObject _vstngexists = RemoteObject.createImmutable(false);
RemoteObject _savedid = RemoteObject.createImmutable("");
RemoteObject _key = RemoteObject.createImmutable("");
 BA.debugLineNum = 535;BA.debugLine="Private Sub pruefeDBVerein";
Debug.ShouldStop(4194304);
 BA.debugLineNum = 536;BA.debugLine="Dim VSTNGexists As Boolean = False";
Debug.ShouldStop(8388608);
_vstngexists = settings.__c.getField(true,"False");Debug.locals.put("vstngexists", _vstngexists);Debug.locals.put("VSTNGexists", _vstngexists);
 BA.debugLineNum = 537;BA.debugLine="Dim savedID As String = DBGet(\"VeranstaltungID\",";
Debug.ShouldStop(16777216);
_savedid = BA.ObjectToString(__ref.runClassMethod (b4a.example.settings.class, "_dbget" /*RemoteObject*/ ,(Object)(BA.ObjectToString("VeranstaltungID")),(Object)((RemoteObject.createImmutable("v0")))));Debug.locals.put("savedid", _savedid);Debug.locals.put("savedID", _savedid);
 BA.debugLineNum = 539;BA.debugLine="If Veranstaltungen.IsInitialized And Veranstaltun";
Debug.ShouldStop(67108864);
if (RemoteObject.solveBoolean(".",__ref.getField(false,"_veranstaltungen" /*RemoteObject*/ ).runMethod(true,"IsInitialized")) && RemoteObject.solveBoolean(">",__ref.getField(false,"_veranstaltungen" /*RemoteObject*/ ).runMethod(true,"getSize"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 540;BA.debugLine="For Each key As String In Veranstaltungen.Keys";
Debug.ShouldStop(134217728);
{
final RemoteObject group4 = __ref.getField(false,"_veranstaltungen" /*RemoteObject*/ ).runMethod(false,"Keys");
final int groupLen4 = group4.runMethod(true,"getSize").<Integer>get()
;int index4 = 0;
;
for (; index4 < groupLen4;index4++){
_key = BA.ObjectToString(group4.runMethod(false,"Get",index4));Debug.locals.put("key", _key);
Debug.locals.put("key", _key);
 BA.debugLineNum = 541;BA.debugLine="webviewVSTGN_ID = key";
Debug.ShouldStop(268435456);
__ref.setField ("_webviewvstgn_id" /*RemoteObject*/ ,_key);
 BA.debugLineNum = 542;BA.debugLine="If key = savedID Then";
Debug.ShouldStop(536870912);
if (RemoteObject.solveBoolean("=",_key,_savedid)) { 
 BA.debugLineNum = 543;BA.debugLine="VSTNGexists = True";
Debug.ShouldStop(1073741824);
_vstngexists = settings.__c.getField(true,"True");Debug.locals.put("VSTNGexists", _vstngexists);
 BA.debugLineNum = 544;BA.debugLine="Exit";
Debug.ShouldStop(-2147483648);
if (true) break;
 };
 }
}Debug.locals.put("key", _key);
;
 };
 BA.debugLineNum = 549;BA.debugLine="If Not(VSTNGexists) Then";
Debug.ShouldStop(16);
if (settings.__c.runMethod(true,"Not",(Object)(_vstngexists)).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 550;BA.debugLine="lblVeranstaltung.Text = \"- noch nicht ausgewählt";
Debug.ShouldStop(32);
__ref.getField(false,"_lblveranstaltung" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToCharSequence("- noch nicht ausgewählt -"));
 BA.debugLineNum = 551;BA.debugLine="lblDatum.Text = \"- bitte auswählen -\"";
Debug.ShouldStop(64);
__ref.getField(false,"_lbldatum" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToCharSequence("- bitte auswählen -"));
 BA.debugLineNum = 552;BA.debugLine="Veranstaltung_ID = \"v0\"";
Debug.ShouldStop(128);
__ref.setField ("_veranstaltung_id" /*RemoteObject*/ ,BA.ObjectToString("v0"));
 BA.debugLineNum = 553;BA.debugLine="VSTGNnewID = \"v1\"";
Debug.ShouldStop(256);
__ref.setField ("_vstgnnewid" /*RemoteObject*/ ,BA.ObjectToString("v1"));
 BA.debugLineNum = 554;BA.debugLine="DBPut(\"VeranstaltungID\", \"v0\")";
Debug.ShouldStop(512);
__ref.runClassMethod (b4a.example.settings.class, "_dbput" /*RemoteObject*/ ,(Object)(BA.ObjectToString("VeranstaltungID")),(Object)((RemoteObject.createImmutable("v0"))));
 };
 BA.debugLineNum = 556;BA.debugLine="End Sub";
Debug.ShouldStop(2048);
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
		Debug.PushSubsStack("pruefeInhalt (settings) ","settings",3,__ref.getField(false, "ba"),__ref,623);
if (RapidSub.canDelegate("pruefeinhalt")) { return __ref.runUserSub(false, "settings","pruefeinhalt", __ref);}
RemoteObject _anz = RemoteObject.createImmutable(0);
 BA.debugLineNum = 623;BA.debugLine="Private Sub pruefeInhalt";
Debug.ShouldStop(16384);
 BA.debugLineNum = 624;BA.debugLine="btnVerstgSpeichern.Enabled = False";
Debug.ShouldStop(32768);
__ref.getField(false,"_btnverstgspeichern" /*RemoteObject*/ ).runMethod(true,"setEnabled",settings.__c.getField(true,"False"));
 BA.debugLineNum = 625;BA.debugLine="btnVerstgSpeichern.TextColor = 0xFF888888";
Debug.ShouldStop(65536);
__ref.getField(false,"_btnverstgspeichern" /*RemoteObject*/ ).runMethod(true,"setTextColor",BA.numberCast(int.class, ((int)0xff888888)));
 BA.debugLineNum = 626;BA.debugLine="btnAuswahl.Enabled = False";
Debug.ShouldStop(131072);
__ref.getField(false,"_btnauswahl" /*RemoteObject*/ ).runMethod(true,"setEnabled",settings.__c.getField(true,"False"));
 BA.debugLineNum = 627;BA.debugLine="btnAuswahl.TextColor = 0xFF888888";
Debug.ShouldStop(262144);
__ref.getField(false,"_btnauswahl" /*RemoteObject*/ ).runMethod(true,"setTextColor",BA.numberCast(int.class, ((int)0xff888888)));
 BA.debugLineNum = 629;BA.debugLine="If tbxVeranstaltung.Text.Trim <> \"\" Then";
Debug.ShouldStop(1048576);
if (RemoteObject.solveBoolean("!",__ref.getField(false,"_tbxveranstaltung" /*RemoteObject*/ ).runMethod(true,"getText").runMethod(true,"trim"),BA.ObjectToString(""))) { 
 BA.debugLineNum = 630;BA.debugLine="If IsNumber(tbxAnzahl.Text) Then";
Debug.ShouldStop(2097152);
if (settings.__c.runMethod(true,"IsNumber",(Object)(__ref.getField(false,"_tbxanzahl" /*RemoteObject*/ ).runMethod(true,"getText"))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 631;BA.debugLine="Dim anz As Int = tbxAnzahl.Text";
Debug.ShouldStop(4194304);
_anz = BA.numberCast(int.class, __ref.getField(false,"_tbxanzahl" /*RemoteObject*/ ).runMethod(true,"getText"));Debug.locals.put("anz", _anz);Debug.locals.put("anz", _anz);
 BA.debugLineNum = 632;BA.debugLine="If anz > 0 Then";
Debug.ShouldStop(8388608);
if (RemoteObject.solveBoolean(">",_anz,BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 633;BA.debugLine="btnVerstgSpeichern.Enabled = True";
Debug.ShouldStop(16777216);
__ref.getField(false,"_btnverstgspeichern" /*RemoteObject*/ ).runMethod(true,"setEnabled",settings.__c.getField(true,"True"));
 BA.debugLineNum = 634;BA.debugLine="btnVerstgSpeichern.TextColor = colorgreen";
Debug.ShouldStop(33554432);
__ref.getField(false,"_btnverstgspeichern" /*RemoteObject*/ ).runMethod(true,"setTextColor",__ref.getField(true,"_colorgreen" /*RemoteObject*/ ));
 };
 };
 };
 BA.debugLineNum = 638;BA.debugLine="End Sub";
Debug.ShouldStop(536870912);
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
		Debug.PushSubsStack("saveDBvstng (settings) ","settings",3,__ref.getField(false, "ba"),__ref,585);
if (RapidSub.canDelegate("savedbvstng")) { return __ref.runUserSub(false, "settings","savedbvstng", __ref);}
 BA.debugLineNum = 585;BA.debugLine="Private Sub saveDBvstng";
Debug.ShouldStop(256);
 BA.debugLineNum = 586;BA.debugLine="lblVeranstaltung.Text = tbxVeranstaltung.Text";
Debug.ShouldStop(512);
__ref.getField(false,"_lblveranstaltung" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToCharSequence(__ref.getField(false,"_tbxveranstaltung" /*RemoteObject*/ ).runMethod(true,"getText")));
 BA.debugLineNum = 587;BA.debugLine="lblDatum.Text = dprDatum.Text";
Debug.ShouldStop(1024);
__ref.getField(false,"_lbldatum" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToCharSequence(__ref.getField(false,"_dprdatum" /*RemoteObject*/ ).runMethod(true,"getText")));
 BA.debugLineNum = 588;BA.debugLine="DBPut(\"VeranstaltungID\", Veranstaltung_ID)";
Debug.ShouldStop(2048);
__ref.runClassMethod (b4a.example.settings.class, "_dbput" /*RemoteObject*/ ,(Object)(BA.ObjectToString("VeranstaltungID")),(Object)((__ref.getField(true,"_veranstaltung_id" /*RemoteObject*/ ))));
 BA.debugLineNum = 589;BA.debugLine="DBPut(\"VeranstaltungName\", tbxVeranstaltung.Text)";
Debug.ShouldStop(4096);
__ref.runClassMethod (b4a.example.settings.class, "_dbput" /*RemoteObject*/ ,(Object)(BA.ObjectToString("VeranstaltungName")),(Object)((__ref.getField(false,"_tbxveranstaltung" /*RemoteObject*/ ).runMethod(true,"getText"))));
 BA.debugLineNum = 590;BA.debugLine="DBPut(\"VeranstaltungDatum\", dprDatum.Text)";
Debug.ShouldStop(8192);
__ref.runClassMethod (b4a.example.settings.class, "_dbput" /*RemoteObject*/ ,(Object)(BA.ObjectToString("VeranstaltungDatum")),(Object)((__ref.getField(false,"_dprdatum" /*RemoteObject*/ ).runMethod(true,"getText"))));
 BA.debugLineNum = 591;BA.debugLine="DBPut(\"VeranstaltungAnzahl\", tbxAnzahl.Text)";
Debug.ShouldStop(16384);
__ref.runClassMethod (b4a.example.settings.class, "_dbput" /*RemoteObject*/ ,(Object)(BA.ObjectToString("VeranstaltungAnzahl")),(Object)((__ref.getField(false,"_tbxanzahl" /*RemoteObject*/ ).runMethod(true,"getText"))));
 BA.debugLineNum = 592;BA.debugLine="End Sub";
Debug.ShouldStop(32768);
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
		Debug.PushSubsStack("saveTLN (settings) ","settings",3,__ref.getField(false, "ba"),__ref,695);
if (RapidSub.canDelegate("savetln")) { return __ref.runUserSub(false, "settings","savetln", __ref);}
RemoteObject _dbkey = RemoteObject.createImmutable("");
RemoteObject _tname = RemoteObject.createImmutable("");
RemoteObject _addtlnmap = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _jg = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.JSONParser.JSONGenerator");
 BA.debugLineNum = 695;BA.debugLine="Private Sub saveTLN";
Debug.ShouldStop(4194304);
 BA.debugLineNum = 696;BA.debugLine="disableTLN";
Debug.ShouldStop(8388608);
__ref.runClassMethod (b4a.example.settings.class, "_disabletln" /*RemoteObject*/ );
 BA.debugLineNum = 697;BA.debugLine="Dim DBkey As String = TLNid";
Debug.ShouldStop(16777216);
_dbkey = __ref.getField(true,"_tlnid" /*RemoteObject*/ );Debug.locals.put("dbkey", _dbkey);Debug.locals.put("DBkey", _dbkey);
 BA.debugLineNum = 698;BA.debugLine="If TLNid = \"t0\" Then";
Debug.ShouldStop(33554432);
if (RemoteObject.solveBoolean("=",__ref.getField(true,"_tlnid" /*RemoteObject*/ ),BA.ObjectToString("t0"))) { 
 BA.debugLineNum = 699;BA.debugLine="DBkey = TLNnewID";
Debug.ShouldStop(67108864);
_dbkey = __ref.getField(true,"_tlnnewid" /*RemoteObject*/ );Debug.locals.put("DBkey", _dbkey);
 };
 BA.debugLineNum = 702;BA.debugLine="Dim tName As String = tbxTeilnehmer.Text.Trim";
Debug.ShouldStop(536870912);
_tname = __ref.getField(false,"_tbxteilnehmer" /*RemoteObject*/ ).runMethod(true,"getText").runMethod(true,"trim");Debug.locals.put("tname", _tname);Debug.locals.put("tName", _tname);
 BA.debugLineNum = 703;BA.debugLine="If Teilnehmer.IndexOf(tName) >= 0 Then";
Debug.ShouldStop(1073741824);
if (RemoteObject.solveBoolean("g",__ref.getField(false,"_teilnehmer" /*RemoteObject*/ ).runMethod(true,"IndexOf",(Object)((_tname))),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 704;BA.debugLine="MsgboxAsync(\"Der Teilnehmer \" & tName & \" ist be";
Debug.ShouldStop(-2147483648);
settings.__c.runVoidMethod ("MsgboxAsync",(Object)(BA.ObjectToCharSequence(RemoteObject.concat(RemoteObject.createImmutable("Der Teilnehmer "),_tname,RemoteObject.createImmutable(" ist bereits in der Teilnehmerliste vorhanden und kann nicht erneut angelegt werden. Zum Ändern bitte Teilnehmer auswählen und die Änderung speichern.")))),(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("Speichern nicht möglich!"))),__ref.getField(false, "ba"));
 }else {
 BA.debugLineNum = 706;BA.debugLine="Dim addTLNMap As Map = CreateMap(\"Name\": tName)";
Debug.ShouldStop(2);
_addtlnmap = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_addtlnmap = settings.__c.runMethod(false, "createMap", (Object)(new RemoteObject[] {RemoteObject.createImmutable(("Name")),(_tname)}));Debug.locals.put("addtlnmap", _addtlnmap);Debug.locals.put("addTLNMap", _addtlnmap);
 BA.debugLineNum = 707;BA.debugLine="CurrentWebUrl = URLteilnehmer & \"/\" & DBkey & \".";
Debug.ShouldStop(4);
__ref.setField ("_currentweburl" /*RemoteObject*/ ,RemoteObject.concat(__ref.getField(true,"_urlteilnehmer" /*RemoteObject*/ ),RemoteObject.createImmutable("/"),_dbkey,RemoteObject.createImmutable(".json?auth="),__ref.getField(false,"_status" /*RemoteObject*/ ).runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("idToken"))),(Object)((RemoteObject.createImmutable(""))))));
 BA.debugLineNum = 708;BA.debugLine="DBdatenTyp = \"addTLN\"";
Debug.ShouldStop(8);
__ref.setField ("_dbdatentyp" /*RemoteObject*/ ,BA.ObjectToString("addTLN"));
 BA.debugLineNum = 710;BA.debugLine="Dim jg As JSONGenerator";
Debug.ShouldStop(32);
_jg = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.JSONParser.JSONGenerator");Debug.locals.put("jg", _jg);
 BA.debugLineNum = 711;BA.debugLine="jg.Initialize(addTLNMap)";
Debug.ShouldStop(64);
_jg.runVoidMethod ("Initialize",(Object)(_addtlnmap));
 BA.debugLineNum = 712;BA.debugLine="ExecuteHttp(\"PUT\", CurrentWebUrl, jg.ToString)";
Debug.ShouldStop(128);
__ref.runClassMethod (b4a.example.settings.class, "_executehttp" /*void*/ ,(Object)(BA.ObjectToString("PUT")),(Object)(__ref.getField(true,"_currentweburl" /*RemoteObject*/ )),(Object)(_jg.runMethod(true,"ToString")));
 };
 BA.debugLineNum = 714;BA.debugLine="enableTLN";
Debug.ShouldStop(512);
__ref.runClassMethod (b4a.example.settings.class, "_enabletln" /*RemoteObject*/ );
 BA.debugLineNum = 715;BA.debugLine="End Sub";
Debug.ShouldStop(1024);
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
		Debug.PushSubsStack("saveVSTNG (settings) ","settings",3,__ref.getField(false, "ba"),__ref,558);
if (RapidSub.canDelegate("savevstng")) { return __ref.runUserSub(false, "settings","savevstng", __ref);}
RemoteObject _dbkey = RemoteObject.createImmutable("");
RemoteObject _body = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _jg = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.JSONParser.JSONGenerator");
 BA.debugLineNum = 558;BA.debugLine="Private Sub saveVSTNG";
Debug.ShouldStop(8192);
 BA.debugLineNum = 559;BA.debugLine="disableVSTNG";
Debug.ShouldStop(16384);
__ref.runClassMethod (b4a.example.settings.class, "_disablevstng" /*RemoteObject*/ );
 BA.debugLineNum = 560;BA.debugLine="Dim DBkey As String = webviewVSTGN_ID";
Debug.ShouldStop(32768);
_dbkey = __ref.getField(true,"_webviewvstgn_id" /*RemoteObject*/ );Debug.locals.put("dbkey", _dbkey);Debug.locals.put("DBkey", _dbkey);
 BA.debugLineNum = 561;BA.debugLine="If DBkey = \"v0\" Then";
Debug.ShouldStop(65536);
if (RemoteObject.solveBoolean("=",_dbkey,BA.ObjectToString("v0"))) { 
 BA.debugLineNum = 562;BA.debugLine="DBkey = VSTGNnewID";
Debug.ShouldStop(131072);
_dbkey = __ref.getField(true,"_vstgnnewid" /*RemoteObject*/ );Debug.locals.put("DBkey", _dbkey);
 BA.debugLineNum = 563;BA.debugLine="webviewVSTGN_ID = VSTGNnewID";
Debug.ShouldStop(262144);
__ref.setField ("_webviewvstgn_id" /*RemoteObject*/ ,__ref.getField(true,"_vstgnnewid" /*RemoteObject*/ ));
 };
 BA.debugLineNum = 566;BA.debugLine="Dim body As Map = CreateMap( _ 		\"Datum\": dprDatu";
Debug.ShouldStop(2097152);
_body = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_body = settings.__c.runMethod(false, "createMap", (Object)(new RemoteObject[] {RemoteObject.createImmutable(("Datum")),(__ref.getField(false,"_dprdatum" /*RemoteObject*/ ).runMethod(true,"getText")),RemoteObject.createImmutable(("Name")),(__ref.getField(false,"_tbxveranstaltung" /*RemoteObject*/ ).runMethod(true,"getText")),RemoteObject.createImmutable(("Teilnehmerzahl")),(__ref.getField(false,"_tbxanzahl" /*RemoteObject*/ ).runMethod(true,"getText")),RemoteObject.createImmutable(("Status")),(RemoteObject.createImmutable("offen"))}));Debug.locals.put("body", _body);Debug.locals.put("body", _body);
 BA.debugLineNum = 572;BA.debugLine="CurrentWebUrl = URLveranstaltungen & \"/\" & DBkey";
Debug.ShouldStop(134217728);
__ref.setField ("_currentweburl" /*RemoteObject*/ ,RemoteObject.concat(__ref.getField(true,"_urlveranstaltungen" /*RemoteObject*/ ),RemoteObject.createImmutable("/"),_dbkey,RemoteObject.createImmutable(".json?auth="),__ref.getField(false,"_status" /*RemoteObject*/ ).runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("idToken"))),(Object)((RemoteObject.createImmutable(""))))));
 BA.debugLineNum = 573;BA.debugLine="DBdatenTyp = \"addVSTNG\"";
Debug.ShouldStop(268435456);
__ref.setField ("_dbdatentyp" /*RemoteObject*/ ,BA.ObjectToString("addVSTNG"));
 BA.debugLineNum = 575;BA.debugLine="Dim jg As JSONGenerator";
Debug.ShouldStop(1073741824);
_jg = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.JSONParser.JSONGenerator");Debug.locals.put("jg", _jg);
 BA.debugLineNum = 576;BA.debugLine="jg.Initialize(body)";
Debug.ShouldStop(-2147483648);
_jg.runVoidMethod ("Initialize",(Object)(_body));
 BA.debugLineNum = 577;BA.debugLine="ExecuteHttp(\"PUT\", CurrentWebUrl, jg.ToString)";
Debug.ShouldStop(1);
__ref.runClassMethod (b4a.example.settings.class, "_executehttp" /*void*/ ,(Object)(BA.ObjectToString("PUT")),(Object)(__ref.getField(true,"_currentweburl" /*RemoteObject*/ )),(Object)(_jg.runMethod(true,"ToString")));
 BA.debugLineNum = 579;BA.debugLine="If Veranstaltung_ID = webviewVSTGN_ID Then";
Debug.ShouldStop(4);
if (RemoteObject.solveBoolean("=",__ref.getField(true,"_veranstaltung_id" /*RemoteObject*/ ),__ref.getField(true,"_webviewvstgn_id" /*RemoteObject*/ ))) { 
 BA.debugLineNum = 580;BA.debugLine="saveDBvstng";
Debug.ShouldStop(8);
__ref.runClassMethod (b4a.example.settings.class, "_savedbvstng" /*RemoteObject*/ );
 };
 BA.debugLineNum = 582;BA.debugLine="enableVSTNG";
Debug.ShouldStop(32);
__ref.runClassMethod (b4a.example.settings.class, "_enablevstng" /*RemoteObject*/ );
 BA.debugLineNum = 583;BA.debugLine="End Sub";
Debug.ShouldStop(64);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setbuttonimagesafe(RemoteObject __ref,RemoteObject _btn,RemoteObject _filename,RemoteObject _fallbacktext) throws Exception{
try {
		Debug.PushSubsStack("SetButtonImageSafe (settings) ","settings",3,__ref.getField(false, "ba"),__ref,383);
if (RapidSub.canDelegate("setbuttonimagesafe")) { return __ref.runUserSub(false, "settings","setbuttonimagesafe", __ref, _btn, _filename, _fallbacktext);}
Debug.locals.put("btn", _btn);
Debug.locals.put("fileName", _filename);
Debug.locals.put("fallbackText", _fallbacktext);
 BA.debugLineNum = 383;BA.debugLine="Private Sub SetButtonImageSafe(btn As Button, file";
Debug.ShouldStop(1073741824);
 BA.debugLineNum = 384;BA.debugLine="If File.Exists(File.DirAssets, fileName) Then";
Debug.ShouldStop(-2147483648);
if (settings.__c.getField(false,"File").runMethod(true,"Exists",(Object)(settings.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(_filename)).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 385;BA.debugLine="btn.SetBackgroundImage(LoadBitmap(File.DirAssets";
Debug.ShouldStop(1);
_btn.runVoidMethod ("SetBackgroundImageNew",(Object)((settings.__c.runMethod(false,"LoadBitmap",(Object)(settings.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(_filename)).getObject())));
 }else {
 BA.debugLineNum = 387;BA.debugLine="btn.Text = fallbackText";
Debug.ShouldStop(4);
_btn.runMethod(true,"setText",BA.ObjectToCharSequence(_fallbacktext));
 };
 BA.debugLineNum = 389;BA.debugLine="End Sub";
Debug.ShouldStop(16);
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
		Debug.PushSubsStack("setzeHeaderfromDB (settings) ","settings",3,__ref.getField(false, "ba"),__ref,436);
if (RapidSub.canDelegate("setzeheaderfromdb")) { return __ref.runUserSub(false, "settings","setzeheaderfromdb", __ref);}
 BA.debugLineNum = 436;BA.debugLine="Private Sub setzeHeaderfromDB";
Debug.ShouldStop(524288);
 BA.debugLineNum = 437;BA.debugLine="lblVerein.Text = DBGet(\"Bezeichnung\", \"- nicht ge";
Debug.ShouldStop(1048576);
__ref.getField(false,"_lblverein" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToCharSequence(__ref.runClassMethod (b4a.example.settings.class, "_dbget" /*RemoteObject*/ ,(Object)(BA.ObjectToString("Bezeichnung")),(Object)((RemoteObject.createImmutable("- nicht gesetzt -"))))));
 BA.debugLineNum = 438;BA.debugLine="lblVeranstaltung.Text = DBGet(\"VeranstaltungName\"";
Debug.ShouldStop(2097152);
__ref.getField(false,"_lblveranstaltung" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToCharSequence(__ref.runClassMethod (b4a.example.settings.class, "_dbget" /*RemoteObject*/ ,(Object)(BA.ObjectToString("VeranstaltungName")),(Object)((RemoteObject.createImmutable("- nicht gesetzt -"))))));
 BA.debugLineNum = 439;BA.debugLine="lblDatum.Text = DBGet(\"VeranstaltungDatum\", \"- ni";
Debug.ShouldStop(4194304);
__ref.getField(false,"_lbldatum" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToCharSequence(__ref.runClassMethod (b4a.example.settings.class, "_dbget" /*RemoteObject*/ ,(Object)(BA.ObjectToString("VeranstaltungDatum")),(Object)((RemoteObject.createImmutable("- nicht gesetzt -"))))));
 BA.debugLineNum = 440;BA.debugLine="End Sub";
Debug.ShouldStop(8388608);
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
		Debug.PushSubsStack("setzeOffline (settings) ","settings",3,__ref.getField(false, "ba"),__ref,815);
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
		Debug.PushSubsStack("setzeOffline (settings) ","settings",3,__ref.getField(false, "ba"),__ref,815);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
;
 BA.debugLineNum = 816;BA.debugLine="Status.Put(\"ProgOffline\", True)";
Debug.ShouldStop(32768);
__ref.getField(false,"_status" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("ProgOffline"))),(Object)((parent.__c.getField(true,"True"))));
 BA.debugLineNum = 817;BA.debugLine="Msgbox2Async(\"Die Datenbank ist nicht mehr erreic";
Debug.ShouldStop(65536);
parent.__c.runVoidMethod ("Msgbox2Async",(Object)(BA.ObjectToCharSequence("Die Datenbank ist nicht mehr erreichbar. Das Programm arbeitet nun offline. Es ist jetzt nur die zuletzt verwendete Wertungsliste verfügbar. Änderungen in den Einstellungen können nicht übernommen werden.")),(Object)(BA.ObjectToCharSequence("Internet-Verbindung nicht möglich!")),(Object)(BA.ObjectToString("Einstellungen schließen.")),(Object)(BA.ObjectToString("")),(Object)(BA.ObjectToString("")),RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper"), parent.__c.getField(false,"Null")),__ref.getField(false, "ba"),(Object)(parent.__c.getField(true,"False")));
 BA.debugLineNum = 818;BA.debugLine="Wait For Msgbox_Result (res As Int)";
Debug.ShouldStop(131072);
parent.__c.runVoidMethod ("WaitFor","msgbox_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "settings", "setzeoffline"), null);
this.state = 5;
return;
case 5:
//C
this.state = 1;
_res = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("res", _res);
;
 BA.debugLineNum = 819;BA.debugLine="If res = DialogResponse.POSITIVE Then";
Debug.ShouldStop(262144);
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
 BA.debugLineNum = 820;BA.debugLine="CloseSettings";
Debug.ShouldStop(524288);
__ref.runClassMethod (b4a.example.settings.class, "_closesettings" /*RemoteObject*/ );
 if (true) break;

case 4:
//C
this.state = -1;
;
 BA.debugLineNum = 822;BA.debugLine="End Sub";
Debug.ShouldStop(2097152);
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
		Debug.PushSubsStack("setzeTeilnehmer (settings) ","settings",3,__ref.getField(false, "ba"),__ref,670);
if (RapidSub.canDelegate("setzeteilnehmer")) { return __ref.runUserSub(false, "settings","setzeteilnehmer", __ref, _tid);}
RemoteObject _idx = RemoteObject.createImmutable(0);
Debug.locals.put("tid", _tid);
 BA.debugLineNum = 670;BA.debugLine="Private Sub setzeTeilnehmer(tid As String)";
Debug.ShouldStop(536870912);
 BA.debugLineNum = 671;BA.debugLine="disableTLN";
Debug.ShouldStop(1073741824);
__ref.runClassMethod (b4a.example.settings.class, "_disabletln" /*RemoteObject*/ );
 BA.debugLineNum = 672;BA.debugLine="If tid = \"t0\" Then";
Debug.ShouldStop(-2147483648);
if (RemoteObject.solveBoolean("=",_tid,BA.ObjectToString("t0"))) { 
 BA.debugLineNum = 673;BA.debugLine="dochange = False";
Debug.ShouldStop(1);
__ref.setField ("_dochange" /*RemoteObject*/ ,settings.__c.getField(true,"False"));
 BA.debugLineNum = 674;BA.debugLine="tbxTeilnehmer.Text = \"\"";
Debug.ShouldStop(2);
__ref.getField(false,"_tbxteilnehmer" /*RemoteObject*/ ).runMethodAndSync(true,"setText",BA.ObjectToCharSequence(""));
 BA.debugLineNum = 675;BA.debugLine="dochange = True";
Debug.ShouldStop(4);
__ref.setField ("_dochange" /*RemoteObject*/ ,settings.__c.getField(true,"True"));
 BA.debugLineNum = 676;BA.debugLine="enableTLN";
Debug.ShouldStop(8);
__ref.runClassMethod (b4a.example.settings.class, "_enabletln" /*RemoteObject*/ );
 BA.debugLineNum = 677;BA.debugLine="btnTLNDelete.TextColor = 0xFF888888";
Debug.ShouldStop(16);
__ref.getField(false,"_btntlndelete" /*RemoteObject*/ ).runMethod(true,"setTextColor",BA.numberCast(int.class, ((int)0xff888888)));
 BA.debugLineNum = 678;BA.debugLine="btnTLNDelete.Enabled = False";
Debug.ShouldStop(32);
__ref.getField(false,"_btntlndelete" /*RemoteObject*/ ).runMethod(true,"setEnabled",settings.__c.getField(true,"False"));
 }else {
 BA.debugLineNum = 680;BA.debugLine="If Teilnehmer.Size > 0 Then";
Debug.ShouldStop(128);
if (RemoteObject.solveBoolean(">",__ref.getField(false,"_teilnehmer" /*RemoteObject*/ ).runMethod(true,"getSize"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 681;BA.debugLine="Dim idx As Int = Teilnehmer.IndexOf(tid)";
Debug.ShouldStop(256);
_idx = __ref.getField(false,"_teilnehmer" /*RemoteObject*/ ).runMethod(true,"IndexOf",(Object)((_tid)));Debug.locals.put("idx", _idx);Debug.locals.put("idx", _idx);
 BA.debugLineNum = 682;BA.debugLine="If idx > 0 Then";
Debug.ShouldStop(512);
if (RemoteObject.solveBoolean(">",_idx,BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 683;BA.debugLine="dochange = False";
Debug.ShouldStop(1024);
__ref.setField ("_dochange" /*RemoteObject*/ ,settings.__c.getField(true,"False"));
 BA.debugLineNum = 684;BA.debugLine="tbxTeilnehmer.Text = Teilnehmer.Get(idx - 1)";
Debug.ShouldStop(2048);
__ref.getField(false,"_tbxteilnehmer" /*RemoteObject*/ ).runMethodAndSync(true,"setText",BA.ObjectToCharSequence(__ref.getField(false,"_teilnehmer" /*RemoteObject*/ ).runMethod(false,"Get",(Object)(RemoteObject.solve(new RemoteObject[] {_idx,RemoteObject.createImmutable(1)}, "-",1, 1)))));
 BA.debugLineNum = 685;BA.debugLine="dochange = True";
Debug.ShouldStop(4096);
__ref.setField ("_dochange" /*RemoteObject*/ ,settings.__c.getField(true,"True"));
 BA.debugLineNum = 686;BA.debugLine="enableTLN";
Debug.ShouldStop(8192);
__ref.runClassMethod (b4a.example.settings.class, "_enabletln" /*RemoteObject*/ );
 };
 };
 };
 BA.debugLineNum = 690;BA.debugLine="If tbxTeilnehmer.Enabled Then";
Debug.ShouldStop(131072);
if (__ref.getField(false,"_tbxteilnehmer" /*RemoteObject*/ ).runMethod(true,"getEnabled").<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 691;BA.debugLine="tbxTeilnehmer.RequestFocus";
Debug.ShouldStop(262144);
__ref.getField(false,"_tbxteilnehmer" /*RemoteObject*/ ).runVoidMethod ("RequestFocus");
 };
 BA.debugLineNum = 693;BA.debugLine="End Sub";
Debug.ShouldStop(1048576);
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
		Debug.PushSubsStack("setzeVeranstaltung (settings) ","settings",3,__ref.getField(false, "ba"),__ref,492);
if (RapidSub.canDelegate("setzeveranstaltung")) { return __ref.runUserSub(false, "settings","setzeveranstaltung", __ref, _vid);}
RemoteObject _veranstaltung = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _datum = RemoteObject.createImmutable("");
RemoteObject _datum_spl = null;
Debug.locals.put("vid", _vid);
 BA.debugLineNum = 492;BA.debugLine="Private Sub setzeVeranstaltung(vid As String)";
Debug.ShouldStop(2048);
 BA.debugLineNum = 493;BA.debugLine="disableVSTNG";
Debug.ShouldStop(4096);
__ref.runClassMethod (b4a.example.settings.class, "_disablevstng" /*RemoteObject*/ );
 BA.debugLineNum = 494;BA.debugLine="Dim veranstaltung As Map";
Debug.ShouldStop(8192);
_veranstaltung = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("veranstaltung", _veranstaltung);
 BA.debugLineNum = 495;BA.debugLine="If Veranstaltungen.IsInitialized And Veranstaltun";
Debug.ShouldStop(16384);
if (RemoteObject.solveBoolean(".",__ref.getField(false,"_veranstaltungen" /*RemoteObject*/ ).runMethod(true,"IsInitialized")) && RemoteObject.solveBoolean(".",__ref.getField(false,"_veranstaltungen" /*RemoteObject*/ ).runMethod(true,"ContainsKey",(Object)((_vid))))) { 
 BA.debugLineNum = 496;BA.debugLine="veranstaltung = Veranstaltungen.Get(vid)";
Debug.ShouldStop(32768);
_veranstaltung = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), __ref.getField(false,"_veranstaltungen" /*RemoteObject*/ ).runMethod(false,"Get",(Object)((_vid))));Debug.locals.put("veranstaltung", _veranstaltung);
 }else {
 BA.debugLineNum = 498;BA.debugLine="veranstaltung.Initialize";
Debug.ShouldStop(131072);
_veranstaltung.runVoidMethod ("Initialize");
 };
 BA.debugLineNum = 501;BA.debugLine="Dim datum As String = veranstaltung.GetDefault(\"D";
Debug.ShouldStop(1048576);
_datum = BA.ObjectToString(_veranstaltung.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("Datum"))),(Object)((__ref.runClassMethod (b4a.example.settings.class, "_formatdatecustom" /*RemoteObject*/ ,(Object)(settings.__c.getField(false,"DateTime").runMethod(true,"getNow")),(Object)(RemoteObject.createImmutable("dd.MM.yyyy")))))));Debug.locals.put("datum", _datum);Debug.locals.put("datum", _datum);
 BA.debugLineNum = 502;BA.debugLine="Dim datum_spl() As String = Regex.Split(\"\\.\", dat";
Debug.ShouldStop(2097152);
_datum_spl = settings.__c.getField(false,"Regex").runMethod(false,"Split",(Object)(BA.ObjectToString("\\.")),(Object)(_datum));Debug.locals.put("datum_spl", _datum_spl);Debug.locals.put("datum_spl", _datum_spl);
 BA.debugLineNum = 503;BA.debugLine="If datum_spl.Length >= 3 Then";
Debug.ShouldStop(4194304);
if (RemoteObject.solveBoolean("g",_datum_spl.getField(true,"length"),BA.numberCast(double.class, 3))) { 
 BA.debugLineNum = 504;BA.debugLine="dprYear = datum_spl(2)";
Debug.ShouldStop(8388608);
__ref.setField ("_dpryear" /*RemoteObject*/ ,BA.numberCast(int.class, _datum_spl.getArrayElement(true,BA.numberCast(int.class, 2))));
 BA.debugLineNum = 505;BA.debugLine="dprMonth = datum_spl(1)";
Debug.ShouldStop(16777216);
__ref.setField ("_dprmonth" /*RemoteObject*/ ,BA.numberCast(int.class, _datum_spl.getArrayElement(true,BA.numberCast(int.class, 1))));
 BA.debugLineNum = 506;BA.debugLine="dprDay = datum_spl(0)";
Debug.ShouldStop(33554432);
__ref.setField ("_dprday" /*RemoteObject*/ ,BA.numberCast(int.class, _datum_spl.getArrayElement(true,BA.numberCast(int.class, 0))));
 };
 BA.debugLineNum = 509;BA.debugLine="dprDatum.Text = datum";
Debug.ShouldStop(268435456);
__ref.getField(false,"_dprdatum" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToCharSequence(_datum));
 BA.debugLineNum = 514;BA.debugLine="tbxAnzahl.Text = veranstaltung.GetDefault(\"Teilne";
Debug.ShouldStop(2);
__ref.getField(false,"_tbxanzahl" /*RemoteObject*/ ).runMethodAndSync(true,"setText",BA.ObjectToCharSequence(_veranstaltung.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("Teilnehmerzahl"))),(Object)((RemoteObject.createImmutable("0"))))));
 BA.debugLineNum = 516;BA.debugLine="If \"offen\" = veranstaltung.GetDefault(\"Status\", \"";
Debug.ShouldStop(8);
if (RemoteObject.solveBoolean("=",RemoteObject.createImmutable("offen"),BA.ObjectToString(_veranstaltung.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("Status"))),(Object)((RemoteObject.createImmutable("offen"))))))) { 
 BA.debugLineNum = 517;BA.debugLine="dprDatum.Enabled = True";
Debug.ShouldStop(16);
__ref.getField(false,"_dprdatum" /*RemoteObject*/ ).runMethod(true,"setEnabled",settings.__c.getField(true,"True"));
 BA.debugLineNum = 518;BA.debugLine="dprDatum.TextColor = colorgreen";
Debug.ShouldStop(32);
__ref.getField(false,"_dprdatum" /*RemoteObject*/ ).runMethod(true,"setTextColor",__ref.getField(true,"_colorgreen" /*RemoteObject*/ ));
 BA.debugLineNum = 519;BA.debugLine="tbxVeranstaltung.Enabled = True";
Debug.ShouldStop(64);
__ref.getField(false,"_tbxveranstaltung" /*RemoteObject*/ ).runMethod(true,"setEnabled",settings.__c.getField(true,"True"));
 BA.debugLineNum = 520;BA.debugLine="tbxAnzahl.Enabled = True";
Debug.ShouldStop(128);
__ref.getField(false,"_tbxanzahl" /*RemoteObject*/ ).runMethod(true,"setEnabled",settings.__c.getField(true,"True"));
 BA.debugLineNum = 521;BA.debugLine="lblClosed.Visible = False";
Debug.ShouldStop(256);
__ref.getField(false,"_lblclosed" /*RemoteObject*/ ).runMethod(true,"setVisible",settings.__c.getField(true,"False"));
 }else {
 BA.debugLineNum = 523;BA.debugLine="lblClosed.Visible = True";
Debug.ShouldStop(1024);
__ref.getField(false,"_lblclosed" /*RemoteObject*/ ).runMethod(true,"setVisible",settings.__c.getField(true,"True"));
 };
 BA.debugLineNum = 526;BA.debugLine="btnVerstgDelete.Enabled = True";
Debug.ShouldStop(8192);
__ref.getField(false,"_btnverstgdelete" /*RemoteObject*/ ).runMethod(true,"setEnabled",settings.__c.getField(true,"True"));
 BA.debugLineNum = 527;BA.debugLine="btnVerstgDelete.TextColor = colorgreen";
Debug.ShouldStop(16384);
__ref.getField(false,"_btnverstgdelete" /*RemoteObject*/ ).runMethod(true,"setTextColor",__ref.getField(true,"_colorgreen" /*RemoteObject*/ ));
 BA.debugLineNum = 529;BA.debugLine="If vid <> \"v0\" Then";
Debug.ShouldStop(65536);
if (RemoteObject.solveBoolean("!",_vid,BA.ObjectToString("v0"))) { 
 BA.debugLineNum = 530;BA.debugLine="btnAuswahl.TextColor = colorblue";
Debug.ShouldStop(131072);
__ref.getField(false,"_btnauswahl" /*RemoteObject*/ ).runMethod(true,"setTextColor",__ref.getField(true,"_colorblue" /*RemoteObject*/ ));
 BA.debugLineNum = 531;BA.debugLine="btnAuswahl.Enabled = True";
Debug.ShouldStop(262144);
__ref.getField(false,"_btnauswahl" /*RemoteObject*/ ).runMethod(true,"setEnabled",settings.__c.getField(true,"True"));
 };
 BA.debugLineNum = 533;BA.debugLine="End Sub";
Debug.ShouldStop(1048576);
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
		Debug.PushSubsStack("startTimer (settings) ","settings",3,__ref.getField(false, "ba"),__ref,1066);
if (RapidSub.canDelegate("starttimer")) { return __ref.runUserSub(false, "settings","starttimer", __ref);}
 BA.debugLineNum = 1066;BA.debugLine="Private Sub startTimer";
Debug.ShouldStop(512);
 BA.debugLineNum = 1067;BA.debugLine="Uhrzeit.Enabled = False";
Debug.ShouldStop(1024);
__ref.getField(false,"_uhrzeit" /*RemoteObject*/ ).runMethod(true,"setEnabled",settings.__c.getField(true,"False"));
 BA.debugLineNum = 1068;BA.debugLine="Uhrzeit.Interval = 1000 * 300";
Debug.ShouldStop(2048);
__ref.getField(false,"_uhrzeit" /*RemoteObject*/ ).runMethod(true,"setInterval",BA.numberCast(long.class, RemoteObject.solve(new RemoteObject[] {RemoteObject.createImmutable(1000),RemoteObject.createImmutable(300)}, "*",0, 1)));
 BA.debugLineNum = 1069;BA.debugLine="Uhrzeit.Enabled = True";
Debug.ShouldStop(4096);
__ref.getField(false,"_uhrzeit" /*RemoteObject*/ ).runMethod(true,"setEnabled",settings.__c.getField(true,"True"));
 BA.debugLineNum = 1070;BA.debugLine="End Sub";
Debug.ShouldStop(8192);
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
		Debug.PushSubsStack("tbxAnzahl_FocusChanged (settings) ","settings",3,__ref.getField(false, "ba"),__ref,984);
if (RapidSub.canDelegate("tbxanzahl_focuschanged")) { return __ref.runUserSub(false, "settings","tbxanzahl_focuschanged", __ref, _hasfocus);}
Debug.locals.put("HasFocus", _hasfocus);
 BA.debugLineNum = 984;BA.debugLine="Private Sub tbxAnzahl_FocusChanged (HasFocus As Bo";
Debug.ShouldStop(8388608);
 BA.debugLineNum = 985;BA.debugLine="If HasFocus Then";
Debug.ShouldStop(16777216);
if (_hasfocus.<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 986;BA.debugLine="tbxAnzahl.SelectionStart = tbxAnzahl.Text.Length";
Debug.ShouldStop(33554432);
__ref.getField(false,"_tbxanzahl" /*RemoteObject*/ ).runMethod(true,"setSelectionStart",__ref.getField(false,"_tbxanzahl" /*RemoteObject*/ ).runMethod(true,"getText").runMethod(true,"length"));
 }else {
 BA.debugLineNum = 988;BA.debugLine="HideKeyboard";
Debug.ShouldStop(134217728);
__ref.runClassMethod (b4a.example.settings.class, "_hidekeyboard" /*RemoteObject*/ );
 };
 BA.debugLineNum = 990;BA.debugLine="End Sub";
Debug.ShouldStop(536870912);
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
		Debug.PushSubsStack("tbxAnzahl_TextChanged (settings) ","settings",3,__ref.getField(false, "ba"),__ref,993);
if (RapidSub.canDelegate("tbxanzahl_textchanged")) { return __ref.runUserSub(false, "settings","tbxanzahl_textchanged", __ref, _old, _new);}
RemoteObject _val = RemoteObject.createImmutable(0);
Debug.locals.put("Old", _old);
Debug.locals.put("New", _new);
 BA.debugLineNum = 993;BA.debugLine="Private Sub tbxAnzahl_TextChanged (Old As String,";
Debug.ShouldStop(1);
 BA.debugLineNum = 994;BA.debugLine="Log(\"tbxAnzahl_TextChanged\")";
Debug.ShouldStop(2);
settings.__c.runVoidMethod ("LogImpl","411075585",RemoteObject.createImmutable("tbxAnzahl_TextChanged"),0);
 BA.debugLineNum = 995;BA.debugLine="Log(\"dochange = \" & dochange)";
Debug.ShouldStop(4);
settings.__c.runVoidMethod ("LogImpl","411075586",RemoteObject.concat(RemoteObject.createImmutable("dochange = "),__ref.getField(true,"_dochange" /*RemoteObject*/ )),0);
 BA.debugLineNum = 996;BA.debugLine="If dochange = False Then Return";
Debug.ShouldStop(8);
if (RemoteObject.solveBoolean("=",__ref.getField(true,"_dochange" /*RemoteObject*/ ),settings.__c.getField(true,"False"))) { 
if (true) return RemoteObject.createImmutable("");};
 BA.debugLineNum = 998;BA.debugLine="dochange = False";
Debug.ShouldStop(32);
__ref.setField ("_dochange" /*RemoteObject*/ ,settings.__c.getField(true,"False"));
 BA.debugLineNum = 999;BA.debugLine="If tbxAnzahl.Enabled Then";
Debug.ShouldStop(64);
if (__ref.getField(false,"_tbxanzahl" /*RemoteObject*/ ).runMethod(true,"getEnabled").<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 1000;BA.debugLine="If IsNumber(tbxAnzahl.Text) Then";
Debug.ShouldStop(128);
if (settings.__c.runMethod(true,"IsNumber",(Object)(__ref.getField(false,"_tbxanzahl" /*RemoteObject*/ ).runMethod(true,"getText"))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 1001;BA.debugLine="Dim val As Int = Abs(tbxAnzahl.Text)";
Debug.ShouldStop(256);
_val = BA.numberCast(int.class, settings.__c.runMethod(true,"Abs",(Object)(BA.numberCast(double.class, __ref.getField(false,"_tbxanzahl" /*RemoteObject*/ ).runMethod(true,"getText")))));Debug.locals.put("val", _val);Debug.locals.put("val", _val);
 BA.debugLineNum = 1002;BA.debugLine="tbxAnzahl.Text = val";
Debug.ShouldStop(512);
__ref.getField(false,"_tbxanzahl" /*RemoteObject*/ ).runMethodAndSync(true,"setText",BA.ObjectToCharSequence(_val));
 };
 BA.debugLineNum = 1004;BA.debugLine="pruefeInhalt";
Debug.ShouldStop(2048);
__ref.runClassMethod (b4a.example.settings.class, "_pruefeinhalt" /*RemoteObject*/ );
 BA.debugLineNum = 1005;BA.debugLine="tbxAnzahl.SelectionStart = tbxAnzahl.Text.Length";
Debug.ShouldStop(4096);
__ref.getField(false,"_tbxanzahl" /*RemoteObject*/ ).runMethod(true,"setSelectionStart",__ref.getField(false,"_tbxanzahl" /*RemoteObject*/ ).runMethod(true,"getText").runMethod(true,"length"));
 };
 BA.debugLineNum = 1007;BA.debugLine="dochange = True";
Debug.ShouldStop(16384);
__ref.setField ("_dochange" /*RemoteObject*/ ,settings.__c.getField(true,"True"));
 BA.debugLineNum = 1008;BA.debugLine="startTimer";
Debug.ShouldStop(32768);
__ref.runClassMethod (b4a.example.settings.class, "_starttimer" /*RemoteObject*/ );
 BA.debugLineNum = 1009;BA.debugLine="End Sub";
Debug.ShouldStop(65536);
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
		Debug.PushSubsStack("tbxTeilnehmer_FocusChanged (settings) ","settings",3,__ref.getField(false, "ba"),__ref,1011);
if (RapidSub.canDelegate("tbxteilnehmer_focuschanged")) { return __ref.runUserSub(false, "settings","tbxteilnehmer_focuschanged", __ref, _hasfocus);}
Debug.locals.put("HasFocus", _hasfocus);
 BA.debugLineNum = 1011;BA.debugLine="Private Sub tbxTeilnehmer_FocusChanged (HasFocus A";
Debug.ShouldStop(262144);
 BA.debugLineNum = 1012;BA.debugLine="If HasFocus Then";
Debug.ShouldStop(524288);
if (_hasfocus.<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 1013;BA.debugLine="tbxTeilnehmer.SelectionStart = tbxTeilnehmer.Tex";
Debug.ShouldStop(1048576);
__ref.getField(false,"_tbxteilnehmer" /*RemoteObject*/ ).runMethod(true,"setSelectionStart",__ref.getField(false,"_tbxteilnehmer" /*RemoteObject*/ ).runMethod(true,"getText").runMethod(true,"length"));
 }else {
 BA.debugLineNum = 1015;BA.debugLine="HideKeyboard";
Debug.ShouldStop(4194304);
__ref.runClassMethod (b4a.example.settings.class, "_hidekeyboard" /*RemoteObject*/ );
 };
 BA.debugLineNum = 1017;BA.debugLine="End Sub";
Debug.ShouldStop(16777216);
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
		Debug.PushSubsStack("tbxTeilnehmer_TextChanged (settings) ","settings",3,__ref.getField(false, "ba"),__ref,1020);
if (RapidSub.canDelegate("tbxteilnehmer_textchanged")) { return __ref.runUserSub(false, "settings","tbxteilnehmer_textchanged", __ref, _old, _new);}
RemoteObject _cleaned = RemoteObject.createImmutable("");
RemoteObject _sb = RemoteObject.declareNull("anywheresoftware.b4a.keywords.StringBuilderWrapper");
RemoteObject _doupper = RemoteObject.createImmutable(false);
int _i = 0;
RemoteObject _letter = RemoteObject.createImmutable("");
Debug.locals.put("Old", _old);
Debug.locals.put("New", _new);
 BA.debugLineNum = 1020;BA.debugLine="Private Sub tbxTeilnehmer_TextChanged (Old As Stri";
Debug.ShouldStop(134217728);
 BA.debugLineNum = 1021;BA.debugLine="Log(\"tbxTeilnehmer_TextChanged\")";
Debug.ShouldStop(268435456);
settings.__c.runVoidMethod ("LogImpl","411206657",RemoteObject.createImmutable("tbxTeilnehmer_TextChanged"),0);
 BA.debugLineNum = 1022;BA.debugLine="Log(\"dochange = \" & dochange)";
Debug.ShouldStop(536870912);
settings.__c.runVoidMethod ("LogImpl","411206658",RemoteObject.concat(RemoteObject.createImmutable("dochange = "),__ref.getField(true,"_dochange" /*RemoteObject*/ )),0);
 BA.debugLineNum = 1023;BA.debugLine="If dochange = False Then Return";
Debug.ShouldStop(1073741824);
if (RemoteObject.solveBoolean("=",__ref.getField(true,"_dochange" /*RemoteObject*/ ),settings.__c.getField(true,"False"))) { 
if (true) return RemoteObject.createImmutable("");};
 BA.debugLineNum = 1025;BA.debugLine="dochange = False";
Debug.ShouldStop(1);
__ref.setField ("_dochange" /*RemoteObject*/ ,settings.__c.getField(true,"False"));
 BA.debugLineNum = 1026;BA.debugLine="Dim cleaned As String = Regex.Replace(\"[^a-zA-Z0-";
Debug.ShouldStop(2);
_cleaned = settings.__c.getField(false,"Regex").runMethod(true,"Replace",(Object)(BA.ObjectToString("[^a-zA-Z0-9äöüÄÖÜßéèêëáàâçñ -]")),(Object)(__ref.getField(false,"_tbxteilnehmer" /*RemoteObject*/ ).runMethod(true,"getText")),(Object)(RemoteObject.createImmutable("")));Debug.locals.put("cleaned", _cleaned);Debug.locals.put("cleaned", _cleaned);
 BA.debugLineNum = 1028;BA.debugLine="Dim sb As StringBuilder";
Debug.ShouldStop(8);
_sb = RemoteObject.createNew ("anywheresoftware.b4a.keywords.StringBuilderWrapper");Debug.locals.put("sb", _sb);
 BA.debugLineNum = 1029;BA.debugLine="sb.Initialize";
Debug.ShouldStop(16);
_sb.runVoidMethod ("Initialize");
 BA.debugLineNum = 1030;BA.debugLine="Dim doupper As Boolean = True";
Debug.ShouldStop(32);
_doupper = settings.__c.getField(true,"True");Debug.locals.put("doupper", _doupper);Debug.locals.put("doupper", _doupper);
 BA.debugLineNum = 1031;BA.debugLine="For i = 0 To cleaned.Length - 1";
Debug.ShouldStop(64);
{
final int step9 = 1;
final int limit9 = RemoteObject.solve(new RemoteObject[] {_cleaned.runMethod(true,"length"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step9 > 0 && _i <= limit9) || (step9 < 0 && _i >= limit9) ;_i = ((int)(0 + _i + step9))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 1032;BA.debugLine="Dim letter As String = cleaned.SubString2(i, i +";
Debug.ShouldStop(128);
_letter = _cleaned.runMethod(true,"substring",(Object)(BA.numberCast(int.class, _i)),(Object)(RemoteObject.solve(new RemoteObject[] {RemoteObject.createImmutable(_i),RemoteObject.createImmutable(1)}, "+",1, 1)));Debug.locals.put("letter", _letter);Debug.locals.put("letter", _letter);
 BA.debugLineNum = 1033;BA.debugLine="If letter = \" \" Or letter = \"-\" Then";
Debug.ShouldStop(256);
if (RemoteObject.solveBoolean("=",_letter,BA.ObjectToString(" ")) || RemoteObject.solveBoolean("=",_letter,BA.ObjectToString("-"))) { 
 BA.debugLineNum = 1034;BA.debugLine="doupper = True";
Debug.ShouldStop(512);
_doupper = settings.__c.getField(true,"True");Debug.locals.put("doupper", _doupper);
 BA.debugLineNum = 1035;BA.debugLine="sb.Append(letter)";
Debug.ShouldStop(1024);
_sb.runVoidMethod ("Append",(Object)(_letter));
 }else 
{ BA.debugLineNum = 1036;BA.debugLine="Else if letter = \",\" Then";
Debug.ShouldStop(2048);
if (RemoteObject.solveBoolean("=",_letter,BA.ObjectToString(","))) { 
 }else 
{ BA.debugLineNum = 1038;BA.debugLine="Else if doupper Then";
Debug.ShouldStop(8192);
if (_doupper.<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 1039;BA.debugLine="sb.Append(letter.ToUpperCase)";
Debug.ShouldStop(16384);
_sb.runVoidMethod ("Append",(Object)(_letter.runMethod(true,"toUpperCase")));
 BA.debugLineNum = 1040;BA.debugLine="doupper = False";
Debug.ShouldStop(32768);
_doupper = settings.__c.getField(true,"False");Debug.locals.put("doupper", _doupper);
 }else {
 BA.debugLineNum = 1042;BA.debugLine="sb.Append(letter)";
Debug.ShouldStop(131072);
_sb.runVoidMethod ("Append",(Object)(_letter));
 }}}
;
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 1045;BA.debugLine="tbxTeilnehmer.Text = sb.ToString";
Debug.ShouldStop(1048576);
__ref.getField(false,"_tbxteilnehmer" /*RemoteObject*/ ).runMethodAndSync(true,"setText",BA.ObjectToCharSequence(_sb.runMethod(true,"ToString")));
 BA.debugLineNum = 1047;BA.debugLine="btnTLNDelete.TextColor = 0xFF888888";
Debug.ShouldStop(4194304);
__ref.getField(false,"_btntlndelete" /*RemoteObject*/ ).runMethod(true,"setTextColor",BA.numberCast(int.class, ((int)0xff888888)));
 BA.debugLineNum = 1048;BA.debugLine="btnTLNDelete.Enabled = False";
Debug.ShouldStop(8388608);
__ref.getField(false,"_btntlndelete" /*RemoteObject*/ ).runMethod(true,"setEnabled",settings.__c.getField(true,"False"));
 BA.debugLineNum = 1050;BA.debugLine="If tbxTeilnehmer.Text.Length >= 3 Then";
Debug.ShouldStop(33554432);
if (RemoteObject.solveBoolean("g",__ref.getField(false,"_tbxteilnehmer" /*RemoteObject*/ ).runMethod(true,"getText").runMethod(true,"length"),BA.numberCast(double.class, 3))) { 
 BA.debugLineNum = 1051;BA.debugLine="btnTLNSpeichern.TextColor = colorgreen";
Debug.ShouldStop(67108864);
__ref.getField(false,"_btntlnspeichern" /*RemoteObject*/ ).runMethod(true,"setTextColor",__ref.getField(true,"_colorgreen" /*RemoteObject*/ ));
 BA.debugLineNum = 1052;BA.debugLine="btnTLNSpeichern.Enabled = True";
Debug.ShouldStop(134217728);
__ref.getField(false,"_btntlnspeichern" /*RemoteObject*/ ).runMethod(true,"setEnabled",settings.__c.getField(true,"True"));
 }else {
 BA.debugLineNum = 1054;BA.debugLine="btnTLNSpeichern.TextColor = 0xFF888888";
Debug.ShouldStop(536870912);
__ref.getField(false,"_btntlnspeichern" /*RemoteObject*/ ).runMethod(true,"setTextColor",BA.numberCast(int.class, ((int)0xff888888)));
 BA.debugLineNum = 1055;BA.debugLine="btnTLNSpeichern.Enabled = False";
Debug.ShouldStop(1073741824);
__ref.getField(false,"_btntlnspeichern" /*RemoteObject*/ ).runMethod(true,"setEnabled",settings.__c.getField(true,"False"));
 };
 BA.debugLineNum = 1058;BA.debugLine="dochange = True";
Debug.ShouldStop(2);
__ref.setField ("_dochange" /*RemoteObject*/ ,settings.__c.getField(true,"True"));
 BA.debugLineNum = 1059;BA.debugLine="tbxTeilnehmer.SelectionStart = tbxTeilnehmer.Text";
Debug.ShouldStop(4);
__ref.getField(false,"_tbxteilnehmer" /*RemoteObject*/ ).runMethod(true,"setSelectionStart",__ref.getField(false,"_tbxteilnehmer" /*RemoteObject*/ ).runMethod(true,"getText").runMethod(true,"length"));
 BA.debugLineNum = 1060;BA.debugLine="startTimer";
Debug.ShouldStop(8);
__ref.runClassMethod (b4a.example.settings.class, "_starttimer" /*RemoteObject*/ );
 BA.debugLineNum = 1061;BA.debugLine="End Sub";
Debug.ShouldStop(16);
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
		Debug.PushSubsStack("tbxVeranstaltung_FocusChanged (settings) ","settings",3,__ref.getField(false, "ba"),__ref,962);
if (RapidSub.canDelegate("tbxveranstaltung_focuschanged")) { return __ref.runUserSub(false, "settings","tbxveranstaltung_focuschanged", __ref, _hasfocus);}
Debug.locals.put("HasFocus", _hasfocus);
 BA.debugLineNum = 962;BA.debugLine="Private Sub tbxVeranstaltung_FocusChanged (HasFocu";
Debug.ShouldStop(2);
 BA.debugLineNum = 963;BA.debugLine="If HasFocus Then";
Debug.ShouldStop(4);
if (_hasfocus.<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 964;BA.debugLine="tbxVeranstaltung.SelectionStart = tbxVeranstaltu";
Debug.ShouldStop(8);
__ref.getField(false,"_tbxveranstaltung" /*RemoteObject*/ ).runMethod(true,"setSelectionStart",__ref.getField(false,"_tbxveranstaltung" /*RemoteObject*/ ).runMethod(true,"getText").runMethod(true,"length"));
 }else {
 BA.debugLineNum = 966;BA.debugLine="HideKeyboard";
Debug.ShouldStop(32);
__ref.runClassMethod (b4a.example.settings.class, "_hidekeyboard" /*RemoteObject*/ );
 };
 BA.debugLineNum = 968;BA.debugLine="End Sub";
Debug.ShouldStop(128);
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
		Debug.PushSubsStack("tbxVeranstaltung_TextChanged (settings) ","settings",3,__ref.getField(false, "ba"),__ref,971);
if (RapidSub.canDelegate("tbxveranstaltung_textchanged")) { return __ref.runUserSub(false, "settings","tbxveranstaltung_textchanged", __ref, _old, _new);}
Debug.locals.put("Old", _old);
Debug.locals.put("New", _new);
 BA.debugLineNum = 971;BA.debugLine="Private Sub tbxVeranstaltung_TextChanged (Old As S";
Debug.ShouldStop(1024);
 BA.debugLineNum = 972;BA.debugLine="Log(\"tbxVeranstaltung_TextChanged\")";
Debug.ShouldStop(2048);
settings.__c.runVoidMethod ("LogImpl","410944513",RemoteObject.createImmutable("tbxVeranstaltung_TextChanged"),0);
 BA.debugLineNum = 973;BA.debugLine="Log(\"dochange = \" & dochange)";
Debug.ShouldStop(4096);
settings.__c.runVoidMethod ("LogImpl","410944514",RemoteObject.concat(RemoteObject.createImmutable("dochange = "),__ref.getField(true,"_dochange" /*RemoteObject*/ )),0);
 BA.debugLineNum = 974;BA.debugLine="If dochange = False Then Return";
Debug.ShouldStop(8192);
if (RemoteObject.solveBoolean("=",__ref.getField(true,"_dochange" /*RemoteObject*/ ),settings.__c.getField(true,"False"))) { 
if (true) return RemoteObject.createImmutable("");};
 BA.debugLineNum = 976;BA.debugLine="dochange = False";
Debug.ShouldStop(32768);
__ref.setField ("_dochange" /*RemoteObject*/ ,settings.__c.getField(true,"False"));
 BA.debugLineNum = 977;BA.debugLine="If tbxVeranstaltung.Enabled Then";
Debug.ShouldStop(65536);
if (__ref.getField(false,"_tbxveranstaltung" /*RemoteObject*/ ).runMethod(true,"getEnabled").<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 978;BA.debugLine="pruefeInhalt";
Debug.ShouldStop(131072);
__ref.runClassMethod (b4a.example.settings.class, "_pruefeinhalt" /*RemoteObject*/ );
 };
 BA.debugLineNum = 980;BA.debugLine="dochange = True";
Debug.ShouldStop(524288);
__ref.setField ("_dochange" /*RemoteObject*/ ,settings.__c.getField(true,"True"));
 BA.debugLineNum = 981;BA.debugLine="startTimer";
Debug.ShouldStop(1048576);
__ref.runClassMethod (b4a.example.settings.class, "_starttimer" /*RemoteObject*/ );
 BA.debugLineNum = 982;BA.debugLine="End Sub";
Debug.ShouldStop(2097152);
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
		Debug.PushSubsStack("Uhrzeit_Tick (settings) ","settings",3,__ref.getField(false, "ba"),__ref,1072);
if (RapidSub.canDelegate("uhrzeit_tick")) { return __ref.runUserSub(false, "settings","uhrzeit_tick", __ref);}
 BA.debugLineNum = 1072;BA.debugLine="Private Sub Uhrzeit_Tick";
Debug.ShouldStop(32768);
 BA.debugLineNum = 1073;BA.debugLine="Uhrzeit.Enabled = False";
Debug.ShouldStop(65536);
__ref.getField(false,"_uhrzeit" /*RemoteObject*/ ).runMethod(true,"setEnabled",settings.__c.getField(true,"False"));
 BA.debugLineNum = 1074;BA.debugLine="B4XPages.ShowPage(\"ScreenSaver\")";
Debug.ShouldStop(131072);
settings._b4xpages.runVoidMethod ("_showpage" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("ScreenSaver")));
 BA.debugLineNum = 1075;BA.debugLine="End Sub";
Debug.ShouldStop(262144);
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
		Debug.PushSubsStack("ZeigeTeilnehmerCLV (settings) ","settings",3,__ref.getField(false, "ba"),__ref,1154);
if (RapidSub.canDelegate("zeigeteilnehmerclv")) { return __ref.runUserSub(false, "settings","zeigeteilnehmerclv", __ref);}
int _i = 0;
 BA.debugLineNum = 1154;BA.debugLine="Private Sub ZeigeTeilnehmerCLV";
Debug.ShouldStop(2);
 BA.debugLineNum = 1156;BA.debugLine="lstTeilnehmer.Clear";
Debug.ShouldStop(8);
__ref.getField(false,"_lstteilnehmer" /*RemoteObject*/ ).runVoidMethod ("Clear");
 BA.debugLineNum = 1158;BA.debugLine="For I = 0 To Teilnehmer.Size - 1 Step 2";
Debug.ShouldStop(32);
{
final int step2 = 2;
final int limit2 = RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_teilnehmer" /*RemoteObject*/ ).runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step2 > 0 && _i <= limit2) || (step2 < 0 && _i >= limit2) ;_i = ((int)(0 + _i + step2))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 1159;BA.debugLine="If I + 1 < Teilnehmer.Size Then";
Debug.ShouldStop(64);
if (RemoteObject.solveBoolean("<",RemoteObject.solve(new RemoteObject[] {RemoteObject.createImmutable(_i),RemoteObject.createImmutable(1)}, "+",1, 1),BA.numberCast(double.class, __ref.getField(false,"_teilnehmer" /*RemoteObject*/ ).runMethod(true,"getSize")))) { 
 BA.debugLineNum = 1160;BA.debugLine="lstTeilnehmer.AddSingleLine2(Teilnehmer.Get(I),";
Debug.ShouldStop(128);
__ref.getField(false,"_lstteilnehmer" /*RemoteObject*/ ).runVoidMethod ("AddSingleLine2",(Object)(BA.ObjectToCharSequence(__ref.getField(false,"_teilnehmer" /*RemoteObject*/ ).runMethod(false,"Get",(Object)(BA.numberCast(int.class, _i))))),(Object)(__ref.getField(false,"_teilnehmer" /*RemoteObject*/ ).runMethod(false,"Get",(Object)(RemoteObject.solve(new RemoteObject[] {RemoteObject.createImmutable(_i),RemoteObject.createImmutable(1)}, "+",1, 1)))));
 };
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 1164;BA.debugLine="End Sub";
Debug.ShouldStop(2048);
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
		Debug.PushSubsStack("ZeigeVeranstaltungenCLV (settings) ","settings",3,__ref.getField(false, "ba"),__ref,1128);
if (RapidSub.canDelegate("zeigeveranstaltungenclv")) { return __ref.runUserSub(false, "settings","zeigeveranstaltungenclv", __ref);}
RemoteObject _key = RemoteObject.createImmutable("");
RemoteObject _v = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _datum = RemoteObject.createImmutable("");
RemoteObject _name = RemoteObject.createImmutable("");
 BA.debugLineNum = 1128;BA.debugLine="Private Sub ZeigeVeranstaltungenCLV";
Debug.ShouldStop(128);
 BA.debugLineNum = 1130;BA.debugLine="lstVeranstaltungen.Clear";
Debug.ShouldStop(512);
__ref.getField(false,"_lstveranstaltungen" /*RemoteObject*/ ).runVoidMethod ("Clear");
 BA.debugLineNum = 1132;BA.debugLine="For Each KEY As String In Veranstaltungen.Keys";
Debug.ShouldStop(2048);
{
final RemoteObject group2 = __ref.getField(false,"_veranstaltungen" /*RemoteObject*/ ).runMethod(false,"Keys");
final int groupLen2 = group2.runMethod(true,"getSize").<Integer>get()
;int index2 = 0;
;
for (; index2 < groupLen2;index2++){
_key = BA.ObjectToString(group2.runMethod(false,"Get",index2));Debug.locals.put("key", _key);
Debug.locals.put("key", _key);
 BA.debugLineNum = 1134;BA.debugLine="Dim V As Map = Veranstaltungen.Get(KEY)";
Debug.ShouldStop(8192);
_v = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_v = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), __ref.getField(false,"_veranstaltungen" /*RemoteObject*/ ).runMethod(false,"Get",(Object)((_key))));Debug.locals.put("v", _v);Debug.locals.put("V", _v);
 BA.debugLineNum = 1136;BA.debugLine="Dim DATUM As String = V.GetDefault(\"Datum\", \"\")";
Debug.ShouldStop(32768);
_datum = BA.ObjectToString(_v.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("Datum"))),(Object)((RemoteObject.createImmutable("")))));Debug.locals.put("datum", _datum);Debug.locals.put("DATUM", _datum);
 BA.debugLineNum = 1137;BA.debugLine="Dim NAME As String = V.GetDefault(\"Name\", \"\")";
Debug.ShouldStop(65536);
_name = BA.ObjectToString(_v.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("Name"))),(Object)((RemoteObject.createImmutable("")))));Debug.locals.put("name", _name);Debug.locals.put("NAME", _name);
 BA.debugLineNum = 1139;BA.debugLine="lstVeranstaltungen.AddSingleLine2( _";
Debug.ShouldStop(262144);
__ref.getField(false,"_lstveranstaltungen" /*RemoteObject*/ ).runVoidMethod ("AddSingleLine2",(Object)(BA.ObjectToCharSequence(RemoteObject.concat(_datum,RemoteObject.createImmutable("   "),_name))),(Object)((_key)));
 }
}Debug.locals.put("key", _key);
;
 BA.debugLineNum = 1145;BA.debugLine="End Sub";
Debug.ShouldStop(16777216);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}