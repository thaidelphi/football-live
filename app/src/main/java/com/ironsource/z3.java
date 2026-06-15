package com.ironsource;

import org.json.JSONObject;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class z3 {

    /* renamed from: a  reason: collision with root package name */
    private final gm f21623a;

    /* renamed from: b  reason: collision with root package name */
    private final boolean f21624b;

    /* renamed from: c  reason: collision with root package name */
    private final d4 f21625c;

    /* renamed from: d  reason: collision with root package name */
    private final k4 f21626d;

    /* renamed from: e  reason: collision with root package name */
    private final x3 f21627e;

    public z3(JSONObject applicationConfigurations) {
        kotlin.jvm.internal.n.f(applicationConfigurations, "applicationConfigurations");
        JSONObject optJSONObject = applicationConfigurations.optJSONObject(b4.f16493a);
        this.f21623a = new gm(optJSONObject == null ? new JSONObject() : optJSONObject);
        this.f21624b = applicationConfigurations.optBoolean(b4.f16499g, false);
        JSONObject optJSONObject2 = applicationConfigurations.optJSONObject(b4.f16500h);
        this.f21625c = new d4(optJSONObject2 == null ? new JSONObject() : optJSONObject2);
        JSONObject optJSONObject3 = applicationConfigurations.optJSONObject("settings");
        this.f21626d = new k4(optJSONObject3 == null ? new JSONObject() : optJSONObject3);
        JSONObject optJSONObject4 = applicationConfigurations.optJSONObject(b4.f16498f);
        this.f21627e = new x3(optJSONObject4 == null ? new JSONObject() : optJSONObject4);
    }

    public final x3 a() {
        return this.f21627e;
    }

    public final d4 b() {
        return this.f21625c;
    }

    public final k4 c() {
        return this.f21626d;
    }

    public final boolean d() {
        return this.f21624b;
    }

    public final gm e() {
        return this.f21623a;
    }
}
