package com.google.android.gms.internal.ads;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzewf implements zzgal {
    final /* synthetic */ zzffn zza;
    final /* synthetic */ zzffc zzb;
    final /* synthetic */ zzcoi zzc;
    final /* synthetic */ zzewg zzd;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzewf(zzewg zzewgVar, zzffn zzffnVar, zzffc zzffcVar, zzcoi zzcoiVar) {
        this.zza = zzffnVar;
        this.zzb = zzffcVar;
        this.zzc = zzcoiVar;
        this.zzd = zzewgVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgal
    public final void zza(Throwable th) {
        boolean z10;
        zzffq zzffqVar;
        zzffn zzffnVar;
        zzcwx zzcwxVar;
        zzczd zzczdVar;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbbm.zzfH)).booleanValue()) {
            com.google.android.gms.ads.internal.util.zze.zzb("Banner ad failed to load", th);
        }
        synchronized (this.zzd) {
            com.google.android.gms.ads.internal.client.zze zza = this.zzc.zzc().zza(th);
            this.zzd.zzn = zza;
            this.zzc.zze().zzdz(zza);
            zzfbm.zzb(zza.zza, th, "BannerAdLoader.onFailure");
            zzewg zzewgVar = this.zzd;
            z10 = zzewgVar.zzm;
            if (z10) {
                zzewgVar.zzt();
                zzewg zzewgVar2 = this.zzd;
                zzcwxVar = zzewgVar2.zzh;
                zzczdVar = zzewgVar2.zzj;
                zzcwxVar.zzd(zzczdVar.zzc());
            }
            if (((Boolean) zzbdf.zzc.zze()).booleanValue() && (zzffnVar = this.zza) != null) {
                zzffnVar.zzc(zza);
                zzffc zzffcVar = this.zzb;
                zzffcVar.zzh(th);
                zzffcVar.zzg(false);
                zzffnVar.zza(zzffcVar);
                zzffnVar.zzh();
            } else {
                zzffqVar = this.zzd.zzi;
                zzffc zzffcVar2 = this.zzb;
                zzffcVar2.zza(zza);
                zzffcVar2.zzh(th);
                zzffcVar2.zzg(false);
                zzffqVar.zzc(zzffcVar2.zzm());
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgal
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        boolean z10;
        zzffq zzffqVar;
        zzffn zzffnVar;
        zzcne zzcneVar = (zzcne) obj;
        synchronized (this.zzd) {
            zzewg zzewgVar = this.zzd;
            z10 = zzewgVar.zzm;
            if (z10) {
                zzewgVar.zzq();
            }
            if (((Boolean) zzbdf.zzc.zze()).booleanValue() && (zzffnVar = this.zza) != null) {
                zzffnVar.zzg(zzcneVar.zzp().zzb);
                zzffnVar.zze(zzcneVar.zzl().zzg());
                zzffc zzffcVar = this.zzb;
                zzffcVar.zzg(true);
                zzffnVar.zza(zzffcVar);
                zzffnVar.zzh();
            } else {
                zzffqVar = this.zzd.zzi;
                zzffc zzffcVar2 = this.zzb;
                zzffcVar2.zzb(zzcneVar.zzp().zzb);
                zzffcVar2.zzd(zzcneVar.zzl().zzg());
                zzffcVar2.zzg(true);
                zzffqVar.zzc(zzffcVar2.zzm());
            }
        }
    }
}
