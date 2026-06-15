package g4;

import a5.c0;
import a5.p0;
import a5.x;
import android.util.SparseArray;
import g4.g;
import java.io.IOException;
import java.util.List;
import n3.m1;
import o3.q1;
import s3.q;
import s3.s;
import s3.t;
/* compiled from: BundledChunkExtractor.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class e implements s3.k, g {

    /* renamed from: j  reason: collision with root package name */
    public static final g.a f25717j = new g.a() { // from class: g4.d
        @Override // g4.g.a
        public final g a(int i10, m1 m1Var, boolean z10, List list, t tVar, q1 q1Var) {
            g g10;
            g10 = e.g(i10, m1Var, z10, list, tVar, q1Var);
            return g10;
        }
    };

    /* renamed from: k  reason: collision with root package name */
    private static final s3.p f25718k = new s3.p();

    /* renamed from: a  reason: collision with root package name */
    private final s3.i f25719a;

    /* renamed from: b  reason: collision with root package name */
    private final int f25720b;

    /* renamed from: c  reason: collision with root package name */
    private final m1 f25721c;

    /* renamed from: d  reason: collision with root package name */
    private final SparseArray<a> f25722d = new SparseArray<>();

    /* renamed from: e  reason: collision with root package name */
    private boolean f25723e;

    /* renamed from: f  reason: collision with root package name */
    private g.b f25724f;

    /* renamed from: g  reason: collision with root package name */
    private long f25725g;

    /* renamed from: h  reason: collision with root package name */
    private q f25726h;

    /* renamed from: i  reason: collision with root package name */
    private m1[] f25727i;

    /* compiled from: BundledChunkExtractor.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    private static final class a implements t {

        /* renamed from: a  reason: collision with root package name */
        private final int f25728a;

        /* renamed from: b  reason: collision with root package name */
        private final int f25729b;

        /* renamed from: c  reason: collision with root package name */
        private final m1 f25730c;

        /* renamed from: d  reason: collision with root package name */
        private final s3.h f25731d = new s3.h();

        /* renamed from: e  reason: collision with root package name */
        public m1 f25732e;

        /* renamed from: f  reason: collision with root package name */
        private t f25733f;

        /* renamed from: g  reason: collision with root package name */
        private long f25734g;

        public a(int i10, int i11, m1 m1Var) {
            this.f25728a = i10;
            this.f25729b = i11;
            this.f25730c = m1Var;
        }

        @Override // s3.t
        public void a(m1 m1Var) {
            m1 m1Var2 = this.f25730c;
            if (m1Var2 != null) {
                m1Var = m1Var.j(m1Var2);
            }
            this.f25732e = m1Var;
            ((t) p0.j(this.f25733f)).a(this.f25732e);
        }

        @Override // s3.t
        public /* synthetic */ int b(z4.i iVar, int i10, boolean z10) {
            return s.a(this, iVar, i10, z10);
        }

        @Override // s3.t
        public int c(z4.i iVar, int i10, boolean z10, int i11) throws IOException {
            return ((t) p0.j(this.f25733f)).b(iVar, i10, z10);
        }

        @Override // s3.t
        public /* synthetic */ void d(c0 c0Var, int i10) {
            s.b(this, c0Var, i10);
        }

        @Override // s3.t
        public void e(long j10, int i10, int i11, int i12, t.a aVar) {
            long j11 = this.f25734g;
            if (j11 != -9223372036854775807L && j10 >= j11) {
                this.f25733f = this.f25731d;
            }
            ((t) p0.j(this.f25733f)).e(j10, i10, i11, i12, aVar);
        }

        @Override // s3.t
        public void f(c0 c0Var, int i10, int i11) {
            ((t) p0.j(this.f25733f)).d(c0Var, i10);
        }

        public void g(g.b bVar, long j10) {
            if (bVar == null) {
                this.f25733f = this.f25731d;
                return;
            }
            this.f25734g = j10;
            t f10 = bVar.f(this.f25728a, this.f25729b);
            this.f25733f = f10;
            m1 m1Var = this.f25732e;
            if (m1Var != null) {
                f10.a(m1Var);
            }
        }
    }

    public e(s3.i iVar, int i10, m1 m1Var) {
        this.f25719a = iVar;
        this.f25720b = i10;
        this.f25721c = m1Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ g g(int i10, m1 m1Var, boolean z10, List list, t tVar, q1 q1Var) {
        s3.i fVar;
        String str = m1Var.f28184k;
        if (x.r(str)) {
            return null;
        }
        if (x.q(str)) {
            fVar = new t3.e(1);
        } else {
            fVar = new v3.f(z10 ? 4 : 0, null, null, list, tVar);
        }
        return new e(fVar, i10, m1Var);
    }

    @Override // g4.g
    public boolean a(s3.j jVar) throws IOException {
        int a10 = this.f25719a.a(jVar, f25718k);
        a5.a.f(a10 != 1);
        return a10 == 0;
    }

    @Override // g4.g
    public void b(g.b bVar, long j10, long j11) {
        this.f25724f = bVar;
        this.f25725g = j11;
        if (!this.f25723e) {
            this.f25719a.b(this);
            if (j10 != -9223372036854775807L) {
                this.f25719a.d(0L, j10);
            }
            this.f25723e = true;
            return;
        }
        s3.i iVar = this.f25719a;
        if (j10 == -9223372036854775807L) {
            j10 = 0;
        }
        iVar.d(0L, j10);
        for (int i10 = 0; i10 < this.f25722d.size(); i10++) {
            this.f25722d.valueAt(i10).g(bVar, j11);
        }
    }

    @Override // g4.g
    public s3.c c() {
        q qVar = this.f25726h;
        if (qVar instanceof s3.c) {
            return (s3.c) qVar;
        }
        return null;
    }

    @Override // g4.g
    public m1[] d() {
        return this.f25727i;
    }

    @Override // s3.k
    public t f(int i10, int i11) {
        a aVar = this.f25722d.get(i10);
        if (aVar == null) {
            a5.a.f(this.f25727i == null);
            aVar = new a(i10, i11, i11 == this.f25720b ? this.f25721c : null);
            aVar.g(this.f25724f, this.f25725g);
            this.f25722d.put(i10, aVar);
        }
        return aVar;
    }

    @Override // s3.k
    public void o(q qVar) {
        this.f25726h = qVar;
    }

    @Override // s3.k
    public void q() {
        m1[] m1VarArr = new m1[this.f25722d.size()];
        for (int i10 = 0; i10 < this.f25722d.size(); i10++) {
            m1VarArr[i10] = (m1) a5.a.h(this.f25722d.valueAt(i10).f25732e);
        }
        this.f25727i = m1VarArr;
    }

    @Override // g4.g
    public void release() {
        this.f25719a.release();
    }
}
