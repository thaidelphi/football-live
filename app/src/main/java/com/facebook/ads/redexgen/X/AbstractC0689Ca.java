package com.facebook.ads.redexgen.X;

import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.text.TextUtils;
import java.util.Arrays;
/* renamed from: com.facebook.ads.redexgen.X.Ca  reason: case insensitive filesystem */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public abstract class AbstractC0689Ca {
    public static byte[] A00;

    static {
        A03();
    }

    public static String A02(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 108);
        }
        return new String(copyOfRange);
    }

    public static void A03() {
        A00 = new byte[]{62, 50, 48, 115, 59, 60, 62, 56, 63, 50, 50, 54, 115, 54, 60, 41, 60, 51, 60};
    }

    public static PackageInfo A00(AnonymousClass85 anonymousClass85) {
        return A01(anonymousClass85, A02(0, 19, 49));
    }

    public static PackageInfo A01(AnonymousClass85 anonymousClass85, String str) {
        PackageManager packageManager;
        if (TextUtils.isEmpty(str) || (packageManager = anonymousClass85.getPackageManager()) == null) {
            return null;
        }
        try {
            return packageManager.getPackageInfo(str, 1);
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        } catch (RuntimeException unused2) {
            return null;
        }
    }

    public static boolean A04(AnonymousClass85 anonymousClass85, String str) {
        PackageInfo packageInfo = A01(anonymousClass85, str);
        return packageInfo != null;
    }
}
