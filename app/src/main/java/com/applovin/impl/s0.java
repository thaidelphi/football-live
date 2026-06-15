package com.applovin.impl;

import com.applovin.impl.sdk.utils.JsonUtils;
import com.ironsource.b9;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class s0 extends r0 {
    public s0(JSONObject jSONObject, com.applovin.impl.sdk.j jVar) {
        super(jSONObject, jVar);
    }

    public List d() {
        t0 a10;
        JSONArray jSONArray = JsonUtils.getJSONArray(this.f8524b, "transitions", null);
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < jSONArray.length(); i10++) {
            JSONObject jSONObject = JsonUtils.getJSONObject(jSONArray, i10, (JSONObject) null);
            if (jSONObject != null && (a10 = t0.a(jSONObject, this.f8523a)) != null) {
                arrayList.add(a10);
            }
        }
        return arrayList;
    }

    public String e() {
        return b("message");
    }

    public String f() {
        return b(b9.h.D0);
    }

    @Override // com.applovin.impl.r0
    public String toString() {
        return "ConsentFlowState{id=" + b() + ", type=" + c() + ", title=" + f() + ", message=" + e() + ", actions=" + d() + "}";
    }
}
