package com.ironsource;

import com.ironsource.b9;
import com.ironsource.mediationsdk.logger.IronLog;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public class sk {

    /* renamed from: a  reason: collision with root package name */
    private String f20702a;

    /* renamed from: b  reason: collision with root package name */
    private JSONObject f20703b;

    /* renamed from: c  reason: collision with root package name */
    private String f20704c;

    /* renamed from: d  reason: collision with root package name */
    private String f20705d;

    public sk(JSONObject jSONObject) {
        this.f20702a = jSONObject.optString(b9.f.f16603b);
        this.f20703b = jSONObject.optJSONObject(b9.f.f16604c);
        this.f20704c = jSONObject.optString("success");
        this.f20705d = jSONObject.optString(b9.f.f16606e);
    }

    public String a() {
        return this.f20705d;
    }

    public String b() {
        return this.f20702a;
    }

    public JSONObject c() {
        return this.f20703b;
    }

    public String d() {
        return this.f20704c;
    }

    public JSONObject e() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(b9.f.f16603b, this.f20702a);
            jSONObject.put(b9.f.f16604c, this.f20703b);
            jSONObject.put("success", this.f20704c);
            jSONObject.put(b9.f.f16606e, this.f20705d);
        } catch (JSONException e8) {
            o9.d().a(e8);
            IronLog.INTERNAL.error(e8.toString());
        }
        return jSONObject;
    }
}
