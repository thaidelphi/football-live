package com.applovin.impl.sdk.nativeAd;

import com.applovin.impl.sdk.AppLovinError;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public interface AppLovinNativeAdLoadListener {
    void onNativeAdLoadFailed(AppLovinError appLovinError);

    void onNativeAdLoaded(AppLovinNativeAd appLovinNativeAd);
}
