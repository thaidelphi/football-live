package com.google.android.gms.internal.ads;

import android.util.Pair;
import java.util.Objects;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public abstract class zzbn {
    public static final zzbn zza = new zzbk();

    static {
        int i10 = zzeh.zza;
        Integer.toString(0, 36);
        Integer.toString(1, 36);
        Integer.toString(2, 36);
    }

    public final boolean equals(Object obj) {
        int zzh;
        if (this == obj) {
            return true;
        }
        if (obj instanceof zzbn) {
            zzbn zzbnVar = (zzbn) obj;
            if (zzbnVar.zzc() == zzc() && zzbnVar.zzb() == zzb()) {
                zzbm zzbmVar = new zzbm();
                zzbl zzblVar = new zzbl();
                zzbm zzbmVar2 = new zzbm();
                zzbl zzblVar2 = new zzbl();
                for (int i10 = 0; i10 < zzc(); i10++) {
                    if (!zze(i10, zzbmVar, 0L).equals(zzbnVar.zze(i10, zzbmVar2, 0L))) {
                        return false;
                    }
                }
                for (int i11 = 0; i11 < zzb(); i11++) {
                    if (!zzd(i11, zzblVar, true).equals(zzbnVar.zzd(i11, zzblVar2, true))) {
                        return false;
                    }
                }
                int zzg = zzg(true);
                if (zzg == zzbnVar.zzg(true) && (zzh = zzh(true)) == zzbnVar.zzh(true)) {
                    while (zzg != zzh) {
                        int zzj = zzj(zzg, 0, true);
                        if (zzj != zzbnVar.zzj(zzg, 0, true)) {
                            return false;
                        }
                        zzg = zzj;
                    }
                    return true;
                }
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        zzbm zzbmVar = new zzbm();
        zzbl zzblVar = new zzbl();
        int zzc = zzc() + 217;
        int i11 = 0;
        while (true) {
            i10 = zzc * 31;
            if (i11 >= zzc()) {
                break;
            }
            zzc = i10 + zze(i11, zzbmVar, 0L).hashCode();
            i11++;
        }
        int zzb = i10 + zzb();
        for (int i12 = 0; i12 < zzb(); i12++) {
            zzb = (zzb * 31) + zzd(i12, zzblVar, true).hashCode();
        }
        int zzg = zzg(true);
        while (zzg != -1) {
            zzb = (zzb * 31) + zzg;
            zzg = zzj(zzg, 0, true);
        }
        return zzb;
    }

    public abstract int zza(Object obj);

    public abstract int zzb();

    public abstract int zzc();

    public abstract zzbl zzd(int i10, zzbl zzblVar, boolean z10);

    public abstract zzbm zze(int i10, zzbm zzbmVar, long j10);

    public abstract Object zzf(int i10);

    public int zzg(boolean z10) {
        return zzo() ? -1 : 0;
    }

    public int zzh(boolean z10) {
        if (zzo()) {
            return -1;
        }
        return zzc() - 1;
    }

    public final int zzi(int i10, zzbl zzblVar, zzbm zzbmVar, int i11, boolean z10) {
        int i12 = zzd(i10, zzblVar, false).zzc;
        if (zze(i12, zzbmVar, 0L).zzo == i10) {
            int zzj = zzj(i12, i11, z10);
            if (zzj == -1) {
                return -1;
            }
            return zze(zzj, zzbmVar, 0L).zzn;
        }
        return i10 + 1;
    }

    public int zzj(int i10, int i11, boolean z10) {
        if (i11 == 0) {
            if (i10 == zzh(z10)) {
                return -1;
            }
            return i10 + 1;
        } else if (i11 != 1) {
            if (i11 == 2) {
                return i10 == zzh(z10) ? zzg(z10) : i10 + 1;
            }
            throw new IllegalStateException();
        } else {
            return i10;
        }
    }

    public int zzk(int i10, int i11, boolean z10) {
        if (i10 == zzg(false)) {
            return -1;
        }
        return i10 - 1;
    }

    public final Pair zzl(zzbm zzbmVar, zzbl zzblVar, int i10, long j10) {
        Pair zzm = zzm(zzbmVar, zzblVar, i10, j10, 0L);
        Objects.requireNonNull(zzm);
        return zzm;
    }

    public final Pair zzm(zzbm zzbmVar, zzbl zzblVar, int i10, long j10, long j11) {
        zzcv.zza(i10, 0, zzc());
        zze(i10, zzbmVar, j11);
        if (j10 == -9223372036854775807L) {
            long j12 = zzbmVar.zzl;
            j10 = 0;
        }
        int i11 = zzbmVar.zzn;
        zzd(i11, zzblVar, false);
        while (i11 < zzbmVar.zzo) {
            long j13 = zzblVar.zze;
            int i12 = (j10 > 0L ? 1 : (j10 == 0L ? 0 : -1));
            if (i12 == 0) {
                break;
            }
            int i13 = i11 + 1;
            long j14 = zzd(i13, zzblVar, false).zze;
            if (i12 < 0) {
                break;
            }
            i11 = i13;
        }
        zzd(i11, zzblVar, true);
        long j15 = zzblVar.zze;
        long j16 = zzblVar.zzd;
        if (j16 != -9223372036854775807L) {
            j10 = Math.min(j10, j16 - 1);
        }
        long max = Math.max(0L, j10);
        Object obj = zzblVar.zzb;
        Objects.requireNonNull(obj);
        return Pair.create(obj, Long.valueOf(max));
    }

    public zzbl zzn(Object obj, zzbl zzblVar) {
        return zzd(zza(obj), zzblVar, true);
    }

    public final boolean zzo() {
        return zzc() == 0;
    }
}
