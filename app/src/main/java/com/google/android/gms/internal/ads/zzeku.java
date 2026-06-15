package com.google.android.gms.internal.ads;

import java.util.concurrent.atomic.AtomicBoolean;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzeku {
    private final AtomicBoolean zza = new AtomicBoolean(false);
    private zzekt zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public final zzekt zza() {
        return this.zzb;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zzb(zzekt zzektVar) {
        this.zzb = zzektVar;
    }

    public final void zzc(boolean z10) {
        this.zza.set(true);
    }

    public final boolean zzd() {
        return this.zza.get();
    }
}
