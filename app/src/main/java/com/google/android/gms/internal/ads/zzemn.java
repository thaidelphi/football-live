package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Clock;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzemn {
    public final b6.a zza;
    private final long zzb;
    private final Clock zzc;

    public zzemn(b6.a aVar, long j10, Clock clock) {
        this.zza = aVar;
        this.zzc = clock;
        this.zzb = clock.b() + j10;
    }

    public final boolean zza() {
        return this.zzb < this.zzc.b();
    }
}
