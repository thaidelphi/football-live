package com.facebook.ads.redexgen.X;
/* renamed from: com.facebook.ads.redexgen.X.kQ  reason: case insensitive filesystem */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public class C1925kQ extends BL {
    public final /* synthetic */ C1924kP A00;

    public C1925kQ(C1924kP c1924kP) {
        this.A00 = c1924kP;
    }

    @Override // com.facebook.ads.redexgen.X.BL
    public final void A01() {
        AnonymousClass72 anonymousClass72;
        AnonymousClass72 anonymousClass722;
        anonymousClass72 = this.A00.A01.A00;
        if (anonymousClass72.A00() != null) {
            anonymousClass722 = this.A00.A01.A00;
            anonymousClass722.A00().onAdsLoaded();
        }
    }
}
