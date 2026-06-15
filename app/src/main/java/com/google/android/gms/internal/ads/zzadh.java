package com.google.android.gms.internal.ads;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public class zzadh implements zzadi {
    private final long zza;
    private final zzadg zzb;

    public zzadh(long j10, long j11) {
        this.zza = j10;
        zzadj zzadjVar = j11 == 0 ? zzadj.zza : new zzadj(0L, j11);
        this.zzb = new zzadg(zzadjVar, zzadjVar);
    }

    @Override // com.google.android.gms.internal.ads.zzadi
    public final long zza() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzadi
    public final zzadg zzg(long j10) {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzadi
    public final boolean zzh() {
        return false;
    }
}
