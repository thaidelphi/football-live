package com.google.android.gms.internal.ads;

import com.google.android.gms.common.internal.Preconditions;
import java.util.Random;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzfhv {
    private final long zza;
    private final long zzb;
    private long zze;
    private long zzd = 5;
    private final Random zzf = new Random();
    private long zzc = 0;

    public zzfhv(long j10, double d10, long j11, double d11) {
        this.zza = j10;
        this.zzb = j11;
        zzc();
    }

    public final long zza() {
        double d10;
        long j10;
        double d11 = this.zze;
        return ((long) (d11 - (0.2d * d11))) + ((long) (this.zzf.nextDouble() * ((((long) (d11 + d10)) - j10) + 1)));
    }

    public final void zzb() {
        double d10 = this.zze;
        this.zze = Math.min((long) (d10 + d10), this.zzb);
        this.zzc++;
    }

    public final void zzc() {
        this.zze = this.zza;
        this.zzc = 0L;
    }

    public final synchronized void zzd(int i10) {
        Preconditions.a(i10 > 0);
        this.zzd = i10;
    }

    public final boolean zze() {
        return this.zzc > Math.max(this.zzd, (long) ((Integer) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbbm.zzz)).intValue()) && this.zze >= this.zzb;
    }
}
