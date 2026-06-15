package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import org.json.JSONObject;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzegg implements zzebi {
    private final zzehk zza;
    private final zzdnv zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzegg(zzehk zzehkVar, zzdnv zzdnvVar) {
        this.zza = zzehkVar;
        this.zzb = zzdnvVar;
    }

    @Override // com.google.android.gms.internal.ads.zzebi
    public final zzebj zza(String str, JSONObject jSONObject) throws zzfaw {
        zzbqc zzbqcVar;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbbm.zzbM)).booleanValue()) {
            try {
                zzbqcVar = this.zzb.zzb(str);
            } catch (RemoteException e8) {
                int i10 = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzh("Coundn't create RTB adapter: ", e8);
                zzbqcVar = null;
            }
        } else {
            zzbqcVar = this.zza.zza(str);
        }
        if (zzbqcVar == null) {
            return null;
        }
        return new zzebj(zzbqcVar, new zzecx(), str);
    }
}
