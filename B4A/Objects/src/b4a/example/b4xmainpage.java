package b4a.example;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.debug.*;

public class b4xmainpage extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    private static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new anywheresoftware.b4a.ShellBA(_ba, this, htSubs, "b4a.example.b4xmainpage");
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            
        }
        if (BA.isShellModeRuntimeCheck(ba)) 
			   this.getClass().getMethod("_class_globals", b4a.example.b4xmainpage.class).invoke(this, new Object[] {null});
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
public b4a.example.screenmain _pagemain = null;
public b4a.example.settings _pagesettings = null;
public b4a.example.screensaver _pagesaver = null;
public String _apikey = "";
public String _tlnlastid = "";
public String _urlteilnehmer = "";
public String _urlergebnisse = "";
public anywheresoftware.b4a.objects.collections.List _vereineandkeys = null;
public String _dbdatentyp = "";
public String _idtoken = "";
public String _refreshtoken = "";
public boolean _debug = false;
public anywheresoftware.b4a.objects.collections.Map _status = null;
public int _colorgreen = 0;
public boolean _passwordvisible = false;
public int _selectedvereinindex = 0;
public boolean _ignoretextevents = false;
public anywheresoftware.b4a.objects.PanelWrapper _verticalarrangementheader = null;
public anywheresoftware.b4a.objects.LabelWrapper _lbllogin = null;
public anywheresoftware.b4a.objects.LabelWrapper _lblkeineverbindung = null;
public anywheresoftware.b4a.objects.PanelWrapper _verticalarrangementlogin = null;
public anywheresoftware.b4a.objects.EditTextWrapper _tbxemail = null;
public anywheresoftware.b4a.objects.EditTextWrapper _textboxpassword = null;
public anywheresoftware.b4a.objects.ButtonWrapper _btnfyeo = null;
public anywheresoftware.b4a.objects.ButtonWrapper _btnlogin = null;
public anywheresoftware.b4a.objects.PanelWrapper _verticalarrangementloading = null;
public anywheresoftware.b4a.objects.LabelWrapper _labelloading = null;
public anywheresoftware.b4a.objects.PanelWrapper _verticalarrangementvereine = null;
public anywheresoftware.b4a.objects.ButtonWrapper _btnvnok = null;
public anywheresoftware.b4a.objects.ListViewWrapper _lvwvereine = null;
public anywheresoftware.b4a.objects.Timer _uhrzeit = null;
public anywheresoftware.b4a.objects.collections.Map _dbverein = null;
public String _dbfilename = "";
public Object _ion = null;
public b4a.example.dateutils _dateutils = null;
public b4a.example.main _main = null;
public b4a.example.b4xpages _b4xpages = null;
public b4a.example.b4xcollections _b4xcollections = null;
public b4a.example.httputils2service _httputils2service = null;
public b4a.example.xuiviewsutils _xuiviewsutils = null;
public String  _addteilnehmer(b4a.example.b4xmainpage __ref,anywheresoftware.b4a.objects.collections.Map _teilnehmerliste,anywheresoftware.b4a.objects.collections.List _teilnehmer) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "addteilnehmer", false))
	 {return ((String) Debug.delegate(ba, "addteilnehmer", new Object[] {_teilnehmerliste,_teilnehmer}));}
anywheresoftware.b4a.objects.collections.List _dbteilnehmer = null;
String _item = "";
int _nextnum = 0;
String _dbkey = "";
String _vid = "";
String _url = "";
anywheresoftware.b4a.objects.collections.JSONParser.JSONGenerator _jg = null;
RDebugUtils.currentLine=38666240;
 //BA.debugLineNum = 38666240;BA.debugLine="Private Sub addTeilnehmer(Teilnehmerliste As Map,";
RDebugUtils.currentLine=38666241;
 //BA.debugLineNum = 38666241;BA.debugLine="Dim dbTeilnehmer As List = DBGet(\"Teilnehmer\", Nu";
_dbteilnehmer = new anywheresoftware.b4a.objects.collections.List();
_dbteilnehmer = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(__ref._dbget /*Object*/ (null,"Teilnehmer",__c.Null)));
RDebugUtils.currentLine=38666242;
 //BA.debugLineNum = 38666242;BA.debugLine="If dbTeilnehmer <> Null And dbTeilnehmer.IsInitia";
if (_dbteilnehmer!= null && _dbteilnehmer.IsInitialized()) { 
RDebugUtils.currentLine=38666243;
 //BA.debugLineNum = 38666243;BA.debugLine="For Each item As String In dbTeilnehmer";
{
final anywheresoftware.b4a.BA.IterableList group3 = _dbteilnehmer;
final int groupLen3 = group3.getSize()
;int index3 = 0;
;
for (; index3 < groupLen3;index3++){
_item = BA.ObjectToString(group3.Get(index3));
RDebugUtils.currentLine=38666244;
 //BA.debugLineNum = 38666244;BA.debugLine="If Teilnehmer.IndexOf(item.Trim) = -1 Then";
if (_teilnehmer.IndexOf((Object)(_item.trim()))==-1) { 
RDebugUtils.currentLine=38666245;
 //BA.debugLineNum = 38666245;BA.debugLine="Dim nextNum As Int = TLNlastID.Replace(\"t\", \"\"";
_nextnum = (int) ((double)(Double.parseDouble(__ref._tlnlastid /*String*/ .replace("t","")))+1);
RDebugUtils.currentLine=38666246;
 //BA.debugLineNum = 38666246;BA.debugLine="Dim DBkey As String = \"t\" & nextNum";
_dbkey = "t"+BA.NumberToString(_nextnum);
RDebugUtils.currentLine=38666247;
 //BA.debugLineNum = 38666247;BA.debugLine="TLNlastID = DBkey";
__ref._tlnlastid /*String*/  = _dbkey;
RDebugUtils.currentLine=38666248;
 //BA.debugLineNum = 38666248;BA.debugLine="Teilnehmerliste.Put(DBkey, CreateMap(\"Name\": i";
_teilnehmerliste.Put((Object)(_dbkey),(Object)(__c.createMap(new Object[] {(Object)("Name"),(Object)(_item.trim())}).getObject()));
 };
 }
};
 };
RDebugUtils.currentLine=38666253;
 //BA.debugLineNum = 38666253;BA.debugLine="If Teilnehmerliste.Size > 0 Then";
if (_teilnehmerliste.getSize()>0) { 
RDebugUtils.currentLine=38666254;
 //BA.debugLineNum = 38666254;BA.debugLine="Dim vID As String = DBGet(\"VereinsID\", \"[...]\")";
_vid = BA.ObjectToString(__ref._dbget /*Object*/ (null,"VereinsID",(Object)("[...]")));
RDebugUtils.currentLine=38666255;
 //BA.debugLineNum = 38666255;BA.debugLine="Dim url As String = URLteilnehmer.Replace(\"[...]";
_url = __ref._urlteilnehmer /*String*/ .replace("[...]",_vid)+".json?auth="+BA.ObjectToString(__ref._status /*anywheresoftware.b4a.objects.collections.Map*/ .GetDefault((Object)("idToken"),(Object)("")));
RDebugUtils.currentLine=38666256;
 //BA.debugLineNum = 38666256;BA.debugLine="Dim jg As JSONGenerator";
_jg = new anywheresoftware.b4a.objects.collections.JSONParser.JSONGenerator();
RDebugUtils.currentLine=38666257;
 //BA.debugLineNum = 38666257;BA.debugLine="jg.Initialize(Teilnehmerliste)";
_jg.Initialize(_teilnehmerliste);
RDebugUtils.currentLine=38666258;
 //BA.debugLineNum = 38666258;BA.debugLine="SendHttpRequest(\"addTLN\", \"PUT\", url, jg.ToStrin";
__ref._sendhttprequest /*void*/ (null,"addTLN","PUT",_url,_jg.ToString(),"application/json");
 };
RDebugUtils.currentLine=38666260;
 //BA.debugLineNum = 38666260;BA.debugLine="End Sub";
return "";
}
public Object  _dbget(b4a.example.b4xmainpage __ref,String _key,Object _defaultvalue) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "dbget", false))
	 {return ((Object) Debug.delegate(ba, "dbget", new Object[] {_key,_defaultvalue}));}
String _val = "";
anywheresoftware.b4a.objects.collections.JSONParser _jp = null;
RDebugUtils.currentLine=39256064;
 //BA.debugLineNum = 39256064;BA.debugLine="Private Sub DBGet(Key As String, DefaultValue As O";
RDebugUtils.currentLine=39256065;
 //BA.debugLineNum = 39256065;BA.debugLine="If DBVerein.ContainsKey(Key) = False Then Return";
if (__ref._dbverein /*anywheresoftware.b4a.objects.collections.Map*/ .ContainsKey((Object)(_key))==__c.False) { 
if (true) return _defaultvalue;};
RDebugUtils.currentLine=39256066;
 //BA.debugLineNum = 39256066;BA.debugLine="Dim val As String = DBVerein.Get(Key)";
_val = BA.ObjectToString(__ref._dbverein /*anywheresoftware.b4a.objects.collections.Map*/ .Get((Object)(_key)));
RDebugUtils.currentLine=39256067;
 //BA.debugLineNum = 39256067;BA.debugLine="If val.StartsWith(\"JSON_MAP:\") Then";
if (_val.startsWith("JSON_MAP:")) { 
RDebugUtils.currentLine=39256068;
 //BA.debugLineNum = 39256068;BA.debugLine="Dim jp As JSONParser";
_jp = new anywheresoftware.b4a.objects.collections.JSONParser();
RDebugUtils.currentLine=39256069;
 //BA.debugLineNum = 39256069;BA.debugLine="jp.Initialize(val.SubString(9))";
_jp.Initialize(_val.substring((int) (9)));
RDebugUtils.currentLine=39256070;
 //BA.debugLineNum = 39256070;BA.debugLine="Return jp.NextObject";
if (true) return (Object)(_jp.NextObject().getObject());
 }else 
{RDebugUtils.currentLine=39256071;
 //BA.debugLineNum = 39256071;BA.debugLine="Else If val.StartsWith(\"JSON_LIST:\") Then";
if (_val.startsWith("JSON_LIST:")) { 
RDebugUtils.currentLine=39256072;
 //BA.debugLineNum = 39256072;BA.debugLine="Dim jp As JSONParser";
_jp = new anywheresoftware.b4a.objects.collections.JSONParser();
RDebugUtils.currentLine=39256073;
 //BA.debugLineNum = 39256073;BA.debugLine="jp.Initialize(val.SubString(10))";
_jp.Initialize(_val.substring((int) (10)));
RDebugUtils.currentLine=39256074;
 //BA.debugLineNum = 39256074;BA.debugLine="Return jp.NextArray";
if (true) return (Object)(_jp.NextArray().getObject());
 }}
;
RDebugUtils.currentLine=39256076;
 //BA.debugLineNum = 39256076;BA.debugLine="Return val";
if (true) return (Object)(_val);
RDebugUtils.currentLine=39256077;
 //BA.debugLineNum = 39256077;BA.debugLine="End Sub";
return null;
}
public void  _sendhttprequest(b4a.example.b4xmainpage __ref,String _typ,String _method,String _url,String _payload,String _contenttype) throws Exception{
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "sendhttprequest", false))
	 {Debug.delegate(ba, "sendhttprequest", new Object[] {_typ,_method,_url,_payload,_contenttype}); return;}
ResumableSub_SendHttpRequest rsub = new ResumableSub_SendHttpRequest(this,__ref,_typ,_method,_url,_payload,_contenttype);
rsub.resume(ba, null);
}
public static class ResumableSub_SendHttpRequest extends BA.ResumableSub {
public ResumableSub_SendHttpRequest(b4a.example.b4xmainpage parent,b4a.example.b4xmainpage __ref,String _typ,String _method,String _url,String _payload,String _contenttype) {
this.parent = parent;
this.__ref = __ref;
this._typ = _typ;
this._method = _method;
this._url = _url;
this._payload = _payload;
this._contenttype = _contenttype;
this.__ref = parent;
}
b4a.example.b4xmainpage __ref;
b4a.example.b4xmainpage parent;
String _typ;
String _method;
String _url;
String _payload;
String _contenttype;
b4a.example.httpjob _j;
int _statuscode = 0;
String _errtxt = "";
String _savedid = "";
String _savedbez = "";
int _res;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="b4xmainpage";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=38469633;
 //BA.debugLineNum = 38469633;BA.debugLine="DBdatenTyp = typ";
__ref._dbdatentyp /*String*/  = _typ;
RDebugUtils.currentLine=38469634;
 //BA.debugLineNum = 38469634;BA.debugLine="Dim j As HttpJob";
_j = new b4a.example.httpjob();
RDebugUtils.currentLine=38469635;
 //BA.debugLineNum = 38469635;BA.debugLine="j.Initialize(typ, Me)";
_j._initialize /*String*/ (null,ba,_typ,parent);
RDebugUtils.currentLine=38469637;
 //BA.debugLineNum = 38469637;BA.debugLine="Select method";
if (true) break;

case 1:
//select
this.state = 20;
switch (BA.switchObjectToInt(_method,"GET","POST","PUT")) {
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
RDebugUtils.currentLine=38469639;
 //BA.debugLineNum = 38469639;BA.debugLine="j.Download(url)";
_j._download /*String*/ (null,_url);
 if (true) break;

case 5:
//C
this.state = 6;
RDebugUtils.currentLine=38469641;
 //BA.debugLineNum = 38469641;BA.debugLine="j.PostString(url, payload)";
_j._poststring /*String*/ (null,_url,_payload);
RDebugUtils.currentLine=38469642;
 //BA.debugLineNum = 38469642;BA.debugLine="If contentType <> \"\" Then j.GetRequest.SetConte";
if (true) break;

case 6:
//if
this.state = 11;
if ((_contenttype).equals("") == false) { 
this.state = 8;
;}if (true) break;

case 8:
//C
this.state = 11;
_j._getrequest /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ (null).SetContentType(_contenttype);
if (true) break;

case 11:
//C
this.state = 20;
;
 if (true) break;

case 13:
//C
this.state = 14;
RDebugUtils.currentLine=38469644;
 //BA.debugLineNum = 38469644;BA.debugLine="j.PutString(url, payload)";
_j._putstring /*String*/ (null,_url,_payload);
RDebugUtils.currentLine=38469645;
 //BA.debugLineNum = 38469645;BA.debugLine="If contentType <> \"\" Then j.GetRequest.SetConte";
if (true) break;

case 14:
//if
this.state = 19;
if ((_contenttype).equals("") == false) { 
this.state = 16;
;}if (true) break;

case 16:
//C
this.state = 19;
_j._getrequest /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ (null).SetContentType(_contenttype);
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
RDebugUtils.currentLine=38469648;
 //BA.debugLineNum = 38469648;BA.debugLine="Wait For (j) JobDone(j As HttpJob)";
parent.__c.WaitFor("jobdone", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "b4xmainpage", "sendhttprequest"), (Object)(_j));
this.state = 56;
return;
case 56:
//C
this.state = 21;
_j = (b4a.example.httpjob) result[1];
;
RDebugUtils.currentLine=38469650;
 //BA.debugLineNum = 38469650;BA.debugLine="If j.Success Then";
if (true) break;

case 21:
//if
this.state = 55;
if (_j._success /*boolean*/ ) { 
this.state = 23;
}else {
this.state = 25;
}if (true) break;

case 23:
//C
this.state = 55;
RDebugUtils.currentLine=38469651;
 //BA.debugLineNum = 38469651;BA.debugLine="HandleWebResponse(typ, url, j.GetString)";
__ref._handlewebresponse /*String*/ (null,_typ,_url,_j._getstring /*String*/ (null));
 if (true) break;

case 25:
//C
this.state = 26;
RDebugUtils.currentLine=38469653;
 //BA.debugLineNum = 38469653;BA.debugLine="Dim statusCode As Int = j.Response.StatusCode";
_statuscode = _j._response /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpResponse*/ .getStatusCode();
RDebugUtils.currentLine=38469654;
 //BA.debugLineNum = 38469654;BA.debugLine="If statusCode >= 400 And statusCode < 500 Then";
if (true) break;

case 26:
//if
this.state = 54;
if (_statuscode>=400 && _statuscode<500) { 
this.state = 28;
}else {
this.state = 43;
}if (true) break;

case 28:
//C
this.state = 29;
RDebugUtils.currentLine=38469655;
 //BA.debugLineNum = 38469655;BA.debugLine="Dim errTxt As String = j.ErrorMessage";
_errtxt = _j._errormessage /*String*/ ;
RDebugUtils.currentLine=38469656;
 //BA.debugLineNum = 38469656;BA.debugLine="If errTxt.Contains(\"INVALID_EMAIL\") Then";
if (true) break;

case 29:
//if
this.state = 38;
if (_errtxt.contains("INVALID_EMAIL")) { 
this.state = 31;
}else 
{RDebugUtils.currentLine=38469658;
 //BA.debugLineNum = 38469658;BA.debugLine="Else If errTxt.Contains(\"INVALID_LOGIN_CREDENTI";
if (_errtxt.contains("INVALID_LOGIN_CREDENTIALS") || _errtxt.contains("INVALID_PASSWORD") || _errtxt.contains("EMAIL_NOT_FOUND")) { 
this.state = 33;
}else 
{RDebugUtils.currentLine=38469660;
 //BA.debugLineNum = 38469660;BA.debugLine="Else If errTxt.Contains(\"TOO_MANY_ATTEMPTS_TRY_";
if (_errtxt.contains("TOO_MANY_ATTEMPTS_TRY_LATER")) { 
this.state = 35;
}else {
this.state = 37;
}}}
if (true) break;

case 31:
//C
this.state = 38;
RDebugUtils.currentLine=38469657;
 //BA.debugLineNum = 38469657;BA.debugLine="MsgboxAsync(\"Die eingegebene eMail-Adresse hat";
parent.__c.MsgboxAsync(BA.ObjectToCharSequence("Die eingegebene eMail-Adresse hat kein gültiges Format."),BA.ObjectToCharSequence("Anmeldung fehlgeschlagen"),ba);
 if (true) break;

case 33:
//C
this.state = 38;
RDebugUtils.currentLine=38469659;
 //BA.debugLineNum = 38469659;BA.debugLine="MsgboxAsync(\"eMail-Adresse oder Passwort ist f";
parent.__c.MsgboxAsync(BA.ObjectToCharSequence("eMail-Adresse oder Passwort ist falsch!"),BA.ObjectToCharSequence("Anmeldung fehlgeschlagen"),ba);
 if (true) break;

case 35:
//C
this.state = 38;
RDebugUtils.currentLine=38469661;
 //BA.debugLineNum = 38469661;BA.debugLine="MsgboxAsync(\"Zu viele Fehlversuche. Bitte spät";
parent.__c.MsgboxAsync(BA.ObjectToCharSequence("Zu viele Fehlversuche. Bitte später erneut versuchen."),BA.ObjectToCharSequence("Anmeldung gesperrt"),ba);
 if (true) break;

case 37:
//C
this.state = 38;
RDebugUtils.currentLine=38469663;
 //BA.debugLineNum = 38469663;BA.debugLine="MsgboxAsync(\"Anmeldefehler: \" & errTxt, \"Anmel";
parent.__c.MsgboxAsync(BA.ObjectToCharSequence("Anmeldefehler: "+_errtxt),BA.ObjectToCharSequence("Anmeldung fehlgeschlagen"),ba);
 if (true) break;
;
RDebugUtils.currentLine=38469665;
 //BA.debugLineNum = 38469665;BA.debugLine="If typ = \"refresh_token\" Then";

case 38:
//if
this.state = 41;
if ((_typ).equals("refresh_token")) { 
this.state = 40;
}if (true) break;

case 40:
//C
this.state = 41;
RDebugUtils.currentLine=38469666;
 //BA.debugLineNum = 38469666;BA.debugLine="VerticalArrangementLoading.Visible = False";
__ref._verticalarrangementloading /*anywheresoftware.b4a.objects.PanelWrapper*/ .setVisible(parent.__c.False);
RDebugUtils.currentLine=38469667;
 //BA.debugLineNum = 38469667;BA.debugLine="VerticalArrangementLogin.Visible = True";
__ref._verticalarrangementlogin /*anywheresoftware.b4a.objects.PanelWrapper*/ .setVisible(parent.__c.True);
 if (true) break;

case 41:
//C
this.state = 54;
;
 if (true) break;

case 43:
//C
this.state = 44;
RDebugUtils.currentLine=38469670;
 //BA.debugLineNum = 38469670;BA.debugLine="Status.Put(\"ProgOffline\", True)";
__ref._status /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("ProgOffline"),(Object)(parent.__c.True));
RDebugUtils.currentLine=38469671;
 //BA.debugLineNum = 38469671;BA.debugLine="lblKeineVerbindung.Visible = True";
