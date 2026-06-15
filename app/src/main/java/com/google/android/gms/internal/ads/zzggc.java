package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzggc extends zzgdj {
    private final zzggh zza;
    private final zzguh zzb;
    private final Integer zzc;

    private zzggc(zzggh zzgghVar, zzguh zzguhVar, Integer num) {
        this.zza = zzgghVar;
        this.zzb = zzguhVar;
        this.zzc = num;
    }

    public static zzggc zza(zzggh zzgghVar, Integer num) throws GeneralSecurityException {
        zzguh zzb;
        if (zzgghVar.zzc() == zzggf.zzb) {
            if (num == null) {
                zzb = zzglf.zza;
            } else {
                throw new GeneralSecurityException("For given Variant NO_PREFIX the value of idRequirement must be null");
            }
        } else if (zzgghVar.zzc() != zzggf.zza) {
            throw new GeneralSecurityException("Unknown Variant: ".concat(String.valueOf(zzgghVar.zzc())));
        } else {
            if (num != null) {
                zzb = zzglf.zzb(num.intValue());
            } else {
                throw new GeneralSecurityException("For given Variant TINK the value of idRequirement must be non-null");
            }
        }
        return new zzggc(zzgghVar, zzb, num);
    }

    public final zzggh zzb() {
        return this.zza;
    }

    public final zzguh zzc() {
        return this.zzb;
    }

    public final Integer zzd() {
        return this.zzc;
    }
}
