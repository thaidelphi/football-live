package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.webkit.WebView;
import c1.d;
import c1.h;
import org.json.JSONException;
import org.json.JSONObject;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzfjf implements h.b {
    final /* synthetic */ zzfjg zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzfjf(zzfjg zzfjgVar) {
        this.zza = zzfjgVar;
    }

    @Override // c1.h.b
    public final void onPostMessage(WebView webView, d dVar, Uri uri, boolean z10, c1.a aVar) {
        try {
            JSONObject jSONObject = new JSONObject(dVar.b());
            String string = jSONObject.getString("method");
            String string2 = jSONObject.getJSONObject("data").getString("adSessionId");
            if (!string.equals("startSession")) {
                if (!string.equals("finishSession")) {
                    zzfis.zza.booleanValue();
                    return;
                } else {
                    zzfjg.zzc(this.zza, string2);
                    return;
                }
            }
            zzfjg.zze(this.zza, string2);
        } catch (JSONException e8) {
            zzfkn.zza("Error parsing JS message in JavaScriptSessionService.", e8);
        }
    }
}
