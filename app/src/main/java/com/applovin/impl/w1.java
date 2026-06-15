package com.applovin.impl;

import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.u5;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class w1 {

    /* renamed from: a  reason: collision with root package name */
    private final com.applovin.impl.sdk.j f9506a;

    /* renamed from: b  reason: collision with root package name */
    private final Map f9507b = new HashMap();

    public w1(com.applovin.impl.sdk.j jVar) {
        if (jVar != null) {
            this.f9506a = jVar;
            return;
        }
        throw new IllegalArgumentException("No sdk specified");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void d() {
        try {
            this.f9506a.b(q4.f8463z, c().toString());
        } catch (Throwable th) {
            this.f9506a.I();
            if (com.applovin.impl.sdk.n.a()) {
                this.f9506a.I().a("GlobalStatsManager", "Unable to save stats", th);
            }
        }
    }

    private void f() {
        this.f9506a.i0().a(new Runnable() { // from class: com.applovin.impl.jf
            @Override // java.lang.Runnable
            public final void run() {
                w1.this.d();
            }
        }, u5.b.OTHER);
    }

    long a(v1 v1Var, long j10) {
        long longValue;
        synchronized (this.f9507b) {
            Long l10 = (Long) this.f9507b.get(v1Var.b());
            if (l10 == null) {
                l10 = 0L;
            }
            longValue = l10.longValue() + j10;
            this.f9507b.put(v1Var.b(), Long.valueOf(longValue));
        }
        f();
        return longValue;
    }

    public long b(v1 v1Var) {
        long longValue;
        synchronized (this.f9507b) {
            Long l10 = (Long) this.f9507b.get(v1Var.b());
            if (l10 == null) {
                l10 = 0L;
            }
            longValue = l10.longValue();
        }
        return longValue;
    }

    public long c(v1 v1Var) {
        return a(v1Var, 1L);
    }

    public void e() {
        try {
            JSONObject jSONObject = new JSONObject((String) this.f9506a.a(q4.f8463z, JsonUtils.EMPTY_JSON));
            synchronized (this.f9507b) {
                Iterator<String> keys = jSONObject.keys();
                while (keys.hasNext()) {
                    try {
                        String next = keys.next();
                        this.f9507b.put(next, Long.valueOf(jSONObject.getLong(next)));
                    } catch (JSONException unused) {
                    }
                }
            }
        } catch (Throwable th) {
            this.f9506a.I();
            if (com.applovin.impl.sdk.n.a()) {
                this.f9506a.I().a("GlobalStatsManager", "Unable to load stats", th);
            }
        }
    }

    public JSONObject c() {
        JSONObject jSONObject;
        synchronized (this.f9507b) {
            jSONObject = new JSONObject();
            for (Map.Entry entry : this.f9507b.entrySet()) {
                JsonUtils.putLong(jSONObject, (String) entry.getKey(), ((Long) entry.getValue()).longValue());
            }
        }
        return jSONObject;
    }

    public void b(v1 v1Var, long j10) {
        synchronized (this.f9507b) {
            this.f9507b.put(v1Var.b(), Long.valueOf(j10));
        }
        f();
    }

    public void a() {
        synchronized (this.f9507b) {
            this.f9507b.clear();
        }
        f();
    }

    public void b() {
        synchronized (this.f9507b) {
            for (v1 v1Var : v1.a()) {
                this.f9507b.remove(v1Var.b());
            }
            f();
        }
    }

    public void a(v1 v1Var) {
        synchronized (this.f9507b) {
            this.f9507b.remove(v1Var.b());
        }
        f();
    }
}
