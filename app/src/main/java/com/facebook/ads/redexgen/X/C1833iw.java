package com.facebook.ads.redexgen.X;

import java.util.concurrent.atomic.AtomicBoolean;
/* renamed from: com.facebook.ads.redexgen.X.iw  reason: case insensitive filesystem */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public class C1833iw implements IL {
    public final /* synthetic */ C1827iq A00;

    public C1833iw(C1827iq c1827iq) {
        this.A00 = c1827iq;
    }

    @Override // com.facebook.ads.redexgen.X.IL
    public final void AFb() {
        AtomicBoolean atomicBoolean;
        AP ap;
        AP ap2;
        AtomicBoolean atomicBoolean2;
        atomicBoolean = this.A00.A0E;
        atomicBoolean.set(true);
        ap = this.A00.A02;
        if (ap != null) {
            ap2 = this.A00.A02;
            atomicBoolean2 = this.A00.A0D;
            ap2.AEQ(atomicBoolean2.get());
        }
    }
}
