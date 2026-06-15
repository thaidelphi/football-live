package androidx.recyclerview.widget;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
/* compiled from: ScrollbarHelper.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
class l {
    /* JADX INFO: Access modifiers changed from: package-private */
    public static int a(RecyclerView.z zVar, i iVar, View view, View view2, RecyclerView.p pVar, boolean z10) {
        if (pVar.J() == 0 || zVar.b() == 0 || view == null || view2 == null) {
            return 0;
        }
        if (!z10) {
            return Math.abs(pVar.h0(view) - pVar.h0(view2)) + 1;
        }
        return Math.min(iVar.n(), iVar.d(view2) - iVar.g(view));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int b(RecyclerView.z zVar, i iVar, View view, View view2, RecyclerView.p pVar, boolean z10, boolean z11) {
        int max;
        if (pVar.J() == 0 || zVar.b() == 0 || view == null || view2 == null) {
            return 0;
        }
        int min = Math.min(pVar.h0(view), pVar.h0(view2));
        int max2 = Math.max(pVar.h0(view), pVar.h0(view2));
        if (z11) {
            max = Math.max(0, (zVar.b() - max2) - 1);
        } else {
            max = Math.max(0, min);
        }
        if (z10) {
            return Math.round((max * (Math.abs(iVar.d(view2) - iVar.g(view)) / (Math.abs(pVar.h0(view) - pVar.h0(view2)) + 1))) + (iVar.m() - iVar.g(view)));
        }
        return max;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int c(RecyclerView.z zVar, i iVar, View view, View view2, RecyclerView.p pVar, boolean z10) {
        if (pVar.J() == 0 || zVar.b() == 0 || view == null || view2 == null) {
            return 0;
        }
        if (!z10) {
            return zVar.b();
        }
        return (int) (((iVar.d(view2) - iVar.g(view)) / (Math.abs(pVar.h0(view) - pVar.h0(view2)) + 1)) * zVar.b());
    }
}
