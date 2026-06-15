package com.google.android.gms.internal.ads;

import android.content.Context;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzeca implements zzhdk {
    private final zzhdt zza;
    private final zzhdt zzb;

    public zzeca(zzhdt zzhdtVar, zzhdt zzhdtVar2) {
        this.zza = zzhdtVar;
        this.zzb = zzhdtVar2;
    }

    @Override // com.google.android.gms.internal.ads.zzheb, com.google.android.gms.internal.ads.zzhea
    /* renamed from: zza */
    public final zzebz zzb() {
        return new zzebz((Context) this.zza.zzb(), (zzcms) this.zzb.zzb());
    }
}
