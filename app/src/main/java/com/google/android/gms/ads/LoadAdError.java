package com.google.android.gms.ads;

import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: com.google.android.gms:play-services-ads-lite@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class LoadAdError extends AdError {

    /* renamed from: e  reason: collision with root package name */
    private final ResponseInfo f11084e;

    public LoadAdError(int i10, String str, String str2, AdError adError, ResponseInfo responseInfo) {
        super(i10, str, str2, adError);
        this.f11084e = responseInfo;
    }

    public ResponseInfo getResponseInfo() {
        return this.f11084e;
    }

    @Override // com.google.android.gms.ads.AdError
    public String toString() {
        try {
            return zzb().toString(2);
        } catch (JSONException unused) {
            return "Error forming toString output.";
        }
    }

    @Override // com.google.android.gms.ads.AdError
    public final JSONObject zzb() throws JSONException {
        JSONObject zzb = super.zzb();
        ResponseInfo responseInfo = getResponseInfo();
        if (responseInfo == null) {
            zzb.put("Response Info", "null");
        } else {
            zzb.put("Response Info", responseInfo.zzd());
        }
        return zzb;
    }
}
