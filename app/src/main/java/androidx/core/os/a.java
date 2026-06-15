package androidx.core.os;

import android.annotation.SuppressLint;
import android.os.Build;
import java.util.Locale;
/* compiled from: BuildCompat.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class a {
    protected static boolean a(String str, String str2) {
        if ("REL".equals(str2)) {
            return false;
        }
        Locale locale = Locale.ROOT;
        return str2.toUpperCase(locale).compareTo(str.toUpperCase(locale)) >= 0;
    }

    @Deprecated
    public static boolean b() {
        return Build.VERSION.SDK_INT >= 30;
    }

    @SuppressLint({"RestrictedApi"})
    @Deprecated
    public static boolean c() {
        int i10 = Build.VERSION.SDK_INT;
        return i10 >= 31 || (i10 >= 30 && a("S", Build.VERSION.CODENAME));
    }

    public static boolean d() {
        int i10 = Build.VERSION.SDK_INT;
        return i10 >= 33 || (i10 >= 32 && a("Tiramisu", Build.VERSION.CODENAME));
    }
}
