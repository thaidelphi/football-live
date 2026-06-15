package com.google.android.gms.internal.ads;

import android.content.Context;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
final class zzchv implements zzeya {
    private final zzcha zza;
    private final zzhdt zzb;
    private final zzhdt zzc;
    private final zzhdt zzd;
    private final zzhdt zze;
    private final zzhdt zzf;
    private final zzhdt zzg;
    private final zzhdt zzh;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzchv(zzcha zzchaVar, Context context, String str, com.google.android.gms.ads.internal.client.zzr zzrVar, zzcie zzcieVar) {
        zzhdt zzhdtVar;
        zzhdt zzhdtVar2;
        zzhdt zzhdtVar3;
        zzhdt zzhdtVar4;
        zzhdt zzhdtVar5;
        zzhdt zzhdtVar6;
        zzhdt zzhdtVar7;
        this.zza = zzchaVar;
        zzhdk zza = zzhdl.zza(context);
        this.zzb = zza;
        zzhdk zza2 = zzhdl.zza(zzrVar);
        this.zzc = zza2;
        zzhdk zza3 = zzhdl.zza(str);
        this.zzd = zza3;
        zzhdtVar = zzchaVar.zzM;
        zzhdt zzc = zzhdj.zzc(new zzeit(zzhdtVar));
        this.zze = zzc;
        zzhdtVar2 = zzchaVar.zzbh;
        zzhdt zzc2 = zzhdj.zzc(new zzeyy(zzhdtVar2));
        this.zzf = zzc2;
        zzhdtVar3 = zzchaVar.zzc;
        zzhdtVar4 = zzchaVar.zzS;
        zzhdt zzc3 = zzhdj.zzc(new zzexy(zza, zzhdtVar3, zzhdtVar4, zzc, zzc2, zzfar.zza()));
        this.zzg = zzc3;
        zzhdtVar5 = zzchaVar.zzl;
        zzhdtVar6 = zzchaVar.zzU;
        zzhdtVar7 = zzchaVar.zzM;
        this.zzh = zzhdj.zzc(new zzejb(zza, zza2, zza3, zzc3, zzc, zzc2, zzhdtVar5, zzhdtVar6, zzhdtVar7));
    }

    @Override // com.google.android.gms.internal.ads.zzeya
    public final zzeja zza() {
        return (zzeja) this.zzh.zzb();
    }
}
