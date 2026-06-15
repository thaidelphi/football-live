package com.google.android.gms.internal.ads;

import java.util.Objects;
import java.util.concurrent.Executor;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzeze implements zzgal {
    final /* synthetic */ zzejh zza;
    final /* synthetic */ zzffn zzb;
    final /* synthetic */ zzffc zzc;
    final /* synthetic */ zzezf zzd;
    final /* synthetic */ zzezh zze;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzeze(zzezh zzezhVar, zzejh zzejhVar, zzffn zzffnVar, zzffc zzffcVar, zzezf zzezfVar) {
        this.zza = zzejhVar;
        this.zzb = zzffnVar;
        this.zzc = zzffcVar;
        this.zzd = zzezfVar;
        this.zze = zzezhVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgal
    public final void zza(Throwable th) {
        zzexl zzexlVar;
        final com.google.android.gms.ads.internal.client.zze zza;
        zzeyx zzeyxVar;
        zzdmn zzk;
        zzffq zzffqVar;
        zzffn zzffnVar;
        Executor executor;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbbm.zzfH)).booleanValue()) {
            com.google.android.gms.ads.internal.util.zze.zzb("Rewarded ad failed to load", th);
        }
        zzexlVar = this.zze.zze;
        zzdmo zzdmoVar = (zzdmo) zzexlVar.zzd();
        if (zzdmoVar == null) {
            zza = zzfbq.zzb(th, null);
        } else {
            zza = zzdmoVar.zzb().zza(th);
        }
        synchronized (this.zze) {
            if (zzdmoVar != null) {
                zzdmoVar.zza().zzdz(zza);
                executor = this.zze.zzb;
                executor.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzezc
                    @Override // java.lang.Runnable
                    public final void run() {
                        zzeyx zzeyxVar2;
                        zzeyxVar2 = zzeze.this.zze.zzd;
                        zzeyxVar2.zzdz(zza);
                    }
                });
            } else {
                zzeyxVar = this.zze.zzd;
                zzeyxVar.zzdz(zza);
                zzk = this.zze.zzk(this.zzd);
                zzk.zze().zzb().zzc().zzh();
            }
            zzfbm.zzb(zza.zza, th, "RewardedAdLoader.onFailure");
            this.zza.zza();
            if (((Boolean) zzbdf.zzc.zze()).booleanValue() && (zzffnVar = this.zzb) != null) {
                zzffnVar.zzc(zza);
                zzffc zzffcVar = this.zzc;
                zzffcVar.zzh(th);
                zzffcVar.zzg(false);
                zzffnVar.zza(zzffcVar);
                zzffnVar.zzh();
            } else {
                zzffqVar = this.zze.zzg;
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
        zzeyx zzeyxVar;
        Executor executor;
        final zzeyx zzeyxVar2;
        zzeyx zzeyxVar3;
        zzffq zzffqVar;
        zzffn zzffnVar;
        zzdmj zzdmjVar = (zzdmj) obj;
        synchronized (this.zze) {
            zzcyl zzn = zzdmjVar.zzn();
            zzeyxVar = this.zze.zzd;
            zzn.zzd(zzeyxVar);
            this.zza.zzb(zzdmjVar);
            zzezh zzezhVar = this.zze;
            executor = zzezhVar.zzb;
            zzeyxVar2 = zzezhVar.zzd;
            Objects.requireNonNull(zzeyxVar2);
            executor.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzezd
                @Override // java.lang.Runnable
                public final void run() {
                    zzeyx.this.zzs();
                }
            });
            zzeyxVar3 = this.zze.zzd;
            zzeyxVar3.onAdMetadataChanged();
            if (((Boolean) zzbdf.zzc.zze()).booleanValue() && (zzffnVar = this.zzb) != null) {
                zzffnVar.zzg(zzdmjVar.zzp().zzb);
                zzffnVar.zze(zzdmjVar.zzl().zzg());
                zzffc zzffcVar = this.zzc;
                zzffcVar.zzg(true);
                zzffnVar.zza(zzffcVar);
                zzffnVar.zzh();
            } else {
                zzffqVar = this.zze.zzg;
                zzffc zzffcVar2 = this.zzc;
                zzffcVar2.zzb(zzdmjVar.zzp().zzb);
                zzffcVar2.zzd(zzdmjVar.zzl().zzg());
                zzffcVar2.zzg(true);
                zzffqVar.zzc(zzffcVar2.zzm());
            }
        }
    }
}
