package b4a.example.designerscripts;
import anywheresoftware.b4a.objects.TextViewWrapper;
import anywheresoftware.b4a.objects.ImageViewWrapper;
import anywheresoftware.b4a.BA;


public class LS_settings{

public static void LS_general(anywheresoftware.b4a.BA ba, android.view.View parent, anywheresoftware.b4a.keywords.LayoutValues lv, java.util.Map props,
java.util.Map<String, anywheresoftware.b4a.keywords.LayoutBuilder.ViewWrapperAndAnchor> views, int width, int height, float scale) throws Exception {
anywheresoftware.b4a.keywords.LayoutBuilder.setScaleRate(0.3);
//BA.debugLineNum = 5;BA.debugLine="pnlHeaderLinks.SetLeftAndRight(0, pnlHeaderRechts.Left - 5dip)"[Settings/General script]
views.get("pnlheaderlinks").vw.setLeft((int)(0d));
views.get("pnlheaderlinks").vw.setWidth((int)((views.get("pnlheaderrechts").vw.getLeft())-(5d * scale) - (0d)));

}
}