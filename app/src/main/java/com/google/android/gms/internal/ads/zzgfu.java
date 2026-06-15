package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzgfu extends zzgdj {
    private final zzgfw zza;
    private final zzguh zzb;
    private final Integer zzc;

    private zzgfu(zzgfw zzgfwVar, zzguh zzguhVar, Integer num) {
        this.zza = zzgfwVar;
        this.zzb = zzguhVar;
        this.zzc = num;
    }

    public static zzgfu zza(zzgfw zzgfwVar, Integer num) throws GeneralSecurityException {
        zzguh zzb;
        if (zzgfwVar.zzb() == zzgfv.zza) {
            if (num != null) {
                zzb = zzguh.zzb(ByteBuffer.allocate(5).put((byte) 1).putInt(num.intValue()).array());
            } else {
                throw new GeneralSecurityException("For given Variant TINK the value of idRequirement must be non-null");
            }
        } else if (zzgfwVar.zzb() != zzgfv.zzb) {
            throw new GeneralSecurityException("Unknown Variant: ".concat(zzgfwVar.zzb().toString()));
        } else {
            if (num == null) {
                zzb = zzguh.zzb(new byte[0]);
            } else {
                throw new GeneralSecurityException("For given Variant NO_PREFIX the value of idRequirement must be null");
            }
        }
        return new zzgfu(zzgfwVar, zzb, num);
    }

    public final zzgfw zzb() {
        return this.zza;
    }

    public final zzguh zzc() {
        return this.zzb;
    }

    public final Integer zzd() {
        return this.zzc;
    }
}
