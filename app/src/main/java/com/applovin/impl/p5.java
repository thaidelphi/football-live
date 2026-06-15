package com.applovin.impl;

import com.applovin.impl.sdk.AppLovinError;
import com.applovin.sdk.AppLovinAdLoadListener;
import org.json.JSONObject;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class p5 extends i5 {

    /* renamed from: i  reason: collision with root package name */
    private final AppLovinAdLoadListener f8363i;

    public p5(q qVar, AppLovinAdLoadListener appLovinAdLoadListener, com.applovin.impl.sdk.j jVar) {
        this(qVar, appLovinAdLoadListener, "TaskFetchNextAd", jVar);
    }

    @Override // com.applovin.impl.i5
    protected z4 a(JSONObject jSONObject) {
        return new v5(jSONObject, this.f7227g, this.f8363i, this.f9827a);
    }

    @Override // com.applovin.impl.i5
    protected String e() {
        return o0.a(this.f9827a);
    }

    @Override // com.applovin.impl.i5
    protected String f() {
        return o0.b(this.f9827a);
    }

    public p5(q qVar, AppLovinAdLoadListener appLovinAdLoadListener, String str, com.applovin.impl.sdk.j jVar) {
        super(qVar, str, jVar);
        this.f8363i = appLovinAdLoadListener;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.applovin.impl.i5
    public void a(int i10, String str) {
        super.a(i10, str);
        AppLovinAdLoadListener appLovinAdLoadListener = this.f8363i;
        if (appLovinAdLoadListener instanceof g2) {
            ((g2) this.f8363i).failedToReceiveAdV2(new AppLovinError(i10, str));
            return;
        }
        appLovinAdLoadListener.failedToReceiveAd(i10);
    }
}
