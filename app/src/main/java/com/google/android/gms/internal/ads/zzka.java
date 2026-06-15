package com.google.android.gms.internal.ads;

import java.util.Arrays;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzka {
    public final long zza;
    public final float zzb;
    public final long zzc;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzka(zzjy zzjyVar, zzjz zzjzVar) {
        this.zza = zzjy.zzc(zzjyVar);
        this.zzb = zzjy.zza(zzjyVar);
        this.zzc = zzjy.zzb(zzjyVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof zzka) {
            zzka zzkaVar = (zzka) obj;
            return this.zza == zzkaVar.zza && this.zzb == zzkaVar.zzb && this.zzc == zzkaVar.zzc;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.zza), Float.valueOf(this.zzb), Long.valueOf(this.zzc)});
    }

    public final zzjy zza() {
        return new zzjy(this, null);
    }
}
