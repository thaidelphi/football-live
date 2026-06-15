package com.facebook.ads.redexgen.X;
/* renamed from: com.facebook.ads.redexgen.X.5K  reason: invalid class name */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public final class C5K implements InterfaceC1509dZ {
    public InterfaceC1558eN A02;
    public InterfaceC1791iE<String> A03;
    public String A04;
    public boolean A05;
    public boolean A06;
    public final C1529du A07 = new C1529du();
    public int A00 = 8000;
    public int A01 = 8000;

    public final C5K A00(InterfaceC1558eN interfaceC1558eN) {
        this.A02 = interfaceC1558eN;
        return this;
    }

    public final C5K A01(String str) {
        this.A04 = str;
        return this;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1509dZ
    /* renamed from: A02 */
    public final C04160p A58() {
        C04160p c04160p = new C04160p(this.A04, this.A00, this.A01, this.A05, this.A07, this.A03, this.A06);
        if (this.A02 != null) {
            c04160p.A3t(this.A02);
        }
        return c04160p;
    }
}
