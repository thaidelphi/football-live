package com.facebook.ads.redexgen.X;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public class F2 implements Runnable {
    public final /* synthetic */ F3 A00;
    public final /* synthetic */ F4 A01;

    public F2(F3 f32, F4 f42) {
        this.A00 = f32;
        this.A01 = f42;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (BQ.A02(this)) {
            return;
        }
        try {
            this.A01.ACH();
        } catch (Throwable th) {
            BQ.A00(th, this);
        }
    }
}
