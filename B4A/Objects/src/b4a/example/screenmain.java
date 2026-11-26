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
RDebugUtils.currentLine=3014656;
 //BA.debugLineNum = 3014656;BA.debugLine="Public Sub Initialize";
RDebugUtils.currentLine=3014657;
 //BA.debugLineNum = 3014657;BA.debugLine="Teilnehmer.Initialize";
__ref._teilnehmer /*anywheresoftware.b4a.objects.collections.List*/ .Initialize();
RDebugUtils.currentLine=3014658;
 //BA.debugLineNum = 3014658;BA.debugLine="webviewData.Initialize";
__ref._webviewdata /*anywheresoftware.b4a.objects.collections.List*/ .Initialize();
RDebugUtils.currentLine=3014659;
 //BA.debugLineNum = 3014659;BA.debugLine="Status.Initialize";
__ref._status /*anywheresoftware.b4a.objects.collections.Map*/ .Initialize();
RDebugUtils.currentLine=3014660;
 //BA.debugLineNum = 3014660;BA.debugLine="spnItems.Initialize";
__ref._spnitems /*anywheresoftware.b4a.objects.collections.List*/ .Initialize();
RDebugUtils.currentLine=3014661;
 //BA.debugLineNum = 3014661;BA.debugLine="LoadTinyDB";
__ref._loadtinydb /*String*/ (null);
RDebugUtils.currentLine=3014662;
 //BA.debugLineNum = 3014662;BA.debugLine="Uhrzeit.Initialize(\"Uhrzeit\", 300000) ' 1000 * 30";
__ref._uhrzeit /*anywheresoftware.b4a.objects.Timer*/ .Initialize(ba,"Uhrzeit",(long) (300000));
RDebugUtils.currentLine=3014663;
 //BA.debugLineNum = 3014663;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=4915200;
 //BA.debugLineNum = 4915200;BA.debugLine="Private Sub addTeilnehmer";
RDebugUtils.currentLine=4915201;
 //BA.debugLineNum = 4915201;BA.debugLine="Dim tName As String = tbxTeilnehmer.Text.Trim";
_tname = __ref._tbxteilnehmer /*anywheresoftware.b4a.objects.EditTextWrapper*/ .getText().trim();
RDebugUtils.currentLine=4915202;
 //BA.debugLineNum = 4915202;BA.debugLine="If tName <> \"\" And Teilnehmer.IndexOf(tName) = -1";
if ((_tname).equals("") == false && __ref._teilnehmer /*anywheresoftware.b4a.objects.collections.List*/ .IndexOf((Object)(_tname))==-1) { 
RDebugUtils.currentLine=4915203;
 //BA.debugLineNum = 4915203;BA.debugLine="addTLN = True";
__ref._addtln /*boolean*/  = __c.True;
RDebugUtils.currentLine=4915204;
 //BA.debugLineNum = 4915204;BA.debugLine="Teilnehmer.Add(tName)";
__ref._teilnehmer /*anywheresoftware.b4a.objects.collections.List*/ .Add((Object)(_tname));
RDebugUtils.currentLine=4915205;
 //BA.debugLineNum = 4915205;BA.debugLine="Teilnehmer.Sort(True)";
__ref._teilnehmer /*anywheresoftware.b4a.objects.collections.List*/ .Sort(__c.True);
RDebugUtils.currentLine=4915206;
 //BA.debugLineNum = 4915206;BA.debugLine="DBPut(\"letzteÄnderung\", CreateMap(\"Änderung\": Tr";
__ref._dbput /*String*/ (null,"letzteÄnderung",(Object)(__c.createMap(new Object[] {(Object)("Änderung"),(Object)(__c.True),(Object)("Datum"),(Object)(__c.DateTime.getNow())}).getObject()));
RDebugUtils.currentLine=4915207;
 //BA.debugLineNum = 4915207;BA.debugLine="DBPut(\"Teilnehmer\", Teilnehmer)";
__ref._dbput /*String*/ (null,"Teilnehmer",(Object)(__ref._teilnehmer /*anywheresoftware.b4a.objects.collections.List*/ .getObject()));
RDebugUtils.currentLine=4915209;
 //BA.debugLineNum = 4915209;BA.debugLine="Dim nextId As Int = TLNlastID.Replace(\"t\", \"\") +";
_nextid = (int) ((double)(Double.parseDouble(__ref._tlnlastid /*String*/ .replace("t","")))+1);
RDebugUtils.currentLine=4915210;
 //BA.debugLineNum = 4915210;BA.debugLine="Dim DBkey As String = \"t\" & nextId";
_dbkey = "t"+BA.NumberToString(_nextid);
RDebugUtils.currentLine=4915211;
 //BA.debugLineNum = 4915211;BA.debugLine="TLNlastID = DBkey";
__ref._tlnlastid /*String*/  = _dbkey;
RDebugUtils.currentLine=4915213;
 //BA.debugLineNum = 4915213;BA.debugLine="Dim tln As Map = CreateMap(\"Name\": tName)";
_tln = new anywheresoftware.b4a.objects.collections.Map();
_tln = __c.createMap(new Object[] {(Object)("Name"),(Object)(_tname)});
RDebugUtils.currentLine=4915214;
 //BA.debugLineNum = 4915214;BA.debugLine="CurrentWebUrl = URLteilnehmer & \"/\" & DBkey & \".";
__ref._currentweburl /*String*/  = __ref._urlteilnehmer /*String*/ +"/"+_dbkey+".json?auth="+BA.ObjectToString(__ref._status /*anywheresoftware.b4a.objects.collections.Map*/ .GetDefault((Object)("idToken"),(Object)("")));
RDebugUtils.currentLine=4915215;
 //BA.debugLineNum = 4915215;BA.debugLine="DBdatenTyp = \"addTLN\"";
__ref._dbdatentyp /*String*/  = "addTLN";
RDebugUtils.currentLine=4915217;
 //BA.debugLineNum = 4915217;BA.debugLine="Dim jg As JSONGenerator";
_jg = new anywheresoftware.b4a.objects.collections.JSONParser.JSONGenerator();
RDebugUtils.currentLine=4915218;
 //BA.debugLineNum = 4915218;BA.debugLine="jg.Initialize(tln)";
_jg.Initialize(_tln);
RDebugUtils.currentLine=4915219;
 //BA.debugLineNum = 4915219;BA.debugLine="PutTextWeb(jg.ToString)";
__ref._puttextweb /*String*/ (null,_jg.ToString());
 };
RDebugUtils.currentLine=4915221;
 //BA.debugLineNum = 4915221;BA.debugLine="End Sub";
return "";
}
public String  _dbput(b4a.example.screenmain __ref,String _key,Object _value) throws Exception{
__ref = this;
RDebugUtils.currentModule="screenmain";
if (Debug.shouldDelegate(ba, "dbput", false))
	 {return ((String) Debug.delegate(ba, "dbput", new Object[] {_key,_value}));}
anywheresoftware.b4a.objects.collections.JSONParser.JSONGenerator _jg = null;
RDebugUtils.currentLine=7340032;
 //BA.debugLineNum = 7340032;BA.debugLine="Private Sub DBPut(Key As String, Value As Object)";
RDebugUtils.currentLine=7340033;
 //BA.debugLineNum = 7340033;BA.debugLine="If Value Is Map Then";
if (_value instanceof java.util.Map) { 
RDebugUtils.currentLine=7340034;
 //BA.debugLineNum = 7340034;BA.debugLine="Dim jg As JSONGenerator";
_jg = new anywheresoftware.b4a.objects.collections.JSONParser.JSONGenerator();
RDebugUtils.currentLine=7340035;
 //BA.debugLineNum = 7340035;BA.debugLine="jg.Initialize(Value)";
_jg.Initialize((anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_value)));
RDebugUtils.currentLine=7340036;
 //BA.debugLineNum = 7340036;BA.debugLine="DBVerein.Put(Key, \"JSON_MAP:\" & jg.ToString)";
__ref._dbverein /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)(_key),(Object)("JSON_MAP:"+_jg.ToString()));
 }else 
{RDebugUtils.currentLine=7340037;
 //BA.debugLineNum = 7340037;BA.debugLine="Else If Value Is List Then";
if (_value instanceof java.util.List) { 
RDebugUtils.currentLine=7340038;
 //BA.debugLineNum = 7340038;BA.debugLine="Dim jg As JSONGenerator";
_jg = new anywheresoftware.b4a.objects.collections.JSONParser.JSONGenerator();
RDebugUtils.currentLine=7340039;
 //BA.debugLineNum = 7340039;BA.debugLine="jg.Initialize2(Value)";
_jg.Initialize2((anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_value)));
RDebugUtils.currentLine=7340040;
 //BA.debugLineNum = 7340040;BA.debugLine="DBVerein.Put(Key, \"JSON_LIST:\" & jg.ToString)";
__ref._dbverein /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)(_key),(Object)("JSON_LIST:"+_jg.ToString()));
 }else {
RDebugUtils.currentLine=7340042;
 //BA.debugLineNum = 7340042;BA.debugLine="DBVerein.Put(Key, Value)";
__ref._dbverein /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)(_key),_value);
 }}
;
RDebugUtils.currentLine=7340044;
 //BA.debugLineNum = 7340044;BA.debugLine="File.WriteMap(File.DirInternal, DBFileName, DBVer";
__c.File.WriteMap(__c.File.getDirInternal(),__ref._dbfilename /*String*/ ,__ref._dbverein /*anywheresoftware.b4a.objects.collections.Map*/ );
RDebugUtils.currentLine=7340045;
 //BA.debugLineNum = 7340045;BA.debugLine="End Sub";
return "";
}
public String  _puttextweb(b4a.example.screenmain __ref,String _text) throws Exception{
__ref = this;
RDebugUtils.currentModule="screenmain";
if (Debug.shouldDelegate(ba, "puttextweb", false))
	 {return ((String) Debug.delegate(ba, "puttextweb", new Object[] {_text}));}
RDebugUtils.currentLine=5242880;
 //BA.debugLineNum = 5242880;BA.debugLine="Private Sub PutTextWeb(text As String)";
RDebugUtils.currentLine=5242881;
 //BA.debugLineNum = 5242881;BA.debugLine="If True = Status.GetDefault(\"ProgOffline\", True)";
if (__c.True==BA.ObjectToBoolean(__ref._status /*anywheresoftware.b4a.objects.collections.Map*/ .GetDefault((Object)("ProgOffline"),(Object)(__c.True)))) { 
RDebugUtils.currentLine=5242882;
 //BA.debugLineNum = 5242882;BA.debugLine="GotTextOffline";
__ref._gottextoffline /*String*/ (null);
 }else {
RDebugUtils.currentLine=5242884;
 //BA.debugLineNum = 5242884;BA.debugLine="ExecuteHttp(\"PUT\", CurrentWebUrl, text)";
__ref._executehttp /*void*/ (null,"PUT",__ref._currentweburl /*String*/ ,_text);
 };
RDebugUtils.currentLine=5242886;
 //BA.debugLineNum = 5242886;BA.debugLine="End Sub";
return "";
}
public String  _b4xpage_appear(b4a.example.screenmain __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="screenmain";
if (Debug.shouldDelegate(ba, "b4xpage_appear", false))
	 {return ((String) Debug.delegate(ba, "b4xpage_appear", null));}
RDebugUtils.currentLine=3145728;
 //BA.debugLineNum = 3145728;BA.debugLine="Public Sub B4XPage_Appear";
RDebugUtils.currentLine=3145730;
 //BA.debugLineNum = 3145730;BA.debugLine="If B4XPages.MainPage.Status.IsInitialized And B4X";
if (_b4xpages._mainpage /*b4a.example.b4xmainpage*/ (ba)._status /*anywheresoftware.b4a.objects.collections.Map*/ .IsInitialized() && _b4xpages._mainpage /*b4a.example.b4xmainpage*/ (ba)._status /*anywheresoftware.b4a.objects.collections.Map*/ .getSize()>0) { 
RDebugUtils.currentLine=3145731;
 //BA.debugLineNum = 3145731;BA.debugLine="Status = B4XPages.MainPage.Status";
__ref._status /*anywheresoftware.b4a.objects.collections.Map*/  = _b4xpages._mainpage /*b4a.example.b4xmainpage*/ (ba)._status /*anywheresoftware.b4a.objects.collections.Map*/ ;
 };
RDebugUtils.currentLine=3145734;
 //BA.debugLineNum = 3145734;BA.debugLine="colorgreen = lblVerein.TextColor";
__ref._colorgreen /*int*/  = __ref._lblverein /*anywheresoftware.b4a.objects.LabelWrapper*/ .getTextColor();
RDebugUtils.currentLine=3145736;
 //BA.debugLineNum = 3145736;BA.debugLine="If Status.GetDefault(\"idToken\", \"\") = \"\" Then";
if ((__ref._status /*anywheresoftware.b4a.objects.collections.Map*/ .GetDefault((Object)("idToken"),(Object)(""))).equals((Object)(""))) { 
RDebugUtils.currentLine=3145737;
 //BA.debugLineNum = 3145737;BA.debugLine="B4XPages.ClosePage(Me)";
_b4xpages._closepage /*String*/ (ba,this);
RDebugUtils.currentLine=3145738;
 //BA.debugLineNum = 3145738;BA.debugLine="Return";
if (true) return "";
 };
RDebugUtils.currentLine=3145741;
 //BA.debugLineNum = 3145741;BA.debugLine="If False = Status.GetDefault(\"debug\", False) Then";
if (__c.False==BA.ObjectToBoolean(__ref._status /*anywheresoftware.b4a.objects.collections.Map*/ .GetDefault((Object)("debug"),(Object)(__c.False)))) { 
RDebugUtils.currentLine=3145742;
 //BA.debugLineNum = 3145742;BA.debugLine="initialisiere";
__ref._initialisiere /*void*/ (null);
 };
RDebugUtils.currentLine=3145744;
 //BA.debugLineNum = 3145744;BA.debugLine="startTimer";
__ref._starttimer /*String*/ (null);
RDebugUtils.currentLine=3145745;
 //BA.debugLineNum = 3145745;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=3604481;
 //BA.debugLineNum = 3604481;BA.debugLine="Teilnehmer.Initialize";
__ref._teilnehmer /*anywheresoftware.b4a.objects.collections.List*/ .Initialize();
RDebugUtils.currentLine=3604482;
 //BA.debugLineNum = 3604482;BA.debugLine="DBdatenTyp = \"\"";
__ref._dbdatentyp /*String*/  = "";
RDebugUtils.currentLine=3604483;
 //BA.debugLineNum = 3604483;BA.debugLine="TLNlastID = \"t0\"";
__ref._tlnlastid /*String*/  = "t0";
RDebugUtils.currentLine=3604484;
 //BA.debugLineNum = 3604484;BA.debugLine="webviewData.Initialize";
__ref._webviewdata /*anywheresoftware.b4a.objects.collections.List*/ .Initialize();
RDebugUtils.currentLine=3604485;
 //BA.debugLineNum = 3604485;BA.debugLine="PlatzSelected = 1";
__ref._platzselected /*int*/  = (int) (1);
RDebugUtils.currentLine=3604486;
 //BA.debugLineNum = 3604486;BA.debugLine="dochange = True";
__ref._dochange /*boolean*/  = parent.__c.True;
RDebugUtils.currentLine=3604487;
 //BA.debugLineNum = 3604487;BA.debugLine="addTLN = False";
__ref._addtln /*boolean*/  = parent.__c.False;
RDebugUtils.currentLine=3604488;
 //BA.debugLineNum = 3604488;BA.debugLine="VSTNGgeschlossen = False";
__ref._vstnggeschlossen /*boolean*/  = parent.__c.False;
RDebugUtils.currentLine=3604490;
 //BA.debugLineNum = 3604490;BA.debugLine="disableEingabe";
__ref._disableeingabe /*String*/ (null);
RDebugUtils.currentLine=3604491;
 //BA.debugLineNum = 3604491;BA.debugLine="setzeHeaderfromDB";
__ref._setzeheaderfromdb /*String*/ (null);
RDebugUtils.currentLine=3604492;
 //BA.debugLineNum = 3604492;BA.debugLine="changeURL";
__ref._changeurl /*String*/ (null);
RDebugUtils.currentLine=3604493;
 //BA.debugLineNum = 3604493;BA.debugLine="clear";
__ref._clear /*String*/ (null);
RDebugUtils.currentLine=3604495;
 //BA.debugLineNum = 3604495;BA.debugLine="haDown.Visible = False";
__ref._hadown /*anywheresoftware.b4a.objects.PanelWrapper*/ .setVisible(parent.__c.False);
RDebugUtils.currentLine=3604496;
 //BA.debugLineNum = 3604496;BA.debugLine="vaEingabe.Visible = True";
__ref._vaeingabe /*anywheresoftware.b4a.objects.PanelWrapper*/ .setVisible(parent.__c.True);
RDebugUtils.currentLine=3604497;
 //BA.debugLineNum = 3604497;BA.debugLine="vaErgEingabe.Visible = True";
__ref._vaergeingabe /*anywheresoftware.b4a.objects.PanelWrapper*/ .setVisible(parent.__c.True);
RDebugUtils.currentLine=3604498;
 //BA.debugLineNum = 3604498;BA.debugLine="vaFDJ.Visible = False";
__ref._vafdj /*anywheresoftware.b4a.objects.PanelWrapper*/ .setVisible(parent.__c.False);
RDebugUtils.currentLine=3604499;
 //BA.debugLineNum = 3604499;BA.debugLine="UpdateLayoutPositions";
__ref._updatelayoutpositions /*String*/ (null);
RDebugUtils.currentLine=3604501;
 //BA.debugLineNum = 3604501;BA.debugLine="lsvName.Clear";
__ref._lsvname /*anywheresoftware.b4a.objects.ListViewWrapper*/ .Clear();
RDebugUtils.currentLine=3604502;
 //BA.debugLineNum = 3604502;BA.debugLine="lsvName.Visible = False";
__ref._lsvname /*anywheresoftware.b4a.objects.ListViewWrapper*/ .setVisible(parent.__c.False);
RDebugUtils.currentLine=3604503;
 //BA.debugLineNum = 3604503;BA.debugLine="btnCloseVstng.Enabled = True";
__ref._btnclosevstng /*anywheresoftware.b4a.objects.ButtonWrapper*/ .setEnabled(parent.__c.True);
RDebugUtils.currentLine=3604504;
 //BA.debugLineNum = 3604504;BA.debugLine="SetButtonImageSafe(btnCloseVstng, \"close.png\", \"�";
__ref._setbuttonimagesafe /*String*/ (null,__ref._btnclosevstng /*anywheresoftware.b4a.objects.ButtonWrapper*/ ,"close.png","🔒");
RDebugUtils.currentLine=3604506;
 //BA.debugLineNum = 3604506;BA.debugLine="spnPlatz.Clear";
__ref._spnplatz /*anywheresoftware.b4a.objects.SpinnerWrapper*/ .Clear();
RDebugUtils.currentLine=3604507;
 //BA.debugLineNum = 3604507;BA.debugLine="spnItems.Clear";
__ref._spnitems /*anywheresoftware.b4a.objects.collections.List*/ .Clear();
RDebugUtils.currentLine=3604508;
 //BA.debugLineNum = 3604508;BA.debugLine="Dim anzahl As Int = DBGet(\"VeranstaltungAnzahl\",";
_anzahl = (int)(BA.ObjectToNumber(__ref._dbget /*Object*/ (null,"VeranstaltungAnzahl",(Object)("25"))));
RDebugUtils.currentLine=3604509;
 //BA.debugLineNum = 3604509;BA.debugLine="For i = 1 To anzahl";
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
RDebugUtils.currentLine=3604510;
 //BA.debugLineNum = 3604510;BA.debugLine="spnPlatz.Add(i)";
__ref._spnplatz /*anywheresoftware.b4a.objects.SpinnerWrapper*/ .Add(BA.NumberToString(_i));
RDebugUtils.currentLine=3604511;
 //BA.debugLineNum = 3604511;BA.debugLine="spnItems.Add(i)";
__ref._spnitems /*anywheresoftware.b4a.objects.collections.List*/ .Add((Object)(_i));
 if (true) break;
if (true) break;

case 4:
//C
this.state = 5;
;
RDebugUtils.currentLine=3604514;
 //BA.debugLineNum = 3604514;BA.debugLine="Dim offline As Boolean = Status.GetDefault(\"ProgO";
_offline = BA.ObjectToBoolean(__ref._status /*anywheresoftware.b4a.objects.collections.Map*/ .GetDefault((Object)("ProgOffline"),(Object)(parent.__c.True)));
RDebugUtils.currentLine=3604515;
 //BA.debugLineNum = 3604515;BA.debugLine="Dim vID As String = DBGet(\"VeranstaltungID\", \"v0\"";
_vid = BA.ObjectToString(__ref._dbget /*Object*/ (null,"VeranstaltungID",(Object)("v0")));
RDebugUtils.currentLine=3604516;
 //BA.debugLineNum = 3604516;BA.debugLine="If vID = \"v0\" Then";
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
RDebugUtils.currentLine=3604517;
 //BA.debugLineNum = 3604517;BA.debugLine="lblVeranstaltung.Text = \"- noch nicht ausgewählt";
__ref._lblveranstaltung /*anywheresoftware.b4a.objects.LabelWrapper*/ .setText(BA.ObjectToCharSequence("- noch nicht ausgewählt -"));
RDebugUtils.currentLine=3604518;
 //BA.debugLineNum = 3604518;BA.debugLine="lblDatum.Text = \"- bitte auswählen -\"";
__ref._lbldatum /*anywheresoftware.b4a.objects.LabelWrapper*/ .setText(BA.ObjectToCharSequence("- bitte auswählen -"));
RDebugUtils.currentLine=3604519;
 //BA.debugLineNum = 3604519;BA.debugLine="If offline Then";
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
RDebugUtils.currentLine=3604520;
 //BA.debugLineNum = 3604520;BA.debugLine="btnSettings.Visible = False";
__ref._btnsettings /*anywheresoftware.b4a.objects.ButtonWrapper*/ .setVisible(parent.__c.False);
RDebugUtils.currentLine=3604521;
 //BA.debugLineNum = 3604521;BA.debugLine="Msgbox2Async(\"Es wurde noch keine Veranstaltung";
parent.__c.Msgbox2Async(BA.ObjectToCharSequence("Es wurde noch keine Veranstaltung angelegt oder ausgewählt. Da keine Internet-Verbindung besteht, kann das Programm nicht weiter ausgeführt werden."),BA.ObjectToCharSequence("Veranstaltung fehlt"),"Beenden","","",(anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper(), (android.graphics.Bitmap)(parent.__c.Null)),ba,parent.__c.False);
RDebugUtils.currentLine=3604522;
 //BA.debugLineNum = 3604522;BA.debugLine="Wait For Msgbox_Result (res As Int)";
parent.__c.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "screenmain", "initialisiere"), null);
this.state = 31;
return;
case 31:
//C
this.state = 11;
_res = (Integer) result[1];
;
RDebugUtils.currentLine=3604523;
 //BA.debugLineNum = 3604523;BA.debugLine="If res = DialogResponse.POSITIVE Then ExitAppli";
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
RDebugUtils.currentLine=3604525;
 //BA.debugLineNum = 3604525;BA.debugLine="Msgbox2Async(\"Es wurde noch keine Veranstaltung";
parent.__c.Msgbox2Async(BA.ObjectToCharSequence("Es wurde noch keine Veranstaltung angelegt oder ausgewählt. Bitte in den Einstellungen Veranstaltung auswählen."),BA.ObjectToCharSequence("Veranstaltung fehlt"),"anlegen/auswählen","","",(anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper(), (android.graphics.Bitmap)(parent.__c.Null)),ba,parent.__c.False);
RDebugUtils.currentLine=3604526;
 //BA.debugLineNum = 3604526;BA.debugLine="Wait For Msgbox_Result (res As Int)";
parent.__c.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "screenmain", "initialisiere"), null);
this.state = 32;
return;
case 32:
//C
this.state = 19;
_res = (Integer) result[1];
;
RDebugUtils.currentLine=3604527;
 //BA.debugLineNum = 3604527;BA.debugLine="If res = DialogResponse.POSITIVE Then OpenSetti";
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
RDebugUtils.currentLine=3604530;
 //BA.debugLineNum = 3604530;BA.debugLine="holeTLN";
__ref._holetln /*String*/ (null);
 if (true) break;

case 28:
//C
this.state = -1;
;
RDebugUtils.currentLine=3604532;
 //BA.debugLineNum = 3604532;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=6946816;
 //BA.debugLineNum = 6946816;BA.debugLine="Private Sub startTimer";
RDebugUtils.currentLine=6946817;
 //BA.debugLineNum = 6946817;BA.debugLine="Uhrzeit.Enabled = False";
__ref._uhrzeit /*anywheresoftware.b4a.objects.Timer*/ .setEnabled(__c.False);
RDebugUtils.currentLine=6946818;
 //BA.debugLineNum = 6946818;BA.debugLine="Uhrzeit.Interval = 1000 * 300";
__ref._uhrzeit /*anywheresoftware.b4a.objects.Timer*/ .setInterval((long) (1000*300));
RDebugUtils.currentLine=6946819;
 //BA.debugLineNum = 6946819;BA.debugLine="Uhrzeit.Enabled = True";
__ref._uhrzeit /*anywheresoftware.b4a.objects.Timer*/ .setEnabled(__c.True);
RDebugUtils.currentLine=6946820;
 //BA.debugLineNum = 6946820;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=3211265;
 //BA.debugLineNum = 3211265;BA.debugLine="Uhrzeit.Enabled = False";
__ref._uhrzeit /*anywheresoftware.b4a.objects.Timer*/ .setEnabled(parent.__c.False);
RDebugUtils.currentLine=3211266;
 //BA.debugLineNum = 3211266;BA.debugLine="Return True";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.True));return;};
RDebugUtils.currentLine=3211267;
 //BA.debugLineNum = 3211267;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=3080192;
 //BA.debugLineNum = 3080192;BA.debugLine="Private Sub B4XPage_Created (Root1 As B4XView)";
RDebugUtils.currentLine=3080193;
 //BA.debugLineNum = 3080193;BA.debugLine="Root = Root1";
__ref._root /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = _root1;
RDebugUtils.currentLine=3080194;
 //BA.debugLineNum = 3080194;BA.debugLine="B4XPages.SetTitle(Me, \"Wertungslisten-App by sthn";
_b4xpages._settitle /*String*/ (ba,this,(Object)("Wertungslisten-App by sthnet.de"));
RDebugUtils.currentLine=3080195;
 //BA.debugLineNum = 3080195;BA.debugLine="BuildUI";
__ref._buildui /*String*/ (null);
RDebugUtils.currentLine=3080196;
 //BA.debugLineNum = 3080196;BA.debugLine="B4XPage_Appear";
__ref._b4xpage_appear /*String*/ (null);
RDebugUtils.currentLine=3080197;
 //BA.debugLineNum = 3080197;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=3276800;
 //BA.debugLineNum = 3276800;BA.debugLine="Private Sub BuildUI";
RDebugUtils.currentLine=3276801;
 //BA.debugLineNum = 3276801;BA.debugLine="Root.Color = Colors.White";
__ref._root /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setColor(__c.Colors.White);
RDebugUtils.currentLine=3276804;
 //BA.debugLineNum = 3276804;BA.debugLine="Dim pnlHeader As Panel";
_pnlheader = new anywheresoftware.b4a.objects.PanelWrapper();
RDebugUtils.currentLine=3276805;
 //BA.debugLineNum = 3276805;BA.debugLine="pnlHeader.Initialize(\"\")";
_pnlheader.Initialize(ba,"");
RDebugUtils.currentLine=3276806;
 //BA.debugLineNum = 3276806;BA.debugLine="pnlHeader.Color = Colors.White";
_pnlheader.setColor(__c.Colors.White);
RDebugUtils.currentLine=3276807;
 //BA.debugLineNum = 3276807;BA.debugLine="Root.AddView(pnlHeader, 0, 0, 100%x, 80dip)";
__ref._root /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .AddView((android.view.View)(_pnlheader.getObject()),(int) (0),(int) (0),__c.PerXToCurrent((float) (100),ba),__c.DipToCurrent((int) (80)));
RDebugUtils.currentLine=3276809;
 //BA.debugLineNum = 3276809;BA.debugLine="Dim lblW1 As Int = 115dip";
_lblw1 = __c.DipToCurrent((int) (115));
RDebugUtils.currentLine=3276810;
 //BA.debugLineNum = 3276810;BA.debugLine="Dim lblW2 As Int = 100%x - lblW1 - 48dip";
_lblw2 = (int) (__c.PerXToCurrent((float) (100),ba)-_lblw1-__c.DipToCurrent((int) (48)));
RDebugUtils.currentLine=3276812;
 //BA.debugLineNum = 3276812;BA.debugLine="Dim Label11 As Label";
_label11 = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=3276813;
 //BA.debugLineNum = 3276813;BA.debugLine="Label11.Initialize(\"\")";
_label11.Initialize(ba,"");
RDebugUtils.currentLine=3276814;
 //BA.debugLineNum = 3276814;BA.debugLine="Label11.Text = \"Verein: \"";
_label11.setText(BA.ObjectToCharSequence("Verein: "));
RDebugUtils.currentLine=3276815;
 //BA.debugLineNum = 3276815;BA.debugLine="Label11.Typeface = Typeface.DEFAULT_BOLD";
_label11.setTypeface(__c.Typeface.DEFAULT_BOLD);
RDebugUtils.currentLine=3276816;
 //BA.debugLineNum = 3276816;BA.debugLine="Label11.TextColor = Colors.Black";
_label11.setTextColor(__c.Colors.Black);
RDebugUtils.currentLine=3276817;
 //BA.debugLineNum = 3276817;BA.debugLine="Label11.Gravity = Gravity.RIGHT + Gravity.CENTER_";
_label11.setGravity((int) (__c.Gravity.RIGHT+__c.Gravity.CENTER_VERTICAL));
RDebugUtils.currentLine=3276818;
 //BA.debugLineNum = 3276818;BA.debugLine="pnlHeader.AddView(Label11, 5dip, 4dip, lblW1, 24d";
_pnlheader.AddView((android.view.View)(_label11.getObject()),__c.DipToCurrent((int) (5)),__c.DipToCurrent((int) (4)),_lblw1,__c.DipToCurrent((int) (24)));
RDebugUtils.currentLine=3276820;
 //BA.debugLineNum = 3276820;BA.debugLine="lblVerein.Initialize(\"\")";
__ref._lblverein /*anywheresoftware.b4a.objects.LabelWrapper*/ .Initialize(ba,"");
RDebugUtils.currentLine=3276821;
 //BA.debugLineNum = 3276821;BA.debugLine="lblVerein.Text = \"-Vereinsbezeichnung-\"";
__ref._lblverein /*anywheresoftware.b4a.objects.LabelWrapper*/ .setText(BA.ObjectToCharSequence("-Vereinsbezeichnung-"));
RDebugUtils.currentLine=3276822;
 //BA.debugLineNum = 3276822;BA.debugLine="lblVerein.Typeface = Typeface.DEFAULT_BOLD";
__ref._lblverein /*anywheresoftware.b4a.objects.LabelWrapper*/ .setTypeface(__c.Typeface.DEFAULT_BOLD);
RDebugUtils.currentLine=3276823;
 //BA.debugLineNum = 3276823;BA.debugLine="lblVerein.TextColor = 0xFF16AA16";
__ref._lblverein /*anywheresoftware.b4a.objects.LabelWrapper*/ .setTextColor(((int)0xff16aa16));
RDebugUtils.currentLine=3276824;
 //BA.debugLineNum = 3276824;BA.debugLine="lblVerein.Gravity = Gravity.LEFT + Gravity.CENTER";
__ref._lblverein /*anywheresoftware.b4a.objects.LabelWrapper*/ .setGravity((int) (__c.Gravity.LEFT+__c.Gravity.CENTER_VERTICAL));
RDebugUtils.currentLine=3276825;
 //BA.debugLineNum = 3276825;BA.debugLine="pnlHeader.AddView(lblVerein, lblW1 + 8dip, 4dip,";
