package com.unity3d.ads;

import com.unity3d.ads.UnityAds;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public interface IUnityAdsLoadListener {
    void onUnityAdsAdLoaded(String str);

    void onUnityAdsFailedToLoad(String str, UnityAds.UnityAdsLoadError unityAdsLoadError, String str2);
}
