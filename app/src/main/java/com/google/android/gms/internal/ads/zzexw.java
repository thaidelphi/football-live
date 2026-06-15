package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzexw implements zzgal {
    final /* synthetic */ zzejh zza;
    final /* synthetic */ zzffn zzb;
    final /* synthetic */ zzffc zzc;
    final /* synthetic */ zzdeg zzd;
    final /* synthetic */ zzexx zze;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzexw(zzexx zzexxVar, zzejh zzejhVar, zzffn zzffnVar, zzffc zzffcVar, zzdeg zzdegVar) {
        this.zza = zzejhVar;
        this.zzb = zzffnVar;
        this.zzc = zzffcVar;
        this.zzd = zzdegVar;
        this.zze = zzexxVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgal
    public final void zza(Throwable th) {
        zzffq zzffqVar;
        zzffn zzffnVar;
        Executor executor;
        Executor executor2;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbbm.zzfH)).booleanValue()) {
            com.google.android.gms.ads.internal.util.zze.zzb("Interstitial ad failed to load", th);
        }
        final com.google.android.gms.ads.internal.client.zze zza = this.zzd.zza().zza(th);
        synchronized (this.zze) {
            this.zze.zzi = null;
            this.zzd.zzb().zzdz(zza);
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbbm.zzie)).booleanValue()) {
                executor = this.zze.zzb;
                executor.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzexs
                    @Override // java.lang.Runnable
                    public final void run() {
                        zzeis zzeisVar;
                        zzeisVar = zzexw.this.zze.zzd;
                        zzeisVar.zzdz(zza);
                    }
                });
                executor2 = this.zze.zzb;
                executor2.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzext
                    @Override // java.lang.Runnable
                    public final void run() {
                        zzeyx zzeyxVar;
                        zzeyxVar = zzexw.this.zze.zze;
                        zzeyxVar.zzdz(zza);
                    }
                });
            }
            zzfbm.zzb(zza.zza, th, "InterstitialAdLoader.onFailure");
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
        zzffq zzffqVar;
        zzffn zzffnVar;
        Executor executor;
        Executor executor2;
        zzeis zzeisVar;
        zzeyx zzeyxVar;
        zzddc zzddcVar = (zzddc) obj;
        synchronized (this.zze) {
            this.zze.zzi = null;
            zzbbd zzbbdVar = zzbbm.zzie;
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbbdVar)).booleanValue()) {
                zzcyl zzn = zzddcVar.zzn();
                zzeisVar = this.zze.zzd;
                zzn.zza(zzeisVar);
                zzeyxVar = this.zze.zze;
                zzn.zzd(zzeyxVar);
            }
            this.zza.zzb(zzddcVar);
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbbdVar)).booleanValue()) {
                executor = this.zze.zzb;
                executor.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzexu
                    @Override // java.lang.Runnable
                    public final void run() {
                        zzeis zzeisVar2;
                        zzeisVar2 = zzexw.this.zze.zzd;
                        zzeisVar2.zzs();
                    }
                });
                executor2 = this.zze.zzb;
                executor2.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzexv
                    @Override // java.lang.Runnable
                    public final void run() {
                        zzeyx zzeyxVar2;
                        zzeyxVar2 = zzexw.this.zze.zze;
                        zzeyxVar2.zzs();
                    }
                });
            }
            if (((Boolean) zzbdf.zzc.zze()).booleanValue() && (zzffnVar = this.zzb) != null) {
                zzffnVar.zzg(zzddcVar.zzp().zzb);
                zzffnVar.zze(zzddcVar.zzl().zzg());
                zzffc zzffcVar = this.zzc;
                zzffcVar.zzg(true);
                zzffnVar.zza(zzffcVar);
                zzffnVar.zzh();
            } else {
                zzffqVar = this.zze.zzg;
                zzffc zzffcVar2 = this.zzc;
                zzffcVar2.zzb(zzddcVar.zzp().zzb);
                zzffcVar2.zzd(zzddcVar.zzl().zzg());
                zzffcVar2.zzg(true);
                zzffqVar.zzc(zzffcVar2.zzm());
            }
        }
    }
}
