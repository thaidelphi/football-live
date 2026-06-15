package n9;

import com.ironsource.mediationsdk.logger.IronSourceError;
import java.util.Arrays;
import java.util.List;
import javax.net.ssl.SSLSocket;
/* compiled from: ConnectionSpec.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
public final class k {

    /* renamed from: e  reason: collision with root package name */
    private static final h[] f28869e;

    /* renamed from: f  reason: collision with root package name */
    private static final h[] f28870f;

    /* renamed from: g  reason: collision with root package name */
    public static final k f28871g;

    /* renamed from: h  reason: collision with root package name */
    public static final k f28872h;

    /* renamed from: i  reason: collision with root package name */
    public static final k f28873i;

    /* renamed from: j  reason: collision with root package name */
    public static final k f28874j;

    /* renamed from: a  reason: collision with root package name */
    final boolean f28875a;

    /* renamed from: b  reason: collision with root package name */
    final boolean f28876b;

    /* renamed from: c  reason: collision with root package name */
    final String[] f28877c;

    /* renamed from: d  reason: collision with root package name */
    final String[] f28878d;

    static {
        h hVar = h.f28831n1;
        h hVar2 = h.f28834o1;
        h hVar3 = h.f28837p1;
        h hVar4 = h.f28840q1;
        h hVar5 = h.f28843r1;
        h hVar6 = h.Z0;
        h hVar7 = h.f28801d1;
        h hVar8 = h.f28792a1;
        h hVar9 = h.f28804e1;
        h hVar10 = h.f28822k1;
        h hVar11 = h.f28819j1;
        h[] hVarArr = {hVar, hVar2, hVar3, hVar4, hVar5, hVar6, hVar7, hVar8, hVar9, hVar10, hVar11};
        f28869e = hVarArr;
        h[] hVarArr2 = {hVar, hVar2, hVar3, hVar4, hVar5, hVar6, hVar7, hVar8, hVar9, hVar10, hVar11, h.K0, h.L0, h.f28815i0, h.f28818j0, h.G, h.K, h.f28820k};
        f28870f = hVarArr2;
        a c10 = new a(true).c(hVarArr);
        d0 d0Var = d0.TLS_1_3;
        d0 d0Var2 = d0.TLS_1_2;
        f28871g = c10.f(d0Var, d0Var2).d(true).a();
        a c11 = new a(true).c(hVarArr2);
        d0 d0Var3 = d0.TLS_1_0;
        f28872h = c11.f(d0Var, d0Var2, d0.TLS_1_1, d0Var3).d(true).a();
        f28873i = new a(true).c(hVarArr2).f(d0Var3).d(true).a();
        f28874j = new a(false).a();
    }

    k(a aVar) {
        this.f28875a = aVar.f28879a;
        this.f28877c = aVar.f28880b;
        this.f28878d = aVar.f28881c;
        this.f28876b = aVar.f28882d;
    }

    private k e(SSLSocket sSLSocket, boolean z10) {
        String[] enabledCipherSuites;
        String[] enabledProtocols;
        if (this.f28877c != null) {
            enabledCipherSuites = o9.c.z(h.f28793b, sSLSocket.getEnabledCipherSuites(), this.f28877c);
        } else {
            enabledCipherSuites = sSLSocket.getEnabledCipherSuites();
        }
        if (this.f28878d != null) {
            enabledProtocols = o9.c.z(o9.c.f29488q, sSLSocket.getEnabledProtocols(), this.f28878d);
        } else {
            enabledProtocols = sSLSocket.getEnabledProtocols();
        }
        String[] supportedCipherSuites = sSLSocket.getSupportedCipherSuites();
        int w10 = o9.c.w(h.f28793b, supportedCipherSuites, "TLS_FALLBACK_SCSV");
        if (z10 && w10 != -1) {
            enabledCipherSuites = o9.c.i(enabledCipherSuites, supportedCipherSuites[w10]);
        }
        return new a(this).b(enabledCipherSuites).e(enabledProtocols).a();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(SSLSocket sSLSocket, boolean z10) {
        k e8 = e(sSLSocket, z10);
        String[] strArr = e8.f28878d;
        if (strArr != null) {
            sSLSocket.setEnabledProtocols(strArr);
        }
        String[] strArr2 = e8.f28877c;
        if (strArr2 != null) {
            sSLSocket.setEnabledCipherSuites(strArr2);
        }
    }

    public List<h> b() {
        String[] strArr = this.f28877c;
        if (strArr != null) {
            return h.b(strArr);
        }
        return null;
    }

    public boolean c(SSLSocket sSLSocket) {
        if (this.f28875a) {
            String[] strArr = this.f28878d;
            if (strArr == null || o9.c.B(o9.c.f29488q, strArr, sSLSocket.getEnabledProtocols())) {
                String[] strArr2 = this.f28877c;
                return strArr2 == null || o9.c.B(h.f28793b, strArr2, sSLSocket.getEnabledCipherSuites());
            }
            return false;
        }
        return false;
    }

    public boolean d() {
        return this.f28875a;
    }

    public boolean equals(Object obj) {
        if (obj instanceof k) {
            if (obj == this) {
                return true;
            }
            k kVar = (k) obj;
            boolean z10 = this.f28875a;
            if (z10 != kVar.f28875a) {
                return false;
            }
            return !z10 || (Arrays.equals(this.f28877c, kVar.f28877c) && Arrays.equals(this.f28878d, kVar.f28878d) && this.f28876b == kVar.f28876b);
        }
        return false;
    }

    public boolean f() {
        return this.f28876b;
    }

    public List<d0> g() {
        String[] strArr = this.f28878d;
        if (strArr != null) {
            return d0.b(strArr);
        }
        return null;
    }

    public int hashCode() {
        if (this.f28875a) {
            return ((((IronSourceError.ERROR_NON_EXISTENT_INSTANCE + Arrays.hashCode(this.f28877c)) * 31) + Arrays.hashCode(this.f28878d)) * 31) + (!this.f28876b ? 1 : 0);
        }
        return 17;
    }

    public String toString() {
        if (this.f28875a) {
            String obj = this.f28877c != null ? b().toString() : "[all enabled]";
            String obj2 = this.f28878d != null ? g().toString() : "[all enabled]";
            return "ConnectionSpec(cipherSuites=" + obj + ", tlsVersions=" + obj2 + ", supportsTlsExtensions=" + this.f28876b + ")";
        }
        return "ConnectionSpec()";
    }

    /* compiled from: ConnectionSpec.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        boolean f28879a;

        /* renamed from: b  reason: collision with root package name */
        String[] f28880b;

        /* renamed from: c  reason: collision with root package name */
        String[] f28881c;

        /* renamed from: d  reason: collision with root package name */
        boolean f28882d;

        a(boolean z10) {
            this.f28879a = z10;
        }

        public k a() {
            return new k(this);
        }

        public a b(String... strArr) {
            if (this.f28879a) {
                if (strArr.length != 0) {
                    this.f28880b = (String[]) strArr.clone();
                    return this;
                }
                throw new IllegalArgumentException("At least one cipher suite is required");
            }
            throw new IllegalStateException("no cipher suites for cleartext connections");
        }

        public a c(h... hVarArr) {
            if (this.f28879a) {
                String[] strArr = new String[hVarArr.length];
                for (int i10 = 0; i10 < hVarArr.length; i10++) {
                    strArr[i10] = hVarArr[i10].f28860a;
                }
                return b(strArr);
            }
            throw new IllegalStateException("no cipher suites for cleartext connections");
        }

        public a d(boolean z10) {
            if (this.f28879a) {
                this.f28882d = z10;
                return this;
            }
            throw new IllegalStateException("no TLS extensions for cleartext connections");
        }

        public a e(String... strArr) {
            if (this.f28879a) {
                if (strArr.length != 0) {
                    this.f28881c = (String[]) strArr.clone();
                    return this;
                }
                throw new IllegalArgumentException("At least one TLS version is required");
            }
            throw new IllegalStateException("no TLS versions for cleartext connections");
        }

        public a f(d0... d0VarArr) {
            if (this.f28879a) {
                String[] strArr = new String[d0VarArr.length];
                for (int i10 = 0; i10 < d0VarArr.length; i10++) {
                    strArr[i10] = d0VarArr[i10].f28782a;
                }
                return e(strArr);
            }
            throw new IllegalStateException("no TLS versions for cleartext connections");
        }

        public a(k kVar) {
            this.f28879a = kVar.f28875a;
            this.f28880b = kVar.f28877c;
            this.f28881c = kVar.f28878d;
            this.f28882d = kVar.f28876b;
        }
    }
}
