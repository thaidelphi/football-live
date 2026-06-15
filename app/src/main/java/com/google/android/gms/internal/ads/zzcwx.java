package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Clock;
import java.util.Collections;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzcwx extends zzczv {
    private final ScheduledExecutorService zzb;
    private final Clock zzc;
    private long zzd;
    private long zze;
    private long zzf;
    private long zzg;
    private boolean zzh;
    private ScheduledFuture zzi;
    private ScheduledFuture zzj;

    public zzcwx(ScheduledExecutorService scheduledExecutorService, Clock clock) {
        super(Collections.emptySet());
        this.zzd = -1L;
        this.zze = -1L;
        this.zzf = -1L;
        this.zzg = -1L;
        this.zzh = false;
        this.zzb = scheduledExecutorService;
        this.zzc = clock;
    }

    private final synchronized void zzf(long j10) {
        ScheduledFuture scheduledFuture = this.zzi;
        if (scheduledFuture != null && !scheduledFuture.isDone()) {
            this.zzi.cancel(false);
        }
        this.zzd = this.zzc.b() + j10;
        this.zzi = this.zzb.schedule(new zzcwu(this, null), j10, TimeUnit.MILLISECONDS);
    }

    private final synchronized void zzg(long j10) {
        ScheduledFuture scheduledFuture = this.zzj;
        if (scheduledFuture != null && !scheduledFuture.isDone()) {
            this.zzj.cancel(false);
        }
        this.zze = this.zzc.b() + j10;
        this.zzj = this.zzb.schedule(new zzcwv(this, null), j10, TimeUnit.MILLISECONDS);
    }

    public final synchronized void zza() {
        this.zzh = false;
        zzf(0L);
    }

    public final synchronized void zzb() {
        if (this.zzh) {
            return;
        }
        ScheduledFuture scheduledFuture = this.zzi;
        if (scheduledFuture != null && !scheduledFuture.isCancelled()) {
            this.zzi.cancel(false);
            this.zzf = this.zzd - this.zzc.b();
        } else {
            this.zzf = -1L;
        }
        ScheduledFuture scheduledFuture2 = this.zzj;
        if (scheduledFuture2 == null || scheduledFuture2.isCancelled()) {
            this.zzg = -1L;
        } else {
            this.zzj.cancel(false);
            this.zzg = this.zze - this.zzc.b();
        }
        this.zzh = true;
    }

    public final synchronized void zzc() {
        ScheduledFuture scheduledFuture;
        ScheduledFuture scheduledFuture2;
        if (this.zzh) {
            if (this.zzf > 0 && (scheduledFuture2 = this.zzi) != null && scheduledFuture2.isCancelled()) {
                zzf(this.zzf);
            }
            if (this.zzg > 0 && (scheduledFuture = this.zzj) != null && scheduledFuture.isCancelled()) {
                zzg(this.zzg);
            }
            this.zzh = false;
        }
    }

    public final synchronized void zzd(int i10) {
        com.google.android.gms.ads.internal.util.zze.zza("In scheduleRefresh: " + i10);
        if (i10 > 0) {
            long millis = TimeUnit.SECONDS.toMillis(i10);
            if (this.zzh) {
                long j10 = this.zzf;
                if (j10 <= 0 || millis >= j10) {
                    millis = j10;
                }
                this.zzf = millis;
                return;
            }
            long b10 = this.zzc.b();
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbbm.zznc)).booleanValue()) {
                long j11 = this.zzd;
                if (b10 >= j11 || j11 - b10 > millis) {
                    zzf(millis);
                }
            } else {
                long j12 = this.zzd;
                if (b10 > j12 || j12 - b10 > millis) {
                    zzf(millis);
                }
            }
        }
    }

    public final synchronized void zze(int i10) {
        com.google.android.gms.ads.internal.util.zze.zza("In scheduleShowRefreshedAd: " + i10);
        if (i10 > 0) {
            long millis = TimeUnit.SECONDS.toMillis(i10);
            if (this.zzh) {
                long j10 = this.zzg;
                if (j10 <= 0 || millis >= j10) {
                    millis = j10;
                }
                this.zzg = millis;
                return;
            }
            long b10 = this.zzc.b();
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbbm.zznc)).booleanValue()) {
                if (b10 == this.zze) {
                    com.google.android.gms.ads.internal.util.zze.zza("In scheduleShowRefreshedAd: currentTimeMs = scheduledShowTimeMs");
                }
                long j11 = this.zze;
                if (b10 >= j11 || j11 - b10 > millis) {
                    zzg(millis);
                }
            } else {
                long j12 = this.zze;
                if (b10 > j12 || j12 - b10 > millis) {
                    zzg(millis);
                }
            }
        }
    }
}
