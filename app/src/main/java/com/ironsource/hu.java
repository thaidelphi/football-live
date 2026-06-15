package com.ironsource;

import android.os.Handler;
import android.widget.FrameLayout;
import com.ironsource.fi;
import com.ironsource.mediationsdk.testSuite.TestSuiteActivity;
import com.ironsource.yt;
import com.unity3d.mediation.banner.LevelPlayBannerAdView;
import com.unity3d.mediation.interstitial.LevelPlayInterstitialAd;
import com.unity3d.mediation.rewarded.LevelPlayRewardedAd;
import java.lang.ref.WeakReference;
import java.util.concurrent.atomic.AtomicReference;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class hu implements yt.c, yt.d, yt.b {

    /* renamed from: a  reason: collision with root package name */
    private final fi.a f17734a;

    /* renamed from: b  reason: collision with root package name */
    private final WeakReference<TestSuiteActivity> f17735b;

    /* renamed from: c  reason: collision with root package name */
    private final Handler f17736c;

    /* renamed from: d  reason: collision with root package name */
    private final AtomicReference<LevelPlayBannerAdView> f17737d;

    /* renamed from: e  reason: collision with root package name */
    private final AtomicReference<LevelPlayInterstitialAd> f17738e;

    /* renamed from: f  reason: collision with root package name */
    private final AtomicReference<LevelPlayRewardedAd> f17739f;

    public hu(TestSuiteActivity activity, Handler handler) {
        kotlin.jvm.internal.n.f(activity, "activity");
        kotlin.jvm.internal.n.f(handler, "handler");
        this.f17734a = mm.f19249r.a().s();
        this.f17735b = new WeakReference<>(activity);
        this.f17736c = handler;
        this.f17737d = new AtomicReference<>();
        this.f17738e = new AtomicReference<>();
        this.f17739f = new AtomicReference<>();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(TestSuiteActivity testSuiteActivity, LevelPlayBannerAdView it) {
        kotlin.jvm.internal.n.f(testSuiteActivity, "$testSuiteActivity");
        kotlin.jvm.internal.n.f(it, "$it");
        testSuiteActivity.getContainer().removeView(it);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(TestSuiteActivity testSuiteActivity, LevelPlayBannerAdView banner, hu this$0, double d10) {
        kotlin.jvm.internal.n.f(testSuiteActivity, "$testSuiteActivity");
        kotlin.jvm.internal.n.f(banner, "$banner");
        kotlin.jvm.internal.n.f(this$0, "this$0");
        testSuiteActivity.getContainer().addView(banner, this$0.b(d10));
    }

    private final FrameLayout.LayoutParams b(double d10) {
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
        layoutParams.topMargin = (int) (lu.f18358a.a() * d10);
        return layoutParams;
    }

    private final TestSuiteActivity f() {
        return this.f17735b.get();
    }

    @Override // com.ironsource.yt.b
    public void a(final double d10) {
        final LevelPlayBannerAdView levelPlayBannerAdView;
        final TestSuiteActivity f10 = f();
        if (f10 == null || (levelPlayBannerAdView = this.f17737d.get()) == null || levelPlayBannerAdView.getParent() != null) {
            return;
        }
        this.f17736c.post(new Runnable() { // from class: com.ironsource.dz
            @Override // java.lang.Runnable
            public final void run() {
                hu.a(TestSuiteActivity.this, levelPlayBannerAdView, this, d10);
            }
        });
    }

    @Override // com.ironsource.yt.c
    public void a(eu loadAdConfig) {
        kotlin.jvm.internal.n.f(loadAdConfig, "loadAdConfig");
        this.f17734a.a(loadAdConfig);
        AtomicReference<LevelPlayInterstitialAd> atomicReference = this.f17738e;
        String a10 = loadAdConfig.a();
        if (a10 == null) {
            a10 = "";
        }
        LevelPlayInterstitialAd levelPlayInterstitialAd = new LevelPlayInterstitialAd(a10);
        levelPlayInterstitialAd.setListener(new ju());
        levelPlayInterstitialAd.loadAd();
        atomicReference.set(levelPlayInterstitialAd);
    }

    @Override // com.ironsource.yt.b
    public void a(eu loadAdConfig, String description, int i10, int i11) {
        kotlin.jvm.internal.n.f(loadAdConfig, "loadAdConfig");
        kotlin.jvm.internal.n.f(description, "description");
        b();
        TestSuiteActivity f10 = f();
        if (f10 != null) {
            this.f17734a.a(loadAdConfig);
            AtomicReference<LevelPlayBannerAdView> atomicReference = this.f17737d;
            String a10 = loadAdConfig.a();
            if (a10 == null) {
                a10 = "";
            }
            LevelPlayBannerAdView levelPlayBannerAdView = new LevelPlayBannerAdView(f10, a10);
            levelPlayBannerAdView.setAdSize(lu.f18358a.b(description, i10, i11));
            levelPlayBannerAdView.setBannerListener(new iu());
            levelPlayBannerAdView.pauseAutoRefresh();
            levelPlayBannerAdView.loadAd();
            atomicReference.set(levelPlayBannerAdView);
        }
    }

    @Override // com.ironsource.yt.d
    public boolean a() {
        LevelPlayRewardedAd levelPlayRewardedAd = this.f17739f.get();
        if (levelPlayRewardedAd != null) {
            return levelPlayRewardedAd.isAdReady();
        }
        return false;
    }

    @Override // com.ironsource.yt.b
    public void b() {
        final LevelPlayBannerAdView andSet;
        final TestSuiteActivity f10 = f();
        if (f10 == null || (andSet = this.f17737d.getAndSet(null)) == null) {
            return;
        }
        andSet.destroy();
        this.f17736c.post(new Runnable() { // from class: com.ironsource.cz
            @Override // java.lang.Runnable
            public final void run() {
                hu.a(TestSuiteActivity.this, andSet);
            }
        });
    }

    @Override // com.ironsource.yt.d
    public void b(eu loadAdConfig) {
        kotlin.jvm.internal.n.f(loadAdConfig, "loadAdConfig");
        this.f17734a.a(loadAdConfig);
        AtomicReference<LevelPlayRewardedAd> atomicReference = this.f17739f;
        String a10 = loadAdConfig.a();
        if (a10 == null) {
            a10 = "";
        }
        LevelPlayRewardedAd levelPlayRewardedAd = new LevelPlayRewardedAd(a10);
        levelPlayRewardedAd.setListener(new ku());
        levelPlayRewardedAd.loadAd();
        atomicReference.set(levelPlayRewardedAd);
    }

    @Override // com.ironsource.yt.c
    public void c() {
        TestSuiteActivity f10 = f();
        if (f10 != null) {
            LevelPlayInterstitialAd levelPlayInterstitialAd = this.f17738e.get();
            kotlin.jvm.internal.n.e(levelPlayInterstitialAd, "interstitialAdRef.get()");
            LevelPlayInterstitialAd.showAd$default(levelPlayInterstitialAd, f10, null, 2, null);
        }
    }

    @Override // com.ironsource.yt.d
    public void d() {
        TestSuiteActivity f10 = f();
        if (f10 != null) {
            LevelPlayRewardedAd levelPlayRewardedAd = this.f17739f.get();
            kotlin.jvm.internal.n.e(levelPlayRewardedAd, "rewardedAdRef.get()");
            LevelPlayRewardedAd.showAd$default(levelPlayRewardedAd, f10, null, 2, null);
        }
    }

    @Override // com.ironsource.yt.c
    public boolean e() {
        LevelPlayInterstitialAd levelPlayInterstitialAd = this.f17738e.get();
        if (levelPlayInterstitialAd != null) {
            return levelPlayInterstitialAd.isAdReady();
        }
        return false;
    }
}
