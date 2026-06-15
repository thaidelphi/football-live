package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.Map;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzbjg implements zzbio {
    private final zzbjf zza;

    public zzbjg(zzbjf zzbjfVar) {
        this.zza = zzbjfVar;
    }

    public static void zzb(zzcdq zzcdqVar, zzbjf zzbjfVar) {
        zzcdqVar.zzag("/reward", new zzbjg(zzbjfVar));
    }

    @Override // com.google.android.gms.internal.ads.zzbio
    public final void zza(Object obj, Map map) {
        String str = (String) map.get("action");
        if ("grant".equals(str)) {
            zzbvb zzbvbVar = null;
            try {
                int parseInt = Integer.parseInt((String) map.get("amount"));
                String str2 = (String) map.get("type");
                if (!TextUtils.isEmpty(str2)) {
                    zzbvbVar = new zzbvb(str2, parseInt);
                }
            } catch (NumberFormatException e8) {
                int i10 = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzk("Unable to parse reward amount.", e8);
            }
            this.zza.zza(zzbvbVar);
        } else if ("video_start".equals(str)) {
            this.zza.zzc();
        } else if ("video_complete".equals(str)) {
            this.zza.zzb();
        }
    }
}
