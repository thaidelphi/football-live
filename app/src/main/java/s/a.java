package s;

import s.d;
import s.e;
/* compiled from: Barrier.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class a extends i {
    private int F0 = 0;
    private boolean G0 = true;
    private int H0 = 0;
    boolean I0 = false;

    public boolean c1() {
        int i10;
        int i11;
        int i12;
        int i13 = 0;
        boolean z10 = true;
        while (true) {
            i10 = this.E0;
            if (i13 >= i10) {
                break;
            }
            e eVar = this.D0[i13];
            if ((this.G0 || eVar.h()) && ((((i11 = this.F0) == 0 || i11 == 1) && !eVar.e0()) || (((i12 = this.F0) == 2 || i12 == 3) && !eVar.f0()))) {
                z10 = false;
            }
            i13++;
        }
        if (!z10 || i10 <= 0) {
            return false;
        }
        int i14 = 0;
        boolean z11 = false;
        for (int i15 = 0; i15 < this.E0; i15++) {
            e eVar2 = this.D0[i15];
            if (this.G0 || eVar2.h()) {
                if (!z11) {
                    int i16 = this.F0;
                    if (i16 == 0) {
                        i14 = eVar2.m(d.b.LEFT).d();
                    } else if (i16 == 1) {
                        i14 = eVar2.m(d.b.RIGHT).d();
                    } else if (i16 == 2) {
                        i14 = eVar2.m(d.b.TOP).d();
                    } else if (i16 == 3) {
                        i14 = eVar2.m(d.b.BOTTOM).d();
                    }
                    z11 = true;
                }
                int i17 = this.F0;
                if (i17 == 0) {
                    i14 = Math.min(i14, eVar2.m(d.b.LEFT).d());
                } else if (i17 == 1) {
                    i14 = Math.max(i14, eVar2.m(d.b.RIGHT).d());
                } else if (i17 == 2) {
                    i14 = Math.min(i14, eVar2.m(d.b.TOP).d());
                } else if (i17 == 3) {
                    i14 = Math.max(i14, eVar2.m(d.b.BOTTOM).d());
                }
            }
        }
        int i18 = i14 + this.H0;
        int i19 = this.F0;
        if (i19 != 0 && i19 != 1) {
            s0(i18, i18);
        } else {
            p0(i18, i18);
        }
        this.I0 = true;
        return true;
    }

    public boolean d1() {
        return this.G0;
    }

    @Override // s.e
    public boolean e0() {
        return this.I0;
    }

    public int e1() {
        return this.F0;
    }

    @Override // s.e
    public boolean f0() {
        return this.I0;
    }

    public int f1() {
        return this.H0;
    }

    @Override // s.e
    public void g(r.d dVar, boolean z10) {
        Object[] objArr;
        boolean z11;
        int i10;
        int i11;
        int i12;
        d[] dVarArr = this.P;
        dVarArr[0] = this.H;
        dVarArr[2] = this.I;
        dVarArr[1] = this.J;
        dVarArr[3] = this.K;
        int i13 = 0;
        while (true) {
            objArr = this.P;
            if (i13 >= objArr.length) {
                break;
            }
            objArr[i13].f30515i = dVar.q(objArr[i13]);
            i13++;
        }
        int i14 = this.F0;
        if (i14 < 0 || i14 >= 4) {
            return;
        }
        d dVar2 = objArr[i14];
        if (!this.I0) {
            c1();
        }
        if (this.I0) {
            this.I0 = false;
            int i15 = this.F0;
            if (i15 == 0 || i15 == 1) {
                dVar.f(this.H.f30515i, this.Y);
                dVar.f(this.J.f30515i, this.Y);
                return;
            } else if (i15 == 2 || i15 == 3) {
                dVar.f(this.I.f30515i, this.Z);
                dVar.f(this.K.f30515i, this.Z);
                return;
            } else {
                return;
            }
        }
        for (int i16 = 0; i16 < this.E0; i16++) {
            e eVar = this.D0[i16];
            if ((this.G0 || eVar.h()) && ((((i11 = this.F0) == 0 || i11 == 1) && eVar.y() == e.b.MATCH_CONSTRAINT && eVar.H.f30512f != null && eVar.J.f30512f != null) || (((i12 = this.F0) == 2 || i12 == 3) && eVar.O() == e.b.MATCH_CONSTRAINT && eVar.I.f30512f != null && eVar.K.f30512f != null))) {
                z11 = true;
                break;
            }
        }
        z11 = false;
        boolean z12 = this.H.k() || this.J.k();
        boolean z13 = this.I.k() || this.K.k();
        int i17 = !z11 && (((i10 = this.F0) == 0 && z12) || ((i10 == 2 && z13) || ((i10 == 1 && z12) || (i10 == 3 && z13)))) ? 5 : 4;
        for (int i18 = 0; i18 < this.E0; i18++) {
            e eVar2 = this.D0[i18];
            if (this.G0 || eVar2.h()) {
                r.i q10 = dVar.q(eVar2.P[this.F0]);
                d[] dVarArr2 = eVar2.P;
                int i19 = this.F0;
                dVarArr2[i19].f30515i = q10;
                int i20 = (dVarArr2[i19].f30512f == null || dVarArr2[i19].f30512f.f30510d != this) ? 0 : dVarArr2[i19].f30513g + 0;
                if (i19 != 0 && i19 != 2) {
                    dVar.g(dVar2.f30515i, q10, this.H0 + i20, z11);
                } else {
                    dVar.i(dVar2.f30515i, q10, this.H0 - i20, z11);
                }
                dVar.e(dVar2.f30515i, q10, this.H0 + i20, i17);
            }
        }
        int i21 = this.F0;
        if (i21 == 0) {
            dVar.e(this.J.f30515i, this.H.f30515i, 0, 8);
            dVar.e(this.H.f30515i, this.T.J.f30515i, 0, 4);
            dVar.e(this.H.f30515i, this.T.H.f30515i, 0, 0);
        } else if (i21 == 1) {
            dVar.e(this.H.f30515i, this.J.f30515i, 0, 8);
            dVar.e(this.H.f30515i, this.T.H.f30515i, 0, 4);
            dVar.e(this.H.f30515i, this.T.J.f30515i, 0, 0);
        } else if (i21 == 2) {
            dVar.e(this.K.f30515i, this.I.f30515i, 0, 8);
            dVar.e(this.I.f30515i, this.T.K.f30515i, 0, 4);
            dVar.e(this.I.f30515i, this.T.I.f30515i, 0, 0);
        } else if (i21 == 3) {
            dVar.e(this.I.f30515i, this.K.f30515i, 0, 8);
            dVar.e(this.I.f30515i, this.T.I.f30515i, 0, 4);
            dVar.e(this.I.f30515i, this.T.K.f30515i, 0, 0);
        }
    }

    public int g1() {
        int i10 = this.F0;
        if (i10 == 0 || i10 == 1) {
            return 0;
        }
        return (i10 == 2 || i10 == 3) ? 1 : -1;
    }

    @Override // s.e
    public boolean h() {
        return true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void h1() {
        for (int i10 = 0; i10 < this.E0; i10++) {
            e eVar = this.D0[i10];
            int i11 = this.F0;
            if (i11 == 0 || i11 == 1) {
                eVar.C0(0, true);
            } else if (i11 == 2 || i11 == 3) {
                eVar.C0(1, true);
            }
        }
    }

    public void i1(boolean z10) {
        this.G0 = z10;
    }

    public void j1(int i10) {
        this.F0 = i10;
    }

    public void k1(int i10) {
        this.H0 = i10;
    }

    @Override // s.e
    public String toString() {
        String str = "[Barrier] " + r() + " {";
        for (int i10 = 0; i10 < this.E0; i10++) {
            e eVar = this.D0[i10];
            if (i10 > 0) {
                str = str + ", ";
            }
            str = str + eVar.r();
        }
        return str + "}";
    }
}
