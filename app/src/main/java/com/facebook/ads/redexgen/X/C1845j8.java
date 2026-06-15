package com.facebook.ads.redexgen.X;
/* renamed from: com.facebook.ads.redexgen.X.j8  reason: case insensitive filesystem */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public class C1845j8 extends BY {
    public final /* synthetic */ C1843j6 A00;

    public C1845j8(C1843j6 c1843j6) {
        this.A00 = c1843j6;
    }

    @Override // com.facebook.ads.redexgen.X.BY
    public final void A05() {
        long j10;
        long j11;
        C1843j6.A00(this.A00);
        j10 = this.A00.A01;
        if (j10 > 0) {
            try {
                j11 = this.A00.A01;
                Thread.sleep(j11);
            } catch (InterruptedException unused) {
            }
        }
        this.A00.A0B();
    }
}
