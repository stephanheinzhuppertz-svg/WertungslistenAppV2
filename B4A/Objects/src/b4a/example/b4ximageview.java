package b4a.example;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.debug.*;

public class b4ximageview extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    private static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new anywheresoftware.b4a.ShellBA(_ba, this, htSubs, "b4a.example.b4ximageview");
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            
        }
        if (BA.isShellModeRuntimeCheck(ba)) 
			   this.getClass().getMethod("_class_globals", b4a.example.b4ximageview.class).invoke(this, new Object[] {null});
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
public String _meventname = "";
public Object _mcallback = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _mbase = null;
public anywheresoftware.b4a.objects.B4XViewWrapper.XUI _xui = null;
public Object _tag = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _iv = null;
public String _mresizemode = "";
public boolean _mround = false;
public anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper _mbitmap = null;
public int _mbackgroundcolor = 0;
public int _mcornersradius = 0;
public b4a.example.dateutils _dateutils = null;
public b4a.example.main _main = null;
public b4a.example.b4xpages _b4xpages = null;
public b4a.example.b4xcollections _b4xcollections = null;
public b4a.example.httputils2service _httputils2service = null;
public b4a.example.xuiviewsutils _xuiviewsutils = null;
public String  _base_resize(b4a.example.b4ximageview __ref,double _width,double _height) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4ximageview";
if (Debug.shouldDelegate(ba, "base_resize", true))
	 {return ((String) Debug.delegate(ba, "base_resize", new Object[] {_width,_height}));}
RDebugUtils.currentLine=35586048;
 //BA.debugLineNum = 35586048;BA.debugLine="Private Sub Base_Resize (Width As Double, Height A";
RDebugUtils.currentLine=35586049;
 //BA.debugLineNum = 35586049;BA.debugLine="Update";
__ref._update /*String*/ (null);
RDebugUtils.currentLine=35586050;
 //BA.debugLineNum = 35586050;BA.debugLine="End Sub";
