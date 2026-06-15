package com.google.android.gms.ads.h5;

import android.content.Context;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.google.android.gms.internal.ads.zzbjj;
import com.google.android.gms.internal.ads.zzbjw;
/* compiled from: com.google.android.gms:play-services-ads-lite@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class H5AdsWebViewClient extends zzbjj {

    /* renamed from: a  reason: collision with root package name */
    private final zzbjw f11133a;

    public H5AdsWebViewClient(Context context, WebView webView) {
        this.f11133a = new zzbjw(context, webView);
    }

    public void clearAdObjects() {
        this.f11133a.zza();
    }

    @Override // com.google.android.gms.internal.ads.zzbjj
    protected WebViewClient getDelegate() {
        return this.f11133a;
    }

    public WebViewClient getDelegateWebViewClient() {
        return this.f11133a.getDelegate();
    }

    public void setDelegateWebViewClient(WebViewClient webViewClient) {
        this.f11133a.zzb(webViewClient);
    }
}
