package com.google.android.gms.internal.ads;

import android.content.Context;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzepk implements zzhdk {
    private final zzhdt zza;
    private final zzhdt zzb;
    private final zzhdt zzc;

    public zzepk(zzhdt zzhdtVar, zzhdt zzhdtVar2, zzhdt zzhdtVar3, zzhdt zzhdtVar4) {
        this.zza = zzhdtVar2;
        this.zzb = zzhdtVar3;
        this.zzc = zzhdtVar4;
    }

    @Override // com.google.android.gms.internal.ads.zzheb, com.google.android.gms.internal.ads.zzhea
    /* renamed from: zza */
    public final zzepi zzb() {
        return new zzepi(zzfdn.zzc(), ((zzcnc) this.zza).zza(), (Context) this.zzb.zzb(), ((zzhdy) this.zzc).zzb());
    }
}
