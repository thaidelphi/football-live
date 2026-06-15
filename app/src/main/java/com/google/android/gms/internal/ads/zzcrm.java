package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Clock;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzcrm implements zzczs, zzcvt {
    private final Clock zza;
    private final zzcro zzb;
    private final zzfap zzc;
    private final String zzd;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzcrm(Clock clock, zzcro zzcroVar, zzfap zzfapVar, String str) {
        this.zza = clock;
        this.zzb = zzcroVar;
        this.zzc = zzfapVar;
        this.zzd = str;
    }

    @Override // com.google.android.gms.internal.ads.zzczs
    public final void zza() {
        this.zzb.zze(this.zzd, this.zza.b());
    }

    @Override // com.google.android.gms.internal.ads.zzcvt
    public final void zzs() {
        Clock clock = this.zza;
        this.zzb.zzd(this.zzc.zzf, this.zzd, clock.b());
    }
}
