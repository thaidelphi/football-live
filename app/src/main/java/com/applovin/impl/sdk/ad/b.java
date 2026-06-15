package com.applovin.impl.sdk.ad;

import android.graphics.Point;
import android.net.Uri;
import android.os.Bundle;
import android.view.MotionEvent;
import com.applovin.impl.adview.e;
import com.applovin.impl.c1;
import com.applovin.impl.d7;
import com.applovin.impl.d8;
import com.applovin.impl.e4;
import com.applovin.impl.g4;
import com.applovin.impl.l0;
import com.applovin.impl.o4;
import com.applovin.impl.sdk.AppLovinAdBase;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.t7;
import com.applovin.impl.v3;
import com.applovin.impl.y4;
import com.applovin.sdk.AppLovinSdkUtils;
import com.iab.omid.library.applovin.adsession.VerificationScriptResource;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public abstract class b extends AppLovinAdImpl implements g4 {

    /* renamed from: e  reason: collision with root package name */
    private final List f8730e;

    /* renamed from: f  reason: collision with root package name */
    private final AtomicBoolean f8731f;

    /* renamed from: g  reason: collision with root package name */
    private final AtomicBoolean f8732g;

    /* renamed from: h  reason: collision with root package name */
    private final AtomicReference f8733h;

    /* renamed from: i  reason: collision with root package name */
    private final Bundle f8734i;

    /* renamed from: j  reason: collision with root package name */
    private d f8735j;

    /* renamed from: com.applovin.impl.sdk.ad.b$b  reason: collision with other inner class name */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public enum EnumC0135b {
        UNSPECIFIED,
        DISMISS,
        DO_NOT_DISMISS
    }

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public enum c {
        DEFAULT,
        ACTIVITY_PORTRAIT,
        ACTIVITY_LANDSCAPE
    }

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public class d {

        /* renamed from: a  reason: collision with root package name */
        public final int f8744a;

        /* renamed from: b  reason: collision with root package name */
        public final int f8745b;

        /* renamed from: c  reason: collision with root package name */
        public final int f8746c;

        /* renamed from: d  reason: collision with root package name */
        public final int f8747d;

        /* renamed from: e  reason: collision with root package name */
        public final int f8748e;

        private d() {
            this.f8744a = AppLovinSdkUtils.dpToPx(com.applovin.impl.sdk.j.m(), b.this.m());
            this.f8745b = AppLovinSdkUtils.dpToPx(com.applovin.impl.sdk.j.m(), b.this.o());
            this.f8746c = AppLovinSdkUtils.dpToPx(com.applovin.impl.sdk.j.m(), b.this.k());
            this.f8747d = AppLovinSdkUtils.dpToPx(com.applovin.impl.sdk.j.m(), ((Integer) ((AppLovinAdBase) b.this).sdk.a(o4.f8188p1)).intValue());
            this.f8748e = AppLovinSdkUtils.dpToPx(com.applovin.impl.sdk.j.m(), ((Integer) ((AppLovinAdBase) b.this).sdk.a(o4.f8180o1)).intValue());
        }
    }

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public enum e {
        RESIZE_ASPECT,
        TOP,
        BOTTOM,
        LEFT,
        RIGHT
    }

    public b(JSONObject jSONObject, JSONObject jSONObject2, com.applovin.impl.sdk.j jVar) {
        super(jSONObject, jSONObject2, jVar);
        this.f8730e = CollectionUtils.synchronizedList();
        this.f8731f = new AtomicBoolean();
        this.f8732g = new AtomicBoolean();
        this.f8733h = new AtomicReference();
        this.f8734i = new Bundle();
    }

    private List K() {
        return getIntegerListFromAdObject("multi_close_style", null);
    }

    private String c(MotionEvent motionEvent, boolean z10, boolean z11) {
        String stringFromAdObject = getStringFromAdObject("click_tracking_url", null);
        Map a10 = a(motionEvent, z10, z11);
        if (stringFromAdObject != null) {
            return StringUtils.replace(stringFromAdObject, a10);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ List f(y4 y4Var) {
        return d7.a(y4Var.a("custom_tabs_navigation_finished_urls", new JSONObject()), getClCode(), (String) null, this.sdk);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ List j(y4 y4Var) {
        return d7.a(y4Var.a("custom_tabs_tab_shown_urls", new JSONObject()), getClCode(), (String) null, this.sdk);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Bundle k(y4 y4Var) {
        return JsonUtils.toBundle(y4Var.a("ah_parameters", (JSONObject) null));
    }

    private String m0() {
        String stringFromAdObject = getStringFromAdObject("video_end_url", null);
        if (stringFromAdObject != null) {
            return stringFromAdObject.replace("{CLCODE}", getClCode());
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String o(y4 y4Var) {
        return JsonUtils.getString(y4Var.a("video_button_properties", (JSONObject) null), "video_button_html", "");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Boolean s(y4 y4Var) {
        return JsonUtils.getBoolean(y4Var.a("video_button_properties", (JSONObject) null), "should_cache_video_button_html_assets", Boolean.FALSE);
    }

    public List A() {
        return getStringListFromAdObject("custom_tabs_warmup_urls", Collections.emptyList());
    }

    public boolean A0() {
        return getBooleanFromAdObject("gase", Boolean.FALSE);
    }

    public boolean B() {
        return getBooleanFromAdObject("dismiss_on_skip", Boolean.FALSE);
    }

    public boolean B0() {
        return getBooleanFromAdObject("lock_current_orientation", Boolean.FALSE);
    }

    public int C() {
        return getIntFromAdObject("poststitial_dismiss_forward_delay_millis", -1);
    }

    public abstract boolean C0();

    public int D() {
        return getIntFromAdObject("poststitial_shown_forward_delay_millis", -1);
    }

    public AtomicBoolean D0() {
        return this.f8731f;
    }

    public int E() {
        return d7.a(getIntFromAdObject("graphic_completion_percent", -1), 90);
    }

    public boolean E0() {
        return getBooleanFromAdObject("lhs_skip_button", (Boolean) this.sdk.a(o4.f8093d2));
    }

    public List F() {
        List a10;
        y4 y4Var = this.synchronizedAdObject;
        if (y4Var != null) {
            return (List) y4Var.a(new m.a() { // from class: com.applovin.impl.sdk.ad.h
                @Override // m.a
                public final Object apply(Object obj) {
                    List l10;
                    l10 = b.this.l((y4) obj);
                    return l10;
                }
            });
        }
        synchronized (this.adObjectLock) {
            a10 = d7.a(getJsonObjectFromAdObject("imp_urls", new JSONObject()), getClCode(), null, null, R(), Q0(), this.sdk);
        }
        return a10;
    }

    public boolean F0() {
        return getBooleanFromAdObject("video_clickable", Boolean.FALSE);
    }

    public int G() {
        return getIntFromAdObject("mdafra", ((Integer) this.sdk.a(o4.T0)).intValue());
    }

    public abstract boolean G0();

    public boolean H() {
        return getBooleanFromAdObject("playback_requires_user_action", Boolean.TRUE);
    }

    public boolean H0() {
        return getBooleanFromAdObject("web_contents_debugging_enabled", Boolean.valueOf(d7.h(com.applovin.impl.sdk.j.m()) || d7.f(com.applovin.impl.sdk.j.m()) || ((Boolean) this.sdk.a(o4.Z5)).booleanValue()));
    }

    public String I() {
        return getStringFromFullResponse("event_id", null);
    }

    public abstract void I0();

    public List J() {
        List<Integer> K = K();
        if (K != null) {
            ArrayList arrayList = new ArrayList(K.size());
            for (Integer num : K) {
                arrayList.add(a(num.intValue()));
            }
            return arrayList;
        }
        return null;
    }

    public boolean J0() {
        return getBooleanFromAdObject("should_apply_mute_setting_to_poststitial", Boolean.FALSE);
    }

    public boolean K0() {
        String str = this.sdk.f0().getExtraParameters().get("should_apply_system_insets_padding");
        if (StringUtils.isValidString(str)) {
            return Boolean.parseBoolean(str);
        }
        return getBooleanFromAdObject("sasip", (Boolean) this.sdk.a(o4.F2));
    }

    public List L() {
        return getIntegerListFromAdObject("multi_close_delay_graphic", null);
    }

    public boolean L0() {
        return getBooleanFromAdObject("should_apply_web_view_settings_to_web_view_button", (Boolean) this.sdk.a(o4.f8097d6));
    }

    public Uri M() {
        String stringFromAdObject = getStringFromAdObject("mute_image", "https://assets.applovin.com/sound_off.png");
        if (StringUtils.isValidString(stringFromAdObject)) {
            return Uri.parse(stringFromAdObject);
        }
        return null;
    }

    public boolean M0() {
        y4 y4Var = this.synchronizedAdObject;
        if (y4Var != null) {
            return ((Boolean) y4Var.a(new m.a() { // from class: com.applovin.impl.sdk.ad.r
                @Override // m.a
                public final Object apply(Object obj) {
                    Boolean s10;
                    s10 = b.s((y4) obj);
                    return s10;
                }
            })).booleanValue();
        }
        return JsonUtils.getBoolean(getJsonObjectFromAdObject("video_button_properties", null), "should_cache_video_button_html_assets", Boolean.FALSE).booleanValue();
    }

    public String N() {
        return getStringFromAdObject("nia_button_title", "");
    }

    public boolean N0() {
        return this.f8732g.get();
    }

    public String O() {
        return getStringFromAdObject("nia_message", "");
    }

    public boolean O0() {
        return getBooleanFromAdObject("custom_tabs_should_track_events", Boolean.FALSE);
    }

    public String P() {
        return getStringFromAdObject("nia_title", "");
    }

    public boolean P0() {
        return getBooleanFromAdObject("serfaad", (Boolean) this.sdk.a(o4.S0));
    }

    public abstract String Q();

    public boolean Q0() {
        return getBooleanFromAdObject("fire_postbacks_from_webview", Boolean.FALSE);
    }

    public Map R() {
        Map<String, String> stringMap;
        HashMap hashMap = new HashMap();
        try {
            y4 y4Var = this.synchronizedAdObject;
            if (y4Var != null) {
                stringMap = (Map) y4Var.a(new m.a() { // from class: com.applovin.impl.sdk.ad.s
                    @Override // m.a
                    public final Object apply(Object obj) {
                        Map m7;
                        m7 = b.m((y4) obj);
                        return m7;
                    }
                });
            } else {
                stringMap = JsonUtils.toStringMap(getJsonObjectFromAdObject("http_headers_for_postbacks", new JSONObject()));
            }
            hashMap.putAll(stringMap);
        } catch (JSONException e8) {
            this.sdk.I();
            if (com.applovin.impl.sdk.n.a()) {
                this.sdk.I().a("DirectAd", "Failed to retrieve http headers for postbacks", e8);
            }
        }
        if (getBooleanFromAdObject("use_webview_ua_for_postbacks", Boolean.FALSE)) {
            hashMap.put("User-Agent", d8.a());
        }
        return hashMap;
    }

    public boolean R0() {
        return getBooleanFromAdObject("should_forward_close_button_tapped_to_poststitial", Boolean.FALSE);
    }

    public EnumC0135b S() {
        String stringFromAdObject = getStringFromAdObject("poststitial_dismiss_type", null);
        if (StringUtils.isValidString(stringFromAdObject)) {
            if ("dismiss".equalsIgnoreCase(stringFromAdObject)) {
                return EnumC0135b.DISMISS;
            }
            if ("no_dismiss".equalsIgnoreCase(stringFromAdObject)) {
                return EnumC0135b.DO_NOT_DISMISS;
            }
        }
        return EnumC0135b.UNSPECIFIED;
    }

    public boolean S0() {
        return getBooleanFromAdObject("fmsstwvoar", Boolean.FALSE);
    }

    public int T() {
        return getColorFromAdObject("postitial_progress_bar_color", -922746881);
    }

    public boolean T0() {
        return getBooleanFromAdObject("fvcetwv", Boolean.FALSE);
    }

    public long U() {
        return getLongFromAdObject("postitial_progress_bar_total_ms", -1L);
    }

    public boolean U0() {
        return getBooleanFromAdObject("avoms", Boolean.FALSE);
    }

    public long V() {
        long longFromAdObject = getLongFromAdObject("report_reward_duration", -1L);
        if (longFromAdObject >= 0) {
            return TimeUnit.SECONDS.toMillis(longFromAdObject);
        }
        return -1L;
    }

    public boolean V0() {
        return getBooleanFromAdObject("report_reward_percent_include_close_delay", Boolean.TRUE);
    }

    public int W() {
        return getIntFromAdObject("report_reward_percent", -1);
    }

    public boolean W0() {
        return getBooleanFromAdObject("require_interaction_for_click", Boolean.FALSE);
    }

    public List X() {
        String stringFromAdObject = getStringFromAdObject("required_html_resources", null);
        return stringFromAdObject != null ? CollectionUtils.explode(stringFromAdObject) : Collections.emptyList();
    }

    public boolean X0() {
        return getBooleanFromAdObject("sruifwvc", Boolean.FALSE);
    }

    public List Y() {
        ArrayList arrayList;
        String stringFromAdObject = getStringFromAdObject("resource_cache_prefix", null);
        if (stringFromAdObject != null) {
            arrayList = new ArrayList(CollectionUtils.explode(stringFromAdObject));
        } else {
            arrayList = new ArrayList(this.sdk.c(o4.H0));
        }
        if (d7.h(com.applovin.impl.sdk.j.m())) {
            arrayList.add("https://p.applov.in/");
        }
        return arrayList;
    }

    public boolean Y0() {
        return getBooleanFromAdObject("respect_adview_fully_watched", Boolean.FALSE);
    }

    public List Z() {
        return getStringListFromAdObject("rea", X());
    }

    public boolean Z0() {
        return getBooleanFromAdObject("show_nia", Boolean.FALSE);
    }

    public e.a a0() {
        int intFromAdObject = getIntFromAdObject("skip_style", -1);
        return intFromAdObject == -1 ? n() : a(intFromAdObject);
    }

    public boolean a1() {
        return getBooleanFromAdObject("sscomt", Boolean.FALSE);
    }

    public List b0() {
        return getStringListFromAdObject("substrings_for_disabled_click_logic", Collections.emptyList());
    }

    public boolean b1() {
        return getBooleanFromAdObject("track_auto_redirects", Boolean.FALSE);
    }

    public c c0() {
        c cVar = c.DEFAULT;
        String upperCase = getStringFromAdObject("ad_target", cVar.toString()).toUpperCase(Locale.ENGLISH);
        if ("ACTIVITY_PORTRAIT".equalsIgnoreCase(upperCase)) {
            return c.ACTIVITY_PORTRAIT;
        }
        return "ACTIVITY_LANDSCAPE".equalsIgnoreCase(upperCase) ? c.ACTIVITY_LANDSCAPE : cVar;
    }

    public boolean c1() {
        return getBooleanFromAdObject("upiosp", Boolean.FALSE);
    }

    public List d() {
        List a10;
        y4 y4Var = this.synchronizedAdObject;
        if (y4Var != null) {
            return (List) y4Var.a(new m.a() { // from class: com.applovin.impl.sdk.ad.b0
                @Override // m.a
                public final Object apply(Object obj) {
                    List a11;
                    a11 = b.this.a((y4) obj);
                    return a11;
                }
            });
        }
        synchronized (this.adObjectLock) {
            a10 = d7.a(getJsonObjectFromAdObject("ad_closed_urls", new JSONObject()), getClCode(), (String) null, this.sdk);
        }
        return a10;
    }

    public Uri d0() {
        String stringFromAdObject = getStringFromAdObject("unmute_image", "https://assets.applovin.com/sound_on.png");
        if (StringUtils.isValidString(stringFromAdObject)) {
            return Uri.parse(stringFromAdObject);
        }
        return null;
    }

    public Bundle e() {
        return this.f8734i;
    }

    public String e0() {
        y4 y4Var = this.synchronizedAdObject;
        if (y4Var != null) {
            return (String) y4Var.a(new m.a() { // from class: com.applovin.impl.sdk.ad.n
                @Override // m.a
                public final Object apply(Object obj) {
                    String n10;
                    n10 = b.n((y4) obj);
                    return n10;
                }
            });
        }
        return JsonUtils.getString(getJsonObjectFromAdObject("video_button_properties", null), "video_button_base_url", "/");
    }

    public String f0() {
        y4 y4Var = this.synchronizedAdObject;
        if (y4Var != null) {
            return (String) y4Var.a(new m.a() { // from class: com.applovin.impl.sdk.ad.m
                @Override // m.a
                public final Object apply(Object obj) {
                    String o10;
                    o10 = b.o((y4) obj);
                    return o10;
                }
            });
        }
        return JsonUtils.getString(getJsonObjectFromAdObject("video_button_properties", null), "video_button_html", "");
    }

    public List g() {
        List a10;
        y4 y4Var = this.synchronizedAdObject;
        if (y4Var != null) {
            return (List) y4Var.a(new m.a() { // from class: com.applovin.impl.sdk.ad.v
                @Override // m.a
                public final Object apply(Object obj) {
                    List b10;
                    b10 = b.this.b((y4) obj);
                    return b10;
                }
            });
        }
        synchronized (this.adObjectLock) {
            a10 = d7.a(getJsonObjectFromAdObject("app_killed_urls", new JSONObject()), getClCode(), (String) null, this.sdk);
        }
        return a10;
    }

    public t7 g0() {
        y4 y4Var = this.synchronizedAdObject;
        if (y4Var != null) {
            return (t7) y4Var.a(new m.a() { // from class: com.applovin.impl.sdk.ad.w
                @Override // m.a
                public final Object apply(Object obj) {
                    t7 p10;
                    p10 = b.this.p((y4) obj);
                    return p10;
                }
            });
        }
        return new t7(getJsonObjectFromAdObject("video_button_properties", null), this.sdk);
    }

    @Override // com.applovin.impl.sdk.AppLovinAdBase, com.applovin.impl.u3
    public abstract v3 getAdEventTracker();

    public String getCachePrefix() {
        return getStringFromAdObject("cache_prefix", null);
    }

    @Override // com.applovin.impl.sdk.array.ArrayDirectDownloadAd
    public Bundle getDirectDownloadParameters() {
        y4 y4Var = this.synchronizedAdObject;
        if (y4Var != null) {
            return (Bundle) y4Var.a(new m.a() { // from class: com.applovin.impl.sdk.ad.q
                @Override // m.a
                public final Object apply(Object obj) {
                    Bundle k10;
                    k10 = b.k((y4) obj);
                    return k10;
                }
            });
        }
        return JsonUtils.toBundle(getJsonObjectFromAdObject("ah_parameters", null));
    }

    @Override // com.applovin.impl.sdk.array.ArrayDirectDownloadAd
    public String getDirectDownloadToken() {
        return getStringFromAdObject("ah_dd_token", null);
    }

    @Override // com.applovin.impl.sdk.AppLovinAdBase, com.applovin.impl.u3
    public String getOpenMeasurementContentUrl() {
        return getStringFromAdObject("omid_content_url", null);
    }

    @Override // com.applovin.impl.sdk.AppLovinAdBase, com.applovin.impl.u3
    public String getOpenMeasurementCustomReferenceData() {
        return getStringFromAdObject("omid_custom_ref_data", "");
    }

    @Override // com.applovin.impl.sdk.AppLovinAdBase, com.applovin.impl.u3
    public List getOpenMeasurementVerificationScriptResources() {
        List list;
        final m.a aVar = new m.a() { // from class: com.applovin.impl.sdk.ad.i
            @Override // m.a
            public final Object apply(Object obj) {
                List a10;
                a10 = b.this.a((JSONArray) obj);
                return a10;
            }
        };
        y4 y4Var = this.synchronizedAdObject;
        if (y4Var != null) {
            return (List) y4Var.a(new m.a() { // from class: com.applovin.impl.sdk.ad.l
                @Override // m.a
                public final Object apply(Object obj) {
                    List a10;
                    a10 = b.a(m.a.this, (y4) obj);
                    return a10;
                }
            });
        }
        synchronized (this.adObjectLock) {
            list = (List) aVar.apply(getJsonArrayFromAdObject("omid_verification_script_resources", null));
        }
        return list;
    }

    public List getPrivacySandboxImpressionAttributionUrls() {
        List<String> stringListFromAdObject = getStringListFromAdObject("privacy_sandbox_impression_attribution_urls", Collections.emptyList());
        if (stringListFromAdObject.isEmpty()) {
            return stringListFromAdObject;
        }
        ArrayList arrayList = new ArrayList(stringListFromAdObject.size());
        String clCode = getClCode();
        for (String str : stringListFromAdObject) {
            arrayList.add(str.replace("{CLCODE}", clCode));
        }
        return arrayList;
    }

    public String h() {
        String stringFromAdObject = getStringFromAdObject("base_url", "/");
        if ("null".equalsIgnoreCase(stringFromAdObject)) {
            return null;
        }
        return stringFromAdObject;
    }

    public abstract Uri h0();

    public List i() {
        return this.f8730e;
    }

    public long i0() {
        return getLongFromAdObject("close_delay", 0L);
    }

    @Override // com.applovin.impl.sdk.array.ArrayDirectDownloadAd
    public boolean isDirectDownloadEnabled() {
        return StringUtils.isValidString(getDirectDownloadToken());
    }

    @Override // com.applovin.impl.sdk.AppLovinAdBase, com.applovin.impl.u3
    public abstract boolean isOpenMeasurementEnabled();

    public abstract Uri j();

    public long j0() {
        return TimeUnit.SECONDS.toMillis(getLongFromAdObject("close_delay_max_buffering_time_seconds", 5L));
    }

    public int k0() {
        return d7.a(getIntFromAdObject("video_completion_percent", -1));
    }

    public d l() {
        if (this.f8735j == null) {
            this.f8735j = new d();
        }
        return this.f8735j;
    }

    public List l0() {
        List a10;
        y4 y4Var = this.synchronizedAdObject;
        if (y4Var != null) {
            return (List) y4Var.a(new m.a() { // from class: com.applovin.impl.sdk.ad.a0
                @Override // m.a
                public final Object apply(Object obj) {
                    List q10;
                    q10 = b.this.q((y4) obj);
                    return q10;
                }
            });
        }
        synchronized (this.adObjectLock) {
            a10 = d7.a(getJsonObjectFromAdObject("video_end_urls", new JSONObject()), getClCode(), m0(), this.sdk);
        }
        return a10;
    }

    public int m() {
        return getIntFromAdObject("close_button_size", ((Integer) this.sdk.a(o4.S1)).intValue());
    }

    public e.a n() {
        List K = K();
        int intFromAdObject = getIntFromAdObject("close_style", (K == null || K.size() <= 0) ? -1 : ((Integer) K.get(0)).intValue());
        return intFromAdObject == -1 ? a(hasVideoUrl()) : a(intFromAdObject);
    }

    public e n0() {
        String stringFromAdObject = getStringFromAdObject("video_gravity", null);
        if ("top".equals(stringFromAdObject)) {
            return e.TOP;
        }
        if ("bottom".equals(stringFromAdObject)) {
            return e.BOTTOM;
        }
        if ("left".equals(stringFromAdObject)) {
            return e.LEFT;
        }
        if ("right".equals(stringFromAdObject)) {
            return e.RIGHT;
        }
        return e.RESIZE_ASPECT;
    }

    public int o0() {
        return getColorFromAdObject("progress_bar_color", -922746881);
    }

    public long p() {
        List L = L();
        long longFromAdObject = getLongFromAdObject("close_delay_graphic", (L == null || L.size() <= 0) ? 0L : ((Integer) L.get(0)).intValue());
        if (longFromAdObject == -1 || longFromAdObject == -2) {
            return 0L;
        }
        return longFromAdObject;
    }

    public boolean p0() {
        return getBooleanFromAdObject("progress_bar_enabled", Boolean.FALSE);
    }

    public int q() {
        return getColorFromAdObject("countdown_color", -922746881);
    }

    public abstract Uri q0();

    public int r() {
        return getIntFromAdObject("countdown_length", 0);
    }

    public int r0() {
        int i10;
        if (d7.a(getSize())) {
            i10 = 1;
        } else {
            i10 = ((Boolean) this.sdk.a(o4.E5)).booleanValue() ? 0 : -1;
        }
        return getIntFromAdObject("whalt", i10);
    }

    public com.applovin.impl.adview.m s0() {
        y4 y4Var = this.synchronizedAdObject;
        if (y4Var != null) {
            return (com.applovin.impl.adview.m) y4Var.a(new m.a() { // from class: com.applovin.impl.sdk.ad.o
                @Override // m.a
                public final Object apply(Object obj) {
                    com.applovin.impl.adview.m r10;
                    r10 = b.r((y4) obj);
                    return r10;
                }
            });
        }
        JSONObject jsonObjectFromAdObject = getJsonObjectFromAdObject("web_view_settings", null);
        if (jsonObjectFromAdObject != null) {
            return new com.applovin.impl.adview.m(jsonObjectFromAdObject);
        }
        return null;
    }

    public List t() {
        List a10;
        y4 y4Var = this.synchronizedAdObject;
        if (y4Var != null) {
            return (List) y4Var.a(new m.a() { // from class: com.applovin.impl.sdk.ad.u
                @Override // m.a
                public final Object apply(Object obj) {
                    List d10;
                    d10 = b.this.d((y4) obj);
                    return d10;
                }
            });
        }
        synchronized (this.adObjectLock) {
            a10 = d7.a(getJsonObjectFromAdObject("custom_tabs_navigation_aborted_urls", new JSONObject()), getClCode(), (String) null, this.sdk);
        }
        return a10;
    }

    public List t0() {
        return CollectionUtils.explode(getStringFromAdObject("wlh", null));
    }

    public List u() {
        List a10;
        y4 y4Var = this.synchronizedAdObject;
        if (y4Var != null) {
            return (List) y4Var.a(new m.a() { // from class: com.applovin.impl.sdk.ad.x
                @Override // m.a
                public final Object apply(Object obj) {
                    List e8;
                    e8 = b.this.e((y4) obj);
                    return e8;
                }
            });
        }
        synchronized (this.adObjectLock) {
            a10 = d7.a(getJsonObjectFromAdObject("custom_tabs_navigation_failed_urls", new JSONObject()), getClCode(), (String) null, this.sdk);
        }
        return a10;
    }

    public List u0() {
        return CollectionUtils.explode(getStringFromAdObject("wls", ""));
    }

    public List v() {
        List a10;
        y4 y4Var = this.synchronizedAdObject;
        if (y4Var != null) {
            return (List) y4Var.a(new m.a() { // from class: com.applovin.impl.sdk.ad.z
                @Override // m.a
                public final Object apply(Object obj) {
                    List f10;
                    f10 = b.this.f((y4) obj);
                    return f10;
                }
            });
        }
        synchronized (this.adObjectLock) {
            a10 = d7.a(getJsonObjectFromAdObject("custom_tabs_navigation_finished_urls", new JSONObject()), getClCode(), (String) null, this.sdk);
        }
        return a10;
    }

    public boolean v0() {
        return getBooleanFromAdObject("bvde", (Boolean) this.sdk.a(o4.K5));
    }

    public List w() {
        List a10;
        y4 y4Var = this.synchronizedAdObject;
        if (y4Var != null) {
            return (List) y4Var.a(new m.a() { // from class: com.applovin.impl.sdk.ad.p
                @Override // m.a
                public final Object apply(Object obj) {
                    List g10;
                    g10 = b.this.g((y4) obj);
                    return g10;
                }
            });
        }
        synchronized (this.adObjectLock) {
            a10 = d7.a(getJsonObjectFromAdObject("custom_tabs_navigation_started_urls", new JSONObject()), getClCode(), (String) null, this.sdk);
        }
        return a10;
    }

    public boolean w0() {
        return getBooleanFromAdObject("lhs_close_button", (Boolean) this.sdk.a(o4.Q1));
    }

    public c1 x() {
        y4 y4Var = this.synchronizedAdObject;
        if (y4Var != null) {
            return (c1) y4Var.a(new m.a() { // from class: com.applovin.impl.sdk.ad.t
                @Override // m.a
                public final Object apply(Object obj) {
                    c1 h10;
                    h10 = b.h((y4) obj);
                    return h10;
                }
            });
        }
        JSONObject jsonObjectFromAdObject = getJsonObjectFromAdObject("custom_tabs_settings", null);
        if (jsonObjectFromAdObject != null) {
            return new c1(jsonObjectFromAdObject);
        }
        return null;
    }

    public boolean x0() {
        return getBooleanFromAdObject("custom_tabs_client_warmup_enabled", Boolean.FALSE);
    }

    public List y() {
        List a10;
        y4 y4Var = this.synchronizedAdObject;
        if (y4Var != null) {
            return (List) y4Var.a(new m.a() { // from class: com.applovin.impl.sdk.ad.f
                @Override // m.a
                public final Object apply(Object obj) {
                    List i10;
                    i10 = b.this.i((y4) obj);
                    return i10;
                }
            });
        }
        synchronized (this.adObjectLock) {
            a10 = d7.a(getJsonObjectFromAdObject("custom_tabs_tab_hidden_urls", new JSONObject()), getClCode(), (String) null, this.sdk);
        }
        return a10;
    }

    public boolean y0() {
        return getBooleanFromAdObject("custom_tabs_enabled", Boolean.FALSE);
    }

    public List z() {
        List a10;
        y4 y4Var = this.synchronizedAdObject;
        if (y4Var != null) {
            return (List) y4Var.a(new m.a() { // from class: com.applovin.impl.sdk.ad.y
                @Override // m.a
                public final Object apply(Object obj) {
                    List j10;
                    j10 = b.this.j((y4) obj);
                    return j10;
                }
            });
        }
        synchronized (this.adObjectLock) {
            a10 = d7.a(getJsonObjectFromAdObject("custom_tabs_tab_shown_urls", new JSONObject()), getClCode(), (String) null, this.sdk);
        }
        return a10;
    }

    public boolean z0() {
        return getBooleanFromAdObject("forward_lifecycle_events_to_webview", Boolean.FALSE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ List a(JSONArray jSONArray) {
        if (jSONArray == null) {
            return Collections.emptyList();
        }
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < jSONArray.length(); i10++) {
            JSONObject jSONObject = JsonUtils.getJSONObject(jSONArray, i10, (JSONObject) null);
            try {
                URL url = new URL(JsonUtils.getString(jSONObject, "url", null));
                String string = JsonUtils.getString(jSONObject, "vendor_key", null);
                String string2 = JsonUtils.getString(jSONObject, "parameters", null);
                if (StringUtils.isValidString(string) && StringUtils.isValidString(string2)) {
                    arrayList.add(VerificationScriptResource.createVerificationScriptResourceWithParameters(string, url, string2));
                } else {
                    arrayList.add(VerificationScriptResource.createVerificationScriptResourceWithoutParameters(url));
                }
            } catch (Throwable th) {
                this.sdk.I();
                if (com.applovin.impl.sdk.n.a()) {
                    this.sdk.I().a("DirectAd", "Failed to parse OMID verification script resource", th);
                }
            }
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ List e(y4 y4Var) {
        return d7.a(y4Var.a("custom_tabs_navigation_failed_urls", new JSONObject()), getClCode(), (String) null, this.sdk);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ List i(y4 y4Var) {
        return d7.a(y4Var.a("custom_tabs_tab_hidden_urls", new JSONObject()), getClCode(), (String) null, this.sdk);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Map m(y4 y4Var) {
        try {
            return JsonUtils.toStringMap(y4Var.a("http_headers_for_postbacks", new JSONObject()));
        } catch (JSONException e8) {
            throw new RuntimeException(e8);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ List q(y4 y4Var) {
        return d7.a(y4Var.a("video_end_urls", new JSONObject()), getClCode(), m0(), this.sdk);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ com.applovin.impl.adview.m r(y4 y4Var) {
        JSONObject a10 = y4Var.a("web_view_settings", (JSONObject) null);
        if (a10 != null) {
            return new com.applovin.impl.adview.m(a10);
        }
        return null;
    }

    public void b(boolean z10) {
        y4 y4Var = this.synchronizedAdObject;
        if (y4Var != null) {
            y4Var.a("html_resources_cached", z10);
            return;
        }
        synchronized (this.adObjectLock) {
            JsonUtils.putBoolean(this.adObject, "html_resources_cached", z10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ c1 h(y4 y4Var) {
        JSONObject a10 = y4Var.a("custom_tabs_settings", (JSONObject) null);
        if (a10 != null) {
            return new c1(a10);
        }
        return null;
    }

    public e4 f() {
        return (e4) this.f8733h.getAndSet(null);
    }

    public int k() {
        return getIntFromAdObject("close_button_horizontal_margin", ((Integer) this.sdk.a(o4.R1)).intValue());
    }

    public int o() {
        return getIntFromAdObject("close_button_top_margin", ((Integer) this.sdk.a(o4.T1)).intValue());
    }

    public Bundle s() {
        Map hashMap;
        y4 y4Var = this.synchronizedAdObject;
        if (y4Var != null) {
            hashMap = (Map) y4Var.a(new m.a() { // from class: com.applovin.impl.sdk.ad.g
                @Override // m.a
                public final Object apply(Object obj) {
                    Map c10;
                    c10 = b.this.c((y4) obj);
                    return c10;
                }
            });
        } else {
            try {
                hashMap = JsonUtils.toStringMap(getJsonObjectFromAdObject("custom_tabs_http_headers", new JSONObject()));
            } catch (JSONException e8) {
                this.sdk.I();
                if (com.applovin.impl.sdk.n.a()) {
                    this.sdk.I().a("DirectAd", "Failed to retrieve http headers for Custom Tabs", e8);
                }
                hashMap = new HashMap();
            }
        }
        Bundle bundle = new Bundle();
        for (Map.Entry entry : hashMap.entrySet()) {
            bundle.putString((String) entry.getKey(), (String) entry.getValue());
        }
        if (getBooleanFromAdObject("custom_tabs_should_use_webview_ua", Boolean.FALSE)) {
            bundle.putString("User-Agent", d8.a());
        }
        return bundle;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Map c(y4 y4Var) {
        try {
            return JsonUtils.toStringMap(y4Var.a("custom_tabs_http_headers", new JSONObject()));
        } catch (JSONException e8) {
            this.sdk.I();
            if (com.applovin.impl.sdk.n.a()) {
                this.sdk.I().a("DirectAd", "Failed to retrieve http headers for Custom Tabs", e8);
            }
            return new HashMap();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ List l(y4 y4Var) {
        return d7.a(y4Var.a("imp_urls", new JSONObject()), getClCode(), null, null, R(), Q0(), this.sdk);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ t7 p(y4 y4Var) {
        return new t7(y4Var.a("video_button_properties", (JSONObject) null), this.sdk);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String n(y4 y4Var) {
        return JsonUtils.getString(y4Var.a("video_button_properties", (JSONObject) null), "video_button_base_url", "/");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ List g(y4 y4Var) {
        return d7.a(y4Var.a("custom_tabs_navigation_started_urls", new JSONObject()), getClCode(), (String) null, this.sdk);
    }

    public void c(Uri uri) {
        y4 y4Var = this.synchronizedAdObject;
        if (y4Var != null) {
            y4Var.b("unmute_image", uri.toString());
            return;
        }
        synchronized (this.adObjectLock) {
            JsonUtils.putString(this.adObject, "unmute_image", uri.toString());
        }
    }

    public List d(MotionEvent motionEvent, boolean z10, boolean z11) {
        List<String> stringListFromAdObject = getStringListFromAdObject("privacy_sandbox_click_attribution_urls", Collections.emptyList());
        if (stringListFromAdObject.isEmpty()) {
            return stringListFromAdObject;
        }
        Map a10 = a(motionEvent, z10, z11);
        ArrayList arrayList = new ArrayList(stringListFromAdObject.size());
        for (String str : stringListFromAdObject) {
            arrayList.add(StringUtils.replace(str, a10));
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ List b(y4 y4Var) {
        return d7.a(y4Var.a("app_killed_urls", new JSONObject()), getClCode(), (String) null, this.sdk);
    }

    private List b(final MotionEvent motionEvent, final boolean z10, final boolean z11) {
        List a10;
        y4 y4Var = this.synchronizedAdObject;
        if (y4Var != null) {
            return (List) y4Var.a(new m.a() { // from class: com.applovin.impl.sdk.ad.k
                @Override // m.a
                public final Object apply(Object obj) {
                    List a11;
                    a11 = b.this.a(motionEvent, z10, z11, (y4) obj);
                    return a11;
                }
            });
        }
        synchronized (this.adObjectLock) {
            a10 = d7.a(getJsonObjectFromAdObject("click_tracking_urls", new JSONObject()), a(motionEvent, z10, z11), c(motionEvent, z10, z11), R(), Q0(), this.sdk);
        }
        return a10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ List d(y4 y4Var) {
        return d7.a(y4Var.a("custom_tabs_navigation_aborted_urls", new JSONObject()), getClCode(), (String) null, this.sdk);
    }

    public void c() {
        this.f8732g.set(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ List a(m.a aVar, y4 y4Var) {
        return (List) aVar.apply(y4Var.a("omid_verification_script_resources", (JSONArray) null));
    }

    public void a(Uri uri) {
        this.f8730e.add(uri);
    }

    public void a(final String str) {
        y4 y4Var = this.synchronizedAdObject;
        if (y4Var != null) {
            y4Var.a(new androidx.core.util.b() { // from class: com.applovin.impl.sdk.ad.e
                @Override // androidx.core.util.b
                public final void accept(Object obj) {
                    b.a(str, (y4) obj);
                }
            });
            return;
        }
        synchronized (this.adObjectLock) {
            JsonUtils.putString(getJsonObjectFromAdObject("video_button_properties", null), "video_button_html", str);
        }
    }

    public List b(final MotionEvent motionEvent, final boolean z10) {
        List a10;
        List list;
        y4 y4Var = this.synchronizedAdObject;
        if (y4Var != null) {
            list = (List) y4Var.a(new m.a() { // from class: com.applovin.impl.sdk.ad.j
                @Override // m.a
                public final Object apply(Object obj) {
                    List a11;
                    a11 = b.this.a(motionEvent, z10, (y4) obj);
                    return a11;
                }
            });
        } else {
            synchronized (this.adObjectLock) {
                a10 = d7.a(getJsonObjectFromAdObject("video_click_tracking_urls", new JSONObject()), a(motionEvent, true, z10), null, R(), Q0(), this.sdk);
            }
            list = a10;
        }
        return list.isEmpty() ? b(motionEvent, true, z10) : list;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void a(String str, y4 y4Var) {
        JsonUtils.putString(y4Var.a("video_button_properties", (JSONObject) null), "video_button_html", str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ List a(y4 y4Var) {
        return d7.a(y4Var.a("ad_closed_urls", new JSONObject()), getClCode(), (String) null, this.sdk);
    }

    public List a(MotionEvent motionEvent, boolean z10) {
        return b(motionEvent, false, z10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ List a(MotionEvent motionEvent, boolean z10, boolean z11, y4 y4Var) {
        return d7.a(y4Var.a("click_tracking_urls", new JSONObject()), a(motionEvent, z10, z11), c(motionEvent, z10, z11), R(), Q0(), this.sdk);
    }

    public void b(Uri uri) {
        y4 y4Var = this.synchronizedAdObject;
        if (y4Var != null) {
            y4Var.b("mute_image", uri.toString());
            return;
        }
        synchronized (this.adObjectLock) {
            JsonUtils.putString(this.adObject, "mute_image", uri.toString());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ List a(MotionEvent motionEvent, boolean z10, y4 y4Var) {
        return d7.a(y4Var.a("video_click_tracking_urls", new JSONObject()), a(motionEvent, true, z10), null, R(), Q0(), this.sdk);
    }

    private Map a(MotionEvent motionEvent, boolean z10, boolean z11) {
        Point b10 = l0.b(com.applovin.impl.sdk.j.m());
        HashMap hashMap = new HashMap(7);
        hashMap.put("{CLCODE}", getClCode());
        hashMap.put("{CLICK_X}", String.valueOf(motionEvent != null ? motionEvent.getRawX() : -1.0f));
        hashMap.put("{CLICK_Y}", String.valueOf(motionEvent != null ? motionEvent.getRawY() : -1.0f));
        hashMap.put("{SCREEN_WIDTH}", String.valueOf(b10.x));
        hashMap.put("{SCREEN_HEIGHT}", String.valueOf(b10.y));
        hashMap.put("{IS_VIDEO_CLICK}", String.valueOf(z10));
        hashMap.put("{IS_INSTALL}", String.valueOf(z11));
        return hashMap;
    }

    public void a(e4 e4Var) {
        this.f8733h.set(e4Var);
    }

    private e.a a(boolean z10) {
        return z10 ? e.a.WHITE_ON_TRANSPARENT : e.a.WHITE_ON_BLACK;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public e.a a(int i10) {
        if (i10 == 1) {
            return e.a.WHITE_ON_TRANSPARENT;
        }
        if (i10 == 2) {
            return e.a.INVISIBLE;
        }
        if (i10 == 3) {
            return e.a.TRANSPARENT_SKIP;
        }
        return e.a.WHITE_ON_BLACK;
    }
}