_pnlheader.AddView((android.view.View)(__ref._lblverein /*anywheresoftware.b4a.objects.LabelWrapper*/ .getObject()),(int) (_lblw1+__c.DipToCurrent((int) (8))),__c.DipToCurrent((int) (4)),_lblw2,__c.DipToCurrent((int) (24)));
RDebugUtils.currentLine=3276827;
 //BA.debugLineNum = 3276827;BA.debugLine="Dim Label12 As Label";
_label12 = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=3276828;
 //BA.debugLineNum = 3276828;BA.debugLine="Label12.Initialize(\"\")";
_label12.Initialize(ba,"");
RDebugUtils.currentLine=3276829;
 //BA.debugLineNum = 3276829;BA.debugLine="Label12.Text = \"Veranstaltung:\"";
_label12.setText(BA.ObjectToCharSequence("Veranstaltung:"));
RDebugUtils.currentLine=3276830;
 //BA.debugLineNum = 3276830;BA.debugLine="Label12.Typeface = Typeface.DEFAULT_BOLD";
_label12.setTypeface(__c.Typeface.DEFAULT_BOLD);
RDebugUtils.currentLine=3276831;
 //BA.debugLineNum = 3276831;BA.debugLine="Label12.TextColor = Colors.Black";
_label12.setTextColor(__c.Colors.Black);
RDebugUtils.currentLine=3276832;
 //BA.debugLineNum = 3276832;BA.debugLine="Label12.Gravity = Gravity.RIGHT + Gravity.CENTER_";
_label12.setGravity((int) (__c.Gravity.RIGHT+__c.Gravity.CENTER_VERTICAL));
RDebugUtils.currentLine=3276833;
 //BA.debugLineNum = 3276833;BA.debugLine="pnlHeader.AddView(Label12, 5dip, 28dip, lblW1, 24";
_pnlheader.AddView((android.view.View)(_label12.getObject()),__c.DipToCurrent((int) (5)),__c.DipToCurrent((int) (28)),_lblw1,__c.DipToCurrent((int) (24)));
RDebugUtils.currentLine=3276835;
 //BA.debugLineNum = 3276835;BA.debugLine="lblVeranstaltung.Initialize(\"\")";
__ref._lblveranstaltung /*anywheresoftware.b4a.objects.LabelWrapper*/ .Initialize(ba,"");
RDebugUtils.currentLine=3276836;
 //BA.debugLineNum = 3276836;BA.debugLine="lblVeranstaltung.Text = \"-Veranstaltung-\"";
__ref._lblveranstaltung /*anywheresoftware.b4a.objects.LabelWrapper*/ .setText(BA.ObjectToCharSequence("-Veranstaltung-"));
RDebugUtils.currentLine=3276837;
 //BA.debugLineNum = 3276837;BA.debugLine="lblVeranstaltung.Typeface = Typeface.DEFAULT_BOLD";
__ref._lblveranstaltung /*anywheresoftware.b4a.objects.LabelWrapper*/ .setTypeface(__c.Typeface.DEFAULT_BOLD);
RDebugUtils.currentLine=3276838;
 //BA.debugLineNum = 3276838;BA.debugLine="lblVeranstaltung.TextColor = 0xFF16AA16";
__ref._lblveranstaltung /*anywheresoftware.b4a.objects.LabelWrapper*/ .setTextColor(((int)0xff16aa16));
RDebugUtils.currentLine=3276839;
 //BA.debugLineNum = 3276839;BA.debugLine="lblVeranstaltung.Gravity = Gravity.LEFT + Gravity";
__ref._lblveranstaltung /*anywheresoftware.b4a.objects.LabelWrapper*/ .setGravity((int) (__c.Gravity.LEFT+__c.Gravity.CENTER_VERTICAL));
RDebugUtils.currentLine=3276840;
 //BA.debugLineNum = 3276840;BA.debugLine="pnlHeader.AddView(lblVeranstaltung, lblW1 + 8dip,";
_pnlheader.AddView((android.view.View)(__ref._lblveranstaltung /*anywheresoftware.b4a.objects.LabelWrapper*/ .getObject()),(int) (_lblw1+__c.DipToCurrent((int) (8))),__c.DipToCurrent((int) (28)),_lblw2,__c.DipToCurrent((int) (24)));
RDebugUtils.currentLine=3276842;
 //BA.debugLineNum = 3276842;BA.debugLine="Dim Label13 As Label";
_label13 = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=3276843;
 //BA.debugLineNum = 3276843;BA.debugLine="Label13.Initialize(\"\")";
_label13.Initialize(ba,"");
RDebugUtils.currentLine=3276844;
 //BA.debugLineNum = 3276844;BA.debugLine="Label13.Text = \"Datum:\"";
_label13.setText(BA.ObjectToCharSequence("Datum:"));
RDebugUtils.currentLine=3276845;
 //BA.debugLineNum = 3276845;BA.debugLine="Label13.Typeface = Typeface.DEFAULT_BOLD";
_label13.setTypeface(__c.Typeface.DEFAULT_BOLD);
RDebugUtils.currentLine=3276846;
 //BA.debugLineNum = 3276846;BA.debugLine="Label13.TextColor = Colors.Black";
_label13.setTextColor(__c.Colors.Black);
RDebugUtils.currentLine=3276847;
 //BA.debugLineNum = 3276847;BA.debugLine="Label13.Gravity = Gravity.RIGHT + Gravity.CENTER_";
_label13.setGravity((int) (__c.Gravity.RIGHT+__c.Gravity.CENTER_VERTICAL));
RDebugUtils.currentLine=3276848;
 //BA.debugLineNum = 3276848;BA.debugLine="pnlHeader.AddView(Label13, 5dip, 52dip, lblW1, 24";
_pnlheader.AddView((android.view.View)(_label13.getObject()),__c.DipToCurrent((int) (5)),__c.DipToCurrent((int) (52)),_lblw1,__c.DipToCurrent((int) (24)));
RDebugUtils.currentLine=3276850;
 //BA.debugLineNum = 3276850;BA.debugLine="lblDatum.Initialize(\"\")";
__ref._lbldatum /*anywheresoftware.b4a.objects.LabelWrapper*/ .Initialize(ba,"");
RDebugUtils.currentLine=3276851;
 //BA.debugLineNum = 3276851;BA.debugLine="lblDatum.Text = \"-Datum-\"";
__ref._lbldatum /*anywheresoftware.b4a.objects.LabelWrapper*/ .setText(BA.ObjectToCharSequence("-Datum-"));
RDebugUtils.currentLine=3276852;
 //BA.debugLineNum = 3276852;BA.debugLine="lblDatum.Typeface = Typeface.DEFAULT_BOLD";
__ref._lbldatum /*anywheresoftware.b4a.objects.LabelWrapper*/ .setTypeface(__c.Typeface.DEFAULT_BOLD);
RDebugUtils.currentLine=3276853;
 //BA.debugLineNum = 3276853;BA.debugLine="lblDatum.TextColor = 0xFF16AA16";
__ref._lbldatum /*anywheresoftware.b4a.objects.LabelWrapper*/ .setTextColor(((int)0xff16aa16));
RDebugUtils.currentLine=3276854;
 //BA.debugLineNum = 3276854;BA.debugLine="lblDatum.Gravity = Gravity.LEFT + Gravity.CENTER_";
__ref._lbldatum /*anywheresoftware.b4a.objects.LabelWrapper*/ .setGravity((int) (__c.Gravity.LEFT+__c.Gravity.CENTER_VERTICAL));
RDebugUtils.currentLine=3276855;
 //BA.debugLineNum = 3276855;BA.debugLine="pnlHeader.AddView(lblDatum, lblW1 + 8dip, 52dip,";
_pnlheader.AddView((android.view.View)(__ref._lbldatum /*anywheresoftware.b4a.objects.LabelWrapper*/ .getObject()),(int) (_lblw1+__c.DipToCurrent((int) (8))),__c.DipToCurrent((int) (52)),_lblw2,__c.DipToCurrent((int) (24)));
RDebugUtils.currentLine=3276857;
 //BA.debugLineNum = 3276857;BA.debugLine="btnSettings.Initialize(\"btnSettings\")";
__ref._btnsettings /*anywheresoftware.b4a.objects.ButtonWrapper*/ .Initialize(ba,"btnSettings");
RDebugUtils.currentLine=3276858;
 //BA.debugLineNum = 3276858;BA.debugLine="SetButtonImageSafe(btnSettings, \"3Punkte.png\", \"⋮";
__ref._setbuttonimagesafe /*String*/ (null,__ref._btnsettings /*anywheresoftware.b4a.objects.ButtonWrapper*/ ,"3Punkte.png","⋮");
RDebugUtils.currentLine=3276859;
 //BA.debugLineNum = 3276859;BA.debugLine="pnlHeader.AddView(btnSettings, 100%x - 40dip, 22d";
_pnlheader.AddView((android.view.View)(__ref._btnsettings /*anywheresoftware.b4a.objects.ButtonWrapper*/ .getObject()),(int) (__c.PerXToCurrent((float) (100),ba)-__c.DipToCurrent((int) (40))),__c.DipToCurrent((int) (22)),__c.DipToCurrent((int) (34)),__c.DipToCurrent((int) (34)));
RDebugUtils.currentLine=3276862;
 //BA.debugLineNum = 3276862;BA.debugLine="vaEingabe.Initialize(\"\")";
__ref._vaeingabe /*anywheresoftware.b4a.objects.PanelWrapper*/ .Initialize(ba,"");
RDebugUtils.currentLine=3276863;
 //BA.debugLineNum = 3276863;BA.debugLine="vaEingabe.Color = 0xFFEEFFEE";
__ref._vaeingabe /*anywheresoftware.b4a.objects.PanelWrapper*/ .setColor(((int)0xffeeffee));
RDebugUtils.currentLine=3276864;
 //BA.debugLineNum = 3276864;BA.debugLine="Root.AddView(vaEingabe, 0, 80dip, 100%x, 340dip)";
__ref._root /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .AddView((android.view.View)(__ref._vaeingabe /*anywheresoftware.b4a.objects.PanelWrapper*/ .getObject()),(int) (0),__c.DipToCurrent((int) (80)),__c.PerXToCurrent((float) (100),ba),__c.DipToCurrent((int) (340)));
RDebugUtils.currentLine=3276866;
 //BA.debugLineNum = 3276866;BA.debugLine="btnCloseVstng.Initialize(\"btnCloseVstng\")";
__ref._btnclosevstng /*anywheresoftware.b4a.objects.ButtonWrapper*/ .Initialize(ba,"btnCloseVstng");
RDebugUtils.currentLine=3276867;
 //BA.debugLineNum = 3276867;BA.debugLine="SetButtonImageSafe(btnCloseVstng, \"close.png\", \"�";
__ref._setbuttonimagesafe /*String*/ (null,__ref._btnclosevstng /*anywheresoftware.b4a.objects.ButtonWrapper*/ ,"close.png","🔒");
RDebugUtils.currentLine=3276868;
 //BA.debugLineNum = 3276868;BA.debugLine="vaEingabe.AddView(btnCloseVstng, 8dip, 8dip, 32di";
__ref._vaeingabe /*anywheresoftware.b4a.objects.PanelWrapper*/ .AddView((android.view.View)(__ref._btnclosevstng /*anywheresoftware.b4a.objects.ButtonWrapper*/ .getObject()),__c.DipToCurrent((int) (8)),__c.DipToCurrent((int) (8)),__c.DipToCurrent((int) (32)),__c.DipToCurrent((int) (32)));
RDebugUtils.currentLine=3276870;
 //BA.debugLineNum = 3276870;BA.debugLine="Dim Label4 As Label";
_label4 = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=3276871;
 //BA.debugLineNum = 3276871;BA.debugLine="Label4.Initialize(\"\")";
_label4.Initialize(ba,"");
RDebugUtils.currentLine=3276872;
 //BA.debugLineNum = 3276872;BA.debugLine="Label4.Text = \"Angelplatz\"";
_label4.setText(BA.ObjectToCharSequence("Angelplatz"));
RDebugUtils.currentLine=3276873;
 //BA.debugLineNum = 3276873;BA.debugLine="Label4.TextSize = 16";
_label4.setTextSize((float) (16));
RDebugUtils.currentLine=3276874;
 //BA.debugLineNum = 3276874;BA.debugLine="Label4.Typeface = Typeface.DEFAULT_BOLD";
_label4.setTypeface(__c.Typeface.DEFAULT_BOLD);
RDebugUtils.currentLine=3276875;
 //BA.debugLineNum = 3276875;BA.debugLine="Label4.TextColor = Colors.Black";
_label4.setTextColor(__c.Colors.Black);
RDebugUtils.currentLine=3276876;
 //BA.debugLineNum = 3276876;BA.debugLine="Label4.Gravity = Gravity.CENTER";
_label4.setGravity(__c.Gravity.CENTER);
RDebugUtils.currentLine=3276877;
 //BA.debugLineNum = 3276877;BA.debugLine="vaEingabe.AddView(Label4, 45dip, 8dip, 100%x - 90";
__ref._vaeingabe /*anywheresoftware.b4a.objects.PanelWrapper*/ .AddView((android.view.View)(_label4.getObject()),__c.DipToCurrent((int) (45)),__c.DipToCurrent((int) (8)),(int) (__c.PerXToCurrent((float) (100),ba)-__c.DipToCurrent((int) (90))),__c.DipToCurrent((int) (32)));
RDebugUtils.currentLine=3276879;
 //BA.debugLineNum = 3276879;BA.debugLine="btnUp.Initialize(\"btnUp\")";
__ref._btnup /*anywheresoftware.b4a.objects.ButtonWrapper*/ .Initialize(ba,"btnUp");
RDebugUtils.currentLine=3276880;
 //BA.debugLineNum = 3276880;BA.debugLine="SetButtonImageSafe(btnUp, \"up.png\", \"▲\")";
__ref._setbuttonimagesafe /*String*/ (null,__ref._btnup /*anywheresoftware.b4a.objects.ButtonWrapper*/ ,"up.png","▲");
RDebugUtils.currentLine=3276881;
 //BA.debugLineNum = 3276881;BA.debugLine="vaEingabe.AddView(btnUp, 100%x - 40dip, 8dip, 32d";
__ref._vaeingabe /*anywheresoftware.b4a.objects.PanelWrapper*/ .AddView((android.view.View)(__ref._btnup /*anywheresoftware.b4a.objects.ButtonWrapper*/ .getObject()),(int) (__c.PerXToCurrent((float) (100),ba)-__c.DipToCurrent((int) (40))),__c.DipToCurrent((int) (8)),__c.DipToCurrent((int) (32)),__c.DipToCurrent((int) (32)));
RDebugUtils.currentLine=3276884;
 //BA.debugLineNum = 3276884;BA.debugLine="Dim centerBlockW As Int = 270dip";
_centerblockw = __c.DipToCurrent((int) (270));
RDebugUtils.currentLine=3276885;
 //BA.debugLineNum = 3276885;BA.debugLine="Dim startX As Int = (100%x - centerBlockW) / 2";
_startx = (int) ((__c.PerXToCurrent((float) (100),ba)-_centerblockw)/(double)2);
RDebugUtils.currentLine=3276887;
 //BA.debugLineNum = 3276887;BA.debugLine="btnMinus.Initialize(\"btnMinus\")";
__ref._btnminus /*anywheresoftware.b4a.objects.ButtonWrapper*/ .Initialize(ba,"btnMinus");
RDebugUtils.currentLine=3276888;
 //BA.debugLineNum = 3276888;BA.debugLine="btnMinus.Text = \"-\"";
__ref._btnminus /*anywheresoftware.b4a.objects.ButtonWrapper*/ .setText(BA.ObjectToCharSequence("-"));
RDebugUtils.currentLine=3276889;
 //BA.debugLineNum = 3276889;BA.debugLine="btnMinus.TextSize = 26";
__ref._btnminus /*anywheresoftware.b4a.objects.ButtonWrapper*/ .setTextSize((float) (26));
RDebugUtils.currentLine=3276890;
 //BA.debugLineNum = 3276890;BA.debugLine="btnMinus.Typeface = Typeface.DEFAULT_BOLD";
__ref._btnminus /*anywheresoftware.b4a.objects.ButtonWrapper*/ .setTypeface(__c.Typeface.DEFAULT_BOLD);
RDebugUtils.currentLine=3276891;
 //BA.debugLineNum = 3276891;BA.debugLine="btnMinus.TextColor = 0xFF16AA16";
__ref._btnminus /*anywheresoftware.b4a.objects.ButtonWrapper*/ .setTextColor(((int)0xff16aa16));
RDebugUtils.currentLine=3276892;
 //BA.debugLineNum = 3276892;BA.debugLine="vaEingabe.AddView(btnMinus, startX, 45dip, 60dip,";
__ref._vaeingabe /*anywheresoftware.b4a.objects.PanelWrapper*/ .AddView((android.view.View)(__ref._btnminus /*anywheresoftware.b4a.objects.ButtonWrapper*/ .getObject()),_startx,__c.DipToCurrent((int) (45)),__c.DipToCurrent((int) (60)),__c.DipToCurrent((int) (55)));
RDebugUtils.currentLine=3276894;
 //BA.debugLineNum = 3276894;BA.debugLine="spnPlatz.Initialize(\"spnPlatz\")";
__ref._spnplatz /*anywheresoftware.b4a.objects.SpinnerWrapper*/ .Initialize(ba,"spnPlatz");
RDebugUtils.currentLine=3276895;
 //BA.debugLineNum = 3276895;BA.debugLine="spnPlatz.TextSize = 28";
__ref._spnplatz /*anywheresoftware.b4a.objects.SpinnerWrapper*/ .setTextSize((float) (28));
RDebugUtils.currentLine=3276896;
 //BA.debugLineNum = 3276896;BA.debugLine="spnPlatz.TextColor = 0xFF16AA16";
__ref._spnplatz /*anywheresoftware.b4a.objects.SpinnerWrapper*/ .setTextColor(((int)0xff16aa16));
RDebugUtils.currentLine=3276897;
 //BA.debugLineNum = 3276897;BA.debugLine="spnPlatz.DropdownBackgroundColor = Colors.White";
__ref._spnplatz /*anywheresoftware.b4a.objects.SpinnerWrapper*/ .setDropdownBackgroundColor(__c.Colors.White);
RDebugUtils.currentLine=3276898;
 //BA.debugLineNum = 3276898;BA.debugLine="spnPlatz.DropdownTextColor = 0xFF16AA16";
__ref._spnplatz /*anywheresoftware.b4a.objects.SpinnerWrapper*/ .setDropdownTextColor(((int)0xff16aa16));
RDebugUtils.currentLine=3276899;
 //BA.debugLineNum = 3276899;BA.debugLine="vaEingabe.AddView(spnPlatz, startX + 60dip, 45dip";
__ref._vaeingabe /*anywheresoftware.b4a.objects.PanelWrapper*/ .AddView((android.view.View)(__ref._spnplatz /*anywheresoftware.b4a.objects.SpinnerWrapper*/ .getObject()),(int) (_startx+__c.DipToCurrent((int) (60))),__c.DipToCurrent((int) (45)),__c.DipToCurrent((int) (150)),__c.DipToCurrent((int) (55)));
RDebugUtils.currentLine=3276901;
 //BA.debugLineNum = 3276901;BA.debugLine="btnPlus.Initialize(\"btnPlus\")";
__ref._btnplus /*anywheresoftware.b4a.objects.ButtonWrapper*/ .Initialize(ba,"btnPlus");
RDebugUtils.currentLine=3276902;
 //BA.debugLineNum = 3276902;BA.debugLine="btnPlus.Text = \"+\"";
__ref._btnplus /*anywheresoftware.b4a.objects.ButtonWrapper*/ .setText(BA.ObjectToCharSequence("+"));
RDebugUtils.currentLine=3276903;
 //BA.debugLineNum = 3276903;BA.debugLine="btnPlus.TextSize = 26";
__ref._btnplus /*anywheresoftware.b4a.objects.ButtonWrapper*/ .setTextSize((float) (26));
RDebugUtils.currentLine=3276904;
 //BA.debugLineNum = 3276904;BA.debugLine="btnPlus.Typeface = Typeface.DEFAULT_BOLD";
__ref._btnplus /*anywheresoftware.b4a.objects.ButtonWrapper*/ .setTypeface(__c.Typeface.DEFAULT_BOLD);
RDebugUtils.currentLine=3276905;
 //BA.debugLineNum = 3276905;BA.debugLine="btnPlus.TextColor = 0xFF16AA16";
__ref._btnplus /*anywheresoftware.b4a.objects.ButtonWrapper*/ .setTextColor(((int)0xff16aa16));
RDebugUtils.currentLine=3276906;
 //BA.debugLineNum = 3276906;BA.debugLine="vaEingabe.AddView(btnPlus, startX + 210dip, 45dip";
__ref._vaeingabe /*anywheresoftware.b4a.objects.PanelWrapper*/ .AddView((android.view.View)(__ref._btnplus /*anywheresoftware.b4a.objects.ButtonWrapper*/ .getObject()),(int) (_startx+__c.DipToCurrent((int) (210))),__c.DipToCurrent((int) (45)),__c.DipToCurrent((int) (60)),__c.DipToCurrent((int) (55)));
RDebugUtils.currentLine=3276909;
 //BA.debugLineNum = 3276909;BA.debugLine="Dim Label6 As Label";
_label6 = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=3276910;
 //BA.debugLineNum = 3276910;BA.debugLine="Label6.Initialize(\"\")";
_label6.Initialize(ba,"");
RDebugUtils.currentLine=3276911;
 //BA.debugLineNum = 3276911;BA.debugLine="Label6.Text = \"Teilnehmer\"";
_label6.setText(BA.ObjectToCharSequence("Teilnehmer"));
RDebugUtils.currentLine=3276912;
 //BA.debugLineNum = 3276912;BA.debugLine="Label6.TextSize = 16";
_label6.setTextSize((float) (16));
RDebugUtils.currentLine=3276913;
 //BA.debugLineNum = 3276913;BA.debugLine="Label6.Typeface = Typeface.DEFAULT_BOLD";
_label6.setTypeface(__c.Typeface.DEFAULT_BOLD);
RDebugUtils.currentLine=3276914;
 //BA.debugLineNum = 3276914;BA.debugLine="Label6.TextColor = Colors.Black";
_label6.setTextColor(__c.Colors.Black);
RDebugUtils.currentLine=3276915;
 //BA.debugLineNum = 3276915;BA.debugLine="Label6.Gravity = Gravity.CENTER";
_label6.setGravity(__c.Gravity.CENTER);
RDebugUtils.currentLine=3276916;
 //BA.debugLineNum = 3276916;BA.debugLine="vaEingabe.AddView(Label6, 0, 110dip, 100%x, 24dip";
__ref._vaeingabe /*anywheresoftware.b4a.objects.PanelWrapper*/ .AddView((android.view.View)(_label6.getObject()),(int) (0),__c.DipToCurrent((int) (110)),__c.PerXToCurrent((float) (100),ba),__c.DipToCurrent((int) (24)));
RDebugUtils.currentLine=3276918;
 //BA.debugLineNum = 3276918;BA.debugLine="tbxTeilnehmer.Initialize(\"tbxTeilnehmer\")";
__ref._tbxteilnehmer /*anywheresoftware.b4a.objects.EditTextWrapper*/ .Initialize(ba,"tbxTeilnehmer");
RDebugUtils.currentLine=3276920;
 //BA.debugLineNum = 3276920;BA.debugLine="tbxTeilnehmer.TextSize = 20";
__ref._tbxteilnehmer /*anywheresoftware.b4a.objects.EditTextWrapper*/ .setTextSize((float) (20));
RDebugUtils.currentLine=3276921;
 //BA.debugLineNum = 3276921;BA.debugLine="tbxTeilnehmer.Typeface = Typeface.DEFAULT_BOLD";
__ref._tbxteilnehmer /*anywheresoftware.b4a.objects.EditTextWrapper*/ .setTypeface(__c.Typeface.DEFAULT_BOLD);
RDebugUtils.currentLine=3276922;
 //BA.debugLineNum = 3276922;BA.debugLine="tbxTeilnehmer.TextColor = 0xFF16AA16";
__ref._tbxteilnehmer /*anywheresoftware.b4a.objects.EditTextWrapper*/ .setTextColor(((int)0xff16aa16));
RDebugUtils.currentLine=3276923;
 //BA.debugLineNum = 3276923;BA.debugLine="tbxTeilnehmer.SingleLine = True";
__ref._tbxteilnehmer /*anywheresoftware.b4a.objects.EditTextWrapper*/ .setSingleLine(__c.True);
RDebugUtils.currentLine=3276924;
 //BA.debugLineNum = 3276924;BA.debugLine="vaEingabe.AddView(tbxTeilnehmer, 10%x, 136dip, 80";
__ref._vaeingabe /*anywheresoftware.b4a.objects.PanelWrapper*/ .AddView((android.view.View)(__ref._tbxteilnehmer /*anywheresoftware.b4a.objects.EditTextWrapper*/ .getObject()),__c.PerXToCurrent((float) (10),ba),__c.DipToCurrent((int) (136)),__c.PerXToCurrent((float) (80),ba),__c.DipToCurrent((int) (46)));
RDebugUtils.currentLine=3276927;
 //BA.debugLineNum = 3276927;BA.debugLine="vaErgEingabe.Initialize(\"\")";
__ref._vaergeingabe /*anywheresoftware.b4a.objects.PanelWrapper*/ .Initialize(ba,"");
RDebugUtils.currentLine=3276928;
 //BA.debugLineNum = 3276928;BA.debugLine="vaErgEingabe.Color = 0xFFEEFFEE";
__ref._vaergeingabe /*anywheresoftware.b4a.objects.PanelWrapper*/ .setColor(((int)0xffeeffee));
RDebugUtils.currentLine=3276929;
 //BA.debugLineNum = 3276929;BA.debugLine="vaEingabe.AddView(vaErgEingabe, 0, 186dip, 100%x,";
__ref._vaeingabe /*anywheresoftware.b4a.objects.PanelWrapper*/ .AddView((android.view.View)(__ref._vaergeingabe /*anywheresoftware.b4a.objects.PanelWrapper*/ .getObject()),(int) (0),__c.DipToCurrent((int) (186)),__c.PerXToCurrent((float) (100),ba),__c.DipToCurrent((int) (154)));
RDebugUtils.currentLine=3276931;
 //BA.debugLineNum = 3276931;BA.debugLine="btnFDJeingabe.Initialize(\"btnFDJeingabe\")";
__ref._btnfdjeingabe /*anywheresoftware.b4a.objects.ButtonWrapper*/ .Initialize(ba,"btnFDJeingabe");
RDebugUtils.currentLine=3276932;
 //BA.debugLineNum = 3276932;BA.debugLine="btnFDJeingabe.Text = \"Fisch des Jahres\"";
__ref._btnfdjeingabe /*anywheresoftware.b4a.objects.ButtonWrapper*/ .setText(BA.ObjectToCharSequence("Fisch des Jahres"));
RDebugUtils.currentLine=3276933;
 //BA.debugLineNum = 3276933;BA.debugLine="btnFDJeingabe.TextSize = 11";
__ref._btnfdjeingabe /*anywheresoftware.b4a.objects.ButtonWrapper*/ .setTextSize((float) (11));
RDebugUtils.currentLine=3276934;
 //BA.debugLineNum = 3276934;BA.debugLine="btnFDJeingabe.Typeface = Typeface.DEFAULT_BOLD";
__ref._btnfdjeingabe /*anywheresoftware.b4a.objects.ButtonWrapper*/ .setTypeface(__c.Typeface.DEFAULT_BOLD);
RDebugUtils.currentLine=3276935;
 //BA.debugLineNum = 3276935;BA.debugLine="btnFDJeingabe.TextColor = 0xFF16AA16";
__ref._btnfdjeingabe /*anywheresoftware.b4a.objects.ButtonWrapper*/ .setTextColor(((int)0xff16aa16));
RDebugUtils.currentLine=3276936;
 //BA.debugLineNum = 3276936;BA.debugLine="vaErgEingabe.AddView(btnFDJeingabe, 100%x - 145di";
__ref._vaergeingabe /*anywheresoftware.b4a.objects.PanelWrapper*/ .AddView((android.view.View)(__ref._btnfdjeingabe /*anywheresoftware.b4a.objects.ButtonWrapper*/ .getObject()),(int) (__c.PerXToCurrent((float) (100),ba)-__c.DipToCurrent((int) (145))),__c.DipToCurrent((int) (4)),__c.DipToCurrent((int) (130)),__c.DipToCurrent((int) (34)));
RDebugUtils.currentLine=3276938;
 //BA.debugLineNum = 3276938;BA.debugLine="Dim Label7 As Label";
_label7 = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=3276939;
 //BA.debugLineNum = 3276939;BA.debugLine="Label7.Initialize(\"\")";
_label7.Initialize(ba,"");
RDebugUtils.currentLine=3276940;
 //BA.debugLineNum = 3276940;BA.debugLine="Label7.Text = \"Fang:  \"";
_label7.setText(BA.ObjectToCharSequence("Fang:  "));
RDebugUtils.currentLine=3276941;
 //BA.debugLineNum = 3276941;BA.debugLine="Label7.TextSize = 16";
_label7.setTextSize((float) (16));
RDebugUtils.currentLine=3276942;
 //BA.debugLineNum = 3276942;BA.debugLine="Label7.Typeface = Typeface.DEFAULT_BOLD";
_label7.setTypeface(__c.Typeface.DEFAULT_BOLD);
RDebugUtils.currentLine=3276943;
 //BA.debugLineNum = 3276943;BA.debugLine="Label7.TextColor = Colors.Black";
_label7.setTextColor(__c.Colors.Black);
RDebugUtils.currentLine=3276944;
 //BA.debugLineNum = 3276944;BA.debugLine="Label7.Gravity = Gravity.RIGHT + Gravity.CENTER_V";
_label7.setGravity((int) (__c.Gravity.RIGHT+__c.Gravity.CENTER_VERTICAL));
RDebugUtils.currentLine=3276945;
 //BA.debugLineNum = 3276945;BA.debugLine="vaErgEingabe.AddView(Label7, 10dip, 44dip, (100%x";
__ref._vaergeingabe /*anywheresoftware.b4a.objects.PanelWrapper*/ .AddView((android.view.View)(_label7.getObject()),__c.DipToCurrent((int) (10)),__c.DipToCurrent((int) (44)),(int) ((__c.PerXToCurrent((float) (100),ba)-__c.DipToCurrent((int) (150)))/(double)2-__c.DipToCurrent((int) (10))),__c.DipToCurrent((int) (52)));
RDebugUtils.currentLine=3276947;
 //BA.debugLineNum = 3276947;BA.debugLine="tbxGramm.Initialize(\"tbxGramm\")";
__ref._tbxgramm /*anywheresoftware.b4a.objects.EditTextWrapper*/ .Initialize(ba,"tbxGramm");
RDebugUtils.currentLine=3276948;
 //BA.debugLineNum = 3276948;BA.debugLine="tbxGramm.TextSize = 30";
__ref._tbxgramm /*anywheresoftware.b4a.objects.EditTextWrapper*/ .setTextSize((float) (30));
RDebugUtils.currentLine=3276949;
 //BA.debugLineNum = 3276949;BA.debugLine="tbxGramm.Typeface = Typeface.DEFAULT_BOLD";
__ref._tbxgramm /*anywheresoftware.b4a.objects.EditTextWrapper*/ .setTypeface(__c.Typeface.DEFAULT_BOLD);
RDebugUtils.currentLine=3276950;
 //BA.debugLineNum = 3276950;BA.debugLine="tbxGramm.TextColor = 0xFF16AA16";
__ref._tbxgramm /*anywheresoftware.b4a.objects.EditTextWrapper*/ .setTextColor(((int)0xff16aa16));
RDebugUtils.currentLine=3276951;
 //BA.debugLineNum = 3276951;BA.debugLine="tbxGramm.Gravity = Gravity.CENTER";
