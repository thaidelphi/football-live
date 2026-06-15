package com.google.android.gms.internal.ads;

import java.util.Map;
import org.json.JSONObject;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
final class zzbhu implements zzbio {
    @Override // com.google.android.gms.internal.ads.zzbio
    public final /* bridge */ /* synthetic */ void zza(Object obj, Map map) {
        JSONObject zzb;
        zzcdq zzcdqVar = (zzcdq) obj;
        zzbem zzK = zzcdqVar.zzK();
        if (zzK != null && (zzb = zzK.zzb()) != null) {
            zzcdqVar.zze("nativeClickMetaReady", zzb);
        } else {
            zzcdqVar.zze("nativeClickMetaReady", new JSONObject());
        }
    }
}
