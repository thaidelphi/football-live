package com.google.android.gms.internal.ads;

import java.util.HashMap;
import java.util.Map;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
@Deprecated
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzbbz {
    private final Map zza = new HashMap();
    private final zzbcb zzb;

    public zzbbz(zzbcb zzbcbVar) {
        this.zzb = zzbcbVar;
    }

    public final zzbcb zza() {
        return this.zzb;
    }

    public final void zzb(String str, zzbby zzbbyVar) {
        this.zza.put(str, zzbbyVar);
    }

    public final void zzc(String str, String str2, long j10) {
        zzbby zzbbyVar = (zzbby) this.zza.get(str2);
        String[] strArr = {str};
        if (zzbbyVar != null) {
            this.zzb.zze(zzbbyVar, j10, strArr);
        }
        this.zza.put(str, new zzbby(j10, null, null));
    }
}
