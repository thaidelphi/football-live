package com.facebook.ads.redexgen.X;
/* renamed from: com.facebook.ads.redexgen.X.i7  reason: case insensitive filesystem */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public class C1785i7 implements InterfaceC0698Cj {
    public final C0697Ci A00;
    public final InterfaceC0698Cj A01;

    public C1785i7(InterfaceC0698Cj interfaceC0698Cj, int i10, int i11) {
        this.A01 = interfaceC0698Cj;
        this.A00 = new C0697Ci(i10, i11);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0698Cj
    public final void AGG(String str) {
        boolean A08;
        this.A00.A04(str);
        if (this.A00.A02() != null) {
            A08 = AbstractC0700Cl.A08(this.A00);
            if (A08) {
                this.A01.AGG(this.A00.A02());
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0698Cj
    public final void flush() {
        boolean A08;
        this.A00.A03();
        while (this.A00.A02() != null) {
            A08 = AbstractC0700Cl.A08(this.A00);
            if (A08) {
                this.A01.AGG(this.A00.A02());
            }
            this.A00.A03();
        }
    }
}
