package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzwk extends zzwm {
    /* JADX INFO: Access modifiers changed from: protected */
    public zzwk(zzbo zzboVar, int[] iArr, int i10, zzyd zzydVar, long j10, long j11, long j12, int i11, int i12, float f10, float f11, List list, zzcw zzcwVar) {
        super(zzboVar, iArr, 0);
        zzfvv.zzl(list);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* bridge */ /* synthetic */ zzfvv zzh(zzxo[] zzxoVarArr) {
        int i10;
        int i11;
        ArrayList arrayList = new ArrayList();
        int i12 = 0;
        int i13 = 0;
        while (true) {
            i10 = 2;
            i11 = 1;
            if (i13 >= 2) {
                break;
            }
            zzxo zzxoVar = zzxoVarArr[i13];
            if (zzxoVar != null && zzxoVar.zzb.length > 1) {
                int i14 = zzfvv.zzd;
                zzfvs zzfvsVar = new zzfvs();
                zzfvsVar.zzf(new zzwi(0L, 0L));
                arrayList.add(zzfvsVar);
            } else {
                arrayList.add(null);
            }
            i13++;
        }
        long[][] jArr = new long[2];
        for (int i15 = 0; i15 < 2; i15++) {
            zzxo zzxoVar2 = zzxoVarArr[i15];
            if (zzxoVar2 == null) {
                jArr[i15] = new long[0];
            } else {
                jArr[i15] = new long[zzxoVar2.zzb.length];
                int i16 = 0;
                while (true) {
                    int[] iArr = zzxoVar2.zzb;
                    if (i16 >= iArr.length) {
                        break;
                    }
                    long j10 = zzxoVar2.zza.zzb(iArr[i16]).zzj;
                    long[] jArr2 = jArr[i15];
                    if (j10 == -1) {
                        j10 = 0;
                    }
                    jArr2[i16] = j10;
                    i16++;
                }
                Arrays.sort(jArr[i15]);
            }
        }
        int[] iArr2 = new int[2];
        long[] jArr3 = new long[2];
        for (int i17 = 0; i17 < 2; i17++) {
            long[] jArr4 = jArr[i17];
            jArr3[i17] = jArr4.length == 0 ? 0L : jArr4[0];
        }
        zzi(arrayList, jArr3);
        zzfwg zza = zzfxb.zzc(zzfxg.zzc()).zzb(2).zza();
        int i18 = 0;
        while (i18 < i10) {
            int length = jArr[i18].length;
            if (length > i11) {
                double[] dArr = new double[length];
                int i19 = i12;
                while (true) {
                    long[] jArr5 = jArr[i18];
                    double d10 = 0.0d;
                    if (i19 >= jArr5.length) {
                        break;
                    }
                    long j11 = jArr5[i19];
                    if (j11 != -1) {
                        d10 = Math.log(j11);
                    }
                    dArr[i19] = d10;
                    i19++;
                }
                int i20 = length - 1;
                double d11 = dArr[i20] - dArr[i12];
                int i21 = i12;
                while (i21 < i20) {
                    double d12 = dArr[i21];
                    i21++;
                    zza.zzq(Double.valueOf(d11 == 0.0d ? 1.0d : (((d12 + dArr[i21]) * 0.5d) - dArr[i12]) / d11), Integer.valueOf(i18));
                    i12 = 0;
                }
            }
            i18++;
            i12 = 0;
            i10 = 2;
            i11 = 1;
        }
        zzfvv zzl = zzfvv.zzl(zza.zzr());
        for (int i22 = 0; i22 < zzl.size(); i22++) {
            int intValue = ((Integer) zzl.get(i22)).intValue();
            int i23 = iArr2[intValue] + 1;
            iArr2[intValue] = i23;
            jArr3[intValue] = jArr[intValue][i23];
            zzi(arrayList, jArr3);
        }
        for (int i24 = 0; i24 < 2; i24++) {
            if (arrayList.get(i24) != null) {
                long j12 = jArr3[i24];
                jArr3[i24] = j12 + j12;
            }
        }
        zzi(arrayList, jArr3);
        zzfvs zzfvsVar2 = new zzfvs();
        for (int i25 = 0; i25 < arrayList.size(); i25++) {
            zzfvs zzfvsVar3 = (zzfvs) arrayList.get(i25);
            zzfvsVar2.zzf(zzfvsVar3 == null ? zzfvv.zzn() : zzfvsVar3.zzi());
        }
        return zzfvsVar2.zzi();
    }

    private static void zzi(List list, long[] jArr) {
        long j10 = 0;
        for (int i10 = 0; i10 < 2; i10++) {
            j10 += jArr[i10];
        }
        for (int i11 = 0; i11 < list.size(); i11++) {
            zzfvs zzfvsVar = (zzfvs) list.get(i11);
            if (zzfvsVar != null) {
                zzfvsVar.zzf(new zzwi(j10, jArr[i11]));
            }
        }
    }
}
