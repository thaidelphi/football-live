package com.google.android.gms.internal.ads;

import com.google.android.gms.common.internal.Preconditions;
import java.util.Map;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzbji implements zzbio {
    private final zzdte zza;

    public zzbji(zzdte zzdteVar) {
        Preconditions.n(zzdteVar, "The Inspector Manager must not be null");
        this.zza = zzdteVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbio
    public final void zza(Object obj, Map map) {
        if (map == null || !map.containsKey("extras")) {
            return;
        }
        long j10 = Long.MAX_VALUE;
        if (map.containsKey("expires")) {
            try {
                j10 = Long.parseLong((String) map.get("expires"));
            } catch (NumberFormatException unused) {
            }
        }
        this.zza.zzi((String) map.get("extras"), j10);
    }
}
