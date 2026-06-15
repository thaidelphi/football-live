package com.google.android.gms.internal.ads;

import com.ironsource.mediationsdk.logger.IronSourceError;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzep implements zzau {
    public final long zza;
    public final long zzb;
    public final long zzc;

    public zzep(long j10, long j11, long j12) {
        this.zza = j10;
        this.zzb = j11;
        this.zzc = j12;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof zzep) {
            zzep zzepVar = (zzep) obj;
            return this.zza == zzepVar.zza && this.zzb == zzepVar.zzb && this.zzc == zzepVar.zzc;
        }
        return false;
    }

    public final int hashCode() {
        long j10 = this.zza;
        long j11 = this.zzb;
        return ((((((int) (j10 ^ (j10 >>> 32))) + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31) + ((int) ((j11 >>> 32) ^ j11))) * 31) + ((int) this.zzc);
    }

    public final String toString() {
        return "Mp4Timestamp: creation time=" + this.zza + ", modification time=" + this.zzb + ", timescale=" + this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzau
    public final /* synthetic */ void zza(zzar zzarVar) {
    }
}
