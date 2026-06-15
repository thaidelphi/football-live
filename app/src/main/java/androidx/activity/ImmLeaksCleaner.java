package androidx.activity;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import androidx.lifecycle.i;
import androidx.lifecycle.p;
import java.lang.reflect.Field;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
final class ImmLeaksCleaner implements androidx.lifecycle.m {

    /* renamed from: b  reason: collision with root package name */
    private static int f723b;

    /* renamed from: c  reason: collision with root package name */
    private static Field f724c;

    /* renamed from: d  reason: collision with root package name */
    private static Field f725d;

    /* renamed from: e  reason: collision with root package name */
    private static Field f726e;

    /* renamed from: a  reason: collision with root package name */
    private Activity f727a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public ImmLeaksCleaner(Activity activity) {
        this.f727a = activity;
    }

    @SuppressLint({"SoonBlockedPrivateApi"})
    private static void g() {
        try {
            f723b = 2;
            Field declaredField = InputMethodManager.class.getDeclaredField("mServedView");
            f725d = declaredField;
            declaredField.setAccessible(true);
            Field declaredField2 = InputMethodManager.class.getDeclaredField("mNextServedView");
            f726e = declaredField2;
            declaredField2.setAccessible(true);
            Field declaredField3 = InputMethodManager.class.getDeclaredField("mH");
            f724c = declaredField3;
            declaredField3.setAccessible(true);
            f723b = 1;
        } catch (NoSuchFieldException unused) {
        }
    }

    @Override // androidx.lifecycle.m
    public void onStateChanged(p pVar, i.a aVar) {
        if (aVar != i.a.ON_DESTROY) {
            return;
        }
        if (f723b == 0) {
            g();
        }
        if (f723b == 1) {
            InputMethodManager inputMethodManager = (InputMethodManager) this.f727a.getSystemService("input_method");
            try {
                Object obj = f724c.get(inputMethodManager);
                if (obj == null) {
                    return;
                }
                synchronized (obj) {
                    try {
                        try {
                            View view = (View) f725d.get(inputMethodManager);
                            if (view == null) {
                                return;
                            }
                            if (view.isAttachedToWindow()) {
                                return;
                            }
                            try {
                                f726e.set(inputMethodManager, null);
                                inputMethodManager.isActive();
                            } catch (IllegalAccessException unused) {
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    } catch (ClassCastException unused2) {
                    } catch (IllegalAccessException unused3) {
                    }
                }
            } catch (IllegalAccessException unused4) {
            }
        }
    }
}
