package com.google.android.gms.internal.ads;

import android.content.Context;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
final class zzchx implements zzezo {
    private final zzcha zza;
    private final zzhdt zzb;
    private final zzhdt zzc;
    private final zzhdt zzd;
    private final zzhdt zze;
    private final zzhdt zzf;
    private final zzhdt zzg;
    private final zzhdt zzh;
    private final zzhdt zzi;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzchx(zzcha zzchaVar, Context context, String str, zzcie zzcieVar) {
        zzhdt zzhdtVar;
        zzhdt zzhdtVar2;
        zzhdt zzhdtVar3;
        zzhdt zzhdtVar4;
        zzhdt zzhdtVar5;
        zzhdt zzhdtVar6;
        zzhdt zzhdtVar7;
        zzhdt zzhdtVar8;
        this.zza = zzchaVar;
        zzhdk zza = zzhdl.zza(context);
        this.zzb = zza;
        zzhdtVar = zzchaVar.zzbh;
        zzhdtVar2 = zzchaVar.zzbi;
        zzexo zzexoVar = new zzexo(zza, zzhdtVar, zzhdtVar2);
        this.zzc = zzexoVar;
        zzhdtVar3 = zzchaVar.zzbh;
        zzhdt zzc = zzhdj.zzc(new zzeyy(zzhdtVar3));
        this.zzd = zzc;
        zzhdt zzc2 = zzhdj.zzc(zzfam.zza());
        this.zze = zzc2;
        zzhdtVar4 = zzchaVar.zzc;
        zzhdtVar5 = zzchaVar.zzS;
        zzhdt zzc3 = zzhdj.zzc(new zzezi(zza, zzhdtVar4, zzhdtVar5, zzexoVar, zzc, zzfar.zza(), zzc2));
        this.zzf = zzc3;
        this.zzg = zzhdj.zzc(new zzezs(zzc3, zzc, zzc2));
        zzhdk zzc4 = zzhdl.zzc(str);
        this.zzh = zzc4;
        zzhdtVar6 = zzchaVar.zzl;
        zzhdtVar7 = zzchaVar.zzU;
        zzhdtVar8 = zzchaVar.zzM;
        this.zzi = zzhdj.zzc(new zzezm(zzc4, zzc3, zza, zzc, zzc2, zzhdtVar6, zzhdtVar7, zzhdtVar8));
    }

    @Override // com.google.android.gms.internal.ads.zzezo
    public final zzezl zza() {
        return (zzezl) this.zzi.zzb();
    }

    @Override // com.google.android.gms.internal.ads.zzezo
    public final zzezr zzb() {
        return (zzezr) this.zzg.zzb();
    }
}
