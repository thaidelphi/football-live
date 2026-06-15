package com.google.android.gms.internal.ads;

import java.util.concurrent.ScheduledExecutorService;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzdvw implements zzhdk {
    private final zzhdt zza;
    private final zzhdt zzb;
    private final zzhdt zzc;
    private final zzhdt zzd;
    private final zzhdt zze;
    private final zzhdt zzf;
    private final zzhdt zzg;
    private final zzhdt zzh;

    public zzdvw(zzhdt zzhdtVar, zzhdt zzhdtVar2, zzhdt zzhdtVar3, zzhdt zzhdtVar4, zzhdt zzhdtVar5, zzhdt zzhdtVar6, zzhdt zzhdtVar7, zzhdt zzhdtVar8, zzhdt zzhdtVar9, zzhdt zzhdtVar10, zzhdt zzhdtVar11) {
        this.zza = zzhdtVar;
        this.zzb = zzhdtVar2;
        this.zzc = zzhdtVar3;
        this.zzd = zzhdtVar4;
        this.zze = zzhdtVar6;
        this.zzf = zzhdtVar7;
        this.zzg = zzhdtVar8;
        this.zzh = zzhdtVar11;
    }

    @Override // com.google.android.gms.internal.ads.zzheb, com.google.android.gms.internal.ads.zzhea
    /* renamed from: zza */
    public final zzdvv zzb() {
        return new zzdvv((zzcfq) this.zza.zzb(), ((zzcfx) this.zzb).zza(), ((zzcgl) this.zzc).zza(), ((zzctw) this.zzd).zza(), zzfdn.zzc(), (String) this.zze.zzb(), (zzffn) this.zzf.zzb(), (zzdpz) this.zzg.zzb(), zzcgv.zza(), zzcgs.zza(), (ScheduledExecutorService) this.zzh.zzb());
    }
}
