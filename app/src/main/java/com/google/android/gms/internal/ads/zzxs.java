package com.google.android.gms.internal.ads;

import android.util.Pair;
import java.util.Arrays;
import java.util.List;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public abstract class zzxs extends zzxv {
    protected abstract Pair zzd(zzxr zzxrVar, int[][][] iArr, int[] iArr2, zzty zztyVar, zzbn zzbnVar) throws zzhs;

    @Override // com.google.android.gms.internal.ads.zzxv
    public final zzxw zzo(zzld[] zzldVarArr, zzwd zzwdVar, zzty zztyVar, zzbn zzbnVar) throws zzhs {
        boolean z10;
        int[] iArr;
        int[] iArr2 = new int[3];
        zzbo[][] zzboVarArr = new zzbo[3];
        int[][][] iArr3 = new int[3][];
        for (int i10 = 0; i10 < 3; i10++) {
            int i11 = zzwdVar.zzb;
            zzboVarArr[i10] = new zzbo[i11];
            iArr3[i10] = new int[i11];
        }
        int i12 = 2;
        int[] iArr4 = new int[2];
        for (int i13 = 0; i13 < 2; i13++) {
            iArr4[i13] = zzldVarArr[i13].zze();
        }
        int i14 = 0;
        while (i14 < zzwdVar.zzb) {
            zzbo zzb = zzwdVar.zzb(i14);
            int i15 = zzb.zzc;
            int i16 = i12;
            int i17 = 0;
            int i18 = 0;
            boolean z11 = true;
            while (i17 < i12) {
                zzld zzldVar = zzldVarArr[i17];
                int i19 = 0;
                for (int i20 = 0; i20 < zzb.zza; i20++) {
                    i19 = Math.max(i19, zzldVar.zzY(zzb.zzb(i20)) & 7);
                }
                boolean z12 = iArr2[i17] == 0;
                if (i19 > i18) {
                    z11 = z12;
                    i16 = i17;
                    i18 = i19;
                } else if (i19 == i18 && i15 == 5 && !z11 && z12) {
                    i16 = i17;
                    i18 = i19;
                    z11 = true;
                }
                i17++;
                i12 = 2;
            }
            if (i16 == i12) {
                iArr = new int[zzb.zza];
            } else {
                zzld zzldVar2 = zzldVarArr[i16];
                int[] iArr5 = new int[zzb.zza];
                for (int i21 = 0; i21 < zzb.zza; i21++) {
                    iArr5[i21] = zzldVar2.zzY(zzb.zzb(i21));
                }
                iArr = iArr5;
            }
            int i22 = iArr2[i16];
            zzboVarArr[i16][i22] = zzb;
            iArr3[i16][i22] = iArr;
            iArr2[i16] = i22 + 1;
            i14++;
            i12 = 2;
        }
        int i23 = i12;
        boolean z13 = true;
        zzwd[] zzwdVarArr = new zzwd[i23];
        String[] strArr = new String[i23];
        int[] iArr6 = new int[i23];
        int i24 = 0;
        while (i24 < i23) {
            int i25 = iArr2[i24];
            zzwdVarArr[i24] = new zzwd((zzbo[]) zzeh.zzO(zzboVarArr[i24], i25));
            iArr3[i24] = (int[][]) zzeh.zzO(iArr3[i24], i25);
            strArr[i24] = zzldVarArr[i24].zzU();
            iArr6[i24] = zzldVarArr[i24].zzb();
            i24++;
            i23 = 2;
        }
        int i26 = i23;
        zzxr zzxrVar = new zzxr(strArr, iArr6, zzwdVarArr, iArr4, iArr3, new zzwd((zzbo[]) zzeh.zzO(zzboVarArr[i26], iArr2[i26])));
        Pair zzd = zzd(zzxrVar, iArr3, iArr4, zztyVar, zzbnVar);
        zzxt[] zzxtVarArr = (zzxt[]) zzd.second;
        List[] listArr = new List[zzxtVarArr.length];
        for (int i27 = 0; i27 < zzxtVarArr.length; i27++) {
            zzxt zzxtVar = zzxtVarArr[i27];
            listArr[i27] = zzxtVar != null ? zzfvv.zzo(zzxtVar) : zzfvv.zzn();
        }
        zzfvs zzfvsVar = new zzfvs();
        int i28 = 0;
        while (i28 < 2) {
            zzwd zzd2 = zzxrVar.zzd(i28);
            List list = listArr[i28];
            int i29 = 0;
            while (i29 < zzd2.zzb) {
                zzbo zzb2 = zzd2.zzb(i29);
                boolean z14 = zzxrVar.zza(i28, i29, false) != 0 ? z13 : false;
                int i30 = zzb2.zza;
                int[] iArr7 = new int[i30];
                boolean[] zArr = new boolean[i30];
                for (int i31 = 0; i31 < zzb2.zza; i31++) {
                    iArr7[i31] = zzxrVar.zzb(i28, i29, i31) & 7;
                    int i32 = 0;
                    while (true) {
                        if (i32 >= list.size()) {
                            z10 = false;
                            break;
                        }
                        zzxt zzxtVar2 = (zzxt) list.get(i32);
                        if (zzxtVar2.zzg().equals(zzb2) && zzxtVar2.zzc(i31) != -1) {
                            z10 = true;
                            break;
                        }
                        i32++;
                    }
                    zArr[i31] = z10;
                }
                zzfvsVar.zzf(new zzbu(zzb2, z14, iArr7, zArr));
                i29++;
                z13 = true;
            }
            i28++;
            z13 = true;
        }
        zzwd zze = zzxrVar.zze();
        for (int i33 = 0; i33 < zze.zzb; i33++) {
            zzbo zzb3 = zze.zzb(i33);
            int[] iArr8 = new int[zzb3.zza];
            Arrays.fill(iArr8, 0);
            zzfvsVar.zzf(new zzbu(zzb3, false, iArr8, new boolean[zzb3.zza]));
        }
        return new zzxw((zzle[]) zzd.first, (zzxp[]) zzd.second, new zzbv(zzfvsVar.zzi()), zzxrVar);
    }

    @Override // com.google.android.gms.internal.ads.zzxv
    public final void zzp(Object obj) {
        zzxr zzxrVar = (zzxr) obj;
    }
}
