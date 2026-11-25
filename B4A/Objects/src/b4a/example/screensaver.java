package b4a.example;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.debug.*;

public class screensaver extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    private static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new anywheresoftware.b4a.ShellBA(_ba, this, htSubs, "b4a.example.screensaver");
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            
        }
        if (BA.isShellModeRuntimeCheck(ba)) 
			   this.getClass().getMethod("_class_globals", b4a.example.screensaver.class).invoke(this, new Object[] {null});
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
public anywheresoftware.b4a.objects.collections.Map _status = null;
public anywheresoftware.b4a.objects.LabelWrapper _label1 = null;
public anywheresoftware.b4a.objects.ButtonWrapper _btnlogin = null;
public Object _ion = null;
public b4a.example.dateutils _dateutils = null;
public b4a.example.main _main = null;
public b4a.example.b4xpages _b4xpages = null;
public b4a.example.b4xcollections _b4xcollections = null;
public b4a.example.httputils2service _httputils2service = null;
public b4a.example.xuiviewsutils _xuiviewsutils = null;
public String  _initialize(b4a.example.screensaver __ref,anywheresoftware.b4a.BA _ba) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="screensaver";
if (Debug.shouldDelegate(ba, "initialize", false))
	 {return ((String) Debug.delegate(ba, "initialize", new Object[] {_ba}));}
RDebugUtils.currentLine=47775744;
 //BA.debugLineNum = 47775744;BA.debugLine="Public Sub Initialize";
RDebugUtils.currentLine=47775745;
 //BA.debugLineNum = 47775745;BA.debugLine="Status.Initialize";
__ref._status /*anywheresoftware.b4a.objects.collections.Map*/ .Initialize();
RDebugUtils.currentLine=47775746;
 //BA.debugLineNum = 47775746;BA.debugLine="End Sub";
