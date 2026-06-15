package com.ironsource.sdk.controller;

import android.webkit.JavascriptInterface;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.o9;
import com.ironsource.sdk.utils.Logger;
import com.ironsource.sdk.utils.SDKUtils;
import org.json.JSONException;
import org.json.JSONObject;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class g {

    /* renamed from: c  reason: collision with root package name */
    private static final String f20352c = "com.ironsource.sdk.controller.g";

    /* renamed from: d  reason: collision with root package name */
    private static final String f20353d = "functionName";

    /* renamed from: e  reason: collision with root package name */
    private static final String f20354e = "params";

    /* renamed from: f  reason: collision with root package name */
    private static final String f20355f = "hash";

    /* renamed from: a  reason: collision with root package name */
    private final b f20356a;

    /* renamed from: b  reason: collision with root package name */
    private final s f20357b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public g(b bVar, s sVar) {
        this.f20356a = bVar;
        this.f20357b = sVar;
    }

    private String a(String str, String str2, String str3) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("functionName", SDKUtils.encodeString(str));
            jSONObject.put("params", SDKUtils.encodeString(str2));
            jSONObject.put(f20355f, SDKUtils.encodeString(str3));
        } catch (JSONException e8) {
            o9.d().a(e8);
            IronLog.INTERNAL.error(e8.toString());
        }
        return jSONObject.toString();
    }

    private void a(Exception exc) {
        if (!(exc instanceof NoSuchMethodException)) {
            a(exc.getLocalizedMessage());
            return;
        }
        IronLog.INTERNAL.error(exc.toString());
        String str = f20352c;
        Logger.i(str, "messageHandler failed with exception " + exc.getMessage());
    }

    private void a(String str) {
        this.f20356a.b(str);
    }

    private void a(String str, String str2) throws Exception {
        this.f20356a.a(str, str2);
    }

    private void b(String str, String str2, String str3) {
        this.f20356a.a(a(str, str2, str3));
    }

    @JavascriptInterface
    public void messageHandler(String str, String str2, String str3) {
        try {
            String str4 = f20352c;
            Logger.i(str4, "messageHandler(" + str + " " + str3 + ")");
            if (this.f20357b.a(str, str2, str3)) {
                a(str, str2);
            } else {
                b(str, str2, str3);
            }
        } catch (Exception e8) {
            a(e8);
        }
    }
}
