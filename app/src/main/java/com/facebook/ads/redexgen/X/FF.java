package com.facebook.ads.redexgen.X;

import java.util.Arrays;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public enum FF {
    A05(0),
    A04(1),
    A03(2);
    
    public static byte[] A01;
    public int A00;

    public static String A01(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 120);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        A01 = new byte[]{78, 67, 76, 70, 81, 65, 67, 82, 71, 56, 39, 58, 60, 58, 41, 33, 60, 22, 13, 16, 19, 6, 0, 10, 5, 10, 6, 7};
    }

    static {
        A02();
    }

    FF(int i10) {
        this.A00 = i10;
    }

    public static FF A00(int i10) {
        FF[] values;
        for (FF ff : values()) {
            if (ff.A00 == i10) {
                return ff;
            }
        }
        return A04;
    }

    public final int A04() {
        return this.A00;
    }
}
