package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
@TargetApi(21)
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzcez extends zzcey {
    public zzcez(zzcdq zzcdqVar, zzbak zzbakVar, boolean z10, zzeaf zzeafVar) {
        super(zzcdqVar, zzbakVar, z10, zzeafVar);
    }

    @Override // android.webkit.WebViewClient
    public final WebResourceResponse shouldInterceptRequest(WebView webView, WebResourceRequest webResourceRequest) {
        if (webResourceRequest == null || webResourceRequest.getUrl() == null) {
            return null;
        }
        return zzW(webView, webResourceRequest.getUrl().toString(), webResourceRequest.getRequestHeaders());
    }
}
