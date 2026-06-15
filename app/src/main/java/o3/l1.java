package o3;

import a5.s;
import android.os.Looper;
import android.util.SparseArray;
import com.google.android.exoplayer2.metadata.Metadata;
import com.ironsource.d9;
import com.ironsource.mediationsdk.logger.IronSourceError;
import e4.t;
import java.io.IOException;
import java.util.List;
import n3.l2;
import n3.l3;
import n3.o2;
import n3.p2;
import n3.q3;
import n3.u1;
import n3.z1;
import o3.c;
import y5.r;
/* compiled from: DefaultAnalyticsCollector.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class l1 implements o3.a {

    /* renamed from: a  reason: collision with root package name */
    private final a5.d f29233a;

    /* renamed from: b  reason: collision with root package name */
    private final l3.b f29234b;

    /* renamed from: c  reason: collision with root package name */
    private final l3.d f29235c;

    /* renamed from: d  reason: collision with root package name */
    private final a f29236d;

    /* renamed from: e  reason: collision with root package name */
    private final SparseArray<c.a> f29237e;

    /* renamed from: f  reason: collision with root package name */
    private a5.s<c> f29238f;

    /* renamed from: g  reason: collision with root package name */
    private p2 f29239g;

    /* renamed from: h  reason: collision with root package name */
    private a5.p f29240h;

    /* renamed from: i  reason: collision with root package name */
    private boolean f29241i;

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: DefaultAnalyticsCollector.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        private final l3.b f29242a;

        /* renamed from: b  reason: collision with root package name */
        private y5.q<t.b> f29243b = y5.q.p();

        /* renamed from: c  reason: collision with root package name */
        private y5.r<t.b, l3> f29244c = y5.r.j();

        /* renamed from: d  reason: collision with root package name */
        private t.b f29245d;

        /* renamed from: e  reason: collision with root package name */
        private t.b f29246e;

        /* renamed from: f  reason: collision with root package name */
        private t.b f29247f;

        public a(l3.b bVar) {
            this.f29242a = bVar;
        }

        private void b(r.a<t.b, l3> aVar, t.b bVar, l3 l3Var) {
            if (bVar == null) {
                return;
            }
            if (l3Var.f(bVar.f25139a) != -1) {
                aVar.f(bVar, l3Var);
                return;
            }
            l3 l3Var2 = this.f29244c.get(bVar);
            if (l3Var2 != null) {
                aVar.f(bVar, l3Var2);
            }
        }

        private static t.b c(p2 p2Var, y5.q<t.b> qVar, t.b bVar, l3.b bVar2) {
            l3 t10 = p2Var.t();
            int D = p2Var.D();
            Object q10 = t10.u() ? null : t10.q(D);
            int g10 = (p2Var.f() || t10.u()) ? -1 : t10.j(D, bVar2).g(a5.p0.C0(p2Var.getCurrentPosition()) - bVar2.q());
            for (int i10 = 0; i10 < qVar.size(); i10++) {
                t.b bVar3 = qVar.get(i10);
                if (i(bVar3, q10, p2Var.f(), p2Var.o(), p2Var.H(), g10)) {
                    return bVar3;
                }
            }
            if (qVar.isEmpty() && bVar != null) {
                if (i(bVar, q10, p2Var.f(), p2Var.o(), p2Var.H(), g10)) {
                    return bVar;
                }
            }
            return null;
        }

        private static boolean i(t.b bVar, Object obj, boolean z10, int i10, int i11, int i12) {
            if (bVar.f25139a.equals(obj)) {
                return (z10 && bVar.f25140b == i10 && bVar.f25141c == i11) || (!z10 && bVar.f25140b == -1 && bVar.f25143e == i12);
            }
            return false;
        }

        private void m(l3 l3Var) {
            r.a<t.b, l3> a10 = y5.r.a();
            if (this.f29243b.isEmpty()) {
                b(a10, this.f29246e, l3Var);
                if (!x5.f.a(this.f29247f, this.f29246e)) {
                    b(a10, this.f29247f, l3Var);
                }
                if (!x5.f.a(this.f29245d, this.f29246e) && !x5.f.a(this.f29245d, this.f29247f)) {
                    b(a10, this.f29245d, l3Var);
                }
            } else {
                for (int i10 = 0; i10 < this.f29243b.size(); i10++) {
                    b(a10, this.f29243b.get(i10), l3Var);
                }
                if (!this.f29243b.contains(this.f29245d)) {
                    b(a10, this.f29245d, l3Var);
                }
            }
            this.f29244c = a10.c();
        }

        public t.b d() {
            return this.f29245d;
        }

        public t.b e() {
            if (this.f29243b.isEmpty()) {
                return null;
            }
            return (t.b) y5.t.c(this.f29243b);
        }

        public l3 f(t.b bVar) {
            return this.f29244c.get(bVar);
        }

        public t.b g() {
            return this.f29246e;
        }

        public t.b h() {
            return this.f29247f;
        }

        public void j(p2 p2Var) {
            this.f29245d = c(p2Var, this.f29243b, this.f29246e, this.f29242a);
        }

        public void k(List<t.b> list, t.b bVar, p2 p2Var) {
            this.f29243b = y5.q.l(list);
            if (!list.isEmpty()) {
                this.f29246e = list.get(0);
                this.f29247f = (t.b) a5.a.e(bVar);
            }
            if (this.f29245d == null) {
                this.f29245d = c(p2Var, this.f29243b, this.f29246e, this.f29242a);
            }
            m(p2Var.t());
        }

        public void l(p2 p2Var) {
            this.f29245d = c(p2Var, this.f29243b, this.f29246e, this.f29242a);
            m(p2Var.t());
        }
    }

    public l1(a5.d dVar) {
        this.f29233a = (a5.d) a5.a.e(dVar);
        this.f29238f = new a5.s<>(a5.p0.O(), dVar, new s.b() { // from class: o3.f1
            @Override // a5.s.b
            public final void a(Object obj, a5.m mVar) {
                l1.E1((c) obj, mVar);
            }
        });
        l3.b bVar = new l3.b();
        this.f29234b = bVar;
        this.f29235c = new l3.d();
        this.f29236d = new a(bVar);
        this.f29237e = new SparseArray<>();
    }

    private c.a A1(int i10, t.b bVar) {
        a5.a.e(this.f29239g);
        if (bVar != null) {
            if (this.f29236d.f(bVar) != null) {
                return x1(bVar);
            }
            return y1(l3.f28128a, i10, bVar);
        }
        l3 t10 = this.f29239g.t();
        if (!(i10 < t10.t())) {
            t10 = l3.f28128a;
        }
        return y1(t10, i10, null);
    }

    private c.a B1() {
        return x1(this.f29236d.g());
    }

    private c.a C1() {
        return x1(this.f29236d.h());
    }

    private c.a D1(l2 l2Var) {
        e4.r rVar;
        if ((l2Var instanceof n3.q) && (rVar = ((n3.q) l2Var).f28297i) != null) {
            return x1(new t.b(rVar));
        }
        return w1();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void E1(c cVar, a5.m mVar) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void E2(c.a aVar, String str, long j10, long j11, c cVar) {
        cVar.s0(aVar, str, j10);
        cVar.n(aVar, str, j11, j10);
        cVar.k(aVar, 2, str, j10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void G2(c.a aVar, q3.e eVar, c cVar) {
        cVar.D(aVar, eVar);
        cVar.X(aVar, 2, eVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void H1(c.a aVar, String str, long j10, long j11, c cVar) {
        cVar.T(aVar, str, j10);
        cVar.c(aVar, str, j11, j10);
        cVar.k(aVar, 1, str, j10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void H2(c.a aVar, q3.e eVar, c cVar) {
        cVar.o0(aVar, eVar);
        cVar.E(aVar, 2, eVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void J1(c.a aVar, q3.e eVar, c cVar) {
        cVar.u0(aVar, eVar);
        cVar.X(aVar, 1, eVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void J2(c.a aVar, n3.m1 m1Var, q3.i iVar, c cVar) {
        cVar.q0(aVar, m1Var);
        cVar.k0(aVar, m1Var, iVar);
        cVar.w0(aVar, 2, m1Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void K1(c.a aVar, q3.e eVar, c cVar) {
        cVar.Q(aVar, eVar);
        cVar.E(aVar, 1, eVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void K2(c.a aVar, b5.a0 a0Var, c cVar) {
        cVar.i0(aVar, a0Var);
        cVar.G(aVar, a0Var.f5097a, a0Var.f5098b, a0Var.f5099c, a0Var.f5100d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void L1(c.a aVar, n3.m1 m1Var, q3.i iVar, c cVar) {
        cVar.L(aVar, m1Var);
        cVar.W(aVar, m1Var, iVar);
        cVar.w0(aVar, 1, m1Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void L2(p2 p2Var, c cVar, a5.m mVar) {
        cVar.P(p2Var, new c.b(mVar, this.f29237e));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void Z1(c.a aVar, int i10, c cVar) {
        cVar.f0(aVar);
        cVar.H(aVar, i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void d2(c.a aVar, boolean z10, c cVar) {
        cVar.R(aVar, z10);
        cVar.e(aVar, z10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void t2(c.a aVar, int i10, p2.e eVar, p2.e eVar2, c cVar) {
        cVar.b(aVar, i10);
        cVar.g(aVar, eVar, eVar2, i10);
    }

    private c.a x1(t.b bVar) {
        a5.a.e(this.f29239g);
        l3 f10 = bVar == null ? null : this.f29236d.f(bVar);
        if (bVar != null && f10 != null) {
            return y1(f10, f10.l(bVar.f25139a, this.f29234b).f28133c, bVar);
        }
        int N = this.f29239g.N();
        l3 t10 = this.f29239g.t();
        if (!(N < t10.t())) {
            t10 = l3.f28128a;
        }
        return y1(t10, N, null);
    }

    private c.a z1() {
        return x1(this.f29236d.e());
    }

    @Override // o3.a
    public final void A(List<t.b> list, t.b bVar) {
        this.f29236d.k(list, bVar, (p2) a5.a.e(this.f29239g));
    }

    @Override // n3.p2.d
    public void B(boolean z10) {
    }

    @Override // e4.a0
    public final void C(int i10, t.b bVar, final e4.l lVar, final e4.p pVar) {
        final c.a A1 = A1(i10, bVar);
        M2(A1, 1002, new s.a() { // from class: o3.r
            @Override // a5.s.a
            public final void invoke(Object obj) {
                ((c) obj).r0(c.a.this, lVar, pVar);
            }
        });
    }

    @Override // n3.p2.d
    public void D(final n3.o oVar) {
        final c.a w12 = w1();
        M2(w12, 29, new s.a() { // from class: o3.h0
            @Override // a5.s.a
            public final void invoke(Object obj) {
                ((c) obj).S(c.a.this, oVar);
            }
        });
    }

    @Override // e4.a0
    public final void E(int i10, t.b bVar, final e4.l lVar, final e4.p pVar) {
        final c.a A1 = A1(i10, bVar);
        M2(A1, 1001, new s.a() { // from class: o3.q
            @Override // a5.s.a
            public final void invoke(Object obj) {
                ((c) obj).V(c.a.this, lVar, pVar);
            }
        });
    }

    @Override // n3.p2.d
    public final void F(final int i10) {
        final c.a w12 = w1();
        M2(w12, 4, new s.a() { // from class: o3.j1
            @Override // a5.s.a
            public final void invoke(Object obj) {
                ((c) obj).z(c.a.this, i10);
            }
        });
    }

    @Override // e4.a0
    public final void G(int i10, t.b bVar, final e4.p pVar) {
        final c.a A1 = A1(i10, bVar);
        M2(A1, 1005, new s.a() { // from class: o3.v
            @Override // a5.s.a
            public final void invoke(Object obj) {
                ((c) obj).I(c.a.this, pVar);
            }
        });
    }

    @Override // z4.f.a
    public final void H(final int i10, final long j10, final long j11) {
        final c.a z12 = z1();
        M2(z12, 1006, new s.a() { // from class: o3.h
            @Override // a5.s.a
            public final void invoke(Object obj) {
                ((c) obj).u(c.a.this, i10, j10, j11);
            }
        });
    }

    @Override // e4.a0
    public final void I(int i10, t.b bVar, final e4.l lVar, final e4.p pVar) {
        final c.a A1 = A1(i10, bVar);
        M2(A1, 1000, new s.a() { // from class: o3.s
            @Override // a5.s.a
            public final void invoke(Object obj) {
                ((c) obj).p0(c.a.this, lVar, pVar);
            }
        });
    }

    @Override // o3.a
    public final void J() {
        if (this.f29241i) {
            return;
        }
        final c.a w12 = w1();
        this.f29241i = true;
        M2(w12, -1, new s.a() { // from class: o3.g1
            @Override // a5.s.a
            public final void invoke(Object obj) {
                ((c) obj).v0(c.a.this);
            }
        });
    }

    @Override // n3.p2.d
    public final void K(final boolean z10) {
        final c.a w12 = w1();
        M2(w12, 9, new s.a() { // from class: o3.z0
            @Override // a5.s.a
            public final void invoke(Object obj) {
                ((c) obj).A(c.a.this, z10);
            }
        });
    }

    @Override // n3.p2.d
    public void L(final int i10, final boolean z10) {
        final c.a w12 = w1();
        M2(w12, 30, new s.a() { // from class: o3.k
            @Override // a5.s.a
            public final void invoke(Object obj) {
                ((c) obj).a(c.a.this, i10, z10);
            }
        });
    }

    @Override // com.google.android.exoplayer2.drm.k
    public final void M(int i10, t.b bVar) {
        final c.a A1 = A1(i10, bVar);
        M2(A1, IronSourceError.ERROR_RV_LOAD_DURING_LOAD, new s.a() { // from class: o3.k0
            @Override // a5.s.a
            public final void invoke(Object obj) {
                ((c) obj).n0(c.a.this);
            }
        });
    }

    protected final void M2(c.a aVar, int i10, s.a<c> aVar2) {
        this.f29237e.put(i10, aVar);
        this.f29238f.k(i10, aVar2);
    }

    @Override // n3.p2.d
    public final void N(l3 l3Var, final int i10) {
        this.f29236d.l((p2) a5.a.e(this.f29239g));
        final c.a w12 = w1();
        M2(w12, 0, new s.a() { // from class: o3.e
            @Override // a5.s.a
            public final void invoke(Object obj) {
                ((c) obj).g0(c.a.this, i10);
            }
        });
    }

    @Override // n3.p2.d
    public void O(final z1 z1Var) {
        final c.a w12 = w1();
        M2(w12, 14, new s.a() { // from class: o3.m0
            @Override // a5.s.a
            public final void invoke(Object obj) {
                ((c) obj).j0(c.a.this, z1Var);
            }
        });
    }

    @Override // n3.p2.d
    public final void P(final l2 l2Var) {
        final c.a D1 = D1(l2Var);
        M2(D1, 10, new s.a() { // from class: o3.n0
            @Override // a5.s.a
            public final void invoke(Object obj) {
                ((c) obj).q(c.a.this, l2Var);
            }
        });
    }

    @Override // n3.p2.d
    public void Q() {
    }

    @Override // n3.p2.d
    public void R(p2 p2Var, p2.c cVar) {
    }

    @Override // com.google.android.exoplayer2.drm.k
    public /* synthetic */ void S(int i10, t.b bVar) {
        r3.e.a(this, i10, bVar);
    }

    @Override // n3.p2.d
    public final void T(final u1 u1Var, final int i10) {
        final c.a w12 = w1();
        M2(w12, 1, new s.a() { // from class: o3.l0
            @Override // a5.s.a
            public final void invoke(Object obj) {
                ((c) obj).m0(c.a.this, u1Var, i10);
            }
        });
    }

    @Override // n3.p2.d
    public final void U(final int i10, final int i11) {
        final c.a C1 = C1();
        M2(C1, 24, new s.a() { // from class: o3.f
            @Override // a5.s.a
            public final void invoke(Object obj) {
                ((c) obj).l(c.a.this, i10, i11);
            }
        });
    }

    @Override // n3.p2.d
    public final void V(final p2.e eVar, final p2.e eVar2, final int i10) {
        if (i10 == 1) {
            this.f29241i = false;
        }
        this.f29236d.j((p2) a5.a.e(this.f29239g));
        final c.a w12 = w1();
        M2(w12, 11, new s.a() { // from class: o3.j
            @Override // a5.s.a
            public final void invoke(Object obj) {
                l1.t2(c.a.this, i10, eVar, eVar2, (c) obj);
            }
        });
    }

    @Override // n3.p2.d
    public void W(final p2.b bVar) {
        final c.a w12 = w1();
        M2(w12, 13, new s.a() { // from class: o3.q0
            @Override // a5.s.a
            public final void invoke(Object obj) {
                ((c) obj).c0(c.a.this, bVar);
            }
        });
    }

    @Override // com.google.android.exoplayer2.drm.k
    public final void X(int i10, t.b bVar, final int i11) {
        final c.a A1 = A1(i10, bVar);
        M2(A1, 1022, new s.a() { // from class: o3.i1
            @Override // a5.s.a
            public final void invoke(Object obj) {
                l1.Z1(c.a.this, i11, (c) obj);
            }
        });
    }

    @Override // n3.p2.d
    public void Y(int i10) {
    }

    @Override // com.google.android.exoplayer2.drm.k
    public final void Z(int i10, t.b bVar, final Exception exc) {
        final c.a A1 = A1(i10, bVar);
        M2(A1, 1024, new s.a() { // from class: o3.a0
            @Override // a5.s.a
            public final void invoke(Object obj) {
                ((c) obj).K(c.a.this, exc);
            }
        });
    }

    @Override // n3.p2.d
    public final void a(final boolean z10) {
        final c.a C1 = C1();
        M2(C1, 23, new s.a() { // from class: o3.a1
            @Override // a5.s.a
            public final void invoke(Object obj) {
                ((c) obj).h0(c.a.this, z10);
            }
        });
    }

    @Override // n3.p2.d
    public final void a0(final boolean z10) {
        final c.a w12 = w1();
        M2(w12, 3, new s.a() { // from class: o3.b1
            @Override // a5.s.a
            public final void invoke(Object obj) {
                l1.d2(c.a.this, z10, (c) obj);
            }
        });
    }

    @Override // o3.a
    public final void b(final Exception exc) {
        final c.a C1 = C1();
        M2(C1, d9.f16966j, new s.a() { // from class: o3.y
            @Override // a5.s.a
            public final void invoke(Object obj) {
                ((c) obj).s(c.a.this, exc);
            }
        });
    }

    @Override // n3.p2.d
    public final void b0() {
        final c.a w12 = w1();
        M2(w12, -1, new s.a() { // from class: o3.z
            @Override // a5.s.a
            public final void invoke(Object obj) {
                ((c) obj).U(c.a.this);
            }
        });
    }

    @Override // o3.a
    public final void c(final String str) {
        final c.a C1 = C1();
        M2(C1, 1019, new s.a() { // from class: o3.c0
            @Override // a5.s.a
            public final void invoke(Object obj) {
                ((c) obj).O(c.a.this, str);
            }
        });
    }

    @Override // e4.a0
    public final void c0(int i10, t.b bVar, final e4.l lVar, final e4.p pVar, final IOException iOException, final boolean z10) {
        final c.a A1 = A1(i10, bVar);
        M2(A1, 1003, new s.a() { // from class: o3.t
            @Override // a5.s.a
            public final void invoke(Object obj) {
                ((c) obj).p(c.a.this, lVar, pVar, iOException, z10);
            }
        });
    }

    @Override // o3.a
    public final void d(final String str, final long j10, final long j11) {
        final c.a C1 = C1();
        M2(C1, d9.f16968l, new s.a() { // from class: o3.f0
            @Override // a5.s.a
            public final void invoke(Object obj) {
                l1.E2(c.a.this, str, j11, j10, (c) obj);
            }
        });
    }

    @Override // n3.p2.d
    public final void d0(final boolean z10, final int i10) {
        final c.a w12 = w1();
        M2(w12, -1, new s.a() { // from class: o3.d1
            @Override // a5.s.a
            public final void invoke(Object obj) {
                ((c) obj).F(c.a.this, z10, i10);
            }
        });
    }

    @Override // o3.a
    public final void e(final String str) {
        final c.a C1 = C1();
        M2(C1, 1012, new s.a() { // from class: o3.d0
            @Override // a5.s.a
            public final void invoke(Object obj) {
                ((c) obj).J(c.a.this, str);
            }
        });
    }

    @Override // com.google.android.exoplayer2.drm.k
    public final void e0(int i10, t.b bVar) {
        final c.a A1 = A1(i10, bVar);
        M2(A1, 1023, new s.a() { // from class: o3.o
            @Override // a5.s.a
            public final void invoke(Object obj) {
                ((c) obj).j(c.a.this);
            }
        });
    }

    @Override // o3.a
    public final void f(final String str, final long j10, final long j11) {
        final c.a C1 = C1();
        M2(C1, 1008, new s.a() { // from class: o3.e0
            @Override // a5.s.a
            public final void invoke(Object obj) {
                l1.H1(c.a.this, str, j11, j10, (c) obj);
            }
        });
    }

    @Override // e4.a0
    public final void f0(int i10, t.b bVar, final e4.p pVar) {
        final c.a A1 = A1(i10, bVar);
        M2(A1, 1004, new s.a() { // from class: o3.u
            @Override // a5.s.a
            public final void invoke(Object obj) {
                ((c) obj).a0(c.a.this, pVar);
            }
        });
    }

    @Override // n3.p2.d
    public final void g(final Metadata metadata) {
        final c.a w12 = w1();
        M2(w12, 28, new s.a() { // from class: o3.p
            @Override // a5.s.a
            public final void invoke(Object obj) {
                ((c) obj).C(c.a.this, metadata);
            }
        });
    }

    @Override // n3.p2.d
    public final void g0(final boolean z10, final int i10) {
        final c.a w12 = w1();
        M2(w12, 5, new s.a() { // from class: o3.c1
            @Override // a5.s.a
            public final void invoke(Object obj) {
                ((c) obj).v(c.a.this, z10, i10);
            }
        });
    }

    @Override // n3.p2.d
    public void h(final List<n4.b> list) {
        final c.a w12 = w1();
        M2(w12, 27, new s.a() { // from class: o3.g0
            @Override // a5.s.a
            public final void invoke(Object obj) {
                ((c) obj).l0(c.a.this, list);
            }
        });
    }

    @Override // o3.a
    public void h0(final p2 p2Var, Looper looper) {
        a5.a.f(this.f29239g == null || this.f29236d.f29243b.isEmpty());
        this.f29239g = (p2) a5.a.e(p2Var);
        this.f29240h = this.f29233a.d(looper, null);
        this.f29238f = this.f29238f.e(looper, new s.b() { // from class: o3.e1
            @Override // a5.s.b
            public final void a(Object obj, a5.m mVar) {
                l1.this.L2(p2Var, (c) obj, mVar);
            }
        });
    }

    @Override // o3.a
    public final void i(final long j10) {
        final c.a C1 = C1();
        M2(C1, 1010, new s.a() { // from class: o3.l
            @Override // a5.s.a
            public final void invoke(Object obj) {
                ((c) obj).y(c.a.this, j10);
            }
        });
    }

    @Override // o3.a
    public void i0(c cVar) {
        a5.a.e(cVar);
        this.f29238f.c(cVar);
    }

    @Override // o3.a
    public final void j(final q3.e eVar) {
        final c.a C1 = C1();
        M2(C1, 1015, new s.a() { // from class: o3.x0
            @Override // a5.s.a
            public final void invoke(Object obj) {
                l1.H2(c.a.this, eVar, (c) obj);
            }
        });
    }

    @Override // com.google.android.exoplayer2.drm.k
    public final void j0(int i10, t.b bVar) {
        final c.a A1 = A1(i10, bVar);
        M2(A1, IronSourceError.ERROR_RV_LOAD_DURING_SHOW, new s.a() { // from class: o3.d
            @Override // a5.s.a
            public final void invoke(Object obj) {
                ((c) obj).M(c.a.this);
            }
        });
    }

    @Override // o3.a
    public final void k(final Exception exc) {
        final c.a C1 = C1();
        M2(C1, IronSourceError.ERROR_RV_LOAD_FAIL_UNEXPECTED, new s.a() { // from class: o3.x
            @Override // a5.s.a
            public final void invoke(Object obj) {
                ((c) obj).Z(c.a.this, exc);
            }
        });
    }

    @Override // n3.p2.d
    public void k0(final l2 l2Var) {
        final c.a D1 = D1(l2Var);
        M2(D1, 10, new s.a() { // from class: o3.o0
            @Override // a5.s.a
            public final void invoke(Object obj) {
                ((c) obj).b0(c.a.this, l2Var);
            }
        });
    }

    @Override // o3.a
    public final void l(final n3.m1 m1Var, final q3.i iVar) {
        final c.a C1 = C1();
        M2(C1, 1017, new s.a() { // from class: o3.i0
            @Override // a5.s.a
            public final void invoke(Object obj) {
                l1.J2(c.a.this, m1Var, iVar, (c) obj);
            }
        });
    }

    @Override // com.google.android.exoplayer2.drm.k
    public final void l0(int i10, t.b bVar) {
        final c.a A1 = A1(i10, bVar);
        M2(A1, IronSourceError.ERROR_LOAD_FAILED_TIMEOUT, new s.a() { // from class: o3.v0
            @Override // a5.s.a
            public final void invoke(Object obj) {
                ((c) obj).r(c.a.this);
            }
        });
    }

    @Override // o3.a
    public final void m(final q3.e eVar) {
        final c.a C1 = C1();
        M2(C1, 1007, new s.a() { // from class: o3.w0
            @Override // a5.s.a
            public final void invoke(Object obj) {
                l1.K1(c.a.this, eVar, (c) obj);
            }
        });
    }

    @Override // n3.p2.d
    public void m0(final q3 q3Var) {
        final c.a w12 = w1();
        M2(w12, 2, new s.a() { // from class: o3.r0
            @Override // a5.s.a
            public final void invoke(Object obj) {
                ((c) obj).d0(c.a.this, q3Var);
            }
        });
    }

    @Override // n3.p2.d
    public void n(final n4.e eVar) {
        final c.a w12 = w1();
        M2(w12, 27, new s.a() { // from class: o3.s0
            @Override // a5.s.a
            public final void invoke(Object obj) {
                ((c) obj).m(c.a.this, eVar);
            }
        });
    }

    @Override // n3.p2.d
    public void n0(final boolean z10) {
        final c.a w12 = w1();
        M2(w12, 7, new s.a() { // from class: o3.y0
            @Override // a5.s.a
            public final void invoke(Object obj) {
                ((c) obj).o(c.a.this, z10);
            }
        });
    }

    @Override // o3.a
    public final void o(final q3.e eVar) {
        final c.a B1 = B1();
        M2(B1, 1020, new s.a() { // from class: o3.t0
            @Override // a5.s.a
            public final void invoke(Object obj) {
                l1.G2(c.a.this, eVar, (c) obj);
            }
        });
    }

    @Override // o3.a
    public final void p(final q3.e eVar) {
        final c.a B1 = B1();
        M2(B1, d9.f16965i, new s.a() { // from class: o3.u0
            @Override // a5.s.a
            public final void invoke(Object obj) {
                l1.J1(c.a.this, eVar, (c) obj);
            }
        });
    }

    @Override // o3.a
    public final void q(final int i10, final long j10) {
        final c.a B1 = B1();
        M2(B1, 1018, new s.a() { // from class: o3.g
            @Override // a5.s.a
            public final void invoke(Object obj) {
                ((c) obj).x(c.a.this, i10, j10);
            }
        });
    }

    @Override // o3.a
    public final void r(final Object obj, final long j10) {
        final c.a C1 = C1();
        M2(C1, 26, new s.a() { // from class: o3.b0
            @Override // a5.s.a
            public final void invoke(Object obj2) {
                ((c) obj2).f(c.a.this, obj, j10);
            }
        });
    }

    @Override // o3.a
    public final void s(final n3.m1 m1Var, final q3.i iVar) {
        final c.a C1 = C1();
        M2(C1, 1009, new s.a() { // from class: o3.j0
            @Override // a5.s.a
            public final void invoke(Object obj) {
                l1.L1(c.a.this, m1Var, iVar, (c) obj);
            }
        });
    }

    @Override // n3.p2.d
    public final void t(final int i10) {
        final c.a w12 = w1();
        M2(w12, 8, new s.a() { // from class: o3.h1
            @Override // a5.s.a
            public final void invoke(Object obj) {
                ((c) obj).i(c.a.this, i10);
            }
        });
    }

    @Override // n3.p2.d
    public final void u(final b5.a0 a0Var) {
        final c.a C1 = C1();
        M2(C1, 25, new s.a() { // from class: o3.n
            @Override // a5.s.a
            public final void invoke(Object obj) {
                l1.K2(c.a.this, a0Var, (c) obj);
            }
        });
    }

    @Override // o3.a
    public final void v(final Exception exc) {
        final c.a C1 = C1();
        M2(C1, IronSourceError.ERROR_RV_LOAD_SUCCESS_WRONG_AUCTION_ID, new s.a() { // from class: o3.w
            @Override // a5.s.a
            public final void invoke(Object obj) {
                ((c) obj).B(c.a.this, exc);
            }
        });
    }

    @Override // n3.p2.d
    public final void w(final o2 o2Var) {
        final c.a w12 = w1();
        M2(w12, 12, new s.a() { // from class: o3.p0
            @Override // a5.s.a
            public final void invoke(Object obj) {
                ((c) obj).t(c.a.this, o2Var);
            }
        });
    }

    protected final c.a w1() {
        return x1(this.f29236d.d());
    }

    @Override // o3.a
    public final void x(final int i10, final long j10, final long j11) {
        final c.a C1 = C1();
        M2(C1, 1011, new s.a() { // from class: o3.i
            @Override // a5.s.a
            public final void invoke(Object obj) {
                ((c) obj).h(c.a.this, i10, j10, j11);
            }
        });
    }

    @Override // o3.a
    public final void y(final long j10, final int i10) {
        final c.a B1 = B1();
        M2(B1, 1021, new s.a() { // from class: o3.m
            @Override // a5.s.a
            public final void invoke(Object obj) {
                ((c) obj).Y(c.a.this, j10, i10);
            }
        });
    }

    protected final c.a y1(l3 l3Var, int i10, t.b bVar) {
        long K;
        t.b bVar2 = l3Var.u() ? null : bVar;
        long b10 = this.f29233a.b();
        boolean z10 = true;
        boolean z11 = l3Var.equals(this.f29239g.t()) && i10 == this.f29239g.N();
        long j10 = 0;
        if (bVar2 != null && bVar2.b()) {
            if (!z11 || this.f29239g.o() != bVar2.f25140b || this.f29239g.H() != bVar2.f25141c) {
                z10 = false;
            }
            if (z10) {
                j10 = this.f29239g.getCurrentPosition();
            }
        } else if (z11) {
            K = this.f29239g.K();
            return new c.a(b10, l3Var, i10, bVar2, K, this.f29239g.t(), this.f29239g.N(), this.f29236d.d(), this.f29239g.getCurrentPosition(), this.f29239g.g());
        } else if (!l3Var.u()) {
            j10 = l3Var.r(i10, this.f29235c).d();
        }
        K = j10;
        return new c.a(b10, l3Var, i10, bVar2, K, this.f29239g.t(), this.f29239g.N(), this.f29236d.d(), this.f29239g.getCurrentPosition(), this.f29239g.g());
    }

    @Override // n3.p2.d
    public final void z(final int i10) {
        final c.a w12 = w1();
        M2(w12, 6, new s.a() { // from class: o3.k1
            @Override // a5.s.a
            public final void invoke(Object obj) {
                ((c) obj).N(c.a.this, i10);
            }
        });
    }
}
