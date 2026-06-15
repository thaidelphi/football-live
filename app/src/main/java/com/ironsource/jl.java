package com.ironsource;

import com.unity3d.mediation.LevelPlayAdError;
import com.unity3d.mediation.LevelPlayAdInfo;
import com.unity3d.mediation.interstitial.LevelPlayInterstitialAdListener;
import com.unity3d.mediation.rewarded.LevelPlayReward;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class jl {

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    public static final class a implements hl {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ LevelPlayInterstitialAdListener f17960a;

        a(LevelPlayInterstitialAdListener levelPlayInterstitialAdListener) {
            this.f17960a = levelPlayInterstitialAdListener;
        }

        @Override // com.ironsource.hl
        public void onAdClicked(LevelPlayAdInfo adInfo) {
            kotlin.jvm.internal.n.f(adInfo, "adInfo");
            this.f17960a.onAdClicked(adInfo);
        }

        @Override // com.ironsource.hl
        public void onAdClosed(LevelPlayAdInfo adInfo) {
            kotlin.jvm.internal.n.f(adInfo, "adInfo");
            this.f17960a.onAdClosed(adInfo);
        }

        @Override // com.ironsource.hl
        public void onAdDisplayFailed(LevelPlayAdError error, LevelPlayAdInfo adInfo) {
            kotlin.jvm.internal.n.f(error, "error");
            kotlin.jvm.internal.n.f(adInfo, "adInfo");
            this.f17960a.onAdDisplayFailed(error, adInfo);
        }

        @Override // com.ironsource.hl
        public void onAdDisplayed(LevelPlayAdInfo adInfo) {
            kotlin.jvm.internal.n.f(adInfo, "adInfo");
            this.f17960a.onAdDisplayed(adInfo);
        }

        @Override // com.ironsource.hl
        public void onAdInfoChanged(LevelPlayAdInfo adInfo) {
            kotlin.jvm.internal.n.f(adInfo, "adInfo");
            this.f17960a.onAdInfoChanged(adInfo);
        }

        @Override // com.ironsource.hl
        public void onAdLoadFailed(LevelPlayAdError error) {
            kotlin.jvm.internal.n.f(error, "error");
            this.f17960a.onAdLoadFailed(error);
        }

        @Override // com.ironsource.hl
        public void onAdLoaded(LevelPlayAdInfo adInfo) {
            kotlin.jvm.internal.n.f(adInfo, "adInfo");
            this.f17960a.onAdLoaded(adInfo);
        }

        @Override // com.ironsource.hl
        public /* synthetic */ void onAdRewarded(LevelPlayReward levelPlayReward, LevelPlayAdInfo levelPlayAdInfo) {
            bz.a(this, levelPlayReward, levelPlayAdInfo);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final hl b(LevelPlayInterstitialAdListener levelPlayInterstitialAdListener) {
        return new a(levelPlayInterstitialAdListener);
    }
}
