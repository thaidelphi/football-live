package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzgfd {
    private Integer zza = null;
    private zzgfe zzb = zzgfe.zzc;

    private zzgfd() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzgfd(zzgff zzgffVar) {
    }

    public final zzgfd zza(int i10) throws GeneralSecurityException {
        if (i10 != 16 && i10 != 32) {
            throw new InvalidAlgorithmParameterException(String.format("Invalid key size %d; only 16-byte and 32-byte AES keys are supported", Integer.valueOf(i10)));
        }
        this.zza = Integer.valueOf(i10);
        return this;
    }

    public final zzgfd zzb(zzgfe zzgfeVar) {
        this.zzb = zzgfeVar;
        return this;
    }

    public final zzgfg zzc() throws GeneralSecurityException {
        Integer num = this.zza;
        if (num != null) {
            if (this.zzb != null) {
                return new zzgfg(num.intValue(), this.zzb, null);
            }
            throw new GeneralSecurityException("Variant is not set");
        }
        throw new GeneralSecurityException("Key size is not set");
    }
}
