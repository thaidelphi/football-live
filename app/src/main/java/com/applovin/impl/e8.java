package com.applovin.impl;

import android.view.ViewGroup;
import android.view.ViewParent;
import android.webkit.WebView;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.sdk.AppLovinSdkUtils;
import com.unity3d.ads.adplayer.AndroidWebViewClient;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public abstract class e8 {
    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void a(WebView webView) {
        ViewParent parent = webView.getParent();
        if (parent instanceof ViewGroup) {
            ((ViewGroup) parent).removeView(webView);
        }
        webView.removeAllViews();
        webView.loadUrl(AndroidWebViewClient.BLANK_PAGE);
        webView.onPause();
        webView.destroyDrawingCache();
        webView.destroy();
    }

    public static void b(final WebView webView) {
        if (webView == null) {
            return;
        }
        AppLovinSdkUtils.runOnUiThread(new Runnable() { // from class: com.applovin.impl.fa
            @Override // java.lang.Runnable
            public final void run() {
                e8.a(webView);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void b(WebView webView, String str) {
        if (l0.e()) {
            webView.evaluateJavascript(str, null);
            return;
        }
        webView.loadUrl("javascript:" + str);
    }

    public static void a(final WebView webView, final String str, String str2, com.applovin.impl.sdk.j jVar) {
        if (webView == null) {
            return;
        }
        try {
            jVar.I();
            if (com.applovin.impl.sdk.n.a()) {
                com.applovin.impl.sdk.n I = jVar.I();
                I.a(str2, "Forwarding \"" + str + "\" to WebView");
            }
            AppLovinSdkUtils.runOnUiThread(new Runnable() { // from class: com.applovin.impl.ha
                @Override // java.lang.Runnable
                public final void run() {
                    webView.loadUrl(str);
                }
            });
        } catch (Throwable th) {
            jVar.I();
            if (com.applovin.impl.sdk.n.a()) {
                jVar.I().a(str2, "Unable to forward to WebView", th);
            }
            jVar.D().a(str2, th, CollectionUtils.hashMap("operation", str));
        }
    }

    public static void a(final WebView webView, final String str) {
        if (webView == null) {
            return;
        }
        AppLovinSdkUtils.runOnUiThread(new Runnable() { // from class: com.applovin.impl.ga
            @Override // java.lang.Runnable
            public final void run() {
                e8.b(webView, str);
            }
        });
    }
}
