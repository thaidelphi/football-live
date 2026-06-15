package com.google.android.gms.internal.ads;

import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import java.io.File;
import java.util.Collections;
import java.util.Map;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public class zzcey extends zzcdy {
    public zzcey(zzcdq zzcdqVar, zzbak zzbakVar, boolean z10, zzeaf zzeafVar) {
        super(zzcdqVar, zzbakVar, z10, new zzbrg(zzcdqVar, zzcdqVar.zzE(), new zzbau(zzcdqVar.getContext())), null, zzeafVar);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final WebResourceResponse zzW(WebView webView, String str, Map map) {
        String str2;
        if (!(webView instanceof zzcdq)) {
            int i10 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzj("Tried to intercept request from a WebView that wasn't an AdWebView.");
            return null;
        }
        zzcdq zzcdqVar = (zzcdq) webView;
        zzbwn zzbwnVar = this.zza;
        if (zzbwnVar != null) {
            zzbwnVar.zze(str, map, 1);
        }
        zzfoa.zza();
        zzfog zzfogVar = zzfog.zza;
        if (!"mraid.js".equalsIgnoreCase(new File(str).getName())) {
            if (map == null) {
                map = Collections.emptyMap();
            }
            return super.zzc(str, map);
        }
        if (zzcdqVar.zzN() != null) {
            zzcdqVar.zzN().zzH();
        }
        if (zzcdqVar.zzO().zzi()) {
            str2 = (String) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbbm.zzaa);
        } else if (zzcdqVar.zzaF()) {
            str2 = (String) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbbm.zzZ);
        } else {
            str2 = (String) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbbm.zzY);
        }
        com.google.android.gms.ads.internal.zzv.zzq();
        return com.google.android.gms.ads.internal.util.zzs.zzy(zzcdqVar.getContext(), zzcdqVar.zzm().afmaVersion, str2);
    }
}
