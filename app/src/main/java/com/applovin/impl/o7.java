package com.applovin.impl;

import android.text.TextUtils;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.ironsource.ug;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class o7 implements g4 {

    /* renamed from: a  reason: collision with root package name */
    private String f8286a;

    /* renamed from: b  reason: collision with root package name */
    private String f8287b;

    /* renamed from: c  reason: collision with root package name */
    private String f8288c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f8289d;

    /* renamed from: e  reason: collision with root package name */
    private long f8290e = -1;

    /* renamed from: f  reason: collision with root package name */
    private int f8291f = -1;

    private o7() {
    }

    public static o7 a(f8 f8Var, i7 i7Var, com.applovin.impl.sdk.j jVar) {
        List<String> explode;
        int size;
        long seconds;
        if (f8Var != null) {
            if (jVar != null) {
                try {
                    String d10 = f8Var.d();
                    if (TextUtils.isEmpty(d10)) {
                        jVar.I();
                        if (com.applovin.impl.sdk.n.a()) {
                            jVar.I().b("VastTracker", "Unable to create tracker. Could not find URL.");
                        }
                        return null;
                    }
                    o7 o7Var = new o7();
                    o7Var.f8288c = d10;
                    o7Var.f8286a = (String) f8Var.a().get(ug.f21009x);
                    o7Var.f8287b = (String) f8Var.a().get("event");
                    o7Var.f8289d = ((Boolean) jVar.a(o4.R4)).booleanValue();
                    if (i7Var != null) {
                        o7Var.f8289d = JsonUtils.getBoolean(i7Var.b(), "vast_fire_trackers_from_webview", Boolean.valueOf(o7Var.f8289d)).booleanValue();
                    }
                    o7Var.f8291f = a(o7Var.b(), i7Var);
                    String str = (String) f8Var.a().get("offset");
                    if (StringUtils.isValidString(str)) {
                        String trim = str.trim();
                        if (trim.contains("%")) {
                            o7Var.f8291f = StringUtils.parseInt(trim.substring(0, trim.length() - 1));
                        } else if (trim.contains(":") && (size = (explode = CollectionUtils.explode(trim, ":")).size()) > 0) {
                            long j10 = 0;
                            int i10 = size - 1;
                            for (int i11 = i10; i11 >= 0; i11--) {
                                String str2 = explode.get(i11);
                                if (StringUtils.isNumeric(str2)) {
                                    int parseInt = Integer.parseInt(str2);
                                    if (i11 == i10) {
                                        seconds = parseInt;
                                    } else if (i11 == size - 2) {
                                        seconds = TimeUnit.MINUTES.toSeconds(parseInt);
                                    } else if (i11 == size - 3) {
                                        seconds = TimeUnit.HOURS.toSeconds(parseInt);
                                    }
                                    j10 += seconds;
                                }
                            }
                            o7Var.f8290e = j10;
                            o7Var.f8291f = -1;
                        }
                    }
                    return o7Var;
                } catch (Throwable th) {
                    jVar.I();
                    if (com.applovin.impl.sdk.n.a()) {
                        jVar.I().a("VastTracker", "Error occurred while initializing", th);
                    }
                    jVar.D().a("VastTracker", th);
                    return null;
                }
            }
            throw new IllegalArgumentException("No sdk specified.");
        }
        throw new IllegalArgumentException("No node specified.");
    }

    public String b() {
        return this.f8287b;
    }

    public String c() {
        return this.f8288c;
    }

    public boolean d() {
        return this.f8289d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof o7) {
            o7 o7Var = (o7) obj;
            if (this.f8290e == o7Var.f8290e && this.f8291f == o7Var.f8291f) {
                String str = this.f8286a;
                if (str == null ? o7Var.f8286a == null : str.equals(o7Var.f8286a)) {
                    String str2 = this.f8287b;
                    if (str2 == null ? o7Var.f8287b == null : str2.equals(o7Var.f8287b)) {
                        return this.f8288c.equals(o7Var.f8288c);
                    }
                    return false;
                }
                return false;
            }
            return false;
        }
        return false;
    }

    public int hashCode() {
        String str = this.f8286a;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f8287b;
        int hashCode2 = str2 != null ? str2.hashCode() : 0;
        long j10 = this.f8290e;
        return ((((((hashCode + hashCode2) * 31) + this.f8288c.hashCode()) * 31) + ((int) (j10 ^ (j10 >>> 32)))) * 31) + this.f8291f;
    }

    public String toString() {
        return "VastTracker{identifier='" + this.f8286a + "', event='" + this.f8287b + "', uriString='" + this.f8288c + "', offsetSeconds=" + this.f8290e + ", offsetPercent=" + this.f8291f + '}';
    }

    public boolean a(long j10, int i10) {
        long j11 = this.f8290e;
        boolean z10 = j11 >= 0;
        boolean z11 = j10 >= j11;
        int i11 = this.f8291f;
        boolean z12 = i11 >= 0;
        boolean z13 = i10 >= i11;
        if (z10 && z11) {
            return true;
        }
        return z12 && z13;
    }

    private static int a(String str, i7 i7Var) {
        if ("start".equalsIgnoreCase(str)) {
            return 0;
        }
        if ("firstQuartile".equalsIgnoreCase(str)) {
            return 25;
        }
        if ("midpoint".equalsIgnoreCase(str)) {
            return 50;
        }
        if ("thirdQuartile".equalsIgnoreCase(str)) {
            return 75;
        }
        if ("complete".equalsIgnoreCase(str)) {
            if (i7Var != null) {
                return i7Var.g();
            }
            return 95;
        }
        return -1;
    }

    public static o7 a(JSONObject jSONObject, com.applovin.impl.sdk.j jVar) {
        if (jSONObject == null) {
            return null;
        }
        o7 o7Var = new o7();
        String string = JsonUtils.getString(jSONObject, "uri_string", "");
        if (TextUtils.isEmpty(string)) {
            return null;
        }
        o7Var.f8288c = string;
        o7Var.f8286a = JsonUtils.getString(jSONObject, "identifier", "");
        o7Var.f8287b = JsonUtils.getString(jSONObject, "event", "");
        o7Var.f8290e = JsonUtils.getLong(jSONObject, "offset_seconds", -1L);
        o7Var.f8291f = JsonUtils.getInt(jSONObject, "offset_percent", -1);
        return o7Var;
    }

    @Override // com.applovin.impl.g4
    public JSONObject a() {
        JSONObject jSONObject = new JSONObject();
        JsonUtils.putString(jSONObject, "identifier", this.f8286a);
        JsonUtils.putString(jSONObject, "event", this.f8287b);
        JsonUtils.putString(jSONObject, "uri_string", this.f8288c);
        JsonUtils.putLong(jSONObject, "offset_seconds", this.f8290e);
        JsonUtils.putInt(jSONObject, "offset_percent", this.f8291f);
        return jSONObject;
    }
}
