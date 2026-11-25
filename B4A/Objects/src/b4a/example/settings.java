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
public anywheresoftware.b4a.objects.ListViewWrapper _lstveranstaltungen = null;
public anywheresoftware.b4a.objects.ListViewWrapper _lstteilnehmer = null;
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
public String  _adddivider(b4a.example.settings __ref,anywheresoftware.b4a.objects.PanelWrapper _parent,int _toppos,int _h,int _col) throws Exception{
__ref = this;
RDebugUtils.currentModule="settings";
if (Debug.shouldDelegate(ba, "adddivider", false))
	 {return ((String) Debug.delegate(ba, "adddivider", new Object[] {_parent,_toppos,_h,_col}));}
anywheresoftware.b4a.objects.PanelWrapper _p = null;
RDebugUtils.currentLine=7929856;
 //BA.debugLineNum = 7929856;BA.debugLine="Private Sub AddDivider(parent As Panel, topPos As";
RDebugUtils.currentLine=7929857;
 //BA.debugLineNum = 7929857;BA.debugLine="Dim p As Panel";
_p = new anywheresoftware.b4a.objects.PanelWrapper();
RDebugUtils.currentLine=7929858;
 //BA.debugLineNum = 7929858;BA.debugLine="p.Initialize(\"\")";
_p.Initialize(ba,"");
RDebugUtils.currentLine=7929859;
 //BA.debugLineNum = 7929859;BA.debugLine="p.Color = col";
_p.setColor(_col);
RDebugUtils.currentLine=7929860;
 //BA.debugLineNum = 7929860;BA.debugLine="parent.AddView(p, 0, topPos, 100%x, h)";
_parent.AddView((android.view.View)(_p.getObject()),(int) (0),_toppos,__c.PerXToCurrent((float) (100),ba),_h);
RDebugUtils.currentLine=7929861;
 //BA.debugLineNum = 7929861;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=10747904;
 //BA.debugLineNum = 10747904;BA.debugLine="Private Sub LoadTinyDB";
RDebugUtils.currentLine=10747905;
 //BA.debugLineNum = 10747905;BA.debugLine="If File.Exists(File.DirInternal, DBFileName) Then";
if (__c.File.Exists(__c.File.getDirInternal(),__ref._dbfilename /*String*/ )) { 
RDebugUtils.currentLine=10747906;
 //BA.debugLineNum = 10747906;BA.debugLine="DBVerein = File.ReadMap(File.DirInternal, DBFile";
__ref._dbverein /*anywheresoftware.b4a.objects.collections.Map*/  = __c.File.ReadMap(__c.File.getDirInternal(),__ref._dbfilename /*String*/ );
 }else {
RDebugUtils.currentLine=10747908;
 //BA.debugLineNum = 10747908;BA.debugLine="DBVerein.Initialize";
__ref._dbverein /*anywheresoftware.b4a.objects.collections.Map*/ .Initialize();
 };
RDebugUtils.currentLine=10747910;
 //BA.debugLineNum = 10747910;BA.debugLine="End Sub";
return "";
}
public Object  _dbget(b4a.example.settings __ref,String _key,Object _defaultvalue) throws Exception{
__ref = this;
RDebugUtils.currentModule="settings";
if (Debug.shouldDelegate(ba, "dbget", false))
	 {return ((Object) Debug.delegate(ba, "dbget", new Object[] {_key,_defaultvalue}));}
String _val = "";
anywheresoftware.b4a.objects.collections.JSONParser _jp = null;
RDebugUtils.currentLine=10878976;
 //BA.debugLineNum = 10878976;BA.debugLine="Private Sub DBGet(Key As String, DefaultValue As O";
RDebugUtils.currentLine=10878977;
 //BA.debugLineNum = 10878977;BA.debugLine="If DBVerein.ContainsKey(Key) = False Then Return";
if (__ref._dbverein /*anywheresoftware.b4a.objects.collections.Map*/ .ContainsKey((Object)(_key))==__c.False) { 
if (true) return _defaultvalue;};
RDebugUtils.currentLine=10878978;
 //BA.debugLineNum = 10878978;BA.debugLine="Dim val As String = DBVerein.Get(Key)";
_val = BA.ObjectToString(__ref._dbverein /*anywheresoftware.b4a.objects.collections.Map*/ .Get((Object)(_key)));
RDebugUtils.currentLine=10878979;
 //BA.debugLineNum = 10878979;BA.debugLine="If val.StartsWith(\"JSON_MAP:\") Then";
if (_val.startsWith("JSON_MAP:")) { 
RDebugUtils.currentLine=10878980;
 //BA.debugLineNum = 10878980;BA.debugLine="Dim jp As JSONParser";
_jp = new anywheresoftware.b4a.objects.collections.JSONParser();
RDebugUtils.currentLine=10878981;
 //BA.debugLineNum = 10878981;BA.debugLine="jp.Initialize(val.SubString(9))";
_jp.Initialize(_val.substring((int) (9)));
RDebugUtils.currentLine=10878982;
 //BA.debugLineNum = 10878982;BA.debugLine="Return jp.NextObject";
if (true) return (Object)(_jp.NextObject().getObject());
 }else 
{RDebugUtils.currentLine=10878983;
 //BA.debugLineNum = 10878983;BA.debugLine="Else If val.StartsWith(\"JSON_LIST:\") Then";
if (_val.startsWith("JSON_LIST:")) { 
RDebugUtils.currentLine=10878984;
 //BA.debugLineNum = 10878984;BA.debugLine="Dim jp As JSONParser";
_jp = new anywheresoftware.b4a.objects.collections.JSONParser();
RDebugUtils.currentLine=10878985;
 //BA.debugLineNum = 10878985;BA.debugLine="jp.Initialize(val.SubString(10))";
_jp.Initialize(_val.substring((int) (10)));
RDebugUtils.currentLine=10878986;
 //BA.debugLineNum = 10878986;BA.debugLine="Return jp.NextArray";
if (true) return (Object)(_jp.NextArray().getObject());
 }}
;
RDebugUtils.currentLine=10878988;
 //BA.debugLineNum = 10878988;BA.debugLine="Return val";
if (true) return (Object)(_val);
RDebugUtils.currentLine=10878989;
 //BA.debugLineNum = 10878989;BA.debugLine="End Sub";
return null;
}
public String  _disablevstng(b4a.example.settings __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="settings";
if (Debug.shouldDelegate(ba, "disablevstng", false))
	 {return ((String) Debug.delegate(ba, "disablevstng", null));}
RDebugUtils.currentLine=8060928;
 //BA.debugLineNum = 8060928;BA.debugLine="Private Sub disableVSTNG";
RDebugUtils.currentLine=8060929;
 //BA.debugLineNum = 8060929;BA.debugLine="dprDatum.Enabled = False";
__ref._dprdatum /*anywheresoftware.b4a.objects.ButtonWrapper*/ .setEnabled(__c.False);
RDebugUtils.currentLine=8060930;
 //BA.debugLineNum = 8060930;BA.debugLine="dprDatum.TextColor = 0xFF888888";
__ref._dprdatum /*anywheresoftware.b4a.objects.ButtonWrapper*/ .setTextColor(((int)0xff888888));
RDebugUtils.currentLine=8060931;
 //BA.debugLineNum = 8060931;BA.debugLine="btnVerstgDelete.Enabled = False";
__ref._btnverstgdelete /*anywheresoftware.b4a.objects.ButtonWrapper*/ .setEnabled(__c.False);
RDebugUtils.currentLine=8060932;
 //BA.debugLineNum = 8060932;BA.debugLine="btnVerstgDelete.TextColor = 0xFF888888";
__ref._btnverstgdelete /*anywheresoftware.b4a.objects.ButtonWrapper*/ .setTextColor(((int)0xff888888));
RDebugUtils.currentLine=8060933;
 //BA.debugLineNum = 8060933;BA.debugLine="btnVerstgSpeichern.Enabled = False";
__ref._btnverstgspeichern /*anywheresoftware.b4a.objects.ButtonWrapper*/ .setEnabled(__c.False);
RDebugUtils.currentLine=8060934;
 //BA.debugLineNum = 8060934;BA.debugLine="btnVerstgSpeichern.TextColor = 0xFF888888";
__ref._btnverstgspeichern /*anywheresoftware.b4a.objects.ButtonWrapper*/ .setTextColor(((int)0xff888888));
RDebugUtils.currentLine=8060935;
 //BA.debugLineNum = 8060935;BA.debugLine="tbxVeranstaltung.Enabled = False";
__ref._tbxveranstaltung /*anywheresoftware.b4a.objects.EditTextWrapper*/ .setEnabled(__c.False);
RDebugUtils.currentLine=8060936;
 //BA.debugLineNum = 8060936;BA.debugLine="tbxAnzahl.Enabled = False";
__ref._tbxanzahl /*anywheresoftware.b4a.objects.EditTextWrapper*/ .setEnabled(__c.False);
RDebugUtils.currentLine=8060937;
 //BA.debugLineNum = 8060937;BA.debugLine="btnAuswahl.Enabled = False";
__ref._btnauswahl /*anywheresoftware.b4a.objects.ButtonWrapper*/ .setEnabled(__c.False);
RDebugUtils.currentLine=8060938;
 //BA.debugLineNum = 8060938;BA.debugLine="btnAuswahl.TextColor = 0xFF888888";
__ref._btnauswahl /*anywheresoftware.b4a.objects.ButtonWrapper*/ .setTextColor(((int)0xff888888));
RDebugUtils.currentLine=8060939;
 //BA.debugLineNum = 8060939;BA.debugLine="End Sub";
return "";
}
public String  _disabletln(b4a.example.settings __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="settings";
if (Debug.shouldDelegate(ba, "disabletln", false))
	 {return ((String) Debug.delegate(ba, "disabletln", null));}
RDebugUtils.currentLine=8192000;
 //BA.debugLineNum = 8192000;BA.debugLine="Private Sub disableTLN";
RDebugUtils.currentLine=8192001;
 //BA.debugLineNum = 8192001;BA.debugLine="btnTLNDelete.Enabled = False";
__ref._btntlndelete /*anywheresoftware.b4a.objects.ButtonWrapper*/ .setEnabled(__c.False);
RDebugUtils.currentLine=8192002;
 //BA.debugLineNum = 8192002;BA.debugLine="btnTLNSpeichern.Enabled = False";
__ref._btntlnspeichern /*anywheresoftware.b4a.objects.ButtonWrapper*/ .setEnabled(__c.False);
RDebugUtils.currentLine=8192003;
 //BA.debugLineNum = 8192003;BA.debugLine="tbxTeilnehmer.Enabled = False";
__ref._tbxteilnehmer /*anywheresoftware.b4a.objects.EditTextWrapper*/ .setEnabled(__c.False);
RDebugUtils.currentLine=8192004;
 //BA.debugLineNum = 8192004;BA.debugLine="btnTLNDelete.TextColor = 0xFF888888";
__ref._btntlndelete /*anywheresoftware.b4a.objects.ButtonWrapper*/ .setTextColor(((int)0xff888888));
RDebugUtils.currentLine=8192005;
 //BA.debugLineNum = 8192005;BA.debugLine="btnTLNSpeichern.TextColor = 0xFF888888";
__ref._btntlnspeichern /*anywheresoftware.b4a.objects.ButtonWrapper*/ .setTextColor(((int)0xff888888));
RDebugUtils.currentLine=8192006;
 //BA.debugLineNum = 8192006;BA.debugLine="End Sub";
return "";
}
public String  _setzeheaderfromdb(b4a.example.settings __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="settings";
if (Debug.shouldDelegate(ba, "setzeheaderfromdb", false))
	 {return ((String) Debug.delegate(ba, "setzeheaderfromdb", null));}
RDebugUtils.currentLine=8323072;
 //BA.debugLineNum = 8323072;BA.debugLine="Private Sub setzeHeaderfromDB";
RDebugUtils.currentLine=8323073;
 //BA.debugLineNum = 8323073;BA.debugLine="lblVerein.Text = DBGet(\"Bezeichnung\", \"- nicht ge";
__ref._lblverein /*anywheresoftware.b4a.objects.LabelWrapper*/ .setText(BA.ObjectToCharSequence(__ref._dbget /*Object*/ (null,"Bezeichnung",(Object)("- nicht gesetzt -"))));
RDebugUtils.currentLine=8323074;
 //BA.debugLineNum = 8323074;BA.debugLine="lblVeranstaltung.Text = DBGet(\"VeranstaltungName\"";
__ref._lblveranstaltung /*anywheresoftware.b4a.objects.LabelWrapper*/ .setText(BA.ObjectToCharSequence(__ref._dbget /*Object*/ (null,"VeranstaltungName",(Object)("- nicht gesetzt -"))));
RDebugUtils.currentLine=8323075;
 //BA.debugLineNum = 8323075;BA.debugLine="lblDatum.Text = DBGet(\"VeranstaltungDatum\", \"- ni";
__ref._lbldatum /*anywheresoftware.b4a.objects.LabelWrapper*/ .setText(BA.ObjectToCharSequence(__ref._dbget /*Object*/ (null,"VeranstaltungDatum",(Object)("- nicht gesetzt -"))));
RDebugUtils.currentLine=8323076;
 //BA.debugLineNum = 8323076;BA.debugLine="End Sub";
return "";
}
public String  _changeurl(b4a.example.settings __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="settings";
if (Debug.shouldDelegate(ba, "changeurl", false))
	 {return ((String) Debug.delegate(ba, "changeurl", null));}
String _url = "";
RDebugUtils.currentLine=8388608;
 //BA.debugLineNum = 8388608;BA.debugLine="Private Sub changeURL";
RDebugUtils.currentLine=8388609;
 //BA.debugLineNum = 8388609;BA.debugLine="Dim url As String = DBGet(\"VereinsID\", \"[...]\")";
_url = BA.ObjectToString(__ref._dbget /*Object*/ (null,"VereinsID",(Object)("[...]")));
RDebugUtils.currentLine=8388610;
 //BA.debugLineNum = 8388610;BA.debugLine="URLveranstaltungen = \"https://wertungslisten-app-";
__ref._urlveranstaltungen /*String*/  = "https://wertungslisten-app-default-rtdb.europe-west1.firebasedatabase.app/Vereine/"+_url+"/Veranstaltungen";
RDebugUtils.currentLine=8388611;
 //BA.debugLineNum = 8388611;BA.debugLine="URLteilnehmer = \"https://wertungslisten-app-defau";
__ref._urlteilnehmer /*String*/  = "https://wertungslisten-app-default-rtdb.europe-west1.firebasedatabase.app/Vereine/"+_url+"/Teilnehmer";
RDebugUtils.currentLine=8388612;
 //BA.debugLineNum = 8388612;BA.debugLine="URLergebnisse = \"https://wertungslisten-app-defau";
__ref._urlergebnisse /*String*/  = "https://wertungslisten-app-default-rtdb.europe-west1.firebasedatabase.app/Vereine/"+_url+"/Ergebnisse";
RDebugUtils.currentLine=8388613;
 //BA.debugLineNum = 8388613;BA.debugLine="End Sub";
return "";
}
public String  _dbput(b4a.example.settings __ref,String _key,Object _value) throws Exception{
__ref = this;
RDebugUtils.currentModule="settings";
if (Debug.shouldDelegate(ba, "dbput", false))
	 {return ((String) Debug.delegate(ba, "dbput", new Object[] {_key,_value}));}
anywheresoftware.b4a.objects.collections.JSONParser.JSONGenerator _jg = null;
RDebugUtils.currentLine=10813440;
 //BA.debugLineNum = 10813440;BA.debugLine="Private Sub DBPut(Key As String, Value As Object)";
RDebugUtils.currentLine=10813441;
 //BA.debugLineNum = 10813441;BA.debugLine="If Value Is Map Then";
if (_value instanceof java.util.Map) { 
RDebugUtils.currentLine=10813442;
 //BA.debugLineNum = 10813442;BA.debugLine="Dim jg As JSONGenerator";
_jg = new anywheresoftware.b4a.objects.collections.JSONParser.JSONGenerator();
RDebugUtils.currentLine=10813443;
 //BA.debugLineNum = 10813443;BA.debugLine="jg.Initialize(Value)";
_jg.Initialize((anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_value)));
RDebugUtils.currentLine=10813444;
 //BA.debugLineNum = 10813444;BA.debugLine="DBVerein.Put(Key, \"JSON_MAP:\" & jg.ToString)";
__ref._dbverein /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)(_key),(Object)("JSON_MAP:"+_jg.ToString()));
 }else 
{RDebugUtils.currentLine=10813445;
 //BA.debugLineNum = 10813445;BA.debugLine="Else If Value Is List Then";
if (_value instanceof java.util.List) { 
RDebugUtils.currentLine=10813446;
 //BA.debugLineNum = 10813446;BA.debugLine="Dim jg As JSONGenerator";
_jg = new anywheresoftware.b4a.objects.collections.JSONParser.JSONGenerator();
RDebugUtils.currentLine=10813447;
 //BA.debugLineNum = 10813447;BA.debugLine="jg.Initialize2(Value)";
_jg.Initialize2((anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_value)));
RDebugUtils.currentLine=10813448;
 //BA.debugLineNum = 10813448;BA.debugLine="DBVerein.Put(Key, \"JSON_LIST:\" & jg.ToString)";
__ref._dbverein /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)(_key),(Object)("JSON_LIST:"+_jg.ToString()));
 }else {
RDebugUtils.currentLine=10813450;
 //BA.debugLineNum = 10813450;BA.debugLine="DBVerein.Put(Key, Value)";
__ref._dbverein /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)(_key),_value);
 }}
;
RDebugUtils.currentLine=10813452;
 //BA.debugLineNum = 10813452;BA.debugLine="File.WriteMap(File.DirInternal, DBFileName, DBVer";
__c.File.WriteMap(__c.File.getDirInternal(),__ref._dbfilename /*String*/ ,__ref._dbverein /*anywheresoftware.b4a.objects.collections.Map*/ );
RDebugUtils.currentLine=10813453;
 //BA.debugLineNum = 10813453;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=8454144;
 //BA.debugLineNum = 8454144;BA.debugLine="Private Sub holeVeranstaltungen";
RDebugUtils.currentLine=8454145;
 //BA.debugLineNum = 8454145;BA.debugLine="DBdatenTyp = \"Veranstaltungen\"";
__ref._dbdatentyp /*String*/  = "Veranstaltungen";
RDebugUtils.currentLine=8454146;
 //BA.debugLineNum = 8454146;BA.debugLine="CurrentWebUrl = URLveranstaltungen & \".json?auth=";
__ref._currentweburl /*String*/  = __ref._urlveranstaltungen /*String*/ +".json?auth="+BA.ObjectToString(__ref._status /*anywheresoftware.b4a.objects.collections.Map*/ .GetDefault((Object)("idToken"),(Object)("")));
RDebugUtils.currentLine=8454147;
 //BA.debugLineNum = 8454147;BA.debugLine="ExecuteHttp(\"GET\", CurrentWebUrl, \"\")";
__ref._executehttp /*void*/ (null,"GET",__ref._currentweburl /*String*/ ,"");
RDebugUtils.currentLine=8454148;
 //BA.debugLineNum = 8454148;BA.debugLine="End Sub";
return "";
}
public String  _starttimer(b4a.example.settings __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="settings";
if (Debug.shouldDelegate(ba, "starttimer", false))
	 {return ((String) Debug.delegate(ba, "starttimer", null));}
RDebugUtils.currentLine=10485760;
 //BA.debugLineNum = 10485760;BA.debugLine="Private Sub startTimer";
RDebugUtils.currentLine=10485761;
 //BA.debugLineNum = 10485761;BA.debugLine="Uhrzeit.Enabled = False";
__ref._uhrzeit /*anywheresoftware.b4a.objects.Timer*/ .setEnabled(__c.False);
RDebugUtils.currentLine=10485762;
 //BA.debugLineNum = 10485762;BA.debugLine="Uhrzeit.Interval = 1000 * 300";
__ref._uhrzeit /*anywheresoftware.b4a.objects.Timer*/ .setInterval((long) (1000*300));
RDebugUtils.currentLine=10485763;
 //BA.debugLineNum = 10485763;BA.debugLine="Uhrzeit.Enabled = True";
__ref._uhrzeit /*anywheresoftware.b4a.objects.Timer*/ .setEnabled(__c.True);
RDebugUtils.currentLine=10485764;
 //BA.debugLineNum = 10485764;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=7602182;
 //BA.debugLineNum = 7602182;BA.debugLine="Root.LoadLayout(\"Settings\")";
__ref._root /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .LoadLayout("Settings",ba);
RDebugUtils.currentLine=7602185;
 //BA.debugLineNum = 7602185;BA.debugLine="End Sub";
return "";
}
public String  _btnauswahl_click(b4a.example.settings __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="settings";
if (Debug.shouldDelegate(ba, "btnauswahl_click", false))
	 {return ((String) Debug.delegate(ba, "btnauswahl_click", null));}
RDebugUtils.currentLine=9764864;
 //BA.debugLineNum = 9764864;BA.debugLine="Private Sub btnAuswahl_Click";
RDebugUtils.currentLine=9764865;
 //BA.debugLineNum = 9764865;BA.debugLine="Uhrzeit.Enabled = False";
__ref._uhrzeit /*anywheresoftware.b4a.objects.Timer*/ .setEnabled(__c.False);
RDebugUtils.currentLine=9764866;
 //BA.debugLineNum = 9764866;BA.debugLine="Veranstaltung_ID = webviewVSTGN_ID";
__ref._veranstaltung_id /*String*/  = __ref._webviewvstgn_id /*String*/ ;
RDebugUtils.currentLine=9764867;
 //BA.debugLineNum = 9764867;BA.debugLine="saveDBvstng";
__ref._savedbvstng /*String*/ (null);
RDebugUtils.currentLine=9764868;
 //BA.debugLineNum = 9764868;BA.debugLine="CloseSettings";
__ref._closesettings /*String*/ (null);
RDebugUtils.currentLine=9764869;
 //BA.debugLineNum = 9764869;BA.debugLine="End Sub";
return "";
}
public String  _savedbvstng(b4a.example.settings __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="settings";
if (Debug.shouldDelegate(ba, "savedbvstng", false))
	 {return ((String) Debug.delegate(ba, "savedbvstng", null));}
RDebugUtils.currentLine=8781824;
 //BA.debugLineNum = 8781824;BA.debugLine="Private Sub saveDBvstng";
RDebugUtils.currentLine=8781825;
 //BA.debugLineNum = 8781825;BA.debugLine="lblVeranstaltung.Text = tbxVeranstaltung.Text";
__ref._lblveranstaltung /*anywheresoftware.b4a.objects.LabelWrapper*/ .setText(BA.ObjectToCharSequence(__ref._tbxveranstaltung /*anywheresoftware.b4a.objects.EditTextWrapper*/ .getText()));
RDebugUtils.currentLine=8781826;
 //BA.debugLineNum = 8781826;BA.debugLine="lblDatum.Text = dprDatum.Text";
__ref._lbldatum /*anywheresoftware.b4a.objects.LabelWrapper*/ .setText(BA.ObjectToCharSequence(__ref._dprdatum /*anywheresoftware.b4a.objects.ButtonWrapper*/ .getText()));
RDebugUtils.currentLine=8781827;
 //BA.debugLineNum = 8781827;BA.debugLine="DBPut(\"VeranstaltungID\", Veranstaltung_ID)";
__ref._dbput /*String*/ (null,"VeranstaltungID",(Object)(__ref._veranstaltung_id /*String*/ ));
RDebugUtils.currentLine=8781828;
 //BA.debugLineNum = 8781828;BA.debugLine="DBPut(\"VeranstaltungName\", tbxVeranstaltung.Text)";
__ref._dbput /*String*/ (null,"VeranstaltungName",(Object)(__ref._tbxveranstaltung /*anywheresoftware.b4a.objects.EditTextWrapper*/ .getText()));
RDebugUtils.currentLine=8781829;
 //BA.debugLineNum = 8781829;BA.debugLine="DBPut(\"VeranstaltungDatum\", dprDatum.Text)";
__ref._dbput /*String*/ (null,"VeranstaltungDatum",(Object)(__ref._dprdatum /*anywheresoftware.b4a.objects.ButtonWrapper*/ .getText()));
RDebugUtils.currentLine=8781830;
 //BA.debugLineNum = 8781830;BA.debugLine="DBPut(\"VeranstaltungAnzahl\", tbxAnzahl.Text)";
__ref._dbput /*String*/ (null,"VeranstaltungAnzahl",(Object)(__ref._tbxanzahl /*anywheresoftware.b4a.objects.EditTextWrapper*/ .getText()));
RDebugUtils.currentLine=8781831;
 //BA.debugLineNum = 8781831;BA.debugLine="End Sub";
return "";
}
public String  _btnback_click(b4a.example.settings __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="settings";
if (Debug.shouldDelegate(ba, "btnback_click", false))
	 {return ((String) Debug.delegate(ba, "btnback_click", null));}
RDebugUtils.currentLine=9568256;
 //BA.debugLineNum = 9568256;BA.debugLine="Private Sub btnBack_Click";
RDebugUtils.currentLine=9568257;
 //BA.debugLineNum = 9568257;BA.debugLine="CloseSettings";
__ref._closesettings /*String*/ (null);
RDebugUtils.currentLine=9568258;
 //BA.debugLineNum = 9568258;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=9961473;
 //BA.debugLineNum = 9961473;BA.debugLine="startTimer";
__ref._starttimer /*String*/ (null);
RDebugUtils.currentLine=9961474;
 //BA.debugLineNum = 9961474;BA.debugLine="Msgbox2Async(tbxTeilnehmer.Text & \" aus der Liste";
parent.__c.Msgbox2Async(BA.ObjectToCharSequence(__ref._tbxteilnehmer /*anywheresoftware.b4a.objects.EditTextWrapper*/ .getText()+" aus der Liste der Teilnehmer löschen?"),BA.ObjectToCharSequence("Teilnehmer wirklich löschen?"),"Löschen","","Abbrechen",(anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper(), (android.graphics.Bitmap)(parent.__c.Null)),ba,parent.__c.True);
RDebugUtils.currentLine=9961475;
 //BA.debugLineNum = 9961475;BA.debugLine="Wait For Msgbox_Result (res As Int)";
parent.__c.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "settings", "btntlndelete_click"), null);
this.state = 5;
return;
case 5:
//C
this.state = 1;
_res = (Integer) result[1];
;
RDebugUtils.currentLine=9961476;
 //BA.debugLineNum = 9961476;BA.debugLine="If res = DialogResponse.POSITIVE Then";
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
RDebugUtils.currentLine=9961477;
 //BA.debugLineNum = 9961477;BA.debugLine="delTLN(TLNid)";
