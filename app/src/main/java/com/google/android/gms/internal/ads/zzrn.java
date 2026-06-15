package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
final class zzrn extends zzha {
    private long zzg;
    private int zzh;
    private int zzi;

    public zzrn() {
        super(2, 0);
        this.zzi = 32;
    }

    @Override // com.google.android.gms.internal.ads.zzha, com.google.android.gms.internal.ads.zzgu
    public final void zzb() {
        super.zzb();
        this.zzh = 0;
    }

    public final int zzm() {
        return this.zzh;
    }

    public final long zzn() {
        return this.zzg;
    }

    public final void zzo(int i10) {
        this.zzi = i10;
    }

    public final boolean zzp(zzha zzhaVar) {
        ByteBuffer byteBuffer;
        zzcv.zzd(!zzhaVar.zzd(1073741824));
        zzcv.zzd(!zzhaVar.zzd(268435456));
        zzcv.zzd(!zzhaVar.zzd(4));
        if (zzq()) {
            if (this.zzh >= this.zzi) {
                return false;
            }
            ByteBuffer byteBuffer2 = zzhaVar.zzc;
            if (byteBuffer2 != null && (byteBuffer = this.zzc) != null && byteBuffer.position() + byteBuffer2.remaining() > 3072000) {
                return false;
            }
        }
        int i10 = this.zzh;
        this.zzh = i10 + 1;
        if (i10 == 0) {
            this.zze = zzhaVar.zze;
            if (zzhaVar.zzd(1)) {
                zzc(1);
            }
        }
        ByteBuffer byteBuffer3 = zzhaVar.zzc;
        if (byteBuffer3 != null) {
            zzj(byteBuffer3.remaining());
            this.zzc.put(byteBuffer3);
        }
        this.zzg = zzhaVar.zze;
        return true;
    }

    public final boolean zzq() {
        return this.zzh > 0;
    }
}
