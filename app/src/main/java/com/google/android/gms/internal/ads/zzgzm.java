package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads-lite@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzgzm {
    private static final zzgzj zza;

    static {
        if (zzgzh.zzA() && zzgzh.zzB()) {
            int i10 = zzgup.zza;
        }
        zza = new zzgzk();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* bridge */ /* synthetic */ int zzc(byte[] bArr, int i10, int i11) {
        int i12 = i11 - i10;
        byte b10 = bArr[i10 - 1];
        if (i12 == 0) {
            if (b10 > -12) {
                return -1;
            }
            return b10;
        } else if (i12 != 1) {
            if (i12 == 2) {
                return zzk(b10, bArr[i10], bArr[i10 + 1]);
            }
            throw new AssertionError();
        } else {
            return zzj(b10, bArr[i10]);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0101, code lost:
        return r10 + r0;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int zzd(java.lang.String r8, byte[] r9, int r10, int r11) {
        /*
            Method dump skipped, instructions count: 258
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzgzm.zzd(java.lang.String, byte[], int, int):int");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zze(String str) {
        int length = str.length();
        int i10 = 0;
        int i11 = 0;
        while (i11 < length && str.charAt(i11) < 128) {
            i11++;
        }
        int i12 = length;
        while (true) {
            if (i11 >= length) {
                break;
            }
            char charAt = str.charAt(i11);
            if (charAt < 2048) {
                i12 += (127 - charAt) >>> 31;
                i11++;
            } else {
                int length2 = str.length();
                while (i11 < length2) {
                    char charAt2 = str.charAt(i11);
                    if (charAt2 < 2048) {
                        i10 += (127 - charAt2) >>> 31;
                    } else {
                        i10 += 2;
                        if (charAt2 >= 55296 && charAt2 <= 57343) {
                            if (Character.codePointAt(str, i11) < 65536) {
                                throw new zzgzl(i11, length2);
                            }
                            i11++;
                        }
                    }
                    i11++;
                }
                i12 += i10;
            }
        }
        if (i12 >= length) {
            return i12;
        }
        throw new IllegalArgumentException("UTF-8 length does not fit in int: " + (i12 + 4294967296L));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zzf(int i10, byte[] bArr, int i11, int i12) {
        return zza.zza(i10, bArr, i11, i12);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String zzg(ByteBuffer byteBuffer, int i10, int i11) throws zzgwz {
        zzgzj zzgzjVar = zza;
        if (byteBuffer.hasArray()) {
            return zzgzjVar.zzb(byteBuffer.array(), byteBuffer.arrayOffset() + i10, i11);
        } else if (byteBuffer.isDirect()) {
            return zzgzj.zzc(byteBuffer, i10, i11);
        } else {
            return zzgzj.zzc(byteBuffer, i10, i11);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String zzh(byte[] bArr, int i10, int i11) throws zzgwz {
        return zza.zzb(bArr, i10, i11);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean zzi(byte[] bArr, int i10, int i11) {
        return zza.zza(0, bArr, i10, i11) == 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int zzj(int i10, int i11) {
        if (i10 > -12 || i11 > -65) {
            return -1;
        }
        return i10 ^ (i11 << 8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int zzk(int i10, int i11, int i12) {
        if (i10 > -12 || i11 > -65 || i12 > -65) {
            return -1;
        }
        return (i10 ^ (i11 << 8)) ^ (i12 << 16);
    }
}
