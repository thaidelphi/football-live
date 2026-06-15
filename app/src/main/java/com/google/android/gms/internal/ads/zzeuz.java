package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzeuz implements zzgal {
    final /* synthetic */ zzejh zza;
    final /* synthetic */ zzffn zzb;
    final /* synthetic */ zzffc zzc;
    final /* synthetic */ zzeva zzd;
    final /* synthetic */ zzevc zze;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzeuz(zzevc zzevcVar, zzejh zzejhVar, zzffn zzffnVar, zzffc zzffcVar, zzeva zzevaVar) {
        this.zza = zzejhVar;
        this.zzb = zzffnVar;
        this.zzc = zzffcVar;
        this.zzd = zzevaVar;
        this.zze = zzevcVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgal
    public final void zza(Throwable th) {
        zzexl zzexlVar;
        final com.google.android.gms.ads.internal.client.zze zza;
        zzevs zzevsVar;
        zzctk zzm;
        zzffq zzffqVar;
        zzffn zzffnVar;
        Executor executor;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbbm.zzfH)).booleanValue()) {
            com.google.android.gms.ads.internal.util.zze.zzb("App open ad failed to load", th);
        }
        zzexlVar = this.zze.zze;
        zzcmo zzcmoVar = (zzcmo) zzexlVar.zzd();
        if (zzcmoVar == null) {
            zza = zzfbq.zzb(th, null);
        } else {
            zza = zzcmoVar.zzb().zza(th);
        }
        synchronized (this.zze) {
            this.zze.zzj = null;
            if (zzcmoVar != null) {
                zzcmoVar.zzc().zzdz(zza);
                if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbbm.zzid)).booleanValue()) {
                    executor = this.zze.zzc;
                    executor.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzeuy
                        @Override // java.lang.Runnable
                        public final void run() {
                            zzevs zzevsVar2;
                            zzevsVar2 = zzeuz.this.zze.zzd;
                            zzevsVar2.zzdz(zza);
                        }
                    });
                }
            } else {
                zzevsVar = this.zze.zzd;
                zzevsVar.zzdz(zza);
                zzm = this.zze.zzm(this.zzd);
                ((zzcmo) zzm.zzh()).zzb().zzc().zzh();
            }
            zzfbm.zzb(zza.zza, th, "AppOpenAdLoader.onFailure");
            this.zza.zza();
            if (((Boolean) zzbdf.zzc.zze()).booleanValue() && (zzffnVar = this.zzb) != null) {
                zzffnVar.zzc(zza);
                zzffc zzffcVar = this.zzc;
                zzffcVar.zzh(th);
                zzffcVar.zzg(false);
                zzffnVar.zza(zzffcVar);
                zzffnVar.zzh();
            } else {
                zzffqVar = this.zze.zzh;
                zzffc zzffcVar2 = this.zzc;
                zzffcVar2.zza(zza);
                zzffcVar2.zzh(th);
                zzffcVar2.zzg(false);
                zzffqVar.zzc(zzffcVar2.zzm());
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgal
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        zzffq zzffqVar;
        zzffn zzffnVar;
        zzevs zzevsVar;
        zzcpl zzcplVar = (zzcpl) obj;
        synchronized (this.zze) {
            this.zze.zzj = null;
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbbm.zzid)).booleanValue()) {
                zzcyl zzn = zzcplVar.zzn();
                zzevsVar = this.zze.zzd;
                zzn.zzb(zzevsVar);
            }
            this.zza.zzb(zzcplVar);
            if (((Boolean) zzbdf.zzc.zze()).booleanValue() && (zzffnVar = this.zzb) != null) {
                zzffnVar.zzg(zzcplVar.zzp().zzb);
                zzffnVar.zze(zzcplVar.zzl().zzg());
                zzffc zzffcVar = this.zzc;
                zzffcVar.zzg(true);
                zzffnVar.zza(zzffcVar);
                zzffnVar.zzh();
            } else {
                zzffqVar = this.zze.zzh;
                zzffc zzffcVar2 = this.zzc;
                zzffcVar2.zzb(zzcplVar.zzp().zzb);
                zzffcVar2.zzd(zzcplVar.zzl().zzg());
                zzffcVar2.zzg(true);
                zzffqVar.zzc(zzffcVar2.zzm());
            }
        }
    }
}
