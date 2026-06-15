package com.ironsource;

import org.json.JSONObject;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class sh {
    /* JADX INFO: Access modifiers changed from: private */
    public static final String b(JSONObject jSONObject, String str) {
        String optString = jSONObject.optString(str);
        if (optString.length() == 0) {
            return null;
        }
        return optString;
    }
}
