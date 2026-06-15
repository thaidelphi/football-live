package com.applovin.impl;

import com.applovin.impl.sdk.utils.JsonUtils;
import com.appnext.ads.fullscreen.RewardedVideo;
import com.ironsource.b9;
import org.json.JSONObject;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class t0 {

    /* renamed from: a  reason: collision with root package name */
    private final JSONObject f9212a;

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public enum a {
        NEUTRAL,
        POSITIVE,
        NEGATIVE
    }

    private t0(JSONObject jSONObject) {
        this.f9212a = jSONObject;
    }

    public static t0 a(JSONObject jSONObject, com.applovin.impl.sdk.j jVar) {
        String string = JsonUtils.getString(JsonUtils.getJSONObject(jSONObject, b9.h.D0, (JSONObject) null), b9.h.W, null);
        if ("TOS".equalsIgnoreCase(string) && jVar.u().h() == null) {
            return null;
        }
        if ("PP".equalsIgnoreCase(string) && jVar.u().f() == null) {
            return null;
        }
        return new t0(jSONObject);
    }

    public String b() {
        return JsonUtils.getString(this.f9212a, "event", null);
    }

    public a c() {
        String string = JsonUtils.getString(this.f9212a, "style", null);
        if (RewardedVideo.VIDEO_MODE_DEFAULT.equalsIgnoreCase(string)) {
            return a.POSITIVE;
        }
        if (!"destructive".equalsIgnoreCase(string) && !"cancel".equalsIgnoreCase(string)) {
            return a.NEUTRAL;
        }
        return a.NEGATIVE;
    }

    public String d() {
        JSONObject jSONObject = JsonUtils.getJSONObject(this.f9212a, b9.h.D0, (JSONObject) null);
        return com.applovin.impl.sdk.j.a(JsonUtils.getString(jSONObject, b9.h.W, ""), JsonUtils.optList(JsonUtils.getJSONArray(jSONObject, "replacements", null), null));
    }

    public String toString() {
        return "ConsentFlowStateAlertAction{title=" + d() + ", destinationStateId=" + a() + ", event=" + b() + "}";
    }

    public int a() {
        return JsonUtils.getInt(this.f9212a, "destination_state_id", -1);
    }
}
