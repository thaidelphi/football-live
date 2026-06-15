package o3;

import android.util.SparseArray;
import com.google.android.exoplayer2.metadata.Metadata;
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
/* compiled from: AnalyticsListener.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public interface c {

    /* compiled from: AnalyticsListener.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final long f29151a;

        /* renamed from: b  reason: collision with root package name */
        public final l3 f29152b;

        /* renamed from: c  reason: collision with root package name */
        public final int f29153c;

        /* renamed from: d  reason: collision with root package name */
        public final t.b f29154d;

        /* renamed from: e  reason: collision with root package name */
        public final long f29155e;

        /* renamed from: f  reason: collision with root package name */
        public final l3 f29156f;

        /* renamed from: g  reason: collision with root package name */
        public final int f29157g;

        /* renamed from: h  reason: collision with root package name */
        public final t.b f29158h;

        /* renamed from: i  reason: collision with root package name */
        public final long f29159i;

        /* renamed from: j  reason: collision with root package name */
        public final long f29160j;

        public a(long j10, l3 l3Var, int i10, t.b bVar, long j11, l3 l3Var2, int i11, t.b bVar2, long j12, long j13) {
            this.f29151a = j10;
            this.f29152b = l3Var;
            this.f29153c = i10;
            this.f29154d = bVar;
            this.f29155e = j11;
            this.f29156f = l3Var2;
            this.f29157g = i11;
            this.f29158h = bVar2;
            this.f29159i = j12;
            this.f29160j = j13;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || a.class != obj.getClass()) {
                return false;
            }
            a aVar = (a) obj;
            return this.f29151a == aVar.f29151a && this.f29153c == aVar.f29153c && this.f29155e == aVar.f29155e && this.f29157g == aVar.f29157g && this.f29159i == aVar.f29159i && this.f29160j == aVar.f29160j && x5.f.a(this.f29152b, aVar.f29152b) && x5.f.a(this.f29154d, aVar.f29154d) && x5.f.a(this.f29156f, aVar.f29156f) && x5.f.a(this.f29158h, aVar.f29158h);
        }

        public int hashCode() {
            return x5.f.b(Long.valueOf(this.f29151a), this.f29152b, Integer.valueOf(this.f29153c), this.f29154d, Long.valueOf(this.f29155e), this.f29156f, Integer.valueOf(this.f29157g), this.f29158h, Long.valueOf(this.f29159i), Long.valueOf(this.f29160j));
        }
    }

    /* compiled from: AnalyticsListener.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        private final a5.m f29161a;

        /* renamed from: b  reason: collision with root package name */
        private final SparseArray<a> f29162b;

        public b(a5.m mVar, SparseArray<a> sparseArray) {
            this.f29161a = mVar;
            SparseArray<a> sparseArray2 = new SparseArray<>(mVar.d());
            for (int i10 = 0; i10 < mVar.d(); i10++) {
                int c10 = mVar.c(i10);
                sparseArray2.append(c10, (a) a5.a.e(sparseArray.get(c10)));
            }
            this.f29162b = sparseArray2;
        }

        public boolean a(int i10) {
            return this.f29161a.a(i10);
        }

        public int b(int i10) {
            return this.f29161a.c(i10);
        }

        public a c(int i10) {
            return (a) a5.a.e(this.f29162b.get(i10));
        }

        public int d() {
            return this.f29161a.d();
        }
    }

    void A(a aVar, boolean z10);

    void B(a aVar, Exception exc);

    void C(a aVar, Metadata metadata);

    void D(a aVar, q3.e eVar);

    @Deprecated
    void E(a aVar, int i10, q3.e eVar);

    @Deprecated
    void F(a aVar, boolean z10, int i10);

    @Deprecated
    void G(a aVar, int i10, int i11, int i12, float f10);

    void H(a aVar, int i10);

    void I(a aVar, e4.p pVar);

    void J(a aVar, String str);

    void K(a aVar, Exception exc);

    @Deprecated
    void L(a aVar, n3.m1 m1Var);

    void M(a aVar);

    void N(a aVar, int i10);

    void O(a aVar, String str);

    void P(p2 p2Var, b bVar);

    void Q(a aVar, q3.e eVar);

    @Deprecated
    void R(a aVar, boolean z10);

    void S(a aVar, n3.o oVar);

    @Deprecated
    void T(a aVar, String str, long j10);

    @Deprecated
    void U(a aVar);

    void V(a aVar, e4.l lVar, e4.p pVar);

    void W(a aVar, n3.m1 m1Var, q3.i iVar);

    @Deprecated
    void X(a aVar, int i10, q3.e eVar);

    void Y(a aVar, long j10, int i10);

    void Z(a aVar, Exception exc);

    void a(a aVar, int i10, boolean z10);

    void a0(a aVar, e4.p pVar);

    @Deprecated
    void b(a aVar, int i10);

    void b0(a aVar, l2 l2Var);

    void c(a aVar, String str, long j10, long j11);

    void c0(a aVar, p2.b bVar);

    void d0(a aVar, q3 q3Var);

    void e(a aVar, boolean z10);

    void f(a aVar, Object obj, long j10);

    @Deprecated
    void f0(a aVar);

    void g(a aVar, p2.e eVar, p2.e eVar2, int i10);

    void g0(a aVar, int i10);

    void h(a aVar, int i10, long j10, long j11);

    void h0(a aVar, boolean z10);

    void i(a aVar, int i10);

    void i0(a aVar, b5.a0 a0Var);

    void j(a aVar);

    void j0(a aVar, z1 z1Var);

    @Deprecated
    void k(a aVar, int i10, String str, long j10);

    void k0(a aVar, n3.m1 m1Var, q3.i iVar);

    void l(a aVar, int i10, int i11);

    @Deprecated
    void l0(a aVar, List<n4.b> list);

    void m(a aVar, n4.e eVar);

    void m0(a aVar, u1 u1Var, int i10);

    void n(a aVar, String str, long j10, long j11);

    void n0(a aVar);

    void o(a aVar, boolean z10);

    void o0(a aVar, q3.e eVar);

    void p(a aVar, e4.l lVar, e4.p pVar, IOException iOException, boolean z10);

    void p0(a aVar, e4.l lVar, e4.p pVar);

    void q(a aVar, l2 l2Var);

    @Deprecated
    void q0(a aVar, n3.m1 m1Var);

    void r(a aVar);

    void r0(a aVar, e4.l lVar, e4.p pVar);

    void s(a aVar, Exception exc);

    @Deprecated
    void s0(a aVar, String str, long j10);

    void t(a aVar, o2 o2Var);

    void u(a aVar, int i10, long j10, long j11);

    void u0(a aVar, q3.e eVar);

    void v(a aVar, boolean z10, int i10);

    @Deprecated
    void v0(a aVar);

    @Deprecated
    void w0(a aVar, int i10, n3.m1 m1Var);

    void x(a aVar, int i10, long j10);

    void y(a aVar, long j10);

    void z(a aVar, int i10);
}