return "";
}
public String  _update(b4a.example.b4ximageview __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4ximageview";
if (Debug.shouldDelegate(ba, "update", true))
	 {return ((String) Debug.delegate(ba, "update", null));}
float _imageviewwidth = 0f;
float _imageviewheight = 0f;
float _bmpratio = 0f;
float _r = 0f;
RDebugUtils.currentLine=36044800;
 //BA.debugLineNum = 36044800;BA.debugLine="Public Sub Update";
RDebugUtils.currentLine=36044801;
 //BA.debugLineNum = 36044801;BA.debugLine="If mBitmap.IsInitialized = False Then Return";
if (__ref._mbitmap /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper*/ .IsInitialized()==__c.False) { 
if (true) return "";};
RDebugUtils.currentLine=36044802;
 //BA.debugLineNum = 36044802;BA.debugLine="UpdateClip";
__ref._updateclip /*String*/ (null);
RDebugUtils.currentLine=36044803;
 //BA.debugLineNum = 36044803;BA.debugLine="Dim ImageViewWidth, ImageViewHeight As Float";
_imageviewwidth = 0f;
_imageviewheight = 0f;
RDebugUtils.currentLine=36044804;
 //BA.debugLineNum = 36044804;BA.debugLine="Dim bmpRatio As Float = mBitmap.Width / mBitmap.H";
_bmpratio = (float) (__ref._mbitmap /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper*/ .getWidth()/(double)__ref._mbitmap /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper*/ .getHeight());
RDebugUtils.currentLine=36044805;
 //BA.debugLineNum = 36044805;BA.debugLine="Select mResizeMode";
switch (BA.switchObjectToInt(__ref._mresizemode /*String*/ ,"FILL","FIT","FILL_WIDTH","FILL_HEIGHT","FILL_NO_DISTORTIONS","NONE")) {
case 0: {
RDebugUtils.currentLine=36044807;
 //BA.debugLineNum = 36044807;BA.debugLine="ImageViewWidth = mBase.Width";
_imageviewwidth = (float) (__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth());
RDebugUtils.currentLine=36044808;
 //BA.debugLineNum = 36044808;BA.debugLine="ImageViewHeight = mBase.Height";
_imageviewheight = (float) (__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight());
 break; }
case 1: {
RDebugUtils.currentLine=36044810;
 //BA.debugLineNum = 36044810;BA.debugLine="Dim r As Float = Min(mBase.Width / mBitmap.Widt";
_r = (float) (__c.Min(__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth()/(double)__ref._mbitmap /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper*/ .getWidth(),__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight()/(double)__ref._mbitmap /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper*/ .getHeight()));
RDebugUtils.currentLine=36044811;
 //BA.debugLineNum = 36044811;BA.debugLine="ImageViewWidth = mBitmap.Width * r";
_imageviewwidth = (float) (__ref._mbitmap /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper*/ .getWidth()*_r);
RDebugUtils.currentLine=36044812;
 //BA.debugLineNum = 36044812;BA.debugLine="ImageViewHeight = mBitmap.Height * r";
_imageviewheight = (float) (__ref._mbitmap /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper*/ .getHeight()*_r);
 break; }
case 2: {
RDebugUtils.currentLine=36044814;
 //BA.debugLineNum = 36044814;BA.debugLine="ImageViewWidth = mBase.Width";
_imageviewwidth = (float) (__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth());
RDebugUtils.currentLine=36044815;
 //BA.debugLineNum = 36044815;BA.debugLine="ImageViewHeight = ImageViewWidth / bmpRatio";
_imageviewheight = (float) (_imageviewwidth/(double)_bmpratio);
 break; }
case 3: {
RDebugUtils.currentLine=36044817;
 //BA.debugLineNum = 36044817;BA.debugLine="ImageViewHeight = mBase.Height";
_imageviewheight = (float) (__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight());
RDebugUtils.currentLine=36044818;
 //BA.debugLineNum = 36044818;BA.debugLine="ImageViewWidth = ImageViewHeight * bmpRatio";
_imageviewwidth = (float) (_imageviewheight*_bmpratio);
 break; }
case 4: {
RDebugUtils.currentLine=36044820;
 //BA.debugLineNum = 36044820;BA.debugLine="Dim r As Float = Max(mBase.Width / mBitmap.Widt";
_r = (float) (__c.Max(__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth()/(double)__ref._mbitmap /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper*/ .getWidth(),__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight()/(double)__ref._mbitmap /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper*/ .getHeight()));
RDebugUtils.currentLine=36044821;
 //BA.debugLineNum = 36044821;BA.debugLine="ImageViewWidth = mBitmap.Width * r";
_imageviewwidth = (float) (__ref._mbitmap /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper*/ .getWidth()*_r);
RDebugUtils.currentLine=36044822;
 //BA.debugLineNum = 36044822;BA.debugLine="ImageViewHeight = mBitmap.Height * r";
_imageviewheight = (float) (__ref._mbitmap /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper*/ .getHeight()*_r);
 break; }
case 5: {
RDebugUtils.currentLine=36044824;
 //BA.debugLineNum = 36044824;BA.debugLine="ImageViewWidth = mBitmap.Width";
_imageviewwidth = (float) (__ref._mbitmap /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper*/ .getWidth());
RDebugUtils.currentLine=36044825;
 //BA.debugLineNum = 36044825;BA.debugLine="ImageViewHeight = mBitmap.Height";
_imageviewheight = (float) (__ref._mbitmap /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper*/ .getHeight());
 break; }
default: {
RDebugUtils.currentLine=36044827;
 //BA.debugLineNum = 36044827;BA.debugLine="Log(\"Invalid resize mode: \"  & mResizeMode)";
__c.LogImpl("936044827","Invalid resize mode: "+__ref._mresizemode /*String*/ ,0);
 break; }
}
;
RDebugUtils.currentLine=36044829;
 //BA.debugLineNum = 36044829;BA.debugLine="iv.SetLayoutAnimated(0, Round(mBase.Width / 2 - I";
__ref._iv /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .SetLayoutAnimated((int) (0),(int) (__c.Round(__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth()/(double)2-_imageviewwidth/(double)2)),(int) (__c.Round(__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight()/(double)2-_imageviewheight/(double)2)),(int) (__c.Round(_imageviewwidth)),(int) (__c.Round(_imageviewheight)));
RDebugUtils.currentLine=36044830;
 //BA.debugLineNum = 36044830;BA.debugLine="End Sub";
return "";
}
public String  _class_globals(b4a.example.b4ximageview __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4ximageview";
RDebugUtils.currentLine=35389440;
 //BA.debugLineNum = 35389440;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=35389441;
 //BA.debugLineNum = 35389441;BA.debugLine="Private mEventName As String 'ignore";
_meventname = "";
RDebugUtils.currentLine=35389442;
 //BA.debugLineNum = 35389442;BA.debugLine="Private mCallBack As Object 'ignore";
_mcallback = new Object();
RDebugUtils.currentLine=35389443;
 //BA.debugLineNum = 35389443;BA.debugLine="Public mBase As B4XView";
_mbase = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=35389444;
 //BA.debugLineNum = 35389444;BA.debugLine="Private xui As XUI 'ignore";
_xui = new anywheresoftware.b4a.objects.B4XViewWrapper.XUI();
RDebugUtils.currentLine=35389445;
 //BA.debugLineNum = 35389445;BA.debugLine="Public Tag As Object";
_tag = new Object();
RDebugUtils.currentLine=35389446;
 //BA.debugLineNum = 35389446;BA.debugLine="Private iv As B4XView";
_iv = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=35389447;
 //BA.debugLineNum = 35389447;BA.debugLine="Private mResizeMode As String";
_mresizemode = "";
RDebugUtils.currentLine=35389448;
 //BA.debugLineNum = 35389448;BA.debugLine="Private mRound As Boolean";
_mround = false;
RDebugUtils.currentLine=35389449;
 //BA.debugLineNum = 35389449;BA.debugLine="Private mBitmap As B4XBitmap";
_mbitmap = new anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper();
RDebugUtils.currentLine=35389450;
 //BA.debugLineNum = 35389450;BA.debugLine="Public mBackgroundColor As Int";
_mbackgroundcolor = 0;
RDebugUtils.currentLine=35389451;
 //BA.debugLineNum = 35389451;BA.debugLine="Private mCornersRadius As Int";
_mcornersradius = 0;
RDebugUtils.currentLine=35389452;
 //BA.debugLineNum = 35389452;BA.debugLine="End Sub";
return "";
}
public String  _clear(b4a.example.b4ximageview __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4ximageview";
if (Debug.shouldDelegate(ba, "clear", true))
	 {return ((String) Debug.delegate(ba, "clear", null));}
RDebugUtils.currentLine=36175872;
 //BA.debugLineNum = 36175872;BA.debugLine="Public Sub Clear";
RDebugUtils.currentLine=36175873;
 //BA.debugLineNum = 36175873;BA.debugLine="mBitmap = Null";
__ref._mbitmap /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper*/  = (anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper(), (android.graphics.Bitmap)(__c.Null));
RDebugUtils.currentLine=36175874;
 //BA.debugLineNum = 36175874;BA.debugLine="iv.SetBitmap(Null)";
__ref._iv /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .SetBitmap((android.graphics.Bitmap)(__c.Null));
RDebugUtils.currentLine=36175875;
 //BA.debugLineNum = 36175875;BA.debugLine="End Sub";
return "";
}
public String  _designercreateview(b4a.example.b4ximageview __ref,Object _base,anywheresoftware.b4a.objects.LabelWrapper _lbl,anywheresoftware.b4a.objects.collections.Map _props) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4ximageview";
if (Debug.shouldDelegate(ba, "designercreateview", true))
	 {return ((String) Debug.delegate(ba, "designercreateview", new Object[] {_base,_lbl,_props}));}
