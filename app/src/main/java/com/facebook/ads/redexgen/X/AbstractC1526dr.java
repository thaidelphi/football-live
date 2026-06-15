package com.facebook.ads.redexgen.X;

import android.text.TextUtils;
import java.util.Arrays;
/* renamed from: com.facebook.ads.redexgen.X.dr  reason: case insensitive filesystem */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public abstract /* synthetic */ class AbstractC1526dr {
    public static byte[] A00;

    static {
        A01();
    }

    public static String A00(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] - i12) - 13);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A00 = new byte[]{120, -124, 125, 124, -16, -31, -12, -16, -69, -84, -65, -69, 118, -67, -69, -69, -94, -105, -106};
    }

    public static /* synthetic */ boolean A02(String str) {
        if (str == null) {
            return false;
        }
        String A01 = AbstractC1756hb.A01(str);
        if (TextUtils.isEmpty(A01)) {
            return false;
        }
        return ((A01.contains(A00(4, 4, 111)) && !A01.contains(A00(8, 8, 58))) || A01.contains(A00(0, 4, 3)) || A01.contains(A00(16, 3, 29))) ? false : true;
    }
}
