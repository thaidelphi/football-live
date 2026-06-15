package s;

import com.google.android.gms.ads.AdRequest;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import s.e;
import t.b;
/* compiled from: ConstraintWidgetContainer.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class f extends l {
    int J0;
    int K0;
    int L0;
    int M0;
    t.b E0 = new t.b(this);
    public t.e F0 = new t.e(this);
    protected b.InterfaceC0356b G0 = null;
    private boolean H0 = false;
    protected r.d I0 = new r.d();
    public int N0 = 0;
    public int O0 = 0;
    c[] P0 = new c[4];
    c[] Q0 = new c[4];
    public boolean R0 = false;
    public boolean S0 = false;
    public boolean T0 = false;
    public int U0 = 0;
    public int V0 = 0;
    private int W0 = 257;
    public boolean X0 = false;
    private boolean Y0 = false;
    private boolean Z0 = false;

    /* renamed from: a1  reason: collision with root package name */
    int f30586a1 = 0;

    /* renamed from: b1  reason: collision with root package name */
    private WeakReference<d> f30587b1 = null;

    /* renamed from: c1  reason: collision with root package name */
    private WeakReference<d> f30588c1 = null;

    /* renamed from: d1  reason: collision with root package name */
    private WeakReference<d> f30589d1 = null;

    /* renamed from: e1  reason: collision with root package name */
    private WeakReference<d> f30590e1 = null;

    /* renamed from: f1  reason: collision with root package name */
    public b.a f30591f1 = new b.a();

    public static boolean A1(e eVar, b.InterfaceC0356b interfaceC0356b, b.a aVar, int i10) {
        int i11;
        int i12;
        if (interfaceC0356b == null) {
            return false;
        }
        aVar.f30824a = eVar.y();
        aVar.f30825b = eVar.O();
        aVar.f30826c = eVar.R();
        aVar.f30827d = eVar.v();
        aVar.f30832i = false;
        aVar.f30833j = i10;
        e.b bVar = aVar.f30824a;
        e.b bVar2 = e.b.MATCH_CONSTRAINT;
        boolean z10 = bVar == bVar2;
        boolean z11 = aVar.f30825b == bVar2;
        boolean z12 = z10 && eVar.W > 0.0f;
        boolean z13 = z11 && eVar.W > 0.0f;
        if (z10 && eVar.V(0) && eVar.f30557p == 0 && !z12) {
            aVar.f30824a = e.b.WRAP_CONTENT;
            if (z11 && eVar.f30559q == 0) {
                aVar.f30824a = e.b.FIXED;
            }
            z10 = false;
        }
        if (z11 && eVar.V(1) && eVar.f30559q == 0 && !z13) {
            aVar.f30825b = e.b.WRAP_CONTENT;
            if (z10 && eVar.f30557p == 0) {
                aVar.f30825b = e.b.FIXED;
            }
            z11 = false;
        }
        if (eVar.e0()) {
            aVar.f30824a = e.b.FIXED;
            z10 = false;
        }
        if (eVar.f0()) {
            aVar.f30825b = e.b.FIXED;
            z11 = false;
        }
        if (z12) {
            if (eVar.f30561r[0] == 4) {
                aVar.f30824a = e.b.FIXED;
            } else if (!z11) {
                e.b bVar3 = aVar.f30825b;
                e.b bVar4 = e.b.FIXED;
                if (bVar3 == bVar4) {
                    i12 = aVar.f30827d;
                } else {
                    aVar.f30824a = e.b.WRAP_CONTENT;
                    interfaceC0356b.b(eVar, aVar);
                    i12 = aVar.f30829f;
                }
                aVar.f30824a = bVar4;
                int i13 = eVar.X;
                if (i13 != 0 && i13 != -1) {
                    aVar.f30826c = (int) (eVar.t() / i12);
                } else {
                    aVar.f30826c = (int) (eVar.t() * i12);
                }
            }
        }
        if (z13) {
            if (eVar.f30561r[1] == 4) {
                aVar.f30825b = e.b.FIXED;
            } else if (!z10) {
                e.b bVar5 = aVar.f30824a;
                e.b bVar6 = e.b.FIXED;
                if (bVar5 == bVar6) {
                    i11 = aVar.f30826c;
                } else {
                    aVar.f30825b = e.b.WRAP_CONTENT;
                    interfaceC0356b.b(eVar, aVar);
                    i11 = aVar.f30828e;
                }
                aVar.f30825b = bVar6;
                int i14 = eVar.X;
                if (i14 != 0 && i14 != -1) {
                    aVar.f30827d = (int) (i11 * eVar.t());
                } else {
                    aVar.f30827d = (int) (i11 / eVar.t());
                }
            }
        }
        interfaceC0356b.b(eVar, aVar);
        eVar.U0(aVar.f30828e);
        eVar.v0(aVar.f30829f);
        eVar.u0(aVar.f30831h);
        eVar.k0(aVar.f30830g);
        aVar.f30833j = b.a.f30821k;
        return aVar.f30832i;
    }

    private void C1() {
        this.N0 = 0;
        this.O0 = 0;
    }

    private void g1(e eVar) {
        int i10 = this.N0 + 1;
        c[] cVarArr = this.Q0;
        if (i10 >= cVarArr.length) {
            this.Q0 = (c[]) Arrays.copyOf(cVarArr, cVarArr.length * 2);
        }
        this.Q0[this.N0] = new c(eVar, 0, x1());
        this.N0++;
    }

    private void j1(d dVar, r.i iVar) {
        this.I0.h(iVar, this.I0.q(dVar), 0, 5);
    }

    private void k1(d dVar, r.i iVar) {
        this.I0.h(this.I0.q(dVar), iVar, 0, 5);
    }

    private void l1(e eVar) {
        int i10 = this.O0 + 1;
        c[] cVarArr = this.P0;
        if (i10 >= cVarArr.length) {
            this.P0 = (c[]) Arrays.copyOf(cVarArr, cVarArr.length * 2);
        }
        this.P0[this.O0] = new c(eVar, 1, x1());
        this.O0++;
    }

    public boolean B1(int i10) {
        return (this.W0 & i10) == i10;
    }

    public void D1(b.InterfaceC0356b interfaceC0356b) {
        this.G0 = interfaceC0356b;
        this.F0.n(interfaceC0356b);
    }

    public void E1(int i10) {
        this.W0 = i10;
        r.d.f30215r = B1(AdRequest.MAX_CONTENT_URL_LENGTH);
    }

    public void F1(boolean z10) {
        this.H0 = z10;
    }

    public void G1(r.d dVar, boolean[] zArr) {
        zArr[2] = false;
        boolean B1 = B1(64);
        Z0(dVar, B1);
        int size = this.D0.size();
        for (int i10 = 0; i10 < size; i10++) {
            this.D0.get(i10).Z0(dVar, B1);
        }
    }

    public void H1() {
        this.E0.e(this);
    }

    @Override // s.e
    public void Y0(boolean z10, boolean z11) {
        super.Y0(z10, z11);
        int size = this.D0.size();
        for (int i10 = 0; i10 < size; i10++) {
            this.D0.get(i10).Y0(z10, z11);
        }
    }

    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v7 */
    /* JADX WARN: Type inference failed for: r6v8, types: [boolean] */
    @Override // s.l
    public void b1() {
        int i10;
        int i11;
        boolean z10;
        boolean z11;
        ?? r62;
        boolean z12;
        e.b bVar;
        int i12 = 0;
        this.Y = 0;
        this.Z = 0;
        this.Y0 = false;
        this.Z0 = false;
        int size = this.D0.size();
        int max = Math.max(0, R());
        int max2 = Math.max(0, v());
        e.b[] bVarArr = this.S;
        e.b bVar2 = bVarArr[1];
        e.b bVar3 = bVarArr[0];
        if (j.b(this.W0, 1)) {
            t.h.h(this, r1());
            for (int i13 = 0; i13 < size; i13++) {
                e eVar = this.D0.get(i13);
                if (eVar.d0() && !(eVar instanceof g) && !(eVar instanceof a) && !(eVar instanceof k) && !eVar.c0()) {
                    e.b s10 = eVar.s(0);
                    e.b s11 = eVar.s(1);
                    e.b bVar4 = e.b.MATCH_CONSTRAINT;
                    if (!(s10 == bVar4 && eVar.f30557p != 1 && s11 == bVar4 && eVar.f30559q != 1)) {
                        A1(eVar, this.G0, new b.a(), b.a.f30821k);
                    }
                }
            }
        }
        if (size <= 2 || !((bVar3 == (bVar = e.b.WRAP_CONTENT) || bVar2 == bVar) && j.b(this.W0, 1024) && t.i.c(this, r1()))) {
            i10 = max2;
            i11 = max;
            z10 = false;
        } else {
            if (bVar3 == bVar) {
                if (max < R() && max > 0) {
                    U0(max);
                    this.Y0 = true;
                } else {
                    max = R();
                }
            }
            if (bVar2 == bVar) {
                if (max2 < v() && max2 > 0) {
                    v0(max2);
                    this.Z0 = true;
                } else {
                    max2 = v();
                }
            }
            i10 = max2;
            i11 = max;
            z10 = true;
        }
        boolean z13 = B1(64) || B1(128);
        r.d dVar = this.I0;
        dVar.f30231h = false;
        dVar.f30232i = false;
        if (this.W0 != 0 && z13) {
            dVar.f30232i = true;
        }
        ArrayList<e> arrayList = this.D0;
        e.b y10 = y();
        e.b bVar5 = e.b.WRAP_CONTENT;
        boolean z14 = y10 == bVar5 || O() == bVar5;
        C1();
        for (int i14 = 0; i14 < size; i14++) {
            e eVar2 = this.D0.get(i14);
            if (eVar2 instanceof l) {
                ((l) eVar2).b1();
            }
        }
        boolean B1 = B1(64);
        boolean z15 = z10;
        int i15 = 0;
        boolean z16 = true;
        while (z16) {
            int i16 = i15 + 1;
            try {
                this.I0.D();
                C1();
                k(this.I0);
                for (int i17 = i12; i17 < size; i17++) {
                    this.D0.get(i17).k(this.I0);
                }
                z16 = f1(this.I0);
                WeakReference<d> weakReference = this.f30587b1;
                if (weakReference != null && weakReference.get() != null) {
                    k1(this.f30587b1.get(), this.I0.q(this.I));
                    this.f30587b1 = null;
                }
                WeakReference<d> weakReference2 = this.f30589d1;
                if (weakReference2 != null && weakReference2.get() != null) {
                    j1(this.f30589d1.get(), this.I0.q(this.K));
                    this.f30589d1 = null;
                }
                WeakReference<d> weakReference3 = this.f30588c1;
                if (weakReference3 != null && weakReference3.get() != null) {
                    k1(this.f30588c1.get(), this.I0.q(this.H));
                    this.f30588c1 = null;
                }
                WeakReference<d> weakReference4 = this.f30590e1;
                if (weakReference4 != null && weakReference4.get() != null) {
                    j1(this.f30590e1.get(), this.I0.q(this.J));
                    this.f30590e1 = null;
                }
                if (z16) {
                    this.I0.z();
                }
            } catch (Exception e8) {
                e8.printStackTrace();
                System.out.println("EXCEPTION : " + e8);
            }
            if (z16) {
                G1(this.I0, j.f30593a);
            } else {
                Z0(this.I0, B1);
                for (int i18 = 0; i18 < size; i18++) {
                    this.D0.get(i18).Z0(this.I0, B1);
                }
            }
            if (z14 && i16 < 8 && j.f30593a[2]) {
                int i19 = 0;
                int i20 = 0;
                for (int i21 = 0; i21 < size; i21++) {
                    e eVar3 = this.D0.get(i21);
                    i19 = Math.max(i19, eVar3.Y + eVar3.R());
                    i20 = Math.max(i20, eVar3.Z + eVar3.v());
                }
                int max3 = Math.max(this.f30538f0, i19);
                int max4 = Math.max(this.f30540g0, i20);
                e.b bVar6 = e.b.WRAP_CONTENT;
                if (bVar3 != bVar6 || R() >= max3) {
                    z11 = false;
                } else {
                    U0(max3);
                    this.S[0] = bVar6;
                    z11 = true;
                    z15 = true;
                }
                if (bVar2 == bVar6 && v() < max4) {
                    v0(max4);
                    this.S[1] = bVar6;
                    z11 = true;
                    z15 = true;
                }
            } else {
                z11 = false;
            }
            int max5 = Math.max(this.f30538f0, R());
            if (max5 > R()) {
                U0(max5);
                this.S[0] = e.b.FIXED;
                z11 = true;
                z15 = true;
            }
            int max6 = Math.max(this.f30540g0, v());
            if (max6 > v()) {
                v0(max6);
                r62 = 1;
                this.S[1] = e.b.FIXED;
                z11 = true;
                z12 = true;
            } else {
                r62 = 1;
                z12 = z15;
            }
            if (!z12) {
                e.b bVar7 = this.S[0];
                e.b bVar8 = e.b.WRAP_CONTENT;
                if (bVar7 == bVar8 && i11 > 0 && R() > i11) {
                    this.Y0 = r62;
                    this.S[0] = e.b.FIXED;
                    U0(i11);
                    z11 = r62;
                    z12 = z11;
                }
                if (this.S[r62] == bVar8 && i10 > 0 && v() > i10) {
                    this.Z0 = r62;
                    this.S[r62] = e.b.FIXED;
                    v0(i10);
                    z15 = true;
                    z16 = true;
                    i15 = i16;
                    i12 = 0;
                }
            }
            z16 = z11;
            z15 = z12;
            i15 = i16;
            i12 = 0;
        }
        this.D0 = arrayList;
        if (z15) {
            e.b[] bVarArr2 = this.S;
            bVarArr2[0] = bVar3;
            bVarArr2[1] = bVar2;
        }
        j0(this.I0.v());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void e1(e eVar, int i10) {
        if (i10 == 0) {
            g1(eVar);
        } else if (i10 == 1) {
            l1(eVar);
        }
    }

    public boolean f1(r.d dVar) {
        boolean B1 = B1(64);
        g(dVar, B1);
        int size = this.D0.size();
        boolean z10 = false;
        for (int i10 = 0; i10 < size; i10++) {
            e eVar = this.D0.get(i10);
            eVar.C0(0, false);
            eVar.C0(1, false);
            if (eVar instanceof a) {
                z10 = true;
            }
        }
        if (z10) {
            for (int i11 = 0; i11 < size; i11++) {
                e eVar2 = this.D0.get(i11);
                if (eVar2 instanceof a) {
                    ((a) eVar2).h1();
                }
            }
        }
        for (int i12 = 0; i12 < size; i12++) {
            e eVar3 = this.D0.get(i12);
            if (eVar3.f()) {
                eVar3.g(dVar, B1);
            }
        }
        if (r.d.f30215r) {
            HashSet<e> hashSet = new HashSet<>();
            for (int i13 = 0; i13 < size; i13++) {
                e eVar4 = this.D0.get(i13);
                if (!eVar4.f()) {
                    hashSet.add(eVar4);
                }
            }
            e(this, dVar, hashSet, y() == e.b.WRAP_CONTENT ? 0 : 1, false);
            Iterator<e> it = hashSet.iterator();
            while (it.hasNext()) {
                e next = it.next();
                j.a(this, dVar, next);
                next.g(dVar, B1);
            }
        } else {
            for (int i14 = 0; i14 < size; i14++) {
                e eVar5 = this.D0.get(i14);
                if (eVar5 instanceof f) {
                    e.b[] bVarArr = eVar5.S;
                    e.b bVar = bVarArr[0];
                    e.b bVar2 = bVarArr[1];
                    e.b bVar3 = e.b.WRAP_CONTENT;
                    if (bVar == bVar3) {
                        eVar5.z0(e.b.FIXED);
                    }
                    if (bVar2 == bVar3) {
                        eVar5.Q0(e.b.FIXED);
                    }
                    eVar5.g(dVar, B1);
                    if (bVar == bVar3) {
                        eVar5.z0(bVar);
                    }
                    if (bVar2 == bVar3) {
                        eVar5.Q0(bVar2);
                    }
                } else {
                    j.a(this, dVar, eVar5);
                    if (!eVar5.f()) {
                        eVar5.g(dVar, B1);
                    }
                }
            }
        }
        if (this.N0 > 0) {
            b.b(this, dVar, null, 0);
        }
        if (this.O0 > 0) {
            b.b(this, dVar, null, 1);
        }
        return true;
    }

    @Override // s.l, s.e
    public void h0() {
        this.I0.D();
        this.J0 = 0;
        this.L0 = 0;
        this.K0 = 0;
        this.M0 = 0;
        this.X0 = false;
        super.h0();
    }

    public void h1(d dVar) {
        WeakReference<d> weakReference = this.f30590e1;
        if (weakReference == null || weakReference.get() == null || dVar.d() > this.f30590e1.get().d()) {
            this.f30590e1 = new WeakReference<>(dVar);
        }
    }

    public void i1(d dVar) {
        WeakReference<d> weakReference = this.f30588c1;
        if (weakReference == null || weakReference.get() == null || dVar.d() > this.f30588c1.get().d()) {
            this.f30588c1 = new WeakReference<>(dVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void m1(d dVar) {
        WeakReference<d> weakReference = this.f30589d1;
        if (weakReference == null || weakReference.get() == null || dVar.d() > this.f30589d1.get().d()) {
            this.f30589d1 = new WeakReference<>(dVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void n1(d dVar) {
        WeakReference<d> weakReference = this.f30587b1;
        if (weakReference == null || weakReference.get() == null || dVar.d() > this.f30587b1.get().d()) {
            this.f30587b1 = new WeakReference<>(dVar);
        }
    }

    public boolean o1(boolean z10) {
        return this.F0.f(z10);
    }

    public boolean p1(boolean z10) {
        return this.F0.g(z10);
    }

    public boolean q1(boolean z10, int i10) {
        return this.F0.h(z10, i10);
    }

    public b.InterfaceC0356b r1() {
        return this.G0;
    }

    public int s1() {
        return this.W0;
    }

    public r.d t1() {
        return this.I0;
    }

    public void u1() {
        this.F0.j();
    }

    public void v1() {
        this.F0.k();
    }

    public boolean w1() {
        return this.Z0;
    }

    public boolean x1() {
        return this.H0;
    }

    public boolean y1() {
        return this.Y0;
    }

    public long z1(int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18) {
        this.J0 = i17;
        this.K0 = i18;
        return this.E0.d(this, i10, i17, i18, i11, i12, i13, i14, i15, i16);
    }
}
