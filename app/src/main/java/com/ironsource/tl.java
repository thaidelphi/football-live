package com.ironsource;

import com.unity3d.mediation.LevelPlayAdError;
import com.unity3d.mediation.LevelPlayAdInfo;
import com.unity3d.mediation.rewarded.LevelPlayReward;
import com.unity3d.mediation.rewarded.LevelPlayRewardedAdListener;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class tl {

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    public static final class a implements hl {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ LevelPlayRewardedAdListener f20845a;

        a(LevelPlayRewardedAdListener levelPlayRewardedAdListener) {
            this.f20845a = levelPlayRewardedAdListener;
        }

        @Override // com.ironsource.hl
        public void onAdClicked(LevelPlayAdInfo adInfo) {
            kotlin.jvm.internal.n.f(adInfo, "adInfo");
            this.f20845a.onAdClicked(adInfo);
        }

        @Override // com.ironsource.hl
        public void onAdClosed(LevelPlayAdInfo adInfo) {
            kotlin.jvm.internal.n.f(adInfo, "adInfo");
            this.f20845a.onAdClosed(adInfo);
        }

        @Override // com.ironsource.hl
        public void onAdDisplayFailed(LevelPlayAdError error, LevelPlayAdInfo adInfo) {
            kotlin.jvm.internal.n.f(error, "error");
            kotlin.jvm.internal.n.f(adInfo, "adInfo");
            this.f20845a.onAdDisplayFailed(error, adInfo);
        }

        @Override // com.ironsource.hl
        public void onAdDisplayed(LevelPlayAdInfo adInfo) {
            kotlin.jvm.internal.n.f(adInfo, "adInfo");
            this.f20845a.onAdDisplayed(adInfo);
        }

        @Override // com.ironsource.hl
        public void onAdInfoChanged(LevelPlayAdInfo adInfo) {
            kotlin.jvm.internal.n.f(adInfo, "adInfo");
            this.f20845a.onAdInfoChanged(adInfo);
        }

        @Override // com.ironsource.hl
        public void onAdLoadFailed(LevelPlayAdError error) {
            kotlin.jvm.internal.n.f(error, "error");
            this.f20845a.onAdLoadFailed(error);
        }

        @Override // com.ironsource.hl
        public void onAdLoaded(LevelPlayAdInfo adInfo) {
            kotlin.jvm.internal.n.f(adInfo, "adInfo");
            this.f20845a.onAdLoaded(adInfo);
        }

        @Override // com.ironsource.hl
        public void onAdRewarded(LevelPlayReward reward, LevelPlayAdInfo adInfo) {
            kotlin.jvm.internal.n.f(reward, "reward");
            kotlin.jvm.internal.n.f(adInfo, "adInfo");
            this.f20845a.onAdRewarded(reward, adInfo);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final hl b(LevelPlayRewardedAdListener levelPlayRewardedAdListener) {
        return new a(levelPlayRewardedAdListener);
    }
}
