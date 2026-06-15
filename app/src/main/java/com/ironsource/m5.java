package com.ironsource;

import com.ironsource.mediationsdk.impressionData.ImpressionData;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public class m5 {
    public static final String A = "nurl";

    /* renamed from: o  reason: collision with root package name */
    public static final String f18412o = "adMarkup";

    /* renamed from: p  reason: collision with root package name */
    public static final String f18413p = "instance";

    /* renamed from: q  reason: collision with root package name */
    public static final String f18414q = "adData";

    /* renamed from: r  reason: collision with root package name */
    public static final String f18415r = "price";

    /* renamed from: s  reason: collision with root package name */
    public static final String f18416s = "serverData";

    /* renamed from: t  reason: collision with root package name */
    public static final String f18417t = "loadTimeout";

    /* renamed from: u  reason: collision with root package name */
    public static final String f18418u = "order";

    /* renamed from: v  reason: collision with root package name */
    public static final String f18419v = "show";

    /* renamed from: w  reason: collision with root package name */
    public static final String f18420w = "price";

    /* renamed from: x  reason: collision with root package name */
    public static final String f18421x = "notifications";

    /* renamed from: y  reason: collision with root package name */
    public static final String f18422y = "burl";

    /* renamed from: z  reason: collision with root package name */
    public static final String f18423z = "lurl";

    /* renamed from: a  reason: collision with root package name */
    private String f18424a;

    /* renamed from: b  reason: collision with root package name */
    private String f18425b;

    /* renamed from: c  reason: collision with root package name */
    private JSONObject f18426c;

    /* renamed from: d  reason: collision with root package name */
    private String f18427d;

    /* renamed from: e  reason: collision with root package name */
    private Integer f18428e;

    /* renamed from: f  reason: collision with root package name */
    private int f18429f;

    /* renamed from: g  reason: collision with root package name */
    private int f18430g;

    /* renamed from: h  reason: collision with root package name */
    private int f18431h;

    /* renamed from: i  reason: collision with root package name */
    private final List<String> f18432i;

    /* renamed from: j  reason: collision with root package name */
    private final List<String> f18433j;

    /* renamed from: k  reason: collision with root package name */
    private final List<String> f18434k;

    /* renamed from: l  reason: collision with root package name */
    private ImpressionData f18435l;

    /* renamed from: m  reason: collision with root package name */
    private am f18436m;

    /* renamed from: n  reason: collision with root package name */
    private boolean f18437n;

    public m5(String str) {
        this.f18424a = null;
        this.f18425b = "";
        this.f18426c = null;
        this.f18427d = "";
        this.f18428e = null;
        this.f18429f = -1;
        this.f18430g = -1;
        this.f18431h = -1;
        this.f18432i = new ArrayList();
        this.f18433j = new ArrayList();
        this.f18434k = new ArrayList();
        this.f18435l = null;
        this.f18436m = null;
        this.f18437n = true;
        this.f18424a = str;
    }

    public m5(JSONObject jSONObject) {
        this(jSONObject, -1, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0082 A[Catch: Exception -> 0x00e2, TryCatch #0 {Exception -> 0x00e2, blocks: (B:3:0x0043, B:5:0x0049, B:6:0x004f, B:8:0x0055, B:12:0x0068, B:13:0x006a, B:15:0x0082, B:16:0x0095, B:18:0x00b3, B:20:0x00bd, B:22:0x00c5, B:23:0x00d4, B:9:0x005a, B:11:0x0060), top: B:28:0x0043 }] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00b3 A[Catch: Exception -> 0x00e2, TryCatch #0 {Exception -> 0x00e2, blocks: (B:3:0x0043, B:5:0x0049, B:6:0x004f, B:8:0x0055, B:12:0x0068, B:13:0x006a, B:15:0x0082, B:16:0x0095, B:18:0x00b3, B:20:0x00bd, B:22:0x00c5, B:23:0x00d4, B:9:0x005a, B:11:0x0060), top: B:28:0x0043 }] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00c5 A[Catch: Exception -> 0x00e2, TryCatch #0 {Exception -> 0x00e2, blocks: (B:3:0x0043, B:5:0x0049, B:6:0x004f, B:8:0x0055, B:12:0x0068, B:13:0x006a, B:15:0x0082, B:16:0x0095, B:18:0x00b3, B:20:0x00bd, B:22:0x00c5, B:23:0x00d4, B:9:0x005a, B:11:0x0060), top: B:28:0x0043 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public m5(org.json.JSONObject r16, int r17, org.json.JSONObject r18) {
        /*
            Method dump skipped, instructions count: 263
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.m5.<init>(org.json.JSONObject, int, org.json.JSONObject):void");
    }

    private void a(JSONObject jSONObject, int i10) {
        this.f18429f = i10;
        this.f18430g = i10;
        this.f18431h = i10;
        if (jSONObject != null) {
            int optInt = jSONObject.optInt(f18419v, i10);
            this.f18430g = optInt;
            this.f18431h = jSONObject.optInt("price", optInt);
        }
    }

    private void a(JSONObject jSONObject, String str, List<String> list) throws JSONException {
        if (jSONObject.has(str)) {
            list.addAll(mk.b(jSONObject.getJSONArray(str)));
        }
    }

    public ImpressionData a(String str) {
        ImpressionData impressionData = this.f18435l;
        if (impressionData != null) {
            ImpressionData impressionData2 = new ImpressionData(impressionData);
            impressionData2.replaceMacroForPlacementWithValue(com.ironsource.mediationsdk.d.f18572r, str);
            return impressionData2;
        }
        return null;
    }

    public JSONObject a() {
        return this.f18426c;
    }

    public List<String> b() {
        return this.f18432i;
    }

    public String c() {
        return this.f18424a;
    }

    public am d() {
        return this.f18436m;
    }

    public int e() {
        return this.f18429f;
    }

    public Integer f() {
        return this.f18428e;
    }

    public List<String> g() {
        return this.f18433j;
    }

    public List<String> h() {
        return this.f18434k;
    }

    public String i() {
        return this.f18427d;
    }

    public int j() {
        return this.f18431h;
    }

    public String k() {
        return this.f18425b;
    }

    public int l() {
        return this.f18430g;
    }

    public boolean m() {
        return this.f18437n;
    }
}
