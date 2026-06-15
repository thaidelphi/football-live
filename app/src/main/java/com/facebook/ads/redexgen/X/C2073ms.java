package com.facebook.ads.redexgen.X;

import com.facebook.ads.AdError;
import java.util.concurrent.atomic.AtomicBoolean;
/* renamed from: com.facebook.ads.redexgen.X.ms  reason: case insensitive filesystem */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public class C2073ms implements C7I {
    public final /* synthetic */ N0 A00;
    public final /* synthetic */ boolean A01;

    public C2073ms(N0 n02, boolean z10) {
        this.A00 = n02;
        this.A01 = z10;
    }

    @Override // com.facebook.ads.redexgen.X.C7I
    public final void ACF() {
        C1900k1 c1900k1;
        AtomicBoolean atomicBoolean;
        C2L c2l;
        C1900k1 c1900k12;
        C2S c2s;
        c1900k1 = this.A00.A04;
        if (!C06419m.A1m(c1900k1) || !this.A01) {
            atomicBoolean = this.A00.A0C;
            atomicBoolean.set(true);
            c2l = this.A00.A01;
            c2l.AEw(this.A00);
            return;
        }
        N0 n02 = this.A00;
        c1900k12 = this.A00.A04;
        c2s = this.A00.A03;
        n02.A06 = AbstractC0811Gs.A01(c1900k12, (C0966Mu) c2s, 0, new C2074mt(this));
    }

    @Override // com.facebook.ads.redexgen.X.C7I
    public final void ACG() {
        C2L c2l;
        c2l = this.A00.A01;
        c2l.AEz(this.A00, AdError.CACHE_ERROR);
    }
}
