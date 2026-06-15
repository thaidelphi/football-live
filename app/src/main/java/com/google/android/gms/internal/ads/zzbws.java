package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.common.util.Clock;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzbws {
    private final Clock zza;
    private final zzbwq zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzbws(Clock clock, zzbwq zzbwqVar) {
        this.zza = clock;
        this.zzb = zzbwqVar;
    }

    public static zzbws zza(Context context) {
        return zzbxc.zzd(context).zzb();
    }

    public final void zzb(int i10, long j10) {
        this.zzb.zza(i10, j10);
    }

    public final void zzc(com.google.android.gms.ads.internal.client.zzfs zzfsVar) {
        this.zzb.zza(-1, this.zza.a());
    }

    public final void zzd() {
        this.zzb.zza(-1, this.zza.a());
    }
}
