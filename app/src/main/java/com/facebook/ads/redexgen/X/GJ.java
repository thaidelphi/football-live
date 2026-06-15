package com.facebook.ads.redexgen.X;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public class GJ implements Runnable {
    public final /* synthetic */ C1652fu A00;

    public GJ(C1652fu c1652fu) {
        this.A00 = c1652fu;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z10;
        if (BQ.A02(this)) {
            return;
        }
        try {
            z10 = this.A00.A0P;
            if (!z10) {
                return;
            }
            this.A00.A0N();
        } catch (Throwable th) {
            BQ.A00(th, this);
        }
    }
}
