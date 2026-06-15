package com.facebook.ads.redexgen.X;

import android.os.Handler;
/* renamed from: com.facebook.ads.redexgen.X.cP  reason: case insensitive filesystem */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public class C1437cP extends BY {
    public final /* synthetic */ C1433cL A00;

    public C1437cP(C1433cL c1433cL) {
        this.A00 = c1433cL;
    }

    @Override // com.facebook.ads.redexgen.X.BY
    public final void A05() {
        boolean z10;
        C9J c9j;
        Handler handler;
        int i10;
        z10 = this.A00.A04;
        if (!z10) {
            c9j = this.A00.A0C;
            c9j.A02(new KX(this.A00.getCurrentPositionInMillis()));
            handler = this.A00.A08;
            i10 = this.A00.A01;
            handler.postDelayed(this, i10);
        }
    }
}