__ref._deltln /*String*/ (null,__ref._tlnid /*String*/ );
RDebugUtils.currentLine=9961478;
 //BA.debugLineNum = 9961478;BA.debugLine="startTimer";
__ref._starttimer /*String*/ (null);
 if (true) break;

case 4:
//C
this.state = -1;
;
RDebugUtils.currentLine=9961480;
 //BA.debugLineNum = 9961480;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=9306112;
 //BA.debugLineNum = 9306112;BA.debugLine="Private Sub delTLN(tid As String)";
RDebugUtils.currentLine=9306113;
 //BA.debugLineNum = 9306113;BA.debugLine="disableTLN";
__ref._disabletln /*String*/ (null);
RDebugUtils.currentLine=9306114;
 //BA.debugLineNum = 9306114;BA.debugLine="ToastMessageShow(\"Der Teilnehmer wird gelöscht!\",";
__c.ToastMessageShow(BA.ObjectToCharSequence("Der Teilnehmer wird gelöscht!"),__c.False);
RDebugUtils.currentLine=9306115;
 //BA.debugLineNum = 9306115;BA.debugLine="DBdatenTyp = \"delTeilnehmer\"";
__ref._dbdatentyp /*String*/  = "delTeilnehmer";
RDebugUtils.currentLine=9306116;
 //BA.debugLineNum = 9306116;BA.debugLine="CurrentWebUrl = URLteilnehmer & \"/\" & tid & \".jso";
__ref._currentweburl /*String*/  = __ref._urlteilnehmer /*String*/ +"/"+_tid+".json?auth="+BA.ObjectToString(__ref._status /*anywheresoftware.b4a.objects.collections.Map*/ .GetDefault((Object)("idToken"),(Object)("")));
RDebugUtils.currentLine=9306117;
 //BA.debugLineNum = 9306117;BA.debugLine="ExecuteHttp(\"DELETE\", CurrentWebUrl, \"\")";
__ref._executehttp /*void*/ (null,"DELETE",__ref._currentweburl /*String*/ ,"");
RDebugUtils.currentLine=9306118;
 //BA.debugLineNum = 9306118;BA.debugLine="enableTLN";
__ref._enabletln /*String*/ (null);
RDebugUtils.currentLine=9306119;
 //BA.debugLineNum = 9306119;BA.debugLine="End Sub";
return "";
}
public String  _btntlnspeichern_click(b4a.example.settings __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="settings";
if (Debug.shouldDelegate(ba, "btntlnspeichern_click", false))
	 {return ((String) Debug.delegate(ba, "btntlnspeichern_click", null));}
RDebugUtils.currentLine=10027008;
 //BA.debugLineNum = 10027008;BA.debugLine="Private Sub btnTLNSpeichern_Click";
RDebugUtils.currentLine=10027009;
 //BA.debugLineNum = 10027009;BA.debugLine="saveTLN";
__ref._savetln /*String*/ (null);
RDebugUtils.currentLine=10027010;
 //BA.debugLineNum = 10027010;BA.debugLine="startTimer";
__ref._starttimer /*String*/ (null);
RDebugUtils.currentLine=10027011;
 //BA.debugLineNum = 10027011;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=9240576;
 //BA.debugLineNum = 9240576;BA.debugLine="Private Sub saveTLN";
RDebugUtils.currentLine=9240577;
 //BA.debugLineNum = 9240577;BA.debugLine="disableTLN";
__ref._disabletln /*String*/ (null);
RDebugUtils.currentLine=9240578;
 //BA.debugLineNum = 9240578;BA.debugLine="Dim DBkey As String = TLNid";
_dbkey = __ref._tlnid /*String*/ ;
RDebugUtils.currentLine=9240579;
 //BA.debugLineNum = 9240579;BA.debugLine="If TLNid = \"t0\" Then";
if ((__ref._tlnid /*String*/ ).equals("t0")) { 
RDebugUtils.currentLine=9240580;
 //BA.debugLineNum = 9240580;BA.debugLine="DBkey = TLNnewID";
_dbkey = __ref._tlnnewid /*String*/ ;
 };
RDebugUtils.currentLine=9240583;
 //BA.debugLineNum = 9240583;BA.debugLine="Dim tName As String = tbxTeilnehmer.Text.Trim";
_tname = __ref._tbxteilnehmer /*anywheresoftware.b4a.objects.EditTextWrapper*/ .getText().trim();
RDebugUtils.currentLine=9240584;
 //BA.debugLineNum = 9240584;BA.debugLine="If Teilnehmer.IndexOf(tName) >= 0 Then";
if (__ref._teilnehmer /*anywheresoftware.b4a.objects.collections.List*/ .IndexOf((Object)(_tname))>=0) { 
RDebugUtils.currentLine=9240585;
 //BA.debugLineNum = 9240585;BA.debugLine="MsgboxAsync(\"Der Teilnehmer \" & tName & \" ist be";
__c.MsgboxAsync(BA.ObjectToCharSequence("Der Teilnehmer "+_tname+" ist bereits in der Teilnehmerliste vorhanden und kann nicht erneut angelegt werden. Zum Ändern bitte Teilnehmer auswählen und die Änderung speichern."),BA.ObjectToCharSequence("Speichern nicht möglich!"),ba);
 }else {
RDebugUtils.currentLine=9240587;
 //BA.debugLineNum = 9240587;BA.debugLine="Dim addTLNMap As Map = CreateMap(\"Name\": tName)";
_addtlnmap = new anywheresoftware.b4a.objects.collections.Map();
_addtlnmap = __c.createMap(new Object[] {(Object)("Name"),(Object)(_tname)});
RDebugUtils.currentLine=9240588;
 //BA.debugLineNum = 9240588;BA.debugLine="CurrentWebUrl = URLteilnehmer & \"/\" & DBkey & \".";
__ref._currentweburl /*String*/  = __ref._urlteilnehmer /*String*/ +"/"+_dbkey+".json?auth="+BA.ObjectToString(__ref._status /*anywheresoftware.b4a.objects.collections.Map*/ .GetDefault((Object)("idToken"),(Object)("")));
RDebugUtils.currentLine=9240589;
 //BA.debugLineNum = 9240589;BA.debugLine="DBdatenTyp = \"addTLN\"";
__ref._dbdatentyp /*String*/  = "addTLN";
RDebugUtils.currentLine=9240591;
 //BA.debugLineNum = 9240591;BA.debugLine="Dim jg As JSONGenerator";
_jg = new anywheresoftware.b4a.objects.collections.JSONParser.JSONGenerator();
RDebugUtils.currentLine=9240592;
 //BA.debugLineNum = 9240592;BA.debugLine="jg.Initialize(addTLNMap)";
_jg.Initialize(_addtlnmap);
RDebugUtils.currentLine=9240593;
 //BA.debugLineNum = 9240593;BA.debugLine="ExecuteHttp(\"PUT\", CurrentWebUrl, jg.ToString)";
__ref._executehttp /*void*/ (null,"PUT",__ref._currentweburl /*String*/ ,_jg.ToString());
 };
RDebugUtils.currentLine=9240595;
 //BA.debugLineNum = 9240595;BA.debugLine="enableTLN";
__ref._enabletln /*String*/ (null);
RDebugUtils.currentLine=9240596;
 //BA.debugLineNum = 9240596;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=9830401;
 //BA.debugLineNum = 9830401;BA.debugLine="startTimer";
__ref._starttimer /*String*/ (null);
RDebugUtils.currentLine=9830402;
 //BA.debugLineNum = 9830402;BA.debugLine="Msgbox2Async(\"Die Veranstaltung und deren Wertung";
parent.__c.Msgbox2Async(BA.ObjectToCharSequence("Die Veranstaltung und deren Wertungsliste werden unwiederbringlich gelöscht! Wirklich löschen?"),BA.ObjectToCharSequence("Veranstaltung wirklich löschen?"),"Löschen","","Abbrechen",(anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper(), (android.graphics.Bitmap)(parent.__c.Null)),ba,parent.__c.True);
RDebugUtils.currentLine=9830403;
 //BA.debugLineNum = 9830403;BA.debugLine="Wait For Msgbox_Result (res As Int)";
parent.__c.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "settings", "btnverstgdelete_click"), null);
this.state = 5;
return;
case 5:
//C
this.state = 1;
_res = (Integer) result[1];
;
RDebugUtils.currentLine=9830404;
 //BA.debugLineNum = 9830404;BA.debugLine="If res = DialogResponse.POSITIVE Then";
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
RDebugUtils.currentLine=9830405;
 //BA.debugLineNum = 9830405;BA.debugLine="delWertungsliste(webviewVSTGN_ID)";
__ref._delwertungsliste /*String*/ (null,__ref._webviewvstgn_id /*String*/ );
RDebugUtils.currentLine=9830406;
 //BA.debugLineNum = 9830406;BA.debugLine="startTimer";
__ref._starttimer /*String*/ (null);
 if (true) break;

case 4:
//C
this.state = -1;
;
RDebugUtils.currentLine=9830408;
 //BA.debugLineNum = 9830408;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=8847360;
 //BA.debugLineNum = 8847360;BA.debugLine="Private Sub delWertungsliste(vid As String)";
RDebugUtils.currentLine=8847361;
 //BA.debugLineNum = 8847361;BA.debugLine="disableVSTNG";
__ref._disablevstng /*String*/ (null);
RDebugUtils.currentLine=8847362;
 //BA.debugLineNum = 8847362;BA.debugLine="If Veranstaltungen.IsInitialized And Veranstaltun";
if (__ref._veranstaltungen /*anywheresoftware.b4a.objects.collections.Map*/ .IsInitialized() && __ref._veranstaltungen /*anywheresoftware.b4a.objects.collections.Map*/ .ContainsKey((Object)(_vid))) { 
RDebugUtils.currentLine=8847363;
 //BA.debugLineNum = 8847363;BA.debugLine="Dim veranstaltung As Map = Veranstaltungen.Get(v";
_veranstaltung = new anywheresoftware.b4a.objects.collections.Map();
_veranstaltung = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(__ref._veranstaltungen /*anywheresoftware.b4a.objects.collections.Map*/ .Get((Object)(_vid))));
RDebugUtils.currentLine=8847364;
 //BA.debugLineNum = 8847364;BA.debugLine="Dim datumStr As String = veranstaltung.GetDefaul";
_datumstr = BA.ObjectToString(_veranstaltung.GetDefault((Object)("Datum"),(Object)("00.00.0000")));
RDebugUtils.currentLine=8847365;
 //BA.debugLineNum = 8847365;BA.debugLine="Dim datum_spl() As String = Regex.Split(\"\\.\", da";
_datum_spl = __c.Regex.Split("\\.",_datumstr);
RDebugUtils.currentLine=8847366;
 //BA.debugLineNum = 8847366;BA.debugLine="If datum_spl.Length >= 3 Then";
if (_datum_spl.length>=3) { 
RDebugUtils.currentLine=8847367;
 //BA.debugLineNum = 8847367;BA.debugLine="DBdatenTyp = \"delErgebnis\"";
__ref._dbdatentyp /*String*/  = "delErgebnis";
RDebugUtils.currentLine=8847368;
 //BA.debugLineNum = 8847368;BA.debugLine="CurrentWebUrl = URLergebnisse & \"/e\" & datum_sp";
__ref._currentweburl /*String*/  = __ref._urlergebnisse /*String*/ +"/e"+_datum_spl[(int) (2)]+_datum_spl[(int) (1)]+_datum_spl[(int) (0)]+".json?auth="+BA.ObjectToString(__ref._status /*anywheresoftware.b4a.objects.collections.Map*/ .GetDefault((Object)("idToken"),(Object)("")));
RDebugUtils.currentLine=8847369;
 //BA.debugLineNum = 8847369;BA.debugLine="ExecuteHttp(\"DELETE\", CurrentWebUrl, \"\")";
__ref._executehttp /*void*/ (null,"DELETE",__ref._currentweburl /*String*/ ,"");
 };
 };
RDebugUtils.currentLine=8847372;
 //BA.debugLineNum = 8847372;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=9895937;
 //BA.debugLineNum = 9895937;BA.debugLine="startTimer";
__ref._starttimer /*String*/ (null);
RDebugUtils.currentLine=9895938;
 //BA.debugLineNum = 9895938;BA.debugLine="Dim neuAnz As Int = 0";
_neuanz = (int) (0);
RDebugUtils.currentLine=9895939;
 //BA.debugLineNum = 9895939;BA.debugLine="If IsNumber(tbxAnzahl.Text) Then neuAnz = tbxAnza";
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
RDebugUtils.currentLine=9895941;
 //BA.debugLineNum = 9895941;BA.debugLine="Dim altAnz As Int = 0";
_altanz = (int) (0);
RDebugUtils.currentLine=9895942;
 //BA.debugLineNum = 9895942;BA.debugLine="If Veranstaltungen.IsInitialized And Veranstaltun";
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
RDebugUtils.currentLine=9895943;
 //BA.debugLineNum = 9895943;BA.debugLine="Dim vMap As Map = Veranstaltungen.Get(Veranstalt";
_vmap = new anywheresoftware.b4a.objects.collections.Map();
_vmap = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(__ref._veranstaltungen /*anywheresoftware.b4a.objects.collections.Map*/ .Get((Object)(__ref._veranstaltung_id /*String*/ ))));
RDebugUtils.currentLine=9895944;
 //BA.debugLineNum = 9895944;BA.debugLine="altAnz = vMap.GetDefault(\"Teilnehmerzahl\", \"0\")";
_altanz = (int)(BA.ObjectToNumber(_vmap.GetDefault((Object)("Teilnehmerzahl"),(Object)("0"))));
 if (true) break;
;
RDebugUtils.currentLine=9895947;
 //BA.debugLineNum = 9895947;BA.debugLine="If neuAnz < altAnz Then";

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
RDebugUtils.currentLine=9895948;
 //BA.debugLineNum = 9895948;BA.debugLine="Msgbox2Async(\"Die Anzahl der Plätze wurde reduzi";
parent.__c.Msgbox2Async(BA.ObjectToCharSequence("Die Anzahl der Plätze wurde reduziert. Werden die geänderten Daten der Veranstaltung gespeichert, gehen ggf. Informationen in der Wertungsliste der Veranstaltung unwiederbringlich verloren."),BA.ObjectToCharSequence("Veranstaltung - Plätze"),"Trotzdem speichern.","","Abbrechen",(anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper(), (android.graphics.Bitmap)(parent.__c.Null)),ba,parent.__c.True);
RDebugUtils.currentLine=9895949;
 //BA.debugLineNum = 9895949;BA.debugLine="Wait For Msgbox_Result (res As Int)";
parent.__c.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "settings", "btnverstgspeichern_click"), null);
this.state = 20;
return;
case 20:
//C
this.state = 13;
_res = (Integer) result[1];
;
RDebugUtils.currentLine=9895950;
 //BA.debugLineNum = 9895950;BA.debugLine="If res = DialogResponse.POSITIVE Then";
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
RDebugUtils.currentLine=9895951;
 //BA.debugLineNum = 9895951;BA.debugLine="saveVSTNG";
__ref._savevstng /*String*/ (null);
RDebugUtils.currentLine=9895952;
 //BA.debugLineNum = 9895952;BA.debugLine="startTimer";
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
RDebugUtils.currentLine=9895955;
 //BA.debugLineNum = 9895955;BA.debugLine="saveVSTNG";
__ref._savevstng /*String*/ (null);
 if (true) break;

case 19:
//C
this.state = -1;
;
RDebugUtils.currentLine=9895957;
 //BA.debugLineNum = 9895957;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=8716288;
 //BA.debugLineNum = 8716288;BA.debugLine="Private Sub saveVSTNG";
RDebugUtils.currentLine=8716289;
 //BA.debugLineNum = 8716289;BA.debugLine="disableVSTNG";
__ref._disablevstng /*String*/ (null);
RDebugUtils.currentLine=8716290;
 //BA.debugLineNum = 8716290;BA.debugLine="Dim DBkey As String = webviewVSTGN_ID";
_dbkey = __ref._webviewvstgn_id /*String*/ ;
RDebugUtils.currentLine=8716291;
 //BA.debugLineNum = 8716291;BA.debugLine="If DBkey = \"v0\" Then";
if ((_dbkey).equals("v0")) { 
RDebugUtils.currentLine=8716292;
 //BA.debugLineNum = 8716292;BA.debugLine="DBkey = VSTGNnewID";
_dbkey = __ref._vstgnnewid /*String*/ ;
RDebugUtils.currentLine=8716293;
 //BA.debugLineNum = 8716293;BA.debugLine="webviewVSTGN_ID = VSTGNnewID";
__ref._webviewvstgn_id /*String*/  = __ref._vstgnnewid /*String*/ ;
 };
RDebugUtils.currentLine=8716296;
 //BA.debugLineNum = 8716296;BA.debugLine="Dim body As Map = CreateMap( _ 		\"Datum\": dprDatu";
_body = new anywheresoftware.b4a.objects.collections.Map();
_body = __c.createMap(new Object[] {(Object)("Datum"),(Object)(__ref._dprdatum /*anywheresoftware.b4a.objects.ButtonWrapper*/ .getText()),(Object)("Name"),(Object)(__ref._tbxveranstaltung /*anywheresoftware.b4a.objects.EditTextWrapper*/ .getText()),(Object)("Teilnehmerzahl"),(Object)(__ref._tbxanzahl /*anywheresoftware.b4a.objects.EditTextWrapper*/ .getText()),(Object)("Status"),(Object)("offen")});
RDebugUtils.currentLine=8716302;
 //BA.debugLineNum = 8716302;BA.debugLine="CurrentWebUrl = URLveranstaltungen & \"/\" & DBkey";
__ref._currentweburl /*String*/  = __ref._urlveranstaltungen /*String*/ +"/"+_dbkey+".json?auth="+BA.ObjectToString(__ref._status /*anywheresoftware.b4a.objects.collections.Map*/ .GetDefault((Object)("idToken"),(Object)("")));
RDebugUtils.currentLine=8716303;
 //BA.debugLineNum = 8716303;BA.debugLine="DBdatenTyp = \"addVSTNG\"";
__ref._dbdatentyp /*String*/  = "addVSTNG";
RDebugUtils.currentLine=8716305;
 //BA.debugLineNum = 8716305;BA.debugLine="Dim jg As JSONGenerator";
_jg = new anywheresoftware.b4a.objects.collections.JSONParser.JSONGenerator();
RDebugUtils.currentLine=8716306;
 //BA.debugLineNum = 8716306;BA.debugLine="jg.Initialize(body)";
_jg.Initialize(_body);
RDebugUtils.currentLine=8716307;
 //BA.debugLineNum = 8716307;BA.debugLine="ExecuteHttp(\"PUT\", CurrentWebUrl, jg.ToString)";
__ref._executehttp /*void*/ (null,"PUT",__ref._currentweburl /*String*/ ,_jg.ToString());
RDebugUtils.currentLine=8716309;
 //BA.debugLineNum = 8716309;BA.debugLine="If Veranstaltung_ID = webviewVSTGN_ID Then";
if ((__ref._veranstaltung_id /*String*/ ).equals(__ref._webviewvstgn_id /*String*/ )) { 
RDebugUtils.currentLine=8716310;
 //BA.debugLineNum = 8716310;BA.debugLine="saveDBvstng";
__ref._savedbvstng /*String*/ (null);
 };
RDebugUtils.currentLine=8716312;
 //BA.debugLineNum = 8716312;BA.debugLine="enableVSTNG";
__ref._enablevstng /*String*/ (null);
RDebugUtils.currentLine=8716313;
 //BA.debugLineNum = 8716313;BA.debugLine="End Sub";
