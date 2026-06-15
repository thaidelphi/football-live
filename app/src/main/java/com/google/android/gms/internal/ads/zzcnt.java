package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzcnt implements zzhdk {
    private final zzcnl zza;
    private final zzhdt zzb;
    private final zzhdt zzc;
    private final zzhdt zzd;
    private final zzhdt zze;

    public zzcnt(zzcnl zzcnlVar, zzhdt zzhdtVar, zzhdt zzhdtVar2, zzhdt zzhdtVar3, zzhdt zzhdtVar4) {
        this.zza = zzcnlVar;
        this.zzb = zzhdtVar;
        this.zzc = zzhdtVar2;
        this.zzd = zzhdtVar3;
        this.zze = zzhdtVar4;
    }

    public static zzdbw zza(zzcnl zzcnlVar, final Context context, final VersionInfoParcel versionInfoParcel, final zzezu zzezuVar, final zzfap zzfapVar) {
        return new zzdbw(new zzcvt() { // from class: com.google.android.gms.internal.ads.zzcnj
            @Override // com.google.android.gms.internal.ads.zzcvt
            public final void zzs() {
                com.google.android.gms.ads.internal.util.zzay zzt = com.google.android.gms.ads.internal.zzv.zzt();
                Context context2 = context;
                zzfap zzfapVar2 = zzfapVar;
                zzt.zzn(context2, versionInfoParcel.afmaVersion, zzezuVar.zzC.toString(), zzfapVar2.zzf);
            }
        }, zzbyp.zzg);
    }

    @Override // com.google.android.gms.internal.ads.zzheb, com.google.android.gms.internal.ads.zzhea
    public final /* bridge */ /* synthetic */ Object zzb() {
        VersionInfoParcel zza = ((zzcgl) this.zzc).zza();
        zzezu zza2 = ((zzcqc) this.zzd).zza();
        zzfap zza3 = ((zzctw) this.zze).zza();
        return zza(this.zza, (Context) this.zzb.zzb(), zza, zza2, zza3);
    }
}
