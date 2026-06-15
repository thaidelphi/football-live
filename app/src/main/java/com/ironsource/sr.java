package com.ironsource;

import org.json.JSONObject;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class sr {

    /* renamed from: a  reason: collision with root package name */
    private final ls f20723a;

    /* renamed from: b  reason: collision with root package name */
    private final zp f20724b;

    /* renamed from: c  reason: collision with root package name */
    private final bq f20725c;

    /* renamed from: d  reason: collision with root package name */
    private final t8 f20726d;

    /* renamed from: e  reason: collision with root package name */
    private final mc f20727e;

    public sr(ls fullResponse) {
        kotlin.jvm.internal.n.f(fullResponse, "fullResponse");
        this.f20723a = fullResponse;
        JSONObject optJSONObject = fullResponse.i().optJSONObject(tr.f20857a);
        this.f20724b = new zp(optJSONObject == null ? new JSONObject() : optJSONObject);
        JSONObject optJSONObject2 = fullResponse.i().optJSONObject(tr.f20858b);
        this.f20725c = new bq(optJSONObject2 == null ? new JSONObject() : optJSONObject2);
        JSONObject optJSONObject3 = fullResponse.i().optJSONObject("configurations");
        this.f20726d = new t8(optJSONObject3 == null ? new JSONObject() : optJSONObject3);
        JSONObject optJSONObject4 = fullResponse.i().optJSONObject(tr.f20860d);
        this.f20727e = new mc(optJSONObject4 == null ? new JSONObject() : optJSONObject4);
    }

    public final t8 a() {
        return this.f20726d;
    }

    public final mc b() {
        return this.f20727e;
    }

    public final ls c() {
        return this.f20723a;
    }

    public final zp d() {
        return this.f20724b;
    }

    public final bq e() {
        return this.f20725c;
    }
}
