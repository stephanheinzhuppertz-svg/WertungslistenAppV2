package b4a.example;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.debug.*;

public class screenmain extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    private static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new anywheresoftware.b4a.ShellBA(_ba, this, htSubs, "b4a.example.screenmain");
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            
        }
        if (BA.isShellModeRuntimeCheck(ba)) 
			   this.getClass().getMethod("_class_globals", b4a.example.screenmain.class).invoke(this, new Object[] {null});
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
public String _dbdatentyp = "";
public String _urltest = "";
public anywheresoftware.b4a.objects.collections.List _teilnehmer = null;
public String _urlveranstaltungen = "";
public String _tlnlastid = "";
public String _urlteilnehmer = "";
public anywheresoftware.b4a.objects.collections.List _webviewdata = null;
public String _urlergebnisse = "";
public int _platzselected = 0;
public String _urlfdj = "";
public int _selectnewrow = 0;
public String _urllastchange = "";
public boolean _dochange = false;
public boolean _addtln = false;
public boolean _vstnggeschlossen = false;
public anywheresoftware.b4a.objects.collections.Map _status = null;
public int _colorgreen = 0;
public anywheresoftware.b4a.objects.LabelWrapper _lblverein = null;
public anywheresoftware.b4a.objects.LabelWrapper _lblveranstaltung = null;
public anywheresoftware.b4a.objects.LabelWrapper _lbldatum = null;
public anywheresoftware.b4a.objects.ButtonWrapper _btnsettings = null;
public anywheresoftware.b4a.objects.PanelWrapper _vaeingabe = null;
public anywheresoftware.b4a.objects.ButtonWrapper _btnclosevstng = null;
public anywheresoftware.b4a.objects.ButtonWrapper _btnup = null;
public anywheresoftware.b4a.objects.ButtonWrapper _btnminus = null;
public anywheresoftware.b4a.objects.SpinnerWrapper _spnplatz = null;
public anywheresoftware.b4a.objects.ButtonWrapper _btnplus = null;
public anywheresoftware.b4a.objects.EditTextWrapper _tbxteilnehmer = null;
public anywheresoftware.b4a.objects.ListViewWrapper _lsvname = null;
public anywheresoftware.b4a.objects.PanelWrapper _vaergeingabe = null;
public anywheresoftware.b4a.objects.ButtonWrapper _btnfdjeingabe = null;
public anywheresoftware.b4a.objects.EditTextWrapper _tbxgramm = null;
public anywheresoftware.b4a.objects.ButtonWrapper _btnspeichern = null;
public anywheresoftware.b4a.objects.PanelWrapper _vafdj = null;
public anywheresoftware.b4a.objects.ButtonWrapper _btnfdjback = null;
public anywheresoftware.b4a.objects.EditTextWrapper _tbxfdjgewicht = null;
public anywheresoftware.b4a.objects.ButtonWrapper _btnfdjsave = null;
public anywheresoftware.b4a.objects.PanelWrapper _hadown = null;
public anywheresoftware.b4a.objects.ButtonWrapper _btnshare = null;
public anywheresoftware.b4a.objects.ButtonWrapper _btndown = null;
public anywheresoftware.b4a.objects.WebViewWrapper _webergebnis = null;
public anywheresoftware.b4a.objects.Timer _uhrzeit = null;
public anywheresoftware.b4a.objects.collections.Map _dbverein = null;
public String _dbfilename = "";
public String _currentweburl = "";
public String _currentwebviewstring = "";
public anywheresoftware.b4a.objects.collections.List _spnitems = null;
public b4a.example.dateutils _dateutils = null;
public b4a.example.main _main = null;
public b4a.example.b4xpages _b4xpages = null;
public b4a.example.b4xcollections _b4xcollections = null;
public b4a.example.httputils2service _httputils2service = null;
public b4a.example.xuiviewsutils _xuiviewsutils = null;
public String  _initialize(b4a.example.screenmain __ref,anywheresoftware.b4a.BA _ba) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="screenmain";
if (Debug.shouldDelegate(ba, "initialize", false))
	 {return ((String) Debug.delegate(ba, "initialize", new Object[] {_ba}));}
RDebugUtils.currentLine=39649280;
 //BA.debugLineNum = 39649280;BA.debugLine="Public Sub Initialize";
RDebugUtils.currentLine=39649281;
 //BA.debugLineNum = 39649281;BA.debugLine="Teilnehmer.Initialize";
__ref._teilnehmer /*anywheresoftware.b4a.objects.collections.List*/ .Initialize();
RDebugUtils.currentLine=39649282;
 //BA.debugLineNum = 39649282;BA.debugLine="webviewData.Initialize";
__ref._webviewdata /*anywheresoftware.b4a.objects.collections.List*/ .Initialize();
RDebugUtils.currentLine=39649283;
 //BA.debugLineNum = 39649283;BA.debugLine="Status.Initialize";
__ref._status /*anywheresoftware.b4a.objects.collections.Map*/ .Initialize();
RDebugUtils.currentLine=39649284;
 //BA.debugLineNum = 39649284;BA.debugLine="spnItems.Initialize";
__ref._spnitems /*anywheresoftware.b4a.objects.collections.List*/ .Initialize();
RDebugUtils.currentLine=39649285;
 //BA.debugLineNum = 39649285;BA.debugLine="LoadTinyDB";
__ref._loadtinydb /*String*/ (null);
RDebugUtils.currentLine=39649286;
 //BA.debugLineNum = 39649286;BA.debugLine="Uhrzeit.Initialize(\"Uhrzeit\", 300000) ' 1000 * 30";
__ref._uhrzeit /*anywheresoftware.b4a.objects.Timer*/ .Initialize(ba,"Uhrzeit",(long) (300000));
RDebugUtils.currentLine=39649287;
 //BA.debugLineNum = 39649287;BA.debugLine="End Sub";
return "";
}
public String  _addteilnehmer(b4a.example.screenmain __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="screenmain";
if (Debug.shouldDelegate(ba, "addteilnehmer", false))
	 {return ((String) Debug.delegate(ba, "addteilnehmer", null));}
String _tname = "";
int _nextid = 0;
String _dbkey = "";
anywheresoftware.b4a.objects.collections.Map _tln = null;
anywheresoftware.b4a.objects.collections.JSONParser.JSONGenerator _jg = null;
RDebugUtils.currentLine=41549824;
 //BA.debugLineNum = 41549824;BA.debugLine="Private Sub addTeilnehmer";
RDebugUtils.currentLine=41549825;
 //BA.debugLineNum = 41549825;BA.debugLine="Dim tName As String = tbxTeilnehmer.Text.Trim";
_tname = __ref._tbxteilnehmer /*anywheresoftware.b4a.objects.EditTextWrapper*/ .getText().trim();
RDebugUtils.currentLine=41549826;
 //BA.debugLineNum = 41549826;BA.debugLine="If tName <> \"\" And Teilnehmer.IndexOf(tName) = -1";
if ((_tname).equals("") == false && __ref._teilnehmer /*anywheresoftware.b4a.objects.collections.List*/ .IndexOf((Object)(_tname))==-1) { 
RDebugUtils.currentLine=41549827;
 //BA.debugLineNum = 41549827;BA.debugLine="addTLN = True";
__ref._addtln /*boolean*/  = __c.True;
RDebugUtils.currentLine=41549828;
 //BA.debugLineNum = 41549828;BA.debugLine="Teilnehmer.Add(tName)";
__ref._teilnehmer /*anywheresoftware.b4a.objects.collections.List*/ .Add((Object)(_tname));
RDebugUtils.currentLine=41549829;
 //BA.debugLineNum = 41549829;BA.debugLine="Teilnehmer.Sort(True)";
__ref._teilnehmer /*anywheresoftware.b4a.objects.collections.List*/ .Sort(__c.True);
RDebugUtils.currentLine=41549830;
 //BA.debugLineNum = 41549830;BA.debugLine="DBPut(\"letzteÄnderung\", CreateMap(\"Änderung\": Tr";
__ref._dbput /*String*/ (null,"letzteÄnderung",(Object)(__c.createMap(new Object[] {(Object)("Änderung"),(Object)(__c.True),(Object)("Datum"),(Object)(__c.DateTime.getNow())}).getObject()));
RDebugUtils.currentLine=41549831;
 //BA.debugLineNum = 41549831;BA.debugLine="DBPut(\"Teilnehmer\", Teilnehmer)";
__ref._dbput /*String*/ (null,"Teilnehmer",(Object)(__ref._teilnehmer /*anywheresoftware.b4a.objects.collections.List*/ .getObject()));
RDebugUtils.currentLine=41549833;
 //BA.debugLineNum = 41549833;BA.debugLine="Dim nextId As Int = TLNlastID.Replace(\"t\", \"\") +";
_nextid = (int) ((double)(Double.parseDouble(__ref._tlnlastid /*String*/ .replace("t","")))+1);
RDebugUtils.currentLine=41549834;
 //BA.debugLineNum = 41549834;BA.debugLine="Dim DBkey As String = \"t\" & nextId";
_dbkey = "t"+BA.NumberToString(_nextid);
RDebugUtils.currentLine=41549835;
 //BA.debugLineNum = 41549835;BA.debugLine="TLNlastID = DBkey";
__ref._tlnlastid /*String*/  = _dbkey;
RDebugUtils.currentLine=41549837;
 //BA.debugLineNum = 41549837;BA.debugLine="Dim tln As Map = CreateMap(\"Name\": tName)";
_tln = new anywheresoftware.b4a.objects.collections.Map();
_tln = __c.createMap(new Object[] {(Object)("Name"),(Object)(_tname)});
RDebugUtils.currentLine=41549838;
 //BA.debugLineNum = 41549838;BA.debugLine="CurrentWebUrl = URLteilnehmer & \"/\" & DBkey & \".";
__ref._currentweburl /*String*/  = __ref._urlteilnehmer /*String*/ +"/"+_dbkey+".json?auth="+BA.ObjectToString(__ref._status /*anywheresoftware.b4a.objects.collections.Map*/ .GetDefault((Object)("idToken"),(Object)("")));
RDebugUtils.currentLine=41549839;
 //BA.debugLineNum = 41549839;BA.debugLine="DBdatenTyp = \"addTLN\"";
__ref._dbdatentyp /*String*/  = "addTLN";
RDebugUtils.currentLine=41549841;
 //BA.debugLineNum = 41549841;BA.debugLine="Dim jg As JSONGenerator";
_jg = new anywheresoftware.b4a.objects.collections.JSONParser.JSONGenerator();
RDebugUtils.currentLine=41549842;
 //BA.debugLineNum = 41549842;BA.debugLine="jg.Initialize(tln)";
_jg.Initialize(_tln);
RDebugUtils.currentLine=41549843;
 //BA.debugLineNum = 41549843;BA.debugLine="PutTextWeb(jg.ToString)";
__ref._puttextweb /*String*/ (null,_jg.ToString());
 };
RDebugUtils.currentLine=41549845;
 //BA.debugLineNum = 41549845;BA.debugLine="End Sub";
return "";
}
public String  _dbput(b4a.example.screenmain __ref,String _key,Object _value) throws Exception{
__ref = this;
RDebugUtils.currentModule="screenmain";
if (Debug.shouldDelegate(ba, "dbput", false))
	 {return ((String) Debug.delegate(ba, "dbput", new Object[] {_key,_value}));}
anywheresoftware.b4a.objects.collections.JSONParser.JSONGenerator _jg = null;
RDebugUtils.currentLine=43974656;
 //BA.debugLineNum = 43974656;BA.debugLine="Private Sub DBPut(Key As String, Value As Object)";
RDebugUtils.currentLine=43974657;
 //BA.debugLineNum = 43974657;BA.debugLine="If Value Is Map Then";
if (_value instanceof java.util.Map) { 
RDebugUtils.currentLine=43974658;
 //BA.debugLineNum = 43974658;BA.debugLine="Dim jg As JSONGenerator";
_jg = new anywheresoftware.b4a.objects.collections.JSONParser.JSONGenerator();
RDebugUtils.currentLine=43974659;
 //BA.debugLineNum = 43974659;BA.debugLine="jg.Initialize(Value)";
_jg.Initialize((anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_value)));
RDebugUtils.currentLine=43974660;
 //BA.debugLineNum = 43974660;BA.debugLine="DBVerein.Put(Key, \"JSON_MAP:\" & jg.ToString)";
__ref._dbverein /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)(_key),(Object)("JSON_MAP:"+_jg.ToString()));
 }else 
{RDebugUtils.currentLine=43974661;
 //BA.debugLineNum = 43974661;BA.debugLine="Else If Value Is List Then";
if (_value instanceof java.util.List) { 
RDebugUtils.currentLine=43974662;
 //BA.debugLineNum = 43974662;BA.debugLine="Dim jg As JSONGenerator";
_jg = new anywheresoftware.b4a.objects.collections.JSONParser.JSONGenerator();
RDebugUtils.currentLine=43974663;
 //BA.debugLineNum = 43974663;BA.debugLine="jg.Initialize2(Value)";
_jg.Initialize2((anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_value)));
RDebugUtils.currentLine=43974664;
 //BA.debugLineNum = 43974664;BA.debugLine="DBVerein.Put(Key, \"JSON_LIST:\" & jg.ToString)";
__ref._dbverein /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)(_key),(Object)("JSON_LIST:"+_jg.ToString()));
 }else {
RDebugUtils.currentLine=43974666;
 //BA.debugLineNum = 43974666;BA.debugLine="DBVerein.Put(Key, Value)";
__ref._dbverein /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)(_key),_value);
 }}
;
RDebugUtils.currentLine=43974668;
 //BA.debugLineNum = 43974668;BA.debugLine="File.WriteMap(File.DirInternal, DBFileName, DBVer";
__c.File.WriteMap(__c.File.getDirInternal(),__ref._dbfilename /*String*/ ,__ref._dbverein /*anywheresoftware.b4a.objects.collections.Map*/ );
RDebugUtils.currentLine=43974669;
 //BA.debugLineNum = 43974669;BA.debugLine="End Sub";
return "";
}
public String  _puttextweb(b4a.example.screenmain __ref,String _text) throws Exception{
__ref = this;
RDebugUtils.currentModule="screenmain";
if (Debug.shouldDelegate(ba, "puttextweb", false))
	 {return ((String) Debug.delegate(ba, "puttextweb", new Object[] {_text}));}
RDebugUtils.currentLine=41877504;
 //BA.debugLineNum = 41877504;BA.debugLine="Private Sub PutTextWeb(text As String)";
RDebugUtils.currentLine=41877505;
 //BA.debugLineNum = 41877505;BA.debugLine="If True = Status.GetDefault(\"ProgOffline\", True)";
if (__c.True==BA.ObjectToBoolean(__ref._status /*anywheresoftware.b4a.objects.collections.Map*/ .GetDefault((Object)("ProgOffline"),(Object)(__c.True)))) { 
RDebugUtils.currentLine=41877506;
 //BA.debugLineNum = 41877506;BA.debugLine="GotTextOffline";
__ref._gottextoffline /*String*/ (null);
 }else {
RDebugUtils.currentLine=41877508;
 //BA.debugLineNum = 41877508;BA.debugLine="ExecuteHttp(\"PUT\", CurrentWebUrl, text)";
__ref._executehttp /*void*/ (null,"PUT",__ref._currentweburl /*String*/ ,_text);
 };
RDebugUtils.currentLine=41877510;
 //BA.debugLineNum = 41877510;BA.debugLine="End Sub";
return "";
}
public String  _b4xpage_appear(b4a.example.screenmain __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="screenmain";
if (Debug.shouldDelegate(ba, "b4xpage_appear", false))
	 {return ((String) Debug.delegate(ba, "b4xpage_appear", null));}
RDebugUtils.currentLine=39780352;
 //BA.debugLineNum = 39780352;BA.debugLine="Public Sub B4XPage_Appear";
RDebugUtils.currentLine=39780354;
 //BA.debugLineNum = 39780354;BA.debugLine="If B4XPages.MainPage.Status.IsInitialized And B4X";
if (_b4xpages._mainpage /*b4a.example.b4xmainpage*/ (ba)._status /*anywheresoftware.b4a.objects.collections.Map*/ .IsInitialized() && _b4xpages._mainpage /*b4a.example.b4xmainpage*/ (ba)._status /*anywheresoftware.b4a.objects.collections.Map*/ .getSize()>0) { 
RDebugUtils.currentLine=39780355;
 //BA.debugLineNum = 39780355;BA.debugLine="Status = B4XPages.MainPage.Status";
__ref._status /*anywheresoftware.b4a.objects.collections.Map*/  = _b4xpages._mainpage /*b4a.example.b4xmainpage*/ (ba)._status /*anywheresoftware.b4a.objects.collections.Map*/ ;
 };
RDebugUtils.currentLine=39780358;
 //BA.debugLineNum = 39780358;BA.debugLine="colorgreen = lblVerein.TextColor";
__ref._colorgreen /*int*/  = __ref._lblverein /*anywheresoftware.b4a.objects.LabelWrapper*/ .getTextColor();
RDebugUtils.currentLine=39780360;
 //BA.debugLineNum = 39780360;BA.debugLine="If Status.GetDefault(\"idToken\", \"\") = \"\" Then";
if ((__ref._status /*anywheresoftware.b4a.objects.collections.Map*/ .GetDefault((Object)("idToken"),(Object)(""))).equals((Object)(""))) { 
RDebugUtils.currentLine=39780361;
 //BA.debugLineNum = 39780361;BA.debugLine="B4XPages.ClosePage(Me)";
_b4xpages._closepage /*String*/ (ba,this);
RDebugUtils.currentLine=39780362;
 //BA.debugLineNum = 39780362;BA.debugLine="Return";
if (true) return "";
 };
RDebugUtils.currentLine=39780365;
 //BA.debugLineNum = 39780365;BA.debugLine="If False = Status.GetDefault(\"debug\", False) Then";
if (__c.False==BA.ObjectToBoolean(__ref._status /*anywheresoftware.b4a.objects.collections.Map*/ .GetDefault((Object)("debug"),(Object)(__c.False)))) { 
RDebugUtils.currentLine=39780366;
 //BA.debugLineNum = 39780366;BA.debugLine="initialisiere";
__ref._initialisiere /*void*/ (null);
 };
RDebugUtils.currentLine=39780368;
 //BA.debugLineNum = 39780368;BA.debugLine="startTimer";
__ref._starttimer /*String*/ (null);
RDebugUtils.currentLine=39780369;
 //BA.debugLineNum = 39780369;BA.debugLine="End Sub";
return "";
}
public void  _initialisiere(b4a.example.screenmain __ref) throws Exception{
RDebugUtils.currentModule="screenmain";
if (Debug.shouldDelegate(ba, "initialisiere", false))
	 {Debug.delegate(ba, "initialisiere", null); return;}
ResumableSub_initialisiere rsub = new ResumableSub_initialisiere(this,__ref);
rsub.resume(ba, null);
}
public static class ResumableSub_initialisiere extends BA.ResumableSub {
public ResumableSub_initialisiere(b4a.example.screenmain parent,b4a.example.screenmain __ref) {
this.parent = parent;
this.__ref = __ref;
this.__ref = parent;
}
b4a.example.screenmain __ref;
b4a.example.screenmain parent;
int _anzahl = 0;
int _i = 0;
boolean _offline = false;
String _vid = "";
int _res;
int step25;
int limit25;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="screenmain";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=40239105;
 //BA.debugLineNum = 40239105;BA.debugLine="Teilnehmer.Initialize";
__ref._teilnehmer /*anywheresoftware.b4a.objects.collections.List*/ .Initialize();
RDebugUtils.currentLine=40239106;
 //BA.debugLineNum = 40239106;BA.debugLine="DBdatenTyp = \"\"";
__ref._dbdatentyp /*String*/  = "";
RDebugUtils.currentLine=40239107;
 //BA.debugLineNum = 40239107;BA.debugLine="TLNlastID = \"t0\"";
__ref._tlnlastid /*String*/  = "t0";
RDebugUtils.currentLine=40239108;
 //BA.debugLineNum = 40239108;BA.debugLine="webviewData.Initialize";
__ref._webviewdata /*anywheresoftware.b4a.objects.collections.List*/ .Initialize();
RDebugUtils.currentLine=40239109;
 //BA.debugLineNum = 40239109;BA.debugLine="PlatzSelected = 1";
__ref._platzselected /*int*/  = (int) (1);
RDebugUtils.currentLine=40239110;
 //BA.debugLineNum = 40239110;BA.debugLine="dochange = True";
__ref._dochange /*boolean*/  = parent.__c.True;
RDebugUtils.currentLine=40239111;
 //BA.debugLineNum = 40239111;BA.debugLine="addTLN = False";
__ref._addtln /*boolean*/  = parent.__c.False;
RDebugUtils.currentLine=40239112;
 //BA.debugLineNum = 40239112;BA.debugLine="VSTNGgeschlossen = False";
__ref._vstnggeschlossen /*boolean*/  = parent.__c.False;
RDebugUtils.currentLine=40239114;
 //BA.debugLineNum = 40239114;BA.debugLine="disableEingabe";
__ref._disableeingabe /*String*/ (null);
RDebugUtils.currentLine=40239115;
 //BA.debugLineNum = 40239115;BA.debugLine="setzeHeaderfromDB";
__ref._setzeheaderfromdb /*String*/ (null);
RDebugUtils.currentLine=40239116;
 //BA.debugLineNum = 40239116;BA.debugLine="changeURL";
__ref._changeurl /*String*/ (null);
RDebugUtils.currentLine=40239117;
 //BA.debugLineNum = 40239117;BA.debugLine="clear";
__ref._clear /*String*/ (null);
RDebugUtils.currentLine=40239119;
 //BA.debugLineNum = 40239119;BA.debugLine="haDown.Visible = False";
__ref._hadown /*anywheresoftware.b4a.objects.PanelWrapper*/ .setVisible(parent.__c.False);
RDebugUtils.currentLine=40239120;
 //BA.debugLineNum = 40239120;BA.debugLine="vaEingabe.Visible = True";
__ref._vaeingabe /*anywheresoftware.b4a.objects.PanelWrapper*/ .setVisible(parent.__c.True);
RDebugUtils.currentLine=40239121;
 //BA.debugLineNum = 40239121;BA.debugLine="vaErgEingabe.Visible = True";
__ref._vaergeingabe /*anywheresoftware.b4a.objects.PanelWrapper*/ .setVisible(parent.__c.True);
RDebugUtils.currentLine=40239122;
 //BA.debugLineNum = 40239122;BA.debugLine="vaFDJ.Visible = False";
__ref._vafdj /*anywheresoftware.b4a.objects.PanelWrapper*/ .setVisible(parent.__c.False);
RDebugUtils.currentLine=40239123;
 //BA.debugLineNum = 40239123;BA.debugLine="UpdateLayoutPositions";
__ref._updatelayoutpositions /*String*/ (null);
RDebugUtils.currentLine=40239125;
 //BA.debugLineNum = 40239125;BA.debugLine="lsvName.Clear";
__ref._lsvname /*anywheresoftware.b4a.objects.ListViewWrapper*/ .Clear();
RDebugUtils.currentLine=40239126;
 //BA.debugLineNum = 40239126;BA.debugLine="lsvName.Visible = False";
__ref._lsvname /*anywheresoftware.b4a.objects.ListViewWrapper*/ .setVisible(parent.__c.False);
RDebugUtils.currentLine=40239127;
 //BA.debugLineNum = 40239127;BA.debugLine="btnCloseVstng.Enabled = True";
__ref._btnclosevstng /*anywheresoftware.b4a.objects.ButtonWrapper*/ .setEnabled(parent.__c.True);
RDebugUtils.currentLine=40239128;
 //BA.debugLineNum = 40239128;BA.debugLine="SetButtonImageSafe(btnCloseVstng, \"close.png\", \"�";
__ref._setbuttonimagesafe /*String*/ (null,__ref._btnclosevstng /*anywheresoftware.b4a.objects.ButtonWrapper*/ ,"close.png","🔒");
RDebugUtils.currentLine=40239130;
 //BA.debugLineNum = 40239130;BA.debugLine="spnPlatz.Clear";
__ref._spnplatz /*anywheresoftware.b4a.objects.SpinnerWrapper*/ .Clear();
RDebugUtils.currentLine=40239131;
 //BA.debugLineNum = 40239131;BA.debugLine="spnItems.Clear";
__ref._spnitems /*anywheresoftware.b4a.objects.collections.List*/ .Clear();
RDebugUtils.currentLine=40239132;
 //BA.debugLineNum = 40239132;BA.debugLine="Dim anzahl As Int = DBGet(\"VeranstaltungAnzahl\",";
_anzahl = (int)(BA.ObjectToNumber(__ref._dbget /*Object*/ (null,"VeranstaltungAnzahl",(Object)("25"))));
RDebugUtils.currentLine=40239133;
 //BA.debugLineNum = 40239133;BA.debugLine="For i = 1 To anzahl";
if (true) break;

case 1:
//for
this.state = 4;
step25 = 1;
limit25 = _anzahl;
_i = (int) (1) ;
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
if (true) break;

case 3:
//C
this.state = 30;
RDebugUtils.currentLine=40239134;
 //BA.debugLineNum = 40239134;BA.debugLine="spnPlatz.Add(i)";
__ref._spnplatz /*anywheresoftware.b4a.objects.SpinnerWrapper*/ .Add(BA.NumberToString(_i));
RDebugUtils.currentLine=40239135;
 //BA.debugLineNum = 40239135;BA.debugLine="spnItems.Add(i)";
__ref._spnitems /*anywheresoftware.b4a.objects.collections.List*/ .Add((Object)(_i));
 if (true) break;
if (true) break;

case 4:
//C
this.state = 5;
;
RDebugUtils.currentLine=40239138;
 //BA.debugLineNum = 40239138;BA.debugLine="Dim offline As Boolean = Status.GetDefault(\"ProgO";
_offline = BA.ObjectToBoolean(__ref._status /*anywheresoftware.b4a.objects.collections.Map*/ .GetDefault((Object)("ProgOffline"),(Object)(parent.__c.True)));
RDebugUtils.currentLine=40239139;
 //BA.debugLineNum = 40239139;BA.debugLine="Dim vID As String = DBGet(\"VeranstaltungID\", \"v0\"";
_vid = BA.ObjectToString(__ref._dbget /*Object*/ (null,"VeranstaltungID",(Object)("v0")));
RDebugUtils.currentLine=40239140;
 //BA.debugLineNum = 40239140;BA.debugLine="If vID = \"v0\" Then";
if (true) break;

case 5:
//if
this.state = 28;
if ((_vid).equals("v0")) { 
this.state = 7;
}else {
this.state = 27;
}if (true) break;

case 7:
//C
this.state = 8;
RDebugUtils.currentLine=40239141;
 //BA.debugLineNum = 40239141;BA.debugLine="lblVeranstaltung.Text = \"- noch nicht ausgewählt";
__ref._lblveranstaltung /*anywheresoftware.b4a.objects.LabelWrapper*/ .setText(BA.ObjectToCharSequence("- noch nicht ausgewählt -"));
RDebugUtils.currentLine=40239142;
 //BA.debugLineNum = 40239142;BA.debugLine="lblDatum.Text = \"- bitte auswählen -\"";
__ref._lbldatum /*anywheresoftware.b4a.objects.LabelWrapper*/ .setText(BA.ObjectToCharSequence("- bitte auswählen -"));
RDebugUtils.currentLine=40239143;
 //BA.debugLineNum = 40239143;BA.debugLine="If offline Then";
if (true) break;

case 8:
//if
this.state = 25;
if (_offline) { 
this.state = 10;
}else {
this.state = 18;
}if (true) break;

case 10:
//C
this.state = 11;
RDebugUtils.currentLine=40239144;
 //BA.debugLineNum = 40239144;BA.debugLine="btnSettings.Visible = False";
__ref._btnsettings /*anywheresoftware.b4a.objects.ButtonWrapper*/ .setVisible(parent.__c.False);
RDebugUtils.currentLine=40239145;
 //BA.debugLineNum = 40239145;BA.debugLine="Msgbox2Async(\"Es wurde noch keine Veranstaltung";
parent.__c.Msgbox2Async(BA.ObjectToCharSequence("Es wurde noch keine Veranstaltung angelegt oder ausgewählt. Da keine Internet-Verbindung besteht, kann das Programm nicht weiter ausgeführt werden."),BA.ObjectToCharSequence("Veranstaltung fehlt"),"Beenden","","",(anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper(), (android.graphics.Bitmap)(parent.__c.Null)),ba,parent.__c.False);
RDebugUtils.currentLine=40239146;
 //BA.debugLineNum = 40239146;BA.debugLine="Wait For Msgbox_Result (res As Int)";
parent.__c.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "screenmain", "initialisiere"), null);
this.state = 31;
return;
case 31:
//C
this.state = 11;
_res = (Integer) result[1];
;
RDebugUtils.currentLine=40239147;
 //BA.debugLineNum = 40239147;BA.debugLine="If res = DialogResponse.POSITIVE Then ExitAppli";
if (true) break;

case 11:
//if
this.state = 16;
if (_res==parent.__c.DialogResponse.POSITIVE) { 
this.state = 13;
;}if (true) break;

case 13:
//C
this.state = 16;
parent.__c.ExitApplication();
if (true) break;

case 16:
//C
this.state = 25;
;
 if (true) break;

case 18:
//C
this.state = 19;
RDebugUtils.currentLine=40239149;
 //BA.debugLineNum = 40239149;BA.debugLine="Msgbox2Async(\"Es wurde noch keine Veranstaltung";
parent.__c.Msgbox2Async(BA.ObjectToCharSequence("Es wurde noch keine Veranstaltung angelegt oder ausgewählt. Bitte in den Einstellungen Veranstaltung auswählen."),BA.ObjectToCharSequence("Veranstaltung fehlt"),"anlegen/auswählen","","",(anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper(), (android.graphics.Bitmap)(parent.__c.Null)),ba,parent.__c.False);
RDebugUtils.currentLine=40239150;
 //BA.debugLineNum = 40239150;BA.debugLine="Wait For Msgbox_Result (res As Int)";
parent.__c.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "screenmain", "initialisiere"), null);
this.state = 32;
return;
case 32:
//C
this.state = 19;
_res = (Integer) result[1];
;
RDebugUtils.currentLine=40239151;
 //BA.debugLineNum = 40239151;BA.debugLine="If res = DialogResponse.POSITIVE Then OpenSetti";
if (true) break;

case 19:
//if
this.state = 24;
if (_res==parent.__c.DialogResponse.POSITIVE) { 
this.state = 21;
;}if (true) break;

case 21:
//C
this.state = 24;
__ref._opensettingspage /*String*/ (null);
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
RDebugUtils.currentLine=40239154;
 //BA.debugLineNum = 40239154;BA.debugLine="holeTLN";
__ref._holetln /*String*/ (null);
 if (true) break;

case 28:
//C
this.state = -1;
;
RDebugUtils.currentLine=40239156;
 //BA.debugLineNum = 40239156;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public String  _starttimer(b4a.example.screenmain __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="screenmain";
if (Debug.shouldDelegate(ba, "starttimer", false))
	 {return ((String) Debug.delegate(ba, "starttimer", null));}
RDebugUtils.currentLine=43581440;
 //BA.debugLineNum = 43581440;BA.debugLine="Private Sub startTimer";
RDebugUtils.currentLine=43581441;
 //BA.debugLineNum = 43581441;BA.debugLine="Uhrzeit.Enabled = False";
__ref._uhrzeit /*anywheresoftware.b4a.objects.Timer*/ .setEnabled(__c.False);
RDebugUtils.currentLine=43581442;
 //BA.debugLineNum = 43581442;BA.debugLine="Uhrzeit.Interval = 1000 * 300";
__ref._uhrzeit /*anywheresoftware.b4a.objects.Timer*/ .setInterval((long) (1000*300));
RDebugUtils.currentLine=43581443;
 //BA.debugLineNum = 43581443;BA.debugLine="Uhrzeit.Enabled = True";
__ref._uhrzeit /*anywheresoftware.b4a.objects.Timer*/ .setEnabled(__c.True);
RDebugUtils.currentLine=43581444;
 //BA.debugLineNum = 43581444;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _b4xpage_closerequest(b4a.example.screenmain __ref) throws Exception{
RDebugUtils.currentModule="screenmain";
if (Debug.shouldDelegate(ba, "b4xpage_closerequest", false))
	 {return ((anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) Debug.delegate(ba, "b4xpage_closerequest", null));}
