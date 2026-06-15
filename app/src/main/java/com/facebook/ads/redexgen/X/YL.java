package com.facebook.ads.redexgen.X;

import java.util.Arrays;
import java.util.List;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public final class YL {
    public static byte[] A02;
    public static String[] A03 = {"JlEYoAA8KgvOQUm2MMy2NkrV6IHMpdEr", "vEeZLfDDsSpHjn06v6onAv2BEpaO66DH", "ybu", "MVNpRLwxQ8sxX26fFrLso0nseb", "YWJIPG3EBq507sxW8lGiIThbpiW6u3v5", "5OPrt7W8XBtRjGkwsYco61VGMLlOA5jg", "OeB5KC5fq6NVtrw0T5", "yXwtBAUtxGkfcBNCM"};
    public final List<ZM> A00;
    public final InterfaceC1157Uo[] A01;

    public static String A00(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A02, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 105);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A02 = new byte[]{36, 3, 27, 12, 1, 4, 9, 77, 14, 1, 2, 30, 8, 9, 77, 14, 12, 29, 25, 4, 2, 3, 77, 0, 4, 0, 8, 77, 25, 20, 29, 8, 77, 29, 31, 2, 27, 4, 9, 8, 9, 87, 77, 67, 82, 82, 78, 75, 65, 67, 86, 75, 77, 76, 13, 65, 71, 67, 15, 20, 18, 26, 105, 120, 120, 100, 97, 107, 105, 124, 97, 103, 102, 39, 107, 109, 105, 37, 63, 56, 48};
    }

    static {
        A01();
    }

    public YL(List<ZM> list) {
        this.A00 = list;
        this.A01 = new InterfaceC1157Uo[list.size()];
    }

    public final void A02(long j10, C1648fq c1648fq) {
        UE.A03(j10, c1648fq, this.A01);
    }

    /* JADX WARN: Incorrect condition in loop: B:4:0x0004 */
    /* JADX WARN: Removed duplicated region for block: B:19:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00d0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A03(com.facebook.ads.redexgen.X.UL r10, com.facebook.ads.redexgen.X.YS r11) {
        /*
            r9 = this;
            r6 = 0
        L1:
            com.facebook.ads.redexgen.X.Uo[] r0 = r9.A01
            int r0 = r0.length
            if (r6 >= r0) goto Ld7
            r11.A05()
            int r1 = r11.A03()
            r0 = 3
            com.facebook.ads.redexgen.X.Uo r5 = r10.AJX(r1, r0)
            java.lang.String[] r1 = com.facebook.ads.redexgen.X.YL.A03
            r0 = 0
            r1 = r1[r0]
            r0 = 30
            char r1 = r1.charAt(r0)
            r0 = 69
            if (r1 == r0) goto L27
        L21:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>()
            throw r0
        L27:
            java.lang.String[] r2 = com.facebook.ads.redexgen.X.YL.A03
            java.lang.String r1 = "JKWBklwblVRraMoCYjaE2bcb5w0OzlyP"
            r0 = 1
            r2[r0] = r1
            java.lang.String r1 = "WjpMKKqN3dPyhBhYJ28c6ngOX8wOCY2o"
            r0 = 5
            r2[r0] = r1
            java.util.List<com.facebook.ads.redexgen.X.ZM> r0 = r9.A00
            java.lang.Object r4 = r0.get(r6)
            com.facebook.ads.redexgen.X.ZM r4 = (com.facebook.ads.redexgen.X.ZM) r4
            java.lang.String r3 = r4.A0W
            r2 = 43
            r1 = 19
            r0 = 75
            java.lang.String r0 = A00(r2, r1, r0)
            boolean r0 = r0.equals(r3)
            if (r0 != 0) goto L79
            r2 = 62
            r1 = 19
            r0 = 97
            java.lang.String r7 = A00(r2, r1, r0)
            java.lang.String[] r1 = com.facebook.ads.redexgen.X.YL.A03
            r0 = 4
            r1 = r1[r0]
            r0 = 20
            char r1 = r1.charAt(r0)
            r0 = 73
            if (r1 == r0) goto L67
            goto L21
        L67:
            java.lang.String[] r2 = com.facebook.ads.redexgen.X.YL.A03
            java.lang.String r1 = "g4WocGmnhB0qyaYra"
            r0 = 7
            r2[r0] = r1
            java.lang.String r1 = "yfBKp03tJhh9tk3SjRC2d07hyz"
            r0 = 3
            r2[r0] = r1
            boolean r0 = r7.equals(r3)
            if (r0 == 0) goto Ld5
        L79:
            r8 = 1
        L7a:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            r2 = 0
            r1 = 43
            r0 = 4
            java.lang.String r0 = A00(r2, r1, r0)
            java.lang.StringBuilder r0 = r7.append(r0)
            java.lang.StringBuilder r0 = r0.append(r3)
            java.lang.String r0 = r0.toString()
            com.facebook.ads.redexgen.X.AbstractC1589es.A09(r8, r0)
            java.lang.String r0 = r4.A0T
            if (r0 == 0) goto Ld0
            java.lang.String r1 = r4.A0T
        L9c:
            com.facebook.ads.redexgen.X.P5 r0 = new com.facebook.ads.redexgen.X.P5
            r0.<init>()
            com.facebook.ads.redexgen.X.P5 r0 = r0.A0y(r1)
            com.facebook.ads.redexgen.X.P5 r1 = r0.A11(r3)
            int r0 = r4.A0H
            com.facebook.ads.redexgen.X.P5 r1 = r1.A0n(r0)
            java.lang.String r0 = r4.A0V
            com.facebook.ads.redexgen.X.P5 r1 = r1.A10(r0)
            int r0 = r4.A03
            com.facebook.ads.redexgen.X.P5 r1 = r1.A0Z(r0)
            java.util.List<byte[]> r0 = r4.A0X
            com.facebook.ads.redexgen.X.P5 r0 = r1.A12(r0)
            com.facebook.ads.redexgen.X.ZM r0 = r0.A14()
            r5.A6U(r0)
            com.facebook.ads.redexgen.X.Uo[] r0 = r9.A01
            r0[r6] = r5
            int r6 = r6 + 1
            goto L1
        Ld0:
            java.lang.String r1 = r11.A04()
            goto L9c
        Ld5:
            r8 = 0
            goto L7a
        Ld7:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.YL.A03(com.facebook.ads.redexgen.X.UL, com.facebook.ads.redexgen.X.YS):void");
    }
}
