package com.google.android.gms.internal.ads;

import android.util.Pair;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzahk {
    public static final /* synthetic */ int zza = 0;
    private static final byte[] zzb;

    static {
        int i10 = zzeh.zza;
        zzb = "OpusHead".getBytes(StandardCharsets.UTF_8);
    }

    public static int zza(int i10) {
        return (i10 >> 24) & 255;
    }

    public static zzav zzb(zzek zzekVar) {
        zzej zzejVar;
        zzel zzb2 = zzekVar.zzb(1751411826);
        zzel zzb3 = zzekVar.zzb(1801812339);
        zzel zzb4 = zzekVar.zzb(1768715124);
        if (zzb2 != null && zzb3 != null && zzb4 != null && zzi(zzb2.zza) == 1835299937) {
            zzdx zzdxVar = zzb3.zza;
            zzdxVar.zzL(12);
            int zzg = zzdxVar.zzg();
            String[] strArr = new String[zzg];
            for (int i10 = 0; i10 < zzg; i10++) {
                int zzg2 = zzdxVar.zzg();
                zzdxVar.zzM(4);
                strArr[i10] = zzdxVar.zzB(zzg2 - 8, StandardCharsets.UTF_8);
            }
            zzdx zzdxVar2 = zzb4.zza;
            zzdxVar2.zzL(8);
            ArrayList arrayList = new ArrayList();
            while (zzdxVar2.zzb() > 8) {
                int zzd = zzdxVar2.zzd() + zzdxVar2.zzg();
                int zzg3 = zzdxVar2.zzg() - 1;
                if (zzg3 >= 0 && zzg3 < zzg) {
                    String str = strArr[zzg3];
                    while (true) {
                        int zzd2 = zzdxVar2.zzd();
                        if (zzd2 >= zzd) {
                            zzejVar = null;
                            break;
                        }
                        int zzg4 = zzdxVar2.zzg();
                        if (zzdxVar2.zzg() == 1684108385) {
                            int zzg5 = zzdxVar2.zzg();
                            int zzg6 = zzdxVar2.zzg();
                            int i11 = zzg4 - 16;
                            byte[] bArr = new byte[i11];
                            zzdxVar2.zzH(bArr, 0, i11);
                            zzejVar = new zzej(str, bArr, zzg6, zzg5);
                            break;
                        }
                        zzdxVar2.zzL(zzd2 + zzg4);
                    }
                    if (zzejVar != null) {
                        arrayList.add(zzejVar);
                    }
                } else {
                    zzdn.zzf("BoxParsers", "Skipped metadata with unknown key index: " + zzg3);
                }
                zzdxVar2.zzL(zzd);
            }
            if (!arrayList.isEmpty()) {
                return new zzav(arrayList);
            }
        }
        return null;
    }

    public static zzav zzc(zzel zzelVar) {
        int zzn;
        zzdx zzdxVar = zzelVar.zza;
        zzdxVar.zzL(8);
        zzav zzavVar = new zzav(-9223372036854775807L, new zzau[0]);
        while (zzdxVar.zzb() >= 8) {
            int zzd = zzdxVar.zzd();
            int zzg = zzdxVar.zzg() + zzd;
            int zzg2 = zzdxVar.zzg();
            zzav zzavVar2 = null;
            if (zzg2 == 1835365473) {
                zzdxVar.zzL(zzd);
                zzdxVar.zzM(8);
                zzg(zzdxVar);
                while (true) {
                    if (zzdxVar.zzd() >= zzg) {
                        break;
                    }
                    int zzd2 = zzdxVar.zzd();
                    int zzg3 = zzdxVar.zzg() + zzd2;
                    if (zzdxVar.zzg() == 1768715124) {
                        zzdxVar.zzL(zzd2);
                        zzdxVar.zzM(8);
                        ArrayList arrayList = new ArrayList();
                        while (zzdxVar.zzd() < zzg3) {
                            zzau zza2 = zzahs.zza(zzdxVar);
                            if (zza2 != null) {
                                arrayList.add(zza2);
                            }
                        }
                        if (!arrayList.isEmpty()) {
                            zzavVar2 = new zzav(arrayList);
                        }
                    } else {
                        zzdxVar.zzL(zzg3);
                    }
                }
                zzavVar = zzavVar.zzd(zzavVar2);
            } else if (zzg2 == 1936553057) {
                zzdxVar.zzL(zzd);
                zzdxVar.zzM(12);
                while (true) {
                    if (zzdxVar.zzd() >= zzg) {
                        break;
                    }
                    int zzd3 = zzdxVar.zzd();
                    int zzg4 = zzdxVar.zzg();
                    if (zzdxVar.zzg() != 1935766900) {
                        zzdxVar.zzL(zzd3 + zzg4);
                    } else if (zzg4 >= 16) {
                        zzdxVar.zzM(4);
                        int i10 = -1;
                        int i11 = 0;
                        for (int i12 = 0; i12 < 2; i12++) {
                            int zzm = zzdxVar.zzm();
                            int zzm2 = zzdxVar.zzm();
                            if (zzm == 0) {
                                i10 = zzm2;
                            } else if (zzm == 1) {
                                i11 = zzm2;
                            }
                        }
                        if (i10 == 12) {
                            zzn = 240;
                        } else if (i10 == 13) {
                            zzn = 120;
                        } else {
                            if (i10 == 21 && zzdxVar.zzb() >= 8 && zzdxVar.zzd() + 8 <= zzg) {
                                int zzg5 = zzdxVar.zzg();
                                int zzg6 = zzdxVar.zzg();
                                if (zzg5 >= 12 && zzg6 == 1936877170) {
                                    zzn = zzdxVar.zzn();
                                }
                            }
                            zzn = -2147483647;
                        }
                        if (zzn != -2147483647) {
                            zzavVar2 = new zzav(-9223372036854775807L, new zzagd(zzn, i11));
                        }
                    }
                }
                zzavVar = zzavVar.zzd(zzavVar2);
            } else if (zzg2 == -1451722374) {
                zzavVar = zzavVar.zzd(zzl(zzdxVar));
            }
            zzdxVar.zzL(zzg);
        }
        return zzavVar;
    }

    public static zzep zzd(zzdx zzdxVar) {
        long zzt;
        long zzt2;
        zzdxVar.zzL(8);
        if (zza(zzdxVar.zzg()) == 0) {
            zzt = zzdxVar.zzu();
            zzt2 = zzdxVar.zzu();
        } else {
            zzt = zzdxVar.zzt();
            zzt2 = zzdxVar.zzt();
        }
        return new zzep(zzt, zzt2, zzdxVar.zzu());
    }

    /* JADX WARN: Removed duplicated region for block: B:135:0x0370  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x0386  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.google.android.gms.internal.ads.zzaif zze(com.google.android.gms.internal.ads.zzaic r43, com.google.android.gms.internal.ads.zzek r44, com.google.android.gms.internal.ads.zzacx r45) throws com.google.android.gms.internal.ads.zzaz {
        /*
            Method dump skipped, instructions count: 1586
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzahk.zze(com.google.android.gms.internal.ads.zzaic, com.google.android.gms.internal.ads.zzek, com.google.android.gms.internal.ads.zzacx):com.google.android.gms.internal.ads.zzaif");
    }

    /* JADX WARN: Code restructure failed: missing block: B:46:0x00e3, code lost:
        if (r9 == 0) goto L587;
     */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0221  */
    /* JADX WARN: Removed duplicated region for block: B:523:0x0b49  */
    /* JADX WARN: Removed duplicated region for block: B:524:0x0b4b  */
    /* JADX WARN: Removed duplicated region for block: B:574:0x0cdf  */
    /* JADX WARN: Removed duplicated region for block: B:575:0x0ce3  */
    /* JADX WARN: Removed duplicated region for block: B:587:0x0d4f A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:594:0x01de A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0158  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0194  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0196  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x01a6  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x01a8  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x01ac  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.util.List zzf(com.google.android.gms.internal.ads.zzek r66, com.google.android.gms.internal.ads.zzacx r67, long r68, com.google.android.gms.internal.ads.zzs r70, boolean r71, boolean r72, com.google.android.gms.internal.ads.zzfsk r73) throws com.google.android.gms.internal.ads.zzaz {
        /*
            Method dump skipped, instructions count: 3417
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzahk.zzf(com.google.android.gms.internal.ads.zzek, com.google.android.gms.internal.ads.zzacx, long, com.google.android.gms.internal.ads.zzs, boolean, boolean, com.google.android.gms.internal.ads.zzfsk):java.util.List");
    }

    public static void zzg(zzdx zzdxVar) {
        int zzd = zzdxVar.zzd();
        zzdxVar.zzM(4);
        if (zzdxVar.zzg() != 1751411826) {
            zzd += 4;
        }
        zzdxVar.zzL(zzd);
    }

    private static int zzh(zzdx zzdxVar) {
        int zzm = zzdxVar.zzm();
        int i10 = zzm & 127;
        while ((zzm & 128) == 128) {
            zzm = zzdxVar.zzm();
            i10 = (i10 << 7) | (zzm & 127);
        }
        return i10;
    }

    private static int zzi(zzdx zzdxVar) {
        zzdxVar.zzL(16);
        return zzdxVar.zzg();
    }

    private static Pair zzj(zzdx zzdxVar, int i10, int i11) throws zzaz {
        Integer num;
        zzaid zzaidVar;
        Pair create;
        int i12;
        int i13;
        byte[] bArr;
        int zzd = zzdxVar.zzd();
        while (zzd - i10 < i11) {
            zzdxVar.zzL(zzd);
            int zzg = zzdxVar.zzg();
            zzacn.zzb(zzg > 0, "childAtomSize must be positive");
            if (zzdxVar.zzg() == 1936289382) {
                int i14 = zzd + 8;
                int i15 = 0;
                int i16 = -1;
                String str = null;
                Integer num2 = null;
                while (i14 - zzd < zzg) {
                    zzdxVar.zzL(i14);
                    int zzg2 = zzdxVar.zzg();
                    int zzg3 = zzdxVar.zzg();
                    if (zzg3 == 1718775137) {
                        num2 = Integer.valueOf(zzdxVar.zzg());
                    } else if (zzg3 == 1935894637) {
                        zzdxVar.zzM(4);
                        str = zzdxVar.zzB(4, StandardCharsets.UTF_8);
                    } else if (zzg3 == 1935894633) {
                        i16 = i14;
                        i15 = zzg2;
                    }
                    i14 += zzg2;
                }
                if ("cenc".equals(str) || "cbc1".equals(str) || "cens".equals(str) || "cbcs".equals(str)) {
                    zzacn.zzb(num2 != null, "frma atom is mandatory");
                    zzacn.zzb(i16 != -1, "schi atom is mandatory");
                    int i17 = i16 + 8;
                    while (true) {
                        if (i17 - i16 >= i15) {
                            num = num2;
                            zzaidVar = null;
                            break;
                        }
                        zzdxVar.zzL(i17);
                        int zzg4 = zzdxVar.zzg();
                        if (zzdxVar.zzg() == 1952804451) {
                            int zza2 = zza(zzdxVar.zzg());
                            zzdxVar.zzM(1);
                            if (zza2 == 0) {
                                zzdxVar.zzM(1);
                                i12 = 0;
                                i13 = 0;
                            } else {
                                int zzm = zzdxVar.zzm();
                                i12 = zzm & 15;
                                i13 = (zzm & 240) >> 4;
                            }
                            boolean z10 = zzdxVar.zzm() == 1;
                            int zzm2 = zzdxVar.zzm();
                            byte[] bArr2 = new byte[16];
                            zzdxVar.zzH(bArr2, 0, 16);
                            if (z10 && zzm2 == 0) {
                                int zzm3 = zzdxVar.zzm();
                                byte[] bArr3 = new byte[zzm3];
                                zzdxVar.zzH(bArr3, 0, zzm3);
                                bArr = bArr3;
                            } else {
                                bArr = null;
                            }
                            num = num2;
                            zzaidVar = new zzaid(z10, str, zzm2, bArr2, i13, i12, bArr);
                        } else {
                            i17 += zzg4;
                        }
                    }
                    zzacn.zzb(zzaidVar != null, "tenc atom is mandatory");
                    int i18 = zzeh.zza;
                    create = Pair.create(num, zzaidVar);
                } else {
                    create = null;
                }
                if (create != null) {
                    return create;
                }
            }
            zzd += zzg;
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:68:0x0144, code lost:
        if (r6 == 1) goto L63;
     */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x017d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static com.google.android.gms.internal.ads.zzk zzk(com.google.android.gms.internal.ads.zzdx r15) {
        /*
            Method dump skipped, instructions count: 397
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzahk.zzk(com.google.android.gms.internal.ads.zzdx):com.google.android.gms.internal.ads.zzk");
    }

    private static zzav zzl(zzdx zzdxVar) {
        short zzE = zzdxVar.zzE();
        zzdxVar.zzM(2);
        String zzB = zzdxVar.zzB(zzE, StandardCharsets.UTF_8);
        int max = Math.max(zzB.lastIndexOf(43), zzB.lastIndexOf(45));
        try {
            return new zzav(-9223372036854775807L, new zzeo(Float.parseFloat(zzB.substring(0, max)), Float.parseFloat(zzB.substring(max, zzB.length() - 1))));
        } catch (IndexOutOfBoundsException | NumberFormatException unused) {
            return null;
        }
    }

    private static zzaha zzm(zzdx zzdxVar, int i10) {
        zzdxVar.zzL(i10 + 12);
        zzdxVar.zzM(1);
        zzh(zzdxVar);
        zzdxVar.zzM(2);
        int zzm = zzdxVar.zzm();
        if ((zzm & 128) != 0) {
            zzdxVar.zzM(2);
        }
        if ((zzm & 64) != 0) {
            zzdxVar.zzM(zzdxVar.zzm());
        }
        if ((zzm & 32) != 0) {
            zzdxVar.zzM(2);
        }
        zzdxVar.zzM(1);
        zzh(zzdxVar);
        String zzd = zzay.zzd(zzdxVar.zzm());
        if (!"audio/mpeg".equals(zzd) && !"audio/vnd.dts".equals(zzd) && !"audio/vnd.dts.hd".equals(zzd)) {
            zzdxVar.zzM(4);
            long zzu = zzdxVar.zzu();
            long zzu2 = zzdxVar.zzu();
            zzdxVar.zzM(1);
            int zzh = zzh(zzdxVar);
            byte[] bArr = new byte[zzh];
            zzdxVar.zzH(bArr, 0, zzh);
            return new zzaha(zzd, bArr, zzu2 <= 0 ? -1L : zzu2, zzu > 0 ? zzu : -1L);
        }
        return new zzaha(zzd, null, -1L, -1L);
    }

    private static ByteBuffer zzn() {
        return ByteBuffer.allocate(25).order(ByteOrder.LITTLE_ENDIAN);
    }

    /* JADX WARN: Removed duplicated region for block: B:133:0x01d2  */
    /* JADX WARN: Removed duplicated region for block: B:243:0x04cf A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:262:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void zzo(com.google.android.gms.internal.ads.zzdx r25, int r26, int r27, int r28, int r29, java.lang.String r30, boolean r31, com.google.android.gms.internal.ads.zzs r32, com.google.android.gms.internal.ads.zzahf r33, int r34) throws com.google.android.gms.internal.ads.zzaz {
        /*
            Method dump skipped, instructions count: 1300
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzahk.zzo(com.google.android.gms.internal.ads.zzdx, int, int, int, int, java.lang.String, boolean, com.google.android.gms.internal.ads.zzs, com.google.android.gms.internal.ads.zzahf, int):void");
    }
}
