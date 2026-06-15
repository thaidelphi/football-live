package com.google.android.gms.internal.ads;

import android.content.Context;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzfx implements zzfq {
    private final Context zza;
    private final zzfq zzb;

    public zzfx(Context context) {
        zzfz zzfzVar = new zzfz();
        this.zza = context.getApplicationContext();
        this.zzb = zzfzVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfq
    public final /* bridge */ /* synthetic */ zzfr zza() {
        return new zzfy(this.zza, this.zzb.zza());
    }
}
