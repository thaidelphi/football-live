package com.unity3d.mediation.banner;

import com.unity3d.mediation.LevelPlayAdError;
import com.unity3d.mediation.LevelPlayAdInfo;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
public interface LevelPlayBannerAdViewListener {
    void onAdClicked(LevelPlayAdInfo levelPlayAdInfo);

    void onAdCollapsed(LevelPlayAdInfo levelPlayAdInfo);

    void onAdDisplayFailed(LevelPlayAdInfo levelPlayAdInfo, LevelPlayAdError levelPlayAdError);

    void onAdDisplayed(LevelPlayAdInfo levelPlayAdInfo);

    void onAdExpanded(LevelPlayAdInfo levelPlayAdInfo);

    void onAdLeftApplication(LevelPlayAdInfo levelPlayAdInfo);

    void onAdLoadFailed(LevelPlayAdError levelPlayAdError);

    void onAdLoaded(LevelPlayAdInfo levelPlayAdInfo);
}
