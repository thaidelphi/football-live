package androidx.core.os;

import android.os.Build;
import android.os.LocaleList;
import com.ironsource.b9;
import java.util.Locale;
/* compiled from: LocaleListCompat.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class i {

    /* renamed from: b  reason: collision with root package name */
    private static final i f2676b = a(new Locale[0]);

    /* renamed from: a  reason: collision with root package name */
    private final k f2677a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: LocaleListCompat.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public static class a {
        static LocaleList a(Locale... localeArr) {
            return new LocaleList(localeArr);
        }

        static LocaleList b() {
            return LocaleList.getAdjustedDefault();
        }

        static LocaleList c() {
            return LocaleList.getDefault();
        }
    }

    private i(k kVar) {
        this.f2677a = kVar;
    }

    public static i a(Locale... localeArr) {
        if (Build.VERSION.SDK_INT >= 24) {
            return d(a.a(localeArr));
        }
        return new i(new j(localeArr));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Locale b(String str) {
        if (str.contains("-")) {
            String[] split = str.split("-", -1);
            if (split.length > 2) {
                return new Locale(split[0], split[1], split[2]);
            }
            if (split.length > 1) {
                return new Locale(split[0], split[1]);
            }
            if (split.length == 1) {
                return new Locale(split[0]);
            }
        } else if (str.contains("_")) {
            String[] split2 = str.split("_", -1);
            if (split2.length > 2) {
                return new Locale(split2[0], split2[1], split2[2]);
            }
            if (split2.length > 1) {
                return new Locale(split2[0], split2[1]);
            }
            if (split2.length == 1) {
                return new Locale(split2[0]);
            }
        } else {
            return new Locale(str);
        }
        throw new IllegalArgumentException("Can not parse language tag: [" + str + b9.i.f16698e);
    }

    public static i d(LocaleList localeList) {
        return new i(new l(localeList));
    }

    public Locale c(int i10) {
        return this.f2677a.get(i10);
    }

    public boolean equals(Object obj) {
        return (obj instanceof i) && this.f2677a.equals(((i) obj).f2677a);
    }

    public int hashCode() {
        return this.f2677a.hashCode();
    }

    public String toString() {
        return this.f2677a.toString();
    }
}
