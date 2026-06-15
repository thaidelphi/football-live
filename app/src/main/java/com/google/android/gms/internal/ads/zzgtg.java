package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.spec.AlgorithmParameterSpec;
import java.util.Objects;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzgtg implements zzgbv {
    private final SecretKey zza;
    private final byte[] zzb;

    private zzgtg(byte[] bArr, zzguh zzguhVar) throws GeneralSecurityException {
        if (zzgjk.zza(2)) {
            this.zza = zzghv.zzc(bArr);
            this.zzb = zzguhVar.zzc();
            return;
        }
        throw new GeneralSecurityException("Can not use AES-GCM in FIPS-mode, as BoringCrypto module is not available.");
    }

    public static zzgbv zzb(zzgen zzgenVar) throws GeneralSecurityException {
        return new zzgtg(zzgenVar.zzd().zzd(zzgce.zza()), zzgenVar.zzc());
    }

    @Override // com.google.android.gms.internal.ads.zzgbv
    public final byte[] zza(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        Objects.requireNonNull(bArr, "ciphertext is null");
        byte[] bArr3 = this.zzb;
        int length = bArr.length;
        if (length >= bArr3.length + 28) {
            if (zzgmn.zzc(bArr3, bArr)) {
                AlgorithmParameterSpec zza = zzghv.zza(bArr, this.zzb.length, 12);
                SecretKey secretKey = this.zza;
                Cipher zzb = zzghv.zzb();
                zzb.init(2, secretKey, zza);
                if (bArr2 != null && bArr2.length != 0) {
                    zzb.updateAAD(bArr2);
                }
                int length2 = this.zzb.length;
                return zzb.doFinal(bArr, length2 + 12, (length - length2) - 12);
            }
            throw new GeneralSecurityException("Decryption failed (OutputPrefix mismatch).");
        }
        throw new GeneralSecurityException("ciphertext too short");
    }
}
