package com.ironsource;

import java.util.LinkedHashMap;
import java.util.Map;
import org.json.JSONObject;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class h2 implements ft<JSONObject>, dt<f2> {

    /* renamed from: a  reason: collision with root package name */
    private final Map<String, un> f17635a = new LinkedHashMap();

    @Override // com.ironsource.dt
    public void a(f2 record) {
        kotlin.jvm.internal.n.f(record, "record");
        String d10 = record.d();
        Map<String, un> map = this.f17635a;
        un unVar = map.get(d10);
        if (unVar == null) {
            unVar = new un();
            map.put(d10, unVar);
        }
        unVar.a(record.a(new g2()));
    }

    @Override // com.ironsource.we
    /* renamed from: b */
    public JSONObject a(et mode) {
        String p02;
        kotlin.jvm.internal.n.f(mode, "mode");
        JSONObject jSONObject = new JSONObject();
        for (Map.Entry<String, un> entry : this.f17635a.entrySet()) {
            String key = entry.getKey();
            JSONObject a10 = entry.getValue().a(mode);
            if (a10.length() > 0) {
                p02 = b9.p.p0(key, "_", null, 2, null);
                jSONObject.put(p02, a10);
            }
        }
        return jSONObject;
    }
}
