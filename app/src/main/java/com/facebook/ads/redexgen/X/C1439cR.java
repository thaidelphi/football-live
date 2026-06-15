package com.facebook.ads.redexgen.X;
/* renamed from: com.facebook.ads.redexgen.X.cR  reason: case insensitive filesystem */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public class C1439cR extends BY {
    public final /* synthetic */ C1438cQ A00;

    public C1439cR(C1438cQ c1438cQ) {
        this.A00 = c1438cQ;
    }

    @Override // com.facebook.ads.redexgen.X.BY
    public final void A05() {
        ID id;
        C1433cL c1433cL;
        AbstractC1409bx abstractC1409bx;
        AbstractC1415c3 abstractC1415c3;
        id = this.A00.A02;
        id.A06();
        c1433cL = this.A00.A03;
        C9J<C9K, C9I> eventBus = c1433cL.getEventBus();
        abstractC1409bx = this.A00.A05;
        abstractC1415c3 = this.A00.A04;
        eventBus.A04(abstractC1409bx, abstractC1415c3);
    }
}
