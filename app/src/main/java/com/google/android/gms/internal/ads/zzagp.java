package com.google.android.gms.internal.ads;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
final class zzagp extends zzabx implements zzagu {
    private final long zza;
    private final int zzb;
    private final int zzc;
    private final long zzd;

    public zzagp(long j10, long j11, int i10, int i11, boolean z10) {
        super(j10, j11, i10, i11, false);
        this.zza = j11;
        this.zzb = i10;
        this.zzc = i11;
        this.zzd = j10 == -1 ? -1L : j10;
    }

    @Override // com.google.android.gms.internal.ads.zzagu
    public final int zzc() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzagu
    public final long zzd() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.ads.zzagu
    public final long zze(long j10) {
        return zzb(j10);
    }

    public final zzagp zzf(long j10) {
        return new zzagp(j10, this.zza, this.zzb, this.zzc, false);
    }
}
