package com.ironsource;

import java.util.ArrayList;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONObject;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
class wo extends e {

    /* renamed from: i  reason: collision with root package name */
    private final String f21312i = kp.f18105a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public wo(int i10) {
        this.f17155g = i10;
    }

    @Override // com.ironsource.e
    public String a() {
        return kp.f18105a;
    }

    @Override // com.ironsource.e
    public String a(ArrayList<zb> arrayList, JSONObject jSONObject) {
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        this.f17154f = jSONObject;
        JSONArray jSONArray = new JSONArray();
        if (arrayList != null && !arrayList.isEmpty()) {
            Iterator<zb> it = arrayList.iterator();
            while (it.hasNext()) {
                JSONObject a10 = a(it.next());
                if (a10 != null) {
                    jSONArray.put(a10);
                }
            }
        }
        return a(jSONArray);
    }

    @Override // com.ironsource.e
    public String c() {
        return "outcome";
    }
}
