package com.google.android.gms.internal.ads;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
final class zzfiq extends zzbvo {
    final /* synthetic */ zzgbj zza;
    final /* synthetic */ zzbvi zzb;
    final /* synthetic */ zzfir zzc;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzfiq(zzfir zzfirVar, zzgbj zzgbjVar, zzbvi zzbviVar) {
        this.zza = zzgbjVar;
        this.zzb = zzbviVar;
        this.zzc = zzfirVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbvp
    public final void zze(int i10) {
    }

    @Override // com.google.android.gms.internal.ads.zzbvp
    public final void zzf(com.google.android.gms.ads.internal.client.zze zzeVar) {
        String adError = zzeVar.zzb().toString();
        String str = this.zzc.zze.zza;
        com.google.android.gms.ads.internal.util.client.zzo.zzj("Failed to load rewarded ad with error: " + adError + ", adUnitId: " + str);
        this.zzc.zzA(zzeVar);
    }

    @Override // com.google.android.gms.internal.ads.zzbvp
    public final void zzg() {
        zzfhs.zza(this.zzb, this.zza);
    }
}
