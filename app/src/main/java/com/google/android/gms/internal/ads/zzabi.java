package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.AdRequest;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.nio.ByteBuffer;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzabi {
    public static final /* synthetic */ int zza = 0;
    private static final int[] zzb = {1, 2, 3, 6};
    private static final int[] zzc = {48000, 44100, 32000};
    private static final int[] zzd = {24000, 22050, 16000};
    private static final int[] zze = {2, 1, 2, 3, 3, 4, 4, 5};
    private static final int[] zzf = {32, 40, 48, 56, 64, 80, 96, 112, 128, 160, 192, 224, 256, 320, 384, 448, AdRequest.MAX_CONTENT_URL_LENGTH, 576, 640};
    private static final int[] zzg = {69, 87, 104, 121, 139, 174, 208, 243, 278, 348, 417, 487, 557, 696, 835, 975, IronSourceConstants.RV_CALLBACK_AD_CLICKED, 1253, 1393};

    public static int zza(ByteBuffer byteBuffer) {
        if (((byteBuffer.get(byteBuffer.position() + 5) & 248) >> 3) > 10) {
            return zzb[((byteBuffer.get(byteBuffer.position() + 4) & 192) >> 6) != 3 ? (byteBuffer.get(byteBuffer.position() + 4) & 48) >> 4 : 3] * 256;
        }
        return 1536;
    }

    public static int zzb(byte[] bArr) {
        if (bArr.length < 6) {
            return -1;
        }
        if (((bArr[5] & 248) >> 3) > 10) {
            int i10 = ((bArr[3] & 255) | ((bArr[2] & 7) << 8)) + 1;
            return i10 + i10;
        }
        byte b10 = bArr[4];
        return zzf((b10 & 192) >> 6, b10 & 63);
    }

    public static zzz zzc(zzdx zzdxVar, String str, String str2, zzs zzsVar) {
        zzdw zzdwVar = new zzdw();
        zzdwVar.zzj(zzdxVar);
        int i10 = zzc[zzdwVar.zzd(2)];
        zzdwVar.zzn(8);
        int i11 = zze[zzdwVar.zzd(3)];
        if (zzdwVar.zzd(1) != 0) {
            i11++;
        }
        int i12 = zzf[zzdwVar.zzd(5)] * 1000;
        zzdwVar.zzf();
        zzdxVar.zzL(zzdwVar.zzb());
        zzx zzxVar = new zzx();
        zzxVar.zzO(str);
        zzxVar.zzad("audio/ac3");
        zzxVar.zzB(i11);
        zzxVar.zzae(i10);
        zzxVar.zzH(zzsVar);
        zzxVar.zzS(str2);
        zzxVar.zzA(i12);
        zzxVar.zzY(i12);
        return zzxVar.zzaj();
    }

    public static zzz zzd(zzdx zzdxVar, String str, String str2, zzs zzsVar) {
        String str3;
        zzdw zzdwVar = new zzdw();
        zzdwVar.zzj(zzdxVar);
        int zzd2 = zzdwVar.zzd(13) * 1000;
        zzdwVar.zzn(3);
        int i10 = zzc[zzdwVar.zzd(2)];
        zzdwVar.zzn(10);
        int i11 = zze[zzdwVar.zzd(3)];
        if (zzdwVar.zzd(1) != 0) {
            i11++;
        }
        zzdwVar.zzn(3);
        int zzd3 = zzdwVar.zzd(4);
        zzdwVar.zzn(1);
        if (zzd3 > 0) {
            zzdwVar.zzn(6);
            if (zzdwVar.zzd(1) != 0) {
                i11 += 2;
            }
            zzdwVar.zzn(1);
        }
        if (zzdwVar.zza() > 7) {
            zzdwVar.zzn(7);
            if (zzdwVar.zzd(1) != 0) {
                str3 = "audio/eac3-joc";
                zzdwVar.zzf();
                zzdxVar.zzL(zzdwVar.zzb());
                zzx zzxVar = new zzx();
                zzxVar.zzO(str);
                zzxVar.zzad(str3);
                zzxVar.zzB(i11);
                zzxVar.zzae(i10);
                zzxVar.zzH(zzsVar);
                zzxVar.zzS(str2);
                zzxVar.zzY(zzd2);
                return zzxVar.zzaj();
            }
        }
        str3 = "audio/eac3";
        zzdwVar.zzf();
        zzdxVar.zzL(zzdwVar.zzb());
        zzx zzxVar2 = new zzx();
        zzxVar2.zzO(str);
        zzxVar2.zzad(str3);
        zzxVar2.zzB(i11);
        zzxVar2.zzae(i10);
        zzxVar2.zzH(zzsVar);
        zzxVar2.zzS(str2);
        zzxVar2.zzY(zzd2);
        return zzxVar2.zzaj();
    }

    public static zzabg zze(zzdw zzdwVar) {
        int i10;
        String str;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int zzc2 = zzdwVar.zzc();
        zzdwVar.zzn(40);
        int zzd2 = zzdwVar.zzd(5);
        zzdwVar.zzl(zzc2);
        int i21 = -1;
        if (zzd2 > 10) {
            zzdwVar.zzn(16);
            int zzd3 = zzdwVar.zzd(2);
            if (zzd3 == 0) {
                i21 = 0;
            } else if (zzd3 == 1) {
                i21 = 1;
            } else if (zzd3 == 2) {
                i21 = 2;
            }
            zzdwVar.zzn(3);
            int zzd4 = zzdwVar.zzd(11) + 1;
            int zzd5 = zzdwVar.zzd(2);
            if (zzd5 == 3) {
                i17 = zzd[zzdwVar.zzd(2)];
                i18 = 6;
                i16 = 3;
            } else {
                int zzd6 = zzdwVar.zzd(2);
                int i22 = zzb[zzd6];
                i16 = zzd6;
                i17 = zzc[zzd5];
                i18 = i22;
            }
            int i23 = zzd4 + zzd4;
            int i24 = (i23 * i17) / (i18 * 32);
            int zzd7 = zzdwVar.zzd(3);
            boolean zzp = zzdwVar.zzp();
            i10 = zze[zzd7] + (zzp ? 1 : 0);
            zzdwVar.zzn(10);
            if (zzdwVar.zzp()) {
                zzdwVar.zzn(8);
            }
            if (zzd7 == 0) {
                zzdwVar.zzn(5);
                if (zzdwVar.zzp()) {
                    zzdwVar.zzn(8);
                }
                i19 = 0;
                zzd7 = 0;
            } else {
                i19 = zzd7;
            }
            if (i21 == 1) {
                if (zzdwVar.zzp()) {
                    zzdwVar.zzn(16);
                }
                i20 = 1;
            } else {
                i20 = i21;
            }
            if (zzdwVar.zzp()) {
                if (i19 > 2) {
                    zzdwVar.zzn(2);
                }
                if ((i19 & 1) != 0 && i19 > 2) {
                    zzdwVar.zzn(6);
                }
                if ((i19 & 4) != 0) {
                    zzdwVar.zzn(6);
                }
                if (zzp && zzdwVar.zzp()) {
                    zzdwVar.zzn(5);
                }
                if (i20 == 0) {
                    if (zzdwVar.zzp()) {
                        zzdwVar.zzn(6);
                    }
                    if (i19 == 0 && zzdwVar.zzp()) {
                        zzdwVar.zzn(6);
                    }
                    if (zzdwVar.zzp()) {
                        zzdwVar.zzn(6);
                    }
                    int zzd8 = zzdwVar.zzd(2);
                    if (zzd8 == 1) {
                        zzdwVar.zzn(5);
                    } else if (zzd8 == 2) {
                        zzdwVar.zzn(12);
                    } else if (zzd8 == 3) {
                        int zzd9 = zzdwVar.zzd(5);
                        if (zzdwVar.zzp()) {
                            zzdwVar.zzn(5);
                            if (zzdwVar.zzp()) {
                                zzdwVar.zzn(4);
                            }
                            if (zzdwVar.zzp()) {
                                zzdwVar.zzn(4);
                            }
                            if (zzdwVar.zzp()) {
                                zzdwVar.zzn(4);
                            }
                            if (zzdwVar.zzp()) {
                                zzdwVar.zzn(4);
                            }
                            if (zzdwVar.zzp()) {
                                zzdwVar.zzn(4);
                            }
                            if (zzdwVar.zzp()) {
                                zzdwVar.zzn(4);
                            }
                            if (zzdwVar.zzp()) {
                                zzdwVar.zzn(4);
                            }
                            if (zzdwVar.zzp()) {
                                if (zzdwVar.zzp()) {
                                    zzdwVar.zzn(4);
                                }
                                if (zzdwVar.zzp()) {
                                    zzdwVar.zzn(4);
                                }
                            }
                        }
                        if (zzdwVar.zzp()) {
                            zzdwVar.zzn(5);
                            if (zzdwVar.zzp()) {
                                zzdwVar.zzn(7);
                                if (zzdwVar.zzp()) {
                                    zzdwVar.zzn(8);
                                }
                            }
                        }
                        zzdwVar.zzn((zzd9 + 2) * 8);
                        zzdwVar.zzf();
                    }
                    if (i19 < 2) {
                        if (zzdwVar.zzp()) {
                            zzdwVar.zzn(14);
                        }
                        if (zzd7 == 0 && zzdwVar.zzp()) {
                            zzdwVar.zzn(14);
                        }
                    }
                    if (zzdwVar.zzp()) {
                        if (i16 == 0) {
                            zzdwVar.zzn(5);
                            i20 = 0;
                            i16 = 0;
                        } else {
                            for (int i25 = 0; i25 < i18; i25++) {
                                if (zzdwVar.zzp()) {
                                    zzdwVar.zzn(5);
                                }
                            }
                        }
                    }
                    i20 = 0;
                }
            }
            if (zzdwVar.zzp()) {
                zzdwVar.zzn(5);
                if (i19 == 2) {
                    zzdwVar.zzn(4);
                    i19 = 2;
                }
                if (i19 >= 6) {
                    zzdwVar.zzn(2);
                }
                if (zzdwVar.zzp()) {
                    zzdwVar.zzn(8);
                }
                if (i19 == 0 && zzdwVar.zzp()) {
                    zzdwVar.zzn(8);
                }
                if (zzd5 < 3) {
                    zzdwVar.zzm();
                }
            }
            if (i20 == 0 && i16 != 3) {
                zzdwVar.zzm();
            }
            if (i20 == 2 && (i16 == 3 || zzdwVar.zzp())) {
                zzdwVar.zzn(6);
            }
            str = (zzdwVar.zzp() && zzdwVar.zzd(6) == 1 && zzdwVar.zzd(8) == 1) ? "audio/eac3-joc" : "audio/eac3";
            i11 = i21;
            i13 = i23;
            i14 = i17;
            i15 = i18 * 256;
            i12 = i24;
        } else {
            zzdwVar.zzn(32);
            int zzd10 = zzdwVar.zzd(2);
            String str2 = zzd10 == 3 ? null : "audio/ac3";
            int zzd11 = zzdwVar.zzd(6);
            int i26 = zzf[zzd11 / 2] * 1000;
            int zzf2 = zzf(zzd10, zzd11);
            zzdwVar.zzn(8);
            int zzd12 = zzdwVar.zzd(3);
            if ((zzd12 & 1) != 0 && zzd12 != 1) {
                zzdwVar.zzn(2);
            }
            if ((zzd12 & 4) != 0) {
                zzdwVar.zzn(2);
            }
            if (zzd12 == 2) {
                zzdwVar.zzn(2);
            }
            int i27 = zzd10 < 3 ? zzc[zzd10] : -1;
            i10 = zze[zzd12] + (zzdwVar.zzp() ? 1 : 0);
            str = str2;
            i11 = -1;
            i12 = i26;
            i13 = zzf2;
            i14 = i27;
            i15 = 1536;
        }
        return new zzabg(str, i11, i10, i14, i13, i15, i12, null);
    }

    private static int zzf(int i10, int i11) {
        int i12;
        if (i10 < 0 || i10 >= 3 || i11 < 0 || (i12 = i11 >> 1) >= 19) {
            return -1;
        }
        int i13 = zzc[i10];
        if (i13 == 44100) {
            int i14 = zzg[i12] + (i11 & 1);
            return i14 + i14;
        }
        int i15 = zzf[i12];
        return i13 == 32000 ? i15 * 6 : i15 * 4;
    }
}
