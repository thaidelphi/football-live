package com.google.android.gms.internal.ads;

import android.content.Context;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
final class zzchf implements zzeuv {
    private final zzcha zza;
    private final zzhdt zzb;
    private final zzhdt zzc;
    private final zzhdt zzd;
    private final zzhdt zze;
    private final zzhdt zzf;
    private final zzhdt zzg;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzchf(zzcha zzchaVar, Context context, String str, zzcie zzcieVar) {
        zzhdt zzhdtVar;
        zzhdt zzhdtVar2;
        zzhdt zzhdtVar3;
        zzhdt zzhdtVar4;
        zzhdt zzhdtVar5;
        zzhdt zzhdtVar6;
        zzhdt zzhdtVar7;
        zzhdt zzhdtVar8;
        zzhdt zzhdtVar9;
        this.zza = zzchaVar;
        zzhdk zza = zzhdl.zza(context);
        this.zzb = zza;
        zzhdk zza2 = zzhdl.zza(str);
        this.zzc = zza2;
        zzhdtVar = zzchaVar.zzbh;
        zzhdtVar2 = zzchaVar.zzbi;
        zzexn zzexnVar = new zzexn(zza, zzhdtVar, zzhdtVar2);
        this.zzd = zzexnVar;
        zzhdtVar3 = zzchaVar.zzbh;
        zzhdt zzc = zzhdj.zzc(new zzevt(zzhdtVar3));
        this.zze = zzc;
        zzhdtVar4 = zzchaVar.zzc;
        zzhdtVar5 = zzchaVar.zzS;
        zzfar zza3 = zzfar.zza();
        zzhdtVar6 = zzchaVar.zzl;
        zzhdt zzc2 = zzhdj.zzc(new zzevv(zza, zzhdtVar4, zzhdtVar5, zzexnVar, zzc, zza3, zzhdtVar6));
        this.zzf = zzc2;
        zzhdtVar7 = zzchaVar.zzS;
        zzhdtVar8 = zzchaVar.zzl;
        zzhdtVar9 = zzchaVar.zzM;
        this.zzg = zzhdj.zzc(new zzewb(zzhdtVar7, zza, zza2, zzc2, zzc, zzhdtVar8, zzhdtVar9));
    }

    @Override // com.google.android.gms.internal.ads.zzeuv
    public final zzewa zza() {
        return (zzewa) this.zzg.zzb();
    }
}
