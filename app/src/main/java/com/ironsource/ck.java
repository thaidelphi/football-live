package com.ironsource;

import com.ironsource.eh;
import java.util.UUID;
import org.json.JSONObject;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public class ck {

    /* renamed from: a  reason: collision with root package name */
    static String f16889a = "ManRewInst_";

    public static String a() {
        return String.valueOf(System.currentTimeMillis());
    }

    public static String a(rj rjVar) {
        return (rjVar.i() ? eh.e.Banner : rjVar.n() ? eh.e.RewardedVideo : eh.e.Interstitial).toString();
    }

    public static String a(JSONObject jSONObject) {
        if (jSONObject.optBoolean("rewarded")) {
            return f16889a + jSONObject.optString("name");
        }
        return jSONObject.optString("name");
    }

    public static String b() {
        return UUID.randomUUID().toString();
    }
}
