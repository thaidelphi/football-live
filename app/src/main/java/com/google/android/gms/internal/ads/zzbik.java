package com.google.android.gms.internal.ads;

import java.util.Map;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
final class zzbik implements zzbio {
    @Override // com.google.android.gms.internal.ads.zzbio
    public final /* bridge */ /* synthetic */ void zza(Object obj, Map map) {
        zzcdq zzcdqVar = (zzcdq) obj;
        String str = (String) map.get("action");
        if ("pause".equals(str)) {
            zzcdqVar.zzde();
        } else if ("resume".equals(str)) {
            zzcdqVar.zzdf();
        }
    }
}
