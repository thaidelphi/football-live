package com.google.android.gms.internal.ads;

import java.util.Objects;
import java.util.Queue;
import java.util.concurrent.Executor;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzaal {
    private final zzaag zza;
    private long zzj;
    private final zzzg zzk;
    private final zzaae zzb = new zzaae();
    private final zzed zzc = new zzed(10);
    private final zzed zzd = new zzed(10);
    private final zzdp zze = new zzdp(16);
    private long zzf = -9223372036854775807L;
    private zzcc zzi = zzcc.zza;
    private long zzg = -9223372036854775807L;
    private long zzh = -9223372036854775807L;

    public zzaal(zzzg zzzgVar, zzaag zzaagVar) {
        this.zzk = zzzgVar;
        this.zza = zzaagVar;
    }

    private static Object zzh(zzed zzedVar) {
        zzcv.zzd(zzedVar.zza() > 0);
        while (zzedVar.zza() > 1) {
            zzedVar.zzb();
        }
        Object zzb = zzedVar.zzb();
        Objects.requireNonNull(zzb);
        return zzb;
    }

    public final void zza() {
        this.zze.zzd();
        this.zzf = -9223372036854775807L;
        this.zzg = -9223372036854775807L;
        this.zzh = -9223372036854775807L;
        zzed zzedVar = this.zzd;
        if (zzedVar.zza() > 0) {
            this.zzd.zzd(0L, Long.valueOf(((Long) zzh(zzedVar)).longValue()));
        }
        zzed zzedVar2 = this.zzc;
        if (zzedVar2.zza() > 0) {
            this.zzc.zzd(0L, (zzcc) zzh(zzedVar2));
        }
    }

    public final void zzb(long j10) {
        this.zze.zzc(j10);
        this.zzf = j10;
        this.zzh = -9223372036854775807L;
    }

    public final void zzc(long j10) {
        long j11 = this.zzf;
        this.zzd.zzd(j11 == -9223372036854775807L ? 0L : j11 + 1, Long.valueOf(j10));
    }

    public final void zzd(int i10, int i11) {
        long j10 = this.zzf;
        this.zzc.zzd(j10 == -9223372036854775807L ? 0L : j10 + 1, new zzcc(i10, i11, 1.0f));
    }

    public final void zze(long j10, long j11) throws zzhs {
        Executor executor;
        Queue queue;
        while (true) {
            zzdp zzdpVar = this.zze;
            if (zzdpVar.zze()) {
                return;
            }
            zzed zzedVar = this.zzd;
            long zza = zzdpVar.zza();
            Long l10 = (Long) zzedVar.zzc(zza);
            if (l10 != null && l10.longValue() != this.zzj) {
                this.zzj = l10.longValue();
                this.zza.zzf();
            }
            int zza2 = this.zza.zza(zza, j10, j11, this.zzj, false, this.zzb);
            if (zza2 == 0 || zza2 == 1) {
                this.zzg = zza;
                zzdp zzdpVar2 = this.zze;
                zzed zzedVar2 = this.zzc;
                long zzb = zzdpVar2.zzb();
                zzcc zzccVar = (zzcc) zzedVar2.zzc(zzb);
                if (zzccVar != null && !zzccVar.equals(zzcc.zza) && !zzccVar.equals(this.zzi)) {
                    this.zzi = zzccVar;
                    this.zzk.zza(zzccVar);
                }
                this.zzk.zzb(zza2 == 0 ? -1L : this.zzb.zzd(), zzb, this.zza.zzp());
            } else if (zza2 == 2 || zza2 == 3) {
                this.zzg = zza;
                this.zze.zzb();
                final zzzg zzzgVar = this.zzk;
                executor = zzzgVar.zza.zzj;
                executor.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzze
                    @Override // java.lang.Runnable
                    public final void run() {
                        zzaaz zzaazVar;
                        zzzi zzziVar = zzzg.this.zza;
                        zzaazVar = zzziVar.zzi;
                        zzaazVar.zzb(zzziVar);
                    }
                });
                queue = zzzgVar.zza.zzd;
                ((zzaba) queue.remove()).zzb();
            } else if (zza2 != 4) {
                return;
            } else {
                this.zzg = zza;
            }
        }
    }

    public final void zzf() {
        this.zzh = this.zzf;
    }

    public final boolean zzg() {
        long j10 = this.zzh;
        return j10 != -9223372036854775807L && this.zzg == j10;
    }
}
