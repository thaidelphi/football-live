package com.google.android.gms.internal.ads;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzepj implements zzerv {
    private final Boolean zza;

    public zzepj(Boolean bool) {
        this.zza = bool;
    }

    @Override // com.google.android.gms.internal.ads.zzerv
    public final /* synthetic */ void zza(Object obj) {
    }

    @Override // com.google.android.gms.internal.ads.zzerv
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        Boolean bool = this.zza;
        zzcth zzcthVar = (zzcth) obj;
        if (bool != null) {
            zzcthVar.zza.putBoolean("hw_accel", bool.booleanValue());
        }
    }
}
