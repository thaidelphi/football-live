package com.google.android.gms.internal.ads;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.util.SparseArray;
import java.util.ArrayList;
import java.util.List;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzajs implements zzajg {
    private static final byte[] zza = {0, 7, 8, 15};
    private static final byte[] zzb = {0, 119, -120, -1};
    private static final byte[] zzc = {0, 17, 34, 51, 68, 85, 102, 119, -120, -103, -86, -69, -52, -35, -18, -1};
    private final Paint zzd;
    private final Paint zze;
    private final Canvas zzf;
    private final zzajl zzg;
    private final zzajk zzh;
    private final zzajr zzi;
    private Bitmap zzj;

    public zzajs(List list) {
        zzdx zzdxVar = new zzdx((byte[]) list.get(0));
        int zzq = zzdxVar.zzq();
        int zzq2 = zzdxVar.zzq();
        Paint paint = new Paint();
        this.zzd = paint;
        paint.setStyle(Paint.Style.FILL_AND_STROKE);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC));
        paint.setPathEffect(null);
        Paint paint2 = new Paint();
        this.zze = paint2;
        paint2.setStyle(Paint.Style.FILL);
        paint2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OVER));
        paint2.setPathEffect(null);
        this.zzf = new Canvas();
        this.zzg = new zzajl(719, 575, 0, 719, 0, 575);
        this.zzh = new zzajk(0, zzg(), zzh(), zzi());
        this.zzi = new zzajr(zzq, zzq2);
    }

    private static int zzb(int i10, int i11, int i12, int i13) {
        return (i10 << 24) | (i11 << 16) | (i12 << 8) | i13;
    }

    private static zzajk zzc(zzdw zzdwVar, int i10) {
        int zzd;
        int i11;
        int zzd2;
        int zzd3;
        int i12 = 8;
        int zzd4 = zzdwVar.zzd(8);
        zzdwVar.zzn(8);
        int[] zzg = zzg();
        int[] zzh = zzh();
        int[] zzi = zzi();
        int i13 = i10 - 2;
        while (i13 > 0) {
            int zzd5 = zzdwVar.zzd(i12);
            int zzd6 = zzdwVar.zzd(i12);
            int i14 = i13 - 2;
            int[] iArr = (zzd6 & 128) != 0 ? zzg : (zzd6 & 64) != 0 ? zzh : zzi;
            if ((zzd6 & 1) != 0) {
                zzd2 = zzdwVar.zzd(i12);
                zzd3 = zzdwVar.zzd(i12);
                zzd = zzdwVar.zzd(i12);
                i11 = zzdwVar.zzd(i12);
                i13 = i14 - 4;
            } else {
                int zzd7 = zzdwVar.zzd(2) << 6;
                i13 = i14 - 2;
                zzd = zzdwVar.zzd(4) << 4;
                i11 = zzd7;
                zzd2 = zzdwVar.zzd(6) << 2;
                zzd3 = zzdwVar.zzd(4) << 4;
            }
            if (zzd2 == 0) {
                i11 = 255;
            }
            if (zzd2 == 0) {
                zzd = 0;
            }
            if (zzd2 == 0) {
                zzd3 = 0;
            }
            double d10 = zzd2;
            int i15 = zzeh.zza;
            double d11 = zzd3 - 128;
            double d12 = zzd - 128;
            iArr[zzd5] = zzb((byte) (255 - (i11 & 255)), Math.max(0, Math.min((int) (d10 + (1.402d * d11)), 255)), Math.max(0, Math.min((int) ((d10 - (0.34414d * d12)) - (d11 * 0.71414d)), 255)), Math.max(0, Math.min((int) (d10 + (d12 * 1.772d)), 255)));
            zzd4 = zzd4;
            i12 = 8;
        }
        return new zzajk(zzd4, zzg, zzh, zzi);
    }

    private static zzajm zzd(zzdw zzdwVar) {
        byte[] bArr;
        int zzd = zzdwVar.zzd(16);
        zzdwVar.zzn(4);
        int zzd2 = zzdwVar.zzd(2);
        boolean zzp = zzdwVar.zzp();
        zzdwVar.zzn(1);
        byte[] bArr2 = zzeh.zzf;
        if (zzd2 == 1) {
            zzdwVar.zzn(zzdwVar.zzd(8) * 16);
        } else if (zzd2 == 0) {
            int zzd3 = zzdwVar.zzd(16);
            int zzd4 = zzdwVar.zzd(16);
            if (zzd3 > 0) {
                bArr2 = new byte[zzd3];
                zzdwVar.zzi(bArr2, 0, zzd3);
            }
            if (zzd4 > 0) {
                bArr = new byte[zzd4];
                zzdwVar.zzi(bArr, 0, zzd4);
                return new zzajm(zzd, zzp, bArr2, bArr);
            }
        }
        bArr = bArr2;
        return new zzajm(zzd, zzp, bArr2, bArr);
    }

    /* JADX WARN: Removed duplicated region for block: B:110:0x01ef A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0228 A[LOOP:3: B:88:0x0172->B:119:0x0228, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:143:0x0222 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0178  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0181  */
    /* JADX WARN: Type inference failed for: r2v28 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void zze(byte[] r24, int[] r25, int r26, int r27, int r28, android.graphics.Paint r29, android.graphics.Canvas r30) {
        /*
            Method dump skipped, instructions count: 584
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzajs.zze(byte[], int[], int, int, int, android.graphics.Paint, android.graphics.Canvas):void");
    }

    private static byte[] zzf(int i10, int i11, zzdw zzdwVar) {
        byte[] bArr = new byte[i10];
        for (int i12 = 0; i12 < i10; i12++) {
            bArr[i12] = (byte) zzdwVar.zzd(i11);
        }
        return bArr;
    }

    private static int[] zzg() {
        return new int[]{0, -1, -16777216, -8421505};
    }

    private static int[] zzh() {
        int[] iArr = new int[16];
        iArr[0] = 0;
        for (int i10 = 1; i10 < 16; i10++) {
            int i11 = i10 & 4;
            int i12 = i10 & 2;
            int i13 = i10 & 1;
            if (i10 < 8) {
                iArr[i10] = zzb(255, 1 != i13 ? 0 : 255, i12 != 0 ? 255 : 0, i11 != 0 ? 255 : 0);
            } else {
                iArr[i10] = zzb(255, 1 != i13 ? 0 : 127, i12 != 0 ? 127 : 0, i11 == 0 ? 0 : 127);
            }
        }
        return iArr;
    }

    private static int[] zzi() {
        int[] iArr = new int[256];
        iArr[0] = 0;
        for (int i10 = 0; i10 < 256; i10++) {
            if (i10 < 8) {
                iArr[i10] = zzb(63, 1 != (i10 & 1) ? 0 : 255, (i10 & 2) != 0 ? 255 : 0, (i10 & 4) == 0 ? 0 : 255);
            } else {
                int i11 = i10 & 136;
                if (i11 == 0) {
                    iArr[i10] = zzb(255, (1 != (i10 & 1) ? 0 : 85) + ((i10 & 16) != 0 ? 170 : 0), ((i10 & 2) != 0 ? 85 : 0) + ((i10 & 32) != 0 ? 170 : 0), ((i10 & 4) == 0 ? 0 : 85) + ((i10 & 64) == 0 ? 0 : 170));
                } else if (i11 == 8) {
                    iArr[i10] = zzb(127, (1 != (i10 & 1) ? 0 : 85) + ((i10 & 16) != 0 ? 170 : 0), ((i10 & 2) != 0 ? 85 : 0) + ((i10 & 32) != 0 ? 170 : 0), ((i10 & 4) == 0 ? 0 : 85) + ((i10 & 64) == 0 ? 0 : 170));
                } else if (i11 == 128) {
                    iArr[i10] = zzb(255, (1 != (i10 & 1) ? 0 : 43) + 127 + ((i10 & 16) != 0 ? 85 : 0), ((i10 & 2) != 0 ? 43 : 0) + 127 + ((i10 & 32) != 0 ? 85 : 0), ((i10 & 4) == 0 ? 0 : 43) + 127 + ((i10 & 64) == 0 ? 0 : 85));
                } else if (i11 == 136) {
                    iArr[i10] = zzb(255, (1 != (i10 & 1) ? 0 : 43) + ((i10 & 16) != 0 ? 85 : 0), ((i10 & 2) != 0 ? 43 : 0) + ((i10 & 32) != 0 ? 85 : 0), ((i10 & 4) == 0 ? 0 : 43) + ((i10 & 64) == 0 ? 0 : 85));
                }
            }
        }
        return iArr;
    }

    @Override // com.google.android.gms.internal.ads.zzajg
    public final void zza(byte[] bArr, int i10, int i11, zzajf zzajfVar, zzda zzdaVar) {
        zzaiy zzaiyVar;
        char c10;
        char c11;
        int i12;
        SparseArray sparseArray;
        int i13;
        SparseArray sparseArray2;
        int[] iArr;
        zzajp zzajpVar;
        int i14;
        int zzd;
        int zzd2;
        int i15;
        int i16;
        int i17;
        int i18;
        zzdw zzdwVar = new zzdw(bArr, i10 + i11);
        zzdwVar.zzl(i10);
        while (zzdwVar.zza() >= 48 && zzdwVar.zzd(8) == 15) {
            zzajr zzajrVar = this.zzi;
            int zzd3 = zzdwVar.zzd(8);
            int zzd4 = zzdwVar.zzd(16);
            int zzd5 = zzdwVar.zzd(16);
            int zzb2 = zzdwVar.zzb() + zzd5;
            if (zzd5 * 8 > zzdwVar.zza()) {
                zzdn.zzf("DvbParser", "Data field length exceeds limit");
                zzdwVar.zzn(zzdwVar.zza());
            } else {
                switch (zzd3) {
                    case 16:
                        if (zzd4 == zzajrVar.zza) {
                            zzajn zzajnVar = zzajrVar.zzi;
                            int zzd6 = zzdwVar.zzd(8);
                            int zzd7 = zzdwVar.zzd(4);
                            int zzd8 = zzdwVar.zzd(2);
                            zzdwVar.zzn(2);
                            SparseArray sparseArray3 = new SparseArray();
                            for (int i19 = zzd5 - 2; i19 > 0; i19 -= 6) {
                                int zzd9 = zzdwVar.zzd(8);
                                zzdwVar.zzn(8);
                                sparseArray3.put(zzd9, new zzajo(zzdwVar.zzd(16), zzdwVar.zzd(16)));
                            }
                            zzajn zzajnVar2 = new zzajn(zzd6, zzd7, zzd8, sparseArray3);
                            if (zzajnVar2.zzb != 0) {
                                zzajrVar.zzi = zzajnVar2;
                                zzajrVar.zzc.clear();
                                zzajrVar.zzd.clear();
                                zzajrVar.zze.clear();
                                break;
                            } else if (zzajnVar != null) {
                                if (zzajnVar.zza != zzajnVar2.zza) {
                                    zzajrVar.zzi = zzajnVar2;
                                    break;
                                }
                            }
                        }
                        break;
                    case 17:
                        zzajn zzajnVar3 = zzajrVar.zzi;
                        if (zzd4 == zzajrVar.zza && zzajnVar3 != null) {
                            int zzd10 = zzdwVar.zzd(8);
                            zzdwVar.zzn(4);
                            boolean zzp = zzdwVar.zzp();
                            zzdwVar.zzn(3);
                            int zzd11 = zzdwVar.zzd(16);
                            int zzd12 = zzdwVar.zzd(16);
                            int zzd13 = zzdwVar.zzd(3);
                            int zzd14 = zzdwVar.zzd(3);
                            zzdwVar.zzn(2);
                            int zzd15 = zzdwVar.zzd(8);
                            int zzd16 = zzdwVar.zzd(8);
                            int zzd17 = zzdwVar.zzd(4);
                            int zzd18 = zzdwVar.zzd(2);
                            zzdwVar.zzn(2);
                            int i20 = zzd5 - 10;
                            SparseArray sparseArray4 = new SparseArray();
                            while (i20 > 0) {
                                int zzd19 = zzdwVar.zzd(16);
                                int zzd20 = zzdwVar.zzd(2);
                                int zzd21 = zzdwVar.zzd(2);
                                int zzd22 = zzdwVar.zzd(12);
                                zzdwVar.zzn(4);
                                int zzd23 = zzdwVar.zzd(12);
                                i20 -= 6;
                                if (zzd20 != 1) {
                                    if (zzd20 == 2) {
                                        zzd20 = 2;
                                    } else {
                                        i14 = zzd20;
                                        zzd = 0;
                                        zzd2 = 0;
                                        sparseArray4.put(zzd19, new zzajq(i14, zzd21, zzd22, zzd23, zzd, zzd2));
                                    }
                                }
                                i20 -= 2;
                                i14 = zzd20;
                                zzd = zzdwVar.zzd(8);
                                zzd2 = zzdwVar.zzd(8);
                                sparseArray4.put(zzd19, new zzajq(i14, zzd21, zzd22, zzd23, zzd, zzd2));
                            }
                            zzajp zzajpVar2 = new zzajp(zzd10, zzp, zzd11, zzd12, zzd13, zzd14, zzd15, zzd16, zzd17, zzd18, sparseArray4);
                            if (zzajnVar3.zzb == 0 && (zzajpVar = (zzajp) zzajrVar.zzc.get(zzajpVar2.zza)) != null) {
                                int i21 = 0;
                                while (true) {
                                    SparseArray sparseArray5 = zzajpVar.zzj;
                                    if (i21 < sparseArray5.size()) {
                                        zzajpVar2.zzj.put(sparseArray5.keyAt(i21), (zzajq) sparseArray5.valueAt(i21));
                                        i21++;
                                    }
                                }
                            }
                            zzajrVar.zzc.put(zzajpVar2.zza, zzajpVar2);
                            break;
                        }
                        break;
                    case 18:
                        if (zzd4 == zzajrVar.zza) {
                            zzajk zzc2 = zzc(zzdwVar, zzd5);
                            zzajrVar.zzd.put(zzc2.zza, zzc2);
                            break;
                        } else if (zzd4 == zzajrVar.zzb) {
                            zzajk zzc3 = zzc(zzdwVar, zzd5);
                            zzajrVar.zzf.put(zzc3.zza, zzc3);
                            break;
                        }
                        break;
                    case 19:
                        if (zzd4 == zzajrVar.zza) {
                            zzajm zzd24 = zzd(zzdwVar);
                            zzajrVar.zze.put(zzd24.zza, zzd24);
                            break;
                        } else if (zzd4 == zzajrVar.zzb) {
                            zzajm zzd25 = zzd(zzdwVar);
                            zzajrVar.zzg.put(zzd25.zza, zzd25);
                            break;
                        }
                        break;
                    case 20:
                        if (zzd4 == zzajrVar.zza) {
                            zzdwVar.zzn(4);
                            boolean zzp2 = zzdwVar.zzp();
                            zzdwVar.zzn(3);
                            int zzd26 = zzdwVar.zzd(16);
                            int zzd27 = zzdwVar.zzd(16);
                            if (zzp2) {
                                int zzd28 = zzdwVar.zzd(16);
                                i15 = zzdwVar.zzd(16);
                                i18 = zzdwVar.zzd(16);
                                i16 = zzdwVar.zzd(16);
                                i17 = zzd28;
                            } else {
                                i15 = zzd26;
                                i16 = zzd27;
                                i17 = 0;
                                i18 = 0;
                            }
                            zzajrVar.zzh = new zzajl(zzd26, zzd27, i17, i15, i18, i16);
                            break;
                        }
                        break;
                }
                zzdwVar.zzo(zzb2 - zzdwVar.zzb());
            }
        }
        zzajr zzajrVar2 = this.zzi;
        zzajn zzajnVar4 = zzajrVar2.zzi;
        if (zzajnVar4 == null) {
            zzaiyVar = new zzaiy(zzfvv.zzn(), -9223372036854775807L, -9223372036854775807L);
        } else {
            zzajl zzajlVar = zzajrVar2.zzh;
            if (zzajlVar == null) {
                zzajlVar = this.zzg;
            }
            Bitmap bitmap = this.zzj;
            if (bitmap == null || zzajlVar.zza + 1 != bitmap.getWidth() || zzajlVar.zzb + 1 != this.zzj.getHeight()) {
                Bitmap createBitmap = Bitmap.createBitmap(zzajlVar.zza + 1, zzajlVar.zzb + 1, Bitmap.Config.ARGB_8888);
                this.zzj = createBitmap;
                this.zzf.setBitmap(createBitmap);
            }
            ArrayList arrayList = new ArrayList();
            SparseArray sparseArray6 = zzajnVar4.zzc;
            int i22 = 0;
            while (i22 < sparseArray6.size()) {
                this.zzf.save();
                zzajo zzajoVar = (zzajo) sparseArray6.valueAt(i22);
                zzajp zzajpVar3 = (zzajp) this.zzi.zzc.get(sparseArray6.keyAt(i22));
                int i23 = zzajoVar.zza + zzajlVar.zzc;
                int i24 = zzajoVar.zzb + zzajlVar.zze;
                this.zzf.clipRect(i23, i24, Math.min(zzajpVar3.zzc + i23, zzajlVar.zzd), Math.min(zzajpVar3.zzd + i24, zzajlVar.zzf));
                zzajk zzajkVar = (zzajk) this.zzi.zzd.get(zzajpVar3.zzf);
                if (zzajkVar == null) {
                    zzajkVar = (zzajk) this.zzi.zzf.get(zzajpVar3.zzf);
                    if (zzajkVar == null) {
                        zzajkVar = this.zzh;
                    }
                }
                SparseArray sparseArray7 = zzajpVar3.zzj;
                int i25 = 0;
                while (i25 < sparseArray7.size()) {
                    int keyAt = sparseArray7.keyAt(i25);
                    zzajq zzajqVar = (zzajq) sparseArray7.valueAt(i25);
                    zzajm zzajmVar = (zzajm) this.zzi.zze.get(keyAt);
                    if (zzajmVar == null) {
                        zzajmVar = (zzajm) this.zzi.zzg.get(keyAt);
                    }
                    if (zzajmVar != null) {
                        Paint paint = zzajmVar.zzb ? null : this.zzd;
                        int i26 = zzajpVar3.zze;
                        int i27 = zzajqVar.zza + i23;
                        int i28 = zzajqVar.zzb + i24;
                        sparseArray = sparseArray6;
                        Canvas canvas = this.zzf;
                        sparseArray2 = sparseArray7;
                        if (i26 == 3) {
                            iArr = zzajkVar.zzd;
                        } else if (i26 == 2) {
                            iArr = zzajkVar.zzc;
                        } else {
                            iArr = zzajkVar.zzb;
                        }
                        i13 = i22;
                        int[] iArr2 = iArr;
                        Paint paint2 = paint;
                        zze(zzajmVar.zzc, iArr2, i26, i27, i28, paint2, canvas);
                        zze(zzajmVar.zzd, iArr2, i26, i27, i28 + 1, paint2, canvas);
                    } else {
                        sparseArray = sparseArray6;
                        i13 = i22;
                        sparseArray2 = sparseArray7;
                    }
                    i25++;
                    sparseArray6 = sparseArray;
                    sparseArray7 = sparseArray2;
                    i22 = i13;
                }
                SparseArray sparseArray8 = sparseArray6;
                int i29 = i22;
                float f10 = i24;
                float f11 = i23;
                if (zzajpVar3.zzb) {
                    int i30 = zzajpVar3.zze;
                    c10 = 3;
                    if (i30 == 3) {
                        i12 = zzajkVar.zzd[zzajpVar3.zzg];
                        c11 = 2;
                    } else {
                        c11 = 2;
                        if (i30 == 2) {
                            i12 = zzajkVar.zzc[zzajpVar3.zzh];
                        } else {
                            i12 = zzajkVar.zzb[zzajpVar3.zzi];
                        }
                    }
                    this.zze.setColor(i12);
                    this.zzf.drawRect(f11, f10, zzajpVar3.zzc + i23, zzajpVar3.zzd + i24, this.zze);
                } else {
                    c10 = 3;
                    c11 = 2;
                }
                zzcl zzclVar = new zzcl();
                zzclVar.zzc(Bitmap.createBitmap(this.zzj, i23, i24, zzajpVar3.zzc, zzajpVar3.zzd));
                zzclVar.zzh(f11 / zzajlVar.zza);
                zzclVar.zzi(0);
                zzclVar.zze(f10 / zzajlVar.zzb, 0);
                zzclVar.zzf(0);
                zzclVar.zzk(zzajpVar3.zzc / zzajlVar.zza);
                zzclVar.zzd(zzajpVar3.zzd / zzajlVar.zzb);
                arrayList.add(zzclVar.zzp());
                this.zzf.drawColor(0, PorterDuff.Mode.CLEAR);
                this.zzf.restore();
                i22 = i29 + 1;
                sparseArray6 = sparseArray8;
            }
            zzaiyVar = new zzaiy(arrayList, -9223372036854775807L, -9223372036854775807L);
        }
        zzdaVar.zza(zzaiyVar);
    }
}
