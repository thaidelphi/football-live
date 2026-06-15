package com.facebook.ads.redexgen.X;
/* renamed from: com.facebook.ads.redexgen.X.hT  reason: case insensitive filesystem */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public class C1748hT implements InterfaceC0769Fc {
    public final /* synthetic */ C1741hM A00;

    public C1748hT(C1741hM c1741hM) {
        this.A00 = c1741hM;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0769Fc
    public final void ACB() {
        boolean A0V;
        A0V = this.A00.A0V();
        if (A0V) {
            this.A00.A0L();
            this.A00.A0a.setToolbarActionMessage("");
            this.A00.A0a.setToolbarActionMode(0);
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0769Fc
    public final void AE1() {
        CH ch;
        this.A00.A0F = false;
        ch = this.A00.A0O;
        ch.A07();
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0769Fc
    public final void AE2() {
        CH ch;
        this.A00.A0F = true;
        ch = this.A00.A0O;
        ch.A06();
    }
}
