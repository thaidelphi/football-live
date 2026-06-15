package com.google.android.gms.internal.ads;

import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzdx {
    private static final char[] zza = {'\r', '\n'};
    private static final char[] zzb = {'\n'};
    private static final zzfwa zzc = zzfwa.zzr(StandardCharsets.US_ASCII, StandardCharsets.UTF_8, StandardCharsets.UTF_16, StandardCharsets.UTF_16BE, StandardCharsets.UTF_16LE);
    private byte[] zzd;
    private int zze;
    private int zzf;

    public zzdx() {
        this.zzd = zzeh.zzf;
    }

    public zzdx(byte[] bArr, int i10) {
        this.zzd = bArr;
        this.zzf = i10;
    }

    private final char zzO(Charset charset, char[] cArr) {
        int zzP = zzP(charset);
        if (zzP != 0) {
            int i10 = zzP >> 16;
            for (char c10 : cArr) {
                char c11 = (char) i10;
                if (c10 == c11) {
                    this.zze += (char) zzP;
                    return c11;
                }
            }
        }
        return (char) 0;
    }

    private final int zzP(Charset charset) {
        int i10;
        byte zza2;
        char zzb2;
        int i11 = 1;
        if (charset.equals(StandardCharsets.UTF_8) || charset.equals(StandardCharsets.US_ASCII)) {
            if (this.zzf - this.zze > 0) {
                zza2 = (byte) zzfyv.zza(this.zzd[i10] & 255);
                return (zzfyv.zza(zza2) << 16) + i11;
            }
        }
        if (charset.equals(StandardCharsets.UTF_16) || charset.equals(StandardCharsets.UTF_16BE)) {
            int i12 = this.zzf;
            int i13 = this.zze;
            if (i12 - i13 >= 2) {
                byte[] bArr = this.zzd;
                zzb2 = zzfyv.zzb(bArr[i13], bArr[i13 + 1]);
                zza2 = (byte) zzb2;
                i11 = 2;
                return (zzfyv.zza(zza2) << 16) + i11;
            }
        }
        if (charset.equals(StandardCharsets.UTF_16LE)) {
            int i14 = this.zzf;
            int i15 = this.zze;
            if (i14 - i15 >= 2) {
                byte[] bArr2 = this.zzd;
                zzb2 = zzfyv.zzb(bArr2[i15 + 1], bArr2[i15]);
                zza2 = (byte) zzb2;
                i11 = 2;
                return (zzfyv.zza(zza2) << 16) + i11;
            }
            return 0;
        }
        return 0;
    }

    public final String zzA(int i10) {
        if (i10 == 0) {
            return "";
        }
        int i11 = this.zze;
        int i12 = (i11 + i10) - 1;
        String zzC = zzeh.zzC(this.zzd, i11, (i12 >= this.zzf || this.zzd[i12] != 0) ? i10 : i10 - 1);
        this.zze += i10;
        return zzC;
    }

    public final String zzB(int i10, Charset charset) {
        byte[] bArr = this.zzd;
        int i11 = this.zze;
        String str = new String(bArr, i11, i10, charset);
        this.zze = i11 + i10;
        return str;
    }

    public final Charset zzC() {
        int i10 = this.zzf;
        int i11 = this.zze;
        int i12 = i10 - i11;
        if (i12 >= 3) {
            byte[] bArr = this.zzd;
            if (bArr[i11] == -17 && bArr[i11 + 1] == -69 && bArr[i11 + 2] == -65) {
                this.zze = i11 + 3;
                return StandardCharsets.UTF_8;
            }
        }
        if (i12 >= 2) {
            byte[] bArr2 = this.zzd;
            byte b10 = bArr2[i11];
            if (b10 == -2) {
                if (bArr2[i11 + 1] == -1) {
                    this.zze = i11 + 2;
                    return StandardCharsets.UTF_16BE;
                }
                return null;
            } else if (b10 == -1 && bArr2[i11 + 1] == -2) {
                this.zze = i11 + 2;
                return StandardCharsets.UTF_16LE;
            } else {
                return null;
            }
        }
        return null;
    }

    public final short zzD() {
        byte[] bArr = this.zzd;
        int i10 = this.zze;
        int i11 = i10 + 1;
        this.zze = i11;
        this.zze = i11 + 1;
        return (short) (((bArr[i11] & 255) << 8) | (bArr[i10] & 255));
    }

    public final short zzE() {
        byte[] bArr = this.zzd;
        int i10 = this.zze;
        int i11 = i10 + 1;
        this.zze = i11;
        this.zze = i11 + 1;
        return (short) ((bArr[i11] & 255) | ((bArr[i10] & 255) << 8));
    }

    public final void zzF(int i10) {
        byte[] bArr = this.zzd;
        if (i10 > bArr.length) {
            this.zzd = Arrays.copyOf(bArr, i10);
        }
    }

    public final void zzG(zzdw zzdwVar, int i10) {
        zzH(zzdwVar.zza, 0, i10);
        zzdwVar.zzl(0);
    }

    public final void zzH(byte[] bArr, int i10, int i11) {
        System.arraycopy(this.zzd, this.zze, bArr, i10, i11);
        this.zze += i11;
    }

    public final void zzI(int i10) {
        byte[] bArr = this.zzd;
        if (bArr.length < i10) {
            bArr = new byte[i10];
        }
        zzJ(bArr, i10);
    }

    public final void zzJ(byte[] bArr, int i10) {
        this.zzd = bArr;
        this.zzf = i10;
        this.zze = 0;
    }

    public final void zzK(int i10) {
        boolean z10 = false;
        if (i10 >= 0 && i10 <= this.zzd.length) {
            z10 = true;
        }
        zzcv.zzd(z10);
        this.zzf = i10;
    }

    public final void zzL(int i10) {
        boolean z10 = false;
        if (i10 >= 0 && i10 <= this.zzf) {
            z10 = true;
        }
        zzcv.zzd(z10);
        this.zze = i10;
    }

    public final void zzM(int i10) {
        zzL(this.zze + i10);
    }

    public final byte[] zzN() {
        return this.zzd;
    }

    public final char zza(Charset charset) {
        zzcv.zze(zzc.contains(charset), "Unsupported charset: ".concat(String.valueOf(charset)));
        return (char) (zzP(charset) >> 16);
    }

    public final int zzb() {
        return this.zzf - this.zze;
    }

    public final int zzc() {
        return this.zzd.length;
    }

    public final int zzd() {
        return this.zze;
    }

    public final int zze() {
        return this.zzf;
    }

    public final int zzf() {
        return this.zzd[this.zze] & 255;
    }

    public final int zzg() {
        byte[] bArr = this.zzd;
        int i10 = this.zze;
        int i11 = i10 + 1;
        this.zze = i11;
        int i12 = i11 + 1;
        this.zze = i12;
        int i13 = i12 + 1;
        this.zze = i13;
        this.zze = i13 + 1;
        return (bArr[i13] & 255) | ((bArr[i10] & 255) << 24) | ((bArr[i11] & 255) << 16) | ((bArr[i12] & 255) << 8);
    }

    public final int zzh() {
        byte[] bArr = this.zzd;
        int i10 = this.zze;
        int i11 = i10 + 1;
        this.zze = i11;
        int i12 = i11 + 1;
        this.zze = i12;
        this.zze = i12 + 1;
        return (bArr[i12] & 255) | (((bArr[i10] & 255) << 24) >> 8) | ((bArr[i11] & 255) << 8);
    }

    public final int zzi() {
        byte[] bArr = this.zzd;
        int i10 = this.zze;
        int i11 = i10 + 1;
        this.zze = i11;
        int i12 = i11 + 1;
        this.zze = i12;
        int i13 = i12 + 1;
        this.zze = i13;
        this.zze = i13 + 1;
        return ((bArr[i13] & 255) << 24) | (bArr[i10] & 255) | ((bArr[i11] & 255) << 8) | ((bArr[i12] & 255) << 16);
    }

    public final int zzj() {
        int zzi = zzi();
        if (zzi >= 0) {
            return zzi;
        }
        throw new IllegalStateException("Top bit not zero: " + zzi);
    }

    public final int zzk() {
        byte[] bArr = this.zzd;
        int i10 = this.zze;
        int i11 = i10 + 1;
        this.zze = i11;
        this.zze = i11 + 1;
        return ((bArr[i11] & 255) << 8) | (bArr[i10] & 255);
    }

    public final int zzl() {
        return (zzm() << 21) | (zzm() << 14) | (zzm() << 7) | zzm();
    }

    public final int zzm() {
        byte[] bArr = this.zzd;
        int i10 = this.zze;
        this.zze = i10 + 1;
        return bArr[i10] & 255;
    }

    public final int zzn() {
        byte[] bArr = this.zzd;
        int i10 = this.zze;
        int i11 = i10 + 1;
        this.zze = i11;
        int i12 = i11 + 1;
        this.zze = i12;
        this.zze = i12 + 2;
        return (bArr[i11] & 255) | ((bArr[i10] & 255) << 8);
    }

    public final int zzo() {
        byte[] bArr = this.zzd;
        int i10 = this.zze;
        int i11 = i10 + 1;
        this.zze = i11;
        int i12 = i11 + 1;
        this.zze = i12;
        this.zze = i12 + 1;
        return (bArr[i12] & 255) | ((bArr[i10] & 255) << 16) | ((bArr[i11] & 255) << 8);
    }

    public final int zzp() {
        int zzg = zzg();
        if (zzg >= 0) {
            return zzg;
        }
        throw new IllegalStateException("Top bit not zero: " + zzg);
    }

    public final int zzq() {
        byte[] bArr = this.zzd;
        int i10 = this.zze;
        int i11 = i10 + 1;
        this.zze = i11;
        this.zze = i11 + 1;
        return (bArr[i11] & 255) | ((bArr[i10] & 255) << 8);
    }

    public final long zzr() {
        byte[] bArr = this.zzd;
        int i10 = this.zze;
        int i11 = i10 + 1;
        this.zze = i11;
        long j10 = bArr[i10];
        int i12 = i11 + 1;
        this.zze = i12;
        long j11 = bArr[i11];
        int i13 = i12 + 1;
        this.zze = i13;
        long j12 = bArr[i12];
        int i14 = i13 + 1;
        this.zze = i14;
        long j13 = bArr[i13];
        int i15 = i14 + 1;
        this.zze = i15;
        long j14 = bArr[i14];
        int i16 = i15 + 1;
        this.zze = i16;
        long j15 = bArr[i15];
        int i17 = i16 + 1;
        this.zze = i17;
        long j16 = bArr[i16];
        this.zze = i17 + 1;
        return ((bArr[i17] & 255) << 56) | ((j16 & 255) << 48) | (j10 & 255) | ((j11 & 255) << 8) | ((j12 & 255) << 16) | ((j13 & 255) << 24) | ((j14 & 255) << 32) | ((j15 & 255) << 40);
    }

    public final long zzs() {
        byte[] bArr = this.zzd;
        int i10 = this.zze;
        int i11 = i10 + 1;
        this.zze = i11;
        long j10 = bArr[i10];
        int i12 = i11 + 1;
        this.zze = i12;
        long j11 = bArr[i11];
        int i13 = i12 + 1;
        this.zze = i13;
        long j12 = bArr[i12];
        this.zze = i13 + 1;
        return ((bArr[i13] & 255) << 24) | (j10 & 255) | ((j11 & 255) << 8) | ((j12 & 255) << 16);
    }

    public final long zzt() {
        byte[] bArr = this.zzd;
        int i10 = this.zze;
        int i11 = i10 + 1;
        this.zze = i11;
        long j10 = bArr[i10];
        int i12 = i11 + 1;
        this.zze = i12;
        long j11 = bArr[i11];
        int i13 = i12 + 1;
        this.zze = i13;
        long j12 = bArr[i12];
        int i14 = i13 + 1;
        this.zze = i14;
        long j13 = bArr[i13];
        int i15 = i14 + 1;
        this.zze = i15;
        long j14 = bArr[i14];
        int i16 = i15 + 1;
        this.zze = i16;
        long j15 = bArr[i15];
        int i17 = i16 + 1;
        this.zze = i17;
        long j16 = bArr[i16];
        this.zze = i17 + 1;
        return (bArr[i17] & 255) | ((j10 & 255) << 56) | ((j11 & 255) << 48) | ((j12 & 255) << 40) | ((j13 & 255) << 32) | ((j14 & 255) << 24) | ((j15 & 255) << 16) | ((j16 & 255) << 8);
    }

    public final long zzu() {
        byte[] bArr = this.zzd;
        int i10 = this.zze;
        int i11 = i10 + 1;
        this.zze = i11;
        long j10 = bArr[i10];
        int i12 = i11 + 1;
        this.zze = i12;
        long j11 = bArr[i11];
        int i13 = i12 + 1;
        this.zze = i13;
        long j12 = bArr[i12];
        this.zze = i13 + 1;
        return (bArr[i13] & 255) | ((j10 & 255) << 24) | ((j11 & 255) << 16) | ((j12 & 255) << 8);
    }

    public final long zzv() {
        long j10 = 0;
        for (int i10 = 0; i10 < 9; i10++) {
            if (this.zze != this.zzf) {
                long zzm = zzm();
                j10 |= (127 & zzm) << (i10 * 7);
                if ((zzm & 128) == 0) {
                    break;
                }
            } else {
                throw new IllegalStateException("Attempting to read a byte over the limit.");
            }
        }
        return j10;
    }

    public final long zzw() {
        long zzt = zzt();
        if (zzt >= 0) {
            return zzt;
        }
        throw new IllegalStateException("Top bit not zero: " + zzt);
    }

    public final long zzx() {
        int i10;
        int i11;
        byte b10;
        int i12;
        long j10 = this.zzd[this.zze];
        int i13 = 7;
        while (true) {
            i10 = 0;
            if (i13 < 0) {
                break;
            }
            if (((1 << i13) & j10) != 0) {
                i13--;
            } else if (i13 < 6) {
                j10 &= i12 - 1;
                i10 = 7 - i13;
            } else if (i13 == 7) {
                i10 = 1;
            }
        }
        if (i10 == 0) {
            throw new NumberFormatException("Invalid UTF-8 sequence first byte: " + j10);
        }
        for (i11 = 1; i11 < i10; i11++) {
            if ((this.zzd[this.zze + i11] & 192) != 128) {
                throw new NumberFormatException("Invalid UTF-8 sequence continuation byte: " + j10);
            }
            j10 = (j10 << 6) | (b10 & 63);
        }
        this.zze += i10;
        return j10;
    }

    public final String zzy(char c10) {
        int i10 = this.zzf;
        int i11 = this.zze;
        if (i10 - i11 != 0) {
            while (i11 < this.zzf && this.zzd[i11] != 0) {
                i11++;
            }
            byte[] bArr = this.zzd;
            int i12 = this.zze;
            String zzC = zzeh.zzC(bArr, i12, i11 - i12);
            this.zze = i11;
            if (i11 < this.zzf) {
                this.zze = i11 + 1;
            }
            return zzC;
        }
        return null;
    }

    public final String zzz(Charset charset) {
        zzcv.zze(zzc.contains(charset), "Unsupported charset: ".concat(String.valueOf(charset)));
        if (this.zzf - this.zze == 0) {
            return null;
        }
        if (!charset.equals(StandardCharsets.US_ASCII)) {
            zzC();
        }
        int i10 = 2;
        if (charset.equals(StandardCharsets.UTF_8) || charset.equals(StandardCharsets.US_ASCII)) {
            i10 = 1;
        } else if (!charset.equals(StandardCharsets.UTF_16) && !charset.equals(StandardCharsets.UTF_16LE) && !charset.equals(StandardCharsets.UTF_16BE)) {
            throw new IllegalArgumentException("Unsupported charset: ".concat(String.valueOf(charset)));
        }
        int i11 = this.zze;
        while (true) {
            int i12 = this.zzf;
            if (i11 >= i12 - (i10 - 1)) {
                i11 = i12;
                break;
            } else if ((charset.equals(StandardCharsets.UTF_8) || charset.equals(StandardCharsets.US_ASCII)) && zzeh.zzL(this.zzd[i11])) {
                break;
            } else {
                if (charset.equals(StandardCharsets.UTF_16) || charset.equals(StandardCharsets.UTF_16BE)) {
                    byte[] bArr = this.zzd;
                    if (bArr[i11] == 0 && zzeh.zzL(bArr[i11 + 1])) {
                        break;
                    }
                }
                if (charset.equals(StandardCharsets.UTF_16LE)) {
                    byte[] bArr2 = this.zzd;
                    if (bArr2[i11 + 1] == 0 && zzeh.zzL(bArr2[i11])) {
                        break;
                    }
                }
                i11 += i10;
            }
        }
        String zzB = zzB(i11 - this.zze, charset);
        if (this.zze != this.zzf && zzO(charset, zza) == '\r') {
            zzO(charset, zzb);
        }
        return zzB;
    }

    public zzdx(int i10) {
        this.zzd = new byte[i10];
        this.zzf = i10;
    }

    public zzdx(byte[] bArr) {
        this.zzd = bArr;
        this.zzf = bArr.length;
    }
}
