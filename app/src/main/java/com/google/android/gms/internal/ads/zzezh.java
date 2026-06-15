package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import android.util.Pair;
import java.util.concurrent.Executor;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzezh implements zzeji {
    private final Context zza;
    private final Executor zzb;
    private final zzcfq zzc;
    private final zzeyx zzd;
    private final zzexl zze;
    private final zzfah zzf;
    private final zzffq zzg;
    private final zzfan zzh;
    private b6.a zzi;

    public zzezh(Context context, Executor executor, zzcfq zzcfqVar, zzexl zzexlVar, zzeyx zzeyxVar, zzfan zzfanVar, zzfah zzfahVar) {
        this.zza = context;
        this.zzb = executor;
        this.zzc = zzcfqVar;
        this.zze = zzexlVar;
        this.zzd = zzeyxVar;
        this.zzh = zzfanVar;
        this.zzf = zzfahVar;
        this.zzg = zzcfqVar.zzz();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final zzdmn zzk(zzexj zzexjVar) {
        zzdmn zzi = this.zzc.zzi();
        zzctm zzctmVar = new zzctm();
        zzctmVar.zzf(this.zza);
        zzctmVar.zzk(((zzezf) zzexjVar).zza);
        zzctmVar.zzj(this.zzf);
        zzi.zzd(zzctmVar.zzl());
        zzi.zzc(new zzczw().zzn());
        return zzi;
    }

    @Override // com.google.android.gms.internal.ads.zzeji
    public final boolean zza() {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzeji
    public final boolean zzb(com.google.android.gms.ads.internal.client.zzm zzmVar, String str, zzejg zzejgVar, zzejh zzejhVar) throws RemoteException {
        zzffn zzffnVar;
        zzbuw zzbuwVar = new zzbuw(zzmVar, str);
        zzeyz zzeyzVar = (zzeyz) zzejgVar;
        if (zzbuwVar.zzb == null) {
            int i10 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzg("Ad unit ID should not be null for rewarded video ad.");
            this.zzb.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzeza
                @Override // java.lang.Runnable
                public final void run() {
                    zzezh.this.zzd.zzdz(zzfbq.zzd(6, null, null));
                }
            });
        } else {
            b6.a aVar = this.zzi;
            if (aVar == null || aVar.isDone()) {
                if (((Boolean) zzbdf.zzc.zze()).booleanValue()) {
                    zzexl zzexlVar = this.zze;
                    if (zzexlVar.zzd() != null) {
                        zzffn zzh = ((zzdmo) zzexlVar.zzd()).zzh();
                        zzh.zzi(5);
                        zzh.zzb(zzbuwVar.zza.zzp);
                        zzh.zzf(zzbuwVar.zza.zzm);
                        zzffnVar = zzh;
                        zzfbm.zza(this.zza, zzbuwVar.zza.zzf);
                        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbbm.zziQ)).booleanValue() && zzbuwVar.zza.zzf) {
                            this.zzc.zzl().zzo(true);
                        }
                        Bundle zza = zzdpp.zza(new Pair(zzdpn.PUBLIC_API_CALL.zza(), Long.valueOf(zzbuwVar.zza.zzz)), new Pair(zzdpn.DYNAMITE_ENTER.zza(), Long.valueOf(com.google.android.gms.ads.internal.zzv.zzC().a())));
                        zzfan zzfanVar = this.zzh;
                        zzfanVar.zzt(zzbuwVar.zzb);
                        zzfanVar.zzs(com.google.android.gms.ads.internal.client.zzr.zzd());
                        zzfanVar.zzH(zzbuwVar.zza);
                        zzfanVar.zzA(zza);
                        Context context = this.zza;
                        zzfap zzJ = zzfanVar.zzJ();
                        zzffc zzb = zzffb.zzb(context, zzffm.zzf(zzJ), 5, zzbuwVar.zza);
                        zzezf zzezfVar = new zzezf(null);
                        zzezfVar.zza = zzJ;
                        b6.a zzc = this.zze.zzc(new zzexm(zzezfVar, null), new zzexk() { // from class: com.google.android.gms.internal.ads.zzezb
                            @Override // com.google.android.gms.internal.ads.zzexk
                            public final zzctk zza(zzexj zzexjVar) {
                                zzdmn zzk;
                                zzk = zzezh.this.zzk(zzexjVar);
                                return zzk;
                            }
                        }, null);
                        this.zzi = zzc;
                        zzgap.zzr(zzc, new zzeze(this, zzejhVar, zzffnVar, zzb, zzezfVar), this.zzb);
                        return true;
                    }
                }
                zzffnVar = null;
                zzfbm.zza(this.zza, zzbuwVar.zza.zzf);
                if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbbm.zziQ)).booleanValue()) {
                    this.zzc.zzl().zzo(true);
                }
                Bundle zza2 = zzdpp.zza(new Pair(zzdpn.PUBLIC_API_CALL.zza(), Long.valueOf(zzbuwVar.zza.zzz)), new Pair(zzdpn.DYNAMITE_ENTER.zza(), Long.valueOf(com.google.android.gms.ads.internal.zzv.zzC().a())));
                zzfan zzfanVar2 = this.zzh;
                zzfanVar2.zzt(zzbuwVar.zzb);
                zzfanVar2.zzs(com.google.android.gms.ads.internal.client.zzr.zzd());
                zzfanVar2.zzH(zzbuwVar.zza);
                zzfanVar2.zzA(zza2);
                Context context2 = this.zza;
                zzfap zzJ2 = zzfanVar2.zzJ();
                zzffc zzb2 = zzffb.zzb(context2, zzffm.zzf(zzJ2), 5, zzbuwVar.zza);
                zzezf zzezfVar2 = new zzezf(null);
                zzezfVar2.zza = zzJ2;
                b6.a zzc2 = this.zze.zzc(new zzexm(zzezfVar2, null), new zzexk() { // from class: com.google.android.gms.internal.ads.zzezb
                    @Override // com.google.android.gms.internal.ads.zzexk
                    public final zzctk zza(zzexj zzexjVar) {
                        zzdmn zzk;
                        zzk = zzezh.this.zzk(zzexjVar);
                        return zzk;
                    }
                }, null);
                this.zzi = zzc2;
                zzgap.zzr(zzc2, new zzeze(this, zzejhVar, zzffnVar, zzb2, zzezfVar2), this.zzb);
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zzj(int i10) {
        this.zzh.zzp().zza(i10);
    }
}
