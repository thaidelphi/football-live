package com.applovin.impl;

import android.net.Uri;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONObject;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class h7 implements g4 {

    /* renamed from: a  reason: collision with root package name */
    private int f7152a;

    /* renamed from: b  reason: collision with root package name */
    private int f7153b;

    /* renamed from: c  reason: collision with root package name */
    private Uri f7154c;

    /* renamed from: d  reason: collision with root package name */
    private m7 f7155d;

    /* renamed from: e  reason: collision with root package name */
    private final Set f7156e = new HashSet();

    /* renamed from: f  reason: collision with root package name */
    private final Map f7157f = new HashMap();

    private h7() {
    }

    public static h7 a(f8 f8Var, h7 h7Var, i7 i7Var, com.applovin.impl.sdk.j jVar) {
        f8 c10;
        if (f8Var != null) {
            if (jVar != null) {
                if (h7Var == null) {
                    try {
                        h7Var = new h7();
                    } catch (Throwable th) {
                        jVar.I();
                        if (com.applovin.impl.sdk.n.a()) {
                            jVar.I().a("VastCompanionAd", "Error occurred while initializing", th);
                        }
                        jVar.D().a("VastCompanionAd", th);
                        return null;
                    }
                }
                if (h7Var.f7152a == 0 && h7Var.f7153b == 0) {
                    int parseInt = StringUtils.parseInt((String) f8Var.a().get("width"));
                    int parseInt2 = StringUtils.parseInt((String) f8Var.a().get("height"));
                    if (parseInt > 0 && parseInt2 > 0) {
                        h7Var.f7152a = parseInt;
                        h7Var.f7153b = parseInt2;
                    }
                }
                h7Var.f7155d = m7.a(f8Var, h7Var.f7155d, jVar);
                if (h7Var.f7154c == null && (c10 = f8Var.c("CompanionClickThrough")) != null) {
                    String d10 = c10.d();
                    if (StringUtils.isValidString(d10)) {
                        h7Var.f7154c = Uri.parse(d10);
                    }
                }
                q7.a(f8Var.a("CompanionClickTracking"), h7Var.f7156e, i7Var, jVar);
                q7.a(f8Var, h7Var.f7157f, i7Var, jVar);
                return h7Var;
            }
            throw new IllegalArgumentException("No sdk specified.");
        }
        throw new IllegalArgumentException("No node specified.");
    }

    public Set b() {
        return this.f7156e;
    }

    public Uri c() {
        return this.f7154c;
    }

    public Map d() {
        return this.f7157f;
    }

    public m7 e() {
        return this.f7155d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof h7) {
            h7 h7Var = (h7) obj;
            if (this.f7152a == h7Var.f7152a && this.f7153b == h7Var.f7153b) {
                Uri uri = this.f7154c;
                if (uri == null ? h7Var.f7154c == null : uri.equals(h7Var.f7154c)) {
                    m7 m7Var = this.f7155d;
                    if (m7Var == null ? h7Var.f7155d == null : m7Var.equals(h7Var.f7155d)) {
                        Set set = this.f7156e;
                        if (set == null ? h7Var.f7156e == null : set.equals(h7Var.f7156e)) {
                            Map map = this.f7157f;
                            Map map2 = h7Var.f7157f;
                            return map != null ? map.equals(map2) : map2 == null;
                        }
                        return false;
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
        int i10 = ((this.f7152a * 31) + this.f7153b) * 31;
        Uri uri = this.f7154c;
        int hashCode = (i10 + (uri != null ? uri.hashCode() : 0)) * 31;
        m7 m7Var = this.f7155d;
        int hashCode2 = (hashCode + (m7Var != null ? m7Var.hashCode() : 0)) * 31;
        Set set = this.f7156e;
        int hashCode3 = (hashCode2 + (set != null ? set.hashCode() : 0)) * 31;
        Map map = this.f7157f;
        return hashCode3 + (map != null ? map.hashCode() : 0);
    }

    public String toString() {
        return "VastCompanionAd{width=" + this.f7152a + ", height=" + this.f7153b + ", destinationUri=" + this.f7154c + ", nonVideoResource=" + this.f7155d + ", clickTrackers=" + this.f7156e + ", eventTrackers=" + this.f7157f + '}';
    }

    public static h7 a(JSONObject jSONObject, com.applovin.impl.sdk.j jVar) {
        if (jSONObject == null) {
            return null;
        }
        int i10 = JsonUtils.getInt(jSONObject, "width", 0);
        int i11 = JsonUtils.getInt(jSONObject, "height", 0);
        String string = JsonUtils.getString(jSONObject, "destination_uri", null);
        Uri parse = StringUtils.isValidString(string) ? Uri.parse(string) : null;
        m7 a10 = m7.a(JsonUtils.getJSONObject(jSONObject, "non_video_resource", (JSONObject) null), jVar);
        JSONArray jSONArray = JsonUtils.getJSONArray(jSONObject, "click_trackers", new JSONArray());
        HashSet hashSet = new HashSet();
        for (int i12 = 0; i12 < jSONArray.length(); i12++) {
            o7 a11 = o7.a(JsonUtils.getJSONObject(jSONArray, i12, (JSONObject) null), jVar);
            if (a11 != null) {
                hashSet.add(a11);
            }
        }
        h7 h7Var = new h7();
        h7Var.f7152a = i10;
        h7Var.f7153b = i11;
        h7Var.f7154c = parse;
        h7Var.f7155d = a10;
        h7Var.f7156e.addAll(hashSet);
        return h7Var;
    }

    @Override // com.applovin.impl.g4
    public JSONObject a() {
        JSONObject jSONObject = new JSONObject();
        JsonUtils.putInt(jSONObject, "width", this.f7152a);
        JsonUtils.putInt(jSONObject, "height", this.f7153b);
        Uri uri = this.f7154c;
        JsonUtils.putString(jSONObject, "destination_uri", uri == null ? null : uri.toString());
        m7 m7Var = this.f7155d;
        JsonUtils.putJSONObject(jSONObject, "non_video_resource", m7Var != null ? m7Var.a() : null);
        JSONArray jSONArray = new JSONArray();
        for (o7 o7Var : this.f7156e) {
            jSONArray.put(o7Var.a());
        }
        JsonUtils.putJsonArray(jSONObject, "click_trackers", jSONArray);
        return jSONObject;
    }
}
