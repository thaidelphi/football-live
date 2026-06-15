package com.google.android.gms.ads.internal.client;

import com.google.android.gms.ads.FullScreenContentCallback;
/* compiled from: com.google.android.gms:play-services-ads-lite@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class zzbe extends zzcr {

    /* renamed from: a  reason: collision with root package name */
    private final FullScreenContentCallback f11213a;

    public zzbe(FullScreenContentCallback fullScreenContentCallback) {
        this.f11213a = fullScreenContentCallback;
    }

    @Override // com.google.android.gms.ads.internal.client.zzcs
    public final void zzb() {
        FullScreenContentCallback fullScreenContentCallback = this.f11213a;
        if (fullScreenContentCallback != null) {
            fullScreenContentCallback.onAdClicked();
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzcs
    public final void zzc() {
        FullScreenContentCallback fullScreenContentCallback = this.f11213a;
        if (fullScreenContentCallback != null) {
            fullScreenContentCallback.onAdDismissedFullScreenContent();
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzcs
    public final void zzd(zze zzeVar) {
        FullScreenContentCallback fullScreenContentCallback = this.f11213a;
        if (fullScreenContentCallback != null) {
            fullScreenContentCallback.onAdFailedToShowFullScreenContent(zzeVar.zza());
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzcs
    public final void zze() {
        FullScreenContentCallback fullScreenContentCallback = this.f11213a;
        if (fullScreenContentCallback != null) {
            fullScreenContentCallback.onAdImpression();
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzcs
    public final void zzf() {
        FullScreenContentCallback fullScreenContentCallback = this.f11213a;
        if (fullScreenContentCallback != null) {
            fullScreenContentCallback.onAdShowedFullScreenContent();
        }
    }
}
