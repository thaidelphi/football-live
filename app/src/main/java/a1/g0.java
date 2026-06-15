package a1;

import android.annotation.SuppressLint;
import android.os.Build;
import android.view.View;
/* compiled from: ViewUtilsApi23.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
class g0 extends f0 {

    /* renamed from: i  reason: collision with root package name */
    private static boolean f98i = true;

    @Override // a1.i0
    @SuppressLint({"NewApi"})
    public void g(View view, int i10) {
        if (Build.VERSION.SDK_INT == 28) {
            super.g(view, i10);
        } else if (f98i) {
            try {
                view.setTransitionVisibility(i10);
            } catch (NoSuchMethodError unused) {
                f98i = false;
            }
        }
    }
}
