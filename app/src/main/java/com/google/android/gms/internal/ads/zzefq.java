package com.google.android.gms.internal.ads;

import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzefq implements zzebi {
    private final Map zza = new HashMap();
    private final zzdnv zzb;

    public zzefq(zzdnv zzdnvVar) {
        this.zzb = zzdnvVar;
    }

    @Override // com.google.android.gms.internal.ads.zzebi
    public final zzebj zza(String str, JSONObject jSONObject) throws zzfaw {
        zzebj zzebjVar;
        synchronized (this) {
            zzebjVar = (zzebj) this.zza.get(str);
            if (zzebjVar == null) {
                zzebjVar = new zzebj(this.zzb.zzc(str, jSONObject), new zzecy(), str);
                this.zza.put(str, zzebjVar);
            }
        }
        return zzebjVar;
    }
}
