package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzgmv {
    private Integer zza = null;
    private Integer zzb = null;
    private zzgmw zzc = zzgmw.zzd;

    private zzgmv() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzgmv(zzgmx zzgmxVar) {
    }

    public final zzgmv zza(int i10) throws GeneralSecurityException {
        if (i10 != 16 && i10 != 32) {
            throw new InvalidAlgorithmParameterException(String.format("Invalid key size %d; only 128-bit and 256-bit AES keys are supported", Integer.valueOf(i10 * 8)));
        }
        this.zza = Integer.valueOf(i10);
        return this;
    }

    public final zzgmv zzb(int i10) throws GeneralSecurityException {
        if (i10 >= 10 && i10 <= 16) {
            this.zzb = Integer.valueOf(i10);
            return this;
        }
        throw new GeneralSecurityException("Invalid tag size for AesCmacParameters: " + i10);
    }

    public final zzgmv zzc(zzgmw zzgmwVar) {
        this.zzc = zzgmwVar;
        return this;
    }

    public final zzgmy zzd() throws GeneralSecurityException {
        Integer num = this.zza;
        if (num != null) {
            if (this.zzb != null) {
                if (this.zzc != null) {
                    return new zzgmy(num.intValue(), this.zzb.intValue(), this.zzc, null);
                }
                throw new GeneralSecurityException("variant not set");
            }
            throw new GeneralSecurityException("tag size not set");
        }
        throw new GeneralSecurityException("key size not set");
    }
}
