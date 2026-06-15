package com.applovin.impl;

import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import org.json.JSONObject;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class n7 implements g4 {

    /* renamed from: a  reason: collision with root package name */
    private String f8022a;

    /* renamed from: b  reason: collision with root package name */
    private String f8023b;

    private n7() {
    }

    public static n7 a(f8 f8Var, n7 n7Var, com.applovin.impl.sdk.j jVar) {
        if (f8Var != null) {
            if (jVar != null) {
                if (n7Var == null) {
                    try {
                        n7Var = new n7();
                    } catch (Throwable th) {
                        jVar.I();
                        if (com.applovin.impl.sdk.n.a()) {
                            jVar.I().a("VastSystemInfo", "Error occurred while initializing", th);
                        }
                        jVar.D().a("VastSystemInfo", th);
                        return null;
                    }
                }
                if (!StringUtils.isValidString(n7Var.f8022a)) {
                    String d10 = f8Var.d();
                    if (StringUtils.isValidString(d10)) {
                        n7Var.f8022a = d10;
                    }
                }
                if (!StringUtils.isValidString(n7Var.f8023b)) {
                    String str = (String) f8Var.a().get("version");
                    if (StringUtils.isValidString(str)) {
                        n7Var.f8023b = str;
                    }
                }
                return n7Var;
            }
            throw new IllegalArgumentException("No sdk specified.");
        }
        throw new IllegalArgumentException("No node specified.");
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof n7) {
            n7 n7Var = (n7) obj;
            String str = this.f8022a;
            if (str == null ? n7Var.f8022a == null : str.equals(n7Var.f8022a)) {
                String str2 = this.f8023b;
                String str3 = n7Var.f8023b;
                return str2 != null ? str2.equals(str3) : str3 == null;
            }
            return false;
        }
        return false;
    }

    public int hashCode() {
        String str = this.f8022a;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f8023b;
        return hashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        return "VastSystemInfo{name='" + this.f8022a + "', version='" + this.f8023b + "'}";
    }

    public static n7 a(JSONObject jSONObject, com.applovin.impl.sdk.j jVar) {
        if (jSONObject == null) {
            return null;
        }
        n7 n7Var = new n7();
        n7Var.f8022a = JsonUtils.getString(jSONObject, "name", null);
        n7Var.f8023b = JsonUtils.getString(jSONObject, "version", null);
        return n7Var;
    }

    @Override // com.applovin.impl.g4
    public JSONObject a() {
        JSONObject jSONObject = new JSONObject();
        JsonUtils.putString(jSONObject, "name", this.f8022a);
        JsonUtils.putString(jSONObject, "version", this.f8023b);
        return jSONObject;
    }
}
