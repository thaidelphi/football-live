package androidx.core.os;

import com.ironsource.b9;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Locale;
/* compiled from: LocaleListCompatWrapper.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
final class j implements k {

    /* renamed from: c  reason: collision with root package name */
    private static final Locale[] f2678c = new Locale[0];

    /* renamed from: d  reason: collision with root package name */
    private static final Locale f2679d = new Locale("en", "XA");

    /* renamed from: e  reason: collision with root package name */
    private static final Locale f2680e = new Locale("ar", "XB");

    /* renamed from: f  reason: collision with root package name */
    private static final Locale f2681f = i.b("en-Latn");

    /* renamed from: a  reason: collision with root package name */
    private final Locale[] f2682a;

    /* renamed from: b  reason: collision with root package name */
    private final String f2683b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public j(Locale... localeArr) {
        if (localeArr.length == 0) {
            this.f2682a = f2678c;
            this.f2683b = "";
            return;
        }
        ArrayList arrayList = new ArrayList();
        HashSet hashSet = new HashSet();
        StringBuilder sb = new StringBuilder();
        for (int i10 = 0; i10 < localeArr.length; i10++) {
            Locale locale = localeArr[i10];
            if (locale != null) {
                if (!hashSet.contains(locale)) {
                    Locale locale2 = (Locale) locale.clone();
                    arrayList.add(locale2);
                    a(sb, locale2);
                    if (i10 < localeArr.length - 1) {
                        sb.append(',');
                    }
                    hashSet.add(locale2);
                }
            } else {
                throw new NullPointerException("list[" + i10 + "] is null");
            }
        }
        this.f2682a = (Locale[]) arrayList.toArray(new Locale[0]);
        this.f2683b = sb.toString();
    }

    static void a(StringBuilder sb, Locale locale) {
        sb.append(locale.getLanguage());
        String country = locale.getCountry();
        if (country == null || country.isEmpty()) {
            return;
        }
        sb.append('-');
        sb.append(locale.getCountry());
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        Locale[] localeArr = ((j) obj).f2682a;
        if (this.f2682a.length != localeArr.length) {
            return false;
        }
        int i10 = 0;
        while (true) {
            Locale[] localeArr2 = this.f2682a;
            if (i10 >= localeArr2.length) {
                return true;
            }
            if (!localeArr2[i10].equals(localeArr[i10])) {
                return false;
            }
            i10++;
        }
    }

    @Override // androidx.core.os.k
    public Locale get(int i10) {
        if (i10 >= 0) {
            Locale[] localeArr = this.f2682a;
            if (i10 < localeArr.length) {
                return localeArr[i10];
            }
        }
        return null;
    }

    @Override // androidx.core.os.k
    public Object getLocaleList() {
        return null;
    }

    public int hashCode() {
        int i10 = 1;
        for (Locale locale : this.f2682a) {
            i10 = (i10 * 31) + locale.hashCode();
        }
        return i10;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(b9.i.f16696d);
        int i10 = 0;
        while (true) {
            Locale[] localeArr = this.f2682a;
            if (i10 < localeArr.length) {
                sb.append(localeArr[i10]);
                if (i10 < this.f2682a.length - 1) {
                    sb.append(',');
                }
                i10++;
            } else {
                sb.append(b9.i.f16698e);
                return sb.toString();
            }
        }
    }
}
