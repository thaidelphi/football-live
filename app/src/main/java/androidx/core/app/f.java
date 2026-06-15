package androidx.core.app;

import android.annotation.SuppressLint;
import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import android.util.Log;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
/* compiled from: BundleCompat.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class f {

    /* compiled from: BundleCompat.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    static class a {
        static IBinder a(Bundle bundle, String str) {
            return bundle.getBinder(str);
        }

        static void b(Bundle bundle, String str, IBinder iBinder) {
            bundle.putBinder(str, iBinder);
        }
    }

    /* compiled from: BundleCompat.java */
    @SuppressLint({"BanUncheckedReflection"})
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    static class b {

        /* renamed from: a  reason: collision with root package name */
        private static Method f2464a;

        /* renamed from: b  reason: collision with root package name */
        private static boolean f2465b;

        public static IBinder a(Bundle bundle, String str) {
            if (!f2465b) {
                try {
                    Method method = Bundle.class.getMethod("getIBinder", String.class);
                    f2464a = method;
                    method.setAccessible(true);
                } catch (NoSuchMethodException e8) {
                    Log.i("BundleCompatBaseImpl", "Failed to retrieve getIBinder method", e8);
                }
                f2465b = true;
            }
            Method method2 = f2464a;
            if (method2 != null) {
                try {
                    return (IBinder) method2.invoke(bundle, str);
                } catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException e10) {
                    Log.i("BundleCompatBaseImpl", "Failed to invoke getIBinder via reflection", e10);
                    f2464a = null;
                }
            }
            return null;
        }
    }

    public static IBinder a(Bundle bundle, String str) {
        if (Build.VERSION.SDK_INT >= 18) {
            return a.a(bundle, str);
        }
        return b.a(bundle, str);
    }
}
