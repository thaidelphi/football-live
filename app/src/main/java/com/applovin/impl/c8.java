package com.applovin.impl;

import android.net.Uri;
import android.os.Bundle;
import android.webkit.WebView;
import java.lang.ref.WeakReference;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class c8 extends k4 {

    /* renamed from: a  reason: collision with root package name */
    private final com.applovin.impl.sdk.n f6762a;

    /* renamed from: b  reason: collision with root package name */
    private WeakReference f6763b;

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public interface a {
        void a(Uri uri, com.applovin.impl.adview.l lVar);

        void a(com.applovin.impl.adview.l lVar);

        void a(com.applovin.impl.adview.l lVar, Bundle bundle);

        void b(Uri uri, com.applovin.impl.adview.l lVar);

        void b(com.applovin.impl.adview.l lVar);

        void c(com.applovin.impl.adview.l lVar);

        void d(com.applovin.impl.adview.l lVar);
    }

    public c8(com.applovin.impl.sdk.j jVar) {
        this.f6762a = jVar.I();
    }

    public void a(WeakReference weakReference) {
        this.f6763b = weakReference;
    }

    @Override // android.webkit.WebViewClient
    public boolean shouldOverrideUrlLoading(WebView webView, String str) {
        a(webView, str);
        return true;
    }

    private void a(WebView webView, String str) {
        if (com.applovin.impl.sdk.n.a()) {
            com.applovin.impl.sdk.n nVar = this.f6762a;
            nVar.d("WebViewButtonClient", "Processing click on ad URL \"" + str + "\"");
        }
        if (str == null || !(webView instanceof com.applovin.impl.adview.l)) {
            return;
        }
        com.applovin.impl.adview.l lVar = (com.applovin.impl.adview.l) webView;
        Uri parse = Uri.parse(str);
        String scheme = parse.getScheme();
        String host = parse.getHost();
        String path = parse.getPath();
        a aVar = (a) this.f6763b.get();
        if ("applovin".equalsIgnoreCase(scheme) && "com.applovin.sdk".equalsIgnoreCase(host) && aVar != null) {
            if ("/track_click".equals(path)) {
                aVar.b(lVar);
            } else if ("/close_ad".equals(path)) {
                aVar.a(lVar);
            } else if ("/skip_ad".equals(path)) {
                aVar.d(lVar);
            } else if ("/direct_download".equals(path)) {
                aVar.a(lVar, b7.a(parse));
            } else if ("/load_url".equals(path)) {
                aVar.a(parse, lVar);
            } else if ("/template_error".equals(path)) {
                aVar.b(parse, lVar);
            } else if ("/fully_watched".equals(path)) {
                aVar.c(lVar);
            } else {
                if (com.applovin.impl.sdk.n.a()) {
                    com.applovin.impl.sdk.n nVar2 = this.f6762a;
                    nVar2.k("WebViewButtonClient", "Unknown URL: " + str);
                }
                if (com.applovin.impl.sdk.n.a()) {
                    com.applovin.impl.sdk.n nVar3 = this.f6762a;
                    nVar3.k("WebViewButtonClient", "Path: " + path);
                }
            }
        }
    }
}
