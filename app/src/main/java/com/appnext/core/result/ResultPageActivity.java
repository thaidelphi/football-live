package com.appnext.core.result;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.webkit.ConsoleMessage;
import android.webkit.JavascriptInterface;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import com.appnext.core.Ad;
import com.appnext.core.AppnextAd;
import com.appnext.core.C0400r;
import com.appnext.core.SettingsManager;
import com.appnext.core.h;
import com.appnext.core.i;
import com.appnext.core.j;
import com.appnext.core.m;
import com.appnext.core.p;
import com.appnext.core.webview.AppnextWebView;
import java.net.URL;
import org.json.JSONObject;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class ResultPageActivity extends Activity {
    private boolean aA;
    private String ay;
    private String bY;
    private AppnextAd eK;
    private String eL;
    private com.appnext.core.result.a eM;
    private c eN;

    /* renamed from: j  reason: collision with root package name */
    private AppnextAd f10056j;
    private String placementID;
    private C0400r userAction;
    private WebView webView;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public class CustomAd extends AppnextAd {
        CustomAd(AppnextAd appnextAd) {
            super(appnextAd);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.appnext.core.j
        public String getAdJSON() {
            return super.getAdJSON();
        }

        @Override // com.appnext.core.AppnextAd
        public String getAppURL() {
            return super.getAppURL();
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.appnext.core.AppnextAd
        public String getImpressionURL() {
            return super.getImpressionURL();
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.appnext.core.j
        public void setAdJSON(String str) {
            super.setAdJSON(str);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.appnext.core.AppnextAd
        public void setStoreRating(String str) {
            super.setStoreRating(str);
        }
    }

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public class a extends WebViewClient {
        public a() {
        }

        @Override // android.webkit.WebViewClient
        public final void onPageFinished(WebView webView, String str) {
            super.onPageFinished(webView, str);
            try {
                p.ac().a(new Runnable() { // from class: com.appnext.core.result.ResultPageActivity.a.1
                    @Override // java.lang.Runnable
                    public final void run() {
                        final String a10 = i.a((Context) ResultPageActivity.this, false);
                        new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: com.appnext.core.result.ResultPageActivity.a.1.1
                            @Override // java.lang.Runnable
                            public final void run() {
                                try {
                                    ResultPageActivity resultPageActivity = ResultPageActivity.this;
                                    resultPageActivity.loadJS("Appnext.setParams(" + d.aC().aD().getConfigParams().put("did", a10).toString() + ");");
                                } catch (Throwable unused) {
                                }
                                ResultPageActivity resultPageActivity2 = ResultPageActivity.this;
                                StringBuilder sb = new StringBuilder("Appnext.load(");
                                ResultPageActivity resultPageActivity3 = ResultPageActivity.this;
                                sb.append(resultPageActivity3.h(resultPageActivity3.eK).getAdJSON());
                                sb.append(",");
                                sb.append(ResultPageActivity.this.ay);
                                sb.append(",");
                                sb.append(ResultPageActivity.this.bY);
                                sb.append(");");
                                resultPageActivity2.loadJS(sb.toString());
                            }
                        });
                    }
                });
            } catch (Throwable th) {
                com.appnext.base.a.a("WebInterface$onPageFinished", th);
            }
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
    }

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public class b {
        public b() {
        }

        @JavascriptInterface
        public final void adClicked(String str, int i10) {
            try {
                ResultPageActivity resultPageActivity = ResultPageActivity.this;
                resultPageActivity.f10056j = (AppnextAd) resultPageActivity.parseAd(str);
                if (ResultPageActivity.this.userAction != null) {
                    C0400r c0400r = ResultPageActivity.this.userAction;
                    AppnextAd appnextAd = ResultPageActivity.this.f10056j;
                    StringBuilder sb = new StringBuilder();
                    ResultPageActivity resultPageActivity2 = ResultPageActivity.this;
                    sb.append(resultPageActivity2.h(resultPageActivity2.f10056j).getAppURL());
                    sb.append("&tem_id=");
                    sb.append(ResultPageActivity.this.eL);
                    sb.append("1");
                    c0400r.a(appnextAd, sb.toString(), ResultPageActivity.this.placementID, new h.a() { // from class: com.appnext.core.result.ResultPageActivity.b.1
                        @Override // com.appnext.core.h.a
                        public final void error(String str2) {
                        }

                        @Override // com.appnext.core.h.a
                        public final void onMarket(String str2) {
                            if (ResultPageActivity.this.aA) {
                                ResultPageActivity.this.finish();
                            }
                        }
                    });
                }
            } catch (Throwable th) {
                com.appnext.base.a.a("WebInterface$adClicked", th);
            }
        }

        @JavascriptInterface
        public final void impression(String str) {
            try {
                ResultPageActivity.this.userAction.d((AppnextAd) ResultPageActivity.this.parseAd(str));
            } catch (Throwable th) {
                com.appnext.base.a.a("WebInterface$impression", th);
            }
        }

        @JavascriptInterface
        public final void openLink(String str) {
            try {
                Intent intent = new Intent("android.intent.action.VIEW");
                intent.setData(Uri.parse(str));
                intent.addFlags(268435456);
                ResultPageActivity.this.startActivity(intent);
            } catch (Throwable th) {
                com.appnext.base.a.a("WebInterface$openLink", th);
            }
        }

        @JavascriptInterface
        public final void postView(String str) {
            try {
                AppnextAd appnextAd = (AppnextAd) ResultPageActivity.this.parseAd(str);
                C0400r c0400r = ResultPageActivity.this.userAction;
                c0400r.a(appnextAd, ResultPageActivity.this.h(appnextAd).getImpressionURL() + "&tem_id=" + ResultPageActivity.this.eL + "1", null);
            } catch (Throwable th) {
                com.appnext.base.a.a("WebInterface$postView", th);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String getFallbackScript() {
        com.appnext.core.result.a aVar = this.eM;
        if (aVar != null && aVar.getFallbackScript() != null) {
            return this.eM.getFallbackScript();
        }
        return new com.appnext.core.result.b().D();
    }

    private WebViewClient getWebViewClient() {
        try {
            com.appnext.core.result.a aVar = this.eM;
            if (aVar != null && aVar.getWebViewClient() != null) {
                return this.eM.getWebViewClient();
            }
            return new a();
        } catch (Throwable unused) {
            return new a();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public CustomAd h(AppnextAd appnextAd) {
        return new CustomAd(appnextAd);
    }

    protected final void loadJS(String str) {
        try {
            WebView webView = this.webView;
            if (webView != null) {
                webView.loadUrl("javascript:(function() { try { " + str + " } catch(err){ Appnext.jsError(err.message); }})()");
            }
        } catch (Throwable th) {
            com.appnext.base.a.a("ResultPageActivity$loadJS", th);
        }
    }

    protected final void o(String str, String str2) {
        try {
            URL url = new URL(str);
            this.webView.loadDataWithBaseURL(url.getProtocol() + "://" + url.getHost(), "<html><body><script>" + str2 + "</script></body></html>", null, "UTF-8", null);
        } catch (Throwable th) {
            com.appnext.base.a.a("ResultPageActivity$loadWebview", th);
        }
    }

    @Override // android.app.Activity
    @SuppressLint({"AddJavascriptInterface", "SetJavaScriptEnabled"})
    protected void onCreate(Bundle bundle) {
        final String str;
        Object bVar;
        requestWindowFeature(1);
        super.onCreate(bundle);
        try {
            c aD = d.aC().aD();
            this.eN = aD;
            this.placementID = aD.getPlacementId();
            this.eL = this.eN.v();
            this.aA = getIntent().getExtras().getBoolean("shouldClose");
            this.eK = this.eN.getSelectedAd();
            this.bY = this.eN.w();
            this.ay = this.eN.x();
            this.userAction = new C0400r(this, new C0400r.a() { // from class: com.appnext.core.result.ResultPageActivity.1
                @Override // com.appnext.core.C0400r.a
                public final Ad c() {
                    return ResultPageActivity.this.eN.z();
                }

                @Override // com.appnext.core.C0400r.a
                public final AppnextAd d() {
                    return ResultPageActivity.this.f10056j;
                }

                @Override // com.appnext.core.C0400r.a
                public final SettingsManager e() {
                    return ResultPageActivity.this.eN.y();
                }

                @Override // com.appnext.core.C0400r.a
                public final void report(String str2) {
                }
            });
            this.eM = this.eN.A();
            try {
                RelativeLayout relativeLayout = new RelativeLayout(this);
                setContentView(relativeLayout);
                relativeLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
                WebView webView = new WebView(getApplicationContext());
                this.webView = webView;
                relativeLayout.addView(webView);
                this.webView.getLayoutParams().height = -1;
                this.webView.getLayoutParams().width = -1;
                this.webView.getSettings().setJavaScriptEnabled(true);
                this.webView.getSettings().setAppCacheEnabled(true);
                this.webView.getSettings().setDomStorageEnabled(true);
                this.webView.getSettings().setDatabaseEnabled(true);
                int i10 = Build.VERSION.SDK_INT;
                if (i10 >= 21) {
                    this.webView.getSettings().setMixedContentMode(0);
                }
                if (i10 >= 17) {
                    this.webView.getSettings().setMediaPlaybackRequiresUserGesture(false);
                }
                this.webView.setWebChromeClient(new WebChromeClient() { // from class: com.appnext.core.result.ResultPageActivity.2
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
                com.appnext.core.result.a aVar = this.eM;
                if (aVar != null) {
                    aVar.getJSurl();
                    str = this.eM.getJSurl();
                } else {
                    str = "https://cdn.appnext.com/tools/sdk/banner/2.4.3/result.min.js";
                }
                AppnextWebView.t(this).a(str, new AppnextWebView.c() { // from class: com.appnext.core.result.ResultPageActivity.3
                    @Override // com.appnext.core.webview.AppnextWebView.c
                    public final void error(String str2) {
                        new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: com.appnext.core.result.ResultPageActivity.3.2
                            @Override // java.lang.Runnable
                            public final void run() {
                                AnonymousClass3 anonymousClass3 = AnonymousClass3.this;
                                ResultPageActivity resultPageActivity = ResultPageActivity.this;
                                resultPageActivity.o(str, resultPageActivity.getFallbackScript());
                            }
                        });
                    }

                    @Override // com.appnext.core.webview.AppnextWebView.c
                    public final void f(String str2) {
                        new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: com.appnext.core.result.ResultPageActivity.3.1
                            @Override // java.lang.Runnable
                            public final void run() {
                                try {
                                    AnonymousClass3 anonymousClass3 = AnonymousClass3.this;
                                    ResultPageActivity resultPageActivity = ResultPageActivity.this;
                                    resultPageActivity.o(str, AppnextWebView.t(resultPageActivity).D(str));
                                } catch (Throwable th) {
                                    com.appnext.base.a.a("ResultPageActivity$loaded", th);
                                }
                            }
                        });
                    }
                });
                WebView webView2 = this.webView;
                com.appnext.core.result.a aVar2 = this.eM;
                if (aVar2 != null && aVar2.B() != null) {
                    bVar = this.eM.B();
                } else {
                    bVar = new b();
                }
                webView2.addJavascriptInterface(bVar, "Appnext");
            } catch (Throwable unused) {
            }
        } catch (Throwable th) {
            com.appnext.base.a.a("ResultPageActivity$onCreate", th);
            finish();
        }
    }

    @Override // android.app.Activity
    protected void onDestroy() {
        super.onDestroy();
        try {
            WebView webView = this.webView;
            if (webView != null) {
                webView.destroy();
                this.webView = null;
            }
        } catch (Throwable th) {
            com.appnext.base.a.a("ResultPageActivity$onDestroy", th);
        }
        try {
            this.userAction.destroy();
        } catch (Throwable th2) {
            com.appnext.base.a.a("ResultPageActivity$onDestroy", th2);
        }
    }

    public j parseAd(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            AppnextAd appnextAd = (AppnextAd) m.a(AppnextAd.class, jSONObject);
            if (appnextAd != null) {
                h(appnextAd).setAdJSON(jSONObject.toString());
                if (TextUtils.isEmpty(appnextAd.getStoreRating())) {
                    h(appnextAd).setStoreRating("0");
                }
            }
            return appnextAd;
        } catch (Throwable th) {
            com.appnext.base.a.a("ResultPageActivity$parseAd", th);
            return null;
        }
    }
}
