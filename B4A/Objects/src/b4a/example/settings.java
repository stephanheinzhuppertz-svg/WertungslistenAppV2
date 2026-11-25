package b4a.example;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.debug.*;

public class settings extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    private static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new anywheresoftware.b4a.ShellBA(_ba, this, htSubs, "b4a.example.settings");
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            
        }
        if (BA.isShellModeRuntimeCheck(ba)) 
			   this.getClass().getMethod("_class_globals", b4a.example.settings.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 
    public void  innerInitializeHelper(anywheresoftware.b4a.BA _ba) throws Exception{
        innerInitialize(_ba);
    }
    public Object callSub(String sub, Object sender, Object[] args) throws Exception {
        return BA.SubDelegator.SubNotFound;
    }
public anywheresoftware.b4a.keywords.Common __c = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _root = null;
public anywheresoftware.b4a.objects.B4XViewWrapper.XUI _xui = null;
public String _urlveranstaltungen = "";
public String _urlteilnehmer = "";
public String _urlergebnisse = "";
public String _dbdatentyp = "";
public boolean _dochange = false;
public anywheresoftware.b4a.objects.collections.Map _status = null;
public anywheresoftware.b4a.objects.collections.Map _veranstaltungen = null;
public anywheresoftware.b4a.objects.collections.List _webviewvstgn = null;
public String _veranstaltung_id = "";
public String _webviewvstgn_id = "";
public String _vstgnnewid = "";
public anywheresoftware.b4a.objects.collections.List _teilnehmer = null;
public String _tlnid = "";
public String _tlnnewid = "";
public int _colorgreen = 0;
public int _colorblue = 0;
public anywheresoftware.b4a.objects.LabelWrapper _lblverein = null;
public anywheresoftware.b4a.objects.LabelWrapper _lblveranstaltung = null;
public anywheresoftware.b4a.objects.LabelWrapper _lbldatum = null;
public anywheresoftware.b4a.objects.ButtonWrapper _btnback = null;
public anywheresoftware.b4a.objects.ScrollViewWrapper _svmain = null;
public anywheresoftware.b4a.objects.LabelWrapper _lblclosed = null;
public anywheresoftware.b4a.objects.ButtonWrapper _dprdatum = null;
public anywheresoftware.b4a.objects.ButtonWrapper _btnauswahl = null;
public anywheresoftware.b4a.objects.EditTextWrapper _tbxveranstaltung = null;
public anywheresoftware.b4a.objects.EditTextWrapper _tbxanzahl = null;
public anywheresoftware.b4a.objects.ButtonWrapper _btnverstgdelete = null;
public anywheresoftware.b4a.objects.ButtonWrapper _btnverstgspeichern = null;
public b4a.example3.customlistview _lstveranstaltungen = null;
public b4a.example3.customlistview _lstteilnehmer = null;
public anywheresoftware.b4a.objects.EditTextWrapper _tbxteilnehmer = null;
public anywheresoftware.b4a.objects.ButtonWrapper _btntlndelete = null;
public anywheresoftware.b4a.objects.ButtonWrapper _btntlnspeichern = null;
public anywheresoftware.b4a.objects.Timer _uhrzeit = null;
public anywheresoftware.b4a.objects.collections.Map _dbverein = null;
public String _dbfilename = "";
public String _currentweburl = "";
public int _dpryear = 0;
public int _dprmonth = 0;
public int _dprday = 0;
public b4a.example.dateutils _dateutils = null;
public b4a.example.main _main = null;
public b4a.example.b4xpages _b4xpages = null;
public b4a.example.b4xcollections _b4xcollections = null;
public b4a.example.httputils2service _httputils2service = null;
public b4a.example.xuiviewsutils _xuiviewsutils = null;
public String  _initialize(b4a.example.settings __ref,anywheresoftware.b4a.BA _ba) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="settings";
if (Debug.shouldDelegate(ba, "initialize", false))
	 {return ((String) Debug.delegate(ba, "initialize", new Object[] {_ba}));}
RDebugUtils.currentLine=44171264;
 //BA.debugLineNum = 44171264;BA.debugLine="Public Sub Initialize";
RDebugUtils.currentLine=44171265;
 //BA.debugLineNum = 44171265;BA.debugLine="Status.Initialize";
__ref._status /*anywheresoftware.b4a.objects.collections.Map*/ .Initialize();
RDebugUtils.currentLine=44171266;
 //BA.debugLineNum = 44171266;BA.debugLine="Veranstaltungen.Initialize";
__ref._veranstaltungen /*anywheresoftware.b4a.objects.collections.Map*/ .Initialize();
RDebugUtils.currentLine=44171267;
 //BA.debugLineNum = 44171267;BA.debugLine="Teilnehmer.Initialize";
__ref._teilnehmer /*anywheresoftware.b4a.objects.collections.List*/ .Initialize();
RDebugUtils.currentLine=44171269;
 //BA.debugLineNum = 44171269;BA.debugLine="LoadTinyDB";
__ref._loadtinydb /*String*/ (null);
RDebugUtils.currentLine=44171271;
 //BA.debugLineNum = 44171271;BA.debugLine="Uhrzeit.Initialize(\"Uhrzeit\", 300000)";
__ref._uhrzeit /*anywheresoftware.b4a.objects.Timer*/ .Initialize(ba,"Uhrzeit",(long) (300000));
RDebugUtils.currentLine=44171273;
 //BA.debugLineNum = 44171273;BA.debugLine="dprYear = DateTime.GetYear(DateTime.Now)";
__ref._dpryear /*int*/  = __c.DateTime.GetYear(__c.DateTime.getNow());
RDebugUtils.currentLine=44171274;
 //BA.debugLineNum = 44171274;BA.debugLine="dprMonth = DateTime.GetMonth(DateTime.Now)";
__ref._dprmonth /*int*/  = __c.DateTime.GetMonth(__c.DateTime.getNow());
RDebugUtils.currentLine=44171275;
 //BA.debugLineNum = 44171275;BA.debugLine="dprDay = DateTime.GetDayOfMonth(DateTime.Now)";
__ref._dprday /*int*/  = __c.DateTime.GetDayOfMonth(__c.DateTime.getNow());
RDebugUtils.currentLine=44171276;
 //BA.debugLineNum = 44171276;BA.debugLine="End Sub";
return "";
}
public String  _b4xpage_appear(b4a.example.settings __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="settings";
if (Debug.shouldDelegate(ba, "b4xpage_appear", false))
	 {return ((String) Debug.delegate(ba, "b4xpage_appear", null));}
RDebugUtils.currentLine=44302336;
 //BA.debugLineNum = 44302336;BA.debugLine="Public Sub B4XPage_Appear";
RDebugUtils.currentLine=44302338;
 //BA.debugLineNum = 44302338;BA.debugLine="LoadTinyDB";
__ref._loadtinydb /*String*/ (null);
RDebugUtils.currentLine=44302340;
 //BA.debugLineNum = 44302340;BA.debugLine="If B4XPages.MainPage.Status.IsInitialized And B4X";
if (_b4xpages._mainpage /*b4a.example.b4xmainpage*/ (ba)._status /*anywheresoftware.b4a.objects.collections.Map*/ .IsInitialized() && _b4xpages._mainpage /*b4a.example.b4xmainpage*/ (ba)._status /*anywheresoftware.b4a.objects.collections.Map*/ .getSize()>0) { 
RDebugUtils.currentLine=44302341;
 //BA.debugLineNum = 44302341;BA.debugLine="Status = B4XPages.MainPage.Status";
__ref._status /*anywheresoftware.b4a.objects.collections.Map*/  = _b4xpages._mainpage /*b4a.example.b4xmainpage*/ (ba)._status /*anywheresoftware.b4a.objects.collections.Map*/ ;
 };
RDebugUtils.currentLine=44302344;
 //BA.debugLineNum = 44302344;BA.debugLine="Veranstaltung_ID = DBGet(\"VeranstaltungID\", \"v0\")";
__ref._veranstaltung_id /*String*/  = BA.ObjectToString(__ref._dbget /*Object*/ (null,"VeranstaltungID",(Object)("v0")));
RDebugUtils.currentLine=44302348;
 //BA.debugLineNum = 44302348;BA.debugLine="disableVSTNG";
__ref._disablevstng /*String*/ (null);
RDebugUtils.currentLine=44302349;
 //BA.debugLineNum = 44302349;BA.debugLine="disableTLN";
__ref._disabletln /*String*/ (null);
RDebugUtils.currentLine=44302350;
 //BA.debugLineNum = 44302350;BA.debugLine="setzeHeaderfromDB";
__ref._setzeheaderfromdb /*String*/ (null);
RDebugUtils.currentLine=44302351;
 //BA.debugLineNum = 44302351;BA.debugLine="changeURL";
__ref._changeurl /*String*/ (null);
RDebugUtils.currentLine=44302353;
 //BA.debugLineNum = 44302353;BA.debugLine="If Veranstaltung_ID = \"v0\" Then";
if ((__ref._veranstaltung_id /*String*/ ).equals("v0")) { 
RDebugUtils.currentLine=44302354;
 //BA.debugLineNum = 44302354;BA.debugLine="DBPut(\"VeranstaltungDatum\", \"\")";
__ref._dbput /*String*/ (null,"VeranstaltungDatum",(Object)(""));
 };
RDebugUtils.currentLine=44302357;
 //BA.debugLineNum = 44302357;BA.debugLine="If Status.GetDefault(\"idToken\", \"\") = \"\" Then";
if ((__ref._status /*anywheresoftware.b4a.objects.collections.Map*/ .GetDefault((Object)("idToken"),(Object)(""))).equals((Object)(""))) { 
RDebugUtils.currentLine=44302358;
 //BA.debugLineNum = 44302358;BA.debugLine="CloseSettings";
__ref._closesettings /*String*/ (null);
 }else {
RDebugUtils.currentLine=44302360;
 //BA.debugLineNum = 44302360;BA.debugLine="holeVeranstaltungen";
__ref._holeveranstaltungen /*String*/ (null);
 };
RDebugUtils.currentLine=44302362;
 //BA.debugLineNum = 44302362;BA.debugLine="startTimer";
__ref._starttimer /*String*/ (null);
RDebugUtils.currentLine=44302363;
 //BA.debugLineNum = 44302363;BA.debugLine="End Sub";
return "";
}
public String  _loadtinydb(b4a.example.settings __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="settings";
if (Debug.shouldDelegate(ba, "loadtinydb", false))
	 {return ((String) Debug.delegate(ba, "loadtinydb", null));}
RDebugUtils.currentLine=47185920;
 //BA.debugLineNum = 47185920;BA.debugLine="Private Sub LoadTinyDB";
RDebugUtils.currentLine=47185921;
 //BA.debugLineNum = 47185921;BA.debugLine="If File.Exists(File.DirInternal, DBFileName) Then";
if (__c.File.Exists(__c.File.getDirInternal(),__ref._dbfilename /*String*/ )) { 
RDebugUtils.currentLine=47185922;
 //BA.debugLineNum = 47185922;BA.debugLine="DBVerein = File.ReadMap(File.DirInternal, DBFile";
__ref._dbverein /*anywheresoftware.b4a.objects.collections.Map*/  = __c.File.ReadMap(__c.File.getDirInternal(),__ref._dbfilename /*String*/ );
 }else {
RDebugUtils.currentLine=47185924;
 //BA.debugLineNum = 47185924;BA.debugLine="DBVerein.Initialize";
__ref._dbverein /*anywheresoftware.b4a.objects.collections.Map*/ .Initialize();
 };
RDebugUtils.currentLine=47185926;
 //BA.debugLineNum = 47185926;BA.debugLine="End Sub";
return "";
}
public Object  _dbget(b4a.example.settings __ref,String _key,Object _defaultvalue) throws Exception{
__ref = this;
RDebugUtils.currentModule="settings";
if (Debug.shouldDelegate(ba, "dbget", false))
	 {return ((Object) Debug.delegate(ba, "dbget", new Object[] {_key,_defaultvalue}));}
String _val = "";
anywheresoftware.b4a.objects.collections.JSONParser _jp = null;
RDebugUtils.currentLine=47316992;
 //BA.debugLineNum = 47316992;BA.debugLine="Private Sub DBGet(Key As String, DefaultValue As O";
RDebugUtils.currentLine=47316993;
 //BA.debugLineNum = 47316993;BA.debugLine="If DBVerein.ContainsKey(Key) = False Then Return";
if (__ref._dbverein /*anywheresoftware.b4a.objects.collections.Map*/ .ContainsKey((Object)(_key))==__c.False) { 
if (true) return _defaultvalue;};
RDebugUtils.currentLine=47316994;
 //BA.debugLineNum = 47316994;BA.debugLine="Dim val As String = DBVerein.Get(Key)";
_val = BA.ObjectToString(__ref._dbverein /*anywheresoftware.b4a.objects.collections.Map*/ .Get((Object)(_key)));
RDebugUtils.currentLine=47316995;
 //BA.debugLineNum = 47316995;BA.debugLine="If val.StartsWith(\"JSON_MAP:\") Then";
if (_val.startsWith("JSON_MAP:")) { 
RDebugUtils.currentLine=47316996;
 //BA.debugLineNum = 47316996;BA.debugLine="Dim jp As JSONParser";
_jp = new anywheresoftware.b4a.objects.collections.JSONParser();
RDebugUtils.currentLine=47316997;
 //BA.debugLineNum = 47316997;BA.debugLine="jp.Initialize(val.SubString(9))";
_jp.Initialize(_val.substring((int) (9)));
RDebugUtils.currentLine=47316998;
 //BA.debugLineNum = 47316998;BA.debugLine="Return jp.NextObject";
if (true) return (Object)(_jp.NextObject().getObject());
 }else 
{RDebugUtils.currentLine=47316999;
 //BA.debugLineNum = 47316999;BA.debugLine="Else If val.StartsWith(\"JSON_LIST:\") Then";
if (_val.startsWith("JSON_LIST:")) { 
RDebugUtils.currentLine=47317000;
 //BA.debugLineNum = 47317000;BA.debugLine="Dim jp As JSONParser";
_jp = new anywheresoftware.b4a.objects.collections.JSONParser();
RDebugUtils.currentLine=47317001;
 //BA.debugLineNum = 47317001;BA.debugLine="jp.Initialize(val.SubString(10))";
_jp.Initialize(_val.substring((int) (10)));
RDebugUtils.currentLine=47317002;
 //BA.debugLineNum = 47317002;BA.debugLine="Return jp.NextArray";
if (true) return (Object)(_jp.NextArray().getObject());
 }}
;
RDebugUtils.currentLine=47317004;
 //BA.debugLineNum = 47317004;BA.debugLine="Return val";
if (true) return (Object)(_val);
RDebugUtils.currentLine=47317005;
 //BA.debugLineNum = 47317005;BA.debugLine="End Sub";
return null;
}
public String  _disablevstng(b4a.example.settings __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="settings";
if (Debug.shouldDelegate(ba, "disablevstng", false))
	 {return ((String) Debug.delegate(ba, "disablevstng", null));}
RDebugUtils.currentLine=44498944;
 //BA.debugLineNum = 44498944;BA.debugLine="Private Sub disableVSTNG";
RDebugUtils.currentLine=44498945;
 //BA.debugLineNum = 44498945;BA.debugLine="dprDatum.Enabled = False";
__ref._dprdatum /*anywheresoftware.b4a.objects.ButtonWrapper*/ .setEnabled(__c.False);
RDebugUtils.currentLine=44498946;
 //BA.debugLineNum = 44498946;BA.debugLine="dprDatum.TextColor = 0xFF888888";
__ref._dprdatum /*anywheresoftware.b4a.objects.ButtonWrapper*/ .setTextColor(((int)0xff888888));
RDebugUtils.currentLine=44498947;
 //BA.debugLineNum = 44498947;BA.debugLine="btnVerstgDelete.Enabled = False";
__ref._btnverstgdelete /*anywheresoftware.b4a.objects.ButtonWrapper*/ .setEnabled(__c.False);
RDebugUtils.currentLine=44498948;
 //BA.debugLineNum = 44498948;BA.debugLine="btnVerstgDelete.TextColor = 0xFF888888";
__ref._btnverstgdelete /*anywheresoftware.b4a.objects.ButtonWrapper*/ .setTextColor(((int)0xff888888));
RDebugUtils.currentLine=44498949;
 //BA.debugLineNum = 44498949;BA.debugLine="btnVerstgSpeichern.Enabled = False";
__ref._btnverstgspeichern /*anywheresoftware.b4a.objects.ButtonWrapper*/ .setEnabled(__c.False);
RDebugUtils.currentLine=44498950;
 //BA.debugLineNum = 44498950;BA.debugLine="btnVerstgSpeichern.TextColor = 0xFF888888";
__ref._btnverstgspeichern /*anywheresoftware.b4a.objects.ButtonWrapper*/ .setTextColor(((int)0xff888888));
RDebugUtils.currentLine=44498951;
 //BA.debugLineNum = 44498951;BA.debugLine="tbxVeranstaltung.Enabled = False";
__ref._tbxveranstaltung /*anywheresoftware.b4a.objects.EditTextWrapper*/ .setEnabled(__c.False);
RDebugUtils.currentLine=44498952;
 //BA.debugLineNum = 44498952;BA.debugLine="tbxAnzahl.Enabled = False";
__ref._tbxanzahl /*anywheresoftware.b4a.objects.EditTextWrapper*/ .setEnabled(__c.False);
RDebugUtils.currentLine=44498953;
 //BA.debugLineNum = 44498953;BA.debugLine="btnAuswahl.Enabled = False";
__ref._btnauswahl /*anywheresoftware.b4a.objects.ButtonWrapper*/ .setEnabled(__c.False);
RDebugUtils.currentLine=44498954;
 //BA.debugLineNum = 44498954;BA.debugLine="btnAuswahl.TextColor = 0xFF888888";
__ref._btnauswahl /*anywheresoftware.b4a.objects.ButtonWrapper*/ .setTextColor(((int)0xff888888));
RDebugUtils.currentLine=44498955;
 //BA.debugLineNum = 44498955;BA.debugLine="End Sub";
return "";
}
public String  _disabletln(b4a.example.settings __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="settings";
if (Debug.shouldDelegate(ba, "disabletln", false))
	 {return ((String) Debug.delegate(ba, "disabletln", null));}
RDebugUtils.currentLine=44630016;
 //BA.debugLineNum = 44630016;BA.debugLine="Private Sub disableTLN";
RDebugUtils.currentLine=44630017;
 //BA.debugLineNum = 44630017;BA.debugLine="btnTLNDelete.Enabled = False";
__ref._btntlndelete /*anywheresoftware.b4a.objects.ButtonWrapper*/ .setEnabled(__c.False);
RDebugUtils.currentLine=44630018;
 //BA.debugLineNum = 44630018;BA.debugLine="btnTLNSpeichern.Enabled = False";
__ref._btntlnspeichern /*anywheresoftware.b4a.objects.ButtonWrapper*/ .setEnabled(__c.False);
RDebugUtils.currentLine=44630019;
 //BA.debugLineNum = 44630019;BA.debugLine="tbxTeilnehmer.Enabled = False";
__ref._tbxteilnehmer /*anywheresoftware.b4a.objects.EditTextWrapper*/ .setEnabled(__c.False);
RDebugUtils.currentLine=44630020;
 //BA.debugLineNum = 44630020;BA.debugLine="btnTLNDelete.TextColor = 0xFF888888";
__ref._btntlndelete /*anywheresoftware.b4a.objects.ButtonWrapper*/ .setTextColor(((int)0xff888888));
RDebugUtils.currentLine=44630021;
 //BA.debugLineNum = 44630021;BA.debugLine="btnTLNSpeichern.TextColor = 0xFF888888";
__ref._btntlnspeichern /*anywheresoftware.b4a.objects.ButtonWrapper*/ .setTextColor(((int)0xff888888));
RDebugUtils.currentLine=44630022;
 //BA.debugLineNum = 44630022;BA.debugLine="End Sub";
return "";
}
public String  _setzeheaderfromdb(b4a.example.settings __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="settings";
if (Debug.shouldDelegate(ba, "setzeheaderfromdb", false))
	 {return ((String) Debug.delegate(ba, "setzeheaderfromdb", null));}
RDebugUtils.currentLine=44761088;
 //BA.debugLineNum = 44761088;BA.debugLine="Private Sub setzeHeaderfromDB";
RDebugUtils.currentLine=44761089;
 //BA.debugLineNum = 44761089;BA.debugLine="lblVerein.Text = DBGet(\"Bezeichnung\", \"- nicht ge";
__ref._lblverein /*anywheresoftware.b4a.objects.LabelWrapper*/ .setText(BA.ObjectToCharSequence(__ref._dbget /*Object*/ (null,"Bezeichnung",(Object)("- nicht gesetzt -"))));
RDebugUtils.currentLine=44761090;
 //BA.debugLineNum = 44761090;BA.debugLine="lblVeranstaltung.Text = DBGet(\"VeranstaltungName\"";
__ref._lblveranstaltung /*anywheresoftware.b4a.objects.LabelWrapper*/ .setText(BA.ObjectToCharSequence(__ref._dbget /*Object*/ (null,"VeranstaltungName",(Object)("- nicht gesetzt -"))));
RDebugUtils.currentLine=44761091;
 //BA.debugLineNum = 44761091;BA.debugLine="lblDatum.Text = DBGet(\"VeranstaltungDatum\", \"- ni";
__ref._lbldatum /*anywheresoftware.b4a.objects.LabelWrapper*/ .setText(BA.ObjectToCharSequence(__ref._dbget /*Object*/ (null,"VeranstaltungDatum",(Object)("- nicht gesetzt -"))));
RDebugUtils.currentLine=44761092;
 //BA.debugLineNum = 44761092;BA.debugLine="End Sub";
return "";
}
public String  _changeurl(b4a.example.settings __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="settings";
if (Debug.shouldDelegate(ba, "changeurl", false))
	 {return ((String) Debug.delegate(ba, "changeurl", null));}
String _url = "";
RDebugUtils.currentLine=44826624;
 //BA.debugLineNum = 44826624;BA.debugLine="Private Sub changeURL";
RDebugUtils.currentLine=44826625;
 //BA.debugLineNum = 44826625;BA.debugLine="Dim url As String = DBGet(\"VereinsID\", \"[...]\")";
_url = BA.ObjectToString(__ref._dbget /*Object*/ (null,"VereinsID",(Object)("[...]")));
RDebugUtils.currentLine=44826626;
 //BA.debugLineNum = 44826626;BA.debugLine="URLveranstaltungen = \"https://wertungslisten-app-";
__ref._urlveranstaltungen /*String*/  = "https://wertungslisten-app-default-rtdb.europe-west1.firebasedatabase.app/Vereine/"+_url+"/Veranstaltungen";
RDebugUtils.currentLine=44826627;
 //BA.debugLineNum = 44826627;BA.debugLine="URLteilnehmer = \"https://wertungslisten-app-defau";
__ref._urlteilnehmer /*String*/  = "https://wertungslisten-app-default-rtdb.europe-west1.firebasedatabase.app/Vereine/"+_url+"/Teilnehmer";
RDebugUtils.currentLine=44826628;
 //BA.debugLineNum = 44826628;BA.debugLine="URLergebnisse = \"https://wertungslisten-app-defau";
__ref._urlergebnisse /*String*/  = "https://wertungslisten-app-default-rtdb.europe-west1.firebasedatabase.app/Vereine/"+_url+"/Ergebnisse";
RDebugUtils.currentLine=44826629;
 //BA.debugLineNum = 44826629;BA.debugLine="End Sub";
return "";
}
public String  _dbput(b4a.example.settings __ref,String _key,Object _value) throws Exception{
__ref = this;
RDebugUtils.currentModule="settings";
if (Debug.shouldDelegate(ba, "dbput", false))
	 {return ((String) Debug.delegate(ba, "dbput", new Object[] {_key,_value}));}
anywheresoftware.b4a.objects.collections.JSONParser.JSONGenerator _jg = null;
RDebugUtils.currentLine=47251456;
 //BA.debugLineNum = 47251456;BA.debugLine="Private Sub DBPut(Key As String, Value As Object)";
RDebugUtils.currentLine=47251457;
 //BA.debugLineNum = 47251457;BA.debugLine="If Value Is Map Then";
if (_value instanceof java.util.Map) { 
RDebugUtils.currentLine=47251458;
 //BA.debugLineNum = 47251458;BA.debugLine="Dim jg As JSONGenerator";
_jg = new anywheresoftware.b4a.objects.collections.JSONParser.JSONGenerator();
RDebugUtils.currentLine=47251459;
 //BA.debugLineNum = 47251459;BA.debugLine="jg.Initialize(Value)";
_jg.Initialize((anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_value)));
RDebugUtils.currentLine=47251460;
 //BA.debugLineNum = 47251460;BA.debugLine="DBVerein.Put(Key, \"JSON_MAP:\" & jg.ToString)";
__ref._dbverein /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)(_key),(Object)("JSON_MAP:"+_jg.ToString()));
 }else 
{RDebugUtils.currentLine=47251461;
 //BA.debugLineNum = 47251461;BA.debugLine="Else If Value Is List Then";
if (_value instanceof java.util.List) { 
RDebugUtils.currentLine=47251462;
 //BA.debugLineNum = 47251462;BA.debugLine="Dim jg As JSONGenerator";
_jg = new anywheresoftware.b4a.objects.collections.JSONParser.JSONGenerator();
RDebugUtils.currentLine=47251463;
 //BA.debugLineNum = 47251463;BA.debugLine="jg.Initialize2(Value)";
_jg.Initialize2((anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_value)));
RDebugUtils.currentLine=47251464;
 //BA.debugLineNum = 47251464;BA.debugLine="DBVerein.Put(Key, \"JSON_LIST:\" & jg.ToString)";
__ref._dbverein /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)(_key),(Object)("JSON_LIST:"+_jg.ToString()));
 }else {
RDebugUtils.currentLine=47251466;
 //BA.debugLineNum = 47251466;BA.debugLine="DBVerein.Put(Key, Value)";
__ref._dbverein /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)(_key),_value);
 }}
