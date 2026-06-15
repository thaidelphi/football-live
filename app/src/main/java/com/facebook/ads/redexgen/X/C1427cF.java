package com.facebook.ads.redexgen.X;
/* renamed from: com.facebook.ads.redexgen.X.cF  reason: case insensitive filesystem */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public class C1427cF extends C9K<KX> {
    public static String[] A01 = {"Etf6rxr38TN0vQCp7eNtUvsDOmNclbJq", "tsAjjvZCMDWdS", "8hGTWRVePtIxVw2NOXuq9knVHvw3DPvW", "EWxkCjZIostDvyF", "5rZAWcCWfjjM2", "LrhlSMt3F2A2PPkpDiBfjHpLA", "jQk7ZNmPb7V9ueUuvUfiKmSE", "mvg7pIDRu6IgLugvRarlC3XDTGoYv5EO"};
    public final /* synthetic */ C0898Kb A00;

    public C1427cF(C0898Kb c0898Kb) {
        this.A00 = c0898Kb;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.X.C9K
    /* renamed from: A00 */
    public final void A03(KX kx) {
        C1433cL c1433cL;
        C1433cL c1433cL2;
        int A00 = kx.A00();
        int currentPositionMS = this.A00.A00;
        if (currentPositionMS > 0) {
            c1433cL = this.A00.A0C;
            int currentPositionMS2 = c1433cL.getDuration();
            if (A00 == currentPositionMS2) {
                c1433cL2 = this.A00.A0C;
                int duration = c1433cL2.getDuration();
                int currentPositionMS3 = this.A00.A00;
                if (duration > currentPositionMS3) {
                    return;
                }
            }
        }
        C0898Kb c0898Kb = this.A00;
        if (A01[5].length() == 7) {
            throw new RuntimeException();
        }
        A01[5] = "7AA42mFgyTVlZSuOszNfTs49";
        c0898Kb.A0k(A00);
    }

    @Override // com.facebook.ads.redexgen.X.C9K
    public final Class<KX> A01() {
        return KX.class;
    }
}
