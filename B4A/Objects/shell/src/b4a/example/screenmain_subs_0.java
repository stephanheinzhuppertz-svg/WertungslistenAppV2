package b4a.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class screenmain_subs_0 {


public static RemoteObject  _addteilnehmer(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("addTeilnehmer (screenmain) ","screenmain",2,__ref.getField(false, "ba"),__ref,770);
if (RapidSub.canDelegate("addteilnehmer")) { return __ref.runUserSub(false, "screenmain","addteilnehmer", __ref);}
RemoteObject _tname = RemoteObject.createImmutable("");
RemoteObject _nextid = RemoteObject.createImmutable(0);
RemoteObject _dbkey = RemoteObject.createImmutable("");
RemoteObject _tln = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _jg = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.JSONParser.JSONGenerator");
 BA.debugLineNum = 770;BA.debugLine="Private Sub addTeilnehmer";
Debug.ShouldStop(2);
 BA.debugLineNum = 771;BA.debugLine="Dim tName As String = tbxTeilnehmer.Text.Trim";
Debug.ShouldStop(4);
_tname = __ref.getField(false,"_tbxteilnehmer" /*RemoteObject*/ ).runMethod(true,"getText").runMethod(true,"trim");Debug.locals.put("tname", _tname);Debug.locals.put("tName", _tname);
 BA.debugLineNum = 772;BA.debugLine="If tName <> \"\" And Teilnehmer.IndexOf(tName) = -1";
Debug.ShouldStop(8);
if (RemoteObject.solveBoolean("!",_tname,BA.ObjectToString("")) && RemoteObject.solveBoolean("=",__ref.getField(false,"_teilnehmer" /*RemoteObject*/ ).runMethod(true,"IndexOf",(Object)((_tname))),BA.numberCast(double.class, -(double) (0 + 1)))) { 
 BA.debugLineNum = 773;BA.debugLine="addTLN = True";
Debug.ShouldStop(16);
__ref.setField ("_addtln" /*RemoteObject*/ ,screenmain.__c.getField(true,"True"));
 BA.debugLineNum = 774;BA.debugLine="Teilnehmer.Add(tName)";
Debug.ShouldStop(32);
__ref.getField(false,"_teilnehmer" /*RemoteObject*/ ).runVoidMethod ("Add",(Object)((_tname)));
 BA.debugLineNum = 775;BA.debugLine="Teilnehmer.Sort(True)";
Debug.ShouldStop(64);
__ref.getField(false,"_teilnehmer" /*RemoteObject*/ ).runVoidMethod ("Sort",(Object)(screenmain.__c.getField(true,"True")));
 BA.debugLineNum = 776;BA.debugLine="DBPut(\"letzteÄnderung\", CreateMap(\"Änderung\": Tr";
Debug.ShouldStop(128);
__ref.runClassMethod (b4a.example.screenmain.class, "_dbput" /*RemoteObject*/ ,(Object)(BA.ObjectToString("letzteÄnderung")),(Object)((screenmain.__c.runMethod(false, "createMap", (Object)(new RemoteObject[] {RemoteObject.createImmutable(("Änderung")),(screenmain.__c.getField(true,"True")),RemoteObject.createImmutable(("Datum")),(screenmain.__c.getField(false,"DateTime").runMethod(true,"getNow"))})).getObject())));
 BA.debugLineNum = 777;BA.debugLine="DBPut(\"Teilnehmer\", Teilnehmer)";
Debug.ShouldStop(256);
__ref.runClassMethod (b4a.example.screenmain.class, "_dbput" /*RemoteObject*/ ,(Object)(BA.ObjectToString("Teilnehmer")),(Object)((__ref.getField(false,"_teilnehmer" /*RemoteObject*/ ).getObject())));
 BA.debugLineNum = 779;BA.debugLine="Dim nextId As Int = TLNlastID.Replace(\"t\", \"\") +";
Debug.ShouldStop(1024);
_nextid = BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {BA.numberCast(double.class, __ref.getField(true,"_tlnlastid" /*RemoteObject*/ ).runMethod(true,"replace",(Object)(BA.ObjectToString("t")),(Object)(RemoteObject.createImmutable("")))),RemoteObject.createImmutable(1)}, "+",1, 0));Debug.locals.put("nextid", _nextid);Debug.locals.put("nextId", _nextid);
 BA.debugLineNum = 780;BA.debugLine="Dim DBkey As String = \"t\" & nextId";
Debug.ShouldStop(2048);
_dbkey = RemoteObject.concat(RemoteObject.createImmutable("t"),_nextid);Debug.locals.put("dbkey", _dbkey);Debug.locals.put("DBkey", _dbkey);
 BA.debugLineNum = 781;BA.debugLine="TLNlastID = DBkey";
Debug.ShouldStop(4096);
__ref.setField ("_tlnlastid" /*RemoteObject*/ ,_dbkey);
 BA.debugLineNum = 783;BA.debugLine="Dim tln As Map = CreateMap(\"Name\": tName)";
Debug.ShouldStop(16384);
_tln = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_tln = screenmain.__c.runMethod(false, "createMap", (Object)(new RemoteObject[] {RemoteObject.createImmutable(("Name")),(_tname)}));Debug.locals.put("tln", _tln);Debug.locals.put("tln", _tln);
 BA.debugLineNum = 784;BA.debugLine="CurrentWebUrl = URLteilnehmer & \"/\" & DBkey & \".";
Debug.ShouldStop(32768);
__ref.setField ("_currentweburl" /*RemoteObject*/ ,RemoteObject.concat(__ref.getField(true,"_urlteilnehmer" /*RemoteObject*/ ),RemoteObject.createImmutable("/"),_dbkey,RemoteObject.createImmutable(".json?auth="),__ref.getField(false,"_status" /*RemoteObject*/ ).runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("idToken"))),(Object)((RemoteObject.createImmutable(""))))));
 BA.debugLineNum = 785;BA.debugLine="DBdatenTyp = \"addTLN\"";
Debug.ShouldStop(65536);
__ref.setField ("_dbdatentyp" /*RemoteObject*/ ,BA.ObjectToString("addTLN"));
 BA.debugLineNum = 787;BA.debugLine="Dim jg As JSONGenerator";
Debug.ShouldStop(262144);
_jg = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.JSONParser.JSONGenerator");Debug.locals.put("jg", _jg);
 BA.debugLineNum = 788;BA.debugLine="jg.Initialize(tln)";
Debug.ShouldStop(524288);
_jg.runVoidMethod ("Initialize",(Object)(_tln));
 BA.debugLineNum = 789;BA.debugLine="PutTextWeb(jg.ToString)";
Debug.ShouldStop(1048576);
__ref.runClassMethod (b4a.example.screenmain.class, "_puttextweb" /*RemoteObject*/ ,(Object)(_jg.runMethod(true,"ToString")));
 };
 BA.debugLineNum = 791;BA.debugLine="End Sub";
Debug.ShouldStop(4194304);
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
		Debug.PushSubsStack("B4XPage_Appear (screenmain) ","screenmain",2,__ref.getField(false, "ba"),__ref,83);
if (RapidSub.canDelegate("b4xpage_appear")) { return __ref.runUserSub(false, "screenmain","b4xpage_appear", __ref);}
 BA.debugLineNum = 83;BA.debugLine="Public Sub B4XPage_Appear";
Debug.ShouldStop(262144);
 BA.debugLineNum = 85;BA.debugLine="If B4XPages.MainPage.Status.IsInitialized And B4X";
Debug.ShouldStop(1048576);
if (RemoteObject.solveBoolean(".",screenmain._b4xpages.runMethod(false,"_mainpage" /*RemoteObject*/ ,__ref.getField(false, "ba")).getField(false,"_status" /*RemoteObject*/ ).runMethod(true,"IsInitialized")) && RemoteObject.solveBoolean(">",screenmain._b4xpages.runMethod(false,"_mainpage" /*RemoteObject*/ ,__ref.getField(false, "ba")).getField(false,"_status" /*RemoteObject*/ ).runMethod(true,"getSize"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 86;BA.debugLine="Status = B4XPages.MainPage.Status";
Debug.ShouldStop(2097152);
__ref.setField ("_status" /*RemoteObject*/ ,screenmain._b4xpages.runMethod(false,"_mainpage" /*RemoteObject*/ ,__ref.getField(false, "ba")).getField(false,"_status" /*RemoteObject*/ ));
 };
 BA.debugLineNum = 89;BA.debugLine="colorgreen = lblVerein.TextColor";
Debug.ShouldStop(16777216);
__ref.setField ("_colorgreen" /*RemoteObject*/ ,__ref.getField(false,"_lblverein" /*RemoteObject*/ ).runMethod(true,"getTextColor"));
 BA.debugLineNum = 91;BA.debugLine="If Status.GetDefault(\"idToken\", \"\") = \"\" Then";
Debug.ShouldStop(67108864);
if (RemoteObject.solveBoolean("=",__ref.getField(false,"_status" /*RemoteObject*/ ).runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("idToken"))),(Object)((RemoteObject.createImmutable("")))),RemoteObject.createImmutable(("")))) { 
 BA.debugLineNum = 92;BA.debugLine="B4XPages.ClosePage(Me)";
Debug.ShouldStop(134217728);
screenmain._b4xpages.runVoidMethod ("_closepage" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(__ref));
 BA.debugLineNum = 93;BA.debugLine="Return";
Debug.ShouldStop(268435456);
if (true) return RemoteObject.createImmutable("");
 };
 BA.debugLineNum = 96;BA.debugLine="If False = Status.GetDefault(\"debug\", False) Then";
Debug.ShouldStop(-2147483648);
if (RemoteObject.solveBoolean("=",screenmain.__c.getField(true,"False"),BA.ObjectToBoolean(__ref.getField(false,"_status" /*RemoteObject*/ ).runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("debug"))),(Object)((screenmain.__c.getField(true,"False"))))))) { 
 BA.debugLineNum = 97;BA.debugLine="initialisiere";
Debug.ShouldStop(1);
__ref.runClassMethod (b4a.example.screenmain.class, "_initialisiere" /*void*/ );
 };
 BA.debugLineNum = 99;BA.debugLine="startTimer";
Debug.ShouldStop(4);
__ref.runClassMethod (b4a.example.screenmain.class, "_starttimer" /*RemoteObject*/ );
 BA.debugLineNum = 100;BA.debugLine="End Sub";
Debug.ShouldStop(8);
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
		Debug.PushSubsStack("B4XPage_CloseRequest (screenmain) ","screenmain",2,__ref.getField(false, "ba"),__ref,102);
if (RapidSub.canDelegate("b4xpage_closerequest")) { return __ref.runUserSub(false, "screenmain","b4xpage_closerequest", __ref);}
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
public ResumableSub_B4XPage_CloseRequest(b4a.example.screenmain parent,RemoteObject __ref) {
this.parent = parent;
this.__ref = __ref;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4a.example.screenmain parent;

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("B4XPage_CloseRequest (screenmain) ","screenmain",2,__ref.getField(false, "ba"),__ref,102);
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
 BA.debugLineNum = 103;BA.debugLine="Uhrzeit.Enabled = False";
Debug.ShouldStop(64);
__ref.getField(false,"_uhrzeit" /*RemoteObject*/ ).runMethod(true,"setEnabled",parent.__c.getField(true,"False"));
 BA.debugLineNum = 104;BA.debugLine="Return True";
Debug.ShouldStop(128);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(parent.__c.getField(true,"True")));return;};
 BA.debugLineNum = 105;BA.debugLine="End Sub";
Debug.ShouldStop(256);
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
		Debug.PushSubsStack("B4XPage_Created (screenmain) ","screenmain",2,__ref.getField(false, "ba"),__ref,76);
if (RapidSub.canDelegate("b4xpage_created")) { return __ref.runUserSub(false, "screenmain","b4xpage_created", __ref, _root1);}
Debug.locals.put("Root1", _root1);
 BA.debugLineNum = 76;BA.debugLine="Private Sub B4XPage_Created (Root1 As B4XView)";
Debug.ShouldStop(2048);
 BA.debugLineNum = 77;BA.debugLine="Root = Root1";
Debug.ShouldStop(4096);
__ref.setField ("_root" /*RemoteObject*/ ,_root1);
 BA.debugLineNum = 78;BA.debugLine="B4XPages.SetTitle(Me, \"Wertungslisten-App by sthn";
Debug.ShouldStop(8192);
screenmain._b4xpages.runVoidMethod ("_settitle" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(__ref),(Object)((RemoteObject.createImmutable("Wertungslisten-App by sthnet.de"))));
 BA.debugLineNum = 79;BA.debugLine="BuildUI";
Debug.ShouldStop(16384);
__ref.runClassMethod (b4a.example.screenmain.class, "_buildui" /*RemoteObject*/ );
 BA.debugLineNum = 80;BA.debugLine="B4XPage_Appear";
Debug.ShouldStop(32768);
__ref.runClassMethod (b4a.example.screenmain.class, "_b4xpage_appear" /*RemoteObject*/ );
 BA.debugLineNum = 81;BA.debugLine="End Sub";
Debug.ShouldStop(65536);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static void  _btnclosevstng_click(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("btnCloseVstng_Click (screenmain) ","screenmain",2,__ref.getField(false, "ba"),__ref,1046);
if (RapidSub.canDelegate("btnclosevstng_click")) { __ref.runUserSub(false, "screenmain","btnclosevstng_click", __ref); return;}
ResumableSub_btnCloseVstng_Click rsub = new ResumableSub_btnCloseVstng_Click(null,__ref);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_btnCloseVstng_Click extends BA.ResumableSub {
public ResumableSub_btnCloseVstng_Click(b4a.example.screenmain parent,RemoteObject __ref) {
this.parent = parent;
this.__ref = __ref;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4a.example.screenmain parent;
RemoteObject _res;

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("btnCloseVstng_Click (screenmain) ","screenmain",2,__ref.getField(false, "ba"),__ref,1046);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
;
 BA.debugLineNum = 1047;BA.debugLine="Msgbox2Async(\"Die Veranstaltung \" & QUOTE & lblVe";
Debug.ShouldStop(4194304);
parent.__c.runVoidMethod ("Msgbox2Async",(Object)(BA.ObjectToCharSequence(RemoteObject.concat(RemoteObject.createImmutable("Die Veranstaltung "),parent.__c.getField(true,"QUOTE"),__ref.getField(false,"_lblveranstaltung" /*RemoteObject*/ ).runMethod(true,"getText"),parent.__c.getField(true,"QUOTE"),RemoteObject.createImmutable(" wird zur Bearbeitung gesperrt und kann danach nicht mehr geändert werden. Es wird nur noch die Ergebnisliste angezeigt.")))),(Object)(BA.ObjectToCharSequence("Veranstaltung abschließen")),(Object)(BA.ObjectToString("Abschließen")),(Object)(BA.ObjectToString("Abbrechen")),(Object)(BA.ObjectToString("")),RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper"), parent.__c.getField(false,"Null")),__ref.getField(false, "ba"),(Object)(parent.__c.getField(true,"True")));
 BA.debugLineNum = 1048;BA.debugLine="Wait For Msgbox_Result (res As Int)";
Debug.ShouldStop(8388608);
parent.__c.runVoidMethod ("WaitFor","msgbox_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "screenmain", "btnclosevstng_click"), null);
this.state = 5;
return;
case 5:
//C
this.state = 1;
_res = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("res", _res);
;
 BA.debugLineNum = 1049;BA.debugLine="If res = DialogResponse.POSITIVE Then";
Debug.ShouldStop(16777216);
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
 BA.debugLineNum = 1050;BA.debugLine="closeVstng(\"Ergebnisse\")";
Debug.ShouldStop(33554432);
__ref.runClassMethod (b4a.example.screenmain.class, "_closevstng" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("Ergebnisse")));
 if (true) break;

case 4:
//C
this.state = -1;
;
 BA.debugLineNum = 1052;BA.debugLine="startTimer";
Debug.ShouldStop(134217728);
__ref.runClassMethod (b4a.example.screenmain.class, "_starttimer" /*RemoteObject*/ );
 BA.debugLineNum = 1053;BA.debugLine="End Sub";
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
public static void  _msgbox_result(RemoteObject __ref,RemoteObject _res) throws Exception{
}
public static RemoteObject  _btndown_click(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("btnDown_Click (screenmain) ","screenmain",2,__ref.getField(false, "ba"),__ref,1000);
if (RapidSub.canDelegate("btndown_click")) { return __ref.runUserSub(false, "screenmain","btndown_click", __ref);}
 BA.debugLineNum = 1000;BA.debugLine="Private Sub btnDown_Click";
Debug.ShouldStop(128);
 BA.debugLineNum = 1001;BA.debugLine="vaEingabe.Visible = True";
Debug.ShouldStop(256);
__ref.getField(false,"_vaeingabe" /*RemoteObject*/ ).runMethod(true,"setVisible",screenmain.__c.getField(true,"True"));
 BA.debugLineNum = 1002;BA.debugLine="haDown.Visible = False";
Debug.ShouldStop(512);
__ref.getField(false,"_hadown" /*RemoteObject*/ ).runMethod(true,"setVisible",screenmain.__c.getField(true,"False"));
 BA.debugLineNum = 1003;BA.debugLine="btnDown.Visible = False";
Debug.ShouldStop(1024);
__ref.getField(false,"_btndown" /*RemoteObject*/ ).runMethod(true,"setVisible",screenmain.__c.getField(true,"False"));
 BA.debugLineNum = 1004;BA.debugLine="UpdateLayoutPositions";
Debug.ShouldStop(2048);
__ref.runClassMethod (b4a.example.screenmain.class, "_updatelayoutpositions" /*RemoteObject*/ );
 BA.debugLineNum = 1005;BA.debugLine="startTimer";
Debug.ShouldStop(4096);
__ref.runClassMethod (b4a.example.screenmain.class, "_starttimer" /*RemoteObject*/ );
 BA.debugLineNum = 1006;BA.debugLine="End Sub";
Debug.ShouldStop(8192);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _btnfdjback_click(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("btnFDJback_Click (screenmain) ","screenmain",2,__ref.getField(false, "ba"),__ref,1071);
if (RapidSub.canDelegate("btnfdjback_click")) { return __ref.runUserSub(false, "screenmain","btnfdjback_click", __ref);}
 BA.debugLineNum = 1071;BA.debugLine="Private Sub btnFDJback_Click";
Debug.ShouldStop(16384);
 BA.debugLineNum = 1072;BA.debugLine="vaErgEingabe.Visible = True";
Debug.ShouldStop(32768);
__ref.getField(false,"_vaergeingabe" /*RemoteObject*/ ).runMethod(true,"setVisible",screenmain.__c.getField(true,"True"));
 BA.debugLineNum = 1073;BA.debugLine="vaFDJ.Visible = False";
Debug.ShouldStop(65536);
__ref.getField(false,"_vafdj" /*RemoteObject*/ ).runMethod(true,"setVisible",screenmain.__c.getField(true,"False"));
 BA.debugLineNum = 1074;BA.debugLine="startTimer";
Debug.ShouldStop(131072);
__ref.runClassMethod (b4a.example.screenmain.class, "_starttimer" /*RemoteObject*/ );
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
public static RemoteObject  _btnfdjeingabe_click(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("btnFDJeingabe_Click (screenmain) ","screenmain",2,__ref.getField(false, "ba"),__ref,1060);
if (RapidSub.canDelegate("btnfdjeingabe_click")) { return __ref.runUserSub(false, "screenmain","btnfdjeingabe_click", __ref);}
 BA.debugLineNum = 1060;BA.debugLine="Private Sub btnFDJeingabe_Click";
Debug.ShouldStop(8);
 BA.debugLineNum = 1061;BA.debugLine="vaErgEingabe.Visible = False";
Debug.ShouldStop(16);
__ref.getField(false,"_vaergeingabe" /*RemoteObject*/ ).runMethod(true,"setVisible",screenmain.__c.getField(true,"False"));
 BA.debugLineNum = 1062;BA.debugLine="vaFDJ.Visible = True";
Debug.ShouldStop(32);
__ref.getField(false,"_vafdj" /*RemoteObject*/ ).runMethod(true,"setVisible",screenmain.__c.getField(true,"True"));
 BA.debugLineNum = 1063;BA.debugLine="tbxFDJgewicht.Enabled = True";
Debug.ShouldStop(64);
__ref.getField(false,"_tbxfdjgewicht" /*RemoteObject*/ ).runMethod(true,"setEnabled",screenmain.__c.getField(true,"True"));
 BA.debugLineNum = 1064;BA.debugLine="btnFDJsave.Enabled = False";
Debug.ShouldStop(128);
__ref.getField(false,"_btnfdjsave" /*RemoteObject*/ ).runMethod(true,"setEnabled",screenmain.__c.getField(true,"False"));
 BA.debugLineNum = 1065;BA.debugLine="btnFDJsave.TextColor = 0xFF888888";
Debug.ShouldStop(256);
__ref.getField(false,"_btnfdjsave" /*RemoteObject*/ ).runMethod(true,"setTextColor",BA.numberCast(int.class, ((int)0xff888888)));
 BA.debugLineNum = 1066;BA.debugLine="tbxFDJgewicht.SelectionStart = tbxFDJgewicht.Text";
Debug.ShouldStop(512);
__ref.getField(false,"_tbxfdjgewicht" /*RemoteObject*/ ).runMethod(true,"setSelectionStart",__ref.getField(false,"_tbxfdjgewicht" /*RemoteObject*/ ).runMethod(true,"getText").runMethod(true,"length"));
 BA.debugLineNum = 1067;BA.debugLine="tbxFDJgewicht.RequestFocus";
Debug.ShouldStop(1024);
__ref.getField(false,"_tbxfdjgewicht" /*RemoteObject*/ ).runVoidMethod ("RequestFocus");
 BA.debugLineNum = 1068;BA.debugLine="startTimer";
Debug.ShouldStop(2048);
__ref.runClassMethod (b4a.example.screenmain.class, "_starttimer" /*RemoteObject*/ );
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
public static RemoteObject  _btnfdjsave_click(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("btnFDJsave_Click (screenmain) ","screenmain",2,__ref.getField(false, "ba"),__ref,1077);
if (RapidSub.canDelegate("btnfdjsave_click")) { return __ref.runUserSub(false, "screenmain","btnfdjsave_click", __ref);}
 BA.debugLineNum = 1077;BA.debugLine="Private Sub btnFDJsave_Click";
Debug.ShouldStop(1048576);
 BA.debugLineNum = 1078;BA.debugLine="vaErgEingabe.Visible = True";
Debug.ShouldStop(2097152);
__ref.getField(false,"_vaergeingabe" /*RemoteObject*/ ).runMethod(true,"setVisible",screenmain.__c.getField(true,"True"));
 BA.debugLineNum = 1079;BA.debugLine="vaFDJ.Visible = False";
Debug.ShouldStop(4194304);
__ref.getField(false,"_vafdj" /*RemoteObject*/ ).runMethod(true,"setVisible",screenmain.__c.getField(true,"False"));
 BA.debugLineNum = 1080;BA.debugLine="tbxFDJgewicht.Enabled = False";
Debug.ShouldStop(8388608);
__ref.getField(false,"_tbxfdjgewicht" /*RemoteObject*/ ).runMethod(true,"setEnabled",screenmain.__c.getField(true,"False"));
 BA.debugLineNum = 1081;BA.debugLine="btnFDJsave.Enabled = False";
Debug.ShouldStop(16777216);
__ref.getField(false,"_btnfdjsave" /*RemoteObject*/ ).runMethod(true,"setEnabled",screenmain.__c.getField(true,"False"));
 BA.debugLineNum = 1082;BA.debugLine="HideKeyboard";
Debug.ShouldStop(33554432);
__ref.runClassMethod (b4a.example.screenmain.class, "_hidekeyboard" /*RemoteObject*/ );
 BA.debugLineNum = 1084;BA.debugLine="RunJS(\"setzeFDJ(\" & QUOTE & tbxFDJgewicht.Text &";
Debug.ShouldStop(134217728);
__ref.runClassMethod (b4a.example.screenmain.class, "_runjs" /*RemoteObject*/ ,(Object)(RemoteObject.concat(RemoteObject.createImmutable("setzeFDJ("),screenmain.__c.getField(true,"QUOTE"),__ref.getField(false,"_tbxfdjgewicht" /*RemoteObject*/ ).runMethod(true,"getText"),screenmain.__c.getField(true,"QUOTE"),RemoteObject.createImmutable(","),screenmain.__c.getField(true,"QUOTE"),__ref.getField(false,"_tbxteilnehmer" /*RemoteObject*/ ).runMethod(true,"getText"),screenmain.__c.getField(true,"QUOTE"),RemoteObject.createImmutable(");"))));
 BA.debugLineNum = 1085;BA.debugLine="DBPut(\"FDJTeilnehmer\", tbxTeilnehmer.Text)";
Debug.ShouldStop(268435456);
__ref.runClassMethod (b4a.example.screenmain.class, "_dbput" /*RemoteObject*/ ,(Object)(BA.ObjectToString("FDJTeilnehmer")),(Object)((__ref.getField(false,"_tbxteilnehmer" /*RemoteObject*/ ).runMethod(true,"getText"))));
 BA.debugLineNum = 1086;BA.debugLine="DBPut(\"FDJGewicht\", tbxFDJgewicht.Text)";
Debug.ShouldStop(536870912);
__ref.runClassMethod (b4a.example.screenmain.class, "_dbput" /*RemoteObject*/ ,(Object)(BA.ObjectToString("FDJGewicht")),(Object)((__ref.getField(false,"_tbxfdjgewicht" /*RemoteObject*/ ).runMethod(true,"getText"))));
 BA.debugLineNum = 1087;BA.debugLine="saveFDJ";
Debug.ShouldStop(1073741824);
__ref.runClassMethod (b4a.example.screenmain.class, "_savefdj" /*RemoteObject*/ );
 BA.debugLineNum = 1088;BA.debugLine="startTimer";
Debug.ShouldStop(-2147483648);
__ref.runClassMethod (b4a.example.screenmain.class, "_starttimer" /*RemoteObject*/ );
 BA.debugLineNum = 1089;BA.debugLine="End Sub";
Debug.ShouldStop(1);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _btnminus_click(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("btnMinus_Click (screenmain) ","screenmain",2,__ref.getField(false, "ba"),__ref,1017);
if (RapidSub.canDelegate("btnminus_click")) { return __ref.runUserSub(false, "screenmain","btnminus_click", __ref);}
 BA.debugLineNum = 1017;BA.debugLine="Private Sub btnMinus_Click";
Debug.ShouldStop(16777216);
 BA.debugLineNum = 1018;BA.debugLine="If PlatzSelected > 1 Then";
Debug.ShouldStop(33554432);
if (RemoteObject.solveBoolean(">",__ref.getField(true,"_platzselected" /*RemoteObject*/ ),BA.numberCast(double.class, 1))) { 
 BA.debugLineNum = 1019;BA.debugLine="If btnSpeichern.Enabled Then speichern";
Debug.ShouldStop(67108864);
if (__ref.getField(false,"_btnspeichern" /*RemoteObject*/ ).runMethod(true,"getEnabled").<Boolean>get().booleanValue()) { 
__ref.runClassMethod (b4a.example.screenmain.class, "_speichern" /*RemoteObject*/ );};
 BA.debugLineNum = 1020;BA.debugLine="SelectNewRow = PlatzSelected - 1";
Debug.ShouldStop(134217728);
__ref.setField ("_selectnewrow" /*RemoteObject*/ ,RemoteObject.solve(new RemoteObject[] {__ref.getField(true,"_platzselected" /*RemoteObject*/ ),RemoteObject.createImmutable(1)}, "-",1, 1));
 BA.debugLineNum = 1021;BA.debugLine="If Not(btnSpeichern.Enabled) Then";
Debug.ShouldStop(268435456);
if (screenmain.__c.runMethod(true,"Not",(Object)(__ref.getField(false,"_btnspeichern" /*RemoteObject*/ ).runMethod(true,"getEnabled"))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 1022;BA.debugLine="RunJS(\"selectRowById(\" & SelectNewRow & \");\")";
Debug.ShouldStop(536870912);
__ref.runClassMethod (b4a.example.screenmain.class, "_runjs" /*RemoteObject*/ ,(Object)(RemoteObject.concat(RemoteObject.createImmutable("selectRowById("),__ref.getField(true,"_selectnewrow" /*RemoteObject*/ ),RemoteObject.createImmutable(");"))));
 };
 };
 BA.debugLineNum = 1025;BA.debugLine="startTimer";
Debug.ShouldStop(1);
__ref.runClassMethod (b4a.example.screenmain.class, "_starttimer" /*RemoteObject*/ );
 BA.debugLineNum = 1026;BA.debugLine="End Sub";
Debug.ShouldStop(2);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _btnplus_click(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("btnPlus_Click (screenmain) ","screenmain",2,__ref.getField(false, "ba"),__ref,1028);
if (RapidSub.canDelegate("btnplus_click")) { return __ref.runUserSub(false, "screenmain","btnplus_click", __ref);}
RemoteObject _maxanzahl = RemoteObject.createImmutable(0);
 BA.debugLineNum = 1028;BA.debugLine="Private Sub btnPlus_Click";
Debug.ShouldStop(8);
 BA.debugLineNum = 1029;BA.debugLine="Dim maxAnzahl As Int = DBGet(\"VeranstaltungAnzahl";
Debug.ShouldStop(16);
_maxanzahl = BA.numberCast(int.class, __ref.runClassMethod (b4a.example.screenmain.class, "_dbget" /*RemoteObject*/ ,(Object)(BA.ObjectToString("VeranstaltungAnzahl")),(Object)((RemoteObject.createImmutable("25")))));Debug.locals.put("maxanzahl", _maxanzahl);Debug.locals.put("maxAnzahl", _maxanzahl);
 BA.debugLineNum = 1030;BA.debugLine="If PlatzSelected < maxAnzahl Then";
Debug.ShouldStop(32);
if (RemoteObject.solveBoolean("<",__ref.getField(true,"_platzselected" /*RemoteObject*/ ),BA.numberCast(double.class, _maxanzahl))) { 
 BA.debugLineNum = 1031;BA.debugLine="If btnSpeichern.Enabled Then speichern";
Debug.ShouldStop(64);
if (__ref.getField(false,"_btnspeichern" /*RemoteObject*/ ).runMethod(true,"getEnabled").<Boolean>get().booleanValue()) { 
__ref.runClassMethod (b4a.example.screenmain.class, "_speichern" /*RemoteObject*/ );};
 BA.debugLineNum = 1032;BA.debugLine="SelectNewRow = PlatzSelected + 1";
Debug.ShouldStop(128);
__ref.setField ("_selectnewrow" /*RemoteObject*/ ,RemoteObject.solve(new RemoteObject[] {__ref.getField(true,"_platzselected" /*RemoteObject*/ ),RemoteObject.createImmutable(1)}, "+",1, 1));
 BA.debugLineNum = 1033;BA.debugLine="If Not(btnSpeichern.Enabled) Then";
Debug.ShouldStop(256);
if (screenmain.__c.runMethod(true,"Not",(Object)(__ref.getField(false,"_btnspeichern" /*RemoteObject*/ ).runMethod(true,"getEnabled"))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 1034;BA.debugLine="RunJS(\"selectRowById(\" & SelectNewRow & \");\")";
Debug.ShouldStop(512);
__ref.runClassMethod (b4a.example.screenmain.class, "_runjs" /*RemoteObject*/ ,(Object)(RemoteObject.concat(RemoteObject.createImmutable("selectRowById("),__ref.getField(true,"_selectnewrow" /*RemoteObject*/ ),RemoteObject.createImmutable(");"))));
 };
 };
 BA.debugLineNum = 1037;BA.debugLine="startTimer";
Debug.ShouldStop(4096);
__ref.runClassMethod (b4a.example.screenmain.class, "_starttimer" /*RemoteObject*/ );
 BA.debugLineNum = 1038;BA.debugLine="End Sub";
Debug.ShouldStop(8192);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _btnsettings_click(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("btnSettings_Click (screenmain) ","screenmain",2,__ref.getField(false, "ba"),__ref,982);
if (RapidSub.canDelegate("btnsettings_click")) { return __ref.runUserSub(false, "screenmain","btnsettings_click", __ref);}
 BA.debugLineNum = 982;BA.debugLine="Private Sub btnSettings_Click";
Debug.ShouldStop(2097152);
 BA.debugLineNum = 983;BA.debugLine="Uhrzeit.Enabled = False";
Debug.ShouldStop(4194304);
__ref.getField(false,"_uhrzeit" /*RemoteObject*/ ).runMethod(true,"setEnabled",screenmain.__c.getField(true,"False"));
 BA.debugLineNum = 984;BA.debugLine="OpenSettingsPage";
Debug.ShouldStop(8388608);
__ref.runClassMethod (b4a.example.screenmain.class, "_opensettingspage" /*RemoteObject*/ );
 BA.debugLineNum = 985;BA.debugLine="End Sub";
Debug.ShouldStop(16777216);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _btnshare_click(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("btnShare_Click (screenmain) ","screenmain",2,__ref.getField(false, "ba"),__ref,1055);
if (RapidSub.canDelegate("btnshare_click")) { return __ref.runUserSub(false, "screenmain","btnshare_click", __ref);}
 BA.debugLineNum = 1055;BA.debugLine="Private Sub btnShare_Click";
Debug.ShouldStop(1073741824);
 BA.debugLineNum = 1056;BA.debugLine="RunJS(\"printView();\")";
Debug.ShouldStop(-2147483648);
__ref.runClassMethod (b4a.example.screenmain.class, "_runjs" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("printView();")));
 BA.debugLineNum = 1057;BA.debugLine="startTimer";
Debug.ShouldStop(1);
__ref.runClassMethod (b4a.example.screenmain.class, "_starttimer" /*RemoteObject*/ );
 BA.debugLineNum = 1058;BA.debugLine="End Sub";
Debug.ShouldStop(2);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _btnspeichern_click(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("btnSpeichern_Click (screenmain) ","screenmain",2,__ref.getField(false, "ba"),__ref,1040);
if (RapidSub.canDelegate("btnspeichern_click")) { return __ref.runUserSub(false, "screenmain","btnspeichern_click", __ref);}
 BA.debugLineNum = 1040;BA.debugLine="Private Sub btnSpeichern_Click";
Debug.ShouldStop(32768);
 BA.debugLineNum = 1041;BA.debugLine="HideKeyboard";
Debug.ShouldStop(65536);
__ref.runClassMethod (b4a.example.screenmain.class, "_hidekeyboard" /*RemoteObject*/ );
 BA.debugLineNum = 1042;BA.debugLine="speichern";
Debug.ShouldStop(131072);
__ref.runClassMethod (b4a.example.screenmain.class, "_speichern" /*RemoteObject*/ );
 BA.debugLineNum = 1043;BA.debugLine="startTimer";
Debug.ShouldStop(262144);
__ref.runClassMethod (b4a.example.screenmain.class, "_starttimer" /*RemoteObject*/ );
 BA.debugLineNum = 1044;BA.debugLine="End Sub";
Debug.ShouldStop(524288);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _btnup_click(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("btnUp_Click (screenmain) ","screenmain",2,__ref.getField(false, "ba"),__ref,992);
if (RapidSub.canDelegate("btnup_click")) { return __ref.runUserSub(false, "screenmain","btnup_click", __ref);}
 BA.debugLineNum = 992;BA.debugLine="Private Sub btnUp_Click";
Debug.ShouldStop(-2147483648);
 BA.debugLineNum = 993;BA.debugLine="vaEingabe.Visible = False";
Debug.ShouldStop(1);
__ref.getField(false,"_vaeingabe" /*RemoteObject*/ ).runMethod(true,"setVisible",screenmain.__c.getField(true,"False"));
 BA.debugLineNum = 994;BA.debugLine="haDown.Visible = True";
Debug.ShouldStop(2);
__ref.getField(false,"_hadown" /*RemoteObject*/ ).runMethod(true,"setVisible",screenmain.__c.getField(true,"True"));
 BA.debugLineNum = 995;BA.debugLine="btnDown.Visible = True";
Debug.ShouldStop(4);
__ref.getField(false,"_btndown" /*RemoteObject*/ ).runMethod(true,"setVisible",screenmain.__c.getField(true,"True"));
 BA.debugLineNum = 996;BA.debugLine="UpdateLayoutPositions";
Debug.ShouldStop(8);
__ref.runClassMethod (b4a.example.screenmain.class, "_updatelayoutpositions" /*RemoteObject*/ );
 BA.debugLineNum = 997;BA.debugLine="startTimer";
Debug.ShouldStop(16);
__ref.runClassMethod (b4a.example.screenmain.class, "_starttimer" /*RemoteObject*/ );
 BA.debugLineNum = 998;BA.debugLine="End Sub";
Debug.ShouldStop(32);
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
		Debug.PushSubsStack("BuildUI (screenmain) ","screenmain",2,__ref.getField(false, "ba"),__ref,110);
if (RapidSub.canDelegate("buildui")) { return __ref.runUserSub(false, "screenmain","buildui", __ref);}
RemoteObject _pnlheader = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
RemoteObject _lblw1 = RemoteObject.createImmutable(0);
RemoteObject _lblw2 = RemoteObject.createImmutable(0);
RemoteObject _label11 = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
RemoteObject _label12 = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
RemoteObject _label13 = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
RemoteObject _label4 = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
RemoteObject _centerblockw = RemoteObject.createImmutable(0);
RemoteObject _startx = RemoteObject.createImmutable(0);
RemoteObject _label6 = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
RemoteObject _label7 = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
RemoteObject _label2 = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
RemoteObject _label18 = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
RemoteObject _label16 = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
RemoteObject _label17 = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
RemoteObject _label15 = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
 BA.debugLineNum = 110;BA.debugLine="Private Sub BuildUI";
Debug.ShouldStop(8192);
 BA.debugLineNum = 111;BA.debugLine="Root.Color = Colors.White";
Debug.ShouldStop(16384);
__ref.getField(false,"_root" /*RemoteObject*/ ).runMethod(true,"setColor",screenmain.__c.getField(false,"Colors").getField(true,"White"));
 BA.debugLineNum = 114;BA.debugLine="Dim pnlHeader As Panel";
Debug.ShouldStop(131072);
_pnlheader = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");Debug.locals.put("pnlHeader", _pnlheader);
 BA.debugLineNum = 115;BA.debugLine="pnlHeader.Initialize(\"\")";
Debug.ShouldStop(262144);
_pnlheader.runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 116;BA.debugLine="pnlHeader.Color = Colors.White";
Debug.ShouldStop(524288);
_pnlheader.runVoidMethod ("setColor",screenmain.__c.getField(false,"Colors").getField(true,"White"));
 BA.debugLineNum = 117;BA.debugLine="Root.AddView(pnlHeader, 0, 0, 100%x, 80dip)";
Debug.ShouldStop(1048576);
__ref.getField(false,"_root" /*RemoteObject*/ ).runVoidMethod ("AddView",(Object)((_pnlheader.getObject())),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(screenmain.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 100)),__ref.getField(false, "ba"))),(Object)(screenmain.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 80)))));
 BA.debugLineNum = 119;BA.debugLine="Dim lblW1 As Int = 115dip";
Debug.ShouldStop(4194304);
_lblw1 = screenmain.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 115)));Debug.locals.put("lblw1", _lblw1);Debug.locals.put("lblW1", _lblw1);
 BA.debugLineNum = 120;BA.debugLine="Dim lblW2 As Int = 100%x - lblW1 - 48dip";
Debug.ShouldStop(8388608);
_lblw2 = RemoteObject.solve(new RemoteObject[] {screenmain.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 100)),__ref.getField(false, "ba")),_lblw1,screenmain.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 48)))}, "--",2, 1);Debug.locals.put("lblw2", _lblw2);Debug.locals.put("lblW2", _lblw2);
 BA.debugLineNum = 122;BA.debugLine="Dim Label11 As Label";
