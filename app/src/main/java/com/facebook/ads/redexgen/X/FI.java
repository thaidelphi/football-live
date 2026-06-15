package com.facebook.ads.redexgen.X;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public class FI implements Runnable {
    public final /* synthetic */ AbstractC1694gb A00;

    public FI(AbstractC1694gb abstractC1694gb) {
        this.A00 = abstractC1694gb;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (BQ.A02(this)) {
            return;
        }
        try {
            if (this.A00.A0F.getVisibility() == 0) {
                this.A00.A0R(8);
            }
        } catch (Throwable th) {
            BQ.A00(th, this);
        }
    }
}
