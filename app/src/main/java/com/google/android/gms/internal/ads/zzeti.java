package com.google.android.gms.internal.ads;

import java.util.concurrent.ScheduledExecutorService;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzeti implements zzhdk {
    private final zzhdt zza;
    private final zzhdt zzb;
    private final zzhdt zzc;

    public zzeti(zzhdt zzhdtVar, zzhdt zzhdtVar2, zzhdt zzhdtVar3, zzhdt zzhdtVar4, zzhdt zzhdtVar5) {
        this.zza = zzhdtVar;
        this.zzb = zzhdtVar3;
        this.zzc = zzhdtVar4;
    }

    public static zzetg zza(String str, zzazn zzaznVar, zzbyf zzbyfVar, ScheduledExecutorService scheduledExecutorService, zzgba zzgbaVar) {
        return new zzetg(str, zzaznVar, zzbyfVar, scheduledExecutorService, zzgbaVar);
    }

    @Override // com.google.android.gms.internal.ads.zzheb, com.google.android.gms.internal.ads.zzhea
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzetg(((zzeud) this.zza).zza(), zzcjd.zza(), (zzbyf) this.zzb.zzb(), (ScheduledExecutorService) this.zzc.zzb(), zzfdn.zzc());
    }
}
