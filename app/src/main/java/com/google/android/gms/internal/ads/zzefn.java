package com.google.android.gms.internal.ads;

import android.content.Context;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzefn implements zzhdk {
    private final zzhdt zza;
    private final zzhdt zzb;

    public zzefn(zzhdt zzhdtVar, zzhdt zzhdtVar2) {
        this.zza = zzhdtVar;
        this.zzb = zzhdtVar2;
    }

    @Override // com.google.android.gms.internal.ads.zzheb, com.google.android.gms.internal.ads.zzhea
    /* renamed from: zza */
    public final zzefm zzb() {
        return new zzefm((Context) this.zza.zzb(), (zzdmo) this.zzb.zzb());
    }
}
