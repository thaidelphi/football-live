package n9;

import com.unity3d.services.UnityAdsConstants;
import java.io.IOException;
import java.net.Proxy;
import java.net.ProxySelector;
import java.net.Socket;
import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import javax.net.SocketFactory;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;
import javax.net.ssl.X509TrustManager;
import n9.a0;
import n9.e;
import n9.p;
import n9.r;
/* compiled from: OkHttpClient.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
public class v implements Cloneable, e.a {
    static final List<w> C = o9.c.u(w.HTTP_2, w.HTTP_1_1);
    static final List<k> D = o9.c.u(k.f28872h, k.f28874j);
    final int A;
    final int B;

    /* renamed from: a  reason: collision with root package name */
    final n f28937a;

    /* renamed from: b  reason: collision with root package name */
    final Proxy f28938b;

    /* renamed from: c  reason: collision with root package name */
    final List<w> f28939c;

    /* renamed from: d  reason: collision with root package name */
    final List<k> f28940d;

    /* renamed from: e  reason: collision with root package name */
    final List<t> f28941e;

    /* renamed from: f  reason: collision with root package name */
    final List<t> f28942f;

    /* renamed from: g  reason: collision with root package name */
    final p.c f28943g;

    /* renamed from: h  reason: collision with root package name */
    final ProxySelector f28944h;

    /* renamed from: i  reason: collision with root package name */
    final m f28945i;

    /* renamed from: j  reason: collision with root package name */
    final c f28946j;

    /* renamed from: k  reason: collision with root package name */
    final p9.f f28947k;

    /* renamed from: l  reason: collision with root package name */
    final SocketFactory f28948l;

    /* renamed from: m  reason: collision with root package name */
    final SSLSocketFactory f28949m;

    /* renamed from: n  reason: collision with root package name */
    final x9.c f28950n;

    /* renamed from: o  reason: collision with root package name */
    final HostnameVerifier f28951o;

    /* renamed from: p  reason: collision with root package name */
    final g f28952p;

    /* renamed from: q  reason: collision with root package name */
    final n9.b f28953q;

    /* renamed from: r  reason: collision with root package name */
    final n9.b f28954r;

    /* renamed from: s  reason: collision with root package name */
    final j f28955s;

    /* renamed from: t  reason: collision with root package name */
    final o f28956t;

    /* renamed from: u  reason: collision with root package name */
    final boolean f28957u;

    /* renamed from: v  reason: collision with root package name */
    final boolean f28958v;

    /* renamed from: w  reason: collision with root package name */
    final boolean f28959w;

    /* renamed from: x  reason: collision with root package name */
    final int f28960x;

    /* renamed from: y  reason: collision with root package name */
    final int f28961y;

    /* renamed from: z  reason: collision with root package name */
    final int f28962z;

    /* compiled from: OkHttpClient.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
    class a extends o9.a {
        a() {
        }

        @Override // o9.a
        public void a(r.a aVar, String str) {
            aVar.b(str);
        }

        @Override // o9.a
        public void b(r.a aVar, String str, String str2) {
            aVar.c(str, str2);
        }

        @Override // o9.a
        public void c(k kVar, SSLSocket sSLSocket, boolean z10) {
            kVar.a(sSLSocket, z10);
        }

        @Override // o9.a
        public int d(a0.a aVar) {
            return aVar.f28702c;
        }

        @Override // o9.a
        public boolean e(j jVar, q9.c cVar) {
            return jVar.b(cVar);
        }

        @Override // o9.a
        public Socket f(j jVar, n9.a aVar, q9.g gVar) {
            return jVar.c(aVar, gVar);
        }

        @Override // o9.a
        public boolean g(n9.a aVar, n9.a aVar2) {
            return aVar.d(aVar2);
        }

        @Override // o9.a
        public q9.c h(j jVar, n9.a aVar, q9.g gVar, c0 c0Var) {
            return jVar.d(aVar, gVar, c0Var);
        }

        @Override // o9.a
        public void i(j jVar, q9.c cVar) {
            jVar.f(cVar);
        }

        @Override // o9.a
        public q9.d j(j jVar) {
            return jVar.f28866e;
        }

        @Override // o9.a
        public IOException k(e eVar, IOException iOException) {
            return ((x) eVar).k(iOException);
        }
    }

    static {
        o9.a.f29470a = new a();
    }

    public v() {
        this(new b());
    }

    private static SSLSocketFactory v(X509TrustManager x509TrustManager) {
        try {
            SSLContext n10 = v9.g.l().n();
            n10.init(null, new TrustManager[]{x509TrustManager}, null);
            return n10.getSocketFactory();
        } catch (GeneralSecurityException e8) {
            throw o9.c.b("No System TLS", e8);
        }
    }

    public ProxySelector A() {
        return this.f28944h;
    }

    public int B() {
        return this.f28962z;
    }

    public boolean C() {
        return this.f28959w;
    }

    public SocketFactory D() {
        return this.f28948l;
    }

    public SSLSocketFactory E() {
        return this.f28949m;
    }

    public int F() {
        return this.A;
    }

    @Override // n9.e.a
    public e c(y yVar) {
        return x.i(this, yVar, false);
    }

    public n9.b d() {
        return this.f28954r;
    }

    public c e() {
        return this.f28946j;
    }

    public int f() {
        return this.f28960x;
    }

    public g g() {
        return this.f28952p;
    }

    public int h() {
        return this.f28961y;
    }

    public j i() {
        return this.f28955s;
    }

    public List<k> j() {
        return this.f28940d;
    }

    public m k() {
        return this.f28945i;
    }

    public n l() {
        return this.f28937a;
    }

    public o m() {
        return this.f28956t;
    }

    public p.c n() {
        return this.f28943g;
    }

    public boolean o() {
        return this.f28958v;
    }

    public boolean p() {
        return this.f28957u;
    }

    public HostnameVerifier q() {
        return this.f28951o;
    }

    public List<t> r() {
        return this.f28941e;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public p9.f s() {
        c cVar = this.f28946j;
        return cVar != null ? cVar.f28716a : this.f28947k;
    }

    public List<t> t() {
        return this.f28942f;
    }

    public b u() {
        return new b(this);
    }

    public int w() {
        return this.B;
    }

    public List<w> x() {
        return this.f28939c;
    }

    public Proxy y() {
        return this.f28938b;
    }

    public n9.b z() {
        return this.f28953q;
    }

    v(b bVar) {
        boolean z10;
        this.f28937a = bVar.f28963a;
        this.f28938b = bVar.f28964b;
        this.f28939c = bVar.f28965c;
        List<k> list = bVar.f28966d;
        this.f28940d = list;
        this.f28941e = o9.c.t(bVar.f28967e);
        this.f28942f = o9.c.t(bVar.f28968f);
        this.f28943g = bVar.f28969g;
        this.f28944h = bVar.f28970h;
        this.f28945i = bVar.f28971i;
        this.f28946j = bVar.f28972j;
        this.f28947k = bVar.f28973k;
        this.f28948l = bVar.f28974l;
        loop0: while (true) {
            z10 = false;
            for (k kVar : list) {
                z10 = (z10 || kVar.d()) ? true : z10;
            }
        }
        SSLSocketFactory sSLSocketFactory = bVar.f28975m;
        if (sSLSocketFactory == null && z10) {
            X509TrustManager C2 = o9.c.C();
            this.f28949m = v(C2);
            this.f28950n = x9.c.b(C2);
        } else {
            this.f28949m = sSLSocketFactory;
            this.f28950n = bVar.f28976n;
        }
        if (this.f28949m != null) {
            v9.g.l().f(this.f28949m);
        }
        this.f28951o = bVar.f28977o;
        this.f28952p = bVar.f28978p.f(this.f28950n);
        this.f28953q = bVar.f28979q;
        this.f28954r = bVar.f28980r;
        this.f28955s = bVar.f28981s;
        this.f28956t = bVar.f28982t;
        this.f28957u = bVar.f28983u;
        this.f28958v = bVar.f28984v;
        this.f28959w = bVar.f28985w;
        this.f28960x = bVar.f28986x;
        this.f28961y = bVar.f28987y;
        this.f28962z = bVar.f28988z;
        this.A = bVar.A;
        this.B = bVar.B;
        if (!this.f28941e.contains(null)) {
            if (this.f28942f.contains(null)) {
                throw new IllegalStateException("Null network interceptor: " + this.f28942f);
            }
            return;
        }
        throw new IllegalStateException("Null interceptor: " + this.f28941e);
    }

    /* compiled from: OkHttpClient.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
    public static final class b {
        int A;
        int B;

        /* renamed from: a  reason: collision with root package name */
        n f28963a;

        /* renamed from: b  reason: collision with root package name */
        Proxy f28964b;

        /* renamed from: c  reason: collision with root package name */
        List<w> f28965c;

        /* renamed from: d  reason: collision with root package name */
        List<k> f28966d;

        /* renamed from: e  reason: collision with root package name */
        final List<t> f28967e;

        /* renamed from: f  reason: collision with root package name */
        final List<t> f28968f;

        /* renamed from: g  reason: collision with root package name */
        p.c f28969g;

        /* renamed from: h  reason: collision with root package name */
        ProxySelector f28970h;

        /* renamed from: i  reason: collision with root package name */
        m f28971i;

        /* renamed from: j  reason: collision with root package name */
        c f28972j;

        /* renamed from: k  reason: collision with root package name */
        p9.f f28973k;

        /* renamed from: l  reason: collision with root package name */
        SocketFactory f28974l;

        /* renamed from: m  reason: collision with root package name */
        SSLSocketFactory f28975m;

        /* renamed from: n  reason: collision with root package name */
        x9.c f28976n;

        /* renamed from: o  reason: collision with root package name */
        HostnameVerifier f28977o;

        /* renamed from: p  reason: collision with root package name */
        g f28978p;

        /* renamed from: q  reason: collision with root package name */
        n9.b f28979q;

        /* renamed from: r  reason: collision with root package name */
        n9.b f28980r;

        /* renamed from: s  reason: collision with root package name */
        j f28981s;

        /* renamed from: t  reason: collision with root package name */
        o f28982t;

        /* renamed from: u  reason: collision with root package name */
        boolean f28983u;

        /* renamed from: v  reason: collision with root package name */
        boolean f28984v;

        /* renamed from: w  reason: collision with root package name */
        boolean f28985w;

        /* renamed from: x  reason: collision with root package name */
        int f28986x;

        /* renamed from: y  reason: collision with root package name */
        int f28987y;

        /* renamed from: z  reason: collision with root package name */
        int f28988z;

        public b() {
            this.f28967e = new ArrayList();
            this.f28968f = new ArrayList();
            this.f28963a = new n();
            this.f28965c = v.C;
            this.f28966d = v.D;
            this.f28969g = p.k(p.f28905a);
            ProxySelector proxySelector = ProxySelector.getDefault();
            this.f28970h = proxySelector;
            if (proxySelector == null) {
                this.f28970h = new w9.a();
            }
            this.f28971i = m.f28896a;
            this.f28974l = SocketFactory.getDefault();
            this.f28977o = x9.d.f32809a;
            this.f28978p = g.f28783c;
            n9.b bVar = n9.b.f28712a;
            this.f28979q = bVar;
            this.f28980r = bVar;
            this.f28981s = new j();
            this.f28982t = o.f28904a;
            this.f28983u = true;
            this.f28984v = true;
            this.f28985w = true;
            this.f28986x = 0;
            this.f28987y = UnityAdsConstants.AdOperations.SHOW_TIMEOUT_MS;
            this.f28988z = UnityAdsConstants.AdOperations.SHOW_TIMEOUT_MS;
            this.A = UnityAdsConstants.AdOperations.SHOW_TIMEOUT_MS;
            this.B = 0;
        }

        public v a() {
            return new v(this);
        }

        public b b(c cVar) {
            this.f28972j = cVar;
            this.f28973k = null;
            return this;
        }

        public b c(long j10, TimeUnit timeUnit) {
            this.f28987y = o9.c.e("timeout", j10, timeUnit);
            return this;
        }

        public b d(long j10, TimeUnit timeUnit) {
            this.f28988z = o9.c.e("timeout", j10, timeUnit);
            return this;
        }

        public b e(long j10, TimeUnit timeUnit) {
            this.A = o9.c.e("timeout", j10, timeUnit);
            return this;
        }

        b(v vVar) {
            ArrayList arrayList = new ArrayList();
            this.f28967e = arrayList;
            ArrayList arrayList2 = new ArrayList();
            this.f28968f = arrayList2;
            this.f28963a = vVar.f28937a;
            this.f28964b = vVar.f28938b;
            this.f28965c = vVar.f28939c;
            this.f28966d = vVar.f28940d;
            arrayList.addAll(vVar.f28941e);
            arrayList2.addAll(vVar.f28942f);
            this.f28969g = vVar.f28943g;
            this.f28970h = vVar.f28944h;
            this.f28971i = vVar.f28945i;
            this.f28973k = vVar.f28947k;
            this.f28972j = vVar.f28946j;
            this.f28974l = vVar.f28948l;
            this.f28975m = vVar.f28949m;
            this.f28976n = vVar.f28950n;
            this.f28977o = vVar.f28951o;
            this.f28978p = vVar.f28952p;
            this.f28979q = vVar.f28953q;
            this.f28980r = vVar.f28954r;
            this.f28981s = vVar.f28955s;
            this.f28982t = vVar.f28956t;
            this.f28983u = vVar.f28957u;
            this.f28984v = vVar.f28958v;
            this.f28985w = vVar.f28959w;
            this.f28986x = vVar.f28960x;
            this.f28987y = vVar.f28961y;
            this.f28988z = vVar.f28962z;
            this.A = vVar.A;
            this.B = vVar.B;
        }
    }
}
