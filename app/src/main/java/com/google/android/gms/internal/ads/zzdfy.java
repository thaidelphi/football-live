package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.common.util.Clock;
import java.util.concurrent.Executor;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzdfy implements zzhdk {
    private final zzhdt zza;
    private final zzhdt zzb;
    private final zzhdt zzc;
    private final zzhdt zzd;

    public zzdfy(zzhdt zzhdtVar, zzhdt zzhdtVar2, zzhdt zzhdtVar3, zzhdt zzhdtVar4) {
        this.zza = zzhdtVar;
        this.zzb = zzhdtVar2;
        this.zzc = zzhdtVar3;
        this.zzd = zzhdtVar4;
    }

    @Override // com.google.android.gms.internal.ads.zzheb, com.google.android.gms.internal.ads.zzhea
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzcmj((Executor) this.zzb.zzb(), new zzclv((Context) this.zzc.zzb(), (zzaxh) this.zza.zzb()), (Clock) this.zzd.zzb());
    }
}
