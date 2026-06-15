package com.google.android.gms.internal.ads;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzts extends zzbn {
    private final zzap zzb;

    public zzts(zzap zzapVar) {
        this.zzb = zzapVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbn
    public final int zza(Object obj) {
        return obj == zztr.zzc ? 0 : -1;
    }

    @Override // com.google.android.gms.internal.ads.zzbn
    public final int zzb() {
        return 1;
    }

    @Override // com.google.android.gms.internal.ads.zzbn
    public final int zzc() {
        return 1;
    }

    @Override // com.google.android.gms.internal.ads.zzbn
    public final zzbl zzd(int i10, zzbl zzblVar, boolean z10) {
        zzblVar.zzi(z10 ? 0 : null, z10 ? zztr.zzc : null, 0, -9223372036854775807L, 0L, zzb.zza, true);
        return zzblVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbn
    public final zzbm zze(int i10, zzbm zzbmVar, long j10) {
        zzbmVar.zza(zzbm.zza, this.zzb, null, -9223372036854775807L, -9223372036854775807L, -9223372036854775807L, false, true, null, 0L, -9223372036854775807L, 0, 0, 0L);
        zzbmVar.zzk = true;
        return zzbmVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbn
    public final Object zzf(int i10) {
        return zztr.zzc;
    }
}
