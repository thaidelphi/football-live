package com.ironsource.sdk.controller;

import android.content.Context;
import android.text.TextUtils;
import com.ironsource.bh;
import com.ironsource.fr;
import com.ironsource.jw;
import com.ironsource.o9;
import com.ironsource.rk;
import com.ironsource.uv;
import com.ironsource.wg;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class a implements wg {

    /* renamed from: d  reason: collision with root package name */
    private static final String f20214d = "loadWithUrl";

    /* renamed from: e  reason: collision with root package name */
    private static final String f20215e = "sendMessage";

    /* renamed from: f  reason: collision with root package name */
    public static final String f20216f = "removeAdView";

    /* renamed from: g  reason: collision with root package name */
    public static final String f20217g = "webviewAction";

    /* renamed from: h  reason: collision with root package name */
    public static final String f20218h = "handleGetViewVisibility";

    /* renamed from: i  reason: collision with root package name */
    private static final String f20219i = "functionName";

    /* renamed from: j  reason: collision with root package name */
    private static final String f20220j = "functionParams";

    /* renamed from: k  reason: collision with root package name */
    private static final String f20221k = "success";

    /* renamed from: l  reason: collision with root package name */
    private static final String f20222l = "fail";

    /* renamed from: m  reason: collision with root package name */
    public static final String f20223m = "errMsg";

    /* renamed from: n  reason: collision with root package name */
    private static final String f20224n = "%s | unsupported AdViews API";

    /* renamed from: a  reason: collision with root package name */
    private jw f20225a;

    /* renamed from: b  reason: collision with root package name */
    private bh f20226b = bh.a();

    /* renamed from: c  reason: collision with root package name */
    private Context f20227c;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public static class b {

        /* renamed from: a  reason: collision with root package name */
        String f20228a;

        /* renamed from: b  reason: collision with root package name */
        JSONObject f20229b;

        /* renamed from: c  reason: collision with root package name */
        String f20230c;

        /* renamed from: d  reason: collision with root package name */
        String f20231d;

        private b() {
        }
    }

    public a(Context context) {
        this.f20227c = context;
    }

    private b a(String str) throws JSONException {
        JSONObject jSONObject = new JSONObject(str);
        b bVar = new b();
        bVar.f20228a = jSONObject.optString("functionName");
        bVar.f20229b = jSONObject.optJSONObject("functionParams");
        bVar.f20230c = jSONObject.optString("success");
        bVar.f20231d = jSONObject.optString("fail");
        return bVar;
    }

    public void a(jw jwVar) {
        this.f20225a = jwVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(String str, rk rkVar) throws Exception {
        b a10 = a(str);
        fr frVar = new fr();
        try {
            String str2 = a10.f20228a;
            char c10 = 65535;
            switch (str2.hashCode()) {
                case -1384357108:
                    if (str2.equals(f20216f)) {
                        c10 = 2;
                        break;
                    }
                    break;
                case 691453791:
                    if (str2.equals("sendMessage")) {
                        c10 = 1;
                        break;
                    }
                    break;
                case 842351363:
                    if (str2.equals("loadWithUrl")) {
                        c10 = 0;
                        break;
                    }
                    break;
                case 1182065477:
                    if (str2.equals("handleGetViewVisibility")) {
                        c10 = 3;
                        break;
                    }
                    break;
                case 1491535759:
                    if (str2.equals(f20217g)) {
                        c10 = 4;
                        break;
                    }
                    break;
            }
            if (c10 == 0) {
                this.f20226b.a(this, a10.f20229b, this.f20227c, a10.f20230c, a10.f20231d);
            } else if (c10 == 1) {
                this.f20226b.d(a10.f20229b, a10.f20230c, a10.f20231d);
            } else if (c10 == 2) {
                this.f20226b.c(a10.f20229b, a10.f20230c, a10.f20231d);
            } else if (c10 == 3) {
                this.f20226b.a(a10.f20229b, a10.f20230c, a10.f20231d);
            } else if (c10 != 4) {
                throw new IllegalArgumentException(String.format(f20224n, a10.f20228a));
            } else {
                this.f20226b.b(a10.f20229b, a10.f20230c, a10.f20231d);
            }
        } catch (Exception e8) {
            o9.d().a(e8);
            frVar.b("errMsg", e8.getMessage());
            String c11 = this.f20226b.c(a10.f20229b);
            if (!TextUtils.isEmpty(c11)) {
                frVar.b("adViewId", c11);
            }
            rkVar.a(false, a10.f20231d, frVar);
        }
    }

    @Override // com.ironsource.wg
    public void a(String str, String str2, String str3) {
        a(str, uv.a(str2, str3));
    }

    @Override // com.ironsource.wg
    public void a(String str, JSONObject jSONObject) {
        if (this.f20225a == null || TextUtils.isEmpty(str)) {
            return;
        }
        this.f20225a.a(str, jSONObject);
    }
}
