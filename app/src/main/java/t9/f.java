package t9;

import java.io.IOException;
import java.net.ProtocolException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import n9.a0;
import n9.b0;
import n9.r;
import n9.t;
import n9.v;
import n9.w;
import n9.y;
import y9.s;
/* compiled from: Http2Codec.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
public final class f implements r9.c {

    /* renamed from: f  reason: collision with root package name */
    private static final List<String> f31119f = o9.c.u("connection", "host", "keep-alive", "proxy-connection", "te", "transfer-encoding", "encoding", "upgrade", ":method", ":path", ":scheme", ":authority");

    /* renamed from: g  reason: collision with root package name */
    private static final List<String> f31120g = o9.c.u("connection", "host", "keep-alive", "proxy-connection", "te", "transfer-encoding", "encoding", "upgrade");

    /* renamed from: a  reason: collision with root package name */
    private final t.a f31121a;

    /* renamed from: b  reason: collision with root package name */
    final q9.g f31122b;

    /* renamed from: c  reason: collision with root package name */
    private final g f31123c;

    /* renamed from: d  reason: collision with root package name */
    private i f31124d;

    /* renamed from: e  reason: collision with root package name */
    private final w f31125e;

    /* compiled from: Http2Codec.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
    class a extends y9.h {

        /* renamed from: b  reason: collision with root package name */
        boolean f31126b;

        /* renamed from: c  reason: collision with root package name */
        long f31127c;

        a(s sVar) {
            super(sVar);
            this.f31126b = false;
            this.f31127c = 0L;
        }

        private void b(IOException iOException) {
            if (this.f31126b) {
                return;
            }
            this.f31126b = true;
            f fVar = f.this;
            fVar.f31122b.r(false, fVar, this.f31127c, iOException);
        }

        @Override // y9.h, y9.s
        public long H(y9.c cVar, long j10) throws IOException {
            try {
                long H = a().H(cVar, j10);
                if (H > 0) {
                    this.f31127c += H;
                }
                return H;
            } catch (IOException e8) {
                b(e8);
                throw e8;
            }
        }

        @Override // y9.h, y9.s, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            super.close();
            b(null);
        }
    }

    public f(v vVar, t.a aVar, q9.g gVar, g gVar2) {
        this.f31121a = aVar;
        this.f31122b = gVar;
        this.f31123c = gVar2;
        List<w> x10 = vVar.x();
        w wVar = w.H2_PRIOR_KNOWLEDGE;
        this.f31125e = x10.contains(wVar) ? wVar : w.HTTP_2;
    }

    public static List<c> g(y yVar) {
        r e8 = yVar.e();
        ArrayList arrayList = new ArrayList(e8.g() + 4);
        arrayList.add(new c(c.f31088f, yVar.g()));
        arrayList.add(new c(c.f31089g, r9.i.c(yVar.i())));
        String c10 = yVar.c("Host");
        if (c10 != null) {
            arrayList.add(new c(c.f31091i, c10));
        }
        arrayList.add(new c(c.f31090h, yVar.i().B()));
        int g10 = e8.g();
        for (int i10 = 0; i10 < g10; i10++) {
            y9.f i11 = y9.f.i(e8.e(i10).toLowerCase(Locale.US));
            if (!f31119f.contains(i11.w())) {
                arrayList.add(new c(i11, e8.i(i10)));
            }
        }
        return arrayList;
    }

    public static a0.a h(r rVar, w wVar) throws IOException {
        r.a aVar = new r.a();
        int g10 = rVar.g();
        r9.k kVar = null;
        for (int i10 = 0; i10 < g10; i10++) {
            String e8 = rVar.e(i10);
            String i11 = rVar.i(i10);
            if (e8.equals(":status")) {
                kVar = r9.k.a("HTTP/1.1 " + i11);
            } else if (!f31120g.contains(e8)) {
                o9.a.f29470a.b(aVar, e8, i11);
            }
        }
        if (kVar != null) {
            return new a0.a().n(wVar).g(kVar.f30483b).k(kVar.f30484c).j(aVar.d());
        }
        throw new ProtocolException("Expected ':status' header not present");
    }

    @Override // r9.c
    public b0 a(a0 a0Var) throws IOException {
        q9.g gVar = this.f31122b;
        gVar.f30183f.q(gVar.f30182e);
        return new r9.h(a0Var.t("Content-Type"), r9.e.b(a0Var), y9.l.d(new a(this.f31124d.k())));
    }

    @Override // r9.c
    public void b() throws IOException {
        this.f31124d.j().close();
    }

    @Override // r9.c
    public void c(y yVar) throws IOException {
        if (this.f31124d != null) {
            return;
        }
        i X = this.f31123c.X(g(yVar), yVar.a() != null);
        this.f31124d = X;
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        X.n().g(this.f31121a.a(), timeUnit);
        this.f31124d.u().g(this.f31121a.c(), timeUnit);
    }

    @Override // r9.c
    public void cancel() {
        i iVar = this.f31124d;
        if (iVar != null) {
            iVar.h(b.CANCEL);
        }
    }

    @Override // r9.c
    public a0.a d(boolean z10) throws IOException {
        a0.a h10 = h(this.f31124d.s(), this.f31125e);
        if (z10 && o9.a.f29470a.d(h10) == 100) {
            return null;
        }
        return h10;
    }

    @Override // r9.c
    public void e() throws IOException {
        this.f31123c.flush();
    }

    @Override // r9.c
    public y9.r f(y yVar, long j10) {
        return this.f31124d.j();
    }
}
