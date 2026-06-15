package com.google.android.gms.internal.ads;

import android.webkit.WebView;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzfix {
    private final zzfji zza;
    private final WebView zzb;
    private final List zzc = new ArrayList();
    private final Map zzd = new HashMap();
    private final String zze;
    private final String zzf;
    private final zzfiy zzg;

    private zzfix(zzfji zzfjiVar, WebView webView, String str, List list, String str2, String str3, zzfiy zzfiyVar) {
        this.zza = zzfjiVar;
        this.zzb = webView;
        this.zzg = zzfiyVar;
        this.zzf = str2;
        this.zze = str3;
    }

    public static zzfix zzb(zzfji zzfjiVar, WebView webView, String str, String str2) {
        if (str2 != null) {
            zzfkq.zzd(str2, 256, "CustomReferenceData is greater than 256 characters");
        }
        return new zzfix(zzfjiVar, webView, null, null, str, str2, zzfiy.HTML);
    }

    public static zzfix zzc(zzfji zzfjiVar, WebView webView, String str, String str2) {
        zzfkq.zzd("", 256, "CustomReferenceData is greater than 256 characters");
        return new zzfix(zzfjiVar, webView, null, null, str, "", zzfiy.JAVASCRIPT);
    }

    public final WebView zza() {
        return this.zzb;
    }

    public final zzfiy zzd() {
        return this.zzg;
    }

    public final zzfji zze() {
        return this.zza;
    }

    public final String zzf() {
        return this.zzf;
    }

    public final String zzg() {
        return this.zze;
    }

    public final List zzh() {
        return Collections.unmodifiableList(this.zzc);
    }

    public final Map zzi() {
        return Collections.unmodifiableMap(this.zzd);
    }
}
