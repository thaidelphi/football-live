package com.google.android.gms.ads.mediation.customevent;

import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.mediation.MediationInterstitialListener;
/* compiled from: com.google.android.gms:play-services-ads-lite@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
final class zzb implements CustomEventInterstitialListener {

    /* renamed from: a  reason: collision with root package name */
    private final CustomEventAdapter f11646a;

    /* renamed from: b  reason: collision with root package name */
    private final MediationInterstitialListener f11647b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ CustomEventAdapter f11648c;

    public zzb(CustomEventAdapter customEventAdapter, CustomEventAdapter customEventAdapter2, MediationInterstitialListener mediationInterstitialListener) {
        this.f11648c = customEventAdapter;
        this.f11646a = customEventAdapter2;
        this.f11647b = mediationInterstitialListener;
    }

    @Override // com.google.android.gms.ads.mediation.customevent.CustomEventListener
    public final void onAdClicked() {
        zzo.zze("Custom event adapter called onAdClicked.");
        this.f11647b.onAdClicked(this.f11646a);
    }

    @Override // com.google.android.gms.ads.mediation.customevent.CustomEventListener
    public final void onAdClosed() {
        zzo.zze("Custom event adapter called onAdClosed.");
        this.f11647b.onAdClosed(this.f11646a);
    }

    @Override // com.google.android.gms.ads.mediation.customevent.CustomEventListener
    public final void onAdFailedToLoad(int i10) {
        zzo.zze("Custom event adapter called onFailedToReceiveAd.");
        this.f11647b.onAdFailedToLoad(this.f11646a, i10);
    }

    @Override // com.google.android.gms.ads.mediation.customevent.CustomEventListener
    public final void onAdLeftApplication() {
        zzo.zze("Custom event adapter called onAdLeftApplication.");
        this.f11647b.onAdLeftApplication(this.f11646a);
    }

    @Override // com.google.android.gms.ads.mediation.customevent.CustomEventInterstitialListener
    public final void onAdLoaded() {
        zzo.zze("Custom event adapter called onReceivedAd.");
        this.f11647b.onAdLoaded(this.f11648c);
    }

    @Override // com.google.android.gms.ads.mediation.customevent.CustomEventListener
    public final void onAdOpened() {
        zzo.zze("Custom event adapter called onAdOpened.");
        this.f11647b.onAdOpened(this.f11646a);
    }

    @Override // com.google.android.gms.ads.mediation.customevent.CustomEventListener
    public final void onAdFailedToLoad(AdError adError) {
        zzo.zze("Custom event adapter called onFailedToReceiveAd.");
        this.f11647b.onAdFailedToLoad(this.f11646a, adError);
    }
}
