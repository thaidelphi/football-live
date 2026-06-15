package com.google.android.gms.internal.ads;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzdfi implements zzhdk {
    private final zzhdt zza;
    private final zzhdt zzb;
    private final zzhdt zzc;
    private final zzhdt zzd;
    private final zzhdt zze;
    private final zzhdt zzf;

    public zzdfi(zzhdt zzhdtVar, zzhdt zzhdtVar2, zzhdt zzhdtVar3, zzhdt zzhdtVar4, zzhdt zzhdtVar5, zzhdt zzhdtVar6) {
        this.zza = zzhdtVar;
        this.zzb = zzhdtVar2;
        this.zzc = zzhdtVar3;
        this.zzd = zzhdtVar4;
        this.zze = zzhdtVar5;
        this.zzf = zzhdtVar6;
    }

    @Override // com.google.android.gms.internal.ads.zzheb, com.google.android.gms.internal.ads.zzhea
    public final /* bridge */ /* synthetic */ Object zzb() {
        zzctm zza = ((zzctx) this.zzb).zza();
        zzczy zza2 = ((zzdas) this.zzc).zza();
        zzdex zza3 = ((zzdez) this.zzd).zza();
        zzcwx zzb = ((zzcnd) this.zze).zzb();
        zzeev zzeevVar = (zzeev) this.zzf.zzb();
        zzcoh zze = ((zzcfq) this.zza.zzb()).zze();
        zze.zzi(zza.zzl());
        zze.zzf(zza2);
        zze.zzd(zza3);
        zze.zze(new zzehb(null));
        zze.zzg(new zzcpd(zzb, null));
        zze.zzc(new zzcnb(null));
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbbm.zzdL)).booleanValue()) {
            zze.zzj(zzefe.zzb(zzeevVar));
        }
        zzcpo zzb2 = zze.zzk().zzb();
        zzhds.zzb(zzb2);
        return zzb2;
    }
}
