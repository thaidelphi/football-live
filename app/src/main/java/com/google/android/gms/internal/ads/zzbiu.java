package com.google.android.gms.internal.ads;

import android.content.Context;
import com.ironsource.b9;
import java.util.Map;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzbiu implements zzbio {
    private final Context zza;
    private final Map zzb;

    public zzbiu(Context context, Map map) {
        this.zza = context;
        this.zzb = map;
    }

    @Override // com.google.android.gms.internal.ads.zzbio
    public final void zza(Object obj, Map map) {
        char c10;
        if (com.google.android.gms.ads.internal.zzv.zzo().zzp(this.zza)) {
            String str = (String) map.get(b9.h.f16657j0);
            String str2 = (String) map.get("eventId");
            int hashCode = str.hashCode();
            if (hashCode == 94399) {
                if (str.equals("_aa")) {
                    c10 = 2;
                }
                c10 = 65535;
            } else if (hashCode != 94401) {
                if (hashCode == 94407 && str.equals("_ai")) {
                    c10 = 1;
                }
                c10 = 65535;
            } else {
                if (str.equals("_ac")) {
                    c10 = 0;
                }
                c10 = 65535;
            }
            if (c10 == 0) {
                com.google.android.gms.ads.internal.zzv.zzo().zzj(this.zza, str2, (Map) this.zzb.get("_ac"));
            } else if (c10 == 1) {
                com.google.android.gms.ads.internal.zzv.zzo().zzk(this.zza, str2, (Map) this.zzb.get("_ai"));
            } else if (c10 != 2) {
                int i10 = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzg("logScionEvent gmsg contained unsupported eventName");
            } else {
                com.google.android.gms.ads.internal.zzv.zzo().zzh(this.zza, str2);
            }
        }
    }
}
