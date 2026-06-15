package com.facebook.ads.redexgen.X;

import android.view.View;
import android.webkit.WebView;
/* renamed from: com.facebook.ads.redexgen.X.Ej  reason: case insensitive filesystem */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public class View$OnClickListenerC0750Ej implements View.OnClickListener {
    public final /* synthetic */ C0753Em A00;

    public View$OnClickListenerC0750Ej(C0753Em c0753Em) {
        this.A00 = c0753Em;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        WebView webView;
        WebView webView2;
        if (BQ.A02(this)) {
            return;
        }
        try {
            webView = this.A00.A09;
            if (!webView.canGoForward()) {
                return;
            }
            webView2 = this.A00.A09;
            webView2.goForward();
        } catch (Throwable th) {
            BQ.A00(th, this);
        }
    }
}
