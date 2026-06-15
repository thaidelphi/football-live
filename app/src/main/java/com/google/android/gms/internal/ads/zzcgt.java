package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzcgt implements zzhdk {
    private final zzhdt zza;
    private final zzhdt zzb;

    public zzcgt(zzhdt zzhdtVar, zzhdt zzhdtVar2) {
        this.zza = zzhdtVar;
        this.zzb = zzhdtVar2;
    }

    @Override // com.google.android.gms.internal.ads.zzheb, com.google.android.gms.internal.ads.zzhea
    /* renamed from: zza */
    public final zzbtx zzb() {
        Context zza = ((zzcfx) this.zza).zza();
        zzffq zzffqVar = (zzffq) this.zzb.zzb();
        zzbnf zzb = com.google.android.gms.ads.internal.zzv.zzg().zzb(zza, VersionInfoParcel.forPackage(), zzffqVar);
        zzbmz zzbmzVar = zzbnc.zza;
        zzb.zza("google.afma.request.getAdDictionary", zzbmzVar, zzbmzVar);
        return new zzbtz(zza, com.google.android.gms.ads.internal.zzv.zzg().zzb(zza, VersionInfoParcel.forPackage(), zzffqVar).zza("google.afma.sdkConstants.getSdkConstants", zzbmzVar, zzbmzVar), VersionInfoParcel.forPackage());
    }
}
