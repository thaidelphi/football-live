package com.facebook.ads.redexgen.X;

import com.facebook.ads.internal.view.FullScreenAdToolbar;
/* renamed from: com.facebook.ads.redexgen.X.eA  reason: case insensitive filesystem */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public class C1545eA implements HI {
    public final /* synthetic */ int A00;
    public final /* synthetic */ C1534dz A01;

    public C1545eA(C1534dz c1534dz, int i10) {
        this.A01 = c1534dz;
        this.A00 = i10;
    }

    @Override // com.facebook.ads.redexgen.X.HI
    public final void ACS() {
        this.A01.A0S(false, this.A00);
    }

    @Override // com.facebook.ads.redexgen.X.HI
    public final void ACr(int i10) {
        C1534dz.A02(this.A01, i10);
    }

    @Override // com.facebook.ads.redexgen.X.HI
    public final void ADB(float f10) {
        boolean z10;
        z10 = this.A01.A08;
        if (!z10) {
            this.A01.A0H(f10);
        }
    }

    @Override // com.facebook.ads.redexgen.X.HI
    public final void AF6(boolean z10) {
        this.A01.A0R(z10);
    }

    @Override // com.facebook.ads.redexgen.X.HI
    public final void AFY(String str) {
        C1900k1 c1900k1;
        DR dr;
        EC ec;
        c1900k1 = this.A01.A0D;
        c1900k1.A0F().A3Q(str);
        dr = this.A01.A0H;
        ec = this.A01.A0J;
        dr.A4Z(ec.A7r());
        this.A01.A0I(3);
    }

    @Override // com.facebook.ads.redexgen.X.HI
    public final void AJh() {
        FullScreenAdToolbar fullScreenAdToolbar;
        FullScreenAdToolbar fullScreenAdToolbar2;
        this.A01.setUnskippableSecondsComplete(false);
        fullScreenAdToolbar = this.A01.A0I;
        fullScreenAdToolbar.setProgressImmediate(0.0f);
        fullScreenAdToolbar2 = this.A01.A0I;
        fullScreenAdToolbar2.setToolbarActionMode(2);
    }

    @Override // com.facebook.ads.redexgen.X.HI
    public final void AJi(float f10) {
        FullScreenAdToolbar fullScreenAdToolbar;
        fullScreenAdToolbar = this.A01.A0I;
        fullScreenAdToolbar.setProgress(100.0f * f10);
    }
}
