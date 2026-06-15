package com.google.android.gms.internal.ads;

import java.io.IOException;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
final class zzvz implements zzvs {
    private final zzvs zza;
    private final long zzb;

    public zzvz(zzvs zzvsVar, long j10) {
        this.zza = zzvsVar;
        this.zzb = j10;
    }

    @Override // com.google.android.gms.internal.ads.zzvs
    public final int zza(zzjv zzjvVar, zzha zzhaVar, int i10) {
        int zza = this.zza.zza(zzjvVar, zzhaVar, i10);
        if (zza == -4) {
            zzhaVar.zze += this.zzb;
            return -4;
        }
        return zza;
    }

    @Override // com.google.android.gms.internal.ads.zzvs
    public final int zzb(long j10) {
        return this.zza.zzb(j10 - this.zzb);
    }

    public final zzvs zzc() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzvs
    public final void zzd() throws IOException {
        this.zza.zzd();
    }

    @Override // com.google.android.gms.internal.ads.zzvs
    public final boolean zze() {
        return this.zza.zze();
    }
}
