package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.HashMap;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzfcq {
    private final HashMap zza = new HashMap();

    public final zzfcp zza(zzfcg zzfcgVar, Context context, zzfby zzfbyVar, zzfcw zzfcwVar) {
        zzfcp zzfcpVar = (zzfcp) this.zza.get(zzfcgVar);
        if (zzfcpVar == null) {
            zzfcd zzfcdVar = new zzfcd(zzfcj.zza(zzfcgVar, context));
            zzfcp zzfcpVar2 = new zzfcp(zzfcdVar, new zzfcy(zzfcdVar, zzfbyVar, zzfcwVar));
            this.zza.put(zzfcgVar, zzfcpVar2);
            return zzfcpVar2;
        }
        return zzfcpVar;
    }
}
