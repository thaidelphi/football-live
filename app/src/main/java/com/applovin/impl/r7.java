package com.applovin.impl;

import android.net.Uri;
import android.webkit.MimeTypeMap;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONObject;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class r7 implements g4 {

    /* renamed from: a  reason: collision with root package name */
    private List f8557a;

    /* renamed from: b  reason: collision with root package name */
    private List f8558b;

    /* renamed from: c  reason: collision with root package name */
    private int f8559c;

    /* renamed from: d  reason: collision with root package name */
    private Uri f8560d;

    /* renamed from: e  reason: collision with root package name */
    private final Set f8561e;

    /* renamed from: f  reason: collision with root package name */
    private k7 f8562f;

    /* renamed from: g  reason: collision with root package name */
    private final Map f8563g;

    private r7() {
        this.f8557a = Collections.emptyList();
        this.f8558b = Collections.emptyList();
        this.f8561e = new HashSet();
        this.f8563g = new HashMap();
    }

    public static r7 a(f8 f8Var, r7 r7Var, i7 i7Var, com.applovin.impl.sdk.j jVar) {
        f8 c10;
        k7 a10;
        List a11;
        f8 c11;
        List a12;
        f8 c12;
        int a13;
        if (f8Var != null) {
            if (i7Var != null) {
                if (jVar != null) {
                    if (r7Var == null) {
                        try {
                            r7Var = new r7(i7Var);
                        } catch (Throwable th) {
                            jVar.I();
                            if (com.applovin.impl.sdk.n.a()) {
                                jVar.I().a("VastVideoCreative", "Error occurred while initializing", th);
                            }
                            jVar.D().a("VastVideoCreative", th);
                            return null;
                        }
                    }
                    if (r7Var.f8559c == 0 && (c12 = f8Var.c("Duration")) != null && (a13 = a(c12.d(), jVar)) > 0) {
                        r7Var.f8559c = a13;
                    }
                    f8 c13 = f8Var.c("MediaFiles");
                    if (c13 != null && (a12 = a(c13, jVar)) != null && a12.size() > 0) {
                        List list = r7Var.f8557a;
                        if (list != null) {
                            a12.addAll(list);
                        }
                        r7Var.f8557a = a12;
                    }
                    f8 c14 = f8Var.c("VideoClicks");
                    if (c14 != null) {
                        if (r7Var.f8560d == null && (c11 = c14.c("ClickThrough")) != null) {
                            String d10 = c11.d();
                            if (StringUtils.isValidString(d10)) {
                                r7Var.f8560d = Uri.parse(d10);
                            }
                        }
                        q7.a(c14.a("ClickTracking"), r7Var.f8561e, i7Var, jVar);
                    }
                    f8 c15 = f8Var.c("Icons");
                    if (c15 != null && (a10 = k7.a((c10 = c15.c("Icon")), jVar)) != null) {
                        f8 c16 = c10.c("IconClicks");
                        if (c16 != null && (a11 = c16.a("IconClickTracking")) != null) {
                            q7.a(a11, a10.f7402a, i7Var, jVar);
                        }
                        List a14 = c10.a("IconViewTracking");
                        if (a14 != null) {
                            q7.a(a14, a10.f7403b, i7Var, jVar);
                        }
                        r7Var.f8562f = a10;
                    }
                    q7.a(f8Var, r7Var.f8563g, i7Var, jVar);
                    return r7Var;
                }
                throw new IllegalArgumentException("No sdk specified.");
            }
            throw new IllegalArgumentException("No context specified.");
        }
        throw new IllegalArgumentException("No node specified.");
    }

    public Set b() {
        return this.f8561e;
    }

    public Uri c() {
        return this.f8560d;
    }

    public int d() {
        return this.f8559c;
    }

    public Map e() {
        return this.f8563g;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof r7) {
            r7 r7Var = (r7) obj;
            if (this.f8559c != r7Var.f8559c) {
                return false;
            }
            List list = this.f8557a;
            if (list == null ? r7Var.f8557a == null : list.equals(r7Var.f8557a)) {
                Uri uri = this.f8560d;
                if (uri == null ? r7Var.f8560d == null : uri.equals(r7Var.f8560d)) {
                    Set set = this.f8561e;
                    if (set == null ? r7Var.f8561e == null : set.equals(r7Var.f8561e)) {
                        Map map = this.f8563g;
                        Map map2 = r7Var.f8563g;
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

    public k7 f() {
        return this.f8562f;
    }

    public List g() {
        return this.f8557a;
    }

    public int hashCode() {
        List list = this.f8557a;
        int hashCode = (((list != null ? list.hashCode() : 0) * 31) + this.f8559c) * 31;
        Uri uri = this.f8560d;
        int hashCode2 = (hashCode + (uri != null ? uri.hashCode() : 0)) * 31;
        Set set = this.f8561e;
        int hashCode3 = (hashCode2 + (set != null ? set.hashCode() : 0)) * 31;
        Map map = this.f8563g;
        return hashCode3 + (map != null ? map.hashCode() : 0);
    }

    public String toString() {
        return "VastVideoCreative{videoFiles=" + this.f8557a + ", durationSeconds=" + this.f8559c + ", destinationUri=" + this.f8560d + ", clickTrackers=" + this.f8561e + ", eventTrackers=" + this.f8563g + ", industryIcon=" + this.f8562f + '}';
    }

    private r7(i7 i7Var) {
        this.f8557a = Collections.emptyList();
        this.f8558b = Collections.emptyList();
        this.f8561e = new HashSet();
        this.f8563g = new HashMap();
        this.f8558b = i7Var.f();
    }

    private static int a(String str, com.applovin.impl.sdk.j jVar) {
        try {
            List<String> explode = CollectionUtils.explode(str, ":");
            if (explode.size() == 3) {
                return (int) (TimeUnit.HOURS.toSeconds(StringUtils.parseInt(explode.get(0))) + TimeUnit.MINUTES.toSeconds(StringUtils.parseInt(explode.get(1))) + StringUtils.parseInt(explode.get(2)));
            }
        } catch (Throwable unused) {
            jVar.I();
            if (com.applovin.impl.sdk.n.a()) {
                com.applovin.impl.sdk.n I = jVar.I();
                I.b("VastVideoCreative", "Unable to parse duration from \"" + str + "\"");
            }
        }
        return 0;
    }

    private static List a(f8 f8Var, com.applovin.impl.sdk.j jVar) {
        List<f8> a10 = f8Var.a("MediaFile");
        ArrayList arrayList = new ArrayList(a10.size());
        List<String> explode = CollectionUtils.explode((String) jVar.a(o4.A4));
        List<String> explode2 = CollectionUtils.explode((String) jVar.a(o4.f8271z4));
        for (f8 f8Var2 : a10) {
            s7 a11 = s7.a(f8Var2, jVar);
            if (a11 != null) {
                try {
                    String c10 = a11.c();
                    if (StringUtils.isValidString(c10) && !explode.contains(c10)) {
                        arrayList.add(a11);
                    } else {
                        if (((Boolean) jVar.a(o4.B4)).booleanValue()) {
                            String fileExtensionFromUrl = MimeTypeMap.getFileExtensionFromUrl(a11.e().toString());
                            if (StringUtils.isValidString(fileExtensionFromUrl) && !explode2.contains(fileExtensionFromUrl)) {
                                arrayList.add(a11);
                            }
                        }
                        jVar.I();
                        if (com.applovin.impl.sdk.n.a()) {
                            com.applovin.impl.sdk.n I = jVar.I();
                            I.k("VastVideoCreative", "Video file not supported: " + a11);
                        }
                    }
                } catch (Throwable th) {
                    jVar.I();
                    if (com.applovin.impl.sdk.n.a()) {
                        com.applovin.impl.sdk.n I2 = jVar.I();
                        I2.a("VastVideoCreative", "Failed to validate video file: " + a11, th);
                    }
                }
            }
        }
        return arrayList;
    }

    public s7 a(long j10) {
        List list = this.f8557a;
        s7 s7Var = null;
        if (list == null || list.size() == 0) {
            return null;
        }
        List<s7> arrayList = new ArrayList(3);
        for (String str : this.f8558b) {
            for (s7 s7Var2 : this.f8557a) {
                String c10 = s7Var2.c();
                if (StringUtils.isValidString(c10) && str.equalsIgnoreCase(c10)) {
                    arrayList.add(s7Var2);
                }
            }
            if (!arrayList.isEmpty()) {
                break;
            }
        }
        if (arrayList.isEmpty()) {
            arrayList = this.f8557a;
        }
        Collections.sort(arrayList, new Comparator() { // from class: com.applovin.impl.ud
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                int a10;
                a10 = r7.a((s7) obj, (s7) obj2);
                return a10;
            }
        });
        for (s7 s7Var3 : arrayList) {
            if (s7Var3.b() > j10) {
                break;
            }
            s7Var = s7Var3;
        }
        return s7Var != null ? s7Var : (s7) arrayList.get(0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ int a(s7 s7Var, s7 s7Var2) {
        return Long.compare(s7Var.b(), s7Var2.b());
    }

    public static r7 a(JSONObject jSONObject, com.applovin.impl.sdk.j jVar) {
        if (jSONObject == null) {
            return null;
        }
        r7 r7Var = new r7();
        JSONArray jSONArray = JsonUtils.getJSONArray(jSONObject, "video_files", new JSONArray());
        r7Var.f8557a = new ArrayList();
        for (int i10 = 0; i10 < jSONArray.length(); i10++) {
            s7 a10 = s7.a(JsonUtils.getJSONObject(jSONArray, i10, (JSONObject) null), jVar);
            if (a10 != null) {
                r7Var.f8557a.add(a10);
            }
        }
        r7Var.f8558b = JsonUtils.getStringList(jSONObject, "preferred_video_file_types", Collections.emptyList());
        r7Var.f8559c = JsonUtils.getInt(jSONObject, "duration_seconds", 0);
        String string = JsonUtils.getString(jSONObject, "destination_uri", null);
        r7Var.f8560d = StringUtils.isValidString(string) ? Uri.parse(string) : null;
        JSONArray jSONArray2 = JsonUtils.getJSONArray(jSONObject, "click_trackers", new JSONArray());
        for (int i11 = 0; i11 < jSONArray2.length(); i11++) {
            o7 a11 = o7.a(JsonUtils.getJSONObject(jSONArray2, i11, (JSONObject) null), jVar);
            if (a11 != null) {
                r7Var.f8561e.add(a11);
            }
        }
        r7Var.f8562f = k7.a(JsonUtils.getJSONObject(jSONObject, "industry_icon", (JSONObject) null), jVar);
        JSONObject jSONObject2 = JsonUtils.getJSONObject(jSONObject, "event_trackers", new JSONObject());
        Iterator<String> keys = jSONObject2.keys();
        while (keys.hasNext()) {
            HashSet hashSet = new HashSet();
            String next = keys.next();
            JSONArray jSONArray3 = JsonUtils.getJSONArray(jSONObject2, next, new JSONArray());
            for (int i12 = 0; i12 < jSONArray3.length(); i12++) {
                o7 a12 = o7.a(JsonUtils.getJSONObject(jSONArray3, i12, (JSONObject) null), jVar);
                if (a12 != null) {
                    hashSet.add(a12);
                }
            }
            r7Var.f8563g.put(next, hashSet);
        }
        return r7Var;
    }

    @Override // com.applovin.impl.g4
    public JSONObject a() {
        JSONObject jSONObject = new JSONObject();
        JSONArray jSONArray = new JSONArray();
        List<s7> list = this.f8557a;
        if (list != null) {
            for (s7 s7Var : list) {
                jSONArray.put(s7Var.a());
            }
        }
        JsonUtils.putJsonArray(jSONObject, "video_files", jSONArray);
        JsonUtils.putJsonArray(jSONObject, "preferred_video_file_types", new JSONArray((Collection) this.f8558b));
        JsonUtils.putInt(jSONObject, "duration_seconds", this.f8559c);
        Uri uri = this.f8560d;
        JsonUtils.putString(jSONObject, "destination_uri", uri == null ? null : uri.toString());
        JSONArray jSONArray2 = new JSONArray();
        for (o7 o7Var : this.f8561e) {
            jSONArray2.put(o7Var.a());
        }
        JsonUtils.putJsonArray(jSONObject, "click_trackers", jSONArray2);
        k7 k7Var = this.f8562f;
        if (k7Var != null) {
            JsonUtils.putJSONObject(jSONObject, "industry_icon", k7Var.a());
        }
        JSONObject jSONObject2 = new JSONObject();
        for (String str : this.f8563g.keySet()) {
            Set<o7> set = (Set) this.f8563g.get(str);
            if (set != null) {
                JSONArray jSONArray3 = new JSONArray();
                for (o7 o7Var2 : set) {
                    jSONArray3.put(o7Var2.a());
                }
                JsonUtils.putJsonArray(jSONObject2, str, jSONArray3);
            }
        }
        JsonUtils.putJSONObject(jSONObject, "event_trackers", jSONObject2);
        return jSONObject;
    }
}
