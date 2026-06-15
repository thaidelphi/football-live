package com.facebook.ads.redexgen.X;

import java.util.Arrays;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public class ZW extends Exception {
    public static byte[] A00;

    static {
        A01();
    }

    public static String A00(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 115);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A00 = new byte[]{112, 87, 95, 90, 83, 82, 22, 66, 89, 22, 71, 67, 83, 68, 79, 22, 67, 88, 82, 83, 68, 90, 79, 95, 88, 81, 22, 91, 83, 82, 95, 87, 22, 85, 89, 82, 83, 85, 69};
    }

    public ZW(Throwable th) {
        super(A00(0, 39, 69), th);
    }
}
