package com.applovin.impl;

import com.applovin.sdk.AppLovinAdLoadListener;
import java.util.HashMap;
import java.util.Map;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class r5 extends p5 {

    /* renamed from: j  reason: collision with root package name */
    private final g f8545j;

    public r5(g gVar, AppLovinAdLoadListener appLovinAdLoadListener, com.applovin.impl.sdk.j jVar) {
        super(q.a("adtoken_zone"), appLovinAdLoadListener, "TaskFetchTokenAd", jVar);
        this.f8545j = gVar;
    }

    @Override // com.applovin.impl.i5
    protected Map h() {
        HashMap hashMap = new HashMap(2);
        hashMap.put("adtoken", this.f8545j.b());
        hashMap.put("adtoken_prefix", this.f8545j.d());
        return hashMap;
    }
}
