package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Clock;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzejx implements zzerw {
    private final Clock zza;
    private final zzfap zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzejx(Clock clock, zzfap zzfapVar) {
        this.zza = clock;
        this.zzb = zzfapVar;
    }

    @Override // com.google.android.gms.internal.ads.zzerw
    public final int zza() {
        return 4;
    }

    @Override // com.google.android.gms.internal.ads.zzerw
    public final b6.a zzb() {
        return zzgap.zzh(new zzejy(this.zzb, this.zza.a()));
    }
}
