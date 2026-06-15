package com.applovin.impl.sdk.nativeAd;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import com.applovin.impl.a4;
import com.applovin.impl.adview.AppLovinTouchToClickListener;
import com.applovin.impl.b7;
import com.applovin.impl.d7;
import com.applovin.impl.e7;
import com.applovin.impl.l0;
import com.applovin.impl.l2;
import com.applovin.impl.o4;
import com.applovin.impl.sdk.AppLovinAdBase;
import com.applovin.impl.sdk.array.ArrayService;
import com.applovin.impl.sdk.n;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.u7;
import com.applovin.impl.w7;
import com.applovin.impl.y3;
import com.applovin.impl.y4;
import com.applovin.sdk.AppLovinSdkUtils;
import com.iab.omid.library.applovin.adsession.VerificationScriptResource;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;
import org.json.JSONObject;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class AppLovinNativeAdImpl extends AppLovinAdBase implements AppLovinNativeAd, View.OnClickListener, AppLovinTouchToClickListener.OnClickListener {
    private static final String AD_RESPONSE_TYPE_APPLOVIN = "applovin";
    private static final String AD_RESPONSE_TYPE_ORTB = "ortb";
    private static final String AD_RESPONSE_TYPE_UNDEFINED = "undefined";
    private static final String DEFAULT_APPLOVIN_PRIVACY_URL = "https://www.applovin.com/privacy/";
    private static final float MINIMUM_STARS_TO_RENDER = 3.0f;
    private static final String TAG = "AppLovinNativeAd";
    private static final int VIEWABLE_MRC100_PERCENTAGE = 100;
    private static final int VIEWABLE_MRC50_PERCENTAGE = 50;
    private static final int VIEWABLE_MRC_REQUIRED_SECONDS = 1;
    private static final int VIEWABLE_VIDEO_MRC_REQUIRED_SECONDS = 2;
    private final y3 adEventTracker;
    private final String advertiser;
    private final String body;
    private final String callToAction;
    private final Uri clickDestinationBackupUri;
    private final Uri clickDestinationUri;
    private final List<com.applovin.impl.sdk.network.e> clickTrackingRequests;
    private final List<String> clickTrackingUrls;
    private AppLovinNativeAdEventListener eventListener;
    private Uri iconUri;
    private final List<com.applovin.impl.sdk.network.e> impressionRequests;
    private final AtomicBoolean impressionTracked;
    private final List<String> jsTrackers;
    private float mainImageAspectRatio;
    private Uri mainImageUri;
    private AppLovinMediaView mediaView;
    private ViewGroup nativeAdView;
    private final b onAttachStateChangeHandler;
    private AppLovinOptionsView optionsView;
    private Uri privacyDestinationUri;
    private Uri privacyIconUri;
    private final List<View> registeredViews;
    private final Double starRating;
    private final String tag;
    private final String title;
    private final e7 vastAd;
    private View videoView;
    private final c viewableMRC100Callback;
    private w7 viewableMRC100Tracker;
    private final c viewableMRC50Callback;
    private w7 viewableMRC50Tracker;
    private c viewableVideoMRC50Callback;
    private w7 viewableVideoMRC50Tracker;

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public static class Builder {
        private final JSONObject adObject;
        private String advertiser;
        private String body;
        private String callToAction;
        private Uri clickDestinationBackupUri;
        private Uri clickDestinationUri;
        private List<com.applovin.impl.sdk.network.e> clickTrackingRequests;
        private List<String> clickTrackingUrls;
        private final JSONObject fullResponse;
        private Uri iconUri;
        private List<com.applovin.impl.sdk.network.e> impressionRequests;
        private List<String> jsTrackers;
        private float mainImageAspectRatio;
        private Uri mainImageUri;
        private Uri privacyDestinationUri;
        private Uri privacyIconUri;
        private final com.applovin.impl.sdk.j sdk;
        private Double starRating;
        private String title;
        private e7 vastAd;
        private List<com.applovin.impl.sdk.network.e> viewableMRC100Requests;
        private List<com.applovin.impl.sdk.network.e> viewableMRC50Requests;
        private List<com.applovin.impl.sdk.network.e> viewableVideo50Requests;

        public Builder(JSONObject jSONObject, JSONObject jSONObject2, com.applovin.impl.sdk.j jVar) {
            this.adObject = jSONObject;
            this.fullResponse = jSONObject2;
            this.sdk = jVar;
        }

        public AppLovinNativeAdImpl build() {
            return new AppLovinNativeAdImpl(this, null);
        }

        public Builder setAdvertiser(String str) {
            this.advertiser = str;
            return this;
        }

        public Builder setBody(String str) {
            this.body = str;
            return this;
        }

        public Builder setCallToAction(String str) {
            this.callToAction = str;
            return this;
        }

        public Builder setClickDestinationBackupUri(Uri uri) {
            this.clickDestinationBackupUri = uri;
            return this;
        }

        public Builder setClickDestinationUri(Uri uri) {
            this.clickDestinationUri = uri;
            return this;
        }

        public Builder setClickTrackingRequests(List<com.applovin.impl.sdk.network.e> list) {
            this.clickTrackingRequests = list;
            return this;
        }

        public Builder setClickTrackingUrls(List<String> list) {
            this.clickTrackingUrls = list;
            return this;
        }

        public Builder setIconUri(Uri uri) {
            this.iconUri = uri;
            return this;
        }

        public Builder setImpressionRequests(List<com.applovin.impl.sdk.network.e> list) {
            this.impressionRequests = list;
            return this;
        }

        public Builder setJsTrackers(List<String> list) {
            this.jsTrackers = list;
            return this;
        }

        public Builder setMainImageUri(Uri uri) {
            this.mainImageUri = uri;
            return this;
        }

        public Builder setPrivacyDestinationUri(Uri uri) {
            this.privacyDestinationUri = uri;
            return this;
        }

        public Builder setPrivacyIconUri(Uri uri) {
            this.privacyIconUri = uri;
            return this;
        }

        public Builder setStarRating(Double d10) {
            this.starRating = d10;
            return this;
        }

        public Builder setTitle(String str) {
            this.title = str;
            return this;
        }

        public Builder setVastAd(e7 e7Var) {
            this.vastAd = e7Var;
            return this;
        }

        public Builder setViewableMRC100Requests(List<com.applovin.impl.sdk.network.e> list) {
            this.viewableMRC100Requests = list;
            return this;
        }

        public Builder setViewableMRC50Requests(List<com.applovin.impl.sdk.network.e> list) {
            this.viewableMRC50Requests = list;
            return this;
        }

        public Builder setViewableVideo50Requests(List<com.applovin.impl.sdk.network.e> list) {
            this.viewableVideo50Requests = list;
            return this;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public class a implements ArrayService.DirectDownloadListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Uri f8990a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Uri f8991b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ Context f8992c;

        a(Uri uri, Uri uri2, Context context) {
            this.f8990a = uri;
            this.f8991b = uri2;
            this.f8992c = context;
        }

        @Override // com.applovin.impl.sdk.array.ArrayService.DirectDownloadListener
        public void onEvent(String str, Bundle bundle) {
        }

        @Override // com.applovin.impl.sdk.array.ArrayService.DirectDownloadListener
        public void onFailure() {
            AppLovinNativeAdImpl.this.launchUri(this.f8990a, this.f8991b, this.f8992c);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public static class b implements View.OnAttachStateChangeListener {

        /* renamed from: a  reason: collision with root package name */
        private final AppLovinNativeAdImpl f8994a;

        public b(AppLovinNativeAdImpl appLovinNativeAdImpl) {
            this.f8994a = appLovinNativeAdImpl;
        }

        protected boolean a(Object obj) {
            return obj instanceof b;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (obj instanceof b) {
                b bVar = (b) obj;
                if (bVar.a(this)) {
                    AppLovinNativeAdImpl a10 = a();
                    AppLovinNativeAdImpl a11 = bVar.a();
                    return a10 != null ? a10.equals(a11) : a11 == null;
                }
                return false;
            }
            return false;
        }

        public int hashCode() {
            AppLovinNativeAdImpl a10 = a();
            return (a10 == null ? 43 : a10.hashCode()) + 59;
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
            this.f8994a.maybeHandleOnAttachedToWindow(view);
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
        }

        public String toString() {
            return "AppLovinNativeAdImpl.OnAttachStateChangeHandler(ad=" + a() + ")";
        }

        public AppLovinNativeAdImpl a() {
            return this.f8994a;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public class c implements w7.a {

        /* renamed from: a  reason: collision with root package name */
        private final List f8995a;

        public c(List list) {
            this.f8995a = list;
        }

        protected boolean a(Object obj) {
            return obj instanceof c;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (obj instanceof c) {
                c cVar = (c) obj;
                if (cVar.a(this)) {
                    List a10 = a();
                    List a11 = cVar.a();
                    return a10 != null ? a10.equals(a11) : a11 == null;
                }
                return false;
            }
            return false;
        }

        public int hashCode() {
            List a10 = a();
            return (a10 == null ? 43 : a10.hashCode()) + 59;
        }

        @Override // com.applovin.impl.w7.a
        public void onLogVisibilityImpression() {
            for (com.applovin.impl.sdk.network.e eVar : this.f8995a) {
                ((AppLovinAdBase) AppLovinNativeAdImpl.this).sdk.X().dispatchPostbackRequest(eVar, null);
            }
        }

        public String toString() {
            return "AppLovinNativeAdImpl.VisibilityCallback(requests=" + a() + ")";
        }

        public List a() {
            return this.f8995a;
        }
    }

    /* synthetic */ AppLovinNativeAdImpl(Builder builder, a aVar) {
        this(builder);
    }

    private List<com.applovin.impl.e> getDirectClickTrackingPostbacks() {
        List<com.applovin.impl.e> a10;
        y4 y4Var = this.synchronizedAdObject;
        if (y4Var != null) {
            return (List) y4Var.a(new m.a() { // from class: com.applovin.impl.sdk.nativeAd.d
                @Override // m.a
                public final Object apply(Object obj) {
                    List lambda$getDirectClickTrackingPostbacks$1;
                    lambda$getDirectClickTrackingPostbacks$1 = AppLovinNativeAdImpl.this.lambda$getDirectClickTrackingPostbacks$1((y4) obj);
                    return lambda$getDirectClickTrackingPostbacks$1;
                }
            });
        }
        synchronized (this.adObjectLock) {
            a10 = d7.a(getJsonObjectFromAdObject("click_tracking_urls", new JSONObject()), getClCode(), getStringFromAdObject("click_tracking_url", null), this.sdk);
        }
        return a10;
    }

    private List<String> getPrivacySandboxClickAttributionUrls() {
        return getStringListFromAdObject("privacy_sandbox_click_attribution_urls", Collections.emptyList());
    }

    private List<String> getPrivacySandboxImpressionAttributionUrls() {
        return getStringListFromAdObject("privacy_sandbox_impression_attribution_urls", Collections.emptyList());
    }

    private boolean isDspAd() {
        return AD_RESPONSE_TYPE_ORTB.equalsIgnoreCase(getType());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ List lambda$getDirectClickTrackingPostbacks$1(y4 y4Var) {
        return d7.a(y4Var.a("click_tracking_urls", new JSONObject()), getClCode(), y4Var.a("click_tracking_url", (String) null), this.sdk);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Bundle lambda$getDirectDownloadParameters$4(y4 y4Var) {
        return JsonUtils.toBundle(y4Var.a("ah_parameters", (JSONObject) null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ List lambda$getOpenMeasurementVerificationScriptResources$2(JSONArray jSONArray) {
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
                if (n.a()) {
                    this.sdk.I().a(this.tag, "Failed to parse OMID verification script resource", th);
                }
            }
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ List lambda$getOpenMeasurementVerificationScriptResources$3(m.a aVar, y4 y4Var) {
        return (List) aVar.apply(y4Var.a("omid_verification_script_resources", (JSONArray) null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$unregisterViewsForInteraction$0() {
        for (View view : this.registeredViews) {
            view.setOnTouchListener(null);
            view.setOnClickListener(null);
        }
        this.sdk.I();
        if (n.a()) {
            n I = this.sdk.I();
            String str = this.tag;
            I.a(str, "Unregistered views: " + this.registeredViews);
        }
        this.registeredViews.clear();
        w7 w7Var = this.viewableMRC50Tracker;
        if (w7Var != null) {
            w7Var.b();
        }
        w7 w7Var2 = this.viewableMRC100Tracker;
        if (w7Var2 != null) {
            w7Var2.b();
        }
        w7 w7Var3 = this.viewableVideoMRC50Tracker;
        if (w7Var3 != null) {
            w7Var3.b();
        }
        ViewGroup viewGroup = this.nativeAdView;
        if (viewGroup != null) {
            viewGroup.removeOnAttachStateChangeListener(this.onAttachStateChangeHandler);
            this.nativeAdView = null;
        }
        AppLovinMediaView appLovinMediaView = this.mediaView;
        if (appLovinMediaView != null) {
            appLovinMediaView.destroy();
        }
        AppLovinOptionsView appLovinOptionsView = this.optionsView;
        if (appLovinOptionsView != null) {
            appLovinOptionsView.destroy();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void launchUri(Uri uri, Uri uri2, Context context) {
        if (b7.a(uri, context, this.sdk)) {
            this.sdk.I();
            if (n.a()) {
                n I = this.sdk.I();
                String str = this.tag;
                I.a(str, "Opening URL: " + uri);
            }
        } else if (b7.a(uri2, context, this.sdk)) {
            this.sdk.I();
            if (n.a()) {
                n I2 = this.sdk.I();
                String str2 = this.tag;
                I2.a(str2, "Opening backup URL: " + uri2);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void maybeHandleOnAttachedToWindow(View view) {
        if (this.impressionTracked.compareAndSet(false, true)) {
            w7 w7Var = new w7(this.nativeAdView, this.sdk, this.viewableMRC50Callback);
            this.viewableMRC50Tracker = w7Var;
            TimeUnit timeUnit = TimeUnit.SECONDS;
            w7Var.a(0, 50.0f, 50.0f, timeUnit.toMillis(1L), this.nativeAdView);
            w7 w7Var2 = new w7(this.nativeAdView, this.sdk, this.viewableMRC100Callback);
            this.viewableMRC100Tracker = w7Var2;
            w7Var2.a(0, 100.0f, 100.0f, timeUnit.toMillis(1L), this.nativeAdView);
            e7 e7Var = this.vastAd;
            if (e7Var != null && e7Var.hasVideoUrl()) {
                w7 w7Var3 = new w7(this.nativeAdView, this.sdk, this.viewableVideoMRC50Callback);
                this.viewableVideoMRC50Tracker = w7Var3;
                w7Var3.a(0, 50.0f, 50.0f, timeUnit.toMillis(2L), this.videoView);
            }
            List<String> list = this.jsTrackers;
            if (list != null) {
                for (String str : list) {
                    this.sdk.p0().b(str);
                }
            }
            for (com.applovin.impl.sdk.network.e eVar : this.impressionRequests) {
                this.sdk.X().dispatchPostbackRequest(eVar, null);
            }
            this.adEventTracker.a(view);
            this.adEventTracker.g();
            if (this.sdk.Y() != null) {
                this.sdk.Y().b(getPrivacySandboxImpressionAttributionUrls());
            }
        }
    }

    @Override // com.applovin.impl.sdk.nativeAd.AppLovinNativeAd
    public void destroy() {
        unregisterViewsForInteraction();
        this.eventListener = null;
        this.adEventTracker.f();
    }

    @Override // com.applovin.impl.sdk.AppLovinAdBase
    public long getAdIdNumber() {
        return getLongFromAdObject("ad_id", -1L);
    }

    @Override // com.applovin.impl.sdk.nativeAd.AppLovinNativeAd
    public String getAdvertiser() {
        return this.advertiser;
    }

    @Override // com.applovin.impl.sdk.nativeAd.AppLovinNativeAd
    public String getBody() {
        return this.body;
    }

    public String getCachePrefix() {
        return getStringFromAdObject("cache_prefix", null);
    }

    @Override // com.applovin.impl.sdk.nativeAd.AppLovinNativeAd
    public String getCallToAction() {
        return this.callToAction;
    }

    @Override // com.applovin.impl.sdk.array.ArrayDirectDownloadAd
    public Bundle getDirectDownloadParameters() {
        y4 y4Var = this.synchronizedAdObject;
        if (y4Var != null) {
            return (Bundle) y4Var.a(new m.a() { // from class: com.applovin.impl.sdk.nativeAd.g
                @Override // m.a
                public final Object apply(Object obj) {
                    Bundle lambda$getDirectDownloadParameters$4;
                    lambda$getDirectDownloadParameters$4 = AppLovinNativeAdImpl.lambda$getDirectDownloadParameters$4((y4) obj);
                    return lambda$getDirectDownloadParameters$4;
                }
            });
        }
        return JsonUtils.toBundle(getJsonObjectFromAdObject("ah_parameters", null));
    }

    @Override // com.applovin.impl.sdk.array.ArrayDirectDownloadAd
    public String getDirectDownloadToken() {
        return getStringFromAdObject("ah_dd_token", null);
    }

    @Override // com.applovin.impl.sdk.nativeAd.AppLovinNativeAd
    public Uri getIconUri() {
        return this.iconUri;
    }

    public float getMainImageAspectRatio() {
        return this.mainImageAspectRatio;
    }

    public Uri getMainImageUri() {
        return this.mainImageUri;
    }

    @Override // com.applovin.impl.sdk.nativeAd.AppLovinNativeAd
    public AppLovinMediaView getMediaView() {
        return this.mediaView;
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
    public List<VerificationScriptResource> getOpenMeasurementVerificationScriptResources() {
        List<VerificationScriptResource> list;
        if (this.sdk.V().e()) {
            return Collections.singletonList(VerificationScriptResource.createVerificationScriptResourceWithParameters(a4.c(), a4.b(), a4.a()));
        }
        final m.a aVar = new m.a() { // from class: com.applovin.impl.sdk.nativeAd.e
            @Override // m.a
            public final Object apply(Object obj) {
                List lambda$getOpenMeasurementVerificationScriptResources$2;
                lambda$getOpenMeasurementVerificationScriptResources$2 = AppLovinNativeAdImpl.this.lambda$getOpenMeasurementVerificationScriptResources$2((JSONArray) obj);
                return lambda$getOpenMeasurementVerificationScriptResources$2;
            }
        };
        y4 y4Var = this.synchronizedAdObject;
        if (y4Var != null) {
            return (List) y4Var.a(new m.a() { // from class: com.applovin.impl.sdk.nativeAd.f
                @Override // m.a
                public final Object apply(Object obj) {
                    List lambda$getOpenMeasurementVerificationScriptResources$3;
                    lambda$getOpenMeasurementVerificationScriptResources$3 = AppLovinNativeAdImpl.lambda$getOpenMeasurementVerificationScriptResources$3(m.a.this, (y4) obj);
                    return lambda$getOpenMeasurementVerificationScriptResources$3;
                }
            });
        }
        synchronized (this.adObjectLock) {
            list = (List) aVar.apply(getJsonArrayFromAdObject("omid_verification_script_resources", null));
        }
        return list;
    }

    @Override // com.applovin.impl.sdk.nativeAd.AppLovinNativeAd
    public AppLovinOptionsView getOptionsView() {
        return this.optionsView;
    }

    public Uri getPrivacyDestinationUri() {
        return this.privacyDestinationUri;
    }

    public Uri getPrivacyIconUri() {
        return this.privacyIconUri;
    }

    @Override // com.applovin.impl.sdk.nativeAd.AppLovinNativeAd
    public Double getStarRating() {
        return this.starRating;
    }

    @Override // com.applovin.impl.sdk.nativeAd.AppLovinNativeAd
    public String getTitle() {
        return this.title;
    }

    public String getType() {
        return getStringFromAdObject("type", "undefined");
    }

    public e7 getVastAd() {
        return this.vastAd;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void handleNativeAdClick(Uri uri, Uri uri2, MotionEvent motionEvent, Context context) {
        if (this.sdk.Y() != null) {
            this.sdk.Y().b(getPrivacySandboxClickAttributionUrls(), motionEvent);
        }
        handleNativeAdClick(uri, uri2, context);
    }

    @Override // com.applovin.impl.sdk.array.ArrayDirectDownloadAd
    public boolean isDirectDownloadEnabled() {
        return StringUtils.isValidString(getDirectDownloadToken());
    }

    @Override // com.applovin.impl.sdk.AppLovinAdBase, com.applovin.impl.u3
    public boolean isOpenMeasurementEnabled() {
        if (this.sdk.V().e()) {
            return true;
        }
        return getBooleanFromAdObject("omsdk_enabled", Boolean.FALSE);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        Context context;
        this.sdk.I();
        if (n.a()) {
            this.sdk.I().a(this.tag, "Handle view clicked");
        }
        this.sdk.j().maybeSubmitPersistentPostbacks(getDirectClickTrackingPostbacks());
        if (((Boolean) this.sdk.a(o4.A)).booleanValue()) {
            context = u7.b(this.nativeAdView, this.sdk);
            if (context == null) {
                context = view.getContext();
            }
        } else {
            context = view.getContext();
        }
        handleNativeAdClick(this.clickDestinationUri, this.clickDestinationBackupUri, context);
    }

    @Override // com.applovin.impl.sdk.nativeAd.AppLovinNativeAd
    public void registerViewsForInteraction(List<View> list, ViewGroup viewGroup) {
        this.nativeAdView = viewGroup;
        if (l0.e() && this.nativeAdView.isAttachedToWindow()) {
            maybeHandleOnAttachedToWindow(this.nativeAdView);
        } else if (!l0.e() && this.nativeAdView.getParent() != null) {
            maybeHandleOnAttachedToWindow(this.nativeAdView);
        } else {
            this.nativeAdView.addOnAttachStateChangeListener(this.onAttachStateChangeHandler);
        }
        this.sdk.I();
        if (n.a()) {
            n I = this.sdk.I();
            String str = this.tag;
            I.a(str, "Registered ad view for impressions: " + this.nativeAdView);
        }
        if (this.clickDestinationUri == null && this.clickDestinationBackupUri == null) {
            this.sdk.I();
            if (n.a()) {
                this.sdk.I().a(this.tag, "Skipping click registration - no click URLs provided");
                return;
            }
            return;
        }
        for (View view : list) {
            if (view.hasOnClickListeners()) {
                this.sdk.I();
                if (n.a()) {
                    n I2 = this.sdk.I();
                    String str2 = this.tag;
                    I2.k(str2, "View has an onClickListener already - " + view);
                }
            }
            if (!view.isClickable()) {
                this.sdk.I();
                if (n.a()) {
                    n I3 = this.sdk.I();
                    String str3 = this.tag;
                    I3.k(str3, "View is not clickable - " + view);
                }
            }
            if (!view.isEnabled()) {
                this.sdk.I();
                if (n.a()) {
                    n I4 = this.sdk.I();
                    String str4 = this.tag;
                    I4.b(str4, "View is not enabled - " + view);
                }
            }
            if (view instanceof Button) {
                this.sdk.I();
                if (n.a()) {
                    n I5 = this.sdk.I();
                    String str5 = this.tag;
                    I5.a(str5, "Registering click for button: " + view);
                }
            } else {
                this.sdk.I();
                if (n.a()) {
                    n I6 = this.sdk.I();
                    String str6 = this.tag;
                    I6.a(str6, "Registering click for view: " + view);
                }
            }
            if (((Boolean) this.sdk.a(o4.H2)).booleanValue()) {
                view.setOnTouchListener(new AppLovinTouchToClickListener(this.sdk, o4.f8179o0, viewGroup.getContext(), this));
            } else {
                view.setOnClickListener(this);
            }
            this.registeredViews.add(view);
        }
        this.sdk.I();
        if (n.a()) {
            n I7 = this.sdk.I();
            String str7 = this.tag;
            I7.a(str7, "Registered views: " + this.registeredViews);
        }
    }

    public void setEventListener(AppLovinNativeAdEventListener appLovinNativeAdEventListener) {
        this.eventListener = appLovinNativeAdEventListener;
    }

    public void setIconUri(Uri uri) {
        this.iconUri = uri;
    }

    public void setMainImageAspectRatio(float f10) {
        this.mainImageAspectRatio = f10;
    }

    public void setMainImageUri(Uri uri) {
        this.mainImageUri = uri;
    }

    public void setPrivacyIconUri(Uri uri) {
        this.privacyIconUri = uri;
    }

    public void setUpNativeAdViewComponents() {
        e7 e7Var = this.vastAd;
        if (e7Var != null && e7Var.hasVideoUrl()) {
            try {
                this.mediaView = new AppLovinVastMediaView(this, this.sdk, com.applovin.impl.sdk.j.m());
            } catch (Throwable th) {
                this.sdk.I();
                if (n.a()) {
                    this.sdk.I().d(this.tag, "Failed to create MediaPlayer VAST media view. Falling back to static image for media view.", th);
                }
                this.sdk.D().a(TAG, "createMediaPlayerVASTMediaView", th);
                this.mediaView = new AppLovinMediaView(this, this.sdk, com.applovin.impl.sdk.j.m());
            }
        } else {
            this.mediaView = new AppLovinMediaView(this, this.sdk, com.applovin.impl.sdk.j.m());
        }
        if (this.privacyDestinationUri != null) {
            this.optionsView = new AppLovinOptionsView(this, this.sdk, com.applovin.impl.sdk.j.m());
            return;
        }
        this.sdk.I();
        if (n.a()) {
            this.sdk.I().a(this.tag, "Privacy icon will not render because no native ad privacy URL is provided.");
        }
    }

    public void setVideoView(View view) {
        this.videoView = view;
    }

    public String toString() {
        return "AppLovinNativeAd{adIdNumber=" + getAdIdNumber() + " - " + getTitle() + "}";
    }

    @Override // com.applovin.impl.sdk.nativeAd.AppLovinNativeAd
    public void unregisterViewsForInteraction() {
        AppLovinSdkUtils.runOnUiThread(new Runnable() { // from class: com.applovin.impl.sdk.nativeAd.c
            @Override // java.lang.Runnable
            public final void run() {
                AppLovinNativeAdImpl.this.lambda$unregisterViewsForInteraction$0();
            }
        });
    }

    private AppLovinNativeAdImpl(Builder builder) {
        super(builder.adObject, builder.fullResponse, builder.sdk);
        this.impressionTracked = new AtomicBoolean();
        this.registeredViews = new ArrayList();
        this.onAttachStateChangeHandler = new b(this);
        this.adEventTracker = new y3(this);
        this.title = builder.title;
        this.advertiser = builder.advertiser;
        this.body = builder.body;
        this.callToAction = builder.callToAction;
        this.iconUri = builder.iconUri;
        this.mainImageUri = builder.mainImageUri;
        this.mainImageAspectRatio = builder.mainImageAspectRatio;
        this.privacyIconUri = builder.privacyIconUri;
        e7 e7Var = builder.vastAd;
        this.vastAd = e7Var;
        this.clickDestinationUri = builder.clickDestinationUri;
        this.clickDestinationBackupUri = builder.clickDestinationBackupUri;
        this.clickTrackingUrls = builder.clickTrackingUrls;
        this.jsTrackers = builder.jsTrackers;
        this.clickTrackingRequests = builder.clickTrackingRequests;
        this.impressionRequests = builder.impressionRequests;
        Double d10 = builder.starRating;
        this.starRating = (d10 == null || d10.doubleValue() < 3.0d) ? null : null;
        if (builder.privacyDestinationUri != null) {
            this.privacyDestinationUri = builder.privacyDestinationUri;
        } else if (!isDspAd() || getSdk().k0().c()) {
            this.privacyDestinationUri = Uri.parse(DEFAULT_APPLOVIN_PRIVACY_URL);
        }
        this.viewableMRC50Callback = new c(builder.viewableMRC50Requests);
        this.viewableMRC100Callback = new c(builder.viewableMRC100Requests);
        if (e7Var != null && e7Var.hasVideoUrl()) {
            this.viewableVideoMRC50Callback = new c(builder.viewableVideo50Requests);
        }
        this.tag = "AppLovinNativeAd:" + getAdIdNumber();
    }

    @Override // com.applovin.impl.sdk.AppLovinAdBase, com.applovin.impl.u3
    public y3 getAdEventTracker() {
        return this.adEventTracker;
    }

    private void handleNativeAdClick(Uri uri, Uri uri2, Context context) {
        if (this.clickTrackingRequests.size() > 0) {
            for (com.applovin.impl.sdk.network.e eVar : this.clickTrackingRequests) {
                this.sdk.X().dispatchPostbackRequest(eVar, null);
            }
        } else {
            for (String str : this.clickTrackingUrls) {
                this.sdk.X().dispatchPostbackAsync(str, null);
            }
        }
        l2.b(this.eventListener, this);
        if (isDirectDownloadEnabled()) {
            this.sdk.n().startDirectInstallOrDownloadProcess(this, null, new a(uri, uri2, context));
        } else {
            launchUri(uri, uri2, context);
        }
    }

    @Override // com.applovin.impl.adview.AppLovinTouchToClickListener.OnClickListener
    public void onClick(View view, MotionEvent motionEvent) {
        Context context;
        this.sdk.I();
        if (n.a()) {
            this.sdk.I().a(this.tag, "Handle view clicked");
        }
        this.sdk.j().maybeSubmitPersistentPostbacks(getDirectClickTrackingPostbacks());
        if (((Boolean) this.sdk.a(o4.A)).booleanValue()) {
            context = u7.b(this.nativeAdView, this.sdk);
            if (context == null) {
                context = view.getContext();
            }
        } else {
            context = view.getContext();
        }
        handleNativeAdClick(this.clickDestinationUri, this.clickDestinationBackupUri, motionEvent, context);
    }
}
