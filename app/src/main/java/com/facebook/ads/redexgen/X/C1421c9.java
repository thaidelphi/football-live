package com.facebook.ads.redexgen.X;

import java.util.Map;
/* renamed from: com.facebook.ads.redexgen.X.c9  reason: case insensitive filesystem */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public class C1421c9 extends AbstractC04813d {
    public final /* synthetic */ C1420c8 A00;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1421c9(C1420c8 c1420c8, double d10, double d11, double d12, boolean z10) {
        super(d10, d11, d12, z10);
        this.A00 = c1420c8;
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC04813d
    public final void A00(boolean z10, boolean z11, C04833f c04833f) {
        C1900k1 c1900k1;
        String str;
        Map A0J;
        boolean z12;
        c1900k1 = this.A00.A0D;
        if (C06419m.A0y(c1900k1)) {
            z12 = this.A00.A0A;
            if (z12) {
                return;
            }
        }
        if (z11) {
            this.A00.A0A = true;
            C1420c8 c1420c8 = this.A00;
            str = this.A00.A0J;
            A0J = this.A00.A0J(IH.A0B);
            c1420c8.A0R(str, A0J);
        }
    }
}
