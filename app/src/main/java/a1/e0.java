package a1;

import android.annotation.SuppressLint;
import android.graphics.Matrix;
import android.view.View;
/* compiled from: ViewUtilsApi21.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
class e0 extends d0 {

    /* renamed from: f  reason: collision with root package name */
    private static boolean f95f = true;

    /* renamed from: g  reason: collision with root package name */
    private static boolean f96g = true;

    @Override // a1.i0
    @SuppressLint({"NewApi"})
    public void h(View view, Matrix matrix) {
        if (f95f) {
            try {
                view.transformMatrixToGlobal(matrix);
            } catch (NoSuchMethodError unused) {
                f95f = false;
            }
        }
    }

    @Override // a1.i0
    @SuppressLint({"NewApi"})
    public void i(View view, Matrix matrix) {
        if (f96g) {
            try {
                view.transformMatrixToLocal(matrix);
            } catch (NoSuchMethodError unused) {
                f96g = false;
            }
        }
    }
}
