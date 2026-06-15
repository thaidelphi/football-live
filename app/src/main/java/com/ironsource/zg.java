package com.ironsource;

import android.annotation.TargetApi;
import android.os.Build;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.sdk.utils.Logger;
import com.ironsource.vh;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public class zg extends WebViewClient {

    /* renamed from: b  reason: collision with root package name */
    private static final String f21658b = "zg";

    /* renamed from: a  reason: collision with root package name */
    private final vh.a f21659a;

    public zg(vh.a aVar) {
        this.f21659a = aVar;
    }

    private String a(String str, String str2) {
        return "ISNAdViewWebClient | External Adunit failed to load." + str + " Status code: " + str2;
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedError(WebView webView, int i10, String str, String str2) {
        try {
            this.f21659a.a(a("onReceivedError", String.valueOf(i10)));
        } catch (Exception e8) {
            o9.d().a(e8);
            IronLog.INTERNAL.error(e8.toString());
        }
        super.onReceivedError(webView, i10, str, str2);
    }

    @Override // android.webkit.WebViewClient
    @TargetApi(23)
    public void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
        try {
            this.f21659a.a(a("onReceivedErrorM", String.valueOf(webResourceError.getErrorCode())));
        } catch (Exception e8) {
            o9.d().a(e8);
            IronLog.INTERNAL.error(e8.toString());
        }
        super.onReceivedError(webView, webResourceRequest, webResourceError);
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedHttpError(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
        try {
            this.f21659a.a(a("onReceivedHttpError", Build.VERSION.SDK_INT >= 21 ? String.valueOf(webResourceResponse.getStatusCode()) : ""));
        } catch (Exception e8) {
            o9.d().a(e8);
            IronLog.INTERNAL.error(e8.toString());
        }
        super.onReceivedHttpError(webView, webResourceRequest, webResourceResponse);
    }

    @Override // android.webkit.WebViewClient
    @TargetApi(26)
    public boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        try {
            String str = f21658b;
            Logger.e(str, "Chromium process crashed - detail.didCrash():" + renderProcessGoneDetail.didCrash());
            this.f21659a.b(renderProcessGoneDetail.didCrash() ? "Render process was observed to crash" : "Render process was killed by the system");
            return true;
        } catch (Exception e8) {
            o9.d().a(e8);
            IronLog.INTERNAL.error(e8.toString());
            return true;
        }
    }
}
