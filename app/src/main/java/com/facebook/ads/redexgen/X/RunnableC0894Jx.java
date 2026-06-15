package com.facebook.ads.redexgen.X;
/* renamed from: com.facebook.ads.redexgen.X.Jx  reason: case insensitive filesystem */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public class RunnableC0894Jx implements Runnable {
    public final /* synthetic */ C1311aI A00;

    public RunnableC0894Jx(C1311aI c1311aI) {
        this.A00 = c1311aI;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (BQ.A02(this)) {
            return;
        }
        try {
            C1311aI.A03(this.A00);
            throw null;
        } catch (Throwable th) {
            BQ.A00(th, this);
        }
    }
}
