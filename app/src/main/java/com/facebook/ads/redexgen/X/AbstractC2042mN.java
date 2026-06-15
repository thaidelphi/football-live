package com.facebook.ads.redexgen.X;
/* renamed from: com.facebook.ads.redexgen.X.mN  reason: case insensitive filesystem */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public abstract class AbstractC2042mN implements InterfaceC05907l {
    public final boolean A00;

    public abstract void A00();

    public abstract void A01(boolean z10);

    public AbstractC2042mN(boolean z10) {
        this.A00 = z10;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC05907l
    public final void ACa() {
        if (this.A00) {
            A00();
        } else {
            A01(false);
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC05907l
    public final void ACj() {
        A01(true);
    }
}
