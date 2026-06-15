package com.facebook.ads.redexgen.X;

import com.facebook.ads.MediaViewVideoRenderer;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public class M8 extends AbstractC1413c1 {
    public final /* synthetic */ C05746v A00;

    public M8(C05746v c05746v) {
        this.A00 = c05746v;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.X.C9K
    /* renamed from: A00 */
    public final void A03(C1414c2 c1414c2) {
        MediaViewVideoRenderer mediaViewVideoRenderer;
        if (this.A00.A08 != null) {
            C1816ie.A0L(this.A00.A08.getInternalNativeAd()).A1f(false, true);
        }
        mediaViewVideoRenderer = this.A00.A00;
        mediaViewVideoRenderer.onError();
    }
}
