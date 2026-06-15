package n9;

import com.ironsource.cc;
import com.ironsource.mediationsdk.logger.IronSourceError;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
/* compiled from: Cookie.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
public final class l {

    /* renamed from: j  reason: collision with root package name */
    private static final Pattern f28883j = Pattern.compile("(\\d{2,4})[^\\d]*");

    /* renamed from: k  reason: collision with root package name */
    private static final Pattern f28884k = Pattern.compile("(?i)(jan|feb|mar|apr|may|jun|jul|aug|sep|oct|nov|dec).*");

    /* renamed from: l  reason: collision with root package name */
    private static final Pattern f28885l = Pattern.compile("(\\d{1,2})[^\\d]*");

    /* renamed from: m  reason: collision with root package name */
    private static final Pattern f28886m = Pattern.compile("(\\d{1,2}):(\\d{1,2}):(\\d{1,2})[^\\d]*");

    /* renamed from: a  reason: collision with root package name */
    private final String f28887a;

    /* renamed from: b  reason: collision with root package name */
    private final String f28888b;

    /* renamed from: c  reason: collision with root package name */
    private final long f28889c;

    /* renamed from: d  reason: collision with root package name */
    private final String f28890d;

    /* renamed from: e  reason: collision with root package name */
    private final String f28891e;

    /* renamed from: f  reason: collision with root package name */
    private final boolean f28892f;

    /* renamed from: g  reason: collision with root package name */
    private final boolean f28893g;

    /* renamed from: h  reason: collision with root package name */
    private final boolean f28894h;

    /* renamed from: i  reason: collision with root package name */
    private final boolean f28895i;

    private l(String str, String str2, long j10, String str3, String str4, boolean z10, boolean z11, boolean z12, boolean z13) {
        this.f28887a = str;
        this.f28888b = str2;
        this.f28889c = j10;
        this.f28890d = str3;
        this.f28891e = str4;
        this.f28892f = z10;
        this.f28893g = z11;
        this.f28895i = z12;
        this.f28894h = z13;
    }

    private static int a(String str, int i10, int i11, boolean z10) {
        while (i10 < i11) {
            char charAt = str.charAt(i10);
            if (((charAt < ' ' && charAt != '\t') || charAt >= 127 || (charAt >= '0' && charAt <= '9') || ((charAt >= 'a' && charAt <= 'z') || ((charAt >= 'A' && charAt <= 'Z') || charAt == ':'))) == (!z10)) {
                return i10;
            }
            i10++;
        }
        return i11;
    }

    private static boolean b(String str, String str2) {
        if (str.equals(str2)) {
            return true;
        }
        return str.endsWith(str2) && str.charAt((str.length() - str2.length()) - 1) == '.' && !o9.c.J(str);
    }

    /* JADX WARN: Removed duplicated region for block: B:58:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0128  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    static n9.l d(long r23, n9.s r25, java.lang.String r26) {
        /*
            Method dump skipped, instructions count: 311
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: n9.l.d(long, n9.s, java.lang.String):n9.l");
    }

    public static l e(s sVar, String str) {
        return d(System.currentTimeMillis(), sVar, str);
    }

    public static List<l> f(s sVar, r rVar) {
        List<String> j10 = rVar.j("Set-Cookie");
        int size = j10.size();
        ArrayList arrayList = null;
        for (int i10 = 0; i10 < size; i10++) {
            l e8 = e(sVar, j10.get(i10));
            if (e8 != null) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(e8);
            }
        }
        if (arrayList != null) {
            return Collections.unmodifiableList(arrayList);
        }
        return Collections.emptyList();
    }

    private static String g(String str) {
        if (!str.endsWith(".")) {
            if (str.startsWith(".")) {
                str = str.substring(1);
            }
            String d10 = o9.c.d(str);
            if (d10 != null) {
                return d10;
            }
            throw new IllegalArgumentException();
        }
        throw new IllegalArgumentException();
    }

    private static long h(String str, int i10, int i11) {
        int a10 = a(str, i10, i11, false);
        Matcher matcher = f28886m.matcher(str);
        int i12 = -1;
        int i13 = -1;
        int i14 = -1;
        int i15 = -1;
        int i16 = -1;
        int i17 = -1;
        while (a10 < i11) {
            int a11 = a(str, a10 + 1, i11, true);
            matcher.region(a10, a11);
            if (i13 == -1 && matcher.usePattern(f28886m).matches()) {
                i13 = Integer.parseInt(matcher.group(1));
                i16 = Integer.parseInt(matcher.group(2));
                i17 = Integer.parseInt(matcher.group(3));
            } else if (i14 == -1 && matcher.usePattern(f28885l).matches()) {
                i14 = Integer.parseInt(matcher.group(1));
            } else {
                if (i15 == -1) {
                    Pattern pattern = f28884k;
                    if (matcher.usePattern(pattern).matches()) {
                        i15 = pattern.pattern().indexOf(matcher.group(1).toLowerCase(Locale.US)) / 4;
                    }
                }
                if (i12 == -1 && matcher.usePattern(f28883j).matches()) {
                    i12 = Integer.parseInt(matcher.group(1));
                }
            }
            a10 = a(str, a11 + 1, i11, false);
        }
        if (i12 >= 70 && i12 <= 99) {
            i12 += 1900;
        }
        if (i12 >= 0 && i12 <= 69) {
            i12 += 2000;
        }
        if (i12 >= 1601) {
            if (i15 != -1) {
                if (i14 < 1 || i14 > 31) {
                    throw new IllegalArgumentException();
                }
                if (i13 < 0 || i13 > 23) {
                    throw new IllegalArgumentException();
                }
                if (i16 < 0 || i16 > 59) {
                    throw new IllegalArgumentException();
                }
                if (i17 >= 0 && i17 <= 59) {
                    GregorianCalendar gregorianCalendar = new GregorianCalendar(o9.c.f29487p);
                    gregorianCalendar.setLenient(false);
                    gregorianCalendar.set(1, i12);
                    gregorianCalendar.set(2, i15 - 1);
                    gregorianCalendar.set(5, i14);
                    gregorianCalendar.set(11, i13);
                    gregorianCalendar.set(12, i16);
                    gregorianCalendar.set(13, i17);
                    gregorianCalendar.set(14, 0);
                    return gregorianCalendar.getTimeInMillis();
                }
                throw new IllegalArgumentException();
            }
            throw new IllegalArgumentException();
        }
        throw new IllegalArgumentException();
    }

    private static long i(String str) {
        try {
            long parseLong = Long.parseLong(str);
            if (parseLong <= 0) {
                return Long.MIN_VALUE;
            }
            return parseLong;
        } catch (NumberFormatException e8) {
            if (str.matches("-?\\d+")) {
                return str.startsWith("-") ? Long.MIN_VALUE : Long.MAX_VALUE;
            }
            throw e8;
        }
    }

    public String c() {
        return this.f28887a;
    }

    public boolean equals(Object obj) {
        if (obj instanceof l) {
            l lVar = (l) obj;
            return lVar.f28887a.equals(this.f28887a) && lVar.f28888b.equals(this.f28888b) && lVar.f28890d.equals(this.f28890d) && lVar.f28891e.equals(this.f28891e) && lVar.f28889c == this.f28889c && lVar.f28892f == this.f28892f && lVar.f28893g == this.f28893g && lVar.f28894h == this.f28894h && lVar.f28895i == this.f28895i;
        }
        return false;
    }

    public int hashCode() {
        long j10 = this.f28889c;
        return ((((((((((((((((IronSourceError.ERROR_NON_EXISTENT_INSTANCE + this.f28887a.hashCode()) * 31) + this.f28888b.hashCode()) * 31) + this.f28890d.hashCode()) * 31) + this.f28891e.hashCode()) * 31) + ((int) (j10 ^ (j10 >>> 32)))) * 31) + (!this.f28892f ? 1 : 0)) * 31) + (!this.f28893g ? 1 : 0)) * 31) + (!this.f28894h ? 1 : 0)) * 31) + (!this.f28895i ? 1 : 0);
    }

    String j(boolean z10) {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f28887a);
        sb.append(cc.T);
        sb.append(this.f28888b);
        if (this.f28894h) {
            if (this.f28889c == Long.MIN_VALUE) {
                sb.append("; max-age=0");
            } else {
                sb.append("; expires=");
                sb.append(r9.d.a(new Date(this.f28889c)));
            }
        }
        if (!this.f28895i) {
            sb.append("; domain=");
            if (z10) {
                sb.append(".");
            }
            sb.append(this.f28890d);
        }
        sb.append("; path=");
        sb.append(this.f28891e);
        if (this.f28892f) {
            sb.append("; secure");
        }
        if (this.f28893g) {
            sb.append("; httponly");
        }
        return sb.toString();
    }

    public String k() {
        return this.f28888b;
    }

    public String toString() {
        return j(false);
    }
}
