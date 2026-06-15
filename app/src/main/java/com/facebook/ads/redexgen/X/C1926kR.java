package com.facebook.ads.redexgen.X;
/* renamed from: com.facebook.ads.redexgen.X.kR  reason: case insensitive filesystem */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public class C1926kR extends BL {
    public final /* synthetic */ C1923kO A00;
    public final /* synthetic */ C0660Ag A01;

    public C1926kR(C1923kO c1923kO, C0660Ag c0660Ag) {
        this.A00 = c1923kO;
        this.A01 = c0660Ag;
    }

    @Override // com.facebook.ads.redexgen.X.BL
    public final void A01() {
        AnonymousClass72 anonymousClass72;
        AnonymousClass72 anonymousClass722;
        anonymousClass72 = this.A00.A00;
        if (anonymousClass72.A00() != null) {
            anonymousClass722 = this.A00.A00;
            anonymousClass722.A00().onAdError(C8.A00(this.A01));
        }
    }
}
