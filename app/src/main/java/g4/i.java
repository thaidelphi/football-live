package g4;

import a5.p0;
import com.google.android.exoplayer2.drm.k;
import e4.a0;
import e4.d0;
import e4.e0;
import e4.f0;
import g4.j;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import n3.d3;
import n3.m1;
import n3.n1;
import z4.i0;
import z4.j0;
/* compiled from: ChunkSampleStream.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class i<T extends j> implements e0, f0, j0.b<f>, j0.f {

    /* renamed from: a  reason: collision with root package name */
    public final int f25746a;

    /* renamed from: b  reason: collision with root package name */
    private final int[] f25747b;

    /* renamed from: c  reason: collision with root package name */
    private final m1[] f25748c;

    /* renamed from: d  reason: collision with root package name */
    private final boolean[] f25749d;

    /* renamed from: e  reason: collision with root package name */
    private final T f25750e;

    /* renamed from: f  reason: collision with root package name */
    private final f0.a<i<T>> f25751f;

    /* renamed from: g  reason: collision with root package name */
    private final a0.a f25752g;

    /* renamed from: h  reason: collision with root package name */
    private final i0 f25753h;

    /* renamed from: i  reason: collision with root package name */
    private final j0 f25754i;

    /* renamed from: j  reason: collision with root package name */
    private final h f25755j;

    /* renamed from: k  reason: collision with root package name */
    private final ArrayList<g4.a> f25756k;

    /* renamed from: l  reason: collision with root package name */
    private final List<g4.a> f25757l;

    /* renamed from: m  reason: collision with root package name */
    private final d0 f25758m;

    /* renamed from: n  reason: collision with root package name */
    private final d0[] f25759n;

    /* renamed from: o  reason: collision with root package name */
    private final c f25760o;

    /* renamed from: p  reason: collision with root package name */
    private f f25761p;

    /* renamed from: q  reason: collision with root package name */
    private m1 f25762q;

    /* renamed from: r  reason: collision with root package name */
    private b<T> f25763r;

    /* renamed from: s  reason: collision with root package name */
    private long f25764s;

    /* renamed from: t  reason: collision with root package name */
    private long f25765t;

    /* renamed from: u  reason: collision with root package name */
    private int f25766u;

    /* renamed from: v  reason: collision with root package name */
    private g4.a f25767v;

    /* renamed from: w  reason: collision with root package name */
    boolean f25768w;

    /* compiled from: ChunkSampleStream.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public final class a implements e0 {

        /* renamed from: a  reason: collision with root package name */
        public final i<T> f25769a;

        /* renamed from: b  reason: collision with root package name */
        private final d0 f25770b;

        /* renamed from: c  reason: collision with root package name */
        private final int f25771c;

        /* renamed from: d  reason: collision with root package name */
        private boolean f25772d;

        public a(i<T> iVar, d0 d0Var, int i10) {
            this.f25769a = iVar;
            this.f25770b = d0Var;
            this.f25771c = i10;
        }

        private void b() {
            if (this.f25772d) {
                return;
            }
            i.this.f25752g.i(i.this.f25747b[this.f25771c], i.this.f25748c[this.f25771c], 0, null, i.this.f25765t);
            this.f25772d = true;
        }

        @Override // e4.e0
        public void a() {
        }

        public void c() {
            a5.a.f(i.this.f25749d[this.f25771c]);
            i.this.f25749d[this.f25771c] = false;
        }

        @Override // e4.e0
        public int f(n1 n1Var, q3.g gVar, int i10) {
            if (i.this.H()) {
                return -3;
            }
            if (i.this.f25767v == null || i.this.f25767v.i(this.f25771c + 1) > this.f25770b.C()) {
                b();
                return this.f25770b.R(n1Var, gVar, i10, i.this.f25768w);
            }
            return -3;
        }

        @Override // e4.e0
        public boolean isReady() {
            return !i.this.H() && this.f25770b.J(i.this.f25768w);
        }

        @Override // e4.e0
        public int o(long j10) {
            if (i.this.H()) {
                return 0;
            }
            int E = this.f25770b.E(j10, i.this.f25768w);
            if (i.this.f25767v != null) {
                E = Math.min(E, i.this.f25767v.i(this.f25771c + 1) - this.f25770b.C());
            }
            this.f25770b.d0(E);
            if (E > 0) {
                b();
            }
            return E;
        }
    }

    /* compiled from: ChunkSampleStream.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public interface b<T extends j> {
        void m(i<T> iVar);
    }

    public i(int i10, int[] iArr, m1[] m1VarArr, T t10, f0.a<i<T>> aVar, z4.b bVar, long j10, com.google.android.exoplayer2.drm.l lVar, k.a aVar2, i0 i0Var, a0.a aVar3) {
        this.f25746a = i10;
        int i11 = 0;
        iArr = iArr == null ? new int[0] : iArr;
        this.f25747b = iArr;
        this.f25748c = m1VarArr == null ? new m1[0] : m1VarArr;
        this.f25750e = t10;
        this.f25751f = aVar;
        this.f25752g = aVar3;
        this.f25753h = i0Var;
        this.f25754i = new j0("ChunkSampleStream");
        this.f25755j = new h();
        ArrayList<g4.a> arrayList = new ArrayList<>();
        this.f25756k = arrayList;
        this.f25757l = Collections.unmodifiableList(arrayList);
        int length = iArr.length;
        this.f25759n = new d0[length];
        this.f25749d = new boolean[length];
        int i12 = length + 1;
        int[] iArr2 = new int[i12];
        d0[] d0VarArr = new d0[i12];
        d0 k10 = d0.k(bVar, lVar, aVar2);
        this.f25758m = k10;
        iArr2[0] = i10;
        d0VarArr[0] = k10;
        while (i11 < length) {
            d0 l10 = d0.l(bVar);
            this.f25759n[i11] = l10;
            int i13 = i11 + 1;
            d0VarArr[i13] = l10;
            iArr2[i13] = this.f25747b[i11];
            i11 = i13;
        }
        this.f25760o = new c(iArr2, d0VarArr);
        this.f25764s = j10;
        this.f25765t = j10;
    }

    private void A(int i10) {
        int min = Math.min(N(i10, 0), this.f25766u);
        if (min > 0) {
            p0.N0(this.f25756k, 0, min);
            this.f25766u -= min;
        }
    }

    private void B(int i10) {
        a5.a.f(!this.f25754i.j());
        int size = this.f25756k.size();
        while (true) {
            if (i10 >= size) {
                i10 = -1;
                break;
            } else if (!F(i10)) {
                break;
            } else {
                i10++;
            }
        }
        if (i10 == -1) {
            return;
        }
        long j10 = E().f25742h;
        g4.a C = C(i10);
        if (this.f25756k.isEmpty()) {
            this.f25764s = this.f25765t;
        }
        this.f25768w = false;
        this.f25752g.D(this.f25746a, C.f25741g, j10);
    }

    private g4.a C(int i10) {
        g4.a aVar = this.f25756k.get(i10);
        ArrayList<g4.a> arrayList = this.f25756k;
        p0.N0(arrayList, i10, arrayList.size());
        this.f25766u = Math.max(this.f25766u, this.f25756k.size());
        int i11 = 0;
        this.f25758m.u(aVar.i(0));
        while (true) {
            d0[] d0VarArr = this.f25759n;
            if (i11 >= d0VarArr.length) {
                return aVar;
            }
            d0 d0Var = d0VarArr[i11];
            i11++;
            d0Var.u(aVar.i(i11));
        }
    }

    private g4.a E() {
        ArrayList<g4.a> arrayList = this.f25756k;
        return arrayList.get(arrayList.size() - 1);
    }

    private boolean F(int i10) {
        int C;
        g4.a aVar = this.f25756k.get(i10);
        if (this.f25758m.C() > aVar.i(0)) {
            return true;
        }
        int i11 = 0;
        do {
            d0[] d0VarArr = this.f25759n;
            if (i11 >= d0VarArr.length) {
                return false;
            }
            C = d0VarArr[i11].C();
            i11++;
        } while (C <= aVar.i(i11));
        return true;
    }

    private boolean G(f fVar) {
        return fVar instanceof g4.a;
    }

    private void I() {
        int N = N(this.f25758m.C(), this.f25766u - 1);
        while (true) {
            int i10 = this.f25766u;
            if (i10 > N) {
                return;
            }
            this.f25766u = i10 + 1;
            J(i10);
        }
    }

    private void J(int i10) {
        g4.a aVar = this.f25756k.get(i10);
        m1 m1Var = aVar.f25738d;
        if (!m1Var.equals(this.f25762q)) {
            this.f25752g.i(this.f25746a, m1Var, aVar.f25739e, aVar.f25740f, aVar.f25741g);
        }
        this.f25762q = m1Var;
    }

    private int N(int i10, int i11) {
        do {
            i11++;
            if (i11 >= this.f25756k.size()) {
                return this.f25756k.size() - 1;
            }
        } while (this.f25756k.get(i11).i(0) <= i10);
        return i11 - 1;
    }

    private void Q() {
        this.f25758m.U();
        for (d0 d0Var : this.f25759n) {
            d0Var.U();
        }
    }

    public T D() {
        return this.f25750e;
    }

    boolean H() {
        return this.f25764s != -9223372036854775807L;
    }

    @Override // z4.j0.b
    /* renamed from: K */
    public void m(f fVar, long j10, long j11, boolean z10) {
        this.f25761p = null;
        this.f25767v = null;
        e4.l lVar = new e4.l(fVar.f25735a, fVar.f25736b, fVar.f(), fVar.e(), j10, j11, fVar.c());
        this.f25753h.c(fVar.f25735a);
        this.f25752g.r(lVar, fVar.f25737c, this.f25746a, fVar.f25738d, fVar.f25739e, fVar.f25740f, fVar.f25741g, fVar.f25742h);
        if (z10) {
            return;
        }
        if (H()) {
            Q();
        } else if (G(fVar)) {
            C(this.f25756k.size() - 1);
            if (this.f25756k.isEmpty()) {
                this.f25764s = this.f25765t;
            }
        }
        this.f25751f.f(this);
    }

    @Override // z4.j0.b
    /* renamed from: L */
    public void i(f fVar, long j10, long j11) {
        this.f25761p = null;
        this.f25750e.c(fVar);
        e4.l lVar = new e4.l(fVar.f25735a, fVar.f25736b, fVar.f(), fVar.e(), j10, j11, fVar.c());
        this.f25753h.c(fVar.f25735a);
        this.f25752g.u(lVar, fVar.f25737c, this.f25746a, fVar.f25738d, fVar.f25739e, fVar.f25740f, fVar.f25741g, fVar.f25742h);
        this.f25751f.f(this);
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00f1  */
    @Override // z4.j0.b
    /* renamed from: M */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public z4.j0.c s(g4.f r31, long r32, long r34, java.io.IOException r36, int r37) {
        /*
            Method dump skipped, instructions count: 257
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: g4.i.s(g4.f, long, long, java.io.IOException, int):z4.j0$c");
    }

    public void O() {
        P(null);
    }

    public void P(b<T> bVar) {
        this.f25763r = bVar;
        this.f25758m.Q();
        for (d0 d0Var : this.f25759n) {
            d0Var.Q();
        }
        this.f25754i.m(this);
    }

    public void R(long j10) {
        boolean Y;
        this.f25765t = j10;
        if (H()) {
            this.f25764s = j10;
            return;
        }
        g4.a aVar = null;
        int i10 = 0;
        int i11 = 0;
        while (true) {
            if (i11 >= this.f25756k.size()) {
                break;
            }
            g4.a aVar2 = this.f25756k.get(i11);
            int i12 = (aVar2.f25741g > j10 ? 1 : (aVar2.f25741g == j10 ? 0 : -1));
            if (i12 == 0 && aVar2.f25707k == -9223372036854775807L) {
                aVar = aVar2;
                break;
            } else if (i12 > 0) {
                break;
            } else {
                i11++;
            }
        }
        if (aVar != null) {
            Y = this.f25758m.X(aVar.i(0));
        } else {
            Y = this.f25758m.Y(j10, j10 < b());
        }
        if (Y) {
            this.f25766u = N(this.f25758m.C(), 0);
            d0[] d0VarArr = this.f25759n;
            int length = d0VarArr.length;
            while (i10 < length) {
                d0VarArr[i10].Y(j10, true);
                i10++;
            }
            return;
        }
        this.f25764s = j10;
        this.f25768w = false;
        this.f25756k.clear();
        this.f25766u = 0;
        if (this.f25754i.j()) {
            this.f25758m.r();
            d0[] d0VarArr2 = this.f25759n;
            int length2 = d0VarArr2.length;
            while (i10 < length2) {
                d0VarArr2[i10].r();
                i10++;
            }
            this.f25754i.f();
            return;
        }
        this.f25754i.g();
        Q();
    }

    public i<T>.a S(long j10, int i10) {
        for (int i11 = 0; i11 < this.f25759n.length; i11++) {
            if (this.f25747b[i11] == i10) {
                a5.a.f(!this.f25749d[i11]);
                this.f25749d[i11] = true;
                this.f25759n[i11].Y(j10, true);
                return new a(this, this.f25759n[i11], i11);
            }
        }
        throw new IllegalStateException();
    }

    @Override // e4.e0
    public void a() throws IOException {
        this.f25754i.a();
        this.f25758m.M();
        if (this.f25754i.j()) {
            return;
        }
        this.f25750e.a();
    }

    @Override // e4.f0
    public long b() {
        if (H()) {
            return this.f25764s;
        }
        if (this.f25768w) {
            return Long.MIN_VALUE;
        }
        return E().f25742h;
    }

    @Override // e4.f0
    public boolean c() {
        return this.f25754i.j();
    }

    @Override // e4.f0
    public boolean d(long j10) {
        List<g4.a> list;
        long j11;
        if (this.f25768w || this.f25754i.j() || this.f25754i.i()) {
            return false;
        }
        boolean H = H();
        if (H) {
            list = Collections.emptyList();
            j11 = this.f25764s;
        } else {
            list = this.f25757l;
            j11 = E().f25742h;
        }
        this.f25750e.j(j10, j11, list, this.f25755j);
        h hVar = this.f25755j;
        boolean z10 = hVar.f25745b;
        f fVar = hVar.f25744a;
        hVar.a();
        if (z10) {
            this.f25764s = -9223372036854775807L;
            this.f25768w = true;
            return true;
        } else if (fVar == null) {
            return false;
        } else {
            this.f25761p = fVar;
            if (G(fVar)) {
                g4.a aVar = (g4.a) fVar;
                if (H) {
                    long j12 = aVar.f25741g;
                    long j13 = this.f25764s;
                    if (j12 != j13) {
                        this.f25758m.a0(j13);
                        for (d0 d0Var : this.f25759n) {
                            d0Var.a0(this.f25764s);
                        }
                    }
                    this.f25764s = -9223372036854775807L;
                }
                aVar.k(this.f25760o);
                this.f25756k.add(aVar);
            } else if (fVar instanceof m) {
                ((m) fVar).g(this.f25760o);
            }
            this.f25752g.A(new e4.l(fVar.f25735a, fVar.f25736b, this.f25754i.n(fVar, this, this.f25753h.a(fVar.f25737c))), fVar.f25737c, this.f25746a, fVar.f25738d, fVar.f25739e, fVar.f25740f, fVar.f25741g, fVar.f25742h);
            return true;
        }
    }

    public long e(long j10, d3 d3Var) {
        return this.f25750e.e(j10, d3Var);
    }

    @Override // e4.e0
    public int f(n1 n1Var, q3.g gVar, int i10) {
        if (H()) {
            return -3;
        }
        g4.a aVar = this.f25767v;
        if (aVar == null || aVar.i(0) > this.f25758m.C()) {
            I();
            return this.f25758m.R(n1Var, gVar, i10, this.f25768w);
        }
        return -3;
    }

    @Override // e4.f0
    public long g() {
        if (this.f25768w) {
            return Long.MIN_VALUE;
        }
        if (H()) {
            return this.f25764s;
        }
        long j10 = this.f25765t;
        g4.a E = E();
        if (!E.h()) {
            if (this.f25756k.size() > 1) {
                ArrayList<g4.a> arrayList = this.f25756k;
                E = arrayList.get(arrayList.size() - 2);
            } else {
                E = null;
            }
        }
        if (E != null) {
            j10 = Math.max(j10, E.f25742h);
        }
        return Math.max(j10, this.f25758m.z());
    }

    @Override // e4.f0
    public void h(long j10) {
        if (this.f25754i.i() || H()) {
            return;
        }
        if (this.f25754i.j()) {
            f fVar = (f) a5.a.e(this.f25761p);
            if (!(G(fVar) && F(this.f25756k.size() - 1)) && this.f25750e.g(j10, fVar, this.f25757l)) {
                this.f25754i.f();
                if (G(fVar)) {
                    this.f25767v = (g4.a) fVar;
                    return;
                }
                return;
            }
            return;
        }
        int h10 = this.f25750e.h(j10, this.f25757l);
        if (h10 < this.f25756k.size()) {
            B(h10);
        }
    }

    @Override // e4.e0
    public boolean isReady() {
        return !H() && this.f25758m.J(this.f25768w);
    }

    @Override // z4.j0.f
    public void n() {
        this.f25758m.S();
        for (d0 d0Var : this.f25759n) {
            d0Var.S();
        }
        this.f25750e.release();
        b<T> bVar = this.f25763r;
        if (bVar != null) {
            bVar.m(this);
        }
    }

    @Override // e4.e0
    public int o(long j10) {
        if (H()) {
            return 0;
        }
        int E = this.f25758m.E(j10, this.f25768w);
        g4.a aVar = this.f25767v;
        if (aVar != null) {
            E = Math.min(E, aVar.i(0) - this.f25758m.C());
        }
        this.f25758m.d0(E);
        I();
        return E;
    }

    public void u(long j10, boolean z10) {
        if (H()) {
            return;
        }
        int x10 = this.f25758m.x();
        this.f25758m.q(j10, z10, true);
        int x11 = this.f25758m.x();
        if (x11 > x10) {
            long y10 = this.f25758m.y();
            int i10 = 0;
            while (true) {
                d0[] d0VarArr = this.f25759n;
                if (i10 >= d0VarArr.length) {
                    break;
                }
                d0VarArr[i10].q(y10, z10, this.f25749d[i10]);
                i10++;
            }
        }
        A(x11);
    }
}
