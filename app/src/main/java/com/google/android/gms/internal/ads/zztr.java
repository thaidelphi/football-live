package com.google.android.gms.internal.ads;

import java.util.Objects;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
final class zztr extends zztm {
    public static final Object zzc = new Object();
    private final Object zzd;
    private final Object zze;

    private zztr(zzbn zzbnVar, Object obj, Object obj2) {
        super(zzbnVar);
        this.zzd = obj;
        this.zze = obj2;
    }

    public static zztr zzq(zzap zzapVar) {
        return new zztr(new zzts(zzapVar), zzbm.zza, zzc);
    }

    public static zztr zzr(zzbn zzbnVar, Object obj, Object obj2) {
        return new zztr(zzbnVar, obj, obj2);
    }

    @Override // com.google.android.gms.internal.ads.zztm, com.google.android.gms.internal.ads.zzbn
    public final int zza(Object obj) {
        Object obj2;
        if (zzc.equals(obj) && (obj2 = this.zze) != null) {
            obj = obj2;
        }
        return this.zzb.zza(obj);
    }

    @Override // com.google.android.gms.internal.ads.zztm, com.google.android.gms.internal.ads.zzbn
    public final zzbl zzd(int i10, zzbl zzblVar, boolean z10) {
        this.zzb.zzd(i10, zzblVar, z10);
        Object obj = zzblVar.zzb;
        int i11 = zzeh.zza;
        if (Objects.equals(obj, this.zze) && z10) {
            zzblVar.zzb = zzc;
        }
        return zzblVar;
    }

    @Override // com.google.android.gms.internal.ads.zztm, com.google.android.gms.internal.ads.zzbn
    public final zzbm zze(int i10, zzbm zzbmVar, long j10) {
        this.zzb.zze(i10, zzbmVar, j10);
        Object obj = zzbmVar.zzb;
        int i11 = zzeh.zza;
        if (Objects.equals(obj, this.zzd)) {
            zzbmVar.zzb = zzbm.zza;
        }
        return zzbmVar;
    }

    @Override // com.google.android.gms.internal.ads.zztm, com.google.android.gms.internal.ads.zzbn
    public final Object zzf(int i10) {
        Object zzf = this.zzb.zzf(i10);
        int i11 = zzeh.zza;
        return Objects.equals(zzf, this.zze) ? zzc : zzf;
    }

    public final zztr zzp(zzbn zzbnVar) {
        return new zztr(zzbnVar, this.zzd, this.zze);
    }
}
