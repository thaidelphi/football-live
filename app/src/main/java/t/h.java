package t;

import java.util.ArrayList;
import java.util.Iterator;
import s.d;
import s.e;
import t.b;
/* compiled from: Direct.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class h {

    /* renamed from: a  reason: collision with root package name */
    private static b.a f30867a = new b.a();

    private static boolean a(s.e eVar) {
        e.b y10 = eVar.y();
        e.b O = eVar.O();
        s.f fVar = eVar.I() != null ? (s.f) eVar.I() : null;
        if (fVar != null) {
            fVar.y();
            e.b bVar = e.b.FIXED;
        }
        if (fVar != null) {
            fVar.O();
            e.b bVar2 = e.b.FIXED;
        }
        e.b bVar3 = e.b.FIXED;
        boolean z10 = y10 == bVar3 || y10 == e.b.WRAP_CONTENT || (y10 == e.b.MATCH_CONSTRAINT && eVar.f30557p == 0 && eVar.W == 0.0f && eVar.V(0)) || eVar.e0();
        boolean z11 = O == bVar3 || O == e.b.WRAP_CONTENT || (O == e.b.MATCH_CONSTRAINT && eVar.f30559q == 0 && eVar.W == 0.0f && eVar.V(1)) || eVar.f0();
        if (eVar.W <= 0.0f || !(z10 || z11)) {
            return z10 && z11;
        }
        return true;
    }

    private static void b(s.e eVar, b.InterfaceC0356b interfaceC0356b, boolean z10) {
        s.d dVar;
        s.d dVar2;
        s.d dVar3;
        s.d dVar4;
        s.d dVar5;
        if (!(eVar instanceof s.f) && eVar.d0() && a(eVar)) {
            s.f.A1(eVar, interfaceC0356b, new b.a(), b.a.f30821k);
        }
        s.d m7 = eVar.m(d.b.LEFT);
        s.d m10 = eVar.m(d.b.RIGHT);
        int d10 = m7.d();
        int d11 = m10.d();
        if (m7.c() != null && m7.m()) {
            Iterator<s.d> it = m7.c().iterator();
            while (it.hasNext()) {
                s.d next = it.next();
                s.e eVar2 = next.f30510d;
                boolean a10 = a(eVar2);
                if (eVar2.d0() && a10) {
                    s.f.A1(eVar2, interfaceC0356b, new b.a(), b.a.f30821k);
                }
                e.b y10 = eVar2.y();
                e.b bVar = e.b.MATCH_CONSTRAINT;
                if (y10 == bVar && !a10) {
                    if (eVar2.y() == bVar && eVar2.f30565t >= 0 && eVar2.f30563s >= 0 && (eVar2.Q() == 8 || (eVar2.f30557p == 0 && eVar2.t() == 0.0f))) {
                        if (!eVar2.Z() && !eVar2.c0()) {
                            if (((next == eVar2.H && (dVar5 = eVar2.J.f30512f) != null && dVar5.m()) || (next == eVar2.J && (dVar4 = eVar2.H.f30512f) != null && dVar4.m())) && !eVar2.Z()) {
                                e(eVar, interfaceC0356b, eVar2, z10);
                            }
                        }
                    }
                } else if (!eVar2.d0()) {
                    s.d dVar6 = eVar2.H;
                    if (next == dVar6 && eVar2.J.f30512f == null) {
                        int e8 = dVar6.e() + d10;
                        eVar2.p0(e8, eVar2.R() + e8);
                        b(eVar2, interfaceC0356b, z10);
                    } else {
                        s.d dVar7 = eVar2.J;
                        if (next == dVar7 && dVar6.f30512f == null) {
                            int e10 = d10 - dVar7.e();
                            eVar2.p0(e10 - eVar2.R(), e10);
                            b(eVar2, interfaceC0356b, z10);
                        } else if (next == dVar6 && (dVar3 = dVar7.f30512f) != null && dVar3.m() && !eVar2.Z()) {
                            d(interfaceC0356b, eVar2, z10);
                        }
                    }
                }
            }
        }
        if ((eVar instanceof s.g) || m10.c() == null || !m10.m()) {
            return;
        }
        Iterator<s.d> it2 = m10.c().iterator();
        while (it2.hasNext()) {
            s.d next2 = it2.next();
            s.e eVar3 = next2.f30510d;
            boolean a11 = a(eVar3);
            if (eVar3.d0() && a11) {
                s.f.A1(eVar3, interfaceC0356b, new b.a(), b.a.f30821k);
            }
            boolean z11 = (next2 == eVar3.H && (dVar2 = eVar3.J.f30512f) != null && dVar2.m()) || (next2 == eVar3.J && (dVar = eVar3.H.f30512f) != null && dVar.m());
            e.b y11 = eVar3.y();
            e.b bVar2 = e.b.MATCH_CONSTRAINT;
            if (y11 == bVar2 && !a11) {
                if (eVar3.y() == bVar2 && eVar3.f30565t >= 0 && eVar3.f30563s >= 0 && (eVar3.Q() == 8 || (eVar3.f30557p == 0 && eVar3.t() == 0.0f))) {
                    if (!eVar3.Z() && !eVar3.c0() && z11 && !eVar3.Z()) {
                        e(eVar, interfaceC0356b, eVar3, z10);
                    }
                }
            } else if (!eVar3.d0()) {
                s.d dVar8 = eVar3.H;
                if (next2 == dVar8 && eVar3.J.f30512f == null) {
                    int e11 = dVar8.e() + d11;
                    eVar3.p0(e11, eVar3.R() + e11);
                    b(eVar3, interfaceC0356b, z10);
                } else {
                    s.d dVar9 = eVar3.J;
                    if (next2 == dVar9 && dVar8.f30512f == null) {
                        int e12 = d11 - dVar9.e();
                        eVar3.p0(e12 - eVar3.R(), e12);
                        b(eVar3, interfaceC0356b, z10);
                    } else if (z11 && !eVar3.Z()) {
                        d(interfaceC0356b, eVar3, z10);
                    }
                }
            }
        }
    }

    private static void c(s.a aVar, b.InterfaceC0356b interfaceC0356b, int i10, boolean z10) {
        if (aVar.c1()) {
            if (i10 == 0) {
                b(aVar, interfaceC0356b, z10);
            } else {
                i(aVar, interfaceC0356b);
            }
        }
    }

    private static void d(b.InterfaceC0356b interfaceC0356b, s.e eVar, boolean z10) {
        float w10 = eVar.w();
        int d10 = eVar.H.f30512f.d();
        int d11 = eVar.J.f30512f.d();
        int e8 = eVar.H.e() + d10;
        int e10 = d11 - eVar.J.e();
        if (d10 == d11) {
            w10 = 0.5f;
        } else {
            d10 = e8;
            d11 = e10;
        }
        int R = eVar.R();
        int i10 = (d11 - d10) - R;
        if (d10 > d11) {
            i10 = (d10 - d11) - R;
        }
        int i11 = ((int) ((w10 * i10) + 0.5f)) + d10;
        int i12 = i11 + R;
        if (d10 > d11) {
            i12 = i11 - R;
        }
        eVar.p0(i11, i12);
        b(eVar, interfaceC0356b, z10);
    }

    private static void e(s.e eVar, b.InterfaceC0356b interfaceC0356b, s.e eVar2, boolean z10) {
        int R;
        float w10 = eVar2.w();
        int d10 = eVar2.H.f30512f.d() + eVar2.H.e();
        int d11 = eVar2.J.f30512f.d() - eVar2.J.e();
        if (d11 >= d10) {
            int R2 = eVar2.R();
            if (eVar2.Q() != 8) {
                int i10 = eVar2.f30557p;
                if (i10 == 2) {
                    if (eVar instanceof s.f) {
                        R = eVar.R();
                    } else {
                        R = eVar.I().R();
                    }
                    R2 = (int) (eVar2.w() * 0.5f * R);
                } else if (i10 == 0) {
                    R2 = d11 - d10;
                }
                R2 = Math.max(eVar2.f30563s, R2);
                int i11 = eVar2.f30565t;
                if (i11 > 0) {
                    R2 = Math.min(i11, R2);
                }
            }
            int i12 = d10 + ((int) ((w10 * ((d11 - d10) - R2)) + 0.5f));
            eVar2.p0(i12, R2 + i12);
            b(eVar2, interfaceC0356b, z10);
        }
    }

    private static void f(b.InterfaceC0356b interfaceC0356b, s.e eVar) {
        float M = eVar.M();
        int d10 = eVar.I.f30512f.d();
        int d11 = eVar.K.f30512f.d();
        int e8 = eVar.I.e() + d10;
        int e10 = d11 - eVar.K.e();
        if (d10 == d11) {
            M = 0.5f;
        } else {
            d10 = e8;
            d11 = e10;
        }
        int v10 = eVar.v();
        int i10 = (d11 - d10) - v10;
        if (d10 > d11) {
            i10 = (d10 - d11) - v10;
        }
        int i11 = (int) ((M * i10) + 0.5f);
        int i12 = d10 + i11;
        int i13 = i12 + v10;
        if (d10 > d11) {
            i12 = d10 - i11;
            i13 = i12 - v10;
        }
        eVar.s0(i12, i13);
        i(eVar, interfaceC0356b);
    }

    private static void g(s.e eVar, b.InterfaceC0356b interfaceC0356b, s.e eVar2) {
        int v10;
        float M = eVar2.M();
        int d10 = eVar2.I.f30512f.d() + eVar2.I.e();
        int d11 = eVar2.K.f30512f.d() - eVar2.K.e();
        if (d11 >= d10) {
            int v11 = eVar2.v();
            if (eVar2.Q() != 8) {
                int i10 = eVar2.f30559q;
                if (i10 == 2) {
                    if (eVar instanceof s.f) {
                        v10 = eVar.v();
                    } else {
                        v10 = eVar.I().v();
                    }
                    v11 = (int) (M * 0.5f * v10);
                } else if (i10 == 0) {
                    v11 = d11 - d10;
                }
                v11 = Math.max(eVar2.f30569v, v11);
                int i11 = eVar2.f30571w;
                if (i11 > 0) {
                    v11 = Math.min(i11, v11);
                }
            }
            int i12 = d10 + ((int) ((M * ((d11 - d10) - v11)) + 0.5f));
            eVar2.s0(i12, v11 + i12);
            i(eVar2, interfaceC0356b);
        }
    }

    public static void h(s.f fVar, b.InterfaceC0356b interfaceC0356b) {
        e.b y10 = fVar.y();
        e.b O = fVar.O();
        fVar.i0();
        ArrayList<s.e> a12 = fVar.a1();
        int size = a12.size();
        for (int i10 = 0; i10 < size; i10++) {
            a12.get(i10).i0();
        }
        boolean x12 = fVar.x1();
        if (y10 == e.b.FIXED) {
            fVar.p0(0, fVar.R());
        } else {
            fVar.q0(0);
        }
        boolean z10 = false;
        boolean z11 = false;
        for (int i11 = 0; i11 < size; i11++) {
            s.e eVar = a12.get(i11);
            if (eVar instanceof s.g) {
                s.g gVar = (s.g) eVar;
                if (gVar.b1() == 1) {
                    if (gVar.c1() != -1) {
                        gVar.f1(gVar.c1());
                    } else if (gVar.d1() != -1 && fVar.e0()) {
                        gVar.f1(fVar.R() - gVar.d1());
                    } else if (fVar.e0()) {
                        gVar.f1((int) ((gVar.e1() * fVar.R()) + 0.5f));
                    }
                    z10 = true;
                }
            } else if ((eVar instanceof s.a) && ((s.a) eVar).g1() == 0) {
                z11 = true;
            }
        }
        if (z10) {
            for (int i12 = 0; i12 < size; i12++) {
                s.e eVar2 = a12.get(i12);
                if (eVar2 instanceof s.g) {
                    s.g gVar2 = (s.g) eVar2;
                    if (gVar2.b1() == 1) {
                        b(gVar2, interfaceC0356b, x12);
                    }
                }
            }
        }
        b(fVar, interfaceC0356b, x12);
        if (z11) {
            for (int i13 = 0; i13 < size; i13++) {
                s.e eVar3 = a12.get(i13);
                if (eVar3 instanceof s.a) {
                    s.a aVar = (s.a) eVar3;
                    if (aVar.g1() == 0) {
                        c(aVar, interfaceC0356b, 0, x12);
                    }
                }
            }
        }
        if (O == e.b.FIXED) {
            fVar.s0(0, fVar.v());
        } else {
            fVar.r0(0);
        }
        boolean z12 = false;
        boolean z13 = false;
        for (int i14 = 0; i14 < size; i14++) {
            s.e eVar4 = a12.get(i14);
            if (eVar4 instanceof s.g) {
                s.g gVar3 = (s.g) eVar4;
                if (gVar3.b1() == 0) {
                    if (gVar3.c1() != -1) {
                        gVar3.f1(gVar3.c1());
                    } else if (gVar3.d1() != -1 && fVar.f0()) {
                        gVar3.f1(fVar.v() - gVar3.d1());
                    } else if (fVar.f0()) {
                        gVar3.f1((int) ((gVar3.e1() * fVar.v()) + 0.5f));
                    }
                    z12 = true;
                }
            } else if ((eVar4 instanceof s.a) && ((s.a) eVar4).g1() == 1) {
                z13 = true;
            }
        }
        if (z12) {
            for (int i15 = 0; i15 < size; i15++) {
                s.e eVar5 = a12.get(i15);
                if (eVar5 instanceof s.g) {
                    s.g gVar4 = (s.g) eVar5;
                    if (gVar4.b1() == 0) {
                        i(gVar4, interfaceC0356b);
                    }
                }
            }
        }
        i(fVar, interfaceC0356b);
        if (z13) {
            for (int i16 = 0; i16 < size; i16++) {
                s.e eVar6 = a12.get(i16);
                if (eVar6 instanceof s.a) {
                    s.a aVar2 = (s.a) eVar6;
                    if (aVar2.g1() == 1) {
                        c(aVar2, interfaceC0356b, 1, x12);
                    }
                }
            }
        }
        for (int i17 = 0; i17 < size; i17++) {
            s.e eVar7 = a12.get(i17);
            if (eVar7.d0() && a(eVar7)) {
                s.f.A1(eVar7, interfaceC0356b, f30867a, b.a.f30821k);
                b(eVar7, interfaceC0356b, x12);
                i(eVar7, interfaceC0356b);
            }
        }
    }

    private static void i(s.e eVar, b.InterfaceC0356b interfaceC0356b) {
        s.d dVar;
        s.d dVar2;
        s.d dVar3;
        s.d dVar4;
        s.d dVar5;
        if (!(eVar instanceof s.f) && eVar.d0() && a(eVar)) {
            s.f.A1(eVar, interfaceC0356b, new b.a(), b.a.f30821k);
        }
        s.d m7 = eVar.m(d.b.TOP);
        s.d m10 = eVar.m(d.b.BOTTOM);
        int d10 = m7.d();
        int d11 = m10.d();
        if (m7.c() != null && m7.m()) {
            Iterator<s.d> it = m7.c().iterator();
            while (it.hasNext()) {
                s.d next = it.next();
                s.e eVar2 = next.f30510d;
                boolean a10 = a(eVar2);
                if (eVar2.d0() && a10) {
                    s.f.A1(eVar2, interfaceC0356b, new b.a(), b.a.f30821k);
                }
                e.b O = eVar2.O();
                e.b bVar = e.b.MATCH_CONSTRAINT;
                if (O == bVar && !a10) {
                    if (eVar2.O() == bVar && eVar2.f30571w >= 0 && eVar2.f30569v >= 0 && (eVar2.Q() == 8 || (eVar2.f30559q == 0 && eVar2.t() == 0.0f))) {
                        if (!eVar2.b0() && !eVar2.c0()) {
                            if (((next == eVar2.I && (dVar5 = eVar2.K.f30512f) != null && dVar5.m()) || (next == eVar2.K && (dVar4 = eVar2.I.f30512f) != null && dVar4.m())) && !eVar2.b0()) {
                                g(eVar, interfaceC0356b, eVar2);
                            }
                        }
                    }
                } else if (!eVar2.d0()) {
                    s.d dVar6 = eVar2.I;
                    if (next == dVar6 && eVar2.K.f30512f == null) {
                        int e8 = dVar6.e() + d10;
                        eVar2.s0(e8, eVar2.v() + e8);
                        i(eVar2, interfaceC0356b);
                    } else {
                        s.d dVar7 = eVar2.K;
                        if (next == dVar7 && dVar7.f30512f == null) {
                            int e10 = d10 - dVar7.e();
                            eVar2.s0(e10 - eVar2.v(), e10);
                            i(eVar2, interfaceC0356b);
                        } else if (next == dVar6 && (dVar3 = dVar7.f30512f) != null && dVar3.m()) {
                            f(interfaceC0356b, eVar2);
                        }
                    }
                }
            }
        }
        if (eVar instanceof s.g) {
            return;
        }
        if (m10.c() != null && m10.m()) {
            Iterator<s.d> it2 = m10.c().iterator();
            while (it2.hasNext()) {
                s.d next2 = it2.next();
                s.e eVar3 = next2.f30510d;
                boolean a11 = a(eVar3);
                if (eVar3.d0() && a11) {
                    s.f.A1(eVar3, interfaceC0356b, new b.a(), b.a.f30821k);
                }
                boolean z10 = (next2 == eVar3.I && (dVar2 = eVar3.K.f30512f) != null && dVar2.m()) || (next2 == eVar3.K && (dVar = eVar3.I.f30512f) != null && dVar.m());
                e.b O2 = eVar3.O();
                e.b bVar2 = e.b.MATCH_CONSTRAINT;
                if (O2 == bVar2 && !a11) {
                    if (eVar3.O() == bVar2 && eVar3.f30571w >= 0 && eVar3.f30569v >= 0 && (eVar3.Q() == 8 || (eVar3.f30559q == 0 && eVar3.t() == 0.0f))) {
                        if (!eVar3.b0() && !eVar3.c0() && z10 && !eVar3.b0()) {
                            g(eVar, interfaceC0356b, eVar3);
                        }
                    }
                } else if (!eVar3.d0()) {
                    s.d dVar8 = eVar3.I;
                    if (next2 == dVar8 && eVar3.K.f30512f == null) {
                        int e11 = dVar8.e() + d11;
                        eVar3.s0(e11, eVar3.v() + e11);
                        i(eVar3, interfaceC0356b);
                    } else {
                        s.d dVar9 = eVar3.K;
                        if (next2 == dVar9 && dVar8.f30512f == null) {
                            int e12 = d11 - dVar9.e();
                            eVar3.s0(e12 - eVar3.v(), e12);
                            i(eVar3, interfaceC0356b);
                        } else if (z10 && !eVar3.b0()) {
                            f(interfaceC0356b, eVar3);
                        }
                    }
                }
            }
        }
        s.d m11 = eVar.m(d.b.BASELINE);
        if (m11.c() == null || !m11.m()) {
            return;
        }
        int d12 = m11.d();
        Iterator<s.d> it3 = m11.c().iterator();
        while (it3.hasNext()) {
            s.d next3 = it3.next();
            s.e eVar4 = next3.f30510d;
            boolean a12 = a(eVar4);
            if (eVar4.d0() && a12) {
                s.f.A1(eVar4, interfaceC0356b, new b.a(), b.a.f30821k);
            }
            if (eVar4.O() != e.b.MATCH_CONSTRAINT || a12) {
                if (!eVar4.d0() && next3 == eVar4.L) {
                    eVar4.o0(d12);
                    i(eVar4, interfaceC0356b);
                }
            }
        }
    }
}