__ref._lblkeineverbindung /*anywheresoftware.b4a.objects.LabelWrapper*/ .setVisible(parent.__c.True);
RDebugUtils.currentLine=38469672;
 //BA.debugLineNum = 38469672;BA.debugLine="lblLogin.Visible = False";
__ref._lbllogin /*anywheresoftware.b4a.objects.LabelWrapper*/ .setVisible(parent.__c.False);
RDebugUtils.currentLine=38469674;
 //BA.debugLineNum = 38469674;BA.debugLine="Dim savedID As String = DBGet(\"VereinsID\", \"\")";
_savedid = BA.ObjectToString(__ref._dbget /*Object*/ (null,"VereinsID",(Object)("")));
RDebugUtils.currentLine=38469675;
 //BA.debugLineNum = 38469675;BA.debugLine="Dim savedBez As String = DBGet(\"Bezeichnung\", \"";
_savedbez = BA.ObjectToString(__ref._dbget /*Object*/ (null,"Bezeichnung",(Object)("")));
RDebugUtils.currentLine=38469676;
 //BA.debugLineNum = 38469676;BA.debugLine="If savedID.Trim <> \"\" And savedBez.Trim <> \"\" T";
if (true) break;

case 44:
//if
this.state = 53;
if ((_savedid.trim()).equals("") == false && (_savedbez.trim()).equals("") == false) { 
this.state = 46;
}else {
this.state = 52;
}if (true) break;

case 46:
//C
this.state = 47;
RDebugUtils.currentLine=38469677;
 //BA.debugLineNum = 38469677;BA.debugLine="Msgbox2Async(\"Die Datenbank ist nicht erreichb";
parent.__c.Msgbox2Async(BA.ObjectToCharSequence("Die Datenbank ist nicht erreichbar. Kein Problem! Das Programm arbeitet offline und synchronisiert sich später mit der Datenbank. Es ist jedoch nur die zuletzt verwendete Wertungsliste verfügbar!"),BA.ObjectToCharSequence("Internet-Verbindung nicht möglich!"),"Offline nutzen","","",(anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper(), (android.graphics.Bitmap)(parent.__c.Null)),ba,parent.__c.True);
RDebugUtils.currentLine=38469678;
 //BA.debugLineNum = 38469678;BA.debugLine="Wait For Msgbox_Result (res As Int)";
parent.__c.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "b4xmainpage", "sendhttprequest"), null);
this.state = 57;
return;
case 57:
//C
this.state = 47;
_res = (Integer) result[1];
;
RDebugUtils.currentLine=38469679;
 //BA.debugLineNum = 38469679;BA.debugLine="If res = DialogResponse.POSITIVE Then";
if (true) break;

case 47:
//if
this.state = 50;
if (_res==parent.__c.DialogResponse.POSITIVE) { 
this.state = 49;
}if (true) break;

case 49:
//C
this.state = 50;
RDebugUtils.currentLine=38469680;
 //BA.debugLineNum = 38469680;BA.debugLine="Uhrzeit.Enabled = False";
__ref._uhrzeit /*anywheresoftware.b4a.objects.Timer*/ .setEnabled(parent.__c.False);
RDebugUtils.currentLine=38469681;
 //BA.debugLineNum = 38469681;BA.debugLine="B4XPages.ShowPage(\"ScreenMain\")";
parent._b4xpages._showpage /*String*/ (ba,"ScreenMain");
 if (true) break;

case 50:
//C
this.state = 53;
;
 if (true) break;

case 52:
//C
this.state = 53;
RDebugUtils.currentLine=38469684;
 //BA.debugLineNum = 38469684;BA.debugLine="MsgboxAsync(\"Die Datenbank ist nicht erreichba";
parent.__c.MsgboxAsync(BA.ObjectToCharSequence("Die Datenbank ist nicht erreichbar. Das Programm kann nicht gestartet werden!"+parent.__c.CRLF+"("+_j._errormessage /*String*/ +")"),BA.ObjectToCharSequence("Internet-Verbindung nicht möglich!"),ba);
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
RDebugUtils.currentLine=38469688;
 //BA.debugLineNum = 38469688;BA.debugLine="j.Release";
_j._release /*String*/ (null);
RDebugUtils.currentLine=38469689;
 //BA.debugLineNum = 38469689;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public void  _b4xpage_created(b4a.example.b4xmainpage __ref,anywheresoftware.b4a.objects.B4XViewWrapper _root1) throws Exception{
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "b4xpage_created", false))
	 {Debug.delegate(ba, "b4xpage_created", new Object[] {_root1}); return;}
ResumableSub_B4XPage_Created rsub = new ResumableSub_B4XPage_Created(this,__ref,_root1);
rsub.resume(ba, null);
}
public static class ResumableSub_B4XPage_Created extends BA.ResumableSub {
public ResumableSub_B4XPage_Created(b4a.example.b4xmainpage parent,b4a.example.b4xmainpage __ref,anywheresoftware.b4a.objects.B4XViewWrapper _root1) {
this.parent = parent;
this.__ref = __ref;
this._root1 = _root1;
this.__ref = parent;
}
b4a.example.b4xmainpage __ref;
b4a.example.b4xmainpage parent;
anywheresoftware.b4a.objects.B4XViewWrapper _root1;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="b4xmainpage";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=37421057;
 //BA.debugLineNum = 37421057;BA.debugLine="Root = Root1";
__ref._root /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = _root1;
RDebugUtils.currentLine=37421058;
 //BA.debugLineNum = 37421058;BA.debugLine="B4XPages.SetTitle(Me, \"Wertungslisten-App by sthn";
parent._b4xpages._settitle /*String*/ (ba,parent,(Object)("Wertungslisten-App by sthnet.de"));
RDebugUtils.currentLine=37421061;
 //BA.debugLineNum = 37421061;BA.debugLine="PageMain.Initialize";
__ref._pagemain /*b4a.example.screenmain*/ ._initialize /*String*/ (null,ba);
RDebugUtils.currentLine=37421062;
 //BA.debugLineNum = 37421062;BA.debugLine="B4XPages.AddPage(\"ScreenMain\", PageMain)";
parent._b4xpages._addpage /*String*/ (ba,"ScreenMain",(Object)(__ref._pagemain /*b4a.example.screenmain*/ ));
RDebugUtils.currentLine=37421064;
 //BA.debugLineNum = 37421064;BA.debugLine="PageSettings.Initialize";
__ref._pagesettings /*b4a.example.settings*/ ._initialize /*String*/ (null,ba);
RDebugUtils.currentLine=37421065;
 //BA.debugLineNum = 37421065;BA.debugLine="B4XPages.AddPage(\"Settings\", PageSettings)";
parent._b4xpages._addpage /*String*/ (ba,"Settings",(Object)(__ref._pagesettings /*b4a.example.settings*/ ));
RDebugUtils.currentLine=37421067;
 //BA.debugLineNum = 37421067;BA.debugLine="PageSaver.Initialize";
__ref._pagesaver /*b4a.example.screensaver*/ ._initialize /*String*/ (null,ba);
RDebugUtils.currentLine=37421068;
 //BA.debugLineNum = 37421068;BA.debugLine="B4XPages.AddPage(\"ScreenSaver\", PageSaver)";
parent._b4xpages._addpage /*String*/ (ba,"ScreenSaver",(Object)(__ref._pagesaver /*b4a.example.screensaver*/ ));
RDebugUtils.currentLine=37421071;
 //BA.debugLineNum = 37421071;BA.debugLine="BuildUI";
__ref._buildui /*String*/ (null);
RDebugUtils.currentLine=37421074;
 //BA.debugLineNum = 37421074;BA.debugLine="Uhrzeit.Enabled = False";
__ref._uhrzeit /*anywheresoftware.b4a.objects.Timer*/ .setEnabled(parent.__c.False);
RDebugUtils.currentLine=37421075;
 //BA.debugLineNum = 37421075;BA.debugLine="refreshToken = DBGet(\"refreshToken\", \"\")";
__ref._refreshtoken /*String*/  = BA.ObjectToString(__ref._dbget /*Object*/ (null,"refreshToken",(Object)("")));
RDebugUtils.currentLine=37421076;
 //BA.debugLineNum = 37421076;BA.debugLine="idToken = DBGet(\"idToken\", \"\")";
__ref._idtoken /*String*/  = BA.ObjectToString(__ref._dbget /*Object*/ (null,"idToken",(Object)("")));
RDebugUtils.currentLine=37421078;
 //BA.debugLineNum = 37421078;BA.debugLine="Status.Put(\"refreshToken\", refreshToken)";
__ref._status /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("refreshToken"),(Object)(__ref._refreshtoken /*String*/ ));
RDebugUtils.currentLine=37421079;
 //BA.debugLineNum = 37421079;BA.debugLine="Status.Put(\"idToken\", idToken)";
__ref._status /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("idToken"),(Object)(__ref._idtoken /*String*/ ));
RDebugUtils.currentLine=37421080;
 //BA.debugLineNum = 37421080;BA.debugLine="Status.Put(\"debug\", debug)";
__ref._status /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("debug"),(Object)(__ref._debug /*boolean*/ ));
RDebugUtils.currentLine=37421081;
 //BA.debugLineNum = 37421081;BA.debugLine="Status.Put(\"ProgOffline\", False)";
__ref._status /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("ProgOffline"),(Object)(parent.__c.False));
RDebugUtils.currentLine=37421083;
 //BA.debugLineNum = 37421083;BA.debugLine="colorgreen = LabelLoading.TextColor";
__ref._colorgreen /*int*/  = __ref._labelloading /*anywheresoftware.b4a.objects.LabelWrapper*/ .getTextColor();
RDebugUtils.currentLine=37421084;
 //BA.debugLineNum = 37421084;BA.debugLine="ignoreTextEvents = True";
__ref._ignoretextevents /*boolean*/  = parent.__c.True;
RDebugUtils.currentLine=37421085;
 //BA.debugLineNum = 37421085;BA.debugLine="tbxEmail.Text = \"\"";
__ref._tbxemail /*anywheresoftware.b4a.objects.EditTextWrapper*/ .setText(BA.ObjectToCharSequence(""));
RDebugUtils.currentLine=37421086;
 //BA.debugLineNum = 37421086;BA.debugLine="TextBoxPassword.Text = \"\"";
__ref._textboxpassword /*anywheresoftware.b4a.objects.EditTextWrapper*/ .setText(BA.ObjectToCharSequence(""));
RDebugUtils.currentLine=37421087;
 //BA.debugLineNum = 37421087;BA.debugLine="ignoreTextEvents = False";
__ref._ignoretextevents /*boolean*/  = parent.__c.False;
RDebugUtils.currentLine=37421089;
 //BA.debugLineNum = 37421089;BA.debugLine="If refreshToken <> \"\" And idToken <> \"\" Then";
if (true) break;

case 1:
//if
this.state = 6;
if ((__ref._refreshtoken /*String*/ ).equals("") == false && (__ref._idtoken /*String*/ ).equals("") == false) { 
this.state = 3;
}else {
this.state = 5;
}if (true) break;

case 3:
//C
this.state = 6;
RDebugUtils.currentLine=37421090;
 //BA.debugLineNum = 37421090;BA.debugLine="VerticalArrangementLoading.Visible = False";
__ref._verticalarrangementloading /*anywheresoftware.b4a.objects.PanelWrapper*/ .setVisible(parent.__c.False);
RDebugUtils.currentLine=37421091;
 //BA.debugLineNum = 37421091;BA.debugLine="VerticalArrangementLogin.Visible = False";
__ref._verticalarrangementlogin /*anywheresoftware.b4a.objects.PanelWrapper*/ .setVisible(parent.__c.False);
RDebugUtils.currentLine=37421092;
 //BA.debugLineNum = 37421092;BA.debugLine="VerticalArrangementVereine.Visible = False";
__ref._verticalarrangementvereine /*anywheresoftware.b4a.objects.PanelWrapper*/ .setVisible(parent.__c.False);
RDebugUtils.currentLine=37421094;
 //BA.debugLineNum = 37421094;BA.debugLine="Sleep(150)";
parent.__c.Sleep(ba,new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "b4xmainpage", "b4xpage_created"),(int) (150));
this.state = 7;
return;
case 7:
//C
this.state = 6;
;
RDebugUtils.currentLine=37421095;
 //BA.debugLineNum = 37421095;BA.debugLine="StartConfirmDeviceCredential";
__ref._startconfirmdevicecredential /*String*/ (null);
 if (true) break;

case 5:
//C
this.state = 6;
RDebugUtils.currentLine=37421097;
 //BA.debugLineNum = 37421097;BA.debugLine="VerticalArrangementLoading.Visible = False";
__ref._verticalarrangementloading /*anywheresoftware.b4a.objects.PanelWrapper*/ .setVisible(parent.__c.False);
RDebugUtils.currentLine=37421098;
 //BA.debugLineNum = 37421098;BA.debugLine="VerticalArrangementLogin.Visible = True";
__ref._verticalarrangementlogin /*anywheresoftware.b4a.objects.PanelWrapper*/ .setVisible(parent.__c.True);
 if (true) break;

case 6:
//C
this.state = -1;
;
RDebugUtils.currentLine=37421101;
 //BA.debugLineNum = 37421101;BA.debugLine="btnVnOK.Enabled = False";
__ref._btnvnok /*anywheresoftware.b4a.objects.ButtonWrapper*/ .setEnabled(parent.__c.False);
RDebugUtils.currentLine=37421102;
 //BA.debugLineNum = 37421102;BA.debugLine="btnVnOK.TextColor = 0xFF888888";
__ref._btnvnok /*anywheresoftware.b4a.objects.ButtonWrapper*/ .setTextColor(((int)0xff888888));
RDebugUtils.currentLine=37421104;
 //BA.debugLineNum = 37421104;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public String  _buildui(b4a.example.b4xmainpage __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "buildui", false))
	 {return ((String) Debug.delegate(ba, "buildui", null));}
int _boxwidth = 0;
int _leftmargin = 0;
anywheresoftware.b4a.objects.LabelWrapper _label1 = null;
anywheresoftware.b4a.objects.LabelWrapper _label2 = null;
anywheresoftware.b4a.objects.LabelWrapper _label4 = null;
RDebugUtils.currentLine=37486592;
 //BA.debugLineNum = 37486592;BA.debugLine="Private Sub BuildUI";
RDebugUtils.currentLine=37486594;
 //BA.debugLineNum = 37486594;BA.debugLine="If File.Exists(File.DirAssets, \"Screen.png\") Then";
