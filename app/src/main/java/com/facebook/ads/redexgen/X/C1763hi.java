package com.facebook.ads.redexgen.X;
/* renamed from: com.facebook.ads.redexgen.X.hi  reason: case insensitive filesystem */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public class C1763hi implements CG {
    public final /* synthetic */ int A00;
    public final /* synthetic */ AbstractC1762hh A01;

    public C1763hi(AbstractC1762hh abstractC1762hh, int i10) {
        this.A01 = abstractC1762hh;
        this.A00 = i10;
    }

    @Override // com.facebook.ads.redexgen.X.CG
    public final void ACi() {
        DR dr;
        this.A01.A03 = false;
        this.A01.A0V();
        this.A01.A0E.setToolbarActionMode(this.A01.getCloseButtonStyle());
        if (this.A01.A07 && this.A01.A06 != null) {
            this.A01.A06.A05();
            dr = this.A01.A09;
            dr.A4Z(new C1736hH().A6b());
        }
    }

    @Override // com.facebook.ads.redexgen.X.CG
    public final void AEg(float f10) {
        this.A01.A0E.setProgress(100.0f * (1.0f - (f10 / this.A00)));
    }
}
