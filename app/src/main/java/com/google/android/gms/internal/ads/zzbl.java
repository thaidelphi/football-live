package com.google.android.gms.internal.ads;

import java.util.Objects;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzbl {
    public Object zza;
    public Object zzb;
    public int zzc;
    public long zzd;
    public long zze;
    public boolean zzf;
    public zzb zzg = zzb.zza;

    static {
        int i10 = zzeh.zza;
        Integer.toString(0, 36);
        Integer.toString(1, 36);
        Integer.toString(2, 36);
        Integer.toString(3, 36);
        Integer.toString(4, 36);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzbl.class.equals(obj.getClass())) {
            zzbl zzblVar = (zzbl) obj;
            Object obj2 = this.zza;
            Object obj3 = zzblVar.zza;
            int i10 = zzeh.zza;
            if (Objects.equals(obj2, obj3) && Objects.equals(this.zzb, zzblVar.zzb) && this.zzc == zzblVar.zzc && this.zzd == zzblVar.zzd && this.zzf == zzblVar.zzf && Objects.equals(this.zzg, zzblVar.zzg)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        Object obj = this.zza;
        int hashCode = obj == null ? 0 : obj.hashCode();
        Object obj2 = this.zzb;
        int hashCode2 = ((((hashCode + 217) * 31) + (obj2 != null ? obj2.hashCode() : 0)) * 31) + this.zzc;
        long j10 = this.zzd;
        return (((((hashCode2 * 31) + ((int) (j10 ^ (j10 >>> 32)))) * 961) + (this.zzf ? 1 : 0)) * 31) + this.zzg.hashCode();
    }

    public final int zza(int i10) {
        return this.zzg.zza(i10).zzb;
    }

    public final int zzb() {
        int i10 = this.zzg.zzb;
        return 0;
    }

    public final int zzc(long j10) {
        return -1;
    }

    public final int zzd(long j10) {
        this.zzg.zzb(-1);
        return -1;
    }

    public final int zze(int i10) {
        return this.zzg.zza(i10).zza(-1);
    }

    public final long zzf(int i10, int i11) {
        zza zza = this.zzg.zza(i10);
        if (zza.zzb != -1) {
            return zza.zzf[i11];
        }
        return -9223372036854775807L;
    }

    public final long zzg(int i10) {
        long j10 = this.zzg.zza(i10).zza;
        return 0L;
    }

    public final long zzh() {
        long j10 = this.zzg.zzc;
        return 0L;
    }

    public final zzbl zzi(Object obj, Object obj2, int i10, long j10, long j11, zzb zzbVar, boolean z10) {
        this.zza = obj;
        this.zzb = obj2;
        this.zzc = i10;
        this.zzd = j10;
        this.zze = 0L;
        this.zzg = zzbVar;
        this.zzf = z10;
        return this;
    }

    public final boolean zzj(int i10) {
        zzb();
        if (i10 == -1) {
            this.zzg.zzb(-1);
            return false;
        }
        return false;
    }

    public final boolean zzk(int i10) {
        boolean z10 = this.zzg.zza(i10).zzi;
        return false;
    }
}
