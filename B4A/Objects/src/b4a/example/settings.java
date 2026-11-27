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
public anywheresoftware.b4a.objects.PanelWrapper _pnlvstng = null;
public anywheresoftware.b4a.objects.PanelWrapper _pnlteilnehmer = null;
public anywheresoftware.b4a.objects.Timer _uhrzeit = null;
public anywheresoftware.b4a.objects.collections.Map _dbverein = null;
public String _dbfilename = "";
public String _currentweburl = "";
public int _dpryear = 0;
public int _dprmonth = 0;
public int _dprday = 0;
public int _mdefaultlstveranstaltungenheight = 0;
public int _mdefaultlstteilnehmerheight = 0;
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
RDebugUtils.currentLine=7536640;
 //BA.debugLineNum = 7536640;BA.debugLine="Public Sub Initialize";
RDebugUtils.currentLine=7536641;
 //BA.debugLineNum = 7536641;BA.debugLine="Status.Initialize";
__ref._status /*anywheresoftware.b4a.objects.collections.Map*/ .Initialize();
RDebugUtils.currentLine=7536642;
 //BA.debugLineNum = 7536642;BA.debugLine="Veranstaltungen.Initialize";
__ref._veranstaltungen /*anywheresoftware.b4a.objects.collections.Map*/ .Initialize();
RDebugUtils.currentLine=7536643;
 //BA.debugLineNum = 7536643;BA.debugLine="Teilnehmer.Initialize";
__ref._teilnehmer /*anywheresoftware.b4a.objects.collections.List*/ .Initialize();
RDebugUtils.currentLine=7536645;
 //BA.debugLineNum = 7536645;BA.debugLine="LoadTinyDB";
__ref._loadtinydb /*String*/ (null);
RDebugUtils.currentLine=7536647;
 //BA.debugLineNum = 7536647;BA.debugLine="Uhrzeit.Initialize(\"Uhrzeit\", 300000)";
__ref._uhrzeit /*anywheresoftware.b4a.objects.Timer*/ .Initialize(ba,"Uhrzeit",(long) (300000));
RDebugUtils.currentLine=7536649;
 //BA.debugLineNum = 7536649;BA.debugLine="dprYear = DateTime.GetYear(DateTime.Now)";
__ref._dpryear /*int*/  = __c.DateTime.GetYear(__c.DateTime.getNow());
RDebugUtils.currentLine=7536650;
 //BA.debugLineNum = 7536650;BA.debugLine="dprMonth = DateTime.GetMonth(DateTime.Now)";
__ref._dprmonth /*int*/  = __c.DateTime.GetMonth(__c.DateTime.getNow());
RDebugUtils.currentLine=7536651;
 //BA.debugLineNum = 7536651;BA.debugLine="dprDay = DateTime.GetDayOfMonth(DateTime.Now)";
__ref._dprday /*int*/  = __c.DateTime.GetDayOfMonth(__c.DateTime.getNow());
RDebugUtils.currentLine=7536652;
 //BA.debugLineNum = 7536652;BA.debugLine="End Sub";
return "";
}
public String  _b4xpage_appear(b4a.example.settings __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="settings";
if (Debug.shouldDelegate(ba, "b4xpage_appear", false))
	 {return ((String) Debug.delegate(ba, "b4xpage_appear", null));}
RDebugUtils.currentLine=7667712;
 //BA.debugLineNum = 7667712;BA.debugLine="Public Sub B4XPage_Appear";
RDebugUtils.currentLine=7667714;
 //BA.debugLineNum = 7667714;BA.debugLine="LoadTinyDB";
__ref._loadtinydb /*String*/ (null);
RDebugUtils.currentLine=7667716;
 //BA.debugLineNum = 7667716;BA.debugLine="If B4XPages.MainPage.Status.IsInitialized And B4X";
if (_b4xpages._mainpage /*b4a.example.b4xmainpage*/ (ba)._status /*anywheresoftware.b4a.objects.collections.Map*/ .IsInitialized() && _b4xpages._mainpage /*b4a.example.b4xmainpage*/ (ba)._status /*anywheresoftware.b4a.objects.collections.Map*/ .getSize()>0) { 
RDebugUtils.currentLine=7667717;
 //BA.debugLineNum = 7667717;BA.debugLine="Status = B4XPages.MainPage.Status";
__ref._status /*anywheresoftware.b4a.objects.collections.Map*/  = _b4xpages._mainpage /*b4a.example.b4xmainpage*/ (ba)._status /*anywheresoftware.b4a.objects.collections.Map*/ ;
 };
RDebugUtils.currentLine=7667720;
 //BA.debugLineNum = 7667720;BA.debugLine="Veranstaltung_ID = DBGet(\"VeranstaltungID\", \"v0\")";
__ref._veranstaltung_id /*String*/  = BA.ObjectToString(__ref._dbget /*Object*/ (null,"VeranstaltungID",(Object)("v0")));
RDebugUtils.currentLine=7667724;
 //BA.debugLineNum = 7667724;BA.debugLine="disableVSTNG";
__ref._disablevstng /*String*/ (null);
RDebugUtils.currentLine=7667725;
 //BA.debugLineNum = 7667725;BA.debugLine="disableTLN";
__ref._disabletln /*String*/ (null);
RDebugUtils.currentLine=7667726;
 //BA.debugLineNum = 7667726;BA.debugLine="setzeHeaderfromDB";
__ref._setzeheaderfromdb /*String*/ (null);
RDebugUtils.currentLine=7667727;
 //BA.debugLineNum = 7667727;BA.debugLine="changeURL";
__ref._changeurl /*String*/ (null);
RDebugUtils.currentLine=7667729;
 //BA.debugLineNum = 7667729;BA.debugLine="If Veranstaltung_ID = \"v0\" Then";
if ((__ref._veranstaltung_id /*String*/ ).equals("v0")) { 
RDebugUtils.currentLine=7667730;
 //BA.debugLineNum = 7667730;BA.debugLine="DBPut(\"VeranstaltungDatum\", \"\")";
__ref._dbput /*String*/ (null,"VeranstaltungDatum",(Object)(""));
 };
RDebugUtils.currentLine=7667733;
 //BA.debugLineNum = 7667733;BA.debugLine="If Status.GetDefault(\"idToken\", \"\") = \"\" Then";
if ((__ref._status /*anywheresoftware.b4a.objects.collections.Map*/ .GetDefault((Object)("idToken"),(Object)(""))).equals((Object)(""))) { 
RDebugUtils.currentLine=7667734;
 //BA.debugLineNum = 7667734;BA.debugLine="CloseSettings";
__ref._closesettings /*String*/ (null);
 }else {
RDebugUtils.currentLine=7667736;
 //BA.debugLineNum = 7667736;BA.debugLine="holeVeranstaltungen";
__ref._holeveranstaltungen /*String*/ (null);
 };
RDebugUtils.currentLine=7667738;
 //BA.debugLineNum = 7667738;BA.debugLine="startTimer";
__ref._starttimer /*String*/ (null);
RDebugUtils.currentLine=7667739;
 //BA.debugLineNum = 7667739;BA.debugLine="End Sub";
return "";
}
public String  _loadtinydb(b4a.example.settings __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="settings";
if (Debug.shouldDelegate(ba, "loadtinydb", false))
	 {return ((String) Debug.delegate(ba, "loadtinydb", null));}
RDebugUtils.currentLine=10551296;
 //BA.debugLineNum = 10551296;BA.debugLine="Private Sub LoadTinyDB";
RDebugUtils.currentLine=10551297;
 //BA.debugLineNum = 10551297;BA.debugLine="If File.Exists(File.DirInternal, DBFileName) Then";
if (__c.File.Exists(__c.File.getDirInternal(),__ref._dbfilename /*String*/ )) { 
RDebugUtils.currentLine=10551298;
 //BA.debugLineNum = 10551298;BA.debugLine="DBVerein = File.ReadMap(File.DirInternal, DBFile";
__ref._dbverein /*anywheresoftware.b4a.objects.collections.Map*/  = __c.File.ReadMap(__c.File.getDirInternal(),__ref._dbfilename /*String*/ );
 }else {
RDebugUtils.currentLine=10551300;
 //BA.debugLineNum = 10551300;BA.debugLine="DBVerein.Initialize";
__ref._dbverein /*anywheresoftware.b4a.objects.collections.Map*/ .Initialize();
 };
RDebugUtils.currentLine=10551302;
 //BA.debugLineNum = 10551302;BA.debugLine="End Sub";
return "";
}
public Object  _dbget(b4a.example.settings __ref,String _key,Object _defaultvalue) throws Exception{
__ref = this;
RDebugUtils.currentModule="settings";
if (Debug.shouldDelegate(ba, "dbget", false))
	 {return ((Object) Debug.delegate(ba, "dbget", new Object[] {_key,_defaultvalue}));}
String _val = "";
anywheresoftware.b4a.objects.collections.JSONParser _jp = null;
RDebugUtils.currentLine=10682368;
 //BA.debugLineNum = 10682368;BA.debugLine="Private Sub DBGet(Key As String, DefaultValue As O";
RDebugUtils.currentLine=10682369;
 //BA.debugLineNum = 10682369;BA.debugLine="If DBVerein.ContainsKey(Key) = False Then Return";
if (__ref._dbverein /*anywheresoftware.b4a.objects.collections.Map*/ .ContainsKey((Object)(_key))==__c.False) { 
if (true) return _defaultvalue;};
RDebugUtils.currentLine=10682370;
 //BA.debugLineNum = 10682370;BA.debugLine="Dim val As String = DBVerein.Get(Key)";
_val = BA.ObjectToString(__ref._dbverein /*anywheresoftware.b4a.objects.collections.Map*/ .Get((Object)(_key)));
RDebugUtils.currentLine=10682371;
 //BA.debugLineNum = 10682371;BA.debugLine="If val.StartsWith(\"JSON_MAP:\") Then";
if (_val.startsWith("JSON_MAP:")) { 
RDebugUtils.currentLine=10682372;
 //BA.debugLineNum = 10682372;BA.debugLine="Dim jp As JSONParser";
_jp = new anywheresoftware.b4a.objects.collections.JSONParser();
RDebugUtils.currentLine=10682373;
 //BA.debugLineNum = 10682373;BA.debugLine="jp.Initialize(val.SubString(9))";
_jp.Initialize(_val.substring((int) (9)));
RDebugUtils.currentLine=10682374;
 //BA.debugLineNum = 10682374;BA.debugLine="Return jp.NextObject";
if (true) return (Object)(_jp.NextObject().getObject());
 }else 
{RDebugUtils.currentLine=10682375;
 //BA.debugLineNum = 10682375;BA.debugLine="Else If val.StartsWith(\"JSON_LIST:\") Then";
if (_val.startsWith("JSON_LIST:")) { 
RDebugUtils.currentLine=10682376;
 //BA.debugLineNum = 10682376;BA.debugLine="Dim jp As JSONParser";
_jp = new anywheresoftware.b4a.objects.collections.JSONParser();
RDebugUtils.currentLine=10682377;
 //BA.debugLineNum = 10682377;BA.debugLine="jp.Initialize(val.SubString(10))";
_jp.Initialize(_val.substring((int) (10)));
RDebugUtils.currentLine=10682378;
 //BA.debugLineNum = 10682378;BA.debugLine="Return jp.NextArray";
if (true) return (Object)(_jp.NextArray().getObject());
 }}
;
RDebugUtils.currentLine=10682380;
 //BA.debugLineNum = 10682380;BA.debugLine="Return val";
if (true) return (Object)(_val);
RDebugUtils.currentLine=10682381;
 //BA.debugLineNum = 10682381;BA.debugLine="End Sub";
return null;
}
public String  _disablevstng(b4a.example.settings __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="settings";
if (Debug.shouldDelegate(ba, "disablevstng", false))
	 {return ((String) Debug.delegate(ba, "disablevstng", null));}
RDebugUtils.currentLine=7864320;
 //BA.debugLineNum = 7864320;BA.debugLine="Private Sub disableVSTNG";
RDebugUtils.currentLine=7864321;
 //BA.debugLineNum = 7864321;BA.debugLine="dprDatum.Enabled = False";
__ref._dprdatum /*anywheresoftware.b4a.objects.ButtonWrapper*/ .setEnabled(__c.False);
RDebugUtils.currentLine=7864322;
 //BA.debugLineNum = 7864322;BA.debugLine="dprDatum.TextColor = 0xFF888888";
__ref._dprdatum /*anywheresoftware.b4a.objects.ButtonWrapper*/ .setTextColor(((int)0xff888888));
RDebugUtils.currentLine=7864323;
 //BA.debugLineNum = 7864323;BA.debugLine="btnVerstgDelete.Enabled = False";
__ref._btnverstgdelete /*anywheresoftware.b4a.objects.ButtonWrapper*/ .setEnabled(__c.False);
RDebugUtils.currentLine=7864324;
 //BA.debugLineNum = 7864324;BA.debugLine="btnVerstgDelete.TextColor = 0xFF888888";
__ref._btnverstgdelete /*anywheresoftware.b4a.objects.ButtonWrapper*/ .setTextColor(((int)0xff888888));
RDebugUtils.currentLine=7864325;
 //BA.debugLineNum = 7864325;BA.debugLine="btnVerstgSpeichern.Enabled = False";
__ref._btnverstgspeichern /*anywheresoftware.b4a.objects.ButtonWrapper*/ .setEnabled(__c.False);
RDebugUtils.currentLine=7864326;
 //BA.debugLineNum = 7864326;BA.debugLine="btnVerstgSpeichern.TextColor = 0xFF888888";
__ref._btnverstgspeichern /*anywheresoftware.b4a.objects.ButtonWrapper*/ .setTextColor(((int)0xff888888));
RDebugUtils.currentLine=7864327;
 //BA.debugLineNum = 7864327;BA.debugLine="tbxVeranstaltung.Enabled = False";
__ref._tbxveranstaltung /*anywheresoftware.b4a.objects.EditTextWrapper*/ .setEnabled(__c.False);
RDebugUtils.currentLine=7864328;
 //BA.debugLineNum = 7864328;BA.debugLine="tbxAnzahl.Enabled = False";
__ref._tbxanzahl /*anywheresoftware.b4a.objects.EditTextWrapper*/ .setEnabled(__c.False);
RDebugUtils.currentLine=7864330;
 //BA.debugLineNum = 7864330;BA.debugLine="btnAuswahl.TextColor = 0xFF888888";
__ref._btnauswahl /*anywheresoftware.b4a.objects.ButtonWrapper*/ .setTextColor(((int)0xff888888));
RDebugUtils.currentLine=7864331;
 //BA.debugLineNum = 7864331;BA.debugLine="End Sub";
return "";
}
public String  _disabletln(b4a.example.settings __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="settings";
if (Debug.shouldDelegate(ba, "disabletln", false))
	 {return ((String) Debug.delegate(ba, "disabletln", null));}
RDebugUtils.currentLine=7995392;
 //BA.debugLineNum = 7995392;BA.debugLine="Private Sub disableTLN";
RDebugUtils.currentLine=7995393;
 //BA.debugLineNum = 7995393;BA.debugLine="btnTLNDelete.Enabled = False";
__ref._btntlndelete /*anywheresoftware.b4a.objects.ButtonWrapper*/ .setEnabled(__c.False);
RDebugUtils.currentLine=7995394;
 //BA.debugLineNum = 7995394;BA.debugLine="btnTLNSpeichern.Enabled = False";
__ref._btntlnspeichern /*anywheresoftware.b4a.objects.ButtonWrapper*/ .setEnabled(__c.False);
RDebugUtils.currentLine=7995395;
 //BA.debugLineNum = 7995395;BA.debugLine="tbxTeilnehmer.Enabled = False";
__ref._tbxteilnehmer /*anywheresoftware.b4a.objects.EditTextWrapper*/ .setEnabled(__c.False);
RDebugUtils.currentLine=7995396;
 //BA.debugLineNum = 7995396;BA.debugLine="btnTLNDelete.TextColor = 0xFF888888";
__ref._btntlndelete /*anywheresoftware.b4a.objects.ButtonWrapper*/ .setTextColor(((int)0xff888888));
RDebugUtils.currentLine=7995397;
 //BA.debugLineNum = 7995397;BA.debugLine="btnTLNSpeichern.TextColor = 0xFF888888";
__ref._btntlnspeichern /*anywheresoftware.b4a.objects.ButtonWrapper*/ .setTextColor(((int)0xff888888));
RDebugUtils.currentLine=7995398;
 //BA.debugLineNum = 7995398;BA.debugLine="End Sub";
return "";
}
public String  _setzeheaderfromdb(b4a.example.settings __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="settings";
if (Debug.shouldDelegate(ba, "setzeheaderfromdb", false))
	 {return ((String) Debug.delegate(ba, "setzeheaderfromdb", null));}
RDebugUtils.currentLine=8126464;
 //BA.debugLineNum = 8126464;BA.debugLine="Private Sub setzeHeaderfromDB";
RDebugUtils.currentLine=8126465;
 //BA.debugLineNum = 8126465;BA.debugLine="lblVerein.Text = DBGet(\"Bezeichnung\", \"- nicht ge";
__ref._lblverein /*anywheresoftware.b4a.objects.LabelWrapper*/ .setText(BA.ObjectToCharSequence(__ref._dbget /*Object*/ (null,"Bezeichnung",(Object)("- nicht gesetzt -"))));
RDebugUtils.currentLine=8126466;
 //BA.debugLineNum = 8126466;BA.debugLine="lblVeranstaltung.Text = DBGet(\"VeranstaltungName\"";
__ref._lblveranstaltung /*anywheresoftware.b4a.objects.LabelWrapper*/ .setText(BA.ObjectToCharSequence(__ref._dbget /*Object*/ (null,"VeranstaltungName",(Object)("- nicht gesetzt -"))));
RDebugUtils.currentLine=8126467;
 //BA.debugLineNum = 8126467;BA.debugLine="lblDatum.Text = DBGet(\"VeranstaltungDatum\", \"- ni";
__ref._lbldatum /*anywheresoftware.b4a.objects.LabelWrapper*/ .setText(BA.ObjectToCharSequence(__ref._dbget /*Object*/ (null,"VeranstaltungDatum",(Object)("- nicht gesetzt -"))));
RDebugUtils.currentLine=8126468;
 //BA.debugLineNum = 8126468;BA.debugLine="End Sub";
return "";
}
public String  _changeurl(b4a.example.settings __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="settings";
if (Debug.shouldDelegate(ba, "changeurl", false))
	 {return ((String) Debug.delegate(ba, "changeurl", null));}
String _url = "";
RDebugUtils.currentLine=8192000;
 //BA.debugLineNum = 8192000;BA.debugLine="Private Sub changeURL";
RDebugUtils.currentLine=8192001;
 //BA.debugLineNum = 8192001;BA.debugLine="Dim url As String = DBGet(\"VereinsID\", \"[...]\")";
_url = BA.ObjectToString(__ref._dbget /*Object*/ (null,"VereinsID",(Object)("[...]")));
RDebugUtils.currentLine=8192002;
 //BA.debugLineNum = 8192002;BA.debugLine="URLveranstaltungen = \"https://wertungslisten-app-";
__ref._urlveranstaltungen /*String*/  = "https://wertungslisten-app-default-rtdb.europe-west1.firebasedatabase.app/Vereine/"+_url+"/Veranstaltungen";
RDebugUtils.currentLine=8192003;
 //BA.debugLineNum = 8192003;BA.debugLine="URLteilnehmer = \"https://wertungslisten-app-defau";
__ref._urlteilnehmer /*String*/  = "https://wertungslisten-app-default-rtdb.europe-west1.firebasedatabase.app/Vereine/"+_url+"/Teilnehmer";
RDebugUtils.currentLine=8192004;
 //BA.debugLineNum = 8192004;BA.debugLine="URLergebnisse = \"https://wertungslisten-app-defau";
__ref._urlergebnisse /*String*/  = "https://wertungslisten-app-default-rtdb.europe-west1.firebasedatabase.app/Vereine/"+_url+"/Ergebnisse";
RDebugUtils.currentLine=8192005;
 //BA.debugLineNum = 8192005;BA.debugLine="End Sub";
return "";
}
public String  _dbput(b4a.example.settings __ref,String _key,Object _value) throws Exception{
__ref = this;
RDebugUtils.currentModule="settings";
if (Debug.shouldDelegate(ba, "dbput", false))
	 {return ((String) Debug.delegate(ba, "dbput", new Object[] {_key,_value}));}
anywheresoftware.b4a.objects.collections.JSONParser.JSONGenerator _jg = null;
RDebugUtils.currentLine=10616832;
 //BA.debugLineNum = 10616832;BA.debugLine="Private Sub DBPut(Key As String, Value As Object)";
RDebugUtils.currentLine=10616833;
 //BA.debugLineNum = 10616833;BA.debugLine="If Value Is Map Then";
if (_value instanceof java.util.Map) { 
RDebugUtils.currentLine=10616834;
 //BA.debugLineNum = 10616834;BA.debugLine="Dim jg As JSONGenerator";
_jg = new anywheresoftware.b4a.objects.collections.JSONParser.JSONGenerator();
RDebugUtils.currentLine=10616835;
 //BA.debugLineNum = 10616835;BA.debugLine="jg.Initialize(Value)";
_jg.Initialize((anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_value)));
RDebugUtils.currentLine=10616836;
 //BA.debugLineNum = 10616836;BA.debugLine="DBVerein.Put(Key, \"JSON_MAP:\" & jg.ToString)";
__ref._dbverein /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)(_key),(Object)("JSON_MAP:"+_jg.ToString()));
 }else 
{RDebugUtils.currentLine=10616837;
 //BA.debugLineNum = 10616837;BA.debugLine="Else If Value Is List Then";
if (_value instanceof java.util.List) { 
RDebugUtils.currentLine=10616838;
 //BA.debugLineNum = 10616838;BA.debugLine="Dim jg As JSONGenerator";
_jg = new anywheresoftware.b4a.objects.collections.JSONParser.JSONGenerator();
RDebugUtils.currentLine=10616839;
 //BA.debugLineNum = 10616839;BA.debugLine="jg.Initialize2(Value)";
_jg.Initialize2((anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_value)));
RDebugUtils.currentLine=10616840;
 //BA.debugLineNum = 10616840;BA.debugLine="DBVerein.Put(Key, \"JSON_LIST:\" & jg.ToString)";
__ref._dbverein /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)(_key),(Object)("JSON_LIST:"+_jg.ToString()));
 }else {
RDebugUtils.currentLine=10616842;
 //BA.debugLineNum = 10616842;BA.debugLine="DBVerein.Put(Key, Value)";
__ref._dbverein /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)(_key),_value);
 }}
;
RDebugUtils.currentLine=10616844;
 //BA.debugLineNum = 10616844;BA.debugLine="File.WriteMap(File.DirInternal, DBFileName, DBVer";
__c.File.WriteMap(__c.File.getDirInternal(),__ref._dbfilename /*String*/ ,__ref._dbverein /*anywheresoftware.b4a.objects.collections.Map*/ );
RDebugUtils.currentLine=10616845;
 //BA.debugLineNum = 10616845;BA.debugLine="End Sub";
