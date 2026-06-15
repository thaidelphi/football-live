package com.facebook.ads.redexgen.X;

import android.util.Pair;
import com.google.android.exoplayer2.Timeline;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public abstract class QB extends AbstractC1490dG {
    public static String[] A01 = {"gHe6Ggz9iQvLoeqfI7z0Fxxa2bOPFJVC", "mRaRFCBn69tPfujuPAjRFPYxHQXp9RZc", "CSSFDgS5gh03TQ1AYsGOm7d", "zjwBQPent3AQFjnpPPQBXvHN2Tq8EaDX", "cDNJWjlLvsmdd9mkRSbb8bT", "", "", "QEHUtPc9dofNZwowDCRZe3wvjD0c8w3x"};
    public C1482d8 A00;

    public abstract Pair<C1057Ql[], QD[]> A0d(C1482d8 c1482d8, int[][][] iArr, int[] iArr2, R5 r52, Timeline timeline) throws EK;

    /* JADX WARN: Incorrect condition in loop: B:4:0x0005 */
    /* JADX WARN: Incorrect condition in loop: B:7:0x000d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int A0Y(com.facebook.ads.redexgen.X.InterfaceC1054Qi[] r8, com.facebook.ads.redexgen.X.C1246Yc r9, int[] r10, boolean r11) throws com.facebook.ads.redexgen.X.EK {
        /*
            int r6 = r8.length
            r5 = 0
            r7 = 1
            r4 = 0
        L4:
            int r0 = r8.length
            if (r4 >= r0) goto L39
            r3 = r8[r4]
            r2 = 0
            r1 = 0
        Lb:
            int r0 = r9.A01
            if (r1 >= r0) goto L22
            com.facebook.ads.redexgen.X.ZM r0 = r9.A08(r1)
            int r0 = r3.AJR(r0)
            int r0 = com.facebook.ads.redexgen.X.AbstractC1047Qb.A03(r0)
            int r2 = java.lang.Math.max(r2, r0)
            int r1 = r1 + 1
            goto Lb
        L22:
            r0 = r10[r4]
            if (r0 != 0) goto L37
            r0 = 1
        L27:
            if (r2 > r5) goto L31
            if (r2 != r5) goto L34
            if (r11 == 0) goto L34
            if (r7 != 0) goto L34
            if (r0 == 0) goto L34
        L31:
            r6 = r4
            r5 = r2
            r7 = r0
        L34:
            int r4 = r4 + 1
            goto L4
        L37:
            r0 = 0
            goto L27
        L39:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.QB.A0Y(com.facebook.ads.redexgen.X.Qi[], com.facebook.ads.redexgen.X.Yc, int[], boolean):int");
    }

    public static int[] A0Z(InterfaceC1054Qi interfaceC1054Qi, C1246Yc c1246Yc) throws EK {
        int[] iArr = new int[c1246Yc.A01];
        for (int i10 = 0; i10 < c1246Yc.A01; i10++) {
            iArr[i10] = interfaceC1054Qi.AJR(c1246Yc.A08(i10));
        }
        return iArr;
    }

    public static int[] A0a(InterfaceC1054Qi[] interfaceC1054QiArr) throws EK {
        int[] iArr = new int[interfaceC1054QiArr.length];
        for (int i10 = 0; i10 < iArr.length; i10++) {
            iArr[i10] = interfaceC1054QiArr[i10].AJT();
        }
        return iArr;
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC1490dG
    public final C1491dH A0b(InterfaceC1054Qi[] interfaceC1054QiArr, C1063Qs c1063Qs, R5 r52, Timeline timeline) throws EK {
        int[] rendererTrackGroupCounts;
        int[] iArr = new int[interfaceC1054QiArr.length + 1];
        C1246Yc[][] c1246YcArr = new C1246Yc[interfaceC1054QiArr.length + 1];
        int[][][] iArr2 = new int[interfaceC1054QiArr.length + 1][];
        for (int i10 = 0; i10 < c1246YcArr.length; i10++) {
            c1246YcArr[i10] = new C1246Yc[c1063Qs.A01];
            iArr2[i10] = new int[c1063Qs.A01];
        }
        int[] A0a = A0a(interfaceC1054QiArr);
        int groupIndex = 0;
        while (true) {
            int i11 = c1063Qs.A01;
            if (A01[7].charAt(15) != 'w') {
                throw new RuntimeException();
            }
            A01[7] = "nXGM96RwffhgFmQwkLMDI9egGDlSsBJ3";
            if (groupIndex < i11) {
                C1246Yc A05 = c1063Qs.A05(groupIndex);
                int A0Y = A0Y(interfaceC1054QiArr, A05, iArr, A05.A02 == 5);
                if (A0Y == interfaceC1054QiArr.length) {
                    rendererTrackGroupCounts = new int[A05.A01];
                } else {
                    rendererTrackGroupCounts = A0Z(interfaceC1054QiArr[A0Y], A05);
                }
                int i12 = iArr[A0Y];
                c1246YcArr[A0Y][i12] = A05;
                iArr2[A0Y][i12] = rendererTrackGroupCounts;
                iArr[A0Y] = iArr[A0Y] + 1;
                groupIndex++;
            } else {
                C1063Qs[] c1063QsArr = new C1063Qs[interfaceC1054QiArr.length];
                String[] strArr = new String[interfaceC1054QiArr.length];
                int[] iArr3 = new int[interfaceC1054QiArr.length];
                for (int i13 = 0; i13 < interfaceC1054QiArr.length; i13++) {
                    int i14 = iArr[i13];
                    c1063QsArr[i13] = new C1063Qs((C1246Yc[]) AbstractC1672gE.A1I(c1246YcArr[i13], i14));
                    iArr2[i13] = (int[][]) AbstractC1672gE.A1I(iArr2[i13], i14);
                    strArr[i13] = interfaceC1054QiArr[i13].getName();
                    iArr3[i13] = interfaceC1054QiArr[i13].A9D();
                }
                C1482d8 c1482d8 = new C1482d8(strArr, iArr3, c1063QsArr, A0a, iArr2, new C1063Qs((C1246Yc[]) AbstractC1672gE.A1I(c1246YcArr[interfaceC1054QiArr.length], iArr[interfaceC1054QiArr.length])));
                Pair<C1057Ql[], QD[]> A0d = A0d(c1482d8, iArr2, A0a, r52, timeline);
                return new C1491dH((C1057Ql[]) A0d.first, (QD[]) A0d.second, AbstractC1487dD.A00(c1482d8, (InterfaceC1484dA[]) A0d.second), c1482d8);
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC1490dG
    public final void A0c(Object obj) {
        this.A00 = (C1482d8) obj;
    }
}
