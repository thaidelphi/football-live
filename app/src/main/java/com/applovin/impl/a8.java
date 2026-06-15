package com.applovin.impl;

import com.applovin.impl.sdk.utils.JsonUtils;
import com.appnext.banners.BannerAdRequest;
import java.util.List;
import org.json.JSONObject;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class a8 {

    /* renamed from: a  reason: collision with root package name */
    private final String f6521a;

    /* renamed from: b  reason: collision with root package name */
    private final String f6522b;

    /* renamed from: c  reason: collision with root package name */
    private final List f6523c;

    public a8(JSONObject jSONObject) {
        this.f6521a = JsonUtils.getString(jSONObject, "user_type", BannerAdRequest.TYPE_ALL);
        this.f6522b = JsonUtils.getString(jSONObject, "device_type", BannerAdRequest.TYPE_ALL);
        this.f6523c = JsonUtils.getStringList(jSONObject, "segments", null);
    }

    public String a() {
        return this.f6521a;
    }

    public String b() {
        return this.f6522b;
    }

    public List c() {
        return this.f6523c;
    }
}
