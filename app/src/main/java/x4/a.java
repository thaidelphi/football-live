package x4;

import a5.p0;
import com.unity3d.services.UnityAdsConstants;
import e4.k0;
import e4.t;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import n3.l3;
import n3.m1;
import x4.s;
import y5.q;
/* compiled from: AdaptiveTrackSelection.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class a extends c {

    /* renamed from: h  reason: collision with root package name */
    private final z4.f f32554h;

    /* renamed from: i  reason: collision with root package name */
    private final long f32555i;

    /* renamed from: j  reason: collision with root package name */
    private final long f32556j;

    /* renamed from: k  reason: collision with root package name */
    private final long f32557k;

    /* renamed from: l  reason: collision with root package name */
    private final int f32558l;

    /* renamed from: m  reason: collision with root package name */
    private final int f32559m;

    /* renamed from: n  reason: collision with root package name */
    private final float f32560n;

    /* renamed from: o  reason: collision with root package name */
    private final float f32561o;

    /* renamed from: p  reason: collision with root package name */
    private final y5.q<C0377a> f32562p;

    /* renamed from: q  reason: collision with root package name */
    private final a5.d f32563q;

    /* renamed from: r  reason: collision with root package name */
    private float f32564r;

    /* renamed from: s  reason: collision with root package name */
    private int f32565s;

    /* renamed from: t  reason: collision with root package name */
    private int f32566t;

    /* renamed from: u  reason: collision with root package name */
    private long f32567u;

    /* renamed from: v  reason: collision with root package name */
    private g4.n f32568v;

    /* compiled from: AdaptiveTrackSelection.java */
    /* renamed from: x4.a$a  reason: collision with other inner class name */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public static final class C0377a {

        /* renamed from: a  reason: collision with root package name */
        public final long f32569a;

        /* renamed from: b  reason: collision with root package name */
        public final long f32570b;

        public C0377a(long j10, long j11) {
            this.f32569a = j10;
            this.f32570b = j11;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof C0377a) {
                C0377a c0377a = (C0377a) obj;
                return this.f32569a == c0377a.f32569a && this.f32570b == c0377a.f32570b;
            }
            return false;
        }

        public int hashCode() {
            return (((int) this.f32569a) * 31) + ((int) this.f32570b);
        }
    }

    /* compiled from: AdaptiveTrackSelection.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public static class b implements s.b {

        /* renamed from: a  reason: collision with root package name */
        private final int f32571a;

        /* renamed from: b  reason: collision with root package name */
        private final int f32572b;

        /* renamed from: c  reason: collision with root package name */
        private final int f32573c;

        /* renamed from: d  reason: collision with root package name */
        private final int f32574d;

        /* renamed from: e  reason: collision with root package name */
        private final int f32575e;

        /* renamed from: f  reason: collision with root package name */
        private final float f32576f;

        /* renamed from: g  reason: collision with root package name */
        private final float f32577g;

        /* renamed from: h  reason: collision with root package name */
        private final a5.d f32578h;

        public b() {
            this(UnityAdsConstants.AdOperations.SHOW_TIMEOUT_MS, 25000, 25000, 0.7f);
        }

        @Override // x4.s.b
        public final s[] a(s.a[] aVarArr, z4.f fVar, t.b bVar, l3 l3Var) {
            s b10;
            y5.q B = a.B(aVarArr);
            s[] sVarArr = new s[aVarArr.length];
            for (int i10 = 0; i10 < aVarArr.length; i10++) {
                s.a aVar = aVarArr[i10];
                if (aVar != null) {
                    int[] iArr = aVar.f32679b;
                    if (iArr.length != 0) {
                        if (iArr.length == 1) {
                            b10 = new t(aVar.f32678a, iArr[0], aVar.f32680c);
                        } else {
                            b10 = b(aVar.f32678a, iArr, aVar.f32680c, fVar, (y5.q) B.get(i10));
                        }
                        sVarArr[i10] = b10;
                    }
                }
            }
            return sVarArr;
        }

        protected a b(k0 k0Var, int[] iArr, int i10, z4.f fVar, y5.q<C0377a> qVar) {
            return new a(k0Var, iArr, i10, fVar, this.f32571a, this.f32572b, this.f32573c, this.f32574d, this.f32575e, this.f32576f, this.f32577g, qVar, this.f32578h);
        }

        public b(int i10, int i11, int i12, float f10) {
            this(i10, i11, i12, 1279, 719, f10, 0.75f, a5.d.f412a);
        }

        public b(int i10, int i11, int i12, int i13, int i14, float f10, float f11, a5.d dVar) {
            this.f32571a = i10;
            this.f32572b = i11;
            this.f32573c = i12;
            this.f32574d = i13;
            this.f32575e = i14;
            this.f32576f = f10;
            this.f32577g = f11;
            this.f32578h = dVar;
        }
    }

    protected a(k0 k0Var, int[] iArr, int i10, z4.f fVar, long j10, long j11, long j12, int i11, int i12, float f10, float f11, List<C0377a> list, a5.d dVar) {
        super(k0Var, iArr, i10);
        z4.f fVar2;
        long j13;
        if (j12 < j10) {
            a5.t.i("AdaptiveTrackSelection", "Adjusting minDurationToRetainAfterDiscardMs to be at least minDurationForQualityIncreaseMs");
            fVar2 = fVar;
            j13 = j10;
        } else {
            fVar2 = fVar;
            j13 = j12;
        }
        this.f32554h = fVar2;
        this.f32555i = j10 * 1000;
        this.f32556j = j11 * 1000;
        this.f32557k = j13 * 1000;
        this.f32558l = i11;
        this.f32559m = i12;
        this.f32560n = f10;
        this.f32561o = f11;
        this.f32562p = y5.q.l(list);
        this.f32563q = dVar;
        this.f32564r = 1.0f;
        this.f32566t = 0;
        this.f32567u = -9223372036854775807L;
    }

    private int A(long j10, long j11) {
        long C = C(j11);
        int i10 = 0;
        for (int i11 = 0; i11 < this.f32583b; i11++) {
            if (j10 == Long.MIN_VALUE || !d(i11, j10)) {
                m1 f10 = f(i11);
                if (z(f10, f10.f28181h, C)) {
                    return i11;
                }
                i10 = i11;
            }
        }
        return i10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static y5.q<y5.q<C0377a>> B(s.a[] aVarArr) {
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < aVarArr.length; i10++) {
            if (aVarArr[i10] != null && aVarArr[i10].f32679b.length > 1) {
                q.a j10 = y5.q.j();
                j10.a(new C0377a(0L, 0L));
                arrayList.add(j10);
            } else {
                arrayList.add(null);
            }
        }
        long[][] G = G(aVarArr);
        int[] iArr = new int[G.length];
        long[] jArr = new long[G.length];
        for (int i11 = 0; i11 < G.length; i11++) {
            jArr[i11] = G[i11].length == 0 ? 0L : G[i11][0];
        }
        y(arrayList, jArr);
        y5.q<Integer> H = H(G);
        for (int i12 = 0; i12 < H.size(); i12++) {
            int intValue = H.get(i12).intValue();
            int i13 = iArr[intValue] + 1;
            iArr[intValue] = i13;
            jArr[intValue] = G[intValue][i13];
            y(arrayList, jArr);
        }
        for (int i14 = 0; i14 < aVarArr.length; i14++) {
            if (arrayList.get(i14) != null) {
                jArr[i14] = jArr[i14] * 2;
            }
        }
        y(arrayList, jArr);
        q.a j11 = y5.q.j();
        for (int i15 = 0; i15 < arrayList.size(); i15++) {
            q.a aVar = (q.a) arrayList.get(i15);
            j11.a(aVar == null ? y5.q.p() : aVar.h());
        }
        return j11.h();
    }

    private long C(long j10) {
        long j11;
        long I = I(j10);
        if (this.f32562p.isEmpty()) {
            return I;
        }
        int i10 = 1;
        while (i10 < this.f32562p.size() - 1 && this.f32562p.get(i10).f32569a < I) {
            i10++;
        }
        C0377a c0377a = this.f32562p.get(i10 - 1);
        C0377a c0377a2 = this.f32562p.get(i10);
        long j12 = c0377a.f32569a;
        return c0377a.f32570b + ((((float) (I - j12)) / ((float) (c0377a2.f32569a - j12))) * ((float) (c0377a2.f32570b - j11)));
    }

    private long D(List<? extends g4.n> list) {
        if (list.isEmpty()) {
            return -9223372036854775807L;
        }
        g4.n nVar = (g4.n) y5.t.c(list);
        long j10 = nVar.f25741g;
        if (j10 != -9223372036854775807L) {
            long j11 = nVar.f25742h;
            if (j11 != -9223372036854775807L) {
                return j11 - j10;
            }
            return -9223372036854775807L;
        }
        return -9223372036854775807L;
    }

    private long F(g4.o[] oVarArr, List<? extends g4.n> list) {
        int i10 = this.f32565s;
        if (i10 < oVarArr.length && oVarArr[i10].next()) {
            g4.o oVar = oVarArr[this.f32565s];
            return oVar.b() - oVar.a();
        }
        for (g4.o oVar2 : oVarArr) {
            if (oVar2.next()) {
                return oVar2.b() - oVar2.a();
            }
        }
        return D(list);
    }

    private static long[][] G(s.a[] aVarArr) {
        long[][] jArr = new long[aVarArr.length];
        for (int i10 = 0; i10 < aVarArr.length; i10++) {
            s.a aVar = aVarArr[i10];
            if (aVar == null) {
                jArr[i10] = new long[0];
            } else {
                jArr[i10] = new long[aVar.f32679b.length];
                int i11 = 0;
                while (true) {
                    int[] iArr = aVar.f32679b;
                    if (i11 >= iArr.length) {
                        break;
                    }
                    long j10 = aVar.f32678a.b(iArr[i11]).f28181h;
                    long[] jArr2 = jArr[i10];
                    if (j10 == -1) {
                        j10 = 0;
                    }
                    jArr2[i11] = j10;
                    i11++;
                }
                Arrays.sort(jArr[i10]);
            }
        }
        return jArr;
    }

    private static y5.q<Integer> H(long[][] jArr) {
        y5.z c10 = y5.b0.a().a().c();
        for (int i10 = 0; i10 < jArr.length; i10++) {
            if (jArr[i10].length > 1) {
                int length = jArr[i10].length;
                double[] dArr = new double[length];
                int i11 = 0;
                while (true) {
                    double d10 = 0.0d;
                    if (i11 >= jArr[i10].length) {
                        break;
                    }
                    if (jArr[i10][i11] != -1) {
                        d10 = Math.log(jArr[i10][i11]);
                    }
                    dArr[i11] = d10;
                    i11++;
                }
                int i12 = length - 1;
                double d11 = dArr[i12] - dArr[0];
                int i13 = 0;
                while (i13 < i12) {
                    double d12 = dArr[i13];
                    i13++;
                    c10.put(Double.valueOf(d11 == 0.0d ? 1.0d : (((d12 + dArr[i13]) * 0.5d) - dArr[0]) / d11), Integer.valueOf(i10));
                }
            }
        }
        return y5.q.l(c10.values());
    }

    private long I(long j10) {
        long a10;
        long f10 = ((float) this.f32554h.f()) * this.f32560n;
        if (this.f32554h.a() != -9223372036854775807L && j10 != -9223372036854775807L) {
            float f11 = (float) j10;
            return (((float) f10) * Math.max((f11 / this.f32564r) - ((float) a10), 0.0f)) / f11;
        }
        return ((float) f10) / this.f32564r;
    }

    private long J(long j10, long j11) {
        if (j10 == -9223372036854775807L) {
            return this.f32555i;
        }
        if (j11 != -9223372036854775807L) {
            j10 -= j11;
        }
        return Math.min(((float) j10) * this.f32561o, this.f32555i);
    }

    private static void y(List<q.a<C0377a>> list, long[] jArr) {
        long j10 = 0;
        for (long j11 : jArr) {
            j10 += j11;
        }
        for (int i10 = 0; i10 < list.size(); i10++) {
            q.a<C0377a> aVar = list.get(i10);
            if (aVar != null) {
                aVar.a(new C0377a(j10, jArr[i10]));
            }
        }
    }

    protected long E() {
        return this.f32557k;
    }

    protected boolean K(long j10, List<? extends g4.n> list) {
        long j11 = this.f32567u;
        return j11 == -9223372036854775807L || j10 - j11 >= 1000 || !(list.isEmpty() || ((g4.n) y5.t.c(list)).equals(this.f32568v));
    }

    @Override // x4.s
    public int a() {
        return this.f32565s;
    }

    @Override // x4.c, x4.s
    public void e() {
        this.f32568v = null;
    }

    @Override // x4.c, x4.s
    public void i(float f10) {
        this.f32564r = f10;
    }

    @Override // x4.s
    public Object j() {
        return null;
    }

    @Override // x4.s
    public void m(long j10, long j11, long j12, List<? extends g4.n> list, g4.o[] oVarArr) {
        long b10 = this.f32563q.b();
        long F = F(oVarArr, list);
        int i10 = this.f32566t;
        if (i10 == 0) {
            this.f32566t = 1;
            this.f32565s = A(b10, F);
            return;
        }
        int i11 = this.f32565s;
        int b11 = list.isEmpty() ? -1 : b(((g4.n) y5.t.c(list)).f25738d);
        if (b11 != -1) {
            i10 = ((g4.n) y5.t.c(list)).f25739e;
            i11 = b11;
        }
        int A = A(b10, F);
        if (!d(i11, b10)) {
            m1 f10 = f(i11);
            m1 f11 = f(A);
            long J = J(j12, F);
            int i12 = f11.f28181h;
            int i13 = f10.f28181h;
            if ((i12 > i13 && j11 < J) || (i12 < i13 && j11 >= this.f32556j)) {
                A = i11;
            }
        }
        if (A != i11) {
            i10 = 3;
        }
        this.f32566t = i10;
        this.f32565s = A;
    }

    @Override // x4.c, x4.s
    public void p() {
        this.f32567u = -9223372036854775807L;
        this.f32568v = null;
    }

    @Override // x4.c, x4.s
    public int q(long j10, List<? extends g4.n> list) {
        int i10;
        int i11;
        long b10 = this.f32563q.b();
        if (!K(b10, list)) {
            return list.size();
        }
        this.f32567u = b10;
        this.f32568v = list.isEmpty() ? null : (g4.n) y5.t.c(list);
        if (list.isEmpty()) {
            return 0;
        }
        int size = list.size();
        long d02 = p0.d0(list.get(size - 1).f25741g - j10, this.f32564r);
        long E = E();
        if (d02 < E) {
            return size;
        }
        m1 f10 = f(A(b10, D(list)));
        for (int i12 = 0; i12 < size; i12++) {
            g4.n nVar = list.get(i12);
            m1 m1Var = nVar.f25738d;
            if (p0.d0(nVar.f25741g - j10, this.f32564r) >= E && m1Var.f28181h < f10.f28181h && (i10 = m1Var.f28191r) != -1 && i10 <= this.f32559m && (i11 = m1Var.f28190q) != -1 && i11 <= this.f32558l && i10 < f10.f28191r) {
                return i12;
            }
        }
        return size;
    }

    @Override // x4.s
    public int t() {
        return this.f32566t;
    }

    protected boolean z(m1 m1Var, int i10, long j10) {
        return ((long) i10) <= j10;
    }
}
