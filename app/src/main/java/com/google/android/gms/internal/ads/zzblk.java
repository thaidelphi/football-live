package com.google.android.gms.internal.ads;

import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final /* synthetic */ class zzblk {
    public static void zza(zzbll zzbllVar, String str, Map map) {
        try {
            zzbllVar.zze(str, com.google.android.gms.ads.internal.client.zzbb.zzb().zzk(map));
        } catch (JSONException unused) {
            int i10 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzj("Could not convert parameters to JSON.");
        }
    }

    public static void zzb(zzbll zzbllVar, String str, JSONObject jSONObject) {
        String jSONObject2 = jSONObject.toString();
        StringBuilder sb = new StringBuilder();
        sb.append("(window.AFMA_ReceiveMessage || function() {})('");
        sb.append(str);
        sb.append("',");
        sb.append(jSONObject2);
        sb.append(");");
        String sb2 = sb.toString();
        int i10 = com.google.android.gms.ads.internal.util.zze.zza;
        com.google.android.gms.ads.internal.util.client.zzo.zze("Dispatching AFMA event: ".concat(sb2));
        zzbllVar.zza(sb.toString());
    }

    public static void zzc(zzbll zzbllVar, String str, String str2) {
        zzbllVar.zza(str + "(" + str2 + ");");
    }

    public static void zzd(zzbll zzbllVar, String str, JSONObject jSONObject) {
        zzbllVar.zzb(str, jSONObject.toString());
    }
}
