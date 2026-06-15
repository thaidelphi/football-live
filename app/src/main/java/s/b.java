package s;

import java.util.ArrayList;
/* compiled from: Chain.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class b {
    /* JADX WARN: Code restructure failed: missing block: B:15:0x002d, code lost:
        if (r8 == 2) goto L309;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x003c, code lost:
        if (r8 == 2) goto L309;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x003e, code lost:
        r5 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0040, code lost:
        r5 = false;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0197  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x01b4  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x01d1  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0258 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:154:0x02b1 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:213:0x039a  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x03a3 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:226:0x03b6  */
    /* JADX WARN: Removed duplicated region for block: B:272:0x0483  */
    /* JADX WARN: Removed duplicated region for block: B:277:0x04b8  */
    /* JADX WARN: Removed duplicated region for block: B:282:0x04cb A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:287:0x04df  */
    /* JADX WARN: Removed duplicated region for block: B:288:0x04e2  */
    /* JADX WARN: Removed duplicated region for block: B:291:0x04e8  */
    /* JADX WARN: Removed duplicated region for block: B:292:0x04eb  */
    /* JADX WARN: Removed duplicated region for block: B:294:0x04ef  */
    /* JADX WARN: Removed duplicated region for block: B:299:0x04ff  */
    /* JADX WARN: Removed duplicated region for block: B:301:0x0505 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:312:0x039b A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:323:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    static void a(s.f r37, r.d r38, int r39, int r40, s.c r41) {
        /*
            Method dump skipped, instructions count: 1318
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: s.b.a(s.f, r.d, int, int, s.c):void");
    }

    public static void b(f fVar, r.d dVar, ArrayList<e> arrayList, int i10) {
        c[] cVarArr;
        int i11;
        int i12;
        if (i10 == 0) {
            i12 = fVar.N0;
            cVarArr = fVar.Q0;
            i11 = 0;
        } else {
            int i13 = fVar.O0;
            cVarArr = fVar.P0;
            i11 = 2;
            i12 = i13;
        }
        for (int i14 = 0; i14 < i12; i14++) {
            c cVar = cVarArr[i14];
            cVar.a();
            if (arrayList == null || arrayList.contains(cVar.f30485a)) {
                a(fVar, dVar, i10, i11, cVar);
            }
        }
    }
}
