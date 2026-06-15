package com.applovin.impl;

import android.net.Uri;
import android.text.TextUtils;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.ironsource.b9;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONObject;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class e7 extends com.applovin.impl.sdk.ad.b {

    /* renamed from: k  reason: collision with root package name */
    private final String f6889k;

    /* renamed from: l  reason: collision with root package name */
    private final String f6890l;

    /* renamed from: m  reason: collision with root package name */
    private final n7 f6891m;

    /* renamed from: n  reason: collision with root package name */
    private final long f6892n;

    /* renamed from: o  reason: collision with root package name */
    private final r7 f6893o;

    /* renamed from: p  reason: collision with root package name */
    private final h7 f6894p;

    /* renamed from: q  reason: collision with root package name */
    private final String f6895q;

    /* renamed from: r  reason: collision with root package name */
    private final g7 f6896r;

    /* renamed from: s  reason: collision with root package name */
    private final b4 f6897s;

    /* renamed from: t  reason: collision with root package name */
    private final Set f6898t;

    /* renamed from: u  reason: collision with root package name */
    private final Set f6899u;

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public static class b {

        /* renamed from: a  reason: collision with root package name */
        private JSONObject f6900a;

        /* renamed from: b  reason: collision with root package name */
        private JSONObject f6901b;

        /* renamed from: c  reason: collision with root package name */
        private com.applovin.impl.sdk.j f6902c;

        /* renamed from: d  reason: collision with root package name */
        private long f6903d;

        /* renamed from: e  reason: collision with root package name */
        private String f6904e;

        /* renamed from: f  reason: collision with root package name */
        private String f6905f;

        /* renamed from: g  reason: collision with root package name */
        private n7 f6906g;

        /* renamed from: h  reason: collision with root package name */
        private r7 f6907h;

        /* renamed from: i  reason: collision with root package name */
        private h7 f6908i;

        /* renamed from: j  reason: collision with root package name */
        private g7 f6909j;

        /* renamed from: k  reason: collision with root package name */
        private Set f6910k;

        /* renamed from: l  reason: collision with root package name */
        private Set f6911l;

        public b b(JSONObject jSONObject) {
            if (jSONObject != null) {
                this.f6901b = jSONObject;
                return this;
            }
            throw new IllegalArgumentException("No full ad response specified.");
        }

        public b b(String str) {
            this.f6904e = str;
            return this;
        }

        public b b(Set set) {
            this.f6910k = set;
            return this;
        }

        public b a(JSONObject jSONObject) {
            if (jSONObject != null) {
                this.f6900a = jSONObject;
                return this;
            }
            throw new IllegalArgumentException("No ad object specified.");
        }

        public b a(com.applovin.impl.sdk.j jVar) {
            if (jVar != null) {
                this.f6902c = jVar;
                return this;
            }
            throw new IllegalArgumentException("No sdk specified.");
        }

        public b a(String str) {
            this.f6905f = str;
            return this;
        }

        public b a(n7 n7Var) {
            this.f6906g = n7Var;
            return this;
        }

        public b a(r7 r7Var) {
            this.f6907h = r7Var;
            return this;
        }

        public b a(h7 h7Var) {
            this.f6908i = h7Var;
            return this;
        }

        public b a(g7 g7Var) {
            this.f6909j = g7Var;
            return this;
        }

        public b a(Set set) {
            this.f6911l = set;
            return this;
        }

        public b a(long j10) {
            this.f6903d = j10;
            return this;
        }

        public e7 a() {
            return new e7(this);
        }
    }

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public enum c {
        COMPANION_AD,
        VIDEO
    }

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public enum d {
        IMPRESSION,
        VIDEO_CLICK,
        COMPANION_CLICK,
        VIDEO,
        COMPANION,
        INDUSTRY_ICON_IMPRESSION,
        INDUSTRY_ICON_CLICK,
        ERROR
    }

    private Set f1() {
        h7 h7Var = this.f6894p;
        if (h7Var != null) {
            return h7Var.b();
        }
        return Collections.emptySet();
    }

    private String i1() {
        String stringFromAdObject = getStringFromAdObject("vimp_url", null);
        if (stringFromAdObject != null) {
            return stringFromAdObject.replace("{CLCODE}", getClCode());
        }
        return null;
    }

    private Set m1() {
        r7 r7Var = this.f6893o;
        if (r7Var != null) {
            return r7Var.b();
        }
        return Collections.emptySet();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ List t(y4 y4Var) {
        return d7.a(y4Var.a("vimp_urls", new JSONObject()), getClCode(), null, i1(), R(), Q0(), this.sdk);
    }

    @Override // com.applovin.impl.sdk.ad.b
    public boolean C0() {
        return getBooleanFromFullResponse("is_persisted_ad", false);
    }

    @Override // com.applovin.impl.sdk.ad.b
    public List F() {
        List a10;
        y4 y4Var = this.synchronizedAdObject;
        if (y4Var != null) {
            return (List) y4Var.a(new m.a() { // from class: com.applovin.impl.ea
                @Override // m.a
                public final Object apply(Object obj) {
                    List t10;
                    t10 = e7.this.t((y4) obj);
                    return t10;
                }
            });
        }
        synchronized (this.adObjectLock) {
            a10 = d7.a(getJsonObjectFromAdObject("vimp_urls", new JSONObject()), getClCode(), null, i1(), R(), Q0(), this.sdk);
        }
        return a10;
    }

    @Override // com.applovin.impl.sdk.ad.b
    public boolean F0() {
        return getBooleanFromAdObject("video_clickable", Boolean.FALSE) && j() != null;
    }

    @Override // com.applovin.impl.sdk.ad.b
    public boolean G0() {
        return getBooleanFromAdObject("vast_is_streaming", Boolean.FALSE);
    }

    @Override // com.applovin.impl.sdk.ad.b
    public void I0() {
    }

    @Override // com.applovin.impl.sdk.ad.b
    public String Q() {
        return this.f6895q;
    }

    public Set a(d dVar, String str) {
        return a(dVar, new String[]{str});
    }

    public void b(String str) {
        y4 y4Var = this.synchronizedAdObject;
        if (y4Var != null) {
            y4Var.b("html_template", str);
            return;
        }
        synchronized (this.adObjectLock) {
            JsonUtils.putString(this.adObject, "html_template", str);
        }
    }

    public g7 d1() {
        return this.f6896r;
    }

    public h7 e1() {
        return this.f6894p;
    }

    @Override // com.applovin.impl.sdk.ad.AppLovinAdImpl
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof e7) && super.equals(obj)) {
            e7 e7Var = (e7) obj;
            String str = this.f6889k;
            if (str == null ? e7Var.f6889k == null : str.equals(e7Var.f6889k)) {
                String str2 = this.f6890l;
                if (str2 == null ? e7Var.f6890l == null : str2.equals(e7Var.f6890l)) {
                    n7 n7Var = this.f6891m;
                    if (n7Var == null ? e7Var.f6891m == null : n7Var.equals(e7Var.f6891m)) {
                        r7 r7Var = this.f6893o;
                        if (r7Var == null ? e7Var.f6893o == null : r7Var.equals(e7Var.f6893o)) {
                            h7 h7Var = this.f6894p;
                            if (h7Var == null ? e7Var.f6894p == null : h7Var.equals(e7Var.f6894p)) {
                                g7 g7Var = this.f6896r;
                                if (g7Var == null ? e7Var.f6896r == null : g7Var.equals(e7Var.f6896r)) {
                                    Set set = this.f6898t;
                                    if (set == null ? e7Var.f6898t == null : set.equals(e7Var.f6898t)) {
                                        Set set2 = this.f6899u;
                                        Set set3 = e7Var.f6899u;
                                        return set2 != null ? set2.equals(set3) : set3 == null;
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
                return false;
            }
            return false;
        }
        return false;
    }

    public String g1() {
        return getStringFromAdObject("html_template", "");
    }

    @Override // com.applovin.impl.sdk.AppLovinAdBase
    public long getCreatedAtMillis() {
        return this.f6892n;
    }

    @Override // com.applovin.impl.sdk.ad.AppLovinAdImpl
    public JSONObject getOriginalFullResponse() {
        return this.fullResponse;
    }

    @Override // com.applovin.impl.sdk.ad.b
    public Uri h0() {
        return j();
    }

    public c h1() {
        if ("companion_ad".equalsIgnoreCase(getStringFromAdObject("vast_first_caching_operation", "companion_ad"))) {
            return c.COMPANION_AD;
        }
        return c.VIDEO;
    }

    @Override // com.applovin.impl.sdk.ad.AppLovinAdImpl
    public boolean hasVideoUrl() {
        List g10;
        r7 r7Var = this.f6893o;
        return (r7Var == null || (g10 = r7Var.g()) == null || g10.size() <= 0) ? false : true;
    }

    @Override // com.applovin.impl.sdk.ad.AppLovinAdImpl
    public int hashCode() {
        int hashCode = super.hashCode() * 31;
        String str = this.f6889k;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f6890l;
        int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31;
        n7 n7Var = this.f6891m;
        int hashCode4 = (hashCode3 + (n7Var != null ? n7Var.hashCode() : 0)) * 31;
        r7 r7Var = this.f6893o;
        int hashCode5 = (hashCode4 + (r7Var != null ? r7Var.hashCode() : 0)) * 31;
        h7 h7Var = this.f6894p;
        int hashCode6 = (hashCode5 + (h7Var != null ? h7Var.hashCode() : 0)) * 31;
        g7 g7Var = this.f6896r;
        int hashCode7 = (hashCode6 + (g7Var != null ? g7Var.hashCode() : 0)) * 31;
        Set set = this.f6898t;
        int hashCode8 = (hashCode7 + (set != null ? set.hashCode() : 0)) * 31;
        Set set2 = this.f6899u;
        return hashCode8 + (set2 != null ? set2.hashCode() : 0);
    }

    @Override // com.applovin.impl.sdk.ad.b, com.applovin.impl.sdk.AppLovinAdBase, com.applovin.impl.u3
    public boolean isOpenMeasurementEnabled() {
        return getBooleanFromAdObject("omsdk_enabled", Boolean.TRUE) && this.f6896r != null;
    }

    @Override // com.applovin.impl.sdk.ad.b
    public Uri j() {
        r7 r7Var = this.f6893o;
        if (r7Var != null) {
            return r7Var.c();
        }
        return null;
    }

    public k7 j1() {
        r7 r7Var = this.f6893o;
        if (r7Var != null) {
            return r7Var.f();
        }
        return null;
    }

    public long k1() {
        return getLongFromAdObject("real_close_delay", 0L);
    }

    public n7 l1() {
        return this.f6891m;
    }

    public r7 n1() {
        return this.f6893o;
    }

    public s7 o1() {
        Long f10 = o0.f(this.sdk);
        return this.f6893o.a(f10 != null ? f10.longValue() : 0L);
    }

    public boolean p1() {
        return j1() != null;
    }

    @Override // com.applovin.impl.sdk.ad.b
    public Uri q0() {
        s7 o12 = o1();
        if (o12 != null) {
            return o12.e();
        }
        return null;
    }

    public boolean q1() {
        return getBooleanFromAdObject("vast_immediate_ad_load", Boolean.TRUE);
    }

    public void r1() {
        y4 y4Var = this.synchronizedAdObject;
        if (y4Var != null) {
            y4Var.c("vast_is_streaming");
            return;
        }
        synchronized (this.adObjectLock) {
            this.adObject.remove("vast_is_streaming");
        }
    }

    public boolean s1() {
        return getBooleanFromAdObject("cache_companion_ad", Boolean.TRUE);
    }

    public boolean t1() {
        return getBooleanFromAdObject("cache_video", Boolean.TRUE);
    }

    @Override // com.applovin.impl.sdk.ad.AppLovinAdImpl
    public String toString() {
        return "VastAd{title='" + this.f6889k + "', adDescription='" + this.f6890l + "', systemInfo=" + this.f6891m + ", videoCreative=" + this.f6893o + ", companionAd=" + this.f6894p + ", adVerifications=" + this.f6896r + ", impressionTrackers=" + this.f6898t + ", errorTrackers=" + this.f6899u + '}';
    }

    public boolean u1() {
        return getBooleanFromAdObject("vast_fire_click_trackers_on_html_clicks", Boolean.FALSE);
    }

    public boolean v1() {
        return getBooleanFromAdObject("iopms", Boolean.FALSE);
    }

    public boolean w1() {
        return getBooleanFromAdObject("iopmsfsr", Boolean.TRUE);
    }

    private e7(b bVar) {
        super(bVar.f6900a, bVar.f6901b, bVar.f6902c);
        this.f6889k = bVar.f6904e;
        this.f6891m = bVar.f6906g;
        this.f6890l = bVar.f6905f;
        this.f6893o = bVar.f6907h;
        this.f6894p = bVar.f6908i;
        this.f6896r = bVar.f6909j;
        this.f6898t = bVar.f6910k;
        this.f6899u = bVar.f6911l;
        this.f6897s = new b4(this);
        Uri q02 = q0();
        if (q02 != null) {
            this.f6895q = q02.toString();
        } else {
            this.f6895q = "";
        }
        this.f6892n = bVar.f6903d;
    }

    public Set a(d dVar, String[] strArr) {
        this.sdk.I();
        if (com.applovin.impl.sdk.n.a()) {
            com.applovin.impl.sdk.n I = this.sdk.I();
            I.a("VastAd", "Retrieving trackers of type '" + dVar + "' and events '" + Arrays.toString(strArr) + "'...");
        }
        if (dVar == d.IMPRESSION) {
            return this.f6898t;
        }
        if (dVar == d.VIDEO_CLICK) {
            return m1();
        }
        if (dVar == d.COMPANION_CLICK) {
            return f1();
        }
        if (dVar == d.VIDEO) {
            return a(c.VIDEO, strArr);
        }
        if (dVar == d.COMPANION) {
            return a(c.COMPANION_AD, strArr);
        }
        if (dVar == d.INDUSTRY_ICON_CLICK) {
            return j1().b();
        }
        if (dVar == d.INDUSTRY_ICON_IMPRESSION) {
            return j1().f();
        }
        if (dVar == d.ERROR) {
            return this.f6899u;
        }
        this.sdk.I();
        if (com.applovin.impl.sdk.n.a()) {
            com.applovin.impl.sdk.n I2 = this.sdk.I();
            I2.b("VastAd", "Failed to retrieve trackers of invalid type '" + dVar + "' and events '" + Arrays.toString(strArr) + "'");
        }
        return Collections.emptySet();
    }

    @Override // com.applovin.impl.sdk.ad.b, com.applovin.impl.sdk.AppLovinAdBase, com.applovin.impl.u3
    public b4 getAdEventTracker() {
        return this.f6897s;
    }

    private Set a(c cVar, String[] strArr) {
        h7 h7Var;
        r7 r7Var;
        if (strArr != null && strArr.length > 0) {
            Map map = null;
            if (cVar == c.VIDEO && (r7Var = this.f6893o) != null) {
                map = r7Var.e();
            } else if (cVar == c.COMPANION_AD && (h7Var = this.f6894p) != null) {
                map = h7Var.d();
            }
            HashSet hashSet = new HashSet();
            if (map != null && !map.isEmpty()) {
                for (String str : strArr) {
                    if (map.containsKey(str)) {
                        hashSet.addAll((Collection) map.get(str));
                    }
                }
            }
            return Collections.unmodifiableSet(hashSet);
        }
        return Collections.emptySet();
    }

    public static e7 a(JSONObject jSONObject, com.applovin.impl.sdk.j jVar) {
        if (jSONObject == null) {
            return null;
        }
        b bVar = new b();
        JSONObject jSONObject2 = JsonUtils.getJSONObject(jSONObject, "full_response", (JSONObject) null);
        if (jSONObject2 == null) {
            return null;
        }
        bVar.f6901b = jSONObject2;
        JSONObject jSONObject3 = JsonUtils.getJSONObject(JsonUtils.getJSONArray(jSONObject2, "ads", new JSONArray()), 0, (JSONObject) null);
        if (jSONObject3 == null) {
            return null;
        }
        bVar.f6900a = jSONObject3;
        bVar.f6902c = jVar;
        bVar.f6903d = JsonUtils.getLong(jSONObject, "created_at_millis", 0L);
        bVar.f6904e = JsonUtils.getString(jSONObject, b9.h.D0, "");
        bVar.f6905f = JsonUtils.getString(jSONObject, "ad_description", "");
        bVar.f6906g = n7.a(JsonUtils.getJSONObject(jSONObject, "system_info", (JSONObject) null), jVar);
        bVar.f6907h = r7.a(JsonUtils.getJSONObject(jSONObject, "video_creative", (JSONObject) null), jVar);
        bVar.f6908i = h7.a(JsonUtils.getJSONObject(jSONObject, "companion_ad", (JSONObject) null), jVar);
        bVar.f6909j = g7.a(JsonUtils.getJSONObject(jSONObject, "ad_verifications", (JSONObject) null), jVar);
        JSONArray jSONArray = JsonUtils.getJSONArray(jSONObject, "impression_trackers", new JSONArray());
        HashSet hashSet = new HashSet();
        for (int i10 = 0; i10 < jSONArray.length(); i10++) {
            o7 a10 = o7.a(JsonUtils.getJSONObject(jSONArray, i10, (JSONObject) null), jVar);
            if (a10 != null) {
                hashSet.add(a10);
            }
        }
        bVar.f6910k = hashSet;
        JSONArray jSONArray2 = JsonUtils.getJSONArray(jSONObject, "error_trackers", new JSONArray());
        HashSet hashSet2 = new HashSet();
        for (int i11 = 0; i11 < jSONArray2.length(); i11++) {
            o7 a11 = o7.a(JsonUtils.getJSONObject(jSONArray2, i11, (JSONObject) null), jVar);
            if (a11 != null) {
                hashSet2.add(a11);
            }
        }
        bVar.f6911l = hashSet2;
        e7 e7Var = new e7(bVar);
        JSONArray jSONArray3 = JsonUtils.getJSONArray(jSONObject, "cached_ad_html_resources_urls", new JSONArray());
        for (int i12 = 0; i12 < jSONArray3.length(); i12++) {
            Object objectAtIndex = JsonUtils.getObjectAtIndex(jSONArray3, i12, null);
            if (objectAtIndex instanceof String) {
                String str = (String) objectAtIndex;
                if (!TextUtils.isEmpty(str)) {
                    e7Var.a(Uri.parse(str));
                }
            }
        }
        return e7Var;
    }

    @Override // com.applovin.impl.g4
    public JSONObject a() {
        JSONObject jSONObject = new JSONObject();
        JsonUtils.putLong(jSONObject, "created_at_millis", this.f6892n);
        JsonUtils.putString(jSONObject, b9.h.D0, this.f6889k);
        JsonUtils.putString(jSONObject, "ad_description", this.f6890l);
        n7 n7Var = this.f6891m;
        if (n7Var != null) {
            JsonUtils.putJSONObject(jSONObject, "system_info", n7Var.a());
        }
        r7 r7Var = this.f6893o;
        if (r7Var != null) {
            JsonUtils.putJSONObject(jSONObject, "video_creative", r7Var.a());
        }
        h7 h7Var = this.f6894p;
        if (h7Var != null) {
            JsonUtils.putJSONObject(jSONObject, "companion_ad", h7Var.a());
        }
        g7 g7Var = this.f6896r;
        if (g7Var != null) {
            JsonUtils.putJSONObject(jSONObject, "ad_verifications", g7Var.a());
        }
        if (this.f6898t != null) {
            JSONArray jSONArray = new JSONArray();
            for (o7 o7Var : this.f6898t) {
                jSONArray.put(o7Var.a());
            }
            JsonUtils.putJsonArray(jSONObject, "impression_trackers", jSONArray);
        }
        if (this.f6899u != null) {
            JSONArray jSONArray2 = new JSONArray();
            for (o7 o7Var2 : this.f6899u) {
                jSONArray2.put(o7Var2.a());
            }
            JsonUtils.putJsonArray(jSONObject, "error_trackers", jSONArray2);
        }
        ArrayList arrayList = new ArrayList();
        for (Uri uri : i()) {
            arrayList.add(uri.toString());
        }
        JsonUtils.putJsonArray(jSONObject, "cached_ad_html_resources_urls", new JSONArray((Collection) arrayList));
        y4 y4Var = this.synchronizedFullResponse;
        if (y4Var != null) {
            JsonUtils.putJSONObject(jSONObject, "full_response", y4Var.a());
        } else {
            synchronized (this.fullResponseLock) {
                JsonUtils.putJSONObject(jSONObject, "full_response", this.fullResponse);
            }
        }
        return jSONObject;
    }
}
