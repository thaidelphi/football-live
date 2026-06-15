package y4;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Color;
import android.graphics.Typeface;
import android.os.Build;
import android.text.Html;
import android.text.TextUtils;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.google.android.exoplayer2.ui.PlayerView;
/* compiled from: WaterMark.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class p {

    /* renamed from: a  reason: collision with root package name */
    private static TextView f33154a = null;

    /* renamed from: b  reason: collision with root package name */
    static String f33155b = "";

    public static int a(int i10) {
        return (int) (i10 * Resources.getSystem().getDisplayMetrics().density);
    }

    static int b(String str) {
        String replaceAll = str.replaceAll("\\s", "");
        if (replaceAll.startsWith("rgba(") && replaceAll.endsWith(")")) {
            String[] split = replaceAll.substring(5, replaceAll.length() - 1).split(",");
            if (split.length == 4) {
                try {
                    int parseInt = Integer.parseInt(split[0]);
                    int parseInt2 = Integer.parseInt(split[1]);
                    int parseInt3 = Integer.parseInt(split[2]);
                    float parseFloat = Float.parseFloat(split[3]);
                    if (parseInt >= 0 && parseInt <= 255 && parseInt2 >= 0 && parseInt2 <= 255 && parseInt3 >= 0 && parseInt3 <= 255 && 0.0f <= parseFloat && parseFloat <= 1.0f) {
                        return Color.argb((int) (parseFloat * 255.0f), parseInt, parseInt2, parseInt3);
                    }
                } catch (NumberFormatException unused) {
                }
            }
        }
        return Color.argb(173, 255, 255, 255);
    }

    public static void c(Context context, PlayerView playerView, String str, String str2, String str3, int i10) {
        String str4;
        RelativeLayout relativeLayout;
        int i11;
        if (!str3.contains("|") && !str3.contains(":")) {
            f33155b = "10:07:10:07|400|20:17:20:0|TR|rgba(0,0,0,1)";
        } else {
            f33155b = str3;
        }
        String[] split = f33155b.split("\\|")[0].split(":");
        Integer.parseInt(f33155b.split("\\|")[1]);
        String[] split2 = f33155b.split("\\|")[2].split(":");
        String str5 = f33155b.split("\\|")[3];
        String str6 = f33155b.split("\\|")[4];
        if (Build.VERSION.SDK_INT >= 26) {
            try {
                f33154a = new TextView(context);
            } catch (Exception unused) {
            }
        }
        if (Build.VERSION.SDK_INT < 26) {
            try {
                f33154a = new TextView(context);
            } catch (Exception unused2) {
            }
        }
        RelativeLayout relativeLayout2 = new RelativeLayout(context);
        f33154a.setMaxLines(1);
        f33154a.setTypeface(Typeface.defaultFromStyle(1));
        f33154a.setEllipsize(TextUtils.TruncateAt.MARQUEE);
        f33154a.setSingleLine(true);
        f33154a.setSelected(true);
        if (Build.VERSION.SDK_INT >= 17) {
            f33154a.setTextAlignment(4);
        }
        f33154a.setMarqueeRepeatLimit(-1);
        if (i10 == 1) {
            f33154a.setPadding(a(Integer.parseInt(split[0])), a(Integer.parseInt(split[1])), a(Integer.parseInt(split[2])), a(Integer.parseInt(split[3])));
            str4 = str5;
            relativeLayout = relativeLayout2;
        } else {
            str4 = str5;
            relativeLayout = relativeLayout2;
            f33154a.setPadding(a((int) (Integer.parseInt(split[0]) * 3.5d)), a((int) (Integer.parseInt(split[1]) * 1.5d)), a((int) (Integer.parseInt(split[2]) * 3.5d)), a((int) (Integer.parseInt(split[3]) * 1.5d)));
        }
        if (str.startsWith("<")) {
            f33154a.setText(Html.fromHtml(str));
        } else {
            f33154a.setText(str);
        }
        f33154a.setBackgroundColor(b(str6));
        f33154a.setTextColor(b(str2));
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        String str7 = str4;
        if (str7.equals("TR")) {
            layoutParams.addRule(11, f33154a.getId());
        }
        if (str7.equals("TL")) {
            i11 = 1;
            layoutParams.addRule(1, f33154a.getId());
        } else {
            i11 = 1;
        }
        if (i10 == i11) {
            layoutParams.setMargins(a(Integer.parseInt(split2[0])), a(Integer.parseInt(split2[i11])), a(Integer.parseInt(split2[2])), a(Integer.parseInt(split2[3])));
        } else {
            layoutParams.setMargins(a(Integer.parseInt(split2[0]) * 2), a((int) (Integer.parseInt(split2[1]) * 1.5d)), a(Integer.parseInt(split2[2]) * 2), a(Integer.parseInt(split2[3])));
        }
        RelativeLayout relativeLayout3 = relativeLayout;
        relativeLayout3.addView(f33154a, layoutParams);
        playerView.getSubtitleView().removeAllViews();
        playerView.getSubtitleView().addView(relativeLayout3);
    }
}
