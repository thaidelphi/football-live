package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.util.Objects;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzvw extends zzbn {
    private static final Object zzb = new Object();
    private final long zzc;
    private final long zzd;
    private final boolean zze;
    private final zzap zzf;
    private final zzaj zzg;

    static {
        zzad zzadVar = new zzad();
        zzadVar.zza("SinglePeriodTimeline");
        zzadVar.zzb(Uri.EMPTY);
        zzadVar.zzc();
    }

    public zzvw(long j10, long j11, long j12, long j13, long j14, long j15, long j16, boolean z10, boolean z11, boolean z12, Object obj, zzap zzapVar, zzaj zzajVar) {
        this.zzc = j13;
        this.zzd = j14;
        this.zze = z10;
        Objects.requireNonNull(zzapVar);
        this.zzf = zzapVar;
        this.zzg = zzajVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbn
    public final int zza(Object obj) {
        return zzb.equals(obj) ? 0 : -1;
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
        zzcv.zza(i10, 0, 1);
        zzblVar.zzi(null, z10 ? zzb : null, 0, this.zzc, 0L, zzb.zza, false);
        return zzblVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbn
    public final zzbm zze(int i10, zzbm zzbmVar, long j10) {
        zzcv.zza(i10, 0, 1);
        Object obj = zzbm.zza;
        zzap zzapVar = this.zzf;
        long j11 = this.zzd;
        zzbmVar.zza(obj, zzapVar, null, -9223372036854775807L, -9223372036854775807L, -9223372036854775807L, this.zze, false, this.zzg, 0L, j11, 0, 0, 0L);
        return zzbmVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbn
    public final Object zzf(int i10) {
        zzcv.zza(i10, 0, 1);
        return zzb;
    }
}
