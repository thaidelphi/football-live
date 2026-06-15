package com.google.android.gms.internal.consent_sdk;

import android.annotation.TargetApi;
import android.util.Log;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.ump:user-messaging-platform@@3.1.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzbp extends WebViewClient {
    final /* synthetic */ zzbr zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzbp(zzbr zzbrVar, zzbq zzbqVar) {
        this.zza = zzbrVar;
    }

    @Override // android.webkit.WebViewClient
    public final void onLoadResource(WebView webView, String str) {
        zzbx zzbxVar;
        if (zzbr.zzf(this.zza, str)) {
            zzbxVar = this.zza.zzb;
            zzbxVar.zze(str);
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onPageFinished(WebView webView, String str) {
        boolean z10;
        z10 = this.zza.zzc;
        if (z10) {
            return;
        }
        Log.d("UserMessagingPlatform", "Wall html loaded.");
        this.zza.zzc = true;
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedError(WebView webView, int i10, String str, String str2) {
        zzbx zzbxVar;
        zzbxVar = this.zza.zzb;
        zzbxVar.zzf(i10, str, str2);
    }

    @Override // android.webkit.WebViewClient
    @TargetApi(24)
    public final boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
        zzbx zzbxVar;
        String uri = webResourceRequest.getUrl().toString();
        if (zzbr.zzf(this.zza, uri)) {
            zzbxVar = this.zza.zzb;
            zzbxVar.zze(uri);
            return true;
        }
        return false;
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
        zzbx zzbxVar;
        if (zzbr.zzf(this.zza, str)) {
            zzbxVar = this.zza.zzb;
            zzbxVar.zze(str);
            return true;
        }
        return false;
    }
}
