package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzghd extends zzgdj {
    private final zzghj zza;
    private final zzgui zzb;
    private final zzguh zzc;
    private final Integer zzd;

    private zzghd(zzghj zzghjVar, zzgui zzguiVar, zzguh zzguhVar, Integer num) {
        this.zza = zzghjVar;
        this.zzb = zzguiVar;
        this.zzc = zzguhVar;
        this.zzd = num;
    }

    public static zzghd zza(zzghi zzghiVar, zzgui zzguiVar, Integer num) throws GeneralSecurityException {
        zzguh zzb;
        zzghi zzghiVar2 = zzghi.zzc;
        if (zzghiVar != zzghiVar2 && num == null) {
            String obj = zzghiVar.toString();
            throw new GeneralSecurityException("For given Variant " + obj + " the value of idRequirement must be non-null");
        } else if (zzghiVar == zzghiVar2 && num != null) {
            throw new GeneralSecurityException("For given Variant NO_PREFIX the value of idRequirement must be null");
        } else {
            if (zzguiVar.zza() == 32) {
                zzghj zzc = zzghj.zzc(zzghiVar);
                if (zzc.zzb() == zzghiVar2) {
                    zzb = zzglf.zza;
                } else if (zzc.zzb() == zzghi.zzb) {
                    zzb = zzglf.zza(num.intValue());
                } else if (zzc.zzb() == zzghi.zza) {
                    zzb = zzglf.zzb(num.intValue());
                } else {
                    throw new IllegalStateException("Unknown Variant: ".concat(zzc.zzb().toString()));
                }
                return new zzghd(zzc, zzguiVar, zzb, num);
            }
            int zza = zzguiVar.zza();
            throw new GeneralSecurityException("XChaCha20Poly1305 key must be constructed with key of length 32 bytes, not " + zza);
        }
    }

    public final zzghj zzb() {
        return this.zza;
    }

    public final zzguh zzc() {
        return this.zzc;
    }

    public final zzgui zzd() {
        return this.zzb;
    }

    public final Integer zze() {
        return this.zzd;
    }
}
