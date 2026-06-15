package com.applovin.impl;

import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.u5;
import com.applovin.sdk.AppLovinAdLoadListener;
import org.json.JSONObject;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class c6 extends z4 {

    /* renamed from: g  reason: collision with root package name */
    private final JSONObject f6755g;

    /* renamed from: h  reason: collision with root package name */
    private final JSONObject f6756h;

    /* renamed from: i  reason: collision with root package name */
    private final AppLovinAdLoadListener f6757i;

    public c6(JSONObject jSONObject, JSONObject jSONObject2, AppLovinAdLoadListener appLovinAdLoadListener, com.applovin.impl.sdk.j jVar) {
        super("TaskRenderAppLovinAd", jVar);
        this.f6755g = jSONObject;
        this.f6756h = jSONObject2;
        this.f6757i = appLovinAdLoadListener;
    }

    @Override // java.lang.Runnable
    public void run() {
        if (com.applovin.impl.sdk.n.a()) {
            this.f9829c.a(this.f9828b, "Rendering ad...");
        }
        com.applovin.impl.sdk.ad.a aVar = new com.applovin.impl.sdk.ad.a(this.f6755g, this.f6756h, this.f9827a);
        boolean booleanValue = JsonUtils.getBoolean(this.f6755g, "gs_load_immediately", Boolean.FALSE).booleanValue();
        boolean booleanValue2 = JsonUtils.getBoolean(this.f6755g, "vs_load_immediately", Boolean.TRUE).booleanValue();
        d5 d5Var = new d5(aVar, this.f9827a, this.f6757i);
        d5Var.c(booleanValue2);
        d5Var.b(booleanValue);
        this.f9827a.i0().a((z4) d5Var, u5.b.CACHING);
    }
}
