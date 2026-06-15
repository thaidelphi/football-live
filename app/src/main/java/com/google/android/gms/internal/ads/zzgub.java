package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.util.Arrays;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzgub implements zzgor {
    private static final ThreadLocal zza = new zzgua();
    private final SecretKey zzb;
    private final byte[] zzc;
    private final byte[] zzd;

    public zzgub(byte[] bArr) throws GeneralSecurityException {
        zzguf.zza(bArr.length);
        SecretKeySpec secretKeySpec = new SecretKeySpec(bArr, "AES");
        this.zzb = secretKeySpec;
        Cipher zzb = zzb();
        zzb.init(1, secretKeySpec);
        byte[] zza2 = zzgoi.zza(zzb.doFinal(new byte[16]));
        this.zzc = zza2;
        this.zzd = zzgoi.zza(zza2);
    }

    private static Cipher zzb() throws GeneralSecurityException {
        if (zzgjk.zza(1)) {
            return (Cipher) zza.get();
        }
        throw new GeneralSecurityException("Can not use AES-CMAC in FIPS-mode.");
    }

    private static void zzc(byte[] bArr, byte[] bArr2, int i10, byte[] bArr3) {
        for (int i11 = 0; i11 < 16; i11++) {
            bArr3[i11] = (byte) (bArr[i11] ^ bArr2[i11 + i10]);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgor
    public final byte[] zza(byte[] bArr, int i10) throws GeneralSecurityException {
        byte[] zzc;
        if (i10 <= 16) {
            SecretKey secretKey = this.zzb;
            Cipher zzb = zzb();
            zzb.init(1, secretKey);
            int length = bArr.length;
            int i11 = length != 0 ? 1 + ((length - 1) >> 4) : 1;
            int i12 = i11 - 1;
            int i13 = i12 * 16;
            if (i11 * 16 == length) {
                zzc = zzgth.zzc(bArr, i13, this.zzc, 0, 16);
            } else {
                byte[] copyOfRange = Arrays.copyOfRange(bArr, i13, length);
                int length2 = copyOfRange.length;
                if (length2 < 16) {
                    byte[] copyOf = Arrays.copyOf(copyOfRange, 16);
                    copyOf[length2] = Byte.MIN_VALUE;
                    byte[] bArr2 = this.zzd;
                    if (copyOf.length == 16) {
                        zzc = zzgth.zzc(copyOf, 0, bArr2, 0, 16);
                    } else {
                        throw new IllegalArgumentException("The lengths of x and y should match.");
                    }
                } else {
                    throw new IllegalArgumentException("x must be smaller than a block.");
                }
            }
            byte[] bArr3 = new byte[16];
            byte[] bArr4 = new byte[16];
            for (int i14 = 0; i14 < i12; i14++) {
                zzc(bArr3, bArr, i14 * 16, bArr4);
                if (zzb.doFinal(bArr4, 0, 16, bArr3) != 16) {
                    throw new IllegalStateException("Cipher didn't write full block");
                }
            }
            zzc(bArr3, zzc, 0, bArr4);
            if (zzb.doFinal(bArr4, 0, 16, bArr3) == 16) {
                return i10 == 16 ? bArr3 : Arrays.copyOf(bArr3, i10);
            }
            throw new IllegalStateException("Cipher didn't write full block");
        }
        throw new InvalidAlgorithmParameterException("outputLength too large, max is 16 bytes");
    }
}