Debug.ShouldStop(33554432);
_label11 = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");Debug.locals.put("Label11", _label11);
 BA.debugLineNum = 123;BA.debugLine="Label11.Initialize(\"\")";
Debug.ShouldStop(67108864);
_label11.runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 124;BA.debugLine="Label11.Text = \"Verein: \"";
Debug.ShouldStop(134217728);
_label11.runMethod(true,"setText",BA.ObjectToCharSequence("Verein: "));
 BA.debugLineNum = 125;BA.debugLine="Label11.Typeface = Typeface.DEFAULT_BOLD";
Debug.ShouldStop(268435456);
_label11.runMethod(false,"setTypeface",screenmain.__c.getField(false,"Typeface").getField(false,"DEFAULT_BOLD"));
 BA.debugLineNum = 126;BA.debugLine="Label11.TextColor = Colors.Black";
Debug.ShouldStop(536870912);
_label11.runMethod(true,"setTextColor",screenmain.__c.getField(false,"Colors").getField(true,"Black"));
 BA.debugLineNum = 127;BA.debugLine="Label11.Gravity = Gravity.RIGHT + Gravity.CENTER_";
Debug.ShouldStop(1073741824);
_label11.runMethod(true,"setGravity",RemoteObject.solve(new RemoteObject[] {screenmain.__c.getField(false,"Gravity").getField(true,"RIGHT"),screenmain.__c.getField(false,"Gravity").getField(true,"CENTER_VERTICAL")}, "+",1, 1));
 BA.debugLineNum = 128;BA.debugLine="pnlHeader.AddView(Label11, 5dip, 4dip, lblW1, 24d";
Debug.ShouldStop(-2147483648);
_pnlheader.runVoidMethod ("AddView",(Object)((_label11.getObject())),(Object)(screenmain.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 5)))),(Object)(screenmain.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 4)))),(Object)(_lblw1),(Object)(screenmain.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 24)))));
 BA.debugLineNum = 130;BA.debugLine="lblVerein.Initialize(\"\")";
Debug.ShouldStop(2);
__ref.getField(false,"_lblverein" /*RemoteObject*/ ).runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 131;BA.debugLine="lblVerein.Text = \"-Vereinsbezeichnung-\"";
Debug.ShouldStop(4);
__ref.getField(false,"_lblverein" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToCharSequence("-Vereinsbezeichnung-"));
 BA.debugLineNum = 132;BA.debugLine="lblVerein.Typeface = Typeface.DEFAULT_BOLD";
Debug.ShouldStop(8);
__ref.getField(false,"_lblverein" /*RemoteObject*/ ).runMethod(false,"setTypeface",screenmain.__c.getField(false,"Typeface").getField(false,"DEFAULT_BOLD"));
 BA.debugLineNum = 133;BA.debugLine="lblVerein.TextColor = 0xFF16AA16";
Debug.ShouldStop(16);
__ref.getField(false,"_lblverein" /*RemoteObject*/ ).runMethod(true,"setTextColor",BA.numberCast(int.class, ((int)0xff16aa16)));
 BA.debugLineNum = 134;BA.debugLine="lblVerein.Gravity = Gravity.LEFT + Gravity.CENTER";
Debug.ShouldStop(32);
__ref.getField(false,"_lblverein" /*RemoteObject*/ ).runMethod(true,"setGravity",RemoteObject.solve(new RemoteObject[] {screenmain.__c.getField(false,"Gravity").getField(true,"LEFT"),screenmain.__c.getField(false,"Gravity").getField(true,"CENTER_VERTICAL")}, "+",1, 1));
 BA.debugLineNum = 135;BA.debugLine="pnlHeader.AddView(lblVerein, lblW1 + 8dip, 4dip,";
Debug.ShouldStop(64);
_pnlheader.runVoidMethod ("AddView",(Object)((__ref.getField(false,"_lblverein" /*RemoteObject*/ ).getObject())),(Object)(RemoteObject.solve(new RemoteObject[] {_lblw1,screenmain.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 8)))}, "+",1, 1)),(Object)(screenmain.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 4)))),(Object)(_lblw2),(Object)(screenmain.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 24)))));
 BA.debugLineNum = 137;BA.debugLine="Dim Label12 As Label";
Debug.ShouldStop(256);
_label12 = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");Debug.locals.put("Label12", _label12);
 BA.debugLineNum = 138;BA.debugLine="Label12.Initialize(\"\")";
Debug.ShouldStop(512);
_label12.runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 139;BA.debugLine="Label12.Text = \"Veranstaltung:\"";
Debug.ShouldStop(1024);
_label12.runMethod(true,"setText",BA.ObjectToCharSequence("Veranstaltung:"));
 BA.debugLineNum = 140;BA.debugLine="Label12.Typeface = Typeface.DEFAULT_BOLD";
Debug.ShouldStop(2048);
_label12.runMethod(false,"setTypeface",screenmain.__c.getField(false,"Typeface").getField(false,"DEFAULT_BOLD"));
 BA.debugLineNum = 141;BA.debugLine="Label12.TextColor = Colors.Black";
Debug.ShouldStop(4096);
_label12.runMethod(true,"setTextColor",screenmain.__c.getField(false,"Colors").getField(true,"Black"));
 BA.debugLineNum = 142;BA.debugLine="Label12.Gravity = Gravity.RIGHT + Gravity.CENTER_";
Debug.ShouldStop(8192);
_label12.runMethod(true,"setGravity",RemoteObject.solve(new RemoteObject[] {screenmain.__c.getField(false,"Gravity").getField(true,"RIGHT"),screenmain.__c.getField(false,"Gravity").getField(true,"CENTER_VERTICAL")}, "+",1, 1));
 BA.debugLineNum = 143;BA.debugLine="pnlHeader.AddView(Label12, 5dip, 28dip, lblW1, 24";
Debug.ShouldStop(16384);
_pnlheader.runVoidMethod ("AddView",(Object)((_label12.getObject())),(Object)(screenmain.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 5)))),(Object)(screenmain.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 28)))),(Object)(_lblw1),(Object)(screenmain.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 24)))));
 BA.debugLineNum = 145;BA.debugLine="lblVeranstaltung.Initialize(\"\")";
Debug.ShouldStop(65536);
__ref.getField(false,"_lblveranstaltung" /*RemoteObject*/ ).runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 146;BA.debugLine="lblVeranstaltung.Text = \"-Veranstaltung-\"";
Debug.ShouldStop(131072);
__ref.getField(false,"_lblveranstaltung" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToCharSequence("-Veranstaltung-"));
 BA.debugLineNum = 147;BA.debugLine="lblVeranstaltung.Typeface = Typeface.DEFAULT_BOLD";
Debug.ShouldStop(262144);
__ref.getField(false,"_lblveranstaltung" /*RemoteObject*/ ).runMethod(false,"setTypeface",screenmain.__c.getField(false,"Typeface").getField(false,"DEFAULT_BOLD"));
 BA.debugLineNum = 148;BA.debugLine="lblVeranstaltung.TextColor = 0xFF16AA16";
Debug.ShouldStop(524288);
__ref.getField(false,"_lblveranstaltung" /*RemoteObject*/ ).runMethod(true,"setTextColor",BA.numberCast(int.class, ((int)0xff16aa16)));
 BA.debugLineNum = 149;BA.debugLine="lblVeranstaltung.Gravity = Gravity.LEFT + Gravity";
Debug.ShouldStop(1048576);
__ref.getField(false,"_lblveranstaltung" /*RemoteObject*/ ).runMethod(true,"setGravity",RemoteObject.solve(new RemoteObject[] {screenmain.__c.getField(false,"Gravity").getField(true,"LEFT"),screenmain.__c.getField(false,"Gravity").getField(true,"CENTER_VERTICAL")}, "+",1, 1));
 BA.debugLineNum = 150;BA.debugLine="pnlHeader.AddView(lblVeranstaltung, lblW1 + 8dip,";
Debug.ShouldStop(2097152);
_pnlheader.runVoidMethod ("AddView",(Object)((__ref.getField(false,"_lblveranstaltung" /*RemoteObject*/ ).getObject())),(Object)(RemoteObject.solve(new RemoteObject[] {_lblw1,screenmain.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 8)))}, "+",1, 1)),(Object)(screenmain.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 28)))),(Object)(_lblw2),(Object)(screenmain.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 24)))));
 BA.debugLineNum = 152;BA.debugLine="Dim Label13 As Label";
Debug.ShouldStop(8388608);
_label13 = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");Debug.locals.put("Label13", _label13);
 BA.debugLineNum = 153;BA.debugLine="Label13.Initialize(\"\")";
Debug.ShouldStop(16777216);
_label13.runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 154;BA.debugLine="Label13.Text = \"Datum:\"";
Debug.ShouldStop(33554432);
_label13.runMethod(true,"setText",BA.ObjectToCharSequence("Datum:"));
 BA.debugLineNum = 155;BA.debugLine="Label13.Typeface = Typeface.DEFAULT_BOLD";
Debug.ShouldStop(67108864);
_label13.runMethod(false,"setTypeface",screenmain.__c.getField(false,"Typeface").getField(false,"DEFAULT_BOLD"));
 BA.debugLineNum = 156;BA.debugLine="Label13.TextColor = Colors.Black";
Debug.ShouldStop(134217728);
_label13.runMethod(true,"setTextColor",screenmain.__c.getField(false,"Colors").getField(true,"Black"));
 BA.debugLineNum = 157;BA.debugLine="Label13.Gravity = Gravity.RIGHT + Gravity.CENTER_";
Debug.ShouldStop(268435456);
_label13.runMethod(true,"setGravity",RemoteObject.solve(new RemoteObject[] {screenmain.__c.getField(false,"Gravity").getField(true,"RIGHT"),screenmain.__c.getField(false,"Gravity").getField(true,"CENTER_VERTICAL")}, "+",1, 1));
 BA.debugLineNum = 158;BA.debugLine="pnlHeader.AddView(Label13, 5dip, 52dip, lblW1, 24";
Debug.ShouldStop(536870912);
_pnlheader.runVoidMethod ("AddView",(Object)((_label13.getObject())),(Object)(screenmain.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 5)))),(Object)(screenmain.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 52)))),(Object)(_lblw1),(Object)(screenmain.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 24)))));
 BA.debugLineNum = 160;BA.debugLine="lblDatum.Initialize(\"\")";
Debug.ShouldStop(-2147483648);
__ref.getField(false,"_lbldatum" /*RemoteObject*/ ).runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 161;BA.debugLine="lblDatum.Text = \"-Datum-\"";
Debug.ShouldStop(1);
__ref.getField(false,"_lbldatum" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToCharSequence("-Datum-"));
 BA.debugLineNum = 162;BA.debugLine="lblDatum.Typeface = Typeface.DEFAULT_BOLD";
Debug.ShouldStop(2);
__ref.getField(false,"_lbldatum" /*RemoteObject*/ ).runMethod(false,"setTypeface",screenmain.__c.getField(false,"Typeface").getField(false,"DEFAULT_BOLD"));
 BA.debugLineNum = 163;BA.debugLine="lblDatum.TextColor = 0xFF16AA16";
Debug.ShouldStop(4);
__ref.getField(false,"_lbldatum" /*RemoteObject*/ ).runMethod(true,"setTextColor",BA.numberCast(int.class, ((int)0xff16aa16)));
 BA.debugLineNum = 164;BA.debugLine="lblDatum.Gravity = Gravity.LEFT + Gravity.CENTER_";
Debug.ShouldStop(8);
__ref.getField(false,"_lbldatum" /*RemoteObject*/ ).runMethod(true,"setGravity",RemoteObject.solve(new RemoteObject[] {screenmain.__c.getField(false,"Gravity").getField(true,"LEFT"),screenmain.__c.getField(false,"Gravity").getField(true,"CENTER_VERTICAL")}, "+",1, 1));
 BA.debugLineNum = 165;BA.debugLine="pnlHeader.AddView(lblDatum, lblW1 + 8dip, 52dip,";
Debug.ShouldStop(16);
_pnlheader.runVoidMethod ("AddView",(Object)((__ref.getField(false,"_lbldatum" /*RemoteObject*/ ).getObject())),(Object)(RemoteObject.solve(new RemoteObject[] {_lblw1,screenmain.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 8)))}, "+",1, 1)),(Object)(screenmain.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 52)))),(Object)(_lblw2),(Object)(screenmain.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 24)))));
 BA.debugLineNum = 167;BA.debugLine="btnSettings.Initialize(\"btnSettings\")";
Debug.ShouldStop(64);
__ref.getField(false,"_btnsettings" /*RemoteObject*/ ).runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("btnSettings")));
 BA.debugLineNum = 168;BA.debugLine="SetButtonImageSafe(btnSettings, \"3Punkte.png\", \"⋮";
Debug.ShouldStop(128);
__ref.runClassMethod (b4a.example.screenmain.class, "_setbuttonimagesafe" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_btnsettings" /*RemoteObject*/ )),(Object)(BA.ObjectToString("3Punkte.png")),(Object)(RemoteObject.createImmutable("⋮")));
 BA.debugLineNum = 169;BA.debugLine="pnlHeader.AddView(btnSettings, 100%x - 40dip, 22d";
Debug.ShouldStop(256);
_pnlheader.runVoidMethod ("AddView",(Object)((__ref.getField(false,"_btnsettings" /*RemoteObject*/ ).getObject())),(Object)(RemoteObject.solve(new RemoteObject[] {screenmain.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 100)),__ref.getField(false, "ba")),screenmain.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 40)))}, "-",1, 1)),(Object)(screenmain.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 22)))),(Object)(screenmain.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 34)))),(Object)(screenmain.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 34)))));
 BA.debugLineNum = 172;BA.debugLine="vaEingabe.Initialize(\"\")";
Debug.ShouldStop(2048);
__ref.getField(false,"_vaeingabe" /*RemoteObject*/ ).runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 173;BA.debugLine="vaEingabe.Color = 0xFFEEFFEE";
Debug.ShouldStop(4096);
__ref.getField(false,"_vaeingabe" /*RemoteObject*/ ).runVoidMethod ("setColor",BA.numberCast(int.class, ((int)0xffeeffee)));
 BA.debugLineNum = 174;BA.debugLine="Root.AddView(vaEingabe, 0, 80dip, 100%x, 340dip)";
Debug.ShouldStop(8192);
__ref.getField(false,"_root" /*RemoteObject*/ ).runVoidMethod ("AddView",(Object)((__ref.getField(false,"_vaeingabe" /*RemoteObject*/ ).getObject())),(Object)(BA.numberCast(int.class, 0)),(Object)(screenmain.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 80)))),(Object)(screenmain.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 100)),__ref.getField(false, "ba"))),(Object)(screenmain.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 340)))));
 BA.debugLineNum = 176;BA.debugLine="btnCloseVstng.Initialize(\"btnCloseVstng\")";
Debug.ShouldStop(32768);
__ref.getField(false,"_btnclosevstng" /*RemoteObject*/ ).runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("btnCloseVstng")));
 BA.debugLineNum = 177;BA.debugLine="SetButtonImageSafe(btnCloseVstng, \"close.png\", \"�";
Debug.ShouldStop(65536);
__ref.runClassMethod (b4a.example.screenmain.class, "_setbuttonimagesafe" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_btnclosevstng" /*RemoteObject*/ )),(Object)(BA.ObjectToString("close.png")),(Object)(RemoteObject.createImmutable("🔒")));
 BA.debugLineNum = 178;BA.debugLine="vaEingabe.AddView(btnCloseVstng, 8dip, 8dip, 32di";
Debug.ShouldStop(131072);
__ref.getField(false,"_vaeingabe" /*RemoteObject*/ ).runVoidMethod ("AddView",(Object)((__ref.getField(false,"_btnclosevstng" /*RemoteObject*/ ).getObject())),(Object)(screenmain.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 8)))),(Object)(screenmain.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 8)))),(Object)(screenmain.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 32)))),(Object)(screenmain.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 32)))));
 BA.debugLineNum = 180;BA.debugLine="Dim Label4 As Label";
Debug.ShouldStop(524288);
_label4 = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");Debug.locals.put("Label4", _label4);
 BA.debugLineNum = 181;BA.debugLine="Label4.Initialize(\"\")";
Debug.ShouldStop(1048576);
_label4.runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 182;BA.debugLine="Label4.Text = \"Angelplatz\"";
Debug.ShouldStop(2097152);
_label4.runMethod(true,"setText",BA.ObjectToCharSequence("Angelplatz"));
 BA.debugLineNum = 183;BA.debugLine="Label4.TextSize = 16";
Debug.ShouldStop(4194304);
_label4.runMethod(true,"setTextSize",BA.numberCast(float.class, 16));
 BA.debugLineNum = 184;BA.debugLine="Label4.Typeface = Typeface.DEFAULT_BOLD";
Debug.ShouldStop(8388608);
_label4.runMethod(false,"setTypeface",screenmain.__c.getField(false,"Typeface").getField(false,"DEFAULT_BOLD"));
 BA.debugLineNum = 185;BA.debugLine="Label4.TextColor = Colors.Black";
Debug.ShouldStop(16777216);
_label4.runMethod(true,"setTextColor",screenmain.__c.getField(false,"Colors").getField(true,"Black"));
 BA.debugLineNum = 186;BA.debugLine="Label4.Gravity = Gravity.CENTER";
Debug.ShouldStop(33554432);
_label4.runMethod(true,"setGravity",screenmain.__c.getField(false,"Gravity").getField(true,"CENTER"));
 BA.debugLineNum = 187;BA.debugLine="vaEingabe.AddView(Label4, 45dip, 8dip, 100%x - 90";
Debug.ShouldStop(67108864);
__ref.getField(false,"_vaeingabe" /*RemoteObject*/ ).runVoidMethod ("AddView",(Object)((_label4.getObject())),(Object)(screenmain.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 45)))),(Object)(screenmain.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 8)))),(Object)(RemoteObject.solve(new RemoteObject[] {screenmain.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 100)),__ref.getField(false, "ba")),screenmain.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 90)))}, "-",1, 1)),(Object)(screenmain.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 32)))));
 BA.debugLineNum = 189;BA.debugLine="btnUp.Initialize(\"btnUp\")";
Debug.ShouldStop(268435456);
__ref.getField(false,"_btnup" /*RemoteObject*/ ).runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("btnUp")));
 BA.debugLineNum = 190;BA.debugLine="SetButtonImageSafe(btnUp, \"up.png\", \"▲\")";
Debug.ShouldStop(536870912);
__ref.runClassMethod (b4a.example.screenmain.class, "_setbuttonimagesafe" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_btnup" /*RemoteObject*/ )),(Object)(BA.ObjectToString("up.png")),(Object)(RemoteObject.createImmutable("▲")));
 BA.debugLineNum = 191;BA.debugLine="vaEingabe.AddView(btnUp, 100%x - 40dip, 8dip, 32d";
Debug.ShouldStop(1073741824);
__ref.getField(false,"_vaeingabe" /*RemoteObject*/ ).runVoidMethod ("AddView",(Object)((__ref.getField(false,"_btnup" /*RemoteObject*/ ).getObject())),(Object)(RemoteObject.solve(new RemoteObject[] {screenmain.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 100)),__ref.getField(false, "ba")),screenmain.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 40)))}, "-",1, 1)),(Object)(screenmain.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 8)))),(Object)(screenmain.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 32)))),(Object)(screenmain.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 32)))));
 BA.debugLineNum = 194;BA.debugLine="Dim centerBlockW As Int = 270dip";
Debug.ShouldStop(2);
_centerblockw = screenmain.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 270)));Debug.locals.put("centerblockw", _centerblockw);Debug.locals.put("centerBlockW", _centerblockw);
 BA.debugLineNum = 195;BA.debugLine="Dim startX As Int = (100%x - centerBlockW) / 2";
Debug.ShouldStop(4);
_startx = BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {(RemoteObject.solve(new RemoteObject[] {screenmain.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 100)),__ref.getField(false, "ba")),_centerblockw}, "-",1, 1)),RemoteObject.createImmutable(2)}, "/",0, 0));Debug.locals.put("startx", _startx);Debug.locals.put("startX", _startx);
 BA.debugLineNum = 197;BA.debugLine="btnMinus.Initialize(\"btnMinus\")";
Debug.ShouldStop(16);
__ref.getField(false,"_btnminus" /*RemoteObject*/ ).runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("btnMinus")));
 BA.debugLineNum = 198;BA.debugLine="btnMinus.Text = \"-\"";
Debug.ShouldStop(32);
__ref.getField(false,"_btnminus" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToCharSequence("-"));
 BA.debugLineNum = 199;BA.debugLine="btnMinus.TextSize = 26";
Debug.ShouldStop(64);
__ref.getField(false,"_btnminus" /*RemoteObject*/ ).runMethod(true,"setTextSize",BA.numberCast(float.class, 26));
 BA.debugLineNum = 200;BA.debugLine="btnMinus.Typeface = Typeface.DEFAULT_BOLD";
Debug.ShouldStop(128);
__ref.getField(false,"_btnminus" /*RemoteObject*/ ).runMethod(false,"setTypeface",screenmain.__c.getField(false,"Typeface").getField(false,"DEFAULT_BOLD"));
 BA.debugLineNum = 201;BA.debugLine="btnMinus.TextColor = 0xFF16AA16";
Debug.ShouldStop(256);
__ref.getField(false,"_btnminus" /*RemoteObject*/ ).runMethod(true,"setTextColor",BA.numberCast(int.class, ((int)0xff16aa16)));
 BA.debugLineNum = 202;BA.debugLine="vaEingabe.AddView(btnMinus, startX, 45dip, 60dip,";
Debug.ShouldStop(512);
__ref.getField(false,"_vaeingabe" /*RemoteObject*/ ).runVoidMethod ("AddView",(Object)((__ref.getField(false,"_btnminus" /*RemoteObject*/ ).getObject())),(Object)(_startx),(Object)(screenmain.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 45)))),(Object)(screenmain.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 60)))),(Object)(screenmain.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 55)))));
 BA.debugLineNum = 204;BA.debugLine="spnPlatz.Initialize(\"spnPlatz\")";
Debug.ShouldStop(2048);
__ref.getField(false,"_spnplatz" /*RemoteObject*/ ).runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("spnPlatz")));
 BA.debugLineNum = 205;BA.debugLine="spnPlatz.TextSize = 28";
Debug.ShouldStop(4096);
__ref.getField(false,"_spnplatz" /*RemoteObject*/ ).runMethod(true,"setTextSize",BA.numberCast(float.class, 28));
 BA.debugLineNum = 206;BA.debugLine="spnPlatz.TextColor = 0xFF16AA16";
Debug.ShouldStop(8192);
__ref.getField(false,"_spnplatz" /*RemoteObject*/ ).runMethod(true,"setTextColor",BA.numberCast(int.class, ((int)0xff16aa16)));
 BA.debugLineNum = 207;BA.debugLine="spnPlatz.DropdownBackgroundColor = Colors.White";
Debug.ShouldStop(16384);
__ref.getField(false,"_spnplatz" /*RemoteObject*/ ).runMethod(true,"setDropdownBackgroundColor",screenmain.__c.getField(false,"Colors").getField(true,"White"));
 BA.debugLineNum = 208;BA.debugLine="spnPlatz.DropdownTextColor = 0xFF16AA16";
Debug.ShouldStop(32768);
__ref.getField(false,"_spnplatz" /*RemoteObject*/ ).runMethod(true,"setDropdownTextColor",BA.numberCast(int.class, ((int)0xff16aa16)));
 BA.debugLineNum = 209;BA.debugLine="vaEingabe.AddView(spnPlatz, startX + 60dip, 45dip";
Debug.ShouldStop(65536);
__ref.getField(false,"_vaeingabe" /*RemoteObject*/ ).runVoidMethod ("AddView",(Object)((__ref.getField(false,"_spnplatz" /*RemoteObject*/ ).getObject())),(Object)(RemoteObject.solve(new RemoteObject[] {_startx,screenmain.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 60)))}, "+",1, 1)),(Object)(screenmain.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 45)))),(Object)(screenmain.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 150)))),(Object)(screenmain.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 55)))));
 BA.debugLineNum = 211;BA.debugLine="btnPlus.Initialize(\"btnPlus\")";
Debug.ShouldStop(262144);
__ref.getField(false,"_btnplus" /*RemoteObject*/ ).runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("btnPlus")));
 BA.debugLineNum = 212;BA.debugLine="btnPlus.Text = \"+\"";
Debug.ShouldStop(524288);
__ref.getField(false,"_btnplus" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToCharSequence("+"));
 BA.debugLineNum = 213;BA.debugLine="btnPlus.TextSize = 26";
Debug.ShouldStop(1048576);
__ref.getField(false,"_btnplus" /*RemoteObject*/ ).runMethod(true,"setTextSize",BA.numberCast(float.class, 26));
 BA.debugLineNum = 214;BA.debugLine="btnPlus.Typeface = Typeface.DEFAULT_BOLD";
Debug.ShouldStop(2097152);
__ref.getField(false,"_btnplus" /*RemoteObject*/ ).runMethod(false,"setTypeface",screenmain.__c.getField(false,"Typeface").getField(false,"DEFAULT_BOLD"));
 BA.debugLineNum = 215;BA.debugLine="btnPlus.TextColor = 0xFF16AA16";
Debug.ShouldStop(4194304);
__ref.getField(false,"_btnplus" /*RemoteObject*/ ).runMethod(true,"setTextColor",BA.numberCast(int.class, ((int)0xff16aa16)));
 BA.debugLineNum = 216;BA.debugLine="vaEingabe.AddView(btnPlus, startX + 210dip, 45dip";
Debug.ShouldStop(8388608);
__ref.getField(false,"_vaeingabe" /*RemoteObject*/ ).runVoidMethod ("AddView",(Object)((__ref.getField(false,"_btnplus" /*RemoteObject*/ ).getObject())),(Object)(RemoteObject.solve(new RemoteObject[] {_startx,screenmain.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 210)))}, "+",1, 1)),(Object)(screenmain.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 45)))),(Object)(screenmain.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 60)))),(Object)(screenmain.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 55)))));
 BA.debugLineNum = 219;BA.debugLine="Dim Label6 As Label";
Debug.ShouldStop(67108864);
_label6 = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");Debug.locals.put("Label6", _label6);
 BA.debugLineNum = 220;BA.debugLine="Label6.Initialize(\"\")";
Debug.ShouldStop(134217728);
_label6.runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 221;BA.debugLine="Label6.Text = \"Teilnehmer\"";
Debug.ShouldStop(268435456);
_label6.runMethod(true,"setText",BA.ObjectToCharSequence("Teilnehmer"));
 BA.debugLineNum = 222;BA.debugLine="Label6.TextSize = 16";
Debug.ShouldStop(536870912);
_label6.runMethod(true,"setTextSize",BA.numberCast(float.class, 16));
 BA.debugLineNum = 223;BA.debugLine="Label6.Typeface = Typeface.DEFAULT_BOLD";
Debug.ShouldStop(1073741824);
_label6.runMethod(false,"setTypeface",screenmain.__c.getField(false,"Typeface").getField(false,"DEFAULT_BOLD"));
 BA.debugLineNum = 224;BA.debugLine="Label6.TextColor = Colors.Black";
Debug.ShouldStop(-2147483648);
_label6.runMethod(true,"setTextColor",screenmain.__c.getField(false,"Colors").getField(true,"Black"));
 BA.debugLineNum = 225;BA.debugLine="Label6.Gravity = Gravity.CENTER";
Debug.ShouldStop(1);
_label6.runMethod(true,"setGravity",screenmain.__c.getField(false,"Gravity").getField(true,"CENTER"));
 BA.debugLineNum = 226;BA.debugLine="vaEingabe.AddView(Label6, 0, 110dip, 100%x, 24dip";
Debug.ShouldStop(2);
__ref.getField(false,"_vaeingabe" /*RemoteObject*/ ).runVoidMethod ("AddView",(Object)((_label6.getObject())),(Object)(BA.numberCast(int.class, 0)),(Object)(screenmain.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 110)))),(Object)(screenmain.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 100)),__ref.getField(false, "ba"))),(Object)(screenmain.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 24)))));
 BA.debugLineNum = 228;BA.debugLine="tbxTeilnehmer.Initialize(\"tbxTeilnehmer\")";
Debug.ShouldStop(8);
__ref.getField(false,"_tbxteilnehmer" /*RemoteObject*/ ).runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("tbxTeilnehmer")));
 BA.debugLineNum = 230;BA.debugLine="tbxTeilnehmer.TextSize = 20";
Debug.ShouldStop(32);
__ref.getField(false,"_tbxteilnehmer" /*RemoteObject*/ ).runMethod(true,"setTextSize",BA.numberCast(float.class, 20));
 BA.debugLineNum = 231;BA.debugLine="tbxTeilnehmer.Typeface = Typeface.DEFAULT_BOLD";
Debug.ShouldStop(64);
__ref.getField(false,"_tbxteilnehmer" /*RemoteObject*/ ).runMethod(false,"setTypeface",screenmain.__c.getField(false,"Typeface").getField(false,"DEFAULT_BOLD"));
 BA.debugLineNum = 232;BA.debugLine="tbxTeilnehmer.TextColor = 0xFF16AA16";
Debug.ShouldStop(128);
__ref.getField(false,"_tbxteilnehmer" /*RemoteObject*/ ).runMethod(true,"setTextColor",BA.numberCast(int.class, ((int)0xff16aa16)));
 BA.debugLineNum = 233;BA.debugLine="tbxTeilnehmer.SingleLine = True";
Debug.ShouldStop(256);
__ref.getField(false,"_tbxteilnehmer" /*RemoteObject*/ ).runVoidMethod ("setSingleLine",screenmain.__c.getField(true,"True"));
 BA.debugLineNum = 234;BA.debugLine="vaEingabe.AddView(tbxTeilnehmer, 10%x, 136dip, 80";
Debug.ShouldStop(512);
__ref.getField(false,"_vaeingabe" /*RemoteObject*/ ).runVoidMethod ("AddView",(Object)((__ref.getField(false,"_tbxteilnehmer" /*RemoteObject*/ ).getObject())),(Object)(screenmain.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 10)),__ref.getField(false, "ba"))),(Object)(screenmain.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 136)))),(Object)(screenmain.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 80)),__ref.getField(false, "ba"))),(Object)(screenmain.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 46)))));
 BA.debugLineNum = 237;BA.debugLine="vaErgEingabe.Initialize(\"\")";
Debug.ShouldStop(4096);
__ref.getField(false,"_vaergeingabe" /*RemoteObject*/ ).runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 238;BA.debugLine="vaErgEingabe.Color = 0xFFEEFFEE";
Debug.ShouldStop(8192);
__ref.getField(false,"_vaergeingabe" /*RemoteObject*/ ).runVoidMethod ("setColor",BA.numberCast(int.class, ((int)0xffeeffee)));
 BA.debugLineNum = 239;BA.debugLine="vaEingabe.AddView(vaErgEingabe, 0, 186dip, 100%x,";
Debug.ShouldStop(16384);
__ref.getField(false,"_vaeingabe" /*RemoteObject*/ ).runVoidMethod ("AddView",(Object)((__ref.getField(false,"_vaergeingabe" /*RemoteObject*/ ).getObject())),(Object)(BA.numberCast(int.class, 0)),(Object)(screenmain.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 186)))),(Object)(screenmain.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 100)),__ref.getField(false, "ba"))),(Object)(screenmain.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 154)))));
 BA.debugLineNum = 241;BA.debugLine="btnFDJeingabe.Initialize(\"btnFDJeingabe\")";
Debug.ShouldStop(65536);
__ref.getField(false,"_btnfdjeingabe" /*RemoteObject*/ ).runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("btnFDJeingabe")));
 BA.debugLineNum = 242;BA.debugLine="btnFDJeingabe.Text = \"Fisch des Jahres\"";
Debug.ShouldStop(131072);
__ref.getField(false,"_btnfdjeingabe" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToCharSequence("Fisch des Jahres"));
 BA.debugLineNum = 243;BA.debugLine="btnFDJeingabe.TextSize = 11";
Debug.ShouldStop(262144);
__ref.getField(false,"_btnfdjeingabe" /*RemoteObject*/ ).runMethod(true,"setTextSize",BA.numberCast(float.class, 11));
 BA.debugLineNum = 244;BA.debugLine="btnFDJeingabe.Typeface = Typeface.DEFAULT_BOLD";
Debug.ShouldStop(524288);
__ref.getField(false,"_btnfdjeingabe" /*RemoteObject*/ ).runMethod(false,"setTypeface",screenmain.__c.getField(false,"Typeface").getField(false,"DEFAULT_BOLD"));
 BA.debugLineNum = 245;BA.debugLine="btnFDJeingabe.TextColor = 0xFF16AA16";
Debug.ShouldStop(1048576);
__ref.getField(false,"_btnfdjeingabe" /*RemoteObject*/ ).runMethod(true,"setTextColor",BA.numberCast(int.class, ((int)0xff16aa16)));
 BA.debugLineNum = 246;BA.debugLine="vaErgEingabe.AddView(btnFDJeingabe, 100%x - 145di";
Debug.ShouldStop(2097152);
__ref.getField(false,"_vaergeingabe" /*RemoteObject*/ ).runVoidMethod ("AddView",(Object)((__ref.getField(false,"_btnfdjeingabe" /*RemoteObject*/ ).getObject())),(Object)(RemoteObject.solve(new RemoteObject[] {screenmain.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 100)),__ref.getField(false, "ba")),screenmain.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 145)))}, "-",1, 1)),(Object)(screenmain.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 4)))),(Object)(screenmain.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 130)))),(Object)(screenmain.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 34)))));
 BA.debugLineNum = 248;BA.debugLine="Dim Label7 As Label";
Debug.ShouldStop(8388608);
_label7 = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");Debug.locals.put("Label7", _label7);
 BA.debugLineNum = 249;BA.debugLine="Label7.Initialize(\"\")";
Debug.ShouldStop(16777216);
_label7.runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 250;BA.debugLine="Label7.Text = \"Fang:  \"";
Debug.ShouldStop(33554432);
_label7.runMethod(true,"setText",BA.ObjectToCharSequence("Fang:  "));
 BA.debugLineNum = 251;BA.debugLine="Label7.TextSize = 16";
Debug.ShouldStop(67108864);
_label7.runMethod(true,"setTextSize",BA.numberCast(float.class, 16));
 BA.debugLineNum = 252;BA.debugLine="Label7.Typeface = Typeface.DEFAULT_BOLD";
Debug.ShouldStop(134217728);
_label7.runMethod(false,"setTypeface",screenmain.__c.getField(false,"Typeface").getField(false,"DEFAULT_BOLD"));
 BA.debugLineNum = 253;BA.debugLine="Label7.TextColor = Colors.Black";
Debug.ShouldStop(268435456);
_label7.runMethod(true,"setTextColor",screenmain.__c.getField(false,"Colors").getField(true,"Black"));
 BA.debugLineNum = 254;BA.debugLine="Label7.Gravity = Gravity.RIGHT + Gravity.CENTER_V";
Debug.ShouldStop(536870912);
_label7.runMethod(true,"setGravity",RemoteObject.solve(new RemoteObject[] {screenmain.__c.getField(false,"Gravity").getField(true,"RIGHT"),screenmain.__c.getField(false,"Gravity").getField(true,"CENTER_VERTICAL")}, "+",1, 1));
 BA.debugLineNum = 255;BA.debugLine="vaErgEingabe.AddView(Label7, 10dip, 44dip, (100%x";
Debug.ShouldStop(1073741824);
__ref.getField(false,"_vaergeingabe" /*RemoteObject*/ ).runVoidMethod ("AddView",(Object)((_label7.getObject())),(Object)(screenmain.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 10)))),(Object)(screenmain.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 44)))),(Object)(BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {(RemoteObject.solve(new RemoteObject[] {screenmain.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 100)),__ref.getField(false, "ba")),screenmain.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 150)))}, "-",1, 1)),RemoteObject.createImmutable(2),screenmain.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 10)))}, "/-",1, 0))),(Object)(screenmain.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 52)))));
 BA.debugLineNum = 257;BA.debugLine="tbxGramm.Initialize(\"tbxGramm\")";
Debug.ShouldStop(1);
__ref.getField(false,"_tbxgramm" /*RemoteObject*/ ).runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("tbxGramm")));
 BA.debugLineNum = 258;BA.debugLine="tbxGramm.TextSize = 30";
Debug.ShouldStop(2);
__ref.getField(false,"_tbxgramm" /*RemoteObject*/ ).runMethod(true,"setTextSize",BA.numberCast(float.class, 30));
 BA.debugLineNum = 259;BA.debugLine="tbxGramm.Typeface = Typeface.DEFAULT_BOLD";
Debug.ShouldStop(4);
__ref.getField(false,"_tbxgramm" /*RemoteObject*/ ).runMethod(false,"setTypeface",screenmain.__c.getField(false,"Typeface").getField(false,"DEFAULT_BOLD"));
 BA.debugLineNum = 260;BA.debugLine="tbxGramm.TextColor = 0xFF16AA16";
Debug.ShouldStop(8);
__ref.getField(false,"_tbxgramm" /*RemoteObject*/ ).runMethod(true,"setTextColor",BA.numberCast(int.class, ((int)0xff16aa16)));
 BA.debugLineNum = 261;BA.debugLine="tbxGramm.Gravity = Gravity.CENTER";
Debug.ShouldStop(16);
__ref.getField(false,"_tbxgramm" /*RemoteObject*/ ).runMethod(true,"setGravity",screenmain.__c.getField(false,"Gravity").getField(true,"CENTER"));
 BA.debugLineNum = 262;BA.debugLine="tbxGramm.InputType = tbxGramm.INPUT_TYPE_NUMBERS";
Debug.ShouldStop(32);
__ref.getField(false,"_tbxgramm" /*RemoteObject*/ ).runMethod(true,"setInputType",__ref.getField(false,"_tbxgramm" /*RemoteObject*/ ).getField(true,"INPUT_TYPE_NUMBERS"));
 BA.debugLineNum = 263;BA.debugLine="tbxGramm.SingleLine = True";
Debug.ShouldStop(64);
__ref.getField(false,"_tbxgramm" /*RemoteObject*/ ).runVoidMethod ("setSingleLine",screenmain.__c.getField(true,"True"));
 BA.debugLineNum = 264;BA.debugLine="vaErgEingabe.AddView(tbxGramm, (100%x - 150dip) /";
