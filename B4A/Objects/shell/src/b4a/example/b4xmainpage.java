
package b4a.example;

import anywheresoftware.b4a.pc.PCBA;
import anywheresoftware.b4a.pc.RemoteObject;

public class b4xmainpage {
    public static RemoteObject myClass;
	public b4xmainpage() {
	}
    public static PCBA staticBA = new PCBA(null, b4xmainpage.class);

public static RemoteObject __c = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common");
public static RemoteObject _root = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
public static RemoteObject _xui = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper.XUI");
public static RemoteObject _pagemain = RemoteObject.declareNull("b4a.example.screenmain");
public static RemoteObject _pagesettings = RemoteObject.declareNull("b4a.example.settings");
public static RemoteObject _pagesaver = RemoteObject.declareNull("b4a.example.screensaver");
public static RemoteObject _apikey = RemoteObject.createImmutable("");
public static RemoteObject _tlnlastid = RemoteObject.createImmutable("");
public static RemoteObject _urlteilnehmer = RemoteObject.createImmutable("");
public static RemoteObject _urlergebnisse = RemoteObject.createImmutable("");
public static RemoteObject _vereineandkeys = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
public static RemoteObject _dbdatentyp = RemoteObject.createImmutable("");
public static RemoteObject _idtoken = RemoteObject.createImmutable("");
public static RemoteObject _refreshtoken = RemoteObject.createImmutable("");
public static RemoteObject _debug = RemoteObject.createImmutable(false);
public static RemoteObject _status = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
public static RemoteObject _colorgreen = RemoteObject.createImmutable(0);
public static RemoteObject _passwordvisible = RemoteObject.createImmutable(false);
public static RemoteObject _selectedvereinindex = RemoteObject.createImmutable(0);
public static RemoteObject _ignoretextevents = RemoteObject.createImmutable(false);
public static RemoteObject _verticalarrangementheader = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
public static RemoteObject _lbllogin = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _lblkeineverbindung = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _verticalarrangementlogin = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
public static RemoteObject _tbxemail = RemoteObject.declareNull("anywheresoftware.b4a.objects.EditTextWrapper");
public static RemoteObject _textboxpassword = RemoteObject.declareNull("anywheresoftware.b4a.objects.EditTextWrapper");
public static RemoteObject _btnfyeo = RemoteObject.declareNull("anywheresoftware.b4a.objects.ButtonWrapper");
public static RemoteObject _btnlogin = RemoteObject.declareNull("anywheresoftware.b4a.objects.ButtonWrapper");
public static RemoteObject _verticalarrangementloading = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
public static RemoteObject _labelloading = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _verticalarrangementvereine = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
public static RemoteObject _btnvnok = RemoteObject.declareNull("anywheresoftware.b4a.objects.ButtonWrapper");
public static RemoteObject _lvwvereine = RemoteObject.declareNull("anywheresoftware.b4a.objects.ListViewWrapper");
public static RemoteObject _uhrzeit = RemoteObject.declareNull("anywheresoftware.b4a.objects.Timer");
public static RemoteObject _dbverein = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
public static RemoteObject _dbfilename = RemoteObject.createImmutable("");
public static RemoteObject _ion = RemoteObject.declareNull("Object");
public static RemoteObject _dateutils = RemoteObject.declareNull("b4a.example.dateutils");
public static b4a.example.main _main = null;
public static b4a.example.b4xpages _b4xpages = null;
public static b4a.example.b4xcollections _b4xcollections = null;
public static b4a.example.httputils2service _httputils2service = null;
public static b4a.example.xuiviewsutils _xuiviewsutils = null;
public static Object[] GetGlobals(RemoteObject _ref) throws Exception {
		return new Object[] {"apiKey",_ref.getField(false, "_apikey"),"btnFyeo",_ref.getField(false, "_btnfyeo"),"btnLogin",_ref.getField(false, "_btnlogin"),"btnVnOK",_ref.getField(false, "_btnvnok"),"colorgreen",_ref.getField(false, "_colorgreen"),"DateUtils",_ref.getField(false, "_dateutils"),"DBdatenTyp",_ref.getField(false, "_dbdatentyp"),"DBFileName",_ref.getField(false, "_dbfilename"),"DBVerein",_ref.getField(false, "_dbverein"),"debug",_ref.getField(false, "_debug"),"idToken",_ref.getField(false, "_idtoken"),"ignoreTextEvents",_ref.getField(false, "_ignoretextevents"),"ion",_ref.getField(false, "_ion"),"LabelLoading",_ref.getField(false, "_labelloading"),"lblKeineVerbindung",_ref.getField(false, "_lblkeineverbindung"),"lblLogin",_ref.getField(false, "_lbllogin"),"lvwVereine",_ref.getField(false, "_lvwvereine"),"PageMain",_ref.getField(false, "_pagemain"),"PageSaver",_ref.getField(false, "_pagesaver"),"PageSettings",_ref.getField(false, "_pagesettings"),"passwordVisible",_ref.getField(false, "_passwordvisible"),"refreshToken",_ref.getField(false, "_refreshtoken"),"Root",_ref.getField(false, "_root"),"selectedVereinIndex",_ref.getField(false, "_selectedvereinindex"),"Status",_ref.getField(false, "_status"),"tbxEmail",_ref.getField(false, "_tbxemail"),"TextBoxPassword",_ref.getField(false, "_textboxpassword"),"TLNlastID",_ref.getField(false, "_tlnlastid"),"Uhrzeit",_ref.getField(false, "_uhrzeit"),"URLErgebnisse",_ref.getField(false, "_urlergebnisse"),"URLteilnehmer",_ref.getField(false, "_urlteilnehmer"),"VereineAndKeys",_ref.getField(false, "_vereineandkeys"),"VerticalArrangementHeader",_ref.getField(false, "_verticalarrangementheader"),"VerticalArrangementLoading",_ref.getField(false, "_verticalarrangementloading"),"VerticalArrangementLogin",_ref.getField(false, "_verticalarrangementlogin"),"VerticalArrangementVereine",_ref.getField(false, "_verticalarrangementvereine"),"xui",_ref.getField(false, "_xui")};
}
}