package com.google.android.gms.internal.ads;

import android.os.Process;
import java.util.concurrent.BlockingQueue;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzaob extends Thread {
    private static final boolean zza = zzapb.zzb;
    private final BlockingQueue zzb;
    private final BlockingQueue zzc;
    private final zzanz zzd;
    private volatile boolean zze = false;
    private final zzapc zzf;
    private final zzaog zzg;

    public zzaob(BlockingQueue blockingQueue, BlockingQueue blockingQueue2, zzanz zzanzVar, zzaog zzaogVar) {
        this.zzb = blockingQueue;
        this.zzc = blockingQueue2;
        this.zzd = zzanzVar;
        this.zzg = zzaogVar;
        this.zzf = new zzapc(this, blockingQueue2, zzaogVar);
    }

    private void zzc() throws InterruptedException {
        zzaop zzaopVar = (zzaop) this.zzb.take();
        zzaopVar.zzm("cache-queue-take");
        zzaopVar.zzt(1);
        try {
            zzaopVar.zzw();
            zzany zza2 = this.zzd.zza(zzaopVar.zzj());
            if (zza2 == null) {
                zzaopVar.zzm("cache-miss");
                if (!this.zzf.zzc(zzaopVar)) {
                    this.zzc.put(zzaopVar);
                }
            } else {
                long currentTimeMillis = System.currentTimeMillis();
                if (zza2.zza(currentTimeMillis)) {
                    zzaopVar.zzm("cache-hit-expired");
                    zzaopVar.zze(zza2);
                    if (!this.zzf.zzc(zzaopVar)) {
                        this.zzc.put(zzaopVar);
                    }
                } else {
                    zzaopVar.zzm("cache-hit");
                    zzaov zzh = zzaopVar.zzh(new zzaol(zza2.zza, zza2.zzg));
                    zzaopVar.zzm("cache-hit-parsed");
                    if (!zzh.zzc()) {
                        zzaopVar.zzm("cache-parsing-failed");
                        this.zzd.zzc(zzaopVar.zzj(), true);
                        zzaopVar.zze(null);
                        if (!this.zzf.zzc(zzaopVar)) {
                            this.zzc.put(zzaopVar);
                        }
                    } else if (zza2.zzf < currentTimeMillis) {
                        zzaopVar.zzm("cache-hit-refresh-needed");
                        zzaopVar.zze(zza2);
                        zzh.zzd = true;
                        if (!this.zzf.zzc(zzaopVar)) {
                            this.zzg.zzb(zzaopVar, zzh, new zzaoa(this, zzaopVar));
                        } else {
                            this.zzg.zzb(zzaopVar, zzh, null);
                        }
                    } else {
                        this.zzg.zzb(zzaopVar, zzh, null);
                    }
                }
            }
        } finally {
            zzaopVar.zzt(2);
        }
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        if (zza) {
            zzapb.zzd("start new dispatcher", new Object[0]);
        }
        Process.setThreadPriority(10);
        this.zzd.zzb();
        while (true) {
            try {
                zzc();
            } catch (InterruptedException unused) {
                if (this.zze) {
                    Thread.currentThread().interrupt();
                    return;
                }
                zzapb.zzb("Ignoring spurious interrupt of CacheDispatcher thread; use quit() to terminate it", new Object[0]);
            }
        }
    }

    public final void zzb() {
        this.zze = true;
        interrupt();
    }
}
