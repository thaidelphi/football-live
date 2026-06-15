package com.google.android.gms.ads.mediation.customevent;

import android.view.View;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.mediation.MediationBannerListener;
/* compiled from: com.google.android.gms:play-services-ads-lite@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
final class zza implements CustomEventBannerListener {

    /* renamed from: a  reason: collision with root package name */
    private final CustomEventAdapter f11644a;

    /* renamed from: b  reason: collision with root package name */
    private final MediationBannerListener f11645b;

    public zza(CustomEventAdapter customEventAdapter, MediationBannerListener mediationBannerListener) {
        this.f11644a = customEventAdapter;
        this.f11645b = mediationBannerListener;
    }

    @Override // com.google.android.gms.ads.mediation.customevent.CustomEventListener
    public final void onAdClicked() {
        zzo.zze("Custom event adapter called onAdClicked.");
        this.f11645b.onAdClicked(this.f11644a);
    }

    @Override // com.google.android.gms.ads.mediation.customevent.CustomEventListener
    public final void onAdClosed() {
        zzo.zze("Custom event adapter called onAdClosed.");
        this.f11645b.onAdClosed(this.f11644a);
    }

    @Override // com.google.android.gms.ads.mediation.customevent.CustomEventListener
    public final void onAdFailedToLoad(int i10) {
        zzo.zze("Custom event adapter called onAdFailedToLoad.");
        this.f11645b.onAdFailedToLoad(this.f11644a, i10);
    }

    @Override // com.google.android.gms.ads.mediation.customevent.CustomEventListener
    public final void onAdLeftApplication() {
        zzo.zze("Custom event adapter called onAdLeftApplication.");
        this.f11645b.onAdLeftApplication(this.f11644a);
    }

    @Override // com.google.android.gms.ads.mediation.customevent.CustomEventBannerListener
    public final void onAdLoaded(View view) {
        zzo.zze("Custom event adapter called onAdLoaded.");
        this.f11644a.f11639a = view;
        this.f11645b.onAdLoaded(this.f11644a);
    }

    @Override // com.google.android.gms.ads.mediation.customevent.CustomEventListener
    public final void onAdOpened() {
        zzo.zze("Custom event adapter called onAdOpened.");
        this.f11645b.onAdOpened(this.f11644a);
    }

    @Override // com.google.android.gms.ads.mediation.customevent.CustomEventListener
    public final void onAdFailedToLoad(AdError adError) {
        zzo.zze("Custom event adapter called onAdFailedToLoad.");
        this.f11645b.onAdFailedToLoad(this.f11644a, adError);
    }
}
