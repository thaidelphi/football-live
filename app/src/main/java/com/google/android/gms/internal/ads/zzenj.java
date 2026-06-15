package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Clock;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzenj implements zzhdk {
    private final zzhdt zza;
    private final zzhdt zzb;

    public zzenj(zzhdt zzhdtVar, zzhdt zzhdtVar2, zzhdt zzhdtVar3, zzhdt zzhdtVar4) {
        this.zza = zzhdtVar2;
        this.zzb = zzhdtVar4;
    }

    @Override // com.google.android.gms.internal.ads.zzheb, com.google.android.gms.internal.ads.zzhea
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzemo(zzepv.zza(), ((Long) zzbdb.zzf.zze()).longValue(), (Clock) this.zza.zzb(), zzfdn.zzc(), (zzdqf) this.zzb.zzb());
    }
}
