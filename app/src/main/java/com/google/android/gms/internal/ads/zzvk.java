package com.google.android.gms.internal.ads;

import java.util.Objects;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
final class zzvk implements zzxy {
    public long zza;
    public long zzb;
    public zzxx zzc;
    public zzvk zzd;

    public zzvk(long j10, int i10) {
        zze(j10, 65536);
    }

    public final int zza(long j10) {
        long j11 = j10 - this.zza;
        int i10 = this.zzc.zzb;
        return (int) j11;
    }

    public final zzvk zzb() {
        this.zzc = null;
        zzvk zzvkVar = this.zzd;
        this.zzd = null;
        return zzvkVar;
    }

    @Override // com.google.android.gms.internal.ads.zzxy
    public final zzxx zzc() {
        zzxx zzxxVar = this.zzc;
        Objects.requireNonNull(zzxxVar);
        return zzxxVar;
    }

    @Override // com.google.android.gms.internal.ads.zzxy
    public final zzxy zzd() {
        zzvk zzvkVar = this.zzd;
        if (zzvkVar == null || zzvkVar.zzc == null) {
            return null;
        }
        return zzvkVar;
    }

    public final void zze(long j10, int i10) {
        zzcv.zzf(this.zzc == null);
        this.zza = j10;
        this.zzb = j10 + 65536;
    }
}
