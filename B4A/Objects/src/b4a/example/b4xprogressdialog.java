package b4a.example;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.debug.*;

public class b4xprogressdialog extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    private static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new anywheresoftware.b4a.ShellBA(_ba, this, htSubs, "b4a.example.b4xprogressdialog");
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            
        }
        if (BA.isShellModeRuntimeCheck(ba)) 
			   this.getClass().getMethod("_class_globals", b4a.example.b4xprogressdialog.class).invoke(this, new Object[] {null});
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
public anywheresoftware.b4a.objects.B4XViewWrapper.XUI _xui = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _mbase = null;
public Object _mtext = null;
public b4a.example.b4xloadingindicator _loadingindicator = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _label1 = null;
public b4a.example.b4xdialog _mdialog = null;
public b4a.example.dateutils _dateutils = null;
public b4a.example.main _main = null;
public b4a.example.b4xpages _b4xpages = null;
public b4a.example.b4xcollections _b4xcollections = null;
public b4a.example.httputils2service _httputils2service = null;
public b4a.example.xuiviewsutils _xuiviewsutils = null;
public anywheresoftware.b4a.objects.B4XViewWrapper  _getpanel(b4a.example.b4xprogressdialog __ref,b4a.example.b4xdialog _dialog) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xprogressdialog";
if (Debug.shouldDelegate(ba, "getpanel", true))
	 {return ((anywheresoftware.b4a.objects.B4XViewWrapper) Debug.delegate(ba, "getpanel", new Object[] {_dialog}));}
RDebugUtils.currentLine=40632320;
 //BA.debugLineNum = 40632320;BA.debugLine="Public Sub GetPanel (Dialog As B4XDialog) As B4XVi";
RDebugUtils.currentLine=40632321;
 //BA.debugLineNum = 40632321;BA.debugLine="Return mBase";
if (true) return __ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ ;
RDebugUtils.currentLine=40632322;
 //BA.debugLineNum = 40632322;BA.debugLine="End Sub";
return null;
}
public String  _show(b4a.example.b4xprogressdialog __ref,b4a.example.b4xdialog _dialog) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xprogressdialog";
if (Debug.shouldDelegate(ba, "show", true))
	 {return ((String) Debug.delegate(ba, "show", new Object[] {_dialog}));}
RDebugUtils.currentLine=40828928;
 //BA.debugLineNum = 40828928;BA.debugLine="Private Sub Show (Dialog As B4XDialog) 'ignore";
RDebugUtils.currentLine=40828929;
 //BA.debugLineNum = 40828929;BA.debugLine="LoadingIndicator.Show";
__ref._loadingindicator /*b4a.example.b4xloadingindicator*/ ._show /*String*/ (null);
RDebugUtils.currentLine=40828930;
 //BA.debugLineNum = 40828930;BA.debugLine="End Sub";
return "";
}
public String  _dialogclosed(b4a.example.b4xprogressdialog __ref,int _result) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xprogressdialog";
if (Debug.shouldDelegate(ba, "dialogclosed", true))
	 {return ((String) Debug.delegate(ba, "dialogclosed", new Object[] {_result}));}
RDebugUtils.currentLine=40894464;
 //BA.debugLineNum = 40894464;BA.debugLine="Private Sub DialogClosed(Result As Int) 'ignore";
RDebugUtils.currentLine=40894465;
 //BA.debugLineNum = 40894465;BA.debugLine="LoadingIndicator.Hide";
__ref._loadingindicator /*b4a.example.b4xloadingindicator*/ ._hide /*String*/ (null);
RDebugUtils.currentLine=40894466;
 //BA.debugLineNum = 40894466;BA.debugLine="End Sub";