Debug.ShouldStop(128);
__ref.getField(false,"_vaergeingabe" /*RemoteObject*/ ).runVoidMethod ("AddView",(Object)((__ref.getField(false,"_tbxgramm" /*RemoteObject*/ ).getObject())),(Object)(BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {(RemoteObject.solve(new RemoteObject[] {screenmain.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 100)),__ref.getField(false, "ba")),screenmain.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 150)))}, "-",1, 1)),RemoteObject.createImmutable(2)}, "/",0, 0))),(Object)(screenmain.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 44)))),(Object)(screenmain.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 150)))),(Object)(screenmain.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 52)))));
 BA.debugLineNum = 266;BA.debugLine="Dim Label2 As Label";
Debug.ShouldStop(512);
_label2 = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");Debug.locals.put("Label2", _label2);
 BA.debugLineNum = 267;BA.debugLine="Label2.Initialize(\"\")";
Debug.ShouldStop(1024);
_label2.runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 268;BA.debugLine="Label2.Text = \" Gramm\"";
Debug.ShouldStop(2048);
_label2.runMethod(true,"setText",BA.ObjectToCharSequence(" Gramm"));
 BA.debugLineNum = 269;BA.debugLine="Label2.TextSize = 16";
Debug.ShouldStop(4096);
_label2.runMethod(true,"setTextSize",BA.numberCast(float.class, 16));
 BA.debugLineNum = 270;BA.debugLine="Label2.Typeface = Typeface.DEFAULT_BOLD";
Debug.ShouldStop(8192);
_label2.runMethod(false,"setTypeface",screenmain.__c.getField(false,"Typeface").getField(false,"DEFAULT_BOLD"));
 BA.debugLineNum = 271;BA.debugLine="Label2.TextColor = Colors.Black";
Debug.ShouldStop(16384);
_label2.runMethod(true,"setTextColor",screenmain.__c.getField(false,"Colors").getField(true,"Black"));
 BA.debugLineNum = 272;BA.debugLine="Label2.Gravity = Gravity.LEFT + Gravity.CENTER_VE";
Debug.ShouldStop(32768);
_label2.runMethod(true,"setGravity",RemoteObject.solve(new RemoteObject[] {screenmain.__c.getField(false,"Gravity").getField(true,"LEFT"),screenmain.__c.getField(false,"Gravity").getField(true,"CENTER_VERTICAL")}, "+",1, 1));
 BA.debugLineNum = 273;BA.debugLine="vaErgEingabe.AddView(Label2, (100%x + 150dip) / 2";
Debug.ShouldStop(65536);
__ref.getField(false,"_vaergeingabe" /*RemoteObject*/ ).runVoidMethod ("AddView",(Object)((_label2.getObject())),(Object)(BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {(RemoteObject.solve(new RemoteObject[] {screenmain.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 100)),__ref.getField(false, "ba")),screenmain.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 150)))}, "+",1, 1)),RemoteObject.createImmutable(2)}, "/",0, 0))),(Object)(screenmain.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 44)))),(Object)(BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {(RemoteObject.solve(new RemoteObject[] {screenmain.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 100)),__ref.getField(false, "ba")),screenmain.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 150)))}, "-",1, 1)),RemoteObject.createImmutable(2),screenmain.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 10)))}, "/-",1, 0))),(Object)(screenmain.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 52)))));
 BA.debugLineNum = 275;BA.debugLine="btnSpeichern.Initialize(\"btnSpeichern\")";
Debug.ShouldStop(262144);
__ref.getField(false,"_btnspeichern" /*RemoteObject*/ ).runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("btnSpeichern")));
 BA.debugLineNum = 276;BA.debugLine="btnSpeichern.Text = \"speichern\"";
Debug.ShouldStop(524288);
__ref.getField(false,"_btnspeichern" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToCharSequence("speichern"));
 BA.debugLineNum = 277;BA.debugLine="btnSpeichern.TextSize = 16";
Debug.ShouldStop(1048576);
__ref.getField(false,"_btnspeichern" /*RemoteObject*/ ).runMethod(true,"setTextSize",BA.numberCast(float.class, 16));
 BA.debugLineNum = 278;BA.debugLine="btnSpeichern.Typeface = Typeface.DEFAULT_BOLD";
Debug.ShouldStop(2097152);
__ref.getField(false,"_btnspeichern" /*RemoteObject*/ ).runMethod(false,"setTypeface",screenmain.__c.getField(false,"Typeface").getField(false,"DEFAULT_BOLD"));
 BA.debugLineNum = 279;BA.debugLine="btnSpeichern.TextColor = 0xFF16AA16";
Debug.ShouldStop(4194304);
__ref.getField(false,"_btnspeichern" /*RemoteObject*/ ).runMethod(true,"setTextColor",BA.numberCast(int.class, ((int)0xff16aa16)));
 BA.debugLineNum = 280;BA.debugLine="vaErgEingabe.AddView(btnSpeichern, (100%x - 150di";
Debug.ShouldStop(8388608);
__ref.getField(false,"_vaergeingabe" /*RemoteObject*/ ).runVoidMethod ("AddView",(Object)((__ref.getField(false,"_btnspeichern" /*RemoteObject*/ ).getObject())),(Object)(BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {(RemoteObject.solve(new RemoteObject[] {screenmain.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 100)),__ref.getField(false, "ba")),screenmain.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 150)))}, "-",1, 1)),RemoteObject.createImmutable(2)}, "/",0, 0))),(Object)(screenmain.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 104)))),(Object)(screenmain.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 150)))),(Object)(screenmain.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 44)))));
 BA.debugLineNum = 283;BA.debugLine="vaFDJ.Initialize(\"\")";
Debug.ShouldStop(67108864);
__ref.getField(false,"_vafdj" /*RemoteObject*/ ).runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 284;BA.debugLine="vaFDJ.Color = 0xFFEEFFEE";
Debug.ShouldStop(134217728);
__ref.getField(false,"_vafdj" /*RemoteObject*/ ).runVoidMethod ("setColor",BA.numberCast(int.class, ((int)0xffeeffee)));
 BA.debugLineNum = 285;BA.debugLine="vaFDJ.Visible = False";
Debug.ShouldStop(268435456);
__ref.getField(false,"_vafdj" /*RemoteObject*/ ).runMethod(true,"setVisible",screenmain.__c.getField(true,"False"));
 BA.debugLineNum = 286;BA.debugLine="vaEingabe.AddView(vaFDJ, 0, 186dip, 100%x, 154dip";
Debug.ShouldStop(536870912);
__ref.getField(false,"_vaeingabe" /*RemoteObject*/ ).runVoidMethod ("AddView",(Object)((__ref.getField(false,"_vafdj" /*RemoteObject*/ ).getObject())),(Object)(BA.numberCast(int.class, 0)),(Object)(screenmain.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 186)))),(Object)(screenmain.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 100)),__ref.getField(false, "ba"))),(Object)(screenmain.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 154)))));
 BA.debugLineNum = 288;BA.debugLine="Dim Label18 As Label";
Debug.ShouldStop(-2147483648);
_label18 = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");Debug.locals.put("Label18", _label18);
 BA.debugLineNum = 289;BA.debugLine="Label18.Initialize(\"\")";
Debug.ShouldStop(1);
_label18.runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 290;BA.debugLine="Label18.Text = \"Fisch des Jahres\"";
Debug.ShouldStop(2);
_label18.runMethod(true,"setText",BA.ObjectToCharSequence("Fisch des Jahres"));
 BA.debugLineNum = 291;BA.debugLine="Label18.TextSize = 16";
Debug.ShouldStop(4);
_label18.runMethod(true,"setTextSize",BA.numberCast(float.class, 16));
 BA.debugLineNum = 292;BA.debugLine="Label18.Typeface = Typeface.DEFAULT_BOLD";
Debug.ShouldStop(8);
_label18.runMethod(false,"setTypeface",screenmain.__c.getField(false,"Typeface").getField(false,"DEFAULT_BOLD"));
 BA.debugLineNum = 293;BA.debugLine="Label18.TextColor = Colors.Black";
Debug.ShouldStop(16);
_label18.runMethod(true,"setTextColor",screenmain.__c.getField(false,"Colors").getField(true,"Black"));
 BA.debugLineNum = 294;BA.debugLine="Label18.Gravity = Gravity.CENTER";
Debug.ShouldStop(32);
_label18.runMethod(true,"setGravity",screenmain.__c.getField(false,"Gravity").getField(true,"CENTER"));
 BA.debugLineNum = 295;BA.debugLine="vaFDJ.AddView(Label18, 40dip, 4dip, 100%x - 80dip";
Debug.ShouldStop(64);
__ref.getField(false,"_vafdj" /*RemoteObject*/ ).runVoidMethod ("AddView",(Object)((_label18.getObject())),(Object)(screenmain.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 40)))),(Object)(screenmain.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 4)))),(Object)(RemoteObject.solve(new RemoteObject[] {screenmain.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 100)),__ref.getField(false, "ba")),screenmain.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 80)))}, "-",1, 1)),(Object)(screenmain.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 30)))));
 BA.debugLineNum = 297;BA.debugLine="btnFDJback.Initialize(\"btnFDJback\")";
Debug.ShouldStop(256);
__ref.getField(false,"_btnfdjback" /*RemoteObject*/ ).runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("btnFDJback")));
 BA.debugLineNum = 298;BA.debugLine="SetButtonImageSafe(btnFDJback, \"Left.48.png\", \"◀\"";
Debug.ShouldStop(512);
__ref.runClassMethod (b4a.example.screenmain.class, "_setbuttonimagesafe" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_btnfdjback" /*RemoteObject*/ )),(Object)(BA.ObjectToString("Left.48.png")),(Object)(RemoteObject.createImmutable("◀")));
 BA.debugLineNum = 299;BA.debugLine="vaFDJ.AddView(btnFDJback, 100%x - 38dip, 4dip, 30";
Debug.ShouldStop(1024);
__ref.getField(false,"_vafdj" /*RemoteObject*/ ).runVoidMethod ("AddView",(Object)((__ref.getField(false,"_btnfdjback" /*RemoteObject*/ ).getObject())),(Object)(RemoteObject.solve(new RemoteObject[] {screenmain.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 100)),__ref.getField(false, "ba")),screenmain.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 38)))}, "-",1, 1)),(Object)(screenmain.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 4)))),(Object)(screenmain.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 30)))),(Object)(screenmain.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 30)))));
 BA.debugLineNum = 301;BA.debugLine="Dim Label16 As Label";
Debug.ShouldStop(4096);
_label16 = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");Debug.locals.put("Label16", _label16);
 BA.debugLineNum = 302;BA.debugLine="Label16.Initialize(\"\")";
Debug.ShouldStop(8192);
_label16.runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 303;BA.debugLine="Label16.Text = \"  Fang:  \"";
Debug.ShouldStop(16384);
_label16.runMethod(true,"setText",BA.ObjectToCharSequence("  Fang:  "));
 BA.debugLineNum = 304;BA.debugLine="Label16.TextSize = 16";
Debug.ShouldStop(32768);
_label16.runMethod(true,"setTextSize",BA.numberCast(float.class, 16));
 BA.debugLineNum = 305;BA.debugLine="Label16.Typeface = Typeface.DEFAULT_BOLD";
Debug.ShouldStop(65536);
_label16.runMethod(false,"setTypeface",screenmain.__c.getField(false,"Typeface").getField(false,"DEFAULT_BOLD"));
 BA.debugLineNum = 306;BA.debugLine="Label16.TextColor = Colors.Black";
Debug.ShouldStop(131072);
_label16.runMethod(true,"setTextColor",screenmain.__c.getField(false,"Colors").getField(true,"Black"));
 BA.debugLineNum = 307;BA.debugLine="Label16.Gravity = Gravity.RIGHT + Gravity.CENTER_";
Debug.ShouldStop(262144);
_label16.runMethod(true,"setGravity",RemoteObject.solve(new RemoteObject[] {screenmain.__c.getField(false,"Gravity").getField(true,"RIGHT"),screenmain.__c.getField(false,"Gravity").getField(true,"CENTER_VERTICAL")}, "+",1, 1));
 BA.debugLineNum = 308;BA.debugLine="vaFDJ.AddView(Label16, 10dip, 44dip, (100%x - 150";
Debug.ShouldStop(524288);
__ref.getField(false,"_vafdj" /*RemoteObject*/ ).runVoidMethod ("AddView",(Object)((_label16.getObject())),(Object)(screenmain.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 10)))),(Object)(screenmain.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 44)))),(Object)(BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {(RemoteObject.solve(new RemoteObject[] {screenmain.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 100)),__ref.getField(false, "ba")),screenmain.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 150)))}, "-",1, 1)),RemoteObject.createImmutable(2),screenmain.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 10)))}, "/-",1, 0))),(Object)(screenmain.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 52)))));
 BA.debugLineNum = 310;BA.debugLine="tbxFDJgewicht.Initialize(\"tbxFDJgewicht\")";
Debug.ShouldStop(2097152);
__ref.getField(false,"_tbxfdjgewicht" /*RemoteObject*/ ).runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("tbxFDJgewicht")));
 BA.debugLineNum = 311;BA.debugLine="tbxFDJgewicht.TextSize = 30";
Debug.ShouldStop(4194304);
__ref.getField(false,"_tbxfdjgewicht" /*RemoteObject*/ ).runMethod(true,"setTextSize",BA.numberCast(float.class, 30));
 BA.debugLineNum = 312;BA.debugLine="tbxFDJgewicht.Typeface = Typeface.DEFAULT_BOLD";
Debug.ShouldStop(8388608);
__ref.getField(false,"_tbxfdjgewicht" /*RemoteObject*/ ).runMethod(false,"setTypeface",screenmain.__c.getField(false,"Typeface").getField(false,"DEFAULT_BOLD"));
 BA.debugLineNum = 313;BA.debugLine="tbxFDJgewicht.TextColor = 0xFF16AA16";
Debug.ShouldStop(16777216);
__ref.getField(false,"_tbxfdjgewicht" /*RemoteObject*/ ).runMethod(true,"setTextColor",BA.numberCast(int.class, ((int)0xff16aa16)));
 BA.debugLineNum = 314;BA.debugLine="tbxFDJgewicht.Gravity = Gravity.CENTER";
Debug.ShouldStop(33554432);
__ref.getField(false,"_tbxfdjgewicht" /*RemoteObject*/ ).runMethod(true,"setGravity",screenmain.__c.getField(false,"Gravity").getField(true,"CENTER"));
 BA.debugLineNum = 315;BA.debugLine="tbxFDJgewicht.InputType = tbxFDJgewicht.INPUT_TYP";
Debug.ShouldStop(67108864);
__ref.getField(false,"_tbxfdjgewicht" /*RemoteObject*/ ).runMethod(true,"setInputType",__ref.getField(false,"_tbxfdjgewicht" /*RemoteObject*/ ).getField(true,"INPUT_TYPE_NUMBERS"));
 BA.debugLineNum = 316;BA.debugLine="tbxFDJgewicht.SingleLine = True";
Debug.ShouldStop(134217728);
__ref.getField(false,"_tbxfdjgewicht" /*RemoteObject*/ ).runVoidMethod ("setSingleLine",screenmain.__c.getField(true,"True"));
 BA.debugLineNum = 317;BA.debugLine="vaFDJ.AddView(tbxFDJgewicht, (100%x - 150dip) / 2";
Debug.ShouldStop(268435456);
__ref.getField(false,"_vafdj" /*RemoteObject*/ ).runVoidMethod ("AddView",(Object)((__ref.getField(false,"_tbxfdjgewicht" /*RemoteObject*/ ).getObject())),(Object)(BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {(RemoteObject.solve(new RemoteObject[] {screenmain.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 100)),__ref.getField(false, "ba")),screenmain.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 150)))}, "-",1, 1)),RemoteObject.createImmutable(2)}, "/",0, 0))),(Object)(screenmain.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 44)))),(Object)(screenmain.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 150)))),(Object)(screenmain.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 52)))));
 BA.debugLineNum = 319;BA.debugLine="Dim Label17 As Label";
Debug.ShouldStop(1073741824);
_label17 = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");Debug.locals.put("Label17", _label17);
 BA.debugLineNum = 320;BA.debugLine="Label17.Initialize(\"\")";
Debug.ShouldStop(-2147483648);
_label17.runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 321;BA.debugLine="Label17.Text = \" Gramm\"";
Debug.ShouldStop(1);
_label17.runMethod(true,"setText",BA.ObjectToCharSequence(" Gramm"));
 BA.debugLineNum = 322;BA.debugLine="Label17.TextSize = 16";
Debug.ShouldStop(2);
_label17.runMethod(true,"setTextSize",BA.numberCast(float.class, 16));
 BA.debugLineNum = 323;BA.debugLine="Label17.Typeface = Typeface.DEFAULT_BOLD";
Debug.ShouldStop(4);
_label17.runMethod(false,"setTypeface",screenmain.__c.getField(false,"Typeface").getField(false,"DEFAULT_BOLD"));
 BA.debugLineNum = 324;BA.debugLine="Label17.TextColor = Colors.Black";
Debug.ShouldStop(8);
_label17.runMethod(true,"setTextColor",screenmain.__c.getField(false,"Colors").getField(true,"Black"));
 BA.debugLineNum = 325;BA.debugLine="Label17.Gravity = Gravity.LEFT + Gravity.CENTER_V";
Debug.ShouldStop(16);
_label17.runMethod(true,"setGravity",RemoteObject.solve(new RemoteObject[] {screenmain.__c.getField(false,"Gravity").getField(true,"LEFT"),screenmain.__c.getField(false,"Gravity").getField(true,"CENTER_VERTICAL")}, "+",1, 1));
 BA.debugLineNum = 326;BA.debugLine="vaFDJ.AddView(Label17, (100%x + 150dip) / 2, 44di";
Debug.ShouldStop(32);
__ref.getField(false,"_vafdj" /*RemoteObject*/ ).runVoidMethod ("AddView",(Object)((_label17.getObject())),(Object)(BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {(RemoteObject.solve(new RemoteObject[] {screenmain.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 100)),__ref.getField(false, "ba")),screenmain.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 150)))}, "+",1, 1)),RemoteObject.createImmutable(2)}, "/",0, 0))),(Object)(screenmain.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 44)))),(Object)(BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {(RemoteObject.solve(new RemoteObject[] {screenmain.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 100)),__ref.getField(false, "ba")),screenmain.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 150)))}, "-",1, 1)),RemoteObject.createImmutable(2),screenmain.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 10)))}, "/-",1, 0))),(Object)(screenmain.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 52)))));
 BA.debugLineNum = 328;BA.debugLine="btnFDJsave.Initialize(\"btnFDJsave\")";
Debug.ShouldStop(128);
__ref.getField(false,"_btnfdjsave" /*RemoteObject*/ ).runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("btnFDJsave")));
 BA.debugLineNum = 329;BA.debugLine="btnFDJsave.Text = \"speichern\"";
Debug.ShouldStop(256);
__ref.getField(false,"_btnfdjsave" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToCharSequence("speichern"));
 BA.debugLineNum = 330;BA.debugLine="btnFDJsave.TextSize = 16";
Debug.ShouldStop(512);
__ref.getField(false,"_btnfdjsave" /*RemoteObject*/ ).runMethod(true,"setTextSize",BA.numberCast(float.class, 16));
 BA.debugLineNum = 331;BA.debugLine="btnFDJsave.Typeface = Typeface.DEFAULT_BOLD";
Debug.ShouldStop(1024);
__ref.getField(false,"_btnfdjsave" /*RemoteObject*/ ).runMethod(false,"setTypeface",screenmain.__c.getField(false,"Typeface").getField(false,"DEFAULT_BOLD"));
 BA.debugLineNum = 332;BA.debugLine="btnFDJsave.TextColor = 0xFF16AA16";
Debug.ShouldStop(2048);
__ref.getField(false,"_btnfdjsave" /*RemoteObject*/ ).runMethod(true,"setTextColor",BA.numberCast(int.class, ((int)0xff16aa16)));
 BA.debugLineNum = 333;BA.debugLine="vaFDJ.AddView(btnFDJsave, (100%x - 150dip) / 2, 1";
Debug.ShouldStop(4096);
__ref.getField(false,"_vafdj" /*RemoteObject*/ ).runVoidMethod ("AddView",(Object)((__ref.getField(false,"_btnfdjsave" /*RemoteObject*/ ).getObject())),(Object)(BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {(RemoteObject.solve(new RemoteObject[] {screenmain.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 100)),__ref.getField(false, "ba")),screenmain.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 150)))}, "-",1, 1)),RemoteObject.createImmutable(2)}, "/",0, 0))),(Object)(screenmain.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 104)))),(Object)(screenmain.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 150)))),(Object)(screenmain.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 44)))));
 BA.debugLineNum = 336;BA.debugLine="haDown.Initialize(\"\")";
Debug.ShouldStop(32768);
__ref.getField(false,"_hadown" /*RemoteObject*/ ).runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 337;BA.debugLine="haDown.Color = 0xFFEEFFEE";
Debug.ShouldStop(65536);
__ref.getField(false,"_hadown" /*RemoteObject*/ ).runVoidMethod ("setColor",BA.numberCast(int.class, ((int)0xffeeffee)));
 BA.debugLineNum = 338;BA.debugLine="haDown.Visible = False";
Debug.ShouldStop(131072);
__ref.getField(false,"_hadown" /*RemoteObject*/ ).runMethod(true,"setVisible",screenmain.__c.getField(true,"False"));
 BA.debugLineNum = 339;BA.debugLine="Root.AddView(haDown, 0, 80dip, 100%x, 42dip)";
Debug.ShouldStop(262144);
__ref.getField(false,"_root" /*RemoteObject*/ ).runVoidMethod ("AddView",(Object)((__ref.getField(false,"_hadown" /*RemoteObject*/ ).getObject())),(Object)(BA.numberCast(int.class, 0)),(Object)(screenmain.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 80)))),(Object)(screenmain.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 100)),__ref.getField(false, "ba"))),(Object)(screenmain.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 42)))));
 BA.debugLineNum = 341;BA.debugLine="btnShare.Initialize(\"btnShare\")";
Debug.ShouldStop(1048576);
__ref.getField(false,"_btnshare" /*RemoteObject*/ ).runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("btnShare")));
 BA.debugLineNum = 342;BA.debugLine="SetButtonImageSafe(btnShare, \"share.png\", \"📤\")";
Debug.ShouldStop(2097152);
__ref.runClassMethod (b4a.example.screenmain.class, "_setbuttonimagesafe" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_btnshare" /*RemoteObject*/ )),(Object)(BA.ObjectToString("share.png")),(Object)(RemoteObject.createImmutable("📤")));
 BA.debugLineNum = 343;BA.debugLine="haDown.AddView(btnShare, 8dip, 7dip, 28dip, 28dip";
Debug.ShouldStop(4194304);
__ref.getField(false,"_hadown" /*RemoteObject*/ ).runVoidMethod ("AddView",(Object)((__ref.getField(false,"_btnshare" /*RemoteObject*/ ).getObject())),(Object)(screenmain.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 8)))),(Object)(screenmain.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 7)))),(Object)(screenmain.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 28)))),(Object)(screenmain.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 28)))));
 BA.debugLineNum = 345;BA.debugLine="Dim Label15 As Label";
Debug.ShouldStop(16777216);
_label15 = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");Debug.locals.put("Label15", _label15);
 BA.debugLineNum = 346;BA.debugLine="Label15.Initialize(\"\")";
Debug.ShouldStop(33554432);
_label15.runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 347;BA.debugLine="Label15.Text = \"Ergebnisliste\"";
Debug.ShouldStop(67108864);
_label15.runMethod(true,"setText",BA.ObjectToCharSequence("Ergebnisliste"));
 BA.debugLineNum = 348;BA.debugLine="Label15.TextSize = 16";
Debug.ShouldStop(134217728);
_label15.runMethod(true,"setTextSize",BA.numberCast(float.class, 16));
 BA.debugLineNum = 349;BA.debugLine="Label15.Typeface = Typeface.DEFAULT_BOLD";
Debug.ShouldStop(268435456);
_label15.runMethod(false,"setTypeface",screenmain.__c.getField(false,"Typeface").getField(false,"DEFAULT_BOLD"));
 BA.debugLineNum = 350;BA.debugLine="Label15.TextColor = Colors.Black";
Debug.ShouldStop(536870912);
_label15.runMethod(true,"setTextColor",screenmain.__c.getField(false,"Colors").getField(true,"Black"));
 BA.debugLineNum = 351;BA.debugLine="Label15.Gravity = Gravity.CENTER";
Debug.ShouldStop(1073741824);
_label15.runMethod(true,"setGravity",screenmain.__c.getField(false,"Gravity").getField(true,"CENTER"));
 BA.debugLineNum = 352;BA.debugLine="haDown.AddView(Label15, 45dip, 5dip, 100%x - 90di";
Debug.ShouldStop(-2147483648);
__ref.getField(false,"_hadown" /*RemoteObject*/ ).runVoidMethod ("AddView",(Object)((_label15.getObject())),(Object)(screenmain.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 45)))),(Object)(screenmain.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 5)))),(Object)(RemoteObject.solve(new RemoteObject[] {screenmain.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 100)),__ref.getField(false, "ba")),screenmain.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 90)))}, "-",1, 1)),(Object)(screenmain.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 32)))));
 BA.debugLineNum = 354;BA.debugLine="btnDown.Initialize(\"btnDown\")";
Debug.ShouldStop(2);
__ref.getField(false,"_btndown" /*RemoteObject*/ ).runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("btnDown")));
 BA.debugLineNum = 355;BA.debugLine="SetButtonImageSafe(btnDown, \"down.png\", \"▼\")";
Debug.ShouldStop(4);
__ref.runClassMethod (b4a.example.screenmain.class, "_setbuttonimagesafe" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_btndown" /*RemoteObject*/ )),(Object)(BA.ObjectToString("down.png")),(Object)(RemoteObject.createImmutable("▼")));
 BA.debugLineNum = 356;BA.debugLine="haDown.AddView(btnDown, 100%x - 40dip, 5dip, 32di";
Debug.ShouldStop(8);
__ref.getField(false,"_hadown" /*RemoteObject*/ ).runVoidMethod ("AddView",(Object)((__ref.getField(false,"_btndown" /*RemoteObject*/ ).getObject())),(Object)(RemoteObject.solve(new RemoteObject[] {screenmain.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 100)),__ref.getField(false, "ba")),screenmain.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 40)))}, "-",1, 1)),(Object)(screenmain.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 5)))),(Object)(screenmain.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 32)))),(Object)(screenmain.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 32)))));
 BA.debugLineNum = 359;BA.debugLine="webErgebnis.Initialize(\"webErgebnis\")";
Debug.ShouldStop(64);
__ref.getField(false,"_webergebnis" /*RemoteObject*/ ).runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("webErgebnis")));
 BA.debugLineNum = 360;BA.debugLine="webErgebnis.JavaScriptEnabled = True";
Debug.ShouldStop(128);
__ref.getField(false,"_webergebnis" /*RemoteObject*/ ).runMethod(true,"setJavaScriptEnabled",screenmain.__c.getField(true,"True"));
 BA.debugLineNum = 361;BA.debugLine="SetupWebViewBridge";
Debug.ShouldStop(256);
__ref.runClassMethod (b4a.example.screenmain.class, "_setupwebviewbridge" /*RemoteObject*/ );
 BA.debugLineNum = 362;BA.debugLine="Root.AddView(webErgebnis, 0, 425dip, 100%x, 100%y";
Debug.ShouldStop(512);
__ref.getField(false,"_root" /*RemoteObject*/ ).runVoidMethod ("AddView",(Object)((__ref.getField(false,"_webergebnis" /*RemoteObject*/ ).getObject())),(Object)(BA.numberCast(int.class, 0)),(Object)(screenmain.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 425)))),(Object)(screenmain.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 100)),__ref.getField(false, "ba"))),(Object)(RemoteObject.solve(new RemoteObject[] {screenmain.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 100)),__ref.getField(false, "ba")),screenmain.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 425)))}, "-",1, 1)));
 BA.debugLineNum = 365;BA.debugLine="lsvName.Initialize(\"lsvName\")";
Debug.ShouldStop(4096);
__ref.getField(false,"_lsvname" /*RemoteObject*/ ).runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("lsvName")));
 BA.debugLineNum = 366;BA.debugLine="lsvName.Color = 0xFFEFEFEF";
Debug.ShouldStop(8192);
__ref.getField(false,"_lsvname" /*RemoteObject*/ ).runVoidMethod ("setColor",BA.numberCast(int.class, ((int)0xffefefef)));
 BA.debugLineNum = 367;BA.debugLine="lsvName.SingleLineLayout.Label.TextColor = 0xFF33";
Debug.ShouldStop(16384);
__ref.getField(false,"_lsvname" /*RemoteObject*/ ).runMethod(false,"getSingleLineLayout").getField(false,"Label").runMethod(true,"setTextColor",BA.numberCast(int.class, ((int)0xff3333ff)));
 BA.debugLineNum = 368;BA.debugLine="lsvName.SingleLineLayout.Label.TextSize = 16";
Debug.ShouldStop(32768);
__ref.getField(false,"_lsvname" /*RemoteObject*/ ).runMethod(false,"getSingleLineLayout").getField(false,"Label").runMethod(true,"setTextSize",BA.numberCast(float.class, 16));
 BA.debugLineNum = 369;BA.debugLine="lsvName.Visible = False";
Debug.ShouldStop(65536);
__ref.getField(false,"_lsvname" /*RemoteObject*/ ).runMethod(true,"setVisible",screenmain.__c.getField(true,"False"));
 BA.debugLineNum = 370;BA.debugLine="Root.AddView(lsvName, 10%x, 262dip, 80%x, 150dip)";
Debug.ShouldStop(131072);
__ref.getField(false,"_root" /*RemoteObject*/ ).runVoidMethod ("AddView",(Object)((__ref.getField(false,"_lsvname" /*RemoteObject*/ ).getObject())),(Object)(screenmain.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 10)),__ref.getField(false, "ba"))),(Object)(screenmain.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 262)))),(Object)(screenmain.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 80)),__ref.getField(false, "ba"))),(Object)(screenmain.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 150)))));
 BA.debugLineNum = 371;BA.debugLine="End Sub";
Debug.ShouldStop(262144);
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
		Debug.PushSubsStack("changeURL (screenmain) ","screenmain",2,__ref.getField(false, "ba"),__ref,497);
if (RapidSub.canDelegate("changeurl")) { return __ref.runUserSub(false, "screenmain","changeurl", __ref);}
RemoteObject _vid = RemoteObject.createImmutable("");
 BA.debugLineNum = 497;BA.debugLine="Private Sub changeURL";
Debug.ShouldStop(65536);
 BA.debugLineNum = 498;BA.debugLine="Dim vID As String = DBGet(\"VereinsID\", \"[...]\")";
Debug.ShouldStop(131072);
_vid = BA.ObjectToString(__ref.runClassMethod (b4a.example.screenmain.class, "_dbget" /*RemoteObject*/ ,(Object)(BA.ObjectToString("VereinsID")),(Object)((RemoteObject.createImmutable("[...]")))));Debug.locals.put("vid", _vid);Debug.locals.put("vID", _vid);
 BA.debugLineNum = 499;BA.debugLine="URLErgebnisse = URLErgebnisse.Replace(\"[...]\", vI";
Debug.ShouldStop(262144);
__ref.setField ("_urlergebnisse" /*RemoteObject*/ ,__ref.getField(true,"_urlergebnisse" /*RemoteObject*/ ).runMethod(true,"replace",(Object)(BA.ObjectToString("[...]")),(Object)(_vid)));
 BA.debugLineNum = 500;BA.debugLine="URLveranstaltungen = URLveranstaltungen.Replace(\"";
Debug.ShouldStop(524288);
__ref.setField ("_urlveranstaltungen" /*RemoteObject*/ ,__ref.getField(true,"_urlveranstaltungen" /*RemoteObject*/ ).runMethod(true,"replace",(Object)(BA.ObjectToString("[...]")),(Object)(_vid)));
 BA.debugLineNum = 501;BA.debugLine="URLteilnehmer = URLteilnehmer.Replace(\"[...]\", vI";
Debug.ShouldStop(1048576);
__ref.setField ("_urlteilnehmer" /*RemoteObject*/ ,__ref.getField(true,"_urlteilnehmer" /*RemoteObject*/ ).runMethod(true,"replace",(Object)(BA.ObjectToString("[...]")),(Object)(_vid)));
 BA.debugLineNum = 502;BA.debugLine="URLlastChange = URLlastChange.Replace(\"[...]\", vI";
Debug.ShouldStop(2097152);
__ref.setField ("_urllastchange" /*RemoteObject*/ ,__ref.getField(true,"_urllastchange" /*RemoteObject*/ ).runMethod(true,"replace",(Object)(BA.ObjectToString("[...]")),(Object)(_vid)));
 BA.debugLineNum = 503;BA.debugLine="URLfdj = URLfdj.Replace(\"[...]\", vID)";
Debug.ShouldStop(4194304);
__ref.setField ("_urlfdj" /*RemoteObject*/ ,__ref.getField(true,"_urlfdj" /*RemoteObject*/ ).runMethod(true,"replace",(Object)(BA.ObjectToString("[...]")),(Object)(_vid)));
 BA.debugLineNum = 504;BA.debugLine="End Sub";
Debug.ShouldStop(8388608);
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
screenmain._root = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");__ref.setField("_root",screenmain._root);
 //BA.debugLineNum = 6;BA.debugLine="Private xui As XUI";
screenmain._xui = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper.XUI");__ref.setField("_xui",screenmain._xui);
 //BA.debugLineNum = 9;BA.debugLine="Public DBdatenTyp As String = \"\"";
screenmain._dbdatentyp = BA.ObjectToString("");__ref.setField("_dbdatentyp",screenmain._dbdatentyp);
 //BA.debugLineNum = 10;BA.debugLine="Public URLtest As String = \"https://console.fireb";
screenmain._urltest = BA.ObjectToString("https://console.firebase.google.com");__ref.setField("_urltest",screenmain._urltest);
 //BA.debugLineNum = 11;BA.debugLine="Public Teilnehmer As List";
screenmain._teilnehmer = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");__ref.setField("_teilnehmer",screenmain._teilnehmer);
 //BA.debugLineNum = 12;BA.debugLine="Public URLveranstaltungen As String = \"https://we";
screenmain._urlveranstaltungen = BA.ObjectToString("https://wertungslisten-app-default-rtdb.europe-west1.firebasedatabase.app/Vereine/[...]/Veranstaltungen/");__ref.setField("_urlveranstaltungen",screenmain._urlveranstaltungen);
 //BA.debugLineNum = 13;BA.debugLine="Public TLNlastID As String = \"t0\"";
screenmain._tlnlastid = BA.ObjectToString("t0");__ref.setField("_tlnlastid",screenmain._tlnlastid);
 //BA.debugLineNum = 14;BA.debugLine="Public URLteilnehmer As String = \"https://wertung";
screenmain._urlteilnehmer = BA.ObjectToString("https://wertungslisten-app-default-rtdb.europe-west1.firebasedatabase.app/Vereine/[...]/Teilnehmer");__ref.setField("_urlteilnehmer",screenmain._urlteilnehmer);
 //BA.debugLineNum = 15;BA.debugLine="Public webviewData As List";
screenmain._webviewdata = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");__ref.setField("_webviewdata",screenmain._webviewdata);
 //BA.debugLineNum = 16;BA.debugLine="Public URLErgebnisse As String = \"https://wertung";
screenmain._urlergebnisse = BA.ObjectToString("https://wertungslisten-app-default-rtdb.europe-west1.firebasedatabase.app/Vereine/[...]/Ergebnisse/");__ref.setField("_urlergebnisse",screenmain._urlergebnisse);
 //BA.debugLineNum = 17;BA.debugLine="Public PlatzSelected As Int = 1";
screenmain._platzselected = BA.numberCast(int.class, 1);__ref.setField("_platzselected",screenmain._platzselected);
 //BA.debugLineNum = 18;BA.debugLine="Public URLfdj As String = \"https://wertungslisten";
screenmain._urlfdj = BA.ObjectToString("https://wertungslisten-app-default-rtdb.europe-west1.firebasedatabase.app/Vereine/[...]/Ergebnisse/fdj[xxxx]");__ref.setField("_urlfdj",screenmain._urlfdj);
 //BA.debugLineNum = 19;BA.debugLine="Public SelectNewRow As Int = 0";
screenmain._selectnewrow = BA.numberCast(int.class, 0);__ref.setField("_selectnewrow",screenmain._selectnewrow);
 //BA.debugLineNum = 20;BA.debugLine="Public URLlastChange As String = \"https://wertung";
screenmain._urllastchange = BA.ObjectToString("https://wertungslisten-app-default-rtdb.europe-west1.firebasedatabase.app/Vereine/[...]/LastChange");__ref.setField("_urllastchange",screenmain._urllastchange);
 //BA.debugLineNum = 21;BA.debugLine="Public dochange As Boolean = True";
screenmain._dochange = screenmain.__c.getField(true,"True");__ref.setField("_dochange",screenmain._dochange);
 //BA.debugLineNum = 22;BA.debugLine="Public addTLN As Boolean = False";
screenmain._addtln = screenmain.__c.getField(true,"False");__ref.setField("_addtln",screenmain._addtln);
 //BA.debugLineNum = 23;BA.debugLine="Public VSTNGgeschlossen As Boolean = False";
screenmain._vstnggeschlossen = screenmain.__c.getField(true,"False");__ref.setField("_vstnggeschlossen",screenmain._vstnggeschlossen);
 //BA.debugLineNum = 24;BA.debugLine="Public Status As Map";
screenmain._status = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");__ref.setField("_status",screenmain._status);
 //BA.debugLineNum = 25;BA.debugLine="Public colorgreen As Int = 0xFF16AA16";
screenmain._colorgreen = BA.numberCast(int.class, ((int)0xff16aa16));__ref.setField("_colorgreen",screenmain._colorgreen);
 //BA.debugLineNum = 28;BA.debugLine="Private lblVerein As Label";
screenmain._lblverein = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");__ref.setField("_lblverein",screenmain._lblverein);
 //BA.debugLineNum = 29;BA.debugLine="Private lblVeranstaltung As Label";
screenmain._lblveranstaltung = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");__ref.setField("_lblveranstaltung",screenmain._lblveranstaltung);
 //BA.debugLineNum = 30;BA.debugLine="Private lblDatum As Label";
screenmain._lbldatum = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");__ref.setField("_lbldatum",screenmain._lbldatum);
 //BA.debugLineNum = 31;BA.debugLine="Private btnSettings As Button";
screenmain._btnsettings = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");__ref.setField("_btnsettings",screenmain._btnsettings);
 //BA.debugLineNum = 33;BA.debugLine="Private vaEingabe As Panel";
screenmain._vaeingabe = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");__ref.setField("_vaeingabe",screenmain._vaeingabe);
 //BA.debugLineNum = 34;BA.debugLine="Private btnCloseVstng As Button";
screenmain._btnclosevstng = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");__ref.setField("_btnclosevstng",screenmain._btnclosevstng);
 //BA.debugLineNum = 35;BA.debugLine="Private btnUp As Button";
screenmain._btnup = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");__ref.setField("_btnup",screenmain._btnup);
 //BA.debugLineNum = 36;BA.debugLine="Private btnMinus As Button";
