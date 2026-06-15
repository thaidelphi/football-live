package com.facebook.ads.redexgen.X;

import com.facebook.ads.CacheFlag;
import java.util.EnumSet;
/* renamed from: com.facebook.ads.redexgen.X.Mr  reason: case insensitive filesystem */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public final class C0963Mr extends AbstractC2037mI {
    public C0963Mr(C1900k1 c1900k1, AnonymousClass37 anonymousClass37) {
        super(c1900k1, anonymousClass37);
    }

    private C2034mF A00(Runnable runnable) {
        return new C2034mF(this, runnable);
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC2037mI
    public final C2S A0I() {
        C2084n3 successfullyLoadedAdapter = (C2084n3) this.A01;
        if (successfullyLoadedAdapter != null) {
            return successfullyLoadedAdapter.A09();
        }
        return null;
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC2037mI
    public final void A0P() {
        C2084n3 interstitialAdapter = (C2084n3) this.A01;
        interstitialAdapter.A0B();
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC2037mI
    public final void A0R(AnonymousClass23 anonymousClass23, C06238t c06238t, C06218r c06218r, AnonymousClass38 anonymousClass38) {
        C2084n3 c2084n3 = (C2084n3) anonymousClass23;
        C2035mG c2035mG = new C2035mG(this, anonymousClass38, c2084n3);
        A0H().postDelayed(c2035mG, c06238t.A05().A05());
        EnumSet<CacheFlag> enumSet = this.A08.A0B;
        if (enumSet == null) {
            enumSet = CacheFlag.ALL;
        }
        c2084n3.A0A(this.A0B, A00(c2035mG), anonymousClass38, enumSet, this.A08.A04, this.A08.A05, this.A08.A02);
    }
}
