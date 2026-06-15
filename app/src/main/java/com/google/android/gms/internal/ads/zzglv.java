package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.HashMap;
import java.util.Map;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzglv {
    private final Map zza;
    private final Map zzb;

    public /* synthetic */ zzglv(zzgls zzglsVar, zzglu zzgluVar) {
        Map map;
        Map map2;
        map = zzglsVar.zza;
        this.zza = new HashMap(map);
        map2 = zzglsVar.zzb;
        this.zzb = new HashMap(map2);
    }

    public static zzgls zza() {
        return new zzgls(null);
    }

    public final Class zzb(Class cls) throws GeneralSecurityException {
        if (this.zzb.containsKey(cls)) {
            return ((zzgma) this.zzb.get(cls)).zza();
        }
        String obj = cls.toString();
        throw new GeneralSecurityException("No input primitive class for " + obj + " available");
    }

    public final Object zzc(zzgcf zzgcfVar, Class cls) throws GeneralSecurityException {
        zzglt zzgltVar = new zzglt(zzgcfVar.getClass(), cls, null);
        if (this.zza.containsKey(zzgltVar)) {
            return ((zzglr) this.zza.get(zzgltVar)).zza(zzgcfVar);
        }
        String obj = zzgltVar.toString();
        throw new GeneralSecurityException("No PrimitiveConstructor for " + obj + " available");
    }

    public final Object zzd(zzglz zzglzVar, Class cls) throws GeneralSecurityException {
        if (this.zzb.containsKey(cls)) {
            zzgma zzgmaVar = (zzgma) this.zzb.get(cls);
            if (zzglzVar.zzd().equals(zzgmaVar.zza()) && zzgmaVar.zza().equals(zzglzVar.zzd())) {
                return zzgmaVar.zzc(zzglzVar);
            }
            throw new GeneralSecurityException("Input primitive type of the wrapper doesn't match the type of primitives in the provided PrimitiveSet");
        }
        throw new GeneralSecurityException("No wrapper found for ".concat(cls.toString()));
    }
}
