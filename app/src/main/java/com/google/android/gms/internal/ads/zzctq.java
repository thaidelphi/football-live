package com.google.android.gms.internal.ads;

import android.content.Context;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzctq implements zzhdk {
    private final zzcto zza;
    private final zzhdt zzb;

    public zzctq(zzcto zzctoVar, zzhdt zzhdtVar) {
        this.zza = zzctoVar;
        this.zzb = zzhdtVar;
    }

    @Override // com.google.android.gms.internal.ads.zzheb, com.google.android.gms.internal.ads.zzhea
    public final /* bridge */ /* synthetic */ Object zzb() {
        Context zzb = this.zza.zzb(((zzcfx) this.zzb).zza());
        zzhds.zzb(zzb);
        return zzb;
    }
}
