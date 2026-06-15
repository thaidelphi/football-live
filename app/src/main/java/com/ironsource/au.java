package com.ironsource;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import com.ironsource.b9;
import com.ironsource.mediationsdk.testSuite.TestSuiteActivity;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class au {
    private final SharedPreferences a(Context context) {
        SharedPreferences sharedPreferences = context.getSharedPreferences("com.unity3d.ad-mediation.testSuite", 0);
        kotlin.jvm.internal.n.e(sharedPreferences, "context.getSharedPrefere…EY, Context.MODE_PRIVATE)");
        return sharedPreferences;
    }

    private final String a(String str, String str2, String str3, String str4, String str5, Boolean bool, JSONObject jSONObject, boolean z10, JSONObject jSONObject2, JSONObject jSONObject3, JSONObject jSONObject4) {
        Map g10;
        g10 = j8.j0.g(i8.s.a("deviceOS", b9.f16509d), i8.s.a("appKey", str), i8.s.a("sdkVersion", str2), i8.s.a("bundleId", str3), i8.s.a("appName", str4), i8.s.a(b9.i.W, str5), i8.s.a("initResponse", jSONObject), i8.s.a("isRvManual", Boolean.valueOf(z10)), i8.s.a("generalProperties", jSONObject2), i8.s.a("adaptersVersion", jSONObject3), i8.s.a("metaData", jSONObject4), i8.s.a("gdprConsent", bool));
        String jSONObject5 = new JSONObject(g10).toString();
        kotlin.jvm.internal.n.e(jSONObject5, "JSONObject(\n            …ent))\n        .toString()");
        return jSONObject5;
    }

    private final JSONObject a() {
        JSONObject jSONObject = new JSONObject();
        for (Map.Entry<String, List<String>> entry : lu.f18358a.d().entrySet()) {
            jSONObject.putOpt(entry.getKey(), new JSONArray((Collection) entry.getValue()));
        }
        return jSONObject;
    }

    private final void a(Context context, String str) {
        SharedPreferences.Editor edit = a(context).edit();
        kotlin.jvm.internal.n.e(edit, "getTestSuitePrefs(context).edit()");
        edit.putString("dataString", str);
        edit.apply();
    }

    public final void a(Context context, String appKey, JSONObject initResponse, String sdkVersion, String testSuiteControllerUrl, Boolean bool, boolean z10) {
        kotlin.jvm.internal.n.f(context, "context");
        kotlin.jvm.internal.n.f(appKey, "appKey");
        kotlin.jvm.internal.n.f(initResponse, "initResponse");
        kotlin.jvm.internal.n.f(sdkVersion, "sdkVersion");
        kotlin.jvm.internal.n.f(testSuiteControllerUrl, "testSuiteControllerUrl");
        lu luVar = lu.f18358a;
        a(context, a(appKey, sdkVersion, luVar.c(context), luVar.a(context), luVar.b(context), bool, initResponse, z10, luVar.b(), luVar.c(), a()));
        Intent intent = new Intent(context, TestSuiteActivity.class);
        intent.setFlags(805306368);
        intent.putExtra("controllerUrl", testSuiteControllerUrl);
        context.startActivity(intent);
    }

    public final String b(Context context) {
        kotlin.jvm.internal.n.f(context, "context");
        return a(context).getString("dataString", "");
    }
}
