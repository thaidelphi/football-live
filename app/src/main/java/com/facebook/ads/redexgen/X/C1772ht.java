package com.facebook.ads.redexgen.X;
/* renamed from: com.facebook.ads.redexgen.X.ht  reason: case insensitive filesystem */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public class C1772ht extends AnonymousClass67 {
    public static String[] A01 = {"LeWmJ2AEMrGR8tgfwsG9m8UwM76zwmUz", "6Bm", "ck2sw", "Oj1Ntvfg6dck0NxJmQASjzaKZXVqT4Sf", "CtYf7ZmPdO", "plI1JnuA", "RZR4g54lk6KTwqItkRA6ECctcTUw", "cGd5igXf7vOVCpmuGQi5cRxrBgQCM2pW"};
    public final /* synthetic */ C04331h A00;

    public C1772ht(C04331h c04331h) {
        this.A00 = c04331h;
    }

    @Override // com.facebook.ads.redexgen.X.AnonymousClass67
    public final void A0L(MG mg, int i10) {
        int A23;
        DY dy;
        super.A0L(mg, i10);
        C1972lC linearLayoutManager = this.A00.getLayoutManager();
        if (linearLayoutManager != null && (A23 = linearLayoutManager.A23()) >= 0) {
            C04331h c04331h = this.A00;
            int scrollPosition = A01[3].charAt(13);
            if (scrollPosition == 48) {
                throw new RuntimeException();
            }
            A01[5] = "JmqJ93Os7fwoNBdh";
            if (c04331h.getAdapter() == null || A23 >= this.A00.getAdapter().A0C() || (dy = (DY) mg.A1F(A23)) == null) {
                return;
            }
            dy.AIL();
        }
    }
}
