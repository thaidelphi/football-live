package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzeef {
    private final Executor zza;
    private final ScheduledExecutorService zzb;
    private final zzcpo zzc;
    private final zzeev zzd;
    private final zzfhk zze;
    private final zzgbj zzf = zzgbj.zze();
    private final AtomicBoolean zzg = new AtomicBoolean();
    private zzeeg zzh;
    private zzfag zzi;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzeef(Executor executor, ScheduledExecutorService scheduledExecutorService, zzcpo zzcpoVar, zzeev zzeevVar, zzfhk zzfhkVar) {
        this.zza = executor;
        this.zzb = scheduledExecutorService;
        this.zzc = zzcpoVar;
        this.zzd = zzeevVar;
        this.zze = zzfhkVar;
    }

    private final synchronized b6.a zzd(zzezu zzezuVar) {
        for (String str : zzezuVar.zza) {
            zzebg zza = this.zzc.zza(zzezuVar.zzb, str);
            if (zza != null && zza.zzb(this.zzi, zzezuVar)) {
                b6.a zza2 = zza.zza(this.zzi, zzezuVar);
                int i10 = zzezuVar.zzR;
                return zzgap.zzo(zza2, i10, TimeUnit.MILLISECONDS, this.zzb);
            }
        }
        return zzgap.zzg(new zzduh(3));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zze(zzezu zzezuVar) {
        b6.a zzd = zzd(zzezuVar);
        this.zzd.zzf(this.zzi, zzezuVar, zzd, this.zze);
        zzgap.zzr(zzd, new zzeee(this, zzezuVar), this.zza);
    }

    public final synchronized b6.a zzb(zzfag zzfagVar) {
        if (!this.zzg.getAndSet(true)) {
            if (zzfagVar.zzb.zza.isEmpty()) {
                this.zzf.zzd(new zzeez(3, zzefc.zzc(zzfagVar)));
            } else {
                this.zzi = zzfagVar;
                this.zzh = new zzeeg(zzfagVar, this.zzd, this.zzf);
                this.zzd.zzk(zzfagVar.zzb.zza);
                zzezu zza = this.zzh.zza();
                while (zza != null) {
                    zze(zza);
                    zza = this.zzh.zza();
                }
            }
        }
        return this.zzf;
    }
}