ResumableSub_B4XPage_CloseRequest rsub = new ResumableSub_B4XPage_CloseRequest(this,__ref);
rsub.resume(ba, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_B4XPage_CloseRequest extends BA.ResumableSub {
public ResumableSub_B4XPage_CloseRequest(b4a.example.screenmain parent,b4a.example.screenmain __ref) {
this.parent = parent;
this.__ref = __ref;
this.__ref = parent;
}
b4a.example.screenmain __ref;
b4a.example.screenmain parent;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="screenmain";

    while (true) {
        switch (state) {
            case -1:
{
parent.__c.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = -1;
RDebugUtils.currentLine=39845889;
 //BA.debugLineNum = 39845889;BA.debugLine="Uhrzeit.Enabled = False";
__ref._uhrzeit /*anywheresoftware.b4a.objects.Timer*/ .setEnabled(parent.__c.False);
RDebugUtils.currentLine=39845890;
 //BA.debugLineNum = 39845890;BA.debugLine="Return True";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.True));return;};
RDebugUtils.currentLine=39845891;
 //BA.debugLineNum = 39845891;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public String  _b4xpage_created(b4a.example.screenmain __ref,anywheresoftware.b4a.objects.B4XViewWrapper _root1) throws Exception{
__ref = this;
RDebugUtils.currentModule="screenmain";
if (Debug.shouldDelegate(ba, "b4xpage_created", false))
	 {return ((String) Debug.delegate(ba, "b4xpage_created", new Object[] {_root1}));}
RDebugUtils.currentLine=39714816;
 //BA.debugLineNum = 39714816;BA.debugLine="Private Sub B4XPage_Created (Root1 As B4XView)";
RDebugUtils.currentLine=39714817;
 //BA.debugLineNum = 39714817;BA.debugLine="Root = Root1";
__ref._root /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = _root1;
RDebugUtils.currentLine=39714818;
 //BA.debugLineNum = 39714818;BA.debugLine="B4XPages.SetTitle(Me, \"Wertungslisten-App by sthn";
_b4xpages._settitle /*String*/ (ba,this,(Object)("Wertungslisten-App by sthnet.de"));
RDebugUtils.currentLine=39714819;
 //BA.debugLineNum = 39714819;BA.debugLine="BuildUI";
__ref._buildui /*String*/ (null);
RDebugUtils.currentLine=39714820;
 //BA.debugLineNum = 39714820;BA.debugLine="B4XPage_Appear";
__ref._b4xpage_appear /*String*/ (null);
RDebugUtils.currentLine=39714821;
 //BA.debugLineNum = 39714821;BA.debugLine="End Sub";
return "";
}
public String  _buildui(b4a.example.screenmain __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="screenmain";
if (Debug.shouldDelegate(ba, "buildui", false))
	 {return ((String) Debug.delegate(ba, "buildui", null));}
anywheresoftware.b4a.objects.PanelWrapper _pnlheader = null;
int _lblw1 = 0;
int _lblw2 = 0;
anywheresoftware.b4a.objects.LabelWrapper _label11 = null;
anywheresoftware.b4a.objects.LabelWrapper _label12 = null;
anywheresoftware.b4a.objects.LabelWrapper _label13 = null;
anywheresoftware.b4a.objects.LabelWrapper _label4 = null;
int _centerblockw = 0;
int _startx = 0;
anywheresoftware.b4a.objects.LabelWrapper _label6 = null;
anywheresoftware.b4a.objects.LabelWrapper _label7 = null;
anywheresoftware.b4a.objects.LabelWrapper _label2 = null;
anywheresoftware.b4a.objects.LabelWrapper _label18 = null;
anywheresoftware.b4a.objects.LabelWrapper _label16 = null;
anywheresoftware.b4a.objects.LabelWrapper _label17 = null;
anywheresoftware.b4a.objects.LabelWrapper _label15 = null;
RDebugUtils.currentLine=39911424;
 //BA.debugLineNum = 39911424;BA.debugLine="Private Sub BuildUI";
RDebugUtils.currentLine=39911425;
 //BA.debugLineNum = 39911425;BA.debugLine="Root.Color = Colors.White";
__ref._root /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setColor(__c.Colors.White);
RDebugUtils.currentLine=39911428;
 //BA.debugLineNum = 39911428;BA.debugLine="Dim pnlHeader As Panel";
_pnlheader = new anywheresoftware.b4a.objects.PanelWrapper();
RDebugUtils.currentLine=39911429;
 //BA.debugLineNum = 39911429;BA.debugLine="pnlHeader.Initialize(\"\")";
_pnlheader.Initialize(ba,"");
RDebugUtils.currentLine=39911430;
 //BA.debugLineNum = 39911430;BA.debugLine="pnlHeader.Color = Colors.White";
_pnlheader.setColor(__c.Colors.White);
RDebugUtils.currentLine=39911431;
 //BA.debugLineNum = 39911431;BA.debugLine="Root.AddView(pnlHeader, 0, 0, 100%x, 80dip)";
__ref._root /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .AddView((android.view.View)(_pnlheader.getObject()),(int) (0),(int) (0),__c.PerXToCurrent((float) (100),ba),__c.DipToCurrent((int) (80)));
RDebugUtils.currentLine=39911433;
 //BA.debugLineNum = 39911433;BA.debugLine="Dim lblW1 As Int = 115dip";
_lblw1 = __c.DipToCurrent((int) (115));
RDebugUtils.currentLine=39911434;
 //BA.debugLineNum = 39911434;BA.debugLine="Dim lblW2 As Int = 100%x - lblW1 - 48dip";
_lblw2 = (int) (__c.PerXToCurrent((float) (100),ba)-_lblw1-__c.DipToCurrent((int) (48)));
RDebugUtils.currentLine=39911436;
 //BA.debugLineNum = 39911436;BA.debugLine="Dim Label11 As Label";
_label11 = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=39911437;
 //BA.debugLineNum = 39911437;BA.debugLine="Label11.Initialize(\"\")";
_label11.Initialize(ba,"");
RDebugUtils.currentLine=39911438;
 //BA.debugLineNum = 39911438;BA.debugLine="Label11.Text = \"Verein: \"";
_label11.setText(BA.ObjectToCharSequence("Verein: "));
RDebugUtils.currentLine=39911439;
 //BA.debugLineNum = 39911439;BA.debugLine="Label11.Typeface = Typeface.DEFAULT_BOLD";
_label11.setTypeface(__c.Typeface.DEFAULT_BOLD);
RDebugUtils.currentLine=39911440;
 //BA.debugLineNum = 39911440;BA.debugLine="Label11.TextColor = Colors.Black";
_label11.setTextColor(__c.Colors.Black);
RDebugUtils.currentLine=39911441;
 //BA.debugLineNum = 39911441;BA.debugLine="Label11.Gravity = Gravity.RIGHT + Gravity.CENTER_";
_label11.setGravity((int) (__c.Gravity.RIGHT+__c.Gravity.CENTER_VERTICAL));
RDebugUtils.currentLine=39911442;
 //BA.debugLineNum = 39911442;BA.debugLine="pnlHeader.AddView(Label11, 5dip, 4dip, lblW1, 24d";
_pnlheader.AddView((android.view.View)(_label11.getObject()),__c.DipToCurrent((int) (5)),__c.DipToCurrent((int) (4)),_lblw1,__c.DipToCurrent((int) (24)));
RDebugUtils.currentLine=39911444;
 //BA.debugLineNum = 39911444;BA.debugLine="lblVerein.Initialize(\"\")";
__ref._lblverein /*anywheresoftware.b4a.objects.LabelWrapper*/ .Initialize(ba,"");
RDebugUtils.currentLine=39911445;
 //BA.debugLineNum = 39911445;BA.debugLine="lblVerein.Text = \"-Vereinsbezeichnung-\"";
__ref._lblverein /*anywheresoftware.b4a.objects.LabelWrapper*/ .setText(BA.ObjectToCharSequence("-Vereinsbezeichnung-"));
RDebugUtils.currentLine=39911446;
 //BA.debugLineNum = 39911446;BA.debugLine="lblVerein.Typeface = Typeface.DEFAULT_BOLD";
__ref._lblverein /*anywheresoftware.b4a.objects.LabelWrapper*/ .setTypeface(__c.Typeface.DEFAULT_BOLD);
RDebugUtils.currentLine=39911447;
 //BA.debugLineNum = 39911447;BA.debugLine="lblVerein.TextColor = 0xFF16AA16";
__ref._lblverein /*anywheresoftware.b4a.objects.LabelWrapper*/ .setTextColor(((int)0xff16aa16));
RDebugUtils.currentLine=39911448;
 //BA.debugLineNum = 39911448;BA.debugLine="lblVerein.Gravity = Gravity.LEFT + Gravity.CENTER";
__ref._lblverein /*anywheresoftware.b4a.objects.LabelWrapper*/ .setGravity((int) (__c.Gravity.LEFT+__c.Gravity.CENTER_VERTICAL));
RDebugUtils.currentLine=39911449;
 //BA.debugLineNum = 39911449;BA.debugLine="pnlHeader.AddView(lblVerein, lblW1 + 8dip, 4dip,";
_pnlheader.AddView((android.view.View)(__ref._lblverein /*anywheresoftware.b4a.objects.LabelWrapper*/ .getObject()),(int) (_lblw1+__c.DipToCurrent((int) (8))),__c.DipToCurrent((int) (4)),_lblw2,__c.DipToCurrent((int) (24)));
RDebugUtils.currentLine=39911451;
 //BA.debugLineNum = 39911451;BA.debugLine="Dim Label12 As Label";
_label12 = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=39911452;
 //BA.debugLineNum = 39911452;BA.debugLine="Label12.Initialize(\"\")";
_label12.Initialize(ba,"");
RDebugUtils.currentLine=39911453;
 //BA.debugLineNum = 39911453;BA.debugLine="Label12.Text = \"Veranstaltung:\"";
_label12.setText(BA.ObjectToCharSequence("Veranstaltung:"));
RDebugUtils.currentLine=39911454;
 //BA.debugLineNum = 39911454;BA.debugLine="Label12.Typeface = Typeface.DEFAULT_BOLD";
_label12.setTypeface(__c.Typeface.DEFAULT_BOLD);
RDebugUtils.currentLine=39911455;
 //BA.debugLineNum = 39911455;BA.debugLine="Label12.TextColor = Colors.Black";
_label12.setTextColor(__c.Colors.Black);
RDebugUtils.currentLine=39911456;
 //BA.debugLineNum = 39911456;BA.debugLine="Label12.Gravity = Gravity.RIGHT + Gravity.CENTER_";
_label12.setGravity((int) (__c.Gravity.RIGHT+__c.Gravity.CENTER_VERTICAL));
RDebugUtils.currentLine=39911457;
 //BA.debugLineNum = 39911457;BA.debugLine="pnlHeader.AddView(Label12, 5dip, 28dip, lblW1, 24";
_pnlheader.AddView((android.view.View)(_label12.getObject()),__c.DipToCurrent((int) (5)),__c.DipToCurrent((int) (28)),_lblw1,__c.DipToCurrent((int) (24)));
RDebugUtils.currentLine=39911459;
 //BA.debugLineNum = 39911459;BA.debugLine="lblVeranstaltung.Initialize(\"\")";
__ref._lblveranstaltung /*anywheresoftware.b4a.objects.LabelWrapper*/ .Initialize(ba,"");
RDebugUtils.currentLine=39911460;
 //BA.debugLineNum = 39911460;BA.debugLine="lblVeranstaltung.Text = \"-Veranstaltung-\"";
__ref._lblveranstaltung /*anywheresoftware.b4a.objects.LabelWrapper*/ .setText(BA.ObjectToCharSequence("-Veranstaltung-"));
RDebugUtils.currentLine=39911461;
 //BA.debugLineNum = 39911461;BA.debugLine="lblVeranstaltung.Typeface = Typeface.DEFAULT_BOLD";
__ref._lblveranstaltung /*anywheresoftware.b4a.objects.LabelWrapper*/ .setTypeface(__c.Typeface.DEFAULT_BOLD);
RDebugUtils.currentLine=39911462;
 //BA.debugLineNum = 39911462;BA.debugLine="lblVeranstaltung.TextColor = 0xFF16AA16";
__ref._lblveranstaltung /*anywheresoftware.b4a.objects.LabelWrapper*/ .setTextColor(((int)0xff16aa16));
RDebugUtils.currentLine=39911463;
 //BA.debugLineNum = 39911463;BA.debugLine="lblVeranstaltung.Gravity = Gravity.LEFT + Gravity";
__ref._lblveranstaltung /*anywheresoftware.b4a.objects.LabelWrapper*/ .setGravity((int) (__c.Gravity.LEFT+__c.Gravity.CENTER_VERTICAL));
RDebugUtils.currentLine=39911464;
 //BA.debugLineNum = 39911464;BA.debugLine="pnlHeader.AddView(lblVeranstaltung, lblW1 + 8dip,";
_pnlheader.AddView((android.view.View)(__ref._lblveranstaltung /*anywheresoftware.b4a.objects.LabelWrapper*/ .getObject()),(int) (_lblw1+__c.DipToCurrent((int) (8))),__c.DipToCurrent((int) (28)),_lblw2,__c.DipToCurrent((int) (24)));
RDebugUtils.currentLine=39911466;
 //BA.debugLineNum = 39911466;BA.debugLine="Dim Label13 As Label";
_label13 = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=39911467;
 //BA.debugLineNum = 39911467;BA.debugLine="Label13.Initialize(\"\")";
_label13.Initialize(ba,"");
RDebugUtils.currentLine=39911468;
 //BA.debugLineNum = 39911468;BA.debugLine="Label13.Text = \"Datum:\"";
_label13.setText(BA.ObjectToCharSequence("Datum:"));
RDebugUtils.currentLine=39911469;
 //BA.debugLineNum = 39911469;BA.debugLine="Label13.Typeface = Typeface.DEFAULT_BOLD";
_label13.setTypeface(__c.Typeface.DEFAULT_BOLD);
RDebugUtils.currentLine=39911470;
 //BA.debugLineNum = 39911470;BA.debugLine="Label13.TextColor = Colors.Black";
_label13.setTextColor(__c.Colors.Black);
RDebugUtils.currentLine=39911471;
 //BA.debugLineNum = 39911471;BA.debugLine="Label13.Gravity = Gravity.RIGHT + Gravity.CENTER_";
_label13.setGravity((int) (__c.Gravity.RIGHT+__c.Gravity.CENTER_VERTICAL));
RDebugUtils.currentLine=39911472;
 //BA.debugLineNum = 39911472;BA.debugLine="pnlHeader.AddView(Label13, 5dip, 52dip, lblW1, 24";
_pnlheader.AddView((android.view.View)(_label13.getObject()),__c.DipToCurrent((int) (5)),__c.DipToCurrent((int) (52)),_lblw1,__c.DipToCurrent((int) (24)));
RDebugUtils.currentLine=39911474;
 //BA.debugLineNum = 39911474;BA.debugLine="lblDatum.Initialize(\"\")";
__ref._lbldatum /*anywheresoftware.b4a.objects.LabelWrapper*/ .Initialize(ba,"");
RDebugUtils.currentLine=39911475;
 //BA.debugLineNum = 39911475;BA.debugLine="lblDatum.Text = \"-Datum-\"";
__ref._lbldatum /*anywheresoftware.b4a.objects.LabelWrapper*/ .setText(BA.ObjectToCharSequence("-Datum-"));
RDebugUtils.currentLine=39911476;
 //BA.debugLineNum = 39911476;BA.debugLine="lblDatum.Typeface = Typeface.DEFAULT_BOLD";
__ref._lbldatum /*anywheresoftware.b4a.objects.LabelWrapper*/ .setTypeface(__c.Typeface.DEFAULT_BOLD);
RDebugUtils.currentLine=39911477;
 //BA.debugLineNum = 39911477;BA.debugLine="lblDatum.TextColor = 0xFF16AA16";
__ref._lbldatum /*anywheresoftware.b4a.objects.LabelWrapper*/ .setTextColor(((int)0xff16aa16));
RDebugUtils.currentLine=39911478;
 //BA.debugLineNum = 39911478;BA.debugLine="lblDatum.Gravity = Gravity.LEFT + Gravity.CENTER_";
__ref._lbldatum /*anywheresoftware.b4a.objects.LabelWrapper*/ .setGravity((int) (__c.Gravity.LEFT+__c.Gravity.CENTER_VERTICAL));
RDebugUtils.currentLine=39911479;
 //BA.debugLineNum = 39911479;BA.debugLine="pnlHeader.AddView(lblDatum, lblW1 + 8dip, 52dip,";
_pnlheader.AddView((android.view.View)(__ref._lbldatum /*anywheresoftware.b4a.objects.LabelWrapper*/ .getObject()),(int) (_lblw1+__c.DipToCurrent((int) (8))),__c.DipToCurrent((int) (52)),_lblw2,__c.DipToCurrent((int) (24)));
RDebugUtils.currentLine=39911481;
 //BA.debugLineNum = 39911481;BA.debugLine="btnSettings.Initialize(\"btnSettings\")";
__ref._btnsettings /*anywheresoftware.b4a.objects.ButtonWrapper*/ .Initialize(ba,"btnSettings");
RDebugUtils.currentLine=39911482;
 //BA.debugLineNum = 39911482;BA.debugLine="SetButtonImageSafe(btnSettings, \"3Punkte.png\", \"⋮";
__ref._setbuttonimagesafe /*String*/ (null,__ref._btnsettings /*anywheresoftware.b4a.objects.ButtonWrapper*/ ,"3Punkte.png","⋮");
RDebugUtils.currentLine=39911483;
 //BA.debugLineNum = 39911483;BA.debugLine="pnlHeader.AddView(btnSettings, 100%x - 40dip, 22d";
_pnlheader.AddView((android.view.View)(__ref._btnsettings /*anywheresoftware.b4a.objects.ButtonWrapper*/ .getObject()),(int) (__c.PerXToCurrent((float) (100),ba)-__c.DipToCurrent((int) (40))),__c.DipToCurrent((int) (22)),__c.DipToCurrent((int) (34)),__c.DipToCurrent((int) (34)));
RDebugUtils.currentLine=39911486;
 //BA.debugLineNum = 39911486;BA.debugLine="vaEingabe.Initialize(\"\")";
__ref._vaeingabe /*anywheresoftware.b4a.objects.PanelWrapper*/ .Initialize(ba,"");
RDebugUtils.currentLine=39911487;
 //BA.debugLineNum = 39911487;BA.debugLine="vaEingabe.Color = 0xFFEEFFEE";
__ref._vaeingabe /*anywheresoftware.b4a.objects.PanelWrapper*/ .setColor(((int)0xffeeffee));
RDebugUtils.currentLine=39911488;
 //BA.debugLineNum = 39911488;BA.debugLine="Root.AddView(vaEingabe, 0, 80dip, 100%x, 340dip)";
__ref._root /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .AddView((android.view.View)(__ref._vaeingabe /*anywheresoftware.b4a.objects.PanelWrapper*/ .getObject()),(int) (0),__c.DipToCurrent((int) (80)),__c.PerXToCurrent((float) (100),ba),__c.DipToCurrent((int) (340)));
RDebugUtils.currentLine=39911490;
 //BA.debugLineNum = 39911490;BA.debugLine="btnCloseVstng.Initialize(\"btnCloseVstng\")";
__ref._btnclosevstng /*anywheresoftware.b4a.objects.ButtonWrapper*/ .Initialize(ba,"btnCloseVstng");
RDebugUtils.currentLine=39911491;
 //BA.debugLineNum = 39911491;BA.debugLine="SetButtonImageSafe(btnCloseVstng, \"close.png\", \"�";
__ref._setbuttonimagesafe /*String*/ (null,__ref._btnclosevstng /*anywheresoftware.b4a.objects.ButtonWrapper*/ ,"close.png","🔒");
RDebugUtils.currentLine=39911492;
 //BA.debugLineNum = 39911492;BA.debugLine="vaEingabe.AddView(btnCloseVstng, 8dip, 8dip, 32di";
__ref._vaeingabe /*anywheresoftware.b4a.objects.PanelWrapper*/ .AddView((android.view.View)(__ref._btnclosevstng /*anywheresoftware.b4a.objects.ButtonWrapper*/ .getObject()),__c.DipToCurrent((int) (8)),__c.DipToCurrent((int) (8)),__c.DipToCurrent((int) (32)),__c.DipToCurrent((int) (32)));
RDebugUtils.currentLine=39911494;
 //BA.debugLineNum = 39911494;BA.debugLine="Dim Label4 As Label";
_label4 = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=39911495;
 //BA.debugLineNum = 39911495;BA.debugLine="Label4.Initialize(\"\")";
_label4.Initialize(ba,"");
RDebugUtils.currentLine=39911496;
 //BA.debugLineNum = 39911496;BA.debugLine="Label4.Text = \"Angelplatz\"";
_label4.setText(BA.ObjectToCharSequence("Angelplatz"));
RDebugUtils.currentLine=39911497;
 //BA.debugLineNum = 39911497;BA.debugLine="Label4.TextSize = 16";
_label4.setTextSize((float) (16));
RDebugUtils.currentLine=39911498;
 //BA.debugLineNum = 39911498;BA.debugLine="Label4.Typeface = Typeface.DEFAULT_BOLD";
_label4.setTypeface(__c.Typeface.DEFAULT_BOLD);
RDebugUtils.currentLine=39911499;
 //BA.debugLineNum = 39911499;BA.debugLine="Label4.TextColor = Colors.Black";
_label4.setTextColor(__c.Colors.Black);
RDebugUtils.currentLine=39911500;
 //BA.debugLineNum = 39911500;BA.debugLine="Label4.Gravity = Gravity.CENTER";
_label4.setGravity(__c.Gravity.CENTER);
RDebugUtils.currentLine=39911501;
 //BA.debugLineNum = 39911501;BA.debugLine="vaEingabe.AddView(Label4, 45dip, 8dip, 100%x - 90";
__ref._vaeingabe /*anywheresoftware.b4a.objects.PanelWrapper*/ .AddView((android.view.View)(_label4.getObject()),__c.DipToCurrent((int) (45)),__c.DipToCurrent((int) (8)),(int) (__c.PerXToCurrent((float) (100),ba)-__c.DipToCurrent((int) (90))),__c.DipToCurrent((int) (32)));
RDebugUtils.currentLine=39911503;
 //BA.debugLineNum = 39911503;BA.debugLine="btnUp.Initialize(\"btnUp\")";
__ref._btnup /*anywheresoftware.b4a.objects.ButtonWrapper*/ .Initialize(ba,"btnUp");
RDebugUtils.currentLine=39911504;
 //BA.debugLineNum = 39911504;BA.debugLine="SetButtonImageSafe(btnUp, \"up.png\", \"▲\")";
__ref._setbuttonimagesafe /*String*/ (null,__ref._btnup /*anywheresoftware.b4a.objects.ButtonWrapper*/ ,"up.png","▲");
RDebugUtils.currentLine=39911505;
 //BA.debugLineNum = 39911505;BA.debugLine="vaEingabe.AddView(btnUp, 100%x - 40dip, 8dip, 32d";
__ref._vaeingabe /*anywheresoftware.b4a.objects.PanelWrapper*/ .AddView((android.view.View)(__ref._btnup /*anywheresoftware.b4a.objects.ButtonWrapper*/ .getObject()),(int) (__c.PerXToCurrent((float) (100),ba)-__c.DipToCurrent((int) (40))),__c.DipToCurrent((int) (8)),__c.DipToCurrent((int) (32)),__c.DipToCurrent((int) (32)));
RDebugUtils.currentLine=39911508;
 //BA.debugLineNum = 39911508;BA.debugLine="Dim centerBlockW As Int = 270dip";
_centerblockw = __c.DipToCurrent((int) (270));
RDebugUtils.currentLine=39911509;
 //BA.debugLineNum = 39911509;BA.debugLine="Dim startX As Int = (100%x - centerBlockW) / 2";
_startx = (int) ((__c.PerXToCurrent((float) (100),ba)-_centerblockw)/(double)2);
RDebugUtils.currentLine=39911511;
 //BA.debugLineNum = 39911511;BA.debugLine="btnMinus.Initialize(\"btnMinus\")";
__ref._btnminus /*anywheresoftware.b4a.objects.ButtonWrapper*/ .Initialize(ba,"btnMinus");
RDebugUtils.currentLine=39911512;
 //BA.debugLineNum = 39911512;BA.debugLine="btnMinus.Text = \"-\"";
__ref._btnminus /*anywheresoftware.b4a.objects.ButtonWrapper*/ .setText(BA.ObjectToCharSequence("-"));
RDebugUtils.currentLine=39911513;
 //BA.debugLineNum = 39911513;BA.debugLine="btnMinus.TextSize = 26";
__ref._btnminus /*anywheresoftware.b4a.objects.ButtonWrapper*/ .setTextSize((float) (26));
RDebugUtils.currentLine=39911514;
 //BA.debugLineNum = 39911514;BA.debugLine="btnMinus.Typeface = Typeface.DEFAULT_BOLD";
__ref._btnminus /*anywheresoftware.b4a.objects.ButtonWrapper*/ .setTypeface(__c.Typeface.DEFAULT_BOLD);
RDebugUtils.currentLine=39911515;
 //BA.debugLineNum = 39911515;BA.debugLine="btnMinus.TextColor = 0xFF16AA16";
__ref._btnminus /*anywheresoftware.b4a.objects.ButtonWrapper*/ .setTextColor(((int)0xff16aa16));
RDebugUtils.currentLine=39911516;
 //BA.debugLineNum = 39911516;BA.debugLine="vaEingabe.AddView(btnMinus, startX, 45dip, 60dip,";
__ref._vaeingabe /*anywheresoftware.b4a.objects.PanelWrapper*/ .AddView((android.view.View)(__ref._btnminus /*anywheresoftware.b4a.objects.ButtonWrapper*/ .getObject()),_startx,__c.DipToCurrent((int) (45)),__c.DipToCurrent((int) (60)),__c.DipToCurrent((int) (55)));
RDebugUtils.currentLine=39911518;
 //BA.debugLineNum = 39911518;BA.debugLine="spnPlatz.Initialize(\"spnPlatz\")";
__ref._spnplatz /*anywheresoftware.b4a.objects.SpinnerWrapper*/ .Initialize(ba,"spnPlatz");
RDebugUtils.currentLine=39911519;
 //BA.debugLineNum = 39911519;BA.debugLine="spnPlatz.TextSize = 28";
__ref._spnplatz /*anywheresoftware.b4a.objects.SpinnerWrapper*/ .setTextSize((float) (28));
RDebugUtils.currentLine=39911520;
 //BA.debugLineNum = 39911520;BA.debugLine="spnPlatz.TextColor = 0xFF16AA16";
__ref._spnplatz /*anywheresoftware.b4a.objects.SpinnerWrapper*/ .setTextColor(((int)0xff16aa16));
RDebugUtils.currentLine=39911521;
 //BA.debugLineNum = 39911521;BA.debugLine="spnPlatz.DropdownBackgroundColor = Colors.White";
__ref._spnplatz /*anywheresoftware.b4a.objects.SpinnerWrapper*/ .setDropdownBackgroundColor(__c.Colors.White);
RDebugUtils.currentLine=39911522;
 //BA.debugLineNum = 39911522;BA.debugLine="spnPlatz.DropdownTextColor = 0xFF16AA16";
__ref._spnplatz /*anywheresoftware.b4a.objects.SpinnerWrapper*/ .setDropdownTextColor(((int)0xff16aa16));
RDebugUtils.currentLine=39911523;
 //BA.debugLineNum = 39911523;BA.debugLine="vaEingabe.AddView(spnPlatz, startX + 60dip, 45dip";
__ref._vaeingabe /*anywheresoftware.b4a.objects.PanelWrapper*/ .AddView((android.view.View)(__ref._spnplatz /*anywheresoftware.b4a.objects.SpinnerWrapper*/ .getObject()),(int) (_startx+__c.DipToCurrent((int) (60))),__c.DipToCurrent((int) (45)),__c.DipToCurrent((int) (150)),__c.DipToCurrent((int) (55)));
RDebugUtils.currentLine=39911525;
 //BA.debugLineNum = 39911525;BA.debugLine="btnPlus.Initialize(\"btnPlus\")";
__ref._btnplus /*anywheresoftware.b4a.objects.ButtonWrapper*/ .Initialize(ba,"btnPlus");
RDebugUtils.currentLine=39911526;
 //BA.debugLineNum = 39911526;BA.debugLine="btnPlus.Text = \"+\"";
__ref._btnplus /*anywheresoftware.b4a.objects.ButtonWrapper*/ .setText(BA.ObjectToCharSequence("+"));
RDebugUtils.currentLine=39911527;
 //BA.debugLineNum = 39911527;BA.debugLine="btnPlus.TextSize = 26";
__ref._btnplus /*anywheresoftware.b4a.objects.ButtonWrapper*/ .setTextSize((float) (26));
RDebugUtils.currentLine=39911528;
 //BA.debugLineNum = 39911528;BA.debugLine="btnPlus.Typeface = Typeface.DEFAULT_BOLD";
__ref._btnplus /*anywheresoftware.b4a.objects.ButtonWrapper*/ .setTypeface(__c.Typeface.DEFAULT_BOLD);
RDebugUtils.currentLine=39911529;
 //BA.debugLineNum = 39911529;BA.debugLine="btnPlus.TextColor = 0xFF16AA16";
__ref._btnplus /*anywheresoftware.b4a.objects.ButtonWrapper*/ .setTextColor(((int)0xff16aa16));
RDebugUtils.currentLine=39911530;
 //BA.debugLineNum = 39911530;BA.debugLine="vaEingabe.AddView(btnPlus, startX + 210dip, 45dip";
__ref._vaeingabe /*anywheresoftware.b4a.objects.PanelWrapper*/ .AddView((android.view.View)(__ref._btnplus /*anywheresoftware.b4a.objects.ButtonWrapper*/ .getObject()),(int) (_startx+__c.DipToCurrent((int) (210))),__c.DipToCurrent((int) (45)),__c.DipToCurrent((int) (60)),__c.DipToCurrent((int) (55)));
RDebugUtils.currentLine=39911533;
 //BA.debugLineNum = 39911533;BA.debugLine="Dim Label6 As Label";
_label6 = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=39911534;
 //BA.debugLineNum = 39911534;BA.debugLine="Label6.Initialize(\"\")";
_label6.Initialize(ba,"");
RDebugUtils.currentLine=39911535;
 //BA.debugLineNum = 39911535;BA.debugLine="Label6.Text = \"Teilnehmer\"";
_label6.setText(BA.ObjectToCharSequence("Teilnehmer"));
RDebugUtils.currentLine=39911536;
 //BA.debugLineNum = 39911536;BA.debugLine="Label6.TextSize = 16";
_label6.setTextSize((float) (16));
RDebugUtils.currentLine=39911537;
 //BA.debugLineNum = 39911537;BA.debugLine="Label6.Typeface = Typeface.DEFAULT_BOLD";
_label6.setTypeface(__c.Typeface.DEFAULT_BOLD);
RDebugUtils.currentLine=39911538;
 //BA.debugLineNum = 39911538;BA.debugLine="Label6.TextColor = Colors.Black";
_label6.setTextColor(__c.Colors.Black);
RDebugUtils.currentLine=39911539;
 //BA.debugLineNum = 39911539;BA.debugLine="Label6.Gravity = Gravity.CENTER";
_label6.setGravity(__c.Gravity.CENTER);
RDebugUtils.currentLine=39911540;
 //BA.debugLineNum = 39911540;BA.debugLine="vaEingabe.AddView(Label6, 0, 110dip, 100%x, 24dip";
__ref._vaeingabe /*anywheresoftware.b4a.objects.PanelWrapper*/ .AddView((android.view.View)(_label6.getObject()),(int) (0),__c.DipToCurrent((int) (110)),__c.PerXToCurrent((float) (100),ba),__c.DipToCurrent((int) (24)));
RDebugUtils.currentLine=39911542;
 //BA.debugLineNum = 39911542;BA.debugLine="tbxTeilnehmer.Initialize(\"tbxTeilnehmer\")";
__ref._tbxteilnehmer /*anywheresoftware.b4a.objects.EditTextWrapper*/ .Initialize(ba,"tbxTeilnehmer");
RDebugUtils.currentLine=39911544;
 //BA.debugLineNum = 39911544;BA.debugLine="tbxTeilnehmer.TextSize = 20";
__ref._tbxteilnehmer /*anywheresoftware.b4a.objects.EditTextWrapper*/ .setTextSize((float) (20));
RDebugUtils.currentLine=39911545;
 //BA.debugLineNum = 39911545;BA.debugLine="tbxTeilnehmer.Typeface = Typeface.DEFAULT_BOLD";
__ref._tbxteilnehmer /*anywheresoftware.b4a.objects.EditTextWrapper*/ .setTypeface(__c.Typeface.DEFAULT_BOLD);
RDebugUtils.currentLine=39911546;
 //BA.debugLineNum = 39911546;BA.debugLine="tbxTeilnehmer.TextColor = 0xFF16AA16";
__ref._tbxteilnehmer /*anywheresoftware.b4a.objects.EditTextWrapper*/ .setTextColor(((int)0xff16aa16));
RDebugUtils.currentLine=39911547;
 //BA.debugLineNum = 39911547;BA.debugLine="tbxTeilnehmer.SingleLine = True";
__ref._tbxteilnehmer /*anywheresoftware.b4a.objects.EditTextWrapper*/ .setSingleLine(__c.True);
RDebugUtils.currentLine=39911548;
 //BA.debugLineNum = 39911548;BA.debugLine="vaEingabe.AddView(tbxTeilnehmer, 10%x, 136dip, 80";
__ref._vaeingabe /*anywheresoftware.b4a.objects.PanelWrapper*/ .AddView((android.view.View)(__ref._tbxteilnehmer /*anywheresoftware.b4a.objects.EditTextWrapper*/ .getObject()),__c.PerXToCurrent((float) (10),ba),__c.DipToCurrent((int) (136)),__c.PerXToCurrent((float) (80),ba),__c.DipToCurrent((int) (46)));
RDebugUtils.currentLine=39911551;
 //BA.debugLineNum = 39911551;BA.debugLine="vaErgEingabe.Initialize(\"\")";
__ref._vaergeingabe /*anywheresoftware.b4a.objects.PanelWrapper*/ .Initialize(ba,"");
RDebugUtils.currentLine=39911552;
 //BA.debugLineNum = 39911552;BA.debugLine="vaErgEingabe.Color = 0xFFEEFFEE";
__ref._vaergeingabe /*anywheresoftware.b4a.objects.PanelWrapper*/ .setColor(((int)0xffeeffee));
RDebugUtils.currentLine=39911553;
 //BA.debugLineNum = 39911553;BA.debugLine="vaEingabe.AddView(vaErgEingabe, 0, 186dip, 100%x,";
__ref._vaeingabe /*anywheresoftware.b4a.objects.PanelWrapper*/ .AddView((android.view.View)(__ref._vaergeingabe /*anywheresoftware.b4a.objects.PanelWrapper*/ .getObject()),(int) (0),__c.DipToCurrent((int) (186)),__c.PerXToCurrent((float) (100),ba),__c.DipToCurrent((int) (154)));
RDebugUtils.currentLine=39911555;
 //BA.debugLineNum = 39911555;BA.debugLine="btnFDJeingabe.Initialize(\"btnFDJeingabe\")";
__ref._btnfdjeingabe /*anywheresoftware.b4a.objects.ButtonWrapper*/ .Initialize(ba,"btnFDJeingabe");
RDebugUtils.currentLine=39911556;
 //BA.debugLineNum = 39911556;BA.debugLine="btnFDJeingabe.Text = \"Fisch des Jahres\"";
__ref._btnfdjeingabe /*anywheresoftware.b4a.objects.ButtonWrapper*/ .setText(BA.ObjectToCharSequence("Fisch des Jahres"));
RDebugUtils.currentLine=39911557;
 //BA.debugLineNum = 39911557;BA.debugLine="btnFDJeingabe.TextSize = 11";
__ref._btnfdjeingabe /*anywheresoftware.b4a.objects.ButtonWrapper*/ .setTextSize((float) (11));
RDebugUtils.currentLine=39911558;
 //BA.debugLineNum = 39911558;BA.debugLine="btnFDJeingabe.Typeface = Typeface.DEFAULT_BOLD";
__ref._btnfdjeingabe /*anywheresoftware.b4a.objects.ButtonWrapper*/ .setTypeface(__c.Typeface.DEFAULT_BOLD);
RDebugUtils.currentLine=39911559;
 //BA.debugLineNum = 39911559;BA.debugLine="btnFDJeingabe.TextColor = 0xFF16AA16";
__ref._btnfdjeingabe /*anywheresoftware.b4a.objects.ButtonWrapper*/ .setTextColor(((int)0xff16aa16));
RDebugUtils.currentLine=39911560;
 //BA.debugLineNum = 39911560;BA.debugLine="vaErgEingabe.AddView(btnFDJeingabe, 100%x - 145di";
__ref._vaergeingabe /*anywheresoftware.b4a.objects.PanelWrapper*/ .AddView((android.view.View)(__ref._btnfdjeingabe /*anywheresoftware.b4a.objects.ButtonWrapper*/ .getObject()),(int) (__c.PerXToCurrent((float) (100),ba)-__c.DipToCurrent((int) (145))),__c.DipToCurrent((int) (4)),__c.DipToCurrent((int) (130)),__c.DipToCurrent((int) (34)));
RDebugUtils.currentLine=39911562;
 //BA.debugLineNum = 39911562;BA.debugLine="Dim Label7 As Label";
_label7 = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=39911563;
 //BA.debugLineNum = 39911563;BA.debugLine="Label7.Initialize(\"\")";
_label7.Initialize(ba,"");
RDebugUtils.currentLine=39911564;
 //BA.debugLineNum = 39911564;BA.debugLine="Label7.Text = \"Fang:  \"";
_label7.setText(BA.ObjectToCharSequence("Fang:  "));
RDebugUtils.currentLine=39911565;
 //BA.debugLineNum = 39911565;BA.debugLine="Label7.TextSize = 16";
_label7.setTextSize((float) (16));
RDebugUtils.currentLine=39911566;
 //BA.debugLineNum = 39911566;BA.debugLine="Label7.Typeface = Typeface.DEFAULT_BOLD";
_label7.setTypeface(__c.Typeface.DEFAULT_BOLD);
RDebugUtils.currentLine=39911567;
 //BA.debugLineNum = 39911567;BA.debugLine="Label7.TextColor = Colors.Black";
_label7.setTextColor(__c.Colors.Black);
RDebugUtils.currentLine=39911568;
 //BA.debugLineNum = 39911568;BA.debugLine="Label7.Gravity = Gravity.RIGHT + Gravity.CENTER_V";
_label7.setGravity((int) (__c.Gravity.RIGHT+__c.Gravity.CENTER_VERTICAL));
RDebugUtils.currentLine=39911569;
 //BA.debugLineNum = 39911569;BA.debugLine="vaErgEingabe.AddView(Label7, 10dip, 44dip, (100%x";
__ref._vaergeingabe /*anywheresoftware.b4a.objects.PanelWrapper*/ .AddView((android.view.View)(_label7.getObject()),__c.DipToCurrent((int) (10)),__c.DipToCurrent((int) (44)),(int) ((__c.PerXToCurrent((float) (100),ba)-__c.DipToCurrent((int) (150)))/(double)2-__c.DipToCurrent((int) (10))),__c.DipToCurrent((int) (52)));
RDebugUtils.currentLine=39911571;
 //BA.debugLineNum = 39911571;BA.debugLine="tbxGramm.Initialize(\"tbxGramm\")";
__ref._tbxgramm /*anywheresoftware.b4a.objects.EditTextWrapper*/ .Initialize(ba,"tbxGramm");
RDebugUtils.currentLine=39911572;
 //BA.debugLineNum = 39911572;BA.debugLine="tbxGramm.TextSize = 30";
__ref._tbxgramm /*anywheresoftware.b4a.objects.EditTextWrapper*/ .setTextSize((float) (30));
RDebugUtils.currentLine=39911573;
 //BA.debugLineNum = 39911573;BA.debugLine="tbxGramm.Typeface = Typeface.DEFAULT_BOLD";
__ref._tbxgramm /*anywheresoftware.b4a.objects.EditTextWrapper*/ .setTypeface(__c.Typeface.DEFAULT_BOLD);
RDebugUtils.currentLine=39911574;
 //BA.debugLineNum = 39911574;BA.debugLine="tbxGramm.TextColor = 0xFF16AA16";
__ref._tbxgramm /*anywheresoftware.b4a.objects.EditTextWrapper*/ .setTextColor(((int)0xff16aa16));
RDebugUtils.currentLine=39911575;
 //BA.debugLineNum = 39911575;BA.debugLine="tbxGramm.Gravity = Gravity.CENTER";
__ref._tbxgramm /*anywheresoftware.b4a.objects.EditTextWrapper*/ .setGravity(__c.Gravity.CENTER);
RDebugUtils.currentLine=39911576;
 //BA.debugLineNum = 39911576;BA.debugLine="tbxGramm.InputType = tbxGramm.INPUT_TYPE_NUMBERS";
__ref._tbxgramm /*anywheresoftware.b4a.objects.EditTextWrapper*/ .setInputType(__ref._tbxgramm /*anywheresoftware.b4a.objects.EditTextWrapper*/ .INPUT_TYPE_NUMBERS);
RDebugUtils.currentLine=39911577;
 //BA.debugLineNum = 39911577;BA.debugLine="tbxGramm.SingleLine = True";
__ref._tbxgramm /*anywheresoftware.b4a.objects.EditTextWrapper*/ .setSingleLine(__c.True);
RDebugUtils.currentLine=39911578;
 //BA.debugLineNum = 39911578;BA.debugLine="vaErgEingabe.AddView(tbxGramm, (100%x - 150dip) /";
__ref._vaergeingabe /*anywheresoftware.b4a.objects.PanelWrapper*/ .AddView((android.view.View)(__ref._tbxgramm /*anywheresoftware.b4a.objects.EditTextWrapper*/ .getObject()),(int) ((__c.PerXToCurrent((float) (100),ba)-__c.DipToCurrent((int) (150)))/(double)2),__c.DipToCurrent((int) (44)),__c.DipToCurrent((int) (150)),__c.DipToCurrent((int) (52)));
RDebugUtils.currentLine=39911580;
 //BA.debugLineNum = 39911580;BA.debugLine="Dim Label2 As Label";
_label2 = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=39911581;
 //BA.debugLineNum = 39911581;BA.debugLine="Label2.Initialize(\"\")";
_label2.Initialize(ba,"");
RDebugUtils.currentLine=39911582;
 //BA.debugLineNum = 39911582;BA.debugLine="Label2.Text = \" Gramm\"";
_label2.setText(BA.ObjectToCharSequence(" Gramm"));
RDebugUtils.currentLine=39911583;
 //BA.debugLineNum = 39911583;BA.debugLine="Label2.TextSize = 16";
_label2.setTextSize((float) (16));
RDebugUtils.currentLine=39911584;
 //BA.debugLineNum = 39911584;BA.debugLine="Label2.Typeface = Typeface.DEFAULT_BOLD";
_label2.setTypeface(__c.Typeface.DEFAULT_BOLD);
RDebugUtils.currentLine=39911585;
 //BA.debugLineNum = 39911585;BA.debugLine="Label2.TextColor = Colors.Black";
_label2.setTextColor(__c.Colors.Black);
RDebugUtils.currentLine=39911586;
 //BA.debugLineNum = 39911586;BA.debugLine="Label2.Gravity = Gravity.LEFT + Gravity.CENTER_VE";
_label2.setGravity((int) (__c.Gravity.LEFT+__c.Gravity.CENTER_VERTICAL));
RDebugUtils.currentLine=39911587;
 //BA.debugLineNum = 39911587;BA.debugLine="vaErgEingabe.AddView(Label2, (100%x + 150dip) / 2";
__ref._vaergeingabe /*anywheresoftware.b4a.objects.PanelWrapper*/ .AddView((android.view.View)(_label2.getObject()),(int) ((__c.PerXToCurrent((float) (100),ba)+__c.DipToCurrent((int) (150)))/(double)2),__c.DipToCurrent((int) (44)),(int) ((__c.PerXToCurrent((float) (100),ba)-__c.DipToCurrent((int) (150)))/(double)2-__c.DipToCurrent((int) (10))),__c.DipToCurrent((int) (52)));
RDebugUtils.currentLine=39911589;
 //BA.debugLineNum = 39911589;BA.debugLine="btnSpeichern.Initialize(\"btnSpeichern\")";
__ref._btnspeichern /*anywheresoftware.b4a.objects.ButtonWrapper*/ .Initialize(ba,"btnSpeichern");
RDebugUtils.currentLine=39911590;
 //BA.debugLineNum = 39911590;BA.debugLine="btnSpeichern.Text = \"speichern\"";
__ref._btnspeichern /*anywheresoftware.b4a.objects.ButtonWrapper*/ .setText(BA.ObjectToCharSequence("speichern"));
RDebugUtils.currentLine=39911591;
 //BA.debugLineNum = 39911591;BA.debugLine="btnSpeichern.TextSize = 16";
__ref._btnspeichern /*anywheresoftware.b4a.objects.ButtonWrapper*/ .setTextSize((float) (16));
RDebugUtils.currentLine=39911592;
 //BA.debugLineNum = 39911592;BA.debugLine="btnSpeichern.Typeface = Typeface.DEFAULT_BOLD";
__ref._btnspeichern /*anywheresoftware.b4a.objects.ButtonWrapper*/ .setTypeface(__c.Typeface.DEFAULT_BOLD);
RDebugUtils.currentLine=39911593;
 //BA.debugLineNum = 39911593;BA.debugLine="btnSpeichern.TextColor = 0xFF16AA16";
__ref._btnspeichern /*anywheresoftware.b4a.objects.ButtonWrapper*/ .setTextColor(((int)0xff16aa16));
RDebugUtils.currentLine=39911594;
 //BA.debugLineNum = 39911594;BA.debugLine="vaErgEingabe.AddView(btnSpeichern, (100%x - 150di";
__ref._vaergeingabe /*anywheresoftware.b4a.objects.PanelWrapper*/ .AddView((android.view.View)(__ref._btnspeichern /*anywheresoftware.b4a.objects.ButtonWrapper*/ .getObject()),(int) ((__c.PerXToCurrent((float) (100),ba)-__c.DipToCurrent((int) (150)))/(double)2),__c.DipToCurrent((int) (104)),__c.DipToCurrent((int) (150)),__c.DipToCurrent((int) (44)));
RDebugUtils.currentLine=39911597;
 //BA.debugLineNum = 39911597;BA.debugLine="vaFDJ.Initialize(\"\")";
__ref._vafdj /*anywheresoftware.b4a.objects.PanelWrapper*/ .Initialize(ba,"");
RDebugUtils.currentLine=39911598;
 //BA.debugLineNum = 39911598;BA.debugLine="vaFDJ.Color = 0xFFEEFFEE";
__ref._vafdj /*anywheresoftware.b4a.objects.PanelWrapper*/ .setColor(((int)0xffeeffee));
RDebugUtils.currentLine=39911599;
 //BA.debugLineNum = 39911599;BA.debugLine="vaFDJ.Visible = False";
__ref._vafdj /*anywheresoftware.b4a.objects.PanelWrapper*/ .setVisible(__c.False);
RDebugUtils.currentLine=39911600;
 //BA.debugLineNum = 39911600;BA.debugLine="vaEingabe.AddView(vaFDJ, 0, 186dip, 100%x, 154dip";
__ref._vaeingabe /*anywheresoftware.b4a.objects.PanelWrapper*/ .AddView((android.view.View)(__ref._vafdj /*anywheresoftware.b4a.objects.PanelWrapper*/ .getObject()),(int) (0),__c.DipToCurrent((int) (186)),__c.PerXToCurrent((float) (100),ba),__c.DipToCurrent((int) (154)));
RDebugUtils.currentLine=39911602;
 //BA.debugLineNum = 39911602;BA.debugLine="Dim Label18 As Label";
_label18 = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=39911603;
 //BA.debugLineNum = 39911603;BA.debugLine="Label18.Initialize(\"\")";
_label18.Initialize(ba,"");
RDebugUtils.currentLine=39911604;
 //BA.debugLineNum = 39911604;BA.debugLine="Label18.Text = \"Fisch des Jahres\"";
_label18.setText(BA.ObjectToCharSequence("Fisch des Jahres"));
RDebugUtils.currentLine=39911605;
 //BA.debugLineNum = 39911605;BA.debugLine="Label18.TextSize = 16";
_label18.setTextSize((float) (16));
RDebugUtils.currentLine=39911606;
 //BA.debugLineNum = 39911606;BA.debugLine="Label18.Typeface = Typeface.DEFAULT_BOLD";
_label18.setTypeface(__c.Typeface.DEFAULT_BOLD);
RDebugUtils.currentLine=39911607;
 //BA.debugLineNum = 39911607;BA.debugLine="Label18.TextColor = Colors.Black";
_label18.setTextColor(__c.Colors.Black);
RDebugUtils.currentLine=39911608;
 //BA.debugLineNum = 39911608;BA.debugLine="Label18.Gravity = Gravity.CENTER";
_label18.setGravity(__c.Gravity.CENTER);
RDebugUtils.currentLine=39911609;
 //BA.debugLineNum = 39911609;BA.debugLine="vaFDJ.AddView(Label18, 40dip, 4dip, 100%x - 80dip";
__ref._vafdj /*anywheresoftware.b4a.objects.PanelWrapper*/ .AddView((android.view.View)(_label18.getObject()),__c.DipToCurrent((int) (40)),__c.DipToCurrent((int) (4)),(int) (__c.PerXToCurrent((float) (100),ba)-__c.DipToCurrent((int) (80))),__c.DipToCurrent((int) (30)));
RDebugUtils.currentLine=39911611;
 //BA.debugLineNum = 39911611;BA.debugLine="btnFDJback.Initialize(\"btnFDJback\")";
__ref._btnfdjback /*anywheresoftware.b4a.objects.ButtonWrapper*/ .Initialize(ba,"btnFDJback");
RDebugUtils.currentLine=39911612;
 //BA.debugLineNum = 39911612;BA.debugLine="SetButtonImageSafe(btnFDJback, \"Left.48.png\", \"◀\"";
__ref._setbuttonimagesafe /*String*/ (null,__ref._btnfdjback /*anywheresoftware.b4a.objects.ButtonWrapper*/ ,"Left.48.png","◀");
RDebugUtils.currentLine=39911613;
 //BA.debugLineNum = 39911613;BA.debugLine="vaFDJ.AddView(btnFDJback, 100%x - 38dip, 4dip, 30";
__ref._vafdj /*anywheresoftware.b4a.objects.PanelWrapper*/ .AddView((android.view.View)(__ref._btnfdjback /*anywheresoftware.b4a.objects.ButtonWrapper*/ .getObject()),(int) (__c.PerXToCurrent((float) (100),ba)-__c.DipToCurrent((int) (38))),__c.DipToCurrent((int) (4)),__c.DipToCurrent((int) (30)),__c.DipToCurrent((int) (30)));
RDebugUtils.currentLine=39911615;
 //BA.debugLineNum = 39911615;BA.debugLine="Dim Label16 As Label";
_label16 = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=39911616;
 //BA.debugLineNum = 39911616;BA.debugLine="Label16.Initialize(\"\")";
_label16.Initialize(ba,"");
RDebugUtils.currentLine=39911617;
 //BA.debugLineNum = 39911617;BA.debugLine="Label16.Text = \"  Fang:  \"";
_label16.setText(BA.ObjectToCharSequence("  Fang:  "));
RDebugUtils.currentLine=39911618;
 //BA.debugLineNum = 39911618;BA.debugLine="Label16.TextSize = 16";
_label16.setTextSize((float) (16));
RDebugUtils.currentLine=39911619;
 //BA.debugLineNum = 39911619;BA.debugLine="Label16.Typeface = Typeface.DEFAULT_BOLD";
_label16.setTypeface(__c.Typeface.DEFAULT_BOLD);
RDebugUtils.currentLine=39911620;
 //BA.debugLineNum = 39911620;BA.debugLine="Label16.TextColor = Colors.Black";
_label16.setTextColor(__c.Colors.Black);
RDebugUtils.currentLine=39911621;
 //BA.debugLineNum = 39911621;BA.debugLine="Label16.Gravity = Gravity.RIGHT + Gravity.CENTER_";
_label16.setGravity((int) (__c.Gravity.RIGHT+__c.Gravity.CENTER_VERTICAL));
RDebugUtils.currentLine=39911622;
 //BA.debugLineNum = 39911622;BA.debugLine="vaFDJ.AddView(Label16, 10dip, 44dip, (100%x - 150";
__ref._vafdj /*anywheresoftware.b4a.objects.PanelWrapper*/ .AddView((android.view.View)(_label16.getObject()),__c.DipToCurrent((int) (10)),__c.DipToCurrent((int) (44)),(int) ((__c.PerXToCurrent((float) (100),ba)-__c.DipToCurrent((int) (150)))/(double)2-__c.DipToCurrent((int) (10))),__c.DipToCurrent((int) (52)));
RDebugUtils.currentLine=39911624;
 //BA.debugLineNum = 39911624;BA.debugLine="tbxFDJgewicht.Initialize(\"tbxFDJgewicht\")";
__ref._tbxfdjgewicht /*anywheresoftware.b4a.objects.EditTextWrapper*/ .Initialize(ba,"tbxFDJgewicht");
RDebugUtils.currentLine=39911625;
 //BA.debugLineNum = 39911625;BA.debugLine="tbxFDJgewicht.TextSize = 30";
__ref._tbxfdjgewicht /*anywheresoftware.b4a.objects.EditTextWrapper*/ .setTextSize((float) (30));
RDebugUtils.currentLine=39911626;
 //BA.debugLineNum = 39911626;BA.debugLine="tbxFDJgewicht.Typeface = Typeface.DEFAULT_BOLD";
__ref._tbxfdjgewicht /*anywheresoftware.b4a.objects.EditTextWrapper*/ .setTypeface(__c.Typeface.DEFAULT_BOLD);
RDebugUtils.currentLine=39911627;
 //BA.debugLineNum = 39911627;BA.debugLine="tbxFDJgewicht.TextColor = 0xFF16AA16";
__ref._tbxfdjgewicht /*anywheresoftware.b4a.objects.EditTextWrapper*/ .setTextColor(((int)0xff16aa16));
RDebugUtils.currentLine=39911628;
 //BA.debugLineNum = 39911628;BA.debugLine="tbxFDJgewicht.Gravity = Gravity.CENTER";
__ref._tbxfdjgewicht /*anywheresoftware.b4a.objects.EditTextWrapper*/ .setGravity(__c.Gravity.CENTER);
RDebugUtils.currentLine=39911629;
 //BA.debugLineNum = 39911629;BA.debugLine="tbxFDJgewicht.InputType = tbxFDJgewicht.INPUT_TYP";
__ref._tbxfdjgewicht /*anywheresoftware.b4a.objects.EditTextWrapper*/ .setInputType(__ref._tbxfdjgewicht /*anywheresoftware.b4a.objects.EditTextWrapper*/ .INPUT_TYPE_NUMBERS);
RDebugUtils.currentLine=39911630;
 //BA.debugLineNum = 39911630;BA.debugLine="tbxFDJgewicht.SingleLine = True";
__ref._tbxfdjgewicht /*anywheresoftware.b4a.objects.EditTextWrapper*/ .setSingleLine(__c.True);
RDebugUtils.currentLine=39911631;
 //BA.debugLineNum = 39911631;BA.debugLine="vaFDJ.AddView(tbxFDJgewicht, (100%x - 150dip) / 2";
__ref._vafdj /*anywheresoftware.b4a.objects.PanelWrapper*/ .AddView((android.view.View)(__ref._tbxfdjgewicht /*anywheresoftware.b4a.objects.EditTextWrapper*/ .getObject()),(int) ((__c.PerXToCurrent((float) (100),ba)-__c.DipToCurrent((int) (150)))/(double)2),__c.DipToCurrent((int) (44)),__c.DipToCurrent((int) (150)),__c.DipToCurrent((int) (52)));
RDebugUtils.currentLine=39911633;
 //BA.debugLineNum = 39911633;BA.debugLine="Dim Label17 As Label";
_label17 = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=39911634;
 //BA.debugLineNum = 39911634;BA.debugLine="Label17.Initialize(\"\")";
_label17.Initialize(ba,"");
RDebugUtils.currentLine=39911635;
 //BA.debugLineNum = 39911635;BA.debugLine="Label17.Text = \" Gramm\"";
_label17.setText(BA.ObjectToCharSequence(" Gramm"));
RDebugUtils.currentLine=39911636;
 //BA.debugLineNum = 39911636;BA.debugLine="Label17.TextSize = 16";
_label17.setTextSize((float) (16));
RDebugUtils.currentLine=39911637;
 //BA.debugLineNum = 39911637;BA.debugLine="Label17.Typeface = Typeface.DEFAULT_BOLD";
_label17.setTypeface(__c.Typeface.DEFAULT_BOLD);
RDebugUtils.currentLine=39911638;
 //BA.debugLineNum = 39911638;BA.debugLine="Label17.TextColor = Colors.Black";
_label17.setTextColor(__c.Colors.Black);
RDebugUtils.currentLine=39911639;
 //BA.debugLineNum = 39911639;BA.debugLine="Label17.Gravity = Gravity.LEFT + Gravity.CENTER_V";
_label17.setGravity((int) (__c.Gravity.LEFT+__c.Gravity.CENTER_VERTICAL));
RDebugUtils.currentLine=39911640;
 //BA.debugLineNum = 39911640;BA.debugLine="vaFDJ.AddView(Label17, (100%x + 150dip) / 2, 44di";
__ref._vafdj /*anywheresoftware.b4a.objects.PanelWrapper*/ .AddView((android.view.View)(_label17.getObject()),(int) ((__c.PerXToCurrent((float) (100),ba)+__c.DipToCurrent((int) (150)))/(double)2),__c.DipToCurrent((int) (44)),(int) ((__c.PerXToCurrent((float) (100),ba)-__c.DipToCurrent((int) (150)))/(double)2-__c.DipToCurrent((int) (10))),__c.DipToCurrent((int) (52)));
RDebugUtils.currentLine=39911642;
 //BA.debugLineNum = 39911642;BA.debugLine="btnFDJsave.Initialize(\"btnFDJsave\")";
__ref._btnfdjsave /*anywheresoftware.b4a.objects.ButtonWrapper*/ .Initialize(ba,"btnFDJsave");
RDebugUtils.currentLine=39911643;
 //BA.debugLineNum = 39911643;BA.debugLine="btnFDJsave.Text = \"speichern\"";
__ref._btnfdjsave /*anywheresoftware.b4a.objects.ButtonWrapper*/ .setText(BA.ObjectToCharSequence("speichern"));
RDebugUtils.currentLine=39911644;
 //BA.debugLineNum = 39911644;BA.debugLine="btnFDJsave.TextSize = 16";
__ref._btnfdjsave /*anywheresoftware.b4a.objects.ButtonWrapper*/ .setTextSize((float) (16));
RDebugUtils.currentLine=39911645;
 //BA.debugLineNum = 39911645;BA.debugLine="btnFDJsave.Typeface = Typeface.DEFAULT_BOLD";
__ref._btnfdjsave /*anywheresoftware.b4a.objects.ButtonWrapper*/ .setTypeface(__c.Typeface.DEFAULT_BOLD);
RDebugUtils.currentLine=39911646;
 //BA.debugLineNum = 39911646;BA.debugLine="btnFDJsave.TextColor = 0xFF16AA16";
__ref._btnfdjsave /*anywheresoftware.b4a.objects.ButtonWrapper*/ .setTextColor(((int)0xff16aa16));
RDebugUtils.currentLine=39911647;
 //BA.debugLineNum = 39911647;BA.debugLine="vaFDJ.AddView(btnFDJsave, (100%x - 150dip) / 2, 1";
__ref._vafdj /*anywheresoftware.b4a.objects.PanelWrapper*/ .AddView((android.view.View)(__ref._btnfdjsave /*anywheresoftware.b4a.objects.ButtonWrapper*/ .getObject()),(int) ((__c.PerXToCurrent((float) (100),ba)-__c.DipToCurrent((int) (150)))/(double)2),__c.DipToCurrent((int) (104)),__c.DipToCurrent((int) (150)),__c.DipToCurrent((int) (44)));
RDebugUtils.currentLine=39911650;
 //BA.debugLineNum = 39911650;BA.debugLine="haDown.Initialize(\"\")";
__ref._hadown /*anywheresoftware.b4a.objects.PanelWrapper*/ .Initialize(ba,"");
RDebugUtils.currentLine=39911651;
 //BA.debugLineNum = 39911651;BA.debugLine="haDown.Color = 0xFFEEFFEE";
__ref._hadown /*anywheresoftware.b4a.objects.PanelWrapper*/ .setColor(((int)0xffeeffee));
RDebugUtils.currentLine=39911652;
 //BA.debugLineNum = 39911652;BA.debugLine="haDown.Visible = False";
__ref._hadown /*anywheresoftware.b4a.objects.PanelWrapper*/ .setVisible(__c.False);
RDebugUtils.currentLine=39911653;
 //BA.debugLineNum = 39911653;BA.debugLine="Root.AddView(haDown, 0, 80dip, 100%x, 42dip)";
__ref._root /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .AddView((android.view.View)(__ref._hadown /*anywheresoftware.b4a.objects.PanelWrapper*/ .getObject()),(int) (0),__c.DipToCurrent((int) (80)),__c.PerXToCurrent((float) (100),ba),__c.DipToCurrent((int) (42)));
RDebugUtils.currentLine=39911655;
 //BA.debugLineNum = 39911655;BA.debugLine="btnShare.Initialize(\"btnShare\")";
__ref._btnshare /*anywheresoftware.b4a.objects.ButtonWrapper*/ .Initialize(ba,"btnShare");
RDebugUtils.currentLine=39911656;
 //BA.debugLineNum = 39911656;BA.debugLine="SetButtonImageSafe(btnShare, \"share.png\", \"📤\")";
__ref._setbuttonimagesafe /*String*/ (null,__ref._btnshare /*anywheresoftware.b4a.objects.ButtonWrapper*/ ,"share.png","📤");
RDebugUtils.currentLine=39911657;
 //BA.debugLineNum = 39911657;BA.debugLine="haDown.AddView(btnShare, 8dip, 7dip, 28dip, 28dip";
__ref._hadown /*anywheresoftware.b4a.objects.PanelWrapper*/ .AddView((android.view.View)(__ref._btnshare /*anywheresoftware.b4a.objects.ButtonWrapper*/ .getObject()),__c.DipToCurrent((int) (8)),__c.DipToCurrent((int) (7)),__c.DipToCurrent((int) (28)),__c.DipToCurrent((int) (28)));
RDebugUtils.currentLine=39911659;
 //BA.debugLineNum = 39911659;BA.debugLine="Dim Label15 As Label";
_label15 = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=39911660;
 //BA.debugLineNum = 39911660;BA.debugLine="Label15.Initialize(\"\")";
_label15.Initialize(ba,"");
RDebugUtils.currentLine=39911661;
 //BA.debugLineNum = 39911661;BA.debugLine="Label15.Text = \"Ergebnisliste\"";
_label15.setText(BA.ObjectToCharSequence("Ergebnisliste"));
RDebugUtils.currentLine=39911662;
 //BA.debugLineNum = 39911662;BA.debugLine="Label15.TextSize = 16";
_label15.setTextSize((float) (16));
RDebugUtils.currentLine=39911663;
 //BA.debugLineNum = 39911663;BA.debugLine="Label15.Typeface = Typeface.DEFAULT_BOLD";
_label15.setTypeface(__c.Typeface.DEFAULT_BOLD);
RDebugUtils.currentLine=39911664;
 //BA.debugLineNum = 39911664;BA.debugLine="Label15.TextColor = Colors.Black";
_label15.setTextColor(__c.Colors.Black);
RDebugUtils.currentLine=39911665;
 //BA.debugLineNum = 39911665;BA.debugLine="Label15.Gravity = Gravity.CENTER";
_label15.setGravity(__c.Gravity.CENTER);
RDebugUtils.currentLine=39911666;
 //BA.debugLineNum = 39911666;BA.debugLine="haDown.AddView(Label15, 45dip, 5dip, 100%x - 90di";
__ref._hadown /*anywheresoftware.b4a.objects.PanelWrapper*/ .AddView((android.view.View)(_label15.getObject()),__c.DipToCurrent((int) (45)),__c.DipToCurrent((int) (5)),(int) (__c.PerXToCurrent((float) (100),ba)-__c.DipToCurrent((int) (90))),__c.DipToCurrent((int) (32)));
RDebugUtils.currentLine=39911668;
 //BA.debugLineNum = 39911668;BA.debugLine="btnDown.Initialize(\"btnDown\")";
__ref._btndown /*anywheresoftware.b4a.objects.ButtonWrapper*/ .Initialize(ba,"btnDown");
RDebugUtils.currentLine=39911669;
 //BA.debugLineNum = 39911669;BA.debugLine="SetButtonImageSafe(btnDown, \"down.png\", \"▼\")";
__ref._setbuttonimagesafe /*String*/ (null,__ref._btndown /*anywheresoftware.b4a.objects.ButtonWrapper*/ ,"down.png","▼");
RDebugUtils.currentLine=39911670;
 //BA.debugLineNum = 39911670;BA.debugLine="haDown.AddView(btnDown, 100%x - 40dip, 5dip, 32di";
__ref._hadown /*anywheresoftware.b4a.objects.PanelWrapper*/ .AddView((android.view.View)(__ref._btndown /*anywheresoftware.b4a.objects.ButtonWrapper*/ .getObject()),(int) (__c.PerXToCurrent((float) (100),ba)-__c.DipToCurrent((int) (40))),__c.DipToCurrent((int) (5)),__c.DipToCurrent((int) (32)),__c.DipToCurrent((int) (32)));
RDebugUtils.currentLine=39911673;
 //BA.debugLineNum = 39911673;BA.debugLine="webErgebnis.Initialize(\"webErgebnis\")";
__ref._webergebnis /*anywheresoftware.b4a.objects.WebViewWrapper*/ .Initialize(ba,"webErgebnis");
RDebugUtils.currentLine=39911674;
 //BA.debugLineNum = 39911674;BA.debugLine="webErgebnis.JavaScriptEnabled = True";
__ref._webergebnis /*anywheresoftware.b4a.objects.WebViewWrapper*/ .setJavaScriptEnabled(__c.True);
RDebugUtils.currentLine=39911675;
 //BA.debugLineNum = 39911675;BA.debugLine="SetupWebViewBridge";
__ref._setupwebviewbridge /*String*/ (null);
RDebugUtils.currentLine=39911676;
 //BA.debugLineNum = 39911676;BA.debugLine="Root.AddView(webErgebnis, 0, 425dip, 100%x, 100%y";
__ref._root /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .AddView((android.view.View)(__ref._webergebnis /*anywheresoftware.b4a.objects.WebViewWrapper*/ .getObject()),(int) (0),__c.DipToCurrent((int) (425)),__c.PerXToCurrent((float) (100),ba),(int) (__c.PerYToCurrent((float) (100),ba)-__c.DipToCurrent((int) (425))));
RDebugUtils.currentLine=39911679;
 //BA.debugLineNum = 39911679;BA.debugLine="lsvName.Initialize(\"lsvName\")";
__ref._lsvname /*anywheresoftware.b4a.objects.ListViewWrapper*/ .Initialize(ba,"lsvName");
RDebugUtils.currentLine=39911680;
 //BA.debugLineNum = 39911680;BA.debugLine="lsvName.Color = 0xFFEFEFEF";
__ref._lsvname /*anywheresoftware.b4a.objects.ListViewWrapper*/ .setColor(((int)0xffefefef));
RDebugUtils.currentLine=39911681;
 //BA.debugLineNum = 39911681;BA.debugLine="lsvName.SingleLineLayout.Label.TextColor = 0xFF33";
__ref._lsvname /*anywheresoftware.b4a.objects.ListViewWrapper*/ .getSingleLineLayout().Label.setTextColor(((int)0xff3333ff));
RDebugUtils.currentLine=39911682;
 //BA.debugLineNum = 39911682;BA.debugLine="lsvName.SingleLineLayout.Label.TextSize = 16";
__ref._lsvname /*anywheresoftware.b4a.objects.ListViewWrapper*/ .getSingleLineLayout().Label.setTextSize((float) (16));
RDebugUtils.currentLine=39911683;
 //BA.debugLineNum = 39911683;BA.debugLine="lsvName.Visible = False";
__ref._lsvname /*anywheresoftware.b4a.objects.ListViewWrapper*/ .setVisible(__c.False);
RDebugUtils.currentLine=39911684;
 //BA.debugLineNum = 39911684;BA.debugLine="Root.AddView(lsvName, 10%x, 262dip, 80%x, 150dip)";
__ref._root /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .AddView((android.view.View)(__ref._lsvname /*anywheresoftware.b4a.objects.ListViewWrapper*/ .getObject()),__c.PerXToCurrent((float) (10),ba),__c.DipToCurrent((int) (262)),__c.PerXToCurrent((float) (80),ba),__c.DipToCurrent((int) (150)));
RDebugUtils.currentLine=39911685;
 //BA.debugLineNum = 39911685;BA.debugLine="End Sub";
return "";
}
public void  _btnclosevstng_click(b4a.example.screenmain __ref) throws Exception{
RDebugUtils.currentModule="screenmain";
if (Debug.shouldDelegate(ba, "btnclosevstng_click", false))
	 {Debug.delegate(ba, "btnclosevstng_click", null); return;}
ResumableSub_btnCloseVstng_Click rsub = new ResumableSub_btnCloseVstng_Click(this,__ref);
rsub.resume(ba, null);
}
public static class ResumableSub_btnCloseVstng_Click extends BA.ResumableSub {
public ResumableSub_btnCloseVstng_Click(b4a.example.screenmain parent,b4a.example.screenmain __ref) {
this.parent = parent;
this.__ref = __ref;
this.__ref = parent;
}
b4a.example.screenmain __ref;
b4a.example.screenmain parent;
int _res;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="screenmain";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=42795009;
 //BA.debugLineNum = 42795009;BA.debugLine="Msgbox2Async(\"Die Veranstaltung \" & QUOTE & lblVe";
parent.__c.Msgbox2Async(BA.ObjectToCharSequence("Die Veranstaltung "+parent.__c.QUOTE+__ref._lblveranstaltung /*anywheresoftware.b4a.objects.LabelWrapper*/ .getText()+parent.__c.QUOTE+" wird zur Bearbeitung gesperrt und kann danach nicht mehr geändert werden. Es wird nur noch die Ergebnisliste angezeigt."),BA.ObjectToCharSequence("Veranstaltung abschließen"),"Abschließen","Abbrechen","",(anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper(), (android.graphics.Bitmap)(parent.__c.Null)),ba,parent.__c.True);
RDebugUtils.currentLine=42795010;
 //BA.debugLineNum = 42795010;BA.debugLine="Wait For Msgbox_Result (res As Int)";
parent.__c.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "screenmain", "btnclosevstng_click"), null);
this.state = 5;
return;
case 5:
//C
this.state = 1;
_res = (Integer) result[1];
;
RDebugUtils.currentLine=42795011;
 //BA.debugLineNum = 42795011;BA.debugLine="If res = DialogResponse.POSITIVE Then";
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
RDebugUtils.currentLine=42795012;
 //BA.debugLineNum = 42795012;BA.debugLine="closeVstng(\"Ergebnisse\")";
__ref._closevstng /*String*/ (null,"Ergebnisse");
 if (true) break;

case 4:
//C
this.state = -1;
;
RDebugUtils.currentLine=42795014;
 //BA.debugLineNum = 42795014;BA.debugLine="startTimer";
__ref._starttimer /*String*/ (null);
RDebugUtils.currentLine=42795015;
 //BA.debugLineNum = 42795015;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public String  _closevstng(b4a.example.screenmain __ref,String _table) throws Exception{
__ref = this;
RDebugUtils.currentModule="screenmain";
if (Debug.shouldDelegate(ba, "closevstng", false))
	 {return ((String) Debug.delegate(ba, "closevstng", new Object[] {_table}));}
String _verdatum = "";
String[] _key = null;
String _keystr = "";
anywheresoftware.b4a.objects.collections.Map _body = null;
anywheresoftware.b4a.objects.collections.JSONParser.JSONGenerator _jg = null;
RDebugUtils.currentLine=41484288;
 //BA.debugLineNum = 41484288;BA.debugLine="Private Sub closeVstng(table As String)";
RDebugUtils.currentLine=41484289;
 //BA.debugLineNum = 41484289;BA.debugLine="If table = \"Ergebnisse\" Then";
if ((_table).equals("Ergebnisse")) { 
RDebugUtils.currentLine=41484290;
 //BA.debugLineNum = 41484290;BA.debugLine="DBdatenTyp = \"ErgClosed\"";
__ref._dbdatentyp /*String*/  = "ErgClosed";
RDebugUtils.currentLine=41484291;
 //BA.debugLineNum = 41484291;BA.debugLine="Dim verDatum As String = DBGet(\"VeranstaltungDat";
_verdatum = BA.ObjectToString(__ref._dbget /*Object*/ (null,"VeranstaltungDatum",(Object)(__ref._formatdatecustom /*String*/ (null,__c.DateTime.getNow(),"dd.MM.yyyy"))));
RDebugUtils.currentLine=41484292;
 //BA.debugLineNum = 41484292;BA.debugLine="Dim key() As String = Regex.Split(\"\\.\", verDatum";
_key = __c.Regex.Split("\\.",_verdatum);
RDebugUtils.currentLine=41484293;
 //BA.debugLineNum = 41484293;BA.debugLine="CurrentWebUrl = URLErgebnisse & \"/e\" & key(2) &";
__ref._currentweburl /*String*/  = __ref._urlergebnisse /*String*/ +"/e"+_key[(int) (2)]+_key[(int) (1)]+_key[(int) (0)]+".json?auth="+BA.ObjectToString(__ref._status /*anywheresoftware.b4a.objects.collections.Map*/ .GetDefault((Object)("idToken"),(Object)("")));
 }else {
RDebugUtils.currentLine=41484295;
 //BA.debugLineNum = 41484295;BA.debugLine="DBdatenTyp = \"VSTNGclosed\"";
__ref._dbdatentyp /*String*/  = "VSTNGclosed";
RDebugUtils.currentLine=41484296;
 //BA.debugLineNum = 41484296;BA.debugLine="Dim keyStr As String = DBGet(\"VeranstaltungID\",";
_keystr = BA.ObjectToString(__ref._dbget /*Object*/ (null,"VeranstaltungID",(Object)("v0")));
RDebugUtils.currentLine=41484297;
 //BA.debugLineNum = 41484297;BA.debugLine="CurrentWebUrl = URLveranstaltungen & \"/\" & keySt";
__ref._currentweburl /*String*/  = __ref._urlveranstaltungen /*String*/ +"/"+_keystr+".json?auth="+BA.ObjectToString(__ref._status /*anywheresoftware.b4a.objects.collections.Map*/ .GetDefault((Object)("idToken"),(Object)("")));
 };
RDebugUtils.currentLine=41484300;
 //BA.debugLineNum = 41484300;BA.debugLine="Dim body As Map = CreateMap(\"Status\": \"geschlosse";
_body = new anywheresoftware.b4a.objects.collections.Map();
_body = __c.createMap(new Object[] {(Object)("Status"),(Object)("geschlossen")});
RDebugUtils.currentLine=41484301;
 //BA.debugLineNum = 41484301;BA.debugLine="Dim jg As JSONGenerator";
_jg = new anywheresoftware.b4a.objects.collections.JSONParser.JSONGenerator();
RDebugUtils.currentLine=41484302;
 //BA.debugLineNum = 41484302;BA.debugLine="jg.Initialize(body)";
_jg.Initialize(_body);
RDebugUtils.currentLine=41484303;
 //BA.debugLineNum = 41484303;BA.debugLine="PatchTextWeb(jg.ToString)";
__ref._patchtextweb /*String*/ (null,_jg.ToString());
RDebugUtils.currentLine=41484304;
 //BA.debugLineNum = 41484304;BA.debugLine="End Sub";
return "";
}
public String  _btndown_click(b4a.example.screenmain __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="screenmain";
if (Debug.shouldDelegate(ba, "btndown_click", false))
	 {return ((String) Debug.delegate(ba, "btndown_click", null));}
RDebugUtils.currentLine=42467328;
 //BA.debugLineNum = 42467328;BA.debugLine="Private Sub btnDown_Click";
RDebugUtils.currentLine=42467329;
 //BA.debugLineNum = 42467329;BA.debugLine="vaEingabe.Visible = True";
__ref._vaeingabe /*anywheresoftware.b4a.objects.PanelWrapper*/ .setVisible(__c.True);
RDebugUtils.currentLine=42467330;
 //BA.debugLineNum = 42467330;BA.debugLine="haDown.Visible = False";
__ref._hadown /*anywheresoftware.b4a.objects.PanelWrapper*/ .setVisible(__c.False);
RDebugUtils.currentLine=42467331;
 //BA.debugLineNum = 42467331;BA.debugLine="btnDown.Visible = False";
__ref._btndown /*anywheresoftware.b4a.objects.ButtonWrapper*/ .setVisible(__c.False);
RDebugUtils.currentLine=42467332;
 //BA.debugLineNum = 42467332;BA.debugLine="UpdateLayoutPositions";
__ref._updatelayoutpositions /*String*/ (null);
RDebugUtils.currentLine=42467333;
 //BA.debugLineNum = 42467333;BA.debugLine="startTimer";
__ref._starttimer /*String*/ (null);
RDebugUtils.currentLine=42467334;
 //BA.debugLineNum = 42467334;BA.debugLine="End Sub";
return "";
}
public String  _updatelayoutpositions(b4a.example.screenmain __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="screenmain";
if (Debug.shouldDelegate(ba, "updatelayoutpositions", false))
	 {return ((String) Debug.delegate(ba, "updatelayoutpositions", null));}
RDebugUtils.currentLine=40304640;
 //BA.debugLineNum = 40304640;BA.debugLine="Private Sub UpdateLayoutPositions";
RDebugUtils.currentLine=40304641;
 //BA.debugLineNum = 40304641;BA.debugLine="If vaEingabe.Visible Then";
if (__ref._vaeingabe /*anywheresoftware.b4a.objects.PanelWrapper*/ .getVisible()) { 
RDebugUtils.currentLine=40304642;
 //BA.debugLineNum = 40304642;BA.debugLine="webErgebnis.Top = 425dip";
__ref._webergebnis /*anywheresoftware.b4a.objects.WebViewWrapper*/ .setTop(__c.DipToCurrent((int) (425)));
RDebugUtils.currentLine=40304643;
 //BA.debugLineNum = 40304643;BA.debugLine="webErgebnis.Height = 100%y - 425dip";
__ref._webergebnis /*anywheresoftware.b4a.objects.WebViewWrapper*/ .setHeight((int) (__c.PerYToCurrent((float) (100),ba)-__c.DipToCurrent((int) (425))));
 }else {
RDebugUtils.currentLine=40304645;
 //BA.debugLineNum = 40304645;BA.debugLine="webErgebnis.Top = 126dip";
__ref._webergebnis /*anywheresoftware.b4a.objects.WebViewWrapper*/ .setTop(__c.DipToCurrent((int) (126)));
RDebugUtils.currentLine=40304646;
 //BA.debugLineNum = 40304646;BA.debugLine="webErgebnis.Height = 100%y - 126dip";
__ref._webergebnis /*anywheresoftware.b4a.objects.WebViewWrapper*/ .setHeight((int) (__c.PerYToCurrent((float) (100),ba)-__c.DipToCurrent((int) (126))));
 };
RDebugUtils.currentLine=40304648;
 //BA.debugLineNum = 40304648;BA.debugLine="End Sub";
return "";
}
public String  _btnfdjback_click(b4a.example.screenmain __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="screenmain";
if (Debug.shouldDelegate(ba, "btnfdjback_click", false))
	 {return ((String) Debug.delegate(ba, "btnfdjback_click", null));}
RDebugUtils.currentLine=42991616;
 //BA.debugLineNum = 42991616;BA.debugLine="Private Sub btnFDJback_Click";
RDebugUtils.currentLine=42991617;
 //BA.debugLineNum = 42991617;BA.debugLine="vaErgEingabe.Visible = True";
__ref._vaergeingabe /*anywheresoftware.b4a.objects.PanelWrapper*/ .setVisible(__c.True);
RDebugUtils.currentLine=42991618;
 //BA.debugLineNum = 42991618;BA.debugLine="vaFDJ.Visible = False";
__ref._vafdj /*anywheresoftware.b4a.objects.PanelWrapper*/ .setVisible(__c.False);
RDebugUtils.currentLine=42991619;
 //BA.debugLineNum = 42991619;BA.debugLine="startTimer";
__ref._starttimer /*String*/ (null);
RDebugUtils.currentLine=42991620;
 //BA.debugLineNum = 42991620;BA.debugLine="End Sub";
return "";
}
public String  _btnfdjeingabe_click(b4a.example.screenmain __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="screenmain";
if (Debug.shouldDelegate(ba, "btnfdjeingabe_click", false))
	 {return ((String) Debug.delegate(ba, "btnfdjeingabe_click", null));}
RDebugUtils.currentLine=42926080;
 //BA.debugLineNum = 42926080;BA.debugLine="Private Sub btnFDJeingabe_Click";
RDebugUtils.currentLine=42926081;
 //BA.debugLineNum = 42926081;BA.debugLine="vaErgEingabe.Visible = False";
__ref._vaergeingabe /*anywheresoftware.b4a.objects.PanelWrapper*/ .setVisible(__c.False);
RDebugUtils.currentLine=42926082;
 //BA.debugLineNum = 42926082;BA.debugLine="vaFDJ.Visible = True";
__ref._vafdj /*anywheresoftware.b4a.objects.PanelWrapper*/ .setVisible(__c.True);
RDebugUtils.currentLine=42926083;
 //BA.debugLineNum = 42926083;BA.debugLine="tbxFDJgewicht.Enabled = True";
__ref._tbxfdjgewicht /*anywheresoftware.b4a.objects.EditTextWrapper*/ .setEnabled(__c.True);
RDebugUtils.currentLine=42926084;
 //BA.debugLineNum = 42926084;BA.debugLine="btnFDJsave.Enabled = False";
__ref._btnfdjsave /*anywheresoftware.b4a.objects.ButtonWrapper*/ .setEnabled(__c.False);
RDebugUtils.currentLine=42926085;
 //BA.debugLineNum = 42926085;BA.debugLine="btnFDJsave.TextColor = 0xFF888888";
__ref._btnfdjsave /*anywheresoftware.b4a.objects.ButtonWrapper*/ .setTextColor(((int)0xff888888));
RDebugUtils.currentLine=42926086;
 //BA.debugLineNum = 42926086;BA.debugLine="tbxFDJgewicht.SelectionStart = tbxFDJgewicht.Text";
__ref._tbxfdjgewicht /*anywheresoftware.b4a.objects.EditTextWrapper*/ .setSelectionStart(__ref._tbxfdjgewicht /*anywheresoftware.b4a.objects.EditTextWrapper*/ .getText().length());
RDebugUtils.currentLine=42926087;
 //BA.debugLineNum = 42926087;BA.debugLine="tbxFDJgewicht.RequestFocus";
__ref._tbxfdjgewicht /*anywheresoftware.b4a.objects.EditTextWrapper*/ .RequestFocus();
RDebugUtils.currentLine=42926088;
 //BA.debugLineNum = 42926088;BA.debugLine="startTimer";
__ref._starttimer /*String*/ (null);
RDebugUtils.currentLine=42926089;
 //BA.debugLineNum = 42926089;BA.debugLine="End Sub";
return "";
}
public String  _btnfdjsave_click(b4a.example.screenmain __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="screenmain";
if (Debug.shouldDelegate(ba, "btnfdjsave_click", false))
	 {return ((String) Debug.delegate(ba, "btnfdjsave_click", null));}
RDebugUtils.currentLine=43057152;
 //BA.debugLineNum = 43057152;BA.debugLine="Private Sub btnFDJsave_Click";
RDebugUtils.currentLine=43057153;
 //BA.debugLineNum = 43057153;BA.debugLine="vaErgEingabe.Visible = True";
__ref._vaergeingabe /*anywheresoftware.b4a.objects.PanelWrapper*/ .setVisible(__c.True);
RDebugUtils.currentLine=43057154;
 //BA.debugLineNum = 43057154;BA.debugLine="vaFDJ.Visible = False";
__ref._vafdj /*anywheresoftware.b4a.objects.PanelWrapper*/ .setVisible(__c.False);
RDebugUtils.currentLine=43057155;
 //BA.debugLineNum = 43057155;BA.debugLine="tbxFDJgewicht.Enabled = False";
__ref._tbxfdjgewicht /*anywheresoftware.b4a.objects.EditTextWrapper*/ .setEnabled(__c.False);
RDebugUtils.currentLine=43057156;
 //BA.debugLineNum = 43057156;BA.debugLine="btnFDJsave.Enabled = False";
__ref._btnfdjsave /*anywheresoftware.b4a.objects.ButtonWrapper*/ .setEnabled(__c.False);
RDebugUtils.currentLine=43057157;
 //BA.debugLineNum = 43057157;BA.debugLine="HideKeyboard";
__ref._hidekeyboard /*String*/ (null);
RDebugUtils.currentLine=43057159;
 //BA.debugLineNum = 43057159;BA.debugLine="RunJS(\"setzeFDJ(\" & QUOTE & tbxFDJgewicht.Text &";
__ref._runjs /*String*/ (null,"setzeFDJ("+__c.QUOTE+__ref._tbxfdjgewicht /*anywheresoftware.b4a.objects.EditTextWrapper*/ .getText()+__c.QUOTE+","+__c.QUOTE+__ref._tbxteilnehmer /*anywheresoftware.b4a.objects.EditTextWrapper*/ .getText()+__c.QUOTE+");");
RDebugUtils.currentLine=43057160;
 //BA.debugLineNum = 43057160;BA.debugLine="DBPut(\"FDJTeilnehmer\", tbxTeilnehmer.Text)";
__ref._dbput /*String*/ (null,"FDJTeilnehmer",(Object)(__ref._tbxteilnehmer /*anywheresoftware.b4a.objects.EditTextWrapper*/ .getText()));
RDebugUtils.currentLine=43057161;
 //BA.debugLineNum = 43057161;BA.debugLine="DBPut(\"FDJGewicht\", tbxFDJgewicht.Text)";
__ref._dbput /*String*/ (null,"FDJGewicht",(Object)(__ref._tbxfdjgewicht /*anywheresoftware.b4a.objects.EditTextWrapper*/ .getText()));
RDebugUtils.currentLine=43057162;
 //BA.debugLineNum = 43057162;BA.debugLine="saveFDJ";
__ref._savefdj /*String*/ (null);
RDebugUtils.currentLine=43057163;
 //BA.debugLineNum = 43057163;BA.debugLine="startTimer";
__ref._starttimer /*String*/ (null);
RDebugUtils.currentLine=43057164;
 //BA.debugLineNum = 43057164;BA.debugLine="End Sub";
return "";
}
public String  _hidekeyboard(b4a.example.screenmain __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="screenmain";
if (Debug.shouldDelegate(ba, "hidekeyboard", false))
	 {return ((String) Debug.delegate(ba, "hidekeyboard", null));}
anywheresoftware.b4a.phone.Phone _p = null;
RDebugUtils.currentLine=43843584;
 //BA.debugLineNum = 43843584;BA.debugLine="Private Sub HideKeyboard";
RDebugUtils.currentLine=43843585;
 //BA.debugLineNum = 43843585;BA.debugLine="Dim p As Phone";
_p = new anywheresoftware.b4a.phone.Phone();
RDebugUtils.currentLine=43843586;
 //BA.debugLineNum = 43843586;BA.debugLine="p.HideKeyboard(B4XPages.GetNativeParent(Me))";
_p.HideKeyboard(_b4xpages._getnativeparent /*anywheresoftware.b4a.objects.ActivityWrapper*/ (ba,this));
RDebugUtils.currentLine=43843587;
 //BA.debugLineNum = 43843587;BA.debugLine="End Sub";
return "";
}
public String  _runjs(b4a.example.screenmain __ref,String _jscode) throws Exception{
__ref = this;
RDebugUtils.currentModule="screenmain";
if (Debug.shouldDelegate(ba, "runjs", false))
	 {return ((String) Debug.delegate(ba, "runjs", new Object[] {_jscode}));}
anywheresoftware.b4j.object.JavaObject _jo = null;
RDebugUtils.currentLine=40828928;
 //BA.debugLineNum = 40828928;BA.debugLine="Private Sub RunJS(jsCode As String)";
RDebugUtils.currentLine=40828929;
 //BA.debugLineNum = 40828929;BA.debugLine="Dim jo As JavaObject = webErgebnis";
_jo = new anywheresoftware.b4j.object.JavaObject();
_jo = (anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(__ref._webergebnis /*anywheresoftware.b4a.objects.WebViewWrapper*/ .getObject()));
RDebugUtils.currentLine=40828930;
 //BA.debugLineNum = 40828930;BA.debugLine="jo.RunMethod(\"evaluateJavascript\", Array As Objec";
_jo.RunMethod("evaluateJavascript",new Object[]{(Object)(_jscode),__c.Null});
RDebugUtils.currentLine=40828931;
 //BA.debugLineNum = 40828931;BA.debugLine="End Sub";
return "";
}
public String  _savefdj(b4a.example.screenmain __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="screenmain";
if (Debug.shouldDelegate(ba, "savefdj", false))
	 {return ((String) Debug.delegate(ba, "savefdj", null));}
String _verdatum = "";
String[] _parts = null;
anywheresoftware.b4a.objects.collections.Map _body = null;
anywheresoftware.b4a.objects.collections.JSONParser.JSONGenerator _jg = null;
RDebugUtils.currentLine=41418752;
 //BA.debugLineNum = 41418752;BA.debugLine="Private Sub saveFDJ";
RDebugUtils.currentLine=41418753;
 //BA.debugLineNum = 41418753;BA.debugLine="DBdatenTyp = \"FDJ\"";
__ref._dbdatentyp /*String*/  = "FDJ";
RDebugUtils.currentLine=41418754;
 //BA.debugLineNum = 41418754;BA.debugLine="Dim verDatum As String = DBGet(\"VeranstaltungDatu";
_verdatum = BA.ObjectToString(__ref._dbget /*Object*/ (null,"VeranstaltungDatum",(Object)("00.00.0000")));
RDebugUtils.currentLine=41418755;
 //BA.debugLineNum = 41418755;BA.debugLine="Dim parts() As String = Regex.Split(\"\\.\", verDatu";
_parts = __c.Regex.Split("\\.",_verdatum);
RDebugUtils.currentLine=41418756;
 //BA.debugLineNum = 41418756;BA.debugLine="CurrentWebUrl = URLfdj.Replace(\"[xxxx]\", parts(2)";
__ref._currentweburl /*String*/  = __ref._urlfdj /*String*/ .replace("[xxxx]",_parts[(int) (2)])+".json?auth="+BA.ObjectToString(__ref._status /*anywheresoftware.b4a.objects.collections.Map*/ .GetDefault((Object)("idToken"),(Object)("")));
RDebugUtils.currentLine=41418758;
 //BA.debugLineNum = 41418758;BA.debugLine="Dim body As Map = CreateMap( _ 		\"Gewicht\": DBGet";
_body = new anywheresoftware.b4a.objects.collections.Map();
_body = __c.createMap(new Object[] {(Object)("Gewicht"),__ref._dbget /*Object*/ (null,"FDJGewicht",(Object)("0")),(Object)("Teilnehmer"),__ref._dbget /*Object*/ (null,"FDJTeilnehmer",(Object)("- noch offen -"))});
RDebugUtils.currentLine=41418761;
 //BA.debugLineNum = 41418761;BA.debugLine="DBPut(\"letzteÄnderung\", CreateMap(\"Änderung\": Tru";
__ref._dbput /*String*/ (null,"letzteÄnderung",(Object)(__c.createMap(new Object[] {(Object)("Änderung"),(Object)(__c.True),(Object)("Datum"),(Object)(__ref._zeitstempel /*String*/ (null))}).getObject()));
RDebugUtils.currentLine=41418763;
 //BA.debugLineNum = 41418763;BA.debugLine="Dim jg As JSONGenerator";
_jg = new anywheresoftware.b4a.objects.collections.JSONParser.JSONGenerator();
RDebugUtils.currentLine=41418764;
 //BA.debugLineNum = 41418764;BA.debugLine="jg.Initialize(body)";
_jg.Initialize(_body);
RDebugUtils.currentLine=41418765;
 //BA.debugLineNum = 41418765;BA.debugLine="PatchTextWeb(jg.ToString)";
__ref._patchtextweb /*String*/ (null,_jg.ToString());
RDebugUtils.currentLine=41418766;
 //BA.debugLineNum = 41418766;BA.debugLine="End Sub";
return "";
}
public String  _btnminus_click(b4a.example.screenmain __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="screenmain";
if (Debug.shouldDelegate(ba, "btnminus_click", false))
	 {return ((String) Debug.delegate(ba, "btnminus_click", null));}
RDebugUtils.currentLine=42598400;
 //BA.debugLineNum = 42598400;BA.debugLine="Private Sub btnMinus_Click";
RDebugUtils.currentLine=42598401;
 //BA.debugLineNum = 42598401;BA.debugLine="If PlatzSelected > 1 Then";
if (__ref._platzselected /*int*/ >1) { 
RDebugUtils.currentLine=42598402;
 //BA.debugLineNum = 42598402;BA.debugLine="If btnSpeichern.Enabled Then speichern";
if (__ref._btnspeichern /*anywheresoftware.b4a.objects.ButtonWrapper*/ .getEnabled()) { 
__ref._speichern /*String*/ (null);};
RDebugUtils.currentLine=42598403;
 //BA.debugLineNum = 42598403;BA.debugLine="SelectNewRow = PlatzSelected - 1";
__ref._selectnewrow /*int*/  = (int) (__ref._platzselected /*int*/ -1);
RDebugUtils.currentLine=42598404;
 //BA.debugLineNum = 42598404;BA.debugLine="If Not(btnSpeichern.Enabled) Then";
if (__c.Not(__ref._btnspeichern /*anywheresoftware.b4a.objects.ButtonWrapper*/ .getEnabled())) { 
RDebugUtils.currentLine=42598405;
 //BA.debugLineNum = 42598405;BA.debugLine="RunJS(\"selectRowById(\" & SelectNewRow & \");\")";
__ref._runjs /*String*/ (null,"selectRowById("+BA.NumberToString(__ref._selectnewrow /*int*/ )+");");
 };
 };
RDebugUtils.currentLine=42598408;
 //BA.debugLineNum = 42598408;BA.debugLine="startTimer";
__ref._starttimer /*String*/ (null);
RDebugUtils.currentLine=42598409;
 //BA.debugLineNum = 42598409;BA.debugLine="End Sub";
return "";
}
public String  _speichern(b4a.example.screenmain __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="screenmain";
if (Debug.shouldDelegate(ba, "speichern", false))
	 {return ((String) Debug.delegate(ba, "speichern", null));}
double _val = 0;
int _position = 0;
RDebugUtils.currentLine=41287680;
 //BA.debugLineNum = 41287680;BA.debugLine="Private Sub speichern";
RDebugUtils.currentLine=41287681;
 //BA.debugLineNum = 41287681;BA.debugLine="If Not(IsNumber(tbxGramm.Text)) Then";
if (__c.Not(__c.IsNumber(__ref._tbxgramm /*anywheresoftware.b4a.objects.EditTextWrapper*/ .getText()))) { 
RDebugUtils.currentLine=41287682;
 //BA.debugLineNum = 41287682;BA.debugLine="tbxGramm.Text = \"0\"";
__ref._tbxgramm /*anywheresoftware.b4a.objects.EditTextWrapper*/ .setText(BA.ObjectToCharSequence("0"));
 }else {
RDebugUtils.currentLine=41287684;
 //BA.debugLineNum = 41287684;BA.debugLine="Dim val As Double = tbxGramm.Text";
_val = (double)(Double.parseDouble(__ref._tbxgramm /*anywheresoftware.b4a.objects.EditTextWrapper*/ .getText()));
RDebugUtils.currentLine=41287685;
 //BA.debugLineNum = 41287685;BA.debugLine="tbxGramm.Text = NumberFormat2(val, 1, 0, 0, Fals";
__ref._tbxgramm /*anywheresoftware.b4a.objects.EditTextWrapper*/ .setText(BA.ObjectToCharSequence(__c.NumberFormat2(_val,(int) (1),(int) (0),(int) (0),__c.False)));
 };
RDebugUtils.currentLine=41287688;
 //BA.debugLineNum = 41287688;BA.debugLine="Dim position As Int = PlatzSelected * 4 ' 0-basie";
_position = (int) (__ref._platzselected /*int*/ *4);
RDebugUtils.currentLine=41287689;
 //BA.debugLineNum = 41287689;BA.debugLine="If webviewData.Size > position + 2 Then";
if (__ref._webviewdata /*anywheresoftware.b4a.objects.collections.List*/ .getSize()>_position+2) { 
RDebugUtils.currentLine=41287690;
 //BA.debugLineNum = 41287690;BA.debugLine="webviewData.Set(position + 2, tbxGramm.Text)";
__ref._webviewdata /*anywheresoftware.b4a.objects.collections.List*/ .Set((int) (_position+2),(Object)(__ref._tbxgramm /*anywheresoftware.b4a.objects.EditTextWrapper*/ .getText()));
RDebugUtils.currentLine=41287691;
 //BA.debugLineNum = 41287691;BA.debugLine="webviewData.Set(position + 1, tbxTeilnehmer.Text";
__ref._webviewdata /*anywheresoftware.b4a.objects.collections.List*/ .Set((int) (_position+1),(Object)(__ref._tbxteilnehmer /*anywheresoftware.b4a.objects.EditTextWrapper*/ .getText().trim()));
 };
RDebugUtils.currentLine=41287693;
 //BA.debugLineNum = 41287693;BA.debugLine="saveWertungsliste(\"saveWertungsliste\")";
__ref._savewertungsliste /*String*/ (null,"saveWertungsliste");
RDebugUtils.currentLine=41287694;
 //BA.debugLineNum = 41287694;BA.debugLine="End Sub";
return "";
}
public String  _btnplus_click(b4a.example.screenmain __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="screenmain";
if (Debug.shouldDelegate(ba, "btnplus_click", false))
	 {return ((String) Debug.delegate(ba, "btnplus_click", null));}
int _maxanzahl = 0;
RDebugUtils.currentLine=42663936;
 //BA.debugLineNum = 42663936;BA.debugLine="Private Sub btnPlus_Click";
RDebugUtils.currentLine=42663937;
 //BA.debugLineNum = 42663937;BA.debugLine="Dim maxAnzahl As Int = DBGet(\"VeranstaltungAnzahl";
_maxanzahl = (int)(BA.ObjectToNumber(__ref._dbget /*Object*/ (null,"VeranstaltungAnzahl",(Object)("25"))));
RDebugUtils.currentLine=42663938;
 //BA.debugLineNum = 42663938;BA.debugLine="If PlatzSelected < maxAnzahl Then";
if (__ref._platzselected /*int*/ <_maxanzahl) { 
RDebugUtils.currentLine=42663939;
 //BA.debugLineNum = 42663939;BA.debugLine="If btnSpeichern.Enabled Then speichern";
if (__ref._btnspeichern /*anywheresoftware.b4a.objects.ButtonWrapper*/ .getEnabled()) { 
__ref._speichern /*String*/ (null);};
RDebugUtils.currentLine=42663940;
 //BA.debugLineNum = 42663940;BA.debugLine="SelectNewRow = PlatzSelected + 1";
__ref._selectnewrow /*int*/  = (int) (__ref._platzselected /*int*/ +1);
RDebugUtils.currentLine=42663941;
 //BA.debugLineNum = 42663941;BA.debugLine="If Not(btnSpeichern.Enabled) Then";
if (__c.Not(__ref._btnspeichern /*anywheresoftware.b4a.objects.ButtonWrapper*/ .getEnabled())) { 
RDebugUtils.currentLine=42663942;
 //BA.debugLineNum = 42663942;BA.debugLine="RunJS(\"selectRowById(\" & SelectNewRow & \");\")";
__ref._runjs /*String*/ (null,"selectRowById("+BA.NumberToString(__ref._selectnewrow /*int*/ )+");");
 };
 };
RDebugUtils.currentLine=42663945;
 //BA.debugLineNum = 42663945;BA.debugLine="startTimer";
__ref._starttimer /*String*/ (null);
RDebugUtils.currentLine=42663946;
 //BA.debugLineNum = 42663946;BA.debugLine="End Sub";
return "";
}
public Object  _dbget(b4a.example.screenmain __ref,String _key,Object _defaultvalue) throws Exception{
__ref = this;
RDebugUtils.currentModule="screenmain";
if (Debug.shouldDelegate(ba, "dbget", false))
	 {return ((Object) Debug.delegate(ba, "dbget", new Object[] {_key,_defaultvalue}));}
String _val = "";
anywheresoftware.b4a.objects.collections.JSONParser _jp = null;
RDebugUtils.currentLine=44040192;
 //BA.debugLineNum = 44040192;BA.debugLine="Private Sub DBGet(Key As String, DefaultValue As O";
RDebugUtils.currentLine=44040193;
 //BA.debugLineNum = 44040193;BA.debugLine="If DBVerein.ContainsKey(Key) = False Then Return";
if (__ref._dbverein /*anywheresoftware.b4a.objects.collections.Map*/ .ContainsKey((Object)(_key))==__c.False) { 
if (true) return _defaultvalue;};
RDebugUtils.currentLine=44040194;
 //BA.debugLineNum = 44040194;BA.debugLine="Dim val As String = DBVerein.Get(Key)";
_val = BA.ObjectToString(__ref._dbverein /*anywheresoftware.b4a.objects.collections.Map*/ .Get((Object)(_key)));
RDebugUtils.currentLine=44040195;
 //BA.debugLineNum = 44040195;BA.debugLine="If val.StartsWith(\"JSON_MAP:\") Then";
if (_val.startsWith("JSON_MAP:")) { 
RDebugUtils.currentLine=44040196;
 //BA.debugLineNum = 44040196;BA.debugLine="Dim jp As JSONParser";
_jp = new anywheresoftware.b4a.objects.collections.JSONParser();
RDebugUtils.currentLine=44040197;
 //BA.debugLineNum = 44040197;BA.debugLine="jp.Initialize(val.SubString(9))";
_jp.Initialize(_val.substring((int) (9)));
RDebugUtils.currentLine=44040198;
 //BA.debugLineNum = 44040198;BA.debugLine="Return jp.NextObject";
if (true) return (Object)(_jp.NextObject().getObject());
 }else 
{RDebugUtils.currentLine=44040199;
 //BA.debugLineNum = 44040199;BA.debugLine="Else If val.StartsWith(\"JSON_LIST:\") Then";
if (_val.startsWith("JSON_LIST:")) { 
RDebugUtils.currentLine=44040200;
 //BA.debugLineNum = 44040200;BA.debugLine="Dim jp As JSONParser";
_jp = new anywheresoftware.b4a.objects.collections.JSONParser();
RDebugUtils.currentLine=44040201;
 //BA.debugLineNum = 44040201;BA.debugLine="jp.Initialize(val.SubString(10))";
_jp.Initialize(_val.substring((int) (10)));
RDebugUtils.currentLine=44040202;
 //BA.debugLineNum = 44040202;BA.debugLine="Return jp.NextArray";
if (true) return (Object)(_jp.NextArray().getObject());
 }}
;
RDebugUtils.currentLine=44040204;
 //BA.debugLineNum = 44040204;BA.debugLine="Return val";
if (true) return (Object)(_val);
RDebugUtils.currentLine=44040205;
 //BA.debugLineNum = 44040205;BA.debugLine="End Sub";
return null;
}
public String  _btnsettings_click(b4a.example.screenmain __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="screenmain";
if (Debug.shouldDelegate(ba, "btnsettings_click", false))
	 {return ((String) Debug.delegate(ba, "btnsettings_click", null));}
RDebugUtils.currentLine=42270720;
 //BA.debugLineNum = 42270720;BA.debugLine="Private Sub btnSettings_Click";
RDebugUtils.currentLine=42270721;
 //BA.debugLineNum = 42270721;BA.debugLine="Uhrzeit.Enabled = False";
__ref._uhrzeit /*anywheresoftware.b4a.objects.Timer*/ .setEnabled(__c.False);
RDebugUtils.currentLine=42270722;
 //BA.debugLineNum = 42270722;BA.debugLine="OpenSettingsPage";
__ref._opensettingspage /*String*/ (null);
RDebugUtils.currentLine=42270723;
 //BA.debugLineNum = 42270723;BA.debugLine="End Sub";
return "";
}
public String  _opensettingspage(b4a.example.screenmain __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="screenmain";
if (Debug.shouldDelegate(ba, "opensettingspage", false))
	 {return ((String) Debug.delegate(ba, "opensettingspage", null));}
RDebugUtils.currentLine=42336256;
 //BA.debugLineNum = 42336256;BA.debugLine="Private Sub OpenSettingsPage";
RDebugUtils.currentLine=42336257;
 //BA.debugLineNum = 42336257;BA.debugLine="B4XPages.ShowPage(\"Settings\")";
_b4xpages._showpage /*String*/ (ba,"Settings");
RDebugUtils.currentLine=42336258;
 //BA.debugLineNum = 42336258;BA.debugLine="ToastMessageShow(\"Wechsel zu Settings\", False)";
__c.ToastMessageShow(BA.ObjectToCharSequence("Wechsel zu Settings"),__c.False);
RDebugUtils.currentLine=42336259;
 //BA.debugLineNum = 42336259;BA.debugLine="End Sub";
return "";
}
public String  _btnshare_click(b4a.example.screenmain __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="screenmain";
if (Debug.shouldDelegate(ba, "btnshare_click", false))
	 {return ((String) Debug.delegate(ba, "btnshare_click", null));}
RDebugUtils.currentLine=42860544;
 //BA.debugLineNum = 42860544;BA.debugLine="Private Sub btnShare_Click";
RDebugUtils.currentLine=42860545;
 //BA.debugLineNum = 42860545;BA.debugLine="RunJS(\"printView();\")";
__ref._runjs /*String*/ (null,"printView();");
RDebugUtils.currentLine=42860546;
 //BA.debugLineNum = 42860546;BA.debugLine="startTimer";
__ref._starttimer /*String*/ (null);
RDebugUtils.currentLine=42860547;
 //BA.debugLineNum = 42860547;BA.debugLine="End Sub";
return "";
}
public String  _btnspeichern_click(b4a.example.screenmain __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="screenmain";
if (Debug.shouldDelegate(ba, "btnspeichern_click", false))
	 {return ((String) Debug.delegate(ba, "btnspeichern_click", null));}
RDebugUtils.currentLine=42729472;
 //BA.debugLineNum = 42729472;BA.debugLine="Private Sub btnSpeichern_Click";
RDebugUtils.currentLine=42729473;
 //BA.debugLineNum = 42729473;BA.debugLine="HideKeyboard";
__ref._hidekeyboard /*String*/ (null);
RDebugUtils.currentLine=42729474;
 //BA.debugLineNum = 42729474;BA.debugLine="speichern";
__ref._speichern /*String*/ (null);
RDebugUtils.currentLine=42729475;
 //BA.debugLineNum = 42729475;BA.debugLine="startTimer";
__ref._starttimer /*String*/ (null);
RDebugUtils.currentLine=42729476;
 //BA.debugLineNum = 42729476;BA.debugLine="End Sub";
return "";
}
public String  _btnup_click(b4a.example.screenmain __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="screenmain";
if (Debug.shouldDelegate(ba, "btnup_click", false))
	 {return ((String) Debug.delegate(ba, "btnup_click", null));}
RDebugUtils.currentLine=42401792;
 //BA.debugLineNum = 42401792;BA.debugLine="Private Sub btnUp_Click";
RDebugUtils.currentLine=42401793;
 //BA.debugLineNum = 42401793;BA.debugLine="vaEingabe.Visible = False";
__ref._vaeingabe /*anywheresoftware.b4a.objects.PanelWrapper*/ .setVisible(__c.False);
RDebugUtils.currentLine=42401794;
 //BA.debugLineNum = 42401794;BA.debugLine="haDown.Visible = True";
__ref._hadown /*anywheresoftware.b4a.objects.PanelWrapper*/ .setVisible(__c.True);
RDebugUtils.currentLine=42401795;
 //BA.debugLineNum = 42401795;BA.debugLine="btnDown.Visible = True";
__ref._btndown /*anywheresoftware.b4a.objects.ButtonWrapper*/ .setVisible(__c.True);
RDebugUtils.currentLine=42401796;
 //BA.debugLineNum = 42401796;BA.debugLine="UpdateLayoutPositions";
__ref._updatelayoutpositions /*String*/ (null);
RDebugUtils.currentLine=42401797;
 //BA.debugLineNum = 42401797;BA.debugLine="startTimer";
__ref._starttimer /*String*/ (null);
RDebugUtils.currentLine=42401798;
 //BA.debugLineNum = 42401798;BA.debugLine="End Sub";
return "";
}
public String  _setbuttonimagesafe(b4a.example.screenmain __ref,anywheresoftware.b4a.objects.ButtonWrapper _btn,String _filename,String _fallbacktext) throws Exception{
__ref = this;
RDebugUtils.currentModule="screenmain";
if (Debug.shouldDelegate(ba, "setbuttonimagesafe", false))
	 {return ((String) Debug.delegate(ba, "setbuttonimagesafe", new Object[] {_btn,_filename,_fallbacktext}));}
RDebugUtils.currentLine=39976960;
 //BA.debugLineNum = 39976960;BA.debugLine="Private Sub SetButtonImageSafe(btn As Button, file";
RDebugUtils.currentLine=39976961;
 //BA.debugLineNum = 39976961;BA.debugLine="If File.Exists(File.DirAssets, fileName) Then";
if (__c.File.Exists(__c.File.getDirAssets(),_filename)) { 
RDebugUtils.currentLine=39976962;
 //BA.debugLineNum = 39976962;BA.debugLine="btn.SetBackgroundImage(LoadBitmap(File.DirAssets";
_btn.SetBackgroundImageNew((android.graphics.Bitmap)(__c.LoadBitmap(__c.File.getDirAssets(),_filename).getObject()));
 }else {
RDebugUtils.currentLine=39976964;
 //BA.debugLineNum = 39976964;BA.debugLine="btn.Text = fallbackText";
_btn.setText(BA.ObjectToCharSequence(_fallbacktext));
 };
RDebugUtils.currentLine=39976966;
 //BA.debugLineNum = 39976966;BA.debugLine="End Sub";
return "";
}
public String  _setupwebviewbridge(b4a.example.screenmain __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="screenmain";
if (Debug.shouldDelegate(ba, "setupwebviewbridge", false))
	 {return ((String) Debug.delegate(ba, "setupwebviewbridge", null));}
anywheresoftware.b4j.object.JavaObject _jo = null;
RDebugUtils.currentLine=40042496;
 //BA.debugLineNum = 40042496;BA.debugLine="Private Sub SetupWebViewBridge";
RDebugUtils.currentLine=40042497;
 //BA.debugLineNum = 40042497;BA.debugLine="Dim jo As JavaObject = webErgebnis";
_jo = new anywheresoftware.b4j.object.JavaObject();
_jo = (anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(__ref._webergebnis /*anywheresoftware.b4a.objects.WebViewWrapper*/ .getObject()));
RDebugUtils.currentLine=40042498;
 //BA.debugLineNum = 40042498;BA.debugLine="jo.RunMethod(\"addJavascriptInterface\", Array As O";
_jo.RunMethod("addJavascriptInterface",new Object[]{this,(Object)("AppInventor")});
RDebugUtils.currentLine=40042499;
 //BA.debugLineNum = 40042499;BA.debugLine="End Sub";
return "";
}
public String  _changeurl(b4a.example.screenmain __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="screenmain";
if (Debug.shouldDelegate(ba, "changeurl", false))
	 {return ((String) Debug.delegate(ba, "changeurl", null));}
String _vid = "";
RDebugUtils.currentLine=40566784;
 //BA.debugLineNum = 40566784;BA.debugLine="Private Sub changeURL";
RDebugUtils.currentLine=40566785;
 //BA.debugLineNum = 40566785;BA.debugLine="Dim vID As String = DBGet(\"VereinsID\", \"[...]\")";
_vid = BA.ObjectToString(__ref._dbget /*Object*/ (null,"VereinsID",(Object)("[...]")));
RDebugUtils.currentLine=40566786;
 //BA.debugLineNum = 40566786;BA.debugLine="URLErgebnisse = URLErgebnisse.Replace(\"[...]\", vI";
__ref._urlergebnisse /*String*/  = __ref._urlergebnisse /*String*/ .replace("[...]",_vid);
RDebugUtils.currentLine=40566787;
 //BA.debugLineNum = 40566787;BA.debugLine="URLveranstaltungen = URLveranstaltungen.Replace(\"";
__ref._urlveranstaltungen /*String*/  = __ref._urlveranstaltungen /*String*/ .replace("[...]",_vid);
RDebugUtils.currentLine=40566788;
 //BA.debugLineNum = 40566788;BA.debugLine="URLteilnehmer = URLteilnehmer.Replace(\"[...]\", vI";
__ref._urlteilnehmer /*String*/  = __ref._urlteilnehmer /*String*/ .replace("[...]",_vid);
RDebugUtils.currentLine=40566789;
 //BA.debugLineNum = 40566789;BA.debugLine="URLlastChange = URLlastChange.Replace(\"[...]\", vI";
__ref._urllastchange /*String*/  = __ref._urllastchange /*String*/ .replace("[...]",_vid);
RDebugUtils.currentLine=40566790;
 //BA.debugLineNum = 40566790;BA.debugLine="URLfdj = URLfdj.Replace(\"[...]\", vID)";
__ref._urlfdj /*String*/  = __ref._urlfdj /*String*/ .replace("[...]",_vid);
RDebugUtils.currentLine=40566791;
 //BA.debugLineNum = 40566791;BA.debugLine="End Sub";
return "";
}
public String  _class_globals(b4a.example.screenmain __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="screenmain";
RDebugUtils.currentLine=39583744;
 //BA.debugLineNum = 39583744;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=39583745;
 //BA.debugLineNum = 39583745;BA.debugLine="Private Root As B4XView";
_root = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=39583746;
 //BA.debugLineNum = 39583746;BA.debugLine="Private xui As XUI";
_xui = new anywheresoftware.b4a.objects.B4XViewWrapper.XUI();
RDebugUtils.currentLine=39583749;
 //BA.debugLineNum = 39583749;BA.debugLine="Public DBdatenTyp As String = \"\"";
_dbdatentyp = "";
RDebugUtils.currentLine=39583750;
 //BA.debugLineNum = 39583750;BA.debugLine="Public URLtest As String = \"https://console.fireb";
_urltest = "https://console.firebase.google.com";
RDebugUtils.currentLine=39583751;
 //BA.debugLineNum = 39583751;BA.debugLine="Public Teilnehmer As List";
_teilnehmer = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=39583752;
 //BA.debugLineNum = 39583752;BA.debugLine="Public URLveranstaltungen As String = \"https://we";
_urlveranstaltungen = "https://wertungslisten-app-default-rtdb.europe-west1.firebasedatabase.app/Vereine/[...]/Veranstaltungen/";
RDebugUtils.currentLine=39583753;
 //BA.debugLineNum = 39583753;BA.debugLine="Public TLNlastID As String = \"t0\"";
_tlnlastid = "t0";
RDebugUtils.currentLine=39583754;
 //BA.debugLineNum = 39583754;BA.debugLine="Public URLteilnehmer As String = \"https://wertung";
_urlteilnehmer = "https://wertungslisten-app-default-rtdb.europe-west1.firebasedatabase.app/Vereine/[...]/Teilnehmer";
RDebugUtils.currentLine=39583755;
 //BA.debugLineNum = 39583755;BA.debugLine="Public webviewData As List";
_webviewdata = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=39583756;
 //BA.debugLineNum = 39583756;BA.debugLine="Public URLErgebnisse As String = \"https://wertung";
_urlergebnisse = "https://wertungslisten-app-default-rtdb.europe-west1.firebasedatabase.app/Vereine/[...]/Ergebnisse/";
RDebugUtils.currentLine=39583757;
 //BA.debugLineNum = 39583757;BA.debugLine="Public PlatzSelected As Int = 1";
_platzselected = (int) (1);
RDebugUtils.currentLine=39583758;
 //BA.debugLineNum = 39583758;BA.debugLine="Public URLfdj As String = \"https://wertungslisten";
_urlfdj = "https://wertungslisten-app-default-rtdb.europe-west1.firebasedatabase.app/Vereine/[...]/Ergebnisse/fdj[xxxx]";
RDebugUtils.currentLine=39583759;
 //BA.debugLineNum = 39583759;BA.debugLine="Public SelectNewRow As Int = 0";
_selectnewrow = (int) (0);
RDebugUtils.currentLine=39583760;
 //BA.debugLineNum = 39583760;BA.debugLine="Public URLlastChange As String = \"https://wertung";
_urllastchange = "https://wertungslisten-app-default-rtdb.europe-west1.firebasedatabase.app/Vereine/[...]/LastChange";
RDebugUtils.currentLine=39583761;
 //BA.debugLineNum = 39583761;BA.debugLine="Public dochange As Boolean = True";
_dochange = __c.True;
RDebugUtils.currentLine=39583762;
 //BA.debugLineNum = 39583762;BA.debugLine="Public addTLN As Boolean = False";
_addtln = __c.False;
RDebugUtils.currentLine=39583763;
 //BA.debugLineNum = 39583763;BA.debugLine="Public VSTNGgeschlossen As Boolean = False";
_vstnggeschlossen = __c.False;
RDebugUtils.currentLine=39583764;
 //BA.debugLineNum = 39583764;BA.debugLine="Public Status As Map";
_status = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=39583765;
 //BA.debugLineNum = 39583765;BA.debugLine="Public colorgreen As Int = 0xFF16AA16";
_colorgreen = ((int)0xff16aa16);
RDebugUtils.currentLine=39583768;
 //BA.debugLineNum = 39583768;BA.debugLine="Private lblVerein As Label";
_lblverein = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=39583769;
 //BA.debugLineNum = 39583769;BA.debugLine="Private lblVeranstaltung As Label";
_lblveranstaltung = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=39583770;
 //BA.debugLineNum = 39583770;BA.debugLine="Private lblDatum As Label";
_lbldatum = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=39583771;
 //BA.debugLineNum = 39583771;BA.debugLine="Private btnSettings As Button";
_btnsettings = new anywheresoftware.b4a.objects.ButtonWrapper();
RDebugUtils.currentLine=39583773;
 //BA.debugLineNum = 39583773;BA.debugLine="Private vaEingabe As Panel";
_vaeingabe = new anywheresoftware.b4a.objects.PanelWrapper();
RDebugUtils.currentLine=39583774;
 //BA.debugLineNum = 39583774;BA.debugLine="Private btnCloseVstng As Button";
_btnclosevstng = new anywheresoftware.b4a.objects.ButtonWrapper();
RDebugUtils.currentLine=39583775;
 //BA.debugLineNum = 39583775;BA.debugLine="Private btnUp As Button";
_btnup = new anywheresoftware.b4a.objects.ButtonWrapper();
RDebugUtils.currentLine=39583776;
 //BA.debugLineNum = 39583776;BA.debugLine="Private btnMinus As Button";
_btnminus = new anywheresoftware.b4a.objects.ButtonWrapper();
RDebugUtils.currentLine=39583777;
 //BA.debugLineNum = 39583777;BA.debugLine="Private spnPlatz As Spinner";
_spnplatz = new anywheresoftware.b4a.objects.SpinnerWrapper();
RDebugUtils.currentLine=39583778;
 //BA.debugLineNum = 39583778;BA.debugLine="Private btnPlus As Button";
_btnplus = new anywheresoftware.b4a.objects.ButtonWrapper();
RDebugUtils.currentLine=39583779;
 //BA.debugLineNum = 39583779;BA.debugLine="Private tbxTeilnehmer As EditText";
_tbxteilnehmer = new anywheresoftware.b4a.objects.EditTextWrapper();
RDebugUtils.currentLine=39583780;
 //BA.debugLineNum = 39583780;BA.debugLine="Private lsvName As ListView";
_lsvname = new anywheresoftware.b4a.objects.ListViewWrapper();
RDebugUtils.currentLine=39583782;
 //BA.debugLineNum = 39583782;BA.debugLine="Private vaErgEingabe As Panel";
_vaergeingabe = new anywheresoftware.b4a.objects.PanelWrapper();
RDebugUtils.currentLine=39583783;
 //BA.debugLineNum = 39583783;BA.debugLine="Private btnFDJeingabe As Button";
_btnfdjeingabe = new anywheresoftware.b4a.objects.ButtonWrapper();
RDebugUtils.currentLine=39583784;
 //BA.debugLineNum = 39583784;BA.debugLine="Private tbxGramm As EditText";
_tbxgramm = new anywheresoftware.b4a.objects.EditTextWrapper();
RDebugUtils.currentLine=39583785;
 //BA.debugLineNum = 39583785;BA.debugLine="Private btnSpeichern As Button";
_btnspeichern = new anywheresoftware.b4a.objects.ButtonWrapper();
RDebugUtils.currentLine=39583787;
 //BA.debugLineNum = 39583787;BA.debugLine="Private vaFDJ As Panel";
_vafdj = new anywheresoftware.b4a.objects.PanelWrapper();
RDebugUtils.currentLine=39583788;
 //BA.debugLineNum = 39583788;BA.debugLine="Private btnFDJback As Button";
_btnfdjback = new anywheresoftware.b4a.objects.ButtonWrapper();
RDebugUtils.currentLine=39583789;
 //BA.debugLineNum = 39583789;BA.debugLine="Private tbxFDJgewicht As EditText";
_tbxfdjgewicht = new anywheresoftware.b4a.objects.EditTextWrapper();
RDebugUtils.currentLine=39583790;
 //BA.debugLineNum = 39583790;BA.debugLine="Private btnFDJsave As Button";
_btnfdjsave = new anywheresoftware.b4a.objects.ButtonWrapper();
RDebugUtils.currentLine=39583792;
 //BA.debugLineNum = 39583792;BA.debugLine="Private haDown As Panel";
_hadown = new anywheresoftware.b4a.objects.PanelWrapper();
RDebugUtils.currentLine=39583793;
 //BA.debugLineNum = 39583793;BA.debugLine="Private btnShare As Button";
_btnshare = new anywheresoftware.b4a.objects.ButtonWrapper();
RDebugUtils.currentLine=39583794;
 //BA.debugLineNum = 39583794;BA.debugLine="Private btnDown As Button";
_btndown = new anywheresoftware.b4a.objects.ButtonWrapper();
RDebugUtils.currentLine=39583796;
 //BA.debugLineNum = 39583796;BA.debugLine="Private webErgebnis As WebView";
_webergebnis = new anywheresoftware.b4a.objects.WebViewWrapper();
RDebugUtils.currentLine=39583799;
 //BA.debugLineNum = 39583799;BA.debugLine="Private Uhrzeit As Timer";
_uhrzeit = new anywheresoftware.b4a.objects.Timer();
RDebugUtils.currentLine=39583800;
 //BA.debugLineNum = 39583800;BA.debugLine="Private DBVerein As Map";
_dbverein = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=39583801;
 //BA.debugLineNum = 39583801;BA.debugLine="Private DBFileName As String = \"DBVerein.dat\"";
_dbfilename = "DBVerein.dat";
RDebugUtils.currentLine=39583802;
 //BA.debugLineNum = 39583802;BA.debugLine="Private CurrentWebUrl As String = \"\"";
_currentweburl = "";
RDebugUtils.currentLine=39583803;
 //BA.debugLineNum = 39583803;BA.debugLine="Private CurrentWebViewString As String = \"\"";
_currentwebviewstring = "";
RDebugUtils.currentLine=39583804;
 //BA.debugLineNum = 39583804;BA.debugLine="Private spnItems As List";
_spnitems = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=39583805;
 //BA.debugLineNum = 39583805;BA.debugLine="End Sub";
return "";
}
public String  _clear(b4a.example.screenmain __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="screenmain";
if (Debug.shouldDelegate(ba, "clear", false))
	 {return ((String) Debug.delegate(ba, "clear", null));}
RDebugUtils.currentLine=40435712;
 //BA.debugLineNum = 40435712;BA.debugLine="Private Sub clear";
RDebugUtils.currentLine=40435713;
 //BA.debugLineNum = 40435713;BA.debugLine="dochange = False";
__ref._dochange /*boolean*/  = __c.False;
RDebugUtils.currentLine=40435714;
 //BA.debugLineNum = 40435714;BA.debugLine="lsvName.Clear";
__ref._lsvname /*anywheresoftware.b4a.objects.ListViewWrapper*/ .Clear();
RDebugUtils.currentLine=40435715;
 //BA.debugLineNum = 40435715;BA.debugLine="lsvName.Visible = False";
__ref._lsvname /*anywheresoftware.b4a.objects.ListViewWrapper*/ .setVisible(__c.False);
RDebugUtils.currentLine=40435716;
 //BA.debugLineNum = 40435716;BA.debugLine="tbxGramm.Text = \"0\"";
__ref._tbxgramm /*anywheresoftware.b4a.objects.EditTextWrapper*/ .setText(BA.ObjectToCharSequence("0"));
RDebugUtils.currentLine=40435717;
 //BA.debugLineNum = 40435717;BA.debugLine="tbxTeilnehmer.Text = \"\"";
__ref._tbxteilnehmer /*anywheresoftware.b4a.objects.EditTextWrapper*/ .setText(BA.ObjectToCharSequence(""));
RDebugUtils.currentLine=40435718;
 //BA.debugLineNum = 40435718;BA.debugLine="dochange = True";
__ref._dochange /*boolean*/  = __c.True;
RDebugUtils.currentLine=40435719;
 //BA.debugLineNum = 40435719;BA.debugLine="End Sub";
return "";
}
public String  _formatdatecustom(b4a.example.screenmain __ref,long _ticks,String _pattern) throws Exception{
__ref = this;
RDebugUtils.currentModule="screenmain";
if (Debug.shouldDelegate(ba, "formatdatecustom", false))
	 {return ((String) Debug.delegate(ba, "formatdatecustom", new Object[] {_ticks,_pattern}));}
String _oldformat = "";
String _res = "";
RDebugUtils.currentLine=43778048;
 //BA.debugLineNum = 43778048;BA.debugLine="Private Sub FormatDateCustom(ticks As Long, patter";
RDebugUtils.currentLine=43778049;
 //BA.debugLineNum = 43778049;BA.debugLine="Dim oldFormat As String = DateTime.DateFormat";
_oldformat = __c.DateTime.getDateFormat();
RDebugUtils.currentLine=43778050;
 //BA.debugLineNum = 43778050;BA.debugLine="DateTime.DateFormat = pattern";
__c.DateTime.setDateFormat(_pattern);
RDebugUtils.currentLine=43778051;
 //BA.debugLineNum = 43778051;BA.debugLine="Dim res As String = DateTime.Date(ticks)";
_res = __c.DateTime.Date(_ticks);
RDebugUtils.currentLine=43778052;
 //BA.debugLineNum = 43778052;BA.debugLine="DateTime.DateFormat = oldFormat";
__c.DateTime.setDateFormat(_oldformat);
RDebugUtils.currentLine=43778053;
 //BA.debugLineNum = 43778053;BA.debugLine="Return res";
if (true) return _res;
RDebugUtils.currentLine=43778054;
 //BA.debugLineNum = 43778054;BA.debugLine="End Sub";
return "";
}
public String  _patchtextweb(b4a.example.screenmain __ref,String _text) throws Exception{
__ref = this;
RDebugUtils.currentModule="screenmain";
if (Debug.shouldDelegate(ba, "patchtextweb", false))
	 {return ((String) Debug.delegate(ba, "patchtextweb", new Object[] {_text}));}
RDebugUtils.currentLine=41943040;
 //BA.debugLineNum = 41943040;BA.debugLine="Private Sub PatchTextWeb(text As String)";
RDebugUtils.currentLine=41943041;
 //BA.debugLineNum = 41943041;BA.debugLine="If True = Status.GetDefault(\"ProgOffline\", True)";
if (__c.True==BA.ObjectToBoolean(__ref._status /*anywheresoftware.b4a.objects.collections.Map*/ .GetDefault((Object)("ProgOffline"),(Object)(__c.True)))) { 
RDebugUtils.currentLine=41943042;
 //BA.debugLineNum = 41943042;BA.debugLine="GotTextOffline";
__ref._gottextoffline /*String*/ (null);
 }else {
RDebugUtils.currentLine=41943044;
 //BA.debugLineNum = 41943044;BA.debugLine="ExecuteHttp(\"PATCH\", CurrentWebUrl, text)";
__ref._executehttp /*void*/ (null,"PATCH",__ref._currentweburl /*String*/ ,_text);
 };
RDebugUtils.currentLine=41943046;
 //BA.debugLineNum = 41943046;BA.debugLine="End Sub";
return "";
}
public String  _disableeingabe(b4a.example.screenmain __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="screenmain";
if (Debug.shouldDelegate(ba, "disableeingabe", false))
	 {return ((String) Debug.delegate(ba, "disableeingabe", null));}
RDebugUtils.currentLine=40370176;
 //BA.debugLineNum = 40370176;BA.debugLine="Private Sub disableEingabe";
RDebugUtils.currentLine=40370177;
 //BA.debugLineNum = 40370177;BA.debugLine="tbxTeilnehmer.Enabled = False";
__ref._tbxteilnehmer /*anywheresoftware.b4a.objects.EditTextWrapper*/ .setEnabled(__c.False);
RDebugUtils.currentLine=40370178;
 //BA.debugLineNum = 40370178;BA.debugLine="btnFDJeingabe.Enabled = False";
__ref._btnfdjeingabe /*anywheresoftware.b4a.objects.ButtonWrapper*/ .setEnabled(__c.False);
RDebugUtils.currentLine=40370179;
 //BA.debugLineNum = 40370179;BA.debugLine="btnFDJeingabe.TextColor = 0xFF888888";
__ref._btnfdjeingabe /*anywheresoftware.b4a.objects.ButtonWrapper*/ .setTextColor(((int)0xff888888));
RDebugUtils.currentLine=40370180;
 //BA.debugLineNum = 40370180;BA.debugLine="btnMinus.Enabled = False";
__ref._btnminus /*anywheresoftware.b4a.objects.ButtonWrapper*/ .setEnabled(__c.False);
RDebugUtils.currentLine=40370181;
 //BA.debugLineNum = 40370181;BA.debugLine="btnMinus.TextColor = 0xFF888888";
__ref._btnminus /*anywheresoftware.b4a.objects.ButtonWrapper*/ .setTextColor(((int)0xff888888));
RDebugUtils.currentLine=40370182;
 //BA.debugLineNum = 40370182;BA.debugLine="btnPlus.Enabled = False";
__ref._btnplus /*anywheresoftware.b4a.objects.ButtonWrapper*/ .setEnabled(__c.False);
RDebugUtils.currentLine=40370183;
 //BA.debugLineNum = 40370183;BA.debugLine="btnPlus.TextColor = 0xFF888888";
__ref._btnplus /*anywheresoftware.b4a.objects.ButtonWrapper*/ .setTextColor(((int)0xff888888));
RDebugUtils.currentLine=40370184;
 //BA.debugLineNum = 40370184;BA.debugLine="tbxGramm.Enabled = False";
__ref._tbxgramm /*anywheresoftware.b4a.objects.EditTextWrapper*/ .setEnabled(__c.False);
RDebugUtils.currentLine=40370185;
 //BA.debugLineNum = 40370185;BA.debugLine="btnSpeichern.Enabled = False";
__ref._btnspeichern /*anywheresoftware.b4a.objects.ButtonWrapper*/ .setEnabled(__c.False);
RDebugUtils.currentLine=40370186;
 //BA.debugLineNum = 40370186;BA.debugLine="btnSpeichern.TextColor = 0xFF888888";
__ref._btnspeichern /*anywheresoftware.b4a.objects.ButtonWrapper*/ .setTextColor(((int)0xff888888));
RDebugUtils.currentLine=40370187;
 //BA.debugLineNum = 40370187;BA.debugLine="tbxFDJgewicht.Enabled = False";
__ref._tbxfdjgewicht /*anywheresoftware.b4a.objects.EditTextWrapper*/ .setEnabled(__c.False);
RDebugUtils.currentLine=40370188;
 //BA.debugLineNum = 40370188;BA.debugLine="btnFDJsave.Enabled = False";
__ref._btnfdjsave /*anywheresoftware.b4a.objects.ButtonWrapper*/ .setEnabled(__c.False);
RDebugUtils.currentLine=40370189;
 //BA.debugLineNum = 40370189;BA.debugLine="btnFDJsave.TextColor = 0xFF888888";
__ref._btnfdjsave /*anywheresoftware.b4a.objects.ButtonWrapper*/ .setTextColor(((int)0xff888888));
RDebugUtils.currentLine=40370190;
 //BA.debugLineNum = 40370190;BA.debugLine="btnCloseVstng.Enabled = False";
__ref._btnclosevstng /*anywheresoftware.b4a.objects.ButtonWrapper*/ .setEnabled(__c.False);
RDebugUtils.currentLine=40370191;
 //BA.debugLineNum = 40370191;BA.debugLine="spnPlatz.Enabled = False";
__ref._spnplatz /*anywheresoftware.b4a.objects.SpinnerWrapper*/ .setEnabled(__c.False);
RDebugUtils.currentLine=40370192;
 //BA.debugLineNum = 40370192;BA.debugLine="End Sub";
return "";
}
public void  _executehttp(b4a.example.screenmain __ref,String _method,String _url,String _payload) throws Exception{
RDebugUtils.currentModule="screenmain";
if (Debug.shouldDelegate(ba, "executehttp", false))
	 {Debug.delegate(ba, "executehttp", new Object[] {_method,_url,_payload}); return;}
ResumableSub_ExecuteHttp rsub = new ResumableSub_ExecuteHttp(this,__ref,_method,_url,_payload);
rsub.resume(ba, null);
}
public static class ResumableSub_ExecuteHttp extends BA.ResumableSub {
public ResumableSub_ExecuteHttp(b4a.example.screenmain parent,b4a.example.screenmain __ref,String _method,String _url,String _payload) {
this.parent = parent;
this.__ref = __ref;
this._method = _method;
this._url = _url;
this._payload = _payload;
this.__ref = parent;
}
b4a.example.screenmain __ref;
b4a.example.screenmain parent;
String _method;
String _url;
String _payload;
String _typ = "";
b4a.example.httpjob _j;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="screenmain";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=42008577;
 //BA.debugLineNum = 42008577;BA.debugLine="Dim typ As String = DBdatenTyp";
_typ = __ref._dbdatentyp /*String*/ ;
RDebugUtils.currentLine=42008578;
 //BA.debugLineNum = 42008578;BA.debugLine="Dim j As HttpJob";
_j = new b4a.example.httpjob();
RDebugUtils.currentLine=42008579;
 //BA.debugLineNum = 42008579;BA.debugLine="j.Initialize(typ, Me)";
_j._initialize /*String*/ (null,ba,_typ,parent);
RDebugUtils.currentLine=42008581;
 //BA.debugLineNum = 42008581;BA.debugLine="Select method";
if (true) break;

case 1:
//select
this.state = 8;
switch (BA.switchObjectToInt(_method,"GET","PUT","PATCH")) {
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
RDebugUtils.currentLine=42008583;
 //BA.debugLineNum = 42008583;BA.debugLine="j.Download(url)";
_j._download /*String*/ (null,_url);
 if (true) break;

case 5:
//C
this.state = 8;
RDebugUtils.currentLine=42008585;
 //BA.debugLineNum = 42008585;BA.debugLine="j.PutString(url, payload)";
_j._putstring /*String*/ (null,_url,_payload);
RDebugUtils.currentLine=42008586;
 //BA.debugLineNum = 42008586;BA.debugLine="j.GetRequest.SetContentType(\"application/json\")";
_j._getrequest /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ (null).SetContentType("application/json");
 if (true) break;

case 7:
//C
this.state = 8;
RDebugUtils.currentLine=42008588;
 //BA.debugLineNum = 42008588;BA.debugLine="j.PatchString(url, payload)";
_j._patchstring /*String*/ (null,_url,_payload);
RDebugUtils.currentLine=42008589;
 //BA.debugLineNum = 42008589;BA.debugLine="j.GetRequest.SetContentType(\"application/json\")";
_j._getrequest /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ (null).SetContentType("application/json");
 if (true) break;

case 8:
//C
this.state = 9;
;
RDebugUtils.currentLine=42008592;
 //BA.debugLineNum = 42008592;BA.debugLine="Wait For (j) JobDone(j As HttpJob)";
parent.__c.WaitFor("jobdone", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "screenmain", "executehttp"), (Object)(_j));
this.state = 15;
return;
case 15:
//C
this.state = 9;
_j = (b4a.example.httpjob) result[1];
;
RDebugUtils.currentLine=42008594;
 //BA.debugLineNum = 42008594;BA.debugLine="If j.Success Then";
if (true) break;

case 9:
//if
this.state = 14;
if (_j._success /*boolean*/ ) { 
this.state = 11;
}else {
this.state = 13;
}if (true) break;

case 11:
//C
this.state = 14;
RDebugUtils.currentLine=42008595;
 //BA.debugLineNum = 42008595;BA.debugLine="HandleGotText(typ, j.GetString)";
__ref._handlegottext /*String*/ (null,_typ,_j._getstring /*String*/ (null));
 if (true) break;

case 13:
//C
this.state = 14;
RDebugUtils.currentLine=42008597;
 //BA.debugLineNum = 42008597;BA.debugLine="setzeOffline";
__ref._setzeoffline /*String*/ (null);
 if (true) break;

case 14:
//C
this.state = -1;
;
RDebugUtils.currentLine=42008599;
 //BA.debugLineNum = 42008599;BA.debugLine="j.Release";
_j._release /*String*/ (null);
RDebugUtils.currentLine=42008600;
 //BA.debugLineNum = 42008600;BA.debugLine="startTimer";
__ref._starttimer /*String*/ (null);
RDebugUtils.currentLine=42008601;
 //BA.debugLineNum = 42008601;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public String  _handlegottext(b4a.example.screenmain __ref,String _typ,String _responsecontent) throws Exception{
__ref = this;
RDebugUtils.currentModule="screenmain";
if (Debug.shouldDelegate(ba, "handlegottext", false))
	 {return ((String) Debug.delegate(ba, "handlegottext", new Object[] {_typ,_responsecontent}));}
anywheresoftware.b4a.objects.collections.JSONParser _jp = null;
RDebugUtils.currentLine=42074112;
 //BA.debugLineNum = 42074112;BA.debugLine="Private Sub HandleGotText(typ As String, responseC";
RDebugUtils.currentLine=42074113;
 //BA.debugLineNum = 42074113;BA.debugLine="DBdatenTyp = \"\"";
__ref._dbdatentyp /*String*/  = "";
RDebugUtils.currentLine=42074114;
 //BA.debugLineNum = 42074114;BA.debugLine="Dim jp As JSONParser";
_jp = new anywheresoftware.b4a.objects.collections.JSONParser();
RDebugUtils.currentLine=42074116;
 //BA.debugLineNum = 42074116;BA.debugLine="Select typ";
switch (BA.switchObjectToInt(_typ,"Wertungsliste","Teilnehmer","saveWertungsliste","addTLN","ErgClosed","saveOnly","VSTNGclosed","LastChange","FDJ")) {
case 0: {
RDebugUtils.currentLine=42074118;
 //BA.debugLineNum = 42074118;BA.debugLine="If responseContent = \"null\" Then";
if ((_responsecontent).equals("null")) { 
RDebugUtils.currentLine=42074119;
 //BA.debugLineNum = 42074119;BA.debugLine="initWertungsliste(True)";
__ref._initwertungsliste /*String*/ (null,__c.True);
RDebugUtils.currentLine=42074120;
 //BA.debugLineNum = 42074120;BA.debugLine="saveWertungsliste(\"saveWertungsliste\")";
__ref._savewertungsliste /*String*/ (null,"saveWertungsliste");
 }else {
RDebugUtils.currentLine=42074122;
 //BA.debugLineNum = 42074122;BA.debugLine="jp.Initialize(responseContent)";
_jp.Initialize(_responsecontent);
RDebugUtils.currentLine=42074123;
 //BA.debugLineNum = 42074123;BA.debugLine="ladeWertungsliste(jp.NextObject)";
__ref._ladewertungsliste /*String*/ (null,_jp.NextObject());
 };
 break; }
case 1: {
RDebugUtils.currentLine=42074126;
 //BA.debugLineNum = 42074126;BA.debugLine="ladeTeilnehmer(responseContent)";
__ref._ladeteilnehmer /*String*/ (null,_responsecontent);
RDebugUtils.currentLine=42074127;
 //BA.debugLineNum = 42074127;BA.debugLine="holeFDJ";
__ref._holefdj /*String*/ (null);
 break; }
case 2: {
RDebugUtils.currentLine=42074129;
 //BA.debugLineNum = 42074129;BA.debugLine="addTLN = False";
__ref._addtln /*boolean*/  = __c.False;
RDebugUtils.currentLine=42074130;
 //BA.debugLineNum = 42074130;BA.debugLine="addTeilnehmer";
__ref._addteilnehmer /*String*/ (null);
RDebugUtils.currentLine=42074131;
 //BA.debugLineNum = 42074131;BA.debugLine="If Not(addTLN) Then holeWertungsliste";
if (__c.Not(__ref._addtln /*boolean*/ )) { 
__ref._holewertungsliste /*String*/ (null);};
 break; }
case 3: {
RDebugUtils.currentLine=42074133;
 //BA.debugLineNum = 42074133;BA.debugLine="holeWertungsliste";
__ref._holewertungsliste /*String*/ (null);
 break; }
case 4: {
RDebugUtils.currentLine=42074135;
 //BA.debugLineNum = 42074135;BA.debugLine="vaEingabe.Visible = False";
__ref._vaeingabe /*anywheresoftware.b4a.objects.PanelWrapper*/ .setVisible(__c.False);
RDebugUtils.currentLine=42074136;
 //BA.debugLineNum = 42074136;BA.debugLine="haDown.Visible = True";
__ref._hadown /*anywheresoftware.b4a.objects.PanelWrapper*/ .setVisible(__c.True);
RDebugUtils.currentLine=42074137;
 //BA.debugLineNum = 42074137;BA.debugLine="btnDown.Visible = False";
__ref._btndown /*anywheresoftware.b4a.objects.ButtonWrapper*/ .setVisible(__c.False);
RDebugUtils.currentLine=42074138;
 //BA.debugLineNum = 42074138;BA.debugLine="UpdateLayoutPositions";
__ref._updatelayoutpositions /*String*/ (null);
RDebugUtils.currentLine=42074139;
 //BA.debugLineNum = 42074139;BA.debugLine="closeVstng(\"Verranstaltung\")";
__ref._closevstng /*String*/ (null,"Verranstaltung");
 break; }
case 5: {
 break; }
case 6: {
 break; }
case 7: {
 break; }
case 8: {
RDebugUtils.currentLine=42074147;
 //BA.debugLineNum = 42074147;BA.debugLine="ladeFDJ(responseContent)";
__ref._ladefdj /*String*/ (null,_responsecontent);
RDebugUtils.currentLine=42074148;
 //BA.debugLineNum = 42074148;BA.debugLine="holeWertungsliste";
__ref._holewertungsliste /*String*/ (null);
 break; }
}
;
RDebugUtils.currentLine=42074150;
 //BA.debugLineNum = 42074150;BA.debugLine="End Sub";
return "";
}
public String  _setzeoffline(b4a.example.screenmain __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="screenmain";
if (Debug.shouldDelegate(ba, "setzeoffline", false))
	 {return ((String) Debug.delegate(ba, "setzeoffline", null));}
RDebugUtils.currentLine=42205184;
 //BA.debugLineNum = 42205184;BA.debugLine="Private Sub setzeOffline";
RDebugUtils.currentLine=42205185;
 //BA.debugLineNum = 42205185;BA.debugLine="Status.Put(\"ProgOffline\", True)";
__ref._status /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("ProgOffline"),(Object)(__c.True));
RDebugUtils.currentLine=42205186;
 //BA.debugLineNum = 42205186;BA.debugLine="MsgboxAsync(\"Die Datenbank ist nicht mehr erreich";
__c.MsgboxAsync(BA.ObjectToCharSequence("Die Datenbank ist nicht mehr erreichbar. Kein Problem! Das Programm arbeitet offline und synchronisiert sich später mit der Datenbank. Es ist jedoch nur die zuletzt verwendete Wertungsliste verfügbar!"),BA.ObjectToCharSequence("Internet-Verbindung nicht möglich!"),ba);
RDebugUtils.currentLine=42205187;
 //BA.debugLineNum = 42205187;BA.debugLine="btnCloseVstng.Enabled = False";
__ref._btnclosevstng /*anywheresoftware.b4a.objects.ButtonWrapper*/ .setEnabled(__c.False);
RDebugUtils.currentLine=42205188;
 //BA.debugLineNum = 42205188;BA.debugLine="SetButtonImageSafe(btnCloseVstng, \"disconnected.p";
__ref._setbuttonimagesafe /*String*/ (null,__ref._btnclosevstng /*anywheresoftware.b4a.objects.ButtonWrapper*/ ,"disconnected.png","⚠");
RDebugUtils.currentLine=42205189;
 //BA.debugLineNum = 42205189;BA.debugLine="btnSettings.Visible = False";
__ref._btnsettings /*anywheresoftware.b4a.objects.ButtonWrapper*/ .setVisible(__c.False);
RDebugUtils.currentLine=42205190;
 //BA.debugLineNum = 42205190;BA.debugLine="End Sub";
return "";
}
public String  _getweb(b4a.example.screenmain __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="screenmain";
if (Debug.shouldDelegate(ba, "getweb", false))
	 {return ((String) Debug.delegate(ba, "getweb", null));}
RDebugUtils.currentLine=41811968;
 //BA.debugLineNum = 41811968;BA.debugLine="Private Sub GetWeb";
RDebugUtils.currentLine=41811969;
 //BA.debugLineNum = 41811969;BA.debugLine="If True = Status.GetDefault(\"ProgOffline\", True)";
if (__c.True==BA.ObjectToBoolean(__ref._status /*anywheresoftware.b4a.objects.collections.Map*/ .GetDefault((Object)("ProgOffline"),(Object)(__c.True)))) { 
RDebugUtils.currentLine=41811970;
 //BA.debugLineNum = 41811970;BA.debugLine="btnCloseVstng.Enabled = False";
__ref._btnclosevstng /*anywheresoftware.b4a.objects.ButtonWrapper*/ .setEnabled(__c.False);
RDebugUtils.currentLine=41811971;
 //BA.debugLineNum = 41811971;BA.debugLine="SetButtonImageSafe(btnCloseVstng, \"disconnected.";
__ref._setbuttonimagesafe /*String*/ (null,__ref._btnclosevstng /*anywheresoftware.b4a.objects.ButtonWrapper*/ ,"disconnected.png","⚠");
RDebugUtils.currentLine=41811972;
 //BA.debugLineNum = 41811972;BA.debugLine="btnSettings.Visible = False";
__ref._btnsettings /*anywheresoftware.b4a.objects.ButtonWrapper*/ .setVisible(__c.False);
RDebugUtils.currentLine=41811973;
 //BA.debugLineNum = 41811973;BA.debugLine="GotTextOffline";
__ref._gottextoffline /*String*/ (null);
 }else {
RDebugUtils.currentLine=41811975;
 //BA.debugLineNum = 41811975;BA.debugLine="ExecuteHttp(\"GET\", CurrentWebUrl, \"\")";
__ref._executehttp /*void*/ (null,"GET",__ref._currentweburl /*String*/ ,"");
 };
RDebugUtils.currentLine=41811977;
 //BA.debugLineNum = 41811977;BA.debugLine="End Sub";
return "";
}
public String  _gottextoffline(b4a.example.screenmain __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="screenmain";
if (Debug.shouldDelegate(ba, "gottextoffline", false))
	 {return ((String) Debug.delegate(ba, "gottextoffline", null));}
String _typ = "";
anywheresoftware.b4a.objects.collections.List _dbwv = null;
RDebugUtils.currentLine=42139648;
 //BA.debugLineNum = 42139648;BA.debugLine="Private Sub GotTextOffline";
RDebugUtils.currentLine=42139649;
 //BA.debugLineNum = 42139649;BA.debugLine="Dim typ As String = DBdatenTyp";
_typ = __ref._dbdatentyp /*String*/ ;
RDebugUtils.currentLine=42139650;
 //BA.debugLineNum = 42139650;BA.debugLine="DBdatenTyp = \"\"";
__ref._dbdatentyp /*String*/  = "";
RDebugUtils.currentLine=42139652;
 //BA.debugLineNum = 42139652;BA.debugLine="Select typ";
switch (BA.switchObjectToInt(_typ,"Teilnehmer","Wertungsliste","saveOnly","LastChange","fdj","saveWertungsliste","addTLN")) {
case 0: {
RDebugUtils.currentLine=42139654;
 //BA.debugLineNum = 42139654;BA.debugLine="Teilnehmer = DBGet(\"Teilnehmer\", Teilnehmer)";
__ref._teilnehmer /*anywheresoftware.b4a.objects.collections.List*/  = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(__ref._dbget /*Object*/ (null,"Teilnehmer",(Object)(__ref._teilnehmer /*anywheresoftware.b4a.objects.collections.List*/ .getObject()))));
RDebugUtils.currentLine=42139655;
 //BA.debugLineNum = 42139655;BA.debugLine="holeWertungsliste";
__ref._holewertungsliste /*String*/ (null);
 break; }
case 1: {
RDebugUtils.currentLine=42139657;
 //BA.debugLineNum = 42139657;BA.debugLine="Dim dbWv As List = DBGet(\"webviewData\", Null)";
_dbwv = new anywheresoftware.b4a.objects.collections.List();
_dbwv = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(__ref._dbget /*Object*/ (null,"webviewData",__c.Null)));
RDebugUtils.currentLine=42139658;
 //BA.debugLineNum = 42139658;BA.debugLine="If dbWv = Null Or Not(dbWv.IsInitialized) Or db";
if (_dbwv== null || __c.Not(_dbwv.IsInitialized()) || _dbwv.getSize()==0) { 
RDebugUtils.currentLine=42139659;
 //BA.debugLineNum = 42139659;BA.debugLine="initWertungsliste(True)";
__ref._initwertungsliste /*String*/ (null,__c.True);
RDebugUtils.currentLine=42139660;
 //BA.debugLineNum = 42139660;BA.debugLine="saveWertungsliste(\"saveOnly\")";
__ref._savewertungsliste /*String*/ (null,"saveOnly");
 }else {
RDebugUtils.currentLine=42139662;
 //BA.debugLineNum = 42139662;BA.debugLine="webviewData = dbWv";
__ref._webviewdata /*anywheresoftware.b4a.objects.collections.List*/  = _dbwv;
 };
RDebugUtils.currentLine=42139664;
 //BA.debugLineNum = 42139664;BA.debugLine="zeigeWertungsliste";
__ref._zeigewertungsliste /*String*/ (null);
 break; }
case 2: 
case 3: 
case 4: {
 break; }
case 5: {
RDebugUtils.currentLine=42139668;
 //BA.debugLineNum = 42139668;BA.debugLine="addTLN = False";
__ref._addtln /*boolean*/  = __c.False;
RDebugUtils.currentLine=42139669;
 //BA.debugLineNum = 42139669;BA.debugLine="addTeilnehmer";
__ref._addteilnehmer /*String*/ (null);
RDebugUtils.currentLine=42139670;
 //BA.debugLineNum = 42139670;BA.debugLine="If Not(addTLN) Then zeigeWertungsliste";
if (__c.Not(__ref._addtln /*boolean*/ )) { 
__ref._zeigewertungsliste /*String*/ (null);};
 break; }
case 6: {
RDebugUtils.currentLine=42139672;
 //BA.debugLineNum = 42139672;BA.debugLine="zeigeWertungsliste";
__ref._zeigewertungsliste /*String*/ (null);
 break; }
}
;
RDebugUtils.currentLine=42139674;
 //BA.debugLineNum = 42139674;BA.debugLine="End Sub";
