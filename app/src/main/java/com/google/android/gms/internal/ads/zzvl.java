package com.google.android.gms.internal.ads;

import java.io.EOFException;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.Arrays;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
final class zzvl {
    private final zzdx zza = new zzdx(32);
    private zzvk zzb;
    private zzvk zzc;
    private zzvk zzd;
    private long zze;
    private final zzye zzf;

    public zzvl(zzye zzyeVar) {
        this.zzf = zzyeVar;
        zzvk zzvkVar = new zzvk(0L, 65536);
        this.zzb = zzvkVar;
        this.zzc = zzvkVar;
        this.zzd = zzvkVar;
    }

    private final int zzi(int i10) {
        zzvk zzvkVar = this.zzd;
        if (zzvkVar.zzc == null) {
            zzxx zzb = this.zzf.zzb();
            zzvk zzvkVar2 = new zzvk(this.zzd.zzb, 65536);
            zzvkVar.zzc = zzb;
            zzvkVar.zzd = zzvkVar2;
        }
        return Math.min(i10, (int) (this.zzd.zzb - this.zze));
    }

    private static zzvk zzj(zzvk zzvkVar, long j10) {
        while (j10 >= zzvkVar.zzb) {
            zzvkVar = zzvkVar.zzd;
        }
        return zzvkVar;
    }

    private static zzvk zzk(zzvk zzvkVar, long j10, ByteBuffer byteBuffer, int i10) {
        zzvk zzj = zzj(zzvkVar, j10);
        while (i10 > 0) {
            int min = Math.min(i10, (int) (zzj.zzb - j10));
            byteBuffer.put(zzj.zzc.zza, zzj.zza(j10), min);
            i10 -= min;
            j10 += min;
            if (j10 == zzj.zzb) {
                zzj = zzj.zzd;
            }
        }
        return zzj;
    }

    private static zzvk zzl(zzvk zzvkVar, long j10, byte[] bArr, int i10) {
        zzvk zzj = zzj(zzvkVar, j10);
        int i11 = i10;
        while (i11 > 0) {
            int min = Math.min(i11, (int) (zzj.zzb - j10));
            System.arraycopy(zzj.zzc.zza, zzj.zza(j10), bArr, i10 - i11, min);
            i11 -= min;
            j10 += min;
            if (j10 == zzj.zzb) {
                zzj = zzj.zzd;
            }
        }
        return zzj;
    }

    private static zzvk zzm(zzvk zzvkVar, zzha zzhaVar, zzvn zzvnVar, zzdx zzdxVar) {
        zzvk zzvkVar2;
        if (zzhaVar.zzl()) {
            long j10 = zzvnVar.zzb;
            int i10 = 1;
            zzdxVar.zzI(1);
            zzvk zzl = zzl(zzvkVar, j10, zzdxVar.zzN(), 1);
            long j11 = j10 + 1;
            byte b10 = zzdxVar.zzN()[0];
            int i11 = b10 & 128;
            int i12 = b10 & Byte.MAX_VALUE;
            zzgx zzgxVar = zzhaVar.zzb;
            byte[] bArr = zzgxVar.zza;
            if (bArr == null) {
                zzgxVar.zza = new byte[16];
            } else {
                Arrays.fill(bArr, (byte) 0);
            }
            boolean z10 = i11 != 0;
            zzvkVar2 = zzl(zzl, j11, zzgxVar.zza, i12);
            long j12 = j11 + i12;
            if (z10) {
                zzdxVar.zzI(2);
                zzvkVar2 = zzl(zzvkVar2, j12, zzdxVar.zzN(), 2);
                j12 += 2;
                i10 = zzdxVar.zzq();
            }
            int i13 = i10;
            int[] iArr = zzgxVar.zzd;
            if (iArr == null || iArr.length < i13) {
                iArr = new int[i13];
            }
            int[] iArr2 = iArr;
            int[] iArr3 = zzgxVar.zze;
            if (iArr3 == null || iArr3.length < i13) {
                iArr3 = new int[i13];
            }
            int[] iArr4 = iArr3;
            if (z10) {
                int i14 = i13 * 6;
                zzdxVar.zzI(i14);
                zzvkVar2 = zzl(zzvkVar2, j12, zzdxVar.zzN(), i14);
                j12 += i14;
                zzdxVar.zzL(0);
                for (int i15 = 0; i15 < i13; i15++) {
                    iArr2[i15] = zzdxVar.zzq();
                    iArr4[i15] = zzdxVar.zzp();
                }
            } else {
                iArr2[0] = 0;
                iArr4[0] = zzvnVar.zza - ((int) (j12 - zzvnVar.zzb));
            }
            zzado zzadoVar = zzvnVar.zzc;
            int i16 = zzeh.zza;
            zzgxVar.zzc(i13, iArr2, iArr4, zzadoVar.zzb, zzgxVar.zza, zzadoVar.zza, zzadoVar.zzc, zzadoVar.zzd);
            long j13 = zzvnVar.zzb;
            int i17 = (int) (j12 - j13);
            zzvnVar.zzb = j13 + i17;
            zzvnVar.zza -= i17;
        } else {
            zzvkVar2 = zzvkVar;
        }
        if (zzhaVar.zze()) {
            zzdxVar.zzI(4);
            zzvk zzl2 = zzl(zzvkVar2, zzvnVar.zzb, zzdxVar.zzN(), 4);
            int zzp = zzdxVar.zzp();
            zzvnVar.zzb += 4;
            zzvnVar.zza -= 4;
            zzhaVar.zzj(zzp);
            zzvk zzk = zzk(zzl2, zzvnVar.zzb, zzhaVar.zzc, zzp);
            zzvnVar.zzb += zzp;
            int i18 = zzvnVar.zza - zzp;
            zzvnVar.zza = i18;
            ByteBuffer byteBuffer = zzhaVar.zzf;
            if (byteBuffer != null && byteBuffer.capacity() >= i18) {
                zzhaVar.zzf.clear();
            } else {
                zzhaVar.zzf = ByteBuffer.allocate(i18);
            }
            return zzk(zzk, zzvnVar.zzb, zzhaVar.zzf, zzvnVar.zza);
        }
        zzhaVar.zzj(zzvnVar.zza);
        return zzk(zzvkVar2, zzvnVar.zzb, zzhaVar.zzc, zzvnVar.zza);
    }

