package com.facebook.ads.redexgen.X;
/* renamed from: com.facebook.ads.redexgen.X.Rq  reason: case insensitive filesystem */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public final class C1087Rq implements Uj {
    public final int A00;
    public final long A01;
    public final long A02;
    public final long A03;
    public final YZ A04;

    public C1087Rq(YZ yz, int i10, long j10, long j11) {
        this.A04 = yz;
        this.A00 = i10;
        this.A03 = j10;
        this.A01 = (j11 - j10) / yz.A02;
        this.A02 = A00(this.A01);
    }

    private long A00(long j10) {
        return AbstractC1672gE.A0U(j10 * this.A00, 1000000L, this.A04.A04);
    }

    @Override // com.facebook.ads.redexgen.X.Uj
    public final long A7j() {
        return this.A02;
    }

    @Override // com.facebook.ads.redexgen.X.Uj
    public final C1153Ui A8r(long j10) {
        long A0T = AbstractC1672gE.A0T((this.A04.A04 * j10) / (this.A00 * 1000000), 0L, this.A01 - 1);
        long j11 = this.A03 + (this.A04.A02 * A0T);
        long A00 = A00(A0T);
        C1154Uk c1154Uk = new C1154Uk(A00, j11);
        if (A00 >= j10 || A0T == this.A01 - 1) {
            return new C1153Ui(c1154Uk);
        }
        long j12 = 1 + A0T;
        return new C1153Ui(c1154Uk, new C1154Uk(A00(j12), this.A03 + (this.A04.A02 * j12)));
    }

    @Override // com.facebook.ads.redexgen.X.Uj
    public final boolean AAY() {
        return true;
    }
}
