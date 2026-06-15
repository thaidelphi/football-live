package s;

import java.util.ArrayList;
import s.e;
/* compiled from: ChainHead.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class c {

    /* renamed from: a  reason: collision with root package name */
    protected e f30485a;

    /* renamed from: b  reason: collision with root package name */
    protected e f30486b;

    /* renamed from: c  reason: collision with root package name */
    protected e f30487c;

    /* renamed from: d  reason: collision with root package name */
    protected e f30488d;

    /* renamed from: e  reason: collision with root package name */
    protected e f30489e;

    /* renamed from: f  reason: collision with root package name */
    protected e f30490f;

    /* renamed from: g  reason: collision with root package name */
    protected e f30491g;

    /* renamed from: h  reason: collision with root package name */
    protected ArrayList<e> f30492h;

    /* renamed from: i  reason: collision with root package name */
    protected int f30493i;

    /* renamed from: j  reason: collision with root package name */
    protected int f30494j;

    /* renamed from: k  reason: collision with root package name */
    protected float f30495k = 0.0f;

    /* renamed from: l  reason: collision with root package name */
    int f30496l;

    /* renamed from: m  reason: collision with root package name */
    int f30497m;

    /* renamed from: n  reason: collision with root package name */
    int f30498n;

    /* renamed from: o  reason: collision with root package name */
    boolean f30499o;

    /* renamed from: p  reason: collision with root package name */
    private int f30500p;

    /* renamed from: q  reason: collision with root package name */
    private boolean f30501q;

    /* renamed from: r  reason: collision with root package name */
    protected boolean f30502r;

    /* renamed from: s  reason: collision with root package name */
    protected boolean f30503s;

    /* renamed from: t  reason: collision with root package name */
    protected boolean f30504t;

    /* renamed from: u  reason: collision with root package name */
    protected boolean f30505u;

    /* renamed from: v  reason: collision with root package name */
    private boolean f30506v;

    public c(e eVar, int i10, boolean z10) {
        this.f30501q = false;
        this.f30485a = eVar;
        this.f30500p = i10;
        this.f30501q = z10;
    }

    private void b() {
        int i10 = this.f30500p * 2;
        e eVar = this.f30485a;
        boolean z10 = true;
        this.f30499o = true;
        e eVar2 = eVar;
        boolean z11 = false;
        while (!z11) {
            this.f30493i++;
            e[] eVarArr = eVar.f30574x0;
            int i11 = this.f30500p;
            e eVar3 = null;
            eVarArr[i11] = null;
            eVar.f30572w0[i11] = null;
            if (eVar.Q() != 8) {
                this.f30496l++;
                e.b s10 = eVar.s(this.f30500p);
                e.b bVar = e.b.MATCH_CONSTRAINT;
                if (s10 != bVar) {
                    this.f30497m += eVar.C(this.f30500p);
                }
                int e8 = this.f30497m + eVar.P[i10].e();
                this.f30497m = e8;
                int i12 = i10 + 1;
                this.f30497m = e8 + eVar.P[i12].e();
                int e10 = this.f30498n + eVar.P[i10].e();
                this.f30498n = e10;
                this.f30498n = e10 + eVar.P[i12].e();
                if (this.f30486b == null) {
                    this.f30486b = eVar;
                }
                this.f30488d = eVar;
                e.b[] bVarArr = eVar.S;
                int i13 = this.f30500p;
                if (bVarArr[i13] == bVar) {
                    int[] iArr = eVar.f30561r;
                    if (iArr[i13] == 0 || iArr[i13] == 3 || iArr[i13] == 2) {
                        this.f30494j++;
                        float[] fArr = eVar.f30570v0;
                        float f10 = fArr[i13];
                        if (f10 > 0.0f) {
                            this.f30495k += fArr[i13];
                        }
                        if (c(eVar, i13)) {
                            if (f10 < 0.0f) {
                                this.f30502r = true;
                            } else {
                                this.f30503s = true;
                            }
                            if (this.f30492h == null) {
                                this.f30492h = new ArrayList<>();
                            }
                            this.f30492h.add(eVar);
                        }
                        if (this.f30490f == null) {
                            this.f30490f = eVar;
                        }
                        e eVar4 = this.f30491g;
                        if (eVar4 != null) {
                            eVar4.f30572w0[this.f30500p] = eVar;
                        }
                        this.f30491g = eVar;
                    }
                    if (this.f30500p == 0) {
                        if (eVar.f30557p != 0) {
                            this.f30499o = false;
                        } else if (eVar.f30563s != 0 || eVar.f30565t != 0) {
                            this.f30499o = false;
                        }
                    } else if (eVar.f30559q != 0) {
                        this.f30499o = false;
                    } else if (eVar.f30569v != 0 || eVar.f30571w != 0) {
                        this.f30499o = false;
                    }
                    if (eVar.W != 0.0f) {
                        this.f30499o = false;
                        this.f30505u = true;
                    }
                }
            }
            if (eVar2 != eVar) {
                eVar2.f30574x0[this.f30500p] = eVar;
            }
            d dVar = eVar.P[i10 + 1].f30512f;
            if (dVar != null) {
                e eVar5 = dVar.f30510d;
                d[] dVarArr = eVar5.P;
                if (dVarArr[i10].f30512f != null && dVarArr[i10].f30512f.f30510d == eVar) {
                    eVar3 = eVar5;
                }
            }
            if (eVar3 == null) {
                eVar3 = eVar;
                z11 = true;
            }
            eVar2 = eVar;
            eVar = eVar3;
        }
        e eVar6 = this.f30486b;
        if (eVar6 != null) {
            this.f30497m -= eVar6.P[i10].e();
        }
        e eVar7 = this.f30488d;
        if (eVar7 != null) {
            this.f30497m -= eVar7.P[i10 + 1].e();
        }
        this.f30487c = eVar;
        if (this.f30500p == 0 && this.f30501q) {
            this.f30489e = eVar;
        } else {
            this.f30489e = this.f30485a;
        }
        if (!this.f30503s || !this.f30502r) {
            z10 = false;
        }
        this.f30504t = z10;
    }

    private static boolean c(e eVar, int i10) {
        if (eVar.Q() != 8 && eVar.S[i10] == e.b.MATCH_CONSTRAINT) {
            int[] iArr = eVar.f30561r;
            if (iArr[i10] == 0 || iArr[i10] == 3) {
                return true;
            }
        }
        return false;
    }

    public void a() {
        if (!this.f30506v) {
            b();
        }
        this.f30506v = true;
    }
}
