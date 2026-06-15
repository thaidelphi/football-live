package com.unity3d.ads.core.extensions;

import a9.f;
import a9.l;
import com.google.android.gms.ads.AdError;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.n;
import org.json.JSONObject;
/* compiled from: JSONObjectExtensions.kt */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
public final class JSONObjectExtensionsKt {
    public static final Map<String, Object> toBuiltInMap(JSONObject jSONObject) {
        f c10;
        n.f(jSONObject, "<this>");
        Iterator<String> keys = jSONObject.keys();
        n.e(keys, "keys()");
        c10 = l.c(keys);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object obj : c10) {
            Object opt = jSONObject.opt((String) obj);
            if (opt != null) {
                n.e(opt, "opt(value)");
                if ((n.a(String.valueOf(opt), AdError.UNDEFINED_DOMAIN) || n.a(String.valueOf(opt), "null")) ? false : true) {
                    linkedHashMap.put(obj, opt);
                }
            }
            opt = null;
            linkedHashMap.put(obj, opt);
        }
        return linkedHashMap;
    }
}
