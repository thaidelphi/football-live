package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Objects;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public class zzwm implements zzxp {
    protected final zzbo zza;
    protected final int zzb;
    protected final int[] zzc;
    private final zzz[] zzd;
    private int zze;

    public zzwm(zzbo zzboVar, int[] iArr, int i10) {
        int length = iArr.length;
        zzcv.zzf(length > 0);
        Objects.requireNonNull(zzboVar);
        this.zza = zzboVar;
        this.zzb = length;
        this.zzd = new zzz[length];
        for (int i11 = 0; i11 < iArr.length; i11++) {
            this.zzd[i11] = zzboVar.zzb(iArr[i11]);
        }
        Arrays.sort(this.zzd, new Comparator() { // from class: com.google.android.gms.internal.ads.zzwl
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return ((zzz) obj2).zzj - ((zzz) obj).zzj;
            }
        });
        this.zzc = new int[this.zzb];
        for (int i12 = 0; i12 < this.zzb; i12++) {
            this.zzc[i12] = zzboVar.zza(this.zzd[i12]);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            zzwm zzwmVar = (zzwm) obj;
            if (this.zza.equals(zzwmVar.zza) && Arrays.equals(this.zzc, zzwmVar.zzc)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10 = this.zze;
        if (i10 == 0) {
            int identityHashCode = (System.identityHashCode(this.zza) * 31) + Arrays.hashCode(this.zzc);
            this.zze = identityHashCode;
            return identityHashCode;
        }
        return i10;
    }

    @Override // com.google.android.gms.internal.ads.zzxt
    public final int zza(int i10) {
        return this.zzc[i10];
    }

    @Override // com.google.android.gms.internal.ads.zzxp
    public final int zzb() {
        return this.zzc[0];
    }

    @Override // com.google.android.gms.internal.ads.zzxt
    public final int zzc(int i10) {
        for (int i11 = 0; i11 < this.zzb; i11++) {
            if (this.zzc[i11] == i10) {
                return i11;
            }
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.ads.zzxt
    public final int zzd() {
        return this.zzc.length;
    }

    @Override // com.google.android.gms.internal.ads.zzxt
    public final zzz zze(int i10) {
        return this.zzd[i10];
    }

    @Override // com.google.android.gms.internal.ads.zzxp
    public final zzz zzf() {
        return this.zzd[0];
    }

    @Override // com.google.android.gms.internal.ads.zzxt
    public final zzbo zzg() {
        return this.zza;
    }
}