;
RDebugUtils.currentLine=47251468;
 //BA.debugLineNum = 47251468;BA.debugLine="File.WriteMap(File.DirInternal, DBFileName, DBVer";
__c.File.WriteMap(__c.File.getDirInternal(),__ref._dbfilename /*String*/ ,__ref._dbverein /*anywheresoftware.b4a.objects.collections.Map*/ );
RDebugUtils.currentLine=47251469;
 //BA.debugLineNum = 47251469;BA.debugLine="End Sub";
return "";
}
public String  _closesettings(b4a.example.settings __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="settings";
if (Debug.shouldDelegate(ba, "closesettings", false))
	 {return ((String) Debug.delegate(ba, "closesettings", null));}
RDebugUtils.currentLine=44433408;
 //BA.debugLineNum = 44433408;BA.debugLine="Private Sub CloseSettings";
RDebugUtils.currentLine=44433409;
 //BA.debugLineNum = 44433409;BA.debugLine="Uhrzeit.Enabled = False";
__ref._uhrzeit /*anywheresoftware.b4a.objects.Timer*/ .setEnabled(__c.False);
RDebugUtils.currentLine=44433410;
 //BA.debugLineNum = 44433410;BA.debugLine="B4XPages.MainPage.Status = Status";
_b4xpages._mainpage /*b4a.example.b4xmainpage*/ (ba)._status /*anywheresoftware.b4a.objects.collections.Map*/  = __ref._status /*anywheresoftware.b4a.objects.collections.Map*/ ;
RDebugUtils.currentLine=44433411;
 //BA.debugLineNum = 44433411;BA.debugLine="B4XPages.ClosePage(Me)";
_b4xpages._closepage /*String*/ (ba,this);
RDebugUtils.currentLine=44433412;
 //BA.debugLineNum = 44433412;BA.debugLine="End Sub";
return "";
}
public String  _holeveranstaltungen(b4a.example.settings __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="settings";
if (Debug.shouldDelegate(ba, "holeveranstaltungen", false))
	 {return ((String) Debug.delegate(ba, "holeveranstaltungen", null));}
RDebugUtils.currentLine=44892160;
 //BA.debugLineNum = 44892160;BA.debugLine="Private Sub holeVeranstaltungen";
RDebugUtils.currentLine=44892161;
 //BA.debugLineNum = 44892161;BA.debugLine="DBdatenTyp = \"Veranstaltungen\"";
__ref._dbdatentyp /*String*/  = "Veranstaltungen";
RDebugUtils.currentLine=44892162;
 //BA.debugLineNum = 44892162;BA.debugLine="CurrentWebUrl = URLveranstaltungen & \".json?auth=";
__ref._currentweburl /*String*/  = __ref._urlveranstaltungen /*String*/ +".json?auth="+BA.ObjectToString(__ref._status /*anywheresoftware.b4a.objects.collections.Map*/ .GetDefault((Object)("idToken"),(Object)("")));
RDebugUtils.currentLine=44892163;
 //BA.debugLineNum = 44892163;BA.debugLine="ExecuteHttp(\"GET\", CurrentWebUrl, \"\")";
__ref._executehttp /*void*/ (null,"GET",__ref._currentweburl /*String*/ ,"");
RDebugUtils.currentLine=44892164;
 //BA.debugLineNum = 44892164;BA.debugLine="End Sub";
return "";
}
public String  _starttimer(b4a.example.settings __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="settings";
if (Debug.shouldDelegate(ba, "starttimer", false))
	 {return ((String) Debug.delegate(ba, "starttimer", null));}
RDebugUtils.currentLine=46923776;
 //BA.debugLineNum = 46923776;BA.debugLine="Private Sub startTimer";
RDebugUtils.currentLine=46923777;
 //BA.debugLineNum = 46923777;BA.debugLine="Uhrzeit.Enabled = False";
__ref._uhrzeit /*anywheresoftware.b4a.objects.Timer*/ .setEnabled(__c.False);
RDebugUtils.currentLine=46923778;
 //BA.debugLineNum = 46923778;BA.debugLine="Uhrzeit.Interval = 1000 * 300";
__ref._uhrzeit /*anywheresoftware.b4a.objects.Timer*/ .setInterval((long) (1000*300));
RDebugUtils.currentLine=46923779;
 //BA.debugLineNum = 46923779;BA.debugLine="Uhrzeit.Enabled = True";
__ref._uhrzeit /*anywheresoftware.b4a.objects.Timer*/ .setEnabled(__c.True);
RDebugUtils.currentLine=46923780;
 //BA.debugLineNum = 46923780;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _b4xpage_closerequest(b4a.example.settings __ref) throws Exception{
RDebugUtils.currentModule="settings";
if (Debug.shouldDelegate(ba, "b4xpage_closerequest", false))
	 {return ((anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) Debug.delegate(ba, "b4xpage_closerequest", null));}
ResumableSub_B4XPage_CloseRequest rsub = new ResumableSub_B4XPage_CloseRequest(this,__ref);
rsub.resume(ba, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_B4XPage_CloseRequest extends BA.ResumableSub {
public ResumableSub_B4XPage_CloseRequest(b4a.example.settings parent,b4a.example.settings __ref) {
this.parent = parent;
this.__ref = __ref;
this.__ref = parent;
}
b4a.example.settings __ref;
b4a.example.settings parent;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="settings";

    while (true) {
        switch (state) {
            case -1:
{
parent.__c.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = -1;
RDebugUtils.currentLine=44367873;
 //BA.debugLineNum = 44367873;BA.debugLine="Uhrzeit.Enabled = False";
__ref._uhrzeit /*anywheresoftware.b4a.objects.Timer*/ .setEnabled(parent.__c.False);
RDebugUtils.currentLine=44367874;
 //BA.debugLineNum = 44367874;BA.debugLine="B4XPages.MainPage.Status = Status";
parent._b4xpages._mainpage /*b4a.example.b4xmainpage*/ (ba)._status /*anywheresoftware.b4a.objects.collections.Map*/  = __ref._status /*anywheresoftware.b4a.objects.collections.Map*/ ;
RDebugUtils.currentLine=44367875;
 //BA.debugLineNum = 44367875;BA.debugLine="Return True";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.True));return;};
RDebugUtils.currentLine=44367876;
 //BA.debugLineNum = 44367876;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public String  _b4xpage_created(b4a.example.settings __ref,anywheresoftware.b4a.objects.B4XViewWrapper _root1) throws Exception{
__ref = this;
RDebugUtils.currentModule="settings";
if (Debug.shouldDelegate(ba, "b4xpage_created", false))
	 {return ((String) Debug.delegate(ba, "b4xpage_created", new Object[] {_root1}));}
RDebugUtils.currentLine=44236800;
 //BA.debugLineNum = 44236800;BA.debugLine="Private Sub B4XPage_Created (Root1 As B4XView)";
RDebugUtils.currentLine=44236801;
 //BA.debugLineNum = 44236801;BA.debugLine="Root = Root1";
__ref._root /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = _root1;
RDebugUtils.currentLine=44236802;
 //BA.debugLineNum = 44236802;BA.debugLine="Root.LoadLayout(\"Settings\")";
__ref._root /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .LoadLayout("Settings",ba);
RDebugUtils.currentLine=44236805;
 //BA.debugLineNum = 44236805;BA.debugLine="End Sub";
return "";
}
public String  _btnauswahl_click(b4a.example.settings __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="settings";
if (Debug.shouldDelegate(ba, "btnauswahl_click", false))
	 {return ((String) Debug.delegate(ba, "btnauswahl_click", null));}
RDebugUtils.currentLine=46202880;
 //BA.debugLineNum = 46202880;BA.debugLine="Private Sub btnAuswahl_Click";
RDebugUtils.currentLine=46202881;
 //BA.debugLineNum = 46202881;BA.debugLine="Uhrzeit.Enabled = False";
__ref._uhrzeit /*anywheresoftware.b4a.objects.Timer*/ .setEnabled(__c.False);
RDebugUtils.currentLine=46202882;
 //BA.debugLineNum = 46202882;BA.debugLine="Veranstaltung_ID = webviewVSTGN_ID";
__ref._veranstaltung_id /*String*/  = __ref._webviewvstgn_id /*String*/ ;
RDebugUtils.currentLine=46202883;
 //BA.debugLineNum = 46202883;BA.debugLine="saveDBvstng";
__ref._savedbvstng /*String*/ (null);
RDebugUtils.currentLine=46202884;
 //BA.debugLineNum = 46202884;BA.debugLine="CloseSettings";
__ref._closesettings /*String*/ (null);
RDebugUtils.currentLine=46202885;
 //BA.debugLineNum = 46202885;BA.debugLine="End Sub";
return "";
}
public String  _savedbvstng(b4a.example.settings __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="settings";
if (Debug.shouldDelegate(ba, "savedbvstng", false))
	 {return ((String) Debug.delegate(ba, "savedbvstng", null));}
RDebugUtils.currentLine=45219840;
 //BA.debugLineNum = 45219840;BA.debugLine="Private Sub saveDBvstng";
RDebugUtils.currentLine=45219841;
 //BA.debugLineNum = 45219841;BA.debugLine="lblVeranstaltung.Text = tbxVeranstaltung.Text";
__ref._lblveranstaltung /*anywheresoftware.b4a.objects.LabelWrapper*/ .setText(BA.ObjectToCharSequence(__ref._tbxveranstaltung /*anywheresoftware.b4a.objects.EditTextWrapper*/ .getText()));
RDebugUtils.currentLine=45219842;
 //BA.debugLineNum = 45219842;BA.debugLine="lblDatum.Text = dprDatum.Text";
__ref._lbldatum /*anywheresoftware.b4a.objects.LabelWrapper*/ .setText(BA.ObjectToCharSequence(__ref._dprdatum /*anywheresoftware.b4a.objects.ButtonWrapper*/ .getText()));
RDebugUtils.currentLine=45219843;
 //BA.debugLineNum = 45219843;BA.debugLine="DBPut(\"VeranstaltungID\", Veranstaltung_ID)";
__ref._dbput /*String*/ (null,"VeranstaltungID",(Object)(__ref._veranstaltung_id /*String*/ ));
RDebugUtils.currentLine=45219844;
 //BA.debugLineNum = 45219844;BA.debugLine="DBPut(\"VeranstaltungName\", tbxVeranstaltung.Text)";
__ref._dbput /*String*/ (null,"VeranstaltungName",(Object)(__ref._tbxveranstaltung /*anywheresoftware.b4a.objects.EditTextWrapper*/ .getText()));
RDebugUtils.currentLine=45219845;
 //BA.debugLineNum = 45219845;BA.debugLine="DBPut(\"VeranstaltungDatum\", dprDatum.Text)";
__ref._dbput /*String*/ (null,"VeranstaltungDatum",(Object)(__ref._dprdatum /*anywheresoftware.b4a.objects.ButtonWrapper*/ .getText()));
RDebugUtils.currentLine=45219846;
 //BA.debugLineNum = 45219846;BA.debugLine="DBPut(\"VeranstaltungAnzahl\", tbxAnzahl.Text)";
__ref._dbput /*String*/ (null,"VeranstaltungAnzahl",(Object)(__ref._tbxanzahl /*anywheresoftware.b4a.objects.EditTextWrapper*/ .getText()));
RDebugUtils.currentLine=45219847;
 //BA.debugLineNum = 45219847;BA.debugLine="End Sub";
return "";
}
public String  _btnback_click(b4a.example.settings __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="settings";
if (Debug.shouldDelegate(ba, "btnback_click", false))
	 {return ((String) Debug.delegate(ba, "btnback_click", null));}
RDebugUtils.currentLine=46006272;
 //BA.debugLineNum = 46006272;BA.debugLine="Private Sub btnBack_Click";
RDebugUtils.currentLine=46006273;
 //BA.debugLineNum = 46006273;BA.debugLine="CloseSettings";
__ref._closesettings /*String*/ (null);
RDebugUtils.currentLine=46006274;
 //BA.debugLineNum = 46006274;BA.debugLine="End Sub";
return "";
}
public void  _btntlndelete_click(b4a.example.settings __ref) throws Exception{
RDebugUtils.currentModule="settings";
if (Debug.shouldDelegate(ba, "btntlndelete_click", false))
	 {Debug.delegate(ba, "btntlndelete_click", null); return;}
ResumableSub_btnTLNDelete_Click rsub = new ResumableSub_btnTLNDelete_Click(this,__ref);
rsub.resume(ba, null);
}
public static class ResumableSub_btnTLNDelete_Click extends BA.ResumableSub {
public ResumableSub_btnTLNDelete_Click(b4a.example.settings parent,b4a.example.settings __ref) {
this.parent = parent;
this.__ref = __ref;
this.__ref = parent;
}
b4a.example.settings __ref;
b4a.example.settings parent;
int _res;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="settings";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=46399489;
 //BA.debugLineNum = 46399489;BA.debugLine="startTimer";
__ref._starttimer /*String*/ (null);
RDebugUtils.currentLine=46399490;
 //BA.debugLineNum = 46399490;BA.debugLine="Msgbox2Async(tbxTeilnehmer.Text & \" aus der Liste";
parent.__c.Msgbox2Async(BA.ObjectToCharSequence(__ref._tbxteilnehmer /*anywheresoftware.b4a.objects.EditTextWrapper*/ .getText()+" aus der Liste der Teilnehmer löschen?"),BA.ObjectToCharSequence("Teilnehmer wirklich löschen?"),"Löschen","","Abbrechen",(anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper(), (android.graphics.Bitmap)(parent.__c.Null)),ba,parent.__c.True);
RDebugUtils.currentLine=46399491;
 //BA.debugLineNum = 46399491;BA.debugLine="Wait For Msgbox_Result (res As Int)";
parent.__c.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "settings", "btntlndelete_click"), null);
this.state = 5;
return;
case 5:
//C
this.state = 1;
_res = (Integer) result[1];
;
RDebugUtils.currentLine=46399492;
 //BA.debugLineNum = 46399492;BA.debugLine="If res = DialogResponse.POSITIVE Then";
if (true) break;

case 1:
//if
this.state = 4;
if (_res==parent.__c.DialogResponse.POSITIVE) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
RDebugUtils.currentLine=46399493;
 //BA.debugLineNum = 46399493;BA.debugLine="delTLN(TLNid)";
__ref._deltln /*String*/ (null,__ref._tlnid /*String*/ );
RDebugUtils.currentLine=46399494;
 //BA.debugLineNum = 46399494;BA.debugLine="startTimer";
__ref._starttimer /*String*/ (null);
 if (true) break;

case 4:
//C
this.state = -1;
;
RDebugUtils.currentLine=46399496;
 //BA.debugLineNum = 46399496;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public String  _deltln(b4a.example.settings __ref,String _tid) throws Exception{
__ref = this;
RDebugUtils.currentModule="settings";
if (Debug.shouldDelegate(ba, "deltln", false))
	 {return ((String) Debug.delegate(ba, "deltln", new Object[] {_tid}));}
RDebugUtils.currentLine=45744128;
 //BA.debugLineNum = 45744128;BA.debugLine="Private Sub delTLN(tid As String)";
RDebugUtils.currentLine=45744129;
 //BA.debugLineNum = 45744129;BA.debugLine="disableTLN";
__ref._disabletln /*String*/ (null);
RDebugUtils.currentLine=45744130;
 //BA.debugLineNum = 45744130;BA.debugLine="ToastMessageShow(\"Der Teilnehmer wird gelöscht!\",";
__c.ToastMessageShow(BA.ObjectToCharSequence("Der Teilnehmer wird gelöscht!"),__c.False);
RDebugUtils.currentLine=45744131;
 //BA.debugLineNum = 45744131;BA.debugLine="DBdatenTyp = \"delTeilnehmer\"";
__ref._dbdatentyp /*String*/  = "delTeilnehmer";
RDebugUtils.currentLine=45744132;
 //BA.debugLineNum = 45744132;BA.debugLine="CurrentWebUrl = URLteilnehmer & \"/\" & tid & \".jso";
__ref._currentweburl /*String*/  = __ref._urlteilnehmer /*String*/ +"/"+_tid+".json?auth="+BA.ObjectToString(__ref._status /*anywheresoftware.b4a.objects.collections.Map*/ .GetDefault((Object)("idToken"),(Object)("")));
RDebugUtils.currentLine=45744133;
 //BA.debugLineNum = 45744133;BA.debugLine="ExecuteHttp(\"DELETE\", CurrentWebUrl, \"\")";
__ref._executehttp /*void*/ (null,"DELETE",__ref._currentweburl /*String*/ ,"");
RDebugUtils.currentLine=45744134;
 //BA.debugLineNum = 45744134;BA.debugLine="enableTLN";
__ref._enabletln /*String*/ (null);
RDebugUtils.currentLine=45744135;
 //BA.debugLineNum = 45744135;BA.debugLine="End Sub";
return "";
}
public String  _btntlnspeichern_click(b4a.example.settings __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="settings";
if (Debug.shouldDelegate(ba, "btntlnspeichern_click", false))
	 {return ((String) Debug.delegate(ba, "btntlnspeichern_click", null));}
RDebugUtils.currentLine=46465024;
 //BA.debugLineNum = 46465024;BA.debugLine="Private Sub btnTLNSpeichern_Click";
RDebugUtils.currentLine=46465025;
 //BA.debugLineNum = 46465025;BA.debugLine="saveTLN";
__ref._savetln /*String*/ (null);
RDebugUtils.currentLine=46465026;
 //BA.debugLineNum = 46465026;BA.debugLine="startTimer";
__ref._starttimer /*String*/ (null);
RDebugUtils.currentLine=46465027;
 //BA.debugLineNum = 46465027;BA.debugLine="End Sub";
return "";
}
public String  _savetln(b4a.example.settings __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="settings";
if (Debug.shouldDelegate(ba, "savetln", false))
	 {return ((String) Debug.delegate(ba, "savetln", null));}
String _dbkey = "";
String _tname = "";
anywheresoftware.b4a.objects.collections.Map _addtlnmap = null;
anywheresoftware.b4a.objects.collections.JSONParser.JSONGenerator _jg = null;
RDebugUtils.currentLine=45678592;
 //BA.debugLineNum = 45678592;BA.debugLine="Private Sub saveTLN";
RDebugUtils.currentLine=45678593;
 //BA.debugLineNum = 45678593;BA.debugLine="disableTLN";
__ref._disabletln /*String*/ (null);
RDebugUtils.currentLine=45678594;
 //BA.debugLineNum = 45678594;BA.debugLine="Dim DBkey As String = TLNid";
_dbkey = __ref._tlnid /*String*/ ;
RDebugUtils.currentLine=45678595;
 //BA.debugLineNum = 45678595;BA.debugLine="If TLNid = \"t0\" Then";
if ((__ref._tlnid /*String*/ ).equals("t0")) { 
RDebugUtils.currentLine=45678596;
 //BA.debugLineNum = 45678596;BA.debugLine="DBkey = TLNnewID";
_dbkey = __ref._tlnnewid /*String*/ ;
 };
RDebugUtils.currentLine=45678599;
 //BA.debugLineNum = 45678599;BA.debugLine="Dim tName As String = tbxTeilnehmer.Text.Trim";
_tname = __ref._tbxteilnehmer /*anywheresoftware.b4a.objects.EditTextWrapper*/ .getText().trim();
RDebugUtils.currentLine=45678600;
 //BA.debugLineNum = 45678600;BA.debugLine="If Teilnehmer.IndexOf(tName) >= 0 Then";
if (__ref._teilnehmer /*anywheresoftware.b4a.objects.collections.List*/ .IndexOf((Object)(_tname))>=0) { 
RDebugUtils.currentLine=45678601;
 //BA.debugLineNum = 45678601;BA.debugLine="MsgboxAsync(\"Der Teilnehmer \" & tName & \" ist be";
__c.MsgboxAsync(BA.ObjectToCharSequence("Der Teilnehmer "+_tname+" ist bereits in der Teilnehmerliste vorhanden und kann nicht erneut angelegt werden. Zum Ändern bitte Teilnehmer auswählen und die Änderung speichern."),BA.ObjectToCharSequence("Speichern nicht möglich!"),ba);
 }else {
RDebugUtils.currentLine=45678603;
 //BA.debugLineNum = 45678603;BA.debugLine="Dim addTLNMap As Map = CreateMap(\"Name\": tName)";
_addtlnmap = new anywheresoftware.b4a.objects.collections.Map();
_addtlnmap = __c.createMap(new Object[] {(Object)("Name"),(Object)(_tname)});
RDebugUtils.currentLine=45678604;
 //BA.debugLineNum = 45678604;BA.debugLine="CurrentWebUrl = URLteilnehmer & \"/\" & DBkey & \".";
__ref._currentweburl /*String*/  = __ref._urlteilnehmer /*String*/ +"/"+_dbkey+".json?auth="+BA.ObjectToString(__ref._status /*anywheresoftware.b4a.objects.collections.Map*/ .GetDefault((Object)("idToken"),(Object)("")));
RDebugUtils.currentLine=45678605;
 //BA.debugLineNum = 45678605;BA.debugLine="DBdatenTyp = \"addTLN\"";
__ref._dbdatentyp /*String*/  = "addTLN";
RDebugUtils.currentLine=45678607;
 //BA.debugLineNum = 45678607;BA.debugLine="Dim jg As JSONGenerator";
_jg = new anywheresoftware.b4a.objects.collections.JSONParser.JSONGenerator();
RDebugUtils.currentLine=45678608;
 //BA.debugLineNum = 45678608;BA.debugLine="jg.Initialize(addTLNMap)";
_jg.Initialize(_addtlnmap);
RDebugUtils.currentLine=45678609;
 //BA.debugLineNum = 45678609;BA.debugLine="ExecuteHttp(\"PUT\", CurrentWebUrl, jg.ToString)";
__ref._executehttp /*void*/ (null,"PUT",__ref._currentweburl /*String*/ ,_jg.ToString());
 };
RDebugUtils.currentLine=45678611;
 //BA.debugLineNum = 45678611;BA.debugLine="enableTLN";
__ref._enabletln /*String*/ (null);
RDebugUtils.currentLine=45678612;
 //BA.debugLineNum = 45678612;BA.debugLine="End Sub";
return "";
}
public void  _btnverstgdelete_click(b4a.example.settings __ref) throws Exception{
RDebugUtils.currentModule="settings";
if (Debug.shouldDelegate(ba, "btnverstgdelete_click", false))
	 {Debug.delegate(ba, "btnverstgdelete_click", null); return;}
ResumableSub_btnVerstgDelete_Click rsub = new ResumableSub_btnVerstgDelete_Click(this,__ref);
rsub.resume(ba, null);
}
public static class ResumableSub_btnVerstgDelete_Click extends BA.ResumableSub {
public ResumableSub_btnVerstgDelete_Click(b4a.example.settings parent,b4a.example.settings __ref) {
this.parent = parent;
this.__ref = __ref;
this.__ref = parent;
}
b4a.example.settings __ref;
b4a.example.settings parent;
int _res;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="settings";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=46268417;
 //BA.debugLineNum = 46268417;BA.debugLine="startTimer";
__ref._starttimer /*String*/ (null);
RDebugUtils.currentLine=46268418;
 //BA.debugLineNum = 46268418;BA.debugLine="Msgbox2Async(\"Die Veranstaltung und deren Wertung";
parent.__c.Msgbox2Async(BA.ObjectToCharSequence("Die Veranstaltung und deren Wertungsliste werden unwiederbringlich gelöscht! Wirklich löschen?"),BA.ObjectToCharSequence("Veranstaltung wirklich löschen?"),"Löschen","","Abbrechen",(anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper(), (android.graphics.Bitmap)(parent.__c.Null)),ba,parent.__c.True);
RDebugUtils.currentLine=46268419;
 //BA.debugLineNum = 46268419;BA.debugLine="Wait For Msgbox_Result (res As Int)";
parent.__c.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "settings", "btnverstgdelete_click"), null);
this.state = 5;
return;
case 5:
//C
this.state = 1;
_res = (Integer) result[1];
;
RDebugUtils.currentLine=46268420;
 //BA.debugLineNum = 46268420;BA.debugLine="If res = DialogResponse.POSITIVE Then";
if (true) break;

case 1:
//if
this.state = 4;
if (_res==parent.__c.DialogResponse.POSITIVE) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
RDebugUtils.currentLine=46268421;
 //BA.debugLineNum = 46268421;BA.debugLine="delWertungsliste(webviewVSTGN_ID)";
__ref._delwertungsliste /*String*/ (null,__ref._webviewvstgn_id /*String*/ );
RDebugUtils.currentLine=46268422;
 //BA.debugLineNum = 46268422;BA.debugLine="startTimer";
__ref._starttimer /*String*/ (null);
 if (true) break;

case 4:
//C
this.state = -1;
;
RDebugUtils.currentLine=46268424;
 //BA.debugLineNum = 46268424;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public String  _delwertungsliste(b4a.example.settings __ref,String _vid) throws Exception{
__ref = this;
RDebugUtils.currentModule="settings";
if (Debug.shouldDelegate(ba, "delwertungsliste", false))
	 {return ((String) Debug.delegate(ba, "delwertungsliste", new Object[] {_vid}));}
anywheresoftware.b4a.objects.collections.Map _veranstaltung = null;
String _datumstr = "";
String[] _datum_spl = null;
RDebugUtils.currentLine=45285376;
 //BA.debugLineNum = 45285376;BA.debugLine="Private Sub delWertungsliste(vid As String)";
RDebugUtils.currentLine=45285377;
 //BA.debugLineNum = 45285377;BA.debugLine="disableVSTNG";
__ref._disablevstng /*String*/ (null);
RDebugUtils.currentLine=45285378;
 //BA.debugLineNum = 45285378;BA.debugLine="If Veranstaltungen.IsInitialized And Veranstaltun";
if (__ref._veranstaltungen /*anywheresoftware.b4a.objects.collections.Map*/ .IsInitialized() && __ref._veranstaltungen /*anywheresoftware.b4a.objects.collections.Map*/ .ContainsKey((Object)(_vid))) { 
RDebugUtils.currentLine=45285379;
 //BA.debugLineNum = 45285379;BA.debugLine="Dim veranstaltung As Map = Veranstaltungen.Get(v";
_veranstaltung = new anywheresoftware.b4a.objects.collections.Map();
_veranstaltung = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(__ref._veranstaltungen /*anywheresoftware.b4a.objects.collections.Map*/ .Get((Object)(_vid))));
RDebugUtils.currentLine=45285380;
 //BA.debugLineNum = 45285380;BA.debugLine="Dim datumStr As String = veranstaltung.GetDefaul";
_datumstr = BA.ObjectToString(_veranstaltung.GetDefault((Object)("Datum"),(Object)("00.00.0000")));
RDebugUtils.currentLine=45285381;
 //BA.debugLineNum = 45285381;BA.debugLine="Dim datum_spl() As String = Regex.Split(\"\\.\", da";
_datum_spl = __c.Regex.Split("\\.",_datumstr);
RDebugUtils.currentLine=45285382;
 //BA.debugLineNum = 45285382;BA.debugLine="If datum_spl.Length >= 3 Then";
if (_datum_spl.length>=3) { 
RDebugUtils.currentLine=45285383;
 //BA.debugLineNum = 45285383;BA.debugLine="DBdatenTyp = \"delErgebnis\"";
__ref._dbdatentyp /*String*/  = "delErgebnis";
RDebugUtils.currentLine=45285384;
 //BA.debugLineNum = 45285384;BA.debugLine="CurrentWebUrl = URLergebnisse & \"/e\" & datum_sp";
__ref._currentweburl /*String*/  = __ref._urlergebnisse /*String*/ +"/e"+_datum_spl[(int) (2)]+_datum_spl[(int) (1)]+_datum_spl[(int) (0)]+".json?auth="+BA.ObjectToString(__ref._status /*anywheresoftware.b4a.objects.collections.Map*/ .GetDefault((Object)("idToken"),(Object)("")));
RDebugUtils.currentLine=45285385;
 //BA.debugLineNum = 45285385;BA.debugLine="ExecuteHttp(\"DELETE\", CurrentWebUrl, \"\")";
__ref._executehttp /*void*/ (null,"DELETE",__ref._currentweburl /*String*/ ,"");
 };
 };
RDebugUtils.currentLine=45285388;
 //BA.debugLineNum = 45285388;BA.debugLine="End Sub";
return "";
}
public void  _btnverstgspeichern_click(b4a.example.settings __ref) throws Exception{
RDebugUtils.currentModule="settings";
if (Debug.shouldDelegate(ba, "btnverstgspeichern_click", false))
	 {Debug.delegate(ba, "btnverstgspeichern_click", null); return;}
ResumableSub_btnVerstgSpeichern_Click rsub = new ResumableSub_btnVerstgSpeichern_Click(this,__ref);
rsub.resume(ba, null);
}
public static class ResumableSub_btnVerstgSpeichern_Click extends BA.ResumableSub {
public ResumableSub_btnVerstgSpeichern_Click(b4a.example.settings parent,b4a.example.settings __ref) {
this.parent = parent;
this.__ref = __ref;
this.__ref = parent;
}
b4a.example.settings __ref;
b4a.example.settings parent;
int _neuanz = 0;
int _altanz = 0;
anywheresoftware.b4a.objects.collections.Map _vmap = null;
int _res;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="settings";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=46333953;
 //BA.debugLineNum = 46333953;BA.debugLine="startTimer";
__ref._starttimer /*String*/ (null);
RDebugUtils.currentLine=46333954;
 //BA.debugLineNum = 46333954;BA.debugLine="Dim neuAnz As Int = 0";
_neuanz = (int) (0);
RDebugUtils.currentLine=46333955;
 //BA.debugLineNum = 46333955;BA.debugLine="If IsNumber(tbxAnzahl.Text) Then neuAnz = tbxAnza";
if (true) break;

case 1:
//if
this.state = 6;
if (parent.__c.IsNumber(__ref._tbxanzahl /*anywheresoftware.b4a.objects.EditTextWrapper*/ .getText())) { 
this.state = 3;
;}if (true) break;

case 3:
//C
this.state = 6;
_neuanz = (int)(Double.parseDouble(__ref._tbxanzahl /*anywheresoftware.b4a.objects.EditTextWrapper*/ .getText()));
if (true) break;

case 6:
//C
this.state = 7;
;
RDebugUtils.currentLine=46333957;
 //BA.debugLineNum = 46333957;BA.debugLine="Dim altAnz As Int = 0";
_altanz = (int) (0);
RDebugUtils.currentLine=46333958;
 //BA.debugLineNum = 46333958;BA.debugLine="If Veranstaltungen.IsInitialized And Veranstaltun";
if (true) break;

case 7:
//if
this.state = 10;
if (__ref._veranstaltungen /*anywheresoftware.b4a.objects.collections.Map*/ .IsInitialized() && __ref._veranstaltungen /*anywheresoftware.b4a.objects.collections.Map*/ .ContainsKey((Object)(__ref._veranstaltung_id /*String*/ ))) { 
this.state = 9;
}if (true) break;

case 9:
//C
this.state = 10;
RDebugUtils.currentLine=46333959;
 //BA.debugLineNum = 46333959;BA.debugLine="Dim vMap As Map = Veranstaltungen.Get(Veranstalt";
_vmap = new anywheresoftware.b4a.objects.collections.Map();
_vmap = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(__ref._veranstaltungen /*anywheresoftware.b4a.objects.collections.Map*/ .Get((Object)(__ref._veranstaltung_id /*String*/ ))));
RDebugUtils.currentLine=46333960;
 //BA.debugLineNum = 46333960;BA.debugLine="altAnz = vMap.GetDefault(\"Teilnehmerzahl\", \"0\")";
