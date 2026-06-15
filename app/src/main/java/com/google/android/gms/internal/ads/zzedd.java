package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzedd implements zzdeo {
    private final Context zza;
    private final VersionInfoParcel zzb;
    private final b6.a zzc;
    private final zzezu zzd;
    private final zzcdq zze;
    private final zzfap zzf;
    private final zzbir zzg;
    private final boolean zzh;
    private final zzeaf zzi;
    private final zzdqf zzj;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzedd(Context context, VersionInfoParcel versionInfoParcel, b6.a aVar, zzezu zzezuVar, zzcdq zzcdqVar, zzfap zzfapVar, boolean z10, zzbir zzbirVar, zzeaf zzeafVar, zzdqf zzdqfVar) {
        this.zza = context;
        this.zzb = versionInfoParcel;
        this.zzc = aVar;
        this.zzd = zzezuVar;
        this.zze = zzcdqVar;
        this.zzf = zzfapVar;
        this.zzg = zzbirVar;
        this.zzh = z10;
        this.zzi = zzeafVar;
        this.zzj = zzdqfVar;
    }

    @Override // com.google.android.gms.internal.ads.zzdeo
    public final void zza(boolean z10, Context context, zzcus zzcusVar) {
        zzddd zzdddVar = (zzddd) zzgap.zzq(this.zzc);
        this.zze.zzaq(true);
        boolean zze = this.zzh ? this.zzg.zze(false) : false;
        com.google.android.gms.ads.internal.zzv.zzq();
        com.google.android.gms.ads.internal.zzl zzlVar = new com.google.android.gms.ads.internal.zzl(zze, com.google.android.gms.ads.internal.util.zzs.zzJ(this.zza), this.zzh ? this.zzg.zzd() : false, this.zzh ? this.zzg.zza() : 0.0f, -1, z10, this.zzd.zzO, false);
        if (zzcusVar != null) {
            zzcusVar.zzf();
        }
        com.google.android.gms.ads.internal.zzv.zzj();
        zzded zzh = zzdddVar.zzh();
        zzcdq zzcdqVar = this.zze;
        zzezu zzezuVar = this.zzd;
        VersionInfoParcel versionInfoParcel = this.zzb;
        int i10 = zzezuVar.zzQ;
        String str = zzezuVar.zzB;
        zzezz zzezzVar = zzezuVar.zzs;
        com.google.android.gms.ads.internal.overlay.zzn.zza(context, new AdOverlayInfoParcel(null, zzh, null, zzcdqVar, i10, versionInfoParcel, str, zzlVar, zzezzVar.zzb, zzezzVar.zza, this.zzf.zzf, zzcusVar, zzezuVar.zzb() ? this.zzi : null, this.zze.zzr()), true, this.zzj);
    }
}