if (__c.File.Exists(__c.File.getDirAssets(),"Screen.png")) { 
RDebugUtils.currentLine=37486595;
 //BA.debugLineNum = 37486595;BA.debugLine="Root.SetBitmap(xui.LoadBitmap(File.DirAssets, \"S";
__ref._root /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .SetBitmap((android.graphics.Bitmap)(__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .LoadBitmap(__c.File.getDirAssets(),"Screen.png").getObject()));
 }else {
RDebugUtils.currentLine=37486597;
 //BA.debugLineNum = 37486597;BA.debugLine="Root.Color = 0xFFEEFFEE";
__ref._root /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setColor(((int)0xffeeffee));
 };
RDebugUtils.currentLine=37486601;
 //BA.debugLineNum = 37486601;BA.debugLine="VerticalArrangementHeader.Initialize(\"\")";
__ref._verticalarrangementheader /*anywheresoftware.b4a.objects.PanelWrapper*/ .Initialize(ba,"");
RDebugUtils.currentLine=37486602;
 //BA.debugLineNum = 37486602;BA.debugLine="VerticalArrangementHeader.Color = 0xFFEEFFEE";
__ref._verticalarrangementheader /*anywheresoftware.b4a.objects.PanelWrapper*/ .setColor(((int)0xffeeffee));
RDebugUtils.currentLine=37486603;
 //BA.debugLineNum = 37486603;BA.debugLine="Root.AddView(VerticalArrangementHeader, 0, 0, 100";
__ref._root /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .AddView((android.view.View)(__ref._verticalarrangementheader /*anywheresoftware.b4a.objects.PanelWrapper*/ .getObject()),(int) (0),(int) (0),__c.PerXToCurrent((float) (100),ba),__c.DipToCurrent((int) (40)));
RDebugUtils.currentLine=37486605;
 //BA.debugLineNum = 37486605;BA.debugLine="lblLogin.Initialize(\"\")";
__ref._lbllogin /*anywheresoftware.b4a.objects.LabelWrapper*/ .Initialize(ba,"");
RDebugUtils.currentLine=37486606;
 //BA.debugLineNum = 37486606;BA.debugLine="lblLogin.Text = \"  Login\"";
__ref._lbllogin /*anywheresoftware.b4a.objects.LabelWrapper*/ .setText(BA.ObjectToCharSequence("  Login"));
RDebugUtils.currentLine=37486607;
 //BA.debugLineNum = 37486607;BA.debugLine="lblLogin.TextSize = 20";
__ref._lbllogin /*anywheresoftware.b4a.objects.LabelWrapper*/ .setTextSize((float) (20));
RDebugUtils.currentLine=37486608;
 //BA.debugLineNum = 37486608;BA.debugLine="lblLogin.Typeface = Typeface.DEFAULT_BOLD";
__ref._lbllogin /*anywheresoftware.b4a.objects.LabelWrapper*/ .setTypeface(__c.Typeface.DEFAULT_BOLD);
RDebugUtils.currentLine=37486609;
 //BA.debugLineNum = 37486609;BA.debugLine="lblLogin.TextColor = 0xFF16AA16";
__ref._lbllogin /*anywheresoftware.b4a.objects.LabelWrapper*/ .setTextColor(((int)0xff16aa16));
RDebugUtils.currentLine=37486610;
 //BA.debugLineNum = 37486610;BA.debugLine="lblLogin.Gravity = Gravity.CENTER_VERTICAL";
__ref._lbllogin /*anywheresoftware.b4a.objects.LabelWrapper*/ .setGravity(__c.Gravity.CENTER_VERTICAL);
RDebugUtils.currentLine=37486611;
 //BA.debugLineNum = 37486611;BA.debugLine="VerticalArrangementHeader.AddView(lblLogin, 0, 0,";
__ref._verticalarrangementheader /*anywheresoftware.b4a.objects.PanelWrapper*/ .AddView((android.view.View)(__ref._lbllogin /*anywheresoftware.b4a.objects.LabelWrapper*/ .getObject()),(int) (0),(int) (0),__c.PerXToCurrent((float) (100),ba),__c.DipToCurrent((int) (40)));
RDebugUtils.currentLine=37486613;
 //BA.debugLineNum = 37486613;BA.debugLine="lblKeineVerbindung.Initialize(\"\")";
__ref._lblkeineverbindung /*anywheresoftware.b4a.objects.LabelWrapper*/ .Initialize(ba,"");
RDebugUtils.currentLine=37486614;
 //BA.debugLineNum = 37486614;BA.debugLine="lblKeineVerbindung.Color = 0xFFFF0000";
__ref._lblkeineverbindung /*anywheresoftware.b4a.objects.LabelWrapper*/ .setColor(((int)0xffff0000));
RDebugUtils.currentLine=37486615;
 //BA.debugLineNum = 37486615;BA.debugLine="lblKeineVerbindung.Text = \"Keine Internetverbindu";
__ref._lblkeineverbindung /*anywheresoftware.b4a.objects.LabelWrapper*/ .setText(BA.ObjectToCharSequence("Keine Internetverbindung!"));
RDebugUtils.currentLine=37486616;
 //BA.debugLineNum = 37486616;BA.debugLine="lblKeineVerbindung.TextColor = 0xFFFFFFFF";
__ref._lblkeineverbindung /*anywheresoftware.b4a.objects.LabelWrapper*/ .setTextColor(((int)0xffffffff));
RDebugUtils.currentLine=37486617;
 //BA.debugLineNum = 37486617;BA.debugLine="lblKeineVerbindung.Gravity = Gravity.CENTER";
__ref._lblkeineverbindung /*anywheresoftware.b4a.objects.LabelWrapper*/ .setGravity(__c.Gravity.CENTER);
RDebugUtils.currentLine=37486618;
 //BA.debugLineNum = 37486618;BA.debugLine="lblKeineVerbindung.Visible = False";
__ref._lblkeineverbindung /*anywheresoftware.b4a.objects.LabelWrapper*/ .setVisible(__c.False);
RDebugUtils.currentLine=37486619;
 //BA.debugLineNum = 37486619;BA.debugLine="VerticalArrangementHeader.AddView(lblKeineVerbind";
__ref._verticalarrangementheader /*anywheresoftware.b4a.objects.PanelWrapper*/ .AddView((android.view.View)(__ref._lblkeineverbindung /*anywheresoftware.b4a.objects.LabelWrapper*/ .getObject()),(int) (0),(int) (0),__c.PerXToCurrent((float) (100),ba),__c.DipToCurrent((int) (40)));
RDebugUtils.currentLine=37486622;
 //BA.debugLineNum = 37486622;BA.debugLine="VerticalArrangementLogin.Initialize(\"\")";
__ref._verticalarrangementlogin /*anywheresoftware.b4a.objects.PanelWrapper*/ .Initialize(ba,"");
RDebugUtils.currentLine=37486623;
 //BA.debugLineNum = 37486623;BA.debugLine="VerticalArrangementLogin.Color = 0xFFEEFFEE";
__ref._verticalarrangementlogin /*anywheresoftware.b4a.objects.PanelWrapper*/ .setColor(((int)0xffeeffee));
RDebugUtils.currentLine=37486624;
 //BA.debugLineNum = 37486624;BA.debugLine="VerticalArrangementLogin.Visible = False";
__ref._verticalarrangementlogin /*anywheresoftware.b4a.objects.PanelWrapper*/ .setVisible(__c.False);
RDebugUtils.currentLine=37486625;
 //BA.debugLineNum = 37486625;BA.debugLine="Root.AddView(VerticalArrangementLogin, 0, 40dip,";
__ref._root /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .AddView((android.view.View)(__ref._verticalarrangementlogin /*anywheresoftware.b4a.objects.PanelWrapper*/ .getObject()),(int) (0),__c.DipToCurrent((int) (40)),__c.PerXToCurrent((float) (100),ba),__c.DipToCurrent((int) (260)));
RDebugUtils.currentLine=37486627;
 //BA.debugLineNum = 37486627;BA.debugLine="Dim boxWidth As Int = 80%x";
_boxwidth = __c.PerXToCurrent((float) (80),ba);
RDebugUtils.currentLine=37486628;
 //BA.debugLineNum = 37486628;BA.debugLine="Dim leftMargin As Int = 10%x";
_leftmargin = __c.PerXToCurrent((float) (10),ba);
RDebugUtils.currentLine=37486630;
 //BA.debugLineNum = 37486630;BA.debugLine="Dim Label1 As Label";
_label1 = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=37486631;
 //BA.debugLineNum = 37486631;BA.debugLine="Label1.Initialize(\"\")";
_label1.Initialize(ba,"");
RDebugUtils.currentLine=37486632;
 //BA.debugLineNum = 37486632;BA.debugLine="Label1.Text = \"eMail-Adresse:\"";
_label1.setText(BA.ObjectToCharSequence("eMail-Adresse:"));
RDebugUtils.currentLine=37486633;
 //BA.debugLineNum = 37486633;BA.debugLine="Label1.TextSize = 16";
_label1.setTextSize((float) (16));
RDebugUtils.currentLine=37486634;
 //BA.debugLineNum = 37486634;BA.debugLine="Label1.Typeface = Typeface.DEFAULT_BOLD";
_label1.setTypeface(__c.Typeface.DEFAULT_BOLD);
RDebugUtils.currentLine=37486635;
 //BA.debugLineNum = 37486635;BA.debugLine="Label1.TextColor = Colors.Black";
_label1.setTextColor(__c.Colors.Black);
RDebugUtils.currentLine=37486636;
 //BA.debugLineNum = 37486636;BA.debugLine="VerticalArrangementLogin.AddView(Label1, leftMarg";
__ref._verticalarrangementlogin /*anywheresoftware.b4a.objects.PanelWrapper*/ .AddView((android.view.View)(_label1.getObject()),_leftmargin,__c.DipToCurrent((int) (15)),_boxwidth,__c.DipToCurrent((int) (25)));
RDebugUtils.currentLine=37486638;
 //BA.debugLineNum = 37486638;BA.debugLine="tbxEmail.Initialize(\"tbxEmail\")";
__ref._tbxemail /*anywheresoftware.b4a.objects.EditTextWrapper*/ .Initialize(ba,"tbxEmail");
RDebugUtils.currentLine=37486639;
 //BA.debugLineNum = 37486639;BA.debugLine="tbxEmail.TextSize = 18";
__ref._tbxemail /*anywheresoftware.b4a.objects.EditTextWrapper*/ .setTextSize((float) (18));
RDebugUtils.currentLine=37486640;
 //BA.debugLineNum = 37486640;BA.debugLine="tbxEmail.Typeface = Typeface.DEFAULT_BOLD";
__ref._tbxemail /*anywheresoftware.b4a.objects.EditTextWrapper*/ .setTypeface(__c.Typeface.DEFAULT_BOLD);
RDebugUtils.currentLine=37486641;
 //BA.debugLineNum = 37486641;BA.debugLine="tbxEmail.TextColor = 0xFF16AA16";
__ref._tbxemail /*anywheresoftware.b4a.objects.EditTextWrapper*/ .setTextColor(((int)0xff16aa16));
RDebugUtils.currentLine=37486642;
 //BA.debugLineNum = 37486642;BA.debugLine="tbxEmail.SingleLine = True";
__ref._tbxemail /*anywheresoftware.b4a.objects.EditTextWrapper*/ .setSingleLine(__c.True);
RDebugUtils.currentLine=37486643;
 //BA.debugLineNum = 37486643;BA.debugLine="tbxEmail.InputType = 33";
__ref._tbxemail /*anywheresoftware.b4a.objects.EditTextWrapper*/ .setInputType((int) (33));
RDebugUtils.currentLine=37486644;
 //BA.debugLineNum = 37486644;BA.debugLine="VerticalArrangementLogin.AddView(tbxEmail, leftMa";
__ref._verticalarrangementlogin /*anywheresoftware.b4a.objects.PanelWrapper*/ .AddView((android.view.View)(__ref._tbxemail /*anywheresoftware.b4a.objects.EditTextWrapper*/ .getObject()),_leftmargin,__c.DipToCurrent((int) (42)),_boxwidth,__c.DipToCurrent((int) (45)));
RDebugUtils.currentLine=37486646;
 //BA.debugLineNum = 37486646;BA.debugLine="Dim Label2 As Label";
_label2 = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=37486647;
 //BA.debugLineNum = 37486647;BA.debugLine="Label2.Initialize(\"\")";
_label2.Initialize(ba,"");
RDebugUtils.currentLine=37486648;
 //BA.debugLineNum = 37486648;BA.debugLine="Label2.Text = \"Passwort:\"";
_label2.setText(BA.ObjectToCharSequence("Passwort:"));
RDebugUtils.currentLine=37486649;
 //BA.debugLineNum = 37486649;BA.debugLine="Label2.TextSize = 16";
_label2.setTextSize((float) (16));
RDebugUtils.currentLine=37486650;
 //BA.debugLineNum = 37486650;BA.debugLine="Label2.Typeface = Typeface.DEFAULT_BOLD";
_label2.setTypeface(__c.Typeface.DEFAULT_BOLD);
RDebugUtils.currentLine=37486651;
 //BA.debugLineNum = 37486651;BA.debugLine="Label2.TextColor = Colors.Black";
_label2.setTextColor(__c.Colors.Black);
RDebugUtils.currentLine=37486652;
 //BA.debugLineNum = 37486652;BA.debugLine="VerticalArrangementLogin.AddView(Label2, leftMarg";
__ref._verticalarrangementlogin /*anywheresoftware.b4a.objects.PanelWrapper*/ .AddView((android.view.View)(_label2.getObject()),_leftmargin,__c.DipToCurrent((int) (95)),_boxwidth,__c.DipToCurrent((int) (25)));
RDebugUtils.currentLine=37486654;
 //BA.debugLineNum = 37486654;BA.debugLine="TextBoxPassword.Initialize(\"TextBoxPassword\")";
__ref._textboxpassword /*anywheresoftware.b4a.objects.EditTextWrapper*/ .Initialize(ba,"TextBoxPassword");
RDebugUtils.currentLine=37486655;
 //BA.debugLineNum = 37486655;BA.debugLine="TextBoxPassword.TextSize = 18";
__ref._textboxpassword /*anywheresoftware.b4a.objects.EditTextWrapper*/ .setTextSize((float) (18));
RDebugUtils.currentLine=37486656;
 //BA.debugLineNum = 37486656;BA.debugLine="TextBoxPassword.Typeface = Typeface.DEFAULT_BOLD";
__ref._textboxpassword /*anywheresoftware.b4a.objects.EditTextWrapper*/ .setTypeface(__c.Typeface.DEFAULT_BOLD);
RDebugUtils.currentLine=37486657;
 //BA.debugLineNum = 37486657;BA.debugLine="TextBoxPassword.TextColor = 0xFF16AA16";
__ref._textboxpassword /*anywheresoftware.b4a.objects.EditTextWrapper*/ .setTextColor(((int)0xff16aa16));
RDebugUtils.currentLine=37486658;
 //BA.debugLineNum = 37486658;BA.debugLine="TextBoxPassword.PasswordMode = True";
__ref._textboxpassword /*anywheresoftware.b4a.objects.EditTextWrapper*/ .setPasswordMode(__c.True);
RDebugUtils.currentLine=37486659;
 //BA.debugLineNum = 37486659;BA.debugLine="TextBoxPassword.SingleLine = True";
__ref._textboxpassword /*anywheresoftware.b4a.objects.EditTextWrapper*/ .setSingleLine(__c.True);
RDebugUtils.currentLine=37486660;
 //BA.debugLineNum = 37486660;BA.debugLine="VerticalArrangementLogin.AddView(TextBoxPassword,";
__ref._verticalarrangementlogin /*anywheresoftware.b4a.objects.PanelWrapper*/ .AddView((android.view.View)(__ref._textboxpassword /*anywheresoftware.b4a.objects.EditTextWrapper*/ .getObject()),_leftmargin,__c.DipToCurrent((int) (122)),(int) (_boxwidth-__c.DipToCurrent((int) (36))),__c.DipToCurrent((int) (45)));
RDebugUtils.currentLine=37486662;
 //BA.debugLineNum = 37486662;BA.debugLine="btnFyeo.Initialize(\"btnFyeo\")";
__ref._btnfyeo /*anywheresoftware.b4a.objects.ButtonWrapper*/ .Initialize(ba,"btnFyeo");
RDebugUtils.currentLine=37486663;
 //BA.debugLineNum = 37486663;BA.debugLine="If File.Exists(File.DirAssets, \"fyeo.png\") Then";
if (__c.File.Exists(__c.File.getDirAssets(),"fyeo.png")) { 
RDebugUtils.currentLine=37486664;
 //BA.debugLineNum = 37486664;BA.debugLine="btnFyeo.SetBackgroundImage(LoadBitmap(File.DirAs";
__ref._btnfyeo /*anywheresoftware.b4a.objects.ButtonWrapper*/ .SetBackgroundImageNew((android.graphics.Bitmap)(__c.LoadBitmap(__c.File.getDirAssets(),"fyeo.png").getObject()));
 }else {
RDebugUtils.currentLine=37486666;
 //BA.debugLineNum = 37486666;BA.debugLine="btnFyeo.Text = \"👁\"";
__ref._btnfyeo /*anywheresoftware.b4a.objects.ButtonWrapper*/ .setText(BA.ObjectToCharSequence("👁"));
 };
RDebugUtils.currentLine=37486668;
 //BA.debugLineNum = 37486668;BA.debugLine="VerticalArrangementLogin.AddView(btnFyeo, leftMar";