return "";
}
public String  _closesettings(b4a.example.settings __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="settings";
if (Debug.shouldDelegate(ba, "closesettings", false))
	 {return ((String) Debug.delegate(ba, "closesettings", null));}
RDebugUtils.currentLine=7798784;
 //BA.debugLineNum = 7798784;BA.debugLine="Private Sub CloseSettings";
RDebugUtils.currentLine=7798785;
 //BA.debugLineNum = 7798785;BA.debugLine="Uhrzeit.Enabled = False";
__ref._uhrzeit /*anywheresoftware.b4a.objects.Timer*/ .setEnabled(__c.False);
RDebugUtils.currentLine=7798786;
 //BA.debugLineNum = 7798786;BA.debugLine="B4XPages.MainPage.Status = Status";
_b4xpages._mainpage /*b4a.example.b4xmainpage*/ (ba)._status /*anywheresoftware.b4a.objects.collections.Map*/  = __ref._status /*anywheresoftware.b4a.objects.collections.Map*/ ;
RDebugUtils.currentLine=7798787;
 //BA.debugLineNum = 7798787;BA.debugLine="B4XPages.ClosePage(Me)";
_b4xpages._closepage /*String*/ (ba,this);
RDebugUtils.currentLine=7798788;
 //BA.debugLineNum = 7798788;BA.debugLine="End Sub";
return "";
}
public String  _holeveranstaltungen(b4a.example.settings __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="settings";
if (Debug.shouldDelegate(ba, "holeveranstaltungen", false))
	 {return ((String) Debug.delegate(ba, "holeveranstaltungen", null));}
RDebugUtils.currentLine=8257536;
 //BA.debugLineNum = 8257536;BA.debugLine="Private Sub holeVeranstaltungen";
RDebugUtils.currentLine=8257537;
 //BA.debugLineNum = 8257537;BA.debugLine="DBdatenTyp = \"Veranstaltungen\"";
__ref._dbdatentyp /*String*/  = "Veranstaltungen";
RDebugUtils.currentLine=8257538;
 //BA.debugLineNum = 8257538;BA.debugLine="CurrentWebUrl = URLveranstaltungen & \".json?auth=";
__ref._currentweburl /*String*/  = __ref._urlveranstaltungen /*String*/ +".json?auth="+BA.ObjectToString(__ref._status /*anywheresoftware.b4a.objects.collections.Map*/ .GetDefault((Object)("idToken"),(Object)("")));
RDebugUtils.currentLine=8257539;
 //BA.debugLineNum = 8257539;BA.debugLine="ExecuteHttp(\"GET\", CurrentWebUrl, \"\")";
__ref._executehttp /*void*/ (null,"GET",__ref._currentweburl /*String*/ ,"");
RDebugUtils.currentLine=8257540;
 //BA.debugLineNum = 8257540;BA.debugLine="End Sub";
return "";
}
public String  _starttimer(b4a.example.settings __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="settings";
if (Debug.shouldDelegate(ba, "starttimer", false))
	 {return ((String) Debug.delegate(ba, "starttimer", null));}
RDebugUtils.currentLine=10289152;
 //BA.debugLineNum = 10289152;BA.debugLine="Private Sub startTimer";
RDebugUtils.currentLine=10289153;
 //BA.debugLineNum = 10289153;BA.debugLine="Uhrzeit.Enabled = False";
__ref._uhrzeit /*anywheresoftware.b4a.objects.Timer*/ .setEnabled(__c.False);
RDebugUtils.currentLine=10289154;
 //BA.debugLineNum = 10289154;BA.debugLine="Uhrzeit.Interval = 1000 * 300";
__ref._uhrzeit /*anywheresoftware.b4a.objects.Timer*/ .setInterval((long) (1000*300));
RDebugUtils.currentLine=10289155;
 //BA.debugLineNum = 10289155;BA.debugLine="Uhrzeit.Enabled = True";
__ref._uhrzeit /*anywheresoftware.b4a.objects.Timer*/ .setEnabled(__c.True);
RDebugUtils.currentLine=10289156;
 //BA.debugLineNum = 10289156;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=7733249;
 //BA.debugLineNum = 7733249;BA.debugLine="Uhrzeit.Enabled = False";
__ref._uhrzeit /*anywheresoftware.b4a.objects.Timer*/ .setEnabled(parent.__c.False);
RDebugUtils.currentLine=7733250;
 //BA.debugLineNum = 7733250;BA.debugLine="B4XPages.MainPage.Status = Status";
parent._b4xpages._mainpage /*b4a.example.b4xmainpage*/ (ba)._status /*anywheresoftware.b4a.objects.collections.Map*/  = __ref._status /*anywheresoftware.b4a.objects.collections.Map*/ ;
RDebugUtils.currentLine=7733251;
 //BA.debugLineNum = 7733251;BA.debugLine="Return True";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.True));return;};
RDebugUtils.currentLine=7733252;
 //BA.debugLineNum = 7733252;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=7602176;
 //BA.debugLineNum = 7602176;BA.debugLine="Private Sub B4XPage_Created (Root1 As B4XView)";
RDebugUtils.currentLine=7602177;
 //BA.debugLineNum = 7602177;BA.debugLine="Root = Root1";
__ref._root /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = _root1;
RDebugUtils.currentLine=7602178;
 //BA.debugLineNum = 7602178;BA.debugLine="Root.LoadLayout(\"Settings\")";
__ref._root /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .LoadLayout("Settings",ba);
RDebugUtils.currentLine=7602180;
 //BA.debugLineNum = 7602180;BA.debugLine="svMain.Panel.LoadLayout(\"SettingsContent\")";
__ref._svmain /*anywheresoftware.b4a.objects.ScrollViewWrapper*/ .getPanel().LoadLayout("SettingsContent",ba);
RDebugUtils.currentLine=7602182;
 //BA.debugLineNum = 7602182;BA.debugLine="mDefaultLstVeranstaltungenHeight = lstVeranstaltu";
__ref._mdefaultlstveranstaltungenheight /*int*/  = __ref._lstveranstaltungen /*b4a.example3.customlistview*/ ._asview().getHeight();
RDebugUtils.currentLine=7602183;
 //BA.debugLineNum = 7602183;BA.debugLine="mDefaultLstTeilnehmerHeight = lstTeilnehmer.AsVie";
__ref._mdefaultlstteilnehmerheight /*int*/  = __ref._lstteilnehmer /*b4a.example3.customlistview*/ ._asview().getHeight();
RDebugUtils.currentLine=7602185;
 //BA.debugLineNum = 7602185;BA.debugLine="UpdateLayout";
__ref._updatelayout /*String*/ (null);
RDebugUtils.currentLine=7602187;
 //BA.debugLineNum = 7602187;BA.debugLine="End Sub";
return "";
}
public String  _updatelayout(b4a.example.settings __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="settings";
if (Debug.shouldDelegate(ba, "updatelayout", false))
	 {return ((String) Debug.delegate(ba, "updatelayout", null));}
int _hoehe = 0;
int _newtop = 0;
int _delta = 0;
RDebugUtils.currentLine=11206656;
 //BA.debugLineNum = 11206656;BA.debugLine="Private Sub UpdateLayout";
RDebugUtils.currentLine=11206658;
 //BA.debugLineNum = 11206658;BA.debugLine="Dim hoehe As Int = lstVeranstaltungen.sv.Scrol";
_hoehe = __ref._lstveranstaltungen /*b4a.example3.customlistview*/ ._sv.getScrollViewContentHeight();
RDebugUtils.currentLine=11206659;
 //BA.debugLineNum = 11206659;BA.debugLine="hoehe = Max(hoehe, mDefaultLstVeranstaltungenHeig";
_hoehe = (int) (__c.Max(_hoehe,__ref._mdefaultlstveranstaltungenheight /*int*/ ));
RDebugUtils.currentLine=11206661;
 //BA.debugLineNum = 11206661;BA.debugLine="lstVeranstaltungen.AsView.Height = hoehe";
__ref._lstveranstaltungen /*b4a.example3.customlistview*/ ._asview().setHeight(_hoehe);
RDebugUtils.currentLine=11206662;
 //BA.debugLineNum = 11206662;BA.debugLine="lstVeranstaltungen.Base_Resize( lstVeranstaltunge";
__ref._lstveranstaltungen /*b4a.example3.customlistview*/ ._base_resize(__ref._lstveranstaltungen /*b4a.example3.customlistview*/ ._asview().getWidth(),_hoehe);
RDebugUtils.currentLine=11206664;
 //BA.debugLineNum = 11206664;BA.debugLine="Dim newtop As Int = lstVeranstaltungen.AsView.Top";
_newtop = (int) (__ref._lstveranstaltungen /*b4a.example3.customlistview*/ ._asview().getTop()+__ref._lstveranstaltungen /*b4a.example3.customlistview*/ ._asview().getHeight()+__c.DipToCurrent((int) (5)));
RDebugUtils.currentLine=11206665;
 //BA.debugLineNum = 11206665;BA.debugLine="Dim delta As Int = newtop - pnlTeilnehmer.Top";
_delta = (int) (_newtop-__ref._pnlteilnehmer /*anywheresoftware.b4a.objects.PanelWrapper*/ .getTop());
RDebugUtils.currentLine=11206666;
 //BA.debugLineNum = 11206666;BA.debugLine="pnlTeilnehmer.Top = newtop";
__ref._pnlteilnehmer /*anywheresoftware.b4a.objects.PanelWrapper*/ .setTop(_newtop);
RDebugUtils.currentLine=11206668;
 //BA.debugLineNum = 11206668;BA.debugLine="lstTeilnehmer.AsView.Top = lstTeilnehmer.AsView.T";
__ref._lstteilnehmer /*b4a.example3.customlistview*/ ._asview().setTop((int) (__ref._lstteilnehmer /*b4a.example3.customlistview*/ ._asview().getTop()+_delta));
RDebugUtils.currentLine=11206670;
 //BA.debugLineNum = 11206670;BA.debugLine="Dim hoehe As Int = lstTeilnehmer.sv.ScrollViewCon";
_hoehe = __ref._lstteilnehmer /*b4a.example3.customlistview*/ ._sv.getScrollViewContentHeight();
RDebugUtils.currentLine=11206671;
 //BA.debugLineNum = 11206671;BA.debugLine="hoehe = Max(hoehe, mDefaultLstTeilnehmerHeight)";
_hoehe = (int) (__c.Max(_hoehe,__ref._mdefaultlstteilnehmerheight /*int*/ ));
RDebugUtils.currentLine=11206672;
 //BA.debugLineNum = 11206672;BA.debugLine="lstTeilnehmer.AsView.Height = hoehe";
__ref._lstteilnehmer /*b4a.example3.customlistview*/ ._asview().setHeight(_hoehe);
RDebugUtils.currentLine=11206673;
 //BA.debugLineNum = 11206673;BA.debugLine="lstTeilnehmer.Base_Resize( lstTeilnehmer.AsView.W";
__ref._lstteilnehmer /*b4a.example3.customlistview*/ ._base_resize(__ref._lstteilnehmer /*b4a.example3.customlistview*/ ._asview().getWidth(),_hoehe);
RDebugUtils.currentLine=11206675;
 //BA.debugLineNum = 11206675;BA.debugLine="svMain.Panel.Height = _     lstTeilnehmer.AsView.";
__ref._svmain /*anywheresoftware.b4a.objects.ScrollViewWrapper*/ .getPanel().setHeight((int) (__ref._lstteilnehmer /*b4a.example3.customlistview*/ ._asview().getTop()+__ref._lstteilnehmer /*b4a.example3.customlistview*/ ._asview().getHeight()+__c.DipToCurrent((int) (20))));
RDebugUtils.currentLine=11206679;
 //BA.debugLineNum = 11206679;BA.debugLine="End Sub";
return "";
}
public String  _btnauswahl_click(b4a.example.settings __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="settings";
if (Debug.shouldDelegate(ba, "btnauswahl_click", false))
	 {return ((String) Debug.delegate(ba, "btnauswahl_click", null));}
RDebugUtils.currentLine=9568256;
 //BA.debugLineNum = 9568256;BA.debugLine="Private Sub btnAuswahl_Click";
RDebugUtils.currentLine=9568262;
 //BA.debugLineNum = 9568262;BA.debugLine="TestVeranstaltungsliste";
__ref._testveranstaltungsliste /*String*/ (null);
RDebugUtils.currentLine=9568263;
 //BA.debugLineNum = 9568263;BA.debugLine="End Sub";
return "";
}
public String  _testveranstaltungsliste(b4a.example.settings __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="settings";
if (Debug.shouldDelegate(ba, "testveranstaltungsliste", false))
	 {return ((String) Debug.delegate(ba, "testveranstaltungsliste", null));}
anywheresoftware.b4a.objects.B4XViewWrapper _p = null;
anywheresoftware.b4a.objects.PanelWrapper _pnlrow = null;
anywheresoftware.b4a.objects.LabelWrapper _lbld = null;
anywheresoftware.b4a.objects.LabelWrapper _lblv = null;
int _i = 0;
int _anzahltln = 0;
anywheresoftware.b4a.objects.LabelWrapper _lblt = null;
RDebugUtils.currentLine=11075584;
 //BA.debugLineNum = 11075584;BA.debugLine="Private Sub TestVeranstaltungsliste";
RDebugUtils.currentLine=11075586;
 //BA.debugLineNum = 11075586;BA.debugLine="lstVeranstaltungen.Clear";
__ref._lstveranstaltungen /*b4a.example3.customlistview*/ ._clear();
RDebugUtils.currentLine=11075588;
 //BA.debugLineNum = 11075588;BA.debugLine="Dim p As B4XView";
_p = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=11075589;
 //BA.debugLineNum = 11075589;BA.debugLine="p = CreateVeranstaltungRow(\"Datum\", \"Bezeichnung\"";
_p = __ref._createveranstaltungrow /*anywheresoftware.b4a.objects.B4XViewWrapper*/ (null,"Datum","Bezeichnung");
RDebugUtils.currentLine=11075590;
 //BA.debugLineNum = 11075590;BA.debugLine="lstVeranstaltungen.Add(p, 1)";
__ref._lstveranstaltungen /*b4a.example3.customlistview*/ ._add(_p,(Object)(1));
RDebugUtils.currentLine=11075592;
 //BA.debugLineNum = 11075592;BA.debugLine="Dim pnlRow As Panel = p.GetView(0)";
_pnlrow = new anywheresoftware.b4a.objects.PanelWrapper();
_pnlrow = (anywheresoftware.b4a.objects.PanelWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.PanelWrapper(), (android.view.ViewGroup)(_p.GetView((int) (0)).getObject()));
RDebugUtils.currentLine=11075594;
 //BA.debugLineNum = 11075594;BA.debugLine="Dim lblD As Label = pnlRow.GetView(0)";
_lbld = new anywheresoftware.b4a.objects.LabelWrapper();
_lbld = (anywheresoftware.b4a.objects.LabelWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.LabelWrapper(), (android.widget.TextView)(_pnlrow.GetView((int) (0)).getObject()));
RDebugUtils.currentLine=11075595;
 //BA.debugLineNum = 11075595;BA.debugLine="lblD.Color = 0xFF16AA16";
_lbld.setColor(((int)0xff16aa16));
RDebugUtils.currentLine=11075596;
 //BA.debugLineNum = 11075596;BA.debugLine="lblD.TextColor = 0xFFFFFFFF";
_lbld.setTextColor(((int)0xffffffff));
RDebugUtils.currentLine=11075597;
 //BA.debugLineNum = 11075597;BA.debugLine="lblD.Typeface = Typeface.DEFAULT_BOLD";
_lbld.setTypeface(__c.Typeface.DEFAULT_BOLD);
RDebugUtils.currentLine=11075599;
 //BA.debugLineNum = 11075599;BA.debugLine="Dim lblV As Label = pnlRow.GetView(1)";
_lblv = new anywheresoftware.b4a.objects.LabelWrapper();
_lblv = (anywheresoftware.b4a.objects.LabelWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.LabelWrapper(), (android.widget.TextView)(_pnlrow.GetView((int) (1)).getObject()));
RDebugUtils.currentLine=11075600;
 //BA.debugLineNum = 11075600;BA.debugLine="lblV.Color = 0xFF16AA16";
_lblv.setColor(((int)0xff16aa16));
RDebugUtils.currentLine=11075601;
 //BA.debugLineNum = 11075601;BA.debugLine="lblV.TextColor = 0xFFFFFFFF";
_lblv.setTextColor(((int)0xffffffff));
RDebugUtils.currentLine=11075602;
 //BA.debugLineNum = 11075602;BA.debugLine="lblV.Gravity = Gravity.CENTER_HORIZONTAL + Gravit";
_lblv.setGravity((int) (__c.Gravity.CENTER_HORIZONTAL+__c.Gravity.CENTER_VERTICAL));
RDebugUtils.currentLine=11075603;
 //BA.debugLineNum = 11075603;BA.debugLine="lblV.Padding  = Array As Int(5dip, 5dip, 5dip, 5d";
_lblv.setPadding(new int[]{__c.DipToCurrent((int) (5)),__c.DipToCurrent((int) (5)),__c.DipToCurrent((int) (5)),__c.DipToCurrent((int) (5))});
RDebugUtils.currentLine=11075604;
 //BA.debugLineNum = 11075604;BA.debugLine="lblV.Typeface = Typeface.DEFAULT_BOLD";
_lblv.setTypeface(__c.Typeface.DEFAULT_BOLD);
RDebugUtils.currentLine=11075606;
 //BA.debugLineNum = 11075606;BA.debugLine="For i = 2 To 9";
{
final int step16 = 1;
final int limit16 = (int) (9);
_i = (int) (2) ;
for (;_i <= limit16 ;_i = _i + step16 ) {
RDebugUtils.currentLine=11075607;
 //BA.debugLineNum = 11075607;BA.debugLine="lstVeranstaltungen.Add(CreateVeranstaltungRow( $";
__ref._lstveranstaltungen /*b4a.example3.customlistview*/ ._add(__ref._createveranstaltungrow /*anywheresoftware.b4a.objects.B4XViewWrapper*/ (null,("0"+__c.SmartStringFormatter("",(Object)(_i))+".05.2026"),("Veranstaltung "+__c.SmartStringFormatter("",(Object)(_i-1))+"")),(Object)(_i));
 }
};
RDebugUtils.currentLine=11075610;
 //BA.debugLineNum = 11075610;BA.debugLine="lstTeilnehmer.Clear";
__ref._lstteilnehmer /*b4a.example3.customlistview*/ ._clear();
RDebugUtils.currentLine=11075612;
 //BA.debugLineNum = 11075612;BA.debugLine="Dim anzahltln As Int = 10";
_anzahltln = (int) (10);
RDebugUtils.currentLine=11075613;
 //BA.debugLineNum = 11075613;BA.debugLine="Dim p As B4XView";
_p = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=11075614;
 //BA.debugLineNum = 11075614;BA.debugLine="p = CreateTeilnehmerRow(\"Teilnehmer (\" & anzahltl";
_p = __ref._createteilnehmerrow /*anywheresoftware.b4a.objects.B4XViewWrapper*/ (null,"Teilnehmer ("+BA.NumberToString(_anzahltln)+")");
RDebugUtils.currentLine=11075615;
 //BA.debugLineNum = 11075615;BA.debugLine="lstTeilnehmer.Add(p, 1)";
__ref._lstteilnehmer /*b4a.example3.customlistview*/ ._add(_p,(Object)(1));
RDebugUtils.currentLine=11075617;
 //BA.debugLineNum = 11075617;BA.debugLine="Dim pnlRow As Panel = p.GetView(0)";
_pnlrow = new anywheresoftware.b4a.objects.PanelWrapper();
_pnlrow = (anywheresoftware.b4a.objects.PanelWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.PanelWrapper(), (android.view.ViewGroup)(_p.GetView((int) (0)).getObject()));
RDebugUtils.currentLine=11075619;
 //BA.debugLineNum = 11075619;BA.debugLine="Dim lblT As Label = pnlRow.GetView(0)";
_lblt = new anywheresoftware.b4a.objects.LabelWrapper();
_lblt = (anywheresoftware.b4a.objects.LabelWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.LabelWrapper(), (android.widget.TextView)(_pnlrow.GetView((int) (0)).getObject()));
RDebugUtils.currentLine=11075620;
 //BA.debugLineNum = 11075620;BA.debugLine="lblT.Color = 0xFF16AA16";
_lblt.setColor(((int)0xff16aa16));
RDebugUtils.currentLine=11075621;
 //BA.debugLineNum = 11075621;BA.debugLine="lblT.TextColor = 0xFFFFFFFF";
_lblt.setTextColor(((int)0xffffffff));
RDebugUtils.currentLine=11075622;
 //BA.debugLineNum = 11075622;BA.debugLine="lblT.Typeface = Typeface.DEFAULT_BOLD";
_lblt.setTypeface(__c.Typeface.DEFAULT_BOLD);
RDebugUtils.currentLine=11075623;
 //BA.debugLineNum = 11075623;BA.debugLine="lblT.Gravity = Gravity.CENTER_HORIZONTAL + Gravit";
_lblt.setGravity((int) (__c.Gravity.CENTER_HORIZONTAL+__c.Gravity.CENTER_VERTICAL));
RDebugUtils.currentLine=11075625;
 //BA.debugLineNum = 11075625;BA.debugLine="For i = 2 To anzahltln -1";
{
final int step30 = 1;
final int limit30 = (int) (_anzahltln-1);
_i = (int) (2) ;
for (;_i <= limit30 ;_i = _i + step30 ) {
RDebugUtils.currentLine=11075626;
 //BA.debugLineNum = 11075626;BA.debugLine="lstTeilnehmer.Add(CreateTeilnehmerRow($\"Name Vor";
__ref._lstteilnehmer /*b4a.example3.customlistview*/ ._add(__ref._createteilnehmerrow /*anywheresoftware.b4a.objects.B4XViewWrapper*/ (null,("Name Vorname "+__c.SmartStringFormatter("",(Object)(_i-1))+"")),(Object)(_i));
 }
};
RDebugUtils.currentLine=11075629;
 //BA.debugLineNum = 11075629;BA.debugLine="UpdateLayout";
__ref._updatelayout /*String*/ (null);
RDebugUtils.currentLine=11075631;
 //BA.debugLineNum = 11075631;BA.debugLine="lstViewVeranstaltung_markiereZeile(2)";
__ref._lstviewveranstaltung_markierezeile /*String*/ (null,(int) (2));
RDebugUtils.currentLine=11075632;
 //BA.debugLineNum = 11075632;BA.debugLine="lstViewTeilnehmer_markiereZeile(2)";
__ref._lstviewteilnehmer_markierezeile /*String*/ (null,(int) (2));
RDebugUtils.currentLine=11075634;
 //BA.debugLineNum = 11075634;BA.debugLine="End Sub";
return "";
}
public String  _btnback_click(b4a.example.settings __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="settings";
if (Debug.shouldDelegate(ba, "btnback_click", false))
	 {return ((String) Debug.delegate(ba, "btnback_click", null));}
RDebugUtils.currentLine=9371648;
 //BA.debugLineNum = 9371648;BA.debugLine="Private Sub btnBack_Click";
RDebugUtils.currentLine=9371649;
 //BA.debugLineNum = 9371649;BA.debugLine="CloseSettings";
__ref._closesettings /*String*/ (null);
RDebugUtils.currentLine=9371650;
 //BA.debugLineNum = 9371650;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=9764865;
 //BA.debugLineNum = 9764865;BA.debugLine="startTimer";
__ref._starttimer /*String*/ (null);
RDebugUtils.currentLine=9764866;
 //BA.debugLineNum = 9764866;BA.debugLine="Msgbox2Async(tbxTeilnehmer.Text & \" aus der Liste";
parent.__c.Msgbox2Async(BA.ObjectToCharSequence(__ref._tbxteilnehmer /*anywheresoftware.b4a.objects.EditTextWrapper*/ .getText()+" aus der Liste der Teilnehmer löschen?"),BA.ObjectToCharSequence("Teilnehmer wirklich löschen?"),"Löschen","","Abbrechen",(anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper(), (android.graphics.Bitmap)(parent.__c.Null)),ba,parent.__c.True);
RDebugUtils.currentLine=9764867;
 //BA.debugLineNum = 9764867;BA.debugLine="Wait For Msgbox_Result (res As Int)";
parent.__c.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "settings", "btntlndelete_click"), null);
this.state = 5;
return;
case 5:
//C
this.state = 1;
_res = (Integer) result[1];
;
RDebugUtils.currentLine=9764868;
 //BA.debugLineNum = 9764868;BA.debugLine="If res = DialogResponse.POSITIVE Then";
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
RDebugUtils.currentLine=9764869;
 //BA.debugLineNum = 9764869;BA.debugLine="delTLN(TLNid)";
