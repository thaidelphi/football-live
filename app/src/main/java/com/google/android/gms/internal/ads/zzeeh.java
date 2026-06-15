package com.google.android.gms.internal.ads;

import java.util.concurrent.ScheduledExecutorService;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzeeh implements zzhdk {
    private final zzhdt zza;
    private final zzhdt zzb;
    private final zzhdt zzc;
    private final zzhdt zzd;

    public zzeeh(zzhdt zzhdtVar, zzhdt zzhdtVar2, zzhdt zzhdtVar3, zzhdt zzhdtVar4, zzhdt zzhdtVar5) {
        this.zza = zzhdtVar2;
        this.zzb = zzhdtVar3;
        this.zzc = zzhdtVar4;
        this.zzd = zzhdtVar5;
    }

    @Override // com.google.android.gms.internal.ads.zzheb, com.google.android.gms.internal.ads.zzhea
    /* renamed from: zza */
    public final zzeef zzb() {
        return new zzeef(zzfdn.zzc(), (ScheduledExecutorService) this.zza.zzb(), (zzcpo) this.zzb.zzb(), (zzeev) this.zzc.zzb(), (zzfhk) this.zzd.zzb());
    }
}
