package com.google.android.gms.ads.nonagon.signalgeneration;

import android.webkit.WebView;
import com.google.android.gms.ads.query.QueryInfo;
import com.google.android.gms.ads.query.QueryInfoGenerationCallback;
import com.google.android.gms.internal.ads.zzbcw;
import com.google.android.gms.internal.ads.zzbdr;
import com.google.android.gms.internal.ads.zzgba;
import java.util.Locale;
import org.json.JSONException;
import org.json.JSONObject;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class zzbu extends QueryInfoGenerationCallback {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ String f11779a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ TaggingLibraryJsInterface f11780b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzbu(TaggingLibraryJsInterface taggingLibraryJsInterface, String str) {
        this.f11779a = str;
        this.f11780b = taggingLibraryJsInterface;
    }

    @Override // com.google.android.gms.ads.query.QueryInfoGenerationCallback
    public final void onFailure(String str) {
        String str2;
        zzgba zzgbaVar;
        zzj zzjVar;
        WebView webView;
        zzf zzfVar;
        int i10 = com.google.android.gms.ads.internal.util.zze.zza;
        com.google.android.gms.ads.internal.util.client.zzo.zzj("Failed to generate query info for the tagging library, error: ".concat(String.valueOf(str)));
        if (((Boolean) zzbdr.zza.zze()).booleanValue()) {
            zzfVar = this.f11780b.f11687k;
            str2 = ",\"as\":".concat(zzfVar.zza().toString());
        } else {
            str2 = "";
        }
        String str3 = this.f11779a;
        Locale locale = Locale.getDefault();
        Object[] objArr = new Object[4];
        objArr[0] = str3;
        objArr[1] = str;
        zzbcw zzbcwVar = zzbdr.zzc;
        objArr[2] = Long.valueOf(((Boolean) zzbcwVar.zze()).booleanValue() ? ((Long) zzbdr.zzf.zze()).longValue() : 0L);
        objArr[3] = str2;
        final String format = String.format(locale, "window.postMessage({\"paw_id\":\"%1$s\",\"error\":\"%2$s\",\"sdk_ttl_ms\":%3$d%4$s}, '*');", objArr);
        if (((Boolean) zzbcwVar.zze()).booleanValue()) {
            try {
                zzgbaVar = this.f11780b.f11684h;
                zzgbaVar.execute(new Runnable() { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzbs
                    @Override // java.lang.Runnable
                    public final void run() {
                        WebView webView2;
                        webView2 = zzbu.this.f11780b.f11678b;
                        webView2.evaluateJavascript(format, null);
                    }
                });
            } catch (RuntimeException e8) {
                com.google.android.gms.ads.internal.zzv.zzp().zzv(e8, "TaggingLibraryJsInterface.getQueryInfo.onFailure");
            }
        } else {
            webView = this.f11780b.f11678b;
            webView.evaluateJavascript(format, null);
        }
        if (((Boolean) zzbdr.zza.zze()).booleanValue() && ((Boolean) zzbdr.zzb.zze()).booleanValue()) {
            zzjVar = this.f11780b.f11688l;
            zzjVar.zzb();
        }
    }

    @Override // com.google.android.gms.ads.query.QueryInfoGenerationCallback
    public final void onSuccess(QueryInfo queryInfo) {
        String str;
        final String format;
        zzf zzfVar;
        zzgba zzgbaVar;
        zzj zzjVar;
        WebView webView;
        zzf zzfVar2;
        String query = queryInfo.getQuery();
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("paw_id", this.f11779a);
            jSONObject.put("signal", query);
            jSONObject.put("sdk_ttl_ms", ((Boolean) zzbdr.zzc.zze()).booleanValue() ? ((Long) zzbdr.zzf.zze()).longValue() : 0L);
            if (((Boolean) zzbdr.zza.zze()).booleanValue()) {
                zzfVar2 = this.f11780b.f11687k;
                jSONObject.put("as", zzfVar2.zza());
            }
            format = String.format(Locale.getDefault(), "window.postMessage(%1$s, '*');", jSONObject);
        } catch (JSONException unused) {
            if (((Boolean) zzbdr.zza.zze()).booleanValue()) {
                zzfVar = this.f11780b.f11687k;
                str = ",\"as\":".concat(zzfVar.zza().toString());
            } else {
                str = "";
            }
            String str2 = this.f11779a;
            Locale locale = Locale.getDefault();
            Object[] objArr = new Object[4];
            objArr[0] = str2;
            objArr[1] = queryInfo.getQuery();
            objArr[2] = Long.valueOf(((Boolean) zzbdr.zzc.zze()).booleanValue() ? ((Long) zzbdr.zzf.zze()).longValue() : 0L);
            objArr[3] = str;
            format = String.format(locale, "window.postMessage({\"paw_id\":\"%1$s\",\"signal\":\"%2$s\",\"sdk_ttl_ms\":%3$d%4$s}, '*');", objArr);
        }
        if (((Boolean) zzbdr.zzc.zze()).booleanValue()) {
            try {
                zzgbaVar = this.f11780b.f11684h;
                zzgbaVar.execute(new Runnable() { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzbt
                    @Override // java.lang.Runnable
                    public final void run() {
                        WebView webView2;
                        webView2 = zzbu.this.f11780b.f11678b;
                        webView2.evaluateJavascript(format, null);
                    }
                });
            } catch (RuntimeException e8) {
                com.google.android.gms.ads.internal.zzv.zzp().zzv(e8, "TaggingLibraryJsInterface.getQueryInfo.onSuccess");
            }
        } else {
            webView = this.f11780b.f11678b;
            webView.evaluateJavascript(format, null);
        }
        if (((Boolean) zzbdr.zza.zze()).booleanValue() && ((Boolean) zzbdr.zzb.zze()).booleanValue()) {
            zzjVar = this.f11780b.f11688l;
            zzjVar.zzb();
        }
    }
}
