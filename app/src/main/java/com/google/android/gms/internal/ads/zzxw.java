package com.google.android.gms.internal.ads;

import java.util.Objects;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzxw {
    public final int zza;
    public final zzle[] zzb;
    public final zzxp[] zzc;
    public final zzbv zzd;
    public final Object zze;

    public zzxw(zzle[] zzleVarArr, zzxp[] zzxpVarArr, zzbv zzbvVar, Object obj) {
        int length = zzleVarArr.length;
        zzcv.zzd(length == zzxpVarArr.length);
        this.zzb = zzleVarArr;
        this.zzc = (zzxp[]) zzxpVarArr.clone();
        this.zzd = zzbvVar;
        this.zze = obj;
        this.zza = length;
    }

    public final boolean zza(zzxw zzxwVar, int i10) {
        if (zzxwVar == null) {
            return false;
        }
        zzle zzleVar = this.zzb[i10];
        zzle zzleVar2 = zzxwVar.zzb[i10];
        int i11 = zzeh.zza;
        return Objects.equals(zzleVar, zzleVar2) && Objects.equals(this.zzc[i10], zzxwVar.zzc[i10]);
    }

    public final boolean zzb(int i10) {
        return this.zzb[i10] != null;
    }
}
