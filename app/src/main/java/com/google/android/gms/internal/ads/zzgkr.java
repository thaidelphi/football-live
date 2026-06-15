package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.List;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzgkr {
    public static final zzgkj zza = new zzgkp(null);

    public static zzgko zza(zzglz zzglzVar) {
        zzgch zzgchVar;
        zzgkl zzgklVar = new zzgkl();
        zzgklVar.zzb(zzglzVar.zza());
        for (List<zzglx> list : zzglzVar.zze()) {
            for (zzglx zzglxVar : list) {
                int zzf = zzglxVar.zzf() - 2;
                if (zzf == 1) {
                    zzgchVar = zzgch.zza;
                } else if (zzf == 2) {
                    zzgchVar = zzgch.zzb;
                } else if (zzf == 3) {
                    zzgchVar = zzgch.zzc;
                } else {
                    throw new IllegalStateException("Unknown key status");
                }
                int zza2 = zzglxVar.zza();
                String zze = zzglxVar.zze();
                if (zze.startsWith("type.googleapis.com/google.crypto.")) {
                    zze = zze.substring(34);
                }
                zzgklVar.zza(zzgchVar, zza2, zze, zzglxVar.zzb().name());
            }
        }
        if (zzglzVar.zzc() != null) {
            zzgklVar.zzc(zzglzVar.zzc().zza());
        }
        try {
            return zzgklVar.zzd();
        } catch (GeneralSecurityException e8) {
            throw new IllegalStateException(e8);
        }
    }
}
