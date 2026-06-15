package com.google.android.gms.internal.ads;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
final class zzflw extends zzfls {
    private final String zza;
    private final boolean zzb;
    private final boolean zzc;
    private final long zzd;
    private final long zze;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzflw(String str, boolean z10, boolean z11, boolean z12, long j10, boolean z13, long j11, zzflv zzflvVar) {
        this.zza = str;
        this.zzb = z10;
        this.zzc = z11;
        this.zzd = j10;
        this.zze = j11;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof zzfls) {
            zzfls zzflsVar = (zzfls) obj;
            if (this.zza.equals(zzflsVar.zzd()) && this.zzb == zzflsVar.zzh() && this.zzc == zzflsVar.zzg()) {
                zzflsVar.zzf();
                if (this.zzd == zzflsVar.zzb()) {
                    zzflsVar.zze();
                    if (this.zze == zzflsVar.zza()) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((((((this.zza.hashCode() ^ 1000003) * 1000003) ^ (true != this.zzb ? 1237 : 1231)) * 1000003) ^ (true != this.zzc ? 1237 : 1231)) * 1000003) ^ 1237) * 1000003) ^ ((int) this.zzd)) * 1000003) ^ 1237) * 1000003) ^ ((int) this.zze);
    }

    public final String toString() {
        return "AdShield2Options{clientVersion=" + this.zza + ", shouldGetAdvertisingId=" + this.zzb + ", isGooglePlayServicesAvailable=" + this.zzc + ", enableQuerySignalsTimeout=false, querySignalsTimeoutMs=" + this.zzd + ", enableQuerySignalsCache=false, querySignalsCacheTtlSeconds=" + this.zze + "}";
    }

    @Override // com.google.android.gms.internal.ads.zzfls
    public final long zza() {
        return this.zze;
    }

    @Override // com.google.android.gms.internal.ads.zzfls
    public final long zzb() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.ads.zzfls
    public final String zzd() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzfls
    public final boolean zze() {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzfls
    public final boolean zzf() {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzfls
    public final boolean zzg() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzfls
    public final boolean zzh() {
        return this.zzb;
    }
}
