package com.facebook.ads.redexgen.X;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public class CX implements RW {
    public final C3 A00;
    public final XF A01;
    public final RV[] A02;

    public CX(RV... rvArr) {
        this(rvArr, new C3(), new XF());
    }

    public CX(RV[] rvArr, C3 c32, XF xf) {
        this.A02 = new RV[rvArr.length + 2];
        System.arraycopy(rvArr, 0, this.A02, 0, rvArr.length);
        this.A00 = c32;
        this.A01 = xf;
        this.A02[rvArr.length] = c32;
        this.A02[rvArr.length + 1] = xf;
    }

    @Override // com.facebook.ads.redexgen.X.RW
    public final C1264Yv A45(C1264Yv c1264Yv) {
        this.A01.A02(c1264Yv.A01);
        this.A01.A01(c1264Yv.A00);
        return c1264Yv;
    }

    @Override // com.facebook.ads.redexgen.X.RW
    public final boolean A46(boolean z10) {
        this.A00.A0D(z10);
        return z10;
    }

    @Override // com.facebook.ads.redexgen.X.RW
    public final RV[] A6p() {
        return this.A02;
    }

    @Override // com.facebook.ads.redexgen.X.RW
    public final long A8K(long j10) {
        return this.A01.A00(j10);
    }

    @Override // com.facebook.ads.redexgen.X.RW
    public final long A8y() {
        return this.A00.A0C();
    }
}