__ref._tbxgramm /*anywheresoftware.b4a.objects.EditTextWrapper*/ .setGravity(__c.Gravity.CENTER);
RDebugUtils.currentLine=3276952;
 //BA.debugLineNum = 3276952;BA.debugLine="tbxGramm.InputType = tbxGramm.INPUT_TYPE_NUMBERS";
__ref._tbxgramm /*anywheresoftware.b4a.objects.EditTextWrapper*/ .setInputType(__ref._tbxgramm /*anywheresoftware.b4a.objects.EditTextWrapper*/ .INPUT_TYPE_NUMBERS);
RDebugUtils.currentLine=3276953;
 //BA.debugLineNum = 3276953;BA.debugLine="tbxGramm.SingleLine = True";
__ref._tbxgramm /*anywheresoftware.b4a.objects.EditTextWrapper*/ .setSingleLine(__c.True);
RDebugUtils.currentLine=3276954;
 //BA.debugLineNum = 3276954;BA.debugLine="vaErgEingabe.AddView(tbxGramm, (100%x - 150dip) /";
__ref._vaergeingabe /*anywheresoftware.b4a.objects.PanelWrapper*/ .AddView((android.view.View)(__ref._tbxgramm /*anywheresoftware.b4a.objects.EditTextWrapper*/ .getObject()),(int) ((__c.PerXToCurrent((float) (100),ba)-__c.DipToCurrent((int) (150)))/(double)2),__c.DipToCurrent((int) (44)),__c.DipToCurrent((int) (150)),__c.DipToCurrent((int) (52)));
RDebugUtils.currentLine=3276956;
 //BA.debugLineNum = 3276956;BA.debugLine="Dim Label2 As Label";
_label2 = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=3276957;
 //BA.debugLineNum = 3276957;BA.debugLine="Label2.Initialize(\"\")";
_label2.Initialize(ba,"");
RDebugUtils.currentLine=3276958;
 //BA.debugLineNum = 3276958;BA.debugLine="Label2.Text = \" Gramm\"";
_label2.setText(BA.ObjectToCharSequence(" Gramm"));
RDebugUtils.currentLine=3276959;
 //BA.debugLineNum = 3276959;BA.debugLine="Label2.TextSize = 16";
_label2.setTextSize((float) (16));
RDebugUtils.currentLine=3276960;
 //BA.debugLineNum = 3276960;BA.debugLine="Label2.Typeface = Typeface.DEFAULT_BOLD";
_label2.setTypeface(__c.Typeface.DEFAULT_BOLD);
RDebugUtils.currentLine=3276961;
 //BA.debugLineNum = 3276961;BA.debugLine="Label2.TextColor = Colors.Black";
_label2.setTextColor(__c.Colors.Black);
RDebugUtils.currentLine=3276962;
 //BA.debugLineNum = 3276962;BA.debugLine="Label2.Gravity = Gravity.LEFT + Gravity.CENTER_VE";
_label2.setGravity((int) (__c.Gravity.LEFT+__c.Gravity.CENTER_VERTICAL));
RDebugUtils.currentLine=3276963;
 //BA.debugLineNum = 3276963;BA.debugLine="vaErgEingabe.AddView(Label2, (100%x + 150dip) / 2";
__ref._vaergeingabe /*anywheresoftware.b4a.objects.PanelWrapper*/ .AddView((android.view.View)(_label2.getObject()),(int) ((__c.PerXToCurrent((float) (100),ba)+__c.DipToCurrent((int) (150)))/(double)2),__c.DipToCurrent((int) (44)),(int) ((__c.PerXToCurrent((float) (100),ba)-__c.DipToCurrent((int) (150)))/(double)2-__c.DipToCurrent((int) (10))),__c.DipToCurrent((int) (52)));
RDebugUtils.currentLine=3276965;
 //BA.debugLineNum = 3276965;BA.debugLine="btnSpeichern.Initialize(\"btnSpeichern\")";
__ref._btnspeichern /*anywheresoftware.b4a.objects.ButtonWrapper*/ .Initialize(ba,"btnSpeichern");
RDebugUtils.currentLine=3276966;
 //BA.debugLineNum = 3276966;BA.debugLine="btnSpeichern.Text = \"speichern\"";
__ref._btnspeichern /*anywheresoftware.b4a.objects.ButtonWrapper*/ .setText(BA.ObjectToCharSequence("speichern"));
RDebugUtils.currentLine=3276967;
 //BA.debugLineNum = 3276967;BA.debugLine="btnSpeichern.TextSize = 16";
__ref._btnspeichern /*anywheresoftware.b4a.objects.ButtonWrapper*/ .setTextSize((float) (16));
RDebugUtils.currentLine=3276968;
 //BA.debugLineNum = 3276968;BA.debugLine="btnSpeichern.Typeface = Typeface.DEFAULT_BOLD";
__ref._btnspeichern /*anywheresoftware.b4a.objects.ButtonWrapper*/ .setTypeface(__c.Typeface.DEFAULT_BOLD);
RDebugUtils.currentLine=3276969;
 //BA.debugLineNum = 3276969;BA.debugLine="btnSpeichern.TextColor = 0xFF16AA16";
__ref._btnspeichern /*anywheresoftware.b4a.objects.ButtonWrapper*/ .setTextColor(((int)0xff16aa16));
RDebugUtils.currentLine=3276970;
 //BA.debugLineNum = 3276970;BA.debugLine="vaErgEingabe.AddView(btnSpeichern, (100%x - 150di";
__ref._vaergeingabe /*anywheresoftware.b4a.objects.PanelWrapper*/ .AddView((android.view.View)(__ref._btnspeichern /*anywheresoftware.b4a.objects.ButtonWrapper*/ .getObject()),(int) ((__c.PerXToCurrent((float) (100),ba)-__c.DipToCurrent((int) (150)))/(double)2),__c.DipToCurrent((int) (104)),__c.DipToCurrent((int) (150)),__c.DipToCurrent((int) (44)));
RDebugUtils.currentLine=3276973;
 //BA.debugLineNum = 3276973;BA.debugLine="vaFDJ.Initialize(\"\")";
__ref._vafdj /*anywheresoftware.b4a.objects.PanelWrapper*/ .Initialize(ba,"");
RDebugUtils.currentLine=3276974;
 //BA.debugLineNum = 3276974;BA.debugLine="vaFDJ.Color = 0xFFEEFFEE";
__ref._vafdj /*anywheresoftware.b4a.objects.PanelWrapper*/ .setColor(((int)0xffeeffee));
RDebugUtils.currentLine=3276975;
 //BA.debugLineNum = 3276975;BA.debugLine="vaFDJ.Visible = False";
__ref._vafdj /*anywheresoftware.b4a.objects.PanelWrapper*/ .setVisible(__c.False);
RDebugUtils.currentLine=3276976;
 //BA.debugLineNum = 3276976;BA.debugLine="vaEingabe.AddView(vaFDJ, 0, 186dip, 100%x, 154dip";
__ref._vaeingabe /*anywheresoftware.b4a.objects.PanelWrapper*/ .AddView((android.view.View)(__ref._vafdj /*anywheresoftware.b4a.objects.PanelWrapper*/ .getObject()),(int) (0),__c.DipToCurrent((int) (186)),__c.PerXToCurrent((float) (100),ba),__c.DipToCurrent((int) (154)));
RDebugUtils.currentLine=3276978;
 //BA.debugLineNum = 3276978;BA.debugLine="Dim Label18 As Label";
_label18 = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=3276979;
 //BA.debugLineNum = 3276979;BA.debugLine="Label18.Initialize(\"\")";
_label18.Initialize(ba,"");
RDebugUtils.currentLine=3276980;
 //BA.debugLineNum = 3276980;BA.debugLine="Label18.Text = \"Fisch des Jahres\"";
_label18.setText(BA.ObjectToCharSequence("Fisch des Jahres"));
RDebugUtils.currentLine=3276981;
 //BA.debugLineNum = 3276981;BA.debugLine="Label18.TextSize = 16";
_label18.setTextSize((float) (16));
RDebugUtils.currentLine=3276982;
 //BA.debugLineNum = 3276982;BA.debugLine="Label18.Typeface = Typeface.DEFAULT_BOLD";
_label18.setTypeface(__c.Typeface.DEFAULT_BOLD);
RDebugUtils.currentLine=3276983;
 //BA.debugLineNum = 3276983;BA.debugLine="Label18.TextColor = Colors.Black";
_label18.setTextColor(__c.Colors.Black);
RDebugUtils.currentLine=3276984;
 //BA.debugLineNum = 3276984;BA.debugLine="Label18.Gravity = Gravity.CENTER";
_label18.setGravity(__c.Gravity.CENTER);
RDebugUtils.currentLine=3276985;
 //BA.debugLineNum = 3276985;BA.debugLine="vaFDJ.AddView(Label18, 40dip, 4dip, 100%x - 80dip";
__ref._vafdj /*anywheresoftware.b4a.objects.PanelWrapper*/ .AddView((android.view.View)(_label18.getObject()),__c.DipToCurrent((int) (40)),__c.DipToCurrent((int) (4)),(int) (__c.PerXToCurrent((float) (100),ba)-__c.DipToCurrent((int) (80))),__c.DipToCurrent((int) (30)));
RDebugUtils.currentLine=3276987;
 //BA.debugLineNum = 3276987;BA.debugLine="btnFDJback.Initialize(\"btnFDJback\")";
__ref._btnfdjback /*anywheresoftware.b4a.objects.ButtonWrapper*/ .Initialize(ba,"btnFDJback");
RDebugUtils.currentLine=3276988;
 //BA.debugLineNum = 3276988;BA.debugLine="SetButtonImageSafe(btnFDJback, \"Left.48.png\", \"◀\"";
__ref._setbuttonimagesafe /*String*/ (null,__ref._btnfdjback /*anywheresoftware.b4a.objects.ButtonWrapper*/ ,"Left.48.png","◀");
RDebugUtils.currentLine=3276989;
 //BA.debugLineNum = 3276989;BA.debugLine="vaFDJ.AddView(btnFDJback, 100%x - 38dip, 4dip, 30";
__ref._vafdj /*anywheresoftware.b4a.objects.PanelWrapper*/ .AddView((android.view.View)(__ref._btnfdjback /*anywheresoftware.b4a.objects.ButtonWrapper*/ .getObject()),(int) (__c.PerXToCurrent((float) (100),ba)-__c.DipToCurrent((int) (38))),__c.DipToCurrent((int) (4)),__c.DipToCurrent((int) (30)),__c.DipToCurrent((int) (30)));
RDebugUtils.currentLine=3276991;
 //BA.debugLineNum = 3276991;BA.debugLine="Dim Label16 As Label";
_label16 = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=3276992;
 //BA.debugLineNum = 3276992;BA.debugLine="Label16.Initialize(\"\")";
_label16.Initialize(ba,"");
RDebugUtils.currentLine=3276993;
 //BA.debugLineNum = 3276993;BA.debugLine="Label16.Text = \"  Fang:  \"";
_label16.setText(BA.ObjectToCharSequence("  Fang:  "));
RDebugUtils.currentLine=3276994;
 //BA.debugLineNum = 3276994;BA.debugLine="Label16.TextSize = 16";
_label16.setTextSize((float) (16));
RDebugUtils.currentLine=3276995;
 //BA.debugLineNum = 3276995;BA.debugLine="Label16.Typeface = Typeface.DEFAULT_BOLD";
_label16.setTypeface(__c.Typeface.DEFAULT_BOLD);
RDebugUtils.currentLine=3276996;
 //BA.debugLineNum = 3276996;BA.debugLine="Label16.TextColor = Colors.Black";
_label16.setTextColor(__c.Colors.Black);
RDebugUtils.currentLine=3276997;
 //BA.debugLineNum = 3276997;BA.debugLine="Label16.Gravity = Gravity.RIGHT + Gravity.CENTER_";
_label16.setGravity((int) (__c.Gravity.RIGHT+__c.Gravity.CENTER_VERTICAL));
RDebugUtils.currentLine=3276998;
 //BA.debugLineNum = 3276998;BA.debugLine="vaFDJ.AddView(Label16, 10dip, 44dip, (100%x - 150";
__ref._vafdj /*anywheresoftware.b4a.objects.PanelWrapper*/ .AddView((android.view.View)(_label16.getObject()),__c.DipToCurrent((int) (10)),__c.DipToCurrent((int) (44)),(int) ((__c.PerXToCurrent((float) (100),ba)-__c.DipToCurrent((int) (150)))/(double)2-__c.DipToCurrent((int) (10))),__c.DipToCurrent((int) (52)));
RDebugUtils.currentLine=3277000;
 //BA.debugLineNum = 3277000;BA.debugLine="tbxFDJgewicht.Initialize(\"tbxFDJgewicht\")";
__ref._tbxfdjgewicht /*anywheresoftware.b4a.objects.EditTextWrapper*/ .Initialize(ba,"tbxFDJgewicht");
RDebugUtils.currentLine=3277001;
 //BA.debugLineNum = 3277001;BA.debugLine="tbxFDJgewicht.TextSize = 30";
__ref._tbxfdjgewicht /*anywheresoftware.b4a.objects.EditTextWrapper*/ .setTextSize((float) (30));
RDebugUtils.currentLine=3277002;
 //BA.debugLineNum = 3277002;BA.debugLine="tbxFDJgewicht.Typeface = Typeface.DEFAULT_BOLD";
__ref._tbxfdjgewicht /*anywheresoftware.b4a.objects.EditTextWrapper*/ .setTypeface(__c.Typeface.DEFAULT_BOLD);
RDebugUtils.currentLine=3277003;
 //BA.debugLineNum = 3277003;BA.debugLine="tbxFDJgewicht.TextColor = 0xFF16AA16";
__ref._tbxfdjgewicht /*anywheresoftware.b4a.objects.EditTextWrapper*/ .setTextColor(((int)0xff16aa16));
RDebugUtils.currentLine=3277004;
 //BA.debugLineNum = 3277004;BA.debugLine="tbxFDJgewicht.Gravity = Gravity.CENTER";
__ref._tbxfdjgewicht /*anywheresoftware.b4a.objects.EditTextWrapper*/ .setGravity(__c.Gravity.CENTER);
RDebugUtils.currentLine=3277005;
 //BA.debugLineNum = 3277005;BA.debugLine="tbxFDJgewicht.InputType = tbxFDJgewicht.INPUT_TYP";
__ref._tbxfdjgewicht /*anywheresoftware.b4a.objects.EditTextWrapper*/ .setInputType(__ref._tbxfdjgewicht /*anywheresoftware.b4a.objects.EditTextWrapper*/ .INPUT_TYPE_NUMBERS);
RDebugUtils.currentLine=3277006;
 //BA.debugLineNum = 3277006;BA.debugLine="tbxFDJgewicht.SingleLine = True";
__ref._tbxfdjgewicht /*anywheresoftware.b4a.objects.EditTextWrapper*/ .setSingleLine(__c.True);
RDebugUtils.currentLine=3277007;
 //BA.debugLineNum = 3277007;BA.debugLine="vaFDJ.AddView(tbxFDJgewicht, (100%x - 150dip) / 2";
__ref._vafdj /*anywheresoftware.b4a.objects.PanelWrapper*/ .AddView((android.view.View)(__ref._tbxfdjgewicht /*anywheresoftware.b4a.objects.EditTextWrapper*/ .getObject()),(int) ((__c.PerXToCurrent((float) (100),ba)-__c.DipToCurrent((int) (150)))/(double)2),__c.DipToCurrent((int) (44)),__c.DipToCurrent((int) (150)),__c.DipToCurrent((int) (52)));
RDebugUtils.currentLine=3277009;
 //BA.debugLineNum = 3277009;BA.debugLine="Dim Label17 As Label";
_label17 = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=3277010;
 //BA.debugLineNum = 3277010;BA.debugLine="Label17.Initialize(\"\")";
_label17.Initialize(ba,"");
RDebugUtils.currentLine=3277011;
 //BA.debugLineNum = 3277011;BA.debugLine="Label17.Text = \" Gramm\"";
_label17.setText(BA.ObjectToCharSequence(" Gramm"));
RDebugUtils.currentLine=3277012;
 //BA.debugLineNum = 3277012;BA.debugLine="Label17.TextSize = 16";
_label17.setTextSize((float) (16));
RDebugUtils.currentLine=3277013;
 //BA.debugLineNum = 3277013;BA.debugLine="Label17.Typeface = Typeface.DEFAULT_BOLD";
_label17.setTypeface(__c.Typeface.DEFAULT_BOLD);
RDebugUtils.currentLine=3277014;
 //BA.debugLineNum = 3277014;BA.debugLine="Label17.TextColor = Colors.Black";
_label17.setTextColor(__c.Colors.Black);
RDebugUtils.currentLine=3277015;
 //BA.debugLineNum = 3277015;BA.debugLine="Label17.Gravity = Gravity.LEFT + Gravity.CENTER_V";
_label17.setGravity((int) (__c.Gravity.LEFT+__c.Gravity.CENTER_VERTICAL));
RDebugUtils.currentLine=3277016;
 //BA.debugLineNum = 3277016;BA.debugLine="vaFDJ.AddView(Label17, (100%x + 150dip) / 2, 44di";
__ref._vafdj /*anywheresoftware.b4a.objects.PanelWrapper*/ .AddView((android.view.View)(_label17.getObject()),(int) ((__c.PerXToCurrent((float) (100),ba)+__c.DipToCurrent((int) (150)))/(double)2),__c.DipToCurrent((int) (44)),(int) ((__c.PerXToCurrent((float) (100),ba)-__c.DipToCurrent((int) (150)))/(double)2-__c.DipToCurrent((int) (10))),__c.DipToCurrent((int) (52)));
RDebugUtils.currentLine=3277018;
 //BA.debugLineNum = 3277018;BA.debugLine="btnFDJsave.Initialize(\"btnFDJsave\")";
__ref._btnfdjsave /*anywheresoftware.b4a.objects.ButtonWrapper*/ .Initialize(ba,"btnFDJsave");
RDebugUtils.currentLine=3277019;
 //BA.debugLineNum = 3277019;BA.debugLine="btnFDJsave.Text = \"speichern\"";
__ref._btnfdjsave /*anywheresoftware.b4a.objects.ButtonWrapper*/ .setText(BA.ObjectToCharSequence("speichern"));
RDebugUtils.currentLine=3277020;
 //BA.debugLineNum = 3277020;BA.debugLine="btnFDJsave.TextSize = 16";
__ref._btnfdjsave /*anywheresoftware.b4a.objects.ButtonWrapper*/ .setTextSize((float) (16));
RDebugUtils.currentLine=3277021;
 //BA.debugLineNum = 3277021;BA.debugLine="btnFDJsave.Typeface = Typeface.DEFAULT_BOLD";
__ref._btnfdjsave /*anywheresoftware.b4a.objects.ButtonWrapper*/ .setTypeface(__c.Typeface.DEFAULT_BOLD);
RDebugUtils.currentLine=3277022;
 //BA.debugLineNum = 3277022;BA.debugLine="btnFDJsave.TextColor = 0xFF16AA16";
__ref._btnfdjsave /*anywheresoftware.b4a.objects.ButtonWrapper*/ .setTextColor(((int)0xff16aa16));
RDebugUtils.currentLine=3277023;
 //BA.debugLineNum = 3277023;BA.debugLine="vaFDJ.AddView(btnFDJsave, (100%x - 150dip) / 2, 1";
__ref._vafdj /*anywheresoftware.b4a.objects.PanelWrapper*/ .AddView((android.view.View)(__ref._btnfdjsave /*anywheresoftware.b4a.objects.ButtonWrapper*/ .getObject()),(int) ((__c.PerXToCurrent((float) (100),ba)-__c.DipToCurrent((int) (150)))/(double)2),__c.DipToCurrent((int) (104)),__c.DipToCurrent((int) (150)),__c.DipToCurrent((int) (44)));
RDebugUtils.currentLine=3277026;
 //BA.debugLineNum = 3277026;BA.debugLine="haDown.Initialize(\"\")";
__ref._hadown /*anywheresoftware.b4a.objects.PanelWrapper*/ .Initialize(ba,"");
RDebugUtils.currentLine=3277027;
 //BA.debugLineNum = 3277027;BA.debugLine="haDown.Color = 0xFFEEFFEE";
__ref._hadown /*anywheresoftware.b4a.objects.PanelWrapper*/ .setColor(((int)0xffeeffee));
RDebugUtils.currentLine=3277028;
 //BA.debugLineNum = 3277028;BA.debugLine="haDown.Visible = False";
__ref._hadown /*anywheresoftware.b4a.objects.PanelWrapper*/ .setVisible(__c.False);
RDebugUtils.currentLine=3277029;
 //BA.debugLineNum = 3277029;BA.debugLine="Root.AddView(haDown, 0, 80dip, 100%x, 42dip)";
__ref._root /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .AddView((android.view.View)(__ref._hadown /*anywheresoftware.b4a.objects.PanelWrapper*/ .getObject()),(int) (0),__c.DipToCurrent((int) (80)),__c.PerXToCurrent((float) (100),ba),__c.DipToCurrent((int) (42)));
RDebugUtils.currentLine=3277031;
 //BA.debugLineNum = 3277031;BA.debugLine="btnShare.Initialize(\"btnShare\")";
__ref._btnshare /*anywheresoftware.b4a.objects.ButtonWrapper*/ .Initialize(ba,"btnShare");
RDebugUtils.currentLine=3277032;
 //BA.debugLineNum = 3277032;BA.debugLine="SetButtonImageSafe(btnShare, \"share.png\", \"📤\")";
__ref._setbuttonimagesafe /*String*/ (null,__ref._btnshare /*anywheresoftware.b4a.objects.ButtonWrapper*/ ,"share.png","📤");
RDebugUtils.currentLine=3277033;
 //BA.debugLineNum = 3277033;BA.debugLine="haDown.AddView(btnShare, 8dip, 7dip, 28dip, 28dip";
__ref._hadown /*anywheresoftware.b4a.objects.PanelWrapper*/ .AddView((android.view.View)(__ref._btnshare /*anywheresoftware.b4a.objects.ButtonWrapper*/ .getObject()),__c.DipToCurrent((int) (8)),__c.DipToCurrent((int) (7)),__c.DipToCurrent((int) (28)),__c.DipToCurrent((int) (28)));
RDebugUtils.currentLine=3277035;
 //BA.debugLineNum = 3277035;BA.debugLine="Dim Label15 As Label";
_label15 = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=3277036;
 //BA.debugLineNum = 3277036;BA.debugLine="Label15.Initialize(\"\")";
_label15.Initialize(ba,"");
RDebugUtils.currentLine=3277037;
 //BA.debugLineNum = 3277037;BA.debugLine="Label15.Text = \"Ergebnisliste\"";
_label15.setText(BA.ObjectToCharSequence("Ergebnisliste"));
RDebugUtils.currentLine=3277038;
 //BA.debugLineNum = 3277038;BA.debugLine="Label15.TextSize = 16";
_label15.setTextSize((float) (16));
RDebugUtils.currentLine=3277039;
 //BA.debugLineNum = 3277039;BA.debugLine="Label15.Typeface = Typeface.DEFAULT_BOLD";
_label15.setTypeface(__c.Typeface.DEFAULT_BOLD);
RDebugUtils.currentLine=3277040;
 //BA.debugLineNum = 3277040;BA.debugLine="Label15.TextColor = Colors.Black";
_label15.setTextColor(__c.Colors.Black);
RDebugUtils.currentLine=3277041;
 //BA.debugLineNum = 3277041;BA.debugLine="Label15.Gravity = Gravity.CENTER";
_label15.setGravity(__c.Gravity.CENTER);
RDebugUtils.currentLine=3277042;
 //BA.debugLineNum = 3277042;BA.debugLine="haDown.AddView(Label15, 45dip, 5dip, 100%x - 90di";
__ref._hadown /*anywheresoftware.b4a.objects.PanelWrapper*/ .AddView((android.view.View)(_label15.getObject()),__c.DipToCurrent((int) (45)),__c.DipToCurrent((int) (5)),(int) (__c.PerXToCurrent((float) (100),ba)-__c.DipToCurrent((int) (90))),__c.DipToCurrent((int) (32)));
RDebugUtils.currentLine=3277044;
 //BA.debugLineNum = 3277044;BA.debugLine="btnDown.Initialize(\"btnDown\")";
__ref._btndown /*anywheresoftware.b4a.objects.ButtonWrapper*/ .Initialize(ba,"btnDown");
RDebugUtils.currentLine=3277045;
 //BA.debugLineNum = 3277045;BA.debugLine="SetButtonImageSafe(btnDown, \"down.png\", \"▼\")";
__ref._setbuttonimagesafe /*String*/ (null,__ref._btndown /*anywheresoftware.b4a.objects.ButtonWrapper*/ ,"down.png","▼");
RDebugUtils.currentLine=3277046;
 //BA.debugLineNum = 3277046;BA.debugLine="haDown.AddView(btnDown, 100%x - 40dip, 5dip, 32di";
__ref._hadown /*anywheresoftware.b4a.objects.PanelWrapper*/ .AddView((android.view.View)(__ref._btndown /*anywheresoftware.b4a.objects.ButtonWrapper*/ .getObject()),(int) (__c.PerXToCurrent((float) (100),ba)-__c.DipToCurrent((int) (40))),__c.DipToCurrent((int) (5)),__c.DipToCurrent((int) (32)),__c.DipToCurrent((int) (32)));
RDebugUtils.currentLine=3277049;
 //BA.debugLineNum = 3277049;BA.debugLine="webErgebnis.Initialize(\"webErgebnis\")";
__ref._webergebnis /*anywheresoftware.b4a.objects.WebViewWrapper*/ .Initialize(ba,"webErgebnis");
RDebugUtils.currentLine=3277050;
 //BA.debugLineNum = 3277050;BA.debugLine="webErgebnis.JavaScriptEnabled = True";
__ref._webergebnis /*anywheresoftware.b4a.objects.WebViewWrapper*/ .setJavaScriptEnabled(__c.True);
RDebugUtils.currentLine=3277051;
 //BA.debugLineNum = 3277051;BA.debugLine="SetupWebViewBridge";
__ref._setupwebviewbridge /*String*/ (null);
RDebugUtils.currentLine=3277052;
 //BA.debugLineNum = 3277052;BA.debugLine="Root.AddView(webErgebnis, 0, 425dip, 100%x, 100%y";
__ref._root /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .AddView((android.view.View)(__ref._webergebnis /*anywheresoftware.b4a.objects.WebViewWrapper*/ .getObject()),(int) (0),__c.DipToCurrent((int) (425)),__c.PerXToCurrent((float) (100),ba),(int) (__c.PerYToCurrent((float) (100),ba)-__c.DipToCurrent((int) (425))));
RDebugUtils.currentLine=3277055;
 //BA.debugLineNum = 3277055;BA.debugLine="lsvName.Initialize(\"lsvName\")";
__ref._lsvname /*anywheresoftware.b4a.objects.ListViewWrapper*/ .Initialize(ba,"lsvName");
RDebugUtils.currentLine=3277056;
 //BA.debugLineNum = 3277056;BA.debugLine="lsvName.Color = 0xFFEFEFEF";
__ref._lsvname /*anywheresoftware.b4a.objects.ListViewWrapper*/ .setColor(((int)0xffefefef));
RDebugUtils.currentLine=3277057;
 //BA.debugLineNum = 3277057;BA.debugLine="lsvName.SingleLineLayout.Label.TextColor = 0xFF33";
__ref._lsvname /*anywheresoftware.b4a.objects.ListViewWrapper*/ .getSingleLineLayout().Label.setTextColor(((int)0xff3333ff));
RDebugUtils.currentLine=3277058;
 //BA.debugLineNum = 3277058;BA.debugLine="lsvName.SingleLineLayout.Label.TextSize = 16";
__ref._lsvname /*anywheresoftware.b4a.objects.ListViewWrapper*/ .getSingleLineLayout().Label.setTextSize((float) (16));
RDebugUtils.currentLine=3277059;
 //BA.debugLineNum = 3277059;BA.debugLine="lsvName.Visible = False";
__ref._lsvname /*anywheresoftware.b4a.objects.ListViewWrapper*/ .setVisible(__c.False);
RDebugUtils.currentLine=3277060;
 //BA.debugLineNum = 3277060;BA.debugLine="Root.AddView(lsvName, 10%x, 262dip, 80%x, 150dip)";
__ref._root /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .AddView((android.view.View)(__ref._lsvname /*anywheresoftware.b4a.objects.ListViewWrapper*/ .getObject()),__c.PerXToCurrent((float) (10),ba),__c.DipToCurrent((int) (262)),__c.PerXToCurrent((float) (80),ba),__c.DipToCurrent((int) (150)));
RDebugUtils.currentLine=3277061;
 //BA.debugLineNum = 3277061;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=6160385;
 //BA.debugLineNum = 6160385;BA.debugLine="Msgbox2Async(\"Die Veranstaltung \" & QUOTE & lblVe";
parent.__c.Msgbox2Async(BA.ObjectToCharSequence("Die Veranstaltung "+parent.__c.QUOTE+__ref._lblveranstaltung /*anywheresoftware.b4a.objects.LabelWrapper*/ .getText()+parent.__c.QUOTE+" wird zur Bearbeitung gesperrt und kann danach nicht mehr geändert werden. Es wird nur noch die Ergebnisliste angezeigt."),BA.ObjectToCharSequence("Veranstaltung abschließen"),"Abschließen","Abbrechen","",(anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper(), (android.graphics.Bitmap)(parent.__c.Null)),ba,parent.__c.True);
RDebugUtils.currentLine=6160386;
 //BA.debugLineNum = 6160386;BA.debugLine="Wait For Msgbox_Result (res As Int)";
parent.__c.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "screenmain", "btnclosevstng_click"), null);
this.state = 5;
return;
case 5:
//C
this.state = 1;
_res = (Integer) result[1];
;
RDebugUtils.currentLine=6160387;
 //BA.debugLineNum = 6160387;BA.debugLine="If res = DialogResponse.POSITIVE Then";
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
RDebugUtils.currentLine=6160388;
 //BA.debugLineNum = 6160388;BA.debugLine="closeVstng(\"Ergebnisse\")";
__ref._closevstng /*String*/ (null,"Ergebnisse");
 if (true) break;

case 4:
//C
this.state = -1;
;
RDebugUtils.currentLine=6160390;
 //BA.debugLineNum = 6160390;BA.debugLine="startTimer";
__ref._starttimer /*String*/ (null);
RDebugUtils.currentLine=6160391;
 //BA.debugLineNum = 6160391;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=4849664;
 //BA.debugLineNum = 4849664;BA.debugLine="Private Sub closeVstng(table As String)";
RDebugUtils.currentLine=4849665;
 //BA.debugLineNum = 4849665;BA.debugLine="If table = \"Ergebnisse\" Then";
