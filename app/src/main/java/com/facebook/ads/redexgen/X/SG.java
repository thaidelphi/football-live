package com.facebook.ads.redexgen.X;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public final class SG {
    public RW A03;
    public boolean A04;
    public boolean A05;
    public RN A02 = RN.A04;
    public int A01 = 0;
    public SF A00 = SF.A00;

    public static /* synthetic */ int A00(SG sg) {
        return sg.A01;
    }

    public static /* synthetic */ RN A01(SG sg) {
        return sg.A02;
    }

    public static /* synthetic */ RW A02(SG sg) {
        return sg.A03;
    }

    public static /* synthetic */ boolean A03(SG sg) {
        return sg.A05;
    }

    public static /* synthetic */ boolean A04(SG sg) {
        return sg.A04;
    }

    public final SG A05(RN rn) {
        AbstractC1589es.A01(rn);
        this.A02 = rn;
        return this;
    }

    public final SG A06(RW rw) {
        AbstractC1589es.A01(rw);
        this.A03 = rw;
        return this;
    }

    public final SG A07(RV[] rvArr) {
        AbstractC1589es.A01(rvArr);
        return A06(new CX(rvArr));
    }
}