    private final void zzn(int i10) {
        long j10 = this.zze + i10;
        this.zze = j10;
        zzvk zzvkVar = this.zzd;
        if (j10 == zzvkVar.zzb) {
            this.zzd = zzvkVar.zzd;
        }
    }

    public final int zza(zzl zzlVar, int i10, boolean z10) throws IOException {
        int zzi = zzi(i10);
        zzvk zzvkVar = this.zzd;
        int zza = zzlVar.zza(zzvkVar.zzc.zza, zzvkVar.zza(this.zze), zzi);
        if (zza != -1) {
            zzn(zza);
            return zza;
        } else if (z10) {
            return -1;
        } else {
            throw new EOFException();
        }
    }

    public final long zzb() {
        return this.zze;
    }

    public final void zzc(long j10) {
        zzvk zzvkVar;
        if (j10 != -1) {
            while (true) {
                zzvkVar = this.zzb;
                if (j10 < zzvkVar.zzb) {
                    break;
                }
                this.zzf.zzc(zzvkVar.zzc);
                this.zzb = this.zzb.zzb();
            }
            if (this.zzc.zza < zzvkVar.zza) {
                this.zzc = zzvkVar;
            }
        }
    }

    public final void zzd(zzha zzhaVar, zzvn zzvnVar) {
        zzm(this.zzc, zzhaVar, zzvnVar, this.zza);
    }

    public final void zze(zzha zzhaVar, zzvn zzvnVar) {
        this.zzc = zzm(this.zzc, zzhaVar, zzvnVar, this.zza);
    }

    public final void zzf() {
        zzvk zzvkVar = this.zzb;
        if (zzvkVar.zzc != null) {
            this.zzf.zzd(zzvkVar);
            zzvkVar.zzb();
        }
        this.zzb.zze(0L, 65536);
        zzvk zzvkVar2 = this.zzb;
        this.zzc = zzvkVar2;
        this.zzd = zzvkVar2;
        this.zze = 0L;
        this.zzf.zzg();
    }

    public final void zzg() {
        this.zzc = this.zzb;
    }

    public final void zzh(zzdx zzdxVar, int i10) {
        while (i10 > 0) {
            int zzi = zzi(i10);
            zzvk zzvkVar = this.zzd;
            zzdxVar.zzH(zzvkVar.zzc.zza, zzvkVar.zza(this.zze), zzi);
            i10 -= zzi;
            zzn(zzi);
        }
    }
}
