package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzdks implements zzhdk {
    private final zzhdt zza;
    private final zzhdt zzb;
    private final zzhdt zzc;
    private final zzhdt zzd;
    private final zzhdt zze;
    private final zzhdt zzf;
    private final zzhdt zzg;
    private final zzhdt zzh;

    public zzdks(zzhdt zzhdtVar, zzhdt zzhdtVar2, zzhdt zzhdtVar3, zzhdt zzhdtVar4, zzhdt zzhdtVar5, zzhdt zzhdtVar6, zzhdt zzhdtVar7, zzhdt zzhdtVar8) {
        this.zza = zzhdtVar;
        this.zzb = zzhdtVar2;
        this.zzc = zzhdtVar3;
        this.zzd = zzhdtVar4;
        this.zze = zzhdtVar5;
        this.zzf = zzhdtVar6;
        this.zzg = zzhdtVar7;
        this.zzh = zzhdtVar8;
    }

    @Override // com.google.android.gms.internal.ads.zzheb, com.google.android.gms.internal.ads.zzhea
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzdkq(((zzctw) this.zza).zza(), (Executor) this.zzb.zzb(), (zzdnf) this.zzc.zzb(), (Context) this.zzd.zzb(), (zzdqf) this.zze.zzb(), (zzfhp) this.zzf.zzb(), (zzdzu) this.zzg.zzb(), (zzdma) this.zzh.zzb());
    }
}
