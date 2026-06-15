package com.facebook.ads.redexgen.X;

import android.app.Activity;
import android.os.Build;
import java.util.Arrays;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public class CI implements Runnable {
    public static byte[] A04;
    public static String[] A05 = {"rpDB7rKXNsFsWkDz6IFMGYiQm5SIurhV", "Zw7gqQaUB6b8OXSgkCM5acQChbi0fPQB", "ij96xAlSFdb9T8", "9lv2KZaF3yGNFfkp5oM5AxENUzlVWnoh", "BtiLNkHShKV4ox8o5K74B7kMcT6dIDQ3", "4qYR1HKsivt0y2MxZdwkaRz4cXsJEuH0", "44IOIp9GJ1CB282l", "5xjMlDyVDQDeuAskdNZft2cHBWd2iktp"};
    public final /* synthetic */ C04592h A00;
    public final /* synthetic */ CL A01;
    public final /* synthetic */ String A02;
    public final /* synthetic */ String A03;

    public static String A00(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A04, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 29);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A04 = new byte[]{56, 62, 40, 63, 46, 33, 36, 46, 38};
    }

    static {
        A01();
    }

    public CI(CL cl, String str, C04592h c04592h, String str2) {
        this.A01 = cl;
        this.A03 = str;
        this.A00 = c04592h;
        this.A02 = str2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z10;
        C1900k1 c1900k1;
        if (BQ.A02(this)) {
            return;
        }
        try {
            z10 = this.A01.A00;
            if (!z10) {
                return;
            }
            boolean z11 = false;
            this.A01.A00 = false;
            c1900k1 = this.A01.A03;
            Activity A0E = c1900k1.A0E();
            boolean z12 = false;
            int i10 = Build.VERSION.SDK_INT;
            String[] strArr = A05;
            if (strArr[1].charAt(30) != strArr[4].charAt(30)) {
                throw new RuntimeException();
            }
            A05[2] = "zngGPNErwRp983";
            if (i10 >= 24) {
                if (A0E != null && A0E.isInMultiWindowMode()) {
                    z11 = true;
                }
                z12 = z11;
            }
            if (!z12 && C0685Bw.A00().A03()) {
                return;
            }
            this.A01.A05(this.A03 != null ? this.A03 : A00(0, 9, 80), this.A00, this.A02);
        } catch (Throwable th) {
            if (A05[2].length() != 14) {
                BQ.A00(th, this);
                return;
            }
            A05[2] = "Mnh0XYPOQy81qp";
            BQ.A00(th, this);
        }
    }
}
