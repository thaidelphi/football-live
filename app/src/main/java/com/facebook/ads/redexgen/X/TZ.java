package com.facebook.ads.redexgen.X;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public final class TZ implements Uj {
    public final /* synthetic */ TY A00;

    public TZ(TY ty) {
        this.A00 = ty;
    }

    @Override // com.facebook.ads.redexgen.X.Uj
    public final long A7j() {
        AbstractC1205Wm abstractC1205Wm;
        long j10;
        abstractC1205Wm = this.A00.A0B;
        j10 = this.A00.A07;
        return abstractC1205Wm.A0C(j10);
    }

    @Override // com.facebook.ads.redexgen.X.Uj
    public final C1153Ui A8r(long j10) {
        AbstractC1205Wm abstractC1205Wm;
        long j11;
        long j12;
        long targetGranule;
        long targetGranule2;
        long j13;
        long j14;
        abstractC1205Wm = this.A00.A0B;
        long A0D = abstractC1205Wm.A0D(j10);
        j11 = this.A00.A09;
        j12 = this.A00.A08;
        targetGranule = this.A00.A09;
        targetGranule2 = this.A00.A07;
        j13 = this.A00.A09;
        j14 = this.A00.A08;
        long estimatedPosition = AbstractC1672gE.A0T((j11 + (((j12 - targetGranule) * A0D) / targetGranule2)) - 30000, j13, j14 - 1);
        return new C1153Ui(new C1154Uk(j10, estimatedPosition));
    }

    @Override // com.facebook.ads.redexgen.X.Uj
    public final boolean AAY() {
        return true;
    }
}
