package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
abstract class zzgip {
    int[] zza;
    private final int zzb;

    public zzgip(byte[] bArr, int i10) throws InvalidKeyException {
        if (bArr.length == 32) {
            this.zza = zzgin.zze(bArr);
            this.zzb = i10;
            return;
        }
        throw new InvalidKeyException("The key length in bytes must be 32.");
    }

    abstract int zza();

    abstract int[] zzb(int[] iArr, int i10);

    /* JADX INFO: Access modifiers changed from: package-private */
    public final ByteBuffer zzc(byte[] bArr, int i10) {
        int[] zzb = zzb(zzgin.zze(bArr), i10);
        int[] iArr = (int[]) zzb.clone();
        zzgin.zzc(iArr);
        for (int i11 = 0; i11 < 16; i11++) {
            zzb[i11] = zzb[i11] + iArr[i11];
        }
        ByteBuffer order = ByteBuffer.allocate(64).order(ByteOrder.LITTLE_ENDIAN);
        order.asIntBuffer().put(zzb, 0, 16);
        return order;
    }

    public final byte[] zzd(byte[] bArr, ByteBuffer byteBuffer) throws GeneralSecurityException {
        ByteBuffer allocate = ByteBuffer.allocate(byteBuffer.remaining());
        if (bArr.length == zza()) {
            int remaining = byteBuffer.remaining();
            int i10 = remaining / 64;
            int i11 = 0;
            while (true) {
                int i12 = i10 + 1;
                if (i11 < i12) {
                    ByteBuffer zzc = zzc(bArr, this.zzb + i11);
                    if (i11 == i12 - 1) {
                        zzgth.zza(allocate, byteBuffer, zzc, remaining % 64);
                    } else {
                        zzgth.zza(allocate, byteBuffer, zzc, 64);
                    }
                    i11++;
                } else {
                    return allocate.array();
                }
            }
        } else {
            int zza = zza();
            throw new GeneralSecurityException("The nonce length (in bytes) must be " + zza);
        }
    }
}
