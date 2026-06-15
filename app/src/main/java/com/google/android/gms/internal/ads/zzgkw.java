package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.HashMap;
import java.util.Map;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzgkw {
    private static final zzgkw zza = new zzgkw();
    private final Map zzb = new HashMap();

    public static zzgkw zza() {
        return zza;
    }

    public final synchronized void zzb(zzgkv zzgkvVar, Class cls) throws GeneralSecurityException {
        zzgkv zzgkvVar2 = (zzgkv) this.zzb.get(cls);
        if (zzgkvVar2 != null && !zzgkvVar2.equals(zzgkvVar)) {
            throw new GeneralSecurityException("Different key creator for parameters class already inserted");
        }
        this.zzb.put(cls, zzgkvVar);
    }
}
