package t;

import s.d;
import s.e;
import t.f;
import t.p;
/* compiled from: HorizontalWidgetRun.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class l extends p {

    /* renamed from: k  reason: collision with root package name */
    private static int[] f30868k = new int[2];

    /* compiled from: HorizontalWidgetRun.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f30869a;

        static {
            int[] iArr = new int[p.b.values().length];
            f30869a = iArr;
            try {
                iArr[p.b.START.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f30869a[p.b.END.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f30869a[p.b.CENTER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public l(s.e eVar) {
        super(eVar);
        this.f30903h.f30849e = f.a.LEFT;
        this.f30904i.f30849e = f.a.RIGHT;
        this.f30901f = 0;
    }

    private void q(int[] iArr, int i10, int i11, int i12, int i13, float f10, int i14) {
        int i15 = i11 - i10;
        int i16 = i13 - i12;
        if (i14 != -1) {
            if (i14 == 0) {
                iArr[0] = (int) ((i16 * f10) + 0.5f);
                iArr[1] = i16;
                return;
            } else if (i14 != 1) {
                return;
            } else {
                iArr[0] = i15;
                iArr[1] = (int) ((i15 * f10) + 0.5f);
                return;
            }
        }
        int i17 = (int) ((i16 * f10) + 0.5f);
        int i18 = (int) ((i15 / f10) + 0.5f);
        if (i17 <= i15) {
            iArr[0] = i17;
            iArr[1] = i16;
        } else if (i18 <= i16) {
            iArr[0] = i15;
            iArr[1] = i18;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:119:0x02b9, code lost:
        if (r14 != 1) goto L131;
     */
    @Override // t.p, t.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void a(t.d r17) {
        /*
            Method dump skipped, instructions count: 1087
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: t.l.a(t.d):void");
    }

    @Override // t.p
    void d() {
        s.e I;
        s.e I2;
        s.e eVar = this.f30897b;
        if (eVar.f30527a) {
            this.f30900e.d(eVar.R());
        }
        if (!this.f30900e.f30854j) {
            e.b y10 = this.f30897b.y();
            this.f30899d = y10;
            if (y10 != e.b.MATCH_CONSTRAINT) {
                e.b bVar = e.b.MATCH_PARENT;
                if (y10 == bVar && (((I2 = this.f30897b.I()) != null && I2.y() == e.b.FIXED) || I2.y() == bVar)) {
                    int R = (I2.R() - this.f30897b.H.e()) - this.f30897b.J.e();
                    b(this.f30903h, I2.f30535e.f30903h, this.f30897b.H.e());
                    b(this.f30904i, I2.f30535e.f30904i, -this.f30897b.J.e());
                    this.f30900e.d(R);
                    return;
                } else if (this.f30899d == e.b.FIXED) {
                    this.f30900e.d(this.f30897b.R());
                }
            }
        } else {
            e.b bVar2 = this.f30899d;
            e.b bVar3 = e.b.MATCH_PARENT;
            if (bVar2 == bVar3 && (((I = this.f30897b.I()) != null && I.y() == e.b.FIXED) || I.y() == bVar3)) {
                b(this.f30903h, I.f30535e.f30903h, this.f30897b.H.e());
                b(this.f30904i, I.f30535e.f30904i, -this.f30897b.J.e());
                return;
            }
        }
        g gVar = this.f30900e;
        if (gVar.f30854j) {
            s.e eVar2 = this.f30897b;
            if (eVar2.f30527a) {
                s.d[] dVarArr = eVar2.P;
                if (dVarArr[0].f30512f != null && dVarArr[1].f30512f != null) {
                    if (eVar2.Z()) {
                        this.f30903h.f30850f = this.f30897b.P[0].e();
                        this.f30904i.f30850f = -this.f30897b.P[1].e();
                        return;
                    }
                    f h10 = h(this.f30897b.P[0]);
                    if (h10 != null) {
                        b(this.f30903h, h10, this.f30897b.P[0].e());
                    }
                    f h11 = h(this.f30897b.P[1]);
                    if (h11 != null) {
                        b(this.f30904i, h11, -this.f30897b.P[1].e());
                    }
                    this.f30903h.f30846b = true;
                    this.f30904i.f30846b = true;
                    return;
                } else if (dVarArr[0].f30512f != null) {
                    f h12 = h(dVarArr[0]);
                    if (h12 != null) {
                        b(this.f30903h, h12, this.f30897b.P[0].e());
                        b(this.f30904i, this.f30903h, this.f30900e.f30851g);
                        return;
                    }
                    return;
                } else if (dVarArr[1].f30512f != null) {
                    f h13 = h(dVarArr[1]);
                    if (h13 != null) {
                        b(this.f30904i, h13, -this.f30897b.P[1].e());
                        b(this.f30903h, this.f30904i, -this.f30900e.f30851g);
                        return;
                    }
                    return;
                } else if ((eVar2 instanceof s.h) || eVar2.I() == null || this.f30897b.m(d.b.CENTER).f30512f != null) {
                    return;
                } else {
                    b(this.f30903h, this.f30897b.I().f30535e.f30903h, this.f30897b.S());
                    b(this.f30904i, this.f30903h, this.f30900e.f30851g);
                    return;
                }
            }
        }
        if (this.f30899d == e.b.MATCH_CONSTRAINT) {
            s.e eVar3 = this.f30897b;
            int i10 = eVar3.f30557p;
            if (i10 == 2) {
                s.e I3 = eVar3.I();
                if (I3 != null) {
                    g gVar2 = I3.f30537f.f30900e;
                    this.f30900e.f30856l.add(gVar2);
                    gVar2.f30855k.add(this.f30900e);
                    g gVar3 = this.f30900e;
                    gVar3.f30846b = true;
                    gVar3.f30855k.add(this.f30903h);
                    this.f30900e.f30855k.add(this.f30904i);
                }
            } else if (i10 == 3) {
                if (eVar3.f30559q == 3) {
                    this.f30903h.f30845a = this;
                    this.f30904i.f30845a = this;
                    n nVar = eVar3.f30537f;
                    nVar.f30903h.f30845a = this;
                    nVar.f30904i.f30845a = this;
                    gVar.f30845a = this;
                    if (eVar3.b0()) {
                        this.f30900e.f30856l.add(this.f30897b.f30537f.f30900e);
                        this.f30897b.f30537f.f30900e.f30855k.add(this.f30900e);
                        n nVar2 = this.f30897b.f30537f;
                        nVar2.f30900e.f30845a = this;
                        this.f30900e.f30856l.add(nVar2.f30903h);
                        this.f30900e.f30856l.add(this.f30897b.f30537f.f30904i);
                        this.f30897b.f30537f.f30903h.f30855k.add(this.f30900e);
                        this.f30897b.f30537f.f30904i.f30855k.add(this.f30900e);
                    } else if (this.f30897b.Z()) {
                        this.f30897b.f30537f.f30900e.f30856l.add(this.f30900e);
                        this.f30900e.f30855k.add(this.f30897b.f30537f.f30900e);
                    } else {
                        this.f30897b.f30537f.f30900e.f30856l.add(this.f30900e);
                    }
                } else {
                    g gVar4 = eVar3.f30537f.f30900e;
                    gVar.f30856l.add(gVar4);
                    gVar4.f30855k.add(this.f30900e);
                    this.f30897b.f30537f.f30903h.f30855k.add(this.f30900e);
                    this.f30897b.f30537f.f30904i.f30855k.add(this.f30900e);
                    g gVar5 = this.f30900e;
                    gVar5.f30846b = true;
                    gVar5.f30855k.add(this.f30903h);
                    this.f30900e.f30855k.add(this.f30904i);
                    this.f30903h.f30856l.add(this.f30900e);
                    this.f30904i.f30856l.add(this.f30900e);
                }
            }
        }
        s.e eVar4 = this.f30897b;
        s.d[] dVarArr2 = eVar4.P;
        if (dVarArr2[0].f30512f != null && dVarArr2[1].f30512f != null) {
            if (eVar4.Z()) {
                this.f30903h.f30850f = this.f30897b.P[0].e();
                this.f30904i.f30850f = -this.f30897b.P[1].e();
                return;
            }
            f h14 = h(this.f30897b.P[0]);
            f h15 = h(this.f30897b.P[1]);
            h14.b(this);
            h15.b(this);
            this.f30905j = p.b.CENTER;
        } else if (dVarArr2[0].f30512f != null) {
            f h16 = h(dVarArr2[0]);
            if (h16 != null) {
                b(this.f30903h, h16, this.f30897b.P[0].e());
                c(this.f30904i, this.f30903h, 1, this.f30900e);
            }
        } else if (dVarArr2[1].f30512f != null) {
            f h17 = h(dVarArr2[1]);
            if (h17 != null) {
                b(this.f30904i, h17, -this.f30897b.P[1].e());
                c(this.f30903h, this.f30904i, -1, this.f30900e);
            }
        } else if ((eVar4 instanceof s.h) || eVar4.I() == null) {
        } else {
            b(this.f30903h, this.f30897b.I().f30535e.f30903h, this.f30897b.S());
            c(this.f30904i, this.f30903h, 1, this.f30900e);
        }
    }

    @Override // t.p
    public void e() {
        f fVar = this.f30903h;
        if (fVar.f30854j) {
            this.f30897b.V0(fVar.f30851g);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // t.p
    public void f() {
        this.f30898c = null;
        this.f30903h.c();
        this.f30904i.c();
        this.f30900e.c();
        this.f30902g = false;
    }

    @Override // t.p
    boolean m() {
        return this.f30899d != e.b.MATCH_CONSTRAINT || this.f30897b.f30557p == 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void r() {
        this.f30902g = false;
        this.f30903h.c();
        this.f30903h.f30854j = false;
        this.f30904i.c();
        this.f30904i.f30854j = false;
        this.f30900e.f30854j = false;
    }

    public String toString() {
        return "HorizontalRun " + this.f30897b.r();
    }
}
