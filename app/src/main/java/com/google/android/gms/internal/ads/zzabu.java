package com.google.android.gms.internal.ads;

import java.io.IOException;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public class zzabu {
    protected final zzabo zza;
    protected final zzabt zzb;
    protected zzabq zzc;
    private final int zzd;

    /* JADX INFO: Access modifiers changed from: protected */
    public zzabu(zzabr zzabrVar, zzabt zzabtVar, long j10, long j11, long j12, long j13, long j14, long j15, int i10) {
        this.zzb = zzabtVar;
        this.zzd = i10;
        this.zza = new zzabo(zzabrVar, j10, 0L, j12, j13, j14, j15);
    }

    protected static final int zzf(zzack zzackVar, long j10, zzadf zzadfVar) {
        if (j10 == zzackVar.zzf()) {
            return 0;
        }
        zzadfVar.zza = j10;
        return 1;
    }

    protected static final boolean zzg(zzack zzackVar, long j10) throws IOException {
        long zzf = j10 - zzackVar.zzf();
        if (zzf < 0 || zzf > 262144) {
            return false;
        }
        zzackVar.zzk((int) zzf);
        return true;
    }

    public final int zza(zzack zzackVar, zzadf zzadfVar) throws IOException {
        long j10;
        long j11;
        long j12;
        long j13;
        int i10;
        long j14;
        long j15;
        long j16;
        long j17;
        long j18;
        long j19;
        long j20;
        while (true) {
            zzabq zzabqVar = this.zzc;
            zzcv.zzb(zzabqVar);
            j10 = zzabqVar.zzf;
            j11 = zzabqVar.zzg;
            j12 = zzabqVar.zzh;
            if (j11 - j10 <= this.zzd) {
                zzc(false, j10);
                return zzf(zzackVar, j10, zzadfVar);
            } else if (!zzg(zzackVar, j12)) {
                return zzf(zzackVar, j12, zzadfVar);
            } else {
                zzackVar.zzj();
                zzabt zzabtVar = this.zzb;
                j13 = zzabqVar.zzb;
                zzabs zza = zzabtVar.zza(zzackVar, j13);
                i10 = zza.zzb;
                if (i10 == -3) {
                    zzc(false, j12);
                    return zzf(zzackVar, j12, zzadfVar);
                } else if (i10 == -2) {
                    j19 = zza.zzc;
                    j20 = zza.zzd;
                    zzabq.zzh(zzabqVar, j19, j20);
                } else if (i10 != -1) {
                    j14 = zza.zzd;
                    zzg(zzackVar, j14);
                    j15 = zza.zzd;
                    zzc(true, j15);
                    j16 = zza.zzd;
                    return zzf(zzackVar, j16, zzadfVar);
                } else {
                    j17 = zza.zzc;
                    j18 = zza.zzd;
                    zzabq.zzg(zzabqVar, j17, j18);
                }
            }
        }
    }

    public final zzadi zzb() {
        return this.zza;
    }

    protected final void zzc(boolean z10, long j10) {
        this.zzc = null;
        this.zzb.zzb();
    }

    public final void zzd(long j10) {
        long j11;
        long j12;
        long j13;
        long j14;
        long j15;
        zzabq zzabqVar = this.zzc;
        if (zzabqVar != null) {
            j15 = zzabqVar.zza;
            if (j15 == j10) {
                return;
            }
        }
        zzabo zzaboVar = this.zza;
        long zzf = zzaboVar.zzf(j10);
        j11 = zzaboVar.zzc;
        j12 = zzaboVar.zzd;
        j13 = zzaboVar.zze;
        j14 = zzaboVar.zzf;
        this.zzc = new zzabq(j10, zzf, 0L, j11, j12, j13, j14);
    }

    public final boolean zze() {
        return this.zzc != null;
    }
}
