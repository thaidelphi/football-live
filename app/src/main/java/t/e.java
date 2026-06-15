package t;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import s.e;
import t.b;
/* compiled from: DependencyGraph.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class e {

    /* renamed from: a  reason: collision with root package name */
    private s.f f30836a;

    /* renamed from: d  reason: collision with root package name */
    private s.f f30839d;

    /* renamed from: b  reason: collision with root package name */
    private boolean f30837b = true;

    /* renamed from: c  reason: collision with root package name */
    private boolean f30838c = true;

    /* renamed from: e  reason: collision with root package name */
    private ArrayList<p> f30840e = new ArrayList<>();

    /* renamed from: f  reason: collision with root package name */
    private ArrayList<m> f30841f = new ArrayList<>();

    /* renamed from: g  reason: collision with root package name */
    private b.InterfaceC0356b f30842g = null;

    /* renamed from: h  reason: collision with root package name */
    private b.a f30843h = new b.a();

    /* renamed from: i  reason: collision with root package name */
    ArrayList<m> f30844i = new ArrayList<>();

    public e(s.f fVar) {
        this.f30836a = fVar;
        this.f30839d = fVar;
    }

    private void a(f fVar, int i10, int i11, f fVar2, ArrayList<m> arrayList, m mVar) {
        p pVar = fVar.f30848d;
        if (pVar.f30898c == null) {
            s.f fVar3 = this.f30836a;
            if (pVar == fVar3.f30535e || pVar == fVar3.f30537f) {
                return;
            }
            if (mVar == null) {
                mVar = new m(pVar, i11);
                arrayList.add(mVar);
            }
            pVar.f30898c = mVar;
            mVar.a(pVar);
            for (d dVar : pVar.f30903h.f30855k) {
                if (dVar instanceof f) {
                    a((f) dVar, i10, 0, fVar2, arrayList, mVar);
                }
            }
            for (d dVar2 : pVar.f30904i.f30855k) {
                if (dVar2 instanceof f) {
                    a((f) dVar2, i10, 1, fVar2, arrayList, mVar);
                }
            }
            if (i10 == 1 && (pVar instanceof n)) {
                for (d dVar3 : ((n) pVar).f30878k.f30855k) {
                    if (dVar3 instanceof f) {
                        a((f) dVar3, i10, 2, fVar2, arrayList, mVar);
                    }
                }
            }
            for (f fVar4 : pVar.f30903h.f30856l) {
                if (fVar4 == fVar2) {
                    mVar.f30872b = true;
                }
                a(fVar4, i10, 0, fVar2, arrayList, mVar);
            }
            for (f fVar5 : pVar.f30904i.f30856l) {
                if (fVar5 == fVar2) {
                    mVar.f30872b = true;
                }
                a(fVar5, i10, 1, fVar2, arrayList, mVar);
            }
            if (i10 == 1 && (pVar instanceof n)) {
                for (f fVar6 : ((n) pVar).f30878k.f30856l) {
                    a(fVar6, i10, 2, fVar2, arrayList, mVar);
                }
            }
        }
    }

    private boolean b(s.f fVar) {
        int i10;
        e.b bVar;
        int i11;
        e.b bVar2;
        e.b bVar3;
        e.b bVar4;
        Iterator<s.e> it = fVar.D0.iterator();
        while (it.hasNext()) {
            s.e next = it.next();
            e.b[] bVarArr = next.S;
            e.b bVar5 = bVarArr[0];
            e.b bVar6 = bVarArr[1];
            if (next.Q() == 8) {
                next.f30527a = true;
            } else {
                if (next.f30567u < 1.0f && bVar5 == e.b.MATCH_CONSTRAINT) {
                    next.f30557p = 2;
                }
                if (next.f30573x < 1.0f && bVar6 == e.b.MATCH_CONSTRAINT) {
                    next.f30559q = 2;
                }
                if (next.t() > 0.0f) {
                    e.b bVar7 = e.b.MATCH_CONSTRAINT;
                    if (bVar5 == bVar7 && (bVar6 == e.b.WRAP_CONTENT || bVar6 == e.b.FIXED)) {
                        next.f30557p = 3;
                    } else if (bVar6 == bVar7 && (bVar5 == e.b.WRAP_CONTENT || bVar5 == e.b.FIXED)) {
                        next.f30559q = 3;
                    } else if (bVar5 == bVar7 && bVar6 == bVar7) {
                        if (next.f30557p == 0) {
                            next.f30557p = 3;
                        }
                        if (next.f30559q == 0) {
                            next.f30559q = 3;
                        }
                    }
                }
                e.b bVar8 = e.b.MATCH_CONSTRAINT;
                if (bVar5 == bVar8 && next.f30557p == 1 && (next.H.f30512f == null || next.J.f30512f == null)) {
                    bVar5 = e.b.WRAP_CONTENT;
                }
                e.b bVar9 = bVar5;
                if (bVar6 == bVar8 && next.f30559q == 1 && (next.I.f30512f == null || next.K.f30512f == null)) {
                    bVar6 = e.b.WRAP_CONTENT;
                }
                e.b bVar10 = bVar6;
                l lVar = next.f30535e;
                lVar.f30899d = bVar9;
                int i12 = next.f30557p;
                lVar.f30896a = i12;
                n nVar = next.f30537f;
                nVar.f30899d = bVar10;
                int i13 = next.f30559q;
                nVar.f30896a = i13;
                e.b bVar11 = e.b.MATCH_PARENT;
                if ((bVar9 == bVar11 || bVar9 == e.b.FIXED || bVar9 == e.b.WRAP_CONTENT) && (bVar10 == bVar11 || bVar10 == e.b.FIXED || bVar10 == e.b.WRAP_CONTENT)) {
                    int R = next.R();
                    if (bVar9 == bVar11) {
                        i10 = (fVar.R() - next.H.f30513g) - next.J.f30513g;
                        bVar = e.b.FIXED;
                    } else {
                        i10 = R;
                        bVar = bVar9;
                    }
                    int v10 = next.v();
                    if (bVar10 == bVar11) {
                        i11 = (fVar.v() - next.I.f30513g) - next.K.f30513g;
                        bVar2 = e.b.FIXED;
                    } else {
                        i11 = v10;
                        bVar2 = bVar10;
                    }
                    l(next, bVar, i10, bVar2, i11);
                    next.f30535e.f30900e.d(next.R());
                    next.f30537f.f30900e.d(next.v());
                    next.f30527a = true;
                } else {
                    if (bVar9 == bVar8 && (bVar10 == (bVar4 = e.b.WRAP_CONTENT) || bVar10 == e.b.FIXED)) {
                        if (i12 == 3) {
                            if (bVar10 == bVar4) {
                                l(next, bVar4, 0, bVar4, 0);
                            }
                            int v11 = next.v();
                            e.b bVar12 = e.b.FIXED;
                            l(next, bVar12, (int) ((v11 * next.W) + 0.5f), bVar12, v11);
                            next.f30535e.f30900e.d(next.R());
                            next.f30537f.f30900e.d(next.v());
                            next.f30527a = true;
                        } else if (i12 == 1) {
                            l(next, bVar4, 0, bVar10, 0);
                            next.f30535e.f30900e.f30866m = next.R();
                        } else if (i12 == 2) {
                            e.b[] bVarArr2 = fVar.S;
                            e.b bVar13 = bVarArr2[0];
                            e.b bVar14 = e.b.FIXED;
                            if (bVar13 == bVar14 || bVarArr2[0] == bVar11) {
                                l(next, bVar14, (int) ((next.f30567u * fVar.R()) + 0.5f), bVar10, next.v());
                                next.f30535e.f30900e.d(next.R());
                                next.f30537f.f30900e.d(next.v());
                                next.f30527a = true;
                            }
                        } else {
                            s.d[] dVarArr = next.P;
                            if (dVarArr[0].f30512f == null || dVarArr[1].f30512f == null) {
                                l(next, bVar4, 0, bVar10, 0);
                                next.f30535e.f30900e.d(next.R());
                                next.f30537f.f30900e.d(next.v());
                                next.f30527a = true;
                            }
                        }
                    }
                    if (bVar10 == bVar8 && (bVar9 == (bVar3 = e.b.WRAP_CONTENT) || bVar9 == e.b.FIXED)) {
                        if (i13 == 3) {
                            if (bVar9 == bVar3) {
                                l(next, bVar3, 0, bVar3, 0);
                            }
                            int R2 = next.R();
                            float f10 = next.W;
                            if (next.u() == -1) {
                                f10 = 1.0f / f10;
                            }
                            e.b bVar15 = e.b.FIXED;
                            l(next, bVar15, R2, bVar15, (int) ((R2 * f10) + 0.5f));
                            next.f30535e.f30900e.d(next.R());
                            next.f30537f.f30900e.d(next.v());
                            next.f30527a = true;
                        } else if (i13 == 1) {
                            l(next, bVar9, 0, bVar3, 0);
                            next.f30537f.f30900e.f30866m = next.v();
                        } else if (i13 == 2) {
                            e.b[] bVarArr3 = fVar.S;
                            e.b bVar16 = bVarArr3[1];
                            e.b bVar17 = e.b.FIXED;
                            if (bVar16 == bVar17 || bVarArr3[1] == bVar11) {
                                l(next, bVar9, next.R(), bVar17, (int) ((next.f30573x * fVar.v()) + 0.5f));
                                next.f30535e.f30900e.d(next.R());
                                next.f30537f.f30900e.d(next.v());
                                next.f30527a = true;
                            }
                        } else {
                            s.d[] dVarArr2 = next.P;
                            if (dVarArr2[2].f30512f == null || dVarArr2[3].f30512f == null) {
                                l(next, bVar3, 0, bVar10, 0);
                                next.f30535e.f30900e.d(next.R());
                                next.f30537f.f30900e.d(next.v());
                                next.f30527a = true;
                            }
                        }
                    }
                    if (bVar9 == bVar8 && bVar10 == bVar8) {
                        if (i12 == 1 || i13 == 1) {
                            e.b bVar18 = e.b.WRAP_CONTENT;
                            l(next, bVar18, 0, bVar18, 0);
                            next.f30535e.f30900e.f30866m = next.R();
                            next.f30537f.f30900e.f30866m = next.v();
                        } else if (i13 == 2 && i12 == 2) {
                            e.b[] bVarArr4 = fVar.S;
                            e.b bVar19 = bVarArr4[0];
                            e.b bVar20 = e.b.FIXED;
                            if (bVar19 == bVar20 || bVarArr4[0] == bVar20) {
                                if (bVarArr4[1] == bVar20 || bVarArr4[1] == bVar20) {
                                    l(next, bVar20, (int) ((next.f30567u * fVar.R()) + 0.5f), bVar20, (int) ((next.f30573x * fVar.v()) + 0.5f));
                                    next.f30535e.f30900e.d(next.R());
                                    next.f30537f.f30900e.d(next.v());
                                    next.f30527a = true;
                                }
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    private int e(s.f fVar, int i10) {
        int size = this.f30844i.size();
        long j10 = 0;
        for (int i11 = 0; i11 < size; i11++) {
            j10 = Math.max(j10, this.f30844i.get(i11).b(fVar, i10));
        }
        return (int) j10;
    }

    private void i(p pVar, int i10, ArrayList<m> arrayList) {
        for (d dVar : pVar.f30903h.f30855k) {
            if (dVar instanceof f) {
                a((f) dVar, i10, 0, pVar.f30904i, arrayList, null);
            } else if (dVar instanceof p) {
                a(((p) dVar).f30903h, i10, 0, pVar.f30904i, arrayList, null);
            }
        }
        for (d dVar2 : pVar.f30904i.f30855k) {
            if (dVar2 instanceof f) {
                a((f) dVar2, i10, 1, pVar.f30903h, arrayList, null);
            } else if (dVar2 instanceof p) {
                a(((p) dVar2).f30904i, i10, 1, pVar.f30903h, arrayList, null);
            }
        }
        if (i10 == 1) {
            for (d dVar3 : ((n) pVar).f30878k.f30855k) {
                if (dVar3 instanceof f) {
                    a((f) dVar3, i10, 2, null, arrayList, null);
                }
            }
        }
    }

    private void l(s.e eVar, e.b bVar, int i10, e.b bVar2, int i11) {
        b.a aVar = this.f30843h;
        aVar.f30824a = bVar;
        aVar.f30825b = bVar2;
        aVar.f30826c = i10;
        aVar.f30827d = i11;
        this.f30842g.b(eVar, aVar);
        eVar.U0(this.f30843h.f30828e);
        eVar.v0(this.f30843h.f30829f);
        eVar.u0(this.f30843h.f30831h);
        eVar.k0(this.f30843h.f30830g);
    }

    public void c() {
        d(this.f30840e);
        this.f30844i.clear();
        m.f30870h = 0;
        i(this.f30836a.f30535e, 0, this.f30844i);
        i(this.f30836a.f30537f, 1, this.f30844i);
        this.f30837b = false;
    }

    public void d(ArrayList<p> arrayList) {
        arrayList.clear();
        this.f30839d.f30535e.f();
        this.f30839d.f30537f.f();
        arrayList.add(this.f30839d.f30535e);
        arrayList.add(this.f30839d.f30537f);
        Iterator<s.e> it = this.f30839d.D0.iterator();
        HashSet hashSet = null;
        while (it.hasNext()) {
            s.e next = it.next();
            if (next instanceof s.g) {
                arrayList.add(new j(next));
            } else {
                if (next.Z()) {
                    if (next.f30531c == null) {
                        next.f30531c = new c(next, 0);
                    }
                    if (hashSet == null) {
                        hashSet = new HashSet();
                    }
                    hashSet.add(next.f30531c);
                } else {
                    arrayList.add(next.f30535e);
                }
                if (next.b0()) {
                    if (next.f30533d == null) {
                        next.f30533d = new c(next, 1);
                    }
                    if (hashSet == null) {
                        hashSet = new HashSet();
                    }
                    hashSet.add(next.f30533d);
                } else {
                    arrayList.add(next.f30537f);
                }
                if (next instanceof s.i) {
                    arrayList.add(new k(next));
                }
            }
        }
        if (hashSet != null) {
            arrayList.addAll(hashSet);
        }
        Iterator<p> it2 = arrayList.iterator();
        while (it2.hasNext()) {
            it2.next().f();
        }
        Iterator<p> it3 = arrayList.iterator();
        while (it3.hasNext()) {
            p next2 = it3.next();
            if (next2.f30897b != this.f30839d) {
                next2.d();
            }
        }
    }

    public boolean f(boolean z10) {
        boolean z11;
        boolean z12 = true;
        boolean z13 = z10 & true;
        if (this.f30837b || this.f30838c) {
            Iterator<s.e> it = this.f30836a.D0.iterator();
            while (it.hasNext()) {
                s.e next = it.next();
                next.l();
                next.f30527a = false;
                next.f30535e.r();
                next.f30537f.q();
            }
            this.f30836a.l();
            s.f fVar = this.f30836a;
            fVar.f30527a = false;
            fVar.f30535e.r();
            this.f30836a.f30537f.q();
            this.f30838c = false;
        }
        if (b(this.f30839d)) {
            return false;
        }
        this.f30836a.V0(0);
        this.f30836a.W0(0);
        e.b s10 = this.f30836a.s(0);
        e.b s11 = this.f30836a.s(1);
        if (this.f30837b) {
            c();
        }
        int S = this.f30836a.S();
        int T = this.f30836a.T();
        this.f30836a.f30535e.f30903h.d(S);
        this.f30836a.f30537f.f30903h.d(T);
        m();
        e.b bVar = e.b.WRAP_CONTENT;
        if (s10 == bVar || s11 == bVar) {
            if (z13) {
                Iterator<p> it2 = this.f30840e.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    } else if (!it2.next().m()) {
                        z13 = false;
                        break;
                    }
                }
            }
            if (z13 && s10 == e.b.WRAP_CONTENT) {
                this.f30836a.z0(e.b.FIXED);
                s.f fVar2 = this.f30836a;
                fVar2.U0(e(fVar2, 0));
                s.f fVar3 = this.f30836a;
                fVar3.f30535e.f30900e.d(fVar3.R());
            }
            if (z13 && s11 == e.b.WRAP_CONTENT) {
                this.f30836a.Q0(e.b.FIXED);
                s.f fVar4 = this.f30836a;
                fVar4.v0(e(fVar4, 1));
                s.f fVar5 = this.f30836a;
                fVar5.f30537f.f30900e.d(fVar5.v());
            }
        }
        s.f fVar6 = this.f30836a;
        e.b[] bVarArr = fVar6.S;
        e.b bVar2 = bVarArr[0];
        e.b bVar3 = e.b.FIXED;
        if (bVar2 == bVar3 || bVarArr[0] == e.b.MATCH_PARENT) {
            int R = fVar6.R() + S;
            this.f30836a.f30535e.f30904i.d(R);
            this.f30836a.f30535e.f30900e.d(R - S);
            m();
            s.f fVar7 = this.f30836a;
            e.b[] bVarArr2 = fVar7.S;
            if (bVarArr2[1] == bVar3 || bVarArr2[1] == e.b.MATCH_PARENT) {
                int v10 = fVar7.v() + T;
                this.f30836a.f30537f.f30904i.d(v10);
                this.f30836a.f30537f.f30900e.d(v10 - T);
            }
            m();
            z11 = true;
        } else {
            z11 = false;
        }
        Iterator<p> it3 = this.f30840e.iterator();
        while (it3.hasNext()) {
            p next2 = it3.next();
            if (next2.f30897b != this.f30836a || next2.f30902g) {
                next2.e();
            }
        }
        Iterator<p> it4 = this.f30840e.iterator();
        while (it4.hasNext()) {
            p next3 = it4.next();
            if (z11 || next3.f30897b != this.f30836a) {
                if (!next3.f30903h.f30854j || ((!next3.f30904i.f30854j && !(next3 instanceof j)) || (!next3.f30900e.f30854j && !(next3 instanceof c) && !(next3 instanceof j)))) {
                    z12 = false;
                    break;
                }
            }
        }
        this.f30836a.z0(s10);
        this.f30836a.Q0(s11);
        return z12;
    }

    public boolean g(boolean z10) {
        if (this.f30837b) {
            Iterator<s.e> it = this.f30836a.D0.iterator();
            while (it.hasNext()) {
                s.e next = it.next();
                next.l();
                next.f30527a = false;
                l lVar = next.f30535e;
                lVar.f30900e.f30854j = false;
                lVar.f30902g = false;
                lVar.r();
                n nVar = next.f30537f;
                nVar.f30900e.f30854j = false;
                nVar.f30902g = false;
                nVar.q();
            }
            this.f30836a.l();
            s.f fVar = this.f30836a;
            fVar.f30527a = false;
            l lVar2 = fVar.f30535e;
            lVar2.f30900e.f30854j = false;
            lVar2.f30902g = false;
            lVar2.r();
            n nVar2 = this.f30836a.f30537f;
            nVar2.f30900e.f30854j = false;
            nVar2.f30902g = false;
            nVar2.q();
            c();
        }
        if (b(this.f30839d)) {
            return false;
        }
        this.f30836a.V0(0);
        this.f30836a.W0(0);
        this.f30836a.f30535e.f30903h.d(0);
        this.f30836a.f30537f.f30903h.d(0);
        return true;
    }

    public boolean h(boolean z10, int i10) {
        boolean z11;
        e.b bVar;
        boolean z12 = true;
        boolean z13 = z10 & true;
        e.b s10 = this.f30836a.s(0);
        e.b s11 = this.f30836a.s(1);
        int S = this.f30836a.S();
        int T = this.f30836a.T();
        if (z13 && (s10 == (bVar = e.b.WRAP_CONTENT) || s11 == bVar)) {
            Iterator<p> it = this.f30840e.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                p next = it.next();
                if (next.f30901f == i10 && !next.m()) {
                    z13 = false;
                    break;
                }
            }
            if (i10 == 0) {
                if (z13 && s10 == e.b.WRAP_CONTENT) {
                    this.f30836a.z0(e.b.FIXED);
                    s.f fVar = this.f30836a;
                    fVar.U0(e(fVar, 0));
                    s.f fVar2 = this.f30836a;
                    fVar2.f30535e.f30900e.d(fVar2.R());
                }
            } else if (z13 && s11 == e.b.WRAP_CONTENT) {
                this.f30836a.Q0(e.b.FIXED);
                s.f fVar3 = this.f30836a;
                fVar3.v0(e(fVar3, 1));
                s.f fVar4 = this.f30836a;
                fVar4.f30537f.f30900e.d(fVar4.v());
            }
        }
        if (i10 == 0) {
            s.f fVar5 = this.f30836a;
            e.b[] bVarArr = fVar5.S;
            if (bVarArr[0] == e.b.FIXED || bVarArr[0] == e.b.MATCH_PARENT) {
                int R = fVar5.R() + S;
                this.f30836a.f30535e.f30904i.d(R);
                this.f30836a.f30535e.f30900e.d(R - S);
                z11 = true;
            }
            z11 = false;
        } else {
            s.f fVar6 = this.f30836a;
            e.b[] bVarArr2 = fVar6.S;
            if (bVarArr2[1] == e.b.FIXED || bVarArr2[1] == e.b.MATCH_PARENT) {
                int v10 = fVar6.v() + T;
                this.f30836a.f30537f.f30904i.d(v10);
                this.f30836a.f30537f.f30900e.d(v10 - T);
                z11 = true;
            }
            z11 = false;
        }
        m();
        Iterator<p> it2 = this.f30840e.iterator();
        while (it2.hasNext()) {
            p next2 = it2.next();
            if (next2.f30901f == i10 && (next2.f30897b != this.f30836a || next2.f30902g)) {
                next2.e();
            }
        }
        Iterator<p> it3 = this.f30840e.iterator();
        while (it3.hasNext()) {
            p next3 = it3.next();
            if (next3.f30901f == i10 && (z11 || next3.f30897b != this.f30836a)) {
                if (!next3.f30903h.f30854j || !next3.f30904i.f30854j || (!(next3 instanceof c) && !next3.f30900e.f30854j)) {
                    z12 = false;
                    break;
                }
            }
        }
        this.f30836a.z0(s10);
        this.f30836a.Q0(s11);
        return z12;
    }

    public void j() {
        this.f30837b = true;
    }

    public void k() {
        this.f30838c = true;
    }

    public void m() {
        g gVar;
        Iterator<s.e> it = this.f30836a.D0.iterator();
        while (it.hasNext()) {
            s.e next = it.next();
            if (!next.f30527a) {
                e.b[] bVarArr = next.S;
                boolean z10 = false;
                e.b bVar = bVarArr[0];
                e.b bVar2 = bVarArr[1];
                int i10 = next.f30557p;
                int i11 = next.f30559q;
                e.b bVar3 = e.b.WRAP_CONTENT;
                boolean z11 = bVar == bVar3 || (bVar == e.b.MATCH_CONSTRAINT && i10 == 1);
                if (bVar2 == bVar3 || (bVar2 == e.b.MATCH_CONSTRAINT && i11 == 1)) {
                    z10 = true;
                }
                g gVar2 = next.f30535e.f30900e;
                boolean z12 = gVar2.f30854j;
                g gVar3 = next.f30537f.f30900e;
                boolean z13 = gVar3.f30854j;
                if (z12 && z13) {
                    e.b bVar4 = e.b.FIXED;
                    l(next, bVar4, gVar2.f30851g, bVar4, gVar3.f30851g);
                    next.f30527a = true;
                } else if (z12 && z10) {
                    l(next, e.b.FIXED, gVar2.f30851g, bVar3, gVar3.f30851g);
                    if (bVar2 == e.b.MATCH_CONSTRAINT) {
                        next.f30537f.f30900e.f30866m = next.v();
                    } else {
                        next.f30537f.f30900e.d(next.v());
                        next.f30527a = true;
                    }
                } else if (z13 && z11) {
                    l(next, bVar3, gVar2.f30851g, e.b.FIXED, gVar3.f30851g);
                    if (bVar == e.b.MATCH_CONSTRAINT) {
                        next.f30535e.f30900e.f30866m = next.R();
                    } else {
                        next.f30535e.f30900e.d(next.R());
                        next.f30527a = true;
                    }
                }
                if (next.f30527a && (gVar = next.f30537f.f30879l) != null) {
                    gVar.d(next.n());
                }
            }
        }
    }

    public void n(b.InterfaceC0356b interfaceC0356b) {
        this.f30842g = interfaceC0356b;
    }
}
