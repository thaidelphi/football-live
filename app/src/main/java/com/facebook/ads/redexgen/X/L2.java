package com.facebook.ads.redexgen.X;

import android.os.Handler;
import android.os.Looper;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public class L2 extends AbstractC1413c1 {
    public final /* synthetic */ L1 A00;

    public L2(L1 l12) {
        this.A00 = l12;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.X.C9K
    /* renamed from: A00 */
    public final void A03(C1414c2 c1414c2) {
        new Handler(Looper.getMainLooper()).post(new H5(this));
    }
}