if ((_table).equals("Ergebnisse")) { 
RDebugUtils.currentLine=4849666;
 //BA.debugLineNum = 4849666;BA.debugLine="DBdatenTyp = \"ErgClosed\"";
__ref._dbdatentyp /*String*/  = "ErgClosed";
RDebugUtils.currentLine=4849667;
 //BA.debugLineNum = 4849667;BA.debugLine="Dim verDatum As String = DBGet(\"VeranstaltungDat";
_verdatum = BA.ObjectToString(__ref._dbget /*Object*/ (null,"VeranstaltungDatum",(Object)(__ref._formatdatecustom /*String*/ (null,__c.DateTime.getNow(),"dd.MM.yyyy"))));
RDebugUtils.currentLine=4849668;
 //BA.debugLineNum = 4849668;BA.debugLine="Dim key() As String = Regex.Split(\"\\.\", verDatum";
_key = __c.Regex.Split("\\.",_verdatum);
RDebugUtils.currentLine=4849669;
 //BA.debugLineNum = 4849669;BA.debugLine="CurrentWebUrl = URLErgebnisse & \"/e\" & key(2) &";
__ref._currentweburl /*String*/  = __ref._urlergebnisse /*String*/ +"/e"+_key[(int) (2)]+_key[(int) (1)]+_key[(int) (0)]+".json?auth="+BA.ObjectToString(__ref._status /*anywheresoftware.b4a.objects.collections.Map*/ .GetDefault((Object)("idToken"),(Object)("")));
 }else {
RDebugUtils.currentLine=4849671;
 //BA.debugLineNum = 4849671;BA.debugLine="DBdatenTyp = \"VSTNGclosed\"";
__ref._dbdatentyp /*String*/  = "VSTNGclosed";
RDebugUtils.currentLine=4849672;
 //BA.debugLineNum = 4849672;BA.debugLine="Dim keyStr As String = DBGet(\"VeranstaltungID\",";
_keystr = BA.ObjectToString(__ref._dbget /*Object*/ (null,"VeranstaltungID",(Object)("v0")));
RDebugUtils.currentLine=4849673;
 //BA.debugLineNum = 4849673;BA.debugLine="CurrentWebUrl = URLveranstaltungen & \"/\" & keySt";
__ref._currentweburl /*String*/  = __ref._urlveranstaltungen /*String*/ +"/"+_keystr+".json?auth="+BA.ObjectToString(__ref._status /*anywheresoftware.b4a.objects.collections.Map*/ .GetDefault((Object)("idToken"),(Object)("")));
 };
RDebugUtils.currentLine=4849676;
 //BA.debugLineNum = 4849676;BA.debugLine="Dim body As Map = CreateMap(\"Status\": \"geschlosse";
_body = new anywheresoftware.b4a.objects.collections.Map();
_body = __c.createMap(new Object[] {(Object)("Status"),(Object)("geschlossen")});
RDebugUtils.currentLine=4849677;
 //BA.debugLineNum = 4849677;BA.debugLine="Dim jg As JSONGenerator";
_jg = new anywheresoftware.b4a.objects.collections.JSONParser.JSONGenerator();
RDebugUtils.currentLine=4849678;
 //BA.debugLineNum = 4849678;BA.debugLine="jg.Initialize(body)";
_jg.Initialize(_body);
RDebugUtils.currentLine=4849679;
 //BA.debugLineNum = 4849679;BA.debugLine="PatchTextWeb(jg.ToString)";
__ref._patchtextweb /*String*/ (null,_jg.ToString());
RDebugUtils.currentLine=4849680;
 //BA.debugLineNum = 4849680;BA.debugLine="End Sub";
