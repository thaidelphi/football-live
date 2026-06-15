package r;

import java.util.ArrayList;
import r.d;
import r.i;
/* compiled from: ArrayRow.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class b implements d.a {

    /* renamed from: e  reason: collision with root package name */
    public a f30209e;

    /* renamed from: a  reason: collision with root package name */
    i f30205a = null;

    /* renamed from: b  reason: collision with root package name */
    float f30206b = 0.0f;

    /* renamed from: c  reason: collision with root package name */
    boolean f30207c = false;

    /* renamed from: d  reason: collision with root package name */
    ArrayList<i> f30208d = new ArrayList<>();

    /* renamed from: f  reason: collision with root package name */
    boolean f30210f = false;

    /* compiled from: ArrayRow.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public interface a {
        i a(int i10);

        void b();

        boolean c(i iVar);

        void clear();

        float d(b bVar, boolean z10);

        int e();

        float f(int i10);

        float g(i iVar);

        void h(i iVar, float f10);

        float i(i iVar, boolean z10);

        void j(i iVar, float f10, boolean z10);

        void k(float f10);
    }

    public b() {
    }

    private boolean u(i iVar, d dVar) {
        return iVar.f30267m <= 1;
    }

    private i w(boolean[] zArr, i iVar) {
        i.a aVar;
        int e8 = this.f30209e.e();
        i iVar2 = null;
        float f10 = 0.0f;
        for (int i10 = 0; i10 < e8; i10++) {
            float f11 = this.f30209e.f(i10);
            if (f11 < 0.0f) {
                i a10 = this.f30209e.a(i10);
                if ((zArr == null || !zArr[a10.f30257c]) && a10 != iVar && (((aVar = a10.f30264j) == i.a.SLACK || aVar == i.a.ERROR) && f11 < f10)) {
                    f10 = f11;
                    iVar2 = a10;
                }
            }
        }
        return iVar2;
    }

    public void A(d dVar, i iVar, boolean z10) {
        if (iVar.f30261g) {
            this.f30206b += iVar.f30260f * this.f30209e.g(iVar);
            this.f30209e.i(iVar, z10);
            if (z10) {
                iVar.c(this);
            }
            if (d.f30217t && this.f30209e.e() == 0) {
                this.f30210f = true;
                dVar.f30224a = true;
            }
        }
    }

    public void B(d dVar, b bVar, boolean z10) {
        this.f30206b += bVar.f30206b * this.f30209e.d(bVar, z10);
        if (z10) {
            bVar.f30205a.c(this);
        }
        if (d.f30217t && this.f30205a != null && this.f30209e.e() == 0) {
            this.f30210f = true;
            dVar.f30224a = true;
        }
    }

    public void C(d dVar, i iVar, boolean z10) {
        if (iVar.f30268n) {
            float g10 = this.f30209e.g(iVar);
            this.f30206b += iVar.f30270p * g10;
            this.f30209e.i(iVar, z10);
            if (z10) {
                iVar.c(this);
            }
            this.f30209e.j(dVar.f30237n.f30214d[iVar.f30269o], g10, z10);
            if (d.f30217t && this.f30209e.e() == 0) {
                this.f30210f = true;
                dVar.f30224a = true;
            }
        }
    }

    public void D(d dVar) {
        if (dVar.f30230g.length == 0) {
            return;
        }
        boolean z10 = false;
        while (!z10) {
            int e8 = this.f30209e.e();
            for (int i10 = 0; i10 < e8; i10++) {
                i a10 = this.f30209e.a(i10);
                if (a10.f30258d != -1 || a10.f30261g || a10.f30268n) {
                    this.f30208d.add(a10);
                }
            }
            int size = this.f30208d.size();
            if (size > 0) {
                for (int i11 = 0; i11 < size; i11++) {
                    i iVar = this.f30208d.get(i11);
                    if (iVar.f30261g) {
                        A(dVar, iVar, true);
                    } else if (iVar.f30268n) {
                        C(dVar, iVar, true);
                    } else {
                        B(dVar, dVar.f30230g[iVar.f30258d], true);
                    }
                }
                this.f30208d.clear();
            } else {
                z10 = true;
            }
        }
        if (d.f30217t && this.f30205a != null && this.f30209e.e() == 0) {
            this.f30210f = true;
            dVar.f30224a = true;
        }
    }

    @Override // r.d.a
    public void a(i iVar) {
        int i10 = iVar.f30259e;
        float f10 = 1.0f;
        if (i10 != 1) {
            if (i10 == 2) {
                f10 = 1000.0f;
            } else if (i10 == 3) {
                f10 = 1000000.0f;
            } else if (i10 == 4) {
                f10 = 1.0E9f;
            } else if (i10 == 5) {
                f10 = 1.0E12f;
            }
        }
        this.f30209e.h(iVar, f10);
    }

    @Override // r.d.a
    public i b(d dVar, boolean[] zArr) {
        return w(zArr, null);
    }

    @Override // r.d.a
    public void c(d.a aVar) {
        if (aVar instanceof b) {
            b bVar = (b) aVar;
            this.f30205a = null;
            this.f30209e.clear();
            for (int i10 = 0; i10 < bVar.f30209e.e(); i10++) {
                this.f30209e.j(bVar.f30209e.a(i10), bVar.f30209e.f(i10), true);
            }
        }
    }

    @Override // r.d.a
    public void clear() {
        this.f30209e.clear();
        this.f30205a = null;
        this.f30206b = 0.0f;
    }

    public b d(d dVar, int i10) {
        this.f30209e.h(dVar.o(i10, "ep"), 1.0f);
        this.f30209e.h(dVar.o(i10, "em"), -1.0f);
        return this;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public b e(i iVar, int i10) {
        this.f30209e.h(iVar, i10);
        return this;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean f(d dVar) {
        boolean z10;
        i g10 = g(dVar);
        if (g10 == null) {
            z10 = true;
        } else {
            x(g10);
            z10 = false;
        }
        if (this.f30209e.e() == 0) {
            this.f30210f = true;
        }
        return z10;
    }

    i g(d dVar) {
        boolean u10;
        boolean u11;
        int e8 = this.f30209e.e();
        i iVar = null;
        boolean z10 = false;
        boolean z11 = false;
        float f10 = 0.0f;
        float f11 = 0.0f;
        i iVar2 = null;
        for (int i10 = 0; i10 < e8; i10++) {
            float f12 = this.f30209e.f(i10);
            i a10 = this.f30209e.a(i10);
            if (a10.f30264j == i.a.UNRESTRICTED) {
                if (iVar == null) {
                    u11 = u(a10, dVar);
                } else if (f10 > f12) {
                    u11 = u(a10, dVar);
                } else if (!z10 && u(a10, dVar)) {
                    f10 = f12;
                    iVar = a10;
                    z10 = true;
                }
                z10 = u11;
                f10 = f12;
                iVar = a10;
            } else if (iVar == null && f12 < 0.0f) {
                if (iVar2 == null) {
                    u10 = u(a10, dVar);
                } else if (f11 > f12) {
                    u10 = u(a10, dVar);
                } else if (!z11 && u(a10, dVar)) {
                    f11 = f12;
                    iVar2 = a10;
                    z11 = true;
                }
                z11 = u10;
                f11 = f12;
                iVar2 = a10;
            }
        }
        return iVar != null ? iVar : iVar2;
    }

    @Override // r.d.a
    public i getKey() {
        return this.f30205a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public b h(i iVar, i iVar2, int i10, float f10, i iVar3, i iVar4, int i11) {
        if (iVar2 == iVar3) {
            this.f30209e.h(iVar, 1.0f);
            this.f30209e.h(iVar4, 1.0f);
            this.f30209e.h(iVar2, -2.0f);
            return this;
        }
        if (f10 == 0.5f) {
            this.f30209e.h(iVar, 1.0f);
            this.f30209e.h(iVar2, -1.0f);
            this.f30209e.h(iVar3, -1.0f);
            this.f30209e.h(iVar4, 1.0f);
            if (i10 > 0 || i11 > 0) {
                this.f30206b = (-i10) + i11;
            }
        } else if (f10 <= 0.0f) {
            this.f30209e.h(iVar, -1.0f);
            this.f30209e.h(iVar2, 1.0f);
            this.f30206b = i10;
        } else if (f10 >= 1.0f) {
            this.f30209e.h(iVar4, -1.0f);
            this.f30209e.h(iVar3, 1.0f);
            this.f30206b = -i11;
        } else {
            float f11 = 1.0f - f10;
            this.f30209e.h(iVar, f11 * 1.0f);
            this.f30209e.h(iVar2, f11 * (-1.0f));
            this.f30209e.h(iVar3, (-1.0f) * f10);
            this.f30209e.h(iVar4, 1.0f * f10);
            if (i10 > 0 || i11 > 0) {
                this.f30206b = ((-i10) * f11) + (i11 * f10);
            }
        }
        return this;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public b i(i iVar, int i10) {
        this.f30205a = iVar;
        float f10 = i10;
        iVar.f30260f = f10;
        this.f30206b = f10;
        this.f30210f = true;
        return this;
    }

    @Override // r.d.a
    public boolean isEmpty() {
        return this.f30205a == null && this.f30206b == 0.0f && this.f30209e.e() == 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public b j(i iVar, i iVar2, float f10) {
        this.f30209e.h(iVar, -1.0f);
        this.f30209e.h(iVar2, f10);
        return this;
    }

    public b k(i iVar, i iVar2, i iVar3, i iVar4, float f10) {
        this.f30209e.h(iVar, -1.0f);
        this.f30209e.h(iVar2, 1.0f);
        this.f30209e.h(iVar3, f10);
        this.f30209e.h(iVar4, -f10);
        return this;
    }

    public b l(float f10, float f11, float f12, i iVar, i iVar2, i iVar3, i iVar4) {
        this.f30206b = 0.0f;
        if (f11 == 0.0f || f10 == f12) {
            this.f30209e.h(iVar, 1.0f);
            this.f30209e.h(iVar2, -1.0f);
            this.f30209e.h(iVar4, 1.0f);
            this.f30209e.h(iVar3, -1.0f);
        } else if (f10 == 0.0f) {
            this.f30209e.h(iVar, 1.0f);
            this.f30209e.h(iVar2, -1.0f);
        } else if (f12 == 0.0f) {
            this.f30209e.h(iVar3, 1.0f);
            this.f30209e.h(iVar4, -1.0f);
        } else {
            float f13 = (f10 / f11) / (f12 / f11);
            this.f30209e.h(iVar, 1.0f);
            this.f30209e.h(iVar2, -1.0f);
            this.f30209e.h(iVar4, f13);
            this.f30209e.h(iVar3, -f13);
        }
        return this;
    }

    public b m(i iVar, int i10) {
        if (i10 < 0) {
            this.f30206b = i10 * (-1);
            this.f30209e.h(iVar, 1.0f);
        } else {
            this.f30206b = i10;
            this.f30209e.h(iVar, -1.0f);
        }
        return this;
    }

    public b n(i iVar, i iVar2, int i10) {
        boolean z10 = false;
        if (i10 != 0) {
            if (i10 < 0) {
                i10 *= -1;
                z10 = true;
            }
            this.f30206b = i10;
        }
        if (!z10) {
            this.f30209e.h(iVar, -1.0f);
            this.f30209e.h(iVar2, 1.0f);
        } else {
            this.f30209e.h(iVar, 1.0f);
            this.f30209e.h(iVar2, -1.0f);
        }
        return this;
    }

    public b o(i iVar, i iVar2, i iVar3, int i10) {
        boolean z10 = false;
        if (i10 != 0) {
            if (i10 < 0) {
                i10 *= -1;
                z10 = true;
            }
            this.f30206b = i10;
        }
        if (!z10) {
            this.f30209e.h(iVar, -1.0f);
            this.f30209e.h(iVar2, 1.0f);
            this.f30209e.h(iVar3, 1.0f);
        } else {
            this.f30209e.h(iVar, 1.0f);
            this.f30209e.h(iVar2, -1.0f);
            this.f30209e.h(iVar3, -1.0f);
        }
        return this;
    }

    public b p(i iVar, i iVar2, i iVar3, int i10) {
        boolean z10 = false;
        if (i10 != 0) {
            if (i10 < 0) {
                i10 *= -1;
                z10 = true;
            }
            this.f30206b = i10;
        }
        if (!z10) {
            this.f30209e.h(iVar, -1.0f);
            this.f30209e.h(iVar2, 1.0f);
            this.f30209e.h(iVar3, -1.0f);
        } else {
            this.f30209e.h(iVar, 1.0f);
            this.f30209e.h(iVar2, -1.0f);
            this.f30209e.h(iVar3, 1.0f);
        }
        return this;
    }

    public b q(i iVar, i iVar2, i iVar3, i iVar4, float f10) {
        this.f30209e.h(iVar3, 0.5f);
        this.f30209e.h(iVar4, 0.5f);
        this.f30209e.h(iVar, -0.5f);
        this.f30209e.h(iVar2, -0.5f);
        this.f30206b = -f10;
        return this;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void r() {
        float f10 = this.f30206b;
        if (f10 < 0.0f) {
            this.f30206b = f10 * (-1.0f);
            this.f30209e.b();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean s() {
        i iVar = this.f30205a;
        return iVar != null && (iVar.f30264j == i.a.UNRESTRICTED || this.f30206b >= 0.0f);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean t(i iVar) {
        return this.f30209e.c(iVar);
    }

    public String toString() {
        return z();
    }

    public i v(i iVar) {
        return w(null, iVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void x(i iVar) {
        i iVar2 = this.f30205a;
        if (iVar2 != null) {
            this.f30209e.h(iVar2, -1.0f);
            this.f30205a.f30258d = -1;
            this.f30205a = null;
        }
        float i10 = this.f30209e.i(iVar, true) * (-1.0f);
        this.f30205a = iVar;
        if (i10 == 1.0f) {
            return;
        }
        this.f30206b /= i10;
        this.f30209e.k(i10);
    }

    public void y() {
        this.f30205a = null;
        this.f30209e.clear();
        this.f30206b = 0.0f;
        this.f30210f = false;
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00cf  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    java.lang.String z() {
        /*
            Method dump skipped, instructions count: 255
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: r.b.z():java.lang.String");
    }

    public b(c cVar) {
        this.f30209e = new r.a(this, cVar);
    }
}
