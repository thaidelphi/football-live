package com.google.android.gms.ads;

import android.os.Bundle;
import com.google.android.gms.ads.internal.client.zzv;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: com.google.android.gms:play-services-ads-lite@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class AdapterResponseInfo {

    /* renamed from: a  reason: collision with root package name */
    private final zzv f11081a;

    /* renamed from: b  reason: collision with root package name */
    private final AdError f11082b;

    private AdapterResponseInfo(zzv zzvVar) {
        this.f11081a = zzvVar;
        com.google.android.gms.ads.internal.client.zze zzeVar = zzvVar.zzc;
        this.f11082b = zzeVar == null ? null : zzeVar.zza();
    }

    public static AdapterResponseInfo zza(zzv zzvVar) {
        if (zzvVar != null) {
            return new AdapterResponseInfo(zzvVar);
        }
        return null;
    }

    public AdError getAdError() {
        return this.f11082b;
    }

    public String getAdSourceId() {
        return this.f11081a.zzf;
    }

    public String getAdSourceInstanceId() {
        return this.f11081a.zzh;
    }

    public String getAdSourceInstanceName() {
        return this.f11081a.zzg;
    }

    public String getAdSourceName() {
        return this.f11081a.zze;
    }

    public String getAdapterClassName() {
        return this.f11081a.zza;
    }

    public Bundle getCredentials() {
        return this.f11081a.zzd;
    }

    public long getLatencyMillis() {
        return this.f11081a.zzb;
    }

    public String toString() {
        try {
            return zzb().toString(2);
        } catch (JSONException unused) {
            return "Error forming toString output.";
        }
    }

    public final JSONObject zzb() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("Adapter", this.f11081a.zza);
        jSONObject.put("Latency", this.f11081a.zzb);
        String adSourceName = getAdSourceName();
        if (adSourceName == null) {
            jSONObject.put("Ad Source Name", "null");
        } else {
            jSONObject.put("Ad Source Name", adSourceName);
        }
        String adSourceId = getAdSourceId();
        if (adSourceId == null) {
            jSONObject.put("Ad Source ID", "null");
        } else {
            jSONObject.put("Ad Source ID", adSourceId);
        }
        String adSourceInstanceName = getAdSourceInstanceName();
        if (adSourceInstanceName == null) {
            jSONObject.put("Ad Source Instance Name", "null");
        } else {
            jSONObject.put("Ad Source Instance Name", adSourceInstanceName);
        }
        String adSourceInstanceId = getAdSourceInstanceId();
        if (adSourceInstanceId == null) {
            jSONObject.put("Ad Source Instance ID", "null");
        } else {
            jSONObject.put("Ad Source Instance ID", adSourceInstanceId);
        }
        JSONObject jSONObject2 = new JSONObject();
        for (String str : this.f11081a.zzd.keySet()) {
            jSONObject2.put(str, this.f11081a.zzd.get(str));
        }
        jSONObject.put("Credentials", jSONObject2);
        AdError adError = this.f11082b;
        if (adError == null) {
            jSONObject.put("Ad Error", "null");
        } else {
            jSONObject.put("Ad Error", adError.zzb());
        }
        return jSONObject;
    }
}
