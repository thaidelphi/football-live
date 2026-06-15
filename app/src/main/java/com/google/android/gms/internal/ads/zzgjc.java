package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;
import java.util.Objects;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzgjc implements zzgbv {
    private final byte[] zza;
    private final byte[] zzb;

    private zzgjc(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        if (zzgjk.zza(1)) {
            if (zzc()) {
                if (bArr.length != 32) {
                    throw new InvalidKeyException("The key length in bytes must be 32.");
                }
                this.zza = bArr;
                this.zzb = bArr2;
                return;
            }
            throw new GeneralSecurityException("JCE does not support algorithm: ChaCha20-Poly1305");
        }
        throw new GeneralSecurityException("Can not use ChaCha20Poly1305 in FIPS-mode.");
    }

    public static zzgbv zzb(zzghd zzghdVar) throws GeneralSecurityException {
        return new zzgjc(zzghdVar.zzd().zzd(zzgce.zza()), zzghdVar.zzc().zzc());
    }

    public static boolean zzc() {
        return zzgih.zzc() != null;
    }

    @Override // com.google.android.gms.internal.ads.zzgbv
    public final byte[] zza(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        Objects.requireNonNull(bArr, "ciphertext is null");
        byte[] bArr3 = this.zzb;
        int length = bArr.length;
        if (length >= bArr3.length + 40) {
            if (zzgmn.zzc(bArr3, bArr)) {
                byte[] bArr4 = new byte[24];
                System.arraycopy(bArr, this.zzb.length, bArr4, 0, 24);
                int[] zzd = zzgin.zzd(zzgin.zze(this.zza), zzgin.zze(bArr4));
                ByteBuffer order = ByteBuffer.allocate(zzd.length * 4).order(ByteOrder.LITTLE_ENDIAN);
                order.asIntBuffer().put(zzd);
                SecretKeySpec secretKeySpec = new SecretKeySpec(order.array(), "ChaCha20");
                byte[] bArr5 = new byte[12];
                System.arraycopy(bArr4, 16, bArr5, 4, 8);
                IvParameterSpec ivParameterSpec = new IvParameterSpec(bArr5);
                Cipher zzc = zzgih.zzc();
                zzc.init(2, secretKeySpec, ivParameterSpec);
                if (bArr2 != null && bArr2.length != 0) {
                    zzc.updateAAD(bArr2);
                }
                int length2 = this.zzb.length;
                return zzc.doFinal(bArr, length2 + 24, (length - length2) - 24);
            }
            throw new GeneralSecurityException("Decryption failed (OutputPrefix mismatch).");
        }
        throw new GeneralSecurityException("ciphertext too short");
    }
}
