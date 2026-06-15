package com.ironsource;

import android.text.TextUtils;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public class ie {

    /* renamed from: a  reason: collision with root package name */
    private static ie f17827a = new ie();

    public static ie a() {
        return f17827a;
    }

    public static HashMap<String, Object> a(ConcurrentHashMap<String, Object> concurrentHashMap) throws JSONException {
        Object a10;
        HashMap<String, Object> hashMap = new HashMap<>();
        for (Map.Entry<String, Object> entry : concurrentHashMap.entrySet()) {
            if (entry.getValue() instanceof JSONObject) {
                a10 = a((JSONObject) entry.getValue());
            } else if (entry.getValue() instanceof JSONArray) {
                a10 = a((JSONArray) entry.getValue());
            } else if (entry.getValue() instanceof Map) {
                a10 = a((Map) entry.getValue());
            } else {
                hashMap.put(entry.getKey(), entry.getValue());
            }
            hashMap.put(entry.getKey(), a10);
        }
        return hashMap;
    }

    public static Map<String, Object> a(Map<String, Object> map) {
        HashMap hashMap = new HashMap();
        for (String str : map.keySet()) {
            hashMap.put(str, map.get(str));
        }
        return hashMap;
    }

    public static JSONArray a(JSONArray jSONArray) {
        JSONArray jSONArray2 = new JSONArray();
        for (int i10 = 0; i10 < jSONArray.length(); i10++) {
            jSONArray2.put(jSONArray.opt(i10));
        }
        return jSONArray2;
    }

    public static JSONObject a(JSONObject jSONObject) throws JSONException {
        JSONObject jSONObject2 = new JSONObject();
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            jSONObject2.put(next, jSONObject.opt(next));
        }
        return jSONObject2;
    }

    public static JSONObject b(JSONObject jSONObject) throws JSONException {
        if (jSONObject != null) {
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                Object opt = jSONObject.opt(next);
                if (opt instanceof List) {
                    jSONObject.put(next, TextUtils.join(",", (List) opt));
                }
            }
        }
        return jSONObject;
    }
}
