package com.facebook.ads.redexgen.X;
/* renamed from: com.facebook.ads.redexgen.X.iC  reason: case insensitive filesystem */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public class C1789iC implements InterfaceC0698Cj {
    public int A00;
    public final InterfaceC0698Cj A01;
    public final InterfaceC0698Cj A02;

    public C1789iC(InterfaceC0698Cj interfaceC0698Cj, int i10, InterfaceC0698Cj interfaceC0698Cj2) {
        this.A01 = interfaceC0698Cj;
        this.A00 = i10;
        this.A02 = interfaceC0698Cj2;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0698Cj
    public final void AGG(String str) {
        if (this.A00 > 0) {
            this.A01.AGG(str);
            this.A01.flush();
            this.A00--;
            return;
        }
        this.A02.AGG(str);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0698Cj
    public final void flush() {
        this.A02.flush();
    }
}
