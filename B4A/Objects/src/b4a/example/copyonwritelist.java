package b4a.example;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.debug.*;

public class copyonwritelist extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    private static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new anywheresoftware.b4a.ShellBA(_ba, this, htSubs, "b4a.example.copyonwritelist");
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            
        }
        if (BA.isShellModeRuntimeCheck(ba)) 
			   this.getClass().getMethod("_class_globals", b4a.example.copyonwritelist.class).invoke(this, new Object[] {null});
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
public anywheresoftware.b4a.objects.collections.List _internallist = null;
public b4a.example.dateutils _dateutils = null;
public b4a.example.main _main = null;
public b4a.example.b4xpages _b4xpages = null;
public b4a.example.b4xcollections _b4xcollections = null;
public b4a.example.httputils2service _httputils2service = null;
public b4a.example.xuiviewsutils _xuiviewsutils = null;
public String  _add(b4a.example.copyonwritelist __ref,Object _item) throws Exception{
__ref = this;
RDebugUtils.currentModule="copyonwritelist";
if (Debug.shouldDelegate(ba, "add", true))
	 {return ((String) Debug.delegate(ba, "add", new Object[] {_item}));}
RDebugUtils.currentLine=18087936;
 //BA.debugLineNum = 18087936;BA.debugLine="Public Sub Add (Item As Object)";
RDebugUtils.currentLine=18087937;
 //BA.debugLineNum = 18087937;BA.debugLine="MakeCopy";
__ref._makecopy /*String*/ (null);
RDebugUtils.currentLine=18087938;
 //BA.debugLineNum = 18087938;BA.debugLine="InternalList.Add(Item)";
__ref._internallist /*anywheresoftware.b4a.objects.collections.List*/ .Add(_item);
RDebugUtils.currentLine=18087939;
 //BA.debugLineNum = 18087939;BA.debugLine="End Sub";
return "";
}
public String  _makecopy(b4a.example.copyonwritelist __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="copyonwritelist";
if (Debug.shouldDelegate(ba, "makecopy", true))
	 {return ((String) Debug.delegate(ba, "makecopy", null));}
RDebugUtils.currentLine=18022400;
 //BA.debugLineNum = 18022400;BA.debugLine="Private Sub MakeCopy";
RDebugUtils.currentLine=18022401;
 //BA.debugLineNum = 18022401;BA.debugLine="InternalList = B4XCollections.CreateList(Internal";
__ref._internallist /*anywheresoftware.b4a.objects.collections.List*/  = _b4xcollections._createlist /*anywheresoftware.b4a.objects.collections.List*/ (getActivityBA(),__ref._internallist /*anywheresoftware.b4a.objects.collections.List*/ );
RDebugUtils.currentLine=18022402;
 //BA.debugLineNum = 18022402;BA.debugLine="End Sub";
return "";
}
public String  _addall(b4a.example.copyonwritelist __ref,anywheresoftware.b4a.objects.collections.List _items) throws Exception{
__ref = this;
RDebugUtils.currentModule="copyonwritelist";
if (Debug.shouldDelegate(ba, "addall", true))
	 {return ((String) Debug.delegate(ba, "addall", new Object[] {_items}));}
RDebugUtils.currentLine=18546688;
 //BA.debugLineNum = 18546688;BA.debugLine="Public Sub AddAll (Items As List)";
RDebugUtils.currentLine=18546689;
 //BA.debugLineNum = 18546689;BA.debugLine="MakeCopy";
__ref._makecopy /*String*/ (null);
RDebugUtils.currentLine=18546690;
 //BA.debugLineNum = 18546690;BA.debugLine="InternalList.AddAll(Items)";
__ref._internallist /*anywheresoftware.b4a.objects.collections.List*/ .AddAll(_items);
RDebugUtils.currentLine=18546691;
 //BA.debugLineNum = 18546691;BA.debugLine="End Sub";
return "";
}
public String  _addallat(b4a.example.copyonwritelist __ref,int _index,anywheresoftware.b4a.objects.collections.List _items) throws Exception{
__ref = this;
RDebugUtils.currentModule="copyonwritelist";
if (Debug.shouldDelegate(ba, "addallat", true))
	 {return ((String) Debug.delegate(ba, "addallat", new Object[] {_index,_items}));}
RDebugUtils.currentLine=18612224;
 //BA.debugLineNum = 18612224;BA.debugLine="Public Sub AddAllAt (Index As Int, Items As List)";
RDebugUtils.currentLine=18612225;
 //BA.debugLineNum = 18612225;BA.debugLine="MakeCopy";
__ref._makecopy /*String*/ (null);
RDebugUtils.currentLine=18612226;
 //BA.debugLineNum = 18612226;BA.debugLine="InternalList.AddAllAt(Index, Items)";
__ref._internallist /*anywheresoftware.b4a.objects.collections.List*/ .AddAllAt(_index,_items);
RDebugUtils.currentLine=18612227;
 //BA.debugLineNum = 18612227;BA.debugLine="End Sub";
return "";
}
public String  _class_globals(b4a.example.copyonwritelist __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="copyonwritelist";
RDebugUtils.currentLine=17891328;
 //BA.debugLineNum = 17891328;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=17891329;
 //BA.debugLineNum = 17891329;BA.debugLine="Private InternalList As List";
_internallist = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=17891330;
 //BA.debugLineNum = 17891330;BA.debugLine="End Sub";
return "";
}
public String  _clear(b4a.example.copyonwritelist __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="copyonwritelist";
if (Debug.shouldDelegate(ba, "clear", true))
	 {return ((String) Debug.delegate(ba, "clear", null));}
RDebugUtils.currentLine=18219008;
 //BA.debugLineNum = 18219008;BA.debugLine="Public Sub Clear";
RDebugUtils.currentLine=18219009;
 //BA.debugLineNum = 18219009;BA.debugLine="Dim InternalList As List";
_internallist = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=18219010;
 //BA.debugLineNum = 18219010;BA.debugLine="InternalList.Initialize";
__ref._internallist /*anywheresoftware.b4a.objects.collections.List*/ .Initialize();
RDebugUtils.currentLine=18219011;
 //BA.debugLineNum = 18219011;BA.debugLine="End Sub";
return "";
}
public boolean  _get(b4a.example.copyonwritelist __ref,int _index) throws Exception{
__ref = this;
RDebugUtils.currentModule="copyonwritelist";
if (Debug.shouldDelegate(ba, "get", true))
	 {return ((Boolean) Debug.delegate(ba, "get", new Object[] {_index}));}
RDebugUtils.currentLine=18284544;
 //BA.debugLineNum = 18284544;BA.debugLine="Public Sub Get (Index As Int) As Boolean";
RDebugUtils.currentLine=18284545;
 //BA.debugLineNum = 18284545;BA.debugLine="Return InternalList.Get(Index)";
if (true) return BA.ObjectToBoolean(__ref._internallist /*anywheresoftware.b4a.objects.collections.List*/ .Get(_index));
RDebugUtils.currentLine=18284546;
 //BA.debugLineNum = 18284546;BA.debugLine="End Sub";
return false;
}
public anywheresoftware.b4a.objects.collections.List  _getlist(b4a.example.copyonwritelist __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="copyonwritelist";
if (Debug.shouldDelegate(ba, "getlist", true))
	 {return ((anywheresoftware.b4a.objects.collections.List) Debug.delegate(ba, "getlist", null));}
RDebugUtils.currentLine=19005440;
 //BA.debugLineNum = 19005440;BA.debugLine="Public Sub GetList As List";
RDebugUtils.currentLine=19005441;
 //BA.debugLineNum = 19005441;BA.debugLine="Return InternalList";
if (true) return __ref._internallist /*anywheresoftware.b4a.objects.collections.List*/ ;
RDebugUtils.currentLine=19005442;
 //BA.debugLineNum = 19005442;BA.debugLine="End Sub";
return null;
}
public int  _getsize(b4a.example.copyonwritelist __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="copyonwritelist";
if (Debug.shouldDelegate(ba, "getsize", true))
	 {return ((Integer) Debug.delegate(ba, "getsize", null));}
RDebugUtils.currentLine=18415616;
 //BA.debugLineNum = 18415616;BA.debugLine="Public Sub getSize As Int";
RDebugUtils.currentLine=18415617;
 //BA.debugLineNum = 18415617;BA.debugLine="Return InternalList.Size";
if (true) return __ref._internallist /*anywheresoftware.b4a.objects.collections.List*/ .getSize();
RDebugUtils.currentLine=18415618;
 //BA.debugLineNum = 18415618;BA.debugLine="End Sub";
return 0;
}
public int  _indexof(b4a.example.copyonwritelist __ref,Object _item) throws Exception{
__ref = this;
RDebugUtils.currentModule="copyonwritelist";
if (Debug.shouldDelegate(ba, "indexof", true))
	 {return ((Integer) Debug.delegate(ba, "indexof", new Object[] {_item}));}
RDebugUtils.currentLine=18677760;
 //BA.debugLineNum = 18677760;BA.debugLine="Public Sub IndexOf (Item As Object) As Int";
RDebugUtils.currentLine=18677761;
 //BA.debugLineNum = 18677761;BA.debugLine="Return InternalList.IndexOf(Item)";
if (true) return __ref._internallist /*anywheresoftware.b4a.objects.collections.List*/ .IndexOf(_item);
RDebugUtils.currentLine=18677762;
 //BA.debugLineNum = 18677762;BA.debugLine="End Sub";
return 0;
}
public String  _initialize(b4a.example.copyonwritelist __ref,anywheresoftware.b4a.BA _ba,anywheresoftware.b4a.objects.collections.List _initialitems) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="copyonwritelist";
if (Debug.shouldDelegate(ba, "initialize", true))
	 {return ((String) Debug.delegate(ba, "initialize", new Object[] {_ba,_initialitems}));}
