package com.google.android.gms.internal.measurement;

import java.io.IOException;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-measurement-base@@21.1.1 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzir {
    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zza(byte[] bArr, int i10, zziq zziqVar) throws zzko {
        int zzj = zzj(bArr, i10, zziqVar);
        int i11 = zziqVar.zza;
        if (i11 >= 0) {
            if (i11 <= bArr.length - zzj) {
                if (i11 == 0) {
                    zziqVar.zzc = zzjd.zzb;
                    return zzj;
                }
                zziqVar.zzc = zzjd.zzl(bArr, zzj, i11);
                return zzj + i11;
            }
            throw zzko.zzf();
        }
        throw zzko.zzd();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zzb(byte[] bArr, int i10) {
        return ((bArr[i10 + 3] & 255) << 24) | (bArr[i10] & 255) | ((bArr[i10 + 1] & 255) << 8) | ((bArr[i10 + 2] & 255) << 16);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zzc(zzlw zzlwVar, byte[] bArr, int i10, int i11, int i12, zziq zziqVar) throws IOException {
        zzlo zzloVar = (zzlo) zzlwVar;
        Object zze = zzloVar.zze();
        int zzc = zzloVar.zzc(zze, bArr, i10, i11, i12, zziqVar);
        zzloVar.zzf(zze);
        zziqVar.zzc = zze;
        return zzc;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zzd(zzlw zzlwVar, byte[] bArr, int i10, int i11, zziq zziqVar) throws IOException {
        int i12 = i10 + 1;
        int i13 = bArr[i10];
        if (i13 < 0) {
            i12 = zzk(i13, bArr, i12, zziqVar);
            i13 = zziqVar.zza;
        }
        int i14 = i12;
        if (i13 >= 0 && i13 <= i11 - i14) {
            Object zze = zzlwVar.zze();
            int i15 = i13 + i14;
            zzlwVar.zzh(zze, bArr, i14, i15, zziqVar);
            zzlwVar.zzf(zze);
            zziqVar.zzc = zze;
            return i15;
        }
        throw zzko.zzf();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zze(zzlw zzlwVar, int i10, byte[] bArr, int i11, int i12, zzkl zzklVar, zziq zziqVar) throws IOException {
        int zzd = zzd(zzlwVar, bArr, i11, i12, zziqVar);
        zzklVar.add(zziqVar.zzc);
        while (zzd < i12) {
            int zzj = zzj(bArr, zzd, zziqVar);
            if (i10 != zziqVar.zza) {
                break;
            }
            zzd = zzd(zzlwVar, bArr, zzj, i12, zziqVar);
            zzklVar.add(zziqVar.zzc);
        }
        return zzd;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zzf(byte[] bArr, int i10, zzkl zzklVar, zziq zziqVar) throws IOException {
        zzkf zzkfVar = (zzkf) zzklVar;
        int zzj = zzj(bArr, i10, zziqVar);
        int i11 = zziqVar.zza + zzj;
        while (zzj < i11) {
            zzj = zzj(bArr, zzj, zziqVar);
            zzkfVar.zzh(zziqVar.zza);
        }
        if (zzj == i11) {
            return zzj;
        }
        throw zzko.zzf();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zzg(byte[] bArr, int i10, zziq zziqVar) throws zzko {
        int zzj = zzj(bArr, i10, zziqVar);
        int i11 = zziqVar.zza;
        if (i11 >= 0) {
            if (i11 == 0) {
                zziqVar.zzc = "";
                return zzj;
            }
            zziqVar.zzc = new String(bArr, zzj, i11, zzkm.zzb);
            return zzj + i11;
        }
        throw zzko.zzd();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zzh(byte[] bArr, int i10, zziq zziqVar) throws zzko {
        int zzj = zzj(bArr, i10, zziqVar);
        int i11 = zziqVar.zza;
        if (i11 >= 0) {
            if (i11 == 0) {
                zziqVar.zzc = "";
                return zzj;
            }
            zziqVar.zzc = zznc.zzd(bArr, zzj, i11);
            return zzj + i11;
        }
        throw zzko.zzd();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zzi(int i10, byte[] bArr, int i11, int i12, zzmo zzmoVar, zziq zziqVar) throws zzko {
        if ((i10 >>> 3) != 0) {
            int i13 = i10 & 7;
            if (i13 == 0) {
                int zzm = zzm(bArr, i11, zziqVar);
                zzmoVar.zzh(i10, Long.valueOf(zziqVar.zzb));
                return zzm;
            } else if (i13 == 1) {
                zzmoVar.zzh(i10, Long.valueOf(zzn(bArr, i11)));
                return i11 + 8;
            } else if (i13 == 2) {
                int zzj = zzj(bArr, i11, zziqVar);
                int i14 = zziqVar.zza;
                if (i14 >= 0) {
                    if (i14 <= bArr.length - zzj) {
                        if (i14 == 0) {
                            zzmoVar.zzh(i10, zzjd.zzb);
                        } else {
                            zzmoVar.zzh(i10, zzjd.zzl(bArr, zzj, i14));
                        }
                        return zzj + i14;
                    }
                    throw zzko.zzf();
                }
                throw zzko.zzd();
            } else if (i13 != 3) {
                if (i13 == 5) {
                    zzmoVar.zzh(i10, Integer.valueOf(zzb(bArr, i11)));
                    return i11 + 4;
                }
                throw zzko.zzb();
            } else {
                int i15 = (i10 & (-8)) | 4;
                zzmo zze = zzmo.zze();
                int i16 = 0;
                while (true) {
                    if (i11 >= i12) {
                        break;
                    }
                    int zzj2 = zzj(bArr, i11, zziqVar);
                    int i17 = zziqVar.zza;
                    if (i17 == i15) {
                        i16 = i17;
                        i11 = zzj2;
                        break;
                    }
                    i16 = i17;
                    i11 = zzi(i17, bArr, zzj2, i12, zze, zziqVar);
                }
                if (i11 <= i12 && i16 == i15) {
                    zzmoVar.zzh(i10, zze);
                    return i11;
                }
                throw zzko.zze();
            }
        }
        throw zzko.zzb();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zzj(byte[] bArr, int i10, zziq zziqVar) {
        int i11 = i10 + 1;
        byte b10 = bArr[i10];
        if (b10 >= 0) {
            zziqVar.zza = b10;
            return i11;
        }
        return zzk(b10, bArr, i11, zziqVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zzk(int i10, byte[] bArr, int i11, zziq zziqVar) {
        int i12 = i10 & 127;
        int i13 = i11 + 1;
        byte b10 = bArr[i11];
        if (b10 >= 0) {
            zziqVar.zza = i12 | (b10 << 7);
            return i13;
        }
        int i14 = i12 | ((b10 & Byte.MAX_VALUE) << 7);
        int i15 = i13 + 1;
        byte b11 = bArr[i13];
        if (b11 >= 0) {
            zziqVar.zza = i14 | (b11 << 14);
            return i15;
        }
        int i16 = i14 | ((b11 & Byte.MAX_VALUE) << 14);
        int i17 = i15 + 1;
        byte b12 = bArr[i15];
        if (b12 >= 0) {
            zziqVar.zza = i16 | (b12 << 21);
            return i17;
        }
        int i18 = i16 | ((b12 & Byte.MAX_VALUE) << 21);
        int i19 = i17 + 1;
        byte b13 = bArr[i17];
        if (b13 >= 0) {
            zziqVar.zza = i18 | (b13 << 28);
            return i19;
        }
        int i20 = i18 | ((b13 & Byte.MAX_VALUE) << 28);
        while (true) {
            int i21 = i19 + 1;
            if (bArr[i19] >= 0) {
                zziqVar.zza = i20;
                return i21;
            }
            i19 = i21;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zzl(int i10, byte[] bArr, int i11, int i12, zzkl zzklVar, zziq zziqVar) {
        zzkf zzkfVar = (zzkf) zzklVar;
        int zzj = zzj(bArr, i11, zziqVar);
        zzkfVar.zzh(zziqVar.zza);
        while (zzj < i12) {
            int zzj2 = zzj(bArr, zzj, zziqVar);
            if (i10 != zziqVar.zza) {
                break;
            }
            zzj = zzj(bArr, zzj2, zziqVar);
            zzkfVar.zzh(zziqVar.zza);
        }
        return zzj;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zzm(byte[] bArr, int i10, zziq zziqVar) {
        byte b10;
        int i11 = i10 + 1;
        long j10 = bArr[i10];
        if (j10 >= 0) {
            zziqVar.zzb = j10;
            return i11;
        }
        int i12 = i11 + 1;
        byte b11 = bArr[i11];
        long j11 = (j10 & 127) | ((b11 & Byte.MAX_VALUE) << 7);
        int i13 = 7;
        while (b11 < 0) {
            int i14 = i12 + 1;
            i13 += 7;
            j11 |= (b10 & Byte.MAX_VALUE) << i13;
            b11 = bArr[i12];
            i12 = i14;
        }
        zziqVar.zzb = j11;
        return i12;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static long zzn(byte[] bArr, int i10) {
        return ((bArr[i10 + 7] & 255) << 56) | (bArr[i10] & 255) | ((bArr[i10 + 1] & 255) << 8) | ((bArr[i10 + 2] & 255) << 16) | ((bArr[i10 + 3] & 255) << 24) | ((bArr[i10 + 4] & 255) << 32) | ((bArr[i10 + 5] & 255) << 40) | ((bArr[i10 + 6] & 255) << 48);
    }
}
