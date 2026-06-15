package com.facebook.ads.redexgen.X;

import com.facebook.ads.AdError;
import java.util.concurrent.atomic.AtomicBoolean;
/* renamed from: com.facebook.ads.redexgen.X.mq  reason: case insensitive filesystem */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public class C2071mq implements C7I {
    public final /* synthetic */ N0 A00;

    public C2071mq(N0 n02) {
        this.A00 = n02;
    }

    @Override // com.facebook.ads.redexgen.X.C7I
    public final void ACF() {
        AtomicBoolean atomicBoolean;
        C2L c2l;
        atomicBoolean = this.A00.A0C;
        atomicBoolean.set(true);
        c2l = this.A00.A01;
        c2l.AEw(this.A00);
    }

    @Override // com.facebook.ads.redexgen.X.C7I
    public final void ACG() {
        C2L c2l;
        c2l = this.A00.A01;
        c2l.AEz(this.A00, AdError.CACHE_ERROR);
    }
}
