package com.startapp;

import android.webkit.WebView;
/* compiled from: Sta */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class kb implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ WebView f22181a;

    public kb(WebView webView) {
        this.f22181a = webView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f22181a.loadUrl("http://0.0.0.0");
    }
}
