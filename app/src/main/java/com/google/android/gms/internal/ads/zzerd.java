package com.google.android.gms.internal.ads;

import android.os.Bundle;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzerd implements zzerv {
    private final String zza;
    private final Bundle zzb;

    public zzerd(String str, Bundle bundle) {
        this.zza = str;
        this.zzb = bundle;
    }

    @Override // com.google.android.gms.internal.ads.zzerv
    public final /* synthetic */ void zza(Object obj) {
    }

    @Override // com.google.android.gms.internal.ads.zzerv
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        zzcth zzcthVar = (zzcth) obj;
        zzcthVar.zza.putString("rtb", this.zza);
        if (this.zzb.isEmpty()) {
            return;
        }
        zzcthVar.zza.putBundle("adapter_initialization_status", this.zzb);
    }
}
