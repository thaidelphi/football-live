package s;

import com.google.android.gms.common.api.Api;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import s.d;
import t.n;
import t.p;
/* compiled from: ConstraintWidget.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class e {
    public static float C0 = 0.5f;
    public int A0;
    public int B0;
    private boolean D;
    public d O;
    public d[] P;
    protected ArrayList<d> Q;
    private boolean[] R;
    public b[] S;
    public e T;
    int U;
    int V;
    public float W;
    protected int X;
    protected int Y;
    protected int Z;

    /* renamed from: a0  reason: collision with root package name */
    int f30528a0;

    /* renamed from: b0  reason: collision with root package name */
    int f30530b0;

    /* renamed from: c  reason: collision with root package name */
    public t.c f30531c;

    /* renamed from: c0  reason: collision with root package name */
    protected int f30532c0;

    /* renamed from: d  reason: collision with root package name */
    public t.c f30533d;

    /* renamed from: d0  reason: collision with root package name */
    protected int f30534d0;

    /* renamed from: e0  reason: collision with root package name */
    int f30536e0;

    /* renamed from: f0  reason: collision with root package name */
    protected int f30538f0;

    /* renamed from: g0  reason: collision with root package name */
    protected int f30540g0;

    /* renamed from: h0  reason: collision with root package name */
    float f30542h0;

    /* renamed from: i0  reason: collision with root package name */
    float f30544i0;

    /* renamed from: j0  reason: collision with root package name */
    private Object f30546j0;

    /* renamed from: k0  reason: collision with root package name */
    private int f30548k0;

    /* renamed from: l0  reason: collision with root package name */
    private int f30550l0;

    /* renamed from: m0  reason: collision with root package name */
    private String f30552m0;

    /* renamed from: n0  reason: collision with root package name */
    private String f30554n0;

    /* renamed from: o0  reason: collision with root package name */
    boolean f30556o0;

    /* renamed from: p0  reason: collision with root package name */
    boolean f30558p0;

    /* renamed from: q0  reason: collision with root package name */
    boolean f30560q0;

    /* renamed from: r0  reason: collision with root package name */
    int f30562r0;

    /* renamed from: s0  reason: collision with root package name */
    int f30564s0;

    /* renamed from: t0  reason: collision with root package name */
    boolean f30566t0;

    /* renamed from: u0  reason: collision with root package name */
    boolean f30568u0;

    /* renamed from: v0  reason: collision with root package name */
    public float[] f30570v0;

    /* renamed from: w0  reason: collision with root package name */
    protected e[] f30572w0;

    /* renamed from: x0  reason: collision with root package name */
    protected e[] f30574x0;

    /* renamed from: y0  reason: collision with root package name */
    e f30576y0;

    /* renamed from: z0  reason: collision with root package name */
    e f30578z0;

    /* renamed from: a  reason: collision with root package name */
    public boolean f30527a = false;

    /* renamed from: b  reason: collision with root package name */
    public p[] f30529b = new p[2];

    /* renamed from: e  reason: collision with root package name */
    public t.l f30535e = null;

    /* renamed from: f  reason: collision with root package name */
    public n f30537f = null;

    /* renamed from: g  reason: collision with root package name */
    public boolean[] f30539g = {true, true};

    /* renamed from: h  reason: collision with root package name */
    boolean f30541h = false;

    /* renamed from: i  reason: collision with root package name */
    private boolean f30543i = true;

    /* renamed from: j  reason: collision with root package name */
    private boolean f30545j = false;

    /* renamed from: k  reason: collision with root package name */
    private boolean f30547k = true;

    /* renamed from: l  reason: collision with root package name */
    private boolean f30549l = false;

    /* renamed from: m  reason: collision with root package name */
    private boolean f30551m = false;

    /* renamed from: n  reason: collision with root package name */
    public int f30553n = -1;

    /* renamed from: o  reason: collision with root package name */
    public int f30555o = -1;

    /* renamed from: p  reason: collision with root package name */
    public int f30557p = 0;

    /* renamed from: q  reason: collision with root package name */
    public int f30559q = 0;

    /* renamed from: r  reason: collision with root package name */
    public int[] f30561r = new int[2];

    /* renamed from: s  reason: collision with root package name */
    public int f30563s = 0;

    /* renamed from: t  reason: collision with root package name */
    public int f30565t = 0;

    /* renamed from: u  reason: collision with root package name */
    public float f30567u = 1.0f;

    /* renamed from: v  reason: collision with root package name */
    public int f30569v = 0;

    /* renamed from: w  reason: collision with root package name */
    public int f30571w = 0;

    /* renamed from: x  reason: collision with root package name */
    public float f30573x = 1.0f;

    /* renamed from: y  reason: collision with root package name */
    int f30575y = -1;

    /* renamed from: z  reason: collision with root package name */
    float f30577z = 1.0f;
    private int[] A = {Api.BaseClientBuilder.API_PRIORITY_OTHER, Api.BaseClientBuilder.API_PRIORITY_OTHER};
    private float B = 0.0f;
    private boolean C = false;
    private boolean E = false;
    private int F = 0;
    private int G = 0;
    public d H = new d(this, d.b.LEFT);
    public d I = new d(this, d.b.TOP);
    public d J = new d(this, d.b.RIGHT);
    public d K = new d(this, d.b.BOTTOM);
    public d L = new d(this, d.b.BASELINE);
    d M = new d(this, d.b.CENTER_X);
    d N = new d(this, d.b.CENTER_Y);

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ConstraintWidget.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f30579a;

        /* renamed from: b  reason: collision with root package name */
        static final /* synthetic */ int[] f30580b;

        static {
            int[] iArr = new int[b.values().length];
            f30580b = iArr;
            try {
                iArr[b.FIXED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f30580b[b.WRAP_CONTENT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f30580b[b.MATCH_PARENT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f30580b[b.MATCH_CONSTRAINT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            int[] iArr2 = new int[d.b.values().length];
            f30579a = iArr2;
            try {
                iArr2[d.b.LEFT.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f30579a[d.b.TOP.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f30579a[d.b.RIGHT.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f30579a[d.b.BOTTOM.ordinal()] = 4;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f30579a[d.b.BASELINE.ordinal()] = 5;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f30579a[d.b.CENTER.ordinal()] = 6;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f30579a[d.b.CENTER_X.ordinal()] = 7;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f30579a[d.b.CENTER_Y.ordinal()] = 8;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f30579a[d.b.NONE.ordinal()] = 9;
            } catch (NoSuchFieldError unused13) {
            }
        }
    }

    /* compiled from: ConstraintWidget.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public enum b {
        FIXED,
        WRAP_CONTENT,
        MATCH_CONSTRAINT,
        MATCH_PARENT
    }

    public e() {
        d dVar = new d(this, d.b.CENTER);
        this.O = dVar;
        this.P = new d[]{this.H, this.J, this.I, this.K, this.L, dVar};
        this.Q = new ArrayList<>();
        this.R = new boolean[2];
        b bVar = b.FIXED;
        this.S = new b[]{bVar, bVar};
        this.T = null;
        this.U = 0;
        this.V = 0;
        this.W = 0.0f;
        this.X = -1;
        this.Y = 0;
        this.Z = 0;
        this.f30528a0 = 0;
        this.f30530b0 = 0;
        this.f30532c0 = 0;
        this.f30534d0 = 0;
        this.f30536e0 = 0;
        float f10 = C0;
        this.f30542h0 = f10;
        this.f30544i0 = f10;
        this.f30548k0 = 0;
        this.f30550l0 = 0;
        this.f30552m0 = null;
        this.f30554n0 = null;
        this.f30560q0 = false;
        this.f30562r0 = 0;
        this.f30564s0 = 0;
        this.f30570v0 = new float[]{-1.0f, -1.0f};
        this.f30572w0 = new e[]{null, null};
        this.f30574x0 = new e[]{null, null};
        this.f30576y0 = null;
        this.f30578z0 = null;
        this.A0 = -1;
        this.B0 = -1;
        d();
    }

    private boolean Y(int i10) {
        int i11 = i10 * 2;
        d[] dVarArr = this.P;
        if (dVarArr[i11].f30512f != null && dVarArr[i11].f30512f.f30512f != dVarArr[i11]) {
            int i12 = i11 + 1;
            if (dVarArr[i12].f30512f != null && dVarArr[i12].f30512f.f30512f == dVarArr[i12]) {
                return true;
            }
        }
        return false;
    }

    private void d() {
        this.Q.add(this.H);
        this.Q.add(this.I);
        this.Q.add(this.J);
        this.Q.add(this.K);
        this.Q.add(this.M);
        this.Q.add(this.N);
        this.Q.add(this.O);
        this.Q.add(this.L);
    }

    /* JADX WARN: Code restructure failed: missing block: B:344:0x052b, code lost:
        if (r1[r30] == r6) goto L59;
     */
    /* JADX WARN: Removed duplicated region for block: B:104:0x01c0  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x02ce  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x02d2  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x038d A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:219:0x039a  */
    /* JADX WARN: Removed duplicated region for block: B:227:0x03d8  */
    /* JADX WARN: Removed duplicated region for block: B:230:0x03ef  */
    /* JADX WARN: Removed duplicated region for block: B:234:0x03f8  */
    /* JADX WARN: Removed duplicated region for block: B:244:0x041f  */
    /* JADX WARN: Removed duplicated region for block: B:246:0x0423 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:254:0x0439  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:287:0x048c  */
    /* JADX WARN: Removed duplicated region for block: B:294:0x049e A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:306:0x04c0 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:325:0x04ed  */
    /* JADX WARN: Removed duplicated region for block: B:327:0x04fa A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:355:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:358:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00cd  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void i(r.d r32, boolean r33, boolean r34, boolean r35, boolean r36, r.i r37, r.i r38, s.e.b r39, boolean r40, s.d r41, s.d r42, int r43, int r44, int r45, int r46, float r47, boolean r48, boolean r49, boolean r50, boolean r51, boolean r52, int r53, int r54, int r55, int r56, float r57, boolean r58) {
        /*
            Method dump skipped, instructions count: 1339
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: s.e.i(r.d, boolean, boolean, boolean, boolean, r.i, r.i, s.e$b, boolean, s.d, s.d, int, int, int, int, float, boolean, boolean, boolean, boolean, boolean, int, int, int, int, float, boolean):void");
    }

    public int A() {
        return this.F;
    }

    public void A0(int i10, int i11, int i12, float f10) {
        this.f30557p = i10;
        this.f30563s = i11;
        if (i12 == Integer.MAX_VALUE) {
            i12 = 0;
        }
        this.f30565t = i12;
        this.f30567u = f10;
        if (f10 <= 0.0f || f10 >= 1.0f || i10 != 0) {
            return;
        }
        this.f30557p = 2;
    }

    public int B() {
        return this.G;
    }

    public void B0(float f10) {
        this.f30570v0[0] = f10;
    }

    public int C(int i10) {
        if (i10 == 0) {
            return R();
        }
        if (i10 == 1) {
            return v();
        }
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void C0(int i10, boolean z10) {
        this.R[i10] = z10;
    }

    public int D() {
        return this.A[1];
    }

    public void D0(boolean z10) {
        this.D = z10;
    }

    public int E() {
        return this.A[0];
    }

    public void E0(boolean z10) {
        this.E = z10;
    }

    public int F() {
        return this.f30540g0;
    }

    public void F0(int i10, int i11) {
        this.F = i10;
        this.G = i11;
        I0(false);
    }

    public int G() {
        return this.f30538f0;
    }

    public void G0(int i10) {
        this.A[1] = i10;
    }

    public e H(int i10) {
        d dVar;
        d dVar2;
        if (i10 != 0) {
            if (i10 == 1 && (dVar2 = (dVar = this.K).f30512f) != null && dVar2.f30512f == dVar) {
                return dVar2.f30510d;
            }
            return null;
        }
        d dVar3 = this.J;
        d dVar4 = dVar3.f30512f;
        if (dVar4 == null || dVar4.f30512f != dVar3) {
            return null;
        }
        return dVar4.f30510d;
    }

    public void H0(int i10) {
        this.A[0] = i10;
    }

    public e I() {
        return this.T;
    }

    public void I0(boolean z10) {
        this.f30543i = z10;
    }

    public e J(int i10) {
        d dVar;
        d dVar2;
        if (i10 != 0) {
            if (i10 == 1 && (dVar2 = (dVar = this.I).f30512f) != null && dVar2.f30512f == dVar) {
                return dVar2.f30510d;
            }
            return null;
        }
        d dVar3 = this.H;
        d dVar4 = dVar3.f30512f;
        if (dVar4 == null || dVar4.f30512f != dVar3) {
            return null;
        }
        return dVar4.f30510d;
    }

    public void J0(int i10) {
        if (i10 < 0) {
            this.f30540g0 = 0;
        } else {
            this.f30540g0 = i10;
        }
    }

    public int K() {
        return S() + this.U;
    }

    public void K0(int i10) {
        if (i10 < 0) {
            this.f30538f0 = 0;
        } else {
            this.f30538f0 = i10;
        }
    }

    public p L(int i10) {
        if (i10 == 0) {
            return this.f30535e;
        }
        if (i10 == 1) {
            return this.f30537f;
        }
        return null;
    }

    public void L0(int i10, int i11) {
        this.Y = i10;
        this.Z = i11;
    }

    public float M() {
        return this.f30544i0;
    }

    public void M0(e eVar) {
        this.T = eVar;
    }

    public int N() {
        return this.f30564s0;
    }

    public void N0(float f10) {
        this.f30544i0 = f10;
    }

    public b O() {
        return this.S[1];
    }

    public void O0(int i10) {
        this.f30564s0 = i10;
    }

    public int P() {
        int i10 = this.H != null ? 0 + this.I.f30513g : 0;
        return this.J != null ? i10 + this.K.f30513g : i10;
    }

    public void P0(int i10, int i11) {
        this.Z = i10;
        int i12 = i11 - i10;
        this.V = i12;
        int i13 = this.f30540g0;
        if (i12 < i13) {
            this.V = i13;
        }
    }

    public int Q() {
        return this.f30550l0;
    }

    public void Q0(b bVar) {
        this.S[1] = bVar;
    }

    public int R() {
        if (this.f30550l0 == 8) {
            return 0;
        }
        return this.U;
    }

    public void R0(int i10, int i11, int i12, float f10) {
        this.f30559q = i10;
        this.f30569v = i11;
        if (i12 == Integer.MAX_VALUE) {
            i12 = 0;
        }
        this.f30571w = i12;
        this.f30573x = f10;
        if (f10 <= 0.0f || f10 >= 1.0f || i10 != 0) {
            return;
        }
        this.f30559q = 2;
    }

    public int S() {
        e eVar = this.T;
        if (eVar != null && (eVar instanceof f)) {
            return ((f) eVar).J0 + this.Y;
        }
        return this.Y;
    }

    public void S0(float f10) {
        this.f30570v0[1] = f10;
    }

    public int T() {
        e eVar = this.T;
        if (eVar != null && (eVar instanceof f)) {
            return ((f) eVar).K0 + this.Z;
        }
        return this.Z;
    }

    public void T0(int i10) {
        this.f30550l0 = i10;
    }

    public boolean U() {
        return this.C;
    }

    public void U0(int i10) {
        this.U = i10;
        int i11 = this.f30538f0;
        if (i10 < i11) {
            this.U = i11;
        }
    }

    public boolean V(int i10) {
        if (i10 == 0) {
            return (this.H.f30512f != null ? 1 : 0) + (this.J.f30512f != null ? 1 : 0) < 2;
        }
        return ((this.I.f30512f != null ? 1 : 0) + (this.K.f30512f != null ? 1 : 0)) + (this.L.f30512f != null ? 1 : 0) < 2;
    }

    public void V0(int i10) {
        this.Y = i10;
    }

    public boolean W() {
        int size = this.Q.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (this.Q.get(i10).l()) {
                return true;
            }
        }
        return false;
    }

    public void W0(int i10) {
        this.Z = i10;
    }

    public void X(d.b bVar, e eVar, d.b bVar2, int i10, int i11) {
        m(bVar).a(eVar.m(bVar2), i10, i11, true);
    }

    public void X0(boolean z10, boolean z11, boolean z12, boolean z13) {
        if (this.f30575y == -1) {
            if (z12 && !z13) {
                this.f30575y = 0;
            } else if (!z12 && z13) {
                this.f30575y = 1;
                if (this.X == -1) {
                    this.f30577z = 1.0f / this.f30577z;
                }
            }
        }
        if (this.f30575y == 0 && (!this.I.n() || !this.K.n())) {
            this.f30575y = 1;
        } else if (this.f30575y == 1 && (!this.H.n() || !this.J.n())) {
            this.f30575y = 0;
        }
        if (this.f30575y == -1 && (!this.I.n() || !this.K.n() || !this.H.n() || !this.J.n())) {
            if (this.I.n() && this.K.n()) {
                this.f30575y = 0;
            } else if (this.H.n() && this.J.n()) {
                this.f30577z = 1.0f / this.f30577z;
                this.f30575y = 1;
            }
        }
        if (this.f30575y == -1) {
            int i10 = this.f30563s;
            if (i10 > 0 && this.f30569v == 0) {
                this.f30575y = 0;
            } else if (i10 != 0 || this.f30569v <= 0) {
            } else {
                this.f30577z = 1.0f / this.f30577z;
                this.f30575y = 1;
            }
        }
    }

    public void Y0(boolean z10, boolean z11) {
        int i10;
        int i11;
        boolean k10 = z10 & this.f30535e.k();
        boolean k11 = z11 & this.f30537f.k();
        t.l lVar = this.f30535e;
        int i12 = lVar.f30903h.f30851g;
        n nVar = this.f30537f;
        int i13 = nVar.f30903h.f30851g;
        int i14 = lVar.f30904i.f30851g;
        int i15 = nVar.f30904i.f30851g;
        int i16 = i15 - i13;
        if (i14 - i12 < 0 || i16 < 0 || i12 == Integer.MIN_VALUE || i12 == Integer.MAX_VALUE || i13 == Integer.MIN_VALUE || i13 == Integer.MAX_VALUE || i14 == Integer.MIN_VALUE || i14 == Integer.MAX_VALUE || i15 == Integer.MIN_VALUE || i15 == Integer.MAX_VALUE) {
            i14 = 0;
            i12 = 0;
            i15 = 0;
            i13 = 0;
        }
        int i17 = i14 - i12;
        int i18 = i15 - i13;
        if (k10) {
            this.Y = i12;
        }
        if (k11) {
            this.Z = i13;
        }
        if (this.f30550l0 == 8) {
            this.U = 0;
            this.V = 0;
            return;
        }
        if (k10) {
            if (this.S[0] == b.FIXED && i17 < (i11 = this.U)) {
                i17 = i11;
            }
            this.U = i17;
            int i19 = this.f30538f0;
            if (i17 < i19) {
                this.U = i19;
            }
        }
        if (k11) {
            if (this.S[1] == b.FIXED && i18 < (i10 = this.V)) {
                i18 = i10;
            }
            this.V = i18;
            int i20 = this.f30540g0;
            if (i18 < i20) {
                this.V = i20;
            }
        }
    }

    public boolean Z() {
        d dVar = this.H;
        d dVar2 = dVar.f30512f;
        if (dVar2 == null || dVar2.f30512f != dVar) {
            d dVar3 = this.J;
            d dVar4 = dVar3.f30512f;
            return dVar4 != null && dVar4.f30512f == dVar3;
        }
        return true;
    }

    public void Z0(r.d dVar, boolean z10) {
        n nVar;
        t.l lVar;
        int x10 = dVar.x(this.H);
        int x11 = dVar.x(this.I);
        int x12 = dVar.x(this.J);
        int x13 = dVar.x(this.K);
        if (z10 && (lVar = this.f30535e) != null) {
            t.f fVar = lVar.f30903h;
            if (fVar.f30854j) {
                t.f fVar2 = lVar.f30904i;
                if (fVar2.f30854j) {
                    x10 = fVar.f30851g;
                    x12 = fVar2.f30851g;
                }
            }
        }
        if (z10 && (nVar = this.f30537f) != null) {
            t.f fVar3 = nVar.f30903h;
            if (fVar3.f30854j) {
                t.f fVar4 = nVar.f30904i;
                if (fVar4.f30854j) {
                    x11 = fVar3.f30851g;
                    x13 = fVar4.f30851g;
                }
            }
        }
        int i10 = x13 - x11;
        if (x12 - x10 < 0 || i10 < 0 || x10 == Integer.MIN_VALUE || x10 == Integer.MAX_VALUE || x11 == Integer.MIN_VALUE || x11 == Integer.MAX_VALUE || x12 == Integer.MIN_VALUE || x12 == Integer.MAX_VALUE || x13 == Integer.MIN_VALUE || x13 == Integer.MAX_VALUE) {
            x13 = 0;
            x10 = 0;
            x11 = 0;
            x12 = 0;
        }
        t0(x10, x11, x12, x13);
    }

    public boolean a0() {
        return this.D;
    }

    public boolean b0() {
        d dVar = this.I;
        d dVar2 = dVar.f30512f;
        if (dVar2 == null || dVar2.f30512f != dVar) {
            d dVar3 = this.K;
            d dVar4 = dVar3.f30512f;
            return dVar4 != null && dVar4.f30512f == dVar3;
        }
        return true;
    }

    public boolean c0() {
        return this.E;
    }

    public boolean d0() {
        return this.f30543i && this.f30550l0 != 8;
    }

    public void e(f fVar, r.d dVar, HashSet<e> hashSet, int i10, boolean z10) {
        if (z10) {
            if (!hashSet.contains(this)) {
                return;
            }
            j.a(fVar, dVar, this);
            hashSet.remove(this);
            g(dVar, fVar.B1(64));
        }
        if (i10 == 0) {
            HashSet<d> c10 = this.H.c();
            if (c10 != null) {
                Iterator<d> it = c10.iterator();
                while (it.hasNext()) {
                    it.next().f30510d.e(fVar, dVar, hashSet, i10, true);
                }
            }
            HashSet<d> c11 = this.J.c();
            if (c11 != null) {
                Iterator<d> it2 = c11.iterator();
                while (it2.hasNext()) {
                    it2.next().f30510d.e(fVar, dVar, hashSet, i10, true);
                }
                return;
            }
            return;
        }
        HashSet<d> c12 = this.I.c();
        if (c12 != null) {
            Iterator<d> it3 = c12.iterator();
            while (it3.hasNext()) {
                it3.next().f30510d.e(fVar, dVar, hashSet, i10, true);
            }
        }
        HashSet<d> c13 = this.K.c();
        if (c13 != null) {
            Iterator<d> it4 = c13.iterator();
            while (it4.hasNext()) {
                it4.next().f30510d.e(fVar, dVar, hashSet, i10, true);
            }
        }
        HashSet<d> c14 = this.L.c();
        if (c14 != null) {
            Iterator<d> it5 = c14.iterator();
            while (it5.hasNext()) {
                it5.next().f30510d.e(fVar, dVar, hashSet, i10, true);
            }
        }
    }

    public boolean e0() {
        return this.f30549l || (this.H.m() && this.J.m());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean f() {
        return (this instanceof k) || (this instanceof g);
    }

    public boolean f0() {
        return this.f30551m || (this.I.m() && this.K.m());
    }

    /* JADX WARN: Removed duplicated region for block: B:180:0x02c5  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x02cf  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x02d4  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x02e9  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x02f2  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x02f5  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x030e  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x0327  */
    /* JADX WARN: Removed duplicated region for block: B:223:0x0371  */
    /* JADX WARN: Removed duplicated region for block: B:226:0x0381  */
    /* JADX WARN: Removed duplicated region for block: B:227:0x038a  */
    /* JADX WARN: Removed duplicated region for block: B:230:0x0390  */
    /* JADX WARN: Removed duplicated region for block: B:231:0x0399  */
    /* JADX WARN: Removed duplicated region for block: B:234:0x03b9  */
    /* JADX WARN: Removed duplicated region for block: B:235:0x03bc  */
    /* JADX WARN: Removed duplicated region for block: B:239:0x042d  */
    /* JADX WARN: Removed duplicated region for block: B:256:0x0491  */
    /* JADX WARN: Removed duplicated region for block: B:260:0x04a5  */
    /* JADX WARN: Removed duplicated region for block: B:261:0x04a7  */
    /* JADX WARN: Removed duplicated region for block: B:263:0x04aa  */
    /* JADX WARN: Removed duplicated region for block: B:298:0x053b  */
    /* JADX WARN: Removed duplicated region for block: B:299:0x053e  */
    /* JADX WARN: Removed duplicated region for block: B:303:0x0584  */
    /* JADX WARN: Removed duplicated region for block: B:307:0x05af  */
    /* JADX WARN: Removed duplicated region for block: B:310:0x05b9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void g(r.d r54, boolean r55) {
        /*
            Method dump skipped, instructions count: 1503
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: s.e.g(r.d, boolean):void");
    }

    public boolean g0() {
        b[] bVarArr = this.S;
        b bVar = bVarArr[0];
        b bVar2 = b.MATCH_CONSTRAINT;
        return bVar == bVar2 && bVarArr[1] == bVar2;
    }

    public boolean h() {
        return this.f30550l0 != 8;
    }

    public void h0() {
        this.H.p();
        this.I.p();
        this.J.p();
        this.K.p();
        this.L.p();
        this.M.p();
        this.N.p();
        this.O.p();
        this.T = null;
        this.B = 0.0f;
        this.U = 0;
        this.V = 0;
        this.W = 0.0f;
        this.X = -1;
        this.Y = 0;
        this.Z = 0;
        this.f30532c0 = 0;
        this.f30534d0 = 0;
        this.f30536e0 = 0;
        this.f30538f0 = 0;
        this.f30540g0 = 0;
        float f10 = C0;
        this.f30542h0 = f10;
        this.f30544i0 = f10;
        b[] bVarArr = this.S;
        b bVar = b.FIXED;
        bVarArr[0] = bVar;
        bVarArr[1] = bVar;
        this.f30546j0 = null;
        this.f30548k0 = 0;
        this.f30550l0 = 0;
        this.f30554n0 = null;
        this.f30556o0 = false;
        this.f30558p0 = false;
        this.f30562r0 = 0;
        this.f30564s0 = 0;
        this.f30566t0 = false;
        this.f30568u0 = false;
        float[] fArr = this.f30570v0;
        fArr[0] = -1.0f;
        fArr[1] = -1.0f;
        this.f30553n = -1;
        this.f30555o = -1;
        int[] iArr = this.A;
        iArr[0] = Integer.MAX_VALUE;
        iArr[1] = Integer.MAX_VALUE;
        this.f30557p = 0;
        this.f30559q = 0;
        this.f30567u = 1.0f;
        this.f30573x = 1.0f;
        this.f30565t = Api.BaseClientBuilder.API_PRIORITY_OTHER;
        this.f30571w = Api.BaseClientBuilder.API_PRIORITY_OTHER;
        this.f30563s = 0;
        this.f30569v = 0;
        this.f30541h = false;
        this.f30575y = -1;
        this.f30577z = 1.0f;
        this.f30560q0 = false;
        boolean[] zArr = this.f30539g;
        zArr[0] = true;
        zArr[1] = true;
        this.E = false;
        boolean[] zArr2 = this.R;
        zArr2[0] = false;
        zArr2[1] = false;
        this.f30543i = true;
    }

    public void i0() {
        this.f30549l = false;
        this.f30551m = false;
        int size = this.Q.size();
        for (int i10 = 0; i10 < size; i10++) {
            this.Q.get(i10).q();
        }
    }

    public void j(e eVar, float f10, int i10) {
        d.b bVar = d.b.CENTER;
        X(bVar, eVar, bVar, i10, 0);
        this.B = f10;
    }

    public void j0(r.c cVar) {
        this.H.r(cVar);
        this.I.r(cVar);
        this.J.r(cVar);
        this.K.r(cVar);
        this.L.r(cVar);
        this.O.r(cVar);
        this.M.r(cVar);
        this.N.r(cVar);
    }

    public void k(r.d dVar) {
        dVar.q(this.H);
        dVar.q(this.I);
        dVar.q(this.J);
        dVar.q(this.K);
        if (this.f30536e0 > 0) {
            dVar.q(this.L);
        }
    }

    public void k0(int i10) {
        this.f30536e0 = i10;
        this.C = i10 > 0;
    }

    public void l() {
        if (this.f30535e == null) {
            this.f30535e = new t.l(this);
        }
        if (this.f30537f == null) {
            this.f30537f = new n(this);
        }
    }

    public void l0(Object obj) {
        this.f30546j0 = obj;
    }

    public d m(d.b bVar) {
        switch (a.f30579a[bVar.ordinal()]) {
            case 1:
                return this.H;
            case 2:
                return this.I;
            case 3:
                return this.J;
            case 4:
                return this.K;
            case 5:
                return this.L;
            case 6:
                return this.O;
            case 7:
                return this.M;
            case 8:
                return this.N;
            case 9:
                return null;
            default:
                throw new AssertionError(bVar.name());
        }
    }

    public void m0(String str) {
        this.f30552m0 = str;
    }

    public int n() {
        return this.f30536e0;
    }

    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:38:0x0084 -> B:39:0x0085). Please submit an issue!!! */
    public void n0(String str) {
        float f10;
        int i10 = 0;
        if (str != null && str.length() != 0) {
            int i11 = -1;
            int length = str.length();
            int indexOf = str.indexOf(44);
            int i12 = 0;
            if (indexOf > 0 && indexOf < length - 1) {
                String substring = str.substring(0, indexOf);
                if (substring.equalsIgnoreCase("W")) {
                    i11 = 0;
                } else if (substring.equalsIgnoreCase("H")) {
                    i11 = 1;
                }
                i12 = indexOf + 1;
            }
            int indexOf2 = str.indexOf(58);
            if (indexOf2 >= 0 && indexOf2 < length - 1) {
                String substring2 = str.substring(i12, indexOf2);
                String substring3 = str.substring(indexOf2 + 1);
                if (substring2.length() > 0 && substring3.length() > 0) {
                    float parseFloat = Float.parseFloat(substring2);
                    float parseFloat2 = Float.parseFloat(substring3);
                    if (parseFloat > 0.0f && parseFloat2 > 0.0f) {
                        if (i11 == 1) {
                            f10 = Math.abs(parseFloat2 / parseFloat);
                        } else {
                            f10 = Math.abs(parseFloat / parseFloat2);
                        }
                    }
                }
                f10 = i10;
            } else {
                String substring4 = str.substring(i12);
                if (substring4.length() > 0) {
                    f10 = Float.parseFloat(substring4);
                }
                f10 = i10;
            }
            i10 = (f10 > i10 ? 1 : (f10 == i10 ? 0 : -1));
            if (i10 > 0) {
                this.W = f10;
                this.X = i11;
                return;
            }
            return;
        }
        this.W = 0.0f;
    }

    public float o(int i10) {
        if (i10 == 0) {
            return this.f30542h0;
        }
        if (i10 == 1) {
            return this.f30544i0;
        }
        return -1.0f;
    }

    public void o0(int i10) {
        if (this.C) {
            int i11 = i10 - this.f30536e0;
            int i12 = this.V + i11;
            this.Z = i11;
            this.I.s(i11);
            this.K.s(i12);
            this.L.s(i10);
            this.f30551m = true;
        }
    }

    public int p() {
        return T() + this.V;
    }

    public void p0(int i10, int i11) {
        this.H.s(i10);
        this.J.s(i11);
        this.Y = i10;
        this.U = i11 - i10;
        this.f30549l = true;
    }

    public Object q() {
        return this.f30546j0;
    }

    public void q0(int i10) {
        this.H.s(i10);
        this.Y = i10;
    }

    public String r() {
        return this.f30552m0;
    }

    public void r0(int i10) {
        this.I.s(i10);
        this.Z = i10;
    }

    public b s(int i10) {
        if (i10 == 0) {
            return y();
        }
        if (i10 == 1) {
            return O();
        }
        return null;
    }

    public void s0(int i10, int i11) {
        this.I.s(i10);
        this.K.s(i11);
        this.Z = i10;
        this.V = i11 - i10;
        if (this.C) {
            this.L.s(i10 + this.f30536e0);
        }
        this.f30551m = true;
    }

    public float t() {
        return this.W;
    }

    public void t0(int i10, int i11, int i12, int i13) {
        int i14;
        int i15;
        int i16 = i12 - i10;
        int i17 = i13 - i11;
        this.Y = i10;
        this.Z = i11;
        if (this.f30550l0 == 8) {
            this.U = 0;
            this.V = 0;
            return;
        }
        b[] bVarArr = this.S;
        b bVar = bVarArr[0];
        b bVar2 = b.FIXED;
        if (bVar == bVar2 && i16 < (i15 = this.U)) {
            i16 = i15;
        }
        if (bVarArr[1] == bVar2 && i17 < (i14 = this.V)) {
            i17 = i14;
        }
        this.U = i16;
        this.V = i17;
        int i18 = this.f30540g0;
        if (i17 < i18) {
            this.V = i18;
        }
        int i19 = this.f30538f0;
        if (i16 < i19) {
            this.U = i19;
        }
    }

    public String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        String str2 = "";
        if (this.f30554n0 != null) {
            str = "type: " + this.f30554n0 + " ";
        } else {
            str = "";
        }
        sb.append(str);
        if (this.f30552m0 != null) {
            str2 = "id: " + this.f30552m0 + " ";
        }
        sb.append(str2);
        sb.append("(");
        sb.append(this.Y);
        sb.append(", ");
        sb.append(this.Z);
        sb.append(") - (");
        sb.append(this.U);
        sb.append(" x ");
        sb.append(this.V);
        sb.append(")");
        return sb.toString();
    }

    public int u() {
        return this.X;
    }

    public void u0(boolean z10) {
        this.C = z10;
    }

    public int v() {
        if (this.f30550l0 == 8) {
            return 0;
        }
        return this.V;
    }

    public void v0(int i10) {
        this.V = i10;
        int i11 = this.f30540g0;
        if (i10 < i11) {
            this.V = i11;
        }
    }

    public float w() {
        return this.f30542h0;
    }

    public void w0(float f10) {
        this.f30542h0 = f10;
    }

    public int x() {
        return this.f30562r0;
    }

    public void x0(int i10) {
        this.f30562r0 = i10;
    }

    public b y() {
        return this.S[0];
    }

    public void y0(int i10, int i11) {
        this.Y = i10;
        int i12 = i11 - i10;
        this.U = i12;
        int i13 = this.f30538f0;
        if (i12 < i13) {
            this.U = i13;
        }
    }

    public int z() {
        d dVar = this.H;
        int i10 = dVar != null ? 0 + dVar.f30513g : 0;
        d dVar2 = this.J;
        return dVar2 != null ? i10 + dVar2.f30513g : i10;
    }

    public void z0(b bVar) {
        this.S[0] = bVar;
    }
}
