package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public abstract class zzcfq implements zzcjp {
    private static zzcfq zza;

    private static synchronized zzcfq zzG(Context context, zzbod zzbodVar, int i10, boolean z10, int i11, zzcgw zzcgwVar) {
        synchronized (zzcfq.class) {
            zzcfq zzcfqVar = zza;
            if (zzcfqVar != null) {
                return zzcfqVar;
            }
            long a10 = com.google.android.gms.ads.internal.zzv.zzC().a();
            zzbbm.zza(context);
            if (((Boolean) zzbde.zze.zze()).booleanValue()) {
                zzbaw.zzd(context);
            }
            zzfbl zzd = zzfbl.zzd(context);
            VersionInfoParcel zzc = zzd.zzc(250505300, false, i11);
            zzd.zzf(zzbodVar);
            zzchl zzchlVar = new zzchl(null);
            zzcfr zzcfrVar = new zzcfr();
            zzcfrVar.zzf(zzc);
            zzcfrVar.zze(context);
            zzcfrVar.zzd(a10);
            zzchlVar.zzb(new zzcft(zzcfrVar, null));
            zzchlVar.zzc(new zzcif(zzcgwVar));
            zzcfq zza2 = zzchlVar.zza();
            com.google.android.gms.ads.internal.zzv.zzp().zzu(context, zzc);
            com.google.android.gms.ads.internal.zzv.zzc().zzi(context);
            com.google.android.gms.ads.internal.zzv.zzq().zzm(context);
            com.google.android.gms.ads.internal.zzv.zzq().zzl(context);
            com.google.android.gms.ads.internal.util.zzd.zza(context);
            com.google.android.gms.ads.internal.zzv.zzb().zzd(context);
            com.google.android.gms.ads.internal.zzv.zzw().zzb(context);
            zza2.zza().zzc();
            zzbxc.zzd(context);
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbbm.zzgc)).booleanValue()) {
                if (!((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbbm.zzaI)).booleanValue()) {
                    new zzdzh(context, zzc, new zzbak(new zzbaq(context)), new zzdym(new zzdyi(context), zza2.zzB())).zzb(com.google.android.gms.ads.internal.zzv.zzp().zzi().zzN());
                }
            }
            zza = zza2;
            return zza2;
        }
    }

    public static zzcfq zzb(Context context, zzbod zzbodVar, int i10) {
        return zzG(context, zzbodVar, 250505300, false, i10, new zzcgw());
    }

    public abstract zzfhy zzA();

    public abstract zzgba zzB();

    public abstract Executor zzC();

    public abstract ScheduledExecutorService zzD();

    public abstract zzbxu zzE();

    @Override // com.google.android.gms.internal.ads.zzcjp
    public final zzbxu zzF() {
        return zzE();
    }

    public abstract com.google.android.gms.ads.internal.util.zzcb zza();

    public abstract zzciq zzc();

    public abstract zzcmr zzd();

    public abstract zzcoh zze();

    public abstract zzcwx zzf();

    public abstract zzdef zzg();

    public abstract zzdfb zzh();

    public abstract zzdmn zzi();

    public abstract zzdqf zzj();

    public abstract zzdrp zzk();

    public abstract zzdte zzl();

    public abstract zzdub zzm();

    public abstract zzeaf zzn();

    public abstract com.google.android.gms.ads.nonagon.signalgeneration.zzv zzo();

    public abstract com.google.android.gms.ads.nonagon.signalgeneration.zzab zzp();

    public abstract com.google.android.gms.ads.nonagon.signalgeneration.zzau zzq();

    @Override // com.google.android.gms.internal.ads.zzcjp
    public final zzesz zzr(zzbud zzbudVar, int i10) {
        return zzs(new zzeuc(zzbudVar, i10));
    }

    protected abstract zzesz zzs(zzeuc zzeucVar);

    public abstract zzeuu zzt();

    public abstract zzewi zzu();

    public abstract zzexz zzv();

    public abstract zzezn zzw();

    public abstract zzfbe zzx();

    public abstract zzfbo zzy();

    public abstract zzffq zzz();
}