_altanz = (int)(BA.ObjectToNumber(_vmap.GetDefault((Object)("Teilnehmerzahl"),(Object)("0"))));
 if (true) break;
;
RDebugUtils.currentLine=46333963;
 //BA.debugLineNum = 46333963;BA.debugLine="If neuAnz < altAnz Then";

case 10:
//if
this.state = 19;
if (_neuanz<_altanz) { 
this.state = 12;
}else {
this.state = 18;
}if (true) break;

case 12:
//C
this.state = 13;
RDebugUtils.currentLine=46333964;
 //BA.debugLineNum = 46333964;BA.debugLine="Msgbox2Async(\"Die Anzahl der Plätze wurde reduzi";
parent.__c.Msgbox2Async(BA.ObjectToCharSequence("Die Anzahl der Plätze wurde reduziert. Werden die geänderten Daten der Veranstaltung gespeichert, gehen ggf. Informationen in der Wertungsliste der Veranstaltung unwiederbringlich verloren."),BA.ObjectToCharSequence("Veranstaltung - Plätze"),"Trotzdem speichern.","","Abbrechen",(anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper(), (android.graphics.Bitmap)(parent.__c.Null)),ba,parent.__c.True);
RDebugUtils.currentLine=46333965;
 //BA.debugLineNum = 46333965;BA.debugLine="Wait For Msgbox_Result (res As Int)";
parent.__c.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "settings", "btnverstgspeichern_click"), null);
this.state = 20;
return;
case 20:
//C
this.state = 13;
_res = (Integer) result[1];
;
RDebugUtils.currentLine=46333966;
 //BA.debugLineNum = 46333966;BA.debugLine="If res = DialogResponse.POSITIVE Then";
if (true) break;

case 13:
//if
this.state = 16;
if (_res==parent.__c.DialogResponse.POSITIVE) { 
this.state = 15;
}if (true) break;

case 15:
//C
this.state = 16;
RDebugUtils.currentLine=46333967;
 //BA.debugLineNum = 46333967;BA.debugLine="saveVSTNG";
__ref._savevstng /*String*/ (null);
RDebugUtils.currentLine=46333968;
 //BA.debugLineNum = 46333968;BA.debugLine="startTimer";
__ref._starttimer /*String*/ (null);
 if (true) break;

case 16:
//C
this.state = 19;
;
 if (true) break;

case 18:
//C
this.state = 19;
RDebugUtils.currentLine=46333971;
 //BA.debugLineNum = 46333971;BA.debugLine="saveVSTNG";
__ref._savevstng /*String*/ (null);
 if (true) break;

case 19:
//C
this.state = -1;
;
RDebugUtils.currentLine=46333973;
 //BA.debugLineNum = 46333973;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public String  _savevstng(b4a.example.settings __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="settings";
if (Debug.shouldDelegate(ba, "savevstng", false))
	 {return ((String) Debug.delegate(ba, "savevstng", null));}
String _dbkey = "";
anywheresoftware.b4a.objects.collections.Map _body = null;
anywheresoftware.b4a.objects.collections.JSONParser.JSONGenerator _jg = null;
RDebugUtils.currentLine=45154304;
 //BA.debugLineNum = 45154304;BA.debugLine="Private Sub saveVSTNG";
RDebugUtils.currentLine=45154305;
 //BA.debugLineNum = 45154305;BA.debugLine="disableVSTNG";
__ref._disablevstng /*String*/ (null);
RDebugUtils.currentLine=45154306;
 //BA.debugLineNum = 45154306;BA.debugLine="Dim DBkey As String = webviewVSTGN_ID";
_dbkey = __ref._webviewvstgn_id /*String*/ ;
RDebugUtils.currentLine=45154307;
 //BA.debugLineNum = 45154307;BA.debugLine="If DBkey = \"v0\" Then";
if ((_dbkey).equals("v0")) { 
RDebugUtils.currentLine=45154308;
 //BA.debugLineNum = 45154308;BA.debugLine="DBkey = VSTGNnewID";
_dbkey = __ref._vstgnnewid /*String*/ ;
RDebugUtils.currentLine=45154309;
 //BA.debugLineNum = 45154309;BA.debugLine="webviewVSTGN_ID = VSTGNnewID";
__ref._webviewvstgn_id /*String*/  = __ref._vstgnnewid /*String*/ ;
 };
RDebugUtils.currentLine=45154312;
 //BA.debugLineNum = 45154312;BA.debugLine="Dim body As Map = CreateMap( _ 		\"Datum\": dprDatu";
_body = new anywheresoftware.b4a.objects.collections.Map();
_body = __c.createMap(new Object[] {(Object)("Datum"),(Object)(__ref._dprdatum /*anywheresoftware.b4a.objects.ButtonWrapper*/ .getText()),(Object)("Name"),(Object)(__ref._tbxveranstaltung /*anywheresoftware.b4a.objects.EditTextWrapper*/ .getText()),(Object)("Teilnehmerzahl"),(Object)(__ref._tbxanzahl /*anywheresoftware.b4a.objects.EditTextWrapper*/ .getText()),(Object)("Status"),(Object)("offen")});
RDebugUtils.currentLine=45154318;
 //BA.debugLineNum = 45154318;BA.debugLine="CurrentWebUrl = URLveranstaltungen & \"/\" & DBkey";
__ref._currentweburl /*String*/  = __ref._urlveranstaltungen /*String*/ +"/"+_dbkey+".json?auth="+BA.ObjectToString(__ref._status /*anywheresoftware.b4a.objects.collections.Map*/ .GetDefault((Object)("idToken"),(Object)("")));
RDebugUtils.currentLine=45154319;
 //BA.debugLineNum = 45154319;BA.debugLine="DBdatenTyp = \"addVSTNG\"";
__ref._dbdatentyp /*String*/  = "addVSTNG";
RDebugUtils.currentLine=45154321;
 //BA.debugLineNum = 45154321;BA.debugLine="Dim jg As JSONGenerator";
_jg = new anywheresoftware.b4a.objects.collections.JSONParser.JSONGenerator();
RDebugUtils.currentLine=45154322;
 //BA.debugLineNum = 45154322;BA.debugLine="jg.Initialize(body)";
_jg.Initialize(_body);
RDebugUtils.currentLine=45154323;
 //BA.debugLineNum = 45154323;BA.debugLine="ExecuteHttp(\"PUT\", CurrentWebUrl, jg.ToString)";
__ref._executehttp /*void*/ (null,"PUT",__ref._currentweburl /*String*/ ,_jg.ToString());
RDebugUtils.currentLine=45154325;
 //BA.debugLineNum = 45154325;BA.debugLine="If Veranstaltung_ID = webviewVSTGN_ID Then";
if ((__ref._veranstaltung_id /*String*/ ).equals(__ref._webviewvstgn_id /*String*/ )) { 
RDebugUtils.currentLine=45154326;
 //BA.debugLineNum = 45154326;BA.debugLine="saveDBvstng";
__ref._savedbvstng /*String*/ (null);
 };
RDebugUtils.currentLine=45154328;
 //BA.debugLineNum = 45154328;BA.debugLine="enableVSTNG";
__ref._enablevstng /*String*/ (null);
RDebugUtils.currentLine=45154329;
 //BA.debugLineNum = 45154329;BA.debugLine="End Sub";
