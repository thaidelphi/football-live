package t;

import java.util.ArrayList;
import s.e;
/* compiled from: Grouping.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class i {
    public static o a(s.e eVar, int i10, ArrayList<o> arrayList, o oVar) {
        int i11;
        int b12;
        if (i10 == 0) {
            i11 = eVar.A0;
        } else {
            i11 = eVar.B0;
        }
        if (i11 != -1 && (oVar == null || i11 != oVar.f30883b)) {
            int i12 = 0;
            while (true) {
                if (i12 >= arrayList.size()) {
                    break;
                }
                o oVar2 = arrayList.get(i12);
                if (oVar2.c() == i11) {
                    if (oVar != null) {
                        oVar.g(i10, oVar2);
                        arrayList.remove(oVar);
                    }
                    oVar = oVar2;
                } else {
                    i12++;
                }
            }
        } else if (i11 != -1) {
            return oVar;
        }
        if (oVar == null) {
            if ((eVar instanceof s.i) && (b12 = ((s.i) eVar).b1(i10)) != -1) {
                int i13 = 0;
                while (true) {
                    if (i13 >= arrayList.size()) {
                        break;
                    }
                    o oVar3 = arrayList.get(i13);
                    if (oVar3.c() == b12) {
                        oVar = oVar3;
                        break;
                    }
                    i13++;
                }
            }
            if (oVar == null) {
                oVar = new o(i10);
            }
            arrayList.add(oVar);
        }
        if (oVar.a(eVar)) {
            if (eVar instanceof s.g) {
                s.g gVar = (s.g) eVar;
                gVar.a1().b(gVar.b1() == 0 ? 1 : 0, arrayList, oVar);
            }
            if (i10 == 0) {
                eVar.A0 = oVar.c();
                eVar.H.b(i10, arrayList, oVar);
                eVar.J.b(i10, arrayList, oVar);
            } else {
                eVar.B0 = oVar.c();
                eVar.I.b(i10, arrayList, oVar);
                eVar.L.b(i10, arrayList, oVar);
                eVar.K.b(i10, arrayList, oVar);
            }
            eVar.O.b(i10, arrayList, oVar);
        }
        return oVar;
    }

    private static o b(ArrayList<o> arrayList, int i10) {
        int size = arrayList.size();
        for (int i11 = 0; i11 < size; i11++) {
            o oVar = arrayList.get(i11);
            if (i10 == oVar.f30883b) {
                return oVar;
            }
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:176:0x0342  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x037c  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x0380 A[ADDED_TO_REGION] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean c(s.f r16, t.b.InterfaceC0356b r17) {
        /*
            Method dump skipped, instructions count: 903
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: t.i.c(s.f, t.b$b):boolean");
    }

    public static boolean d(e.b bVar, e.b bVar2, e.b bVar3, e.b bVar4) {
        e.b bVar5;
        e.b bVar6;
        e.b bVar7 = e.b.FIXED;
        return (bVar3 == bVar7 || bVar3 == (bVar6 = e.b.WRAP_CONTENT) || (bVar3 == e.b.MATCH_PARENT && bVar != bVar6)) || (bVar4 == bVar7 || bVar4 == (bVar5 = e.b.WRAP_CONTENT) || (bVar4 == e.b.MATCH_PARENT && bVar2 != bVar5));
    }
}
