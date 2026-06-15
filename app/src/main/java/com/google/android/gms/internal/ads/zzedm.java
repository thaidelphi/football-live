package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.ads.AdFormat;
import com.google.android.gms.dynamic.ObjectWrapper;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzedm implements zzebm {
    private final Context zza;
    private final zzdeg zzb;

    public zzedm(Context context, zzdeg zzdegVar) {
        this.zza = context;
        this.zzb = zzdegVar;
    }

    @Override // com.google.android.gms.internal.ads.zzebm
    public final /* bridge */ /* synthetic */ Object zza(zzfag zzfagVar, zzezu zzezuVar, zzebj zzebjVar) throws zzfaw, zzeez {
        zzedg zzedgVar = new zzedg(zzezuVar, (zzbqc) zzebjVar.zzb, AdFormat.INTERSTITIAL);
        zzddd zze = this.zzb.zze(new zzcqb(zzfagVar, zzezuVar, zzebjVar.zza), new zzddg(zzedgVar, null));
        zzedgVar.zzb(zze.zzc());
        ((zzecx) zzebjVar.zzc).zzc(zze.zzj());
        return zze.zzg();
    }

    @Override // com.google.android.gms.internal.ads.zzebm
    public final void zzb(zzfag zzfagVar, zzezu zzezuVar, zzebj zzebjVar) throws zzfaw {
        try {
            ((zzbqc) zzebjVar.zzb).zzq(zzezuVar.zzZ);
            ((zzbqc) zzebjVar.zzb).zzl(zzezuVar.zzU, zzezuVar.zzv.toString(), zzfagVar.zza.zza.zzd, ObjectWrapper.u0(this.zza), new zzedk(this, zzebjVar, null), (zzboj) zzebjVar.zzc);
        } catch (RemoteException e8) {
            com.google.android.gms.ads.internal.util.zze.zzb("Remote exception loading a interstitial RTB ad", e8);
            throw new zzfaw(e8);
        }
    }
}
