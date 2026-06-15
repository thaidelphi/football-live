package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.dynamic.ObjectWrapper;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzeeb implements zzebm {
    private final Context zza;
    private final zzdfc zzb;
    private zzbos zzc;
    private final VersionInfoParcel zzd;

    public zzeeb(Context context, zzdfc zzdfcVar, VersionInfoParcel versionInfoParcel) {
        this.zza = context;
        this.zzb = zzdfcVar;
        this.zzd = versionInfoParcel;
    }

    @Override // com.google.android.gms.internal.ads.zzebm
    public final /* bridge */ /* synthetic */ Object zza(zzfag zzfagVar, zzezu zzezuVar, zzebj zzebjVar) throws zzfaw, zzeez {
        if (zzfagVar.zza.zza.zzg.contains(Integer.toString(6))) {
            zzdgr zzt = zzdgr.zzt(this.zzc);
            zzfap zzfapVar = zzfagVar.zza.zza;
            if (zzfapVar.zzg.contains(Integer.toString(zzt.zzc()))) {
                zzdgt zze = this.zzb.zze(new zzcqb(zzfagVar, zzezuVar, zzebjVar.zza), new zzdhd(zzt), new zzdiw(null, null, this.zzc));
                ((zzecx) zzebjVar.zzc).zzc(zze.zzj());
                return zze.zza();
            }
            throw new zzeez(1, "No corresponding native ad listener");
        }
        throw new zzeez(2, "Unified must be used for RTB.");
    }

    @Override // com.google.android.gms.internal.ads.zzebm
    public final void zzb(zzfag zzfagVar, zzezu zzezuVar, zzebj zzebjVar) throws zzfaw {
        try {
            ((zzbqc) zzebjVar.zzb).zzq(zzezuVar.zzZ);
            if (this.zzd.clientJarVersion < ((Integer) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbbm.zzbP)).intValue()) {
                ((zzbqc) zzebjVar.zzb).zzm(zzezuVar.zzU, zzezuVar.zzv.toString(), zzfagVar.zza.zza.zzd, ObjectWrapper.u0(this.zza), new zzedz(this, zzebjVar, null), (zzboj) zzebjVar.zzc);
            } else {
                ((zzbqc) zzebjVar.zzb).zzn(zzezuVar.zzU, zzezuVar.zzv.toString(), zzfagVar.zza.zza.zzd, ObjectWrapper.u0(this.zza), new zzedz(this, zzebjVar, null), (zzboj) zzebjVar.zzc, zzfagVar.zza.zza.zzi);
            }
        } catch (RemoteException e8) {
            throw new zzfaw(e8);
        }
    }
}
