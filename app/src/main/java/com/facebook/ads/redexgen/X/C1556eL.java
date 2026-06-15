package com.facebook.ads.redexgen.X;
/* renamed from: com.facebook.ads.redexgen.X.eL  reason: case insensitive filesystem */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public class C1556eL implements CG {
    public final /* synthetic */ int A00;
    public final /* synthetic */ BY A01;
    public final /* synthetic */ AbstractC1548eD A02;

    public C1556eL(AbstractC1548eD abstractC1548eD, int i10, BY by) {
        this.A02 = abstractC1548eD;
        this.A00 = i10;
        this.A01 = by;
    }

    @Override // com.facebook.ads.redexgen.X.CG
    public final void ACi() {
        this.A01.run();
    }

    @Override // com.facebook.ads.redexgen.X.CG
    public final void AEg(float f10) {
        this.A02.A08.setProgress(100.0f * (1.0f - (f10 / this.A00)));
    }
}