return "";
}
public String  _class_globals(b4a.example.settings __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="settings";
RDebugUtils.currentLine=44105728;
 //BA.debugLineNum = 44105728;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=44105729;
 //BA.debugLineNum = 44105729;BA.debugLine="Private Root As B4XView";
_root = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=44105730;
 //BA.debugLineNum = 44105730;BA.debugLine="Private xui As XUI";
_xui = new anywheresoftware.b4a.objects.B4XViewWrapper.XUI();
RDebugUtils.currentLine=44105733;
 //BA.debugLineNum = 44105733;BA.debugLine="Public URLveranstaltungen As String = \"https://we";
_urlveranstaltungen = "https://wertungslisten-app-default-rtdb.europe-west1.firebasedatabase.app/Vereine/[...]/Veranstaltungen";
RDebugUtils.currentLine=44105734;
 //BA.debugLineNum = 44105734;BA.debugLine="Public URLteilnehmer As String = \"https://wertung";
_urlteilnehmer = "https://wertungslisten-app-default-rtdb.europe-west1.firebasedatabase.app/Vereine/[...]/Teilnehmer";
RDebugUtils.currentLine=44105735;
 //BA.debugLineNum = 44105735;BA.debugLine="Public URLergebnisse As String = \"https://wertung";
_urlergebnisse = "https://wertungslisten-app-default-rtdb.europe-west1.firebasedatabase.app/Vereine/[...]/Ergebnisse";
RDebugUtils.currentLine=44105736;
 //BA.debugLineNum = 44105736;BA.debugLine="Public DBdatenTyp As String = \"\"";
_dbdatentyp = "";
RDebugUtils.currentLine=44105737;
 //BA.debugLineNum = 44105737;BA.debugLine="Public dochange As Boolean = False";
_dochange = __c.False;
RDebugUtils.currentLine=44105738;
 //BA.debugLineNum = 44105738;BA.debugLine="Public Status As Map";
_status = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=44105739;
 //BA.debugLineNum = 44105739;BA.debugLine="Public Veranstaltungen As Map";
_veranstaltungen = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=44105740;
 //BA.debugLineNum = 44105740;BA.debugLine="Public webviewVSTGN As List";
_webviewvstgn = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=44105741;
 //BA.debugLineNum = 44105741;BA.debugLine="Public Veranstaltung_ID As String = \"v0\"";
_veranstaltung_id = "v0";
RDebugUtils.currentLine=44105742;
 //BA.debugLineNum = 44105742;BA.debugLine="Public webviewVSTGN_ID As String = \"v0\"";
_webviewvstgn_id = "v0";
RDebugUtils.currentLine=44105743;
 //BA.debugLineNum = 44105743;BA.debugLine="Public VSTGNnewID As String = \"v1\"";
_vstgnnewid = "v1";
RDebugUtils.currentLine=44105744;
 //BA.debugLineNum = 44105744;BA.debugLine="Public Teilnehmer As List";
_teilnehmer = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=44105745;
 //BA.debugLineNum = 44105745;BA.debugLine="Public TLNid As String = \"t0\"";
_tlnid = "t0";
RDebugUtils.currentLine=44105746;
 //BA.debugLineNum = 44105746;BA.debugLine="Public TLNnewID As String = \"t1\"";
_tlnnewid = "t1";
RDebugUtils.currentLine=44105747;
 //BA.debugLineNum = 44105747;BA.debugLine="Public colorgreen As Int = 0xFF16AA16";
_colorgreen = ((int)0xff16aa16);
RDebugUtils.currentLine=44105748;
 //BA.debugLineNum = 44105748;BA.debugLine="Public colorblue As Int = 0xFF3333FF";
_colorblue = ((int)0xff3333ff);
RDebugUtils.currentLine=44105751;
 //BA.debugLineNum = 44105751;BA.debugLine="Private lblVerein As Label";
_lblverein = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=44105752;
 //BA.debugLineNum = 44105752;BA.debugLine="Private lblVeranstaltung As Label";
_lblveranstaltung = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=44105753;
 //BA.debugLineNum = 44105753;BA.debugLine="Private lblDatum As Label";
_lbldatum = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=44105754;
 //BA.debugLineNum = 44105754;BA.debugLine="Private btnBack As Button";
_btnback = new anywheresoftware.b4a.objects.ButtonWrapper();
RDebugUtils.currentLine=44105756;
 //BA.debugLineNum = 44105756;BA.debugLine="Private svMain As ScrollView";
_svmain = new anywheresoftware.b4a.objects.ScrollViewWrapper();
RDebugUtils.currentLine=44105757;
 //BA.debugLineNum = 44105757;BA.debugLine="Private lblClosed As Label";
_lblclosed = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=44105758;
 //BA.debugLineNum = 44105758;BA.debugLine="Private dprDatum As Button ' Ersetzt App Inventor";
_dprdatum = new anywheresoftware.b4a.objects.ButtonWrapper();
RDebugUtils.currentLine=44105759;
 //BA.debugLineNum = 44105759;BA.debugLine="Private btnAuswahl As Button";
_btnauswahl = new anywheresoftware.b4a.objects.ButtonWrapper();
RDebugUtils.currentLine=44105760;
 //BA.debugLineNum = 44105760;BA.debugLine="Private tbxVeranstaltung As EditText";
_tbxveranstaltung = new anywheresoftware.b4a.objects.EditTextWrapper();
RDebugUtils.currentLine=44105761;
 //BA.debugLineNum = 44105761;BA.debugLine="Private tbxAnzahl As EditText";
_tbxanzahl = new anywheresoftware.b4a.objects.EditTextWrapper();
RDebugUtils.currentLine=44105762;
 //BA.debugLineNum = 44105762;BA.debugLine="Private btnVerstgDelete As Button";
_btnverstgdelete = new anywheresoftware.b4a.objects.ButtonWrapper();
RDebugUtils.currentLine=44105763;
 //BA.debugLineNum = 44105763;BA.debugLine="Private btnVerstgSpeichern As Button";
_btnverstgspeichern = new anywheresoftware.b4a.objects.ButtonWrapper();
RDebugUtils.currentLine=44105765;
 //BA.debugLineNum = 44105765;BA.debugLine="Private lstVeranstaltungen As CustomListView";
_lstveranstaltungen = new b4a.example3.customlistview();
RDebugUtils.currentLine=44105766;
 //BA.debugLineNum = 44105766;BA.debugLine="Private lstTeilnehmer As CustomListView";
_lstteilnehmer = new b4a.example3.customlistview();
RDebugUtils.currentLine=44105768;
 //BA.debugLineNum = 44105768;BA.debugLine="Private tbxTeilnehmer As EditText";
_tbxteilnehmer = new anywheresoftware.b4a.objects.EditTextWrapper();
RDebugUtils.currentLine=44105769;
 //BA.debugLineNum = 44105769;BA.debugLine="Private btnTLNDelete As Button";
_btntlndelete = new anywheresoftware.b4a.objects.ButtonWrapper();
RDebugUtils.currentLine=44105770;
 //BA.debugLineNum = 44105770;BA.debugLine="Private btnTLNSpeichern As Button";
_btntlnspeichern = new anywheresoftware.b4a.objects.ButtonWrapper();
RDebugUtils.currentLine=44105773;
 //BA.debugLineNum = 44105773;BA.debugLine="Private Uhrzeit As Timer";
_uhrzeit = new anywheresoftware.b4a.objects.Timer();
RDebugUtils.currentLine=44105774;
 //BA.debugLineNum = 44105774;BA.debugLine="Private DBVerein As Map";
_dbverein = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=44105775;
 //BA.debugLineNum = 44105775;BA.debugLine="Private DBFileName As String = \"DBVerein.dat\"";
_dbfilename = "DBVerein.dat";
RDebugUtils.currentLine=44105776;
 //BA.debugLineNum = 44105776;BA.debugLine="Private CurrentWebUrl As String = \"\"";
_currentweburl = "";
RDebugUtils.currentLine=44105777;
 //BA.debugLineNum = 44105777;BA.debugLine="Private dprYear As Int";
_dpryear = 0;
RDebugUtils.currentLine=44105778;
 //BA.debugLineNum = 44105778;BA.debugLine="Private dprMonth As Int";
_dprmonth = 0;
RDebugUtils.currentLine=44105779;
 //BA.debugLineNum = 44105779;BA.debugLine="Private dprDay As Int";
_dprday = 0;
RDebugUtils.currentLine=44105780;
 //BA.debugLineNum = 44105780;BA.debugLine="End Sub";
return "";
}
public String  _clvteilnehmer_itemclick(b4a.example.settings __ref,int _index,Object _value) throws Exception{
__ref = this;
RDebugUtils.currentModule="settings";
if (Debug.shouldDelegate(ba, "clvteilnehmer_itemclick", false))
	 {return ((String) Debug.delegate(ba, "clvteilnehmer_itemclick", new Object[] {_index,_value}));}
RDebugUtils.currentLine=47579136;
 //BA.debugLineNum = 47579136;BA.debugLine="Private Sub CLVTeilnehmer_ItemClick(Index As Int,";
RDebugUtils.currentLine=47579138;
 //BA.debugLineNum = 47579138;BA.debugLine="TLNid = Value";
__ref._tlnid /*String*/  = BA.ObjectToString(_value);
RDebugUtils.currentLine=47579139;
 //BA.debugLineNum = 47579139;BA.debugLine="setzeTeilnehmer(TLNid)";
__ref._setzeteilnehmer /*String*/ (null,__ref._tlnid /*String*/ );
RDebugUtils.currentLine=47579141;
 //BA.debugLineNum = 47579141;BA.debugLine="End Sub";
return "";
}
public String  _setzeteilnehmer(b4a.example.settings __ref,String _tid) throws Exception{
__ref = this;
RDebugUtils.currentModule="settings";
if (Debug.shouldDelegate(ba, "setzeteilnehmer", false))
	 {return ((String) Debug.delegate(ba, "setzeteilnehmer", new Object[] {_tid}));}
int _idx = 0;
RDebugUtils.currentLine=45613056;
 //BA.debugLineNum = 45613056;BA.debugLine="Private Sub setzeTeilnehmer(tid As String)";
RDebugUtils.currentLine=45613057;
 //BA.debugLineNum = 45613057;BA.debugLine="disableTLN";
__ref._disabletln /*String*/ (null);
RDebugUtils.currentLine=45613058;
 //BA.debugLineNum = 45613058;BA.debugLine="If tid = \"t0\" Then";
if ((_tid).equals("t0")) { 
RDebugUtils.currentLine=45613059;
 //BA.debugLineNum = 45613059;BA.debugLine="dochange = False";
__ref._dochange /*boolean*/  = __c.False;
RDebugUtils.currentLine=45613060;
 //BA.debugLineNum = 45613060;BA.debugLine="tbxTeilnehmer.Text = \"\"";
__ref._tbxteilnehmer /*anywheresoftware.b4a.objects.EditTextWrapper*/ .setText(BA.ObjectToCharSequence(""));
RDebugUtils.currentLine=45613061;
 //BA.debugLineNum = 45613061;BA.debugLine="dochange = True";
__ref._dochange /*boolean*/  = __c.True;
RDebugUtils.currentLine=45613062;
 //BA.debugLineNum = 45613062;BA.debugLine="enableTLN";
__ref._enabletln /*String*/ (null);
RDebugUtils.currentLine=45613063;
 //BA.debugLineNum = 45613063;BA.debugLine="btnTLNDelete.TextColor = 0xFF888888";
__ref._btntlndelete /*anywheresoftware.b4a.objects.ButtonWrapper*/ .setTextColor(((int)0xff888888));
RDebugUtils.currentLine=45613064;
 //BA.debugLineNum = 45613064;BA.debugLine="btnTLNDelete.Enabled = False";
__ref._btntlndelete /*anywheresoftware.b4a.objects.ButtonWrapper*/ .setEnabled(__c.False);
 }else {
RDebugUtils.currentLine=45613066;
 //BA.debugLineNum = 45613066;BA.debugLine="If Teilnehmer.Size > 0 Then";
if (__ref._teilnehmer /*anywheresoftware.b4a.objects.collections.List*/ .getSize()>0) { 
RDebugUtils.currentLine=45613067;
 //BA.debugLineNum = 45613067;BA.debugLine="Dim idx As Int = Teilnehmer.IndexOf(tid)";
_idx = __ref._teilnehmer /*anywheresoftware.b4a.objects.collections.List*/ .IndexOf((Object)(_tid));
RDebugUtils.currentLine=45613068;
 //BA.debugLineNum = 45613068;BA.debugLine="If idx > 0 Then";
if (_idx>0) { 
RDebugUtils.currentLine=45613069;
 //BA.debugLineNum = 45613069;BA.debugLine="dochange = False";
__ref._dochange /*boolean*/  = __c.False;
RDebugUtils.currentLine=45613070;
 //BA.debugLineNum = 45613070;BA.debugLine="tbxTeilnehmer.Text = Teilnehmer.Get(idx - 1)";
__ref._tbxteilnehmer /*anywheresoftware.b4a.objects.EditTextWrapper*/ .setText(BA.ObjectToCharSequence(__ref._teilnehmer /*anywheresoftware.b4a.objects.collections.List*/ .Get((int) (_idx-1))));
RDebugUtils.currentLine=45613071;
 //BA.debugLineNum = 45613071;BA.debugLine="dochange = True";
__ref._dochange /*boolean*/  = __c.True;
RDebugUtils.currentLine=45613072;
 //BA.debugLineNum = 45613072;BA.debugLine="enableTLN";
__ref._enabletln /*String*/ (null);
 };
 };
 };
RDebugUtils.currentLine=45613076;
 //BA.debugLineNum = 45613076;BA.debugLine="If tbxTeilnehmer.Enabled Then";
if (__ref._tbxteilnehmer /*anywheresoftware.b4a.objects.EditTextWrapper*/ .getEnabled()) { 
RDebugUtils.currentLine=45613077;
 //BA.debugLineNum = 45613077;BA.debugLine="tbxTeilnehmer.RequestFocus";
__ref._tbxteilnehmer /*anywheresoftware.b4a.objects.EditTextWrapper*/ .RequestFocus();
 };
RDebugUtils.currentLine=45613079;
 //BA.debugLineNum = 45613079;BA.debugLine="End Sub";
return "";
}
public String  _clvveranstaltungen_itemclick(b4a.example.settings __ref,int _index,Object _value) throws Exception{
__ref = this;
RDebugUtils.currentModule="settings";
if (Debug.shouldDelegate(ba, "clvveranstaltungen_itemclick", false))
	 {return ((String) Debug.delegate(ba, "clvveranstaltungen_itemclick", new Object[] {_index,_value}));}
RDebugUtils.currentLine=47448064;
 //BA.debugLineNum = 47448064;BA.debugLine="Private Sub CLVVeranstaltungen_ItemClick(Index As";
RDebugUtils.currentLine=47448066;
 //BA.debugLineNum = 47448066;BA.debugLine="webviewVSTGN_ID = Value";
__ref._webviewvstgn_id /*String*/  = BA.ObjectToString(_value);
RDebugUtils.currentLine=47448067;
 //BA.debugLineNum = 47448067;BA.debugLine="setzeVeranstaltung(webviewVSTGN_ID)";
__ref._setzeveranstaltung /*String*/ (null,__ref._webviewvstgn_id /*String*/ );
RDebugUtils.currentLine=47448069;
 //BA.debugLineNum = 47448069;BA.debugLine="End Sub";
return "";
}
public String  _setzeveranstaltung(b4a.example.settings __ref,String _vid) throws Exception{
__ref = this;
RDebugUtils.currentModule="settings";
if (Debug.shouldDelegate(ba, "setzeveranstaltung", false))
	 {return ((String) Debug.delegate(ba, "setzeveranstaltung", new Object[] {_vid}));}
anywheresoftware.b4a.objects.collections.Map _veranstaltung = null;
String _datum = "";
String[] _datum_spl = null;
RDebugUtils.currentLine=45023232;
 //BA.debugLineNum = 45023232;BA.debugLine="Private Sub setzeVeranstaltung(vid As String)";
RDebugUtils.currentLine=45023233;
 //BA.debugLineNum = 45023233;BA.debugLine="disableVSTNG";
__ref._disablevstng /*String*/ (null);
RDebugUtils.currentLine=45023234;
 //BA.debugLineNum = 45023234;BA.debugLine="Dim veranstaltung As Map";
_veranstaltung = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=45023235;
 //BA.debugLineNum = 45023235;BA.debugLine="If Veranstaltungen.IsInitialized And Veranstaltun";
if (__ref._veranstaltungen /*anywheresoftware.b4a.objects.collections.Map*/ .IsInitialized() && __ref._veranstaltungen /*anywheresoftware.b4a.objects.collections.Map*/ .ContainsKey((Object)(_vid))) { 
RDebugUtils.currentLine=45023236;
 //BA.debugLineNum = 45023236;BA.debugLine="veranstaltung = Veranstaltungen.Get(vid)";
_veranstaltung = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(__ref._veranstaltungen /*anywheresoftware.b4a.objects.collections.Map*/ .Get((Object)(_vid))));
 }else {
RDebugUtils.currentLine=45023238;
 //BA.debugLineNum = 45023238;BA.debugLine="veranstaltung.Initialize";
_veranstaltung.Initialize();
 };
RDebugUtils.currentLine=45023241;
 //BA.debugLineNum = 45023241;BA.debugLine="Dim datum As String = veranstaltung.GetDefault(\"D";
_datum = BA.ObjectToString(_veranstaltung.GetDefault((Object)("Datum"),(Object)(__ref._formatdatecustom /*String*/ (null,__c.DateTime.getNow(),"dd.MM.yyyy"))));
RDebugUtils.currentLine=45023242;
 //BA.debugLineNum = 45023242;BA.debugLine="Dim datum_spl() As String = Regex.Split(\"\\.\", dat";
_datum_spl = __c.Regex.Split("\\.",_datum);
RDebugUtils.currentLine=45023243;
 //BA.debugLineNum = 45023243;BA.debugLine="If datum_spl.Length >= 3 Then";
if (_datum_spl.length>=3) { 
RDebugUtils.currentLine=45023244;
 //BA.debugLineNum = 45023244;BA.debugLine="dprYear = datum_spl(2)";
__ref._dpryear /*int*/  = (int)(Double.parseDouble(_datum_spl[(int) (2)]));
RDebugUtils.currentLine=45023245;
 //BA.debugLineNum = 45023245;BA.debugLine="dprMonth = datum_spl(1)";
__ref._dprmonth /*int*/  = (int)(Double.parseDouble(_datum_spl[(int) (1)]));
RDebugUtils.currentLine=45023246;
 //BA.debugLineNum = 45023246;BA.debugLine="dprDay = datum_spl(0)";
__ref._dprday /*int*/  = (int)(Double.parseDouble(_datum_spl[(int) (0)]));
 };
RDebugUtils.currentLine=45023249;
 //BA.debugLineNum = 45023249;BA.debugLine="dprDatum.Text = datum";
__ref._dprdatum /*anywheresoftware.b4a.objects.ButtonWrapper*/ .setText(BA.ObjectToCharSequence(_datum));
RDebugUtils.currentLine=45023254;
 //BA.debugLineNum = 45023254;BA.debugLine="tbxAnzahl.Text = veranstaltung.GetDefault(\"Teilne";
__ref._tbxanzahl /*anywheresoftware.b4a.objects.EditTextWrapper*/ .setText(BA.ObjectToCharSequence(_veranstaltung.GetDefault((Object)("Teilnehmerzahl"),(Object)("0"))));
RDebugUtils.currentLine=45023256;
 //BA.debugLineNum = 45023256;BA.debugLine="If \"offen\" = veranstaltung.GetDefault(\"Status\", \"";
if (("offen").equals(BA.ObjectToString(_veranstaltung.GetDefault((Object)("Status"),(Object)("offen"))))) { 
RDebugUtils.currentLine=45023257;
 //BA.debugLineNum = 45023257;BA.debugLine="dprDatum.Enabled = True";
__ref._dprdatum /*anywheresoftware.b4a.objects.ButtonWrapper*/ .setEnabled(__c.True);
RDebugUtils.currentLine=45023258;
 //BA.debugLineNum = 45023258;BA.debugLine="dprDatum.TextColor = colorgreen";
__ref._dprdatum /*anywheresoftware.b4a.objects.ButtonWrapper*/ .setTextColor(__ref._colorgreen /*int*/ );
RDebugUtils.currentLine=45023259;
 //BA.debugLineNum = 45023259;BA.debugLine="tbxVeranstaltung.Enabled = True";
__ref._tbxveranstaltung /*anywheresoftware.b4a.objects.EditTextWrapper*/ .setEnabled(__c.True);
RDebugUtils.currentLine=45023260;
 //BA.debugLineNum = 45023260;BA.debugLine="tbxAnzahl.Enabled = True";
__ref._tbxanzahl /*anywheresoftware.b4a.objects.EditTextWrapper*/ .setEnabled(__c.True);
RDebugUtils.currentLine=45023261;
 //BA.debugLineNum = 45023261;BA.debugLine="lblClosed.Visible = False";
__ref._lblclosed /*anywheresoftware.b4a.objects.LabelWrapper*/ .setVisible(__c.False);
 }else {
RDebugUtils.currentLine=45023263;
 //BA.debugLineNum = 45023263;BA.debugLine="lblClosed.Visible = True";
__ref._lblclosed /*anywheresoftware.b4a.objects.LabelWrapper*/ .setVisible(__c.True);
 };
RDebugUtils.currentLine=45023266;
 //BA.debugLineNum = 45023266;BA.debugLine="btnVerstgDelete.Enabled = True";
__ref._btnverstgdelete /*anywheresoftware.b4a.objects.ButtonWrapper*/ .setEnabled(__c.True);
RDebugUtils.currentLine=45023267;
 //BA.debugLineNum = 45023267;BA.debugLine="btnVerstgDelete.TextColor = colorgreen";
__ref._btnverstgdelete /*anywheresoftware.b4a.objects.ButtonWrapper*/ .setTextColor(__ref._colorgreen /*int*/ );
RDebugUtils.currentLine=45023269;
 //BA.debugLineNum = 45023269;BA.debugLine="If vid <> \"v0\" Then";
if ((_vid).equals("v0") == false) { 
RDebugUtils.currentLine=45023270;
 //BA.debugLineNum = 45023270;BA.debugLine="btnAuswahl.TextColor = colorblue";
__ref._btnauswahl /*anywheresoftware.b4a.objects.ButtonWrapper*/ .setTextColor(__ref._colorblue /*int*/ );
RDebugUtils.currentLine=45023271;
 //BA.debugLineNum = 45023271;BA.debugLine="btnAuswahl.Enabled = True";
__ref._btnauswahl /*anywheresoftware.b4a.objects.ButtonWrapper*/ .setEnabled(__c.True);
 };
RDebugUtils.currentLine=45023273;
 //BA.debugLineNum = 45023273;BA.debugLine="End Sub";
