package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import java.util.Map;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzdlg implements zzbio {
    private final zzbgc zza;
    private final zzdlu zzb;
    private final zzhde zzc;

    public zzdlg(zzdhc zzdhcVar, zzdgr zzdgrVar, zzdlu zzdluVar, zzhde zzhdeVar) {
        this.zza = zzdhcVar.zzc(zzdgrVar.zzA());
        this.zzb = zzdluVar;
        this.zzc = zzhdeVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbio
    public final void zza(Object obj, Map map) {
        String str = (String) map.get("asset");
        try {
            this.zza.zze((zzbfs) this.zzc.zzb(), str);
        } catch (RemoteException e8) {
            int i10 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzk("Failed to call onCustomClick for asset " + str + ".", e8);
        }
    }

    public final void zzb() {
        if (this.zza == null) {
            return;
        }
        this.zzb.zzl("/nativeAdCustomClick", this);
    }
}
