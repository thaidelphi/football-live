package com.applovin.impl.mediation.ads;

import android.content.Context;
import com.applovin.impl.l2;
import com.applovin.impl.mediation.ads.MaxFullscreenAdImpl;
import com.applovin.impl.w2;
import com.applovin.impl.y1;
import com.applovin.mediation.MaxAd;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.mediation.MaxReward;
import com.applovin.mediation.MaxRewardedAdListener;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class MaxRewardedAdImpl extends MaxFullscreenAdImpl {

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    private class b extends MaxFullscreenAdImpl.b implements MaxRewardedAdListener {
        private b() {
            super();
        }

        @Override // com.applovin.impl.mediation.ads.MaxFullscreenAdImpl.b, com.applovin.mediation.MaxAdListener
        public void onAdHidden(MaxAd maxAd) {
            w2 w2Var = (w2) maxAd;
            if (!w2Var.t0().get()) {
                com.applovin.impl.sdk.n nVar = MaxRewardedAdImpl.this.logger;
                if (com.applovin.impl.sdk.n.a()) {
                    MaxRewardedAdImpl maxRewardedAdImpl = MaxRewardedAdImpl.this;
                    com.applovin.impl.sdk.n nVar2 = maxRewardedAdImpl.logger;
                    String str = maxRewardedAdImpl.tag;
                    nVar2.a(str, "User not rewarded for ad: " + maxAd);
                }
                MaxRewardedAdImpl.this.sdk.D().a(y1.f9656a0, w2Var);
            }
            super.onAdHidden(maxAd);
        }

        @Override // com.applovin.mediation.MaxRewardedAdListener
        public void onUserRewarded(MaxAd maxAd, MaxReward maxReward) {
            com.applovin.impl.sdk.n nVar = MaxRewardedAdImpl.this.logger;
            if (com.applovin.impl.sdk.n.a()) {
                MaxRewardedAdImpl maxRewardedAdImpl = MaxRewardedAdImpl.this;
                com.applovin.impl.sdk.n nVar2 = maxRewardedAdImpl.logger;
                String str = maxRewardedAdImpl.tag;
                nVar2.a(str, "MaxRewardedAdListener.onUserRewarded(ad=" + maxAd + ", reward=" + maxReward + "), listener=" + MaxRewardedAdImpl.this.adListener);
            }
            l2.a(MaxRewardedAdImpl.this.adListener, maxAd, maxReward, true);
        }
    }

    public MaxRewardedAdImpl(String str, MaxAdFormat maxAdFormat, MaxFullscreenAdImpl.a aVar, String str2, com.applovin.impl.sdk.j jVar, Context context) {
        super(str, maxAdFormat, aVar, str2, jVar, context);
    }

    @Override // com.applovin.impl.mediation.ads.MaxFullscreenAdImpl
    protected MaxFullscreenAdImpl.b createAdListenerWrapper() {
        return new b();
    }
}
