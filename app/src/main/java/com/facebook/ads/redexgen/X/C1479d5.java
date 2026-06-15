package com.facebook.ads.redexgen.X;

import java.util.Arrays;
/* renamed from: com.facebook.ads.redexgen.X.d5  reason: case insensitive filesystem */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public final class C1479d5 {
    public static byte[] A03;
    public final int A00;
    public final C1246Yc A01;
    public final int[] A02;

    static {
        A01();
    }

    public static String A00(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A03, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 74);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A03 = new byte[]{99, 114, 117, 98, 67, 64, 79, 72, 79, 82, 79, 73, 72, 17, 57, 36, 32, 45, 116, 32, 38, 53, 55, 63, 39, 116, 53, 38, 49, 116, 58, 59, 32, 116, 53, 56, 56, 59, 35, 49, 48};
    }

    public C1479d5(C1246Yc c1246Yc, int... iArr) {
        this(c1246Yc, iArr, 0);
    }

    public C1479d5(C1246Yc c1246Yc, int[] iArr, int i10) {
        if (iArr.length == 0) {
            AbstractC1633fb.A08(A00(0, 13, 108), A00(13, 28, 30), new IllegalArgumentException());
        }
        this.A01 = c1246Yc;
        this.A02 = iArr;
        this.A00 = i10;
    }
}
