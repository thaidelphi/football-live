package com.appnext.nativeads.designed_native_ads.interfaces;

import com.appnext.core.AppnextError;
import com.appnext.nativeads.designed_native_ads.AppnextDesignedNativeAdData;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public interface AppnextDesignedNativeAdViewCallbacks {
    void onAdClicked(AppnextDesignedNativeAdData appnextDesignedNativeAdData);

    void onAppnextAdsError(AppnextError appnextError);

    void onAppnextAdsLoadedSuccessfully();
}
