package r9;

import com.google.android.gms.common.api.Api;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import n9.a0;
import n9.l;
import n9.m;
import n9.r;
import n9.s;
import n9.y;
/* compiled from: HttpHeaders.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
public final class e {

    /* renamed from: a  reason: collision with root package name */
    private static final y9.f f30460a = y9.f.i("\"\\");

    /* renamed from: b  reason: collision with root package name */
    private static final y9.f f30461b = y9.f.i("\t ,=");

    public static long a(r rVar) {
        return j(rVar.c("Content-Length"));
    }

    public static long b(a0 a0Var) {
        return a(a0Var.z());
    }

    public static boolean c(a0 a0Var) {
        if (a0Var.R().g().equals("HEAD")) {
            return false;
        }
        int j10 = a0Var.j();
        return (((j10 >= 100 && j10 < 200) || j10 == 204 || j10 == 304) && b(a0Var) == -1 && !"chunked".equalsIgnoreCase(a0Var.t("Transfer-Encoding"))) ? false : true;
    }

    public static boolean d(r rVar) {
        return k(rVar).contains("*");
    }

    public static boolean e(a0 a0Var) {
        return d(a0Var.z());
    }

    public static int f(String str, int i10) {
        try {
            long parseLong = Long.parseLong(str);
            if (parseLong > 2147483647L) {
                return Api.BaseClientBuilder.API_PRIORITY_OTHER;
            }
            if (parseLong < 0) {
                return 0;
            }
            return (int) parseLong;
        } catch (NumberFormatException unused) {
            return i10;
        }
    }

    public static void g(m mVar, s sVar, r rVar) {
        if (mVar == m.f28896a) {
            return;
        }
        List<l> f10 = l.f(sVar, rVar);
        if (f10.isEmpty()) {
            return;
        }
        mVar.b(sVar, f10);
    }

    public static int h(String str, int i10, String str2) {
        while (i10 < str.length() && str2.indexOf(str.charAt(i10)) == -1) {
            i10++;
        }
        return i10;
    }

    public static int i(String str, int i10) {
        char charAt;
        while (i10 < str.length() && ((charAt = str.charAt(i10)) == ' ' || charAt == '\t')) {
            i10++;
        }
        return i10;
    }

    private static long j(String str) {
        if (str == null) {
            return -1L;
        }
        try {
            return Long.parseLong(str);
        } catch (NumberFormatException unused) {
            return -1L;
        }
    }

    public static Set<String> k(r rVar) {
        Set<String> emptySet = Collections.emptySet();
        int g10 = rVar.g();
        for (int i10 = 0; i10 < g10; i10++) {
            if ("Vary".equalsIgnoreCase(rVar.e(i10))) {
                String i11 = rVar.i(i10);
                if (emptySet.isEmpty()) {
                    emptySet = new TreeSet<>(String.CASE_INSENSITIVE_ORDER);
                }
                for (String str : i11.split(",")) {
                    emptySet.add(str.trim());
                }
            }
        }
        return emptySet;
    }

    private static Set<String> l(a0 a0Var) {
        return k(a0Var.z());
    }

    public static r m(r rVar, r rVar2) {
        Set<String> k10 = k(rVar2);
        if (k10.isEmpty()) {
            return new r.a().d();
        }
        r.a aVar = new r.a();
        int g10 = rVar.g();
        for (int i10 = 0; i10 < g10; i10++) {
            String e8 = rVar.e(i10);
            if (k10.contains(e8)) {
                aVar.a(e8, rVar.i(i10));
            }
        }
        return aVar.d();
    }

    public static r n(a0 a0Var) {
        return m(a0Var.G().R().e(), a0Var.z());
    }

    public static boolean o(a0 a0Var, r rVar, y yVar) {
        for (String str : l(a0Var)) {
            if (!o9.c.q(rVar.j(str), yVar.d(str))) {
                return false;
            }
        }
        return true;
    }
}
