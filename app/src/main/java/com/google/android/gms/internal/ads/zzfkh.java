package com.google.android.gms.internal.ads;

import android.annotation.SuppressLint;
import android.webkit.WebView;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzfkh extends zzfkg {
    @SuppressLint({"SetJavaScriptEnabled"})
    public zzfkh(String str, WebView webView) {
        super(str);
        if (!webView.getSettings().getJavaScriptEnabled()) {
            webView.getSettings().setJavaScriptEnabled(true);
        }
        zzn(webView);
    }
}