return "";
}
public String  _class_globals(b4a.example.b4xprogressdialog __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xprogressdialog";
RDebugUtils.currentLine=40370176;
 //BA.debugLineNum = 40370176;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=40370177;
 //BA.debugLineNum = 40370177;BA.debugLine="Private xui As XUI";
_xui = new anywheresoftware.b4a.objects.B4XViewWrapper.XUI();
RDebugUtils.currentLine=40370178;
 //BA.debugLineNum = 40370178;BA.debugLine="Public mBase As B4XView";
_mbase = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=40370179;
 //BA.debugLineNum = 40370179;BA.debugLine="Private mText As Object";
_mtext = new Object();
RDebugUtils.currentLine=40370180;
 //BA.debugLineNum = 40370180;BA.debugLine="Public LoadingIndicator As B4XLoadingIndicator";
_loadingindicator = new b4a.example.b4xloadingindicator();
RDebugUtils.currentLine=40370181;
 //BA.debugLineNum = 40370181;BA.debugLine="Public Label1 As B4XView";
_label1 = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=40370182;
 //BA.debugLineNum = 40370182;BA.debugLine="Public mDialog As B4XDialog";
_mdialog = new b4a.example.b4xdialog();
RDebugUtils.currentLine=40370183;
 //BA.debugLineNum = 40370183;BA.debugLine="End Sub";
return "";
}
public Object  _gettext(b4a.example.b4xprogressdialog __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xprogressdialog";
if (Debug.shouldDelegate(ba, "gettext", true))
	 {return ((Object) Debug.delegate(ba, "gettext", null));}
RDebugUtils.currentLine=40566784;
 //BA.debugLineNum = 40566784;BA.debugLine="Public Sub getText As Object";
RDebugUtils.currentLine=40566785;
 //BA.debugLineNum = 40566785;BA.debugLine="Return mText";
if (true) return __ref._mtext /*Object*/ ;
RDebugUtils.currentLine=40566786;
 //BA.debugLineNum = 40566786;BA.debugLine="End Sub";
return null;
}
public String  _hide(b4a.example.b4xprogressdialog __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xprogressdialog";
if (Debug.shouldDelegate(ba, "hide", true))
	 {return ((String) Debug.delegate(ba, "hide", null));}
RDebugUtils.currentLine=40763392;
 //BA.debugLineNum = 40763392;BA.debugLine="Public Sub Hide";
RDebugUtils.currentLine=40763393;
 //BA.debugLineNum = 40763393;BA.debugLine="mDialog.Close(0)";
__ref._mdialog /*b4a.example.b4xdialog*/ ._close /*boolean*/ (null,(int) (0));
RDebugUtils.currentLine=40763394;
 //BA.debugLineNum = 40763394;BA.debugLine="End Sub";
return "";
}
public String  _initialize(b4a.example.b4xprogressdialog __ref,anywheresoftware.b4a.BA _ba,anywheresoftware.b4a.objects.B4XViewWrapper _parent) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="b4xprogressdialog";
if (Debug.shouldDelegate(ba, "initialize", true))
	 {return ((String) Debug.delegate(ba, "initialize", new Object[] {_ba,_parent}));}
RDebugUtils.currentLine=40435712;
 //BA.debugLineNum = 40435712;BA.debugLine="Public Sub Initialize (Parent As B4XView)";
RDebugUtils.currentLine=40435713;
 //BA.debugLineNum = 40435713;BA.debugLine="mBase = xui.CreatePanel(\"mBase\")";
__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .CreatePanel(ba,"mBase");
RDebugUtils.currentLine=40435714;
 //BA.debugLineNum = 40435714;BA.debugLine="mBase.SetLayoutAnimated(0, 0, 0, 300dip, 60dip)";
__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .SetLayoutAnimated((int) (0),(int) (0),(int) (0),__c.DipToCurrent((int) (300)),__c.DipToCurrent((int) (60)));
RDebugUtils.currentLine=40435715;
 //BA.debugLineNum = 40435715;BA.debugLine="mBase.LoadLayout(\"XV_ProgressTemplate\")";
__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .LoadLayout("XV_ProgressTemplate",ba);
RDebugUtils.currentLine=40435716;
 //BA.debugLineNum = 40435716;BA.debugLine="mBase.SetColorAndBorder(xui.Color_White, 0, 0, 5d";