return "";
}
public String  _btndown_click(b4a.example.screenmain __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="screenmain";
if (Debug.shouldDelegate(ba, "btndown_click", false))
	 {return ((String) Debug.delegate(ba, "btndown_click", null));}
RDebugUtils.currentLine=5832704;
 //BA.debugLineNum = 5832704;BA.debugLine="Private Sub btnDown_Click";
RDebugUtils.currentLine=5832705;
 //BA.debugLineNum = 5832705;BA.debugLine="vaEingabe.Visible = True";
__ref._vaeingabe /*anywheresoftware.b4a.objects.PanelWrapper*/ .setVisible(__c.True);
RDebugUtils.currentLine=5832706;
 //BA.debugLineNum = 5832706;BA.debugLine="haDown.Visible = False";
__ref._hadown /*anywheresoftware.b4a.objects.PanelWrapper*/ .setVisible(__c.False);
RDebugUtils.currentLine=5832707;
 //BA.debugLineNum = 5832707;BA.debugLine="btnDown.Visible = False";
__ref._btndown /*anywheresoftware.b4a.objects.ButtonWrapper*/ .setVisible(__c.False);
RDebugUtils.currentLine=5832708;
 //BA.debugLineNum = 5832708;BA.debugLine="UpdateLayoutPositions";
__ref._updatelayoutpositions /*String*/ (null);
RDebugUtils.currentLine=5832709;
 //BA.debugLineNum = 5832709;BA.debugLine="startTimer";
__ref._starttimer /*String*/ (null);
RDebugUtils.currentLine=5832710;
 //BA.debugLineNum = 5832710;BA.debugLine="End Sub";
return "";
}
public String  _updatelayoutpositions(b4a.example.screenmain __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="screenmain";
if (Debug.shouldDelegate(ba, "updatelayoutpositions", false))
	 {return ((String) Debug.delegate(ba, "updatelayoutpositions", null));}
RDebugUtils.currentLine=3670016;
 //BA.debugLineNum = 3670016;BA.debugLine="Private Sub UpdateLayoutPositions";
RDebugUtils.currentLine=3670017;
 //BA.debugLineNum = 3670017;BA.debugLine="If vaEingabe.Visible Then";
if (__ref._vaeingabe /*anywheresoftware.b4a.objects.PanelWrapper*/ .getVisible()) { 
RDebugUtils.currentLine=3670018;
 //BA.debugLineNum = 3670018;BA.debugLine="webErgebnis.Top = 425dip";
__ref._webergebnis /*anywheresoftware.b4a.objects.WebViewWrapper*/ .setTop(__c.DipToCurrent((int) (425)));
RDebugUtils.currentLine=3670019;
 //BA.debugLineNum = 3670019;BA.debugLine="webErgebnis.Height = 100%y - 425dip";
__ref._webergebnis /*anywheresoftware.b4a.objects.WebViewWrapper*/ .setHeight((int) (__c.PerYToCurrent((float) (100),ba)-__c.DipToCurrent((int) (425))));
 }else {
RDebugUtils.currentLine=3670021;
 //BA.debugLineNum = 3670021;BA.debugLine="webErgebnis.Top = 126dip";
__ref._webergebnis /*anywheresoftware.b4a.objects.WebViewWrapper*/ .setTop(__c.DipToCurrent((int) (126)));
RDebugUtils.currentLine=3670022;
 //BA.debugLineNum = 3670022;BA.debugLine="webErgebnis.Height = 100%y - 126dip";
__ref._webergebnis /*anywheresoftware.b4a.objects.WebViewWrapper*/ .setHeight((int) (__c.PerYToCurrent((float) (100),ba)-__c.DipToCurrent((int) (126))));
 };
RDebugUtils.currentLine=3670024;
 //BA.debugLineNum = 3670024;BA.debugLine="End Sub";
return "";
}
public String  _btnfdjback_click(b4a.example.screenmain __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="screenmain";
if (Debug.shouldDelegate(ba, "btnfdjback_click", false))
	 {return ((String) Debug.delegate(ba, "btnfdjback_click", null));}
RDebugUtils.currentLine=6356992;
 //BA.debugLineNum = 6356992;BA.debugLine="Private Sub btnFDJback_Click";
RDebugUtils.currentLine=6356993;
 //BA.debugLineNum = 6356993;BA.debugLine="vaErgEingabe.Visible = True";
__ref._vaergeingabe /*anywheresoftware.b4a.objects.PanelWrapper*/ .setVisible(__c.True);
RDebugUtils.currentLine=6356994;
 //BA.debugLineNum = 6356994;BA.debugLine="vaFDJ.Visible = False";
__ref._vafdj /*anywheresoftware.b4a.objects.PanelWrapper*/ .setVisible(__c.False);
RDebugUtils.currentLine=6356995;
 //BA.debugLineNum = 6356995;BA.debugLine="startTimer";
__ref._starttimer /*String*/ (null);
RDebugUtils.currentLine=6356996;
 //BA.debugLineNum = 6356996;BA.debugLine="End Sub";
return "";
}
public String  _btnfdjeingabe_click(b4a.example.screenmain __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="screenmain";
if (Debug.shouldDelegate(ba, "btnfdjeingabe_click", false))
	 {return ((String) Debug.delegate(ba, "btnfdjeingabe_click", null));}
RDebugUtils.currentLine=6291456;
 //BA.debugLineNum = 6291456;BA.debugLine="Private Sub btnFDJeingabe_Click";
RDebugUtils.currentLine=6291457;
 //BA.debugLineNum = 6291457;BA.debugLine="vaErgEingabe.Visible = False";
__ref._vaergeingabe /*anywheresoftware.b4a.objects.PanelWrapper*/ .setVisible(__c.False);
RDebugUtils.currentLine=6291458;
 //BA.debugLineNum = 6291458;BA.debugLine="vaFDJ.Visible = True";
__ref._vafdj /*anywheresoftware.b4a.objects.PanelWrapper*/ .setVisible(__c.True);
RDebugUtils.currentLine=6291459;
 //BA.debugLineNum = 6291459;BA.debugLine="tbxFDJgewicht.Enabled = True";
__ref._tbxfdjgewicht /*anywheresoftware.b4a.objects.EditTextWrapper*/ .setEnabled(__c.True);
RDebugUtils.currentLine=6291460;
 //BA.debugLineNum = 6291460;BA.debugLine="btnFDJsave.Enabled = False";
__ref._btnfdjsave /*anywheresoftware.b4a.objects.ButtonWrapper*/ .setEnabled(__c.False);
RDebugUtils.currentLine=6291461;
 //BA.debugLineNum = 6291461;BA.debugLine="btnFDJsave.TextColor = 0xFF888888";
__ref._btnfdjsave /*anywheresoftware.b4a.objects.ButtonWrapper*/ .setTextColor(((int)0xff888888));
RDebugUtils.currentLine=6291462;
 //BA.debugLineNum = 6291462;BA.debugLine="tbxFDJgewicht.SelectionStart = tbxFDJgewicht.Text";
__ref._tbxfdjgewicht /*anywheresoftware.b4a.objects.EditTextWrapper*/ .setSelectionStart(__ref._tbxfdjgewicht /*anywheresoftware.b4a.objects.EditTextWrapper*/ .getText().length());
RDebugUtils.currentLine=6291463;
 //BA.debugLineNum = 6291463;BA.debugLine="tbxFDJgewicht.RequestFocus";
__ref._tbxfdjgewicht /*anywheresoftware.b4a.objects.EditTextWrapper*/ .RequestFocus();
RDebugUtils.currentLine=6291464;
 //BA.debugLineNum = 6291464;BA.debugLine="startTimer";
__ref._starttimer /*String*/ (null);
RDebugUtils.currentLine=6291465;
 //BA.debugLineNum = 6291465;BA.debugLine="End Sub";
return "";
}
public String  _btnfdjsave_click(b4a.example.screenmain __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="screenmain";
if (Debug.shouldDelegate(ba, "btnfdjsave_click", false))
	 {return ((String) Debug.delegate(ba, "btnfdjsave_click", null));}
RDebugUtils.currentLine=6422528;
 //BA.debugLineNum = 6422528;BA.debugLine="Private Sub btnFDJsave_Click";
RDebugUtils.currentLine=6422529;
 //BA.debugLineNum = 6422529;BA.debugLine="vaErgEingabe.Visible = True";
__ref._vaergeingabe /*anywheresoftware.b4a.objects.PanelWrapper*/ .setVisible(__c.True);
RDebugUtils.currentLine=6422530;
 //BA.debugLineNum = 6422530;BA.debugLine="vaFDJ.Visible = False";
__ref._vafdj /*anywheresoftware.b4a.objects.PanelWrapper*/ .setVisible(__c.False);
RDebugUtils.currentLine=6422531;
 //BA.debugLineNum = 6422531;BA.debugLine="tbxFDJgewicht.Enabled = False";
__ref._tbxfdjgewicht /*anywheresoftware.b4a.objects.EditTextWrapper*/ .setEnabled(__c.False);
RDebugUtils.currentLine=6422532;
 //BA.debugLineNum = 6422532;BA.debugLine="btnFDJsave.Enabled = False";
__ref._btnfdjsave /*anywheresoftware.b4a.objects.ButtonWrapper*/ .setEnabled(__c.False);
RDebugUtils.currentLine=6422533;
 //BA.debugLineNum = 6422533;BA.debugLine="HideKeyboard";
__ref._hidekeyboard /*String*/ (null);
RDebugUtils.currentLine=6422535;
 //BA.debugLineNum = 6422535;BA.debugLine="RunJS(\"setzeFDJ(\" & QUOTE & tbxFDJgewicht.Text &";
__ref._runjs /*String*/ (null,"setzeFDJ("+__c.QUOTE+__ref._tbxfdjgewicht /*anywheresoftware.b4a.objects.EditTextWrapper*/ .getText()+__c.QUOTE+","+__c.QUOTE+__ref._tbxteilnehmer /*anywheresoftware.b4a.objects.EditTextWrapper*/ .getText()+__c.QUOTE+");");
RDebugUtils.currentLine=6422536;
 //BA.debugLineNum = 6422536;BA.debugLine="DBPut(\"FDJTeilnehmer\", tbxTeilnehmer.Text)";
__ref._dbput /*String*/ (null,"FDJTeilnehmer",(Object)(__ref._tbxteilnehmer /*anywheresoftware.b4a.objects.EditTextWrapper*/ .getText()));
RDebugUtils.currentLine=6422537;
 //BA.debugLineNum = 6422537;BA.debugLine="DBPut(\"FDJGewicht\", tbxFDJgewicht.Text)";
__ref._dbput /*String*/ (null,"FDJGewicht",(Object)(__ref._tbxfdjgewicht /*anywheresoftware.b4a.objects.EditTextWrapper*/ .getText()));
RDebugUtils.currentLine=6422538;
 //BA.debugLineNum = 6422538;BA.debugLine="saveFDJ";
__ref._savefdj /*String*/ (null);
RDebugUtils.currentLine=6422539;
 //BA.debugLineNum = 6422539;BA.debugLine="startTimer";
__ref._starttimer /*String*/ (null);
RDebugUtils.currentLine=6422540;
 //BA.debugLineNum = 6422540;BA.debugLine="End Sub";
return "";
}
public String  _hidekeyboard(b4a.example.screenmain __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="screenmain";
if (Debug.shouldDelegate(ba, "hidekeyboard", false))
	 {return ((String) Debug.delegate(ba, "hidekeyboard", null));}
anywheresoftware.b4a.phone.Phone _p = null;
RDebugUtils.currentLine=7208960;
 //BA.debugLineNum = 7208960;BA.debugLine="Private Sub HideKeyboard";
RDebugUtils.currentLine=7208961;
 //BA.debugLineNum = 7208961;BA.debugLine="Dim p As Phone";
_p = new anywheresoftware.b4a.phone.Phone();
RDebugUtils.currentLine=7208962;
 //BA.debugLineNum = 7208962;BA.debugLine="p.HideKeyboard(B4XPages.GetNativeParent(Me))";
_p.HideKeyboard(_b4xpages._getnativeparent /*anywheresoftware.b4a.objects.ActivityWrapper*/ (ba,this));
RDebugUtils.currentLine=7208963;
 //BA.debugLineNum = 7208963;BA.debugLine="End Sub";
return "";
}
public String  _runjs(b4a.example.screenmain __ref,String _jscode) throws Exception{
__ref = this;
RDebugUtils.currentModule="screenmain";
if (Debug.shouldDelegate(ba, "runjs", false))
	 {return ((String) Debug.delegate(ba, "runjs", new Object[] {_jscode}));}
anywheresoftware.b4j.object.JavaObject _jo = null;
RDebugUtils.currentLine=4194304;
 //BA.debugLineNum = 4194304;BA.debugLine="Private Sub RunJS(jsCode As String)";
RDebugUtils.currentLine=4194305;
 //BA.debugLineNum = 4194305;BA.debugLine="Dim jo As JavaObject = webErgebnis";
_jo = new anywheresoftware.b4j.object.JavaObject();
_jo = (anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(__ref._webergebnis /*anywheresoftware.b4a.objects.WebViewWrapper*/ .getObject()));
RDebugUtils.currentLine=4194306;
 //BA.debugLineNum = 4194306;BA.debugLine="jo.RunMethod(\"evaluateJavascript\", Array As Objec";
_jo.RunMethod("evaluateJavascript",new Object[]{(Object)(_jscode),__c.Null});
RDebugUtils.currentLine=4194307;
 //BA.debugLineNum = 4194307;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=4784128;
 //BA.debugLineNum = 4784128;BA.debugLine="Private Sub saveFDJ";
RDebugUtils.currentLine=4784129;
 //BA.debugLineNum = 4784129;BA.debugLine="DBdatenTyp = \"FDJ\"";
__ref._dbdatentyp /*String*/  = "FDJ";
RDebugUtils.currentLine=4784130;
 //BA.debugLineNum = 4784130;BA.debugLine="Dim verDatum As String = DBGet(\"VeranstaltungDatu";
_verdatum = BA.ObjectToString(__ref._dbget /*Object*/ (null,"VeranstaltungDatum",(Object)("00.00.0000")));
RDebugUtils.currentLine=4784131;
 //BA.debugLineNum = 4784131;BA.debugLine="Dim parts() As String = Regex.Split(\"\\.\", verDatu";
_parts = __c.Regex.Split("\\.",_verdatum);
RDebugUtils.currentLine=4784132;
 //BA.debugLineNum = 4784132;BA.debugLine="CurrentWebUrl = URLfdj.Replace(\"[xxxx]\", parts(2)";
__ref._currentweburl /*String*/  = __ref._urlfdj /*String*/ .replace("[xxxx]",_parts[(int) (2)])+".json?auth="+BA.ObjectToString(__ref._status /*anywheresoftware.b4a.objects.collections.Map*/ .GetDefault((Object)("idToken"),(Object)("")));
RDebugUtils.currentLine=4784134;
 //BA.debugLineNum = 4784134;BA.debugLine="Dim body As Map = CreateMap( _ 		\"Gewicht\": DBGet";
_body = new anywheresoftware.b4a.objects.collections.Map();
_body = __c.createMap(new Object[] {(Object)("Gewicht"),__ref._dbget /*Object*/ (null,"FDJGewicht",(Object)("0")),(Object)("Teilnehmer"),__ref._dbget /*Object*/ (null,"FDJTeilnehmer",(Object)("- noch offen -"))});
RDebugUtils.currentLine=4784137;
 //BA.debugLineNum = 4784137;BA.debugLine="DBPut(\"letzteÄnderung\", CreateMap(\"Änderung\": Tru";
__ref._dbput /*String*/ (null,"letzteÄnderung",(Object)(__c.createMap(new Object[] {(Object)("Änderung"),(Object)(__c.True),(Object)("Datum"),(Object)(__ref._zeitstempel /*String*/ (null))}).getObject()));
RDebugUtils.currentLine=4784139;
 //BA.debugLineNum = 4784139;BA.debugLine="Dim jg As JSONGenerator";
_jg = new anywheresoftware.b4a.objects.collections.JSONParser.JSONGenerator();
RDebugUtils.currentLine=4784140;
 //BA.debugLineNum = 4784140;BA.debugLine="jg.Initialize(body)";
_jg.Initialize(_body);
RDebugUtils.currentLine=4784141;
 //BA.debugLineNum = 4784141;BA.debugLine="PatchTextWeb(jg.ToString)";
__ref._patchtextweb /*String*/ (null,_jg.ToString());
RDebugUtils.currentLine=4784142;
 //BA.debugLineNum = 4784142;BA.debugLine="End Sub";
return "";
}
public String  _btnminus_click(b4a.example.screenmain __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="screenmain";
if (Debug.shouldDelegate(ba, "btnminus_click", false))
	 {return ((String) Debug.delegate(ba, "btnminus_click", null));}
RDebugUtils.currentLine=5963776;
 //BA.debugLineNum = 5963776;BA.debugLine="Private Sub btnMinus_Click";
RDebugUtils.currentLine=5963777;
 //BA.debugLineNum = 5963777;BA.debugLine="If PlatzSelected > 1 Then";
if (__ref._platzselected /*int*/ >1) { 
RDebugUtils.currentLine=5963778;
 //BA.debugLineNum = 5963778;BA.debugLine="If btnSpeichern.Enabled Then speichern";
if (__ref._btnspeichern /*anywheresoftware.b4a.objects.ButtonWrapper*/ .getEnabled()) { 
__ref._speichern /*String*/ (null);};
RDebugUtils.currentLine=5963779;
 //BA.debugLineNum = 5963779;BA.debugLine="SelectNewRow = PlatzSelected - 1";
__ref._selectnewrow /*int*/  = (int) (__ref._platzselected /*int*/ -1);
RDebugUtils.currentLine=5963780;
 //BA.debugLineNum = 5963780;BA.debugLine="If Not(btnSpeichern.Enabled) Then";
if (__c.Not(__ref._btnspeichern /*anywheresoftware.b4a.objects.ButtonWrapper*/ .getEnabled())) { 
RDebugUtils.currentLine=5963781;
 //BA.debugLineNum = 5963781;BA.debugLine="RunJS(\"selectRowById(\" & SelectNewRow & \");\")";
__ref._runjs /*String*/ (null,"selectRowById("+BA.NumberToString(__ref._selectnewrow /*int*/ )+");");
 };
 };
RDebugUtils.currentLine=5963784;
 //BA.debugLineNum = 5963784;BA.debugLine="startTimer";
__ref._starttimer /*String*/ (null);
RDebugUtils.currentLine=5963785;
 //BA.debugLineNum = 5963785;BA.debugLine="End Sub";
return "";
}
public String  _speichern(b4a.example.screenmain __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="screenmain";
if (Debug.shouldDelegate(ba, "speichern", false))
	 {return ((String) Debug.delegate(ba, "speichern", null));}
double _val = 0;
int _position = 0;
RDebugUtils.currentLine=4653056;
 //BA.debugLineNum = 4653056;BA.debugLine="Private Sub speichern";
RDebugUtils.currentLine=4653057;
 //BA.debugLineNum = 4653057;BA.debugLine="If Not(IsNumber(tbxGramm.Text)) Then";
if (__c.Not(__c.IsNumber(__ref._tbxgramm /*anywheresoftware.b4a.objects.EditTextWrapper*/ .getText()))) { 
RDebugUtils.currentLine=4653058;
 //BA.debugLineNum = 4653058;BA.debugLine="tbxGramm.Text = \"0\"";
__ref._tbxgramm /*anywheresoftware.b4a.objects.EditTextWrapper*/ .setText(BA.ObjectToCharSequence("0"));
 }else {
RDebugUtils.currentLine=4653060;
 //BA.debugLineNum = 4653060;BA.debugLine="Dim val As Double = tbxGramm.Text";
_val = (double)(Double.parseDouble(__ref._tbxgramm /*anywheresoftware.b4a.objects.EditTextWrapper*/ .getText()));
RDebugUtils.currentLine=4653061;
 //BA.debugLineNum = 4653061;BA.debugLine="tbxGramm.Text = NumberFormat2(val, 1, 0, 0, Fals";
__ref._tbxgramm /*anywheresoftware.b4a.objects.EditTextWrapper*/ .setText(BA.ObjectToCharSequence(__c.NumberFormat2(_val,(int) (1),(int) (0),(int) (0),__c.False)));
 };
RDebugUtils.currentLine=4653064;
 //BA.debugLineNum = 4653064;BA.debugLine="Dim position As Int = PlatzSelected * 4 ' 0-basie";
_position = (int) (__ref._platzselected /*int*/ *4);
RDebugUtils.currentLine=4653065;
 //BA.debugLineNum = 4653065;BA.debugLine="If webviewData.Size > position + 2 Then";
if (__ref._webviewdata /*anywheresoftware.b4a.objects.collections.List*/ .getSize()>_position+2) { 
RDebugUtils.currentLine=4653066;
 //BA.debugLineNum = 4653066;BA.debugLine="webviewData.Set(position + 2, tbxGramm.Text)";
__ref._webviewdata /*anywheresoftware.b4a.objects.collections.List*/ .Set((int) (_position+2),(Object)(__ref._tbxgramm /*anywheresoftware.b4a.objects.EditTextWrapper*/ .getText()));
RDebugUtils.currentLine=4653067;
 //BA.debugLineNum = 4653067;BA.debugLine="webviewData.Set(position + 1, tbxTeilnehmer.Text";
__ref._webviewdata /*anywheresoftware.b4a.objects.collections.List*/ .Set((int) (_position+1),(Object)(__ref._tbxteilnehmer /*anywheresoftware.b4a.objects.EditTextWrapper*/ .getText().trim()));
 };
RDebugUtils.currentLine=4653069;
 //BA.debugLineNum = 4653069;BA.debugLine="saveWertungsliste(\"saveWertungsliste\")";
__ref._savewertungsliste /*String*/ (null,"saveWertungsliste");
RDebugUtils.currentLine=4653070;
 //BA.debugLineNum = 4653070;BA.debugLine="End Sub";
return "";
}
public String  _btnplus_click(b4a.example.screenmain __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="screenmain";
if (Debug.shouldDelegate(ba, "btnplus_click", false))
	 {return ((String) Debug.delegate(ba, "btnplus_click", null));}
int _maxanzahl = 0;
RDebugUtils.currentLine=6029312;
 //BA.debugLineNum = 6029312;BA.debugLine="Private Sub btnPlus_Click";
RDebugUtils.currentLine=6029313;
 //BA.debugLineNum = 6029313;BA.debugLine="Dim maxAnzahl As Int = DBGet(\"VeranstaltungAnzahl";
_maxanzahl = (int)(BA.ObjectToNumber(__ref._dbget /*Object*/ (null,"VeranstaltungAnzahl",(Object)("25"))));
RDebugUtils.currentLine=6029314;
 //BA.debugLineNum = 6029314;BA.debugLine="If PlatzSelected < maxAnzahl Then";
if (__ref._platzselected /*int*/ <_maxanzahl) { 
RDebugUtils.currentLine=6029315;
 //BA.debugLineNum = 6029315;BA.debugLine="If btnSpeichern.Enabled Then speichern";
if (__ref._btnspeichern /*anywheresoftware.b4a.objects.ButtonWrapper*/ .getEnabled()) { 
__ref._speichern /*String*/ (null);};
RDebugUtils.currentLine=6029316;
 //BA.debugLineNum = 6029316;BA.debugLine="SelectNewRow = PlatzSelected + 1";
__ref._selectnewrow /*int*/  = (int) (__ref._platzselected /*int*/ +1);
RDebugUtils.currentLine=6029317;
 //BA.debugLineNum = 6029317;BA.debugLine="If Not(btnSpeichern.Enabled) Then";
if (__c.Not(__ref._btnspeichern /*anywheresoftware.b4a.objects.ButtonWrapper*/ .getEnabled())) { 
RDebugUtils.currentLine=6029318;
 //BA.debugLineNum = 6029318;BA.debugLine="RunJS(\"selectRowById(\" & SelectNewRow & \");\")";
__ref._runjs /*String*/ (null,"selectRowById("+BA.NumberToString(__ref._selectnewrow /*int*/ )+");");
 };
 };
RDebugUtils.currentLine=6029321;
 //BA.debugLineNum = 6029321;BA.debugLine="startTimer";
__ref._starttimer /*String*/ (null);
RDebugUtils.currentLine=6029322;
 //BA.debugLineNum = 6029322;BA.debugLine="End Sub";
return "";
}
public Object  _dbget(b4a.example.screenmain __ref,String _key,Object _defaultvalue) throws Exception{
__ref = this;
RDebugUtils.currentModule="screenmain";
if (Debug.shouldDelegate(ba, "dbget", false))
	 {return ((Object) Debug.delegate(ba, "dbget", new Object[] {_key,_defaultvalue}));}
String _val = "";
anywheresoftware.b4a.objects.collections.JSONParser _jp = null;
RDebugUtils.currentLine=7405568;
 //BA.debugLineNum = 7405568;BA.debugLine="Private Sub DBGet(Key As String, DefaultValue As O";
RDebugUtils.currentLine=7405569;
 //BA.debugLineNum = 7405569;BA.debugLine="If DBVerein.ContainsKey(Key) = False Then Return";
if (__ref._dbverein /*anywheresoftware.b4a.objects.collections.Map*/ .ContainsKey((Object)(_key))==__c.False) { 
if (true) return _defaultvalue;};
RDebugUtils.currentLine=7405570;
 //BA.debugLineNum = 7405570;BA.debugLine="Dim val As String = DBVerein.Get(Key)";
_val = BA.ObjectToString(__ref._dbverein /*anywheresoftware.b4a.objects.collections.Map*/ .Get((Object)(_key)));
RDebugUtils.currentLine=7405571;
 //BA.debugLineNum = 7405571;BA.debugLine="If val.StartsWith(\"JSON_MAP:\") Then";
if (_val.startsWith("JSON_MAP:")) { 
RDebugUtils.currentLine=7405572;
 //BA.debugLineNum = 7405572;BA.debugLine="Dim jp As JSONParser";
_jp = new anywheresoftware.b4a.objects.collections.JSONParser();
RDebugUtils.currentLine=7405573;
 //BA.debugLineNum = 7405573;BA.debugLine="jp.Initialize(val.SubString(9))";
_jp.Initialize(_val.substring((int) (9)));
RDebugUtils.currentLine=7405574;
 //BA.debugLineNum = 7405574;BA.debugLine="Return jp.NextObject";
if (true) return (Object)(_jp.NextObject().getObject());
 }else 
{RDebugUtils.currentLine=7405575;
 //BA.debugLineNum = 7405575;BA.debugLine="Else If val.StartsWith(\"JSON_LIST:\") Then";
if (_val.startsWith("JSON_LIST:")) { 
RDebugUtils.currentLine=7405576;
 //BA.debugLineNum = 7405576;BA.debugLine="Dim jp As JSONParser";
_jp = new anywheresoftware.b4a.objects.collections.JSONParser();
RDebugUtils.currentLine=7405577;
 //BA.debugLineNum = 7405577;BA.debugLine="jp.Initialize(val.SubString(10))";
_jp.Initialize(_val.substring((int) (10)));
RDebugUtils.currentLine=7405578;
 //BA.debugLineNum = 7405578;BA.debugLine="Return jp.NextArray";
if (true) return (Object)(_jp.NextArray().getObject());
 }}
;
RDebugUtils.currentLine=7405580;
 //BA.debugLineNum = 7405580;BA.debugLine="Return val";
if (true) return (Object)(_val);
RDebugUtils.currentLine=7405581;
 //BA.debugLineNum = 7405581;BA.debugLine="End Sub";
return null;
}
public String  _btnsettings_click(b4a.example.screenmain __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="screenmain";
if (Debug.shouldDelegate(ba, "btnsettings_click", false))
	 {return ((String) Debug.delegate(ba, "btnsettings_click", null));}
RDebugUtils.currentLine=5636096;
 //BA.debugLineNum = 5636096;BA.debugLine="Private Sub btnSettings_Click";
RDebugUtils.currentLine=5636097;
 //BA.debugLineNum = 5636097;BA.debugLine="Uhrzeit.Enabled = False";
__ref._uhrzeit /*anywheresoftware.b4a.objects.Timer*/ .setEnabled(__c.False);
RDebugUtils.currentLine=5636098;
 //BA.debugLineNum = 5636098;BA.debugLine="OpenSettingsPage";
__ref._opensettingspage /*String*/ (null);
RDebugUtils.currentLine=5636099;
 //BA.debugLineNum = 5636099;BA.debugLine="End Sub";
return "";
}
public String  _opensettingspage(b4a.example.screenmain __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="screenmain";
if (Debug.shouldDelegate(ba, "opensettingspage", false))
	 {return ((String) Debug.delegate(ba, "opensettingspage", null));}
RDebugUtils.currentLine=5701632;
 //BA.debugLineNum = 5701632;BA.debugLine="Private Sub OpenSettingsPage";
RDebugUtils.currentLine=5701633;
 //BA.debugLineNum = 5701633;BA.debugLine="B4XPages.ShowPage(\"Settings\")";
_b4xpages._showpage /*String*/ (ba,"Settings");
RDebugUtils.currentLine=5701634;
 //BA.debugLineNum = 5701634;BA.debugLine="ToastMessageShow(\"Wechsel zu Settings\", False)";
__c.ToastMessageShow(BA.ObjectToCharSequence("Wechsel zu Settings"),__c.False);
RDebugUtils.currentLine=5701635;
 //BA.debugLineNum = 5701635;BA.debugLine="End Sub";
return "";
}
public String  _btnshare_click(b4a.example.screenmain __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="screenmain";
if (Debug.shouldDelegate(ba, "btnshare_click", false))
	 {return ((String) Debug.delegate(ba, "btnshare_click", null));}
RDebugUtils.currentLine=6225920;
 //BA.debugLineNum = 6225920;BA.debugLine="Private Sub btnShare_Click";
RDebugUtils.currentLine=6225921;
 //BA.debugLineNum = 6225921;BA.debugLine="RunJS(\"printView();\")";
__ref._runjs /*String*/ (null,"printView();");
RDebugUtils.currentLine=6225922;
 //BA.debugLineNum = 6225922;BA.debugLine="startTimer";
__ref._starttimer /*String*/ (null);
RDebugUtils.currentLine=6225923;
 //BA.debugLineNum = 6225923;BA.debugLine="End Sub";
return "";
}
public String  _btnspeichern_click(b4a.example.screenmain __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="screenmain";
if (Debug.shouldDelegate(ba, "btnspeichern_click", false))
	 {return ((String) Debug.delegate(ba, "btnspeichern_click", null));}
RDebugUtils.currentLine=6094848;
 //BA.debugLineNum = 6094848;BA.debugLine="Private Sub btnSpeichern_Click";
RDebugUtils.currentLine=6094849;
 //BA.debugLineNum = 6094849;BA.debugLine="HideKeyboard";
__ref._hidekeyboard /*String*/ (null);
RDebugUtils.currentLine=6094850;
 //BA.debugLineNum = 6094850;BA.debugLine="speichern";
__ref._speichern /*String*/ (null);
RDebugUtils.currentLine=6094851;
 //BA.debugLineNum = 6094851;BA.debugLine="startTimer";
__ref._starttimer /*String*/ (null);
RDebugUtils.currentLine=6094852;
 //BA.debugLineNum = 6094852;BA.debugLine="End Sub";
return "";
}
public String  _btnup_click(b4a.example.screenmain __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="screenmain";
if (Debug.shouldDelegate(ba, "btnup_click", false))
	 {return ((String) Debug.delegate(ba, "btnup_click", null));}
RDebugUtils.currentLine=5767168;
 //BA.debugLineNum = 5767168;BA.debugLine="Private Sub btnUp_Click";
RDebugUtils.currentLine=5767169;
 //BA.debugLineNum = 5767169;BA.debugLine="vaEingabe.Visible = False";
__ref._vaeingabe /*anywheresoftware.b4a.objects.PanelWrapper*/ .setVisible(__c.False);
RDebugUtils.currentLine=5767170;
 //BA.debugLineNum = 5767170;BA.debugLine="haDown.Visible = True";
__ref._hadown /*anywheresoftware.b4a.objects.PanelWrapper*/ .setVisible(__c.True);
RDebugUtils.currentLine=5767171;
 //BA.debugLineNum = 5767171;BA.debugLine="btnDown.Visible = True";
__ref._btndown /*anywheresoftware.b4a.objects.ButtonWrapper*/ .setVisible(__c.True);
RDebugUtils.currentLine=5767172;
 //BA.debugLineNum = 5767172;BA.debugLine="UpdateLayoutPositions";
__ref._updatelayoutpositions /*String*/ (null);
RDebugUtils.currentLine=5767173;
 //BA.debugLineNum = 5767173;BA.debugLine="startTimer";
__ref._starttimer /*String*/ (null);
RDebugUtils.currentLine=5767174;
 //BA.debugLineNum = 5767174;BA.debugLine="End Sub";
return "";
}
public String  _setbuttonimagesafe(b4a.example.screenmain __ref,anywheresoftware.b4a.objects.ButtonWrapper _btn,String _filename,String _fallbacktext) throws Exception{
__ref = this;
RDebugUtils.currentModule="screenmain";
if (Debug.shouldDelegate(ba, "setbuttonimagesafe", false))
	 {return ((String) Debug.delegate(ba, "setbuttonimagesafe", new Object[] {_btn,_filename,_fallbacktext}));}
RDebugUtils.currentLine=3342336;
 //BA.debugLineNum = 3342336;BA.debugLine="Private Sub SetButtonImageSafe(btn As Button, file";
RDebugUtils.currentLine=3342337;
 //BA.debugLineNum = 3342337;BA.debugLine="If File.Exists(File.DirAssets, fileName) Then";
if (__c.File.Exists(__c.File.getDirAssets(),_filename)) { 
RDebugUtils.currentLine=3342338;
 //BA.debugLineNum = 3342338;BA.debugLine="btn.SetBackgroundImage(LoadBitmap(File.DirAssets";
_btn.SetBackgroundImageNew((android.graphics.Bitmap)(__c.LoadBitmap(__c.File.getDirAssets(),_filename).getObject()));
 }else {
RDebugUtils.currentLine=3342340;
 //BA.debugLineNum = 3342340;BA.debugLine="btn.Text = fallbackText";
_btn.setText(BA.ObjectToCharSequence(_fallbacktext));
 };
RDebugUtils.currentLine=3342342;
 //BA.debugLineNum = 3342342;BA.debugLine="End Sub";
return "";
}
public String  _setupwebviewbridge(b4a.example.screenmain __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="screenmain";
if (Debug.shouldDelegate(ba, "setupwebviewbridge", false))
	 {return ((String) Debug.delegate(ba, "setupwebviewbridge", null));}
anywheresoftware.b4j.object.JavaObject _jo = null;
RDebugUtils.currentLine=3407872;
 //BA.debugLineNum = 3407872;BA.debugLine="Private Sub SetupWebViewBridge";
RDebugUtils.currentLine=3407873;
 //BA.debugLineNum = 3407873;BA.debugLine="Dim jo As JavaObject = webErgebnis";
_jo = new anywheresoftware.b4j.object.JavaObject();
_jo = (anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(__ref._webergebnis /*anywheresoftware.b4a.objects.WebViewWrapper*/ .getObject()));
RDebugUtils.currentLine=3407874;
 //BA.debugLineNum = 3407874;BA.debugLine="jo.RunMethod(\"addJavascriptInterface\", Array As O";
_jo.RunMethod("addJavascriptInterface",new Object[]{this,(Object)("AppInventor")});
RDebugUtils.currentLine=3407875;
 //BA.debugLineNum = 3407875;BA.debugLine="End Sub";
return "";
}
public String  _changeurl(b4a.example.screenmain __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="screenmain";
if (Debug.shouldDelegate(ba, "changeurl", false))
	 {return ((String) Debug.delegate(ba, "changeurl", null));}
String _vid = "";
RDebugUtils.currentLine=3932160;
 //BA.debugLineNum = 3932160;BA.debugLine="Private Sub changeURL";
RDebugUtils.currentLine=3932161;
 //BA.debugLineNum = 3932161;BA.debugLine="Dim vID As String = DBGet(\"VereinsID\", \"[...]\")";
_vid = BA.ObjectToString(__ref._dbget /*Object*/ (null,"VereinsID",(Object)("[...]")));
RDebugUtils.currentLine=3932162;
 //BA.debugLineNum = 3932162;BA.debugLine="URLErgebnisse = URLErgebnisse.Replace(\"[...]\", vI";
__ref._urlergebnisse /*String*/  = __ref._urlergebnisse /*String*/ .replace("[...]",_vid);
RDebugUtils.currentLine=3932163;
 //BA.debugLineNum = 3932163;BA.debugLine="URLveranstaltungen = URLveranstaltungen.Replace(\"";
__ref._urlveranstaltungen /*String*/  = __ref._urlveranstaltungen /*String*/ .replace("[...]",_vid);
RDebugUtils.currentLine=3932164;
 //BA.debugLineNum = 3932164;BA.debugLine="URLteilnehmer = URLteilnehmer.Replace(\"[...]\", vI";
__ref._urlteilnehmer /*String*/  = __ref._urlteilnehmer /*String*/ .replace("[...]",_vid);
RDebugUtils.currentLine=3932165;
 //BA.debugLineNum = 3932165;BA.debugLine="URLlastChange = URLlastChange.Replace(\"[...]\", vI";
__ref._urllastchange /*String*/  = __ref._urllastchange /*String*/ .replace("[...]",_vid);
RDebugUtils.currentLine=3932166;
 //BA.debugLineNum = 3932166;BA.debugLine="URLfdj = URLfdj.Replace(\"[...]\", vID)";
__ref._urlfdj /*String*/  = __ref._urlfdj /*String*/ .replace("[...]",_vid);
RDebugUtils.currentLine=3932167;
 //BA.debugLineNum = 3932167;BA.debugLine="End Sub";
return "";
}
public String  _class_globals(b4a.example.screenmain __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="screenmain";
RDebugUtils.currentLine=2949120;
 //BA.debugLineNum = 2949120;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=2949121;
 //BA.debugLineNum = 2949121;BA.debugLine="Private Root As B4XView";
_root = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=2949122;
 //BA.debugLineNum = 2949122;BA.debugLine="Private xui As XUI";
_xui = new anywheresoftware.b4a.objects.B4XViewWrapper.XUI();
RDebugUtils.currentLine=2949125;
 //BA.debugLineNum = 2949125;BA.debugLine="Public DBdatenTyp As String = \"\"";
_dbdatentyp = "";
RDebugUtils.currentLine=2949126;
 //BA.debugLineNum = 2949126;BA.debugLine="Public URLtest As String = \"https://console.fireb";
_urltest = "https://console.firebase.google.com";
RDebugUtils.currentLine=2949127;
 //BA.debugLineNum = 2949127;BA.debugLine="Public Teilnehmer As List";
_teilnehmer = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=2949128;
 //BA.debugLineNum = 2949128;BA.debugLine="Public URLveranstaltungen As String = \"https://we";
_urlveranstaltungen = "https://wertungslisten-app-default-rtdb.europe-west1.firebasedatabase.app/Vereine/[...]/Veranstaltungen/";
RDebugUtils.currentLine=2949129;
 //BA.debugLineNum = 2949129;BA.debugLine="Public TLNlastID As String = \"t0\"";
_tlnlastid = "t0";
RDebugUtils.currentLine=2949130;
 //BA.debugLineNum = 2949130;BA.debugLine="Public URLteilnehmer As String = \"https://wertung";
_urlteilnehmer = "https://wertungslisten-app-default-rtdb.europe-west1.firebasedatabase.app/Vereine/[...]/Teilnehmer";
RDebugUtils.currentLine=2949131;
 //BA.debugLineNum = 2949131;BA.debugLine="Public webviewData As List";
_webviewdata = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=2949132;
 //BA.debugLineNum = 2949132;BA.debugLine="Public URLErgebnisse As String = \"https://wertung";
_urlergebnisse = "https://wertungslisten-app-default-rtdb.europe-west1.firebasedatabase.app/Vereine/[...]/Ergebnisse/";
RDebugUtils.currentLine=2949133;
 //BA.debugLineNum = 2949133;BA.debugLine="Public PlatzSelected As Int = 1";
_platzselected = (int) (1);
RDebugUtils.currentLine=2949134;
 //BA.debugLineNum = 2949134;BA.debugLine="Public URLfdj As String = \"https://wertungslisten";
_urlfdj = "https://wertungslisten-app-default-rtdb.europe-west1.firebasedatabase.app/Vereine/[...]/Ergebnisse/fdj[xxxx]";
RDebugUtils.currentLine=2949135;
 //BA.debugLineNum = 2949135;BA.debugLine="Public SelectNewRow As Int = 0";
_selectnewrow = (int) (0);
RDebugUtils.currentLine=2949136;
 //BA.debugLineNum = 2949136;BA.debugLine="Public URLlastChange As String = \"https://wertung";
_urllastchange = "https://wertungslisten-app-default-rtdb.europe-west1.firebasedatabase.app/Vereine/[...]/LastChange";
RDebugUtils.currentLine=2949137;
 //BA.debugLineNum = 2949137;BA.debugLine="Public dochange As Boolean = True";
_dochange = __c.True;
RDebugUtils.currentLine=2949138;
 //BA.debugLineNum = 2949138;BA.debugLine="Public addTLN As Boolean = False";
_addtln = __c.False;
RDebugUtils.currentLine=2949139;
 //BA.debugLineNum = 2949139;BA.debugLine="Public VSTNGgeschlossen As Boolean = False";
_vstnggeschlossen = __c.False;
RDebugUtils.currentLine=2949140;
 //BA.debugLineNum = 2949140;BA.debugLine="Public Status As Map";
_status = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=2949141;
 //BA.debugLineNum = 2949141;BA.debugLine="Public colorgreen As Int = 0xFF16AA16";
_colorgreen = ((int)0xff16aa16);
RDebugUtils.currentLine=2949144;
 //BA.debugLineNum = 2949144;BA.debugLine="Private lblVerein As Label";
_lblverein = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=2949145;
 //BA.debugLineNum = 2949145;BA.debugLine="Private lblVeranstaltung As Label";
_lblveranstaltung = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=2949146;
 //BA.debugLineNum = 2949146;BA.debugLine="Private lblDatum As Label";
_lbldatum = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=2949147;
 //BA.debugLineNum = 2949147;BA.debugLine="Private btnSettings As Button";
_btnsettings = new anywheresoftware.b4a.objects.ButtonWrapper();
RDebugUtils.currentLine=2949149;
 //BA.debugLineNum = 2949149;BA.debugLine="Private vaEingabe As Panel";
_vaeingabe = new anywheresoftware.b4a.objects.PanelWrapper();
RDebugUtils.currentLine=2949150;
 //BA.debugLineNum = 2949150;BA.debugLine="Private btnCloseVstng As Button";
_btnclosevstng = new anywheresoftware.b4a.objects.ButtonWrapper();
RDebugUtils.currentLine=2949151;
 //BA.debugLineNum = 2949151;BA.debugLine="Private btnUp As Button";
_btnup = new anywheresoftware.b4a.objects.ButtonWrapper();
RDebugUtils.currentLine=2949152;
 //BA.debugLineNum = 2949152;BA.debugLine="Private btnMinus As Button";
_btnminus = new anywheresoftware.b4a.objects.ButtonWrapper();
RDebugUtils.currentLine=2949153;
 //BA.debugLineNum = 2949153;BA.debugLine="Private spnPlatz As Spinner";
_spnplatz = new anywheresoftware.b4a.objects.SpinnerWrapper();
RDebugUtils.currentLine=2949154;
 //BA.debugLineNum = 2949154;BA.debugLine="Private btnPlus As Button";
_btnplus = new anywheresoftware.b4a.objects.ButtonWrapper();
RDebugUtils.currentLine=2949155;
 //BA.debugLineNum = 2949155;BA.debugLine="Private tbxTeilnehmer As EditText";
_tbxteilnehmer = new anywheresoftware.b4a.objects.EditTextWrapper();
RDebugUtils.currentLine=2949156;
 //BA.debugLineNum = 2949156;BA.debugLine="Private lsvName As ListView";
_lsvname = new anywheresoftware.b4a.objects.ListViewWrapper();
RDebugUtils.currentLine=2949158;
 //BA.debugLineNum = 2949158;BA.debugLine="Private vaErgEingabe As Panel";
_vaergeingabe = new anywheresoftware.b4a.objects.PanelWrapper();
RDebugUtils.currentLine=2949159;
 //BA.debugLineNum = 2949159;BA.debugLine="Private btnFDJeingabe As Button";
_btnfdjeingabe = new anywheresoftware.b4a.objects.ButtonWrapper();
RDebugUtils.currentLine=2949160;
 //BA.debugLineNum = 2949160;BA.debugLine="Private tbxGramm As EditText";
_tbxgramm = new anywheresoftware.b4a.objects.EditTextWrapper();
RDebugUtils.currentLine=2949161;
 //BA.debugLineNum = 2949161;BA.debugLine="Private btnSpeichern As Button";
_btnspeichern = new anywheresoftware.b4a.objects.ButtonWrapper();
RDebugUtils.currentLine=2949163;
 //BA.debugLineNum = 2949163;BA.debugLine="Private vaFDJ As Panel";
_vafdj = new anywheresoftware.b4a.objects.PanelWrapper();
RDebugUtils.currentLine=2949164;
 //BA.debugLineNum = 2949164;BA.debugLine="Private btnFDJback As Button";
_btnfdjback = new anywheresoftware.b4a.objects.ButtonWrapper();
RDebugUtils.currentLine=2949165;
 //BA.debugLineNum = 2949165;BA.debugLine="Private tbxFDJgewicht As EditText";
_tbxfdjgewicht = new anywheresoftware.b4a.objects.EditTextWrapper();
RDebugUtils.currentLine=2949166;
 //BA.debugLineNum = 2949166;BA.debugLine="Private btnFDJsave As Button";
_btnfdjsave = new anywheresoftware.b4a.objects.ButtonWrapper();
RDebugUtils.currentLine=2949168;
 //BA.debugLineNum = 2949168;BA.debugLine="Private haDown As Panel";
_hadown = new anywheresoftware.b4a.objects.PanelWrapper();
RDebugUtils.currentLine=2949169;
 //BA.debugLineNum = 2949169;BA.debugLine="Private btnShare As Button";
_btnshare = new anywheresoftware.b4a.objects.ButtonWrapper();
RDebugUtils.currentLine=2949170;
 //BA.debugLineNum = 2949170;BA.debugLine="Private btnDown As Button";
_btndown = new anywheresoftware.b4a.objects.ButtonWrapper();
RDebugUtils.currentLine=2949172;
 //BA.debugLineNum = 2949172;BA.debugLine="Private webErgebnis As WebView";
_webergebnis = new anywheresoftware.b4a.objects.WebViewWrapper();
RDebugUtils.currentLine=2949175;
 //BA.debugLineNum = 2949175;BA.debugLine="Private Uhrzeit As Timer";
_uhrzeit = new anywheresoftware.b4a.objects.Timer();
RDebugUtils.currentLine=2949176;
 //BA.debugLineNum = 2949176;BA.debugLine="Private DBVerein As Map";
_dbverein = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=2949177;
 //BA.debugLineNum = 2949177;BA.debugLine="Private DBFileName As String = \"DBVerein.dat\"";
_dbfilename = "DBVerein.dat";
RDebugUtils.currentLine=2949178;
 //BA.debugLineNum = 2949178;BA.debugLine="Private CurrentWebUrl As String = \"\"";
_currentweburl = "";
RDebugUtils.currentLine=2949179;
 //BA.debugLineNum = 2949179;BA.debugLine="Private CurrentWebViewString As String = \"\"";
_currentwebviewstring = "";
RDebugUtils.currentLine=2949180;
 //BA.debugLineNum = 2949180;BA.debugLine="Private spnItems As List";
_spnitems = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=2949181;
 //BA.debugLineNum = 2949181;BA.debugLine="End Sub";
return "";
}
public String  _clear(b4a.example.screenmain __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="screenmain";
if (Debug.shouldDelegate(ba, "clear", false))
	 {return ((String) Debug.delegate(ba, "clear", null));}
RDebugUtils.currentLine=3801088;
 //BA.debugLineNum = 3801088;BA.debugLine="Private Sub clear";
RDebugUtils.currentLine=3801089;
 //BA.debugLineNum = 3801089;BA.debugLine="dochange = False";
__ref._dochange /*boolean*/  = __c.False;
RDebugUtils.currentLine=3801090;
 //BA.debugLineNum = 3801090;BA.debugLine="lsvName.Clear";
__ref._lsvname /*anywheresoftware.b4a.objects.ListViewWrapper*/ .Clear();
RDebugUtils.currentLine=3801091;
 //BA.debugLineNum = 3801091;BA.debugLine="lsvName.Visible = False";
__ref._lsvname /*anywheresoftware.b4a.objects.ListViewWrapper*/ .setVisible(__c.False);
RDebugUtils.currentLine=3801092;
 //BA.debugLineNum = 3801092;BA.debugLine="tbxGramm.Text = \"0\"";
__ref._tbxgramm /*anywheresoftware.b4a.objects.EditTextWrapper*/ .setText(BA.ObjectToCharSequence("0"));
RDebugUtils.currentLine=3801093;
 //BA.debugLineNum = 3801093;BA.debugLine="tbxTeilnehmer.Text = \"\"";
__ref._tbxteilnehmer /*anywheresoftware.b4a.objects.EditTextWrapper*/ .setText(BA.ObjectToCharSequence(""));
RDebugUtils.currentLine=3801094;
 //BA.debugLineNum = 3801094;BA.debugLine="dochange = True";
__ref._dochange /*boolean*/  = __c.True;
RDebugUtils.currentLine=3801095;
 //BA.debugLineNum = 3801095;BA.debugLine="End Sub";
return "";
}
public String  _formatdatecustom(b4a.example.screenmain __ref,long _ticks,String _pattern) throws Exception{
__ref = this;
RDebugUtils.currentModule="screenmain";
if (Debug.shouldDelegate(ba, "formatdatecustom", false))
	 {return ((String) Debug.delegate(ba, "formatdatecustom", new Object[] {_ticks,_pattern}));}
String _oldformat = "";
String _res = "";
RDebugUtils.currentLine=7143424;
 //BA.debugLineNum = 7143424;BA.debugLine="Private Sub FormatDateCustom(ticks As Long, patter";
RDebugUtils.currentLine=7143425;
 //BA.debugLineNum = 7143425;BA.debugLine="Dim oldFormat As String = DateTime.DateFormat";
_oldformat = __c.DateTime.getDateFormat();
RDebugUtils.currentLine=7143426;
 //BA.debugLineNum = 7143426;BA.debugLine="DateTime.DateFormat = pattern";
__c.DateTime.setDateFormat(_pattern);
RDebugUtils.currentLine=7143427;
 //BA.debugLineNum = 7143427;BA.debugLine="Dim res As String = DateTime.Date(ticks)";
_res = __c.DateTime.Date(_ticks);
RDebugUtils.currentLine=7143428;
 //BA.debugLineNum = 7143428;BA.debugLine="DateTime.DateFormat = oldFormat";
__c.DateTime.setDateFormat(_oldformat);
RDebugUtils.currentLine=7143429;
 //BA.debugLineNum = 7143429;BA.debugLine="Return res";
if (true) return _res;
RDebugUtils.currentLine=7143430;
 //BA.debugLineNum = 7143430;BA.debugLine="End Sub";
return "";
}
public String  _patchtextweb(b4a.example.screenmain __ref,String _text) throws Exception{
__ref = this;
RDebugUtils.currentModule="screenmain";
if (Debug.shouldDelegate(ba, "patchtextweb", false))
	 {return ((String) Debug.delegate(ba, "patchtextweb", new Object[] {_text}));}
RDebugUtils.currentLine=5308416;
 //BA.debugLineNum = 5308416;BA.debugLine="Private Sub PatchTextWeb(text As String)";
RDebugUtils.currentLine=5308417;
 //BA.debugLineNum = 5308417;BA.debugLine="If True = Status.GetDefault(\"ProgOffline\", True)";
if (__c.True==BA.ObjectToBoolean(__ref._status /*anywheresoftware.b4a.objects.collections.Map*/ .GetDefault((Object)("ProgOffline"),(Object)(__c.True)))) { 
RDebugUtils.currentLine=5308418;
 //BA.debugLineNum = 5308418;BA.debugLine="GotTextOffline";
__ref._gottextoffline /*String*/ (null);
 }else {
RDebugUtils.currentLine=5308420;
 //BA.debugLineNum = 5308420;BA.debugLine="ExecuteHttp(\"PATCH\", CurrentWebUrl, text)";
__ref._executehttp /*void*/ (null,"PATCH",__ref._currentweburl /*String*/ ,_text);
 };
RDebugUtils.currentLine=5308422;
 //BA.debugLineNum = 5308422;BA.debugLine="End Sub";
return "";
}
public String  _disableeingabe(b4a.example.screenmain __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="screenmain";
if (Debug.shouldDelegate(ba, "disableeingabe", false))
	 {return ((String) Debug.delegate(ba, "disableeingabe", null));}
RDebugUtils.currentLine=3735552;
 //BA.debugLineNum = 3735552;BA.debugLine="Private Sub disableEingabe";
RDebugUtils.currentLine=3735553;
 //BA.debugLineNum = 3735553;BA.debugLine="tbxTeilnehmer.Enabled = False";
__ref._tbxteilnehmer /*anywheresoftware.b4a.objects.EditTextWrapper*/ .setEnabled(__c.False);
RDebugUtils.currentLine=3735554;
 //BA.debugLineNum = 3735554;BA.debugLine="btnFDJeingabe.Enabled = False";
__ref._btnfdjeingabe /*anywheresoftware.b4a.objects.ButtonWrapper*/ .setEnabled(__c.False);
RDebugUtils.currentLine=3735555;
 //BA.debugLineNum = 3735555;BA.debugLine="btnFDJeingabe.TextColor = 0xFF888888";
__ref._btnfdjeingabe /*anywheresoftware.b4a.objects.ButtonWrapper*/ .setTextColor(((int)0xff888888));
RDebugUtils.currentLine=3735556;
 //BA.debugLineNum = 3735556;BA.debugLine="btnMinus.Enabled = False";
__ref._btnminus /*anywheresoftware.b4a.objects.ButtonWrapper*/ .setEnabled(__c.False);
RDebugUtils.currentLine=3735557;
 //BA.debugLineNum = 3735557;BA.debugLine="btnMinus.TextColor = 0xFF888888";
__ref._btnminus /*anywheresoftware.b4a.objects.ButtonWrapper*/ .setTextColor(((int)0xff888888));
RDebugUtils.currentLine=3735558;
 //BA.debugLineNum = 3735558;BA.debugLine="btnPlus.Enabled = False";
__ref._btnplus /*anywheresoftware.b4a.objects.ButtonWrapper*/ .setEnabled(__c.False);
RDebugUtils.currentLine=3735559;
 //BA.debugLineNum = 3735559;BA.debugLine="btnPlus.TextColor = 0xFF888888";
__ref._btnplus /*anywheresoftware.b4a.objects.ButtonWrapper*/ .setTextColor(((int)0xff888888));
RDebugUtils.currentLine=3735560;
 //BA.debugLineNum = 3735560;BA.debugLine="tbxGramm.Enabled = False";
__ref._tbxgramm /*anywheresoftware.b4a.objects.EditTextWrapper*/ .setEnabled(__c.False);
RDebugUtils.currentLine=3735561;
 //BA.debugLineNum = 3735561;BA.debugLine="btnSpeichern.Enabled = False";
__ref._btnspeichern /*anywheresoftware.b4a.objects.ButtonWrapper*/ .setEnabled(__c.False);
RDebugUtils.currentLine=3735562;
 //BA.debugLineNum = 3735562;BA.debugLine="btnSpeichern.TextColor = 0xFF888888";
__ref._btnspeichern /*anywheresoftware.b4a.objects.ButtonWrapper*/ .setTextColor(((int)0xff888888));
RDebugUtils.currentLine=3735563;
 //BA.debugLineNum = 3735563;BA.debugLine="tbxFDJgewicht.Enabled = False";
__ref._tbxfdjgewicht /*anywheresoftware.b4a.objects.EditTextWrapper*/ .setEnabled(__c.False);
RDebugUtils.currentLine=3735564;
 //BA.debugLineNum = 3735564;BA.debugLine="btnFDJsave.Enabled = False";
__ref._btnfdjsave /*anywheresoftware.b4a.objects.ButtonWrapper*/ .setEnabled(__c.False);
RDebugUtils.currentLine=3735565;
 //BA.debugLineNum = 3735565;BA.debugLine="btnFDJsave.TextColor = 0xFF888888";
__ref._btnfdjsave /*anywheresoftware.b4a.objects.ButtonWrapper*/ .setTextColor(((int)0xff888888));
RDebugUtils.currentLine=3735566;
 //BA.debugLineNum = 3735566;BA.debugLine="btnCloseVstng.Enabled = False";
__ref._btnclosevstng /*anywheresoftware.b4a.objects.ButtonWrapper*/ .setEnabled(__c.False);
RDebugUtils.currentLine=3735567;
 //BA.debugLineNum = 3735567;BA.debugLine="spnPlatz.Enabled = False";
__ref._spnplatz /*anywheresoftware.b4a.objects.SpinnerWrapper*/ .setEnabled(__c.False);
RDebugUtils.currentLine=3735568;
 //BA.debugLineNum = 3735568;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=5373953;
 //BA.debugLineNum = 5373953;BA.debugLine="Dim typ As String = DBdatenTyp";
_typ = __ref._dbdatentyp /*String*/ ;
RDebugUtils.currentLine=5373954;
 //BA.debugLineNum = 5373954;BA.debugLine="Dim j As HttpJob";
_j = new b4a.example.httpjob();
RDebugUtils.currentLine=5373955;
 //BA.debugLineNum = 5373955;BA.debugLine="j.Initialize(typ, Me)";
_j._initialize /*String*/ (null,ba,_typ,parent);
RDebugUtils.currentLine=5373957;
 //BA.debugLineNum = 5373957;BA.debugLine="Select method";
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
RDebugUtils.currentLine=5373959;
 //BA.debugLineNum = 5373959;BA.debugLine="j.Download(url)";
_j._download /*String*/ (null,_url);
 if (true) break;

case 5:
//C
this.state = 8;
RDebugUtils.currentLine=5373961;
 //BA.debugLineNum = 5373961;BA.debugLine="j.PutString(url, payload)";
_j._putstring /*String*/ (null,_url,_payload);
RDebugUtils.currentLine=5373962;
 //BA.debugLineNum = 5373962;BA.debugLine="j.GetRequest.SetContentType(\"application/json\")";
_j._getrequest /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ (null).SetContentType("application/json");
 if (true) break;

case 7:
//C
this.state = 8;
RDebugUtils.currentLine=5373964;
 //BA.debugLineNum = 5373964;BA.debugLine="j.PatchString(url, payload)";
_j._patchstring /*String*/ (null,_url,_payload);
RDebugUtils.currentLine=5373965;
 //BA.debugLineNum = 5373965;BA.debugLine="j.GetRequest.SetContentType(\"application/json\")";
_j._getrequest /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ (null).SetContentType("application/json");
 if (true) break;

case 8:
//C
this.state = 9;
;
RDebugUtils.currentLine=5373968;
 //BA.debugLineNum = 5373968;BA.debugLine="Wait For (j) JobDone(j As HttpJob)";
parent.__c.WaitFor("jobdone", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "screenmain", "executehttp"), (Object)(_j));
this.state = 15;
return;
case 15:
//C
this.state = 9;
_j = (b4a.example.httpjob) result[1];
;
RDebugUtils.currentLine=5373970;
 //BA.debugLineNum = 5373970;BA.debugLine="If j.Success Then";
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
RDebugUtils.currentLine=5373971;
 //BA.debugLineNum = 5373971;BA.debugLine="HandleGotText(typ, j.GetString)";
__ref._handlegottext /*String*/ (null,_typ,_j._getstring /*String*/ (null));
 if (true) break;

case 13:
//C
this.state = 14;
RDebugUtils.currentLine=5373973;
 //BA.debugLineNum = 5373973;BA.debugLine="setzeOffline";
__ref._setzeoffline /*String*/ (null);
 if (true) break;

case 14:
//C
this.state = -1;
;
RDebugUtils.currentLine=5373975;
 //BA.debugLineNum = 5373975;BA.debugLine="j.Release";
_j._release /*String*/ (null);
RDebugUtils.currentLine=5373976;
 //BA.debugLineNum = 5373976;BA.debugLine="startTimer";
__ref._starttimer /*String*/ (null);
RDebugUtils.currentLine=5373977;
 //BA.debugLineNum = 5373977;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=5439488;
 //BA.debugLineNum = 5439488;BA.debugLine="Private Sub HandleGotText(typ As String, responseC";
RDebugUtils.currentLine=5439489;
 //BA.debugLineNum = 5439489;BA.debugLine="DBdatenTyp = \"\"";
__ref._dbdatentyp /*String*/  = "";
RDebugUtils.currentLine=5439490;
 //BA.debugLineNum = 5439490;BA.debugLine="Dim jp As JSONParser";
_jp = new anywheresoftware.b4a.objects.collections.JSONParser();
RDebugUtils.currentLine=5439492;
 //BA.debugLineNum = 5439492;BA.debugLine="Select typ";
