package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.text.TextUtils;
import android.webkit.JavascriptInterface;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzcew {
    private final zzcex zza;
    private final zzcev zzb;

    public zzcew(zzcex zzcexVar, zzcev zzcevVar) {
        this.zzb = zzcevVar;
        this.zza = zzcexVar;
    }

    public static /* synthetic */ void zza(zzcew zzcewVar, String str) {
        Uri parse = Uri.parse(str);
        zzcdy zzaO = ((zzcep) zzcewVar.zzb.zza).zzaO();
        if (zzaO == null) {
            int i10 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzg("Unable to pass GMSG, no AdWebViewClient for AdWebView!");
            return;
        }
        zzaO.zzn(parse);
    }

    @JavascriptInterface
    public String getClickSignals(String str) {
        if (TextUtils.isEmpty(str)) {
            com.google.android.gms.ads.internal.util.zze.zza("Click string is empty, not proceeding.");
            return "";
        }
        zzauc zzI = ((zzcfd) this.zza).zzI();
        if (zzI == null) {
            com.google.android.gms.ads.internal.util.zze.zza("Signal utils is empty, ignoring.");
            return "";
        }
        zzatx zzc = zzI.zzc();
        if (zzc == null) {
            com.google.android.gms.ads.internal.util.zze.zza("Signals object is empty, ignoring.");
            return "";
        } else if (this.zza.getContext() == null) {
            com.google.android.gms.ads.internal.util.zze.zza("Context is null, ignoring.");
            return "";
        } else {
            zzcex zzcexVar = this.zza;
            return zzc.zze(zzcexVar.getContext(), str, ((zzcff) zzcexVar).zzF(), this.zza.zzi());
        }
    }

    @JavascriptInterface
    public String getViewSignals() {
        zzauc zzI = ((zzcfd) this.zza).zzI();
        if (zzI == null) {
            com.google.android.gms.ads.internal.util.zze.zza("Signal utils is empty, ignoring.");
            return "";
        }
        zzatx zzc = zzI.zzc();
        if (zzc == null) {
            com.google.android.gms.ads.internal.util.zze.zza("Signals object is empty, ignoring.");
            return "";
        } else if (this.zza.getContext() == null) {
            com.google.android.gms.ads.internal.util.zze.zza("Context is null, ignoring.");
            return "";
        } else {
            zzcex zzcexVar = this.zza;
            return zzc.zzh(zzcexVar.getContext(), ((zzcff) zzcexVar).zzF(), this.zza.zzi());
        }
    }

    @JavascriptInterface
    public void notify(final String str) {
        if (TextUtils.isEmpty(str)) {
            int i10 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzj("URL is empty, ignoring message");
            return;
        }
        com.google.android.gms.ads.internal.util.zzs.zza.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzceu
            @Override // java.lang.Runnable
            public final void run() {
                zzcew.zza(zzcew.this, str);
            }
        });
    }
}
