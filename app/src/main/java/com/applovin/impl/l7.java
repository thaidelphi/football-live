package com.applovin.impl;

import com.applovin.impl.sdk.utils.JsonUtils;
import org.json.JSONObject;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class l7 implements g4 {

    /* renamed from: a  reason: collision with root package name */
    private final String f7463a;

    /* renamed from: b  reason: collision with root package name */
    private final String f7464b;

    private l7(String str, String str2) {
        this.f7463a = str;
        this.f7464b = str2;
    }

    public static l7 a(f8 f8Var, com.applovin.impl.sdk.j jVar) {
        if (f8Var != null) {
            if (jVar != null) {
                try {
                    return new l7((String) f8Var.a().get("apiFramework"), f8Var.d());
                } catch (Throwable th) {
                    jVar.I();
                    if (com.applovin.impl.sdk.n.a()) {
                        jVar.I().a("VastJavaScriptResource", "Error occurred while initializing", th);
                    }
                    jVar.D().a("VastJavaScriptResource", th);
                    return null;
                }
            }
            throw new IllegalArgumentException("No sdk specified.");
        }
        throw new IllegalArgumentException("No node specified.");
    }

    public String b() {
        return this.f7463a;
    }

    public String c() {
        return this.f7464b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        l7 l7Var = (l7) obj;
        String str = this.f7463a;
        if (str == null ? l7Var.f7463a == null : str.equals(l7Var.f7463a)) {
            String str2 = this.f7464b;
            String str3 = l7Var.f7464b;
            return str2 != null ? str2.equals(str3) : str3 == null;
        }
        return false;
    }

    public int hashCode() {
        String str = this.f7463a;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f7464b;
        return hashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        return "VastJavaScriptResource{apiFramework='" + this.f7463a + "', javascriptResourceUrl='" + this.f7464b + "'}";
    }

    public static l7 a(JSONObject jSONObject, com.applovin.impl.sdk.j jVar) {
        if (jSONObject == null) {
            return null;
        }
        return new l7(JsonUtils.getString(jSONObject, "api_framework", null), JsonUtils.getString(jSONObject, "javascript_resource_url", null));
    }

    @Override // com.applovin.impl.g4
    public JSONObject a() {
        JSONObject jSONObject = new JSONObject();
        JsonUtils.putString(jSONObject, "api_framework", this.f7463a);
        JsonUtils.putString(jSONObject, "javascript_resource_url", this.f7464b);
        return jSONObject;
    }
}