switch (BA.switchObjectToInt(_typ,"Wertungsliste","Teilnehmer","saveWertungsliste","addTLN","ErgClosed","saveOnly","VSTNGclosed","LastChange","FDJ")) {
case 0: {
RDebugUtils.currentLine=5439494;
 //BA.debugLineNum = 5439494;BA.debugLine="If responseContent = \"null\" Then";
if ((_responsecontent).equals("null")) { 
RDebugUtils.currentLine=5439495;
 //BA.debugLineNum = 5439495;BA.debugLine="initWertungsliste(True)";
__ref._initwertungsliste /*String*/ (null,__c.True);
RDebugUtils.currentLine=5439496;
 //BA.debugLineNum = 5439496;BA.debugLine="saveWertungsliste(\"saveWertungsliste\")";
__ref._savewertungsliste /*String*/ (null,"saveWertungsliste");
 }else {
RDebugUtils.currentLine=5439498;
 //BA.debugLineNum = 5439498;BA.debugLine="jp.Initialize(responseContent)";
_jp.Initialize(_responsecontent);
RDebugUtils.currentLine=5439499;
 //BA.debugLineNum = 5439499;BA.debugLine="ladeWertungsliste(jp.NextObject)";
__ref._ladewertungsliste /*String*/ (null,_jp.NextObject());
 };
 break; }
case 1: {
RDebugUtils.currentLine=5439502;
 //BA.debugLineNum = 5439502;BA.debugLine="ladeTeilnehmer(responseContent)";
__ref._ladeteilnehmer /*String*/ (null,_responsecontent);
RDebugUtils.currentLine=5439503;
 //BA.debugLineNum = 5439503;BA.debugLine="holeFDJ";
__ref._holefdj /*String*/ (null);
 break; }
case 2: {
RDebugUtils.currentLine=5439505;
 //BA.debugLineNum = 5439505;BA.debugLine="addTLN = False";
__ref._addtln /*boolean*/  = __c.False;
RDebugUtils.currentLine=5439506;
 //BA.debugLineNum = 5439506;BA.debugLine="addTeilnehmer";
__ref._addteilnehmer /*String*/ (null);
RDebugUtils.currentLine=5439507;
 //BA.debugLineNum = 5439507;BA.debugLine="If Not(addTLN) Then holeWertungsliste";
if (__c.Not(__ref._addtln /*boolean*/ )) { 
__ref._holewertungsliste /*String*/ (null);};
 break; }
case 3: {
RDebugUtils.currentLine=5439509;
 //BA.debugLineNum = 5439509;BA.debugLine="holeWertungsliste";
__ref._holewertungsliste /*String*/ (null);
 break; }
case 4: {
RDebugUtils.currentLine=5439511;
 //BA.debugLineNum = 5439511;BA.debugLine="vaEingabe.Visible = False";
__ref._vaeingabe /*anywheresoftware.b4a.objects.PanelWrapper*/ .setVisible(__c.False);
RDebugUtils.currentLine=5439512;
 //BA.debugLineNum = 5439512;BA.debugLine="haDown.Visible = True";
__ref._hadown /*anywheresoftware.b4a.objects.PanelWrapper*/ .setVisible(__c.True);
RDebugUtils.currentLine=5439513;
 //BA.debugLineNum = 5439513;BA.debugLine="btnDown.Visible = False";
__ref._btndown /*anywheresoftware.b4a.objects.ButtonWrapper*/ .setVisible(__c.False);
RDebugUtils.currentLine=5439514;
 //BA.debugLineNum = 5439514;BA.debugLine="UpdateLayoutPositions";
__ref._updatelayoutpositions /*String*/ (null);
RDebugUtils.currentLine=5439515;
 //BA.debugLineNum = 5439515;BA.debugLine="closeVstng(\"Verranstaltung\")";
__ref._closevstng /*String*/ (null,"Verranstaltung");
 break; }
case 5: {
 break; }
case 6: {
 break; }
case 7: {
 break; }
case 8: {
RDebugUtils.currentLine=5439523;
 //BA.debugLineNum = 5439523;BA.debugLine="ladeFDJ(responseContent)";
__ref._ladefdj /*String*/ (null,_responsecontent);
RDebugUtils.currentLine=5439524;
 //BA.debugLineNum = 5439524;BA.debugLine="holeWertungsliste";
__ref._holewertungsliste /*String*/ (null);
 break; }
}
;
RDebugUtils.currentLine=5439526;
 //BA.debugLineNum = 5439526;BA.debugLine="End Sub";
return "";
}
public String  _setzeoffline(b4a.example.screenmain __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="screenmain";
if (Debug.shouldDelegate(ba, "setzeoffline", false))
	 {return ((String) Debug.delegate(ba, "setzeoffline", null));}
RDebugUtils.currentLine=5570560;
 //BA.debugLineNum = 5570560;BA.debugLine="Private Sub setzeOffline";
RDebugUtils.currentLine=5570561;
 //BA.debugLineNum = 5570561;BA.debugLine="Status.Put(\"ProgOffline\", True)";
__ref._status /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("ProgOffline"),(Object)(__c.True));
RDebugUtils.currentLine=5570562;
 //BA.debugLineNum = 5570562;BA.debugLine="MsgboxAsync(\"Die Datenbank ist nicht mehr erreich";
__c.MsgboxAsync(BA.ObjectToCharSequence("Die Datenbank ist nicht mehr erreichbar. Kein Problem! Das Programm arbeitet offline und synchronisiert sich später mit der Datenbank. Es ist jedoch nur die zuletzt verwendete Wertungsliste verfügbar!"),BA.ObjectToCharSequence("Internet-Verbindung nicht möglich!"),ba);
RDebugUtils.currentLine=5570563;
 //BA.debugLineNum = 5570563;BA.debugLine="btnCloseVstng.Enabled = False";
__ref._btnclosevstng /*anywheresoftware.b4a.objects.ButtonWrapper*/ .setEnabled(__c.False);
RDebugUtils.currentLine=5570564;
 //BA.debugLineNum = 5570564;BA.debugLine="SetButtonImageSafe(btnCloseVstng, \"disconnected.p";
__ref._setbuttonimagesafe /*String*/ (null,__ref._btnclosevstng /*anywheresoftware.b4a.objects.ButtonWrapper*/ ,"disconnected.png","⚠");
RDebugUtils.currentLine=5570565;
 //BA.debugLineNum = 5570565;BA.debugLine="btnSettings.Visible = False";
__ref._btnsettings /*anywheresoftware.b4a.objects.ButtonWrapper*/ .setVisible(__c.False);
RDebugUtils.currentLine=5570566;
 //BA.debugLineNum = 5570566;BA.debugLine="End Sub";
return "";
}
public String  _getweb(b4a.example.screenmain __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="screenmain";
if (Debug.shouldDelegate(ba, "getweb", false))
	 {return ((String) Debug.delegate(ba, "getweb", null));}
RDebugUtils.currentLine=5177344;
 //BA.debugLineNum = 5177344;BA.debugLine="Private Sub GetWeb";
RDebugUtils.currentLine=5177345;
 //BA.debugLineNum = 5177345;BA.debugLine="If True = Status.GetDefault(\"ProgOffline\", True)";
if (__c.True==BA.ObjectToBoolean(__ref._status /*anywheresoftware.b4a.objects.collections.Map*/ .GetDefault((Object)("ProgOffline"),(Object)(__c.True)))) { 
RDebugUtils.currentLine=5177346;
 //BA.debugLineNum = 5177346;BA.debugLine="btnCloseVstng.Enabled = False";
__ref._btnclosevstng /*anywheresoftware.b4a.objects.ButtonWrapper*/ .setEnabled(__c.False);
RDebugUtils.currentLine=5177347;
 //BA.debugLineNum = 5177347;BA.debugLine="SetButtonImageSafe(btnCloseVstng, \"disconnected.";
__ref._setbuttonimagesafe /*String*/ (null,__ref._btnclosevstng /*anywheresoftware.b4a.objects.ButtonWrapper*/ ,"disconnected.png","⚠");
RDebugUtils.currentLine=5177348;
 //BA.debugLineNum = 5177348;BA.debugLine="btnSettings.Visible = False";
__ref._btnsettings /*anywheresoftware.b4a.objects.ButtonWrapper*/ .setVisible(__c.False);
RDebugUtils.currentLine=5177349;
 //BA.debugLineNum = 5177349;BA.debugLine="GotTextOffline";
__ref._gottextoffline /*String*/ (null);
 }else {
RDebugUtils.currentLine=5177351;
 //BA.debugLineNum = 5177351;BA.debugLine="ExecuteHttp(\"GET\", CurrentWebUrl, \"\")";
__ref._executehttp /*void*/ (null,"GET",__ref._currentweburl /*String*/ ,"");
 };
RDebugUtils.currentLine=5177353;
 //BA.debugLineNum = 5177353;BA.debugLine="End Sub";
return "";
}
public String  _gottextoffline(b4a.example.screenmain __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="screenmain";
if (Debug.shouldDelegate(ba, "gottextoffline", false))
	 {return ((String) Debug.delegate(ba, "gottextoffline", null));}
String _typ = "";
anywheresoftware.b4a.objects.collections.List _dbwv = null;
RDebugUtils.currentLine=5505024;
 //BA.debugLineNum = 5505024;BA.debugLine="Private Sub GotTextOffline";
RDebugUtils.currentLine=5505025;
 //BA.debugLineNum = 5505025;BA.debugLine="Dim typ As String = DBdatenTyp";
_typ = __ref._dbdatentyp /*String*/ ;
RDebugUtils.currentLine=5505026;
 //BA.debugLineNum = 5505026;BA.debugLine="DBdatenTyp = \"\"";
__ref._dbdatentyp /*String*/  = "";
RDebugUtils.currentLine=5505028;
 //BA.debugLineNum = 5505028;BA.debugLine="Select typ";
switch (BA.switchObjectToInt(_typ,"Teilnehmer","Wertungsliste","saveOnly","LastChange","fdj","saveWertungsliste","addTLN")) {
case 0: {
RDebugUtils.currentLine=5505030;
 //BA.debugLineNum = 5505030;BA.debugLine="Teilnehmer = DBGet(\"Teilnehmer\", Teilnehmer)";
__ref._teilnehmer /*anywheresoftware.b4a.objects.collections.List*/  = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(__ref._dbget /*Object*/ (null,"Teilnehmer",(Object)(__ref._teilnehmer /*anywheresoftware.b4a.objects.collections.List*/ .getObject()))));
RDebugUtils.currentLine=5505031;
 //BA.debugLineNum = 5505031;BA.debugLine="holeWertungsliste";
__ref._holewertungsliste /*String*/ (null);
 break; }
case 1: {
RDebugUtils.currentLine=5505033;
 //BA.debugLineNum = 5505033;BA.debugLine="Dim dbWv As List = DBGet(\"webviewData\", Null)";
_dbwv = new anywheresoftware.b4a.objects.collections.List();
_dbwv = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(__ref._dbget /*Object*/ (null,"webviewData",__c.Null)));
RDebugUtils.currentLine=5505034;
 //BA.debugLineNum = 5505034;BA.debugLine="If dbWv = Null Or Not(dbWv.IsInitialized) Or db";
if (_dbwv== null || __c.Not(_dbwv.IsInitialized()) || _dbwv.getSize()==0) { 
RDebugUtils.currentLine=5505035;
 //BA.debugLineNum = 5505035;BA.debugLine="initWertungsliste(True)";
__ref._initwertungsliste /*String*/ (null,__c.True);
RDebugUtils.currentLine=5505036;
 //BA.debugLineNum = 5505036;BA.debugLine="saveWertungsliste(\"saveOnly\")";
__ref._savewertungsliste /*String*/ (null,"saveOnly");
 }else {
RDebugUtils.currentLine=5505038;
 //BA.debugLineNum = 5505038;BA.debugLine="webviewData = dbWv";
__ref._webviewdata /*anywheresoftware.b4a.objects.collections.List*/  = _dbwv;
 };
RDebugUtils.currentLine=5505040;
 //BA.debugLineNum = 5505040;BA.debugLine="zeigeWertungsliste";
__ref._zeigewertungsliste /*String*/ (null);
 break; }
case 2: 
case 3: 
case 4: {
 break; }
case 5: {
RDebugUtils.currentLine=5505044;
 //BA.debugLineNum = 5505044;BA.debugLine="addTLN = False";
__ref._addtln /*boolean*/  = __c.False;
RDebugUtils.currentLine=5505045;
 //BA.debugLineNum = 5505045;BA.debugLine="addTeilnehmer";
__ref._addteilnehmer /*String*/ (null);
RDebugUtils.currentLine=5505046;
 //BA.debugLineNum = 5505046;BA.debugLine="If Not(addTLN) Then zeigeWertungsliste";
if (__c.Not(__ref._addtln /*boolean*/ )) { 
__ref._zeigewertungsliste /*String*/ (null);};
 break; }
case 6: {
RDebugUtils.currentLine=5505048;
 //BA.debugLineNum = 5505048;BA.debugLine="zeigeWertungsliste";
__ref._zeigewertungsliste /*String*/ (null);
 break; }
}
;
RDebugUtils.currentLine=5505050;
 //BA.debugLineNum = 5505050;BA.debugLine="End Sub";
return "";
}
public String  _getwebviewstring(b4a.example.screenmain __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="screenmain";
if (Debug.shouldDelegate(ba, "getwebviewstring", false))
	 {return ((String) Debug.delegate(ba, "getwebviewstring", null));}
RDebugUtils.currentLine=3473408;
 //BA.debugLineNum = 3473408;BA.debugLine="Public Sub getWebViewString As String";
RDebugUtils.currentLine=3473409;
 //BA.debugLineNum = 3473409;BA.debugLine="Return CurrentWebViewString";
if (true) return __ref._currentwebviewstring /*String*/ ;
RDebugUtils.currentLine=3473410;
 //BA.debugLineNum = 3473410;BA.debugLine="End Sub";
return "";
}
public String  _holewertungsliste(b4a.example.screenmain __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="screenmain";
if (Debug.shouldDelegate(ba, "holewertungsliste", false))
	 {return ((String) Debug.delegate(ba, "holewertungsliste", null));}
String _verdatum = "";
String[] _key = null;
RDebugUtils.currentLine=4456448;
 //BA.debugLineNum = 4456448;BA.debugLine="Private Sub holeWertungsliste";
RDebugUtils.currentLine=4456449;
 //BA.debugLineNum = 4456449;BA.debugLine="DBdatenTyp = \"Wertungsliste\"";
__ref._dbdatentyp /*String*/  = "Wertungsliste";
RDebugUtils.currentLine=4456450;
 //BA.debugLineNum = 4456450;BA.debugLine="If PlatzSelected <> SelectNewRow And SelectNewRow";
if (__ref._platzselected /*int*/ !=__ref._selectnewrow /*int*/  && __ref._selectnewrow /*int*/ >0) { 
RDebugUtils.currentLine=4456451;
 //BA.debugLineNum = 4456451;BA.debugLine="PlatzSelected = SelectNewRow";
__ref._platzselected /*int*/  = __ref._selectnewrow /*int*/ ;
 };
RDebugUtils.currentLine=4456454;
 //BA.debugLineNum = 4456454;BA.debugLine="Dim verDatum As String = DBGet(\"VeranstaltungDatu";
_verdatum = BA.ObjectToString(__ref._dbget /*Object*/ (null,"VeranstaltungDatum",(Object)(__ref._formatdatecustom /*String*/ (null,__c.DateTime.getNow(),"dd.MM.yyyy"))));
RDebugUtils.currentLine=4456455;
 //BA.debugLineNum = 4456455;BA.debugLine="Dim key() As String = Regex.Split(\"\\.\", verDatum)";
_key = __c.Regex.Split("\\.",_verdatum);
RDebugUtils.currentLine=4456456;
 //BA.debugLineNum = 4456456;BA.debugLine="CurrentWebUrl = URLErgebnisse & \"e\" & key(2) & ke";
__ref._currentweburl /*String*/  = __ref._urlergebnisse /*String*/ +"e"+_key[(int) (2)]+_key[(int) (1)]+_key[(int) (0)]+".json?auth="+BA.ObjectToString(__ref._status /*anywheresoftware.b4a.objects.collections.Map*/ .GetDefault((Object)("idToken"),(Object)("")));
RDebugUtils.currentLine=4456457;
 //BA.debugLineNum = 4456457;BA.debugLine="GetWeb";
__ref._getweb /*String*/ (null);
RDebugUtils.currentLine=4456458;
 //BA.debugLineNum = 4456458;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=4390912;
 //BA.debugLineNum = 4390912;BA.debugLine="Private Sub initWertungsliste(neueListe As Boolean";
RDebugUtils.currentLine=4390913;
 //BA.debugLineNum = 4390913;BA.debugLine="Dim plaetzeSoll As Int = DBGet(\"VeranstaltungAnza";
_plaetzesoll = (int)(BA.ObjectToNumber(__ref._dbget /*Object*/ (null,"VeranstaltungAnzahl",(Object)("25"))));
RDebugUtils.currentLine=4390914;
 //BA.debugLineNum = 4390914;BA.debugLine="Dim plaetzeIst As Int = Floor(webviewData.Size /";
_plaetzeist = (int) (__c.Floor(__ref._webviewdata /*anywheresoftware.b4a.objects.collections.List*/ .getSize()/(double)4)-1);
RDebugUtils.currentLine=4390916;
 //BA.debugLineNum = 4390916;BA.debugLine="If neueListe Then";
if (_neueliste) { 
RDebugUtils.currentLine=4390917;
 //BA.debugLineNum = 4390917;BA.debugLine="webviewData.Initialize";
__ref._webviewdata /*anywheresoftware.b4a.objects.collections.List*/ .Initialize();
RDebugUtils.currentLine=4390918;
 //BA.debugLineNum = 4390918;BA.debugLine="plaetzeIst = 0";
_plaetzeist = (int) (0);
RDebugUtils.currentLine=4390919;
 //BA.debugLineNum = 4390919;BA.debugLine="webviewData.AddAll(Array As Object(\"Platz\", \"Tei";
__ref._webviewdata /*anywheresoftware.b4a.objects.collections.List*/ .AddAll(anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)("Platz"),(Object)("Teilnehmer"),(Object)("Gewicht"),(Object)("Rang")}));
 }else {
RDebugUtils.currentLine=4390921;
 //BA.debugLineNum = 4390921;BA.debugLine="plaetzeSoll = plaetzeSoll - plaetzeIst";
_plaetzesoll = (int) (_plaetzesoll-_plaetzeist);
 };
RDebugUtils.currentLine=4390924;
 //BA.debugLineNum = 4390924;BA.debugLine="If plaetzeSoll > 0 Then";
if (_plaetzesoll>0) { 
RDebugUtils.currentLine=4390925;
 //BA.debugLineNum = 4390925;BA.debugLine="Dim startIdx As Int = plaetzeIst + 1";
_startidx = (int) (_plaetzeist+1);
RDebugUtils.currentLine=4390926;
 //BA.debugLineNum = 4390926;BA.debugLine="For i = startIdx To plaetzeIst + plaetzeSoll";
{
final int step12 = 1;
final int limit12 = (int) (_plaetzeist+_plaetzesoll);
_i = _startidx ;
for (;_i <= limit12 ;_i = _i + step12 ) {
RDebugUtils.currentLine=4390927;
 //BA.debugLineNum = 4390927;BA.debugLine="webviewData.AddAll(Array As Object(i, \"\", 0, 0)";
__ref._webviewdata /*anywheresoftware.b4a.objects.collections.List*/ .AddAll(anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(_i),(Object)(""),(Object)(0),(Object)(0)}));
 }
};
 }else 
{RDebugUtils.currentLine=4390929;
 //BA.debugLineNum = 4390929;BA.debugLine="Else if plaetzeSoll < 0 Then";
if (_plaetzesoll<0) { 
RDebugUtils.currentLine=4390930;
 //BA.debugLineNum = 4390930;BA.debugLine="Dim diff As Int = Abs(plaetzeSoll)";
_diff = (int) (__c.Abs(_plaetzesoll));
RDebugUtils.currentLine=4390931;
 //BA.debugLineNum = 4390931;BA.debugLine="Dim removeStart As Int = (plaetzeIst - diff) * 4";
_removestart = (int) ((_plaetzeist-_diff)*4+4);
RDebugUtils.currentLine=4390932;
 //BA.debugLineNum = 4390932;BA.debugLine="For i = 1 To diff * 4";
{
final int step18 = 1;
final int limit18 = (int) (_diff*4);
_i = (int) (1) ;
for (;_i <= limit18 ;_i = _i + step18 ) {
RDebugUtils.currentLine=4390933;
 //BA.debugLineNum = 4390933;BA.debugLine="If webviewData.Size > removeStart Then webviewD";
if (__ref._webviewdata /*anywheresoftware.b4a.objects.collections.List*/ .getSize()>_removestart) { 
__ref._webviewdata /*anywheresoftware.b4a.objects.collections.List*/ .RemoveAt(_removestart);};
 }
};
 }}
;
RDebugUtils.currentLine=4390937;
 //BA.debugLineNum = 4390937;BA.debugLine="If Not(neueListe) And plaetzeSoll <> 0 Then";
if (__c.Not(_neueliste) && _plaetzesoll!=0) { 
RDebugUtils.currentLine=4390938;
 //BA.debugLineNum = 4390938;BA.debugLine="saveWertungsliste(\"saveOnly\")";
__ref._savewertungsliste /*String*/ (null,"saveOnly");
 };
RDebugUtils.currentLine=4390940;
 //BA.debugLineNum = 4390940;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=4718592;
 //BA.debugLineNum = 4718592;BA.debugLine="Private Sub saveWertungsliste(saveTyp As String)";
RDebugUtils.currentLine=4718593;
 //BA.debugLineNum = 4718593;BA.debugLine="DBdatenTyp = saveTyp";
__ref._dbdatentyp /*String*/  = _savetyp;
RDebugUtils.currentLine=4718594;
 //BA.debugLineNum = 4718594;BA.debugLine="Dim verDatum As String = DBGet(\"VeranstaltungDatu";
_verdatum = BA.ObjectToString(__ref._dbget /*Object*/ (null,"VeranstaltungDatum",(Object)(__ref._formatdatecustom /*String*/ (null,__c.DateTime.getNow(),"dd.MM.yyyy"))));
RDebugUtils.currentLine=4718595;
 //BA.debugLineNum = 4718595;BA.debugLine="Dim key() As String = Regex.Split(\"\\.\", verDatum)";
_key = __c.Regex.Split("\\.",_verdatum);
RDebugUtils.currentLine=4718596;
 //BA.debugLineNum = 4718596;BA.debugLine="CurrentWebUrl = URLErgebnisse & \"e\" & key(2) & ke";
__ref._currentweburl /*String*/  = __ref._urlergebnisse /*String*/ +"e"+_key[(int) (2)]+_key[(int) (1)]+_key[(int) (0)]+".json?auth="+BA.ObjectToString(__ref._status /*anywheresoftware.b4a.objects.collections.Map*/ .GetDefault((Object)("idToken"),(Object)("")));
RDebugUtils.currentLine=4718598;
 //BA.debugLineNum = 4718598;BA.debugLine="Dim body As Map";
_body = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=4718599;
 //BA.debugLineNum = 4718599;BA.debugLine="body.Initialize";
_body.Initialize();
RDebugUtils.currentLine=4718600;
 //BA.debugLineNum = 4718600;BA.debugLine="body.Put(\"Datum\", lblDatum.Text)";
_body.Put((Object)("Datum"),(Object)(__ref._lbldatum /*anywheresoftware.b4a.objects.LabelWrapper*/ .getText()));
RDebugUtils.currentLine=4718601;
 //BA.debugLineNum = 4718601;BA.debugLine="body.Put(\"Name\", lblVeranstaltung.Text)";
_body.Put((Object)("Name"),(Object)(__ref._lblveranstaltung /*anywheresoftware.b4a.objects.LabelWrapper*/ .getText()));
RDebugUtils.currentLine=4718602;
 //BA.debugLineNum = 4718602;BA.debugLine="body.Put(\"Status\", \"offen\")";
_body.Put((Object)("Status"),(Object)("offen"));
RDebugUtils.currentLine=4718604;
 //BA.debugLineNum = 4718604;BA.debugLine="For i = 4 To webviewData.Size - 1 Step 4";
{
final int step10 = 4;
final int limit10 = (int) (__ref._webviewdata /*anywheresoftware.b4a.objects.collections.List*/ .getSize()-1);
_i = (int) (4) ;
for (;_i <= limit10 ;_i = _i + step10 ) {
RDebugUtils.currentLine=4718605;
 //BA.debugLineNum = 4718605;BA.debugLine="Dim platzVal As Int = webviewData.Get(i)";
_platzval = (int)(BA.ObjectToNumber(__ref._webviewdata /*anywheresoftware.b4a.objects.collections.List*/ .Get(_i)));
RDebugUtils.currentLine=4718606;
 //BA.debugLineNum = 4718606;BA.debugLine="Dim padded As String = \"0000\" & platzVal";
_padded = "0000"+BA.NumberToString(_platzval);
RDebugUtils.currentLine=4718607;
 //BA.debugLineNum = 4718607;BA.debugLine="Dim id As String = \"p\" & padded.SubString(padded";
_id = "p"+_padded.substring((int) (_padded.length()-4));
RDebugUtils.currentLine=4718609;
 //BA.debugLineNum = 4718609;BA.debugLine="Dim eintrag As Map = CreateMap( _ 			\"Platz\": pl";
_eintrag = new anywheresoftware.b4a.objects.collections.Map();
_eintrag = __c.createMap(new Object[] {(Object)("Platz"),(Object)(_platzval),(Object)("Teilnehmer"),__ref._webviewdata /*anywheresoftware.b4a.objects.collections.List*/ .Get((int) (_i+1)),(Object)("Gewicht"),__ref._webviewdata /*anywheresoftware.b4a.objects.collections.List*/ .Get((int) (_i+2)),(Object)("Rang"),__ref._webviewdata /*anywheresoftware.b4a.objects.collections.List*/ .Get((int) (_i+3))});
RDebugUtils.currentLine=4718614;
 //BA.debugLineNum = 4718614;BA.debugLine="body.Put(id, eintrag)";
_body.Put((Object)(_id),(Object)(_eintrag.getObject()));
 }
};
RDebugUtils.currentLine=4718617;
 //BA.debugLineNum = 4718617;BA.debugLine="DBPut(\"letzteÄnderung\", CreateMap(\"Änderung\": Tru";
__ref._dbput /*String*/ (null,"letzteÄnderung",(Object)(__c.createMap(new Object[] {(Object)("Änderung"),(Object)(__c.True),(Object)("Datum"),(Object)(__ref._zeitstempel /*String*/ (null))}).getObject()));
RDebugUtils.currentLine=4718618;
 //BA.debugLineNum = 4718618;BA.debugLine="DBPut(\"webviewData\", webviewData)";
__ref._dbput /*String*/ (null,"webviewData",(Object)(__ref._webviewdata /*anywheresoftware.b4a.objects.collections.List*/ .getObject()));
RDebugUtils.currentLine=4718620;
 //BA.debugLineNum = 4718620;BA.debugLine="Dim jg As JSONGenerator";
_jg = new anywheresoftware.b4a.objects.collections.JSONParser.JSONGenerator();
RDebugUtils.currentLine=4718621;
 //BA.debugLineNum = 4718621;BA.debugLine="jg.Initialize(body)";
_jg.Initialize(_body);
RDebugUtils.currentLine=4718622;
 //BA.debugLineNum = 4718622;BA.debugLine="PutTextWeb(jg.ToString)";
__ref._puttextweb /*String*/ (null,_jg.ToString());
RDebugUtils.currentLine=4718623;
 //BA.debugLineNum = 4718623;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=4063232;
 //BA.debugLineNum = 4063232;BA.debugLine="Private Sub zeigeWertungsliste";
RDebugUtils.currentLine=4063234;
 //BA.debugLineNum = 4063234;BA.debugLine="Dim sb As StringBuilder";
_sb = new anywheresoftware.b4a.keywords.StringBuilderWrapper();
RDebugUtils.currentLine=4063235;
 //BA.debugLineNum = 4063235;BA.debugLine="sb.Initialize";
_sb.Initialize();
RDebugUtils.currentLine=4063236;
 //BA.debugLineNum = 4063236;BA.debugLine="For i = 0 To webviewData.Size - 1";
{
final int step3 = 1;
final int limit3 = (int) (__ref._webviewdata /*anywheresoftware.b4a.objects.collections.List*/ .getSize()-1);
_i = (int) (0) ;
for (;_i <= limit3 ;_i = _i + step3 ) {
RDebugUtils.currentLine=4063237;
 //BA.debugLineNum = 4063237;BA.debugLine="If i > 0 Then sb.Append(\",\")";
if (_i>0) { 
_sb.Append(",");};
RDebugUtils.currentLine=4063238;
 //BA.debugLineNum = 4063238;BA.debugLine="sb.Append(webviewData.Get(i))";
_sb.Append(BA.ObjectToString(__ref._webviewdata /*anywheresoftware.b4a.objects.collections.List*/ .Get(_i)));
 }
};
RDebugUtils.currentLine=4063240;
 //BA.debugLineNum = 4063240;BA.debugLine="CurrentWebViewString = sb.ToString";
__ref._currentwebviewstring /*String*/  = _sb.ToString();
RDebugUtils.currentLine=4063242;
 //BA.debugLineNum = 4063242;BA.debugLine="If File.Exists(File.DirAssets, \"wlfb_tabelle.html";
if (__c.File.Exists(__c.File.getDirAssets(),"wlfb_tabelle.html")) { 
RDebugUtils.currentLine=4063243;
 //BA.debugLineNum = 4063243;BA.debugLine="Dim html As String = File.ReadString(File.DirAss";
_html = __c.File.ReadString(__c.File.getDirAssets(),"wlfb_tabelle.html");
RDebugUtils.currentLine=4063244;
 //BA.debugLineNum = 4063244;BA.debugLine="webErgebnis.LoadHtml(html)";
__ref._webergebnis /*anywheresoftware.b4a.objects.WebViewWrapper*/ .LoadHtml(_html);
 }else {
RDebugUtils.currentLine=4063246;
 //BA.debugLineNum = 4063246;BA.debugLine="ToastMessageShow(\"Datei wlfb_tabelle.html fehlt";
__c.ToastMessageShow(BA.ObjectToCharSequence("Datei wlfb_tabelle.html fehlt im Dateien-Tab!"),__c.True);
 };
RDebugUtils.currentLine=4063248;
 //BA.debugLineNum = 4063248;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=4980736;
 //BA.debugLineNum = 4980736;BA.debugLine="Private Sub ladeWertungsliste(dictionary As Map)";
RDebugUtils.currentLine=4980737;
 //BA.debugLineNum = 4980737;BA.debugLine="webviewData.Initialize";
__ref._webviewdata /*anywheresoftware.b4a.objects.collections.List*/ .Initialize();
RDebugUtils.currentLine=4980738;
 //BA.debugLineNum = 4980738;BA.debugLine="webviewData.AddAll(Array As Object(\"Platz\", \"Teil";
__ref._webviewdata /*anywheresoftware.b4a.objects.collections.List*/ .AddAll(anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)("Platz"),(Object)("Teilnehmer"),(Object)("Gewicht"),(Object)("Rang")}));
RDebugUtils.currentLine=4980739;
 //BA.debugLineNum = 4980739;BA.debugLine="VSTNGgeschlossen = False";
