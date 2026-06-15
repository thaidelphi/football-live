package com.google.android.gms.internal.ads;

import com.ironsource.b9;
import com.ironsource.ls;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
final class zzdxt implements zzbmy {
    @Override // com.google.android.gms.internal.ads.zzbmy
    public final /* bridge */ /* synthetic */ JSONObject zzb(Object obj) throws JSONException {
        zzdxu zzdxuVar = (zzdxu) obj;
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        JSONObject jSONObject3 = new JSONObject();
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbbm.zzjj)).booleanValue()) {
            jSONObject2.put("ad_request_url", zzdxuVar.zzd.zzg());
            jSONObject2.put("ad_request_post_body", zzdxuVar.zzd.zzf());
        }
        jSONObject2.put("base_url", zzdxuVar.zzd.zzd());
        jSONObject2.put("signals", zzdxuVar.zzc);
        jSONObject3.put(b9.h.E0, zzdxuVar.zzb.zzc);
        jSONObject3.put("headers", com.google.android.gms.ads.internal.client.zzbb.zzb().zzk(zzdxuVar.zzb.zzb));
        jSONObject3.put("response_code", zzdxuVar.zzb.zza);
        jSONObject3.put("latency", zzdxuVar.zzb.zzd);
        jSONObject.put("request", jSONObject2);
        jSONObject.put(ls.f18303n, jSONObject3);
        jSONObject.put("flags", zzdxuVar.zzd.zzi());
        return jSONObject;
    }
}
