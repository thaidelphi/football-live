package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Clock;
import com.ironsource.fe;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzemo implements zzerw {
    private final AtomicReference zza = new AtomicReference();
    private final AtomicReference zzb = new AtomicReference(Boolean.FALSE);
    private final Clock zzc;
    private final Executor zzd;
    private final zzerw zze;
    private final long zzf;
    private final zzdqf zzg;

    public zzemo(zzerw zzerwVar, long j10, Clock clock, Executor executor, zzdqf zzdqfVar) {
        this.zzc = clock;
        this.zze = zzerwVar;
        this.zzf = j10;
        this.zzd = executor;
        this.zzg = zzdqfVar;
    }

    @Override // com.google.android.gms.internal.ads.zzerw
    public final int zza() {
        return this.zze.zza();
    }

    @Override // com.google.android.gms.internal.ads.zzerw
    public final b6.a zzb() {
        zzemn zzemnVar;
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbbm.zzlI)).booleanValue()) {
            zzemnVar = (zzemn) this.zza.get();
            if (zzemnVar == null || zzemnVar.zza()) {
                zzerw zzerwVar = this.zze;
                zzemn zzemnVar2 = new zzemn(zzerwVar.zzb(), this.zzf, this.zzc);
                this.zza.set(zzemnVar2);
                zzemnVar = zzemnVar2;
            }
        } else {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbbm.zzlH)).booleanValue() && !((Boolean) this.zzb.getAndSet(Boolean.TRUE)).booleanValue()) {
                ScheduledExecutorService scheduledExecutorService = zzbyp.zzd;
                Runnable runnable = new Runnable() { // from class: com.google.android.gms.internal.ads.zzeml
                    @Override // java.lang.Runnable
                    public final void run() {
                        r0.zzd.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzemm
                            @Override // java.lang.Runnable
                            public final void run() {
                                r0.zza.set(new zzemn(r0.zze.zzb(), r0.zzf, zzemo.this.zzc));
                            }
                        });
                    }
                };
                long j10 = this.zzf;
                scheduledExecutorService.scheduleWithFixedDelay(runnable, j10, j10, TimeUnit.MILLISECONDS);
            }
            synchronized (this) {
                zzemnVar = (zzemn) this.zza.get();
                if (zzemnVar == null) {
                    zzemn zzemnVar3 = new zzemn(this.zze.zzb(), this.zzf, this.zzc);
                    this.zza.set(zzemnVar3);
                    return zzemnVar3.zza;
                } else if (!((Boolean) this.zzb.get()).booleanValue() && zzemnVar.zza()) {
                    b6.a aVar = zzemnVar.zza;
                    zzerw zzerwVar2 = this.zze;
                    zzemn zzemnVar4 = new zzemn(zzerwVar2.zzb(), this.zzf, this.zzc);
                    this.zza.set(zzemnVar4);
                    if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbbm.zzlJ)).booleanValue()) {
                        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbbm.zzlK)).booleanValue()) {
                            zzdqe zza = this.zzg.zza();
                            zza.zzb("action", "scs");
                            zza.zzb(fe.Y0, String.valueOf(this.zze.zza()));
                            zza.zzj();
                        }
                        return aVar;
                    }
                    zzemnVar = zzemnVar4;
                }
            }
        }
        return zzemnVar.zza;
    }
}