return "";
}
public String  _getwebviewstring(b4a.example.screenmain __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="screenmain";
if (Debug.shouldDelegate(ba, "getwebviewstring", false))
	 {return ((String) Debug.delegate(ba, "getwebviewstring", null));}
RDebugUtils.currentLine=40108032;
 //BA.debugLineNum = 40108032;BA.debugLine="Public Sub getWebViewString As String";
RDebugUtils.currentLine=40108033;
 //BA.debugLineNum = 40108033;BA.debugLine="Return CurrentWebViewString";
if (true) return __ref._currentwebviewstring /*String*/ ;
RDebugUtils.currentLine=40108034;
 //BA.debugLineNum = 40108034;BA.debugLine="End Sub";
return "";
}
public String  _holewertungsliste(b4a.example.screenmain __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="screenmain";
if (Debug.shouldDelegate(ba, "holewertungsliste", false))
	 {return ((String) Debug.delegate(ba, "holewertungsliste", null));}
String _verdatum = "";
String[] _key = null;
RDebugUtils.currentLine=41091072;
 //BA.debugLineNum = 41091072;BA.debugLine="Private Sub holeWertungsliste";
RDebugUtils.currentLine=41091073;
 //BA.debugLineNum = 41091073;BA.debugLine="DBdatenTyp = \"Wertungsliste\"";
__ref._dbdatentyp /*String*/  = "Wertungsliste";
RDebugUtils.currentLine=41091074;
 //BA.debugLineNum = 41091074;BA.debugLine="If PlatzSelected <> SelectNewRow And SelectNewRow";
if (__ref._platzselected /*int*/ !=__ref._selectnewrow /*int*/  && __ref._selectnewrow /*int*/ >0) { 
RDebugUtils.currentLine=41091075;
 //BA.debugLineNum = 41091075;BA.debugLine="PlatzSelected = SelectNewRow";
__ref._platzselected /*int*/  = __ref._selectnewrow /*int*/ ;
 };
RDebugUtils.currentLine=41091078;
 //BA.debugLineNum = 41091078;BA.debugLine="Dim verDatum As String = DBGet(\"VeranstaltungDatu";
_verdatum = BA.ObjectToString(__ref._dbget /*Object*/ (null,"VeranstaltungDatum",(Object)(__ref._formatdatecustom /*String*/ (null,__c.DateTime.getNow(),"dd.MM.yyyy"))));
RDebugUtils.currentLine=41091079;
 //BA.debugLineNum = 41091079;BA.debugLine="Dim key() As String = Regex.Split(\"\\.\", verDatum)";
_key = __c.Regex.Split("\\.",_verdatum);
RDebugUtils.currentLine=41091080;
 //BA.debugLineNum = 41091080;BA.debugLine="CurrentWebUrl = URLErgebnisse & \"e\" & key(2) & ke";
__ref._currentweburl /*String*/  = __ref._urlergebnisse /*String*/ +"e"+_key[(int) (2)]+_key[(int) (1)]+_key[(int) (0)]+".json?auth="+BA.ObjectToString(__ref._status /*anywheresoftware.b4a.objects.collections.Map*/ .GetDefault((Object)("idToken"),(Object)("")));
RDebugUtils.currentLine=41091081;
 //BA.debugLineNum = 41091081;BA.debugLine="GetWeb";
__ref._getweb /*String*/ (null);
RDebugUtils.currentLine=41091082;
 //BA.debugLineNum = 41091082;BA.debugLine="End Sub";
return "";
}
public String  _initwertungsliste(b4a.example.screenmain __ref,boolean _neueliste) throws Exception{
__ref = this;
RDebugUtils.currentModule="screenmain";
if (Debug.shouldDelegate(ba, "initwertungsliste", false))
	 {return ((String) Debug.delegate(ba, "initwertungsliste", new Object[] {_neueliste}));}
int _plaetzesoll = 0;
int _plaetzeist = 0;
int _startidx = 0;
int _i = 0;
int _diff = 0;
int _removestart = 0;
RDebugUtils.currentLine=41025536;
 //BA.debugLineNum = 41025536;BA.debugLine="Private Sub initWertungsliste(neueListe As Boolean";
RDebugUtils.currentLine=41025537;
 //BA.debugLineNum = 41025537;BA.debugLine="Dim plaetzeSoll As Int = DBGet(\"VeranstaltungAnza";
_plaetzesoll = (int)(BA.ObjectToNumber(__ref._dbget /*Object*/ (null,"VeranstaltungAnzahl",(Object)("25"))));
RDebugUtils.currentLine=41025538;
 //BA.debugLineNum = 41025538;BA.debugLine="Dim plaetzeIst As Int = Floor(webviewData.Size /";
_plaetzeist = (int) (__c.Floor(__ref._webviewdata /*anywheresoftware.b4a.objects.collections.List*/ .getSize()/(double)4)-1);
RDebugUtils.currentLine=41025540;
 //BA.debugLineNum = 41025540;BA.debugLine="If neueListe Then";
if (_neueliste) { 
RDebugUtils.currentLine=41025541;
 //BA.debugLineNum = 41025541;BA.debugLine="webviewData.Initialize";
__ref._webviewdata /*anywheresoftware.b4a.objects.collections.List*/ .Initialize();
RDebugUtils.currentLine=41025542;
 //BA.debugLineNum = 41025542;BA.debugLine="plaetzeIst = 0";
_plaetzeist = (int) (0);
RDebugUtils.currentLine=41025543;
 //BA.debugLineNum = 41025543;BA.debugLine="webviewData.AddAll(Array As Object(\"Platz\", \"Tei";
__ref._webviewdata /*anywheresoftware.b4a.objects.collections.List*/ .AddAll(anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)("Platz"),(Object)("Teilnehmer"),(Object)("Gewicht"),(Object)("Rang")}));
 }else {
RDebugUtils.currentLine=41025545;
 //BA.debugLineNum = 41025545;BA.debugLine="plaetzeSoll = plaetzeSoll - plaetzeIst";
_plaetzesoll = (int) (_plaetzesoll-_plaetzeist);
 };