screenmain._btnminus = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");__ref.setField("_btnminus",screenmain._btnminus);
 //BA.debugLineNum = 37;BA.debugLine="Private spnPlatz As Spinner";
screenmain._spnplatz = RemoteObject.createNew ("anywheresoftware.b4a.objects.SpinnerWrapper");__ref.setField("_spnplatz",screenmain._spnplatz);
 //BA.debugLineNum = 38;BA.debugLine="Private btnPlus As Button";
screenmain._btnplus = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");__ref.setField("_btnplus",screenmain._btnplus);
 //BA.debugLineNum = 39;BA.debugLine="Private tbxTeilnehmer As EditText";
screenmain._tbxteilnehmer = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");__ref.setField("_tbxteilnehmer",screenmain._tbxteilnehmer);
 //BA.debugLineNum = 40;BA.debugLine="Private lsvName As ListView";
screenmain._lsvname = RemoteObject.createNew ("anywheresoftware.b4a.objects.ListViewWrapper");__ref.setField("_lsvname",screenmain._lsvname);
 //BA.debugLineNum = 42;BA.debugLine="Private vaErgEingabe As Panel";
screenmain._vaergeingabe = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");__ref.setField("_vaergeingabe",screenmain._vaergeingabe);
 //BA.debugLineNum = 43;BA.debugLine="Private btnFDJeingabe As Button";
screenmain._btnfdjeingabe = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");__ref.setField("_btnfdjeingabe",screenmain._btnfdjeingabe);
 //BA.debugLineNum = 44;BA.debugLine="Private tbxGramm As EditText";
screenmain._tbxgramm = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");__ref.setField("_tbxgramm",screenmain._tbxgramm);
 //BA.debugLineNum = 45;BA.debugLine="Private btnSpeichern As Button";
screenmain._btnspeichern = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");__ref.setField("_btnspeichern",screenmain._btnspeichern);
 //BA.debugLineNum = 47;BA.debugLine="Private vaFDJ As Panel";
screenmain._vafdj = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");__ref.setField("_vafdj",screenmain._vafdj);
 //BA.debugLineNum = 48;BA.debugLine="Private btnFDJback As Button";
screenmain._btnfdjback = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");__ref.setField("_btnfdjback",screenmain._btnfdjback);
 //BA.debugLineNum = 49;BA.debugLine="Private tbxFDJgewicht As EditText";
screenmain._tbxfdjgewicht = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");__ref.setField("_tbxfdjgewicht",screenmain._tbxfdjgewicht);
 //BA.debugLineNum = 50;BA.debugLine="Private btnFDJsave As Button";
screenmain._btnfdjsave = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");__ref.setField("_btnfdjsave",screenmain._btnfdjsave);
 //BA.debugLineNum = 52;BA.debugLine="Private haDown As Panel";
screenmain._hadown = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");__ref.setField("_hadown",screenmain._hadown);
 //BA.debugLineNum = 53;BA.debugLine="Private btnShare As Button";
screenmain._btnshare = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");__ref.setField("_btnshare",screenmain._btnshare);
 //BA.debugLineNum = 54;BA.debugLine="Private btnDown As Button";
screenmain._btndown = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");__ref.setField("_btndown",screenmain._btndown);
 //BA.debugLineNum = 56;BA.debugLine="Private webErgebnis As WebView";
screenmain._webergebnis = RemoteObject.createNew ("anywheresoftware.b4a.objects.WebViewWrapper");__ref.setField("_webergebnis",screenmain._webergebnis);
 //BA.debugLineNum = 59;BA.debugLine="Private Uhrzeit As Timer";
screenmain._uhrzeit = RemoteObject.createNew ("anywheresoftware.b4a.objects.Timer");__ref.setField("_uhrzeit",screenmain._uhrzeit);
 //BA.debugLineNum = 60;BA.debugLine="Private DBVerein As Map";
screenmain._dbverein = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");__ref.setField("_dbverein",screenmain._dbverein);
 //BA.debugLineNum = 61;BA.debugLine="Private DBFileName As String = \"DBVerein.dat\"";
screenmain._dbfilename = BA.ObjectToString("DBVerein.dat");__ref.setField("_dbfilename",screenmain._dbfilename);
 //BA.debugLineNum = 62;BA.debugLine="Private CurrentWebUrl As String = \"\"";
screenmain._currentweburl = BA.ObjectToString("");__ref.setField("_currentweburl",screenmain._currentweburl);
 //BA.debugLineNum = 63;BA.debugLine="Private CurrentWebViewString As String = \"\"";
screenmain._currentwebviewstring = BA.ObjectToString("");__ref.setField("_currentwebviewstring",screenmain._currentwebviewstring);
 //BA.debugLineNum = 64;BA.debugLine="Private spnItems As List";
screenmain._spnitems = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");__ref.setField("_spnitems",screenmain._spnitems);
 //BA.debugLineNum = 65;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _clear(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("clear (screenmain) ","screenmain",2,__ref.getField(false, "ba"),__ref,482);
if (RapidSub.canDelegate("clear")) { return __ref.runUserSub(false, "screenmain","clear", __ref);}
 BA.debugLineNum = 482;BA.debugLine="Private Sub clear";
Debug.ShouldStop(2);
 BA.debugLineNum = 483;BA.debugLine="dochange = False";
Debug.ShouldStop(4);
__ref.setField ("_dochange" /*RemoteObject*/ ,screenmain.__c.getField(true,"False"));
 BA.debugLineNum = 484;BA.debugLine="lsvName.Clear";
Debug.ShouldStop(8);
__ref.getField(false,"_lsvname" /*RemoteObject*/ ).runVoidMethod ("Clear");
 BA.debugLineNum = 485;BA.debugLine="lsvName.Visible = False";
Debug.ShouldStop(16);
__ref.getField(false,"_lsvname" /*RemoteObject*/ ).runMethod(true,"setVisible",screenmain.__c.getField(true,"False"));
 BA.debugLineNum = 486;BA.debugLine="tbxGramm.Text = \"0\"";
Debug.ShouldStop(32);
__ref.getField(false,"_tbxgramm" /*RemoteObject*/ ).runMethodAndSync(true,"setText",BA.ObjectToCharSequence("0"));
 BA.debugLineNum = 487;BA.debugLine="tbxTeilnehmer.Text = \"\"";
Debug.ShouldStop(64);
__ref.getField(false,"_tbxteilnehmer" /*RemoteObject*/ ).runMethodAndSync(true,"setText",BA.ObjectToCharSequence(""));
 BA.debugLineNum = 488;BA.debugLine="dochange = True";
Debug.ShouldStop(128);
__ref.setField ("_dochange" /*RemoteObject*/ ,screenmain.__c.getField(true,"True"));
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
public static RemoteObject  _closevstng(RemoteObject __ref,RemoteObject _table) throws Exception{
try {
		Debug.PushSubsStack("closeVstng (screenmain) ","screenmain",2,__ref.getField(false, "ba"),__ref,752);
if (RapidSub.canDelegate("closevstng")) { return __ref.runUserSub(false, "screenmain","closevstng", __ref, _table);}
RemoteObject _verdatum = RemoteObject.createImmutable("");
RemoteObject _key = null;
RemoteObject _keystr = RemoteObject.createImmutable("");
RemoteObject _body = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _jg = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.JSONParser.JSONGenerator");
Debug.locals.put("table", _table);
 BA.debugLineNum = 752;BA.debugLine="Private Sub closeVstng(table As String)";
Debug.ShouldStop(32768);
 BA.debugLineNum = 753;BA.debugLine="If table = \"Ergebnisse\" Then";
Debug.ShouldStop(65536);
if (RemoteObject.solveBoolean("=",_table,BA.ObjectToString("Ergebnisse"))) { 
 BA.debugLineNum = 754;BA.debugLine="DBdatenTyp = \"ErgClosed\"";
Debug.ShouldStop(131072);
__ref.setField ("_dbdatentyp" /*RemoteObject*/ ,BA.ObjectToString("ErgClosed"));
 BA.debugLineNum = 755;BA.debugLine="Dim verDatum As String = DBGet(\"VeranstaltungDat";
Debug.ShouldStop(262144);
_verdatum = BA.ObjectToString(__ref.runClassMethod (b4a.example.screenmain.class, "_dbget" /*RemoteObject*/ ,(Object)(BA.ObjectToString("VeranstaltungDatum")),(Object)((__ref.runClassMethod (b4a.example.screenmain.class, "_formatdatecustom" /*RemoteObject*/ ,(Object)(screenmain.__c.getField(false,"DateTime").runMethod(true,"getNow")),(Object)(RemoteObject.createImmutable("dd.MM.yyyy")))))));Debug.locals.put("verdatum", _verdatum);Debug.locals.put("verDatum", _verdatum);
 BA.debugLineNum = 756;BA.debugLine="Dim key() As String = Regex.Split(\"\\.\", verDatum";
Debug.ShouldStop(524288);
_key = screenmain.__c.getField(false,"Regex").runMethod(false,"Split",(Object)(BA.ObjectToString("\\.")),(Object)(_verdatum));Debug.locals.put("key", _key);Debug.locals.put("key", _key);
 BA.debugLineNum = 757;BA.debugLine="CurrentWebUrl = URLErgebnisse & \"/e\" & key(2) &";
Debug.ShouldStop(1048576);
__ref.setField ("_currentweburl" /*RemoteObject*/ ,RemoteObject.concat(__ref.getField(true,"_urlergebnisse" /*RemoteObject*/ ),RemoteObject.createImmutable("/e"),_key.getArrayElement(true,BA.numberCast(int.class, 2)),_key.getArrayElement(true,BA.numberCast(int.class, 1)),_key.getArrayElement(true,BA.numberCast(int.class, 0)),RemoteObject.createImmutable(".json?auth="),__ref.getField(false,"_status" /*RemoteObject*/ ).runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("idToken"))),(Object)((RemoteObject.createImmutable(""))))));
 }else {
 BA.debugLineNum = 759;BA.debugLine="DBdatenTyp = \"VSTNGclosed\"";
Debug.ShouldStop(4194304);
__ref.setField ("_dbdatentyp" /*RemoteObject*/ ,BA.ObjectToString("VSTNGclosed"));
 BA.debugLineNum = 760;BA.debugLine="Dim keyStr As String = DBGet(\"VeranstaltungID\",";
Debug.ShouldStop(8388608);
_keystr = BA.ObjectToString(__ref.runClassMethod (b4a.example.screenmain.class, "_dbget" /*RemoteObject*/ ,(Object)(BA.ObjectToString("VeranstaltungID")),(Object)((RemoteObject.createImmutable("v0")))));Debug.locals.put("keystr", _keystr);Debug.locals.put("keyStr", _keystr);
 BA.debugLineNum = 761;BA.debugLine="CurrentWebUrl = URLveranstaltungen & \"/\" & keySt";
Debug.ShouldStop(16777216);
__ref.setField ("_currentweburl" /*RemoteObject*/ ,RemoteObject.concat(__ref.getField(true,"_urlveranstaltungen" /*RemoteObject*/ ),RemoteObject.createImmutable("/"),_keystr,RemoteObject.createImmutable(".json?auth="),__ref.getField(false,"_status" /*RemoteObject*/ ).runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("idToken"))),(Object)((RemoteObject.createImmutable(""))))));
 };
 BA.debugLineNum = 764;BA.debugLine="Dim body As Map = CreateMap(\"Status\": \"geschlosse";
Debug.ShouldStop(134217728);
_body = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_body = screenmain.__c.runMethod(false, "createMap", (Object)(new RemoteObject[] {RemoteObject.createImmutable(("Status")),(RemoteObject.createImmutable("geschlossen"))}));Debug.locals.put("body", _body);Debug.locals.put("body", _body);
 BA.debugLineNum = 765;BA.debugLine="Dim jg As JSONGenerator";
Debug.ShouldStop(268435456);
_jg = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.JSONParser.JSONGenerator");Debug.locals.put("jg", _jg);
 BA.debugLineNum = 766;BA.debugLine="jg.Initialize(body)";
Debug.ShouldStop(536870912);
_jg.runVoidMethod ("Initialize",(Object)(_body));
 BA.debugLineNum = 767;BA.debugLine="PatchTextWeb(jg.ToString)";
Debug.ShouldStop(1073741824);
__ref.runClassMethod (b4a.example.screenmain.class, "_patchtextweb" /*RemoteObject*/ ,(Object)(_jg.runMethod(true,"ToString")));
 BA.debugLineNum = 768;BA.debugLine="End Sub";
Debug.ShouldStop(-2147483648);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _dbget(RemoteObject __ref,RemoteObject _key,RemoteObject _defaultvalue) throws Exception{
try {
		Debug.PushSubsStack("DBGet (screenmain) ","screenmain",2,__ref.getField(false, "ba"),__ref,1283);
if (RapidSub.canDelegate("dbget")) { return __ref.runUserSub(false, "screenmain","dbget", __ref, _key, _defaultvalue);}
RemoteObject _val = RemoteObject.createImmutable("");
RemoteObject _jp = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.JSONParser");
Debug.locals.put("Key", _key);
Debug.locals.put("DefaultValue", _defaultvalue);
 BA.debugLineNum = 1283;BA.debugLine="Private Sub DBGet(Key As String, DefaultValue As O";
Debug.ShouldStop(4);
 BA.debugLineNum = 1284;BA.debugLine="If DBVerein.ContainsKey(Key) = False Then Return";
Debug.ShouldStop(8);
if (RemoteObject.solveBoolean("=",__ref.getField(false,"_dbverein" /*RemoteObject*/ ).runMethod(true,"ContainsKey",(Object)((_key))),screenmain.__c.getField(true,"False"))) { 
if (true) return _defaultvalue;};
 BA.debugLineNum = 1285;BA.debugLine="Dim val As String = DBVerein.Get(Key)";
Debug.ShouldStop(16);
_val = BA.ObjectToString(__ref.getField(false,"_dbverein" /*RemoteObject*/ ).runMethod(false,"Get",(Object)((_key))));Debug.locals.put("val", _val);Debug.locals.put("val", _val);
 BA.debugLineNum = 1286;BA.debugLine="If val.StartsWith(\"JSON_MAP:\") Then";
Debug.ShouldStop(32);
if (_val.runMethod(true,"startsWith",(Object)(RemoteObject.createImmutable("JSON_MAP:"))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 1287;BA.debugLine="Dim jp As JSONParser";
Debug.ShouldStop(64);
_jp = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.JSONParser");Debug.locals.put("jp", _jp);
 BA.debugLineNum = 1288;BA.debugLine="jp.Initialize(val.SubString(9))";
Debug.ShouldStop(128);
_jp.runVoidMethod ("Initialize",(Object)(_val.runMethod(true,"substring",(Object)(BA.numberCast(int.class, 9)))));
 BA.debugLineNum = 1289;BA.debugLine="Return jp.NextObject";
Debug.ShouldStop(256);
if (true) return (_jp.runMethod(false,"NextObject").getObject());
 }else 
{ BA.debugLineNum = 1290;BA.debugLine="Else If val.StartsWith(\"JSON_LIST:\") Then";
Debug.ShouldStop(512);
if (_val.runMethod(true,"startsWith",(Object)(RemoteObject.createImmutable("JSON_LIST:"))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 1291;BA.debugLine="Dim jp As JSONParser";
Debug.ShouldStop(1024);
_jp = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.JSONParser");Debug.locals.put("jp", _jp);
 BA.debugLineNum = 1292;BA.debugLine="jp.Initialize(val.SubString(10))";
Debug.ShouldStop(2048);
_jp.runVoidMethod ("Initialize",(Object)(_val.runMethod(true,"substring",(Object)(BA.numberCast(int.class, 10)))));
 BA.debugLineNum = 1293;BA.debugLine="Return jp.NextArray";
Debug.ShouldStop(4096);
if (true) return (_jp.runMethod(false,"NextArray").getObject());
 }}
;
 BA.debugLineNum = 1295;BA.debugLine="Return val";
Debug.ShouldStop(16384);
if (true) return (_val);
 BA.debugLineNum = 1296;BA.debugLine="End Sub";
Debug.ShouldStop(32768);
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
		Debug.PushSubsStack("DBPut (screenmain) ","screenmain",2,__ref.getField(false, "ba"),__ref,1268);
if (RapidSub.canDelegate("dbput")) { return __ref.runUserSub(false, "screenmain","dbput", __ref, _key, _value);}
RemoteObject _jg = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.JSONParser.JSONGenerator");
Debug.locals.put("Key", _key);
Debug.locals.put("Value", _value);
 BA.debugLineNum = 1268;BA.debugLine="Private Sub DBPut(Key As String, Value As Object)";
Debug.ShouldStop(524288);
 BA.debugLineNum = 1269;BA.debugLine="If Value Is Map Then";
Debug.ShouldStop(1048576);
if (RemoteObject.solveBoolean("i",_value, RemoteObject.createImmutable("java.util.Map"))) { 
 BA.debugLineNum = 1270;BA.debugLine="Dim jg As JSONGenerator";
Debug.ShouldStop(2097152);
_jg = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.JSONParser.JSONGenerator");Debug.locals.put("jg", _jg);
 BA.debugLineNum = 1271;BA.debugLine="jg.Initialize(Value)";
Debug.ShouldStop(4194304);
_jg.runVoidMethod ("Initialize",RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), _value));
 BA.debugLineNum = 1272;BA.debugLine="DBVerein.Put(Key, \"JSON_MAP:\" & jg.ToString)";
Debug.ShouldStop(8388608);
__ref.getField(false,"_dbverein" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)((_key)),(Object)((RemoteObject.concat(RemoteObject.createImmutable("JSON_MAP:"),_jg.runMethod(true,"ToString")))));
 }else 
{ BA.debugLineNum = 1273;BA.debugLine="Else If Value Is List Then";
Debug.ShouldStop(16777216);
if (RemoteObject.solveBoolean("i",_value, RemoteObject.createImmutable("java.util.List"))) { 
 BA.debugLineNum = 1274;BA.debugLine="Dim jg As JSONGenerator";
Debug.ShouldStop(33554432);
_jg = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.JSONParser.JSONGenerator");Debug.locals.put("jg", _jg);
 BA.debugLineNum = 1275;BA.debugLine="jg.Initialize2(Value)";
Debug.ShouldStop(67108864);
_jg.runVoidMethod ("Initialize2",RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.List"), _value));
 BA.debugLineNum = 1276;BA.debugLine="DBVerein.Put(Key, \"JSON_LIST:\" & jg.ToString)";
Debug.ShouldStop(134217728);
__ref.getField(false,"_dbverein" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)((_key)),(Object)((RemoteObject.concat(RemoteObject.createImmutable("JSON_LIST:"),_jg.runMethod(true,"ToString")))));
 }else {
 BA.debugLineNum = 1278;BA.debugLine="DBVerein.Put(Key, Value)";
Debug.ShouldStop(536870912);
__ref.getField(false,"_dbverein" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)((_key)),(Object)(_value));
 }}
;
 BA.debugLineNum = 1280;BA.debugLine="File.WriteMap(File.DirInternal, DBFileName, DBVer";
Debug.ShouldStop(-2147483648);
screenmain.__c.getField(false,"File").runVoidMethod ("WriteMap",(Object)(screenmain.__c.getField(false,"File").runMethod(true,"getDirInternal")),(Object)(__ref.getField(true,"_dbfilename" /*RemoteObject*/ )),(Object)(__ref.getField(false,"_dbverein" /*RemoteObject*/ )));
 BA.debugLineNum = 1281;BA.debugLine="End Sub";
