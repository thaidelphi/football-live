package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.concurrent.atomic.AtomicReference;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzglb {
    private static final zzglb zza = new zzglb();
    private final AtomicReference zzb = new AtomicReference(new zzglv(new zzgls(null), null));

    zzglb() {
    }

    public static zzglb zza() {
        return zza;
    }

    public final Object zzb(zzgcf zzgcfVar, Class cls) throws GeneralSecurityException {
        return ((zzglv) this.zzb.get()).zzc(zzgcfVar, cls);
    }

    public final synchronized void zzc(zzglr zzglrVar) throws GeneralSecurityException {
        zzgls zzglsVar = new zzgls((zzglv) this.zzb.get(), null);
        zzglsVar.zza(zzglrVar);
        this.zzb.set(new zzglv(zzglsVar, null));
    }

    public final synchronized void zzd(zzgma zzgmaVar) throws GeneralSecurityException {
        zzgls zzglsVar = new zzgls((zzglv) this.zzb.get(), null);
        zzglsVar.zzb(zzgmaVar);
        this.zzb.set(new zzglv(zzglsVar, null));
    }
}
