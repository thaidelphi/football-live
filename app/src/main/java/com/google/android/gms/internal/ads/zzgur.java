package com.google.android.gms.internal.ads;

import java.io.IOException;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads-lite@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzgur {
    public static final /* synthetic */ int zza = 0;
    private static volatile int zzb = 100;

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zza(byte[] bArr, int i10, zzguq zzguqVar) throws zzgwz {
        int zzh = zzh(bArr, i10, zzguqVar);
        int i11 = zzguqVar.zza;
        if (i11 >= 0) {
            if (i11 <= bArr.length - zzh) {
                if (i11 == 0) {
                    zzguqVar.zzc = zzgvc.zzb;
                    return zzh;
                }
                zzguqVar.zzc = zzgvc.zzv(bArr, zzh, i11);
                return zzh + i11;
            }
            throw new zzgwz("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        throw new zzgwz("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zzb(byte[] bArr, int i10) {
        int i11 = (bArr[i10 + 1] & 255) << 8;
        return ((bArr[i10 + 3] & 255) << 24) | i11 | (bArr[i10] & 255) | ((bArr[i10 + 2] & 255) << 16);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zzc(zzgyo zzgyoVar, byte[] bArr, int i10, int i11, int i12, zzguq zzguqVar) throws IOException {
        Object zze = zzgyoVar.zze();
        int zzl = zzl(zze, zzgyoVar, bArr, i10, i11, i12, zzguqVar);
        zzgyoVar.zzf(zze);
        zzguqVar.zzc = zze;
        return zzl;
    }

    static int zzd(zzgyo zzgyoVar, byte[] bArr, int i10, int i11, zzguq zzguqVar) throws IOException {
        Object zze = zzgyoVar.zze();
        int zzm = zzm(zze, zzgyoVar, bArr, i10, i11, zzguqVar);
        zzgyoVar.zzf(zze);
        zzguqVar.zzc = zze;
        return zzm;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zze(zzgyo zzgyoVar, int i10, byte[] bArr, int i11, int i12, zzgww zzgwwVar, zzguq zzguqVar) throws IOException {
        int zzd = zzd(zzgyoVar, bArr, i11, i12, zzguqVar);
        zzgwwVar.add(zzguqVar.zzc);
        while (zzd < i12) {
            int zzh = zzh(bArr, zzd, zzguqVar);
            if (i10 != zzguqVar.zza) {
                break;
            }
            zzd = zzd(zzgyoVar, bArr, zzh, i12, zzguqVar);
            zzgwwVar.add(zzguqVar.zzc);
        }
        return zzd;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zzf(byte[] bArr, int i10, zzgww zzgwwVar, zzguq zzguqVar) throws IOException {
        zzgwl zzgwlVar = (zzgwl) zzgwwVar;
        int zzh = zzh(bArr, i10, zzguqVar);
        int i11 = zzguqVar.zza + zzh;
        while (zzh < i11) {
            zzh = zzh(bArr, zzh, zzguqVar);
            zzgwlVar.zzi(zzguqVar.zza);
        }
        if (zzh == i11) {
            return zzh;
        }
        throw new zzgwz("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zzg(int i10, byte[] bArr, int i11, int i12, zzgzb zzgzbVar, zzguq zzguqVar) throws zzgwz {
        if ((i10 >>> 3) != 0) {
            int i13 = i10 & 7;
            if (i13 == 0) {
                int zzk = zzk(bArr, i11, zzguqVar);
                zzgzbVar.zzj(i10, Long.valueOf(zzguqVar.zzb));
                return zzk;
            } else if (i13 == 1) {
                zzgzbVar.zzj(i10, Long.valueOf(zzn(bArr, i11)));
                return i11 + 8;
            } else if (i13 == 2) {
                int zzh = zzh(bArr, i11, zzguqVar);
                int i14 = zzguqVar.zza;
                if (i14 >= 0) {
                    if (i14 <= bArr.length - zzh) {
                        if (i14 == 0) {
                            zzgzbVar.zzj(i10, zzgvc.zzb);
                        } else {
                            zzgzbVar.zzj(i10, zzgvc.zzv(bArr, zzh, i14));
                        }
                        return zzh + i14;
                    }
                    throw new zzgwz("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                }
                throw new zzgwz("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
            } else if (i13 != 3) {
                if (i13 == 5) {
                    zzgzbVar.zzj(i10, Integer.valueOf(zzb(bArr, i11)));
                    return i11 + 4;
                }
                throw new zzgwz("Protocol message contained an invalid tag (zero).");
            } else {
                int i15 = (i10 & (-8)) | 4;
                zzgzb zzf = zzgzb.zzf();
                int i16 = zzguqVar.zze + 1;
                zzguqVar.zze = i16;
                zzo(i16);
                int i17 = 0;
                while (true) {
                    if (i11 >= i12) {
                        break;
                    }
                    int zzh2 = zzh(bArr, i11, zzguqVar);
                    i17 = zzguqVar.zza;
                    if (i17 == i15) {
                        i11 = zzh2;
                        break;
                    }
                    i11 = zzg(i17, bArr, zzh2, i12, zzf, zzguqVar);
                }
                zzguqVar.zze--;
                if (i11 <= i12 && i17 == i15) {
                    zzgzbVar.zzj(i10, zzf);
                    return i11;
                }
                throw new zzgwz("Failed to parse the message.");
            }
        }
        throw new zzgwz("Protocol message contained an invalid tag (zero).");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zzh(byte[] bArr, int i10, zzguq zzguqVar) {
        int i11 = i10 + 1;
        byte b10 = bArr[i10];
        if (b10 >= 0) {
            zzguqVar.zza = b10;
            return i11;
        }
        return zzi(b10, bArr, i11, zzguqVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zzi(int i10, byte[] bArr, int i11, zzguq zzguqVar) {
        byte b10 = bArr[i11];
        int i12 = i11 + 1;
        int i13 = i10 & 127;
        if (b10 >= 0) {
            zzguqVar.zza = i13 | (b10 << 7);
            return i12;
        }
        int i14 = i13 | ((b10 & Byte.MAX_VALUE) << 7);
        int i15 = i12 + 1;
        byte b11 = bArr[i12];
        if (b11 >= 0) {
            zzguqVar.zza = i14 | (b11 << 14);
            return i15;
        }
        int i16 = i14 | ((b11 & Byte.MAX_VALUE) << 14);
        int i17 = i15 + 1;
        byte b12 = bArr[i15];
        if (b12 >= 0) {
            zzguqVar.zza = i16 | (b12 << 21);
            return i17;
        }
        int i18 = i16 | ((b12 & Byte.MAX_VALUE) << 21);
        int i19 = i17 + 1;
        byte b13 = bArr[i17];
        if (b13 >= 0) {
            zzguqVar.zza = i18 | (b13 << 28);
            return i19;
        }
        int i20 = i18 | ((b13 & Byte.MAX_VALUE) << 28);
        while (true) {
            int i21 = i19 + 1;
            if (bArr[i19] >= 0) {
                zzguqVar.zza = i20;
                return i21;
            }
            i19 = i21;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zzj(int i10, byte[] bArr, int i11, int i12, zzgww zzgwwVar, zzguq zzguqVar) {
        zzgwl zzgwlVar = (zzgwl) zzgwwVar;
        int zzh = zzh(bArr, i11, zzguqVar);
        zzgwlVar.zzi(zzguqVar.zza);
        while (zzh < i12) {
            int zzh2 = zzh(bArr, zzh, zzguqVar);
            if (i10 != zzguqVar.zza) {
                break;
            }
            zzh = zzh(bArr, zzh2, zzguqVar);
            zzgwlVar.zzi(zzguqVar.zza);
        }
        return zzh;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zzk(byte[] bArr, int i10, zzguq zzguqVar) {
        long j10 = bArr[i10];
        int i11 = i10 + 1;
        if (j10 >= 0) {
            zzguqVar.zzb = j10;
            return i11;
        }
        int i12 = i11 + 1;
        byte b10 = bArr[i11];
        long j11 = (j10 & 127) | ((b10 & Byte.MAX_VALUE) << 7);
        int i13 = 7;
        while (b10 < 0) {
            int i14 = i12 + 1;
            byte b11 = bArr[i12];
            i13 += 7;
            j11 |= (b11 & Byte.MAX_VALUE) << i13;
            i12 = i14;
            b10 = b11;
        }
        zzguqVar.zzb = j11;
        return i12;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zzl(Object obj, zzgyo zzgyoVar, byte[] bArr, int i10, int i11, int i12, zzguq zzguqVar) throws IOException {
        zzgxy zzgxyVar = (zzgxy) zzgyoVar;
        int i13 = zzguqVar.zze + 1;
        zzguqVar.zze = i13;
        zzo(i13);
        int zzc = zzgxyVar.zzc(obj, bArr, i10, i11, i12, zzguqVar);
        zzguqVar.zze--;
        zzguqVar.zzc = obj;
        return zzc;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zzm(Object obj, zzgyo zzgyoVar, byte[] bArr, int i10, int i11, zzguq zzguqVar) throws IOException {
        int i12 = i10 + 1;
        int i13 = bArr[i10];
        if (i13 < 0) {
            i12 = zzi(i13, bArr, i12, zzguqVar);
            i13 = zzguqVar.zza;
        }
        int i14 = i12;
        if (i13 >= 0 && i13 <= i11 - i14) {
            int i15 = zzguqVar.zze + 1;
            zzguqVar.zze = i15;
            zzo(i15);
            int i16 = i13 + i14;
            zzgyoVar.zzi(obj, bArr, i14, i16, zzguqVar);
            zzguqVar.zze--;
            zzguqVar.zzc = obj;
            return i16;
        }
        throw new zzgwz("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static long zzn(byte[] bArr, int i10) {
        return (bArr[i10] & 255) | ((bArr[i10 + 1] & 255) << 8) | ((bArr[i10 + 2] & 255) << 16) | ((bArr[i10 + 3] & 255) << 24) | ((bArr[i10 + 4] & 255) << 32) | ((bArr[i10 + 5] & 255) << 40) | ((bArr[i10 + 6] & 255) << 48) | ((bArr[i10 + 7] & 255) << 56);
    }

    private static void zzo(int i10) throws zzgwz {
        if (i10 >= zzb) {
            throw new zzgwz("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
        }
    }
}
