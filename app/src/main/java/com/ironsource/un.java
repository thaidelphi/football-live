package com.ironsource;

import java.util.LinkedHashMap;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class un implements ft<JSONObject>, dt<sn> {

    /* renamed from: a  reason: collision with root package name */
    private final Map<String, h3> f21065a = new LinkedHashMap();

    @Override // com.ironsource.dt
    public void a(sn record) {
        kotlin.jvm.internal.n.f(record, "record");
        String c10 = record.c();
        Map<String, h3> map = this.f21065a;
        h3 h3Var = map.get(c10);
        if (h3Var == null) {
            h3Var = new h3();
            map.put(c10, h3Var);
        }
        h3Var.a(record.a(new tn()));
    }

    @Override // com.ironsource.we
    /* renamed from: b */
    public JSONObject a(et mode) {
        kotlin.jvm.internal.n.f(mode, "mode");
        JSONObject jSONObject = new JSONObject();
        for (Map.Entry<String, h3> entry : this.f21065a.entrySet()) {
            String key = entry.getKey();
            JSONArray a10 = entry.getValue().a(mode);
            if (a10.length() > 0) {
                jSONObject.put(key, a10);
            }
        }
        return jSONObject;
    }
}
