package com.applovin.impl;

import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.mediation.MaxAdFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class j implements Comparable {

    /* renamed from: a  reason: collision with root package name */
    private final String f7258a;

    /* renamed from: b  reason: collision with root package name */
    private final String f7259b;

    /* renamed from: c  reason: collision with root package name */
    private final MaxAdFormat f7260c;

    /* renamed from: d  reason: collision with root package name */
    private final k f7261d;

    /* renamed from: e  reason: collision with root package name */
    private final List f7262e;

    public j(JSONObject jSONObject, Map map, com.applovin.impl.sdk.j jVar) {
        this.f7258a = JsonUtils.getString(jSONObject, "name", "");
        this.f7259b = JsonUtils.getString(jSONObject, "display_name", "");
        this.f7260c = MaxAdFormat.formatFromString(JsonUtils.getString(jSONObject, "format", null));
        JSONArray jSONArray = JsonUtils.getJSONArray(jSONObject, "waterfalls", new JSONArray());
        this.f7262e = new ArrayList(jSONArray.length());
        for (int i10 = 0; i10 < jSONArray.length(); i10++) {
            JSONObject jSONObject2 = JsonUtils.getJSONObject(jSONArray, i10, (JSONObject) null);
            if (jSONObject2 != null) {
                this.f7262e.add(new k(jSONObject2, map, this.f7260c, jVar));
            }
        }
        this.f7261d = this.f7262e.isEmpty() ? null : (k) this.f7262e.get(0);
    }

    public MaxAdFormat a() {
        return this.f7260c;
    }

    public String b() {
        MaxAdFormat maxAdFormat = this.f7260c;
        return maxAdFormat != null ? maxAdFormat.getLabel() : "Unknown";
    }

    public String c() {
        return this.f7258a;
    }

    public String d() {
        return this.f7259b;
    }

    public String e() {
        return "\n---------- " + this.f7259b + " ----------\nIdentifier - " + this.f7258a + "\nFormat     - " + b();
    }

    public k f() {
        return this.f7261d;
    }

    public List g() {
        return this.f7262e;
    }

    @Override // java.lang.Comparable
    /* renamed from: a */
    public int compareTo(j jVar) {
        return this.f7259b.compareToIgnoreCase(jVar.f7259b);
    }
}
