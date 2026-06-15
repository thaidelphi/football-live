package com.facebook.ads.redexgen.X;

import java.util.Arrays;
/* renamed from: com.facebook.ads.redexgen.X.Rt  reason: case insensitive filesystem */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public final class C1090Rt extends Exception {
    public static byte[] A03;
    public final int A00;
    public final ZM A01;
    public final boolean A02;

    static {
        A01();
    }

    public static String A00(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A03, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 59);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A03 = new byte[]{5, 92, 84, 14, 25, 31, 19, 10, 25, 14, 29, 30, 16, 25, 85, 46, 43, 39, 105, 114, 106, 72, 97, 70, 114, 99, 110, 104, 83, 117, 102, 100, 108, 70, 107, 107, 104, 100, 102, 115, 98, 99, 58, 5, 9, 19, 39, 54, 59, 61, 6, 32, 51, 49, 57, 114, 59, 60, 59, 38, 114, 52, 51, 59, 62, 55, 54, 114, 18, 62, 63, 55, 56, 54, 121};
    }

    /* JADX WARN: Illegal instructions before constructor call */
    @com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomization(type = {"NEW_CLASS"}, value = "D23918943: Monitor the audio track usage")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C1090Rt(int r6, int r7, int r8, int r9, com.facebook.ads.redexgen.X.ZM r10, boolean r11, java.lang.Exception r12, int r13) {
        /*
            r5 = this;
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r2 = 45
            r1 = 23
            r0 = 105(0x69, float:1.47E-43)
            java.lang.String r0 = A00(r2, r1, r0)
            java.lang.StringBuilder r0 = r3.append(r0)
            java.lang.StringBuilder r4 = r0.append(r6)
            r2 = 0
            r1 = 1
            r0 = 30
            java.lang.String r3 = A00(r2, r1, r0)
            java.lang.StringBuilder r4 = r4.append(r3)
            r2 = 68
            r1 = 7
            r0 = 106(0x6a, float:1.49E-43)
            java.lang.String r0 = A00(r2, r1, r0)
            java.lang.StringBuilder r0 = r4.append(r0)
            java.lang.StringBuilder r4 = r0.append(r7)
            r2 = 43
            r1 = 2
            r0 = 18
            java.lang.String r1 = A00(r2, r1, r0)
            java.lang.StringBuilder r0 = r4.append(r1)
            java.lang.StringBuilder r0 = r0.append(r8)
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.StringBuilder r4 = r0.append(r9)
            r2 = 15
            r1 = 28
            r0 = 60
            java.lang.String r0 = A00(r2, r1, r0)
            java.lang.StringBuilder r0 = r4.append(r0)
            java.lang.StringBuilder r0 = r0.append(r13)
            java.lang.StringBuilder r0 = r0.append(r3)
            java.lang.StringBuilder r3 = r0.append(r10)
            if (r11 == 0) goto L84
            r2 = 1
            r1 = 14
            r0 = 71
            java.lang.String r0 = A00(r2, r1, r0)
        L72:
            java.lang.StringBuilder r0 = r3.append(r0)
            java.lang.String r0 = r0.toString()
            r5.<init>(r0, r12)
            r5.A00 = r6
            r5.A02 = r11
            r5.A01 = r10
            return
        L84:
            r2 = 0
            r1 = 0
            r0 = 97
            java.lang.String r0 = A00(r2, r1, r0)
            goto L72
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.C1090Rt.<init>(int, int, int, int, com.facebook.ads.redexgen.X.ZM, boolean, java.lang.Exception, int):void");
    }
}
