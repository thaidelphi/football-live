package com.ironsource;

import org.json.JSONObject;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class gq {

    /* renamed from: a  reason: collision with root package name */
    private final String f17609a;

    /* renamed from: b  reason: collision with root package name */
    private final Integer f17610b;

    public gq(JSONObject features, String nameKey, String amountKey) {
        kotlin.jvm.internal.n.f(features, "features");
        kotlin.jvm.internal.n.f(nameKey, "nameKey");
        kotlin.jvm.internal.n.f(amountKey, "amountKey");
        this.f17609a = features.has(nameKey) ? features.getString(nameKey) : null;
        this.f17610b = features.has(amountKey) ? Integer.valueOf(features.getInt(amountKey)) : null;
    }

    public final Integer a() {
        return this.f17610b;
    }

    public final String b() {
        return this.f17609a;
    }
}
