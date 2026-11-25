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
RDebugUtils.currentLine=11337728;
 //BA.debugLineNum = 11337728;BA.debugLine="Public Sub Initialize";
RDebugUtils.currentLine=11337729;
 //BA.debugLineNum = 11337729;BA.debugLine="Status.Initialize";
__ref._status /*anywheresoftware.b4a.objects.collections.Map*/ .Initialize();
RDebugUtils.currentLine=11337730;
 //BA.debugLineNum = 11337730;BA.debugLine="End Sub";
return "";
}
public String  _b4xpage_appear(b4a.example.screensaver __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="screensaver";
if (Debug.shouldDelegate(ba, "b4xpage_appear", false))
	 {return ((String) Debug.delegate(ba, "b4xpage_appear", null));}
RDebugUtils.currentLine=11468800;
 //BA.debugLineNum = 11468800;BA.debugLine="Public Sub B4XPage_Appear";
RDebugUtils.currentLine=11468801;
 //BA.debugLineNum = 11468801;BA.debugLine="If B4XPages.MainPage.Status.IsInitialized And B4X";
if (_b4xpages._mainpage /*b4a.example.b4xmainpage*/ (ba)._status /*anywheresoftware.b4a.objects.collections.Map*/ .IsInitialized() && _b4xpages._mainpage /*b4a.example.b4xmainpage*/ (ba)._status /*anywheresoftware.b4a.objects.collections.Map*/ .getSize()>0) { 
RDebugUtils.currentLine=11468802;
 //BA.debugLineNum = 11468802;BA.debugLine="Status = B4XPages.MainPage.Status";
__ref._status /*anywheresoftware.b4a.objects.collections.Map*/  = _b4xpages._mainpage /*b4a.example.b4xmainpage*/ (ba)._status /*anywheresoftware.b4a.objects.collections.Map*/ ;
 };
RDebugUtils.currentLine=11468804;
 //BA.debugLineNum = 11468804;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=11534337;
 //BA.debugLineNum = 11534337;BA.debugLine="Return False";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.False));return;};
RDebugUtils.currentLine=11534338;
 //BA.debugLineNum = 11534338;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=11403264;
 //BA.debugLineNum = 11403264;BA.debugLine="Private Sub B4XPage_Created (Root1 As B4XView)";
RDebugUtils.currentLine=11403265;
 //BA.debugLineNum = 11403265;BA.debugLine="Root = Root1";
__ref._root /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = _root1;
RDebugUtils.currentLine=11403266;
 //BA.debugLineNum = 11403266;BA.debugLine="B4XPages.SetTitle(Me, \"Wertungslisten-App by sthn";
_b4xpages._settitle /*String*/ (ba,this,(Object)("Wertungslisten-App by sthnet.de"));
RDebugUtils.currentLine=11403267;
 //BA.debugLineNum = 11403267;BA.debugLine="BuildUI";
__ref._buildui /*String*/ (null);
RDebugUtils.currentLine=11403268;
 //BA.debugLineNum = 11403268;BA.debugLine="End Sub";
return "";
}
public String  _buildui(b4a.example.screensaver __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="screensaver";
if (Debug.shouldDelegate(ba, "buildui", false))
	 {return ((String) Debug.delegate(ba, "buildui", null));}
anywheresoftware.b4a.objects.B4XViewWrapper _xv = null;
RDebugUtils.currentLine=11599872;
 //BA.debugLineNum = 11599872;BA.debugLine="Private Sub BuildUI";
RDebugUtils.currentLine=11599873;
 //BA.debugLineNum = 11599873;BA.debugLine="Root.Color = 0xFF222222";
__ref._root /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setColor(((int)0xff222222));
RDebugUtils.currentLine=11599875;
 //BA.debugLineNum = 11599875;BA.debugLine="Label1.Initialize(\"\")";
__ref._label1 /*anywheresoftware.b4a.objects.LabelWrapper*/ .Initialize(ba,"");
RDebugUtils.currentLine=11599876;
 //BA.debugLineNum = 11599876;BA.debugLine="Label1.Text = \"Erneute Anmeldung erforderlich ...";
__ref._label1 /*anywheresoftware.b4a.objects.LabelWrapper*/ .setText(BA.ObjectToCharSequence("Erneute Anmeldung erforderlich ..."));
RDebugUtils.currentLine=11599877;
 //BA.debugLineNum = 11599877;BA.debugLine="Label1.TextSize = 16";
__ref._label1 /*anywheresoftware.b4a.objects.LabelWrapper*/ .setTextSize((float) (16));
RDebugUtils.currentLine=11599878;
 //BA.debugLineNum = 11599878;BA.debugLine="Label1.Typeface = Typeface.DEFAULT_BOLD";
__ref._label1 /*anywheresoftware.b4a.objects.LabelWrapper*/ .setTypeface(__c.Typeface.DEFAULT_BOLD);
RDebugUtils.currentLine=11599879;
 //BA.debugLineNum = 11599879;BA.debugLine="Label1.TextColor = Colors.White";
__ref._label1 /*anywheresoftware.b4a.objects.LabelWrapper*/ .setTextColor(__c.Colors.White);
RDebugUtils.currentLine=11599880;
 //BA.debugLineNum = 11599880;BA.debugLine="Label1.Gravity = Gravity.CENTER";
__ref._label1 /*anywheresoftware.b4a.objects.LabelWrapper*/ .setGravity(__c.Gravity.CENTER);
RDebugUtils.currentLine=11599881;
 //BA.debugLineNum = 11599881;BA.debugLine="Root.AddView(Label1, 0, 25dip, 100%x, 40dip)";
__ref._root /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .AddView((android.view.View)(__ref._label1 /*anywheresoftware.b4a.objects.LabelWrapper*/ .getObject()),(int) (0),__c.DipToCurrent((int) (25)),__c.PerXToCurrent((float) (100),ba),__c.DipToCurrent((int) (40)));
RDebugUtils.currentLine=11599883;
 //BA.debugLineNum = 11599883;BA.debugLine="btnLogin.Initialize(\"btnLogin\")";
__ref._btnlogin /*anywheresoftware.b4a.objects.ButtonWrapper*/ .Initialize(ba,"btnLogin");
RDebugUtils.currentLine=11599884;
 //BA.debugLineNum = 11599884;BA.debugLine="If File.Exists(File.DirAssets, \"Fingerprint.png\")";
if (__c.File.Exists(__c.File.getDirAssets(),"Fingerprint.png")) { 
RDebugUtils.currentLine=11599885;
 //BA.debugLineNum = 11599885;BA.debugLine="btnLogin.SetBackgroundImage(LoadBitmap(File.DirA";
__ref._btnlogin /*anywheresoftware.b4a.objects.ButtonWrapper*/ .SetBackgroundImageNew((android.graphics.Bitmap)(__c.LoadBitmap(__c.File.getDirAssets(),"Fingerprint.png").getObject()));
 }else {
RDebugUtils.currentLine=11599887;
 //BA.debugLineNum = 11599887;BA.debugLine="btnLogin.Text = \"🔒\"";
__ref._btnlogin /*anywheresoftware.b4a.objects.ButtonWrapper*/ .setText(BA.ObjectToCharSequence("🔒"));
RDebugUtils.currentLine=11599888;
 //BA.debugLineNum = 11599888;BA.debugLine="btnLogin.TextSize = 24";
__ref._btnlogin /*anywheresoftware.b4a.objects.ButtonWrapper*/ .setTextSize((float) (24));
RDebugUtils.currentLine=11599889;
 //BA.debugLineNum = 11599889;BA.debugLine="btnLogin.TextColor = Colors.White";
__ref._btnlogin /*anywheresoftware.b4a.objects.ButtonWrapper*/ .setTextColor(__c.Colors.White);
RDebugUtils.currentLine=11599890;
 //BA.debugLineNum = 11599890;BA.debugLine="btnLogin.Color = 0xFF444444";
__ref._btnlogin /*anywheresoftware.b4a.objects.ButtonWrapper*/ .setColor(((int)0xff444444));
 };
RDebugUtils.currentLine=11599892;
 //BA.debugLineNum = 11599892;BA.debugLine="Root.AddView(btnLogin, (100%x - 64dip) / 2, 100%y";
__ref._root /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .AddView((android.view.View)(__ref._btnlogin /*anywheresoftware.b4a.objects.ButtonWrapper*/ .getObject()),(int) ((__c.PerXToCurrent((float) (100),ba)-__c.DipToCurrent((int) (64)))/(double)2),(int) (__c.PerYToCurrent((float) (100),ba)-__c.DipToCurrent((int) (89))),__c.DipToCurrent((int) (64)),__c.DipToCurrent((int) (64)));
RDebugUtils.currentLine=11599894;
 //BA.debugLineNum = 11599894;BA.debugLine="Dim xv As B4XView = btnLogin";
_xv = new anywheresoftware.b4a.objects.B4XViewWrapper();
_xv = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(__ref._btnlogin /*anywheresoftware.b4a.objects.ButtonWrapper*/ .getObject()));
RDebugUtils.currentLine=11599895;
 //BA.debugLineNum = 11599895;BA.debugLine="xv.SetColorAndBorder(xv.Color, 0, 0, 32dip)";
