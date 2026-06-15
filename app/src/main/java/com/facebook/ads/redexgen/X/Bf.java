package com.facebook.ads.redexgen.X;

import java.util.concurrent.atomic.AtomicReference;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public abstract class Bf {
    public static final AtomicReference<InterfaceC0675Be> A00 = new AtomicReference<>(null);

    public static InterfaceC0675Be A00() {
        InterfaceC0675Be errorLogger = A00.get();
        if (errorLogger == null) {
            return new C1800iN();
        }
        return errorLogger;
    }

    public static void A01(InterfaceC0675Be interfaceC0675Be) {
        A00.set(interfaceC0675Be);
    }
}
