package com.applovin.impl;

import com.applovin.impl.sdk.utils.JsonUtils;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class y4 {

    /* renamed from: a  reason: collision with root package name */
    private final JSONObject f9749a;

    /* renamed from: b  reason: collision with root package name */
    private final Object f9750b = new Object();

    public y4(JSONObject jSONObject) {
        this.f9749a = jSONObject;
    }

    public JSONObject a() {
        JSONObject deepCopy;
        synchronized (this.f9750b) {
            deepCopy = JsonUtils.deepCopy(this.f9749a);
        }
        return deepCopy;
    }

    public List b(String str, List list) {
        List<String> stringList;
        synchronized (this.f9750b) {
            stringList = JsonUtils.getStringList(this.f9749a, str, list);
        }
        return stringList;
    }

    public void c(String str) {
        synchronized (this.f9750b) {
            this.f9749a.remove(str);
        }
    }

    public String toString() {
        String jSONObject;
        synchronized (this.f9750b) {
            jSONObject = this.f9749a.toString();
        }
        return jSONObject;
    }

    public boolean a(String str) {
        boolean has;
        synchronized (this.f9750b) {
            has = this.f9749a.has(str);
        }
        return has;
    }

    public Object b(String str) {
        Object opt;
        synchronized (this.f9750b) {
            opt = this.f9749a.opt(str);
        }
        return opt;
    }

    public void a(androidx.core.util.b bVar) {
        synchronized (this.f9750b) {
            bVar.accept(this);
        }
    }

    public void b(String str, int i10) {
        synchronized (this.f9750b) {
            JsonUtils.putInt(this.f9749a, str, i10);
        }
    }

    public Object a(m.a aVar) {
        Object apply;
        synchronized (this.f9750b) {
            apply = aVar.apply(this);
        }
        return apply;
    }

    public void b(String str, long j10) {
        synchronized (this.f9750b) {
            JsonUtils.putLong(this.f9749a, str, j10);
        }
    }

    public Boolean a(String str, Boolean bool) {
        Boolean bool2;
        synchronized (this.f9750b) {
            bool2 = JsonUtils.getBoolean(this.f9749a, str, bool);
        }
        return bool2;
    }

    public void b(String str, String str2) {
        synchronized (this.f9750b) {
            JsonUtils.putString(this.f9749a, str, str2);
        }
    }

    public float a(String str, float f10) {
        float f11;
        synchronized (this.f9750b) {
            f11 = JsonUtils.getFloat(this.f9749a, str, f10);
        }
        return f11;
    }

    public double a(String str, double d10) {
        double d11;
        synchronized (this.f9750b) {
            d11 = JsonUtils.getDouble(this.f9749a, str, d10);
        }
        return d11;
    }

    public int a(String str, int i10) {
        int i11;
        synchronized (this.f9750b) {
            i11 = JsonUtils.getInt(this.f9749a, str, i10);
        }
        return i11;
    }

    public JSONArray a(String str, JSONArray jSONArray) {
        JSONArray jSONArray2;
        synchronized (this.f9750b) {
            jSONArray2 = JsonUtils.getJSONArray(this.f9749a, str, jSONArray);
        }
        return jSONArray2;
    }

    public JSONObject a(String str, JSONObject jSONObject) {
        JSONObject jSONObject2;
        synchronized (this.f9750b) {
            jSONObject2 = JsonUtils.getJSONObject(this.f9749a, str, jSONObject);
        }
        return jSONObject2;
    }

    public long a(String str, long j10) {
        long j11;
        synchronized (this.f9750b) {
            j11 = JsonUtils.getLong(this.f9749a, str, j10);
        }
        return j11;
    }

    public String a(String str, String str2) {
        String string;
        synchronized (this.f9750b) {
            string = JsonUtils.getString(this.f9749a, str, str2);
        }
        return string;
    }

    public List a(String str, List list) {
        List<Integer> integerList;
        synchronized (this.f9750b) {
            integerList = JsonUtils.getIntegerList(this.f9749a, str, list);
        }
        return integerList;
    }

    public void a(String str, boolean z10) {
        synchronized (this.f9750b) {
            JsonUtils.putBoolean(this.f9749a, str, z10);
        }
    }

    public void a(String str, Object obj) {
        synchronized (this.f9750b) {
            JsonUtils.putObject(this.f9749a, str, obj);
        }
    }
}