return "";
}
public String  _buildui(b4a.example.settings __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="settings";
if (Debug.shouldDelegate(ba, "buildui", false))
	 {return ((String) Debug.delegate(ba, "buildui", null));}
anywheresoftware.b4a.objects.PanelWrapper _pnlheader = null;
int _lblw1 = 0;
int _lblw2 = 0;
anywheresoftware.b4a.objects.LabelWrapper _label5 = null;
anywheresoftware.b4a.objects.LabelWrapper _label10 = null;
anywheresoftware.b4a.objects.LabelWrapper _label12 = null;
anywheresoftware.b4a.objects.PanelWrapper _pnlcontent = null;
int _cury = 0;
anywheresoftware.b4a.objects.PanelWrapper _pnlvstng = null;
anywheresoftware.b4a.objects.LabelWrapper _label6 = null;
anywheresoftware.b4a.objects.LabelWrapper _label7 = null;
anywheresoftware.b4a.objects.LabelWrapper _label8 = null;
anywheresoftware.b4a.objects.EditTextWrapper _et = null;
anywheresoftware.b4a.objects.LabelWrapper _label9 = null;
anywheresoftware.b4a.objects.PanelWrapper _pnltln = null;
anywheresoftware.b4a.objects.LabelWrapper _label2 = null;
anywheresoftware.b4a.objects.LabelWrapper _label15 = null;
anywheresoftware.b4a.objects.LabelWrapper _label14 = null;
RDebugUtils.currentLine=7864320;
 //BA.debugLineNum = 7864320;BA.debugLine="Private Sub BuildUI";
RDebugUtils.currentLine=7864321;
 //BA.debugLineNum = 7864321;BA.debugLine="Log(\"BuildUI Anfang\")";
__c.LogImpl("37864321","BuildUI Anfang",0);
RDebugUtils.currentLine=7864322;
 //BA.debugLineNum = 7864322;BA.debugLine="dochange = False";
__ref._dochange /*boolean*/  = __c.False;
RDebugUtils.currentLine=7864323;
 //BA.debugLineNum = 7864323;BA.debugLine="Root.Color = Colors.White";
__ref._root /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setColor(__c.Colors.White);
RDebugUtils.currentLine=7864326;
 //BA.debugLineNum = 7864326;BA.debugLine="Dim pnlHeader As Panel";
_pnlheader = new anywheresoftware.b4a.objects.PanelWrapper();
RDebugUtils.currentLine=7864327;
 //BA.debugLineNum = 7864327;BA.debugLine="pnlHeader.Initialize(\"\")";
_pnlheader.Initialize(ba,"");
RDebugUtils.currentLine=7864328;
 //BA.debugLineNum = 7864328;BA.debugLine="pnlHeader.Color = Colors.White";
_pnlheader.setColor(__c.Colors.White);
RDebugUtils.currentLine=7864329;
 //BA.debugLineNum = 7864329;BA.debugLine="Root.AddView(pnlHeader, 0, 0, 100%x, 80dip)";
__ref._root /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .AddView((android.view.View)(_pnlheader.getObject()),(int) (0),(int) (0),__c.PerXToCurrent((float) (100),ba),__c.DipToCurrent((int) (80)));
RDebugUtils.currentLine=7864331;
 //BA.debugLineNum = 7864331;BA.debugLine="Dim lblW1 As Int = 115dip";
_lblw1 = __c.DipToCurrent((int) (115));
RDebugUtils.currentLine=7864332;
 //BA.debugLineNum = 7864332;BA.debugLine="Dim lblW2 As Int = 100%x - lblW1 - 45dip";
_lblw2 = (int) (__c.PerXToCurrent((float) (100),ba)-_lblw1-__c.DipToCurrent((int) (45)));
RDebugUtils.currentLine=7864334;
 //BA.debugLineNum = 7864334;BA.debugLine="Dim Label5 As Label";
_label5 = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=7864335;
 //BA.debugLineNum = 7864335;BA.debugLine="Label5.Initialize(\"\")";
_label5.Initialize(ba,"");
RDebugUtils.currentLine=7864336;
 //BA.debugLineNum = 7864336;BA.debugLine="Label5.Text = \"Verein:\"";
_label5.setText(BA.ObjectToCharSequence("Verein:"));
RDebugUtils.currentLine=7864337;
 //BA.debugLineNum = 7864337;BA.debugLine="Label5.Typeface = Typeface.DEFAULT_BOLD";
_label5.setTypeface(__c.Typeface.DEFAULT_BOLD);
RDebugUtils.currentLine=7864338;
 //BA.debugLineNum = 7864338;BA.debugLine="Label5.TextColor = Colors.Black";
_label5.setTextColor(__c.Colors.Black);
RDebugUtils.currentLine=7864339;
 //BA.debugLineNum = 7864339;BA.debugLine="Label5.Gravity = Gravity.RIGHT + Gravity.CENTER_V";
_label5.setGravity((int) (__c.Gravity.RIGHT+__c.Gravity.CENTER_VERTICAL));
RDebugUtils.currentLine=7864340;
 //BA.debugLineNum = 7864340;BA.debugLine="pnlHeader.AddView(Label5, 5dip, 4dip, lblW1, 24di";
_pnlheader.AddView((android.view.View)(_label5.getObject()),__c.DipToCurrent((int) (5)),__c.DipToCurrent((int) (4)),_lblw1,__c.DipToCurrent((int) (24)));
RDebugUtils.currentLine=7864342;
 //BA.debugLineNum = 7864342;BA.debugLine="lblVerein.Initialize(\"\")";
__ref._lblverein /*anywheresoftware.b4a.objects.LabelWrapper*/ .Initialize(ba,"");
RDebugUtils.currentLine=7864343;
 //BA.debugLineNum = 7864343;BA.debugLine="lblVerein.Text = \"- Vereinsbezeichnung -\"";
__ref._lblverein /*anywheresoftware.b4a.objects.LabelWrapper*/ .setText(BA.ObjectToCharSequence("- Vereinsbezeichnung -"));
RDebugUtils.currentLine=7864344;
 //BA.debugLineNum = 7864344;BA.debugLine="lblVerein.Typeface = Typeface.DEFAULT_BOLD";
__ref._lblverein /*anywheresoftware.b4a.objects.LabelWrapper*/ .setTypeface(__c.Typeface.DEFAULT_BOLD);
RDebugUtils.currentLine=7864345;
 //BA.debugLineNum = 7864345;BA.debugLine="lblVerein.TextColor = 0xFF16AA16";
__ref._lblverein /*anywheresoftware.b4a.objects.LabelWrapper*/ .setTextColor(((int)0xff16aa16));
RDebugUtils.currentLine=7864346;
 //BA.debugLineNum = 7864346;BA.debugLine="lblVerein.Gravity = Gravity.LEFT + Gravity.CENTER";
__ref._lblverein /*anywheresoftware.b4a.objects.LabelWrapper*/ .setGravity((int) (__c.Gravity.LEFT+__c.Gravity.CENTER_VERTICAL));
RDebugUtils.currentLine=7864347;
 //BA.debugLineNum = 7864347;BA.debugLine="pnlHeader.AddView(lblVerein, lblW1 + 8dip, 4dip,";
_pnlheader.AddView((android.view.View)(__ref._lblverein /*anywheresoftware.b4a.objects.LabelWrapper*/ .getObject()),(int) (_lblw1+__c.DipToCurrent((int) (8))),__c.DipToCurrent((int) (4)),_lblw2,__c.DipToCurrent((int) (24)));
RDebugUtils.currentLine=7864349;
 //BA.debugLineNum = 7864349;BA.debugLine="Dim Label10 As Label";
_label10 = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=7864350;
 //BA.debugLineNum = 7864350;BA.debugLine="Label10.Initialize(\"\")";
_label10.Initialize(ba,"");
RDebugUtils.currentLine=7864351;
 //BA.debugLineNum = 7864351;BA.debugLine="Label10.Text = \"Veranstaltung:\"";
_label10.setText(BA.ObjectToCharSequence("Veranstaltung:"));
RDebugUtils.currentLine=7864352;
 //BA.debugLineNum = 7864352;BA.debugLine="Label10.Typeface = Typeface.DEFAULT_BOLD";
_label10.setTypeface(__c.Typeface.DEFAULT_BOLD);
RDebugUtils.currentLine=7864353;
 //BA.debugLineNum = 7864353;BA.debugLine="Label10.TextColor = Colors.Black";
_label10.setTextColor(__c.Colors.Black);
RDebugUtils.currentLine=7864354;
 //BA.debugLineNum = 7864354;BA.debugLine="Label10.Gravity = Gravity.RIGHT + Gravity.CENTER_";
_label10.setGravity((int) (__c.Gravity.RIGHT+__c.Gravity.CENTER_VERTICAL));
RDebugUtils.currentLine=7864355;
 //BA.debugLineNum = 7864355;BA.debugLine="pnlHeader.AddView(Label10, 5dip, 28dip, lblW1, 24";
_pnlheader.AddView((android.view.View)(_label10.getObject()),__c.DipToCurrent((int) (5)),__c.DipToCurrent((int) (28)),_lblw1,__c.DipToCurrent((int) (24)));
RDebugUtils.currentLine=7864357;
 //BA.debugLineNum = 7864357;BA.debugLine="lblVeranstaltung.Initialize(\"\")";
__ref._lblveranstaltung /*anywheresoftware.b4a.objects.LabelWrapper*/ .Initialize(ba,"");
RDebugUtils.currentLine=7864358;
 //BA.debugLineNum = 7864358;BA.debugLine="lblVeranstaltung.Text = \"-Veranstaltung-\"";
__ref._lblveranstaltung /*anywheresoftware.b4a.objects.LabelWrapper*/ .setText(BA.ObjectToCharSequence("-Veranstaltung-"));
RDebugUtils.currentLine=7864359;
 //BA.debugLineNum = 7864359;BA.debugLine="lblVeranstaltung.Typeface = Typeface.DEFAULT_BOLD";
__ref._lblveranstaltung /*anywheresoftware.b4a.objects.LabelWrapper*/ .setTypeface(__c.Typeface.DEFAULT_BOLD);
RDebugUtils.currentLine=7864360;
 //BA.debugLineNum = 7864360;BA.debugLine="lblVeranstaltung.TextColor = 0xFF3333FF";
__ref._lblveranstaltung /*anywheresoftware.b4a.objects.LabelWrapper*/ .setTextColor(((int)0xff3333ff));
RDebugUtils.currentLine=7864361;
 //BA.debugLineNum = 7864361;BA.debugLine="lblVeranstaltung.Gravity = Gravity.LEFT + Gravity";
__ref._lblveranstaltung /*anywheresoftware.b4a.objects.LabelWrapper*/ .setGravity((int) (__c.Gravity.LEFT+__c.Gravity.CENTER_VERTICAL));
RDebugUtils.currentLine=7864362;
 //BA.debugLineNum = 7864362;BA.debugLine="pnlHeader.AddView(lblVeranstaltung, lblW1 + 8dip,";
_pnlheader.AddView((android.view.View)(__ref._lblveranstaltung /*anywheresoftware.b4a.objects.LabelWrapper*/ .getObject()),(int) (_lblw1+__c.DipToCurrent((int) (8))),__c.DipToCurrent((int) (28)),_lblw2,__c.DipToCurrent((int) (24)));
RDebugUtils.currentLine=7864364;
 //BA.debugLineNum = 7864364;BA.debugLine="Dim Label12 As Label";
_label12 = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=7864365;
 //BA.debugLineNum = 7864365;BA.debugLine="Label12.Initialize(\"\")";
_label12.Initialize(ba,"");
RDebugUtils.currentLine=7864366;
 //BA.debugLineNum = 7864366;BA.debugLine="Label12.Text = \"Datum:\"";
_label12.setText(BA.ObjectToCharSequence("Datum:"));
RDebugUtils.currentLine=7864367;
 //BA.debugLineNum = 7864367;BA.debugLine="Label12.Typeface = Typeface.DEFAULT_BOLD";
_label12.setTypeface(__c.Typeface.DEFAULT_BOLD);
RDebugUtils.currentLine=7864368;
 //BA.debugLineNum = 7864368;BA.debugLine="Label12.TextColor = Colors.Black";
_label12.setTextColor(__c.Colors.Black);
RDebugUtils.currentLine=7864369;
 //BA.debugLineNum = 7864369;BA.debugLine="Label12.Gravity = Gravity.RIGHT + Gravity.CENTER_";
_label12.setGravity((int) (__c.Gravity.RIGHT+__c.Gravity.CENTER_VERTICAL));
RDebugUtils.currentLine=7864370;
 //BA.debugLineNum = 7864370;BA.debugLine="pnlHeader.AddView(Label12, 5dip, 52dip, lblW1, 24";
_pnlheader.AddView((android.view.View)(_label12.getObject()),__c.DipToCurrent((int) (5)),__c.DipToCurrent((int) (52)),_lblw1,__c.DipToCurrent((int) (24)));
RDebugUtils.currentLine=7864372;
 //BA.debugLineNum = 7864372;BA.debugLine="lblDatum.Initialize(\"\")";
__ref._lbldatum /*anywheresoftware.b4a.objects.LabelWrapper*/ .Initialize(ba,"");
RDebugUtils.currentLine=7864373;
 //BA.debugLineNum = 7864373;BA.debugLine="lblDatum.Text = \"- Datum -\"";
__ref._lbldatum /*anywheresoftware.b4a.objects.LabelWrapper*/ .setText(BA.ObjectToCharSequence("- Datum -"));
RDebugUtils.currentLine=7864374;
 //BA.debugLineNum = 7864374;BA.debugLine="lblDatum.Typeface = Typeface.DEFAULT_BOLD";
__ref._lbldatum /*anywheresoftware.b4a.objects.LabelWrapper*/ .setTypeface(__c.Typeface.DEFAULT_BOLD);
RDebugUtils.currentLine=7864375;
 //BA.debugLineNum = 7864375;BA.debugLine="lblDatum.TextColor = 0xFF3333FF";
__ref._lbldatum /*anywheresoftware.b4a.objects.LabelWrapper*/ .setTextColor(((int)0xff3333ff));
RDebugUtils.currentLine=7864376;
 //BA.debugLineNum = 7864376;BA.debugLine="lblDatum.Gravity = Gravity.LEFT + Gravity.CENTER_";
__ref._lbldatum /*anywheresoftware.b4a.objects.LabelWrapper*/ .setGravity((int) (__c.Gravity.LEFT+__c.Gravity.CENTER_VERTICAL));
RDebugUtils.currentLine=7864377;
 //BA.debugLineNum = 7864377;BA.debugLine="pnlHeader.AddView(lblDatum, lblW1 + 8dip, 52dip,";
_pnlheader.AddView((android.view.View)(__ref._lbldatum /*anywheresoftware.b4a.objects.LabelWrapper*/ .getObject()),(int) (_lblw1+__c.DipToCurrent((int) (8))),__c.DipToCurrent((int) (52)),_lblw2,__c.DipToCurrent((int) (24)));
RDebugUtils.currentLine=7864379;
 //BA.debugLineNum = 7864379;BA.debugLine="btnBack.Initialize(\"btnBack\")";
__ref._btnback /*anywheresoftware.b4a.objects.ButtonWrapper*/ .Initialize(ba,"btnBack");
RDebugUtils.currentLine=7864380;
 //BA.debugLineNum = 7864380;BA.debugLine="SetButtonImageSafe(btnBack, \"Arrows-Back.png\", \"◀";
__ref._setbuttonimagesafe /*String*/ (null,__ref._btnback /*anywheresoftware.b4a.objects.ButtonWrapper*/ ,"Arrows-Back.png","◀");
RDebugUtils.currentLine=7864381;
 //BA.debugLineNum = 7864381;BA.debugLine="pnlHeader.AddView(btnBack, 100%x - 36dip, 26dip,";
_pnlheader.AddView((android.view.View)(__ref._btnback /*anywheresoftware.b4a.objects.ButtonWrapper*/ .getObject()),(int) (__c.PerXToCurrent((float) (100),ba)-__c.DipToCurrent((int) (36))),__c.DipToCurrent((int) (26)),__c.DipToCurrent((int) (28)),__c.DipToCurrent((int) (28)));
RDebugUtils.currentLine=7864384;
 //BA.debugLineNum = 7864384;BA.debugLine="svMain.Initialize(950dip)";
__ref._svmain /*anywheresoftware.b4a.objects.ScrollViewWrapper*/ .Initialize(ba,__c.DipToCurrent((int) (950)));
RDebugUtils.currentLine=7864385;
 //BA.debugLineNum = 7864385;BA.debugLine="Root.AddView(svMain, 0, 80dip, 100%x, 100%y - 80d";
__ref._root /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .AddView((android.view.View)(__ref._svmain /*anywheresoftware.b4a.objects.ScrollViewWrapper*/ .getObject()),(int) (0),__c.DipToCurrent((int) (80)),__c.PerXToCurrent((float) (100),ba),(int) (__c.PerYToCurrent((float) (100),ba)-__c.DipToCurrent((int) (80))));
RDebugUtils.currentLine=7864386;
 //BA.debugLineNum = 7864386;BA.debugLine="Dim pnlContent As Panel = svMain.Panel";
_pnlcontent = new anywheresoftware.b4a.objects.PanelWrapper();
_pnlcontent = __ref._svmain /*anywheresoftware.b4a.objects.ScrollViewWrapper*/ .getPanel();
RDebugUtils.currentLine=7864387;
 //BA.debugLineNum = 7864387;BA.debugLine="pnlContent.Color = Colors.White";
_pnlcontent.setColor(__c.Colors.White);
RDebugUtils.currentLine=7864389;
 //BA.debugLineNum = 7864389;BA.debugLine="Dim curY As Int = 0";
_cury = (int) (0);
RDebugUtils.currentLine=7864392;
 //BA.debugLineNum = 7864392;BA.debugLine="AddDivider(pnlContent, curY, 12dip, 0xFFEEFFEE)";
__ref._adddivider /*String*/ (null,_pnlcontent,_cury,__c.DipToCurrent((int) (12)),((int)0xffeeffee));
RDebugUtils.currentLine=7864393;
 //BA.debugLineNum = 7864393;BA.debugLine="curY = curY + 12dip";
_cury = (int) (_cury+__c.DipToCurrent((int) (12)));
RDebugUtils.currentLine=7864396;
 //BA.debugLineNum = 7864396;BA.debugLine="Dim pnlVstng As Panel";
_pnlvstng = new anywheresoftware.b4a.objects.PanelWrapper();
RDebugUtils.currentLine=7864397;
 //BA.debugLineNum = 7864397;BA.debugLine="pnlVstng.Initialize(\"\")";
_pnlvstng.Initialize(ba,"");
RDebugUtils.currentLine=7864398;
 //BA.debugLineNum = 7864398;BA.debugLine="pnlVstng.Color = 0xAAEEFFEE";
_pnlvstng.setColor(((int)0xaaeeffee));
RDebugUtils.currentLine=7864399;
 //BA.debugLineNum = 7864399;BA.debugLine="pnlContent.AddView(pnlVstng, 0, curY, 100%x, 225d";
_pnlcontent.AddView((android.view.View)(_pnlvstng.getObject()),(int) (0),_cury,__c.PerXToCurrent((float) (100),ba),__c.DipToCurrent((int) (225)));
RDebugUtils.currentLine=7864401;
 //BA.debugLineNum = 7864401;BA.debugLine="Dim Label6 As Label";
_label6 = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=7864402;
 //BA.debugLineNum = 7864402;BA.debugLine="Label6.Initialize(\"\")";
_label6.Initialize(ba,"");
RDebugUtils.currentLine=7864403;
 //BA.debugLineNum = 7864403;BA.debugLine="Label6.Text = \"Veranstaltung\"";
_label6.setText(BA.ObjectToCharSequence("Veranstaltung"));
RDebugUtils.currentLine=7864404;
 //BA.debugLineNum = 7864404;BA.debugLine="Label6.TextSize = 18";
_label6.setTextSize((float) (18));
RDebugUtils.currentLine=7864405;
 //BA.debugLineNum = 7864405;BA.debugLine="Label6.Typeface = Typeface.DEFAULT_BOLD";
_label6.setTypeface(__c.Typeface.DEFAULT_BOLD);
RDebugUtils.currentLine=7864406;
 //BA.debugLineNum = 7864406;BA.debugLine="Label6.TextColor = 0xFF16AA16";
_label6.setTextColor(((int)0xff16aa16));
RDebugUtils.currentLine=7864407;
 //BA.debugLineNum = 7864407;BA.debugLine="Label6.Gravity = Gravity.CENTER_VERTICAL";
_label6.setGravity(__c.Gravity.CENTER_VERTICAL);
RDebugUtils.currentLine=7864408;
 //BA.debugLineNum = 7864408;BA.debugLine="pnlVstng.AddView(Label6, 15dip, 8dip, 140dip, 28d";
_pnlvstng.AddView((android.view.View)(_label6.getObject()),__c.DipToCurrent((int) (15)),__c.DipToCurrent((int) (8)),__c.DipToCurrent((int) (140)),__c.DipToCurrent((int) (28)));
RDebugUtils.currentLine=7864410;
 //BA.debugLineNum = 7864410;BA.debugLine="lblClosed.Initialize(\"\")";
__ref._lblclosed /*anywheresoftware.b4a.objects.LabelWrapper*/ .Initialize(ba,"");
RDebugUtils.currentLine=7864411;
 //BA.debugLineNum = 7864411;BA.debugLine="lblClosed.Text = \"geschlossen\"";
__ref._lblclosed /*anywheresoftware.b4a.objects.LabelWrapper*/ .setText(BA.ObjectToCharSequence("geschlossen"));
RDebugUtils.currentLine=7864412;
 //BA.debugLineNum = 7864412;BA.debugLine="lblClosed.Typeface = Typeface.DEFAULT_BOLD";
__ref._lblclosed /*anywheresoftware.b4a.objects.LabelWrapper*/ .setTypeface(__c.Typeface.DEFAULT_BOLD);
RDebugUtils.currentLine=7864413;
 //BA.debugLineNum = 7864413;BA.debugLine="lblClosed.TextColor = Colors.Red";
__ref._lblclosed /*anywheresoftware.b4a.objects.LabelWrapper*/ .setTextColor(__c.Colors.Red);
RDebugUtils.currentLine=7864414;
 //BA.debugLineNum = 7864414;BA.debugLine="lblClosed.Gravity = Gravity.CENTER_VERTICAL";
__ref._lblclosed /*anywheresoftware.b4a.objects.LabelWrapper*/ .setGravity(__c.Gravity.CENTER_VERTICAL);
RDebugUtils.currentLine=7864415;
 //BA.debugLineNum = 7864415;BA.debugLine="lblClosed.Visible = False";
__ref._lblclosed /*anywheresoftware.b4a.objects.LabelWrapper*/ .setVisible(__c.False);
RDebugUtils.currentLine=7864416;
 //BA.debugLineNum = 7864416;BA.debugLine="pnlVstng.AddView(lblClosed, 160dip, 8dip, 120dip,";
_pnlvstng.AddView((android.view.View)(__ref._lblclosed /*anywheresoftware.b4a.objects.LabelWrapper*/ .getObject()),__c.DipToCurrent((int) (160)),__c.DipToCurrent((int) (8)),__c.DipToCurrent((int) (120)),__c.DipToCurrent((int) (28)));
RDebugUtils.currentLine=7864419;
 //BA.debugLineNum = 7864419;BA.debugLine="Dim Label7 As Label";
_label7 = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=7864420;
 //BA.debugLineNum = 7864420;BA.debugLine="Label7.Initialize(\"\")";
_label7.Initialize(ba,"");
RDebugUtils.currentLine=7864421;
 //BA.debugLineNum = 7864421;BA.debugLine="Label7.Text = \"Datum:\"";
_label7.setText(BA.ObjectToCharSequence("Datum:"));
RDebugUtils.currentLine=7864422;
 //BA.debugLineNum = 7864422;BA.debugLine="Label7.Typeface = Typeface.DEFAULT_BOLD";
_label7.setTypeface(__c.Typeface.DEFAULT_BOLD);
RDebugUtils.currentLine=7864423;
 //BA.debugLineNum = 7864423;BA.debugLine="Label7.TextColor = Colors.Black";
_label7.setTextColor(__c.Colors.Black);
RDebugUtils.currentLine=7864424;
 //BA.debugLineNum = 7864424;BA.debugLine="Label7.Gravity = Gravity.RIGHT + Gravity.CENTER_V";
_label7.setGravity((int) (__c.Gravity.RIGHT+__c.Gravity.CENTER_VERTICAL));
RDebugUtils.currentLine=7864425;
 //BA.debugLineNum = 7864425;BA.debugLine="pnlVstng.AddView(Label7, 5dip, 44dip, 115dip, 40d";
_pnlvstng.AddView((android.view.View)(_label7.getObject()),__c.DipToCurrent((int) (5)),__c.DipToCurrent((int) (44)),__c.DipToCurrent((int) (115)),__c.DipToCurrent((int) (40)));
RDebugUtils.currentLine=7864427;
 //BA.debugLineNum = 7864427;BA.debugLine="dprDatum.Initialize(\"dprDatum\")";
__ref._dprdatum /*anywheresoftware.b4a.objects.ButtonWrapper*/ .Initialize(ba,"dprDatum");
RDebugUtils.currentLine=7864428;
 //BA.debugLineNum = 7864428;BA.debugLine="dprDatum.Text = \"Datum\"";
__ref._dprdatum /*anywheresoftware.b4a.objects.ButtonWrapper*/ .setText(BA.ObjectToCharSequence("Datum"));
RDebugUtils.currentLine=7864429;
 //BA.debugLineNum = 7864429;BA.debugLine="dprDatum.Typeface = Typeface.DEFAULT_BOLD";
__ref._dprdatum /*anywheresoftware.b4a.objects.ButtonWrapper*/ .setTypeface(__c.Typeface.DEFAULT_BOLD);
RDebugUtils.currentLine=7864430;
 //BA.debugLineNum = 7864430;BA.debugLine="dprDatum.TextColor = 0xFF16AA16";
__ref._dprdatum /*anywheresoftware.b4a.objects.ButtonWrapper*/ .setTextColor(((int)0xff16aa16));
RDebugUtils.currentLine=7864431;
 //BA.debugLineNum = 7864431;BA.debugLine="pnlVstng.AddView(dprDatum, 128dip, 44dip, 115dip,";
_pnlvstng.AddView((android.view.View)(__ref._dprdatum /*anywheresoftware.b4a.objects.ButtonWrapper*/ .getObject()),__c.DipToCurrent((int) (128)),__c.DipToCurrent((int) (44)),__c.DipToCurrent((int) (115)),__c.DipToCurrent((int) (40)));
RDebugUtils.currentLine=7864433;
 //BA.debugLineNum = 7864433;BA.debugLine="btnAuswahl.Initialize(\"btnAuswahl\")";
__ref._btnauswahl /*anywheresoftware.b4a.objects.ButtonWrapper*/ .Initialize(ba,"btnAuswahl");
RDebugUtils.currentLine=7864434;
 //BA.debugLineNum = 7864434;BA.debugLine="btnAuswahl.Text = \"Auswahl\"";
__ref._btnauswahl /*anywheresoftware.b4a.objects.ButtonWrapper*/ .setText(BA.ObjectToCharSequence("Auswahl"));
RDebugUtils.currentLine=7864435;
 //BA.debugLineNum = 7864435;BA.debugLine="btnAuswahl.TextSize = 14";
__ref._btnauswahl /*anywheresoftware.b4a.objects.ButtonWrapper*/ .setTextSize((float) (14));
RDebugUtils.currentLine=7864436;
 //BA.debugLineNum = 7864436;BA.debugLine="btnAuswahl.Typeface = Typeface.DEFAULT_BOLD";
__ref._btnauswahl /*anywheresoftware.b4a.objects.ButtonWrapper*/ .setTypeface(__c.Typeface.DEFAULT_BOLD);
RDebugUtils.currentLine=7864437;
 //BA.debugLineNum = 7864437;BA.debugLine="btnAuswahl.TextColor = 0xFF3333FF";
__ref._btnauswahl /*anywheresoftware.b4a.objects.ButtonWrapper*/ .setTextColor(((int)0xff3333ff));
RDebugUtils.currentLine=7864438;
 //BA.debugLineNum = 7864438;BA.debugLine="pnlVstng.AddView(btnAuswahl, 100%x - 105dip, 44di";
_pnlvstng.AddView((android.view.View)(__ref._btnauswahl /*anywheresoftware.b4a.objects.ButtonWrapper*/ .getObject()),(int) (__c.PerXToCurrent((float) (100),ba)-__c.DipToCurrent((int) (105))),__c.DipToCurrent((int) (44)),__c.DipToCurrent((int) (95)),__c.DipToCurrent((int) (40)));
RDebugUtils.currentLine=7864441;
 //BA.debugLineNum = 7864441;BA.debugLine="Dim Label8 As Label";
_label8 = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=7864442;
 //BA.debugLineNum = 7864442;BA.debugLine="Label8.Initialize(\"\")";
_label8.Initialize(ba,"");
RDebugUtils.currentLine=7864443;
 //BA.debugLineNum = 7864443;BA.debugLine="Label8.Text = \"Bezeichnung:\"";
_label8.setText(BA.ObjectToCharSequence("Bezeichnung:"));
RDebugUtils.currentLine=7864444;
 //BA.debugLineNum = 7864444;BA.debugLine="Label8.Typeface = Typeface.DEFAULT_BOLD";
_label8.setTypeface(__c.Typeface.DEFAULT_BOLD);
RDebugUtils.currentLine=7864445;
 //BA.debugLineNum = 7864445;BA.debugLine="Label8.TextColor = Colors.Black";
_label8.setTextColor(__c.Colors.Black);
RDebugUtils.currentLine=7864446;
 //BA.debugLineNum = 7864446;BA.debugLine="Label8.Gravity = Gravity.RIGHT + Gravity.CENTER_V";
_label8.setGravity((int) (__c.Gravity.RIGHT+__c.Gravity.CENTER_VERTICAL));
RDebugUtils.currentLine=7864447;
 //BA.debugLineNum = 7864447;BA.debugLine="pnlVstng.AddView(Label8, 5dip, 90dip, 115dip, 42d";
_pnlvstng.AddView((android.view.View)(_label8.getObject()),__c.DipToCurrent((int) (5)),__c.DipToCurrent((int) (90)),__c.DipToCurrent((int) (115)),__c.DipToCurrent((int) (42)));
RDebugUtils.currentLine=7864449;
 //BA.debugLineNum = 7864449;BA.debugLine="Dim et As EditText";
_et = new anywheresoftware.b4a.objects.EditTextWrapper();
RDebugUtils.currentLine=7864450;
 //BA.debugLineNum = 7864450;BA.debugLine="et.Initialize(\"Test\")";
_et.Initialize(ba,"Test");
RDebugUtils.currentLine=7864452;
 //BA.debugLineNum = 7864452;BA.debugLine="Log(\"vor Init Veranstaltung\")";
__c.LogImpl("37864452","vor Init Veranstaltung",0);
RDebugUtils.currentLine=7864454;
 //BA.debugLineNum = 7864454;BA.debugLine="tbxVeranstaltung.Initialize(\"\")";
__ref._tbxveranstaltung /*anywheresoftware.b4a.objects.EditTextWrapper*/ .Initialize(ba,"");
RDebugUtils.currentLine=7864455;
 //BA.debugLineNum = 7864455;BA.debugLine="Log(\"TextSize\")";
__c.LogImpl("37864455","TextSize",0);
RDebugUtils.currentLine=7864456;
 //BA.debugLineNum = 7864456;BA.debugLine="tbxVeranstaltung.TextSize = 16";
__ref._tbxveranstaltung /*anywheresoftware.b4a.objects.EditTextWrapper*/ .setTextSize((float) (16));
RDebugUtils.currentLine=7864457;
 //BA.debugLineNum = 7864457;BA.debugLine="Log(\"Typeface\")";
__c.LogImpl("37864457","Typeface",0);
RDebugUtils.currentLine=7864458;
 //BA.debugLineNum = 7864458;BA.debugLine="tbxVeranstaltung.Typeface = Typeface.DEFAULT_BOLD";
__ref._tbxveranstaltung /*anywheresoftware.b4a.objects.EditTextWrapper*/ .setTypeface(__c.Typeface.DEFAULT_BOLD);
RDebugUtils.currentLine=7864459;
 //BA.debugLineNum = 7864459;BA.debugLine="Log(\"TextColor\")";
__c.LogImpl("37864459","TextColor",0);
RDebugUtils.currentLine=7864460;
 //BA.debugLineNum = 7864460;BA.debugLine="tbxVeranstaltung.TextColor = 0xFF16AA16";
__ref._tbxveranstaltung /*anywheresoftware.b4a.objects.EditTextWrapper*/ .setTextColor(((int)0xff16aa16));
RDebugUtils.currentLine=7864461;
 //BA.debugLineNum = 7864461;BA.debugLine="Log(\"SingleLine\")";
__c.LogImpl("37864461","SingleLine",0);
RDebugUtils.currentLine=7864462;
 //BA.debugLineNum = 7864462;BA.debugLine="tbxVeranstaltung.SingleLine = True";
__ref._tbxveranstaltung /*anywheresoftware.b4a.objects.EditTextWrapper*/ .setSingleLine(__c.True);
RDebugUtils.currentLine=7864463;
 //BA.debugLineNum = 7864463;BA.debugLine="tbxVeranstaltung.Initialize(\"tbxVeranstaltung\")";
__ref._tbxveranstaltung /*anywheresoftware.b4a.objects.EditTextWrapper*/ .Initialize(ba,"tbxVeranstaltung");
RDebugUtils.currentLine=7864464;
 //BA.debugLineNum = 7864464;BA.debugLine="Log(\"AddView\")";
__c.LogImpl("37864464","AddView",0);
RDebugUtils.currentLine=7864465;
 //BA.debugLineNum = 7864465;BA.debugLine="pnlVstng.AddView(tbxVeranstaltung, 128dip, 90dip,";
_pnlvstng.AddView((android.view.View)(__ref._tbxveranstaltung /*anywheresoftware.b4a.objects.EditTextWrapper*/ .getObject()),__c.DipToCurrent((int) (128)),__c.DipToCurrent((int) (90)),(int) (__c.PerXToCurrent((float) (100),ba)-__c.DipToCurrent((int) (138))),__c.DipToCurrent((int) (42)));
RDebugUtils.currentLine=7864466;
 //BA.debugLineNum = 7864466;BA.debugLine="Log(\"nach AddView\")";
__c.LogImpl("37864466","nach AddView",0);
RDebugUtils.currentLine=7864469;
 //BA.debugLineNum = 7864469;BA.debugLine="Dim Label9 As Label";
_label9 = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=7864470;
 //BA.debugLineNum = 7864470;BA.debugLine="Label9.Initialize(\"\")";
_label9.Initialize(ba,"");
RDebugUtils.currentLine=7864471;
 //BA.debugLineNum = 7864471;BA.debugLine="Label9.Text = \"Plätze:\"";
_label9.setText(BA.ObjectToCharSequence("Plätze:"));
RDebugUtils.currentLine=7864472;
 //BA.debugLineNum = 7864472;BA.debugLine="Label9.Typeface = Typeface.DEFAULT_BOLD";
_label9.setTypeface(__c.Typeface.DEFAULT_BOLD);
RDebugUtils.currentLine=7864473;
 //BA.debugLineNum = 7864473;BA.debugLine="Label9.TextColor = Colors.Black";
_label9.setTextColor(__c.Colors.Black);
RDebugUtils.currentLine=7864474;
 //BA.debugLineNum = 7864474;BA.debugLine="Label9.Gravity = Gravity.RIGHT + Gravity.CENTER_V";
_label9.setGravity((int) (__c.Gravity.RIGHT+__c.Gravity.CENTER_VERTICAL));
RDebugUtils.currentLine=7864475;
 //BA.debugLineNum = 7864475;BA.debugLine="pnlVstng.AddView(Label9, 5dip, 138dip, 115dip, 42";
_pnlvstng.AddView((android.view.View)(_label9.getObject()),__c.DipToCurrent((int) (5)),__c.DipToCurrent((int) (138)),__c.DipToCurrent((int) (115)),__c.DipToCurrent((int) (42)));
RDebugUtils.currentLine=7864477;
 //BA.debugLineNum = 7864477;BA.debugLine="tbxAnzahl.Initialize(\"tbxAnzahl\")";
__ref._tbxanzahl /*anywheresoftware.b4a.objects.EditTextWrapper*/ .Initialize(ba,"tbxAnzahl");
RDebugUtils.currentLine=7864478;
 //BA.debugLineNum = 7864478;BA.debugLine="tbxAnzahl.TextSize = 16";
__ref._tbxanzahl /*anywheresoftware.b4a.objects.EditTextWrapper*/ .setTextSize((float) (16));
RDebugUtils.currentLine=7864479;
 //BA.debugLineNum = 7864479;BA.debugLine="tbxAnzahl.Typeface = Typeface.DEFAULT_BOLD";
__ref._tbxanzahl /*anywheresoftware.b4a.objects.EditTextWrapper*/ .setTypeface(__c.Typeface.DEFAULT_BOLD);
RDebugUtils.currentLine=7864480;
 //BA.debugLineNum = 7864480;BA.debugLine="tbxAnzahl.TextColor = 0xFF16AA16";
__ref._tbxanzahl /*anywheresoftware.b4a.objects.EditTextWrapper*/ .setTextColor(((int)0xff16aa16));
RDebugUtils.currentLine=7864481;
 //BA.debugLineNum = 7864481;BA.debugLine="tbxAnzahl.Gravity = Gravity.RIGHT + Gravity.CENTE";
__ref._tbxanzahl /*anywheresoftware.b4a.objects.EditTextWrapper*/ .setGravity((int) (__c.Gravity.RIGHT+__c.Gravity.CENTER_VERTICAL));
RDebugUtils.currentLine=7864482;
 //BA.debugLineNum = 7864482;BA.debugLine="tbxAnzahl.InputType = tbxAnzahl.INPUT_TYPE_NUMBER";
__ref._tbxanzahl /*anywheresoftware.b4a.objects.EditTextWrapper*/ .setInputType(__ref._tbxanzahl /*anywheresoftware.b4a.objects.EditTextWrapper*/ .INPUT_TYPE_NUMBERS);
RDebugUtils.currentLine=7864484;
 //BA.debugLineNum = 7864484;BA.debugLine="pnlVstng.AddView(tbxAnzahl, 128dip, 138dip, 100di";
_pnlvstng.AddView((android.view.View)(__ref._tbxanzahl /*anywheresoftware.b4a.objects.EditTextWrapper*/ .getObject()),__c.DipToCurrent((int) (128)),__c.DipToCurrent((int) (138)),__c.DipToCurrent((int) (100)),__c.DipToCurrent((int) (42)));
RDebugUtils.currentLine=7864487;
 //BA.debugLineNum = 7864487;BA.debugLine="btnVerstgDelete.Initialize(\"btnVerstgDelete\")";
__ref._btnverstgdelete /*anywheresoftware.b4a.objects.ButtonWrapper*/ .Initialize(ba,"btnVerstgDelete");
RDebugUtils.currentLine=7864488;
 //BA.debugLineNum = 7864488;BA.debugLine="btnVerstgDelete.Text = \"Löschen\"";
__ref._btnverstgdelete /*anywheresoftware.b4a.objects.ButtonWrapper*/ .setText(BA.ObjectToCharSequence("Löschen"));
RDebugUtils.currentLine=7864489;
 //BA.debugLineNum = 7864489;BA.debugLine="btnVerstgDelete.Typeface = Typeface.DEFAULT_BOLD";
__ref._btnverstgdelete /*anywheresoftware.b4a.objects.ButtonWrapper*/ .setTypeface(__c.Typeface.DEFAULT_BOLD);
RDebugUtils.currentLine=7864490;
 //BA.debugLineNum = 7864490;BA.debugLine="btnVerstgDelete.TextColor = 0xFF16AA16";
__ref._btnverstgdelete /*anywheresoftware.b4a.objects.ButtonWrapper*/ .setTextColor(((int)0xff16aa16));
RDebugUtils.currentLine=7864491;
 //BA.debugLineNum = 7864491;BA.debugLine="pnlVstng.AddView(btnVerstgDelete, 25dip, 184dip,";
_pnlvstng.AddView((android.view.View)(__ref._btnverstgdelete /*anywheresoftware.b4a.objects.ButtonWrapper*/ .getObject()),__c.DipToCurrent((int) (25)),__c.DipToCurrent((int) (184)),__c.DipToCurrent((int) (115)),__c.DipToCurrent((int) (36)));
RDebugUtils.currentLine=7864493;
 //BA.debugLineNum = 7864493;BA.debugLine="btnVerstgSpeichern.Initialize(\"btnVerstgSpeichern";
__ref._btnverstgspeichern /*anywheresoftware.b4a.objects.ButtonWrapper*/ .Initialize(ba,"btnVerstgSpeichern");
RDebugUtils.currentLine=7864494;
 //BA.debugLineNum = 7864494;BA.debugLine="btnVerstgSpeichern.Text = \"Speichern\"";
__ref._btnverstgspeichern /*anywheresoftware.b4a.objects.ButtonWrapper*/ .setText(BA.ObjectToCharSequence("Speichern"));
RDebugUtils.currentLine=7864495;
 //BA.debugLineNum = 7864495;BA.debugLine="btnVerstgSpeichern.Typeface = Typeface.DEFAULT_BO";
__ref._btnverstgspeichern /*anywheresoftware.b4a.objects.ButtonWrapper*/ .setTypeface(__c.Typeface.DEFAULT_BOLD);
RDebugUtils.currentLine=7864496;
 //BA.debugLineNum = 7864496;BA.debugLine="btnVerstgSpeichern.TextColor = 0xFF16AA16";
__ref._btnverstgspeichern /*anywheresoftware.b4a.objects.ButtonWrapper*/ .setTextColor(((int)0xff16aa16));
RDebugUtils.currentLine=7864497;
 //BA.debugLineNum = 7864497;BA.debugLine="pnlVstng.AddView(btnVerstgSpeichern, 100%x - 140d";
_pnlvstng.AddView((android.view.View)(__ref._btnverstgspeichern /*anywheresoftware.b4a.objects.ButtonWrapper*/ .getObject()),(int) (__c.PerXToCurrent((float) (100),ba)-__c.DipToCurrent((int) (140))),__c.DipToCurrent((int) (184)),__c.DipToCurrent((int) (115)),__c.DipToCurrent((int) (36)));
RDebugUtils.currentLine=7864499;
 //BA.debugLineNum = 7864499;BA.debugLine="curY = curY + 225dip";
_cury = (int) (_cury+__c.DipToCurrent((int) (225)));
RDebugUtils.currentLine=7864500;
 //BA.debugLineNum = 7864500;BA.debugLine="AddDivider(pnlContent, curY, 12dip, 0xFFEEFFEE)";
__ref._adddivider /*String*/ (null,_pnlcontent,_cury,__c.DipToCurrent((int) (12)),((int)0xffeeffee));
RDebugUtils.currentLine=7864501;
 //BA.debugLineNum = 7864501;BA.debugLine="curY = curY + 12dip";
_cury = (int) (_cury+__c.DipToCurrent((int) (12)));
RDebugUtils.currentLine=7864508;
 //BA.debugLineNum = 7864508;BA.debugLine="lstVeranstaltungen.Initialize(\"lstVeranstaltungen";
__ref._lstveranstaltungen /*anywheresoftware.b4a.objects.ListViewWrapper*/ .Initialize(ba,"lstVeranstaltungen");
RDebugUtils.currentLine=7864509;
 //BA.debugLineNum = 7864509;BA.debugLine="lstVeranstaltungen.SingleLineLayout.Label.TextCol";
__ref._lstveranstaltungen /*anywheresoftware.b4a.objects.ListViewWrapper*/ .getSingleLineLayout().Label.setTextColor(((int)0xff16aa16));
RDebugUtils.currentLine=7864510;
 //BA.debugLineNum = 7864510;BA.debugLine="lstVeranstaltungen.SingleLineLayout.Label.TextSiz";
__ref._lstveranstaltungen /*anywheresoftware.b4a.objects.ListViewWrapper*/ .getSingleLineLayout().Label.setTextSize((float) (16));
RDebugUtils.currentLine=7864511;
 //BA.debugLineNum = 7864511;BA.debugLine="pnlContent.AddView(lstVeranstaltungen, 0, curY, 1";
_pnlcontent.AddView((android.view.View)(__ref._lstveranstaltungen /*anywheresoftware.b4a.objects.ListViewWrapper*/ .getObject()),(int) (0),_cury,__c.PerXToCurrent((float) (100),ba),__c.DipToCurrent((int) (220)));
RDebugUtils.currentLine=7864512;
 //BA.debugLineNum = 7864512;BA.debugLine="curY = curY + 220dip";
_cury = (int) (_cury+__c.DipToCurrent((int) (220)));
RDebugUtils.currentLine=7864514;
 //BA.debugLineNum = 7864514;BA.debugLine="AddDivider(pnlContent, curY, 12dip, 0xFFEEFFEE)";
__ref._adddivider /*String*/ (null,_pnlcontent,_cury,__c.DipToCurrent((int) (12)),((int)0xffeeffee));
RDebugUtils.currentLine=7864515;
 //BA.debugLineNum = 7864515;BA.debugLine="curY = curY + 12dip";
_cury = (int) (_cury+__c.DipToCurrent((int) (12)));
RDebugUtils.currentLine=7864518;
 //BA.debugLineNum = 7864518;BA.debugLine="Dim pnlTln As Panel";
_pnltln = new anywheresoftware.b4a.objects.PanelWrapper();
RDebugUtils.currentLine=7864519;
 //BA.debugLineNum = 7864519;BA.debugLine="pnlTln.Initialize(\"\")";
_pnltln.Initialize(ba,"");
RDebugUtils.currentLine=7864520;
 //BA.debugLineNum = 7864520;BA.debugLine="pnlTln.Color = 0xDDEEFFEE";
_pnltln.setColor(((int)0xddeeffee));
RDebugUtils.currentLine=7864521;
 //BA.debugLineNum = 7864521;BA.debugLine="pnlContent.AddView(pnlTln, 0, curY, 100%x, 145dip";
_pnlcontent.AddView((android.view.View)(_pnltln.getObject()),(int) (0),_cury,__c.PerXToCurrent((float) (100),ba),__c.DipToCurrent((int) (145)));
RDebugUtils.currentLine=7864523;
 //BA.debugLineNum = 7864523;BA.debugLine="Dim Label2 As Label";
_label2 = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=7864524;
 //BA.debugLineNum = 7864524;BA.debugLine="Label2.Initialize(\"\")";
_label2.Initialize(ba,"");
RDebugUtils.currentLine=7864525;
 //BA.debugLineNum = 7864525;BA.debugLine="Label2.Text = \"Teilnehmer\"";
_label2.setText(BA.ObjectToCharSequence("Teilnehmer"));
RDebugUtils.currentLine=7864526;
 //BA.debugLineNum = 7864526;BA.debugLine="Label2.TextSize = 18";
_label2.setTextSize((float) (18));
RDebugUtils.currentLine=7864527;
 //BA.debugLineNum = 7864527;BA.debugLine="Label2.Typeface = Typeface.DEFAULT_BOLD";
_label2.setTypeface(__c.Typeface.DEFAULT_BOLD);
RDebugUtils.currentLine=7864528;
 //BA.debugLineNum = 7864528;BA.debugLine="Label2.TextColor = 0xFF16AA16";
_label2.setTextColor(((int)0xff16aa16));
RDebugUtils.currentLine=7864529;
 //BA.debugLineNum = 7864529;BA.debugLine="Label2.Gravity = Gravity.CENTER_VERTICAL";
_label2.setGravity(__c.Gravity.CENTER_VERTICAL);
RDebugUtils.currentLine=7864530;
 //BA.debugLineNum = 7864530;BA.debugLine="pnlTln.AddView(Label2, 15dip, 8dip, 110dip, 28dip";
_pnltln.AddView((android.view.View)(_label2.getObject()),__c.DipToCurrent((int) (15)),__c.DipToCurrent((int) (8)),__c.DipToCurrent((int) (110)),__c.DipToCurrent((int) (28)));
RDebugUtils.currentLine=7864532;
 //BA.debugLineNum = 7864532;BA.debugLine="Dim Label15 As Label";
_label15 = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=7864533;
 //BA.debugLineNum = 7864533;BA.debugLine="Label15.Initialize(\"\")";
_label15.Initialize(ba,"");
RDebugUtils.currentLine=7864534;
 //BA.debugLineNum = 7864534;BA.debugLine="Label15.Text = \"(unabhängig von Veranstaltung)\"";
_label15.setText(BA.ObjectToCharSequence("(unabhängig von Veranstaltung)"));
RDebugUtils.currentLine=7864535;
 //BA.debugLineNum = 7864535;BA.debugLine="Label15.TextSize = 10";
_label15.setTextSize((float) (10));
RDebugUtils.currentLine=7864536;
 //BA.debugLineNum = 7864536;BA.debugLine="Label15.TextColor = Colors.DarkGray";
_label15.setTextColor(__c.Colors.DarkGray);
RDebugUtils.currentLine=7864537;
 //BA.debugLineNum = 7864537;BA.debugLine="Label15.Gravity = Gravity.CENTER_VERTICAL";
_label15.setGravity(__c.Gravity.CENTER_VERTICAL);
RDebugUtils.currentLine=7864538;
 //BA.debugLineNum = 7864538;BA.debugLine="pnlTln.AddView(Label15, 125dip, 8dip, 100%x - 135";
_pnltln.AddView((android.view.View)(_label15.getObject()),__c.DipToCurrent((int) (125)),__c.DipToCurrent((int) (8)),(int) (__c.PerXToCurrent((float) (100),ba)-__c.DipToCurrent((int) (135))),__c.DipToCurrent((int) (28)));
RDebugUtils.currentLine=7864540;
 //BA.debugLineNum = 7864540;BA.debugLine="Dim Label14 As Label";
_label14 = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=7864541;
 //BA.debugLineNum = 7864541;BA.debugLine="Label14.Initialize(\"\")";
_label14.Initialize(ba,"");
RDebugUtils.currentLine=7864542;
 //BA.debugLineNum = 7864542;BA.debugLine="Label14.Text = \"Name, Vorname:\"";
_label14.setText(BA.ObjectToCharSequence("Name, Vorname:"));
RDebugUtils.currentLine=7864543;
 //BA.debugLineNum = 7864543;BA.debugLine="Label14.Typeface = Typeface.DEFAULT_BOLD";
_label14.setTypeface(__c.Typeface.DEFAULT_BOLD);
RDebugUtils.currentLine=7864544;
 //BA.debugLineNum = 7864544;BA.debugLine="Label14.TextColor = Colors.Black";
_label14.setTextColor(__c.Colors.Black);
RDebugUtils.currentLine=7864545;
 //BA.debugLineNum = 7864545;BA.debugLine="Label14.Gravity = Gravity.RIGHT + Gravity.CENTER_";
_label14.setGravity((int) (__c.Gravity.RIGHT+__c.Gravity.CENTER_VERTICAL));
RDebugUtils.currentLine=7864546;
 //BA.debugLineNum = 7864546;BA.debugLine="pnlTln.AddView(Label14, 5dip, 44dip, 115dip, 42di";
_pnltln.AddView((android.view.View)(_label14.getObject()),__c.DipToCurrent((int) (5)),__c.DipToCurrent((int) (44)),__c.DipToCurrent((int) (115)),__c.DipToCurrent((int) (42)));
RDebugUtils.currentLine=7864548;
 //BA.debugLineNum = 7864548;BA.debugLine="tbxTeilnehmer.Initialize(\"tbxTeilnehmer\")";
__ref._tbxteilnehmer /*anywheresoftware.b4a.objects.EditTextWrapper*/ .Initialize(ba,"tbxTeilnehmer");
RDebugUtils.currentLine=7864549;
 //BA.debugLineNum = 7864549;BA.debugLine="tbxTeilnehmer.TextSize = 16";
__ref._tbxteilnehmer /*anywheresoftware.b4a.objects.EditTextWrapper*/ .setTextSize((float) (16));
RDebugUtils.currentLine=7864550;
 //BA.debugLineNum = 7864550;BA.debugLine="tbxTeilnehmer.Typeface = Typeface.DEFAULT_BOLD";
__ref._tbxteilnehmer /*anywheresoftware.b4a.objects.EditTextWrapper*/ .setTypeface(__c.Typeface.DEFAULT_BOLD);
RDebugUtils.currentLine=7864551;
 //BA.debugLineNum = 7864551;BA.debugLine="tbxTeilnehmer.TextColor = 0xFF16AA16";
__ref._tbxteilnehmer /*anywheresoftware.b4a.objects.EditTextWrapper*/ .setTextColor(((int)0xff16aa16));
RDebugUtils.currentLine=7864553;
 //BA.debugLineNum = 7864553;BA.debugLine="pnlTln.AddView(tbxTeilnehmer, 128dip, 44dip, 100%";
_pnltln.AddView((android.view.View)(__ref._tbxteilnehmer /*anywheresoftware.b4a.objects.EditTextWrapper*/ .getObject()),__c.DipToCurrent((int) (128)),__c.DipToCurrent((int) (44)),(int) (__c.PerXToCurrent((float) (100),ba)-__c.DipToCurrent((int) (138))),__c.DipToCurrent((int) (42)));
RDebugUtils.currentLine=7864555;
 //BA.debugLineNum = 7864555;BA.debugLine="btnTLNDelete.Initialize(\"btnTLNDelete\")";
__ref._btntlndelete /*anywheresoftware.b4a.objects.ButtonWrapper*/ .Initialize(ba,"btnTLNDelete");
RDebugUtils.currentLine=7864556;
 //BA.debugLineNum = 7864556;BA.debugLine="btnTLNDelete.Text = \"Löschen\"";
__ref._btntlndelete /*anywheresoftware.b4a.objects.ButtonWrapper*/ .setText(BA.ObjectToCharSequence("Löschen"));
RDebugUtils.currentLine=7864557;
 //BA.debugLineNum = 7864557;BA.debugLine="btnTLNDelete.Typeface = Typeface.DEFAULT_BOLD";
__ref._btntlndelete /*anywheresoftware.b4a.objects.ButtonWrapper*/ .setTypeface(__c.Typeface.DEFAULT_BOLD);
RDebugUtils.currentLine=7864558;
 //BA.debugLineNum = 7864558;BA.debugLine="btnTLNDelete.TextColor = 0xFF16AA16";
__ref._btntlndelete /*anywheresoftware.b4a.objects.ButtonWrapper*/ .setTextColor(((int)0xff16aa16));
RDebugUtils.currentLine=7864559;
 //BA.debugLineNum = 7864559;BA.debugLine="pnlTln.AddView(btnTLNDelete, 25dip, 98dip, 115dip";
_pnltln.AddView((android.view.View)(__ref._btntlndelete /*anywheresoftware.b4a.objects.ButtonWrapper*/ .getObject()),__c.DipToCurrent((int) (25)),__c.DipToCurrent((int) (98)),__c.DipToCurrent((int) (115)),__c.DipToCurrent((int) (36)));
RDebugUtils.currentLine=7864561;
 //BA.debugLineNum = 7864561;BA.debugLine="btnTLNSpeichern.Initialize(\"btnTLNSpeichern\")";
__ref._btntlnspeichern /*anywheresoftware.b4a.objects.ButtonWrapper*/ .Initialize(ba,"btnTLNSpeichern");
RDebugUtils.currentLine=7864562;
 //BA.debugLineNum = 7864562;BA.debugLine="btnTLNSpeichern.Text = \"Speichern\"";
__ref._btntlnspeichern /*anywheresoftware.b4a.objects.ButtonWrapper*/ .setText(BA.ObjectToCharSequence("Speichern"));
RDebugUtils.currentLine=7864563;
 //BA.debugLineNum = 7864563;BA.debugLine="btnTLNSpeichern.Typeface = Typeface.DEFAULT_BOLD";
__ref._btntlnspeichern /*anywheresoftware.b4a.objects.ButtonWrapper*/ .setTypeface(__c.Typeface.DEFAULT_BOLD);
RDebugUtils.currentLine=7864564;
 //BA.debugLineNum = 7864564;BA.debugLine="btnTLNSpeichern.TextColor = 0xFF16AA16";
__ref._btntlnspeichern /*anywheresoftware.b4a.objects.ButtonWrapper*/ .setTextColor(((int)0xff16aa16));
RDebugUtils.currentLine=7864565;
 //BA.debugLineNum = 7864565;BA.debugLine="pnlTln.AddView(btnTLNSpeichern, 100%x - 140dip, 9";
_pnltln.AddView((android.view.View)(__ref._btntlnspeichern /*anywheresoftware.b4a.objects.ButtonWrapper*/ .getObject()),(int) (__c.PerXToCurrent((float) (100),ba)-__c.DipToCurrent((int) (140))),__c.DipToCurrent((int) (98)),__c.DipToCurrent((int) (115)),__c.DipToCurrent((int) (36)));
RDebugUtils.currentLine=7864567;
 //BA.debugLineNum = 7864567;BA.debugLine="curY = curY + 145dip";
_cury = (int) (_cury+__c.DipToCurrent((int) (145)));
RDebugUtils.currentLine=7864568;
 //BA.debugLineNum = 7864568;BA.debugLine="AddDivider(pnlContent, curY, 12dip, 0xFFEEFFEE)";
__ref._adddivider /*String*/ (null,_pnlcontent,_cury,__c.DipToCurrent((int) (12)),((int)0xffeeffee));
RDebugUtils.currentLine=7864569;
 //BA.debugLineNum = 7864569;BA.debugLine="curY = curY + 12dip";
_cury = (int) (_cury+__c.DipToCurrent((int) (12)));
RDebugUtils.currentLine=7864576;
 //BA.debugLineNum = 7864576;BA.debugLine="lstTeilnehmer.Initialize(\"lstTeilnehmer\")";
__ref._lstteilnehmer /*anywheresoftware.b4a.objects.ListViewWrapper*/ .Initialize(ba,"lstTeilnehmer");
RDebugUtils.currentLine=7864577;
 //BA.debugLineNum = 7864577;BA.debugLine="lstTeilnehmer.SingleLineLayout.Label.TextColor =";
__ref._lstteilnehmer /*anywheresoftware.b4a.objects.ListViewWrapper*/ .getSingleLineLayout().Label.setTextColor(((int)0xff16aa16));
RDebugUtils.currentLine=7864578;
 //BA.debugLineNum = 7864578;BA.debugLine="lstTeilnehmer.SingleLineLayout.Label.TextSize = 1";
__ref._lstteilnehmer /*anywheresoftware.b4a.objects.ListViewWrapper*/ .getSingleLineLayout().Label.setTextSize((float) (16));
RDebugUtils.currentLine=7864579;
 //BA.debugLineNum = 7864579;BA.debugLine="pnlContent.AddView(lstTeilnehmer, 0, curY, 100%x,";
_pnlcontent.AddView((android.view.View)(__ref._lstteilnehmer /*anywheresoftware.b4a.objects.ListViewWrapper*/ .getObject()),(int) (0),_cury,__c.PerXToCurrent((float) (100),ba),__c.DipToCurrent((int) (260)));
RDebugUtils.currentLine=7864580;
 //BA.debugLineNum = 7864580;BA.debugLine="curY = curY + 270dip";
_cury = (int) (_cury+__c.DipToCurrent((int) (270)));
RDebugUtils.currentLine=7864582;
 //BA.debugLineNum = 7864582;BA.debugLine="pnlContent.Height = curY";
_pnlcontent.setHeight(_cury);
RDebugUtils.currentLine=7864583;
 //BA.debugLineNum = 7864583;BA.debugLine="Log(\"BuildUI Ende\")";
__c.LogImpl("37864583","BuildUI Ende",0);
RDebugUtils.currentLine=7864584;
 //BA.debugLineNum = 7864584;BA.debugLine="dochange = True";
__ref._dochange /*boolean*/  = __c.True;
RDebugUtils.currentLine=7864586;
 //BA.debugLineNum = 7864586;BA.debugLine="End Sub";
return "";
}
public String  _setbuttonimagesafe(b4a.example.settings __ref,anywheresoftware.b4a.objects.ButtonWrapper _btn,String _filename,String _fallbacktext) throws Exception{
__ref = this;
RDebugUtils.currentModule="settings";
if (Debug.shouldDelegate(ba, "setbuttonimagesafe", false))
	 {return ((String) Debug.delegate(ba, "setbuttonimagesafe", new Object[] {_btn,_filename,_fallbacktext}));}
RDebugUtils.currentLine=7995392;
 //BA.debugLineNum = 7995392;BA.debugLine="Private Sub SetButtonImageSafe(btn As Button, file";
RDebugUtils.currentLine=7995393;
 //BA.debugLineNum = 7995393;BA.debugLine="If File.Exists(File.DirAssets, fileName) Then";
if (__c.File.Exists(__c.File.getDirAssets(),_filename)) { 
RDebugUtils.currentLine=7995394;
 //BA.debugLineNum = 7995394;BA.debugLine="btn.SetBackgroundImage(LoadBitmap(File.DirAssets";
_btn.SetBackgroundImageNew((android.graphics.Bitmap)(__c.LoadBitmap(__c.File.getDirAssets(),_filename).getObject()));
 }else {
RDebugUtils.currentLine=7995396;
 //BA.debugLineNum = 7995396;BA.debugLine="btn.Text = fallbackText";
_btn.setText(BA.ObjectToCharSequence(_fallbacktext));
 };
RDebugUtils.currentLine=7995398;
 //BA.debugLineNum = 7995398;BA.debugLine="End Sub";
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
 //BA.debugLineNum = 7471141;BA.debugLine="Private lstVeranstaltungen As ListView";
_lstveranstaltungen = new anywheresoftware.b4a.objects.ListViewWrapper();
RDebugUtils.currentLine=7471142;
 //BA.debugLineNum = 7471142;BA.debugLine="Private lstTeilnehmer As ListView";
_lstteilnehmer = new anywheresoftware.b4a.objects.ListViewWrapper();
RDebugUtils.currentLine=7471144;
 //BA.debugLineNum = 7471144;BA.debugLine="Private tbxTeilnehmer As EditText";
_tbxteilnehmer = new anywheresoftware.b4a.objects.EditTextWrapper();
RDebugUtils.currentLine=7471145;
 //BA.debugLineNum = 7471145;BA.debugLine="Private btnTLNDelete As Button";
_btntlndelete = new anywheresoftware.b4a.objects.ButtonWrapper();
RDebugUtils.currentLine=7471146;
 //BA.debugLineNum = 7471146;BA.debugLine="Private btnTLNSpeichern As Button";
_btntlnspeichern = new anywheresoftware.b4a.objects.ButtonWrapper();
RDebugUtils.currentLine=7471149;
 //BA.debugLineNum = 7471149;BA.debugLine="Private Uhrzeit As Timer";
_uhrzeit = new anywheresoftware.b4a.objects.Timer();
RDebugUtils.currentLine=7471150;
 //BA.debugLineNum = 7471150;BA.debugLine="Private DBVerein As Map";
_dbverein = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=7471151;
 //BA.debugLineNum = 7471151;BA.debugLine="Private DBFileName As String = \"DBVerein.dat\"";
_dbfilename = "DBVerein.dat";
RDebugUtils.currentLine=7471152;
 //BA.debugLineNum = 7471152;BA.debugLine="Private CurrentWebUrl As String = \"\"";
_currentweburl = "";
RDebugUtils.currentLine=7471153;
 //BA.debugLineNum = 7471153;BA.debugLine="Private dprYear As Int";
_dpryear = 0;
RDebugUtils.currentLine=7471154;
 //BA.debugLineNum = 7471154;BA.debugLine="Private dprMonth As Int";
_dprmonth = 0;
RDebugUtils.currentLine=7471155;
 //BA.debugLineNum = 7471155;BA.debugLine="Private dprDay As Int";
_dprday = 0;
RDebugUtils.currentLine=7471156;
 //BA.debugLineNum = 7471156;BA.debugLine="End Sub";
return "";
}
public String  _clvteilnehmer_itemclick(b4a.example.settings __ref,int _index,Object _value) throws Exception{
__ref = this;
RDebugUtils.currentModule="settings";
if (Debug.shouldDelegate(ba, "clvteilnehmer_itemclick", false))
	 {return ((String) Debug.delegate(ba, "clvteilnehmer_itemclick", new Object[] {_index,_value}));}
RDebugUtils.currentLine=11141120;
 //BA.debugLineNum = 11141120;BA.debugLine="Private Sub CLVTeilnehmer_ItemClick(Index As Int,";
RDebugUtils.currentLine=11141122;
 //BA.debugLineNum = 11141122;BA.debugLine="TLNid = Value";
__ref._tlnid /*String*/  = BA.ObjectToString(_value);
RDebugUtils.currentLine=11141123;
 //BA.debugLineNum = 11141123;BA.debugLine="setzeTeilnehmer(TLNid)";
__ref._setzeteilnehmer /*String*/ (null,__ref._tlnid /*String*/ );
RDebugUtils.currentLine=11141125;
 //BA.debugLineNum = 11141125;BA.debugLine="End Sub";
return "";
}
public String  _setzeteilnehmer(b4a.example.settings __ref,String _tid) throws Exception{
__ref = this;
RDebugUtils.currentModule="settings";
if (Debug.shouldDelegate(ba, "setzeteilnehmer", false))
	 {return ((String) Debug.delegate(ba, "setzeteilnehmer", new Object[] {_tid}));}
int _idx = 0;
RDebugUtils.currentLine=9175040;
 //BA.debugLineNum = 9175040;BA.debugLine="Private Sub setzeTeilnehmer(tid As String)";
RDebugUtils.currentLine=9175041;
 //BA.debugLineNum = 9175041;BA.debugLine="disableTLN";
__ref._disabletln /*String*/ (null);
RDebugUtils.currentLine=9175042;
 //BA.debugLineNum = 9175042;BA.debugLine="If tid = \"t0\" Then";
if ((_tid).equals("t0")) { 
RDebugUtils.currentLine=9175043;
 //BA.debugLineNum = 9175043;BA.debugLine="dochange = False";
__ref._dochange /*boolean*/  = __c.False;
RDebugUtils.currentLine=9175044;
 //BA.debugLineNum = 9175044;BA.debugLine="tbxTeilnehmer.Text = \"\"";
__ref._tbxteilnehmer /*anywheresoftware.b4a.objects.EditTextWrapper*/ .setText(BA.ObjectToCharSequence(""));
RDebugUtils.currentLine=9175045;
 //BA.debugLineNum = 9175045;BA.debugLine="dochange = True";
__ref._dochange /*boolean*/  = __c.True;
RDebugUtils.currentLine=9175046;
 //BA.debugLineNum = 9175046;BA.debugLine="enableTLN";
__ref._enabletln /*String*/ (null);
RDebugUtils.currentLine=9175047;
 //BA.debugLineNum = 9175047;BA.debugLine="btnTLNDelete.TextColor = 0xFF888888";
__ref._btntlndelete /*anywheresoftware.b4a.objects.ButtonWrapper*/ .setTextColor(((int)0xff888888));
RDebugUtils.currentLine=9175048;
 //BA.debugLineNum = 9175048;BA.debugLine="btnTLNDelete.Enabled = False";
__ref._btntlndelete /*anywheresoftware.b4a.objects.ButtonWrapper*/ .setEnabled(__c.False);
 }else {
RDebugUtils.currentLine=9175050;
 //BA.debugLineNum = 9175050;BA.debugLine="If Teilnehmer.Size > 0 Then";
if (__ref._teilnehmer /*anywheresoftware.b4a.objects.collections.List*/ .getSize()>0) { 
RDebugUtils.currentLine=9175051;
 //BA.debugLineNum = 9175051;BA.debugLine="Dim idx As Int = Teilnehmer.IndexOf(tid)";
_idx = __ref._teilnehmer /*anywheresoftware.b4a.objects.collections.List*/ .IndexOf((Object)(_tid));
RDebugUtils.currentLine=9175052;
 //BA.debugLineNum = 9175052;BA.debugLine="If idx > 0 Then";
if (_idx>0) { 
RDebugUtils.currentLine=9175053;
 //BA.debugLineNum = 9175053;BA.debugLine="dochange = False";
__ref._dochange /*boolean*/  = __c.False;
RDebugUtils.currentLine=9175054;
 //BA.debugLineNum = 9175054;BA.debugLine="tbxTeilnehmer.Text = Teilnehmer.Get(idx - 1)";
__ref._tbxteilnehmer /*anywheresoftware.b4a.objects.EditTextWrapper*/ .setText(BA.ObjectToCharSequence(__ref._teilnehmer /*anywheresoftware.b4a.objects.collections.List*/ .Get((int) (_idx-1))));
RDebugUtils.currentLine=9175055;
 //BA.debugLineNum = 9175055;BA.debugLine="dochange = True";
__ref._dochange /*boolean*/  = __c.True;
RDebugUtils.currentLine=9175056;
 //BA.debugLineNum = 9175056;BA.debugLine="enableTLN";
__ref._enabletln /*String*/ (null);
 };
 };
 };
RDebugUtils.currentLine=9175060;
 //BA.debugLineNum = 9175060;BA.debugLine="If tbxTeilnehmer.Enabled Then";
if (__ref._tbxteilnehmer /*anywheresoftware.b4a.objects.EditTextWrapper*/ .getEnabled()) { 
RDebugUtils.currentLine=9175061;
 //BA.debugLineNum = 9175061;BA.debugLine="tbxTeilnehmer.RequestFocus";
__ref._tbxteilnehmer /*anywheresoftware.b4a.objects.EditTextWrapper*/ .RequestFocus();
 };
RDebugUtils.currentLine=9175063;
 //BA.debugLineNum = 9175063;BA.debugLine="End Sub";
return "";
}
public String  _clvveranstaltungen_itemclick(b4a.example.settings __ref,int _index,Object _value) throws Exception{
__ref = this;
RDebugUtils.currentModule="settings";
if (Debug.shouldDelegate(ba, "clvveranstaltungen_itemclick", false))
	 {return ((String) Debug.delegate(ba, "clvveranstaltungen_itemclick", new Object[] {_index,_value}));}
RDebugUtils.currentLine=11010048;
 //BA.debugLineNum = 11010048;BA.debugLine="Private Sub CLVVeranstaltungen_ItemClick(Index As";
RDebugUtils.currentLine=11010050;
 //BA.debugLineNum = 11010050;BA.debugLine="webviewVSTGN_ID = Value";
__ref._webviewvstgn_id /*String*/  = BA.ObjectToString(_value);
RDebugUtils.currentLine=11010051;
 //BA.debugLineNum = 11010051;BA.debugLine="setzeVeranstaltung(webviewVSTGN_ID)";
__ref._setzeveranstaltung /*String*/ (null,__ref._webviewvstgn_id /*String*/ );
RDebugUtils.currentLine=11010053;
 //BA.debugLineNum = 11010053;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=8585216;
 //BA.debugLineNum = 8585216;BA.debugLine="Private Sub setzeVeranstaltung(vid As String)";
RDebugUtils.currentLine=8585217;
 //BA.debugLineNum = 8585217;BA.debugLine="disableVSTNG";
__ref._disablevstng /*String*/ (null);
RDebugUtils.currentLine=8585218;
 //BA.debugLineNum = 8585218;BA.debugLine="Dim veranstaltung As Map";
_veranstaltung = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=8585219;
 //BA.debugLineNum = 8585219;BA.debugLine="If Veranstaltungen.IsInitialized And Veranstaltun";
if (__ref._veranstaltungen /*anywheresoftware.b4a.objects.collections.Map*/ .IsInitialized() && __ref._veranstaltungen /*anywheresoftware.b4a.objects.collections.Map*/ .ContainsKey((Object)(_vid))) { 
RDebugUtils.currentLine=8585220;
 //BA.debugLineNum = 8585220;BA.debugLine="veranstaltung = Veranstaltungen.Get(vid)";
_veranstaltung = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(__ref._veranstaltungen /*anywheresoftware.b4a.objects.collections.Map*/ .Get((Object)(_vid))));
 }else {
RDebugUtils.currentLine=8585222;
 //BA.debugLineNum = 8585222;BA.debugLine="veranstaltung.Initialize";
_veranstaltung.Initialize();
 };