__ref._verticalarrangementlogin /*anywheresoftware.b4a.objects.PanelWrapper*/ .AddView((android.view.View)(__ref._btnfyeo /*anywheresoftware.b4a.objects.ButtonWrapper*/ .getObject()),(int) (_leftmargin+_boxwidth-__c.DipToCurrent((int) (32))),__c.DipToCurrent((int) (130)),__c.DipToCurrent((int) (28)),__c.DipToCurrent((int) (28)));
RDebugUtils.currentLine=37486670;
 //BA.debugLineNum = 37486670;BA.debugLine="btnLogin.Initialize(\"btnLogin\")";
__ref._btnlogin /*anywheresoftware.b4a.objects.ButtonWrapper*/ .Initialize(ba,"btnLogin");
RDebugUtils.currentLine=37486671;
 //BA.debugLineNum = 37486671;BA.debugLine="btnLogin.Text = \"LogIn\"";
__ref._btnlogin /*anywheresoftware.b4a.objects.ButtonWrapper*/ .setText(BA.ObjectToCharSequence("LogIn"));
RDebugUtils.currentLine=37486672;
 //BA.debugLineNum = 37486672;BA.debugLine="btnLogin.Typeface = Typeface.DEFAULT_BOLD";
__ref._btnlogin /*anywheresoftware.b4a.objects.ButtonWrapper*/ .setTypeface(__c.Typeface.DEFAULT_BOLD);
RDebugUtils.currentLine=37486673;
 //BA.debugLineNum = 37486673;BA.debugLine="btnLogin.TextColor = 0xFF888888";
__ref._btnlogin /*anywheresoftware.b4a.objects.ButtonWrapper*/ .setTextColor(((int)0xff888888));
RDebugUtils.currentLine=37486674;
 //BA.debugLineNum = 37486674;BA.debugLine="btnLogin.Enabled = False";
__ref._btnlogin /*anywheresoftware.b4a.objects.ButtonWrapper*/ .setEnabled(__c.False);
RDebugUtils.currentLine=37486675;
 //BA.debugLineNum = 37486675;BA.debugLine="VerticalArrangementLogin.AddView(btnLogin, (100%x";
__ref._verticalarrangementlogin /*anywheresoftware.b4a.objects.PanelWrapper*/ .AddView((android.view.View)(__ref._btnlogin /*anywheresoftware.b4a.objects.ButtonWrapper*/ .getObject()),(int) ((__c.PerXToCurrent((float) (100),ba)-__c.DipToCurrent((int) (120)))/(double)2),__c.DipToCurrent((int) (185)),__c.DipToCurrent((int) (120)),__c.DipToCurrent((int) (45)));
RDebugUtils.currentLine=37486678;
 //BA.debugLineNum = 37486678;BA.debugLine="VerticalArrangementLoading.Initialize(\"\")";
__ref._verticalarrangementloading /*anywheresoftware.b4a.objects.PanelWrapper*/ .Initialize(ba,"");
RDebugUtils.currentLine=37486679;
 //BA.debugLineNum = 37486679;BA.debugLine="VerticalArrangementLoading.Color = 0xFFEEFFEE";
__ref._verticalarrangementloading /*anywheresoftware.b4a.objects.PanelWrapper*/ .setColor(((int)0xffeeffee));
RDebugUtils.currentLine=37486680;
 //BA.debugLineNum = 37486680;BA.debugLine="Root.AddView(VerticalArrangementLoading, 0, 40dip";
__ref._root /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .AddView((android.view.View)(__ref._verticalarrangementloading /*anywheresoftware.b4a.objects.PanelWrapper*/ .getObject()),(int) (0),__c.DipToCurrent((int) (40)),__c.PerXToCurrent((float) (100),ba),__c.DipToCurrent((int) (90)));
RDebugUtils.currentLine=37486682;
 //BA.debugLineNum = 37486682;BA.debugLine="LabelLoading.Initialize(\"\")";
__ref._labelloading /*anywheresoftware.b4a.objects.LabelWrapper*/ .Initialize(ba,"");
RDebugUtils.currentLine=37486683;
 //BA.debugLineNum = 37486683;BA.debugLine="LabelLoading.Text = \"Lade Daten ...\"";
__ref._labelloading /*anywheresoftware.b4a.objects.LabelWrapper*/ .setText(BA.ObjectToCharSequence("Lade Daten ..."));
RDebugUtils.currentLine=37486684;
 //BA.debugLineNum = 37486684;BA.debugLine="LabelLoading.Typeface = Typeface.DEFAULT_BOLD";
__ref._labelloading /*anywheresoftware.b4a.objects.LabelWrapper*/ .setTypeface(__c.Typeface.DEFAULT_BOLD);
RDebugUtils.currentLine=37486685;
 //BA.debugLineNum = 37486685;BA.debugLine="LabelLoading.TextColor = 0xFF16AA16";
__ref._labelloading /*anywheresoftware.b4a.objects.LabelWrapper*/ .setTextColor(((int)0xff16aa16));
RDebugUtils.currentLine=37486686;
 //BA.debugLineNum = 37486686;BA.debugLine="LabelLoading.Gravity = Gravity.CENTER";
__ref._labelloading /*anywheresoftware.b4a.objects.LabelWrapper*/ .setGravity(__c.Gravity.CENTER);
RDebugUtils.currentLine=37486687;
 //BA.debugLineNum = 37486687;BA.debugLine="VerticalArrangementLoading.AddView(LabelLoading,";
__ref._verticalarrangementloading /*anywheresoftware.b4a.objects.PanelWrapper*/ .AddView((android.view.View)(__ref._labelloading /*anywheresoftware.b4a.objects.LabelWrapper*/ .getObject()),(int) (0),__c.DipToCurrent((int) (25)),__c.PerXToCurrent((float) (100),ba),__c.DipToCurrent((int) (40)));
RDebugUtils.currentLine=37486690;
 //BA.debugLineNum = 37486690;BA.debugLine="VerticalArrangementVereine.Initialize(\"\")";
__ref._verticalarrangementvereine /*anywheresoftware.b4a.objects.PanelWrapper*/ .Initialize(ba,"");
RDebugUtils.currentLine=37486691;
 //BA.debugLineNum = 37486691;BA.debugLine="VerticalArrangementVereine.Color = 0xDDEEFFEE";
__ref._verticalarrangementvereine /*anywheresoftware.b4a.objects.PanelWrapper*/ .setColor(((int)0xddeeffee));
RDebugUtils.currentLine=37486692;
 //BA.debugLineNum = 37486692;BA.debugLine="VerticalArrangementVereine.Visible = False";
__ref._verticalarrangementvereine /*anywheresoftware.b4a.objects.PanelWrapper*/ .setVisible(__c.False);
RDebugUtils.currentLine=37486693;
 //BA.debugLineNum = 37486693;BA.debugLine="Root.AddView(VerticalArrangementVereine, 0, 0, 10";
__ref._root /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .AddView((android.view.View)(__ref._verticalarrangementvereine /*anywheresoftware.b4a.objects.PanelWrapper*/ .getObject()),(int) (0),(int) (0),__c.PerXToCurrent((float) (100),ba),__c.PerYToCurrent((float) (100),ba));
RDebugUtils.currentLine=37486695;
 //BA.debugLineNum = 37486695;BA.debugLine="Dim Label4 As Label";
_label4 = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=37486696;
 //BA.debugLineNum = 37486696;BA.debugLine="Label4.Initialize(\"\")";
_label4.Initialize(ba,"");
RDebugUtils.currentLine=37486697;
 //BA.debugLineNum = 37486697;BA.debugLine="Label4.Text = \"  Bitte Vereins-Auswahl treffen:\"";
_label4.setText(BA.ObjectToCharSequence("  Bitte Vereins-Auswahl treffen:"));
RDebugUtils.currentLine=37486698;
 //BA.debugLineNum = 37486698;BA.debugLine="Label4.TextSize = 16";
_label4.setTextSize((float) (16));
RDebugUtils.currentLine=37486699;
 //BA.debugLineNum = 37486699;BA.debugLine="Label4.Typeface = Typeface.DEFAULT_BOLD";
_label4.setTypeface(__c.Typeface.DEFAULT_BOLD);
RDebugUtils.currentLine=37486700;
 //BA.debugLineNum = 37486700;BA.debugLine="Label4.TextColor = Colors.Black";
_label4.setTextColor(__c.Colors.Black);
RDebugUtils.currentLine=37486701;
 //BA.debugLineNum = 37486701;BA.debugLine="Label4.Gravity = Gravity.CENTER_VERTICAL";
_label4.setGravity(__c.Gravity.CENTER_VERTICAL);
RDebugUtils.currentLine=37486702;
 //BA.debugLineNum = 37486702;BA.debugLine="VerticalArrangementVereine.AddView(Label4, 0, 5di";
__ref._verticalarrangementvereine /*anywheresoftware.b4a.objects.PanelWrapper*/ .AddView((android.view.View)(_label4.getObject()),(int) (0),__c.DipToCurrent((int) (5)),(int) (__c.PerXToCurrent((float) (100),ba)-__c.DipToCurrent((int) (80))),__c.DipToCurrent((int) (40)));
RDebugUtils.currentLine=37486704;
 //BA.debugLineNum = 37486704;BA.debugLine="btnVnOK.Initialize(\"btnVnOK\")";
__ref._btnvnok /*anywheresoftware.b4a.objects.ButtonWrapper*/ .Initialize(ba,"btnVnOK");
RDebugUtils.currentLine=37486705;
 //BA.debugLineNum = 37486705;BA.debugLine="btnVnOK.Text = \"OK\"";
__ref._btnvnok /*anywheresoftware.b4a.objects.ButtonWrapper*/ .setText(BA.ObjectToCharSequence("OK"));
RDebugUtils.currentLine=37486706;
 //BA.debugLineNum = 37486706;BA.debugLine="btnVnOK.Typeface = Typeface.DEFAULT_BOLD";
__ref._btnvnok /*anywheresoftware.b4a.objects.ButtonWrapper*/ .setTypeface(__c.Typeface.DEFAULT_BOLD);
RDebugUtils.currentLine=37486707;
 //BA.debugLineNum = 37486707;BA.debugLine="btnVnOK.TextColor = 0xFF888888";
__ref._btnvnok /*anywheresoftware.b4a.objects.ButtonWrapper*/ .setTextColor(((int)0xff888888));
RDebugUtils.currentLine=37486708;
 //BA.debugLineNum = 37486708;BA.debugLine="btnVnOK.Enabled = False";
__ref._btnvnok /*anywheresoftware.b4a.objects.ButtonWrapper*/ .setEnabled(__c.False);
RDebugUtils.currentLine=37486709;
 //BA.debugLineNum = 37486709;BA.debugLine="VerticalArrangementVereine.AddView(btnVnOK, 100%x";
__ref._verticalarrangementvereine /*anywheresoftware.b4a.objects.PanelWrapper*/ .AddView((android.view.View)(__ref._btnvnok /*anywheresoftware.b4a.objects.ButtonWrapper*/ .getObject()),(int) (__c.PerXToCurrent((float) (100),ba)-__c.DipToCurrent((int) (75))),__c.DipToCurrent((int) (5)),__c.DipToCurrent((int) (70)),__c.DipToCurrent((int) (40)));
RDebugUtils.currentLine=37486711;
 //BA.debugLineNum = 37486711;BA.debugLine="lvwVereine.Initialize(\"lvwVereine\")";
__ref._lvwvereine /*anywheresoftware.b4a.objects.ListViewWrapper*/ .Initialize(ba,"lvwVereine");
RDebugUtils.currentLine=37486712;
 //BA.debugLineNum = 37486712;BA.debugLine="lvwVereine.SingleLineLayout.Label.TextColor = 0xF";
__ref._lvwvereine /*anywheresoftware.b4a.objects.ListViewWrapper*/ .getSingleLineLayout().Label.setTextColor(((int)0xff16aa16));
RDebugUtils.currentLine=37486713;
 //BA.debugLineNum = 37486713;BA.debugLine="lvwVereine.SingleLineLayout.Label.TextSize = 18";
__ref._lvwvereine /*anywheresoftware.b4a.objects.ListViewWrapper*/ .getSingleLineLayout().Label.setTextSize((float) (18));
RDebugUtils.currentLine=37486714;
 //BA.debugLineNum = 37486714;BA.debugLine="VerticalArrangementVereine.AddView(lvwVereine, 0,";
__ref._verticalarrangementvereine /*anywheresoftware.b4a.objects.PanelWrapper*/ .AddView((android.view.View)(__ref._lvwvereine /*anywheresoftware.b4a.objects.ListViewWrapper*/ .getObject()),(int) (0),__c.DipToCurrent((int) (50)),__c.PerXToCurrent((float) (100),ba),(int) (__c.PerYToCurrent((float) (100),ba)-__c.DipToCurrent((int) (50))));
RDebugUtils.currentLine=37486715;
 //BA.debugLineNum = 37486715;BA.debugLine="End Sub";
return "";
}
public String  _startconfirmdevicecredential(b4a.example.b4xmainpage __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "startconfirmdevicecredential", false))
	 {return ((String) Debug.delegate(ba, "startconfirmdevicecredential", null));}
anywheresoftware.b4a.objects.IntentWrapper _i = null;
RDebugUtils.currentLine=39321600;
 //BA.debugLineNum = 39321600;BA.debugLine="Private Sub StartConfirmDeviceCredential";
RDebugUtils.currentLine=39321601;
 //BA.debugLineNum = 39321601;BA.debugLine="Try";
try {RDebugUtils.currentLine=39321602;
 //BA.debugLineNum = 39321602;BA.debugLine="Dim i As Intent";
_i = new anywheresoftware.b4a.objects.IntentWrapper();
RDebugUtils.currentLine=39321603;
 //BA.debugLineNum = 39321603;BA.debugLine="i.Initialize(\"android.app.action.CONFIRM_DEVICE_";
_i.Initialize("android.app.action.CONFIRM_DEVICE_CREDENTIAL","");
RDebugUtils.currentLine=39321604;
 //BA.debugLineNum = 39321604;BA.debugLine="StartActivityForResult(i)";
__ref._startactivityforresult /*String*/ (null,_i);
 } 
       catch (Exception e6) {
			ba.setLastException(e6);RDebugUtils.currentLine=39321607;
 //BA.debugLineNum = 39321607;BA.debugLine="Log(\"StartConfirmDeviceCredential Fehler: \" & La";
__c.LogImpl("839321607","StartConfirmDeviceCredential Fehler: "+__c.LastException(ba).getMessage(),0);
RDebugUtils.currentLine=39321608;
 //BA.debugLineNum = 39321608;BA.debugLine="RefreshTokenProcedure";
__ref._refreshtokenprocedure /*String*/ (null);
 };
RDebugUtils.currentLine=39321610;
 //BA.debugLineNum = 39321610;BA.debugLine="End Sub";
return "";
}
public String  _btnfyeo_click(b4a.example.b4xmainpage __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "btnfyeo_click", false))
	 {return ((String) Debug.delegate(ba, "btnfyeo_click", null));}
RDebugUtils.currentLine=37879808;
 //BA.debugLineNum = 37879808;BA.debugLine="Private Sub btnFyeo_Click";
RDebugUtils.currentLine=37879809;
 //BA.debugLineNum = 37879809;BA.debugLine="ignoreTextEvents = True";
__ref._ignoretextevents /*boolean*/  = __c.True;
RDebugUtils.currentLine=37879810;
 //BA.debugLineNum = 37879810;BA.debugLine="passwordVisible = Not(passwordVisible)";
__ref._passwordvisible /*boolean*/  = __c.Not(__ref._passwordvisible /*boolean*/ );
RDebugUtils.currentLine=37879811;
 //BA.debugLineNum = 37879811;BA.debugLine="TextBoxPassword.PasswordMode = Not(passwordVisibl";
__ref._textboxpassword /*anywheresoftware.b4a.objects.EditTextWrapper*/ .setPasswordMode(__c.Not(__ref._passwordvisible /*boolean*/ ));
RDebugUtils.currentLine=37879812;
 //BA.debugLineNum = 37879812;BA.debugLine="TextBoxPassword.SelectionStart = TextBoxPassword.";
__ref._textboxpassword /*anywheresoftware.b4a.objects.EditTextWrapper*/ .setSelectionStart(__ref._textboxpassword /*anywheresoftware.b4a.objects.EditTextWrapper*/ .getText().length());
RDebugUtils.currentLine=37879813;
 //BA.debugLineNum = 37879813;BA.debugLine="ignoreTextEvents = False";
__ref._ignoretextevents /*boolean*/  = __c.False;
RDebugUtils.currentLine=37879814;
 //BA.debugLineNum = 37879814;BA.debugLine="End Sub";
return "";
}
public String  _btnlogin_click(b4a.example.b4xmainpage __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "btnlogin_click", false))
	 {return ((String) Debug.delegate(ba, "btnlogin_click", null));}
String _url = "";
anywheresoftware.b4a.objects.collections.Map _bodymap = null;
anywheresoftware.b4a.objects.collections.JSONParser.JSONGenerator _jg = null;
RDebugUtils.currentLine=38076416;
 //BA.debugLineNum = 38076416;BA.debugLine="Private Sub btnLogin_Click";
RDebugUtils.currentLine=38076417;
 //BA.debugLineNum = 38076417;BA.debugLine="HideKeyboard";
__ref._hidekeyboard /*String*/ (null);
RDebugUtils.currentLine=38076418;
 //BA.debugLineNum = 38076418;BA.debugLine="Dim url As String = \"https://identitytoolkit.goog";
_url = "https://identitytoolkit.googleapis.com/v1/accounts:signInWithPassword?key="+__ref._apikey /*String*/ ;
RDebugUtils.currentLine=38076420;
 //BA.debugLineNum = 38076420;BA.debugLine="Dim bodyMap As Map = CreateMap( _ 		\"email\": tbxE";
