package com.applovin.impl;

import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.sdk.AppLovinPostbackListener;
import com.applovin.sdk.AppLovinSdkUtils;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class b8 extends k4 {

    /* renamed from: a  reason: collision with root package name */
    private final com.applovin.impl.sdk.j f6711a;

    /* renamed from: b  reason: collision with root package name */
    private final com.applovin.impl.sdk.n f6712b;

    /* renamed from: c  reason: collision with root package name */
    private WebView f6713c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f6714d;

    /* renamed from: e  reason: collision with root package name */
    private final Set f6715e = Collections.synchronizedSet(new HashSet());

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public class a extends WebViewClient {
        a() {
        }

        @Override // android.webkit.WebViewClient
        public void onPageFinished(WebView webView, String str) {
            com.applovin.impl.sdk.n unused = b8.this.f6712b;
            if (com.applovin.impl.sdk.n.a()) {
                b8.this.f6712b.a("WebTrackerManager", "Successfully initialized web view for postbacks");
            }
            b8.this.f6714d = true;
        }
    }

    public b8(com.applovin.impl.sdk.j jVar) {
        this.f6711a = jVar;
        this.f6712b = jVar.I();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b() {
        WebView a10 = a("<script>window.al_firePostback = function(url) {\n    setTimeout(function() {\n        var img = new Image();\n        img.src = url;\n    }, 100);\n}\n</script>", true);
        this.f6713c = a10;
        if (a10 == null && com.applovin.impl.sdk.n.a()) {
            this.f6712b.b("WebTrackerManager", "Failed to preload postback web view");
        }
    }

    private boolean d() {
        return ((Boolean) this.f6711a.a(o4.R2)).booleanValue();
    }

    public void c() {
        AppLovinSdkUtils.runOnUiThread(new Runnable() { // from class: com.applovin.impl.j9
            @Override // java.lang.Runnable
            public final void run() {
                b8.this.b();
            }
        });
    }

    @Override // com.applovin.impl.k4, android.webkit.WebViewClient
    public boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        if (webView == this.f6713c) {
            AppLovinSdkUtils.runOnUiThread(new Runnable() { // from class: com.applovin.impl.i9
                @Override // java.lang.Runnable
                public final void run() {
                    b8.this.a();
                }
            });
        } else {
            b(webView);
        }
        return super.onRenderProcessGone(webView, renderProcessGoneDetail);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void c(String str) {
        final WebView a10 = a(str);
        if (a10 == null) {
            if (com.applovin.impl.sdk.n.a()) {
                this.f6712b.b("WebTrackerManager", "Failed to fire tracker since web view could not be created");
                return;
            }
            return;
        }
        this.f6715e.add(a10);
        AppLovinSdkUtils.runOnUiThreadDelayed(new Runnable() { // from class: com.applovin.impl.k9
            @Override // java.lang.Runnable
            public final void run() {
                b8.this.b(a10);
            }
        }, ((Integer) this.f6711a.a(o4.M2)).intValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b(com.applovin.impl.sdk.network.e eVar, AppLovinPostbackListener appLovinPostbackListener) {
        String appendQueryParameters = StringUtils.appendQueryParameters(eVar.f(), eVar.i(), ((Boolean) this.f6711a.a(o4.f8142j3)).booleanValue());
        if (this.f6713c == null) {
            WebView a10 = a("<script>window.al_firePostback = function(url) {\n    setTimeout(function() {\n        var img = new Image();\n        img.src = url;\n    }, 100);\n}\n</script>", true);
            this.f6713c = a10;
            if (a10 == null) {
                if (com.applovin.impl.sdk.n.a()) {
                    this.f6712b.b("WebTrackerManager", "Failed to fire postback since web view could not be created");
                }
                appLovinPostbackListener.onPostbackFailure(appendQueryParameters, -1);
                return;
            }
        }
        if (d() && !this.f6714d) {
            if (com.applovin.impl.sdk.n.a()) {
                this.f6712b.b("WebTrackerManager", "Failed to fire postback since web view was not initialized in time");
            }
            HashMap<String, String> hashMap = CollectionUtils.hashMap("top_main_method", "firePostback");
            hashMap.put("url", appendQueryParameters);
            this.f6711a.D().d(y1.f9695u0, hashMap);
            appLovinPostbackListener.onPostbackFailure(appendQueryParameters, -1);
            return;
        }
        e8.a(this.f6713c, "al_firePostback('" + appendQueryParameters + "')");
        appLovinPostbackListener.onPostbackSuccess(appendQueryParameters);
    }

    public void a(final com.applovin.impl.sdk.network.e eVar, final AppLovinPostbackListener appLovinPostbackListener) {
        AppLovinSdkUtils.runOnUiThread(new Runnable() { // from class: com.applovin.impl.l9
            @Override // java.lang.Runnable
            public final void run() {
                b8.this.b(eVar, appLovinPostbackListener);
            }
        });
    }

    private WebView a(String str) {
        return a(str, false);
    }

    private WebView a(String str, boolean z10) {
        d7.b();
        WebView b10 = d7.b(com.applovin.impl.sdk.j.m(), "web tracker");
        if (b10 == null) {
            return null;
        }
        b10.getSettings().setJavaScriptEnabled(true);
        b10.setWebViewClient(this);
        if (z10 && d()) {
            b10.setWebViewClient(new a());
        }
        b10.loadData("<html><head><link rel=\"icon\" href=\"data:,\">" + str + "</head><body></body></html>", "text/html", "UTF-8");
        return b10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public void b(final WebView webView) {
        if (webView == null || !this.f6715e.remove(webView)) {
            return;
        }
        AppLovinSdkUtils.runOnUiThread(new Runnable() { // from class: com.applovin.impl.h9
            @Override // java.lang.Runnable
            public final void run() {
                webView.destroy();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a() {
        this.f6713c.destroy();
        this.f6713c = null;
    }

    public void b(final String str) {
        if (!AppLovinSdkUtils.isValidString(str)) {
            if (com.applovin.impl.sdk.n.a()) {
                this.f6712b.b("WebTrackerManager", "Failed to fire tracker due to empty script string");
            }
        } else if (!str.startsWith("<script")) {
            if (com.applovin.impl.sdk.n.a()) {
                this.f6712b.b("WebTrackerManager", "Failed to fire tracker due to improperly formatted script tag");
            }
        } else {
            AppLovinSdkUtils.runOnUiThread(new Runnable() { // from class: com.applovin.impl.m9
                @Override // java.lang.Runnable
                public final void run() {
                    b8.this.c(str);
                }
            });
        }
    }
}
