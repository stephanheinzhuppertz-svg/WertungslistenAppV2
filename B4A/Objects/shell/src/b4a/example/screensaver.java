
package b4a.example;

import anywheresoftware.b4a.pc.PCBA;
import anywheresoftware.b4a.pc.RemoteObject;

public class screensaver {
    public static RemoteObject myClass;
	public screensaver() {
	}
    public static PCBA staticBA = new PCBA(null, screensaver.class);

public static RemoteObject __c = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common");
public static RemoteObject _root = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
public static RemoteObject _xui = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper.XUI");
public static RemoteObject _status = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
public static RemoteObject _label1 = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _btnlogin = RemoteObject.declareNull("anywheresoftware.b4a.objects.ButtonWrapper");
public static RemoteObject _ion = RemoteObject.declareNull("Object");
public static RemoteObject _dateutils = RemoteObject.declareNull("b4a.example.dateutils");
public static b4a.example.main _main = null;
public static b4a.example.b4xpages _b4xpages = null;
public static b4a.example.b4xcollections _b4xcollections = null;
public static b4a.example.httputils2service _httputils2service = null;
public static b4a.example.xuiviewsutils _xuiviewsutils = null;
public static Object[] GetGlobals(RemoteObject _ref) throws Exception {
		return new Object[] {"btnLogin",_ref.getField(false, "_btnlogin"),"DateUtils",_ref.getField(false, "_dateutils"),"ion",_ref.getField(false, "_ion"),"Label1",_ref.getField(false, "_label1"),"Root",_ref.getField(false, "_root"),"Status",_ref.getField(false, "_status"),"xui",_ref.getField(false, "_xui")};
}
}