package com.facebook.ads.redexgen.X;

import java.io.IOException;
import java.util.Arrays;
/* renamed from: com.facebook.ads.redexgen.X.eB  reason: case insensitive filesystem */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public final class C1546eB extends IOException {
    public static byte[] A00;

    static {
        A01();
    }

    public static String A00(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 92);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A00 = new byte[]{117, 111, 56, 3, 8, 21, 29, 8, 14, 25, 8, 9, 77};
    }

    public C1546eB(Throwable th) {
        super(A00(2, 11, 49) + th.getClass().getSimpleName() + A00(0, 2, 19) + th.getMessage(), th);
    }
}
