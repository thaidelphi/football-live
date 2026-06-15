package com.google.android.gms.internal.ads;

import android.view.View;
import android.webkit.WebView;
import c1.h;
import c1.i;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Timer;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzfjg {
    private final zzfji zza;
    private final WebView zzb;
    private zzflh zzc;
    private final HashMap zzd;
    private final zzfju zze;

    private zzfjg(zzfji zzfjiVar, WebView webView, boolean z10) {
        HashMap hashMap = new HashMap();
        this.zzd = hashMap;
        this.zze = new zzfju();
        zzfkq.zza();
        this.zza = zzfjiVar;
        this.zzb = webView;
        if (zza() != webView) {
            for (zzfiv zzfivVar : hashMap.values()) {
                zzfivVar.zzd(webView);
            }
            this.zzc = new zzflh(webView);
        }
        if (i.a("WEB_MESSAGE_LISTENER")) {
            zzh();
            h.a(this.zzb, "omidJsSessionService", new HashSet(Arrays.asList("*")), new zzfjf(this));
            return;
        }
        throw new UnsupportedOperationException("The JavaScriptSessionService cannot be supported in this WebView version.");
    }

    public static zzfjg zzb(zzfji zzfjiVar, WebView webView, boolean z10) {
        return new zzfjg(zzfjiVar, webView, true);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* bridge */ /* synthetic */ void zzc(zzfjg zzfjgVar, String str) {
        zzfiv zzfivVar = (zzfiv) zzfjgVar.zzd.get(str);
        if (zzfivVar != null) {
            zzfivVar.zzc();
            zzfjgVar.zzd.remove(str);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* bridge */ /* synthetic */ void zze(zzfjg zzfjgVar, String str) {
        zzfja zzfjaVar = zzfja.DEFINED_BY_JAVASCRIPT;
        zzfjd zzfjdVar = zzfjd.DEFINED_BY_JAVASCRIPT;
        zzfjh zzfjhVar = zzfjh.JAVASCRIPT;
        zzfiz zzfizVar = new zzfiz(zzfiw.zza(zzfjaVar, zzfjdVar, zzfjhVar, zzfjhVar, false), zzfix.zzb(zzfjgVar.zza, zzfjgVar.zzb, null, null), str);
        zzfjgVar.zzd.put(str, zzfizVar);
        zzfizVar.zzd(zzfjgVar.zza());
        for (zzfjt zzfjtVar : zzfjgVar.zze.zza()) {
            zzfizVar.zzb((View) zzfjtVar.zzb().get(), zzfjtVar.zza(), zzfjtVar.zzc());
        }
        zzfizVar.zze();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzh() {
        h.i(this.zzb, "omidJsSessionService");
    }

    final View zza() {
        zzflh zzflhVar = this.zzc;
        if (zzflhVar == null) {
            return null;
        }
        return (View) zzflhVar.get();
    }

    public final void zzf(View view, zzfjc zzfjcVar, String str) {
        for (zzfiv zzfivVar : this.zzd.values()) {
            zzfivVar.zzb(view, zzfjcVar, "Ad overlay");
        }
        this.zze.zzb(view, zzfjcVar, "Ad overlay");
    }

    public final void zzg(zzceh zzcehVar) {
        for (zzfiv zzfivVar : this.zzd.values()) {
            zzfivVar.zzc();
        }
        Timer timer = new Timer();
        timer.schedule(new zzfje(this, zzcehVar, timer), 1000L);
    }
}