_bodymap = new anywheresoftware.b4a.objects.collections.Map();
_bodymap = __c.createMap(new Object[] {(Object)("email"),(Object)(__ref._tbxemail /*anywheresoftware.b4a.objects.EditTextWrapper*/ .getText().trim()),(Object)("password"),(Object)(__ref._textboxpassword /*anywheresoftware.b4a.objects.EditTextWrapper*/ .getText().trim()),(Object)("returnSecureToken"),(Object)(__c.True)});
RDebugUtils.currentLine=38076424;
 //BA.debugLineNum = 38076424;BA.debugLine="Dim jg As JSONGenerator";
_jg = new anywheresoftware.b4a.objects.collections.JSONParser.JSONGenerator();
RDebugUtils.currentLine=38076425;
 //BA.debugLineNum = 38076425;BA.debugLine="jg.Initialize(bodyMap)";
_jg.Initialize(_bodymap);
RDebugUtils.currentLine=38076427;
 //BA.debugLineNum = 38076427;BA.debugLine="SendHttpRequest(\"refreshToken\", \"POST\", url, jg.T";
__ref._sendhttprequest /*void*/ (null,"refreshToken","POST",_url,_jg.ToString(),"application/json");
RDebugUtils.currentLine=38076428;
 //BA.debugLineNum = 38076428;BA.debugLine="End Sub";
return "";
}
public String  _hidekeyboard(b4a.example.b4xmainpage __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "hidekeyboard", false))
	 {return ((String) Debug.delegate(ba, "hidekeyboard", null));}
anywheresoftware.b4a.phone.Phone _p = null;
RDebugUtils.currentLine=39059456;
 //BA.debugLineNum = 39059456;BA.debugLine="Private Sub HideKeyboard";
RDebugUtils.currentLine=39059457;
 //BA.debugLineNum = 39059457;BA.debugLine="Dim p As Phone";
_p = new anywheresoftware.b4a.phone.Phone();
RDebugUtils.currentLine=39059458;
 //BA.debugLineNum = 39059458;BA.debugLine="p.HideKeyboard(B4XPages.GetNativeParent(Me))";
_p.HideKeyboard(_b4xpages._getnativeparent /*anywheresoftware.b4a.objects.ActivityWrapper*/ (ba,this));
RDebugUtils.currentLine=39059459;
 //BA.debugLineNum = 39059459;BA.debugLine="End Sub";
return "";
}
public String  _btnvnok_click(b4a.example.b4xmainpage __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "btnvnok_click", false))
	 {return ((String) Debug.delegate(ba, "btnvnok_click", null));}
RDebugUtils.currentLine=38010880;
 //BA.debugLineNum = 38010880;BA.debugLine="Private Sub btnVnOK_Click";
RDebugUtils.currentLine=38010881;
 //BA.debugLineNum = 38010881;BA.debugLine="Uhrzeit.Enabled = False";
__ref._uhrzeit /*anywheresoftware.b4a.objects.Timer*/ .setEnabled(__c.False);
RDebugUtils.currentLine=38010882;
 //BA.debugLineNum = 38010882;BA.debugLine="If selectedVereinIndex < 0 Then Return";
if (__ref._selectedvereinindex /*int*/ <0) { 
if (true) return "";};
RDebugUtils.currentLine=38010884;
 //BA.debugLineNum = 38010884;BA.debugLine="DBPut(\"Bezeichnung\", lvwVereine.GetItem(selectedV";
__ref._dbput /*String*/ (null,"Bezeichnung",__ref._lvwvereine /*anywheresoftware.b4a.objects.ListViewWrapper*/ .GetItem(__ref._selectedvereinindex /*int*/ ));
RDebugUtils.currentLine=38010885;
 //BA.debugLineNum = 38010885;BA.debugLine="DBPut(\"VereinsID\", VereineAndKeys.Get(selectedVer";
__ref._dbput /*String*/ (null,"VereinsID",__ref._vereineandkeys /*anywheresoftware.b4a.objects.collections.List*/ .Get(__ref._selectedvereinindex /*int*/ ));
RDebugUtils.currentLine=38010887;
 //BA.debugLineNum = 38010887;BA.debugLine="B4XPages.ShowPage(\"ScreenMain\")";
_b4xpages._showpage /*String*/ (ba,"ScreenMain");
RDebugUtils.currentLine=38010888;
 //BA.debugLineNum = 38010888;BA.debugLine="End Sub";
return "";
}
public String  _dbput(b4a.example.b4xmainpage __ref,String _key,Object _value) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "dbput", false))
	 {return ((String) Debug.delegate(ba, "dbput", new Object[] {_key,_value}));}
anywheresoftware.b4a.objects.collections.JSONParser.JSONGenerator _jg = null;
RDebugUtils.currentLine=39190528;
 //BA.debugLineNum = 39190528;BA.debugLine="Private Sub DBPut(Key As String, Value As Object)";
RDebugUtils.currentLine=39190529;
 //BA.debugLineNum = 39190529;BA.debugLine="If Value Is Map Then";
if (_value instanceof java.util.Map) { 
RDebugUtils.currentLine=39190530;
 //BA.debugLineNum = 39190530;BA.debugLine="Dim jg As JSONGenerator";
_jg = new anywheresoftware.b4a.objects.collections.JSONParser.JSONGenerator();
RDebugUtils.currentLine=39190531;
 //BA.debugLineNum = 39190531;BA.debugLine="jg.Initialize(Value)";
_jg.Initialize((anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_value)));
RDebugUtils.currentLine=39190532;
 //BA.debugLineNum = 39190532;BA.debugLine="DBVerein.Put(Key, \"JSON_MAP:\" & jg.ToString)";
__ref._dbverein /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)(_key),(Object)("JSON_MAP:"+_jg.ToString()));
 }else 
{RDebugUtils.currentLine=39190533;
 //BA.debugLineNum = 39190533;BA.debugLine="Else If Value Is List Then";
if (_value instanceof java.util.List) { 
RDebugUtils.currentLine=39190534;
 //BA.debugLineNum = 39190534;BA.debugLine="Dim jg As JSONGenerator";
_jg = new anywheresoftware.b4a.objects.collections.JSONParser.JSONGenerator();
RDebugUtils.currentLine=39190535;
 //BA.debugLineNum = 39190535;BA.debugLine="jg.Initialize2(Value)";
_jg.Initialize2((anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_value)));
RDebugUtils.currentLine=39190536;
 //BA.debugLineNum = 39190536;BA.debugLine="DBVerein.Put(Key, \"JSON_LIST:\" & jg.ToString)";
__ref._dbverein /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)(_key),(Object)("JSON_LIST:"+_jg.ToString()));
 }else {
RDebugUtils.currentLine=39190538;
 //BA.debugLineNum = 39190538;BA.debugLine="DBVerein.Put(Key, Value)";
__ref._dbverein /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)(_key),_value);
 }}
;
RDebugUtils.currentLine=39190540;
 //BA.debugLineNum = 39190540;BA.debugLine="File.WriteMap(File.DirInternal, DBFileName, DBVer";
__c.File.WriteMap(__c.File.getDirInternal(),__ref._dbfilename /*String*/ ,__ref._dbverein /*anywheresoftware.b4a.objects.collections.Map*/ );
RDebugUtils.currentLine=39190541;
 //BA.debugLineNum = 39190541;BA.debugLine="End Sub";
return "";
}
public String  _checkloginbuttonstate(b4a.example.b4xmainpage __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "checkloginbuttonstate", false))
	 {return ((String) Debug.delegate(ba, "checkloginbuttonstate", null));}
RDebugUtils.currentLine=37814272;
 //BA.debugLineNum = 37814272;BA.debugLine="Private Sub CheckLoginButtonState";
RDebugUtils.currentLine=37814273;
 //BA.debugLineNum = 37814273;BA.debugLine="If tbxEmail.Text.Trim <> \"\" And TextBoxPassword.T";
if ((__ref._tbxemail /*anywheresoftware.b4a.objects.EditTextWrapper*/ .getText().trim()).equals("") == false && (__ref._textboxpassword /*anywheresoftware.b4a.objects.EditTextWrapper*/ .getText().trim()).equals("") == false) { 
RDebugUtils.currentLine=37814274;
 //BA.debugLineNum = 37814274;BA.debugLine="btnLogin.Enabled = True";
__ref._btnlogin /*anywheresoftware.b4a.objects.ButtonWrapper*/ .setEnabled(__c.True);
RDebugUtils.currentLine=37814275;
 //BA.debugLineNum = 37814275;BA.debugLine="btnLogin.TextColor = colorgreen";
__ref._btnlogin /*anywheresoftware.b4a.objects.ButtonWrapper*/ .setTextColor(__ref._colorgreen /*int*/ );
 }else {
RDebugUtils.currentLine=37814277;
 //BA.debugLineNum = 37814277;BA.debugLine="btnLogin.Enabled = False";
__ref._btnlogin /*anywheresoftware.b4a.objects.ButtonWrapper*/ .setEnabled(__c.False);
RDebugUtils.currentLine=37814278;
 //BA.debugLineNum = 37814278;BA.debugLine="btnLogin.TextColor = 0xFF888888";
__ref._btnlogin /*anywheresoftware.b4a.objects.ButtonWrapper*/ .setTextColor(((int)0xff888888));
 };
RDebugUtils.currentLine=37814280;
 //BA.debugLineNum = 37814280;BA.debugLine="End Sub";
return "";
}
public String  _class_globals(b4a.example.b4xmainpage __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
RDebugUtils.currentLine=37289984;
 //BA.debugLineNum = 37289984;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=37289985;
 //BA.debugLineNum = 37289985;BA.debugLine="Private Root As B4XView";
_root = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=37289986;
 //BA.debugLineNum = 37289986;BA.debugLine="Private xui As XUI";
_xui = new anywheresoftware.b4a.objects.B4XViewWrapper.XUI();
RDebugUtils.currentLine=37289990;
 //BA.debugLineNum = 37289990;BA.debugLine="Public PageMain As ScreenMain";
_pagemain = new b4a.example.screenmain();
RDebugUtils.currentLine=37289991;
 //BA.debugLineNum = 37289991;BA.debugLine="Public PageSettings As Settings";
_pagesettings = new b4a.example.settings();
RDebugUtils.currentLine=37289992;
 //BA.debugLineNum = 37289992;BA.debugLine="Public PageSaver As ScreenSaver";
_pagesaver = new b4a.example.screensaver();
RDebugUtils.currentLine=37289995;
 //BA.debugLineNum = 37289995;BA.debugLine="Public apiKey As String = \"AIzaSyBT9m4udg4Bn4GhYG";
_apikey = "AIzaSyBT9m4udg4Bn4GhYGusVsj-H-gnYWmMA6U";
RDebugUtils.currentLine=37289996;
 //BA.debugLineNum = 37289996;BA.debugLine="Public TLNlastID As String = \"t0\"";
_tlnlastid = "t0";
RDebugUtils.currentLine=37289997;
 //BA.debugLineNum = 37289997;BA.debugLine="Public URLteilnehmer As String = \"https://wertung";
_urlteilnehmer = "https://wertungslisten-app-default-rtdb.europe-west1.firebasedatabase.app/Vereine/[...]/Teilnehmer";
RDebugUtils.currentLine=37289998;
 //BA.debugLineNum = 37289998;BA.debugLine="Public URLErgebnisse As String = \"https://wertung";
_urlergebnisse = "https://wertungslisten-app-default-rtdb.europe-west1.firebasedatabase.app/Vereine/[...]/Ergebnisse/";
RDebugUtils.currentLine=37289999;
 //BA.debugLineNum = 37289999;BA.debugLine="Public VereineAndKeys As List";
_vereineandkeys = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=37290000;
 //BA.debugLineNum = 37290000;BA.debugLine="Public DBdatenTyp As String = \"\"";
_dbdatentyp = "";
RDebugUtils.currentLine=37290001;
 //BA.debugLineNum = 37290001;BA.debugLine="Public idToken As String = \"\"";
_idtoken = "";
RDebugUtils.currentLine=37290002;
 //BA.debugLineNum = 37290002;BA.debugLine="Public refreshToken As String = \"\"";
_refreshtoken = "";
RDebugUtils.currentLine=37290003;
 //BA.debugLineNum = 37290003;BA.debugLine="Public debug As Boolean = False";
_debug = __c.False;
RDebugUtils.currentLine=37290004;
 //BA.debugLineNum = 37290004;BA.debugLine="Public Status As Map";
_status = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=37290005;
 //BA.debugLineNum = 37290005;BA.debugLine="Private colorgreen As Int = 0xFF16AA16";
_colorgreen = ((int)0xff16aa16);
RDebugUtils.currentLine=37290006;
 //BA.debugLineNum = 37290006;BA.debugLine="Private passwordVisible As Boolean = False";
_passwordvisible = __c.False;
RDebugUtils.currentLine=37290007;
 //BA.debugLineNum = 37290007;BA.debugLine="Private selectedVereinIndex As Int = -1";
_selectedvereinindex = (int) (-1);
RDebugUtils.currentLine=37290008;
 //BA.debugLineNum = 37290008;BA.debugLine="Private ignoreTextEvents As Boolean = False";
_ignoretextevents = __c.False;
RDebugUtils.currentLine=37290011;
 //BA.debugLineNum = 37290011;BA.debugLine="Private VerticalArrangementHeader As Panel";
_verticalarrangementheader = new anywheresoftware.b4a.objects.PanelWrapper();
RDebugUtils.currentLine=37290012;
 //BA.debugLineNum = 37290012;BA.debugLine="Private lblLogin As Label";
_lbllogin = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=37290013;
 //BA.debugLineNum = 37290013;BA.debugLine="Private lblKeineVerbindung As Label";
_lblkeineverbindung = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=37290015;
 //BA.debugLineNum = 37290015;BA.debugLine="Private VerticalArrangementLogin As Panel";
_verticalarrangementlogin = new anywheresoftware.b4a.objects.PanelWrapper();
RDebugUtils.currentLine=37290016;
 //BA.debugLineNum = 37290016;BA.debugLine="Private tbxEmail As EditText";
_tbxemail = new anywheresoftware.b4a.objects.EditTextWrapper();
RDebugUtils.currentLine=37290017;
 //BA.debugLineNum = 37290017;BA.debugLine="Private TextBoxPassword As EditText";
_textboxpassword = new anywheresoftware.b4a.objects.EditTextWrapper();
RDebugUtils.currentLine=37290018;
 //BA.debugLineNum = 37290018;BA.debugLine="Private btnFyeo As Button";
_btnfyeo = new anywheresoftware.b4a.objects.ButtonWrapper();
RDebugUtils.currentLine=37290019;
 //BA.debugLineNum = 37290019;BA.debugLine="Private btnLogin As Button";
_btnlogin = new anywheresoftware.b4a.objects.ButtonWrapper();
RDebugUtils.currentLine=37290021;
 //BA.debugLineNum = 37290021;BA.debugLine="Private VerticalArrangementLoading As Panel";
_verticalarrangementloading = new anywheresoftware.b4a.objects.PanelWrapper();
RDebugUtils.currentLine=37290022;
 //BA.debugLineNum = 37290022;BA.debugLine="Private LabelLoading As Label";
_labelloading = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=37290024;
 //BA.debugLineNum = 37290024;BA.debugLine="Private VerticalArrangementVereine As Panel";
_verticalarrangementvereine = new anywheresoftware.b4a.objects.PanelWrapper();
RDebugUtils.currentLine=37290025;
 //BA.debugLineNum = 37290025;BA.debugLine="Private btnVnOK As Button";
_btnvnok = new anywheresoftware.b4a.objects.ButtonWrapper();
RDebugUtils.currentLine=37290026;
 //BA.debugLineNum = 37290026;BA.debugLine="Private lvwVereine As ListView";
_lvwvereine = new anywheresoftware.b4a.objects.ListViewWrapper();
RDebugUtils.currentLine=37290029;
 //BA.debugLineNum = 37290029;BA.debugLine="Private Uhrzeit As Timer";
_uhrzeit = new anywheresoftware.b4a.objects.Timer();
RDebugUtils.currentLine=37290030;
 //BA.debugLineNum = 37290030;BA.debugLine="Private DBVerein As Map ' Ersetzt TinyDB (wird al";
_dbverein = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=37290031;
 //BA.debugLineNum = 37290031;BA.debugLine="Private DBFileName As String = \"DBVerein.dat\"";
_dbfilename = "DBVerein.dat";
RDebugUtils.currentLine=37290032;
 //BA.debugLineNum = 37290032;BA.debugLine="Private ion As Object ' Für ActivityResult (CONFI";
_ion = new Object();
RDebugUtils.currentLine=37290033;
 //BA.debugLineNum = 37290033;BA.debugLine="End Sub";
return "";
}
public String  _formatdatecustom(b4a.example.b4xmainpage __ref,long _ticks,String _pattern) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "formatdatecustom", false))
	 {return ((String) Debug.delegate(ba, "formatdatecustom", new Object[] {_ticks,_pattern}));}
String _oldformat = "";
String _res = "";
RDebugUtils.currentLine=38993920;
 //BA.debugLineNum = 38993920;BA.debugLine="Private Sub FormatDateCustom(ticks As Long, patter";
RDebugUtils.currentLine=38993921;
 //BA.debugLineNum = 38993921;BA.debugLine="Dim oldFormat As String = DateTime.DateFormat";
_oldformat = __c.DateTime.getDateFormat();
RDebugUtils.currentLine=38993922;
 //BA.debugLineNum = 38993922;BA.debugLine="DateTime.DateFormat = pattern";
__c.DateTime.setDateFormat(_pattern);
RDebugUtils.currentLine=38993923;
 //BA.debugLineNum = 38993923;BA.debugLine="Dim res As String = DateTime.Date(ticks)";
