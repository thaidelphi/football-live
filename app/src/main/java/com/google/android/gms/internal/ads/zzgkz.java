package com.google.android.gms.internal.ads;

import java.util.concurrent.atomic.AtomicReference;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzgkz {
    private static final zzgkz zza = new zzgkz();
    private static final zzgkx zzb = new zzgkx(null);
    private final AtomicReference zzc = new AtomicReference();

    public static zzgkz zzb() {
        return zza;
    }

    public final zzgkk zza() {
        zzgkk zzgkkVar = (zzgkk) this.zzc.get();
        return zzgkkVar == null ? zzb : zzgkkVar;
    }
}
