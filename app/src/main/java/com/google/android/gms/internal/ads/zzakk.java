package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.List;
import java.util.Map;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
final class zzakk implements zzajb {
    private final zzakd zza;
    private final long[] zzb;
    private final Map zzc;
    private final Map zzd;
    private final Map zze;

    public zzakk(zzakd zzakdVar, Map map, Map map2, Map map3) {
        this.zza = zzakdVar;
        this.zzd = map2;
        this.zze = map3;
        this.zzc = Collections.unmodifiableMap(map);
        this.zzb = zzakdVar.zzh();
    }

    @Override // com.google.android.gms.internal.ads.zzajb
    public final int zza() {
        return this.zzb.length;
    }

    @Override // com.google.android.gms.internal.ads.zzajb
    public final long zzb(int i10) {
        return this.zzb[i10];
    }

    @Override // com.google.android.gms.internal.ads.zzajb
    public final List zzc(long j10) {
        return this.zza.zze(j10, this.zzc, this.zzd, this.zze);
    }
}