RDebugUtils.currentLine=8585225;
 //BA.debugLineNum = 8585225;BA.debugLine="Dim datum As String = veranstaltung.GetDefault(\"D";
_datum = BA.ObjectToString(_veranstaltung.GetDefault((Object)("Datum"),(Object)(__ref._formatdatecustom /*String*/ (null,__c.DateTime.getNow(),"dd.MM.yyyy"))));
RDebugUtils.currentLine=8585226;
 //BA.debugLineNum = 8585226;BA.debugLine="Dim datum_spl() As String = Regex.Split(\"\\.\", dat";
_datum_spl = __c.Regex.Split("\\.",_datum);
RDebugUtils.currentLine=8585227;
 //BA.debugLineNum = 8585227;BA.debugLine="If datum_spl.Length >= 3 Then";
if (_datum_spl.length>=3) { 
RDebugUtils.currentLine=8585228;
 //BA.debugLineNum = 8585228;BA.debugLine="dprYear = datum_spl(2)";
__ref._dpryear /*int*/  = (int)(Double.parseDouble(_datum_spl[(int) (2)]));
RDebugUtils.currentLine=8585229;
 //BA.debugLineNum = 8585229;BA.debugLine="dprMonth = datum_spl(1)";
__ref._dprmonth /*int*/  = (int)(Double.parseDouble(_datum_spl[(int) (1)]));
RDebugUtils.currentLine=8585230;
 //BA.debugLineNum = 8585230;BA.debugLine="dprDay = datum_spl(0)";
__ref._dprday /*int*/  = (int)(Double.parseDouble(_datum_spl[(int) (0)]));
 };
