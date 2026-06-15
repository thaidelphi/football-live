package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzebt implements zzdeo {
    private final VersionInfoParcel zza;
    private final b6.a zzb;
    private final zzezu zzc;
    private final zzcdq zzd;
    private final zzfap zze;
    private final zzbir zzf;
    private final boolean zzg;
    private final zzeaf zzh;
    private final zzdqf zzi;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzebt(VersionInfoParcel versionInfoParcel, b6.a aVar, zzezu zzezuVar, zzcdq zzcdqVar, zzfap zzfapVar, boolean z10, zzbir zzbirVar, zzeaf zzeafVar, zzdqf zzdqfVar) {
        this.zza = versionInfoParcel;
        this.zzb = aVar;
        this.zzc = zzezuVar;
        this.zzd = zzcdqVar;
        this.zze = zzfapVar;
        this.zzg = z10;
        this.zzf = zzbirVar;
        this.zzh = zzeafVar;
        this.zzi = zzdqfVar;
    }

    @Override // com.google.android.gms.internal.ads.zzdeo
    public final void zza(boolean z10, Context context, zzcus zzcusVar) {
        zzcmp zzcmpVar = (zzcmp) zzgap.zzq(this.zzb);
        this.zzd.zzaq(true);
        boolean zze = this.zzg ? this.zzf.zze(true) : true;
        boolean z11 = this.zzg;
        com.google.android.gms.ads.internal.zzl zzlVar = new com.google.android.gms.ads.internal.zzl(zze, true, z11 ? this.zzf.zzd() : false, z11 ? this.zzf.zza() : 0.0f, -1, z10, this.zzc.zzO, false);
        if (zzcusVar != null) {
            zzcusVar.zzf();
        }
        com.google.android.gms.ads.internal.zzv.zzj();
        zzded zzg = zzcmpVar.zzg();
        zzcdq zzcdqVar = this.zzd;
        int i10 = this.zzc.zzQ;
        if (i10 == -1) {
            com.google.android.gms.ads.internal.client.zzx zzxVar = this.zze.zzj;
            if (zzxVar != null) {
                int i11 = zzxVar.zza;
                if (i11 == 1) {
                    i10 = 7;
                } else if (i11 == 2) {
                    i10 = 6;
                }
            }
            int i12 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zze("Error setting app open orientation; no targeting orientation available.");
            i10 = this.zzc.zzQ;
        }
        int i13 = i10;
        VersionInfoParcel versionInfoParcel = this.zza;
        zzezu zzezuVar = this.zzc;
        String str = zzezuVar.zzB;
        zzezz zzezzVar = zzezuVar.zzs;
        com.google.android.gms.ads.internal.overlay.zzn.zza(context, new AdOverlayInfoParcel(null, zzg, null, zzcdqVar, i13, versionInfoParcel, str, zzlVar, zzezzVar.zzb, zzezzVar.zza, this.zze.zzf, zzcusVar, zzezuVar.zzb() ? this.zzh : null, this.zzd.zzr()), true, this.zzi);
    }
}
