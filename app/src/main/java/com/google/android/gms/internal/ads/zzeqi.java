package com.google.android.gms.internal.ads;

import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzeqi implements zzerw {
    private final zzerw zza;
    private final long zzb;
    private final ScheduledExecutorService zzc;

    public zzeqi(zzerw zzerwVar, long j10, ScheduledExecutorService scheduledExecutorService) {
        this.zza = zzerwVar;
        this.zzb = j10;
        this.zzc = scheduledExecutorService;
    }

    public static /* synthetic */ b6.a zzc(zzeqi zzeqiVar, Throwable th) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbbm.zzcq)).booleanValue()) {
            zzerw zzerwVar = zzeqiVar.zza;
            zzbyf zzp = com.google.android.gms.ads.internal.zzv.zzp();
            int zza = zzerwVar.zza();
            zzp.zzw(th, "OptionalSignalTimeout:" + zza);
        }
        return zzgap.zzh(null);
    }

    @Override // com.google.android.gms.internal.ads.zzerw
    public final int zza() {
        return this.zza.zza();
    }

    @Override // com.google.android.gms.internal.ads.zzerw
    public final b6.a zzb() {
        b6.a zzb = this.zza.zzb();
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbbm.zzcr)).booleanValue()) {
            timeUnit = TimeUnit.MICROSECONDS;
        }
        long j10 = this.zzb;
        if (j10 > 0) {
            zzb = zzgap.zzo(zzb, j10, timeUnit, this.zzc);
        }
        return zzgap.zzf(zzb, Throwable.class, new zzfzw() { // from class: com.google.android.gms.internal.ads.zzeqh
            @Override // com.google.android.gms.internal.ads.zzfzw
            public final b6.a zza(Object obj) {
                return zzeqi.zzc(zzeqi.this, (Throwable) obj);
            }
        }, zzbyp.zzg);
    }
}