Debug.ShouldStop(1);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _disableeingabe(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("disableEingabe (screenmain) ","screenmain",2,__ref.getField(false, "ba"),__ref,464);
if (RapidSub.canDelegate("disableeingabe")) { return __ref.runUserSub(false, "screenmain","disableeingabe", __ref);}
 BA.debugLineNum = 464;BA.debugLine="Private Sub disableEingabe";
Debug.ShouldStop(32768);
 BA.debugLineNum = 465;BA.debugLine="tbxTeilnehmer.Enabled = False";
Debug.ShouldStop(65536);
__ref.getField(false,"_tbxteilnehmer" /*RemoteObject*/ ).runMethod(true,"setEnabled",screenmain.__c.getField(true,"False"));
 BA.debugLineNum = 466;BA.debugLine="btnFDJeingabe.Enabled = False";
Debug.ShouldStop(131072);
__ref.getField(false,"_btnfdjeingabe" /*RemoteObject*/ ).runMethod(true,"setEnabled",screenmain.__c.getField(true,"False"));
 BA.debugLineNum = 467;BA.debugLine="btnFDJeingabe.TextColor = 0xFF888888";
Debug.ShouldStop(262144);
__ref.getField(false,"_btnfdjeingabe" /*RemoteObject*/ ).runMethod(true,"setTextColor",BA.numberCast(int.class, ((int)0xff888888)));
 BA.debugLineNum = 468;BA.debugLine="btnMinus.Enabled = False";
Debug.ShouldStop(524288);
__ref.getField(false,"_btnminus" /*RemoteObject*/ ).runMethod(true,"setEnabled",screenmain.__c.getField(true,"False"));
 BA.debugLineNum = 469;BA.debugLine="btnMinus.TextColor = 0xFF888888";
Debug.ShouldStop(1048576);
__ref.getField(false,"_btnminus" /*RemoteObject*/ ).runMethod(true,"setTextColor",BA.numberCast(int.class, ((int)0xff888888)));
 BA.debugLineNum = 470;BA.debugLine="btnPlus.Enabled = False";
Debug.ShouldStop(2097152);
__ref.getField(false,"_btnplus" /*RemoteObject*/ ).runMethod(true,"setEnabled",screenmain.__c.getField(true,"False"));
 BA.debugLineNum = 471;BA.debugLine="btnPlus.TextColor = 0xFF888888";
Debug.ShouldStop(4194304);
__ref.getField(false,"_btnplus" /*RemoteObject*/ ).runMethod(true,"setTextColor",BA.numberCast(int.class, ((int)0xff888888)));
 BA.debugLineNum = 472;BA.debugLine="tbxGramm.Enabled = False";
Debug.ShouldStop(8388608);
__ref.getField(false,"_tbxgramm" /*RemoteObject*/ ).runMethod(true,"setEnabled",screenmain.__c.getField(true,"False"));
 BA.debugLineNum = 473;BA.debugLine="btnSpeichern.Enabled = False";
Debug.ShouldStop(16777216);
__ref.getField(false,"_btnspeichern" /*RemoteObject*/ ).runMethod(true,"setEnabled",screenmain.__c.getField(true,"False"));
 BA.debugLineNum = 474;BA.debugLine="btnSpeichern.TextColor = 0xFF888888";
Debug.ShouldStop(33554432);
__ref.getField(false,"_btnspeichern" /*RemoteObject*/ ).runMethod(true,"setTextColor",BA.numberCast(int.class, ((int)0xff888888)));
 BA.debugLineNum = 475;BA.debugLine="tbxFDJgewicht.Enabled = False";
Debug.ShouldStop(67108864);
__ref.getField(false,"_tbxfdjgewicht" /*RemoteObject*/ ).runMethod(true,"setEnabled",screenmain.__c.getField(true,"False"));
 BA.debugLineNum = 476;BA.debugLine="btnFDJsave.Enabled = False";
Debug.ShouldStop(134217728);
__ref.getField(false,"_btnfdjsave" /*RemoteObject*/ ).runMethod(true,"setEnabled",screenmain.__c.getField(true,"False"));
 BA.debugLineNum = 477;BA.debugLine="btnFDJsave.TextColor = 0xFF888888";
Debug.ShouldStop(268435456);
__ref.getField(false,"_btnfdjsave" /*RemoteObject*/ ).runMethod(true,"setTextColor",BA.numberCast(int.class, ((int)0xff888888)));
 BA.debugLineNum = 478;BA.debugLine="btnCloseVstng.Enabled = False";
Debug.ShouldStop(536870912);
__ref.getField(false,"_btnclosevstng" /*RemoteObject*/ ).runMethod(true,"setEnabled",screenmain.__c.getField(true,"False"));
 BA.debugLineNum = 479;BA.debugLine="spnPlatz.Enabled = False";
Debug.ShouldStop(1073741824);
__ref.getField(false,"_spnplatz" /*RemoteObject*/ ).runMethod(true,"setEnabled",screenmain.__c.getField(true,"False"));
 BA.debugLineNum = 480;BA.debugLine="End Sub";
Debug.ShouldStop(-2147483648);
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
		Debug.PushSubsStack("ExecuteHttp (screenmain) ","screenmain",2,__ref.getField(false, "ba"),__ref,876);
if (RapidSub.canDelegate("executehttp")) { __ref.runUserSub(false, "screenmain","executehttp", __ref, _method, _url, _payload); return;}
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
public ResumableSub_ExecuteHttp(b4a.example.screenmain parent,RemoteObject __ref,RemoteObject _method,RemoteObject _url,RemoteObject _payload) {
this.parent = parent;
this.__ref = __ref;
this._method = _method;
this._url = _url;
this._payload = _payload;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4a.example.screenmain parent;
RemoteObject _method;
RemoteObject _url;
RemoteObject _payload;
RemoteObject _typ = RemoteObject.createImmutable("");
RemoteObject _j;

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("ExecuteHttp (screenmain) ","screenmain",2,__ref.getField(false, "ba"),__ref,876);
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
 BA.debugLineNum = 877;BA.debugLine="Dim typ As String = DBdatenTyp";
Debug.ShouldStop(4096);
_typ = __ref.getField(true,"_dbdatentyp" /*RemoteObject*/ );Debug.locals.put("typ", _typ);Debug.locals.put("typ", _typ);
 BA.debugLineNum = 878;BA.debugLine="Dim j As HttpJob";
Debug.ShouldStop(8192);
_j = RemoteObject.createNew ("b4a.example.httpjob");Debug.locals.put("j", _j);
 BA.debugLineNum = 879;BA.debugLine="j.Initialize(typ, Me)";
Debug.ShouldStop(16384);
_j.runClassMethod (b4a.example.httpjob.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(_typ),(Object)(__ref));
 BA.debugLineNum = 881;BA.debugLine="Select method";
Debug.ShouldStop(65536);
if (true) break;

case 1:
//select
this.state = 8;
switch (BA.switchObjectToInt(_method,BA.ObjectToString("GET"),BA.ObjectToString("PUT"),BA.ObjectToString("PATCH"))) {
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
 BA.debugLineNum = 883;BA.debugLine="j.Download(url)";
Debug.ShouldStop(262144);
_j.runClassMethod (b4a.example.httpjob.class, "_download" /*RemoteObject*/ ,(Object)(_url));
 if (true) break;

case 5:
//C
this.state = 8;
 BA.debugLineNum = 885;BA.debugLine="j.PutString(url, payload)";
Debug.ShouldStop(1048576);
_j.runClassMethod (b4a.example.httpjob.class, "_putstring" /*RemoteObject*/ ,(Object)(_url),(Object)(_payload));
 BA.debugLineNum = 886;BA.debugLine="j.GetRequest.SetContentType(\"application/json\")";
Debug.ShouldStop(2097152);
_j.runClassMethod (b4a.example.httpjob.class, "_getrequest" /*RemoteObject*/ ).runVoidMethod ("SetContentType",(Object)(RemoteObject.createImmutable("application/json")));
 if (true) break;

case 7:
//C
this.state = 8;
 BA.debugLineNum = 888;BA.debugLine="j.PatchString(url, payload)";
Debug.ShouldStop(8388608);
_j.runClassMethod (b4a.example.httpjob.class, "_patchstring" /*RemoteObject*/ ,(Object)(_url),(Object)(_payload));
 BA.debugLineNum = 889;BA.debugLine="j.GetRequest.SetContentType(\"application/json\")";
Debug.ShouldStop(16777216);
_j.runClassMethod (b4a.example.httpjob.class, "_getrequest" /*RemoteObject*/ ).runVoidMethod ("SetContentType",(Object)(RemoteObject.createImmutable("application/json")));
 if (true) break;

case 8:
//C
this.state = 9;
;
 BA.debugLineNum = 892;BA.debugLine="Wait For (j) JobDone(j As HttpJob)";
Debug.ShouldStop(134217728);
parent.__c.runVoidMethod ("WaitFor","jobdone", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "screenmain", "executehttp"), (_j));
this.state = 15;
return;
case 15:
//C
this.state = 9;
_j = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("j", _j);
;
 BA.debugLineNum = 894;BA.debugLine="If j.Success Then";
Debug.ShouldStop(536870912);
if (true) break;

case 9:
//if
this.state = 14;
if (_j.getField(true,"_success" /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
this.state = 11;
}else {
this.state = 13;
}if (true) break;

case 11:
//C
this.state = 14;
 BA.debugLineNum = 895;BA.debugLine="HandleGotText(typ, j.GetString)";
Debug.ShouldStop(1073741824);
__ref.runClassMethod (b4a.example.screenmain.class, "_handlegottext" /*RemoteObject*/ ,(Object)(_typ),(Object)(_j.runClassMethod (b4a.example.httpjob.class, "_getstring" /*RemoteObject*/ )));
 if (true) break;

case 13:
//C
this.state = 14;
 BA.debugLineNum = 897;BA.debugLine="setzeOffline";
Debug.ShouldStop(1);
__ref.runClassMethod (b4a.example.screenmain.class, "_setzeoffline" /*RemoteObject*/ );
 if (true) break;

case 14:
//C
this.state = -1;
;
 BA.debugLineNum = 899;BA.debugLine="j.Release";
Debug.ShouldStop(4);
_j.runClassMethod (b4a.example.httpjob.class, "_release" /*RemoteObject*/ );
 BA.debugLineNum = 900;BA.debugLine="startTimer";
Debug.ShouldStop(8);
__ref.runClassMethod (b4a.example.screenmain.class, "_starttimer" /*RemoteObject*/ );
 BA.debugLineNum = 901;BA.debugLine="End Sub";
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
public static void  _jobdone(RemoteObject __ref,RemoteObject _j) throws Exception{
}
public static RemoteObject  _formatdatecustom(RemoteObject __ref,RemoteObject _ticks,RemoteObject _pattern) throws Exception{
try {
		Debug.PushSubsStack("FormatDateCustom (screenmain) ","screenmain",2,__ref.getField(false, "ba"),__ref,1247);
if (RapidSub.canDelegate("formatdatecustom")) { return __ref.runUserSub(false, "screenmain","formatdatecustom", __ref, _ticks, _pattern);}
RemoteObject _oldformat = RemoteObject.createImmutable("");
RemoteObject _res = RemoteObject.createImmutable("");
Debug.locals.put("ticks", _ticks);
Debug.locals.put("pattern", _pattern);
 BA.debugLineNum = 1247;BA.debugLine="Private Sub FormatDateCustom(ticks As Long, patter";
Debug.ShouldStop(1073741824);
 BA.debugLineNum = 1248;BA.debugLine="Dim oldFormat As String = DateTime.DateFormat";
Debug.ShouldStop(-2147483648);
_oldformat = screenmain.__c.getField(false,"DateTime").runMethod(true,"getDateFormat");Debug.locals.put("oldformat", _oldformat);Debug.locals.put("oldFormat", _oldformat);
 BA.debugLineNum = 1249;BA.debugLine="DateTime.DateFormat = pattern";
Debug.ShouldStop(1);
screenmain.__c.getField(false,"DateTime").runMethod(true,"setDateFormat",_pattern);
 BA.debugLineNum = 1250;BA.debugLine="Dim res As String = DateTime.Date(ticks)";
Debug.ShouldStop(2);
_res = screenmain.__c.getField(false,"DateTime").runMethod(true,"Date",(Object)(_ticks));Debug.locals.put("res", _res);Debug.locals.put("res", _res);
 BA.debugLineNum = 1251;BA.debugLine="DateTime.DateFormat = oldFormat";
Debug.ShouldStop(4);
screenmain.__c.getField(false,"DateTime").runMethod(true,"setDateFormat",_oldformat);
 BA.debugLineNum = 1252;BA.debugLine="Return res";
Debug.ShouldStop(8);
if (true) return _res;
 BA.debugLineNum = 1253;BA.debugLine="End Sub";
Debug.ShouldStop(16);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getweb(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("GetWeb (screenmain) ","screenmain",2,__ref.getField(false, "ba"),__ref,849);
if (RapidSub.canDelegate("getweb")) { return __ref.runUserSub(false, "screenmain","getweb", __ref);}
 BA.debugLineNum = 849;BA.debugLine="Private Sub GetWeb";
Debug.ShouldStop(65536);
 BA.debugLineNum = 850;BA.debugLine="If True = Status.GetDefault(\"ProgOffline\", True)";
Debug.ShouldStop(131072);
if (RemoteObject.solveBoolean("=",screenmain.__c.getField(true,"True"),BA.ObjectToBoolean(__ref.getField(false,"_status" /*RemoteObject*/ ).runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("ProgOffline"))),(Object)((screenmain.__c.getField(true,"True"))))))) { 
 BA.debugLineNum = 851;BA.debugLine="btnCloseVstng.Enabled = False";
Debug.ShouldStop(262144);
__ref.getField(false,"_btnclosevstng" /*RemoteObject*/ ).runMethod(true,"setEnabled",screenmain.__c.getField(true,"False"));
 BA.debugLineNum = 852;BA.debugLine="SetButtonImageSafe(btnCloseVstng, \"disconnected.";
Debug.ShouldStop(524288);
__ref.runClassMethod (b4a.example.screenmain.class, "_setbuttonimagesafe" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_btnclosevstng" /*RemoteObject*/ )),(Object)(BA.ObjectToString("disconnected.png")),(Object)(RemoteObject.createImmutable("⚠")));
 BA.debugLineNum = 853;BA.debugLine="btnSettings.Visible = False";
Debug.ShouldStop(1048576);
__ref.getField(false,"_btnsettings" /*RemoteObject*/ ).runMethod(true,"setVisible",screenmain.__c.getField(true,"False"));
 BA.debugLineNum = 854;BA.debugLine="GotTextOffline";
Debug.ShouldStop(2097152);
__ref.runClassMethod (b4a.example.screenmain.class, "_gottextoffline" /*RemoteObject*/ );
 }else {
 BA.debugLineNum = 856;BA.debugLine="ExecuteHttp(\"GET\", CurrentWebUrl, \"\")";
Debug.ShouldStop(8388608);
__ref.runClassMethod (b4a.example.screenmain.class, "_executehttp" /*void*/ ,(Object)(BA.ObjectToString("GET")),(Object)(__ref.getField(true,"_currentweburl" /*RemoteObject*/ )),(Object)(RemoteObject.createImmutable("")));
 };
 BA.debugLineNum = 858;BA.debugLine="End Sub";
Debug.ShouldStop(33554432);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getwebviewstring(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("getWebViewString (screenmain) ","screenmain",2,__ref.getField(false, "ba"),__ref,388);
if (RapidSub.canDelegate("getwebviewstring")) { return __ref.runUserSub(false, "screenmain","getwebviewstring", __ref);}
 BA.debugLineNum = 388;BA.debugLine="Public Sub getWebViewString As String";
Debug.ShouldStop(8);
 BA.debugLineNum = 389;BA.debugLine="Return CurrentWebViewString";
Debug.ShouldStop(16);
if (true) return __ref.getField(true,"_currentwebviewstring" /*RemoteObject*/ );
 BA.debugLineNum = 390;BA.debugLine="End Sub";
Debug.ShouldStop(32);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _gottextoffline(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("GotTextOffline (screenmain) ","screenmain",2,__ref.getField(false, "ba"),__ref,943);
if (RapidSub.canDelegate("gottextoffline")) { return __ref.runUserSub(false, "screenmain","gottextoffline", __ref);}
RemoteObject _typ = RemoteObject.createImmutable("");
RemoteObject _dbwv = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
 BA.debugLineNum = 943;BA.debugLine="Private Sub GotTextOffline";
Debug.ShouldStop(16384);
 BA.debugLineNum = 944;BA.debugLine="Dim typ As String = DBdatenTyp";
Debug.ShouldStop(32768);
_typ = __ref.getField(true,"_dbdatentyp" /*RemoteObject*/ );Debug.locals.put("typ", _typ);Debug.locals.put("typ", _typ);
 BA.debugLineNum = 945;BA.debugLine="DBdatenTyp = \"\"";
Debug.ShouldStop(65536);
__ref.setField ("_dbdatentyp" /*RemoteObject*/ ,BA.ObjectToString(""));
 BA.debugLineNum = 947;BA.debugLine="Select typ";
Debug.ShouldStop(262144);
switch (BA.switchObjectToInt(_typ,BA.ObjectToString("Teilnehmer"),BA.ObjectToString("Wertungsliste"),BA.ObjectToString("saveOnly"),BA.ObjectToString("LastChange"),BA.ObjectToString("fdj"),BA.ObjectToString("saveWertungsliste"),BA.ObjectToString("addTLN"))) {
case 0: {
 BA.debugLineNum = 949;BA.debugLine="Teilnehmer = DBGet(\"Teilnehmer\", Teilnehmer)";
Debug.ShouldStop(1048576);
__ref.getField(false,"_teilnehmer" /*RemoteObject*/ ).setObject (__ref.runClassMethod (b4a.example.screenmain.class, "_dbget" /*RemoteObject*/ ,(Object)(BA.ObjectToString("Teilnehmer")),(Object)((__ref.getField(false,"_teilnehmer" /*RemoteObject*/ ).getObject()))));
 BA.debugLineNum = 950;BA.debugLine="holeWertungsliste";
Debug.ShouldStop(2097152);
__ref.runClassMethod (b4a.example.screenmain.class, "_holewertungsliste" /*RemoteObject*/ );
 break; }
case 1: {
 BA.debugLineNum = 952;BA.debugLine="Dim dbWv As List = DBGet(\"webviewData\", Null)";
Debug.ShouldStop(8388608);
_dbwv = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_dbwv = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.List"), __ref.runClassMethod (b4a.example.screenmain.class, "_dbget" /*RemoteObject*/ ,(Object)(BA.ObjectToString("webviewData")),(Object)(screenmain.__c.getField(false,"Null"))));Debug.locals.put("dbwv", _dbwv);Debug.locals.put("dbWv", _dbwv);
 BA.debugLineNum = 953;BA.debugLine="If dbWv = Null Or Not(dbWv.IsInitialized) Or db";
Debug.ShouldStop(16777216);
if (RemoteObject.solveBoolean("n",_dbwv) || RemoteObject.solveBoolean(".",screenmain.__c.runMethod(true,"Not",(Object)(_dbwv.runMethod(true,"IsInitialized")))) || RemoteObject.solveBoolean("=",_dbwv.runMethod(true,"getSize"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 954;BA.debugLine="initWertungsliste(True)";
Debug.ShouldStop(33554432);
__ref.runClassMethod (b4a.example.screenmain.class, "_initwertungsliste" /*RemoteObject*/ ,(Object)(screenmain.__c.getField(true,"True")));
 BA.debugLineNum = 955;BA.debugLine="saveWertungsliste(\"saveOnly\")";
Debug.ShouldStop(67108864);
__ref.runClassMethod (b4a.example.screenmain.class, "_savewertungsliste" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("saveOnly")));
 }else {
 BA.debugLineNum = 957;BA.debugLine="webviewData = dbWv";
Debug.ShouldStop(268435456);
__ref.setField ("_webviewdata" /*RemoteObject*/ ,_dbwv);
 };
 BA.debugLineNum = 959;BA.debugLine="zeigeWertungsliste";
Debug.ShouldStop(1073741824);
__ref.runClassMethod (b4a.example.screenmain.class, "_zeigewertungsliste" /*RemoteObject*/ );
 break; }
case 2: 
case 3: 
case 4: {
 break; }
case 5: {
 BA.debugLineNum = 963;BA.debugLine="addTLN = False";
Debug.ShouldStop(4);
__ref.setField ("_addtln" /*RemoteObject*/ ,screenmain.__c.getField(true,"False"));
 BA.debugLineNum = 964;BA.debugLine="addTeilnehmer";
Debug.ShouldStop(8);
__ref.runClassMethod (b4a.example.screenmain.class, "_addteilnehmer" /*RemoteObject*/ );
 BA.debugLineNum = 965;BA.debugLine="If Not(addTLN) Then zeigeWertungsliste";
Debug.ShouldStop(16);
if (screenmain.__c.runMethod(true,"Not",(Object)(__ref.getField(true,"_addtln" /*RemoteObject*/ ))).<Boolean>get().booleanValue()) { 
__ref.runClassMethod (b4a.example.screenmain.class, "_zeigewertungsliste" /*RemoteObject*/ );};
 break; }
case 6: {
 BA.debugLineNum = 967;BA.debugLine="zeigeWertungsliste";
Debug.ShouldStop(64);
__ref.runClassMethod (b4a.example.screenmain.class, "_zeigewertungsliste" /*RemoteObject*/ );
 break; }
}
;
 BA.debugLineNum = 969;BA.debugLine="End Sub";
Debug.ShouldStop(256);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _handlegottext(RemoteObject __ref,RemoteObject _typ,RemoteObject _responsecontent) throws Exception{
try {
		Debug.PushSubsStack("HandleGotText (screenmain) ","screenmain",2,__ref.getField(false, "ba"),__ref,903);
if (RapidSub.canDelegate("handlegottext")) { return __ref.runUserSub(false, "screenmain","handlegottext", __ref, _typ, _responsecontent);}
RemoteObject _jp = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.JSONParser");
Debug.locals.put("typ", _typ);
Debug.locals.put("responseContent", _responsecontent);
 BA.debugLineNum = 903;BA.debugLine="Private Sub HandleGotText(typ As String, responseC";
Debug.ShouldStop(64);
 BA.debugLineNum = 904;BA.debugLine="DBdatenTyp = \"\"";
Debug.ShouldStop(128);
__ref.setField ("_dbdatentyp" /*RemoteObject*/ ,BA.ObjectToString(""));
 BA.debugLineNum = 905;BA.debugLine="Dim jp As JSONParser";
Debug.ShouldStop(256);
_jp = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.JSONParser");Debug.locals.put("jp", _jp);
 BA.debugLineNum = 907;BA.debugLine="Select typ";
Debug.ShouldStop(1024);
switch (BA.switchObjectToInt(_typ,BA.ObjectToString("Wertungsliste"),BA.ObjectToString("Teilnehmer"),BA.ObjectToString("saveWertungsliste"),BA.ObjectToString("addTLN"),BA.ObjectToString("ErgClosed"),BA.ObjectToString("saveOnly"),BA.ObjectToString("VSTNGclosed"),BA.ObjectToString("LastChange"),BA.ObjectToString("FDJ"))) {
case 0: {
 BA.debugLineNum = 909;BA.debugLine="If responseContent = \"null\" Then";
Debug.ShouldStop(4096);
if (RemoteObject.solveBoolean("=",_responsecontent,BA.ObjectToString("null"))) { 
 BA.debugLineNum = 910;BA.debugLine="initWertungsliste(True)";
Debug.ShouldStop(8192);
__ref.runClassMethod (b4a.example.screenmain.class, "_initwertungsliste" /*RemoteObject*/ ,(Object)(screenmain.__c.getField(true,"True")));
 BA.debugLineNum = 911;BA.debugLine="saveWertungsliste(\"saveWertungsliste\")";
Debug.ShouldStop(16384);
__ref.runClassMethod (b4a.example.screenmain.class, "_savewertungsliste" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("saveWertungsliste")));
 }else {
 BA.debugLineNum = 913;BA.debugLine="jp.Initialize(responseContent)";
Debug.ShouldStop(65536);
_jp.runVoidMethod ("Initialize",(Object)(_responsecontent));
 BA.debugLineNum = 914;BA.debugLine="ladeWertungsliste(jp.NextObject)";
Debug.ShouldStop(131072);
__ref.runClassMethod (b4a.example.screenmain.class, "_ladewertungsliste" /*RemoteObject*/ ,(Object)(_jp.runMethod(false,"NextObject")));
 };
 break; }
case 1: {
 BA.debugLineNum = 917;BA.debugLine="ladeTeilnehmer(responseContent)";
Debug.ShouldStop(1048576);
__ref.runClassMethod (b4a.example.screenmain.class, "_ladeteilnehmer" /*RemoteObject*/ ,(Object)(_responsecontent));
 BA.debugLineNum = 918;BA.debugLine="holeFDJ";
Debug.ShouldStop(2097152);
__ref.runClassMethod (b4a.example.screenmain.class, "_holefdj" /*RemoteObject*/ );
 break; }
case 2: {
 BA.debugLineNum = 920;BA.debugLine="addTLN = False";
Debug.ShouldStop(8388608);
__ref.setField ("_addtln" /*RemoteObject*/ ,screenmain.__c.getField(true,"False"));
 BA.debugLineNum = 921;BA.debugLine="addTeilnehmer";
Debug.ShouldStop(16777216);
__ref.runClassMethod (b4a.example.screenmain.class, "_addteilnehmer" /*RemoteObject*/ );
 BA.debugLineNum = 922;BA.debugLine="If Not(addTLN) Then holeWertungsliste";
Debug.ShouldStop(33554432);
if (screenmain.__c.runMethod(true,"Not",(Object)(__ref.getField(true,"_addtln" /*RemoteObject*/ ))).<Boolean>get().booleanValue()) { 
__ref.runClassMethod (b4a.example.screenmain.class, "_holewertungsliste" /*RemoteObject*/ );};
 break; }
case 3: {
 BA.debugLineNum = 924;BA.debugLine="holeWertungsliste";
Debug.ShouldStop(134217728);
__ref.runClassMethod (b4a.example.screenmain.class, "_holewertungsliste" /*RemoteObject*/ );
 break; }
case 4: {
 BA.debugLineNum = 926;BA.debugLine="vaEingabe.Visible = False";
Debug.ShouldStop(536870912);
__ref.getField(false,"_vaeingabe" /*RemoteObject*/ ).runMethod(true,"setVisible",screenmain.__c.getField(true,"False"));
 BA.debugLineNum = 927;BA.debugLine="haDown.Visible = True";
Debug.ShouldStop(1073741824);
__ref.getField(false,"_hadown" /*RemoteObject*/ ).runMethod(true,"setVisible",screenmain.__c.getField(true,"True"));
 BA.debugLineNum = 928;BA.debugLine="btnDown.Visible = False";
Debug.ShouldStop(-2147483648);
__ref.getField(false,"_btndown" /*RemoteObject*/ ).runMethod(true,"setVisible",screenmain.__c.getField(true,"False"));
 BA.debugLineNum = 929;BA.debugLine="UpdateLayoutPositions";
Debug.ShouldStop(1);
__ref.runClassMethod (b4a.example.screenmain.class, "_updatelayoutpositions" /*RemoteObject*/ );
 BA.debugLineNum = 930;BA.debugLine="closeVstng(\"Verranstaltung\")";
Debug.ShouldStop(2);
__ref.runClassMethod (b4a.example.screenmain.class, "_closevstng" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("Verranstaltung")));
 break; }
case 5: {
 break; }
case 6: {
 break; }
case 7: {
 break; }
case 8: {
 BA.debugLineNum = 938;BA.debugLine="ladeFDJ(responseContent)";
Debug.ShouldStop(512);
__ref.runClassMethod (b4a.example.screenmain.class, "_ladefdj" /*RemoteObject*/ ,(Object)(_responsecontent));
 BA.debugLineNum = 939;BA.debugLine="holeWertungsliste";
Debug.ShouldStop(1024);
__ref.runClassMethod (b4a.example.screenmain.class, "_holewertungsliste" /*RemoteObject*/ );
 break; }
}
;
 BA.debugLineNum = 941;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("HideKeyboard (screenmain) ","screenmain",2,__ref.getField(false, "ba"),__ref,1255);
if (RapidSub.canDelegate("hidekeyboard")) { return __ref.runUserSub(false, "screenmain","hidekeyboard", __ref);}
RemoteObject _p = RemoteObject.declareNull("anywheresoftware.b4a.phone.Phone");
 BA.debugLineNum = 1255;BA.debugLine="Private Sub HideKeyboard";
Debug.ShouldStop(64);
 BA.debugLineNum = 1256;BA.debugLine="Dim p As Phone";
Debug.ShouldStop(128);
_p = RemoteObject.createNew ("anywheresoftware.b4a.phone.Phone");Debug.locals.put("p", _p);
 BA.debugLineNum = 1257;BA.debugLine="p.HideKeyboard(B4XPages.GetNativeParent(Me))";
Debug.ShouldStop(256);
_p.runVoidMethod ("HideKeyboard",(Object)(screenmain._b4xpages.runMethod(false,"_getnativeparent" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(__ref))));
 BA.debugLineNum = 1258;BA.debugLine="End Sub";
Debug.ShouldStop(512);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _holefdj(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("holeFDJ (screenmain) ","screenmain",2,__ref.getField(false, "ba"),__ref,679);
if (RapidSub.canDelegate("holefdj")) { return __ref.runUserSub(false, "screenmain","holefdj", __ref);}
RemoteObject _verdatum = RemoteObject.createImmutable("");
RemoteObject _parts = null;
 BA.debugLineNum = 679;BA.debugLine="Private Sub holeFDJ";
Debug.ShouldStop(64);
 BA.debugLineNum = 680;BA.debugLine="DBdatenTyp = \"FDJ\"";
Debug.ShouldStop(128);
__ref.setField ("_dbdatentyp" /*RemoteObject*/ ,BA.ObjectToString("FDJ"));
 BA.debugLineNum = 681;BA.debugLine="Dim verDatum As String = DBGet(\"VeranstaltungDatu";
Debug.ShouldStop(256);
_verdatum = BA.ObjectToString(__ref.runClassMethod (b4a.example.screenmain.class, "_dbget" /*RemoteObject*/ ,(Object)(BA.ObjectToString("VeranstaltungDatum")),(Object)((RemoteObject.createImmutable("00.00.0000")))));Debug.locals.put("verdatum", _verdatum);Debug.locals.put("verDatum", _verdatum);
 BA.debugLineNum = 682;BA.debugLine="Dim parts() As String = Regex.Split(\"\\.\", verDatu";
Debug.ShouldStop(512);
_parts = screenmain.__c.getField(false,"Regex").runMethod(false,"Split",(Object)(BA.ObjectToString("\\.")),(Object)(_verdatum));Debug.locals.put("parts", _parts);Debug.locals.put("parts", _parts);
 BA.debugLineNum = 683;BA.debugLine="CurrentWebUrl = URLfdj.Replace(\"[xxxx]\", parts(2)";
Debug.ShouldStop(1024);
__ref.setField ("_currentweburl" /*RemoteObject*/ ,RemoteObject.concat(__ref.getField(true,"_urlfdj" /*RemoteObject*/ ).runMethod(true,"replace",(Object)(BA.ObjectToString("[xxxx]")),(Object)(_parts.getArrayElement(true,BA.numberCast(int.class, 2)))),RemoteObject.createImmutable(".json?auth="),__ref.getField(false,"_status" /*RemoteObject*/ ).runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("idToken"))),(Object)((RemoteObject.createImmutable(""))))));
 BA.debugLineNum = 684;BA.debugLine="GetWeb";
Debug.ShouldStop(2048);
__ref.runClassMethod (b4a.example.screenmain.class, "_getweb" /*RemoteObject*/ );
 BA.debugLineNum = 685;BA.debugLine="End Sub";
Debug.ShouldStop(4096);
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
		Debug.PushSubsStack("holeTLN (screenmain) ","screenmain",2,__ref.getField(false, "ba"),__ref,673);
if (RapidSub.canDelegate("holetln")) { return __ref.runUserSub(false, "screenmain","holetln", __ref);}
 BA.debugLineNum = 673;BA.debugLine="Private Sub holeTLN";
Debug.ShouldStop(1);
 BA.debugLineNum = 674;BA.debugLine="DBdatenTyp = \"Teilnehmer\"";
Debug.ShouldStop(2);
__ref.setField ("_dbdatentyp" /*RemoteObject*/ ,BA.ObjectToString("Teilnehmer"));
 BA.debugLineNum = 675;BA.debugLine="CurrentWebUrl = URLteilnehmer & \".json?auth=\" & S";
Debug.ShouldStop(4);
__ref.setField ("_currentweburl" /*RemoteObject*/ ,RemoteObject.concat(__ref.getField(true,"_urlteilnehmer" /*RemoteObject*/ ),RemoteObject.createImmutable(".json?auth="),__ref.getField(false,"_status" /*RemoteObject*/ ).runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("idToken"))),(Object)((RemoteObject.createImmutable(""))))));
 BA.debugLineNum = 676;BA.debugLine="GetWeb";
Debug.ShouldStop(8);
__ref.runClassMethod (b4a.example.screenmain.class, "_getweb" /*RemoteObject*/ );
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
public static RemoteObject  _holewertungsliste(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("holeWertungsliste (screenmain) ","screenmain",2,__ref.getField(false, "ba"),__ref,661);
if (RapidSub.canDelegate("holewertungsliste")) { return __ref.runUserSub(false, "screenmain","holewertungsliste", __ref);}
RemoteObject _verdatum = RemoteObject.createImmutable("");
RemoteObject _key = null;
 BA.debugLineNum = 661;BA.debugLine="Private Sub holeWertungsliste";
Debug.ShouldStop(1048576);
 BA.debugLineNum = 662;BA.debugLine="DBdatenTyp = \"Wertungsliste\"";
Debug.ShouldStop(2097152);
__ref.setField ("_dbdatentyp" /*RemoteObject*/ ,BA.ObjectToString("Wertungsliste"));
 BA.debugLineNum = 663;BA.debugLine="If PlatzSelected <> SelectNewRow And SelectNewRow";
Debug.ShouldStop(4194304);
if (RemoteObject.solveBoolean("!",__ref.getField(true,"_platzselected" /*RemoteObject*/ ),BA.numberCast(double.class, __ref.getField(true,"_selectnewrow" /*RemoteObject*/ ))) && RemoteObject.solveBoolean(">",__ref.getField(true,"_selectnewrow" /*RemoteObject*/ ),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 664;BA.debugLine="PlatzSelected = SelectNewRow";
Debug.ShouldStop(8388608);
__ref.setField ("_platzselected" /*RemoteObject*/ ,__ref.getField(true,"_selectnewrow" /*RemoteObject*/ ));
 };
 BA.debugLineNum = 667;BA.debugLine="Dim verDatum As String = DBGet(\"VeranstaltungDatu";
Debug.ShouldStop(67108864);
_verdatum = BA.ObjectToString(__ref.runClassMethod (b4a.example.screenmain.class, "_dbget" /*RemoteObject*/ ,(Object)(BA.ObjectToString("VeranstaltungDatum")),(Object)((__ref.runClassMethod (b4a.example.screenmain.class, "_formatdatecustom" /*RemoteObject*/ ,(Object)(screenmain.__c.getField(false,"DateTime").runMethod(true,"getNow")),(Object)(RemoteObject.createImmutable("dd.MM.yyyy")))))));Debug.locals.put("verdatum", _verdatum);Debug.locals.put("verDatum", _verdatum);
 BA.debugLineNum = 668;BA.debugLine="Dim key() As String = Regex.Split(\"\\.\", verDatum)";
Debug.ShouldStop(134217728);
_key = screenmain.__c.getField(false,"Regex").runMethod(false,"Split",(Object)(BA.ObjectToString("\\.")),(Object)(_verdatum));Debug.locals.put("key", _key);Debug.locals.put("key", _key);
 BA.debugLineNum = 669;BA.debugLine="CurrentWebUrl = URLErgebnisse & \"e\" & key(2) & ke";
Debug.ShouldStop(268435456);
__ref.setField ("_currentweburl" /*RemoteObject*/ ,RemoteObject.concat(__ref.getField(true,"_urlergebnisse" /*RemoteObject*/ ),RemoteObject.createImmutable("e"),_key.getArrayElement(true,BA.numberCast(int.class, 2)),_key.getArrayElement(true,BA.numberCast(int.class, 1)),_key.getArrayElement(true,BA.numberCast(int.class, 0)),RemoteObject.createImmutable(".json?auth="),__ref.getField(false,"_status" /*RemoteObject*/ ).runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("idToken"))),(Object)((RemoteObject.createImmutable(""))))));
 BA.debugLineNum = 670;BA.debugLine="GetWeb";
Debug.ShouldStop(536870912);
__ref.runClassMethod (b4a.example.screenmain.class, "_getweb" /*RemoteObject*/ );
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
public static void  _initialisiere(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("initialisiere (screenmain) ","screenmain",2,__ref.getField(false, "ba"),__ref,400);
if (RapidSub.canDelegate("initialisiere")) { __ref.runUserSub(false, "screenmain","initialisiere", __ref); return;}
ResumableSub_initialisiere rsub = new ResumableSub_initialisiere(null,__ref);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_initialisiere extends BA.ResumableSub {
public ResumableSub_initialisiere(b4a.example.screenmain parent,RemoteObject __ref) {
this.parent = parent;
this.__ref = __ref;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4a.example.screenmain parent;
RemoteObject _anzahl = RemoteObject.createImmutable(0);
int _i = 0;
RemoteObject _offline = RemoteObject.createImmutable(false);
RemoteObject _vid = RemoteObject.createImmutable("");
RemoteObject _res;
int step25;
int limit25;

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("initialisiere (screenmain) ","screenmain",2,__ref.getField(false, "ba"),__ref,400);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
;
 BA.debugLineNum = 401;BA.debugLine="Teilnehmer.Initialize";
Debug.ShouldStop(65536);
__ref.getField(false,"_teilnehmer" /*RemoteObject*/ ).runVoidMethod ("Initialize");
 BA.debugLineNum = 402;BA.debugLine="DBdatenTyp = \"\"";
Debug.ShouldStop(131072);
__ref.setField ("_dbdatentyp" /*RemoteObject*/ ,BA.ObjectToString(""));
 BA.debugLineNum = 403;BA.debugLine="TLNlastID = \"t0\"";
Debug.ShouldStop(262144);
__ref.setField ("_tlnlastid" /*RemoteObject*/ ,BA.ObjectToString("t0"));
 BA.debugLineNum = 404;BA.debugLine="webviewData.Initialize";
Debug.ShouldStop(524288);
__ref.getField(false,"_webviewdata" /*RemoteObject*/ ).runVoidMethod ("Initialize");
 BA.debugLineNum = 405;BA.debugLine="PlatzSelected = 1";
Debug.ShouldStop(1048576);
__ref.setField ("_platzselected" /*RemoteObject*/ ,BA.numberCast(int.class, 1));
 BA.debugLineNum = 406;BA.debugLine="dochange = True";
Debug.ShouldStop(2097152);
__ref.setField ("_dochange" /*RemoteObject*/ ,parent.__c.getField(true,"True"));
 BA.debugLineNum = 407;BA.debugLine="addTLN = False";
Debug.ShouldStop(4194304);
__ref.setField ("_addtln" /*RemoteObject*/ ,parent.__c.getField(true,"False"));
 BA.debugLineNum = 408;BA.debugLine="VSTNGgeschlossen = False";
Debug.ShouldStop(8388608);
__ref.setField ("_vstnggeschlossen" /*RemoteObject*/ ,parent.__c.getField(true,"False"));
 BA.debugLineNum = 410;BA.debugLine="disableEingabe";
Debug.ShouldStop(33554432);
__ref.runClassMethod (b4a.example.screenmain.class, "_disableeingabe" /*RemoteObject*/ );
 BA.debugLineNum = 411;BA.debugLine="setzeHeaderfromDB";
Debug.ShouldStop(67108864);
__ref.runClassMethod (b4a.example.screenmain.class, "_setzeheaderfromdb" /*RemoteObject*/ );
 BA.debugLineNum = 412;BA.debugLine="changeURL";
Debug.ShouldStop(134217728);
__ref.runClassMethod (b4a.example.screenmain.class, "_changeurl" /*RemoteObject*/ );
 BA.debugLineNum = 413;BA.debugLine="clear";
Debug.ShouldStop(268435456);
__ref.runClassMethod (b4a.example.screenmain.class, "_clear" /*RemoteObject*/ );
 BA.debugLineNum = 415;BA.debugLine="haDown.Visible = False";
Debug.ShouldStop(1073741824);
__ref.getField(false,"_hadown" /*RemoteObject*/ ).runMethod(true,"setVisible",parent.__c.getField(true,"False"));
 BA.debugLineNum = 416;BA.debugLine="vaEingabe.Visible = True";
Debug.ShouldStop(-2147483648);
__ref.getField(false,"_vaeingabe" /*RemoteObject*/ ).runMethod(true,"setVisible",parent.__c.getField(true,"True"));
 BA.debugLineNum = 417;BA.debugLine="vaErgEingabe.Visible = True";
Debug.ShouldStop(1);
__ref.getField(false,"_vaergeingabe" /*RemoteObject*/ ).runMethod(true,"setVisible",parent.__c.getField(true,"True"));
 BA.debugLineNum = 418;BA.debugLine="vaFDJ.Visible = False";
Debug.ShouldStop(2);
__ref.getField(false,"_vafdj" /*RemoteObject*/ ).runMethod(true,"setVisible",parent.__c.getField(true,"False"));
 BA.debugLineNum = 419;BA.debugLine="UpdateLayoutPositions";
Debug.ShouldStop(4);
__ref.runClassMethod (b4a.example.screenmain.class, "_updatelayoutpositions" /*RemoteObject*/ );
 BA.debugLineNum = 421;BA.debugLine="lsvName.Clear";
Debug.ShouldStop(16);
__ref.getField(false,"_lsvname" /*RemoteObject*/ ).runVoidMethod ("Clear");
 BA.debugLineNum = 422;BA.debugLine="lsvName.Visible = False";
Debug.ShouldStop(32);
__ref.getField(false,"_lsvname" /*RemoteObject*/ ).runMethod(true,"setVisible",parent.__c.getField(true,"False"));
 BA.debugLineNum = 423;BA.debugLine="btnCloseVstng.Enabled = True";
Debug.ShouldStop(64);
__ref.getField(false,"_btnclosevstng" /*RemoteObject*/ ).runMethod(true,"setEnabled",parent.__c.getField(true,"True"));
 BA.debugLineNum = 424;BA.debugLine="SetButtonImageSafe(btnCloseVstng, \"close.png\", \"�";
Debug.ShouldStop(128);
__ref.runClassMethod (b4a.example.screenmain.class, "_setbuttonimagesafe" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_btnclosevstng" /*RemoteObject*/ )),(Object)(BA.ObjectToString("close.png")),(Object)(RemoteObject.createImmutable("🔒")));
 BA.debugLineNum = 426;BA.debugLine="spnPlatz.Clear";
Debug.ShouldStop(512);
__ref.getField(false,"_spnplatz" /*RemoteObject*/ ).runVoidMethod ("Clear");
 BA.debugLineNum = 427;BA.debugLine="spnItems.Clear";
Debug.ShouldStop(1024);
__ref.getField(false,"_spnitems" /*RemoteObject*/ ).runVoidMethod ("Clear");
 BA.debugLineNum = 428;BA.debugLine="Dim anzahl As Int = DBGet(\"VeranstaltungAnzahl\",";
Debug.ShouldStop(2048);
_anzahl = BA.numberCast(int.class, __ref.runClassMethod (b4a.example.screenmain.class, "_dbget" /*RemoteObject*/ ,(Object)(BA.ObjectToString("VeranstaltungAnzahl")),(Object)((RemoteObject.createImmutable("25")))));Debug.locals.put("anzahl", _anzahl);Debug.locals.put("anzahl", _anzahl);
 BA.debugLineNum = 429;BA.debugLine="For i = 1 To anzahl";
Debug.ShouldStop(4096);
if (true) break;

case 1:
//for
this.state = 4;
step25 = 1;
limit25 = _anzahl.<Integer>get().intValue();
_i = 1 ;
Debug.locals.put("i", _i);
this.state = 29;
if (true) break;

case 29:
//C
this.state = 4;
if ((step25 > 0 && _i <= limit25) || (step25 < 0 && _i >= limit25)) this.state = 3;
if (true) break;

case 30:
//C
this.state = 29;
_i = ((int)(0 + _i + step25)) ;
Debug.locals.put("i", _i);
if (true) break;

case 3:
//C
this.state = 30;
 BA.debugLineNum = 430;BA.debugLine="spnPlatz.Add(i)";
Debug.ShouldStop(8192);
__ref.getField(false,"_spnplatz" /*RemoteObject*/ ).runVoidMethod ("Add",(Object)(BA.NumberToString(_i)));
 BA.debugLineNum = 431;BA.debugLine="spnItems.Add(i)";
Debug.ShouldStop(16384);
__ref.getField(false,"_spnitems" /*RemoteObject*/ ).runVoidMethod ("Add",(Object)(RemoteObject.createImmutable((_i))));
 if (true) break;
if (true) break;

case 4:
//C
this.state = 5;
Debug.locals.put("i", _i);
;
 BA.debugLineNum = 434;BA.debugLine="Dim offline As Boolean = Status.GetDefault(\"ProgO";
Debug.ShouldStop(131072);
_offline = BA.ObjectToBoolean(__ref.getField(false,"_status" /*RemoteObject*/ ).runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("ProgOffline"))),(Object)((parent.__c.getField(true,"True")))));Debug.locals.put("offline", _offline);Debug.locals.put("offline", _offline);
 BA.debugLineNum = 435;BA.debugLine="Dim vID As String = DBGet(\"VeranstaltungID\", \"v0\"";
Debug.ShouldStop(262144);
_vid = BA.ObjectToString(__ref.runClassMethod (b4a.example.screenmain.class, "_dbget" /*RemoteObject*/ ,(Object)(BA.ObjectToString("VeranstaltungID")),(Object)((RemoteObject.createImmutable("v0")))));Debug.locals.put("vid", _vid);Debug.locals.put("vID", _vid);
 BA.debugLineNum = 436;BA.debugLine="If vID = \"v0\" Then";
Debug.ShouldStop(524288);
if (true) break;

case 5:
//if
this.state = 28;
if (RemoteObject.solveBoolean("=",_vid,BA.ObjectToString("v0"))) { 
this.state = 7;
}else {
this.state = 27;
}if (true) break;

case 7:
//C
this.state = 8;
 BA.debugLineNum = 437;BA.debugLine="lblVeranstaltung.Text = \"- noch nicht ausgewählt";
Debug.ShouldStop(1048576);
__ref.getField(false,"_lblveranstaltung" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToCharSequence("- noch nicht ausgewählt -"));
 BA.debugLineNum = 438;BA.debugLine="lblDatum.Text = \"- bitte auswählen -\"";
Debug.ShouldStop(2097152);
__ref.getField(false,"_lbldatum" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToCharSequence("- bitte auswählen -"));
 BA.debugLineNum = 439;BA.debugLine="If offline Then";
Debug.ShouldStop(4194304);
if (true) break;

case 8:
//if
this.state = 25;
if (_offline.<Boolean>get().booleanValue()) { 
this.state = 10;
}else {
this.state = 18;
}if (true) break;

case 10:
//C
this.state = 11;
 BA.debugLineNum = 440;BA.debugLine="btnSettings.Visible = False";
Debug.ShouldStop(8388608);
__ref.getField(false,"_btnsettings" /*RemoteObject*/ ).runMethod(true,"setVisible",parent.__c.getField(true,"False"));
 BA.debugLineNum = 441;BA.debugLine="Msgbox2Async(\"Es wurde noch keine Veranstaltung";
Debug.ShouldStop(16777216);
parent.__c.runVoidMethod ("Msgbox2Async",(Object)(BA.ObjectToCharSequence("Es wurde noch keine Veranstaltung angelegt oder ausgewählt. Da keine Internet-Verbindung besteht, kann das Programm nicht weiter ausgeführt werden.")),(Object)(BA.ObjectToCharSequence("Veranstaltung fehlt")),(Object)(BA.ObjectToString("Beenden")),(Object)(BA.ObjectToString("")),(Object)(BA.ObjectToString("")),RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper"), parent.__c.getField(false,"Null")),__ref.getField(false, "ba"),(Object)(parent.__c.getField(true,"False")));
 BA.debugLineNum = 442;BA.debugLine="Wait For Msgbox_Result (res As Int)";
Debug.ShouldStop(33554432);
parent.__c.runVoidMethod ("WaitFor","msgbox_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "screenmain", "initialisiere"), null);
this.state = 31;
return;
case 31:
//C
this.state = 11;
_res = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("res", _res);
;
 BA.debugLineNum = 443;BA.debugLine="If res = DialogResponse.POSITIVE Then ExitAppli";
Debug.ShouldStop(67108864);
if (true) break;

case 11:
//if
this.state = 16;
if (RemoteObject.solveBoolean("=",_res,BA.numberCast(double.class, parent.__c.getField(false,"DialogResponse").getField(true,"POSITIVE")))) { 
this.state = 13;
;}if (true) break;

case 13:
//C
this.state = 16;
parent.__c.runVoidMethod ("ExitApplication");
if (true) break;

case 16:
//C
this.state = 25;
;
 if (true) break;

case 18:
//C
this.state = 19;
 BA.debugLineNum = 445;BA.debugLine="Msgbox2Async(\"Es wurde noch keine Veranstaltung";
Debug.ShouldStop(268435456);
parent.__c.runVoidMethod ("Msgbox2Async",(Object)(BA.ObjectToCharSequence("Es wurde noch keine Veranstaltung angelegt oder ausgewählt. Bitte in den Einstellungen Veranstaltung auswählen.")),(Object)(BA.ObjectToCharSequence("Veranstaltung fehlt")),(Object)(BA.ObjectToString("anlegen/auswählen")),(Object)(BA.ObjectToString("")),(Object)(BA.ObjectToString("")),RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper"), parent.__c.getField(false,"Null")),__ref.getField(false, "ba"),(Object)(parent.__c.getField(true,"False")));
 BA.debugLineNum = 446;BA.debugLine="Wait For Msgbox_Result (res As Int)";
Debug.ShouldStop(536870912);
parent.__c.runVoidMethod ("WaitFor","msgbox_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "screenmain", "initialisiere"), null);
this.state = 32;
return;
case 32:
//C
this.state = 19;
_res = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("res", _res);
;
 BA.debugLineNum = 447;BA.debugLine="If res = DialogResponse.POSITIVE Then OpenSetti";
Debug.ShouldStop(1073741824);
if (true) break;

case 19:
//if
this.state = 24;
if (RemoteObject.solveBoolean("=",_res,BA.numberCast(double.class, parent.__c.getField(false,"DialogResponse").getField(true,"POSITIVE")))) { 
this.state = 21;
;}if (true) break;

case 21:
//C
this.state = 24;
__ref.runClassMethod (b4a.example.screenmain.class, "_opensettingspage" /*RemoteObject*/ );
if (true) break;

case 24:
//C
this.state = 25;
;
 if (true) break;

case 25:
//C
this.state = 28;
;
 if (true) break;

case 27:
//C
this.state = 28;
 BA.debugLineNum = 450;BA.debugLine="holeTLN";
Debug.ShouldStop(2);
__ref.runClassMethod (b4a.example.screenmain.class, "_holetln" /*RemoteObject*/ );
 if (true) break;

case 28:
//C
this.state = -1;
;
 BA.debugLineNum = 452;BA.debugLine="End Sub";
Debug.ShouldStop(8);
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
public static RemoteObject  _initialize(RemoteObject __ref,RemoteObject _ba) throws Exception{
try {
		Debug.PushSubsStack("Initialize (screenmain) ","screenmain",2,__ref.getField(false, "ba"),__ref,67);
if (RapidSub.canDelegate("initialize")) { return __ref.runUserSub(false, "screenmain","initialize", __ref, _ba);}
__ref.runVoidMethodAndSync("innerInitializeHelper", _ba);
;
 BA.debugLineNum = 67;BA.debugLine="Public Sub Initialize";
Debug.ShouldStop(4);
 BA.debugLineNum = 68;BA.debugLine="Teilnehmer.Initialize";
Debug.ShouldStop(8);
__ref.getField(false,"_teilnehmer" /*RemoteObject*/ ).runVoidMethod ("Initialize");
 BA.debugLineNum = 69;BA.debugLine="webviewData.Initialize";
Debug.ShouldStop(16);
__ref.getField(false,"_webviewdata" /*RemoteObject*/ ).runVoidMethod ("Initialize");
 BA.debugLineNum = 70;BA.debugLine="Status.Initialize";
Debug.ShouldStop(32);
__ref.getField(false,"_status" /*RemoteObject*/ ).runVoidMethod ("Initialize");
 BA.debugLineNum = 71;BA.debugLine="spnItems.Initialize";
Debug.ShouldStop(64);
__ref.getField(false,"_spnitems" /*RemoteObject*/ ).runVoidMethod ("Initialize");
 BA.debugLineNum = 72;BA.debugLine="LoadTinyDB";
Debug.ShouldStop(128);
__ref.runClassMethod (b4a.example.screenmain.class, "_loadtinydb" /*RemoteObject*/ );
 BA.debugLineNum = 73;BA.debugLine="Uhrzeit.Initialize(\"Uhrzeit\", 300000) ' 1000 * 30";
Debug.ShouldStop(256);
__ref.getField(false,"_uhrzeit" /*RemoteObject*/ ).runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(BA.ObjectToString("Uhrzeit")),(Object)(BA.numberCast(long.class, 300000)));
 BA.debugLineNum = 74;BA.debugLine="End Sub";
Debug.ShouldStop(512);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _initwertungsliste(RemoteObject __ref,RemoteObject _neueliste) throws Exception{
try {
		Debug.PushSubsStack("initWertungsliste (screenmain) ","screenmain",2,__ref.getField(false, "ba"),__ref,628);
if (RapidSub.canDelegate("initwertungsliste")) { return __ref.runUserSub(false, "screenmain","initwertungsliste", __ref, _neueliste);}
RemoteObject _plaetzesoll = RemoteObject.createImmutable(0);
RemoteObject _plaetzeist = RemoteObject.createImmutable(0);
RemoteObject _startidx = RemoteObject.createImmutable(0);
int _i = 0;
RemoteObject _diff = RemoteObject.createImmutable(0);
RemoteObject _removestart = RemoteObject.createImmutable(0);
Debug.locals.put("neueListe", _neueliste);
 BA.debugLineNum = 628;BA.debugLine="Private Sub initWertungsliste(neueListe As Boolean";
Debug.ShouldStop(524288);
 BA.debugLineNum = 629;BA.debugLine="Dim plaetzeSoll As Int = DBGet(\"VeranstaltungAnza";
Debug.ShouldStop(1048576);
_plaetzesoll = BA.numberCast(int.class, __ref.runClassMethod (b4a.example.screenmain.class, "_dbget" /*RemoteObject*/ ,(Object)(BA.ObjectToString("VeranstaltungAnzahl")),(Object)((RemoteObject.createImmutable("25")))));Debug.locals.put("plaetzesoll", _plaetzesoll);Debug.locals.put("plaetzeSoll", _plaetzesoll);
 BA.debugLineNum = 630;BA.debugLine="Dim plaetzeIst As Int = Floor(webviewData.Size /";
Debug.ShouldStop(2097152);
_plaetzeist = BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {screenmain.__c.runMethod(true,"Floor",(Object)(RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_webviewdata" /*RemoteObject*/ ).runMethod(true,"getSize"),RemoteObject.createImmutable(4)}, "/",0, 0))),RemoteObject.createImmutable(1)}, "-",1, 0));Debug.locals.put("plaetzeist", _plaetzeist);Debug.locals.put("plaetzeIst", _plaetzeist);
 BA.debugLineNum = 632;BA.debugLine="If neueListe Then";
Debug.ShouldStop(8388608);
if (_neueliste.<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 633;BA.debugLine="webviewData.Initialize";
Debug.ShouldStop(16777216);
__ref.getField(false,"_webviewdata" /*RemoteObject*/ ).runVoidMethod ("Initialize");
 BA.debugLineNum = 634;BA.debugLine="plaetzeIst = 0";
Debug.ShouldStop(33554432);
_plaetzeist = BA.numberCast(int.class, 0);Debug.locals.put("plaetzeIst", _plaetzeist);
 BA.debugLineNum = 635;BA.debugLine="webviewData.AddAll(Array As Object(\"Platz\", \"Tei";
Debug.ShouldStop(67108864);
__ref.getField(false,"_webviewdata" /*RemoteObject*/ ).runVoidMethod ("AddAll",(Object)(screenmain.__c.runMethod(false, "ArrayToList", (Object)(RemoteObject.createNewArray("Object",new int[] {4},new Object[] {RemoteObject.createImmutable(("Platz")),RemoteObject.createImmutable(("Teilnehmer")),RemoteObject.createImmutable(("Gewicht")),(RemoteObject.createImmutable("Rang"))})))));
 }else {
 BA.debugLineNum = 637;BA.debugLine="plaetzeSoll = plaetzeSoll - plaetzeIst";
Debug.ShouldStop(268435456);
_plaetzesoll = RemoteObject.solve(new RemoteObject[] {_plaetzesoll,_plaetzeist}, "-",1, 1);Debug.locals.put("plaetzeSoll", _plaetzesoll);
 };
 BA.debugLineNum = 640;BA.debugLine="If plaetzeSoll > 0 Then";
Debug.ShouldStop(-2147483648);
if (RemoteObject.solveBoolean(">",_plaetzesoll,BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 641;BA.debugLine="Dim startIdx As Int = plaetzeIst + 1";
Debug.ShouldStop(1);
_startidx = RemoteObject.solve(new RemoteObject[] {_plaetzeist,RemoteObject.createImmutable(1)}, "+",1, 1);Debug.locals.put("startidx", _startidx);Debug.locals.put("startIdx", _startidx);
 BA.debugLineNum = 642;BA.debugLine="For i = startIdx To plaetzeIst + plaetzeSoll";
Debug.ShouldStop(2);
{
final int step12 = 1;
final int limit12 = RemoteObject.solve(new RemoteObject[] {_plaetzeist,_plaetzesoll}, "+",1, 1).<Integer>get().intValue();
_i = _startidx.<Integer>get().intValue() ;
for (;(step12 > 0 && _i <= limit12) || (step12 < 0 && _i >= limit12) ;_i = ((int)(0 + _i + step12))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 643;BA.debugLine="webviewData.AddAll(Array As Object(i, \"\", 0, 0)";
Debug.ShouldStop(4);
__ref.getField(false,"_webviewdata" /*RemoteObject*/ ).runVoidMethod ("AddAll",(Object)(screenmain.__c.runMethod(false, "ArrayToList", (Object)(RemoteObject.createNewArray("Object",new int[] {4},new Object[] {RemoteObject.createImmutable((_i)),RemoteObject.createImmutable(("")),RemoteObject.createImmutable((0)),RemoteObject.createImmutable((0))})))));
 }
}Debug.locals.put("i", _i);
;
 }else 
{ BA.debugLineNum = 645;BA.debugLine="Else if plaetzeSoll < 0 Then";
Debug.ShouldStop(16);
if (RemoteObject.solveBoolean("<",_plaetzesoll,BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 646;BA.debugLine="Dim diff As Int = Abs(plaetzeSoll)";
Debug.ShouldStop(32);
_diff = BA.numberCast(int.class, screenmain.__c.runMethod(true,"Abs",(Object)(BA.numberCast(double.class, _plaetzesoll))));Debug.locals.put("diff", _diff);Debug.locals.put("diff", _diff);
 BA.debugLineNum = 647;BA.debugLine="Dim removeStart As Int = (plaetzeIst - diff) * 4";
Debug.ShouldStop(64);
_removestart = RemoteObject.solve(new RemoteObject[] {(RemoteObject.solve(new RemoteObject[] {_plaetzeist,_diff}, "-",1, 1)),RemoteObject.createImmutable(4),RemoteObject.createImmutable(4)}, "*+",1, 1);Debug.locals.put("removestart", _removestart);Debug.locals.put("removeStart", _removestart);
 BA.debugLineNum = 648;BA.debugLine="For i = 1 To diff * 4";
Debug.ShouldStop(128);
{
final int step18 = 1;
final int limit18 = RemoteObject.solve(new RemoteObject[] {_diff,RemoteObject.createImmutable(4)}, "*",0, 1).<Integer>get().intValue();
_i = 1 ;
for (;(step18 > 0 && _i <= limit18) || (step18 < 0 && _i >= limit18) ;_i = ((int)(0 + _i + step18))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 649;BA.debugLine="If webviewData.Size > removeStart Then webviewD";
Debug.ShouldStop(256);
if (RemoteObject.solveBoolean(">",__ref.getField(false,"_webviewdata" /*RemoteObject*/ ).runMethod(true,"getSize"),BA.numberCast(double.class, _removestart))) { 
__ref.getField(false,"_webviewdata" /*RemoteObject*/ ).runVoidMethod ("RemoveAt",(Object)(_removestart));};
 }
}Debug.locals.put("i", _i);
;
 }}
;
 BA.debugLineNum = 653;BA.debugLine="If Not(neueListe) And plaetzeSoll <> 0 Then";
Debug.ShouldStop(4096);
if (RemoteObject.solveBoolean(".",screenmain.__c.runMethod(true,"Not",(Object)(_neueliste))) && RemoteObject.solveBoolean("!",_plaetzesoll,BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 654;BA.debugLine="saveWertungsliste(\"saveOnly\")";
Debug.ShouldStop(8192);
__ref.runClassMethod (b4a.example.screenmain.class, "_savewertungsliste" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("saveOnly")));
 };
 BA.debugLineNum = 656;BA.debugLine="End Sub";
Debug.ShouldStop(32768);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _ladefdj(RemoteObject __ref,RemoteObject _response) throws Exception{
try {
		Debug.PushSubsStack("ladeFDJ (screenmain) ","screenmain",2,__ref.getField(false, "ba"),__ref,836);
if (RapidSub.canDelegate("ladefdj")) { return __ref.runUserSub(false, "screenmain","ladefdj", __ref, _response);}
RemoteObject _jp = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.JSONParser");
RemoteObject _fdj = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
Debug.locals.put("response", _response);
 BA.debugLineNum = 836;BA.debugLine="Private Sub ladeFDJ(response As String)";
Debug.ShouldStop(8);
 BA.debugLineNum = 837;BA.debugLine="If response <> \"\" And response <> \"null\" Then";
Debug.ShouldStop(16);
if (RemoteObject.solveBoolean("!",_response,BA.ObjectToString("")) && RemoteObject.solveBoolean("!",_response,BA.ObjectToString("null"))) { 
 BA.debugLineNum = 838;BA.debugLine="Dim jp As JSONParser";
Debug.ShouldStop(32);
_jp = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.JSONParser");Debug.locals.put("jp", _jp);
 BA.debugLineNum = 839;BA.debugLine="jp.Initialize(response)";
Debug.ShouldStop(64);
_jp.runVoidMethod ("Initialize",(Object)(_response));
 BA.debugLineNum = 840;BA.debugLine="Dim fdj As Map = jp.NextObject";
Debug.ShouldStop(128);
_fdj = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_fdj = _jp.runMethod(false,"NextObject");Debug.locals.put("fdj", _fdj);Debug.locals.put("fdj", _fdj);
 BA.debugLineNum = 841;BA.debugLine="DBPut(\"FDJTeilnehmer\", fdj.GetDefault(\"Teilnehme";
Debug.ShouldStop(256);
__ref.runClassMethod (b4a.example.screenmain.class, "_dbput" /*RemoteObject*/ ,(Object)(BA.ObjectToString("FDJTeilnehmer")),(Object)(_fdj.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("Teilnehmer"))),(Object)((RemoteObject.createImmutable(""))))));
 BA.debugLineNum = 842;BA.debugLine="DBPut(\"FDJGewicht\", fdj.GetDefault(\"Gewicht\", \"\"";
Debug.ShouldStop(512);
__ref.runClassMethod (b4a.example.screenmain.class, "_dbput" /*RemoteObject*/ ,(Object)(BA.ObjectToString("FDJGewicht")),(Object)(_fdj.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("Gewicht"))),(Object)((RemoteObject.createImmutable(""))))));
 };
 BA.debugLineNum = 844;BA.debugLine="End Sub";
Debug.ShouldStop(2048);
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
		Debug.PushSubsStack("ladeTeilnehmer (screenmain) ","screenmain",2,__ref.getField(false, "ba"),__ref,818);
if (RapidSub.canDelegate("ladeteilnehmer")) { return __ref.runUserSub(false, "screenmain","ladeteilnehmer", __ref, _response);}
RemoteObject _jp = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.JSONParser");
RemoteObject _teilnehmerliste = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _key = RemoteObject.createImmutable("");
RemoteObject _lastid = RemoteObject.createImmutable(0);
RemoteObject _currentmax = RemoteObject.createImmutable(0);
RemoteObject _tmap = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
Debug.locals.put("response", _response);
 BA.debugLineNum = 818;BA.debugLine="Private Sub ladeTeilnehmer(response As String)";
Debug.ShouldStop(131072);
 BA.debugLineNum = 819;BA.debugLine="Teilnehmer.Initialize";
Debug.ShouldStop(262144);
__ref.getField(false,"_teilnehmer" /*RemoteObject*/ ).runVoidMethod ("Initialize");
 BA.debugLineNum = 820;BA.debugLine="If response <> \"\" And response <> \"null\" Then";
Debug.ShouldStop(524288);
if (RemoteObject.solveBoolean("!",_response,BA.ObjectToString("")) && RemoteObject.solveBoolean("!",_response,BA.ObjectToString("null"))) { 
 BA.debugLineNum = 821;BA.debugLine="Dim jp As JSONParser";
Debug.ShouldStop(1048576);
_jp = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.JSONParser");Debug.locals.put("jp", _jp);
 BA.debugLineNum = 822;BA.debugLine="jp.Initialize(response)";
Debug.ShouldStop(2097152);
_jp.runVoidMethod ("Initialize",(Object)(_response));
 BA.debugLineNum = 823;BA.debugLine="Dim teilnehmerliste As Map = jp.NextObject";
Debug.ShouldStop(4194304);
_teilnehmerliste = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_teilnehmerliste = _jp.runMethod(false,"NextObject");Debug.locals.put("teilnehmerliste", _teilnehmerliste);Debug.locals.put("teilnehmerliste", _teilnehmerliste);
 BA.debugLineNum = 824;BA.debugLine="For Each key As String In teilnehmerliste.Keys";
Debug.ShouldStop(8388608);
{
final RemoteObject group6 = _teilnehmerliste.runMethod(false,"Keys");
final int groupLen6 = group6.runMethod(true,"getSize").<Integer>get()
;int index6 = 0;
;
for (; index6 < groupLen6;index6++){
_key = BA.ObjectToString(group6.runMethod(false,"Get",index6));Debug.locals.put("key", _key);
Debug.locals.put("key", _key);
 BA.debugLineNum = 825;BA.debugLine="Dim lastID As Int = key.Replace(\"t\", \"\")";
Debug.ShouldStop(16777216);
_lastid = BA.numberCast(int.class, _key.runMethod(true,"replace",(Object)(BA.ObjectToString("t")),(Object)(RemoteObject.createImmutable(""))));Debug.locals.put("lastid", _lastid);Debug.locals.put("lastID", _lastid);
 BA.debugLineNum = 826;BA.debugLine="Dim currentMax As Int = TLNlastID.Replace(\"t\",";
Debug.ShouldStop(33554432);
_currentmax = BA.numberCast(int.class, __ref.getField(true,"_tlnlastid" /*RemoteObject*/ ).runMethod(true,"replace",(Object)(BA.ObjectToString("t")),(Object)(RemoteObject.createImmutable(""))));Debug.locals.put("currentmax", _currentmax);Debug.locals.put("currentMax", _currentmax);
 BA.debugLineNum = 827;BA.debugLine="If lastID > currentMax Then TLNlastID = \"t\" & l";
Debug.ShouldStop(67108864);
if (RemoteObject.solveBoolean(">",_lastid,BA.numberCast(double.class, _currentmax))) { 
__ref.setField ("_tlnlastid" /*RemoteObject*/ ,RemoteObject.concat(RemoteObject.createImmutable("t"),_lastid));};
 BA.debugLineNum = 828;BA.debugLine="Dim tMap As Map = teilnehmerliste.Get(key)";
Debug.ShouldStop(134217728);
_tmap = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_tmap = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), _teilnehmerliste.runMethod(false,"Get",(Object)((_key))));Debug.locals.put("tmap", _tmap);Debug.locals.put("tMap", _tmap);
 BA.debugLineNum = 829;BA.debugLine="Teilnehmer.Add(tMap.GetDefault(\"Name\", \"unbenan";
Debug.ShouldStop(268435456);
__ref.getField(false,"_teilnehmer" /*RemoteObject*/ ).runVoidMethod ("Add",(Object)(_tmap.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("Name"))),(Object)((RemoteObject.createImmutable("unbenannt"))))));
 }
}Debug.locals.put("key", _key);
;
 BA.debugLineNum = 831;BA.debugLine="If Teilnehmer.Size > 0 Then Teilnehmer.Sort(True";
Debug.ShouldStop(1073741824);
if (RemoteObject.solveBoolean(">",__ref.getField(false,"_teilnehmer" /*RemoteObject*/ ).runMethod(true,"getSize"),BA.numberCast(double.class, 0))) { 
__ref.getField(false,"_teilnehmer" /*RemoteObject*/ ).runVoidMethod ("Sort",(Object)(screenmain.__c.getField(true,"True")));};
 };
 BA.debugLineNum = 833;BA.debugLine="DBPut(\"Teilnehmer\", Teilnehmer)";
Debug.ShouldStop(1);
__ref.runClassMethod (b4a.example.screenmain.class, "_dbput" /*RemoteObject*/ ,(Object)(BA.ObjectToString("Teilnehmer")),(Object)((__ref.getField(false,"_teilnehmer" /*RemoteObject*/ ).getObject())));
 BA.debugLineNum = 834;BA.debugLine="End Sub";
Debug.ShouldStop(2);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _ladewertungsliste(RemoteObject __ref,RemoteObject _dictionary) throws Exception{
try {
		Debug.PushSubsStack("ladeWertungsliste (screenmain) ","screenmain",2,__ref.getField(false, "ba"),__ref,793);
if (RapidSub.canDelegate("ladewertungsliste")) { return __ref.runUserSub(false, "screenmain","ladewertungsliste", __ref, _dictionary);}
RemoteObject _key = RemoteObject.createImmutable("");
RemoteObject _val = RemoteObject.declareNull("Object");
RemoteObject _ergebnis = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _maxanzahl = RemoteObject.createImmutable(0);
Debug.locals.put("dictionary", _dictionary);
 BA.debugLineNum = 793;BA.debugLine="Private Sub ladeWertungsliste(dictionary As Map)";
Debug.ShouldStop(16777216);
 BA.debugLineNum = 794;BA.debugLine="webviewData.Initialize";
Debug.ShouldStop(33554432);
__ref.getField(false,"_webviewdata" /*RemoteObject*/ ).runVoidMethod ("Initialize");
 BA.debugLineNum = 795;BA.debugLine="webviewData.AddAll(Array As Object(\"Platz\", \"Teil";
Debug.ShouldStop(67108864);
__ref.getField(false,"_webviewdata" /*RemoteObject*/ ).runVoidMethod ("AddAll",(Object)(screenmain.__c.runMethod(false, "ArrayToList", (Object)(RemoteObject.createNewArray("Object",new int[] {4},new Object[] {RemoteObject.createImmutable(("Platz")),RemoteObject.createImmutable(("Teilnehmer")),RemoteObject.createImmutable(("Gewicht")),(RemoteObject.createImmutable("Rang"))})))));
 BA.debugLineNum = 796;BA.debugLine="VSTNGgeschlossen = False";
Debug.ShouldStop(134217728);
__ref.setField ("_vstnggeschlossen" /*RemoteObject*/ ,screenmain.__c.getField(true,"False"));
 BA.debugLineNum = 798;BA.debugLine="For Each key As String In dictionary.Keys";
Debug.ShouldStop(536870912);
{
final RemoteObject group4 = _dictionary.runMethod(false,"Keys");
final int groupLen4 = group4.runMethod(true,"getSize").<Integer>get()
;int index4 = 0;
;
for (; index4 < groupLen4;index4++){
_key = BA.ObjectToString(group4.runMethod(false,"Get",index4));Debug.locals.put("key", _key);
Debug.locals.put("key", _key);
 BA.debugLineNum = 799;BA.debugLine="Dim val As Object = dictionary.Get(key)";
Debug.ShouldStop(1073741824);
_val = _dictionary.runMethod(false,"Get",(Object)((_key)));Debug.locals.put("val", _val);Debug.locals.put("val", _val);
 BA.debugLineNum = 800;BA.debugLine="If key = \"Status\" Then";
Debug.ShouldStop(-2147483648);
if (RemoteObject.solveBoolean("=",_key,BA.ObjectToString("Status"))) { 
 BA.debugLineNum = 801;BA.debugLine="If \"geschlossen\" = val Then VSTNGgeschlossen =";
Debug.ShouldStop(1);
if (RemoteObject.solveBoolean("=",RemoteObject.createImmutable("geschlossen"),BA.ObjectToString(_val))) { 
__ref.setField ("_vstnggeschlossen" /*RemoteObject*/ ,screenmain.__c.getField(true,"True"));};
 };
 BA.debugLineNum = 803;BA.debugLine="If key.StartsWith(\"p\") Then";
Debug.ShouldStop(4);
if (_key.runMethod(true,"startsWith",(Object)(RemoteObject.createImmutable("p"))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 804;BA.debugLine="Dim ergebnis As Map = val";
Debug.ShouldStop(8);
_ergebnis = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_ergebnis = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), _val);Debug.locals.put("ergebnis", _ergebnis);Debug.locals.put("ergebnis", _ergebnis);
 BA.debugLineNum = 805;BA.debugLine="Dim maxAnzahl As Int = DBGet(\"VeranstaltungAnza";
Debug.ShouldStop(16);
_maxanzahl = BA.numberCast(int.class, __ref.runClassMethod (b4a.example.screenmain.class, "_dbget" /*RemoteObject*/ ,(Object)(BA.ObjectToString("VeranstaltungAnzahl")),(Object)((RemoteObject.createImmutable("25")))));Debug.locals.put("maxanzahl", _maxanzahl);Debug.locals.put("maxAnzahl", _maxanzahl);
 BA.debugLineNum = 806;BA.debugLine="webviewData.Add(ergebnis.GetDefault(\"Platz\", 0)";
Debug.ShouldStop(32);
__ref.getField(false,"_webviewdata" /*RemoteObject*/ ).runVoidMethod ("Add",(Object)(_ergebnis.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("Platz"))),(Object)(RemoteObject.createImmutable((0))))));
 BA.debugLineNum = 807;BA.debugLine="webviewData.Add(ergebnis.GetDefault(\"Teilnehmer";
Debug.ShouldStop(64);
__ref.getField(false,"_webviewdata" /*RemoteObject*/ ).runVoidMethod ("Add",(Object)(_ergebnis.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("Teilnehmer"))),(Object)((RemoteObject.createImmutable(""))))));
 BA.debugLineNum = 808;BA.debugLine="webviewData.Add(ergebnis.GetDefault(\"Gewicht\",";
Debug.ShouldStop(128);
__ref.getField(false,"_webviewdata" /*RemoteObject*/ ).runVoidMethod ("Add",(Object)(_ergebnis.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("Gewicht"))),(Object)(RemoteObject.createImmutable((0))))));
 BA.debugLineNum = 809;BA.debugLine="webviewData.Add(ergebnis.GetDefault(\"Rang\", max";
