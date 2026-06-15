package com.google.android.gms.internal.ads;

import java.util.List;
import java.util.concurrent.ScheduledExecutorService;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzeog implements zzhdk {
    private final zzhdt zza;
    private final zzhdt zzb;
    private final zzhdt zzc;

    public zzeog(zzhdt zzhdtVar, zzhdt zzhdtVar2, zzhdt zzhdtVar3, zzhdt zzhdtVar4) {
        this.zza = zzhdtVar2;
        this.zzb = zzhdtVar3;
        this.zzc = zzhdtVar4;
    }

    @Override // com.google.android.gms.internal.ads.zzheb, com.google.android.gms.internal.ads.zzhea
    public final /* bridge */ /* synthetic */ Object zzb() {
        zzept zza = zzepv.zza();
        zzemo zzemoVar = (zzemo) this.zza.zzb();
        ScheduledExecutorService scheduledExecutorService = (ScheduledExecutorService) this.zzc.zzb();
        if (((List) this.zzb.zzb()).contains("24")) {
            return new zzeqi(zzemoVar, ((Integer) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbbm.zzmd)).intValue(), scheduledExecutorService);
        }
        return new zzeqi(zza, ((Integer) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbbm.zzmd)).intValue(), scheduledExecutorService);
    }
}
