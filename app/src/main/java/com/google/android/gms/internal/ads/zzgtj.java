package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.security.MessageDigest;
import java.util.Arrays;
import javax.crypto.spec.SecretKeySpec;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzgtj implements zzgbv {
    private final zzgtz zza;
    private final zzgcr zzb;
    private final int zzc;
    private final byte[] zzd;

    private zzgtj(zzgtz zzgtzVar, zzgcr zzgcrVar, int i10, byte[] bArr) {
        this.zza = zzgtzVar;
        this.zzb = zzgcrVar;
        this.zzc = i10;
        this.zzd = bArr;
    }

    public static zzgbv zzb(zzgdr zzgdrVar) throws GeneralSecurityException {
        zzgtc zzgtcVar = new zzgtc(zzgdrVar.zzd().zzd(zzgce.zza()), zzgdrVar.zzb().zzd());
        String valueOf = String.valueOf(zzgdrVar.zzb().zzg());
        return new zzgtj(zzgtcVar, new zzgue(new zzgud("HMAC".concat(valueOf), new SecretKeySpec(zzgdrVar.zze().zzd(zzgce.zza()), "HMAC")), zzgdrVar.zzb().zze()), zzgdrVar.zzb().zze(), zzgdrVar.zzc().zzc());
    }

    @Override // com.google.android.gms.internal.ads.zzgbv
    public final byte[] zza(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        byte[] bArr3 = this.zzd;
        int i10 = this.zzc;
        int length = bArr3.length;
        int length2 = bArr.length;
        if (length2 >= i10 + length) {
            if (zzgmn.zzc(bArr3, bArr)) {
                byte[] copyOfRange = Arrays.copyOfRange(bArr, this.zzd.length, length2 - this.zzc);
                byte[] copyOfRange2 = Arrays.copyOfRange(bArr, length2 - this.zzc, length2);
                if (bArr2 == null) {
                    bArr2 = new byte[0];
                }
                if (MessageDigest.isEqual(((zzgue) this.zzb).zzc(zzgth.zzb(bArr2, copyOfRange, Arrays.copyOf(ByteBuffer.allocate(8).putLong(bArr2.length * 8).array(), 8))), copyOfRange2)) {
                    return this.zza.zza(copyOfRange);
                }
                throw new GeneralSecurityException("invalid MAC");
            }
            throw new GeneralSecurityException("Decryption failed (OutputPrefix mismatch).");
        }
        throw new GeneralSecurityException("Decryption failed (ciphertext too short).");
    }
}
