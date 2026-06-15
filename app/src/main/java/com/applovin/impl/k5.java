package com.applovin.impl;

import android.app.ActivityManager;
import android.net.Uri;
import android.os.SystemClock;
import com.applovin.impl.l4;
import com.applovin.impl.r;
import com.applovin.impl.sdk.array.ArrayService;
import com.applovin.impl.sdk.k;
import com.applovin.impl.sdk.network.a;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.u5;
import com.applovin.sdk.AppLovinSdk;
import com.applovin.sdk.AppLovinWebViewActivity;
import com.google.android.gms.security.ProviderInstaller;
import com.ironsource.b9;
import com.ironsource.in;
import com.unity3d.ads.core.data.datasource.AndroidTcfDataSource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class k5 extends z4 {

    /* renamed from: j  reason: collision with root package name */
    private static final AtomicBoolean f7394j = new AtomicBoolean();

    /* renamed from: g  reason: collision with root package name */
    private final int f7395g;

    /* renamed from: h  reason: collision with root package name */
    private final Object f7396h;

    /* renamed from: i  reason: collision with root package name */
    private b f7397i;

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public interface b {
        void a(JSONObject jSONObject);
    }

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    private class c extends z4 {
        public c(com.applovin.impl.sdk.j jVar) {
            super("TaskTimeoutFetchBasicSettings", jVar, true);
        }

        @Override // java.lang.Runnable
        public void run() {
            if (k5.this.f7397i != null) {
                if (com.applovin.impl.sdk.n.a()) {
                    this.f9829c.b(this.f9828b, "Timing out fetch basic settings...");
                }
                k5.this.a(new JSONObject());
            }
        }
    }

    public k5(int i10, com.applovin.impl.sdk.j jVar, b bVar) {
        super("TaskFetchBasicSettings", jVar, true);
        this.f7396h = new Object();
        this.f7395g = i10;
        this.f7397i = bVar;
    }

    private HashMap b(String str) {
        return a(str, 0L, 0, null, null);
    }

    private String f() {
        return o0.a((String) this.f9827a.a(o4.f8211s0), "5.0/i", b());
    }

    private String g() {
        return o0.a((String) this.f9827a.a(o4.f8203r0), "5.0/i", b());
    }

    protected JSONObject e() {
        JSONObject jSONObject = new JSONObject();
        try {
            com.applovin.impl.sdk.j jVar = this.f9827a;
            o4 o4Var = o4.f8112f5;
            if (((Boolean) jVar.a(o4Var)).booleanValue() || ((Boolean) this.f9827a.a(o4Var)).booleanValue()) {
                jSONObject.put("rid", UUID.randomUUID().toString());
            }
            jSONObject.put("sdk_version", AppLovinSdk.VERSION);
            JsonUtils.putStringIfValid(jSONObject, "ad_review_sdk_version", f.b());
            jSONObject.put("init_count", this.f7395g);
            jSONObject.put("server_installed_at", this.f9827a.a(o4.f8178o));
            jSONObject.put("legacy", this.f9827a.x0().get());
            if (this.f9827a.t0()) {
                jSONObject.put("first_install", true);
            }
            if (!this.f9827a.r0()) {
                jSONObject.put("first_install_v2", true);
            }
            JsonUtils.putStringIfValid(jSONObject, "process_name", d7.b(a()));
            JsonUtils.putBooleanIfValid(jSONObject, "is_main_process", d7.g(a()));
            JsonUtils.putStringIfValid(jSONObject, "plugin_version", (String) this.f9827a.a(o4.J3));
            JsonUtils.putStringIfValid(jSONObject, "mediation_provider", this.f9827a.N());
            JsonUtils.putStringIfValid(jSONObject, "mediation_provider_v2", this.f9827a.y());
            jSONObject.put("installed_mediation_adapters", o3.a(this.f9827a));
            Map B = this.f9827a.x().B();
            jSONObject.put(b9.h.V, B.get(b9.h.V));
            jSONObject.put("app_version", B.get("app_version"));
            jSONObject.put("debug", B.get("debug"));
            jSONObject.put("tg", B.get("tg"));
            jSONObject.put("target_sdk", B.get("target_sdk"));
            List<String> list = null;
            if (this.f9827a.x0().get()) {
                list = this.f9827a.f0().getInitializationAdUnitIds();
            } else if (this.f9827a.G() != null) {
                list = this.f9827a.G().getAdUnitIds();
            }
            if (list != null && list.size() > 0) {
                List<String> removeTrimmedEmptyStrings = CollectionUtils.removeTrimmedEmptyStrings(list);
                jSONObject.put("ad_unit_ids", CollectionUtils.implode(removeTrimmedEmptyStrings, removeTrimmedEmptyStrings.size()));
            }
            jSONObject.put(AndroidTcfDataSource.TCF_TCSTRING_KEY, B.get(AndroidTcfDataSource.TCF_TCSTRING_KEY));
            jSONObject.put("IABTCF_gdprApplies", B.get("IABTCF_gdprApplies"));
            Object obj = B.get("IABTCF_AddtlConsent");
            if (obj instanceof String) {
                JsonUtils.putStringIfValid(jSONObject, "IABTCF_AddtlConsent", (String) obj);
            }
            jSONObject.put("consent_flow_info", this.f9827a.u().b());
            Map H = this.f9827a.x().H();
            jSONObject.put(com.ironsource.fe.G, H.get(com.ironsource.fe.G));
            jSONObject.put(com.ironsource.fe.E, H.get(com.ironsource.fe.E));
            jSONObject.put("locale", H.get("locale"));
            jSONObject.put("brand", H.get("brand"));
            jSONObject.put("brand_name", H.get("brand_name"));
            jSONObject.put("hardware", H.get("hardware"));
            jSONObject.put(com.ironsource.fe.B, H.get(com.ironsource.fe.B));
            jSONObject.put("revision", H.get("revision"));
            jSONObject.put("is_tablet", H.get("is_tablet"));
            jSONObject.put("screen_size_in", H.get("screen_size_in"));
            jSONObject.put("supported_abis", H.get("supported_abis"));
            if (((Boolean) this.f9827a.a(o4.U3)).booleanValue()) {
                jSONObject.put("mtl", this.f9827a.e0().getLastTrimMemoryLevel());
            }
            try {
                ActivityManager activityManager = (ActivityManager) com.applovin.impl.sdk.j.m().getSystemService("activity");
                ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
                if (activityManager != null) {
                    activityManager.getMemoryInfo(memoryInfo);
                    jSONObject.put("fm", memoryInfo.availMem);
                    jSONObject.put("tm", memoryInfo.totalMem);
                    jSONObject.put("lmt", memoryInfo.threshold);
                    jSONObject.put("lm", memoryInfo.lowMemory);
                }
            } catch (Throwable unused) {
            }
            r.a f10 = this.f9827a.x().f();
            jSONObject.put("dnt", f10.c());
            jSONObject.put("dnt_code", f10.b().b());
            Boolean b10 = m0.c().b(a());
            if (((Boolean) this.f9827a.a(o4.G3)).booleanValue() && StringUtils.isValidString(f10.a()) && !Boolean.TRUE.equals(b10)) {
                jSONObject.put("idfa", f10.a());
            }
            k.b C = this.f9827a.x().C();
            if (((Boolean) this.f9827a.a(o4.f8270z3)).booleanValue() && C != null && !Boolean.TRUE.equals(b10)) {
                jSONObject.put("idfv", C.f8957a);
                jSONObject.put("idfv_scope", C.f8958b);
            }
            if (((Boolean) this.f9827a.a(o4.C3)).booleanValue()) {
                jSONObject.put("compass_random_token", this.f9827a.r());
            }
            if (((Boolean) this.f9827a.a(o4.E3)).booleanValue()) {
                jSONObject.put("applovin_random_token", this.f9827a.Z());
            }
            if (this.f9827a.k0().c()) {
                jSONObject.put("test_mode", true);
            }
            List b11 = this.f9827a.k0().b();
            if (b11 != null && !b11.isEmpty()) {
                jSONObject.put("test_mode_networks", b11);
            }
            jSONObject.put("sdk_extra_parameters", new JSONObject(this.f9827a.f0().getExtraParameters()));
            Map c02 = this.f9827a.c0();
            if (!CollectionUtils.isEmpty(c02)) {
                jSONObject.put("segments", new JSONObject(c02));
            }
            if (this.f7395g > 1) {
                ArrayService n10 = this.f9827a.n();
                if (n10.getIsDirectDownloadEnabled() != null) {
                    jSONObject.put("ah_dd_enabled", n10.getIsDirectDownloadEnabled());
                }
                jSONObject.put("ah_sdk_version_code", n10.getAppHubVersionCode());
                jSONObject.put("ah_random_user_token", StringUtils.emptyIfNull(n10.getRandomUserToken()));
                jSONObject.put("ah_sdk_package_name", StringUtils.emptyIfNull(n10.getAppHubPackageName()));
            }
        } catch (JSONException e8) {
            if (com.applovin.impl.sdk.n.a()) {
                this.f9829c.a(this.f9828b, "Failed to create JSON body", e8);
            }
            this.f9827a.D().a(this.f9828b, "createJSONBody", e8);
        }
        return jSONObject;
    }

    protected Map h() {
        HashMap hashMap = new HashMap();
        if (!((Boolean) this.f9827a.a(o4.f8120g5)).booleanValue() && !((Boolean) this.f9827a.a(o4.f8112f5)).booleanValue()) {
            hashMap.put("rid", UUID.randomUUID().toString());
        }
        if (!((Boolean) this.f9827a.a(o4.S4)).booleanValue()) {
            hashMap.put(AppLovinWebViewActivity.INTENT_EXTRA_KEY_SDK_KEY, this.f9827a.a0());
        }
        Boolean b10 = m0.b().b(a());
        if (b10 != null) {
            hashMap.put("huc", b10.toString());
        }
        Boolean b11 = m0.c().b(a());
        if (b11 != null) {
            hashMap.put("aru", b11.toString());
        }
        Boolean b12 = m0.a().b(a());
        if (b12 != null) {
            hashMap.put("dns", b12.toString());
        }
        return hashMap;
    }

    @Override // java.lang.Runnable
    public void run() {
        if (!l0.k() && f7394j.compareAndSet(false, true)) {
            try {
                ProviderInstaller.a(com.applovin.impl.sdk.j.m());
            } catch (Throwable th) {
                if (com.applovin.impl.sdk.n.a()) {
                    this.f9829c.a(this.f9828b, "Cannot update security provider", th);
                }
            }
        }
        this.f9827a.D().d(y1.f9664f, b(g()));
        long elapsedRealtime = SystemClock.elapsedRealtime();
        Map h10 = h();
        a.C0138a b10 = com.applovin.impl.sdk.network.a.a(this.f9827a).b(g()).a(f()).b(h10).a(e()).b(((Boolean) this.f9827a.a(o4.f8208r5)).booleanValue()).c(in.f17849b).a((Object) new JSONObject()).a(((Integer) this.f9827a.a(o4.f8094d3)).intValue()).b(((Integer) this.f9827a.a(o4.f8118g3)).intValue());
        com.applovin.impl.sdk.j jVar = this.f9827a;
        o4 o4Var = o4.f8086c3;
        com.applovin.impl.sdk.network.a a10 = b10.c(((Integer) jVar.a(o4Var)).intValue()).e(((Boolean) this.f9827a.a(o4.f8190p3)).booleanValue()).a(l4.a.a(((Integer) this.f9827a.a(o4.X4)).intValue())).f(true).a();
        this.f9827a.i0().a(new c(this.f9827a), u5.b.TIMEOUT, ((Integer) this.f9827a.a(o4Var)).intValue() + 250);
        a aVar = new a(a10, this.f9827a, d(), elapsedRealtime);
        aVar.c(o4.f8203r0);
        aVar.b(o4.f8211s0);
        this.f9827a.i0().a(aVar);
    }

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    class a extends e6 {

        /* renamed from: m  reason: collision with root package name */
        final /* synthetic */ long f7398m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(com.applovin.impl.sdk.network.a aVar, com.applovin.impl.sdk.j jVar, boolean z10, long j10) {
            super(aVar, jVar, z10);
            this.f7398m = j10;
        }

        @Override // com.applovin.impl.e6, com.applovin.impl.n0.e
        public void a(String str, JSONObject jSONObject, int i10) {
            long elapsedRealtime = SystemClock.elapsedRealtime() - this.f7398m;
            k5.this.a(jSONObject);
            this.f9827a.D().d(y1.f9666g, k5.this.a(str, elapsedRealtime, i10, jSONObject, null));
        }

        @Override // com.applovin.impl.e6, com.applovin.impl.n0.e
        public void a(String str, int i10, String str2, JSONObject jSONObject) {
            if (com.applovin.impl.sdk.n.a()) {
                com.applovin.impl.sdk.n nVar = this.f9829c;
                String str3 = this.f9828b;
                nVar.b(str3, "Unable to fetch basic SDK settings: server returned " + i10);
            }
            long elapsedRealtime = SystemClock.elapsedRealtime() - this.f7398m;
            k5.this.a(jSONObject != null ? jSONObject : new JSONObject());
            this.f9827a.D().d(y1.f9668h, k5.this.a(str, elapsedRealtime, i10, jSONObject, str2));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public HashMap a(String str, long j10, int i10, JSONObject jSONObject, String str2) {
        Uri build = Uri.parse(str).buildUpon().clearQuery().build();
        JSONObject jSONObject2 = new JSONObject();
        JsonUtils.putString(jSONObject2, b9.i.D, build.getHost());
        if (jSONObject != null) {
            JSONArray jSONArray = JsonUtils.getJSONArray(jSONObject, "signal_providers", null);
            JSONArray jSONArray2 = JsonUtils.getJSONArray(jSONObject, "auto_init_adapters", null);
            if (jSONArray != null) {
                JsonUtils.putInt(jSONObject2, "signal_provider_count", jSONArray.length());
            }
            if (jSONArray2 != null) {
                JsonUtils.putInt(jSONObject2, "auto_init_adapter_count", jSONArray2.length());
            }
        }
        HashMap hashMap = new HashMap();
        hashMap.put("attempt_number", Integer.toString(this.f7395g));
        hashMap.put("error_message", str2);
        hashMap.put("url", build.toString());
        hashMap.put("details", jSONObject2.toString());
        hashMap.put("duration_ms", Long.toString(j10));
        hashMap.put("code", Integer.toString(i10));
        return hashMap;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(JSONObject jSONObject) {
        b bVar;
        synchronized (this.f7396h) {
            bVar = this.f7397i;
            this.f7397i = null;
        }
        if (bVar != null) {
            bVar.a(jSONObject);
        }
    }
}
