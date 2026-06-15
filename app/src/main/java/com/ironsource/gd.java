package com.ironsource;

import com.unity3d.mediation.LevelPlayAdError;
import com.unity3d.mediation.LevelPlayAdInfo;
import com.unity3d.mediation.rewarded.LevelPlayReward;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public interface gd {
    void a();

    void a(LevelPlayAdError levelPlayAdError);

    void a(LevelPlayReward levelPlayReward);

    void b();

    void onAdClicked();

    void onAdClosed();

    void onAdInfoChanged(LevelPlayAdInfo levelPlayAdInfo);

    void onAdLoadFailed(LevelPlayAdError levelPlayAdError);

    void onAdLoaded(LevelPlayAdInfo levelPlayAdInfo);
}
