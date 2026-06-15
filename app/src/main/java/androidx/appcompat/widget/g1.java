package androidx.appcompat.widget;

import android.graphics.Rect;
import android.os.Build;
import android.util.Log;
import android.view.View;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
/* compiled from: ViewUtils.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class g1 {

    /* renamed from: a  reason: collision with root package name */
    private static Method f1580a;

    static {
        if (Build.VERSION.SDK_INT >= 18) {
            try {
                Method declaredMethod = View.class.getDeclaredMethod("computeFitSystemWindows", Rect.class, Rect.class);
                f1580a = declaredMethod;
                if (declaredMethod.isAccessible()) {
                    return;
                }
                f1580a.setAccessible(true);
            } catch (NoSuchMethodException unused) {
                Log.d("ViewUtils", "Could not find method computeFitSystemWindows. Oh well.");
            }
        }
    }

    public static void a(View view, Rect rect, Rect rect2) {
        Method method = f1580a;
        if (method != null) {
            try {
                method.invoke(view, rect, rect2);
            } catch (Exception e8) {
                Log.d("ViewUtils", "Could not invoke computeFitSystemWindows", e8);
            }
        }
    }

    public static boolean b(View view) {
        return androidx.core.view.a0.E(view) == 1;
    }

    public static void c(View view) {
        if (Build.VERSION.SDK_INT >= 16) {
            try {
                Method method = view.getClass().getMethod("makeOptionalFitsSystemWindows", new Class[0]);
                if (!method.isAccessible()) {
                    method.setAccessible(true);
                }
                method.invoke(view, new Object[0]);
            } catch (IllegalAccessException e8) {
                Log.d("ViewUtils", "Could not invoke makeOptionalFitsSystemWindows", e8);
            } catch (NoSuchMethodException unused) {
                Log.d("ViewUtils", "Could not find method makeOptionalFitsSystemWindows. Oh well...");
            } catch (InvocationTargetException e10) {
                Log.d("ViewUtils", "Could not invoke makeOptionalFitsSystemWindows", e10);
            }
        }
    }
}
