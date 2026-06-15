package com.google.android.gms.internal.ads;

import java.io.IOException;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
final class zzamk {
    private boolean zzc;
    private boolean zzd;
    private boolean zze;
    private final zzee zza = new zzee(0);
    private long zzf = -9223372036854775807L;
    private long zzg = -9223372036854775807L;
    private long zzh = -9223372036854775807L;
    private final zzdx zzb = new zzdx();

    public static long zzc(zzdx zzdxVar) {
        int zzd = zzdxVar.zzd();
        if (zzdxVar.zzb() < 9) {
            return -9223372036854775807L;
        }
        byte[] bArr = new byte[9];
        zzdxVar.zzH(bArr, 0, 9);
        zzdxVar.zzL(zzd);
        byte b10 = bArr[0];
        if ((b10 & 196) == 68) {
            byte b11 = bArr[2];
            if ((b11 & 4) == 4) {
                byte b12 = bArr[4];
                if ((b12 & 4) == 4 && (bArr[5] & 1) == 1 && (bArr[8] & 3) == 3) {
                    long j10 = b10;
                    long j11 = b11;
                    long j12 = (j11 & 3) << 13;
                    return j12 | ((bArr[1] & 255) << 20) | ((j10 & 3) << 28) | (((j10 & 56) >> 3) << 30) | (((248 & j11) >> 3) << 15) | ((bArr[3] & 255) << 5) | ((b12 & 248) >> 3);
                }
                return -9223372036854775807L;
            }
            return -9223372036854775807L;
        }
        return -9223372036854775807L;
    }

    private final int zzf(zzack zzackVar) {
        byte[] bArr = zzeh.zzf;
        int length = bArr.length;
        this.zzb.zzJ(bArr, 0);
        this.zzc = true;
        zzackVar.zzj();
        return 0;
    }

    private static final int zzg(byte[] bArr, int i10) {
        return (bArr[i10 + 3] & 255) | ((bArr[i10] & 255) << 24) | ((bArr[i10 + 1] & 255) << 16) | ((bArr[i10 + 2] & 255) << 8);
    }

    public final int zza(zzack zzackVar, zzadf zzadfVar) throws IOException {
        long j10 = -9223372036854775807L;
        if (!this.zze) {
            long zzd = zzackVar.zzd();
            int min = (int) Math.min(20000L, zzd);
            long j11 = zzd - min;
            if (zzackVar.zzf() != j11) {
                zzadfVar.zza = j11;
                return 1;
            }
            this.zzb.zzI(min);
            zzackVar.zzj();
            zzackVar.zzh(this.zzb.zzN(), 0, min);
            zzdx zzdxVar = this.zzb;
            int zzd2 = zzdxVar.zzd();
            int zze = zzdxVar.zze() - 4;
            while (true) {
                if (zze < zzd2) {
                    break;
                }
                if (zzg(zzdxVar.zzN(), zze) == 442) {
                    zzdxVar.zzL(zze + 4);
                    long zzc = zzc(zzdxVar);
                    if (zzc != -9223372036854775807L) {
                        j10 = zzc;
                        break;
                    }
                }
                zze--;
            }
            this.zzg = j10;
            this.zze = true;
        } else if (this.zzg == -9223372036854775807L) {
            zzf(zzackVar);
            return 0;
        } else if (this.zzd) {
            long j12 = this.zzf;
            if (j12 == -9223372036854775807L) {
                zzf(zzackVar);
                return 0;
            }
            zzee zzeeVar = this.zza;
            this.zzh = zzeeVar.zzc(this.zzg) - zzeeVar.zzb(j12);
            zzf(zzackVar);
            return 0;
        } else {
            int min2 = (int) Math.min(20000L, zzackVar.zzd());
            if (zzackVar.zzf() != 0) {
                zzadfVar.zza = 0L;
                return 1;
            }
            this.zzb.zzI(min2);
            zzackVar.zzj();
            zzackVar.zzh(this.zzb.zzN(), 0, min2);
            zzdx zzdxVar2 = this.zzb;
            int zzd3 = zzdxVar2.zzd();
            int zze2 = zzdxVar2.zze();
            while (true) {
                if (zzd3 >= zze2 - 3) {
                    break;
                }
                if (zzg(zzdxVar2.zzN(), zzd3) == 442) {
                    zzdxVar2.zzL(zzd3 + 4);
                    long zzc2 = zzc(zzdxVar2);
                    if (zzc2 != -9223372036854775807L) {
                        j10 = zzc2;
                        break;
                    }
                }
                zzd3++;
            }
            this.zzf = j10;
            this.zzd = true;
        }
        return 0;
    }

    public final long zzb() {
        return this.zzh;
    }

    public final zzee zzd() {
        return this.zza;
    }

    public final boolean zze() {
        return this.zzc;
    }
}