RDebugUtils.currentLine=17956864;
 //BA.debugLineNum = 17956864;BA.debugLine="Public Sub Initialize (InitialItems As List)";
RDebugUtils.currentLine=17956865;
 //BA.debugLineNum = 17956865;BA.debugLine="InternalList = B4XCollections.CreateList(InitialI";
__ref._internallist /*anywheresoftware.b4a.objects.collections.List*/  = _b4xcollections._createlist /*anywheresoftware.b4a.objects.collections.List*/ (getActivityBA(),_initialitems);
RDebugUtils.currentLine=17956866;
 //BA.debugLineNum = 17956866;BA.debugLine="End Sub";
return "";
}
public String  _insertat(b4a.example.copyonwritelist __ref,int _index,Object _item) throws Exception{
__ref = this;
RDebugUtils.currentModule="copyonwritelist";
if (Debug.shouldDelegate(ba, "insertat", true))
	 {return ((String) Debug.delegate(ba, "insertat", new Object[] {_index,_item}));}
RDebugUtils.currentLine=18481152;
 //BA.debugLineNum = 18481152;BA.debugLine="Public Sub InsertAt (Index As Int, Item As Object)";
RDebugUtils.currentLine=18481153;
 //BA.debugLineNum = 18481153;BA.debugLine="MakeCopy";
__ref._makecopy /*String*/ (null);
RDebugUtils.currentLine=18481154;
 //BA.debugLineNum = 18481154;BA.debugLine="InternalList.InsertAt(Index, Item)";
__ref._internallist /*anywheresoftware.b4a.objects.collections.List*/ .InsertAt(_index,_item);
RDebugUtils.currentLine=18481155;
 //BA.debugLineNum = 18481155;BA.debugLine="End Sub";
return "";
}
public String  _removeat(b4a.example.copyonwritelist __ref,int _index) throws Exception{
__ref = this;
RDebugUtils.currentModule="copyonwritelist";
if (Debug.shouldDelegate(ba, "removeat", true))
	 {return ((String) Debug.delegate(ba, "removeat", new Object[] {_index}));}
RDebugUtils.currentLine=18153472;
 //BA.debugLineNum = 18153472;BA.debugLine="Public Sub RemoveAt (Index As Int)";
RDebugUtils.currentLine=18153473;
 //BA.debugLineNum = 18153473;BA.debugLine="MakeCopy";
__ref._makecopy /*String*/ (null);
RDebugUtils.currentLine=18153474;
 //BA.debugLineNum = 18153474;BA.debugLine="InternalList.RemoveAt(Index)";
__ref._internallist /*anywheresoftware.b4a.objects.collections.List*/ .RemoveAt(_index);
RDebugUtils.currentLine=18153475;
 //BA.debugLineNum = 18153475;BA.debugLine="End Sub";
return "";
}
public String  _set(b4a.example.copyonwritelist __ref,int _index,Object _item) throws Exception{
__ref = this;
RDebugUtils.currentModule="copyonwritelist";
if (Debug.shouldDelegate(ba, "set", true))
	 {return ((String) Debug.delegate(ba, "set", new Object[] {_index,_item}));}
RDebugUtils.currentLine=18350080;
 //BA.debugLineNum = 18350080;BA.debugLine="Public Sub Set (Index As Int, Item As Object)";
RDebugUtils.currentLine=18350081;
 //BA.debugLineNum = 18350081;BA.debugLine="MakeCopy";
__ref._makecopy /*String*/ (null);
RDebugUtils.currentLine=18350082;
 //BA.debugLineNum = 18350082;BA.debugLine="InternalList.Set(Index, Item)";
__ref._internallist /*anywheresoftware.b4a.objects.collections.List*/ .Set(_index,_item);
RDebugUtils.currentLine=18350083;
 //BA.debugLineNum = 18350083;BA.debugLine="End Sub";
return "";
}
public String  _sort(b4a.example.copyonwritelist __ref,boolean _ascending) throws Exception{
__ref = this;
RDebugUtils.currentModule="copyonwritelist";
if (Debug.shouldDelegate(ba, "sort", true))
	 {return ((String) Debug.delegate(ba, "sort", new Object[] {_ascending}));}
RDebugUtils.currentLine=18743296;
 //BA.debugLineNum = 18743296;BA.debugLine="Public Sub Sort (Ascending As Boolean)";
RDebugUtils.currentLine=18743297;
 //BA.debugLineNum = 18743297;BA.debugLine="MakeCopy";
__ref._makecopy /*String*/ (null);
RDebugUtils.currentLine=18743298;
 //BA.debugLineNum = 18743298;BA.debugLine="InternalList.Sort(Ascending)";
__ref._internallist /*anywheresoftware.b4a.objects.collections.List*/ .Sort(_ascending);
RDebugUtils.currentLine=18743299;
 //BA.debugLineNum = 18743299;BA.debugLine="End Sub";
return "";
}
public String  _sortcaseinsensitive(b4a.example.copyonwritelist __ref,boolean _ascending) throws Exception{
__ref = this;
RDebugUtils.currentModule="copyonwritelist";
if (Debug.shouldDelegate(ba, "sortcaseinsensitive", true))
	 {return ((String) Debug.delegate(ba, "sortcaseinsensitive", new Object[] {_ascending}));}
RDebugUtils.currentLine=18808832;
 //BA.debugLineNum = 18808832;BA.debugLine="Public Sub SortCaseInsensitive (Ascending As Boole";
RDebugUtils.currentLine=18808833;
 //BA.debugLineNum = 18808833;BA.debugLine="MakeCopy";
__ref._makecopy /*String*/ (null);
RDebugUtils.currentLine=18808834;
 //BA.debugLineNum = 18808834;BA.debugLine="InternalList.SortCaseInsensitive(Ascending)";
__ref._internallist /*anywheresoftware.b4a.objects.collections.List*/ .SortCaseInsensitive(_ascending);
RDebugUtils.currentLine=18808835;
 //BA.debugLineNum = 18808835;BA.debugLine="End Sub";
return "";
}
public String  _sorttype(b4a.example.copyonwritelist __ref,String _fieldname,boolean _ascending) throws Exception{
__ref = this;
RDebugUtils.currentModule="copyonwritelist";
if (Debug.shouldDelegate(ba, "sorttype", true))
	 {return ((String) Debug.delegate(ba, "sorttype", new Object[] {_fieldname,_ascending}));}
RDebugUtils.currentLine=18874368;
 //BA.debugLineNum = 18874368;BA.debugLine="Public Sub SortType (FieldName As String, Ascendin";
RDebugUtils.currentLine=18874369;
 //BA.debugLineNum = 18874369;BA.debugLine="MakeCopy";
__ref._makecopy /*String*/ (null);
RDebugUtils.currentLine=18874370;
 //BA.debugLineNum = 18874370;BA.debugLine="InternalList.SortType(FieldName, Ascending)";
__ref._internallist /*anywheresoftware.b4a.objects.collections.List*/ .SortType(_fieldname,_ascending);
RDebugUtils.currentLine=18874371;
 //BA.debugLineNum = 18874371;BA.debugLine="End Sub";
return "";
}
public String  _sorttypecaseinsensitive(b4a.example.copyonwritelist __ref,String _fieldname,boolean _ascending) throws Exception{
__ref = this;
RDebugUtils.currentModule="copyonwritelist";
if (Debug.shouldDelegate(ba, "sorttypecaseinsensitive", true))
	 {return ((String) Debug.delegate(ba, "sorttypecaseinsensitive", new Object[] {_fieldname,_ascending}));}
RDebugUtils.currentLine=18939904;
 //BA.debugLineNum = 18939904;BA.debugLine="Public Sub SortTypeCaseInsensitive (FieldName As S";
RDebugUtils.currentLine=18939905;
 //BA.debugLineNum = 18939905;BA.debugLine="MakeCopy";
__ref._makecopy /*String*/ (null);
RDebugUtils.currentLine=18939906;
 //BA.debugLineNum = 18939906;BA.debugLine="InternalList.SortTypeCaseInsensitive(FieldName, A";
__ref._internallist /*anywheresoftware.b4a.objects.collections.List*/ .SortTypeCaseInsensitive(_fieldname,_ascending);
RDebugUtils.currentLine=18939907;
 //BA.debugLineNum = 18939907;BA.debugLine="End Sub";
return "";
}
}