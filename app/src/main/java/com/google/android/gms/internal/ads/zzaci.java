package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.AdRequest;
import com.google.protobuf.CodedOutputStream;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.math.RoundingMode;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicInteger;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzaci {
    public static final /* synthetic */ int zza = 0;
    private static final int[] zzb = {1, 2, 2, 2, 2, 3, 3, 4, 4, 5, 6, 6, 6, 7, 8, 8};
    private static final int[] zzc = {-1, 8000, 16000, 32000, -1, -1, 11025, 22050, 44100, -1, -1, 12000, 24000, 48000, -1, -1};
    private static final int[] zzd = {64, 112, 128, 192, 224, 256, 384, 448, AdRequest.MAX_CONTENT_URL_LENGTH, 640, 768, 896, 1024, 1152, 1280, 1536, 1920, com.ironsource.mediationsdk.metadata.a.f18931n, IronSourceConstants.IS_AD_UNIT_CAPPED, 2560, 2688, 2816, 2823, 2944, 3072, 3840, CodedOutputStream.DEFAULT_BUFFER_SIZE, 6144, 7680};
    private static final int[] zze = {8000, 16000, 32000, 64000, 128000, 22050, 44100, 88200, 176400, 352800, 12000, 24000, 48000, 96000, 192000, 384000};
    private static final int[] zzf = {5, 8, 10, 12};
    private static final int[] zzg = {6, 9, 12, 15};
    private static final int[] zzh = {2, 4, 6, 8};
    private static final int[] zzi = {9, 11, 13, 16};
    private static final int[] zzj = {5, 8, 10, 12};

    public static int zza(byte[] bArr) {
        zzdw zzg2 = zzg(bArr);
        zzg2.zzn(42);
        return zzg2.zzd(true != zzg2.zzp() ? 8 : 12) + 1;
    }

    public static int zzb(byte[] bArr) {
        zzdw zzg2 = zzg(bArr);
        zzg2.zzn(32);
        return zzf(zzg2, zzj, true) + 1;
    }

    public static zzz zzc(byte[] bArr, String str, String str2, int i10, String str3, zzs zzsVar) {
        zzdw zzg2 = zzg(bArr);
        zzg2.zzn(60);
        int i11 = zzb[zzg2.zzd(6)];
        int i12 = zzc[zzg2.zzd(4)];
        int zzd2 = zzg2.zzd(5);
        int i13 = zzd2 >= 29 ? -1 : (zzd[zzd2] * 1000) / 2;
        zzg2.zzn(10);
        int i14 = i11 + (zzg2.zzd(2) > 0 ? 1 : 0);
        zzx zzxVar = new zzx();
        zzxVar.zzO(str);
        zzxVar.zzE("video/mp2t");
        zzxVar.zzad("audio/vnd.dts");
        zzxVar.zzA(i13);
        zzxVar.zzB(i14);
        zzxVar.zzae(i12);
        zzxVar.zzH(null);
        zzxVar.zzS(str2);
        zzxVar.zzab(i10);
        return zzxVar.zzaj();
    }

    public static zzacg zzd(byte[] bArr) throws zzaz {
        int i10;
        int i11;
        int i12;
        long j10;
        int i13;
        zzdw zzg2 = zzg(bArr);
        zzg2.zzn(40);
        int zzd2 = zzg2.zzd(2);
        boolean zzp = zzg2.zzp();
        int i14 = true != zzp ? 16 : 20;
        zzg2.zzn(true != zzp ? 8 : 12);
        int zzd3 = zzg2.zzd(i14) + 1;
        boolean zzp2 = zzg2.zzp();
        int i15 = 0;
        if (zzp2) {
            i10 = zzg2.zzd(2);
            int zzd4 = zzg2.zzd(3) + 1;
            if (zzg2.zzp()) {
                zzg2.zzn(36);
            }
            int zzd5 = zzg2.zzd(3) + 1;
            int zzd6 = zzg2.zzd(3) + 1;
            if (zzd5 == 1 && zzd6 == 1) {
                int i16 = zzd2 + 1;
                int zzd7 = zzg2.zzd(i16);
                for (int i17 = 0; i17 < i16; i17++) {
                    if (((zzd7 >> i17) & 1) == 1) {
                        zzg2.zzn(8);
                    }
                }
                int i18 = zzd4 * AdRequest.MAX_CONTENT_URL_LENGTH;
                if (zzg2.zzp()) {
                    zzg2.zzn(2);
                    int zzd8 = (zzg2.zzd(2) + 1) << 2;
                    int zzd9 = zzg2.zzd(2) + 1;
                    while (i15 < zzd9) {
                        zzg2.zzn(zzd8);
                        i15++;
                    }
                }
                i15 = i18;
            } else {
                throw zzaz.zzc("Multiple audio presentations or assets not supported");
            }
        } else {
            i10 = -1;
        }
        zzg2.zzn(i14);
        zzg2.zzn(12);
        if (zzp2) {
            if (zzg2.zzp()) {
                zzg2.zzn(4);
            }
            if (zzg2.zzp()) {
                zzg2.zzn(24);
            }
            if (zzg2.zzp()) {
                zzg2.zzo(zzg2.zzd(10) + 1);
            }
            zzg2.zzn(5);
            int i19 = zze[zzg2.zzd(4)];
            i12 = zzg2.zzd(8) + 1;
            i11 = i19;
        } else {
            i11 = -2147483647;
            i12 = -1;
        }
        if (zzp2) {
            if (i10 == 0) {
                i13 = 32000;
            } else if (i10 == 1) {
                i13 = 44100;
            } else if (i10 != 2) {
                throw zzaz.zza("Unsupported reference clock code in DTS HD header: " + i10, null);
            } else {
                i13 = 48000;
            }
            j10 = zzeh.zzu(i15, 1000000L, i13, RoundingMode.DOWN);
        } else {
            j10 = -9223372036854775807L;
        }
        return new zzacg("audio/vnd.dts.hd;profile=lbr", i12, i11, zzd3, j10, 0, null);
    }

    public static zzacg zze(byte[] bArr, AtomicInteger atomicInteger) throws zzaz {
        long j10;
        int i10;
        int i11;
        int i12;
        zzdw zzg2 = zzg(bArr);
        int zzd2 = zzg2.zzd(32);
        int zzf2 = zzf(zzg2, zzf, true) + 1;
        char c10 = zzd2 == 1078008818 ? (char) 1 : (char) 0;
        if (c10 == 0) {
            j10 = -9223372036854775807L;
            i10 = -2147483647;
        } else if (zzg2.zzp()) {
            int i13 = zzf2 - 2;
            if ((((char) (bArr[i13] << 8)) | (bArr[zzf2 - 1] & 255)) == zzeh.zze(bArr, 0, i13, 65535)) {
                int zzd3 = zzg2.zzd(2);
                if (zzd3 == 0) {
                    i11 = AdRequest.MAX_CONTENT_URL_LENGTH;
                } else if (zzd3 == 1) {
                    i11 = 480;
                } else if (zzd3 != 2) {
                    throw zzaz.zza("Unsupported base duration index in DTS UHD header: " + zzd3, null);
                } else {
                    i11 = 384;
                }
                int zzd4 = zzg2.zzd(3) + 1;
                int zzd5 = zzg2.zzd(2);
                if (zzd5 == 0) {
                    i12 = 32000;
                } else if (zzd5 == 1) {
                    i12 = 44100;
                } else if (zzd5 != 2) {
                    throw zzaz.zza("Unsupported clock rate index in DTS UHD header: " + zzd5, null);
                } else {
                    i12 = 48000;
                }
                if (zzg2.zzp()) {
                    zzg2.zzn(36);
                }
                i10 = (1 << zzg2.zzd(2)) * i12;
                j10 = zzeh.zzu(i11 * zzd4, 1000000L, i12, RoundingMode.DOWN);
            } else {
                throw zzaz.zza("CRC check failed", null);
            }
        } else {
            throw zzaz.zzc("Only supports full channel mask-based audio presentation");
        }
        int i14 = i10;
        long j11 = j10;
        int i15 = 0;
        for (char c11 = 0; c11 < c10; c11 = 1) {
            i15 += zzf(zzg2, zzg, true);
        }
        for (int i16 = 0; i16 <= 0; i16++) {
            if (c10 != 0) {
                atomicInteger.set(zzf(zzg2, zzh, true));
            }
            i15 += atomicInteger.get() != 0 ? zzf(zzg2, zzi, true) : 0;
        }
        return new zzacg("audio/vnd.dts.uhd;profile=p2", 2, i14, zzf2 + i15, j11, 0, null);
    }

    private static int zzf(zzdw zzdwVar, int[] iArr, boolean z10) {
        int i10 = 0;
        for (int i11 = 0; i11 < 3 && zzdwVar.zzp(); i11++) {
            i10++;
        }
        int i12 = 0;
        for (int i13 = 0; i13 < i10; i13++) {
            i12 += 1 << iArr[i13];
        }
        return i12 + zzdwVar.zzd(iArr[i10]);
    }

    private static zzdw zzg(byte[] bArr) {
        byte b10 = bArr[0];
        if (b10 != Byte.MAX_VALUE && b10 != 100 && b10 != 64 && b10 != 113) {
            byte[] copyOf = Arrays.copyOf(bArr, bArr.length);
            byte b11 = copyOf[0];
            if (b11 == -2 || b11 == -1 || b11 == 37 || b11 == -14 || b11 == -24) {
                for (int i10 = 0; i10 < copyOf.length - 1; i10 += 2) {
                    byte b12 = copyOf[i10];
                    int i11 = i10 + 1;
                    copyOf[i10] = copyOf[i11];
                    copyOf[i11] = b12;
                }
            }
            int length = copyOf.length;
            zzdw zzdwVar = new zzdw(copyOf, length);
            if (copyOf[0] == 31) {
                zzdw zzdwVar2 = new zzdw(copyOf, length);
                while (zzdwVar2.zza() >= 16) {
                    zzdwVar2.zzn(2);
                    zzdwVar.zzg(zzdwVar2.zzd(14), 14);
                }
            }
            zzdwVar.zzk(copyOf, copyOf.length);
            return zzdwVar;
        }
        return new zzdw(bArr, bArr.length);
    }
}
