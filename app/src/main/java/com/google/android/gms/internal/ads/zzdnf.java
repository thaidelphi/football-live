package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzdnf {
    private final Context zza;
    private final zzauc zzb;
    private final zzbct zzc;
    private final VersionInfoParcel zzd;
    private final com.google.android.gms.ads.internal.zza zze;
    private final zzbak zzf;
    private final zzcwx zzg;
    private final zzeaf zzh;
    private final zzfat zzi;

    public zzdnf(zzced zzcedVar, Context context, zzauc zzaucVar, zzbct zzbctVar, VersionInfoParcel versionInfoParcel, com.google.android.gms.ads.internal.zza zzaVar, zzbak zzbakVar, zzcwx zzcwxVar, zzeaf zzeafVar, zzfat zzfatVar) {
        this.zza = context;
        this.zzb = zzaucVar;
        this.zzc = zzbctVar;
        this.zzd = versionInfoParcel;
        this.zze = zzaVar;
        this.zzf = zzbakVar;
        this.zzg = zzcwxVar;
        this.zzh = zzeafVar;
        this.zzi = zzfatVar;
    }

    public final zzcdq zza(com.google.android.gms.ads.internal.client.zzr zzrVar, zzezu zzezuVar, zzezx zzezxVar) throws zzcec {
        zzcfk zzc = zzcfk.zzc(zzrVar);
        String str = zzrVar.zza;
        zzdmu zzdmuVar = new zzdmu(this);
        zzeaf zzeafVar = this.zzh;
        zzfat zzfatVar = this.zzi;
        com.google.android.gms.ads.internal.zza zzaVar = this.zze;
        zzbak zzbakVar = this.zzf;
        return zzced.zza(this.zza, zzc, str, false, false, this.zzb, this.zzc, this.zzd, null, zzdmuVar, zzaVar, zzbakVar, zzezuVar, zzezxVar, zzeafVar, zzfatVar);
    }
}