__ref._vstnggeschlossen /*boolean*/  = __c.False;
RDebugUtils.currentLine=4980741;
 //BA.debugLineNum = 4980741;BA.debugLine="For Each key As String In dictionary.Keys";
{
final anywheresoftware.b4a.BA.IterableList group4 = _dictionary.Keys();
final int groupLen4 = group4.getSize()
;int index4 = 0;
;
for (; index4 < groupLen4;index4++){
_key = BA.ObjectToString(group4.Get(index4));
RDebugUtils.currentLine=4980742;
 //BA.debugLineNum = 4980742;BA.debugLine="Dim val As Object = dictionary.Get(key)";
_val = _dictionary.Get((Object)(_key));
RDebugUtils.currentLine=4980743;
 //BA.debugLineNum = 4980743;BA.debugLine="If key = \"Status\" Then";
if ((_key).equals("Status")) { 
RDebugUtils.currentLine=4980744;
 //BA.debugLineNum = 4980744;BA.debugLine="If \"geschlossen\" = val Then VSTNGgeschlossen =";
if (("geschlossen").equals(BA.ObjectToString(_val))) { 
__ref._vstnggeschlossen /*boolean*/  = __c.True;};
 };
RDebugUtils.currentLine=4980746;
 //BA.debugLineNum = 4980746;BA.debugLine="If key.StartsWith(\"p\") Then";
if (_key.startsWith("p")) { 
RDebugUtils.currentLine=4980747;
 //BA.debugLineNum = 4980747;BA.debugLine="Dim ergebnis As Map = val";
_ergebnis = new anywheresoftware.b4a.objects.collections.Map();
_ergebnis = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_val));
RDebugUtils.currentLine=4980748;
 //BA.debugLineNum = 4980748;BA.debugLine="Dim maxAnzahl As Int = DBGet(\"VeranstaltungAnza";
_maxanzahl = (int)(BA.ObjectToNumber(__ref._dbget /*Object*/ (null,"VeranstaltungAnzahl",(Object)("25"))));
RDebugUtils.currentLine=4980749;
 //BA.debugLineNum = 4980749;BA.debugLine="webviewData.Add(ergebnis.GetDefault(\"Platz\", 0)";
__ref._webviewdata /*anywheresoftware.b4a.objects.collections.List*/ .Add(_ergebnis.GetDefault((Object)("Platz"),(Object)(0)));
RDebugUtils.currentLine=4980750;
 //BA.debugLineNum = 4980750;BA.debugLine="webviewData.Add(ergebnis.GetDefault(\"Teilnehmer";
__ref._webviewdata /*anywheresoftware.b4a.objects.collections.List*/ .Add(_ergebnis.GetDefault((Object)("Teilnehmer"),(Object)("")));
RDebugUtils.currentLine=4980751;
 //BA.debugLineNum = 4980751;BA.debugLine="webviewData.Add(ergebnis.GetDefault(\"Gewicht\",";
__ref._webviewdata /*anywheresoftware.b4a.objects.collections.List*/ .Add(_ergebnis.GetDefault((Object)("Gewicht"),(Object)(0)));
RDebugUtils.currentLine=4980752;
 //BA.debugLineNum = 4980752;BA.debugLine="webviewData.Add(ergebnis.GetDefault(\"Rang\", max";
__ref._webviewdata /*anywheresoftware.b4a.objects.collections.List*/ .Add(_ergebnis.GetDefault((Object)("Rang"),(Object)(_maxanzahl)));
 };
 }
};
RDebugUtils.currentLine=4980756;
 //BA.debugLineNum = 4980756;BA.debugLine="initWertungsliste(False)";
__ref._initwertungsliste /*String*/ (null,__c.False);
RDebugUtils.currentLine=4980757;
 //BA.debugLineNum = 4980757;BA.debugLine="DBPut(\"webviewData\", webviewData)";
__ref._dbput /*String*/ (null,"webviewData",(Object)(__ref._webviewdata /*anywheresoftware.b4a.objects.collections.List*/ .getObject()));
RDebugUtils.currentLine=4980758;
 //BA.debugLineNum = 4980758;BA.debugLine="zeigeWertungsliste";
__ref._zeigewertungsliste /*String*/ (null);
RDebugUtils.currentLine=4980759;
 //BA.debugLineNum = 4980759;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=5046272;
 //BA.debugLineNum = 5046272;BA.debugLine="Private Sub ladeTeilnehmer(response As String)";
RDebugUtils.currentLine=5046273;
 //BA.debugLineNum = 5046273;BA.debugLine="Teilnehmer.Initialize";
__ref._teilnehmer /*anywheresoftware.b4a.objects.collections.List*/ .Initialize();
RDebugUtils.currentLine=5046274;
 //BA.debugLineNum = 5046274;BA.debugLine="If response <> \"\" And response <> \"null\" Then";
if ((_response).equals("") == false && (_response).equals("null") == false) { 
RDebugUtils.currentLine=5046275;
 //BA.debugLineNum = 5046275;BA.debugLine="Dim jp As JSONParser";
_jp = new anywheresoftware.b4a.objects.collections.JSONParser();
RDebugUtils.currentLine=5046276;
 //BA.debugLineNum = 5046276;BA.debugLine="jp.Initialize(response)";
_jp.Initialize(_response);
RDebugUtils.currentLine=5046277;
 //BA.debugLineNum = 5046277;BA.debugLine="Dim teilnehmerliste As Map = jp.NextObject";
_teilnehmerliste = new anywheresoftware.b4a.objects.collections.Map();
_teilnehmerliste = _jp.NextObject();
RDebugUtils.currentLine=5046278;
 //BA.debugLineNum = 5046278;BA.debugLine="For Each key As String In teilnehmerliste.Keys";
{
final anywheresoftware.b4a.BA.IterableList group6 = _teilnehmerliste.Keys();
final int groupLen6 = group6.getSize()
;int index6 = 0;
;
for (; index6 < groupLen6;index6++){
_key = BA.ObjectToString(group6.Get(index6));
RDebugUtils.currentLine=5046279;
 //BA.debugLineNum = 5046279;BA.debugLine="Dim lastID As Int = key.Replace(\"t\", \"\")";
_lastid = (int)(Double.parseDouble(_key.replace("t","")));
RDebugUtils.currentLine=5046280;
 //BA.debugLineNum = 5046280;BA.debugLine="Dim currentMax As Int = TLNlastID.Replace(\"t\",";
_currentmax = (int)(Double.parseDouble(__ref._tlnlastid /*String*/ .replace("t","")));
RDebugUtils.currentLine=5046281;
 //BA.debugLineNum = 5046281;BA.debugLine="If lastID > currentMax Then TLNlastID = \"t\" & l";
if (_lastid>_currentmax) { 
__ref._tlnlastid /*String*/  = "t"+BA.NumberToString(_lastid);};
RDebugUtils.currentLine=5046282;
 //BA.debugLineNum = 5046282;BA.debugLine="Dim tMap As Map = teilnehmerliste.Get(key)";
_tmap = new anywheresoftware.b4a.objects.collections.Map();
_tmap = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_teilnehmerliste.Get((Object)(_key))));
RDebugUtils.currentLine=5046283;
 //BA.debugLineNum = 5046283;BA.debugLine="Teilnehmer.Add(tMap.GetDefault(\"Name\", \"unbenan";
__ref._teilnehmer /*anywheresoftware.b4a.objects.collections.List*/ .Add(_tmap.GetDefault((Object)("Name"),(Object)("unbenannt")));
 }
};
RDebugUtils.currentLine=5046285;
 //BA.debugLineNum = 5046285;BA.debugLine="If Teilnehmer.Size > 0 Then Teilnehmer.Sort(True";
if (__ref._teilnehmer /*anywheresoftware.b4a.objects.collections.List*/ .getSize()>0) { 
__ref._teilnehmer /*anywheresoftware.b4a.objects.collections.List*/ .Sort(__c.True);};
 };
RDebugUtils.currentLine=5046287;
 //BA.debugLineNum = 5046287;BA.debugLine="DBPut(\"Teilnehmer\", Teilnehmer)";
__ref._dbput /*String*/ (null,"Teilnehmer",(Object)(__ref._teilnehmer /*anywheresoftware.b4a.objects.collections.List*/ .getObject()));
RDebugUtils.currentLine=5046288;
 //BA.debugLineNum = 5046288;BA.debugLine="End Sub";
