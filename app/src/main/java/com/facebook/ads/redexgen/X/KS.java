package com.facebook.ads.redexgen.X;

import android.os.Handler;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public class KS extends AbstractC1398bm {
    public static String[] A01 = {"A0hxmHyocA20uKbzLNrX1cuoBFAzY21E", "I9xoCKjiIf8OmMJxcwGdtcNw1YuiDvi3", "dl", "8cu3hn6v04Mabo0DRb3BoKxPmV6m17RH", "M3PfsQ0uQOYBe23ut3RBur7M821ZKE4o", "dBLXd4nh7JPFvxg4r1eMmoTDEY", "dzagYupPsp4H2uhompZ2DySoLx14PfZd", "Z1qzuvaE1jq9Ec95ZFgzh3McR3fZkyWy"};
    public final /* synthetic */ C1390be A00;

    public KS(C1390be c1390be) {
        this.A00 = c1390be;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.X.C9K
    /* renamed from: A00 */
    public final void A03(C1399bn c1399bn) {
        C1433cL c1433cL;
        boolean z10;
        Handler handler;
        boolean A0D;
        boolean z11;
        Handler handler2;
        int i10;
        c1433cL = this.A00.A01;
        if (c1433cL == null) {
            return;
        }
        z10 = this.A00.A03;
        if (!z10 && c1399bn.A00().getAction() == 0) {
            C1390be c1390be = this.A00;
            String[] strArr = A01;
            if (strArr[5].length() == strArr[2].length()) {
                throw new RuntimeException();
            }
            A01[4] = "8qKCS4QoQxaUoDKBRazWJt0HJmuP0GoR";
            handler = c1390be.A05;
            handler.removeCallbacksAndMessages(null);
            A0D = this.A00.A0D(EnumC0860Ip.A04);
            if (A0D) {
                this.A00.A03();
                C1390be c1390be2 = this.A00;
                if (A01[3].charAt(1) != 'x') {
                    A01[3] = "krfS0sgwBFPIM38aK2Y5K2a50FO4BQxK";
                    c1390be2.A06(true, false);
                } else {
                    c1390be2.A06(true, false);
                }
            }
            z11 = this.A00.A02;
            if (!z11) {
                return;
            }
            handler2 = this.A00.A05;
            C1391bf c1391bf = new C1391bf(this);
            i10 = this.A00.A00;
            handler2.postDelayed(c1391bf, i10);
        }
    }
}
