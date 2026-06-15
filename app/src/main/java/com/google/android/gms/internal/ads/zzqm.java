package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.List;
import java.util.Objects;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzqm {
    private static final byte[] zza = {79, 103, 103, 83, 0, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 28, -43, -59, -9, 1, 19, 79, 112, 117, 115, 72, 101, 97, 100, 1, 2, 56, 1, Byte.MIN_VALUE, -69, 0, 0, 0, 0, 0};
    private static final byte[] zzb = {79, 103, 103, 83, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 11, -103, 87, 83, 1, 16, 79, 112, 117, 115, 84, 97, 103, 115, 0, 0, 0, 0, 0, 0, 0, 0};
    private ByteBuffer zzc = zzcg.zza;
    private int zze = 0;
    private int zzd = 2;

    private static final void zzc(ByteBuffer byteBuffer, long j10, int i10, int i11, boolean z10) {
        byteBuffer.put((byte) 79);
        byteBuffer.put((byte) 103);
        byteBuffer.put((byte) 103);
        byteBuffer.put((byte) 83);
        byteBuffer.put((byte) 0);
        byteBuffer.put(true != z10 ? (byte) 0 : (byte) 2);
        byteBuffer.putLong(j10);
        byteBuffer.putInt(0);
        byteBuffer.putInt(i10);
        byteBuffer.putInt(0);
        byteBuffer.put(zzfzb.zza(i11));
    }

    public final void zza(zzha zzhaVar, List list) {
        int i10;
        ByteBuffer byteBuffer = zzhaVar.zzc;
        Objects.requireNonNull(byteBuffer);
        if (byteBuffer.limit() - zzhaVar.zzc.position() == 0) {
            return;
        }
        byte[] bArr = null;
        if (this.zzd == 2 && (list.size() == 1 || list.size() == 3)) {
            bArr = (byte[]) list.get(0);
        }
        ByteBuffer byteBuffer2 = zzhaVar.zzc;
        int position = byteBuffer2.position();
        int limit = byteBuffer2.limit();
        int i11 = limit - position;
        int i12 = (i11 + 255) / 255;
        int i13 = i12 + 27 + i11;
        if (this.zzd == 2) {
            i10 = bArr != null ? bArr.length + 28 : 47;
            i13 += i10 + 44;
        } else {
            i10 = 0;
        }
        if (this.zzc.capacity() < i13) {
            this.zzc = ByteBuffer.allocate(i13).order(ByteOrder.LITTLE_ENDIAN);
        } else {
            this.zzc.clear();
        }
        ByteBuffer byteBuffer3 = this.zzc;
        if (this.zzd == 2) {
            if (bArr != null) {
                zzc(byteBuffer3, 0L, 0, 1, true);
                int length = bArr.length;
                byteBuffer3.put(zzfzb.zza(length));
                byteBuffer3.put(bArr);
                int i14 = length + 28;
                byteBuffer3.putInt(22, zzeh.zzf(byteBuffer3.array(), byteBuffer3.arrayOffset(), i14, 0));
                byteBuffer3.position(i14);
            } else {
                byteBuffer3.put(zza);
            }
            byteBuffer3.put(zzb);
        }
        int zzc = this.zze + zzade.zzc(byteBuffer2);
        this.zze = zzc;
        zzc(byteBuffer3, zzc, this.zzd, i12, false);
        for (int i15 = 0; i15 < i12; i15++) {
            if (i11 >= 255) {
                byteBuffer3.put((byte) -1);
                i11 -= 255;
            } else {
                byteBuffer3.put((byte) i11);
                i11 = 0;
            }
        }
        while (position < limit) {
            byteBuffer3.put(byteBuffer2.get(position));
            position++;
        }
        byteBuffer2.position(byteBuffer2.limit());
        byteBuffer3.flip();
        if (this.zzd == 2) {
            byteBuffer3.putInt(i10 + 66, zzeh.zzf(byteBuffer3.array(), byteBuffer3.arrayOffset() + i10 + 44, byteBuffer3.limit() - byteBuffer3.position(), 0));
        } else {
            byteBuffer3.putInt(22, zzeh.zzf(byteBuffer3.array(), byteBuffer3.arrayOffset(), byteBuffer3.limit() - byteBuffer3.position(), 0));
        }
        this.zzd++;
        this.zzc = byteBuffer3;
        zzhaVar.zzb();
        zzhaVar.zzj(this.zzc.remaining());
        zzhaVar.zzc.put(this.zzc);
        zzhaVar.zzk();
    }

    public final void zzb() {
        this.zzc = zzcg.zza;
        this.zze = 0;
        this.zzd = 2;
    }
}
