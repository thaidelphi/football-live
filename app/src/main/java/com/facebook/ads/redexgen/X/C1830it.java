package com.facebook.ads.redexgen.X;

import java.util.concurrent.atomic.AtomicBoolean;
/* renamed from: com.facebook.ads.redexgen.X.it  reason: case insensitive filesystem */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public class C1830it implements FA {
    public final /* synthetic */ C1827iq A00;

    public C1830it(C1827iq c1827iq) {
        this.A00 = c1827iq;
    }

    @Override // com.facebook.ads.redexgen.X.FA
    public final void ADM(boolean z10) {
        AtomicBoolean atomicBoolean;
        AtomicBoolean atomicBoolean2;
        AP ap;
        AP ap2;
        atomicBoolean = this.A00.A0D;
        atomicBoolean.set(z10);
        atomicBoolean2 = this.A00.A0E;
        if (atomicBoolean2.get()) {
            ap = this.A00.A02;
            if (ap != null) {
                ap2 = this.A00.A02;
                ap2.AEQ(z10);
            }
        }
    }
}
