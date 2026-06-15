package com.google.android.gms.ads;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zzbb;
import com.google.android.gms.ads.internal.client.zzdx;
import com.google.android.gms.ads.internal.client.zzv;
import com.google.android.gms.ads.internal.util.client.zzo;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: com.google.android.gms:play-services-ads-lite@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class ResponseInfo {

    /* renamed from: a  reason: collision with root package name */
    private final zzdx f11098a;

    /* renamed from: b  reason: collision with root package name */
    private final List f11099b = new ArrayList();

    /* renamed from: c  reason: collision with root package name */
    private AdapterResponseInfo f11100c;

    private ResponseInfo(zzdx zzdxVar) {
        this.f11098a = zzdxVar;
        if (zzdxVar != null) {
            try {
                List<zzv> zzj = zzdxVar.zzj();
                if (zzj != null) {
                    for (zzv zzvVar : zzj) {
                        AdapterResponseInfo zza = AdapterResponseInfo.zza(zzvVar);
                        if (zza != null) {
                            this.f11099b.add(zza);
                        }
                    }
                }
            } catch (RemoteException e8) {
                zzo.zzh("Could not forward getAdapterResponseInfo to ResponseInfo.", e8);
            }
        }
        zzdx zzdxVar2 = this.f11098a;
        if (zzdxVar2 == null) {
            return;
        }
        try {
            zzv zzf = zzdxVar2.zzf();
            if (zzf != null) {
                this.f11100c = AdapterResponseInfo.zza(zzf);
            }
        } catch (RemoteException e10) {
            zzo.zzh("Could not forward getLoadedAdapterResponse to ResponseInfo.", e10);
        }
    }

    public static ResponseInfo zza(zzdx zzdxVar) {
        if (zzdxVar != null) {
            return new ResponseInfo(zzdxVar);
        }
        return null;
    }

    public static ResponseInfo zzb(zzdx zzdxVar) {
        return new ResponseInfo(zzdxVar);
    }

    public List<AdapterResponseInfo> getAdapterResponses() {
        return this.f11099b;
    }

    public AdapterResponseInfo getLoadedAdapterResponseInfo() {
        return this.f11100c;
    }

    public String getMediationAdapterClassName() {
        try {
            zzdx zzdxVar = this.f11098a;
            if (zzdxVar != null) {
                return zzdxVar.zzg();
            }
            return null;
        } catch (RemoteException e8) {
            zzo.zzh("Could not forward getMediationAdapterClassName to ResponseInfo.", e8);
            return null;
        }
    }

    public Bundle getResponseExtras() {
        try {
            zzdx zzdxVar = this.f11098a;
            if (zzdxVar != null) {
                return zzdxVar.zze();
            }
        } catch (RemoteException e8) {
            zzo.zzh("Could not forward getResponseExtras to ResponseInfo.", e8);
        }
        return new Bundle();
    }

    public String getResponseId() {
        try {
            zzdx zzdxVar = this.f11098a;
            if (zzdxVar != null) {
                return zzdxVar.zzi();
            }
            return null;
        } catch (RemoteException e8) {
            zzo.zzh("Could not forward getResponseId to ResponseInfo.", e8);
            return null;
        }
    }

    public String toString() {
        try {
            return zzd().toString(2);
        } catch (JSONException unused) {
            return "Error forming toString output.";
        }
    }

    public final zzdx zzc() {
        return this.f11098a;
    }

    public final JSONObject zzd() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        String responseId = getResponseId();
        if (responseId == null) {
            jSONObject.put("Response ID", "null");
        } else {
            jSONObject.put("Response ID", responseId);
        }
        String mediationAdapterClassName = getMediationAdapterClassName();
        if (mediationAdapterClassName == null) {
            jSONObject.put("Mediation Adapter Class Name", "null");
        } else {
            jSONObject.put("Mediation Adapter Class Name", mediationAdapterClassName);
        }
        JSONArray jSONArray = new JSONArray();
        for (AdapterResponseInfo adapterResponseInfo : this.f11099b) {
            jSONArray.put(adapterResponseInfo.zzb());
        }
        jSONObject.put("Adapter Responses", jSONArray);
        AdapterResponseInfo adapterResponseInfo2 = this.f11100c;
        if (adapterResponseInfo2 != null) {
            jSONObject.put("Loaded Adapter Response", adapterResponseInfo2.zzb());
        }
        Bundle responseExtras = getResponseExtras();
        if (responseExtras != null) {
            jSONObject.put("Response Extras", zzbb.zzb().zzj(responseExtras));
        }
        return jSONObject;
    }
}