_res = __c.DateTime.Date(_ticks);
RDebugUtils.currentLine=38993924;
 //BA.debugLineNum = 38993924;BA.debugLine="DateTime.DateFormat = oldFormat";
__c.DateTime.setDateFormat(_oldformat);
RDebugUtils.currentLine=38993925;
 //BA.debugLineNum = 38993925;BA.debugLine="Return res";
if (true) return _res;
RDebugUtils.currentLine=38993926;
 //BA.debugLineNum = 38993926;BA.debugLine="End Sub";
return "";
}
public Object  _getba(b4a.example.b4xmainpage __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "getba", false))
	 {return ((Object) Debug.delegate(ba, "getba", null));}
anywheresoftware.b4j.object.JavaObject _jo = null;
RDebugUtils.currentLine=39518208;
 //BA.debugLineNum = 39518208;BA.debugLine="Private Sub GetBA As Object";
RDebugUtils.currentLine=39518209;
 //BA.debugLineNum = 39518209;BA.debugLine="Dim jo As JavaObject";
_jo = new anywheresoftware.b4j.object.JavaObject();
RDebugUtils.currentLine=39518210;
 //BA.debugLineNum = 39518210;BA.debugLine="jo.InitializeStatic(Application.PackageName & \".m";
_jo.InitializeStatic(__c.Application.getPackageName()+".main");
RDebugUtils.currentLine=39518211;
 //BA.debugLineNum = 39518211;BA.debugLine="Return jo.GetField(\"processBA\")";
if (true) return _jo.GetField("processBA");
RDebugUtils.currentLine=39518212;
 //BA.debugLineNum = 39518212;BA.debugLine="End Sub";
return null;
}
public String  _handlewebresponse(b4a.example.b4xmainpage __ref,String _typ,String _requrl,String _responsecontent) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "handlewebresponse", false))
	 {return ((String) Debug.delegate(ba, "handlewebresponse", new Object[] {_typ,_requrl,_responsecontent}));}
anywheresoftware.b4a.objects.collections.JSONParser _jp = null;
anywheresoftware.b4a.objects.collections.Map _resp = null;
anywheresoftware.b4a.objects.collections.Map _vereine = null;
String _k = "";
String _bez = "";
String[] _urlparts = null;
anywheresoftware.b4a.objects.collections.Map _aendmap = null;
RDebugUtils.currentLine=38535168;
 //BA.debugLineNum = 38535168;BA.debugLine="Private Sub HandleWebResponse(typ As String, reqUr";
RDebugUtils.currentLine=38535169;
 //BA.debugLineNum = 38535169;BA.debugLine="Dim jp As JSONParser";
_jp = new anywheresoftware.b4a.objects.collections.JSONParser();
RDebugUtils.currentLine=38535171;
 //BA.debugLineNum = 38535171;BA.debugLine="Select typ";
switch (BA.switchObjectToInt(_typ,"refreshToken","refresh_token","holeVereine","holeBezeichnungen","holeBezeichnung","UpdateErgebnisse","Teilnehmer","addTLN")) {
case 0: {
RDebugUtils.currentLine=38535173;
 //BA.debugLineNum = 38535173;BA.debugLine="jp.Initialize(responseContent)";
_jp.Initialize(_responsecontent);
RDebugUtils.currentLine=38535174;
 //BA.debugLineNum = 38535174;BA.debugLine="Dim resp As Map = jp.NextObject";
_resp = new anywheresoftware.b4a.objects.collections.Map();
_resp = _jp.NextObject();
RDebugUtils.currentLine=38535175;
 //BA.debugLineNum = 38535175;BA.debugLine="Status.Put(\"idToken\", resp.GetDefault(\"idToken\"";
__ref._status /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("idToken"),_resp.GetDefault((Object)("idToken"),(Object)("")));
RDebugUtils.currentLine=38535176;
 //BA.debugLineNum = 38535176;BA.debugLine="Status.Put(\"refreshToken\", resp.GetDefault(\"ref";
__ref._status /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("refreshToken"),_resp.GetDefault((Object)("refreshToken"),(Object)("")));
RDebugUtils.currentLine=38535177;
 //BA.debugLineNum = 38535177;BA.debugLine="DBPut(\"idToken\", Status.Get(\"idToken\"))";
__ref._dbput /*String*/ (null,"idToken",__ref._status /*anywheresoftware.b4a.objects.collections.Map*/ .Get((Object)("idToken")));
RDebugUtils.currentLine=38535178;
 //BA.debugLineNum = 38535178;BA.debugLine="DBPut(\"refreshToken\", Status.Get(\"refreshToken\"";
__ref._dbput /*String*/ (null,"refreshToken",__ref._status /*anywheresoftware.b4a.objects.collections.Map*/ .Get((Object)("refreshToken")));
RDebugUtils.currentLine=38535179;
 //BA.debugLineNum = 38535179;BA.debugLine="pruefeOfflineAenderung";
__ref._pruefeofflineaenderung /*void*/ (null);
 break; }
case 1: {
RDebugUtils.currentLine=38535182;
 //BA.debugLineNum = 38535182;BA.debugLine="jp.Initialize(responseContent)";
_jp.Initialize(_responsecontent);
RDebugUtils.currentLine=38535183;
 //BA.debugLineNum = 38535183;BA.debugLine="Dim resp As Map = jp.NextObject";
_resp = new anywheresoftware.b4a.objects.collections.Map();
_resp = _jp.NextObject();
RDebugUtils.currentLine=38535184;
 //BA.debugLineNum = 38535184;BA.debugLine="Status.Put(\"idToken\", resp.GetDefault(\"access_t";
__ref._status /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("idToken"),_resp.GetDefault((Object)("access_token"),(Object)("")));
RDebugUtils.currentLine=38535185;
 //BA.debugLineNum = 38535185;BA.debugLine="Status.Put(\"refreshToken\", resp.GetDefault(\"ref";
__ref._status /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("refreshToken"),_resp.GetDefault((Object)("refresh_token"),(Object)("")));
RDebugUtils.currentLine=38535186;
 //BA.debugLineNum = 38535186;BA.debugLine="DBPut(\"idToken\", Status.Get(\"idToken\"))";
__ref._dbput /*String*/ (null,"idToken",__ref._status /*anywheresoftware.b4a.objects.collections.Map*/ .Get((Object)("idToken")));
RDebugUtils.currentLine=38535187;
 //BA.debugLineNum = 38535187;BA.debugLine="DBPut(\"refreshToken\", Status.Get(\"refreshToken\"";
__ref._dbput /*String*/ (null,"refreshToken",__ref._status /*anywheresoftware.b4a.objects.collections.Map*/ .Get((Object)("refreshToken")));
RDebugUtils.currentLine=38535188;
 //BA.debugLineNum = 38535188;BA.debugLine="pruefeOfflineAenderung";
__ref._pruefeofflineaenderung /*void*/ (null);
 break; }
case 2: {
RDebugUtils.currentLine=38535191;
 //BA.debugLineNum = 38535191;BA.debugLine="jp.Initialize(responseContent)";
_jp.Initialize(_responsecontent);
RDebugUtils.currentLine=38535192;
 //BA.debugLineNum = 38535192;BA.debugLine="Dim vereine As Map = jp.NextObject";
_vereine = new anywheresoftware.b4a.objects.collections.Map();
_vereine = _jp.NextObject();
RDebugUtils.currentLine=38535193;
 //BA.debugLineNum = 38535193;BA.debugLine="If vereine.Size = 1 Then";
if (_vereine.getSize()==1) { 
RDebugUtils.currentLine=38535194;
 //BA.debugLineNum = 38535194;BA.debugLine="For Each k As String In vereine.Keys";
{
final anywheresoftware.b4a.BA.IterableList group23 = _vereine.Keys();
final int groupLen23 = group23.getSize()
;int index23 = 0;
;
for (; index23 < groupLen23;index23++){
_k = BA.ObjectToString(group23.Get(index23));
RDebugUtils.currentLine=38535195;
 //BA.debugLineNum = 38535195;BA.debugLine="DBPut(\"VereinsID\", k)";
__ref._dbput /*String*/ (null,"VereinsID",(Object)(_k));
RDebugUtils.currentLine=38535196;
 //BA.debugLineNum = 38535196;BA.debugLine="holeBezeichnung(k, \"holeBezeichnung\")";
__ref._holebezeichnung /*String*/ (null,_k,"holeBezeichnung");
 }
};
 }else 
{RDebugUtils.currentLine=38535198;
 //BA.debugLineNum = 38535198;BA.debugLine="Else If vereine.Size > 1 Then";
if (_vereine.getSize()>1) { 
RDebugUtils.currentLine=38535199;
 //BA.debugLineNum = 38535199;BA.debugLine="VereineAndKeys.Clear";
__ref._vereineandkeys /*anywheresoftware.b4a.objects.collections.List*/ .Clear();
RDebugUtils.currentLine=38535200;
 //BA.debugLineNum = 38535200;BA.debugLine="lvwVereine.Clear";
__ref._lvwvereine /*anywheresoftware.b4a.objects.ListViewWrapper*/ .Clear();
RDebugUtils.currentLine=38535201;
 //BA.debugLineNum = 38535201;BA.debugLine="selectedVereinIndex = -1";
__ref._selectedvereinindex /*int*/  = (int) (-1);
RDebugUtils.currentLine=38535202;
 //BA.debugLineNum = 38535202;BA.debugLine="For Each k As String In vereine.Keys";
{
final anywheresoftware.b4a.BA.IterableList group31 = _vereine.Keys();
final int groupLen31 = group31.getSize()
;int index31 = 0;
;
for (; index31 < groupLen31;index31++){
_k = BA.ObjectToString(group31.Get(index31));
RDebugUtils.currentLine=38535203;
 //BA.debugLineNum = 38535203;BA.debugLine="holeBezeichnung(k, \"holeBezeichnungen\")";
__ref._holebezeichnung /*String*/ (null,_k,"holeBezeichnungen");
 }
};
RDebugUtils.currentLine=38535205;
 //BA.debugLineNum = 38535205;BA.debugLine="VerticalArrangementHeader.Visible = False";
__ref._verticalarrangementheader /*anywheresoftware.b4a.objects.PanelWrapper*/ .setVisible(__c.False);
RDebugUtils.currentLine=38535206;
 //BA.debugLineNum = 38535206;BA.debugLine="VerticalArrangementLogin.Visible = False";
__ref._verticalarrangementlogin /*anywheresoftware.b4a.objects.PanelWrapper*/ .setVisible(__c.False);
RDebugUtils.currentLine=38535207;
 //BA.debugLineNum = 38535207;BA.debugLine="VerticalArrangementVereine.Visible = True";
__ref._verticalarrangementvereine /*anywheresoftware.b4a.objects.PanelWrapper*/ .setVisible(__c.True);
RDebugUtils.currentLine=38535208;
 //BA.debugLineNum = 38535208;BA.debugLine="startTimer";
__ref._starttimer /*String*/ (null);
 }else {
RDebugUtils.currentLine=38535210;
 //BA.debugLineNum = 38535210;BA.debugLine="ToastMessageShow(\"DB-Fehler, keine Vereine hin";
__c.ToastMessageShow(BA.ObjectToCharSequence("DB-Fehler, keine Vereine hinterlegt, Fehler 104"),__c.True);
 }}
;
 break; }
case 3: {
RDebugUtils.currentLine=38535214;
 //BA.debugLineNum = 38535214;BA.debugLine="Dim bez As String = responseContent.Replace(QUO";
_bez = _responsecontent.replace(__c.QUOTE,"");
RDebugUtils.currentLine=38535215;
 //BA.debugLineNum = 38535215;BA.debugLine="lvwVereine.AddSingleLine(bez)";
__ref._lvwvereine /*anywheresoftware.b4a.objects.ListViewWrapper*/ .AddSingleLine(BA.ObjectToCharSequence(_bez));
RDebugUtils.currentLine=38535216;
 //BA.debugLineNum = 38535216;BA.debugLine="Dim urlparts() As String = Regex.Split(\"/\", req";
_urlparts = __c.Regex.Split("/",_requrl);
RDebugUtils.currentLine=38535217;
 //BA.debugLineNum = 38535217;BA.debugLine="If urlparts.Length > 4 Then";
if (_urlparts.length>4) { 
RDebugUtils.currentLine=38535218;
 //BA.debugLineNum = 38535218;BA.debugLine="VereineAndKeys.Add(urlparts(4))";
__ref._vereineandkeys /*anywheresoftware.b4a.objects.collections.List*/ .Add((Object)(_urlparts[(int) (4)]));
 };
 break; }
case 4: {
RDebugUtils.currentLine=38535222;
 //BA.debugLineNum = 38535222;BA.debugLine="Dim bez As String = responseContent.Replace(QUO";
_bez = _responsecontent.replace(__c.QUOTE,"");
RDebugUtils.currentLine=38535223;
 //BA.debugLineNum = 38535223;BA.debugLine="DBPut(\"Bezeichnung\", bez)";
__ref._dbput /*String*/ (null,"Bezeichnung",(Object)(_bez));
RDebugUtils.currentLine=38535224;
 //BA.debugLineNum = 38535224;BA.debugLine="Uhrzeit.Enabled = False";
__ref._uhrzeit /*anywheresoftware.b4a.objects.Timer*/ .setEnabled(__c.False);
RDebugUtils.currentLine=38535225;
 //BA.debugLineNum = 38535225;BA.debugLine="B4XPages.ShowPage(\"ScreenMain\")";
_b4xpages._showpage /*String*/ (ba,"ScreenMain");
 break; }
case 5: {
RDebugUtils.currentLine=38535228;
 //BA.debugLineNum = 38535228;BA.debugLine="holeTLN";
__ref._holetln /*String*/ (null);
 break; }
case 6: {
RDebugUtils.currentLine=38535231;
 //BA.debugLineNum = 38535231;BA.debugLine="ladeTeilnehmer(responseContent)";
__ref._ladeteilnehmer /*String*/ (null,_responsecontent);
 break; }
case 7: {
RDebugUtils.currentLine=38535234;
 //BA.debugLineNum = 38535234;BA.debugLine="Dim aendMap As Map = CreateMap(\"Änderung\": Fals";
_aendmap = new anywheresoftware.b4a.objects.collections.Map();
_aendmap = __c.createMap(new Object[] {(Object)("Änderung"),(Object)(__c.False),(Object)("Datum"),(Object)(__ref._zeitstempel /*String*/ (null))});
RDebugUtils.currentLine=38535235;
 //BA.debugLineNum = 38535235;BA.debugLine="DBPut(\"letzteÄnderung\", aendMap)";
__ref._dbput /*String*/ (null,"letzteÄnderung",(Object)(_aendmap.getObject()));
RDebugUtils.currentLine=38535236;
 //BA.debugLineNum = 38535236;BA.debugLine="holeVerein";
__ref._holeverein /*String*/ (null);
 break; }
}
;
RDebugUtils.currentLine=38535238;
 //BA.debugLineNum = 38535238;BA.debugLine="End Sub";
return "";
}
public void  _pruefeofflineaenderung(b4a.example.b4xmainpage __ref) throws Exception{
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "pruefeofflineaenderung", false))
	 {Debug.delegate(ba, "pruefeofflineaenderung", null); return;}
ResumableSub_pruefeOfflineAenderung rsub = new ResumableSub_pruefeOfflineAenderung(this,__ref);
rsub.resume(ba, null);
}
public static class ResumableSub_pruefeOfflineAenderung extends BA.ResumableSub {
public ResumableSub_pruefeOfflineAenderung(b4a.example.b4xmainpage parent,b4a.example.b4xmainpage __ref) {
this.parent = parent;
this.__ref = __ref;
this.__ref = parent;
}
b4a.example.b4xmainpage __ref;
b4a.example.b4xmainpage parent;
anywheresoftware.b4a.objects.collections.Map _aendmap = null;
String _msg = "";
int _res;
anywheresoftware.b4a.objects.collections.List _wvdata = null;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="b4xmainpage";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=38731777;
 //BA.debugLineNum = 38731777;BA.debugLine="Dim aendMap As Map = DBGet(\"letzteÄnderung\", Null";
_aendmap = new anywheresoftware.b4a.objects.collections.Map();
_aendmap = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(__ref._dbget /*Object*/ (null,"letzteÄnderung",parent.__c.Null)));
RDebugUtils.currentLine=38731778;
 //BA.debugLineNum = 38731778;BA.debugLine="If aendMap <> Null And aendMap.IsInitialized And";
if (true) break;

case 1:
//if
this.state = 20;
if (_aendmap!= null && _aendmap.IsInitialized() && parent.__c.True==BA.ObjectToBoolean(_aendmap.GetDefault((Object)("Änderung"),(Object)(parent.__c.False)))) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
RDebugUtils.currentLine=38731779;
 //BA.debugLineNum = 38731779;BA.debugLine="If Zeitstempel <> aendMap.GetDefault(\"Datum\", Ze";
if (true) break;

case 4:
//if
this.state = 19;
if ((__ref._zeitstempel /*String*/ (null)).equals(BA.ObjectToString(_aendmap.GetDefault((Object)("Datum"),(Object)(__ref._zeitstempel /*String*/ (null))))) == false) { 
this.state = 6;
}if (true) break;

case 6:
//C
this.state = 7;
RDebugUtils.currentLine=38731780;
 //BA.debugLineNum = 38731780;BA.debugLine="VerticalArrangementHeader.Visible = False";
__ref._verticalarrangementheader /*anywheresoftware.b4a.objects.PanelWrapper*/ .setVisible(parent.__c.False);
RDebugUtils.currentLine=38731781;
 //BA.debugLineNum = 38731781;BA.debugLine="VerticalArrangementLogin.Visible = False";
