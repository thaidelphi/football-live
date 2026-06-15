package n3;
/* compiled from: DefaultMediaClock.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
final class l implements a5.v {

    /* renamed from: a  reason: collision with root package name */
    private final a5.h0 f28117a;

    /* renamed from: b  reason: collision with root package name */
    private final a f28118b;

    /* renamed from: c  reason: collision with root package name */
    private y2 f28119c;

    /* renamed from: d  reason: collision with root package name */
    private a5.v f28120d;

    /* renamed from: e  reason: collision with root package name */
    private boolean f28121e = true;

    /* renamed from: f  reason: collision with root package name */
    private boolean f28122f;

    /* compiled from: DefaultMediaClock.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public interface a {
        void w(o2 o2Var);
    }

    public l(a aVar, a5.d dVar) {
        this.f28118b = aVar;
        this.f28117a = new a5.h0(dVar);
    }

    private boolean f(boolean z10) {
        y2 y2Var = this.f28119c;
        return y2Var == null || y2Var.c() || (!this.f28119c.isReady() && (z10 || this.f28119c.g()));
    }

    private void j(boolean z10) {
        if (f(z10)) {
            this.f28121e = true;
            if (this.f28122f) {
                this.f28117a.c();
                return;
            }
            return;
        }
        a5.v vVar = (a5.v) a5.a.e(this.f28120d);
        long o10 = vVar.o();
        if (this.f28121e) {
            if (o10 < this.f28117a.o()) {
                this.f28117a.e();
                return;
            }
            this.f28121e = false;
            if (this.f28122f) {
                this.f28117a.c();
            }
        }
        this.f28117a.a(o10);
        o2 b10 = vVar.b();
        if (b10.equals(this.f28117a.b())) {
            return;
        }
        this.f28117a.d(b10);
        this.f28118b.w(b10);
    }

    public void a(y2 y2Var) {
        if (y2Var == this.f28119c) {
            this.f28120d = null;
            this.f28119c = null;
            this.f28121e = true;
        }
    }

    @Override // a5.v
    public o2 b() {
        a5.v vVar = this.f28120d;
        if (vVar != null) {
            return vVar.b();
        }
        return this.f28117a.b();
    }

    public void c(y2 y2Var) throws q {
        a5.v vVar;
        a5.v w10 = y2Var.w();
        if (w10 == null || w10 == (vVar = this.f28120d)) {
            return;
        }
        if (vVar == null) {
            this.f28120d = w10;
            this.f28119c = y2Var;
            w10.d(this.f28117a.b());
            return;
        }
        throw q.i(new IllegalStateException("Multiple renderer media clocks enabled."));
    }

    @Override // a5.v
    public void d(o2 o2Var) {
        a5.v vVar = this.f28120d;
        if (vVar != null) {
            vVar.d(o2Var);
            o2Var = this.f28120d.b();
        }
        this.f28117a.d(o2Var);
    }

    public void e(long j10) {
        this.f28117a.a(j10);
    }

    public void g() {
        this.f28122f = true;
        this.f28117a.c();
    }

    public void h() {
        this.f28122f = false;
        this.f28117a.e();
    }

    public long i(boolean z10) {
        j(z10);
        return o();
    }

    @Override // a5.v
    public long o() {
        if (this.f28121e) {
            return this.f28117a.o();
        }
        return ((a5.v) a5.a.e(this.f28120d)).o();
    }
}
