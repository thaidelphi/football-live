package com.applovin.impl.mediation;

import android.app.Activity;
import com.applovin.impl.a2;
import com.applovin.impl.b5;
import com.applovin.impl.b6;
import com.applovin.impl.d3;
import com.applovin.impl.f1;
import com.applovin.impl.j3;
import com.applovin.impl.j4;
import com.applovin.impl.q4;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.u5;
import com.applovin.impl.y1;
import com.applovin.mediation.adapter.MaxAdapter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class e {

    /* renamed from: a  reason: collision with root package name */
    private final com.applovin.impl.sdk.j f7801a;

    /* renamed from: b  reason: collision with root package name */
    private final com.applovin.impl.sdk.n f7802b;

    /* renamed from: c  reason: collision with root package name */
    private final AtomicBoolean f7803c = new AtomicBoolean();

    /* renamed from: d  reason: collision with root package name */
    private final Set f7804d = new HashSet();

    /* renamed from: e  reason: collision with root package name */
    private final Object f7805e = new Object();

    /* renamed from: f  reason: collision with root package name */
    private final JSONArray f7806f = new JSONArray();

    /* renamed from: g  reason: collision with root package name */
    private final LinkedHashMap f7807g = new LinkedHashMap();

    /* renamed from: h  reason: collision with root package name */
    private final Object f7808h = new Object();

    /* renamed from: i  reason: collision with root package name */
    private final Map f7809i = new HashMap();

    /* renamed from: j  reason: collision with root package name */
    private final Map f7810j = new HashMap();

    /* renamed from: k  reason: collision with root package name */
    private final Object f7811k = new Object();

    /* renamed from: l  reason: collision with root package name */
    private List f7812l;

    public e(com.applovin.impl.sdk.j jVar) {
        this.f7801a = jVar;
        this.f7802b = jVar.I();
    }

    public void a(Activity activity) {
        if (this.f7803c.compareAndSet(false, true)) {
            String str = (String) this.f7801a.a(q4.G);
            if (StringUtils.isValidString(str)) {
                try {
                    JSONObject jSONObject = new JSONObject(str);
                    List<d3> a10 = a(JsonUtils.getJSONArray(jSONObject, this.f7801a.k0().c() ? "test_mode_auto_init_adapters" : "auto_init_adapters", new JSONArray()), jSONObject);
                    this.f7812l = a10;
                    for (d3 d3Var : a10) {
                        this.f7809i.put(d3Var.b(), d3Var);
                    }
                    long parseLong = StringUtils.parseLong(this.f7801a.f0().getExtraParameters().get("adapter_initialization_delay_ms"), -1L);
                    b5 b5Var = new b5(a10, activity, this.f7801a);
                    if (parseLong > 0) {
                        this.f7801a.i0().a(b5Var, u5.b.MEDIATION, parseLong);
                    } else {
                        this.f7801a.i0().a(b5Var);
                    }
                } catch (JSONException e8) {
                    if (com.applovin.impl.sdk.n.a()) {
                        this.f7802b.a("MediationAdapterInitializationManager", "Failed to parse auto-init adapters JSON", e8);
                    }
                    f1.a((Throwable) e8);
                }
            }
        }
    }

    public JSONArray b() {
        JSONArray shallowCopy;
        synchronized (this.f7808h) {
            shallowCopy = JsonUtils.shallowCopy(this.f7806f);
        }
        return shallowCopy;
    }

    public boolean c() {
        return this.f7803c.get();
    }

    private void c(d3 d3Var) {
        String b10 = d3Var.b();
        synchronized (this.f7805e) {
            if (this.f7804d.contains(b10)) {
                return;
            }
            this.f7804d.add(b10);
            this.f7801a.D().d(y1.I, a2.a(d3Var));
        }
    }

    boolean b(d3 d3Var) {
        boolean containsKey;
        synchronized (this.f7808h) {
            containsKey = this.f7807g.containsKey(d3Var.b());
        }
        return containsKey;
    }

    public j4 a(d3 d3Var, Activity activity) {
        d3 a10 = a(d3Var);
        if (a10 == null) {
            return j4.a("AdapterInitialization:" + d3Var.c(), MaxAdapter.InitializationStatus.DOES_NOT_APPLY);
        }
        String b10 = d3Var.b();
        synchronized (this.f7811k) {
            j4 j4Var = (j4) this.f7810j.get(b10);
            if (j4Var == null || (j4Var.d() && a10.q())) {
                final j4 j4Var2 = new j4("AdapterInitialization:" + d3Var.c());
                this.f7810j.put(b10, j4Var2);
                g a11 = this.f7801a.L().a(a10);
                if (a11 == null) {
                    j4Var2.a("Adapter implementation not found");
                    return j4Var2;
                }
                if (com.applovin.impl.sdk.n.a()) {
                    com.applovin.impl.sdk.n nVar = this.f7802b;
                    nVar.d("MediationAdapterInitializationManager", "Initializing adapter " + a10);
                }
                c(a10);
                a11.a(MaxAdapterParametersImpl.a(a10), activity, new MaxAdapter.OnCompletionListener() { // from class: com.applovin.impl.mediation.t
                    @Override // com.applovin.mediation.adapter.MaxAdapter.OnCompletionListener
                    public final void onCompletion(MaxAdapter.InitializationStatus initializationStatus, String str) {
                        e.a(j4.this, initializationStatus, str);
                    }
                });
                long m7 = a10.m();
                b6.a(m7, j4Var2, "The adapter (" + d3Var.c() + ") timed out initializing", "MediationAdapterInitializationManager", this.f7801a);
                return j4Var2;
            }
            return j4Var;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void a(j4 j4Var, MaxAdapter.InitializationStatus initializationStatus, String str) {
        if (initializationStatus != null && initializationStatus != MaxAdapter.InitializationStatus.INITIALIZING) {
            if (initializationStatus == MaxAdapter.InitializationStatus.INITIALIZED_FAILURE) {
                j4Var.a(str);
                return;
            } else {
                j4Var.b(initializationStatus);
                return;
            }
        }
        f1.a("Adapters should never report a null or INITIALIZING status.", new Object[0]);
        j4Var.a("Adapter reported INITIALIZING");
    }

    private d3 a(d3 d3Var) {
        List<d3> list;
        if (((Boolean) this.f7801a.a(j3.G7)).booleanValue()) {
            d3 d3Var2 = (d3) this.f7809i.get(d3Var.b());
            return d3Var2 != null ? d3Var2 : d3Var;
        } else if (!this.f7801a.k0().c() || (list = this.f7812l) == null) {
            return d3Var;
        } else {
            for (d3 d3Var3 : list) {
                if (d3Var3.b().equals(d3Var.b())) {
                    return d3Var3;
                }
            }
            return null;
        }
    }

    public Integer a(String str) {
        Integer num;
        synchronized (this.f7808h) {
            num = (Integer) this.f7807g.get(str);
        }
        return num;
    }

    public Set a() {
        HashSet hashSet;
        synchronized (this.f7808h) {
            hashSet = new HashSet(this.f7807g.keySet());
        }
        return hashSet;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(d3 d3Var, long j10, MaxAdapter.InitializationStatus initializationStatus, String str) {
        boolean z10;
        if (initializationStatus == null || initializationStatus == MaxAdapter.InitializationStatus.INITIALIZING) {
            return;
        }
        synchronized (this.f7808h) {
            z10 = !b(d3Var);
            if (z10) {
                this.f7807g.put(d3Var.b(), Integer.valueOf(initializationStatus.getCode()));
                JSONObject jSONObject = new JSONObject();
                JsonUtils.putString(jSONObject, "class", d3Var.b());
                JsonUtils.putString(jSONObject, "init_status", String.valueOf(initializationStatus.getCode()));
                JsonUtils.putLong(jSONObject, "init_time_ms", j10);
                JsonUtils.putString(jSONObject, "error_message", JSONObject.quote(str));
                this.f7806f.put(jSONObject);
            }
        }
        if (z10) {
            this.f7801a.a(d3Var);
            this.f7801a.P().processAdapterInitializationPostback(d3Var, j10, initializationStatus, str);
            this.f7801a.q().a(initializationStatus, d3Var.b());
        }
    }

    private List a(JSONArray jSONArray, JSONObject jSONObject) {
        ArrayList arrayList = new ArrayList(jSONArray.length());
        for (int i10 = 0; i10 < jSONArray.length(); i10++) {
            arrayList.add(new d3(Collections.EMPTY_MAP, JsonUtils.getJSONObject(jSONArray, i10, (JSONObject) null), jSONObject, this.f7801a));
        }
        return arrayList;
    }

    public void a(MaxAdapter.InitializationStatus initializationStatus) {
        synchronized (this.f7808h) {
            this.f7807g.put("com.applovin.mediation.adapters.AppLovinMediationAdapter", Integer.valueOf(initializationStatus.getCode()));
        }
        this.f7801a.q().a(initializationStatus, "com.applovin.mediation.adapters.AppLovinMediationAdapter");
    }
}
