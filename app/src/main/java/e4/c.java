package e4;

import a5.p0;
import e4.q;
import java.io.IOException;
import n3.d3;
import n3.m1;
import n3.n1;
/* compiled from: ClippingMediaPeriod.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class c implements q, q.a {

    /* renamed from: a  reason: collision with root package name */
    public final q f24992a;

    /* renamed from: b  reason: collision with root package name */
    private q.a f24993b;

    /* renamed from: c  reason: collision with root package name */
    private a[] f24994c = new a[0];

    /* renamed from: d  reason: collision with root package name */
    private long f24995d;

    /* renamed from: e  reason: collision with root package name */
    long f24996e;

    /* renamed from: f  reason: collision with root package name */
    long f24997f;

    /* compiled from: ClippingMediaPeriod.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    private final class a implements e0 {

        /* renamed from: a  reason: collision with root package name */
        public final e0 f24998a;

        /* renamed from: b  reason: collision with root package name */
        private boolean f24999b;

        public a(e0 e0Var) {
            this.f24998a = e0Var;
        }

        @Override // e4.e0
        public void a() throws IOException {
            this.f24998a.a();
        }

        public void b() {
            this.f24999b = false;
        }

        @Override // e4.e0
        public int f(n1 n1Var, q3.g gVar, int i10) {
            if (c.this.n()) {
                return -3;
            }
            if (this.f24999b) {
                gVar.o(4);
                return -4;
            }
            int f10 = this.f24998a.f(n1Var, gVar, i10);
            if (f10 == -5) {
                m1 m1Var = (m1) a5.a.e(n1Var.f28250b);
                int i11 = m1Var.B;
                if (i11 != 0 || m1Var.C != 0) {
                    c cVar = c.this;
                    if (cVar.f24996e != 0) {
                        i11 = 0;
                    }
                    n1Var.f28250b = m1Var.b().N(i11).O(cVar.f24997f == Long.MIN_VALUE ? m1Var.C : 0).E();
                }
                return -5;
            }
            c cVar2 = c.this;
            long j10 = cVar2.f24997f;
            if (j10 == Long.MIN_VALUE || ((f10 != -4 || gVar.f30093e < j10) && !(f10 == -3 && cVar2.g() == Long.MIN_VALUE && !gVar.f30092d))) {
                return f10;
            }
            gVar.g();
            gVar.o(4);
            this.f24999b = true;
            return -4;
        }

        @Override // e4.e0
        public boolean isReady() {
            return !c.this.n() && this.f24998a.isReady();
        }

        @Override // e4.e0
        public int o(long j10) {
            if (c.this.n()) {
                return -3;
            }
            return this.f24998a.o(j10);
        }
    }

    public c(q qVar, boolean z10, long j10, long j11) {
        this.f24992a = qVar;
        this.f24995d = z10 ? j10 : -9223372036854775807L;
        this.f24996e = j10;
        this.f24997f = j11;
    }

    private d3 m(long j10, d3 d3Var) {
        long r10 = p0.r(d3Var.f27936a, 0L, j10 - this.f24996e);
        long j11 = d3Var.f27937b;
        long j12 = this.f24997f;
        long r11 = p0.r(j11, 0L, j12 == Long.MIN_VALUE ? Long.MAX_VALUE : j12 - j10);
        return (r10 == d3Var.f27936a && r11 == d3Var.f27937b) ? d3Var : new d3(r10, r11);
    }

    private static boolean q(long j10, x4.s[] sVarArr) {
        if (j10 != 0) {
            for (x4.s sVar : sVarArr) {
                if (sVar != null) {
                    m1 s10 = sVar.s();
                    if (!a5.x.a(s10.f28185l, s10.f28182i)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override // e4.q.a
    public void a(q qVar) {
        ((q.a) a5.a.e(this.f24993b)).a(this);
    }

    @Override // e4.q, e4.f0
    public long b() {
        long b10 = this.f24992a.b();
        if (b10 != Long.MIN_VALUE) {
            long j10 = this.f24997f;
            if (j10 == Long.MIN_VALUE || b10 < j10) {
                return b10;
            }
        }
        return Long.MIN_VALUE;
    }

    @Override // e4.q, e4.f0
    public boolean c() {
        return this.f24992a.c();
    }

    @Override // e4.q, e4.f0
    public boolean d(long j10) {
        return this.f24992a.d(j10);
    }

    @Override // e4.q
    public long e(long j10, d3 d3Var) {
        long j11 = this.f24996e;
        if (j10 == j11) {
            return j11;
        }
        return this.f24992a.e(j10, m(j10, d3Var));
    }

    @Override // e4.q, e4.f0
    public long g() {
        long g10 = this.f24992a.g();
        if (g10 != Long.MIN_VALUE) {
            long j10 = this.f24997f;
            if (j10 == Long.MIN_VALUE || g10 < j10) {
                return g10;
            }
        }
        return Long.MIN_VALUE;
    }

    @Override // e4.q, e4.f0
    public void h(long j10) {
        this.f24992a.h(j10);
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0062, code lost:
        if (r2 > r4) goto L26;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x006e  */
    @Override // e4.q
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public long j(x4.s[] r13, boolean[] r14, e4.e0[] r15, boolean[] r16, long r17) {
        /*
            r12 = this;
            r0 = r12
            r1 = r15
            int r2 = r1.length
            e4.c$a[] r2 = new e4.c.a[r2]
            r0.f24994c = r2
            int r2 = r1.length
            e4.e0[] r9 = new e4.e0[r2]
            r10 = 0
            r2 = r10
        Lc:
            int r3 = r1.length
            r11 = 0
            if (r2 >= r3) goto L25
            e4.c$a[] r3 = r0.f24994c
            r4 = r1[r2]
            e4.c$a r4 = (e4.c.a) r4
            r3[r2] = r4
            r4 = r3[r2]
            if (r4 == 0) goto L20
            r3 = r3[r2]
            e4.e0 r11 = r3.f24998a
        L20:
            r9[r2] = r11
            int r2 = r2 + 1
            goto Lc
        L25:
            e4.q r2 = r0.f24992a
            r3 = r13
            r4 = r14
            r5 = r9
            r6 = r16
            r7 = r17
            long r2 = r2.j(r3, r4, r5, r6, r7)
            boolean r4 = r12.n()
            if (r4 == 0) goto L47
            long r4 = r0.f24996e
            int r6 = (r17 > r4 ? 1 : (r17 == r4 ? 0 : -1))
            if (r6 != 0) goto L47
            r6 = r13
            boolean r4 = q(r4, r13)
            if (r4 == 0) goto L47
            r4 = r2
            goto L4c
        L47:
            r4 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
        L4c:
            r0.f24995d = r4
            int r4 = (r2 > r17 ? 1 : (r2 == r17 ? 0 : -1))
            if (r4 == 0) goto L67
            long r4 = r0.f24996e
            int r4 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r4 < 0) goto L65
            long r4 = r0.f24997f
            r6 = -9223372036854775808
            int r6 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r6 == 0) goto L67
            int r4 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r4 > 0) goto L65
            goto L67
        L65:
            r4 = r10
            goto L68
        L67:
            r4 = 1
        L68:
            a5.a.f(r4)
        L6b:
            int r4 = r1.length
            if (r10 >= r4) goto L97
            r4 = r9[r10]
            if (r4 != 0) goto L77
            e4.c$a[] r4 = r0.f24994c
            r4[r10] = r11
            goto L8e
        L77:
            e4.c$a[] r4 = r0.f24994c
            r5 = r4[r10]
            if (r5 == 0) goto L85
            r5 = r4[r10]
            e4.e0 r5 = r5.f24998a
            r6 = r9[r10]
            if (r5 == r6) goto L8e
        L85:
            e4.c$a r5 = new e4.c$a
            r6 = r9[r10]
            r5.<init>(r6)
            r4[r10] = r5
        L8e:
            e4.c$a[] r4 = r0.f24994c
            r4 = r4[r10]
            r1[r10] = r4
            int r10 = r10 + 1
            goto L6b
        L97:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: e4.c.j(x4.s[], boolean[], e4.e0[], boolean[], long):long");
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0032, code lost:
        if (r0 > r6) goto L18;
     */
    @Override // e4.q
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public long k(long r6) {
        /*
            r5 = this;
            r0 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r5.f24995d = r0
            e4.c$a[] r0 = r5.f24994c
            int r1 = r0.length
            r2 = 0
            r3 = r2
        Lc:
            if (r3 >= r1) goto L18
            r4 = r0[r3]
            if (r4 == 0) goto L15
            r4.b()
        L15:
            int r3 = r3 + 1
            goto Lc
        L18:
            e4.q r0 = r5.f24992a
            long r0 = r0.k(r6)
            int r6 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r6 == 0) goto L34
            long r6 = r5.f24996e
            int r6 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r6 < 0) goto L35
            long r6 = r5.f24997f
            r3 = -9223372036854775808
            int r3 = (r6 > r3 ? 1 : (r6 == r3 ? 0 : -1))
            if (r3 == 0) goto L34
            int r6 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r6 > 0) goto L35
        L34:
            r2 = 1
        L35:
            a5.a.f(r2)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: e4.c.k(long):long");
    }

    @Override // e4.q
    public long l() {
        if (n()) {
            long j10 = this.f24995d;
            this.f24995d = -9223372036854775807L;
            long l10 = l();
            return l10 != -9223372036854775807L ? l10 : j10;
        }
        long l11 = this.f24992a.l();
        if (l11 == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        boolean z10 = true;
        a5.a.f(l11 >= this.f24996e);
        long j11 = this.f24997f;
        if (j11 != Long.MIN_VALUE && l11 > j11) {
            z10 = false;
        }
        a5.a.f(z10);
        return l11;
    }

    boolean n() {
        return this.f24995d != -9223372036854775807L;
    }

    @Override // e4.f0.a
    /* renamed from: o */
    public void f(q qVar) {
        ((q.a) a5.a.e(this.f24993b)).f(this);
    }

    @Override // e4.q
    public void p() throws IOException {
        this.f24992a.p();
    }

    @Override // e4.q
    public void r(q.a aVar, long j10) {
        this.f24993b = aVar;
        this.f24992a.r(this, j10);
    }

    public void s(long j10, long j11) {
        this.f24996e = j10;
        this.f24997f = j11;
    }

    @Override // e4.q
    public m0 t() {
        return this.f24992a.t();
    }

    @Override // e4.q
    public void u(long j10, boolean z10) {
        this.f24992a.u(j10, z10);
    }
}
