package r9;

import java.io.IOException;
import java.net.ProtocolException;
import n9.a0;
import n9.t;
import n9.y;
import y9.l;
import y9.r;
/* compiled from: CallServerInterceptor.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
public final class b implements t {

    /* renamed from: a  reason: collision with root package name */
    private final boolean f30455a;

    /* compiled from: CallServerInterceptor.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
    static final class a extends y9.g {

        /* renamed from: b  reason: collision with root package name */
        long f30456b;

        a(r rVar) {
            super(rVar);
        }

        @Override // y9.g, y9.r
        public void A(y9.c cVar, long j10) throws IOException {
            super.A(cVar, j10);
            this.f30456b += j10;
        }
    }

    public b(boolean z10) {
        this.f30455a = z10;
    }

    @Override // n9.t
    public a0 a(t.a aVar) throws IOException {
        a0 c10;
        g gVar = (g) aVar;
        c i10 = gVar.i();
        q9.g k10 = gVar.k();
        q9.c cVar = (q9.c) gVar.g();
        y b10 = gVar.b();
        long currentTimeMillis = System.currentTimeMillis();
        gVar.h().o(gVar.f());
        i10.c(b10);
        gVar.h().n(gVar.f(), b10);
        a0.a aVar2 = null;
        if (f.b(b10.g()) && b10.a() != null) {
            if ("100-continue".equalsIgnoreCase(b10.c("Expect"))) {
                i10.e();
                gVar.h().s(gVar.f());
                aVar2 = i10.d(true);
            }
            if (aVar2 == null) {
                gVar.h().m(gVar.f());
                a aVar3 = new a(i10.f(b10, b10.a().a()));
                y9.d c11 = l.c(aVar3);
                b10.a().f(c11);
                c11.close();
                gVar.h().l(gVar.f(), aVar3.f30456b);
            } else if (!cVar.n()) {
                k10.j();
            }
        }
        i10.b();
        if (aVar2 == null) {
            gVar.h().s(gVar.f());
            aVar2 = i10.d(false);
        }
        a0 c12 = aVar2.p(b10).h(k10.d().k()).q(currentTimeMillis).o(System.currentTimeMillis()).c();
        int j10 = c12.j();
        if (j10 == 100) {
            c12 = i10.d(false).p(b10).h(k10.d().k()).q(currentTimeMillis).o(System.currentTimeMillis()).c();
            j10 = c12.j();
        }
        gVar.h().r(gVar.f(), c12);
        if (this.f30455a && j10 == 101) {
            c10 = c12.J().b(o9.c.f29474c).c();
        } else {
            c10 = c12.J().b(i10.a(c12)).c();
        }
        if ("close".equalsIgnoreCase(c10.R().c("Connection")) || "close".equalsIgnoreCase(c10.t("Connection"))) {
            k10.j();
        }
        if ((j10 == 204 || j10 == 205) && c10.a().b() > 0) {
            throw new ProtocolException("HTTP " + j10 + " had non-zero Content-Length: " + c10.a().b());
        }
        return c10;
    }
}