Debug.ShouldStop(256);
__ref.getField(false,"_webviewdata" /*RemoteObject*/ ).runVoidMethod ("Add",(Object)(_ergebnis.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("Rang"))),(Object)((_maxanzahl)))));
 };
 }
}Debug.locals.put("key", _key);
;
 BA.debugLineNum = 813;BA.debugLine="initWertungsliste(False)";
Debug.ShouldStop(4096);
__ref.runClassMethod (b4a.example.screenmain.class, "_initwertungsliste" /*RemoteObject*/ ,(Object)(screenmain.__c.getField(true,"False")));
 BA.debugLineNum = 814;BA.debugLine="DBPut(\"webviewData\", webviewData)";
Debug.ShouldStop(8192);
__ref.runClassMethod (b4a.example.screenmain.class, "_dbput" /*RemoteObject*/ ,(Object)(BA.ObjectToString("webviewData")),(Object)((__ref.getField(false,"_webviewdata" /*RemoteObject*/ ).getObject())));
 BA.debugLineNum = 815;BA.debugLine="zeigeWertungsliste";
Debug.ShouldStop(16384);
__ref.runClassMethod (b4a.example.screenmain.class, "_zeigewertungsliste" /*RemoteObject*/ );
 BA.debugLineNum = 816;BA.debugLine="End Sub";
Debug.ShouldStop(32768);
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
		Debug.PushSubsStack("LoadTinyDB (screenmain) ","screenmain",2,__ref.getField(false, "ba"),__ref,1260);
if (RapidSub.canDelegate("loadtinydb")) { return __ref.runUserSub(false, "screenmain","loadtinydb", __ref);}
 BA.debugLineNum = 1260;BA.debugLine="Private Sub LoadTinyDB";
Debug.ShouldStop(2048);
 BA.debugLineNum = 1261;BA.debugLine="If File.Exists(File.DirInternal, DBFileName) Then";
Debug.ShouldStop(4096);
if (screenmain.__c.getField(false,"File").runMethod(true,"Exists",(Object)(screenmain.__c.getField(false,"File").runMethod(true,"getDirInternal")),(Object)(__ref.getField(true,"_dbfilename" /*RemoteObject*/ ))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 1262;BA.debugLine="DBVerein = File.ReadMap(File.DirInternal, DBFile";
Debug.ShouldStop(8192);
__ref.setField ("_dbverein" /*RemoteObject*/ ,screenmain.__c.getField(false,"File").runMethod(false,"ReadMap",(Object)(screenmain.__c.getField(false,"File").runMethod(true,"getDirInternal")),(Object)(__ref.getField(true,"_dbfilename" /*RemoteObject*/ ))));
 }else {
 BA.debugLineNum = 1264;BA.debugLine="DBVerein.Initialize";
Debug.ShouldStop(32768);
__ref.getField(false,"_dbverein" /*RemoteObject*/ ).runVoidMethod ("Initialize");
 };
 BA.debugLineNum = 1266;BA.debugLine="End Sub";
Debug.ShouldStop(131072);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _lsvname_itemclick(RemoteObject __ref,RemoteObject _position,RemoteObject _value) throws Exception{
try {
		Debug.PushSubsStack("lsvName_ItemClick (screenmain) ","screenmain",2,__ref.getField(false, "ba"),__ref,1170);
if (RapidSub.canDelegate("lsvname_itemclick")) { return __ref.runUserSub(false, "screenmain","lsvname_itemclick", __ref, _position, _value);}
Debug.locals.put("Position", _position);
Debug.locals.put("Value", _value);
 BA.debugLineNum = 1170;BA.debugLine="Private Sub lsvName_ItemClick (Position As Int, Va";
Debug.ShouldStop(131072);
 BA.debugLineNum = 1171;BA.debugLine="HideKeyboard";
Debug.ShouldStop(262144);
__ref.runClassMethod (b4a.example.screenmain.class, "_hidekeyboard" /*RemoteObject*/ );
 BA.debugLineNum = 1172;BA.debugLine="dochange = False";
Debug.ShouldStop(524288);
__ref.setField ("_dochange" /*RemoteObject*/ ,screenmain.__c.getField(true,"False"));
 BA.debugLineNum = 1173;BA.debugLine="tbxTeilnehmer.Text = Value";
Debug.ShouldStop(1048576);
__ref.getField(false,"_tbxteilnehmer" /*RemoteObject*/ ).runMethodAndSync(true,"setText",BA.ObjectToCharSequence(_value));
 BA.debugLineNum = 1174;BA.debugLine="dochange = True";
Debug.ShouldStop(2097152);
__ref.setField ("_dochange" /*RemoteObject*/ ,screenmain.__c.getField(true,"True"));
 BA.debugLineNum = 1175;BA.debugLine="lsvName.Visible = False";
Debug.ShouldStop(4194304);
__ref.getField(false,"_lsvname" /*RemoteObject*/ ).runMethod(true,"setVisible",screenmain.__c.getField(true,"False"));
 BA.debugLineNum = 1176;BA.debugLine="btnSpeichern.Enabled = True";
Debug.ShouldStop(8388608);
__ref.getField(false,"_btnspeichern" /*RemoteObject*/ ).runMethod(true,"setEnabled",screenmain.__c.getField(true,"True"));
 BA.debugLineNum = 1177;BA.debugLine="btnSpeichern.TextColor = colorgreen";
Debug.ShouldStop(16777216);
__ref.getField(false,"_btnspeichern" /*RemoteObject*/ ).runMethod(true,"setTextColor",__ref.getField(true,"_colorgreen" /*RemoteObject*/ ));
 BA.debugLineNum = 1178;BA.debugLine="startTimer";
Debug.ShouldStop(33554432);
__ref.runClassMethod (b4a.example.screenmain.class, "_starttimer" /*RemoteObject*/ );
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
public static RemoteObject  _opensettingspage(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("OpenSettingsPage (screenmain) ","screenmain",2,__ref.getField(false, "ba"),__ref,987);
if (RapidSub.canDelegate("opensettingspage")) { return __ref.runUserSub(false, "screenmain","opensettingspage", __ref);}
 BA.debugLineNum = 987;BA.debugLine="Private Sub OpenSettingsPage";
Debug.ShouldStop(67108864);
 BA.debugLineNum = 988;BA.debugLine="B4XPages.ShowPage(\"Settings\")";
Debug.ShouldStop(134217728);
screenmain._b4xpages.runVoidMethod ("_showpage" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("Settings")));
 BA.debugLineNum = 989;BA.debugLine="ToastMessageShow(\"Wechsel zu Settings\", False)";
Debug.ShouldStop(268435456);
screenmain.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence("Wechsel zu Settings")),(Object)(screenmain.__c.getField(true,"False")));
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
public static RemoteObject  _patchtextweb(RemoteObject __ref,RemoteObject _text) throws Exception{
try {
		Debug.PushSubsStack("PatchTextWeb (screenmain) ","screenmain",2,__ref.getField(false, "ba"),__ref,868);
if (RapidSub.canDelegate("patchtextweb")) { return __ref.runUserSub(false, "screenmain","patchtextweb", __ref, _text);}
Debug.locals.put("text", _text);
 BA.debugLineNum = 868;BA.debugLine="Private Sub PatchTextWeb(text As String)";
Debug.ShouldStop(8);
 BA.debugLineNum = 869;BA.debugLine="If True = Status.GetDefault(\"ProgOffline\", True)";
Debug.ShouldStop(16);
if (RemoteObject.solveBoolean("=",screenmain.__c.getField(true,"True"),BA.ObjectToBoolean(__ref.getField(false,"_status" /*RemoteObject*/ ).runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("ProgOffline"))),(Object)((screenmain.__c.getField(true,"True"))))))) { 
 BA.debugLineNum = 870;BA.debugLine="GotTextOffline";
Debug.ShouldStop(32);
__ref.runClassMethod (b4a.example.screenmain.class, "_gottextoffline" /*RemoteObject*/ );
 }else {
 BA.debugLineNum = 872;BA.debugLine="ExecuteHttp(\"PATCH\", CurrentWebUrl, text)";
Debug.ShouldStop(128);
__ref.runClassMethod (b4a.example.screenmain.class, "_executehttp" /*void*/ ,(Object)(BA.ObjectToString("PATCH")),(Object)(__ref.getField(true,"_currentweburl" /*RemoteObject*/ )),(Object)(_text));
 };
 BA.debugLineNum = 874;BA.debugLine="End Sub";
Debug.ShouldStop(512);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _puttextweb(RemoteObject __ref,RemoteObject _text) throws Exception{
try {
		Debug.PushSubsStack("PutTextWeb (screenmain) ","screenmain",2,__ref.getField(false, "ba"),__ref,860);
if (RapidSub.canDelegate("puttextweb")) { return __ref.runUserSub(false, "screenmain","puttextweb", __ref, _text);}
Debug.locals.put("text", _text);
 BA.debugLineNum = 860;BA.debugLine="Private Sub PutTextWeb(text As String)";
Debug.ShouldStop(134217728);
 BA.debugLineNum = 861;BA.debugLine="If True = Status.GetDefault(\"ProgOffline\", True)";
Debug.ShouldStop(268435456);
if (RemoteObject.solveBoolean("=",screenmain.__c.getField(true,"True"),BA.ObjectToBoolean(__ref.getField(false,"_status" /*RemoteObject*/ ).runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("ProgOffline"))),(Object)((screenmain.__c.getField(true,"True"))))))) { 
 BA.debugLineNum = 862;BA.debugLine="GotTextOffline";
Debug.ShouldStop(536870912);
__ref.runClassMethod (b4a.example.screenmain.class, "_gottextoffline" /*RemoteObject*/ );
 }else {
 BA.debugLineNum = 864;BA.debugLine="ExecuteHttp(\"PUT\", CurrentWebUrl, text)";
Debug.ShouldStop(-2147483648);
__ref.runClassMethod (b4a.example.screenmain.class, "_executehttp" /*void*/ ,(Object)(BA.ObjectToString("PUT")),(Object)(__ref.getField(true,"_currentweburl" /*RemoteObject*/ )),(Object)(_text));
 };
 BA.debugLineNum = 866;BA.debugLine="End Sub";
Debug.ShouldStop(2);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _runjs(RemoteObject __ref,RemoteObject _jscode) throws Exception{
try {
		Debug.PushSubsStack("RunJS (screenmain) ","screenmain",2,__ref.getField(false, "ba"),__ref,574);
if (RapidSub.canDelegate("runjs")) { return __ref.runUserSub(false, "screenmain","runjs", __ref, _jscode);}
RemoteObject _jo = RemoteObject.declareNull("anywheresoftware.b4j.object.JavaObject");
Debug.locals.put("jsCode", _jscode);
 BA.debugLineNum = 574;BA.debugLine="Private Sub RunJS(jsCode As String)";
Debug.ShouldStop(536870912);
 BA.debugLineNum = 575;BA.debugLine="Dim jo As JavaObject = webErgebnis";
Debug.ShouldStop(1073741824);
_jo = RemoteObject.createNew ("anywheresoftware.b4j.object.JavaObject");
_jo = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.object.JavaObject"), __ref.getField(false,"_webergebnis" /*RemoteObject*/ ).getObject());Debug.locals.put("jo", _jo);Debug.locals.put("jo", _jo);
 BA.debugLineNum = 576;BA.debugLine="jo.RunMethod(\"evaluateJavascript\", Array As Objec";
Debug.ShouldStop(-2147483648);
_jo.runVoidMethod ("RunMethod",(Object)(BA.ObjectToString("evaluateJavascript")),(Object)(RemoteObject.createNewArray("Object",new int[] {2},new Object[] {(_jscode),screenmain.__c.getField(false,"Null")})));
 BA.debugLineNum = 577;BA.debugLine="End Sub";
Debug.ShouldStop(1);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _savefdj(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("saveFDJ (screenmain) ","screenmain",2,__ref.getField(false, "ba"),__ref,736);
if (RapidSub.canDelegate("savefdj")) { return __ref.runUserSub(false, "screenmain","savefdj", __ref);}
RemoteObject _verdatum = RemoteObject.createImmutable("");
RemoteObject _parts = null;
RemoteObject _body = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _jg = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.JSONParser.JSONGenerator");
 BA.debugLineNum = 736;BA.debugLine="Private Sub saveFDJ";
Debug.ShouldStop(-2147483648);
 BA.debugLineNum = 737;BA.debugLine="DBdatenTyp = \"FDJ\"";
Debug.ShouldStop(1);
__ref.setField ("_dbdatentyp" /*RemoteObject*/ ,BA.ObjectToString("FDJ"));
 BA.debugLineNum = 738;BA.debugLine="Dim verDatum As String = DBGet(\"VeranstaltungDatu";
Debug.ShouldStop(2);
_verdatum = BA.ObjectToString(__ref.runClassMethod (b4a.example.screenmain.class, "_dbget" /*RemoteObject*/ ,(Object)(BA.ObjectToString("VeranstaltungDatum")),(Object)((RemoteObject.createImmutable("00.00.0000")))));Debug.locals.put("verdatum", _verdatum);Debug.locals.put("verDatum", _verdatum);
 BA.debugLineNum = 739;BA.debugLine="Dim parts() As String = Regex.Split(\"\\.\", verDatu";
Debug.ShouldStop(4);
_parts = screenmain.__c.getField(false,"Regex").runMethod(false,"Split",(Object)(BA.ObjectToString("\\.")),(Object)(_verdatum));Debug.locals.put("parts", _parts);Debug.locals.put("parts", _parts);
 BA.debugLineNum = 740;BA.debugLine="CurrentWebUrl = URLfdj.Replace(\"[xxxx]\", parts(2)";
Debug.ShouldStop(8);
__ref.setField ("_currentweburl" /*RemoteObject*/ ,RemoteObject.concat(__ref.getField(true,"_urlfdj" /*RemoteObject*/ ).runMethod(true,"replace",(Object)(BA.ObjectToString("[xxxx]")),(Object)(_parts.getArrayElement(true,BA.numberCast(int.class, 2)))),RemoteObject.createImmutable(".json?auth="),__ref.getField(false,"_status" /*RemoteObject*/ ).runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("idToken"))),(Object)((RemoteObject.createImmutable(""))))));
 BA.debugLineNum = 742;BA.debugLine="Dim body As Map = CreateMap( _ 		\"Gewicht\": DBGet";
Debug.ShouldStop(32);
_body = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_body = screenmain.__c.runMethod(false, "createMap", (Object)(new RemoteObject[] {RemoteObject.createImmutable(("Gewicht")),__ref.runClassMethod (b4a.example.screenmain.class, "_dbget" /*RemoteObject*/ ,(Object)(BA.ObjectToString("FDJGewicht")),(Object)((RemoteObject.createImmutable("0")))),RemoteObject.createImmutable(("Teilnehmer")),__ref.runClassMethod (b4a.example.screenmain.class, "_dbget" /*RemoteObject*/ ,(Object)(BA.ObjectToString("FDJTeilnehmer")),(Object)((RemoteObject.createImmutable("- noch offen -"))))}));Debug.locals.put("body", _body);Debug.locals.put("body", _body);
 BA.debugLineNum = 745;BA.debugLine="DBPut(\"letzteÄnderung\", CreateMap(\"Änderung\": Tru";
Debug.ShouldStop(256);
__ref.runClassMethod (b4a.example.screenmain.class, "_dbput" /*RemoteObject*/ ,(Object)(BA.ObjectToString("letzteÄnderung")),(Object)((screenmain.__c.runMethod(false, "createMap", (Object)(new RemoteObject[] {RemoteObject.createImmutable(("Änderung")),(screenmain.__c.getField(true,"True")),RemoteObject.createImmutable(("Datum")),(__ref.runClassMethod (b4a.example.screenmain.class, "_zeitstempel" /*RemoteObject*/ ))})).getObject())));
 BA.debugLineNum = 747;BA.debugLine="Dim jg As JSONGenerator";
Debug.ShouldStop(1024);
_jg = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.JSONParser.JSONGenerator");Debug.locals.put("jg", _jg);
 BA.debugLineNum = 748;BA.debugLine="jg.Initialize(body)";
Debug.ShouldStop(2048);
_jg.runVoidMethod ("Initialize",(Object)(_body));
 BA.debugLineNum = 749;BA.debugLine="PatchTextWeb(jg.ToString)";
Debug.ShouldStop(4096);
__ref.runClassMethod (b4a.example.screenmain.class, "_patchtextweb" /*RemoteObject*/ ,(Object)(_jg.runMethod(true,"ToString")));
 BA.debugLineNum = 750;BA.debugLine="End Sub";
Debug.ShouldStop(8192);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _savewertungsliste(RemoteObject __ref,RemoteObject _savetyp) throws Exception{
try {
		Debug.PushSubsStack("saveWertungsliste (screenmain) ","screenmain",2,__ref.getField(false, "ba"),__ref,703);
if (RapidSub.canDelegate("savewertungsliste")) { return __ref.runUserSub(false, "screenmain","savewertungsliste", __ref, _savetyp);}
RemoteObject _verdatum = RemoteObject.createImmutable("");
RemoteObject _key = null;
RemoteObject _body = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
int _i = 0;
RemoteObject _platzval = RemoteObject.createImmutable(0);
RemoteObject _padded = RemoteObject.createImmutable("");
RemoteObject _id = RemoteObject.createImmutable("");
RemoteObject _eintrag = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _jg = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.JSONParser.JSONGenerator");
Debug.locals.put("saveTyp", _savetyp);
 BA.debugLineNum = 703;BA.debugLine="Private Sub saveWertungsliste(saveTyp As String)";
Debug.ShouldStop(1073741824);
 BA.debugLineNum = 704;BA.debugLine="DBdatenTyp = saveTyp";
Debug.ShouldStop(-2147483648);
__ref.setField ("_dbdatentyp" /*RemoteObject*/ ,_savetyp);
 BA.debugLineNum = 705;BA.debugLine="Dim verDatum As String = DBGet(\"VeranstaltungDatu";
Debug.ShouldStop(1);
_verdatum = BA.ObjectToString(__ref.runClassMethod (b4a.example.screenmain.class, "_dbget" /*RemoteObject*/ ,(Object)(BA.ObjectToString("VeranstaltungDatum")),(Object)((__ref.runClassMethod (b4a.example.screenmain.class, "_formatdatecustom" /*RemoteObject*/ ,(Object)(screenmain.__c.getField(false,"DateTime").runMethod(true,"getNow")),(Object)(RemoteObject.createImmutable("dd.MM.yyyy")))))));Debug.locals.put("verdatum", _verdatum);Debug.locals.put("verDatum", _verdatum);
 BA.debugLineNum = 706;BA.debugLine="Dim key() As String = Regex.Split(\"\\.\", verDatum)";
Debug.ShouldStop(2);
_key = screenmain.__c.getField(false,"Regex").runMethod(false,"Split",(Object)(BA.ObjectToString("\\.")),(Object)(_verdatum));Debug.locals.put("key", _key);Debug.locals.put("key", _key);
 BA.debugLineNum = 707;BA.debugLine="CurrentWebUrl = URLErgebnisse & \"e\" & key(2) & ke";
Debug.ShouldStop(4);
__ref.setField ("_currentweburl" /*RemoteObject*/ ,RemoteObject.concat(__ref.getField(true,"_urlergebnisse" /*RemoteObject*/ ),RemoteObject.createImmutable("e"),_key.getArrayElement(true,BA.numberCast(int.class, 2)),_key.getArrayElement(true,BA.numberCast(int.class, 1)),_key.getArrayElement(true,BA.numberCast(int.class, 0)),RemoteObject.createImmutable(".json?auth="),__ref.getField(false,"_status" /*RemoteObject*/ ).runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("idToken"))),(Object)((RemoteObject.createImmutable(""))))));
 BA.debugLineNum = 709;BA.debugLine="Dim body As Map";
Debug.ShouldStop(16);
_body = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("body", _body);
 BA.debugLineNum = 710;BA.debugLine="body.Initialize";
Debug.ShouldStop(32);
_body.runVoidMethod ("Initialize");
 BA.debugLineNum = 711;BA.debugLine="body.Put(\"Datum\", lblDatum.Text)";
Debug.ShouldStop(64);
_body.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("Datum"))),(Object)((__ref.getField(false,"_lbldatum" /*RemoteObject*/ ).runMethod(true,"getText"))));
 BA.debugLineNum = 712;BA.debugLine="body.Put(\"Name\", lblVeranstaltung.Text)";
Debug.ShouldStop(128);
_body.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("Name"))),(Object)((__ref.getField(false,"_lblveranstaltung" /*RemoteObject*/ ).runMethod(true,"getText"))));
 BA.debugLineNum = 713;BA.debugLine="body.Put(\"Status\", \"offen\")";
Debug.ShouldStop(256);
_body.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("Status"))),(Object)((RemoteObject.createImmutable("offen"))));
 BA.debugLineNum = 715;BA.debugLine="For i = 4 To webviewData.Size - 1 Step 4";
