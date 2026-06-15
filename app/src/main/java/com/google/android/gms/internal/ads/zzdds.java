package com.google.android.gms.internal.ads;

import java.util.Set;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzdds implements zzhdk {
    private final zzddg zza;
    private final zzhdt zzb;

    public zzdds(zzddg zzddgVar, zzhdt zzhdtVar) {
        this.zza = zzddgVar;
        this.zzb = zzhdtVar;
    }

    @Override // com.google.android.gms.internal.ads.zzheb, com.google.android.gms.internal.ads.zzhea
    public final /* bridge */ /* synthetic */ Object zzb() {
        Set zzf = this.zza.zzf((zzcta) this.zzb.zzb());
        zzhds.zzb(zzf);
        return zzf;
    }
}
