package com.appnext.core.crashes;

import android.content.Context;
import android.text.TextUtils;
import com.appnext.core.i;
import com.unity3d.services.UnityAdsConstants;
import java.util.HashMap;
import org.json.JSONObject;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class a {
    private Context aO;
    private String dZ;
    private String ea;

    public a(Context context, String str, String str2) {
        this.dZ = null;
        this.ea = null;
        this.aO = context;
        this.dZ = str;
        this.ea = str2;
    }

    public final void ah() {
        try {
            if (!TextUtils.isEmpty(this.dZ) && !TextUtils.isEmpty(this.ea)) {
                JSONObject jSONObject = new JSONObject();
                Context context = this.aO;
                if (context != null) {
                    jSONObject.put("did", i.a(context, false));
                }
                jSONObject.put("api_Call", this.dZ);
                jSONObject.put("ex", this.ea);
                jSONObject.put("ver", "2.7.6.473");
                HashMap hashMap = new HashMap();
                hashMap.put("data", jSONObject.toString());
                i.a(this.aO, "https://global.appnext.com/AdminService.asmx/ex?data=", (HashMap<String, String>) hashMap, false, (int) UnityAdsConstants.AdOperations.SHOW_TIMEOUT_MS);
            }
        } catch (Throwable th) {
            th.getMessage();
        }
    }
}
