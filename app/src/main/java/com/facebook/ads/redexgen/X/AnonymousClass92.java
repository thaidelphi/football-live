package com.facebook.ads.redexgen.X;

import java.util.Arrays;
/* renamed from: com.facebook.ads.redexgen.X.92  reason: invalid class name */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public abstract class AnonymousClass92 {
    public static byte[] A00;

    static {
        A03();
    }

    public static String A00(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] - i12) - 105);
        }
        return new String(copyOfRange);
    }

    public static void A03() {
        A00 = new byte[]{6, 6, 19, 7, -7, 6, 10, -3, -9, -7, 19, -7, 12, 8, 6, -11, 7, -5, -5, 8, -4, -18, -5, -1, -14, -20, -18, 8, -4, -19, -12, 8, -1, -18, -5, -4, -14, -8, -9};
    }

    public static String A01(C1899k0 c1899k0) {
        return BJ.A00(c1899k0).getString(A00(0, 17, 75), null);
    }

    public static String A02(C1899k0 c1899k0) {
        return BJ.A00(c1899k0).getString(A00(17, 22, 64), null);
    }

    public static void A04(C1899k0 c1899k0) {
        BJ.A00(c1899k0).edit().remove(A00(17, 22, 64)).apply();
    }

    public static void A05(C1899k0 c1899k0, String str, String str2) {
        BJ.A00(c1899k0).edit().putString(A00(17, 22, 64), str).putString(A00(0, 17, 75), str2).apply();
    }
}
