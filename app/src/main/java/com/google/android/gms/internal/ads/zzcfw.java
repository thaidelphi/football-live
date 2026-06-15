package com.google.android.gms.internal.ads;

import android.content.pm.ApplicationInfo;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzcfw implements zzhdk {
    private final zzhdt zza;

    public zzcfw(zzhdt zzhdtVar) {
        this.zza = zzhdtVar;
    }

    @Override // com.google.android.gms.internal.ads.zzheb, com.google.android.gms.internal.ads.zzhea
    public final /* bridge */ /* synthetic */ Object zzb() {
        ApplicationInfo applicationInfo = ((zzcfx) this.zza).zza().getApplicationInfo();
        zzhds.zzb(applicationInfo);
        return applicationInfo;
    }
}
