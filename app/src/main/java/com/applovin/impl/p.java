package com.applovin.impl;

import android.content.Intent;
import android.webkit.ConsoleMessage;
import android.webkit.JsResult;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import com.applovin.impl.sdk.AppLovinBroadcastManager;
import java.util.Map;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class p extends WebChromeClient {

    /* renamed from: a  reason: collision with root package name */
    private final com.applovin.impl.sdk.j f8315a;

    /* renamed from: b  reason: collision with root package name */
    private final com.applovin.impl.sdk.n f8316b;

    /* renamed from: c  reason: collision with root package name */
    private final com.applovin.impl.adview.a f8317c;

    public p(com.applovin.impl.adview.a aVar, com.applovin.impl.sdk.j jVar) {
        this.f8315a = jVar;
        this.f8316b = jVar.I();
        this.f8317c = aVar;
    }

    private void a(String str, ConsoleMessage consoleMessage) {
        String str2;
        com.applovin.impl.sdk.ad.b g10 = this.f8317c.g();
        if (g10 != null) {
            String str3 = consoleMessage.messageLevel() + ": " + consoleMessage.sourceId() + ": " + consoleMessage.lineNumber();
            if (str == null) {
                str2 = "AdWebView";
            } else {
                str2 = "AdWebView:" + str;
            }
            Map b10 = a2.b(g10);
            b10.putAll(a2.a(g10));
            b10.put("source", str2);
            b10.put("top_main_method", str3);
            b10.put("error_message", consoleMessage.message());
            this.f8315a.D().d(y1.f9691s0, b10);
        }
    }

    @Override // android.webkit.WebChromeClient
    public boolean onConsoleMessage(ConsoleMessage consoleMessage) {
        String str = consoleMessage.messageLevel() + ": " + consoleMessage.sourceId() + ": " + consoleMessage.lineNumber() + ": " + consoleMessage.message();
        if (com.applovin.impl.sdk.n.a()) {
            this.f8316b.a("AdWebView", str);
        }
        if (consoleMessage.messageLevel() != ConsoleMessage.MessageLevel.ERROR) {
            return true;
        }
        String message = consoleMessage.message();
        if (message.contains("al_onPoststitialShow")) {
            AppLovinBroadcastManager.sendBroadcast(new Intent("com.applovin.al_onPoststitialShow_evaluation_error"), null);
            a("onPoststitialShowEvaluationError", consoleMessage);
        } else if (message.contains("SyntaxError")) {
            a(null, consoleMessage);
        }
        return true;
    }

    @Override // android.webkit.WebChromeClient
    public boolean onJsAlert(WebView webView, String str, String str2, JsResult jsResult) {
        if (com.applovin.impl.sdk.n.a()) {
            com.applovin.impl.sdk.n nVar = this.f8316b;
            nVar.k("AdWebView", "Alert attempted: " + str2);
            return true;
        }
        return true;
    }

    @Override // android.webkit.WebChromeClient
    public boolean onJsBeforeUnload(WebView webView, String str, String str2, JsResult jsResult) {
        if (com.applovin.impl.sdk.n.a()) {
            com.applovin.impl.sdk.n nVar = this.f8316b;
            nVar.k("AdWebView", "JS onBeforeUnload attempted: " + str2);
            return true;
        }
        return true;
    }

    @Override // android.webkit.WebChromeClient
    public boolean onJsConfirm(WebView webView, String str, String str2, JsResult jsResult) {
        if (com.applovin.impl.sdk.n.a()) {
            com.applovin.impl.sdk.n nVar = this.f8316b;
            nVar.k("AdWebView", "JS confirm attempted: " + str2);
            return true;
        }
        return true;
    }

    @Override // android.webkit.WebChromeClient
    public void onProgressChanged(WebView webView, int i10) {
        com.applovin.impl.adview.a aVar;
        if (i10 != 100 || (aVar = this.f8317c) == null) {
            return;
        }
        aVar.c(webView);
    }

    @Override // android.webkit.WebChromeClient
    public void onConsoleMessage(String str, int i10, String str2) {
        if (com.applovin.impl.sdk.n.a()) {
            com.applovin.impl.sdk.n nVar = this.f8316b;
            nVar.k("AdWebView", "console.log[" + i10 + "] :" + str);
        }
    }
}