return "";
}
public String  _b4xpage_appear(b4a.example.screensaver __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="screensaver";
if (Debug.shouldDelegate(ba, "b4xpage_appear", false))
	 {return ((String) Debug.delegate(ba, "b4xpage_appear", null));}
RDebugUtils.currentLine=47906816;
 //BA.debugLineNum = 47906816;BA.debugLine="Public Sub B4XPage_Appear";
RDebugUtils.currentLine=47906817;
 //BA.debugLineNum = 47906817;BA.debugLine="If B4XPages.MainPage.Status.IsInitialized And B4X";
if (_b4xpages._mainpage /*b4a.example.b4xmainpage*/ (ba)._status /*anywheresoftware.b4a.objects.collections.Map*/ .IsInitialized() && _b4xpages._mainpage /*b4a.example.b4xmainpage*/ (ba)._status /*anywheresoftware.b4a.objects.collections.Map*/ .getSize()>0) { 
RDebugUtils.currentLine=47906818;
 //BA.debugLineNum = 47906818;BA.debugLine="Status = B4XPages.MainPage.Status";
__ref._status /*anywheresoftware.b4a.objects.collections.Map*/  = _b4xpages._mainpage /*b4a.example.b4xmainpage*/ (ba)._status /*anywheresoftware.b4a.objects.collections.Map*/ ;
 };
RDebugUtils.currentLine=47906820;
 //BA.debugLineNum = 47906820;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _b4xpage_closerequest(b4a.example.screensaver __ref) throws Exception{
RDebugUtils.currentModule="screensaver";
if (Debug.shouldDelegate(ba, "b4xpage_closerequest", false))
	 {return ((anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) Debug.delegate(ba, "b4xpage_closerequest", null));}
ResumableSub_B4XPage_CloseRequest rsub = new ResumableSub_B4XPage_CloseRequest(this,__ref);
rsub.resume(ba, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_B4XPage_CloseRequest extends BA.ResumableSub {
public ResumableSub_B4XPage_CloseRequest(b4a.example.screensaver parent,b4a.example.screensaver __ref) {
this.parent = parent;
this.__ref = __ref;
this.__ref = parent;
}
b4a.example.screensaver __ref;
b4a.example.screensaver parent;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="screensaver";

    while (true) {
        switch (state) {
            case -1:
{
parent.__c.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = -1;
RDebugUtils.currentLine=47972353;
 //BA.debugLineNum = 47972353;BA.debugLine="Return False";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.False));return;};
RDebugUtils.currentLine=47972354;
 //BA.debugLineNum = 47972354;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public String  _b4xpage_created(b4a.example.screensaver __ref,anywheresoftware.b4a.objects.B4XViewWrapper _root1) throws Exception{
__ref = this;
RDebugUtils.currentModule="screensaver";
if (Debug.shouldDelegate(ba, "b4xpage_created", false))
	 {return ((String) Debug.delegate(ba, "b4xpage_created", new Object[] {_root1}));}
RDebugUtils.currentLine=47841280;
 //BA.debugLineNum = 47841280;BA.debugLine="Private Sub B4XPage_Created (Root1 As B4XView)";
RDebugUtils.currentLine=47841281;
 //BA.debugLineNum = 47841281;BA.debugLine="Root = Root1";
__ref._root /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = _root1;
RDebugUtils.currentLine=47841282;
 //BA.debugLineNum = 47841282;BA.debugLine="B4XPages.SetTitle(Me, \"Wertungslisten-App by sthn";
_b4xpages._settitle /*String*/ (ba,this,(Object)("Wertungslisten-App by sthnet.de"));
RDebugUtils.currentLine=47841283;
 //BA.debugLineNum = 47841283;BA.debugLine="BuildUI";
__ref._buildui /*String*/ (null);
RDebugUtils.currentLine=47841284;
 //BA.debugLineNum = 47841284;BA.debugLine="End Sub";
return "";
}
public String  _buildui(b4a.example.screensaver __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="screensaver";
if (Debug.shouldDelegate(ba, "buildui", false))
	 {return ((String) Debug.delegate(ba, "buildui", null));}
anywheresoftware.b4a.objects.B4XViewWrapper _xv = null;
RDebugUtils.currentLine=48037888;
 //BA.debugLineNum = 48037888;BA.debugLine="Private Sub BuildUI";
RDebugUtils.currentLine=48037889;
 //BA.debugLineNum = 48037889;BA.debugLine="Root.Color = 0xFF222222";
__ref._root /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setColor(((int)0xff222222));
RDebugUtils.currentLine=48037891;
 //BA.debugLineNum = 48037891;BA.debugLine="Label1.Initialize(\"\")";
__ref._label1 /*anywheresoftware.b4a.objects.LabelWrapper*/ .Initialize(ba,"");
RDebugUtils.currentLine=48037892;
 //BA.debugLineNum = 48037892;BA.debugLine="Label1.Text = \"Erneute Anmeldung erforderlich ...";
__ref._label1 /*anywheresoftware.b4a.objects.LabelWrapper*/ .setText(BA.ObjectToCharSequence("Erneute Anmeldung erforderlich ..."));
RDebugUtils.currentLine=48037893;
 //BA.debugLineNum = 48037893;BA.debugLine="Label1.TextSize = 16";
__ref._label1 /*anywheresoftware.b4a.objects.LabelWrapper*/ .setTextSize((float) (16));
RDebugUtils.currentLine=48037894;
 //BA.debugLineNum = 48037894;BA.debugLine="Label1.Typeface = Typeface.DEFAULT_BOLD";
__ref._label1 /*anywheresoftware.b4a.objects.LabelWrapper*/ .setTypeface(__c.Typeface.DEFAULT_BOLD);
RDebugUtils.currentLine=48037895;
 //BA.debugLineNum = 48037895;BA.debugLine="Label1.TextColor = Colors.White";
__ref._label1 /*anywheresoftware.b4a.objects.LabelWrapper*/ .setTextColor(__c.Colors.White);
RDebugUtils.currentLine=48037896;
 //BA.debugLineNum = 48037896;BA.debugLine="Label1.Gravity = Gravity.CENTER";
__ref._label1 /*anywheresoftware.b4a.objects.LabelWrapper*/ .setGravity(__c.Gravity.CENTER);
RDebugUtils.currentLine=48037897;
 //BA.debugLineNum = 48037897;BA.debugLine="Root.AddView(Label1, 0, 25dip, 100%x, 40dip)";
__ref._root /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .AddView((android.view.View)(__ref._label1 /*anywheresoftware.b4a.objects.LabelWrapper*/ .getObject()),(int) (0),__c.DipToCurrent((int) (25)),__c.PerXToCurrent((float) (100),ba),__c.DipToCurrent((int) (40)));
RDebugUtils.currentLine=48037899;
 //BA.debugLineNum = 48037899;BA.debugLine="btnLogin.Initialize(\"btnLogin\")";
__ref._btnlogin /*anywheresoftware.b4a.objects.ButtonWrapper*/ .Initialize(ba,"btnLogin");
RDebugUtils.currentLine=48037900;
 //BA.debugLineNum = 48037900;BA.debugLine="If File.Exists(File.DirAssets, \"Fingerprint.png\")";
if (__c.File.Exists(__c.File.getDirAssets(),"Fingerprint.png")) { 
RDebugUtils.currentLine=48037901;
 //BA.debugLineNum = 48037901;BA.debugLine="btnLogin.SetBackgroundImage(LoadBitmap(File.DirA";
__ref._btnlogin /*anywheresoftware.b4a.objects.ButtonWrapper*/ .SetBackgroundImageNew((android.graphics.Bitmap)(__c.LoadBitmap(__c.File.getDirAssets(),"Fingerprint.png").getObject()));
 }else {
RDebugUtils.currentLine=48037903;
 //BA.debugLineNum = 48037903;BA.debugLine="btnLogin.Text = \"🔒\"";
__ref._btnlogin /*anywheresoftware.b4a.objects.ButtonWrapper*/ .setText(BA.ObjectToCharSequence("🔒"));
RDebugUtils.currentLine=48037904;
 //BA.debugLineNum = 48037904;BA.debugLine="btnLogin.TextSize = 24";
__ref._btnlogin /*anywheresoftware.b4a.objects.ButtonWrapper*/ .setTextSize((float) (24));
RDebugUtils.currentLine=48037905;
 //BA.debugLineNum = 48037905;BA.debugLine="btnLogin.TextColor = Colors.White";
__ref._btnlogin /*anywheresoftware.b4a.objects.ButtonWrapper*/ .setTextColor(__c.Colors.White);
RDebugUtils.currentLine=48037906;
 //BA.debugLineNum = 48037906;BA.debugLine="btnLogin.Color = 0xFF444444";
__ref._btnlogin /*anywheresoftware.b4a.objects.ButtonWrapper*/ .setColor(((int)0xff444444));
 };
RDebugUtils.currentLine=48037908;
 //BA.debugLineNum = 48037908;BA.debugLine="Root.AddView(btnLogin, (100%x - 64dip) / 2, 100%y";
__ref._root /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .AddView((android.view.View)(__ref._btnlogin /*anywheresoftware.b4a.objects.ButtonWrapper*/ .getObject()),(int) ((__c.PerXToCurrent((float) (100),ba)-__c.DipToCurrent((int) (64)))/(double)2),(int) (__c.PerYToCurrent((float) (100),ba)-__c.DipToCurrent((int) (89))),__c.DipToCurrent((int) (64)),__c.DipToCurrent((int) (64)));
RDebugUtils.currentLine=48037910;
 //BA.debugLineNum = 48037910;BA.debugLine="Dim xv As B4XView = btnLogin";
_xv = new anywheresoftware.b4a.objects.B4XViewWrapper();
_xv = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(__ref._btnlogin /*anywheresoftware.b4a.objects.ButtonWrapper*/ .getObject()));
RDebugUtils.currentLine=48037911;
 //BA.debugLineNum = 48037911;BA.debugLine="xv.SetColorAndBorder(xv.Color, 0, 0, 32dip)";
_xv.SetColorAndBorder(_xv.getColor(),(int) (0),(int) (0),__c.DipToCurrent((int) (32)));
RDebugUtils.currentLine=48037912;
 //BA.debugLineNum = 48037912;BA.debugLine="End Sub";
return "";
}
public String  _btnlogin_down(b4a.example.screensaver __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="screensaver";
if (Debug.shouldDelegate(ba, "btnlogin_down", false))
	 {return ((String) Debug.delegate(ba, "btnlogin_down", null));}
RDebugUtils.currentLine=48103424;
 //BA.debugLineNum = 48103424;BA.debugLine="Private Sub btnLogin_Down";
RDebugUtils.currentLine=48103425;
 //BA.debugLineNum = 48103425;BA.debugLine="StartConfirmDeviceCredential";
__ref._startconfirmdevicecredential /*String*/ (null);
RDebugUtils.currentLine=48103426;
 //BA.debugLineNum = 48103426;BA.debugLine="End Sub";
return "";
}
public String  _startconfirmdevicecredential(b4a.example.screensaver __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="screensaver";
if (Debug.shouldDelegate(ba, "startconfirmdevicecredential", false))
	 {return ((String) Debug.delegate(ba, "startconfirmdevicecredential", null));}
anywheresoftware.b4a.objects.IntentWrapper _i = null;
RDebugUtils.currentLine=48168960;
 //BA.debugLineNum = 48168960;BA.debugLine="Private Sub StartConfirmDeviceCredential";
RDebugUtils.currentLine=48168961;
 //BA.debugLineNum = 48168961;BA.debugLine="Try";
try {RDebugUtils.currentLine=48168962;
 //BA.debugLineNum = 48168962;BA.debugLine="Dim i As Intent";
_i = new anywheresoftware.b4a.objects.IntentWrapper();
RDebugUtils.currentLine=48168963;
 //BA.debugLineNum = 48168963;BA.debugLine="i.Initialize(\"android.app.action.CONFIRM_DEVICE_";
_i.Initialize("android.app.action.CONFIRM_DEVICE_CREDENTIAL","");
RDebugUtils.currentLine=48168964;
 //BA.debugLineNum = 48168964;BA.debugLine="StartActivityForResult(i)";
__ref._startactivityforresult /*String*/ (null,_i);
 } 
       catch (Exception e6) {
			ba.setLastException(e6);RDebugUtils.currentLine=48168966;
 //BA.debugLineNum = 48168966;BA.debugLine="Log(\"StartConfirmDeviceCredential Fehler: \" & La";
__c.LogImpl("848168966","StartConfirmDeviceCredential Fehler: "+__c.LastException(ba).getMessage(),0);
RDebugUtils.currentLine=48168967;
 //BA.debugLineNum = 48168967;BA.debugLine="B4XPages.MainPage.Status = Status";
_b4xpages._mainpage /*b4a.example.b4xmainpage*/ (ba)._status /*anywheresoftware.b4a.objects.collections.Map*/  = __ref._status /*anywheresoftware.b4a.objects.collections.Map*/ ;
RDebugUtils.currentLine=48168968;
 //BA.debugLineNum = 48168968;BA.debugLine="B4XPages.ClosePage(Me)";
_b4xpages._closepage /*String*/ (ba,this);
 };
RDebugUtils.currentLine=48168970;
 //BA.debugLineNum = 48168970;BA.debugLine="End Sub";
return "";
}
public String  _class_globals(b4a.example.screensaver __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="screensaver";
RDebugUtils.currentLine=47710208;
 //BA.debugLineNum = 47710208;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=47710209;
 //BA.debugLineNum = 47710209;BA.debugLine="Private Root As B4XView";
_root = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=47710210;
 //BA.debugLineNum = 47710210;BA.debugLine="Private xui As XUI";
_xui = new anywheresoftware.b4a.objects.B4XViewWrapper.XUI();
RDebugUtils.currentLine=47710213;
 //BA.debugLineNum = 47710213;BA.debugLine="Public Status As Map";
_status = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=47710216;
 //BA.debugLineNum = 47710216;BA.debugLine="Private Label1 As Label";
_label1 = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=47710217;
 //BA.debugLineNum = 47710217;BA.debugLine="Private btnLogin As Button";
_btnlogin = new anywheresoftware.b4a.objects.ButtonWrapper();
RDebugUtils.currentLine=47710220;
 //BA.debugLineNum = 47710220;BA.debugLine="Private ion As Object";
_ion = new Object();
RDebugUtils.currentLine=47710221;
 //BA.debugLineNum = 47710221;BA.debugLine="End Sub";
return "";
}
public Object  _getba(b4a.example.screensaver __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="screensaver";
if (Debug.shouldDelegate(ba, "getba", false))
	 {return ((Object) Debug.delegate(ba, "getba", null));}
anywheresoftware.b4j.object.JavaObject _jo = null;
RDebugUtils.currentLine=48365568;
 //BA.debugLineNum = 48365568;BA.debugLine="Private Sub GetBA As Object";
RDebugUtils.currentLine=48365569;
 //BA.debugLineNum = 48365569;BA.debugLine="Dim jo As JavaObject";
_jo = new anywheresoftware.b4j.object.JavaObject();
RDebugUtils.currentLine=48365570;
 //BA.debugLineNum = 48365570;BA.debugLine="jo.InitializeStatic(Application.PackageName & \".m";
_jo.InitializeStatic(__c.Application.getPackageName()+".main");
RDebugUtils.currentLine=48365571;
 //BA.debugLineNum = 48365571;BA.debugLine="Return jo.GetField(\"processBA\")";
if (true) return _jo.GetField("processBA");
RDebugUtils.currentLine=48365572;
 //BA.debugLineNum = 48365572;BA.debugLine="End Sub";
return null;
}
public Object  _ion_event(b4a.example.screensaver __ref,String _methodname,Object[] _args) throws Exception{
__ref = this;
RDebugUtils.currentModule="screensaver";
if (Debug.shouldDelegate(ba, "ion_event", false))
	 {return ((Object) Debug.delegate(ba, "ion_event", new Object[] {_methodname,_args}));}
int _rescode = 0;
RDebugUtils.currentLine=48300032;
 //BA.debugLineNum = 48300032;BA.debugLine="Private Sub ion_Event (MethodName As String, Args(";
RDebugUtils.currentLine=48300033;
 //BA.debugLineNum = 48300033;BA.debugLine="Dim resCode As Int = Args(0)";
_rescode = (int)(BA.ObjectToNumber(_args[(int) (0)]));
RDebugUtils.currentLine=48300034;
 //BA.debugLineNum = 48300034;BA.debugLine="If resCode = -1 Then";
if (_rescode==-1) { 
RDebugUtils.currentLine=48300035;
 //BA.debugLineNum = 48300035;BA.debugLine="B4XPages.MainPage.Status = Status";
_b4xpages._mainpage /*b4a.example.b4xmainpage*/ (ba)._status /*anywheresoftware.b4a.objects.collections.Map*/  = __ref._status /*anywheresoftware.b4a.objects.collections.Map*/ ;
RDebugUtils.currentLine=48300036;
 //BA.debugLineNum = 48300036;BA.debugLine="B4XPages.ClosePage(Me)";
_b4xpages._closepage /*String*/ (ba,this);
 };
RDebugUtils.currentLine=48300038;
 //BA.debugLineNum = 48300038;BA.debugLine="Return Null";
if (true) return __c.Null;
RDebugUtils.currentLine=48300039;
 //BA.debugLineNum = 48300039;BA.debugLine="End Sub";
return null;
}
public String  _startactivityforresult(b4a.example.screensaver __ref,anywheresoftware.b4a.objects.IntentWrapper _i) throws Exception{
__ref = this;
RDebugUtils.currentModule="screensaver";
if (Debug.shouldDelegate(ba, "startactivityforresult", false))
	 {return ((String) Debug.delegate(ba, "startactivityforresult", new Object[] {_i}));}
anywheresoftware.b4j.object.JavaObject _jo = null;
RDebugUtils.currentLine=48234496;
 //BA.debugLineNum = 48234496;BA.debugLine="Private Sub StartActivityForResult(i As Intent)";
RDebugUtils.currentLine=48234497;
 //BA.debugLineNum = 48234497;BA.debugLine="Dim jo As JavaObject = GetBA";
_jo = new anywheresoftware.b4j.object.JavaObject();
_jo = (anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(__ref._getba /*Object*/ (null)));
RDebugUtils.currentLine=48234498;
 //BA.debugLineNum = 48234498;BA.debugLine="ion = jo.CreateEvent(\"anywheresoftware.b4a.IOnAct";
__ref._ion /*Object*/  = _jo.CreateEvent(ba,"anywheresoftware.b4a.IOnActivityResult","ion",__c.Null);
RDebugUtils.currentLine=48234499;
 //BA.debugLineNum = 48234499;BA.debugLine="jo.RunMethod(\"startActivityForResult\", Array As O";
_jo.RunMethod("startActivityForResult",new Object[]{__ref._ion /*Object*/ ,(Object)(_i.getObject())});
RDebugUtils.currentLine=48234500;
 //BA.debugLineNum = 48234500;BA.debugLine="End Sub";
return "";
}
}