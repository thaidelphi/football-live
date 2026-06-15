package com.facebook.ads.redexgen.X;

import com.facebook.ads.AdError;
import java.util.concurrent.atomic.AtomicBoolean;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public class N1 extends AbstractC2042mN {
    public final /* synthetic */ int A00;
    public final /* synthetic */ N0 A01;
    public final /* synthetic */ C2056mb A02;
    public final /* synthetic */ C0966Mu A03;
    public final /* synthetic */ C1900k1 A04;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public N1(N0 n02, boolean z10, C1900k1 c1900k1, C0966Mu c0966Mu, C2056mb c2056mb, int i10) {
        super(z10);
        this.A01 = n02;
        this.A04 = c1900k1;
        this.A03 = c0966Mu;
        this.A02 = c2056mb;
        this.A00 = i10;
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC2042mN
    public final void A00() {
        C2L c2l;
        c2l = this.A01.A01;
        c2l.AEz(this.A01, AdError.CACHE_ERROR);
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC2042mN
    public final void A01(boolean z10) {
        AtomicBoolean atomicBoolean;
        C2L c2l;
        N0.A0D = null;
        if (z10) {
            this.A04.A01().AIK(this.A03.A1g(), this.A02.A1a());
        }
        if (this.A00 == 0) {
            atomicBoolean = this.A01.A0C;
            atomicBoolean.set(true);
            c2l = this.A01.A01;
            c2l.AEw(this.A01);
        }
        this.A01.A0C(this.A04, this.A02, this.A00 + 1);
    }
}
