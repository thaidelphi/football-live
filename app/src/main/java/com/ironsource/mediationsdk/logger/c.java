package com.ironsource.mediationsdk.logger;

import com.applovin.sdk.AppLovinEventTypes;
import com.ironsource.da;
import com.ironsource.mediationsdk.logger.IronSourceLogger;
import com.ironsource.o9;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
class c {

    /* renamed from: a  reason: collision with root package name */
    private IronSourceLogger.IronSourceTag f18906a;

    /* renamed from: b  reason: collision with root package name */
    private String f18907b;

    /* renamed from: c  reason: collision with root package name */
    private String f18908c;

    /* renamed from: d  reason: collision with root package name */
    private int f18909d;

    public c(IronSourceLogger.IronSourceTag ironSourceTag, String str, String str2, int i10) {
        this.f18906a = ironSourceTag;
        this.f18907b = str;
        this.f18908c = str2;
        this.f18909d = i10;
    }

    public int a() {
        return this.f18909d;
    }

    public JSONObject b() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(da.a.f16995d, this.f18907b);
            jSONObject.put("tag", this.f18906a);
            jSONObject.put(AppLovinEventTypes.USER_COMPLETED_LEVEL, this.f18909d);
            jSONObject.put("message", this.f18908c);
        } catch (JSONException e8) {
            o9.d().a(e8);
            IronLog.INTERNAL.error(e8.toString());
        }
        return jSONObject;
    }
}
