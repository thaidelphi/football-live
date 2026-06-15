package com.facebook.ads.redexgen.X;

import java.util.Arrays;
/* renamed from: com.facebook.ads.redexgen.X.Tk  reason: case insensitive filesystem */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public final class C1132Tk implements W8 {
    public static byte[] A03;
    public static String[] A04 = {"hzw9X9GplxFenO", "mr", "eSgPSvhdyRUNuJEmKS3v3Y2qC3VmbDDU", "H3D", "kMq0zgmYTBjPFTCfqOESAoN1WiMPTwIN", "0ryUCh8KToOB7oIRjX4NVAlIweaZoTkN", "tRzJTDgOEnwp9ClspW3SLkymSAcnurzU", "ZyRwqq3dZ2uAk"};
    public final int A00;
    public final int A01;
    public final C1648fq A02;

    public static String A00(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A03, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] - i12) - 2);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        if (A04[7].length() != 13) {
            throw new RuntimeException();
        }
        A04[1] = "W11c6lYPj2izyCaf066";
        A03 = new byte[]{85, 73, -100, -99, -100, -93, 73, -100, -118, -106, -103, -107, -114, 73, -100, -110, -93, -114, 99, 73, 72, 123, 118, 116, 87, 104, 121, 122, 108, 121, 122, 73, 125, 108, 113, 119, 40, 123, 105, 117, 120, 116, 109, 40, 123, 113, -126, 109, 40, 117, 113, 123, 117, 105, 124, 107, 112, 54, 40, 123, 124, 123, 108, 40, 123, 105, 117, 120, 116, 109, 40, 123, 113, -126, 109, 66, 40, -59, -39, -56, -51, -45, -109, -42, -59, -37};
    }

    static {
        A01();
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x0032, code lost:
        if (r0 != 0) goto L7;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C1132Tk(com.facebook.ads.redexgen.X.C1133Tl r7, com.facebook.ads.redexgen.X.ZM r8) {
        /*
            r6 = this;
            r6.<init>()
            com.facebook.ads.redexgen.X.fq r0 = r7.A00
            r6.A02 = r0
            com.facebook.ads.redexgen.X.fq r1 = r6.A02
            r0 = 12
            r1.A0f(r0)
            com.facebook.ads.redexgen.X.fq r0 = r6.A02
            int r5 = r0.A0L()
            r2 = 77
            r1 = 9
            r0 = 98
            java.lang.String r1 = A00(r2, r1, r0)
            java.lang.String r0 = r8.A0W
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L6c
            int r1 = r8.A0C
            int r0 = r8.A06
            int r4 = com.facebook.ads.redexgen.X.AbstractC1672gE.A06(r1, r0)
            if (r5 == 0) goto L34
            int r0 = r5 % r4
            if (r0 == 0) goto L6c
        L34:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r2 = 31
            r1 = 46
            r0 = 6
            java.lang.String r0 = A00(r2, r1, r0)
            java.lang.StringBuilder r0 = r3.append(r0)
            java.lang.StringBuilder r3 = r0.append(r4)
            r2 = 0
            r1 = 20
            r0 = 39
            java.lang.String r0 = A00(r2, r1, r0)
            java.lang.StringBuilder r0 = r3.append(r0)
            java.lang.StringBuilder r0 = r0.append(r5)
            java.lang.String r3 = r0.toString()
            r2 = 20
            r1 = 11
            r0 = 5
            java.lang.String r0 = A00(r2, r1, r0)
            com.facebook.ads.redexgen.X.AbstractC1633fb.A07(r0, r3)
            r5 = r4
        L6c:
            if (r5 != 0) goto L6f
            r5 = -1
        L6f:
            r6.A00 = r5
            com.facebook.ads.redexgen.X.fq r0 = r6.A02
            int r0 = r0.A0L()
            r6.A01 = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.C1132Tk.<init>(com.facebook.ads.redexgen.X.Tl, com.facebook.ads.redexgen.X.ZM):void");
    }

    @Override // com.facebook.ads.redexgen.X.W8
    public final int A80() {
        return this.A00;
    }

    @Override // com.facebook.ads.redexgen.X.W8
    public final int A8l() {
        return this.A01;
    }

    @Override // com.facebook.ads.redexgen.X.W8
    public final int AGa() {
        return this.A00 == -1 ? this.A02.A0L() : this.A00;
    }
}
