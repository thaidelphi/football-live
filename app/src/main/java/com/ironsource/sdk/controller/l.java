package com.ironsource.sdk.controller;

import android.app.Activity;
import android.content.Context;
import com.ironsource.eh;
import com.ironsource.om;
import com.ironsource.sdk.controller.f;
import com.ironsource.t9;
import com.ironsource.u9;
import com.ironsource.v9;
import com.ironsource.va;
import java.util.Map;
import org.json.JSONObject;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public interface l {

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public interface a {
        void a(f.a aVar);
    }

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public interface b {
        void a(om omVar);
    }

    void a();

    void a(Activity activity);

    void a(Context context);

    void a(f.c cVar, a aVar);

    void a(va vaVar);

    void a(va vaVar, Map<String, String> map, t9 t9Var);

    void a(va vaVar, Map<String, String> map, u9 u9Var);

    void a(String str, u9 u9Var);

    void a(String str, String str2, va vaVar, t9 t9Var);

    void a(String str, String str2, va vaVar, u9 u9Var);

    void a(String str, String str2, va vaVar, v9 v9Var);

    void a(JSONObject jSONObject);

    void a(JSONObject jSONObject, t9 t9Var);

    void a(JSONObject jSONObject, u9 u9Var);

    void a(JSONObject jSONObject, v9 v9Var);

    boolean a(String str);

    void b(Context context);

    void b(va vaVar);

    void b(va vaVar, Map<String, String> map, u9 u9Var);

    void b(JSONObject jSONObject);

    void d();

    void destroy();

    @Deprecated
    void e();

    void f();

    eh.c g();
}