return "";
}
public long  _dateutils_setdate(b4a.example.settings __ref,int _year,int _month,int _day) throws Exception{
__ref = this;
RDebugUtils.currentModule="settings";
if (Debug.shouldDelegate(ba, "dateutils_setdate", false))
	 {return ((Long) Debug.delegate(ba, "dateutils_setdate", new Object[] {_year,_month,_day}));}
String _oldformat = "";
String _paddedmonth = "";
String _paddedday = "";
long _ticks = 0L;
RDebugUtils.currentLine=46137344;
 //BA.debugLineNum = 46137344;BA.debugLine="Private Sub DateUtils_SetDate(Year As Int, Month A";
RDebugUtils.currentLine=46137345;
 //BA.debugLineNum = 46137345;BA.debugLine="Dim oldFormat As String = DateTime.DateFormat";
_oldformat = __c.DateTime.getDateFormat();
RDebugUtils.currentLine=46137346;
 //BA.debugLineNum = 46137346;BA.debugLine="DateTime.DateFormat = \"yyyy-MM-dd\"";
__c.DateTime.setDateFormat("yyyy-MM-dd");
RDebugUtils.currentLine=46137347;
 //BA.debugLineNum = 46137347;BA.debugLine="Dim paddedMonth As String = NumberFormat(Month, 2";
_paddedmonth = __c.NumberFormat(_month,(int) (2),(int) (0));
RDebugUtils.currentLine=46137348;
 //BA.debugLineNum = 46137348;BA.debugLine="Dim paddedDay As String = NumberFormat(Day, 2, 0)";
_paddedday = __c.NumberFormat(_day,(int) (2),(int) (0));
RDebugUtils.currentLine=46137349;
 //BA.debugLineNum = 46137349;BA.debugLine="Dim ticks As Long = DateTime.DateParse(Year & \"-\"";
_ticks = __c.DateTime.DateParse(BA.NumberToString(_year)+"-"+_paddedmonth+"-"+_paddedday);
RDebugUtils.currentLine=46137350;
 //BA.debugLineNum = 46137350;BA.debugLine="DateTime.DateFormat = oldFormat";
__c.DateTime.setDateFormat(_oldformat);
RDebugUtils.currentLine=46137351;
 //BA.debugLineNum = 46137351;BA.debugLine="Return ticks";
if (true) return _ticks;
RDebugUtils.currentLine=46137352;
 //BA.debugLineNum = 46137352;BA.debugLine="End Sub";
return 0L;
}
public void  _executehttp(b4a.example.settings __ref,String _method,String _url,String _payload) throws Exception{
RDebugUtils.currentModule="settings";
if (Debug.shouldDelegate(ba, "executehttp", false))
	 {Debug.delegate(ba, "executehttp", new Object[] {_method,_url,_payload}); return;}
ResumableSub_ExecuteHttp rsub = new ResumableSub_ExecuteHttp(this,__ref,_method,_url,_payload);
rsub.resume(ba, null);
}
public static class ResumableSub_ExecuteHttp extends BA.ResumableSub {
public ResumableSub_ExecuteHttp(b4a.example.settings parent,b4a.example.settings __ref,String _method,String _url,String _payload) {
this.parent = parent;
this.__ref = __ref;
this._method = _method;
this._url = _url;
this._payload = _payload;
this.__ref = parent;
}
b4a.example.settings __ref;
b4a.example.settings parent;
String _method;
String _url;
String _payload;
String _typ = "";
b4a.example.httpjob _j;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="settings";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=45809665;
 //BA.debugLineNum = 45809665;BA.debugLine="Dim typ As String = DBdatenTyp";
_typ = __ref._dbdatentyp /*String*/ ;
RDebugUtils.currentLine=45809666;
 //BA.debugLineNum = 45809666;BA.debugLine="Dim j As HttpJob";
_j = new b4a.example.httpjob();
RDebugUtils.currentLine=45809667;
 //BA.debugLineNum = 45809667;BA.debugLine="j.Initialize(typ, Me)";
_j._initialize /*String*/ (null,ba,_typ,parent);
RDebugUtils.currentLine=45809669;
 //BA.debugLineNum = 45809669;BA.debugLine="Select method";
if (true) break;

case 1:
//select
this.state = 8;
switch (BA.switchObjectToInt(_method,"GET","PUT","DELETE")) {
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
RDebugUtils.currentLine=45809671;
 //BA.debugLineNum = 45809671;BA.debugLine="j.Download(url)";
_j._download /*String*/ (null,_url);
 if (true) break;

case 5:
//C
this.state = 8;
RDebugUtils.currentLine=45809673;
 //BA.debugLineNum = 45809673;BA.debugLine="j.PutString(url, payload)";
_j._putstring /*String*/ (null,_url,_payload);
RDebugUtils.currentLine=45809674;
 //BA.debugLineNum = 45809674;BA.debugLine="j.GetRequest.SetContentType(\"application/json\")";
_j._getrequest /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ (null).SetContentType("application/json");
 if (true) break;

case 7:
//C
this.state = 8;
RDebugUtils.currentLine=45809676;
 //BA.debugLineNum = 45809676;BA.debugLine="j.Delete(url)";
_j._delete /*String*/ (null,_url);
 if (true) break;

case 8:
//C
this.state = 9;
;
RDebugUtils.currentLine=45809679;
 //BA.debugLineNum = 45809679;BA.debugLine="Wait For (j) JobDone(j As HttpJob)";
parent.__c.WaitFor("jobdone", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "settings", "executehttp"), (Object)(_j));
this.state = 21;
return;
case 21:
//C
this.state = 9;
_j = (b4a.example.httpjob) result[1];
;
RDebugUtils.currentLine=45809681;
 //BA.debugLineNum = 45809681;BA.debugLine="If j.Success Then";
if (true) break;

case 9:
//if
this.state = 20;
if (_j._success /*boolean*/ ) { 
this.state = 11;
}else {
this.state = 13;
}if (true) break;

case 11:
//C
this.state = 20;
RDebugUtils.currentLine=45809682;
 //BA.debugLineNum = 45809682;BA.debugLine="HandleGotText(typ, url, j.GetString)";
__ref._handlegottext /*String*/ (null,_typ,_url,_j._getstring /*String*/ (null));
 if (true) break;

case 13:
//C
this.state = 14;
RDebugUtils.currentLine=45809684;
 //BA.debugLineNum = 45809684;BA.debugLine="If j.ErrorMessage.ToLowerCase.Contains(\"unable t";
if (true) break;

case 14:
//if
this.state = 19;
if (_j._errormessage /*String*/ .toLowerCase(anywheresoftware.b4a.keywords.Common.stringLocale).contains("unable to resolve") || _j._errormessage /*String*/ .toLowerCase(anywheresoftware.b4a.keywords.Common.stringLocale).contains("connect") || _j._errormessage /*String*/ .toLowerCase(anywheresoftware.b4a.keywords.Common.stringLocale).contains("timeout")) { 
this.state = 16;
}else {
this.state = 18;
}if (true) break;

case 16:
//C
this.state = 19;
RDebugUtils.currentLine=45809685;
 //BA.debugLineNum = 45809685;BA.debugLine="setzeOffline";
__ref._setzeoffline /*void*/ (null);
 if (true) break;

case 18:
//C
this.state = 19;
RDebugUtils.currentLine=45809687;
 //BA.debugLineNum = 45809687;BA.debugLine="ToastMessageShow(\"Fehler: \" & j.ErrorMessage, T";
parent.__c.ToastMessageShow(BA.ObjectToCharSequence("Fehler: "+_j._errormessage /*String*/ ),parent.__c.True);
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
RDebugUtils.currentLine=45809690;
 //BA.debugLineNum = 45809690;BA.debugLine="j.Release";
_j._release /*String*/ (null);
RDebugUtils.currentLine=45809691;
 //BA.debugLineNum = 45809691;BA.debugLine="startTimer";
__ref._starttimer /*String*/ (null);
RDebugUtils.currentLine=45809692;
 //BA.debugLineNum = 45809692;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public String  _enabletln(b4a.example.settings __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="settings";
if (Debug.shouldDelegate(ba, "enabletln", false))
	 {return ((String) Debug.delegate(ba, "enabletln", null));}
RDebugUtils.currentLine=44695552;
 //BA.debugLineNum = 44695552;BA.debugLine="Private Sub enableTLN";
RDebugUtils.currentLine=44695553;
 //BA.debugLineNum = 44695553;BA.debugLine="btnTLNDelete.Enabled = True";
__ref._btntlndelete /*anywheresoftware.b4a.objects.ButtonWrapper*/ .setEnabled(__c.True);
RDebugUtils.currentLine=44695554;
 //BA.debugLineNum = 44695554;BA.debugLine="btnTLNSpeichern.Enabled = False";
__ref._btntlnspeichern /*anywheresoftware.b4a.objects.ButtonWrapper*/ .setEnabled(__c.False);
RDebugUtils.currentLine=44695555;
 //BA.debugLineNum = 44695555;BA.debugLine="tbxTeilnehmer.Enabled = True";
__ref._tbxteilnehmer /*anywheresoftware.b4a.objects.EditTextWrapper*/ .setEnabled(__c.True);
RDebugUtils.currentLine=44695556;
 //BA.debugLineNum = 44695556;BA.debugLine="btnTLNDelete.TextColor = colorgreen";
__ref._btntlndelete /*anywheresoftware.b4a.objects.ButtonWrapper*/ .setTextColor(__ref._colorgreen /*int*/ );
RDebugUtils.currentLine=44695557;
 //BA.debugLineNum = 44695557;BA.debugLine="btnTLNSpeichern.TextColor = 0xFF888888";
__ref._btntlnspeichern /*anywheresoftware.b4a.objects.ButtonWrapper*/ .setTextColor(((int)0xff888888));
RDebugUtils.currentLine=44695558;
 //BA.debugLineNum = 44695558;BA.debugLine="End Sub";
return "";
}
public String  _delveranstaltung(b4a.example.settings __ref,String _vid) throws Exception{
__ref = this;
RDebugUtils.currentModule="settings";
if (Debug.shouldDelegate(ba, "delveranstaltung", false))
	 {return ((String) Debug.delegate(ba, "delveranstaltung", new Object[] {_vid}));}
anywheresoftware.b4a.objects.collections.Map _veranstaltung = null;
String _vname = "";
String _vdatum = "";
RDebugUtils.currentLine=45350912;
 //BA.debugLineNum = 45350912;BA.debugLine="Private Sub delVeranstaltung(vid As String)";
RDebugUtils.currentLine=45350913;
 //BA.debugLineNum = 45350913;BA.debugLine="disableVSTNG";
__ref._disablevstng /*String*/ (null);
RDebugUtils.currentLine=45350914;
 //BA.debugLineNum = 45350914;BA.debugLine="If Veranstaltungen.IsInitialized And Veranstaltun";
if (__ref._veranstaltungen /*anywheresoftware.b4a.objects.collections.Map*/ .IsInitialized() && __ref._veranstaltungen /*anywheresoftware.b4a.objects.collections.Map*/ .ContainsKey((Object)(_vid))) { 
RDebugUtils.currentLine=45350915;
 //BA.debugLineNum = 45350915;BA.debugLine="Dim veranstaltung As Map = Veranstaltungen.Get(v";
_veranstaltung = new anywheresoftware.b4a.objects.collections.Map();
_veranstaltung = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(__ref._veranstaltungen /*anywheresoftware.b4a.objects.collections.Map*/ .Get((Object)(_vid))));
RDebugUtils.currentLine=45350916;
 //BA.debugLineNum = 45350916;BA.debugLine="Dim vName As String = veranstaltung.GetDefault(\"";
_vname = BA.ObjectToString(_veranstaltung.GetDefault((Object)("Name"),(Object)(" unbenannt ")));
RDebugUtils.currentLine=45350917;
 //BA.debugLineNum = 45350917;BA.debugLine="Dim vDatum As String = veranstaltung.GetDefault(";
_vdatum = BA.ObjectToString(_veranstaltung.GetDefault((Object)("Datum"),(Object)(__ref._formatdatecustom /*String*/ (null,__c.DateTime.getNow(),"dd.MM.yyyy"))));
RDebugUtils.currentLine=45350918;
 //BA.debugLineNum = 45350918;BA.debugLine="ToastMessageShow(\"Die Veranstaltung \" & vName &";
__c.ToastMessageShow(BA.ObjectToCharSequence("Die Veranstaltung "+_vname+" vom "+_vdatum+" wird gelöscht!"),__c.False);
RDebugUtils.currentLine=45350920;
 //BA.debugLineNum = 45350920;BA.debugLine="DBdatenTyp = \"delVeranstaltung\"";
__ref._dbdatentyp /*String*/  = "delVeranstaltung";
RDebugUtils.currentLine=45350921;
 //BA.debugLineNum = 45350921;BA.debugLine="CurrentWebUrl = URLveranstaltungen & \"/\" & vid &";
__ref._currentweburl /*String*/  = __ref._urlveranstaltungen /*String*/ +"/"+_vid+".json?auth="+BA.ObjectToString(__ref._status /*anywheresoftware.b4a.objects.collections.Map*/ .GetDefault((Object)("idToken"),(Object)("")));
RDebugUtils.currentLine=45350922;
 //BA.debugLineNum = 45350922;BA.debugLine="ExecuteHttp(\"DELETE\", CurrentWebUrl, \"\")";
__ref._executehttp /*void*/ (null,"DELETE",__ref._currentweburl /*String*/ ,"");
 };
RDebugUtils.currentLine=45350924;
 //BA.debugLineNum = 45350924;BA.debugLine="enableVSTNG";
__ref._enablevstng /*String*/ (null);
RDebugUtils.currentLine=45350925;
 //BA.debugLineNum = 45350925;BA.debugLine="End Sub";
return "";
}
public String  _formatdatecustom(b4a.example.settings __ref,long _ticks,String _pattern) throws Exception{
__ref = this;
RDebugUtils.currentModule="settings";
if (Debug.shouldDelegate(ba, "formatdatecustom", false))
	 {return ((String) Debug.delegate(ba, "formatdatecustom", new Object[] {_ticks,_pattern}));}
String _oldformat = "";
String _res = "";
RDebugUtils.currentLine=47054848;
 //BA.debugLineNum = 47054848;BA.debugLine="Private Sub FormatDateCustom(ticks As Long, patter";
RDebugUtils.currentLine=47054849;
 //BA.debugLineNum = 47054849;BA.debugLine="Dim oldFormat As String = DateTime.DateFormat";
_oldformat = __c.DateTime.getDateFormat();
RDebugUtils.currentLine=47054850;
 //BA.debugLineNum = 47054850;BA.debugLine="DateTime.DateFormat = pattern";
__c.DateTime.setDateFormat(_pattern);
RDebugUtils.currentLine=47054851;
 //BA.debugLineNum = 47054851;BA.debugLine="Dim res As String = DateTime.Date(ticks)";
_res = __c.DateTime.Date(_ticks);
RDebugUtils.currentLine=47054852;
 //BA.debugLineNum = 47054852;BA.debugLine="DateTime.DateFormat = oldFormat";
__c.DateTime.setDateFormat(_oldformat);
RDebugUtils.currentLine=47054853;
 //BA.debugLineNum = 47054853;BA.debugLine="Return res";
if (true) return _res;
RDebugUtils.currentLine=47054854;
 //BA.debugLineNum = 47054854;BA.debugLine="End Sub";
return "";
}
public String  _enablevstng(b4a.example.settings __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="settings";
if (Debug.shouldDelegate(ba, "enablevstng", false))
	 {return ((String) Debug.delegate(ba, "enablevstng", null));}
RDebugUtils.currentLine=44564480;
 //BA.debugLineNum = 44564480;BA.debugLine="Private Sub enableVSTNG";
RDebugUtils.currentLine=44564481;
 //BA.debugLineNum = 44564481;BA.debugLine="dprDatum.Enabled = True";
__ref._dprdatum /*anywheresoftware.b4a.objects.ButtonWrapper*/ .setEnabled(__c.True);
RDebugUtils.currentLine=44564482;
 //BA.debugLineNum = 44564482;BA.debugLine="dprDatum.TextColor = colorgreen";
__ref._dprdatum /*anywheresoftware.b4a.objects.ButtonWrapper*/ .setTextColor(__ref._colorgreen /*int*/ );
RDebugUtils.currentLine=44564483;
 //BA.debugLineNum = 44564483;BA.debugLine="btnVerstgDelete.Enabled = True";
__ref._btnverstgdelete /*anywheresoftware.b4a.objects.ButtonWrapper*/ .setEnabled(__c.True);
RDebugUtils.currentLine=44564484;
 //BA.debugLineNum = 44564484;BA.debugLine="btnVerstgDelete.TextColor = colorgreen";
__ref._btnverstgdelete /*anywheresoftware.b4a.objects.ButtonWrapper*/ .setTextColor(__ref._colorgreen /*int*/ );
RDebugUtils.currentLine=44564485;
 //BA.debugLineNum = 44564485;BA.debugLine="btnVerstgSpeichern.Enabled = False";
__ref._btnverstgspeichern /*anywheresoftware.b4a.objects.ButtonWrapper*/ .setEnabled(__c.False);
RDebugUtils.currentLine=44564486;
 //BA.debugLineNum = 44564486;BA.debugLine="btnVerstgSpeichern.TextColor = 0xFF888888";
__ref._btnverstgspeichern /*anywheresoftware.b4a.objects.ButtonWrapper*/ .setTextColor(((int)0xff888888));
RDebugUtils.currentLine=44564487;
 //BA.debugLineNum = 44564487;BA.debugLine="tbxVeranstaltung.Enabled = True";
__ref._tbxveranstaltung /*anywheresoftware.b4a.objects.EditTextWrapper*/ .setEnabled(__c.True);
RDebugUtils.currentLine=44564488;
 //BA.debugLineNum = 44564488;BA.debugLine="tbxAnzahl.Enabled = True";
__ref._tbxanzahl /*anywheresoftware.b4a.objects.EditTextWrapper*/ .setEnabled(__c.True);
RDebugUtils.currentLine=44564489;
 //BA.debugLineNum = 44564489;BA.debugLine="btnAuswahl.Enabled = False";
__ref._btnauswahl /*anywheresoftware.b4a.objects.ButtonWrapper*/ .setEnabled(__c.False);
RDebugUtils.currentLine=44564490;
 //BA.debugLineNum = 44564490;BA.debugLine="btnAuswahl.TextColor = 0xFF888888";
__ref._btnauswahl /*anywheresoftware.b4a.objects.ButtonWrapper*/ .setTextColor(((int)0xff888888));
RDebugUtils.currentLine=44564491;
 //BA.debugLineNum = 44564491;BA.debugLine="End Sub";
return "";
}
public void  _dprdatum_click(b4a.example.settings __ref) throws Exception{
RDebugUtils.currentModule="settings";
if (Debug.shouldDelegate(ba, "dprdatum_click", false))
	 {Debug.delegate(ba, "dprdatum_click", null); return;}
ResumableSub_dprDatum_Click rsub = new ResumableSub_dprDatum_Click(this,__ref);
rsub.resume(ba, null);
}
public static class ResumableSub_dprDatum_Click extends BA.ResumableSub {
public ResumableSub_dprDatum_Click(b4a.example.settings parent,b4a.example.settings __ref) {
this.parent = parent;
this.__ref = __ref;
this.__ref = parent;
}
b4a.example.settings __ref;
b4a.example.settings parent;
anywheresoftware.b4j.object.JavaObject _ctxt = null;
Object _listener = null;
anywheresoftware.b4j.object.JavaObject _dlg = null;
String _methodname;
Object[] _args;
int _mzerobased = 0;
long _ticks = 0L;
boolean _neu = false;
String _key = "";
anywheresoftware.b4a.objects.collections.Map _veranstaltung = null;
String _datum = "";
int _anzval = 0;
anywheresoftware.b4a.BA.IterableList group20;
int index20;
int groupLen20;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="settings";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=46071809;
 //BA.debugLineNum = 46071809;BA.debugLine="Dim ctxt As JavaObject";
_ctxt = new anywheresoftware.b4j.object.JavaObject();
RDebugUtils.currentLine=46071810;
 //BA.debugLineNum = 46071810;BA.debugLine="ctxt.InitializeContext";
_ctxt.InitializeContext(ba);
RDebugUtils.currentLine=46071812;
 //BA.debugLineNum = 46071812;BA.debugLine="Dim listener As Object = ctxt.CreateEventFromUI(\"";
_listener = _ctxt.CreateEventFromUI(ba,"android.app.DatePickerDialog$OnDateSetListener","DateSet",parent.__c.Null);
RDebugUtils.currentLine=46071813;
 //BA.debugLineNum = 46071813;BA.debugLine="Dim dlg As JavaObject";
_dlg = new anywheresoftware.b4j.object.JavaObject();
RDebugUtils.currentLine=46071814;
 //BA.debugLineNum = 46071814;BA.debugLine="dlg.InitializeNewInstance(\"android.app.DatePicker";
_dlg.InitializeNewInstance("android.app.DatePickerDialog",new Object[]{(Object)(_ctxt.getObject()),_listener,(Object)(__ref._dpryear /*int*/ ),(Object)(__ref._dprmonth /*int*/ -1),(Object)(__ref._dprday /*int*/ )});
RDebugUtils.currentLine=46071815;
 //BA.debugLineNum = 46071815;BA.debugLine="dlg.RunMethod(\"show\", Null)";
_dlg.RunMethod("show",(Object[])(parent.__c.Null));
RDebugUtils.currentLine=46071817;
 //BA.debugLineNum = 46071817;BA.debugLine="Wait For DateSet_Event (MethodName As String, Arg";
parent.__c.WaitFor("dateset_event", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "settings", "dprdatum_click"), null);
this.state = 28;
return;
case 28:
//C
this.state = 1;
_methodname = (String) result[1];
_args = (Object[]) result[2];
;
RDebugUtils.currentLine=46071818;
 //BA.debugLineNum = 46071818;BA.debugLine="If Args.Length >= 4 Then";
if (true) break;

case 1:
//if
this.state = 27;
if (_args.length>=4) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
RDebugUtils.currentLine=46071819;
 //BA.debugLineNum = 46071819;BA.debugLine="dprYear = Args(1)";
__ref._dpryear /*int*/  = (int)(BA.ObjectToNumber(_args[(int) (1)]));
RDebugUtils.currentLine=46071820;
 //BA.debugLineNum = 46071820;BA.debugLine="Dim mZeroBased As Int = Args(2)";
