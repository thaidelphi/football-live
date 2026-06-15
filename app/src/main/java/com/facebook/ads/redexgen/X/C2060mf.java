package com.facebook.ads.redexgen.X;
/* renamed from: com.facebook.ads.redexgen.X.mf  reason: case insensitive filesystem */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public class C2060mf implements FA {
    public final /* synthetic */ int A00;
    public final /* synthetic */ AbstractC2059me A01;
    public final /* synthetic */ C1816ie A02;

    public C2060mf(AbstractC2059me abstractC2059me, int i10, C1816ie c1816ie) {
        this.A01 = abstractC2059me;
        this.A00 = i10;
        this.A02 = c1816ie;
    }

    @Override // com.facebook.ads.redexgen.X.FA
    public final void ADM(boolean z10) {
        JK jk;
        if (this.A00 == 0) {
            C1816ie c1816ie = this.A02;
            jk = this.A01.A04;
            c1816ie.A1c(jk);
        }
        this.A02.A1f(z10, true);
    }
}
