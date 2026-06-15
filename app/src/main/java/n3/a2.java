package n3;

import e4.t;
/* compiled from: MediaPeriodHolder.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
final class a2 {

    /* renamed from: a  reason: collision with root package name */
    public final e4.q f27864a;

    /* renamed from: b  reason: collision with root package name */
    public final Object f27865b;

    /* renamed from: c  reason: collision with root package name */
    public final e4.e0[] f27866c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f27867d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f27868e;

    /* renamed from: f  reason: collision with root package name */
    public b2 f27869f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f27870g;

    /* renamed from: h  reason: collision with root package name */
    private final boolean[] f27871h;

    /* renamed from: i  reason: collision with root package name */
    private final a3[] f27872i;

    /* renamed from: j  reason: collision with root package name */
    private final x4.b0 f27873j;

    /* renamed from: k  reason: collision with root package name */
    private final g2 f27874k;

    /* renamed from: l  reason: collision with root package name */
    private a2 f27875l;

    /* renamed from: m  reason: collision with root package name */
    private e4.m0 f27876m;

    /* renamed from: n  reason: collision with root package name */
    private x4.c0 f27877n;

    /* renamed from: o  reason: collision with root package name */
    private long f27878o;

    public a2(a3[] a3VarArr, long j10, x4.b0 b0Var, z4.b bVar, g2 g2Var, b2 b2Var, x4.c0 c0Var) {
        this.f27872i = a3VarArr;
        this.f27878o = j10;
        this.f27873j = b0Var;
        this.f27874k = g2Var;
        t.b bVar2 = b2Var.f27887a;
        this.f27865b = bVar2.f25139a;
        this.f27869f = b2Var;
        this.f27876m = e4.m0.f25104d;
        this.f27877n = c0Var;
        this.f27866c = new e4.e0[a3VarArr.length];
        this.f27871h = new boolean[a3VarArr.length];
        this.f27864a = e(bVar2, g2Var, bVar, b2Var.f27888b, b2Var.f27890d);
    }

    private void c(e4.e0[] e0VarArr) {
        int i10 = 0;
        while (true) {
            a3[] a3VarArr = this.f27872i;
            if (i10 >= a3VarArr.length) {
                return;
            }
            if (a3VarArr[i10].f() == -2 && this.f27877n.c(i10)) {
                e0VarArr[i10] = new e4.j();
            }
            i10++;
        }
    }

    private static e4.q e(t.b bVar, g2 g2Var, z4.b bVar2, long j10, long j11) {
        e4.q h10 = g2Var.h(bVar, bVar2, j10);
        return j11 != -9223372036854775807L ? new e4.c(h10, true, 0L, j11) : h10;
    }

    private void f() {
        if (!r()) {
            return;
        }
        int i10 = 0;
        while (true) {
            x4.c0 c0Var = this.f27877n;
            if (i10 >= c0Var.f32589a) {
                return;
            }
            boolean c10 = c0Var.c(i10);
            x4.s sVar = this.f27877n.f32591c[i10];
            if (c10 && sVar != null) {
                sVar.e();
            }
            i10++;
        }
    }

    private void g(e4.e0[] e0VarArr) {
        int i10 = 0;
        while (true) {
            a3[] a3VarArr = this.f27872i;
            if (i10 >= a3VarArr.length) {
                return;
            }
            if (a3VarArr[i10].f() == -2) {
                e0VarArr[i10] = null;
            }
            i10++;
        }
    }

    private void h() {
        if (!r()) {
            return;
        }
        int i10 = 0;
        while (true) {
            x4.c0 c0Var = this.f27877n;
            if (i10 >= c0Var.f32589a) {
                return;
            }
            boolean c10 = c0Var.c(i10);
            x4.s sVar = this.f27877n.f32591c[i10];
            if (c10 && sVar != null) {
                sVar.p();
            }
            i10++;
        }
    }

    private boolean r() {
        return this.f27875l == null;
    }

    private static void u(g2 g2Var, e4.q qVar) {
        try {
            if (qVar instanceof e4.c) {
                g2Var.z(((e4.c) qVar).f24992a);
            } else {
                g2Var.z(qVar);
            }
        } catch (RuntimeException e8) {
            a5.t.d("MediaPeriodHolder", "Period release failed.", e8);
        }
    }

    public void A() {
        e4.q qVar = this.f27864a;
        if (qVar instanceof e4.c) {
            long j10 = this.f27869f.f27890d;
            if (j10 == -9223372036854775807L) {
                j10 = Long.MIN_VALUE;
            }
            ((e4.c) qVar).s(0L, j10);
        }
    }

    public long a(x4.c0 c0Var, long j10, boolean z10) {
        return b(c0Var, j10, z10, new boolean[this.f27872i.length]);
    }

    public long b(x4.c0 c0Var, long j10, boolean z10, boolean[] zArr) {
        int i10 = 0;
        while (true) {
            boolean z11 = true;
            if (i10 >= c0Var.f32589a) {
                break;
            }
            boolean[] zArr2 = this.f27871h;
            if (z10 || !c0Var.b(this.f27877n, i10)) {
                z11 = false;
            }
            zArr2[i10] = z11;
            i10++;
        }
        g(this.f27866c);
        f();
        this.f27877n = c0Var;
        h();
        long j11 = this.f27864a.j(c0Var.f32591c, this.f27871h, this.f27866c, zArr, j10);
        c(this.f27866c);
        this.f27868e = false;
        int i11 = 0;
        while (true) {
            e4.e0[] e0VarArr = this.f27866c;
            if (i11 >= e0VarArr.length) {
                return j11;
            }
            if (e0VarArr[i11] != null) {
                a5.a.f(c0Var.c(i11));
                if (this.f27872i[i11].f() != -2) {
                    this.f27868e = true;
                }
            } else {
                a5.a.f(c0Var.f32591c[i11] == null);
            }
            i11++;
        }
    }

    public void d(long j10) {
        a5.a.f(r());
        this.f27864a.d(y(j10));
    }

    public long i() {
        if (!this.f27867d) {
            return this.f27869f.f27888b;
        }
        long g10 = this.f27868e ? this.f27864a.g() : Long.MIN_VALUE;
        return g10 == Long.MIN_VALUE ? this.f27869f.f27891e : g10;
    }

    public a2 j() {
        return this.f27875l;
    }

    public long k() {
        if (this.f27867d) {
            return this.f27864a.b();
        }
        return 0L;
    }

    public long l() {
        return this.f27878o;
    }

    public long m() {
        return this.f27869f.f27888b + this.f27878o;
    }

    public e4.m0 n() {
        return this.f27876m;
    }

    public x4.c0 o() {
        return this.f27877n;
    }

    public void p(float f10, l3 l3Var) throws q {
        this.f27867d = true;
        this.f27876m = this.f27864a.t();
        x4.c0 v10 = v(f10, l3Var);
        b2 b2Var = this.f27869f;
        long j10 = b2Var.f27888b;
        long j11 = b2Var.f27891e;
        if (j11 != -9223372036854775807L && j10 >= j11) {
            j10 = Math.max(0L, j11 - 1);
        }
        long a10 = a(v10, j10, false);
        long j12 = this.f27878o;
        b2 b2Var2 = this.f27869f;
        this.f27878o = j12 + (b2Var2.f27888b - a10);
        this.f27869f = b2Var2.b(a10);
    }

    public boolean q() {
        return this.f27867d && (!this.f27868e || this.f27864a.g() == Long.MIN_VALUE);
    }

    public void s(long j10) {
        a5.a.f(r());
        if (this.f27867d) {
            this.f27864a.h(y(j10));
        }
    }

    public void t() {
        f();
        u(this.f27874k, this.f27864a);
    }

    public x4.c0 v(float f10, l3 l3Var) throws q {
        x4.s[] sVarArr;
        x4.c0 f11 = this.f27873j.f(this.f27872i, n(), this.f27869f.f27887a, l3Var);
        for (x4.s sVar : f11.f32591c) {
            if (sVar != null) {
                sVar.i(f10);
            }
        }
        return f11;
    }

    public void w(a2 a2Var) {
        if (a2Var == this.f27875l) {
            return;
        }
        f();
        this.f27875l = a2Var;
        h();
    }

    public void x(long j10) {
        this.f27878o = j10;
    }

    public long y(long j10) {
        return j10 - l();
    }

    public long z(long j10) {
        return j10 + l();
    }
}
