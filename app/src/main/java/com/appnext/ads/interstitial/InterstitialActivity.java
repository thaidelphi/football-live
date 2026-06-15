package com.appnext.ads.interstitial;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import android.util.Base64;
import android.view.ViewGroup;
import android.webkit.ConsoleMessage;
import android.webkit.JavascriptInterface;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.RelativeLayout;
import androidx.palette.graphics.Palette;
import com.appnext.R;
import com.appnext.ads.AdsError;
import com.appnext.core.Ad;
import com.appnext.core.AppnextActivity;
import com.appnext.core.AppnextAd;
import com.appnext.core.C0400r;
import com.appnext.core.SettingsManager;
import com.appnext.core.callbacks.OnAdClicked;
import com.appnext.core.callbacks.OnAdClosed;
import com.appnext.core.callbacks.OnAdError;
import com.appnext.core.h;
import com.appnext.core.i;
import com.appnext.core.k;
import com.appnext.core.p;
import com.appnext.core.result.ResultPageActivity;
import com.appnext.core.result.d;
import com.appnext.core.webview.AppnextWebView;
import com.appnext.core.webview.WebAppInterface;
import com.ironsource.fe;
import com.ironsource.mediationsdk.impressionData.ImpressionData;
import com.ironsource.ug;
import com.unity3d.services.ads.gmascar.utils.ScarConstants;
import java.io.ByteArrayOutputStream;
import java.util.ArrayList;
import java.util.Locale;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class InterstitialActivity extends AppnextActivity {
    private ArrayList<AppnextAd> aC;
    private ArrayList<AppnextAd> ads;
    protected WebView am;
    private Interstitial ao;
    private InterstitialAd ap;
    private Handler at;
    private h.a au;
    private Boolean autoPlay;
    private WebAppInterface av;
    private String ay;
    private Boolean canClose;

    /* renamed from: j  reason: collision with root package name */
    private AppnextAd f10048j;
    private Boolean mute;
    private boolean an = false;
    private String aq = "";
    private boolean ar = false;
    private int as = 0;
    private boolean aw = false;
    private boolean ax = false;
    private String az = "";
    private boolean aA = false;
    private boolean aB = false;
    private Runnable aD = new Runnable() { // from class: com.appnext.ads.interstitial.InterstitialActivity.10
        @Override // java.lang.Runnable
        public final void run() {
            InterstitialActivity.this.pageFinished();
        }
    };

    /* JADX INFO: Access modifiers changed from: protected */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public class WebInterface extends WebAppInterface {
        public WebInterface() {
            super(InterstitialActivity.this);
        }

        @Override // com.appnext.core.webview.WebAppInterface
        @JavascriptInterface
        public void destroy(String str) {
            try {
                if (str.equals("c_close")) {
                    InterstitialActivity.this.aA = true;
                    InterstitialActivity.this.runOnUiThread(new Runnable() { // from class: com.appnext.ads.interstitial.InterstitialActivity.WebInterface.1
                        @Override // java.lang.Runnable
                        public final void run() {
                            try {
                                JSONObject jSONObject = new JSONObject(InterstitialActivity.this.ap.getAdJSON());
                                jSONObject.put("urlApp", jSONObject.getString("urlApp") + "&tem_id=156");
                                InterstitialActivity.this.e(jSONObject.toString());
                            } catch (JSONException unused) {
                                InterstitialActivity interstitialActivity = InterstitialActivity.this;
                                interstitialActivity.e(interstitialActivity.ap.getAdJSON());
                            }
                        }
                    });
                } else if (str.equals("close")) {
                    InterstitialActivity.this.runOnUiThread(new Runnable() { // from class: com.appnext.ads.interstitial.InterstitialActivity.WebInterface.2
                        @Override // java.lang.Runnable
                        public final void run() {
                            InterstitialActivity.this.a();
                            InterstitialActivity.this.finish();
                        }
                    });
                } else {
                    InterstitialActivity.this.runOnUiThread(new Runnable() { // from class: com.appnext.ads.interstitial.InterstitialActivity.WebInterface.3
                        @Override // java.lang.Runnable
                        public final void run() {
                            InterstitialActivity.this.onError(AdsError.AD_NOT_READY);
                            InterstitialActivity.this.finish();
                        }
                    });
                }
            } catch (Throwable th) {
                com.appnext.base.a.a("InterstitialActivity$destroy", th);
            }
        }

        @Override // com.appnext.core.webview.WebAppInterface
        @JavascriptInterface
        public String filterAds(String str) {
            return str;
        }

        @Override // com.appnext.core.webview.WebAppInterface
        @JavascriptInterface
        public void gotoAppWall() {
        }

        @Override // com.appnext.core.webview.WebAppInterface
        @JavascriptInterface
        public void jsError(String str) {
            try {
                if (TextUtils.isEmpty(str) && (str.contains("is not a function") || str.contains("has no method"))) {
                    InterstitialActivity interstitialActivity = InterstitialActivity.this;
                    int i10 = interstitialActivity.as;
                    interstitialActivity.as = i10 + 1;
                    if (i10 < 5) {
                        InterstitialActivity.this.at.postDelayed(InterstitialActivity.this.aD, 500L);
                        return;
                    }
                    InterstitialActivity.this.onError("Internal error");
                    InterstitialActivity.this.finish();
                    return;
                }
                InterstitialActivity.this.onError("Internal error");
                InterstitialActivity.this.finish();
            } catch (Throwable th) {
                com.appnext.base.a.a("InterstitialActivity$jsError", th);
            }
        }

        @Override // com.appnext.core.webview.WebAppInterface
        @JavascriptInterface
        public String loadAds() {
            return "";
        }

        @Override // com.appnext.core.webview.WebAppInterface
        @JavascriptInterface
        public void logSTP(String str, String str2) {
            try {
                i.a(InterstitialActivity.this.ao, InterstitialActivity.this.ap, str, str2, InterstitialActivity.this.getConfig());
            } catch (Throwable th) {
                com.appnext.base.a.a("InterstitialActivity$logSTP", th);
            }
        }

        @Override // com.appnext.core.webview.WebAppInterface
        @JavascriptInterface
        public void notifyImpression(String str) {
            super.notifyImpression(str);
            try {
                if (InterstitialActivity.this.ap != null) {
                    InterstitialActivity interstitialActivity = InterstitialActivity.this;
                    interstitialActivity.c(interstitialActivity.ap.getBannerID());
                    InterstitialActivity.this.ap.setImpressionURL(str);
                    ((AppnextActivity) InterstitialActivity.this).handler.postDelayed(new a(str), Long.parseLong(InterstitialActivity.this.getConfig().t("postpone_impression_sec")) * 1000);
                }
                if (InterstitialActivity.this.autoPlay == null || !InterstitialActivity.this.autoPlay.booleanValue()) {
                    return;
                }
                play();
            } catch (Throwable th) {
                com.appnext.base.a.a("InterstitialActivity$notifyImpression", th);
            }
        }

        @Override // com.appnext.core.webview.WebAppInterface
        @JavascriptInterface
        public void openLink(String str) {
            try {
                if (str.contains("privacy_policy")) {
                    str = i.d(InterstitialActivity.this.aC);
                }
                InterstitialActivity.this.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(str)));
            } catch (Throwable th) {
                com.appnext.base.a.a("InterstitialActivity$openLink", th);
            }
        }

        @Override // com.appnext.core.webview.WebAppInterface
        @JavascriptInterface
        public void openResultPage(String str) {
            try {
                d.aC().a(new com.appnext.core.result.c() { // from class: com.appnext.ads.interstitial.InterstitialActivity.WebInterface.5
                    @Override // com.appnext.core.result.c
                    public final com.appnext.core.result.a A() {
                        return new com.appnext.core.result.a() { // from class: com.appnext.ads.interstitial.InterstitialActivity.WebInterface.5.1
                            @Override // com.appnext.core.result.a
                            public final Object B() {
                                return null;
                            }

                            @Override // com.appnext.core.result.a
                            public final String getFallbackScript() {
                                return null;
                            }

                            @Override // com.appnext.core.result.a
                            public final String getJSurl() {
                                return "https://cdn.appnext.com/tools/sdk/interstitial/v75/result.min.js";
                            }

                            @Override // com.appnext.core.result.a
                            public final WebViewClient getWebViewClient() {
                                return null;
                            }
                        };
                    }

                    @Override // com.appnext.core.result.c
                    public final JSONObject getConfigParams() throws JSONException {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("vid", "2.7.6.473");
                        jSONObject.put(ScarConstants.TOKEN_ID_KEY, InterstitialActivity.this.ao == null ? "" : InterstitialActivity.this.ao.getTID());
                        jSONObject.put("auid", InterstitialActivity.this.ao != null ? InterstitialActivity.this.ao.getAUID() : "");
                        jSONObject.put("osid", "100");
                        jSONObject.put("tem_id", "1601");
                        jSONObject.put(ug.f21009x, getPlacementId());
                        jSONObject.put("cat", InterstitialActivity.this.ap.getCategories());
                        jSONObject.put("lockcat", InterstitialActivity.this.ap.getSpecificCategories());
                        jSONObject.put("pview", InterstitialActivity.this.getConfig().t("pview"));
                        jSONObject.put("devn", i.X());
                        jSONObject.put("dosv", Build.VERSION.SDK_INT);
                        jSONObject.put("dds", "0");
                        jSONObject.put("ads_type", "banner");
                        jSONObject.put(ImpressionData.IMPRESSION_DATA_KEY_COUNTRY, InterstitialActivity.this.ap.getCountry());
                        jSONObject.put("gdpr", k.a(InterstitialActivity.this.ap, InterstitialActivity.this.getConfig()));
                        return jSONObject;
                    }

                    @Override // com.appnext.core.result.c
                    public final String getPlacementId() {
                        return ((AppnextActivity) InterstitialActivity.this).placementID;
                    }

                    @Override // com.appnext.core.result.c
                    public final AppnextAd getSelectedAd() {
                        return InterstitialActivity.this.ap;
                    }

                    @Override // com.appnext.core.result.c
                    public final String v() {
                        return "160";
                    }

                    @Override // com.appnext.core.result.c
                    public final String w() {
                        return com.appnext.ads.interstitial.a.C().k(InterstitialActivity.this.ao);
                    }

                    @Override // com.appnext.core.result.c
                    public final String x() {
                        return InterstitialActivity.this.ay;
                    }

                    @Override // com.appnext.core.result.c
                    public final SettingsManager y() {
                        return InterstitialActivity.this.getConfig();
                    }

                    @Override // com.appnext.core.result.c
                    public final Ad z() {
                        return InterstitialActivity.this.ao;
                    }
                });
                Intent intent = new Intent(InterstitialActivity.this, ResultPageActivity.class);
                intent.putExtra("shouldClose", false);
                intent.setFlags(65536);
                InterstitialActivity.this.startActivity(intent);
            } catch (Throwable th) {
                com.appnext.base.a.a("InterstitialActivity$openResultPage", th);
            }
        }

        @Override // com.appnext.core.webview.WebAppInterface
        @JavascriptInterface
        public void openStore(final String str) {
            InterstitialActivity.this.runOnUiThread(new Runnable() { // from class: com.appnext.ads.interstitial.InterstitialActivity.WebInterface.4
                @Override // java.lang.Runnable
                public final void run() {
                    InterstitialActivity.this.e(str);
                }
            });
        }

        @Override // com.appnext.core.webview.WebAppInterface
        @JavascriptInterface
        public void play() {
            try {
                String unused = ((AppnextActivity) InterstitialActivity.this).placementID;
                InterstitialActivity.this.play();
            } catch (Throwable th) {
                com.appnext.base.a.a("InterstitialActivity$play", th);
            }
        }

        @Override // com.appnext.core.webview.WebAppInterface
        @JavascriptInterface
        public void postView(String str) {
            try {
                if (InterstitialActivity.this.ap != null) {
                    InterstitialActivity.this.c(i.f(str, "b"));
                }
                if (Boolean.parseBoolean(InterstitialActivity.this.d("pview"))) {
                    ((AppnextActivity) InterstitialActivity.this).handler.postDelayed(new b(str), Long.parseLong(InterstitialActivity.this.getConfig().t("postpone_vta_sec")) * 1000);
                }
            } catch (Throwable th) {
                com.appnext.base.a.a("InterstitialActivity$postView", th);
            }
        }

        @Override // com.appnext.core.webview.WebAppInterface
        @JavascriptInterface
        public void videoPlayed() {
        }
    }

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    private class a implements Runnable {
        AppnextAd aH;

        a(String str) {
            try {
                InterstitialAd interstitialAd = new InterstitialAd(InterstitialActivity.this.ap);
                this.aH = interstitialAd;
                InterstitialAd interstitialAd2 = interstitialAd;
                interstitialAd.setImpressionURL(str);
            } catch (Throwable th) {
                com.appnext.base.a.a("InterstitialActivity$Impression", th);
            }
        }

        @Override // java.lang.Runnable
        public final void run() {
            try {
                if (((AppnextActivity) InterstitialActivity.this).userAction != null) {
                    ((AppnextActivity) InterstitialActivity.this).userAction.d(this.aH);
                    InterstitialActivity interstitialActivity = InterstitialActivity.this;
                    interstitialActivity.a(interstitialActivity, "impression_event");
                }
            } catch (Throwable th) {
                com.appnext.base.a.a("InterstitialActivity$Impression", th);
            }
        }
    }

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    private class b implements Runnable {
        AppnextAd aH;

        b(String str) {
            try {
                com.appnext.ads.interstitial.a.C();
                this.aH = (AppnextAd) com.appnext.core.d.parseAd(str);
            } catch (Throwable th) {
                com.appnext.base.a.a("InterstitialActivity$PostView", th);
            }
        }

        @Override // java.lang.Runnable
        public final void run() {
            try {
                InterstitialActivity.this.a(this.aH, (h.a) null);
            } catch (Throwable th) {
                com.appnext.base.a.a("InterstitialActivity$PostView", th);
            }
        }
    }

    private void loadJS(final String str) {
        runOnUiThread(new Runnable() { // from class: com.appnext.ads.interstitial.InterstitialActivity.3
            @Override // java.lang.Runnable
            public final void run() {
                WebView webView = InterstitialActivity.this.am;
                if (webView != null) {
                    try {
                        webView.loadUrl("javascript:(function() { try { " + str + "} catch(err){ Appnext.jsError(err.message); }})()");
                    } catch (Throwable th) {
                        com.appnext.base.a.a("InterstitialActivity$loadJS", th);
                    }
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void pageFinished() {
        try {
            Handler handler = this.at;
            if (handler != null) {
                handler.removeCallbacks(this.aD);
            }
            this.an = true;
            String string = getIntent().getExtras().getString("creative");
            this.aq = string;
            if (string == null || string.equals(Interstitial.TYPE_MANAGED)) {
                this.aq = d("creative");
            }
            p.ac().a(new Runnable() { // from class: com.appnext.ads.interstitial.InterstitialActivity.11
                @Override // java.lang.Runnable
                public final void run() {
                    InterstitialActivity.this.t();
                }
            });
            WebView webView = this.am;
            if (webView == null) {
                onError("Internal error");
                finish();
                return;
            }
            if (webView.getParent() != null) {
                ((ViewGroup) this.am.getParent()).removeView(this.am);
            }
            this.cx.addView(this.am);
            this.am.getLayoutParams().width = -1;
            this.am.getLayoutParams().height = -1;
        } catch (Throwable th) {
            com.appnext.base.a.a("InterstitialActivity$pageFinished", th);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void play() {
        loadJS("Appnext.Layout.Video.play();");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void r() {
        try {
            AppnextWebView t10 = AppnextWebView.t(this);
            this.am = t10.C(this.ads != null ? "fullscreen" : "interstitial");
            WebView a10 = t10.a(this, this.ao.getPlacementID(), this.ao.getAUID(), this.ao.getPageUrl(), s(), this.ao.getFallback(), this.ads != null ? "fullscreen" : "interstitial");
            this.am = a10;
            a10.setWebViewClient(new WebViewClient() { // from class: com.appnext.ads.interstitial.InterstitialActivity.8
                @Override // android.webkit.WebViewClient
                public final void onPageFinished(WebView webView, String str) {
                    super.onPageFinished(webView, str);
                    InterstitialActivity.this.at.removeCallbacksAndMessages(null);
                    InterstitialActivity.this.pageFinished();
                }

                @Override // android.webkit.WebViewClient
                public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
                    if (str == null) {
                        return false;
                    }
                    if (str.startsWith("http")) {
                        webView.loadUrl(str);
                        return true;
                    }
                    return super.shouldOverrideUrlLoading(webView, str);
                }
            });
            this.am.setWebChromeClient(new WebChromeClient() { // from class: com.appnext.ads.interstitial.InterstitialActivity.9
                @Override // android.webkit.WebChromeClient
                public final boolean onConsoleMessage(ConsoleMessage consoleMessage) {
                    consoleMessage.message();
                    if (consoleMessage.message().contains("pause")) {
                        return true;
                    }
                    if (consoleMessage.message().contains("TypeError") || consoleMessage.message().contains("has no method") || consoleMessage.message().contains("is not a function")) {
                        InterstitialActivity.this.onError("Internal error");
                        InterstitialActivity.this.finish();
                        return true;
                    }
                    return true;
                }
            });
        } catch (Throwable th) {
            com.appnext.base.a.a("InterstitialActivity$initWebView", th);
            onError("Internal error");
            finish();
        }
    }

    @Override // com.appnext.core.AppnextActivity
    protected final SettingsManager getConfig() {
        return c.E();
    }

    @Override // android.app.Activity
    public void onBackPressed() {
        try {
            Boolean bool = this.canClose;
            if (bool != null) {
                if (!bool.booleanValue()) {
                    return;
                }
            } else if (!Boolean.parseBoolean(d("can_close"))) {
                return;
            }
            loadJS("Appnext.Layout.destroy('internal');");
            this.ar = true;
            a();
            finish();
        } catch (Throwable th) {
            com.appnext.base.a.a("InterstitialActivity$onBackPressed", th);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.appnext.core.AppnextActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        setRequestedOrientation(7);
        super.onCreate(bundle);
        try {
            if (Interstitial.currentAd == null) {
                finish();
                return;
            }
            this.ao = new Interstitial(Interstitial.currentAd);
            if (getRequestedOrientation() == 6) {
                a(this, "loaded_landscape");
            } else {
                a(this, "loaded_portrait");
            }
            RelativeLayout relativeLayout = new RelativeLayout(this);
            this.cx = relativeLayout;
            setContentView(relativeLayout);
            this.cx.getLayoutParams().width = -1;
            this.cx.getLayoutParams().height = -1;
            this.cx.setBackgroundColor(-1);
            this.placementID = getIntent().getExtras().getString(ug.f21009x);
            if (getIntent().hasExtra("auto_play")) {
                Boolean valueOf = Boolean.valueOf(getIntent().getBooleanExtra("auto_play", true));
                this.autoPlay = valueOf;
                if (valueOf.booleanValue()) {
                    a(this, "auto_play_on");
                } else {
                    a(this, "auto_play_off");
                }
            }
            if (getIntent().hasExtra("can_close")) {
                this.canClose = Boolean.valueOf(getIntent().getBooleanExtra("can_close", false));
            }
            if (getIntent().hasExtra("mute")) {
                Boolean valueOf2 = Boolean.valueOf(getIntent().getBooleanExtra("mute", true));
                this.mute = valueOf2;
                if (valueOf2.booleanValue()) {
                    a(this, "mute_on");
                } else {
                    a(this, "mute_off");
                }
            }
            if (getIntent().hasExtra("pview")) {
                this.cv = getIntent().getStringExtra("pview");
                this.banner = getIntent().getStringExtra("banner");
                this.guid = getIntent().getStringExtra("guid");
            }
            if (getIntent().getSerializableExtra("ads") != null) {
                this.ads = (ArrayList) getIntent().getSerializableExtra("ads");
            }
            this.at = new Handler();
            AppnextWebView.t(this).a(this.ao.getPageUrl(), new AppnextWebView.c() { // from class: com.appnext.ads.interstitial.InterstitialActivity.1
                @Override // com.appnext.core.webview.AppnextWebView.c
                public final void error(String str) {
                    try {
                        InterstitialActivity.this.r();
                    } catch (Throwable unused) {
                    }
                }

                @Override // com.appnext.core.webview.AppnextWebView.c
                public final void f(String str) {
                    InterstitialActivity.this.r();
                }
            });
            this.au = new h.a() { // from class: com.appnext.ads.interstitial.InterstitialActivity.5
                @Override // com.appnext.core.h.a
                public final void error(String str) {
                    try {
                        if (((AppnextActivity) InterstitialActivity.this).handler != null) {
                            ((AppnextActivity) InterstitialActivity.this).handler.removeCallbacks(null);
                        }
                        InterstitialActivity.this.S();
                        String unused = ((AppnextActivity) InterstitialActivity.this).placementID;
                        new InterstitialAd(InterstitialActivity.this.f10048j).getAppURL();
                    } catch (Throwable unused2) {
                    }
                }

                @Override // com.appnext.core.h.a
                public final void onMarket(String str) {
                    try {
                        if (((AppnextActivity) InterstitialActivity.this).handler != null) {
                            ((AppnextActivity) InterstitialActivity.this).handler.removeCallbacks(null);
                        }
                        InterstitialActivity.this.S();
                    } catch (Throwable unused) {
                    }
                }
            };
            this.userAction = new C0400r(this, new C0400r.a() { // from class: com.appnext.ads.interstitial.InterstitialActivity.6
                @Override // com.appnext.core.C0400r.a
                public final Ad c() {
                    return InterstitialActivity.this.ao;
                }

                @Override // com.appnext.core.C0400r.a
                public final AppnextAd d() {
                    return InterstitialActivity.this.f10048j;
                }

                @Override // com.appnext.core.C0400r.a
                public final SettingsManager e() {
                    return InterstitialActivity.this.getConfig();
                }

                @Override // com.appnext.core.C0400r.a
                public final void report(String str) {
                }
            });
            p.ac().a(new Runnable() { // from class: com.appnext.ads.interstitial.InterstitialActivity.7
                @Override // java.lang.Runnable
                public final void run() {
                    try {
                        InterstitialActivity interstitialActivity = InterstitialActivity.this;
                        interstitialActivity.az = i.a((Context) interstitialActivity, true);
                    } catch (Throwable unused) {
                    }
                }
            });
        } catch (Throwable th) {
            com.appnext.base.a.a("InterstitialActivity$onCreate", th);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.appnext.core.AppnextActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        try {
            com.appnext.ads.interstitial.a.C().g(this.ao);
            this.ao.destroy();
            this.ao = null;
            Handler handler = this.at;
            if (handler != null) {
                handler.removeCallbacksAndMessages(null);
            }
            this.at = null;
            this.aD = null;
            this.ap = null;
            WebView webView = this.am;
            if (webView != null) {
                webView.stopLoading();
                if (this.am.getParent() != null) {
                    ((ViewGroup) this.am.getParent()).removeView(this.am);
                }
                this.am.setWebChromeClient(null);
                this.am.setWebViewClient(null);
                this.am.destroy();
                this.am = null;
            }
            AppnextWebView.t(this).a(s());
            this.av = null;
            this.au = null;
        } catch (Throwable th) {
            com.appnext.base.a.a("InterstitialActivity$onDestroy", th);
        }
    }

    @Override // com.appnext.core.AppnextActivity
    protected final void onError(final String str) {
        try {
            runOnUiThread(new Runnable() { // from class: com.appnext.ads.interstitial.InterstitialActivity.2
                @Override // java.lang.Runnable
                public final void run() {
                    if (InterstitialActivity.this.ao != null) {
                        try {
                            OnAdError onAdErrorCallback = InterstitialActivity.this.ao.getOnAdErrorCallback();
                            if (onAdErrorCallback != null) {
                                onAdErrorCallback.adError(str);
                            }
                        } catch (Throwable unused) {
                        }
                    }
                }
            });
        } catch (Throwable th) {
            com.appnext.base.a.a("InterstitialActivity$onError", th);
        }
    }

    @Override // android.app.Activity
    protected void onPause() {
        WebView webView;
        super.onPause();
        try {
            if (this.ar || (webView = this.am) == null) {
                return;
            }
            webView.loadUrl("javascript:(function() { Appnext.Layout.Video.pause();})()");
        } catch (Throwable th) {
            com.appnext.base.a.a("InterstitialActivity$onPause", th);
        }
    }

    @Override // android.app.Activity
    protected void onResume() {
        Boolean bool;
        super.onResume();
        try {
            if (this.aA) {
                a();
                finish();
                return;
            }
            if (this.an && (bool = this.autoPlay) != null && bool.booleanValue()) {
                loadJS("Appnext.Layout.Video.play();");
            }
            try {
                this.am.loadUrl("javascript:(function() { try{Appnext.countToClose();}catch(e){}})()");
            } catch (Throwable unused) {
            }
        } catch (Throwable th) {
            com.appnext.base.a.a("InterstitialActivity$onResume", th);
        }
    }

    protected final WebAppInterface s() {
        if (this.av == null) {
            this.av = new WebInterface();
        }
        return this.av;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x00ac A[Catch: all -> 0x0158, TryCatch #1 {all -> 0x0158, blocks: (B:3:0x0001, B:5:0x000f, B:8:0x0019, B:10:0x0038, B:13:0x0042, B:15:0x0082, B:17:0x008e, B:19:0x009a, B:25:0x00ac, B:27:0x00b7, B:31:0x00bf, B:33:0x00d1, B:35:0x00e8, B:37:0x00f2, B:40:0x0104, B:42:0x013d, B:43:0x014c, B:38:0x00f9, B:39:0x0100, B:32:0x00ca), top: B:55:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00ca A[Catch: all -> 0x0158, TryCatch #1 {all -> 0x0158, blocks: (B:3:0x0001, B:5:0x000f, B:8:0x0019, B:10:0x0038, B:13:0x0042, B:15:0x0082, B:17:0x008e, B:19:0x009a, B:25:0x00ac, B:27:0x00b7, B:31:0x00bf, B:33:0x00d1, B:35:0x00e8, B:37:0x00f2, B:40:0x0104, B:42:0x013d, B:43:0x014c, B:38:0x00f9, B:39:0x0100, B:32:0x00ca), top: B:55:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00e8 A[Catch: all -> 0x0158, TryCatch #1 {all -> 0x0158, blocks: (B:3:0x0001, B:5:0x000f, B:8:0x0019, B:10:0x0038, B:13:0x0042, B:15:0x0082, B:17:0x008e, B:19:0x009a, B:25:0x00ac, B:27:0x00b7, B:31:0x00bf, B:33:0x00d1, B:35:0x00e8, B:37:0x00f2, B:40:0x0104, B:42:0x013d, B:43:0x014c, B:38:0x00f9, B:39:0x0100, B:32:0x00ca), top: B:55:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0100 A[Catch: all -> 0x0158, TryCatch #1 {all -> 0x0158, blocks: (B:3:0x0001, B:5:0x000f, B:8:0x0019, B:10:0x0038, B:13:0x0042, B:15:0x0082, B:17:0x008e, B:19:0x009a, B:25:0x00ac, B:27:0x00b7, B:31:0x00bf, B:33:0x00d1, B:35:0x00e8, B:37:0x00f2, B:40:0x0104, B:42:0x013d, B:43:0x014c, B:38:0x00f9, B:39:0x0100, B:32:0x00ca), top: B:55:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x013d A[Catch: all -> 0x0158, TryCatch #1 {all -> 0x0158, blocks: (B:3:0x0001, B:5:0x000f, B:8:0x0019, B:10:0x0038, B:13:0x0042, B:15:0x0082, B:17:0x008e, B:19:0x009a, B:25:0x00ac, B:27:0x00b7, B:31:0x00bf, B:33:0x00d1, B:35:0x00e8, B:37:0x00f2, B:40:0x0104, B:42:0x013d, B:43:0x014c, B:38:0x00f9, B:39:0x0100, B:32:0x00ca), top: B:55:0x0001 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected final synchronized void t() {
        /*
            Method dump skipped, instructions count: 363
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appnext.ads.interstitial.InterstitialActivity.t():void");
    }

    protected final JSONObject u() throws JSONException {
        String str;
        try {
            String d10 = this.ao.getButtonColor().equals("") ? d("button_color") : this.ao.getButtonColor();
            if (d10.startsWith("#")) {
                d10 = d10.substring(1);
            }
            if (this.autoPlay == null) {
                this.autoPlay = Boolean.valueOf(Boolean.parseBoolean(d("auto_play")));
            }
            if (this.mute == null) {
                this.mute = Boolean.valueOf(Boolean.parseBoolean(d("mute")));
            }
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put(ug.f21009x, this.placementID);
                jSONObject.put("cat", this.ao.getCategories());
                jSONObject.put("lockcat", this.ao.getSpecificCategories());
                jSONObject.put("pbk", this.ao.getPostback());
                jSONObject.put("b_color", d10);
                if (this.ads == null) {
                    jSONObject.put("skip_title", this.ao.getSkipText().equals("") ? d("skip_title") : this.ao.getSkipText());
                    jSONObject.put("pview", this.ads != null ? "false" : d("pview"));
                    jSONObject.put("video_length", d("video_length"));
                    jSONObject.put("min_internet_connection", d("min_internet_connection"));
                    jSONObject.put("min_internet_connection_video", d("min_internet_connection_video"));
                    StringBuilder sb = new StringBuilder();
                    sb.append(this.mute);
                    jSONObject.put("mute", sb.toString());
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(this.autoPlay);
                    jSONObject.put("auto_play", sb2.toString());
                    jSONObject.put("remove_poster_on_auto_play", d("remove_poster_on_auto_play"));
                    jSONObject.put("show_rating", d("show_rating"));
                    jSONObject.put("show_desc", d("show_desc"));
                    jSONObject.put("creative", this.aq);
                    jSONObject.put("remote_auto_play", true);
                }
                jSONObject.put("stp_flag", d("stp_flag"));
                jSONObject.put("ext", "t");
                jSONObject.put("dct", i.d(this));
                jSONObject.put("did", this.az);
                jSONObject.put("devn", i.X());
                jSONObject.put("dosv", Build.VERSION.SDK_INT);
                jSONObject.put("dds", "0");
                jSONObject.put("urlApp_protection", d("urlApp_protection"));
                jSONObject.put("vid", this.ao.getVID());
                jSONObject.put(ScarConstants.TOKEN_ID_KEY, this.ao.getTID());
                jSONObject.put("auid", this.ao.getAUID());
                jSONObject.put("osid", "100");
                jSONObject.put("ads_type", "interstitial");
                jSONObject.put(ImpressionData.IMPRESSION_DATA_KEY_COUNTRY, this.ap.getCountry());
                jSONObject.put("gdpr", k.a(this.ap, c.E()));
                jSONObject.put("lang_settings", new JSONObject(com.appnext.core.b.a.q(this).ak()).toString());
                String language = this.ao.getLanguage();
                if (language == null || language.equals("")) {
                    language = Locale.getDefault().getLanguage().toUpperCase();
                }
                jSONObject.put(fe.f17443q, language);
                jSONObject.put("tem", new JSONArray(d("S1")).toString());
                jSONObject.put("click_x", d("clickType_A"));
                if (getIntent() != null && getIntent().hasExtra("show_desc")) {
                    jSONObject.put("show_desc", getIntent().getStringExtra("show_desc"));
                }
                try {
                    Bitmap p10 = i.p(this.ap.getImageURL());
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    p10.compress(Bitmap.CompressFormat.PNG, 100, byteArrayOutputStream);
                    String str2 = "data:image/" + this.ap.getImageURL().substring(this.ap.getImageURL().lastIndexOf(46) + 1) + ";base64," + Base64.encodeToString(byteArrayOutputStream.toByteArray(), 0);
                    try {
                        Palette.Swatch vibrantSwatch = Palette.from(p10).generate().getVibrantSwatch();
                        if (vibrantSwatch != null) {
                            jSONObject.put("icon_color", String.format("#%06X", Integer.valueOf(vibrantSwatch.getRgb() & 16777215)));
                        } else {
                            jSONObject.put("icon_color", "");
                        }
                        jSONObject.put("icon_src", str2);
                    }
                } catch (Throwable th) {
                    str = "InterstitialActivity$getAdParams";
                    try {
                        com.appnext.base.a.a(str, th);
                    } catch (Throwable th2) {
                        th = th2;
                        com.appnext.base.a.a(str, th);
                        return new JSONObject();
                    }
                }
                return jSONObject;
            } catch (Throwable th3) {
                th = th3;
                str = "InterstitialActivity$getAdParams";
            }
        } catch (Throwable th4) {
            th = th4;
            str = "InterstitialActivity$getAdParams";
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(final String str) {
        p.ac().a(new Runnable() { // from class: com.appnext.ads.interstitial.InterstitialActivity.12
            @Override // java.lang.Runnable
            public final void run() {
                try {
                    if (TextUtils.isEmpty(((AppnextActivity) InterstitialActivity.this).placementID) || TextUtils.isEmpty(str)) {
                        return;
                    }
                    com.appnext.core.adswatched.a.m(InterstitialActivity.this).j(str, InterstitialActivity.this.ao.getAUID());
                } catch (Throwable unused) {
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String d(String str) {
        String t10 = c.E().t(str);
        return t10 == null ? "" : t10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(String str) {
        OnAdClicked onAdClickedCallback;
        try {
            com.appnext.ads.interstitial.a.C();
            AppnextAd appnextAd = (AppnextAd) com.appnext.core.d.parseAd(str);
            if (appnextAd == null) {
                return;
            }
            this.f10048j = new InterstitialAd(appnextAd);
            Interstitial interstitial = this.ao;
            if (interstitial != null && (onAdClickedCallback = interstitial.getOnAdClickedCallback()) != null) {
                onAdClickedCallback.adClicked();
            }
            b(this.f10048j, this.au);
            a(this, "click_event");
            String bannerID = this.f10048j.getBannerID();
            InterstitialAd interstitialAd = this.ap;
            if (bannerID.equals(interstitialAd != null ? interstitialAd.getBannerID() : "")) {
                if (this.aw) {
                    return;
                }
                this.aw = true;
                a(this, "interstitial_main_click");
            } else if (this.ax) {
            } else {
                this.ax = true;
                a(this, "interstitial_suggested_click");
            }
        } catch (Throwable th) {
            com.appnext.base.a.a("InterstitialActivity$adClick", th);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.appnext.core.AppnextActivity
    public final void b(AppnextAd appnextAd, h.a aVar) {
        try {
            a(this.cx, getResources().getDrawable(R.drawable.apnxt_loader));
            super.b(appnextAd, aVar);
        } catch (Throwable th) {
            com.appnext.base.a.a("InterstitialActivity$doClick", th);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void a() {
        try {
            Interstitial interstitial = this.ao;
            if (interstitial != null && !this.aB) {
                this.aB = true;
                OnAdClosed onAdClosedCallback = interstitial.getOnAdClosedCallback();
                if (onAdClosedCallback != null) {
                    onAdClosedCallback.onAdClosed();
                }
            }
        } catch (Throwable th) {
            com.appnext.base.a.a("InterstitialActivity$onClose", th);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(Context context, String str) {
        try {
            Interstitial interstitial = this.ao;
            if (interstitial != null) {
                String tid = interstitial.getTID();
                String vid = this.ao.getVID();
                String auid = this.ao.getAUID();
                String placementID = this.ao.getPlacementID();
                String sessionId = this.ao.getSessionId();
                InterstitialAd interstitialAd = this.ap;
                String bannerID = interstitialAd != null ? interstitialAd.getBannerID() : "";
                InterstitialAd interstitialAd2 = this.ap;
                i.a(context, tid, vid, auid, placementID, sessionId, str, "current_interstitial", bannerID, interstitialAd2 != null ? interstitialAd2.getCampaignID() : "");
            }
        } catch (Throwable th) {
            com.appnext.base.a.a("InterstitialActivity$report", th);
        }
    }
}