return "";
}
public String  _holefdj(b4a.example.screenmain __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="screenmain";
if (Debug.shouldDelegate(ba, "holefdj", false))
	 {return ((String) Debug.delegate(ba, "holefdj", null));}
String _verdatum = "";
String[] _parts = null;
RDebugUtils.currentLine=4587520;
 //BA.debugLineNum = 4587520;BA.debugLine="Private Sub holeFDJ";
RDebugUtils.currentLine=4587521;
 //BA.debugLineNum = 4587521;BA.debugLine="DBdatenTyp = \"FDJ\"";
__ref._dbdatentyp /*String*/  = "FDJ";
RDebugUtils.currentLine=4587522;
 //BA.debugLineNum = 4587522;BA.debugLine="Dim verDatum As String = DBGet(\"VeranstaltungDatu";
_verdatum = BA.ObjectToString(__ref._dbget /*Object*/ (null,"VeranstaltungDatum",(Object)("00.00.0000")));
RDebugUtils.currentLine=4587523;
 //BA.debugLineNum = 4587523;BA.debugLine="Dim parts() As String = Regex.Split(\"\\.\", verDatu";
_parts = __c.Regex.Split("\\.",_verdatum);
RDebugUtils.currentLine=4587524;
 //BA.debugLineNum = 4587524;BA.debugLine="CurrentWebUrl = URLfdj.Replace(\"[xxxx]\", parts(2)";
__ref._currentweburl /*String*/  = __ref._urlfdj /*String*/ .replace("[xxxx]",_parts[(int) (2)])+".json?auth="+BA.ObjectToString(__ref._status /*anywheresoftware.b4a.objects.collections.Map*/ .GetDefault((Object)("idToken"),(Object)("")));
RDebugUtils.currentLine=4587525;
 //BA.debugLineNum = 4587525;BA.debugLine="GetWeb";
__ref._getweb /*String*/ (null);
RDebugUtils.currentLine=4587526;
 //BA.debugLineNum = 4587526;BA.debugLine="End Sub";
return "";
}
public String  _ladefdj(b4a.example.screenmain __ref,String _response) throws Exception{
__ref = this;
RDebugUtils.currentModule="screenmain";
if (Debug.shouldDelegate(ba, "ladefdj", false))
	 {return ((String) Debug.delegate(ba, "ladefdj", new Object[] {_response}));}
anywheresoftware.b4a.objects.collections.JSONParser _jp = null;
anywheresoftware.b4a.objects.collections.Map _fdj = null;
RDebugUtils.currentLine=5111808;
 //BA.debugLineNum = 5111808;BA.debugLine="Private Sub ladeFDJ(response As String)";
RDebugUtils.currentLine=5111809;
 //BA.debugLineNum = 5111809;BA.debugLine="If response <> \"\" And response <> \"null\" Then";
if ((_response).equals("") == false && (_response).equals("null") == false) { 
RDebugUtils.currentLine=5111810;
 //BA.debugLineNum = 5111810;BA.debugLine="Dim jp As JSONParser";
_jp = new anywheresoftware.b4a.objects.collections.JSONParser();
RDebugUtils.currentLine=5111811;
 //BA.debugLineNum = 5111811;BA.debugLine="jp.Initialize(response)";
_jp.Initialize(_response);
RDebugUtils.currentLine=5111812;
 //BA.debugLineNum = 5111812;BA.debugLine="Dim fdj As Map = jp.NextObject";
_fdj = new anywheresoftware.b4a.objects.collections.Map();
_fdj = _jp.NextObject();
RDebugUtils.currentLine=5111813;
 //BA.debugLineNum = 5111813;BA.debugLine="DBPut(\"FDJTeilnehmer\", fdj.GetDefault(\"Teilnehme";
__ref._dbput /*String*/ (null,"FDJTeilnehmer",_fdj.GetDefault((Object)("Teilnehmer"),(Object)("")));
RDebugUtils.currentLine=5111814;
 //BA.debugLineNum = 5111814;BA.debugLine="DBPut(\"FDJGewicht\", fdj.GetDefault(\"Gewicht\", \"\"";
__ref._dbput /*String*/ (null,"FDJGewicht",_fdj.GetDefault((Object)("Gewicht"),(Object)("")));
 };
RDebugUtils.currentLine=5111816;
 //BA.debugLineNum = 5111816;BA.debugLine="End Sub";
return "";
}
public String  _holetln(b4a.example.screenmain __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="screenmain";
if (Debug.shouldDelegate(ba, "holetln", false))
	 {return ((String) Debug.delegate(ba, "holetln", null));}
RDebugUtils.currentLine=4521984;
 //BA.debugLineNum = 4521984;BA.debugLine="Private Sub holeTLN";
RDebugUtils.currentLine=4521985;
 //BA.debugLineNum = 4521985;BA.debugLine="DBdatenTyp = \"Teilnehmer\"";
__ref._dbdatentyp /*String*/  = "Teilnehmer";
RDebugUtils.currentLine=4521986;
 //BA.debugLineNum = 4521986;BA.debugLine="CurrentWebUrl = URLteilnehmer & \".json?auth=\" & S";
__ref._currentweburl /*String*/  = __ref._urlteilnehmer /*String*/ +".json?auth="+BA.ObjectToString(__ref._status /*anywheresoftware.b4a.objects.collections.Map*/ .GetDefault((Object)("idToken"),(Object)("")));
RDebugUtils.currentLine=4521987;
 //BA.debugLineNum = 4521987;BA.debugLine="GetWeb";
__ref._getweb /*String*/ (null);
RDebugUtils.currentLine=4521988;
 //BA.debugLineNum = 4521988;BA.debugLine="End Sub";
return "";
}
public String  _setzeheaderfromdb(b4a.example.screenmain __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="screenmain";
if (Debug.shouldDelegate(ba, "setzeheaderfromdb", false))
	 {return ((String) Debug.delegate(ba, "setzeheaderfromdb", null));}
RDebugUtils.currentLine=3866624;
 //BA.debugLineNum = 3866624;BA.debugLine="Private Sub setzeHeaderfromDB";
RDebugUtils.currentLine=3866625;
 //BA.debugLineNum = 3866625;BA.debugLine="lblVerein.Text = DBGet(\"Bezeichnung\", \"- nicht ge";
__ref._lblverein /*anywheresoftware.b4a.objects.LabelWrapper*/ .setText(BA.ObjectToCharSequence(__ref._dbget /*Object*/ (null,"Bezeichnung",(Object)("- nicht gesetzt -"))));
RDebugUtils.currentLine=3866626;
 //BA.debugLineNum = 3866626;BA.debugLine="lblVeranstaltung.Text = DBGet(\"VeranstaltungName\"";
__ref._lblveranstaltung /*anywheresoftware.b4a.objects.LabelWrapper*/ .setText(BA.ObjectToCharSequence(__ref._dbget /*Object*/ (null,"VeranstaltungName",(Object)("- nicht gesetzt -"))));
RDebugUtils.currentLine=3866627;
 //BA.debugLineNum = 3866627;BA.debugLine="lblDatum.Text = DBGet(\"VeranstaltungDatum\", \"- ni";
__ref._lbldatum /*anywheresoftware.b4a.objects.LabelWrapper*/ .setText(BA.ObjectToCharSequence(__ref._dbget /*Object*/ (null,"VeranstaltungDatum",(Object)("- nicht gesetzt -"))));
RDebugUtils.currentLine=3866628;
 //BA.debugLineNum = 3866628;BA.debugLine="End Sub";
return "";
}
public String  _loadtinydb(b4a.example.screenmain __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="screenmain";
if (Debug.shouldDelegate(ba, "loadtinydb", false))
	 {return ((String) Debug.delegate(ba, "loadtinydb", null));}
RDebugUtils.currentLine=7274496;
 //BA.debugLineNum = 7274496;BA.debugLine="Private Sub LoadTinyDB";
RDebugUtils.currentLine=7274497;
 //BA.debugLineNum = 7274497;BA.debugLine="If File.Exists(File.DirInternal, DBFileName) Then";
if (__c.File.Exists(__c.File.getDirInternal(),__ref._dbfilename /*String*/ )) { 
RDebugUtils.currentLine=7274498;
 //BA.debugLineNum = 7274498;BA.debugLine="DBVerein = File.ReadMap(File.DirInternal, DBFile";
__ref._dbverein /*anywheresoftware.b4a.objects.collections.Map*/  = __c.File.ReadMap(__c.File.getDirInternal(),__ref._dbfilename /*String*/ );
 }else {
RDebugUtils.currentLine=7274500;
 //BA.debugLineNum = 7274500;BA.debugLine="DBVerein.Initialize";
__ref._dbverein /*anywheresoftware.b4a.objects.collections.Map*/ .Initialize();
 };
RDebugUtils.currentLine=7274502;
 //BA.debugLineNum = 7274502;BA.debugLine="End Sub";
return "";
}
public String  _lsvname_itemclick(b4a.example.screenmain __ref,int _position,Object _value) throws Exception{
__ref = this;
RDebugUtils.currentModule="screenmain";
if (Debug.shouldDelegate(ba, "lsvname_itemclick", false))
	 {return ((String) Debug.delegate(ba, "lsvname_itemclick", new Object[] {_position,_value}));}
RDebugUtils.currentLine=6619136;
 //BA.debugLineNum = 6619136;BA.debugLine="Private Sub lsvName_ItemClick (Position As Int, Va";
RDebugUtils.currentLine=6619137;
 //BA.debugLineNum = 6619137;BA.debugLine="HideKeyboard";
__ref._hidekeyboard /*String*/ (null);
RDebugUtils.currentLine=6619138;
 //BA.debugLineNum = 6619138;BA.debugLine="dochange = False";
__ref._dochange /*boolean*/  = __c.False;
RDebugUtils.currentLine=6619139;
 //BA.debugLineNum = 6619139;BA.debugLine="tbxTeilnehmer.Text = Value";
__ref._tbxteilnehmer /*anywheresoftware.b4a.objects.EditTextWrapper*/ .setText(BA.ObjectToCharSequence(_value));
RDebugUtils.currentLine=6619140;
 //BA.debugLineNum = 6619140;BA.debugLine="dochange = True";
__ref._dochange /*boolean*/  = __c.True;
RDebugUtils.currentLine=6619141;
 //BA.debugLineNum = 6619141;BA.debugLine="lsvName.Visible = False";
__ref._lsvname /*anywheresoftware.b4a.objects.ListViewWrapper*/ .setVisible(__c.False);
RDebugUtils.currentLine=6619142;
 //BA.debugLineNum = 6619142;BA.debugLine="btnSpeichern.Enabled = True";
__ref._btnspeichern /*anywheresoftware.b4a.objects.ButtonWrapper*/ .setEnabled(__c.True);
RDebugUtils.currentLine=6619143;
 //BA.debugLineNum = 6619143;BA.debugLine="btnSpeichern.TextColor = colorgreen";
__ref._btnspeichern /*anywheresoftware.b4a.objects.ButtonWrapper*/ .setTextColor(__ref._colorgreen /*int*/ );
RDebugUtils.currentLine=6619144;
 //BA.debugLineNum = 6619144;BA.debugLine="startTimer";
__ref._starttimer /*String*/ (null);
RDebugUtils.currentLine=6619145;
 //BA.debugLineNum = 6619145;BA.debugLine="End Sub";
return "";
}
public String  _zeitstempel(b4a.example.screenmain __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="screenmain";
if (Debug.shouldDelegate(ba, "zeitstempel", false))
	 {return ((String) Debug.delegate(ba, "zeitstempel", null));}
RDebugUtils.currentLine=7077888;
 //BA.debugLineNum = 7077888;BA.debugLine="Private Sub Zeitstempel As String";
RDebugUtils.currentLine=7077889;
 //BA.debugLineNum = 7077889;BA.debugLine="Return FormatDateCustom(DateTime.Now, \"yyyyMMddHH";
if (true) return __ref._formatdatecustom /*String*/ (null,__c.DateTime.getNow(),"yyyyMMddHHmmss");
RDebugUtils.currentLine=7077890;
 //BA.debugLineNum = 7077890;BA.debugLine="End Sub";
return "";
}
public String  _setwebviewstring(b4a.example.screenmain __ref,String _val) throws Exception{
__ref = this;
RDebugUtils.currentModule="screenmain";
if (Debug.shouldDelegate(ba, "setwebviewstring", false))
	 {return ((String) Debug.delegate(ba, "setwebviewstring", new Object[] {_val}));}
RDebugUtils.currentLine=3538944;
 //BA.debugLineNum = 3538944;BA.debugLine="Public Sub setWebViewString(val As String)";
RDebugUtils.currentLine=3538945;
 //BA.debugLineNum = 3538945;BA.debugLine="CallSubDelayed2(Me, \"webErgebnis_WebViewStringCha";
__c.CallSubDelayed2(ba,this,"webErgebnis_WebViewStringChange",(Object)(_val));
RDebugUtils.currentLine=3538946;
 //BA.debugLineNum = 3538946;BA.debugLine="End Sub";
return "";
}
public String  _setzefdj(b4a.example.screenmain __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="screenmain";
if (Debug.shouldDelegate(ba, "setzefdj", false))
	 {return ((String) Debug.delegate(ba, "setzefdj", null));}
String _gewicht = "";
String _tlnname = "";
RDebugUtils.currentLine=4259840;
 //BA.debugLineNum = 4259840;BA.debugLine="Private Sub setzeFDJ";
RDebugUtils.currentLine=4259841;
 //BA.debugLineNum = 4259841;BA.debugLine="Dim gewicht As String = DBGet(\"FDJGewicht\", \"0\")";
_gewicht = BA.ObjectToString(__ref._dbget /*Object*/ (null,"FDJGewicht",(Object)("0")));
RDebugUtils.currentLine=4259842;
 //BA.debugLineNum = 4259842;BA.debugLine="Dim tlnName As String = DBGet(\"FDJTeilnehmer\", \"-";
_tlnname = BA.ObjectToString(__ref._dbget /*Object*/ (null,"FDJTeilnehmer",(Object)("- noch offen -")));
RDebugUtils.currentLine=4259843;
 //BA.debugLineNum = 4259843;BA.debugLine="RunJS(\"setzeFDJ(\" & QUOTE & gewicht & QUOTE & \",\"";
__ref._runjs /*String*/ (null,"setzeFDJ("+__c.QUOTE+_gewicht+__c.QUOTE+","+__c.QUOTE+_tlnname+__c.QUOTE+");");
RDebugUtils.currentLine=4259844;
 //BA.debugLineNum = 4259844;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=3997696;
 //BA.debugLineNum = 3997696;BA.debugLine="Private Sub setzePlatz(pid As Int)";
RDebugUtils.currentLine=3997697;
 //BA.debugLineNum = 3997697;BA.debugLine="dochange = False";
__ref._dochange /*boolean*/  = __c.False;
RDebugUtils.currentLine=3997698;
 //BA.debugLineNum = 3997698;BA.debugLine="lsvName.Clear";
__ref._lsvname /*anywheresoftware.b4a.objects.ListViewWrapper*/ .Clear();
RDebugUtils.currentLine=3997699;
 //BA.debugLineNum = 3997699;BA.debugLine="lsvName.Visible = False";
__ref._lsvname /*anywheresoftware.b4a.objects.ListViewWrapper*/ .setVisible(__c.False);
RDebugUtils.currentLine=3997702;
 //BA.debugLineNum = 3997702;BA.debugLine="Dim baseIdx As Int = pid * 4";
_baseidx = (int) (_pid*4);
RDebugUtils.currentLine=3997703;
 //BA.debugLineNum = 3997703;BA.debugLine="If webviewData.Size > baseIdx + 2 Then";
if (__ref._webviewdata /*anywheresoftware.b4a.objects.collections.List*/ .getSize()>_baseidx+2) { 
RDebugUtils.currentLine=3997704;
 //BA.debugLineNum = 3997704;BA.debugLine="Dim tName As String = webviewData.Get(baseIdx +";
_tname = BA.ObjectToString(__ref._webviewdata /*anywheresoftware.b4a.objects.collections.List*/ .Get((int) (_baseidx+1)));
RDebugUtils.currentLine=3997705;
 //BA.debugLineNum = 3997705;BA.debugLine="tbxTeilnehmer.Text = tName.Trim";
__ref._tbxteilnehmer /*anywheresoftware.b4a.objects.EditTextWrapper*/ .setText(BA.ObjectToCharSequence(_tname.trim()));
RDebugUtils.currentLine=3997706;
 //BA.debugLineNum = 3997706;BA.debugLine="tbxGramm.Text = webviewData.Get(baseIdx + 2)";
__ref._tbxgramm /*anywheresoftware.b4a.objects.EditTextWrapper*/ .setText(BA.ObjectToCharSequence(__ref._webviewdata /*anywheresoftware.b4a.objects.collections.List*/ .Get((int) (_baseidx+2))));
RDebugUtils.currentLine=3997708;
 //BA.debugLineNum = 3997708;BA.debugLine="Dim pStr As String = webviewData.Get(baseIdx)";
_pstr = BA.ObjectToString(__ref._webviewdata /*anywheresoftware.b4a.objects.collections.List*/ .Get(_baseidx));
RDebugUtils.currentLine=3997709;
 //BA.debugLineNum = 3997709;BA.debugLine="Dim spnIdx As Int = spnItems.IndexOf(pStr.Trim)";
_spnidx = __ref._spnitems /*anywheresoftware.b4a.objects.collections.List*/ .IndexOf((Object)(_pstr.trim()));
RDebugUtils.currentLine=3997710;
 //BA.debugLineNum = 3997710;BA.debugLine="If spnIdx >= 0 Then spnPlatz.SelectedIndex = spn";
if (_spnidx>=0) { 
__ref._spnplatz /*anywheresoftware.b4a.objects.SpinnerWrapper*/ .setSelectedIndex(_spnidx);};
 };
RDebugUtils.currentLine=3997713;
 //BA.debugLineNum = 3997713;BA.debugLine="tbxTeilnehmer.Enabled = True";
__ref._tbxteilnehmer /*anywheresoftware.b4a.objects.EditTextWrapper*/ .setEnabled(__c.True);
RDebugUtils.currentLine=3997714;
 //BA.debugLineNum = 3997714;BA.debugLine="tbxGramm.Enabled = True";
__ref._tbxgramm /*anywheresoftware.b4a.objects.EditTextWrapper*/ .setEnabled(__c.True);
RDebugUtils.currentLine=3997715;
 //BA.debugLineNum = 3997715;BA.debugLine="spnPlatz.Enabled = True";
__ref._spnplatz /*anywheresoftware.b4a.objects.SpinnerWrapper*/ .setEnabled(__c.True);
RDebugUtils.currentLine=3997717;
 //BA.debugLineNum = 3997717;BA.debugLine="If tbxTeilnehmer.Text.Trim <> \"\" Then";
if ((__ref._tbxteilnehmer /*anywheresoftware.b4a.objects.EditTextWrapper*/ .getText().trim()).equals("") == false) { 
RDebugUtils.currentLine=3997718;
 //BA.debugLineNum = 3997718;BA.debugLine="btnFDJeingabe.Enabled = True";
__ref._btnfdjeingabe /*anywheresoftware.b4a.objects.ButtonWrapper*/ .setEnabled(__c.True);
RDebugUtils.currentLine=3997719;
 //BA.debugLineNum = 3997719;BA.debugLine="btnFDJeingabe.TextColor = colorgreen";
__ref._btnfdjeingabe /*anywheresoftware.b4a.objects.ButtonWrapper*/ .setTextColor(__ref._colorgreen /*int*/ );
 };
RDebugUtils.currentLine=3997721;
 //BA.debugLineNum = 3997721;BA.debugLine="If pid > 1 Then";
if (_pid>1) { 
RDebugUtils.currentLine=3997722;
 //BA.debugLineNum = 3997722;BA.debugLine="btnMinus.Enabled = True";
__ref._btnminus /*anywheresoftware.b4a.objects.ButtonWrapper*/ .setEnabled(__c.True);
RDebugUtils.currentLine=3997723;
 //BA.debugLineNum = 3997723;BA.debugLine="btnMinus.TextColor = colorgreen";
__ref._btnminus /*anywheresoftware.b4a.objects.ButtonWrapper*/ .setTextColor(__ref._colorgreen /*int*/ );
 };
RDebugUtils.currentLine=3997725;
 //BA.debugLineNum = 3997725;BA.debugLine="Dim maxAnzahl As Int = DBGet(\"VeranstaltungAnzahl";
_maxanzahl = (int)(BA.ObjectToNumber(__ref._dbget /*Object*/ (null,"VeranstaltungAnzahl",(Object)("25"))));
RDebugUtils.currentLine=3997726;
 //BA.debugLineNum = 3997726;BA.debugLine="If pid < maxAnzahl Then";
if (_pid<_maxanzahl) { 
RDebugUtils.currentLine=3997727;
 //BA.debugLineNum = 3997727;BA.debugLine="btnPlus.Enabled = True";
__ref._btnplus /*anywheresoftware.b4a.objects.ButtonWrapper*/ .setEnabled(__c.True);
RDebugUtils.currentLine=3997728;
 //BA.debugLineNum = 3997728;BA.debugLine="btnPlus.TextColor = colorgreen";
__ref._btnplus /*anywheresoftware.b4a.objects.ButtonWrapper*/ .setTextColor(__ref._colorgreen /*int*/ );
 };
RDebugUtils.currentLine=3997730;
 //BA.debugLineNum = 3997730;BA.debugLine="If False = Status.GetDefault(\"ProgOffline\", True)";
if (__c.False==BA.ObjectToBoolean(__ref._status /*anywheresoftware.b4a.objects.collections.Map*/ .GetDefault((Object)("ProgOffline"),(Object)(__c.True)))) { 
RDebugUtils.currentLine=3997731;
 //BA.debugLineNum = 3997731;BA.debugLine="btnCloseVstng.Enabled = True";
__ref._btnclosevstng /*anywheresoftware.b4a.objects.ButtonWrapper*/ .setEnabled(__c.True);
 };
RDebugUtils.currentLine=3997734;
 //BA.debugLineNum = 3997734;BA.debugLine="dochange = True";
__ref._dochange /*boolean*/  = __c.True;
RDebugUtils.currentLine=3997735;
 //BA.debugLineNum = 3997735;BA.debugLine="tbxTeilnehmer.RequestFocus";
__ref._tbxteilnehmer /*anywheresoftware.b4a.objects.EditTextWrapper*/ .RequestFocus();
RDebugUtils.currentLine=3997736;
 //BA.debugLineNum = 3997736;BA.debugLine="End Sub";
return "";
}
public String  _spnplatz_itemclick(b4a.example.screenmain __ref,int _position,Object _value) throws Exception{
__ref = this;
RDebugUtils.currentModule="screenmain";
if (Debug.shouldDelegate(ba, "spnplatz_itemclick", false))
	 {return ((String) Debug.delegate(ba, "spnplatz_itemclick", new Object[] {_position,_value}));}
RDebugUtils.currentLine=5898240;
 //BA.debugLineNum = 5898240;BA.debugLine="Private Sub spnPlatz_ItemClick (Position As Int, V";
RDebugUtils.currentLine=5898241;
 //BA.debugLineNum = 5898241;BA.debugLine="PlatzSelected = Value";
__ref._platzselected /*int*/  = (int)(BA.ObjectToNumber(_value));
RDebugUtils.currentLine=5898242;
 //BA.debugLineNum = 5898242;BA.debugLine="btnSpeichern.Enabled = True";
__ref._btnspeichern /*anywheresoftware.b4a.objects.ButtonWrapper*/ .setEnabled(__c.True);
RDebugUtils.currentLine=5898243;
 //BA.debugLineNum = 5898243;BA.debugLine="btnSpeichern.TextColor = colorgreen";
__ref._btnspeichern /*anywheresoftware.b4a.objects.ButtonWrapper*/ .setTextColor(__ref._colorgreen /*int*/ );
RDebugUtils.currentLine=5898244;
 //BA.debugLineNum = 5898244;BA.debugLine="RunJS(\"selectRowById(\" & PlatzSelected & \");\")";
__ref._runjs /*String*/ (null,"selectRowById("+BA.NumberToString(__ref._platzselected /*int*/ )+");");
RDebugUtils.currentLine=5898245;
 //BA.debugLineNum = 5898245;BA.debugLine="dochange = True";
__ref._dochange /*boolean*/  = __c.True;
RDebugUtils.currentLine=5898246;
 //BA.debugLineNum = 5898246;BA.debugLine="startTimer";
__ref._starttimer /*String*/ (null);
RDebugUtils.currentLine=5898247;
 //BA.debugLineNum = 5898247;BA.debugLine="End Sub";
return "";
}
public String  _tbxfdjgewicht_focuschanged(b4a.example.screenmain __ref,boolean _hasfocus) throws Exception{
__ref = this;
RDebugUtils.currentModule="screenmain";
if (Debug.shouldDelegate(ba, "tbxfdjgewicht_focuschanged", false))
	 {return ((String) Debug.delegate(ba, "tbxfdjgewicht_focuschanged", new Object[] {_hasfocus}));}
RDebugUtils.currentLine=6815744;
 //BA.debugLineNum = 6815744;BA.debugLine="Private Sub tbxFDJgewicht_FocusChanged (HasFocus A";
RDebugUtils.currentLine=6815745;
 //BA.debugLineNum = 6815745;BA.debugLine="If HasFocus Then";
if (_hasfocus) { 
RDebugUtils.currentLine=6815746;
 //BA.debugLineNum = 6815746;BA.debugLine="tbxFDJgewicht.SelectionStart = tbxFDJgewicht.Tex";
__ref._tbxfdjgewicht /*anywheresoftware.b4a.objects.EditTextWrapper*/ .setSelectionStart(__ref._tbxfdjgewicht /*anywheresoftware.b4a.objects.EditTextWrapper*/ .getText().length());
 }else {
RDebugUtils.currentLine=6815748;
 //BA.debugLineNum = 6815748;BA.debugLine="HideKeyboard";
__ref._hidekeyboard /*String*/ (null);
 };
RDebugUtils.currentLine=6815750;
 //BA.debugLineNum = 6815750;BA.debugLine="End Sub";
return "";
}
public String  _tbxfdjgewicht_textchanged(b4a.example.screenmain __ref,String _old,String _new) throws Exception{
__ref = this;
RDebugUtils.currentModule="screenmain";
if (Debug.shouldDelegate(ba, "tbxfdjgewicht_textchanged", false))
	 {return ((String) Debug.delegate(ba, "tbxfdjgewicht_textchanged", new Object[] {_old,_new}));}
int _val = 0;
RDebugUtils.currentLine=6881280;
 //BA.debugLineNum = 6881280;BA.debugLine="Private Sub tbxFDJgewicht_TextChanged (Old As Stri";
RDebugUtils.currentLine=6881281;
 //BA.debugLineNum = 6881281;BA.debugLine="If dochange Then";
if (__ref._dochange /*boolean*/ ) { 
RDebugUtils.currentLine=6881282;
 //BA.debugLineNum = 6881282;BA.debugLine="dochange = False";
__ref._dochange /*boolean*/  = __c.False;
RDebugUtils.currentLine=6881283;
 //BA.debugLineNum = 6881283;BA.debugLine="If IsNumber(tbxFDJgewicht.Text) Then";
if (__c.IsNumber(__ref._tbxfdjgewicht /*anywheresoftware.b4a.objects.EditTextWrapper*/ .getText())) { 
RDebugUtils.currentLine=6881284;
 //BA.debugLineNum = 6881284;BA.debugLine="Dim val As Int = Abs(tbxFDJgewicht.Text)";
_val = (int) (__c.Abs((double)(Double.parseDouble(__ref._tbxfdjgewicht /*anywheresoftware.b4a.objects.EditTextWrapper*/ .getText()))));
RDebugUtils.currentLine=6881285;
 //BA.debugLineNum = 6881285;BA.debugLine="tbxFDJgewicht.Text = val";
__ref._tbxfdjgewicht /*anywheresoftware.b4a.objects.EditTextWrapper*/ .setText(BA.ObjectToCharSequence(_val));
RDebugUtils.currentLine=6881286;
 //BA.debugLineNum = 6881286;BA.debugLine="btnFDJsave.Enabled = True";
__ref._btnfdjsave /*anywheresoftware.b4a.objects.ButtonWrapper*/ .setEnabled(__c.True);
RDebugUtils.currentLine=6881287;
 //BA.debugLineNum = 6881287;BA.debugLine="btnFDJsave.TextColor = colorgreen";
__ref._btnfdjsave /*anywheresoftware.b4a.objects.ButtonWrapper*/ .setTextColor(__ref._colorgreen /*int*/ );
 };
RDebugUtils.currentLine=6881289;
 //BA.debugLineNum = 6881289;BA.debugLine="tbxFDJgewicht.SelectionStart = tbxFDJgewicht.Tex";
__ref._tbxfdjgewicht /*anywheresoftware.b4a.objects.EditTextWrapper*/ .setSelectionStart(__ref._tbxfdjgewicht /*anywheresoftware.b4a.objects.EditTextWrapper*/ .getText().length());
RDebugUtils.currentLine=6881290;
 //BA.debugLineNum = 6881290;BA.debugLine="dochange = True";
__ref._dochange /*boolean*/  = __c.True;
 };
RDebugUtils.currentLine=6881292;
 //BA.debugLineNum = 6881292;BA.debugLine="startTimer";
__ref._starttimer /*String*/ (null);
RDebugUtils.currentLine=6881293;
 //BA.debugLineNum = 6881293;BA.debugLine="End Sub";
return "";
}
public String  _tbxgramm_focuschanged(b4a.example.screenmain __ref,boolean _hasfocus) throws Exception{
__ref = this;
RDebugUtils.currentModule="screenmain";
if (Debug.shouldDelegate(ba, "tbxgramm_focuschanged", false))
	 {return ((String) Debug.delegate(ba, "tbxgramm_focuschanged", new Object[] {_hasfocus}));}
RDebugUtils.currentLine=6684672;
 //BA.debugLineNum = 6684672;BA.debugLine="Private Sub tbxGramm_FocusChanged (HasFocus As Boo";
RDebugUtils.currentLine=6684673;
 //BA.debugLineNum = 6684673;BA.debugLine="If HasFocus Then";
if (_hasfocus) { 
RDebugUtils.currentLine=6684674;
 //BA.debugLineNum = 6684674;BA.debugLine="tbxGramm.SelectionStart = tbxGramm.Text.Length";
__ref._tbxgramm /*anywheresoftware.b4a.objects.EditTextWrapper*/ .setSelectionStart(__ref._tbxgramm /*anywheresoftware.b4a.objects.EditTextWrapper*/ .getText().length());
 }else {
RDebugUtils.currentLine=6684676;
 //BA.debugLineNum = 6684676;BA.debugLine="HideKeyboard";
__ref._hidekeyboard /*String*/ (null);
 };
RDebugUtils.currentLine=6684678;
 //BA.debugLineNum = 6684678;BA.debugLine="End Sub";
return "";
}
public String  _tbxgramm_textchanged(b4a.example.screenmain __ref,String _old,String _new) throws Exception{
__ref = this;
RDebugUtils.currentModule="screenmain";
if (Debug.shouldDelegate(ba, "tbxgramm_textchanged", false))
	 {return ((String) Debug.delegate(ba, "tbxgramm_textchanged", new Object[] {_old,_new}));}
int _val = 0;
RDebugUtils.currentLine=6750208;
 //BA.debugLineNum = 6750208;BA.debugLine="Private Sub tbxGramm_TextChanged (Old As String, N";
RDebugUtils.currentLine=6750209;
 //BA.debugLineNum = 6750209;BA.debugLine="If dochange Then";
if (__ref._dochange /*boolean*/ ) { 
RDebugUtils.currentLine=6750210;
 //BA.debugLineNum = 6750210;BA.debugLine="dochange = False";
__ref._dochange /*boolean*/  = __c.False;
RDebugUtils.currentLine=6750211;
 //BA.debugLineNum = 6750211;BA.debugLine="If IsNumber(tbxGramm.Text) Then";
if (__c.IsNumber(__ref._tbxgramm /*anywheresoftware.b4a.objects.EditTextWrapper*/ .getText())) { 
RDebugUtils.currentLine=6750212;
 //BA.debugLineNum = 6750212;BA.debugLine="Dim val As Int = Abs(tbxGramm.Text)";
_val = (int) (__c.Abs((double)(Double.parseDouble(__ref._tbxgramm /*anywheresoftware.b4a.objects.EditTextWrapper*/ .getText()))));
RDebugUtils.currentLine=6750213;
 //BA.debugLineNum = 6750213;BA.debugLine="tbxGramm.Text = val";
__ref._tbxgramm /*anywheresoftware.b4a.objects.EditTextWrapper*/ .setText(BA.ObjectToCharSequence(_val));
RDebugUtils.currentLine=6750214;
 //BA.debugLineNum = 6750214;BA.debugLine="btnSpeichern.Enabled = True";
__ref._btnspeichern /*anywheresoftware.b4a.objects.ButtonWrapper*/ .setEnabled(__c.True);
RDebugUtils.currentLine=6750215;
 //BA.debugLineNum = 6750215;BA.debugLine="btnSpeichern.TextColor = colorgreen";
__ref._btnspeichern /*anywheresoftware.b4a.objects.ButtonWrapper*/ .setTextColor(__ref._colorgreen /*int*/ );
 };
RDebugUtils.currentLine=6750217;
 //BA.debugLineNum = 6750217;BA.debugLine="tbxGramm.SelectionStart = tbxGramm.Text.Length";
__ref._tbxgramm /*anywheresoftware.b4a.objects.EditTextWrapper*/ .setSelectionStart(__ref._tbxgramm /*anywheresoftware.b4a.objects.EditTextWrapper*/ .getText().length());
RDebugUtils.currentLine=6750218;
 //BA.debugLineNum = 6750218;BA.debugLine="dochange = True";
__ref._dochange /*boolean*/  = __c.True;
 };
RDebugUtils.currentLine=6750220;
 //BA.debugLineNum = 6750220;BA.debugLine="startTimer";
__ref._starttimer /*String*/ (null);
RDebugUtils.currentLine=6750221;
 //BA.debugLineNum = 6750221;BA.debugLine="End Sub";
return "";
}
public String  _tbxteilnehmer_focuschanged(b4a.example.screenmain __ref,boolean _hasfocus) throws Exception{
__ref = this;
RDebugUtils.currentModule="screenmain";
if (Debug.shouldDelegate(ba, "tbxteilnehmer_focuschanged", false))
	 {return ((String) Debug.delegate(ba, "tbxteilnehmer_focuschanged", new Object[] {_hasfocus}));}
RDebugUtils.currentLine=6488064;
 //BA.debugLineNum = 6488064;BA.debugLine="Private Sub tbxTeilnehmer_FocusChanged (HasFocus A";
RDebugUtils.currentLine=6488065;
 //BA.debugLineNum = 6488065;BA.debugLine="If HasFocus Then";
if (_hasfocus) { 
RDebugUtils.currentLine=6488066;
 //BA.debugLineNum = 6488066;BA.debugLine="tbxTeilnehmer.SelectionStart = tbxTeilnehmer.Tex";
__ref._tbxteilnehmer /*anywheresoftware.b4a.objects.EditTextWrapper*/ .setSelectionStart(__ref._tbxteilnehmer /*anywheresoftware.b4a.objects.EditTextWrapper*/ .getText().length());
RDebugUtils.currentLine=6488067;
 //BA.debugLineNum = 6488067;BA.debugLine="lsvName.Visible = False";
__ref._lsvname /*anywheresoftware.b4a.objects.ListViewWrapper*/ .setVisible(__c.False);
 }else {
RDebugUtils.currentLine=6488069;
 //BA.debugLineNum = 6488069;BA.debugLine="lsvName.Visible = False";
__ref._lsvname /*anywheresoftware.b4a.objects.ListViewWrapper*/ .setVisible(__c.False);
RDebugUtils.currentLine=6488070;
 //BA.debugLineNum = 6488070;BA.debugLine="HideKeyboard";
__ref._hidekeyboard /*String*/ (null);
 };
RDebugUtils.currentLine=6488072;
 //BA.debugLineNum = 6488072;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=6553600;
 //BA.debugLineNum = 6553600;BA.debugLine="Private Sub tbxTeilnehmer_TextChanged (Old As Stri";
RDebugUtils.currentLine=6553602;
 //BA.debugLineNum = 6553602;BA.debugLine="If lsvName.IsInitialized = False Then Return";
if (__ref._lsvname /*anywheresoftware.b4a.objects.ListViewWrapper*/ .IsInitialized()==__c.False) { 
if (true) return "";};
RDebugUtils.currentLine=6553604;
 //BA.debugLineNum = 6553604;BA.debugLine="If dochange Then";
if (__ref._dochange /*boolean*/ ) { 
RDebugUtils.currentLine=6553605;
 //BA.debugLineNum = 6553605;BA.debugLine="dochange = False";
__ref._dochange /*boolean*/  = __c.False;
RDebugUtils.currentLine=6553607;
 //BA.debugLineNum = 6553607;BA.debugLine="Dim cleaned As String = Regex.Replace(\"[^a-zA-Zä";
_cleaned = __c.Regex.Replace("[^a-zA-ZäöüÄÖÜßéèêëáàâçñ \\-.]",__ref._tbxteilnehmer /*anywheresoftware.b4a.objects.EditTextWrapper*/ .getText(),"");
RDebugUtils.currentLine=6553610;
 //BA.debugLineNum = 6553610;BA.debugLine="Dim sb As StringBuilder";
_sb = new anywheresoftware.b4a.keywords.StringBuilderWrapper();
RDebugUtils.currentLine=6553611;
 //BA.debugLineNum = 6553611;BA.debugLine="sb.Initialize";
_sb.Initialize();
RDebugUtils.currentLine=6553612;
 //BA.debugLineNum = 6553612;BA.debugLine="Dim doupper As Boolean = True";
_doupper = __c.True;
RDebugUtils.currentLine=6553613;
 //BA.debugLineNum = 6553613;BA.debugLine="For i = 0 To cleaned.Length - 1";
{
final int step8 = 1;
final int limit8 = (int) (_cleaned.length()-1);
_i = (int) (0) ;
for (;_i <= limit8 ;_i = _i + step8 ) {
RDebugUtils.currentLine=6553614;
 //BA.debugLineNum = 6553614;BA.debugLine="Dim ch As String = cleaned.SubString2(i, i + 1)";
_ch = _cleaned.substring(_i,(int) (_i+1));
RDebugUtils.currentLine=6553615;
 //BA.debugLineNum = 6553615;BA.debugLine="If ch = \" \" Or ch = \"-\" Then";
if ((_ch).equals(" ") || (_ch).equals("-")) { 
RDebugUtils.currentLine=6553616;
 //BA.debugLineNum = 6553616;BA.debugLine="doupper = True";
_doupper = __c.True;
RDebugUtils.currentLine=6553617;
 //BA.debugLineNum = 6553617;BA.debugLine="sb.Append(ch)";
_sb.Append(_ch);
 }else 
{RDebugUtils.currentLine=6553618;
 //BA.debugLineNum = 6553618;BA.debugLine="Else if ch = \",\" Then";
if ((_ch).equals(",")) { 
 }else 
{RDebugUtils.currentLine=6553620;
 //BA.debugLineNum = 6553620;BA.debugLine="Else if doupper Then";
if (_doupper) { 
RDebugUtils.currentLine=6553621;
 //BA.debugLineNum = 6553621;BA.debugLine="sb.Append(ch.ToUpperCase)";
_sb.Append(_ch.toUpperCase(anywheresoftware.b4a.keywords.Common.stringLocale));
RDebugUtils.currentLine=6553622;
 //BA.debugLineNum = 6553622;BA.debugLine="doupper = False";
_doupper = __c.False;
 }else {
RDebugUtils.currentLine=6553624;
 //BA.debugLineNum = 6553624;BA.debugLine="sb.Append(ch)";
_sb.Append(_ch);
 }}}
;
 }
};
RDebugUtils.currentLine=6553627;
 //BA.debugLineNum = 6553627;BA.debugLine="tbxTeilnehmer.Text = sb.ToString";
__ref._tbxteilnehmer /*anywheresoftware.b4a.objects.EditTextWrapper*/ .setText(BA.ObjectToCharSequence(_sb.ToString()));
RDebugUtils.currentLine=6553628;
 //BA.debugLineNum = 6553628;BA.debugLine="dochange = True";
__ref._dochange /*boolean*/  = __c.True;
 };
RDebugUtils.currentLine=6553631;
 //BA.debugLineNum = 6553631;BA.debugLine="If dochange And tbxTeilnehmer.Text.Length >= 1 Th";
if (__ref._dochange /*boolean*/  && __ref._tbxteilnehmer /*anywheresoftware.b4a.objects.EditTextWrapper*/ .getText().length()>=1) { 
RDebugUtils.currentLine=6553632;
 //BA.debugLineNum = 6553632;BA.debugLine="Dim lsvItems As List";
_lsvitems = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=6553633;
 //BA.debugLineNum = 6553633;BA.debugLine="lsvItems.Initialize";
_lsvitems.Initialize();
RDebugUtils.currentLine=6553634;
 //BA.debugLineNum = 6553634;BA.debugLine="Dim query As String = tbxTeilnehmer.Text.Trim.To";
_query = __ref._tbxteilnehmer /*anywheresoftware.b4a.objects.EditTextWrapper*/ .getText().trim().toLowerCase(anywheresoftware.b4a.keywords.Common.stringLocale);
RDebugUtils.currentLine=6553635;
 //BA.debugLineNum = 6553635;BA.debugLine="If query.Length >= 1 Then";
if (_query.length()>=1) { 
RDebugUtils.currentLine=6553636;
 //BA.debugLineNum = 6553636;BA.debugLine="For Each tName As String In Teilnehmer";
{
final anywheresoftware.b4a.BA.IterableList group29 = __ref._teilnehmer /*anywheresoftware.b4a.objects.collections.List*/ ;
final int groupLen29 = group29.getSize()
;int index29 = 0;
;
for (; index29 < groupLen29;index29++){
_tname = BA.ObjectToString(group29.Get(index29));
RDebugUtils.currentLine=6553637;
 //BA.debugLineNum = 6553637;BA.debugLine="If tName.ToLowerCase.Contains(query) Then";
if (_tname.toLowerCase(anywheresoftware.b4a.keywords.Common.stringLocale).contains(_query)) { 
RDebugUtils.currentLine=6553638;
 //BA.debugLineNum = 6553638;BA.debugLine="lsvItems.Add(tName)";
_lsvitems.Add((Object)(_tname));
 };
 }
};
 };
RDebugUtils.currentLine=6553643;
 //BA.debugLineNum = 6553643;BA.debugLine="If tbxTeilnehmer.Text.Trim.Length >= 2 Or tbxTei";
if (__ref._tbxteilnehmer /*anywheresoftware.b4a.objects.EditTextWrapper*/ .getText().trim().length()>=2 || (__ref._tbxteilnehmer /*anywheresoftware.b4a.objects.EditTextWrapper*/ .getText()).equals("")) { 
RDebugUtils.currentLine=6553644;
 //BA.debugLineNum = 6553644;BA.debugLine="btnSpeichern.Enabled = True";
__ref._btnspeichern /*anywheresoftware.b4a.objects.ButtonWrapper*/ .setEnabled(__c.True);
RDebugUtils.currentLine=6553645;
 //BA.debugLineNum = 6553645;BA.debugLine="btnSpeichern.TextColor = colorgreen";
__ref._btnspeichern /*anywheresoftware.b4a.objects.ButtonWrapper*/ .setTextColor(__ref._colorgreen /*int*/ );
 };
RDebugUtils.currentLine=6553648;
 //BA.debugLineNum = 6553648;BA.debugLine="lsvName.Clear";
__ref._lsvname /*anywheresoftware.b4a.objects.ListViewWrapper*/ .Clear();
RDebugUtils.currentLine=6553649;
 //BA.debugLineNum = 6553649;BA.debugLine="If lsvItems.Size >= 1 Then";
if (_lsvitems.getSize()>=1) { 
RDebugUtils.currentLine=6553650;
 //BA.debugLineNum = 6553650;BA.debugLine="For Each item As String In lsvItems";
{
final anywheresoftware.b4a.BA.IterableList group41 = _lsvitems;
final int groupLen41 = group41.getSize()
;int index41 = 0;
;
for (; index41 < groupLen41;index41++){
_item = BA.ObjectToString(group41.Get(index41));
RDebugUtils.currentLine=6553651;
 //BA.debugLineNum = 6553651;BA.debugLine="lsvName.AddSingleLine(item)";
__ref._lsvname /*anywheresoftware.b4a.objects.ListViewWrapper*/ .AddSingleLine(BA.ObjectToCharSequence(_item));
 }
};
RDebugUtils.currentLine=6553653;
 //BA.debugLineNum = 6553653;BA.debugLine="lsvName.Visible = True";
__ref._lsvname /*anywheresoftware.b4a.objects.ListViewWrapper*/ .setVisible(__c.True);
 }else {
RDebugUtils.currentLine=6553655;
 //BA.debugLineNum = 6553655;BA.debugLine="lsvName.Visible = False";
__ref._lsvname /*anywheresoftware.b4a.objects.ListViewWrapper*/ .setVisible(__c.False);
 };
 }else {
RDebugUtils.currentLine=6553658;
 //BA.debugLineNum = 6553658;BA.debugLine="lsvName.Clear";
__ref._lsvname /*anywheresoftware.b4a.objects.ListViewWrapper*/ .Clear();
RDebugUtils.currentLine=6553659;
 //BA.debugLineNum = 6553659;BA.debugLine="lsvName.Visible = False";
__ref._lsvname /*anywheresoftware.b4a.objects.ListViewWrapper*/ .setVisible(__c.False);
RDebugUtils.currentLine=6553660;
 //BA.debugLineNum = 6553660;BA.debugLine="btnSpeichern.Enabled = False";
__ref._btnspeichern /*anywheresoftware.b4a.objects.ButtonWrapper*/ .setEnabled(__c.False);
RDebugUtils.currentLine=6553661;
 //BA.debugLineNum = 6553661;BA.debugLine="btnSpeichern.TextColor = 0xFF888888";
__ref._btnspeichern /*anywheresoftware.b4a.objects.ButtonWrapper*/ .setTextColor(((int)0xff888888));
 };
RDebugUtils.currentLine=6553664;
 //BA.debugLineNum = 6553664;BA.debugLine="tbxTeilnehmer.SelectionStart = tbxTeilnehmer.Text";
__ref._tbxteilnehmer /*anywheresoftware.b4a.objects.EditTextWrapper*/ .setSelectionStart(__ref._tbxteilnehmer /*anywheresoftware.b4a.objects.EditTextWrapper*/ .getText().length());
RDebugUtils.currentLine=6553665;
 //BA.debugLineNum = 6553665;BA.debugLine="startTimer";
__ref._starttimer /*String*/ (null);
RDebugUtils.currentLine=6553666;
 //BA.debugLineNum = 6553666;BA.debugLine="End Sub";
return "";
}
public String  _uhrzeit_tick(b4a.example.screenmain __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="screenmain";
if (Debug.shouldDelegate(ba, "uhrzeit_tick", false))
	 {return ((String) Debug.delegate(ba, "uhrzeit_tick", null));}
RDebugUtils.currentLine=7012352;
 //BA.debugLineNum = 7012352;BA.debugLine="Private Sub Uhrzeit_Tick";
RDebugUtils.currentLine=7012353;
 //BA.debugLineNum = 7012353;BA.debugLine="Uhrzeit.Enabled = False";
__ref._uhrzeit /*anywheresoftware.b4a.objects.Timer*/ .setEnabled(__c.False);
RDebugUtils.currentLine=7012354;
 //BA.debugLineNum = 7012354;BA.debugLine="B4XPages.ShowPage(\"ScreenSaver\")";
_b4xpages._showpage /*String*/ (ba,"ScreenSaver");
RDebugUtils.currentLine=7012355;
 //BA.debugLineNum = 7012355;BA.debugLine="ToastMessageShow(\"Timeout -> Wechsel zu ScreenSav";
__c.ToastMessageShow(BA.ObjectToCharSequence("Timeout -> Wechsel zu ScreenSaver"),__c.False);
RDebugUtils.currentLine=7012356;
 //BA.debugLineNum = 7012356;BA.debugLine="End Sub";
return "";
}
public String  _webergebnis_pagefinished(b4a.example.screenmain __ref,String _url) throws Exception{
__ref = this;
RDebugUtils.currentModule="screenmain";
if (Debug.shouldDelegate(ba, "webergebnis_pagefinished", false))
	 {return ((String) Debug.delegate(ba, "webergebnis_pagefinished", new Object[] {_url}));}
RDebugUtils.currentLine=4128768;
 //BA.debugLineNum = 4128768;BA.debugLine="Private Sub webErgebnis_PageFinished (Url As Strin";
RDebugUtils.currentLine=4128769;
 //BA.debugLineNum = 4128769;BA.debugLine="RunJS(\"init();\")";
__ref._runjs /*String*/ (null,"init();");
RDebugUtils.currentLine=4128770;
 //BA.debugLineNum = 4128770;BA.debugLine="setzeFDJ";
__ref._setzefdj /*String*/ (null);
RDebugUtils.currentLine=4128771;
 //BA.debugLineNum = 4128771;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=4325376;
 //BA.debugLineNum = 4325376;BA.debugLine="Public Sub webErgebnis_WebViewStringChange(value A";
RDebugUtils.currentLine=4325377;
 //BA.debugLineNum = 4325377;BA.debugLine="If value.StartsWith(\"rowclick\") Then";
if (_value.startsWith("rowclick")) { 
RDebugUtils.currentLine=4325378;
 //BA.debugLineNum = 4325378;BA.debugLine="Dim rowStr As String = value.SubString(8).Trim";
_rowstr = _value.substring((int) (8)).trim();
RDebugUtils.currentLine=4325379;
 //BA.debugLineNum = 4325379;BA.debugLine="If IsNumber(rowStr) Then";
if (__c.IsNumber(_rowstr)) { 
RDebugUtils.currentLine=4325380;
 //BA.debugLineNum = 4325380;BA.debugLine="Dim rowid As Int = rowStr";
_rowid = (int)(Double.parseDouble(_rowstr));
RDebugUtils.currentLine=4325381;
 //BA.debugLineNum = 4325381;BA.debugLine="If rowid > 0 Then";
if (_rowid>0) { 
RDebugUtils.currentLine=4325382;
 //BA.debugLineNum = 4325382;BA.debugLine="PlatzSelected = rowid";
__ref._platzselected /*int*/  = _rowid;
RDebugUtils.currentLine=4325383;
 //BA.debugLineNum = 4325383;BA.debugLine="disableEingabe";
__ref._disableeingabe /*String*/ (null);
RDebugUtils.currentLine=4325384;
 //BA.debugLineNum = 4325384;BA.debugLine="clear";
__ref._clear /*String*/ (null);
RDebugUtils.currentLine=4325385;
 //BA.debugLineNum = 4325385;BA.debugLine="setzePlatz(rowid)";
__ref._setzeplatz /*String*/ (null,_rowid);
 };
 };
 }else 
{RDebugUtils.currentLine=4325388;
 //BA.debugLineNum = 4325388;BA.debugLine="Else if value.StartsWith(\"Print:\") Then";
if (_value.startsWith("Print:")) { 
RDebugUtils.currentLine=4325389;
 //BA.debugLineNum = 4325389;BA.debugLine="Dim shareText As String = value.Replace(\"Print:";
_sharetext = _value.replace("Print: ",__ref._lblverein /*anywheresoftware.b4a.objects.LabelWrapper*/ .getText()+__c.CRLF+__ref._lblveranstaltung /*anywheresoftware.b4a.objects.LabelWrapper*/ .getText()+__c.CRLF+"am: "+__ref._lbldatum /*anywheresoftware.b4a.objects.LabelWrapper*/ .getText()+__c.CRLF);
RDebugUtils.currentLine=4325391;
 //BA.debugLineNum = 4325391;BA.debugLine="Dim in As Intent";
_in = new anywheresoftware.b4a.objects.IntentWrapper();
RDebugUtils.currentLine=4325392;
 //BA.debugLineNum = 4325392;BA.debugLine="in.Initialize(in.ACTION_SEND, \"\")";
_in.Initialize(_in.ACTION_SEND,"");
RDebugUtils.currentLine=4325393;
 //BA.debugLineNum = 4325393;BA.debugLine="in.SetType(\"text/plain\")";
_in.SetType("text/plain");
RDebugUtils.currentLine=4325394;
 //BA.debugLineNum = 4325394;BA.debugLine="in.PutExtra(\"android.intent.extra.TEXT\", shareTe";
_in.PutExtra("android.intent.extra.TEXT",(Object)(_sharetext));
RDebugUtils.currentLine=4325395;
 //BA.debugLineNum = 4325395;BA.debugLine="StartActivity(in)";
__c.StartActivity(ba,(Object)(_in.getObject()));
 }else 
{RDebugUtils.currentLine=4325396;
 //BA.debugLineNum = 4325396;BA.debugLine="Else if value.StartsWith(\"Height\") Then";
if (_value.startsWith("Height")) { 
 }else {
RDebugUtils.currentLine=4325399;
 //BA.debugLineNum = 4325399;BA.debugLine="Dim parts() As String = Regex.Split(\",\", value)";
_parts = __c.Regex.Split(",",_value);
RDebugUtils.currentLine=4325400;
 //BA.debugLineNum = 4325400;BA.debugLine="Dim neueListe As List";
_neueliste = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=4325401;
 //BA.debugLineNum = 4325401;BA.debugLine="neueListe.Initialize";
_neueliste.Initialize();
RDebugUtils.currentLine=4325402;
 //BA.debugLineNum = 4325402;BA.debugLine="For Each p As String In parts";
{
final String[] group24 = _parts;
final int groupLen24 = group24.length
;int index24 = 0;
;
for (; index24 < groupLen24;index24++){
_p = group24[index24];
RDebugUtils.currentLine=4325403;
 //BA.debugLineNum = 4325403;BA.debugLine="neueListe.Add(p)";
_neueliste.Add((Object)(_p));
 }
};
RDebugUtils.currentLine=4325405;
 //BA.debugLineNum = 4325405;BA.debugLine="webviewData = neueListe";
__ref._webviewdata /*anywheresoftware.b4a.objects.collections.List*/  = _neueliste;
RDebugUtils.currentLine=4325407;
 //BA.debugLineNum = 4325407;BA.debugLine="If VSTNGgeschlossen Then";
if (__ref._vstnggeschlossen /*boolean*/ ) { 
RDebugUtils.currentLine=4325408;
 //BA.debugLineNum = 4325408;BA.debugLine="vaEingabe.Visible = False";
__ref._vaeingabe /*anywheresoftware.b4a.objects.PanelWrapper*/ .setVisible(__c.False);
RDebugUtils.currentLine=4325409;
 //BA.debugLineNum = 4325409;BA.debugLine="haDown.Visible = True";
__ref._hadown /*anywheresoftware.b4a.objects.PanelWrapper*/ .setVisible(__c.True);
RDebugUtils.currentLine=4325410;
 //BA.debugLineNum = 4325410;BA.debugLine="btnDown.Visible = False";
__ref._btndown /*anywheresoftware.b4a.objects.ButtonWrapper*/ .setVisible(__c.False);
RDebugUtils.currentLine=4325411;
 //BA.debugLineNum = 4325411;BA.debugLine="UpdateLayoutPositions";
__ref._updatelayoutpositions /*String*/ (null);
 }else {
RDebugUtils.currentLine=4325413;
 //BA.debugLineNum = 4325413;BA.debugLine="RunJS(\"selectRowById(\" & PlatzSelected & \");\")";
__ref._runjs /*String*/ (null,"selectRowById("+BA.NumberToString(__ref._platzselected /*int*/ )+");");
 };
 }}}
;
RDebugUtils.currentLine=4325416;
 //BA.debugLineNum = 4325416;BA.debugLine="startTimer";
__ref._starttimer /*String*/ (null);
RDebugUtils.currentLine=4325417;
 //BA.debugLineNum = 4325417;BA.debugLine="End Sub";
return "";
}
}