package e4;

import a5.p0;
import e4.q;
import e4.t;
import java.io.IOException;
import n3.d3;
/* compiled from: MaskingMediaPeriod.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class n implements q, q.a {

    /* renamed from: a  reason: collision with root package name */
    public final t.b f25109a;

    /* renamed from: b  reason: collision with root package name */
    private final long f25110b;

    /* renamed from: c  reason: collision with root package name */
    private final z4.b f25111c;

    /* renamed from: d  reason: collision with root package name */
    private t f25112d;

    /* renamed from: e  reason: collision with root package name */
    private q f25113e;

    /* renamed from: f  reason: collision with root package name */
    private q.a f25114f;

    /* renamed from: g  reason: collision with root package name */
    private a f25115g;

    /* renamed from: h  reason: collision with root package name */
    private boolean f25116h;

    /* renamed from: i  reason: collision with root package name */
    private long f25117i = -9223372036854775807L;

    /* compiled from: MaskingMediaPeriod.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public interface a {
        void a(t.b bVar);

        void b(t.b bVar, IOException iOException);
    }

    public n(t.b bVar, z4.b bVar2, long j10) {
        this.f25109a = bVar;
        this.f25111c = bVar2;
        this.f25110b = j10;
    }

    private long q(long j10) {
        long j11 = this.f25117i;
        return j11 != -9223372036854775807L ? j11 : j10;
    }

    @Override // e4.q.a
    public void a(q qVar) {
        ((q.a) p0.j(this.f25114f)).a(this);
        a aVar = this.f25115g;
        if (aVar != null) {
            aVar.a(this.f25109a);
        }
    }

    @Override // e4.q, e4.f0
    public long b() {
        return ((q) p0.j(this.f25113e)).b();
    }

    @Override // e4.q, e4.f0
    public boolean c() {
        q qVar = this.f25113e;
        return qVar != null && qVar.c();
    }

    @Override // e4.q, e4.f0
    public boolean d(long j10) {
        q qVar = this.f25113e;
        return qVar != null && qVar.d(j10);
    }

    @Override // e4.q
    public long e(long j10, d3 d3Var) {
        return ((q) p0.j(this.f25113e)).e(j10, d3Var);
    }

    @Override // e4.q, e4.f0
    public long g() {
        return ((q) p0.j(this.f25113e)).g();
    }

    @Override // e4.q, e4.f0
    public void h(long j10) {
        ((q) p0.j(this.f25113e)).h(j10);
    }

    @Override // e4.q
    public long j(x4.s[] sVarArr, boolean[] zArr, e0[] e0VarArr, boolean[] zArr2, long j10) {
        long j11;
        long j12 = this.f25117i;
        if (j12 == -9223372036854775807L || j10 != this.f25110b) {
            j11 = j10;
        } else {
            this.f25117i = -9223372036854775807L;
            j11 = j12;
        }
        return ((q) p0.j(this.f25113e)).j(sVarArr, zArr, e0VarArr, zArr2, j11);
    }

    @Override // e4.q
    public long k(long j10) {
        return ((q) p0.j(this.f25113e)).k(j10);
    }

    @Override // e4.q
    public long l() {
        return ((q) p0.j(this.f25113e)).l();
    }

    public void m(t.b bVar) {
        long q10 = q(this.f25110b);
        q d10 = ((t) a5.a.e(this.f25112d)).d(bVar, this.f25111c, q10);
        this.f25113e = d10;
        if (this.f25114f != null) {
            d10.r(this, q10);
        }
    }

    public long n() {
        return this.f25117i;
    }

    public long o() {
        return this.f25110b;
    }

    @Override // e4.q
    public void p() throws IOException {
        try {
            q qVar = this.f25113e;
            if (qVar != null) {
                qVar.p();
            } else {
                t tVar = this.f25112d;
                if (tVar != null) {
                    tVar.k();
                }
            }
        } catch (IOException e8) {
            a aVar = this.f25115g;
            if (aVar != null) {
                if (this.f25116h) {
                    return;
                }
                this.f25116h = true;
                aVar.b(this.f25109a, e8);
                return;
            }
            throw e8;
        }
    }

    @Override // e4.q
    public void r(q.a aVar, long j10) {
        this.f25114f = aVar;
        q qVar = this.f25113e;
        if (qVar != null) {
            qVar.r(this, q(this.f25110b));
        }
    }

    @Override // e4.f0.a
    /* renamed from: s */
    public void f(q qVar) {
        ((q.a) p0.j(this.f25114f)).f(this);
    }

    @Override // e4.q
    public m0 t() {
        return ((q) p0.j(this.f25113e)).t();
    }

    @Override // e4.q
    public void u(long j10, boolean z10) {
        ((q) p0.j(this.f25113e)).u(j10, z10);
    }

    public void v(long j10) {
        this.f25117i = j10;
    }

    public void w() {
        if (this.f25113e != null) {
            ((t) a5.a.e(this.f25112d)).g(this.f25113e);
        }
    }

    public void x(t tVar) {
        a5.a.f(this.f25112d == null);
        this.f25112d = tVar;
    }
}
