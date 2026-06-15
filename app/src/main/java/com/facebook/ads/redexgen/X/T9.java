package com.facebook.ads.redexgen.X;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public final class T9 implements InterfaceC1213Wv {
    public final List<C1235Xr> A00;
    public final long[] A01;
    public final long[] A02;

    /* JADX WARN: Incorrect condition in loop: B:4:0x001d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public T9(java.util.List<com.facebook.ads.redexgen.X.C1235Xr> r8) {
        /*
            r7 = this;
            r7.<init>()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>(r8)
            java.util.List r0 = java.util.Collections.unmodifiableList(r0)
            r7.A00 = r0
            int r0 = r8.size()
            int r0 = r0 * 2
            long[] r0 = new long[r0]
            r7.A01 = r0
            r6 = 0
        L19:
            int r0 = r8.size()
            if (r6 >= r0) goto L38
            java.lang.Object r5 = r8.get(r6)
            com.facebook.ads.redexgen.X.Xr r5 = (com.facebook.ads.redexgen.X.C1235Xr) r5
            int r4 = r6 * 2
            long[] r2 = r7.A01
            long r0 = r5.A01
            r2[r4] = r0
            long[] r3 = r7.A01
            int r2 = r4 + 1
            long r0 = r5.A00
            r3[r2] = r0
            int r6 = r6 + 1
            goto L19
        L38:
            long[] r1 = r7.A01
            long[] r0 = r7.A01
            int r0 = r0.length
            long[] r0 = java.util.Arrays.copyOf(r1, r0)
            r7.A02 = r0
            long[] r0 = r7.A02
            java.util.Arrays.sort(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.T9.<init>(java.util.List):void");
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1213Wv
    public final List<C1053Qh> A7N(long j10) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (int i10 = 0; i10 < this.A00.size(); i10++) {
            if (this.A01[i10 * 2] <= j10 && j10 < this.A01[(i10 * 2) + 1]) {
                C1235Xr c1235Xr = this.A00.get(i10);
                if (c1235Xr.A02.A01 == -3.4028235E38f) {
                    arrayList2.add(c1235Xr);
                } else {
                    arrayList.add(c1235Xr.A02);
                }
            }
        }
        Collections.sort(arrayList2, new Comparator() { // from class: com.facebook.ads.redexgen.X.Y1
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                int compare;
                compare = Long.compare(((C1235Xr) obj).A01, ((C1235Xr) obj2).A01);
                return compare;
            }
        });
        for (int i11 = 0; i11 < arrayList2.size(); i11++) {
            arrayList.add(((C1235Xr) arrayList2.get(i11)).A02.A02().A07((-1) - i11, 1).A0H());
        }
        return arrayList;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1213Wv
    public final long A7t(int i10) {
        boolean z10 = true;
        AbstractC1589es.A07(i10 >= 0);
        if (i10 >= this.A02.length) {
            z10 = false;
        }
        AbstractC1589es.A07(z10);
        return this.A02[i10];
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1213Wv
    public final int A7u() {
        return this.A02.length;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1213Wv
    public final int A8Q(long j10) {
        int A0K = AbstractC1672gE.A0K(this.A02, j10, false, false);
        int index = this.A02.length;
        if (A0K < index) {
            return A0K;
        }
        return -1;
    }
}
