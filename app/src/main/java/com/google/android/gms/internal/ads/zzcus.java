package com.google.android.gms.internal.ads;

import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzcus extends zzczv implements zzcuj {
    private final ScheduledExecutorService zzb;
    private ScheduledFuture zzc;
    private boolean zzd;

    public zzcus(zzcur zzcurVar, Set set, Executor executor, ScheduledExecutorService scheduledExecutorService) {
        super(set);
        this.zzd = false;
        this.zzb = scheduledExecutorService;
        super.zzo(zzcurVar, executor);
    }

    public static /* synthetic */ void zzd(zzcus zzcusVar) {
        synchronized (zzcusVar) {
            int i10 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzg("Timeout waiting for show call succeed to be called.");
            zzcusVar.zzc(new zzden("Timeout for show call succeed."));
            zzcusVar.zzd = true;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcuj
    public final void zza(final com.google.android.gms.ads.internal.client.zze zzeVar) {
        zzq(new zzczu() { // from class: com.google.android.gms.internal.ads.zzcuk
            @Override // com.google.android.gms.internal.ads.zzczu
            public final void zza(Object obj) {
                ((zzcuj) obj).zza(com.google.android.gms.ads.internal.client.zze.this);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzcuj
    public final void zzb() {
        zzq(new zzczu() { // from class: com.google.android.gms.internal.ads.zzcul
            @Override // com.google.android.gms.internal.ads.zzczu
            public final void zza(Object obj) {
                ((zzcuj) obj).zzb();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzcuj
    public final void zzc(final zzden zzdenVar) {
        if (this.zzd) {
            return;
        }
        ScheduledFuture scheduledFuture = this.zzc;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(true);
        }
        zzq(new zzczu() { // from class: com.google.android.gms.internal.ads.zzcun
            @Override // com.google.android.gms.internal.ads.zzczu
            public final void zza(Object obj) {
                ((zzcuj) obj).zzc(zzden.this);
            }
        });
    }

    public final synchronized void zze() {
        ScheduledFuture scheduledFuture = this.zzc;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(true);
        }
    }

    public final void zzf() {
        int intValue = ((Integer) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbbm.zzkE)).intValue();
        this.zzc = this.zzb.schedule(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcum
            @Override // java.lang.Runnable
            public final void run() {
                zzcus.zzd(zzcus.this);
            }
        }, intValue, TimeUnit.MILLISECONDS);
    }
}
