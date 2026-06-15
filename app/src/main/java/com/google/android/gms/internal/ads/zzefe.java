package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Clock;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzefe {
    private zzeev zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzefe() {
    }

    private zzefe(zzeev zzeevVar) {
        this.zza = zzeevVar;
    }

    public static zzefe zzb(zzeev zzeevVar) {
        return new zzefe(zzeevVar);
    }

    public final zzeev zza(Clock clock, zzeex zzeexVar, zzebl zzeblVar, zzfhp zzfhpVar) {
        zzeev zzeevVar = this.zza;
        return zzeevVar != null ? zzeevVar : new zzeev(clock, zzeexVar, zzeblVar, zzfhpVar);
    }
}
