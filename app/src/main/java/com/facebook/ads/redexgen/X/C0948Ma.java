package com.facebook.ads.redexgen.X;

import android.os.Handler;
import com.facebook.ads.RewardData;
import com.facebook.ads.internal.protocol.AdPlacementType;
import java.util.Arrays;
/* renamed from: com.facebook.ads.redexgen.X.Ma  reason: case insensitive filesystem */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public final class C0948Ma extends AbstractC2037mI {
    public static byte[] A00;
    public static String[] A01 = {"vV6RQP0QGAizSnvHrhrEiTJKYqnkk7vR", "gVueu7WJkm8gI", "", "raAPQvYZN3qaAVuN8G4E0NVfm2Y0LRUe", "w5hc", "", "RHGb3VvP2c2qxldOqnFEpaAIYmVmOJg8", "ZdfM9COnhESAyQW1NqvAdN1Ku5n51qre"};

    public static String A01(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] - i12) - 32);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        A00 = new byte[]{-43, -45, -32, -110, -31, -32, -34, -21, -110, -27, -41, -26, -110, -31, -32, -110, -28, -41, -23, -45, -28, -42, -41, -42, -110, -24, -37, -42, -41, -31, -110, -45, -42, -27, -80, -79, 98, -93, -90, -93, -78, -74, -89, -76, 98, -76, -89, -93, -90, -69, 98, -74, -79, 98, -75, -89, -74, 98, -76, -89, -71, -93, -76, -90, 98, -79, -80};
    }

    static {
        A02();
    }

    public C0948Ma(C1900k1 c1900k1, AnonymousClass37 anonymousClass37) {
        super(c1900k1, anonymousClass37);
    }

    private C2028m9 A00(Runnable runnable) {
        return new C2028m9(this, runnable);
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC2037mI
    public final void A0P() {
        AbstractC2062mh abstractC2062mh = (AbstractC2062mh) this.A01;
        abstractC2062mh.A00(this.A08.A00);
        abstractC2062mh.A01(this.A08.A01);
        abstractC2062mh.A0J();
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC2037mI
    public final void A0R(AnonymousClass23 anonymousClass23, C06238t c06238t, C06218r c06218r, AnonymousClass38 anonymousClass38) {
        N0 n02 = (N0) anonymousClass23;
        C2029mA c2029mA = new C2029mA(this, anonymousClass38, n02);
        if (C06419m.A2V(this.A0B)) {
            Handler A0H = A0H();
            C06248u A05 = c06238t.A05();
            String[] strArr = A01;
            if (strArr[3].charAt(31) != strArr[7].charAt(31)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A01;
            strArr2[5] = "";
            strArr2[2] = "";
            A0H.postDelayed(c2029mA, A05.A05());
        }
        n02.A0K(this.A0B, A00(c2029mA), anonymousClass38, this.A08.A06, this.A08.A04, this.A08.A05);
    }

    public final void A0a(RewardData rewardData) {
        if (this.A01 != null) {
            if (this.A01.A8a() == AdPlacementType.REWARDED_VIDEO) {
                AbstractC2062mh rewardedVideoAdapter = (AbstractC2062mh) this.A01;
                rewardedVideoAdapter.A02(rewardData);
                return;
            }
            throw new IllegalStateException(A01(0, 34, 82));
        }
        throw new IllegalStateException(A01(34, 33, 34));
    }
}