__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .SetColorAndBorder(__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_White,(int) (0),(int) (0),__c.DipToCurrent((int) (5)));
RDebugUtils.currentLine=40435717;
 //BA.debugLineNum = 40435717;BA.debugLine="LoadingIndicator.Hide";
__ref._loadingindicator /*b4a.example.b4xloadingindicator*/ ._hide /*String*/ (null);
RDebugUtils.currentLine=40435718;
 //BA.debugLineNum = 40435718;BA.debugLine="mDialog.Initialize(Parent)";
__ref._mdialog /*b4a.example.b4xdialog*/ ._initialize /*String*/ (null,ba,_parent);
RDebugUtils.currentLine=40435719;
 //BA.debugLineNum = 40435719;BA.debugLine="mDialog.ButtonsHeight = -2dip";
__ref._mdialog /*b4a.example.b4xdialog*/ ._buttonsheight /*int*/  = (int) (-__c.DipToCurrent((int) (2)));
RDebugUtils.currentLine=40435720;
 //BA.debugLineNum = 40435720;BA.debugLine="mDialog.BorderWidth = 0";
__ref._mdialog /*b4a.example.b4xdialog*/ ._borderwidth /*int*/  = (int) (0);
RDebugUtils.currentLine=40435721;
 //BA.debugLineNum = 40435721;BA.debugLine="mDialog.BorderCornersRadius = 5dip";
__ref._mdialog /*b4a.example.b4xdialog*/ ._bordercornersradius /*int*/  = __c.DipToCurrent((int) (5));
RDebugUtils.currentLine=40435722;
 //BA.debugLineNum = 40435722;BA.debugLine="End Sub";
return "";
}
public String  _settext(b4a.example.b4xprogressdialog __ref,Object _t) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xprogressdialog";
if (Debug.shouldDelegate(ba, "settext", true))
	 {return ((String) Debug.delegate(ba, "settext", new Object[] {_t}));}
RDebugUtils.currentLine=40501248;
 //BA.debugLineNum = 40501248;BA.debugLine="Public Sub setText(t As Object)";
RDebugUtils.currentLine=40501249;
 //BA.debugLineNum = 40501249;BA.debugLine="XUIViewsUtils.SetTextOrCSBuilderToLabel(Label1, t";
_xuiviewsutils._settextorcsbuildertolabel /*String*/ (ba,__ref._label1 /*anywheresoftware.b4a.objects.B4XViewWrapper*/ ,_t);
RDebugUtils.currentLine=40501250;
 //BA.debugLineNum = 40501250;BA.debugLine="End Sub";
return "";
}
public String  _showdialog(b4a.example.b4xprogressdialog __ref,Object _text) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xprogressdialog";
if (Debug.shouldDelegate(ba, "showdialog", true))
	 {return ((String) Debug.delegate(ba, "showdialog", new Object[] {_text}));}
RDebugUtils.currentLine=40697856;
 //BA.debugLineNum = 40697856;BA.debugLine="Public Sub ShowDialog (Text As Object)";
RDebugUtils.currentLine=40697857;
 //BA.debugLineNum = 40697857;BA.debugLine="setText(Text)";
__ref._settext /*String*/ (null,_text);
RDebugUtils.currentLine=40697858;
 //BA.debugLineNum = 40697858;BA.debugLine="If mDialog.Visible = False Then";
if (__ref._mdialog /*b4a.example.b4xdialog*/ ._getvisible /*boolean*/ (null)==__c.False) { 
RDebugUtils.currentLine=40697859;
 //BA.debugLineNum = 40697859;BA.debugLine="mDialog.ShowTemplate(Me, \"\", \"\", \"\")";
__ref._mdialog /*b4a.example.b4xdialog*/ ._showtemplate /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null,this,(Object)(""),(Object)(""),(Object)(""));
 };
RDebugUtils.currentLine=40697861;
 //BA.debugLineNum = 40697861;BA.debugLine="End Sub";
return "";
}
}