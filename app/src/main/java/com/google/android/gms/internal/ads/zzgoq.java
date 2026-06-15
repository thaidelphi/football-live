package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzgoq implements zzgcr {
    private zzgoq(zzgcr zzgcrVar, zzgsi zzgsiVar, byte[] bArr) {
    }

    public static zzgcr zza(zzgke zzgkeVar) throws GeneralSecurityException {
        byte[] zzc;
        zzgmb zza = zzgkeVar.zza(zzgce.zza());
        zzgrb zza2 = zzgre.zza();
        zza2.zzb(zza.zzg());
        zza2.zzc(zza.zze());
        zza2.zza(zza.zzb());
        zzgcr zzgcrVar = (zzgcr) zzgcv.zza((zzgre) zza2.zzbr(), zzgcr.class);
        zzgsi zzc2 = zza.zzc();
        int ordinal = zzc2.ordinal();
        if (ordinal != 1) {
            if (ordinal != 2) {
                if (ordinal == 3) {
                    zzc = zzglf.zza.zzc();
                } else if (ordinal != 4) {
                    throw new GeneralSecurityException("unknown output prefix type");
                }
            }
            zzc = zzglf.zza(zzgkeVar.zzb().intValue()).zzc();
        } else {
            zzc = zzglf.zzb(zzgkeVar.zzb().intValue()).zzc();
        }
        return new zzgoq(zzgcrVar, zzc2, zzc);
    }
}
