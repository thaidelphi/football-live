package com.facebook.ads.redexgen.X;

import com.facebook.ads.NativeAdBase;
import com.facebook.ads.NativeAdListener;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public final class M0 implements InterfaceC1815id {
    public NativeAdBase A00;
    public NativeAdListener A01;

    public M0(NativeAdListener nativeAdListener, NativeAdBase nativeAdBase) {
        this.A01 = nativeAdListener;
        this.A00 = nativeAdBase;
    }

    @Override // com.facebook.ads.redexgen.X.AM
    public final void AC6() {
        BP.A00(new C1811iZ(this));
    }

    @Override // com.facebook.ads.redexgen.X.AM
    public final void ACA() {
        BP.A00(new C1812ia(this));
    }

    @Override // com.facebook.ads.redexgen.X.AM
    public final void AD4(C0660Ag c0660Ag) {
        BP.A00(new C1814ic(this, c0660Ag));
    }

    @Override // com.facebook.ads.redexgen.X.AM
    public final void AE0() {
        BP.A00(new C1810iY(this));
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1815id
    public final void AE5() {
        BP.A00(new C1813ib(this));
    }
}
