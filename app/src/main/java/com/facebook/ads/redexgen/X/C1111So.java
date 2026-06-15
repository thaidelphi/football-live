package com.facebook.ads.redexgen.X;

import java.util.Arrays;
/* renamed from: com.facebook.ads.redexgen.X.So  reason: case insensitive filesystem */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public final class C1111So extends IllegalStateException {
    public static byte[] A02;
    public final int A00;
    public final int A01;

    static {
        A01();
    }

    public static String A00(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A02, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 4);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A02 = new byte[]{69, 89, 69, 60, 6, 49, 34, 34, 33, 54, 100, 48, 43, 43, 100, 55, 41, 37, 40, 40, 100, 108};
    }

    public C1111So(int i10, int i11) {
        super(A00(4, 18, 64) + i10 + A00(0, 3, 97) + i11 + A00(3, 1, 17));
        this.A00 = i10;
        this.A01 = i11;
    }
}
