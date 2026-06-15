package com.google.ads.mediation;

import com.google.android.gms.ads.FullScreenContentCallback;
import com.google.android.gms.ads.mediation.MediationInterstitialListener;
/* compiled from: com.google.android.gms:play-services-ads-lite@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
final class d extends FullScreenContentCallback {

    /* renamed from: a  reason: collision with root package name */
    final AbstractAdViewAdapter f10404a;

    /* renamed from: b  reason: collision with root package name */
    final MediationInterstitialListener f10405b;

    public d(AbstractAdViewAdapter abstractAdViewAdapter, MediationInterstitialListener mediationInterstitialListener) {
        this.f10404a = abstractAdViewAdapter;
        this.f10405b = mediationInterstitialListener;
    }

    @Override // com.google.android.gms.ads.FullScreenContentCallback
    public final void onAdDismissedFullScreenContent() {
        this.f10405b.onAdClosed(this.f10404a);
    }

    @Override // com.google.android.gms.ads.FullScreenContentCallback
    public final void onAdShowedFullScreenContent() {
        this.f10405b.onAdOpened(this.f10404a);
    }
}
