package com.facebook.ads.redexgen.X;

import android.os.Bundle;
import com.facebook.ads.CacheFlag;
import com.facebook.ads.InterstitialAd;
import com.facebook.ads.RewardData;
import java.util.EnumSet;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public final class MX extends AbstractC2024m5 {
    public static final C3J A02 = new C2011ls();
    public C2017ly A00;
    public final C2013lu A01;

    public MX(C2013lu c2013lu, String str) {
        super(c2013lu.A05(), str, A02.A5J(c2013lu));
        this.A01 = c2013lu;
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC2024m5
    public final void A08() {
        if (this.A00 != null) {
            this.A00.destroy();
        }
        super.A00.AIS(C3D.A03);
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC2024m5
    public final void A09() {
        this.A00 = new C2017ly(this.A01, this, A04());
        this.A00.A0G(this.A01.A0B(), this.A01.A07());
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC2024m5
    public final void A0D(boolean z10) {
        this.A05.AIt(z10);
    }

    public final void A0E(InterstitialAd interstitialAd, EnumSet<CacheFlag> cacheFlags, String str) {
        if (super.A00.A6K()) {
            return;
        }
        this.A01.A0D(interstitialAd);
        if (this.A00 != null) {
            this.A00.A0G(cacheFlags, str);
            return;
        }
        this.A01.A0K(cacheFlags);
        this.A01.A0H(str);
        if (AbstractC06449p.A07(this.A02) && AbstractC06449p.A08(this.A02)) {
            A05();
        } else {
            A09();
        }
    }

    public final void A0F(RewardData rewardData) {
        this.A01.A0F(rewardData);
        if (super.A01.A01) {
            super.A01.A0F(com.ironsource.d9.f16965i, C3Y.A00(new Bundle(), rewardData));
        }
    }

    public final boolean A0G() {
        if (this.A00 != null) {
            return this.A00.A0H();
        }
        return this.A01.A00() > 0 && C0709Cu.A00() > this.A01.A00();
    }

    public final boolean A0H() {
        if (this.A00 != null) {
            return this.A00.A0I();
        }
        return super.A00.A6f() == C3D.A05;
    }

    public final boolean A0I(InterstitialAd interstitialAd, InterstitialAd.InterstitialShowAdConfig interstitialShowAdConfig) {
        if (super.A00.A6L()) {
            return false;
        }
        this.A01.A0D(interstitialAd);
        if (super.A01.A01) {
            A0A(-1);
            return true;
        } else if (this.A00 != null) {
            return this.A00.A0J();
        } else {
            this.A00 = new C2017ly(this.A01, this, A04());
            this.A00.A0J();
            return false;
        }
    }
}
