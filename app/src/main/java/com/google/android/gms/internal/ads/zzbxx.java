package com.google.android.gms.internal.ads;

import android.os.Bundle;
import com.google.android.gms.common.util.Clock;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzbxx {
    final /* synthetic */ zzbxy zza;
    private long zzb = -1;
    private long zzc = -1;

    public zzbxx(zzbxy zzbxyVar) {
        this.zza = zzbxyVar;
    }

    public final long zza() {
        return this.zzc;
    }

    public final Bundle zzb() {
        Bundle bundle = new Bundle();
        bundle.putLong("topen", this.zzb);
        bundle.putLong("tclose", this.zzc);
        return bundle;
    }

    public final void zzc() {
        Clock clock;
        clock = this.zza.zza;
        this.zzc = clock.b();
    }

    public final void zzd() {
        Clock clock;
        clock = this.zza.zza;
        this.zzb = clock.b();
    }
}
