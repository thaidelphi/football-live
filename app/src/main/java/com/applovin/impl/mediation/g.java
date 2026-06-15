package com.applovin.impl.mediation;

import android.app.Activity;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import com.applovin.impl.d3;
import com.applovin.impl.j3;
import com.applovin.impl.j4;
import com.applovin.impl.k6;
import com.applovin.impl.mediation.MediationServiceImpl;
import com.applovin.impl.mediation.g;
import com.applovin.impl.o4;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.u2;
import com.applovin.impl.u4;
import com.applovin.impl.u5;
import com.applovin.impl.w2;
import com.applovin.impl.z4;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.mediation.MaxAdListener;
import com.applovin.mediation.MaxError;
import com.applovin.mediation.MaxReward;
import com.applovin.mediation.adapter.MaxAdViewAdapter;
import com.applovin.mediation.adapter.MaxAdapter;
import com.applovin.mediation.adapter.MaxAdapterError;
import com.applovin.mediation.adapter.MaxAppOpenAdapter;
import com.applovin.mediation.adapter.MaxInterstitialAdViewAdapter;
import com.applovin.mediation.adapter.MaxInterstitialAdapter;
import com.applovin.mediation.adapter.MaxRewardedAdViewAdapter;
import com.applovin.mediation.adapter.MaxRewardedAdapter;
import com.applovin.mediation.adapter.MaxSignalProvider;
import com.applovin.mediation.adapter.listeners.MaxAdViewAdapterListener;
import com.applovin.mediation.adapter.listeners.MaxAppOpenAdapterListener;
import com.applovin.mediation.adapter.listeners.MaxInterstitialAdapterListener;
import com.applovin.mediation.adapter.listeners.MaxNativeAdAdapterListener;
import com.applovin.mediation.adapter.listeners.MaxRewardedAdapterListener;
import com.applovin.mediation.adapter.listeners.MaxSignalCollectionListener;
import com.applovin.mediation.adapter.parameters.MaxAdapterInitializationParameters;
import com.applovin.mediation.adapter.parameters.MaxAdapterResponseParameters;
import com.applovin.mediation.adapter.parameters.MaxAdapterSignalCollectionParameters;
import com.applovin.mediation.adapters.MediationAdapterBase;
import com.applovin.mediation.nativeAds.MaxNativeAd;
import com.applovin.mediation.nativeAds.MaxNativeAdView;
import com.applovin.sdk.AppLovinSdkUtils;
import com.unity3d.services.ads.gmascar.bridges.mobileads.MobileAdsBridgeBase;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicBoolean;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class g {

    /* renamed from: b  reason: collision with root package name */
    private final com.applovin.impl.sdk.j f7832b;

    /* renamed from: c  reason: collision with root package name */
    private final com.applovin.impl.sdk.n f7833c;

    /* renamed from: d  reason: collision with root package name */
    private final String f7834d;

    /* renamed from: e  reason: collision with root package name */
    private final d3 f7835e;

    /* renamed from: f  reason: collision with root package name */
    private final String f7836f;

    /* renamed from: g  reason: collision with root package name */
    private MaxAdapter f7837g;

    /* renamed from: h  reason: collision with root package name */
    private String f7838h;

    /* renamed from: i  reason: collision with root package name */
    private u2 f7839i;

    /* renamed from: j  reason: collision with root package name */
    private View f7840j;

    /* renamed from: k  reason: collision with root package name */
    private MaxNativeAd f7841k;

    /* renamed from: l  reason: collision with root package name */
    private MaxNativeAdView f7842l;

    /* renamed from: m  reason: collision with root package name */
    private ViewGroup f7843m;

    /* renamed from: o  reason: collision with root package name */
    private MaxAdapterResponseParameters f7845o;

    /* renamed from: s  reason: collision with root package name */
    private final boolean f7849s;

    /* renamed from: a  reason: collision with root package name */
    private final Handler f7831a = new Handler(Looper.getMainLooper());

    /* renamed from: n  reason: collision with root package name */
    private final b f7844n = new b(this, null);

    /* renamed from: p  reason: collision with root package name */
    private final AtomicBoolean f7846p = new AtomicBoolean(true);

    /* renamed from: q  reason: collision with root package name */
    private final AtomicBoolean f7847q = new AtomicBoolean(false);

    /* renamed from: r  reason: collision with root package name */
    private final AtomicBoolean f7848r = new AtomicBoolean(false);

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public class a implements MaxSignalCollectionListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ u4 f7850a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ j4 f7851b;

        a(u4 u4Var, j4 j4Var) {
            this.f7850a = u4Var;
            this.f7851b = j4Var;
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxSignalCollectionListener
        public void onSignalCollected(String str) {
            if (this.f7850a.x() && TextUtils.isEmpty(str)) {
                this.f7851b.a(new MaxErrorImpl("Signal is not a valid string"));
            } else {
                this.f7851b.b(str);
            }
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxSignalCollectionListener
        public void onSignalCollectionFailed(String str) {
            this.f7851b.a(new MaxErrorImpl(str));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public class b implements MaxInterstitialAdapterListener, MaxAppOpenAdapterListener, MaxRewardedAdapterListener, MaxAdViewAdapterListener, MaxNativeAdAdapterListener {

        /* renamed from: a  reason: collision with root package name */
        private MediationServiceImpl.b f7853a;

        private b() {
        }

        private void b(String str, final Bundle bundle) {
            if (g.this.f7839i.w().compareAndSet(false, true)) {
                a(str, this.f7853a, new Runnable() { // from class: com.applovin.impl.mediation.z0
                    @Override // java.lang.Runnable
                    public final void run() {
                        g.b.this.i(bundle);
                    }
                });
            }
        }

        private void c(String str, final Bundle bundle) {
            if (g.this.f7839i.w().get()) {
                com.applovin.impl.sdk.n unused = g.this.f7833c;
                if (com.applovin.impl.sdk.n.a()) {
                    com.applovin.impl.sdk.n nVar = g.this.f7833c;
                    nVar.b("MediationAdapterWrapper", g.this.f7836f + ": blocking ad loaded callback for " + g.this.f7839i + " since onAdHidden() has been called");
                }
                g.this.f7832b.q().a(g.this.f7839i, str);
                return;
            }
            g.this.f7848r.set(true);
            a(str, this.f7853a, new Runnable() { // from class: com.applovin.impl.mediation.y0
                @Override // java.lang.Runnable
                public final void run() {
                    g.b.this.j(bundle);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void d(Bundle bundle) {
            this.f7853a.a(g.this.f7839i, bundle);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void e(Bundle bundle) {
            this.f7853a.a(g.this.f7839i, bundle);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void f(Bundle bundle) {
            this.f7853a.a(g.this.f7839i, bundle);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void g(Bundle bundle) {
            this.f7853a.c(g.this.f7839i, bundle);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void h(Bundle bundle) {
            this.f7853a.c(g.this.f7839i, bundle);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void i(Bundle bundle) {
            this.f7853a.e(g.this.f7839i, bundle);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void j(Bundle bundle) {
            if (g.this.f7847q.compareAndSet(false, true)) {
                this.f7853a.f(g.this.f7839i, bundle);
            }
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxAdViewAdapterListener
        public void onAdViewAdClicked() {
            onAdViewAdClicked(null);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxAdViewAdapterListener
        public void onAdViewAdCollapsed() {
            onAdViewAdCollapsed(null);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxAdViewAdapterListener
        public void onAdViewAdDisplayFailed(MaxAdapterError maxAdapterError) {
            onAdViewAdDisplayFailed(maxAdapterError, null);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxAdViewAdapterListener
        public void onAdViewAdDisplayed() {
            onAdViewAdDisplayed(null);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxAdViewAdapterListener
        public void onAdViewAdExpanded() {
            onAdViewAdExpanded(null);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxAdViewAdapterListener
        public void onAdViewAdHidden() {
            onAdViewAdHidden(null);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxAdViewAdapterListener
        public void onAdViewAdLoadFailed(MaxAdapterError maxAdapterError) {
            com.applovin.impl.sdk.n unused = g.this.f7833c;
            if (com.applovin.impl.sdk.n.a()) {
                com.applovin.impl.sdk.n nVar = g.this.f7833c;
                nVar.k("MediationAdapterWrapper", g.this.f7836f + ": adview ad ad failed to load with error: " + maxAdapterError);
            }
            a("onAdViewAdLoadFailed", maxAdapterError);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxAdViewAdapterListener
        public void onAdViewAdLoaded(View view) {
            onAdViewAdLoaded(view, null);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxAppOpenAdapterListener
        public void onAppOpenAdClicked() {
            onAppOpenAdClicked(null);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxAppOpenAdapterListener
        public void onAppOpenAdDisplayFailed(MaxAdapterError maxAdapterError) {
            onAppOpenAdDisplayFailed(maxAdapterError, null);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxAppOpenAdapterListener
        public void onAppOpenAdDisplayed() {
            onAppOpenAdDisplayed(null);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxAppOpenAdapterListener
        public void onAppOpenAdHidden() {
            onAppOpenAdHidden(null);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxAppOpenAdapterListener
        public void onAppOpenAdLoadFailed(MaxAdapterError maxAdapterError) {
            com.applovin.impl.sdk.n unused = g.this.f7833c;
            if (com.applovin.impl.sdk.n.a()) {
                com.applovin.impl.sdk.n nVar = g.this.f7833c;
                nVar.k("MediationAdapterWrapper", g.this.f7836f + ": app open ad failed to load with error: " + maxAdapterError);
            }
            a("onAppOpenAdLoadFailed", maxAdapterError);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxAppOpenAdapterListener
        public void onAppOpenAdLoaded() {
            onAppOpenAdLoaded(null);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxInterstitialAdapterListener
        public void onInterstitialAdClicked() {
            onInterstitialAdClicked(null);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxInterstitialAdapterListener
        public void onInterstitialAdDisplayFailed(MaxAdapterError maxAdapterError) {
            onInterstitialAdDisplayFailed(maxAdapterError, null);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxInterstitialAdapterListener
        public void onInterstitialAdDisplayed() {
            onInterstitialAdDisplayed(null);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxInterstitialAdapterListener
        public void onInterstitialAdHidden() {
            onInterstitialAdHidden(null);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxInterstitialAdapterListener
        public void onInterstitialAdLoadFailed(MaxAdapterError maxAdapterError) {
            com.applovin.impl.sdk.n unused = g.this.f7833c;
            if (com.applovin.impl.sdk.n.a()) {
                com.applovin.impl.sdk.n nVar = g.this.f7833c;
                nVar.k("MediationAdapterWrapper", g.this.f7836f + ": interstitial ad failed to load with error " + maxAdapterError);
            }
            a("onInterstitialAdLoadFailed", maxAdapterError);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxInterstitialAdapterListener
        public void onInterstitialAdLoaded() {
            onInterstitialAdLoaded(null);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxNativeAdAdapterListener
        public void onNativeAdClicked() {
            onNativeAdClicked(null);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxNativeAdAdapterListener
        public void onNativeAdDisplayed(Bundle bundle) {
            if (g.this.f7839i.Z()) {
                return;
            }
            com.applovin.impl.sdk.n unused = g.this.f7833c;
            if (com.applovin.impl.sdk.n.a()) {
                com.applovin.impl.sdk.n nVar = g.this.f7833c;
                nVar.d("MediationAdapterWrapper", g.this.f7836f + ": native ad displayed with extra info: " + bundle);
            }
            a("onNativeAdDisplayed", bundle);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxNativeAdAdapterListener
        public void onNativeAdLoadFailed(MaxAdapterError maxAdapterError) {
            com.applovin.impl.sdk.n unused = g.this.f7833c;
            if (com.applovin.impl.sdk.n.a()) {
                com.applovin.impl.sdk.n nVar = g.this.f7833c;
                nVar.k("MediationAdapterWrapper", g.this.f7836f + ": native ad ad failed to load with error: " + maxAdapterError);
            }
            a("onNativeAdLoadFailed", maxAdapterError);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxNativeAdAdapterListener
        public void onNativeAdLoaded(MaxNativeAd maxNativeAd, Bundle bundle) {
            com.applovin.impl.sdk.n unused = g.this.f7833c;
            if (com.applovin.impl.sdk.n.a()) {
                com.applovin.impl.sdk.n nVar = g.this.f7833c;
                nVar.d("MediationAdapterWrapper", g.this.f7836f + ": native ad loaded with extra info: " + bundle);
            }
            g.this.f7841k = maxNativeAd;
            c("onNativeAdLoaded", bundle);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxRewardedAdapterListener
        public void onRewardedAdClicked() {
            onRewardedAdClicked(null);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxRewardedAdapterListener
        public void onRewardedAdDisplayFailed(MaxAdapterError maxAdapterError) {
            onRewardedAdDisplayFailed(maxAdapterError, null);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxRewardedAdapterListener
        public void onRewardedAdDisplayed() {
            onRewardedAdDisplayed(null);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxRewardedAdapterListener
        public void onRewardedAdHidden() {
            onRewardedAdHidden(null);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxRewardedAdapterListener
        public void onRewardedAdLoadFailed(MaxAdapterError maxAdapterError) {
            com.applovin.impl.sdk.n unused = g.this.f7833c;
            if (com.applovin.impl.sdk.n.a()) {
                com.applovin.impl.sdk.n nVar = g.this.f7833c;
                nVar.k("MediationAdapterWrapper", g.this.f7836f + ": rewarded ad failed to load with error: " + maxAdapterError);
            }
            a("onRewardedAdLoadFailed", maxAdapterError);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxRewardedAdapterListener
        public void onRewardedAdLoaded() {
            onRewardedAdLoaded(null);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxRewardedAdapterListener
        public void onUserRewarded(MaxReward maxReward) {
            onUserRewarded(maxReward, null);
        }

        /* synthetic */ b(g gVar, a aVar) {
            this();
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxAdViewAdapterListener
        public void onAdViewAdClicked(final Bundle bundle) {
            com.applovin.impl.sdk.n unused = g.this.f7833c;
            if (com.applovin.impl.sdk.n.a()) {
                com.applovin.impl.sdk.n nVar = g.this.f7833c;
                nVar.d("MediationAdapterWrapper", g.this.f7836f + ": adview ad clicked with extra info: " + bundle);
            }
            a("onAdViewAdClicked", this.f7853a, new Runnable() { // from class: com.applovin.impl.mediation.s0
                @Override // java.lang.Runnable
                public final void run() {
                    g.b.this.a(bundle);
                }
            });
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxAdViewAdapterListener
        public void onAdViewAdCollapsed(Bundle bundle) {
            com.applovin.impl.sdk.n unused = g.this.f7833c;
            if (com.applovin.impl.sdk.n.a()) {
                com.applovin.impl.sdk.n nVar = g.this.f7833c;
                nVar.d("MediationAdapterWrapper", g.this.f7836f + ": adview ad collapsed");
            }
            a("onAdViewAdCollapsed", this.f7853a, new Runnable() { // from class: com.applovin.impl.mediation.l0
                @Override // java.lang.Runnable
                public final void run() {
                    g.b.this.a();
                }
            });
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxAdViewAdapterListener
        public void onAdViewAdDisplayFailed(MaxAdapterError maxAdapterError, Bundle bundle) {
            com.applovin.impl.sdk.n unused = g.this.f7833c;
            if (com.applovin.impl.sdk.n.a()) {
                com.applovin.impl.sdk.n nVar = g.this.f7833c;
                nVar.k("MediationAdapterWrapper", g.this.f7836f + ": adview ad failed to display with error: " + maxAdapterError);
            }
            a("onAdViewAdDisplayFailed", maxAdapterError, bundle);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxAdViewAdapterListener
        public void onAdViewAdDisplayed(Bundle bundle) {
            if (g.this.f7839i.Z()) {
                return;
            }
            com.applovin.impl.sdk.n unused = g.this.f7833c;
            if (com.applovin.impl.sdk.n.a()) {
                com.applovin.impl.sdk.n nVar = g.this.f7833c;
                nVar.d("MediationAdapterWrapper", g.this.f7836f + ": adview ad displayed with extra info: " + bundle);
            }
            a("onAdViewAdDisplayed", bundle);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxAdViewAdapterListener
        public void onAdViewAdExpanded(final Bundle bundle) {
            com.applovin.impl.sdk.n unused = g.this.f7833c;
            if (com.applovin.impl.sdk.n.a()) {
                com.applovin.impl.sdk.n nVar = g.this.f7833c;
                nVar.d("MediationAdapterWrapper", g.this.f7836f + ": adview ad expanded");
            }
            a("onAdViewAdExpanded", this.f7853a, new Runnable() { // from class: com.applovin.impl.mediation.x0
                @Override // java.lang.Runnable
                public final void run() {
                    g.b.this.b(bundle);
                }
            });
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxAdViewAdapterListener
        public void onAdViewAdHidden(Bundle bundle) {
            com.applovin.impl.sdk.n unused = g.this.f7833c;
            if (com.applovin.impl.sdk.n.a()) {
                com.applovin.impl.sdk.n nVar = g.this.f7833c;
                nVar.d("MediationAdapterWrapper", g.this.f7836f + ": adview ad hidden with extra info: " + bundle);
            }
            b("onAdViewAdHidden", bundle);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxAdViewAdapterListener
        public void onAdViewAdLoaded(View view, Bundle bundle) {
            com.applovin.impl.sdk.n unused = g.this.f7833c;
            if (com.applovin.impl.sdk.n.a()) {
                com.applovin.impl.sdk.n nVar = g.this.f7833c;
                nVar.d("MediationAdapterWrapper", g.this.f7836f + ": adview ad loaded with extra info: " + bundle);
            }
            g.this.f7840j = view;
            c("onAdViewAdLoaded", bundle);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxAppOpenAdapterListener
        public void onAppOpenAdClicked(final Bundle bundle) {
            com.applovin.impl.sdk.n unused = g.this.f7833c;
            if (com.applovin.impl.sdk.n.a()) {
                com.applovin.impl.sdk.n nVar = g.this.f7833c;
                nVar.d("MediationAdapterWrapper", g.this.f7836f + ": app open ad clicked with extra info: " + bundle);
            }
            a("onAppOpenAdClicked", this.f7853a, new Runnable() { // from class: com.applovin.impl.mediation.u0
                @Override // java.lang.Runnable
                public final void run() {
                    g.b.this.c(bundle);
                }
            });
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxAppOpenAdapterListener
        public void onAppOpenAdDisplayFailed(MaxAdapterError maxAdapterError, Bundle bundle) {
            com.applovin.impl.sdk.n unused = g.this.f7833c;
            if (com.applovin.impl.sdk.n.a()) {
                com.applovin.impl.sdk.n nVar = g.this.f7833c;
                nVar.k("MediationAdapterWrapper", g.this.f7836f + ": app open ad display failed with error: " + maxAdapterError);
            }
            a("onAppOpenAdDisplayFailed", maxAdapterError, bundle);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxAppOpenAdapterListener
        public void onAppOpenAdDisplayed(Bundle bundle) {
            com.applovin.impl.sdk.n unused = g.this.f7833c;
            if (com.applovin.impl.sdk.n.a()) {
                com.applovin.impl.sdk.n nVar = g.this.f7833c;
                nVar.d("MediationAdapterWrapper", g.this.f7836f + ": app open ad displayed with extra info: " + bundle);
            }
            a("onAppOpenAdDisplayed", bundle);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxAppOpenAdapterListener
        public void onAppOpenAdHidden(Bundle bundle) {
            com.applovin.impl.sdk.n unused = g.this.f7833c;
            if (com.applovin.impl.sdk.n.a()) {
                com.applovin.impl.sdk.n nVar = g.this.f7833c;
                nVar.d("MediationAdapterWrapper", g.this.f7836f + ": app open ad hidden with extra info: " + bundle);
            }
            b("onAppOpenAdHidden", bundle);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxAppOpenAdapterListener
        public void onAppOpenAdLoaded(Bundle bundle) {
            com.applovin.impl.sdk.n unused = g.this.f7833c;
            if (com.applovin.impl.sdk.n.a()) {
                com.applovin.impl.sdk.n nVar = g.this.f7833c;
                nVar.d("MediationAdapterWrapper", g.this.f7836f + ": app open ad loaded with extra info: " + bundle);
            }
            c("onAppOpenAdLoaded", bundle);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxInterstitialAdapterListener
        public void onInterstitialAdClicked(final Bundle bundle) {
            com.applovin.impl.sdk.n unused = g.this.f7833c;
            if (com.applovin.impl.sdk.n.a()) {
                com.applovin.impl.sdk.n nVar = g.this.f7833c;
                nVar.d("MediationAdapterWrapper", g.this.f7836f + ": interstitial ad clicked with extra info: " + bundle);
            }
            a("onInterstitialAdClicked", this.f7853a, new Runnable() { // from class: com.applovin.impl.mediation.r0
                @Override // java.lang.Runnable
                public final void run() {
                    g.b.this.d(bundle);
                }
            });
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxInterstitialAdapterListener
        public void onInterstitialAdDisplayFailed(MaxAdapterError maxAdapterError, Bundle bundle) {
            com.applovin.impl.sdk.n unused = g.this.f7833c;
            if (com.applovin.impl.sdk.n.a()) {
                com.applovin.impl.sdk.n nVar = g.this.f7833c;
                nVar.k("MediationAdapterWrapper", g.this.f7836f + ": interstitial ad failed to display with error " + maxAdapterError);
            }
            a("onInterstitialAdDisplayFailed", maxAdapterError, bundle);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxInterstitialAdapterListener
        public void onInterstitialAdDisplayed(Bundle bundle) {
            com.applovin.impl.sdk.n unused = g.this.f7833c;
            if (com.applovin.impl.sdk.n.a()) {
                com.applovin.impl.sdk.n nVar = g.this.f7833c;
                nVar.d("MediationAdapterWrapper", g.this.f7836f + ": interstitial ad displayed with extra info: " + bundle);
            }
            a("onInterstitialAdDisplayed", bundle);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxInterstitialAdapterListener
        public void onInterstitialAdHidden(Bundle bundle) {
            com.applovin.impl.sdk.n unused = g.this.f7833c;
            if (com.applovin.impl.sdk.n.a()) {
                com.applovin.impl.sdk.n nVar = g.this.f7833c;
                nVar.d("MediationAdapterWrapper", g.this.f7836f + ": interstitial ad hidden with extra info " + bundle);
            }
            b("onInterstitialAdHidden", bundle);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxInterstitialAdapterListener
        public void onInterstitialAdLoaded(Bundle bundle) {
            com.applovin.impl.sdk.n unused = g.this.f7833c;
            if (com.applovin.impl.sdk.n.a()) {
                com.applovin.impl.sdk.n nVar = g.this.f7833c;
                nVar.d("MediationAdapterWrapper", g.this.f7836f + ": interstitial ad loaded with extra info: " + bundle);
            }
            c("onInterstitialAdLoaded", bundle);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxNativeAdAdapterListener
        public void onNativeAdClicked(final Bundle bundle) {
            com.applovin.impl.sdk.n unused = g.this.f7833c;
            if (com.applovin.impl.sdk.n.a()) {
                com.applovin.impl.sdk.n nVar = g.this.f7833c;
                nVar.d("MediationAdapterWrapper", g.this.f7836f + ": native ad clicked");
            }
            a("onNativeAdClicked", this.f7853a, new Runnable() { // from class: com.applovin.impl.mediation.v0
                @Override // java.lang.Runnable
                public final void run() {
                    g.b.this.e(bundle);
                }
            });
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxRewardedAdapterListener
        public void onRewardedAdClicked(final Bundle bundle) {
            com.applovin.impl.sdk.n unused = g.this.f7833c;
            if (com.applovin.impl.sdk.n.a()) {
                com.applovin.impl.sdk.n nVar = g.this.f7833c;
                nVar.d("MediationAdapterWrapper", g.this.f7836f + ": rewarded ad clicked with extra info: " + bundle);
            }
            a("onRewardedAdClicked", this.f7853a, new Runnable() { // from class: com.applovin.impl.mediation.t0
                @Override // java.lang.Runnable
                public final void run() {
                    g.b.this.f(bundle);
                }
            });
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxRewardedAdapterListener
        public void onRewardedAdDisplayFailed(MaxAdapterError maxAdapterError, Bundle bundle) {
            com.applovin.impl.sdk.n unused = g.this.f7833c;
            if (com.applovin.impl.sdk.n.a()) {
                com.applovin.impl.sdk.n nVar = g.this.f7833c;
                nVar.k("MediationAdapterWrapper", g.this.f7836f + ": rewarded ad display failed with error: " + maxAdapterError);
            }
            a("onRewardedAdDisplayFailed", maxAdapterError, bundle);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxRewardedAdapterListener
        public void onRewardedAdDisplayed(Bundle bundle) {
            com.applovin.impl.sdk.n unused = g.this.f7833c;
            if (com.applovin.impl.sdk.n.a()) {
                com.applovin.impl.sdk.n nVar = g.this.f7833c;
                nVar.d("MediationAdapterWrapper", g.this.f7836f + ": rewarded ad displayed with extra info: " + bundle);
            }
            a("onRewardedAdDisplayed", bundle);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxRewardedAdapterListener
        public void onRewardedAdHidden(Bundle bundle) {
            com.applovin.impl.sdk.n unused = g.this.f7833c;
            if (com.applovin.impl.sdk.n.a()) {
                com.applovin.impl.sdk.n nVar = g.this.f7833c;
                nVar.d("MediationAdapterWrapper", g.this.f7836f + ": rewarded ad hidden with extra info: " + bundle);
            }
            b("onRewardedAdHidden", bundle);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxRewardedAdapterListener
        public void onRewardedAdLoaded(Bundle bundle) {
            com.applovin.impl.sdk.n unused = g.this.f7833c;
            if (com.applovin.impl.sdk.n.a()) {
                com.applovin.impl.sdk.n nVar = g.this.f7833c;
                nVar.d("MediationAdapterWrapper", g.this.f7836f + ": rewarded ad loaded with extra info: " + bundle);
            }
            c("onRewardedAdLoaded", bundle);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxRewardedAdapterListener
        public void onUserRewarded(final MaxReward maxReward, final Bundle bundle) {
            if (g.this.f7839i instanceof w2) {
                final w2 w2Var = (w2) g.this.f7839i;
                if (w2Var.t0().compareAndSet(false, true)) {
                    com.applovin.impl.sdk.n unused = g.this.f7833c;
                    if (com.applovin.impl.sdk.n.a()) {
                        com.applovin.impl.sdk.n nVar = g.this.f7833c;
                        nVar.d("MediationAdapterWrapper", g.this.f7836f + ": user was rewarded: " + maxReward);
                    }
                    a("onUserRewarded", this.f7853a, new Runnable() { // from class: com.applovin.impl.mediation.n0
                        @Override // java.lang.Runnable
                        public final void run() {
                            g.b.this.a(w2Var, maxReward, bundle);
                        }
                    });
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void b(Bundle bundle) {
            this.f7853a.d(g.this.f7839i, bundle);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void a(MediationServiceImpl.b bVar) {
            if (bVar != null) {
                this.f7853a = bVar;
                return;
            }
            throw new IllegalArgumentException("No listener specified");
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void c(Bundle bundle) {
            this.f7853a.a(g.this.f7839i, bundle);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void a(String str, final MaxError maxError) {
            if (g.this.f7839i.w().get()) {
                com.applovin.impl.sdk.n unused = g.this.f7833c;
                if (com.applovin.impl.sdk.n.a()) {
                    com.applovin.impl.sdk.n nVar = g.this.f7833c;
                    nVar.b("MediationAdapterWrapper", g.this.f7836f + ": blocking ad load failed callback for " + g.this.f7839i + " since onAdHidden() has been called");
                }
                g.this.f7832b.q().a(g.this.f7839i, str);
                return;
            }
            a(str, this.f7853a, new Runnable() { // from class: com.applovin.impl.mediation.o0
                @Override // java.lang.Runnable
                public final void run() {
                    g.b.this.a(maxError);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void a(MaxError maxError) {
            if (g.this.f7847q.compareAndSet(false, true)) {
                this.f7853a.onAdLoadFailed(g.this.f7838h, maxError);
            }
        }

        private void a(String str, final Bundle bundle) {
            if (g.this.f7839i.w().get()) {
                com.applovin.impl.sdk.n unused = g.this.f7833c;
                if (com.applovin.impl.sdk.n.a()) {
                    com.applovin.impl.sdk.n nVar = g.this.f7833c;
                    nVar.b("MediationAdapterWrapper", g.this.f7836f + ": blocking ad displayed callback for " + g.this.f7839i + " since onAdHidden() has been called");
                }
                g.this.f7832b.q().a(g.this.f7839i, str);
            } else if (!((Boolean) g.this.f7832b.a(j3.H7)).booleanValue()) {
                if (g.this.f7839i.u().compareAndSet(false, true)) {
                    a(str, this.f7853a, new Runnable() { // from class: com.applovin.impl.mediation.m0
                        @Override // java.lang.Runnable
                        public final void run() {
                            g.b.this.h(bundle);
                        }
                    });
                }
            } else {
                a(str, this.f7853a, new Runnable() { // from class: com.applovin.impl.mediation.w0
                    @Override // java.lang.Runnable
                    public final void run() {
                        g.b.this.g(bundle);
                    }
                });
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void a(String str, final MaxError maxError, final Bundle bundle) {
            if (g.this.f7839i.w().get()) {
                com.applovin.impl.sdk.n unused = g.this.f7833c;
                if (com.applovin.impl.sdk.n.a()) {
                    com.applovin.impl.sdk.n nVar = g.this.f7833c;
                    nVar.b("MediationAdapterWrapper", g.this.f7836f + ": blocking ad display failed callback for " + g.this.f7839i + " since onAdHidden() has been called");
                }
                g.this.f7832b.q().a(g.this.f7839i, str);
                return;
            }
            a(str, this.f7853a, new Runnable() { // from class: com.applovin.impl.mediation.p0
                @Override // java.lang.Runnable
                public final void run() {
                    g.b.this.a(maxError, bundle);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void a(MaxError maxError, Bundle bundle) {
            this.f7853a.a(g.this.f7839i, maxError, bundle);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void a(w2 w2Var, MaxReward maxReward, Bundle bundle) {
            this.f7853a.a(w2Var, maxReward, bundle);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void a(Bundle bundle) {
            this.f7853a.a(g.this.f7839i, bundle);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void a() {
            this.f7853a.onAdCollapsed(g.this.f7839i);
        }

        private void a(final String str, final MaxAdListener maxAdListener, final Runnable runnable) {
            g.this.f7831a.post(new Runnable() { // from class: com.applovin.impl.mediation.q0
                @Override // java.lang.Runnable
                public final void run() {
                    g.b.this.a(runnable, maxAdListener, str);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void a(Runnable runnable, MaxAdListener maxAdListener, String str) {
            try {
                runnable.run();
            } catch (Throwable th) {
                String name = maxAdListener != null ? maxAdListener.getClass().getName() : null;
                com.applovin.impl.sdk.n.c("MediationAdapterWrapper", "Failed to forward call (" + str + ") to " + name, th);
                g.this.f7832b.D().a("MediationAdapterWrapper", str, th, CollectionUtils.hashMap("adapter_class", g.this.f7835e.b()));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public static class c implements MaxAdapter.OnCompletionListener {

        /* renamed from: a  reason: collision with root package name */
        private final com.applovin.impl.sdk.j f7855a;

        /* renamed from: b  reason: collision with root package name */
        private final d3 f7856b;

        /* renamed from: c  reason: collision with root package name */
        private final long f7857c;

        /* renamed from: d  reason: collision with root package name */
        private final MaxAdapter.OnCompletionListener f7858d;

        public c(com.applovin.impl.sdk.j jVar, d3 d3Var, long j10, MaxAdapter.OnCompletionListener onCompletionListener) {
            this.f7855a = jVar;
            this.f7856b = d3Var;
            this.f7857c = j10;
            this.f7858d = onCompletionListener;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void a(MaxAdapter.InitializationStatus initializationStatus, String str) {
            this.f7855a.K().a(this.f7856b, SystemClock.elapsedRealtime() - this.f7857c, initializationStatus, str);
            MaxAdapter.OnCompletionListener onCompletionListener = this.f7858d;
            if (onCompletionListener != null) {
                onCompletionListener.onCompletion(initializationStatus, str);
            }
        }

        @Override // com.applovin.mediation.adapter.MaxAdapter.OnCompletionListener
        public void onCompletion(final MaxAdapter.InitializationStatus initializationStatus, final String str) {
            AppLovinSdkUtils.runOnUiThreadDelayed(new Runnable() { // from class: com.applovin.impl.mediation.a1
                @Override // java.lang.Runnable
                public final void run() {
                    g.c.this.a(initializationStatus, str);
                }
            }, this.f7856b.h());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public class d extends z4 {

        /* renamed from: g  reason: collision with root package name */
        private final WeakReference f7859g;

        /* synthetic */ d(g gVar, a aVar) {
            this();
        }

        private void b(u2 u2Var) {
            if (u2Var != null) {
                this.f9827a.R().a(u2Var);
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            if (g.this.f7847q.get()) {
                return;
            }
            if (g.this.f7839i.a0()) {
                if (com.applovin.impl.sdk.n.a()) {
                    com.applovin.impl.sdk.n nVar = this.f9829c;
                    String str = this.f9828b;
                    nVar.a(str, g.this.f7836f + " is timing out, considering JS Tag ad loaded: " + g.this.f7839i);
                }
                b(g.this.f7839i);
                return;
            }
            if (com.applovin.impl.sdk.n.a()) {
                com.applovin.impl.sdk.n nVar2 = this.f9829c;
                String str2 = this.f9828b;
                nVar2.b(str2, g.this.f7836f + " is timing out " + g.this.f7839i + "...");
            }
            b(g.this.f7839i);
            MaxErrorImpl maxErrorImpl = new MaxErrorImpl(-5101, "Adapter timed out");
            b bVar = (b) this.f7859g.get();
            if (bVar != null) {
                bVar.a(this.f9828b, maxErrorImpl);
            }
        }

        private d() {
            super("TaskTimeoutMediatedAd", g.this.f7832b);
            this.f7859g = new WeakReference(g.this.f7844n);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public g(d3 d3Var, MaxAdapter maxAdapter, boolean z10, com.applovin.impl.sdk.j jVar) {
        if (d3Var == null) {
            throw new IllegalArgumentException("No adapter name specified");
        }
        if (maxAdapter == null) {
            throw new IllegalArgumentException("No adapter specified");
        }
        if (jVar != null) {
            this.f7834d = d3Var.c();
            this.f7837g = maxAdapter;
            this.f7832b = jVar;
            this.f7833c = jVar.I();
            this.f7835e = d3Var;
            this.f7836f = maxAdapter.getClass().getSimpleName();
            this.f7849s = z10;
            return;
        }
        throw new IllegalArgumentException("No sdk specified");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void l() {
        a("destroy");
        MaxAdapter maxAdapter = this.f7837g;
        if (maxAdapter != null) {
            this.f7837g = null;
            maxAdapter.onDestroy();
        } else if (com.applovin.impl.sdk.n.a()) {
            com.applovin.impl.sdk.n nVar = this.f7833c;
            nVar.k("MediationAdapterWrapper", "Mediation adapter '" + this.f7836f + "' is already destroyed");
        }
        this.f7840j = null;
        this.f7841k = null;
        this.f7842l = null;
        this.f7843m = null;
    }

    public boolean k() {
        return this.f7846p.get();
    }

    public String toString() {
        return "MediationAdapterWrapper{adapterTag='" + this.f7836f + "'}";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b(MaxAdapterResponseParameters maxAdapterResponseParameters, Activity activity) {
        ((MaxAppOpenAdapter) this.f7837g).loadAppOpenAd(maxAdapterResponseParameters, activity, this.f7844n);
    }

    public MediationServiceImpl.b c() {
        return this.f7844n.f7853a;
    }

    public View d() {
        return this.f7840j;
    }

    public MaxNativeAd e() {
        return this.f7841k;
    }

    public MaxNativeAdView f() {
        return this.f7842l;
    }

    public String g() {
        return this.f7834d;
    }

    public ViewGroup h() {
        return this.f7843m;
    }

    public String i() {
        MaxAdapter maxAdapter = this.f7837g;
        if (maxAdapter != null) {
            try {
                return maxAdapter.getSdkVersion();
            } catch (Throwable th) {
                com.applovin.impl.sdk.n.c("MediationAdapterWrapper", "Failed to get adapter's SDK version for " + this.f7834d, th);
                this.f7832b.D().a("MediationAdapterWrapper", "sdk_version", th, CollectionUtils.hashMap("adapter_class", this.f7835e.b()));
                a("sdk_version");
                this.f7832b.L().a(this.f7835e.b(), "sdk_version", this.f7839i);
                return null;
            }
        }
        return null;
    }

    public boolean j() {
        return this.f7847q.get() && this.f7848r.get();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void c(MaxAdapterResponseParameters maxAdapterResponseParameters, Activity activity) {
        ((MaxRewardedAdapter) this.f7837g).loadRewardedAd(maxAdapterResponseParameters, activity, this.f7844n);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void d(MaxAdapterResponseParameters maxAdapterResponseParameters, Activity activity) {
        ((MediationAdapterBase) this.f7837g).loadNativeAd(maxAdapterResponseParameters, activity, this.f7844n);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b(Activity activity) {
        ((MaxInterstitialAdapter) this.f7837g).showInterstitialAd(this.f7845o, activity, this.f7844n);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(final MaxAdapterInitializationParameters maxAdapterInitializationParameters, final Activity activity, final MaxAdapter.OnCompletionListener onCompletionListener) {
        b(MobileAdsBridgeBase.initializeMethodName, new Runnable() { // from class: com.applovin.impl.mediation.j0
            @Override // java.lang.Runnable
            public final void run() {
                g.this.a(onCompletionListener, maxAdapterInitializationParameters, activity);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(MaxAdapter.OnCompletionListener onCompletionListener, MaxAdapterInitializationParameters maxAdapterInitializationParameters, Activity activity) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (com.applovin.impl.sdk.n.a()) {
            com.applovin.impl.sdk.n nVar = this.f7833c;
            nVar.a("MediationAdapterWrapper", "Initializing " + this.f7836f + " on thread: " + Thread.currentThread() + " with 'run_on_ui_thread' value: " + this.f7835e.r());
        }
        this.f7837g.initialize(maxAdapterInitializationParameters, activity, new c(this.f7832b, this.f7835e, elapsedRealtime, onCompletionListener));
    }

    public void c(final u2 u2Var, final Activity activity) {
        Runnable runnable;
        if (b(u2Var, activity)) {
            if (u2Var.Z()) {
                runnable = new Runnable() { // from class: com.applovin.impl.mediation.h0
                    @Override // java.lang.Runnable
                    public final void run() {
                        g.this.a(u2Var, activity);
                    }
                };
            } else if (u2Var.getFormat() == MaxAdFormat.INTERSTITIAL) {
                runnable = new Runnable() { // from class: com.applovin.impl.mediation.c0
                    @Override // java.lang.Runnable
                    public final void run() {
                        g.this.b(activity);
                    }
                };
            } else if (u2Var.getFormat() == MaxAdFormat.APP_OPEN) {
                runnable = new Runnable() { // from class: com.applovin.impl.mediation.d0
                    @Override // java.lang.Runnable
                    public final void run() {
                        g.this.c(activity);
                    }
                };
            } else if (u2Var.getFormat() == MaxAdFormat.REWARDED) {
                runnable = new Runnable() { // from class: com.applovin.impl.mediation.e0
                    @Override // java.lang.Runnable
                    public final void run() {
                        g.this.a(activity);
                    }
                };
            } else {
                throw new IllegalStateException("Failed to show " + u2Var + ": " + u2Var.getFormat() + " is not a supported ad format");
            }
            a(runnable, u2Var);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b(ViewGroup viewGroup, androidx.lifecycle.i iVar, Activity activity) {
        ((MaxRewardedAdViewAdapter) this.f7837g).showRewardedAd(this.f7845o, viewGroup, iVar, activity, this.f7844n);
    }

    private boolean b(u2 u2Var, Activity activity) {
        if (u2Var != null) {
            if (u2Var.A() == null) {
                com.applovin.impl.sdk.n.h("MediationAdapterWrapper", "Adapter has been garbage collected");
                this.f7844n.a("ad_show", new MaxErrorImpl(-1, "Adapter has been garbage collected"), (Bundle) null);
                return false;
            } else if (u2Var.A() == this) {
                if (activity != null || MaxAdFormat.APP_OPEN == u2Var.getFormat()) {
                    if (!this.f7846p.get()) {
                        String str = "Mediation adapter '" + this.f7836f + "' is disabled. Showing ads with this adapter is disabled.";
                        com.applovin.impl.sdk.n.h("MediationAdapterWrapper", str);
                        this.f7844n.a("ad_show", new MaxErrorImpl(-1, str), (Bundle) null);
                        return false;
                    } else if (j()) {
                        return true;
                    } else {
                        throw new IllegalStateException("Mediation adapter '" + this.f7836f + "' does not have an ad loaded. Please load an ad first");
                    }
                }
                throw new IllegalArgumentException("No activity specified");
            } else {
                throw new IllegalArgumentException("Mediated ad belongs to a different adapter");
            }
        }
        throw new IllegalArgumentException("No mediated ad specified");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(String str, u2 u2Var) {
        this.f7838h = str;
        this.f7839i = u2Var;
    }

    public void a(MaxNativeAdView maxNativeAdView) {
        this.f7842l = maxNativeAdView;
    }

    public void a(ViewGroup viewGroup) {
        this.f7843m = viewGroup;
    }

    public void a(String str, final MaxAdapterResponseParameters maxAdapterResponseParameters, final u2 u2Var, final Activity activity, MediationServiceImpl.b bVar) {
        final Runnable runnable;
        if (u2Var != null) {
            if (!this.f7846p.get()) {
                String str2 = "Mediation adapter '" + this.f7836f + "' was disabled due to earlier failures. Loading ads with this adapter is disabled.";
                com.applovin.impl.sdk.n.h("MediationAdapterWrapper", str2);
                bVar.onAdLoadFailed(str, new MaxErrorImpl(-1, str2));
                return;
            }
            this.f7845o = maxAdapterResponseParameters;
            this.f7844n.a(bVar);
            final MaxAdFormat J = u2Var.Z() ? u2Var.J() : u2Var.getFormat();
            if (J == MaxAdFormat.INTERSTITIAL) {
                runnable = new Runnable() { // from class: com.applovin.impl.mediation.y
                    @Override // java.lang.Runnable
                    public final void run() {
                        g.this.a(maxAdapterResponseParameters, activity);
                    }
                };
            } else if (J == MaxAdFormat.APP_OPEN) {
                runnable = new Runnable() { // from class: com.applovin.impl.mediation.w
                    @Override // java.lang.Runnable
                    public final void run() {
                        g.this.b(maxAdapterResponseParameters, activity);
                    }
                };
            } else if (J == MaxAdFormat.REWARDED) {
                runnable = new Runnable() { // from class: com.applovin.impl.mediation.x
                    @Override // java.lang.Runnable
                    public final void run() {
                        g.this.c(maxAdapterResponseParameters, activity);
                    }
                };
            } else if (J == MaxAdFormat.NATIVE) {
                runnable = new Runnable() { // from class: com.applovin.impl.mediation.v
                    @Override // java.lang.Runnable
                    public final void run() {
                        g.this.d(maxAdapterResponseParameters, activity);
                    }
                };
            } else if (J.isAdViewAd()) {
                runnable = new Runnable() { // from class: com.applovin.impl.mediation.z
                    @Override // java.lang.Runnable
                    public final void run() {
                        g.this.a(maxAdapterResponseParameters, J, activity);
                    }
                };
            } else {
                throw new IllegalStateException("Failed to load " + u2Var + ": " + u2Var.getFormat() + " (" + u2Var.J() + ") is not a supported ad format");
            }
            a("load_ad", J, new Runnable() { // from class: com.applovin.impl.mediation.i0
                @Override // java.lang.Runnable
                public final void run() {
                    g.this.a(u2Var, runnable);
                }
            });
            return;
        }
        throw new IllegalArgumentException("No mediated ad specified");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void c(Activity activity) {
        ((MaxAppOpenAdapter) this.f7837g).showAppOpenAd(this.f7845o, activity, this.f7844n);
    }

    public String b() {
        MaxAdapter maxAdapter = this.f7837g;
        if (maxAdapter != null) {
            try {
                return maxAdapter.getAdapterVersion();
            } catch (Throwable th) {
                com.applovin.impl.sdk.n.c("MediationAdapterWrapper", "Failed to get adapter version for " + this.f7834d, th);
                this.f7832b.D().a("MediationAdapterWrapper", "adapter_version", th, CollectionUtils.hashMap("adapter_class", this.f7835e.b()));
                a("adapter_version");
                this.f7832b.L().a(this.f7835e.b(), "adapter_version", this.f7839i);
                return null;
            }
        }
        return null;
    }

    private void b(String str, Runnable runnable) {
        a(str, (MaxAdFormat) null, runnable);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(MaxAdapterResponseParameters maxAdapterResponseParameters, Activity activity) {
        ((MaxInterstitialAdapter) this.f7837g).loadInterstitialAd(maxAdapterResponseParameters, activity, this.f7844n);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(MaxAdapterResponseParameters maxAdapterResponseParameters, MaxAdFormat maxAdFormat, Activity activity) {
        ((MaxAdViewAdapter) this.f7837g).loadAdViewAd(maxAdapterResponseParameters, maxAdFormat, activity, this.f7844n);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(u2 u2Var, Runnable runnable) {
        a(this.f7835e, u2Var);
        try {
            runnable.run();
        } catch (Throwable th) {
            String str = "Failed to start loading ad for " + this.f7834d + " due to: " + th;
            com.applovin.impl.sdk.n.h("MediationAdapterWrapper", str);
            this.f7844n.a("load_ad", new MaxErrorImpl(-1, str));
            this.f7832b.D().a("MediationAdapterWrapper", "load_ad", th, CollectionUtils.hashMap("adapter_class", this.f7835e.b()));
            a("load_ad");
            this.f7832b.L().a(this.f7835e.b(), "load_ad", this.f7839i);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(u2 u2Var, Activity activity) {
        this.f7832b.E().a((w2) u2Var, activity, this.f7844n);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(Activity activity) {
        ((MaxRewardedAdapter) this.f7837g).showRewardedAd(this.f7845o, activity, this.f7844n);
    }

    public void a(u2 u2Var, final ViewGroup viewGroup, final androidx.lifecycle.i iVar, final Activity activity) {
        Runnable runnable;
        if (b(u2Var, activity)) {
            if (u2Var.getFormat() == MaxAdFormat.INTERSTITIAL) {
                runnable = new Runnable() { // from class: com.applovin.impl.mediation.f0
                    @Override // java.lang.Runnable
                    public final void run() {
                        g.this.a(viewGroup, iVar, activity);
                    }
                };
            } else if (u2Var.getFormat() == MaxAdFormat.REWARDED) {
                runnable = new Runnable() { // from class: com.applovin.impl.mediation.g0
                    @Override // java.lang.Runnable
                    public final void run() {
                        g.this.b(viewGroup, iVar, activity);
                    }
                };
            } else {
                throw new IllegalStateException("Failed to show " + u2Var + ": " + u2Var.getFormat() + " is not a supported ad format");
            }
            a(runnable, u2Var);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(ViewGroup viewGroup, androidx.lifecycle.i iVar, Activity activity) {
        ((MaxInterstitialAdViewAdapter) this.f7837g).showInterstitialAd(this.f7845o, viewGroup, iVar, activity, this.f7844n);
    }

    private void a(final Runnable runnable, u2 u2Var) {
        a("show_ad", u2Var.getFormat(), new Runnable() { // from class: com.applovin.impl.mediation.a0
            @Override // java.lang.Runnable
            public final void run() {
                g.this.a(runnable);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(Runnable runnable) {
        try {
            runnable.run();
        } catch (Throwable th) {
            String str = "Failed to start displaying ad for " + this.f7834d + " due to: " + th;
            com.applovin.impl.sdk.n.h("MediationAdapterWrapper", str);
            this.f7844n.a("show_ad", new MaxErrorImpl(-1, str), (Bundle) null);
            this.f7832b.D().a("MediationAdapterWrapper", "show_ad", th, CollectionUtils.hashMap("adapter_class", this.f7835e.b()));
            a("show_ad");
            this.f7832b.L().a(this.f7835e.b(), "show_ad", this.f7839i);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(final MaxAdapterSignalCollectionParameters maxAdapterSignalCollectionParameters, final u4 u4Var, final Activity activity, final j4 j4Var) {
        if (j4Var != null) {
            if (!this.f7846p.get()) {
                com.applovin.impl.sdk.n.h("MediationAdapterWrapper", "Mediation adapter '" + this.f7836f + "' is disabled. Signal collection ads with this adapter is disabled.");
                j4Var.a(new MaxErrorImpl("The adapter (" + this.f7836f + ") is disabled"));
                return;
            }
            MaxAdapter maxAdapter = this.f7837g;
            if (maxAdapter instanceof MaxSignalProvider) {
                final MaxSignalProvider maxSignalProvider = (MaxSignalProvider) maxAdapter;
                b("collect_signal", new Runnable() { // from class: com.applovin.impl.mediation.k0
                    @Override // java.lang.Runnable
                    public final void run() {
                        g.this.a(maxSignalProvider, maxAdapterSignalCollectionParameters, activity, u4Var, j4Var);
                    }
                });
                return;
            }
            j4Var.a(new MaxErrorImpl(MaxAdapterError.ERROR_CODE_SIGNAL_COLLECTION_NOT_SUPPORTED, "The adapter (" + this.f7836f + ") does not support signal collection"));
            return;
        }
        throw new IllegalArgumentException("No callback specified");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(MaxSignalProvider maxSignalProvider, MaxAdapterSignalCollectionParameters maxAdapterSignalCollectionParameters, Activity activity, u4 u4Var, j4 j4Var) {
        try {
            maxSignalProvider.collectSignal(maxAdapterSignalCollectionParameters, activity, new a(u4Var, j4Var));
        } catch (Throwable th) {
            MaxErrorImpl maxErrorImpl = new MaxErrorImpl("Failed signal collection for " + this.f7834d + " due to: " + th);
            com.applovin.impl.sdk.n.h("MediationAdapterWrapper", maxErrorImpl.getMessage());
            j4Var.a(maxErrorImpl);
            this.f7832b.D().a("MediationAdapterWrapper", "collect_signal", th, CollectionUtils.hashMap("adapter_class", this.f7835e.b()));
            a("collect_signal");
            this.f7832b.L().a(this.f7835e.b(), "collect_signal", this.f7839i);
        }
        if (!j4Var.c() && u4Var.m() == 0) {
            if (com.applovin.impl.sdk.n.a()) {
                com.applovin.impl.sdk.n nVar = this.f7833c;
                nVar.a("MediationAdapterWrapper", "Failing signal collection " + u4Var + " since it has 0 timeout");
            }
            j4Var.a(new MaxErrorImpl(MaxAdapterError.ERROR_CODE_SIGNAL_COLLECTION_TIMEOUT, "The adapter (" + this.f7836f + ") has 0 timeout"));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a() {
        if (this.f7849s) {
            return;
        }
        b("destroy", new Runnable() { // from class: com.applovin.impl.mediation.u
            @Override // java.lang.Runnable
            public final void run() {
                g.this.l();
            }
        });
    }

    private void a(d3 d3Var, u2 u2Var) {
        a(new d(this, null), d3Var, u2Var);
    }

    private void a(z4 z4Var, d3 d3Var, u2 u2Var) {
        long m7 = d3Var.m();
        if (m7 <= 0) {
            if (com.applovin.impl.sdk.n.a()) {
                com.applovin.impl.sdk.n nVar = this.f7833c;
                StringBuilder sb = new StringBuilder();
                sb.append("Non-positive timeout set for ");
                if (u2Var != null) {
                    d3Var = u2Var;
                }
                sb.append(d3Var);
                sb.append(", not scheduling a timeout");
                nVar.a("MediationAdapterWrapper", sb.toString());
                return;
            }
            return;
        }
        if (com.applovin.impl.sdk.n.a()) {
            com.applovin.impl.sdk.n nVar2 = this.f7833c;
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Setting timeout ");
            sb2.append(m7);
            sb2.append("ms for ");
            if (u2Var != null) {
                d3Var = u2Var;
            }
            sb2.append(d3Var);
            nVar2.a("MediationAdapterWrapper", sb2.toString());
        }
        this.f7832b.i0().a(z4Var, u5.b.TIMEOUT, m7);
    }

    private void a(String str) {
        if (com.applovin.impl.sdk.n.a()) {
            com.applovin.impl.sdk.n nVar = this.f7833c;
            nVar.d("MediationAdapterWrapper", "Marking " + this.f7836f + " as disabled due to: " + str);
        }
        this.f7846p.set(false);
    }

    private void a(final String str, MaxAdFormat maxAdFormat, final Runnable runnable) {
        Runnable runnable2 = new Runnable() { // from class: com.applovin.impl.mediation.b0
            @Override // java.lang.Runnable
            public final void run() {
                g.this.a(str, runnable);
            }
        };
        if (a(str, maxAdFormat)) {
            this.f7831a.post(runnable2);
            return;
        }
        k6 k6Var = new k6(this.f7832b, str + ":" + this.f7835e.c(), runnable2);
        if (((Boolean) this.f7832b.a(o4.f8068a0)).booleanValue()) {
            this.f7832b.i0().a(k6Var, this.f7835e);
        } else {
            this.f7832b.i0().a(k6Var);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(String str, Runnable runnable) {
        try {
            if (com.applovin.impl.sdk.n.a()) {
                com.applovin.impl.sdk.n nVar = this.f7833c;
                nVar.a("MediationAdapterWrapper", this.f7836f + ": running " + str + "...");
            }
            runnable.run();
            if (com.applovin.impl.sdk.n.a()) {
                com.applovin.impl.sdk.n nVar2 = this.f7833c;
                nVar2.a("MediationAdapterWrapper", this.f7836f + ": finished " + str + "");
            }
        } catch (Throwable th) {
            com.applovin.impl.sdk.n.c("MediationAdapterWrapper", "Failed operation " + str + " for " + this.f7834d, th);
            StringBuilder sb = new StringBuilder();
            sb.append("fail_");
            sb.append(str);
            a(sb.toString());
            if (!str.equals("destroy")) {
                this.f7832b.L().a(this.f7835e.b(), str, this.f7839i);
            }
            HashMap<String, String> hashMap = CollectionUtils.hashMap("is_wrapper", com.ironsource.mediationsdk.metadata.a.f18924g);
            CollectionUtils.putStringIfValid("adapter_class", this.f7835e.b(), hashMap);
            this.f7832b.D().a("MediationAdapterWrapper", str, th, hashMap);
        }
    }

    private boolean a(String str, MaxAdFormat maxAdFormat) {
        Boolean g02;
        Boolean i02;
        Boolean h02;
        MaxAdapter maxAdapter = this.f7837g;
        if (maxAdapter == null) {
            return this.f7835e.r();
        }
        if (MobileAdsBridgeBase.initializeMethodName.equals(str)) {
            Boolean shouldInitializeOnUiThread = maxAdapter.shouldInitializeOnUiThread();
            if (shouldInitializeOnUiThread != null) {
                return shouldInitializeOnUiThread.booleanValue();
            }
        } else if ("collect_signal".equals(str)) {
            Boolean shouldCollectSignalsOnUiThread = maxAdapter.shouldCollectSignalsOnUiThread();
            if (shouldCollectSignalsOnUiThread != null) {
                return shouldCollectSignalsOnUiThread.booleanValue();
            }
        } else if ("load_ad".equals(str) && maxAdFormat != null) {
            u2 u2Var = this.f7839i;
            if (u2Var != null && (h02 = u2Var.h0()) != null) {
                return h02.booleanValue();
            }
            Boolean shouldLoadAdsOnUiThread = maxAdapter.shouldLoadAdsOnUiThread(maxAdFormat);
            if (shouldLoadAdsOnUiThread != null) {
                return shouldLoadAdsOnUiThread.booleanValue();
            }
        } else if ("show_ad".equals(str) && maxAdFormat != null) {
            u2 u2Var2 = this.f7839i;
            if (u2Var2 != null && (i02 = u2Var2.i0()) != null) {
                return i02.booleanValue();
            }
            Boolean shouldShowAdsOnUiThread = maxAdapter.shouldShowAdsOnUiThread(maxAdFormat);
            if (shouldShowAdsOnUiThread != null) {
                return shouldShowAdsOnUiThread.booleanValue();
            }
        } else if ("destroy".equals(str)) {
            u2 u2Var3 = this.f7839i;
            if (u2Var3 != null && (g02 = u2Var3.g0()) != null) {
                return g02.booleanValue();
            }
            Boolean shouldDestroyOnUiThread = maxAdapter.shouldDestroyOnUiThread();
            if (shouldDestroyOnUiThread != null) {
                return shouldDestroyOnUiThread.booleanValue();
            }
            return ((Boolean) this.f7832b.a(j3.J7)).booleanValue();
        }
        return this.f7835e.r();
    }
}
