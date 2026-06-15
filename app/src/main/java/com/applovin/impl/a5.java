package com.applovin.impl;

import com.applovin.impl.l4;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.ironsource.in;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class a5 extends z4 {
    /* JADX INFO: Access modifiers changed from: package-private */
    public a5(com.applovin.impl.sdk.j jVar) {
        super("TaskApiSubmitData", jVar);
    }

    private void b(JSONObject jSONObject) {
        if (((Boolean) this.f9827a.a(o4.f8223t4)).booleanValue()) {
            JsonUtils.putJSONObjectIfValid(jSONObject, "stats", this.f9827a.C().c());
        }
    }

    private void c(JSONObject jSONObject) {
        com.applovin.impl.sdk.k x10 = this.f9827a.x();
        Map m7 = x10.m();
        d7.a(com.ironsource.fe.G, "type", m7);
        d7.a("api_level", "sdk_version", m7);
        JsonUtils.putObject(jSONObject, "device_info", new JSONObject(m7));
        Map B = x10.B();
        d7.a("sdk_version", "applovin_sdk_version", B);
        d7.a("ia", "installed_at", B);
        JsonUtils.putObject(jSONObject, "app_info", new JSONObject(B));
    }

    @Override // java.lang.Runnable
    public void run() {
        if (com.applovin.impl.sdk.n.a()) {
            this.f9829c.d(this.f9828b, "Submitting user data...");
        }
        Map c10 = o0.c(this.f9827a);
        JSONObject jSONObject = new JSONObject();
        c(jSONObject);
        b(jSONObject);
        if (((Boolean) this.f9827a.a(o4.f8160l5)).booleanValue() || ((Boolean) this.f9827a.a(o4.f8112f5)).booleanValue()) {
            JsonUtils.putAll(jSONObject, c10);
            c10 = null;
        }
        a(c10, jSONObject);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public class a extends e6 {
        a(com.applovin.impl.sdk.network.a aVar, com.applovin.impl.sdk.j jVar) {
            super(aVar, jVar);
        }

        @Override // com.applovin.impl.e6, com.applovin.impl.n0.e
        public void a(String str, JSONObject jSONObject, int i10) {
            a5.this.a(jSONObject);
        }

        @Override // com.applovin.impl.e6, com.applovin.impl.n0.e
        public void a(String str, int i10, String str2, JSONObject jSONObject) {
            o0.a(i10, this.f9827a);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(JSONObject jSONObject) {
        JSONObject jSONObject2 = JsonUtils.getJSONObject(JsonUtils.getJSONArray(jSONObject, "results", new JSONArray()), 0, new JSONObject());
        this.f9827a.g0().a(o4.f8106f, JsonUtils.getString(jSONObject2, "device_id", ""));
        this.f9827a.g0().a(o4.f8138j, JsonUtils.getString(jSONObject2, "device_token", ""));
        o0.a(jSONObject2, this.f9827a);
        this.f9827a.C().b();
    }

    private void a(Map map, JSONObject jSONObject) {
        a aVar = new a(com.applovin.impl.sdk.network.a.a(this.f9827a).b(o0.b("2.0/device", this.f9827a)).a(o0.a("2.0/device", this.f9827a)).b(map).a(jSONObject).c(in.f17849b).b(((Boolean) this.f9827a.a(o4.f8216s5)).booleanValue()).a((Object) new JSONObject()).a(((Integer) this.f9827a.a(o4.f8071a3)).intValue()).a(l4.a.a(((Integer) this.f9827a.a(o4.f8096d5)).intValue())).a(), this.f9827a);
        aVar.c(o4.f8235v0);
        aVar.b(o4.f8243w0);
        this.f9827a.i0().a(aVar);
    }
}
