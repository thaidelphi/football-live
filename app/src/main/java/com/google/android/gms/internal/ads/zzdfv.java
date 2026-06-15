package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.HashSet;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzdfv implements zzhdk {
    private final zzhdt zza;
    private final zzhdt zzb;

    public zzdfv(zzhdt zzhdtVar, zzhdt zzhdtVar2) {
        this.zza = zzhdtVar;
        this.zzb = zzhdtVar2;
    }

    @Override // com.google.android.gms.internal.ads.zzheb, com.google.android.gms.internal.ads.zzhea
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzdby((Context) this.zza.zzb(), new HashSet(), ((zzcqc) this.zzb).zza());
    }
}
