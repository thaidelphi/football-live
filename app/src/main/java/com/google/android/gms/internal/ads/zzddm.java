package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.Set;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzddm implements zzhdk {
    private final zzhdt zza;

    public zzddm(zzddg zzddgVar, zzhdt zzhdtVar) {
        this.zza = zzhdtVar;
    }

    @Override // com.google.android.gms.internal.ads.zzheb, com.google.android.gms.internal.ads.zzhea
    public final /* bridge */ /* synthetic */ Object zzb() {
        Set singleton = Collections.singleton(new zzdbw((zzcta) this.zza.zzb(), zzbyp.zzg));
        zzhds.zzb(singleton);
        return singleton;
    }
}
