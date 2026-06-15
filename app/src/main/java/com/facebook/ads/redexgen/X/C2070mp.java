package com.facebook.ads.redexgen.X;

import com.facebook.ads.AdError;
import java.util.concurrent.atomic.AtomicBoolean;
/* renamed from: com.facebook.ads.redexgen.X.mp  reason: case insensitive filesystem */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public class C2070mp implements AnonymousClass33 {
    public final /* synthetic */ N0 A00;

    public C2070mp(N0 n02) {
        this.A00 = n02;
    }

    @Override // com.facebook.ads.redexgen.X.AnonymousClass33
    public final void AET(AdError adError) {
        C2L c2l;
        c2l = this.A00.A01;
        c2l.AEz(this.A00, adError);
    }

    @Override // com.facebook.ads.redexgen.X.AnonymousClass33
    public final void AEU() {
        AtomicBoolean atomicBoolean;
        C2L c2l;
        atomicBoolean = this.A00.A0C;
        atomicBoolean.set(true);
        c2l = this.A00.A01;
        c2l.AEw(this.A00);
    }
}
