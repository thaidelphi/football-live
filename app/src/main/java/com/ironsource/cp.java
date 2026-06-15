package com.ironsource;

import org.json.JSONObject;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class cp {

    /* renamed from: a  reason: collision with root package name */
    private final Boolean f16895a;

    /* renamed from: b  reason: collision with root package name */
    private final Integer f16896b;

    /* renamed from: c  reason: collision with root package name */
    private final m8 f16897c;

    public cp(JSONObject features) {
        kotlin.jvm.internal.n.f(features, "features");
        this.f16895a = features.has("enabled") ? Boolean.valueOf(features.getBoolean("enabled")) : null;
        this.f16896b = features.has("numOfSeconds") ? Integer.valueOf(features.getInt("numOfSeconds")) : null;
        this.f16897c = m8.Second;
    }

    public final Boolean a() {
        return this.f16895a;
    }

    public final Integer b() {
        return this.f16896b;
    }

    public final m8 c() {
        return this.f16897c;
    }
}
