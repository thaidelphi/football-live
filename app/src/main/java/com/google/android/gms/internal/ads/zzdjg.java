package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Clock;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzdjg implements zzhdk {
    private final zzhdt zza;
    private final zzhdt zzb;

    public zzdjg(zzhdt zzhdtVar, zzhdt zzhdtVar2, zzhdt zzhdtVar3) {
        this.zza = zzhdtVar;
        this.zzb = zzhdtVar2;
    }

    @Override // com.google.android.gms.internal.ads.zzheb, com.google.android.gms.internal.ads.zzhea
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzdjf((com.google.android.gms.ads.internal.util.zzbo) this.zza.zzb(), (Clock) this.zzb.zzb(), zzfdn.zzc());
    }
}
