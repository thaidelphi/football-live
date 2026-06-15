package com.facebook.ads.redexgen.X;

import java.util.Arrays;
import java.util.List;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public final class YV {
    public static byte[] A02;
    public static String[] A03 = {"B9wMF4XSFLHx4dj7A5ZPM69ILd9j9lcg", "wwXHnb3Fjvux5W5pkJCA6m", "agGpxyJ0GYsuFMEszfVSztkhG1on51fu", "D7Ik6bzJdz6B8Kytxd3yFi9adSctvYSV", "kOEPiuizev0taTk33gskBi", "P9nlF5ApjAD6", "cmwu7tsYN1NUaJ19Z2tq2Mal", "9G"};
    public final List<ZM> A00;
    public final InterfaceC1157Uo[] A01;

    public static String A00(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A02, i10, i10 + i11);
        int i13 = 0;
        while (true) {
            int length = copyOfRange.length;
            if (A03[5].length() == 23) {
                throw new RuntimeException();
            }
            A03[3] = "Tg6F6tjYNmG1p51KcJo6jSbqwvACKxuG";
            if (i13 >= length) {
                return new String(copyOfRange);
            }
            copyOfRange[i13] = (byte) ((copyOfRange[i13] - i12) - 123);
            i13++;
        }
    }

    public static void A01() {
        byte[] bArr = {-50, -13, -5, -26, -15, -18, -23, -91, -24, -15, -12, -8, -22, -23, -91, -24, -26, -11, -7, -18, -12, -13, -91, -14, -18, -14, -22, -91, -7, -2, -11, -22, -91, -11, -9, -12, -5, -18, -23, -22, -23, -65, -91, 7, 22, 22, 18, 15, 9, 7, 26, 15, 21, 20, -43, 9, 11, 7, -45, -36, -42, -34, 34, 49, 49, 45, 42, 36, 34, 53, 42, 48, 47, -16, 36, 38, 34, -18, -8, -15, -7};
        if (A03[5].length() == 23) {
            throw new RuntimeException();
        }
        String[] strArr = A03;
        strArr[6] = "DIrcd5pYPSrL6sHLCpqJUBMq";
        strArr[7] = "SA";
        A02 = bArr;
    }

    static {
        A01();
    }

    public YV(List<ZM> list) {
        this.A00 = list;
        this.A01 = new InterfaceC1157Uo[list.size()];
    }

    public final void A02(long j10, C1648fq c1648fq) {
        if (c1648fq.A07() < 9) {
            return;
        }
        int A0C = c1648fq.A0C();
        int userDataTypeCode = c1648fq.A0C();
        int userDataIdentifier = c1648fq.A0I();
        if (A0C == 434 && userDataTypeCode == 1195456820 && userDataIdentifier == 3) {
            UE.A04(j10, c1648fq, this.A01);
        }
    }

    /* JADX WARN: Incorrect condition in loop: B:4:0x0004 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A03(com.facebook.ads.redexgen.X.UL r10, com.facebook.ads.redexgen.X.YS r11) {
        /*
            r9 = this;
            r3 = 0
        L1:
            com.facebook.ads.redexgen.X.Uo[] r0 = r9.A01
            int r0 = r0.length
            if (r3 >= r0) goto L94
            r11.A05()
            int r1 = r11.A03()
            r0 = 3
            com.facebook.ads.redexgen.X.Uo r2 = r10.AJX(r1, r0)
            java.util.List<com.facebook.ads.redexgen.X.ZM> r0 = r9.A00
            java.lang.Object r4 = r0.get(r3)
            com.facebook.ads.redexgen.X.ZM r4 = (com.facebook.ads.redexgen.X.ZM) r4
            java.lang.String r6 = r4.A0W
            r5 = 43
            r1 = 19
            r0 = 43
            java.lang.String r0 = A00(r5, r1, r0)
            boolean r0 = r0.equals(r6)
            if (r0 != 0) goto L3c
            r5 = 62
            r1 = 19
            r0 = 70
            java.lang.String r0 = A00(r5, r1, r0)
            boolean r0 = r0.equals(r6)
            if (r0 == 0) goto L92
        L3c:
            r8 = 1
        L3d:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            r5 = 0
            r1 = 43
            r0 = 10
            java.lang.String r0 = A00(r5, r1, r0)
            java.lang.StringBuilder r0 = r7.append(r0)
            java.lang.StringBuilder r0 = r0.append(r6)
            java.lang.String r0 = r0.toString()
            com.facebook.ads.redexgen.X.AbstractC1589es.A09(r8, r0)
            com.facebook.ads.redexgen.X.P5 r1 = new com.facebook.ads.redexgen.X.P5
            r1.<init>()
            java.lang.String r0 = r11.A04()
            com.facebook.ads.redexgen.X.P5 r0 = r1.A0y(r0)
            com.facebook.ads.redexgen.X.P5 r1 = r0.A11(r6)
            int r0 = r4.A0H
            com.facebook.ads.redexgen.X.P5 r1 = r1.A0n(r0)
            java.lang.String r0 = r4.A0V
            com.facebook.ads.redexgen.X.P5 r1 = r1.A10(r0)
            int r0 = r4.A03
            com.facebook.ads.redexgen.X.P5 r1 = r1.A0Z(r0)
            java.util.List<byte[]> r0 = r4.A0X
            com.facebook.ads.redexgen.X.P5 r0 = r1.A12(r0)
            com.facebook.ads.redexgen.X.ZM r0 = r0.A14()
            r2.A6U(r0)
            com.facebook.ads.redexgen.X.Uo[] r0 = r9.A01
            r0[r3] = r2
            int r3 = r3 + 1
            goto L1
        L92:
            r8 = 0
            goto L3d
        L94:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.YV.A03(com.facebook.ads.redexgen.X.UL, com.facebook.ads.redexgen.X.YS):void");
    }
}
