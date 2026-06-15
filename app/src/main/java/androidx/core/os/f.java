package androidx.core.os;

import android.content.res.Configuration;
import android.os.Build;
import android.os.LocaleList;
/* compiled from: ConfigurationCompat.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class f {

    /* compiled from: ConfigurationCompat.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    static class a {
        static LocaleList a(Configuration configuration) {
            return configuration.getLocales();
        }
    }

    public static i a(Configuration configuration) {
        return Build.VERSION.SDK_INT >= 24 ? i.d(a.a(configuration)) : i.a(configuration.locale);
    }
}
