package com.google.android.gms.internal.ads;

import java.io.IOException;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
final class zzvb implements zzvs {
    final /* synthetic */ zzve zza;
    private final int zzb;

    public zzvb(zzve zzveVar, int i10) {
        this.zza = zzveVar;
        this.zzb = i10;
    }

    @Override // com.google.android.gms.internal.ads.zzvs
    public final int zza(zzjv zzjvVar, zzha zzhaVar, int i10) {
        return this.zza.zzh(this.zzb, zzjvVar, zzhaVar, i10);
    }

    @Override // com.google.android.gms.internal.ads.zzvs
    public final int zzb(long j10) {
        return this.zza.zzj(this.zzb, j10);
    }

    @Override // com.google.android.gms.internal.ads.zzvs
    public final void zzd() throws IOException {
        this.zza.zzI(this.zzb);
    }

    @Override // com.google.android.gms.internal.ads.zzvs
    public final boolean zze() {
        return this.zza.zzQ(this.zzb);
    }
}
