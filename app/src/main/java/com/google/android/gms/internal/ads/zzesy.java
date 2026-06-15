package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzesy implements zzhdk {
    private final zzhdt zza;
    private final zzhdt zzb;
    private final zzhdt zzc;
    private final zzhdt zzd;
    private final zzhdt zze;

    public zzesy(zzhdt zzhdtVar, zzhdt zzhdtVar2, zzhdt zzhdtVar3, zzhdt zzhdtVar4, zzhdt zzhdtVar5, zzhdt zzhdtVar6, zzhdt zzhdtVar7) {
        this.zza = zzhdtVar2;
        this.zzb = zzhdtVar3;
        this.zzc = zzhdtVar5;
        this.zzd = zzhdtVar6;
        this.zze = zzhdtVar7;
    }

    public static zzesw zza(zzbxw zzbxwVar, Context context, ScheduledExecutorService scheduledExecutorService, Executor executor, int i10, boolean z10, boolean z11) {
        return new zzesw(zzbxwVar, context, scheduledExecutorService, executor, i10, z10, z11);
    }

    @Override // com.google.android.gms.internal.ads.zzheb, com.google.android.gms.internal.ads.zzhea
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzesw(zzcjl.zza(), ((zzcfx) this.zza).zza(), (ScheduledExecutorService) this.zzb.zzb(), zzfdn.zzc(), ((zzeue) this.zzc).zzb().intValue(), ((zzeuf) this.zzd).zzb().booleanValue(), ((zzeuh) this.zze).zzb().booleanValue());
    }
}
