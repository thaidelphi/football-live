package com.google.android.gms.internal.ads;

import java.util.List;
import java.util.concurrent.ScheduledExecutorService;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzeoe implements zzhdk {
    private final zzhdt zza;
    private final zzhdt zzb;
    private final zzhdt zzc;
    private final zzhdt zzd;

    public zzeoe(zzhdt zzhdtVar, zzhdt zzhdtVar2, zzhdt zzhdtVar3, zzhdt zzhdtVar4) {
        this.zza = zzhdtVar;
        this.zzb = zzhdtVar2;
        this.zzc = zzhdtVar3;
        this.zzd = zzhdtVar4;
    }

    @Override // com.google.android.gms.internal.ads.zzheb, com.google.android.gms.internal.ads.zzhea
    public final /* bridge */ /* synthetic */ Object zzb() {
        zzepl zzb = ((zzepn) this.zza).zzb();
        zzemo zzemoVar = (zzemo) this.zzb.zzb();
        ScheduledExecutorService scheduledExecutorService = (ScheduledExecutorService) this.zzd.zzb();
        if (((List) this.zzc.zzb()).contains("60")) {
            return new zzeqi(zzemoVar, ((Integer) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbbm.zzmI)).intValue(), scheduledExecutorService);
        }
        return new zzeqi(zzb, ((Integer) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbbm.zzmI)).intValue(), scheduledExecutorService);
    }
}
