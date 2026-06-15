package com.ironsource;

import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.adunit.adapter.utility.AdInfo;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.model.Placement;
import com.ironsource.mediationsdk.sdk.LevelPlayBannerListener;
import com.ironsource.mediationsdk.sdk.LevelPlayInterstitialListener;
import com.ironsource.mediationsdk.sdk.LevelPlayRewardedVideoBaseListener;
import com.ironsource.mediationsdk.sdk.LevelPlayRewardedVideoListener;
import com.ironsource.mediationsdk.sdk.LevelPlayRewardedVideoManualListener;
import java.util.List;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class mu {

    /* renamed from: a  reason: collision with root package name */
    private final du f19317a;

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    public static final class a implements LevelPlayInterstitialListener {
        a() {
        }

        @Override // com.ironsource.mediationsdk.sdk.LevelPlayInterstitialListener
        public void onAdClicked(AdInfo adInfo) {
            mu.this.a(nu.f19443f, IronSource.AD_UNIT.INTERSTITIAL, qu.f19902a.a(adInfo));
        }

        @Override // com.ironsource.mediationsdk.sdk.LevelPlayInterstitialListener
        public void onAdClosed(AdInfo adInfo) {
            mu.this.a(nu.f19444g, IronSource.AD_UNIT.INTERSTITIAL, qu.f19902a.a(adInfo));
        }

        @Override // com.ironsource.mediationsdk.sdk.LevelPlayInterstitialListener
        public void onAdLoadFailed(IronSourceError ironSourceError) {
            mu muVar = mu.this;
            IronSource.AD_UNIT ad_unit = IronSource.AD_UNIT.INTERSTITIAL;
            qu quVar = qu.f19902a;
            Object[] objArr = new Object[1];
            objArr[0] = ironSourceError != null ? ironSourceError.getErrorMessage() : null;
            muVar.a(nu.f19439b, ad_unit, quVar.a(objArr));
        }

        @Override // com.ironsource.mediationsdk.sdk.LevelPlayInterstitialListener
        public void onAdOpened(AdInfo adInfo) {
            mu.this.a(nu.f19440c, IronSource.AD_UNIT.INTERSTITIAL, qu.f19902a.a(adInfo));
        }

        @Override // com.ironsource.mediationsdk.sdk.LevelPlayInterstitialListener
        public void onAdReady(AdInfo adInfo) {
            mu.this.a(nu.f19438a, IronSource.AD_UNIT.INTERSTITIAL, qu.f19902a.a(adInfo));
        }

        @Override // com.ironsource.mediationsdk.sdk.LevelPlayInterstitialListener
        public void onAdShowFailed(IronSourceError ironSourceError, AdInfo adInfo) {
            mu muVar = mu.this;
            IronSource.AD_UNIT ad_unit = IronSource.AD_UNIT.INTERSTITIAL;
            qu quVar = qu.f19902a;
            Object[] objArr = new Object[2];
            objArr[0] = ironSourceError != null ? ironSourceError.getErrorMessage() : null;
            objArr[1] = adInfo;
            muVar.a(nu.f19442e, ad_unit, quVar.a(objArr));
        }

        @Override // com.ironsource.mediationsdk.sdk.LevelPlayInterstitialListener
        public void onAdShowSucceeded(AdInfo adInfo) {
            mu.this.a(nu.f19441d, IronSource.AD_UNIT.INTERSTITIAL, qu.f19902a.a(adInfo));
        }
    }

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    public static final class b implements LevelPlayRewardedVideoManualListener, LevelPlayRewardedVideoListener {
        b() {
        }

        @Override // com.ironsource.mediationsdk.sdk.LevelPlayRewardedVideoListener
        public void onAdAvailable(AdInfo adInfo) {
            mu.this.a(nu.f19445h, IronSource.AD_UNIT.REWARDED_VIDEO, qu.f19902a.a(adInfo));
        }

        @Override // com.ironsource.mediationsdk.sdk.LevelPlayRewardedVideoBaseListener
        public void onAdClicked(Placement placement, AdInfo adInfo) {
            mu.this.a(nu.f19443f, IronSource.AD_UNIT.REWARDED_VIDEO, qu.f19902a.a(lu.f18358a.a(placement), adInfo));
        }

        @Override // com.ironsource.mediationsdk.sdk.LevelPlayRewardedVideoBaseListener
        public void onAdClosed(AdInfo adInfo) {
            mu.this.a(nu.f19444g, IronSource.AD_UNIT.REWARDED_VIDEO, qu.f19902a.a(adInfo));
        }

        @Override // com.ironsource.mediationsdk.sdk.LevelPlayRewardedVideoManualListener
        public void onAdLoadFailed(IronSourceError ironSourceError) {
            mu muVar = mu.this;
            IronSource.AD_UNIT ad_unit = IronSource.AD_UNIT.REWARDED_VIDEO;
            qu quVar = qu.f19902a;
            Object[] objArr = new Object[1];
            objArr[0] = ironSourceError != null ? ironSourceError.getErrorMessage() : null;
            muVar.a(nu.f19439b, ad_unit, quVar.a(objArr));
        }

        @Override // com.ironsource.mediationsdk.sdk.LevelPlayRewardedVideoBaseListener
        public void onAdOpened(AdInfo adInfo) {
            mu.this.a(nu.f19440c, IronSource.AD_UNIT.REWARDED_VIDEO, qu.f19902a.a(adInfo));
        }

        @Override // com.ironsource.mediationsdk.sdk.LevelPlayRewardedVideoManualListener
        public void onAdReady(AdInfo adInfo) {
            mu.this.a(nu.f19438a, IronSource.AD_UNIT.REWARDED_VIDEO, qu.f19902a.a(adInfo));
        }

        @Override // com.ironsource.mediationsdk.sdk.LevelPlayRewardedVideoBaseListener
        public void onAdRewarded(Placement placement, AdInfo adInfo) {
            mu.this.a(nu.f19446i, IronSource.AD_UNIT.REWARDED_VIDEO, qu.f19902a.a(lu.f18358a.a(placement), adInfo));
        }

        @Override // com.ironsource.mediationsdk.sdk.LevelPlayRewardedVideoBaseListener
        public void onAdShowFailed(IronSourceError ironSourceError, AdInfo adInfo) {
            mu muVar = mu.this;
            IronSource.AD_UNIT ad_unit = IronSource.AD_UNIT.REWARDED_VIDEO;
            qu quVar = qu.f19902a;
            Object[] objArr = new Object[2];
            objArr[0] = ironSourceError != null ? ironSourceError.getErrorMessage() : null;
            objArr[1] = adInfo;
            muVar.a(nu.f19442e, ad_unit, quVar.a(objArr));
        }

        @Override // com.ironsource.mediationsdk.sdk.LevelPlayRewardedVideoListener
        public void onAdUnavailable() {
            mu.this.a(nu.f19451n, IronSource.AD_UNIT.REWARDED_VIDEO, qu.f19902a.a(new Object[0]));
        }
    }

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    public static final class c implements LevelPlayBannerListener {
        c() {
        }

        @Override // com.ironsource.mediationsdk.sdk.LevelPlayBannerListener
        public void onAdClicked(AdInfo adInfo) {
            mu.this.a(nu.f19443f, IronSource.AD_UNIT.BANNER, qu.f19902a.a(adInfo));
        }

        @Override // com.ironsource.mediationsdk.sdk.LevelPlayBannerListener
        public void onAdLeftApplication(AdInfo adInfo) {
            mu.this.a(nu.f19448k, IronSource.AD_UNIT.BANNER, qu.f19902a.a(adInfo));
        }

        @Override // com.ironsource.mediationsdk.sdk.LevelPlayBannerListener
        public void onAdLoadFailed(IronSourceError ironSourceError) {
            mu muVar = mu.this;
            IronSource.AD_UNIT ad_unit = IronSource.AD_UNIT.BANNER;
            qu quVar = qu.f19902a;
            Object[] objArr = new Object[1];
            objArr[0] = ironSourceError != null ? ironSourceError.getErrorMessage() : null;
            muVar.a(nu.f19439b, ad_unit, quVar.a(objArr));
        }

        @Override // com.ironsource.mediationsdk.sdk.LevelPlayBannerListener
        public void onAdLoaded(AdInfo adInfo) {
            mu.this.a(nu.f19447j, IronSource.AD_UNIT.BANNER, qu.f19902a.a(adInfo));
        }

        @Override // com.ironsource.mediationsdk.sdk.LevelPlayBannerListener
        public void onAdScreenDismissed(AdInfo adInfo) {
            mu.this.a(nu.f19450m, IronSource.AD_UNIT.BANNER, qu.f19902a.a(adInfo));
        }

        @Override // com.ironsource.mediationsdk.sdk.LevelPlayBannerListener
        public void onAdScreenPresented(AdInfo adInfo) {
            mu.this.a(nu.f19449l, IronSource.AD_UNIT.BANNER, qu.f19902a.a(adInfo));
        }
    }

    public mu(du javaScriptEvaluator) {
        kotlin.jvm.internal.n.f(javaScriptEvaluator, "javaScriptEvaluator");
        this.f19317a = javaScriptEvaluator;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void a(String str, IronSource.AD_UNIT ad_unit, List<? extends Object> list) {
        this.f19317a.a(str, ad_unit, list);
    }

    private final void b() {
        lu luVar = lu.f18358a;
        luVar.a((LevelPlayInterstitialListener) null);
        luVar.a((LevelPlayRewardedVideoBaseListener) null);
        luVar.a((LevelPlayBannerListener) null);
    }

    private final void c() {
        lu.f18358a.i();
    }

    public final void a() {
        b();
        c();
    }

    public final void d() {
        lu luVar = lu.f18358a;
        luVar.a(new a());
        luVar.a(new b());
        luVar.a(new c());
    }
}
