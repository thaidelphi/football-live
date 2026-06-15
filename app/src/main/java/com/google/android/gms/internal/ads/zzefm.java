package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.ads.AdFormat;
import com.google.android.gms.dynamic.ObjectWrapper;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzefm implements zzebm {
    private final Context zza;
    private final zzdmo zzb;

    public zzefm(Context context, zzdmo zzdmoVar) {
        this.zza = context;
        this.zzb = zzdmoVar;
    }

    @Override // com.google.android.gms.internal.ads.zzebm
    public final /* bridge */ /* synthetic */ Object zza(zzfag zzfagVar, zzezu zzezuVar, zzebj zzebjVar) throws zzfaw, zzeez {
        zzedg zzedgVar = new zzedg(zzezuVar, (zzbqc) zzebjVar.zzb, AdFormat.REWARDED);
        zzdmk zze = this.zzb.zze(new zzcqb(zzfagVar, zzezuVar, zzebjVar.zza), new zzdml(zzedgVar));
        zzedgVar.zzb(zze.zzc());
        ((zzecx) zzebjVar.zzc).zzc(zze.zzo());
        return zze.zzi();
    }

    @Override // com.google.android.gms.internal.ads.zzebm
    public final void zzb(zzfag zzfagVar, zzezu zzezuVar, zzebj zzebjVar) throws zzfaw {
        try {
            ((zzbqc) zzebjVar.zzb).zzq(zzezuVar.zzZ);
            if (zzfagVar.zza.zza.zzo.zza == 3) {
                ((zzbqc) zzebjVar.zzb).zzo(zzezuVar.zzU, zzezuVar.zzv.toString(), zzfagVar.zza.zza.zzd, ObjectWrapper.u0(this.zza), new zzefk(this, zzebjVar, null), (zzboj) zzebjVar.zzc);
            } else {
                ((zzbqc) zzebjVar.zzb).zzp(zzezuVar.zzU, zzezuVar.zzv.toString(), zzfagVar.zza.zza.zzd, ObjectWrapper.u0(this.zza), new zzefk(this, zzebjVar, null), (zzboj) zzebjVar.zzc);
            }
        } catch (RemoteException e8) {
            com.google.android.gms.ads.internal.util.zze.zzb("Remote exception loading a rewarded RTB ad", e8);
        }
    }
}
