package com.applovin.impl;

import com.applovin.impl.sdk.AppLovinError;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.sdk.AppLovinAd;
import com.applovin.sdk.AppLovinAdLoadListener;
import com.applovin.sdk.AppLovinErrorCodes;
import com.google.android.gms.ads.AdError;
import org.json.JSONArray;
import org.json.JSONObject;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class v5 extends z4 implements g2 {

    /* renamed from: g  reason: collision with root package name */
    private final JSONObject f9465g;

    /* renamed from: h  reason: collision with root package name */
    private final q f9466h;

    /* renamed from: i  reason: collision with root package name */
    private final AppLovinAdLoadListener f9467i;

    /* renamed from: j  reason: collision with root package name */
    private final boolean f9468j;

    public v5(JSONObject jSONObject, q qVar, AppLovinAdLoadListener appLovinAdLoadListener, com.applovin.impl.sdk.j jVar) {
        this(jSONObject, qVar, false, appLovinAdLoadListener, jVar);
    }

    private void a(JSONObject jSONObject) {
        String string = JsonUtils.getString(jSONObject, "type", AdError.UNDEFINED_DOMAIN);
        if ("applovin".equalsIgnoreCase(string)) {
            if (com.applovin.impl.sdk.n.a()) {
                this.f9829c.a(this.f9828b, "Starting task for AppLovin ad...");
            }
            this.f9827a.i0().a(new c6(jSONObject, this.f9465g, this, this.f9827a));
        } else if ("vast".equalsIgnoreCase(string)) {
            if (com.applovin.impl.sdk.n.a()) {
                this.f9829c.a(this.f9828b, "Starting task for VAST ad...");
            }
            this.f9827a.i0().a(a6.a(jSONObject, this.f9465g, this, this.f9827a));
        } else if ("js_tag".equalsIgnoreCase(string)) {
            if (com.applovin.impl.sdk.n.a()) {
                this.f9829c.a(this.f9828b, "Starting task for JS tag ad...");
            }
            this.f9827a.i0().a(new w5(jSONObject, this.f9465g, this, this.f9827a));
        } else {
            if (com.applovin.impl.sdk.n.a()) {
                com.applovin.impl.sdk.n nVar = this.f9829c;
                String str = this.f9828b;
                nVar.b(str, "Unable to process ad of unknown type: " + string);
            }
            failedToReceiveAdV2(new AppLovinError(AppLovinErrorCodes.INVALID_RESPONSE, "Unknown ad type: " + string));
        }
    }

    @Override // com.applovin.sdk.AppLovinAdLoadListener
    public void adReceived(AppLovinAd appLovinAd) {
        AppLovinAdLoadListener appLovinAdLoadListener = this.f9467i;
        if (appLovinAdLoadListener != null) {
            appLovinAdLoadListener.adReceived(appLovinAd);
        }
        if (this.f9468j || !(appLovinAd instanceof com.applovin.impl.sdk.ad.b)) {
            return;
        }
        this.f9827a.D().a(y1.f9676l, (com.applovin.impl.sdk.ad.b) appLovinAd);
    }

    @Override // com.applovin.sdk.AppLovinAdLoadListener
    public void failedToReceiveAd(int i10) {
        failedToReceiveAdV2(new AppLovinError(i10, ""));
    }

    @Override // com.applovin.impl.g2
    public void failedToReceiveAdV2(AppLovinError appLovinError) {
        AppLovinAdLoadListener appLovinAdLoadListener = this.f9467i;
        if (appLovinAdLoadListener == null) {
            return;
        }
        if (appLovinAdLoadListener instanceof g2) {
            ((g2) appLovinAdLoadListener).failedToReceiveAdV2(appLovinError);
        } else {
            appLovinAdLoadListener.failedToReceiveAd(appLovinError.getCode());
        }
        if (this.f9468j) {
            return;
        }
        this.f9827a.D().a(y1.f9678m, this.f9466h, appLovinError);
    }

    @Override // java.lang.Runnable
    public void run() {
        JSONArray jSONArray = JsonUtils.getJSONArray(this.f9465g, "ads", new JSONArray());
        if (jSONArray.length() > 0) {
            if (com.applovin.impl.sdk.n.a()) {
                this.f9829c.a(this.f9828b, "Processing ad...");
            }
            a(JsonUtils.getJSONObject(jSONArray, 0, new JSONObject()));
            return;
        }
        if (com.applovin.impl.sdk.n.a()) {
            this.f9829c.k(this.f9828b, "No ads were returned from the server");
        }
        d7.a(this.f9466h.e(), this.f9466h.d(), this.f9465g, this.f9827a);
        failedToReceiveAdV2(AppLovinError.NO_FILL);
    }

    public v5(JSONObject jSONObject, q qVar, boolean z10, AppLovinAdLoadListener appLovinAdLoadListener, com.applovin.impl.sdk.j jVar) {
        super("TaskProcessAdResponse", jVar);
        if (jSONObject == null) {
            throw new IllegalArgumentException("No response specified");
        }
        if (qVar != null) {
            this.f9465g = jSONObject;
            this.f9466h = qVar;
            this.f9467i = appLovinAdLoadListener;
            this.f9468j = z10;
            return;
        }
        throw new IllegalArgumentException("No zone specified");
    }
}
