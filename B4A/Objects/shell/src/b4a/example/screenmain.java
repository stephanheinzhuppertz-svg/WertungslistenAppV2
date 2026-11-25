
package b4a.example;

import anywheresoftware.b4a.pc.PCBA;
import anywheresoftware.b4a.pc.RemoteObject;

public class screenmain {
    public static RemoteObject myClass;
	public screenmain() {
	}
    public static PCBA staticBA = new PCBA(null, screenmain.class);

public static RemoteObject __c = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common");
public static RemoteObject _root = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
public static RemoteObject _xui = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper.XUI");
public static RemoteObject _dbdatentyp = RemoteObject.createImmutable("");
public static RemoteObject _urltest = RemoteObject.createImmutable("");
public static RemoteObject _teilnehmer = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
public static RemoteObject _urlveranstaltungen = RemoteObject.createImmutable("");
public static RemoteObject _tlnlastid = RemoteObject.createImmutable("");
public static RemoteObject _urlteilnehmer = RemoteObject.createImmutable("");
public static RemoteObject _webviewdata = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
public static RemoteObject _urlergebnisse = RemoteObject.createImmutable("");
public static RemoteObject _platzselected = RemoteObject.createImmutable(0);
public static RemoteObject _urlfdj = RemoteObject.createImmutable("");
public static RemoteObject _selectnewrow = RemoteObject.createImmutable(0);
public static RemoteObject _urllastchange = RemoteObject.createImmutable("");
public static RemoteObject _dochange = RemoteObject.createImmutable(false);
public static RemoteObject _addtln = RemoteObject.createImmutable(false);
public static RemoteObject _vstnggeschlossen = RemoteObject.createImmutable(false);
public static RemoteObject _status = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
public static RemoteObject _colorgreen = RemoteObject.createImmutable(0);
public static RemoteObject _lblverein = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _lblveranstaltung = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _lbldatum = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _btnsettings = RemoteObject.declareNull("anywheresoftware.b4a.objects.ButtonWrapper");
public static RemoteObject _vaeingabe = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
public static RemoteObject _btnclosevstng = RemoteObject.declareNull("anywheresoftware.b4a.objects.ButtonWrapper");
public static RemoteObject _btnup = RemoteObject.declareNull("anywheresoftware.b4a.objects.ButtonWrapper");
public static RemoteObject _btnminus = RemoteObject.declareNull("anywheresoftware.b4a.objects.ButtonWrapper");
public static RemoteObject _spnplatz = RemoteObject.declareNull("anywheresoftware.b4a.objects.SpinnerWrapper");
public static RemoteObject _btnplus = RemoteObject.declareNull("anywheresoftware.b4a.objects.ButtonWrapper");
public static RemoteObject _tbxteilnehmer = RemoteObject.declareNull("anywheresoftware.b4a.objects.EditTextWrapper");
public static RemoteObject _lsvname = RemoteObject.declareNull("anywheresoftware.b4a.objects.ListViewWrapper");
public static RemoteObject _vaergeingabe = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
public static RemoteObject _btnfdjeingabe = RemoteObject.declareNull("anywheresoftware.b4a.objects.ButtonWrapper");
public static RemoteObject _tbxgramm = RemoteObject.declareNull("anywheresoftware.b4a.objects.EditTextWrapper");
public static RemoteObject _btnspeichern = RemoteObject.declareNull("anywheresoftware.b4a.objects.ButtonWrapper");
public static RemoteObject _vafdj = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
public static RemoteObject _btnfdjback = RemoteObject.declareNull("anywheresoftware.b4a.objects.ButtonWrapper");
public static RemoteObject _tbxfdjgewicht = RemoteObject.declareNull("anywheresoftware.b4a.objects.EditTextWrapper");
public static RemoteObject _btnfdjsave = RemoteObject.declareNull("anywheresoftware.b4a.objects.ButtonWrapper");
public static RemoteObject _hadown = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
public static RemoteObject _btnshare = RemoteObject.declareNull("anywheresoftware.b4a.objects.ButtonWrapper");
public static RemoteObject _btndown = RemoteObject.declareNull("anywheresoftware.b4a.objects.ButtonWrapper");
public static RemoteObject _webergebnis = RemoteObject.declareNull("anywheresoftware.b4a.objects.WebViewWrapper");
public static RemoteObject _uhrzeit = RemoteObject.declareNull("anywheresoftware.b4a.objects.Timer");
public static RemoteObject _dbverein = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
public static RemoteObject _dbfilename = RemoteObject.createImmutable("");
public static RemoteObject _currentweburl = RemoteObject.createImmutable("");
public static RemoteObject _currentwebviewstring = RemoteObject.createImmutable("");
public static RemoteObject _spnitems = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
public static RemoteObject _dateutils = RemoteObject.declareNull("b4a.example.dateutils");
public static b4a.example.main _main = null;
public static b4a.example.b4xpages _b4xpages = null;
public static b4a.example.b4xcollections _b4xcollections = null;
public static b4a.example.httputils2service _httputils2service = null;
public static b4a.example.xuiviewsutils _xuiviewsutils = null;
public static Object[] GetGlobals(RemoteObject _ref) throws Exception {
		return new Object[] {"addTLN",_ref.getField(false, "_addtln"),"btnCloseVstng",_ref.getField(false, "_btnclosevstng"),"btnDown",_ref.getField(false, "_btndown"),"btnFDJback",_ref.getField(false, "_btnfdjback"),"btnFDJeingabe",_ref.getField(false, "_btnfdjeingabe"),"btnFDJsave",_ref.getField(false, "_btnfdjsave"),"btnMinus",_ref.getField(false, "_btnminus"),"btnPlus",_ref.getField(false, "_btnplus"),"btnSettings",_ref.getField(false, "_btnsettings"),"btnShare",_ref.getField(false, "_btnshare"),"btnSpeichern",_ref.getField(false, "_btnspeichern"),"btnUp",_ref.getField(false, "_btnup"),"colorgreen",_ref.getField(false, "_colorgreen"),"CurrentWebUrl",_ref.getField(false, "_currentweburl"),"CurrentWebViewString",_ref.getField(false, "_currentwebviewstring"),"DateUtils",_ref.getField(false, "_dateutils"),"DBdatenTyp",_ref.getField(false, "_dbdatentyp"),"DBFileName",_ref.getField(false, "_dbfilename"),"DBVerein",_ref.getField(false, "_dbverein"),"dochange",_ref.getField(false, "_dochange"),"haDown",_ref.getField(false, "_hadown"),"lblDatum",_ref.getField(false, "_lbldatum"),"lblVeranstaltung",_ref.getField(false, "_lblveranstaltung"),"lblVerein",_ref.getField(false, "_lblverein"),"lsvName",_ref.getField(false, "_lsvname"),"PlatzSelected",_ref.getField(false, "_platzselected"),"Root",_ref.getField(false, "_root"),"SelectNewRow",_ref.getField(false, "_selectnewrow"),"spnItems",_ref.getField(false, "_spnitems"),"spnPlatz",_ref.getField(false, "_spnplatz"),"Status",_ref.getField(false, "_status"),"tbxFDJgewicht",_ref.getField(false, "_tbxfdjgewicht"),"tbxGramm",_ref.getField(false, "_tbxgramm"),"tbxTeilnehmer",_ref.getField(false, "_tbxteilnehmer"),"Teilnehmer",_ref.getField(false, "_teilnehmer"),"TLNlastID",_ref.getField(false, "_tlnlastid"),"Uhrzeit",_ref.getField(false, "_uhrzeit"),"URLErgebnisse",_ref.getField(false, "_urlergebnisse"),"URLfdj",_ref.getField(false, "_urlfdj"),"URLlastChange",_ref.getField(false, "_urllastchange"),"URLteilnehmer",_ref.getField(false, "_urlteilnehmer"),"URLtest",_ref.getField(false, "_urltest"),"URLveranstaltungen",_ref.getField(false, "_urlveranstaltungen"),"vaEingabe",_ref.getField(false, "_vaeingabe"),"vaErgEingabe",_ref.getField(false, "_vaergeingabe"),"vaFDJ",_ref.getField(false, "_vafdj"),"VSTNGgeschlossen",_ref.getField(false, "_vstnggeschlossen"),"webErgebnis",_ref.getField(false, "_webergebnis"),"webviewData",_ref.getField(false, "_webviewdata"),"xui",_ref.getField(false, "_xui")};
}
}