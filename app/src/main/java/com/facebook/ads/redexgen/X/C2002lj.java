package com.facebook.ads.redexgen.X;

import java.util.Arrays;
/* renamed from: com.facebook.ads.redexgen.X.lj  reason: case insensitive filesystem */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public final class C2002lj {
    public static byte[] A03;
    public final Object A00;
    public final Object A01;
    public final Object A02;

    static {
        A01();
    }

    public static String A00(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A03, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 78);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A03 = new byte[]{25, 88, 87, 93, 25, 85, 73, 113, 104, 112, 109, 116, 104, 97, 36, 97, 106, 112, 118, 109, 97, 119, 36, 115, 109, 112, 108, 36, 119, 101, 105, 97, 36, 111, 97, 125, 62, 36};
    }

    public C2002lj(Object key, Object value1, Object value2) {
        this.A00 = key;
        this.A01 = value1;
        this.A02 = value2;
    }

    public final IllegalArgumentException A02() {
        StringBuilder append = new StringBuilder().append(A00(6, 32, 74)).append(this.A00);
        String A00 = A00(5, 1, 38);
        return new IllegalArgumentException(append.append(A00).append(this.A01).append(A00(0, 5, 119)).append(this.A00).append(A00).append(this.A02).toString());
    }
}
