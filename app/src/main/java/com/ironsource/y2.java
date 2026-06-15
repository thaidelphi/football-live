package com.ironsource;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import org.json.JSONObject;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class y2 {

    /* renamed from: b  reason: collision with root package name */
    public static final a f21465b = new a(null);

    /* renamed from: c  reason: collision with root package name */
    public static final String f21466c = "adUnits";

    /* renamed from: a  reason: collision with root package name */
    private final JSONObject f21467a;

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(kotlin.jvm.internal.h hVar) {
            this();
        }
    }

    public y2(JSONObject configurations) {
        kotlin.jvm.internal.n.f(configurations, "configurations");
        this.f21467a = configurations.optJSONObject(f21466c);
    }

    public final <T> Map<String, T> a(t8.l<? super JSONObject, ? extends T> valueExtractor) {
        Map<String, T> f10;
        a9.f c10;
        kotlin.jvm.internal.n.f(valueExtractor, "valueExtractor");
        JSONObject jSONObject = this.f21467a;
        if (jSONObject == null) {
            f10 = j8.j0.f();
            return f10;
        }
        Iterator<String> keys = jSONObject.keys();
        kotlin.jvm.internal.n.e(keys, "adUnits.keys()");
        c10 = a9.l.c(keys);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (T t10 : c10) {
            JSONObject jSONObject2 = jSONObject.getJSONObject((String) t10);
            kotlin.jvm.internal.n.e(jSONObject2, "adUnits.getJSONObject(adUnitId)");
            linkedHashMap.put(t10, valueExtractor.invoke(jSONObject2));
        }
        return linkedHashMap;
    }
}
