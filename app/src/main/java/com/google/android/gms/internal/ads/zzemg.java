package com.google.android.gms.internal.ads;

import android.os.Bundle;
import com.ironsource.b9;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzemg implements zzerv {
    private final double zza;
    private final boolean zzb;

    public zzemg(double d10, boolean z10) {
        this.zza = d10;
        this.zzb = z10;
    }

    @Override // com.google.android.gms.internal.ads.zzerv
    public final /* synthetic */ void zza(Object obj) {
    }

    @Override // com.google.android.gms.internal.ads.zzerv
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        Bundle bundle = ((zzcth) obj).zza;
        Bundle zza = zzfbd.zza(bundle, b9.h.G);
        bundle.putBundle(b9.h.G, zza);
        Bundle zza2 = zzfbd.zza(zza, "battery");
        zza.putBundle("battery", zza2);
        zza2.putBoolean("is_charging", this.zzb);
        zza2.putDouble("battery_level", this.zza);
    }
}
