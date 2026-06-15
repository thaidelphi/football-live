package com.applovin.impl.adview;

import android.content.Intent;
import android.net.Uri;
import android.net.http.SslError;
import android.os.Bundle;
import android.view.MotionEvent;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.SslErrorHandler;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import com.applovin.adview.AppLovinAdView;
import com.applovin.impl.a2;
import com.applovin.impl.b7;
import com.applovin.impl.d7;
import com.applovin.impl.e7;
import com.applovin.impl.h7;
import com.applovin.impl.k4;
import com.applovin.impl.l0;
import com.applovin.impl.o4;
import com.applovin.impl.q7;
import com.applovin.impl.sdk.AppLovinBroadcastManager;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.y1;
import com.applovin.sdk.AppLovinAdSize;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class c extends k4 {

    /* renamed from: a  reason: collision with root package name */
    private final com.applovin.impl.sdk.j f6604a;

    /* renamed from: b  reason: collision with root package name */
    private final com.applovin.impl.sdk.n f6605b;

    /* renamed from: c  reason: collision with root package name */
    private final a f6606c;

    public c(a aVar, com.applovin.impl.sdk.j jVar) {
        this.f6604a = jVar;
        this.f6605b = jVar.I();
        this.f6606c = aVar;
    }

    private void b() {
        this.f6606c.a();
    }

    protected boolean a(WebView webView, String str) {
        boolean z10;
        boolean z11;
        if (this.f6606c == null) {
            return true;
        }
        if (com.applovin.impl.sdk.n.a()) {
            this.f6605b.d("AdWebView", "Processing click on ad URL \"" + str + "\"");
        }
        if (str != null && (webView instanceof b)) {
            Uri parse = Uri.parse(str);
            b bVar = (b) webView;
            String scheme = parse.getScheme();
            String host = parse.getHost();
            String path = parse.getPath();
            com.applovin.impl.sdk.ad.b g10 = this.f6606c.g();
            if (g10 == null) {
                if (com.applovin.impl.sdk.n.a()) {
                    this.f6605b.b("AdWebView", "Unable to process click, ad not found!");
                }
                return true;
            }
            Iterator it = g10.b0().iterator();
            while (true) {
                z10 = false;
                if (!it.hasNext()) {
                    z11 = true;
                    break;
                }
                String str2 = (String) it.next();
                if (StringUtils.isValidString(path) && path.contains(str2)) {
                    z11 = false;
                    break;
                }
            }
            boolean a10 = bVar.a();
            if (!g10.W0() || a10) {
                z10 = z11;
            }
            if ("applovin".equals(scheme) && "com.applovin.sdk".equals(host)) {
                if ("/adservice/close_ad".equals(path)) {
                    String str3 = this.f6604a.f0().getExtraParameters().get("enable_close_URL_ad_value");
                    if (StringUtils.isValidString(str3) && Boolean.parseBoolean(str3)) {
                        g10.setMaxAdValue("close_url", str);
                    }
                    a();
                } else if ("/adservice/expand_ad".equals(path)) {
                    if (g10.X0() && !a10) {
                        if (com.applovin.impl.sdk.n.a()) {
                            this.f6605b.b("AdWebView", "Skipping expand command without user interaction");
                        }
                        return true;
                    }
                    a(bVar.getLastClickEvent());
                } else if ("/adservice/contract_ad".equals(path)) {
                    b();
                } else if ("/adservice/no_op".equals(path)) {
                    return true;
                } else {
                    if ("/adservice/load_url".equals(path)) {
                        if (a(a10, g10, parse)) {
                            if (com.applovin.impl.sdk.n.a()) {
                                this.f6605b.b("AdWebView", "Skipping URL load command without user interaction");
                            }
                            return true;
                        }
                        b7.a(parse, this.f6606c, this.f6604a);
                    } else if ("/adservice/track_click_now".equals(path)) {
                        if (a(a10, g10, parse)) {
                            if (com.applovin.impl.sdk.n.a()) {
                                this.f6605b.b("AdWebView", "Skipping click tracking command without user interaction");
                            }
                            return true;
                        } else if (g10 instanceof e7) {
                            a((e7) g10, bVar);
                        } else {
                            a(bVar, Uri.parse("/adservice/track_click_now"));
                        }
                    } else if ("/adservice/deeplink".equals(path)) {
                        if (a(a10, g10, parse)) {
                            if (com.applovin.impl.sdk.n.a()) {
                                this.f6605b.b("AdWebView", "Skipping deep link plus command without user interaction");
                            }
                            return true;
                        }
                        if (g10 instanceof e7) {
                            e7 e7Var = (e7) g10;
                            if (e7Var.u1()) {
                                a(e7Var, bVar);
                            }
                        }
                        a(bVar, parse);
                    } else if ("/adservice/postback".equals(path)) {
                        b7.a(parse, g10, this.f6604a);
                    } else if ("/ga_init".equals(path)) {
                        this.f6606c.b(parse);
                    } else if ("/ga_event".equals(path)) {
                        this.f6606c.a(parse);
                    } else if ("/playable_event".equals(path)) {
                        a(parse);
                    } else if ("/adservice/direct_download".equals(path)) {
                        Bundle a11 = b7.a(parse);
                        if (g10 instanceof e7) {
                            e7 e7Var2 = (e7) g10;
                            if (e7Var2.u1()) {
                                a(e7Var2, bVar, a11);
                            }
                        }
                        a(bVar, g10.j(), a11);
                    } else if ("/template_error".equals(path)) {
                        b7.b(parse, g10, this.f6604a);
                    } else if ("/adservice/fully_watched".equals(path)) {
                        this.f6606c.x();
                    } else {
                        if (com.applovin.impl.sdk.n.a()) {
                            this.f6605b.k("AdWebView", "Unknown URL: " + str);
                        }
                        if (com.applovin.impl.sdk.n.a()) {
                            this.f6605b.k("AdWebView", "Path: " + path);
                        }
                    }
                }
            } else if (z10) {
                List u02 = g10.u0();
                List t02 = g10.t0();
                if ((!u02.isEmpty() && !u02.contains(scheme)) || (!t02.isEmpty() && !t02.contains(host))) {
                    if (com.applovin.impl.sdk.n.a()) {
                        this.f6605b.b("AdWebView", "URL is not whitelisted - bypassing click");
                    }
                } else {
                    if (g10 instanceof e7) {
                        e7 e7Var3 = (e7) g10;
                        if (e7Var3.u1()) {
                            a(e7Var3, bVar);
                            if (!a10 && g10.b1()) {
                                this.f6604a.D().d(y1.f9663e0, a(g10, parse));
                            }
                        }
                    }
                    a(bVar, parse);
                    if (!a10) {
                        this.f6604a.D().d(y1.f9663e0, a(g10, parse));
                    }
                }
            }
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public a c() {
        return this.f6606c;
    }

    @Override // android.webkit.WebViewClient
    public void onLoadResource(WebView webView, String str) {
        super.onLoadResource(webView, str);
        if (com.applovin.impl.sdk.n.a()) {
            com.applovin.impl.sdk.n nVar = this.f6605b;
            nVar.d("AdWebView", "Loaded resource: " + str);
        }
    }

    @Override // android.webkit.WebViewClient
    public void onPageFinished(WebView webView, String str) {
        super.onPageFinished(webView, str);
        if (com.applovin.impl.sdk.n.a()) {
            com.applovin.impl.sdk.n nVar = this.f6605b;
            nVar.d("AdWebView", "Loaded URL: " + str);
        }
        a aVar = this.f6606c;
        if (aVar != null) {
            aVar.a(webView, str);
        }
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
        super.onReceivedError(webView, webResourceRequest, webResourceError);
        onReceivedError(webView, webResourceError.getErrorCode(), webResourceError.getDescription().toString(), webResourceRequest.getUrl().toString());
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedHttpError(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
        super.onReceivedHttpError(webView, webResourceRequest, webResourceResponse);
        a aVar = this.f6606c;
        if (aVar != null) {
            com.applovin.impl.sdk.ad.b g10 = aVar.g();
            if (com.applovin.impl.sdk.n.a()) {
                com.applovin.impl.sdk.n nVar = this.f6605b;
                nVar.b("AdWebView", "Received HTTP error: " + webResourceResponse + "for url: " + webResourceRequest.getUrl() + " and ad: " + g10);
            }
        }
        if (d7.a(webResourceRequest.getUrl().toString(), this.f6604a)) {
            this.f6604a.D().a("adWebViewReceivedHttpError", webResourceRequest.getUrl().toString(), webResourceResponse.getStatusCode(), webResourceResponse.getReasonPhrase());
        }
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
        super.onReceivedSslError(webView, sslErrorHandler, sslError);
        a aVar = this.f6606c;
        if (aVar != null) {
            com.applovin.impl.sdk.ad.b g10 = aVar.g();
            String str = "Received SSL error: " + sslError;
            if (com.applovin.impl.sdk.n.a()) {
                this.f6605b.b("AdWebView", str + " for ad: " + g10);
            }
        }
    }

    @Override // com.applovin.impl.k4, android.webkit.WebViewClient
    public boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        AppLovinBroadcastManager.sendBroadcast(new Intent("com.applovin.render_process_gone"), null);
        if (this.f6606c == null) {
            return true;
        }
        com.applovin.impl.sdk.n.h("AdWebView", "Render process gone for ad: " + this.f6606c.g() + ". Process did crash: " + renderProcessGoneDetail.didCrash());
        com.applovin.impl.sdk.ad.b g10 = this.f6606c.g();
        if (g10 != null) {
            Map b10 = a2.b(g10);
            CollectionUtils.putStringIfValid("top_main_method", "onRenderProcessGone", b10);
            if (l0.i()) {
                b10.put("source", renderProcessGoneDetail.didCrash() ? "crash" : "non_crash");
            }
            this.f6604a.D().d(y1.f9695u0, b10);
        }
        if (((Boolean) this.f6604a.a(o4.f8248w5)).booleanValue()) {
            if (renderProcessGoneDetail.didCrash() && ((Boolean) this.f6604a.a(o4.C5)).booleanValue()) {
                String valueOf = g10 != null ? String.valueOf(g10.getAdIdNumber()) : "null";
                throw new RuntimeException("Render process crashed. This is likely caused by a crash in an AppLovin ad with ID: " + valueOf);
            } else if (webView != null && webView.equals(this.f6606c.f())) {
                this.f6606c.b();
                AppLovinAdSize k10 = this.f6606c.k();
                if (d7.a(k10)) {
                    this.f6606c.a(k10);
                    this.f6606c.C();
                }
            }
        }
        return super.onRenderProcessGone(webView, renderProcessGoneDetail);
    }

    @Override // android.webkit.WebViewClient
    public boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
        Uri url = webResourceRequest.getUrl();
        if (url != null) {
            return a(webView, url.toString());
        }
        if (com.applovin.impl.sdk.n.a()) {
            this.f6605b.b("AdWebView", "No url found for request");
            return false;
        }
        return false;
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedError(WebView webView, int i10, String str, String str2) {
        super.onReceivedError(webView, i10, str, str2);
        a aVar = this.f6606c;
        if (aVar != null) {
            com.applovin.impl.sdk.ad.b g10 = aVar.g();
            String str3 = "Received error with error code: " + i10 + " with description \\'" + str + "\\' for URL: " + str2;
            if (com.applovin.impl.sdk.n.a()) {
                this.f6605b.b("AdWebView", str3 + " for ad: " + g10);
            }
        }
        if (d7.a(str2, this.f6604a)) {
            this.f6604a.D().a("adWebViewReceivedError", str2, i10, str);
        }
    }

    @Override // android.webkit.WebViewClient
    public boolean shouldOverrideUrlLoading(WebView webView, String str) {
        return a(webView, str);
    }

    private boolean a(boolean z10, com.applovin.impl.sdk.ad.b bVar, Uri uri) {
        if (z10) {
            return false;
        }
        if (bVar.X0()) {
            return true;
        }
        if (bVar.b1()) {
            this.f6604a.D().d(y1.f9663e0, a(bVar, uri));
        }
        return false;
    }

    private static Map a(com.applovin.impl.sdk.ad.b bVar, Uri uri) {
        Map b10 = a2.b(bVar);
        CollectionUtils.putStringIfValid("url", uri.toString(), b10);
        return b10;
    }

    private void a() {
        this.f6606c.w();
    }

    private void a(MotionEvent motionEvent) {
        this.f6606c.a(motionEvent);
    }

    private void a(e7 e7Var, b bVar) {
        a(e7Var, bVar, (Bundle) null);
    }

    private void a(e7 e7Var, b bVar, Bundle bundle) {
        h7 e12 = e7Var.e1();
        if (e12 != null) {
            q7.a(e12.b(), this.f6606c.j());
            a(bVar, e12.c(), bundle);
        }
    }

    private void a(b bVar, Uri uri) {
        a(bVar, uri, (Bundle) null);
    }

    private void a(b bVar, Uri uri, Bundle bundle) {
        com.applovin.impl.sdk.ad.b currentAd = bVar.getCurrentAd();
        AppLovinAdView i10 = this.f6606c.i();
        if (i10 != null && currentAd != null) {
            if (currentAd instanceof e7) {
                ((e7) currentAd).getAdEventTracker().v();
            }
            this.f6606c.a(currentAd, i10, uri, bVar.getAndClearLastClickEvent(), bundle);
        } else if (com.applovin.impl.sdk.n.a()) {
            com.applovin.impl.sdk.n nVar = this.f6605b;
            nVar.b("AdWebView", "Attempting to track click that is null or not an ApplovinAdView instance for clickedUri = " + uri);
        }
    }

    private void a(Uri uri) {
        String str;
        boolean booleanQueryParameter = uri.getBooleanQueryParameter("success", false);
        String queryParameter = uri.getQueryParameter("type");
        if (booleanQueryParameter) {
            str = "Tracked event: " + queryParameter;
        } else {
            str = "Failed to track event: " + queryParameter;
        }
        d7.a(str, com.applovin.impl.sdk.j.m());
    }
}
