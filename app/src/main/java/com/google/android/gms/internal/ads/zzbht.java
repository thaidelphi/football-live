package com.google.android.gms.internal.ads;

import java.util.Map;
import org.json.JSONObject;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
final class zzbht implements zzbio {
    @Override // com.google.android.gms.internal.ads.zzbio
    public final /* bridge */ /* synthetic */ void zza(Object obj, Map map) {
        JSONObject zza;
        zzcdq zzcdqVar = (zzcdq) obj;
        zzbem zzK = zzcdqVar.zzK();
        if (zzK != null && (zza = zzK.zza()) != null) {
            zzcdqVar.zze("nativeAdViewSignalsReady", zza);
        } else {
            zzcdqVar.zze("nativeAdViewSignalsReady", new JSONObject());
        }
    }
}
