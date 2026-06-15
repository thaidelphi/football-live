package com.facebook.ads.redexgen.X;

import android.os.Handler;
/* renamed from: com.facebook.ads.redexgen.X.gd  reason: case insensitive filesystem */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public class C1696gd extends BY {
    public final /* synthetic */ F9 A00;

    public C1696gd(F9 f92) {
        this.A00 = f92;
    }

    @Override // com.facebook.ads.redexgen.X.BY
    public final void A05() {
        boolean z10;
        Handler handler;
        Runnable runnable;
        this.A00.A03();
        z10 = this.A00.A08;
        if (z10) {
            handler = this.A00.A0D;
            runnable = this.A00.A0F;
            handler.postDelayed(runnable, 250L);
        }
    }
}
