package b4a.example;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.debug.*;

public class b4xcollections {
private static b4xcollections mostCurrent = new b4xcollections();
public static Object getObject() {
    throw new RuntimeException("Code module does not support this method.");
}
 
public anywheresoftware.b4a.keywords.Common __c = null;
public static anywheresoftware.b4a.objects.collections.Map _memptymap = null;
public static anywheresoftware.b4a.objects.collections.List _memptylist = null;
public b4a.example.dateutils _dateutils = null;
public b4a.example.main _main = null;
public b4a.example.b4xpages _b4xpages = null;
public b4a.example.httputils2service _httputils2service = null;
public b4a.example.xuiviewsutils _xuiviewsutils = null;
public static b4a.example.b4xbitset  _createbitset(anywheresoftware.b4a.BA _ba,int _size) throws Exception{
RDebugUtils.currentModule="b4xcollections";
if (Debug.shouldDelegate(null, "createbitset", true))
	 {return ((b4a.example.b4xbitset) Debug.delegate(null, "createbitset", new Object[] {_ba,_size}));}
b4a.example.b4xbitset _s = null;
RDebugUtils.currentLine=4128768;
 //BA.debugLineNum = 4128768;BA.debugLine="Public Sub CreateBitSet (Size As Int) As B4XBitSet";
RDebugUtils.currentLine=4128769;
 //BA.debugLineNum = 4128769;BA.debugLine="Dim s As B4XBitSet";
_s = new b4a.example.b4xbitset();
RDebugUtils.currentLine=4128770;
 //BA.debugLineNum = 4128770;BA.debugLine="s.Initialize(Size)";
_s._initialize /*String*/ (null,(_ba.processBA == null ? _ba : _ba.processBA),_size);
RDebugUtils.currentLine=4128771;
 //BA.debugLineNum = 4128771;BA.debugLine="Return s";
if (true) return _s;
RDebugUtils.currentLine=4128772;
 //BA.debugLineNum = 4128772;BA.debugLine="End Sub";
return null;
}
public static anywheresoftware.b4a.objects.collections.List  _createlist(anywheresoftware.b4a.BA _ba,anywheresoftware.b4a.objects.collections.List _items) throws Exception{
RDebugUtils.currentModule="b4xcollections";
if (Debug.shouldDelegate(null, "createlist", true))
	 {return ((anywheresoftware.b4a.objects.collections.List) Debug.delegate(null, "createlist", new Object[] {_ba,_items}));}
anywheresoftware.b4a.objects.collections.List _res = null;
RDebugUtils.currentLine=4456448;
 //BA.debugLineNum = 4456448;BA.debugLine="Public Sub CreateList (Items As List = Null) As Li";
RDebugUtils.currentLine=4456449;
 //BA.debugLineNum = 4456449;BA.debugLine="Dim res As List";
_res = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=4456450;
 //BA.debugLineNum = 4456450;BA.debugLine="res.Initialize";
_res.Initialize();
RDebugUtils.currentLine=4456451;
 //BA.debugLineNum = 4456451;BA.debugLine="If Initialized(Items) Then res.AddAll(Items)";
if (anywheresoftware.b4a.keywords.Common.Initialized((Object)(_items))) { 
_res.AddAll(_items);};
RDebugUtils.currentLine=4456452;
 //BA.debugLineNum = 4456452;BA.debugLine="Return res";
if (true) return _res;
RDebugUtils.currentLine=4456453;
 //BA.debugLineNum = 4456453;BA.debugLine="End Sub";
return null;
}
public static b4a.example.b4xorderedmap  _createorderedmap(anywheresoftware.b4a.BA _ba) throws Exception{
RDebugUtils.currentModule="b4xcollections";
if (Debug.shouldDelegate(null, "createorderedmap", true))
	 {return ((b4a.example.b4xorderedmap) Debug.delegate(null, "createorderedmap", new Object[] {_ba}));}
RDebugUtils.currentLine=3997696;
 //BA.debugLineNum = 3997696;BA.debugLine="Public Sub CreateOrderedMap As B4XOrderedMap";
RDebugUtils.currentLine=3997697;
 //BA.debugLineNum = 3997697;BA.debugLine="Return CreateOrderedMap2(Null, Null)";
if (true) return _createorderedmap2(_ba,(anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(anywheresoftware.b4a.keywords.Common.Null)),(anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(anywheresoftware.b4a.keywords.Common.Null)));
RDebugUtils.currentLine=3997698;
 //BA.debugLineNum = 3997698;BA.debugLine="End Sub";
return null;
}
public static b4a.example.b4xorderedmap  _createorderedmap2(anywheresoftware.b4a.BA _ba,anywheresoftware.b4a.objects.collections.List _keys,anywheresoftware.b4a.objects.collections.List _values) throws Exception{
RDebugUtils.currentModule="b4xcollections";
if (Debug.shouldDelegate(null, "createorderedmap2", true))
	 {return ((b4a.example.b4xorderedmap) Debug.delegate(null, "createorderedmap2", new Object[] {_ba,_keys,_values}));}
b4a.example.b4xorderedmap _m = null;
int _i = 0;
RDebugUtils.currentLine=4063232;
 //BA.debugLineNum = 4063232;BA.debugLine="Public Sub CreateOrderedMap2 (Keys As List, Values";
RDebugUtils.currentLine=4063233;
 //BA.debugLineNum = 4063233;BA.debugLine="Dim m As B4XOrderedMap";
_m = new b4a.example.b4xorderedmap();
RDebugUtils.currentLine=4063234;
 //BA.debugLineNum = 4063234;BA.debugLine="m.Initialize";
_m._initialize /*String*/ (null,(_ba.processBA == null ? _ba : _ba.processBA));
RDebugUtils.currentLine=4063235;
 //BA.debugLineNum = 4063235;BA.debugLine="If Keys <> Null And Values <> Null And Keys.IsIni";
if (_keys!= null && _values!= null && _keys.IsInitialized() && _values.IsInitialized()) { 
RDebugUtils.currentLine=4063236;
 //BA.debugLineNum = 4063236;BA.debugLine="For i = 0 To Keys.Size - 1";
{
final int step4 = 1;
final int limit4 = (int) (_keys.getSize()-1);
_i = (int) (0) ;
for (;_i <= limit4 ;_i = _i + step4 ) {
RDebugUtils.currentLine=4063237;
 //BA.debugLineNum = 4063237;BA.debugLine="m.Put(Keys.Get(i), Values.Get(i))";
_m._put /*String*/ (null,_keys.Get(_i),_values.Get(_i));
 }
};
 };
RDebugUtils.currentLine=4063240;
 //BA.debugLineNum = 4063240;BA.debugLine="Return m";
if (true) return _m;
RDebugUtils.currentLine=4063241;
 //BA.debugLineNum = 4063241;BA.debugLine="End Sub";
return null;
}
public static b4a.example.b4xset  _createset(anywheresoftware.b4a.BA _ba) throws Exception{
RDebugUtils.currentModule="b4xcollections";
if (Debug.shouldDelegate(null, "createset", true))
	 {return ((b4a.example.b4xset) Debug.delegate(null, "createset", new Object[] {_ba}));}
RDebugUtils.currentLine=3866624;
 //BA.debugLineNum = 3866624;BA.debugLine="Public Sub CreateSet As B4XSet";
RDebugUtils.currentLine=3866625;
 //BA.debugLineNum = 3866625;BA.debugLine="Return CreateSet2(Null)";
if (true) return _createset2(_ba,(anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(anywheresoftware.b4a.keywords.Common.Null)));
RDebugUtils.currentLine=3866626;
 //BA.debugLineNum = 3866626;BA.debugLine="End Sub";
return null;
}
public static b4a.example.b4xset  _createset2(anywheresoftware.b4a.BA _ba,anywheresoftware.b4a.objects.collections.List _values) throws Exception{
RDebugUtils.currentModule="b4xcollections";
if (Debug.shouldDelegate(null, "createset2", true))
	 {return ((b4a.example.b4xset) Debug.delegate(null, "createset2", new Object[] {_ba,_values}));}
b4a.example.b4xset _s = null;
Object _v = null;
RDebugUtils.currentLine=3932160;
 //BA.debugLineNum = 3932160;BA.debugLine="Public Sub CreateSet2 (Values As List) As B4XSet";
RDebugUtils.currentLine=3932161;
 //BA.debugLineNum = 3932161;BA.debugLine="Dim s As B4XSet";
_s = new b4a.example.b4xset();
RDebugUtils.currentLine=3932162;
 //BA.debugLineNum = 3932162;BA.debugLine="s.Initialize";
_s._initialize /*String*/ (null,(_ba.processBA == null ? _ba : _ba.processBA));
RDebugUtils.currentLine=3932163;
 //BA.debugLineNum = 3932163;BA.debugLine="If Values <> Null And Values.IsInitialized Then";
if (_values!= null && _values.IsInitialized()) { 
RDebugUtils.currentLine=3932164;
 //BA.debugLineNum = 3932164;BA.debugLine="For Each v As Object In Values";
{
final anywheresoftware.b4a.BA.IterableList group4 = _values;
final int groupLen4 = group4.getSize()
;int index4 = 0;
;
for (; index4 < groupLen4;index4++){
_v = group4.Get(index4);
RDebugUtils.currentLine=3932165;
 //BA.debugLineNum = 3932165;BA.debugLine="s.Add(v)";
_s._add /*String*/ (null,_v);
 }
};
 };
RDebugUtils.currentLine=3932168;
 //BA.debugLineNum = 3932168;BA.debugLine="Return s";
if (true) return _s;
RDebugUtils.currentLine=3932169;
 //BA.debugLineNum = 3932169;BA.debugLine="End Sub";
return null;
}
public static anywheresoftware.b4a.objects.collections.List  _getemptylist(anywheresoftware.b4a.BA _ba) throws Exception{
RDebugUtils.currentModule="b4xcollections";
if (Debug.shouldDelegate(null, "getemptylist", true))
	 {return ((anywheresoftware.b4a.objects.collections.List) Debug.delegate(null, "getemptylist", new Object[] {_ba}));}
RDebugUtils.currentLine=4259840;
 //BA.debugLineNum = 4259840;BA.debugLine="Public Sub GetEmptyList As List";
RDebugUtils.currentLine=4259841;
 //BA.debugLineNum = 4259841;BA.debugLine="If mEmptyList.IsInitialized = False Or mEmptyList";
if (_memptylist.IsInitialized()==anywheresoftware.b4a.keywords.Common.False || _memptylist.getSize()>0) { 
RDebugUtils.currentLine=4259842;
 //BA.debugLineNum = 4259842;BA.debugLine="Dim mEmptyList As List";
_memptylist = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=4259843;
 //BA.debugLineNum = 4259843;BA.debugLine="mEmptyList.Initialize";
_memptylist.Initialize();
 };
RDebugUtils.currentLine=4259845;
 //BA.debugLineNum = 4259845;BA.debugLine="Return mEmptyList";
if (true) return _memptylist;
RDebugUtils.currentLine=4259846;
 //BA.debugLineNum = 4259846;BA.debugLine="End Sub";
return null;
}
public static anywheresoftware.b4a.objects.collections.Map  _getemptymap(anywheresoftware.b4a.BA _ba) throws Exception{
RDebugUtils.currentModule="b4xcollections";
if (Debug.shouldDelegate(null, "getemptymap", true))
	 {return ((anywheresoftware.b4a.objects.collections.Map) Debug.delegate(null, "getemptymap", new Object[] {_ba}));}
RDebugUtils.currentLine=4194304;
 //BA.debugLineNum = 4194304;BA.debugLine="Public Sub GetEmptyMap As Map";
RDebugUtils.currentLine=4194305;
 //BA.debugLineNum = 4194305;BA.debugLine="If mEmptyMap.IsInitialized = False Or mEmptyMap.S";
if (_memptymap.IsInitialized()==anywheresoftware.b4a.keywords.Common.False || _memptymap.getSize()>0) { 
RDebugUtils.currentLine=4194306;
 //BA.debugLineNum = 4194306;BA.debugLine="Dim mEmptyMap As Map";
_memptymap = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=4194307;
 //BA.debugLineNum = 4194307;BA.debugLine="mEmptyMap.Initialize";
_memptymap.Initialize();
 };
RDebugUtils.currentLine=4194309;
 //BA.debugLineNum = 4194309;BA.debugLine="Return mEmptyMap";
if (true) return _memptymap;
RDebugUtils.currentLine=4194310;
 //BA.debugLineNum = 4194310;BA.debugLine="End Sub";
return null;
}
public static anywheresoftware.b4a.objects.collections.List  _mergelists(anywheresoftware.b4a.BA _ba,anywheresoftware.b4a.objects.collections.List _list1,anywheresoftware.b4a.objects.collections.List _list2) throws Exception{
RDebugUtils.currentModule="b4xcollections";
if (Debug.shouldDelegate(null, "mergelists", true))
	 {return ((anywheresoftware.b4a.objects.collections.List) Debug.delegate(null, "mergelists", new Object[] {_ba,_list1,_list2}));}
anywheresoftware.b4a.objects.collections.List _res = null;
RDebugUtils.currentLine=4390912;
 //BA.debugLineNum = 4390912;BA.debugLine="Public Sub MergeLists (List1 As List, List2 As Lis";
RDebugUtils.currentLine=4390913;
 //BA.debugLineNum = 4390913;BA.debugLine="Dim res As List";
_res = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=4390914;
 //BA.debugLineNum = 4390914;BA.debugLine="res.Initialize";
_res.Initialize();
RDebugUtils.currentLine=4390915;
 //BA.debugLineNum = 4390915;BA.debugLine="If Initialized(List1) Then res.AddAll(List1)";
if (anywheresoftware.b4a.keywords.Common.Initialized((Object)(_list1))) { 
_res.AddAll(_list1);};
RDebugUtils.currentLine=4390916;
 //BA.debugLineNum = 4390916;BA.debugLine="If Initialized(List2) Then res.AddAll(List2)";
if (anywheresoftware.b4a.keywords.Common.Initialized((Object)(_list2))) { 
_res.AddAll(_list2);};
RDebugUtils.currentLine=4390917;
 //BA.debugLineNum = 4390917;BA.debugLine="Return res";
if (true) return _res;
RDebugUtils.currentLine=4390918;
 //BA.debugLineNum = 4390918;BA.debugLine="End Sub";
return null;
}
public static anywheresoftware.b4a.objects.collections.Map  _mergemaps(anywheresoftware.b4a.BA _ba,anywheresoftware.b4a.objects.collections.Map _map1,anywheresoftware.b4a.objects.collections.Map _map2) throws Exception{
RDebugUtils.currentModule="b4xcollections";
if (Debug.shouldDelegate(null, "mergemaps", true))
	 {return ((anywheresoftware.b4a.objects.collections.Map) Debug.delegate(null, "mergemaps", new Object[] {_ba,_map1,_map2}));}
anywheresoftware.b4a.objects.collections.Map _res = null;
Object _key = null;
RDebugUtils.currentLine=4325376;
 //BA.debugLineNum = 4325376;BA.debugLine="Public Sub MergeMaps (Map1 As Map, Map2 As Map) As";
RDebugUtils.currentLine=4325377;
 //BA.debugLineNum = 4325377;BA.debugLine="Dim res As Map";
_res = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=4325378;
 //BA.debugLineNum = 4325378;BA.debugLine="res.Initialize";
_res.Initialize();
RDebugUtils.currentLine=4325379;
 //BA.debugLineNum = 4325379;BA.debugLine="If Initialized(Map1) Then";
if (anywheresoftware.b4a.keywords.Common.Initialized((Object)(_map1))) { 
RDebugUtils.currentLine=4325380;
 //BA.debugLineNum = 4325380;BA.debugLine="For Each key As Object In Map1.Keys";
{
final anywheresoftware.b4a.BA.IterableList group4 = _map1.Keys();
final int groupLen4 = group4.getSize()
;int index4 = 0;
;
for (; index4 < groupLen4;index4++){
_key = group4.Get(index4);
RDebugUtils.currentLine=4325381;
 //BA.debugLineNum = 4325381;BA.debugLine="res.Put(key, Map1.Get(key))";
_res.Put(_key,_map1.Get(_key));
 }
};
 };
RDebugUtils.currentLine=4325384;
 //BA.debugLineNum = 4325384;BA.debugLine="If Initialized(Map2) Then";
if (anywheresoftware.b4a.keywords.Common.Initialized((Object)(_map2))) { 
RDebugUtils.currentLine=4325385;
 //BA.debugLineNum = 4325385;BA.debugLine="For Each key As Object In Map2.Keys";
{
final anywheresoftware.b4a.BA.IterableList group9 = _map2.Keys();
final int groupLen9 = group9.getSize()
;int index9 = 0;
;
for (; index9 < groupLen9;index9++){
_key = group9.Get(index9);
RDebugUtils.currentLine=4325386;
 //BA.debugLineNum = 4325386;BA.debugLine="res.Put(key, Map2.Get(key))";
_res.Put(_key,_map2.Get(_key));
 }
};
 };
RDebugUtils.currentLine=4325389;
 //BA.debugLineNum = 4325389;BA.debugLine="Return res";
if (true) return _res;
RDebugUtils.currentLine=4325390;
 //BA.debugLineNum = 4325390;BA.debugLine="End Sub";
return null;
}
public static String  _shufflelist(anywheresoftware.b4a.BA _ba,anywheresoftware.b4a.objects.collections.List _items) throws Exception{
RDebugUtils.currentModule="b4xcollections";
if (Debug.shouldDelegate(null, "shufflelist", true))
	 {return ((String) Debug.delegate(null, "shufflelist", new Object[] {_ba,_items}));}
int _n = 0;
int _i = 0;
int _j = 0;
Object _o = null;
RDebugUtils.currentLine=4521984;
 //BA.debugLineNum = 4521984;BA.debugLine="Public Sub ShuffleList (Items As List)";
RDebugUtils.currentLine=4521985;
 //BA.debugLineNum = 4521985;BA.debugLine="Dim n As Int = Items.Size";
_n = _items.getSize();
RDebugUtils.currentLine=4521986;
 //BA.debugLineNum = 4521986;BA.debugLine="For i = 0 To n - 2";
{
final int step2 = 1;
final int limit2 = (int) (_n-2);
_i = (int) (0) ;
for (;_i <= limit2 ;_i = _i + step2 ) {
RDebugUtils.currentLine=4521987;
 //BA.debugLineNum = 4521987;BA.debugLine="Dim j As Int = Rnd(i, n)";
_j = anywheresoftware.b4a.keywords.Common.Rnd(_i,_n);
RDebugUtils.currentLine=4521988;
 //BA.debugLineNum = 4521988;BA.debugLine="Dim o As Object = Items.Get(i)";
_o = _items.Get(_i);
RDebugUtils.currentLine=4521989;
 //BA.debugLineNum = 4521989;BA.debugLine="Items.Set(i, Items.Get(j))";
_items.Set(_i,_items.Get(_j));
RDebugUtils.currentLine=4521990;
 //BA.debugLineNum = 4521990;BA.debugLine="Items.Set(j, o)";
_items.Set(_j,_o);
 }
};
RDebugUtils.currentLine=4521992;
 //BA.debugLineNum = 4521992;BA.debugLine="End Sub";
return "";
}
public static anywheresoftware.b4a.objects.collections.List  _sublist(anywheresoftware.b4a.BA _ba,anywheresoftware.b4a.objects.collections.List _items,int _startindex,int _endindex) throws Exception{
RDebugUtils.currentModule="b4xcollections";
if (Debug.shouldDelegate(null, "sublist", true))
	 {return ((anywheresoftware.b4a.objects.collections.List) Debug.delegate(null, "sublist", new Object[] {_ba,_items,_startindex,_endindex}));}
anywheresoftware.b4a.objects.collections.List _res = null;
int _i = 0;
RDebugUtils.currentLine=4587520;
 //BA.debugLineNum = 4587520;BA.debugLine="Public Sub SubList (Items As List, StartIndex As I";
RDebugUtils.currentLine=4587521;
 //BA.debugLineNum = 4587521;BA.debugLine="Dim res As List";
_res = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=4587522;
 //BA.debugLineNum = 4587522;BA.debugLine="res.Initialize";
_res.Initialize();
RDebugUtils.currentLine=4587523;
 //BA.debugLineNum = 4587523;BA.debugLine="For i = StartIndex To EndIndex - 1";
{
final int step3 = 1;
final int limit3 = (int) (_endindex-1);
_i = _startindex ;
for (;_i <= limit3 ;_i = _i + step3 ) {
RDebugUtils.currentLine=4587524;
 //BA.debugLineNum = 4587524;BA.debugLine="res.Add(Items.Get(i))";
_res.Add(_items.Get(_i));
 }
};
RDebugUtils.currentLine=4587526;
 //BA.debugLineNum = 4587526;BA.debugLine="Return res";
if (true) return _res;
RDebugUtils.currentLine=4587527;
 //BA.debugLineNum = 4587527;BA.debugLine="End Sub";
return null;
}
}