package com.google.android.gms.internal.ads;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzdgk implements zzgal {
    final /* synthetic */ String zza = "Google";
    final /* synthetic */ zzdgm zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzdgk(zzdgm zzdgmVar, String str, boolean z10) {
        this.zzb = zzdgmVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgal
    public final void zza(Throwable th) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbbm.zzfo)).booleanValue()) {
            com.google.android.gms.ads.internal.zzv.zzp().zzv(th, "omid native display exp");
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgal
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        zzdgr zzdgrVar;
        zzdgr zzdgrVar2;
        zzdgrVar = this.zzb.zze;
        zzdgrVar.zzT((zzcdq) obj);
        zzdgm zzdgmVar = this.zzb;
        zzdgrVar2 = zzdgmVar.zze;
        zzbyu zzp = zzdgrVar2.zzp();
        zzebb zzf = zzdgmVar.zzf(this.zza, true);
        if (zzf != null && zzp != null) {
            zzp.zzc(zzf);
        } else if (zzp != null) {
            zzp.cancel(false);
        }
    }
}
