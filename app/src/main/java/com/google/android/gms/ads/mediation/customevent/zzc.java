package com.google.android.gms.ads.mediation.customevent;

import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.mediation.MediationNativeListener;
import com.google.android.gms.ads.mediation.UnifiedNativeAdMapper;
/* compiled from: com.google.android.gms:play-services-ads-lite@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
final class zzc implements CustomEventNativeListener {

    /* renamed from: a  reason: collision with root package name */
    private final CustomEventAdapter f11649a;

    /* renamed from: b  reason: collision with root package name */
    private final MediationNativeListener f11650b;

    public zzc(CustomEventAdapter customEventAdapter, MediationNativeListener mediationNativeListener) {
        this.f11649a = customEventAdapter;
        this.f11650b = mediationNativeListener;
    }

    @Override // com.google.android.gms.ads.mediation.customevent.CustomEventListener
    public final void onAdClicked() {
        zzo.zze("Custom event adapter called onAdClicked.");
        this.f11650b.onAdClicked(this.f11649a);
    }

    @Override // com.google.android.gms.ads.mediation.customevent.CustomEventListener
    public final void onAdClosed() {
        zzo.zze("Custom event adapter called onAdClosed.");
        this.f11650b.onAdClosed(this.f11649a);
    }

    @Override // com.google.android.gms.ads.mediation.customevent.CustomEventListener
    public final void onAdFailedToLoad(int i10) {
        zzo.zze("Custom event adapter called onAdFailedToLoad.");
        this.f11650b.onAdFailedToLoad(this.f11649a, i10);
    }

    @Override // com.google.android.gms.ads.mediation.customevent.CustomEventNativeListener
    public final void onAdImpression() {
        zzo.zze("Custom event adapter called onAdImpression.");
        this.f11650b.onAdImpression(this.f11649a);
    }

    @Override // com.google.android.gms.ads.mediation.customevent.CustomEventListener
    public final void onAdLeftApplication() {
        zzo.zze("Custom event adapter called onAdLeftApplication.");
        this.f11650b.onAdLeftApplication(this.f11649a);
    }

    @Override // com.google.android.gms.ads.mediation.customevent.CustomEventNativeListener
    public final void onAdLoaded(UnifiedNativeAdMapper unifiedNativeAdMapper) {
        zzo.zze("Custom event adapter called onAdLoaded.");
        this.f11650b.onAdLoaded(this.f11649a, unifiedNativeAdMapper);
    }

    @Override // com.google.android.gms.ads.mediation.customevent.CustomEventListener
    public final void onAdOpened() {
        zzo.zze("Custom event adapter called onAdOpened.");
        this.f11650b.onAdOpened(this.f11649a);
    }

    @Override // com.google.android.gms.ads.mediation.customevent.CustomEventListener
    public final void onAdFailedToLoad(AdError adError) {
        zzo.zze("Custom event adapter called onAdFailedToLoad.");
        this.f11650b.onAdFailedToLoad(this.f11649a, adError);
    }
}
