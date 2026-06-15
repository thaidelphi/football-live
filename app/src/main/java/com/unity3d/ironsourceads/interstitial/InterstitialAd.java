package com.unity3d.ironsourceads.interstitial;

import android.app.Activity;
import com.ironsource.bj;
import com.ironsource.cj;
import com.ironsource.mediationsdk.logger.IronSourceError;
import kotlin.jvm.internal.n;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
public final class InterstitialAd implements cj {

    /* renamed from: a  reason: collision with root package name */
    private final bj f23728a;

    /* renamed from: b  reason: collision with root package name */
    private InterstitialAdListener f23729b;

    public InterstitialAd(bj interstitialAdInternal) {
        n.f(interstitialAdInternal, "interstitialAdInternal");
        this.f23728a = interstitialAdInternal;
        interstitialAdInternal.a(this);
    }

    public final InterstitialAdInfo getAdInfo() {
        return this.f23728a.b();
    }

    public final InterstitialAdListener getListener() {
        return this.f23729b;
    }

    public final boolean isReadyToShow() {
        return this.f23728a.d();
    }

    @Override // com.ironsource.cj
    public void onAdInstanceDidBecomeVisible() {
        InterstitialAdListener interstitialAdListener = this.f23729b;
        if (interstitialAdListener != null) {
            interstitialAdListener.onInterstitialAdShown(this);
        }
    }

    @Override // com.ironsource.cj
    public void onAdInstanceDidClick() {
        InterstitialAdListener interstitialAdListener = this.f23729b;
        if (interstitialAdListener != null) {
            interstitialAdListener.onInterstitialAdClicked(this);
        }
    }

    @Override // com.ironsource.cj
    public void onAdInstanceDidDismiss() {
        InterstitialAdListener interstitialAdListener = this.f23729b;
        if (interstitialAdListener != null) {
            interstitialAdListener.onInterstitialAdDismissed(this);
        }
    }

    @Override // com.ironsource.cj
    public void onAdInstanceDidFailedToShow(IronSourceError error) {
        n.f(error, "error");
        InterstitialAdListener interstitialAdListener = this.f23729b;
        if (interstitialAdListener != null) {
            interstitialAdListener.onInterstitialAdFailedToShow(this, error);
        }
    }

    @Override // com.ironsource.cj
    public void onAdInstanceDidReward(String str, int i10) {
    }

    @Override // com.ironsource.cj
    public void onAdInstanceDidShow() {
        InterstitialAdListener interstitialAdListener = this.f23729b;
        if (interstitialAdListener != null) {
            interstitialAdListener.onInterstitialAdShown(this);
        }
    }

    public final void setListener(InterstitialAdListener interstitialAdListener) {
        this.f23729b = interstitialAdListener;
    }

    public final void show(Activity activity) {
        n.f(activity, "activity");
        this.f23728a.a(activity);
    }
}
