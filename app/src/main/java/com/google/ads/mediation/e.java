package com.google.ads.mediation;

import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.formats.UnifiedNativeAd;
import com.google.android.gms.ads.formats.zzf;
import com.google.android.gms.ads.formats.zzg;
import com.google.android.gms.ads.formats.zzi;
import com.google.android.gms.ads.mediation.MediationNativeListener;
import com.google.android.gms.internal.ads.zzbft;
/* compiled from: com.google.android.gms:play-services-ads-lite@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
final class e extends AdListener implements zzi, zzg, zzf {

    /* renamed from: a  reason: collision with root package name */
    final AbstractAdViewAdapter f10406a;

    /* renamed from: b  reason: collision with root package name */
    final MediationNativeListener f10407b;

    public e(AbstractAdViewAdapter abstractAdViewAdapter, MediationNativeListener mediationNativeListener) {
        this.f10406a = abstractAdViewAdapter;
        this.f10407b = mediationNativeListener;
    }

    @Override // com.google.android.gms.ads.AdListener
    public final void onAdClicked() {
        this.f10407b.onAdClicked(this.f10406a);
    }

    @Override // com.google.android.gms.ads.AdListener
    public final void onAdClosed() {
        this.f10407b.onAdClosed(this.f10406a);
    }

    @Override // com.google.android.gms.ads.AdListener
    public final void onAdFailedToLoad(LoadAdError loadAdError) {
        this.f10407b.onAdFailedToLoad(this.f10406a, loadAdError);
    }

    @Override // com.google.android.gms.ads.AdListener
    public final void onAdImpression() {
        this.f10407b.onAdImpression(this.f10406a);
    }

    @Override // com.google.android.gms.ads.AdListener
    public final void onAdLoaded() {
    }

    @Override // com.google.android.gms.ads.AdListener
    public final void onAdOpened() {
        this.f10407b.onAdOpened(this.f10406a);
    }

    @Override // com.google.android.gms.ads.formats.zzi
    public final void zza(UnifiedNativeAd unifiedNativeAd) {
        this.f10407b.onAdLoaded(this.f10406a, new a(unifiedNativeAd));
    }

    @Override // com.google.android.gms.ads.formats.zzf
    public final void zzb(zzbft zzbftVar, String str) {
        this.f10407b.zze(this.f10406a, zzbftVar, str);
    }

    @Override // com.google.android.gms.ads.formats.zzg
    public final void zzc(zzbft zzbftVar) {
        this.f10407b.zzd(this.f10406a, zzbftVar);
    }
}
