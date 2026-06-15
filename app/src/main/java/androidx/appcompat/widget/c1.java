package androidx.appcompat.widget;

import android.os.Build;
import android.view.View;
/* compiled from: TooltipCompat.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class c1 {
    public static void a(View view, CharSequence charSequence) {
        if (Build.VERSION.SDK_INT >= 26) {
            view.setTooltipText(charSequence);
        } else {
            d1.f(view, charSequence);
        }
    }
}
