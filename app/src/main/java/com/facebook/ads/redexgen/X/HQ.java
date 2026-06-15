package com.facebook.ads.redexgen.X;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public class HQ implements Runnable {
    public final /* synthetic */ C0906Kj A00;

    public HQ(C0906Kj c0906Kj) {
        this.A00 = c0906Kj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (BQ.A02(this)) {
            return;
        }
        try {
            ((AbstractC1548eD) this.A00).A09.A4Z(((AbstractC1548eD) this.A00).A0A.A7m());
        } catch (Throwable th) {
            BQ.A00(th, this);
        }
    }
}
