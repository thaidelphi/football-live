package a1;

import android.annotation.SuppressLint;
import android.view.View;
/* compiled from: ViewUtilsApi19.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
class d0 extends i0 {

    /* renamed from: e  reason: collision with root package name */
    private static boolean f80e = true;

    @Override // a1.i0
    public void a(View view) {
    }

    @Override // a1.i0
    @SuppressLint({"NewApi"})
    public float c(View view) {
        if (f80e) {
            try {
                return view.getTransitionAlpha();
            } catch (NoSuchMethodError unused) {
                f80e = false;
            }
        }
        return view.getAlpha();
    }

    @Override // a1.i0
    public void d(View view) {
    }

    @Override // a1.i0
    @SuppressLint({"NewApi"})
    public void f(View view, float f10) {
        if (f80e) {
            try {
                view.setTransitionAlpha(f10);
                return;
            } catch (NoSuchMethodError unused) {
                f80e = false;
            }
        }
        view.setAlpha(f10);
    }
}
