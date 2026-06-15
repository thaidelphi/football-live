package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzddn implements zzhdk {
    private final zzhdt zza;
    private final zzhdt zzb;
    private final zzhdt zzc;
    private final zzhdt zzd;

    public zzddn(zzddg zzddgVar, zzhdt zzhdtVar, zzhdt zzhdtVar2, zzhdt zzhdtVar3, zzhdt zzhdtVar4) {
        this.zza = zzhdtVar;
        this.zzb = zzhdtVar2;
        this.zzc = zzhdtVar3;
        this.zzd = zzhdtVar4;
    }

    @Override // com.google.android.gms.internal.ads.zzheb, com.google.android.gms.internal.ads.zzhea
    public final /* bridge */ /* synthetic */ Object zzb() {
        final Context context = (Context) this.zza.zzb();
        final VersionInfoParcel zza = ((zzcgl) this.zzb).zza();
        final zzezu zza2 = ((zzcqc) this.zzc).zza();
        final zzfap zza3 = ((zzctw) this.zzd).zza();
        return new zzdbw(new zzcvt() { // from class: com.google.android.gms.internal.ads.zzdde
            @Override // com.google.android.gms.internal.ads.zzcvt
            public final void zzs() {
                com.google.android.gms.ads.internal.util.zzay zzt = com.google.android.gms.ads.internal.zzv.zzt();
                Context context2 = context;
                zzfap zzfapVar = zza3;
                zzt.zzn(context2, zza.afmaVersion, zza2.zzC.toString(), zzfapVar.zzf);
            }
        }, zzbyp.zzg);
    }
}
