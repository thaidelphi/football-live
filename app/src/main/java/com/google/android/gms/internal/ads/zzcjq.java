package com.google.android.gms.internal.ads;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONObject;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzcjq {
    private final Map zza;
    private final Map zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzcjq(Map map, Map map2) {
        this.zza = map;
        this.zzb = map2;
    }

    public final void zza(zzfag zzfagVar) throws Exception {
        for (zzfae zzfaeVar : zzfagVar.zzb.zzc) {
            if (this.zza.containsKey(zzfaeVar.zza) && zzfaeVar.zzb != null) {
                ((zzcjt) this.zza.get(zzfaeVar.zza)).zza(zzfaeVar.zzb);
            } else if (this.zzb.containsKey(zzfaeVar.zza) && zzfaeVar.zzb != null) {
                zzcjs zzcjsVar = (zzcjs) this.zzb.get(zzfaeVar.zza);
                JSONObject jSONObject = zzfaeVar.zzb;
                HashMap hashMap = new HashMap();
                Iterator<String> keys = jSONObject.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    String optString = jSONObject.optString(next);
                    if (optString != null) {
                        hashMap.put(next, optString);
                    }
                }
                zzcjsVar.zza(hashMap);
            }
        }
    }
}
