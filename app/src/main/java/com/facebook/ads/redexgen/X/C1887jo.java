package com.facebook.ads.redexgen.X;

import com.facebook.ads.AudienceNetworkAds;
import java.util.Arrays;
/* renamed from: com.facebook.ads.redexgen.X.jo  reason: case insensitive filesystem */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public class C1887jo extends BY {
    public static byte[] A02;
    public static String[] A03 = {"w4GsGaTCcJA9wFWp2KNopTJOjqP8UDpw", "KJoDcXHO6XERgkU18ZjJw4XTw2kjUjU4", "R80wDz5faPpVYHVxJychiW2DfFSiKcfh", "t0Fzi1DjxmxSLCfz9XJ2VaEQot34azEH", "xhDPy00jOuqmtbPp3auQzix75rw9IX8h", "Uu427jBhvNl8yC5HrJluoVTOz", "6hGUj4iS9agb9", "ga1SCcoGdvIpCjYHRj6uJxXsB"};
    public final /* synthetic */ AudienceNetworkAds.InitListener A00;
    public final /* synthetic */ C1899k0 A01;

    public static String A01(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A02, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            byte b10 = copyOfRange[i13];
            if (A03[1].charAt(16) != '8') {
                throw new RuntimeException();
            }
            A03[1] = "4HO8Ss9k2AmZ8k9M8zrjCYxt48xbOoMK";
            copyOfRange[i13] = (byte) ((b10 ^ i12) ^ 70);
        }
        return new String(copyOfRange);
    }

    public static void A04() {
        A02 = new byte[]{3, 52, 59, 112, 35, 37, 51, 51, 53, 35, 35, 54, 37, 60, 60, 41, 112, 57, 62, 57, 36, 57, 49, 60, 57, 42, 53, 52, 113};
    }

    static {
        A04();
    }

    public C1887jo(C1899k0 c1899k0, AudienceNetworkAds.InitListener initListener) {
        this.A01 = c1899k0;
        this.A00 = initListener;
    }

    @Override // com.facebook.ads.redexgen.X.BY
    public final void A05() {
        try {
            C1872jZ.A02().A0C(this.A01);
        } catch (Throwable th) {
            this.A01.A08().A48(th);
        }
        C06288z.A0C(this.A01);
        if (this.A00 != null) {
            C06288z.A04(this.A00, new C06278y(true, A01(0, 29, 22)));
        }
    }
}
