package n3;

import java.io.IOException;
/* compiled from: BaseRenderer.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public abstract class f implements y2, a3 {

    /* renamed from: a  reason: collision with root package name */
    private final int f27942a;

    /* renamed from: c  reason: collision with root package name */
    private b3 f27944c;

    /* renamed from: d  reason: collision with root package name */
    private int f27945d;

    /* renamed from: e  reason: collision with root package name */
    private o3.q1 f27946e;

    /* renamed from: f  reason: collision with root package name */
    private int f27947f;

    /* renamed from: g  reason: collision with root package name */
    private e4.e0 f27948g;

    /* renamed from: h  reason: collision with root package name */
    private m1[] f27949h;

    /* renamed from: i  reason: collision with root package name */
    private long f27950i;

    /* renamed from: j  reason: collision with root package name */
    private long f27951j;

    /* renamed from: l  reason: collision with root package name */
    private boolean f27953l;

    /* renamed from: m  reason: collision with root package name */
    private boolean f27954m;

    /* renamed from: b  reason: collision with root package name */
    private final n1 f27943b = new n1();

    /* renamed from: k  reason: collision with root package name */
    private long f27952k = Long.MIN_VALUE;

    public f(int i10) {
        this.f27942a = i10;
    }

    private void N(long j10, boolean z10) throws q {
        this.f27953l = false;
        this.f27951j = j10;
        this.f27952k = j10;
        H(j10, z10);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final n1 A() {
        this.f27943b.a();
        return this.f27943b;
    }

    protected final int B() {
        return this.f27945d;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final o3.q1 C() {
        return (o3.q1) a5.a.e(this.f27946e);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final m1[] D() {
        return (m1[]) a5.a.e(this.f27949h);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final boolean E() {
        return g() ? this.f27953l : ((e4.e0) a5.a.e(this.f27948g)).isReady();
    }

    protected abstract void F();

    protected void G(boolean z10, boolean z11) throws q {
    }

    protected abstract void H(long j10, boolean z10) throws q;

    protected void I() {
    }

    protected void J() throws q {
    }

    protected void K() {
    }

    protected abstract void L(m1[] m1VarArr, long j10, long j11) throws q;

    /* JADX INFO: Access modifiers changed from: protected */
    public final int M(n1 n1Var, q3.g gVar, int i10) {
        int f10 = ((e4.e0) a5.a.e(this.f27948g)).f(n1Var, gVar, i10);
        if (f10 == -4) {
            if (gVar.l()) {
                this.f27952k = Long.MIN_VALUE;
                return this.f27953l ? -4 : -3;
            }
            long j10 = gVar.f30093e + this.f27950i;
            gVar.f30093e = j10;
            this.f27952k = Math.max(this.f27952k, j10);
        } else if (f10 == -5) {
            m1 m1Var = (m1) a5.a.e(n1Var.f28250b);
            if (m1Var.f28189p != Long.MAX_VALUE) {
                n1Var.f28250b = m1Var.b().i0(m1Var.f28189p + this.f27950i).E();
            }
        }
        return f10;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public int O(long j10) {
        return ((e4.e0) a5.a.e(this.f27948g)).o(j10 - this.f27950i);
    }

    @Override // n3.y2
    public final void e() {
        a5.a.f(this.f27947f == 1);
        this.f27943b.a();
        this.f27947f = 0;
        this.f27948g = null;
        this.f27949h = null;
        this.f27953l = false;
        F();
    }

    @Override // n3.y2, n3.a3
    public final int f() {
        return this.f27942a;
    }

    @Override // n3.y2
    public final boolean g() {
        return this.f27952k == Long.MIN_VALUE;
    }

    @Override // n3.y2
    public final int getState() {
        return this.f27947f;
    }

    @Override // n3.y2
    public final void h(int i10, o3.q1 q1Var) {
        this.f27945d = i10;
        this.f27946e = q1Var;
    }

    @Override // n3.y2
    public final void i() {
        this.f27953l = true;
    }

    @Override // n3.t2.b
    public void j(int i10, Object obj) throws q {
    }

    @Override // n3.y2
    public final void k(b3 b3Var, m1[] m1VarArr, e4.e0 e0Var, long j10, boolean z10, boolean z11, long j11, long j12) throws q {
        a5.a.f(this.f27947f == 0);
        this.f27944c = b3Var;
        this.f27947f = 1;
        G(z10, z11);
        q(m1VarArr, e0Var, j11, j12);
        N(j10, z10);
    }

    @Override // n3.y2
    public final void l() throws IOException {
        ((e4.e0) a5.a.e(this.f27948g)).a();
    }

    @Override // n3.y2
    public final boolean m() {
        return this.f27953l;
    }

    @Override // n3.y2
    public final a3 n() {
        return this;
    }

    @Override // n3.y2
    public /* synthetic */ void p(float f10, float f11) {
        x2.a(this, f10, f11);
    }

    @Override // n3.y2
    public final void q(m1[] m1VarArr, e4.e0 e0Var, long j10, long j11) throws q {
        a5.a.f(!this.f27953l);
        this.f27948g = e0Var;
        if (this.f27952k == Long.MIN_VALUE) {
            this.f27952k = j10;
        }
        this.f27949h = m1VarArr;
        this.f27950i = j11;
        L(m1VarArr, j10, j11);
    }

    @Override // n3.a3
    public int r() throws q {
        return 0;
    }

    @Override // n3.y2
    public final void reset() {
        a5.a.f(this.f27947f == 0);
        this.f27943b.a();
        I();
    }

    @Override // n3.y2
    public final void start() throws q {
        a5.a.f(this.f27947f == 1);
        this.f27947f = 2;
        J();
    }

    @Override // n3.y2
    public final void stop() {
        a5.a.f(this.f27947f == 2);
        this.f27947f = 1;
        K();
    }

    @Override // n3.y2
    public final e4.e0 t() {
        return this.f27948g;
    }

    @Override // n3.y2
    public final long u() {
        return this.f27952k;
    }

    @Override // n3.y2
    public final void v(long j10) throws q {
        N(j10, false);
    }

    @Override // n3.y2
    public a5.v w() {
        return null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final q x(Throwable th, m1 m1Var, int i10) {
        return y(th, m1Var, false, i10);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final q y(Throwable th, m1 m1Var, boolean z10, int i10) {
        int i11;
        if (m1Var != null && !this.f27954m) {
            this.f27954m = true;
            try {
                i11 = z2.f(a(m1Var));
            } catch (q unused) {
            } finally {
                this.f27954m = false;
            }
            return q.g(th, getName(), B(), m1Var, i11, z10, i10);
        }
        i11 = 4;
        return q.g(th, getName(), B(), m1Var, i11, z10, i10);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final b3 z() {
        return (b3) a5.a.e(this.f27944c);
    }
}
