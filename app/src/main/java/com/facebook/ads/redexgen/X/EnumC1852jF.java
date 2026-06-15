package com.facebook.ads.redexgen.X;

import java.util.Arrays;
/* renamed from: com.facebook.ads.redexgen.X.jF  reason: case insensitive filesystem */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public enum EnumC1852jF {
    A05,
    A04,
    A02,
    A03;
    
    public static byte[] A00;

    public static String A00(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 74);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A00 = new byte[]{48, 59, 58, 49, 41, 46, 38, 35, 42, 43, 55, 54, 45, 38, 43, 60, 56, 61, 32, 101, 114, 118, 115, 110};
    }

    static {
        A01();
    }
}