anywheresoftware.b4a.objects.ImageViewWrapper _iiv = null;
RDebugUtils.currentLine=35520512;
 //BA.debugLineNum = 35520512;BA.debugLine="Public Sub DesignerCreateView (Base As Object, Lbl";
RDebugUtils.currentLine=35520513;
 //BA.debugLineNum = 35520513;BA.debugLine="mBase = Base";
__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_base));
RDebugUtils.currentLine=35520514;
 //BA.debugLineNum = 35520514;BA.debugLine="Tag = mBase.Tag";
__ref._tag /*Object*/  = __ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getTag();
RDebugUtils.currentLine=35520515;
 //BA.debugLineNum = 35520515;BA.debugLine="mBase.Tag = Me";
__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setTag(this);
RDebugUtils.currentLine=35520516;
 //BA.debugLineNum = 35520516;BA.debugLine="Dim iiv As ImageView";
_iiv = new anywheresoftware.b4a.objects.ImageViewWrapper();
RDebugUtils.currentLine=35520517;
 //BA.debugLineNum = 35520517;BA.debugLine="iiv.Initialize(\"\")";
_iiv.Initialize(ba,"");
RDebugUtils.currentLine=35520518;
 //BA.debugLineNum = 35520518;BA.debugLine="iv = iiv";
