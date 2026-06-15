package com.applovin.impl;

import com.applovin.impl.l4;
import com.applovin.impl.n0;
import com.applovin.impl.r;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.sdk.AppLovinSdk;
import com.applovin.sdk.AppLovinWebViewActivity;
import com.ironsource.b9;
import com.ironsource.in;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class n5 extends z4 {

    /* renamed from: g  reason: collision with root package name */
    private final n0.e f8019g;

    public n5(n0.e eVar, com.applovin.impl.sdk.j jVar) {
        super("TaskFetchMediationDebuggerInfo", jVar, true);
        this.f8019g = eVar;
    }

    private JSONObject e() {
        JSONObject jSONObject = new JSONObject();
        JsonUtils.putJsonArrayIfValid(jSONObject, "installed_mediation_adapters", o3.a(this.f9827a));
        r.a f10 = this.f9827a.x().f();
        JsonUtils.putStringIfValid(jSONObject, "dnt_code", f10.b().b());
        JsonUtils.putStringIfValid(jSONObject, "idfa", f10.a());
        return jSONObject;
    }

    protected Map f() {
        HashMap hashMap = new HashMap();
        hashMap.put("sdk_version", AppLovinSdk.VERSION);
        if (!((Boolean) this.f9827a.a(o4.S4)).booleanValue()) {
            hashMap.put(AppLovinWebViewActivity.INTENT_EXTRA_KEY_SDK_KEY, this.f9827a.a0());
        }
        Map B = this.f9827a.x().B();
        hashMap.put(b9.h.V, String.valueOf(B.get(b9.h.V)));
        hashMap.put("app_version", String.valueOf(B.get("app_version")));
        Map H = this.f9827a.x().H();
        hashMap.put(com.ironsource.fe.G, String.valueOf(H.get(com.ironsource.fe.G)));
        hashMap.put(com.ironsource.fe.E, String.valueOf(H.get(com.ironsource.fe.E)));
        return hashMap;
    }

    @Override // java.lang.Runnable
    public void run() {
        Map f10 = f();
        JSONObject e8 = e();
        if (((Boolean) this.f9827a.a(o4.f8136i5)).booleanValue() || ((Boolean) this.f9827a.a(o4.f8112f5)).booleanValue()) {
            JsonUtils.putAll(e8, f10);
            f10 = null;
        }
        a aVar = new a(com.applovin.impl.sdk.network.a.a(this.f9827a).c(in.f17849b).b(e3.i(this.f9827a)).a(e3.h(this.f9827a)).b(f10).a(e8).a((Object) new JSONObject()).c(((Long) this.f9827a.a(j3.I6)).intValue()).a(l4.a.a(((Integer) this.f9827a.a(o4.Z4)).intValue())).a(), this.f9827a, d());
        aVar.c(j3.E6);
        aVar.b(j3.F6);
        this.f9827a.i0().a(aVar);
    }

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    class a extends e6 {
        a(com.applovin.impl.sdk.network.a aVar, com.applovin.impl.sdk.j jVar, boolean z10) {
            super(aVar, jVar, z10);
        }

        @Override // com.applovin.impl.e6, com.applovin.impl.n0.e
        public void a(String str, JSONObject jSONObject, int i10) {
            n5.this.f8019g.a(str, jSONObject, i10);
        }

        @Override // com.applovin.impl.e6, com.applovin.impl.n0.e
        public void a(String str, int i10, String str2, JSONObject jSONObject) {
            n5.this.f8019g.a(str, i10, str2, jSONObject);
        }
    }
}
