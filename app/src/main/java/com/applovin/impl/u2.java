package com.applovin.impl;

import android.os.Bundle;
import android.os.SystemClock;
import android.view.View;
import com.applovin.impl.sdk.utils.BundleUtils;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.mediation.MaxAd;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.mediation.MaxAdWaterfallInfo;
import com.applovin.mediation.nativeAds.MaxNativeAd;
import com.applovin.sdk.AppLovinSdkUtils;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public abstract class u2 extends d3 implements MaxAd {

    /* renamed from: k  reason: collision with root package name */
    private final int f9319k;

    /* renamed from: l  reason: collision with root package name */
    private final AtomicBoolean f9320l;

    /* renamed from: m  reason: collision with root package name */
    private final AtomicBoolean f9321m;

    /* renamed from: n  reason: collision with root package name */
    protected com.applovin.impl.mediation.g f9322n;

    /* renamed from: o  reason: collision with root package name */
    private final String f9323o;

    /* renamed from: p  reason: collision with root package name */
    private MaxAdWaterfallInfo f9324p;

    /* renamed from: q  reason: collision with root package name */
    private long f9325q;

    /* renamed from: r  reason: collision with root package name */
    private String f9326r;

    /* renamed from: s  reason: collision with root package name */
    private String f9327s;

    /* renamed from: t  reason: collision with root package name */
    private Bundle f9328t;

    /* renamed from: u  reason: collision with root package name */
    private r2 f9329u;

    /* JADX INFO: Access modifiers changed from: protected */
    public u2(int i10, Map map, JSONObject jSONObject, JSONObject jSONObject2, com.applovin.impl.mediation.g gVar, com.applovin.impl.sdk.j jVar) {
        super(map, jSONObject, jSONObject2, jVar);
        this.f9320l = new AtomicBoolean();
        this.f9321m = new AtomicBoolean();
        this.f9319k = i10;
        this.f9322n = gVar;
        this.f9323o = gVar != null ? gVar.b() : null;
    }

    private long M() {
        return a("load_started_time_ms", 0L);
    }

    public static u2 a(int i10, Map map, JSONObject jSONObject, JSONObject jSONObject2, com.applovin.impl.sdk.j jVar) {
        String string = JsonUtils.getString(jSONObject2, "ad_format", null);
        MaxAdFormat formatFromString = MaxAdFormat.formatFromString(string);
        Objects.requireNonNull(formatFromString, "Invalid ad format for string: " + string);
        if (formatFromString.isAdViewAd()) {
            return new v2(i10, map, jSONObject, jSONObject2, jVar);
        }
        if (formatFromString == MaxAdFormat.NATIVE) {
            return new x2(i10, map, jSONObject, jSONObject2, jVar);
        }
        if (formatFromString.isFullscreenAd()) {
            return new w2(i10, map, jSONObject, jSONObject2, jVar);
        }
        throw new IllegalArgumentException("Unsupported ad format: " + string);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Bundle c(y4 y4Var) {
        JSONObject a10;
        if (y4Var.a("credentials")) {
            a10 = y4Var.a("credentials", new JSONObject());
        } else {
            a10 = y4Var.a("server_parameters", new JSONObject());
            JsonUtils.putString(a10, "placement_id", U());
        }
        return JsonUtils.toBundle(a10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ r2 d(y4 y4Var) {
        return new r2(y4Var.a("hybrid_ad_config", (JSONObject) null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ JSONObject e(y4 y4Var) {
        return JsonUtils.deepCopy(y4Var.a("publisher_extra_info", new JSONObject()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Double f(y4 y4Var) {
        return Double.valueOf(JsonUtils.getDouble(y4Var.a("revenue_parameters", (JSONObject) null), "revenue", -1.0d));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ JSONObject g(y4 y4Var) {
        return JsonUtils.deepCopy(y4Var.a("revenue_parameters", new JSONObject()));
    }

    public com.applovin.impl.mediation.g A() {
        return this.f9322n;
    }

    public Bundle B() {
        return this.f9328t;
    }

    public String C() {
        return a("bcode", "");
    }

    public long D() {
        return a("bid_expiration_ms", BundleUtils.getLong("bid_expiration_ms", -1L, l()));
    }

    public String E() {
        return a("bid_response", (String) null);
    }

    public long F() {
        return a("bwt_ms", ((Long) this.f6792a.a(j3.A7)).longValue());
    }

    public Bundle G() {
        JSONObject a10;
        y4 y4Var = this.f6799h;
        if (y4Var != null) {
            return (Bundle) y4Var.a(new m.a() { // from class: com.applovin.impl.ne
                @Override // m.a
                public final Object apply(Object obj) {
                    Bundle c10;
                    c10 = u2.this.c((y4) obj);
                    return c10;
                }
            });
        }
        if (c("credentials")) {
            a10 = a("credentials", new JSONObject());
        } else {
            a10 = a("server_parameters", new JSONObject());
            JsonUtils.putString(a10, "placement_id", U());
        }
        return JsonUtils.toBundle(a10);
    }

    public long H() {
        if (M() > 0) {
            return L() - M();
        }
        return -1L;
    }

    public r2 I() {
        r2 r2Var = this.f9329u;
        if (r2Var != null) {
            return r2Var;
        }
        y4 y4Var = this.f6799h;
        if (y4Var != null) {
            this.f9329u = (r2) y4Var.a(new m.a() { // from class: com.applovin.impl.re
                @Override // m.a
                public final Object apply(Object obj) {
                    r2 d10;
                    d10 = u2.d((y4) obj);
                    return d10;
                }
            });
        } else {
            this.f9329u = new r2(a("hybrid_ad_config", (JSONObject) null));
        }
        return this.f9329u;
    }

    public MaxAdFormat J() {
        String a10 = a("haf", (String) null);
        if (StringUtils.isValidString(a10)) {
            return MaxAdFormat.formatFromString(a10);
        }
        return null;
    }

    public int K() {
        return this.f9319k;
    }

    public long L() {
        return a("load_completed_time_ms", 0L);
    }

    public String N() {
        return this.f9326r;
    }

    public double O() {
        return a("price", -1.0f);
    }

    public JSONObject P() {
        y4 y4Var = this.f6799h;
        if (y4Var != null) {
            return (JSONObject) y4Var.a(new m.a() { // from class: com.applovin.impl.te
                @Override // m.a
                public final Object apply(Object obj) {
                    JSONObject e8;
                    e8 = u2.e((y4) obj);
                    return e8;
                }
            });
        }
        return a("publisher_extra_info", new JSONObject());
    }

    public String Q() {
        return JsonUtils.getString(R(), "revenue_event", "");
    }

    public JSONObject R() {
        y4 y4Var = this.f6799h;
        if (y4Var != null) {
            return (JSONObject) y4Var.a(new m.a() { // from class: com.applovin.impl.oe
                @Override // m.a
                public final Object apply(Object obj) {
                    JSONObject g10;
                    g10 = u2.g((y4) obj);
                    return g10;
                }
            });
        }
        return a("revenue_parameters", new JSONObject());
    }

    public String S() {
        return b("event_id", "");
    }

    public long T() {
        return a("twt_ms", ((Long) this.f6792a.a(j3.B7)).longValue());
    }

    public String U() {
        return a("third_party_ad_placement_id", (String) null);
    }

    public List V() {
        return b("mwf_info_urls");
    }

    public String W() {
        return b("waterfall_name", "");
    }

    public String X() {
        return b("waterfall_test_name", "");
    }

    public boolean Y() {
        return StringUtils.isValidString(E());
    }

    public boolean Z() {
        return J() != null;
    }

    public abstract u2 a(com.applovin.impl.mediation.g gVar);

    public boolean a0() {
        return a("is_js_tag_ad", Boolean.FALSE).booleanValue();
    }

    public void b(JSONObject jSONObject) {
        if (jSONObject == null || jSONObject.length() == 0) {
            return;
        }
        JSONObject P = P();
        JsonUtils.putAll(P, jSONObject);
        a("publisher_extra_info", (Object) P);
    }

    public boolean b0() {
        com.applovin.impl.mediation.g gVar = this.f9322n;
        return gVar != null && gVar.k() && this.f9322n.j();
    }

    public boolean c0() {
        return a("only_load_when_initialized", Boolean.FALSE).booleanValue();
    }

    public boolean d0() {
        return a("prefer_load_when_initialized", Boolean.TRUE).booleanValue();
    }

    public void e0() {
        c("load_completed_time_ms", SystemClock.elapsedRealtime());
    }

    public void f0() {
        c("load_started_time_ms", SystemClock.elapsedRealtime());
    }

    public Boolean g0() {
        return a("destroy_on_ui_thread", (Boolean) null);
    }

    @Override // com.applovin.mediation.MaxAd
    public String getAdReviewCreativeId() {
        return this.f9327s;
    }

    @Override // com.applovin.mediation.MaxAd
    public String getAdValue(String str) {
        return getAdValue(str, null);
    }

    @Override // com.applovin.mediation.MaxAd
    public String getCreativeId() {
        return a("creative_id", (String) null);
    }

    @Override // com.applovin.mediation.MaxAd
    public String getDspId() {
        return a("dsp_id", (String) null);
    }

    @Override // com.applovin.mediation.MaxAd
    public String getDspName() {
        return a("dsp_name", (String) null);
    }

    @Override // com.applovin.mediation.MaxAd
    public MaxAdFormat getFormat() {
        return MaxAdFormat.formatFromString(a("ad_format", b("ad_format", (String) null)));
    }

    @Override // com.applovin.mediation.MaxAd
    public MaxNativeAd getNativeAd() {
        com.applovin.impl.mediation.g gVar = this.f9322n;
        if (gVar != null) {
            return gVar.e();
        }
        return null;
    }

    @Override // com.applovin.mediation.MaxAd
    public String getNetworkName() {
        return a("network_name", "");
    }

    @Override // com.applovin.mediation.MaxAd
    public String getNetworkPlacement() {
        return StringUtils.emptyIfNull(U());
    }

    @Override // com.applovin.mediation.MaxAd
    public long getRequestLatencyMillis() {
        return this.f9325q;
    }

    @Override // com.applovin.mediation.MaxAd
    public double getRevenue() {
        if (((Boolean) this.f6792a.a(j3.f7321x7)).booleanValue() && getFormat().isFullscreenAd() && !u().get()) {
            this.f6792a.I();
            if (com.applovin.impl.sdk.n.a()) {
                this.f6792a.I().b("MediatedAd", "Attempting to retrieve revenue when not available yet");
                return 0.0d;
            }
            return 0.0d;
        }
        y4 y4Var = this.f6799h;
        if (y4Var != null) {
            return ((Double) y4Var.a(new m.a() { // from class: com.applovin.impl.se
                @Override // m.a
                public final Object apply(Object obj) {
                    Double f10;
                    f10 = u2.f((y4) obj);
                    return f10;
                }
            })).doubleValue();
        }
        return JsonUtils.getDouble(a("revenue_parameters", (JSONObject) null), "revenue", -1.0d);
    }

    @Override // com.applovin.mediation.MaxAd
    public String getRevenuePrecision() {
        y4 y4Var = this.f6799h;
        if (y4Var != null) {
            return (String) y4Var.a(new m.a() { // from class: com.applovin.impl.qe
                @Override // m.a
                public final Object apply(Object obj) {
                    String h10;
                    h10 = u2.h((y4) obj);
                    return h10;
                }
            });
        }
        return JsonUtils.getString(a("revenue_parameters", (JSONObject) null), "precision", "");
    }

    @Override // com.applovin.mediation.MaxAd
    public AppLovinSdkUtils.Size getSize() {
        int a10 = a("ad_width", -3);
        int a11 = a("ad_height", -3);
        if (a10 != -3 && a11 != -3) {
            return new AppLovinSdkUtils.Size(a10, a11);
        }
        return getFormat().getSize();
    }

    @Override // com.applovin.mediation.MaxAd
    public MaxAdWaterfallInfo getWaterfall() {
        return this.f9324p;
    }

    public void h(String str) {
        this.f9327s = str;
    }

    public Boolean h0() {
        return a("load_on_ui_thread", (Boolean) null);
    }

    public void i(String str) {
        this.f9326r = str;
    }

    public Boolean i0() {
        return a("show_on_ui_thread", (Boolean) null);
    }

    public void t() {
        this.f9322n = null;
        this.f9324p = null;
    }

    @Override // com.applovin.impl.d3
    public String toString() {
        return "MediatedAd{thirdPartyAdPlacementId=" + U() + ", adUnitId=" + getAdUnitId() + ", format=" + getFormat().getLabel() + ", networkName='" + getNetworkName() + "'}";
    }

    public AtomicBoolean u() {
        return this.f9320l;
    }

    public String v() {
        return a("adomain", (String) null);
    }

    public AtomicBoolean w() {
        return this.f9321m;
    }

    public JSONObject x() {
        y4 y4Var = this.f6799h;
        if (y4Var != null) {
            return (JSONObject) y4Var.a(new m.a() { // from class: com.applovin.impl.pe
                @Override // m.a
                public final Object apply(Object obj) {
                    JSONObject b10;
                    b10 = u2.b((y4) obj);
                    return b10;
                }
            });
        }
        return a("ad_values", new JSONObject());
    }

    public View y() {
        com.applovin.impl.mediation.g gVar;
        if (!b0() || (gVar = this.f9322n) == null) {
            return null;
        }
        return gVar.d();
    }

    public String z() {
        return this.f9323o;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String h(y4 y4Var) {
        return JsonUtils.getString(y4Var.a("revenue_parameters", (JSONObject) null), "precision", "");
    }

    @Override // com.applovin.mediation.MaxAd
    public String getAdValue(String str, String str2) {
        JSONObject x10 = x();
        if (x10.has(str)) {
            return JsonUtils.getString(x10, str, str2);
        }
        Bundle l10 = l();
        if (l10.containsKey(str)) {
            return l10.getString(str);
        }
        JSONObject P = P();
        if (P.has(str)) {
            return JsonUtils.getString(P, str, str2);
        }
        return a(str, str2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ JSONObject b(y4 y4Var) {
        return JsonUtils.deepCopy(y4Var.a("ad_values", new JSONObject()));
    }

    public void a(MaxAdWaterfallInfo maxAdWaterfallInfo) {
        this.f9324p = maxAdWaterfallInfo;
    }

    public void a(long j10) {
        this.f9325q = j10;
    }

    public void a(JSONObject jSONObject) {
        if (jSONObject == null || jSONObject.length() == 0) {
            return;
        }
        JSONObject x10 = x();
        JsonUtils.putAll(x10, jSONObject);
        a("ad_values", (Object) x10);
    }

    public void a(Bundle bundle) {
        if (bundle == null) {
            return;
        }
        if (bundle.containsKey("ad_values")) {
            a(BundleUtils.toJSONObject(bundle.getBundle("ad_values")));
        }
        if (bundle.containsKey("creative_id") && !c("creative_id")) {
            c("creative_id", BundleUtils.getString("creative_id", bundle));
        }
        if (bundle.containsKey("ad_width") && !c("ad_width") && bundle.containsKey("ad_height") && !c("ad_height")) {
            int i10 = BundleUtils.getInt("ad_width", bundle);
            int i11 = BundleUtils.getInt("ad_height", bundle);
            c("ad_width", i10);
            c("ad_height", i11);
        }
        if (bundle.containsKey("publisher_extra_info")) {
            b(BundleUtils.toJSONObject(bundle.getBundle("publisher_extra_info")));
        }
        if (bundle.containsKey("array_parameters")) {
            this.f9328t = bundle.getBundle("array_parameters");
        }
    }
}
