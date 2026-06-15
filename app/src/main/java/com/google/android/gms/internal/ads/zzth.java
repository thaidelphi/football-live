package com.google.android.gms.internal.ads;

import java.util.List;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
final class zzth implements zzvu {
    private final zzvu zza;
    private final zzfvv zzb;

    public zzth(zzvu zzvuVar, List list) {
        this.zza = zzvuVar;
        this.zzb = zzfvv.zzl(list);
    }

    public final zzfvv zza() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzvu
    public final long zzb() {
        return this.zza.zzb();
    }

    @Override // com.google.android.gms.internal.ads.zzvu
    public final long zzc() {
        return this.zza.zzc();
    }

    @Override // com.google.android.gms.internal.ads.zzvu
    public final void zzm(long j10) {
        this.zza.zzm(j10);
    }

    @Override // com.google.android.gms.internal.ads.zzvu
    public final boolean zzo(zzka zzkaVar) {
        return this.zza.zzo(zzkaVar);
    }

    @Override // com.google.android.gms.internal.ads.zzvu
    public final boolean zzp() {
        return this.zza.zzp();
    }
}
