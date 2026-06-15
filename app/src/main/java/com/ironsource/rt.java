package com.ironsource;

import com.ironsource.b9;
import org.json.JSONObject;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public class rt {

    /* renamed from: a  reason: collision with root package name */
    private final JSONObject f20022a;

    public rt(JSONObject jSONObject) {
        this.f20022a = jSONObject == null ? new JSONObject() : jSONObject;
    }

    public boolean a() {
        return this.f20022a.optBoolean("uxt", false);
    }

    public boolean b() {
        return this.f20022a.optBoolean(b9.a.f16544o, false);
    }

    public boolean c() {
        return this.f20022a.optBoolean(b9.a.f16545p, false);
    }

    public boolean d() {
        return this.f20022a.optBoolean(b9.a.f16541l, false);
    }

    public boolean e() {
        return this.f20022a.optBoolean(b9.a.f16543n, false);
    }
}
