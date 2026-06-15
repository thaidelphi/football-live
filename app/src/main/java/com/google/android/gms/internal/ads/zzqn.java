package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzqn extends zzch {
    private int zzd;
    private boolean zze;
    private int zzf;
    private long zzg;
    private byte[] zzi;
    private byte[] zzl;
    private int zzh = 0;
    private int zzj = 0;
    private int zzk = 0;

    public zzqn() {
        byte[] bArr = zzeh.zzf;
        this.zzi = bArr;
        this.zzl = bArr;
    }

    private final int zzq(int i10) {
        int zzr = ((zzr(2000000L) - this.zzh) * this.zzd) - (this.zzi.length >> 1);
        zzcv.zzf(zzr >= 0);
        int i11 = this.zzd;
        return (((int) Math.min((i10 * 0.2f) + 0.5f, zzr)) / i11) * i11;
    }

    private final int zzr(long j10) {
        return (int) ((j10 * this.zzb.zzb) / 1000000);
    }

    private static int zzs(byte b10, byte b11) {
        return (b10 << 8) | (b11 & 255);
    }

    private final void zzt(boolean z10) {
        int i10;
        int i11;
        int i12;
        int i13 = this.zzk;
        int length = this.zzi.length;
        if (i13 != length) {
            if (!z10) {
                return;
            }
            z10 = true;
        }
        if (this.zzh == 0) {
            if (z10) {
                zzu(i13, 3);
                i11 = i13;
            } else {
                zzcv.zzf(i13 >= (length >> 1));
                i11 = this.zzi.length >> 1;
                zzu(i11, 0);
            }
            i10 = i11;
        } else {
            int i14 = length >> 1;
            int i15 = i13 - i14;
            if (z10) {
                int zzq = zzq(i15) + (this.zzi.length >> 1);
                zzu(zzq, 2);
                int i16 = i14 + i15;
                i10 = zzq;
                i11 = i16;
            } else {
                int zzq2 = zzq(i15);
                zzu(zzq2, 1);
                i10 = zzq2;
                i11 = i15;
            }
        }
        zzcv.zzg(i11 % this.zzd == 0, "bytesConsumed is not aligned to frame size: %s" + i11);
        zzcv.zzf(i13 >= i10);
        this.zzk -= i11;
        int i17 = this.zzj + i11;
        this.zzj = i17;
        this.zzj = i17 % this.zzi.length;
        this.zzh = this.zzh + (i10 / this.zzd);
        this.zzg += (i11 - i10) / i12;
    }

    private final void zzu(int i10, int i11) {
        if (i10 == 0) {
            return;
        }
        zzcv.zzd(this.zzk >= i10);
        if (i11 == 2) {
            int i12 = this.zzj;
            int i13 = this.zzk;
            int i14 = i12 + i13;
            byte[] bArr = this.zzi;
            int length = bArr.length;
            if (i14 <= length) {
                System.arraycopy(bArr, i14 - i10, this.zzl, 0, i10);
            } else {
                int i15 = i13 - (length - i12);
                if (i15 >= i10) {
                    System.arraycopy(bArr, i15 - i10, this.zzl, 0, i10);
                } else {
                    int i16 = i10 - i15;
                    System.arraycopy(bArr, length - i16, this.zzl, 0, i16);
                    System.arraycopy(this.zzi, 0, this.zzl, i16, i15);
                }
            }
        } else {
            int i17 = this.zzj;
            int i18 = i17 + i10;
            byte[] bArr2 = this.zzi;
            int length2 = bArr2.length;
            if (i18 <= length2) {
                System.arraycopy(bArr2, i17, this.zzl, 0, i10);
            } else {
                int i19 = length2 - i17;
                System.arraycopy(bArr2, i17, this.zzl, 0, i19);
                System.arraycopy(this.zzi, 0, this.zzl, i19, i10 - i19);
            }
        }
        zzcv.zze(i10 % this.zzd == 0, "sizeToOutput is not aligned to frame size: " + i10);
        zzcv.zzf(this.zzj < this.zzi.length);
        byte[] bArr3 = this.zzl;
        zzcv.zze(i10 % this.zzd == 0, "byteOutput size is not aligned to frame size " + i10);
        if (i11 != 3) {
            for (int i20 = 0; i20 < i10; i20 += 2) {
                int i21 = i20 + 1;
                int zzs = zzs(bArr3[i21], bArr3[i20]);
                int i22 = 10;
                if (i11 == 0) {
                    i22 = ((((i20 * 1000) / (i10 - 1)) * (-90)) / 1000) + 100;
                } else if (i11 == 2) {
                    i22 = 10 + (((90000 * i20) / (i10 - 1)) / 1000);
                }
                int i23 = (zzs * i22) / 100;
                if (i23 >= 32767) {
                    bArr3[i20] = -1;
                    bArr3[i21] = Byte.MAX_VALUE;
                } else if (i23 <= -32768) {
                    bArr3[i20] = 0;
                    bArr3[i21] = Byte.MIN_VALUE;
                } else {
                    bArr3[i20] = (byte) (i23 & 255);
                    bArr3[i21] = (byte) (i23 >> 8);
                }
            }
        }
        zzj(i10).put(bArr3, 0, i10).flip();
    }

    private static final boolean zzv(byte b10, byte b11) {
        return Math.abs(zzs(b10, b11)) > 1024;
    }

    @Override // com.google.android.gms.internal.ads.zzcg
    public final void zze(ByteBuffer byteBuffer) {
        int limit;
        int i10;
        int position;
        while (byteBuffer.hasRemaining() && !zzn()) {
            boolean z10 = true;
            if (this.zzf != 0) {
                zzcv.zzf(this.zzj < this.zzi.length);
                int limit2 = byteBuffer.limit();
                int position2 = byteBuffer.position() + 1;
                while (true) {
                    if (position2 < byteBuffer.limit()) {
                        if (zzv(byteBuffer.get(position2), byteBuffer.get(position2 - 1))) {
                            int i11 = this.zzd;
                            limit = i11 * (position2 / i11);
                            break;
                        }
                        position2 += 2;
                    } else {
                        limit = byteBuffer.limit();
                        break;
                    }
                }
                int position3 = limit - byteBuffer.position();
                int i12 = this.zzj;
                int i13 = this.zzk;
                int i14 = i12 + i13;
                int length = this.zzi.length;
                if (i14 < length) {
                    i10 = length - i14;
                } else {
                    i14 = i13 - (length - i12);
                    i10 = i12 - i14;
                }
                int min = Math.min(position3, i10);
                byteBuffer.limit(byteBuffer.position() + min);
                byteBuffer.get(this.zzi, i14, min);
                int i15 = this.zzk + min;
                this.zzk = i15;
                zzcv.zzf(i15 <= this.zzi.length);
                if (limit >= limit2 || position3 >= i10) {
                    z10 = false;
                }
                zzt(z10);
                if (z10) {
                    this.zzf = 0;
                    this.zzh = 0;
                }
                byteBuffer.limit(limit2);
            } else {
                int limit3 = byteBuffer.limit();
                byteBuffer.limit(Math.min(limit3, byteBuffer.position() + this.zzi.length));
                int limit4 = byteBuffer.limit() - 1;
                while (true) {
                    if (limit4 >= byteBuffer.position()) {
                        if (zzv(byteBuffer.get(limit4), byteBuffer.get(limit4 - 1))) {
                            int i16 = this.zzd;
                            position = ((limit4 / i16) * i16) + i16;
                            break;
                        }
                        limit4 -= 2;
                    } else {
                        position = byteBuffer.position();
                        break;
                    }
                }
                if (position == byteBuffer.position()) {
                    this.zzf = 1;
                } else {
                    byteBuffer.limit(Math.min(position, byteBuffer.capacity()));
                    zzj(byteBuffer.remaining()).put(byteBuffer).flip();
                }
                byteBuffer.limit(limit3);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzch, com.google.android.gms.internal.ads.zzcg
    public final boolean zzg() {
        return super.zzg() && this.zze;
    }

    @Override // com.google.android.gms.internal.ads.zzch
    protected final zzce zzi(zzce zzceVar) throws zzcf {
        if (zzceVar.zzd == 2) {
            return zzceVar.zzb == -1 ? zzce.zza : zzceVar;
        }
        throw new zzcf("Unhandled input format:", zzceVar);
    }

    @Override // com.google.android.gms.internal.ads.zzch
    public final void zzk() {
        if (zzg()) {
            int i10 = this.zzb.zzc;
            this.zzd = i10 + i10;
            int i11 = this.zzd;
            int zzr = ((zzr(100000L) / 2) / i11) * i11;
            int i12 = zzr + zzr;
            if (this.zzi.length != i12) {
                this.zzi = new byte[i12];
                this.zzl = new byte[i12];
            }
        }
        this.zzf = 0;
        this.zzg = 0L;
        this.zzh = 0;
        this.zzj = 0;
        this.zzk = 0;
    }

    @Override // com.google.android.gms.internal.ads.zzch
    public final void zzl() {
        if (this.zzk > 0) {
            zzt(true);
            this.zzh = 0;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzch
    public final void zzm() {
        this.zze = false;
        byte[] bArr = zzeh.zzf;
        this.zzi = bArr;
        this.zzl = bArr;
    }

    public final long zzo() {
        return this.zzg;
    }

    public final void zzp(boolean z10) {
        this.zze = z10;
    }
}
