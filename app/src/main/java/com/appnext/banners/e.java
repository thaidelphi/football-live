package com.appnext.banners;

import android.content.Intent;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.ConsoleMessage;
import android.webkit.JavascriptInterface;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.appnext.core.AppnextAd;
import com.appnext.core.i;
import com.appnext.core.k;
import com.appnext.core.p;
import com.appnext.core.webview.AppnextWebView;
import com.ironsource.fe;
import com.ironsource.mediationsdk.impressionData.ImpressionData;
import com.ironsource.ug;
import com.unity3d.services.ads.gmascar.utils.ScarConstants;
import java.net.URL;
import java.util.ArrayList;
import java.util.Locale;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class e extends com.appnext.banners.a {
    protected WebView webView;
    private String adsid = "";
    private boolean clicked = false;
    private BannerAdData selectedAd = null;
    private ArrayList<String> shown = new ArrayList<>();
    private Handler handler = new Handler(Looper.getMainLooper());
    private Handler refreshHandler = new Handler(Looper.getMainLooper());

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public class a {
        public a() {
        }

        @JavascriptInterface
        public void destroy(String str) {
        }

        @JavascriptInterface
        public void jsError(String str) {
        }

        @JavascriptInterface
        public void logSTP(String str, String str2) {
            i.a(e.this.getBannerAd(), e.this.getSelectedAd(), str, str2, d.K());
        }

        @JavascriptInterface
        public void openLink(String str) {
            if (e.this.isDestroyed()) {
                return;
            }
            e.this.openLink(str);
        }

        @JavascriptInterface
        public void openStore(String str) {
            if (e.this.handler != null) {
                e.this.handler.removeCallbacksAndMessages(null);
                if (e.this.isDestroyed()) {
                    return;
                }
                e.this.handler.post(new Runnable() { // from class: com.appnext.banners.e.a.1
                    /* JADX WARN: Code restructure failed: missing block: B:44:0x0111, code lost:
                        r8.bN.bK.click();
                     */
                    /* JADX WARN: Code restructure failed: missing block: B:45:0x0118, code lost:
                        return;
                     */
                    @Override // java.lang.Runnable
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct add '--show-bad-code' argument
                    */
                    public final void run() {
                        /*
                            Method dump skipped, instructions count: 308
                            To view this dump add '--comments-level debug' option
                        */
                        throw new UnsupportedOperationException("Method not decompiled: com.appnext.banners.e.a.AnonymousClass1.run():void");
                    }
                });
            }
        }
    }

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public class b extends WebViewClient {
        public b() {
        }

        @Override // android.webkit.WebViewClient
        public final void onPageFinished(WebView webView, String str) {
            super.onPageFinished(webView, str);
            try {
                e.this.pageFinished();
            } catch (Throwable th) {
                com.appnext.base.a.a("JSBannerAdapter$JSWebViewClient", th);
            }
        }

        @Override // android.webkit.WebViewClient
        public final boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
            if (Build.VERSION.SDK_INT < 26 || renderProcessGoneDetail.didCrash()) {
                return false;
            }
            if (webView != null) {
                webView.destroy();
                return true;
            }
            return true;
        }

        @Override // android.webkit.WebViewClient
        public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
            if (str == null) {
                return false;
            }
            try {
                if (str.startsWith("http")) {
                    webView.loadUrl(str);
                    return true;
                }
            } catch (Throwable th) {
                com.appnext.base.a.a("JSBannerAdapter$JSWebViewClient", th);
            }
            return super.shouldOverrideUrlLoading(webView, str);
        }
    }

    private void activateAutoRefresh() {
        int i10;
        d K = d.K();
        try {
            i10 = Integer.parseInt(K.t(getBannerSize().toString().toLowerCase() + "_ar"));
        } catch (Throwable unused) {
            i10 = 10;
        }
        if (!Boolean.parseBoolean(K.t("_arFlag")) || i10 <= 0) {
            return;
        }
        this.refreshHandler.postDelayed(new Runnable() { // from class: com.appnext.banners.e.4
            @Override // java.lang.Runnable
            public final void run() {
                try {
                    com.appnext.banners.b J = com.appnext.banners.b.J();
                    e eVar = e.this;
                    AppnextAd a10 = J.a(eVar.context, eVar.getBannerAd(), e.this.getAds(), e.this.getAdRequest().getCreativeType(), e.this.shown);
                    if (a10 != null) {
                        e.this.setSelectedAd(new BannerAdData(a10));
                        if (Boolean.parseBoolean(d.K().t("impOne"))) {
                            e.this.setReportedImpression(false);
                            e.this.impression();
                        } else if (Boolean.parseBoolean(d.K().t("pview"))) {
                            e.this.refreshHandler.postDelayed(new Runnable() { // from class: com.appnext.banners.e.4.1
                                @Override // java.lang.Runnable
                                public final void run() {
                                    e.this.getUserAction().a(e.this.getSelectedAd(), e.this.getSelectedAd().getImpressionURL(), null);
                                }
                            }, Integer.parseInt(d.K().t("postpone_vta_sec")) * 1000);
                        }
                        e.this.pageFinished();
                    }
                } catch (Throwable th) {
                    com.appnext.base.a.a("JSBannerAdapter$activateAutoRefresh", th);
                }
            }
        }, i10 * 1000);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean isDestroyed() {
        return getBannerAd() == null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void openResultPage(boolean z10) {
        Intent intent = new Intent(this.context, BannerActivity.class);
        intent.putExtra("placement", getBannerAd().getPlacementID());
        intent.putExtra("postback", getBannerAd().getPostback());
        intent.putExtra("category", getBannerAd().getCategories());
        intent.putExtra("clicked", getSelectedAd().getBannerID());
        intent.putExtra("selected", getSelectedAd());
        intent.putExtra("size", getBannerSize().toString());
        intent.putExtra("shouldClose", z10);
        intent.setFlags(65536);
        this.context.startActivity(intent);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void pageFinished() {
        if (isDestroyed()) {
            return;
        }
        p.ac().a(new Runnable() { // from class: com.appnext.banners.e.3
            @Override // java.lang.Runnable
            public final void run() {
                try {
                    e eVar = e.this;
                    eVar.adsid = i.a(eVar.context, false);
                    e.this.handler.removeCallbacksAndMessages(null);
                    e.this.handler.post(new Runnable() { // from class: com.appnext.banners.e.3.1
                        @Override // java.lang.Runnable
                        public final void run() {
                            try {
                                e.this.loadJS("javascript:(function() { try { Appnext.Layout.destroy('internal'); } catch(err){ Appnext.jsError(err.message); }})()");
                                e eVar2 = e.this;
                                eVar2.loadJS("javascript:(function() { try { Appnext.setParams(" + e.this.getConfigParams().toString() + "); } catch(err){ Appnext.jsError(err.message); }})()");
                                e eVar3 = e.this;
                                eVar3.loadJS("javascript:(function() { try { Appnext.loadBanner(" + new JSONObject(e.this.getSelectedAd().getAdJSON()).toString() + ",'" + e.this.getBannerSize().toString() + "'); } catch(err){ Appnext.jsError(err.message); }})()");
                                e.this.shown.add(e.this.getSelectedAd().getBannerID());
                            } catch (Throwable unused) {
                            }
                        }
                    });
                } catch (Throwable th) {
                    com.appnext.base.a.a("JSBannerAdapter$pageFinished", th);
                }
            }
        });
    }

    @Override // com.appnext.banners.a, com.appnext.banners.BaseBannerAdapter
    public void destroy() {
        super.destroy();
        try {
            new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: com.appnext.banners.e.2
                @Override // java.lang.Runnable
                public final void run() {
                    try {
                        WebView webView = e.this.webView;
                        if (webView != null) {
                            ViewGroup viewGroup = (ViewGroup) webView.getParent();
                            if (viewGroup != null) {
                                viewGroup.removeView(e.this.webView);
                            }
                            e.this.webView.destroyDrawingCache();
                            e.this.webView.destroy();
                        }
                    } catch (Throwable th) {
                        com.appnext.base.a.a("JSBannerAdapter$destroy", th);
                    }
                }
            });
            Handler handler = this.handler;
            if (handler != null) {
                handler.removeCallbacksAndMessages(null);
            }
            Handler handler2 = this.refreshHandler;
            if (handler2 != null) {
                handler2.removeCallbacksAndMessages(null);
            }
        } catch (Throwable th) {
            com.appnext.base.a.a("JSBannerAdapter$destroy", th);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public JSONObject getConfigParams() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("vid", "2.7.6.473");
        jSONObject.put(ScarConstants.TOKEN_ID_KEY, getBannerAd() == null ? "" : getBannerAd().getTID());
        jSONObject.put("auid", getBannerAd() == null ? "" : getBannerAd().getAUID());
        jSONObject.put("osid", "100");
        jSONObject.put("tem_id", getBannerAd().getTemId(getSelectedAd()));
        jSONObject.put(ug.f21009x, getPlacementId());
        jSONObject.put("b_title", getButtonText(getSelectedAd()));
        jSONObject.put("creative", getCreativeType(getSelectedAd()) == 0 ? "video" : "static");
        jSONObject.put("cat", getSelectedAd().getCategories());
        jSONObject.put("lockcat", getSelectedAd().getSpecificCategories());
        jSONObject.put("pview", d.K().t("pview"));
        jSONObject.put("video_length", getAdRequest().getVideoLength());
        StringBuilder sb = new StringBuilder();
        sb.append(getAdRequest().isMute());
        jSONObject.put("mute", sb.toString());
        StringBuilder sb2 = new StringBuilder();
        sb2.append(getAdRequest().isAutoPlay());
        jSONObject.put("auto_play", sb2.toString());
        jSONObject.put("remove_poster_on_auto_play", d.K().t("remove_poster_on_auto_play"));
        jSONObject.put("remote_auto_play", true);
        jSONObject.put("did", this.adsid);
        jSONObject.put("devn", i.X());
        jSONObject.put("dosv", Build.VERSION.SDK_INT);
        jSONObject.put("dds", "0");
        jSONObject.put("ads_type", "banner");
        jSONObject.put(ImpressionData.IMPRESSION_DATA_KEY_COUNTRY, getSelectedAd().getCountry());
        jSONObject.put("gdpr", k.a(getSelectedAd(), d.K()));
        jSONObject.put("lang_settings", new JSONObject(com.appnext.core.b.a.q(this.context).ak()).toString());
        String language = getLanguage();
        if (language == null || language.equals("")) {
            language = Locale.getDefault().getLanguage().toUpperCase();
        }
        jSONObject.put(fe.f17443q, language);
        return jSONObject;
    }

    protected String getFallbackScript() {
        return new c().D();
    }

    protected String getJSurl() {
        return "https://cdn.appnext.com/tools/sdk/banner/2.4.3/banner.min.js";
    }

    protected int getLayout() {
        try {
        } catch (Throwable th) {
            com.appnext.base.a.a("JSBannerAdapter$getLayout", th);
        }
        if (getBannerSize().toString().equals(BannerSize.BANNER.toString())) {
            return R.layout.apnxt_banner;
        }
        if (getBannerSize().toString().equals(BannerSize.LARGE_BANNER.toString())) {
            return R.layout.apnxt_large_banner;
        }
        if (getBannerSize().toString().equals(BannerSize.MEDIUM_RECTANGLE.toString())) {
            return R.layout.apnxt_medium_rectangle;
        }
        return R.layout.apnxt_banner;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.appnext.banners.a
    public BannerAdData getSelectedAd() {
        try {
            if (this.selectedAd == null || (super.getSelectedAd() != null && !super.getSelectedAd().getBannerID().equals(this.selectedAd.getBannerID()))) {
                BannerAdData bannerAdData = new BannerAdData(super.getSelectedAd());
                this.selectedAd = bannerAdData;
                bannerAdData.setImpressionURL(this.selectedAd.getImpressionURL() + "&tem_id=" + getBannerAd().getTemId(this.selectedAd));
                BannerAdData bannerAdData2 = this.selectedAd;
                bannerAdData2.setAppURL(this.selectedAd.getAppURL() + "&tem_id=" + getBannerAd().getTemId(this.selectedAd));
            }
        } catch (Throwable th) {
            com.appnext.base.a.a("JSBannerAdapter$getSelectedAd", th);
        }
        return this.selectedAd;
    }

    protected String getTargetJSurl() {
        return "https://cdn.appnext.com/tools/sdk/banner/2.4.3/result.min.js";
    }

    protected a getWebInterface() {
        return new a();
    }

    protected WebViewClient getWebViewClient() {
        return new b();
    }

    @Override // com.appnext.banners.a, com.appnext.banners.BaseBannerAdapter
    public void impression() {
        try {
            boolean isReportedImpression = isReportedImpression();
            super.impression();
            if (isReportedImpression != isReportedImpression()) {
                activateAutoRefresh();
            }
        } catch (Throwable th) {
            com.appnext.base.a.a("JSBannerAdapter$impression", th);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.appnext.banners.a
    public void inflateView(int i10, AppnextAd appnextAd) {
        try {
            if (this.webView != null) {
                this.rootView.removeAllViews();
                this.webView.destroyDrawingCache();
                this.webView.destroy();
            }
            View inflate = ((LayoutInflater) this.context.getSystemService("layout_inflater")).inflate(getLayout(), this.rootView, false);
            WebView webView = new WebView(this.context.getApplicationContext());
            this.webView = webView;
            ((ViewGroup) inflate).addView(webView);
            this.webView.getLayoutParams().height = -1;
            this.webView.getLayoutParams().width = -1;
            this.webView.getSettings().setJavaScriptEnabled(true);
            this.webView.getSettings().setAppCacheEnabled(true);
            int i11 = Build.VERSION.SDK_INT;
            if (i11 >= 21) {
                this.webView.getSettings().setMixedContentMode(0);
            }
            if (i11 >= 17) {
                this.webView.getSettings().setMediaPlaybackRequiresUserGesture(false);
            }
            this.webView.setWebChromeClient(new WebChromeClient() { // from class: com.appnext.banners.e.1
                @Override // android.webkit.WebChromeClient
                public final boolean onConsoleMessage(ConsoleMessage consoleMessage) {
                    consoleMessage.messageLevel().name();
                    consoleMessage.lineNumber();
                    consoleMessage.message();
                    consoleMessage.sourceId();
                    consoleMessage.lineNumber();
                    return true;
                }
            });
            this.webView.setWebViewClient(getWebViewClient());
            loadWebview(getJSurl());
            AppnextWebView.t(this.context).a(getTargetJSurl(), (AppnextWebView.c) null);
            this.webView.addJavascriptInterface(getWebInterface(), "Appnext");
            this.rootView.addView(inflate);
        } catch (Throwable th) {
            com.appnext.base.a.a("JSBannerAdapter$inflateView", th);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void loadJS(String str) {
        try {
            WebView webView = this.webView;
            if (webView != null) {
                webView.loadUrl(str);
            }
        } catch (Throwable th) {
            com.appnext.base.a.a("JSBannerAdapter$loadJS", th);
        }
    }

    protected void loadWebview(String str) {
        try {
            URL url = new URL(str);
            this.webView.setBackgroundColor(0);
            this.webView.loadDataWithBaseURL(url.getProtocol() + "://" + url.getHost(), "<html ValidateRequest=\"false\" ><body><script src='https://cdn.appnext.com/tools/sdk/banner/2.4.0/banner.min.js'></script></body></html>", null, "UTF-8", null);
        } catch (Throwable th) {
            com.appnext.base.a.a("JSBannerAdapter$loadWebview", th);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.appnext.banners.BaseBannerAdapter
    public void onWindowVisibilityChanged(int i10) {
        if (i10 == 0) {
            try {
                if (this.clicked) {
                    this.clicked = false;
                    openResultPage(false);
                }
            } catch (Throwable th) {
                com.appnext.base.a.a("JSBannerAdapter$onWindowVisibilityChanged", th);
            }
        }
    }
}
