package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzgfh extends zzgdj {
    private final zzgfm zza;
    private final zzgui zzb;
    private final zzguh zzc;
    private final Integer zzd;

    private zzgfh(zzgfm zzgfmVar, zzgui zzguiVar, zzguh zzguhVar, Integer num) {
        this.zza = zzgfmVar;
        this.zzb = zzguiVar;
        this.zzc = zzguhVar;
        this.zzd = num;
    }

    public static zzgfh zza(zzgfl zzgflVar, zzgui zzguiVar, Integer num) throws GeneralSecurityException {
        zzguh zzb;
        zzgfl zzgflVar2 = zzgfl.zzc;
        if (zzgflVar != zzgflVar2 && num == null) {
            String obj = zzgflVar.toString();
            throw new GeneralSecurityException("For given Variant " + obj + " the value of idRequirement must be non-null");
        } else if (zzgflVar == zzgflVar2 && num != null) {
            throw new GeneralSecurityException("For given Variant NO_PREFIX the value of idRequirement must be null");
        } else {
            if (zzguiVar.zza() == 32) {
                zzgfm zzc = zzgfm.zzc(zzgflVar);
                if (zzc.zzb() == zzgflVar2) {
                    zzb = zzglf.zza;
                } else if (zzc.zzb() == zzgfl.zzb) {
                    zzb = zzglf.zza(num.intValue());
                } else if (zzc.zzb() == zzgfl.zza) {
                    zzb = zzglf.zzb(num.intValue());
                } else {
                    throw new IllegalStateException("Unknown Variant: ".concat(zzc.zzb().toString()));
                }
                return new zzgfh(zzc, zzguiVar, zzb, num);
            }
            int zza = zzguiVar.zza();
            throw new GeneralSecurityException("ChaCha20Poly1305 key must be constructed with key of length 32 bytes, not " + zza);
        }
    }

    public final zzgfm zzb() {
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
