package com.google.android.gms.internal.ads;

import android.content.Context;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import com.ironsource.d9;
import java.util.Map;
import java.util.Objects;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzxb extends zzbt {
    public final boolean zzD;
    public final boolean zzE;
    public final boolean zzF;
    public final boolean zzG;
    public final boolean zzH;
    public final boolean zzI;
    public final boolean zzJ;
    public final boolean zzK;
    public final boolean zzL;
    public final boolean zzM;
    public final boolean zzN;
    public final boolean zzO;
    public final boolean zzP;
    public final boolean zzQ;
    public final boolean zzR;
    private final SparseArray zzS;
    private final SparseBooleanArray zzT;

    static {
        new zzxb(new zzxa());
        int i10 = zzeh.zza;
        Integer.toString(1000, 36);
        Integer.toString(1001, 36);
        Integer.toString(1002, 36);
        Integer.toString(1003, 36);
        Integer.toString(1004, 36);
        Integer.toString(1005, 36);
        Integer.toString(1006, 36);
        Integer.toString(1007, 36);
        Integer.toString(1008, 36);
        Integer.toString(1009, 36);
        Integer.toString(1010, 36);
        Integer.toString(1011, 36);
        Integer.toString(1012, 36);
        Integer.toString(d9.f16965i, 36);
        Integer.toString(d9.f16966j, 36);
        Integer.toString(1015, 36);
        Integer.toString(d9.f16968l, 36);
        Integer.toString(1017, 36);
        Integer.toString(1018, 36);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public zzxb(zzxa zzxaVar) {
        super(zzxaVar);
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        boolean z15;
        boolean z16;
        SparseArray sparseArray;
        SparseBooleanArray sparseBooleanArray;
        z10 = zzxaVar.zza;
        this.zzD = z10;
        this.zzE = false;
        z11 = zzxaVar.zzb;
        this.zzF = z11;
        this.zzG = false;
        z12 = zzxaVar.zzc;
        this.zzH = z12;
        this.zzI = false;
        this.zzJ = false;
        this.zzK = false;
        this.zzL = false;
        z13 = zzxaVar.zzd;
        this.zzM = z13;
        z14 = zzxaVar.zze;
        this.zzN = z14;
        z15 = zzxaVar.zzf;
        this.zzO = z15;
        this.zzP = false;
        z16 = zzxaVar.zzg;
        this.zzQ = z16;
        this.zzR = false;
        sparseArray = zzxaVar.zzh;
        this.zzS = sparseArray;
        sparseBooleanArray = zzxaVar.zzi;
        this.zzT = sparseBooleanArray;
    }

    public static zzxb zzd(Context context) {
        return new zzxb(new zzxa(context));
    }

    @Override // com.google.android.gms.internal.ads.zzbt
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzxb.class == obj.getClass()) {
            zzxb zzxbVar = (zzxb) obj;
            if (super.equals(zzxbVar) && this.zzD == zzxbVar.zzD && this.zzF == zzxbVar.zzF && this.zzH == zzxbVar.zzH && this.zzM == zzxbVar.zzM && this.zzN == zzxbVar.zzN && this.zzO == zzxbVar.zzO && this.zzQ == zzxbVar.zzQ) {
                SparseBooleanArray sparseBooleanArray = this.zzT;
                SparseBooleanArray sparseBooleanArray2 = zzxbVar.zzT;
                int size = sparseBooleanArray.size();
                if (sparseBooleanArray2.size() == size) {
                    int i10 = 0;
                    while (true) {
                        if (i10 < size) {
                            if (sparseBooleanArray2.indexOfKey(sparseBooleanArray.keyAt(i10)) < 0) {
                                break;
                            }
                            i10++;
                        } else {
                            SparseArray sparseArray = this.zzS;
                            SparseArray sparseArray2 = zzxbVar.zzS;
                            int size2 = sparseArray.size();
                            if (sparseArray2.size() == size2) {
                                for (int i11 = 0; i11 < size2; i11++) {
                                    int indexOfKey = sparseArray2.indexOfKey(sparseArray.keyAt(i11));
                                    if (indexOfKey >= 0) {
                                        Map map = (Map) sparseArray.valueAt(i11);
                                        Map map2 = (Map) sparseArray2.valueAt(indexOfKey);
                                        if (map2.size() == map.size()) {
                                            for (Map.Entry entry : map.entrySet()) {
                                                zzwd zzwdVar = (zzwd) entry.getKey();
                                                if (map2.containsKey(zzwdVar)) {
                                                    Object value = entry.getValue();
                                                    Object obj2 = map2.get(zzwdVar);
                                                    int i12 = zzeh.zza;
                                                    if (!Objects.equals(value, obj2)) {
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                                return true;
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzbt
    public final int hashCode() {
        return (((((((((((((((super.hashCode() + 31) * 31) + (this.zzD ? 1 : 0)) * 961) + (this.zzF ? 1 : 0)) * 961) + (this.zzH ? 1 : 0)) * 28629151) + (this.zzM ? 1 : 0)) * 31) + (this.zzN ? 1 : 0)) * 31) + (this.zzO ? 1 : 0)) * 961) + (this.zzQ ? 1 : 0)) * 31;
    }

    public final zzxa zzc() {
        return new zzxa(this, null);
    }

    @Deprecated
    public final zzxc zze(int i10, zzwd zzwdVar) {
        Map map = (Map) this.zzS.get(i10);
        if (map != null) {
            return (zzxc) map.get(zzwdVar);
        }
        return null;
    }

    public final boolean zzf(int i10) {
        return this.zzT.get(i10);
    }

    @Deprecated
    public final boolean zzg(int i10, zzwd zzwdVar) {
        Map map = (Map) this.zzS.get(i10);
        return map != null && map.containsKey(zzwdVar);
    }
}
