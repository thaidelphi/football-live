package com.google.android.gms.internal.ads;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzeql implements zzhdk {
    private final zzhdt zza;
    private final zzhdt zzb;
    private final zzhdt zzc;

    public zzeql(zzhdt zzhdtVar, zzhdt zzhdtVar2, zzhdt zzhdtVar3) {
        this.zza = zzhdtVar;
        this.zzb = zzhdtVar2;
        this.zzc = zzhdtVar3;
    }

    @Override // com.google.android.gms.internal.ads.zzheb, com.google.android.gms.internal.ads.zzhea
    /* renamed from: zza */
    public final zzeqj zzb() {
        return new zzeqj((ApplicationInfo) this.zza.zzb(), (PackageInfo) this.zzb.zzb(), ((zzcfx) this.zzc).zza());
    }
}
