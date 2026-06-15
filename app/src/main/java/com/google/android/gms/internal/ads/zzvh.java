package com.google.android.gms.internal.ads;

import java.util.Objects;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzvh implements zzul {
    public static final /* synthetic */ int zza = 0;
    private final zzfq zzc;
    private int zzd;
    private final zzvg zze;
    private final zzyi zzf;

    public zzvh(zzfq zzfqVar, zzvg zzvgVar) {
        zzyi zzyiVar = new zzyi(-1);
        this.zzc = zzfqVar;
        this.zze = zzvgVar;
        this.zzf = zzyiVar;
        this.zzd = 1048576;
    }

    public final zzvh zza(int i10) {
        this.zzd = i10;
        return this;
    }

    public final zzvj zzb(zzap zzapVar) {
        Objects.requireNonNull(zzapVar.zzb);
        return new zzvj(zzapVar, this.zzc, this.zze, zzqy.zza, this.zzf, this.zzd, 0, null, null, null);
    }
}