__ref._deltln /*String*/ (null,__ref._tlnid /*String*/ );
RDebugUtils.currentLine=9764870;
 //BA.debugLineNum = 9764870;BA.debugLine="startTimer";
__ref._starttimer /*String*/ (null);
 if (true) break;

case 4:
//C
this.state = -1;
;
RDebugUtils.currentLine=9764872;
 //BA.debugLineNum = 9764872;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=9109504;
 //BA.debugLineNum = 9109504;BA.debugLine="Private Sub delTLN(tid As String)";
RDebugUtils.currentLine=9109505;
 //BA.debugLineNum = 9109505;BA.debugLine="disableTLN";
__ref._disabletln /*String*/ (null);
RDebugUtils.currentLine=9109506;
 //BA.debugLineNum = 9109506;BA.debugLine="ToastMessageShow(\"Der Teilnehmer wird gelöscht!\",";
__c.ToastMessageShow(BA.ObjectToCharSequence("Der Teilnehmer wird gelöscht!"),__c.False);
RDebugUtils.currentLine=9109507;
 //BA.debugLineNum = 9109507;BA.debugLine="DBdatenTyp = \"delTeilnehmer\"";
__ref._dbdatentyp /*String*/  = "delTeilnehmer";
RDebugUtils.currentLine=9109508;
 //BA.debugLineNum = 9109508;BA.debugLine="CurrentWebUrl = URLteilnehmer & \"/\" & tid & \".jso";
__ref._currentweburl /*String*/  = __ref._urlteilnehmer /*String*/ +"/"+_tid+".json?auth="+BA.ObjectToString(__ref._status /*anywheresoftware.b4a.objects.collections.Map*/ .GetDefault((Object)("idToken"),(Object)("")));
RDebugUtils.currentLine=9109509;
 //BA.debugLineNum = 9109509;BA.debugLine="ExecuteHttp(\"DELETE\", CurrentWebUrl, \"\")";
__ref._executehttp /*void*/ (null,"DELETE",__ref._currentweburl /*String*/ ,"");
RDebugUtils.currentLine=9109510;
 //BA.debugLineNum = 9109510;BA.debugLine="enableTLN";
__ref._enabletln /*String*/ (null);
RDebugUtils.currentLine=9109511;
 //BA.debugLineNum = 9109511;BA.debugLine="End Sub";
return "";
}
public String  _btntlnspeichern_click(b4a.example.settings __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="settings";
if (Debug.shouldDelegate(ba, "btntlnspeichern_click", false))
	 {return ((String) Debug.delegate(ba, "btntlnspeichern_click", null));}
RDebugUtils.currentLine=9830400;
 //BA.debugLineNum = 9830400;BA.debugLine="Private Sub btnTLNSpeichern_Click";
RDebugUtils.currentLine=9830401;
 //BA.debugLineNum = 9830401;BA.debugLine="saveTLN";
__ref._savetln /*String*/ (null);
RDebugUtils.currentLine=9830402;
 //BA.debugLineNum = 9830402;BA.debugLine="startTimer";
__ref._starttimer /*String*/ (null);
RDebugUtils.currentLine=9830403;
 //BA.debugLineNum = 9830403;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=9043968;
 //BA.debugLineNum = 9043968;BA.debugLine="Private Sub saveTLN";
RDebugUtils.currentLine=9043969;
 //BA.debugLineNum = 9043969;BA.debugLine="disableTLN";
__ref._disabletln /*String*/ (null);
RDebugUtils.currentLine=9043970;
 //BA.debugLineNum = 9043970;BA.debugLine="Dim DBkey As String = TLNid";
_dbkey = __ref._tlnid /*String*/ ;
RDebugUtils.currentLine=9043971;
 //BA.debugLineNum = 9043971;BA.debugLine="If TLNid = \"t0\" Then";
if ((__ref._tlnid /*String*/ ).equals("t0")) { 
RDebugUtils.currentLine=9043972;
 //BA.debugLineNum = 9043972;BA.debugLine="DBkey = TLNnewID";
_dbkey = __ref._tlnnewid /*String*/ ;
 };
RDebugUtils.currentLine=9043975;
 //BA.debugLineNum = 9043975;BA.debugLine="Dim tName As String = tbxTeilnehmer.Text.Trim";
_tname = __ref._tbxteilnehmer /*anywheresoftware.b4a.objects.EditTextWrapper*/ .getText().trim();
RDebugUtils.currentLine=9043976;
 //BA.debugLineNum = 9043976;BA.debugLine="If Teilnehmer.IndexOf(tName) >= 0 Then";
if (__ref._teilnehmer /*anywheresoftware.b4a.objects.collections.List*/ .IndexOf((Object)(_tname))>=0) { 
RDebugUtils.currentLine=9043977;
 //BA.debugLineNum = 9043977;BA.debugLine="MsgboxAsync(\"Der Teilnehmer \" & tName & \" ist be";
__c.MsgboxAsync(BA.ObjectToCharSequence("Der Teilnehmer "+_tname+" ist bereits in der Teilnehmerliste vorhanden und kann nicht erneut angelegt werden. Zum Ändern bitte Teilnehmer auswählen und die Änderung speichern."),BA.ObjectToCharSequence("Speichern nicht möglich!"),ba);
 }else {
RDebugUtils.currentLine=9043979;
 //BA.debugLineNum = 9043979;BA.debugLine="Dim addTLNMap As Map = CreateMap(\"Name\": tName)";
_addtlnmap = new anywheresoftware.b4a.objects.collections.Map();
_addtlnmap = __c.createMap(new Object[] {(Object)("Name"),(Object)(_tname)});
RDebugUtils.currentLine=9043980;
 //BA.debugLineNum = 9043980;BA.debugLine="CurrentWebUrl = URLteilnehmer & \"/\" & DBkey & \".";
__ref._currentweburl /*String*/  = __ref._urlteilnehmer /*String*/ +"/"+_dbkey+".json?auth="+BA.ObjectToString(__ref._status /*anywheresoftware.b4a.objects.collections.Map*/ .GetDefault((Object)("idToken"),(Object)("")));
RDebugUtils.currentLine=9043981;
 //BA.debugLineNum = 9043981;BA.debugLine="DBdatenTyp = \"addTLN\"";
__ref._dbdatentyp /*String*/  = "addTLN";
RDebugUtils.currentLine=9043983;
 //BA.debugLineNum = 9043983;BA.debugLine="Dim jg As JSONGenerator";
_jg = new anywheresoftware.b4a.objects.collections.JSONParser.JSONGenerator();
RDebugUtils.currentLine=9043984;
 //BA.debugLineNum = 9043984;BA.debugLine="jg.Initialize(addTLNMap)";
_jg.Initialize(_addtlnmap);
RDebugUtils.currentLine=9043985;
 //BA.debugLineNum = 9043985;BA.debugLine="ExecuteHttp(\"PUT\", CurrentWebUrl, jg.ToString)";
__ref._executehttp /*void*/ (null,"PUT",__ref._currentweburl /*String*/ ,_jg.ToString());
 };
RDebugUtils.currentLine=9043987;
 //BA.debugLineNum = 9043987;BA.debugLine="enableTLN";
__ref._enabletln /*String*/ (null);
RDebugUtils.currentLine=9043988;
 //BA.debugLineNum = 9043988;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=9633793;
 //BA.debugLineNum = 9633793;BA.debugLine="startTimer";
__ref._starttimer /*String*/ (null);
RDebugUtils.currentLine=9633794;
 //BA.debugLineNum = 9633794;BA.debugLine="Msgbox2Async(\"Die Veranstaltung und deren Wertung";
parent.__c.Msgbox2Async(BA.ObjectToCharSequence("Die Veranstaltung und deren Wertungsliste werden unwiederbringlich gelöscht! Wirklich löschen?"),BA.ObjectToCharSequence("Veranstaltung wirklich löschen?"),"Löschen","","Abbrechen",(anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper(), (android.graphics.Bitmap)(parent.__c.Null)),ba,parent.__c.True);
RDebugUtils.currentLine=9633795;
 //BA.debugLineNum = 9633795;BA.debugLine="Wait For Msgbox_Result (res As Int)";
parent.__c.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "settings", "btnverstgdelete_click"), null);
this.state = 5;
return;
case 5:
//C
this.state = 1;
_res = (Integer) result[1];
;
RDebugUtils.currentLine=9633796;
 //BA.debugLineNum = 9633796;BA.debugLine="If res = DialogResponse.POSITIVE Then";
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
RDebugUtils.currentLine=9633797;
 //BA.debugLineNum = 9633797;BA.debugLine="delWertungsliste(webviewVSTGN_ID)";
__ref._delwertungsliste /*String*/ (null,__ref._webviewvstgn_id /*String*/ );
RDebugUtils.currentLine=9633798;
 //BA.debugLineNum = 9633798;BA.debugLine="startTimer";
__ref._starttimer /*String*/ (null);
 if (true) break;

case 4:
//C
this.state = -1;
;
RDebugUtils.currentLine=9633800;
 //BA.debugLineNum = 9633800;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=8650752;
 //BA.debugLineNum = 8650752;BA.debugLine="Private Sub delWertungsliste(vid As String)";
RDebugUtils.currentLine=8650753;
 //BA.debugLineNum = 8650753;BA.debugLine="disableVSTNG";
__ref._disablevstng /*String*/ (null);
RDebugUtils.currentLine=8650754;
 //BA.debugLineNum = 8650754;BA.debugLine="If Veranstaltungen.IsInitialized And Veranstaltun";
if (__ref._veranstaltungen /*anywheresoftware.b4a.objects.collections.Map*/ .IsInitialized() && __ref._veranstaltungen /*anywheresoftware.b4a.objects.collections.Map*/ .ContainsKey((Object)(_vid))) { 
RDebugUtils.currentLine=8650755;
 //BA.debugLineNum = 8650755;BA.debugLine="Dim veranstaltung As Map = Veranstaltungen.Get(v";
_veranstaltung = new anywheresoftware.b4a.objects.collections.Map();
_veranstaltung = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(__ref._veranstaltungen /*anywheresoftware.b4a.objects.collections.Map*/ .Get((Object)(_vid))));
RDebugUtils.currentLine=8650756;
 //BA.debugLineNum = 8650756;BA.debugLine="Dim datumStr As String = veranstaltung.GetDefaul";
_datumstr = BA.ObjectToString(_veranstaltung.GetDefault((Object)("Datum"),(Object)("00.00.0000")));
RDebugUtils.currentLine=8650757;
 //BA.debugLineNum = 8650757;BA.debugLine="Dim datum_spl() As String = Regex.Split(\"\\.\", da";
_datum_spl = __c.Regex.Split("\\.",_datumstr);
RDebugUtils.currentLine=8650758;
 //BA.debugLineNum = 8650758;BA.debugLine="If datum_spl.Length >= 3 Then";
if (_datum_spl.length>=3) { 
RDebugUtils.currentLine=8650759;
 //BA.debugLineNum = 8650759;BA.debugLine="DBdatenTyp = \"delErgebnis\"";
__ref._dbdatentyp /*String*/  = "delErgebnis";
RDebugUtils.currentLine=8650760;
 //BA.debugLineNum = 8650760;BA.debugLine="CurrentWebUrl = URLergebnisse & \"/e\" & datum_sp";
__ref._currentweburl /*String*/  = __ref._urlergebnisse /*String*/ +"/e"+_datum_spl[(int) (2)]+_datum_spl[(int) (1)]+_datum_spl[(int) (0)]+".json?auth="+BA.ObjectToString(__ref._status /*anywheresoftware.b4a.objects.collections.Map*/ .GetDefault((Object)("idToken"),(Object)("")));
RDebugUtils.currentLine=8650761;
 //BA.debugLineNum = 8650761;BA.debugLine="ExecuteHttp(\"DELETE\", CurrentWebUrl, \"\")";
__ref._executehttp /*void*/ (null,"DELETE",__ref._currentweburl /*String*/ ,"");
 };
 };
RDebugUtils.currentLine=8650764;
 //BA.debugLineNum = 8650764;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=9699329;
 //BA.debugLineNum = 9699329;BA.debugLine="startTimer";
__ref._starttimer /*String*/ (null);
RDebugUtils.currentLine=9699330;
 //BA.debugLineNum = 9699330;BA.debugLine="Dim neuAnz As Int = 0";
_neuanz = (int) (0);
RDebugUtils.currentLine=9699331;
 //BA.debugLineNum = 9699331;BA.debugLine="If IsNumber(tbxAnzahl.Text) Then neuAnz = tbxAnza";
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
RDebugUtils.currentLine=9699333;
 //BA.debugLineNum = 9699333;BA.debugLine="Dim altAnz As Int = 0";
_altanz = (int) (0);
RDebugUtils.currentLine=9699334;
 //BA.debugLineNum = 9699334;BA.debugLine="If Veranstaltungen.IsInitialized And Veranstaltun";
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
RDebugUtils.currentLine=9699335;
 //BA.debugLineNum = 9699335;BA.debugLine="Dim vMap As Map = Veranstaltungen.Get(Veranstalt";
_vmap = new anywheresoftware.b4a.objects.collections.Map();
_vmap = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(__ref._veranstaltungen /*anywheresoftware.b4a.objects.collections.Map*/ .Get((Object)(__ref._veranstaltung_id /*String*/ ))));
RDebugUtils.currentLine=9699336;
 //BA.debugLineNum = 9699336;BA.debugLine="altAnz = vMap.GetDefault(\"Teilnehmerzahl\", \"0\")";
_altanz = (int)(BA.ObjectToNumber(_vmap.GetDefault((Object)("Teilnehmerzahl"),(Object)("0"))));
 if (true) break;
;
RDebugUtils.currentLine=9699339;
 //BA.debugLineNum = 9699339;BA.debugLine="If neuAnz < altAnz Then";

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
RDebugUtils.currentLine=9699340;
 //BA.debugLineNum = 9699340;BA.debugLine="Msgbox2Async(\"Die Anzahl der Plätze wurde reduzi";
parent.__c.Msgbox2Async(BA.ObjectToCharSequence("Die Anzahl der Plätze wurde reduziert. Werden die geänderten Daten der Veranstaltung gespeichert, gehen ggf. Informationen in der Wertungsliste der Veranstaltung unwiederbringlich verloren."),BA.ObjectToCharSequence("Veranstaltung - Plätze"),"Trotzdem speichern.","","Abbrechen",(anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper(), (android.graphics.Bitmap)(parent.__c.Null)),ba,parent.__c.True);
RDebugUtils.currentLine=9699341;
 //BA.debugLineNum = 9699341;BA.debugLine="Wait For Msgbox_Result (res As Int)";
parent.__c.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "settings", "btnverstgspeichern_click"), null);
this.state = 20;
return;
case 20:
//C
this.state = 13;
_res = (Integer) result[1];
;
RDebugUtils.currentLine=9699342;
 //BA.debugLineNum = 9699342;BA.debugLine="If res = DialogResponse.POSITIVE Then";
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
RDebugUtils.currentLine=9699343;
 //BA.debugLineNum = 9699343;BA.debugLine="saveVSTNG";
__ref._savevstng /*String*/ (null);
RDebugUtils.currentLine=9699344;
 //BA.debugLineNum = 9699344;BA.debugLine="startTimer";
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
RDebugUtils.currentLine=9699347;
 //BA.debugLineNum = 9699347;BA.debugLine="saveVSTNG";
__ref._savevstng /*String*/ (null);
 if (true) break;

case 19:
//C
this.state = -1;
;
RDebugUtils.currentLine=9699349;
 //BA.debugLineNum = 9699349;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=8519680;
 //BA.debugLineNum = 8519680;BA.debugLine="Private Sub saveVSTNG";
RDebugUtils.currentLine=8519681;
 //BA.debugLineNum = 8519681;BA.debugLine="disableVSTNG";
__ref._disablevstng /*String*/ (null);
RDebugUtils.currentLine=8519682;
 //BA.debugLineNum = 8519682;BA.debugLine="Dim DBkey As String = webviewVSTGN_ID";
_dbkey = __ref._webviewvstgn_id /*String*/ ;
RDebugUtils.currentLine=8519683;
 //BA.debugLineNum = 8519683;BA.debugLine="If DBkey = \"v0\" Then";
if ((_dbkey).equals("v0")) { 
RDebugUtils.currentLine=8519684;
 //BA.debugLineNum = 8519684;BA.debugLine="DBkey = VSTGNnewID";
_dbkey = __ref._vstgnnewid /*String*/ ;
RDebugUtils.currentLine=8519685;
 //BA.debugLineNum = 8519685;BA.debugLine="webviewVSTGN_ID = VSTGNnewID";
__ref._webviewvstgn_id /*String*/  = __ref._vstgnnewid /*String*/ ;
 };
RDebugUtils.currentLine=8519688;
 //BA.debugLineNum = 8519688;BA.debugLine="Dim body As Map = CreateMap( _ 		\"Datum\": dprDatu";
_body = new anywheresoftware.b4a.objects.collections.Map();
_body = __c.createMap(new Object[] {(Object)("Datum"),(Object)(__ref._dprdatum /*anywheresoftware.b4a.objects.ButtonWrapper*/ .getText()),(Object)("Name"),(Object)(__ref._tbxveranstaltung /*anywheresoftware.b4a.objects.EditTextWrapper*/ .getText()),(Object)("Teilnehmerzahl"),(Object)(__ref._tbxanzahl /*anywheresoftware.b4a.objects.EditTextWrapper*/ .getText()),(Object)("Status"),(Object)("offen")});
RDebugUtils.currentLine=8519694;
 //BA.debugLineNum = 8519694;BA.debugLine="CurrentWebUrl = URLveranstaltungen & \"/\" & DBkey";
__ref._currentweburl /*String*/  = __ref._urlveranstaltungen /*String*/ +"/"+_dbkey+".json?auth="+BA.ObjectToString(__ref._status /*anywheresoftware.b4a.objects.collections.Map*/ .GetDefault((Object)("idToken"),(Object)("")));
RDebugUtils.currentLine=8519695;
 //BA.debugLineNum = 8519695;BA.debugLine="DBdatenTyp = \"addVSTNG\"";
__ref._dbdatentyp /*String*/  = "addVSTNG";
RDebugUtils.currentLine=8519697;
 //BA.debugLineNum = 8519697;BA.debugLine="Dim jg As JSONGenerator";
_jg = new anywheresoftware.b4a.objects.collections.JSONParser.JSONGenerator();
RDebugUtils.currentLine=8519698;
 //BA.debugLineNum = 8519698;BA.debugLine="jg.Initialize(body)";
_jg.Initialize(_body);
RDebugUtils.currentLine=8519699;
 //BA.debugLineNum = 8519699;BA.debugLine="ExecuteHttp(\"PUT\", CurrentWebUrl, jg.ToString)";
__ref._executehttp /*void*/ (null,"PUT",__ref._currentweburl /*String*/ ,_jg.ToString());
RDebugUtils.currentLine=8519701;
 //BA.debugLineNum = 8519701;BA.debugLine="If Veranstaltung_ID = webviewVSTGN_ID Then";
if ((__ref._veranstaltung_id /*String*/ ).equals(__ref._webviewvstgn_id /*String*/ )) { 
RDebugUtils.currentLine=8519702;
 //BA.debugLineNum = 8519702;BA.debugLine="saveDBvstng";
__ref._savedbvstng /*String*/ (null);
 };
RDebugUtils.currentLine=8519704;
 //BA.debugLineNum = 8519704;BA.debugLine="enableVSTNG";
__ref._enablevstng /*String*/ (null);
RDebugUtils.currentLine=8519705;
 //BA.debugLineNum = 8519705;BA.debugLine="End Sub";
