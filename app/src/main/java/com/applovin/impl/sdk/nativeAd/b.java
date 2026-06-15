package com.applovin.impl.sdk.nativeAd;

import android.net.Uri;
import android.text.TextUtils;
import android.webkit.URLUtil;
import com.applovin.impl.a6;
import com.applovin.impl.d7;
import com.applovin.impl.e7;
import com.applovin.impl.o4;
import com.applovin.impl.sdk.AppLovinError;
import com.applovin.impl.sdk.n;
import com.applovin.impl.sdk.nativeAd.AppLovinNativeAdImpl;
import com.applovin.impl.sdk.nativeAd.a;
import com.applovin.impl.sdk.network.e;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.u5;
import com.applovin.impl.z4;
import com.applovin.sdk.AppLovinAd;
import com.applovin.sdk.AppLovinAdLoadListener;
import com.applovin.sdk.AppLovinSdkUtils;
import com.ironsource.b9;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.ironsource.ug;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class b extends z4 implements a.InterfaceC0137a, AppLovinAdLoadListener {
    private final List A;
    private final List B;

    /* renamed from: g  reason: collision with root package name */
    private final JSONObject f9006g;

    /* renamed from: h  reason: collision with root package name */
    private final JSONObject f9007h;

    /* renamed from: i  reason: collision with root package name */
    private final AppLovinNativeAdLoadListener f9008i;

    /* renamed from: j  reason: collision with root package name */
    private String f9009j;

    /* renamed from: k  reason: collision with root package name */
    private String f9010k;

    /* renamed from: l  reason: collision with root package name */
    private String f9011l;

    /* renamed from: m  reason: collision with root package name */
    private Double f9012m;

    /* renamed from: n  reason: collision with root package name */
    private String f9013n;

    /* renamed from: o  reason: collision with root package name */
    private Uri f9014o;

    /* renamed from: p  reason: collision with root package name */
    private Uri f9015p;

    /* renamed from: q  reason: collision with root package name */
    private e7 f9016q;

    /* renamed from: r  reason: collision with root package name */
    private Uri f9017r;

    /* renamed from: s  reason: collision with root package name */
    private Uri f9018s;

    /* renamed from: t  reason: collision with root package name */
    private Uri f9019t;

    /* renamed from: u  reason: collision with root package name */
    private Uri f9020u;

    /* renamed from: v  reason: collision with root package name */
    private final List f9021v;

    /* renamed from: w  reason: collision with root package name */
    private final List f9022w;

    /* renamed from: x  reason: collision with root package name */
    private final List f9023x;

    /* renamed from: y  reason: collision with root package name */
    private final List f9024y;

    /* renamed from: z  reason: collision with root package name */
    private final List f9025z;

    public b(JSONObject jSONObject, JSONObject jSONObject2, AppLovinNativeAdLoadListener appLovinNativeAdLoadListener, com.applovin.impl.sdk.j jVar) {
        super("TaskRenderNativeAd", jVar);
        this.f9009j = "";
        this.f9010k = "";
        this.f9011l = "";
        this.f9012m = null;
        this.f9013n = "";
        this.f9014o = null;
        this.f9015p = null;
        this.f9017r = null;
        this.f9018s = null;
        this.f9019t = null;
        this.f9020u = null;
        this.f9021v = new ArrayList();
        this.f9022w = new ArrayList();
        this.f9023x = new ArrayList();
        this.f9024y = new ArrayList();
        this.f9025z = new ArrayList();
        this.A = new ArrayList();
        this.B = new ArrayList();
        this.f9006g = jSONObject;
        this.f9007h = jSONObject2;
        this.f9008i = appLovinNativeAdLoadListener;
    }

    private void a(JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        String string = JsonUtils.getString(jSONObject, "url", null);
        if (StringUtils.isValidString(string)) {
            this.f9019t = Uri.parse(string);
            if (n.a()) {
                this.f9829c.a(this.f9828b, "Processed click destination URL: " + this.f9019t);
            }
        }
        String string2 = JsonUtils.getString(jSONObject, "fallback", null);
        if (StringUtils.isValidString(string2)) {
            this.f9020u = Uri.parse(string2);
            if (n.a()) {
                this.f9829c.a(this.f9828b, "Processed click destination backup URL: " + this.f9020u);
            }
        }
        JSONArray jSONArray = JsonUtils.getJSONArray(jSONObject, "clicktrackers", null);
        if (jSONArray != null) {
            if (JsonUtils.getBoolean(this.f9006g, "use_requests_for_native_ad_click_postbacks", (Boolean) this.f9827a.a(o4.Q2)).booleanValue()) {
                for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                    Object objectAtIndex = JsonUtils.getObjectAtIndex(jSONArray, i10, null);
                    if (objectAtIndex instanceof String) {
                        String str = (String) objectAtIndex;
                        if (!TextUtils.isEmpty(str)) {
                            this.f9023x.add(new e.a(this.f9827a).b(str).b(false).a(false).h(f()).a());
                        }
                    }
                }
                if (n.a()) {
                    this.f9829c.a(this.f9828b, "Processed click tracking requests: " + this.f9023x);
                    return;
                }
                return;
            }
            try {
                this.f9021v.addAll(JsonUtils.toList(jSONArray));
                if (n.a()) {
                    this.f9829c.a(this.f9828b, "Processed click tracking URLs: " + this.f9021v);
                }
            } catch (Throwable th) {
                if (n.a()) {
                    this.f9829c.a(this.f9828b, "Failed to render click tracking URLs", th);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b(AppLovinNativeAdImpl appLovinNativeAdImpl) {
        if (n.a()) {
            this.f9829c.a(this.f9828b, "Preparing native ad view components...");
        }
        try {
            appLovinNativeAdImpl.setUpNativeAdViewComponents();
            if (n.a()) {
                this.f9829c.a(this.f9828b, "Successfully prepared native ad view components");
            }
            appLovinNativeAdImpl.getAdEventTracker().h();
            this.f9008i.onNativeAdLoaded(appLovinNativeAdImpl);
        } catch (Throwable th) {
            if (n.a()) {
                this.f9829c.a(this.f9828b, "Failed to prepare native ad view components", th);
            }
            b(th.getMessage());
            this.f9827a.D().a(this.f9828b, "prepareNativeComponents", th);
        }
    }

    private void c(final AppLovinNativeAdImpl appLovinNativeAdImpl) {
        AppLovinSdkUtils.runOnUiThread(new Runnable() { // from class: com.applovin.impl.sdk.nativeAd.j
            @Override // java.lang.Runnable
            public final void run() {
                b.this.b(appLovinNativeAdImpl);
            }
        });
    }

    private void e() {
        AppLovinNativeAdImpl build = new AppLovinNativeAdImpl.Builder(JsonUtils.shallowCopy(this.f9006g), JsonUtils.shallowCopy(this.f9007h), this.f9827a).setTitle(this.f9009j).setAdvertiser(this.f9010k).setBody(this.f9011l).setCallToAction(this.f9013n).setStarRating(this.f9012m).setIconUri(this.f9014o).setMainImageUri(this.f9015p).setPrivacyIconUri(this.f9017r).setVastAd(this.f9016q).setPrivacyDestinationUri(this.f9018s).setClickDestinationUri(this.f9019t).setClickDestinationBackupUri(this.f9020u).setClickTrackingUrls(this.f9021v).setJsTrackers(this.f9022w).setClickTrackingRequests(this.f9023x).setImpressionRequests(this.f9024y).setViewableMRC50Requests(this.f9025z).setViewableMRC100Requests(this.A).setViewableVideo50Requests(this.B).build();
        build.getAdEventTracker().e();
        if (n.a()) {
            n nVar = this.f9829c;
            String str = this.f9828b;
            nVar.a(str, "Starting cache task for type: " + build.getType() + "...");
        }
        this.f9827a.i0().a((z4) new a(build, this.f9827a, this), u5.b.CORE);
    }

    private boolean f() {
        return JsonUtils.getBoolean(this.f9006g, "fire_native_ad_postbacks_from_webview", (Boolean) this.f9827a.a(o4.P2)).booleanValue();
    }

    @Override // com.applovin.sdk.AppLovinAdLoadListener
    public void adReceived(AppLovinAd appLovinAd) {
        if (n.a()) {
            this.f9829c.a(this.f9828b, "VAST ad rendered successfully");
        }
        this.f9016q = (e7) appLovinAd;
        e();
    }

    @Override // com.applovin.sdk.AppLovinAdLoadListener
    public void failedToReceiveAd(int i10) {
        if (n.a()) {
            this.f9829c.b(this.f9828b, "VAST ad failed to render");
        }
        e();
    }

    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v12, types: [org.json.JSONObject, java.lang.String] */
    /* JADX WARN: Type inference failed for: r3v19 */
    /* JADX WARN: Type inference failed for: r3v5, types: [org.json.JSONObject, java.lang.String] */
    /* JADX WARN: Type inference failed for: r3v64 */
    /* JADX WARN: Type inference failed for: r3v9 */
    @Override // java.lang.Runnable
    public void run() {
        ?? r32 = 0;
        String string = JsonUtils.getString(this.f9006g, "privacy_icon_url", null);
        if (URLUtil.isValidUrl(string)) {
            this.f9017r = Uri.parse(string);
        }
        String string2 = JsonUtils.getString(this.f9006g, "privacy_url", null);
        if (URLUtil.isValidUrl(string2)) {
            this.f9018s = Uri.parse(string2);
        }
        JSONObject jSONObject = JsonUtils.getJSONObject(this.f9006g, "ortb_response", (JSONObject) null);
        if (jSONObject != null && jSONObject.length() != 0) {
            String string3 = JsonUtils.getString(jSONObject, "version", null);
            JSONObject jSONObject2 = JsonUtils.getJSONObject(jSONObject, b9.h.X, (JSONObject) null);
            if (n.a()) {
                n nVar = this.f9829c;
                String str = this.f9828b;
                nVar.a(str, "Rendering native ad for oRTB version: " + string3);
            }
            JSONObject jSONObject3 = JsonUtils.getJSONObject(jSONObject2, IronSourceConstants.EVENTS_NATIVE, jSONObject2);
            a(JsonUtils.getJSONObject(jSONObject3, "link", (JSONObject) null));
            JSONArray jSONArray = JsonUtils.getJSONArray(jSONObject3, "assets", null);
            if (jSONArray != null && jSONArray.length() != 0) {
                String str2 = "";
                int i10 = 0;
                while (i10 < jSONArray.length()) {
                    JSONObject jSONObject4 = JsonUtils.getJSONObject(jSONArray, i10, (JSONObject) r32);
                    if (jSONObject4.has(b9.h.D0)) {
                        this.f9009j = JsonUtils.getString(JsonUtils.getJSONObject(jSONObject4, b9.h.D0, (JSONObject) r32), b9.h.K0, r32);
                        if (n.a()) {
                            n nVar2 = this.f9829c;
                            String str3 = this.f9828b;
                            nVar2.a(str3, "Processed title: " + this.f9009j);
                        }
                    } else if (jSONObject4.has("link")) {
                        a(JsonUtils.getJSONObject(jSONObject4, "link", (JSONObject) r32));
                    } else if (jSONObject4.has("img")) {
                        int i11 = JsonUtils.getInt(jSONObject4, ug.f21009x, -1);
                        JSONObject jSONObject5 = JsonUtils.getJSONObject(jSONObject4, "img", (JSONObject) r32);
                        int i12 = JsonUtils.getInt(jSONObject5, "type", -1);
                        String string4 = JsonUtils.getString(jSONObject5, "url", r32);
                        if (i12 == 1 || 3 == i11) {
                            this.f9014o = Uri.parse(string4);
                            if (n.a()) {
                                n nVar3 = this.f9829c;
                                String str4 = this.f9828b;
                                nVar3.a(str4, "Processed icon URL: " + this.f9014o);
                            }
                        } else if (i12 != 3 && 2 != i11) {
                            if (n.a()) {
                                n nVar4 = this.f9829c;
                                String str5 = this.f9828b;
                                nVar4.k(str5, "Unrecognized image: " + jSONObject4);
                            }
                            int i13 = JsonUtils.getInt(jSONObject5, "w", -1);
                            int i14 = JsonUtils.getInt(jSONObject5, "h", -1);
                            if (i13 <= 0 || i14 <= 0) {
                                if (n.a()) {
                                    this.f9829c.k(this.f9828b, "Skipping...");
                                }
                            } else if (i13 / i14 > 1.0d) {
                                if (n.a()) {
                                    n nVar5 = this.f9829c;
                                    String str6 = this.f9828b;
                                    nVar5.a(str6, "Inferring main image from " + i13 + "x" + i14 + "...");
                                }
                                this.f9015p = Uri.parse(string4);
                            } else {
                                if (n.a()) {
                                    n nVar6 = this.f9829c;
                                    String str7 = this.f9828b;
                                    nVar6.a(str7, "Inferring icon image from " + i13 + "x" + i14 + "...");
                                }
                                this.f9014o = Uri.parse(string4);
                            }
                        } else {
                            this.f9015p = Uri.parse(string4);
                            if (n.a()) {
                                n nVar7 = this.f9829c;
                                String str8 = this.f9828b;
                                nVar7.a(str8, "Processed main image URL: " + this.f9015p);
                            }
                        }
                    } else if (jSONObject4.has("video")) {
                        String string5 = JsonUtils.getString(JsonUtils.getJSONObject(jSONObject4, "video", (JSONObject) null), "vasttag", null);
                        if (StringUtils.isValidString(string5)) {
                            if (n.a()) {
                                this.f9829c.a(this.f9828b, "Processed VAST video");
                            }
                        } else if (n.a()) {
                            n nVar8 = this.f9829c;
                            String str9 = this.f9828b;
                            nVar8.k(str9, "Ignoring invalid \"vasttag\" for video: " + jSONObject4);
                        }
                        str2 = string5;
                    } else if (jSONObject4.has("data")) {
                        int i15 = JsonUtils.getInt(jSONObject4, ug.f21009x, -1);
                        JSONObject jSONObject6 = JsonUtils.getJSONObject(jSONObject4, "data", (JSONObject) null);
                        int i16 = JsonUtils.getInt(jSONObject6, "type", -1);
                        String string6 = JsonUtils.getString(jSONObject6, b9.h.X, null);
                        if (i16 == 1 || i15 == 8) {
                            this.f9010k = string6;
                            if (n.a()) {
                                n nVar9 = this.f9829c;
                                String str10 = this.f9828b;
                                nVar9.a(str10, "Processed advertiser: " + this.f9010k);
                            }
                        } else if (i16 == 2 || i15 == 4) {
                            this.f9011l = string6;
                            if (n.a()) {
                                n nVar10 = this.f9829c;
                                String str11 = this.f9828b;
                                nVar10.a(str11, "Processed body: " + this.f9011l);
                            }
                        } else if (i16 == 12 || i15 == 5) {
                            this.f9013n = string6;
                            if (n.a()) {
                                n nVar11 = this.f9829c;
                                String str12 = this.f9828b;
                                nVar11.a(str12, "Processed cta: " + this.f9013n);
                            }
                        } else if (i16 != 3 && i15 != 6) {
                            if (n.a()) {
                                n nVar12 = this.f9829c;
                                String str13 = this.f9828b;
                                nVar12.k(str13, "Skipping unsupported data: " + jSONObject4);
                            }
                        } else {
                            double a10 = d7.a(string6, -1.0d);
                            if (a10 == -1.0d) {
                                if (n.a()) {
                                    n nVar13 = this.f9829c;
                                    String str14 = this.f9828b;
                                    nVar13.a(str14, "Received invalid star rating: " + string6);
                                }
                            } else {
                                this.f9012m = Double.valueOf(a10);
                                if (n.a()) {
                                    n nVar14 = this.f9829c;
                                    String str15 = this.f9828b;
                                    nVar14.a(str15, "Processed star rating: " + this.f9012m);
                                }
                            }
                        }
                    } else if (n.a()) {
                        n nVar15 = this.f9829c;
                        String str16 = this.f9828b;
                        nVar15.b(str16, "Unsupported asset object: " + jSONObject4);
                    }
                    i10++;
                    r32 = 0;
                }
                String string7 = JsonUtils.getString(jSONObject3, "jstracker", null);
                if (StringUtils.isValidString(string7)) {
                    this.f9022w.add(string7);
                    if (n.a()) {
                        n nVar16 = this.f9829c;
                        String str17 = this.f9828b;
                        nVar16.a(str17, "Processed jstracker: " + string7);
                    }
                }
                Object obj = null;
                JSONArray jSONArray2 = JsonUtils.getJSONArray(jSONObject3, "imptrackers", null);
                if (jSONArray2 != null) {
                    int i17 = 0;
                    while (i17 < jSONArray2.length()) {
                        Object objectAtIndex = JsonUtils.getObjectAtIndex(jSONArray2, i17, obj);
                        if (objectAtIndex instanceof String) {
                            String str18 = (String) objectAtIndex;
                            if (!TextUtils.isEmpty(str18)) {
                                this.f9024y.add(new e.a(this.f9827a).b(str18).b(false).a(false).h(f()).a());
                                if (n.a()) {
                                    n nVar17 = this.f9829c;
                                    String str19 = this.f9828b;
                                    nVar17.a(str19, "Processed imptracker URL: " + str18);
                                }
                            }
                        }
                        i17++;
                        obj = null;
                    }
                }
                ?? r33 = 0;
                JSONArray jSONArray3 = JsonUtils.getJSONArray(jSONObject3, "eventtrackers", null);
                if (jSONArray3 != null) {
                    int i18 = 0;
                    while (i18 < jSONArray3.length()) {
                        JSONObject jSONObject7 = JsonUtils.getJSONObject(jSONArray3, i18, (JSONObject) r33);
                        int i19 = JsonUtils.getInt(jSONObject7, "event", -1);
                        int i20 = JsonUtils.getInt(jSONObject7, "method", -1);
                        String string8 = JsonUtils.getString(jSONObject7, "url", r33);
                        if (!TextUtils.isEmpty(string8)) {
                            if (i20 != 1 && i20 != 2) {
                                if (n.a()) {
                                    n nVar18 = this.f9829c;
                                    String str20 = this.f9828b;
                                    nVar18.b(str20, "Unsupported method for event tracker: " + jSONObject7);
                                }
                            } else if (i20 == 2 && string8.startsWith("<script")) {
                                this.f9022w.add(string8);
                            } else {
                                com.applovin.impl.sdk.network.e a11 = new e.a(this.f9827a).b(string8).b(false).a(false).h(f() || i20 == 2).a();
                                if (i19 == 1) {
                                    this.f9024y.add(a11);
                                    if (n.a()) {
                                        n nVar19 = this.f9829c;
                                        String str21 = this.f9828b;
                                        nVar19.a(str21, "Processed impression URL: " + string8);
                                    }
                                } else if (i19 == 2) {
                                    this.f9025z.add(a11);
                                    if (n.a()) {
                                        n nVar20 = this.f9829c;
                                        String str22 = this.f9828b;
                                        nVar20.a(str22, "Processed viewable MRC50 URL: " + string8);
                                    }
                                } else if (i19 == 3) {
                                    this.A.add(a11);
                                    if (n.a()) {
                                        n nVar21 = this.f9829c;
                                        String str23 = this.f9828b;
                                        nVar21.a(str23, "Processed viewable MRC100 URL: " + string8);
                                    }
                                } else {
                                    if (i19 == 4) {
                                        this.B.add(a11);
                                        if (n.a()) {
                                            n nVar22 = this.f9829c;
                                            String str24 = this.f9828b;
                                            nVar22.a(str24, "Processed viewable video 50 URL: " + string8);
                                        }
                                    } else if (i19 == 555) {
                                        if (n.a()) {
                                            n nVar23 = this.f9829c;
                                            String str25 = this.f9828b;
                                            nVar23.a(str25, "Ignoring processing of OMID URL: " + string8);
                                        }
                                    } else if (n.a()) {
                                        n nVar24 = this.f9829c;
                                        String str26 = this.f9828b;
                                        nVar24.b(str26, "Unsupported event tracker: " + jSONObject7);
                                    }
                                    i18++;
                                    r33 = 0;
                                }
                                i18++;
                                r33 = 0;
                            }
                        }
                        i18++;
                        r33 = 0;
                    }
                }
                if (StringUtils.isValidString(str2)) {
                    if (n.a()) {
                        this.f9829c.a(this.f9828b, "Processing VAST video...");
                    }
                    this.f9827a.i0().a(a6.a(str2, JsonUtils.shallowCopy(this.f9006g), JsonUtils.shallowCopy(this.f9007h), this, this.f9827a));
                    return;
                }
                e();
                return;
            }
            if (n.a()) {
                n nVar25 = this.f9829c;
                String str27 = this.f9828b;
                nVar25.b(str27, "Unable to retrieve assets - failing ad load: " + this.f9006g);
            }
            b("Unable to retrieve assets");
            return;
        }
        if (n.a()) {
            n nVar26 = this.f9829c;
            String str28 = this.f9828b;
            nVar26.b(str28, "No oRtb response provided: " + this.f9006g);
        }
        b("No oRtb response provided");
    }

    private void b(String str) {
        this.f9008i.onNativeAdLoadFailed(new AppLovinError(-6, str));
    }

    @Override // com.applovin.impl.sdk.nativeAd.a.InterfaceC0137a
    public void a(AppLovinNativeAdImpl appLovinNativeAdImpl) {
        if (n.a()) {
            this.f9829c.a(this.f9828b, "Successfully cached and loaded ad");
        }
        c(appLovinNativeAdImpl);
    }
}
