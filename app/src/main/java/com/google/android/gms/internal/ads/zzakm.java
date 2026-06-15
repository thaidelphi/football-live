package com.google.android.gms.internal.ads;

import android.graphics.Bitmap;
import android.graphics.Rect;
import java.util.Arrays;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
final class zzakm {
    private boolean zzb;
    private boolean zzc;
    private int[] zzd;
    private int zze;
    private int zzf;
    private Rect zzg;
    private final int[] zza = new int[4];
    private int zzh = -1;
    private int zzi = -1;

    private static int zze(int[] iArr, int i10) {
        if (i10 >= iArr.length) {
            i10 = 0;
        }
        return iArr[i10];
    }

    private static int zzf(int i10, int i11) {
        return (i10 & 16777215) | ((i11 * 17) << 24);
    }

    private final void zzg(zzdw zzdwVar, boolean z10, Rect rect, int[] iArr) {
        int i10;
        int i11;
        int i12 = !z10 ? 1 : 0;
        int width = rect.width();
        int i13 = i12 * width;
        int height = rect.height();
        while (true) {
            int i14 = 0;
            do {
                int i15 = 0;
                for (int i16 = 1; i15 < i16 && i16 <= 64; i16 <<= 2) {
                    if (zzdwVar.zza() < 4) {
                        i10 = -1;
                        i11 = 0;
                        break;
                    }
                    i15 = (i15 << 4) | zzdwVar.zzd(4);
                }
                i10 = i15 & 3;
                i11 = i15 < 4 ? width : i15 >> 2;
                int min = Math.min(i11, width - i14);
                if (min > 0) {
                    int i17 = i13 + min;
                    Arrays.fill(iArr, i13, i17, this.zza[i10]);
                    i14 += min;
                    i13 = i17;
                    continue;
                }
            } while (i14 < width);
            i12 += 2;
            if (i12 >= height) {
                return;
            }
            i13 = i12 * width;
            zzdwVar.zzf();
        }
    }

    public final zzcn zza(zzdx zzdxVar) {
        Rect rect;
        if (this.zzd == null || !this.zzb || !this.zzc || (rect = this.zzg) == null || this.zzh == -1 || this.zzi == -1 || rect.width() < 2 || this.zzg.height() < 2) {
            return null;
        }
        Rect rect2 = this.zzg;
        int[] iArr = new int[rect2.width() * rect2.height()];
        zzdw zzdwVar = new zzdw();
        zzdxVar.zzL(this.zzh);
        zzdwVar.zzj(zzdxVar);
        zzg(zzdwVar, true, rect2, iArr);
        zzdxVar.zzL(this.zzi);
        zzdwVar.zzj(zzdxVar);
        zzg(zzdwVar, false, rect2, iArr);
        Bitmap createBitmap = Bitmap.createBitmap(iArr, rect2.width(), rect2.height(), Bitmap.Config.ARGB_8888);
        zzcl zzclVar = new zzcl();
        zzclVar.zzc(createBitmap);
        zzclVar.zzh(rect2.left / this.zze);
        zzclVar.zzi(0);
        zzclVar.zze(rect2.top / this.zzf, 0);
        zzclVar.zzf(0);
        zzclVar.zzk(rect2.width() / this.zze);
        zzclVar.zzd(rect2.height() / this.zzf);
        return zzclVar.zzp();
    }

    public final void zzb(String str) {
        String[] split;
        int i10;
        String trim = str.trim();
        int i11 = zzeh.zza;
        for (String str2 : trim.split("\\r?\\n", -1)) {
            if (str2.startsWith("palette: ")) {
                String[] split2 = str2.substring(9).split(",", -1);
                this.zzd = new int[split2.length];
                for (int i12 = 0; i12 < split2.length; i12++) {
                    int[] iArr = this.zzd;
                    try {
                        i10 = Integer.parseInt(split2[i12].trim(), 16);
                    } catch (RuntimeException unused) {
                        i10 = 0;
                    }
                    iArr[i12] = i10;
                }
            } else if (str2.startsWith("size: ")) {
                String[] split3 = str2.substring(6).trim().split("x", -1);
                if (split3.length == 2) {
                    try {
                        this.zze = Integer.parseInt(split3[0]);
                        this.zzf = Integer.parseInt(split3[1]);
                        this.zzb = true;
                    } catch (RuntimeException e8) {
                        zzdn.zzg("VobsubParser", "Parsing IDX failed", e8);
                    }
                }
            }
        }
    }

    public final void zzc(zzdx zzdxVar) {
        int[] iArr = this.zzd;
        if (iArr == null || !this.zzb) {
            return;
        }
        zzdxVar.zzM(zzdxVar.zzq() - 2);
        int zzq = zzdxVar.zzq();
        while (zzdxVar.zzd() < zzq && zzdxVar.zzb() > 0) {
            int zzm = zzdxVar.zzm();
            if (zzm != 3) {
                if (zzm != 4) {
                    if (zzm != 5) {
                        if (zzm != 6 || zzdxVar.zzb() < 4) {
                            return;
                        }
                        this.zzh = zzdxVar.zzq();
                        this.zzi = zzdxVar.zzq();
                    } else if (zzdxVar.zzb() < 6) {
                        return;
                    } else {
                        int zzm2 = zzdxVar.zzm();
                        int zzm3 = zzdxVar.zzm();
                        int i10 = zzm3 >> 4;
                        int zzm4 = ((zzm3 & 15) << 8) | zzdxVar.zzm();
                        int zzm5 = zzdxVar.zzm();
                        int zzm6 = zzdxVar.zzm();
                        this.zzg = new Rect((zzm2 << 4) | i10, (zzm5 << 4) | (zzm6 >> 4), zzm4 + 1, (((zzm6 & 15) << 8) | zzdxVar.zzm()) + 1);
                    }
                } else if (zzdxVar.zzb() < 2 || !this.zzc) {
                    return;
                } else {
                    int zzm7 = zzdxVar.zzm();
                    int zzm8 = zzdxVar.zzm();
                    int[] iArr2 = this.zza;
                    iArr2[3] = zzf(iArr2[3], zzm7 >> 4);
                    iArr2[2] = zzf(iArr2[2], zzm7 & 15);
                    iArr2[1] = zzf(iArr2[1], zzm8 >> 4);
                    iArr2[0] = zzf(iArr2[0], zzm8 & 15);
                }
            } else if (zzdxVar.zzb() < 2) {
                return;
            } else {
                int zzm9 = zzdxVar.zzm();
                int zzm10 = zzdxVar.zzm();
                this.zza[3] = zze(iArr, zzm9 >> 4);
                this.zza[2] = zze(iArr, zzm9 & 15);
                this.zza[1] = zze(iArr, zzm10 >> 4);
                this.zza[0] = zze(iArr, zzm10 & 15);
                this.zzc = true;
            }
        }
    }

    public final void zzd() {
        this.zzc = false;
        this.zzg = null;
        this.zzh = -1;
        this.zzi = -1;
    }
}
