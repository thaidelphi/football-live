package com.applovin.impl;

import com.applovin.impl.n0;
import com.applovin.impl.sdk.utils.JsonUtils;
import java.util.Map;
import org.json.JSONObject;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public abstract class h6 extends j6 {
    /* JADX INFO: Access modifiers changed from: protected */
    public h6(String str, com.applovin.impl.sdk.j jVar) {
        super(str, jVar);
    }

    private JSONObject a(e4 e4Var) {
        JSONObject e8 = e();
        JsonUtils.putString(e8, "result", e4Var.b());
        Map a10 = e4Var.a();
        if (a10 != null) {
            JsonUtils.putJSONObject(e8, "params", new JSONObject(a10));
        }
        return e8;
    }

    protected abstract void b(JSONObject jSONObject);

    @Override // com.applovin.impl.j6
    protected int g() {
        return ((Integer) this.f9827a.a(o4.f8108f1)).intValue();
    }

    protected abstract e4 h();

    protected abstract void i();

    @Override // java.lang.Runnable
    public void run() {
        e4 h10 = h();
        if (h10 != null) {
            if (com.applovin.impl.sdk.n.a()) {
                com.applovin.impl.sdk.n nVar = this.f9829c;
                String str = this.f9828b;
                nVar.a(str, "Reporting pending reward: " + h10 + "...");
            }
            a(a(h10), new a());
            return;
        }
        if (com.applovin.impl.sdk.n.a()) {
            this.f9829c.b(this.f9828b, "Pending reward not found");
        }
        i();
    }

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    class a implements n0.e {
        a() {
        }

        @Override // com.applovin.impl.n0.e
        public void a(String str, JSONObject jSONObject, int i10) {
            h6.this.b(jSONObject);
        }

        @Override // com.applovin.impl.n0.e
        public void a(String str, int i10, String str2, JSONObject jSONObject) {
            h6.this.a(i10);
        }
    }
}