_mzerobased = (int)(BA.ObjectToNumber(_args[(int) (2)]));
RDebugUtils.currentLine=46071821;
 //BA.debugLineNum = 46071821;BA.debugLine="dprMonth = mZeroBased + 1";
__ref._dprmonth /*int*/  = (int) (_mzerobased+1);
RDebugUtils.currentLine=46071822;
 //BA.debugLineNum = 46071822;BA.debugLine="dprDay = Args(3)";
__ref._dprday /*int*/  = (int)(BA.ObjectToNumber(_args[(int) (3)]));
RDebugUtils.currentLine=46071824;
 //BA.debugLineNum = 46071824;BA.debugLine="Dim ticks As Long = DateUtils_SetDate(dprYear, d";
_ticks = __ref._dateutils_setdate /*long*/ (null,__ref._dpryear /*int*/ ,__ref._dprmonth /*int*/ ,__ref._dprday /*int*/ );
RDebugUtils.currentLine=46071825;
 //BA.debugLineNum = 46071825;BA.debugLine="dprDatum.Text = FormatDateCustom(ticks, \"dd.MM.y";
__ref._dprdatum /*anywheresoftware.b4a.objects.ButtonWrapper*/ .setText(BA.ObjectToCharSequence(__ref._formatdatecustom /*String*/ (null,_ticks,"dd.MM.yyyy")));
RDebugUtils.currentLine=46071827;
 //BA.debugLineNum = 46071827;BA.debugLine="btnAuswahl.Enabled = False";
__ref._btnauswahl /*anywheresoftware.b4a.objects.ButtonWrapper*/ .setEnabled(parent.__c.False);
RDebugUtils.currentLine=46071828;
 //BA.debugLineNum = 46071828;BA.debugLine="btnAuswahl.TextColor = 0xFF888888";
__ref._btnauswahl /*anywheresoftware.b4a.objects.ButtonWrapper*/ .setTextColor(((int)0xff888888));
RDebugUtils.currentLine=46071830;
 //BA.debugLineNum = 46071830;BA.debugLine="If dprDatum.Text <> DBGet(\"VeranstaltungDatum\",";
if (true) break;

case 4:
//if
this.state = 26;
if ((__ref._dprdatum /*anywheresoftware.b4a.objects.ButtonWrapper*/ .getText()).equals(BA.ObjectToString(__ref._dbget /*Object*/ (null,"VeranstaltungDatum",(Object)("")))) == false) { 
this.state = 6;
}if (true) break;

case 6:
//C
this.state = 7;
RDebugUtils.currentLine=46071831;
 //BA.debugLineNum = 46071831;BA.debugLine="Dim neu As Boolean = True";
_neu = parent.__c.True;
RDebugUtils.currentLine=46071832;
 //BA.debugLineNum = 46071832;BA.debugLine="If Veranstaltungen.IsInitialized Then";
if (true) break;

case 7:
//if
this.state = 18;
if (__ref._veranstaltungen /*anywheresoftware.b4a.objects.collections.Map*/ .IsInitialized()) { 
this.state = 9;
}if (true) break;

case 9:
//C
this.state = 10;
RDebugUtils.currentLine=46071833;
 //BA.debugLineNum = 46071833;BA.debugLine="For Each key As String In Veranstaltungen.Keys";
if (true) break;

case 10:
//for
this.state = 17;
group20 = __ref._veranstaltungen /*anywheresoftware.b4a.objects.collections.Map*/ .Keys();
index20 = 0;
groupLen20 = group20.getSize();
this.state = 29;
if (true) break;

case 29:
//C
this.state = 17;
if (index20 < groupLen20) {
this.state = 12;
_key = BA.ObjectToString(group20.Get(index20));}
if (true) break;

case 30:
//C
this.state = 29;
index20++;
if (true) break;

case 12:
//C
this.state = 13;
RDebugUtils.currentLine=46071834;
 //BA.debugLineNum = 46071834;BA.debugLine="Dim veranstaltung As Map = Veranstaltungen.Ge";
_veranstaltung = new anywheresoftware.b4a.objects.collections.Map();
_veranstaltung = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(__ref._veranstaltungen /*anywheresoftware.b4a.objects.collections.Map*/ .Get((Object)(_key))));
RDebugUtils.currentLine=46071835;
 //BA.debugLineNum = 46071835;BA.debugLine="Dim datum As String = veranstaltung.GetDefaul";
_datum = BA.ObjectToString(_veranstaltung.GetDefault((Object)("Datum"),(Object)("-")));
RDebugUtils.currentLine=46071836;
 //BA.debugLineNum = 46071836;BA.debugLine="If dprDatum.Text = datum Then";
if (true) break;

case 13:
//if
this.state = 16;
if ((__ref._dprdatum /*anywheresoftware.b4a.objects.ButtonWrapper*/ .getText()).equals(_datum)) { 
this.state = 15;
}if (true) break;

case 15:
//C
this.state = 16;
RDebugUtils.currentLine=46071837;
 //BA.debugLineNum = 46071837;BA.debugLine="neu = False";
_neu = parent.__c.False;
RDebugUtils.currentLine=46071838;
 //BA.debugLineNum = 46071838;BA.debugLine="disableVSTNG";
__ref._disablevstng /*String*/ (null);
RDebugUtils.currentLine=46071839;
 //BA.debugLineNum = 46071839;BA.debugLine="webviewVSTGN_ID = key";
__ref._webviewvstgn_id /*String*/  = _key;
RDebugUtils.currentLine=46071842;
 //BA.debugLineNum = 46071842;BA.debugLine="enableVSTNG";
__ref._enablevstng /*String*/ (null);
RDebugUtils.currentLine=46071843;
 //BA.debugLineNum = 46071843;BA.debugLine="Exit";
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
;
 if (true) break;
;
RDebugUtils.currentLine=46071848;
 //BA.debugLineNum = 46071848;BA.debugLine="If neu Then";

case 18:
//if
this.state = 25;
if (_neu) { 
this.state = 20;
}if (true) break;

case 20:
//C
this.state = 21;
RDebugUtils.currentLine=46071849;
 //BA.debugLineNum = 46071849;BA.debugLine="Veranstaltung_ID = VSTGNnewID";
__ref._veranstaltung_id /*String*/  = __ref._vstgnnewid /*String*/ ;
RDebugUtils.currentLine=46071850;
 //BA.debugLineNum = 46071850;BA.debugLine="webviewVSTGN_ID = VSTGNnewID";
__ref._webviewvstgn_id /*String*/  = __ref._vstgnnewid /*String*/ ;
RDebugUtils.currentLine=46071851;
 //BA.debugLineNum = 46071851;BA.debugLine="disableVSTNG";
__ref._disablevstng /*String*/ (null);
RDebugUtils.currentLine=46071856;
 //BA.debugLineNum = 46071856;BA.debugLine="tbxAnzahl.Text = \"0\"";
__ref._tbxanzahl /*anywheresoftware.b4a.objects.EditTextWrapper*/ .setText(BA.ObjectToCharSequence("0"));
RDebugUtils.currentLine=46071857;
 //BA.debugLineNum = 46071857;BA.debugLine="enableVSTNG";
__ref._enablevstng /*String*/ (null);
RDebugUtils.currentLine=46071858;
 //BA.debugLineNum = 46071858;BA.debugLine="Dim anzVal As Int = tbxAnzahl.Text";
_anzval = (int)(Double.parseDouble(__ref._tbxanzahl /*anywheresoftware.b4a.objects.EditTextWrapper*/ .getText()));
RDebugUtils.currentLine=46071859;
 //BA.debugLineNum = 46071859;BA.debugLine="If anzVal > 0 Then";
if (true) break;

case 21:
//if
this.state = 24;
if (_anzval>0) { 
this.state = 23;
}if (true) break;

case 23:
//C
this.state = 24;
RDebugUtils.currentLine=46071860;
 //BA.debugLineNum = 46071860;BA.debugLine="btnVerstgSpeichern.Enabled = True";
__ref._btnverstgspeichern /*anywheresoftware.b4a.objects.ButtonWrapper*/ .setEnabled(parent.__c.True);
RDebugUtils.currentLine=46071861;
 //BA.debugLineNum = 46071861;BA.debugLine="btnVerstgSpeichern.TextColor = colorgreen";
__ref._btnverstgspeichern /*anywheresoftware.b4a.objects.ButtonWrapper*/ .setTextColor(__ref._colorgreen /*int*/ );
 if (true) break;

case 24:
//C
this.state = 25;
;
RDebugUtils.currentLine=46071863;
 //BA.debugLineNum = 46071863;BA.debugLine="btnVerstgDelete.Enabled = False";
__ref._btnverstgdelete /*anywheresoftware.b4a.objects.ButtonWrapper*/ .setEnabled(parent.__c.False);
RDebugUtils.currentLine=46071864;
 //BA.debugLineNum = 46071864;BA.debugLine="btnVerstgDelete.TextColor = 0xFF888888";
__ref._btnverstgdelete /*anywheresoftware.b4a.objects.ButtonWrapper*/ .setTextColor(((int)0xff888888));
RDebugUtils.currentLine=46071865;
 //BA.debugLineNum = 46071865;BA.debugLine="btnAuswahl.Enabled = False";
__ref._btnauswahl /*anywheresoftware.b4a.objects.ButtonWrapper*/ .setEnabled(parent.__c.False);
RDebugUtils.currentLine=46071866;
 //BA.debugLineNum = 46071866;BA.debugLine="btnAuswahl.TextColor = 0xFF888888";
__ref._btnauswahl /*anywheresoftware.b4a.objects.ButtonWrapper*/ .setTextColor(((int)0xff888888));
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
RDebugUtils.currentLine=46071870;
 //BA.debugLineNum = 46071870;BA.debugLine="startTimer";
__ref._starttimer /*String*/ (null);
RDebugUtils.currentLine=46071871;
 //BA.debugLineNum = 46071871;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public String  _handlegottext(b4a.example.settings __ref,String _typ,String _requrl,String _responsecontent) throws Exception{
__ref = this;
RDebugUtils.currentModule="settings";
if (Debug.shouldDelegate(ba, "handlegottext", false))
	 {return ((String) Debug.delegate(ba, "handlegottext", new Object[] {_typ,_requrl,_responsecontent}));}
anywheresoftware.b4a.objects.collections.JSONParser _jp = null;
RDebugUtils.currentLine=45875200;
 //BA.debugLineNum = 45875200;BA.debugLine="Private Sub HandleGotText(typ As String, reqUrl As";
RDebugUtils.currentLine=45875201;
 //BA.debugLineNum = 45875201;BA.debugLine="Dim jp As JSONParser";
_jp = new anywheresoftware.b4a.objects.collections.JSONParser();
RDebugUtils.currentLine=45875203;
 //BA.debugLineNum = 45875203;BA.debugLine="Select typ";
switch (BA.switchObjectToInt(_typ,"Teilnehmer","Veranstaltungen","addVSTNG","addTLN","delTeilnehmer","delVeranstaltung","delErgebnis")) {
case 0: {
RDebugUtils.currentLine=45875205;
 //BA.debugLineNum = 45875205;BA.debugLine="DBdatenTyp = \"\"";
__ref._dbdatentyp /*String*/  = "";
RDebugUtils.currentLine=45875206;
 //BA.debugLineNum = 45875206;BA.debugLine="ladeTeilnehmer(responseContent)";
__ref._ladeteilnehmer /*String*/ (null,_responsecontent);
 break; }
case 1: {
RDebugUtils.currentLine=45875209;
 //BA.debugLineNum = 45875209;BA.debugLine="If responseContent = \"null\" Or responseContent";
if ((_responsecontent).equals("null") || (_responsecontent).equals("")) { 
RDebugUtils.currentLine=45875210;
 //BA.debugLineNum = 45875210;BA.debugLine="Veranstaltungen.Initialize";
__ref._veranstaltungen /*anywheresoftware.b4a.objects.collections.Map*/ .Initialize();
 }else {
RDebugUtils.currentLine=45875212;
 //BA.debugLineNum = 45875212;BA.debugLine="jp.Initialize(responseContent)";
_jp.Initialize(_responsecontent);
RDebugUtils.currentLine=45875213;
 //BA.debugLineNum = 45875213;BA.debugLine="Veranstaltungen = jp.NextObject";
__ref._veranstaltungen /*anywheresoftware.b4a.objects.collections.Map*/  = _jp.NextObject();
 };
RDebugUtils.currentLine=45875215;
 //BA.debugLineNum = 45875215;BA.debugLine="pruefeDBVerein";
__ref._pruefedbverein /*String*/ (null);
RDebugUtils.currentLine=45875216;
 //BA.debugLineNum = 45875216;BA.debugLine="ZeigeVeranstaltungenCLV";
__ref._zeigeveranstaltungenclv /*String*/ (null);
RDebugUtils.currentLine=45875217;
 //BA.debugLineNum = 45875217;BA.debugLine="DBdatenTyp = \"\"";
__ref._dbdatentyp /*String*/  = "";
RDebugUtils.currentLine=45875218;
 //BA.debugLineNum = 45875218;BA.debugLine="holeTLN";
__ref._holetln /*String*/ (null);
 break; }
case 2: {
RDebugUtils.currentLine=45875221;
 //BA.debugLineNum = 45875221;BA.debugLine="DBdatenTyp = \"\"";
__ref._dbdatentyp /*String*/  = "";
RDebugUtils.currentLine=45875222;
 //BA.debugLineNum = 45875222;BA.debugLine="holeVeranstaltungen";
__ref._holeveranstaltungen /*String*/ (null);
 break; }
case 3: {
RDebugUtils.currentLine=45875225;
 //BA.debugLineNum = 45875225;BA.debugLine="DBdatenTyp = \"\"";
__ref._dbdatentyp /*String*/  = "";
RDebugUtils.currentLine=45875226;
 //BA.debugLineNum = 45875226;BA.debugLine="holeTLN";
__ref._holetln /*String*/ (null);
 break; }
case 4: {
RDebugUtils.currentLine=45875229;
 //BA.debugLineNum = 45875229;BA.debugLine="DBdatenTyp = \"\"";
__ref._dbdatentyp /*String*/  = "";
RDebugUtils.currentLine=45875230;
 //BA.debugLineNum = 45875230;BA.debugLine="TLNid = \"t0\"";
__ref._tlnid /*String*/  = "t0";
RDebugUtils.currentLine=45875231;
 //BA.debugLineNum = 45875231;BA.debugLine="holeTLN";
__ref._holetln /*String*/ (null);
 break; }
case 5: {
RDebugUtils.currentLine=45875234;
 //BA.debugLineNum = 45875234;BA.debugLine="DBdatenTyp = \"\"";
__ref._dbdatentyp /*String*/  = "";
RDebugUtils.currentLine=45875235;
 //BA.debugLineNum = 45875235;BA.debugLine="If webviewVSTGN_ID = DBGet(\"VeranstaltungID\", \"";
if ((__ref._webviewvstgn_id /*String*/ ).equals(BA.ObjectToString(__ref._dbget /*Object*/ (null,"VeranstaltungID",(Object)("v0"))))) { 
RDebugUtils.currentLine=45875236;
 //BA.debugLineNum = 45875236;BA.debugLine="Veranstaltung_ID = \"v0\"";
__ref._veranstaltung_id /*String*/  = "v0";
RDebugUtils.currentLine=45875237;
 //BA.debugLineNum = 45875237;BA.debugLine="webviewVSTGN_ID = \"v0\"";
__ref._webviewvstgn_id /*String*/  = "v0";
RDebugUtils.currentLine=45875238;
 //BA.debugLineNum = 45875238;BA.debugLine="DBPut(\"VeranstaltungID\", \"v0\")";
__ref._dbput /*String*/ (null,"VeranstaltungID",(Object)("v0"));
 };
RDebugUtils.currentLine=45875240;
 //BA.debugLineNum = 45875240;BA.debugLine="holeVeranstaltungen";
__ref._holeveranstaltungen /*String*/ (null);
 break; }
case 6: {
RDebugUtils.currentLine=45875243;
 //BA.debugLineNum = 45875243;BA.debugLine="DBdatenTyp = \"\"";
__ref._dbdatentyp /*String*/  = "";
RDebugUtils.currentLine=45875244;
 //BA.debugLineNum = 45875244;BA.debugLine="delVeranstaltung(webviewVSTGN_ID)";
__ref._delveranstaltung /*String*/ (null,__ref._webviewvstgn_id /*String*/ );
 break; }
default: {
RDebugUtils.currentLine=45875247;
 //BA.debugLineNum = 45875247;BA.debugLine="MsgboxAsync(\"(\" & DBdatenTyp & \")\" & reqUrl, \"D";
__c.MsgboxAsync(BA.ObjectToCharSequence("("+__ref._dbdatentyp /*String*/ +")"+_requrl),BA.ObjectToCharSequence("Da stimmt etwas nicht!"),ba);
 break; }
}
;
RDebugUtils.currentLine=45875249;
 //BA.debugLineNum = 45875249;BA.debugLine="End Sub";
return "";
}
public void  _setzeoffline(b4a.example.settings __ref) throws Exception{
RDebugUtils.currentModule="settings";
if (Debug.shouldDelegate(ba, "setzeoffline", false))
	 {Debug.delegate(ba, "setzeoffline", null); return;}
ResumableSub_setzeOffline rsub = new ResumableSub_setzeOffline(this,__ref);
rsub.resume(ba, null);
}
public static class ResumableSub_setzeOffline extends BA.ResumableSub {
public ResumableSub_setzeOffline(b4a.example.settings parent,b4a.example.settings __ref) {
this.parent = parent;
this.__ref = __ref;
this.__ref = parent;
}
b4a.example.settings __ref;
b4a.example.settings parent;
int _res;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="settings";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=45940737;
 //BA.debugLineNum = 45940737;BA.debugLine="Status.Put(\"ProgOffline\", True)";
__ref._status /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("ProgOffline"),(Object)(parent.__c.True));
RDebugUtils.currentLine=45940738;
 //BA.debugLineNum = 45940738;BA.debugLine="Msgbox2Async(\"Die Datenbank ist nicht mehr erreic";
parent.__c.Msgbox2Async(BA.ObjectToCharSequence("Die Datenbank ist nicht mehr erreichbar. Das Programm arbeitet nun offline. Es ist jetzt nur die zuletzt verwendete Wertungsliste verfügbar. Änderungen in den Einstellungen können nicht übernommen werden."),BA.ObjectToCharSequence("Internet-Verbindung nicht möglich!"),"Einstellungen schließen.","","",(anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper(), (android.graphics.Bitmap)(parent.__c.Null)),ba,parent.__c.False);
RDebugUtils.currentLine=45940739;
 //BA.debugLineNum = 45940739;BA.debugLine="Wait For Msgbox_Result (res As Int)";
parent.__c.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "settings", "setzeoffline"), null);
this.state = 5;
return;
case 5:
//C
this.state = 1;
_res = (Integer) result[1];
;
RDebugUtils.currentLine=45940740;
 //BA.debugLineNum = 45940740;BA.debugLine="If res = DialogResponse.POSITIVE Then";
if (true) break;

case 1:
//if
this.state = 4;
if (_res==parent.__c.DialogResponse.POSITIVE) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
RDebugUtils.currentLine=45940741;
 //BA.debugLineNum = 45940741;BA.debugLine="CloseSettings";
__ref._closesettings /*String*/ (null);
 if (true) break;

case 4:
//C
this.state = -1;
;
RDebugUtils.currentLine=45940743;
 //BA.debugLineNum = 45940743;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public String  _ladeteilnehmer(b4a.example.settings __ref,String _response) throws Exception{
__ref = this;
RDebugUtils.currentModule="settings";
if (Debug.shouldDelegate(ba, "ladeteilnehmer", false))
	 {return ((String) Debug.delegate(ba, "ladeteilnehmer", new Object[] {_response}));}
anywheresoftware.b4a.objects.collections.JSONParser _jp = null;
anywheresoftware.b4a.objects.collections.Map _teilnehmerliste = null;
String _key = "";
int _newid = 0;
int _curmax = 0;
anywheresoftware.b4a.objects.collections.Map _tmap = null;
RDebugUtils.currentLine=45547520;
 //BA.debugLineNum = 45547520;BA.debugLine="Private Sub ladeTeilnehmer(response As String)";
RDebugUtils.currentLine=45547521;
 //BA.debugLineNum = 45547521;BA.debugLine="Teilnehmer.Initialize";
__ref._teilnehmer /*anywheresoftware.b4a.objects.collections.List*/ .Initialize();
RDebugUtils.currentLine=45547522;
 //BA.debugLineNum = 45547522;BA.debugLine="If response <> \"\" And response <> \"null\" Then";
