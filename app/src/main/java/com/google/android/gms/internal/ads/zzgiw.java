package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.spec.AlgorithmParameterSpec;
import java.util.Arrays;
import java.util.Objects;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzgiw implements zzgbv {
    private final byte[] zza;
    private final int zzb;
    private final zzgor zzc;

    private zzgiw(byte[] bArr, zzguh zzguhVar, int i10) throws GeneralSecurityException {
        this.zzc = new zzgub(bArr);
        this.zza = zzguhVar.zzc();
        this.zzb = i10;
    }

    public static zzgbv zzb(zzggx zzggxVar) throws GeneralSecurityException {
        return new zzgiw(zzggxVar.zzd().zzd(zzgce.zza()), zzggxVar.zzc(), zzggxVar.zzb().zzb());
    }

    @Override // com.google.android.gms.internal.ads.zzgbv
    public final byte[] zza(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        Objects.requireNonNull(bArr, "ciphertext is null");
        byte[] bArr3 = this.zza;
        int i10 = this.zzb;
        int length = bArr.length;
        if (length >= bArr3.length + i10 + 28) {
            if (zzgmn.zzc(bArr3, bArr)) {
                byte[] bArr4 = this.zza;
                int i11 = this.zzb;
                int length2 = bArr4.length;
                int i12 = i11 + length2;
                byte[] copyOfRange = Arrays.copyOfRange(bArr, length2, i12);
                byte[] bArr5 = {0, 1, 88, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
                byte[] bArr6 = {0, 2, 88, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
                int length3 = copyOfRange.length;
                if (length3 <= 12 && length3 >= 8) {
                    System.arraycopy(copyOfRange, 0, bArr5, 4, length3);
                    System.arraycopy(copyOfRange, 0, bArr6, 4, length3);
                    byte[] bArr7 = new byte[32];
                    System.arraycopy(this.zzc.zza(bArr5, 16), 0, bArr7, 0, 16);
                    System.arraycopy(this.zzc.zza(bArr6, 16), 0, bArr7, 16, 16);
                    if (zzgjk.zza(2)) {
                        SecretKey zzc = zzghv.zzc(bArr7);
                        int i13 = i12 + 12;
                        byte[] copyOfRange2 = Arrays.copyOfRange(bArr, i12, i13);
                        if (copyOfRange2.length == 12) {
                            if (length >= i13 + 16) {
                                AlgorithmParameterSpec zza = zzghv.zza(copyOfRange2, 0, 12);
                                Cipher zzb = zzghv.zzb();
                                zzb.init(2, zzc, zza);
                                if (bArr2 != null && bArr2.length != 0) {
                                    zzb.updateAAD(bArr2);
                                }
                                return zzb.doFinal(bArr, i13, length - i13);
                            }
                            throw new GeneralSecurityException("ciphertext too short");
                        }
                        throw new GeneralSecurityException("iv is wrong size");
                    }
                    throw new GeneralSecurityException("Can not use AES-GCM in FIPS-mode, as BoringCrypto module is not available.");
                }
                throw new GeneralSecurityException("invalid salt size");
            }
            throw new GeneralSecurityException("Decryption failed (OutputPrefix mismatch).");
        }
        throw new GeneralSecurityException("ciphertext too short");
    }
}
