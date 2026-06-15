package com.google.android.gms.internal.ads;

import com.google.protobuf.CodedOutputStream;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
final class zzamd {
    public static zzamb zza(zzdw zzdwVar) throws zzaz {
        int i10;
        int i11;
        char c10;
        int i12;
        int i13;
        char c11;
        int zzd = zzdwVar.zzd(8);
        int i14 = 5;
        int zzd2 = zzdwVar.zzd(5);
        if (zzd2 != 31) {
            switch (zzd2) {
                case 0:
                    i10 = 96000;
                    break;
                case 1:
                    i10 = 88200;
                    break;
                case 2:
                    i10 = 64000;
                    break;
                case 3:
                    i10 = 48000;
                    break;
                case 4:
                    i10 = 44100;
                    break;
                case 5:
                    i10 = 32000;
                    break;
                case 6:
                    i10 = 24000;
                    break;
                case 7:
                    i10 = 22050;
                    break;
                case 8:
                    i10 = 16000;
                    break;
                case 9:
                    i10 = 12000;
                    break;
                case 10:
                    i10 = 11025;
                    break;
                case 11:
                    i10 = 8000;
                    break;
                case 12:
                    i10 = 7350;
                    break;
                case 13:
                case 14:
                default:
                    throw zzaz.zzc("Unsupported sampling rate index " + zzd2);
                case 15:
                    i10 = 57600;
                    break;
                case 16:
                    i10 = 51200;
                    break;
                case 17:
                    i10 = 40000;
                    break;
                case 18:
                    i10 = 38400;
                    break;
                case 19:
                    i10 = 34150;
                    break;
                case 20:
                    i10 = 28800;
                    break;
                case 21:
                    i10 = 25600;
                    break;
                case 22:
                    i10 = 20000;
                    break;
                case 23:
                    i10 = 19200;
                    break;
                case 24:
                    i10 = 17075;
                    break;
                case 25:
                    i10 = 14400;
                    break;
                case 26:
                    i10 = 12800;
                    break;
                case 27:
                    i10 = 9600;
                    break;
            }
        } else {
            i10 = zzdwVar.zzd(24);
        }
        int zzd3 = zzdwVar.zzd(3);
        int i15 = 1;
        if (zzd3 == 0) {
            i11 = 768;
        } else if (zzd3 == 1) {
            i11 = 1024;
        } else if (zzd3 == 2 || zzd3 == 3) {
            i11 = com.ironsource.mediationsdk.metadata.a.f18931n;
        } else if (zzd3 != 4) {
            throw zzaz.zzc("Unsupported coreSbrFrameLengthIndex " + zzd3);
        } else {
            i11 = CodedOutputStream.DEFAULT_BUFFER_SIZE;
        }
        if (zzd3 == 0 || zzd3 == 1) {
            c10 = 0;
        } else if (zzd3 == 2) {
            c10 = 2;
        } else if (zzd3 == 3) {
            c10 = 3;
        } else if (zzd3 != 4) {
            throw zzaz.zzc("Unsupported coreSbrFrameLengthIndex " + zzd3);
        } else {
            c10 = 1;
        }
        zzdwVar.zzn(2);
        zze(zzdwVar);
        int zzd4 = zzdwVar.zzd(5);
        int i16 = 0;
        int i17 = 0;
        while (true) {
            int i18 = 16;
            if (i16 < zzd4 + 1) {
                int zzd5 = zzdwVar.zzd(3);
                i17 += zzc(zzdwVar, 5, 8, 16) + 1;
                if ((zzd5 == 0 || zzd5 == 2) && zzdwVar.zzp()) {
                    zze(zzdwVar);
                }
                i16++;
            } else {
                int zzc = zzc(zzdwVar, 4, 8, 16) + 1;
                zzdwVar.zzm();
                int i19 = 0;
                while (true) {
                    double d10 = 2.0d;
                    if (i19 < zzc) {
                        int zzd6 = zzdwVar.zzd(2);
                        if (zzd6 == 0) {
                            i12 = zzd;
                            zzf(zzdwVar);
                            if (c10 > 0) {
                                zzd(zzdwVar);
                            }
                        } else if (zzd6 != i15) {
                            if (zzd6 == 3) {
                                zzc(zzdwVar, 4, 8, i18);
                                int zzc2 = zzc(zzdwVar, 4, 8, i18);
                                if (zzdwVar.zzp()) {
                                    zzc(zzdwVar, 8, i18, 0);
                                }
                                zzdwVar.zzm();
                                if (zzc2 > 0) {
                                    zzdwVar.zzn(zzc2 * 8);
                                }
                            }
                            i12 = zzd;
                        } else {
                            if (zzf(zzdwVar)) {
                                zzdwVar.zzm();
                            }
                            if (c10 > 0) {
                                zzd(zzdwVar);
                                i13 = zzdwVar.zzd(2);
                                c11 = c10;
                            } else {
                                i13 = 0;
                                c11 = 0;
                            }
                            if (i13 > 0) {
                                zzdwVar.zzn(6);
                                int zzd7 = zzdwVar.zzd(2);
                                zzdwVar.zzn(4);
                                if (zzdwVar.zzp()) {
                                    zzdwVar.zzn(i14);
                                }
                                if (i13 == 2 || i13 == 3) {
                                    zzdwVar.zzn(6);
                                }
                                if (zzd7 == 2) {
                                    zzdwVar.zzm();
                                }
                            }
                            i12 = zzd;
                            int floor = ((int) Math.floor(Math.log(i17 - 1) / Math.log(2.0d))) + 1;
                            int zzd8 = zzdwVar.zzd(2);
                            if (zzd8 > 0 && zzdwVar.zzp()) {
                                zzdwVar.zzn(floor);
                            }
                            if (zzdwVar.zzp()) {
                                zzdwVar.zzn(floor);
                            }
                            if (c11 == 0 && zzd8 == 0) {
                                zzdwVar.zzm();
                            }
                        }
                        i19++;
                        zzd = i12;
                        i14 = 5;
                        i15 = 1;
                        i18 = 16;
                    } else {
                        int i20 = zzd;
                        byte[] bArr = null;
                        if (zzdwVar.zzp()) {
                            int zzc3 = zzc(zzdwVar, 2, 4, 8) + 1;
                            for (int i21 = 0; i21 < zzc3; i21++) {
                                int zzc4 = zzc(zzdwVar, 4, 8, 16);
                                int zzc5 = zzc(zzdwVar, 4, 8, 16);
                                if (zzc4 == 7) {
                                    int zzd9 = zzdwVar.zzd(4) + 1;
                                    zzdwVar.zzn(4);
                                    byte[] bArr2 = new byte[zzd9];
                                    for (int i22 = 0; i22 < zzd9; i22++) {
                                        bArr2[i22] = (byte) zzdwVar.zzd(8);
                                    }
                                    bArr = bArr2;
                                } else {
                                    zzdwVar.zzn(zzc5 * 8);
                                }
                            }
                        }
                        byte[] bArr3 = bArr;
                        switch (i10) {
                            case 14700:
                            case 16000:
                                d10 = 3.0d;
                                break;
                            case 22050:
                            case 24000:
                                break;
                            case 29400:
                            case 32000:
                            case 58800:
                            case 64000:
                                d10 = 1.5d;
                                break;
                            case 44100:
                            case 48000:
                            case 88200:
                            case 96000:
                                d10 = 1.0d;
                                break;
                            default:
                                throw zzaz.zzc("Unsupported sampling rate " + i10);
                        }
                        return new zzamb(i20, (int) (i10 * d10), (int) (i11 * d10), bArr3, null);
                    }
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0070 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0072  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean zzb(com.google.android.gms.internal.ads.zzdw r17, com.google.android.gms.internal.ads.zzama r18) throws com.google.android.gms.internal.ads.zzaz {
        /*
            r0 = r17
            r1 = r18
            r17.zzb()
            r2 = 3
            r3 = 8
            int r2 = zzc(r0, r2, r3, r3)
            r1.zza = r2
            r4 = -1
            if (r2 == r4) goto Lc5
            r2 = 2
            int r6 = java.lang.Math.max(r2, r3)
            r7 = 32
            int r6 = java.lang.Math.max(r6, r7)
            r8 = 63
            r9 = 1
            if (r6 > r8) goto L25
            r6 = r9
            goto L26
        L25:
            r6 = 0
        L26:
            com.google.android.gms.internal.ads.zzcv.zzd(r6)
            r10 = 3
            r12 = 255(0xff, double:1.26E-321)
            long r14 = com.google.android.gms.internal.ads.zzfyt.zza(r10, r12)
            r4 = 4294967296(0x100000000, double:2.121995791E-314)
            com.google.android.gms.internal.ads.zzfyt.zza(r14, r4)
            int r4 = r17.zza()
            r14 = -1
            if (r4 >= r2) goto L43
        L41:
            r4 = r14
            goto L6a
        L43:
            long r4 = r0.zze(r2)
            int r16 = (r4 > r10 ? 1 : (r4 == r10 ? 0 : -1))
            if (r16 != 0) goto L6a
            int r4 = r17.zza()
            if (r4 >= r3) goto L52
            goto L41
        L52:
            long r3 = r0.zze(r3)
            long r10 = r10 + r3
            int r3 = (r3 > r12 ? 1 : (r3 == r12 ? 0 : -1))
            if (r3 != 0) goto L69
            int r3 = r17.zza()
            if (r3 >= r7) goto L62
            goto L41
        L62:
            long r3 = r0.zze(r7)
            long r4 = r10 + r3
            goto L6a
        L69:
            r4 = r10
        L6a:
            r1.zzb = r4
            int r3 = (r4 > r14 ? 1 : (r4 == r14 ? 0 : -1))
            if (r3 != 0) goto L72
            r3 = 0
            return r3
        L72:
            r10 = 16
            int r3 = (r4 > r10 ? 1 : (r4 == r10 ? 0 : -1))
            if (r3 > 0) goto Laf
            r10 = 0
            int r3 = (r4 > r10 ? 1 : (r4 == r10 ? 0 : -1))
            if (r3 != 0) goto L9f
            int r3 = r1.zza
            r4 = 0
            if (r3 == r9) goto L98
            if (r3 == r2) goto L91
            r2 = 17
            if (r3 == r2) goto L8a
            goto L9f
        L8a:
            java.lang.String r0 = "AudioTruncation packet with invalid packet label 0"
            com.google.android.gms.internal.ads.zzaz r0 = com.google.android.gms.internal.ads.zzaz.zza(r0, r4)
            throw r0
        L91:
            java.lang.String r0 = "Mpegh3daFrame packet with invalid packet label 0"
            com.google.android.gms.internal.ads.zzaz r0 = com.google.android.gms.internal.ads.zzaz.zza(r0, r4)
            throw r0
        L98:
            java.lang.String r0 = "Mpegh3daConfig packet with invalid packet label 0"
            com.google.android.gms.internal.ads.zzaz r0 = com.google.android.gms.internal.ads.zzaz.zza(r0, r4)
            throw r0
        L9f:
            r2 = 11
            r3 = 24
            int r0 = zzc(r0, r2, r3, r3)
            r1.zzc = r0
            r1 = -1
            if (r0 == r1) goto Lad
            return r9
        Lad:
            r0 = 0
            return r0
        Laf:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Contains sub-stream with an invalid packet label "
            r0.append(r1)
            r0.append(r4)
            java.lang.String r0 = r0.toString()
            com.google.android.gms.internal.ads.zzaz r0 = com.google.android.gms.internal.ads.zzaz.zzc(r0)
            throw r0
        Lc5:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzamd.zzb(com.google.android.gms.internal.ads.zzdw, com.google.android.gms.internal.ads.zzama):boolean");
    }

    private static int zzc(zzdw zzdwVar, int i10, int i11, int i12) {
        zzcv.zzd(Math.max(Math.max(i10, i11), i12) <= 31);
        int i13 = (1 << i10) - 1;
        int i14 = (1 << i11) - 1;
        zzfyr.zza(zzfyr.zza(i13, i14), 1 << i12);
        if (zzdwVar.zza() < i10) {
            return -1;
        }
        int zzd = zzdwVar.zzd(i10);
        if (zzd == i13) {
            if (zzdwVar.zza() < i11) {
                return -1;
            }
            int zzd2 = zzdwVar.zzd(i11);
            int i15 = zzd + zzd2;
            if (zzd2 == i14) {
                if (zzdwVar.zza() < i12) {
                    return -1;
                }
                return i15 + zzdwVar.zzd(i12);
            }
            return i15;
        }
        return zzd;
    }

    private static void zzd(zzdw zzdwVar) {
        zzdwVar.zzn(3);
        zzdwVar.zzn(8);
        boolean zzp = zzdwVar.zzp();
        boolean zzp2 = zzdwVar.zzp();
        if (zzp) {
            zzdwVar.zzn(5);
        }
        if (zzp2) {
            zzdwVar.zzn(6);
        }
    }

    private static void zze(zzdw zzdwVar) {
        int zzd;
        int zzd2 = zzdwVar.zzd(2);
        if (zzd2 == 0) {
            zzdwVar.zzn(6);
            return;
        }
        int zzc = zzc(zzdwVar, 5, 8, 16) + 1;
        if (zzd2 == 1) {
            zzdwVar.zzn(zzc * 7);
        } else if (zzd2 == 2) {
            boolean zzp = zzdwVar.zzp();
            int i10 = true != zzp ? 5 : 1;
            int i11 = true == zzp ? 7 : 5;
            int i12 = true == zzp ? 8 : 6;
            int i13 = 0;
            while (i13 < zzc) {
                if (zzdwVar.zzp()) {
                    zzdwVar.zzn(7);
                    zzd = 0;
                } else {
                    if (zzdwVar.zzd(2) == 3 && zzdwVar.zzd(i11) * i10 != 0) {
                        zzdwVar.zzm();
                    }
                    zzd = zzdwVar.zzd(i12) * i10;
                    if (zzd != 0 && zzd != 180) {
                        zzdwVar.zzm();
                    }
                    zzdwVar.zzm();
                }
                if (zzd != 0 && zzd != 180 && zzdwVar.zzp()) {
                    i13++;
                }
                i13++;
            }
        }
    }

    private static boolean zzf(zzdw zzdwVar) {
        zzdwVar.zzn(3);
        boolean zzp = zzdwVar.zzp();
        if (zzp) {
            zzdwVar.zzn(13);
        }
        return zzp;
    }
}
