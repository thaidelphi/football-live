package com.google.android.gms.internal.ads;

import java.util.concurrent.ScheduledExecutorService;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzdvp implements zzhdk {
    private final zzhdt zza;
    private final zzhdt zzb;
    private final zzhdt zzc;
    private final zzhdt zzd;
    private final zzhdt zze;
    private final zzhdt zzf;

    public zzdvp(zzhdt zzhdtVar, zzhdt zzhdtVar2, zzhdt zzhdtVar3, zzhdt zzhdtVar4, zzhdt zzhdtVar5, zzhdt zzhdtVar6, zzhdt zzhdtVar7) {
        this.zza = zzhdtVar;
        this.zzb = zzhdtVar2;
        this.zzc = zzhdtVar3;
        this.zzd = zzhdtVar5;
        this.zze = zzhdtVar6;
        this.zzf = zzhdtVar7;
    }

    @Override // com.google.android.gms.internal.ads.zzheb, com.google.android.gms.internal.ads.zzhea
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzdvo(((zzcfx) this.zza).zza(), ((zzctw) this.zzb).zza(), ((zzduq) this.zzc).zzb(), zzfdn.zzc(), (ScheduledExecutorService) this.zzd.zzb(), (zzdyq) this.zze.zzb(), (zzffn) this.zzf.zzb());
    }
}
