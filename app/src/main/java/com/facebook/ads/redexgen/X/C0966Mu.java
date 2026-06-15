package com.facebook.ads.redexgen.X;

import java.io.Serializable;
import java.util.Arrays;
import java.util.List;
import org.json.JSONObject;
/* renamed from: com.facebook.ads.redexgen.X.Mu  reason: case insensitive filesystem */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public final class C0966Mu extends AbstractC2058md implements Serializable {
    public static byte[] A00 = null;
    public static String[] A01 = {"r6wxjppTPk8qqzLRyjcbdQcA77ZMVo55", "Rh6olI4hONJ8yannxuNSF0WPku4wNPsq", "dN5FaQTClehdtxF9CoF19H85hY8wkvGi", "rjB6kg9SBUGr2KH1eIh2YUrCeaZ2IjVH", "uwE4iuczSrXuOAqhix1jvRvaNYVxSPYl", "nB4f3mkqn6tAKhT6MHcT9FS4Qvlri7ut", "bNzGTI7RRMeGoANXUPkwX9ogVwA9ri6n", "cACVCPwRSeRCIlqlGfLHSAYd9Lc4yhZp"};
    public static final long serialVersionUID = 2751287062553772011L;

    public static String A03(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] - i12) - 87);
        }
        return new String(copyOfRange);
    }

    public static void A04() {
        String[] strArr = A01;
        if (strArr[2].charAt(16) == strArr[1].charAt(16)) {
            throw new RuntimeException();
        }
        String[] strArr2 = A01;
        strArr2[2] = "vDQKNoss9qiPXd8S2Aus0c1HGbd5gMQl";
        strArr2[1] = "nSwGzQN60p1E6knkFapFA8fuyb3FeF6N";
        A00 = new byte[]{51, 38, 56, 34, 51, 37, 38, 37, 32, 55, 42, 37, 38, 48};
    }

    static {
        A04();
    }

    public C0966Mu(List<C2T> list) {
        super(list);
    }

    public static C0966Mu A02(JSONObject jSONObject, C1900k1 c1900k1) {
        C0966Mu c0966Mu = new C0966Mu(AbstractC2058md.A08(jSONObject, c1900k1, new C2053mY()));
        c0966Mu.A1k(jSONObject);
        c0966Mu.A10(A03(0, 14, 106));
        return c0966Mu;
    }

    @Override // com.facebook.ads.redexgen.X.C2S
    public final int A0X() {
        if (A1A()) {
            return 3;
        }
        C04672p A07 = A1b().A0F().A07();
        String[] strArr = A01;
        if (strArr[2].charAt(16) != strArr[1].charAt(16)) {
            A01[7] = "ezJ8b8PzsS2LRx1DwJprOyWzSGtMGS3H";
            if (A07 != null) {
                C2T A1b = A1b();
                String[] strArr2 = A01;
                if (strArr2[5].charAt(18) != strArr2[3].charAt(18)) {
                    A01[7] = "ok7knfjrqIuTR3wAzxIRCawOj6kVTRCj";
                    if (A1b.A0F().A07().A0P()) {
                        return 4;
                    }
                    return 1;
                }
                throw new RuntimeException();
            }
            return 0;
        }
        throw new RuntimeException();
    }

    @Override // com.facebook.ads.redexgen.X.C2S
    public final int A0Y() {
        return A1b().A0F().A05();
    }
}
