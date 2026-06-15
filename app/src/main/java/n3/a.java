package n3;

import android.util.Pair;
import n3.l3;
/* compiled from: AbstractConcatenatedTimeline.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public abstract class a extends l3 {

    /* renamed from: c  reason: collision with root package name */
    private final int f27859c;

    /* renamed from: d  reason: collision with root package name */
    private final e4.g0 f27860d;

    /* renamed from: e  reason: collision with root package name */
    private final boolean f27861e;

    public a(boolean z10, e4.g0 g0Var) {
        this.f27861e = z10;
        this.f27860d = g0Var;
        this.f27859c = g0Var.a();
    }

    public static Object A(Object obj) {
        return ((Pair) obj).second;
    }

    public static Object B(Object obj) {
        return ((Pair) obj).first;
    }

    public static Object D(Object obj, Object obj2) {
        return Pair.create(obj, obj2);
    }

    private int G(int i10, boolean z10) {
        if (z10) {
            return this.f27860d.d(i10);
        }
        if (i10 < this.f27859c - 1) {
            return i10 + 1;
        }
        return -1;
    }

    private int H(int i10, boolean z10) {
        if (z10) {
            return this.f27860d.c(i10);
        }
        if (i10 > 0) {
            return i10 - 1;
        }
        return -1;
    }

    protected abstract Object C(int i10);

    protected abstract int E(int i10);

    protected abstract int F(int i10);

    protected abstract l3 I(int i10);

    @Override // n3.l3
    public int e(boolean z10) {
        if (this.f27859c == 0) {
            return -1;
        }
        if (this.f27861e) {
            z10 = false;
        }
        int g10 = z10 ? this.f27860d.g() : 0;
        while (I(g10).u()) {
            g10 = G(g10, z10);
            if (g10 == -1) {
                return -1;
            }
        }
        return F(g10) + I(g10).e(z10);
    }

    @Override // n3.l3
    public final int f(Object obj) {
        int f10;
        if (obj instanceof Pair) {
            Object B = B(obj);
            Object A = A(obj);
            int x10 = x(B);
            if (x10 == -1 || (f10 = I(x10).f(A)) == -1) {
                return -1;
            }
            return E(x10) + f10;
        }
        return -1;
    }

    @Override // n3.l3
    public int g(boolean z10) {
        int i10 = this.f27859c;
        if (i10 == 0) {
            return -1;
        }
        if (this.f27861e) {
            z10 = false;
        }
        int e8 = z10 ? this.f27860d.e() : i10 - 1;
        while (I(e8).u()) {
            e8 = H(e8, z10);
            if (e8 == -1) {
                return -1;
            }
        }
        return F(e8) + I(e8).g(z10);
    }

    @Override // n3.l3
    public int i(int i10, int i11, boolean z10) {
        if (this.f27861e) {
            if (i11 == 1) {
                i11 = 2;
            }
            z10 = false;
        }
        int z11 = z(i10);
        int F = F(z11);
        int i12 = I(z11).i(i10 - F, i11 != 2 ? i11 : 0, z10);
        if (i12 != -1) {
            return F + i12;
        }
        int G = G(z11, z10);
        while (G != -1 && I(G).u()) {
            G = G(G, z10);
        }
        if (G != -1) {
            return F(G) + I(G).e(z10);
        }
        if (i11 == 2) {
            return e(z10);
        }
        return -1;
    }

    @Override // n3.l3
    public final l3.b k(int i10, l3.b bVar, boolean z10) {
        int y10 = y(i10);
        int F = F(y10);
        I(y10).k(i10 - E(y10), bVar, z10);
        bVar.f28133c += F;
        if (z10) {
            bVar.f28132b = D(C(y10), a5.a.e(bVar.f28132b));
        }
        return bVar;
    }

    @Override // n3.l3
    public final l3.b l(Object obj, l3.b bVar) {
        Object B = B(obj);
        Object A = A(obj);
        int x10 = x(B);
        int F = F(x10);
        I(x10).l(A, bVar);
        bVar.f28133c += F;
        bVar.f28132b = obj;
        return bVar;
    }

    @Override // n3.l3
    public int p(int i10, int i11, boolean z10) {
        if (this.f27861e) {
            if (i11 == 1) {
                i11 = 2;
            }
            z10 = false;
        }
        int z11 = z(i10);
        int F = F(z11);
        int p10 = I(z11).p(i10 - F, i11 != 2 ? i11 : 0, z10);
        if (p10 != -1) {
            return F + p10;
        }
        int H = H(z11, z10);
        while (H != -1 && I(H).u()) {
            H = H(H, z10);
        }
        if (H != -1) {
            return F(H) + I(H).g(z10);
        }
        if (i11 == 2) {
            return g(z10);
        }
        return -1;
    }

    @Override // n3.l3
    public final Object q(int i10) {
        int y10 = y(i10);
        return D(C(y10), I(y10).q(i10 - E(y10)));
    }

    @Override // n3.l3
    public final l3.d s(int i10, l3.d dVar, long j10) {
        int z10 = z(i10);
        int F = F(z10);
        int E = E(z10);
        I(z10).s(i10 - F, dVar, j10);
        Object C = C(z10);
        if (!l3.d.f28142r.equals(dVar.f28146a)) {
            C = D(C, dVar.f28146a);
        }
        dVar.f28146a = C;
        dVar.f28160o += E;
        dVar.f28161p += E;
        return dVar;
    }

    protected abstract int x(Object obj);

    protected abstract int y(int i10);

    protected abstract int z(int i10);
}
