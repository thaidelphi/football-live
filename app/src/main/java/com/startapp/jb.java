package com.startapp;

import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
/* compiled from: Sta */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class jb extends WebViewClient {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ hb f22159a;

    public jb(hb hbVar) {
        this.f22159a = hbVar;
    }

    @Override // android.webkit.WebViewClient
    public final WebResourceResponse shouldInterceptRequest(WebView webView, WebResourceRequest webResourceRequest) {
        this.f22159a.a(webView, webResourceRequest);
        return null;
    }
}
