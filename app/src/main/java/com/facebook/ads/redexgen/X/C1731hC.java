package com.facebook.ads.redexgen.X;

import android.widget.ImageView;
/* renamed from: com.facebook.ads.redexgen.X.hC  reason: case insensitive filesystem */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public class C1731hC implements InterfaceC0763Ew {
    public final /* synthetic */ C0753Em A00;

    public C1731hC(C0753Em c0753Em) {
        this.A00 = c0753Em;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0763Ew
    public final void ACT(boolean z10) {
        boolean z11;
        ImageView imageView;
        ImageView imageView2;
        ImageView imageView3;
        this.A00.A0D(z10);
        z11 = this.A00.A0C;
        if (z11) {
            imageView = this.A00.A00;
            if (imageView != null) {
                imageView2 = this.A00.A00;
                imageView2.setEnabled(z10);
                imageView3 = this.A00.A00;
                imageView3.setAlpha(z10 ? 1.0f : 0.3f);
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0763Ew
    public final void ADC(boolean z10) {
        boolean z11;
        ImageView imageView;
        ImageView imageView2;
        ImageView imageView3;
        this.A00.A0D(z10);
        z11 = this.A00.A0C;
        if (z11) {
            imageView = this.A00.A02;
            if (imageView != null) {
                imageView2 = this.A00.A02;
                imageView2.setEnabled(z10);
                imageView3 = this.A00.A02;
                imageView3.setAlpha(z10 ? 1.0f : 0.3f);
            }
        }
    }
}
