package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzcta implements zzcuf, zzdbj, zzcyz, zzcuv, zzaxl {
    private final zzcux zza;
    private final zzezu zzb;
    private final ScheduledExecutorService zzc;
    private final Executor zzd;
    private ScheduledFuture zzf;
    private final String zzh;
    private final zzgbj zze = zzgbj.zze();
    private final AtomicBoolean zzg = new AtomicBoolean();

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzcta(zzcux zzcuxVar, zzezu zzezuVar, ScheduledExecutorService scheduledExecutorService, Executor executor, String str) {
        this.zza = zzcuxVar;
        this.zzb = zzezuVar;
        this.zzc = scheduledExecutorService;
        this.zzd = executor;
        this.zzh = str;
    }

    public static /* synthetic */ void zzh(zzcta zzctaVar) {
        synchronized (zzctaVar) {
            if (zzctaVar.zze.isDone()) {
                return;
            }
            zzctaVar.zze.zzc(Boolean.TRUE);
        }
    }

    private final boolean zzm() {
        return this.zzh.equals("com.google.ads.mediation.admob.AdMobAdapter");
    }

    @Override // com.google.android.gms.internal.ads.zzcuf
    public final void zza() {
    }

    @Override // com.google.android.gms.internal.ads.zzcuf
    public final void zzb() {
    }

    @Override // com.google.android.gms.internal.ads.zzcuf
    public final void zzc() {
        zzezu zzezuVar = this.zzb;
        if (zzezuVar.zze == 3) {
            return;
        }
        int i10 = zzezuVar.zzY;
        if (i10 == 0 || i10 == 1) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbbm.zzls)).booleanValue() && zzm()) {
                return;
            }
            this.zza.zza();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaxl
    public final void zzdn(zzaxk zzaxkVar) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbbm.zzls)).booleanValue() && zzm() && zzaxkVar.zzj && this.zzg.compareAndSet(false, true) && this.zzb.zze != 3) {
            com.google.android.gms.ads.internal.util.zze.zza("Full screen 1px impression occurred");
            this.zza.zza();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcuf
    public final void zzdq(zzbup zzbupVar, String str, String str2) {
    }

    @Override // com.google.android.gms.internal.ads.zzcuf
    public final void zze() {
    }

    @Override // com.google.android.gms.internal.ads.zzcuf
    public final void zzf() {
    }

    @Override // com.google.android.gms.internal.ads.zzcyz
    public final void zzi() {
    }

    @Override // com.google.android.gms.internal.ads.zzcyz
    public final synchronized void zzj() {
        if (this.zze.isDone()) {
            return;
        }
        ScheduledFuture scheduledFuture = this.zzf;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(true);
        }
        this.zze.zzc(Boolean.TRUE);
    }

    @Override // com.google.android.gms.internal.ads.zzdbj
    public final void zzk() {
        if (this.zzb.zze == 3) {
            return;
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbbm.zzbE)).booleanValue()) {
            zzezu zzezuVar = this.zzb;
            if (zzezuVar.zzY == 2) {
                if (zzezuVar.zzq == 0) {
                    this.zza.zza();
                    return;
                }
                zzgap.zzr(this.zze, new zzcsz(this), this.zzd);
                this.zzf = this.zzc.schedule(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcsy
                    @Override // java.lang.Runnable
                    public final void run() {
                        zzcta.zzh(zzcta.this);
                    }
                }, this.zzb.zzq, TimeUnit.MILLISECONDS);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdbj
    public final void zzl() {
    }

    @Override // com.google.android.gms.internal.ads.zzcuv
    public final synchronized void zzq(com.google.android.gms.ads.internal.client.zze zzeVar) {
        if (this.zze.isDone()) {
            return;
        }
        ScheduledFuture scheduledFuture = this.zzf;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(true);
        }
        this.zze.zzd(new Exception());
    }
}
