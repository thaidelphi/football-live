package com.facebook.ads.redexgen.X;
/* renamed from: com.facebook.ads.redexgen.X.hv  reason: case insensitive filesystem */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public class C1774hv implements InterfaceC0762Ev {
    public final /* synthetic */ C1773hu A00;

    public C1774hv(C1773hu c1773hu) {
        this.A00 = c1773hu;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0762Ev
    public final void AEM(String str) {
        this.A00.A0C.setProgress(100);
        this.A00.A05 = false;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0762Ev
    public final void AEO(String str) {
        this.A00.A05 = true;
        this.A00.A0B.setUrl(str);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0762Ev
    public final void AEj(int i10) {
        if (this.A00.A05) {
            this.A00.A0C.setProgress(i10);
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0762Ev
    public final void AEl(String str) {
        this.A00.A0B.setTitle(str);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0762Ev
    public final void AEo() {
        this.A00.A0A.ACY(14);
    }
}
