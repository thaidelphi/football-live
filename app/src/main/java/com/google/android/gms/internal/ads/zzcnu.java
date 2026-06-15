package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.Set;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzcnu implements zzhdk {
    private final zzcnl zza;
    private final zzhdt zzb;

    public zzcnu(zzcnl zzcnlVar, zzhdt zzhdtVar) {
        this.zza = zzcnlVar;
        this.zzb = zzhdtVar;
    }

    public static Set zza(zzcnl zzcnlVar, zzcpa zzcpaVar) {
        Set singleton = Collections.singleton(new zzdbw(zzcpaVar, zzbyp.zzg));
        zzhds.zzb(singleton);
        return singleton;
    }

    @Override // com.google.android.gms.internal.ads.zzheb, com.google.android.gms.internal.ads.zzhea
    public final /* bridge */ /* synthetic */ Object zzb() {
        return zza(this.zza, (zzcpa) this.zzb.zzb());
    }
}
