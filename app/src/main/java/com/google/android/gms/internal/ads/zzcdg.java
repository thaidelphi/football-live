package com.google.android.gms.internal.ads;

import java.util.concurrent.atomic.AtomicBoolean;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzcdg {
    private final AtomicBoolean zza = new AtomicBoolean(false);

    public zzcdg(String str) {
    }

    public final void zza() {
        this.zza.set(false);
    }

    public final void zzb() {
        this.zza.set(true);
    }

    public final void zzc() {
        this.zza.set(false);
    }

    public final boolean zzd() {
        return this.zza.get();
    }
}
