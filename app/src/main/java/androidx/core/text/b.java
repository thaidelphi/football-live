package androidx.core.text;

import android.annotation.SuppressLint;
import android.icu.util.ULocale;
import android.os.Build;
import android.util.Log;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Locale;
/* compiled from: ICUCompat.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class b {

    /* renamed from: a  reason: collision with root package name */
    private static Method f2755a;

    /* renamed from: b  reason: collision with root package name */
    private static Method f2756b;

    /* compiled from: ICUCompat.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    static class a {
        static String a(Locale locale) {
            return locale.getScript();
        }
    }

    /* compiled from: ICUCompat.java */
    /* renamed from: androidx.core.text.b$b  reason: collision with other inner class name */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    static class C0044b {
        static ULocale a(Object obj) {
            return ULocale.addLikelySubtags((ULocale) obj);
        }

        static ULocale b(Locale locale) {
            return ULocale.forLocale(locale);
        }

        static String c(Object obj) {
            return ((ULocale) obj).getScript();
        }
    }

    static {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 21) {
            if (i10 < 24) {
                try {
                    f2756b = Class.forName("libcore.icu.ICU").getMethod("addLikelySubtags", Locale.class);
                    return;
                } catch (Exception e8) {
                    throw new IllegalStateException(e8);
                }
            }
            return;
        }
        try {
            Class<?> cls = Class.forName("libcore.icu.ICU");
            f2755a = cls.getMethod("getScript", String.class);
            f2756b = cls.getMethod("addLikelySubtags", String.class);
        } catch (Exception e10) {
            f2755a = null;
            f2756b = null;
            Log.w("ICUCompat", e10);
        }
    }

    @SuppressLint({"BanUncheckedReflection"})
    private static String a(Locale locale) {
        String locale2 = locale.toString();
        try {
            Method method = f2756b;
            if (method != null) {
                return (String) method.invoke(null, locale2);
            }
        } catch (IllegalAccessException e8) {
            Log.w("ICUCompat", e8);
        } catch (InvocationTargetException e10) {
            Log.w("ICUCompat", e10);
        }
        return locale2;
    }

    @SuppressLint({"BanUncheckedReflection"})
    private static String b(String str) {
        try {
            Method method = f2755a;
            if (method != null) {
                return (String) method.invoke(null, str);
            }
        } catch (IllegalAccessException e8) {
            Log.w("ICUCompat", e8);
        } catch (InvocationTargetException e10) {
            Log.w("ICUCompat", e10);
        }
        return null;
    }

    public static String c(Locale locale) {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 24) {
            return C0044b.c(C0044b.a(C0044b.b(locale)));
        }
        if (i10 >= 21) {
            try {
                return a.a((Locale) f2756b.invoke(null, locale));
            } catch (IllegalAccessException e8) {
                Log.w("ICUCompat", e8);
                return a.a(locale);
            } catch (InvocationTargetException e10) {
                Log.w("ICUCompat", e10);
                return a.a(locale);
            }
        }
        String a10 = a(locale);
        if (a10 != null) {
            return b(a10);
        }
        return null;
    }
}