RDebugUtils.currentLine=8585233;
 //BA.debugLineNum = 8585233;BA.debugLine="dprDatum.Text = datum";
__ref._dprdatum /*anywheresoftware.b4a.objects.ButtonWrapper*/ .setText(BA.ObjectToCharSequence(_datum));
RDebugUtils.currentLine=8585238;
 //BA.debugLineNum = 8585238;BA.debugLine="tbxAnzahl.Text = veranstaltung.GetDefault(\"Teilne";
__ref._tbxanzahl /*anywheresoftware.b4a.objects.EditTextWrapper*/ .setText(BA.ObjectToCharSequence(_veranstaltung.GetDefault((Object)("Teilnehmerzahl"),(Object)("0"))));
RDebugUtils.currentLine=8585240;
 //BA.debugLineNum = 8585240;BA.debugLine="If \"offen\" = veranstaltung.GetDefault(\"Status\", \"";
if (("offen").equals(BA.ObjectToString(_veranstaltung.GetDefault((Object)("Status"),(Object)("offen"))))) { 
RDebugUtils.currentLine=8585241;
 //BA.debugLineNum = 8585241;BA.debugLine="dprDatum.Enabled = True";
__ref._dprdatum /*anywheresoftware.b4a.objects.ButtonWrapper*/ .setEnabled(__c.True);
RDebugUtils.currentLine=8585242;
 //BA.debugLineNum = 8585242;BA.debugLine="dprDatum.TextColor = colorgreen";
__ref._dprdatum /*anywheresoftware.b4a.objects.ButtonWrapper*/ .setTextColor(__ref._colorgreen /*int*/ );
RDebugUtils.currentLine=8585243;
 //BA.debugLineNum = 8585243;BA.debugLine="tbxVeranstaltung.Enabled = True";
__ref._tbxveranstaltung /*anywheresoftware.b4a.objects.EditTextWrapper*/ .setEnabled(__c.True);
RDebugUtils.currentLine=8585244;
 //BA.debugLineNum = 8585244;BA.debugLine="tbxAnzahl.Enabled = True";
__ref._tbxanzahl /*anywheresoftware.b4a.objects.EditTextWrapper*/ .setEnabled(__c.True);
RDebugUtils.currentLine=8585245;
 //BA.debugLineNum = 8585245;BA.debugLine="lblClosed.Visible = False";
__ref._lblclosed /*anywheresoftware.b4a.objects.LabelWrapper*/ .setVisible(__c.False);
 }else {
RDebugUtils.currentLine=8585247;
 //BA.debugLineNum = 8585247;BA.debugLine="lblClosed.Visible = True";
__ref._lblclosed /*anywheresoftware.b4a.objects.LabelWrapper*/ .setVisible(__c.True);
 };
RDebugUtils.currentLine=8585250;
 //BA.debugLineNum = 8585250;BA.debugLine="btnVerstgDelete.Enabled = True";
__ref._btnverstgdelete /*anywheresoftware.b4a.objects.ButtonWrapper*/ .setEnabled(__c.True);
RDebugUtils.currentLine=8585251;
 //BA.debugLineNum = 8585251;BA.debugLine="btnVerstgDelete.TextColor = colorgreen";
__ref._btnverstgdelete /*anywheresoftware.b4a.objects.ButtonWrapper*/ .setTextColor(__ref._colorgreen /*int*/ );
RDebugUtils.currentLine=8585253;
 //BA.debugLineNum = 8585253;BA.debugLine="If vid <> \"v0\" Then";
if ((_vid).equals("v0") == false) { 
RDebugUtils.currentLine=8585254;
 //BA.debugLineNum = 8585254;BA.debugLine="btnAuswahl.TextColor = colorblue";
__ref._btnauswahl /*anywheresoftware.b4a.objects.ButtonWrapper*/ .setTextColor(__ref._colorblue /*int*/ );
RDebugUtils.currentLine=8585255;
 //BA.debugLineNum = 8585255;BA.debugLine="btnAuswahl.Enabled = True";
__ref._btnauswahl /*anywheresoftware.b4a.objects.ButtonWrapper*/ .setEnabled(__c.True);
 };
RDebugUtils.currentLine=8585257;
 //BA.debugLineNum = 8585257;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=9699328;
 //BA.debugLineNum = 9699328;BA.debugLine="Private Sub DateUtils_SetDate(Year As Int, Month A";
RDebugUtils.currentLine=9699329;
 //BA.debugLineNum = 9699329;BA.debugLine="Dim oldFormat As String = DateTime.DateFormat";
_oldformat = __c.DateTime.getDateFormat();
RDebugUtils.currentLine=9699330;
 //BA.debugLineNum = 9699330;BA.debugLine="DateTime.DateFormat = \"yyyy-MM-dd\"";
__c.DateTime.setDateFormat("yyyy-MM-dd");
RDebugUtils.currentLine=9699331;
 //BA.debugLineNum = 9699331;BA.debugLine="Dim paddedMonth As String = NumberFormat(Month, 2";
_paddedmonth = __c.NumberFormat(_month,(int) (2),(int) (0));
RDebugUtils.currentLine=9699332;
 //BA.debugLineNum = 9699332;BA.debugLine="Dim paddedDay As String = NumberFormat(Day, 2, 0)";
_paddedday = __c.NumberFormat(_day,(int) (2),(int) (0));
RDebugUtils.currentLine=9699333;
 //BA.debugLineNum = 9699333;BA.debugLine="Dim ticks As Long = DateTime.DateParse(Year & \"-\"";
_ticks = __c.DateTime.DateParse(BA.NumberToString(_year)+"-"+_paddedmonth+"-"+_paddedday);
RDebugUtils.currentLine=9699334;
 //BA.debugLineNum = 9699334;BA.debugLine="DateTime.DateFormat = oldFormat";
__c.DateTime.setDateFormat(_oldformat);
RDebugUtils.currentLine=9699335;
 //BA.debugLineNum = 9699335;BA.debugLine="Return ticks";
if (true) return _ticks;
RDebugUtils.currentLine=9699336;
 //BA.debugLineNum = 9699336;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=9371649;
 //BA.debugLineNum = 9371649;BA.debugLine="Dim typ As String = DBdatenTyp";
_typ = __ref._dbdatentyp /*String*/ ;
RDebugUtils.currentLine=9371650;
 //BA.debugLineNum = 9371650;BA.debugLine="Dim j As HttpJob";
_j = new b4a.example.httpjob();
RDebugUtils.currentLine=9371651;
 //BA.debugLineNum = 9371651;BA.debugLine="j.Initialize(typ, Me)";
_j._initialize /*String*/ (null,ba,_typ,parent);
RDebugUtils.currentLine=9371653;
 //BA.debugLineNum = 9371653;BA.debugLine="Select method";
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
RDebugUtils.currentLine=9371655;
 //BA.debugLineNum = 9371655;BA.debugLine="j.Download(url)";
_j._download /*String*/ (null,_url);
 if (true) break;

