package com.google.android.gms.internal.ads;

import java.util.Set;
import java.util.concurrent.Executor;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzdqy implements zzhdk {
    private final zzdqu zza;
    private final zzhdt zzb;

    public zzdqy(zzdqu zzdquVar, zzhdt zzhdtVar, zzhdt zzhdtVar2) {
        this.zza = zzdquVar;
        this.zzb = zzhdtVar;
    }

    public static Set zza(zzdqu zzdquVar, zzdre zzdreVar, Executor executor) {
        Set zzd = zzdqu.zzd(zzdreVar, executor);
        zzhds.zzb(zzd);
        return zzd;
    }

    @Override // com.google.android.gms.internal.ads.zzheb, com.google.android.gms.internal.ads.zzhea
    public final /* bridge */ /* synthetic */ Object zzb() {
        zzgba zzc = zzfdn.zzc();
        return zza(this.zza, (zzdre) this.zzb.zzb(), zzc);
    }
}
