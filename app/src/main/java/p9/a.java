package p9;

import java.io.IOException;
import java.util.concurrent.TimeUnit;
import n9.a0;
import n9.r;
import n9.t;
import n9.w;
import n9.y;
import p9.c;
import r9.h;
import y9.l;
import y9.r;
import y9.s;
/* compiled from: CacheInterceptor.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
public final class a implements t {

    /* renamed from: a  reason: collision with root package name */
    final f f29906a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: CacheInterceptor.java */
    /* renamed from: p9.a$a  reason: collision with other inner class name */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
    public class C0339a implements s {

        /* renamed from: a  reason: collision with root package name */
        boolean f29907a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ y9.e f29908b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ b f29909c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ y9.d f29910d;

        C0339a(y9.e eVar, b bVar, y9.d dVar) {
            this.f29908b = eVar;
            this.f29909c = bVar;
            this.f29910d = dVar;
        }

        @Override // y9.s
        public long H(y9.c cVar, long j10) throws IOException {
            try {
                long H = this.f29908b.H(cVar, j10);
                if (H == -1) {
                    if (!this.f29907a) {
                        this.f29907a = true;
                        this.f29910d.close();
                    }
                    return -1L;
                }
                cVar.t(this.f29910d.d(), cVar.S() - H, H);
                this.f29910d.s();
                return H;
            } catch (IOException e8) {
                if (!this.f29907a) {
                    this.f29907a = true;
                    this.f29909c.a();
                }
                throw e8;
            }
        }

        @Override // y9.s, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            if (!this.f29907a && !o9.c.p(this, 100, TimeUnit.MILLISECONDS)) {
                this.f29907a = true;
                this.f29909c.a();
            }
            this.f29908b.close();
        }

        @Override // y9.s
        public y9.t e() {
            return this.f29908b.e();
        }
    }

    public a(f fVar) {
        this.f29906a = fVar;
    }

    private a0 b(b bVar, a0 a0Var) throws IOException {
        r b10;
        if (bVar == null || (b10 = bVar.b()) == null) {
            return a0Var;
        }
        return a0Var.J().b(new h(a0Var.t("Content-Type"), a0Var.a().b(), l.d(new C0339a(a0Var.a().t(), bVar, l.c(b10))))).c();
    }

    private static n9.r c(n9.r rVar, n9.r rVar2) {
        r.a aVar = new r.a();
        int g10 = rVar.g();
        for (int i10 = 0; i10 < g10; i10++) {
            String e8 = rVar.e(i10);
            String i11 = rVar.i(i10);
            if ((!"Warning".equalsIgnoreCase(e8) || !i11.startsWith("1")) && (d(e8) || !e(e8) || rVar2.c(e8) == null)) {
                o9.a.f29470a.b(aVar, e8, i11);
            }
        }
        int g11 = rVar2.g();
        for (int i12 = 0; i12 < g11; i12++) {
            String e10 = rVar2.e(i12);
            if (!d(e10) && e(e10)) {
                o9.a.f29470a.b(aVar, e10, rVar2.i(i12));
            }
        }
        return aVar.d();
    }

    static boolean d(String str) {
        return "Content-Length".equalsIgnoreCase(str) || "Content-Encoding".equalsIgnoreCase(str) || "Content-Type".equalsIgnoreCase(str);
    }

    static boolean e(String str) {
        return ("Connection".equalsIgnoreCase(str) || "Keep-Alive".equalsIgnoreCase(str) || "Proxy-Authenticate".equalsIgnoreCase(str) || "Proxy-Authorization".equalsIgnoreCase(str) || "TE".equalsIgnoreCase(str) || "Trailers".equalsIgnoreCase(str) || "Transfer-Encoding".equalsIgnoreCase(str) || "Upgrade".equalsIgnoreCase(str)) ? false : true;
    }

    private static a0 f(a0 a0Var) {
        return (a0Var == null || a0Var.a() == null) ? a0Var : a0Var.J().b(null).c();
    }

    @Override // n9.t
    public a0 a(t.a aVar) throws IOException {
        f fVar = this.f29906a;
        a0 a10 = fVar != null ? fVar.a(aVar.b()) : null;
        c c10 = new c.a(System.currentTimeMillis(), aVar.b(), a10).c();
        y yVar = c10.f29912a;
        a0 a0Var = c10.f29913b;
        f fVar2 = this.f29906a;
        if (fVar2 != null) {
            fVar2.c(c10);
        }
        if (a10 != null && a0Var == null) {
            o9.c.g(a10.a());
        }
        if (yVar == null && a0Var == null) {
            return new a0.a().p(aVar.b()).n(w.HTTP_1_1).g(504).k("Unsatisfiable Request (only-if-cached)").b(o9.c.f29474c).q(-1L).o(System.currentTimeMillis()).c();
        }
        if (yVar == null) {
            return a0Var.J().d(f(a0Var)).c();
        }
        try {
            a0 e8 = aVar.e(yVar);
            if (e8 == null && a10 != null) {
            }
            if (a0Var != null) {
                if (e8.j() == 304) {
                    a0 c11 = a0Var.J().j(c(a0Var.z(), e8.z())).q(e8.S()).o(e8.P()).d(f(a0Var)).l(f(e8)).c();
                    e8.a().close();
                    this.f29906a.b();
                    this.f29906a.f(a0Var, c11);
                    return c11;
                }
                o9.c.g(a0Var.a());
            }
            a0 c12 = e8.J().d(f(a0Var)).l(f(e8)).c();
            if (this.f29906a != null) {
                if (r9.e.c(c12) && c.a(c12, yVar)) {
                    return b(this.f29906a.d(c12), c12);
                }
                if (r9.f.a(yVar.g())) {
                    try {
                        this.f29906a.e(yVar);
                    } catch (IOException unused) {
                    }
                }
            }
            return c12;
        } finally {
            if (a10 != null) {
                o9.c.g(a10.a());
            }
        }
    }
}
