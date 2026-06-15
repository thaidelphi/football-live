package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.LoadAdError;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzdty extends AdListener {
    final /* synthetic */ String zza;
    final /* synthetic */ zzdub zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzdty(zzdub zzdubVar, String str) {
        this.zza = str;
        this.zzb = zzdubVar;
    }

    @Override // com.google.android.gms.ads.AdListener
    public final void onAdFailedToLoad(LoadAdError loadAdError) {
        String zzl;
        zzdub zzdubVar = this.zzb;
        zzl = zzdub.zzl(loadAdError);
        zzdubVar.zzm(zzl, this.zza);
    }
}
