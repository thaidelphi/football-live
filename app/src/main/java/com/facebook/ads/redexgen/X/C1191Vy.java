package com.facebook.ads.redexgen.X;
/* renamed from: com.facebook.ads.redexgen.X.Vy  reason: case insensitive filesystem */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public class C1191Vy implements Uj {
    public final long A00;
    public final C1153Ui A01;

    public C1191Vy(long j10) {
        this(j10, 0L);
    }

    public C1191Vy(long j10, long j11) {
        this.A00 = j10;
        this.A01 = new C1153Ui(j11 == 0 ? C1154Uk.A03 : new C1154Uk(0L, j11));
    }

    @Override // com.facebook.ads.redexgen.X.Uj
    public final long A7j() {
        return this.A00;
    }

    @Override // com.facebook.ads.redexgen.X.Uj
    public final C1153Ui A8r(long j10) {
        return this.A01;
    }

    @Override // com.facebook.ads.redexgen.X.Uj
    public final boolean AAY() {
        return false;
    }
}
