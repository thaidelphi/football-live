package com.google.android.gms.internal.ads;

import android.webkit.ValueCallback;
import android.webkit.WebView;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzayi implements Runnable {
    final ValueCallback zza;
    final /* synthetic */ zzaya zzb;
    final /* synthetic */ WebView zzc;
    final /* synthetic */ boolean zzd;
    final /* synthetic */ zzayk zze;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzayi(zzayk zzaykVar, final zzaya zzayaVar, final WebView webView, final boolean z10) {
        this.zzb = zzayaVar;
        this.zzc = webView;
        this.zzd = z10;
        this.zze = zzaykVar;
        this.zza = new ValueCallback() { // from class: com.google.android.gms.internal.ads.zzayh
            @Override // android.webkit.ValueCallback
            public final void onReceiveValue(Object obj) {
                zzayi.this.zze.zzc(zzayaVar, webView, (String) obj, z10);
            }
        };
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.zzc.getSettings().getJavaScriptEnabled()) {
            try {
                this.zzc.evaluateJavascript("(function() { return  {text:document.body.innerText}})();", this.zza);
            } catch (Throwable unused) {
                this.zza.onReceiveValue("");
            }
        }
    }
}
