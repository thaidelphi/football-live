package com.ironsource;

import java.util.LinkedHashMap;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class sp {

    /* renamed from: b  reason: collision with root package name */
    public static final a f20712b = new a(null);

    /* renamed from: c  reason: collision with root package name */
    public static final String f20713c = "placements";

    /* renamed from: d  reason: collision with root package name */
    public static final String f20714d = "placementName";

    /* renamed from: a  reason: collision with root package name */
    private final JSONArray f20715a;

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(kotlin.jvm.internal.h hVar) {
            this();
        }
    }

    public sp(JSONObject configuration) {
        kotlin.jvm.internal.n.f(configuration, "configuration");
        this.f20715a = configuration.optJSONArray(f20713c);
    }

    public final <T> Map<String, T> a(t8.l<? super JSONObject, ? extends T> valueExtractor) {
        kotlin.jvm.internal.n.f(valueExtractor, "valueExtractor");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        JSONArray jSONArray = this.f20715a;
        if (jSONArray != null) {
            int length = jSONArray.length();
            for (int i10 = 0; i10 < length; i10++) {
                JSONObject jsonObject = jSONArray.getJSONObject(i10);
                String key = jsonObject.optString(f20714d);
                kotlin.jvm.internal.n.e(jsonObject, "jsonObject");
                T invoke = valueExtractor.invoke(jsonObject);
                kotlin.jvm.internal.n.e(key, "key");
                linkedHashMap.put(key, invoke);
            }
        }
        return linkedHashMap;
    }
}
