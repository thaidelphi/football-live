package com.unity3d.services.ads.operation.load;

import com.unity3d.ads.UnityAds;
import com.unity3d.services.ads.operation.IAdModule;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
public interface ILoadModule extends IAdModule<ILoadOperation, LoadOperationState> {
    void onUnityAdsAdLoaded(String str);

    void onUnityAdsFailedToLoad(String str, UnityAds.UnityAdsLoadError unityAdsLoadError, String str2);
}