__ref._iv /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_iiv.getObject()));
RDebugUtils.currentLine=35520519;
 //BA.debugLineNum = 35520519;BA.debugLine="mRound =Props.Get(\"Round\")";
__ref._mround /*boolean*/  = BA.ObjectToBoolean(_props.Get((Object)("Round")));
RDebugUtils.currentLine=35520520;
 //BA.debugLineNum = 35520520;BA.debugLine="mResizeMode = Props.Get(\"ResizeMode\")";
__ref._mresizemode /*String*/  = BA.ObjectToString(_props.Get((Object)("ResizeMode")));
RDebugUtils.currentLine=35520521;
 //BA.debugLineNum = 35520521;BA.debugLine="mBackgroundColor = xui.PaintOrColorToColor(Props.";
__ref._mbackgroundcolor /*int*/  = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .PaintOrColorToColor(_props.Get((Object)("BackgroundColor")));
RDebugUtils.currentLine=35520522;
 //BA.debugLineNum = 35520522;BA.debugLine="mCornersRadius = DipToCurrent(Props.GetDefault(\"C";
__ref._mcornersradius /*int*/  = __c.DipToCurrent((int)(BA.ObjectToNumber(_props.GetDefault((Object)("CornersRadius"),(Object)(0)))));
RDebugUtils.currentLine=35520523;
 //BA.debugLineNum = 35520523;BA.debugLine="mBase.AddView(iv, 0, 0, mBase.Width, mBase.Height";
__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .AddView((android.view.View)(__ref._iv /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getObject()),(int) (0),(int) (0),__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth(),__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight());
RDebugUtils.currentLine=35520524;
 //BA.debugLineNum = 35520524;BA.debugLine="Update";
__ref._update /*String*/ (null);
RDebugUtils.currentLine=35520525;
 //BA.debugLineNum = 35520525;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper  _getbitmap(b4a.example.b4ximageview __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4ximageview";
if (Debug.shouldDelegate(ba, "getbitmap", true))
	 {return ((anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper) Debug.delegate(ba, "getbitmap", null));}
RDebugUtils.currentLine=36306944;
 //BA.debugLineNum = 36306944;BA.debugLine="Public Sub getBitmap As B4XBitmap";
RDebugUtils.currentLine=36306945;
 //BA.debugLineNum = 36306945;BA.debugLine="Return mBitmap";
if (true) return __ref._mbitmap /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper*/ ;
RDebugUtils.currentLine=36306946;
 //BA.debugLineNum = 36306946;BA.debugLine="End Sub";
return null;
}
public int  _getcornersradius(b4a.example.b4ximageview __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4ximageview";
if (Debug.shouldDelegate(ba, "getcornersradius", true))
	 {return ((Integer) Debug.delegate(ba, "getcornersradius", null));}
RDebugUtils.currentLine=35782656;
 //BA.debugLineNum = 35782656;BA.debugLine="Public Sub getCornersRadius As Int";
RDebugUtils.currentLine=35782657;
 //BA.debugLineNum = 35782657;BA.debugLine="Return mCornersRadius";
if (true) return __ref._mcornersradius /*int*/ ;
RDebugUtils.currentLine=35782658;
 //BA.debugLineNum = 35782658;BA.debugLine="End Sub";
return 0;
}
public String  _getresizemode(b4a.example.b4ximageview __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4ximageview";
if (Debug.shouldDelegate(ba, "getresizemode", true))
	 {return ((String) Debug.delegate(ba, "getresizemode", null));}
RDebugUtils.currentLine=35913728;
 //BA.debugLineNum = 35913728;BA.debugLine="Public Sub getResizeMode As String";
RDebugUtils.currentLine=35913729;
 //BA.debugLineNum = 35913729;BA.debugLine="Return mResizeMode";
if (true) return __ref._mresizemode /*String*/ ;
RDebugUtils.currentLine=35913730;
 //BA.debugLineNum = 35913730;BA.debugLine="End Sub";
return "";
}
public boolean  _getroundedimage(b4a.example.b4ximageview __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4ximageview";
if (Debug.shouldDelegate(ba, "getroundedimage", true))
	 {return ((Boolean) Debug.delegate(ba, "getroundedimage", null));}
RDebugUtils.currentLine=35651584;
 //BA.debugLineNum = 35651584;BA.debugLine="Public Sub getRoundedImage As Boolean";
RDebugUtils.currentLine=35651585;
 //BA.debugLineNum = 35651585;BA.debugLine="Return mRound";
if (true) return __ref._mround /*boolean*/ ;
RDebugUtils.currentLine=35651586;
 //BA.debugLineNum = 35651586;BA.debugLine="End Sub";
return false;
}
public String  _initialize(b4a.example.b4ximageview __ref,anywheresoftware.b4a.BA _ba,Object _callback,String _eventname) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="b4ximageview";
if (Debug.shouldDelegate(ba, "initialize", true))
	 {return ((String) Debug.delegate(ba, "initialize", new Object[] {_ba,_callback,_eventname}));}
