package com.applovin.impl;

import com.applovin.impl.n0;
import com.applovin.impl.sdk.utils.JsonUtils;
import java.util.Collections;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public abstract class n6 extends j6 {
    /* JADX INFO: Access modifiers changed from: protected */
    public n6(String str, com.applovin.impl.sdk.j jVar) {
        super(str, jVar);
    }

    private e4 b(JSONObject jSONObject) {
        Map<String, String> emptyMap;
        String str;
        JSONObject jSONObject2 = JsonUtils.getJSONObject(JsonUtils.getJSONArray(jSONObject, "results", new JSONArray()), 0, new JSONObject());
        o0.c(jSONObject2, this.f9827a);
        o0.b(jSONObject, this.f9827a);
        o0.a(jSONObject, this.f9827a);
        try {
            emptyMap = JsonUtils.toStringMap((JSONObject) jSONObject2.get("params"));
        } catch (Throwable unused) {
            emptyMap = Collections.emptyMap();
        }
        try {
            str = jSONObject2.getString("result");
        } catch (Throwable unused2) {
            str = "network_timeout";
        }
        return e4.a(str, emptyMap);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(JSONObject jSONObject) {
        e4 b10 = b(jSONObject);
        a(b10);
        if (com.applovin.impl.sdk.n.a()) {
            com.applovin.impl.sdk.n nVar = this.f9829c;
            String str = this.f9828b;
            nVar.a(str, "Pending reward handled: " + b10);
        }
    }

    protected abstract void a(e4 e4Var);

    @Override // com.applovin.impl.j6
    protected int g() {
        return ((Integer) this.f9827a.a(o4.f8100e1)).intValue();
    }

    protected abstract boolean h();

    @Override // java.lang.Runnable
    public void run() {
        a(e(), new a());
    }

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    class a implements n0.e {
        a() {
        }

        @Override // com.applovin.impl.n0.e
        public void a(String str, JSONObject jSONObject, int i10) {
            if (n6.this.h()) {
                com.applovin.impl.sdk.n nVar = n6.this.f9829c;
                if (com.applovin.impl.sdk.n.a()) {
                    n6 n6Var = n6.this;
                    com.applovin.impl.sdk.n nVar2 = n6Var.f9829c;
                    String str2 = n6Var.f9828b;
                    nVar2.b(str2, "Reward validation succeeded with code " + i10 + " but task was cancelled already");
                }
                com.applovin.impl.sdk.n nVar3 = n6.this.f9829c;
                if (com.applovin.impl.sdk.n.a()) {
                    n6 n6Var2 = n6.this;
                    com.applovin.impl.sdk.n nVar4 = n6Var2.f9829c;
                    String str3 = n6Var2.f9828b;
                    nVar4.b(str3, "Response: " + jSONObject);
                    return;
                }
                return;
            }
            com.applovin.impl.sdk.n nVar5 = n6.this.f9829c;
            if (com.applovin.impl.sdk.n.a()) {
                n6 n6Var3 = n6.this;
                com.applovin.impl.sdk.n nVar6 = n6Var3.f9829c;
                String str4 = n6Var3.f9828b;
                nVar6.a(str4, "Reward validation succeeded with code " + i10 + " and response: " + jSONObject);
            }
            n6.this.c(jSONObject);
        }

        @Override // com.applovin.impl.n0.e
        public void a(String str, int i10, String str2, JSONObject jSONObject) {
            if (n6.this.h()) {
                com.applovin.impl.sdk.n nVar = n6.this.f9829c;
                if (com.applovin.impl.sdk.n.a()) {
                    n6 n6Var = n6.this;
                    com.applovin.impl.sdk.n nVar2 = n6Var.f9829c;
                    String str3 = n6Var.f9828b;
                    nVar2.b(str3, "Reward validation failed with error code " + i10 + " but task was cancelled already");
                    return;
                }
                return;
            }
            com.applovin.impl.sdk.n nVar3 = n6.this.f9829c;
            if (com.applovin.impl.sdk.n.a()) {
                n6 n6Var2 = n6.this;
                com.applovin.impl.sdk.n nVar4 = n6Var2.f9829c;
                String str4 = n6Var2.f9828b;
                nVar4.b(str4, "Reward validation failed with code " + i10 + " and error: " + str2);
            }
            n6.this.a(i10);
        }
    }
}