return "";
}
public String  _class_globals(b4a.example.settings __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="settings";
RDebugUtils.currentLine=7471104;
 //BA.debugLineNum = 7471104;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=7471105;
 //BA.debugLineNum = 7471105;BA.debugLine="Private Root As B4XView";
_root = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=7471106;
 //BA.debugLineNum = 7471106;BA.debugLine="Private xui As XUI";
_xui = new anywheresoftware.b4a.objects.B4XViewWrapper.XUI();
RDebugUtils.currentLine=7471109;
 //BA.debugLineNum = 7471109;BA.debugLine="Public URLveranstaltungen As String = \"https://we";
_urlveranstaltungen = "https://wertungslisten-app-default-rtdb.europe-west1.firebasedatabase.app/Vereine/[...]/Veranstaltungen";
RDebugUtils.currentLine=7471110;
 //BA.debugLineNum = 7471110;BA.debugLine="Public URLteilnehmer As String = \"https://wertung";
_urlteilnehmer = "https://wertungslisten-app-default-rtdb.europe-west1.firebasedatabase.app/Vereine/[...]/Teilnehmer";
RDebugUtils.currentLine=7471111;
 //BA.debugLineNum = 7471111;BA.debugLine="Public URLergebnisse As String = \"https://wertung";
_urlergebnisse = "https://wertungslisten-app-default-rtdb.europe-west1.firebasedatabase.app/Vereine/[...]/Ergebnisse";
RDebugUtils.currentLine=7471112;
 //BA.debugLineNum = 7471112;BA.debugLine="Public DBdatenTyp As String = \"\"";
_dbdatentyp = "";
RDebugUtils.currentLine=7471113;
 //BA.debugLineNum = 7471113;BA.debugLine="Public dochange As Boolean = False";
_dochange = __c.False;
RDebugUtils.currentLine=7471114;
 //BA.debugLineNum = 7471114;BA.debugLine="Public Status As Map";
_status = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=7471115;
 //BA.debugLineNum = 7471115;BA.debugLine="Public Veranstaltungen As Map";
_veranstaltungen = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=7471116;
 //BA.debugLineNum = 7471116;BA.debugLine="Public webviewVSTGN As List";
_webviewvstgn = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=7471117;
 //BA.debugLineNum = 7471117;BA.debugLine="Public Veranstaltung_ID As String = \"v0\"";
_veranstaltung_id = "v0";
RDebugUtils.currentLine=7471118;
 //BA.debugLineNum = 7471118;BA.debugLine="Public webviewVSTGN_ID As String = \"v0\"";
_webviewvstgn_id = "v0";
RDebugUtils.currentLine=7471119;
 //BA.debugLineNum = 7471119;BA.debugLine="Public VSTGNnewID As String = \"v1\"";
_vstgnnewid = "v1";
RDebugUtils.currentLine=7471120;
 //BA.debugLineNum = 7471120;BA.debugLine="Public Teilnehmer As List";
_teilnehmer = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=7471121;
 //BA.debugLineNum = 7471121;BA.debugLine="Public TLNid As String = \"t0\"";
_tlnid = "t0";
RDebugUtils.currentLine=7471122;
 //BA.debugLineNum = 7471122;BA.debugLine="Public TLNnewID As String = \"t1\"";
_tlnnewid = "t1";
RDebugUtils.currentLine=7471123;
 //BA.debugLineNum = 7471123;BA.debugLine="Public colorgreen As Int = 0xFF16AA16";
_colorgreen = ((int)0xff16aa16);
RDebugUtils.currentLine=7471124;
 //BA.debugLineNum = 7471124;BA.debugLine="Public colorblue As Int = 0xFF3333FF";
_colorblue = ((int)0xff3333ff);
RDebugUtils.currentLine=7471127;
 //BA.debugLineNum = 7471127;BA.debugLine="Private lblVerein As Label";
_lblverein = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=7471128;
 //BA.debugLineNum = 7471128;BA.debugLine="Private lblVeranstaltung As Label";
_lblveranstaltung = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=7471129;
 //BA.debugLineNum = 7471129;BA.debugLine="Private lblDatum As Label";
_lbldatum = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=7471130;
 //BA.debugLineNum = 7471130;BA.debugLine="Private btnBack As Button";
_btnback = new anywheresoftware.b4a.objects.ButtonWrapper();
RDebugUtils.currentLine=7471132;
 //BA.debugLineNum = 7471132;BA.debugLine="Private svMain As ScrollView";
_svmain = new anywheresoftware.b4a.objects.ScrollViewWrapper();
RDebugUtils.currentLine=7471133;
 //BA.debugLineNum = 7471133;BA.debugLine="Private lblClosed As Label";
_lblclosed = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=7471134;
 //BA.debugLineNum = 7471134;BA.debugLine="Private dprDatum As Button ' Ersetzt App Inventor";
_dprdatum = new anywheresoftware.b4a.objects.ButtonWrapper();
RDebugUtils.currentLine=7471135;
 //BA.debugLineNum = 7471135;BA.debugLine="Private btnAuswahl As Button";
_btnauswahl = new anywheresoftware.b4a.objects.ButtonWrapper();
RDebugUtils.currentLine=7471136;
 //BA.debugLineNum = 7471136;BA.debugLine="Private tbxVeranstaltung As EditText";
_tbxveranstaltung = new anywheresoftware.b4a.objects.EditTextWrapper();
RDebugUtils.currentLine=7471137;
 //BA.debugLineNum = 7471137;BA.debugLine="Private tbxAnzahl As EditText";
_tbxanzahl = new anywheresoftware.b4a.objects.EditTextWrapper();
RDebugUtils.currentLine=7471138;
 //BA.debugLineNum = 7471138;BA.debugLine="Private btnVerstgDelete As Button";
_btnverstgdelete = new anywheresoftware.b4a.objects.ButtonWrapper();
RDebugUtils.currentLine=7471139;
 //BA.debugLineNum = 7471139;BA.debugLine="Private btnVerstgSpeichern As Button";
_btnverstgspeichern = new anywheresoftware.b4a.objects.ButtonWrapper();
RDebugUtils.currentLine=7471141;
 //BA.debugLineNum = 7471141;BA.debugLine="Private svMain As ScrollView";
_svmain = new anywheresoftware.b4a.objects.ScrollViewWrapper();
RDebugUtils.currentLine=7471142;
 //BA.debugLineNum = 7471142;BA.debugLine="Private lstVeranstaltungen As CustomListView";
_lstveranstaltungen = new b4a.example3.customlistview();
RDebugUtils.currentLine=7471143;
 //BA.debugLineNum = 7471143;BA.debugLine="Private lstTeilnehmer As CustomListView";
_lstteilnehmer = new b4a.example3.customlistview();
RDebugUtils.currentLine=7471145;
 //BA.debugLineNum = 7471145;BA.debugLine="Private tbxTeilnehmer As EditText";
_tbxteilnehmer = new anywheresoftware.b4a.objects.EditTextWrapper();
RDebugUtils.currentLine=7471146;
 //BA.debugLineNum = 7471146;BA.debugLine="Private btnTLNDelete As Button";
_btntlndelete = new anywheresoftware.b4a.objects.ButtonWrapper();
RDebugUtils.currentLine=7471147;
 //BA.debugLineNum = 7471147;BA.debugLine="Private btnTLNSpeichern As Button";
_btntlnspeichern = new anywheresoftware.b4a.objects.ButtonWrapper();
RDebugUtils.currentLine=7471149;
 //BA.debugLineNum = 7471149;BA.debugLine="Private pnlVstng As Panel";
_pnlvstng = new anywheresoftware.b4a.objects.PanelWrapper();
RDebugUtils.currentLine=7471150;
 //BA.debugLineNum = 7471150;BA.debugLine="Private pnlTeilnehmer As Panel";
_pnlteilnehmer = new anywheresoftware.b4a.objects.PanelWrapper();
RDebugUtils.currentLine=7471153;
 //BA.debugLineNum = 7471153;BA.debugLine="Private Uhrzeit As Timer";
_uhrzeit = new anywheresoftware.b4a.objects.Timer();
RDebugUtils.currentLine=7471154;
 //BA.debugLineNum = 7471154;BA.debugLine="Private DBVerein As Map";
_dbverein = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=7471155;
 //BA.debugLineNum = 7471155;BA.debugLine="Private DBFileName As String = \"DBVerein.dat\"";
_dbfilename = "DBVerein.dat";
RDebugUtils.currentLine=7471156;
 //BA.debugLineNum = 7471156;BA.debugLine="Private CurrentWebUrl As String = \"\"";
_currentweburl = "";
RDebugUtils.currentLine=7471157;
 //BA.debugLineNum = 7471157;BA.debugLine="Private dprYear As Int";
_dpryear = 0;
RDebugUtils.currentLine=7471158;
 //BA.debugLineNum = 7471158;BA.debugLine="Private dprMonth As Int";
_dprmonth = 0;
RDebugUtils.currentLine=7471159;
 //BA.debugLineNum = 7471159;BA.debugLine="Private dprDay As Int";
_dprday = 0;
RDebugUtils.currentLine=7471161;
 //BA.debugLineNum = 7471161;BA.debugLine="Private mDefaultLstVeranstaltungenHeight As Int";
_mdefaultlstveranstaltungenheight = 0;
RDebugUtils.currentLine=7471162;
 //BA.debugLineNum = 7471162;BA.debugLine="Private mDefaultLstTeilnehmerHeight As Int";
_mdefaultlstteilnehmerheight = 0;
RDebugUtils.currentLine=7471164;
 //BA.debugLineNum = 7471164;BA.debugLine="End Sub";
return "";
}
public String  _clvteilnehmer_itemclick(b4a.example.settings __ref,int _index,Object _value) throws Exception{
__ref = this;
RDebugUtils.currentModule="settings";
if (Debug.shouldDelegate(ba, "clvteilnehmer_itemclick", false))
	 {return ((String) Debug.delegate(ba, "clvteilnehmer_itemclick", new Object[] {_index,_value}));}
RDebugUtils.currentLine=10944512;
 //BA.debugLineNum = 10944512;BA.debugLine="Private Sub CLVTeilnehmer_ItemClick(Index As Int,";
RDebugUtils.currentLine=10944514;
 //BA.debugLineNum = 10944514;BA.debugLine="TLNid = Value";
__ref._tlnid /*String*/  = BA.ObjectToString(_value);
RDebugUtils.currentLine=10944515;
 //BA.debugLineNum = 10944515;BA.debugLine="setzeTeilnehmer(TLNid)";
__ref._setzeteilnehmer /*String*/ (null,__ref._tlnid /*String*/ );
RDebugUtils.currentLine=10944517;
 //BA.debugLineNum = 10944517;BA.debugLine="End Sub";
return "";
}
public String  _setzeteilnehmer(b4a.example.settings __ref,String _tid) throws Exception{
__ref = this;
RDebugUtils.currentModule="settings";
if (Debug.shouldDelegate(ba, "setzeteilnehmer", false))
	 {return ((String) Debug.delegate(ba, "setzeteilnehmer", new Object[] {_tid}));}
int _idx = 0;
RDebugUtils.currentLine=8978432;
 //BA.debugLineNum = 8978432;BA.debugLine="Private Sub setzeTeilnehmer(tid As String)";
RDebugUtils.currentLine=8978433;
 //BA.debugLineNum = 8978433;BA.debugLine="disableTLN";
__ref._disabletln /*String*/ (null);
RDebugUtils.currentLine=8978434;
 //BA.debugLineNum = 8978434;BA.debugLine="If tid = \"t0\" Then";
if ((_tid).equals("t0")) { 
RDebugUtils.currentLine=8978435;
 //BA.debugLineNum = 8978435;BA.debugLine="dochange = False";
__ref._dochange /*boolean*/  = __c.False;
RDebugUtils.currentLine=8978436;
 //BA.debugLineNum = 8978436;BA.debugLine="tbxTeilnehmer.Text = \"\"";
__ref._tbxteilnehmer /*anywheresoftware.b4a.objects.EditTextWrapper*/ .setText(BA.ObjectToCharSequence(""));
RDebugUtils.currentLine=8978437;
 //BA.debugLineNum = 8978437;BA.debugLine="dochange = True";
__ref._dochange /*boolean*/  = __c.True;
RDebugUtils.currentLine=8978438;
 //BA.debugLineNum = 8978438;BA.debugLine="enableTLN";
__ref._enabletln /*String*/ (null);
RDebugUtils.currentLine=8978439;
 //BA.debugLineNum = 8978439;BA.debugLine="btnTLNDelete.TextColor = 0xFF888888";
__ref._btntlndelete /*anywheresoftware.b4a.objects.ButtonWrapper*/ .setTextColor(((int)0xff888888));
RDebugUtils.currentLine=8978440;
 //BA.debugLineNum = 8978440;BA.debugLine="btnTLNDelete.Enabled = False";
__ref._btntlndelete /*anywheresoftware.b4a.objects.ButtonWrapper*/ .setEnabled(__c.False);
 }else {
RDebugUtils.currentLine=8978442;
 //BA.debugLineNum = 8978442;BA.debugLine="If Teilnehmer.Size > 0 Then";
if (__ref._teilnehmer /*anywheresoftware.b4a.objects.collections.List*/ .getSize()>0) { 
RDebugUtils.currentLine=8978443;
 //BA.debugLineNum = 8978443;BA.debugLine="Dim idx As Int = Teilnehmer.IndexOf(tid)";
_idx = __ref._teilnehmer /*anywheresoftware.b4a.objects.collections.List*/ .IndexOf((Object)(_tid));
RDebugUtils.currentLine=8978444;
 //BA.debugLineNum = 8978444;BA.debugLine="If idx > 0 Then";
if (_idx>0) { 
RDebugUtils.currentLine=8978445;
 //BA.debugLineNum = 8978445;BA.debugLine="dochange = False";
__ref._dochange /*boolean*/  = __c.False;
RDebugUtils.currentLine=8978446;
 //BA.debugLineNum = 8978446;BA.debugLine="tbxTeilnehmer.Text = Teilnehmer.Get(idx - 1)";
__ref._tbxteilnehmer /*anywheresoftware.b4a.objects.EditTextWrapper*/ .setText(BA.ObjectToCharSequence(__ref._teilnehmer /*anywheresoftware.b4a.objects.collections.List*/ .Get((int) (_idx-1))));
RDebugUtils.currentLine=8978447;
 //BA.debugLineNum = 8978447;BA.debugLine="dochange = True";
__ref._dochange /*boolean*/  = __c.True;
RDebugUtils.currentLine=8978448;
 //BA.debugLineNum = 8978448;BA.debugLine="enableTLN";
__ref._enabletln /*String*/ (null);
 };
 };
 };
RDebugUtils.currentLine=8978452;
 //BA.debugLineNum = 8978452;BA.debugLine="If tbxTeilnehmer.Enabled Then";
if (__ref._tbxteilnehmer /*anywheresoftware.b4a.objects.EditTextWrapper*/ .getEnabled()) { 
RDebugUtils.currentLine=8978453;
 //BA.debugLineNum = 8978453;BA.debugLine="tbxTeilnehmer.RequestFocus";
__ref._tbxteilnehmer /*anywheresoftware.b4a.objects.EditTextWrapper*/ .RequestFocus();
 };
RDebugUtils.currentLine=8978455;
 //BA.debugLineNum = 8978455;BA.debugLine="End Sub";
return "";
}
public String  _clvveranstaltungen_itemclick(b4a.example.settings __ref,int _index,Object _value) throws Exception{
__ref = this;
RDebugUtils.currentModule="settings";
if (Debug.shouldDelegate(ba, "clvveranstaltungen_itemclick", false))
	 {return ((String) Debug.delegate(ba, "clvveranstaltungen_itemclick", new Object[] {_index,_value}));}
RDebugUtils.currentLine=10813440;
 //BA.debugLineNum = 10813440;BA.debugLine="Private Sub CLVVeranstaltungen_ItemClick(Index As";
RDebugUtils.currentLine=10813442;
 //BA.debugLineNum = 10813442;BA.debugLine="webviewVSTGN_ID = Value";
__ref._webviewvstgn_id /*String*/  = BA.ObjectToString(_value);
RDebugUtils.currentLine=10813443;
 //BA.debugLineNum = 10813443;BA.debugLine="setzeVeranstaltung(webviewVSTGN_ID)";
__ref._setzeveranstaltung /*String*/ (null,__ref._webviewvstgn_id /*String*/ );
RDebugUtils.currentLine=10813445;
 //BA.debugLineNum = 10813445;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=8388608;
 //BA.debugLineNum = 8388608;BA.debugLine="Private Sub setzeVeranstaltung(vid As String)";
RDebugUtils.currentLine=8388609;
 //BA.debugLineNum = 8388609;BA.debugLine="disableVSTNG";
__ref._disablevstng /*String*/ (null);
RDebugUtils.currentLine=8388610;
 //BA.debugLineNum = 8388610;BA.debugLine="Dim veranstaltung As Map";
_veranstaltung = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=8388611;
 //BA.debugLineNum = 8388611;BA.debugLine="If Veranstaltungen.IsInitialized And Veranstaltun";
if (__ref._veranstaltungen /*anywheresoftware.b4a.objects.collections.Map*/ .IsInitialized() && __ref._veranstaltungen /*anywheresoftware.b4a.objects.collections.Map*/ .ContainsKey((Object)(_vid))) { 
RDebugUtils.currentLine=8388612;
 //BA.debugLineNum = 8388612;BA.debugLine="veranstaltung = Veranstaltungen.Get(vid)";
_veranstaltung = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(__ref._veranstaltungen /*anywheresoftware.b4a.objects.collections.Map*/ .Get((Object)(_vid))));
 }else {
RDebugUtils.currentLine=8388614;
 //BA.debugLineNum = 8388614;BA.debugLine="veranstaltung.Initialize";
_veranstaltung.Initialize();
 };
RDebugUtils.currentLine=8388617;
 //BA.debugLineNum = 8388617;BA.debugLine="Dim datum As String = veranstaltung.GetDefault(\"D";
_datum = BA.ObjectToString(_veranstaltung.GetDefault((Object)("Datum"),(Object)(__ref._formatdatecustom /*String*/ (null,__c.DateTime.getNow(),"dd.MM.yyyy"))));
RDebugUtils.currentLine=8388618;
 //BA.debugLineNum = 8388618;BA.debugLine="Dim datum_spl() As String = Regex.Split(\"\\.\", dat";
_datum_spl = __c.Regex.Split("\\.",_datum);
RDebugUtils.currentLine=8388619;
 //BA.debugLineNum = 8388619;BA.debugLine="If datum_spl.Length >= 3 Then";
if (_datum_spl.length>=3) { 
RDebugUtils.currentLine=8388620;
 //BA.debugLineNum = 8388620;BA.debugLine="dprYear = datum_spl(2)";
__ref._dpryear /*int*/  = (int)(Double.parseDouble(_datum_spl[(int) (2)]));
RDebugUtils.currentLine=8388621;
 //BA.debugLineNum = 8388621;BA.debugLine="dprMonth = datum_spl(1)";
__ref._dprmonth /*int*/  = (int)(Double.parseDouble(_datum_spl[(int) (1)]));
RDebugUtils.currentLine=8388622;
 //BA.debugLineNum = 8388622;BA.debugLine="dprDay = datum_spl(0)";
__ref._dprday /*int*/  = (int)(Double.parseDouble(_datum_spl[(int) (0)]));
 };
RDebugUtils.currentLine=8388625;
 //BA.debugLineNum = 8388625;BA.debugLine="dprDatum.Text = datum";
__ref._dprdatum /*anywheresoftware.b4a.objects.ButtonWrapper*/ .setText(BA.ObjectToCharSequence(_datum));
RDebugUtils.currentLine=8388630;
 //BA.debugLineNum = 8388630;BA.debugLine="tbxAnzahl.Text = veranstaltung.GetDefault(\"Teilne";
__ref._tbxanzahl /*anywheresoftware.b4a.objects.EditTextWrapper*/ .setText(BA.ObjectToCharSequence(_veranstaltung.GetDefault((Object)("Teilnehmerzahl"),(Object)("0"))));
RDebugUtils.currentLine=8388632;
 //BA.debugLineNum = 8388632;BA.debugLine="If \"offen\" = veranstaltung.GetDefault(\"Status\", \"";
if (("offen").equals(BA.ObjectToString(_veranstaltung.GetDefault((Object)("Status"),(Object)("offen"))))) { 
RDebugUtils.currentLine=8388633;
 //BA.debugLineNum = 8388633;BA.debugLine="dprDatum.Enabled = True";
__ref._dprdatum /*anywheresoftware.b4a.objects.ButtonWrapper*/ .setEnabled(__c.True);
RDebugUtils.currentLine=8388634;
 //BA.debugLineNum = 8388634;BA.debugLine="dprDatum.TextColor = colorgreen";
__ref._dprdatum /*anywheresoftware.b4a.objects.ButtonWrapper*/ .setTextColor(__ref._colorgreen /*int*/ );
RDebugUtils.currentLine=8388635;
 //BA.debugLineNum = 8388635;BA.debugLine="tbxVeranstaltung.Enabled = True";
__ref._tbxveranstaltung /*anywheresoftware.b4a.objects.EditTextWrapper*/ .setEnabled(__c.True);
RDebugUtils.currentLine=8388636;
 //BA.debugLineNum = 8388636;BA.debugLine="tbxAnzahl.Enabled = True";
__ref._tbxanzahl /*anywheresoftware.b4a.objects.EditTextWrapper*/ .setEnabled(__c.True);
RDebugUtils.currentLine=8388637;
 //BA.debugLineNum = 8388637;BA.debugLine="lblClosed.Visible = False";
__ref._lblclosed /*anywheresoftware.b4a.objects.LabelWrapper*/ .setVisible(__c.False);
 }else {
RDebugUtils.currentLine=8388639;
 //BA.debugLineNum = 8388639;BA.debugLine="lblClosed.Visible = True";
__ref._lblclosed /*anywheresoftware.b4a.objects.LabelWrapper*/ .setVisible(__c.True);
 };
RDebugUtils.currentLine=8388642;
 //BA.debugLineNum = 8388642;BA.debugLine="btnVerstgDelete.Enabled = True";
__ref._btnverstgdelete /*anywheresoftware.b4a.objects.ButtonWrapper*/ .setEnabled(__c.True);
RDebugUtils.currentLine=8388643;
 //BA.debugLineNum = 8388643;BA.debugLine="btnVerstgDelete.TextColor = colorgreen";
__ref._btnverstgdelete /*anywheresoftware.b4a.objects.ButtonWrapper*/ .setTextColor(__ref._colorgreen /*int*/ );
RDebugUtils.currentLine=8388645;
 //BA.debugLineNum = 8388645;BA.debugLine="If vid <> \"v0\" Then";
if ((_vid).equals("v0") == false) { 
RDebugUtils.currentLine=8388646;
 //BA.debugLineNum = 8388646;BA.debugLine="btnAuswahl.TextColor = colorblue";
__ref._btnauswahl /*anywheresoftware.b4a.objects.ButtonWrapper*/ .setTextColor(__ref._colorblue /*int*/ );
RDebugUtils.currentLine=8388647;
 //BA.debugLineNum = 8388647;BA.debugLine="btnAuswahl.Enabled = True";
__ref._btnauswahl /*anywheresoftware.b4a.objects.ButtonWrapper*/ .setEnabled(__c.True);
 };
RDebugUtils.currentLine=8388649;
 //BA.debugLineNum = 8388649;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.objects.B4XViewWrapper  _createteilnehmerrow(b4a.example.settings __ref,String _name) throws Exception{
__ref = this;
RDebugUtils.currentModule="settings";
if (Debug.shouldDelegate(ba, "createteilnehmerrow", false))
	 {return ((anywheresoftware.b4a.objects.B4XViewWrapper) Debug.delegate(ba, "createteilnehmerrow", new Object[] {_name}));}
anywheresoftware.b4a.objects.B4XViewWrapper _p = null;
anywheresoftware.b4a.objects.PanelWrapper _row = null;
anywheresoftware.b4a.objects.LabelWrapper _lblt = null;
RDebugUtils.currentLine=51576832;
 //BA.debugLineNum = 51576832;BA.debugLine="Private Sub CreateTeilnehmerRow(Name As String) As";
RDebugUtils.currentLine=51576835;
 //BA.debugLineNum = 51576835;BA.debugLine="Dim p As B4XView = xui.CreatePanel(\"\")";
_p = new anywheresoftware.b4a.objects.B4XViewWrapper();
_p = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .CreatePanel(ba,"");
RDebugUtils.currentLine=51576836;
 //BA.debugLineNum = 51576836;BA.debugLine="p.SetLayoutAnimated(0, 0, 0, lstTeilnehmer.AsView";
_p.SetLayoutAnimated((int) (0),(int) (0),(int) (0),__ref._lstteilnehmer /*b4a.example3.customlistview*/ ._asview().getWidth(),__c.DipToCurrent((int) (26)));
RDebugUtils.currentLine=51576838;
 //BA.debugLineNum = 51576838;BA.debugLine="p.LoadLayout(\"rowTeilnehmer\")";
_p.LoadLayout("rowTeilnehmer",ba);
RDebugUtils.currentLine=51576840;
 //BA.debugLineNum = 51576840;BA.debugLine="Dim row As Panel = p.GetView(0)";
_row = new anywheresoftware.b4a.objects.PanelWrapper();
_row = (anywheresoftware.b4a.objects.PanelWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.PanelWrapper(), (android.view.ViewGroup)(_p.GetView((int) (0)).getObject()));
RDebugUtils.currentLine=51576843;
 //BA.debugLineNum = 51576843;BA.debugLine="p.SetLayoutAnimated(0, 0, 0, lstTeilnehmer.AsView";
_p.SetLayoutAnimated((int) (0),(int) (0),(int) (0),__ref._lstteilnehmer /*b4a.example3.customlistview*/ ._asview().getWidth(),_row.getHeight());
RDebugUtils.currentLine=51576845;
 //BA.debugLineNum = 51576845;BA.debugLine="Dim lblT As Label = row.GetView(0)";
_lblt = new anywheresoftware.b4a.objects.LabelWrapper();
_lblt = (anywheresoftware.b4a.objects.LabelWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.LabelWrapper(), (android.widget.TextView)(_row.GetView((int) (0)).getObject()));
RDebugUtils.currentLine=51576846;
 //BA.debugLineNum = 51576846;BA.debugLine="lblT.Typeface = Typeface.DEFAULT";
_lblt.setTypeface(__c.Typeface.DEFAULT);
RDebugUtils.currentLine=51576847;
 //BA.debugLineNum = 51576847;BA.debugLine="lblT.TextColor = 0xFF000000";
_lblt.setTextColor(((int)0xff000000));
RDebugUtils.currentLine=51576848;
 //BA.debugLineNum = 51576848;BA.debugLine="lblT.Padding  = Array As Int(5dip, 5dip, 5dip, 5d";
