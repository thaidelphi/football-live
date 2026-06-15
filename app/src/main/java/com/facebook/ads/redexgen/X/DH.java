package com.facebook.ads.redexgen.X;

import java.util.concurrent.Executor;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public final class DH {
    public static DH A02;
    public final C1778hz A00;
    public final DJ A01;

    public DH(C1900k1 c1900k1, Executor executor, C06238t c06238t) {
        this.A01 = new DJ(c1900k1);
        this.A00 = new C1778hz(executor, c06238t, c1900k1);
    }

    private void A00() {
        this.A01.A03(this.A00);
    }

    public static void A01(C1900k1 c1900k1, Executor executor, C06238t c06238t) {
        if (!C06419m.A1V(c1900k1)) {
            return;
        }
        if (A02 == null) {
            A02 = new DH(c1900k1, executor, c06238t);
            A02.A00();
            return;
        }
        A02.A02(c06238t);
    }

    private void A02(C06238t c06238t) {
        this.A00.A07(c06238t);
    }
}
