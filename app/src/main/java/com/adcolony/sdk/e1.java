package com.adcolony.sdk;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class e1 {

    /* renamed from: a  reason: collision with root package name */
    private final JSONArray f5985a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public e1() {
        this(new JSONArray());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Object a(int i10) throws JSONException {
        return this.f5985a.get(i10);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int b(int i10) throws JSONException {
        return this.f5985a.getInt(i10);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public f1 c(int i10) {
        f1 f1Var;
        synchronized (this.f5985a) {
            JSONObject optJSONObject = this.f5985a.optJSONObject(i10);
            f1Var = optJSONObject != null ? new f1(optJSONObject) : new f1();
        }
        return f1Var;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public String d(int i10) {
        String optString;
        synchronized (this.f5985a) {
            optString = this.f5985a.optString(i10);
        }
        return optString;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public String e(int i10) {
        synchronized (this.f5985a) {
            if (!this.f5985a.isNull(i10)) {
                Object opt = this.f5985a.opt(i10);
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
    public e1 f(int i10) {
        synchronized (this.f5985a) {
            this.f5985a.put(i10);
        }
        return this;
    }

    public String toString() {
        String jSONArray;
        synchronized (this.f5985a) {
            jSONArray = this.f5985a.toString();
        }
        return jSONArray;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public e1(String str) throws JSONException {
        this(new JSONArray(str));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public e1 a(f1 f1Var) {
        synchronized (this.f5985a) {
            this.f5985a.put(f1Var.a());
        }
        return this;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public e1 b(String str) {
        synchronized (this.f5985a) {
            this.f5985a.put(str);
        }
        return this;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public e1(JSONArray jSONArray) throws NullPointerException {
        jSONArray.getClass();
        this.f5985a = jSONArray;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public String[] d() {
        String[] strArr;
        synchronized (this.f5985a) {
            strArr = new String[this.f5985a.length()];
            for (int i10 = 0; i10 < this.f5985a.length(); i10++) {
                strArr[i10] = d(i10);
            }
        }
        return strArr;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean a(String str) {
        boolean z10;
        synchronized (this.f5985a) {
            z10 = false;
            int i10 = 0;
            while (true) {
                if (i10 >= this.f5985a.length()) {
                    break;
                } else if (d(i10).equals(str)) {
                    z10 = true;
                    break;
                } else {
                    i10++;
                }
            }
        }
        return z10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int b() {
        return this.f5985a.length();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public f1[] c() {
        f1[] f1VarArr;
        synchronized (this.f5985a) {
            f1VarArr = new f1[this.f5985a.length()];
            for (int i10 = 0; i10 < this.f5985a.length(); i10++) {
                f1VarArr[i10] = c(i10);
            }
        }
        return f1VarArr;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public JSONArray a() {
        return this.f5985a;
    }
}
