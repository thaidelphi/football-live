package androidx.core.view;

import android.os.Build;
import android.view.ViewGroup;
/* compiled from: ViewGroupCompat.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class d0 {

    /* compiled from: ViewGroupCompat.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    static class a {
        static int a(ViewGroup viewGroup) {
            return viewGroup.getNestedScrollAxes();
        }

        static boolean b(ViewGroup viewGroup) {
            return viewGroup.isTransitionGroup();
        }

        static void c(ViewGroup viewGroup, boolean z10) {
            viewGroup.setTransitionGroup(z10);
        }
    }

    public static boolean a(ViewGroup viewGroup) {
        if (Build.VERSION.SDK_INT >= 21) {
            return a.b(viewGroup);
        }
        Boolean bool = (Boolean) viewGroup.getTag(v.c.Q);
        return ((bool == null || !bool.booleanValue()) && viewGroup.getBackground() == null && a0.M(viewGroup) == null) ? false : true;
    }
}
