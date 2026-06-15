package com.ironsource.sdk.controller;

import android.content.Context;
import com.ironsource.b9;
import com.ironsource.fr;
import com.ironsource.mm;
import com.ironsource.nf;
import com.ironsource.rk;
import com.ironsource.sdk.utils.Logger;
import com.ironsource.sdk.utils.SDKUtils;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class i {

    /* renamed from: c  reason: collision with root package name */
    private static final String f20363c = "i";

    /* renamed from: d  reason: collision with root package name */
    private static final String f20364d = "getDeviceData";

    /* renamed from: e  reason: collision with root package name */
    private static final String f20365e = "deviceDataFunction";

    /* renamed from: f  reason: collision with root package name */
    private static final String f20366f = "deviceDataParams";

    /* renamed from: g  reason: collision with root package name */
    private static final String f20367g = "success";

    /* renamed from: h  reason: collision with root package name */
    private static final String f20368h = "fail";

    /* renamed from: a  reason: collision with root package name */
    private Context f20369a;

    /* renamed from: b  reason: collision with root package name */
    private final nf f20370b = mm.S().f();

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public static class b {

        /* renamed from: a  reason: collision with root package name */
        String f20371a;

        /* renamed from: b  reason: collision with root package name */
        JSONObject f20372b;

        /* renamed from: c  reason: collision with root package name */
        String f20373c;

        /* renamed from: d  reason: collision with root package name */
        String f20374d;

        private b() {
        }
    }

    public i(Context context) {
        this.f20369a = context;
    }

    private fr a() {
        fr frVar = new fr();
        frVar.b(SDKUtils.encodeString(b9.i.f16707i0), SDKUtils.encodeString(String.valueOf(this.f20370b.c())));
        frVar.b(SDKUtils.encodeString(b9.i.f16709j0), SDKUtils.encodeString(String.valueOf(this.f20370b.h(this.f20369a))));
        frVar.b(SDKUtils.encodeString(b9.i.f16711k0), SDKUtils.encodeString(String.valueOf(this.f20370b.J(this.f20369a))));
        frVar.b(SDKUtils.encodeString(b9.i.f16713l0), SDKUtils.encodeString(String.valueOf(this.f20370b.l(this.f20369a))));
        frVar.b(SDKUtils.encodeString(b9.i.f16715m0), SDKUtils.encodeString(String.valueOf(this.f20370b.c(this.f20369a))));
        frVar.b(SDKUtils.encodeString(b9.i.f16717n0), SDKUtils.encodeString(String.valueOf(this.f20370b.d(this.f20369a))));
        return frVar;
    }

    private b a(String str) throws JSONException {
        JSONObject jSONObject = new JSONObject(str);
        b bVar = new b();
        bVar.f20371a = jSONObject.optString(f20365e);
        bVar.f20372b = jSONObject.optJSONObject(f20366f);
        bVar.f20373c = jSONObject.optString("success");
        bVar.f20374d = jSONObject.optString("fail");
        return bVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(String str, rk rkVar) throws Exception {
        b a10 = a(str);
        if (f20364d.equals(a10.f20371a)) {
            rkVar.a(true, a10.f20373c, a());
            return;
        }
        String str2 = f20363c;
        Logger.i(str2, "unhandled API request " + str);
    }
}
