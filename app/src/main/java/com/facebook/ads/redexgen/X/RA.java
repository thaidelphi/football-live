package com.facebook.ads.redexgen.X;

import java.io.IOException;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public final class RA implements InterfaceC1381bV {
    public static String[] A03 = {"42m2DpMe8IoAz0rTI464MD0517gWX8y9", "QPrcgglPxuYzdHE4UTwwPFhyOLxBO4Nm", "bnUVmnYAiMDpjPKG02CtRsRq3Be9rl1s", "8", "u57ATUEcIElDtXS5M9spyajicequP9Y6", "G7vXdmUqiPV42TEkEHsKT2AdNVkXF2DU", "mfdeCB", "NSGpNmFtxO56L2rCnxl08rNKgIfWfBB1"};
    public boolean A00;
    public final InterfaceC1381bV A01;
    public final /* synthetic */ C06168m A02;

    public RA(C06168m c06168m, InterfaceC1381bV interfaceC1381bV) {
        this.A02 = c06168m;
        this.A01 = interfaceC1381bV;
    }

    public final void A00() {
        this.A00 = false;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1381bV
    public final boolean AAT() {
        return !this.A02.A03() && this.A01.AAT();
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1381bV
    public final void ABm() throws IOException {
        this.A01.ABm();
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0041, code lost:
        if (r4 != 0) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0088, code lost:
        if (r0 < 0) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0098, code lost:
        if (r13.A04 == false) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x009a, code lost:
        r13.A0A();
        r13.A02(4);
        r11.A00 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00a3, code lost:
        return -4;
     */
    @Override // com.facebook.ads.redexgen.X.InterfaceC1381bV
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int AGX(com.facebook.ads.redexgen.X.P6 r12, com.facebook.ads.redexgen.X.C1214Ww r13, int r14) {
        /*
            r11 = this;
            com.facebook.ads.redexgen.X.8m r0 = r11.A02
            boolean r0 = r0.A03()
            r8 = -3
            if (r0 == 0) goto La
            return r8
        La:
            boolean r0 = r11.A00
            r6 = 4
            r5 = -4
            if (r0 == 0) goto L14
            r13.A02(r6)
            return r5
        L14:
            com.facebook.ads.redexgen.X.bV r0 = r11.A01
            int r7 = r0.AGX(r12, r13, r14)
            r3 = -5
            r9 = -9223372036854775808
            if (r7 != r3) goto L76
            com.facebook.ads.redexgen.X.ZM r0 = r12.A00
            java.lang.Object r6 = com.facebook.ads.redexgen.X.AbstractC1589es.A01(r0)
            com.facebook.ads.redexgen.X.ZM r6 = (com.facebook.ads.redexgen.X.ZM) r6
            int r0 = r6.A08
            if (r0 != 0) goto L43
            int r4 = r6.A09
            java.lang.String[] r1 = com.facebook.ads.redexgen.X.RA.A03
            r0 = 3
            r0 = r1[r0]
            int r1 = r0.length()
            r0 = 9
            if (r1 == r0) goto L70
            java.lang.String[] r2 = com.facebook.ads.redexgen.X.RA.A03
            java.lang.String r1 = "Y0fq0g"
            r0 = 6
            r2[r0] = r1
            if (r4 == 0) goto L69
        L43:
            com.facebook.ads.redexgen.X.8m r0 = r11.A02
            long r1 = r0.A01
            r7 = 0
            r5 = 0
            int r0 = (r1 > r7 ? 1 : (r1 == r7 ? 0 : -1))
            if (r0 == 0) goto L6d
            r4 = 0
        L4f:
            com.facebook.ads.redexgen.X.8m r0 = r11.A02
            long r1 = r0.A00
            int r0 = (r1 > r9 ? 1 : (r1 == r9 ? 0 : -1))
            if (r0 == 0) goto L6a
        L57:
            com.facebook.ads.redexgen.X.P5 r0 = r6.A07()
            com.facebook.ads.redexgen.X.P5 r0 = r0.A0d(r4)
            com.facebook.ads.redexgen.X.P5 r0 = r0.A0e(r5)
            com.facebook.ads.redexgen.X.ZM r0 = r0.A14()
            r12.A00 = r0
        L69:
            return r3
        L6a:
            int r5 = r6.A09
            goto L57
        L6d:
            int r4 = r6.A08
            goto L4f
        L70:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>()
            throw r0
        L76:
            com.facebook.ads.redexgen.X.8m r0 = r11.A02
            long r0 = r0.A00
            int r2 = (r0 > r9 ? 1 : (r0 == r9 ? 0 : -1))
            if (r2 == 0) goto La4
            if (r7 != r5) goto L8a
            long r3 = r13.A01
            com.facebook.ads.redexgen.X.8m r0 = r11.A02
            long r1 = r0.A00
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 >= 0) goto L9a
        L8a:
            if (r7 != r8) goto La4
            com.facebook.ads.redexgen.X.8m r0 = r11.A02
            long r1 = r0.A6y()
            int r0 = (r1 > r9 ? 1 : (r1 == r9 ? 0 : -1))
            if (r0 != 0) goto La4
            boolean r0 = r13.A04
            if (r0 != 0) goto La4
        L9a:
            r13.A0A()
            r13.A02(r6)
            r0 = 1
            r11.A00 = r0
            return r5
        La4:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.RA.AGX(com.facebook.ads.redexgen.X.P6, com.facebook.ads.redexgen.X.Ww, int):int");
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1381bV
    public final int AJ8(long j10) {
        if (this.A02.A03()) {
            if (A03[3].length() != 9) {
                A03[7] = "7SVSbkIroC59AU65c36VsMa3iQLpFfkN";
                return -3;
            }
            throw new RuntimeException();
        }
        return this.A01.AJ8(j10);
    }
}
