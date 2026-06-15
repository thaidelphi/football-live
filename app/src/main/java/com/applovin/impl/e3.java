package com.applovin.impl;

import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.JsonUtils;
import java.util.HashSet;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public abstract class e3 extends o0 {

    /* renamed from: e  reason: collision with root package name */
    private static final String[] f6867e = {"ads", "settings", "auto_init_adapters", "test_mode_idfas", "test_mode_auto_init_adapters", "ad_unit_signal_providers"};

    /* renamed from: f  reason: collision with root package name */
    private static final String[] f6868f = {"ads", "settings", "signal_providers", "ad_unit_signal_providers"};

    public static String a(com.applovin.impl.sdk.j jVar) {
        return o0.a((String) jVar.a(j3.F6), "1.0/mediate", jVar);
    }

    public static String b(com.applovin.impl.sdk.j jVar) {
        return o0.a((String) jVar.a(j3.E6), "1.0/mediate", jVar);
    }

    public static void d(JSONObject jSONObject, com.applovin.impl.sdk.j jVar) {
        if (JsonUtils.valueExists(jSONObject, "ad_unit_signal_providers")) {
            g5.a(jSONObject, jVar);
        }
    }

    public static void e(JSONObject jSONObject, com.applovin.impl.sdk.j jVar) {
        if (jSONObject.length() == 0) {
            return;
        }
        if (!JsonUtils.valueExists(jSONObject, "auto_init_adapters") && !JsonUtils.valueExists(jSONObject, "test_mode_auto_init_adapters")) {
            jVar.c(q4.G);
            return;
        }
        JSONObject shallowCopy = JsonUtils.shallowCopy(jSONObject);
        JsonUtils.removeObjectsForKeys(shallowCopy, f6868f);
        jVar.b(q4.G, shallowCopy.toString());
    }

    public static void f(JSONObject jSONObject, com.applovin.impl.sdk.j jVar) {
        if (JsonUtils.valueExists(jSONObject, "signal_providers")) {
            JSONObject shallowCopy = JsonUtils.shallowCopy(jSONObject);
            JsonUtils.removeObjectsForKeys(shallowCopy, f6867e);
            jVar.b(q4.F, shallowCopy.toString());
            g5.a(shallowCopy);
        }
    }

    public static void g(JSONObject jSONObject, com.applovin.impl.sdk.j jVar) {
        if (JsonUtils.valueExists(jSONObject, "ad_unit_signal_providers") && JsonUtils.valueExists(jSONObject, "signal_providers")) {
            try {
                HashSet hashSet = new HashSet();
                JSONArray jSONArray = JsonUtils.getJSONArray(jSONObject, "signal_providers", null);
                for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                    hashSet.add(JsonUtils.getString(jSONArray.getJSONObject(i10), "name", null));
                }
                HashSet hashSet2 = new HashSet();
                JSONObject jSONObject2 = JsonUtils.getJSONObject(jSONObject, "ad_unit_signal_providers", (JSONObject) null);
                for (String str : JsonUtils.toList(jSONObject2.names())) {
                    hashSet2.addAll(JsonUtils.getList(jSONObject2, str, null));
                }
                if (hashSet.equals(hashSet2)) {
                    return;
                }
                Set differenceSet = CollectionUtils.getDifferenceSet(hashSet, hashSet2);
                com.applovin.impl.sdk.n.h("MediationConnectionUtils", "\"signal_providers\" contains extra network(s): " + differenceSet);
                Set differenceSet2 = CollectionUtils.getDifferenceSet(hashSet2, hashSet);
                com.applovin.impl.sdk.n.h("MediationConnectionUtils", "\"ad_unit_signal_providers\" contains extra network(s): " + differenceSet2);
                jVar.D().a(y1.f9693t0, "signalProvidersMismatch", CollectionUtils.hashMap("details", "extraSignalProviderNetworks=" + differenceSet + ",extraAdUnitSignalProviderNetworks=" + differenceSet2));
                f1.a("Networks within \"signal_providers\" and \"ad_unit_signal_providers\" do not match.", new Object[0]);
            } catch (JSONException e8) {
                com.applovin.impl.sdk.n.c("MediationConnectionUtils", "Failed to parse JSON", e8);
                jVar.D().a("MediationConnectionUtils", "verifyBidderNetworksMatchFromJson", e8);
                f1.a((Throwable) e8, "Failed to parse JSON in verifyBidderNetworksMatchFromJson", new Object[0]);
            }
        }
    }

    public static String h(com.applovin.impl.sdk.j jVar) {
        return o0.a((String) jVar.a(j3.F6), "1.0/mediate_debug", jVar);
    }

    public static String i(com.applovin.impl.sdk.j jVar) {
        return o0.a((String) jVar.a(j3.E6), "1.0/mediate_debug", jVar);
    }
}
