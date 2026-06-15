package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import java.util.concurrent.Executor;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzedi implements zzebm {
    private final Context zza;
    private final zzdeg zzb;
    private final VersionInfoParcel zzc;
    private final Executor zzd;

    public zzedi(Context context, VersionInfoParcel versionInfoParcel, zzdeg zzdegVar, Executor executor) {
        this.zza = context;
        this.zzc = versionInfoParcel;
        this.zzb = zzdegVar;
        this.zzd = executor;
    }

    public static /* synthetic */ void zzc(zzedi zzediVar, zzebj zzebjVar, boolean z10, Context context, zzcus zzcusVar) {
        try {
            ((zzfbn) zzebjVar.zzb).zzv(z10);
            if (zzediVar.zzc.clientJarVersion < ((Integer) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbbm.zzaS)).intValue()) {
                ((zzfbn) zzebjVar.zzb).zzx();
            } else {
                ((zzfbn) zzebjVar.zzb).zzy(context);
            }
        } catch (zzfaw e8) {
            int i10 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzi("Cannot show interstitial.");
            throw new zzden(e8.getCause());
        }
    }

    @Override // com.google.android.gms.internal.ads.zzebm
    public final /* bridge */ /* synthetic */ Object zza(zzfag zzfagVar, zzezu zzezuVar, final zzebj zzebjVar) throws zzfaw, zzeez {
        zzddd zze = this.zzb.zze(new zzcqb(zzfagVar, zzezuVar, zzebjVar.zza), new zzddg(new zzdeo() { // from class: com.google.android.gms.internal.ads.zzedh
            @Override // com.google.android.gms.internal.ads.zzdeo
            public final void zza(boolean z10, Context context, zzcus zzcusVar) {
                zzedi.zzc(zzedi.this, zzebjVar, z10, context, zzcusVar);
            }
        }, null));
        zze.zzd().zzo(new zzcks((zzfbn) zzebjVar.zzb), this.zzd);
        ((zzecx) zzebjVar.zzc).zzc(zze.zzk());
        return zze.zzg();
    }

    @Override // com.google.android.gms.internal.ads.zzebm
    public final void zzb(zzfag zzfagVar, zzezu zzezuVar, zzebj zzebjVar) throws zzfaw {
        zzfbn zzfbnVar = (zzfbn) zzebjVar.zzb;
        zzfap zzfapVar = zzfagVar.zza.zza;
        String jSONObject = zzezuVar.zzv.toString();
        String zzm = com.google.android.gms.ads.internal.util.zzbs.zzm(zzezuVar.zzs);
        zzfbnVar.zzo(this.zza, zzfapVar.zzd, jSONObject, zzm, (zzboj) zzebjVar.zzc);
    }
}