RDebugUtils.currentLine=41025548;
 //BA.debugLineNum = 41025548;BA.debugLine="If plaetzeSoll > 0 Then";
if (_plaetzesoll>0) { 
RDebugUtils.currentLine=41025549;
 //BA.debugLineNum = 41025549;BA.debugLine="Dim startIdx As Int = plaetzeIst + 1";
_startidx = (int) (_plaetzeist+1);
RDebugUtils.currentLine=41025550;
 //BA.debugLineNum = 41025550;BA.debugLine="For i = startIdx To plaetzeIst + plaetzeSoll";
{
final int step12 = 1;
final int limit12 = (int) (_plaetzeist+_plaetzesoll);
_i = _startidx ;
for (;_i <= limit12 ;_i = _i + step12 ) {
RDebugUtils.currentLine=41025551;
 //BA.debugLineNum = 41025551;BA.debugLine="webviewData.AddAll(Array As Object(i, \"\", 0, 0)";
__ref._webviewdata /*anywheresoftware.b4a.objects.collections.List*/ .AddAll(anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(_i),(Object)(""),(Object)(0),(Object)(0)}));
 }
};
 }else 
{RDebugUtils.currentLine=41025553;
 //BA.debugLineNum = 41025553;BA.debugLine="Else if plaetzeSoll < 0 Then";
if (_plaetzesoll<0) { 
RDebugUtils.currentLine=41025554;
 //BA.debugLineNum = 41025554;BA.debugLine="Dim diff As Int = Abs(plaetzeSoll)";
_diff = (int) (__c.Abs(_plaetzesoll));
RDebugUtils.currentLine=41025555;
 //BA.debugLineNum = 41025555;BA.debugLine="Dim removeStart As Int = (plaetzeIst - diff) * 4";
_removestart = (int) ((_plaetzeist-_diff)*4+4);
RDebugUtils.currentLine=41025556;
 //BA.debugLineNum = 41025556;BA.debugLine="For i = 1 To diff * 4";
{
final int step18 = 1;
final int limit18 = (int) (_diff*4);
_i = (int) (1) ;
for (;_i <= limit18 ;_i = _i + step18 ) {
RDebugUtils.currentLine=41025557;
 //BA.debugLineNum = 41025557;BA.debugLine="If webviewData.Size > removeStart Then webviewD";
if (__ref._webviewdata /*anywheresoftware.b4a.objects.collections.List*/ .getSize()>_removestart) { 
__ref._webviewdata /*anywheresoftware.b4a.objects.collections.List*/ .RemoveAt(_removestart);};
 }
};
 }}