if ((_response).equals("") == false && (_response).equals("null") == false) { 
RDebugUtils.currentLine=45547523;
 //BA.debugLineNum = 45547523;BA.debugLine="Dim jp As JSONParser";
_jp = new anywheresoftware.b4a.objects.collections.JSONParser();
RDebugUtils.currentLine=45547524;
 //BA.debugLineNum = 45547524;BA.debugLine="jp.Initialize(response)";
_jp.Initialize(_response);
RDebugUtils.currentLine=45547525;
 //BA.debugLineNum = 45547525;BA.debugLine="Dim teilnehmerliste As Map = jp.NextObject";
_teilnehmerliste = new anywheresoftware.b4a.objects.collections.Map();
_teilnehmerliste = _jp.NextObject();
RDebugUtils.currentLine=45547527;
 //BA.debugLineNum = 45547527;BA.debugLine="For Each key As String In teilnehmerliste.Keys";
{
final anywheresoftware.b4a.BA.IterableList group6 = _teilnehmerliste.Keys();
final int groupLen6 = group6.getSize()
;int index6 = 0;
;
for (; index6 < groupLen6;index6++){
_key = BA.ObjectToString(group6.Get(index6));
RDebugUtils.currentLine=45547528;
 //BA.debugLineNum = 45547528;BA.debugLine="Dim newID As Int = key.Replace(\"t\", \"\") + 1";
_newid = (int) ((double)(Double.parseDouble(_key.replace("t","")))+1);
RDebugUtils.currentLine=45547529;
 //BA.debugLineNum = 45547529;BA.debugLine="Dim curMax As Int = TLNnewID.Replace(\"t\", \"\")";
_curmax = (int)(Double.parseDouble(__ref._tlnnewid /*String*/ .replace("t","")));
RDebugUtils.currentLine=45547530;
 //BA.debugLineNum = 45547530;BA.debugLine="If newID > curMax Then";
if (_newid>_curmax) { 
RDebugUtils.currentLine=45547531;
 //BA.debugLineNum = 45547531;BA.debugLine="TLNnewID = \"t\" & newID";
__ref._tlnnewid /*String*/  = "t"+BA.NumberToString(_newid);
 };
RDebugUtils.currentLine=45547533;
 //BA.debugLineNum = 45547533;BA.debugLine="Dim tMap As Map = teilnehmerliste.Get(key)";
_tmap = new anywheresoftware.b4a.objects.collections.Map();
_tmap = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_teilnehmerliste.Get((Object)(_key))));
RDebugUtils.currentLine=45547534;
 //BA.debugLineNum = 45547534;BA.debugLine="Teilnehmer.AddAll(Array As Object(tMap.GetDefau";
__ref._teilnehmer /*anywheresoftware.b4a.objects.collections.List*/ .AddAll(anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{_tmap.GetDefault((Object)("Name"),(Object)("unbenannt")),(Object)(_key)}));
 }
};
RDebugUtils.currentLine=45547536;
 //BA.debugLineNum = 45547536;BA.debugLine="Teilnehmer.Add(TLNid)";
__ref._teilnehmer /*anywheresoftware.b4a.objects.collections.List*/ .Add((Object)(__ref._tlnid /*String*/ ));
 };
RDebugUtils.currentLine=45547538;
 //BA.debugLineNum = 45547538;BA.debugLine="ZeigeTeilnehmerCLV";
__ref._zeigeteilnehmerclv /*String*/ (null);
RDebugUtils.currentLine=45547539;
 //BA.debugLineNum = 45547539;BA.debugLine="End Sub";
return "";
}
public String  _pruefedbverein(b4a.example.settings __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="settings";
if (Debug.shouldDelegate(ba, "pruefedbverein", false))
	 {return ((String) Debug.delegate(ba, "pruefedbverein", null));}
boolean _vstngexists = false;
String _savedid = "";
String _key = "";
RDebugUtils.currentLine=45088768;
 //BA.debugLineNum = 45088768;BA.debugLine="Private Sub pruefeDBVerein";
RDebugUtils.currentLine=45088769;
 //BA.debugLineNum = 45088769;BA.debugLine="Dim VSTNGexists As Boolean = False";
_vstngexists = __c.False;
RDebugUtils.currentLine=45088770;
 //BA.debugLineNum = 45088770;BA.debugLine="Dim savedID As String = DBGet(\"VeranstaltungID\",";
_savedid = BA.ObjectToString(__ref._dbget /*Object*/ (null,"VeranstaltungID",(Object)("v0")));
RDebugUtils.currentLine=45088772;
 //BA.debugLineNum = 45088772;BA.debugLine="If Veranstaltungen.IsInitialized And Veranstaltun";
if (__ref._veranstaltungen /*anywheresoftware.b4a.objects.collections.Map*/ .IsInitialized() && __ref._veranstaltungen /*anywheresoftware.b4a.objects.collections.Map*/ .getSize()>0) { 
RDebugUtils.currentLine=45088773;
 //BA.debugLineNum = 45088773;BA.debugLine="For Each key As String In Veranstaltungen.Keys";
{
final anywheresoftware.b4a.BA.IterableList group4 = __ref._veranstaltungen /*anywheresoftware.b4a.objects.collections.Map*/ .Keys();
final int groupLen4 = group4.getSize()
;int index4 = 0;
;
for (; index4 < groupLen4;index4++){
_key = BA.ObjectToString(group4.Get(index4));
RDebugUtils.currentLine=45088774;
 //BA.debugLineNum = 45088774;BA.debugLine="webviewVSTGN_ID = key";
__ref._webviewvstgn_id /*String*/  = _key;
RDebugUtils.currentLine=45088775;
 //BA.debugLineNum = 45088775;BA.debugLine="If key = savedID Then";
if ((_key).equals(_savedid)) { 
RDebugUtils.currentLine=45088776;
 //BA.debugLineNum = 45088776;BA.debugLine="VSTNGexists = True";
_vstngexists = __c.True;
RDebugUtils.currentLine=45088777;
 //BA.debugLineNum = 45088777;BA.debugLine="Exit";
if (true) break;
 };
 }
};
 };
RDebugUtils.currentLine=45088782;
 //BA.debugLineNum = 45088782;BA.debugLine="If Not(VSTNGexists) Then";
if (__c.Not(_vstngexists)) { 
RDebugUtils.currentLine=45088783;
 //BA.debugLineNum = 45088783;BA.debugLine="lblVeranstaltung.Text = \"- noch nicht ausgewählt";
__ref._lblveranstaltung /*anywheresoftware.b4a.objects.LabelWrapper*/ .setText(BA.ObjectToCharSequence("- noch nicht ausgewählt -"));
RDebugUtils.currentLine=45088784;
 //BA.debugLineNum = 45088784;BA.debugLine="lblDatum.Text = \"- bitte auswählen -\"";
__ref._lbldatum /*anywheresoftware.b4a.objects.LabelWrapper*/ .setText(BA.ObjectToCharSequence("- bitte auswählen -"));
RDebugUtils.currentLine=45088785;
 //BA.debugLineNum = 45088785;BA.debugLine="Veranstaltung_ID = \"v0\"";
__ref._veranstaltung_id /*String*/  = "v0";
RDebugUtils.currentLine=45088786;
 //BA.debugLineNum = 45088786;BA.debugLine="VSTGNnewID = \"v1\"";
__ref._vstgnnewid /*String*/  = "v1";
RDebugUtils.currentLine=45088787;
 //BA.debugLineNum = 45088787;BA.debugLine="DBPut(\"VeranstaltungID\", \"v0\")";
__ref._dbput /*String*/ (null,"VeranstaltungID",(Object)("v0"));
 };
RDebugUtils.currentLine=45088789;
 //BA.debugLineNum = 45088789;BA.debugLine="End Sub";
return "";
}
public String  _zeigeveranstaltungenclv(b4a.example.settings __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="settings";
if (Debug.shouldDelegate(ba, "zeigeveranstaltungenclv", false))
	 {return ((String) Debug.delegate(ba, "zeigeveranstaltungenclv", null));}
String _key = "";
anywheresoftware.b4a.objects.collections.Map _v = null;
String _datum = "";
String _name = "";
RDebugUtils.currentLine=47382528;
 //BA.debugLineNum = 47382528;BA.debugLine="Private Sub ZeigeVeranstaltungenCLV";
RDebugUtils.currentLine=47382530;
 //BA.debugLineNum = 47382530;BA.debugLine="lstVeranstaltungen.Clear";
__ref._lstveranstaltungen /*b4a.example3.customlistview*/ ._clear();
RDebugUtils.currentLine=47382532;
 //BA.debugLineNum = 47382532;BA.debugLine="For Each KEY As String In Veranstaltungen.Keys";
{
final anywheresoftware.b4a.BA.IterableList group2 = __ref._veranstaltungen /*anywheresoftware.b4a.objects.collections.Map*/ .Keys();
final int groupLen2 = group2.getSize()
;int index2 = 0;
;
for (; index2 < groupLen2;index2++){
_key = BA.ObjectToString(group2.Get(index2));
RDebugUtils.currentLine=47382534;
 //BA.debugLineNum = 47382534;BA.debugLine="Dim V As Map = Veranstaltungen.Get(KEY)";
_v = new anywheresoftware.b4a.objects.collections.Map();
_v = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(__ref._veranstaltungen /*anywheresoftware.b4a.objects.collections.Map*/ .Get((Object)(_key))));
RDebugUtils.currentLine=47382536;
 //BA.debugLineNum = 47382536;BA.debugLine="Dim DATUM As String = V.GetDefault(\"Datum\", \"\")";
_datum = BA.ObjectToString(_v.GetDefault((Object)("Datum"),(Object)("")));
RDebugUtils.currentLine=47382537;
 //BA.debugLineNum = 47382537;BA.debugLine="Dim NAME As String = V.GetDefault(\"Name\", \"\")";
_name = BA.ObjectToString(_v.GetDefault((Object)("Name"),(Object)("")));
 }
};
RDebugUtils.currentLine=47382545;
 //BA.debugLineNum = 47382545;BA.debugLine="End Sub";
return "";
}
public String  _holetln(b4a.example.settings __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="settings";
if (Debug.shouldDelegate(ba, "holetln", false))
	 {return ((String) Debug.delegate(ba, "holetln", null));}
RDebugUtils.currentLine=45481984;
 //BA.debugLineNum = 45481984;BA.debugLine="Private Sub holeTLN";
RDebugUtils.currentLine=45481985;
 //BA.debugLineNum = 45481985;BA.debugLine="DBdatenTyp = \"Teilnehmer\"";
__ref._dbdatentyp /*String*/  = "Teilnehmer";
RDebugUtils.currentLine=45481986;
 //BA.debugLineNum = 45481986;BA.debugLine="CurrentWebUrl = URLteilnehmer & \".json?auth=\" & S";
__ref._currentweburl /*String*/  = __ref._urlteilnehmer /*String*/ +".json?auth="+BA.ObjectToString(__ref._status /*anywheresoftware.b4a.objects.collections.Map*/ .GetDefault((Object)("idToken"),(Object)("")));
RDebugUtils.currentLine=45481987;
 //BA.debugLineNum = 45481987;BA.debugLine="ExecuteHttp(\"GET\", CurrentWebUrl, \"\")";
__ref._executehttp /*void*/ (null,"GET",__ref._currentweburl /*String*/ ,"");
RDebugUtils.currentLine=45481988;
 //BA.debugLineNum = 45481988;BA.debugLine="End Sub";
return "";
}
public String  _hidekeyboard(b4a.example.settings __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="settings";
if (Debug.shouldDelegate(ba, "hidekeyboard", false))
	 {return ((String) Debug.delegate(ba, "hidekeyboard", null));}
anywheresoftware.b4a.phone.Phone _p = null;
RDebugUtils.currentLine=47120384;
 //BA.debugLineNum = 47120384;BA.debugLine="Private Sub HideKeyboard";
RDebugUtils.currentLine=47120385;
 //BA.debugLineNum = 47120385;BA.debugLine="Dim p As Phone";
_p = new anywheresoftware.b4a.phone.Phone();
RDebugUtils.currentLine=47120386;
 //BA.debugLineNum = 47120386;BA.debugLine="p.HideKeyboard(B4XPages.GetNativeParent(Me))";
_p.HideKeyboard(_b4xpages._getnativeparent /*anywheresoftware.b4a.objects.ActivityWrapper*/ (ba,this));
RDebugUtils.currentLine=47120387;
 //BA.debugLineNum = 47120387;BA.debugLine="End Sub";
return "";
}
public String  _zeigeteilnehmerclv(b4a.example.settings __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="settings";
if (Debug.shouldDelegate(ba, "zeigeteilnehmerclv", false))
	 {return ((String) Debug.delegate(ba, "zeigeteilnehmerclv", null));}
int _i = 0;
RDebugUtils.currentLine=47513600;
 //BA.debugLineNum = 47513600;BA.debugLine="Private Sub ZeigeTeilnehmerCLV";
RDebugUtils.currentLine=47513602;
 //BA.debugLineNum = 47513602;BA.debugLine="lstTeilnehmer.Clear";
__ref._lstteilnehmer /*b4a.example3.customlistview*/ ._clear();
RDebugUtils.currentLine=47513604;
 //BA.debugLineNum = 47513604;BA.debugLine="For I = 0 To Teilnehmer.Size - 1 Step 2";
{
final int step2 = 2;
final int limit2 = (int) (__ref._teilnehmer /*anywheresoftware.b4a.objects.collections.List*/ .getSize()-1);
_i = (int) (0) ;
for (;_i <= limit2 ;_i = _i + step2 ) {
RDebugUtils.currentLine=47513605;
 //BA.debugLineNum = 47513605;BA.debugLine="If I + 1 < Teilnehmer.Size Then";
if (_i+1<__ref._teilnehmer /*anywheresoftware.b4a.objects.collections.List*/ .getSize()) { 
 };
 }
};
RDebugUtils.currentLine=47513610;
 //BA.debugLineNum = 47513610;BA.debugLine="End Sub";
return "";
}
public String  _ladeveranstaltungen(b4a.example.settings __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="settings";
if (Debug.shouldDelegate(ba, "ladeveranstaltungen", false))
	 {return ((String) Debug.delegate(ba, "ladeveranstaltungen", null));}
String _key = "";
int _newid = 0;
int _curmax = 0;
anywheresoftware.b4a.objects.collections.Map _ergebnis = null;
RDebugUtils.currentLine=44957696;
 //BA.debugLineNum = 44957696;BA.debugLine="Private Sub ladeVeranstaltungen";
RDebugUtils.currentLine=44957697;
 //BA.debugLineNum = 44957697;BA.debugLine="dprDatum.Enabled = True";
__ref._dprdatum /*anywheresoftware.b4a.objects.ButtonWrapper*/ .setEnabled(__c.True);
RDebugUtils.currentLine=44957698;
 //BA.debugLineNum = 44957698;BA.debugLine="dprDatum.TextColor = colorgreen";
__ref._dprdatum /*anywheresoftware.b4a.objects.ButtonWrapper*/ .setTextColor(__ref._colorgreen /*int*/ );
RDebugUtils.currentLine=44957699;
 //BA.debugLineNum = 44957699;BA.debugLine="dprDatum.Text = FormatDateCustom(DateTime.Now, \"d";
__ref._dprdatum /*anywheresoftware.b4a.objects.ButtonWrapper*/ .setText(BA.ObjectToCharSequence(__ref._formatdatecustom /*String*/ (null,__c.DateTime.getNow(),"dd.MM.yyyy")));
RDebugUtils.currentLine=44957700;
 //BA.debugLineNum = 44957700;BA.debugLine="dprYear = DateTime.GetYear(DateTime.Now)";
__ref._dpryear /*int*/  = __c.DateTime.GetYear(__c.DateTime.getNow());
RDebugUtils.currentLine=44957701;
 //BA.debugLineNum = 44957701;BA.debugLine="dprMonth = DateTime.GetMonth(DateTime.Now)";
__ref._dprmonth /*int*/  = __c.DateTime.GetMonth(__c.DateTime.getNow());
RDebugUtils.currentLine=44957702;
 //BA.debugLineNum = 44957702;BA.debugLine="dprDay = DateTime.GetDayOfMonth(DateTime.Now)";
__ref._dprday /*int*/  = __c.DateTime.GetDayOfMonth(__c.DateTime.getNow());
RDebugUtils.currentLine=44957704;
 //BA.debugLineNum = 44957704;BA.debugLine="webviewVSTGN.Initialize";
__ref._webviewvstgn /*anywheresoftware.b4a.objects.collections.List*/ .Initialize();
RDebugUtils.currentLine=44957705;
 //BA.debugLineNum = 44957705;BA.debugLine="webviewVSTGN.AddAll(Array As Object(\"Datum\", \"Nam";
__ref._webviewvstgn /*anywheresoftware.b4a.objects.collections.List*/ .AddAll(anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)("Datum"),(Object)("Name"),(Object)("vid")}));
RDebugUtils.currentLine=44957707;
 //BA.debugLineNum = 44957707;BA.debugLine="If Not(Veranstaltungen.IsInitialized) Or Veransta";
if (__c.Not(__ref._veranstaltungen /*anywheresoftware.b4a.objects.collections.Map*/ .IsInitialized()) || __ref._veranstaltungen /*anywheresoftware.b4a.objects.collections.Map*/ .getSize()==0) { 
RDebugUtils.currentLine=44957708;
 //BA.debugLineNum = 44957708;BA.debugLine="Veranstaltung_ID = \"v0\"";
__ref._veranstaltung_id /*String*/  = "v0";
RDebugUtils.currentLine=44957709;
 //BA.debugLineNum = 44957709;BA.debugLine="webviewVSTGN_ID = \"v0\"";
__ref._webviewvstgn_id /*String*/  = "v0";
RDebugUtils.currentLine=44957710;
 //BA.debugLineNum = 44957710;BA.debugLine="VSTGNnewID = \"v1\"";
__ref._vstgnnewid /*String*/  = "v1";
RDebugUtils.currentLine=44957711;
 //BA.debugLineNum = 44957711;BA.debugLine="webviewVSTGN.AddAll(Array As Object(\"Veranstaltu";
__ref._webviewvstgn /*anywheresoftware.b4a.objects.collections.List*/ .AddAll(anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)("Veranstaltungs_ID"),(Object)("v0")}));
RDebugUtils.currentLine=44957712;
 //BA.debugLineNum = 44957712;BA.debugLine="setzeVeranstaltung(\"v0\")";
__ref._setzeveranstaltung /*String*/ (null,"v0");
 }else {
RDebugUtils.currentLine=44957714;
 //BA.debugLineNum = 44957714;BA.debugLine="For Each key As String In Veranstaltungen.Keys";
{
final anywheresoftware.b4a.BA.IterableList group16 = __ref._veranstaltungen /*anywheresoftware.b4a.objects.collections.Map*/ .Keys();
final int groupLen16 = group16.getSize()
;int index16 = 0;
;
for (; index16 < groupLen16;index16++){
_key = BA.ObjectToString(group16.Get(index16));
RDebugUtils.currentLine=44957715;
 //BA.debugLineNum = 44957715;BA.debugLine="Dim newID As Int = key.Replace(\"v\", \"\") + 1";
_newid = (int) ((double)(Double.parseDouble(_key.replace("v","")))+1);
RDebugUtils.currentLine=44957716;
 //BA.debugLineNum = 44957716;BA.debugLine="Dim curMax As Int = VSTGNnewID.Replace(\"v\", \"\")";
_curmax = (int)(Double.parseDouble(__ref._vstgnnewid /*String*/ .replace("v","")));
RDebugUtils.currentLine=44957717;
 //BA.debugLineNum = 44957717;BA.debugLine="If newID > curMax Then";
if (_newid>_curmax) { 
RDebugUtils.currentLine=44957718;
 //BA.debugLineNum = 44957718;BA.debugLine="VSTGNnewID = \"v\" & newID";
__ref._vstgnnewid /*String*/  = "v"+BA.NumberToString(_newid);
 };
RDebugUtils.currentLine=44957720;
 //BA.debugLineNum = 44957720;BA.debugLine="Dim ergebnis As Map = Veranstaltungen.Get(key)";
_ergebnis = new anywheresoftware.b4a.objects.collections.Map();
_ergebnis = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(__ref._veranstaltungen /*anywheresoftware.b4a.objects.collections.Map*/ .Get((Object)(_key))));
RDebugUtils.currentLine=44957721;
 //BA.debugLineNum = 44957721;BA.debugLine="webviewVSTGN.AddAll(Array As Object( _ 				erge";
__ref._webviewvstgn /*anywheresoftware.b4a.objects.collections.List*/ .AddAll(anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{_ergebnis.GetDefault((Object)("Datum"),(Object)(__ref._formatdatecustom /*String*/ (null,__c.DateTime.getNow(),"dd.MM.yyyy"))),_ergebnis.GetDefault((Object)("Name"),(Object)("- n.n. -")),(Object)(_key)}));
 }
};
RDebugUtils.currentLine=44957726;
 //BA.debugLineNum = 44957726;BA.debugLine="webviewVSTGN.AddAll(Array As Object(\"Veranstaltu";
__ref._webviewvstgn /*anywheresoftware.b4a.objects.collections.List*/ .AddAll(anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)("Veranstaltungs_ID"),(Object)(__ref._webviewvstgn_id /*String*/ )}));
 };
RDebugUtils.currentLine=44957728;
 //BA.debugLineNum = 44957728;BA.debugLine="End Sub";
