package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.Map;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
final class zzbib implements zzbio {
    @Override // com.google.android.gms.internal.ads.zzbio
    public final /* bridge */ /* synthetic */ void zza(Object obj, Map map) {
        zzcdq zzcdqVar = (zzcdq) obj;
        try {
            String str = (String) map.get("enabled");
            zzbio zzbioVar = zzbin.zza;
            if (!zzfsb.zzc(com.ironsource.mediationsdk.metadata.a.f18924g, str) && !zzfsb.zzc("false", str)) {
                return;
            }
            zzfpj.zza(zzcdqVar.getContext()).zzb(Boolean.parseBoolean(str));
        } catch (IOException e8) {
            com.google.android.gms.ads.internal.zzv.zzp().zzw(e8, "DefaultGmsgHandlers.SetPaidv2PersonalizationEnabled");
        }
    }
}
