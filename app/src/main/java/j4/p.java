package j4;

import a5.c0;
import a5.p0;
import a5.x;
import android.net.Uri;
import android.os.Handler;
import android.util.SparseIntArray;
import com.google.android.exoplayer2.drm.DrmInitData;
import com.google.android.exoplayer2.drm.k;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.metadata.emsg.EventMessage;
import com.google.android.exoplayer2.metadata.id3.PrivFrame;
import e4.a0;
import e4.d0;
import e4.e0;
import e4.f0;
import e4.k0;
import e4.m0;
import j4.f;
import j4.p;
import java.io.EOFException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import n3.d3;
import n3.h2;
import n3.m1;
import n3.n1;
import s3.t;
import y5.q;
import z4.i0;
import z4.j0;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: HlsSampleStreamWrapper.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class p implements j0.b<g4.f>, j0.f, f0, s3.k, d0.d {
    private static final Set<Integer> Y = Collections.unmodifiableSet(new HashSet(Arrays.asList(1, 2, 5)));
    private int A;
    private int B;
    private boolean C;
    private boolean D;
    private int E;
    private m1 F;
    private m1 G;
    private boolean H;
    private m0 I;
    private Set<k0> J;
    private int[] K;
    private int L;
    private boolean M;
    private boolean[] N;
    private boolean[] O;
    private long P;
    private long Q;
    private boolean R;
    private boolean S;
    private boolean T;
    private boolean U;
    private long V;
    private DrmInitData W;
    private i X;

    /* renamed from: a  reason: collision with root package name */
    private final String f27029a;

    /* renamed from: b  reason: collision with root package name */
    private final int f27030b;

    /* renamed from: c  reason: collision with root package name */
    private final b f27031c;

    /* renamed from: d  reason: collision with root package name */
    private final f f27032d;

    /* renamed from: e  reason: collision with root package name */
    private final z4.b f27033e;

    /* renamed from: f  reason: collision with root package name */
    private final m1 f27034f;

    /* renamed from: g  reason: collision with root package name */
    private final com.google.android.exoplayer2.drm.l f27035g;

    /* renamed from: h  reason: collision with root package name */
    private final k.a f27036h;

    /* renamed from: i  reason: collision with root package name */
    private final i0 f27037i;

    /* renamed from: k  reason: collision with root package name */
    private final a0.a f27039k;

    /* renamed from: l  reason: collision with root package name */
    private final int f27040l;

    /* renamed from: n  reason: collision with root package name */
    private final ArrayList<i> f27042n;

    /* renamed from: o  reason: collision with root package name */
    private final List<i> f27043o;

    /* renamed from: p  reason: collision with root package name */
    private final Runnable f27044p;

    /* renamed from: q  reason: collision with root package name */
    private final Runnable f27045q;

    /* renamed from: r  reason: collision with root package name */
    private final Handler f27046r;

    /* renamed from: s  reason: collision with root package name */
    private final ArrayList<l> f27047s;

    /* renamed from: t  reason: collision with root package name */
    private final Map<String, DrmInitData> f27048t;

    /* renamed from: u  reason: collision with root package name */
    private g4.f f27049u;

    /* renamed from: v  reason: collision with root package name */
    private d[] f27050v;

    /* renamed from: x  reason: collision with root package name */
    private Set<Integer> f27052x;

    /* renamed from: y  reason: collision with root package name */
    private SparseIntArray f27053y;

    /* renamed from: z  reason: collision with root package name */
    private t f27054z;

    /* renamed from: j  reason: collision with root package name */
    private final j0 f27038j = new j0("Loader:HlsSampleStreamWrapper");

    /* renamed from: m  reason: collision with root package name */
    private final f.b f27041m = new f.b();

    /* renamed from: w  reason: collision with root package name */
    private int[] f27051w = new int[0];

    /* compiled from: HlsSampleStreamWrapper.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public interface b extends f0.a<p> {
        void i(Uri uri);

        void onPrepared();
    }

    /* compiled from: HlsSampleStreamWrapper.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    private static class c implements t {

        /* renamed from: g  reason: collision with root package name */
        private static final m1 f27055g = new m1.b().e0("application/id3").E();

        /* renamed from: h  reason: collision with root package name */
        private static final m1 f27056h = new m1.b().e0("application/x-emsg").E();

        /* renamed from: a  reason: collision with root package name */
        private final a4.a f27057a = new a4.a();

        /* renamed from: b  reason: collision with root package name */
        private final t f27058b;

        /* renamed from: c  reason: collision with root package name */
        private final m1 f27059c;

        /* renamed from: d  reason: collision with root package name */
        private m1 f27060d;

        /* renamed from: e  reason: collision with root package name */
        private byte[] f27061e;

        /* renamed from: f  reason: collision with root package name */
        private int f27062f;

        public c(t tVar, int i10) {
            this.f27058b = tVar;
            if (i10 == 1) {
                this.f27059c = f27055g;
            } else if (i10 == 3) {
                this.f27059c = f27056h;
            } else {
                throw new IllegalArgumentException("Unknown metadataType: " + i10);
            }
            this.f27061e = new byte[0];
            this.f27062f = 0;
        }

        private boolean g(EventMessage eventMessage) {
            m1 E = eventMessage.E();
            return E != null && p0.c(this.f27059c.f28185l, E.f28185l);
        }

        private void h(int i10) {
            byte[] bArr = this.f27061e;
            if (bArr.length < i10) {
                this.f27061e = Arrays.copyOf(bArr, i10 + (i10 / 2));
            }
        }

        private c0 i(int i10, int i11) {
            int i12 = this.f27062f - i11;
            c0 c0Var = new c0(Arrays.copyOfRange(this.f27061e, i12 - i10, i12));
            byte[] bArr = this.f27061e;
            System.arraycopy(bArr, i12, bArr, 0, i11);
            this.f27062f = i11;
            return c0Var;
        }

        @Override // s3.t
        public void a(m1 m1Var) {
            this.f27060d = m1Var;
            this.f27058b.a(this.f27059c);
        }

        @Override // s3.t
        public /* synthetic */ int b(z4.i iVar, int i10, boolean z10) {
            return s3.s.a(this, iVar, i10, z10);
        }

        @Override // s3.t
        public int c(z4.i iVar, int i10, boolean z10, int i11) throws IOException {
            h(this.f27062f + i10);
            int b10 = iVar.b(this.f27061e, this.f27062f, i10);
            if (b10 != -1) {
                this.f27062f += b10;
                return b10;
            } else if (z10) {
                return -1;
            } else {
                throw new EOFException();
            }
        }

        @Override // s3.t
        public /* synthetic */ void d(c0 c0Var, int i10) {
            s3.s.b(this, c0Var, i10);
        }

        @Override // s3.t
        public void e(long j10, int i10, int i11, int i12, t.a aVar) {
            a5.a.e(this.f27060d);
            c0 i13 = i(i11, i12);
            if (!p0.c(this.f27060d.f28185l, this.f27059c.f28185l)) {
                if ("application/x-emsg".equals(this.f27060d.f28185l)) {
                    EventMessage c10 = this.f27057a.c(i13);
                    if (!g(c10)) {
                        a5.t.i("HlsSampleStreamWrapper", String.format("Ignoring EMSG. Expected it to contain wrapped %s but actual wrapped format: %s", this.f27059c.f28185l, c10.E()));
                        return;
                    }
                    i13 = new c0((byte[]) a5.a.e(c10.R()));
                } else {
                    a5.t.i("HlsSampleStreamWrapper", "Ignoring sample for unsupported format: " + this.f27060d.f28185l);
                    return;
                }
            }
            int a10 = i13.a();
            this.f27058b.d(i13, a10);
            this.f27058b.e(j10, i10, a10, i12, aVar);
        }

        @Override // s3.t
        public void f(c0 c0Var, int i10, int i11) {
            h(this.f27062f + i10);
            c0Var.j(this.f27061e, this.f27062f, i10);
            this.f27062f += i10;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: HlsSampleStreamWrapper.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public static final class d extends d0 {
        private final Map<String, DrmInitData> H;
        private DrmInitData I;

        private Metadata g0(Metadata metadata) {
            if (metadata == null) {
                return null;
            }
            int e8 = metadata.e();
            int i10 = 0;
            int i11 = 0;
            while (true) {
                if (i11 >= e8) {
                    i11 = -1;
                    break;
                }
                Metadata.Entry d10 = metadata.d(i11);
                if ((d10 instanceof PrivFrame) && "com.apple.streaming.transportStreamTimestamp".equals(((PrivFrame) d10).f10606b)) {
                    break;
                }
                i11++;
            }
            if (i11 == -1) {
                return metadata;
            }
            if (e8 == 1) {
                return null;
            }
            Metadata.Entry[] entryArr = new Metadata.Entry[e8 - 1];
            while (i10 < e8) {
                if (i10 != i11) {
                    entryArr[i10 < i11 ? i10 : i10 - 1] = metadata.d(i10);
                }
                i10++;
            }
            return new Metadata(entryArr);
        }

        @Override // e4.d0, s3.t
        public void e(long j10, int i10, int i11, int i12, t.a aVar) {
            super.e(j10, i10, i11, i12, aVar);
        }

        public void h0(DrmInitData drmInitData) {
            this.I = drmInitData;
            I();
        }

        public void i0(i iVar) {
            e0(iVar.f26981k);
        }

        @Override // e4.d0
        public m1 w(m1 m1Var) {
            DrmInitData drmInitData;
            DrmInitData drmInitData2 = this.I;
            if (drmInitData2 == null) {
                drmInitData2 = m1Var.f28188o;
            }
            if (drmInitData2 != null && (drmInitData = this.H.get(drmInitData2.f10433c)) != null) {
                drmInitData2 = drmInitData;
            }
            Metadata g02 = g0(m1Var.f28183j);
            if (drmInitData2 != m1Var.f28188o || g02 != m1Var.f28183j) {
                m1Var = m1Var.b().M(drmInitData2).X(g02).E();
            }
            return super.w(m1Var);
        }

        private d(z4.b bVar, com.google.android.exoplayer2.drm.l lVar, k.a aVar, Map<String, DrmInitData> map) {
            super(bVar, lVar, aVar);
            this.H = map;
        }
    }

    public p(String str, int i10, b bVar, f fVar, Map<String, DrmInitData> map, z4.b bVar2, long j10, m1 m1Var, com.google.android.exoplayer2.drm.l lVar, k.a aVar, i0 i0Var, a0.a aVar2, int i11) {
        this.f27029a = str;
        this.f27030b = i10;
        this.f27031c = bVar;
        this.f27032d = fVar;
        this.f27048t = map;
        this.f27033e = bVar2;
        this.f27034f = m1Var;
        this.f27035g = lVar;
        this.f27036h = aVar;
        this.f27037i = i0Var;
        this.f27039k = aVar2;
        this.f27040l = i11;
        Set<Integer> set = Y;
        this.f27052x = new HashSet(set.size());
        this.f27053y = new SparseIntArray(set.size());
        this.f27050v = new d[0];
        this.O = new boolean[0];
        this.N = new boolean[0];
        ArrayList<i> arrayList = new ArrayList<>();
        this.f27042n = arrayList;
        this.f27043o = Collections.unmodifiableList(arrayList);
        this.f27047s = new ArrayList<>();
        this.f27044p = new Runnable() { // from class: j4.o
            @Override // java.lang.Runnable
            public final void run() {
                p.this.T();
            }
        };
        this.f27045q = new Runnable() { // from class: j4.n
            @Override // java.lang.Runnable
            public final void run() {
                p.this.c0();
            }
        };
        this.f27046r = p0.v();
        this.P = j10;
        this.Q = j10;
    }

    private boolean A(int i10) {
        for (int i11 = i10; i11 < this.f27042n.size(); i11++) {
            if (this.f27042n.get(i11).f26984n) {
                return false;
            }
        }
        i iVar = this.f27042n.get(i10);
        for (int i12 = 0; i12 < this.f27050v.length; i12++) {
            if (this.f27050v[i12].C() > iVar.m(i12)) {
                return false;
            }
        }
        return true;
    }

    private static s3.h C(int i10, int i11) {
        a5.t.i("HlsSampleStreamWrapper", "Unmapped track with id " + i10 + " of type " + i11);
        return new s3.h();
    }

    private d0 D(int i10, int i11) {
        int length = this.f27050v.length;
        boolean z10 = true;
        if (i11 != 1 && i11 != 2) {
            z10 = false;
        }
        d dVar = new d(this.f27033e, this.f27035g, this.f27036h, this.f27048t);
        dVar.a0(this.P);
        if (z10) {
            dVar.h0(this.W);
        }
        dVar.Z(this.V);
        i iVar = this.X;
        if (iVar != null) {
            dVar.i0(iVar);
        }
        dVar.c0(this);
        int i12 = length + 1;
        int[] copyOf = Arrays.copyOf(this.f27051w, i12);
        this.f27051w = copyOf;
        copyOf[length] = i10;
        this.f27050v = (d[]) p0.F0(this.f27050v, dVar);
        boolean[] copyOf2 = Arrays.copyOf(this.O, i12);
        this.O = copyOf2;
        copyOf2[length] = z10;
        this.M = copyOf2[length] | this.M;
        this.f27052x.add(Integer.valueOf(i11));
        this.f27053y.append(i11, length);
        if (M(i11) > M(this.A)) {
            this.B = length;
            this.A = i11;
        }
        this.N = Arrays.copyOf(this.N, i12);
        return dVar;
    }

    private m0 E(k0[] k0VarArr) {
        for (int i10 = 0; i10 < k0VarArr.length; i10++) {
            k0 k0Var = k0VarArr[i10];
            m1[] m1VarArr = new m1[k0Var.f25083a];
            for (int i11 = 0; i11 < k0Var.f25083a; i11++) {
                m1 b10 = k0Var.b(i11);
                m1VarArr[i11] = b10.c(this.f27035g.d(b10));
            }
            k0VarArr[i10] = new k0(k0Var.f25084b, m1VarArr);
        }
        return new m0(k0VarArr);
    }

    private static m1 F(m1 m1Var, m1 m1Var2, boolean z10) {
        String d10;
        String str;
        if (m1Var == null) {
            return m1Var2;
        }
        int k10 = x.k(m1Var2.f28185l);
        if (p0.J(m1Var.f28182i, k10) == 1) {
            d10 = p0.K(m1Var.f28182i, k10);
            str = x.g(d10);
        } else {
            d10 = x.d(m1Var.f28182i, m1Var2.f28185l);
            str = m1Var2.f28185l;
        }
        m1.b I = m1Var2.b().S(m1Var.f28174a).U(m1Var.f28175b).V(m1Var.f28176c).g0(m1Var.f28177d).c0(m1Var.f28178e).G(z10 ? m1Var.f28179f : -1).Z(z10 ? m1Var.f28180g : -1).I(d10);
        if (k10 == 2) {
            I.j0(m1Var.f28190q).Q(m1Var.f28191r).P(m1Var.f28192s);
        }
        if (str != null) {
            I.e0(str);
        }
        int i10 = m1Var.f28198y;
        if (i10 != -1 && k10 == 1) {
            I.H(i10);
        }
        Metadata metadata = m1Var.f28183j;
        if (metadata != null) {
            Metadata metadata2 = m1Var2.f28183j;
            if (metadata2 != null) {
                metadata = metadata2.b(metadata);
            }
            I.X(metadata);
        }
        return I.E();
    }

    private void G(int i10) {
        a5.a.f(!this.f27038j.j());
        while (true) {
            if (i10 >= this.f27042n.size()) {
                i10 = -1;
                break;
            } else if (A(i10)) {
                break;
            } else {
                i10++;
            }
        }
        if (i10 == -1) {
            return;
        }
        long j10 = K().f25742h;
        i H = H(i10);
        if (this.f27042n.isEmpty()) {
            this.Q = this.P;
        } else {
            ((i) y5.t.c(this.f27042n)).o();
        }
        this.T = false;
        this.f27039k.D(this.A, H.f25741g, j10);
    }

    private i H(int i10) {
        i iVar = this.f27042n.get(i10);
        ArrayList<i> arrayList = this.f27042n;
        p0.N0(arrayList, i10, arrayList.size());
        for (int i11 = 0; i11 < this.f27050v.length; i11++) {
            this.f27050v[i11].u(iVar.m(i11));
        }
        return iVar;
    }

    private boolean I(i iVar) {
        int i10 = iVar.f26981k;
        int length = this.f27050v.length;
        for (int i11 = 0; i11 < length; i11++) {
            if (this.N[i11] && this.f27050v[i11].P() == i10) {
                return false;
            }
        }
        return true;
    }

    private static boolean J(m1 m1Var, m1 m1Var2) {
        String str = m1Var.f28185l;
        String str2 = m1Var2.f28185l;
        int k10 = x.k(str);
        if (k10 != 3) {
            return k10 == x.k(str2);
        } else if (p0.c(str, str2)) {
            return !("application/cea-608".equals(str) || "application/cea-708".equals(str)) || m1Var.D == m1Var2.D;
        } else {
            return false;
        }
    }

    private i K() {
        ArrayList<i> arrayList = this.f27042n;
        return arrayList.get(arrayList.size() - 1);
    }

    private t L(int i10, int i11) {
        a5.a.a(Y.contains(Integer.valueOf(i11)));
        int i12 = this.f27053y.get(i11, -1);
        if (i12 == -1) {
            return null;
        }
        if (this.f27052x.add(Integer.valueOf(i11))) {
            this.f27051w[i12] = i10;
        }
        if (this.f27051w[i12] == i10) {
            return this.f27050v[i12];
        }
        return C(i10, i11);
    }

    private static int M(int i10) {
        if (i10 != 1) {
            if (i10 != 2) {
                return i10 != 3 ? 0 : 1;
            }
            return 3;
        }
        return 2;
    }

    private void N(i iVar) {
        d[] dVarArr;
        this.X = iVar;
        this.F = iVar.f25738d;
        this.Q = -9223372036854775807L;
        this.f27042n.add(iVar);
        q.a j10 = y5.q.j();
        for (d dVar : this.f27050v) {
            j10.a(Integer.valueOf(dVar.G()));
        }
        iVar.n(this, j10.h());
        for (d dVar2 : this.f27050v) {
            dVar2.i0(iVar);
            if (iVar.f26984n) {
                dVar2.f0();
            }
        }
    }

    private static boolean O(g4.f fVar) {
        return fVar instanceof i;
    }

    private boolean P() {
        return this.Q != -9223372036854775807L;
    }

    private void S() {
        int i10 = this.I.f25106a;
        int[] iArr = new int[i10];
        this.K = iArr;
        Arrays.fill(iArr, -1);
        for (int i11 = 0; i11 < i10; i11++) {
            int i12 = 0;
            while (true) {
                d[] dVarArr = this.f27050v;
                if (i12 >= dVarArr.length) {
                    break;
                } else if (J((m1) a5.a.h(dVarArr[i12].F()), this.I.b(i11).b(0))) {
                    this.K[i11] = i12;
                    break;
                } else {
                    i12++;
                }
            }
        }
        Iterator<l> it = this.f27047s.iterator();
        while (it.hasNext()) {
            it.next().b();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void T() {
        if (!this.H && this.K == null && this.C) {
            for (d dVar : this.f27050v) {
                if (dVar.F() == null) {
                    return;
                }
            }
            if (this.I != null) {
                S();
                return;
            }
            z();
            l0();
            this.f27031c.onPrepared();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c0() {
        this.C = true;
        T();
    }

    private void g0() {
        for (d dVar : this.f27050v) {
            dVar.V(this.R);
        }
        this.R = false;
    }

    private boolean h0(long j10) {
        int length = this.f27050v.length;
        for (int i10 = 0; i10 < length; i10++) {
            if (!this.f27050v[i10].Y(j10, false) && (this.O[i10] || !this.M)) {
                return false;
            }
        }
        return true;
    }

    private void l0() {
        this.D = true;
    }

    private void q0(e0[] e0VarArr) {
        this.f27047s.clear();
        for (e0 e0Var : e0VarArr) {
            if (e0Var != null) {
                this.f27047s.add((l) e0Var);
            }
        }
    }

    private void x() {
        a5.a.f(this.D);
        a5.a.e(this.I);
        a5.a.e(this.J);
    }

    private void z() {
        m1 F;
        m1 m1Var;
        int length = this.f27050v.length;
        int i10 = -2;
        int i11 = -1;
        int i12 = 0;
        while (true) {
            int i13 = 2;
            if (i12 >= length) {
                break;
            }
            String str = ((m1) a5.a.h(this.f27050v[i12].F())).f28185l;
            if (!x.s(str)) {
                if (x.o(str)) {
                    i13 = 1;
                } else {
                    i13 = x.r(str) ? 3 : -2;
                }
            }
            if (M(i13) > M(i10)) {
                i11 = i12;
                i10 = i13;
            } else if (i13 == i10 && i11 != -1) {
                i11 = -1;
            }
            i12++;
        }
        k0 j10 = this.f27032d.j();
        int i14 = j10.f25083a;
        this.L = -1;
        this.K = new int[length];
        for (int i15 = 0; i15 < length; i15++) {
            this.K[i15] = i15;
        }
        k0[] k0VarArr = new k0[length];
        int i16 = 0;
        while (i16 < length) {
            m1 m1Var2 = (m1) a5.a.h(this.f27050v[i16].F());
            if (i16 == i11) {
                m1[] m1VarArr = new m1[i14];
                for (int i17 = 0; i17 < i14; i17++) {
                    m1 b10 = j10.b(i17);
                    if (i10 == 1 && (m1Var = this.f27034f) != null) {
                        b10 = b10.j(m1Var);
                    }
                    if (i14 == 1) {
                        F = m1Var2.j(b10);
                    } else {
                        F = F(b10, m1Var2, true);
                    }
                    m1VarArr[i17] = F;
                }
                k0VarArr[i16] = new k0(this.f27029a, m1VarArr);
                this.L = i16;
            } else {
                m1 m1Var3 = (i10 == 2 && x.o(m1Var2.f28185l)) ? this.f27034f : null;
                StringBuilder sb = new StringBuilder();
                sb.append(this.f27029a);
                sb.append(":muxed:");
                sb.append(i16 < i11 ? i16 : i16 - 1);
                k0VarArr[i16] = new k0(sb.toString(), F(m1Var3, m1Var2, false));
            }
            i16++;
        }
        this.I = E(k0VarArr);
        a5.a.f(this.J == null);
        this.J = Collections.emptySet();
    }

    public void B() {
        if (this.D) {
            return;
        }
        d(this.P);
    }

    public boolean Q(int i10) {
        return !P() && this.f27050v[i10].J(this.T);
    }

    public boolean R() {
        return this.A == 2;
    }

    public void U() throws IOException {
        this.f27038j.a();
        this.f27032d.n();
    }

    public void V(int i10) throws IOException {
        U();
        this.f27050v[i10].M();
    }

    @Override // z4.j0.b
    /* renamed from: W */
    public void m(g4.f fVar, long j10, long j11, boolean z10) {
        this.f27049u = null;
        e4.l lVar = new e4.l(fVar.f25735a, fVar.f25736b, fVar.f(), fVar.e(), j10, j11, fVar.c());
        this.f27037i.c(fVar.f25735a);
        this.f27039k.r(lVar, fVar.f25737c, this.f27030b, fVar.f25738d, fVar.f25739e, fVar.f25740f, fVar.f25741g, fVar.f25742h);
        if (z10) {
            return;
        }
        if (P() || this.E == 0) {
            g0();
        }
        if (this.E > 0) {
            this.f27031c.f(this);
        }
    }

    @Override // z4.j0.b
    /* renamed from: X */
    public void i(g4.f fVar, long j10, long j11) {
        this.f27049u = null;
        this.f27032d.p(fVar);
        e4.l lVar = new e4.l(fVar.f25735a, fVar.f25736b, fVar.f(), fVar.e(), j10, j11, fVar.c());
        this.f27037i.c(fVar.f25735a);
        this.f27039k.u(lVar, fVar.f25737c, this.f27030b, fVar.f25738d, fVar.f25739e, fVar.f25740f, fVar.f25741g, fVar.f25742h);
        if (!this.D) {
            d(this.P);
        } else {
            this.f27031c.f(this);
        }
    }

    @Override // z4.j0.b
    /* renamed from: Y */
    public j0.c s(g4.f fVar, long j10, long j11, IOException iOException, int i10) {
        j0.c cVar;
        int i11;
        boolean O = O(fVar);
        if (O && !((i) fVar).q() && (iOException instanceof z4.e0) && ((i11 = ((z4.e0) iOException).f33485d) == 410 || i11 == 404)) {
            return j0.f33521d;
        }
        long c10 = fVar.c();
        e4.l lVar = new e4.l(fVar.f25735a, fVar.f25736b, fVar.f(), fVar.e(), j10, j11, c10);
        i0.c cVar2 = new i0.c(lVar, new e4.p(fVar.f25737c, this.f27030b, fVar.f25738d, fVar.f25739e, fVar.f25740f, p0.Z0(fVar.f25741g), p0.Z0(fVar.f25742h)), iOException, i10);
        i0.b d10 = this.f27037i.d(x4.a0.c(this.f27032d.k()), cVar2);
        boolean m7 = (d10 == null || d10.f33511a != 2) ? false : this.f27032d.m(fVar, d10.f33512b);
        if (m7) {
            if (O && c10 == 0) {
                ArrayList<i> arrayList = this.f27042n;
                a5.a.f(arrayList.remove(arrayList.size() - 1) == fVar);
                if (this.f27042n.isEmpty()) {
                    this.Q = this.P;
                } else {
                    ((i) y5.t.c(this.f27042n)).o();
                }
            }
            cVar = j0.f33523f;
        } else {
            long b10 = this.f27037i.b(cVar2);
            if (b10 != -9223372036854775807L) {
                cVar = j0.h(false, b10);
            } else {
                cVar = j0.f33524g;
            }
        }
        j0.c cVar3 = cVar;
        boolean z10 = !cVar3.c();
        this.f27039k.w(lVar, fVar.f25737c, this.f27030b, fVar.f25738d, fVar.f25739e, fVar.f25740f, fVar.f25741g, fVar.f25742h, iOException, z10);
        if (z10) {
            this.f27049u = null;
            this.f27037i.c(fVar.f25735a);
        }
        if (m7) {
            if (!this.D) {
                d(this.P);
            } else {
                this.f27031c.f(this);
            }
        }
        return cVar3;
    }

    public void Z() {
        this.f27052x.clear();
    }

    @Override // e4.d0.d
    public void a(m1 m1Var) {
        this.f27046r.post(this.f27044p);
    }

    public boolean a0(Uri uri, i0.c cVar, boolean z10) {
        i0.b d10;
        if (this.f27032d.o(uri)) {
            long j10 = (z10 || (d10 = this.f27037i.d(x4.a0.c(this.f27032d.k()), cVar)) == null || d10.f33511a != 2) ? -9223372036854775807L : d10.f33512b;
            return this.f27032d.q(uri, j10) && j10 != -9223372036854775807L;
        }
        return true;
    }

    @Override // e4.f0
    public long b() {
        if (P()) {
            return this.Q;
        }
        if (this.T) {
            return Long.MIN_VALUE;
        }
        return K().f25742h;
    }

    public void b0() {
        if (this.f27042n.isEmpty()) {
            return;
        }
        i iVar = (i) y5.t.c(this.f27042n);
        int c10 = this.f27032d.c(iVar);
        if (c10 == 1) {
            iVar.v();
        } else if (c10 == 2 && !this.T && this.f27038j.j()) {
            this.f27038j.f();
        }
    }

    @Override // e4.f0
    public boolean c() {
        return this.f27038j.j();
    }

    @Override // e4.f0
    public boolean d(long j10) {
        List<i> list;
        long max;
        if (this.T || this.f27038j.j() || this.f27038j.i()) {
            return false;
        }
        if (P()) {
            list = Collections.emptyList();
            max = this.Q;
            for (d dVar : this.f27050v) {
                dVar.a0(this.Q);
            }
        } else {
            list = this.f27043o;
            i K = K();
            if (K.h()) {
                max = K.f25742h;
            } else {
                max = Math.max(this.P, K.f25741g);
            }
        }
        List<i> list2 = list;
        long j11 = max;
        this.f27041m.a();
        this.f27032d.e(j10, j11, list2, this.D || !list2.isEmpty(), this.f27041m);
        f.b bVar = this.f27041m;
        boolean z10 = bVar.f26970b;
        g4.f fVar = bVar.f26969a;
        Uri uri = bVar.f26971c;
        if (z10) {
            this.Q = -9223372036854775807L;
            this.T = true;
            return true;
        } else if (fVar == null) {
            if (uri != null) {
                this.f27031c.i(uri);
            }
            return false;
        } else {
            if (O(fVar)) {
                N((i) fVar);
            }
            this.f27049u = fVar;
            this.f27039k.A(new e4.l(fVar.f25735a, fVar.f25736b, this.f27038j.n(fVar, this, this.f27037i.a(fVar.f25737c))), fVar.f25737c, this.f27030b, fVar.f25738d, fVar.f25739e, fVar.f25740f, fVar.f25741g, fVar.f25742h);
            return true;
        }
    }

    public void d0(k0[] k0VarArr, int i10, int... iArr) {
        this.I = E(k0VarArr);
        this.J = new HashSet();
        for (int i11 : iArr) {
            this.J.add(this.I.b(i11));
        }
        this.L = i10;
        Handler handler = this.f27046r;
        final b bVar = this.f27031c;
        Objects.requireNonNull(bVar);
        handler.post(new Runnable() { // from class: j4.m
            @Override // java.lang.Runnable
            public final void run() {
                p.b.this.onPrepared();
            }
        });
        l0();
    }

    public long e(long j10, d3 d3Var) {
        return this.f27032d.b(j10, d3Var);
    }

    public int e0(int i10, n1 n1Var, q3.g gVar, int i11) {
        m1 m1Var;
        if (P()) {
            return -3;
        }
        int i12 = 0;
        if (!this.f27042n.isEmpty()) {
            int i13 = 0;
            while (i13 < this.f27042n.size() - 1 && I(this.f27042n.get(i13))) {
                i13++;
            }
            p0.N0(this.f27042n, 0, i13);
            i iVar = this.f27042n.get(0);
            m1 m1Var2 = iVar.f25738d;
            if (!m1Var2.equals(this.G)) {
                this.f27039k.i(this.f27030b, m1Var2, iVar.f25739e, iVar.f25740f, iVar.f25741g);
            }
            this.G = m1Var2;
        }
        if (this.f27042n.isEmpty() || this.f27042n.get(0).q()) {
            int R = this.f27050v[i10].R(n1Var, gVar, i11, this.T);
            if (R == -5) {
                m1 m1Var3 = (m1) a5.a.e(n1Var.f28250b);
                if (i10 == this.B) {
                    int P = this.f27050v[i10].P();
                    while (i12 < this.f27042n.size() && this.f27042n.get(i12).f26981k != P) {
                        i12++;
                    }
                    if (i12 < this.f27042n.size()) {
                        m1Var = this.f27042n.get(i12).f25738d;
                    } else {
                        m1Var = (m1) a5.a.e(this.F);
                    }
                    m1Var3 = m1Var3.j(m1Var);
                }
                n1Var.f28250b = m1Var3;
            }
            return R;
        }
        return -3;
    }

    @Override // s3.k
    public t f(int i10, int i11) {
        t tVar;
        if (!Y.contains(Integer.valueOf(i11))) {
            int i12 = 0;
            while (true) {
                t[] tVarArr = this.f27050v;
                if (i12 >= tVarArr.length) {
                    tVar = null;
                    break;
                } else if (this.f27051w[i12] == i10) {
                    tVar = tVarArr[i12];
                    break;
                } else {
                    i12++;
                }
            }
        } else {
            tVar = L(i10, i11);
        }
        if (tVar == null) {
            if (this.U) {
                return C(i10, i11);
            }
            tVar = D(i10, i11);
        }
        if (i11 == 5) {
            if (this.f27054z == null) {
                this.f27054z = new c(tVar, this.f27040l);
            }
            return this.f27054z;
        }
        return tVar;
    }

    public void f0() {
        if (this.D) {
            for (d dVar : this.f27050v) {
                dVar.Q();
            }
        }
        this.f27038j.m(this);
        this.f27046r.removeCallbacksAndMessages(null);
        this.H = true;
        this.f27047s.clear();
    }

    @Override // e4.f0
    public long g() {
        ArrayList<i> arrayList;
        if (this.T) {
            return Long.MIN_VALUE;
        }
        if (P()) {
            return this.Q;
        }
        long j10 = this.P;
        i K = K();
        if (!K.h()) {
            K = this.f27042n.size() > 1 ? this.f27042n.get(arrayList.size() - 2) : null;
        }
        if (K != null) {
            j10 = Math.max(j10, K.f25742h);
        }
        if (this.C) {
            for (d dVar : this.f27050v) {
                j10 = Math.max(j10, dVar.z());
            }
        }
        return j10;
    }

    @Override // e4.f0
    public void h(long j10) {
        if (this.f27038j.i() || P()) {
            return;
        }
        if (this.f27038j.j()) {
            a5.a.e(this.f27049u);
            if (this.f27032d.v(j10, this.f27049u, this.f27043o)) {
                this.f27038j.f();
                return;
            }
            return;
        }
        int size = this.f27043o.size();
        while (size > 0 && this.f27032d.c(this.f27043o.get(size - 1)) == 2) {
            size--;
        }
        if (size < this.f27043o.size()) {
            G(size);
        }
        int h10 = this.f27032d.h(j10, this.f27043o);
        if (h10 < this.f27042n.size()) {
            G(h10);
        }
    }

    public boolean i0(long j10, boolean z10) {
        this.P = j10;
        if (P()) {
            this.Q = j10;
            return true;
        }
        if (this.C && !z10 && h0(j10)) {
            return false;
        }
        this.Q = j10;
        this.T = false;
        this.f27042n.clear();
        if (this.f27038j.j()) {
            if (this.C) {
                for (d dVar : this.f27050v) {
                    dVar.r();
                }
            }
            this.f27038j.f();
        } else {
            this.f27038j.g();
            g0();
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:72:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0131  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean j0(x4.s[] r20, boolean[] r21, e4.e0[] r22, boolean[] r23, long r24, boolean r26) {
        /*
            Method dump skipped, instructions count: 326
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: j4.p.j0(x4.s[], boolean[], e4.e0[], boolean[], long, boolean):boolean");
    }

    public void k0(DrmInitData drmInitData) {
        if (p0.c(this.W, drmInitData)) {
            return;
        }
        this.W = drmInitData;
        int i10 = 0;
        while (true) {
            d[] dVarArr = this.f27050v;
            if (i10 >= dVarArr.length) {
                return;
            }
            if (this.O[i10]) {
                dVarArr[i10].h0(drmInitData);
            }
            i10++;
        }
    }

    public void m0(boolean z10) {
        this.f27032d.t(z10);
    }

    @Override // z4.j0.f
    public void n() {
        for (d dVar : this.f27050v) {
            dVar.S();
        }
    }

    public void n0(long j10) {
        if (this.V != j10) {
            this.V = j10;
            for (d dVar : this.f27050v) {
                dVar.Z(j10);
            }
        }
    }

    @Override // s3.k
    public void o(s3.q qVar) {
    }

    public int o0(int i10, long j10) {
        if (P()) {
            return 0;
        }
        d dVar = this.f27050v[i10];
        int E = dVar.E(j10, this.T);
        i iVar = (i) y5.t.d(this.f27042n, null);
        if (iVar != null && !iVar.q()) {
            E = Math.min(E, iVar.m(i10) - dVar.C());
        }
        dVar.d0(E);
        return E;
    }

    public void p() throws IOException {
        U();
        if (this.T && !this.D) {
            throw h2.a("Loading finished before preparation is complete.", null);
        }
    }

    public void p0(int i10) {
        x();
        a5.a.e(this.K);
        int i11 = this.K[i10];
        a5.a.f(this.N[i11]);
        this.N[i11] = false;
    }

    @Override // s3.k
    public void q() {
        this.U = true;
        this.f27046r.post(this.f27045q);
    }

    public m0 t() {
        x();
        return this.I;
    }

    public void u(long j10, boolean z10) {
        if (!this.C || P()) {
            return;
        }
        int length = this.f27050v.length;
        for (int i10 = 0; i10 < length; i10++) {
            this.f27050v[i10].q(j10, z10, this.N[i10]);
        }
    }

    public int y(int i10) {
        x();
        a5.a.e(this.K);
        int i11 = this.K[i10];
        if (i11 == -1) {
            return this.J.contains(this.I.b(i10)) ? -3 : -2;
        }
        boolean[] zArr = this.N;
        if (zArr[i11]) {
            return -2;
        }
        zArr[i11] = true;
        return i11;
    }
}
