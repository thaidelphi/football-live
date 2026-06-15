package com.ironsource;

import android.app.Activity;
import java.util.Map;
import org.json.JSONObject;
@Deprecated
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public interface gr {
    void a(Activity activity);

    void a(String str, String str2, int i10);

    void a(String str, String str2, String str3, Map<String, String> map, lo loVar);

    void a(String str, String str2, String str3, Map<String, String> map, qo qoVar);

    void a(JSONObject jSONObject);

    boolean a(String str);

    void b(JSONObject jSONObject);

    void c(JSONObject jSONObject);

    void onPause(Activity activity);

    void onResume(Activity activity);
}
