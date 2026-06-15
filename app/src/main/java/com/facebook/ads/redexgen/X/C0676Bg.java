package com.facebook.ads.redexgen.X;

import android.content.SharedPreferences;
import com.facebook.ads.internal.util.process.ProcessUtils;
import java.util.Arrays;
/* renamed from: com.facebook.ads.redexgen.X.Bg  reason: case insensitive filesystem */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public final class C0676Bg {
    public static byte[] A00;

    static {
        A02();
    }

    public static String A01(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] - i12) - 49);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        A00 = new byte[]{-19, -7, -9, -72, -16, -21, -19, -17, -20, -7, -7, -11, -72, -21, -18, -3, -72, -13, -8, -2, -17, -4, -8, -21, -10, -72, -21, -18, -3, -23, -3, -6, -23, -3, -2, -7, -4, -21, -15, -17};
    }

    public static SharedPreferences A00(AnonymousClass85 anonymousClass85) {
        return anonymousClass85.getSharedPreferences(ProcessUtils.getProcessSpecificName(A01(0, 40, 89), anonymousClass85), 0);
    }

    public final int A03(AnonymousClass85 anonymousClass85, String str, int i10) {
        return A00(anonymousClass85).getInt(str, i10);
    }

    public final String A04(AnonymousClass85 anonymousClass85, String str, String str2) {
        return A00(anonymousClass85).getString(str, str2);
    }

    public final void A05(AnonymousClass85 anonymousClass85, String str, int i10) {
        SharedPreferences btSP = A00(anonymousClass85);
        btSP.edit().putInt(str, i10).apply();
    }

    public final void A06(AnonymousClass85 anonymousClass85, String str, String str2) {
        SharedPreferences btSP = A00(anonymousClass85);
        btSP.edit().putString(str, str2).apply();
    }
}
