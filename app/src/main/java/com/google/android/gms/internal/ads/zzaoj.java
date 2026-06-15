package com.google.android.gms.internal.ads;

import android.net.TrafficStats;
import android.os.Process;
import android.os.SystemClock;
import java.util.concurrent.BlockingQueue;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzaoj extends Thread {
    private final BlockingQueue zza;
    private final zzaoi zzb;
    private final zzanz zzc;
    private volatile boolean zzd = false;
    private final zzaog zze;

    public zzaoj(BlockingQueue blockingQueue, zzaoi zzaoiVar, zzanz zzanzVar, zzaog zzaogVar) {
        this.zza = blockingQueue;
        this.zzb = zzaoiVar;
        this.zzc = zzanzVar;
        this.zze = zzaogVar;
    }

    private void zzb() throws InterruptedException {
        zzaop zzaopVar = (zzaop) this.zza.take();
        SystemClock.elapsedRealtime();
        zzaopVar.zzt(3);
        try {
            try {
                zzaopVar.zzm("network-queue-take");
                zzaopVar.zzw();
                TrafficStats.setThreadStatsTag(zzaopVar.zzc());
                zzaol zza = this.zzb.zza(zzaopVar);
                zzaopVar.zzm("network-http-complete");
                if (zza.zze && zzaopVar.zzv()) {
                    zzaopVar.zzp("not-modified");
                    zzaopVar.zzr();
                } else {
                    zzaov zzh = zzaopVar.zzh(zza);
                    zzaopVar.zzm("network-parse-complete");
                    if (zzh.zzb != null) {
                        this.zzc.zzd(zzaopVar.zzj(), zzh.zzb);
                        zzaopVar.zzm("network-cache-written");
                    }
                    zzaopVar.zzq();
                    this.zze.zzb(zzaopVar, zzh, null);
                    zzaopVar.zzs(zzh);
                }
            } catch (zzaoy e8) {
                SystemClock.elapsedRealtime();
                this.zze.zza(zzaopVar, e8);
                zzaopVar.zzr();
            } catch (Exception e10) {
                zzapb.zzc(e10, "Unhandled exception %s", e10.toString());
                zzaoy zzaoyVar = new zzaoy(e10);
                SystemClock.elapsedRealtime();
                this.zze.zza(zzaopVar, zzaoyVar);
                zzaopVar.zzr();
            }
        } finally {
            zzaopVar.zzt(4);
        }
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        Process.setThreadPriority(10);
        while (true) {
            try {
                zzb();
            } catch (InterruptedException unused) {
                if (this.zzd) {
                    Thread.currentThread().interrupt();
                    return;
                }
                zzapb.zzb("Ignoring spurious interrupt of NetworkDispatcher thread; use quit() to terminate it", new Object[0]);
            }
        }
    }

    public final void zza() {
        this.zzd = true;
        interrupt();
    }
}
