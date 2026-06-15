package com.appnext.core.ra.a;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import com.appnext.core.i;
import com.appnext.core.ra.database.RecentAppsDatabase;
import com.ironsource.b9;
import com.unity3d.services.UnityAdsConstants;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class d extends b {
    public d(Context context, Bundle bundle) {
        super(context, bundle);
    }

    private void a(JSONObject jSONObject) {
        try {
            HashMap hashMap = new HashMap();
            hashMap.put("data", jSONObject.toString());
            i.a(getContext(), "https://global.appnext.com/AdminService.asmx/ra?", (HashMap<String, String>) hashMap, false, (int) UnityAdsConstants.AdOperations.SHOW_TIMEOUT_MS);
        } catch (Throwable th) {
            com.appnext.base.a.a("SendRecentAppsAction$sendToServer", th);
        }
    }

    @Override // com.appnext.core.ra.a.b
    protected final void ar() {
        try {
            JSONObject jSONObject = new JSONObject();
            List<com.appnext.core.ra.database.a> ax = RecentAppsDatabase.getInstance(getContext()).recentAppDao().ax();
            if (!ax.isEmpty()) {
                String a10 = i.a(getContext(), true);
                if (!TextUtils.isEmpty(a10)) {
                    jSONObject.put("did", a10);
                    jSONObject.put("publisher_packagename", getContext().getPackageName());
                    JSONArray jSONArray = new JSONArray();
                    ArrayList arrayList = new ArrayList();
                    for (com.appnext.core.ra.database.a aVar : ax) {
                        JSONObject jSONObject2 = new JSONObject();
                        jSONObject2.put(b9.h.V, aVar.eu);
                        jSONObject2.put("date", aVar.ev);
                        jSONArray.put(jSONObject2);
                        aVar.ew = true;
                        arrayList.add(aVar);
                    }
                    jSONObject.put("apps", jSONArray);
                    a(jSONObject);
                    RecentAppsDatabase.getInstance(getContext()).recentAppDao().b(arrayList);
                    jSONObject.toString();
                }
            }
        } catch (Throwable th) {
            try {
                com.appnext.base.a.a("SendRecentAppsAction$sendRecentAppsToTheServer", th);
            } catch (Throwable th2) {
                com.appnext.base.a.a("SendRecentAppsAction$doUniqueAction", th2);
                return;
            }
        }
        try {
            RecentAppsDatabase.getInstance(getContext()).recentAppDao().z(b.av().format(new Date()));
        } catch (Throwable unused) {
        }
    }

    @Override // com.appnext.core.ra.a.b
    protected final boolean as() {
        return true;
    }
}
