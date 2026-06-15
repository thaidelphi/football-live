package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzqo extends zzch {
    private static final int zzd = Float.floatToIntBits(Float.NaN);

    private static void zzo(int i10, ByteBuffer byteBuffer) {
        int floatToIntBits = Float.floatToIntBits((float) (i10 * 4.656612875245797E-10d));
        if (floatToIntBits == zzd) {
            floatToIntBits = Float.floatToIntBits(0.0f);
        }
        byteBuffer.putInt(floatToIntBits);
    }

    @Override // com.google.android.gms.internal.ads.zzcg
    public final void zze(ByteBuffer byteBuffer) {
        ByteBuffer zzj;
        int position = byteBuffer.position();
        int limit = byteBuffer.limit();
        int i10 = limit - position;
        int i11 = this.zzb.zzd;
        if (i11 == 21) {
            zzj = zzj((i10 / 3) * 4);
            while (position < limit) {
                zzo(((byteBuffer.get(position) & 255) << 8) | ((byteBuffer.get(position + 1) & 255) << 16) | ((byteBuffer.get(position + 2) & 255) << 24), zzj);
                position += 3;
            }
        } else if (i11 == 22) {
            zzj = zzj(i10);
            while (position < limit) {
                zzo((byteBuffer.get(position) & 255) | ((byteBuffer.get(position + 1) & 255) << 8) | ((byteBuffer.get(position + 2) & 255) << 16) | ((byteBuffer.get(position + 3) & 255) << 24), zzj);
                position += 4;
            }
        } else if (i11 == 1342177280) {
            zzj = zzj((i10 / 3) * 4);
            while (position < limit) {
                zzo(((byteBuffer.get(position + 2) & 255) << 8) | ((byteBuffer.get(position + 1) & 255) << 16) | ((byteBuffer.get(position) & 255) << 24), zzj);
                position += 3;
            }
        } else if (i11 == 1610612736) {
            zzj = zzj(i10);
            while (position < limit) {
                zzo((byteBuffer.get(position + 3) & 255) | ((byteBuffer.get(position + 2) & 255) << 8) | ((byteBuffer.get(position + 1) & 255) << 16) | ((byteBuffer.get(position) & 255) << 24), zzj);
                position += 4;
            }
        } else {
            throw new IllegalStateException();
        }
        byteBuffer.position(byteBuffer.limit());
        zzj.flip();
    }

    @Override // com.google.android.gms.internal.ads.zzch
    public final zzce zzi(zzce zzceVar) throws zzcf {
        int i10 = zzceVar.zzd;
        int i11 = zzeh.zza;
        if (i10 == 21 || i10 == 1342177280 || i10 == 22 || i10 == 1610612736) {
            return new zzce(zzceVar.zzb, zzceVar.zzc, 4);
        }
        if (i10 == 4) {
            return zzce.zza;
        }
        throw new zzcf("Unhandled input format:", zzceVar);
    }
}
