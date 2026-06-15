package a1;

import android.annotation.SuppressLint;
import android.graphics.Matrix;
import android.util.Log;
import android.view.View;
import android.view.ViewParent;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
/* compiled from: ViewUtilsBase.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
class i0 {

    /* renamed from: a  reason: collision with root package name */
    private static Method f105a;

    /* renamed from: b  reason: collision with root package name */
    private static boolean f106b;

    /* renamed from: c  reason: collision with root package name */
    private static Field f107c;

    /* renamed from: d  reason: collision with root package name */
    private static boolean f108d;

    @SuppressLint({"PrivateApi"})
    private void b() {
        if (f106b) {
            return;
        }
        try {
            Class cls = Integer.TYPE;
            Method declaredMethod = View.class.getDeclaredMethod("setFrame", cls, cls, cls, cls);
            f105a = declaredMethod;
            declaredMethod.setAccessible(true);
        } catch (NoSuchMethodException e8) {
            Log.i("ViewUtilsBase", "Failed to retrieve setFrame method", e8);
        }
        f106b = true;
    }

    public void a(View view) {
        if (view.getVisibility() == 0) {
            view.setTag(j.f109a, null);
        }
    }

    public float c(View view) {
        Float f10 = (Float) view.getTag(j.f109a);
        if (f10 != null) {
            return view.getAlpha() / f10.floatValue();
        }
        return view.getAlpha();
    }

    public void d(View view) {
        int i10 = j.f109a;
        if (view.getTag(i10) == null) {
            view.setTag(i10, Float.valueOf(view.getAlpha()));
        }
    }

    public void e(View view, int i10, int i11, int i12, int i13) {
        b();
        Method method = f105a;
        if (method != null) {
            try {
                method.invoke(view, Integer.valueOf(i10), Integer.valueOf(i11), Integer.valueOf(i12), Integer.valueOf(i13));
            } catch (IllegalAccessException unused) {
            } catch (InvocationTargetException e8) {
                throw new RuntimeException(e8.getCause());
            }
        }
    }

    public void f(View view, float f10) {
        Float f11 = (Float) view.getTag(j.f109a);
        if (f11 != null) {
            view.setAlpha(f11.floatValue() * f10);
        } else {
            view.setAlpha(f10);
        }
    }

    public void g(View view, int i10) {
        if (!f108d) {
            try {
                Field declaredField = View.class.getDeclaredField("mViewFlags");
                f107c = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException unused) {
                Log.i("ViewUtilsBase", "fetchViewFlagsField: ");
            }
            f108d = true;
        }
        Field field = f107c;
        if (field != null) {
            try {
                f107c.setInt(view, i10 | (field.getInt(view) & (-13)));
            } catch (IllegalAccessException unused2) {
            }
        }
    }

    public void h(View view, Matrix matrix) {
        ViewParent parent = view.getParent();
        if (parent instanceof View) {
            View view2 = (View) parent;
            h(view2, matrix);
            matrix.preTranslate(-view2.getScrollX(), -view2.getScrollY());
        }
        matrix.preTranslate(view.getLeft(), view.getTop());
        Matrix matrix2 = view.getMatrix();
        if (matrix2.isIdentity()) {
            return;
        }
        matrix.preConcat(matrix2);
    }

    public void i(View view, Matrix matrix) {
        ViewParent parent = view.getParent();
        if (parent instanceof View) {
            View view2 = (View) parent;
            i(view2, matrix);
            matrix.postTranslate(view2.getScrollX(), view2.getScrollY());
        }
        matrix.postTranslate(-view.getLeft(), -view.getTop());
        Matrix matrix2 = view.getMatrix();
        if (matrix2.isIdentity()) {
            return;
        }
        Matrix matrix3 = new Matrix();
        if (matrix2.invert(matrix3)) {
            matrix.postConcat(matrix3);
        }
    }
}
