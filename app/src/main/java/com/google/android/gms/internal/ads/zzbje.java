package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.ironsource.b9;
import com.ironsource.ug;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzbje implements zzbio {
    private final Object zza = new Object();
    private final Map zzb = new HashMap();

    @Override // com.google.android.gms.internal.ads.zzbio
    public final void zza(Object obj, Map map) {
        String str = (String) map.get(ug.f21009x);
        String str2 = (String) map.get(b9.f.f16606e);
        String str3 = (String) map.get("fail_reason");
        String str4 = (String) map.get("fail_stack");
        String str5 = (String) map.get("result");
        if (true == TextUtils.isEmpty(str4)) {
            str3 = "Unknown Fail Reason.";
        }
        String concat = TextUtils.isEmpty(str4) ? "" : "\n".concat(String.valueOf(str4));
        synchronized (this.zza) {
            zzbjd zzbjdVar = (zzbjd) this.zzb.remove(str);
            if (zzbjdVar == null) {
                int i10 = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzj("Received result for unexpected method invocation: " + str);
            } else if (!TextUtils.isEmpty(str2)) {
                zzbjdVar.zza(str3 + concat);
            } else if (str5 == null) {
                zzbjdVar.zzb(null);
            } else {
                try {
                    JSONObject jSONObject = new JSONObject(str5);
                    if (com.google.android.gms.ads.internal.util.zze.zzc()) {
                        com.google.android.gms.ads.internal.util.zze.zza("Result GMSG: " + jSONObject.toString(2));
                    }
                    zzbjdVar.zzb(jSONObject);
                } catch (JSONException e8) {
                    zzbjdVar.zza(e8.getMessage());
                }
            }
        }
    }

    public final b6.a zzb(zzblv zzblvVar, String str, JSONObject jSONObject) {
        zzbyu zzbyuVar = new zzbyu();
        com.google.android.gms.ads.internal.zzv.zzq();
        String uuid = UUID.randomUUID().toString();
        zzc(uuid, new zzbjc(this, zzbyuVar));
        try {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put(ug.f21009x, uuid);
            jSONObject2.put("args", jSONObject);
            zzblvVar.zzp(str, jSONObject2);
        } catch (Exception e8) {
            zzbyuVar.zzd(e8);
        }
        return zzbyuVar;
    }

    public final void zzc(String str, zzbjd zzbjdVar) {
        synchronized (this.zza) {
            this.zzb.put(str, zzbjdVar);
        }
    }
}
