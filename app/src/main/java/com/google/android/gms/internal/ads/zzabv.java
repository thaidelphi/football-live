package com.google.android.gms.internal.ads;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzabv {
    public static void zza(long j10, zzdx zzdxVar, zzadp[] zzadpVarArr) {
        int i10;
        while (true) {
            if (zzdxVar.zzb() <= 1) {
                return;
            }
            int zzc = zzc(zzdxVar);
            int zzc2 = zzc(zzdxVar);
            int zzd = zzdxVar.zzd() + zzc2;
            if (zzc2 == -1 || zzc2 > zzdxVar.zzb()) {
                zzdn.zzf("CeaUtil", "Skipping remainder of malformed SEI NAL unit.");
                zzd = zzdxVar.zze();
            } else if (zzc == 4 && zzc2 >= 8) {
                int zzm = zzdxVar.zzm();
                int zzq = zzdxVar.zzq();
                if (zzq == 49) {
                    i10 = zzdxVar.zzg();
                    zzq = 49;
                } else {
                    i10 = 0;
                }
                int zzm2 = zzdxVar.zzm();
                if (zzq == 47) {
                    zzdxVar.zzM(1);
                    zzq = 47;
                }
                boolean z10 = zzm == 181 && (zzq == 49 || zzq == 47) && zzm2 == 3;
                if (zzq == 49) {
                    z10 &= i10 == 1195456820;
                }
                if (z10) {
                    zzb(j10, zzdxVar, zzadpVarArr);
                }
            }
            zzdxVar.zzL(zzd);
        }
    }

    public static void zzb(long j10, zzdx zzdxVar, zzadp[] zzadpVarArr) {
        int zzm = zzdxVar.zzm();
        if ((zzm & 64) != 0) {
            int i10 = zzm & 31;
            zzdxVar.zzM(1);
            int zzd = zzdxVar.zzd();
            for (zzadp zzadpVar : zzadpVarArr) {
                int i11 = i10 * 3;
                zzdxVar.zzL(zzd);
                zzadpVar.zzr(zzdxVar, i11);
                zzcv.zzf(j10 != -9223372036854775807L);
                zzadpVar.zzt(j10, 1, i11, 0, null);
            }
        }
    }

    private static int zzc(zzdx zzdxVar) {
        int i10 = 0;
        while (zzdxVar.zzb() != 0) {
            int zzm = zzdxVar.zzm();
            i10 += zzm;
            if (zzm != 255) {
                return i10;
            }
        }
        return -1;
    }
}
