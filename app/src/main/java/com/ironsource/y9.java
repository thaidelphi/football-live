package com.ironsource;

import android.content.Context;
import android.text.TextUtils;
import com.ironsource.b9;
import com.ironsource.sdk.utils.Logger;
import com.ironsource.xn;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public class y9 {

    /* renamed from: c  reason: collision with root package name */
    private static final String f21507c = "y9";

    /* renamed from: d  reason: collision with root package name */
    private static final String f21508d = "setSharedSignal";

    /* renamed from: e  reason: collision with root package name */
    private static final String f21509e = "getSharedSignal";

    /* renamed from: f  reason: collision with root package name */
    private static final String f21510f = "functionName";

    /* renamed from: g  reason: collision with root package name */
    private static final String f21511g = "functionParams";

    /* renamed from: h  reason: collision with root package name */
    private static final String f21512h = "success";

    /* renamed from: i  reason: collision with root package name */
    private static final String f21513i = "fail";

    /* renamed from: a  reason: collision with root package name */
    private final Context f21514a;

    /* renamed from: b  reason: collision with root package name */
    x9 f21515b;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        String f21516a;

        /* renamed from: b  reason: collision with root package name */
        JSONObject f21517b;

        /* renamed from: c  reason: collision with root package name */
        String f21518c;

        /* renamed from: d  reason: collision with root package name */
        String f21519d;

        private a() {
        }

        public static a a(JSONObject jSONObject) {
            a aVar = new a();
            aVar.f21516a = jSONObject.optString("functionName");
            aVar.f21517b = jSONObject.optJSONObject("functionParams");
            aVar.f21518c = jSONObject.optString("success");
            aVar.f21519d = jSONObject.optString("fail");
            return aVar;
        }
    }

    public y9(Context context, x9 x9Var) {
        this.f21514a = context;
        this.f21515b = x9Var;
    }

    private a a(String str) throws JSONException {
        return a.a(new JSONObject(str));
    }

    private void a(Context context, a aVar, rk rkVar) {
        fr frVar = new fr();
        JSONObject jSONObject = aVar.f21517b;
        frVar.b("data", this.f21515b.a(context, w9.a(jSONObject.optString("source")), jSONObject.optString(b9.h.W)));
        rkVar.a(true, aVar.f21518c, frVar);
    }

    private void a(a aVar, rk rkVar, Exception exc) {
        o9.d().a(exc);
        String message = exc.getMessage();
        String str = f21507c;
        Logger.i(str, aVar.f21516a + " exception " + message);
        fr frVar = new fr();
        if (TextUtils.isEmpty(message)) {
            message = "Unknown error";
        }
        frVar.b(xn.a.f21422g, message);
        rkVar.a(false, aVar.f21519d, frVar);
    }

    private void b(Context context, a aVar, rk rkVar) {
        fr frVar = new fr();
        JSONObject jSONObject = aVar.f21517b;
        this.f21515b.a(context, w9.a(jSONObject.optString("source")), jSONObject.optString(b9.h.W), jSONObject.optString("data"));
        rkVar.a(true, aVar.f21518c, frVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x002c, code lost:
        if (r2 != 1) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x002e, code lost:
        a(r6.f21514a, r0, r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x004a, code lost:
        throw new java.lang.UnsupportedOperationException("unsupported API: " + r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:?, code lost:
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void a(java.lang.String r7, com.ironsource.rk r8) throws java.lang.Exception {
        /*
            r6 = this;
            com.ironsource.y9$a r0 = r6.a(r7)
            java.lang.String r1 = r0.f21516a     // Catch: java.lang.Exception -> L51
            r2 = -1
            int r3 = r1.hashCode()     // Catch: java.lang.Exception -> L51
            r4 = 576059875(0x2255f9e3, float:2.8999172E-18)
            r5 = 1
            if (r3 == r4) goto L21
            r4 = 1486812399(0x589ef4ef, float:1.39819855E15)
            if (r3 == r4) goto L17
            goto L2a
        L17:
            java.lang.String r3 = "setSharedSignal"
            boolean r1 = r1.equals(r3)     // Catch: java.lang.Exception -> L51
            if (r1 == 0) goto L2a
            r2 = 0
            goto L2a
        L21:
            java.lang.String r3 = "getSharedSignal"
            boolean r1 = r1.equals(r3)     // Catch: java.lang.Exception -> L51
            if (r1 == 0) goto L2a
            r2 = r5
        L2a:
            if (r2 == 0) goto L4b
            if (r2 != r5) goto L34
            android.content.Context r7 = r6.f21514a     // Catch: java.lang.Exception -> L51
            r6.a(r7, r0, r8)     // Catch: java.lang.Exception -> L51
            goto L55
        L34:
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException     // Catch: java.lang.Exception -> L51
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L51
            r2.<init>()     // Catch: java.lang.Exception -> L51
            java.lang.String r3 = "unsupported API: "
            r2.append(r3)     // Catch: java.lang.Exception -> L51
            r2.append(r7)     // Catch: java.lang.Exception -> L51
            java.lang.String r7 = r2.toString()     // Catch: java.lang.Exception -> L51
            r1.<init>(r7)     // Catch: java.lang.Exception -> L51
            throw r1     // Catch: java.lang.Exception -> L51
        L4b:
            android.content.Context r7 = r6.f21514a     // Catch: java.lang.Exception -> L51
            r6.b(r7, r0, r8)     // Catch: java.lang.Exception -> L51
            goto L55
        L51:
            r7 = move-exception
            r6.a(r0, r8, r7)
        L55:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.y9.a(java.lang.String, com.ironsource.rk):void");
    }
}
