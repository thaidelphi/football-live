package com.facebook.ads.redexgen.X;
/* renamed from: com.facebook.ads.redexgen.X.Ku  reason: case insensitive filesystem */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public class C0917Ku extends AbstractC1404bs {
    public final /* synthetic */ C0914Kr A00;

    public C0917Ku(C0914Kr c0914Kr) {
        this.A00 = c0914Kr;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.X.C9K
    /* renamed from: A00 */
    public final void A03(KX kx) {
        float f10;
        C1433cL c1433cL;
        HI hi;
        this.A00.A0e(kx);
        f10 = this.A00.A01;
        c1433cL = this.A00.A0a;
        float duration = (f10 * c1433cL.getDuration()) + kx.A00();
        hi = this.A00.A0Y;
        hi.ADB(duration);
    }
}
