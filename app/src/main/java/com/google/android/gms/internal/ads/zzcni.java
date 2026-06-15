package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import java.util.concurrent.Executor;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzcni implements zzhdk {
    private final zzhdt zza;
    private final zzhdt zzb;
    private final zzhdt zzc;
    private final zzhdt zzd;
    private final zzhdt zze;
    private final zzhdt zzf;
    private final zzhdt zzg;
    private final zzhdt zzh;
    private final zzhdt zzi;
    private final zzhdt zzj;

    public zzcni(zzhdt zzhdtVar, zzhdt zzhdtVar2, zzhdt zzhdtVar3, zzhdt zzhdtVar4, zzhdt zzhdtVar5, zzhdt zzhdtVar6, zzhdt zzhdtVar7, zzhdt zzhdtVar8, zzhdt zzhdtVar9, zzhdt zzhdtVar10) {
        this.zza = zzhdtVar;
        this.zzb = zzhdtVar2;
        this.zzc = zzhdtVar3;
        this.zzd = zzhdtVar4;
        this.zze = zzhdtVar5;
        this.zzf = zzhdtVar6;
        this.zzg = zzhdtVar7;
        this.zzh = zzhdtVar8;
        this.zzi = zzhdtVar9;
        this.zzj = zzhdtVar10;
    }

    public static zzcnh zzc(zzcpk zzcpkVar, Context context, zzezv zzezvVar, View view, zzcdq zzcdqVar, zzcpj zzcpjVar, zzdhc zzdhcVar, zzdcg zzdcgVar, zzhde zzhdeVar, Executor executor) {
        return new zzcnh(zzcpkVar, context, zzezvVar, view, zzcdqVar, zzcpjVar, zzdhcVar, zzdcgVar, zzhdeVar, executor);
    }

    @Override // com.google.android.gms.internal.ads.zzheb, com.google.android.gms.internal.ads.zzhea
    /* renamed from: zza */
    public final zzcnh zzb() {
        return new zzcnh(((zzcrr) this.zza).zzb(), (Context) this.zzb.zzb(), ((zzcno) this.zzc).zza(), ((zzcnn) this.zzd).zza(), ((zzcob) this.zze).zza(), ((zzcnp) this.zzf).zza(), ((zzdfa) this.zzg).zza(), (zzdcg) this.zzh.zzb(), zzhdj.zza(this.zzi), (Executor) this.zzj.zzb());
    }
}
