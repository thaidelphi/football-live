package com.facebook.ads.redexgen.X;

import android.view.View;
import com.facebook.ads.NativeAdLayout;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public abstract class EI {
    public static String[] A00 = {"B", "b", "N7Y4O4Xp0bXRpwQYmrnUbbD5XPNn0nfl", "PsTgqcCc8jcMoxm2RXWy1mA6rhf59", "zMLnehec4ICfDGOtTSDp3symXOGZpaRx", "AnvCnC9uV", "JoTWE5M61fQkMjrwCjPz5KG5vu8cqeKb", "O6aKPphMSjoWO4xDWlhiQ7T2kp0fs"};
    public static final int A01 = (int) (CP.A02 * 200.0f);
    public static final int A03 = (int) (CP.A02 * 200.0f);
    public static final int A02 = (int) (CP.A02 * 50.0f);

    public static C2H A00(NativeAdLayout nativeAdLayout) {
        if (nativeAdLayout == null) {
            return C2H.A04;
        }
        if (A03(nativeAdLayout)) {
            return C2H.A05;
        }
        return C2H.A03;
    }

    public static EH A01(C1900k1 c1900k1, A7 a72, String str, View view) {
        if (view == null) {
            return null;
        }
        int w10 = view.getWidth();
        int height = view.getHeight();
        if (w10 >= A01 && height >= A01) {
            return new C1732hD(c1900k1, a72, str);
        }
        if (w10 >= A03) {
            int i10 = A02;
            String[] strArr = A00;
            if (strArr[6].charAt(28) == strArr[4].charAt(28)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A00;
            strArr2[7] = "MXaU9iKOIfaGo19ccmM4SYJQh1BEv";
            strArr2[3] = "urarsFS1owFx4szCeqq2cq67A77KP";
            if (height >= i10) {
                return new C1733hE(c1900k1, a72, str);
            }
        }
        return null;
    }

    public static C1734hF A02(C1900k1 c1900k1, A7 a72, String str, C04652n c04652n, DS ds, DR dr) {
        return new C1734hF(c1900k1, a72, str, c04652n, ds, dr);
    }

    /* JADX WARN: Code restructure failed: missing block: B:5:0x000e, code lost:
        if (r4 < r0) goto L7;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean A03(com.facebook.ads.NativeAdLayout r6) {
        /*
            int r5 = r6.getWidth()
            int r4 = r6.getHeight()
            int r0 = com.facebook.ads.redexgen.X.EI.A01
            if (r5 < r0) goto L10
            int r0 = com.facebook.ads.redexgen.X.EI.A01
            if (r4 >= r0) goto L2a
        L10:
            int r3 = com.facebook.ads.redexgen.X.EI.A03
            java.lang.String[] r2 = com.facebook.ads.redexgen.X.EI.A00
            r0 = 1
            r1 = r2[r0]
            r0 = 0
            r0 = r2[r0]
            int r1 = r1.length()
            int r0 = r0.length()
            if (r1 == r0) goto L2c
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>()
            throw r0
        L2a:
            r0 = 0
            goto L3f
        L2c:
            java.lang.String[] r2 = com.facebook.ads.redexgen.X.EI.A00
            java.lang.String r1 = "e"
            r0 = 1
            r2[r0] = r1
            java.lang.String r1 = "I"
            r0 = 0
            r2[r0] = r1
            if (r5 < r3) goto L3e
            int r0 = com.facebook.ads.redexgen.X.EI.A02
            if (r4 >= r0) goto L2a
        L3e:
            r0 = 1
        L3f:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.EI.A03(com.facebook.ads.NativeAdLayout):boolean");
    }
}
