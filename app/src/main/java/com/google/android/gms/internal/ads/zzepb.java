package com.google.android.gms.internal.ads;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzepb implements zzerv {
    private final Integer zza;

    public zzepb(Integer num) {
        this.zza = num;
    }

    @Override // com.google.android.gms.internal.ads.zzerv
    public final /* synthetic */ void zza(Object obj) {
    }

    @Override // com.google.android.gms.internal.ads.zzerv
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        Integer num = this.zza;
        zzcth zzcthVar = (zzcth) obj;
        if (num != null) {
            zzcthVar.zza.putInt("dspct", Math.min(num.intValue(), 20));
        }
    }
}
