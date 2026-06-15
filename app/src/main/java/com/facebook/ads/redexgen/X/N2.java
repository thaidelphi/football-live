package com.facebook.ads.redexgen.X;

import com.facebook.ads.AdError;
import java.util.concurrent.atomic.AtomicBoolean;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public class N2 extends AbstractC2042mN {
    public final /* synthetic */ N0 A00;
    public final /* synthetic */ AbstractC2062mh A01;
    public final /* synthetic */ C0966Mu A02;
    public final /* synthetic */ boolean A03;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public N2(N0 n02, boolean z10, boolean z11, C0966Mu c0966Mu, AbstractC2062mh abstractC2062mh) {
        super(z10);
        this.A00 = n02;
        this.A03 = z11;
        this.A02 = c0966Mu;
        this.A01 = abstractC2062mh;
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC2042mN
    public final void A00() {
        C2L c2l;
        c2l = this.A00.A01;
        c2l.AEz(this.A01, AdError.CACHE_ERROR);
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC2042mN
    public final void A01(boolean z10) {
        C1900k1 c1900k1;
        BG bg;
        AtomicBoolean atomicBoolean;
        C2L c2l;
        C1900k1 c1900k12;
        C1900k1 c1900k13;
        c1900k1 = this.A00.A04;
        if (!C06419m.A1m(c1900k1) || !this.A03) {
            bg = this.A00.A05;
            if (bg == BG.A0I) {
                c1900k12 = this.A00.A04;
                c1900k12.A0F().ADg();
            }
            atomicBoolean = this.A00.A0C;
            atomicBoolean.set(true);
            c2l = this.A00.A01;
            c2l.AEw(this.A01);
            return;
        }
        N0 n02 = this.A00;
        c1900k13 = this.A00.A04;
        n02.A06 = AbstractC0811Gs.A01(c1900k13, this.A02, 0, new C2072mr(this));
    }
}
