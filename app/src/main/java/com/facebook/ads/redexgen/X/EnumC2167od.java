package com.facebook.ads.redexgen.X;

import java.util.Arrays;
/* renamed from: com.facebook.ads.redexgen.X.od  reason: case insensitive filesystem */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public enum EnumC2167od {
    A02,
    A03,
    A04;
    
    public static byte[] A00;

    public static String A00(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 98);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A00 = new byte[]{79, 68, 87, 68, 83, 94, 83, 68, 70, 72, 82, 85, 68, 83, 68, 69, 115, 100, 102, 104, 114, 117, 100, 115, 100, 101, 14, 21, 9, 30, 28, 18, 8, 15, 30, 9, 30, 31};
    }

    static {
        A01();
    }
}
