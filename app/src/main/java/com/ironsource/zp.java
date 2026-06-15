package com.ironsource;

import com.unity3d.mediation.LevelPlay;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zp {

    /* renamed from: a  reason: collision with root package name */
    private final Map<LevelPlay.AdFormat, a> f21680a;

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        private final Map<String, b> f21681a;

        public a(JSONObject adFormatProviderOrder) {
            int k10;
            int c10;
            int a10;
            kotlin.jvm.internal.n.f(adFormatProviderOrder, "adFormatProviderOrder");
            List<String> b10 = mk.b(adFormatProviderOrder.names());
            b10 = b10 == null ? j8.q.d() : b10;
            k10 = j8.r.k(b10, 10);
            c10 = j8.i0.c(k10);
            a10 = y8.i.a(c10, 16);
            LinkedHashMap linkedHashMap = new LinkedHashMap(a10);
            for (Object obj : b10) {
                JSONArray optJSONArray = adFormatProviderOrder.optJSONArray((String) obj);
                if (optJSONArray == null) {
                    optJSONArray = new JSONArray();
                } else {
                    kotlin.jvm.internal.n.e(optJSONArray, "adFormatProviderOrder.op…(adUnitId) ?: JSONArray()");
                }
                linkedHashMap.put(obj, new b(optJSONArray));
            }
            this.f21681a = linkedHashMap;
        }

        public final Map<String, b> a() {
            return this.f21681a;
        }
    }

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        private final List<String> f21682a;

        public b(JSONArray providerOrder) {
            kotlin.jvm.internal.n.f(providerOrder, "providerOrder");
            List<String> b10 = mk.b(providerOrder);
            kotlin.jvm.internal.n.e(b10, "jsonArrayToStringList(providerOrder)");
            this.f21682a = b10;
        }

        public final List<String> a() {
            return this.f21682a;
        }
    }

    public zp(JSONObject providerOrder) {
        int c10;
        int a10;
        kotlin.jvm.internal.n.f(providerOrder, "providerOrder");
        LevelPlay.AdFormat[] values = LevelPlay.AdFormat.values();
        c10 = j8.i0.c(values.length);
        a10 = y8.i.a(c10, 16);
        LinkedHashMap linkedHashMap = new LinkedHashMap(a10);
        for (LevelPlay.AdFormat adFormat : values) {
            JSONObject optJSONObject = providerOrder.optJSONObject(vt.a(adFormat));
            if (optJSONObject == null) {
                optJSONObject = new JSONObject();
            } else {
                kotlin.jvm.internal.n.e(optJSONObject, "providerOrder.optJSONObj…dFormat)) ?: JSONObject()");
            }
            linkedHashMap.put(adFormat, new a(optJSONObject));
        }
        this.f21680a = linkedHashMap;
    }

    public final Map<LevelPlay.AdFormat, a> a() {
        return this.f21680a;
    }
}