;
RDebugUtils.currentLine=41025561;
 //BA.debugLineNum = 41025561;BA.debugLine="If Not(neueListe) And plaetzeSoll <> 0 Then";
if (__c.Not(_neueliste) && _plaetzesoll!=0) { 
RDebugUtils.currentLine=41025562;
 //BA.debugLineNum = 41025562;BA.debugLine="saveWertungsliste(\"saveOnly\")";
__ref._savewertungsliste /*String*/ (null,"saveOnly");
 };
RDebugUtils.currentLine=41025564;
 //BA.debugLineNum = 41025564;BA.debugLine="End Sub";
return "";
}
public String  _savewertungsliste(b4a.example.screenmain __ref,String _savetyp) throws Exception{
__ref = this;
RDebugUtils.currentModule="screenmain";
if (Debug.shouldDelegate(ba, "savewertungsliste", false))
	 {return ((String) Debug.delegate(ba, "savewertungsliste", new Object[] {_savetyp}));}
String _verdatum = "";
String[] _key = null;
anywheresoftware.b4a.objects.collections.Map _body = null;
int _i = 0;
int _platzval = 0;
String _padded = "";
String _id = "";
anywheresoftware.b4a.objects.collections.Map _eintrag = null;
anywheresoftware.b4a.objects.collections.JSONParser.JSONGenerator _jg = null;
RDebugUtils.currentLine=41353216;
 //BA.debugLineNum = 41353216;BA.debugLine="Private Sub saveWertungsliste(saveTyp As String)";
RDebugUtils.currentLine=41353217;
 //BA.debugLineNum = 41353217;BA.debugLine="DBdatenTyp = saveTyp";
__ref._dbdatentyp /*String*/  = _savetyp;
RDebugUtils.currentLine=41353218;
 //BA.debugLineNum = 41353218;BA.debugLine="Dim verDatum As String = DBGet(\"VeranstaltungDatu";
_verdatum = BA.ObjectToString(__ref._dbget /*Object*/ (null,"VeranstaltungDatum",(Object)(__ref._formatdatecustom /*String*/ (null,__c.DateTime.getNow(),"dd.MM.yyyy"))));
RDebugUtils.currentLine=41353219;
 //BA.debugLineNum = 41353219;BA.debugLine="Dim key() As String = Regex.Split(\"\\.\", verDatum)";
_key = __c.Regex.Split("\\.",_verdatum);
RDebugUtils.currentLine=41353220;
 //BA.debugLineNum = 41353220;BA.debugLine="CurrentWebUrl = URLErgebnisse & \"e\" & key(2) & ke";
__ref._currentweburl /*String*/  = __ref._urlergebnisse /*String*/ +"e"+_key[(int) (2)]+_key[(int) (1)]+_key[(int) (0)]+".json?auth="+BA.ObjectToString(__ref._status /*anywheresoftware.b4a.objects.collections.Map*/ .GetDefault((Object)("idToken"),(Object)("")));
RDebugUtils.currentLine=41353222;
 //BA.debugLineNum = 41353222;BA.debugLine="Dim body As Map";
_body = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=41353223;
 //BA.debugLineNum = 41353223;BA.debugLine="body.Initialize";
_body.Initialize();
RDebugUtils.currentLine=41353224;
 //BA.debugLineNum = 41353224;BA.debugLine="body.Put(\"Datum\", lblDatum.Text)";
_body.Put((Object)("Datum"),(Object)(__ref._lbldatum /*anywheresoftware.b4a.objects.LabelWrapper*/ .getText()));
RDebugUtils.currentLine=41353225;
 //BA.debugLineNum = 41353225;BA.debugLine="body.Put(\"Name\", lblVeranstaltung.Text)";
_body.Put((Object)("Name"),(Object)(__ref._lblveranstaltung /*anywheresoftware.b4a.objects.LabelWrapper*/ .getText()));
RDebugUtils.currentLine=41353226;
 //BA.debugLineNum = 41353226;BA.debugLine="body.Put(\"Status\", \"offen\")";
_body.Put((Object)("Status"),(Object)("offen"));
RDebugUtils.currentLine=41353228;
 //BA.debugLineNum = 41353228;BA.debugLine="For i = 4 To webviewData.Size - 1 Step 4";
{
final int step10 = 4;
final int limit10 = (int) (__ref._webviewdata /*anywheresoftware.b4a.objects.collections.List*/ .getSize()-1);
_i = (int) (4) ;
for (;_i <= limit10 ;_i = _i + step10 ) {
RDebugUtils.currentLine=41353229;
 //BA.debugLineNum = 41353229;BA.debugLine="Dim platzVal As Int = webviewData.Get(i)";
_platzval = (int)(BA.ObjectToNumber(__ref._webviewdata /*anywheresoftware.b4a.objects.collections.List*/ .Get(_i)));
RDebugUtils.currentLine=41353230;
 //BA.debugLineNum = 41353230;BA.debugLine="Dim padded As String = \"0000\" & platzVal";
_padded = "0000"+BA.NumberToString(_platzval);
RDebugUtils.currentLine=41353231;
 //BA.debugLineNum = 41353231;BA.debugLine="Dim id As String = \"p\" & padded.SubString(padded";
_id = "p"+_padded.substring((int) (_padded.length()-4));
RDebugUtils.currentLine=41353233;
 //BA.debugLineNum = 41353233;BA.debugLine="Dim eintrag As Map = CreateMap( _ 			\"Platz\": pl";
_eintrag = new anywheresoftware.b4a.objects.collections.Map();
_eintrag = __c.createMap(new Object[] {(Object)("Platz"),(Object)(_platzval),(Object)("Teilnehmer"),__ref._webviewdata /*anywheresoftware.b4a.objects.collections.List*/ .Get((int) (_i+1)),(Object)("Gewicht"),__ref._webviewdata /*anywheresoftware.b4a.objects.collections.List*/ .Get((int) (_i+2)),(Object)("Rang"),__ref._webviewdata /*anywheresoftware.b4a.objects.collections.List*/ .Get((int) (_i+3))});
RDebugUtils.currentLine=41353238;
 //BA.debugLineNum = 41353238;BA.debugLine="body.Put(id, eintrag)";
_body.Put((Object)(_id),(Object)(_eintrag.getObject()));
 }
};
RDebugUtils.currentLine=41353241;
 //BA.debugLineNum = 41353241;BA.debugLine="DBPut(\"letzteÄnderung\", CreateMap(\"Änderung\": Tru";
__ref._dbput /*String*/ (null,"letzteÄnderung",(Object)(__c.createMap(new Object[] {(Object)("Änderung"),(Object)(__c.True),(Object)("Datum"),(Object)(__ref._zeitstempel /*String*/ (null))}).getObject()));
RDebugUtils.currentLine=41353242;
 //BA.debugLineNum = 41353242;BA.debugLine="DBPut(\"webviewData\", webviewData)";
__ref._dbput /*String*/ (null,"webviewData",(Object)(__ref._webviewdata /*anywheresoftware.b4a.objects.collections.List*/ .getObject()));
RDebugUtils.currentLine=41353244;
 //BA.debugLineNum = 41353244;BA.debugLine="Dim jg As JSONGenerator";
_jg = new anywheresoftware.b4a.objects.collections.JSONParser.JSONGenerator();
RDebugUtils.currentLine=41353245;
 //BA.debugLineNum = 41353245;BA.debugLine="jg.Initialize(body)";
_jg.Initialize(_body);
RDebugUtils.currentLine=41353246;
 //BA.debugLineNum = 41353246;BA.debugLine="PutTextWeb(jg.ToString)";
__ref._puttextweb /*String*/ (null,_jg.ToString());
RDebugUtils.currentLine=41353247;
 //BA.debugLineNum = 41353247;BA.debugLine="End Sub";
return "";
}
public String  _zeigewertungsliste(b4a.example.screenmain __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="screenmain";
if (Debug.shouldDelegate(ba, "zeigewertungsliste", false))
	 {return ((String) Debug.delegate(ba, "zeigewertungsliste", null));}
anywheresoftware.b4a.keywords.StringBuilderWrapper _sb = null;
int _i = 0;
String _html = "";
RDebugUtils.currentLine=40697856;
 //BA.debugLineNum = 40697856;BA.debugLine="Private Sub zeigeWertungsliste";
RDebugUtils.currentLine=40697858;
 //BA.debugLineNum = 40697858;BA.debugLine="Dim sb As StringBuilder";
_sb = new anywheresoftware.b4a.keywords.StringBuilderWrapper();
RDebugUtils.currentLine=40697859;
 //BA.debugLineNum = 40697859;BA.debugLine="sb.Initialize";
_sb.Initialize();
RDebugUtils.currentLine=40697860;
 //BA.debugLineNum = 40697860;BA.debugLine="For i = 0 To webviewData.Size - 1";
{
final int step3 = 1;
final int limit3 = (int) (__ref._webviewdata /*anywheresoftware.b4a.objects.collections.List*/ .getSize()-1);
_i = (int) (0) ;
for (;_i <= limit3 ;_i = _i + step3 ) {
RDebugUtils.currentLine=40697861;
 //BA.debugLineNum = 40697861;BA.debugLine="If i > 0 Then sb.Append(\",\")";
if (_i>0) { 
_sb.Append(",");};
RDebugUtils.currentLine=40697862;
 //BA.debugLineNum = 40697862;BA.debugLine="sb.Append(webviewData.Get(i))";
_sb.Append(BA.ObjectToString(__ref._webviewdata /*anywheresoftware.b4a.objects.collections.List*/ .Get(_i)));
 }
};
RDebugUtils.currentLine=40697864;
 //BA.debugLineNum = 40697864;BA.debugLine="CurrentWebViewString = sb.ToString";
__ref._currentwebviewstring /*String*/  = _sb.ToString();
RDebugUtils.currentLine=40697866;
 //BA.debugLineNum = 40697866;BA.debugLine="If File.Exists(File.DirAssets, \"wlfb_tabelle.html";
if (__c.File.Exists(__c.File.getDirAssets(),"wlfb_tabelle.html")) { 
RDebugUtils.currentLine=40697867;
 //BA.debugLineNum = 40697867;BA.debugLine="Dim html As String = File.ReadString(File.DirAss";
_html = __c.File.ReadString(__c.File.getDirAssets(),"wlfb_tabelle.html");
RDebugUtils.currentLine=40697868;
 //BA.debugLineNum = 40697868;BA.debugLine="webErgebnis.LoadHtml(html)";
__ref._webergebnis /*anywheresoftware.b4a.objects.WebViewWrapper*/ .LoadHtml(_html);
 }else {
RDebugUtils.currentLine=40697870;
 //BA.debugLineNum = 40697870;BA.debugLine="ToastMessageShow(\"Datei wlfb_tabelle.html fehlt";
__c.ToastMessageShow(BA.ObjectToCharSequence("Datei wlfb_tabelle.html fehlt im Dateien-Tab!"),__c.True);
 };
RDebugUtils.currentLine=40697872;
 //BA.debugLineNum = 40697872;BA.debugLine="End Sub";
return "";
}
public String  _ladewertungsliste(b4a.example.screenmain __ref,anywheresoftware.b4a.objects.collections.Map _dictionary) throws Exception{
__ref = this;
RDebugUtils.currentModule="screenmain";
if (Debug.shouldDelegate(ba, "ladewertungsliste", false))
	 {return ((String) Debug.delegate(ba, "ladewertungsliste", new Object[] {_dictionary}));}
String _key = "";
Object _val = null;
anywheresoftware.b4a.objects.collections.Map _ergebnis = null;
int _maxanzahl = 0;
RDebugUtils.currentLine=41615360;
 //BA.debugLineNum = 41615360;BA.debugLine="Private Sub ladeWertungsliste(dictionary As Map)";
RDebugUtils.currentLine=41615361;
 //BA.debugLineNum = 41615361;BA.debugLine="webviewData.Initialize";
__ref._webviewdata /*anywheresoftware.b4a.objects.collections.List*/ .Initialize();
RDebugUtils.currentLine=41615362;
 //BA.debugLineNum = 41615362;BA.debugLine="webviewData.AddAll(Array As Object(\"Platz\", \"Teil";
__ref._webviewdata /*anywheresoftware.b4a.objects.collections.List*/ .AddAll(anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)("Platz"),(Object)("Teilnehmer"),(Object)("Gewicht"),(Object)("Rang")}));
RDebugUtils.currentLine=41615363;
 //BA.debugLineNum = 41615363;BA.debugLine="VSTNGgeschlossen = False";
