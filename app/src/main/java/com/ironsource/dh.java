package com.ironsource;

import com.ironsource.b9;
import com.ironsource.ch;
import org.json.JSONObject;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class dh implements ch, ch.a {

    /* renamed from: a  reason: collision with root package name */
    private JSONObject f17043a = new JSONObject();

    /* renamed from: b  reason: collision with root package name */
    private JSONObject f17044b = new JSONObject();

    /* renamed from: c  reason: collision with root package name */
    private JSONObject f17045c = new JSONObject();

    private final Object e(String str) {
        JSONObject jSONObject;
        if (this.f17045c.has(str)) {
            jSONObject = this.f17045c;
        } else if (this.f17044b.has(str)) {
            jSONObject = this.f17044b;
        } else if (!this.f17043a.has(str)) {
            return null;
        } else {
            jSONObject = this.f17043a;
        }
        return jSONObject.get(str);
    }

    @Override // com.ironsource.ch
    public JSONObject a(String configKey) {
        kotlin.jvm.internal.n.f(configKey, "configKey");
        Object e8 = e(configKey);
        if (e8 instanceof JSONObject) {
            return (JSONObject) e8;
        }
        return null;
    }

    @Override // com.ironsource.ch.a
    public void a(JSONObject controllerConfig) {
        kotlin.jvm.internal.n.f(controllerConfig, "controllerConfig");
        this.f17043a = controllerConfig;
        JSONObject optJSONObject = controllerConfig.optJSONObject(b9.a.f16531b);
        if (optJSONObject == null) {
            optJSONObject = new JSONObject();
        }
        this.f17044b = optJSONObject;
        JSONObject optJSONObject2 = this.f17043a.optJSONObject(b9.a.f16532c);
        if (optJSONObject2 == null) {
            optJSONObject2 = new JSONObject();
        }
        this.f17045c = optJSONObject2;
    }

    @Override // com.ironsource.ch
    public Integer b(String configKey) {
        kotlin.jvm.internal.n.f(configKey, "configKey");
        Object e8 = e(configKey);
        if (e8 instanceof Integer) {
            return (Integer) e8;
        }
        return null;
    }

    @Override // com.ironsource.ch
    public Boolean c(String configKey) {
        kotlin.jvm.internal.n.f(configKey, "configKey");
        Object e8 = e(configKey);
        if (e8 instanceof Boolean) {
            return (Boolean) e8;
        }
        return null;
    }

    @Override // com.ironsource.ch
    public String d(String configKey) {
        kotlin.jvm.internal.n.f(configKey, "configKey");
        Object e8 = e(configKey);
        if (e8 instanceof String) {
            return (String) e8;
        }
        return null;
    }
}
