package com.unity3d.services.ads.gmascar.managers;

import com.unity3d.ads.IUnityAdsTokenListener;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
public interface IBiddingManager extends IUnityAdsTokenListener {
    String getFormattedToken(String str);

    String getTokenIdentifier();
}
