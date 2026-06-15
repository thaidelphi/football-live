package com.applovin.impl;

import com.applovin.impl.sdk.AppLovinError;
import com.applovin.impl.sdk.nativeAd.AppLovinNativeAdLoadListener;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.mediation.MaxAdFormat;
import org.json.JSONArray;
import org.json.JSONObject;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class z5 extends z4 {

    /* renamed from: g  reason: collision with root package name */
    private final JSONObject f9833g;

    /* renamed from: h  reason: collision with root package name */
    private final AppLovinNativeAdLoadListener f9834h;

    public z5(JSONObject jSONObject, AppLovinNativeAdLoadListener appLovinNativeAdLoadListener, com.applovin.impl.sdk.j jVar) {
        super("TaskProcessNativeAdResponse", jVar);
        this.f9833g = jSONObject;
        this.f9834h = appLovinNativeAdLoadListener;
    }

    @Override // java.lang.Runnable
    public void run() {
        JSONArray jSONArray = JsonUtils.getJSONArray(this.f9833g, "ads", new JSONArray());
        if (jSONArray.length() > 0) {
            if (com.applovin.impl.sdk.n.a()) {
                this.f9829c.a(this.f9828b, "Processing ad...");
            }
            this.f9827a.i0().a(new com.applovin.impl.sdk.nativeAd.b(JsonUtils.getJSONObject(jSONArray, 0, new JSONObject()), this.f9833g, this.f9834h, this.f9827a));
            return;
        }
        if (com.applovin.impl.sdk.n.a()) {
            this.f9829c.k(this.f9828b, "No ads were returned from the server");
        }
        d7.a("native_native", MaxAdFormat.NATIVE, this.f9833g, this.f9827a);
        this.f9834h.onNativeAdLoadFailed(AppLovinError.NO_FILL);
    }
}
