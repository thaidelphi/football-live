package com.google.android.gms.internal.ads;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
final class zzagw {
    public final zzadb zza;
    public final long zzb;
    public final long zzc;
    public final int zzd;
    public final int zze;
    public final long[] zzf;

    private zzagw(zzadb zzadbVar, long j10, long j11, long[] jArr, int i10, int i11) {
        this.zza = new zzadb(zzadbVar);
        this.zzb = j10;
        this.zzc = j11;
        this.zzf = jArr;
        this.zzd = i10;
        this.zze = i11;
    }

    public static zzagw zzb(zzadb zzadbVar, zzdx zzdxVar) {
        long[] jArr;
        int i10;
        int i11;
        int zzg = zzdxVar.zzg();
        int zzp = (zzg & 1) != 0 ? zzdxVar.zzp() : -1;
        long zzu = (zzg & 2) != 0 ? zzdxVar.zzu() : -1L;
        if ((zzg & 4) == 4) {
            long[] jArr2 = new long[100];
            for (int i12 = 0; i12 < 100; i12++) {
                jArr2[i12] = zzdxVar.zzm();
            }
            jArr = jArr2;
        } else {
            jArr = null;
        }
        if ((zzg & 8) != 0) {
            zzdxVar.zzM(4);
        }
        if (zzdxVar.zzb() >= 24) {
            zzdxVar.zzM(21);
            int zzo = zzdxVar.zzo();
            i11 = zzo & 4095;
            i10 = zzo >> 12;
        } else {
            i10 = -1;
            i11 = -1;
        }
        return new zzagw(zzadbVar, zzp, zzu, jArr, i10, i11);
    }

    public final long zza() {
        long j10 = this.zzb;
        if (j10 == -1 || j10 == 0) {
            return -9223372036854775807L;
        }
        zzadb zzadbVar = this.zza;
        return zzeh.zzt((j10 * zzadbVar.zzg) - 1, zzadbVar.zzd);
    }
}
