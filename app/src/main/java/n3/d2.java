package n3;

import android.os.Handler;
import e4.t;
import n3.l3;
import y5.q;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: MediaPeriodQueue.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class d2 {

    /* renamed from: a  reason: collision with root package name */
    private final l3.b f27918a = new l3.b();

    /* renamed from: b  reason: collision with root package name */
    private final l3.d f27919b = new l3.d();

    /* renamed from: c  reason: collision with root package name */
    private final o3.a f27920c;

    /* renamed from: d  reason: collision with root package name */
    private final Handler f27921d;

    /* renamed from: e  reason: collision with root package name */
    private long f27922e;

    /* renamed from: f  reason: collision with root package name */
    private int f27923f;

    /* renamed from: g  reason: collision with root package name */
    private boolean f27924g;

    /* renamed from: h  reason: collision with root package name */
    private a2 f27925h;

    /* renamed from: i  reason: collision with root package name */
    private a2 f27926i;

    /* renamed from: j  reason: collision with root package name */
    private a2 f27927j;

    /* renamed from: k  reason: collision with root package name */
    private int f27928k;

    /* renamed from: l  reason: collision with root package name */
    private Object f27929l;

    /* renamed from: m  reason: collision with root package name */
    private long f27930m;

    public d2(o3.a aVar, Handler handler) {
        this.f27920c = aVar;
        this.f27921d = handler;
    }

    private static t.b A(l3 l3Var, Object obj, long j10, long j11, l3.d dVar, l3.b bVar) {
        l3Var.l(obj, bVar);
        l3Var.r(bVar.f28133c, dVar);
        int f10 = l3Var.f(obj);
        Object obj2 = obj;
        while (bVar.f28134d == 0 && bVar.f() > 0 && bVar.t(bVar.r()) && bVar.h(0L) == -1) {
            int i10 = f10 + 1;
            if (f10 >= dVar.f28161p) {
                break;
            }
            l3Var.k(i10, bVar, true);
            obj2 = a5.a.e(bVar.f28132b);
            f10 = i10;
        }
        l3Var.l(obj2, bVar);
        int h10 = bVar.h(j10);
        if (h10 == -1) {
            return new t.b(obj2, j11, bVar.g(j10));
        }
        return new t.b(obj2, h10, bVar.n(h10), j11);
    }

    private long C(l3 l3Var, Object obj) {
        int f10;
        int i10 = l3Var.l(obj, this.f27918a).f28133c;
        Object obj2 = this.f27929l;
        if (obj2 != null && (f10 = l3Var.f(obj2)) != -1 && l3Var.j(f10, this.f27918a).f28133c == i10) {
            return this.f27930m;
        }
        for (a2 a2Var = this.f27925h; a2Var != null; a2Var = a2Var.j()) {
            if (a2Var.f27865b.equals(obj)) {
                return a2Var.f27869f.f27887a.f25142d;
            }
        }
        for (a2 a2Var2 = this.f27925h; a2Var2 != null; a2Var2 = a2Var2.j()) {
            int f11 = l3Var.f(a2Var2.f27865b);
            if (f11 != -1 && l3Var.j(f11, this.f27918a).f28133c == i10) {
                return a2Var2.f27869f.f27887a.f25142d;
            }
        }
        long j10 = this.f27922e;
        this.f27922e = 1 + j10;
        if (this.f27925h == null) {
            this.f27929l = obj;
            this.f27930m = j10;
        }
        return j10;
    }

    private boolean E(l3 l3Var) {
        a2 a2Var = this.f27925h;
        if (a2Var == null) {
            return true;
        }
        int f10 = l3Var.f(a2Var.f27865b);
        while (true) {
            f10 = l3Var.h(f10, this.f27918a, this.f27919b, this.f27923f, this.f27924g);
            while (a2Var.j() != null && !a2Var.f27869f.f27893g) {
                a2Var = a2Var.j();
            }
            a2 j10 = a2Var.j();
            if (f10 == -1 || j10 == null || l3Var.f(j10.f27865b) != f10) {
                break;
            }
            a2Var = j10;
        }
        boolean z10 = z(a2Var);
        a2Var.f27869f = r(l3Var, a2Var.f27869f);
        return !z10;
    }

    private boolean d(long j10, long j11) {
        return j10 == -9223372036854775807L || j10 == j11;
    }

    private boolean e(b2 b2Var, b2 b2Var2) {
        return b2Var.f27888b == b2Var2.f27888b && b2Var.f27887a.equals(b2Var2.f27887a);
    }

    private b2 h(m2 m2Var) {
        return k(m2Var.f28227a, m2Var.f28228b, m2Var.f28229c, m2Var.f28244r);
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x00cc, code lost:
        if (r0.t(r0.r()) != false) goto L26;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private n3.b2 i(n3.l3 r20, n3.a2 r21, long r22) {
        /*
            Method dump skipped, instructions count: 450
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: n3.d2.i(n3.l3, n3.a2, long):n3.b2");
    }

    private b2 k(l3 l3Var, t.b bVar, long j10, long j11) {
        l3Var.l(bVar.f25139a, this.f27918a);
        if (bVar.b()) {
            return l(l3Var, bVar.f25139a, bVar.f25140b, bVar.f25141c, j10, bVar.f25142d);
        }
        return m(l3Var, bVar.f25139a, j11, j10, bVar.f25142d);
    }

    private b2 l(l3 l3Var, Object obj, int i10, int i11, long j10, long j11) {
        t.b bVar = new t.b(obj, i10, i11, j11);
        long e8 = l3Var.l(bVar.f25139a, this.f27918a).e(bVar.f25140b, bVar.f25141c);
        long j12 = i11 == this.f27918a.n(i10) ? this.f27918a.j() : 0L;
        return new b2(bVar, (e8 == -9223372036854775807L || j12 < e8) ? j12 : Math.max(0L, e8 - 1), j10, -9223372036854775807L, e8, this.f27918a.t(bVar.f25140b), false, false, false);
    }

    private b2 m(l3 l3Var, Object obj, long j10, long j11, long j12) {
        boolean z10;
        long j13;
        long j14;
        long j15;
        long j16 = j10;
        l3Var.l(obj, this.f27918a);
        int g10 = this.f27918a.g(j16);
        int i10 = 1;
        if (g10 == -1) {
            if (this.f27918a.f() > 0) {
                l3.b bVar = this.f27918a;
                if (bVar.t(bVar.r())) {
                    z10 = true;
                }
            }
            z10 = false;
        } else {
            if (this.f27918a.t(g10)) {
                long i11 = this.f27918a.i(g10);
                l3.b bVar2 = this.f27918a;
                if (i11 == bVar2.f28134d && bVar2.s(g10)) {
                    z10 = true;
                    g10 = -1;
                }
            }
            z10 = false;
        }
        t.b bVar3 = new t.b(obj, j12, g10);
        boolean s10 = s(bVar3);
        boolean u10 = u(l3Var, bVar3);
        boolean t10 = t(l3Var, bVar3, s10);
        boolean z11 = g10 != -1 && this.f27918a.t(g10);
        if (g10 != -1) {
            j14 = this.f27918a.i(g10);
        } else if (z10) {
            j14 = this.f27918a.f28134d;
        } else {
            j13 = -9223372036854775807L;
            j15 = (j13 != -9223372036854775807L || j13 == Long.MIN_VALUE) ? this.f27918a.f28134d : j13;
            if (j15 != -9223372036854775807L && j16 >= j15) {
                if (!t10 && z10) {
                    i10 = 0;
                }
                j16 = Math.max(0L, j15 - i10);
            }
            return new b2(bVar3, j16, j11, j13, j15, z11, s10, u10, t10);
        }
        j13 = j14;
        if (j13 != -9223372036854775807L) {
        }
        if (j15 != -9223372036854775807L) {
            if (!t10) {
                i10 = 0;
            }
            j16 = Math.max(0L, j15 - i10);
        }
        return new b2(bVar3, j16, j11, j13, j15, z11, s10, u10, t10);
    }

    private long n(l3 l3Var, Object obj, int i10) {
        l3Var.l(obj, this.f27918a);
        long i11 = this.f27918a.i(i10);
        if (i11 == Long.MIN_VALUE) {
            return this.f27918a.f28134d;
        }
        return i11 + this.f27918a.l(i10);
    }

    private boolean s(t.b bVar) {
        return !bVar.b() && bVar.f25143e == -1;
    }

    private boolean t(l3 l3Var, t.b bVar, boolean z10) {
        int f10 = l3Var.f(bVar.f25139a);
        return !l3Var.r(l3Var.j(f10, this.f27918a).f28133c, this.f27919b).f28154i && l3Var.v(f10, this.f27918a, this.f27919b, this.f27923f, this.f27924g) && z10;
    }

    private boolean u(l3 l3Var, t.b bVar) {
        if (s(bVar)) {
            return l3Var.r(l3Var.l(bVar.f25139a, this.f27918a).f28133c, this.f27919b).f28161p == l3Var.f(bVar.f25139a);
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void w(q.a aVar, t.b bVar) {
        this.f27920c.A(aVar.h(), bVar);
    }

    private void x() {
        final q.a j10 = y5.q.j();
        for (a2 a2Var = this.f27925h; a2Var != null; a2Var = a2Var.j()) {
            j10.a(a2Var.f27869f.f27887a);
        }
        a2 a2Var2 = this.f27926i;
        final t.b bVar = a2Var2 == null ? null : a2Var2.f27869f.f27887a;
        this.f27921d.post(new Runnable() { // from class: n3.c2
            @Override // java.lang.Runnable
            public final void run() {
                d2.this.w(j10, bVar);
            }
        });
    }

    public t.b B(l3 l3Var, Object obj, long j10) {
        long C = C(l3Var, obj);
        l3Var.l(obj, this.f27918a);
        l3Var.r(this.f27918a.f28133c, this.f27919b);
        boolean z10 = false;
        for (int f10 = l3Var.f(obj); f10 >= this.f27919b.f28160o; f10--) {
            l3Var.k(f10, this.f27918a, true);
            boolean z11 = this.f27918a.f() > 0;
            z10 |= z11;
            l3.b bVar = this.f27918a;
            if (bVar.h(bVar.f28134d) != -1) {
                obj = a5.a.e(this.f27918a.f28132b);
            }
            if (z10 && (!z11 || this.f27918a.f28134d != 0)) {
                break;
            }
        }
        return A(l3Var, obj, j10, C, this.f27919b, this.f27918a);
    }

    public boolean D() {
        a2 a2Var = this.f27927j;
        return a2Var == null || (!a2Var.f27869f.f27895i && a2Var.q() && this.f27927j.f27869f.f27891e != -9223372036854775807L && this.f27928k < 100);
    }

    public boolean F(l3 l3Var, long j10, long j11) {
        b2 b2Var;
        a2 a2Var = this.f27925h;
        a2 a2Var2 = null;
        while (a2Var != null) {
            b2 b2Var2 = a2Var.f27869f;
            if (a2Var2 == null) {
                b2Var = r(l3Var, b2Var2);
            } else {
                b2 i10 = i(l3Var, a2Var2, j10);
                if (i10 == null) {
                    return !z(a2Var2);
                }
                if (!e(b2Var2, i10)) {
                    return !z(a2Var2);
                }
                b2Var = i10;
            }
            a2Var.f27869f = b2Var.a(b2Var2.f27889c);
            if (!d(b2Var2.f27891e, b2Var.f27891e)) {
                a2Var.A();
                long j12 = b2Var.f27891e;
                return (z(a2Var) || (a2Var == this.f27926i && !a2Var.f27869f.f27892f && ((j11 > Long.MIN_VALUE ? 1 : (j11 == Long.MIN_VALUE ? 0 : -1)) == 0 || (j11 > ((j12 > (-9223372036854775807L) ? 1 : (j12 == (-9223372036854775807L) ? 0 : -1)) == 0 ? Long.MAX_VALUE : a2Var.z(j12)) ? 1 : (j11 == ((j12 > (-9223372036854775807L) ? 1 : (j12 == (-9223372036854775807L) ? 0 : -1)) == 0 ? Long.MAX_VALUE : a2Var.z(j12)) ? 0 : -1)) >= 0))) ? false : true;
            }
            a2Var2 = a2Var;
            a2Var = a2Var.j();
        }
        return true;
    }

    public boolean G(l3 l3Var, int i10) {
        this.f27923f = i10;
        return E(l3Var);
    }

    public boolean H(l3 l3Var, boolean z10) {
        this.f27924g = z10;
        return E(l3Var);
    }

    public a2 b() {
        a2 a2Var = this.f27925h;
        if (a2Var == null) {
            return null;
        }
        if (a2Var == this.f27926i) {
            this.f27926i = a2Var.j();
        }
        this.f27925h.t();
        int i10 = this.f27928k - 1;
        this.f27928k = i10;
        if (i10 == 0) {
            this.f27927j = null;
            a2 a2Var2 = this.f27925h;
            this.f27929l = a2Var2.f27865b;
            this.f27930m = a2Var2.f27869f.f27887a.f25142d;
        }
        this.f27925h = this.f27925h.j();
        x();
        return this.f27925h;
    }

    public a2 c() {
        a2 a2Var = this.f27926i;
        a5.a.f((a2Var == null || a2Var.j() == null) ? false : true);
        this.f27926i = this.f27926i.j();
        x();
        return this.f27926i;
    }

    public void f() {
        if (this.f27928k == 0) {
            return;
        }
        a2 a2Var = (a2) a5.a.h(this.f27925h);
        this.f27929l = a2Var.f27865b;
        this.f27930m = a2Var.f27869f.f27887a.f25142d;
        while (a2Var != null) {
            a2Var.t();
            a2Var = a2Var.j();
        }
        this.f27925h = null;
        this.f27927j = null;
        this.f27926i = null;
        this.f27928k = 0;
        x();
    }

    public a2 g(a3[] a3VarArr, x4.b0 b0Var, z4.b bVar, g2 g2Var, b2 b2Var, x4.c0 c0Var) {
        a2 a2Var = this.f27927j;
        a2 a2Var2 = new a2(a3VarArr, a2Var == null ? 1000000000000L : (a2Var.l() + this.f27927j.f27869f.f27891e) - b2Var.f27888b, b0Var, bVar, g2Var, b2Var, c0Var);
        a2 a2Var3 = this.f27927j;
        if (a2Var3 != null) {
            a2Var3.w(a2Var2);
        } else {
            this.f27925h = a2Var2;
            this.f27926i = a2Var2;
        }
        this.f27929l = null;
        this.f27927j = a2Var2;
        this.f27928k++;
        x();
        return a2Var2;
    }

    public a2 j() {
        return this.f27927j;
    }

    public b2 o(long j10, m2 m2Var) {
        a2 a2Var = this.f27927j;
        if (a2Var == null) {
            return h(m2Var);
        }
        return i(m2Var.f28227a, a2Var, j10);
    }

    public a2 p() {
        return this.f27925h;
    }

    public a2 q() {
        return this.f27926i;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x006c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public n3.b2 r(n3.l3 r19, n3.b2 r20) {
        /*
            r18 = this;
            r0 = r18
            r1 = r19
            r2 = r20
            e4.t$b r3 = r2.f27887a
            boolean r12 = r0.s(r3)
            boolean r13 = r0.u(r1, r3)
            boolean r14 = r0.t(r1, r3, r12)
            e4.t$b r4 = r2.f27887a
            java.lang.Object r4 = r4.f25139a
            n3.l3$b r5 = r0.f27918a
            r1.l(r4, r5)
            boolean r1 = r3.b()
            r4 = -1
            r5 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r1 != 0) goto L35
            int r1 = r3.f25143e
            if (r1 != r4) goto L2e
            goto L35
        L2e:
            n3.l3$b r7 = r0.f27918a
            long r7 = r7.i(r1)
            goto L36
        L35:
            r7 = r5
        L36:
            boolean r1 = r3.b()
            if (r1 == 0) goto L48
            n3.l3$b r1 = r0.f27918a
            int r5 = r3.f25140b
            int r6 = r3.f25141c
            long r5 = r1.e(r5, r6)
        L46:
            r9 = r5
            goto L5c
        L48:
            int r1 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r1 == 0) goto L55
            r5 = -9223372036854775808
            int r1 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r1 != 0) goto L53
            goto L55
        L53:
            r9 = r7
            goto L5c
        L55:
            n3.l3$b r1 = r0.f27918a
            long r5 = r1.m()
            goto L46
        L5c:
            boolean r1 = r3.b()
            if (r1 == 0) goto L6c
            n3.l3$b r1 = r0.f27918a
            int r4 = r3.f25140b
            boolean r1 = r1.t(r4)
        L6a:
            r11 = r1
            goto L7c
        L6c:
            int r1 = r3.f25143e
            if (r1 == r4) goto L7a
            n3.l3$b r4 = r0.f27918a
            boolean r1 = r4.t(r1)
            if (r1 == 0) goto L7a
            r1 = 1
            goto L6a
        L7a:
            r1 = 0
            goto L6a
        L7c:
            n3.b2 r15 = new n3.b2
            long r4 = r2.f27888b
            long r1 = r2.f27889c
            r16 = r1
            r1 = r15
            r2 = r3
            r3 = r4
            r5 = r16
            r1.<init>(r2, r3, r5, r7, r9, r11, r12, r13, r14)
            return r15
        */
        throw new UnsupportedOperationException("Method not decompiled: n3.d2.r(n3.l3, n3.b2):n3.b2");
    }

    public boolean v(e4.q qVar) {
        a2 a2Var = this.f27927j;
        return a2Var != null && a2Var.f27864a == qVar;
    }

    public void y(long j10) {
        a2 a2Var = this.f27927j;
        if (a2Var != null) {
            a2Var.s(j10);
        }
    }

    public boolean z(a2 a2Var) {
        boolean z10 = false;
        a5.a.f(a2Var != null);
        if (a2Var.equals(this.f27927j)) {
            return false;
        }
        this.f27927j = a2Var;
        while (a2Var.j() != null) {
            a2Var = a2Var.j();
            if (a2Var == this.f27926i) {
                this.f27926i = this.f27925h;
                z10 = true;
            }
            a2Var.t();
            this.f27928k--;
        }
        this.f27927j.w(null);
        x();
        return z10;
    }
}
