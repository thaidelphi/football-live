package com.ironsource;

import com.ironsource.mediationsdk.logger.IronSourceError;
import com.unity3d.ironsourceads.interstitial.InterstitialAd;
import com.unity3d.ironsourceads.interstitial.InterstitialAdLoaderListener;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class fj implements t0<InterstitialAd> {

    /* renamed from: a  reason: collision with root package name */
    private final uu f17479a;

    /* renamed from: b  reason: collision with root package name */
    private final InterstitialAdLoaderListener f17480b;

    public fj(uu threadManager, InterstitialAdLoaderListener publisherListener) {
        kotlin.jvm.internal.n.f(threadManager, "threadManager");
        kotlin.jvm.internal.n.f(publisherListener, "publisherListener");
        this.f17479a = threadManager;
        this.f17480b = publisherListener;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(fj this$0, IronSourceError error) {
        kotlin.jvm.internal.n.f(this$0, "this$0");
        kotlin.jvm.internal.n.f(error, "$error");
        this$0.f17480b.onInterstitialAdLoadFailed(error);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(fj this$0, InterstitialAd adObject) {
        kotlin.jvm.internal.n.f(this$0, "this$0");
        kotlin.jvm.internal.n.f(adObject, "$adObject");
        this$0.f17480b.onInterstitialAdLoaded(adObject);
    }

    @Override // com.ironsource.t0
    public void a(final InterstitialAd adObject) {
        kotlin.jvm.internal.n.f(adObject, "adObject");
        this.f17479a.a(new Runnable() { // from class: com.ironsource.dy
            @Override // java.lang.Runnable
            public final void run() {
                fj.a(fj.this, adObject);
            }
        });
    }

    @Override // com.ironsource.t0
    public void onAdLoadFailed(final IronSourceError error) {
        kotlin.jvm.internal.n.f(error, "error");
        this.f17479a.a(new Runnable() { // from class: com.ironsource.cy
            @Override // java.lang.Runnable
            public final void run() {
                fj.a(fj.this, error);
            }
        });
    }
}
