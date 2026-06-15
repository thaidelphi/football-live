package com.applovin.impl;

import com.applovin.impl.l4;
import com.applovin.impl.n0;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.ironsource.in;
import java.util.Map;
import org.json.JSONObject;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public abstract class j6 extends z4 {
    /* JADX INFO: Access modifiers changed from: protected */
    public j6(String str, com.applovin.impl.sdk.j jVar) {
        super(str, jVar);
    }

    protected abstract void a(JSONObject jSONObject);

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(JSONObject jSONObject, n0.e eVar) {
        Map c10 = o0.c(this.f9827a);
        if (((Boolean) this.f9827a.a(o4.f8168m5)).booleanValue() || ((Boolean) this.f9827a.a(o4.f8112f5)).booleanValue()) {
            JsonUtils.putAll(jSONObject, c10);
            c10 = null;
        }
        a aVar = new a(com.applovin.impl.sdk.network.a.a(this.f9827a).b(o0.b(f(), this.f9827a)).a(o0.a(f(), this.f9827a)).b(c10).a(jSONObject).c(in.f17849b).b(((Boolean) this.f9827a.a(o4.f8240v5)).booleanValue()).a((Object) new JSONObject()).a(g()).a(l4.a.a(((Integer) this.f9827a.a(o4.f8104e5)).intValue())).a(), this.f9827a, eVar);
        aVar.c(o4.f8235v0);
        aVar.b(o4.f8243w0);
        this.f9827a.i0().a(aVar);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public JSONObject e() {
        JSONObject jSONObject = new JSONObject();
        String c10 = this.f9827a.o0().c();
        if (((Boolean) this.f9827a.a(o4.B3)).booleanValue() && StringUtils.isValidString(c10)) {
            JsonUtils.putString(jSONObject, "cuid", c10);
        }
        if (((Boolean) this.f9827a.a(o4.D3)).booleanValue()) {
            JsonUtils.putString(jSONObject, "compass_random_token", this.f9827a.r());
        }
        if (((Boolean) this.f9827a.a(o4.F3)).booleanValue()) {
            JsonUtils.putString(jSONObject, "applovin_random_token", this.f9827a.Z());
        }
        a(jSONObject);
        return jSONObject;
    }

    protected abstract String f();

    protected abstract int g();

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    class a extends e6 {

        /* renamed from: m  reason: collision with root package name */
        final /* synthetic */ n0.e f7337m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(com.applovin.impl.sdk.network.a aVar, com.applovin.impl.sdk.j jVar, n0.e eVar) {
            super(aVar, jVar);
            this.f7337m = eVar;
        }

        @Override // com.applovin.impl.e6, com.applovin.impl.n0.e
        public void a(String str, JSONObject jSONObject, int i10) {
            this.f7337m.a(str, jSONObject, i10);
        }

        @Override // com.applovin.impl.e6, com.applovin.impl.n0.e
        public void a(String str, int i10, String str2, JSONObject jSONObject) {
            this.f7337m.a(str, i10, str2, jSONObject);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void a(int i10) {
        o0.a(i10, this.f9827a);
    }
}
