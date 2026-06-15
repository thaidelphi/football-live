package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Clock;
import java.util.concurrent.ScheduledExecutorService;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzcnd implements zzhdk {
    private final zzhdt zza;
    private final zzhdt zzb;

    public zzcnd(zzhdt zzhdtVar, zzhdt zzhdtVar2) {
        this.zza = zzhdtVar;
        this.zzb = zzhdtVar2;
    }

    public static zzcwx zzc(ScheduledExecutorService scheduledExecutorService, Clock clock) {
        return new zzcwx(scheduledExecutorService, clock);
    }

    @Override // com.google.android.gms.internal.ads.zzheb, com.google.android.gms.internal.ads.zzhea
    /* renamed from: zza */
    public final zzcwx zzb() {
        return zzc((ScheduledExecutorService) this.zza.zzb(), (Clock) this.zzb.zzb());
    }
}
