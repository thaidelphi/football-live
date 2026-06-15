package com.facebook.ads.redexgen.X;

import android.graphics.Bitmap;
import android.os.Handler;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.facebook.ads.AdError;
/* renamed from: com.facebook.ads.redexgen.X.34  reason: invalid class name */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public class AnonymousClass34 extends WebViewClient {
    public boolean A00 = false;
    public final C04672p A01;
    public final AnonymousClass33 A02;
    public final boolean A03;

    public AnonymousClass34(C04672p c04672p, AnonymousClass33 anonymousClass33, boolean z10) {
        this.A01 = c04672p;
        this.A02 = anonymousClass33;
        this.A03 = z10;
    }

    private void A00() {
        if (this.A03) {
            this.A02.AET(AdError.CACHE_ERROR);
        } else {
            A01();
        }
    }

    private void A01() {
        if (this.A02 != null) {
            this.A02.AEU();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A02() {
        A00();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A03() {
        new Handler().postDelayed(new C2044mP(this), this.A01.A09());
    }

    @Override // android.webkit.WebViewClient
    public final void onPageFinished(WebView webView, String str) {
        this.A00 = true;
        A01();
    }

    @Override // android.webkit.WebViewClient
    public final void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        super.onPageStarted(webView, str, bitmap);
        A03();
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
        this.A00 = true;
        A02();
    }

    @Override // android.webkit.WebViewClient
    public final boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        F1.A02(AbstractC06048a.A2g);
        A00();
        return true;
    }
}
