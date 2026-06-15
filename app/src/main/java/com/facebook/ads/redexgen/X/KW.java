package com.facebook.ads.redexgen.X;

import android.os.Handler;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public class KW extends AbstractC1409bx {
    public final /* synthetic */ C1390be A00;

    public KW(C1390be c1390be) {
        this.A00 = c1390be;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.X.C9K
    /* renamed from: A00 */
    public final void A03(KY ky) {
        Handler handler;
        boolean A0D;
        handler = this.A00.A05;
        handler.removeCallbacksAndMessages(null);
        A0D = this.A00.A0D(EnumC0860Ip.A04);
        if (A0D) {
            this.A00.A03();
            this.A00.A06(true, false);
        }
        this.A00.A03 = true;
    }
}
