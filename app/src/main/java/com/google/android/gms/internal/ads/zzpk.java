package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.util.Objects;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzpk extends zzch {
    private int[] zzd;
    private int[] zze;

    @Override // com.google.android.gms.internal.ads.zzcg
    public final void zze(ByteBuffer byteBuffer) {
        int[] iArr = this.zze;
        Objects.requireNonNull(iArr);
        int position = byteBuffer.position();
        int limit = byteBuffer.limit();
        ByteBuffer zzj = zzj(((limit - position) / this.zzb.zze) * this.zzc.zze);
        while (position < limit) {
            for (int i10 : iArr) {
                zzj.putShort(byteBuffer.getShort(i10 + i10 + position));
            }
            position += this.zzb.zze;
        }
        byteBuffer.position(limit);
        zzj.flip();
    }

    @Override // com.google.android.gms.internal.ads.zzch
    public final zzce zzi(zzce zzceVar) throws zzcf {
        int[] iArr = this.zzd;
        if (iArr == null) {
            return zzce.zza;
        }
        if (zzceVar.zzd == 2) {
            boolean z10 = zzceVar.zzc != iArr.length;
            int i10 = 0;
            while (true) {
                int length = iArr.length;
                if (i10 >= length) {
                    return z10 ? new zzce(zzceVar.zzb, length, 2) : zzce.zza;
                }
                int i11 = iArr[i10];
                if (i11 >= zzceVar.zzc) {
                    throw new zzcf("Unhandled input format:", zzceVar);
                }
                z10 |= i11 != i10;
                i10++;
            }
        } else {
            throw new zzcf("Unhandled input format:", zzceVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzch
    protected final void zzk() {
        this.zze = this.zzd;
    }

    @Override // com.google.android.gms.internal.ads.zzch
    protected final void zzm() {
        this.zze = null;
        this.zzd = null;
    }

    public final void zzo(int[] iArr) {
        this.zzd = iArr;
    }
}
