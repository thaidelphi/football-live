package com.unity3d.ads.core.extensions;

import j8.e0;
import j8.r;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.n;
import org.json.JSONArray;
import y8.c;
import y8.i;
/* compiled from: JSONArrayExtensions.kt */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
public final class JSONArrayExtensionsKt {
    public static final Map<String, List<String>> getHeadersMap(JSONArray jSONArray) {
        n.f(jSONArray, "<this>");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        int length = jSONArray.length();
        for (int i10 = 0; i10 < length; i10++) {
            Object obj = jSONArray.get(i10);
            n.d(obj, "null cannot be cast to non-null type org.json.JSONArray");
            JSONArray jSONArray2 = (JSONArray) obj;
            List list = (List) linkedHashMap.get(jSONArray2.getString(0));
            if (list == null) {
                list = new ArrayList();
            }
            String string = jSONArray2.getString(1);
            n.e(string, "header.getString(1)");
            list.add(string);
            String string2 = jSONArray2.getString(0);
            n.e(string2, "header.getString(0)");
            linkedHashMap.put(string2, list);
        }
        return linkedHashMap;
    }

    public static final Object[] toTypedArray(JSONArray jSONArray) {
        c h10;
        int k10;
        n.f(jSONArray, "<this>");
        h10 = i.h(0, jSONArray.length());
        k10 = r.k(h10, 10);
        ArrayList arrayList = new ArrayList(k10);
        Iterator<Integer> it = h10.iterator();
        while (it.hasNext()) {
            arrayList.add(jSONArray.get(((e0) it).a()));
        }
        return arrayList.toArray(new Object[0]);
    }
}
