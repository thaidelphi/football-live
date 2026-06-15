package com.ironsource.sdk.controller;

import android.content.Context;
import com.ironsource.c4;
import com.ironsource.fr;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.o9;
import com.ironsource.rk;
import com.ironsource.sdk.utils.Logger;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class q {

    /* renamed from: b  reason: collision with root package name */
    private static final String f20445b = "q";

    /* renamed from: c  reason: collision with root package name */
    private static final String f20446c = "getPermissions";

    /* renamed from: d  reason: collision with root package name */
    private static final String f20447d = "isPermissionGranted";

    /* renamed from: e  reason: collision with root package name */
    private static final String f20448e = "permissions";

    /* renamed from: f  reason: collision with root package name */
    private static final String f20449f = "permission";

    /* renamed from: g  reason: collision with root package name */
    private static final String f20450g = "status";

    /* renamed from: h  reason: collision with root package name */
    private static final String f20451h = "functionName";

    /* renamed from: i  reason: collision with root package name */
    private static final String f20452i = "functionParams";

    /* renamed from: j  reason: collision with root package name */
    private static final String f20453j = "success";

    /* renamed from: k  reason: collision with root package name */
    private static final String f20454k = "fail";

    /* renamed from: l  reason: collision with root package name */
    private static final String f20455l = "unhandledPermission";

    /* renamed from: a  reason: collision with root package name */
    private Context f20456a;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public static class b {

        /* renamed from: a  reason: collision with root package name */
        String f20457a;

        /* renamed from: b  reason: collision with root package name */
        JSONObject f20458b;

        /* renamed from: c  reason: collision with root package name */
        String f20459c;

        /* renamed from: d  reason: collision with root package name */
        String f20460d;

        private b() {
        }
    }

    public q(Context context) {
        this.f20456a = context;
    }

    private b a(String str) throws JSONException {
        JSONObject jSONObject = new JSONObject(str);
        b bVar = new b();
        bVar.f20457a = jSONObject.optString("functionName");
        bVar.f20458b = jSONObject.optJSONObject("functionParams");
        bVar.f20459c = jSONObject.optString("success");
        bVar.f20460d = jSONObject.optString("fail");
        return bVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(String str, rk rkVar) throws Exception {
        b a10 = a(str);
        if (f20446c.equals(a10.f20457a)) {
            a(a10.f20458b, a10, rkVar);
        } else if (f20447d.equals(a10.f20457a)) {
            b(a10.f20458b, a10, rkVar);
        } else {
            String str2 = f20445b;
            Logger.i(str2, "PermissionsJSAdapter unhandled API request " + str);
        }
    }

    public void a(JSONObject jSONObject, b bVar, rk rkVar) {
        fr frVar = new fr();
        try {
            frVar.a(f20448e, c4.a(this.f20456a, jSONObject.getJSONArray(f20448e)));
            rkVar.a(true, bVar.f20459c, frVar);
        } catch (Exception e8) {
            o9.d().a(e8);
            IronLog.INTERNAL.error(e8.toString());
            String str = f20445b;
            Logger.i(str, "PermissionsJSAdapter getPermissions JSON Exception when getting permissions parameter " + e8.getMessage());
            frVar.b("errMsg", e8.getMessage());
            rkVar.a(false, bVar.f20460d, frVar);
        }
    }

    public void b(JSONObject jSONObject, b bVar, rk rkVar) {
        String str;
        boolean z10;
        fr frVar = new fr();
        try {
            String string = jSONObject.getString(f20449f);
            frVar.b(f20449f, string);
            if (c4.d(this.f20456a, string)) {
                frVar.b("status", String.valueOf(c4.c(this.f20456a, string)));
                z10 = true;
                str = bVar.f20459c;
            } else {
                frVar.b("status", f20455l);
                str = bVar.f20460d;
                z10 = false;
            }
            rkVar.a(z10, str, frVar);
        } catch (Exception e8) {
            o9.d().a(e8);
            IronLog.INTERNAL.error(e8.toString());
            frVar.b("errMsg", e8.getMessage());
            rkVar.a(false, bVar.f20460d, frVar);
        }
    }
}