_lblt.setPadding(new int[]{__c.DipToCurrent((int) (5)),__c.DipToCurrent((int) (5)),__c.DipToCurrent((int) (5)),__c.DipToCurrent((int) (5))});
RDebugUtils.currentLine=51576850;
 //BA.debugLineNum = 51576850;BA.debugLine="lblT.Text = Name";
_lblt.setText(BA.ObjectToCharSequence(_name));
RDebugUtils.currentLine=51576852;
 //BA.debugLineNum = 51576852;BA.debugLine="Return p";
if (true) return _p;
RDebugUtils.currentLine=51576853;
 //BA.debugLineNum = 51576853;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.objects.B4XViewWrapper  _createveranstaltungrow(b4a.example.settings __ref,String _datum,String _name) throws Exception{
__ref = this;
RDebugUtils.currentModule="settings";
if (Debug.shouldDelegate(ba, "createveranstaltungrow", false))
	 {return ((anywheresoftware.b4a.objects.B4XViewWrapper) Debug.delegate(ba, "createveranstaltungrow", new Object[] {_datum,_name}));}
anywheresoftware.b4a.objects.B4XViewWrapper _p = null;
anywheresoftware.b4a.objects.PanelWrapper _row = null;
anywheresoftware.b4a.objects.LabelWrapper _lbld = null;
anywheresoftware.b4a.objects.LabelWrapper _lblv = null;
RDebugUtils.currentLine=11141120;
 //BA.debugLineNum = 11141120;BA.debugLine="Private Sub CreateVeranstaltungRow(Datum As String";
RDebugUtils.currentLine=11141123;
 //BA.debugLineNum = 11141123;BA.debugLine="Dim p As B4XView = xui.CreatePanel(\"\")";
_p = new anywheresoftware.b4a.objects.B4XViewWrapper();
_p = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .CreatePanel(ba,"");
RDebugUtils.currentLine=11141124;
 //BA.debugLineNum = 11141124;BA.debugLine="p.SetLayoutAnimated(0, 0, 0, lstVeranstaltungen.A";
_p.SetLayoutAnimated((int) (0),(int) (0),(int) (0),__ref._lstveranstaltungen /*b4a.example3.customlistview*/ ._asview().getWidth(),__c.DipToCurrent((int) (26)));
RDebugUtils.currentLine=11141126;
 //BA.debugLineNum = 11141126;BA.debugLine="p.LoadLayout(\"rowVeranstaltung\")";
_p.LoadLayout("rowVeranstaltung",ba);
RDebugUtils.currentLine=11141128;
 //BA.debugLineNum = 11141128;BA.debugLine="Dim row As Panel = p.GetView(0)";
_row = new anywheresoftware.b4a.objects.PanelWrapper();
_row = (anywheresoftware.b4a.objects.PanelWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.PanelWrapper(), (android.view.ViewGroup)(_p.GetView((int) (0)).getObject()));
RDebugUtils.currentLine=11141129;
 //BA.debugLineNum = 11141129;BA.debugLine="Log(\"row.Height = \" & row.Height)";
__c.LogImpl("411141129","row.Height = "+BA.NumberToString(_row.getHeight()),0);
RDebugUtils.currentLine=11141132;
 //BA.debugLineNum = 11141132;BA.debugLine="p.SetLayoutAnimated(0, 0, 0, lstVeranstaltungen.A";
_p.SetLayoutAnimated((int) (0),(int) (0),(int) (0),__ref._lstveranstaltungen /*b4a.example3.customlistview*/ ._asview().getWidth(),_row.getHeight());
RDebugUtils.currentLine=11141134;
 //BA.debugLineNum = 11141134;BA.debugLine="Dim lblD As Label = row.GetView(0)";
_lbld = new anywheresoftware.b4a.objects.LabelWrapper();
_lbld = (anywheresoftware.b4a.objects.LabelWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.LabelWrapper(), (android.widget.TextView)(_row.GetView((int) (0)).getObject()));
RDebugUtils.currentLine=11141135;
 //BA.debugLineNum = 11141135;BA.debugLine="lblD.Typeface = Typeface.DEFAULT";
_lbld.setTypeface(__c.Typeface.DEFAULT);
RDebugUtils.currentLine=11141136;
 //BA.debugLineNum = 11141136;BA.debugLine="lblD.TextColor = 0xFF000000";
_lbld.setTextColor(((int)0xff000000));
RDebugUtils.currentLine=11141137;
 //BA.debugLineNum = 11141137;BA.debugLine="lblD.Padding  = Array As Int(5dip, 5dip, 5dip, 5d";
_lbld.setPadding(new int[]{__c.DipToCurrent((int) (5)),__c.DipToCurrent((int) (5)),__c.DipToCurrent((int) (5)),__c.DipToCurrent((int) (5))});
RDebugUtils.currentLine=11141139;
 //BA.debugLineNum = 11141139;BA.debugLine="Dim lblV As Label = row.GetView(1)";
_lblv = new anywheresoftware.b4a.objects.LabelWrapper();
_lblv = (anywheresoftware.b4a.objects.LabelWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.LabelWrapper(), (android.widget.TextView)(_row.GetView((int) (1)).getObject()));
RDebugUtils.currentLine=11141141;
 //BA.debugLineNum = 11141141;BA.debugLine="Log(\"lblD.Height = \" & lblD.Height)";
__c.LogImpl("411141141","lblD.Height = "+BA.NumberToString(_lbld.getHeight()),0);
RDebugUtils.currentLine=11141142;
 //BA.debugLineNum = 11141142;BA.debugLine="Log(\"lblV.Height = \" & lblV.Height)";
__c.LogImpl("411141142","lblV.Height = "+BA.NumberToString(_lblv.getHeight()),0);
RDebugUtils.currentLine=11141144;
 //BA.debugLineNum = 11141144;BA.debugLine="lblD.Text = Datum";
_lbld.setText(BA.ObjectToCharSequence(_datum));
RDebugUtils.currentLine=11141145;
 //BA.debugLineNum = 11141145;BA.debugLine="lblV.Text = Name";
_lblv.setText(BA.ObjectToCharSequence(_name));
RDebugUtils.currentLine=11141146;
 //BA.debugLineNum = 11141146;BA.debugLine="lblV.Gravity = Gravity.LEFT + Gravity.CENTER_VERT";
_lblv.setGravity((int) (__c.Gravity.LEFT+__c.Gravity.CENTER_VERTICAL));
RDebugUtils.currentLine=11141147;
 //BA.debugLineNum = 11141147;BA.debugLine="lblV.Typeface = Typeface.DEFAULT";
_lblv.setTypeface(__c.Typeface.DEFAULT);
RDebugUtils.currentLine=11141148;
 //BA.debugLineNum = 11141148;BA.debugLine="lblV.TextColor = 0xFF000000";
_lblv.setTextColor(((int)0xff000000));
RDebugUtils.currentLine=11141149;
 //BA.debugLineNum = 11141149;BA.debugLine="lblV.Padding  = Array As Int(5dip, 5dip, 5dip, 5d";
_lblv.setPadding(new int[]{__c.DipToCurrent((int) (5)),__c.DipToCurrent((int) (5)),__c.DipToCurrent((int) (5)),__c.DipToCurrent((int) (5))});
RDebugUtils.currentLine=11141151;
 //BA.debugLineNum = 11141151;BA.debugLine="Return p";
if (true) return _p;
RDebugUtils.currentLine=11141152;
 //BA.debugLineNum = 11141152;BA.debugLine="End Sub";
return null;
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
RDebugUtils.currentLine=9502720;
 //BA.debugLineNum = 9502720;BA.debugLine="Private Sub DateUtils_SetDate(Year As Int, Month A";
RDebugUtils.currentLine=9502721;
 //BA.debugLineNum = 9502721;BA.debugLine="Dim oldFormat As String = DateTime.DateFormat";
_oldformat = __c.DateTime.getDateFormat();
RDebugUtils.currentLine=9502722;
 //BA.debugLineNum = 9502722;BA.debugLine="DateTime.DateFormat = \"yyyy-MM-dd\"";
__c.DateTime.setDateFormat("yyyy-MM-dd");
RDebugUtils.currentLine=9502723;
 //BA.debugLineNum = 9502723;BA.debugLine="Dim paddedMonth As String = NumberFormat(Month, 2";
_paddedmonth = __c.NumberFormat(_month,(int) (2),(int) (0));
RDebugUtils.currentLine=9502724;
 //BA.debugLineNum = 9502724;BA.debugLine="Dim paddedDay As String = NumberFormat(Day, 2, 0)";
_paddedday = __c.NumberFormat(_day,(int) (2),(int) (0));
RDebugUtils.currentLine=9502725;
 //BA.debugLineNum = 9502725;BA.debugLine="Dim ticks As Long = DateTime.DateParse(Year & \"-\"";
_ticks = __c.DateTime.DateParse(BA.NumberToString(_year)+"-"+_paddedmonth+"-"+_paddedday);
RDebugUtils.currentLine=9502726;
 //BA.debugLineNum = 9502726;BA.debugLine="DateTime.DateFormat = oldFormat";
__c.DateTime.setDateFormat(_oldformat);
RDebugUtils.currentLine=9502727;
 //BA.debugLineNum = 9502727;BA.debugLine="Return ticks";
if (true) return _ticks;
RDebugUtils.currentLine=9502728;
 //BA.debugLineNum = 9502728;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=9175041;
 //BA.debugLineNum = 9175041;BA.debugLine="Dim typ As String = DBdatenTyp";
_typ = __ref._dbdatentyp /*String*/ ;
RDebugUtils.currentLine=9175042;
 //BA.debugLineNum = 9175042;BA.debugLine="Dim j As HttpJob";
_j = new b4a.example.httpjob();
RDebugUtils.currentLine=9175043;
 //BA.debugLineNum = 9175043;BA.debugLine="j.Initialize(typ, Me)";
_j._initialize /*String*/ (null,ba,_typ,parent);
RDebugUtils.currentLine=9175045;
 //BA.debugLineNum = 9175045;BA.debugLine="Select method";
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
RDebugUtils.currentLine=9175047;
 //BA.debugLineNum = 9175047;BA.debugLine="j.Download(url)";
_j._download /*String*/ (null,_url);
 if (true) break;

case 5:
//C
this.state = 8;
RDebugUtils.currentLine=9175049;
 //BA.debugLineNum = 9175049;BA.debugLine="j.PutString(url, payload)";
_j._putstring /*String*/ (null,_url,_payload);
RDebugUtils.currentLine=9175050;
 //BA.debugLineNum = 9175050;BA.debugLine="j.GetRequest.SetContentType(\"application/json\")";
_j._getrequest /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ (null).SetContentType("application/json");
 if (true) break;

case 7:
//C
this.state = 8;
RDebugUtils.currentLine=9175052;
 //BA.debugLineNum = 9175052;BA.debugLine="j.Delete(url)";
_j._delete /*String*/ (null,_url);
 if (true) break;

case 8:
//C
this.state = 9;
;
RDebugUtils.currentLine=9175055;
 //BA.debugLineNum = 9175055;BA.debugLine="Wait For (j) JobDone(j As HttpJob)";
parent.__c.WaitFor("jobdone", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "settings", "executehttp"), (Object)(_j));
this.state = 21;
return;
case 21:
//C
this.state = 9;
_j = (b4a.example.httpjob) result[1];
;
RDebugUtils.currentLine=9175057;
 //BA.debugLineNum = 9175057;BA.debugLine="If j.Success Then";
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
RDebugUtils.currentLine=9175058;
 //BA.debugLineNum = 9175058;BA.debugLine="HandleGotText(typ, url, j.GetString)";
__ref._handlegottext /*String*/ (null,_typ,_url,_j._getstring /*String*/ (null));
 if (true) break;

case 13:
//C
this.state = 14;
RDebugUtils.currentLine=9175060;
 //BA.debugLineNum = 9175060;BA.debugLine="If j.ErrorMessage.ToLowerCase.Contains(\"unable t";
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
RDebugUtils.currentLine=9175061;
 //BA.debugLineNum = 9175061;BA.debugLine="setzeOffline";
__ref._setzeoffline /*void*/ (null);
 if (true) break;

case 18:
//C
this.state = 19;
RDebugUtils.currentLine=9175063;
 //BA.debugLineNum = 9175063;BA.debugLine="ToastMessageShow(\"Fehler: \" & j.ErrorMessage, T";
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
RDebugUtils.currentLine=9175066;
 //BA.debugLineNum = 9175066;BA.debugLine="j.Release";
_j._release /*String*/ (null);
RDebugUtils.currentLine=9175067;
 //BA.debugLineNum = 9175067;BA.debugLine="startTimer";
__ref._starttimer /*String*/ (null);
RDebugUtils.currentLine=9175068;
 //BA.debugLineNum = 9175068;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=8060928;
 //BA.debugLineNum = 8060928;BA.debugLine="Private Sub enableTLN";
RDebugUtils.currentLine=8060929;
 //BA.debugLineNum = 8060929;BA.debugLine="btnTLNDelete.Enabled = True";
__ref._btntlndelete /*anywheresoftware.b4a.objects.ButtonWrapper*/ .setEnabled(__c.True);
RDebugUtils.currentLine=8060930;
 //BA.debugLineNum = 8060930;BA.debugLine="btnTLNSpeichern.Enabled = False";
__ref._btntlnspeichern /*anywheresoftware.b4a.objects.ButtonWrapper*/ .setEnabled(__c.False);
RDebugUtils.currentLine=8060931;
 //BA.debugLineNum = 8060931;BA.debugLine="tbxTeilnehmer.Enabled = True";
__ref._tbxteilnehmer /*anywheresoftware.b4a.objects.EditTextWrapper*/ .setEnabled(__c.True);
RDebugUtils.currentLine=8060932;
 //BA.debugLineNum = 8060932;BA.debugLine="btnTLNDelete.TextColor = colorgreen";
__ref._btntlndelete /*anywheresoftware.b4a.objects.ButtonWrapper*/ .setTextColor(__ref._colorgreen /*int*/ );
RDebugUtils.currentLine=8060933;
 //BA.debugLineNum = 8060933;BA.debugLine="btnTLNSpeichern.TextColor = 0xFF888888";
__ref._btntlnspeichern /*anywheresoftware.b4a.objects.ButtonWrapper*/ .setTextColor(((int)0xff888888));
RDebugUtils.currentLine=8060934;
 //BA.debugLineNum = 8060934;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=8716288;
 //BA.debugLineNum = 8716288;BA.debugLine="Private Sub delVeranstaltung(vid As String)";
RDebugUtils.currentLine=8716289;
 //BA.debugLineNum = 8716289;BA.debugLine="disableVSTNG";
__ref._disablevstng /*String*/ (null);
RDebugUtils.currentLine=8716290;
 //BA.debugLineNum = 8716290;BA.debugLine="If Veranstaltungen.IsInitialized And Veranstaltun";
if (__ref._veranstaltungen /*anywheresoftware.b4a.objects.collections.Map*/ .IsInitialized() && __ref._veranstaltungen /*anywheresoftware.b4a.objects.collections.Map*/ .ContainsKey((Object)(_vid))) { 
RDebugUtils.currentLine=8716291;
 //BA.debugLineNum = 8716291;BA.debugLine="Dim veranstaltung As Map = Veranstaltungen.Get(v";
_veranstaltung = new anywheresoftware.b4a.objects.collections.Map();
_veranstaltung = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(__ref._veranstaltungen /*anywheresoftware.b4a.objects.collections.Map*/ .Get((Object)(_vid))));
RDebugUtils.currentLine=8716292;
 //BA.debugLineNum = 8716292;BA.debugLine="Dim vName As String = veranstaltung.GetDefault(\"";
_vname = BA.ObjectToString(_veranstaltung.GetDefault((Object)("Name"),(Object)(" unbenannt ")));
RDebugUtils.currentLine=8716293;
 //BA.debugLineNum = 8716293;BA.debugLine="Dim vDatum As String = veranstaltung.GetDefault(";
_vdatum = BA.ObjectToString(_veranstaltung.GetDefault((Object)("Datum"),(Object)(__ref._formatdatecustom /*String*/ (null,__c.DateTime.getNow(),"dd.MM.yyyy"))));
RDebugUtils.currentLine=8716294;
 //BA.debugLineNum = 8716294;BA.debugLine="ToastMessageShow(\"Die Veranstaltung \" & vName &";
__c.ToastMessageShow(BA.ObjectToCharSequence("Die Veranstaltung "+_vname+" vom "+_vdatum+" wird gelöscht!"),__c.False);
RDebugUtils.currentLine=8716296;
 //BA.debugLineNum = 8716296;BA.debugLine="DBdatenTyp = \"delVeranstaltung\"";
__ref._dbdatentyp /*String*/  = "delVeranstaltung";
RDebugUtils.currentLine=8716297;
 //BA.debugLineNum = 8716297;BA.debugLine="CurrentWebUrl = URLveranstaltungen & \"/\" & vid &";
__ref._currentweburl /*String*/  = __ref._urlveranstaltungen /*String*/ +"/"+_vid+".json?auth="+BA.ObjectToString(__ref._status /*anywheresoftware.b4a.objects.collections.Map*/ .GetDefault((Object)("idToken"),(Object)("")));
RDebugUtils.currentLine=8716298;
 //BA.debugLineNum = 8716298;BA.debugLine="ExecuteHttp(\"DELETE\", CurrentWebUrl, \"\")";
__ref._executehttp /*void*/ (null,"DELETE",__ref._currentweburl /*String*/ ,"");
 };
RDebugUtils.currentLine=8716300;
 //BA.debugLineNum = 8716300;BA.debugLine="enableVSTNG";
__ref._enablevstng /*String*/ (null);
RDebugUtils.currentLine=8716301;
 //BA.debugLineNum = 8716301;BA.debugLine="End Sub";
return "";
}
public String  _formatdatecustom(b4a.example.settings __ref,long _ticks,String _pattern) throws Exception{
__ref = this;
RDebugUtils.currentModule="settings";
if (Debug.shouldDelegate(ba, "formatdatecustom", false))
	 {return ((String) Debug.delegate(ba, "formatdatecustom", new Object[] {_ticks,_pattern}));}
String _oldformat = "";
String _res = "";
RDebugUtils.currentLine=10420224;
 //BA.debugLineNum = 10420224;BA.debugLine="Private Sub FormatDateCustom(ticks As Long, patter";
RDebugUtils.currentLine=10420225;
 //BA.debugLineNum = 10420225;BA.debugLine="Dim oldFormat As String = DateTime.DateFormat";
_oldformat = __c.DateTime.getDateFormat();
RDebugUtils.currentLine=10420226;
 //BA.debugLineNum = 10420226;BA.debugLine="DateTime.DateFormat = pattern";
__c.DateTime.setDateFormat(_pattern);
RDebugUtils.currentLine=10420227;
 //BA.debugLineNum = 10420227;BA.debugLine="Dim res As String = DateTime.Date(ticks)";
_res = __c.DateTime.Date(_ticks);
RDebugUtils.currentLine=10420228;
 //BA.debugLineNum = 10420228;BA.debugLine="DateTime.DateFormat = oldFormat";
__c.DateTime.setDateFormat(_oldformat);
RDebugUtils.currentLine=10420229;
 //BA.debugLineNum = 10420229;BA.debugLine="Return res";
if (true) return _res;
RDebugUtils.currentLine=10420230;
 //BA.debugLineNum = 10420230;BA.debugLine="End Sub";
return "";
}
public String  _enablevstng(b4a.example.settings __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="settings";
if (Debug.shouldDelegate(ba, "enablevstng", false))
	 {return ((String) Debug.delegate(ba, "enablevstng", null));}
RDebugUtils.currentLine=7929856;
 //BA.debugLineNum = 7929856;BA.debugLine="Private Sub enableVSTNG";
RDebugUtils.currentLine=7929857;
 //BA.debugLineNum = 7929857;BA.debugLine="dprDatum.Enabled = True";
__ref._dprdatum /*anywheresoftware.b4a.objects.ButtonWrapper*/ .setEnabled(__c.True);
RDebugUtils.currentLine=7929858;
 //BA.debugLineNum = 7929858;BA.debugLine="dprDatum.TextColor = colorgreen";
__ref._dprdatum /*anywheresoftware.b4a.objects.ButtonWrapper*/ .setTextColor(__ref._colorgreen /*int*/ );
RDebugUtils.currentLine=7929859;
 //BA.debugLineNum = 7929859;BA.debugLine="btnVerstgDelete.Enabled = True";
__ref._btnverstgdelete /*anywheresoftware.b4a.objects.ButtonWrapper*/ .setEnabled(__c.True);
RDebugUtils.currentLine=7929860;
 //BA.debugLineNum = 7929860;BA.debugLine="btnVerstgDelete.TextColor = colorgreen";
__ref._btnverstgdelete /*anywheresoftware.b4a.objects.ButtonWrapper*/ .setTextColor(__ref._colorgreen /*int*/ );
RDebugUtils.currentLine=7929861;
 //BA.debugLineNum = 7929861;BA.debugLine="btnVerstgSpeichern.Enabled = False";
__ref._btnverstgspeichern /*anywheresoftware.b4a.objects.ButtonWrapper*/ .setEnabled(__c.False);
RDebugUtils.currentLine=7929862;
 //BA.debugLineNum = 7929862;BA.debugLine="btnVerstgSpeichern.TextColor = 0xFF888888";
__ref._btnverstgspeichern /*anywheresoftware.b4a.objects.ButtonWrapper*/ .setTextColor(((int)0xff888888));
RDebugUtils.currentLine=7929863;
 //BA.debugLineNum = 7929863;BA.debugLine="tbxVeranstaltung.Enabled = True";
__ref._tbxveranstaltung /*anywheresoftware.b4a.objects.EditTextWrapper*/ .setEnabled(__c.True);
RDebugUtils.currentLine=7929864;
 //BA.debugLineNum = 7929864;BA.debugLine="tbxAnzahl.Enabled = True";
__ref._tbxanzahl /*anywheresoftware.b4a.objects.EditTextWrapper*/ .setEnabled(__c.True);
RDebugUtils.currentLine=7929866;
 //BA.debugLineNum = 7929866;BA.debugLine="btnAuswahl.TextColor = 0xFF888888";
__ref._btnauswahl /*anywheresoftware.b4a.objects.ButtonWrapper*/ .setTextColor(((int)0xff888888));
RDebugUtils.currentLine=7929867;
 //BA.debugLineNum = 7929867;BA.debugLine="End Sub";
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
anywheresoftware.b4a.BA.IterableList group19;
int index19;
int groupLen19;

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
RDebugUtils.currentLine=9437185;
 //BA.debugLineNum = 9437185;BA.debugLine="Dim ctxt As JavaObject";
_ctxt = new anywheresoftware.b4j.object.JavaObject();
RDebugUtils.currentLine=9437186;
 //BA.debugLineNum = 9437186;BA.debugLine="ctxt.InitializeContext";
_ctxt.InitializeContext(ba);
RDebugUtils.currentLine=9437188;
 //BA.debugLineNum = 9437188;BA.debugLine="Dim listener As Object = ctxt.CreateEventFromUI(\"";
_listener = _ctxt.CreateEventFromUI(ba,"android.app.DatePickerDialog$OnDateSetListener","DateSet",parent.__c.Null);
RDebugUtils.currentLine=9437189;
 //BA.debugLineNum = 9437189;BA.debugLine="Dim dlg As JavaObject";
_dlg = new anywheresoftware.b4j.object.JavaObject();
RDebugUtils.currentLine=9437190;
 //BA.debugLineNum = 9437190;BA.debugLine="dlg.InitializeNewInstance(\"android.app.DatePicker";
_dlg.InitializeNewInstance("android.app.DatePickerDialog",new Object[]{(Object)(_ctxt.getObject()),_listener,(Object)(__ref._dpryear /*int*/ ),(Object)(__ref._dprmonth /*int*/ -1),(Object)(__ref._dprday /*int*/ )});
RDebugUtils.currentLine=9437191;
 //BA.debugLineNum = 9437191;BA.debugLine="dlg.RunMethod(\"show\", Null)";
_dlg.RunMethod("show",(Object[])(parent.__c.Null));
RDebugUtils.currentLine=9437193;
 //BA.debugLineNum = 9437193;BA.debugLine="Wait For DateSet_Event (MethodName As String, Arg";
parent.__c.WaitFor("dateset_event", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "settings", "dprdatum_click"), null);
this.state = 28;
return;
case 28:
//C
this.state = 1;
_methodname = (String) result[1];
_args = (Object[]) result[2];
;
RDebugUtils.currentLine=9437194;
 //BA.debugLineNum = 9437194;BA.debugLine="If Args.Length >= 4 Then";
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
RDebugUtils.currentLine=9437195;
 //BA.debugLineNum = 9437195;BA.debugLine="dprYear = Args(1)";