return "";
}
public String  _lstveranstaltungen_itemclick(b4a.example.settings __ref,int _position,Object _value) throws Exception{
__ref = this;
RDebugUtils.currentModule="settings";
if (Debug.shouldDelegate(ba, "lstveranstaltungen_itemclick", false))
	 {return ((String) Debug.delegate(ba, "lstveranstaltungen_itemclick", new Object[] {_position,_value}));}
RDebugUtils.currentLine=47644672;
 //BA.debugLineNum = 47644672;BA.debugLine="Private Sub lstVeranstaltungen_ItemClick (Position";
RDebugUtils.currentLine=47644674;
 //BA.debugLineNum = 47644674;BA.debugLine="webviewVSTGN_ID = Value";
__ref._webviewvstgn_id /*String*/  = BA.ObjectToString(_value);
RDebugUtils.currentLine=47644676;
 //BA.debugLineNum = 47644676;BA.debugLine="setzeVeranstaltung(webviewVSTGN_ID)";
__ref._setzeveranstaltung /*String*/ (null,__ref._webviewvstgn_id /*String*/ );
RDebugUtils.currentLine=47644678;
 //BA.debugLineNum = 47644678;BA.debugLine="End Sub";
return "";
}
public String  _pruefeinhalt(b4a.example.settings __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="settings";
if (Debug.shouldDelegate(ba, "pruefeinhalt", false))
	 {return ((String) Debug.delegate(ba, "pruefeinhalt", null));}
int _anz = 0;
RDebugUtils.currentLine=45416448;
 //BA.debugLineNum = 45416448;BA.debugLine="Private Sub pruefeInhalt";
RDebugUtils.currentLine=45416449;
 //BA.debugLineNum = 45416449;BA.debugLine="btnVerstgSpeichern.Enabled = False";
__ref._btnverstgspeichern /*anywheresoftware.b4a.objects.ButtonWrapper*/ .setEnabled(__c.False);
RDebugUtils.currentLine=45416450;
 //BA.debugLineNum = 45416450;BA.debugLine="btnVerstgSpeichern.TextColor = 0xFF888888";
__ref._btnverstgspeichern /*anywheresoftware.b4a.objects.ButtonWrapper*/ .setTextColor(((int)0xff888888));
RDebugUtils.currentLine=45416451;
 //BA.debugLineNum = 45416451;BA.debugLine="btnAuswahl.Enabled = False";
__ref._btnauswahl /*anywheresoftware.b4a.objects.ButtonWrapper*/ .setEnabled(__c.False);
RDebugUtils.currentLine=45416452;
 //BA.debugLineNum = 45416452;BA.debugLine="btnAuswahl.TextColor = 0xFF888888";
__ref._btnauswahl /*anywheresoftware.b4a.objects.ButtonWrapper*/ .setTextColor(((int)0xff888888));
RDebugUtils.currentLine=45416454;
 //BA.debugLineNum = 45416454;BA.debugLine="If tbxVeranstaltung.Text.Trim <> \"\" Then";
if ((__ref._tbxveranstaltung /*anywheresoftware.b4a.objects.EditTextWrapper*/ .getText().trim()).equals("") == false) { 
RDebugUtils.currentLine=45416455;
 //BA.debugLineNum = 45416455;BA.debugLine="If IsNumber(tbxAnzahl.Text) Then";
if (__c.IsNumber(__ref._tbxanzahl /*anywheresoftware.b4a.objects.EditTextWrapper*/ .getText())) { 
RDebugUtils.currentLine=45416456;
 //BA.debugLineNum = 45416456;BA.debugLine="Dim anz As Int = tbxAnzahl.Text";
_anz = (int)(Double.parseDouble(__ref._tbxanzahl /*anywheresoftware.b4a.objects.EditTextWrapper*/ .getText()));
RDebugUtils.currentLine=45416457;
 //BA.debugLineNum = 45416457;BA.debugLine="If anz > 0 Then";
if (_anz>0) { 
RDebugUtils.currentLine=45416458;
 //BA.debugLineNum = 45416458;BA.debugLine="btnVerstgSpeichern.Enabled = True";
__ref._btnverstgspeichern /*anywheresoftware.b4a.objects.ButtonWrapper*/ .setEnabled(__c.True);
RDebugUtils.currentLine=45416459;
 //BA.debugLineNum = 45416459;BA.debugLine="btnVerstgSpeichern.TextColor = colorgreen";
__ref._btnverstgspeichern /*anywheresoftware.b4a.objects.ButtonWrapper*/ .setTextColor(__ref._colorgreen /*int*/ );
 };
 };
 };
RDebugUtils.currentLine=45416463;
 //BA.debugLineNum = 45416463;BA.debugLine="End Sub";
return "";
}
public String  _tbxanzahl_focuschanged(b4a.example.settings __ref,boolean _hasfocus) throws Exception{
__ref = this;
RDebugUtils.currentModule="settings";
if (Debug.shouldDelegate(ba, "tbxanzahl_focuschanged", false))
	 {return ((String) Debug.delegate(ba, "tbxanzahl_focuschanged", new Object[] {_hasfocus}));}
RDebugUtils.currentLine=46661632;
 //BA.debugLineNum = 46661632;BA.debugLine="Private Sub tbxAnzahl_FocusChanged (HasFocus As Bo";
RDebugUtils.currentLine=46661633;
 //BA.debugLineNum = 46661633;BA.debugLine="If HasFocus Then";
if (_hasfocus) { 
RDebugUtils.currentLine=46661634;
 //BA.debugLineNum = 46661634;BA.debugLine="tbxAnzahl.SelectionStart = tbxAnzahl.Text.Length";
__ref._tbxanzahl /*anywheresoftware.b4a.objects.EditTextWrapper*/ .setSelectionStart(__ref._tbxanzahl /*anywheresoftware.b4a.objects.EditTextWrapper*/ .getText().length());
 }else {
RDebugUtils.currentLine=46661636;
 //BA.debugLineNum = 46661636;BA.debugLine="HideKeyboard";
__ref._hidekeyboard /*String*/ (null);
 };
RDebugUtils.currentLine=46661638;
 //BA.debugLineNum = 46661638;BA.debugLine="End Sub";
return "";
}
public String  _tbxanzahl_textchanged(b4a.example.settings __ref,String _old,String _new) throws Exception{
__ref = this;
RDebugUtils.currentModule="settings";
if (Debug.shouldDelegate(ba, "tbxanzahl_textchanged", false))
	 {return ((String) Debug.delegate(ba, "tbxanzahl_textchanged", new Object[] {_old,_new}));}
int _val = 0;
RDebugUtils.currentLine=46727168;
 //BA.debugLineNum = 46727168;BA.debugLine="Private Sub tbxAnzahl_TextChanged (Old As String,";
RDebugUtils.currentLine=46727169;
 //BA.debugLineNum = 46727169;BA.debugLine="Log(\"tbxAnzahl_TextChanged\")";
__c.LogImpl("846727169","tbxAnzahl_TextChanged",0);
RDebugUtils.currentLine=46727170;
 //BA.debugLineNum = 46727170;BA.debugLine="Log(\"dochange = \" & dochange)";
__c.LogImpl("846727170","dochange = "+BA.ObjectToString(__ref._dochange /*boolean*/ ),0);
RDebugUtils.currentLine=46727171;
 //BA.debugLineNum = 46727171;BA.debugLine="If dochange = False Then Return";
if (__ref._dochange /*boolean*/ ==__c.False) { 
if (true) return "";};
RDebugUtils.currentLine=46727173;
 //BA.debugLineNum = 46727173;BA.debugLine="dochange = False";
__ref._dochange /*boolean*/  = __c.False;
RDebugUtils.currentLine=46727174;
 //BA.debugLineNum = 46727174;BA.debugLine="If tbxAnzahl.Enabled Then";
if (__ref._tbxanzahl /*anywheresoftware.b4a.objects.EditTextWrapper*/ .getEnabled()) { 
RDebugUtils.currentLine=46727175;
 //BA.debugLineNum = 46727175;BA.debugLine="If IsNumber(tbxAnzahl.Text) Then";
if (__c.IsNumber(__ref._tbxanzahl /*anywheresoftware.b4a.objects.EditTextWrapper*/ .getText())) { 
RDebugUtils.currentLine=46727176;
 //BA.debugLineNum = 46727176;BA.debugLine="Dim val As Int = Abs(tbxAnzahl.Text)";
_val = (int) (__c.Abs((double)(Double.parseDouble(__ref._tbxanzahl /*anywheresoftware.b4a.objects.EditTextWrapper*/ .getText()))));
RDebugUtils.currentLine=46727177;
 //BA.debugLineNum = 46727177;BA.debugLine="tbxAnzahl.Text = val";
__ref._tbxanzahl /*anywheresoftware.b4a.objects.EditTextWrapper*/ .setText(BA.ObjectToCharSequence(_val));
 };
RDebugUtils.currentLine=46727179;
 //BA.debugLineNum = 46727179;BA.debugLine="pruefeInhalt";
__ref._pruefeinhalt /*String*/ (null);
RDebugUtils.currentLine=46727180;
 //BA.debugLineNum = 46727180;BA.debugLine="tbxAnzahl.SelectionStart = tbxAnzahl.Text.Length";
__ref._tbxanzahl /*anywheresoftware.b4a.objects.EditTextWrapper*/ .setSelectionStart(__ref._tbxanzahl /*anywheresoftware.b4a.objects.EditTextWrapper*/ .getText().length());
 };
RDebugUtils.currentLine=46727182;
 //BA.debugLineNum = 46727182;BA.debugLine="dochange = True";
__ref._dochange /*boolean*/  = __c.True;
RDebugUtils.currentLine=46727183;
 //BA.debugLineNum = 46727183;BA.debugLine="startTimer";
__ref._starttimer /*String*/ (null);
RDebugUtils.currentLine=46727184;
 //BA.debugLineNum = 46727184;BA.debugLine="End Sub";
return "";
}
public String  _tbxteilnehmer_focuschanged(b4a.example.settings __ref,boolean _hasfocus) throws Exception{
__ref = this;
RDebugUtils.currentModule="settings";
if (Debug.shouldDelegate(ba, "tbxteilnehmer_focuschanged", false))
	 {return ((String) Debug.delegate(ba, "tbxteilnehmer_focuschanged", new Object[] {_hasfocus}));}
RDebugUtils.currentLine=46792704;
 //BA.debugLineNum = 46792704;BA.debugLine="Private Sub tbxTeilnehmer_FocusChanged (HasFocus A";
RDebugUtils.currentLine=46792705;
 //BA.debugLineNum = 46792705;BA.debugLine="If HasFocus Then";
if (_hasfocus) { 
RDebugUtils.currentLine=46792706;
 //BA.debugLineNum = 46792706;BA.debugLine="tbxTeilnehmer.SelectionStart = tbxTeilnehmer.Tex";
__ref._tbxteilnehmer /*anywheresoftware.b4a.objects.EditTextWrapper*/ .setSelectionStart(__ref._tbxteilnehmer /*anywheresoftware.b4a.objects.EditTextWrapper*/ .getText().length());
 }else {
RDebugUtils.currentLine=46792708;
 //BA.debugLineNum = 46792708;BA.debugLine="HideKeyboard";
__ref._hidekeyboard /*String*/ (null);
 };
RDebugUtils.currentLine=46792710;
 //BA.debugLineNum = 46792710;BA.debugLine="End Sub";
return "";
}
public String  _tbxteilnehmer_textchanged(b4a.example.settings __ref,String _old,String _new) throws Exception{
__ref = this;
RDebugUtils.currentModule="settings";
if (Debug.shouldDelegate(ba, "tbxteilnehmer_textchanged", false))
	 {return ((String) Debug.delegate(ba, "tbxteilnehmer_textchanged", new Object[] {_old,_new}));}
String _cleaned = "";
anywheresoftware.b4a.keywords.StringBuilderWrapper _sb = null;
boolean _doupper = false;
int _i = 0;
String _letter = "";
RDebugUtils.currentLine=46858240;
 //BA.debugLineNum = 46858240;BA.debugLine="Private Sub tbxTeilnehmer_TextChanged (Old As Stri";
RDebugUtils.currentLine=46858241;
 //BA.debugLineNum = 46858241;BA.debugLine="Log(\"tbxTeilnehmer_TextChanged\")";
__c.LogImpl("846858241","tbxTeilnehmer_TextChanged",0);
RDebugUtils.currentLine=46858242;
 //BA.debugLineNum = 46858242;BA.debugLine="Log(\"dochange = \" & dochange)";
__c.LogImpl("846858242","dochange = "+BA.ObjectToString(__ref._dochange /*boolean*/ ),0);
RDebugUtils.currentLine=46858243;
 //BA.debugLineNum = 46858243;BA.debugLine="If dochange = False Then Return";
if (__ref._dochange /*boolean*/ ==__c.False) { 
if (true) return "";};
RDebugUtils.currentLine=46858245;
 //BA.debugLineNum = 46858245;BA.debugLine="dochange = False";
__ref._dochange /*boolean*/  = __c.False;
RDebugUtils.currentLine=46858246;
 //BA.debugLineNum = 46858246;BA.debugLine="Dim cleaned As String = Regex.Replace(\"[^a-zA-Z0-";
_cleaned = __c.Regex.Replace("[^a-zA-Z0-9äöüÄÖÜßéèêëáàâçñ -]",__ref._tbxteilnehmer /*anywheresoftware.b4a.objects.EditTextWrapper*/ .getText(),"");
RDebugUtils.currentLine=46858248;
 //BA.debugLineNum = 46858248;BA.debugLine="Dim sb As StringBuilder";
_sb = new anywheresoftware.b4a.keywords.StringBuilderWrapper();
RDebugUtils.currentLine=46858249;
 //BA.debugLineNum = 46858249;BA.debugLine="sb.Initialize";
_sb.Initialize();
RDebugUtils.currentLine=46858250;
 //BA.debugLineNum = 46858250;BA.debugLine="Dim doupper As Boolean = True";
_doupper = __c.True;
RDebugUtils.currentLine=46858251;
 //BA.debugLineNum = 46858251;BA.debugLine="For i = 0 To cleaned.Length - 1";
{
final int step9 = 1;
final int limit9 = (int) (_cleaned.length()-1);
_i = (int) (0) ;
for (;_i <= limit9 ;_i = _i + step9 ) {
RDebugUtils.currentLine=46858252;
 //BA.debugLineNum = 46858252;BA.debugLine="Dim letter As String = cleaned.SubString2(i, i +";
_letter = _cleaned.substring(_i,(int) (_i+1));
RDebugUtils.currentLine=46858253;
 //BA.debugLineNum = 46858253;BA.debugLine="If letter = \" \" Or letter = \"-\" Then";
if ((_letter).equals(" ") || (_letter).equals("-")) { 
RDebugUtils.currentLine=46858254;
 //BA.debugLineNum = 46858254;BA.debugLine="doupper = True";
_doupper = __c.True;
RDebugUtils.currentLine=46858255;
 //BA.debugLineNum = 46858255;BA.debugLine="sb.Append(letter)";
_sb.Append(_letter);
 }else 
{RDebugUtils.currentLine=46858256;
 //BA.debugLineNum = 46858256;BA.debugLine="Else if letter = \",\" Then";
if ((_letter).equals(",")) { 
 }else 
{RDebugUtils.currentLine=46858258;
 //BA.debugLineNum = 46858258;BA.debugLine="Else if doupper Then";
if (_doupper) { 
RDebugUtils.currentLine=46858259;
 //BA.debugLineNum = 46858259;BA.debugLine="sb.Append(letter.ToUpperCase)";
_sb.Append(_letter.toUpperCase(anywheresoftware.b4a.keywords.Common.stringLocale));
RDebugUtils.currentLine=46858260;
 //BA.debugLineNum = 46858260;BA.debugLine="doupper = False";
_doupper = __c.False;
 }else {
RDebugUtils.currentLine=46858262;
 //BA.debugLineNum = 46858262;BA.debugLine="sb.Append(letter)";
_sb.Append(_letter);
 }}}
;
 }
};
RDebugUtils.currentLine=46858265;
 //BA.debugLineNum = 46858265;BA.debugLine="tbxTeilnehmer.Text = sb.ToString";
__ref._tbxteilnehmer /*anywheresoftware.b4a.objects.EditTextWrapper*/ .setText(BA.ObjectToCharSequence(_sb.ToString()));
RDebugUtils.currentLine=46858267;
 //BA.debugLineNum = 46858267;BA.debugLine="btnTLNDelete.TextColor = 0xFF888888";
__ref._btntlndelete /*anywheresoftware.b4a.objects.ButtonWrapper*/ .setTextColor(((int)0xff888888));
RDebugUtils.currentLine=46858268;
 //BA.debugLineNum = 46858268;BA.debugLine="btnTLNDelete.Enabled = False";
__ref._btntlndelete /*anywheresoftware.b4a.objects.ButtonWrapper*/ .setEnabled(__c.False);
RDebugUtils.currentLine=46858270;
 //BA.debugLineNum = 46858270;BA.debugLine="If tbxTeilnehmer.Text.Length >= 3 Then";
if (__ref._tbxteilnehmer /*anywheresoftware.b4a.objects.EditTextWrapper*/ .getText().length()>=3) { 
RDebugUtils.currentLine=46858271;
 //BA.debugLineNum = 46858271;BA.debugLine="btnTLNSpeichern.TextColor = colorgreen";
__ref._btntlnspeichern /*anywheresoftware.b4a.objects.ButtonWrapper*/ .setTextColor(__ref._colorgreen /*int*/ );
RDebugUtils.currentLine=46858272;
 //BA.debugLineNum = 46858272;BA.debugLine="btnTLNSpeichern.Enabled = True";
__ref._btntlnspeichern /*anywheresoftware.b4a.objects.ButtonWrapper*/ .setEnabled(__c.True);
 }else {
RDebugUtils.currentLine=46858274;
 //BA.debugLineNum = 46858274;BA.debugLine="btnTLNSpeichern.TextColor = 0xFF888888";
__ref._btntlnspeichern /*anywheresoftware.b4a.objects.ButtonWrapper*/ .setTextColor(((int)0xff888888));
RDebugUtils.currentLine=46858275;
 //BA.debugLineNum = 46858275;BA.debugLine="btnTLNSpeichern.Enabled = False";
__ref._btntlnspeichern /*anywheresoftware.b4a.objects.ButtonWrapper*/ .setEnabled(__c.False);
 };
RDebugUtils.currentLine=46858278;
 //BA.debugLineNum = 46858278;BA.debugLine="dochange = True";
__ref._dochange /*boolean*/  = __c.True;
RDebugUtils.currentLine=46858279;
 //BA.debugLineNum = 46858279;BA.debugLine="tbxTeilnehmer.SelectionStart = tbxTeilnehmer.Text";
__ref._tbxteilnehmer /*anywheresoftware.b4a.objects.EditTextWrapper*/ .setSelectionStart(__ref._tbxteilnehmer /*anywheresoftware.b4a.objects.EditTextWrapper*/ .getText().length());
RDebugUtils.currentLine=46858280;
 //BA.debugLineNum = 46858280;BA.debugLine="startTimer";
__ref._starttimer /*String*/ (null);
RDebugUtils.currentLine=46858281;
 //BA.debugLineNum = 46858281;BA.debugLine="End Sub";
return "";
}
public String  _tbxveranstaltung_focuschanged(b4a.example.settings __ref,boolean _hasfocus) throws Exception{
__ref = this;
RDebugUtils.currentModule="settings";
if (Debug.shouldDelegate(ba, "tbxveranstaltung_focuschanged", false))
	 {return ((String) Debug.delegate(ba, "tbxveranstaltung_focuschanged", new Object[] {_hasfocus}));}
RDebugUtils.currentLine=46530560;
 //BA.debugLineNum = 46530560;BA.debugLine="Private Sub tbxVeranstaltung_FocusChanged (HasFocu";
RDebugUtils.currentLine=46530561;
 //BA.debugLineNum = 46530561;BA.debugLine="If HasFocus Then";
if (_hasfocus) { 
RDebugUtils.currentLine=46530562;
 //BA.debugLineNum = 46530562;BA.debugLine="tbxVeranstaltung.SelectionStart = tbxVeranstaltu";
__ref._tbxveranstaltung /*anywheresoftware.b4a.objects.EditTextWrapper*/ .setSelectionStart(__ref._tbxveranstaltung /*anywheresoftware.b4a.objects.EditTextWrapper*/ .getText().length());
 }else {
RDebugUtils.currentLine=46530564;
 //BA.debugLineNum = 46530564;BA.debugLine="HideKeyboard";
__ref._hidekeyboard /*String*/ (null);
 };
RDebugUtils.currentLine=46530566;
 //BA.debugLineNum = 46530566;BA.debugLine="End Sub";
return "";
}
public String  _tbxveranstaltung_textchanged(b4a.example.settings __ref,String _old,String _new) throws Exception{
__ref = this;
RDebugUtils.currentModule="settings";
if (Debug.shouldDelegate(ba, "tbxveranstaltung_textchanged", false))
	 {return ((String) Debug.delegate(ba, "tbxveranstaltung_textchanged", new Object[] {_old,_new}));}
RDebugUtils.currentLine=46596096;
 //BA.debugLineNum = 46596096;BA.debugLine="Private Sub tbxVeranstaltung_TextChanged (Old As S";
RDebugUtils.currentLine=46596097;
 //BA.debugLineNum = 46596097;BA.debugLine="Log(\"tbxVeranstaltung_TextChanged\")";
__c.LogImpl("846596097","tbxVeranstaltung_TextChanged",0);
RDebugUtils.currentLine=46596098;
 //BA.debugLineNum = 46596098;BA.debugLine="Log(\"dochange = \" & dochange)";
__c.LogImpl("846596098","dochange = "+BA.ObjectToString(__ref._dochange /*boolean*/ ),0);
RDebugUtils.currentLine=46596099;
 //BA.debugLineNum = 46596099;BA.debugLine="If dochange = False Then Return";
if (__ref._dochange /*boolean*/ ==__c.False) { 
if (true) return "";};
RDebugUtils.currentLine=46596101;
 //BA.debugLineNum = 46596101;BA.debugLine="dochange = False";
__ref._dochange /*boolean*/  = __c.False;
RDebugUtils.currentLine=46596102;
 //BA.debugLineNum = 46596102;BA.debugLine="If tbxVeranstaltung.Enabled Then";
if (__ref._tbxveranstaltung /*anywheresoftware.b4a.objects.EditTextWrapper*/ .getEnabled()) { 
RDebugUtils.currentLine=46596103;
 //BA.debugLineNum = 46596103;BA.debugLine="pruefeInhalt";
__ref._pruefeinhalt /*String*/ (null);
 };
RDebugUtils.currentLine=46596105;
 //BA.debugLineNum = 46596105;BA.debugLine="dochange = True";
__ref._dochange /*boolean*/  = __c.True;
RDebugUtils.currentLine=46596106;
 //BA.debugLineNum = 46596106;BA.debugLine="startTimer";
__ref._starttimer /*String*/ (null);
RDebugUtils.currentLine=46596107;
 //BA.debugLineNum = 46596107;BA.debugLine="End Sub";
return "";
}
public String  _uhrzeit_tick(b4a.example.settings __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="settings";
if (Debug.shouldDelegate(ba, "uhrzeit_tick", false))
	 {return ((String) Debug.delegate(ba, "uhrzeit_tick", null));}
RDebugUtils.currentLine=46989312;
 //BA.debugLineNum = 46989312;BA.debugLine="Private Sub Uhrzeit_Tick";
RDebugUtils.currentLine=46989313;
 //BA.debugLineNum = 46989313;BA.debugLine="Uhrzeit.Enabled = False";
__ref._uhrzeit /*anywheresoftware.b4a.objects.Timer*/ .setEnabled(__c.False);
RDebugUtils.currentLine=46989314;
 //BA.debugLineNum = 46989314;BA.debugLine="B4XPages.ShowPage(\"ScreenSaver\")";
_b4xpages._showpage /*String*/ (ba,"ScreenSaver");
RDebugUtils.currentLine=46989315;
 //BA.debugLineNum = 46989315;BA.debugLine="End Sub";
return "";
}
}