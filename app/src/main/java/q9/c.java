package q9;

import com.google.android.gms.common.api.Api;
import com.ironsource.j3;
import java.io.IOException;
import java.lang.ref.Reference;
import java.net.ConnectException;
import java.net.Proxy;
import java.net.Socket;
import java.net.SocketException;
import java.net.SocketTimeoutException;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLSocket;
import n9.a0;
import n9.c0;
import n9.i;
import n9.j;
import n9.k;
import n9.p;
import n9.q;
import n9.s;
import n9.t;
import n9.v;
import n9.w;
import n9.y;
import t9.g;
import y9.l;
/* compiled from: RealConnection.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
public final class c extends g.j implements i {

    /* renamed from: b  reason: collision with root package name */
    private final j f30151b;

    /* renamed from: c  reason: collision with root package name */
    private final c0 f30152c;

    /* renamed from: d  reason: collision with root package name */
    private Socket f30153d;

    /* renamed from: e  reason: collision with root package name */
    private Socket f30154e;

    /* renamed from: f  reason: collision with root package name */
    private q f30155f;

    /* renamed from: g  reason: collision with root package name */
    private w f30156g;

    /* renamed from: h  reason: collision with root package name */
    private t9.g f30157h;

    /* renamed from: i  reason: collision with root package name */
    private y9.e f30158i;

    /* renamed from: j  reason: collision with root package name */
    private y9.d f30159j;

    /* renamed from: k  reason: collision with root package name */
    public boolean f30160k;

    /* renamed from: l  reason: collision with root package name */
    public int f30161l;

    /* renamed from: m  reason: collision with root package name */
    public int f30162m = 1;

    /* renamed from: n  reason: collision with root package name */
    public final List<Reference<g>> f30163n = new ArrayList();

    /* renamed from: o  reason: collision with root package name */
    public long f30164o = Long.MAX_VALUE;

    public c(j jVar, c0 c0Var) {
        this.f30151b = jVar;
        this.f30152c = c0Var;
    }

    private void e(int i10, int i11, n9.e eVar, p pVar) throws IOException {
        Socket createSocket;
        Proxy b10 = this.f30152c.b();
        n9.a a10 = this.f30152c.a();
        if (b10.type() != Proxy.Type.DIRECT && b10.type() != Proxy.Type.HTTP) {
            createSocket = new Socket(b10);
        } else {
            createSocket = a10.j().createSocket();
        }
        this.f30153d = createSocket;
        pVar.f(eVar, this.f30152c.d(), b10);
        this.f30153d.setSoTimeout(i11);
        try {
            v9.g.l().h(this.f30153d, this.f30152c.d(), i10);
            try {
                this.f30158i = l.d(l.m(this.f30153d));
                this.f30159j = l.c(l.i(this.f30153d));
            } catch (NullPointerException e8) {
                if ("throw with null exception".equals(e8.getMessage())) {
                    throw new IOException(e8);
                }
            }
        } catch (ConnectException e10) {
            ConnectException connectException = new ConnectException("Failed to connect to " + this.f30152c.d());
            connectException.initCause(e10);
            throw connectException;
        }
    }

    private void f(b bVar) throws IOException {
        SSLSocket sSLSocket;
        w wVar;
        n9.a a10 = this.f30152c.a();
        SSLSocket sSLSocket2 = null;
        try {
            try {
                sSLSocket = (SSLSocket) a10.k().createSocket(this.f30153d, a10.l().l(), a10.l().w(), true);
            } catch (AssertionError e8) {
                e = e8;
            }
        } catch (Throwable th) {
            th = th;
        }
        try {
            k a11 = bVar.a(sSLSocket);
            if (a11.f()) {
                v9.g.l().g(sSLSocket, a10.l().l(), a10.f());
            }
            sSLSocket.startHandshake();
            SSLSession session = sSLSocket.getSession();
            q b10 = q.b(session);
            if (!a10.e().verify(a10.l().l(), session)) {
                List<Certificate> e10 = b10.e();
                if (!e10.isEmpty()) {
                    X509Certificate x509Certificate = (X509Certificate) e10.get(0);
                    throw new SSLPeerUnverifiedException("Hostname " + a10.l().l() + " not verified:\n    certificate: " + n9.g.c(x509Certificate) + "\n    DN: " + x509Certificate.getSubjectDN().getName() + "\n    subjectAltNames: " + x9.d.a(x509Certificate));
                }
                throw new SSLPeerUnverifiedException("Hostname " + a10.l().l() + " not verified (no certificates)");
            }
            a10.a().a(a10.l().l(), b10.e());
            String o10 = a11.f() ? v9.g.l().o(sSLSocket) : null;
            this.f30154e = sSLSocket;
            this.f30158i = l.d(l.m(sSLSocket));
            this.f30159j = l.c(l.i(this.f30154e));
            this.f30155f = b10;
            if (o10 != null) {
                wVar = w.a(o10);
            } else {
                wVar = w.HTTP_1_1;
            }
            this.f30156g = wVar;
            v9.g.l().a(sSLSocket);
        } catch (AssertionError e11) {
            e = e11;
            if (!o9.c.A(e)) {
                throw e;
            }
            throw new IOException(e);
        } catch (Throwable th2) {
            th = th2;
            sSLSocket2 = sSLSocket;
            if (sSLSocket2 != null) {
                v9.g.l().a(sSLSocket2);
            }
            o9.c.h(sSLSocket2);
            throw th;
        }
    }

    private void g(int i10, int i11, int i12, n9.e eVar, p pVar) throws IOException {
        y i13 = i();
        s i14 = i13.i();
        for (int i15 = 0; i15 < 21; i15++) {
            e(i10, i11, eVar, pVar);
            i13 = h(i11, i12, i13, i14);
            if (i13 == null) {
                return;
            }
            o9.c.h(this.f30153d);
            this.f30153d = null;
            this.f30159j = null;
            this.f30158i = null;
            pVar.d(eVar, this.f30152c.d(), this.f30152c.b(), null);
        }
    }

    private y h(int i10, int i11, y yVar, s sVar) throws IOException {
        String str = "CONNECT " + o9.c.s(sVar, true) + " HTTP/1.1";
        while (true) {
            s9.a aVar = new s9.a(null, null, this.f30158i, this.f30159j);
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            this.f30158i.e().g(i10, timeUnit);
            this.f30159j.e().g(i11, timeUnit);
            aVar.o(yVar.e(), str);
            aVar.b();
            a0 c10 = aVar.d(false).p(yVar).c();
            long b10 = r9.e.b(c10);
            if (b10 == -1) {
                b10 = 0;
            }
            y9.s k10 = aVar.k(b10);
            o9.c.D(k10, Api.BaseClientBuilder.API_PRIORITY_OTHER, timeUnit);
            k10.close();
            int j10 = c10.j();
            if (j10 == 200) {
                if (this.f30158i.d().i0() && this.f30159j.d().i0()) {
                    return null;
                }
                throw new IOException("TLS tunnel buffered too many bytes!");
            } else if (j10 == 407) {
                y a10 = this.f30152c.a().h().a(this.f30152c, c10);
                if (a10 != null) {
                    if ("close".equalsIgnoreCase(c10.t("Connection"))) {
                        return a10;
                    }
                    yVar = a10;
                } else {
                    throw new IOException("Failed to authenticate with proxy");
                }
            } else {
                throw new IOException("Unexpected response code for CONNECT: " + c10.j());
            }
        }
    }

    private y i() throws IOException {
        y b10 = new y.a().i(this.f30152c.a().l()).f("CONNECT", null).d("Host", o9.c.s(this.f30152c.a().l(), true)).d("Proxy-Connection", "Keep-Alive").d("User-Agent", o9.d.a()).b();
        y a10 = this.f30152c.a().h().a(this.f30152c, new a0.a().p(b10).n(w.HTTP_1_1).g(j3.a.b.f17902g).k("Preemptive Authenticate").b(o9.c.f29474c).q(-1L).o(-1L).i("Proxy-Authenticate", "OkHttp-Preemptive").c());
        return a10 != null ? a10 : b10;
    }

    private void j(b bVar, int i10, n9.e eVar, p pVar) throws IOException {
        if (this.f30152c.a().k() == null) {
            List<w> f10 = this.f30152c.a().f();
            w wVar = w.H2_PRIOR_KNOWLEDGE;
            if (f10.contains(wVar)) {
                this.f30154e = this.f30153d;
                this.f30156g = wVar;
                r(i10);
                return;
            }
            this.f30154e = this.f30153d;
            this.f30156g = w.HTTP_1_1;
            return;
        }
        pVar.u(eVar);
        f(bVar);
        pVar.t(eVar, this.f30155f);
        if (this.f30156g == w.HTTP_2) {
            r(i10);
        }
    }

    private void r(int i10) throws IOException {
        this.f30154e.setSoTimeout(0);
        t9.g a10 = new g.h(true).d(this.f30154e, this.f30152c.a().l().l(), this.f30158i, this.f30159j).b(this).c(i10).a();
        this.f30157h = a10;
        a10.J0();
    }

    @Override // t9.g.j
    public void a(t9.g gVar) {
        synchronized (this.f30151b) {
            this.f30162m = gVar.R();
        }
    }

    @Override // t9.g.j
    public void b(t9.i iVar) throws IOException {
        iVar.f(t9.b.REFUSED_STREAM);
    }

    public void c() {
        o9.c.h(this.f30153d);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0090 A[Catch: IOException -> 0x00f9, TRY_LEAVE, TryCatch #0 {IOException -> 0x00f9, blocks: (B:18:0x0088, B:20:0x0090), top: B:66:0x0088 }] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00f4 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0142 A[EDGE_INSN: B:76:0x0142->B:61:0x0142 ?: BREAK  ] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void d(int r17, int r18, int r19, int r20, boolean r21, n9.e r22, n9.p r23) {
        /*
            Method dump skipped, instructions count: 344
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: q9.c.d(int, int, int, int, boolean, n9.e, n9.p):void");
    }

    public q k() {
        return this.f30155f;
    }

    public boolean l(n9.a aVar, c0 c0Var) {
        if (this.f30163n.size() >= this.f30162m || this.f30160k || !o9.a.f29470a.g(this.f30152c.a(), aVar)) {
            return false;
        }
        if (aVar.l().l().equals(p().a().l().l())) {
            return true;
        }
        if (this.f30157h != null && c0Var != null && c0Var.b().type() == Proxy.Type.DIRECT && this.f30152c.b().type() == Proxy.Type.DIRECT && this.f30152c.d().equals(c0Var.d()) && c0Var.a().e() == x9.d.f32809a && s(aVar.l())) {
            try {
                aVar.a().a(aVar.l().l(), k().e());
                return true;
            } catch (SSLPeerUnverifiedException unused) {
                return false;
            }
        }
        return false;
    }

    public boolean m(boolean z10) {
        if (this.f30154e.isClosed() || this.f30154e.isInputShutdown() || this.f30154e.isOutputShutdown()) {
            return false;
        }
        t9.g gVar = this.f30157h;
        if (gVar != null) {
            return gVar.P(System.nanoTime());
        }
        if (z10) {
            try {
                int soTimeout = this.f30154e.getSoTimeout();
                try {
                    this.f30154e.setSoTimeout(1);
                    return !this.f30158i.i0();
                } finally {
                    this.f30154e.setSoTimeout(soTimeout);
                }
            } catch (SocketTimeoutException unused) {
            } catch (IOException unused2) {
                return false;
            }
        }
        return true;
    }

    public boolean n() {
        return this.f30157h != null;
    }

    public r9.c o(v vVar, t.a aVar, g gVar) throws SocketException {
        if (this.f30157h != null) {
            return new t9.f(vVar, aVar, gVar, this.f30157h);
        }
        this.f30154e.setSoTimeout(aVar.a());
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        this.f30158i.e().g(aVar.a(), timeUnit);
        this.f30159j.e().g(aVar.c(), timeUnit);
        return new s9.a(vVar, gVar, this.f30158i, this.f30159j);
    }

    public c0 p() {
        return this.f30152c;
    }

    public Socket q() {
        return this.f30154e;
    }

    public boolean s(s sVar) {
        if (sVar.w() != this.f30152c.a().l().w()) {
            return false;
        }
        if (sVar.l().equals(this.f30152c.a().l().l())) {
            return true;
        }
        return this.f30155f != null && x9.d.f32809a.c(sVar.l(), (X509Certificate) this.f30155f.e().get(0));
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Connection{");
        sb.append(this.f30152c.a().l().l());
        sb.append(":");
        sb.append(this.f30152c.a().l().w());
        sb.append(", proxy=");
        sb.append(this.f30152c.b());
        sb.append(" hostAddress=");
        sb.append(this.f30152c.d());
        sb.append(" cipherSuite=");
        q qVar = this.f30155f;
        sb.append(qVar != null ? qVar.a() : "none");
        sb.append(" protocol=");
        sb.append(this.f30156g);
        sb.append('}');
        return sb.toString();
    }
}
