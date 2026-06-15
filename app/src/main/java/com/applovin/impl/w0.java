package com.applovin.impl;

import android.text.TextUtils;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.sdk.R;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public abstract class w0 {
    public static List a(com.applovin.impl.sdk.j jVar) {
        jVar.I();
        if (com.applovin.impl.sdk.n.a()) {
            jVar.I().a("ConsentFlowStateProvider", "Generating consent flow states...");
        }
        String a10 = d7.a(R.raw.applovin_consent_flow_unified_cmp, com.applovin.impl.sdk.j.m(), jVar);
        if (!TextUtils.isEmpty(a10)) {
            JSONObject jsonObjectFromJsonString = JsonUtils.jsonObjectFromJsonString(a10, null);
            if (jsonObjectFromJsonString != null) {
                JSONArray jSONArray = JsonUtils.getJSONArray(jsonObjectFromJsonString, "states", new JSONArray());
                ArrayList arrayList = new ArrayList();
                for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                    arrayList.add(r0.a(JsonUtils.getJSONObject(jSONArray, i10, new JSONObject()), jVar));
                }
                return arrayList;
            }
            throw new IllegalStateException("Unable to parse consent flow data! Please ensure that the AppLovin SDK resources are bundled correctly!");
        }
        throw new IllegalStateException("Unable to retrieve consent flow data! Please ensure that the AppLovin SDK resources are bundled correctly!");
    }
}
