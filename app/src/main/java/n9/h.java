package n9;

import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
/* compiled from: CipherSuite.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
public final class h {

    /* renamed from: a  reason: collision with root package name */
    final String f28860a;

    /* renamed from: b  reason: collision with root package name */
    static final Comparator<String> f28793b = new a();

    /* renamed from: c  reason: collision with root package name */
    private static final Map<String, h> f28796c = new LinkedHashMap();

    /* renamed from: d  reason: collision with root package name */
    public static final h f28799d = c("SSL_RSA_WITH_NULL_MD5", 1);

    /* renamed from: e  reason: collision with root package name */
    public static final h f28802e = c("SSL_RSA_WITH_NULL_SHA", 2);

    /* renamed from: f  reason: collision with root package name */
    public static final h f28805f = c("SSL_RSA_EXPORT_WITH_RC4_40_MD5", 3);

    /* renamed from: g  reason: collision with root package name */
    public static final h f28808g = c("SSL_RSA_WITH_RC4_128_MD5", 4);

    /* renamed from: h  reason: collision with root package name */
    public static final h f28811h = c("SSL_RSA_WITH_RC4_128_SHA", 5);

    /* renamed from: i  reason: collision with root package name */
    public static final h f28814i = c("SSL_RSA_EXPORT_WITH_DES40_CBC_SHA", 8);

    /* renamed from: j  reason: collision with root package name */
    public static final h f28817j = c("SSL_RSA_WITH_DES_CBC_SHA", 9);

    /* renamed from: k  reason: collision with root package name */
    public static final h f28820k = c("SSL_RSA_WITH_3DES_EDE_CBC_SHA", 10);

    /* renamed from: l  reason: collision with root package name */
    public static final h f28823l = c("SSL_DHE_DSS_EXPORT_WITH_DES40_CBC_SHA", 17);

    /* renamed from: m  reason: collision with root package name */
    public static final h f28826m = c("SSL_DHE_DSS_WITH_DES_CBC_SHA", 18);

    /* renamed from: n  reason: collision with root package name */
    public static final h f28829n = c("SSL_DHE_DSS_WITH_3DES_EDE_CBC_SHA", 19);

    /* renamed from: o  reason: collision with root package name */
    public static final h f28832o = c("SSL_DHE_RSA_EXPORT_WITH_DES40_CBC_SHA", 20);

    /* renamed from: p  reason: collision with root package name */
    public static final h f28835p = c("SSL_DHE_RSA_WITH_DES_CBC_SHA", 21);

    /* renamed from: q  reason: collision with root package name */
    public static final h f28838q = c("SSL_DHE_RSA_WITH_3DES_EDE_CBC_SHA", 22);

    /* renamed from: r  reason: collision with root package name */
    public static final h f28841r = c("SSL_DH_anon_EXPORT_WITH_RC4_40_MD5", 23);

    /* renamed from: s  reason: collision with root package name */
    public static final h f28844s = c("SSL_DH_anon_WITH_RC4_128_MD5", 24);

    /* renamed from: t  reason: collision with root package name */
    public static final h f28846t = c("SSL_DH_anon_EXPORT_WITH_DES40_CBC_SHA", 25);

    /* renamed from: u  reason: collision with root package name */
    public static final h f28848u = c("SSL_DH_anon_WITH_DES_CBC_SHA", 26);

    /* renamed from: v  reason: collision with root package name */
    public static final h f28850v = c("SSL_DH_anon_WITH_3DES_EDE_CBC_SHA", 27);

    /* renamed from: w  reason: collision with root package name */
    public static final h f28852w = c("TLS_KRB5_WITH_DES_CBC_SHA", 30);

    /* renamed from: x  reason: collision with root package name */
    public static final h f28854x = c("TLS_KRB5_WITH_3DES_EDE_CBC_SHA", 31);

    /* renamed from: y  reason: collision with root package name */
    public static final h f28856y = c("TLS_KRB5_WITH_RC4_128_SHA", 32);

    /* renamed from: z  reason: collision with root package name */
    public static final h f28858z = c("TLS_KRB5_WITH_DES_CBC_MD5", 34);
    public static final h A = c("TLS_KRB5_WITH_3DES_EDE_CBC_MD5", 35);
    public static final h B = c("TLS_KRB5_WITH_RC4_128_MD5", 36);
    public static final h C = c("TLS_KRB5_EXPORT_WITH_DES_CBC_40_SHA", 38);
    public static final h D = c("TLS_KRB5_EXPORT_WITH_RC4_40_SHA", 40);
    public static final h E = c("TLS_KRB5_EXPORT_WITH_DES_CBC_40_MD5", 41);
    public static final h F = c("TLS_KRB5_EXPORT_WITH_RC4_40_MD5", 43);
    public static final h G = c("TLS_RSA_WITH_AES_128_CBC_SHA", 47);
    public static final h H = c("TLS_DHE_DSS_WITH_AES_128_CBC_SHA", 50);
    public static final h I = c("TLS_DHE_RSA_WITH_AES_128_CBC_SHA", 51);
    public static final h J = c("TLS_DH_anon_WITH_AES_128_CBC_SHA", 52);
    public static final h K = c("TLS_RSA_WITH_AES_256_CBC_SHA", 53);
    public static final h L = c("TLS_DHE_DSS_WITH_AES_256_CBC_SHA", 56);
    public static final h M = c("TLS_DHE_RSA_WITH_AES_256_CBC_SHA", 57);
    public static final h N = c("TLS_DH_anon_WITH_AES_256_CBC_SHA", 58);
    public static final h O = c("TLS_RSA_WITH_NULL_SHA256", 59);
    public static final h P = c("TLS_RSA_WITH_AES_128_CBC_SHA256", 60);
    public static final h Q = c("TLS_RSA_WITH_AES_256_CBC_SHA256", 61);
    public static final h R = c("TLS_DHE_DSS_WITH_AES_128_CBC_SHA256", 64);
    public static final h S = c("TLS_RSA_WITH_CAMELLIA_128_CBC_SHA", 65);
    public static final h T = c("TLS_DHE_DSS_WITH_CAMELLIA_128_CBC_SHA", 68);
    public static final h U = c("TLS_DHE_RSA_WITH_CAMELLIA_128_CBC_SHA", 69);
    public static final h V = c("TLS_DHE_RSA_WITH_AES_128_CBC_SHA256", 103);
    public static final h W = c("TLS_DHE_DSS_WITH_AES_256_CBC_SHA256", 106);
    public static final h X = c("TLS_DHE_RSA_WITH_AES_256_CBC_SHA256", 107);
    public static final h Y = c("TLS_DH_anon_WITH_AES_128_CBC_SHA256", 108);
    public static final h Z = c("TLS_DH_anon_WITH_AES_256_CBC_SHA256", 109);

    /* renamed from: a0  reason: collision with root package name */
    public static final h f28791a0 = c("TLS_RSA_WITH_CAMELLIA_256_CBC_SHA", 132);

    /* renamed from: b0  reason: collision with root package name */
    public static final h f28794b0 = c("TLS_DHE_DSS_WITH_CAMELLIA_256_CBC_SHA", 135);

    /* renamed from: c0  reason: collision with root package name */
    public static final h f28797c0 = c("TLS_DHE_RSA_WITH_CAMELLIA_256_CBC_SHA", 136);

    /* renamed from: d0  reason: collision with root package name */
    public static final h f28800d0 = c("TLS_PSK_WITH_RC4_128_SHA", 138);

    /* renamed from: e0  reason: collision with root package name */
    public static final h f28803e0 = c("TLS_PSK_WITH_3DES_EDE_CBC_SHA", 139);

    /* renamed from: f0  reason: collision with root package name */
    public static final h f28806f0 = c("TLS_PSK_WITH_AES_128_CBC_SHA", IronSourceConstants.USING_CACHE_FOR_INIT_EVENT);

    /* renamed from: g0  reason: collision with root package name */
    public static final h f28809g0 = c("TLS_PSK_WITH_AES_256_CBC_SHA", 141);

    /* renamed from: h0  reason: collision with root package name */
    public static final h f28812h0 = c("TLS_RSA_WITH_SEED_CBC_SHA", IronSourceConstants.REWARDED_VIDEO_DAILY_CAPPED);

    /* renamed from: i0  reason: collision with root package name */
    public static final h f28815i0 = c("TLS_RSA_WITH_AES_128_GCM_SHA256", 156);

    /* renamed from: j0  reason: collision with root package name */
    public static final h f28818j0 = c("TLS_RSA_WITH_AES_256_GCM_SHA384", 157);

    /* renamed from: k0  reason: collision with root package name */
    public static final h f28821k0 = c("TLS_DHE_RSA_WITH_AES_128_GCM_SHA256", 158);

    /* renamed from: l0  reason: collision with root package name */
    public static final h f28824l0 = c("TLS_DHE_RSA_WITH_AES_256_GCM_SHA384", 159);

    /* renamed from: m0  reason: collision with root package name */
    public static final h f28827m0 = c("TLS_DHE_DSS_WITH_AES_128_GCM_SHA256", 162);

    /* renamed from: n0  reason: collision with root package name */
    public static final h f28830n0 = c("TLS_DHE_DSS_WITH_AES_256_GCM_SHA384", 163);

    /* renamed from: o0  reason: collision with root package name */
    public static final h f28833o0 = c("TLS_DH_anon_WITH_AES_128_GCM_SHA256", 166);

    /* renamed from: p0  reason: collision with root package name */
    public static final h f28836p0 = c("TLS_DH_anon_WITH_AES_256_GCM_SHA384", 167);

    /* renamed from: q0  reason: collision with root package name */
    public static final h f28839q0 = c("TLS_EMPTY_RENEGOTIATION_INFO_SCSV", 255);

    /* renamed from: r0  reason: collision with root package name */
    public static final h f28842r0 = c("TLS_FALLBACK_SCSV", 22016);

    /* renamed from: s0  reason: collision with root package name */
    public static final h f28845s0 = c("TLS_ECDH_ECDSA_WITH_NULL_SHA", 49153);

    /* renamed from: t0  reason: collision with root package name */
    public static final h f28847t0 = c("TLS_ECDH_ECDSA_WITH_RC4_128_SHA", 49154);

    /* renamed from: u0  reason: collision with root package name */
    public static final h f28849u0 = c("TLS_ECDH_ECDSA_WITH_3DES_EDE_CBC_SHA", 49155);

    /* renamed from: v0  reason: collision with root package name */
    public static final h f28851v0 = c("TLS_ECDH_ECDSA_WITH_AES_128_CBC_SHA", 49156);

    /* renamed from: w0  reason: collision with root package name */
    public static final h f28853w0 = c("TLS_ECDH_ECDSA_WITH_AES_256_CBC_SHA", 49157);

    /* renamed from: x0  reason: collision with root package name */
    public static final h f28855x0 = c("TLS_ECDHE_ECDSA_WITH_NULL_SHA", 49158);

    /* renamed from: y0  reason: collision with root package name */
    public static final h f28857y0 = c("TLS_ECDHE_ECDSA_WITH_RC4_128_SHA", 49159);

    /* renamed from: z0  reason: collision with root package name */
    public static final h f28859z0 = c("TLS_ECDHE_ECDSA_WITH_3DES_EDE_CBC_SHA", 49160);
    public static final h A0 = c("TLS_ECDHE_ECDSA_WITH_AES_128_CBC_SHA", 49161);
    public static final h B0 = c("TLS_ECDHE_ECDSA_WITH_AES_256_CBC_SHA", 49162);
    public static final h C0 = c("TLS_ECDH_RSA_WITH_NULL_SHA", 49163);
    public static final h D0 = c("TLS_ECDH_RSA_WITH_RC4_128_SHA", 49164);
    public static final h E0 = c("TLS_ECDH_RSA_WITH_3DES_EDE_CBC_SHA", 49165);
    public static final h F0 = c("TLS_ECDH_RSA_WITH_AES_128_CBC_SHA", 49166);
    public static final h G0 = c("TLS_ECDH_RSA_WITH_AES_256_CBC_SHA", 49167);
    public static final h H0 = c("TLS_ECDHE_RSA_WITH_NULL_SHA", 49168);
    public static final h I0 = c("TLS_ECDHE_RSA_WITH_RC4_128_SHA", 49169);
    public static final h J0 = c("TLS_ECDHE_RSA_WITH_3DES_EDE_CBC_SHA", 49170);
    public static final h K0 = c("TLS_ECDHE_RSA_WITH_AES_128_CBC_SHA", 49171);
    public static final h L0 = c("TLS_ECDHE_RSA_WITH_AES_256_CBC_SHA", 49172);
    public static final h M0 = c("TLS_ECDH_anon_WITH_NULL_SHA", 49173);
    public static final h N0 = c("TLS_ECDH_anon_WITH_RC4_128_SHA", 49174);
    public static final h O0 = c("TLS_ECDH_anon_WITH_3DES_EDE_CBC_SHA", 49175);
    public static final h P0 = c("TLS_ECDH_anon_WITH_AES_128_CBC_SHA", 49176);
    public static final h Q0 = c("TLS_ECDH_anon_WITH_AES_256_CBC_SHA", 49177);
    public static final h R0 = c("TLS_ECDHE_ECDSA_WITH_AES_128_CBC_SHA256", 49187);
    public static final h S0 = c("TLS_ECDHE_ECDSA_WITH_AES_256_CBC_SHA384", 49188);
    public static final h T0 = c("TLS_ECDH_ECDSA_WITH_AES_128_CBC_SHA256", 49189);
    public static final h U0 = c("TLS_ECDH_ECDSA_WITH_AES_256_CBC_SHA384", 49190);
    public static final h V0 = c("TLS_ECDHE_RSA_WITH_AES_128_CBC_SHA256", 49191);
    public static final h W0 = c("TLS_ECDHE_RSA_WITH_AES_256_CBC_SHA384", 49192);
    public static final h X0 = c("TLS_ECDH_RSA_WITH_AES_128_CBC_SHA256", 49193);
    public static final h Y0 = c("TLS_ECDH_RSA_WITH_AES_256_CBC_SHA384", 49194);
    public static final h Z0 = c("TLS_ECDHE_ECDSA_WITH_AES_128_GCM_SHA256", 49195);

    /* renamed from: a1  reason: collision with root package name */
    public static final h f28792a1 = c("TLS_ECDHE_ECDSA_WITH_AES_256_GCM_SHA384", 49196);

    /* renamed from: b1  reason: collision with root package name */
    public static final h f28795b1 = c("TLS_ECDH_ECDSA_WITH_AES_128_GCM_SHA256", 49197);

    /* renamed from: c1  reason: collision with root package name */
    public static final h f28798c1 = c("TLS_ECDH_ECDSA_WITH_AES_256_GCM_SHA384", 49198);

    /* renamed from: d1  reason: collision with root package name */
    public static final h f28801d1 = c("TLS_ECDHE_RSA_WITH_AES_128_GCM_SHA256", 49199);

    /* renamed from: e1  reason: collision with root package name */
    public static final h f28804e1 = c("TLS_ECDHE_RSA_WITH_AES_256_GCM_SHA384", 49200);

    /* renamed from: f1  reason: collision with root package name */
    public static final h f28807f1 = c("TLS_ECDH_RSA_WITH_AES_128_GCM_SHA256", 49201);

    /* renamed from: g1  reason: collision with root package name */
    public static final h f28810g1 = c("TLS_ECDH_RSA_WITH_AES_256_GCM_SHA384", 49202);

    /* renamed from: h1  reason: collision with root package name */
    public static final h f28813h1 = c("TLS_ECDHE_PSK_WITH_AES_128_CBC_SHA", 49205);

    /* renamed from: i1  reason: collision with root package name */
    public static final h f28816i1 = c("TLS_ECDHE_PSK_WITH_AES_256_CBC_SHA", 49206);

    /* renamed from: j1  reason: collision with root package name */
    public static final h f28819j1 = c("TLS_ECDHE_RSA_WITH_CHACHA20_POLY1305_SHA256", 52392);

    /* renamed from: k1  reason: collision with root package name */
    public static final h f28822k1 = c("TLS_ECDHE_ECDSA_WITH_CHACHA20_POLY1305_SHA256", 52393);

    /* renamed from: l1  reason: collision with root package name */
    public static final h f28825l1 = c("TLS_DHE_RSA_WITH_CHACHA20_POLY1305_SHA256", 52394);

    /* renamed from: m1  reason: collision with root package name */
    public static final h f28828m1 = c("TLS_ECDHE_PSK_WITH_CHACHA20_POLY1305_SHA256", 52396);

    /* renamed from: n1  reason: collision with root package name */
    public static final h f28831n1 = c("TLS_AES_128_GCM_SHA256", 4865);

    /* renamed from: o1  reason: collision with root package name */
    public static final h f28834o1 = c("TLS_AES_256_GCM_SHA384", 4866);

    /* renamed from: p1  reason: collision with root package name */
    public static final h f28837p1 = c("TLS_CHACHA20_POLY1305_SHA256", 4867);

    /* renamed from: q1  reason: collision with root package name */
    public static final h f28840q1 = c("TLS_AES_128_CCM_SHA256", 4868);

    /* renamed from: r1  reason: collision with root package name */
    public static final h f28843r1 = c("TLS_AES_256_CCM_8_SHA256", 4869);

    /* compiled from: CipherSuite.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
    class a implements Comparator<String> {
        a() {
        }

        @Override // java.util.Comparator
        /* renamed from: a */
        public int compare(String str, String str2) {
            int min = Math.min(str.length(), str2.length());
            for (int i10 = 4; i10 < min; i10++) {
                char charAt = str.charAt(i10);
                char charAt2 = str2.charAt(i10);
                if (charAt != charAt2) {
                    return charAt < charAt2 ? -1 : 1;
                }
            }
            int length = str.length();
            int length2 = str2.length();
            if (length != length2) {
                return length < length2 ? -1 : 1;
            }
            return 0;
        }
    }

    private h(String str) {
        Objects.requireNonNull(str);
        this.f28860a = str;
    }

    public static synchronized h a(String str) {
        h hVar;
        synchronized (h.class) {
            Map<String, h> map = f28796c;
            hVar = map.get(str);
            if (hVar == null) {
                hVar = map.get(e(str));
                if (hVar == null) {
                    hVar = new h(str);
                }
                map.put(str, hVar);
            }
        }
        return hVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static List<h> b(String... strArr) {
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String str : strArr) {
            arrayList.add(a(str));
        }
        return Collections.unmodifiableList(arrayList);
    }

    private static h c(String str, int i10) {
        h hVar = new h(str);
        f28796c.put(str, hVar);
        return hVar;
    }

    private static String e(String str) {
        if (str.startsWith("TLS_")) {
            return "SSL_" + str.substring(4);
        } else if (str.startsWith("SSL_")) {
            return "TLS_" + str.substring(4);
        } else {
            return str;
        }
    }

    public String d() {
        return this.f28860a;
    }

    public String toString() {
        return this.f28860a;
    }
}
