package com.ironsource;

import com.ironsource.mediationsdk.logger.IronLog;
import java.util.ArrayList;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public class lk extends e {

    /* renamed from: i  reason: collision with root package name */
    private final String f18243i = "https://o-sdk.mediation.unity3d.com/mediation?adUnit=2";

    /* renamed from: j  reason: collision with root package name */
    private final String f18244j = "super.dwh.mediation_events";

    /* renamed from: k  reason: collision with root package name */
    private final String f18245k = cc.Q;

    /* renamed from: l  reason: collision with root package name */
    private final String f18246l = "data";

    /* JADX INFO: Access modifiers changed from: package-private */
    public lk(int i10) {
        this.f17155g = i10;
    }

    @Override // com.ironsource.e
    public String a() {
        return "https://o-sdk.mediation.unity3d.com/mediation?adUnit=2";
    }

    @Override // com.ironsource.e
    public String a(ArrayList<zb> arrayList, JSONObject jSONObject) {
        JSONObject jSONObject2 = new JSONObject();
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        this.f17154f = jSONObject;
        try {
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
            jSONObject2.put(cc.Q, "super.dwh.mediation_events");
            jSONObject2.put("data", a(jSONArray));
            return jSONObject2.toString();
        } catch (JSONException e8) {
            o9.d().a(e8);
            IronLog.INTERNAL.error(e8.toString());
            return "";
        }
    }

    @Override // com.ironsource.e
    public String c() {
        return "ironbeast";
    }
}
