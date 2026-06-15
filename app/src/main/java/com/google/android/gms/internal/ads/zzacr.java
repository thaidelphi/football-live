package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.Arrays;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzacr {
    public static zzav zza(zzack zzackVar, boolean z10) throws IOException {
        zzav zza = new zzacz().zza(zzackVar, z10 ? null : zzafs.zza);
        if (zza == null || zza.zza() == 0) {
            return null;
        }
        return zza;
    }

    public static zzact zzb(zzdx zzdxVar) {
        zzdxVar.zzM(1);
        int zzo = zzdxVar.zzo();
        long zzd = zzdxVar.zzd();
        long j10 = zzo;
        int i10 = zzo / 18;
        long[] jArr = new long[i10];
        long[] jArr2 = new long[i10];
        int i11 = 0;
        while (true) {
            if (i11 >= i10) {
                break;
            }
            long zzt = zzdxVar.zzt();
            if (zzt == -1) {
                jArr = Arrays.copyOf(jArr, i11);
                jArr2 = Arrays.copyOf(jArr2, i11);
                break;
            }
            jArr[i11] = zzt;
            jArr2[i11] = zzdxVar.zzt();
            zzdxVar.zzM(2);
            i11++;
        }
        zzdxVar.zzM((int) ((zzd + j10) - zzdxVar.zzd()));
        return new zzact(jArr, jArr2);
    }
}
