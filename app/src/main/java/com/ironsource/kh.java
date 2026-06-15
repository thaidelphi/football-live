package com.ironsource;

import android.util.Base64;
import com.ironsource.mediationsdk.logger.IronLog;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public class kh implements vf {
    @Override // com.ironsource.vf
    public String a(Map<String, Object> map) {
        try {
            return String.format("%s=%s", "data", Base64.encodeToString(new JSONObject().put(cc.Q, cc.R).put("data", new JSONObject(map)).toString().getBytes(), 2));
        } catch (JSONException e8) {
            o9.d().a(e8);
            IronLog.INTERNAL.error(e8.toString());
            return "";
        }
    }
}
