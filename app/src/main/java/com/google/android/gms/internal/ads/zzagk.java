package com.google.android.gms.internal.ads;

import android.util.Pair;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.UUID;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzagk {
    public byte[] zzO;
    public zzadq zzU;
    public boolean zzV;
    public zzadp zzX;
    public int zzY;
    private int zzZ;
    public boolean zza;
    public String zzb;
    public String zzc;
    public int zzd;
    public int zze;
    public int zzf;
    public int zzg;
    public boolean zzh;
    public byte[] zzi;
    public zzado zzj;
    public byte[] zzk;
    public zzs zzl;
    public int zzm = -1;
    public int zzn = -1;
    public int zzo = -1;
    public int zzp = -1;
    public int zzq = -1;
    public int zzr = 0;
    public int zzs = -1;
    public float zzt = 0.0f;
    public float zzu = 0.0f;
    public float zzv = 0.0f;
    public byte[] zzw = null;
    public int zzx = -1;
    public boolean zzy = false;
    public int zzz = -1;
    public int zzA = -1;
    public int zzB = -1;
    public int zzC = 1000;
    public int zzD = 200;
    public float zzE = -1.0f;
    public float zzF = -1.0f;
    public float zzG = -1.0f;
    public float zzH = -1.0f;
    public float zzI = -1.0f;
    public float zzJ = -1.0f;
    public float zzK = -1.0f;
    public float zzL = -1.0f;
    public float zzM = -1.0f;
    public float zzN = -1.0f;
    public int zzP = 1;
    public int zzQ = -1;
    public int zzR = 8000;
    public long zzS = 0;
    public long zzT = 0;
    public boolean zzW = true;
    private String zzaa = "eng";

    private static Pair zzf(zzdx zzdxVar) throws zzaz {
        try {
            zzdxVar.zzM(16);
            long zzs = zzdxVar.zzs();
            if (zzs == 1482049860) {
                return new Pair("video/divx", null);
            }
            if (zzs == 859189832) {
                return new Pair("video/3gpp", null);
            }
            if (zzs != 826496599) {
                zzdn.zzf("MatroskaExtractor", "Unknown FourCC. Setting mimeType to video/x-unknown");
                return new Pair("video/x-unknown", null);
            }
            int zzd = zzdxVar.zzd() + 20;
            byte[] zzN = zzdxVar.zzN();
            while (true) {
                int length = zzN.length;
                if (zzd < length - 4) {
                    int i10 = zzd + 1;
                    if (zzN[zzd] == 0 && zzN[i10] == 0 && zzN[zzd + 2] == 1 && zzN[zzd + 3] == 15) {
                        return new Pair("video/wvc1", Collections.singletonList(Arrays.copyOfRange(zzN, zzd, length)));
                    }
                    zzd = i10;
                } else {
                    throw zzaz.zza("Failed to find FourCC VC1 initialization data", null);
                }
            }
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw zzaz.zza("Error parsing FourCC private data", null);
        }
    }

    private static List zzg(byte[] bArr) throws zzaz {
        int i10;
        int i11;
        try {
            if (bArr[0] == 2) {
                int i12 = 0;
                int i13 = 1;
                while (true) {
                    int i14 = bArr[i13];
                    i13++;
                    i10 = i14 & 255;
                    if (i10 != 255) {
                        break;
                    }
                    i12 += 255;
                }
                int i15 = i12 + i10;
                int i16 = 0;
                while (true) {
                    int i17 = bArr[i13];
                    i13++;
                    i11 = i17 & 255;
                    if (i11 != 255) {
                        break;
                    }
                    i16 += 255;
                }
                int i18 = i16 + i11;
                if (bArr[i13] == 1) {
                    byte[] bArr2 = new byte[i15];
                    System.arraycopy(bArr, i13, bArr2, 0, i15);
                    int i19 = i13 + i15;
                    if (bArr[i19] == 3) {
                        int i20 = i19 + i18;
                        if (bArr[i20] == 5) {
                            int length = bArr.length - i20;
                            byte[] bArr3 = new byte[length];
                            System.arraycopy(bArr, i20, bArr3, 0, length);
                            ArrayList arrayList = new ArrayList(2);
                            arrayList.add(bArr2);
                            arrayList.add(bArr3);
                            return arrayList;
                        }
                        throw zzaz.zza("Error parsing vorbis codec private", null);
                    }
                    throw zzaz.zza("Error parsing vorbis codec private", null);
                }
                throw zzaz.zza("Error parsing vorbis codec private", null);
            }
            throw zzaz.zza("Error parsing vorbis codec private", null);
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw zzaz.zza("Error parsing vorbis codec private", null);
        }
    }

    private static boolean zzh(zzdx zzdxVar) throws zzaz {
        UUID uuid;
        UUID uuid2;
        try {
            int zzk = zzdxVar.zzk();
            if (zzk == 1) {
                return true;
            }
            if (zzk == 65534) {
                zzdxVar.zzL(24);
                long zzt = zzdxVar.zzt();
                uuid = zzagm.zze;
                if (zzt == uuid.getMostSignificantBits()) {
                    long zzt2 = zzdxVar.zzt();
                    uuid2 = zzagm.zze;
                    if (zzt2 == uuid2.getLeastSignificantBits()) {
                        return true;
                    }
                }
            }
            return false;
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw zzaz.zza("Error parsing MS/ACM codec private", null);
        }
    }

    private final byte[] zzi(String str) throws zzaz {
        byte[] bArr = this.zzk;
        if (bArr != null) {
            return bArr;
        }
        throw zzaz.zza("Missing CodecPrivate for codec ".concat(String.valueOf(str)), null);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:472:0x03c0  */
    /* JADX WARN: Removed duplicated region for block: B:477:0x03d9  */
    /* JADX WARN: Removed duplicated region for block: B:478:0x03db  */
    /* JADX WARN: Removed duplicated region for block: B:481:0x03e8  */
    /* JADX WARN: Removed duplicated region for block: B:482:0x03f8  */
    /* JADX WARN: Removed duplicated region for block: B:571:0x05d4  */
    /* JADX WARN: Removed duplicated region for block: B:576:0x05ee  */
    /* JADX WARN: Removed duplicated region for block: B:577:0x05f1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void zze(com.google.android.gms.internal.ads.zzacm r21, int r22) throws com.google.android.gms.internal.ads.zzaz {
        /*
            Method dump skipped, instructions count: 1774
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzagk.zze(com.google.android.gms.internal.ads.zzacm, int):void");
    }
}
