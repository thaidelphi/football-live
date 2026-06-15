package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.logging.Level;
import java.util.logging.Logger;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzgjt {
    private static final Logger zza = Logger.getLogger(zzgjt.class.getName());
    private static final zzgjt zzb = new zzgjt();
    private final ConcurrentMap zzc = new ConcurrentHashMap();
    private final ConcurrentMap zzd = new ConcurrentHashMap();

    public static zzgjt zzc() {
        return zzb;
    }

    private final synchronized zzgcg zzg(String str) throws GeneralSecurityException {
        if (this.zzc.containsKey(str)) {
        } else {
            throw new GeneralSecurityException("No key manager found for key type ".concat(String.valueOf(str)));
        }
        return (zzgcg) this.zzc.get(str);
    }

    private final synchronized void zzh(zzgcg zzgcgVar, boolean z10, boolean z11) throws GeneralSecurityException {
        String str = ((zzgkc) zzgcgVar).zza;
        if (this.zzd.containsKey(str) && !((Boolean) this.zzd.get(str)).booleanValue()) {
            throw new GeneralSecurityException("New keys are already disallowed for key type ".concat(str));
        }
        zzgcg zzgcgVar2 = (zzgcg) this.zzc.get(str);
        if (zzgcgVar2 != null && !zzgcgVar2.getClass().equals(zzgcgVar.getClass())) {
            zza.logp(Level.WARNING, "com.google.crypto.tink.internal.KeyManagerRegistry", "insertKeyManager", "Attempted overwrite of a registered key manager for key type ".concat(str));
            throw new GeneralSecurityException(String.format("typeUrl (%s) is already registered with %s, cannot be re-registered with %s", str, zzgcgVar2.getClass().getName(), zzgcgVar.getClass().getName()));
        }
        this.zzc.putIfAbsent(str, zzgcgVar);
        this.zzd.put(str, Boolean.TRUE);
    }

    public final zzgcg zza(String str, Class cls) throws GeneralSecurityException {
        zzgcg zzg = zzg(str);
        if (zzg.zzb().equals(cls)) {
            return zzg;
        }
        String name = cls.getName();
        String valueOf = String.valueOf(zzg.getClass());
        String obj = zzg.zzb().toString();
        throw new GeneralSecurityException("Primitive type " + name + " not supported by key manager of type " + valueOf + ", which only supports: " + obj);
    }

    public final zzgcg zzb(String str) throws GeneralSecurityException {
        return zzg(str);
    }

    public final synchronized void zzd(zzgcg zzgcgVar, boolean z10) throws GeneralSecurityException {
        zzf(zzgcgVar, 1, true);
    }

    public final boolean zze(String str) {
        return ((Boolean) this.zzd.get(str)).booleanValue();
    }

    public final synchronized void zzf(zzgcg zzgcgVar, int i10, boolean z10) throws GeneralSecurityException {
        if (zzgjk.zza(i10)) {
            zzh(zzgcgVar, false, true);
        } else {
            throw new GeneralSecurityException("Cannot register key manager: FIPS compatibility insufficient");
        }
    }
}
