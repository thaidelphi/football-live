package com.google.android.gms.ads.nonagon.signalgeneration;

import android.graphics.Bitmap;
import android.os.Build;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import c1.h;
import c1.i;
import com.google.android.gms.internal.ads.zzbbm;
import com.google.android.gms.internal.ads.zzbjj;
import com.google.android.gms.internal.ads.zzgba;
import java.util.Locale;
import java.util.concurrent.Executor;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class zzj extends zzbjj {

    /* renamed from: a  reason: collision with root package name */
    private final WebView f11799a;

    /* renamed from: b  reason: collision with root package name */
    private final zzf f11800b;

    /* renamed from: c  reason: collision with root package name */
    private final Executor f11801c;

    /* renamed from: d  reason: collision with root package name */
    private WebViewClient f11802d;

    public zzj(WebView webView, zzf zzfVar, zzgba zzgbaVar) {
        this.f11799a = webView;
        this.f11800b = zzfVar;
        this.f11801c = zzgbaVar;
    }

    private final void a() {
        this.f11799a.evaluateJavascript(String.format(Locale.getDefault(), (String) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbbm.zzjI), this.f11800b.zza()), null);
    }

    public static /* synthetic */ void zza(zzj zzjVar) {
        WebViewClient g10;
        try {
            com.google.android.gms.ads.internal.zzv.zzq();
            WebView webView = zzjVar.f11799a;
            if (Build.VERSION.SDK_INT >= 26) {
                g10 = webView.getWebViewClient();
            } else {
                if (i.a("GET_WEB_VIEW_CLIENT")) {
                    try {
                        g10 = h.g(webView);
                    } catch (RuntimeException e8) {
                        com.google.android.gms.ads.internal.zzv.zzp().zzw(e8, "AdUtil.getWebViewClient");
                    }
                }
                throw new IllegalStateException("getWebViewClient not supported");
            }
            if (g10 == zzjVar) {
                return;
            }
            if (g10 != null) {
                zzjVar.f11802d = g10;
            }
            zzjVar.f11799a.setWebViewClient(zzjVar);
            zzjVar.a();
        } catch (IllegalStateException unused) {
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbjj
    protected final WebViewClient getDelegate() {
        return this.f11802d;
    }

    @Override // com.google.android.gms.internal.ads.zzbjj, android.webkit.WebViewClient
    public final void onPageFinished(WebView webView, String str) {
        a();
        super.onPageFinished(webView, str);
    }

    @Override // com.google.android.gms.internal.ads.zzbjj, android.webkit.WebViewClient
    public final void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        a();
        super.onPageStarted(webView, str, bitmap);
    }

    public final void zzb() {
        this.f11801c.execute(new Runnable() { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzh
            @Override // java.lang.Runnable
            public final void run() {
                zzj.zza(zzj.this);
            }
        });
    }
}
