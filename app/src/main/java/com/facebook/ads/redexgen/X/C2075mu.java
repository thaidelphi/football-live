package com.facebook.ads.redexgen.X;

import com.facebook.ads.AdError;
import java.util.concurrent.atomic.AtomicBoolean;
/* renamed from: com.facebook.ads.redexgen.X.mu  reason: case insensitive filesystem */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public class C2075mu implements InterfaceC05907l {
    public final /* synthetic */ N0 A00;

    public C2075mu(N0 n02) {
        this.A00 = n02;
    }

    private void A00(boolean z10) {
        C2L c2l;
        AtomicBoolean atomicBoolean;
        C2L c2l2;
        if (!z10) {
            c2l = this.A00.A01;
            c2l.AEz(this.A00, AdError.CACHE_ERROR);
            return;
        }
        atomicBoolean = this.A00.A0C;
        atomicBoolean.set(true);
        c2l2 = this.A00.A01;
        c2l2.AEw(this.A00);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC05907l
    public final void ACa() {
        A00(false);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC05907l
    public final void ACj() {
        A00(true);
    }
}
