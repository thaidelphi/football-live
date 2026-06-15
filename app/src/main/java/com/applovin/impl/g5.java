package com.applovin.impl;

import android.content.Context;
import com.applovin.impl.g5;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.t4;
import com.applovin.impl.u5;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.mediation.MaxError;
import com.applovin.sdk.AppLovinSdkUtils;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class g5 extends z4 {

    /* renamed from: l  reason: collision with root package name */
    private static JSONObject f7027l;

    /* renamed from: m  reason: collision with root package name */
    private static final Object f7028m = new Object();

    /* renamed from: n  reason: collision with root package name */
    private static final Map f7029n = Collections.synchronizedMap(new HashMap());

    /* renamed from: g  reason: collision with root package name */
    private final String f7030g;

    /* renamed from: h  reason: collision with root package name */
    private final MaxAdFormat f7031h;

    /* renamed from: i  reason: collision with root package name */
    private final Map f7032i;

    /* renamed from: j  reason: collision with root package name */
    private final Context f7033j;

    /* renamed from: k  reason: collision with root package name */
    private final b f7034k;

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public interface b {
        void a(JSONArray jSONArray);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public static class c implements t4.a, Runnable {

        /* renamed from: a  reason: collision with root package name */
        private final b f7035a;

        /* renamed from: b  reason: collision with root package name */
        private final Object f7036b;

        /* renamed from: c  reason: collision with root package name */
        private int f7037c;

        /* renamed from: d  reason: collision with root package name */
        private final AtomicBoolean f7038d;

        /* renamed from: e  reason: collision with root package name */
        private final Collection f7039e;

        /* renamed from: f  reason: collision with root package name */
        private final com.applovin.impl.sdk.j f7040f;

        /* renamed from: g  reason: collision with root package name */
        private final com.applovin.impl.sdk.n f7041g;

        @Override // com.applovin.impl.t4.a
        public void a(t4 t4Var) {
            boolean z10;
            synchronized (this.f7036b) {
                this.f7039e.add(t4Var);
                int i10 = this.f7037c - 1;
                this.f7037c = i10;
                z10 = i10 < 1;
            }
            if (z10 && this.f7038d.compareAndSet(false, true)) {
                if (d7.h() && ((Boolean) this.f7040f.a(o4.Q)).booleanValue()) {
                    this.f7040f.i0().a((z4) new k6(this.f7040f, "handleSignalCollectionCompleted", new Runnable() { // from class: com.applovin.impl.la
                        @Override // java.lang.Runnable
                        public final void run() {
                            g5.c.this.a();
                        }
                    }), u5.b.MEDIATION);
                } else {
                    a();
                }
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f7038d.compareAndSet(false, true)) {
                a();
            }
        }

        private c(int i10, b bVar, com.applovin.impl.sdk.j jVar) {
            this.f7037c = i10;
            this.f7035a = bVar;
            this.f7040f = jVar;
            this.f7041g = jVar.I();
            this.f7036b = new Object();
            this.f7039e = new ArrayList(i10);
            this.f7038d = new AtomicBoolean();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void a() {
            ArrayList<t4> arrayList;
            synchronized (this.f7036b) {
                arrayList = new ArrayList(this.f7039e);
            }
            JSONArray jSONArray = new JSONArray();
            for (t4 t4Var : arrayList) {
                try {
                    JSONObject jSONObject = new JSONObject();
                    u4 f10 = t4Var.f();
                    jSONObject.put("name", f10.c());
                    jSONObject.put("class", f10.b());
                    jSONObject.put("adapter_version", t4Var.a());
                    jSONObject.put("sdk_version", t4Var.d());
                    JSONObject jSONObject2 = new JSONObject();
                    MaxError c10 = t4Var.c();
                    if (c10 != null) {
                        jSONObject2.put("error_message", c10.getMessage());
                    } else {
                        jSONObject2.put("signal", t4Var.e());
                    }
                    jSONObject2.put("signal_collection_time_ms", t4Var.b());
                    jSONObject2.put("is_cached", t4Var.g());
                    jSONObject.put("data", jSONObject2);
                    jSONArray.put(jSONObject);
                    if (com.applovin.impl.sdk.n.a()) {
                        com.applovin.impl.sdk.n nVar = this.f7041g;
                        nVar.a("TaskCollectSignals", "Collected signal from " + f10);
                    }
                } catch (JSONException e8) {
                    if (com.applovin.impl.sdk.n.a()) {
                        this.f7041g.a("TaskCollectSignals", "Failed to create signal data", e8);
                    }
                    this.f7040f.D().a("TaskCollectSignals", "createSignalsData", e8);
                }
            }
            a(jSONArray);
        }

        private void a(JSONArray jSONArray) {
            b bVar = this.f7035a;
            if (bVar != null) {
                bVar.a(jSONArray);
            }
        }
    }

    public g5(String str, MaxAdFormat maxAdFormat, Map map, Context context, com.applovin.impl.sdk.j jVar, b bVar) {
        super("TaskCollectSignals", jVar);
        this.f7030g = str;
        this.f7031h = maxAdFormat;
        this.f7032i = map;
        this.f7033j = context;
        this.f7034k = bVar;
    }

    private void a(JSONArray jSONArray, JSONObject jSONObject) {
        c cVar = new c(jSONArray.length(), this.f7034k, this.f9827a);
        this.f9827a.i0().a(new k6(this.f9827a, "timeoutCollectSignal", cVar), u5.b.TIMEOUT, ((Long) this.f9827a.a(j3.L6)).longValue());
        for (int i10 = 0; i10 < jSONArray.length(); i10++) {
            a(new u4(this.f7032i, jSONArray.getJSONObject(i10), jSONObject, this.f9827a), cVar);
        }
    }

    private void b(JSONArray jSONArray, JSONObject jSONObject) {
        Set set = (Set) f7029n.get(this.f7030g);
        if (set != null && !set.isEmpty()) {
            JSONArray jSONArray2 = new JSONArray();
            for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                JSONObject jSONObject2 = jSONArray.getJSONObject(i10);
                if (set.contains(JsonUtils.getString(jSONObject2, "name", null))) {
                    jSONArray2.put(jSONObject2);
                }
            }
            a(jSONArray2, jSONObject);
            return;
        }
        a("No signal providers found for ad unit: " + this.f7030g, (Throwable) null);
    }

    @Override // java.lang.Runnable
    public void run() {
        JSONArray jSONArray;
        try {
            synchronized (f7028m) {
                jSONArray = JsonUtils.getJSONArray(f7027l, "signal_providers", null);
            }
            if (jSONArray != null && jSONArray.length() > 0) {
                if (f7029n.size() > 0) {
                    b(jSONArray, f7027l);
                    return;
                } else {
                    a(jSONArray, f7027l);
                    return;
                }
            }
            if (com.applovin.impl.sdk.n.a()) {
                this.f9829c.k(this.f9828b, "Unable to find cached signal providers, fetching signal providers from SharedPreferences.");
            }
            JSONObject jSONObject = new JSONObject((String) this.f9827a.a(q4.F, JsonUtils.EMPTY_JSON));
            JSONArray jSONArray2 = JsonUtils.getJSONArray(jSONObject, "signal_providers", null);
            if (jSONArray2 != null && jSONArray2.length() != 0) {
                if (f7029n.size() > 0) {
                    b(jSONArray2, jSONObject);
                    return;
                } else {
                    a(jSONArray2, jSONObject);
                    return;
                }
            }
            a("No signal providers found", (Throwable) null);
        } catch (InterruptedException e8) {
            a("Failed to wait for signals", e8);
            this.f9827a.D().a("TaskCollectSignals", "waitForSignals", e8);
        } catch (JSONException e10) {
            a("Failed to parse signals JSON", e10);
            this.f9827a.D().a("TaskCollectSignals", "parseSignalsJSON", e10);
        } catch (Throwable th) {
            a("Failed to collect signals", th);
            this.f9827a.D().a("TaskCollectSignals", "collectSignals", th);
        }
    }

    private void a(final u4 u4Var, final t4.a aVar) {
        if (u4Var.r()) {
            AppLovinSdkUtils.runOnUiThread(new Runnable() { // from class: com.applovin.impl.ka
                @Override // java.lang.Runnable
                public final void run() {
                    g5.this.b(u4Var, aVar);
                }
            });
        } else {
            this.f9827a.P().collectSignal(this.f7030g, this.f7031h, u4Var, this.f7033j, aVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b(u4 u4Var, t4.a aVar) {
        this.f9827a.P().collectSignal(this.f7030g, this.f7031h, u4Var, this.f7033j, aVar);
    }

    private void a(String str, Throwable th) {
        if (com.applovin.impl.sdk.n.a()) {
            com.applovin.impl.sdk.n nVar = this.f9829c;
            String str2 = this.f9828b;
            nVar.a(str2, "No signals collected: " + str, th);
        }
        b bVar = this.f7034k;
        if (bVar != null) {
            bVar.a(new JSONArray());
        }
    }

    public static void a(JSONObject jSONObject) {
        synchronized (f7028m) {
            f7027l = jSONObject;
        }
    }

    public static void a(JSONObject jSONObject, com.applovin.impl.sdk.j jVar) {
        try {
            JSONObject jSONObject2 = JsonUtils.getJSONObject(jSONObject, "ad_unit_signal_providers", (JSONObject) null);
            if (jSONObject2 != null) {
                for (String str : JsonUtils.toList(jSONObject2.names())) {
                    f7029n.put(str, new HashSet(JsonUtils.getList(jSONObject2, str, null)));
                }
            }
        } catch (JSONException e8) {
            com.applovin.impl.sdk.n.c("TaskCollectSignals", "Failed to parse ad unit signal providers for JSON object: " + jSONObject, e8);
            jVar.D().a("TaskCollectSignals", "parseAdUnitSignalProvidersJSON", e8);
        }
    }
}
