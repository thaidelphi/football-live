package com.facebook.ads.redexgen.X;

import android.os.Handler;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public class KK extends AbstractC1398bm {
    public final /* synthetic */ C1383bX A00;

    public KK(C1383bX c1383bX) {
        this.A00 = c1383bX;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.X.C9K
    /* renamed from: A00 */
    public final void A03(C1399bn c1399bn) {
        C1433cL c1433cL;
        Handler handler;
        c1433cL = this.A00.A01;
        if (c1433cL == null || c1399bn.A00().getAction() != 0) {
            return;
        }
        handler = this.A00.A04;
        handler.removeCallbacksAndMessages(null);
        this.A00.A07(new C0848Id(this));
    }
}