__ref._verticalarrangementlogin /*anywheresoftware.b4a.objects.PanelWrapper*/ .setVisible(parent.__c.False);
RDebugUtils.currentLine=38731782;
 //BA.debugLineNum = 38731782;BA.debugLine="VerticalArrangementLoading.Visible = True";
__ref._verticalarrangementloading /*anywheresoftware.b4a.objects.PanelWrapper*/ .setVisible(parent.__c.True);
RDebugUtils.currentLine=38731784;
 //BA.debugLineNum = 38731784;BA.debugLine="Dim msg As String = \"Aus der letzen Verwendung";
_msg = "Aus der letzen Verwendung des Programms für den "+BA.ObjectToString(__ref._dbget /*Object*/ (null,"VeranstaltungDatum",(Object)("- nicht gesetzt -")))+" - "+BA.ObjectToString(__ref._dbget /*Object*/ (null,"VeranstaltungName",(Object)("- nicht gesetzt -")))+" - sind nicht gesicherte Daten vorhanden. Sollen diese Daten jetzt gesichert werden?";
RDebugUtils.currentLine=38731789;
 //BA.debugLineNum = 38731789;BA.debugLine="Msgbox2Async(msg, \"Nicht gesicherte Daten vorha";
parent.__c.Msgbox2Async(BA.ObjectToCharSequence(_msg),BA.ObjectToCharSequence("Nicht gesicherte Daten vorhanden"),"Sichern","","Verwerfen",(anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper(), (android.graphics.Bitmap)(parent.__c.Null)),ba,parent.__c.False);
RDebugUtils.currentLine=38731790;
 //BA.debugLineNum = 38731790;BA.debugLine="Wait For Msgbox_Result (res As Int)";
parent.__c.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "b4xmainpage", "pruefeofflineaenderung"), null);
this.state = 21;
return;
case 21:
//C
this.state = 7;
_res = (Integer) result[1];
;
RDebugUtils.currentLine=38731791;
 //BA.debugLineNum = 38731791;BA.debugLine="If res = DialogResponse.POSITIVE Then";
if (true) break;

case 7:
//if
this.state = 18;
if (_res==parent.__c.DialogResponse.POSITIVE) { 
this.state = 9;
}else 
{RDebugUtils.currentLine=38731794;
 //BA.debugLineNum = 38731794;BA.debugLine="Else If res = DialogResponse.NEGATIVE Then";
if (_res==parent.__c.DialogResponse.NEGATIVE) { 
this.state = 17;
}}
if (true) break;

case 9:
//C
this.state = 10;
RDebugUtils.currentLine=38731792;
 //BA.debugLineNum = 38731792;BA.debugLine="Dim wvData As List = DBGet(\"webviewData\", Null";
_wvdata = new anywheresoftware.b4a.objects.collections.List();
_wvdata = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(__ref._dbget /*Object*/ (null,"webviewData",parent.__c.Null)));
RDebugUtils.currentLine=38731793;
 //BA.debugLineNum = 38731793;BA.debugLine="If wvData <> Null Then saveWertungsliste(wvDat";
if (true) break;

case 10:
//if
this.state = 15;
if (_wvdata!= null) { 
this.state = 12;
;}if (true) break;

case 12:
//C
this.state = 15;
__ref._savewertungsliste /*String*/ (null,_wvdata);
if (true) break;

case 15:
//C
this.state = 18;
;
 if (true) break;

case 17:
//C
this.state = 18;
RDebugUtils.currentLine=38731795;
 //BA.debugLineNum = 38731795;BA.debugLine="DBPut(\"letzteÄnderung\", CreateMap(\"Änderung\":";
__ref._dbput /*String*/ (null,"letzteÄnderung",(Object)(parent.__c.createMap(new Object[] {(Object)("Änderung"),(Object)(parent.__c.False),(Object)("Datum"),(Object)(__ref._zeitstempel /*String*/ (null))}).getObject()));
RDebugUtils.currentLine=38731796;
 //BA.debugLineNum = 38731796;BA.debugLine="holeVerein";
__ref._holeverein /*String*/ (null);
 if (true) break;

case 18:
//C
this.state = 19;
;
RDebugUtils.currentLine=38731798;
 //BA.debugLineNum = 38731798;BA.debugLine="Return";
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
RDebugUtils.currentLine=38731801;
 //BA.debugLineNum = 38731801;BA.debugLine="holeVerein";
__ref._holeverein /*String*/ (null);
RDebugUtils.currentLine=38731802;
 //BA.debugLineNum = 38731802;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public String  _holebezeichnung(b4a.example.b4xmainpage __ref,String _key,String _typ) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "holebezeichnung", false))
	 {return ((String) Debug.delegate(ba, "holebezeichnung", new Object[] {_key,_typ}));}
String _url = "";
RDebugUtils.currentLine=38273024;
 //BA.debugLineNum = 38273024;BA.debugLine="Private Sub holeBezeichnung(key As String, typ As";
RDebugUtils.currentLine=38273025;
 //BA.debugLineNum = 38273025;BA.debugLine="Dim url As String = \"https://wertungslisten-app-d";
_url = "https://wertungslisten-app-default-rtdb.europe-west1.firebasedatabase.app/Vereine/"+_key+"/Bezeichnung.json?auth="+BA.ObjectToString(__ref._status /*anywheresoftware.b4a.objects.collections.Map*/ .GetDefault((Object)("idToken"),(Object)("")));
RDebugUtils.currentLine=38273026;
 //BA.debugLineNum = 38273026;BA.debugLine="SendHttpRequest(typ, \"GET\", url, \"\", \"\")";
__ref._sendhttprequest /*void*/ (null,_typ,"GET",_url,"","");
RDebugUtils.currentLine=38273027;
 //BA.debugLineNum = 38273027;BA.debugLine="End Sub";
return "";
}
public String  _starttimer(b4a.example.b4xmainpage __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "starttimer", false))
	 {return ((String) Debug.delegate(ba, "starttimer", null));}
RDebugUtils.currentLine=38797312;
 //BA.debugLineNum = 38797312;BA.debugLine="Private Sub startTimer";
RDebugUtils.currentLine=38797313;
 //BA.debugLineNum = 38797313;BA.debugLine="Uhrzeit.Enabled = False";
__ref._uhrzeit /*anywheresoftware.b4a.objects.Timer*/ .setEnabled(__c.False);
RDebugUtils.currentLine=38797314;
 //BA.debugLineNum = 38797314;BA.debugLine="Uhrzeit.Interval = 1000 * 60";
__ref._uhrzeit /*anywheresoftware.b4a.objects.Timer*/ .setInterval((long) (1000*60));
RDebugUtils.currentLine=38797315;
 //BA.debugLineNum = 38797315;BA.debugLine="Uhrzeit.Enabled = True";
__ref._uhrzeit /*anywheresoftware.b4a.objects.Timer*/ .setEnabled(__c.True);
RDebugUtils.currentLine=38797316;
 //BA.debugLineNum = 38797316;BA.debugLine="End Sub";
return "";
}
public String  _holetln(b4a.example.b4xmainpage __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "holetln", false))
	 {return ((String) Debug.delegate(ba, "holetln", null));}
String _vid = "";
String _url = "";
RDebugUtils.currentLine=38338560;
 //BA.debugLineNum = 38338560;BA.debugLine="Private Sub holeTLN";
RDebugUtils.currentLine=38338561;
 //BA.debugLineNum = 38338561;BA.debugLine="Dim vID As String = DBGet(\"VereinsID\", \"[...]\")";
_vid = BA.ObjectToString(__ref._dbget /*Object*/ (null,"VereinsID",(Object)("[...]")));
RDebugUtils.currentLine=38338562;
 //BA.debugLineNum = 38338562;BA.debugLine="Dim url As String = URLteilnehmer.Replace(\"[...]\"";
_url = __ref._urlteilnehmer /*String*/ .replace("[...]",_vid)+".json?auth="+BA.ObjectToString(__ref._status /*anywheresoftware.b4a.objects.collections.Map*/ .GetDefault((Object)("idToken"),(Object)("")));
RDebugUtils.currentLine=38338563;
 //BA.debugLineNum = 38338563;BA.debugLine="SendHttpRequest(\"Teilnehmer\", \"GET\", url, \"\", \"\")";
__ref._sendhttprequest /*void*/ (null,"Teilnehmer","GET",_url,"","");
RDebugUtils.currentLine=38338564;
 //BA.debugLineNum = 38338564;BA.debugLine="End Sub";
return "";
}
public String  _ladeteilnehmer(b4a.example.b4xmainpage __ref,String _response) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "ladeteilnehmer", false))
	 {return ((String) Debug.delegate(ba, "ladeteilnehmer", new Object[] {_response}));}
anywheresoftware.b4a.objects.collections.List _teilnehmer = null;
anywheresoftware.b4a.objects.collections.JSONParser _jp = null;
anywheresoftware.b4a.objects.collections.Map _teilnehmerliste = null;
String _key = "";
int _lastid = 0;
int _currentmax = 0;
anywheresoftware.b4a.objects.collections.Map _tmap = null;
anywheresoftware.b4a.objects.collections.Map _emptymap = null;
RDebugUtils.currentLine=38600704;
 //BA.debugLineNum = 38600704;BA.debugLine="Private Sub ladeTeilnehmer(response As String)";
RDebugUtils.currentLine=38600705;
 //BA.debugLineNum = 38600705;BA.debugLine="Dim Teilnehmer As List";
_teilnehmer = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=38600706;
 //BA.debugLineNum = 38600706;BA.debugLine="Teilnehmer.Initialize";
_teilnehmer.Initialize();
RDebugUtils.currentLine=38600708;
 //BA.debugLineNum = 38600708;BA.debugLine="If response <> \"\" And response <> \"null\" Then";
if ((_response).equals("") == false && (_response).equals("null") == false) { 
RDebugUtils.currentLine=38600709;
 //BA.debugLineNum = 38600709;BA.debugLine="Dim jp As JSONParser";
_jp = new anywheresoftware.b4a.objects.collections.JSONParser();
RDebugUtils.currentLine=38600710;
 //BA.debugLineNum = 38600710;BA.debugLine="jp.Initialize(response)";
_jp.Initialize(_response);
RDebugUtils.currentLine=38600711;
 //BA.debugLineNum = 38600711;BA.debugLine="Dim teilnehmerliste As Map = jp.NextObject";
_teilnehmerliste = new anywheresoftware.b4a.objects.collections.Map();
_teilnehmerliste = _jp.NextObject();
RDebugUtils.currentLine=38600713;
 //BA.debugLineNum = 38600713;BA.debugLine="For Each key As String In teilnehmerliste.Keys";
{
final anywheresoftware.b4a.BA.IterableList group7 = _teilnehmerliste.Keys();
final int groupLen7 = group7.getSize()
;int index7 = 0;
;
for (; index7 < groupLen7;index7++){
_key = BA.ObjectToString(group7.Get(index7));
RDebugUtils.currentLine=38600714;
 //BA.debugLineNum = 38600714;BA.debugLine="Dim lastID As Int = key.Replace(\"t\", \"\")";
_lastid = (int)(Double.parseDouble(_key.replace("t","")));
RDebugUtils.currentLine=38600715;
 //BA.debugLineNum = 38600715;BA.debugLine="Dim currentMax As Int = TLNlastID.Replace(\"t\",";
_currentmax = (int)(Double.parseDouble(__ref._tlnlastid /*String*/ .replace("t","")));
RDebugUtils.currentLine=38600716;
 //BA.debugLineNum = 38600716;BA.debugLine="If lastID > currentMax Then";
if (_lastid>_currentmax) { 
RDebugUtils.currentLine=38600717;
 //BA.debugLineNum = 38600717;BA.debugLine="TLNlastID = \"t\" & lastID";
__ref._tlnlastid /*String*/  = "t"+BA.NumberToString(_lastid);
 };
RDebugUtils.currentLine=38600719;
 //BA.debugLineNum = 38600719;BA.debugLine="Dim tMap As Map = teilnehmerliste.Get(key)";
_tmap = new anywheresoftware.b4a.objects.collections.Map();
_tmap = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_teilnehmerliste.Get((Object)(_key))));
RDebugUtils.currentLine=38600720;
 //BA.debugLineNum = 38600720;BA.debugLine="Teilnehmer.Add(tMap.GetDefault(\"Name\", \"unbenan";
_teilnehmer.Add(_tmap.GetDefault((Object)("Name"),(Object)("unbenannt")));
 }
};
RDebugUtils.currentLine=38600722;
 //BA.debugLineNum = 38600722;BA.debugLine="addTeilnehmer(teilnehmerliste, Teilnehmer)";
__ref._addteilnehmer /*String*/ (null,_teilnehmerliste,_teilnehmer);
 }else {
RDebugUtils.currentLine=38600724;
 //BA.debugLineNum = 38600724;BA.debugLine="Dim emptyMap As Map";
_emptymap = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=38600725;
 //BA.debugLineNum = 38600725;BA.debugLine="emptyMap.Initialize";
_emptymap.Initialize();
RDebugUtils.currentLine=38600726;
 //BA.debugLineNum = 38600726;BA.debugLine="addTeilnehmer(emptyMap, Teilnehmer)";
__ref._addteilnehmer /*String*/ (null,_emptymap,_teilnehmer);
 };
RDebugUtils.currentLine=38600728;
 //BA.debugLineNum = 38600728;BA.debugLine="End Sub";
return "";
}
public String  _zeitstempel(b4a.example.b4xmainpage __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "zeitstempel", false))
	 {return ((String) Debug.delegate(ba, "zeitstempel", null));}
RDebugUtils.currentLine=38928384;
 //BA.debugLineNum = 38928384;BA.debugLine="Private Sub Zeitstempel As String";
RDebugUtils.currentLine=38928385;
 //BA.debugLineNum = 38928385;BA.debugLine="Return FormatDateCustom(DateTime.Now, \"yyyyMMddHH";
if (true) return __ref._formatdatecustom /*String*/ (null,__c.DateTime.getNow(),"yyyyMMddHHmmss");
RDebugUtils.currentLine=38928386;
 //BA.debugLineNum = 38928386;BA.debugLine="End Sub";
return "";
}
public String  _holeverein(b4a.example.b4xmainpage __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "holeverein", false))
	 {return ((String) Debug.delegate(ba, "holeverein", null));}
String _url = "";
RDebugUtils.currentLine=38207488;
 //BA.debugLineNum = 38207488;BA.debugLine="Private Sub holeVerein";
RDebugUtils.currentLine=38207489;
 //BA.debugLineNum = 38207489;BA.debugLine="Dim url As String = \"https://wertungslisten-app-d";
_url = "https://wertungslisten-app-default-rtdb.europe-west1.firebasedatabase.app/Vereine.json?shallow=true&auth="+BA.ObjectToString(__ref._status /*anywheresoftware.b4a.objects.collections.Map*/ .GetDefault((Object)("idToken"),(Object)("")));
RDebugUtils.currentLine=38207490;
 //BA.debugLineNum = 38207490;BA.debugLine="SendHttpRequest(\"holeVereine\", \"GET\", url, \"\", \"\"";
__ref._sendhttprequest /*void*/ (null,"holeVereine","GET",_url,"","");
RDebugUtils.currentLine=38207491;
 //BA.debugLineNum = 38207491;BA.debugLine="End Sub";
return "";
}
public String  _initialize(b4a.example.b4xmainpage __ref,anywheresoftware.b4a.BA _ba) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "initialize", false))
	 {return ((String) Debug.delegate(ba, "initialize", new Object[] {_ba}));}
RDebugUtils.currentLine=37355520;
 //BA.debugLineNum = 37355520;BA.debugLine="Public Sub Initialize";
RDebugUtils.currentLine=37355521;
 //BA.debugLineNum = 37355521;BA.debugLine="VereineAndKeys.Initialize";
__ref._vereineandkeys /*anywheresoftware.b4a.objects.collections.List*/ .Initialize();
RDebugUtils.currentLine=37355522;
 //BA.debugLineNum = 37355522;BA.debugLine="Status.Initialize";
__ref._status /*anywheresoftware.b4a.objects.collections.Map*/ .Initialize();
RDebugUtils.currentLine=37355523;
 //BA.debugLineNum = 37355523;BA.debugLine="LoadTinyDB";
__ref._loadtinydb /*String*/ (null);
RDebugUtils.currentLine=37355524;
 //BA.debugLineNum = 37355524;BA.debugLine="Uhrzeit.Initialize(\"Uhrzeit\", 60000)";
__ref._uhrzeit /*anywheresoftware.b4a.objects.Timer*/ .Initialize(ba,"Uhrzeit",(long) (60000));
RDebugUtils.currentLine=37355525;
 //BA.debugLineNum = 37355525;BA.debugLine="End Sub";
return "";
}
public String  _loadtinydb(b4a.example.b4xmainpage __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "loadtinydb", false))
	 {return ((String) Debug.delegate(ba, "loadtinydb", null));}
RDebugUtils.currentLine=39124992;
 //BA.debugLineNum = 39124992;BA.debugLine="Private Sub LoadTinyDB";
RDebugUtils.currentLine=39124993;
 //BA.debugLineNum = 39124993;BA.debugLine="If File.Exists(File.DirInternal, DBFileName) Then";
if (__c.File.Exists(__c.File.getDirInternal(),__ref._dbfilename /*String*/ )) { 
RDebugUtils.currentLine=39124994;
 //BA.debugLineNum = 39124994;BA.debugLine="DBVerein = File.ReadMap(File.DirInternal, DBFile";
__ref._dbverein /*anywheresoftware.b4a.objects.collections.Map*/  = __c.File.ReadMap(__c.File.getDirInternal(),__ref._dbfilename /*String*/ );
 }else {
RDebugUtils.currentLine=39124996;
 //BA.debugLineNum = 39124996;BA.debugLine="DBVerein.Initialize";
__ref._dbverein /*anywheresoftware.b4a.objects.collections.Map*/ .Initialize();
 };
