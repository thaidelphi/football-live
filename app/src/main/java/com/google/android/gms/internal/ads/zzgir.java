package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;
import java.security.MessageDigest;
import javax.crypto.AEADBadTagException;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
abstract class zzgir {
    private final zzgip zza;
    private final zzgip zzb;

    public zzgir(byte[] bArr) throws GeneralSecurityException {
        if (zzgjk.zza(1)) {
            this.zza = zza(bArr, 1);
            this.zzb = zza(bArr, 0);
            return;
        }
        throw new GeneralSecurityException("Can not use ChaCha20Poly1305 in FIPS-mode.");
    }

    abstract zzgip zza(byte[] bArr, int i10) throws InvalidKeyException;

    public final byte[] zzb(ByteBuffer byteBuffer, byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        if (byteBuffer.remaining() >= 16) {
            int position = byteBuffer.position();
            byte[] bArr3 = new byte[16];
            byteBuffer.position(byteBuffer.limit() - 16);
            byteBuffer.get(bArr3);
            byteBuffer.position(position);
            byteBuffer.limit(byteBuffer.limit() - 16);
            if (bArr2 == null) {
                bArr2 = new byte[0];
            }
            try {
                byte[] bArr4 = new byte[32];
                this.zzb.zzc(bArr, 0).get(bArr4);
                int length = bArr2.length;
                int i10 = length & 15;
                int i11 = i10 == 0 ? length : (length + 16) - i10;
                int remaining = byteBuffer.remaining();
                int i12 = remaining % 16;
                int i13 = (i12 == 0 ? remaining : (remaining + 16) - i12) + i11;
                ByteBuffer order = ByteBuffer.allocate(i13 + 16).order(ByteOrder.LITTLE_ENDIAN);
                order.put(bArr2);
                order.position(i11);
                order.put(byteBuffer);
                order.position(i13);
                order.putLong(length);
                order.putLong(remaining);
                if (MessageDigest.isEqual(zzgiv.zza(bArr4, order.array()), bArr3)) {
                    byteBuffer.position(position);
                    return this.zza.zzd(bArr, byteBuffer);
                }
                throw new GeneralSecurityException("invalid MAC");
            } catch (GeneralSecurityException e8) {
                throw new AEADBadTagException(e8.toString());
            }
        }
        throw new GeneralSecurityException("ciphertext too short");
    }
}
