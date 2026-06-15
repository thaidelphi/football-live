package t;

import s.d;
import s.e;
import t.f;
import t.p;
/* compiled from: VerticalWidgetRun.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class n extends p {

    /* renamed from: k  reason: collision with root package name */
    public f f30878k;

    /* renamed from: l  reason: collision with root package name */
    g f30879l;

    /* compiled from: VerticalWidgetRun.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f30880a;

        static {
            int[] iArr = new int[p.b.values().length];
            f30880a = iArr;
            try {
                iArr[p.b.START.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f30880a[p.b.END.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f30880a[p.b.CENTER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public n(s.e eVar) {
        super(eVar);
        f fVar = new f(this);
        this.f30878k = fVar;
        this.f30879l = null;
        this.f30903h.f30849e = f.a.TOP;
        this.f30904i.f30849e = f.a.BOTTOM;
        fVar.f30849e = f.a.BASELINE;
        this.f30901f = 1;
    }

    @Override // t.p, t.d
    public void a(d dVar) {
        g gVar;
        float f10;
        float t10;
        float f11;
        int i10;
        s.e eVar;
        int i11 = a.f30880a[this.f30905j.ordinal()];
        if (i11 == 1) {
            p(dVar);
        } else if (i11 == 2) {
            o(dVar);
        } else if (i11 == 3) {
            s.e eVar2 = this.f30897b;
            n(dVar, eVar2.I, eVar2.K, 1);
            return;
        }
        g gVar2 = this.f30900e;
        if (gVar2.f30847c && !gVar2.f30854j && this.f30899d == e.b.MATCH_CONSTRAINT) {
            s.e eVar3 = this.f30897b;
            int i12 = eVar3.f30559q;
            if (i12 != 2) {
                if (i12 == 3 && eVar3.f30535e.f30900e.f30854j) {
                    int u10 = eVar3.u();
                    if (u10 == -1) {
                        s.e eVar4 = this.f30897b;
                        f10 = eVar4.f30535e.f30900e.f30851g;
                        t10 = eVar4.t();
                    } else if (u10 == 0) {
                        f11 = eVar.f30535e.f30900e.f30851g * this.f30897b.t();
                        i10 = (int) (f11 + 0.5f);
                        this.f30900e.d(i10);
                    } else if (u10 == 1) {
                        s.e eVar5 = this.f30897b;
                        f10 = eVar5.f30535e.f30900e.f30851g;
                        t10 = eVar5.t();
                    } else {
                        i10 = 0;
                        this.f30900e.d(i10);
                    }
                    f11 = f10 / t10;
                    i10 = (int) (f11 + 0.5f);
                    this.f30900e.d(i10);
                }
            } else {
                s.e I = eVar3.I();
                if (I != null) {
                    if (I.f30537f.f30900e.f30854j) {
                        this.f30900e.d((int) ((gVar.f30851g * this.f30897b.f30573x) + 0.5f));
                    }
                }
            }
        }
        f fVar = this.f30903h;
        if (fVar.f30847c) {
            f fVar2 = this.f30904i;
            if (fVar2.f30847c) {
                if (fVar.f30854j && fVar2.f30854j && this.f30900e.f30854j) {
                    return;
                }
                if (!this.f30900e.f30854j && this.f30899d == e.b.MATCH_CONSTRAINT) {
                    s.e eVar6 = this.f30897b;
                    if (eVar6.f30557p == 0 && !eVar6.b0()) {
                        int i13 = this.f30903h.f30856l.get(0).f30851g;
                        f fVar3 = this.f30903h;
                        int i14 = i13 + fVar3.f30850f;
                        int i15 = this.f30904i.f30856l.get(0).f30851g + this.f30904i.f30850f;
                        fVar3.d(i14);
                        this.f30904i.d(i15);
                        this.f30900e.d(i15 - i14);
                        return;
                    }
                }
                if (!this.f30900e.f30854j && this.f30899d == e.b.MATCH_CONSTRAINT && this.f30896a == 1 && this.f30903h.f30856l.size() > 0 && this.f30904i.f30856l.size() > 0) {
                    int i16 = (this.f30904i.f30856l.get(0).f30851g + this.f30904i.f30850f) - (this.f30903h.f30856l.get(0).f30851g + this.f30903h.f30850f);
                    g gVar3 = this.f30900e;
                    int i17 = gVar3.f30866m;
                    if (i16 < i17) {
                        gVar3.d(i16);
                    } else {
                        gVar3.d(i17);
                    }
                }
                if (this.f30900e.f30854j && this.f30903h.f30856l.size() > 0 && this.f30904i.f30856l.size() > 0) {
                    f fVar4 = this.f30903h.f30856l.get(0);
                    f fVar5 = this.f30904i.f30856l.get(0);
                    int i18 = fVar4.f30851g + this.f30903h.f30850f;
                    int i19 = fVar5.f30851g + this.f30904i.f30850f;
                    float M = this.f30897b.M();
                    if (fVar4 == fVar5) {
                        i18 = fVar4.f30851g;
                        i19 = fVar5.f30851g;
                        M = 0.5f;
                    }
                    this.f30903h.d((int) (i18 + 0.5f + (((i19 - i18) - this.f30900e.f30851g) * M)));
                    this.f30904i.d(this.f30903h.f30851g + this.f30900e.f30851g);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // t.p
    public void d() {
        s.e I;
        s.e I2;
        s.e eVar = this.f30897b;
        if (eVar.f30527a) {
            this.f30900e.d(eVar.v());
        }
        if (!this.f30900e.f30854j) {
            this.f30899d = this.f30897b.O();
            if (this.f30897b.U()) {
                this.f30879l = new t.a(this);
            }
            e.b bVar = this.f30899d;
            if (bVar != e.b.MATCH_CONSTRAINT) {
                if (bVar == e.b.MATCH_PARENT && (I2 = this.f30897b.I()) != null && I2.O() == e.b.FIXED) {
                    int v10 = (I2.v() - this.f30897b.I.e()) - this.f30897b.K.e();
                    b(this.f30903h, I2.f30537f.f30903h, this.f30897b.I.e());
                    b(this.f30904i, I2.f30537f.f30904i, -this.f30897b.K.e());
                    this.f30900e.d(v10);
                    return;
                } else if (this.f30899d == e.b.FIXED) {
                    this.f30900e.d(this.f30897b.v());
                }
            }
        } else if (this.f30899d == e.b.MATCH_PARENT && (I = this.f30897b.I()) != null && I.O() == e.b.FIXED) {
            b(this.f30903h, I.f30537f.f30903h, this.f30897b.I.e());
            b(this.f30904i, I.f30537f.f30904i, -this.f30897b.K.e());
            return;
        }
        g gVar = this.f30900e;
        boolean z10 = gVar.f30854j;
        if (z10) {
            s.e eVar2 = this.f30897b;
            if (eVar2.f30527a) {
                s.d[] dVarArr = eVar2.P;
                if (dVarArr[2].f30512f != null && dVarArr[3].f30512f != null) {
                    if (eVar2.b0()) {
                        this.f30903h.f30850f = this.f30897b.P[2].e();
                        this.f30904i.f30850f = -this.f30897b.P[3].e();
                    } else {
                        f h10 = h(this.f30897b.P[2]);
                        if (h10 != null) {
                            b(this.f30903h, h10, this.f30897b.P[2].e());
                        }
                        f h11 = h(this.f30897b.P[3]);
                        if (h11 != null) {
                            b(this.f30904i, h11, -this.f30897b.P[3].e());
                        }
                        this.f30903h.f30846b = true;
                        this.f30904i.f30846b = true;
                    }
                    if (this.f30897b.U()) {
                        b(this.f30878k, this.f30903h, this.f30897b.n());
                        return;
                    }
                    return;
                } else if (dVarArr[2].f30512f != null) {
                    f h12 = h(dVarArr[2]);
                    if (h12 != null) {
                        b(this.f30903h, h12, this.f30897b.P[2].e());
                        b(this.f30904i, this.f30903h, this.f30900e.f30851g);
                        if (this.f30897b.U()) {
                            b(this.f30878k, this.f30903h, this.f30897b.n());
                            return;
                        }
                        return;
                    }
                    return;
                } else if (dVarArr[3].f30512f != null) {
                    f h13 = h(dVarArr[3]);
                    if (h13 != null) {
                        b(this.f30904i, h13, -this.f30897b.P[3].e());
                        b(this.f30903h, this.f30904i, -this.f30900e.f30851g);
                    }
                    if (this.f30897b.U()) {
                        b(this.f30878k, this.f30903h, this.f30897b.n());
                        return;
                    }
                    return;
                } else if (dVarArr[4].f30512f != null) {
                    f h14 = h(dVarArr[4]);
                    if (h14 != null) {
                        b(this.f30878k, h14, 0);
                        b(this.f30903h, this.f30878k, -this.f30897b.n());
                        b(this.f30904i, this.f30903h, this.f30900e.f30851g);
                        return;
                    }
                    return;
                } else if ((eVar2 instanceof s.h) || eVar2.I() == null || this.f30897b.m(d.b.CENTER).f30512f != null) {
                    return;
                } else {
                    b(this.f30903h, this.f30897b.I().f30537f.f30903h, this.f30897b.T());
                    b(this.f30904i, this.f30903h, this.f30900e.f30851g);
                    if (this.f30897b.U()) {
                        b(this.f30878k, this.f30903h, this.f30897b.n());
                        return;
                    }
                    return;
                }
            }
        }
        if (!z10 && this.f30899d == e.b.MATCH_CONSTRAINT) {
            s.e eVar3 = this.f30897b;
            int i10 = eVar3.f30559q;
            if (i10 != 2) {
                if (i10 == 3 && !eVar3.b0()) {
                    s.e eVar4 = this.f30897b;
                    if (eVar4.f30557p != 3) {
                        g gVar2 = eVar4.f30535e.f30900e;
                        this.f30900e.f30856l.add(gVar2);
                        gVar2.f30855k.add(this.f30900e);
                        g gVar3 = this.f30900e;
                        gVar3.f30846b = true;
                        gVar3.f30855k.add(this.f30903h);
                        this.f30900e.f30855k.add(this.f30904i);
                    }
                }
            } else {
                s.e I3 = eVar3.I();
                if (I3 != null) {
                    g gVar4 = I3.f30537f.f30900e;
                    this.f30900e.f30856l.add(gVar4);
                    gVar4.f30855k.add(this.f30900e);
                    g gVar5 = this.f30900e;
                    gVar5.f30846b = true;
                    gVar5.f30855k.add(this.f30903h);
                    this.f30900e.f30855k.add(this.f30904i);
                }
            }
        } else {
            gVar.b(this);
        }
        s.e eVar5 = this.f30897b;
        s.d[] dVarArr2 = eVar5.P;
        if (dVarArr2[2].f30512f != null && dVarArr2[3].f30512f != null) {
            if (eVar5.b0()) {
                this.f30903h.f30850f = this.f30897b.P[2].e();
                this.f30904i.f30850f = -this.f30897b.P[3].e();
            } else {
                f h15 = h(this.f30897b.P[2]);
                f h16 = h(this.f30897b.P[3]);
                h15.b(this);
                h16.b(this);
                this.f30905j = p.b.CENTER;
            }
            if (this.f30897b.U()) {
                c(this.f30878k, this.f30903h, 1, this.f30879l);
            }
        } else if (dVarArr2[2].f30512f != null) {
            f h17 = h(dVarArr2[2]);
            if (h17 != null) {
                b(this.f30903h, h17, this.f30897b.P[2].e());
                c(this.f30904i, this.f30903h, 1, this.f30900e);
                if (this.f30897b.U()) {
                    c(this.f30878k, this.f30903h, 1, this.f30879l);
                }
                e.b bVar2 = this.f30899d;
                e.b bVar3 = e.b.MATCH_CONSTRAINT;
                if (bVar2 == bVar3 && this.f30897b.t() > 0.0f) {
                    l lVar = this.f30897b.f30535e;
                    if (lVar.f30899d == bVar3) {
                        lVar.f30900e.f30855k.add(this.f30900e);
                        this.f30900e.f30856l.add(this.f30897b.f30535e.f30900e);
                        this.f30900e.f30845a = this;
                    }
                }
            }
        } else if (dVarArr2[3].f30512f != null) {
            f h18 = h(dVarArr2[3]);
            if (h18 != null) {
                b(this.f30904i, h18, -this.f30897b.P[3].e());
                c(this.f30903h, this.f30904i, -1, this.f30900e);
                if (this.f30897b.U()) {
                    c(this.f30878k, this.f30903h, 1, this.f30879l);
                }
            }
        } else if (dVarArr2[4].f30512f != null) {
            f h19 = h(dVarArr2[4]);
            if (h19 != null) {
                b(this.f30878k, h19, 0);
                c(this.f30903h, this.f30878k, -1, this.f30879l);
                c(this.f30904i, this.f30903h, 1, this.f30900e);
            }
        } else if (!(eVar5 instanceof s.h) && eVar5.I() != null) {
            b(this.f30903h, this.f30897b.I().f30537f.f30903h, this.f30897b.T());
            c(this.f30904i, this.f30903h, 1, this.f30900e);
            if (this.f30897b.U()) {
                c(this.f30878k, this.f30903h, 1, this.f30879l);
            }
            e.b bVar4 = this.f30899d;
            e.b bVar5 = e.b.MATCH_CONSTRAINT;
            if (bVar4 == bVar5 && this.f30897b.t() > 0.0f) {
                l lVar2 = this.f30897b.f30535e;
                if (lVar2.f30899d == bVar5) {
                    lVar2.f30900e.f30855k.add(this.f30900e);
                    this.f30900e.f30856l.add(this.f30897b.f30535e.f30900e);
                    this.f30900e.f30845a = this;
                }
            }
        }
        if (this.f30900e.f30856l.size() == 0) {
            this.f30900e.f30847c = true;
        }
    }

    @Override // t.p
    public void e() {
        f fVar = this.f30903h;
        if (fVar.f30854j) {
            this.f30897b.W0(fVar.f30851g);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // t.p
    public void f() {
        this.f30898c = null;
        this.f30903h.c();
        this.f30904i.c();
        this.f30878k.c();
        this.f30900e.c();
        this.f30902g = false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // t.p
    public boolean m() {
        return this.f30899d != e.b.MATCH_CONSTRAINT || this.f30897b.f30559q == 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void q() {
        this.f30902g = false;
        this.f30903h.c();
        this.f30903h.f30854j = false;
        this.f30904i.c();
        this.f30904i.f30854j = false;
        this.f30878k.c();
        this.f30878k.f30854j = false;
        this.f30900e.f30854j = false;
    }

    public String toString() {
        return "VerticalRun " + this.f30897b.r();
    }
}
