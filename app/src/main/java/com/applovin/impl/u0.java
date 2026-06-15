package com.applovin.impl;

import com.applovin.impl.sdk.utils.JsonUtils;
import java.util.Map;
import org.json.JSONObject;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class u0 extends r0 {

    /* renamed from: c  reason: collision with root package name */
    private Map f9318c;

    public u0(JSONObject jSONObject, com.applovin.impl.sdk.j jVar) {
        super(jSONObject, jVar);
    }

    public Map d() {
        return this.f9318c;
    }

    public String e() {
        return JsonUtils.getString(this.f8524b, "name", null);
    }

    @Override // com.applovin.impl.r0
    public String toString() {
        return "ConsentFlowState{id=" + b() + ", type=" + c() + ", name=" + e() + "}";
    }
}
