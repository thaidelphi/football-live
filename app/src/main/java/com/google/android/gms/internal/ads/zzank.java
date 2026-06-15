package com.google.android.gms.internal.ads;

import android.util.Pair;
import java.io.IOException;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
final class zzank {
    public static Pair zza(zzack zzackVar) throws IOException {
        zzackVar.zzj();
        zzanj zzd = zzd(1684108385, zzackVar, new zzdx(8));
        zzackVar.zzk(8);
        return Pair.create(Long.valueOf(zzackVar.zzf()), Long.valueOf(zzd.zzb));
    }

    public static zzani zzb(zzack zzackVar) throws IOException {
        byte[] bArr;
        zzdx zzdxVar = new zzdx(16);
        zzanj zzd = zzd(1718449184, zzackVar, zzdxVar);
        zzcv.zzf(zzd.zzb >= 16);
        zzackVar.zzh(zzdxVar.zzN(), 0, 16);
        zzdxVar.zzL(0);
        int zzk = zzdxVar.zzk();
        int zzk2 = zzdxVar.zzk();
        int zzj = zzdxVar.zzj();
        int zzj2 = zzdxVar.zzj();
        int zzk3 = zzdxVar.zzk();
        int zzk4 = zzdxVar.zzk();
        int i10 = ((int) zzd.zzb) - 16;
        if (i10 > 0) {
            byte[] bArr2 = new byte[i10];
            zzackVar.zzh(bArr2, 0, i10);
            bArr = bArr2;
        } else {
            bArr = zzeh.zzf;
        }
        zzackVar.zzk((int) (zzackVar.zze() - zzackVar.zzf()));
        return new zzani(zzk, zzk2, zzj, zzj2, zzk3, zzk4, bArr);
    }

    public static boolean zzc(zzack zzackVar) throws IOException {
        zzdx zzdxVar = new zzdx(8);
        int i10 = zzanj.zza(zzackVar, zzdxVar).zza;
        if (i10 == 1380533830 || i10 == 1380333108) {
            zzackVar.zzh(zzdxVar.zzN(), 0, 4);
            zzdxVar.zzL(0);
            int zzg = zzdxVar.zzg();
            if (zzg != 1463899717) {
                zzdn.zzc("WavHeaderReader", "Unsupported form type: " + zzg);
                return false;
            }
            return true;
        }
        return false;
    }

    private static zzanj zzd(int i10, zzack zzackVar, zzdx zzdxVar) throws IOException {
        zzanj zza = zzanj.zza(zzackVar, zzdxVar);
        while (true) {
            int i11 = zza.zza;
            if (i11 == i10) {
                return zza;
            }
            zzdn.zzf("WavHeaderReader", "Ignoring unknown WAV chunk: " + i11);
            long j10 = zza.zzb;
            int i12 = ((j10 & 1) > 0L ? 1 : ((j10 & 1) == 0L ? 0 : -1));
            long j11 = j10 + 8;
            if (i12 != 0) {
                j11++;
            }
            if (j11 <= 2147483647L) {
                zzackVar.zzk((int) j11);
                zza = zzanj.zza(zzackVar, zzdxVar);
            } else {
                int i13 = zza.zza;
                throw zzaz.zzc("Chunk is too large (~2GB+) to skip; id: " + i13);
            }
        }
    }
}
