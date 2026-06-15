package com.google.android.gms.internal.ads;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
final class zzfht extends zzazg {
    final /* synthetic */ zzgbj zza;
    final /* synthetic */ com.google.android.gms.ads.internal.client.zzfq zzb;
    final /* synthetic */ zzfhu zzc;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzfht(zzfhu zzfhuVar, zzgbj zzgbjVar, com.google.android.gms.ads.internal.client.zzfq zzfqVar) {
        this.zza = zzgbjVar;
        this.zzb = zzfqVar;
        this.zzc = zzfhuVar;
    }

    @Override // com.google.android.gms.internal.ads.zzazh
    public final void zzb(int i10) {
    }

    @Override // com.google.android.gms.internal.ads.zzazh
    public final void zzc(com.google.android.gms.ads.internal.client.zze zzeVar) {
        String adError = zzeVar.zzb().toString();
        String str = this.zzb.zza;
        com.google.android.gms.ads.internal.util.client.zzo.zzj("Failed to load app open ad with error parcel: " + adError + " for ad unit: " + str);
        this.zzc.zzA(zzeVar);
    }

    @Override // com.google.android.gms.internal.ads.zzazh
    public final void zzd(zzaze zzazeVar) {
        zzfhs.zza(zzazeVar, this.zza);
    }
}
