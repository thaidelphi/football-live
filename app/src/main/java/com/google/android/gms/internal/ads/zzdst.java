package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzdst implements zzhdk {
    private final zzhdt zza;

    public zzdst(zzhdt zzhdtVar, zzhdt zzhdtVar2) {
        this.zza = zzhdtVar;
    }

    public static zzdbw zza(zzdss zzdssVar, Executor executor) {
        return new zzdbw(zzdssVar, executor);
    }

    @Override // com.google.android.gms.internal.ads.zzheb, com.google.android.gms.internal.ads.zzhea
    public final /* bridge */ /* synthetic */ Object zzb() {
        return zza((zzdss) this.zza.zzb(), zzfdn.zzc());
    }
}
