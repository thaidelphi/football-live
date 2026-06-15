package com.appnext.core;

import com.ironsource.b9;
import org.json.JSONObject;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class f {
    private String cA;
    private String cB;
    private String cC;
    private String inn;
    private String title;
    private String token;

    public f(String str, String str2, String str3, String str4, String str5, String str6) {
        this.title = "";
        this.cA = "";
        this.cB = "";
        this.cC = "";
        this.inn = "";
        this.token = "";
        this.cA = str2;
        this.title = str;
        this.cB = str3;
        this.cC = str4;
        this.inn = str5;
        this.token = str6;
    }

    public final JSONObject T() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(b9.h.D0, this.title);
            jSONObject.put(b9.h.F0, this.cA);
            jSONObject.put("entity", this.cB);
            jSONObject.put("website", this.cC);
            jSONObject.put("inn", this.inn);
            jSONObject.put("token", this.token);
        } catch (Exception unused) {
        }
        return jSONObject;
    }
}
