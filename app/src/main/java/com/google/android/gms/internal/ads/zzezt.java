package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Clock;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzezt {
    private final Clock zza;
    private final zzdqf zzb;
    private final Object zzc = new Object();
    private volatile int zze = 1;
    private volatile long zzd = 0;

    public zzezt(Clock clock, zzdqf zzdqfVar) {
        this.zza = clock;
        this.zzb = zzdqfVar;
    }

    private final void zze() {
        long a10 = this.zza.a();
        synchronized (this.zzc) {
            if (this.zze == 3) {
                if (this.zzd + ((Long) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbbm.zzfQ)).longValue() <= a10) {
                    this.zze = 1;
                }
            }
        }
    }

    private final void zzf(int i10, int i11) {
        zze();
        Object obj = this.zzc;
        long a10 = this.zza.a();
        synchronized (obj) {
            if (this.zze != i10) {
                return;
            }
            this.zze = i11;
            if (this.zze == 3) {
                this.zzd = a10;
            }
        }
    }

    public final void zza() {
        zzf(2, 3);
    }

    public final void zzb(boolean z10) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbbm.zzmT)).booleanValue()) {
            zzdqe zza = this.zzb.zza();
            zza.zzb("action", "mbs_state");
            zza.zzb("mbs_state", true != z10 ? "0" : "1");
            zza.zzj();
        }
        if (z10) {
            zzf(1, 2);
        } else {
            zzf(2, 1);
        }
    }

    public final boolean zzc() {
        boolean z10;
        synchronized (this.zzc) {
            zze();
            z10 = this.zze == 3;
        }
        return z10;
    }

    public final boolean zzd() {
        boolean z10;
        synchronized (this.zzc) {
            zze();
            z10 = this.zze == 2;
        }
        return z10;
    }
}
