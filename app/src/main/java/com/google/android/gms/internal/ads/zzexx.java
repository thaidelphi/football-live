package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.util.Pair;
import java.util.concurrent.Executor;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzexx implements zzeji {
    private final Context zza;
    private final Executor zzb;
    private final zzcfq zzc;
    private final zzeis zzd;
    private final zzeyx zze;
    private zzbch zzf;
    private final zzffq zzg;
    private final zzfan zzh;
    private b6.a zzi;

    public zzexx(Context context, Executor executor, zzcfq zzcfqVar, zzeis zzeisVar, zzeyx zzeyxVar, zzfan zzfanVar) {
        this.zza = context;
        this.zzb = executor;
        this.zzc = zzcfqVar;
        this.zzd = zzeisVar;
        this.zzh = zzfanVar;
        this.zze = zzeyxVar;
        this.zzg = zzcfqVar.zzz();
    }

    @Override // com.google.android.gms.internal.ads.zzeji
    public final boolean zza() {
        b6.a aVar = this.zzi;
        return (aVar == null || aVar.isDone()) ? false : true;
    }

    @Override // com.google.android.gms.internal.ads.zzeji
    public final boolean zzb(com.google.android.gms.ads.internal.client.zzm zzmVar, String str, zzejg zzejgVar, zzejh zzejhVar) {
        zzdeg zzf;
        zzffn zzffnVar;
        if (str == null) {
            int i10 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzg("Ad unit ID should not be null for interstitial ad.");
            this.zzb.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzexr
                @Override // java.lang.Runnable
                public final void run() {
                    zzexx.this.zzd.zzdz(zzfbq.zzd(6, null, null));
                }
            });
            return false;
        } else if (zza()) {
            return false;
        } else {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbbm.zziQ)).booleanValue() && zzmVar.zzf) {
                this.zzc.zzl().zzo(true);
            }
            com.google.android.gms.ads.internal.client.zzr zzrVar = ((zzexq) zzejgVar).zza;
            Bundle zza = zzdpp.zza(new Pair(zzdpn.PUBLIC_API_CALL.zza(), Long.valueOf(zzmVar.zzz)), new Pair(zzdpn.DYNAMITE_ENTER.zza(), Long.valueOf(com.google.android.gms.ads.internal.zzv.zzC().a())));
            zzfan zzfanVar = this.zzh;
            zzfanVar.zzt(str);
            zzfanVar.zzs(zzrVar);
            zzfanVar.zzH(zzmVar);
            zzfanVar.zzA(zza);
            Context context = this.zza;
            zzfap zzJ = zzfanVar.zzJ();
            zzffc zzb = zzffb.zzb(context, zzffm.zzf(zzJ), 4, zzmVar);
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbbm.zzie)).booleanValue()) {
                zzdef zzg = this.zzc.zzg();
                zzctm zzctmVar = new zzctm();
                zzctmVar.zzf(this.zza);
                zzctmVar.zzk(zzJ);
                zzg.zze(zzctmVar.zzl());
                zzczw zzczwVar = new zzczw();
                zzczwVar.zzj(this.zzd, this.zzb);
                zzczwVar.zzk(this.zzd, this.zzb);
                zzg.zzd(zzczwVar.zzn());
                zzg.zzc(new zzehb(this.zzf));
                zzf = zzg.zzf();
            } else {
                zzczw zzczwVar2 = new zzczw();
                zzeyx zzeyxVar = this.zze;
                if (zzeyxVar != null) {
                    zzczwVar2.zze(zzeyxVar, this.zzb);
                    zzczwVar2.zzf(this.zze, this.zzb);
                    zzczwVar2.zzb(this.zze, this.zzb);
                }
                zzdef zzg2 = this.zzc.zzg();
                zzctm zzctmVar2 = new zzctm();
                zzctmVar2.zzf(this.zza);
                zzctmVar2.zzk(zzJ);
                zzg2.zze(zzctmVar2.zzl());
                zzczwVar2.zzj(this.zzd, this.zzb);
                zzczwVar2.zze(this.zzd, this.zzb);
                zzczwVar2.zzf(this.zzd, this.zzb);
                zzczwVar2.zzb(this.zzd, this.zzb);
                zzczwVar2.zza(this.zzd, this.zzb);
                zzczwVar2.zzl(this.zzd, this.zzb);
                zzczwVar2.zzk(this.zzd, this.zzb);
                zzczwVar2.zzi(this.zzd, this.zzb);
                zzczwVar2.zzc(this.zzd, this.zzb);
                zzg2.zzd(zzczwVar2.zzn());
                zzg2.zzc(new zzehb(this.zzf));
                zzf = zzg2.zzf();
            }
            zzdeg zzdegVar = zzf;
            if (((Boolean) zzbdf.zzc.zze()).booleanValue()) {
                zzffn zzf2 = zzdegVar.zzf();
                zzf2.zzi(4);
                zzf2.zzb(zzmVar.zzp);
                zzf2.zzf(zzmVar.zzm);
                zzffnVar = zzf2;
            } else {
                zzffnVar = null;
            }
            zzcqp zza2 = zzdegVar.zza();
            b6.a zzh = zza2.zzh(zza2.zzi());
            this.zzi = zzh;
            zzgap.zzr(zzh, new zzexw(this, zzejhVar, zzffnVar, zzb, zzdegVar), this.zzb);
            return true;
        }
    }

    public final void zzi(zzbch zzbchVar) {
        this.zzf = zzbchVar;
    }
}
