package com.facebook.ads.redexgen.X;

import android.view.Surface;
import java.util.Arrays;
/* renamed from: com.facebook.ads.redexgen.X.gj  reason: case insensitive filesystem */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public final class C1702gj {
    public static byte[] A00;
    public static String[] A01 = {"uoYD", "HeU7kebfTnZpKvOyaOBqPf1Mv9mLLj8G", "6X63F5FDLLOMm2xLgmAHJ6xokNZ2J0Tp", "jzWvnKVIJEPZ7YOQtPTQ7ULVz5d3loFB", "WTX8", "ORIe3UpFPjzMZ538t7vixaxrTIhPoItt", "oReYwLi1ELyRdHzzh3F", "hE"};

    public static String A00(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] - i12) - 48);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A00 = new byte[]{-86, -59, -51, -48, -55, -56, -124, -40, -45, -124, -57, -59, -48, -48, -124, -73, -39, -42, -54, -59, -57, -55, -110, -41, -55, -40, -86, -42, -59, -47, -55, -74, -59, -40, -55, -33, -14, -19, -18, -8, -49, -5, -22, -10, -18, -37, -18, -11, -18, -22, -4, -18, -47, -18, -11, -7, -18, -5};
    }

    static {
        A01();
    }

    public static void A02(Surface surface, float f10) {
        int compatibility;
        if (f10 == 0.0f) {
            compatibility = 0;
        } else {
            compatibility = 1;
        }
        try {
            surface.setFrameRate(f10, compatibility);
        } catch (IllegalStateException e8) {
            String[] strArr = A01;
            String str = strArr[3];
            String str2 = strArr[5];
            int charAt = str.charAt(14);
            int compatibility2 = str2.charAt(14);
            if (charAt == compatibility2) {
                throw new RuntimeException();
            }
            String[] strArr2 = A01;
            strArr2[3] = "UF2UymucYrWncwMOJNOrBW7v9k4nWUMi";
            strArr2[5] = "KBLf7QM98GLjMuBrSxOVsNr81TxWJI7M";
            AbstractC1633fb.A08(A00(35, 23, 89), A00(0, 35, 52), e8);
        }
    }
}
