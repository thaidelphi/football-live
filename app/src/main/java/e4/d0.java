package e4;

import a5.p0;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.exoplayer2.drm.DrmInitData;
import com.google.android.exoplayer2.drm.j;
import com.google.android.exoplayer2.drm.k;
import com.google.android.exoplayer2.drm.l;
import e4.d0;
import java.io.IOException;
import n3.m1;
import n3.n1;
import s3.t;
/* compiled from: SampleQueue.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class d0 implements s3.t {
    private m1 A;
    private m1 B;
    private int C;
    private boolean D;
    private boolean E;
    private long F;
    private boolean G;

    /* renamed from: a  reason: collision with root package name */
    private final b0 f25004a;

    /* renamed from: d  reason: collision with root package name */
    private final com.google.android.exoplayer2.drm.l f25007d;

    /* renamed from: e  reason: collision with root package name */
    private final k.a f25008e;

    /* renamed from: f  reason: collision with root package name */
    private d f25009f;

    /* renamed from: g  reason: collision with root package name */
    private m1 f25010g;

    /* renamed from: h  reason: collision with root package name */
    private com.google.android.exoplayer2.drm.j f25011h;

    /* renamed from: p  reason: collision with root package name */
    private int f25019p;

    /* renamed from: q  reason: collision with root package name */
    private int f25020q;

    /* renamed from: r  reason: collision with root package name */
    private int f25021r;

    /* renamed from: s  reason: collision with root package name */
    private int f25022s;

    /* renamed from: w  reason: collision with root package name */
    private boolean f25026w;

    /* renamed from: z  reason: collision with root package name */
    private boolean f25029z;

    /* renamed from: b  reason: collision with root package name */
    private final b f25005b = new b();

    /* renamed from: i  reason: collision with root package name */
    private int f25012i = 1000;

    /* renamed from: j  reason: collision with root package name */
    private int[] f25013j = new int[1000];

    /* renamed from: k  reason: collision with root package name */
    private long[] f25014k = new long[1000];

    /* renamed from: n  reason: collision with root package name */
    private long[] f25017n = new long[1000];

    /* renamed from: m  reason: collision with root package name */
    private int[] f25016m = new int[1000];

    /* renamed from: l  reason: collision with root package name */
    private int[] f25015l = new int[1000];

    /* renamed from: o  reason: collision with root package name */
    private t.a[] f25018o = new t.a[1000];

    /* renamed from: c  reason: collision with root package name */
    private final i0<c> f25006c = new i0<>(new a5.h() { // from class: e4.c0
        @Override // a5.h
        public final void accept(Object obj) {
            d0.K((d0.c) obj);
        }
    });

    /* renamed from: t  reason: collision with root package name */
    private long f25023t = Long.MIN_VALUE;

    /* renamed from: u  reason: collision with root package name */
    private long f25024u = Long.MIN_VALUE;

    /* renamed from: v  reason: collision with root package name */
    private long f25025v = Long.MIN_VALUE;

    /* renamed from: y  reason: collision with root package name */
    private boolean f25028y = true;

    /* renamed from: x  reason: collision with root package name */
    private boolean f25027x = true;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: SampleQueue.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        public int f25030a;

        /* renamed from: b  reason: collision with root package name */
        public long f25031b;

        /* renamed from: c  reason: collision with root package name */
        public t.a f25032c;

        b() {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: SampleQueue.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public static final class c {

        /* renamed from: a  reason: collision with root package name */
        public final m1 f25033a;

        /* renamed from: b  reason: collision with root package name */
        public final l.b f25034b;

        private c(m1 m1Var, l.b bVar) {
            this.f25033a = m1Var;
            this.f25034b = bVar;
        }
    }

    /* compiled from: SampleQueue.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public interface d {
        void a(m1 m1Var);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public d0(z4.b bVar, com.google.android.exoplayer2.drm.l lVar, k.a aVar) {
        this.f25007d = lVar;
        this.f25008e = aVar;
        this.f25004a = new b0(bVar);
    }

    private long B(int i10) {
        long j10 = Long.MIN_VALUE;
        if (i10 == 0) {
            return Long.MIN_VALUE;
        }
        int D = D(i10 - 1);
        for (int i11 = 0; i11 < i10; i11++) {
            j10 = Math.max(j10, this.f25017n[D]);
            if ((this.f25016m[D] & 1) != 0) {
                break;
            }
            D--;
            if (D == -1) {
                D = this.f25012i - 1;
            }
        }
        return j10;
    }

    private int D(int i10) {
        int i11 = this.f25021r + i10;
        int i12 = this.f25012i;
        return i11 < i12 ? i11 : i11 - i12;
    }

    private boolean H() {
        return this.f25022s != this.f25019p;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void K(c cVar) {
        cVar.f25034b.release();
    }

    private boolean L(int i10) {
        com.google.android.exoplayer2.drm.j jVar = this.f25011h;
        return jVar == null || jVar.getState() == 4 || ((this.f25016m[i10] & 1073741824) == 0 && this.f25011h.d());
    }

    private void N(m1 m1Var, n1 n1Var) {
        m1 m1Var2 = this.f25010g;
        boolean z10 = m1Var2 == null;
        DrmInitData drmInitData = z10 ? null : m1Var2.f28188o;
        this.f25010g = m1Var;
        DrmInitData drmInitData2 = m1Var.f28188o;
        com.google.android.exoplayer2.drm.l lVar = this.f25007d;
        n1Var.f28250b = lVar != null ? m1Var.c(lVar.d(m1Var)) : m1Var;
        n1Var.f28249a = this.f25011h;
        if (this.f25007d == null) {
            return;
        }
        if (z10 || !p0.c(drmInitData, drmInitData2)) {
            com.google.android.exoplayer2.drm.j jVar = this.f25011h;
            com.google.android.exoplayer2.drm.j b10 = this.f25007d.b(this.f25008e, m1Var);
            this.f25011h = b10;
            n1Var.f28249a = b10;
            if (jVar != null) {
                jVar.b(this.f25008e);
            }
        }
    }

    private synchronized int O(n1 n1Var, q3.g gVar, boolean z10, boolean z11, b bVar) {
        gVar.f30092d = false;
        if (!H()) {
            if (!z11 && !this.f25026w) {
                m1 m1Var = this.B;
                if (m1Var == null || (!z10 && m1Var == this.f25010g)) {
                    return -3;
                }
                N((m1) a5.a.e(m1Var), n1Var);
                return -5;
            }
            gVar.o(4);
            return -4;
        }
        m1 m1Var2 = this.f25006c.e(C()).f25033a;
        if (!z10 && m1Var2 == this.f25010g) {
            int D = D(this.f25022s);
            if (!L(D)) {
                gVar.f30092d = true;
                return -3;
            }
            gVar.o(this.f25016m[D]);
            long j10 = this.f25017n[D];
            gVar.f30093e = j10;
            if (j10 < this.f25023t) {
                gVar.f(RecyclerView.UNDEFINED_DURATION);
            }
            bVar.f25030a = this.f25015l[D];
            bVar.f25031b = this.f25014k[D];
            bVar.f25032c = this.f25018o[D];
            return -4;
        }
        N(m1Var2, n1Var);
        return -5;
    }

    private void T() {
        com.google.android.exoplayer2.drm.j jVar = this.f25011h;
        if (jVar != null) {
            jVar.b(this.f25008e);
            this.f25011h = null;
            this.f25010g = null;
        }
    }

    private synchronized void W() {
        this.f25022s = 0;
        this.f25004a.o();
    }

    private synchronized boolean b0(m1 m1Var) {
        this.f25028y = false;
        if (p0.c(m1Var, this.B)) {
            return false;
        }
        if (!this.f25006c.g() && this.f25006c.f().f25033a.equals(m1Var)) {
            this.B = this.f25006c.f().f25033a;
        } else {
            this.B = m1Var;
        }
        m1 m1Var2 = this.B;
        this.D = a5.x.a(m1Var2.f28185l, m1Var2.f28182i);
        this.E = false;
        return true;
    }

    private synchronized boolean h(long j10) {
        if (this.f25019p == 0) {
            return j10 > this.f25024u;
        } else if (A() >= j10) {
            return false;
        } else {
            t(this.f25020q + j(j10));
            return true;
        }
    }

    private synchronized void i(long j10, int i10, long j11, int i11, t.a aVar) {
        l.b bVar;
        int i12 = this.f25019p;
        if (i12 > 0) {
            int D = D(i12 - 1);
            a5.a.a(this.f25014k[D] + ((long) this.f25015l[D]) <= j11);
        }
        this.f25026w = (536870912 & i10) != 0;
        this.f25025v = Math.max(this.f25025v, j10);
        int D2 = D(this.f25019p);
        this.f25017n[D2] = j10;
        this.f25014k[D2] = j11;
        this.f25015l[D2] = i11;
        this.f25016m[D2] = i10;
        this.f25018o[D2] = aVar;
        this.f25013j[D2] = this.C;
        if (this.f25006c.g() || !this.f25006c.f().f25033a.equals(this.B)) {
            com.google.android.exoplayer2.drm.l lVar = this.f25007d;
            if (lVar != null) {
                bVar = lVar.c(this.f25008e, this.B);
            } else {
                bVar = l.b.f10533a;
            }
            this.f25006c.a(G(), new c((m1) a5.a.e(this.B), bVar));
        }
        int i13 = this.f25019p + 1;
        this.f25019p = i13;
        int i14 = this.f25012i;
        if (i13 == i14) {
            int i15 = i14 + 1000;
            int[] iArr = new int[i15];
            long[] jArr = new long[i15];
            long[] jArr2 = new long[i15];
            int[] iArr2 = new int[i15];
            int[] iArr3 = new int[i15];
            t.a[] aVarArr = new t.a[i15];
            int i16 = this.f25021r;
            int i17 = i14 - i16;
            System.arraycopy(this.f25014k, i16, jArr, 0, i17);
            System.arraycopy(this.f25017n, this.f25021r, jArr2, 0, i17);
            System.arraycopy(this.f25016m, this.f25021r, iArr2, 0, i17);
            System.arraycopy(this.f25015l, this.f25021r, iArr3, 0, i17);
            System.arraycopy(this.f25018o, this.f25021r, aVarArr, 0, i17);
            System.arraycopy(this.f25013j, this.f25021r, iArr, 0, i17);
            int i18 = this.f25021r;
            System.arraycopy(this.f25014k, 0, jArr, i17, i18);
            System.arraycopy(this.f25017n, 0, jArr2, i17, i18);
            System.arraycopy(this.f25016m, 0, iArr2, i17, i18);
            System.arraycopy(this.f25015l, 0, iArr3, i17, i18);
            System.arraycopy(this.f25018o, 0, aVarArr, i17, i18);
            System.arraycopy(this.f25013j, 0, iArr, i17, i18);
            this.f25014k = jArr;
            this.f25017n = jArr2;
            this.f25016m = iArr2;
            this.f25015l = iArr3;
            this.f25018o = aVarArr;
            this.f25013j = iArr;
            this.f25021r = 0;
            this.f25012i = i15;
        }
    }

    private int j(long j10) {
        int i10 = this.f25019p;
        int D = D(i10 - 1);
        while (i10 > this.f25022s && this.f25017n[D] >= j10) {
            i10--;
            D--;
            if (D == -1) {
                D = this.f25012i - 1;
            }
        }
        return i10;
    }

    public static d0 k(z4.b bVar, com.google.android.exoplayer2.drm.l lVar, k.a aVar) {
        return new d0(bVar, (com.google.android.exoplayer2.drm.l) a5.a.e(lVar), (k.a) a5.a.e(aVar));
    }

    public static d0 l(z4.b bVar) {
        return new d0(bVar, null, null);
    }

    private synchronized long m(long j10, boolean z10, boolean z11) {
        int i10;
        int i11 = this.f25019p;
        if (i11 != 0) {
            long[] jArr = this.f25017n;
            int i12 = this.f25021r;
            if (j10 >= jArr[i12]) {
                if (z11 && (i10 = this.f25022s) != i11) {
                    i11 = i10 + 1;
                }
                int v10 = v(i12, i11, j10, z10);
                if (v10 == -1) {
                    return -1L;
                }
                return p(v10);
            }
        }
        return -1L;
    }

    private synchronized long n() {
        int i10 = this.f25019p;
        if (i10 == 0) {
            return -1L;
        }
        return p(i10);
    }

    private long p(int i10) {
        int i11;
        this.f25024u = Math.max(this.f25024u, B(i10));
        this.f25019p -= i10;
        int i12 = this.f25020q + i10;
        this.f25020q = i12;
        int i13 = this.f25021r + i10;
        this.f25021r = i13;
        int i14 = this.f25012i;
        if (i13 >= i14) {
            this.f25021r = i13 - i14;
        }
        int i15 = this.f25022s - i10;
        this.f25022s = i15;
        if (i15 < 0) {
            this.f25022s = 0;
        }
        this.f25006c.d(i12);
        if (this.f25019p == 0) {
            int i16 = this.f25021r;
            if (i16 == 0) {
                i16 = this.f25012i;
            }
            return this.f25014k[i16 - 1] + this.f25015l[i11];
        }
        return this.f25014k[this.f25021r];
    }

    private long t(int i10) {
        int D;
        int G = G() - i10;
        boolean z10 = false;
        a5.a.a(G >= 0 && G <= this.f25019p - this.f25022s);
        int i11 = this.f25019p - G;
        this.f25019p = i11;
        this.f25025v = Math.max(this.f25024u, B(i11));
        if (G == 0 && this.f25026w) {
            z10 = true;
        }
        this.f25026w = z10;
        this.f25006c.c(i10);
        int i12 = this.f25019p;
        if (i12 != 0) {
            return this.f25014k[D(i12 - 1)] + this.f25015l[D];
        }
        return 0L;
    }

    private int v(int i10, int i11, long j10, boolean z10) {
        int i12 = -1;
        for (int i13 = 0; i13 < i11; i13++) {
            long[] jArr = this.f25017n;
            if (jArr[i10] > j10) {
                return i12;
            }
            if (!z10 || (this.f25016m[i10] & 1) != 0) {
                if (jArr[i10] == j10) {
                    return i13;
                }
                i12 = i13;
            }
            i10++;
            if (i10 == this.f25012i) {
                i10 = 0;
            }
        }
        return i12;
    }

    public final synchronized long A() {
        return Math.max(this.f25024u, B(this.f25022s));
    }

    public final int C() {
        return this.f25020q + this.f25022s;
    }

    public final synchronized int E(long j10, boolean z10) {
        int D = D(this.f25022s);
        if (H() && j10 >= this.f25017n[D]) {
            if (j10 > this.f25025v && z10) {
                return this.f25019p - this.f25022s;
            }
            int v10 = v(D, this.f25019p - this.f25022s, j10, true);
            if (v10 == -1) {
                return 0;
            }
            return v10;
        }
        return 0;
    }

    public final synchronized m1 F() {
        return this.f25028y ? null : this.B;
    }

    public final int G() {
        return this.f25020q + this.f25019p;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void I() {
        this.f25029z = true;
    }

    public synchronized boolean J(boolean z10) {
        m1 m1Var;
        boolean z11 = true;
        if (!H()) {
            if (!z10 && !this.f25026w && ((m1Var = this.B) == null || m1Var == this.f25010g)) {
                z11 = false;
            }
            return z11;
        } else if (this.f25006c.e(C()).f25033a != this.f25010g) {
            return true;
        } else {
            return L(D(this.f25022s));
        }
    }

    public void M() throws IOException {
        com.google.android.exoplayer2.drm.j jVar = this.f25011h;
        if (jVar != null && jVar.getState() == 1) {
            throw ((j.a) a5.a.e(this.f25011h.getError()));
        }
    }

    public final synchronized int P() {
        return H() ? this.f25013j[D(this.f25022s)] : this.C;
    }

    public void Q() {
        r();
        T();
    }

    public int R(n1 n1Var, q3.g gVar, int i10, boolean z10) {
        int O = O(n1Var, gVar, (i10 & 2) != 0, z10, this.f25005b);
        if (O == -4 && !gVar.l()) {
            boolean z11 = (i10 & 1) != 0;
            if ((i10 & 4) == 0) {
                if (z11) {
                    this.f25004a.f(gVar, this.f25005b);
                } else {
                    this.f25004a.m(gVar, this.f25005b);
                }
            }
            if (!z11) {
                this.f25022s++;
            }
        }
        return O;
    }

    public void S() {
        V(true);
        T();
    }

    public final void U() {
        V(false);
    }

    public void V(boolean z10) {
        this.f25004a.n();
        this.f25019p = 0;
        this.f25020q = 0;
        this.f25021r = 0;
        this.f25022s = 0;
        this.f25027x = true;
        this.f25023t = Long.MIN_VALUE;
        this.f25024u = Long.MIN_VALUE;
        this.f25025v = Long.MIN_VALUE;
        this.f25026w = false;
        this.f25006c.b();
        if (z10) {
            this.A = null;
            this.B = null;
            this.f25028y = true;
        }
    }

    public final synchronized boolean X(int i10) {
        W();
        int i11 = this.f25020q;
        if (i10 >= i11 && i10 <= this.f25019p + i11) {
            this.f25023t = Long.MIN_VALUE;
            this.f25022s = i10 - i11;
            return true;
        }
        return false;
    }

    public final synchronized boolean Y(long j10, boolean z10) {
        W();
        int D = D(this.f25022s);
        if (H() && j10 >= this.f25017n[D] && (j10 <= this.f25025v || z10)) {
            int v10 = v(D, this.f25019p - this.f25022s, j10, true);
            if (v10 == -1) {
                return false;
            }
            this.f25023t = j10;
            this.f25022s += v10;
            return true;
        }
        return false;
    }

    public final void Z(long j10) {
        if (this.F != j10) {
            this.F = j10;
            I();
        }
    }

    @Override // s3.t
    public final void a(m1 m1Var) {
        m1 w10 = w(m1Var);
        this.f25029z = false;
        this.A = m1Var;
        boolean b02 = b0(w10);
        d dVar = this.f25009f;
        if (dVar == null || !b02) {
            return;
        }
        dVar.a(w10);
    }

    public final void a0(long j10) {
        this.f25023t = j10;
    }

    @Override // s3.t
    public /* synthetic */ int b(z4.i iVar, int i10, boolean z10) {
        return s3.s.a(this, iVar, i10, z10);
    }

    @Override // s3.t
    public final int c(z4.i iVar, int i10, boolean z10, int i11) throws IOException {
        return this.f25004a.p(iVar, i10, z10);
    }

    public final void c0(d dVar) {
        this.f25009f = dVar;
    }

    @Override // s3.t
    public /* synthetic */ void d(a5.c0 c0Var, int i10) {
        s3.s.b(this, c0Var, i10);
    }

    public final synchronized void d0(int i10) {
        boolean z10;
        if (i10 >= 0) {
            try {
                if (this.f25022s + i10 <= this.f25019p) {
                    z10 = true;
                    a5.a.a(z10);
                    this.f25022s += i10;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        z10 = false;
        a5.a.a(z10);
        this.f25022s += i10;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0059  */
    @Override // s3.t
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void e(long r12, int r14, int r15, int r16, s3.t.a r17) {
        /*
            r11 = this;
            r8 = r11
            boolean r0 = r8.f25029z
            if (r0 == 0) goto L10
            n3.m1 r0 = r8.A
            java.lang.Object r0 = a5.a.h(r0)
            n3.m1 r0 = (n3.m1) r0
            r11.a(r0)
        L10:
            r0 = r14 & 1
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L18
            r3 = r2
            goto L19
        L18:
            r3 = r1
        L19:
            boolean r4 = r8.f25027x
            if (r4 == 0) goto L22
            if (r3 != 0) goto L20
            return
        L20:
            r8.f25027x = r1
        L22:
            long r4 = r8.F
            long r4 = r4 + r12
            boolean r6 = r8.D
            if (r6 == 0) goto L54
            long r6 = r8.f25023t
            int r6 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r6 >= 0) goto L30
            return
        L30:
            if (r0 != 0) goto L54
            boolean r0 = r8.E
            if (r0 != 0) goto L50
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r6 = "Overriding unexpected non-sync sample for format: "
            r0.append(r6)
            n3.m1 r6 = r8.B
            r0.append(r6)
            java.lang.String r0 = r0.toString()
            java.lang.String r6 = "SampleQueue"
            a5.t.i(r6, r0)
            r8.E = r2
        L50:
            r0 = r14 | 1
            r6 = r0
            goto L55
        L54:
            r6 = r14
        L55:
            boolean r0 = r8.G
            if (r0 == 0) goto L66
            if (r3 == 0) goto L65
            boolean r0 = r11.h(r4)
            if (r0 != 0) goto L62
            goto L65
        L62:
            r8.G = r1
            goto L66
        L65:
            return
        L66:
            e4.b0 r0 = r8.f25004a
            long r0 = r0.e()
            r7 = r15
            long r2 = (long) r7
            long r0 = r0 - r2
            r2 = r16
            long r2 = (long) r2
            long r9 = r0 - r2
            r0 = r11
            r1 = r4
            r3 = r6
            r4 = r9
            r6 = r15
            r7 = r17
            r0.i(r1, r3, r4, r6, r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: e4.d0.e(long, int, int, int, s3.t$a):void");
    }

    public final void e0(int i10) {
        this.C = i10;
    }

    @Override // s3.t
    public final void f(a5.c0 c0Var, int i10, int i11) {
        this.f25004a.q(c0Var, i10);
    }

    public final void f0() {
        this.G = true;
    }

    public synchronized long o() {
        int i10 = this.f25022s;
        if (i10 == 0) {
            return -1L;
        }
        return p(i10);
    }

    public final void q(long j10, boolean z10, boolean z11) {
        this.f25004a.b(m(j10, z10, z11));
    }

    public final void r() {
        this.f25004a.b(n());
    }

    public final void s() {
        this.f25004a.b(o());
    }

    public final void u(int i10) {
        this.f25004a.c(t(i10));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public m1 w(m1 m1Var) {
        return (this.F == 0 || m1Var.f28189p == Long.MAX_VALUE) ? m1Var : m1Var.b().i0(m1Var.f28189p + this.F).E();
    }

    public final int x() {
        return this.f25020q;
    }

    public final synchronized long y() {
        return this.f25019p == 0 ? Long.MIN_VALUE : this.f25017n[this.f25021r];
    }

    public final synchronized long z() {
        return this.f25025v;
    }
}