case 5:
//C
this.state = 8;
RDebugUtils.currentLine=9371657;
 //BA.debugLineNum = 9371657;BA.debugLine="j.PutString(url, payload)";
_j._putstring /*String*/ (null,_url,_payload);
RDebugUtils.currentLine=9371658;
 //BA.debugLineNum = 9371658;BA.debugLine="j.GetRequest.SetContentType(\"application/json\")";
_j._getrequest /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ (null).SetContentType("application/json");
 if (true) break;

case 7:
//C
this.state = 8;
RDebugUtils.currentLine=9371660;
 //BA.debugLineNum = 9371660;BA.debugLine="j.Delete(url)";
_j._delete /*String*/ (null,_url);
 if (true) break;

case 8:
//C
this.state = 9;
;
RDebugUtils.currentLine=9371663;
 //BA.debugLineNum = 9371663;BA.debugLine="Wait For (j) JobDone(j As HttpJob)";
parent.__c.WaitFor("jobdone", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "settings", "executehttp"), (Object)(_j));
this.state = 21;
return;
case 21:
//C
this.state = 9;
_j = (b4a.example.httpjob) result[1];
;
RDebugUtils.currentLine=9371665;
 //BA.debugLineNum = 9371665;BA.debugLine="If j.Success Then";
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
RDebugUtils.currentLine=9371666;
 //BA.debugLineNum = 9371666;BA.debugLine="HandleGotText(typ, url, j.GetString)";
__ref._handlegottext /*String*/ (null,_typ,_url,_j._getstring /*String*/ (null));
 if (true) break;

case 13:
//C
this.state = 14;
RDebugUtils.currentLine=9371668;
 //BA.debugLineNum = 9371668;BA.debugLine="If j.ErrorMessage.ToLowerCase.Contains(\"unable t";
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
RDebugUtils.currentLine=9371669;
 //BA.debugLineNum = 9371669;BA.debugLine="setzeOffline";
__ref._setzeoffline /*void*/ (null);
 if (true) break;

case 18:
//C
this.state = 19;
RDebugUtils.currentLine=9371671;
 //BA.debugLineNum = 9371671;BA.debugLine="ToastMessageShow(\"Fehler: \" & j.ErrorMessage, T";
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
RDebugUtils.currentLine=9371674;
 //BA.debugLineNum = 9371674;BA.debugLine="j.Release";
_j._release /*String*/ (null);
RDebugUtils.currentLine=9371675;
 //BA.debugLineNum = 9371675;BA.debugLine="startTimer";
__ref._starttimer /*String*/ (null);
RDebugUtils.currentLine=9371676;
 //BA.debugLineNum = 9371676;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=8257536;
 //BA.debugLineNum = 8257536;BA.debugLine="Private Sub enableTLN";
RDebugUtils.currentLine=8257537;
 //BA.debugLineNum = 8257537;BA.debugLine="btnTLNDelete.Enabled = True";
__ref._btntlndelete /*anywheresoftware.b4a.objects.ButtonWrapper*/ .setEnabled(__c.True);
RDebugUtils.currentLine=8257538;
 //BA.debugLineNum = 8257538;BA.debugLine="btnTLNSpeichern.Enabled = False";
__ref._btntlnspeichern /*anywheresoftware.b4a.objects.ButtonWrapper*/ .setEnabled(__c.False);
RDebugUtils.currentLine=8257539;
 //BA.debugLineNum = 8257539;BA.debugLine="tbxTeilnehmer.Enabled = True";
__ref._tbxteilnehmer /*anywheresoftware.b4a.objects.EditTextWrapper*/ .setEnabled(__c.True);
RDebugUtils.currentLine=8257540;
 //BA.debugLineNum = 8257540;BA.debugLine="btnTLNDelete.TextColor = colorgreen";
__ref._btntlndelete /*anywheresoftware.b4a.objects.ButtonWrapper*/ .setTextColor(__ref._colorgreen /*int*/ );
RDebugUtils.currentLine=8257541;
 //BA.debugLineNum = 8257541;BA.debugLine="btnTLNSpeichern.TextColor = 0xFF888888";
__ref._btntlnspeichern /*anywheresoftware.b4a.objects.ButtonWrapper*/ .setTextColor(((int)0xff888888));
RDebugUtils.currentLine=8257542;
 //BA.debugLineNum = 8257542;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=8912896;
 //BA.debugLineNum = 8912896;BA.debugLine="Private Sub delVeranstaltung(vid As String)";
RDebugUtils.currentLine=8912897;
 //BA.debugLineNum = 8912897;BA.debugLine="disableVSTNG";
__ref._disablevstng /*String*/ (null);
RDebugUtils.currentLine=8912898;
 //BA.debugLineNum = 8912898;BA.debugLine="If Veranstaltungen.IsInitialized And Veranstaltun";
if (__ref._veranstaltungen /*anywheresoftware.b4a.objects.collections.Map*/ .IsInitialized() && __ref._veranstaltungen /*anywheresoftware.b4a.objects.collections.Map*/ .ContainsKey((Object)(_vid))) { 
RDebugUtils.currentLine=8912899;
 //BA.debugLineNum = 8912899;BA.debugLine="Dim veranstaltung As Map = Veranstaltungen.Get(v";
_veranstaltung = new anywheresoftware.b4a.objects.collections.Map();
_veranstaltung = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(__ref._veranstaltungen /*anywheresoftware.b4a.objects.collections.Map*/ .Get((Object)(_vid))));
RDebugUtils.currentLine=8912900;
 //BA.debugLineNum = 8912900;BA.debugLine="Dim vName As String = veranstaltung.GetDefault(\"";
_vname = BA.ObjectToString(_veranstaltung.GetDefault((Object)("Name"),(Object)(" unbenannt ")));
RDebugUtils.currentLine=8912901;
 //BA.debugLineNum = 8912901;BA.debugLine="Dim vDatum As String = veranstaltung.GetDefault(";
_vdatum = BA.ObjectToString(_veranstaltung.GetDefault((Object)("Datum"),(Object)(__ref._formatdatecustom /*String*/ (null,__c.DateTime.getNow(),"dd.MM.yyyy"))));
RDebugUtils.currentLine=8912902;
 //BA.debugLineNum = 8912902;BA.debugLine="ToastMessageShow(\"Die Veranstaltung \" & vName &";
__c.ToastMessageShow(BA.ObjectToCharSequence("Die Veranstaltung "+_vname+" vom "+_vdatum+" wird gelöscht!"),__c.False);
RDebugUtils.currentLine=8912904;
 //BA.debugLineNum = 8912904;BA.debugLine="DBdatenTyp = \"delVeranstaltung\"";
__ref._dbdatentyp /*String*/  = "delVeranstaltung";
RDebugUtils.currentLine=8912905;
 //BA.debugLineNum = 8912905;BA.debugLine="CurrentWebUrl = URLveranstaltungen & \"/\" & vid &";
__ref._currentweburl /*String*/  = __ref._urlveranstaltungen /*String*/ +"/"+_vid+".json?auth="+BA.ObjectToString(__ref._status /*anywheresoftware.b4a.objects.collections.Map*/ .GetDefault((Object)("idToken"),(Object)("")));
RDebugUtils.currentLine=8912906;
 //BA.debugLineNum = 8912906;BA.debugLine="ExecuteHttp(\"DELETE\", CurrentWebUrl, \"\")";
__ref._executehttp /*void*/ (null,"DELETE",__ref._currentweburl /*String*/ ,"");
 };
RDebugUtils.currentLine=8912908;
 //BA.debugLineNum = 8912908;BA.debugLine="enableVSTNG";
__ref._enablevstng /*String*/ (null);
RDebugUtils.currentLine=8912909;
 //BA.debugLineNum = 8912909;BA.debugLine="End Sub";
return "";
}
public String  _formatdatecustom(b4a.example.settings __ref,long _ticks,String _pattern) throws Exception{
__ref = this;
RDebugUtils.currentModule="settings";
if (Debug.shouldDelegate(ba, "formatdatecustom", false))
	 {return ((String) Debug.delegate(ba, "formatdatecustom", new Object[] {_ticks,_pattern}));}
String _oldformat = "";
String _res = "";
RDebugUtils.currentLine=10616832;
 //BA.debugLineNum = 10616832;BA.debugLine="Private Sub FormatDateCustom(ticks As Long, patter";
RDebugUtils.currentLine=10616833;
 //BA.debugLineNum = 10616833;BA.debugLine="Dim oldFormat As String = DateTime.DateFormat";
_oldformat = __c.DateTime.getDateFormat();
RDebugUtils.currentLine=10616834;
 //BA.debugLineNum = 10616834;BA.debugLine="DateTime.DateFormat = pattern";
__c.DateTime.setDateFormat(_pattern);
RDebugUtils.currentLine=10616835;
 //BA.debugLineNum = 10616835;BA.debugLine="Dim res As String = DateTime.Date(ticks)";
_res = __c.DateTime.Date(_ticks);
RDebugUtils.currentLine=10616836;
 //BA.debugLineNum = 10616836;BA.debugLine="DateTime.DateFormat = oldFormat";
__c.DateTime.setDateFormat(_oldformat);
RDebugUtils.currentLine=10616837;
 //BA.debugLineNum = 10616837;BA.debugLine="Return res";
if (true) return _res;
RDebugUtils.currentLine=10616838;
 //BA.debugLineNum = 10616838;BA.debugLine="End Sub";
return "";
}
public String  _enablevstng(b4a.example.settings __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="settings";
if (Debug.shouldDelegate(ba, "enablevstng", false))
	 {return ((String) Debug.delegate(ba, "enablevstng", null));}
RDebugUtils.currentLine=8126464;
 //BA.debugLineNum = 8126464;BA.debugLine="Private Sub enableVSTNG";
RDebugUtils.currentLine=8126465;
 //BA.debugLineNum = 8126465;BA.debugLine="dprDatum.Enabled = True";
__ref._dprdatum /*anywheresoftware.b4a.objects.ButtonWrapper*/ .setEnabled(__c.True);
RDebugUtils.currentLine=8126466;
 //BA.debugLineNum = 8126466;BA.debugLine="dprDatum.TextColor = colorgreen";
__ref._dprdatum /*anywheresoftware.b4a.objects.ButtonWrapper*/ .setTextColor(__ref._colorgreen /*int*/ );
RDebugUtils.currentLine=8126467;
 //BA.debugLineNum = 8126467;BA.debugLine="btnVerstgDelete.Enabled = True";
__ref._btnverstgdelete /*anywheresoftware.b4a.objects.ButtonWrapper*/ .setEnabled(__c.True);
RDebugUtils.currentLine=8126468;
 //BA.debugLineNum = 8126468;BA.debugLine="btnVerstgDelete.TextColor = colorgreen";
__ref._btnverstgdelete /*anywheresoftware.b4a.objects.ButtonWrapper*/ .setTextColor(__ref._colorgreen /*int*/ );
RDebugUtils.currentLine=8126469;
 //BA.debugLineNum = 8126469;BA.debugLine="btnVerstgSpeichern.Enabled = False";
__ref._btnverstgspeichern /*anywheresoftware.b4a.objects.ButtonWrapper*/ .setEnabled(__c.False);
RDebugUtils.currentLine=8126470;
 //BA.debugLineNum = 8126470;BA.debugLine="btnVerstgSpeichern.TextColor = 0xFF888888";
__ref._btnverstgspeichern /*anywheresoftware.b4a.objects.ButtonWrapper*/ .setTextColor(((int)0xff888888));
RDebugUtils.currentLine=8126471;
 //BA.debugLineNum = 8126471;BA.debugLine="tbxVeranstaltung.Enabled = True";
__ref._tbxveranstaltung /*anywheresoftware.b4a.objects.EditTextWrapper*/ .setEnabled(__c.True);
RDebugUtils.currentLine=8126472;
 //BA.debugLineNum = 8126472;BA.debugLine="tbxAnzahl.Enabled = True";
__ref._tbxanzahl /*anywheresoftware.b4a.objects.EditTextWrapper*/ .setEnabled(__c.True);
RDebugUtils.currentLine=8126473;
 //BA.debugLineNum = 8126473;BA.debugLine="btnAuswahl.Enabled = False";
__ref._btnauswahl /*anywheresoftware.b4a.objects.ButtonWrapper*/ .setEnabled(__c.False);
RDebugUtils.currentLine=8126474;
 //BA.debugLineNum = 8126474;BA.debugLine="btnAuswahl.TextColor = 0xFF888888";
__ref._btnauswahl /*anywheresoftware.b4a.objects.ButtonWrapper*/ .setTextColor(((int)0xff888888));
RDebugUtils.currentLine=8126475;
 //BA.debugLineNum = 8126475;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=9633793;
 //BA.debugLineNum = 9633793;BA.debugLine="Dim ctxt As JavaObject";
_ctxt = new anywheresoftware.b4j.object.JavaObject();
RDebugUtils.currentLine=9633794;
 //BA.debugLineNum = 9633794;BA.debugLine="ctxt.InitializeContext";
_ctxt.InitializeContext(ba);
RDebugUtils.currentLine=9633796;
 //BA.debugLineNum = 9633796;BA.debugLine="Dim listener As Object = ctxt.CreateEventFromUI(\"";
_listener = _ctxt.CreateEventFromUI(ba,"android.app.DatePickerDialog$OnDateSetListener","DateSet",parent.__c.Null);
RDebugUtils.currentLine=9633797;
 //BA.debugLineNum = 9633797;BA.debugLine="Dim dlg As JavaObject";
_dlg = new anywheresoftware.b4j.object.JavaObject();
RDebugUtils.currentLine=9633798;
 //BA.debugLineNum = 9633798;BA.debugLine="dlg.InitializeNewInstance(\"android.app.DatePicker";
_dlg.InitializeNewInstance("android.app.DatePickerDialog",new Object[]{(Object)(_ctxt.getObject()),_listener,(Object)(__ref._dpryear /*int*/ ),(Object)(__ref._dprmonth /*int*/ -1),(Object)(__ref._dprday /*int*/ )});
RDebugUtils.currentLine=9633799;
 //BA.debugLineNum = 9633799;BA.debugLine="dlg.RunMethod(\"show\", Null)";
_dlg.RunMethod("show",(Object[])(parent.__c.Null));
RDebugUtils.currentLine=9633801;
 //BA.debugLineNum = 9633801;BA.debugLine="Wait For DateSet_Event (MethodName As String, Arg";
parent.__c.WaitFor("dateset_event", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "settings", "dprdatum_click"), null);
this.state = 28;
return;
case 28:
//C
this.state = 1;
_methodname = (String) result[1];
_args = (Object[]) result[2];
;
RDebugUtils.currentLine=9633802;
 //BA.debugLineNum = 9633802;BA.debugLine="If Args.Length >= 4 Then";
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
RDebugUtils.currentLine=9633803;
 //BA.debugLineNum = 9633803;BA.debugLine="dprYear = Args(1)";
__ref._dpryear /*int*/  = (int)(BA.ObjectToNumber(_args[(int) (1)]));
RDebugUtils.currentLine=9633804;
 //BA.debugLineNum = 9633804;BA.debugLine="Dim mZeroBased As Int = Args(2)";
_mzerobased = (int)(BA.ObjectToNumber(_args[(int) (2)]));
RDebugUtils.currentLine=9633805;
 //BA.debugLineNum = 9633805;BA.debugLine="dprMonth = mZeroBased + 1";
__ref._dprmonth /*int*/  = (int) (_mzerobased+1);
RDebugUtils.currentLine=9633806;
 //BA.debugLineNum = 9633806;BA.debugLine="dprDay = Args(3)";
__ref._dprday /*int*/  = (int)(BA.ObjectToNumber(_args[(int) (3)]));
RDebugUtils.currentLine=9633808;
 //BA.debugLineNum = 9633808;BA.debugLine="Dim ticks As Long = DateUtils_SetDate(dprYear, d";
_ticks = __ref._dateutils_setdate /*long*/ (null,__ref._dpryear /*int*/ ,__ref._dprmonth /*int*/ ,__ref._dprday /*int*/ );
RDebugUtils.currentLine=9633809;
 //BA.debugLineNum = 9633809;BA.debugLine="dprDatum.Text = FormatDateCustom(ticks, \"dd.MM.y";
__ref._dprdatum /*anywheresoftware.b4a.objects.ButtonWrapper*/ .setText(BA.ObjectToCharSequence(__ref._formatdatecustom /*String*/ (null,_ticks,"dd.MM.yyyy")));
RDebugUtils.currentLine=9633811;
 //BA.debugLineNum = 9633811;BA.debugLine="btnAuswahl.Enabled = False";
__ref._btnauswahl /*anywheresoftware.b4a.objects.ButtonWrapper*/ .setEnabled(parent.__c.False);
RDebugUtils.currentLine=9633812;
 //BA.debugLineNum = 9633812;BA.debugLine="btnAuswahl.TextColor = 0xFF888888";
__ref._btnauswahl /*anywheresoftware.b4a.objects.ButtonWrapper*/ .setTextColor(((int)0xff888888));
RDebugUtils.currentLine=9633814;
 //BA.debugLineNum = 9633814;BA.debugLine="If dprDatum.Text <> DBGet(\"VeranstaltungDatum\",";
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
RDebugUtils.currentLine=9633815;
 //BA.debugLineNum = 9633815;BA.debugLine="Dim neu As Boolean = True";
_neu = parent.__c.True;
RDebugUtils.currentLine=9633816;
 //BA.debugLineNum = 9633816;BA.debugLine="If Veranstaltungen.IsInitialized Then";
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
RDebugUtils.currentLine=9633817;
 //BA.debugLineNum = 9633817;BA.debugLine="For Each key As String In Veranstaltungen.Keys";
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
RDebugUtils.currentLine=9633818;
 //BA.debugLineNum = 9633818;BA.debugLine="Dim veranstaltung As Map = Veranstaltungen.Ge";
_veranstaltung = new anywheresoftware.b4a.objects.collections.Map();
_veranstaltung = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(__ref._veranstaltungen /*anywheresoftware.b4a.objects.collections.Map*/ .Get((Object)(_key))));
RDebugUtils.currentLine=9633819;
 //BA.debugLineNum = 9633819;BA.debugLine="Dim datum As String = veranstaltung.GetDefaul";
_datum = BA.ObjectToString(_veranstaltung.GetDefault((Object)("Datum"),(Object)("-")));
RDebugUtils.currentLine=9633820;
 //BA.debugLineNum = 9633820;BA.debugLine="If dprDatum.Text = datum Then";
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
RDebugUtils.currentLine=9633821;
 //BA.debugLineNum = 9633821;BA.debugLine="neu = False";
_neu = parent.__c.False;
RDebugUtils.currentLine=9633822;
 //BA.debugLineNum = 9633822;BA.debugLine="disableVSTNG";
__ref._disablevstng /*String*/ (null);
RDebugUtils.currentLine=9633823;
 //BA.debugLineNum = 9633823;BA.debugLine="webviewVSTGN_ID = key";
__ref._webviewvstgn_id /*String*/  = _key;
RDebugUtils.currentLine=9633826;
 //BA.debugLineNum = 9633826;BA.debugLine="enableVSTNG";
__ref._enablevstng /*String*/ (null);
RDebugUtils.currentLine=9633827;
 //BA.debugLineNum = 9633827;BA.debugLine="Exit";
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
RDebugUtils.currentLine=9633832;
 //BA.debugLineNum = 9633832;BA.debugLine="If neu Then";

case 18:
//if
this.state = 25;
if (_neu) { 
this.state = 20;
}if (true) break;

case 20:
//C
this.state = 21;
RDebugUtils.currentLine=9633833;
 //BA.debugLineNum = 9633833;BA.debugLine="Veranstaltung_ID = VSTGNnewID";
__ref._veranstaltung_id /*String*/  = __ref._vstgnnewid /*String*/ ;
RDebugUtils.currentLine=9633834;
 //BA.debugLineNum = 9633834;BA.debugLine="webviewVSTGN_ID = VSTGNnewID";
__ref._webviewvstgn_id /*String*/  = __ref._vstgnnewid /*String*/ ;
RDebugUtils.currentLine=9633835;
 //BA.debugLineNum = 9633835;BA.debugLine="disableVSTNG";
__ref._disablevstng /*String*/ (null);
RDebugUtils.currentLine=9633840;
 //BA.debugLineNum = 9633840;BA.debugLine="tbxAnzahl.Text = \"0\"";
__ref._tbxanzahl /*anywheresoftware.b4a.objects.EditTextWrapper*/ .setText(BA.ObjectToCharSequence("0"));
RDebugUtils.currentLine=9633841;
 //BA.debugLineNum = 9633841;BA.debugLine="enableVSTNG";
__ref._enablevstng /*String*/ (null);
RDebugUtils.currentLine=9633842;
 //BA.debugLineNum = 9633842;BA.debugLine="Dim anzVal As Int = tbxAnzahl.Text";
_anzval = (int)(Double.parseDouble(__ref._tbxanzahl /*anywheresoftware.b4a.objects.EditTextWrapper*/ .getText()));
RDebugUtils.currentLine=9633843;
 //BA.debugLineNum = 9633843;BA.debugLine="If anzVal > 0 Then";
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
RDebugUtils.currentLine=9633844;
 //BA.debugLineNum = 9633844;BA.debugLine="btnVerstgSpeichern.Enabled = True";
__ref._btnverstgspeichern /*anywheresoftware.b4a.objects.ButtonWrapper*/ .setEnabled(parent.__c.True);
RDebugUtils.currentLine=9633845;
 //BA.debugLineNum = 9633845;BA.debugLine="btnVerstgSpeichern.TextColor = colorgreen";
__ref._btnverstgspeichern /*anywheresoftware.b4a.objects.ButtonWrapper*/ .setTextColor(__ref._colorgreen /*int*/ );
 if (true) break;

case 24:
//C
this.state = 25;
;
RDebugUtils.currentLine=9633847;
 //BA.debugLineNum = 9633847;BA.debugLine="btnVerstgDelete.Enabled = False";
__ref._btnverstgdelete /*anywheresoftware.b4a.objects.ButtonWrapper*/ .setEnabled(parent.__c.False);
RDebugUtils.currentLine=9633848;
 //BA.debugLineNum = 9633848;BA.debugLine="btnVerstgDelete.TextColor = 0xFF888888";
__ref._btnverstgdelete /*anywheresoftware.b4a.objects.ButtonWrapper*/ .setTextColor(((int)0xff888888));
RDebugUtils.currentLine=9633849;
 //BA.debugLineNum = 9633849;BA.debugLine="btnAuswahl.Enabled = False";
__ref._btnauswahl /*anywheresoftware.b4a.objects.ButtonWrapper*/ .setEnabled(parent.__c.False);
RDebugUtils.currentLine=9633850;
 //BA.debugLineNum = 9633850;BA.debugLine="btnAuswahl.TextColor = 0xFF888888";
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
RDebugUtils.currentLine=9633854;
 //BA.debugLineNum = 9633854;BA.debugLine="startTimer";
__ref._starttimer /*String*/ (null);
RDebugUtils.currentLine=9633855;
 //BA.debugLineNum = 9633855;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=9437184;
 //BA.debugLineNum = 9437184;BA.debugLine="Private Sub HandleGotText(typ As String, reqUrl As";
RDebugUtils.currentLine=9437185;
 //BA.debugLineNum = 9437185;BA.debugLine="Dim jp As JSONParser";
_jp = new anywheresoftware.b4a.objects.collections.JSONParser();
RDebugUtils.currentLine=9437187;
 //BA.debugLineNum = 9437187;BA.debugLine="Select typ";
