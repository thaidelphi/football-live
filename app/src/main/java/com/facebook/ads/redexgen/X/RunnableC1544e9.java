package com.facebook.ads.redexgen.X;
/* renamed from: com.facebook.ads.redexgen.X.e9  reason: case insensitive filesystem */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public final class RunnableC1544e9 implements Runnable {
    public final InterfaceC1543e8 A00;

    public RunnableC1544e9(InterfaceC1543e8 interfaceC1543e8) {
        this.A00 = interfaceC1543e8;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (BQ.A02(this)) {
            return;
        }
        try {
            this.A00.ADx();
        } catch (Throwable th) {
            BQ.A00(th, this);
        }
    }
}