__ref._dpryear /*int*/  = (int)(BA.ObjectToNumber(_args[(int) (1)]));
RDebugUtils.currentLine=9437196;
 //BA.debugLineNum = 9437196;BA.debugLine="Dim mZeroBased As Int = Args(2)";
_mzerobased = (int)(BA.ObjectToNumber(_args[(int) (2)]));
RDebugUtils.currentLine=9437197;
 //BA.debugLineNum = 9437197;BA.debugLine="dprMonth = mZeroBased + 1";
__ref._dprmonth /*int*/  = (int) (_mzerobased+1);
RDebugUtils.currentLine=9437198;
 //BA.debugLineNum = 9437198;BA.debugLine="dprDay = Args(3)";
__ref._dprday /*int*/  = (int)(BA.ObjectToNumber(_args[(int) (3)]));
RDebugUtils.currentLine=9437200;
 //BA.debugLineNum = 9437200;BA.debugLine="Dim ticks As Long = DateUtils_SetDate(dprYear, d";
_ticks = __ref._dateutils_setdate /*long*/ (null,__ref._dpryear /*int*/ ,__ref._dprmonth /*int*/ ,__ref._dprday /*int*/ );
RDebugUtils.currentLine=9437201;
 //BA.debugLineNum = 9437201;BA.debugLine="dprDatum.Text = FormatDateCustom(ticks, \"dd.MM.y";
__ref._dprdatum /*anywheresoftware.b4a.objects.ButtonWrapper*/ .setText(BA.ObjectToCharSequence(__ref._formatdatecustom /*String*/ (null,_ticks,"dd.MM.yyyy")));
RDebugUtils.currentLine=9437204;
 //BA.debugLineNum = 9437204;BA.debugLine="btnAuswahl.TextColor = 0xFF888888";
__ref._btnauswahl /*anywheresoftware.b4a.objects.ButtonWrapper*/ .setTextColor(((int)0xff888888));
RDebugUtils.currentLine=9437206;
 //BA.debugLineNum = 9437206;BA.debugLine="If dprDatum.Text <> DBGet(\"VeranstaltungDatum\",";
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
RDebugUtils.currentLine=9437207;
 //BA.debugLineNum = 9437207;BA.debugLine="Dim neu As Boolean = True";
_neu = parent.__c.True;
RDebugUtils.currentLine=9437208;
 //BA.debugLineNum = 9437208;BA.debugLine="If Veranstaltungen.IsInitialized Then";
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
RDebugUtils.currentLine=9437209;
 //BA.debugLineNum = 9437209;BA.debugLine="For Each key As String In Veranstaltungen.Keys";
if (true) break;

case 10:
//for
this.state = 17;
group19 = __ref._veranstaltungen /*anywheresoftware.b4a.objects.collections.Map*/ .Keys();
index19 = 0;
groupLen19 = group19.getSize();
this.state = 29;
if (true) break;

case 29:
//C
this.state = 17;
if (index19 < groupLen19) {
this.state = 12;
_key = BA.ObjectToString(group19.Get(index19));}
if (true) break;

case 30:
//C
this.state = 29;
index19++;
if (true) break;

case 12:
//C
this.state = 13;
RDebugUtils.currentLine=9437210;
 //BA.debugLineNum = 9437210;BA.debugLine="Dim veranstaltung As Map = Veranstaltungen.Ge";
_veranstaltung = new anywheresoftware.b4a.objects.collections.Map();
_veranstaltung = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(__ref._veranstaltungen /*anywheresoftware.b4a.objects.collections.Map*/ .Get((Object)(_key))));
RDebugUtils.currentLine=9437211;
 //BA.debugLineNum = 9437211;BA.debugLine="Dim datum As String = veranstaltung.GetDefaul";
_datum = BA.ObjectToString(_veranstaltung.GetDefault((Object)("Datum"),(Object)("-")));
RDebugUtils.currentLine=9437212;
 //BA.debugLineNum = 9437212;BA.debugLine="If dprDatum.Text = datum Then";
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
RDebugUtils.currentLine=9437213;
 //BA.debugLineNum = 9437213;BA.debugLine="neu = False";
_neu = parent.__c.False;
RDebugUtils.currentLine=9437214;
 //BA.debugLineNum = 9437214;BA.debugLine="disableVSTNG";
__ref._disablevstng /*String*/ (null);
RDebugUtils.currentLine=9437215;
 //BA.debugLineNum = 9437215;BA.debugLine="webviewVSTGN_ID = key";
__ref._webviewvstgn_id /*String*/  = _key;
RDebugUtils.currentLine=9437218;
 //BA.debugLineNum = 9437218;BA.debugLine="enableVSTNG";
__ref._enablevstng /*String*/ (null);
RDebugUtils.currentLine=9437219;
 //BA.debugLineNum = 9437219;BA.debugLine="Exit";
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
RDebugUtils.currentLine=9437224;
 //BA.debugLineNum = 9437224;BA.debugLine="If neu Then";

case 18:
//if
this.state = 25;
if (_neu) { 
this.state = 20;
}if (true) break;

case 20:
//C
this.state = 21;
RDebugUtils.currentLine=9437225;
 //BA.debugLineNum = 9437225;BA.debugLine="Veranstaltung_ID = VSTGNnewID";
__ref._veranstaltung_id /*String*/  = __ref._vstgnnewid /*String*/ ;
RDebugUtils.currentLine=9437226;
 //BA.debugLineNum = 9437226;BA.debugLine="webviewVSTGN_ID = VSTGNnewID";
__ref._webviewvstgn_id /*String*/  = __ref._vstgnnewid /*String*/ ;
RDebugUtils.currentLine=9437227;
 //BA.debugLineNum = 9437227;BA.debugLine="disableVSTNG";
__ref._disablevstng /*String*/ (null);
RDebugUtils.currentLine=9437232;
 //BA.debugLineNum = 9437232;BA.debugLine="tbxAnzahl.Text = \"0\"";
__ref._tbxanzahl /*anywheresoftware.b4a.objects.EditTextWrapper*/ .setText(BA.ObjectToCharSequence("0"));
RDebugUtils.currentLine=9437233;
 //BA.debugLineNum = 9437233;BA.debugLine="enableVSTNG";
__ref._enablevstng /*String*/ (null);
RDebugUtils.currentLine=9437234;
 //BA.debugLineNum = 9437234;BA.debugLine="Dim anzVal As Int = tbxAnzahl.Text";
_anzval = (int)(Double.parseDouble(__ref._tbxanzahl /*anywheresoftware.b4a.objects.EditTextWrapper*/ .getText()));
RDebugUtils.currentLine=9437235;
 //BA.debugLineNum = 9437235;BA.debugLine="If anzVal > 0 Then";
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
RDebugUtils.currentLine=9437236;
 //BA.debugLineNum = 9437236;BA.debugLine="btnVerstgSpeichern.Enabled = True";
__ref._btnverstgspeichern /*anywheresoftware.b4a.objects.ButtonWrapper*/ .setEnabled(parent.__c.True);
RDebugUtils.currentLine=9437237;
 //BA.debugLineNum = 9437237;BA.debugLine="btnVerstgSpeichern.TextColor = colorgreen";
__ref._btnverstgspeichern /*anywheresoftware.b4a.objects.ButtonWrapper*/ .setTextColor(__ref._colorgreen /*int*/ );
 if (true) break;

case 24:
//C
this.state = 25;
;
RDebugUtils.currentLine=9437239;
 //BA.debugLineNum = 9437239;BA.debugLine="btnVerstgDelete.Enabled = False";
__ref._btnverstgdelete /*anywheresoftware.b4a.objects.ButtonWrapper*/ .setEnabled(parent.__c.False);
RDebugUtils.currentLine=9437240;
 //BA.debugLineNum = 9437240;BA.debugLine="btnVerstgDelete.TextColor = 0xFF888888";
__ref._btnverstgdelete /*anywheresoftware.b4a.objects.ButtonWrapper*/ .setTextColor(((int)0xff888888));
RDebugUtils.currentLine=9437242;
 //BA.debugLineNum = 9437242;BA.debugLine="btnAuswahl.TextColor = 0xFF888888";
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
RDebugUtils.currentLine=9437246;
 //BA.debugLineNum = 9437246;BA.debugLine="startTimer";
__ref._starttimer /*String*/ (null);
RDebugUtils.currentLine=9437247;
 //BA.debugLineNum = 9437247;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=9240576;
 //BA.debugLineNum = 9240576;BA.debugLine="Private Sub HandleGotText(typ As String, reqUrl As";
RDebugUtils.currentLine=9240577;
 //BA.debugLineNum = 9240577;BA.debugLine="Dim jp As JSONParser";
_jp = new anywheresoftware.b4a.objects.collections.JSONParser();
RDebugUtils.currentLine=9240579;
 //BA.debugLineNum = 9240579;BA.debugLine="Select typ";
switch (BA.switchObjectToInt(_typ,"Teilnehmer","Veranstaltungen","addVSTNG","addTLN","delTeilnehmer","delVeranstaltung","delErgebnis")) {
case 0: {
RDebugUtils.currentLine=9240581;
 //BA.debugLineNum = 9240581;BA.debugLine="DBdatenTyp = \"\"";
__ref._dbdatentyp /*String*/  = "";
RDebugUtils.currentLine=9240582;
 //BA.debugLineNum = 9240582;BA.debugLine="ladeTeilnehmer(responseContent)";
__ref._ladeteilnehmer /*String*/ (null,_responsecontent);
 break; }
case 1: {
RDebugUtils.currentLine=9240585;
 //BA.debugLineNum = 9240585;BA.debugLine="If responseContent = \"null\" Or responseContent";
if ((_responsecontent).equals("null") || (_responsecontent).equals("")) { 
RDebugUtils.currentLine=9240586;
 //BA.debugLineNum = 9240586;BA.debugLine="Veranstaltungen.Initialize";
__ref._veranstaltungen /*anywheresoftware.b4a.objects.collections.Map*/ .Initialize();
 }else {
RDebugUtils.currentLine=9240588;
 //BA.debugLineNum = 9240588;BA.debugLine="jp.Initialize(responseContent)";
_jp.Initialize(_responsecontent);
RDebugUtils.currentLine=9240589;
 //BA.debugLineNum = 9240589;BA.debugLine="Veranstaltungen = jp.NextObject";
__ref._veranstaltungen /*anywheresoftware.b4a.objects.collections.Map*/  = _jp.NextObject();
 };
RDebugUtils.currentLine=9240591;
 //BA.debugLineNum = 9240591;BA.debugLine="pruefeDBVerein";
__ref._pruefedbverein /*String*/ (null);
RDebugUtils.currentLine=9240592;
 //BA.debugLineNum = 9240592;BA.debugLine="ZeigeVeranstaltungenCLV";
__ref._zeigeveranstaltungenclv /*String*/ (null);
RDebugUtils.currentLine=9240593;
 //BA.debugLineNum = 9240593;BA.debugLine="DBdatenTyp = \"\"";
__ref._dbdatentyp /*String*/  = "";
RDebugUtils.currentLine=9240594;
 //BA.debugLineNum = 9240594;BA.debugLine="holeTLN";
__ref._holetln /*String*/ (null);
 break; }
case 2: {
RDebugUtils.currentLine=9240597;
 //BA.debugLineNum = 9240597;BA.debugLine="DBdatenTyp = \"\"";
__ref._dbdatentyp /*String*/  = "";
RDebugUtils.currentLine=9240598;
 //BA.debugLineNum = 9240598;BA.debugLine="holeVeranstaltungen";
__ref._holeveranstaltungen /*String*/ (null);
 break; }
case 3: {
RDebugUtils.currentLine=9240601;
 //BA.debugLineNum = 9240601;BA.debugLine="DBdatenTyp = \"\"";
__ref._dbdatentyp /*String*/  = "";
RDebugUtils.currentLine=9240602;
 //BA.debugLineNum = 9240602;BA.debugLine="holeTLN";
__ref._holetln /*String*/ (null);
 break; }
case 4: {
RDebugUtils.currentLine=9240605;
 //BA.debugLineNum = 9240605;BA.debugLine="DBdatenTyp = \"\"";
__ref._dbdatentyp /*String*/  = "";
RDebugUtils.currentLine=9240606;
 //BA.debugLineNum = 9240606;BA.debugLine="TLNid = \"t0\"";
__ref._tlnid /*String*/  = "t0";
RDebugUtils.currentLine=9240607;
 //BA.debugLineNum = 9240607;BA.debugLine="holeTLN";
__ref._holetln /*String*/ (null);
 break; }
case 5: {
RDebugUtils.currentLine=9240610;
 //BA.debugLineNum = 9240610;BA.debugLine="DBdatenTyp = \"\"";
__ref._dbdatentyp /*String*/  = "";
RDebugUtils.currentLine=9240611;
 //BA.debugLineNum = 9240611;BA.debugLine="If webviewVSTGN_ID = DBGet(\"VeranstaltungID\", \"";
if ((__ref._webviewvstgn_id /*String*/ ).equals(BA.ObjectToString(__ref._dbget /*Object*/ (null,"VeranstaltungID",(Object)("v0"))))) { 
RDebugUtils.currentLine=9240612;
 //BA.debugLineNum = 9240612;BA.debugLine="Veranstaltung_ID = \"v0\"";
__ref._veranstaltung_id /*String*/  = "v0";
RDebugUtils.currentLine=9240613;
 //BA.debugLineNum = 9240613;BA.debugLine="webviewVSTGN_ID = \"v0\"";
__ref._webviewvstgn_id /*String*/  = "v0";
RDebugUtils.currentLine=9240614;
 //BA.debugLineNum = 9240614;BA.debugLine="DBPut(\"VeranstaltungID\", \"v0\")";
__ref._dbput /*String*/ (null,"VeranstaltungID",(Object)("v0"));
 };
RDebugUtils.currentLine=9240616;
 //BA.debugLineNum = 9240616;BA.debugLine="holeVeranstaltungen";
__ref._holeveranstaltungen /*String*/ (null);
 break; }
case 6: {
RDebugUtils.currentLine=9240619;
 //BA.debugLineNum = 9240619;BA.debugLine="DBdatenTyp = \"\"";
__ref._dbdatentyp /*String*/  = "";
RDebugUtils.currentLine=9240620;
 //BA.debugLineNum = 9240620;BA.debugLine="delVeranstaltung(webviewVSTGN_ID)";
__ref._delveranstaltung /*String*/ (null,__ref._webviewvstgn_id /*String*/ );
 break; }
default: {
RDebugUtils.currentLine=9240623;
 //BA.debugLineNum = 9240623;BA.debugLine="MsgboxAsync(\"(\" & DBdatenTyp & \")\" & reqUrl, \"D";
__c.MsgboxAsync(BA.ObjectToCharSequence("("+__ref._dbdatentyp /*String*/ +")"+_requrl),BA.ObjectToCharSequence("Da stimmt etwas nicht!"),ba);
 break; }
}
;
RDebugUtils.currentLine=9240625;
 //BA.debugLineNum = 9240625;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=9306113;
 //BA.debugLineNum = 9306113;BA.debugLine="Status.Put(\"ProgOffline\", True)";
__ref._status /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("ProgOffline"),(Object)(parent.__c.True));
RDebugUtils.currentLine=9306114;
 //BA.debugLineNum = 9306114;BA.debugLine="Msgbox2Async(\"Die Datenbank ist nicht mehr erreic";
parent.__c.Msgbox2Async(BA.ObjectToCharSequence("Die Datenbank ist nicht mehr erreichbar. Das Programm arbeitet nun offline. Es ist jetzt nur die zuletzt verwendete Wertungsliste verfügbar. Änderungen in den Einstellungen können nicht übernommen werden."),BA.ObjectToCharSequence("Internet-Verbindung nicht möglich!"),"Einstellungen schließen.","","",(anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper(), (android.graphics.Bitmap)(parent.__c.Null)),ba,parent.__c.False);
RDebugUtils.currentLine=9306115;
 //BA.debugLineNum = 9306115;BA.debugLine="Wait For Msgbox_Result (res As Int)";
parent.__c.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "settings", "setzeoffline"), null);
this.state = 5;
return;
case 5:
//C
this.state = 1;
_res = (Integer) result[1];
;
RDebugUtils.currentLine=9306116;
 //BA.debugLineNum = 9306116;BA.debugLine="If res = DialogResponse.POSITIVE Then";
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
RDebugUtils.currentLine=9306117;
 //BA.debugLineNum = 9306117;BA.debugLine="CloseSettings";
__ref._closesettings /*String*/ (null);
 if (true) break;

case 4:
//C
this.state = -1;
;
RDebugUtils.currentLine=9306119;
 //BA.debugLineNum = 9306119;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=8912896;
 //BA.debugLineNum = 8912896;BA.debugLine="Private Sub ladeTeilnehmer(response As String)";
RDebugUtils.currentLine=8912897;
 //BA.debugLineNum = 8912897;BA.debugLine="Teilnehmer.Initialize";
__ref._teilnehmer /*anywheresoftware.b4a.objects.collections.List*/ .Initialize();
RDebugUtils.currentLine=8912898;
 //BA.debugLineNum = 8912898;BA.debugLine="If response <> \"\" And response <> \"null\" Then";
if ((_response).equals("") == false && (_response).equals("null") == false) { 
RDebugUtils.currentLine=8912899;
 //BA.debugLineNum = 8912899;BA.debugLine="Dim jp As JSONParser";
_jp = new anywheresoftware.b4a.objects.collections.JSONParser();
RDebugUtils.currentLine=8912900;
 //BA.debugLineNum = 8912900;BA.debugLine="jp.Initialize(response)";
_jp.Initialize(_response);
RDebugUtils.currentLine=8912901;
 //BA.debugLineNum = 8912901;BA.debugLine="Dim teilnehmerliste As Map = jp.NextObject";
_teilnehmerliste = new anywheresoftware.b4a.objects.collections.Map();
_teilnehmerliste = _jp.NextObject();
RDebugUtils.currentLine=8912903;
 //BA.debugLineNum = 8912903;BA.debugLine="For Each key As String In teilnehmerliste.Keys";
{
final anywheresoftware.b4a.BA.IterableList group6 = _teilnehmerliste.Keys();
final int groupLen6 = group6.getSize()
;int index6 = 0;
;
for (; index6 < groupLen6;index6++){
_key = BA.ObjectToString(group6.Get(index6));
RDebugUtils.currentLine=8912904;
 //BA.debugLineNum = 8912904;BA.debugLine="Dim newID As Int = key.Replace(\"t\", \"\") + 1";
_newid = (int) ((double)(Double.parseDouble(_key.replace("t","")))+1);
RDebugUtils.currentLine=8912905;
 //BA.debugLineNum = 8912905;BA.debugLine="Dim curMax As Int = TLNnewID.Replace(\"t\", \"\")";
_curmax = (int)(Double.parseDouble(__ref._tlnnewid /*String*/ .replace("t","")));
RDebugUtils.currentLine=8912906;
 //BA.debugLineNum = 8912906;BA.debugLine="If newID > curMax Then";
if (_newid>_curmax) { 
RDebugUtils.currentLine=8912907;
 //BA.debugLineNum = 8912907;BA.debugLine="TLNnewID = \"t\" & newID";
__ref._tlnnewid /*String*/  = "t"+BA.NumberToString(_newid);
 };
RDebugUtils.currentLine=8912909;
 //BA.debugLineNum = 8912909;BA.debugLine="Dim tMap As Map = teilnehmerliste.Get(key)";
_tmap = new anywheresoftware.b4a.objects.collections.Map();
_tmap = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_teilnehmerliste.Get((Object)(_key))));
RDebugUtils.currentLine=8912910;
 //BA.debugLineNum = 8912910;BA.debugLine="Teilnehmer.AddAll(Array As Object(tMap.GetDefau";
__ref._teilnehmer /*anywheresoftware.b4a.objects.collections.List*/ .AddAll(anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{_tmap.GetDefault((Object)("Name"),(Object)("unbenannt")),(Object)(_key)}));
 }
};
RDebugUtils.currentLine=8912912;
 //BA.debugLineNum = 8912912;BA.debugLine="Teilnehmer.Add(TLNid)";
__ref._teilnehmer /*anywheresoftware.b4a.objects.collections.List*/ .Add((Object)(__ref._tlnid /*String*/ ));
 };
RDebugUtils.currentLine=8912914;
 //BA.debugLineNum = 8912914;BA.debugLine="ZeigeTeilnehmerCLV";
__ref._zeigeteilnehmerclv /*String*/ (null);
RDebugUtils.currentLine=8912915;
 //BA.debugLineNum = 8912915;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=8454144;
 //BA.debugLineNum = 8454144;BA.debugLine="Private Sub pruefeDBVerein";
RDebugUtils.currentLine=8454145;
 //BA.debugLineNum = 8454145;BA.debugLine="Dim VSTNGexists As Boolean = False";
_vstngexists = __c.False;
RDebugUtils.currentLine=8454146;
 //BA.debugLineNum = 8454146;BA.debugLine="Dim savedID As String = DBGet(\"VeranstaltungID\",";
_savedid = BA.ObjectToString(__ref._dbget /*Object*/ (null,"VeranstaltungID",(Object)("v0")));
RDebugUtils.currentLine=8454148;
 //BA.debugLineNum = 8454148;BA.debugLine="If Veranstaltungen.IsInitialized And Veranstaltun";
if (__ref._veranstaltungen /*anywheresoftware.b4a.objects.collections.Map*/ .IsInitialized() && __ref._veranstaltungen /*anywheresoftware.b4a.objects.collections.Map*/ .getSize()>0) { 
RDebugUtils.currentLine=8454149;
 //BA.debugLineNum = 8454149;BA.debugLine="For Each key As String In Veranstaltungen.Keys";
{
final anywheresoftware.b4a.BA.IterableList group4 = __ref._veranstaltungen /*anywheresoftware.b4a.objects.collections.Map*/ .Keys();
final int groupLen4 = group4.getSize()
;int index4 = 0;
;
for (; index4 < groupLen4;index4++){
_key = BA.ObjectToString(group4.Get(index4));
RDebugUtils.currentLine=8454150;
 //BA.debugLineNum = 8454150;BA.debugLine="webviewVSTGN_ID = key";
__ref._webviewvstgn_id /*String*/  = _key;
RDebugUtils.currentLine=8454151;
 //BA.debugLineNum = 8454151;BA.debugLine="If key = savedID Then";
if ((_key).equals(_savedid)) { 
RDebugUtils.currentLine=8454152;
 //BA.debugLineNum = 8454152;BA.debugLine="VSTNGexists = True";
_vstngexists = __c.True;
RDebugUtils.currentLine=8454153;
 //BA.debugLineNum = 8454153;BA.debugLine="Exit";
if (true) break;
 };
 }
};
 };
