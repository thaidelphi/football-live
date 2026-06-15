package com.google.android.gms.internal.ads;

import java.util.concurrent.ScheduledExecutorService;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzeny implements zzhdk {
    private final zzhdt zza;

    public zzeny(zzhdt zzhdtVar, zzhdt zzhdtVar2) {
        this.zza = zzhdtVar2;
    }

    @Override // com.google.android.gms.internal.ads.zzheb, com.google.android.gms.internal.ads.zzhea
    public final /* bridge */ /* synthetic */ Object zzb() {
        zzfwa zzn;
        zzemq zza = zzems.zza();
        ScheduledExecutorService scheduledExecutorService = (ScheduledExecutorService) this.zza.zzb();
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbbm.zzeh)).booleanValue()) {
            zzn = zzfwa.zzo(new zzeqi(zza, ((Integer) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbbm.zzei)).intValue(), scheduledExecutorService));
        } else {
            zzn = zzfwa.zzn();
        }
        zzhds.zzb(zzn);
        return zzn;
    }
}
