package com.applovin.impl;

import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.mediation.MaxAdFormat;
import com.ironsource.sp;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class y7 {

    /* renamed from: a  reason: collision with root package name */
    private final m2 f9777a;

    /* renamed from: b  reason: collision with root package name */
    private final s3 f9778b;

    /* renamed from: c  reason: collision with root package name */
    private final List f9779c;

    public y7(JSONObject jSONObject, MaxAdFormat maxAdFormat, y2 y2Var, com.applovin.impl.sdk.j jVar) {
        JSONObject jSONObject2 = JsonUtils.getJSONObject(jSONObject, "bidder_placement", (JSONObject) null);
        if (jSONObject2 != null) {
            this.f9778b = new s3(jSONObject2, jVar);
        } else {
            this.f9778b = null;
        }
        this.f9777a = new m2(JsonUtils.getString(jSONObject, "name", ""), JsonUtils.getString(jSONObject, "display_name", ""), jSONObject2 != null, y2Var);
        JSONArray jSONArray = JsonUtils.getJSONArray(jSONObject, sp.f20713c, new JSONArray());
        this.f9779c = new ArrayList(jSONArray.length());
        for (int i10 = 0; i10 < jSONArray.length(); i10++) {
            JSONObject jSONObject3 = JsonUtils.getJSONObject(jSONArray, i10, (JSONObject) null);
            if (jSONObject3 != null) {
                this.f9779c.add(new s3(jSONObject3, jVar));
            }
        }
    }

    public s3 a() {
        return this.f9778b;
    }

    public m2 b() {
        return this.f9777a;
    }

    public List c() {
        return this.f9779c;
    }

    public boolean d() {
        return this.f9778b != null;
    }
}
