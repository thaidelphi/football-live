package com.google.android.gms.internal.ads;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzanc {
    public static int zza(byte[] bArr, int i10, int i11) {
        while (i10 < i11 && bArr[i10] != 71) {
            i10++;
        }
        return i10;
    }

    public static long zzb(zzdx zzdxVar, int i10, int i11) {
        zzdxVar.zzL(i10);
        if (zzdxVar.zzb() < 5) {
            return -9223372036854775807L;
        }
        int zzg = zzdxVar.zzg();
        if ((8388608 & zzg) != 0 || ((zzg >> 8) & 8191) != i11 || (zzg & 32) == 0 || zzdxVar.zzm() < 7 || zzdxVar.zzb() < 7 || (zzdxVar.zzm() & 16) != 16) {
            return -9223372036854775807L;
        }
        byte[] bArr = new byte[6];
        zzdxVar.zzH(bArr, 0, 6);
        long j10 = bArr[3] & 255;
        return ((bArr[0] & 255) << 25) | ((bArr[1] & 255) << 17) | ((bArr[2] & 255) << 9) | (j10 + j10) | ((bArr[4] & 255) >> 7);
    }
}
