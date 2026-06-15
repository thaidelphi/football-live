package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzcso implements zzcxc, zzdcq {
    private final Context zza;
    private final zzfap zzb;
    private final VersionInfoParcel zzc;
    private final com.google.android.gms.ads.internal.util.zzg zzd;
    private final zzdsj zze;
    private final zzffq zzf;

    public zzcso(Context context, zzfap zzfapVar, VersionInfoParcel versionInfoParcel, com.google.android.gms.ads.internal.util.zzg zzgVar, zzdsj zzdsjVar, zzffq zzffqVar) {
        this.zza = context;
        this.zzb = zzfapVar;
        this.zzc = versionInfoParcel;
        this.zzd = zzgVar;
        this.zze = zzdsjVar;
        this.zzf = zzffqVar;
    }

    private final void zzc() {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbbm.zzec)).booleanValue()) {
            com.google.android.gms.ads.internal.util.zzg zzgVar = this.zzd;
            Context context = this.zza;
            VersionInfoParcel versionInfoParcel = this.zzc;
            zzfap zzfapVar = this.zzb;
            zzffq zzffqVar = this.zzf;
            com.google.android.gms.ads.internal.zzv.zza().zze(context, versionInfoParcel, zzfapVar.zzf, zzgVar.zzg(), zzffqVar);
        }
        this.zze.zzr();
    }

    @Override // com.google.android.gms.internal.ads.zzcxc
    public final void zzdl(zzbud zzbudVar) {
        zzc();
    }

    @Override // com.google.android.gms.internal.ads.zzcxc
    public final void zzdm(zzfag zzfagVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzdcq
    public final void zze(com.google.android.gms.ads.nonagon.signalgeneration.zzbk zzbkVar) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbbm.zzed)).booleanValue()) {
            zzc();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdcq
    public final void zzf(String str) {
    }
}