switch (BA.switchObjectToInt(_typ,"Teilnehmer","Veranstaltungen","addVSTNG","addTLN","delTeilnehmer","delVeranstaltung","delErgebnis")) {
case 0: {
RDebugUtils.currentLine=9437189;
 //BA.debugLineNum = 9437189;BA.debugLine="DBdatenTyp = \"\"";
__ref._dbdatentyp /*String*/  = "";
RDebugUtils.currentLine=9437190;
 //BA.debugLineNum = 9437190;BA.debugLine="ladeTeilnehmer(responseContent)";
__ref._ladeteilnehmer /*String*/ (null,_responsecontent);
 break; }
case 1: {
RDebugUtils.currentLine=9437193;
 //BA.debugLineNum = 9437193;BA.debugLine="If responseContent = \"null\" Or responseContent";
if ((_responsecontent).equals("null") || (_responsecontent).equals("")) { 
RDebugUtils.currentLine=9437194;
 //BA.debugLineNum = 9437194;BA.debugLine="Veranstaltungen.Initialize";
__ref._veranstaltungen /*anywheresoftware.b4a.objects.collections.Map*/ .Initialize();
 }else {
RDebugUtils.currentLine=9437196;
 //BA.debugLineNum = 9437196;BA.debugLine="jp.Initialize(responseContent)";
_jp.Initialize(_responsecontent);
RDebugUtils.currentLine=9437197;
 //BA.debugLineNum = 9437197;BA.debugLine="Veranstaltungen = jp.NextObject";
__ref._veranstaltungen /*anywheresoftware.b4a.objects.collections.Map*/  = _jp.NextObject();
 };
RDebugUtils.currentLine=9437199;
 //BA.debugLineNum = 9437199;BA.debugLine="pruefeDBVerein";
__ref._pruefedbverein /*String*/ (null);
RDebugUtils.currentLine=9437200;
 //BA.debugLineNum = 9437200;BA.debugLine="ZeigeVeranstaltungenCLV";
__ref._zeigeveranstaltungenclv /*String*/ (null);
RDebugUtils.currentLine=9437201;
 //BA.debugLineNum = 9437201;BA.debugLine="DBdatenTyp = \"\"";
__ref._dbdatentyp /*String*/  = "";
RDebugUtils.currentLine=9437202;
 //BA.debugLineNum = 9437202;BA.debugLine="holeTLN";
__ref._holetln /*String*/ (null);
 break; }
case 2: {
RDebugUtils.currentLine=9437205;
 //BA.debugLineNum = 9437205;BA.debugLine="DBdatenTyp = \"\"";
__ref._dbdatentyp /*String*/  = "";
RDebugUtils.currentLine=9437206;
 //BA.debugLineNum = 9437206;BA.debugLine="holeVeranstaltungen";
__ref._holeveranstaltungen /*String*/ (null);
 break; }
case 3: {
RDebugUtils.currentLine=9437209;
 //BA.debugLineNum = 9437209;BA.debugLine="DBdatenTyp = \"\"";
__ref._dbdatentyp /*String*/  = "";
RDebugUtils.currentLine=9437210;
 //BA.debugLineNum = 9437210;BA.debugLine="holeTLN";
__ref._holetln /*String*/ (null);
 break; }
case 4: {
RDebugUtils.currentLine=9437213;
 //BA.debugLineNum = 9437213;BA.debugLine="DBdatenTyp = \"\"";
__ref._dbdatentyp /*String*/  = "";
RDebugUtils.currentLine=9437214;
 //BA.debugLineNum = 9437214;BA.debugLine="TLNid = \"t0\"";
__ref._tlnid /*String*/  = "t0";
RDebugUtils.currentLine=9437215;
 //BA.debugLineNum = 9437215;BA.debugLine="holeTLN";
__ref._holetln /*String*/ (null);
 break; }
case 5: {
RDebugUtils.currentLine=9437218;
 //BA.debugLineNum = 9437218;BA.debugLine="DBdatenTyp = \"\"";
__ref._dbdatentyp /*String*/  = "";
RDebugUtils.currentLine=9437219;
 //BA.debugLineNum = 9437219;BA.debugLine="If webviewVSTGN_ID = DBGet(\"VeranstaltungID\", \"";
if ((__ref._webviewvstgn_id /*String*/ ).equals(BA.ObjectToString(__ref._dbget /*Object*/ (null,"VeranstaltungID",(Object)("v0"))))) { 
RDebugUtils.currentLine=9437220;
 //BA.debugLineNum = 9437220;BA.debugLine="Veranstaltung_ID = \"v0\"";
__ref._veranstaltung_id /*String*/  = "v0";
RDebugUtils.currentLine=9437221;
 //BA.debugLineNum = 9437221;BA.debugLine="webviewVSTGN_ID = \"v0\"";
__ref._webviewvstgn_id /*String*/  = "v0";
RDebugUtils.currentLine=9437222;
 //BA.debugLineNum = 9437222;BA.debugLine="DBPut(\"VeranstaltungID\", \"v0\")";
__ref._dbput /*String*/ (null,"VeranstaltungID",(Object)("v0"));
 };
RDebugUtils.currentLine=9437224;
 //BA.debugLineNum = 9437224;BA.debugLine="holeVeranstaltungen";
__ref._holeveranstaltungen /*String*/ (null);
 break; }
case 6: {
RDebugUtils.currentLine=9437227;
 //BA.debugLineNum = 9437227;BA.debugLine="DBdatenTyp = \"\"";
__ref._dbdatentyp /*String*/  = "";
RDebugUtils.currentLine=9437228;
 //BA.debugLineNum = 9437228;BA.debugLine="delVeranstaltung(webviewVSTGN_ID)";
__ref._delveranstaltung /*String*/ (null,__ref._webviewvstgn_id /*String*/ );
 break; }
default: {
RDebugUtils.currentLine=9437231;
 //BA.debugLineNum = 9437231;BA.debugLine="MsgboxAsync(\"(\" & DBdatenTyp & \")\" & reqUrl, \"D";
__c.MsgboxAsync(BA.ObjectToCharSequence("("+__ref._dbdatentyp /*String*/ +")"+_requrl),BA.ObjectToCharSequence("Da stimmt etwas nicht!"),ba);
 break; }
}
;
RDebugUtils.currentLine=9437233;
 //BA.debugLineNum = 9437233;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=9502721;
 //BA.debugLineNum = 9502721;BA.debugLine="Status.Put(\"ProgOffline\", True)";
__ref._status /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("ProgOffline"),(Object)(parent.__c.True));
RDebugUtils.currentLine=9502722;
 //BA.debugLineNum = 9502722;BA.debugLine="Msgbox2Async(\"Die Datenbank ist nicht mehr erreic";
parent.__c.Msgbox2Async(BA.ObjectToCharSequence("Die Datenbank ist nicht mehr erreichbar. Das Programm arbeitet nun offline. Es ist jetzt nur die zuletzt verwendete Wertungsliste verfügbar. Änderungen in den Einstellungen können nicht übernommen werden."),BA.ObjectToCharSequence("Internet-Verbindung nicht möglich!"),"Einstellungen schließen.","","",(anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper(), (android.graphics.Bitmap)(parent.__c.Null)),ba,parent.__c.False);
RDebugUtils.currentLine=9502723;
 //BA.debugLineNum = 9502723;BA.debugLine="Wait For Msgbox_Result (res As Int)";
parent.__c.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "settings", "setzeoffline"), null);
this.state = 5;
return;
case 5:
//C
this.state = 1;
_res = (Integer) result[1];
;
RDebugUtils.currentLine=9502724;
 //BA.debugLineNum = 9502724;BA.debugLine="If res = DialogResponse.POSITIVE Then";
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
RDebugUtils.currentLine=9502725;
 //BA.debugLineNum = 9502725;BA.debugLine="CloseSettings";
__ref._closesettings /*String*/ (null);
 if (true) break;

case 4:
//C
this.state = -1;
;
RDebugUtils.currentLine=9502727;
 //BA.debugLineNum = 9502727;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=9109504;
 //BA.debugLineNum = 9109504;BA.debugLine="Private Sub ladeTeilnehmer(response As String)";
RDebugUtils.currentLine=9109505;
 //BA.debugLineNum = 9109505;BA.debugLine="Teilnehmer.Initialize";
__ref._teilnehmer /*anywheresoftware.b4a.objects.collections.List*/ .Initialize();
RDebugUtils.currentLine=9109506;
 //BA.debugLineNum = 9109506;BA.debugLine="If response <> \"\" And response <> \"null\" Then";
if ((_response).equals("") == false && (_response).equals("null") == false) { 
RDebugUtils.currentLine=9109507;
 //BA.debugLineNum = 9109507;BA.debugLine="Dim jp As JSONParser";
_jp = new anywheresoftware.b4a.objects.collections.JSONParser();
RDebugUtils.currentLine=9109508;
 //BA.debugLineNum = 9109508;BA.debugLine="jp.Initialize(response)";
_jp.Initialize(_response);
RDebugUtils.currentLine=9109509;
 //BA.debugLineNum = 9109509;BA.debugLine="Dim teilnehmerliste As Map = jp.NextObject";
_teilnehmerliste = new anywheresoftware.b4a.objects.collections.Map();
_teilnehmerliste = _jp.NextObject();
RDebugUtils.currentLine=9109511;
 //BA.debugLineNum = 9109511;BA.debugLine="For Each key As String In teilnehmerliste.Keys";
{
final anywheresoftware.b4a.BA.IterableList group6 = _teilnehmerliste.Keys();
final int groupLen6 = group6.getSize()
;int index6 = 0;
;
for (; index6 < groupLen6;index6++){
_key = BA.ObjectToString(group6.Get(index6));
RDebugUtils.currentLine=9109512;
 //BA.debugLineNum = 9109512;BA.debugLine="Dim newID As Int = key.Replace(\"t\", \"\") + 1";
_newid = (int) ((double)(Double.parseDouble(_key.replace("t","")))+1);
RDebugUtils.currentLine=9109513;
 //BA.debugLineNum = 9109513;BA.debugLine="Dim curMax As Int = TLNnewID.Replace(\"t\", \"\")";
_curmax = (int)(Double.parseDouble(__ref._tlnnewid /*String*/ .replace("t","")));
RDebugUtils.currentLine=9109514;
 //BA.debugLineNum = 9109514;BA.debugLine="If newID > curMax Then";
if (_newid>_curmax) { 
RDebugUtils.currentLine=9109515;
 //BA.debugLineNum = 9109515;BA.debugLine="TLNnewID = \"t\" & newID";
__ref._tlnnewid /*String*/  = "t"+BA.NumberToString(_newid);
 };
RDebugUtils.currentLine=9109517;
 //BA.debugLineNum = 9109517;BA.debugLine="Dim tMap As Map = teilnehmerliste.Get(key)";
_tmap = new anywheresoftware.b4a.objects.collections.Map();
_tmap = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_teilnehmerliste.Get((Object)(_key))));
RDebugUtils.currentLine=9109518;
 //BA.debugLineNum = 9109518;BA.debugLine="Teilnehmer.AddAll(Array As Object(tMap.GetDefau";
__ref._teilnehmer /*anywheresoftware.b4a.objects.collections.List*/ .AddAll(anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{_tmap.GetDefault((Object)("Name"),(Object)("unbenannt")),(Object)(_key)}));
 }
};
RDebugUtils.currentLine=9109520;
 //BA.debugLineNum = 9109520;BA.debugLine="Teilnehmer.Add(TLNid)";
__ref._teilnehmer /*anywheresoftware.b4a.objects.collections.List*/ .Add((Object)(__ref._tlnid /*String*/ ));
 };
RDebugUtils.currentLine=9109522;
 //BA.debugLineNum = 9109522;BA.debugLine="ZeigeTeilnehmerCLV";
__ref._zeigeteilnehmerclv /*String*/ (null);
RDebugUtils.currentLine=9109523;
 //BA.debugLineNum = 9109523;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=8650752;
 //BA.debugLineNum = 8650752;BA.debugLine="Private Sub pruefeDBVerein";
RDebugUtils.currentLine=8650753;
 //BA.debugLineNum = 8650753;BA.debugLine="Dim VSTNGexists As Boolean = False";
_vstngexists = __c.False;
RDebugUtils.currentLine=8650754;
 //BA.debugLineNum = 8650754;BA.debugLine="Dim savedID As String = DBGet(\"VeranstaltungID\",";
_savedid = BA.ObjectToString(__ref._dbget /*Object*/ (null,"VeranstaltungID",(Object)("v0")));
RDebugUtils.currentLine=8650756;
 //BA.debugLineNum = 8650756;BA.debugLine="If Veranstaltungen.IsInitialized And Veranstaltun";
if (__ref._veranstaltungen /*anywheresoftware.b4a.objects.collections.Map*/ .IsInitialized() && __ref._veranstaltungen /*anywheresoftware.b4a.objects.collections.Map*/ .getSize()>0) { 
RDebugUtils.currentLine=8650757;
 //BA.debugLineNum = 8650757;BA.debugLine="For Each key As String In Veranstaltungen.Keys";
{
final anywheresoftware.b4a.BA.IterableList group4 = __ref._veranstaltungen /*anywheresoftware.b4a.objects.collections.Map*/ .Keys();
final int groupLen4 = group4.getSize()
;int index4 = 0;
;
for (; index4 < groupLen4;index4++){
_key = BA.ObjectToString(group4.Get(index4));
RDebugUtils.currentLine=8650758;
 //BA.debugLineNum = 8650758;BA.debugLine="webviewVSTGN_ID = key";
__ref._webviewvstgn_id /*String*/  = _key;
RDebugUtils.currentLine=8650759;
 //BA.debugLineNum = 8650759;BA.debugLine="If key = savedID Then";
if ((_key).equals(_savedid)) { 
RDebugUtils.currentLine=8650760;
 //BA.debugLineNum = 8650760;BA.debugLine="VSTNGexists = True";
_vstngexists = __c.True;
RDebugUtils.currentLine=8650761;
 //BA.debugLineNum = 8650761;BA.debugLine="Exit";
if (true) break;
 };
 }
};
 };
RDebugUtils.currentLine=8650766;
 //BA.debugLineNum = 8650766;BA.debugLine="If Not(VSTNGexists) Then";
if (__c.Not(_vstngexists)) { 
RDebugUtils.currentLine=8650767;
 //BA.debugLineNum = 8650767;BA.debugLine="lblVeranstaltung.Text = \"- noch nicht ausgewählt";
__ref._lblveranstaltung /*anywheresoftware.b4a.objects.LabelWrapper*/ .setText(BA.ObjectToCharSequence("- noch nicht ausgewählt -"));
RDebugUtils.currentLine=8650768;
 //BA.debugLineNum = 8650768;BA.debugLine="lblDatum.Text = \"- bitte auswählen -\"";
__ref._lbldatum /*anywheresoftware.b4a.objects.LabelWrapper*/ .setText(BA.ObjectToCharSequence("- bitte auswählen -"));
RDebugUtils.currentLine=8650769;
 //BA.debugLineNum = 8650769;BA.debugLine="Veranstaltung_ID = \"v0\"";
__ref._veranstaltung_id /*String*/  = "v0";
RDebugUtils.currentLine=8650770;
 //BA.debugLineNum = 8650770;BA.debugLine="VSTGNnewID = \"v1\"";
__ref._vstgnnewid /*String*/  = "v1";
RDebugUtils.currentLine=8650771;
 //BA.debugLineNum = 8650771;BA.debugLine="DBPut(\"VeranstaltungID\", \"v0\")";
__ref._dbput /*String*/ (null,"VeranstaltungID",(Object)("v0"));
 };
RDebugUtils.currentLine=8650773;
 //BA.debugLineNum = 8650773;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=10944512;
 //BA.debugLineNum = 10944512;BA.debugLine="Private Sub ZeigeVeranstaltungenCLV";
RDebugUtils.currentLine=10944514;
 //BA.debugLineNum = 10944514;BA.debugLine="lstVeranstaltungen.Clear";
__ref._lstveranstaltungen /*anywheresoftware.b4a.objects.ListViewWrapper*/ .Clear();
RDebugUtils.currentLine=10944516;
 //BA.debugLineNum = 10944516;BA.debugLine="For Each KEY As String In Veranstaltungen.Keys";
{
final anywheresoftware.b4a.BA.IterableList group2 = __ref._veranstaltungen /*anywheresoftware.b4a.objects.collections.Map*/ .Keys();
final int groupLen2 = group2.getSize()
;int index2 = 0;
;
for (; index2 < groupLen2;index2++){
_key = BA.ObjectToString(group2.Get(index2));
RDebugUtils.currentLine=10944518;
 //BA.debugLineNum = 10944518;BA.debugLine="Dim V As Map = Veranstaltungen.Get(KEY)";
_v = new anywheresoftware.b4a.objects.collections.Map();
_v = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(__ref._veranstaltungen /*anywheresoftware.b4a.objects.collections.Map*/ .Get((Object)(_key))));
RDebugUtils.currentLine=10944520;
 //BA.debugLineNum = 10944520;BA.debugLine="Dim DATUM As String = V.GetDefault(\"Datum\", \"\")";
_datum = BA.ObjectToString(_v.GetDefault((Object)("Datum"),(Object)("")));
RDebugUtils.currentLine=10944521;
 //BA.debugLineNum = 10944521;BA.debugLine="Dim NAME As String = V.GetDefault(\"Name\", \"\")";
_name = BA.ObjectToString(_v.GetDefault((Object)("Name"),(Object)("")));
RDebugUtils.currentLine=10944523;
 //BA.debugLineNum = 10944523;BA.debugLine="lstVeranstaltungen.AddSingleLine2( _";
__ref._lstveranstaltungen /*anywheresoftware.b4a.objects.ListViewWrapper*/ .AddSingleLine2(BA.ObjectToCharSequence(_datum+"   "+_name),(Object)(_key));
 }
};
RDebugUtils.currentLine=10944529;
 //BA.debugLineNum = 10944529;BA.debugLine="End Sub";
return "";
}
public String  _holetln(b4a.example.settings __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="settings";
if (Debug.shouldDelegate(ba, "holetln", false))
	 {return ((String) Debug.delegate(ba, "holetln", null));}
RDebugUtils.currentLine=9043968;
 //BA.debugLineNum = 9043968;BA.debugLine="Private Sub holeTLN";
RDebugUtils.currentLine=9043969;
 //BA.debugLineNum = 9043969;BA.debugLine="DBdatenTyp = \"Teilnehmer\"";
__ref._dbdatentyp /*String*/  = "Teilnehmer";
RDebugUtils.currentLine=9043970;
 //BA.debugLineNum = 9043970;BA.debugLine="CurrentWebUrl = URLteilnehmer & \".json?auth=\" & S";
__ref._currentweburl /*String*/  = __ref._urlteilnehmer /*String*/ +".json?auth="+BA.ObjectToString(__ref._status /*anywheresoftware.b4a.objects.collections.Map*/ .GetDefault((Object)("idToken"),(Object)("")));
RDebugUtils.currentLine=9043971;
 //BA.debugLineNum = 9043971;BA.debugLine="ExecuteHttp(\"GET\", CurrentWebUrl, \"\")";
__ref._executehttp /*void*/ (null,"GET",__ref._currentweburl /*String*/ ,"");
RDebugUtils.currentLine=9043972;
 //BA.debugLineNum = 9043972;BA.debugLine="End Sub";
return "";
}
public String  _hidekeyboard(b4a.example.settings __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="settings";
if (Debug.shouldDelegate(ba, "hidekeyboard", false))
	 {return ((String) Debug.delegate(ba, "hidekeyboard", null));}
anywheresoftware.b4a.phone.Phone _p = null;
RDebugUtils.currentLine=10682368;
 //BA.debugLineNum = 10682368;BA.debugLine="Private Sub HideKeyboard";
RDebugUtils.currentLine=10682369;
 //BA.debugLineNum = 10682369;BA.debugLine="Dim p As Phone";
_p = new anywheresoftware.b4a.phone.Phone();
RDebugUtils.currentLine=10682370;
 //BA.debugLineNum = 10682370;BA.debugLine="p.HideKeyboard(B4XPages.GetNativeParent(Me))";
_p.HideKeyboard(_b4xpages._getnativeparent /*anywheresoftware.b4a.objects.ActivityWrapper*/ (ba,this));
RDebugUtils.currentLine=10682371;
 //BA.debugLineNum = 10682371;BA.debugLine="End Sub";
return "";
}
public String  _zeigeteilnehmerclv(b4a.example.settings __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="settings";
if (Debug.shouldDelegate(ba, "zeigeteilnehmerclv", false))
	 {return ((String) Debug.delegate(ba, "zeigeteilnehmerclv", null));}
int _i = 0;
RDebugUtils.currentLine=11075584;
 //BA.debugLineNum = 11075584;BA.debugLine="Private Sub ZeigeTeilnehmerCLV";
RDebugUtils.currentLine=11075586;
 //BA.debugLineNum = 11075586;BA.debugLine="lstTeilnehmer.Clear";
__ref._lstteilnehmer /*anywheresoftware.b4a.objects.ListViewWrapper*/ .Clear();
RDebugUtils.currentLine=11075588;
 //BA.debugLineNum = 11075588;BA.debugLine="For I = 0 To Teilnehmer.Size - 1 Step 2";
{
final int step2 = 2;
final int limit2 = (int) (__ref._teilnehmer /*anywheresoftware.b4a.objects.collections.List*/ .getSize()-1);
_i = (int) (0) ;
for (;_i <= limit2 ;_i = _i + step2 ) {
RDebugUtils.currentLine=11075589;
 //BA.debugLineNum = 11075589;BA.debugLine="If I + 1 < Teilnehmer.Size Then";
if (_i+1<__ref._teilnehmer /*anywheresoftware.b4a.objects.collections.List*/ .getSize()) { 
RDebugUtils.currentLine=11075590;
 //BA.debugLineNum = 11075590;BA.debugLine="lstTeilnehmer.AddSingleLine2(Teilnehmer.Get(I),";
__ref._lstteilnehmer /*anywheresoftware.b4a.objects.ListViewWrapper*/ .AddSingleLine2(BA.ObjectToCharSequence(__ref._teilnehmer /*anywheresoftware.b4a.objects.collections.List*/ .Get(_i)),__ref._teilnehmer /*anywheresoftware.b4a.objects.collections.List*/ .Get((int) (_i+1)));
 };
 }
};
RDebugUtils.currentLine=11075594;
 //BA.debugLineNum = 11075594;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=8519680;
 //BA.debugLineNum = 8519680;BA.debugLine="Private Sub ladeVeranstaltungen";
RDebugUtils.currentLine=8519681;
 //BA.debugLineNum = 8519681;BA.debugLine="dprDatum.Enabled = True";
__ref._dprdatum /*anywheresoftware.b4a.objects.ButtonWrapper*/ .setEnabled(__c.True);
RDebugUtils.currentLine=8519682;
 //BA.debugLineNum = 8519682;BA.debugLine="dprDatum.TextColor = colorgreen";
__ref._dprdatum /*anywheresoftware.b4a.objects.ButtonWrapper*/ .setTextColor(__ref._colorgreen /*int*/ );
RDebugUtils.currentLine=8519683;
 //BA.debugLineNum = 8519683;BA.debugLine="dprDatum.Text = FormatDateCustom(DateTime.Now, \"d";
__ref._dprdatum /*anywheresoftware.b4a.objects.ButtonWrapper*/ .setText(BA.ObjectToCharSequence(__ref._formatdatecustom /*String*/ (null,__c.DateTime.getNow(),"dd.MM.yyyy")));
RDebugUtils.currentLine=8519684;
 //BA.debugLineNum = 8519684;BA.debugLine="dprYear = DateTime.GetYear(DateTime.Now)";
__ref._dpryear /*int*/  = __c.DateTime.GetYear(__c.DateTime.getNow());
RDebugUtils.currentLine=8519685;
 //BA.debugLineNum = 8519685;BA.debugLine="dprMonth = DateTime.GetMonth(DateTime.Now)";
__ref._dprmonth /*int*/  = __c.DateTime.GetMonth(__c.DateTime.getNow());
RDebugUtils.currentLine=8519686;
 //BA.debugLineNum = 8519686;BA.debugLine="dprDay = DateTime.GetDayOfMonth(DateTime.Now)";
__ref._dprday /*int*/  = __c.DateTime.GetDayOfMonth(__c.DateTime.getNow());
RDebugUtils.currentLine=8519688;
 //BA.debugLineNum = 8519688;BA.debugLine="webviewVSTGN.Initialize";
__ref._webviewvstgn /*anywheresoftware.b4a.objects.collections.List*/ .Initialize();
RDebugUtils.currentLine=8519689;
 //BA.debugLineNum = 8519689;BA.debugLine="webviewVSTGN.AddAll(Array As Object(\"Datum\", \"Nam";
__ref._webviewvstgn /*anywheresoftware.b4a.objects.collections.List*/ .AddAll(anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)("Datum"),(Object)("Name"),(Object)("vid")}));
RDebugUtils.currentLine=8519691;
 //BA.debugLineNum = 8519691;BA.debugLine="If Not(Veranstaltungen.IsInitialized) Or Veransta";
if (__c.Not(__ref._veranstaltungen /*anywheresoftware.b4a.objects.collections.Map*/ .IsInitialized()) || __ref._veranstaltungen /*anywheresoftware.b4a.objects.collections.Map*/ .getSize()==0) { 
RDebugUtils.currentLine=8519692;
 //BA.debugLineNum = 8519692;BA.debugLine="Veranstaltung_ID = \"v0\"";
__ref._veranstaltung_id /*String*/  = "v0";
RDebugUtils.currentLine=8519693;
 //BA.debugLineNum = 8519693;BA.debugLine="webviewVSTGN_ID = \"v0\"";
__ref._webviewvstgn_id /*String*/  = "v0";
RDebugUtils.currentLine=8519694;
 //BA.debugLineNum = 8519694;BA.debugLine="VSTGNnewID = \"v1\"";
__ref._vstgnnewid /*String*/  = "v1";
RDebugUtils.currentLine=8519695;
 //BA.debugLineNum = 8519695;BA.debugLine="webviewVSTGN.AddAll(Array As Object(\"Veranstaltu";
__ref._webviewvstgn /*anywheresoftware.b4a.objects.collections.List*/ .AddAll(anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)("Veranstaltungs_ID"),(Object)("v0")}));
RDebugUtils.currentLine=8519696;
 //BA.debugLineNum = 8519696;BA.debugLine="setzeVeranstaltung(\"v0\")";
