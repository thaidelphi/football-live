package com.ironsource;

import java.util.Collection;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONObject;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class xk {

    /* renamed from: a  reason: collision with root package name */
    private static final int f21404a = 100;

    private static final boolean a(Object obj, Object obj2, int i10) {
        return ((obj instanceof JSONObject) && (obj2 instanceof JSONObject)) ? a((JSONObject) obj, (JSONObject) obj2, i10 + 1) : ((obj instanceof JSONArray) && (obj2 instanceof JSONArray)) ? a((JSONArray) obj, (JSONArray) obj2, i10 + 1) : ((obj instanceof Number) && (obj2 instanceof Number)) ? ((Number) obj).doubleValue() == ((Number) obj2).doubleValue() : kotlin.jvm.internal.n.a(obj, obj2);
    }

    public static final boolean a(JSONArray lhs, JSONArray rhs) {
        kotlin.jvm.internal.n.f(lhs, "lhs");
        kotlin.jvm.internal.n.f(rhs, "rhs");
        return a(lhs, rhs, 0);
    }

    private static final boolean a(JSONArray jSONArray, JSONArray jSONArray2, int i10) {
        y8.c h10;
        if (jSONArray == jSONArray2) {
            return true;
        }
        if (jSONArray.length() == jSONArray2.length() && i10 <= 100) {
            h10 = y8.i.h(0, jSONArray.length());
            if ((h10 instanceof Collection) && ((Collection) h10).isEmpty()) {
                return true;
            }
            Iterator<Integer> it = h10.iterator();
            while (it.hasNext()) {
                int a10 = ((j8.e0) it).a();
                if (!a(jSONArray.get(a10), jSONArray2.get(a10), i10)) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }

    public static final boolean a(JSONObject lhs, JSONObject rhs) {
        kotlin.jvm.internal.n.f(lhs, "lhs");
        kotlin.jvm.internal.n.f(rhs, "rhs");
        return a(lhs, rhs, 0);
    }

    private static final boolean a(JSONObject jSONObject, JSONObject jSONObject2, int i10) {
        boolean z10;
        if (jSONObject == jSONObject2) {
            return true;
        }
        if (jSONObject.length() == jSONObject2.length() && i10 <= 100) {
            Iterator<String> keys = jSONObject.keys();
            kotlin.jvm.internal.n.e(keys, "lhs.keys()");
            for (String str : a9.i.c(keys)) {
                if (jSONObject2.has(str) && a(jSONObject.get(str), jSONObject2.get(str), i10)) {
                    z10 = true;
                    continue;
                } else {
                    z10 = false;
                    continue;
                }
                if (!z10) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }
}
