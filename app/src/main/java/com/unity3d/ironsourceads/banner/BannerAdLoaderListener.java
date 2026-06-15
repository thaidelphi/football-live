package com.unity3d.ironsourceads.banner;

import com.ironsource.mediationsdk.logger.IronSourceError;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
public interface BannerAdLoaderListener {
    void onBannerAdLoadFailed(IronSourceError ironSourceError);

    void onBannerAdLoaded(BannerAdView bannerAdView);
}
