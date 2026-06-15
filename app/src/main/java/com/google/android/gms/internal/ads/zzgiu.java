package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Arrays;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzgiu implements zzgbv {
    private final zzgbv zza;
    private final byte[] zzb;

    private zzgiu(zzgbv zzgbvVar, byte[] bArr) {
        this.zza = zzgbvVar;
        int length = bArr.length;
        if (length != 0 && length != 5) {
            throw new IllegalArgumentException("identifier has an invalid length");
        }
        this.zzb = bArr;
    }

    public static zzgbv zzb(zzgke zzgkeVar) throws GeneralSecurityException {
        byte[] zzc;
        zzgmb zza = zzgkeVar.zza(zzgce.zza());
        zzgrb zza2 = zzgre.zza();
        zza2.zzb(zza.zzg());
        zza2.zzc(zza.zze());
        zza2.zza(zza.zzb());
        zzgbv zzgbvVar = (zzgbv) zzgcv.zza((zzgre) zza2.zzbr(), zzgbv.class);
        zzgsi zzc2 = zza.zzc();
        int ordinal = zzc2.ordinal();
        if (ordinal != 1) {
            if (ordinal != 2) {
                if (ordinal == 3) {
                    zzc = zzglf.zza.zzc();
                } else if (ordinal != 4) {
                    throw new GeneralSecurityException("unknown output prefix type ".concat(String.valueOf(zzc2)));
                }
            }
            zzc = zzglf.zza(zzgkeVar.zzb().intValue()).zzc();
        } else {
            zzc = zzglf.zzb(zzgkeVar.zzb().intValue()).zzc();
        }
        return new zzgiu(zzgbvVar, zzc);
    }

    public static zzgbv zzc(zzgbv zzgbvVar, zzguh zzguhVar) {
        return new zzgiu(zzgbvVar, zzguhVar.zzc());
    }

    @Override // com.google.android.gms.internal.ads.zzgbv
    public final byte[] zza(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        byte[] bArr3 = this.zzb;
        if (bArr3.length == 0) {
            return this.zza.zza(bArr, bArr2);
        }
        if (zzgmn.zzc(bArr3, bArr)) {
            return this.zza.zza(Arrays.copyOfRange(bArr, 5, bArr.length), bArr2);
        }
        throw new GeneralSecurityException("wrong prefix");
    }
}
