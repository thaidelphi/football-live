package com.facebook.ads.redexgen.X;
/* renamed from: com.facebook.ads.redexgen.X.bc  reason: case insensitive filesystem */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public class C1388bc extends C9K<KX> {
    public final /* synthetic */ C1387bb A00;

    public C1388bc(C1387bb c1387bb) {
        this.A00 = c1387bb;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.X.C9K
    /* renamed from: A00 */
    public final void A03(KX kx) {
        C1433cL c1433cL;
        C1433cL c1433cL2;
        C1433cL c1433cL3;
        String A02;
        c1433cL = this.A00.A00;
        if (c1433cL == null) {
            return;
        }
        C1387bb c1387bb = this.A00;
        C1387bb c1387bb2 = this.A00;
        c1433cL2 = this.A00.A00;
        int duration = c1433cL2.getDuration();
        c1433cL3 = this.A00.A00;
        A02 = c1387bb2.A02(duration - c1433cL3.getCurrentPositionInMillis());
        c1387bb.setText(A02);
    }

    @Override // com.facebook.ads.redexgen.X.C9K
    public final Class<KX> A01() {
        return KX.class;
    }
}
