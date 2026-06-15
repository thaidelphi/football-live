package com.facebook.ads.redexgen.X;
/* renamed from: com.facebook.ads.redexgen.X.i9  reason: case insensitive filesystem */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public class C1786i9 implements InterfaceC0698Cj {
    public int A00;
    public final InterfaceC0698Cj A01;

    public C1786i9(InterfaceC0698Cj interfaceC0698Cj, int i10) {
        this.A01 = interfaceC0698Cj;
        this.A00 = i10;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0698Cj
    public final void AGG(String str) {
        if (this.A00 > 0) {
            this.A01.AGG(str);
            this.A00--;
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0698Cj
    public final void flush() {
        this.A01.flush();
    }
}
