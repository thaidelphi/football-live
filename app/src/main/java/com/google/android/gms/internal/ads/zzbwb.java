package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.rewardedinterstitial.RewardedInterstitialAdLoadCallback;
/* compiled from: com.google.android.gms:play-services-ads-lite@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzbwb extends zzbvo {
    private final RewardedInterstitialAdLoadCallback zza;
    private final zzbwc zzb;

    public zzbwb(RewardedInterstitialAdLoadCallback rewardedInterstitialAdLoadCallback, zzbwc zzbwcVar) {
        this.zza = rewardedInterstitialAdLoadCallback;
        this.zzb = zzbwcVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbvp
    public final void zze(int i10) {
    }

    @Override // com.google.android.gms.internal.ads.zzbvp
    public final void zzf(com.google.android.gms.ads.internal.client.zze zzeVar) {
        RewardedInterstitialAdLoadCallback rewardedInterstitialAdLoadCallback = this.zza;
        if (rewardedInterstitialAdLoadCallback != null) {
            rewardedInterstitialAdLoadCallback.onAdFailedToLoad(zzeVar.zzb());
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbvp
    public final void zzg() {
        zzbwc zzbwcVar;
        RewardedInterstitialAdLoadCallback rewardedInterstitialAdLoadCallback = this.zza;
        if (rewardedInterstitialAdLoadCallback == null || (zzbwcVar = this.zzb) == null) {
            return;
        }
        rewardedInterstitialAdLoadCallback.onAdLoaded(zzbwcVar);
    }
}
