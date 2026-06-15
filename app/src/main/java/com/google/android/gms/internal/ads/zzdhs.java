package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzdhs implements zzhdk {
    private final zzhdt zza;
    private final zzhdt zzb;
    private final zzhdt zzc;
    private final zzhdt zzd;
    private final zzhdt zze;
    private final zzhdt zzf;
    private final zzhdt zzg;
    private final zzhdt zzh;

    public zzdhs(zzhdt zzhdtVar, zzhdt zzhdtVar2, zzhdt zzhdtVar3, zzhdt zzhdtVar4, zzhdt zzhdtVar5, zzhdt zzhdtVar6, zzhdt zzhdtVar7, zzhdt zzhdtVar8, zzhdt zzhdtVar9) {
        this.zza = zzhdtVar;
        this.zzb = zzhdtVar2;
        this.zzc = zzhdtVar3;
        this.zzd = zzhdtVar4;
        this.zze = zzhdtVar5;
        this.zzf = zzhdtVar6;
        this.zzg = zzhdtVar7;
        this.zzh = zzhdtVar9;
    }

    @Override // com.google.android.gms.internal.ads.zzheb, com.google.android.gms.internal.ads.zzhea
    /* renamed from: zza */
    public final zzdhr zzb() {
        return new zzdhr(((zzcfu) this.zza).zzb(), ((zzctw) this.zzb).zza(), (zzdgw) this.zzc.zzb(), ((zzdhk) this.zzd).zza(), (zzdif) this.zze.zzb(), (zzdin) this.zzf.zzb(), (Executor) this.zzg.zzb(), zzfdn.zzc(), (zzdgo) this.zzh.zzb());
    }
}
