package x4;

import a5.p0;
import android.content.Context;
import android.graphics.Point;
import android.media.AudioFormat;
import android.media.AudioManager;
import android.media.Spatializer;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Pair;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import com.google.android.gms.common.api.Api;
import com.ironsource.d9;
import com.unity3d.services.core.device.MimeTypes;
import e4.k0;
import e4.m0;
import e4.t;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.RandomAccess;
import n3.b3;
import n3.h;
import n3.l3;
import n3.m1;
import n3.z2;
import p3.d0;
import x4.a;
import x4.m;
import x4.s;
import x4.u;
import x4.z;
import y5.h0;
import y5.q;
/* compiled from: DefaultTrackSelector.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class m extends u {

    /* renamed from: k  reason: collision with root package name */
    private static final h0<Integer> f32607k = h0.a(new Comparator() { // from class: x4.e
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            int N;
            N = m.N((Integer) obj, (Integer) obj2);
            return N;
        }
    });

    /* renamed from: l  reason: collision with root package name */
    private static final h0<Integer> f32608l = h0.a(new Comparator() { // from class: x4.d
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            int O;
            O = m.O((Integer) obj, (Integer) obj2);
            return O;
        }
    });

    /* renamed from: d  reason: collision with root package name */
    private final Object f32609d;

    /* renamed from: e  reason: collision with root package name */
    public final Context f32610e;

    /* renamed from: f  reason: collision with root package name */
    private final s.b f32611f;

    /* renamed from: g  reason: collision with root package name */
    private final boolean f32612g;

    /* renamed from: h  reason: collision with root package name */
    private d f32613h;

    /* renamed from: i  reason: collision with root package name */
    private f f32614i;

    /* renamed from: j  reason: collision with root package name */
    private p3.e f32615j;

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: DefaultTrackSelector.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public static final class b extends h<b> implements Comparable<b> {

        /* renamed from: e  reason: collision with root package name */
        private final int f32616e;

        /* renamed from: f  reason: collision with root package name */
        private final boolean f32617f;

        /* renamed from: g  reason: collision with root package name */
        private final String f32618g;

        /* renamed from: h  reason: collision with root package name */
        private final d f32619h;

        /* renamed from: i  reason: collision with root package name */
        private final boolean f32620i;

        /* renamed from: j  reason: collision with root package name */
        private final int f32621j;

        /* renamed from: k  reason: collision with root package name */
        private final int f32622k;

        /* renamed from: l  reason: collision with root package name */
        private final int f32623l;

        /* renamed from: m  reason: collision with root package name */
        private final boolean f32624m;

        /* renamed from: n  reason: collision with root package name */
        private final int f32625n;

        /* renamed from: o  reason: collision with root package name */
        private final int f32626o;

        /* renamed from: p  reason: collision with root package name */
        private final boolean f32627p;

        /* renamed from: q  reason: collision with root package name */
        private final int f32628q;

        /* renamed from: r  reason: collision with root package name */
        private final int f32629r;

        /* renamed from: s  reason: collision with root package name */
        private final int f32630s;

        /* renamed from: t  reason: collision with root package name */
        private final int f32631t;

        /* renamed from: u  reason: collision with root package name */
        private final boolean f32632u;

        /* renamed from: v  reason: collision with root package name */
        private final boolean f32633v;

        public b(int i10, k0 k0Var, int i11, d dVar, int i12, boolean z10, x5.h<m1> hVar) {
            super(i10, k0Var, i11);
            int i13;
            int i14;
            int i15;
            this.f32619h = dVar;
            this.f32618g = m.R(this.f32659d.f28176c);
            this.f32620i = m.J(i12, false);
            int i16 = 0;
            while (true) {
                int size = dVar.f32709n.size();
                i13 = Api.BaseClientBuilder.API_PRIORITY_OTHER;
                if (i16 >= size) {
                    i14 = 0;
                    i16 = Integer.MAX_VALUE;
                    break;
                }
                i14 = m.B(this.f32659d, dVar.f32709n.get(i16), false);
                if (i14 > 0) {
                    break;
                }
                i16++;
            }
            this.f32622k = i16;
            this.f32621j = i14;
            this.f32623l = m.F(this.f32659d.f28178e, dVar.f32710o);
            m1 m1Var = this.f32659d;
            int i17 = m1Var.f28178e;
            this.f32624m = i17 == 0 || (i17 & 1) != 0;
            this.f32627p = (m1Var.f28177d & 1) != 0;
            int i18 = m1Var.f28198y;
            this.f32628q = i18;
            this.f32629r = m1Var.f28199z;
            int i19 = m1Var.f28181h;
            this.f32630s = i19;
            this.f32617f = (i19 == -1 || i19 <= dVar.f32712q) && (i18 == -1 || i18 <= dVar.f32711p) && hVar.apply(m1Var);
            String[] g02 = p0.g0();
            int i20 = 0;
            while (true) {
                if (i20 >= g02.length) {
                    i15 = 0;
                    i20 = Integer.MAX_VALUE;
                    break;
                }
                i15 = m.B(this.f32659d, g02[i20], false);
                if (i15 > 0) {
                    break;
                }
                i20++;
            }
            this.f32625n = i20;
            this.f32626o = i15;
            int i21 = 0;
            while (true) {
                if (i21 < dVar.f32713r.size()) {
                    String str = this.f32659d.f28185l;
                    if (str != null && str.equals(dVar.f32713r.get(i21))) {
                        i13 = i21;
                        break;
                    }
                    i21++;
                } else {
                    break;
                }
            }
            this.f32631t = i13;
            this.f32632u = z2.e(i12) == 128;
            this.f32633v = z2.g(i12) == 64;
            this.f32616e = g(i12, z10);
        }

        public static int c(List<b> list, List<b> list2) {
            return ((b) Collections.max(list)).compareTo((b) Collections.max(list2));
        }

        public static y5.q<b> f(int i10, k0 k0Var, d dVar, int[] iArr, boolean z10, x5.h<m1> hVar) {
            q.a j10 = y5.q.j();
            for (int i11 = 0; i11 < k0Var.f25083a; i11++) {
                j10.a(new b(i10, k0Var, i11, dVar, iArr[i11], z10, hVar));
            }
            return j10.h();
        }

        private int g(int i10, boolean z10) {
            if (m.J(i10, this.f32619h.N)) {
                if (this.f32617f || this.f32619h.H) {
                    if (m.J(i10, false) && this.f32617f && this.f32659d.f28181h != -1) {
                        d dVar = this.f32619h;
                        if (!dVar.f32719x && !dVar.f32718w && (dVar.P || !z10)) {
                            return 2;
                        }
                    }
                    return 1;
                }
                return 0;
            }
            return 0;
        }

        @Override // x4.m.h
        public int a() {
            return this.f32616e;
        }

        @Override // java.lang.Comparable
        /* renamed from: d */
        public int compareTo(b bVar) {
            h0 d10 = (this.f32617f && this.f32620i) ? m.f32607k : m.f32607k.d();
            y5.k e8 = y5.k.i().f(this.f32620i, bVar.f32620i).e(Integer.valueOf(this.f32622k), Integer.valueOf(bVar.f32622k), h0.b().d()).d(this.f32621j, bVar.f32621j).d(this.f32623l, bVar.f32623l).f(this.f32627p, bVar.f32627p).f(this.f32624m, bVar.f32624m).e(Integer.valueOf(this.f32625n), Integer.valueOf(bVar.f32625n), h0.b().d()).d(this.f32626o, bVar.f32626o).f(this.f32617f, bVar.f32617f).e(Integer.valueOf(this.f32631t), Integer.valueOf(bVar.f32631t), h0.b().d()).e(Integer.valueOf(this.f32630s), Integer.valueOf(bVar.f32630s), this.f32619h.f32718w ? m.f32607k.d() : m.f32608l).f(this.f32632u, bVar.f32632u).f(this.f32633v, bVar.f32633v).e(Integer.valueOf(this.f32628q), Integer.valueOf(bVar.f32628q), d10).e(Integer.valueOf(this.f32629r), Integer.valueOf(bVar.f32629r), d10);
            Integer valueOf = Integer.valueOf(this.f32630s);
            Integer valueOf2 = Integer.valueOf(bVar.f32630s);
            if (!p0.c(this.f32618g, bVar.f32618g)) {
                d10 = m.f32608l;
            }
            return e8.e(valueOf, valueOf2, d10).h();
        }

        @Override // x4.m.h
        /* renamed from: h */
        public boolean b(b bVar) {
            int i10;
            String str;
            int i11;
            d dVar = this.f32619h;
            if ((dVar.K || ((i11 = this.f32659d.f28198y) != -1 && i11 == bVar.f32659d.f28198y)) && (dVar.I || ((str = this.f32659d.f28185l) != null && TextUtils.equals(str, bVar.f32659d.f28185l)))) {
                d dVar2 = this.f32619h;
                if ((dVar2.J || ((i10 = this.f32659d.f28199z) != -1 && i10 == bVar.f32659d.f28199z)) && (dVar2.L || (this.f32632u == bVar.f32632u && this.f32633v == bVar.f32633v))) {
                    return true;
                }
            }
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: DefaultTrackSelector.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public static final class c implements Comparable<c> {

        /* renamed from: a  reason: collision with root package name */
        private final boolean f32634a;

        /* renamed from: b  reason: collision with root package name */
        private final boolean f32635b;

        public c(m1 m1Var, int i10) {
            this.f32634a = (m1Var.f28177d & 1) != 0;
            this.f32635b = m.J(i10, false);
        }

        @Override // java.lang.Comparable
        /* renamed from: a */
        public int compareTo(c cVar) {
            return y5.k.i().f(this.f32635b, cVar.f32635b).f(this.f32634a, cVar.f32634a).h();
        }
    }

    /* compiled from: DefaultTrackSelector.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public static final class d extends z {
        public static final d S;
        @Deprecated
        public static final d T;
        public static final h.a<d> U;
        public final boolean D;
        public final boolean E;
        public final boolean F;
        public final boolean G;
        public final boolean H;
        public final boolean I;
        public final boolean J;
        public final boolean K;
        public final boolean L;
        public final boolean M;
        public final boolean N;
        public final boolean O;
        public final boolean P;
        private final SparseArray<Map<m0, e>> Q;
        private final SparseBooleanArray R;

        static {
            d A = new a().A();
            S = A;
            T = A;
            U = new h.a() { // from class: x4.n
                @Override // n3.h.a
                public final n3.h a(Bundle bundle) {
                    m.d n10;
                    n10 = m.d.n(bundle);
                    return n10;
                }
            };
        }

        private static boolean f(SparseBooleanArray sparseBooleanArray, SparseBooleanArray sparseBooleanArray2) {
            int size = sparseBooleanArray.size();
            if (sparseBooleanArray2.size() != size) {
                return false;
            }
            for (int i10 = 0; i10 < size; i10++) {
                if (sparseBooleanArray2.indexOfKey(sparseBooleanArray.keyAt(i10)) < 0) {
                    return false;
                }
            }
            return true;
        }

        private static boolean g(SparseArray<Map<m0, e>> sparseArray, SparseArray<Map<m0, e>> sparseArray2) {
            int size = sparseArray.size();
            if (sparseArray2.size() != size) {
                return false;
            }
            for (int i10 = 0; i10 < size; i10++) {
                int indexOfKey = sparseArray2.indexOfKey(sparseArray.keyAt(i10));
                if (indexOfKey < 0 || !h(sparseArray.valueAt(i10), sparseArray2.valueAt(indexOfKey))) {
                    return false;
                }
            }
            return true;
        }

        /* JADX WARN: Removed duplicated region for block: B:8:0x001a  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        private static boolean h(java.util.Map<e4.m0, x4.m.e> r4, java.util.Map<e4.m0, x4.m.e> r5) {
            /*
                int r0 = r4.size()
                int r1 = r5.size()
                r2 = 0
                if (r1 == r0) goto Lc
                return r2
            Lc:
                java.util.Set r4 = r4.entrySet()
                java.util.Iterator r4 = r4.iterator()
            L14:
                boolean r0 = r4.hasNext()
                if (r0 == 0) goto L3b
                java.lang.Object r0 = r4.next()
                java.util.Map$Entry r0 = (java.util.Map.Entry) r0
                java.lang.Object r1 = r0.getKey()
                e4.m0 r1 = (e4.m0) r1
                boolean r3 = r5.containsKey(r1)
                if (r3 == 0) goto L3a
                java.lang.Object r0 = r0.getValue()
                java.lang.Object r1 = r5.get(r1)
                boolean r0 = a5.p0.c(r0, r1)
                if (r0 != 0) goto L14
            L3a:
                return r2
            L3b:
                r4 = 1
                return r4
            */
            throw new UnsupportedOperationException("Method not decompiled: x4.m.d.h(java.util.Map, java.util.Map):boolean");
        }

        public static d j(Context context) {
            return new a(context).A();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ d n(Bundle bundle) {
            return new a(bundle).A();
        }

        @Override // x4.z
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || d.class != obj.getClass()) {
                return false;
            }
            d dVar = (d) obj;
            return super.equals(dVar) && this.D == dVar.D && this.E == dVar.E && this.F == dVar.F && this.G == dVar.G && this.H == dVar.H && this.I == dVar.I && this.J == dVar.J && this.K == dVar.K && this.L == dVar.L && this.M == dVar.M && this.N == dVar.N && this.O == dVar.O && this.P == dVar.P && f(this.R, dVar.R) && g(this.Q, dVar.Q);
        }

        @Override // x4.z
        public int hashCode() {
            return ((((((((((((((((((((((((((super.hashCode() + 31) * 31) + (this.D ? 1 : 0)) * 31) + (this.E ? 1 : 0)) * 31) + (this.F ? 1 : 0)) * 31) + (this.G ? 1 : 0)) * 31) + (this.H ? 1 : 0)) * 31) + (this.I ? 1 : 0)) * 31) + (this.J ? 1 : 0)) * 31) + (this.K ? 1 : 0)) * 31) + (this.L ? 1 : 0)) * 31) + (this.M ? 1 : 0)) * 31) + (this.N ? 1 : 0)) * 31) + (this.O ? 1 : 0)) * 31) + (this.P ? 1 : 0);
        }

        public a i() {
            return new a();
        }

        public boolean k(int i10) {
            return this.R.get(i10);
        }

        @Deprecated
        public e l(int i10, m0 m0Var) {
            Map<m0, e> map = this.Q.get(i10);
            if (map != null) {
                return map.get(m0Var);
            }
            return null;
        }

        @Deprecated
        public boolean m(int i10, m0 m0Var) {
            Map<m0, e> map = this.Q.get(i10);
            return map != null && map.containsKey(m0Var);
        }

        /* compiled from: DefaultTrackSelector.java */
        /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
        public static final class a extends z.a {
            private boolean A;
            private boolean B;
            private boolean C;
            private boolean D;
            private boolean E;
            private boolean F;
            private boolean G;
            private boolean H;
            private boolean I;
            private boolean J;
            private boolean K;
            private boolean L;
            private boolean M;
            private final SparseArray<Map<m0, e>> N;
            private final SparseBooleanArray O;

            private static SparseArray<Map<m0, e>> a0(SparseArray<Map<m0, e>> sparseArray) {
                SparseArray<Map<m0, e>> sparseArray2 = new SparseArray<>();
                for (int i10 = 0; i10 < sparseArray.size(); i10++) {
                    sparseArray2.put(sparseArray.keyAt(i10), new HashMap(sparseArray.valueAt(i10)));
                }
                return sparseArray2;
            }

            private void b0() {
                this.A = true;
                this.B = false;
                this.C = true;
                this.D = false;
                this.E = true;
                this.F = false;
                this.G = false;
                this.H = false;
                this.I = false;
                this.J = true;
                this.K = true;
                this.L = false;
                this.M = true;
            }

            private SparseBooleanArray c0(int[] iArr) {
                if (iArr == null) {
                    return new SparseBooleanArray();
                }
                SparseBooleanArray sparseBooleanArray = new SparseBooleanArray(iArr.length);
                for (int i10 : iArr) {
                    sparseBooleanArray.append(i10, true);
                }
                return sparseBooleanArray;
            }

            private void u0(Bundle bundle) {
                y5.q b10;
                SparseArray c10;
                int[] intArray = bundle.getIntArray(z.b(1010));
                ArrayList parcelableArrayList = bundle.getParcelableArrayList(z.b(1011));
                if (parcelableArrayList == null) {
                    b10 = y5.q.p();
                } else {
                    b10 = a5.c.b(m0.f25105e, parcelableArrayList);
                }
                SparseArray sparseParcelableArray = bundle.getSparseParcelableArray(z.b(1012));
                if (sparseParcelableArray == null) {
                    c10 = new SparseArray();
                } else {
                    c10 = a5.c.c(e.f32636e, sparseParcelableArray);
                }
                if (intArray == null || intArray.length != b10.size()) {
                    return;
                }
                for (int i10 = 0; i10 < intArray.length; i10++) {
                    t0(intArray[i10], (m0) b10.get(i10), (e) c10.get(i10));
                }
            }

            @Override // x4.z.a
            /* renamed from: Z */
            public d A() {
                return new d(this);
            }

            protected a d0(z zVar) {
                super.D(zVar);
                return this;
            }

            public a e0(boolean z10) {
                this.H = z10;
                return this;
            }

            public a f0(boolean z10) {
                this.I = z10;
                return this;
            }

            public a g0(boolean z10) {
                this.F = z10;
                return this;
            }

            public a h0(boolean z10) {
                this.G = z10;
                return this;
            }

            public a i0(boolean z10) {
                this.M = z10;
                return this;
            }

            public a j0(boolean z10) {
                this.D = z10;
                return this;
            }

            public a k0(boolean z10) {
                this.B = z10;
                return this;
            }

            public a l0(boolean z10) {
                this.C = z10;
                return this;
            }

            public a m0(boolean z10) {
                this.J = z10;
                return this;
            }

            public a n0(boolean z10) {
                this.E = z10;
                return this;
            }

            public a o0(boolean z10) {
                this.K = z10;
                return this;
            }

            public a p0(boolean z10) {
                this.A = z10;
                return this;
            }

            public a q0(boolean z10) {
                super.E(z10);
                return this;
            }

            public a r0(int i10) {
                super.F(i10);
                return this;
            }

            @Override // x4.z.a
            /* renamed from: s0 */
            public a G(Context context) {
                super.G(context);
                return this;
            }

            @Deprecated
            public a t0(int i10, m0 m0Var, e eVar) {
                Map<m0, e> map = this.N.get(i10);
                if (map == null) {
                    map = new HashMap<>();
                    this.N.put(i10, map);
                }
                if (map.containsKey(m0Var) && p0.c(map.get(m0Var), eVar)) {
                    return this;
                }
                map.put(m0Var, eVar);
                return this;
            }

            public a v0(boolean z10) {
                this.L = z10;
                return this;
            }

            @Override // x4.z.a
            /* renamed from: w0 */
            public a I(int i10, int i11, boolean z10) {
                super.I(i10, i11, z10);
                return this;
            }

            @Override // x4.z.a
            /* renamed from: x0 */
            public a J(Context context, boolean z10) {
                super.J(context, z10);
                return this;
            }

            @Deprecated
            public a() {
                this.N = new SparseArray<>();
                this.O = new SparseBooleanArray();
                b0();
            }

            public a(Context context) {
                super(context);
                this.N = new SparseArray<>();
                this.O = new SparseBooleanArray();
                b0();
            }

            private a(d dVar) {
                super(dVar);
                this.A = dVar.D;
                this.B = dVar.E;
                this.C = dVar.F;
                this.D = dVar.G;
                this.E = dVar.H;
                this.F = dVar.I;
                this.G = dVar.J;
                this.H = dVar.K;
                this.I = dVar.L;
                this.J = dVar.M;
                this.K = dVar.N;
                this.L = dVar.O;
                this.M = dVar.P;
                this.N = a0(dVar.Q);
                this.O = dVar.R.clone();
            }

            private a(Bundle bundle) {
                super(bundle);
                b0();
                d dVar = d.S;
                p0(bundle.getBoolean(z.b(1000), dVar.D));
                k0(bundle.getBoolean(z.b(1001), dVar.E));
                l0(bundle.getBoolean(z.b(1002), dVar.F));
                j0(bundle.getBoolean(z.b(d9.f16966j), dVar.G));
                n0(bundle.getBoolean(z.b(1003), dVar.H));
                g0(bundle.getBoolean(z.b(1004), dVar.I));
                h0(bundle.getBoolean(z.b(1005), dVar.J));
                e0(bundle.getBoolean(z.b(1006), dVar.K));
                f0(bundle.getBoolean(z.b(1015), dVar.L));
                m0(bundle.getBoolean(z.b(d9.f16968l), dVar.M));
                o0(bundle.getBoolean(z.b(1007), dVar.N));
                v0(bundle.getBoolean(z.b(1008), dVar.O));
                i0(bundle.getBoolean(z.b(1009), dVar.P));
                this.N = new SparseArray<>();
                u0(bundle);
                this.O = c0(bundle.getIntArray(z.b(d9.f16965i)));
            }
        }

        private d(a aVar) {
            super(aVar);
            this.D = aVar.A;
            this.E = aVar.B;
            this.F = aVar.C;
            this.G = aVar.D;
            this.H = aVar.E;
            this.I = aVar.F;
            this.J = aVar.G;
            this.K = aVar.H;
            this.L = aVar.I;
            this.M = aVar.J;
            this.N = aVar.K;
            this.O = aVar.L;
            this.P = aVar.M;
            this.Q = aVar.N;
            this.R = aVar.O;
        }
    }

    /* compiled from: DefaultTrackSelector.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public static final class e implements n3.h {

        /* renamed from: e  reason: collision with root package name */
        public static final h.a<e> f32636e = new h.a() { // from class: x4.o
            @Override // n3.h.a
            public final n3.h a(Bundle bundle) {
                m.e c10;
                c10 = m.e.c(bundle);
                return c10;
            }
        };

        /* renamed from: a  reason: collision with root package name */
        public final int f32637a;

        /* renamed from: b  reason: collision with root package name */
        public final int[] f32638b;

        /* renamed from: c  reason: collision with root package name */
        public final int f32639c;

        /* renamed from: d  reason: collision with root package name */
        public final int f32640d;

        public e(int i10, int[] iArr, int i11) {
            this.f32637a = i10;
            int[] copyOf = Arrays.copyOf(iArr, iArr.length);
            this.f32638b = copyOf;
            this.f32639c = iArr.length;
            this.f32640d = i11;
            Arrays.sort(copyOf);
        }

        private static String b(int i10) {
            return Integer.toString(i10, 36);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ e c(Bundle bundle) {
            boolean z10 = false;
            int i10 = bundle.getInt(b(0), -1);
            int[] intArray = bundle.getIntArray(b(1));
            int i11 = bundle.getInt(b(2), -1);
            if (i10 >= 0 && i11 >= 0) {
                z10 = true;
            }
            a5.a.a(z10);
            a5.a.e(intArray);
            return new e(i10, intArray, i11);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || e.class != obj.getClass()) {
                return false;
            }
            e eVar = (e) obj;
            return this.f32637a == eVar.f32637a && Arrays.equals(this.f32638b, eVar.f32638b) && this.f32640d == eVar.f32640d;
        }

        public int hashCode() {
            return (((this.f32637a * 31) + Arrays.hashCode(this.f32638b)) * 31) + this.f32640d;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: DefaultTrackSelector.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public static class f {

        /* renamed from: a  reason: collision with root package name */
        private final Spatializer f32641a;

        /* renamed from: b  reason: collision with root package name */
        private final boolean f32642b;

        /* renamed from: c  reason: collision with root package name */
        private Handler f32643c;

        /* renamed from: d  reason: collision with root package name */
        private Spatializer.OnSpatializerStateChangedListener f32644d;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: DefaultTrackSelector.java */
        /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
        public class a implements Spatializer.OnSpatializerStateChangedListener {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ m f32645a;

            a(m mVar) {
                this.f32645a = mVar;
            }

            @Override // android.media.Spatializer.OnSpatializerStateChangedListener
            public void onSpatializerAvailableChanged(Spatializer spatializer, boolean z10) {
                this.f32645a.Q();
            }

            @Override // android.media.Spatializer.OnSpatializerStateChangedListener
            public void onSpatializerEnabledChanged(Spatializer spatializer, boolean z10) {
                this.f32645a.Q();
            }
        }

        private f(Spatializer spatializer) {
            this.f32641a = spatializer;
            this.f32642b = spatializer.getImmersiveAudioLevel() != 0;
        }

        public static f f(Context context) {
            AudioManager audioManager = (AudioManager) context.getSystemService(MimeTypes.BASE_TYPE_AUDIO);
            if (audioManager == null) {
                return null;
            }
            return new f(audioManager.getSpatializer());
        }

        public boolean a(p3.e eVar, m1 m1Var) {
            AudioFormat.Builder channelMask = new AudioFormat.Builder().setEncoding(2).setChannelMask(p0.F(("audio/eac3-joc".equals(m1Var.f28185l) && m1Var.f28198y == 16) ? 12 : m1Var.f28198y));
            int i10 = m1Var.f28199z;
            if (i10 != -1) {
                channelMask.setSampleRate(i10);
            }
            return this.f32641a.canBeSpatialized(eVar.b().f29657a, channelMask.build());
        }

        public void b(m mVar, Looper looper) {
            if (this.f32644d == null && this.f32643c == null) {
                this.f32644d = new a(mVar);
                Handler handler = new Handler(looper);
                this.f32643c = handler;
                Spatializer spatializer = this.f32641a;
                Objects.requireNonNull(handler);
                spatializer.addOnSpatializerStateChangedListener(new d0(handler), this.f32644d);
            }
        }

        public boolean c() {
            return this.f32641a.isAvailable();
        }

        public boolean d() {
            return this.f32641a.isEnabled();
        }

        public boolean e() {
            return this.f32642b;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: DefaultTrackSelector.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public static final class g extends h<g> implements Comparable<g> {

        /* renamed from: e  reason: collision with root package name */
        private final int f32647e;

        /* renamed from: f  reason: collision with root package name */
        private final boolean f32648f;

        /* renamed from: g  reason: collision with root package name */
        private final boolean f32649g;

        /* renamed from: h  reason: collision with root package name */
        private final boolean f32650h;

        /* renamed from: i  reason: collision with root package name */
        private final int f32651i;

        /* renamed from: j  reason: collision with root package name */
        private final int f32652j;

        /* renamed from: k  reason: collision with root package name */
        private final int f32653k;

        /* renamed from: l  reason: collision with root package name */
        private final int f32654l;

        /* renamed from: m  reason: collision with root package name */
        private final boolean f32655m;

        public g(int i10, k0 k0Var, int i11, d dVar, int i12, String str) {
            super(i10, k0Var, i11);
            y5.q<String> qVar;
            int i13;
            int i14 = 0;
            this.f32648f = m.J(i12, false);
            int i15 = this.f32659d.f28177d & (~dVar.f32716u);
            this.f32649g = (i15 & 1) != 0;
            this.f32650h = (i15 & 2) != 0;
            int i16 = Api.BaseClientBuilder.API_PRIORITY_OTHER;
            if (dVar.f32714s.isEmpty()) {
                qVar = y5.q.q("");
            } else {
                qVar = dVar.f32714s;
            }
            int i17 = 0;
            while (true) {
                if (i17 >= qVar.size()) {
                    i13 = 0;
                    break;
                }
                i13 = m.B(this.f32659d, qVar.get(i17), dVar.f32717v);
                if (i13 > 0) {
                    i16 = i17;
                    break;
                }
                i17++;
            }
            this.f32651i = i16;
            this.f32652j = i13;
            int F = m.F(this.f32659d.f28178e, dVar.f32715t);
            this.f32653k = F;
            this.f32655m = (this.f32659d.f28178e & 1088) != 0;
            int B = m.B(this.f32659d, str, m.R(str) == null);
            this.f32654l = B;
            boolean z10 = i13 > 0 || (dVar.f32714s.isEmpty() && F > 0) || this.f32649g || (this.f32650h && B > 0);
            if (m.J(i12, dVar.N) && z10) {
                i14 = 1;
            }
            this.f32647e = i14;
        }

        public static int c(List<g> list, List<g> list2) {
            return list.get(0).compareTo(list2.get(0));
        }

        public static y5.q<g> f(int i10, k0 k0Var, d dVar, int[] iArr, String str) {
            q.a j10 = y5.q.j();
            for (int i11 = 0; i11 < k0Var.f25083a; i11++) {
                j10.a(new g(i10, k0Var, i11, dVar, iArr[i11], str));
            }
            return j10.h();
        }

        @Override // x4.m.h
        public int a() {
            return this.f32647e;
        }

        @Override // java.lang.Comparable
        /* renamed from: d */
        public int compareTo(g gVar) {
            y5.k d10 = y5.k.i().f(this.f32648f, gVar.f32648f).e(Integer.valueOf(this.f32651i), Integer.valueOf(gVar.f32651i), h0.b().d()).d(this.f32652j, gVar.f32652j).d(this.f32653k, gVar.f32653k).f(this.f32649g, gVar.f32649g).e(Boolean.valueOf(this.f32650h), Boolean.valueOf(gVar.f32650h), this.f32652j == 0 ? h0.b() : h0.b().d()).d(this.f32654l, gVar.f32654l);
            if (this.f32653k == 0) {
                d10 = d10.g(this.f32655m, gVar.f32655m);
            }
            return d10.h();
        }

        @Override // x4.m.h
        /* renamed from: g */
        public boolean b(g gVar) {
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: DefaultTrackSelector.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public static abstract class h<T extends h<T>> {

        /* renamed from: a  reason: collision with root package name */
        public final int f32656a;

        /* renamed from: b  reason: collision with root package name */
        public final k0 f32657b;

        /* renamed from: c  reason: collision with root package name */
        public final int f32658c;

        /* renamed from: d  reason: collision with root package name */
        public final m1 f32659d;

        /* compiled from: DefaultTrackSelector.java */
        /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
        public interface a<T extends h<T>> {
            List<T> a(int i10, k0 k0Var, int[] iArr);
        }

        public h(int i10, k0 k0Var, int i11) {
            this.f32656a = i10;
            this.f32657b = k0Var;
            this.f32658c = i11;
            this.f32659d = k0Var.b(i11);
        }

        public abstract int a();

        public abstract boolean b(T t10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: DefaultTrackSelector.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public static final class i extends h<i> {

        /* renamed from: e  reason: collision with root package name */
        private final boolean f32660e;

        /* renamed from: f  reason: collision with root package name */
        private final d f32661f;

        /* renamed from: g  reason: collision with root package name */
        private final boolean f32662g;

        /* renamed from: h  reason: collision with root package name */
        private final boolean f32663h;

        /* renamed from: i  reason: collision with root package name */
        private final int f32664i;

        /* renamed from: j  reason: collision with root package name */
        private final int f32665j;

        /* renamed from: k  reason: collision with root package name */
        private final int f32666k;

        /* renamed from: l  reason: collision with root package name */
        private final int f32667l;

        /* renamed from: m  reason: collision with root package name */
        private final boolean f32668m;

        /* renamed from: n  reason: collision with root package name */
        private final boolean f32669n;

        /* renamed from: o  reason: collision with root package name */
        private final int f32670o;

        /* renamed from: p  reason: collision with root package name */
        private final boolean f32671p;

        /* renamed from: q  reason: collision with root package name */
        private final boolean f32672q;

        /* renamed from: r  reason: collision with root package name */
        private final int f32673r;

        /* JADX WARN: Removed duplicated region for block: B:54:0x00a0  */
        /* JADX WARN: Removed duplicated region for block: B:62:0x00b5  */
        /* JADX WARN: Removed duplicated region for block: B:70:0x00d6  */
        /* JADX WARN: Removed duplicated region for block: B:71:0x00d8  */
        /* JADX WARN: Removed duplicated region for block: B:75:0x00e4  */
        /* JADX WARN: Removed duplicated region for block: B:78:0x00cc A[EDGE_INSN: B:78:0x00cc->B:68:0x00cc ?: BREAK  , SYNTHETIC] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public i(int r5, e4.k0 r6, int r7, x4.m.d r8, int r9, int r10, boolean r11) {
            /*
                Method dump skipped, instructions count: 248
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: x4.m.i.<init>(int, e4.k0, int, x4.m$d, int, int, boolean):void");
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static int f(i iVar, i iVar2) {
            y5.k f10 = y5.k.i().f(iVar.f32663h, iVar2.f32663h).d(iVar.f32667l, iVar2.f32667l).f(iVar.f32668m, iVar2.f32668m).f(iVar.f32660e, iVar2.f32660e).f(iVar.f32662g, iVar2.f32662g).e(Integer.valueOf(iVar.f32666k), Integer.valueOf(iVar2.f32666k), h0.b().d()).f(iVar.f32671p, iVar2.f32671p).f(iVar.f32672q, iVar2.f32672q);
            if (iVar.f32671p && iVar.f32672q) {
                f10 = f10.d(iVar.f32673r, iVar2.f32673r);
            }
            return f10.h();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static int g(i iVar, i iVar2) {
            h0 d10 = (iVar.f32660e && iVar.f32663h) ? m.f32607k : m.f32607k.d();
            return y5.k.i().e(Integer.valueOf(iVar.f32664i), Integer.valueOf(iVar2.f32664i), iVar.f32661f.f32718w ? m.f32607k.d() : m.f32608l).e(Integer.valueOf(iVar.f32665j), Integer.valueOf(iVar2.f32665j), d10).e(Integer.valueOf(iVar.f32664i), Integer.valueOf(iVar2.f32664i), d10).h();
        }

        public static int h(List<i> list, List<i> list2) {
            return y5.k.i().e((i) Collections.max(list, new Comparator() { // from class: x4.p
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    int f10;
                    f10 = m.i.f((m.i) obj, (m.i) obj2);
                    return f10;
                }
            }), (i) Collections.max(list2, new Comparator() { // from class: x4.p
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    int f10;
                    f10 = m.i.f((m.i) obj, (m.i) obj2);
                    return f10;
                }
            }), new Comparator() { // from class: x4.p
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    int f10;
                    f10 = m.i.f((m.i) obj, (m.i) obj2);
                    return f10;
                }
            }).d(list.size(), list2.size()).e((i) Collections.max(list, new Comparator() { // from class: x4.q
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    int g10;
                    g10 = m.i.g((m.i) obj, (m.i) obj2);
                    return g10;
                }
            }), (i) Collections.max(list2, new Comparator() { // from class: x4.q
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    int g10;
                    g10 = m.i.g((m.i) obj, (m.i) obj2);
                    return g10;
                }
            }), new Comparator() { // from class: x4.q
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    int g10;
                    g10 = m.i.g((m.i) obj, (m.i) obj2);
                    return g10;
                }
            }).h();
        }

        public static y5.q<i> i(int i10, k0 k0Var, d dVar, int[] iArr, int i11) {
            int C = m.C(k0Var, dVar.f32704i, dVar.f32705j, dVar.f32706k);
            q.a j10 = y5.q.j();
            for (int i12 = 0; i12 < k0Var.f25083a; i12++) {
                int f10 = k0Var.b(i12).f();
                j10.a(new i(i10, k0Var, i12, dVar, iArr[i12], i11, C == Integer.MAX_VALUE || (f10 != -1 && f10 <= C)));
            }
            return j10.h();
        }

        private int j(int i10, int i11) {
            if ((this.f32659d.f28178e & 16384) == 0 && m.J(i10, this.f32661f.N)) {
                if (this.f32660e || this.f32661f.D) {
                    if (m.J(i10, false) && this.f32662g && this.f32660e && this.f32659d.f28181h != -1) {
                        d dVar = this.f32661f;
                        if (!dVar.f32719x && !dVar.f32718w && (i10 & i11) != 0) {
                            return 2;
                        }
                    }
                    return 1;
                }
                return 0;
            }
            return 0;
        }

        @Override // x4.m.h
        public int a() {
            return this.f32670o;
        }

        @Override // x4.m.h
        /* renamed from: k */
        public boolean b(i iVar) {
            return (this.f32669n || p0.c(this.f32659d.f28185l, iVar.f32659d.f28185l)) && (this.f32661f.G || (this.f32671p == iVar.f32671p && this.f32672q == iVar.f32672q));
        }
    }

    public m(Context context) {
        this(context, new a.b());
    }

    private static void A(m0 m0Var, z zVar, Map<Integer, x> map) {
        x xVar;
        for (int i10 = 0; i10 < m0Var.f25106a; i10++) {
            x xVar2 = zVar.f32720y.get(m0Var.b(i10));
            if (xVar2 != null && ((xVar = map.get(Integer.valueOf(xVar2.b()))) == null || (xVar.f32694b.isEmpty() && !xVar2.f32694b.isEmpty()))) {
                map.put(Integer.valueOf(xVar2.b()), xVar2);
            }
        }
    }

    protected static int B(m1 m1Var, String str, boolean z10) {
        if (TextUtils.isEmpty(str) || !str.equals(m1Var.f28176c)) {
            String R = R(str);
            String R2 = R(m1Var.f28176c);
            if (R2 == null || R == null) {
                return (z10 && R2 == null) ? 1 : 0;
            } else if (R2.startsWith(R) || R.startsWith(R2)) {
                return 3;
            } else {
                return p0.S0(R2, "-")[0].equals(p0.S0(R, "-")[0]) ? 2 : 0;
            }
        }
        return 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int C(k0 k0Var, int i10, int i11, boolean z10) {
        int i12;
        int i13 = Api.BaseClientBuilder.API_PRIORITY_OTHER;
        if (i10 != Integer.MAX_VALUE && i11 != Integer.MAX_VALUE) {
            for (int i14 = 0; i14 < k0Var.f25083a; i14++) {
                m1 b10 = k0Var.b(i14);
                int i15 = b10.f28190q;
                if (i15 > 0 && (i12 = b10.f28191r) > 0) {
                    Point D = D(z10, i10, i11, i15, i12);
                    int i16 = b10.f28190q;
                    int i17 = b10.f28191r;
                    int i18 = i16 * i17;
                    if (i16 >= ((int) (D.x * 0.98f)) && i17 >= ((int) (D.y * 0.98f)) && i18 < i13) {
                        i13 = i18;
                    }
                }
            }
        }
        return i13;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x000d, code lost:
        if ((r6 > r7) != (r4 > r5)) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static android.graphics.Point D(boolean r3, int r4, int r5, int r6, int r7) {
        /*
            if (r3 == 0) goto L10
            r3 = 1
            r0 = 0
            if (r6 <= r7) goto L8
            r1 = r3
            goto L9
        L8:
            r1 = r0
        L9:
            if (r4 <= r5) goto Lc
            goto Ld
        Lc:
            r3 = r0
        Ld:
            if (r1 == r3) goto L10
            goto L13
        L10:
            r2 = r5
            r5 = r4
            r4 = r2
        L13:
            int r3 = r6 * r4
            int r0 = r7 * r5
            if (r3 < r0) goto L23
            android.graphics.Point r3 = new android.graphics.Point
            int r4 = a5.p0.l(r0, r6)
            r3.<init>(r5, r4)
            return r3
        L23:
            android.graphics.Point r5 = new android.graphics.Point
            int r3 = a5.p0.l(r3, r7)
            r5.<init>(r3, r4)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: x4.m.D(boolean, int, int, int, int):android.graphics.Point");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int F(int i10, int i11) {
        return (i10 == 0 || i10 != i11) ? Integer.bitCount(i10 & i11) : Api.BaseClientBuilder.API_PRIORITY_OTHER;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int G(String str) {
        if (str == null) {
            return 0;
        }
        char c10 = 65535;
        switch (str.hashCode()) {
            case -1851077871:
                if (str.equals("video/dolby-vision")) {
                    c10 = 0;
                    break;
                }
                break;
            case -1662735862:
                if (str.equals(MimeTypes.VIDEO_AV1)) {
                    c10 = 1;
                    break;
                }
                break;
            case -1662541442:
                if (str.equals(MimeTypes.VIDEO_H265)) {
                    c10 = 2;
                    break;
                }
                break;
            case 1331836730:
                if (str.equals(MimeTypes.VIDEO_H264)) {
                    c10 = 3;
                    break;
                }
                break;
            case 1599127257:
                if (str.equals("video/x-vnd.on2.vp9")) {
                    c10 = 4;
                    break;
                }
                break;
        }
        switch (c10) {
            case 0:
                return 5;
            case 1:
                return 4;
            case 2:
                return 3;
            case 3:
                return 1;
            case 4:
                return 2;
            default:
                return 0;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean H(m1 m1Var) {
        boolean z10;
        f fVar;
        f fVar2;
        synchronized (this.f32609d) {
            z10 = !this.f32613h.M || this.f32612g || m1Var.f28198y <= 2 || (I(m1Var) && (p0.f482a < 32 || (fVar2 = this.f32614i) == null || !fVar2.e())) || (p0.f482a >= 32 && (fVar = this.f32614i) != null && fVar.e() && this.f32614i.c() && this.f32614i.d() && this.f32614i.a(this.f32615j, m1Var));
        }
        return z10;
    }

    private static boolean I(m1 m1Var) {
        String str = m1Var.f28185l;
        if (str == null) {
            return false;
        }
        str.hashCode();
        char c10 = 65535;
        switch (str.hashCode()) {
            case -2123537834:
                if (str.equals("audio/eac3-joc")) {
                    c10 = 0;
                    break;
                }
                break;
            case 187078296:
                if (str.equals("audio/ac3")) {
                    c10 = 1;
                    break;
                }
                break;
            case 187078297:
                if (str.equals("audio/ac4")) {
                    c10 = 2;
                    break;
                }
                break;
            case 1504578661:
                if (str.equals("audio/eac3")) {
                    c10 = 3;
                    break;
                }
                break;
        }
        switch (c10) {
            case 0:
            case 1:
            case 2:
            case 3:
                return true;
            default:
                return false;
        }
    }

    protected static boolean J(int i10, boolean z10) {
        int f10 = z2.f(i10);
        return f10 == 4 || (z10 && f10 == 3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ List K(d dVar, boolean z10, int i10, k0 k0Var, int[] iArr) {
        return b.f(i10, k0Var, dVar, iArr, z10, new x5.h() { // from class: x4.l
            @Override // x5.h
            public final boolean apply(Object obj) {
                boolean H;
                H = m.this.H((m1) obj);
                return H;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ List L(d dVar, String str, int i10, k0 k0Var, int[] iArr) {
        return g.f(i10, k0Var, dVar, iArr, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ List M(d dVar, int[] iArr, int i10, k0 k0Var, int[] iArr2) {
        return i.i(i10, k0Var, dVar, iArr2, iArr[i10]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ int N(Integer num, Integer num2) {
        if (num.intValue() == -1) {
            return num2.intValue() == -1 ? 0 : -1;
        } else if (num2.intValue() == -1) {
            return 1;
        } else {
            return num.intValue() - num2.intValue();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ int O(Integer num, Integer num2) {
        return 0;
    }

    private static void P(u.a aVar, int[][][] iArr, b3[] b3VarArr, s[] sVarArr) {
        boolean z10;
        boolean z11 = false;
        int i10 = -1;
        int i11 = -1;
        for (int i12 = 0; i12 < aVar.d(); i12++) {
            int e8 = aVar.e(i12);
            s sVar = sVarArr[i12];
            if ((e8 == 1 || e8 == 2) && sVar != null && S(iArr[i12], aVar.f(i12), sVar)) {
                if (e8 == 1) {
                    if (i11 != -1) {
                        z10 = false;
                        break;
                    }
                    i11 = i12;
                } else if (i10 != -1) {
                    z10 = false;
                    break;
                } else {
                    i10 = i12;
                }
            }
        }
        z10 = true;
        if (i11 != -1 && i10 != -1) {
            z11 = true;
        }
        if (z10 && z11) {
            b3 b3Var = new b3(true);
            b3VarArr[i11] = b3Var;
            b3VarArr[i10] = b3Var;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Q() {
        boolean z10;
        f fVar;
        synchronized (this.f32609d) {
            z10 = this.f32613h.M && !this.f32612g && p0.f482a >= 32 && (fVar = this.f32614i) != null && fVar.e();
        }
        if (z10) {
            c();
        }
    }

    protected static String R(String str) {
        if (TextUtils.isEmpty(str) || TextUtils.equals(str, "und")) {
            return null;
        }
        return str;
    }

    private static boolean S(int[][] iArr, m0 m0Var, s sVar) {
        if (sVar == null) {
            return false;
        }
        int c10 = m0Var.c(sVar.n());
        for (int i10 = 0; i10 < sVar.length(); i10++) {
            if (z2.h(iArr[c10][sVar.g(i10)]) != 32) {
                return false;
            }
        }
        return true;
    }

    private <T extends h<T>> Pair<s.a, Integer> X(int i10, u.a aVar, int[][][] iArr, h.a<T> aVar2, Comparator<List<T>> comparator) {
        int i11;
        RandomAccess randomAccess;
        u.a aVar3 = aVar;
        ArrayList arrayList = new ArrayList();
        int d10 = aVar.d();
        int i12 = 0;
        while (i12 < d10) {
            if (i10 == aVar3.e(i12)) {
                m0 f10 = aVar3.f(i12);
                for (int i13 = 0; i13 < f10.f25106a; i13++) {
                    k0 b10 = f10.b(i13);
                    List<T> a10 = aVar2.a(i12, b10, iArr[i12][i13]);
                    boolean[] zArr = new boolean[b10.f25083a];
                    int i14 = 0;
                    while (i14 < b10.f25083a) {
                        T t10 = a10.get(i14);
                        int a11 = t10.a();
                        if (zArr[i14] || a11 == 0) {
                            i11 = d10;
                        } else {
                            if (a11 == 1) {
                                randomAccess = y5.q.q(t10);
                                i11 = d10;
                            } else {
                                ArrayList arrayList2 = new ArrayList();
                                arrayList2.add(t10);
                                int i15 = i14 + 1;
                                while (i15 < b10.f25083a) {
                                    T t11 = a10.get(i15);
                                    int i16 = d10;
                                    if (t11.a() == 2 && t10.b(t11)) {
                                        arrayList2.add(t11);
                                        zArr[i15] = true;
                                    }
                                    i15++;
                                    d10 = i16;
                                }
                                i11 = d10;
                                randomAccess = arrayList2;
                            }
                            arrayList.add(randomAccess);
                        }
                        i14++;
                        d10 = i11;
                    }
                }
            }
            i12++;
            aVar3 = aVar;
            d10 = d10;
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        List list = (List) Collections.max(arrayList, comparator);
        int[] iArr2 = new int[list.size()];
        for (int i17 = 0; i17 < list.size(); i17++) {
            iArr2[i17] = ((h) list.get(i17)).f32658c;
        }
        h hVar = (h) list.get(0);
        return Pair.create(new s.a(hVar.f32657b, iArr2), Integer.valueOf(hVar.f32656a));
    }

    private void a0(d dVar) {
        boolean z10;
        a5.a.e(dVar);
        synchronized (this.f32609d) {
            z10 = !this.f32613h.equals(dVar);
            this.f32613h = dVar;
        }
        if (z10) {
            if (dVar.M && this.f32610e == null) {
                a5.t.i("DefaultTrackSelector", "Audio channel count constraints cannot be applied without reference to Context. Build the track selector instance with one of the non-deprecated constructors that take a Context argument.");
            }
            c();
        }
    }

    private static void x(u.a aVar, d dVar, s.a[] aVarArr) {
        int d10 = aVar.d();
        for (int i10 = 0; i10 < d10; i10++) {
            m0 f10 = aVar.f(i10);
            if (dVar.m(i10, f10)) {
                e l10 = dVar.l(i10, f10);
                aVarArr[i10] = (l10 == null || l10.f32638b.length == 0) ? null : new s.a(f10.b(l10.f32637a), l10.f32638b, l10.f32640d);
            }
        }
    }

    private static void y(u.a aVar, z zVar, s.a[] aVarArr) {
        int d10 = aVar.d();
        HashMap hashMap = new HashMap();
        for (int i10 = 0; i10 < d10; i10++) {
            A(aVar.f(i10), zVar, hashMap);
        }
        A(aVar.h(), zVar, hashMap);
        for (int i11 = 0; i11 < d10; i11++) {
            x xVar = (x) hashMap.get(Integer.valueOf(aVar.e(i11)));
            if (xVar != null) {
                aVarArr[i11] = (xVar.f32694b.isEmpty() || aVar.f(i11).c(xVar.f32693a) == -1) ? null : new s.a(xVar.f32693a, a6.b.k(xVar.f32694b));
            }
        }
    }

    public d E() {
        d dVar;
        synchronized (this.f32609d) {
            dVar = this.f32613h;
        }
        return dVar;
    }

    protected s.a[] T(u.a aVar, int[][][] iArr, int[] iArr2, d dVar) throws n3.q {
        String str;
        int d10 = aVar.d();
        s.a[] aVarArr = new s.a[d10];
        Pair<s.a, Integer> Y = Y(aVar, iArr, iArr2, dVar);
        if (Y != null) {
            aVarArr[((Integer) Y.second).intValue()] = (s.a) Y.first;
        }
        Pair<s.a, Integer> U = U(aVar, iArr, iArr2, dVar);
        if (U != null) {
            aVarArr[((Integer) U.second).intValue()] = (s.a) U.first;
        }
        if (U == null) {
            str = null;
        } else {
            Object obj = U.first;
            str = ((s.a) obj).f32678a.b(((s.a) obj).f32679b[0]).f28176c;
        }
        Pair<s.a, Integer> W = W(aVar, iArr, dVar, str);
        if (W != null) {
            aVarArr[((Integer) W.second).intValue()] = (s.a) W.first;
        }
        for (int i10 = 0; i10 < d10; i10++) {
            int e8 = aVar.e(i10);
            if (e8 != 2 && e8 != 1 && e8 != 3) {
                aVarArr[i10] = V(e8, aVar.f(i10), iArr[i10], dVar);
            }
        }
        return aVarArr;
    }

    protected Pair<s.a, Integer> U(u.a aVar, int[][][] iArr, int[] iArr2, final d dVar) throws n3.q {
        final boolean z10 = false;
        int i10 = 0;
        while (true) {
            if (i10 < aVar.d()) {
                if (2 == aVar.e(i10) && aVar.f(i10).f25106a > 0) {
                    z10 = true;
                    break;
                }
                i10++;
            } else {
                break;
            }
        }
        return X(1, aVar, iArr, new h.a() { // from class: x4.k
            @Override // x4.m.h.a
            public final List a(int i11, k0 k0Var, int[] iArr3) {
                List K;
                K = m.this.K(dVar, z10, i11, k0Var, iArr3);
                return K;
            }
        }, new Comparator() { // from class: x4.f
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return m.b.c((List) obj, (List) obj2);
            }
        });
    }

    protected s.a V(int i10, m0 m0Var, int[][] iArr, d dVar) throws n3.q {
        k0 k0Var = null;
        c cVar = null;
        int i11 = 0;
        for (int i12 = 0; i12 < m0Var.f25106a; i12++) {
            k0 b10 = m0Var.b(i12);
            int[] iArr2 = iArr[i12];
            for (int i13 = 0; i13 < b10.f25083a; i13++) {
                if (J(iArr2[i13], dVar.N)) {
                    c cVar2 = new c(b10.b(i13), iArr2[i13]);
                    if (cVar == null || cVar2.compareTo(cVar) > 0) {
                        k0Var = b10;
                        i11 = i13;
                        cVar = cVar2;
                    }
                }
            }
        }
        if (k0Var == null) {
            return null;
        }
        return new s.a(k0Var, i11);
    }

    protected Pair<s.a, Integer> W(u.a aVar, int[][][] iArr, final d dVar, final String str) throws n3.q {
        return X(3, aVar, iArr, new h.a() { // from class: x4.i
            @Override // x4.m.h.a
            public final List a(int i10, k0 k0Var, int[] iArr2) {
                List L;
                L = m.L(m.d.this, str, i10, k0Var, iArr2);
                return L;
            }
        }, new Comparator() { // from class: x4.g
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return m.g.c((List) obj, (List) obj2);
            }
        });
    }

    protected Pair<s.a, Integer> Y(u.a aVar, int[][][] iArr, final int[] iArr2, final d dVar) throws n3.q {
        return X(2, aVar, iArr, new h.a() { // from class: x4.j
            @Override // x4.m.h.a
            public final List a(int i10, k0 k0Var, int[] iArr3) {
                List M;
                M = m.M(m.d.this, iArr2, i10, k0Var, iArr3);
                return M;
            }
        }, new Comparator() { // from class: x4.h
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return m.i.h((List) obj, (List) obj2);
            }
        });
    }

    public void Z(z zVar) {
        if (zVar instanceof d) {
            a0((d) zVar);
        }
        a0(new d.a().d0(zVar).A());
    }

    @Override // x4.b0
    public boolean d() {
        return true;
    }

    @Override // x4.b0
    public void g(p3.e eVar) {
        boolean z10;
        synchronized (this.f32609d) {
            z10 = !this.f32615j.equals(eVar);
            this.f32615j = eVar;
        }
        if (z10) {
            Q();
        }
    }

    @Override // x4.u
    protected final Pair<b3[], s[]> k(u.a aVar, int[][][] iArr, int[] iArr2, t.b bVar, l3 l3Var) throws n3.q {
        d dVar;
        f fVar;
        synchronized (this.f32609d) {
            dVar = this.f32613h;
            if (dVar.M && p0.f482a >= 32 && (fVar = this.f32614i) != null) {
                fVar.b(this, (Looper) a5.a.h(Looper.myLooper()));
            }
        }
        int d10 = aVar.d();
        s.a[] T = T(aVar, iArr, iArr2, dVar);
        y(aVar, dVar, T);
        x(aVar, dVar, T);
        for (int i10 = 0; i10 < d10; i10++) {
            int e8 = aVar.e(i10);
            if (dVar.k(i10) || dVar.f32721z.contains(Integer.valueOf(e8))) {
                T[i10] = null;
            }
        }
        s[] a10 = this.f32611f.a(T, a(), bVar, l3Var);
        b3[] b3VarArr = new b3[d10];
        for (int i11 = 0; i11 < d10; i11++) {
            boolean z10 = true;
            if ((dVar.k(i11) || dVar.f32721z.contains(Integer.valueOf(aVar.e(i11)))) || (aVar.e(i11) != -2 && a10[i11] == null)) {
                z10 = false;
            }
            b3VarArr[i11] = z10 ? b3.f27896b : null;
        }
        if (dVar.O) {
            P(aVar, iArr, b3VarArr, a10);
        }
        return Pair.create(b3VarArr, a10);
    }

    public d.a z() {
        return E().i();
    }

    public m(Context context, s.b bVar) {
        this(context, d.j(context), bVar);
    }

    public m(Context context, z zVar, s.b bVar) {
        this(zVar, bVar, context);
    }

    private m(z zVar, s.b bVar, Context context) {
        this.f32609d = new Object();
        this.f32610e = context != null ? context.getApplicationContext() : null;
        this.f32611f = bVar;
        if (zVar instanceof d) {
            this.f32613h = (d) zVar;
        } else {
            this.f32613h = (context == null ? d.S : d.j(context)).i().d0(zVar).A();
        }
        this.f32615j = p3.e.f29649g;
        boolean z10 = context != null && p0.x0(context);
        this.f32612g = z10;
        if (!z10 && context != null && p0.f482a >= 32) {
            this.f32614i = f.f(context);
        }
        if (this.f32613h.M && context == null) {
            a5.t.i("DefaultTrackSelector", "Audio channel count constraints cannot be applied without reference to Context. Build the track selector instance with one of the non-deprecated constructors that take a Context argument.");
        }
    }
}
