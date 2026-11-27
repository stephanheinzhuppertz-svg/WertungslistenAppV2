
package b4a.example;

import anywheresoftware.b4a.pc.PCBA;
import anywheresoftware.b4a.pc.RemoteObject;

public class settings {
    public static RemoteObject myClass;
	public settings() {
	}
    public static PCBA staticBA = new PCBA(null, settings.class);

public static RemoteObject __c = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common");
public static RemoteObject _root = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
public static RemoteObject _xui = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper.XUI");
public static RemoteObject _urlveranstaltungen = RemoteObject.createImmutable("");
public static RemoteObject _urlteilnehmer = RemoteObject.createImmutable("");
public static RemoteObject _urlergebnisse = RemoteObject.createImmutable("");
public static RemoteObject _dbdatentyp = RemoteObject.createImmutable("");
public static RemoteObject _dochange = RemoteObject.createImmutable(false);
public static RemoteObject _status = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
public static RemoteObject _veranstaltungen = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
public static RemoteObject _webviewvstgn = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
public static RemoteObject _veranstaltung_id = RemoteObject.createImmutable("");
public static RemoteObject _webviewvstgn_id = RemoteObject.createImmutable("");
public static RemoteObject _vstgnnewid = RemoteObject.createImmutable("");
public static RemoteObject _teilnehmer = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
public static RemoteObject _tlnid = RemoteObject.createImmutable("");
public static RemoteObject _tlnnewid = RemoteObject.createImmutable("");
public static RemoteObject _colorgreen = RemoteObject.createImmutable(0);
public static RemoteObject _colorblue = RemoteObject.createImmutable(0);
public static RemoteObject _lblverein = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _lblveranstaltung = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _lbldatum = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _btnback = RemoteObject.declareNull("anywheresoftware.b4a.objects.ButtonWrapper");
public static RemoteObject _svmain = RemoteObject.declareNull("anywheresoftware.b4a.objects.ScrollViewWrapper");
public static RemoteObject _lblclosed = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _dprdatum = RemoteObject.declareNull("anywheresoftware.b4a.objects.ButtonWrapper");
public static RemoteObject _btnauswahl = RemoteObject.declareNull("anywheresoftware.b4a.objects.ButtonWrapper");
public static RemoteObject _tbxveranstaltung = RemoteObject.declareNull("anywheresoftware.b4a.objects.EditTextWrapper");
public static RemoteObject _tbxanzahl = RemoteObject.declareNull("anywheresoftware.b4a.objects.EditTextWrapper");
public static RemoteObject _btnverstgdelete = RemoteObject.declareNull("anywheresoftware.b4a.objects.ButtonWrapper");
public static RemoteObject _btnverstgspeichern = RemoteObject.declareNull("anywheresoftware.b4a.objects.ButtonWrapper");
public static RemoteObject _lstveranstaltungen = RemoteObject.declareNull("b4a.example3.customlistview");
public static RemoteObject _lstteilnehmer = RemoteObject.declareNull("b4a.example3.customlistview");
public static RemoteObject _tbxteilnehmer = RemoteObject.declareNull("anywheresoftware.b4a.objects.EditTextWrapper");
public static RemoteObject _btntlndelete = RemoteObject.declareNull("anywheresoftware.b4a.objects.ButtonWrapper");
public static RemoteObject _btntlnspeichern = RemoteObject.declareNull("anywheresoftware.b4a.objects.ButtonWrapper");
public static RemoteObject _pnlvstng = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
public static RemoteObject _pnlteilnehmer = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
public static RemoteObject _uhrzeit = RemoteObject.declareNull("anywheresoftware.b4a.objects.Timer");
public static RemoteObject _dbverein = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
public static RemoteObject _dbfilename = RemoteObject.createImmutable("");
public static RemoteObject _currentweburl = RemoteObject.createImmutable("");
public static RemoteObject _dpryear = RemoteObject.createImmutable(0);
public static RemoteObject _dprmonth = RemoteObject.createImmutable(0);
public static RemoteObject _dprday = RemoteObject.createImmutable(0);
public static RemoteObject _mdefaultlstveranstaltungenheight = RemoteObject.createImmutable(0);
public static RemoteObject _mdefaultlstteilnehmerheight = RemoteObject.createImmutable(0);
public static RemoteObject _dateutils = RemoteObject.declareNull("b4a.example.dateutils");
public static b4a.example.main _main = null;
public static b4a.example.b4xpages _b4xpages = null;
public static b4a.example.b4xcollections _b4xcollections = null;
public static b4a.example.httputils2service _httputils2service = null;
public static b4a.example.xuiviewsutils _xuiviewsutils = null;
public static Object[] GetGlobals(RemoteObject _ref) throws Exception {
		return new Object[] {"btnAuswahl",_ref.getField(false, "_btnauswahl"),"btnBack",_ref.getField(false, "_btnback"),"btnTLNDelete",_ref.getField(false, "_btntlndelete"),"btnTLNSpeichern",_ref.getField(false, "_btntlnspeichern"),"btnVerstgDelete",_ref.getField(false, "_btnverstgdelete"),"btnVerstgSpeichern",_ref.getField(false, "_btnverstgspeichern"),"colorblue",_ref.getField(false, "_colorblue"),"colorgreen",_ref.getField(false, "_colorgreen"),"CurrentWebUrl",_ref.getField(false, "_currentweburl"),"DateUtils",_ref.getField(false, "_dateutils"),"DBdatenTyp",_ref.getField(false, "_dbdatentyp"),"DBFileName",_ref.getField(false, "_dbfilename"),"DBVerein",_ref.getField(false, "_dbverein"),"dochange",_ref.getField(false, "_dochange"),"dprDatum",_ref.getField(false, "_dprdatum"),"dprDay",_ref.getField(false, "_dprday"),"dprMonth",_ref.getField(false, "_dprmonth"),"dprYear",_ref.getField(false, "_dpryear"),"lblClosed",_ref.getField(false, "_lblclosed"),"lblDatum",_ref.getField(false, "_lbldatum"),"lblVeranstaltung",_ref.getField(false, "_lblveranstaltung"),"lblVerein",_ref.getField(false, "_lblverein"),"lstTeilnehmer",_ref.getField(false, "_lstteilnehmer"),"lstVeranstaltungen",_ref.getField(false, "_lstveranstaltungen"),"mDefaultLstTeilnehmerHeight",_ref.getField(false, "_mdefaultlstteilnehmerheight"),"mDefaultLstVeranstaltungenHeight",_ref.getField(false, "_mdefaultlstveranstaltungenheight"),"pnlTeilnehmer",_ref.getField(false, "_pnlteilnehmer"),"pnlVstng",_ref.getField(false, "_pnlvstng"),"Root",_ref.getField(false, "_root"),"Status",_ref.getField(false, "_status"),"svMain",_ref.getField(false, "_svmain"),"tbxAnzahl",_ref.getField(false, "_tbxanzahl"),"tbxTeilnehmer",_ref.getField(false, "_tbxteilnehmer"),"tbxVeranstaltung",_ref.getField(false, "_tbxveranstaltung"),"Teilnehmer",_ref.getField(false, "_teilnehmer"),"TLNid",_ref.getField(false, "_tlnid"),"TLNnewID",_ref.getField(false, "_tlnnewid"),"Uhrzeit",_ref.getField(false, "_uhrzeit"),"URLergebnisse",_ref.getField(false, "_urlergebnisse"),"URLteilnehmer",_ref.getField(false, "_urlteilnehmer"),"URLveranstaltungen",_ref.getField(false, "_urlveranstaltungen"),"Veranstaltung_ID",_ref.getField(false, "_veranstaltung_id"),"Veranstaltungen",_ref.getField(false, "_veranstaltungen"),"VSTGNnewID",_ref.getField(false, "_vstgnnewid"),"webviewVSTGN",_ref.getField(false, "_webviewvstgn"),"webviewVSTGN_ID",_ref.getField(false, "_webviewvstgn_id"),"xui",_ref.getField(false, "_xui")};
}
}