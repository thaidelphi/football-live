package com.google.android.gms.internal.ads;

import com.unity3d.services.core.device.MimeTypes;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzfd {
    public static final byte[] zza = {0, 0, 0, 1};
    public static final float[] zzb = {1.0f, 1.0f, 1.0909091f, 0.90909094f, 1.4545455f, 1.2121212f, 2.1818182f, 1.8181819f, 2.909091f, 2.4242425f, 1.6363636f, 1.3636364f, 1.939394f, 1.6161616f, 1.3333334f, 1.5f, 2.0f};
    private static final Object zzc = new Object();
    private static int[] zzd = new int[10];

    public static int zza(byte[] bArr, int i10, int i11, boolean[] zArr) {
        int i12 = i11 - i10;
        zzcv.zzf(i12 >= 0);
        if (i12 == 0) {
            return i11;
        }
        if (zArr[0]) {
            zzi(zArr);
            return i10 - 3;
        } else if (i12 > 1 && zArr[1] && bArr[i10] == 1) {
            zzi(zArr);
            return i10 - 2;
        } else if (i12 > 2 && zArr[2] && bArr[i10] == 0 && bArr[i10 + 1] == 1) {
            zzi(zArr);
            return i10 - 1;
        } else {
            int i13 = i11 - 1;
            int i14 = i10 + 2;
            while (i14 < i13) {
                byte b10 = bArr[i14];
                if ((b10 & 254) == 0) {
                    int i15 = i14 - 2;
                    if (bArr[i15] == 0 && bArr[i14 - 1] == 0 && b10 == 1) {
                        zzi(zArr);
                        return i15;
                    }
                    i14 = i15;
                }
                i14 += 3;
            }
            zArr[0] = i12 <= 2 ? !(i12 != 2 ? !(zArr[1] && bArr[i13] == 1) : !(zArr[2] && bArr[i11 + (-2)] == 0 && bArr[i13] == 1)) : bArr[i11 + (-3)] == 0 && bArr[i11 + (-2)] == 0 && bArr[i13] == 1;
            zArr[1] = i12 <= 1 ? zArr[2] && bArr[i13] == 0 : bArr[i11 + (-2)] == 0 && bArr[i13] == 0;
            zArr[2] = bArr[i13] == 0;
            return i11;
        }
    }

    public static int zzb(zzz zzzVar) {
        if (Objects.equals(zzzVar.zzo, MimeTypes.VIDEO_H264)) {
            return 1;
        }
        return (Objects.equals(zzzVar.zzo, MimeTypes.VIDEO_H265) || zzay.zzg(zzzVar.zzk, MimeTypes.VIDEO_H265)) ? 2 : 0;
    }

    public static int zzc(byte[] bArr, int i10) {
        int i11;
        synchronized (zzc) {
            int i12 = 0;
            int i13 = 0;
            while (i12 < i10) {
                while (true) {
                    try {
                        if (i12 >= i10 - 2) {
                            i12 = i10;
                            break;
                        }
                        int i14 = i12 + 1;
                        if (bArr[i12] == 0 && bArr[i14] == 0 && bArr[i12 + 2] == 3) {
                            break;
                        }
                        i12 = i14;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                if (i12 < i10) {
                    int[] iArr = zzd;
                    int length = iArr.length;
                    if (length <= i13) {
                        zzd = Arrays.copyOf(iArr, length + length);
                    }
                    zzd[i13] = i12;
                    i12 += 3;
                    i13++;
                }
            }
            i11 = i10 - i13;
            int i15 = 0;
            int i16 = 0;
            for (int i17 = 0; i17 < i13; i17++) {
                int i18 = zzd[i17] - i15;
                System.arraycopy(bArr, i15, bArr, i16, i18);
                int i19 = i16 + i18;
                int i20 = i19 + 1;
                bArr[i19] = 0;
                i16 = i20 + 1;
                bArr[i20] = 0;
                i15 += i18 + 3;
            }
            System.arraycopy(bArr, i15, bArr, i16, i11 - i16);
        }
        return i11;
    }

    /* JADX WARN: Removed duplicated region for block: B:196:0x03e0  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x03ef  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.google.android.gms.internal.ads.zzex zzd(byte[] r34, int r35, int r36, com.google.android.gms.internal.ads.zzfa r37) {
        /*
            Method dump skipped, instructions count: 1048
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzfd.zzd(byte[], int, int, com.google.android.gms.internal.ads.zzfa):com.google.android.gms.internal.ads.zzex");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:292:0x056f  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0146  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.google.android.gms.internal.ads.zzfa zze(byte[] r37, int r38, int r39) {
        /*
            Method dump skipped, instructions count: 2115
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzfd.zze(byte[], int, int):com.google.android.gms.internal.ads.zzfa");
    }

    public static zzfb zzf(byte[] bArr, int i10, int i11) {
        zzfe zzfeVar = new zzfe(bArr, 4, i11);
        int zzc2 = zzfeVar.zzc();
        int zzc3 = zzfeVar.zzc();
        zzfeVar.zze();
        return new zzfb(zzc2, zzc3, zzfeVar.zzh());
    }

    /* JADX WARN: Removed duplicated region for block: B:106:0x01c1  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x01ca  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x01f6  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x01fe  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x020a  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0215  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x021e  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0223 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0231  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x0250  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0166  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x016b  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0178  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.google.android.gms.internal.ads.zzfc zzg(byte[] r32, int r33, int r34) {
        /*
            Method dump skipped, instructions count: 626
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzfd.zzg(byte[], int, int):com.google.android.gms.internal.ads.zzfc");
    }

    public static String zzh(List list) {
        for (int i10 = 0; i10 < list.size(); i10++) {
            byte[] bArr = (byte[]) list.get(i10);
            int length = bArr.length;
            if (length > 3) {
                boolean[] zArr = new boolean[3];
                int i11 = zzfvv.zzd;
                zzfvs zzfvsVar = new zzfvs();
                int i12 = 0;
                while (true) {
                    int length2 = bArr.length;
                    if (i12 >= length2) {
                        break;
                    }
                    int zza2 = zza(bArr, i12, length2, zArr);
                    if (zza2 != length2) {
                        zzfvsVar.zzf(Integer.valueOf(zza2));
                    }
                    i12 = zza2 + 3;
                }
                zzfvv zzi = zzfvsVar.zzi();
                for (int i13 = 0; i13 < zzi.size(); i13++) {
                    if (((Integer) zzi.get(i13)).intValue() + 3 < length) {
                        zzfe zzfeVar = new zzfe(bArr, ((Integer) zzi.get(i13)).intValue() + 3, length);
                        zzer zzm = zzm(zzfeVar);
                        if (zzm.zza == 33 && zzm.zzb == 0) {
                            zzfeVar.zzf(4);
                            int zza3 = zzfeVar.zza(3);
                            zzfeVar.zze();
                            zzes zzn = zzn(zzfeVar, true, zza3, null);
                            return zzcx.zzd(zzn.zza, zzn.zzb, zzn.zzc, zzn.zzd, zzn.zze, zzn.zzf);
                        }
                    }
                }
                continue;
            }
        }
        return null;
    }

    public static void zzi(boolean[] zArr) {
        zArr[0] = false;
        zArr[1] = false;
        zArr[2] = false;
    }

    public static boolean zzj(byte[] bArr, int i10, int i11, zzz zzzVar) {
        int i12;
        if (Objects.equals(zzzVar.zzo, MimeTypes.VIDEO_H264)) {
            byte b10 = bArr[4];
            if (((b10 & 96) >> 5) == 0 && ((i12 = b10 & 31) == 1 || i12 == 9 || i12 == 14)) {
                return false;
            }
        } else if (Objects.equals(zzzVar.zzo, MimeTypes.VIDEO_H265)) {
            zzer zzm = zzm(new zzfe(bArr, 4, i11 + 4));
            int i13 = zzm.zza;
            if (i13 == 35) {
                return false;
            }
            if (i13 <= 14 && i13 % 2 == 0 && zzm.zzc == zzzVar.zzD - 1) {
                return false;
            }
        }
        return true;
    }

    private static int zzk(int i10, int i11, int i12, int i13) {
        return i10 - ((i11 == 1 ? 2 : 1) * (i12 + i13));
    }

    private static int zzl(int i10, int i11, int i12, int i13) {
        int i14 = 1;
        if (i11 == 1 || i11 == 2) {
            i14 = 2;
        }
        return i10 - (i14 * (i12 + i13));
    }

    private static zzer zzm(zzfe zzfeVar) {
        zzfeVar.zze();
        return new zzer(zzfeVar.zza(6), zzfeVar.zza(6), zzfeVar.zza(3) - 1);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0074  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static com.google.android.gms.internal.ads.zzes zzn(com.google.android.gms.internal.ads.zzfe r18, boolean r19, int r20, com.google.android.gms.internal.ads.zzes r21) {
        /*
            r0 = r18
            r1 = r20
            r2 = r21
            r3 = 6
            int[] r4 = new int[r3]
            r5 = 8
            r6 = 0
            if (r19 == 0) goto L3c
            r2 = 2
            int r2 = r0.zza(r2)
            boolean r7 = r18.zzh()
            r8 = 5
            int r8 = r0.zza(r8)
            r9 = r6
            r10 = r9
        L1e:
            r11 = 32
            if (r9 >= r11) goto L2e
            boolean r11 = r18.zzh()
            if (r11 == 0) goto L2b
            r11 = 1
            int r11 = r11 << r9
            r10 = r10 | r11
        L2b:
            int r9 = r9 + 1
            goto L1e
        L2e:
            r9 = r6
        L2f:
            if (r9 >= r3) goto L3a
            int r11 = r0.zza(r5)
            r4[r9] = r11
            int r9 = r9 + 1
            goto L2f
        L3a:
            r12 = r2
            goto L49
        L3c:
            if (r2 == 0) goto L4f
            int r3 = r2.zza
            boolean r7 = r2.zzb
            int r8 = r2.zzc
            int r10 = r2.zzd
            int[] r4 = r2.zze
            r12 = r3
        L49:
            r16 = r4
            r13 = r7
            r14 = r8
            r15 = r10
            goto L55
        L4f:
            r16 = r4
            r12 = r6
            r13 = r12
            r14 = r13
            r15 = r14
        L55:
            int r17 = r0.zza(r5)
            r2 = r6
        L5a:
            if (r6 >= r1) goto L6f
            boolean r3 = r18.zzh()
            if (r3 == 0) goto L64
            int r2 = r2 + 88
        L64:
            boolean r3 = r18.zzh()
            if (r3 == 0) goto L6c
            int r2 = r2 + 8
        L6c:
            int r6 = r6 + 1
            goto L5a
        L6f:
            r0.zzf(r2)
            if (r1 <= 0) goto L79
            int r5 = r5 - r1
            int r5 = r5 + r5
            r0.zzf(r5)
        L79:
            com.google.android.gms.internal.ads.zzes r0 = new com.google.android.gms.internal.ads.zzes
            r11 = r0
            r11.<init>(r12, r13, r14, r15, r16, r17)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzfd.zzn(com.google.android.gms.internal.ads.zzfe, boolean, int, com.google.android.gms.internal.ads.zzes):com.google.android.gms.internal.ads.zzes");
    }

    private static void zzo(zzfe zzfeVar) {
        int zzc2 = zzfeVar.zzc() + 1;
        zzfeVar.zzf(8);
        for (int i10 = 0; i10 < zzc2; i10++) {
            zzfeVar.zzc();
            zzfeVar.zzc();
            zzfeVar.zze();
        }
        zzfeVar.zzf(20);
    }
}
