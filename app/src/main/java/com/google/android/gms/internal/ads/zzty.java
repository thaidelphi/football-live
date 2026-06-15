package com.google.android.gms.internal.ads;

import com.ironsource.mediationsdk.logger.IronSourceError;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzty {
    public final Object zza;
    public final int zzb;
    public final int zzc;
    public final long zzd;
    public final int zze;

    public zzty(Object obj, int i10, int i11, long j10) {
        this(obj, i10, i11, j10, -1);
    }

    private zzty(Object obj, int i10, int i11, long j10, int i12) {
        this.zza = obj;
        this.zzb = i10;
        this.zzc = i11;
        this.zzd = j10;
        this.zze = i12;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof zzty) {
            zzty zztyVar = (zzty) obj;
            return this.zza.equals(zztyVar.zza) && this.zzb == zztyVar.zzb && this.zzc == zztyVar.zzc && this.zzd == zztyVar.zzd && this.zze == zztyVar.zze;
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((this.zza.hashCode() + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31) + this.zzb) * 31) + this.zzc) * 31) + ((int) this.zzd)) * 31) + this.zze;
    }

    public final zzty zza(Object obj) {
        return this.zza.equals(obj) ? this : new zzty(obj, this.zzb, this.zzc, this.zzd, this.zze);
    }

    public final boolean zzb() {
        return this.zzb != -1;
    }

    public zzty(Object obj, long j10) {
        this(obj, -1, -1, j10, -1);
    }

    public zzty(Object obj, long j10, int i10) {
        this(obj, -1, -1, j10, i10);
    }
}
