package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import android.util.Pair;
import java.util.concurrent.ScheduledExecutorService;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzejp implements zzeji {
    private final zzfan zza;
    private final zzcfq zzb;
    private final Context zzc;
    private final zzejf zzd;
    private final zzffq zze;
    private zzcqa zzf;

    public zzejp(zzcfq zzcfqVar, Context context, zzejf zzejfVar, zzfan zzfanVar) {
        this.zzb = zzcfqVar;
        this.zzc = context;
        this.zzd = zzejfVar;
        this.zza = zzfanVar;
        this.zze = zzcfqVar.zzz();
        zzfanVar.zzv(zzejfVar.zzd());
    }

    @Override // com.google.android.gms.internal.ads.zzeji
    public final boolean zza() {
        zzcqa zzcqaVar = this.zzf;
        return zzcqaVar != null && zzcqaVar.zzf();
    }

    @Override // com.google.android.gms.internal.ads.zzeji
    public final boolean zzb(com.google.android.gms.ads.internal.client.zzm zzmVar, String str, zzejg zzejgVar, zzejh zzejhVar) throws RemoteException {
        zzffn zzffnVar;
        com.google.android.gms.ads.internal.zzv.zzq();
        if (com.google.android.gms.ads.internal.util.zzs.zzI(this.zzc) && zzmVar.zzs == null) {
            int i10 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzg("Failed to load the ad because app ID is missing.");
            this.zzb.zzC().execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzejk
                @Override // java.lang.Runnable
                public final void run() {
                    zzejp.this.zzd.zza().zzdz(zzfbq.zzd(4, null, null));
                }
            });
            return false;
        } else if (str == null) {
            int i11 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzg("Ad unit ID should not be null for NativeAdLoader.");
            this.zzb.zzC().execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzejl
                @Override // java.lang.Runnable
                public final void run() {
                    zzejp.this.zzd.zza().zzdz(zzfbq.zzd(6, null, null));
                }
            });
            return false;
        } else {
            zzfbm.zza(this.zzc, zzmVar.zzf);
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbbm.zziQ)).booleanValue() && zzmVar.zzf) {
                this.zzb.zzl().zzo(true);
            }
            int i12 = ((zzejj) zzejgVar).zza;
            long a10 = com.google.android.gms.ads.internal.zzv.zzC().a();
            String zza = zzdpn.PUBLIC_API_CALL.zza();
            Long valueOf = Long.valueOf(a10);
            Bundle zza2 = zzdpp.zza(new Pair(zza, valueOf), new Pair(zzdpn.DYNAMITE_ENTER.zza(), valueOf));
            zzfan zzfanVar = this.zza;
            zzfanVar.zzH(zzmVar);
            zzfanVar.zzA(zza2);
            zzfanVar.zzC(i12);
            Context context = this.zzc;
            zzfap zzJ = zzfanVar.zzJ();
            zzffc zzb = zzffb.zzb(context, zzffm.zzf(zzJ), 8, zzmVar);
            com.google.android.gms.ads.internal.client.zzcl zzclVar = zzJ.zzn;
            if (zzclVar != null) {
                this.zzd.zzd().zzm(zzclVar);
            }
            zzdfb zzh = this.zzb.zzh();
            zzctm zzctmVar = new zzctm();
            zzctmVar.zzf(this.zzc);
            zzctmVar.zzk(zzJ);
            zzh.zzf(zzctmVar.zzl());
            zzczw zzczwVar = new zzczw();
            zzczwVar.zzk(this.zzd.zzd(), this.zzb.zzC());
            zzh.zze(zzczwVar.zzn());
            zzh.zzd(this.zzd.zzc());
            zzh.zzc(new zzcnb(null));
            zzdfc zzg = zzh.zzg();
            if (((Boolean) zzbdf.zzc.zze()).booleanValue()) {
                zzffn zzf = zzg.zzf();
                zzf.zzi(8);
                zzf.zzb(zzmVar.zzp);
                zzf.zzf(zzmVar.zzm);
                zzffnVar = zzf;
            } else {
                zzffnVar = null;
            }
            this.zzb.zzy().zzc(1);
            zzcfq zzcfqVar = this.zzb;
            zzgba zzc = zzfdn.zzc();
            ScheduledExecutorService zzD = zzcfqVar.zzD();
            zzcqp zza3 = zzg.zza();
            zzcqa zzcqaVar = new zzcqa(zzc, zzD, zza3.zzh(zza3.zzi()));
            this.zzf = zzcqaVar;
            zzcqaVar.zze(new zzejo(this, zzejhVar, zzffnVar, zzb, zzg));
            return true;
        }
    }
}
