package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Clock;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzfig {
    private final Object zza;
    private final long zzb;
    private final Clock zzc;
    private final long zzd = ((Long) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbbm.zzA)).longValue() * 1000;

    public zzfig(Object obj, Clock clock) {
        this.zza = obj;
        this.zzc = clock;
        this.zzb = clock.a();
    }

    public final long zza() {
        return (this.zzd + Math.min(Math.max(((Long) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbbm.zzv)).longValue(), -900000L), 10000L)) - (this.zzc.a() - this.zzb);
    }

    public final Object zzb() {
        return this.zza;
    }

    public final boolean zzc() {
        return this.zzc.a() >= this.zzb + this.zzd;
    }
}
