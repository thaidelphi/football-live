package com.google.android.gms.internal.ads;

import java.util.concurrent.ScheduledExecutorService;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzeol implements zzhdk {
    private final zzhdt zza;
    private final zzhdt zzb;

    public zzeol(zzhdt zzhdtVar, zzhdt zzhdtVar2) {
        this.zza = zzhdtVar;
        this.zzb = zzhdtVar2;
    }

    @Override // com.google.android.gms.internal.ads.zzheb, com.google.android.gms.internal.ads.zzhea
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzeqi(((zzeri) this.zza).zzb(), ((Integer) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbbm.zzlZ)).intValue(), (ScheduledExecutorService) this.zzb.zzb());
    }
}