RDebugUtils.currentLine=39124998;
 //BA.debugLineNum = 39124998;BA.debugLine="End Sub";
return "";
}
public Object  _ion_event(b4a.example.b4xmainpage __ref,String _methodname,Object[] _args) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "ion_event", false))
	 {return ((Object) Debug.delegate(ba, "ion_event", new Object[] {_methodname,_args}));}
int _rescode = 0;
RDebugUtils.currentLine=39452672;
 //BA.debugLineNum = 39452672;BA.debugLine="Private Sub ion_Event (MethodName As String, Args(";
RDebugUtils.currentLine=39452673;
 //BA.debugLineNum = 39452673;BA.debugLine="Dim resCode As Int = Args(0)";
_rescode = (int)(BA.ObjectToNumber(_args[(int) (0)]));
RDebugUtils.currentLine=39452674;
 //BA.debugLineNum = 39452674;BA.debugLine="If resCode = -1 Then";
if (_rescode==-1) { 
RDebugUtils.currentLine=39452675;
 //BA.debugLineNum = 39452675;BA.debugLine="RefreshTokenProcedure";
__ref._refreshtokenprocedure /*String*/ (null);
 };
RDebugUtils.currentLine=39452677;
 //BA.debugLineNum = 39452677;BA.debugLine="Return Null";
if (true) return __c.Null;
RDebugUtils.currentLine=39452678;
 //BA.debugLineNum = 39452678;BA.debugLine="End Sub";
return null;
}
public String  _refreshtokenprocedure(b4a.example.b4xmainpage __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "refreshtokenprocedure", false))
	 {return ((String) Debug.delegate(ba, "refreshtokenprocedure", null));}
String _url = "";
String _body = "";
RDebugUtils.currentLine=38141952;
 //BA.debugLineNum = 38141952;BA.debugLine="Private Sub RefreshTokenProcedure";
RDebugUtils.currentLine=38141953;
 //BA.debugLineNum = 38141953;BA.debugLine="Dim url As String = \"https://securetoken.googleap";
_url = "https://securetoken.googleapis.com/v1/token?key="+__ref._apikey /*String*/ ;
RDebugUtils.currentLine=38141954;
 //BA.debugLineNum = 38141954;BA.debugLine="Dim body As String = \"grant_type=refresh_token&re";
_body = "grant_type=refresh_token&refresh_token="+BA.ObjectToString(__ref._status /*anywheresoftware.b4a.objects.collections.Map*/ .GetDefault((Object)("refreshToken"),(Object)("")));
RDebugUtils.currentLine=38141955;
 //BA.debugLineNum = 38141955;BA.debugLine="SendHttpRequest(\"refresh_token\", \"POST\", url, bod";
__ref._sendhttprequest /*void*/ (null,"refresh_token","POST",_url,_body,"application/x-www-form-urlencoded");
RDebugUtils.currentLine=38141956;
 //BA.debugLineNum = 38141956;BA.debugLine="End Sub";
return "";
}
public String  _lvwvereine_itemclick(b4a.example.b4xmainpage __ref,int _position,Object _value) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "lvwvereine_itemclick", false))
	 {return ((String) Debug.delegate(ba, "lvwvereine_itemclick", new Object[] {_position,_value}));}
RDebugUtils.currentLine=37945344;
 //BA.debugLineNum = 37945344;BA.debugLine="Private Sub lvwVereine_ItemClick (Position As Int,";
RDebugUtils.currentLine=37945345;
 //BA.debugLineNum = 37945345;BA.debugLine="selectedVereinIndex = Position";
__ref._selectedvereinindex /*int*/  = _position;
RDebugUtils.currentLine=37945346;
 //BA.debugLineNum = 37945346;BA.debugLine="btnVnOK.TextColor = colorgreen";
__ref._btnvnok /*anywheresoftware.b4a.objects.ButtonWrapper*/ .setTextColor(__ref._colorgreen /*int*/ );
RDebugUtils.currentLine=37945347;
 //BA.debugLineNum = 37945347;BA.debugLine="btnVnOK.Enabled = True";
__ref._btnvnok /*anywheresoftware.b4a.objects.ButtonWrapper*/ .setEnabled(__c.True);
RDebugUtils.currentLine=37945348;
 //BA.debugLineNum = 37945348;BA.debugLine="End Sub";
return "";
}
public String  _savewertungsliste(b4a.example.b4xmainpage __ref,anywheresoftware.b4a.objects.collections.List _webviewdata) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "savewertungsliste", false))
	 {return ((String) Debug.delegate(ba, "savewertungsliste", new Object[] {_webviewdata}));}
String _verdatum = "";
String[] _keyparts = null;
String _datekey = "";
String _vid = "";
String _url = "";
anywheresoftware.b4a.objects.collections.Map _body = null;
int _i = 0;
int _platzval = 0;
String _padded = "";
String _id = "";
anywheresoftware.b4a.objects.collections.Map _eintrag = null;
anywheresoftware.b4a.objects.collections.JSONParser.JSONGenerator _jg = null;
RDebugUtils.currentLine=38404096;
 //BA.debugLineNum = 38404096;BA.debugLine="Private Sub saveWertungsliste(webViewData As List)";
RDebugUtils.currentLine=38404097;
 //BA.debugLineNum = 38404097;BA.debugLine="Dim verDatum As String = DBGet(\"VeranstaltungDatu";
_verdatum = BA.ObjectToString(__ref._dbget /*Object*/ (null,"VeranstaltungDatum",(Object)(__ref._formatdatecustom /*String*/ (null,__c.DateTime.getNow(),"dd.MM.yyyy"))));
RDebugUtils.currentLine=38404098;
 //BA.debugLineNum = 38404098;BA.debugLine="Dim keyParts() As String = Regex.Split(\"\\.\", verD";
_keyparts = __c.Regex.Split("\\.",_verdatum);
RDebugUtils.currentLine=38404099;
 //BA.debugLineNum = 38404099;BA.debugLine="Dim dateKey As String = keyParts(2) & keyParts(1)";
_datekey = _keyparts[(int) (2)]+_keyparts[(int) (1)]+_keyparts[(int) (0)];
RDebugUtils.currentLine=38404101;
 //BA.debugLineNum = 38404101;BA.debugLine="Dim vID As String = DBGet(\"VereinsID\", \"[...]\")";
_vid = BA.ObjectToString(__ref._dbget /*Object*/ (null,"VereinsID",(Object)("[...]")));
RDebugUtils.currentLine=38404102;
 //BA.debugLineNum = 38404102;BA.debugLine="Dim url As String = URLErgebnisse.Replace(\"[...]\"";
_url = __ref._urlergebnisse /*String*/ .replace("[...]",_vid)+"e"+_datekey+".json?auth="+BA.ObjectToString(__ref._status /*anywheresoftware.b4a.objects.collections.Map*/ .GetDefault((Object)("idToken"),(Object)("")));
RDebugUtils.currentLine=38404104;
 //BA.debugLineNum = 38404104;BA.debugLine="Dim body As Map";
_body = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=38404105;
 //BA.debugLineNum = 38404105;BA.debugLine="body.Initialize";
_body.Initialize();
RDebugUtils.currentLine=38404106;
 //BA.debugLineNum = 38404106;BA.debugLine="body.Put(\"Datum\", verDatum)";
_body.Put((Object)("Datum"),(Object)(_verdatum));
RDebugUtils.currentLine=38404107;
 //BA.debugLineNum = 38404107;BA.debugLine="body.Put(\"Name\", DBGet(\"VeranstaltungName\", \"- ni";
_body.Put((Object)("Name"),__ref._dbget /*Object*/ (null,"VeranstaltungName",(Object)("- nicht gesetzt -")));
RDebugUtils.currentLine=38404108;
 //BA.debugLineNum = 38404108;BA.debugLine="body.Put(\"Status\", \"offen\")";
_body.Put((Object)("Status"),(Object)("offen"));
RDebugUtils.currentLine=38404110;
 //BA.debugLineNum = 38404110;BA.debugLine="For i = 4 To webViewData.Size - 1 Step 4";
{
final int step11 = 4;
final int limit11 = (int) (_webviewdata.getSize()-1);
_i = (int) (4) ;
for (;_i <= limit11 ;_i = _i + step11 ) {
RDebugUtils.currentLine=38404111;
 //BA.debugLineNum = 38404111;BA.debugLine="Dim platzVal As Int = webViewData.Get(i)";
_platzval = (int)(BA.ObjectToNumber(_webviewdata.Get(_i)));
RDebugUtils.currentLine=38404112;
 //BA.debugLineNum = 38404112;BA.debugLine="Dim padded As String = \"0000\" & platzVal";
_padded = "0000"+BA.NumberToString(_platzval);
RDebugUtils.currentLine=38404113;
 //BA.debugLineNum = 38404113;BA.debugLine="Dim id As String = \"p\" & padded.SubString(padded";
_id = "p"+_padded.substring((int) (_padded.length()-4));
RDebugUtils.currentLine=38404115;
 //BA.debugLineNum = 38404115;BA.debugLine="Dim eintrag As Map = CreateMap( _ 			\"Platz\": pl";
_eintrag = new anywheresoftware.b4a.objects.collections.Map();
_eintrag = __c.createMap(new Object[] {(Object)("Platz"),(Object)(_platzval),(Object)("Teilnehmer"),_webviewdata.Get((int) (_i+1)),(Object)("Gewicht"),_webviewdata.Get((int) (_i+2)),(Object)("Rang"),_webviewdata.Get((int) (_i+3))});
RDebugUtils.currentLine=38404120;
 //BA.debugLineNum = 38404120;BA.debugLine="body.Put(id, eintrag)";
_body.Put((Object)(_id),(Object)(_eintrag.getObject()));
 }
};
RDebugUtils.currentLine=38404123;
 //BA.debugLineNum = 38404123;BA.debugLine="Dim jg As JSONGenerator";
_jg = new anywheresoftware.b4a.objects.collections.JSONParser.JSONGenerator();
RDebugUtils.currentLine=38404124;
 //BA.debugLineNum = 38404124;BA.debugLine="jg.Initialize(body)";
_jg.Initialize(_body);
RDebugUtils.currentLine=38404125;
 //BA.debugLineNum = 38404125;BA.debugLine="SendHttpRequest(\"UpdateErgebnisse\", \"PUT\", url, j";
__ref._sendhttprequest /*void*/ (null,"UpdateErgebnisse","PUT",_url,_jg.ToString(),"application/json");
RDebugUtils.currentLine=38404126;
 //BA.debugLineNum = 38404126;BA.debugLine="End Sub";
return "";
}
public String  _startactivityforresult(b4a.example.b4xmainpage __ref,anywheresoftware.b4a.objects.IntentWrapper _i) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "startactivityforresult", false))
	 {return ((String) Debug.delegate(ba, "startactivityforresult", new Object[] {_i}));}
anywheresoftware.b4j.object.JavaObject _jo = null;
RDebugUtils.currentLine=39387136;
 //BA.debugLineNum = 39387136;BA.debugLine="Private Sub StartActivityForResult(i As Intent)";
RDebugUtils.currentLine=39387137;
 //BA.debugLineNum = 39387137;BA.debugLine="Dim jo As JavaObject = GetBA";
_jo = new anywheresoftware.b4j.object.JavaObject();
_jo = (anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(__ref._getba /*Object*/ (null)));
RDebugUtils.currentLine=39387138;
 //BA.debugLineNum = 39387138;BA.debugLine="ion = jo.CreateEvent(\"anywheresoftware.b4a.IOnAct";
__ref._ion /*Object*/  = _jo.CreateEvent(ba,"anywheresoftware.b4a.IOnActivityResult","ion",__c.Null);
RDebugUtils.currentLine=39387139;
 //BA.debugLineNum = 39387139;BA.debugLine="jo.RunMethod(\"startActivityForResult\", Array As O";
_jo.RunMethod("startActivityForResult",new Object[]{__ref._ion /*Object*/ ,(Object)(_i.getObject())});
RDebugUtils.currentLine=39387140;
 //BA.debugLineNum = 39387140;BA.debugLine="End Sub";
return "";
}
public String  _tbxemail_focuschanged(b4a.example.b4xmainpage __ref,boolean _hasfocus) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "tbxemail_focuschanged", false))
	 {return ((String) Debug.delegate(ba, "tbxemail_focuschanged", new Object[] {_hasfocus}));}
RDebugUtils.currentLine=37552128;
 //BA.debugLineNum = 37552128;BA.debugLine="Private Sub tbxEmail_FocusChanged (HasFocus As Boo";
RDebugUtils.currentLine=37552129;
 //BA.debugLineNum = 37552129;BA.debugLine="If HasFocus Then";
if (_hasfocus) { 
RDebugUtils.currentLine=37552130;
 //BA.debugLineNum = 37552130;BA.debugLine="tbxEmail.SelectionStart = tbxEmail.Text.Length";
__ref._tbxemail /*anywheresoftware.b4a.objects.EditTextWrapper*/ .setSelectionStart(__ref._tbxemail /*anywheresoftware.b4a.objects.EditTextWrapper*/ .getText().length());
 }else {
RDebugUtils.currentLine=37552132;
 //BA.debugLineNum = 37552132;BA.debugLine="HideKeyboard";
__ref._hidekeyboard /*String*/ (null);
 };
RDebugUtils.currentLine=37552134;
 //BA.debugLineNum = 37552134;BA.debugLine="End Sub";
return "";
}
public String  _tbxemail_textchanged(b4a.example.b4xmainpage __ref,String _old,String _new) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "tbxemail_textchanged", false))
	 {return ((String) Debug.delegate(ba, "tbxemail_textchanged", new Object[] {_old,_new}));}
RDebugUtils.currentLine=37683200;
 //BA.debugLineNum = 37683200;BA.debugLine="Private Sub tbxEmail_TextChanged (Old As String, N";
RDebugUtils.currentLine=37683201;
 //BA.debugLineNum = 37683201;BA.debugLine="If ignoreTextEvents Then Return";
if (__ref._ignoretextevents /*boolean*/ ) { 
if (true) return "";};
RDebugUtils.currentLine=37683202;
 //BA.debugLineNum = 37683202;BA.debugLine="CheckLoginButtonState";
__ref._checkloginbuttonstate /*String*/ (null);
RDebugUtils.currentLine=37683203;
 //BA.debugLineNum = 37683203;BA.debugLine="End Sub";
return "";
}
public String  _textboxpassword_focuschanged(b4a.example.b4xmainpage __ref,boolean _hasfocus) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "textboxpassword_focuschanged", false))
	 {return ((String) Debug.delegate(ba, "textboxpassword_focuschanged", new Object[] {_hasfocus}));}
RDebugUtils.currentLine=37617664;
 //BA.debugLineNum = 37617664;BA.debugLine="Private Sub TextBoxPassword_FocusChanged (HasFocus";
RDebugUtils.currentLine=37617665;
 //BA.debugLineNum = 37617665;BA.debugLine="If HasFocus Then";
if (_hasfocus) { 
RDebugUtils.currentLine=37617666;
 //BA.debugLineNum = 37617666;BA.debugLine="TextBoxPassword.SelectionStart = TextBoxPassword";
__ref._textboxpassword /*anywheresoftware.b4a.objects.EditTextWrapper*/ .setSelectionStart(__ref._textboxpassword /*anywheresoftware.b4a.objects.EditTextWrapper*/ .getText().length());
 }else {
RDebugUtils.currentLine=37617668;
 //BA.debugLineNum = 37617668;BA.debugLine="HideKeyboard";
__ref._hidekeyboard /*String*/ (null);
 };
RDebugUtils.currentLine=37617670;
 //BA.debugLineNum = 37617670;BA.debugLine="End Sub";
return "";
}
public String  _textboxpassword_textchanged(b4a.example.b4xmainpage __ref,String _old,String _new) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "textboxpassword_textchanged", false))
	 {return ((String) Debug.delegate(ba, "textboxpassword_textchanged", new Object[] {_old,_new}));}
RDebugUtils.currentLine=37748736;
 //BA.debugLineNum = 37748736;BA.debugLine="Private Sub TextBoxPassword_TextChanged (Old As St";
RDebugUtils.currentLine=37748737;
 //BA.debugLineNum = 37748737;BA.debugLine="If ignoreTextEvents Then Return";
if (__ref._ignoretextevents /*boolean*/ ) { 
if (true) return "";};
RDebugUtils.currentLine=37748738;
 //BA.debugLineNum = 37748738;BA.debugLine="CheckLoginButtonState";
__ref._checkloginbuttonstate /*String*/ (null);
RDebugUtils.currentLine=37748739;
 //BA.debugLineNum = 37748739;BA.debugLine="End Sub";
return "";
}
public String  _uhrzeit_tick(b4a.example.b4xmainpage __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "uhrzeit_tick", false))
	 {return ((String) Debug.delegate(ba, "uhrzeit_tick", null));}
RDebugUtils.currentLine=38862848;
 //BA.debugLineNum = 38862848;BA.debugLine="Private Sub Uhrzeit_Tick";
RDebugUtils.currentLine=38862849;
 //BA.debugLineNum = 38862849;BA.debugLine="Uhrzeit.Enabled = False";
__ref._uhrzeit /*anywheresoftware.b4a.objects.Timer*/ .setEnabled(__c.False);
RDebugUtils.currentLine=38862850;
 //BA.debugLineNum = 38862850;BA.debugLine="B4XPages.ShowPage(\"ScreenSaver\")";
_b4xpages._showpage /*String*/ (ba,"ScreenSaver");
RDebugUtils.currentLine=38862851;
 //BA.debugLineNum = 38862851;BA.debugLine="End Sub";
return "";
}
}