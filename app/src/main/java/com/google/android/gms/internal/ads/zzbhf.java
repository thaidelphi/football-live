package com.google.android.gms.internal.ads;

import java.util.Map;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzbhf implements zzbio {
    private final zzbhg zza;

    public zzbhf(zzbhg zzbhgVar) {
        this.zza = zzbhgVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbio
    public final void zza(Object obj, Map map) {
        String str = (String) map.get("name");
        if (str == null) {
            int i10 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzj("App event with no name parameter.");
            return;
        }
        this.zza.zzb(str, (String) map.get("info"));
    }
}