_xv.SetColorAndBorder(_xv.getColor(),(int) (0),(int) (0),__c.DipToCurrent((int) (32)));
RDebugUtils.currentLine=11599896;
 //BA.debugLineNum = 11599896;BA.debugLine="End Sub";
return "";
}
public String  _btnlogin_down(b4a.example.screensaver __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="screensaver";
if (Debug.shouldDelegate(ba, "btnlogin_down", false))
	 {return ((String) Debug.delegate(ba, "btnlogin_down", null));}
RDebugUtils.currentLine=11665408;
 //BA.debugLineNum = 11665408;BA.debugLine="Private Sub btnLogin_Down";
RDebugUtils.currentLine=11665409;
 //BA.debugLineNum = 11665409;BA.debugLine="StartConfirmDeviceCredential";
__ref._startconfirmdevicecredential /*String*/ (null);
RDebugUtils.currentLine=11665410;
 //BA.debugLineNum = 11665410;BA.debugLine="End Sub";
return "";
}
public String  _startconfirmdevicecredential(b4a.example.screensaver __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="screensaver";
if (Debug.shouldDelegate(ba, "startconfirmdevicecredential", false))
	 {return ((String) Debug.delegate(ba, "startconfirmdevicecredential", null));}
anywheresoftware.b4a.objects.IntentWrapper _i = null;
RDebugUtils.currentLine=11730944;
 //BA.debugLineNum = 11730944;BA.debugLine="Private Sub StartConfirmDeviceCredential";
RDebugUtils.currentLine=11730945;
 //BA.debugLineNum = 11730945;BA.debugLine="Try";
try {RDebugUtils.currentLine=11730946;
 //BA.debugLineNum = 11730946;BA.debugLine="Dim i As Intent";
_i = new anywheresoftware.b4a.objects.IntentWrapper();
RDebugUtils.currentLine=11730947;
 //BA.debugLineNum = 11730947;BA.debugLine="i.Initialize(\"android.app.action.CONFIRM_DEVICE_";
_i.Initialize("android.app.action.CONFIRM_DEVICE_CREDENTIAL","");
RDebugUtils.currentLine=11730948;
 //BA.debugLineNum = 11730948;BA.debugLine="StartActivityForResult(i)";
__ref._startactivityforresult /*String*/ (null,_i);
 } 
       catch (Exception e6) {
			ba.setLastException(e6);RDebugUtils.currentLine=11730950;
 //BA.debugLineNum = 11730950;BA.debugLine="Log(\"StartConfirmDeviceCredential Fehler: \" & La";
__c.LogImpl("311730950","StartConfirmDeviceCredential Fehler: "+__c.LastException(ba).getMessage(),0);
RDebugUtils.currentLine=11730951;
 //BA.debugLineNum = 11730951;BA.debugLine="B4XPages.MainPage.Status = Status";
_b4xpages._mainpage /*b4a.example.b4xmainpage*/ (ba)._status /*anywheresoftware.b4a.objects.collections.Map*/  = __ref._status /*anywheresoftware.b4a.objects.collections.Map*/ ;
RDebugUtils.currentLine=11730952;
 //BA.debugLineNum = 11730952;BA.debugLine="B4XPages.ClosePage(Me)";
_b4xpages._closepage /*String*/ (ba,this);
 };
RDebugUtils.currentLine=11730954;
 //BA.debugLineNum = 11730954;BA.debugLine="End Sub";
return "";
}
public String  _class_globals(b4a.example.screensaver __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="screensaver";
RDebugUtils.currentLine=11272192;
 //BA.debugLineNum = 11272192;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=11272193;
 //BA.debugLineNum = 11272193;BA.debugLine="Private Root As B4XView";
_root = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=11272194;
 //BA.debugLineNum = 11272194;BA.debugLine="Private xui As XUI";
_xui = new anywheresoftware.b4a.objects.B4XViewWrapper.XUI();
RDebugUtils.currentLine=11272197;
 //BA.debugLineNum = 11272197;BA.debugLine="Public Status As Map";
_status = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=11272200;
 //BA.debugLineNum = 11272200;BA.debugLine="Private Label1 As Label";
_label1 = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=11272201;
 //BA.debugLineNum = 11272201;BA.debugLine="Private btnLogin As Button";
_btnlogin = new anywheresoftware.b4a.objects.ButtonWrapper();
RDebugUtils.currentLine=11272204;
 //BA.debugLineNum = 11272204;BA.debugLine="Private ion As Object";
_ion = new Object();
RDebugUtils.currentLine=11272205;
 //BA.debugLineNum = 11272205;BA.debugLine="End Sub";
return "";
}
public Object  _getba(b4a.example.screensaver __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="screensaver";
if (Debug.shouldDelegate(ba, "getba", false))
	 {return ((Object) Debug.delegate(ba, "getba", null));}
anywheresoftware.b4j.object.JavaObject _jo = null;
RDebugUtils.currentLine=11927552;
 //BA.debugLineNum = 11927552;BA.debugLine="Private Sub GetBA As Object";
RDebugUtils.currentLine=11927553;
 //BA.debugLineNum = 11927553;BA.debugLine="Dim jo As JavaObject";
_jo = new anywheresoftware.b4j.object.JavaObject();
RDebugUtils.currentLine=11927554;
 //BA.debugLineNum = 11927554;BA.debugLine="jo.InitializeStatic(Application.PackageName & \".m";
_jo.InitializeStatic(__c.Application.getPackageName()+".main");
RDebugUtils.currentLine=11927555;
 //BA.debugLineNum = 11927555;BA.debugLine="Return jo.GetField(\"processBA\")";
if (true) return _jo.GetField("processBA");
RDebugUtils.currentLine=11927556;
 //BA.debugLineNum = 11927556;BA.debugLine="End Sub";
return null;
}
public Object  _ion_event(b4a.example.screensaver __ref,String _methodname,Object[] _args) throws Exception{
__ref = this;
RDebugUtils.currentModule="screensaver";
if (Debug.shouldDelegate(ba, "ion_event", false))
	 {return ((Object) Debug.delegate(ba, "ion_event", new Object[] {_methodname,_args}));}
int _rescode = 0;
RDebugUtils.currentLine=11862016;
 //BA.debugLineNum = 11862016;BA.debugLine="Private Sub ion_Event (MethodName As String, Args(";
RDebugUtils.currentLine=11862017;
 //BA.debugLineNum = 11862017;BA.debugLine="Dim resCode As Int = Args(0)";
_rescode = (int)(BA.ObjectToNumber(_args[(int) (0)]));
RDebugUtils.currentLine=11862018;
 //BA.debugLineNum = 11862018;BA.debugLine="If resCode = -1 Then";
if (_rescode==-1) { 
RDebugUtils.currentLine=11862019;
 //BA.debugLineNum = 11862019;BA.debugLine="B4XPages.MainPage.Status = Status";
_b4xpages._mainpage /*b4a.example.b4xmainpage*/ (ba)._status /*anywheresoftware.b4a.objects.collections.Map*/  = __ref._status /*anywheresoftware.b4a.objects.collections.Map*/ ;
RDebugUtils.currentLine=11862020;
 //BA.debugLineNum = 11862020;BA.debugLine="B4XPages.ClosePage(Me)";
_b4xpages._closepage /*String*/ (ba,this);
 };
RDebugUtils.currentLine=11862022;
 //BA.debugLineNum = 11862022;BA.debugLine="Return Null";
if (true) return __c.Null;
RDebugUtils.currentLine=11862023;
 //BA.debugLineNum = 11862023;BA.debugLine="End Sub";
return null;
}
public String  _startactivityforresult(b4a.example.screensaver __ref,anywheresoftware.b4a.objects.IntentWrapper _i) throws Exception{
__ref = this;
RDebugUtils.currentModule="screensaver";
if (Debug.shouldDelegate(ba, "startactivityforresult", false))
	 {return ((String) Debug.delegate(ba, "startactivityforresult", new Object[] {_i}));}
anywheresoftware.b4j.object.JavaObject _jo = null;
RDebugUtils.currentLine=11796480;
 //BA.debugLineNum = 11796480;BA.debugLine="Private Sub StartActivityForResult(i As Intent)";
RDebugUtils.currentLine=11796481;
 //BA.debugLineNum = 11796481;BA.debugLine="Dim jo As JavaObject = GetBA";
_jo = new anywheresoftware.b4j.object.JavaObject();
_jo = (anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(__ref._getba /*Object*/ (null)));
RDebugUtils.currentLine=11796482;
 //BA.debugLineNum = 11796482;BA.debugLine="ion = jo.CreateEvent(\"anywheresoftware.b4a.IOnAct";
__ref._ion /*Object*/  = _jo.CreateEvent(ba,"anywheresoftware.b4a.IOnActivityResult","ion",__c.Null);
RDebugUtils.currentLine=11796483;
 //BA.debugLineNum = 11796483;BA.debugLine="jo.RunMethod(\"startActivityForResult\", Array As O";
_jo.RunMethod("startActivityForResult",new Object[]{__ref._ion /*Object*/ ,(Object)(_i.getObject())});
RDebugUtils.currentLine=11796484;
 //BA.debugLineNum = 11796484;BA.debugLine="End Sub";
return "";
}
}