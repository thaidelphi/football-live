package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.webkit.WebView;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzfkk extends zzfkg {
    private WebView zza;
    private Long zzb;
    private final Map zzc;

    public zzfkk(String str, Map map, String str2) {
        super(str);
        this.zzb = null;
        this.zzc = map;
    }

    @Override // com.google.android.gms.internal.ads.zzfkg
    public final void zzc() {
        super.zzc();
        new Handler().postDelayed(new zzfkj(this), Math.max(4000 - (this.zzb == null ? 4000L : TimeUnit.MILLISECONDS.convert(System.nanoTime() - this.zzb.longValue(), TimeUnit.NANOSECONDS)), 2000L));
        this.zza = null;
    }

    @Override // com.google.android.gms.internal.ads.zzfkg
    public final void zzi(zzfiz zzfizVar, zzfix zzfixVar) {
        JSONObject jSONObject = new JSONObject();
        Map zzi = zzfixVar.zzi();
        Iterator it = zzi.keySet().iterator();
        if (!it.hasNext()) {
            zzj(zzfizVar, zzfixVar, jSONObject);
        } else {
            zzfjj zzfjjVar = (zzfjj) zzi.get((String) it.next());
            throw null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfkg
    public final void zzo() {
        WebView webView = new WebView(zzfjv.zzb().zza());
        this.zza = webView;
        webView.getSettings().setJavaScriptEnabled(true);
        this.zza.getSettings().setAllowContentAccess(false);
        this.zza.getSettings().setAllowFileAccess(false);
        this.zza.setWebViewClient(new zzfki(this));
        zzn(this.zza);
        zzfjx.zzk(this.zza, null);
        Iterator it = this.zzc.keySet().iterator();
        if (!it.hasNext()) {
            this.zzb = Long.valueOf(System.nanoTime());
            return;
        }
        zzfjj zzfjjVar = (zzfjj) this.zzc.get((String) it.next());
        throw null;
    }
}