RDebugUtils.currentLine=8454158;
 //BA.debugLineNum = 8454158;BA.debugLine="If Not(VSTNGexists) Then";
if (__c.Not(_vstngexists)) { 
RDebugUtils.currentLine=8454159;
 //BA.debugLineNum = 8454159;BA.debugLine="lblVeranstaltung.Text = \"- noch nicht ausgewählt";
__ref._lblveranstaltung /*anywheresoftware.b4a.objects.LabelWrapper*/ .setText(BA.ObjectToCharSequence("- noch nicht ausgewählt -"));
RDebugUtils.currentLine=8454160;
 //BA.debugLineNum = 8454160;BA.debugLine="lblDatum.Text = \"- bitte auswählen -\"";
__ref._lbldatum /*anywheresoftware.b4a.objects.LabelWrapper*/ .setText(BA.ObjectToCharSequence("- bitte auswählen -"));
RDebugUtils.currentLine=8454161;
 //BA.debugLineNum = 8454161;BA.debugLine="Veranstaltung_ID = \"v0\"";
__ref._veranstaltung_id /*String*/  = "v0";
RDebugUtils.currentLine=8454162;
 //BA.debugLineNum = 8454162;BA.debugLine="VSTGNnewID = \"v1\"";
__ref._vstgnnewid /*String*/  = "v1";
RDebugUtils.currentLine=8454163;
 //BA.debugLineNum = 8454163;BA.debugLine="DBPut(\"VeranstaltungID\", \"v0\")";
__ref._dbput /*String*/ (null,"VeranstaltungID",(Object)("v0"));
 };
RDebugUtils.currentLine=8454165;
 //BA.debugLineNum = 8454165;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=10747904;
 //BA.debugLineNum = 10747904;BA.debugLine="Private Sub ZeigeVeranstaltungenCLV";
RDebugUtils.currentLine=10747906;
 //BA.debugLineNum = 10747906;BA.debugLine="lstVeranstaltungen.Clear";
__ref._lstveranstaltungen /*b4a.example3.customlistview*/ ._clear();
RDebugUtils.currentLine=10747908;
 //BA.debugLineNum = 10747908;BA.debugLine="For Each KEY As String In Veranstaltungen.Keys";
{
final anywheresoftware.b4a.BA.IterableList group2 = __ref._veranstaltungen /*anywheresoftware.b4a.objects.collections.Map*/ .Keys();
final int groupLen2 = group2.getSize()
;int index2 = 0;
;
for (; index2 < groupLen2;index2++){
_key = BA.ObjectToString(group2.Get(index2));
RDebugUtils.currentLine=10747910;
 //BA.debugLineNum = 10747910;BA.debugLine="Dim V As Map = Veranstaltungen.Get(KEY)";
_v = new anywheresoftware.b4a.objects.collections.Map();
_v = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(__ref._veranstaltungen /*anywheresoftware.b4a.objects.collections.Map*/ .Get((Object)(_key))));
RDebugUtils.currentLine=10747912;
 //BA.debugLineNum = 10747912;BA.debugLine="Dim DATUM As String = V.GetDefault(\"Datum\", \"\")";
_datum = BA.ObjectToString(_v.GetDefault((Object)("Datum"),(Object)("")));
RDebugUtils.currentLine=10747913;
 //BA.debugLineNum = 10747913;BA.debugLine="Dim NAME As String = V.GetDefault(\"Name\", \"\")";
_name = BA.ObjectToString(_v.GetDefault((Object)("Name"),(Object)("")));
 }
};
RDebugUtils.currentLine=10747921;
 //BA.debugLineNum = 10747921;BA.debugLine="End Sub";
return "";
}
public String  _holetln(b4a.example.settings __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="settings";
if (Debug.shouldDelegate(ba, "holetln", false))
	 {return ((String) Debug.delegate(ba, "holetln", null));}
RDebugUtils.currentLine=8847360;
 //BA.debugLineNum = 8847360;BA.debugLine="Private Sub holeTLN";
RDebugUtils.currentLine=8847361;
 //BA.debugLineNum = 8847361;BA.debugLine="DBdatenTyp = \"Teilnehmer\"";
__ref._dbdatentyp /*String*/  = "Teilnehmer";
RDebugUtils.currentLine=8847362;
 //BA.debugLineNum = 8847362;BA.debugLine="CurrentWebUrl = URLteilnehmer & \".json?auth=\" & S";
__ref._currentweburl /*String*/  = __ref._urlteilnehmer /*String*/ +".json?auth="+BA.ObjectToString(__ref._status /*anywheresoftware.b4a.objects.collections.Map*/ .GetDefault((Object)("idToken"),(Object)("")));
RDebugUtils.currentLine=8847363;
 //BA.debugLineNum = 8847363;BA.debugLine="ExecuteHttp(\"GET\", CurrentWebUrl, \"\")";
__ref._executehttp /*void*/ (null,"GET",__ref._currentweburl /*String*/ ,"");
RDebugUtils.currentLine=8847364;
 //BA.debugLineNum = 8847364;BA.debugLine="End Sub";
return "";
}
public String  _hidekeyboard(b4a.example.settings __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="settings";
if (Debug.shouldDelegate(ba, "hidekeyboard", false))
	 {return ((String) Debug.delegate(ba, "hidekeyboard", null));}
anywheresoftware.b4a.phone.Phone _p = null;
RDebugUtils.currentLine=10485760;
 //BA.debugLineNum = 10485760;BA.debugLine="Private Sub HideKeyboard";
RDebugUtils.currentLine=10485761;
 //BA.debugLineNum = 10485761;BA.debugLine="Dim p As Phone";
_p = new anywheresoftware.b4a.phone.Phone();
RDebugUtils.currentLine=10485762;
 //BA.debugLineNum = 10485762;BA.debugLine="p.HideKeyboard(B4XPages.GetNativeParent(Me))";
_p.HideKeyboard(_b4xpages._getnativeparent /*anywheresoftware.b4a.objects.ActivityWrapper*/ (ba,this));
RDebugUtils.currentLine=10485763;
 //BA.debugLineNum = 10485763;BA.debugLine="End Sub";
return "";
}
public String  _zeigeteilnehmerclv(b4a.example.settings __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="settings";
if (Debug.shouldDelegate(ba, "zeigeteilnehmerclv", false))
	 {return ((String) Debug.delegate(ba, "zeigeteilnehmerclv", null));}
int _i = 0;
RDebugUtils.currentLine=10878976;
 //BA.debugLineNum = 10878976;BA.debugLine="Private Sub ZeigeTeilnehmerCLV";
RDebugUtils.currentLine=10878978;
 //BA.debugLineNum = 10878978;BA.debugLine="lstTeilnehmer.Clear";
__ref._lstteilnehmer /*b4a.example3.customlistview*/ ._clear();
RDebugUtils.currentLine=10878980;
 //BA.debugLineNum = 10878980;BA.debugLine="For I = 0 To Teilnehmer.Size - 1 Step 2";
{
final int step2 = 2;
final int limit2 = (int) (__ref._teilnehmer /*anywheresoftware.b4a.objects.collections.List*/ .getSize()-1);
_i = (int) (0) ;
for (;_i <= limit2 ;_i = _i + step2 ) {
RDebugUtils.currentLine=10878981;
 //BA.debugLineNum = 10878981;BA.debugLine="If I + 1 < Teilnehmer.Size Then";
if (_i+1<__ref._teilnehmer /*anywheresoftware.b4a.objects.collections.List*/ .getSize()) { 
 };
 }
};
RDebugUtils.currentLine=10878986;
 //BA.debugLineNum = 10878986;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=8323072;
 //BA.debugLineNum = 8323072;BA.debugLine="Private Sub ladeVeranstaltungen";
RDebugUtils.currentLine=8323073;
 //BA.debugLineNum = 8323073;BA.debugLine="dprDatum.Enabled = True";
__ref._dprdatum /*anywheresoftware.b4a.objects.ButtonWrapper*/ .setEnabled(__c.True);
RDebugUtils.currentLine=8323074;
 //BA.debugLineNum = 8323074;BA.debugLine="dprDatum.TextColor = colorgreen";
__ref._dprdatum /*anywheresoftware.b4a.objects.ButtonWrapper*/ .setTextColor(__ref._colorgreen /*int*/ );
RDebugUtils.currentLine=8323075;
 //BA.debugLineNum = 8323075;BA.debugLine="dprDatum.Text = FormatDateCustom(DateTime.Now, \"d";
__ref._dprdatum /*anywheresoftware.b4a.objects.ButtonWrapper*/ .setText(BA.ObjectToCharSequence(__ref._formatdatecustom /*String*/ (null,__c.DateTime.getNow(),"dd.MM.yyyy")));
RDebugUtils.currentLine=8323076;
 //BA.debugLineNum = 8323076;BA.debugLine="dprYear = DateTime.GetYear(DateTime.Now)";
__ref._dpryear /*int*/  = __c.DateTime.GetYear(__c.DateTime.getNow());
RDebugUtils.currentLine=8323077;
 //BA.debugLineNum = 8323077;BA.debugLine="dprMonth = DateTime.GetMonth(DateTime.Now)";
__ref._dprmonth /*int*/  = __c.DateTime.GetMonth(__c.DateTime.getNow());
RDebugUtils.currentLine=8323078;
 //BA.debugLineNum = 8323078;BA.debugLine="dprDay = DateTime.GetDayOfMonth(DateTime.Now)";
__ref._dprday /*int*/  = __c.DateTime.GetDayOfMonth(__c.DateTime.getNow());
RDebugUtils.currentLine=8323080;
 //BA.debugLineNum = 8323080;BA.debugLine="webviewVSTGN.Initialize";
__ref._webviewvstgn /*anywheresoftware.b4a.objects.collections.List*/ .Initialize();
RDebugUtils.currentLine=8323081;
 //BA.debugLineNum = 8323081;BA.debugLine="webviewVSTGN.AddAll(Array As Object(\"Datum\", \"Nam";
__ref._webviewvstgn /*anywheresoftware.b4a.objects.collections.List*/ .AddAll(anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)("Datum"),(Object)("Name"),(Object)("vid")}));
RDebugUtils.currentLine=8323083;
 //BA.debugLineNum = 8323083;BA.debugLine="If Not(Veranstaltungen.IsInitialized) Or Veransta";
if (__c.Not(__ref._veranstaltungen /*anywheresoftware.b4a.objects.collections.Map*/ .IsInitialized()) || __ref._veranstaltungen /*anywheresoftware.b4a.objects.collections.Map*/ .getSize()==0) { 
RDebugUtils.currentLine=8323084;
 //BA.debugLineNum = 8323084;BA.debugLine="Veranstaltung_ID = \"v0\"";
__ref._veranstaltung_id /*String*/  = "v0";
RDebugUtils.currentLine=8323085;
 //BA.debugLineNum = 8323085;BA.debugLine="webviewVSTGN_ID = \"v0\"";
__ref._webviewvstgn_id /*String*/  = "v0";
RDebugUtils.currentLine=8323086;
 //BA.debugLineNum = 8323086;BA.debugLine="VSTGNnewID = \"v1\"";
__ref._vstgnnewid /*String*/  = "v1";
RDebugUtils.currentLine=8323087;
 //BA.debugLineNum = 8323087;BA.debugLine="webviewVSTGN.AddAll(Array As Object(\"Veranstaltu";
__ref._webviewvstgn /*anywheresoftware.b4a.objects.collections.List*/ .AddAll(anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)("Veranstaltungs_ID"),(Object)("v0")}));
RDebugUtils.currentLine=8323088;
 //BA.debugLineNum = 8323088;BA.debugLine="setzeVeranstaltung(\"v0\")";
__ref._setzeveranstaltung /*String*/ (null,"v0");
 }else {
RDebugUtils.currentLine=8323090;
 //BA.debugLineNum = 8323090;BA.debugLine="For Each key As String In Veranstaltungen.Keys";
{
final anywheresoftware.b4a.BA.IterableList group16 = __ref._veranstaltungen /*anywheresoftware.b4a.objects.collections.Map*/ .Keys();
final int groupLen16 = group16.getSize()
;int index16 = 0;
;
for (; index16 < groupLen16;index16++){
_key = BA.ObjectToString(group16.Get(index16));
RDebugUtils.currentLine=8323091;
 //BA.debugLineNum = 8323091;BA.debugLine="Dim newID As Int = key.Replace(\"v\", \"\") + 1";
_newid = (int) ((double)(Double.parseDouble(_key.replace("v","")))+1);
RDebugUtils.currentLine=8323092;
 //BA.debugLineNum = 8323092;BA.debugLine="Dim curMax As Int = VSTGNnewID.Replace(\"v\", \"\")";
_curmax = (int)(Double.parseDouble(__ref._vstgnnewid /*String*/ .replace("v","")));
RDebugUtils.currentLine=8323093;
 //BA.debugLineNum = 8323093;BA.debugLine="If newID > curMax Then";
if (_newid>_curmax) { 
RDebugUtils.currentLine=8323094;
 //BA.debugLineNum = 8323094;BA.debugLine="VSTGNnewID = \"v\" & newID";
__ref._vstgnnewid /*String*/  = "v"+BA.NumberToString(_newid);
 };
RDebugUtils.currentLine=8323096;
 //BA.debugLineNum = 8323096;BA.debugLine="Dim ergebnis As Map = Veranstaltungen.Get(key)";
_ergebnis = new anywheresoftware.b4a.objects.collections.Map();
_ergebnis = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(__ref._veranstaltungen /*anywheresoftware.b4a.objects.collections.Map*/ .Get((Object)(_key))));
RDebugUtils.currentLine=8323097;
 //BA.debugLineNum = 8323097;BA.debugLine="webviewVSTGN.AddAll(Array As Object( _ 				erge";
__ref._webviewvstgn /*anywheresoftware.b4a.objects.collections.List*/ .AddAll(anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{_ergebnis.GetDefault((Object)("Datum"),(Object)(__ref._formatdatecustom /*String*/ (null,__c.DateTime.getNow(),"dd.MM.yyyy"))),_ergebnis.GetDefault((Object)("Name"),(Object)("- n.n. -")),(Object)(_key)}));
 }
};
RDebugUtils.currentLine=8323102;
 //BA.debugLineNum = 8323102;BA.debugLine="webviewVSTGN.AddAll(Array As Object(\"Veranstaltu";
__ref._webviewvstgn /*anywheresoftware.b4a.objects.collections.List*/ .AddAll(anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)("Veranstaltungs_ID"),(Object)(__ref._webviewvstgn_id /*String*/ )}));
 };
RDebugUtils.currentLine=8323104;
 //BA.debugLineNum = 8323104;BA.debugLine="End Sub";
