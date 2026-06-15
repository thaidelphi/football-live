package com.google.android.gms.internal.ads;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzkc {
    public final zztw zza;
    public final Object zzb;
    public final zzvs[] zzc;
    public boolean zzd;
    public boolean zze;
    public boolean zzf;
    public zzkd zzg;
    public boolean zzh;
    private final boolean[] zzi;
    private final zzld[] zzj;
    private final zzxv zzk;
    private final zzkr zzl;
    private zzkc zzm;
    private zzwd zzn;
    private zzxw zzo;
    private long zzp;

    public zzkc(zzld[] zzldVarArr, long j10, zzxv zzxvVar, zzye zzyeVar, zzkr zzkrVar, zzkd zzkdVar, zzxw zzxwVar, long j11) {
        this.zzj = zzldVarArr;
        this.zzp = j10;
        this.zzk = zzxvVar;
        this.zzl = zzkrVar;
        zzty zztyVar = zzkdVar.zza;
        this.zzb = zztyVar.zza;
        this.zzg = zzkdVar;
        this.zzn = zzwd.zza;
        this.zzo = zzxwVar;
        this.zzc = new zzvs[2];
        this.zzi = new boolean[2];
        long j12 = zzkdVar.zzb;
        long j13 = zzkdVar.zzd;
        zztw zzp = zzkrVar.zzp(zztyVar, zzyeVar, j12);
        this.zza = j13 != -9223372036854775807L ? new zztc(zzp, true, 0L, j13) : zzp;
    }

    private final void zzu() {
        if (!zzw()) {
            return;
        }
        int i10 = 0;
        while (true) {
            zzxw zzxwVar = this.zzo;
            if (i10 >= zzxwVar.zza) {
                return;
            }
            zzxwVar.zzb(i10);
            zzxp zzxpVar = this.zzo.zzc[i10];
            i10++;
        }
    }

    private final void zzv() {
        if (!zzw()) {
            return;
        }
        int i10 = 0;
        while (true) {
            zzxw zzxwVar = this.zzo;
            if (i10 >= zzxwVar.zza) {
                return;
            }
            zzxwVar.zzb(i10);
            zzxp zzxpVar = this.zzo.zzc[i10];
            i10++;
        }
    }

    private final boolean zzw() {
        return this.zzm == null;
    }

    public final long zza(zzxw zzxwVar, long j10, boolean z10) {
        return zzb(zzxwVar, j10, false, new boolean[2]);
    }

    public final long zzb(zzxw zzxwVar, long j10, boolean z10, boolean[] zArr) {
        int i10 = 0;
        while (true) {
            boolean z11 = true;
            if (i10 >= zzxwVar.zza) {
                break;
            }
            boolean[] zArr2 = this.zzi;
            if (z10 || !zzxwVar.zza(this.zzo, i10)) {
                z11 = false;
            }
            zArr2[i10] = z11;
            i10++;
        }
        int i11 = 0;
        while (true) {
            zzld[] zzldVarArr = this.zzj;
            if (i11 >= 2) {
                break;
            }
            zzldVarArr[i11].zzb();
            i11++;
        }
        zzu();
        this.zzo = zzxwVar;
        zzv();
        long zzf = this.zza.zzf(zzxwVar.zzc, this.zzi, this.zzc, zArr, j10);
        int i12 = 0;
        while (true) {
            zzld[] zzldVarArr2 = this.zzj;
            if (i12 >= 2) {
                break;
            }
            zzldVarArr2[i12].zzb();
            i12++;
        }
        this.zzf = false;
        int i13 = 0;
        while (true) {
            zzvs[] zzvsVarArr = this.zzc;
            if (i13 >= 2) {
                return zzf;
            }
            if (zzvsVarArr[i13] != null) {
                zzcv.zzf(zzxwVar.zzb(i13));
                this.zzj[i13].zzb();
                this.zzf = true;
            } else {
                zzcv.zzf(zzxwVar.zzc[i13] == null);
            }
            i13++;
        }
    }

    public final long zzc() {
        if (this.zze) {
            long zzb = this.zzf ? this.zza.zzb() : Long.MIN_VALUE;
            return zzb == Long.MIN_VALUE ? this.zzg.zze : zzb;
        }
        return this.zzg.zzb;
    }

    public final long zzd() {
        if (this.zze) {
            return this.zza.zzc();
        }
        return 0L;
    }

    public final long zze() {
        return this.zzp;
    }

    public final long zzf() {
        return this.zzg.zzb + this.zzp;
    }

    public final zzkc zzg() {
        return this.zzm;
    }

    public final zzwd zzh() {
        return this.zzn;
    }

    public final zzxw zzi() {
        return this.zzo;
    }

    public final zzxw zzj(float f10, zzbn zzbnVar, boolean z10) throws zzhs {
        zzxp[] zzxpVarArr;
        zzxw zzo = this.zzk.zzo(this.zzj, this.zzn, this.zzg.zza, zzbnVar);
        for (int i10 = 0; i10 < zzo.zza; i10++) {
            if (zzo.zzb(i10)) {
                if (zzo.zzc[i10] == null) {
                    this.zzj[i10].zzb();
                    r1 = false;
                }
                zzcv.zzf(r1);
            } else {
                zzcv.zzf(zzo.zzc[i10] == null);
            }
        }
        for (zzxp zzxpVar : zzo.zzc) {
        }
        return zzo;
    }

    public final void zzk(zzka zzkaVar) {
        zzcv.zzf(zzw());
        this.zza.zzo(zzkaVar);
    }

    public final void zzl(float f10, zzbn zzbnVar, boolean z10) throws zzhs {
        this.zze = true;
        this.zzn = this.zza.zzg();
        zzxw zzj = zzj(f10, zzbnVar, z10);
        zzkd zzkdVar = this.zzg;
        long j10 = zzkdVar.zzb;
        long j11 = zzkdVar.zze;
        if (j11 != -9223372036854775807L && j10 >= j11) {
            j10 = Math.max(0L, j11 - 1);
        }
        long zza = zza(zzj, j10, false);
        long j12 = this.zzp;
        zzkd zzkdVar2 = this.zzg;
        this.zzp = j12 + (zzkdVar2.zzb - zza);
        this.zzg = zzkdVar2.zzb(zza);
    }

    public final void zzm(zztv zztvVar, long j10) {
        this.zzd = true;
        this.zza.zzl(zztvVar, j10);
    }

    public final void zzn(long j10) {
        zzcv.zzf(zzw());
        if (this.zze) {
            this.zza.zzm(j10 - this.zzp);
        }
    }

    public final void zzo() {
        zzu();
        zztw zztwVar = this.zza;
        try {
            boolean z10 = zztwVar instanceof zztc;
            zzkr zzkrVar = this.zzl;
            if (z10) {
                zzkrVar.zzi(((zztc) zztwVar).zza);
            } else {
                zzkrVar.zzi(zztwVar);
            }
        } catch (RuntimeException e8) {
            zzdn.zzd("MediaPeriodHolder", "Period release failed.", e8);
        }
    }

    public final void zzp(zzkc zzkcVar) {
        if (zzkcVar == this.zzm) {
            return;
        }
        zzu();
        this.zzm = zzkcVar;
        zzv();
    }

    public final void zzq(long j10) {
        this.zzp = j10;
    }

    public final void zzr() {
        zztw zztwVar = this.zza;
        if (zztwVar instanceof zztc) {
            long j10 = this.zzg.zzd;
            if (j10 == -9223372036854775807L) {
                j10 = Long.MIN_VALUE;
            }
            ((zztc) zztwVar).zzn(0L, j10);
        }
    }

    public final boolean zzs() {
        return this.zze && (!this.zzf || this.zza.zzb() == Long.MIN_VALUE);
    }

    public final boolean zzt() {
        return this.zze && (zzs() || zzc() - this.zzg.zzb >= -9223372036854775807L);
    }
}
