package s;

import s.d;
import s.e;
/* compiled from: Guideline.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class g extends e {
    protected float D0 = -1.0f;
    protected int E0 = -1;
    protected int F0 = -1;
    private d G0 = this.I;
    private int H0 = 0;
    private int I0 = 0;
    private boolean J0;

    /* compiled from: Guideline.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f30592a;

        static {
            int[] iArr = new int[d.b.values().length];
            f30592a = iArr;
            try {
                iArr[d.b.LEFT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f30592a[d.b.RIGHT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f30592a[d.b.TOP.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f30592a[d.b.BOTTOM.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f30592a[d.b.BASELINE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f30592a[d.b.CENTER.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f30592a[d.b.CENTER_X.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f30592a[d.b.CENTER_Y.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f30592a[d.b.NONE.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
        }
    }

    public g() {
        this.Q.clear();
        this.Q.add(this.G0);
        int length = this.P.length;
        for (int i10 = 0; i10 < length; i10++) {
            this.P[i10] = this.G0;
        }
    }

    @Override // s.e
    public void Z0(r.d dVar, boolean z10) {
        if (I() == null) {
            return;
        }
        int x10 = dVar.x(this.G0);
        if (this.H0 == 1) {
            V0(x10);
            W0(0);
            v0(I().v());
            U0(0);
            return;
        }
        V0(0);
        W0(x10);
        U0(I().R());
        v0(0);
    }

    public d a1() {
        return this.G0;
    }

    public int b1() {
        return this.H0;
    }

    public int c1() {
        return this.E0;
    }

    public int d1() {
        return this.F0;
    }

    @Override // s.e
    public boolean e0() {
        return this.J0;
    }

    public float e1() {
        return this.D0;
    }

    @Override // s.e
    public boolean f0() {
        return this.J0;
    }

    public void f1(int i10) {
        this.G0.s(i10);
        this.J0 = true;
    }

    @Override // s.e
    public void g(r.d dVar, boolean z10) {
        f fVar = (f) I();
        if (fVar == null) {
            return;
        }
        d m7 = fVar.m(d.b.LEFT);
        d m10 = fVar.m(d.b.RIGHT);
        e eVar = this.T;
        boolean z11 = true;
        boolean z12 = eVar != null && eVar.S[0] == e.b.WRAP_CONTENT;
        if (this.H0 == 0) {
            m7 = fVar.m(d.b.TOP);
            m10 = fVar.m(d.b.BOTTOM);
            e eVar2 = this.T;
            if (eVar2 == null || eVar2.S[1] != e.b.WRAP_CONTENT) {
                z11 = false;
            }
            z12 = z11;
        }
        if (this.J0 && this.G0.m()) {
            r.i q10 = dVar.q(this.G0);
            dVar.f(q10, this.G0.d());
            if (this.E0 != -1) {
                if (z12) {
                    dVar.h(dVar.q(m10), q10, 0, 5);
                }
            } else if (this.F0 != -1 && z12) {
                r.i q11 = dVar.q(m10);
                dVar.h(q10, dVar.q(m7), 0, 5);
                dVar.h(q11, q10, 0, 5);
            }
            this.J0 = false;
        } else if (this.E0 != -1) {
            r.i q12 = dVar.q(this.G0);
            dVar.e(q12, dVar.q(m7), this.E0, 8);
            if (z12) {
                dVar.h(dVar.q(m10), q12, 0, 5);
            }
        } else if (this.F0 != -1) {
            r.i q13 = dVar.q(this.G0);
            r.i q14 = dVar.q(m10);
            dVar.e(q13, q14, -this.F0, 8);
            if (z12) {
                dVar.h(q13, dVar.q(m7), 0, 5);
                dVar.h(q14, q13, 0, 5);
            }
        } else if (this.D0 != -1.0f) {
            dVar.d(r.d.s(dVar, dVar.q(this.G0), dVar.q(m10), this.D0));
        }
    }

    public void g1(int i10) {
        if (i10 > -1) {
            this.D0 = -1.0f;
            this.E0 = i10;
            this.F0 = -1;
        }
    }

    @Override // s.e
    public boolean h() {
        return true;
    }

    public void h1(int i10) {
        if (i10 > -1) {
            this.D0 = -1.0f;
            this.E0 = -1;
            this.F0 = i10;
        }
    }

    public void i1(float f10) {
        if (f10 > -1.0f) {
            this.D0 = f10;
            this.E0 = -1;
            this.F0 = -1;
        }
    }

    public void j1(int i10) {
        if (this.H0 == i10) {
            return;
        }
        this.H0 = i10;
        this.Q.clear();
        if (this.H0 == 1) {
            this.G0 = this.H;
        } else {
            this.G0 = this.I;
        }
        this.Q.add(this.G0);
        int length = this.P.length;
        for (int i11 = 0; i11 < length; i11++) {
            this.P[i11] = this.G0;
        }
    }

    @Override // s.e
    public d m(d.b bVar) {
        switch (a.f30592a[bVar.ordinal()]) {
            case 1:
            case 2:
                if (this.H0 == 1) {
                    return this.G0;
                }
                break;
            case 3:
            case 4:
                if (this.H0 == 0) {
                    return this.G0;
                }
                break;
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
                return null;
        }
        throw new AssertionError(bVar.name());
    }
}
