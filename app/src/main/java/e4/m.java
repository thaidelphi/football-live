package e4;

import com.google.android.gms.common.api.Api;
import e4.g0;
import e4.t;
import java.util.HashMap;
import java.util.Map;
import n3.l3;
/* compiled from: LoopingMediaSource.java */
@Deprecated
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class m extends n0 {

    /* renamed from: m  reason: collision with root package name */
    private final int f25097m;

    /* renamed from: n  reason: collision with root package name */
    private final Map<t.b, t.b> f25098n;

    /* renamed from: o  reason: collision with root package name */
    private final Map<q, t.b> f25099o;

    /* compiled from: LoopingMediaSource.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    private static final class a extends k {
        public a(l3 l3Var) {
            super(l3Var);
        }

        @Override // e4.k, n3.l3
        public int i(int i10, int i11, boolean z10) {
            int i12 = this.f25081c.i(i10, i11, z10);
            return i12 == -1 ? e(z10) : i12;
        }

        @Override // e4.k, n3.l3
        public int p(int i10, int i11, boolean z10) {
            int p10 = this.f25081c.p(i10, i11, z10);
            return p10 == -1 ? g(z10) : p10;
        }
    }

    /* compiled from: LoopingMediaSource.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    private static final class b extends n3.a {

        /* renamed from: f  reason: collision with root package name */
        private final l3 f25100f;

        /* renamed from: g  reason: collision with root package name */
        private final int f25101g;

        /* renamed from: h  reason: collision with root package name */
        private final int f25102h;

        /* renamed from: i  reason: collision with root package name */
        private final int f25103i;

        public b(l3 l3Var, int i10) {
            super(false, new g0.b(i10));
            this.f25100f = l3Var;
            int m7 = l3Var.m();
            this.f25101g = m7;
            this.f25102h = l3Var.t();
            this.f25103i = i10;
            if (m7 > 0) {
                a5.a.g(i10 <= Api.BaseClientBuilder.API_PRIORITY_OTHER / m7, "LoopingMediaSource contains too many periods");
            }
        }

        @Override // n3.a
        protected Object C(int i10) {
            return Integer.valueOf(i10);
        }

        @Override // n3.a
        protected int E(int i10) {
            return i10 * this.f25101g;
        }

        @Override // n3.a
        protected int F(int i10) {
            return i10 * this.f25102h;
        }

        @Override // n3.a
        protected l3 I(int i10) {
            return this.f25100f;
        }

        @Override // n3.l3
        public int m() {
            return this.f25101g * this.f25103i;
        }

        @Override // n3.l3
        public int t() {
            return this.f25102h * this.f25103i;
        }

        @Override // n3.a
        protected int x(Object obj) {
            if (obj instanceof Integer) {
                return ((Integer) obj).intValue();
            }
            return -1;
        }

        @Override // n3.a
        protected int y(int i10) {
            return i10 / this.f25101g;
        }

        @Override // n3.a
        protected int z(int i10) {
            return i10 / this.f25102h;
        }
    }

    public m(t tVar) {
        this(tVar, Api.BaseClientBuilder.API_PRIORITY_OTHER);
    }

    @Override // e4.n0
    protected t.b L(t.b bVar) {
        return this.f25097m != Integer.MAX_VALUE ? this.f25098n.get(bVar) : bVar;
    }

    @Override // e4.n0
    protected void S(l3 l3Var) {
        l3 aVar;
        if (this.f25097m != Integer.MAX_VALUE) {
            aVar = new b(l3Var, this.f25097m);
        } else {
            aVar = new a(l3Var);
        }
        C(aVar);
    }

    @Override // e4.t
    public q d(t.b bVar, z4.b bVar2, long j10) {
        if (this.f25097m == Integer.MAX_VALUE) {
            return this.f25119k.d(bVar, bVar2, j10);
        }
        t.b c10 = bVar.c(n3.a.A(bVar.f25139a));
        this.f25098n.put(c10, bVar);
        q d10 = this.f25119k.d(c10, bVar2, j10);
        this.f25099o.put(d10, c10);
        return d10;
    }

    @Override // e4.t
    public void g(q qVar) {
        this.f25119k.g(qVar);
        t.b remove = this.f25099o.remove(qVar);
        if (remove != null) {
            this.f25098n.remove(remove);
        }
    }

    @Override // e4.n0, e4.a, e4.t
    public boolean l() {
        return false;
    }

    @Override // e4.n0, e4.a, e4.t
    public l3 o() {
        o oVar = (o) this.f25119k;
        if (this.f25097m != Integer.MAX_VALUE) {
            return new b(oVar.Y(), this.f25097m);
        }
        return new a(oVar.Y());
    }

    public m(t tVar, int i10) {
        super(new o(tVar, false));
        a5.a.a(i10 > 0);
        this.f25097m = i10;
        this.f25098n = new HashMap();
        this.f25099o = new HashMap();
    }
}