__ref._vstnggeschlossen /*boolean*/  = __c.False;
RDebugUtils.currentLine=41615365;
 //BA.debugLineNum = 41615365;BA.debugLine="For Each key As String In dictionary.Keys";
{
final anywheresoftware.b4a.BA.IterableList group4 = _dictionary.Keys();
final int groupLen4 = group4.getSize()
;int index4 = 0;
;
for (; index4 < groupLen4;index4++){
_key = BA.ObjectToString(group4.Get(index4));
RDebugUtils.currentLine=41615366;
 //BA.debugLineNum = 41615366;BA.debugLine="Dim val As Object = dictionary.Get(key)";
_val = _dictionary.Get((Object)(_key));
RDebugUtils.currentLine=41615367;
 //BA.debugLineNum = 41615367;BA.debugLine="If key = \"Status\" Then";
if ((_key).equals("Status")) { 
RDebugUtils.currentLine=41615368;
 //BA.debugLineNum = 41615368;BA.debugLine="If \"geschlossen\" = val Then VSTNGgeschlossen =";
if (("geschlossen").equals(BA.ObjectToString(_val))) { 
__ref._vstnggeschlossen /*boolean*/  = __c.True;};
 };
RDebugUtils.currentLine=41615370;
 //BA.debugLineNum = 41615370;BA.debugLine="If key.StartsWith(\"p\") Then";
if (_key.startsWith("p")) { 
RDebugUtils.currentLine=41615371;
 //BA.debugLineNum = 41615371;BA.debugLine="Dim ergebnis As Map = val";
_ergebnis = new anywheresoftware.b4a.objects.collections.Map();
_ergebnis = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_val));
RDebugUtils.currentLine=41615372;
 //BA.debugLineNum = 41615372;BA.debugLine="Dim maxAnzahl As Int = DBGet(\"VeranstaltungAnza";
_maxanzahl = (int)(BA.ObjectToNumber(__ref._dbget /*Object*/ (null,"VeranstaltungAnzahl",(Object)("25"))));
RDebugUtils.currentLine=41615373;
 //BA.debugLineNum = 41615373;BA.debugLine="webviewData.Add(ergebnis.GetDefault(\"Platz\", 0)";
__ref._webviewdata /*anywheresoftware.b4a.objects.collections.List*/ .Add(_ergebnis.GetDefault((Object)("Platz"),(Object)(0)));
RDebugUtils.currentLine=41615374;
 //BA.debugLineNum = 41615374;BA.debugLine="webviewData.Add(ergebnis.GetDefault(\"Teilnehmer";
__ref._webviewdata /*anywheresoftware.b4a.objects.collections.List*/ .Add(_ergebnis.GetDefault((Object)("Teilnehmer"),(Object)("")));
RDebugUtils.currentLine=41615375;
 //BA.debugLineNum = 41615375;BA.debugLine="webviewData.Add(ergebnis.GetDefault(\"Gewicht\",";
__ref._webviewdata /*anywheresoftware.b4a.objects.collections.List*/ .Add(_ergebnis.GetDefault((Object)("Gewicht"),(Object)(0)));
RDebugUtils.currentLine=41615376;
 //BA.debugLineNum = 41615376;BA.debugLine="webviewData.Add(ergebnis.GetDefault(\"Rang\", max";
__ref._webviewdata /*anywheresoftware.b4a.objects.collections.List*/ .Add(_ergebnis.GetDefault((Object)("Rang"),(Object)(_maxanzahl)));
 };
 }
};
RDebugUtils.currentLine=41615380;
 //BA.debugLineNum = 41615380;BA.debugLine="initWertungsliste(False)";
