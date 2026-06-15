package com.applovin.impl;

import com.applovin.impl.sdk.utils.JsonUtils;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class g7 implements g4 {

    /* renamed from: a  reason: collision with root package name */
    private final List f7043a;

    private g7(List list) {
        this.f7043a = list;
    }

    public static g7 a(f8 f8Var, g7 g7Var, i7 i7Var, com.applovin.impl.sdk.j jVar) {
        try {
            List b10 = g7Var != null ? g7Var.b() : new ArrayList();
            for (f8 f8Var2 : f8Var.a("Verification")) {
                f7 a10 = f7.a(f8Var2, i7Var, jVar);
                if (a10 != null) {
                    b10.add(a10);
                }
            }
            return new g7(b10);
        } catch (Throwable th) {
            jVar.I();
            if (com.applovin.impl.sdk.n.a()) {
                jVar.I().a("VastAdVerifications", "Error occurred while initializing", th);
            }
            jVar.D().a("VastAdVerifications", th);
            return null;
        }
    }

    public List b() {
        return this.f7043a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof g7) {
            return this.f7043a.equals(((g7) obj).f7043a);
        }
        return false;
    }

    public int hashCode() {
        return this.f7043a.hashCode();
    }

    public String toString() {
        return "VastAdVerification{verifications='" + this.f7043a + "'}";
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static g7 a(JSONObject jSONObject, com.applovin.impl.sdk.j jVar) {
        if (jSONObject == null) {
            return null;
        }
        JSONArray jSONArray = JsonUtils.getJSONArray(jSONObject, "verifications", new JSONArray());
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < jSONArray.length(); i10++) {
            f7 a10 = f7.a(JsonUtils.getJSONObject(jSONArray, i10, (JSONObject) null), jVar);
            if (a10 != null) {
                arrayList.add(a10);
            }
        }
        return new g7(arrayList);
    }

    @Override // com.applovin.impl.g4
    public JSONObject a() {
        JSONObject jSONObject = new JSONObject();
        if (this.f7043a != null) {
            JSONArray jSONArray = new JSONArray();
            for (f7 f7Var : this.f7043a) {
                jSONArray.put(f7Var.a());
            }
            JsonUtils.putJsonArray(jSONObject, "verifications", jSONArray);
        }
        return jSONObject;
    }
}
