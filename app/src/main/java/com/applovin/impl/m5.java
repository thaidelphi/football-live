package com.applovin.impl;

import android.content.Context;
import com.applovin.impl.l3;
import com.applovin.impl.l4;
import com.applovin.impl.mediation.MaxErrorImpl;
import com.applovin.impl.mediation.ads.a;
import com.applovin.impl.sdk.o;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.u5;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.mediation.MaxError;
import com.applovin.mediation.adapter.MaxAdapterError;
import com.applovin.sdk.AppLovinWebViewActivity;
import com.ironsource.in;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONObject;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class m5 extends z4 {

    /* renamed from: g  reason: collision with root package name */
    private final String f7501g;

    /* renamed from: h  reason: collision with root package name */
    private final MaxAdFormat f7502h;

    /* renamed from: i  reason: collision with root package name */
    private final Map f7503i;

    /* renamed from: j  reason: collision with root package name */
    private final Map f7504j;

    /* renamed from: k  reason: collision with root package name */
    private final Map f7505k;

    /* renamed from: l  reason: collision with root package name */
    private final JSONArray f7506l;

    /* renamed from: m  reason: collision with root package name */
    private final Context f7507m;

    /* renamed from: n  reason: collision with root package name */
    private final a.InterfaceC0126a f7508n;

    public m5(String str, MaxAdFormat maxAdFormat, Map map, Map map2, Map map3, JSONArray jSONArray, Context context, com.applovin.impl.sdk.j jVar, a.InterfaceC0126a interfaceC0126a) {
        super("TaskFetchMediatedAd", jVar, str);
        this.f7501g = str;
        this.f7502h = maxAdFormat;
        this.f7503i = map;
        this.f7504j = map2;
        this.f7505k = map3;
        this.f7506l = jSONArray;
        this.f7507m = context;
        this.f7508n = interfaceC0126a;
    }

    private void c(JSONObject jSONObject) {
        JSONObject andResetCustomPostBodyData = this.f9827a.P().getAndResetCustomPostBodyData();
        if (andResetCustomPostBodyData == null || !d7.f(com.applovin.impl.sdk.j.m())) {
            return;
        }
        JsonUtils.putAll(jSONObject, andResetCustomPostBodyData);
    }

    private void d(JSONObject jSONObject) {
        if (((Boolean) this.f9827a.a(o4.f8231u4)).booleanValue()) {
            m3 Q = this.f9827a.Q();
            JSONObject jSONObject2 = new JSONObject();
            JSONObject jSONObject3 = new JSONObject();
            k3 k3Var = k3.f7391c;
            JsonUtils.putAll(jSONObject3, Q.a(k3Var, l3.a.AD_UNIT_ID));
            JsonUtils.putJSONObject(jSONObject2, "arpau", jSONObject3);
            JSONObject jSONObject4 = new JSONObject();
            JsonUtils.putAll(jSONObject4, Q.a(k3Var, l3.a.AD_FORMAT));
            JsonUtils.putJSONObject(jSONObject2, "arpaf", jSONObject4);
            JSONObject jSONObject5 = new JSONObject();
            JsonUtils.putAll(jSONObject5, Q.a(k3.f7392d, l3.a.AD));
            JsonUtils.putJSONObject(jSONObject2, "ttdasipa_ms", jSONObject5);
            JsonUtils.putJSONObject(jSONObject, "mediation_stats", jSONObject2);
        }
    }

    private String e() {
        return e3.a(this.f9827a);
    }

    private String f() {
        return e3.b(this.f9827a);
    }

    private JSONObject g() {
        Map a10 = this.f9827a.x().a(null, false, true);
        a10.putAll(this.f7505k);
        JSONObject jSONObject = new JSONObject(a10);
        e(jSONObject);
        h(jSONObject);
        f(jSONObject);
        c(jSONObject);
        g(jSONObject);
        d(jSONObject);
        return jSONObject;
    }

    private Map h() {
        HashMap hashMap = new HashMap(2);
        hashMap.put("AppLovin-Ad-Unit-Id", this.f7501g);
        hashMap.put("AppLovin-Ad-Format", this.f7502h.getLabel());
        CollectionUtils.putObjectToStringIfValid("AppLovin-Retry-Attempt", this.f7504j.get("retry_attempt"), hashMap);
        CollectionUtils.putObjectToStringIfValid("AppLovin-Retry-Delay-Sec", this.f7504j.get("retry_delay_sec"), hashMap);
        return hashMap;
    }

    @Override // java.lang.Runnable
    public void run() {
        if (com.applovin.impl.sdk.n.a()) {
            com.applovin.impl.sdk.n nVar = this.f9829c;
            String str = this.f9828b;
            nVar.a(str, "Fetching next ad for " + this.f7502h.getLabel() + " ad unit " + this.f7501g);
        }
        e2.a();
        if (((Boolean) this.f9827a.a(o4.R3)).booleanValue() && d7.j() && com.applovin.impl.sdk.n.a()) {
            this.f9829c.a(this.f9828b, "User is connected to a VPN");
        }
        this.f9827a.D().a(y1.N, this.f7502h, this.f7501g, (MaxError) null);
        if (((Boolean) this.f9827a.a(o4.f8231u4)).booleanValue()) {
            m3 Q = this.f9827a.Q();
            k3 k3Var = k3.f7391c;
            Q.a(k3Var, l3.a(this.f7501g));
            Q.a(k3Var, l3.a(this.f7502h));
        }
        d7.a(this.f9827a, this.f9828b);
        w1 C = this.f9827a.C();
        C.c(v1.f9445s);
        v1 v1Var = v1.f9433g;
        if (C.b(v1Var) == 0) {
            C.b(v1Var, System.currentTimeMillis());
        }
        try {
            JSONObject g10 = g();
            HashMap hashMap = new HashMap();
            if (!((Boolean) this.f9827a.a(o4.f8128h5)).booleanValue() && !((Boolean) this.f9827a.a(o4.f8112f5)).booleanValue()) {
                hashMap.put("rid", UUID.randomUUID().toString());
            }
            if (!((Boolean) this.f9827a.a(o4.S4)).booleanValue()) {
                hashMap.put(AppLovinWebViewActivity.INTENT_EXTRA_KEY_SDK_KEY, this.f9827a.a0());
            }
            if (this.f9827a.k0().c()) {
                hashMap.put("test_mode", "1");
            }
            List b10 = this.f9827a.k0().b();
            String str2 = this.f9827a.f0().getExtraParameters().get("fan");
            if (b10 != null && !b10.isEmpty()) {
                String a10 = wa.a(",", b10);
                hashMap.put("filter_ad_network", a10);
                if (!this.f9827a.k0().c()) {
                    hashMap.put("fhkZsVqYC7", "1");
                }
                if (this.f9827a.k0().d()) {
                    hashMap.put("force_ad_network", a10);
                }
            } else if (StringUtils.isValidString(str2)) {
                hashMap.put("filter_ad_network", str2);
            }
            a(C);
            a aVar = new a(com.applovin.impl.sdk.network.a.a(this.f9827a).c(in.f17849b).a(h()).b(f()).a(e()).b(hashMap).a(g10).b(((Boolean) this.f9827a.a(j3.K7)).booleanValue()).a((Object) new JSONObject()).c(((Long) this.f9827a.a(j3.H6)).intValue()).a(((Integer) this.f9827a.a(o4.X2)).intValue()).b(((Long) this.f9827a.a(j3.G6)).intValue()).a(l4.a.a(((Integer) this.f9827a.a(o4.Y4)).intValue())).f(true).a(), this.f9827a);
            aVar.c(j3.E6);
            aVar.b(j3.F6);
            this.f9827a.i0().a(aVar);
        } catch (Throwable th) {
            if (com.applovin.impl.sdk.n.a()) {
                com.applovin.impl.sdk.n nVar2 = this.f9829c;
                String str3 = this.f9828b;
                nVar2.a(str3, "Unable to fetch ad for Ad Unit ID: " + this.f7501g, th);
            }
            a("", 0, th.getMessage());
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
                HashMap hashMap = new HashMap(6);
                CollectionUtils.putStringIfValid("url", StringUtils.getHost(str), hashMap);
                CollectionUtils.putStringIfValid("code", String.valueOf(i10), hashMap);
                CollectionUtils.putStringIfValid("ad_unit_id", m5.this.f7501g, hashMap);
                CollectionUtils.putStringIfValid("ad_format", m5.this.f7502h.getLabel(), hashMap);
                CollectionUtils.putStringIfValid("latency_ms", String.valueOf(this.f6886l.a()), hashMap);
                CollectionUtils.putStringIfValid("response_size", String.valueOf(this.f6886l.b()), hashMap);
                this.f9827a.D().d(y1.O, hashMap);
                m5.this.b(jSONObject);
                return;
            }
            m5.this.a(str, i10, (String) null);
        }

        @Override // com.applovin.impl.e6, com.applovin.impl.n0.e
        public void a(String str, int i10, String str2, JSONObject jSONObject) {
            m5.this.a(str, i10, str2);
            this.f9827a.D().a("fetchMediatedAd", str, i10, str2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(JSONObject jSONObject) {
        try {
            o0.c(jSONObject, this.f9827a);
            o0.b(jSONObject, this.f9827a);
            o0.a(jSONObject, this.f9827a);
            e3.f(jSONObject, this.f9827a);
            e3.d(jSONObject, this.f9827a);
            e3.e(jSONObject, this.f9827a);
            e3.g(jSONObject, this.f9827a);
            v.b(this.f9827a);
            MaxAdFormat formatFromString = MaxAdFormat.formatFromString(JsonUtils.getString(jSONObject, "ad_format", null));
            if (this.f7502h == formatFromString) {
                a(jSONObject);
            } else if (formatFromString == null) {
                if (com.applovin.impl.sdk.n.a()) {
                    this.f9829c.b(this.f9828b, "Mediated ad response is missing the ad format field for ad unit " + this.f7501g);
                }
                if (jSONObject.has("ads")) {
                    HashMap hashMap = new HashMap(3);
                    CollectionUtils.putStringIfValid("details", "Missing ad format field", hashMap);
                    CollectionUtils.putStringIfValid("ad_unit_id", this.f7501g, hashMap);
                    CollectionUtils.putStringIfValid("mcode", JsonUtils.getString(jSONObject, "mcode", ""), hashMap);
                    this.f9827a.D().a(y1.f9693t0, this.f9828b, hashMap);
                }
                this.f7508n.onAdLoadFailed(this.f7501g, MaxAdapterError.NO_FILL);
            } else {
                String label = formatFromString.getLabel();
                String label2 = this.f7502h.getLabel();
                String str = "Incorrect format (" + label + ") loaded for (" + label2 + ") ad. Please verify if the ad unit ID (" + this.f7501g + ") is assigned to the correct ad format.";
                if (d7.a(this.f7502h, formatFromString)) {
                    com.applovin.impl.sdk.n.j(this.f9828b, str);
                    a(jSONObject);
                    return;
                }
                f1.a(str, new Object[0]);
                com.applovin.impl.sdk.n.h(this.f9828b, str);
                this.f7508n.onAdLoadFailed(this.f7501g, new MaxAdapterError(MaxAdapterError.INVALID_CONFIGURATION, 0, str));
                HashMap<String, String> hashMap2 = CollectionUtils.hashMap("ad_unit_id", this.f7501g);
                CollectionUtils.putStringIfValid("name", label2, hashMap2);
                CollectionUtils.putStringIfValid("details", label, hashMap2);
                this.f9827a.D().a(y1.f9677l0, "incompatible_ad_format", hashMap2);
            }
        } catch (Throwable th) {
            if (com.applovin.impl.sdk.n.a()) {
                this.f9829c.a(this.f9828b, "Unable to process mediated ad response for ad unit " + this.f7501g, th);
            }
            throw new RuntimeException("Unable to process ad: " + th);
        }
    }

    private void e(JSONObject jSONObject) {
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("ad_unit_id", this.f7501g);
        jSONObject2.put("ad_format", this.f7502h.getLabel());
        Map map = CollectionUtils.map(this.f7504j);
        com.applovin.impl.sdk.o S = this.f9827a.S();
        CollectionUtils.putStringIfValid("previous_request_id", S.b(this.f7501g), map);
        CollectionUtils.putStringIfValid("previous_loaded_request_id", S.a(this.f7501g), map);
        o.a c10 = S.c(this.f7501g);
        if (c10 != null) {
            if (Boolean.parseBoolean(this.f9827a.f0().getExtraParameters().get("esc"))) {
                map.put("previous_winning_network", "APPLOVIN_NETWORK");
                map.put("previous_winning_network_name", "AppLovin");
            } else {
                map.put("previous_winning_network", c10.a());
                map.put("previous_winning_network_name", c10.c());
                CollectionUtils.putStringIfValid("second_previous_winning_network", c10.d(), map);
                CollectionUtils.putStringIfValid("second_previous_winning_network_name", c10.e(), map);
            }
        }
        jSONObject2.put("extra_parameters", CollectionUtils.toJson(map));
        jSONObject.put("ad_info", jSONObject2);
    }

    private void f(JSONObject jSONObject) {
        try {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("disabled", new JSONArray(this.f9827a.L().a()));
            jSONObject2.put("installed", o3.a(this.f9827a));
            jSONObject2.put("initialized", this.f9827a.K().b());
            jSONObject2.put("initialized_classnames", new JSONArray((Collection) this.f9827a.K().a()));
            jSONObject2.put("loaded_classnames", new JSONArray(this.f9827a.L().c()));
            jSONObject2.put("failed_classnames", new JSONArray(this.f9827a.L().b()));
            jSONObject.put("adapters_info", jSONObject2);
        } catch (Exception e8) {
            if (com.applovin.impl.sdk.n.a()) {
                this.f9829c.a(this.f9828b, "Failed to populate adapter classNames", e8);
            }
            throw new RuntimeException("Failed to populate classNames: " + e8);
        }
    }

    private void a(JSONObject jSONObject) {
        z4 y5Var;
        if (this.f9827a.a(j3.f7323z7, this.f7502h)) {
            y5Var = new x5(this.f7501g, this.f7502h, this.f7503i, jSONObject, this.f7507m, this.f9827a, this.f7508n);
        } else {
            y5Var = new y5(this.f7501g, this.f7502h, this.f7503i, jSONObject, this.f7507m, this.f9827a, this.f7508n);
        }
        z4 z4Var = y5Var;
        long j10 = JsonUtils.getLong(jSONObject, "process_waterfall_delay_ms", -1L);
        if (j10 > 0) {
            this.f9827a.i0().a(z4Var, u5.b.MEDIATION, j10, true);
        } else {
            this.f9827a.i0().a(z4Var);
        }
    }

    private void h(JSONObject jSONObject) {
        JSONArray jSONArray = this.f7506l;
        if (jSONArray != null) {
            jSONObject.put("signal_data", jSONArray);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(String str, int i10, String str2) {
        MaxErrorImpl maxErrorImpl;
        if (com.applovin.impl.sdk.n.a()) {
            com.applovin.impl.sdk.n nVar = this.f9829c;
            String str3 = this.f9828b;
            nVar.b(str3, "Unable to fetch ad for ad unit " + this.f7501g + ": server returned " + i10);
        }
        if (i10 == -800) {
            this.f9827a.C().c(v1.f9446t);
        }
        if (i10 == -1009) {
            maxErrorImpl = new MaxErrorImpl(-1009, str2);
        } else if (i10 == -1001) {
            maxErrorImpl = new MaxErrorImpl(-1001, str2);
        } else if (StringUtils.isValidString(str2)) {
            maxErrorImpl = new MaxErrorImpl(-1000, str2);
        } else {
            maxErrorImpl = new MaxErrorImpl(-1);
        }
        HashMap hashMap = new HashMap(5);
        CollectionUtils.putStringIfValid("url", StringUtils.getHost(str), hashMap);
        CollectionUtils.putStringIfValid("code", String.valueOf(i10), hashMap);
        CollectionUtils.putStringIfValid("error_message", str2, hashMap);
        CollectionUtils.putStringIfValid("ad_unit_id", this.f7501g, hashMap);
        CollectionUtils.putStringIfValid("ad_format", this.f7502h.getLabel(), hashMap);
        this.f9827a.D().d(y1.P, hashMap);
        l2.a(this.f7508n, this.f7501g, maxErrorImpl);
    }

    private void g(JSONObject jSONObject) {
        JsonUtils.putObject(jSONObject, "sdk_extra_parameters", new JSONObject(this.f9827a.f0().getExtraParameters()));
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
