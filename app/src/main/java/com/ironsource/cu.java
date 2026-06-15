package com.ironsource;

import android.webkit.JavascriptInterface;
import com.ironsource.mediationsdk.IronSource;
import java.util.List;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class cu {

    /* renamed from: a  reason: collision with root package name */
    private final yt f16921a;

    /* renamed from: b  reason: collision with root package name */
    private final du f16922b;

    /* renamed from: c  reason: collision with root package name */
    private final gi f16923c;

    public cu(yt adsManager, gi uiLifeCycleListener, du javaScriptEvaluator) {
        kotlin.jvm.internal.n.f(adsManager, "adsManager");
        kotlin.jvm.internal.n.f(uiLifeCycleListener, "uiLifeCycleListener");
        kotlin.jvm.internal.n.f(javaScriptEvaluator, "javaScriptEvaluator");
        this.f16921a = adsManager;
        this.f16922b = javaScriptEvaluator;
        this.f16923c = uiLifeCycleListener;
    }

    private final void a(String str, IronSource.AD_UNIT ad_unit, List<? extends Object> list) {
        this.f16922b.a(str, ad_unit, list);
    }

    @JavascriptInterface
    public final void addBannerAdToScreen(double d10) {
        this.f16921a.a().a(d10);
    }

    @JavascriptInterface
    public final void closeTestSuite() {
        destroyBannerAd();
        this.f16923c.onClosed();
    }

    @JavascriptInterface
    public final void destroyBannerAd() {
        this.f16921a.a().b();
    }

    @JavascriptInterface
    public final void isInterstitialReady() {
        a("isInterstitialReady", IronSource.AD_UNIT.INTERSTITIAL, qu.f19902a.a(Boolean.valueOf(this.f16921a.b().e())));
    }

    @JavascriptInterface
    public final void isRewardedVideoReady() {
        a("isRewardedVideoReady", IronSource.AD_UNIT.REWARDED_VIDEO, qu.f19902a.a(Boolean.valueOf(this.f16921a.c().a())));
    }

    @JavascriptInterface
    public final void loadBannerAd(String str, String adNetwork, boolean z10, boolean z11, String description, int i10, int i11) {
        kotlin.jvm.internal.n.f(adNetwork, "adNetwork");
        kotlin.jvm.internal.n.f(description, "description");
        this.f16921a.a().a(new eu(adNetwork, z10, Boolean.valueOf(z11), str), description, i10, i11);
    }

    @JavascriptInterface
    public final void loadBannerAd(String adNetwork, boolean z10, boolean z11, String description, int i10, int i11) {
        kotlin.jvm.internal.n.f(adNetwork, "adNetwork");
        kotlin.jvm.internal.n.f(description, "description");
        loadBannerAd(null, adNetwork, z10, z11, description, i10, i11);
    }

    @JavascriptInterface
    public final void loadInterstitialAd(String str, String adNetwork, boolean z10, boolean z11) {
        kotlin.jvm.internal.n.f(adNetwork, "adNetwork");
        this.f16921a.b().a(new eu(adNetwork, z10, Boolean.valueOf(z11), str));
    }

    @JavascriptInterface
    public final void loadInterstitialAd(String adNetwork, boolean z10, boolean z11) {
        kotlin.jvm.internal.n.f(adNetwork, "adNetwork");
        loadInterstitialAd(null, adNetwork, z10, z11);
    }

    @JavascriptInterface
    public final void loadRewardedVideoAd(String str, String adNetwork, boolean z10, boolean z11) {
        kotlin.jvm.internal.n.f(adNetwork, "adNetwork");
        this.f16921a.c().b(new eu(adNetwork, z10, Boolean.valueOf(z11), str));
    }

    @JavascriptInterface
    public final void loadRewardedVideoAd(String adNetwork, boolean z10, boolean z11) {
        kotlin.jvm.internal.n.f(adNetwork, "adNetwork");
        loadRewardedVideoAd(null, adNetwork, z10, z11);
    }

    @JavascriptInterface
    public final void onDataLoaded() {
        this.f16923c.onUIReady();
    }

    @JavascriptInterface
    public final void showInterstitialAd() {
        this.f16921a.b().c();
    }

    @JavascriptInterface
    public final void showRewardedVideoAd() {
        this.f16921a.c().d();
    }
}
