package com.google.android.gms.internal.ads;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzjy {
    private long zza;
    private float zzb;
    private long zzc;

    public zzjy() {
        this.zza = -9223372036854775807L;
        this.zzb = -3.4028235E38f;
        this.zzc = -9223372036854775807L;
    }

    public /* synthetic */ zzjy(zzka zzkaVar, zzjz zzjzVar) {
        this.zza = zzkaVar.zza;
        this.zzb = zzkaVar.zzb;
        this.zzc = zzkaVar.zzc;
    }

    public final zzjy zzd(long j10) {
        boolean z10 = true;
        if (j10 < 0) {
            if (j10 == -9223372036854775807L) {
                j10 = -9223372036854775807L;
            } else {
                z10 = false;
            }
        }
        zzcv.zzd(z10);
        this.zzc = j10;
        return this;
    }

    public final zzjy zze(long j10) {
        this.zza = j10;
        return this;
    }

    public final zzjy zzf(float f10) {
        boolean z10 = true;
        if (f10 <= 0.0f && f10 != -3.4028235E38f) {
            z10 = false;
        }
        zzcv.zzd(z10);
        this.zzb = f10;
        return this;
    }

    public final zzka zzg() {
        return new zzka(this, null);
    }
}
