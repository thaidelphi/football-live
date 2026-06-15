package com.google.android.gms.internal.ads;

import java.util.concurrent.ScheduledExecutorService;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzdvk implements zzhdk {
    private final zzhdt zza;
    private final zzhdt zzb;
    private final zzhdt zzc;

    public zzdvk(zzhdt zzhdtVar, zzhdt zzhdtVar2, zzhdt zzhdtVar3, zzhdt zzhdtVar4, zzhdt zzhdtVar5) {
        this.zza = zzhdtVar;
        this.zzb = zzhdtVar4;
        this.zzc = zzhdtVar5;
    }

    @Override // com.google.android.gms.internal.ads.zzheb, com.google.android.gms.internal.ads.zzhea
    /* renamed from: zza */
    public final zzdvj zzb() {
        return new zzdvj((ScheduledExecutorService) this.zza.zzb(), zzfdn.zzc(), zzfdt.zzc(), ((zzdwf) this.zzb).zzb(), zzhdj.zza(this.zzc));
    }
}
