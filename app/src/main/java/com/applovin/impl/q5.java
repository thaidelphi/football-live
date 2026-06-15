package com.applovin.impl;

import com.applovin.impl.sdk.AppLovinError;
import com.applovin.impl.sdk.nativeAd.AppLovinNativeAdLoadListener;
import org.json.JSONObject;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public abstract class q5 extends i5 {

    /* renamed from: i  reason: collision with root package name */
    private final AppLovinNativeAdLoadListener f8466i;

    public q5(q qVar, String str, AppLovinNativeAdLoadListener appLovinNativeAdLoadListener, com.applovin.impl.sdk.j jVar) {
        super(qVar, str, jVar);
        this.f8466i = appLovinNativeAdLoadListener;
    }

    @Override // com.applovin.impl.i5
    protected z4 a(JSONObject jSONObject) {
        return new z5(jSONObject, this.f8466i, this.f9827a);
    }

    @Override // com.applovin.impl.i5
    protected String e() {
        return o0.d(this.f9827a);
    }

    @Override // com.applovin.impl.i5
    protected String f() {
        return o0.e(this.f9827a);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.applovin.impl.i5
    public void a(int i10, String str) {
        super.a(i10, str);
        this.f8466i.onNativeAdLoadFailed(new AppLovinError(i10, str));
    }
}