RDebugUtils.currentLine=35454976;
 //BA.debugLineNum = 35454976;BA.debugLine="Public Sub Initialize (Callback As Object, EventNa";
RDebugUtils.currentLine=35454977;
 //BA.debugLineNum = 35454977;BA.debugLine="mEventName = EventName";
__ref._meventname /*String*/  = _eventname;
RDebugUtils.currentLine=35454978;
 //BA.debugLineNum = 35454978;BA.debugLine="mCallBack = Callback";
__ref._mcallback /*Object*/  = _callback;
RDebugUtils.currentLine=35454979;
 //BA.debugLineNum = 35454979;BA.debugLine="End Sub";
return "";
}
public String  _load(b4a.example.b4ximageview __ref,String _dir,String _filename) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4ximageview";
if (Debug.shouldDelegate(ba, "load", true))
	 {return ((String) Debug.delegate(ba, "load", new Object[] {_dir,_filename}));}
RDebugUtils.currentLine=36110336;
 //BA.debugLineNum = 36110336;BA.debugLine="Public Sub Load (Dir As String, FileName As String";
RDebugUtils.currentLine=36110338;
 //BA.debugLineNum = 36110338;BA.debugLine="setBitmap(LoadBitmapSample(Dir, FileName, mBase.W";
__ref._setbitmap /*String*/ (null,(anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper(), (android.graphics.Bitmap)(__c.LoadBitmapSample(_dir,_filename,__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth(),__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight()).getObject())));
RDebugUtils.currentLine=36110342;
 //BA.debugLineNum = 36110342;BA.debugLine="End Sub";
return "";
}
public String  _setbitmap(b4a.example.b4ximageview __ref,anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper _bmp) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4ximageview";
if (Debug.shouldDelegate(ba, "setbitmap", true))
	 {return ((String) Debug.delegate(ba, "setbitmap", new Object[] {_bmp}));}
RDebugUtils.currentLine=36241408;
 //BA.debugLineNum = 36241408;BA.debugLine="Public Sub setBitmap(Bmp As B4XBitmap)";
RDebugUtils.currentLine=36241409;
 //BA.debugLineNum = 36241409;BA.debugLine="mBitmap = Bmp";
__ref._mbitmap /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper*/  = _bmp;
RDebugUtils.currentLine=36241410;
 //BA.debugLineNum = 36241410;BA.debugLine="XUIViewsUtils.SetBitmapAndFill(iv, Bmp)";
_xuiviewsutils._setbitmapandfill /*String*/ (ba,__ref._iv /*anywheresoftware.b4a.objects.B4XViewWrapper*/ ,_bmp);
RDebugUtils.currentLine=36241411;
 //BA.debugLineNum = 36241411;BA.debugLine="Update";
__ref._update /*String*/ (null);
RDebugUtils.currentLine=36241412;
 //BA.debugLineNum = 36241412;BA.debugLine="End Sub";
return "";
}
public String  _setcornersradius(b4a.example.b4ximageview __ref,int _i) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4ximageview";
if (Debug.shouldDelegate(ba, "setcornersradius", true))
	 {return ((String) Debug.delegate(ba, "setcornersradius", new Object[] {_i}));}
RDebugUtils.currentLine=35848192;
 //BA.debugLineNum = 35848192;BA.debugLine="Public Sub setCornersRadius (i As Int)";
RDebugUtils.currentLine=35848193;
 //BA.debugLineNum = 35848193;BA.debugLine="mCornersRadius = i";
__ref._mcornersradius /*int*/  = _i;
RDebugUtils.currentLine=35848194;
 //BA.debugLineNum = 35848194;BA.debugLine="UpdateClip";
__ref._updateclip /*String*/ (null);
RDebugUtils.currentLine=35848195;
 //BA.debugLineNum = 35848195;BA.debugLine="End Sub";
