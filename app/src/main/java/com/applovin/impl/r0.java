package com.applovin.impl;

import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.ironsource.b9;
import com.ironsource.ug;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONObject;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class r0 {

    /* renamed from: a  reason: collision with root package name */
    protected final com.applovin.impl.sdk.j f8523a;

    /* renamed from: b  reason: collision with root package name */
    protected final JSONObject f8524b;

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public enum a {
        NONE(0),
        IS_AL_GDPR(1000),
        IS_ELIGIBLE_FOR_TERMS_AND_PRIVACY_POLICY_ALERT(1001),
        HAS_TERMS_OF_SERVICE_URI(1002);
        

        /* renamed from: a  reason: collision with root package name */
        private final int f8530a;

        a(int i10) {
            this.f8530a = i10;
        }

        public int b() {
            return this.f8530a;
        }
    }

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public enum b {
        ALERT,
        POST_ALERT,
        EVENT,
        REINIT,
        CMP_LOAD,
        CMP_SHOW,
        DECISION
    }

    public r0(JSONObject jSONObject, com.applovin.impl.sdk.j jVar) {
        this.f8523a = jVar;
        this.f8524b = jSONObject;
    }

    public static r0 a(JSONObject jSONObject, com.applovin.impl.sdk.j jVar) {
        b c10 = c(JsonUtils.getString(jSONObject, "type", null));
        if (c10 == b.ALERT) {
            return new s0(jSONObject, jVar);
        }
        if (c10 == b.EVENT) {
            return new u0(jSONObject, jVar);
        }
        return new r0(jSONObject, jVar);
    }

    public int b() {
        return JsonUtils.getInt(this.f8524b, ug.f21009x, -1);
    }

    public b c() {
        return c(JsonUtils.getString(this.f8524b, "type", null));
    }

    public String toString() {
        return "ConsentFlowState{id=" + b() + ", type=" + c() + "}";
    }

    private static b c(String str) {
        if ("alert".equalsIgnoreCase(str)) {
            return b.ALERT;
        }
        if ("post_alert".equalsIgnoreCase(str)) {
            return b.POST_ALERT;
        }
        if ("event".equalsIgnoreCase(str)) {
            return b.EVENT;
        }
        if ("cmp_load".equalsIgnoreCase(str)) {
            return b.CMP_LOAD;
        }
        if ("cmp_show".equalsIgnoreCase(str)) {
            return b.CMP_SHOW;
        }
        if ("decision".equalsIgnoreCase(str)) {
            return b.DECISION;
        }
        if ("reinit".equalsIgnoreCase(str)) {
            return b.REINIT;
        }
        throw new IllegalArgumentException("Invalid type provided: " + str);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public String b(String str) {
        JSONObject jSONObject = JsonUtils.getJSONObject(this.f8524b, str, (JSONObject) null);
        JSONArray jSONArray = JsonUtils.getJSONArray(jSONObject, "replacements", new JSONArray());
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < jSONArray.length(); i10++) {
            String obj = JsonUtils.getObjectAtIndex(jSONArray, i10, "").toString();
            if ("<APP_NAME>".equalsIgnoreCase(obj)) {
                String str2 = (String) this.f8523a.x().G().get("app_name");
                if (StringUtils.isValidString(str2)) {
                    arrayList.add(str2);
                } else {
                    arrayList.add(com.applovin.impl.sdk.j.a("THIS_APP"));
                }
            } else {
                arrayList.add(obj);
            }
        }
        return com.applovin.impl.sdk.j.a(JsonUtils.getString(jSONObject, b9.h.W, null), arrayList);
    }

    public a a() {
        return a(JsonUtils.getString(this.f8524b, "decision_type", null));
    }

    public int a(Boolean bool) {
        int i10 = JsonUtils.getInt(this.f8524b, "destination_state_id", -1);
        if (i10 > 0) {
            return i10;
        }
        if (bool != null) {
            return bool.booleanValue() ? JsonUtils.getInt(this.f8524b, "destination_state_id_true", -1) : JsonUtils.getInt(this.f8524b, "destination_state_id_false", -1);
        }
        throw new IllegalStateException("Decision needed for state: " + i10);
    }

    private static a a(String str) {
        if ("is_al_gdpr".equalsIgnoreCase(str)) {
            return a.IS_AL_GDPR;
        }
        if ("is_eligible_for_terms_and_privacy_policy_alert".equalsIgnoreCase(str)) {
            return a.IS_ELIGIBLE_FOR_TERMS_AND_PRIVACY_POLICY_ALERT;
        }
        if ("has_terms_of_service_uri".equalsIgnoreCase(str)) {
            return a.HAS_TERMS_OF_SERVICE_URI;
        }
        return a.NONE;
    }
}
