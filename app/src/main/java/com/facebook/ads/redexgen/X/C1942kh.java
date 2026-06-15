package com.facebook.ads.redexgen.X;

import com.facebook.ads.AdListener;
/* renamed from: com.facebook.ads.redexgen.X.kh  reason: case insensitive filesystem */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public class C1942kh extends BL {
    public final /* synthetic */ C1939ke A00;

    public C1942kh(C1939ke c1939ke) {
        this.A00 = c1939ke;
    }

    @Override // com.facebook.ads.redexgen.X.BL
    public final void A01() {
        C05566d c05566d;
        C05566d c05566d2;
        C05566d c05566d3;
        c05566d = this.A00.A01;
        if (c05566d.A06() != null) {
            c05566d2 = this.A00.A01;
            AdListener A06 = c05566d2.A06();
            c05566d3 = this.A00.A01;
            A06.onAdLoaded(c05566d3.A07());
        }
    }
}
