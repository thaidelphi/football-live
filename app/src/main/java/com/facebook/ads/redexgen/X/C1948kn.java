package com.facebook.ads.redexgen.X;
/* renamed from: com.facebook.ads.redexgen.X.kn  reason: case insensitive filesystem */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public class C1948kn extends AnonymousClass67 {
    public boolean A00 = false;
    public final /* synthetic */ AbstractC1947km A01;

    public C1948kn(AbstractC1947km abstractC1947km) {
        this.A01 = abstractC1947km;
    }

    @Override // com.facebook.ads.redexgen.X.AnonymousClass67
    public final void A0L(MG mg, int i10) {
        super.A0L(mg, i10);
        if (i10 == 0 && this.A00) {
            this.A00 = false;
            this.A01.A0F();
        }
    }

    @Override // com.facebook.ads.redexgen.X.AnonymousClass67
    public final void A0M(MG mg, int i10, int i11) {
        if (i10 != 0 || i11 != 0) {
            this.A00 = true;
        }
    }
}
