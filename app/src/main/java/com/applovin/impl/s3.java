package com.applovin.impl;

import com.applovin.impl.sdk.utils.JsonUtils;
import com.ironsource.ug;
import org.json.JSONObject;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class s3 {

    /* renamed from: a  reason: collision with root package name */
    private final String f8589a;

    /* renamed from: b  reason: collision with root package name */
    private final String f8590b;

    public s3(JSONObject jSONObject, com.applovin.impl.sdk.j jVar) {
        this.f8589a = JsonUtils.getString(jSONObject, ug.f21009x, "");
        this.f8590b = JsonUtils.getString(jSONObject, "price", null);
    }

    public String a() {
        return this.f8589a;
    }

    public String b() {
        return this.f8590b;
    }
}
