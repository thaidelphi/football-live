package com.google.android.gms.internal.ads;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzepf implements zzerv {
    private final boolean zza;

    public zzepf(boolean z10) {
        this.zza = z10;
    }

    @Override // com.google.android.gms.internal.ads.zzerv
    public final /* bridge */ /* synthetic */ void zza(Object obj) {
        ((zzcth) obj).zzb.putBoolean("is_gbid", this.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzerv
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        ((zzcth) obj).zza.putBoolean("is_gbid", this.zza);
    }
}
