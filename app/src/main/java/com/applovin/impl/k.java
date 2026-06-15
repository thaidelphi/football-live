package com.applovin.impl;

import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.mediation.MaxAdFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class k {

    /* renamed from: a  reason: collision with root package name */
    private final String f7373a;

    /* renamed from: b  reason: collision with root package name */
    private final String f7374b;

    /* renamed from: c  reason: collision with root package name */
    private final a8 f7375c;

    /* renamed from: d  reason: collision with root package name */
    private final List f7376d;

    /* renamed from: e  reason: collision with root package name */
    private final List f7377e;

    /* renamed from: f  reason: collision with root package name */
    private boolean f7378f = false;

    /* JADX INFO: Access modifiers changed from: package-private */
    public k(JSONObject jSONObject, Map map, MaxAdFormat maxAdFormat, com.applovin.impl.sdk.j jVar) {
        this.f7373a = JsonUtils.getString(jSONObject, "name", "");
        this.f7374b = JsonUtils.getString(jSONObject, "experiment", null);
        this.f7375c = a(jSONObject);
        this.f7376d = a("bidders", jSONObject, map, maxAdFormat, jVar);
        this.f7377e = a(com.ironsource.mediationsdk.d.f18562h, jSONObject, map, maxAdFormat, jVar);
    }

    public List a() {
        return this.f7376d;
    }

    public String b() {
        return this.f7374b;
    }

    public String c() {
        return this.f7373a;
    }

    public a8 d() {
        return this.f7375c;
    }

    public List e() {
        return this.f7377e;
    }

    public boolean f() {
        return this.f7378f;
    }

    private a8 a(JSONObject jSONObject) {
        return new a8(JsonUtils.getJSONObject(jSONObject, "targeting"));
    }

    private List a(String str, JSONObject jSONObject, Map map, MaxAdFormat maxAdFormat, com.applovin.impl.sdk.j jVar) {
        y2 y2Var;
        ArrayList arrayList = new ArrayList();
        JSONArray jSONArray = JsonUtils.getJSONArray(jSONObject, str, new JSONArray());
        for (int i10 = 0; i10 < jSONArray.length(); i10++) {
            JSONObject jSONObject2 = JsonUtils.getJSONObject(jSONArray, i10, (JSONObject) null);
            if (jSONObject2 != null && (y2Var = (y2) map.get(JsonUtils.getString(jSONObject2, "adapter_class", ""))) != null) {
                if (y2Var.D()) {
                    this.f7378f = true;
                }
                arrayList.add(new y7(jSONObject2, maxAdFormat, y2Var, jVar));
            }
        }
        return arrayList;
    }
}