return "";
}
public String  _updateclip(b4a.example.b4ximageview __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4ximageview";
if (Debug.shouldDelegate(ba, "updateclip", true))
	 {return ((String) Debug.delegate(ba, "updateclip", null));}
anywheresoftware.b4j.object.JavaObject _jo = null;
RDebugUtils.currentLine=36372480;
 //BA.debugLineNum = 36372480;BA.debugLine="Private Sub UpdateClip";
RDebugUtils.currentLine=36372481;
 //BA.debugLineNum = 36372481;BA.debugLine="If mRound Then";
if (__ref._mround /*boolean*/ ) { 
RDebugUtils.currentLine=36372482;
 //BA.debugLineNum = 36372482;BA.debugLine="mBase.SetColorAndBorder(mBackgroundColor, 0, 0,";
__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .SetColorAndBorder(__ref._mbackgroundcolor /*int*/ ,(int) (0),(int) (0),(int) (__c.Min(__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth()/(double)2,__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight()/(double)2)));
 }else {
RDebugUtils.currentLine=36372484;
 //BA.debugLineNum = 36372484;BA.debugLine="mBase.SetColorAndBorder(mBackgroundColor, 0, 0,";
__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .SetColorAndBorder(__ref._mbackgroundcolor /*int*/ ,(int) (0),(int) (0),__ref._mcornersradius /*int*/ );
 };
RDebugUtils.currentLine=36372506;
 //BA.debugLineNum = 36372506;BA.debugLine="Dim jo As JavaObject = mBase";
_jo = new anywheresoftware.b4j.object.JavaObject();
_jo = (anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getObject()));
RDebugUtils.currentLine=36372507;
 //BA.debugLineNum = 36372507;BA.debugLine="jo.RunMethod(\"setClipToOutline\", Array(mRound Or";
_jo.RunMethod("setClipToOutline",new Object[]{(Object)(__ref._mround /*boolean*/  || __ref._mcornersradius /*int*/ >0)});
RDebugUtils.currentLine=36372509;
 //BA.debugLineNum = 36372509;BA.debugLine="End Sub";
return "";
}
public String  _setresizemode(b4a.example.b4ximageview __ref,String _s) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4ximageview";
if (Debug.shouldDelegate(ba, "setresizemode", true))
	 {return ((String) Debug.delegate(ba, "setresizemode", new Object[] {_s}));}
RDebugUtils.currentLine=35979264;
 //BA.debugLineNum = 35979264;BA.debugLine="Public Sub setResizeMode(s As String)";
RDebugUtils.currentLine=35979265;
 //BA.debugLineNum = 35979265;BA.debugLine="If s = mResizeMode Then Return";
if ((_s).equals(__ref._mresizemode /*String*/ )) { 
if (true) return "";};
RDebugUtils.currentLine=35979266;
 //BA.debugLineNum = 35979266;BA.debugLine="mResizeMode = s";
__ref._mresizemode /*String*/  = _s;
RDebugUtils.currentLine=35979267;
 //BA.debugLineNum = 35979267;BA.debugLine="Update";
__ref._update /*String*/ (null);
RDebugUtils.currentLine=35979268;
 //BA.debugLineNum = 35979268;BA.debugLine="End Sub";
return "";
}
public String  _setroundedimage(b4a.example.b4ximageview __ref,boolean _b) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4ximageview";
if (Debug.shouldDelegate(ba, "setroundedimage", true))
	 {return ((String) Debug.delegate(ba, "setroundedimage", new Object[] {_b}));}
RDebugUtils.currentLine=35717120;
 //BA.debugLineNum = 35717120;BA.debugLine="Public Sub setRoundedImage (b As Boolean)";
RDebugUtils.currentLine=35717121;
 //BA.debugLineNum = 35717121;BA.debugLine="If b = mRound Then Return";
if (_b==__ref._mround /*boolean*/ ) { 
if (true) return "";};
RDebugUtils.currentLine=35717122;
 //BA.debugLineNum = 35717122;BA.debugLine="mRound = b";
__ref._mround /*boolean*/  = _b;
RDebugUtils.currentLine=35717123;
 //BA.debugLineNum = 35717123;BA.debugLine="UpdateClip";
__ref._updateclip /*String*/ (null);
RDebugUtils.currentLine=35717124;
 //BA.debugLineNum = 35717124;BA.debugLine="End Sub";
return "";
}
}