Debug.ShouldStop(1024);
{
final int step10 = 4;
final int limit10 = RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_webviewdata" /*RemoteObject*/ ).runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 4 ;
for (;(step10 > 0 && _i <= limit10) || (step10 < 0 && _i >= limit10) ;_i = ((int)(0 + _i + step10))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 716;BA.debugLine="Dim platzVal As Int = webviewData.Get(i)";
Debug.ShouldStop(2048);
_platzval = BA.numberCast(int.class, __ref.getField(false,"_webviewdata" /*RemoteObject*/ ).runMethod(false,"Get",(Object)(BA.numberCast(int.class, _i))));Debug.locals.put("platzval", _platzval);Debug.locals.put("platzVal", _platzval);
 BA.debugLineNum = 717;BA.debugLine="Dim padded As String = \"0000\" & platzVal";
Debug.ShouldStop(4096);
_padded = RemoteObject.concat(RemoteObject.createImmutable("0000"),_platzval);Debug.locals.put("padded", _padded);Debug.locals.put("padded", _padded);
 BA.debugLineNum = 718;BA.debugLine="Dim id As String = \"p\" & padded.SubString(padded";
Debug.ShouldStop(8192);
_id = RemoteObject.concat(RemoteObject.createImmutable("p"),_padded.runMethod(true,"substring",(Object)(RemoteObject.solve(new RemoteObject[] {_padded.runMethod(true,"length"),RemoteObject.createImmutable(4)}, "-",1, 1))));Debug.locals.put("id", _id);Debug.locals.put("id", _id);
 BA.debugLineNum = 720;BA.debugLine="Dim eintrag As Map = CreateMap( _ 			\"Platz\": pl";
Debug.ShouldStop(32768);
_eintrag = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_eintrag = screenmain.__c.runMethod(false, "createMap", (Object)(new RemoteObject[] {RemoteObject.createImmutable(("Platz")),(_platzval),RemoteObject.createImmutable(("Teilnehmer")),__ref.getField(false,"_webviewdata" /*RemoteObject*/ ).runMethod(false,"Get",(Object)(RemoteObject.solve(new RemoteObject[] {RemoteObject.createImmutable(_i),RemoteObject.createImmutable(1)}, "+",1, 1))),RemoteObject.createImmutable(("Gewicht")),__ref.getField(false,"_webviewdata" /*RemoteObject*/ ).runMethod(false,"Get",(Object)(RemoteObject.solve(new RemoteObject[] {RemoteObject.createImmutable(_i),RemoteObject.createImmutable(2)}, "+",1, 1))),RemoteObject.createImmutable(("Rang")),__ref.getField(false,"_webviewdata" /*RemoteObject*/ ).runMethod(false,"Get",(Object)(RemoteObject.solve(new RemoteObject[] {RemoteObject.createImmutable(_i),RemoteObject.createImmutable(3)}, "+",1, 1)))}));Debug.locals.put("eintrag", _eintrag);Debug.locals.put("eintrag", _eintrag);
 BA.debugLineNum = 725;BA.debugLine="body.Put(id, eintrag)";
Debug.ShouldStop(1048576);
_body.runVoidMethod ("Put",(Object)((_id)),(Object)((_eintrag.getObject())));
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 728;BA.debugLine="DBPut(\"letzteÄnderung\", CreateMap(\"Änderung\": Tru";
Debug.ShouldStop(8388608);
__ref.runClassMethod (b4a.example.screenmain.class, "_dbput" /*RemoteObject*/ ,(Object)(BA.ObjectToString("letzteÄnderung")),(Object)((screenmain.__c.runMethod(false, "createMap", (Object)(new RemoteObject[] {RemoteObject.createImmutable(("Änderung")),(screenmain.__c.getField(true,"True")),RemoteObject.createImmutable(("Datum")),(__ref.runClassMethod (b4a.example.screenmain.class, "_zeitstempel" /*RemoteObject*/ ))})).getObject())));
 BA.debugLineNum = 729;BA.debugLine="DBPut(\"webviewData\", webviewData)";
Debug.ShouldStop(16777216);
__ref.runClassMethod (b4a.example.screenmain.class, "_dbput" /*RemoteObject*/ ,(Object)(BA.ObjectToString("webviewData")),(Object)((__ref.getField(false,"_webviewdata" /*RemoteObject*/ ).getObject())));
 BA.debugLineNum = 731;BA.debugLine="Dim jg As JSONGenerator";
Debug.ShouldStop(67108864);
_jg = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.JSONParser.JSONGenerator");Debug.locals.put("jg", _jg);
 BA.debugLineNum = 732;BA.debugLine="jg.Initialize(body)";
Debug.ShouldStop(134217728);
_jg.runVoidMethod ("Initialize",(Object)(_body));
 BA.debugLineNum = 733;BA.debugLine="PutTextWeb(jg.ToString)";
Debug.ShouldStop(268435456);
__ref.runClassMethod (b4a.example.screenmain.class, "_puttextweb" /*RemoteObject*/ ,(Object)(_jg.runMethod(true,"ToString")));
 BA.debugLineNum = 734;BA.debugLine="End Sub";
Debug.ShouldStop(536870912);
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
		Debug.PushSubsStack("SetButtonImageSafe (screenmain) ","screenmain",2,__ref.getField(false, "ba"),__ref,373);
if (RapidSub.canDelegate("setbuttonimagesafe")) { return __ref.runUserSub(false, "screenmain","setbuttonimagesafe", __ref, _btn, _filename, _fallbacktext);}
Debug.locals.put("btn", _btn);
Debug.locals.put("fileName", _filename);
Debug.locals.put("fallbackText", _fallbacktext);
 BA.debugLineNum = 373;BA.debugLine="Private Sub SetButtonImageSafe(btn As Button, file";
Debug.ShouldStop(1048576);
 BA.debugLineNum = 374;BA.debugLine="If File.Exists(File.DirAssets, fileName) Then";
Debug.ShouldStop(2097152);
if (screenmain.__c.getField(false,"File").runMethod(true,"Exists",(Object)(screenmain.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(_filename)).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 375;BA.debugLine="btn.SetBackgroundImage(LoadBitmap(File.DirAssets";
Debug.ShouldStop(4194304);
_btn.runVoidMethod ("SetBackgroundImageNew",(Object)((screenmain.__c.runMethod(false,"LoadBitmap",(Object)(screenmain.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(_filename)).getObject())));
 }else {
 BA.debugLineNum = 377;BA.debugLine="btn.Text = fallbackText";
Debug.ShouldStop(16777216);
_btn.runMethod(true,"setText",BA.ObjectToCharSequence(_fallbacktext));
 };
 BA.debugLineNum = 379;BA.debugLine="End Sub";
Debug.ShouldStop(67108864);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setupwebviewbridge(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("SetupWebViewBridge (screenmain) ","screenmain",2,__ref.getField(false, "ba"),__ref,382);
if (RapidSub.canDelegate("setupwebviewbridge")) { return __ref.runUserSub(false, "screenmain","setupwebviewbridge", __ref);}
RemoteObject _jo = RemoteObject.declareNull("anywheresoftware.b4j.object.JavaObject");
 BA.debugLineNum = 382;BA.debugLine="Private Sub SetupWebViewBridge";
Debug.ShouldStop(536870912);
 BA.debugLineNum = 383;BA.debugLine="Dim jo As JavaObject = webErgebnis";
Debug.ShouldStop(1073741824);
_jo = RemoteObject.createNew ("anywheresoftware.b4j.object.JavaObject");
_jo = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.object.JavaObject"), __ref.getField(false,"_webergebnis" /*RemoteObject*/ ).getObject());Debug.locals.put("jo", _jo);Debug.locals.put("jo", _jo);
 BA.debugLineNum = 384;BA.debugLine="jo.RunMethod(\"addJavascriptInterface\", Array As O";
Debug.ShouldStop(-2147483648);
_jo.runVoidMethod ("RunMethod",(Object)(BA.ObjectToString("addJavascriptInterface")),(Object)(RemoteObject.createNewArray("Object",new int[] {2},new Object[] {__ref,(RemoteObject.createImmutable("AppInventor"))})));
 BA.debugLineNum = 385;BA.debugLine="End Sub";
Debug.ShouldStop(1);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setwebviewstring(RemoteObject __ref,RemoteObject _val) throws Exception{
try {
		Debug.PushSubsStack("setWebViewString (screenmain) ","screenmain",2,__ref.getField(false, "ba"),__ref,393);
if (RapidSub.canDelegate("setwebviewstring")) { return __ref.runUserSub(false, "screenmain","setwebviewstring", __ref, _val);}
Debug.locals.put("val", _val);
 BA.debugLineNum = 393;BA.debugLine="Public Sub setWebViewString(val As String)";
Debug.ShouldStop(256);
 BA.debugLineNum = 394;BA.debugLine="CallSubDelayed2(Me, \"webErgebnis_WebViewStringCha";
Debug.ShouldStop(512);
screenmain.__c.runVoidMethod ("CallSubDelayed2",__ref.getField(false, "ba"),(Object)(__ref),(Object)(BA.ObjectToString("webErgebnis_WebViewStringChange")),(Object)((_val)));
 BA.debugLineNum = 395;BA.debugLine="End Sub";
Debug.ShouldStop(1024);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setzefdj(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("setzeFDJ (screenmain) ","screenmain",2,__ref.getField(false, "ba"),__ref,579);
if (RapidSub.canDelegate("setzefdj")) { return __ref.runUserSub(false, "screenmain","setzefdj", __ref);}
RemoteObject _gewicht = RemoteObject.createImmutable("");
RemoteObject _tlnname = RemoteObject.createImmutable("");
 BA.debugLineNum = 579;BA.debugLine="Private Sub setzeFDJ";
Debug.ShouldStop(4);
 BA.debugLineNum = 580;BA.debugLine="Dim gewicht As String = DBGet(\"FDJGewicht\", \"0\")";
Debug.ShouldStop(8);
_gewicht = BA.ObjectToString(__ref.runClassMethod (b4a.example.screenmain.class, "_dbget" /*RemoteObject*/ ,(Object)(BA.ObjectToString("FDJGewicht")),(Object)((RemoteObject.createImmutable("0")))));Debug.locals.put("gewicht", _gewicht);Debug.locals.put("gewicht", _gewicht);
 BA.debugLineNum = 581;BA.debugLine="Dim tlnName As String = DBGet(\"FDJTeilnehmer\", \"-";
Debug.ShouldStop(16);
_tlnname = BA.ObjectToString(__ref.runClassMethod (b4a.example.screenmain.class, "_dbget" /*RemoteObject*/ ,(Object)(BA.ObjectToString("FDJTeilnehmer")),(Object)((RemoteObject.createImmutable("- noch offen -")))));Debug.locals.put("tlnname", _tlnname);Debug.locals.put("tlnName", _tlnname);
 BA.debugLineNum = 582;BA.debugLine="RunJS(\"setzeFDJ(\" & QUOTE & gewicht & QUOTE & \",\"";
Debug.ShouldStop(32);
__ref.runClassMethod (b4a.example.screenmain.class, "_runjs" /*RemoteObject*/ ,(Object)(RemoteObject.concat(RemoteObject.createImmutable("setzeFDJ("),screenmain.__c.getField(true,"QUOTE"),_gewicht,screenmain.__c.getField(true,"QUOTE"),RemoteObject.createImmutable(","),screenmain.__c.getField(true,"QUOTE"),_tlnname,screenmain.__c.getField(true,"QUOTE"),RemoteObject.createImmutable(");"))));
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
public static RemoteObject  _setzeheaderfromdb(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("setzeHeaderfromDB (screenmain) ","screenmain",2,__ref.getField(false, "ba"),__ref,491);
if (RapidSub.canDelegate("setzeheaderfromdb")) { return __ref.runUserSub(false, "screenmain","setzeheaderfromdb", __ref);}
 BA.debugLineNum = 491;BA.debugLine="Private Sub setzeHeaderfromDB";
Debug.ShouldStop(1024);
 BA.debugLineNum = 492;BA.debugLine="lblVerein.Text = DBGet(\"Bezeichnung\", \"- nicht ge";
Debug.ShouldStop(2048);
__ref.getField(false,"_lblverein" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToCharSequence(__ref.runClassMethod (b4a.example.screenmain.class, "_dbget" /*RemoteObject*/ ,(Object)(BA.ObjectToString("Bezeichnung")),(Object)((RemoteObject.createImmutable("- nicht gesetzt -"))))));
 BA.debugLineNum = 493;BA.debugLine="lblVeranstaltung.Text = DBGet(\"VeranstaltungName\"";
Debug.ShouldStop(4096);
__ref.getField(false,"_lblveranstaltung" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToCharSequence(__ref.runClassMethod (b4a.example.screenmain.class, "_dbget" /*RemoteObject*/ ,(Object)(BA.ObjectToString("VeranstaltungName")),(Object)((RemoteObject.createImmutable("- nicht gesetzt -"))))));
 BA.debugLineNum = 494;BA.debugLine="lblDatum.Text = DBGet(\"VeranstaltungDatum\", \"- ni";
Debug.ShouldStop(8192);
__ref.getField(false,"_lbldatum" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToCharSequence(__ref.runClassMethod (b4a.example.screenmain.class, "_dbget" /*RemoteObject*/ ,(Object)(BA.ObjectToString("VeranstaltungDatum")),(Object)((RemoteObject.createImmutable("- nicht gesetzt -"))))));
 BA.debugLineNum = 495;BA.debugLine="End Sub";
Debug.ShouldStop(16384);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setzeoffline(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("setzeOffline (screenmain) ","screenmain",2,__ref.getField(false, "ba"),__ref,971);
if (RapidSub.canDelegate("setzeoffline")) { return __ref.runUserSub(false, "screenmain","setzeoffline", __ref);}
 BA.debugLineNum = 971;BA.debugLine="Private Sub setzeOffline";
Debug.ShouldStop(1024);
 BA.debugLineNum = 972;BA.debugLine="Status.Put(\"ProgOffline\", True)";
Debug.ShouldStop(2048);
__ref.getField(false,"_status" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("ProgOffline"))),(Object)((screenmain.__c.getField(true,"True"))));
 BA.debugLineNum = 973;BA.debugLine="MsgboxAsync(\"Die Datenbank ist nicht mehr erreich";
Debug.ShouldStop(4096);
screenmain.__c.runVoidMethod ("MsgboxAsync",(Object)(BA.ObjectToCharSequence("Die Datenbank ist nicht mehr erreichbar. Kein Problem! Das Programm arbeitet offline und synchronisiert sich später mit der Datenbank. Es ist jedoch nur die zuletzt verwendete Wertungsliste verfügbar!")),(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("Internet-Verbindung nicht möglich!"))),__ref.getField(false, "ba"));
 BA.debugLineNum = 974;BA.debugLine="btnCloseVstng.Enabled = False";
Debug.ShouldStop(8192);
__ref.getField(false,"_btnclosevstng" /*RemoteObject*/ ).runMethod(true,"setEnabled",screenmain.__c.getField(true,"False"));
 BA.debugLineNum = 975;BA.debugLine="SetButtonImageSafe(btnCloseVstng, \"disconnected.p";
Debug.ShouldStop(16384);
__ref.runClassMethod (b4a.example.screenmain.class, "_setbuttonimagesafe" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_btnclosevstng" /*RemoteObject*/ )),(Object)(BA.ObjectToString("disconnected.png")),(Object)(RemoteObject.createImmutable("⚠")));
 BA.debugLineNum = 976;BA.debugLine="btnSettings.Visible = False";
Debug.ShouldStop(32768);
__ref.getField(false,"_btnsettings" /*RemoteObject*/ ).runMethod(true,"setVisible",screenmain.__c.getField(true,"False"));
 BA.debugLineNum = 977;BA.debugLine="End Sub";
Debug.ShouldStop(65536);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setzeplatz(RemoteObject __ref,RemoteObject _pid) throws Exception{
try {
		Debug.PushSubsStack("setzePlatz (screenmain) ","screenmain",2,__ref.getField(false, "ba"),__ref,506);
if (RapidSub.canDelegate("setzeplatz")) { return __ref.runUserSub(false, "screenmain","setzeplatz", __ref, _pid);}
RemoteObject _baseidx = RemoteObject.createImmutable(0);
RemoteObject _tname = RemoteObject.createImmutable("");
RemoteObject _pstr = RemoteObject.createImmutable("");
RemoteObject _spnidx = RemoteObject.createImmutable(0);
RemoteObject _maxanzahl = RemoteObject.createImmutable(0);
Debug.locals.put("pid", _pid);
 BA.debugLineNum = 506;BA.debugLine="Private Sub setzePlatz(pid As Int)";
Debug.ShouldStop(33554432);
 BA.debugLineNum = 507;BA.debugLine="dochange = False";
Debug.ShouldStop(67108864);
__ref.setField ("_dochange" /*RemoteObject*/ ,screenmain.__c.getField(true,"False"));
 BA.debugLineNum = 508;BA.debugLine="lsvName.Clear";
Debug.ShouldStop(134217728);
__ref.getField(false,"_lsvname" /*RemoteObject*/ ).runVoidMethod ("Clear");
 BA.debugLineNum = 509;BA.debugLine="lsvName.Visible = False";
Debug.ShouldStop(268435456);
__ref.getField(false,"_lsvname" /*RemoteObject*/ ).runMethod(true,"setVisible",screenmain.__c.getField(true,"False"));
 BA.debugLineNum = 512;BA.debugLine="Dim baseIdx As Int = pid * 4";
Debug.ShouldStop(-2147483648);
_baseidx = RemoteObject.solve(new RemoteObject[] {_pid,RemoteObject.createImmutable(4)}, "*",0, 1);Debug.locals.put("baseidx", _baseidx);Debug.locals.put("baseIdx", _baseidx);
 BA.debugLineNum = 513;BA.debugLine="If webviewData.Size > baseIdx + 2 Then";
Debug.ShouldStop(1);
if (RemoteObject.solveBoolean(">",__ref.getField(false,"_webviewdata" /*RemoteObject*/ ).runMethod(true,"getSize"),BA.numberCast(double.class, RemoteObject.solve(new RemoteObject[] {_baseidx,RemoteObject.createImmutable(2)}, "+",1, 1)))) { 
 BA.debugLineNum = 514;BA.debugLine="Dim tName As String = webviewData.Get(baseIdx +";
Debug.ShouldStop(2);
_tname = BA.ObjectToString(__ref.getField(false,"_webviewdata" /*RemoteObject*/ ).runMethod(false,"Get",(Object)(RemoteObject.solve(new RemoteObject[] {_baseidx,RemoteObject.createImmutable(1)}, "+",1, 1))));Debug.locals.put("tname", _tname);Debug.locals.put("tName", _tname);
 BA.debugLineNum = 515;BA.debugLine="tbxTeilnehmer.Text = tName.Trim";
Debug.ShouldStop(4);
__ref.getField(false,"_tbxteilnehmer" /*RemoteObject*/ ).runMethodAndSync(true,"setText",BA.ObjectToCharSequence(_tname.runMethod(true,"trim")));
 BA.debugLineNum = 516;BA.debugLine="tbxGramm.Text = webviewData.Get(baseIdx + 2)";
Debug.ShouldStop(8);
__ref.getField(false,"_tbxgramm" /*RemoteObject*/ ).runMethodAndSync(true,"setText",BA.ObjectToCharSequence(__ref.getField(false,"_webviewdata" /*RemoteObject*/ ).runMethod(false,"Get",(Object)(RemoteObject.solve(new RemoteObject[] {_baseidx,RemoteObject.createImmutable(2)}, "+",1, 1)))));
 BA.debugLineNum = 518;BA.debugLine="Dim pStr As String = webviewData.Get(baseIdx)";
Debug.ShouldStop(32);
_pstr = BA.ObjectToString(__ref.getField(false,"_webviewdata" /*RemoteObject*/ ).runMethod(false,"Get",(Object)(_baseidx)));Debug.locals.put("pstr", _pstr);Debug.locals.put("pStr", _pstr);
 BA.debugLineNum = 519;BA.debugLine="Dim spnIdx As Int = spnItems.IndexOf(pStr.Trim)";
Debug.ShouldStop(64);
_spnidx = __ref.getField(false,"_spnitems" /*RemoteObject*/ ).runMethod(true,"IndexOf",(Object)((_pstr.runMethod(true,"trim"))));Debug.locals.put("spnidx", _spnidx);Debug.locals.put("spnIdx", _spnidx);
 BA.debugLineNum = 520;BA.debugLine="If spnIdx >= 0 Then spnPlatz.SelectedIndex = spn";
Debug.ShouldStop(128);
if (RemoteObject.solveBoolean("g",_spnidx,BA.numberCast(double.class, 0))) { 
__ref.getField(false,"_spnplatz" /*RemoteObject*/ ).runMethod(true,"setSelectedIndex",_spnidx);};
 };
 BA.debugLineNum = 523;BA.debugLine="tbxTeilnehmer.Enabled = True";
Debug.ShouldStop(1024);
__ref.getField(false,"_tbxteilnehmer" /*RemoteObject*/ ).runMethod(true,"setEnabled",screenmain.__c.getField(true,"True"));
 BA.debugLineNum = 524;BA.debugLine="tbxGramm.Enabled = True";
Debug.ShouldStop(2048);
__ref.getField(false,"_tbxgramm" /*RemoteObject*/ ).runMethod(true,"setEnabled",screenmain.__c.getField(true,"True"));
 BA.debugLineNum = 525;BA.debugLine="spnPlatz.Enabled = True";
Debug.ShouldStop(4096);
__ref.getField(false,"_spnplatz" /*RemoteObject*/ ).runMethod(true,"setEnabled",screenmain.__c.getField(true,"True"));
 BA.debugLineNum = 527;BA.debugLine="If tbxTeilnehmer.Text.Trim <> \"\" Then";
Debug.ShouldStop(16384);
if (RemoteObject.solveBoolean("!",__ref.getField(false,"_tbxteilnehmer" /*RemoteObject*/ ).runMethod(true,"getText").runMethod(true,"trim"),BA.ObjectToString(""))) { 
 BA.debugLineNum = 528;BA.debugLine="btnFDJeingabe.Enabled = True";
Debug.ShouldStop(32768);
__ref.getField(false,"_btnfdjeingabe" /*RemoteObject*/ ).runMethod(true,"setEnabled",screenmain.__c.getField(true,"True"));
 BA.debugLineNum = 529;BA.debugLine="btnFDJeingabe.TextColor = colorgreen";
Debug.ShouldStop(65536);
__ref.getField(false,"_btnfdjeingabe" /*RemoteObject*/ ).runMethod(true,"setTextColor",__ref.getField(true,"_colorgreen" /*RemoteObject*/ ));
 };
 BA.debugLineNum = 531;BA.debugLine="If pid > 1 Then";
Debug.ShouldStop(262144);
if (RemoteObject.solveBoolean(">",_pid,BA.numberCast(double.class, 1))) { 
 BA.debugLineNum = 532;BA.debugLine="btnMinus.Enabled = True";
Debug.ShouldStop(524288);
__ref.getField(false,"_btnminus" /*RemoteObject*/ ).runMethod(true,"setEnabled",screenmain.__c.getField(true,"True"));
 BA.debugLineNum = 533;BA.debugLine="btnMinus.TextColor = colorgreen";
Debug.ShouldStop(1048576);
__ref.getField(false,"_btnminus" /*RemoteObject*/ ).runMethod(true,"setTextColor",__ref.getField(true,"_colorgreen" /*RemoteObject*/ ));
 };
 BA.debugLineNum = 535;BA.debugLine="Dim maxAnzahl As Int = DBGet(\"VeranstaltungAnzahl";
Debug.ShouldStop(4194304);
_maxanzahl = BA.numberCast(int.class, __ref.runClassMethod (b4a.example.screenmain.class, "_dbget" /*RemoteObject*/ ,(Object)(BA.ObjectToString("VeranstaltungAnzahl")),(Object)((RemoteObject.createImmutable("25")))));Debug.locals.put("maxanzahl", _maxanzahl);Debug.locals.put("maxAnzahl", _maxanzahl);
 BA.debugLineNum = 536;BA.debugLine="If pid < maxAnzahl Then";
Debug.ShouldStop(8388608);
if (RemoteObject.solveBoolean("<",_pid,BA.numberCast(double.class, _maxanzahl))) { 
 BA.debugLineNum = 537;BA.debugLine="btnPlus.Enabled = True";
Debug.ShouldStop(16777216);
__ref.getField(false,"_btnplus" /*RemoteObject*/ ).runMethod(true,"setEnabled",screenmain.__c.getField(true,"True"));
 BA.debugLineNum = 538;BA.debugLine="btnPlus.TextColor = colorgreen";
Debug.ShouldStop(33554432);
__ref.getField(false,"_btnplus" /*RemoteObject*/ ).runMethod(true,"setTextColor",__ref.getField(true,"_colorgreen" /*RemoteObject*/ ));
 };
 BA.debugLineNum = 540;BA.debugLine="If False = Status.GetDefault(\"ProgOffline\", True)";
Debug.ShouldStop(134217728);
if (RemoteObject.solveBoolean("=",screenmain.__c.getField(true,"False"),BA.ObjectToBoolean(__ref.getField(false,"_status" /*RemoteObject*/ ).runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("ProgOffline"))),(Object)((screenmain.__c.getField(true,"True"))))))) { 
 BA.debugLineNum = 541;BA.debugLine="btnCloseVstng.Enabled = True";
Debug.ShouldStop(268435456);
__ref.getField(false,"_btnclosevstng" /*RemoteObject*/ ).runMethod(true,"setEnabled",screenmain.__c.getField(true,"True"));
 };
 BA.debugLineNum = 544;BA.debugLine="dochange = True";
Debug.ShouldStop(-2147483648);
__ref.setField ("_dochange" /*RemoteObject*/ ,screenmain.__c.getField(true,"True"));
 BA.debugLineNum = 545;BA.debugLine="tbxTeilnehmer.RequestFocus";
Debug.ShouldStop(1);
__ref.getField(false,"_tbxteilnehmer" /*RemoteObject*/ ).runVoidMethod ("RequestFocus");
 BA.debugLineNum = 546;BA.debugLine="End Sub";
Debug.ShouldStop(2);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _speichern(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("speichern (screenmain) ","screenmain",2,__ref.getField(false, "ba"),__ref,687);
if (RapidSub.canDelegate("speichern")) { return __ref.runUserSub(false, "screenmain","speichern", __ref);}
RemoteObject _val = RemoteObject.createImmutable(0);
RemoteObject _position = RemoteObject.createImmutable(0);
 BA.debugLineNum = 687;BA.debugLine="Private Sub speichern";
Debug.ShouldStop(16384);
 BA.debugLineNum = 688;BA.debugLine="If Not(IsNumber(tbxGramm.Text)) Then";
Debug.ShouldStop(32768);
if (screenmain.__c.runMethod(true,"Not",(Object)(screenmain.__c.runMethod(true,"IsNumber",(Object)(__ref.getField(false,"_tbxgramm" /*RemoteObject*/ ).runMethod(true,"getText"))))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 689;BA.debugLine="tbxGramm.Text = \"0\"";
Debug.ShouldStop(65536);
__ref.getField(false,"_tbxgramm" /*RemoteObject*/ ).runMethodAndSync(true,"setText",BA.ObjectToCharSequence("0"));
 }else {
 BA.debugLineNum = 691;BA.debugLine="Dim val As Double = tbxGramm.Text";
Debug.ShouldStop(262144);
_val = BA.numberCast(double.class, __ref.getField(false,"_tbxgramm" /*RemoteObject*/ ).runMethod(true,"getText"));Debug.locals.put("val", _val);Debug.locals.put("val", _val);
 BA.debugLineNum = 692;BA.debugLine="tbxGramm.Text = NumberFormat2(val, 1, 0, 0, Fals";
Debug.ShouldStop(524288);
__ref.getField(false,"_tbxgramm" /*RemoteObject*/ ).runMethodAndSync(true,"setText",BA.ObjectToCharSequence(screenmain.__c.runMethod(true,"NumberFormat2",(Object)(_val),(Object)(BA.numberCast(int.class, 1)),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(screenmain.__c.getField(true,"False")))));
 };
 BA.debugLineNum = 695;BA.debugLine="Dim position As Int = PlatzSelected * 4 ' 0-basie";
Debug.ShouldStop(4194304);
_position = RemoteObject.solve(new RemoteObject[] {__ref.getField(true,"_platzselected" /*RemoteObject*/ ),RemoteObject.createImmutable(4)}, "*",0, 1);Debug.locals.put("position", _position);Debug.locals.put("position", _position);
 BA.debugLineNum = 696;BA.debugLine="If webviewData.Size > position + 2 Then";
Debug.ShouldStop(8388608);
if (RemoteObject.solveBoolean(">",__ref.getField(false,"_webviewdata" /*RemoteObject*/ ).runMethod(true,"getSize"),BA.numberCast(double.class, RemoteObject.solve(new RemoteObject[] {_position,RemoteObject.createImmutable(2)}, "+",1, 1)))) { 
 BA.debugLineNum = 697;BA.debugLine="webviewData.Set(position + 2, tbxGramm.Text)";
Debug.ShouldStop(16777216);
__ref.getField(false,"_webviewdata" /*RemoteObject*/ ).runVoidMethod ("Set",(Object)(RemoteObject.solve(new RemoteObject[] {_position,RemoteObject.createImmutable(2)}, "+",1, 1)),(Object)((__ref.getField(false,"_tbxgramm" /*RemoteObject*/ ).runMethod(true,"getText"))));
 BA.debugLineNum = 698;BA.debugLine="webviewData.Set(position + 1, tbxTeilnehmer.Text";
Debug.ShouldStop(33554432);
__ref.getField(false,"_webviewdata" /*RemoteObject*/ ).runVoidMethod ("Set",(Object)(RemoteObject.solve(new RemoteObject[] {_position,RemoteObject.createImmutable(1)}, "+",1, 1)),(Object)((__ref.getField(false,"_tbxteilnehmer" /*RemoteObject*/ ).runMethod(true,"getText").runMethod(true,"trim"))));
 };
 BA.debugLineNum = 700;BA.debugLine="saveWertungsliste(\"saveWertungsliste\")";
Debug.ShouldStop(134217728);
__ref.runClassMethod (b4a.example.screenmain.class, "_savewertungsliste" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("saveWertungsliste")));
 BA.debugLineNum = 701;BA.debugLine="End Sub";
Debug.ShouldStop(268435456);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _spnplatz_itemclick(RemoteObject __ref,RemoteObject _position,RemoteObject _value) throws Exception{
try {
		Debug.PushSubsStack("spnPlatz_ItemClick (screenmain) ","screenmain",2,__ref.getField(false, "ba"),__ref,1008);
if (RapidSub.canDelegate("spnplatz_itemclick")) { return __ref.runUserSub(false, "screenmain","spnplatz_itemclick", __ref, _position, _value);}
Debug.locals.put("Position", _position);
Debug.locals.put("Value", _value);
 BA.debugLineNum = 1008;BA.debugLine="Private Sub spnPlatz_ItemClick (Position As Int, V";
Debug.ShouldStop(32768);
 BA.debugLineNum = 1009;BA.debugLine="PlatzSelected = Value";
Debug.ShouldStop(65536);
__ref.setField ("_platzselected" /*RemoteObject*/ ,BA.numberCast(int.class, _value));
 BA.debugLineNum = 1010;BA.debugLine="btnSpeichern.Enabled = True";
Debug.ShouldStop(131072);
__ref.getField(false,"_btnspeichern" /*RemoteObject*/ ).runMethod(true,"setEnabled",screenmain.__c.getField(true,"True"));
 BA.debugLineNum = 1011;BA.debugLine="btnSpeichern.TextColor = colorgreen";
Debug.ShouldStop(262144);
__ref.getField(false,"_btnspeichern" /*RemoteObject*/ ).runMethod(true,"setTextColor",__ref.getField(true,"_colorgreen" /*RemoteObject*/ ));
 BA.debugLineNum = 1012;BA.debugLine="RunJS(\"selectRowById(\" & PlatzSelected & \");\")";
Debug.ShouldStop(524288);
__ref.runClassMethod (b4a.example.screenmain.class, "_runjs" /*RemoteObject*/ ,(Object)(RemoteObject.concat(RemoteObject.createImmutable("selectRowById("),__ref.getField(true,"_platzselected" /*RemoteObject*/ ),RemoteObject.createImmutable(");"))));
 BA.debugLineNum = 1013;BA.debugLine="dochange = True";
Debug.ShouldStop(1048576);
__ref.setField ("_dochange" /*RemoteObject*/ ,screenmain.__c.getField(true,"True"));
 BA.debugLineNum = 1014;BA.debugLine="startTimer";
Debug.ShouldStop(2097152);
__ref.runClassMethod (b4a.example.screenmain.class, "_starttimer" /*RemoteObject*/ );
 BA.debugLineNum = 1015;BA.debugLine="End Sub";
Debug.ShouldStop(4194304);
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
		Debug.PushSubsStack("startTimer (screenmain) ","screenmain",2,__ref.getField(false, "ba"),__ref,1231);
if (RapidSub.canDelegate("starttimer")) { return __ref.runUserSub(false, "screenmain","starttimer", __ref);}
 BA.debugLineNum = 1231;BA.debugLine="Private Sub startTimer";
Debug.ShouldStop(16384);
 BA.debugLineNum = 1232;BA.debugLine="Uhrzeit.Enabled = False";
Debug.ShouldStop(32768);
__ref.getField(false,"_uhrzeit" /*RemoteObject*/ ).runMethod(true,"setEnabled",screenmain.__c.getField(true,"False"));
 BA.debugLineNum = 1233;BA.debugLine="Uhrzeit.Interval = 1000 * 300";
Debug.ShouldStop(65536);
__ref.getField(false,"_uhrzeit" /*RemoteObject*/ ).runMethod(true,"setInterval",BA.numberCast(long.class, RemoteObject.solve(new RemoteObject[] {RemoteObject.createImmutable(1000),RemoteObject.createImmutable(300)}, "*",0, 1)));
 BA.debugLineNum = 1234;BA.debugLine="Uhrzeit.Enabled = True";
Debug.ShouldStop(131072);
__ref.getField(false,"_uhrzeit" /*RemoteObject*/ ).runMethod(true,"setEnabled",screenmain.__c.getField(true,"True"));
 BA.debugLineNum = 1235;BA.debugLine="End Sub";
Debug.ShouldStop(262144);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _tbxfdjgewicht_focuschanged(RemoteObject __ref,RemoteObject _hasfocus) throws Exception{
try {
		Debug.PushSubsStack("tbxFDJgewicht_FocusChanged (screenmain) ","screenmain",2,__ref.getField(false, "ba"),__ref,1205);
if (RapidSub.canDelegate("tbxfdjgewicht_focuschanged")) { return __ref.runUserSub(false, "screenmain","tbxfdjgewicht_focuschanged", __ref, _hasfocus);}
Debug.locals.put("HasFocus", _hasfocus);
 BA.debugLineNum = 1205;BA.debugLine="Private Sub tbxFDJgewicht_FocusChanged (HasFocus A";
Debug.ShouldStop(1048576);
 BA.debugLineNum = 1206;BA.debugLine="If HasFocus Then";
Debug.ShouldStop(2097152);
if (_hasfocus.<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 1207;BA.debugLine="tbxFDJgewicht.SelectionStart = tbxFDJgewicht.Tex";
Debug.ShouldStop(4194304);
__ref.getField(false,"_tbxfdjgewicht" /*RemoteObject*/ ).runMethod(true,"setSelectionStart",__ref.getField(false,"_tbxfdjgewicht" /*RemoteObject*/ ).runMethod(true,"getText").runMethod(true,"length"));
 }else {
 BA.debugLineNum = 1209;BA.debugLine="HideKeyboard";
Debug.ShouldStop(16777216);
__ref.runClassMethod (b4a.example.screenmain.class, "_hidekeyboard" /*RemoteObject*/ );
 };
 BA.debugLineNum = 1211;BA.debugLine="End Sub";
Debug.ShouldStop(67108864);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _tbxfdjgewicht_textchanged(RemoteObject __ref,RemoteObject _old,RemoteObject _new) throws Exception{
try {
		Debug.PushSubsStack("tbxFDJgewicht_TextChanged (screenmain) ","screenmain",2,__ref.getField(false, "ba"),__ref,1213);
if (RapidSub.canDelegate("tbxfdjgewicht_textchanged")) { return __ref.runUserSub(false, "screenmain","tbxfdjgewicht_textchanged", __ref, _old, _new);}
RemoteObject _val = RemoteObject.createImmutable(0);
Debug.locals.put("Old", _old);
Debug.locals.put("New", _new);
 BA.debugLineNum = 1213;BA.debugLine="Private Sub tbxFDJgewicht_TextChanged (Old As Stri";
Debug.ShouldStop(268435456);
 BA.debugLineNum = 1214;BA.debugLine="If dochange Then";
Debug.ShouldStop(536870912);
if (__ref.getField(true,"_dochange" /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 1215;BA.debugLine="dochange = False";
Debug.ShouldStop(1073741824);
__ref.setField ("_dochange" /*RemoteObject*/ ,screenmain.__c.getField(true,"False"));
 BA.debugLineNum = 1216;BA.debugLine="If IsNumber(tbxFDJgewicht.Text) Then";
Debug.ShouldStop(-2147483648);
if (screenmain.__c.runMethod(true,"IsNumber",(Object)(__ref.getField(false,"_tbxfdjgewicht" /*RemoteObject*/ ).runMethod(true,"getText"))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 1217;BA.debugLine="Dim val As Int = Abs(tbxFDJgewicht.Text)";
Debug.ShouldStop(1);
_val = BA.numberCast(int.class, screenmain.__c.runMethod(true,"Abs",(Object)(BA.numberCast(double.class, __ref.getField(false,"_tbxfdjgewicht" /*RemoteObject*/ ).runMethod(true,"getText")))));Debug.locals.put("val", _val);Debug.locals.put("val", _val);
 BA.debugLineNum = 1218;BA.debugLine="tbxFDJgewicht.Text = val";
Debug.ShouldStop(2);
__ref.getField(false,"_tbxfdjgewicht" /*RemoteObject*/ ).runMethodAndSync(true,"setText",BA.ObjectToCharSequence(_val));
 BA.debugLineNum = 1219;BA.debugLine="btnFDJsave.Enabled = True";
Debug.ShouldStop(4);
__ref.getField(false,"_btnfdjsave" /*RemoteObject*/ ).runMethod(true,"setEnabled",screenmain.__c.getField(true,"True"));
 BA.debugLineNum = 1220;BA.debugLine="btnFDJsave.TextColor = colorgreen";
Debug.ShouldStop(8);
__ref.getField(false,"_btnfdjsave" /*RemoteObject*/ ).runMethod(true,"setTextColor",__ref.getField(true,"_colorgreen" /*RemoteObject*/ ));
 };
 BA.debugLineNum = 1222;BA.debugLine="tbxFDJgewicht.SelectionStart = tbxFDJgewicht.Tex";
Debug.ShouldStop(32);
__ref.getField(false,"_tbxfdjgewicht" /*RemoteObject*/ ).runMethod(true,"setSelectionStart",__ref.getField(false,"_tbxfdjgewicht" /*RemoteObject*/ ).runMethod(true,"getText").runMethod(true,"length"));
 BA.debugLineNum = 1223;BA.debugLine="dochange = True";
Debug.ShouldStop(64);
__ref.setField ("_dochange" /*RemoteObject*/ ,screenmain.__c.getField(true,"True"));
 };
 BA.debugLineNum = 1225;BA.debugLine="startTimer";
Debug.ShouldStop(256);
__ref.runClassMethod (b4a.example.screenmain.class, "_starttimer" /*RemoteObject*/ );
 BA.debugLineNum = 1226;BA.debugLine="End Sub";
Debug.ShouldStop(512);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _tbxgramm_focuschanged(RemoteObject __ref,RemoteObject _hasfocus) throws Exception{
try {
		Debug.PushSubsStack("tbxGramm_FocusChanged (screenmain) ","screenmain",2,__ref.getField(false, "ba"),__ref,1182);
if (RapidSub.canDelegate("tbxgramm_focuschanged")) { return __ref.runUserSub(false, "screenmain","tbxgramm_focuschanged", __ref, _hasfocus);}
Debug.locals.put("HasFocus", _hasfocus);
 BA.debugLineNum = 1182;BA.debugLine="Private Sub tbxGramm_FocusChanged (HasFocus As Boo";
Debug.ShouldStop(536870912);
 BA.debugLineNum = 1183;BA.debugLine="If HasFocus Then";
Debug.ShouldStop(1073741824);
if (_hasfocus.<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 1184;BA.debugLine="tbxGramm.SelectionStart = tbxGramm.Text.Length";
Debug.ShouldStop(-2147483648);
__ref.getField(false,"_tbxgramm" /*RemoteObject*/ ).runMethod(true,"setSelectionStart",__ref.getField(false,"_tbxgramm" /*RemoteObject*/ ).runMethod(true,"getText").runMethod(true,"length"));
 }else {
 BA.debugLineNum = 1186;BA.debugLine="HideKeyboard";
Debug.ShouldStop(2);
__ref.runClassMethod (b4a.example.screenmain.class, "_hidekeyboard" /*RemoteObject*/ );
 };
 BA.debugLineNum = 1188;BA.debugLine="End Sub";
Debug.ShouldStop(8);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _tbxgramm_textchanged(RemoteObject __ref,RemoteObject _old,RemoteObject _new) throws Exception{
try {
		Debug.PushSubsStack("tbxGramm_TextChanged (screenmain) ","screenmain",2,__ref.getField(false, "ba"),__ref,1190);
if (RapidSub.canDelegate("tbxgramm_textchanged")) { return __ref.runUserSub(false, "screenmain","tbxgramm_textchanged", __ref, _old, _new);}
RemoteObject _val = RemoteObject.createImmutable(0);
Debug.locals.put("Old", _old);
Debug.locals.put("New", _new);
 BA.debugLineNum = 1190;BA.debugLine="Private Sub tbxGramm_TextChanged (Old As String, N";
Debug.ShouldStop(32);
 BA.debugLineNum = 1191;BA.debugLine="If dochange Then";
Debug.ShouldStop(64);
if (__ref.getField(true,"_dochange" /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 1192;BA.debugLine="dochange = False";
Debug.ShouldStop(128);
__ref.setField ("_dochange" /*RemoteObject*/ ,screenmain.__c.getField(true,"False"));
 BA.debugLineNum = 1193;BA.debugLine="If IsNumber(tbxGramm.Text) Then";
Debug.ShouldStop(256);
if (screenmain.__c.runMethod(true,"IsNumber",(Object)(__ref.getField(false,"_tbxgramm" /*RemoteObject*/ ).runMethod(true,"getText"))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 1194;BA.debugLine="Dim val As Int = Abs(tbxGramm.Text)";
Debug.ShouldStop(512);
_val = BA.numberCast(int.class, screenmain.__c.runMethod(true,"Abs",(Object)(BA.numberCast(double.class, __ref.getField(false,"_tbxgramm" /*RemoteObject*/ ).runMethod(true,"getText")))));Debug.locals.put("val", _val);Debug.locals.put("val", _val);
 BA.debugLineNum = 1195;BA.debugLine="tbxGramm.Text = val";
Debug.ShouldStop(1024);
__ref.getField(false,"_tbxgramm" /*RemoteObject*/ ).runMethodAndSync(true,"setText",BA.ObjectToCharSequence(_val));
 BA.debugLineNum = 1196;BA.debugLine="btnSpeichern.Enabled = True";
Debug.ShouldStop(2048);
__ref.getField(false,"_btnspeichern" /*RemoteObject*/ ).runMethod(true,"setEnabled",screenmain.__c.getField(true,"True"));
 BA.debugLineNum = 1197;BA.debugLine="btnSpeichern.TextColor = colorgreen";
Debug.ShouldStop(4096);
__ref.getField(false,"_btnspeichern" /*RemoteObject*/ ).runMethod(true,"setTextColor",__ref.getField(true,"_colorgreen" /*RemoteObject*/ ));
 };
 BA.debugLineNum = 1199;BA.debugLine="tbxGramm.SelectionStart = tbxGramm.Text.Length";
Debug.ShouldStop(16384);
__ref.getField(false,"_tbxgramm" /*RemoteObject*/ ).runMethod(true,"setSelectionStart",__ref.getField(false,"_tbxgramm" /*RemoteObject*/ ).runMethod(true,"getText").runMethod(true,"length"));
 BA.debugLineNum = 1200;BA.debugLine="dochange = True";
Debug.ShouldStop(32768);
__ref.setField ("_dochange" /*RemoteObject*/ ,screenmain.__c.getField(true,"True"));
 };
 BA.debugLineNum = 1202;BA.debugLine="startTimer";
Debug.ShouldStop(131072);
__ref.runClassMethod (b4a.example.screenmain.class, "_starttimer" /*RemoteObject*/ );
 BA.debugLineNum = 1203;BA.debugLine="End Sub";
Debug.ShouldStop(262144);
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
		Debug.PushSubsStack("tbxTeilnehmer_FocusChanged (screenmain) ","screenmain",2,__ref.getField(false, "ba"),__ref,1092);
if (RapidSub.canDelegate("tbxteilnehmer_focuschanged")) { return __ref.runUserSub(false, "screenmain","tbxteilnehmer_focuschanged", __ref, _hasfocus);}
Debug.locals.put("HasFocus", _hasfocus);
 BA.debugLineNum = 1092;BA.debugLine="Private Sub tbxTeilnehmer_FocusChanged (HasFocus A";
Debug.ShouldStop(8);
 BA.debugLineNum = 1093;BA.debugLine="If HasFocus Then";
Debug.ShouldStop(16);
if (_hasfocus.<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 1094;BA.debugLine="tbxTeilnehmer.SelectionStart = tbxTeilnehmer.Tex";
Debug.ShouldStop(32);
__ref.getField(false,"_tbxteilnehmer" /*RemoteObject*/ ).runMethod(true,"setSelectionStart",__ref.getField(false,"_tbxteilnehmer" /*RemoteObject*/ ).runMethod(true,"getText").runMethod(true,"length"));
 BA.debugLineNum = 1095;BA.debugLine="lsvName.Visible = False";
Debug.ShouldStop(64);
__ref.getField(false,"_lsvname" /*RemoteObject*/ ).runMethod(true,"setVisible",screenmain.__c.getField(true,"False"));
 }else {
 BA.debugLineNum = 1097;BA.debugLine="lsvName.Visible = False";
Debug.ShouldStop(256);
__ref.getField(false,"_lsvname" /*RemoteObject*/ ).runMethod(true,"setVisible",screenmain.__c.getField(true,"False"));
 BA.debugLineNum = 1098;BA.debugLine="HideKeyboard";
Debug.ShouldStop(512);
__ref.runClassMethod (b4a.example.screenmain.class, "_hidekeyboard" /*RemoteObject*/ );
 };
 BA.debugLineNum = 1100;BA.debugLine="End Sub";
Debug.ShouldStop(2048);
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
		Debug.PushSubsStack("tbxTeilnehmer_TextChanged (screenmain) ","screenmain",2,__ref.getField(false, "ba"),__ref,1102);
if (RapidSub.canDelegate("tbxteilnehmer_textchanged")) { return __ref.runUserSub(false, "screenmain","tbxteilnehmer_textchanged", __ref, _old, _new);}
RemoteObject _cleaned = RemoteObject.createImmutable("");
RemoteObject _sb = RemoteObject.declareNull("anywheresoftware.b4a.keywords.StringBuilderWrapper");
RemoteObject _doupper = RemoteObject.createImmutable(false);
int _i = 0;
RemoteObject _ch = RemoteObject.createImmutable("");
RemoteObject _lsvitems = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _query = RemoteObject.createImmutable("");
RemoteObject _tname = RemoteObject.createImmutable("");
RemoteObject _item = RemoteObject.createImmutable("");
Debug.locals.put("Old", _old);
Debug.locals.put("New", _new);
 BA.debugLineNum = 1102;BA.debugLine="Private Sub tbxTeilnehmer_TextChanged (Old As Stri";
Debug.ShouldStop(8192);
 BA.debugLineNum = 1104;BA.debugLine="If lsvName.IsInitialized = False Then Return";
Debug.ShouldStop(32768);
if (RemoteObject.solveBoolean("=",__ref.getField(false,"_lsvname" /*RemoteObject*/ ).runMethod(true,"IsInitialized"),screenmain.__c.getField(true,"False"))) { 
if (true) return RemoteObject.createImmutable("");};
 BA.debugLineNum = 1106;BA.debugLine="If dochange Then";
Debug.ShouldStop(131072);
if (__ref.getField(true,"_dochange" /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 1107;BA.debugLine="dochange = False";
Debug.ShouldStop(262144);
__ref.setField ("_dochange" /*RemoteObject*/ ,screenmain.__c.getField(true,"False"));
 BA.debugLineNum = 1109;BA.debugLine="Dim cleaned As String = Regex.Replace(\"[^a-zA-Zä";
Debug.ShouldStop(1048576);
_cleaned = screenmain.__c.getField(false,"Regex").runMethod(true,"Replace",(Object)(BA.ObjectToString("[^a-zA-ZäöüÄÖÜßéèêëáàâçñ \\-.]")),(Object)(__ref.getField(false,"_tbxteilnehmer" /*RemoteObject*/ ).runMethod(true,"getText")),(Object)(RemoteObject.createImmutable("")));Debug.locals.put("cleaned", _cleaned);Debug.locals.put("cleaned", _cleaned);
 BA.debugLineNum = 1112;BA.debugLine="Dim sb As StringBuilder";
Debug.ShouldStop(8388608);
_sb = RemoteObject.createNew ("anywheresoftware.b4a.keywords.StringBuilderWrapper");Debug.locals.put("sb", _sb);
 BA.debugLineNum = 1113;BA.debugLine="sb.Initialize";
Debug.ShouldStop(16777216);
_sb.runVoidMethod ("Initialize");
 BA.debugLineNum = 1114;BA.debugLine="Dim doupper As Boolean = True";
Debug.ShouldStop(33554432);
_doupper = screenmain.__c.getField(true,"True");Debug.locals.put("doupper", _doupper);Debug.locals.put("doupper", _doupper);
 BA.debugLineNum = 1115;BA.debugLine="For i = 0 To cleaned.Length - 1";
Debug.ShouldStop(67108864);
{
final int step8 = 1;
final int limit8 = RemoteObject.solve(new RemoteObject[] {_cleaned.runMethod(true,"length"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step8 > 0 && _i <= limit8) || (step8 < 0 && _i >= limit8) ;_i = ((int)(0 + _i + step8))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 1116;BA.debugLine="Dim ch As String = cleaned.SubString2(i, i + 1)";
Debug.ShouldStop(134217728);
_ch = _cleaned.runMethod(true,"substring",(Object)(BA.numberCast(int.class, _i)),(Object)(RemoteObject.solve(new RemoteObject[] {RemoteObject.createImmutable(_i),RemoteObject.createImmutable(1)}, "+",1, 1)));Debug.locals.put("ch", _ch);Debug.locals.put("ch", _ch);
 BA.debugLineNum = 1117;BA.debugLine="If ch = \" \" Or ch = \"-\" Then";
Debug.ShouldStop(268435456);
if (RemoteObject.solveBoolean("=",_ch,BA.ObjectToString(" ")) || RemoteObject.solveBoolean("=",_ch,BA.ObjectToString("-"))) { 
 BA.debugLineNum = 1118;BA.debugLine="doupper = True";
Debug.ShouldStop(536870912);
_doupper = screenmain.__c.getField(true,"True");Debug.locals.put("doupper", _doupper);
 BA.debugLineNum = 1119;BA.debugLine="sb.Append(ch)";
Debug.ShouldStop(1073741824);
_sb.runVoidMethod ("Append",(Object)(_ch));
 }else 
{ BA.debugLineNum = 1120;BA.debugLine="Else if ch = \",\" Then";
Debug.ShouldStop(-2147483648);
if (RemoteObject.solveBoolean("=",_ch,BA.ObjectToString(","))) { 
 }else 
{ BA.debugLineNum = 1122;BA.debugLine="Else if doupper Then";
Debug.ShouldStop(2);
if (_doupper.<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 1123;BA.debugLine="sb.Append(ch.ToUpperCase)";
Debug.ShouldStop(4);
_sb.runVoidMethod ("Append",(Object)(_ch.runMethod(true,"toUpperCase")));
 BA.debugLineNum = 1124;BA.debugLine="doupper = False";
Debug.ShouldStop(8);
_doupper = screenmain.__c.getField(true,"False");Debug.locals.put("doupper", _doupper);
 }else {
 BA.debugLineNum = 1126;BA.debugLine="sb.Append(ch)";
Debug.ShouldStop(32);
_sb.runVoidMethod ("Append",(Object)(_ch));
 }}}
;
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 1129;BA.debugLine="tbxTeilnehmer.Text = sb.ToString";
Debug.ShouldStop(256);
__ref.getField(false,"_tbxteilnehmer" /*RemoteObject*/ ).runMethodAndSync(true,"setText",BA.ObjectToCharSequence(_sb.runMethod(true,"ToString")));
 BA.debugLineNum = 1130;BA.debugLine="dochange = True";
Debug.ShouldStop(512);
__ref.setField ("_dochange" /*RemoteObject*/ ,screenmain.__c.getField(true,"True"));
 };
 BA.debugLineNum = 1133;BA.debugLine="If dochange And tbxTeilnehmer.Text.Length >= 1 Th";
Debug.ShouldStop(4096);
if (RemoteObject.solveBoolean(".",__ref.getField(true,"_dochange" /*RemoteObject*/ )) && RemoteObject.solveBoolean("g",__ref.getField(false,"_tbxteilnehmer" /*RemoteObject*/ ).runMethod(true,"getText").runMethod(true,"length"),BA.numberCast(double.class, 1))) { 
 BA.debugLineNum = 1134;BA.debugLine="Dim lsvItems As List";
Debug.ShouldStop(8192);
_lsvitems = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("lsvItems", _lsvitems);
 BA.debugLineNum = 1135;BA.debugLine="lsvItems.Initialize";
Debug.ShouldStop(16384);
_lsvitems.runVoidMethod ("Initialize");
 BA.debugLineNum = 1136;BA.debugLine="Dim query As String = tbxTeilnehmer.Text.Trim.To";
Debug.ShouldStop(32768);
_query = __ref.getField(false,"_tbxteilnehmer" /*RemoteObject*/ ).runMethod(true,"getText").runMethod(true,"trim").runMethod(true,"toLowerCase");Debug.locals.put("query", _query);Debug.locals.put("query", _query);
 BA.debugLineNum = 1137;BA.debugLine="If query.Length >= 1 Then";
Debug.ShouldStop(65536);
if (RemoteObject.solveBoolean("g",_query.runMethod(true,"length"),BA.numberCast(double.class, 1))) { 
 BA.debugLineNum = 1138;BA.debugLine="For Each tName As String In Teilnehmer";
Debug.ShouldStop(131072);
{
final RemoteObject group29 = __ref.getField(false,"_teilnehmer" /*RemoteObject*/ );
final int groupLen29 = group29.runMethod(true,"getSize").<Integer>get()
;int index29 = 0;
;
for (; index29 < groupLen29;index29++){
_tname = BA.ObjectToString(group29.runMethod(false,"Get",index29));Debug.locals.put("tname", _tname);
Debug.locals.put("tname", _tname);
 BA.debugLineNum = 1139;BA.debugLine="If tName.ToLowerCase.Contains(query) Then";
Debug.ShouldStop(262144);
if (_tname.runMethod(true,"toLowerCase").runMethod(true,"contains",(Object)(_query)).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 1140;BA.debugLine="lsvItems.Add(tName)";
Debug.ShouldStop(524288);
_lsvitems.runVoidMethod ("Add",(Object)((_tname)));
 };
 }
}Debug.locals.put("tname", _tname);
;
 };
 BA.debugLineNum = 1145;BA.debugLine="If tbxTeilnehmer.Text.Trim.Length >= 2 Or tbxTei";
Debug.ShouldStop(16777216);
if (RemoteObject.solveBoolean("g",__ref.getField(false,"_tbxteilnehmer" /*RemoteObject*/ ).runMethod(true,"getText").runMethod(true,"trim").runMethod(true,"length"),BA.numberCast(double.class, 2)) || RemoteObject.solveBoolean("=",__ref.getField(false,"_tbxteilnehmer" /*RemoteObject*/ ).runMethod(true,"getText"),BA.ObjectToString(""))) { 
 BA.debugLineNum = 1146;BA.debugLine="btnSpeichern.Enabled = True";
Debug.ShouldStop(33554432);
__ref.getField(false,"_btnspeichern" /*RemoteObject*/ ).runMethod(true,"setEnabled",screenmain.__c.getField(true,"True"));
 BA.debugLineNum = 1147;BA.debugLine="btnSpeichern.TextColor = colorgreen";
Debug.ShouldStop(67108864);
__ref.getField(false,"_btnspeichern" /*RemoteObject*/ ).runMethod(true,"setTextColor",__ref.getField(true,"_colorgreen" /*RemoteObject*/ ));
 };
 BA.debugLineNum = 1150;BA.debugLine="lsvName.Clear";
Debug.ShouldStop(536870912);
__ref.getField(false,"_lsvname" /*RemoteObject*/ ).runVoidMethod ("Clear");
 BA.debugLineNum = 1151;BA.debugLine="If lsvItems.Size >= 1 Then";
Debug.ShouldStop(1073741824);
if (RemoteObject.solveBoolean("g",_lsvitems.runMethod(true,"getSize"),BA.numberCast(double.class, 1))) { 
 BA.debugLineNum = 1152;BA.debugLine="For Each item As String In lsvItems";
Debug.ShouldStop(-2147483648);
{
final RemoteObject group41 = _lsvitems;
final int groupLen41 = group41.runMethod(true,"getSize").<Integer>get()
;int index41 = 0;
;
for (; index41 < groupLen41;index41++){
_item = BA.ObjectToString(group41.runMethod(false,"Get",index41));Debug.locals.put("item", _item);
Debug.locals.put("item", _item);
 BA.debugLineNum = 1153;BA.debugLine="lsvName.AddSingleLine(item)";
Debug.ShouldStop(1);
__ref.getField(false,"_lsvname" /*RemoteObject*/ ).runVoidMethod ("AddSingleLine",(Object)(BA.ObjectToCharSequence(_item)));
 }
}Debug.locals.put("item", _item);
;
 BA.debugLineNum = 1155;BA.debugLine="lsvName.Visible = True";
Debug.ShouldStop(4);
__ref.getField(false,"_lsvname" /*RemoteObject*/ ).runMethod(true,"setVisible",screenmain.__c.getField(true,"True"));
 }else {
 BA.debugLineNum = 1157;BA.debugLine="lsvName.Visible = False";
Debug.ShouldStop(16);
__ref.getField(false,"_lsvname" /*RemoteObject*/ ).runMethod(true,"setVisible",screenmain.__c.getField(true,"False"));
 };
 }else {
 BA.debugLineNum = 1160;BA.debugLine="lsvName.Clear";
Debug.ShouldStop(128);
__ref.getField(false,"_lsvname" /*RemoteObject*/ ).runVoidMethod ("Clear");
 BA.debugLineNum = 1161;BA.debugLine="lsvName.Visible = False";
Debug.ShouldStop(256);
__ref.getField(false,"_lsvname" /*RemoteObject*/ ).runMethod(true,"setVisible",screenmain.__c.getField(true,"False"));
 BA.debugLineNum = 1162;BA.debugLine="btnSpeichern.Enabled = False";
Debug.ShouldStop(512);
__ref.getField(false,"_btnspeichern" /*RemoteObject*/ ).runMethod(true,"setEnabled",screenmain.__c.getField(true,"False"));
 BA.debugLineNum = 1163;BA.debugLine="btnSpeichern.TextColor = 0xFF888888";
Debug.ShouldStop(1024);
__ref.getField(false,"_btnspeichern" /*RemoteObject*/ ).runMethod(true,"setTextColor",BA.numberCast(int.class, ((int)0xff888888)));
 };
 BA.debugLineNum = 1166;BA.debugLine="tbxTeilnehmer.SelectionStart = tbxTeilnehmer.Text";
Debug.ShouldStop(8192);
__ref.getField(false,"_tbxteilnehmer" /*RemoteObject*/ ).runMethod(true,"setSelectionStart",__ref.getField(false,"_tbxteilnehmer" /*RemoteObject*/ ).runMethod(true,"getText").runMethod(true,"length"));
 BA.debugLineNum = 1167;BA.debugLine="startTimer";
Debug.ShouldStop(16384);
__ref.runClassMethod (b4a.example.screenmain.class, "_starttimer" /*RemoteObject*/ );
 BA.debugLineNum = 1168;BA.debugLine="End Sub";
Debug.ShouldStop(32768);
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
		Debug.PushSubsStack("Uhrzeit_Tick (screenmain) ","screenmain",2,__ref.getField(false, "ba"),__ref,1237);
if (RapidSub.canDelegate("uhrzeit_tick")) { return __ref.runUserSub(false, "screenmain","uhrzeit_tick", __ref);}
 BA.debugLineNum = 1237;BA.debugLine="Private Sub Uhrzeit_Tick";
Debug.ShouldStop(1048576);
 BA.debugLineNum = 1238;BA.debugLine="Uhrzeit.Enabled = False";
Debug.ShouldStop(2097152);
__ref.getField(false,"_uhrzeit" /*RemoteObject*/ ).runMethod(true,"setEnabled",screenmain.__c.getField(true,"False"));
 BA.debugLineNum = 1239;BA.debugLine="B4XPages.ShowPage(\"ScreenSaver\")";
Debug.ShouldStop(4194304);
screenmain._b4xpages.runVoidMethod ("_showpage" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("ScreenSaver")));
 BA.debugLineNum = 1240;BA.debugLine="ToastMessageShow(\"Timeout -> Wechsel zu ScreenSav";
Debug.ShouldStop(8388608);
screenmain.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence("Timeout -> Wechsel zu ScreenSaver")),(Object)(screenmain.__c.getField(true,"False")));
 BA.debugLineNum = 1241;BA.debugLine="End Sub";
Debug.ShouldStop(16777216);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _updatelayoutpositions(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("UpdateLayoutPositions (screenmain) ","screenmain",2,__ref.getField(false, "ba"),__ref,454);
if (RapidSub.canDelegate("updatelayoutpositions")) { return __ref.runUserSub(false, "screenmain","updatelayoutpositions", __ref);}
 BA.debugLineNum = 454;BA.debugLine="Private Sub UpdateLayoutPositions";
Debug.ShouldStop(32);
 BA.debugLineNum = 455;BA.debugLine="If vaEingabe.Visible Then";
Debug.ShouldStop(64);
if (__ref.getField(false,"_vaeingabe" /*RemoteObject*/ ).runMethod(true,"getVisible").<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 456;BA.debugLine="webErgebnis.Top = 425dip";
Debug.ShouldStop(128);
__ref.getField(false,"_webergebnis" /*RemoteObject*/ ).runMethod(true,"setTop",screenmain.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 425))));
 BA.debugLineNum = 457;BA.debugLine="webErgebnis.Height = 100%y - 425dip";
Debug.ShouldStop(256);
__ref.getField(false,"_webergebnis" /*RemoteObject*/ ).runMethod(true,"setHeight",RemoteObject.solve(new RemoteObject[] {screenmain.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 100)),__ref.getField(false, "ba")),screenmain.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 425)))}, "-",1, 1));
 }else {
 BA.debugLineNum = 459;BA.debugLine="webErgebnis.Top = 126dip";
Debug.ShouldStop(1024);
__ref.getField(false,"_webergebnis" /*RemoteObject*/ ).runMethod(true,"setTop",screenmain.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 126))));
 BA.debugLineNum = 460;BA.debugLine="webErgebnis.Height = 100%y - 126dip";
Debug.ShouldStop(2048);
__ref.getField(false,"_webergebnis" /*RemoteObject*/ ).runMethod(true,"setHeight",RemoteObject.solve(new RemoteObject[] {screenmain.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 100)),__ref.getField(false, "ba")),screenmain.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 126)))}, "-",1, 1));
 };
 BA.debugLineNum = 462;BA.debugLine="End Sub";
Debug.ShouldStop(8192);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _webergebnis_pagefinished(RemoteObject __ref,RemoteObject _url) throws Exception{
try {
		Debug.PushSubsStack("webErgebnis_PageFinished (screenmain) ","screenmain",2,__ref.getField(false, "ba"),__ref,569);
if (RapidSub.canDelegate("webergebnis_pagefinished")) { return __ref.runUserSub(false, "screenmain","webergebnis_pagefinished", __ref, _url);}
Debug.locals.put("Url", _url);
 BA.debugLineNum = 569;BA.debugLine="Private Sub webErgebnis_PageFinished (Url As Strin";
Debug.ShouldStop(16777216);
 BA.debugLineNum = 570;BA.debugLine="RunJS(\"init();\")";
Debug.ShouldStop(33554432);
__ref.runClassMethod (b4a.example.screenmain.class, "_runjs" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("init();")));
 BA.debugLineNum = 571;BA.debugLine="setzeFDJ";
Debug.ShouldStop(67108864);
__ref.runClassMethod (b4a.example.screenmain.class, "_setzefdj" /*RemoteObject*/ );
 BA.debugLineNum = 572;BA.debugLine="End Sub";
Debug.ShouldStop(134217728);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _webergebnis_webviewstringchange(RemoteObject __ref,RemoteObject _value) throws Exception{
try {
		Debug.PushSubsStack("webErgebnis_WebViewStringChange (screenmain) ","screenmain",2,__ref.getField(false, "ba"),__ref,585);
if (RapidSub.canDelegate("webergebnis_webviewstringchange")) { return __ref.runUserSub(false, "screenmain","webergebnis_webviewstringchange", __ref, _value);}
RemoteObject _rowstr = RemoteObject.createImmutable("");
RemoteObject _rowid = RemoteObject.createImmutable(0);
RemoteObject _sharetext = RemoteObject.createImmutable("");
RemoteObject _in = RemoteObject.declareNull("anywheresoftware.b4a.objects.IntentWrapper");
RemoteObject _parts = null;
RemoteObject _neueliste = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _p = RemoteObject.createImmutable("");
Debug.locals.put("value", _value);
 BA.debugLineNum = 585;BA.debugLine="Public Sub webErgebnis_WebViewStringChange(value A";
Debug.ShouldStop(256);
 BA.debugLineNum = 586;BA.debugLine="If value.StartsWith(\"rowclick\") Then";
Debug.ShouldStop(512);
if (_value.runMethod(true,"startsWith",(Object)(RemoteObject.createImmutable("rowclick"))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 587;BA.debugLine="Dim rowStr As String = value.SubString(8).Trim";
Debug.ShouldStop(1024);
_rowstr = _value.runMethod(true,"substring",(Object)(BA.numberCast(int.class, 8))).runMethod(true,"trim");Debug.locals.put("rowstr", _rowstr);Debug.locals.put("rowStr", _rowstr);
 BA.debugLineNum = 588;BA.debugLine="If IsNumber(rowStr) Then";
Debug.ShouldStop(2048);
if (screenmain.__c.runMethod(true,"IsNumber",(Object)(_rowstr)).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 589;BA.debugLine="Dim rowid As Int = rowStr";
Debug.ShouldStop(4096);
_rowid = BA.numberCast(int.class, _rowstr);Debug.locals.put("rowid", _rowid);Debug.locals.put("rowid", _rowid);
 BA.debugLineNum = 590;BA.debugLine="If rowid > 0 Then";
Debug.ShouldStop(8192);
if (RemoteObject.solveBoolean(">",_rowid,BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 591;BA.debugLine="PlatzSelected = rowid";
Debug.ShouldStop(16384);
__ref.setField ("_platzselected" /*RemoteObject*/ ,_rowid);
 BA.debugLineNum = 592;BA.debugLine="disableEingabe";
Debug.ShouldStop(32768);
__ref.runClassMethod (b4a.example.screenmain.class, "_disableeingabe" /*RemoteObject*/ );
 BA.debugLineNum = 593;BA.debugLine="clear";
Debug.ShouldStop(65536);
__ref.runClassMethod (b4a.example.screenmain.class, "_clear" /*RemoteObject*/ );
 BA.debugLineNum = 594;BA.debugLine="setzePlatz(rowid)";
Debug.ShouldStop(131072);
__ref.runClassMethod (b4a.example.screenmain.class, "_setzeplatz" /*RemoteObject*/ ,(Object)(_rowid));
 };
 };
 }else 
{ BA.debugLineNum = 597;BA.debugLine="Else if value.StartsWith(\"Print:\") Then";
Debug.ShouldStop(1048576);
if (_value.runMethod(true,"startsWith",(Object)(RemoteObject.createImmutable("Print:"))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 598;BA.debugLine="Dim shareText As String = value.Replace(\"Print:";
Debug.ShouldStop(2097152);
_sharetext = _value.runMethod(true,"replace",(Object)(BA.ObjectToString("Print: ")),(Object)(RemoteObject.concat(__ref.getField(false,"_lblverein" /*RemoteObject*/ ).runMethod(true,"getText"),screenmain.__c.getField(true,"CRLF"),__ref.getField(false,"_lblveranstaltung" /*RemoteObject*/ ).runMethod(true,"getText"),screenmain.__c.getField(true,"CRLF"),RemoteObject.createImmutable("am: "),__ref.getField(false,"_lbldatum" /*RemoteObject*/ ).runMethod(true,"getText"),screenmain.__c.getField(true,"CRLF"))));Debug.locals.put("sharetext", _sharetext);Debug.locals.put("shareText", _sharetext);
 BA.debugLineNum = 600;BA.debugLine="Dim in As Intent";
Debug.ShouldStop(8388608);
_in = RemoteObject.createNew ("anywheresoftware.b4a.objects.IntentWrapper");Debug.locals.put("in", _in);
 BA.debugLineNum = 601;BA.debugLine="in.Initialize(in.ACTION_SEND, \"\")";
Debug.ShouldStop(16777216);
_in.runVoidMethod ("Initialize",(Object)(_in.getField(true,"ACTION_SEND")),(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 602;BA.debugLine="in.SetType(\"text/plain\")";
Debug.ShouldStop(33554432);
_in.runVoidMethod ("SetType",(Object)(RemoteObject.createImmutable("text/plain")));
 BA.debugLineNum = 603;BA.debugLine="in.PutExtra(\"android.intent.extra.TEXT\", shareTe";
Debug.ShouldStop(67108864);
_in.runVoidMethod ("PutExtra",(Object)(BA.ObjectToString("android.intent.extra.TEXT")),(Object)((_sharetext)));
 BA.debugLineNum = 604;BA.debugLine="StartActivity(in)";
Debug.ShouldStop(134217728);
screenmain.__c.runVoidMethod ("StartActivity",__ref.getField(false, "ba"),(Object)((_in.getObject())));
 }else 
{ BA.debugLineNum = 605;BA.debugLine="Else if value.StartsWith(\"Height\") Then";
Debug.ShouldStop(268435456);
if (_value.runMethod(true,"startsWith",(Object)(RemoteObject.createImmutable("Height"))).<Boolean>get().booleanValue()) { 
 }else {
 BA.debugLineNum = 608;BA.debugLine="Dim parts() As String = Regex.Split(\",\", value)";
Debug.ShouldStop(-2147483648);
_parts = screenmain.__c.getField(false,"Regex").runMethod(false,"Split",(Object)(BA.ObjectToString(",")),(Object)(_value));Debug.locals.put("parts", _parts);Debug.locals.put("parts", _parts);
 BA.debugLineNum = 609;BA.debugLine="Dim neueListe As List";
Debug.ShouldStop(1);
_neueliste = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("neueListe", _neueliste);
 BA.debugLineNum = 610;BA.debugLine="neueListe.Initialize";
Debug.ShouldStop(2);
_neueliste.runVoidMethod ("Initialize");
 BA.debugLineNum = 611;BA.debugLine="For Each p As String In parts";
Debug.ShouldStop(4);
{
final RemoteObject group24 = _parts;
final int groupLen24 = group24.getField(true,"length").<Integer>get()
;int index24 = 0;
;
for (; index24 < groupLen24;index24++){
_p = group24.getArrayElement(true,RemoteObject.createImmutable(index24));Debug.locals.put("p", _p);
Debug.locals.put("p", _p);
 BA.debugLineNum = 612;BA.debugLine="neueListe.Add(p)";
Debug.ShouldStop(8);
_neueliste.runVoidMethod ("Add",(Object)((_p)));
 }
}Debug.locals.put("p", _p);
;
 BA.debugLineNum = 614;BA.debugLine="webviewData = neueListe";
Debug.ShouldStop(32);
__ref.setField ("_webviewdata" /*RemoteObject*/ ,_neueliste);
 BA.debugLineNum = 616;BA.debugLine="If VSTNGgeschlossen Then";
Debug.ShouldStop(128);
if (__ref.getField(true,"_vstnggeschlossen" /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 617;BA.debugLine="vaEingabe.Visible = False";
Debug.ShouldStop(256);
__ref.getField(false,"_vaeingabe" /*RemoteObject*/ ).runMethod(true,"setVisible",screenmain.__c.getField(true,"False"));
 BA.debugLineNum = 618;BA.debugLine="haDown.Visible = True";
Debug.ShouldStop(512);
__ref.getField(false,"_hadown" /*RemoteObject*/ ).runMethod(true,"setVisible",screenmain.__c.getField(true,"True"));
 BA.debugLineNum = 619;BA.debugLine="btnDown.Visible = False";
Debug.ShouldStop(1024);
__ref.getField(false,"_btndown" /*RemoteObject*/ ).runMethod(true,"setVisible",screenmain.__c.getField(true,"False"));
 BA.debugLineNum = 620;BA.debugLine="UpdateLayoutPositions";
Debug.ShouldStop(2048);
__ref.runClassMethod (b4a.example.screenmain.class, "_updatelayoutpositions" /*RemoteObject*/ );
 }else {
 BA.debugLineNum = 622;BA.debugLine="RunJS(\"selectRowById(\" & PlatzSelected & \");\")";
Debug.ShouldStop(8192);
__ref.runClassMethod (b4a.example.screenmain.class, "_runjs" /*RemoteObject*/ ,(Object)(RemoteObject.concat(RemoteObject.createImmutable("selectRowById("),__ref.getField(true,"_platzselected" /*RemoteObject*/ ),RemoteObject.createImmutable(");"))));
 };
 }}}
;
 BA.debugLineNum = 625;BA.debugLine="startTimer";
Debug.ShouldStop(65536);
__ref.runClassMethod (b4a.example.screenmain.class, "_starttimer" /*RemoteObject*/ );
 BA.debugLineNum = 626;BA.debugLine="End Sub";
Debug.ShouldStop(131072);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _zeigewertungsliste(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("zeigeWertungsliste (screenmain) ","screenmain",2,__ref.getField(false, "ba"),__ref,551);
if (RapidSub.canDelegate("zeigewertungsliste")) { return __ref.runUserSub(false, "screenmain","zeigewertungsliste", __ref);}
RemoteObject _sb = RemoteObject.declareNull("anywheresoftware.b4a.keywords.StringBuilderWrapper");
int _i = 0;
RemoteObject _html = RemoteObject.createImmutable("");
 BA.debugLineNum = 551;BA.debugLine="Private Sub zeigeWertungsliste";
Debug.ShouldStop(64);
 BA.debugLineNum = 553;BA.debugLine="Dim sb As StringBuilder";
Debug.ShouldStop(256);
_sb = RemoteObject.createNew ("anywheresoftware.b4a.keywords.StringBuilderWrapper");Debug.locals.put("sb", _sb);
 BA.debugLineNum = 554;BA.debugLine="sb.Initialize";
Debug.ShouldStop(512);
_sb.runVoidMethod ("Initialize");
 BA.debugLineNum = 555;BA.debugLine="For i = 0 To webviewData.Size - 1";
Debug.ShouldStop(1024);
{
final int step3 = 1;
final int limit3 = RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_webviewdata" /*RemoteObject*/ ).runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step3 > 0 && _i <= limit3) || (step3 < 0 && _i >= limit3) ;_i = ((int)(0 + _i + step3))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 556;BA.debugLine="If i > 0 Then sb.Append(\",\")";
Debug.ShouldStop(2048);
if (RemoteObject.solveBoolean(">",RemoteObject.createImmutable(_i),BA.numberCast(double.class, 0))) { 
_sb.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable(",")));};
 BA.debugLineNum = 557;BA.debugLine="sb.Append(webviewData.Get(i))";
Debug.ShouldStop(4096);
_sb.runVoidMethod ("Append",(Object)(BA.ObjectToString(__ref.getField(false,"_webviewdata" /*RemoteObject*/ ).runMethod(false,"Get",(Object)(BA.numberCast(int.class, _i))))));
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 559;BA.debugLine="CurrentWebViewString = sb.ToString";
Debug.ShouldStop(16384);
__ref.setField ("_currentwebviewstring" /*RemoteObject*/ ,_sb.runMethod(true,"ToString"));
 BA.debugLineNum = 561;BA.debugLine="If File.Exists(File.DirAssets, \"wlfb_tabelle.html";
Debug.ShouldStop(65536);
if (screenmain.__c.getField(false,"File").runMethod(true,"Exists",(Object)(screenmain.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(RemoteObject.createImmutable("wlfb_tabelle.html"))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 562;BA.debugLine="Dim html As String = File.ReadString(File.DirAss";
Debug.ShouldStop(131072);
_html = screenmain.__c.getField(false,"File").runMethod(true,"ReadString",(Object)(screenmain.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(RemoteObject.createImmutable("wlfb_tabelle.html")));Debug.locals.put("html", _html);Debug.locals.put("html", _html);
 BA.debugLineNum = 563;BA.debugLine="webErgebnis.LoadHtml(html)";
Debug.ShouldStop(262144);
__ref.getField(false,"_webergebnis" /*RemoteObject*/ ).runVoidMethod ("LoadHtml",(Object)(_html));
 }else {
 BA.debugLineNum = 565;BA.debugLine="ToastMessageShow(\"Datei wlfb_tabelle.html fehlt";
Debug.ShouldStop(1048576);
screenmain.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence("Datei wlfb_tabelle.html fehlt im Dateien-Tab!")),(Object)(screenmain.__c.getField(true,"True")));
 };
 BA.debugLineNum = 567;BA.debugLine="End Sub";
Debug.ShouldStop(4194304);
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
		Debug.PushSubsStack("Zeitstempel (screenmain) ","screenmain",2,__ref.getField(false, "ba"),__ref,1243);
if (RapidSub.canDelegate("zeitstempel")) { return __ref.runUserSub(false, "screenmain","zeitstempel", __ref);}
 BA.debugLineNum = 1243;BA.debugLine="Private Sub Zeitstempel As String";
Debug.ShouldStop(67108864);
 BA.debugLineNum = 1244;BA.debugLine="Return FormatDateCustom(DateTime.Now, \"yyyyMMddHH";
Debug.ShouldStop(134217728);
if (true) return __ref.runClassMethod (b4a.example.screenmain.class, "_formatdatecustom" /*RemoteObject*/ ,(Object)(screenmain.__c.getField(false,"DateTime").runMethod(true,"getNow")),(Object)(RemoteObject.createImmutable("yyyyMMddHHmmss")));
 BA.debugLineNum = 1245;BA.debugLine="End Sub";
Debug.ShouldStop(268435456);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}