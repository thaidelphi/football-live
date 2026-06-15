package com.facebook.ads.redexgen.X;
/* renamed from: com.facebook.ads.redexgen.X.Wf  reason: case insensitive filesystem */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public class C1198Wf implements Uj {
    public final long A00;
    public final long A01;
    public final long A02;
    public final long A03;
    public final long A04;
    public final long A05;
    public final U8 A06;

    public C1198Wf(U8 u82, long j10, long j11, long j12, long j13, long j14, long j15) {
        this.A06 = u82;
        this.A03 = j10;
        this.A05 = j11;
        this.A02 = j12;
        this.A04 = j13;
        this.A01 = j14;
        this.A00 = j15;
    }

    public final long A05(long j10) {
        return this.A06.AJV(j10);
    }

    @Override // com.facebook.ads.redexgen.X.Uj
    public final long A7j() {
        return this.A03;
    }

    @Override // com.facebook.ads.redexgen.X.Uj
    public final C1153Ui A8r(long j10) {
        return new C1153Ui(new C1154Uk(j10, U7.A05(this.A06.AJV(j10), this.A05, this.A02, this.A04, this.A01, this.A00)));
    }

    @Override // com.facebook.ads.redexgen.X.Uj
    public final boolean AAY() {
        return true;
    }
}
