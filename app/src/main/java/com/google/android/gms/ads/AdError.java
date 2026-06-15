package com.google.android.gms.ads;

import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: com.google.android.gms:play-services-ads-lite@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class AdError {
    public static final String UNDEFINED_DOMAIN = "undefined";

    /* renamed from: a  reason: collision with root package name */
    private final int f11058a;

    /* renamed from: b  reason: collision with root package name */
    private final String f11059b;

    /* renamed from: c  reason: collision with root package name */
    private final String f11060c;

    /* renamed from: d  reason: collision with root package name */
    private final AdError f11061d;

    public AdError(int i10, String str, String str2) {
        this(i10, str, str2, null);
    }

    public AdError(int i10, String str, String str2, AdError adError) {
        this.f11058a = i10;
        this.f11059b = str;
        this.f11060c = str2;
        this.f11061d = adError;
    }

    public AdError getCause() {
        return this.f11061d;
    }

    public int getCode() {
        return this.f11058a;
    }

    public String getDomain() {
        return this.f11060c;
    }

    public String getMessage() {
        return this.f11059b;
    }

    public String toString() {
        try {
            return zzb().toString(2);
        } catch (JSONException unused) {
            return "Error forming toString output.";
        }
    }

    public final com.google.android.gms.ads.internal.client.zze zza() {
        com.google.android.gms.ads.internal.client.zze zzeVar;
        AdError adError = this.f11061d;
        if (adError == null) {
            zzeVar = null;
        } else {
            String str = adError.f11060c;
            zzeVar = new com.google.android.gms.ads.internal.client.zze(adError.f11058a, adError.f11059b, str, null, null);
        }
        return new com.google.android.gms.ads.internal.client.zze(this.f11058a, this.f11059b, this.f11060c, zzeVar, null);
    }

    public JSONObject zzb() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("Code", this.f11058a);
        jSONObject.put("Message", this.f11059b);
        jSONObject.put("Domain", this.f11060c);
        AdError adError = this.f11061d;
        if (adError == null) {
            jSONObject.put("Cause", "null");
        } else {
            jSONObject.put("Cause", adError.zzb());
        }
        return jSONObject;
    }
}
