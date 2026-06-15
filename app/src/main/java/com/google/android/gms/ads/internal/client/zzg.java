package com.google.android.gms.ads.internal.client;

import com.google.android.gms.ads.AdListener;
/* compiled from: com.google.android.gms:play-services-ads-lite@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class zzg extends zzbj {

    /* renamed from: a  reason: collision with root package name */
    private final AdListener f11295a;

    public zzg(AdListener adListener) {
        this.f11295a = adListener;
    }

    public final AdListener zzb() {
        return this.f11295a;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbk
    public final void zzc() {
        AdListener adListener = this.f11295a;
        if (adListener != null) {
            adListener.onAdClicked();
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzbk
    public final void zzd() {
        AdListener adListener = this.f11295a;
        if (adListener != null) {
            adListener.onAdClosed();
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzbk
    public final void zze(int i10) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbk
    public final void zzf(zze zzeVar) {
        AdListener adListener = this.f11295a;
        if (adListener != null) {
            adListener.onAdFailedToLoad(zzeVar.zzb());
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzbk
    public final void zzg() {
        AdListener adListener = this.f11295a;
        if (adListener != null) {
            adListener.onAdImpression();
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzbk
    public final void zzh() {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbk
    public final void zzi() {
        AdListener adListener = this.f11295a;
        if (adListener != null) {
            adListener.onAdLoaded();
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzbk
    public final void zzj() {
        AdListener adListener = this.f11295a;
        if (adListener != null) {
            adListener.onAdOpened();
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzbk
    public final void zzk() {
        AdListener adListener = this.f11295a;
        if (adListener != null) {
            adListener.onAdSwipeGestureClicked();
        }
    }
}
