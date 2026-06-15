package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
final class zzchk implements zzewj {
    private final Context zza;
    private final com.google.android.gms.ads.internal.client.zzr zzb;
    private final String zzc;
    private final zzcha zzd;
    private final zzhdt zze;
    private final zzhdt zzf;
    private final zzhdt zzg;
    private final zzhdt zzh;
    private final zzhdt zzi;
    private final zzhdt zzj;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzchk(zzcha zzchaVar, Context context, String str, com.google.android.gms.ads.internal.client.zzr zzrVar, zzcie zzcieVar) {
        zzhdt zzhdtVar;
        zzhdt zzhdtVar2;
        zzhdt zzhdtVar3;
        this.zzd = zzchaVar;
        this.zza = context;
        this.zzb = zzrVar;
        this.zzc = str;
        zzhdk zza = zzhdl.zza(context);
        this.zze = zza;
        zzhdk zza2 = zzhdl.zza(zzrVar);
        this.zzf = zza2;
        zzhdtVar = zzchaVar.zzM;
        zzhdt zzc = zzhdj.zzc(new zzeit(zzhdtVar));
        this.zzg = zzc;
        zzhdt zzc2 = zzhdj.zzc(zzeiy.zza());
        this.zzh = zzc2;
        zzhdt zzc3 = zzhdj.zzc(zzczf.zza());
        this.zzi = zzc3;
        zzhdtVar2 = zzchaVar.zzc;
        zzhdtVar3 = zzchaVar.zzS;
        this.zzj = zzhdj.zzc(new zzewh(zza, zzhdtVar2, zza2, zzhdtVar3, zzc, zzc2, zzfar.zza(), zzc3));
    }

    @Override // com.google.android.gms.internal.ads.zzewj
    public final zzehy zza() {
        zzcft zzcftVar;
        zzhdt zzhdtVar;
        zzewg zzewgVar = (zzewg) this.zzj.zzb();
        zzeis zzeisVar = (zzeis) this.zzg.zzb();
        zzcftVar = this.zzd.zza;
        VersionInfoParcel zzc = zzcgl.zzc(zzcftVar);
        zzhdtVar = this.zzd.zzM;
        return new zzehy(this.zza, this.zzb, this.zzc, zzewgVar, zzeisVar, zzc, (zzdqf) zzhdtVar.zzb());
    }
}
