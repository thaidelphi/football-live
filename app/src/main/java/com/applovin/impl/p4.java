package com.applovin.impl;

import android.content.Context;
import android.content.SharedPreferences;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.mediation.MaxAdFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class p4 {

    /* renamed from: a  reason: collision with root package name */
    protected final com.applovin.impl.sdk.j f8358a;

    /* renamed from: b  reason: collision with root package name */
    protected final Context f8359b;

    /* renamed from: c  reason: collision with root package name */
    protected final SharedPreferences f8360c;

    /* renamed from: d  reason: collision with root package name */
    private final Map f8361d = new HashMap();

    /* renamed from: e  reason: collision with root package name */
    private final Object f8362e = new Object();

    public p4(com.applovin.impl.sdk.j jVar) {
        this.f8358a = jVar;
        Context m7 = com.applovin.impl.sdk.j.m();
        this.f8359b = m7;
        this.f8360c = m7.getSharedPreferences("com.applovin.sdk.1", 0);
        try {
            Class.forName(o4.class.getName());
            Class.forName(j3.class.getName());
        } catch (Throwable unused) {
        }
        d();
    }

    public Object a(o4 o4Var) {
        if (o4Var != null) {
            synchronized (this.f8362e) {
                Object obj = this.f8361d.get(o4Var.b());
                if (obj == null) {
                    return o4Var.a();
                }
                return o4Var.a(obj);
            }
        }
        throw new IllegalArgumentException("No setting type specified");
    }

    public List b(o4 o4Var) {
        ArrayList arrayList = new ArrayList(6);
        for (String str : c(o4Var)) {
            arrayList.add(MaxAdFormat.formatFromString(str));
        }
        return arrayList;
    }

    public List c(o4 o4Var) {
        return CollectionUtils.explode((String) a(o4Var));
    }

    public void d() {
        String b10 = b();
        synchronized (this.f8362e) {
            for (o4 o4Var : o4.c()) {
                String b11 = o4Var.b();
                Object a10 = this.f8358a.a(b10 + b11, null, o4Var.a().getClass(), this.f8360c);
                if (a10 != null) {
                    this.f8361d.put(o4Var.b(), a10);
                }
            }
        }
    }

    public void e() {
        String b10 = b();
        synchronized (this.f8362e) {
            SharedPreferences.Editor edit = this.f8360c.edit();
            for (o4 o4Var : o4.c()) {
                Object obj = this.f8361d.get(o4Var.b());
                if (obj != null) {
                    this.f8358a.a(b10 + o4Var.b(), obj, edit);
                }
            }
            if (((Boolean) this.f8358a.a(o4.f8113f6)).booleanValue()) {
                r4.a(edit);
            } else {
                edit.apply();
            }
        }
    }

    public boolean c() {
        return this.f8358a.f0().isVerboseLoggingEnabled() || ((Boolean) a(o4.f8146k)).booleanValue();
    }

    private String b() {
        return "com.applovin.sdk." + d7.e(this.f8358a.a0()) + ".";
    }

    public void a(o4 o4Var, Object obj) {
        if (o4Var == null) {
            throw new IllegalArgumentException("No setting type specified");
        }
        if (obj != null) {
            synchronized (this.f8362e) {
                this.f8361d.put(o4Var.b(), obj);
            }
            return;
        }
        throw new IllegalArgumentException("No new value specified");
    }

    public void a(JSONObject jSONObject) {
        synchronized (this.f8362e) {
            boolean booleanValue = JsonUtils.getBoolean(jSONObject, o4.f8242w.b(), Boolean.FALSE).booleanValue();
            HashMap hashMap = booleanValue ? new HashMap() : null;
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                if (next != null && next.length() > 0) {
                    try {
                        o4 a10 = a(next, (o4) null);
                        if (a10 != null) {
                            Object a11 = booleanValue ? a(a10) : null;
                            Object a12 = a(next, jSONObject, a10.a());
                            this.f8361d.put(a10.b(), a12);
                            if (a10 == o4.f8176n5) {
                                this.f8361d.put(o4.f8184o5.b(), Long.valueOf(System.currentTimeMillis()));
                            }
                            if (booleanValue && !a12.equals(a11)) {
                                hashMap.put(a10, a11);
                            }
                        }
                    } catch (JSONException e8) {
                        com.applovin.impl.sdk.n.c("SettingsManager", "Unable to parse JSON settingsValues array", e8);
                        this.f8358a.D().a("SettingsManager", "loadSettingsException", e8);
                    }
                }
            }
            if (booleanValue && hashMap.size() > 0) {
                n2 n2Var = new n2();
                n2Var.a("========== UPDATED SETTINGS ==========");
                for (o4 o4Var : hashMap.keySet()) {
                    String b10 = o4Var.b();
                    n2Var.a(b10, a(o4Var) + " (" + hashMap.get(o4Var) + ")");
                }
                n2Var.a("========== END ==========");
                this.f8358a.I();
                if (com.applovin.impl.sdk.n.a()) {
                    this.f8358a.I().a("SettingsManager", n2Var.toString());
                }
            }
        }
    }

    public void a() {
        synchronized (this.f8362e) {
            this.f8361d.clear();
        }
        this.f8358a.a(this.f8360c);
    }

    private static Object a(String str, JSONObject jSONObject, Object obj) {
        if (obj instanceof Boolean) {
            return Boolean.valueOf(jSONObject.getBoolean(str));
        }
        if (obj instanceof Float) {
            return Float.valueOf((float) jSONObject.getDouble(str));
        }
        if (obj instanceof Double) {
            return Double.valueOf(jSONObject.getDouble(str));
        }
        if (obj instanceof Integer) {
            return Integer.valueOf(jSONObject.getInt(str));
        }
        if (obj instanceof Long) {
            return Long.valueOf(jSONObject.getLong(str));
        }
        if (obj instanceof String) {
            return jSONObject.getString(str);
        }
        throw new RuntimeException("SDK Error: unknown value type: " + obj.getClass());
    }

    public o4 a(String str, o4 o4Var) {
        synchronized (this.f8362e) {
            for (o4 o4Var2 : o4.c()) {
                if (o4Var2.b().equals(str)) {
                    return o4Var2;
                }
            }
            return o4Var;
        }
    }
}
