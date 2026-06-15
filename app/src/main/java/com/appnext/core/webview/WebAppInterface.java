package com.appnext.core.webview;

import android.content.Context;
import android.webkit.JavascriptInterface;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class WebAppInterface {
    Context context;

    public WebAppInterface(Context context) {
        this.context = context;
    }

    @JavascriptInterface
    public void destroy() {
    }

    @JavascriptInterface
    public void destroy(String str) {
    }

    @JavascriptInterface
    public String filterAds(String str) {
        return str;
    }

    @JavascriptInterface
    public String getAdAt(int i10) {
        return "";
    }

    @JavascriptInterface
    public int getAdCount() {
        return 0;
    }

    @JavascriptInterface
    public void gotoAppWall() {
    }

    @JavascriptInterface
    public String init() {
        return "";
    }

    @JavascriptInterface
    public void jsError(String str) {
    }

    @JavascriptInterface
    public String loadAds() {
        return "";
    }

    @JavascriptInterface
    public void logSTP(String str, String str2) {
    }

    @JavascriptInterface
    public void notifyImpression(String str) {
    }

    @JavascriptInterface
    public void openLink(String str) {
    }

    @JavascriptInterface
    public void openResultPage(String str) {
    }

    @JavascriptInterface
    public void openStore(String str) {
    }

    @JavascriptInterface
    public void play() {
    }

    @JavascriptInterface
    public void postView(String str) {
    }

    @JavascriptInterface
    public void videoPlayed() {
    }
}
