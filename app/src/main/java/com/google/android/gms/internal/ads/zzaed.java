package com.google.android.gms.internal.ads;

import java.math.RoundingMode;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
final class zzaed implements zzadx {
    public final int zza;
    public final int zzb;
    public final int zzc;
    public final int zzd;
    public final int zze;
    public final int zzf;

    private zzaed(int i10, int i11, int i12, int i13, int i14, int i15, int i16) {
        this.zza = i10;
        this.zzb = i12;
        this.zzc = i13;
        this.zzd = i14;
        this.zze = i15;
        this.zzf = i16;
    }

    public static zzaed zzd(zzdx zzdxVar) {
        int zzi = zzdxVar.zzi();
        zzdxVar.zzM(12);
        int zzi2 = zzdxVar.zzi();
        int zzi3 = zzdxVar.zzi();
        int zzi4 = zzdxVar.zzi();
        zzdxVar.zzM(4);
        int zzi5 = zzdxVar.zzi();
        int zzi6 = zzdxVar.zzi();
        zzdxVar.zzM(4);
        return new zzaed(zzi, zzi2, zzi3, zzi4, zzi5, zzi6, zzdxVar.zzi());
    }

    @Override // com.google.android.gms.internal.ads.zzadx
    public final int zza() {
        return 1752331379;
    }

    public final int zzb() {
        int i10 = this.zza;
        if (i10 != 1935960438) {
            if (i10 != 1935963489) {
                if (i10 != 1937012852) {
                    zzdn.zzf("AviStreamHeaderChunk", "Found unsupported streamType fourCC: ".concat(String.valueOf(Integer.toHexString(i10))));
                    return -1;
                }
                return 3;
            }
            return 1;
        }
        return 2;
    }

    public final long zzc() {
        RoundingMode roundingMode = RoundingMode.DOWN;
        return zzeh.zzu(this.zzd, this.zzb * 1000000, this.zzc, roundingMode);
    }
}