__ref._initwertungsliste /*String*/ (null,__c.False);
RDebugUtils.currentLine=41615381;
 //BA.debugLineNum = 41615381;BA.debugLine="DBPut(\"webviewData\", webviewData)";
__ref._dbput /*String*/ (null,"webviewData",(Object)(__ref._webviewdata /*anywheresoftware.b4a.objects.collections.List*/ .getObject()));
RDebugUtils.currentLine=41615382;
 //BA.debugLineNum = 41615382;BA.debugLine="zeigeWertungsliste";
__ref._zeigewertungsliste /*String*/ (null);
RDebugUtils.currentLine=41615383;
 //BA.debugLineNum = 41615383;BA.debugLine="End Sub";
return "";
}
public String  _ladeteilnehmer(b4a.example.screenmain __ref,String _response) throws Exception{
__ref = this;
RDebugUtils.currentModule="screenmain";
if (Debug.shouldDelegate(ba, "ladeteilnehmer", false))
	 {return ((String) Debug.delegate(ba, "ladeteilnehmer", new Object[] {_response}));}
anywheresoftware.b4a.objects.collections.JSONParser _jp = null;
anywheresoftware.b4a.objects.collections.Map _teilnehmerliste = null;
String _key = "";
int _lastid = 0;
int _currentmax = 0;
anywheresoftware.b4a.objects.collections.Map _tmap = null;
RDebugUtils.currentLine=41680896;
 //BA.debugLineNum = 41680896;BA.debugLine="Private Sub ladeTeilnehmer(response As String)";
RDebugUtils.currentLine=41680897;
 //BA.debugLineNum = 41680897;BA.debugLine="Teilnehmer.Initialize";
__ref._teilnehmer /*anywheresoftware.b4a.objects.collections.List*/ .Initialize();
RDebugUtils.currentLine=41680898;
 //BA.debugLineNum = 41680898;BA.debugLine="If response <> \"\" And response <> \"null\" Then";
if ((_response).equals("") == false && (_response).equals("null") == false) { 
RDebugUtils.currentLine=41680899;
 //BA.debugLineNum = 41680899;BA.debugLine="Dim jp As JSONParser";
_jp = new anywheresoftware.b4a.objects.collections.JSONParser();
RDebugUtils.currentLine=41680900;
 //BA.debugLineNum = 41680900;BA.debugLine="jp.Initialize(response)";
_jp.Initialize(_response);
RDebugUtils.currentLine=41680901;
 //BA.debugLineNum = 41680901;BA.debugLine="Dim teilnehmerliste As Map = jp.NextObject";
_teilnehmerliste = new anywheresoftware.b4a.objects.collections.Map();
_teilnehmerliste = _jp.NextObject();
RDebugUtils.currentLine=41680902;
 //BA.debugLineNum = 41680902;BA.debugLine="For Each key As String In teilnehmerliste.Keys";
{
final anywheresoftware.b4a.BA.IterableList group6 = _teilnehmerliste.Keys();
final int groupLen6 = group6.getSize()
;int index6 = 0;
;
for (; index6 < groupLen6;index6++){
_key = BA.ObjectToString(group6.Get(index6));
RDebugUtils.currentLine=41680903;
 //BA.debugLineNum = 41680903;BA.debugLine="Dim lastID As Int = key.Replace(\"t\", \"\")";
_lastid = (int)(Double.parseDouble(_key.replace("t","")));
RDebugUtils.currentLine=41680904;
 //BA.debugLineNum = 41680904;BA.debugLine="Dim currentMax As Int = TLNlastID.Replace(\"t\",";
_currentmax = (int)(Double.parseDouble(__ref._tlnlastid /*String*/ .replace("t","")));
RDebugUtils.currentLine=41680905;
 //BA.debugLineNum = 41680905;BA.debugLine="If lastID > currentMax Then TLNlastID = \"t\" & l";
if (_lastid>_currentmax) { 
__ref._tlnlastid /*String*/  = "t"+BA.NumberToString(_lastid);};
RDebugUtils.currentLine=41680906;
 //BA.debugLineNum = 41680906;BA.debugLine="Dim tMap As Map = teilnehmerliste.Get(key)";
_tmap = new anywheresoftware.b4a.objects.collections.Map();
_tmap = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_teilnehmerliste.Get((Object)(_key))));
RDebugUtils.currentLine=41680907;
 //BA.debugLineNum = 41680907;BA.debugLine="Teilnehmer.Add(tMap.GetDefault(\"Name\", \"unbenan";
__ref._teilnehmer /*anywheresoftware.b4a.objects.collections.List*/ .Add(_tmap.GetDefault((Object)("Name"),(Object)("unbenannt")));
 }
};
RDebugUtils.currentLine=41680909;
 //BA.debugLineNum = 41680909;BA.debugLine="If Teilnehmer.Size > 0 Then Teilnehmer.Sort(True";
if (__ref._teilnehmer /*anywheresoftware.b4a.objects.collections.List*/ .getSize()>0) { 
__ref._teilnehmer /*anywheresoftware.b4a.objects.collections.List*/ .Sort(__c.True);};
 };
RDebugUtils.currentLine=41680911;
 //BA.debugLineNum = 41680911;BA.debugLine="DBPut(\"Teilnehmer\", Teilnehmer)";
__ref._dbput /*String*/ (null,"Teilnehmer",(Object)(__ref._teilnehmer /*anywheresoftware.b4a.objects.collections.List*/ .getObject()));
RDebugUtils.currentLine=41680912;
 //BA.debugLineNum = 41680912;BA.debugLine="End Sub";
