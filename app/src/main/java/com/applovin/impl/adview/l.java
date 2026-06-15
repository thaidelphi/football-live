package com.applovin.impl.adview;

import android.content.Context;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import com.applovin.impl.c8;
import com.applovin.impl.l0;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class l extends com.applovin.impl.g0 {

    /* renamed from: c  reason: collision with root package name */
    private final String f6641c;

    public l(String str, com.applovin.impl.sdk.ad.b bVar, c8 c8Var, Context context) {
        super(context);
        this.f6641c = str;
        setBackgroundColor(0);
        WebSettings settings = getSettings();
        settings.setSupportMultipleWindows(false);
        settings.setJavaScriptEnabled(true);
        if (bVar.L0()) {
            applySettings(bVar);
        } else {
            settings.setAllowFileAccess(true);
            if (l0.e() && bVar.H0()) {
                WebView.setWebContentsDebuggingEnabled(true);
            }
        }
        setWebViewClient(c8Var);
        setWebChromeClient(new WebChromeClient());
        setVerticalScrollBarEnabled(false);
        setHorizontalScrollBarEnabled(false);
        setScrollBarStyle(33554432);
    }

    public void a(String str) {
        loadDataWithBaseURL(this.f6641c, str, "text/html", null, "");
    }
}
