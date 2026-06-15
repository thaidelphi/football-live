package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzyx {
    private static final Comparator zza = new Comparator() { // from class: com.google.android.gms.internal.ads.zzyt
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return ((zzyv) obj).zza - ((zzyv) obj2).zza;
        }
    };
    private static final Comparator zzb = new Comparator() { // from class: com.google.android.gms.internal.ads.zzyu
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return Float.compare(((zzyv) obj).zzc, ((zzyv) obj2).zzc);
        }
    };
    private int zzf;
    private int zzg;
    private int zzh;
    private final zzyv[] zzd = new zzyv[5];
    private final ArrayList zzc = new ArrayList();
    private int zze = -1;

    public zzyx(int i10) {
    }

    public final float zza(float f10) {
        ArrayList arrayList;
        if (this.zze != 0) {
            Collections.sort(this.zzc, zzb);
            this.zze = 0;
        }
        float f11 = this.zzg;
        int i10 = 0;
        for (int i11 = 0; i11 < this.zzc.size(); i11++) {
            zzyv zzyvVar = (zzyv) this.zzc.get(i11);
            i10 += zzyvVar.zzb;
            if (i10 >= 0.5f * f11) {
                return zzyvVar.zzc;
            }
        }
        if (this.zzc.isEmpty()) {
            return Float.NaN;
        }
        return ((zzyv) this.zzc.get(arrayList.size() - 1)).zzc;
    }

    public final void zzb(int i10, float f10) {
        zzyv zzyvVar;
        if (this.zze != 1) {
            Collections.sort(this.zzc, zza);
            this.zze = 1;
        }
        int i11 = this.zzh;
        if (i11 > 0) {
            zzyv[] zzyvVarArr = this.zzd;
            int i12 = i11 - 1;
            this.zzh = i12;
            zzyvVar = zzyvVarArr[i12];
        } else {
            zzyvVar = new zzyv(null);
        }
        int i13 = this.zzf;
        this.zzf = i13 + 1;
        zzyvVar.zza = i13;
        zzyvVar.zzb = i10;
        zzyvVar.zzc = f10;
        this.zzc.add(zzyvVar);
        this.zzg += i10;
        while (true) {
            int i14 = this.zzg;
            if (i14 <= 2000) {
                return;
            }
            int i15 = i14 - 2000;
            zzyv zzyvVar2 = (zzyv) this.zzc.get(0);
            int i16 = zzyvVar2.zzb;
            if (i16 <= i15) {
                this.zzg -= i16;
                this.zzc.remove(0);
                int i17 = this.zzh;
                if (i17 < 5) {
                    zzyv[] zzyvVarArr2 = this.zzd;
                    this.zzh = i17 + 1;
                    zzyvVarArr2[i17] = zzyvVar2;
                }
            } else {
                zzyvVar2.zzb = i16 - i15;
                this.zzg -= i15;
            }
        }
    }

    public final void zzc() {
        this.zzc.clear();
        this.zze = -1;
        this.zzf = 0;
        this.zzg = 0;
    }
}
