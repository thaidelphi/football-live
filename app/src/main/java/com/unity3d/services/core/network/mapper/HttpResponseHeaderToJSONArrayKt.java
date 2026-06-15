package com.unity3d.services.core.network.mapper;

import j8.q;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.n;
import org.json.JSONArray;
/* compiled from: HttpResponseHeaderToJSONArray.kt */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
public final class HttpResponseHeaderToJSONArrayKt {
    public static final JSONArray toResponseHeadersMap(Map<String, ? extends List<String>> map) {
        Set<Map.Entry<String, ? extends List<String>>> entrySet;
        List f10;
        if (map != null && (entrySet = map.entrySet()) != null) {
            JSONArray jSONArray = new JSONArray();
            Iterator<T> it = entrySet.iterator();
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                f10 = q.f((String) entry.getKey(), (List) entry.getValue());
                jSONArray = jSONArray.put(new JSONArray((Collection) f10));
                n.e(jSONArray, "acc.put(JSONArray(listOf(key, value)))");
            }
            if (jSONArray != null) {
                return jSONArray;
            }
        }
        return new JSONArray();
    }
}