return "";
}
public String  _lstveranstaltungen_itemclick(b4a.example.settings __ref,int _position,Object _value) throws Exception{
__ref = this;
RDebugUtils.currentModule="settings";
if (Debug.shouldDelegate(ba, "lstveranstaltungen_itemclick", false))
	 {return ((String) Debug.delegate(ba, "lstveranstaltungen_itemclick", new Object[] {_position,_value}));}
RDebugUtils.currentLine=11010048;
 //BA.debugLineNum = 11010048;BA.debugLine="Private Sub lstVeranstaltungen_ItemClick (Position";
RDebugUtils.currentLine=11010050;
 //BA.debugLineNum = 11010050;BA.debugLine="webviewVSTGN_ID = Value";
__ref._webviewvstgn_id /*String*/  = BA.ObjectToString(_value);
RDebugUtils.currentLine=11010052;
 //BA.debugLineNum = 11010052;BA.debugLine="setzeVeranstaltung(webviewVSTGN_ID)";
__ref._setzeveranstaltung /*String*/ (null,__ref._webviewvstgn_id /*String*/ );
RDebugUtils.currentLine=11010054;
 //BA.debugLineNum = 11010054;BA.debugLine="End Sub";
return "";
}
public String  _lstviewteilnehmer_markierezeile(b4a.example.settings __ref,int _zeile) throws Exception{
__ref = this;
RDebugUtils.currentModule="settings";
if (Debug.shouldDelegate(ba, "lstviewteilnehmer_markierezeile", false))
	 {return ((String) Debug.delegate(ba, "lstviewteilnehmer_markierezeile", new Object[] {_zeile}));}
int _index = 0;
anywheresoftware.b4a.objects.B4XViewWrapper _pnlrow = null;
anywheresoftware.b4a.objects.B4XViewWrapper _pnlbasis = null;
anywheresoftware.b4a.objects.B4XViewWrapper _lbld = null;
RDebugUtils.currentLine=53084160;
 //BA.debugLineNum = 53084160;BA.debugLine="Private Sub lstViewTeilnehmer_markiereZeile(Zeile";
RDebugUtils.currentLine=53084161;
 //BA.debugLineNum = 53084161;BA.debugLine="Dim Index As Int = Zeile - 1";
_index = (int) (_zeile-1);
RDebugUtils.currentLine=53084162;
 //BA.debugLineNum = 53084162;BA.debugLine="If Index < 0 Or Index >= lstTeilnehmer.Size Then";
if (_index<0 || _index>=__ref._lstteilnehmer /*b4a.example3.customlistview*/ ._getsize()) { 
if (true) return "";};
RDebugUtils.currentLine=53084165;
 //BA.debugLineNum = 53084165;BA.debugLine="Dim pnlRow As B4XView = lstTeilnehmer.GetPanel(In";
_pnlrow = new anywheresoftware.b4a.objects.B4XViewWrapper();
_pnlrow = __ref._lstteilnehmer /*b4a.example3.customlistview*/ ._getpanel(_index);
RDebugUtils.currentLine=53084168;
 //BA.debugLineNum = 53084168;BA.debugLine="Dim pnlBasis As B4XView = pnlRow.GetView(0)";
_pnlbasis = new anywheresoftware.b4a.objects.B4XViewWrapper();
_pnlbasis = _pnlrow.GetView((int) (0));
RDebugUtils.currentLine=53084171;
 //BA.debugLineNum = 53084171;BA.debugLine="Dim lblD As B4XView = pnlBasis.GetView(0)";
_lbld = new anywheresoftware.b4a.objects.B4XViewWrapper();
_lbld = _pnlbasis.GetView((int) (0));
RDebugUtils.currentLine=53084172;
 //BA.debugLineNum = 53084172;BA.debugLine="lblD.Color = 0xffffcc99";
_lbld.setColor(((int)0xffffcc99));
RDebugUtils.currentLine=53084174;
 //BA.debugLineNum = 53084174;BA.debugLine="End Sub";
return "";
}
public String  _lstviewveranstaltung_markierezeile(b4a.example.settings __ref,int _zeile) throws Exception{
__ref = this;
RDebugUtils.currentModule="settings";
if (Debug.shouldDelegate(ba, "lstviewveranstaltung_markierezeile", false))
	 {return ((String) Debug.delegate(ba, "lstviewveranstaltung_markierezeile", new Object[] {_zeile}));}
int _index = 0;
anywheresoftware.b4a.objects.B4XViewWrapper _pnlrow = null;
anywheresoftware.b4a.objects.B4XViewWrapper _pnlbasis = null;
anywheresoftware.b4a.objects.B4XViewWrapper _lbld = null;
anywheresoftware.b4a.objects.B4XViewWrapper _lblv = null;
RDebugUtils.currentLine=50921472;
 //BA.debugLineNum = 50921472;BA.debugLine="Private Sub lstViewVeranstaltung_markiereZeile(Zei";
RDebugUtils.currentLine=50921473;
 //BA.debugLineNum = 50921473;BA.debugLine="Dim Index As Int = Zeile - 1";
_index = (int) (_zeile-1);
RDebugUtils.currentLine=50921474;
 //BA.debugLineNum = 50921474;BA.debugLine="If Index < 0 Or Index >= lstVeranstaltungen.Size";
if (_index<0 || _index>=__ref._lstveranstaltungen /*b4a.example3.customlistview*/ ._getsize()) { 
if (true) return "";};
RDebugUtils.currentLine=50921477;
 //BA.debugLineNum = 50921477;BA.debugLine="Dim pnlRow As B4XView = lstVeranstaltungen.GetPan";
_pnlrow = new anywheresoftware.b4a.objects.B4XViewWrapper();
_pnlrow = __ref._lstveranstaltungen /*b4a.example3.customlistview*/ ._getpanel(_index);
RDebugUtils.currentLine=50921480;
 //BA.debugLineNum = 50921480;BA.debugLine="Dim pnlBasis As B4XView = pnlRow.GetView(0)";
_pnlbasis = new anywheresoftware.b4a.objects.B4XViewWrapper();
_pnlbasis = _pnlrow.GetView((int) (0));
RDebugUtils.currentLine=50921483;
 //BA.debugLineNum = 50921483;BA.debugLine="Dim lblD As B4XView = pnlBasis.GetView(0)";
_lbld = new anywheresoftware.b4a.objects.B4XViewWrapper();
_lbld = _pnlbasis.GetView((int) (0));
RDebugUtils.currentLine=50921484;
 //BA.debugLineNum = 50921484;BA.debugLine="lblD.Color = 0xffffcc99";
_lbld.setColor(((int)0xffffcc99));
RDebugUtils.currentLine=50921486;
 //BA.debugLineNum = 50921486;BA.debugLine="Dim lblV As B4XView = pnlBasis.GetView(1)";
_lblv = new anywheresoftware.b4a.objects.B4XViewWrapper();
_lblv = _pnlbasis.GetView((int) (1));
RDebugUtils.currentLine=50921487;
 //BA.debugLineNum = 50921487;BA.debugLine="lblV.Color = 0xffffcc99";
_lblv.setColor(((int)0xffffcc99));
RDebugUtils.currentLine=50921488;
 //BA.debugLineNum = 50921488;BA.debugLine="End Sub";
return "";
}
public String  _pruefeinhalt(b4a.example.settings __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="settings";
if (Debug.shouldDelegate(ba, "pruefeinhalt", false))
	 {return ((String) Debug.delegate(ba, "pruefeinhalt", null));}
int _anz = 0;
RDebugUtils.currentLine=8781824;
 //BA.debugLineNum = 8781824;BA.debugLine="Private Sub pruefeInhalt";
RDebugUtils.currentLine=8781825;
 //BA.debugLineNum = 8781825;BA.debugLine="btnVerstgSpeichern.Enabled = False";
__ref._btnverstgspeichern /*anywheresoftware.b4a.objects.ButtonWrapper*/ .setEnabled(__c.False);
RDebugUtils.currentLine=8781826;
 //BA.debugLineNum = 8781826;BA.debugLine="btnVerstgSpeichern.TextColor = 0xFF888888";
__ref._btnverstgspeichern /*anywheresoftware.b4a.objects.ButtonWrapper*/ .setTextColor(((int)0xff888888));
RDebugUtils.currentLine=8781827;
 //BA.debugLineNum = 8781827;BA.debugLine="btnAuswahl.Enabled = False";
__ref._btnauswahl /*anywheresoftware.b4a.objects.ButtonWrapper*/ .setEnabled(__c.False);
RDebugUtils.currentLine=8781828;
 //BA.debugLineNum = 8781828;BA.debugLine="btnAuswahl.TextColor = 0xFF888888";
__ref._btnauswahl /*anywheresoftware.b4a.objects.ButtonWrapper*/ .setTextColor(((int)0xff888888));
RDebugUtils.currentLine=8781830;
 //BA.debugLineNum = 8781830;BA.debugLine="If tbxVeranstaltung.Text.Trim <> \"\" Then";
if ((__ref._tbxveranstaltung /*anywheresoftware.b4a.objects.EditTextWrapper*/ .getText().trim()).equals("") == false) { 
RDebugUtils.currentLine=8781831;
 //BA.debugLineNum = 8781831;BA.debugLine="If IsNumber(tbxAnzahl.Text) Then";
if (__c.IsNumber(__ref._tbxanzahl /*anywheresoftware.b4a.objects.EditTextWrapper*/ .getText())) { 
RDebugUtils.currentLine=8781832;
 //BA.debugLineNum = 8781832;BA.debugLine="Dim anz As Int = tbxAnzahl.Text";
_anz = (int)(Double.parseDouble(__ref._tbxanzahl /*anywheresoftware.b4a.objects.EditTextWrapper*/ .getText()));
RDebugUtils.currentLine=8781833;
 //BA.debugLineNum = 8781833;BA.debugLine="If anz > 0 Then";
if (_anz>0) { 
RDebugUtils.currentLine=8781834;
 //BA.debugLineNum = 8781834;BA.debugLine="btnVerstgSpeichern.Enabled = True";
__ref._btnverstgspeichern /*anywheresoftware.b4a.objects.ButtonWrapper*/ .setEnabled(__c.True);
RDebugUtils.currentLine=8781835;
 //BA.debugLineNum = 8781835;BA.debugLine="btnVerstgSpeichern.TextColor = colorgreen";
__ref._btnverstgspeichern /*anywheresoftware.b4a.objects.ButtonWrapper*/ .setTextColor(__ref._colorgreen /*int*/ );
 };
 };
 };
RDebugUtils.currentLine=8781839;
 //BA.debugLineNum = 8781839;BA.debugLine="End Sub";
return "";
}
public String  _savedbvstng(b4a.example.settings __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="settings";
if (Debug.shouldDelegate(ba, "savedbvstng", false))
	 {return ((String) Debug.delegate(ba, "savedbvstng", null));}
RDebugUtils.currentLine=8585216;
 //BA.debugLineNum = 8585216;BA.debugLine="Private Sub saveDBvstng";
RDebugUtils.currentLine=8585217;
 //BA.debugLineNum = 8585217;BA.debugLine="lblVeranstaltung.Text = tbxVeranstaltung.Text";
__ref._lblveranstaltung /*anywheresoftware.b4a.objects.LabelWrapper*/ .setText(BA.ObjectToCharSequence(__ref._tbxveranstaltung /*anywheresoftware.b4a.objects.EditTextWrapper*/ .getText()));
RDebugUtils.currentLine=8585218;
 //BA.debugLineNum = 8585218;BA.debugLine="lblDatum.Text = dprDatum.Text";
__ref._lbldatum /*anywheresoftware.b4a.objects.LabelWrapper*/ .setText(BA.ObjectToCharSequence(__ref._dprdatum /*anywheresoftware.b4a.objects.ButtonWrapper*/ .getText()));
RDebugUtils.currentLine=8585219;
 //BA.debugLineNum = 8585219;BA.debugLine="DBPut(\"VeranstaltungID\", Veranstaltung_ID)";
__ref._dbput /*String*/ (null,"VeranstaltungID",(Object)(__ref._veranstaltung_id /*String*/ ));
RDebugUtils.currentLine=8585220;
 //BA.debugLineNum = 8585220;BA.debugLine="DBPut(\"VeranstaltungName\", tbxVeranstaltung.Text)";
__ref._dbput /*String*/ (null,"VeranstaltungName",(Object)(__ref._tbxveranstaltung /*anywheresoftware.b4a.objects.EditTextWrapper*/ .getText()));
RDebugUtils.currentLine=8585221;
 //BA.debugLineNum = 8585221;BA.debugLine="DBPut(\"VeranstaltungDatum\", dprDatum.Text)";
__ref._dbput /*String*/ (null,"VeranstaltungDatum",(Object)(__ref._dprdatum /*anywheresoftware.b4a.objects.ButtonWrapper*/ .getText()));
RDebugUtils.currentLine=8585222;
 //BA.debugLineNum = 8585222;BA.debugLine="DBPut(\"VeranstaltungAnzahl\", tbxAnzahl.Text)";
__ref._dbput /*String*/ (null,"VeranstaltungAnzahl",(Object)(__ref._tbxanzahl /*anywheresoftware.b4a.objects.EditTextWrapper*/ .getText()));
RDebugUtils.currentLine=8585223;
 //BA.debugLineNum = 8585223;BA.debugLine="End Sub";
return "";
}
public String  _tbxanzahl_focuschanged(b4a.example.settings __ref,boolean _hasfocus) throws Exception{
__ref = this;
RDebugUtils.currentModule="settings";
if (Debug.shouldDelegate(ba, "tbxanzahl_focuschanged", false))
	 {return ((String) Debug.delegate(ba, "tbxanzahl_focuschanged", new Object[] {_hasfocus}));}
RDebugUtils.currentLine=10027008;
 //BA.debugLineNum = 10027008;BA.debugLine="Private Sub tbxAnzahl_FocusChanged (HasFocus As Bo";
RDebugUtils.currentLine=10027009;
 //BA.debugLineNum = 10027009;BA.debugLine="If HasFocus Then";
if (_hasfocus) { 
RDebugUtils.currentLine=10027010;
 //BA.debugLineNum = 10027010;BA.debugLine="tbxAnzahl.SelectionStart = tbxAnzahl.Text.Length";
__ref._tbxanzahl /*anywheresoftware.b4a.objects.EditTextWrapper*/ .setSelectionStart(__ref._tbxanzahl /*anywheresoftware.b4a.objects.EditTextWrapper*/ .getText().length());
 }else {
RDebugUtils.currentLine=10027012;
 //BA.debugLineNum = 10027012;BA.debugLine="HideKeyboard";
__ref._hidekeyboard /*String*/ (null);
 };
RDebugUtils.currentLine=10027014;
 //BA.debugLineNum = 10027014;BA.debugLine="End Sub";
return "";
}
public String  _tbxanzahl_textchanged(b4a.example.settings __ref,String _old,String _new) throws Exception{
__ref = this;
RDebugUtils.currentModule="settings";
if (Debug.shouldDelegate(ba, "tbxanzahl_textchanged", false))
	 {return ((String) Debug.delegate(ba, "tbxanzahl_textchanged", new Object[] {_old,_new}));}
int _val = 0;
RDebugUtils.currentLine=10092544;
 //BA.debugLineNum = 10092544;BA.debugLine="Private Sub tbxAnzahl_TextChanged (Old As String,";
RDebugUtils.currentLine=10092545;
 //BA.debugLineNum = 10092545;BA.debugLine="Log(\"tbxAnzahl_TextChanged\")";
__c.LogImpl("410092545","tbxAnzahl_TextChanged",0);
RDebugUtils.currentLine=10092546;
 //BA.debugLineNum = 10092546;BA.debugLine="Log(\"dochange = \" & dochange)";
__c.LogImpl("410092546","dochange = "+BA.ObjectToString(__ref._dochange /*boolean*/ ),0);
RDebugUtils.currentLine=10092547;
 //BA.debugLineNum = 10092547;BA.debugLine="If dochange = False Then Return";
if (__ref._dochange /*boolean*/ ==__c.False) { 
if (true) return "";};
RDebugUtils.currentLine=10092549;
 //BA.debugLineNum = 10092549;BA.debugLine="dochange = False";
__ref._dochange /*boolean*/  = __c.False;
RDebugUtils.currentLine=10092550;
 //BA.debugLineNum = 10092550;BA.debugLine="If tbxAnzahl.Enabled Then";
if (__ref._tbxanzahl /*anywheresoftware.b4a.objects.EditTextWrapper*/ .getEnabled()) { 
RDebugUtils.currentLine=10092551;
 //BA.debugLineNum = 10092551;BA.debugLine="If IsNumber(tbxAnzahl.Text) Then";
if (__c.IsNumber(__ref._tbxanzahl /*anywheresoftware.b4a.objects.EditTextWrapper*/ .getText())) { 
RDebugUtils.currentLine=10092552;
 //BA.debugLineNum = 10092552;BA.debugLine="Dim val As Int = Abs(tbxAnzahl.Text)";
_val = (int) (__c.Abs((double)(Double.parseDouble(__ref._tbxanzahl /*anywheresoftware.b4a.objects.EditTextWrapper*/ .getText()))));
RDebugUtils.currentLine=10092553;
 //BA.debugLineNum = 10092553;BA.debugLine="tbxAnzahl.Text = val";
__ref._tbxanzahl /*anywheresoftware.b4a.objects.EditTextWrapper*/ .setText(BA.ObjectToCharSequence(_val));
 };
RDebugUtils.currentLine=10092555;
 //BA.debugLineNum = 10092555;BA.debugLine="pruefeInhalt";
__ref._pruefeinhalt /*String*/ (null);
RDebugUtils.currentLine=10092556;
 //BA.debugLineNum = 10092556;BA.debugLine="tbxAnzahl.SelectionStart = tbxAnzahl.Text.Length";
__ref._tbxanzahl /*anywheresoftware.b4a.objects.EditTextWrapper*/ .setSelectionStart(__ref._tbxanzahl /*anywheresoftware.b4a.objects.EditTextWrapper*/ .getText().length());
 };
RDebugUtils.currentLine=10092558;
 //BA.debugLineNum = 10092558;BA.debugLine="dochange = True";
__ref._dochange /*boolean*/  = __c.True;
RDebugUtils.currentLine=10092559;
 //BA.debugLineNum = 10092559;BA.debugLine="startTimer";
__ref._starttimer /*String*/ (null);
RDebugUtils.currentLine=10092560;
 //BA.debugLineNum = 10092560;BA.debugLine="End Sub";
return "";
}
public String  _tbxteilnehmer_focuschanged(b4a.example.settings __ref,boolean _hasfocus) throws Exception{
__ref = this;
RDebugUtils.currentModule="settings";
if (Debug.shouldDelegate(ba, "tbxteilnehmer_focuschanged", false))
	 {return ((String) Debug.delegate(ba, "tbxteilnehmer_focuschanged", new Object[] {_hasfocus}));}
RDebugUtils.currentLine=10158080;
 //BA.debugLineNum = 10158080;BA.debugLine="Private Sub tbxTeilnehmer_FocusChanged (HasFocus A";
RDebugUtils.currentLine=10158081;
 //BA.debugLineNum = 10158081;BA.debugLine="If HasFocus Then";
if (_hasfocus) { 
RDebugUtils.currentLine=10158082;
 //BA.debugLineNum = 10158082;BA.debugLine="tbxTeilnehmer.SelectionStart = tbxTeilnehmer.Tex";
__ref._tbxteilnehmer /*anywheresoftware.b4a.objects.EditTextWrapper*/ .setSelectionStart(__ref._tbxteilnehmer /*anywheresoftware.b4a.objects.EditTextWrapper*/ .getText().length());
 }else {
RDebugUtils.currentLine=10158084;
 //BA.debugLineNum = 10158084;BA.debugLine="HideKeyboard";
__ref._hidekeyboard /*String*/ (null);
 };
RDebugUtils.currentLine=10158086;
 //BA.debugLineNum = 10158086;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=10223616;
 //BA.debugLineNum = 10223616;BA.debugLine="Private Sub tbxTeilnehmer_TextChanged (Old As Stri";
RDebugUtils.currentLine=10223617;
 //BA.debugLineNum = 10223617;BA.debugLine="Log(\"tbxTeilnehmer_TextChanged\")";
__c.LogImpl("410223617","tbxTeilnehmer_TextChanged",0);
RDebugUtils.currentLine=10223618;
 //BA.debugLineNum = 10223618;BA.debugLine="Log(\"dochange = \" & dochange)";
__c.LogImpl("410223618","dochange = "+BA.ObjectToString(__ref._dochange /*boolean*/ ),0);
RDebugUtils.currentLine=10223619;
 //BA.debugLineNum = 10223619;BA.debugLine="If dochange = False Then Return";
if (__ref._dochange /*boolean*/ ==__c.False) { 
if (true) return "";};
RDebugUtils.currentLine=10223621;
 //BA.debugLineNum = 10223621;BA.debugLine="dochange = False";
__ref._dochange /*boolean*/  = __c.False;
RDebugUtils.currentLine=10223622;
 //BA.debugLineNum = 10223622;BA.debugLine="Dim cleaned As String = Regex.Replace(\"[^a-zA-Z0-";
_cleaned = __c.Regex.Replace("[^a-zA-Z0-9äöüÄÖÜßéèêëáàâçñ -]",__ref._tbxteilnehmer /*anywheresoftware.b4a.objects.EditTextWrapper*/ .getText(),"");
RDebugUtils.currentLine=10223624;
 //BA.debugLineNum = 10223624;BA.debugLine="Dim sb As StringBuilder";
_sb = new anywheresoftware.b4a.keywords.StringBuilderWrapper();
RDebugUtils.currentLine=10223625;
 //BA.debugLineNum = 10223625;BA.debugLine="sb.Initialize";
_sb.Initialize();
RDebugUtils.currentLine=10223626;
 //BA.debugLineNum = 10223626;BA.debugLine="Dim doupper As Boolean = True";
_doupper = __c.True;
RDebugUtils.currentLine=10223627;
 //BA.debugLineNum = 10223627;BA.debugLine="For i = 0 To cleaned.Length - 1";
{
final int step9 = 1;
final int limit9 = (int) (_cleaned.length()-1);
_i = (int) (0) ;
for (;_i <= limit9 ;_i = _i + step9 ) {
RDebugUtils.currentLine=10223628;
 //BA.debugLineNum = 10223628;BA.debugLine="Dim letter As String = cleaned.SubString2(i, i +";
_letter = _cleaned.substring(_i,(int) (_i+1));
RDebugUtils.currentLine=10223629;
 //BA.debugLineNum = 10223629;BA.debugLine="If letter = \" \" Or letter = \"-\" Then";
if ((_letter).equals(" ") || (_letter).equals("-")) { 
RDebugUtils.currentLine=10223630;
 //BA.debugLineNum = 10223630;BA.debugLine="doupper = True";
_doupper = __c.True;
RDebugUtils.currentLine=10223631;
 //BA.debugLineNum = 10223631;BA.debugLine="sb.Append(letter)";
_sb.Append(_letter);
 }else 
{RDebugUtils.currentLine=10223632;
 //BA.debugLineNum = 10223632;BA.debugLine="Else if letter = \",\" Then";
if ((_letter).equals(",")) { 
 }else 
{RDebugUtils.currentLine=10223634;
 //BA.debugLineNum = 10223634;BA.debugLine="Else if doupper Then";
if (_doupper) { 
RDebugUtils.currentLine=10223635;
 //BA.debugLineNum = 10223635;BA.debugLine="sb.Append(letter.ToUpperCase)";
_sb.Append(_letter.toUpperCase(anywheresoftware.b4a.keywords.Common.stringLocale));
RDebugUtils.currentLine=10223636;
 //BA.debugLineNum = 10223636;BA.debugLine="doupper = False";
_doupper = __c.False;
 }else {
RDebugUtils.currentLine=10223638;
 //BA.debugLineNum = 10223638;BA.debugLine="sb.Append(letter)";
_sb.Append(_letter);
 }}}
;
 }
};
RDebugUtils.currentLine=10223641;
 //BA.debugLineNum = 10223641;BA.debugLine="tbxTeilnehmer.Text = sb.ToString";
__ref._tbxteilnehmer /*anywheresoftware.b4a.objects.EditTextWrapper*/ .setText(BA.ObjectToCharSequence(_sb.ToString()));
RDebugUtils.currentLine=10223643;
 //BA.debugLineNum = 10223643;BA.debugLine="btnTLNDelete.TextColor = 0xFF888888";
__ref._btntlndelete /*anywheresoftware.b4a.objects.ButtonWrapper*/ .setTextColor(((int)0xff888888));
RDebugUtils.currentLine=10223644;
 //BA.debugLineNum = 10223644;BA.debugLine="btnTLNDelete.Enabled = False";
__ref._btntlndelete /*anywheresoftware.b4a.objects.ButtonWrapper*/ .setEnabled(__c.False);
RDebugUtils.currentLine=10223646;
 //BA.debugLineNum = 10223646;BA.debugLine="If tbxTeilnehmer.Text.Length >= 3 Then";
if (__ref._tbxteilnehmer /*anywheresoftware.b4a.objects.EditTextWrapper*/ .getText().length()>=3) { 
RDebugUtils.currentLine=10223647;
 //BA.debugLineNum = 10223647;BA.debugLine="btnTLNSpeichern.TextColor = colorgreen";
__ref._btntlnspeichern /*anywheresoftware.b4a.objects.ButtonWrapper*/ .setTextColor(__ref._colorgreen /*int*/ );
RDebugUtils.currentLine=10223648;
 //BA.debugLineNum = 10223648;BA.debugLine="btnTLNSpeichern.Enabled = True";
__ref._btntlnspeichern /*anywheresoftware.b4a.objects.ButtonWrapper*/ .setEnabled(__c.True);
 }else {
RDebugUtils.currentLine=10223650;
 //BA.debugLineNum = 10223650;BA.debugLine="btnTLNSpeichern.TextColor = 0xFF888888";
__ref._btntlnspeichern /*anywheresoftware.b4a.objects.ButtonWrapper*/ .setTextColor(((int)0xff888888));
RDebugUtils.currentLine=10223651;
 //BA.debugLineNum = 10223651;BA.debugLine="btnTLNSpeichern.Enabled = False";
__ref._btntlnspeichern /*anywheresoftware.b4a.objects.ButtonWrapper*/ .setEnabled(__c.False);
 };
RDebugUtils.currentLine=10223654;
 //BA.debugLineNum = 10223654;BA.debugLine="dochange = True";
__ref._dochange /*boolean*/  = __c.True;
RDebugUtils.currentLine=10223655;
 //BA.debugLineNum = 10223655;BA.debugLine="tbxTeilnehmer.SelectionStart = tbxTeilnehmer.Text";
__ref._tbxteilnehmer /*anywheresoftware.b4a.objects.EditTextWrapper*/ .setSelectionStart(__ref._tbxteilnehmer /*anywheresoftware.b4a.objects.EditTextWrapper*/ .getText().length());
RDebugUtils.currentLine=10223656;
 //BA.debugLineNum = 10223656;BA.debugLine="startTimer";
__ref._starttimer /*String*/ (null);
RDebugUtils.currentLine=10223657;
 //BA.debugLineNum = 10223657;BA.debugLine="End Sub";
return "";
}
public String  _tbxveranstaltung_focuschanged(b4a.example.settings __ref,boolean _hasfocus) throws Exception{
__ref = this;
RDebugUtils.currentModule="settings";
if (Debug.shouldDelegate(ba, "tbxveranstaltung_focuschanged", false))
	 {return ((String) Debug.delegate(ba, "tbxveranstaltung_focuschanged", new Object[] {_hasfocus}));}
RDebugUtils.currentLine=9895936;
 //BA.debugLineNum = 9895936;BA.debugLine="Private Sub tbxVeranstaltung_FocusChanged (HasFocu";
RDebugUtils.currentLine=9895937;
 //BA.debugLineNum = 9895937;BA.debugLine="If HasFocus Then";
if (_hasfocus) { 
RDebugUtils.currentLine=9895938;
 //BA.debugLineNum = 9895938;BA.debugLine="tbxVeranstaltung.SelectionStart = tbxVeranstaltu";
__ref._tbxveranstaltung /*anywheresoftware.b4a.objects.EditTextWrapper*/ .setSelectionStart(__ref._tbxveranstaltung /*anywheresoftware.b4a.objects.EditTextWrapper*/ .getText().length());
 }else {
RDebugUtils.currentLine=9895940;
 //BA.debugLineNum = 9895940;BA.debugLine="HideKeyboard";
__ref._hidekeyboard /*String*/ (null);
 };
RDebugUtils.currentLine=9895942;
 //BA.debugLineNum = 9895942;BA.debugLine="End Sub";
return "";
}
public String  _tbxveranstaltung_textchanged(b4a.example.settings __ref,String _old,String _new) throws Exception{
__ref = this;
RDebugUtils.currentModule="settings";
if (Debug.shouldDelegate(ba, "tbxveranstaltung_textchanged", false))
	 {return ((String) Debug.delegate(ba, "tbxveranstaltung_textchanged", new Object[] {_old,_new}));}
RDebugUtils.currentLine=9961472;
 //BA.debugLineNum = 9961472;BA.debugLine="Private Sub tbxVeranstaltung_TextChanged (Old As S";
RDebugUtils.currentLine=9961473;
 //BA.debugLineNum = 9961473;BA.debugLine="Log(\"tbxVeranstaltung_TextChanged\")";
__c.LogImpl("49961473","tbxVeranstaltung_TextChanged",0);
RDebugUtils.currentLine=9961474;
 //BA.debugLineNum = 9961474;BA.debugLine="Log(\"dochange = \" & dochange)";
__c.LogImpl("49961474","dochange = "+BA.ObjectToString(__ref._dochange /*boolean*/ ),0);
RDebugUtils.currentLine=9961475;
 //BA.debugLineNum = 9961475;BA.debugLine="If dochange = False Then Return";
if (__ref._dochange /*boolean*/ ==__c.False) { 
if (true) return "";};
RDebugUtils.currentLine=9961477;
 //BA.debugLineNum = 9961477;BA.debugLine="dochange = False";
__ref._dochange /*boolean*/  = __c.False;
RDebugUtils.currentLine=9961478;
 //BA.debugLineNum = 9961478;BA.debugLine="If tbxVeranstaltung.Enabled Then";
if (__ref._tbxveranstaltung /*anywheresoftware.b4a.objects.EditTextWrapper*/ .getEnabled()) { 
RDebugUtils.currentLine=9961479;
 //BA.debugLineNum = 9961479;BA.debugLine="pruefeInhalt";
__ref._pruefeinhalt /*String*/ (null);
 };
RDebugUtils.currentLine=9961481;
 //BA.debugLineNum = 9961481;BA.debugLine="dochange = True";
__ref._dochange /*boolean*/  = __c.True;
RDebugUtils.currentLine=9961482;
 //BA.debugLineNum = 9961482;BA.debugLine="startTimer";
__ref._starttimer /*String*/ (null);
RDebugUtils.currentLine=9961483;
 //BA.debugLineNum = 9961483;BA.debugLine="End Sub";
return "";
}
public String  _uhrzeit_tick(b4a.example.settings __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="settings";
if (Debug.shouldDelegate(ba, "uhrzeit_tick", false))
	 {return ((String) Debug.delegate(ba, "uhrzeit_tick", null));}
RDebugUtils.currentLine=10354688;
 //BA.debugLineNum = 10354688;BA.debugLine="Private Sub Uhrzeit_Tick";
RDebugUtils.currentLine=10354689;
 //BA.debugLineNum = 10354689;BA.debugLine="Uhrzeit.Enabled = False";
__ref._uhrzeit /*anywheresoftware.b4a.objects.Timer*/ .setEnabled(__c.False);
RDebugUtils.currentLine=10354690;
 //BA.debugLineNum = 10354690;BA.debugLine="B4XPages.ShowPage(\"ScreenSaver\")";
_b4xpages._showpage /*String*/ (ba,"ScreenSaver");
RDebugUtils.currentLine=10354691;
 //BA.debugLineNum = 10354691;BA.debugLine="End Sub";
return "";
}
}