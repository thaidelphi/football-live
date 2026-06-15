package com.facebook.ads.redexgen.X;

import java.util.Arrays;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public enum IP {
    A03,
    A04,
    A02;
    
    public static byte[] A00;

    public static String A00(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] - i12) - 39);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A00 = new byte[]{-75, -55, -56, -61, -45, -57, -56, -75, -58, -56, -71, -72, -27, -26, -21, -10, -22, -21, -40, -23, -21, -36, -37, -61, -63, -77, -64, -51, -63, -62, -81, -64, -62, -77, -78};
    }

    static {
        A01();
    }
}