return "";
}
public String  _holefdj(b4a.example.screenmain __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="screenmain";
if (Debug.shouldDelegate(ba, "holefdj", false))
	 {return ((String) Debug.delegate(ba, "holefdj", null));}
String _verdatum = "";
String[] _parts = null;
RDebugUtils.currentLine=41222144;
 //BA.debugLineNum = 41222144;BA.debugLine="Private Sub holeFDJ";
RDebugUtils.currentLine=41222145;
 //BA.debugLineNum = 41222145;BA.debugLine="DBdatenTyp = \"FDJ\"";
__ref._dbdatentyp /*String*/  = "FDJ";
RDebugUtils.currentLine=41222146;
 //BA.debugLineNum = 41222146;BA.debugLine="Dim verDatum As String = DBGet(\"VeranstaltungDatu";
_verdatum = BA.ObjectToString(__ref._dbget /*Object*/ (null,"VeranstaltungDatum",(Object)("00.00.0000")));
RDebugUtils.currentLine=41222147;
 //BA.debugLineNum = 41222147;BA.debugLine="Dim parts() As String = Regex.Split(\"\\.\", verDatu";
_parts = __c.Regex.Split("\\.",_verdatum);
RDebugUtils.currentLine=41222148;
 //BA.debugLineNum = 41222148;BA.debugLine="CurrentWebUrl = URLfdj.Replace(\"[xxxx]\", parts(2)";
__ref._currentweburl /*String*/  = __ref._urlfdj /*String*/ .replace("[xxxx]",_parts[(int) (2)])+".json?auth="+BA.ObjectToString(__ref._status /*anywheresoftware.b4a.objects.collections.Map*/ .GetDefault((Object)("idToken"),(Object)("")));
RDebugUtils.currentLine=41222149;
 //BA.debugLineNum = 41222149;BA.debugLine="GetWeb";
__ref._getweb /*String*/ (null);
RDebugUtils.currentLine=41222150;
 //BA.debugLineNum = 41222150;BA.debugLine="End Sub";
return "";
}
public String  _ladefdj(b4a.example.screenmain __ref,String _response) throws Exception{
__ref = this;
RDebugUtils.currentModule="screenmain";
if (Debug.shouldDelegate(ba, "ladefdj", false))
	 {return ((String) Debug.delegate(ba, "ladefdj", new Object[] {_response}));}
anywheresoftware.b4a.objects.collections.JSONParser _jp = null;
anywheresoftware.b4a.objects.collections.Map _fdj = null;
RDebugUtils.currentLine=41746432;
 //BA.debugLineNum = 41746432;BA.debugLine="Private Sub ladeFDJ(response As String)";
RDebugUtils.currentLine=41746433;
 //BA.debugLineNum = 41746433;BA.debugLine="If response <> \"\" And response <> \"null\" Then";
if ((_response).equals("") == false && (_response).equals("null") == false) { 
RDebugUtils.currentLine=41746434;
 //BA.debugLineNum = 41746434;BA.debugLine="Dim jp As JSONParser";
_jp = new anywheresoftware.b4a.objects.collections.JSONParser();
RDebugUtils.currentLine=41746435;
 //BA.debugLineNum = 41746435;BA.debugLine="jp.Initialize(response)";
_jp.Initialize(_response);
RDebugUtils.currentLine=41746436;
 //BA.debugLineNum = 41746436;BA.debugLine="Dim fdj As Map = jp.NextObject";
_fdj = new anywheresoftware.b4a.objects.collections.Map();
_fdj = _jp.NextObject();
RDebugUtils.currentLine=41746437;
 //BA.debugLineNum = 41746437;BA.debugLine="DBPut(\"FDJTeilnehmer\", fdj.GetDefault(\"Teilnehme";
__ref._dbput /*String*/ (null,"FDJTeilnehmer",_fdj.GetDefault((Object)("Teilnehmer"),(Object)("")));
RDebugUtils.currentLine=41746438;
 //BA.debugLineNum = 41746438;BA.debugLine="DBPut(\"FDJGewicht\", fdj.GetDefault(\"Gewicht\", \"\"";
__ref._dbput /*String*/ (null,"FDJGewicht",_fdj.GetDefault((Object)("Gewicht"),(Object)("")));
 };
RDebugUtils.currentLine=41746440;
 //BA.debugLineNum = 41746440;BA.debugLine="End Sub";
return "";
}
public String  _holetln(b4a.example.screenmain __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="screenmain";
if (Debug.shouldDelegate(ba, "holetln", false))
	 {return ((String) Debug.delegate(ba, "holetln", null));}
RDebugUtils.currentLine=41156608;
 //BA.debugLineNum = 41156608;BA.debugLine="Private Sub holeTLN";
RDebugUtils.currentLine=41156609;
 //BA.debugLineNum = 41156609;BA.debugLine="DBdatenTyp = \"Teilnehmer\"";
__ref._dbdatentyp /*String*/  = "Teilnehmer";
RDebugUtils.currentLine=41156610;
 //BA.debugLineNum = 41156610;BA.debugLine="CurrentWebUrl = URLteilnehmer & \".json?auth=\" & S";
__ref._currentweburl /*String*/  = __ref._urlteilnehmer /*String*/ +".json?auth="+BA.ObjectToString(__ref._status /*anywheresoftware.b4a.objects.collections.Map*/ .GetDefault((Object)("idToken"),(Object)("")));
RDebugUtils.currentLine=41156611;
 //BA.debugLineNum = 41156611;BA.debugLine="GetWeb";
__ref._getweb /*String*/ (null);
RDebugUtils.currentLine=41156612;
 //BA.debugLineNum = 41156612;BA.debugLine="End Sub";
return "";
}
public String  _setzeheaderfromdb(b4a.example.screenmain __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="screenmain";
if (Debug.shouldDelegate(ba, "setzeheaderfromdb", false))
	 {return ((String) Debug.delegate(ba, "setzeheaderfromdb", null));}
RDebugUtils.currentLine=40501248;
 //BA.debugLineNum = 40501248;BA.debugLine="Private Sub setzeHeaderfromDB";
RDebugUtils.currentLine=40501249;
 //BA.debugLineNum = 40501249;BA.debugLine="lblVerein.Text = DBGet(\"Bezeichnung\", \"- nicht ge";
__ref._lblverein /*anywheresoftware.b4a.objects.LabelWrapper*/ .setText(BA.ObjectToCharSequence(__ref._dbget /*Object*/ (null,"Bezeichnung",(Object)("- nicht gesetzt -"))));
RDebugUtils.currentLine=40501250;
 //BA.debugLineNum = 40501250;BA.debugLine="lblVeranstaltung.Text = DBGet(\"VeranstaltungName\"";
__ref._lblveranstaltung /*anywheresoftware.b4a.objects.LabelWrapper*/ .setText(BA.ObjectToCharSequence(__ref._dbget /*Object*/ (null,"VeranstaltungName",(Object)("- nicht gesetzt -"))));
RDebugUtils.currentLine=40501251;
 //BA.debugLineNum = 40501251;BA.debugLine="lblDatum.Text = DBGet(\"VeranstaltungDatum\", \"- ni";
__ref._lbldatum /*anywheresoftware.b4a.objects.LabelWrapper*/ .setText(BA.ObjectToCharSequence(__ref._dbget /*Object*/ (null,"VeranstaltungDatum",(Object)("- nicht gesetzt -"))));
RDebugUtils.currentLine=40501252;
 //BA.debugLineNum = 40501252;BA.debugLine="End Sub";
return "";
}
public String  _loadtinydb(b4a.example.screenmain __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="screenmain";
if (Debug.shouldDelegate(ba, "loadtinydb", false))
	 {return ((String) Debug.delegate(ba, "loadtinydb", null));}
RDebugUtils.currentLine=43909120;
 //BA.debugLineNum = 43909120;BA.debugLine="Private Sub LoadTinyDB";
RDebugUtils.currentLine=43909121;
 //BA.debugLineNum = 43909121;BA.debugLine="If File.Exists(File.DirInternal, DBFileName) Then";
if (__c.File.Exists(__c.File.getDirInternal(),__ref._dbfilename /*String*/ )) { 
RDebugUtils.currentLine=43909122;
 //BA.debugLineNum = 43909122;BA.debugLine="DBVerein = File.ReadMap(File.DirInternal, DBFile";
__ref._dbverein /*anywheresoftware.b4a.objects.collections.Map*/  = __c.File.ReadMap(__c.File.getDirInternal(),__ref._dbfilename /*String*/ );
 }else {
RDebugUtils.currentLine=43909124;
 //BA.debugLineNum = 43909124;BA.debugLine="DBVerein.Initialize";
__ref._dbverein /*anywheresoftware.b4a.objects.collections.Map*/ .Initialize();
 };
RDebugUtils.currentLine=43909126;
 //BA.debugLineNum = 43909126;BA.debugLine="End Sub";
return "";
}
public String  _lsvname_itemclick(b4a.example.screenmain __ref,int _position,Object _value) throws Exception{
__ref = this;
RDebugUtils.currentModule="screenmain";
if (Debug.shouldDelegate(ba, "lsvname_itemclick", false))
	 {return ((String) Debug.delegate(ba, "lsvname_itemclick", new Object[] {_position,_value}));}
RDebugUtils.currentLine=43253760;
 //BA.debugLineNum = 43253760;BA.debugLine="Private Sub lsvName_ItemClick (Position As Int, Va";
RDebugUtils.currentLine=43253761;
 //BA.debugLineNum = 43253761;BA.debugLine="HideKeyboard";
__ref._hidekeyboard /*String*/ (null);
RDebugUtils.currentLine=43253762;
 //BA.debugLineNum = 43253762;BA.debugLine="dochange = False";
__ref._dochange /*boolean*/  = __c.False;
RDebugUtils.currentLine=43253763;
 //BA.debugLineNum = 43253763;BA.debugLine="tbxTeilnehmer.Text = Value";
__ref._tbxteilnehmer /*anywheresoftware.b4a.objects.EditTextWrapper*/ .setText(BA.ObjectToCharSequence(_value));
RDebugUtils.currentLine=43253764;
 //BA.debugLineNum = 43253764;BA.debugLine="dochange = True";
__ref._dochange /*boolean*/  = __c.True;
RDebugUtils.currentLine=43253765;
 //BA.debugLineNum = 43253765;BA.debugLine="lsvName.Visible = False";
__ref._lsvname /*anywheresoftware.b4a.objects.ListViewWrapper*/ .setVisible(__c.False);
RDebugUtils.currentLine=43253766;
 //BA.debugLineNum = 43253766;BA.debugLine="btnSpeichern.Enabled = True";
__ref._btnspeichern /*anywheresoftware.b4a.objects.ButtonWrapper*/ .setEnabled(__c.True);
RDebugUtils.currentLine=43253767;
 //BA.debugLineNum = 43253767;BA.debugLine="btnSpeichern.TextColor = colorgreen";
__ref._btnspeichern /*anywheresoftware.b4a.objects.ButtonWrapper*/ .setTextColor(__ref._colorgreen /*int*/ );
RDebugUtils.currentLine=43253768;
 //BA.debugLineNum = 43253768;BA.debugLine="startTimer";
__ref._starttimer /*String*/ (null);
RDebugUtils.currentLine=43253769;
 //BA.debugLineNum = 43253769;BA.debugLine="End Sub";
return "";
}
public String  _zeitstempel(b4a.example.screenmain __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="screenmain";
if (Debug.shouldDelegate(ba, "zeitstempel", false))
	 {return ((String) Debug.delegate(ba, "zeitstempel", null));}
RDebugUtils.currentLine=43712512;
 //BA.debugLineNum = 43712512;BA.debugLine="Private Sub Zeitstempel As String";
RDebugUtils.currentLine=43712513;
 //BA.debugLineNum = 43712513;BA.debugLine="Return FormatDateCustom(DateTime.Now, \"yyyyMMddHH";
if (true) return __ref._formatdatecustom /*String*/ (null,__c.DateTime.getNow(),"yyyyMMddHHmmss");
RDebugUtils.currentLine=43712514;
 //BA.debugLineNum = 43712514;BA.debugLine="End Sub";
return "";
}
public String  _setwebviewstring(b4a.example.screenmain __ref,String _val) throws Exception{
__ref = this;
RDebugUtils.currentModule="screenmain";
if (Debug.shouldDelegate(ba, "setwebviewstring", false))
	 {return ((String) Debug.delegate(ba, "setwebviewstring", new Object[] {_val}));}
RDebugUtils.currentLine=40173568;
 //BA.debugLineNum = 40173568;BA.debugLine="Public Sub setWebViewString(val As String)";
RDebugUtils.currentLine=40173569;
 //BA.debugLineNum = 40173569;BA.debugLine="CallSubDelayed2(Me, \"webErgebnis_WebViewStringCha";
__c.CallSubDelayed2(ba,this,"webErgebnis_WebViewStringChange",(Object)(_val));
RDebugUtils.currentLine=40173570;
 //BA.debugLineNum = 40173570;BA.debugLine="End Sub";
return "";
}
public String  _setzefdj(b4a.example.screenmain __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="screenmain";
if (Debug.shouldDelegate(ba, "setzefdj", false))
	 {return ((String) Debug.delegate(ba, "setzefdj", null));}
String _gewicht = "";
String _tlnname = "";
RDebugUtils.currentLine=40894464;
 //BA.debugLineNum = 40894464;BA.debugLine="Private Sub setzeFDJ";
RDebugUtils.currentLine=40894465;
 //BA.debugLineNum = 40894465;BA.debugLine="Dim gewicht As String = DBGet(\"FDJGewicht\", \"0\")";
_gewicht = BA.ObjectToString(__ref._dbget /*Object*/ (null,"FDJGewicht",(Object)("0")));
RDebugUtils.currentLine=40894466;
 //BA.debugLineNum = 40894466;BA.debugLine="Dim tlnName As String = DBGet(\"FDJTeilnehmer\", \"-";
_tlnname = BA.ObjectToString(__ref._dbget /*Object*/ (null,"FDJTeilnehmer",(Object)("- noch offen -")));
RDebugUtils.currentLine=40894467;
 //BA.debugLineNum = 40894467;BA.debugLine="RunJS(\"setzeFDJ(\" & QUOTE & gewicht & QUOTE & \",\"";
__ref._runjs /*String*/ (null,"setzeFDJ("+__c.QUOTE+_gewicht+__c.QUOTE+","+__c.QUOTE+_tlnname+__c.QUOTE+");");
RDebugUtils.currentLine=40894468;
 //BA.debugLineNum = 40894468;BA.debugLine="End Sub";
return "";
}
public String  _setzeplatz(b4a.example.screenmain __ref,int _pid) throws Exception{
__ref = this;
RDebugUtils.currentModule="screenmain";
if (Debug.shouldDelegate(ba, "setzeplatz", false))
	 {return ((String) Debug.delegate(ba, "setzeplatz", new Object[] {_pid}));}
int _baseidx = 0;
String _tname = "";
String _pstr = "";
int _spnidx = 0;
int _maxanzahl = 0;
RDebugUtils.currentLine=40632320;
 //BA.debugLineNum = 40632320;BA.debugLine="Private Sub setzePlatz(pid As Int)";
RDebugUtils.currentLine=40632321;
 //BA.debugLineNum = 40632321;BA.debugLine="dochange = False";
__ref._dochange /*boolean*/  = __c.False;
RDebugUtils.currentLine=40632322;
 //BA.debugLineNum = 40632322;BA.debugLine="lsvName.Clear";
__ref._lsvname /*anywheresoftware.b4a.objects.ListViewWrapper*/ .Clear();
RDebugUtils.currentLine=40632323;
 //BA.debugLineNum = 40632323;BA.debugLine="lsvName.Visible = False";
__ref._lsvname /*anywheresoftware.b4a.objects.ListViewWrapper*/ .setVisible(__c.False);
RDebugUtils.currentLine=40632326;
 //BA.debugLineNum = 40632326;BA.debugLine="Dim baseIdx As Int = pid * 4";
_baseidx = (int) (_pid*4);
RDebugUtils.currentLine=40632327;
 //BA.debugLineNum = 40632327;BA.debugLine="If webviewData.Size > baseIdx + 2 Then";
if (__ref._webviewdata /*anywheresoftware.b4a.objects.collections.List*/ .getSize()>_baseidx+2) { 
RDebugUtils.currentLine=40632328;
 //BA.debugLineNum = 40632328;BA.debugLine="Dim tName As String = webviewData.Get(baseIdx +";
_tname = BA.ObjectToString(__ref._webviewdata /*anywheresoftware.b4a.objects.collections.List*/ .Get((int) (_baseidx+1)));
RDebugUtils.currentLine=40632329;
 //BA.debugLineNum = 40632329;BA.debugLine="tbxTeilnehmer.Text = tName.Trim";
__ref._tbxteilnehmer /*anywheresoftware.b4a.objects.EditTextWrapper*/ .setText(BA.ObjectToCharSequence(_tname.trim()));
RDebugUtils.currentLine=40632330;
 //BA.debugLineNum = 40632330;BA.debugLine="tbxGramm.Text = webviewData.Get(baseIdx + 2)";
__ref._tbxgramm /*anywheresoftware.b4a.objects.EditTextWrapper*/ .setText(BA.ObjectToCharSequence(__ref._webviewdata /*anywheresoftware.b4a.objects.collections.List*/ .Get((int) (_baseidx+2))));
RDebugUtils.currentLine=40632332;
 //BA.debugLineNum = 40632332;BA.debugLine="Dim pStr As String = webviewData.Get(baseIdx)";
_pstr = BA.ObjectToString(__ref._webviewdata /*anywheresoftware.b4a.objects.collections.List*/ .Get(_baseidx));
RDebugUtils.currentLine=40632333;
 //BA.debugLineNum = 40632333;BA.debugLine="Dim spnIdx As Int = spnItems.IndexOf(pStr.Trim)";
_spnidx = __ref._spnitems /*anywheresoftware.b4a.objects.collections.List*/ .IndexOf((Object)(_pstr.trim()));
RDebugUtils.currentLine=40632334;
 //BA.debugLineNum = 40632334;BA.debugLine="If spnIdx >= 0 Then spnPlatz.SelectedIndex = spn";
if (_spnidx>=0) { 
__ref._spnplatz /*anywheresoftware.b4a.objects.SpinnerWrapper*/ .setSelectedIndex(_spnidx);};
 };
RDebugUtils.currentLine=40632337;
 //BA.debugLineNum = 40632337;BA.debugLine="tbxTeilnehmer.Enabled = True";
__ref._tbxteilnehmer /*anywheresoftware.b4a.objects.EditTextWrapper*/ .setEnabled(__c.True);
RDebugUtils.currentLine=40632338;
 //BA.debugLineNum = 40632338;BA.debugLine="tbxGramm.Enabled = True";
__ref._tbxgramm /*anywheresoftware.b4a.objects.EditTextWrapper*/ .setEnabled(__c.True);
RDebugUtils.currentLine=40632339;
 //BA.debugLineNum = 40632339;BA.debugLine="spnPlatz.Enabled = True";
__ref._spnplatz /*anywheresoftware.b4a.objects.SpinnerWrapper*/ .setEnabled(__c.True);
RDebugUtils.currentLine=40632341;
 //BA.debugLineNum = 40632341;BA.debugLine="If tbxTeilnehmer.Text.Trim <> \"\" Then";
if ((__ref._tbxteilnehmer /*anywheresoftware.b4a.objects.EditTextWrapper*/ .getText().trim()).equals("") == false) { 
RDebugUtils.currentLine=40632342;
 //BA.debugLineNum = 40632342;BA.debugLine="btnFDJeingabe.Enabled = True";
__ref._btnfdjeingabe /*anywheresoftware.b4a.objects.ButtonWrapper*/ .setEnabled(__c.True);
RDebugUtils.currentLine=40632343;
 //BA.debugLineNum = 40632343;BA.debugLine="btnFDJeingabe.TextColor = colorgreen";
__ref._btnfdjeingabe /*anywheresoftware.b4a.objects.ButtonWrapper*/ .setTextColor(__ref._colorgreen /*int*/ );
 };
RDebugUtils.currentLine=40632345;
 //BA.debugLineNum = 40632345;BA.debugLine="If pid > 1 Then";
if (_pid>1) { 
RDebugUtils.currentLine=40632346;
 //BA.debugLineNum = 40632346;BA.debugLine="btnMinus.Enabled = True";
__ref._btnminus /*anywheresoftware.b4a.objects.ButtonWrapper*/ .setEnabled(__c.True);
RDebugUtils.currentLine=40632347;
 //BA.debugLineNum = 40632347;BA.debugLine="btnMinus.TextColor = colorgreen";
__ref._btnminus /*anywheresoftware.b4a.objects.ButtonWrapper*/ .setTextColor(__ref._colorgreen /*int*/ );
 };
RDebugUtils.currentLine=40632349;
 //BA.debugLineNum = 40632349;BA.debugLine="Dim maxAnzahl As Int = DBGet(\"VeranstaltungAnzahl";
_maxanzahl = (int)(BA.ObjectToNumber(__ref._dbget /*Object*/ (null,"VeranstaltungAnzahl",(Object)("25"))));
RDebugUtils.currentLine=40632350;
 //BA.debugLineNum = 40632350;BA.debugLine="If pid < maxAnzahl Then";
if (_pid<_maxanzahl) { 
RDebugUtils.currentLine=40632351;
 //BA.debugLineNum = 40632351;BA.debugLine="btnPlus.Enabled = True";
__ref._btnplus /*anywheresoftware.b4a.objects.ButtonWrapper*/ .setEnabled(__c.True);
RDebugUtils.currentLine=40632352;
 //BA.debugLineNum = 40632352;BA.debugLine="btnPlus.TextColor = colorgreen";
__ref._btnplus /*anywheresoftware.b4a.objects.ButtonWrapper*/ .setTextColor(__ref._colorgreen /*int*/ );
 };
RDebugUtils.currentLine=40632354;
 //BA.debugLineNum = 40632354;BA.debugLine="If False = Status.GetDefault(\"ProgOffline\", True)";
if (__c.False==BA.ObjectToBoolean(__ref._status /*anywheresoftware.b4a.objects.collections.Map*/ .GetDefault((Object)("ProgOffline"),(Object)(__c.True)))) { 
RDebugUtils.currentLine=40632355;
 //BA.debugLineNum = 40632355;BA.debugLine="btnCloseVstng.Enabled = True";
__ref._btnclosevstng /*anywheresoftware.b4a.objects.ButtonWrapper*/ .setEnabled(__c.True);
 };
RDebugUtils.currentLine=40632358;
 //BA.debugLineNum = 40632358;BA.debugLine="dochange = True";
__ref._dochange /*boolean*/  = __c.True;
RDebugUtils.currentLine=40632359;
 //BA.debugLineNum = 40632359;BA.debugLine="tbxTeilnehmer.RequestFocus";
__ref._tbxteilnehmer /*anywheresoftware.b4a.objects.EditTextWrapper*/ .RequestFocus();
RDebugUtils.currentLine=40632360;
 //BA.debugLineNum = 40632360;BA.debugLine="End Sub";
return "";
}
public String  _spnplatz_itemclick(b4a.example.screenmain __ref,int _position,Object _value) throws Exception{
__ref = this;
RDebugUtils.currentModule="screenmain";
if (Debug.shouldDelegate(ba, "spnplatz_itemclick", false))
	 {return ((String) Debug.delegate(ba, "spnplatz_itemclick", new Object[] {_position,_value}));}
RDebugUtils.currentLine=42532864;
 //BA.debugLineNum = 42532864;BA.debugLine="Private Sub spnPlatz_ItemClick (Position As Int, V";
RDebugUtils.currentLine=42532865;
 //BA.debugLineNum = 42532865;BA.debugLine="PlatzSelected = Value";
__ref._platzselected /*int*/  = (int)(BA.ObjectToNumber(_value));
RDebugUtils.currentLine=42532866;
 //BA.debugLineNum = 42532866;BA.debugLine="btnSpeichern.Enabled = True";
__ref._btnspeichern /*anywheresoftware.b4a.objects.ButtonWrapper*/ .setEnabled(__c.True);
RDebugUtils.currentLine=42532867;
 //BA.debugLineNum = 42532867;BA.debugLine="btnSpeichern.TextColor = colorgreen";
__ref._btnspeichern /*anywheresoftware.b4a.objects.ButtonWrapper*/ .setTextColor(__ref._colorgreen /*int*/ );
RDebugUtils.currentLine=42532868;
 //BA.debugLineNum = 42532868;BA.debugLine="RunJS(\"selectRowById(\" & PlatzSelected & \");\")";
__ref._runjs /*String*/ (null,"selectRowById("+BA.NumberToString(__ref._platzselected /*int*/ )+");");
RDebugUtils.currentLine=42532869;
 //BA.debugLineNum = 42532869;BA.debugLine="dochange = True";
__ref._dochange /*boolean*/  = __c.True;
RDebugUtils.currentLine=42532870;
 //BA.debugLineNum = 42532870;BA.debugLine="startTimer";
__ref._starttimer /*String*/ (null);
RDebugUtils.currentLine=42532871;
 //BA.debugLineNum = 42532871;BA.debugLine="End Sub";
return "";
}
public String  _tbxfdjgewicht_focuschanged(b4a.example.screenmain __ref,boolean _hasfocus) throws Exception{
__ref = this;
RDebugUtils.currentModule="screenmain";
if (Debug.shouldDelegate(ba, "tbxfdjgewicht_focuschanged", false))
	 {return ((String) Debug.delegate(ba, "tbxfdjgewicht_focuschanged", new Object[] {_hasfocus}));}
RDebugUtils.currentLine=43450368;
 //BA.debugLineNum = 43450368;BA.debugLine="Private Sub tbxFDJgewicht_FocusChanged (HasFocus A";
RDebugUtils.currentLine=43450369;
 //BA.debugLineNum = 43450369;BA.debugLine="If HasFocus Then";
if (_hasfocus) { 
RDebugUtils.currentLine=43450370;
 //BA.debugLineNum = 43450370;BA.debugLine="tbxFDJgewicht.SelectionStart = tbxFDJgewicht.Tex";
__ref._tbxfdjgewicht /*anywheresoftware.b4a.objects.EditTextWrapper*/ .setSelectionStart(__ref._tbxfdjgewicht /*anywheresoftware.b4a.objects.EditTextWrapper*/ .getText().length());
 }else {
RDebugUtils.currentLine=43450372;
 //BA.debugLineNum = 43450372;BA.debugLine="HideKeyboard";
__ref._hidekeyboard /*String*/ (null);
 };
RDebugUtils.currentLine=43450374;
 //BA.debugLineNum = 43450374;BA.debugLine="End Sub";
return "";
}
public String  _tbxfdjgewicht_textchanged(b4a.example.screenmain __ref,String _old,String _new) throws Exception{
__ref = this;
RDebugUtils.currentModule="screenmain";
if (Debug.shouldDelegate(ba, "tbxfdjgewicht_textchanged", false))
	 {return ((String) Debug.delegate(ba, "tbxfdjgewicht_textchanged", new Object[] {_old,_new}));}
int _val = 0;
RDebugUtils.currentLine=43515904;
 //BA.debugLineNum = 43515904;BA.debugLine="Private Sub tbxFDJgewicht_TextChanged (Old As Stri";
RDebugUtils.currentLine=43515905;
 //BA.debugLineNum = 43515905;BA.debugLine="If dochange Then";
if (__ref._dochange /*boolean*/ ) { 
RDebugUtils.currentLine=43515906;
 //BA.debugLineNum = 43515906;BA.debugLine="dochange = False";
__ref._dochange /*boolean*/  = __c.False;
RDebugUtils.currentLine=43515907;
 //BA.debugLineNum = 43515907;BA.debugLine="If IsNumber(tbxFDJgewicht.Text) Then";
if (__c.IsNumber(__ref._tbxfdjgewicht /*anywheresoftware.b4a.objects.EditTextWrapper*/ .getText())) { 
RDebugUtils.currentLine=43515908;
 //BA.debugLineNum = 43515908;BA.debugLine="Dim val As Int = Abs(tbxFDJgewicht.Text)";
_val = (int) (__c.Abs((double)(Double.parseDouble(__ref._tbxfdjgewicht /*anywheresoftware.b4a.objects.EditTextWrapper*/ .getText()))));
RDebugUtils.currentLine=43515909;
 //BA.debugLineNum = 43515909;BA.debugLine="tbxFDJgewicht.Text = val";
__ref._tbxfdjgewicht /*anywheresoftware.b4a.objects.EditTextWrapper*/ .setText(BA.ObjectToCharSequence(_val));
RDebugUtils.currentLine=43515910;
 //BA.debugLineNum = 43515910;BA.debugLine="btnFDJsave.Enabled = True";
__ref._btnfdjsave /*anywheresoftware.b4a.objects.ButtonWrapper*/ .setEnabled(__c.True);
RDebugUtils.currentLine=43515911;
 //BA.debugLineNum = 43515911;BA.debugLine="btnFDJsave.TextColor = colorgreen";
__ref._btnfdjsave /*anywheresoftware.b4a.objects.ButtonWrapper*/ .setTextColor(__ref._colorgreen /*int*/ );
 };
RDebugUtils.currentLine=43515913;
 //BA.debugLineNum = 43515913;BA.debugLine="tbxFDJgewicht.SelectionStart = tbxFDJgewicht.Tex";
__ref._tbxfdjgewicht /*anywheresoftware.b4a.objects.EditTextWrapper*/ .setSelectionStart(__ref._tbxfdjgewicht /*anywheresoftware.b4a.objects.EditTextWrapper*/ .getText().length());
RDebugUtils.currentLine=43515914;
 //BA.debugLineNum = 43515914;BA.debugLine="dochange = True";
__ref._dochange /*boolean*/  = __c.True;
 };
RDebugUtils.currentLine=43515916;
 //BA.debugLineNum = 43515916;BA.debugLine="startTimer";
__ref._starttimer /*String*/ (null);
RDebugUtils.currentLine=43515917;
 //BA.debugLineNum = 43515917;BA.debugLine="End Sub";
return "";
}
public String  _tbxgramm_focuschanged(b4a.example.screenmain __ref,boolean _hasfocus) throws Exception{
__ref = this;
RDebugUtils.currentModule="screenmain";
if (Debug.shouldDelegate(ba, "tbxgramm_focuschanged", false))
	 {return ((String) Debug.delegate(ba, "tbxgramm_focuschanged", new Object[] {_hasfocus}));}
RDebugUtils.currentLine=43319296;
 //BA.debugLineNum = 43319296;BA.debugLine="Private Sub tbxGramm_FocusChanged (HasFocus As Boo";
RDebugUtils.currentLine=43319297;
 //BA.debugLineNum = 43319297;BA.debugLine="If HasFocus Then";
if (_hasfocus) { 
RDebugUtils.currentLine=43319298;
 //BA.debugLineNum = 43319298;BA.debugLine="tbxGramm.SelectionStart = tbxGramm.Text.Length";
__ref._tbxgramm /*anywheresoftware.b4a.objects.EditTextWrapper*/ .setSelectionStart(__ref._tbxgramm /*anywheresoftware.b4a.objects.EditTextWrapper*/ .getText().length());
 }else {
RDebugUtils.currentLine=43319300;
 //BA.debugLineNum = 43319300;BA.debugLine="HideKeyboard";
__ref._hidekeyboard /*String*/ (null);
 };
RDebugUtils.currentLine=43319302;
 //BA.debugLineNum = 43319302;BA.debugLine="End Sub";
return "";
}
public String  _tbxgramm_textchanged(b4a.example.screenmain __ref,String _old,String _new) throws Exception{
__ref = this;
RDebugUtils.currentModule="screenmain";
if (Debug.shouldDelegate(ba, "tbxgramm_textchanged", false))
	 {return ((String) Debug.delegate(ba, "tbxgramm_textchanged", new Object[] {_old,_new}));}
int _val = 0;
RDebugUtils.currentLine=43384832;
 //BA.debugLineNum = 43384832;BA.debugLine="Private Sub tbxGramm_TextChanged (Old As String, N";
RDebugUtils.currentLine=43384833;
 //BA.debugLineNum = 43384833;BA.debugLine="If dochange Then";
if (__ref._dochange /*boolean*/ ) { 
RDebugUtils.currentLine=43384834;
 //BA.debugLineNum = 43384834;BA.debugLine="dochange = False";
__ref._dochange /*boolean*/  = __c.False;
RDebugUtils.currentLine=43384835;
 //BA.debugLineNum = 43384835;BA.debugLine="If IsNumber(tbxGramm.Text) Then";
if (__c.IsNumber(__ref._tbxgramm /*anywheresoftware.b4a.objects.EditTextWrapper*/ .getText())) { 
RDebugUtils.currentLine=43384836;
 //BA.debugLineNum = 43384836;BA.debugLine="Dim val As Int = Abs(tbxGramm.Text)";
_val = (int) (__c.Abs((double)(Double.parseDouble(__ref._tbxgramm /*anywheresoftware.b4a.objects.EditTextWrapper*/ .getText()))));
RDebugUtils.currentLine=43384837;
 //BA.debugLineNum = 43384837;BA.debugLine="tbxGramm.Text = val";
__ref._tbxgramm /*anywheresoftware.b4a.objects.EditTextWrapper*/ .setText(BA.ObjectToCharSequence(_val));
RDebugUtils.currentLine=43384838;
 //BA.debugLineNum = 43384838;BA.debugLine="btnSpeichern.Enabled = True";
__ref._btnspeichern /*anywheresoftware.b4a.objects.ButtonWrapper*/ .setEnabled(__c.True);
RDebugUtils.currentLine=43384839;
 //BA.debugLineNum = 43384839;BA.debugLine="btnSpeichern.TextColor = colorgreen";
__ref._btnspeichern /*anywheresoftware.b4a.objects.ButtonWrapper*/ .setTextColor(__ref._colorgreen /*int*/ );
 };
RDebugUtils.currentLine=43384841;
 //BA.debugLineNum = 43384841;BA.debugLine="tbxGramm.SelectionStart = tbxGramm.Text.Length";
__ref._tbxgramm /*anywheresoftware.b4a.objects.EditTextWrapper*/ .setSelectionStart(__ref._tbxgramm /*anywheresoftware.b4a.objects.EditTextWrapper*/ .getText().length());
RDebugUtils.currentLine=43384842;
 //BA.debugLineNum = 43384842;BA.debugLine="dochange = True";
__ref._dochange /*boolean*/  = __c.True;
 };
RDebugUtils.currentLine=43384844;
 //BA.debugLineNum = 43384844;BA.debugLine="startTimer";
__ref._starttimer /*String*/ (null);
RDebugUtils.currentLine=43384845;
 //BA.debugLineNum = 43384845;BA.debugLine="End Sub";
return "";
}
public String  _tbxteilnehmer_focuschanged(b4a.example.screenmain __ref,boolean _hasfocus) throws Exception{
__ref = this;
RDebugUtils.currentModule="screenmain";
if (Debug.shouldDelegate(ba, "tbxteilnehmer_focuschanged", false))
	 {return ((String) Debug.delegate(ba, "tbxteilnehmer_focuschanged", new Object[] {_hasfocus}));}
RDebugUtils.currentLine=43122688;
 //BA.debugLineNum = 43122688;BA.debugLine="Private Sub tbxTeilnehmer_FocusChanged (HasFocus A";
RDebugUtils.currentLine=43122689;
 //BA.debugLineNum = 43122689;BA.debugLine="If HasFocus Then";
if (_hasfocus) { 
RDebugUtils.currentLine=43122690;
 //BA.debugLineNum = 43122690;BA.debugLine="tbxTeilnehmer.SelectionStart = tbxTeilnehmer.Tex";
__ref._tbxteilnehmer /*anywheresoftware.b4a.objects.EditTextWrapper*/ .setSelectionStart(__ref._tbxteilnehmer /*anywheresoftware.b4a.objects.EditTextWrapper*/ .getText().length());
RDebugUtils.currentLine=43122691;
 //BA.debugLineNum = 43122691;BA.debugLine="lsvName.Visible = False";
__ref._lsvname /*anywheresoftware.b4a.objects.ListViewWrapper*/ .setVisible(__c.False);
 }else {
RDebugUtils.currentLine=43122693;
 //BA.debugLineNum = 43122693;BA.debugLine="lsvName.Visible = False";
__ref._lsvname /*anywheresoftware.b4a.objects.ListViewWrapper*/ .setVisible(__c.False);
RDebugUtils.currentLine=43122694;
 //BA.debugLineNum = 43122694;BA.debugLine="HideKeyboard";
__ref._hidekeyboard /*String*/ (null);
 };
RDebugUtils.currentLine=43122696;
 //BA.debugLineNum = 43122696;BA.debugLine="End Sub";
return "";
}
public String  _tbxteilnehmer_textchanged(b4a.example.screenmain __ref,String _old,String _new) throws Exception{
__ref = this;
RDebugUtils.currentModule="screenmain";
if (Debug.shouldDelegate(ba, "tbxteilnehmer_textchanged", false))
	 {return ((String) Debug.delegate(ba, "tbxteilnehmer_textchanged", new Object[] {_old,_new}));}
String _cleaned = "";
anywheresoftware.b4a.keywords.StringBuilderWrapper _sb = null;
boolean _doupper = false;
int _i = 0;
String _ch = "";
anywheresoftware.b4a.objects.collections.List _lsvitems = null;
String _query = "";
String _tname = "";
String _item = "";
RDebugUtils.currentLine=43188224;
 //BA.debugLineNum = 43188224;BA.debugLine="Private Sub tbxTeilnehmer_TextChanged (Old As Stri";
RDebugUtils.currentLine=43188226;
 //BA.debugLineNum = 43188226;BA.debugLine="If lsvName.IsInitialized = False Then Return";
if (__ref._lsvname /*anywheresoftware.b4a.objects.ListViewWrapper*/ .IsInitialized()==__c.False) { 
if (true) return "";};
RDebugUtils.currentLine=43188228;
 //BA.debugLineNum = 43188228;BA.debugLine="If dochange Then";
if (__ref._dochange /*boolean*/ ) { 
RDebugUtils.currentLine=43188229;
 //BA.debugLineNum = 43188229;BA.debugLine="dochange = False";
__ref._dochange /*boolean*/  = __c.False;
RDebugUtils.currentLine=43188231;
 //BA.debugLineNum = 43188231;BA.debugLine="Dim cleaned As String = Regex.Replace(\"[^a-zA-Zä";
_cleaned = __c.Regex.Replace("[^a-zA-ZäöüÄÖÜßéèêëáàâçñ \\-.]",__ref._tbxteilnehmer /*anywheresoftware.b4a.objects.EditTextWrapper*/ .getText(),"");
RDebugUtils.currentLine=43188234;
 //BA.debugLineNum = 43188234;BA.debugLine="Dim sb As StringBuilder";
_sb = new anywheresoftware.b4a.keywords.StringBuilderWrapper();
RDebugUtils.currentLine=43188235;
 //BA.debugLineNum = 43188235;BA.debugLine="sb.Initialize";
_sb.Initialize();
RDebugUtils.currentLine=43188236;
 //BA.debugLineNum = 43188236;BA.debugLine="Dim doupper As Boolean = True";
_doupper = __c.True;
RDebugUtils.currentLine=43188237;
 //BA.debugLineNum = 43188237;BA.debugLine="For i = 0 To cleaned.Length - 1";
{
final int step8 = 1;
final int limit8 = (int) (_cleaned.length()-1);
_i = (int) (0) ;
for (;_i <= limit8 ;_i = _i + step8 ) {
RDebugUtils.currentLine=43188238;
 //BA.debugLineNum = 43188238;BA.debugLine="Dim ch As String = cleaned.SubString2(i, i + 1)";
_ch = _cleaned.substring(_i,(int) (_i+1));
RDebugUtils.currentLine=43188239;
 //BA.debugLineNum = 43188239;BA.debugLine="If ch = \" \" Or ch = \"-\" Then";
if ((_ch).equals(" ") || (_ch).equals("-")) { 
RDebugUtils.currentLine=43188240;
 //BA.debugLineNum = 43188240;BA.debugLine="doupper = True";
_doupper = __c.True;
RDebugUtils.currentLine=43188241;
 //BA.debugLineNum = 43188241;BA.debugLine="sb.Append(ch)";
_sb.Append(_ch);
 }else 
{RDebugUtils.currentLine=43188242;
 //BA.debugLineNum = 43188242;BA.debugLine="Else if ch = \",\" Then";
if ((_ch).equals(",")) { 
 }else 
{RDebugUtils.currentLine=43188244;
 //BA.debugLineNum = 43188244;BA.debugLine="Else if doupper Then";
if (_doupper) { 
RDebugUtils.currentLine=43188245;
 //BA.debugLineNum = 43188245;BA.debugLine="sb.Append(ch.ToUpperCase)";
_sb.Append(_ch.toUpperCase(anywheresoftware.b4a.keywords.Common.stringLocale));
RDebugUtils.currentLine=43188246;
 //BA.debugLineNum = 43188246;BA.debugLine="doupper = False";
_doupper = __c.False;
 }else {
RDebugUtils.currentLine=43188248;
 //BA.debugLineNum = 43188248;BA.debugLine="sb.Append(ch)";
_sb.Append(_ch);
 }}}
;
 }
};
RDebugUtils.currentLine=43188251;
 //BA.debugLineNum = 43188251;BA.debugLine="tbxTeilnehmer.Text = sb.ToString";
__ref._tbxteilnehmer /*anywheresoftware.b4a.objects.EditTextWrapper*/ .setText(BA.ObjectToCharSequence(_sb.ToString()));
RDebugUtils.currentLine=43188252;
 //BA.debugLineNum = 43188252;BA.debugLine="dochange = True";
__ref._dochange /*boolean*/  = __c.True;
 };
RDebugUtils.currentLine=43188255;
 //BA.debugLineNum = 43188255;BA.debugLine="If dochange And tbxTeilnehmer.Text.Length >= 1 Th";
if (__ref._dochange /*boolean*/  && __ref._tbxteilnehmer /*anywheresoftware.b4a.objects.EditTextWrapper*/ .getText().length()>=1) { 
RDebugUtils.currentLine=43188256;
 //BA.debugLineNum = 43188256;BA.debugLine="Dim lsvItems As List";
_lsvitems = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=43188257;
 //BA.debugLineNum = 43188257;BA.debugLine="lsvItems.Initialize";
_lsvitems.Initialize();
RDebugUtils.currentLine=43188258;
 //BA.debugLineNum = 43188258;BA.debugLine="Dim query As String = tbxTeilnehmer.Text.Trim.To";
_query = __ref._tbxteilnehmer /*anywheresoftware.b4a.objects.EditTextWrapper*/ .getText().trim().toLowerCase(anywheresoftware.b4a.keywords.Common.stringLocale);
RDebugUtils.currentLine=43188259;
 //BA.debugLineNum = 43188259;BA.debugLine="If query.Length >= 1 Then";
if (_query.length()>=1) { 
RDebugUtils.currentLine=43188260;
 //BA.debugLineNum = 43188260;BA.debugLine="For Each tName As String In Teilnehmer";
{
final anywheresoftware.b4a.BA.IterableList group29 = __ref._teilnehmer /*anywheresoftware.b4a.objects.collections.List*/ ;
final int groupLen29 = group29.getSize()
;int index29 = 0;
;
for (; index29 < groupLen29;index29++){
_tname = BA.ObjectToString(group29.Get(index29));
RDebugUtils.currentLine=43188261;
 //BA.debugLineNum = 43188261;BA.debugLine="If tName.ToLowerCase.Contains(query) Then";
if (_tname.toLowerCase(anywheresoftware.b4a.keywords.Common.stringLocale).contains(_query)) { 
RDebugUtils.currentLine=43188262;
 //BA.debugLineNum = 43188262;BA.debugLine="lsvItems.Add(tName)";
_lsvitems.Add((Object)(_tname));
 };
 }
};
 };
RDebugUtils.currentLine=43188267;
 //BA.debugLineNum = 43188267;BA.debugLine="If tbxTeilnehmer.Text.Trim.Length >= 2 Or tbxTei";
if (__ref._tbxteilnehmer /*anywheresoftware.b4a.objects.EditTextWrapper*/ .getText().trim().length()>=2 || (__ref._tbxteilnehmer /*anywheresoftware.b4a.objects.EditTextWrapper*/ .getText()).equals("")) { 
RDebugUtils.currentLine=43188268;
 //BA.debugLineNum = 43188268;BA.debugLine="btnSpeichern.Enabled = True";
__ref._btnspeichern /*anywheresoftware.b4a.objects.ButtonWrapper*/ .setEnabled(__c.True);
RDebugUtils.currentLine=43188269;
 //BA.debugLineNum = 43188269;BA.debugLine="btnSpeichern.TextColor = colorgreen";
__ref._btnspeichern /*anywheresoftware.b4a.objects.ButtonWrapper*/ .setTextColor(__ref._colorgreen /*int*/ );
 };
RDebugUtils.currentLine=43188272;
 //BA.debugLineNum = 43188272;BA.debugLine="lsvName.Clear";
__ref._lsvname /*anywheresoftware.b4a.objects.ListViewWrapper*/ .Clear();
RDebugUtils.currentLine=43188273;
 //BA.debugLineNum = 43188273;BA.debugLine="If lsvItems.Size >= 1 Then";
if (_lsvitems.getSize()>=1) { 
RDebugUtils.currentLine=43188274;
 //BA.debugLineNum = 43188274;BA.debugLine="For Each item As String In lsvItems";
{
final anywheresoftware.b4a.BA.IterableList group41 = _lsvitems;
final int groupLen41 = group41.getSize()
;int index41 = 0;
;
for (; index41 < groupLen41;index41++){
_item = BA.ObjectToString(group41.Get(index41));
RDebugUtils.currentLine=43188275;
 //BA.debugLineNum = 43188275;BA.debugLine="lsvName.AddSingleLine(item)";
__ref._lsvname /*anywheresoftware.b4a.objects.ListViewWrapper*/ .AddSingleLine(BA.ObjectToCharSequence(_item));
 }
};
RDebugUtils.currentLine=43188277;
 //BA.debugLineNum = 43188277;BA.debugLine="lsvName.Visible = True";
__ref._lsvname /*anywheresoftware.b4a.objects.ListViewWrapper*/ .setVisible(__c.True);
 }else {
RDebugUtils.currentLine=43188279;
 //BA.debugLineNum = 43188279;BA.debugLine="lsvName.Visible = False";
__ref._lsvname /*anywheresoftware.b4a.objects.ListViewWrapper*/ .setVisible(__c.False);
 };
 }else {
RDebugUtils.currentLine=43188282;
 //BA.debugLineNum = 43188282;BA.debugLine="lsvName.Clear";
__ref._lsvname /*anywheresoftware.b4a.objects.ListViewWrapper*/ .Clear();
RDebugUtils.currentLine=43188283;
 //BA.debugLineNum = 43188283;BA.debugLine="lsvName.Visible = False";
__ref._lsvname /*anywheresoftware.b4a.objects.ListViewWrapper*/ .setVisible(__c.False);
RDebugUtils.currentLine=43188284;
 //BA.debugLineNum = 43188284;BA.debugLine="btnSpeichern.Enabled = False";
__ref._btnspeichern /*anywheresoftware.b4a.objects.ButtonWrapper*/ .setEnabled(__c.False);
RDebugUtils.currentLine=43188285;
 //BA.debugLineNum = 43188285;BA.debugLine="btnSpeichern.TextColor = 0xFF888888";
__ref._btnspeichern /*anywheresoftware.b4a.objects.ButtonWrapper*/ .setTextColor(((int)0xff888888));
 };
RDebugUtils.currentLine=43188288;
 //BA.debugLineNum = 43188288;BA.debugLine="tbxTeilnehmer.SelectionStart = tbxTeilnehmer.Text";
__ref._tbxteilnehmer /*anywheresoftware.b4a.objects.EditTextWrapper*/ .setSelectionStart(__ref._tbxteilnehmer /*anywheresoftware.b4a.objects.EditTextWrapper*/ .getText().length());
RDebugUtils.currentLine=43188289;
 //BA.debugLineNum = 43188289;BA.debugLine="startTimer";
__ref._starttimer /*String*/ (null);
RDebugUtils.currentLine=43188290;
 //BA.debugLineNum = 43188290;BA.debugLine="End Sub";
return "";
}
public String  _uhrzeit_tick(b4a.example.screenmain __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="screenmain";
if (Debug.shouldDelegate(ba, "uhrzeit_tick", false))
	 {return ((String) Debug.delegate(ba, "uhrzeit_tick", null));}
RDebugUtils.currentLine=43646976;
 //BA.debugLineNum = 43646976;BA.debugLine="Private Sub Uhrzeit_Tick";
RDebugUtils.currentLine=43646977;
 //BA.debugLineNum = 43646977;BA.debugLine="Uhrzeit.Enabled = False";
__ref._uhrzeit /*anywheresoftware.b4a.objects.Timer*/ .setEnabled(__c.False);
RDebugUtils.currentLine=43646978;
 //BA.debugLineNum = 43646978;BA.debugLine="B4XPages.ShowPage(\"ScreenSaver\")";
_b4xpages._showpage /*String*/ (ba,"ScreenSaver");
RDebugUtils.currentLine=43646979;
 //BA.debugLineNum = 43646979;BA.debugLine="ToastMessageShow(\"Timeout -> Wechsel zu ScreenSav";
__c.ToastMessageShow(BA.ObjectToCharSequence("Timeout -> Wechsel zu ScreenSaver"),__c.False);
RDebugUtils.currentLine=43646980;
 //BA.debugLineNum = 43646980;BA.debugLine="End Sub";
return "";
}
public String  _webergebnis_pagefinished(b4a.example.screenmain __ref,String _url) throws Exception{
__ref = this;
RDebugUtils.currentModule="screenmain";
if (Debug.shouldDelegate(ba, "webergebnis_pagefinished", false))
	 {return ((String) Debug.delegate(ba, "webergebnis_pagefinished", new Object[] {_url}));}
RDebugUtils.currentLine=40763392;
 //BA.debugLineNum = 40763392;BA.debugLine="Private Sub webErgebnis_PageFinished (Url As Strin";
RDebugUtils.currentLine=40763393;
 //BA.debugLineNum = 40763393;BA.debugLine="RunJS(\"init();\")";
__ref._runjs /*String*/ (null,"init();");
RDebugUtils.currentLine=40763394;
 //BA.debugLineNum = 40763394;BA.debugLine="setzeFDJ";
__ref._setzefdj /*String*/ (null);
RDebugUtils.currentLine=40763395;
 //BA.debugLineNum = 40763395;BA.debugLine="End Sub";
return "";
}
public String  _webergebnis_webviewstringchange(b4a.example.screenmain __ref,String _value) throws Exception{
__ref = this;
RDebugUtils.currentModule="screenmain";
if (Debug.shouldDelegate(ba, "webergebnis_webviewstringchange", false))
	 {return ((String) Debug.delegate(ba, "webergebnis_webviewstringchange", new Object[] {_value}));}
String _rowstr = "";
int _rowid = 0;
String _sharetext = "";
anywheresoftware.b4a.objects.IntentWrapper _in = null;
String[] _parts = null;
anywheresoftware.b4a.objects.collections.List _neueliste = null;
String _p = "";
RDebugUtils.currentLine=40960000;
 //BA.debugLineNum = 40960000;BA.debugLine="Public Sub webErgebnis_WebViewStringChange(value A";
RDebugUtils.currentLine=40960001;
 //BA.debugLineNum = 40960001;BA.debugLine="If value.StartsWith(\"rowclick\") Then";
if (_value.startsWith("rowclick")) { 
RDebugUtils.currentLine=40960002;
 //BA.debugLineNum = 40960002;BA.debugLine="Dim rowStr As String = value.SubString(8).Trim";
_rowstr = _value.substring((int) (8)).trim();
RDebugUtils.currentLine=40960003;
 //BA.debugLineNum = 40960003;BA.debugLine="If IsNumber(rowStr) Then";
if (__c.IsNumber(_rowstr)) { 
RDebugUtils.currentLine=40960004;
 //BA.debugLineNum = 40960004;BA.debugLine="Dim rowid As Int = rowStr";
_rowid = (int)(Double.parseDouble(_rowstr));
RDebugUtils.currentLine=40960005;
 //BA.debugLineNum = 40960005;BA.debugLine="If rowid > 0 Then";
if (_rowid>0) { 
RDebugUtils.currentLine=40960006;
 //BA.debugLineNum = 40960006;BA.debugLine="PlatzSelected = rowid";
__ref._platzselected /*int*/  = _rowid;
RDebugUtils.currentLine=40960007;
 //BA.debugLineNum = 40960007;BA.debugLine="disableEingabe";
__ref._disableeingabe /*String*/ (null);
RDebugUtils.currentLine=40960008;
 //BA.debugLineNum = 40960008;BA.debugLine="clear";
__ref._clear /*String*/ (null);
RDebugUtils.currentLine=40960009;
 //BA.debugLineNum = 40960009;BA.debugLine="setzePlatz(rowid)";
__ref._setzeplatz /*String*/ (null,_rowid);
 };
 };
 }else 
{RDebugUtils.currentLine=40960012;
 //BA.debugLineNum = 40960012;BA.debugLine="Else if value.StartsWith(\"Print:\") Then";
if (_value.startsWith("Print:")) { 
RDebugUtils.currentLine=40960013;
 //BA.debugLineNum = 40960013;BA.debugLine="Dim shareText As String = value.Replace(\"Print:";
_sharetext = _value.replace("Print: ",__ref._lblverein /*anywheresoftware.b4a.objects.LabelWrapper*/ .getText()+__c.CRLF+__ref._lblveranstaltung /*anywheresoftware.b4a.objects.LabelWrapper*/ .getText()+__c.CRLF+"am: "+__ref._lbldatum /*anywheresoftware.b4a.objects.LabelWrapper*/ .getText()+__c.CRLF);
RDebugUtils.currentLine=40960015;
 //BA.debugLineNum = 40960015;BA.debugLine="Dim in As Intent";
_in = new anywheresoftware.b4a.objects.IntentWrapper();
RDebugUtils.currentLine=40960016;
 //BA.debugLineNum = 40960016;BA.debugLine="in.Initialize(in.ACTION_SEND, \"\")";
_in.Initialize(_in.ACTION_SEND,"");
RDebugUtils.currentLine=40960017;
 //BA.debugLineNum = 40960017;BA.debugLine="in.SetType(\"text/plain\")";
_in.SetType("text/plain");
RDebugUtils.currentLine=40960018;
 //BA.debugLineNum = 40960018;BA.debugLine="in.PutExtra(\"android.intent.extra.TEXT\", shareTe";
_in.PutExtra("android.intent.extra.TEXT",(Object)(_sharetext));
RDebugUtils.currentLine=40960019;
 //BA.debugLineNum = 40960019;BA.debugLine="StartActivity(in)";
__c.StartActivity(ba,(Object)(_in.getObject()));
 }else 
{RDebugUtils.currentLine=40960020;
 //BA.debugLineNum = 40960020;BA.debugLine="Else if value.StartsWith(\"Height\") Then";
if (_value.startsWith("Height")) { 
 }else {
RDebugUtils.currentLine=40960023;
 //BA.debugLineNum = 40960023;BA.debugLine="Dim parts() As String = Regex.Split(\",\", value)";
_parts = __c.Regex.Split(",",_value);
RDebugUtils.currentLine=40960024;
 //BA.debugLineNum = 40960024;BA.debugLine="Dim neueListe As List";
_neueliste = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=40960025;
 //BA.debugLineNum = 40960025;BA.debugLine="neueListe.Initialize";
_neueliste.Initialize();
RDebugUtils.currentLine=40960026;
 //BA.debugLineNum = 40960026;BA.debugLine="For Each p As String In parts";
{
final String[] group24 = _parts;
final int groupLen24 = group24.length
;int index24 = 0;
;
for (; index24 < groupLen24;index24++){
_p = group24[index24];
RDebugUtils.currentLine=40960027;
 //BA.debugLineNum = 40960027;BA.debugLine="neueListe.Add(p)";
_neueliste.Add((Object)(_p));
 }
};
RDebugUtils.currentLine=40960029;
 //BA.debugLineNum = 40960029;BA.debugLine="webviewData = neueListe";
__ref._webviewdata /*anywheresoftware.b4a.objects.collections.List*/  = _neueliste;
RDebugUtils.currentLine=40960031;
 //BA.debugLineNum = 40960031;BA.debugLine="If VSTNGgeschlossen Then";
if (__ref._vstnggeschlossen /*boolean*/ ) { 
RDebugUtils.currentLine=40960032;
 //BA.debugLineNum = 40960032;BA.debugLine="vaEingabe.Visible = False";
__ref._vaeingabe /*anywheresoftware.b4a.objects.PanelWrapper*/ .setVisible(__c.False);
RDebugUtils.currentLine=40960033;
 //BA.debugLineNum = 40960033;BA.debugLine="haDown.Visible = True";
__ref._hadown /*anywheresoftware.b4a.objects.PanelWrapper*/ .setVisible(__c.True);
RDebugUtils.currentLine=40960034;
 //BA.debugLineNum = 40960034;BA.debugLine="btnDown.Visible = False";
__ref._btndown /*anywheresoftware.b4a.objects.ButtonWrapper*/ .setVisible(__c.False);
RDebugUtils.currentLine=40960035;
 //BA.debugLineNum = 40960035;BA.debugLine="UpdateLayoutPositions";
__ref._updatelayoutpositions /*String*/ (null);
 }else {
RDebugUtils.currentLine=40960037;
 //BA.debugLineNum = 40960037;BA.debugLine="RunJS(\"selectRowById(\" & PlatzSelected & \");\")";
__ref._runjs /*String*/ (null,"selectRowById("+BA.NumberToString(__ref._platzselected /*int*/ )+");");
 };
 }}}
;
RDebugUtils.currentLine=40960040;
 //BA.debugLineNum = 40960040;BA.debugLine="startTimer";
__ref._starttimer /*String*/ (null);
RDebugUtils.currentLine=40960041;
 //BA.debugLineNum = 40960041;BA.debugLine="End Sub";
return "";
}
}