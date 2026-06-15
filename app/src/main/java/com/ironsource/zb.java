package com.ironsource;

import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.q9;
import java.util.UUID;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public class zb {

    /* renamed from: e  reason: collision with root package name */
    static final String f21645e = "euid";

    /* renamed from: f  reason: collision with root package name */
    static final String f21646f = "esat";

    /* renamed from: g  reason: collision with root package name */
    static final String f21647g = "esfr";

    /* renamed from: h  reason: collision with root package name */
    static final int f21648h = 1;

    /* renamed from: a  reason: collision with root package name */
    private int f21649a;

    /* renamed from: b  reason: collision with root package name */
    private long f21650b;

    /* renamed from: c  reason: collision with root package name */
    private int f21651c;

    /* renamed from: d  reason: collision with root package name */
    private final JSONObject f21652d;

    public zb(int i10, long j10, String str) throws JSONException {
        this(i10, j10, new JSONObject(str));
    }

    public zb(int i10, long j10, JSONObject jSONObject) {
        this.f21651c = 1;
        this.f21649a = i10;
        this.f21650b = j10;
        jSONObject = jSONObject == null ? new JSONObject() : jSONObject;
        this.f21652d = jSONObject;
        if (!jSONObject.has(f21645e)) {
            a(f21645e, UUID.randomUUID().toString());
        }
        if (jSONObject.has(f21646f)) {
            this.f21651c = jSONObject.optInt(f21646f, 1);
        } else {
            a(f21646f, Integer.valueOf(this.f21651c));
        }
    }

    public zb(int i10, JSONObject jSONObject) {
        this(i10, new q9.a().a(), jSONObject);
    }

    public String a() {
        return this.f21652d.toString();
    }

    public void a(int i10) {
        this.f21649a = i10;
    }

    public void a(String str) {
        a(f21647g, str);
        int i10 = this.f21651c + 1;
        this.f21651c = i10;
        a(f21646f, Integer.valueOf(i10));
    }

    public void a(String str, Object obj) {
        if (str == null || obj == null) {
            return;
        }
        try {
            this.f21652d.put(str, obj);
        } catch (JSONException e8) {
            o9.d().a(e8);
            IronLog.INTERNAL.error(e8.toString());
        }
    }

    public JSONObject b() {
        return this.f21652d;
    }

    public int c() {
        return this.f21649a;
    }

    public long d() {
        return this.f21650b;
    }

    public boolean equals(Object obj) {
        if (obj != null && getClass() == obj.getClass()) {
            zb zbVar = (zb) obj;
            return this.f21649a == zbVar.f21649a && this.f21650b == zbVar.f21650b && this.f21651c == zbVar.f21651c && xk.a(this.f21652d, zbVar.f21652d);
        }
        return false;
    }

    public int hashCode() {
        return (((((this.f21649a * 31) + androidx.privacysandbox.ads.adservices.topics.d.a(this.f21650b)) * 31) + this.f21652d.toString().hashCode()) * 31) + this.f21651c;
    }

    public String toString() {
        return ("{\"eventId\":" + c() + ",\"timestamp\":" + d() + "," + a().substring(1) + "}").replace(",", "\n");
    }
}
