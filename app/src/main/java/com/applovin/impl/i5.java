package com.applovin.impl;

import com.applovin.impl.l4;
import com.applovin.impl.sdk.AppLovinError;
import com.applovin.impl.sdk.network.a;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.mediation.adapter.MaxAdapterError;
import com.applovin.sdk.AppLovinWebViewActivity;
import com.ironsource.in;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public abstract class i5 extends z4 {

    /* renamed from: g  reason: collision with root package name */
    protected final q f7227g;

    /* renamed from: h  reason: collision with root package name */
    private final String f7228h;

    public i5(q qVar, String str, com.applovin.impl.sdk.j jVar) {
        super(str, jVar);
        this.f7227g = qVar;
        this.f7228h = jVar.b();
    }

    private Map g() {
        HashMap hashMap = new HashMap(3);
        hashMap.put("AppLovin-Zone-Id", this.f7227g.e());
        if (this.f7227g.f() != null) {
            hashMap.put("AppLovin-Ad-Size", this.f7227g.f().getLabel());
        }
        if (this.f7227g.g() != null) {
            hashMap.put("AppLovin-Ad-Type", this.f7227g.g().getLabel());
        }
        return hashMap;
    }

    protected abstract z4 a(JSONObject jSONObject);

    /* JADX INFO: Access modifiers changed from: protected */
    public void a(int i10, String str) {
        if (com.applovin.impl.sdk.n.a()) {
            com.applovin.impl.sdk.n nVar = this.f9829c;
            String str2 = this.f9828b;
            nVar.b(str2, "Unable to fetch " + this.f7227g + " ad: server returned " + i10);
        }
        if (i10 == -800) {
            this.f9827a.C().c(v1.f9439m);
        }
        this.f9827a.D().a(y1.f9674k, this.f7227g, new AppLovinError(i10, str));
    }

    protected void b(JSONObject jSONObject) {
        o0.c(jSONObject, this.f9827a);
        o0.b(jSONObject, this.f9827a);
        o0.a(jSONObject, this.f9827a);
        q.a(jSONObject);
        this.f9827a.i0().a(a(jSONObject));
    }

    protected abstract String e();

    protected abstract String f();

    protected Map h() {
        HashMap hashMap = new HashMap(4);
        hashMap.put("zone_id", this.f7227g.e());
        if (this.f7227g.f() != null) {
            hashMap.put("size", this.f7227g.f().getLabel());
        }
        if (this.f7227g.g() != null) {
            hashMap.put("require", this.f7227g.g().getLabel());
        }
        return hashMap;
    }

    @Override // java.lang.Runnable
    public void run() {
        l4.a a10;
        Map map;
        if (com.applovin.impl.sdk.n.a()) {
            com.applovin.impl.sdk.n nVar = this.f9829c;
            String str = this.f9828b;
            nVar.a(str, "Fetching next ad of zone: " + this.f7227g);
        }
        if (((Boolean) this.f9827a.a(o4.R3)).booleanValue() && d7.j() && com.applovin.impl.sdk.n.a()) {
            this.f9829c.a(this.f9828b, "User is connected to a VPN");
        }
        d7.a(this.f9827a, this.f9828b);
        JSONObject jSONObject = null;
        this.f9827a.D().a(y1.f9670i, this.f7227g, (AppLovinError) null);
        w1 C = this.f9827a.C();
        C.c(v1.f9430d);
        v1 v1Var = v1.f9433g;
        if (C.b(v1Var) == 0) {
            C.b(v1Var, System.currentTimeMillis());
        }
        try {
            JSONObject andResetCustomPostBody = this.f9827a.j().getAndResetCustomPostBody();
            boolean booleanValue = ((Boolean) this.f9827a.a(o4.f8134i3)).booleanValue();
            String str2 = in.f17849b;
            if (booleanValue) {
                l4.a a11 = l4.a.a(((Integer) this.f9827a.a(o4.f8073a5)).intValue());
                JSONObject jSONObject2 = new JSONObject(this.f9827a.x().a(h(), false, true));
                map = new HashMap();
                if (!((Boolean) this.f9827a.a(o4.f8144j5)).booleanValue() && !((Boolean) this.f9827a.a(o4.f8112f5)).booleanValue()) {
                    map.put("rid", UUID.randomUUID().toString());
                }
                if (!((Boolean) this.f9827a.a(o4.S4)).booleanValue()) {
                    map.put(AppLovinWebViewActivity.INTENT_EXTRA_KEY_SDK_KEY, this.f9827a.a0());
                }
                JsonUtils.putAll(jSONObject2, andResetCustomPostBody);
                a10 = a11;
                jSONObject = jSONObject2;
            } else {
                a10 = l4.a.a(((Integer) this.f9827a.a(o4.f8080b5)).intValue());
                Map a12 = d7.a(this.f9827a.x().a(h(), false, false));
                if (andResetCustomPostBody != null) {
                    jSONObject = andResetCustomPostBody;
                } else {
                    str2 = in.f17848a;
                }
                map = a12;
            }
            if (d7.f(a()) || d7.h(a())) {
                map.putAll(this.f9827a.j().getAndResetCustomQueryParams());
            }
            if (StringUtils.isValidString(this.f7228h)) {
                map.put("sts", this.f7228h);
            }
            a(C);
            a.C0138a f10 = com.applovin.impl.sdk.network.a.a(this.f9827a).b(f()).a(e()).b(map).c(str2).a(g()).a((Object) new JSONObject()).a(((Integer) this.f9827a.a(o4.X2)).intValue()).c(((Boolean) this.f9827a.a(o4.Y2)).booleanValue()).d(((Boolean) this.f9827a.a(o4.Z2)).booleanValue()).c(((Integer) this.f9827a.a(o4.W2)).intValue()).a(a10).f(true);
            if (jSONObject != null) {
                f10.a(jSONObject);
                f10.b(((Boolean) this.f9827a.a(o4.f8224t5)).booleanValue());
            }
            a aVar = new a(f10.a(), this.f9827a);
            aVar.c(o4.f8219t0);
            aVar.b(o4.f8227u0);
            this.f9827a.i0().a(aVar);
        } catch (Throwable th) {
            if (com.applovin.impl.sdk.n.a()) {
                com.applovin.impl.sdk.n nVar2 = this.f9829c;
                String str3 = this.f9828b;
                nVar2.a(str3, "Unable to fetch ad for zone id: " + this.f7227g, th);
            }
            a(0, th.getMessage());
        }
    }

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    class a extends e6 {
        a(com.applovin.impl.sdk.network.a aVar, com.applovin.impl.sdk.j jVar) {
            super(aVar, jVar);
        }

        @Override // com.applovin.impl.e6, com.applovin.impl.n0.e
        public void a(String str, JSONObject jSONObject, int i10) {
            if (i10 == 200) {
                JsonUtils.putLong(jSONObject, "ad_fetch_latency_millis", this.f6886l.a());
                JsonUtils.putLong(jSONObject, "ad_fetch_response_size", this.f6886l.b());
                HashMap hashMap = new HashMap(5);
                CollectionUtils.putStringIfValid("url", StringUtils.getHost(str), hashMap);
                CollectionUtils.putStringIfValid("code", String.valueOf(i10), hashMap);
                CollectionUtils.putStringIfValid("ad_zone_id", i5.this.f7227g.e(), hashMap);
                CollectionUtils.putStringIfValid("latency_ms", String.valueOf(this.f6886l.a()), hashMap);
                CollectionUtils.putStringIfValid("response_size", String.valueOf(this.f6886l.b()), hashMap);
                this.f9827a.D().d(y1.f9672j, hashMap);
                i5.this.b(jSONObject);
                return;
            }
            i5.this.a(i10, MaxAdapterError.NO_FILL.getErrorMessage());
        }

        @Override // com.applovin.impl.e6, com.applovin.impl.n0.e
        public void a(String str, int i10, String str2, JSONObject jSONObject) {
            i5.this.a(i10, str2);
            this.f9827a.D().a("fetchAd", str, i10, str2);
        }
    }

    private void a(w1 w1Var) {
        v1 v1Var = v1.f9433g;
        long b10 = w1Var.b(v1Var);
        long currentTimeMillis = System.currentTimeMillis();
        if (currentTimeMillis - b10 > TimeUnit.MINUTES.toMillis(((Integer) this.f9827a.a(o4.f8222t3)).intValue())) {
            w1Var.b(v1Var, currentTimeMillis);
            w1Var.a(v1.f9434h);
            w1Var.a(v1.f9435i);
        }
    }
}
