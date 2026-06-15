package com.applovin.impl;

import com.applovin.impl.sdk.nativeAd.AppLovinNativeAdLoadListener;
import java.util.HashMap;
import java.util.Map;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class o5 extends q5 {

    /* renamed from: j  reason: collision with root package name */
    private final g f8276j;

    public o5(g gVar, AppLovinNativeAdLoadListener appLovinNativeAdLoadListener, com.applovin.impl.sdk.j jVar) {
        super(q.a("adtoken_zone"), "TaskFetchNativeTokenAd", appLovinNativeAdLoadListener, jVar);
        this.f8276j = gVar;
    }

    @Override // com.applovin.impl.i5
    protected Map h() {
        HashMap hashMap = new HashMap(2);
        hashMap.put("adtoken", this.f8276j.b());
        hashMap.put("adtoken_prefix", this.f8276j.d());
        return hashMap;
    }
}
