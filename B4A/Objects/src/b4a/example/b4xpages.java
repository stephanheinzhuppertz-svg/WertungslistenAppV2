package b4a.example;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.debug.*;

public class b4xpages {
private static b4xpages mostCurrent = new b4xpages();
public static Object getObject() {
    throw new RuntimeException("Code module does not support this method.");
}
 
public anywheresoftware.b4a.keywords.Common __c = null;
public static Object _mpm = null;
public static b4a.example.b4xpagesdelegator _delegate = null;
public static Object _globalcontext = null;
public static boolean _handleinsets = false;
public b4a.example.dateutils _dateutils = null;
public b4a.example.main _main = null;
public b4a.example.b4xcollections _b4xcollections = null;
public b4a.example.httputils2service _httputils2service = null;
public b4a.example.xuiviewsutils _xuiviewsutils = null;
public static String  _settitle(anywheresoftware.b4a.BA _ba,Object _b4xpage,Object _title) throws Exception{
RDebugUtils.currentModule="b4xpages";
if (Debug.shouldDelegate(null, "settitle", true))
	 {return ((String) Debug.delegate(null, "settitle", new Object[] {_ba,_b4xpage,_title}));}
RDebugUtils.currentLine=12713984;
 //BA.debugLineNum = 12713984;BA.debugLine="Public Sub SetTitle (B4XPage As Object, Title As O";
RDebugUtils.currentLine=12713985;
 //BA.debugLineNum = 12713985;BA.debugLine="GetManager.SetTitle(B4XPage, Title)";
_getmanager(_ba)._settitle /*String*/ (null,_b4xpage,_title);
RDebugUtils.currentLine=12713986;
 //BA.debugLineNum = 12713986;BA.debugLine="End Sub";
return "";
}
public static String  _addpage(anywheresoftware.b4a.BA _ba,String _id,Object _b4xpage) throws Exception{
RDebugUtils.currentModule="b4xpages";
if (Debug.shouldDelegate(null, "addpage", true))
	 {return ((String) Debug.delegate(null, "addpage", new Object[] {_ba,_id,_b4xpage}));}
RDebugUtils.currentLine=12386304;
 //BA.debugLineNum = 12386304;BA.debugLine="Public Sub AddPage (Id As String, B4XPage As Objec";
RDebugUtils.currentLine=12386305;
 //BA.debugLineNum = 12386305;BA.debugLine="GetManager.AddPage(Id, B4XPage)";
_getmanager(_ba)._addpage /*String*/ (null,_id,_b4xpage);
RDebugUtils.currentLine=12386306;
 //BA.debugLineNum = 12386306;BA.debugLine="End Sub";
return "";
}
public static String  _showpage(anywheresoftware.b4a.BA _ba,String _id) throws Exception{
RDebugUtils.currentModule="b4xpages";
if (Debug.shouldDelegate(null, "showpage", true))
	 {return ((String) Debug.delegate(null, "showpage", new Object[] {_ba,_id}));}
RDebugUtils.currentLine=12517376;
 //BA.debugLineNum = 12517376;BA.debugLine="Public Sub ShowPage (Id As String)";
RDebugUtils.currentLine=12517377;
 //BA.debugLineNum = 12517377;BA.debugLine="GetManager.ShowPage(Id)";
_getmanager(_ba)._showpage /*String*/ (null,_id);
RDebugUtils.currentLine=12517378;
 //BA.debugLineNum = 12517378;BA.debugLine="End Sub";
return "";
}
public static anywheresoftware.b4a.objects.ActivityWrapper  _getnativeparent(anywheresoftware.b4a.BA _ba,Object _b4xpage) throws Exception{
RDebugUtils.currentModule="b4xpages";
if (Debug.shouldDelegate(null, "getnativeparent", true))
	 {return ((anywheresoftware.b4a.objects.ActivityWrapper) Debug.delegate(null, "getnativeparent", new Object[] {_ba,_b4xpage}));}
RDebugUtils.currentLine=12845056;
 //BA.debugLineNum = 12845056;BA.debugLine="Public Sub GetNativeParent (B4XPage As Object) As";
RDebugUtils.currentLine=12845064;
 //BA.debugLineNum = 12845064;BA.debugLine="Return GetManager.FindPIFromB4XPage(B4XPage).Pare";
if (true) return _getmanager(_ba)._findpifromb4xpage /*b4a.example.b4xpagesmanager._b4xpageinfo*/ (null,_b4xpage).Parent /*b4a.example.b4xpagesmanager._b4xpageparent*/ .NativeType /*anywheresoftware.b4a.objects.ActivityWrapper*/ ;
RDebugUtils.currentLine=12845065;
 //BA.debugLineNum = 12845065;BA.debugLine="End Sub";
return null;
}
public static b4a.example.b4xmainpage  _mainpage(anywheresoftware.b4a.BA _ba) throws Exception{
RDebugUtils.currentModule="b4xpages";
if (Debug.shouldDelegate(null, "mainpage", true))
	 {return ((b4a.example.b4xmainpage) Debug.delegate(null, "mainpage", new Object[] {_ba}));}
RDebugUtils.currentLine=12779520;
 //BA.debugLineNum = 12779520;BA.debugLine="Public Sub MainPage As B4XMainPage";
RDebugUtils.currentLine=12779521;
 //BA.debugLineNum = 12779521;BA.debugLine="Return GetManager.MainPage";
if (true) return _getmanager(_ba)._mainpage /*b4a.example.b4xmainpage*/ ;
RDebugUtils.currentLine=12779522;
 //BA.debugLineNum = 12779522;BA.debugLine="End Sub";
return null;
}
public static String  _closepage(anywheresoftware.b4a.BA _ba,Object _b4xpage) throws Exception{
RDebugUtils.currentModule="b4xpages";
if (Debug.shouldDelegate(null, "closepage", true))
	 {return ((String) Debug.delegate(null, "closepage", new Object[] {_ba,_b4xpage}));}
RDebugUtils.currentLine=12648448;
 //BA.debugLineNum = 12648448;BA.debugLine="Public Sub ClosePage (B4XPage As Object)";
RDebugUtils.currentLine=12648449;
 //BA.debugLineNum = 12648449;BA.debugLine="GetManager.ClosePage (B4XPage)";
_getmanager(_ba)._closepage /*String*/ (null,_b4xpage);
RDebugUtils.currentLine=12648450;
 //BA.debugLineNum = 12648450;BA.debugLine="End Sub";
return "";
}
public static b4a.example.b4xpagesmanager._b4amenuitem  _addmenuitem(anywheresoftware.b4a.BA _ba,Object _b4xpage,Object _title) throws Exception{
RDebugUtils.currentModule="b4xpages";
if (Debug.shouldDelegate(null, "addmenuitem", true))
	 {return ((b4a.example.b4xpagesmanager._b4amenuitem) Debug.delegate(null, "addmenuitem", new Object[] {_ba,_b4xpage,_title}));}
RDebugUtils.currentLine=12910592;
 //BA.debugLineNum = 12910592;BA.debugLine="Public Sub AddMenuItem(B4XPage As Object, Title As";
RDebugUtils.currentLine=12910593;
 //BA.debugLineNum = 12910593;BA.debugLine="Return GetManager.AddMenuItem(B4XPage, Title)";
if (true) return _getmanager(_ba)._addmenuitem /*b4a.example.b4xpagesmanager._b4amenuitem*/ (null,_b4xpage,_title);
RDebugUtils.currentLine=12910594;
 //BA.debugLineNum = 12910594;BA.debugLine="End Sub";
return null;
}
public static b4a.example.b4xpagesmanager  _getmanager(anywheresoftware.b4a.BA _ba) throws Exception{
RDebugUtils.currentModule="b4xpages";
if (Debug.shouldDelegate(null, "getmanager", true))
	 {return ((b4a.example.b4xpagesmanager) Debug.delegate(null, "getmanager", new Object[] {_ba}));}
RDebugUtils.currentLine=12124160;
 //BA.debugLineNum = 12124160;BA.debugLine="Public Sub GetManager As B4XPagesManager";
RDebugUtils.currentLine=12124161;
 //BA.debugLineNum = 12124161;BA.debugLine="Return mPM";
if (true) return (b4a.example.b4xpagesmanager)(_mpm);
RDebugUtils.currentLine=12124162;
 //BA.debugLineNum = 12124162;BA.debugLine="End Sub";
return null;
}
public static String  _addpageandcreate(anywheresoftware.b4a.BA _ba,String _id,Object _b4xpage) throws Exception{
RDebugUtils.currentModule="b4xpages";
if (Debug.shouldDelegate(null, "addpageandcreate", true))
	 {return ((String) Debug.delegate(null, "addpageandcreate", new Object[] {_ba,_id,_b4xpage}));}
RDebugUtils.currentLine=12451840;
 //BA.debugLineNum = 12451840;BA.debugLine="Public Sub AddPageAndCreate (Id As String, B4XPage";
RDebugUtils.currentLine=12451841;
 //BA.debugLineNum = 12451841;BA.debugLine="GetManager.AddPageAndCreate(Id, B4XPage)";
_getmanager(_ba)._addpageandcreate /*String*/ (null,_id,_b4xpage);
RDebugUtils.currentLine=12451842;
 //BA.debugLineNum = 12451842;BA.debugLine="End Sub";
return "";
}
public static Object  _getpage(anywheresoftware.b4a.BA _ba,String _id) throws Exception{
RDebugUtils.currentModule="b4xpages";
if (Debug.shouldDelegate(null, "getpage", true))
	 {return ((Object) Debug.delegate(null, "getpage", new Object[] {_ba,_id}));}
RDebugUtils.currentLine=12255232;
 //BA.debugLineNum = 12255232;BA.debugLine="Public Sub GetPage (Id As String) As Object";
RDebugUtils.currentLine=12255233;
 //BA.debugLineNum = 12255233;BA.debugLine="Return GetManager.GetPage(Id)";
if (true) return _getmanager(_ba)._getpage /*Object*/ (null,_id);
RDebugUtils.currentLine=12255234;
 //BA.debugLineNum = 12255234;BA.debugLine="End Sub";
return null;
}
public static String  _getpageid(anywheresoftware.b4a.BA _ba,Object _b4xpage) throws Exception{
RDebugUtils.currentModule="b4xpages";
if (Debug.shouldDelegate(null, "getpageid", true))
	 {return ((String) Debug.delegate(null, "getpageid", new Object[] {_ba,_b4xpage}));}
RDebugUtils.currentLine=12320768;
 //BA.debugLineNum = 12320768;BA.debugLine="Public Sub GetPageId (B4XPage As Object) As String";
RDebugUtils.currentLine=12320769;
 //BA.debugLineNum = 12320769;BA.debugLine="Return GetManager.FindPIFromB4XPage(B4XPage).Id";
if (true) return _getmanager(_ba)._findpifromb4xpage /*b4a.example.b4xpagesmanager._b4xpageinfo*/ (null,_b4xpage).Id /*String*/ ;
RDebugUtils.currentLine=12320770;
 //BA.debugLineNum = 12320770;BA.debugLine="End Sub";
return "";
}
public static String  _internalsetpagesmanager(anywheresoftware.b4a.BA _ba,Object _pm) throws Exception{
RDebugUtils.currentModule="b4xpages";
if (Debug.shouldDelegate(null, "internalsetpagesmanager", true))
	 {return ((String) Debug.delegate(null, "internalsetpagesmanager", new Object[] {_ba,_pm}));}
RDebugUtils.currentLine=12189696;
 //BA.debugLineNum = 12189696;BA.debugLine="Public Sub InternalSetPagesManager(PM As Object)";
RDebugUtils.currentLine=12189697;
 //BA.debugLineNum = 12189697;BA.debugLine="Delegate.Initialize";
_delegate._initialize /*String*/ (null,(_ba.processBA == null ? _ba : _ba.processBA));
RDebugUtils.currentLine=12189698;
 //BA.debugLineNum = 12189698;BA.debugLine="mPM = PM";
_mpm = _pm;
RDebugUtils.currentLine=12189699;
 //BA.debugLineNum = 12189699;BA.debugLine="End Sub";
return "";
}
public static boolean  _isinitialized(anywheresoftware.b4a.BA _ba) throws Exception{
RDebugUtils.currentModule="b4xpages";
if (Debug.shouldDelegate(null, "isinitialized", true))
	 {return ((Boolean) Debug.delegate(null, "isinitialized", new Object[] {_ba}));}
RDebugUtils.currentLine=12058624;
 //BA.debugLineNum = 12058624;BA.debugLine="Public Sub IsInitialized As Boolean";
RDebugUtils.currentLine=12058625;
 //BA.debugLineNum = 12058625;BA.debugLine="Return mPM Is B4XPagesManager";
if (true) return _mpm instanceof b4a.example.b4xpagesmanager;
RDebugUtils.currentLine=12058626;
 //BA.debugLineNum = 12058626;BA.debugLine="End Sub";
return false;
}
public static String  _showpageandremovepreviouspages(anywheresoftware.b4a.BA _ba,String _id) throws Exception{
RDebugUtils.currentModule="b4xpages";
if (Debug.shouldDelegate(null, "showpageandremovepreviouspages", true))
	 {return ((String) Debug.delegate(null, "showpageandremovepreviouspages", new Object[] {_ba,_id}));}
RDebugUtils.currentLine=12582912;
 //BA.debugLineNum = 12582912;BA.debugLine="Public Sub ShowPageAndRemovePreviousPages (Id As S";
RDebugUtils.currentLine=12582913;
 //BA.debugLineNum = 12582913;BA.debugLine="GetManager.ShowPageAndRemovePreviousPages (Id)";
_getmanager(_ba)._showpageandremovepreviouspages /*String*/ (null,_id);
RDebugUtils.currentLine=12582914;
 //BA.debugLineNum = 12582914;BA.debugLine="End Sub";
return "";
}
}