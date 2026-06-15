package com.ironsource;

import org.json.JSONObject;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class mc {

    /* renamed from: a  reason: collision with root package name */
    private final JSONObject f18472a;

    public mc(JSONObject jSONObject) {
        this.f18472a = jSONObject;
    }

    public final Boolean a(String key) {
        kotlin.jvm.internal.n.f(key, "key");
        JSONObject jSONObject = this.f18472a;
        Object opt = jSONObject != null ? jSONObject.opt(key) : null;
        if (opt instanceof Boolean) {
            return (Boolean) opt;
        }
        return null;
    }

    public final Integer b(String key) {
        kotlin.jvm.internal.n.f(key, "key");
        JSONObject jSONObject = this.f18472a;
        Object opt = jSONObject != null ? jSONObject.opt(key) : null;
        if (opt instanceof Integer) {
            return (Integer) opt;
        }
        return null;
    }

    public final String c(String key) {
        kotlin.jvm.internal.n.f(key, "key");
        JSONObject jSONObject = this.f18472a;
        Object opt = jSONObject != null ? jSONObject.opt(key) : null;
        if (opt instanceof String) {
            return (String) opt;
        }
        return null;
    }
}
