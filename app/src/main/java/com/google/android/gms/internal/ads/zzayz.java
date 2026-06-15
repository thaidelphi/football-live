package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.appopen.AppOpenAd;
/* compiled from: com.google.android.gms:play-services-ads-lite@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzayz extends zzazg {
    private final AppOpenAd.AppOpenAdLoadCallback zza;
    private final String zzb;

    public zzayz(AppOpenAd.AppOpenAdLoadCallback appOpenAdLoadCallback, String str) {
        this.zza = appOpenAdLoadCallback;
        this.zzb = str;
    }

    @Override // com.google.android.gms.internal.ads.zzazh
    public final void zzb(int i10) {
    }

    @Override // com.google.android.gms.internal.ads.zzazh
    public final void zzc(com.google.android.gms.ads.internal.client.zze zzeVar) {
        if (this.zza != null) {
            this.zza.onAdFailedToLoad(zzeVar.zzb());
        }
    }

    @Override // com.google.android.gms.internal.ads.zzazh
    public final void zzd(zzaze zzazeVar) {
        if (this.zza != null) {
            this.zza.onAdLoaded(new zzaza(zzazeVar, this.zzb));
        }
    }
}
