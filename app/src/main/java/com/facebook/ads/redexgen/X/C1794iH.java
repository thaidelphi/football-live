package com.facebook.ads.redexgen.X;

import android.os.Handler;
/* renamed from: com.facebook.ads.redexgen.X.iH  reason: case insensitive filesystem */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public class C1794iH extends BY {
    public final /* synthetic */ CH A00;

    public C1794iH(CH ch) {
        this.A00 = ch;
    }

    @Override // com.facebook.ads.redexgen.X.BY
    public final void A05() {
        Handler handler;
        long j10;
        if (this.A00.A05()) {
            this.A00.A02();
            handler = this.A00.A05;
            j10 = this.A00.A02;
            handler.postDelayed(this, j10);
        }
    }
}
