package com.ironsource;

import org.json.JSONObject;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class h8 {

    /* renamed from: a  reason: collision with root package name */
    private final Boolean f17659a;

    /* renamed from: b  reason: collision with root package name */
    private final Integer f17660b;

    /* renamed from: c  reason: collision with root package name */
    private final m8 f17661c;

    public h8(JSONObject features) {
        kotlin.jvm.internal.n.f(features, "features");
        this.f17659a = features.has("enabled") ? Boolean.valueOf(features.getBoolean("enabled")) : null;
        this.f17660b = features.has("maxImpressions") ? Integer.valueOf(features.getInt("maxImpressions")) : null;
        this.f17661c = features.has("unit") ? m8.f18453c.a(features.optString("unit")) : null;
    }

    public final Boolean a() {
        return this.f17659a;
    }

    public final Integer b() {
        return this.f17660b;
    }

    public final m8 c() {
        return this.f17661c;
    }
}
