package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.ads.AdFormat;
import com.google.android.gms.dynamic.ObjectWrapper;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzebz implements zzebm {
    private final Context zza;
    private final zzcms zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzebz(Context context, zzcms zzcmsVar) {
        this.zza = context;
        this.zzb = zzcmsVar;
    }

    @Override // com.google.android.gms.internal.ads.zzebm
    public final /* bridge */ /* synthetic */ Object zza(zzfag zzfagVar, zzezu zzezuVar, zzebj zzebjVar) throws zzfaw, zzeez {
        zzedg zzedgVar = new zzedg(zzezuVar, (zzbqc) zzebjVar.zzb, AdFormat.APP_OPEN_AD);
        zzcmp zza = this.zzb.zza(new zzcqb(zzfagVar, zzezuVar, zzebjVar.zza), new zzddg(zzedgVar, null), new zzcmq(zzezuVar.zzaa));
        zzedgVar.zzb(zza.zzc());
        ((zzecx) zzebjVar.zzc).zzc(zza.zzj());
        return zza.zza();
    }

    @Override // com.google.android.gms.internal.ads.zzebm
    public final void zzb(zzfag zzfagVar, zzezu zzezuVar, zzebj zzebjVar) throws zzfaw {
        try {
            ((zzbqc) zzebjVar.zzb).zzq(zzezuVar.zzZ);
            ((zzbqc) zzebjVar.zzb).zzi(zzezuVar.zzU, zzezuVar.zzv.toString(), zzfagVar.zza.zza.zzd, ObjectWrapper.u0(this.zza), new zzebx(zzebjVar, null), (zzboj) zzebjVar.zzc);
        } catch (RemoteException e8) {
            com.google.android.gms.ads.internal.util.zze.zzb("Remote exception loading an app open RTB ad", e8);
            throw new zzfaw(e8);
        }
    }
}
