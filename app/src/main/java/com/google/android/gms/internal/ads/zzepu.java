package com.google.android.gms.internal.ads;

import android.os.Bundle;
import com.ironsource.b9;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzepu implements zzerv {
    public final Bundle zza;

    public zzepu(Bundle bundle) {
        this.zza = bundle;
    }

    @Override // com.google.android.gms.internal.ads.zzerv
    public final /* synthetic */ void zza(Object obj) {
    }

    @Override // com.google.android.gms.internal.ads.zzerv
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        Bundle bundle = ((zzcth) obj).zza;
        Bundle zza = zzfbd.zza(bundle, b9.h.G);
        zza.putBundle("android_mem_info", this.zza);
        bundle.putBundle(b9.h.G, zza);
    }
}