__ref._setzeveranstaltung /*String*/ (null,"v0");
 }else {
RDebugUtils.currentLine=8519698;
 //BA.debugLineNum = 8519698;BA.debugLine="For Each key As String In Veranstaltungen.Keys";
{
final anywheresoftware.b4a.BA.IterableList group16 = __ref._veranstaltungen /*anywheresoftware.b4a.objects.collections.Map*/ .Keys();
final int groupLen16 = group16.getSize()
;int index16 = 0;
;
for (; index16 < groupLen16;index16++){
_key = BA.ObjectToString(group16.Get(index16));
RDebugUtils.currentLine=8519699;
 //BA.debugLineNum = 8519699;BA.debugLine="Dim newID As Int = key.Replace(\"v\", \"\") + 1";
_newid = (int) ((double)(Double.parseDouble(_key.replace("v","")))+1);
RDebugUtils.currentLine=8519700;
 //BA.debugLineNum = 8519700;BA.debugLine="Dim curMax As Int = VSTGNnewID.Replace(\"v\", \"\")";
_curmax = (int)(Double.parseDouble(__ref._vstgnnewid /*String*/ .replace("v","")));
RDebugUtils.currentLine=8519701;
 //BA.debugLineNum = 8519701;BA.debugLine="If newID > curMax Then";
if (_newid>_curmax) { 
RDebugUtils.currentLine=8519702;
 //BA.debugLineNum = 8519702;BA.debugLine="VSTGNnewID = \"v\" & newID";
__ref._vstgnnewid /*String*/  = "v"+BA.NumberToString(_newid);
 };
RDebugUtils.currentLine=8519704;
 //BA.debugLineNum = 8519704;BA.debugLine="Dim ergebnis As Map = Veranstaltungen.Get(key)";
_ergebnis = new anywheresoftware.b4a.objects.collections.Map();
_ergebnis = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(__ref._veranstaltungen /*anywheresoftware.b4a.objects.collections.Map*/ .Get((Object)(_key))));
RDebugUtils.currentLine=8519705;
 //BA.debugLineNum = 8519705;BA.debugLine="webviewVSTGN.AddAll(Array As Object( _ 				erge";
__ref._webviewvstgn /*anywheresoftware.b4a.objects.collections.List*/ .AddAll(anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{_ergebnis.GetDefault((Object)("Datum"),(Object)(__ref._formatdatecustom /*String*/ (null,__c.DateTime.getNow(),"dd.MM.yyyy"))),_ergebnis.GetDefault((Object)("Name"),(Object)("- n.n. -")),(Object)(_key)}));
 }
};
RDebugUtils.currentLine=8519710;
 //BA.debugLineNum = 8519710;BA.debugLine="webviewVSTGN.AddAll(Array As Object(\"Veranstaltu";
__ref._webviewvstgn /*anywheresoftware.b4a.objects.collections.List*/ .AddAll(anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)("Veranstaltungs_ID"),(Object)(__ref._webviewvstgn_id /*String*/ )}));
 };
RDebugUtils.currentLine=8519712;
 //BA.debugLineNum = 8519712;BA.debugLine="End Sub";
return "";
}
public String  _lstveranstaltungen_itemclick(b4a.example.settings __ref,int _position,Object _value) throws Exception{
__ref = this;
RDebugUtils.currentModule="settings";
if (Debug.shouldDelegate(ba, "lstveranstaltungen_itemclick", false))
	 {return ((String) Debug.delegate(ba, "lstveranstaltungen_itemclick", new Object[] {_position,_value}));}
RDebugUtils.currentLine=11206656;
 //BA.debugLineNum = 11206656;BA.debugLine="Private Sub lstVeranstaltungen_ItemClick (Position";
RDebugUtils.currentLine=11206658;
 //BA.debugLineNum = 11206658;BA.debugLine="webviewVSTGN_ID = Value";
__ref._webviewvstgn_id /*String*/  = BA.ObjectToString(_value);
RDebugUtils.currentLine=11206660;
 //BA.debugLineNum = 11206660;BA.debugLine="setzeVeranstaltung(webviewVSTGN_ID)";
__ref._setzeveranstaltung /*String*/ (null,__ref._webviewvstgn_id /*String*/ );
RDebugUtils.currentLine=11206662;
 //BA.debugLineNum = 11206662;BA.debugLine="End Sub";
return "";
}
public String  _pruefeinhalt(b4a.example.settings __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="settings";
if (Debug.shouldDelegate(ba, "pruefeinhalt", false))
	 {return ((String) Debug.delegate(ba, "pruefeinhalt", null));}
int _anz = 0;
RDebugUtils.currentLine=8978432;
 //BA.debugLineNum = 8978432;BA.debugLine="Private Sub pruefeInhalt";
RDebugUtils.currentLine=8978433;
 //BA.debugLineNum = 8978433;BA.debugLine="btnVerstgSpeichern.Enabled = False";
__ref._btnverstgspeichern /*anywheresoftware.b4a.objects.ButtonWrapper*/ .setEnabled(__c.False);
RDebugUtils.currentLine=8978434;
 //BA.debugLineNum = 8978434;BA.debugLine="btnVerstgSpeichern.TextColor = 0xFF888888";
__ref._btnverstgspeichern /*anywheresoftware.b4a.objects.ButtonWrapper*/ .setTextColor(((int)0xff888888));
RDebugUtils.currentLine=8978435;
 //BA.debugLineNum = 8978435;BA.debugLine="btnAuswahl.Enabled = False";
__ref._btnauswahl /*anywheresoftware.b4a.objects.ButtonWrapper*/ .setEnabled(__c.False);
RDebugUtils.currentLine=8978436;
 //BA.debugLineNum = 8978436;BA.debugLine="btnAuswahl.TextColor = 0xFF888888";
__ref._btnauswahl /*anywheresoftware.b4a.objects.ButtonWrapper*/ .setTextColor(((int)0xff888888));
RDebugUtils.currentLine=8978438;
 //BA.debugLineNum = 8978438;BA.debugLine="If tbxVeranstaltung.Text.Trim <> \"\" Then";
if ((__ref._tbxveranstaltung /*anywheresoftware.b4a.objects.EditTextWrapper*/ .getText().trim()).equals("") == false) { 
RDebugUtils.currentLine=8978439;
 //BA.debugLineNum = 8978439;BA.debugLine="If IsNumber(tbxAnzahl.Text) Then";
if (__c.IsNumber(__ref._tbxanzahl /*anywheresoftware.b4a.objects.EditTextWrapper*/ .getText())) { 
RDebugUtils.currentLine=8978440;
 //BA.debugLineNum = 8978440;BA.debugLine="Dim anz As Int = tbxAnzahl.Text";
_anz = (int)(Double.parseDouble(__ref._tbxanzahl /*anywheresoftware.b4a.objects.EditTextWrapper*/ .getText()));
RDebugUtils.currentLine=8978441;
 //BA.debugLineNum = 8978441;BA.debugLine="If anz > 0 Then";
if (_anz>0) { 
RDebugUtils.currentLine=8978442;
 //BA.debugLineNum = 8978442;BA.debugLine="btnVerstgSpeichern.Enabled = True";
__ref._btnverstgspeichern /*anywheresoftware.b4a.objects.ButtonWrapper*/ .setEnabled(__c.True);
RDebugUtils.currentLine=8978443;
 //BA.debugLineNum = 8978443;BA.debugLine="btnVerstgSpeichern.TextColor = colorgreen";
__ref._btnverstgspeichern /*anywheresoftware.b4a.objects.ButtonWrapper*/ .setTextColor(__ref._colorgreen /*int*/ );
 };
 };
 };
RDebugUtils.currentLine=8978447;
 //BA.debugLineNum = 8978447;BA.debugLine="End Sub";
return "";
}
public String  _tbxanzahl_focuschanged(b4a.example.settings __ref,boolean _hasfocus) throws Exception{
__ref = this;
RDebugUtils.currentModule="settings";
if (Debug.shouldDelegate(ba, "tbxanzahl_focuschanged", false))
	 {return ((String) Debug.delegate(ba, "tbxanzahl_focuschanged", new Object[] {_hasfocus}));}
RDebugUtils.currentLine=10223616;
 //BA.debugLineNum = 10223616;BA.debugLine="Private Sub tbxAnzahl_FocusChanged (HasFocus As Bo";
RDebugUtils.currentLine=10223617;
 //BA.debugLineNum = 10223617;BA.debugLine="If HasFocus Then";
if (_hasfocus) { 
RDebugUtils.currentLine=10223618;
 //BA.debugLineNum = 10223618;BA.debugLine="tbxAnzahl.SelectionStart = tbxAnzahl.Text.Length";
__ref._tbxanzahl /*anywheresoftware.b4a.objects.EditTextWrapper*/ .setSelectionStart(__ref._tbxanzahl /*anywheresoftware.b4a.objects.EditTextWrapper*/ .getText().length());
 }else {
RDebugUtils.currentLine=10223620;
 //BA.debugLineNum = 10223620;BA.debugLine="HideKeyboard";
__ref._hidekeyboard /*String*/ (null);
 };
RDebugUtils.currentLine=10223622;
 //BA.debugLineNum = 10223622;BA.debugLine="End Sub";
return "";
}
public String  _tbxanzahl_textchanged(b4a.example.settings __ref,String _old,String _new) throws Exception{
__ref = this;
RDebugUtils.currentModule="settings";
if (Debug.shouldDelegate(ba, "tbxanzahl_textchanged", false))
	 {return ((String) Debug.delegate(ba, "tbxanzahl_textchanged", new Object[] {_old,_new}));}
int _val = 0;
RDebugUtils.currentLine=10289152;
 //BA.debugLineNum = 10289152;BA.debugLine="Private Sub tbxAnzahl_TextChanged (Old As String,";
RDebugUtils.currentLine=10289153;
 //BA.debugLineNum = 10289153;BA.debugLine="Log(\"tbxAnzahl_TextChanged\")";
__c.LogImpl("310289153","tbxAnzahl_TextChanged",0);
RDebugUtils.currentLine=10289154;
 //BA.debugLineNum = 10289154;BA.debugLine="Log(\"dochange = \" & dochange)";
__c.LogImpl("310289154","dochange = "+BA.ObjectToString(__ref._dochange /*boolean*/ ),0);
RDebugUtils.currentLine=10289155;
 //BA.debugLineNum = 10289155;BA.debugLine="If dochange = False Then Return";
if (__ref._dochange /*boolean*/ ==__c.False) { 
if (true) return "";};
RDebugUtils.currentLine=10289157;
 //BA.debugLineNum = 10289157;BA.debugLine="dochange = False";
__ref._dochange /*boolean*/  = __c.False;
RDebugUtils.currentLine=10289158;
 //BA.debugLineNum = 10289158;BA.debugLine="If tbxAnzahl.Enabled Then";
if (__ref._tbxanzahl /*anywheresoftware.b4a.objects.EditTextWrapper*/ .getEnabled()) { 
RDebugUtils.currentLine=10289159;
 //BA.debugLineNum = 10289159;BA.debugLine="If IsNumber(tbxAnzahl.Text) Then";
if (__c.IsNumber(__ref._tbxanzahl /*anywheresoftware.b4a.objects.EditTextWrapper*/ .getText())) { 
RDebugUtils.currentLine=10289160;
 //BA.debugLineNum = 10289160;BA.debugLine="Dim val As Int = Abs(tbxAnzahl.Text)";
_val = (int) (__c.Abs((double)(Double.parseDouble(__ref._tbxanzahl /*anywheresoftware.b4a.objects.EditTextWrapper*/ .getText()))));
RDebugUtils.currentLine=10289161;
 //BA.debugLineNum = 10289161;BA.debugLine="tbxAnzahl.Text = val";
__ref._tbxanzahl /*anywheresoftware.b4a.objects.EditTextWrapper*/ .setText(BA.ObjectToCharSequence(_val));
 };
RDebugUtils.currentLine=10289163;
 //BA.debugLineNum = 10289163;BA.debugLine="pruefeInhalt";
__ref._pruefeinhalt /*String*/ (null);
RDebugUtils.currentLine=10289164;
 //BA.debugLineNum = 10289164;BA.debugLine="tbxAnzahl.SelectionStart = tbxAnzahl.Text.Length";
__ref._tbxanzahl /*anywheresoftware.b4a.objects.EditTextWrapper*/ .setSelectionStart(__ref._tbxanzahl /*anywheresoftware.b4a.objects.EditTextWrapper*/ .getText().length());
 };
RDebugUtils.currentLine=10289166;
 //BA.debugLineNum = 10289166;BA.debugLine="dochange = True";
__ref._dochange /*boolean*/  = __c.True;
RDebugUtils.currentLine=10289167;
 //BA.debugLineNum = 10289167;BA.debugLine="startTimer";
__ref._starttimer /*String*/ (null);
RDebugUtils.currentLine=10289168;
 //BA.debugLineNum = 10289168;BA.debugLine="End Sub";
return "";
}
public String  _tbxteilnehmer_focuschanged(b4a.example.settings __ref,boolean _hasfocus) throws Exception{
__ref = this;
RDebugUtils.currentModule="settings";
if (Debug.shouldDelegate(ba, "tbxteilnehmer_focuschanged", false))
	 {return ((String) Debug.delegate(ba, "tbxteilnehmer_focuschanged", new Object[] {_hasfocus}));}
RDebugUtils.currentLine=10354688;
 //BA.debugLineNum = 10354688;BA.debugLine="Private Sub tbxTeilnehmer_FocusChanged (HasFocus A";
RDebugUtils.currentLine=10354689;
 //BA.debugLineNum = 10354689;BA.debugLine="If HasFocus Then";
if (_hasfocus) { 
RDebugUtils.currentLine=10354690;
 //BA.debugLineNum = 10354690;BA.debugLine="tbxTeilnehmer.SelectionStart = tbxTeilnehmer.Tex";
__ref._tbxteilnehmer /*anywheresoftware.b4a.objects.EditTextWrapper*/ .setSelectionStart(__ref._tbxteilnehmer /*anywheresoftware.b4a.objects.EditTextWrapper*/ .getText().length());
 }else {
RDebugUtils.currentLine=10354692;
 //BA.debugLineNum = 10354692;BA.debugLine="HideKeyboard";
__ref._hidekeyboard /*String*/ (null);
 };
RDebugUtils.currentLine=10354694;
 //BA.debugLineNum = 10354694;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=10420224;
 //BA.debugLineNum = 10420224;BA.debugLine="Private Sub tbxTeilnehmer_TextChanged (Old As Stri";
RDebugUtils.currentLine=10420225;
 //BA.debugLineNum = 10420225;BA.debugLine="Log(\"tbxTeilnehmer_TextChanged\")";
__c.LogImpl("310420225","tbxTeilnehmer_TextChanged",0);
RDebugUtils.currentLine=10420226;
 //BA.debugLineNum = 10420226;BA.debugLine="Log(\"dochange = \" & dochange)";
__c.LogImpl("310420226","dochange = "+BA.ObjectToString(__ref._dochange /*boolean*/ ),0);
RDebugUtils.currentLine=10420227;
 //BA.debugLineNum = 10420227;BA.debugLine="If dochange = False Then Return";
if (__ref._dochange /*boolean*/ ==__c.False) { 
if (true) return "";};
RDebugUtils.currentLine=10420229;
 //BA.debugLineNum = 10420229;BA.debugLine="dochange = False";
__ref._dochange /*boolean*/  = __c.False;
RDebugUtils.currentLine=10420230;
 //BA.debugLineNum = 10420230;BA.debugLine="Dim cleaned As String = Regex.Replace(\"[^a-zA-Z0-";
_cleaned = __c.Regex.Replace("[^a-zA-Z0-9äöüÄÖÜßéèêëáàâçñ -]",__ref._tbxteilnehmer /*anywheresoftware.b4a.objects.EditTextWrapper*/ .getText(),"");
RDebugUtils.currentLine=10420232;
 //BA.debugLineNum = 10420232;BA.debugLine="Dim sb As StringBuilder";
_sb = new anywheresoftware.b4a.keywords.StringBuilderWrapper();
RDebugUtils.currentLine=10420233;
 //BA.debugLineNum = 10420233;BA.debugLine="sb.Initialize";
_sb.Initialize();
RDebugUtils.currentLine=10420234;
 //BA.debugLineNum = 10420234;BA.debugLine="Dim doupper As Boolean = True";
_doupper = __c.True;
RDebugUtils.currentLine=10420235;
 //BA.debugLineNum = 10420235;BA.debugLine="For i = 0 To cleaned.Length - 1";
{
final int step9 = 1;
final int limit9 = (int) (_cleaned.length()-1);
_i = (int) (0) ;
for (;_i <= limit9 ;_i = _i + step9 ) {
RDebugUtils.currentLine=10420236;
 //BA.debugLineNum = 10420236;BA.debugLine="Dim letter As String = cleaned.SubString2(i, i +";
_letter = _cleaned.substring(_i,(int) (_i+1));
RDebugUtils.currentLine=10420237;
 //BA.debugLineNum = 10420237;BA.debugLine="If letter = \" \" Or letter = \"-\" Then";
if ((_letter).equals(" ") || (_letter).equals("-")) { 
RDebugUtils.currentLine=10420238;
 //BA.debugLineNum = 10420238;BA.debugLine="doupper = True";
_doupper = __c.True;
RDebugUtils.currentLine=10420239;
 //BA.debugLineNum = 10420239;BA.debugLine="sb.Append(letter)";
_sb.Append(_letter);
 }else 
{RDebugUtils.currentLine=10420240;
 //BA.debugLineNum = 10420240;BA.debugLine="Else if letter = \",\" Then";
if ((_letter).equals(",")) { 
 }else 
{RDebugUtils.currentLine=10420242;
 //BA.debugLineNum = 10420242;BA.debugLine="Else if doupper Then";
if (_doupper) { 
RDebugUtils.currentLine=10420243;
 //BA.debugLineNum = 10420243;BA.debugLine="sb.Append(letter.ToUpperCase)";
_sb.Append(_letter.toUpperCase(anywheresoftware.b4a.keywords.Common.stringLocale));
RDebugUtils.currentLine=10420244;
 //BA.debugLineNum = 10420244;BA.debugLine="doupper = False";
_doupper = __c.False;
 }else {
RDebugUtils.currentLine=10420246;
 //BA.debugLineNum = 10420246;BA.debugLine="sb.Append(letter)";
_sb.Append(_letter);
 }}}
;
 }
};
RDebugUtils.currentLine=10420249;
 //BA.debugLineNum = 10420249;BA.debugLine="tbxTeilnehmer.Text = sb.ToString";
__ref._tbxteilnehmer /*anywheresoftware.b4a.objects.EditTextWrapper*/ .setText(BA.ObjectToCharSequence(_sb.ToString()));
RDebugUtils.currentLine=10420251;
 //BA.debugLineNum = 10420251;BA.debugLine="btnTLNDelete.TextColor = 0xFF888888";
__ref._btntlndelete /*anywheresoftware.b4a.objects.ButtonWrapper*/ .setTextColor(((int)0xff888888));
RDebugUtils.currentLine=10420252;
 //BA.debugLineNum = 10420252;BA.debugLine="btnTLNDelete.Enabled = False";
__ref._btntlndelete /*anywheresoftware.b4a.objects.ButtonWrapper*/ .setEnabled(__c.False);
RDebugUtils.currentLine=10420254;
 //BA.debugLineNum = 10420254;BA.debugLine="If tbxTeilnehmer.Text.Length >= 3 Then";
if (__ref._tbxteilnehmer /*anywheresoftware.b4a.objects.EditTextWrapper*/ .getText().length()>=3) { 
RDebugUtils.currentLine=10420255;
 //BA.debugLineNum = 10420255;BA.debugLine="btnTLNSpeichern.TextColor = colorgreen";
__ref._btntlnspeichern /*anywheresoftware.b4a.objects.ButtonWrapper*/ .setTextColor(__ref._colorgreen /*int*/ );
RDebugUtils.currentLine=10420256;
 //BA.debugLineNum = 10420256;BA.debugLine="btnTLNSpeichern.Enabled = True";
__ref._btntlnspeichern /*anywheresoftware.b4a.objects.ButtonWrapper*/ .setEnabled(__c.True);
 }else {
RDebugUtils.currentLine=10420258;
 //BA.debugLineNum = 10420258;BA.debugLine="btnTLNSpeichern.TextColor = 0xFF888888";
__ref._btntlnspeichern /*anywheresoftware.b4a.objects.ButtonWrapper*/ .setTextColor(((int)0xff888888));
RDebugUtils.currentLine=10420259;
 //BA.debugLineNum = 10420259;BA.debugLine="btnTLNSpeichern.Enabled = False";
__ref._btntlnspeichern /*anywheresoftware.b4a.objects.ButtonWrapper*/ .setEnabled(__c.False);
 };
RDebugUtils.currentLine=10420262;
 //BA.debugLineNum = 10420262;BA.debugLine="dochange = True";
__ref._dochange /*boolean*/  = __c.True;
RDebugUtils.currentLine=10420263;
 //BA.debugLineNum = 10420263;BA.debugLine="tbxTeilnehmer.SelectionStart = tbxTeilnehmer.Text";
__ref._tbxteilnehmer /*anywheresoftware.b4a.objects.EditTextWrapper*/ .setSelectionStart(__ref._tbxteilnehmer /*anywheresoftware.b4a.objects.EditTextWrapper*/ .getText().length());
RDebugUtils.currentLine=10420264;
 //BA.debugLineNum = 10420264;BA.debugLine="startTimer";
__ref._starttimer /*String*/ (null);
RDebugUtils.currentLine=10420265;
 //BA.debugLineNum = 10420265;BA.debugLine="End Sub";
return "";
}
public String  _tbxveranstaltung_focuschanged(b4a.example.settings __ref,boolean _hasfocus) throws Exception{
__ref = this;
RDebugUtils.currentModule="settings";
if (Debug.shouldDelegate(ba, "tbxveranstaltung_focuschanged", false))
	 {return ((String) Debug.delegate(ba, "tbxveranstaltung_focuschanged", new Object[] {_hasfocus}));}
RDebugUtils.currentLine=10092544;
 //BA.debugLineNum = 10092544;BA.debugLine="Private Sub tbxVeranstaltung_FocusChanged (HasFocu";
RDebugUtils.currentLine=10092545;
 //BA.debugLineNum = 10092545;BA.debugLine="If HasFocus Then";
if (_hasfocus) { 
RDebugUtils.currentLine=10092546;
 //BA.debugLineNum = 10092546;BA.debugLine="tbxVeranstaltung.SelectionStart = tbxVeranstaltu";
__ref._tbxveranstaltung /*anywheresoftware.b4a.objects.EditTextWrapper*/ .setSelectionStart(__ref._tbxveranstaltung /*anywheresoftware.b4a.objects.EditTextWrapper*/ .getText().length());
 }else {
RDebugUtils.currentLine=10092548;
 //BA.debugLineNum = 10092548;BA.debugLine="HideKeyboard";
__ref._hidekeyboard /*String*/ (null);
 };
RDebugUtils.currentLine=10092550;
 //BA.debugLineNum = 10092550;BA.debugLine="End Sub";
return "";
}
public String  _tbxveranstaltung_textchanged(b4a.example.settings __ref,String _old,String _new) throws Exception{
__ref = this;
RDebugUtils.currentModule="settings";
if (Debug.shouldDelegate(ba, "tbxveranstaltung_textchanged", false))
	 {return ((String) Debug.delegate(ba, "tbxveranstaltung_textchanged", new Object[] {_old,_new}));}
RDebugUtils.currentLine=10158080;
 //BA.debugLineNum = 10158080;BA.debugLine="Private Sub tbxVeranstaltung_TextChanged (Old As S";
RDebugUtils.currentLine=10158081;
 //BA.debugLineNum = 10158081;BA.debugLine="Log(\"tbxVeranstaltung_TextChanged\")";
__c.LogImpl("310158081","tbxVeranstaltung_TextChanged",0);
RDebugUtils.currentLine=10158082;
 //BA.debugLineNum = 10158082;BA.debugLine="Log(\"dochange = \" & dochange)";
__c.LogImpl("310158082","dochange = "+BA.ObjectToString(__ref._dochange /*boolean*/ ),0);
RDebugUtils.currentLine=10158083;
 //BA.debugLineNum = 10158083;BA.debugLine="If dochange = False Then Return";
if (__ref._dochange /*boolean*/ ==__c.False) { 
if (true) return "";};
RDebugUtils.currentLine=10158085;
 //BA.debugLineNum = 10158085;BA.debugLine="dochange = False";
__ref._dochange /*boolean*/  = __c.False;
RDebugUtils.currentLine=10158086;
 //BA.debugLineNum = 10158086;BA.debugLine="If tbxVeranstaltung.Enabled Then";
if (__ref._tbxveranstaltung /*anywheresoftware.b4a.objects.EditTextWrapper*/ .getEnabled()) { 
RDebugUtils.currentLine=10158087;
 //BA.debugLineNum = 10158087;BA.debugLine="pruefeInhalt";
__ref._pruefeinhalt /*String*/ (null);
 };
RDebugUtils.currentLine=10158089;
 //BA.debugLineNum = 10158089;BA.debugLine="dochange = True";
__ref._dochange /*boolean*/  = __c.True;
RDebugUtils.currentLine=10158090;
 //BA.debugLineNum = 10158090;BA.debugLine="startTimer";
__ref._starttimer /*String*/ (null);
RDebugUtils.currentLine=10158091;
 //BA.debugLineNum = 10158091;BA.debugLine="End Sub";
return "";
}
public String  _uhrzeit_tick(b4a.example.settings __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="settings";
if (Debug.shouldDelegate(ba, "uhrzeit_tick", false))
	 {return ((String) Debug.delegate(ba, "uhrzeit_tick", null));}
RDebugUtils.currentLine=10551296;
 //BA.debugLineNum = 10551296;BA.debugLine="Private Sub Uhrzeit_Tick";
RDebugUtils.currentLine=10551297;
 //BA.debugLineNum = 10551297;BA.debugLine="Uhrzeit.Enabled = False";
__ref._uhrzeit /*anywheresoftware.b4a.objects.Timer*/ .setEnabled(__c.False);
RDebugUtils.currentLine=10551298;
 //BA.debugLineNum = 10551298;BA.debugLine="B4XPages.ShowPage(\"ScreenSaver\")";
_b4xpages._showpage /*String*/ (ba,"ScreenSaver");
RDebugUtils.currentLine=10551299;
 //BA.debugLineNum = 10551299;BA.debugLine="End Sub";
return "";
}
}