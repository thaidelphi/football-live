package com.google.android.gms.internal.ads;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
final class zzfhw extends com.google.android.gms.ads.internal.client.zzbm {
    final /* synthetic */ zzgbj zza;
    final /* synthetic */ com.google.android.gms.ads.internal.client.zzbx zzb;
    final /* synthetic */ zzfhx zzc;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzfhw(zzfhx zzfhxVar, zzgbj zzgbjVar, com.google.android.gms.ads.internal.client.zzbx zzbxVar) {
        this.zza = zzgbjVar;
        this.zzb = zzbxVar;
        this.zzc = zzfhxVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbn
    public final void zzb(com.google.android.gms.ads.internal.client.zze zzeVar) {
        String adError = zzeVar.zzb().toString();
        String str = this.zzc.zze.zza;
        com.google.android.gms.ads.internal.util.client.zzo.zzj("Failed to load interstitial ad with error: " + adError + " for ad unit: " + str);
        this.zzc.zzA(zzeVar);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbn
    public final void zzc() {
        zzfhs.zza(this.zzb, this.zza);
    }
}
