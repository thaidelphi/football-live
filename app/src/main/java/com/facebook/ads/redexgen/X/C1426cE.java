package com.facebook.ads.redexgen.X;

import com.unity3d.services.UnityAdsConstants;
/* renamed from: com.facebook.ads.redexgen.X.cE  reason: case insensitive filesystem */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public class C1426cE extends C9K<C0897Ka> {
    public static String[] A01 = {"Xm4oO1fgaoMOjj45N8r00LATVp4gHrYG", "MO5WiyOQHdAIBAUWSCIdsXDipyRYP8jB", "8ZD7midsUGLLHTawsvmUwyHXKE63ocNK", "eXsxAyUW", "", "KTVY2IhXiCn688zdyYvQYy9fTV", "AuZpLEz4ubgydEKdqdaVeIvdhtRZUWrW", "O3ESmZOEeO27LGblO6LyKeoijHa02l1o"};
    public final /* synthetic */ C0898Kb A00;

    public C1426cE(C0898Kb c0898Kb) {
        this.A00 = c0898Kb;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.X.C9K
    /* renamed from: A00 */
    public final void A03(C0897Ka c0897Ka) {
        int A00 = c0897Ka.A00();
        int duration = c0897Ka.A01();
        int currentPosition = this.A00.A00;
        if (currentPosition > 0 && A00 == duration) {
            int currentPosition2 = this.A00.A00;
            if (duration > currentPosition2) {
                return;
            }
        }
        int currentPosition3 = A00 + UnityAdsConstants.RequestPolicy.RETRY_WAIT_BASE;
        if (duration < currentPosition3) {
            if (duration == 0) {
                C0898Kb c0898Kb = this.A00;
                int currentPosition4 = this.A00.A00;
                c0898Kb.A0j(currentPosition4);
                return;
            }
            this.A00.A0j(duration);
            return;
        }
        C0898Kb c0898Kb2 = this.A00;
        String[] strArr = A01;
        String str = strArr[7];
        String str2 = strArr[0];
        int duration2 = str.charAt(6);
        int currentPosition5 = str2.charAt(6);
        if (duration2 == currentPosition5) {
            throw new RuntimeException();
        }
        String[] strArr2 = A01;
        strArr2[5] = "eYEuq0G9XeIp1YNIhTPdTiyuyz";
        strArr2[3] = "ZD2QUH1g";
        c0898Kb2.A0j(A00);
    }

    @Override // com.facebook.ads.redexgen.X.C9K
    public final Class<C0897Ka> A01() {
        return C0897Ka.class;
    }
}
