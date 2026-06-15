package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.HashMap;
import java.util.Map;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzgku {
    public static final /* synthetic */ int zza = 0;
    private static final zzgkt zzb = new zzgkt() { // from class: com.google.android.gms.internal.ads.zzgks
        @Override // com.google.android.gms.internal.ads.zzgkt
        public final zzgcf zza(zzgcs zzgcsVar, Integer num) {
            int i10 = zzgku.zza;
            zzgri zzc2 = ((zzgkf) zzgcsVar).zzb().zzc();
            zzgcg zzb2 = zzgjt.zzc().zzb(zzc2.zzi());
            if (zzgjt.zzc().zze(zzc2.zzi())) {
                zzgre zza2 = zzb2.zza(zzc2.zzh());
                return new zzgke(zzgmb.zza(zza2.zzg(), zza2.zzf(), zza2.zzb(), zzc2.zzg(), num), zzgce.zza());
            }
            throw new GeneralSecurityException("Creating new keys is not allowed.");
        }
    };
    private static final zzgku zzc = zze();
    private final Map zzd = new HashMap();

    public static zzgku zzb() {
        return zzc;
    }

    private final synchronized zzgcf zzd(zzgcs zzgcsVar, Integer num) throws GeneralSecurityException {
        zzgkt zzgktVar;
        zzgktVar = (zzgkt) this.zzd.get(zzgcsVar.getClass());
        if (zzgktVar != null) {
        } else {
            String obj = zzgcsVar.toString();
            throw new GeneralSecurityException("Cannot create a new key for parameters " + obj + ": no key creator for this class was registered.");
        }
        return zzgktVar.zza(zzgcsVar, num);
    }

    private static zzgku zze() {
        zzgku zzgkuVar = new zzgku();
        try {
            zzgkuVar.zzc(zzb, zzgkf.class);
            return zzgkuVar;
        } catch (GeneralSecurityException e8) {
            throw new IllegalStateException("unexpected error.", e8);
        }
    }

    public final zzgcf zza(zzgcs zzgcsVar, Integer num) throws GeneralSecurityException {
        return zzd(zzgcsVar, num);
    }

    public final synchronized void zzc(zzgkt zzgktVar, Class cls) throws GeneralSecurityException {
        zzgkt zzgktVar2 = (zzgkt) this.zzd.get(cls);
        if (zzgktVar2 != null && !zzgktVar2.equals(zzgktVar)) {
            String obj = cls.toString();
            throw new GeneralSecurityException("Different key creator for parameters class " + obj + " already inserted");
        }
        this.zzd.put(cls, zzgktVar);
    }
}
