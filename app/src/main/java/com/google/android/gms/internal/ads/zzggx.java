package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzggx extends zzgdj {
    private final zzghc zza;
    private final zzgui zzb;
    private final zzguh zzc;
    private final Integer zzd;

    private zzggx(zzghc zzghcVar, zzgui zzguiVar, zzguh zzguhVar, Integer num) {
        this.zza = zzghcVar;
        this.zzb = zzguiVar;
        this.zzc = zzguhVar;
        this.zzd = num;
    }

    public static zzggx zza(zzghc zzghcVar, zzgui zzguiVar, Integer num) throws GeneralSecurityException {
        zzguh zzb;
        zzghb zzc = zzghcVar.zzc();
        zzghb zzghbVar = zzghb.zzb;
        if (zzc != zzghbVar && num == null) {
            String obj = zzghcVar.zzc().toString();
            throw new GeneralSecurityException("For given Variant " + obj + " the value of idRequirement must be non-null");
        } else if (zzghcVar.zzc() == zzghbVar && num != null) {
            throw new GeneralSecurityException("For given Variant NO_PREFIX the value of idRequirement must be null");
        } else {
            if (zzguiVar.zza() == 32) {
                if (zzghcVar.zzc() == zzghbVar) {
                    zzb = zzglf.zza;
                } else if (zzghcVar.zzc() == zzghb.zza) {
                    zzb = zzglf.zzb(num.intValue());
                } else {
                    throw new IllegalStateException("Unknown Variant: ".concat(zzghcVar.zzc().toString()));
                }
                return new zzggx(zzghcVar, zzguiVar, zzb, num);
            }
            int zza = zzguiVar.zza();
            throw new GeneralSecurityException("XAesGcmKey key must be constructed with key of length 32 bytes, not " + zza);
        }
    }

    public final zzghc zzb() {
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
