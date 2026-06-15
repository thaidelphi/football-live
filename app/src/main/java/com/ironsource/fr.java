package com.ironsource;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public class fr {

    /* renamed from: a  reason: collision with root package name */
    private JSONObject f17497a;

    public fr() {
        this.f17497a = new JSONObject();
    }

    public fr(String str) {
        f(str);
    }

    private Object a(Object obj) throws JSONException {
        if (obj == JSONObject.NULL) {
            return null;
        }
        return obj instanceof JSONObject ? b((JSONObject) obj) : obj instanceof JSONArray ? a((JSONArray) obj) : obj;
    }

    public static boolean a(JSONObject jSONObject) {
        return jSONObject.names() == null;
    }

    public static Object b(Object obj) throws JSONException {
        if (!(obj instanceof Map)) {
            if (obj instanceof Iterable) {
                JSONArray jSONArray = new JSONArray();
                for (Object obj2 : (Iterable) obj) {
                    jSONArray.put(obj2);
                }
                return jSONArray;
            }
            return obj;
        }
        JSONObject jSONObject = new JSONObject();
        Map map = (Map) obj;
        for (Object obj3 : map.keySet()) {
            if (obj3 != null) {
                jSONObject.put(obj3.toString(), b(map.get(obj3)));
            }
        }
        return jSONObject;
    }

    private Map<String, Object> b(JSONObject jSONObject) throws JSONException {
        HashMap hashMap = new HashMap();
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            hashMap.put(next, a(jSONObject.get(next)));
        }
        return hashMap;
    }

    private void f(String str) {
        try {
            this.f17497a = new JSONObject(str);
        } catch (Exception e8) {
            o9.d().a(e8);
            this.f17497a = new JSONObject();
        }
    }

    public int a(String str, int i10) {
        return this.f17497a.optInt(str, i10);
    }

    public String a(String str, String str2) {
        return this.f17497a.optString(str, str2);
    }

    public List a(JSONArray jSONArray) throws JSONException {
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < jSONArray.length(); i10++) {
            arrayList.add(a(jSONArray.get(i10)));
        }
        return arrayList;
    }

    public JSONObject a() {
        return this.f17497a;
    }

    public void a(String str, JSONObject jSONObject) {
        try {
            this.f17497a.put(str, jSONObject);
        } catch (Exception e8) {
            o9.d().a(e8);
        }
    }

    public boolean a(String str) {
        return a().has(str);
    }

    public Object b(String str) {
        try {
            return a().get(str);
        } catch (JSONException e8) {
            o9.d().a(e8);
            return null;
        }
    }

    public void b(String str, String str2) {
        try {
            this.f17497a.put(str, str2);
        } catch (Exception e8) {
            o9.d().a(e8);
        }
    }

    public boolean c(String str) {
        return this.f17497a.optBoolean(str);
    }

    public String d(String str) {
        return this.f17497a.optString(str, null);
    }

    public boolean e(String str) {
        return a().isNull(str);
    }

    public String toString() {
        JSONObject jSONObject = this.f17497a;
        return jSONObject == null ? "" : jSONObject.toString();
    }
}
