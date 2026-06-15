package com.ironsource.sdk.controller;

import android.content.Context;
import com.ironsource.cv;
import com.ironsource.environment.StringUtils;
import com.ironsource.fr;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.o9;
import com.ironsource.pn;
import com.ironsource.rk;
import com.ironsource.sdk.utils.Logger;
import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class u {

    /* renamed from: d  reason: collision with root package name */
    private static final String f20467d = "u";

    /* renamed from: e  reason: collision with root package name */
    private static final String f20468e = "updateToken";

    /* renamed from: f  reason: collision with root package name */
    private static final String f20469f = "getToken";

    /* renamed from: g  reason: collision with root package name */
    private static final String f20470g = "functionName";

    /* renamed from: h  reason: collision with root package name */
    private static final String f20471h = "functionParams";

    /* renamed from: i  reason: collision with root package name */
    private static final String f20472i = "success";

    /* renamed from: j  reason: collision with root package name */
    private static final String f20473j = "fail";

    /* renamed from: b  reason: collision with root package name */
    private Context f20475b;

    /* renamed from: a  reason: collision with root package name */
    private pn f20474a = new pn();

    /* renamed from: c  reason: collision with root package name */
    private cv f20476c = new cv();

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public static class b {

        /* renamed from: a  reason: collision with root package name */
        String f20477a;

        /* renamed from: b  reason: collision with root package name */
        JSONObject f20478b;

        /* renamed from: c  reason: collision with root package name */
        String f20479c;

        /* renamed from: d  reason: collision with root package name */
        String f20480d;

        private b() {
        }
    }

    public u(Context context) {
        this.f20475b = context;
    }

    private b a(String str) throws JSONException {
        JSONObject jSONObject = new JSONObject(str);
        b bVar = new b();
        bVar.f20477a = jSONObject.optString("functionName");
        bVar.f20478b = jSONObject.optJSONObject("functionParams");
        bVar.f20479c = jSONObject.optString("success");
        bVar.f20480d = jSONObject.optString("fail");
        return bVar;
    }

    private void a(b bVar, rk rkVar) {
        try {
            JSONObject a10 = this.f20476c.a();
            Iterator<String> keys = a10.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                Object obj = a10.get(next);
                if (obj instanceof String) {
                    a10.put(next, StringUtils.encodeURI((String) obj));
                }
            }
            rkVar.a(true, bVar.f20479c, a10);
        } catch (Exception e8) {
            o9.d().a(e8);
            rkVar.a(false, bVar.f20480d, e8.getMessage());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(String str, rk rkVar) throws Exception {
        b a10 = a(str);
        if (f20468e.equals(a10.f20477a)) {
            a(a10.f20478b, a10, rkVar);
        } else if (f20469f.equals(a10.f20477a)) {
            a(a10, rkVar);
        } else {
            String str2 = f20467d;
            Logger.i(str2, "unhandled API request " + str);
        }
    }

    public void a(JSONObject jSONObject, b bVar, rk rkVar) {
        fr frVar = new fr();
        try {
            this.f20474a.a(jSONObject);
            rkVar.a(true, bVar.f20479c, frVar);
        } catch (Exception e8) {
            o9.d().a(e8);
            IronLog.INTERNAL.error(e8.toString());
            String str = f20467d;
            Logger.i(str, "updateToken exception " + e8.getMessage());
            rkVar.a(false, bVar.f20480d, frVar);
        }
    }
}
