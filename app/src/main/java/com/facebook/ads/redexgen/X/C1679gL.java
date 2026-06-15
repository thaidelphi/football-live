package com.facebook.ads.redexgen.X;

import java.lang.ref.WeakReference;
/* renamed from: com.facebook.ads.redexgen.X.gL  reason: case insensitive filesystem */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public class C1679gL implements FA {
    public final WeakReference<LU> A00;

    public C1679gL(LU lu) {
        this.A00 = new WeakReference<>(lu);
    }

    public /* synthetic */ C1679gL(LU lu, LZ lz) {
        this(lu);
    }

    @Override // com.facebook.ads.redexgen.X.FA
    public final void ADM(boolean z10) {
        LU cardLayout = this.A00.get();
        if (cardLayout != null) {
            cardLayout.A04 = z10;
            cardLayout.A02();
        }
    }
}
