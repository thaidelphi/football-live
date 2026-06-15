package com.adcolony.sdk;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class f1 {

    /* renamed from: a  reason: collision with root package name */
    private final JSONObject f5993a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public f1() {
        this(new JSONObject());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(f1 f1Var) {
        if (f1Var != null) {
            synchronized (this.f5993a) {
                synchronized (f1Var.f5993a) {
                    Iterator<String> c10 = f1Var.c();
                    while (c10.hasNext()) {
                        String next = c10.next();
                        try {
                            this.f5993a.put(next, f1Var.f5993a.get(next));
                        } catch (JSONException unused) {
                        }
                    }
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int b(String str) throws JSONException {
        int i10;
        synchronized (this.f5993a) {
            i10 = this.f5993a.getInt(str);
        }
        return i10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public e1 c(String str) throws JSONException {
        e1 e1Var;
        synchronized (this.f5993a) {
            e1Var = new e1(this.f5993a.getJSONArray(str));
        }
        return e1Var;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public long d(String str) throws JSONException {
        long j10;
        synchronized (this.f5993a) {
            j10 = this.f5993a.getLong(str);
        }
        return j10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public String e(String str) throws JSONException {
        String string;
        synchronized (this.f5993a) {
            string = this.f5993a.getString(str);
        }
        return string;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean f(String str) {
        boolean optBoolean;
        synchronized (this.f5993a) {
            optBoolean = this.f5993a.optBoolean(str);
        }
        return optBoolean;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Boolean g(String str) {
        Boolean valueOf;
        try {
            synchronized (this.f5993a) {
                valueOf = Boolean.valueOf(this.f5993a.getBoolean(str));
            }
            return valueOf;
        } catch (JSONException unused) {
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public double h(String str) {
        double optDouble;
        synchronized (this.f5993a) {
            optDouble = this.f5993a.optDouble(str);
        }
        return optDouble;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Integer i(String str) {
        Integer valueOf;
        try {
            synchronized (this.f5993a) {
                valueOf = Integer.valueOf(this.f5993a.getInt(str));
            }
            return valueOf;
        } catch (JSONException unused) {
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int j(String str) {
        int optInt;
        synchronized (this.f5993a) {
            optInt = this.f5993a.optInt(str);
        }
        return optInt;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public e1 k(String str) {
        e1 e1Var;
        synchronized (this.f5993a) {
            JSONArray optJSONArray = this.f5993a.optJSONArray(str);
            e1Var = optJSONArray != null ? new e1(optJSONArray) : new e1();
        }
        return e1Var;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public e1 l(String str) {
        e1 e1Var;
        synchronized (this.f5993a) {
            JSONArray optJSONArray = this.f5993a.optJSONArray(str);
            e1Var = optJSONArray != null ? new e1(optJSONArray) : null;
        }
        return e1Var;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public f1 m(String str) {
        f1 f1Var;
        synchronized (this.f5993a) {
            JSONObject optJSONObject = this.f5993a.optJSONObject(str);
            f1Var = optJSONObject != null ? new f1(optJSONObject) : new f1();
        }
        return f1Var;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public f1 n(String str) {
        f1 f1Var;
        synchronized (this.f5993a) {
            JSONObject optJSONObject = this.f5993a.optJSONObject(str);
            f1Var = optJSONObject != null ? new f1(optJSONObject) : null;
        }
        return f1Var;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Object o(String str) {
        Object opt;
        synchronized (this.f5993a) {
            opt = this.f5993a.isNull(str) ? null : this.f5993a.opt(str);
        }
        return opt;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public String p(String str) {
        String optString;
        synchronized (this.f5993a) {
            optString = this.f5993a.optString(str);
        }
        return optString;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public String q(String str) {
        synchronized (this.f5993a) {
            if (!this.f5993a.isNull(str)) {
                Object opt = this.f5993a.opt(str);
                if (opt instanceof String) {
                    return (String) opt;
                } else if (opt != null) {
                    return String.valueOf(opt);
                }
            }
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void r(String str) {
        synchronized (this.f5993a) {
            this.f5993a.remove(str);
        }
    }

    public String toString() {
        String jSONObject;
        synchronized (this.f5993a) {
            jSONObject = this.f5993a.toString();
        }
        return jSONObject;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public f1(String str) throws JSONException {
        this(new JSONObject(str));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public f1(Map<?, ?> map) {
        this(new JSONObject(map));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public f1(JSONObject jSONObject) throws NullPointerException {
        jSONObject.getClass();
        this.f5993a = jSONObject;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public f1 b(String str, boolean z10) throws JSONException {
        synchronized (this.f5993a) {
            this.f5993a.put(str, z10);
        }
        return this;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean c(String str, int i10) throws JSONException {
        synchronized (this.f5993a) {
            if (this.f5993a.has(str)) {
                return false;
            }
            this.f5993a.put(str, i10);
            return true;
        }
    }

    int d() {
        return this.f5993a.length();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void e() {
        synchronized (this.f5993a) {
            Iterator<String> c10 = c();
            while (c10.hasNext()) {
                Object o10 = o(c10.next());
                if (o10 == null || (((o10 instanceof JSONArray) && ((JSONArray) o10).length() == 0) || (((o10 instanceof JSONObject) && ((JSONObject) o10).length() == 0) || o10.equals("")))) {
                    c10.remove();
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Map<String, String> f() {
        HashMap hashMap = new HashMap();
        synchronized (this.f5993a) {
            Iterator<String> c10 = c();
            while (c10.hasNext()) {
                String next = c10.next();
                hashMap.put(next, p(next));
            }
        }
        return hashMap;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public f1 b(String str, int i10) throws JSONException {
        synchronized (this.f5993a) {
            this.f5993a.put(str, i10);
        }
        return this;
    }

    private Iterator<String> c() {
        return this.f5993a.keys();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public f1 b(String str, long j10) throws JSONException {
        synchronized (this.f5993a) {
            this.f5993a.put(str, j10);
        }
        return this;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean a(String str) {
        boolean z10;
        synchronized (this.f5993a) {
            Iterator<String> c10 = c();
            while (true) {
                if (!c10.hasNext()) {
                    z10 = false;
                    break;
                } else if (str.equals(c10.next())) {
                    z10 = true;
                    break;
                }
            }
        }
        return z10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public f1 b(String str, double d10) throws JSONException {
        synchronized (this.f5993a) {
            this.f5993a.put(str, d10);
        }
        return this;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean a(String str, boolean z10) {
        boolean optBoolean;
        synchronized (this.f5993a) {
            optBoolean = this.f5993a.optBoolean(str, z10);
        }
        return optBoolean;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean b() {
        return d() == 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int a(String str, int i10) {
        int optInt;
        synchronized (this.f5993a) {
            optInt = this.f5993a.optInt(str, i10);
        }
        return optInt;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public long a(String str, long j10) {
        long optLong;
        synchronized (this.f5993a) {
            optLong = this.f5993a.optLong(str, j10);
        }
        return optLong;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public double a(String str, double d10) {
        double optDouble;
        synchronized (this.f5993a) {
            optDouble = this.f5993a.optDouble(str, d10);
        }
        return optDouble;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public f1 a(String str, String str2) throws JSONException {
        synchronized (this.f5993a) {
            this.f5993a.put(str, str2);
        }
        return this;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public f1 a(String str, f1 f1Var) throws JSONException {
        synchronized (this.f5993a) {
            this.f5993a.put(str, f1Var.a());
        }
        return this;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public f1 a(String str, e1 e1Var) throws JSONException {
        synchronized (this.f5993a) {
            this.f5993a.put(str, e1Var.a());
        }
        return this;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(String[] strArr) {
        synchronized (this.f5993a) {
            for (String str : strArr) {
                this.f5993a.remove(str);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(e1 e1Var) {
        synchronized (this.f5993a) {
            Iterator<String> c10 = c();
            while (c10.hasNext()) {
                if (!e1Var.a(c10.next())) {
                    c10.remove();
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public JSONObject a() {
        return this.f5993a;
    }
}
