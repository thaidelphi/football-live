package com.facebook.ads.redexgen.X;

import android.os.Handler;
/* renamed from: com.facebook.ads.redexgen.X.db  reason: case insensitive filesystem */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public class C1511db implements CZ {
    public final /* synthetic */ C0906Kj A00;

    public C1511db(C0906Kj c0906Kj) {
        this.A00 = c0906Kj;
    }

    @Override // com.facebook.ads.redexgen.X.CZ
    public final void AEK(String str) {
        Handler handler;
        handler = this.A00.A0G;
        handler.postDelayed(new HP(this), 2000L);
    }

    @Override // com.facebook.ads.redexgen.X.CZ
    public final void AEL(String str) {
        this.A00.A0H(AE.A0c);
    }
}
