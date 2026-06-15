package com.google.android.gms.internal.ads;

import android.webkit.WebView;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
final class zzfkj implements Runnable {
    final /* synthetic */ zzfkk zza;
    private final WebView zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzfkj(zzfkk zzfkkVar) {
        WebView webView;
        this.zza = zzfkkVar;
        webView = zzfkkVar.zza;
        this.zzb = webView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zzb.destroy();
    }
}
