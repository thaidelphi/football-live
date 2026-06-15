package com.google.android.gms.internal.ads;

import android.view.View;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzfjt {
    private final zzflh zza;
    private final String zzb;
    private final zzfjc zzc;
    private final String zzd = "Ad overlay";

    public zzfjt(View view, zzfjc zzfjcVar, String str) {
        this.zza = new zzflh(view);
        this.zzb = view.getClass().getCanonicalName();
        this.zzc = zzfjcVar;
    }

    public final zzfjc zza() {
        return this.zzc;
    }

    public final zzflh zzb() {
        return this.zza;
    }

    public final String zzc() {
        return this.zzd;
    }

    public final String zzd() {
        return this.zzb;
    }
}
