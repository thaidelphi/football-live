package com.applovin.impl;

import com.applovin.impl.sdk.utils.JsonUtils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONObject;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class f7 implements g4 {

    /* renamed from: a  reason: collision with root package name */
    private final String f6988a;

    /* renamed from: b  reason: collision with root package name */
    private final List f6989b;

    /* renamed from: c  reason: collision with root package name */
    private final String f6990c;

    /* renamed from: d  reason: collision with root package name */
    private final Set f6991d;

    private f7(String str, List list, String str2, Set set) {
        this.f6988a = str;
        this.f6989b = list;
        this.f6990c = str2;
        this.f6991d = set;
    }

    public static f7 a(f8 f8Var, i7 i7Var, com.applovin.impl.sdk.j jVar) {
        try {
            String str = (String) f8Var.a().get("vendor");
            f8 b10 = f8Var.b("VerificationParameters");
            String d10 = b10 != null ? b10.d() : null;
            List<f8> a10 = f8Var.a("JavaScriptResource");
            ArrayList arrayList = new ArrayList(a10.size());
            for (f8 f8Var2 : a10) {
                l7 a11 = l7.a(f8Var2, jVar);
                if (a11 != null) {
                    arrayList.add(a11);
                }
            }
            HashMap hashMap = new HashMap();
            q7.a(f8Var, hashMap, i7Var, jVar);
            return new f7(str, arrayList, d10, (Set) hashMap.get("verificationNotExecuted"));
        } catch (Throwable th) {
            jVar.I();
            if (com.applovin.impl.sdk.n.a()) {
                jVar.I().a("VastAdVerification", "Error occurred while initializing", th);
            }
            jVar.D().a("VastAdVerification", th);
            return null;
        }
    }

    public Set b() {
        return this.f6991d;
    }

    public List c() {
        return this.f6989b;
    }

    public String d() {
        return this.f6988a;
    }

    public String e() {
        return this.f6990c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        f7 f7Var = (f7) obj;
        String str = this.f6988a;
        if (str == null ? f7Var.f6988a == null : str.equals(f7Var.f6988a)) {
            List list = this.f6989b;
            if (list == null ? f7Var.f6989b == null : list.equals(f7Var.f6989b)) {
                String str2 = this.f6990c;
                if (str2 == null ? f7Var.f6990c == null : str2.equals(f7Var.f6990c)) {
                    Set set = this.f6991d;
                    Set set2 = f7Var.f6991d;
                    return set != null ? set.equals(set2) : set2 == null;
                }
                return false;
            }
            return false;
        }
        return false;
    }

    public int hashCode() {
        String str = this.f6988a;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        List list = this.f6989b;
        int hashCode2 = (hashCode + (list != null ? list.hashCode() : 0)) * 31;
        String str2 = this.f6990c;
        int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31;
        Set set = this.f6991d;
        return hashCode3 + (set != null ? set.hashCode() : 0);
    }

    public String toString() {
        return "VastAdVerification{vendorId='" + this.f6988a + "'javascriptResources='" + this.f6989b + "'verificationParameters='" + this.f6990c + "'errorEventTrackers='" + this.f6991d + "'}";
    }

    public static f7 a(JSONObject jSONObject, com.applovin.impl.sdk.j jVar) {
        if (jSONObject == null) {
            return null;
        }
        String string = JsonUtils.getString(jSONObject, "vendor_id", null);
        JSONArray jSONArray = JsonUtils.getJSONArray(jSONObject, "javascript_resources", new JSONArray());
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < jSONArray.length(); i10++) {
            l7 a10 = l7.a(JsonUtils.getJSONObject(jSONArray, i10, (JSONObject) null), jVar);
            if (a10 != null) {
                arrayList.add(a10);
            }
        }
        String string2 = JsonUtils.getString(jSONObject, "verification_parameters", null);
        JSONArray jSONArray2 = JsonUtils.getJSONArray(jSONObject, "error_event_trackers", new JSONArray());
        HashSet hashSet = new HashSet();
        for (int i11 = 0; i11 < jSONArray2.length(); i11++) {
            o7 a11 = o7.a(JsonUtils.getJSONObject(jSONArray2, i11, (JSONObject) null), jVar);
            if (a11 != null) {
                hashSet.add(a11);
            }
        }
        return new f7(string, arrayList, string2, hashSet);
    }

    @Override // com.applovin.impl.g4
    public JSONObject a() {
        JSONObject jSONObject = new JSONObject();
        JsonUtils.putString(jSONObject, "vendor_id", this.f6988a);
        if (this.f6989b != null) {
            JSONArray jSONArray = new JSONArray();
            for (l7 l7Var : this.f6989b) {
                jSONArray.put(l7Var.a());
            }
            JsonUtils.putJsonArray(jSONObject, "javascript_resources", jSONArray);
        }
        JsonUtils.putString(jSONObject, "verification_parameters", this.f6990c);
        if (this.f6991d != null) {
            JSONArray jSONArray2 = new JSONArray();
            for (o7 o7Var : this.f6991d) {
                jSONArray2.put(o7Var.a());
            }
            JsonUtils.putJsonArray(jSONObject, "error_event_trackers", jSONArray2);
        }
        return jSONObject;
    }
}
