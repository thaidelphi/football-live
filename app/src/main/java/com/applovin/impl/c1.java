package com.applovin.impl;

import com.applovin.impl.sdk.utils.JsonUtils;
import org.json.JSONObject;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class c1 {

    /* renamed from: a  reason: collision with root package name */
    private final JSONObject f6732a;

    public c1(JSONObject jSONObject) {
        this.f6732a = jSONObject;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public Integer a() {
        return JsonUtils.getInteger(this.f6732a, "dark_mode_toolbar_color", null);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public String b() {
        return JsonUtils.getString(this.f6732a, "digital_asset_link_url", null);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public Boolean c() {
        return JsonUtils.getBoolean(this.f6732a, "instant_apps_enabled", null);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public String d() {
        return JsonUtils.getString(this.f6732a, "referrer", null);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public Integer e() {
        return JsonUtils.getInteger(this.f6732a, "session_url_relation", null);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public Integer f() {
        return JsonUtils.getInteger(this.f6732a, "share_state", null);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public Boolean g() {
        return JsonUtils.getBoolean(this.f6732a, "should_show_title", null);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public Integer h() {
        return JsonUtils.getInteger(this.f6732a, "toolbar_color", null);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public Boolean i() {
        return JsonUtils.getBoolean(this.f6732a, "url_bar_hiding_enabled", null);
    }
}
