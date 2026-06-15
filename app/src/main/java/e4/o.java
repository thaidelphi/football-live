package e4;

import a5.p0;
import e4.t;
import n3.l3;
import n3.u1;
/* compiled from: MaskingMediaSource.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class o extends n0 {

    /* renamed from: m  reason: collision with root package name */
    private final boolean f25120m;

    /* renamed from: n  reason: collision with root package name */
    private final l3.d f25121n;

    /* renamed from: o  reason: collision with root package name */
    private final l3.b f25122o;

    /* renamed from: p  reason: collision with root package name */
    private a f25123p;

    /* renamed from: q  reason: collision with root package name */
    private n f25124q;

    /* renamed from: r  reason: collision with root package name */
    private boolean f25125r;

    /* renamed from: s  reason: collision with root package name */
    private boolean f25126s;

    /* renamed from: t  reason: collision with root package name */
    private boolean f25127t;

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: MaskingMediaSource.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public static final class a extends k {

        /* renamed from: f  reason: collision with root package name */
        public static final Object f25128f = new Object();

        /* renamed from: d  reason: collision with root package name */
        private final Object f25129d;

        /* renamed from: e  reason: collision with root package name */
        private final Object f25130e;

        private a(l3 l3Var, Object obj, Object obj2) {
            super(l3Var);
            this.f25129d = obj;
            this.f25130e = obj2;
        }

        public static a A(l3 l3Var, Object obj, Object obj2) {
            return new a(l3Var, obj, obj2);
        }

        public static a z(u1 u1Var) {
            return new a(new b(u1Var), l3.d.f28142r, f25128f);
        }

        @Override // e4.k, n3.l3
        public int f(Object obj) {
            Object obj2;
            l3 l3Var = this.f25081c;
            if (f25128f.equals(obj) && (obj2 = this.f25130e) != null) {
                obj = obj2;
            }
            return l3Var.f(obj);
        }

        @Override // e4.k, n3.l3
        public l3.b k(int i10, l3.b bVar, boolean z10) {
            this.f25081c.k(i10, bVar, z10);
            if (p0.c(bVar.f28132b, this.f25130e) && z10) {
                bVar.f28132b = f25128f;
            }
            return bVar;
        }

        @Override // e4.k, n3.l3
        public Object q(int i10) {
            Object q10 = this.f25081c.q(i10);
            return p0.c(q10, this.f25130e) ? f25128f : q10;
        }

        @Override // e4.k, n3.l3
        public l3.d s(int i10, l3.d dVar, long j10) {
            this.f25081c.s(i10, dVar, j10);
            if (p0.c(dVar.f28146a, this.f25129d)) {
                dVar.f28146a = l3.d.f28142r;
            }
            return dVar;
        }

        public a y(l3 l3Var) {
            return new a(l3Var, this.f25129d, this.f25130e);
        }
    }

    /* compiled from: MaskingMediaSource.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public static final class b extends l3 {

        /* renamed from: c  reason: collision with root package name */
        private final u1 f25131c;

        public b(u1 u1Var) {
            this.f25131c = u1Var;
        }

        @Override // n3.l3
        public int f(Object obj) {
            return obj == a.f25128f ? 0 : -1;
        }

        @Override // n3.l3
        public l3.b k(int i10, l3.b bVar, boolean z10) {
            bVar.w(z10 ? 0 : null, z10 ? a.f25128f : null, 0, -9223372036854775807L, 0L, f4.c.f25390g, true);
            return bVar;
        }

        @Override // n3.l3
        public int m() {
            return 1;
        }

        @Override // n3.l3
        public Object q(int i10) {
            return a.f25128f;
        }

        @Override // n3.l3
        public l3.d s(int i10, l3.d dVar, long j10) {
            dVar.i(l3.d.f28142r, this.f25131c, null, -9223372036854775807L, -9223372036854775807L, -9223372036854775807L, false, true, null, 0L, -9223372036854775807L, 0, 0, 0L);
            dVar.f28157l = true;
            return dVar;
        }

        @Override // n3.l3
        public int t() {
            return 1;
        }
    }

    public o(t tVar, boolean z10) {
        super(tVar);
        this.f25120m = z10 && tVar.l();
        this.f25121n = new l3.d();
        this.f25122o = new l3.b();
        l3 o10 = tVar.o();
        if (o10 != null) {
            this.f25123p = a.A(o10, null, null);
            this.f25127t = true;
            return;
        }
        this.f25123p = a.z(tVar.a());
    }

    private Object W(Object obj) {
        return (this.f25123p.f25130e == null || !this.f25123p.f25130e.equals(obj)) ? obj : a.f25128f;
    }

    private Object X(Object obj) {
        return (this.f25123p.f25130e == null || !obj.equals(a.f25128f)) ? obj : this.f25123p.f25130e;
    }

    private void Z(long j10) {
        n nVar = this.f25124q;
        int f10 = this.f25123p.f(nVar.f25109a.f25139a);
        if (f10 == -1) {
            return;
        }
        long j11 = this.f25123p.j(f10, this.f25122o).f28134d;
        if (j11 != -9223372036854775807L && j10 >= j11) {
            j10 = Math.max(0L, j11 - 1);
        }
        nVar.v(j10);
    }

    @Override // e4.e, e4.a
    public void D() {
        this.f25126s = false;
        this.f25125r = false;
        super.D();
    }

    @Override // e4.n0
    protected t.b L(t.b bVar) {
        return bVar.c(W(bVar.f25139a));
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:32:? A[RETURN, SYNTHETIC] */
    @Override // e4.n0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected void S(n3.l3 r15) {
        /*
            r14 = this;
            boolean r0 = r14.f25126s
            if (r0 == 0) goto L19
            e4.o$a r0 = r14.f25123p
            e4.o$a r15 = r0.y(r15)
            r14.f25123p = r15
            e4.n r15 = r14.f25124q
            if (r15 == 0) goto Lae
            long r0 = r15.n()
            r14.Z(r0)
            goto Lae
        L19:
            boolean r0 = r15.u()
            if (r0 == 0) goto L36
            boolean r0 = r14.f25127t
            if (r0 == 0) goto L2a
            e4.o$a r0 = r14.f25123p
            e4.o$a r15 = r0.y(r15)
            goto L32
        L2a:
            java.lang.Object r0 = n3.l3.d.f28142r
            java.lang.Object r1 = e4.o.a.f25128f
            e4.o$a r15 = e4.o.a.A(r15, r0, r1)
        L32:
            r14.f25123p = r15
            goto Lae
        L36:
            n3.l3$d r0 = r14.f25121n
            r1 = 0
            r15.r(r1, r0)
            n3.l3$d r0 = r14.f25121n
            long r2 = r0.e()
            n3.l3$d r0 = r14.f25121n
            java.lang.Object r0 = r0.f28146a
            e4.n r4 = r14.f25124q
            if (r4 == 0) goto L74
            long r4 = r4.o()
            e4.o$a r6 = r14.f25123p
            e4.n r7 = r14.f25124q
            e4.t$b r7 = r7.f25109a
            java.lang.Object r7 = r7.f25139a
            n3.l3$b r8 = r14.f25122o
            r6.l(r7, r8)
            n3.l3$b r6 = r14.f25122o
            long r6 = r6.q()
            long r6 = r6 + r4
            e4.o$a r4 = r14.f25123p
            n3.l3$d r5 = r14.f25121n
            n3.l3$d r1 = r4.r(r1, r5)
            long r4 = r1.e()
            int r1 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r1 == 0) goto L74
            r12 = r6
            goto L75
        L74:
            r12 = r2
        L75:
            n3.l3$d r9 = r14.f25121n
            n3.l3$b r10 = r14.f25122o
            r11 = 0
            r8 = r15
            android.util.Pair r1 = r8.n(r9, r10, r11, r12)
            java.lang.Object r2 = r1.first
            java.lang.Object r1 = r1.second
            java.lang.Long r1 = (java.lang.Long) r1
            long r3 = r1.longValue()
            boolean r1 = r14.f25127t
            if (r1 == 0) goto L94
            e4.o$a r0 = r14.f25123p
            e4.o$a r15 = r0.y(r15)
            goto L98
        L94:
            e4.o$a r15 = e4.o.a.A(r15, r0, r2)
        L98:
            r14.f25123p = r15
            e4.n r15 = r14.f25124q
            if (r15 == 0) goto Lae
            r14.Z(r3)
            e4.t$b r15 = r15.f25109a
            java.lang.Object r0 = r15.f25139a
            java.lang.Object r0 = r14.X(r0)
            e4.t$b r15 = r15.c(r0)
            goto Laf
        Lae:
            r15 = 0
        Laf:
            r0 = 1
            r14.f25127t = r0
            r14.f25126s = r0
            e4.o$a r0 = r14.f25123p
            r14.C(r0)
            if (r15 == 0) goto Lc6
            e4.n r0 = r14.f25124q
            java.lang.Object r0 = a5.a.e(r0)
            e4.n r0 = (e4.n) r0
            r0.m(r15)
        Lc6:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: e4.o.S(n3.l3):void");
    }

    @Override // e4.n0
    public void U() {
        if (this.f25120m) {
            return;
        }
        this.f25125r = true;
        T();
    }

    @Override // e4.t
    /* renamed from: V */
    public n d(t.b bVar, z4.b bVar2, long j10) {
        n nVar = new n(bVar, bVar2, j10);
        nVar.x(this.f25119k);
        if (this.f25126s) {
            nVar.m(bVar.c(X(bVar.f25139a)));
        } else {
            this.f25124q = nVar;
            if (!this.f25125r) {
                this.f25125r = true;
                T();
            }
        }
        return nVar;
    }

    public l3 Y() {
        return this.f25123p;
    }

    @Override // e4.t
    public void g(q qVar) {
        ((n) qVar).w();
        if (qVar == this.f25124q) {
            this.f25124q = null;
        }
    }

    @Override // e4.e, e4.t
    public void k() {
    }
}
