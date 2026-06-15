package com.ironsource.sdk.controller;

import android.content.Context;
import android.text.TextUtils;
import com.ironsource.fr;
import com.ironsource.ho;
import com.ironsource.o9;
import com.ironsource.rk;
import com.ironsource.sdk.utils.Logger;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class o {

    /* renamed from: c  reason: collision with root package name */
    private static final String f20418c = "o";

    /* renamed from: d  reason: collision with root package name */
    private static final String f20419d = "activate";

    /* renamed from: e  reason: collision with root package name */
    private static final String f20420e = "startSession";

    /* renamed from: f  reason: collision with root package name */
    private static final String f20421f = "finishSession";

    /* renamed from: g  reason: collision with root package name */
    private static final String f20422g = "impressionOccurred";

    /* renamed from: h  reason: collision with root package name */
    private static final String f20423h = "getOmidData";

    /* renamed from: i  reason: collision with root package name */
    private static final String f20424i = "omidFunction";

    /* renamed from: j  reason: collision with root package name */
    private static final String f20425j = "omidParams";

    /* renamed from: k  reason: collision with root package name */
    private static final String f20426k = "success";

    /* renamed from: l  reason: collision with root package name */
    private static final String f20427l = "fail";

    /* renamed from: m  reason: collision with root package name */
    private static final String f20428m = "%s | unsupported OMID API";

    /* renamed from: a  reason: collision with root package name */
    private final Context f20429a;

    /* renamed from: b  reason: collision with root package name */
    private final ho f20430b = new ho();

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public static class b {

        /* renamed from: a  reason: collision with root package name */
        String f20431a;

        /* renamed from: b  reason: collision with root package name */
        JSONObject f20432b;

        /* renamed from: c  reason: collision with root package name */
        String f20433c;

        /* renamed from: d  reason: collision with root package name */
        String f20434d;

        private b() {
        }
    }

    public o(Context context) {
        this.f20429a = context;
    }

    private b a(String str) throws JSONException {
        JSONObject jSONObject = new JSONObject(str);
        b bVar = new b();
        bVar.f20431a = jSONObject.optString(f20424i);
        bVar.f20432b = jSONObject.optJSONObject(f20425j);
        bVar.f20433c = jSONObject.optString("success");
        bVar.f20434d = jSONObject.optString("fail");
        return bVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(String str, rk rkVar) throws Exception {
        b a10 = a(str);
        fr frVar = new fr();
        JSONObject jSONObject = a10.f20432b;
        if (jSONObject != null) {
            String optString = jSONObject.optString("adViewId", "");
            if (!TextUtils.isEmpty(optString)) {
                frVar.b("adViewId", optString);
            }
        }
        try {
            String str2 = a10.f20431a;
            char c10 = 65535;
            switch (str2.hashCode()) {
                case -1655974669:
                    if (str2.equals(f20419d)) {
                        c10 = 0;
                        break;
                    }
                    break;
                case -984459207:
                    if (str2.equals(f20423h)) {
                        c10 = 4;
                        break;
                    }
                    break;
                case 70701699:
                    if (str2.equals(f20421f)) {
                        c10 = 2;
                        break;
                    }
                    break;
                case 1208109646:
                    if (str2.equals(f20422g)) {
                        c10 = 3;
                        break;
                    }
                    break;
                case 1850541012:
                    if (str2.equals(f20420e)) {
                        c10 = 1;
                        break;
                    }
                    break;
            }
            if (c10 != 0) {
                if (c10 == 1) {
                    this.f20430b.d(a10.f20432b);
                } else if (c10 == 2) {
                    this.f20430b.b(a10.f20432b);
                } else if (c10 == 3) {
                    this.f20430b.c(a10.f20432b);
                } else if (c10 != 4) {
                    throw new IllegalArgumentException(String.format(f20428m, a10.f20431a));
                }
                rkVar.a(true, a10.f20433c, frVar);
            }
            this.f20430b.a(this.f20429a);
            frVar = this.f20430b.a();
            rkVar.a(true, a10.f20433c, frVar);
        } catch (Exception e8) {
            o9.d().a(e8);
            frVar.b("errMsg", e8.getMessage());
            Logger.i(f20418c, "OMIDJSAdapter " + a10.f20431a + " Exception: " + e8.getMessage());
            rkVar.a(false, a10.f20434d, frVar);
        }
    }
}
