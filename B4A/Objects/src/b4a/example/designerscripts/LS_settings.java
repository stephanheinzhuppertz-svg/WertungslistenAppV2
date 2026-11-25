package b4a.example.designerscripts;
import anywheresoftware.b4a.objects.TextViewWrapper;
import anywheresoftware.b4a.objects.ImageViewWrapper;
import anywheresoftware.b4a.BA;


public class LS_settings{

public static void LS_general(anywheresoftware.b4a.BA ba, android.view.View parent, anywheresoftware.b4a.keywords.LayoutValues lv, java.util.Map props,
java.util.Map<String, anywheresoftware.b4a.keywords.LayoutBuilder.ViewWrapperAndAnchor> views, int width, int height, float scale) throws Exception {
anywheresoftware.b4a.keywords.LayoutBuilder.setScaleRate(0.3);
String _w="";
String _abstand="";
//BA.debugLineNum = 2;BA.debugLine="AutoScaleAll"[Settings/General script]
anywheresoftware.b4a.keywords.LayoutBuilder.scaleAll(views);
//BA.debugLineNum = 5;BA.debugLine="w = btnVerstgDelete.Width"[Settings/General script]
_w = (BA.NumberToString(views.get("btnverstgdelete").vw.getWidth()));
//BA.debugLineNum = 6;BA.debugLine="abstand = (100%x - (2 * w)) / 3"[Settings/General script]
_abstand = BA.NumberToString(((100d / 100 * width)-(2d*Double.parseDouble(_w)))/3d);
//BA.debugLineNum = 8;BA.debugLine="btnVerstgDelete.SetLeftAndRight(50%x - (abstand / 2) - w, 50%x - (abstand / 2))"[Settings/General script]
views.get("btnverstgdelete").vw.setLeft((int)((50d / 100 * width)-(Double.parseDouble(_abstand)/2d)-Double.parseDouble(_w)));
views.get("btnverstgdelete").vw.setWidth((int)((50d / 100 * width)-(Double.parseDouble(_abstand)/2d) - ((50d / 100 * width)-(Double.parseDouble(_abstand)/2d)-Double.parseDouble(_w))));
//BA.debugLineNum = 9;BA.debugLine="btnVerstgSpeichern.SetLeftAndRight(50%x + (abstand / 2), 50%x + (abstand / 2) + w)"[Settings/General script]
views.get("btnverstgspeichern").vw.setLeft((int)((50d / 100 * width)+(Double.parseDouble(_abstand)/2d)));
views.get("btnverstgspeichern").vw.setWidth((int)((50d / 100 * width)+(Double.parseDouble(_abstand)/2d)+Double.parseDouble(_w) - ((50d / 100 * width)+(Double.parseDouble(_abstand)/2d))));
//BA.debugLineNum = 11;BA.debugLine="btnTLNDelete.SetLeftAndRight(50%x - (abstand / 2) - w, 50%x - (abstand / 2))"[Settings/General script]
views.get("btntlndelete").vw.setLeft((int)((50d / 100 * width)-(Double.parseDouble(_abstand)/2d)-Double.parseDouble(_w)));
views.get("btntlndelete").vw.setWidth((int)((50d / 100 * width)-(Double.parseDouble(_abstand)/2d) - ((50d / 100 * width)-(Double.parseDouble(_abstand)/2d)-Double.parseDouble(_w))));
//BA.debugLineNum = 12;BA.debugLine="btnTLNSpeichern.SetLeftAndRight(50%x + (abstand / 2), 50%x + (abstand / 2) + w)"[Settings/General script]
views.get("btntlnspeichern").vw.setLeft((int)((50d / 100 * width)+(Double.parseDouble(_abstand)/2d)));
views.get("btntlnspeichern").vw.setWidth((int)((50d / 100 * width)+(Double.parseDouble(_abstand)/2d)+Double.parseDouble(_w) - ((50d / 100 * width)+(Double.parseDouble(_abstand)/2d))));

}
}