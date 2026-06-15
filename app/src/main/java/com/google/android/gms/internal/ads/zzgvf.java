package com.google.android.gms.internal.ads;

import com.google.android.gms.common.api.Api;
import com.google.protobuf.CodedOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads-lite@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzgvf extends zzgvi {
    private final InputStream zza;
    private final byte[] zzf;
    private int zzg;
    private int zzh;
    private int zzi;
    private int zzj;
    private int zzk;
    private int zzl;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzgvf(InputStream inputStream, int i10, zzgvh zzgvhVar) {
        super(null);
        this.zzl = Api.BaseClientBuilder.API_PRIORITY_OTHER;
        byte[] bArr = zzgwx.zzb;
        this.zza = inputStream;
        this.zzf = new byte[CodedOutputStream.DEFAULT_BUFFER_SIZE];
        this.zzg = 0;
        this.zzi = 0;
        this.zzk = 0;
    }

    private final List zzI(int i10) throws IOException {
        ArrayList arrayList = new ArrayList();
        while (i10 > 0) {
            int min = Math.min(i10, (int) CodedOutputStream.DEFAULT_BUFFER_SIZE);
            byte[] bArr = new byte[min];
            int i11 = 0;
            while (i11 < min) {
                int read = this.zza.read(bArr, i11, min - i11);
                if (read != -1) {
                    this.zzk += read;
                    i11 += read;
                } else {
                    throw new zzgwz("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                }
            }
            i10 -= min;
            arrayList.add(bArr);
        }
        return arrayList;
    }

    private final void zzJ() {
        int i10 = this.zzg + this.zzh;
        this.zzg = i10;
        int i11 = this.zzk + i10;
        int i12 = this.zzl;
        if (i11 <= i12) {
            this.zzh = 0;
            return;
        }
        int i13 = i11 - i12;
        this.zzh = i13;
        this.zzg = i10 - i13;
    }

    private final void zzK(int i10) throws IOException {
        if (zzL(i10)) {
            return;
        }
        if (i10 > (Api.BaseClientBuilder.API_PRIORITY_OTHER - this.zzk) - this.zzi) {
            throw new zzgwz("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit.");
        }
        throw new zzgwz("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    private final boolean zzL(int i10) throws IOException {
        int i11 = this.zzi;
        int i12 = i11 + i10;
        int i13 = this.zzg;
        if (i12 <= i13) {
            throw new IllegalStateException("refillBuffer() called when " + i10 + " bytes were already available in buffer");
        }
        int i14 = this.zzk;
        if (i10 <= (Api.BaseClientBuilder.API_PRIORITY_OTHER - i14) - i11 && i14 + i11 + i10 <= this.zzl) {
            if (i11 > 0) {
                if (i13 > i11) {
                    byte[] bArr = this.zzf;
                    System.arraycopy(bArr, i11, bArr, 0, i13 - i11);
                }
                i14 = this.zzk + i11;
                this.zzk = i14;
                i13 = this.zzg - i11;
                this.zzg = i13;
                this.zzi = 0;
            }
            try {
                int read = this.zza.read(this.zzf, i13, Math.min(4096 - i13, (Api.BaseClientBuilder.API_PRIORITY_OTHER - i14) - i13));
                if (read == 0 || read < -1 || read > 4096) {
                    throw new IllegalStateException(String.valueOf(this.zza.getClass()) + "#read(byte[]) returned invalid result: " + read + "\nThe InputStream implementation is buggy.");
                } else if (read > 0) {
                    this.zzg += read;
                    zzJ();
                    if (this.zzg >= i10) {
                        return true;
                    }
                    return zzL(i10);
                } else {
                    return false;
                }
            } catch (zzgwz e8) {
                e8.zza();
                throw e8;
            }
        }
        return false;
    }

    private final byte[] zzM(int i10, boolean z10) throws IOException {
        byte[] zzN = zzN(i10);
        if (zzN != null) {
            return zzN;
        }
        int i11 = this.zzi;
        int i12 = this.zzg;
        int i13 = i12 - i11;
        this.zzk += i12;
        this.zzi = 0;
        this.zzg = 0;
        List<byte[]> zzI = zzI(i10 - i13);
        byte[] bArr = new byte[i10];
        System.arraycopy(this.zzf, i11, bArr, 0, i13);
        for (byte[] bArr2 : zzI) {
            int length = bArr2.length;
            System.arraycopy(bArr2, 0, bArr, i13, length);
            i13 += length;
        }
        return bArr;
    }

    private final byte[] zzN(int i10) throws IOException {
        if (i10 == 0) {
            return zzgwx.zzb;
        }
        int i11 = this.zzk;
        int i12 = this.zzi;
        int i13 = i11 + i12 + i10;
        if ((-2147483647) + i13 <= 0) {
            int i14 = this.zzl;
            if (i13 <= i14) {
                int i15 = this.zzg - i12;
                int i16 = i10 - i15;
                if (i16 >= 4096) {
                    try {
                        if (i16 > this.zza.available()) {
                            return null;
                        }
                    } catch (zzgwz e8) {
                        e8.zza();
                        throw e8;
                    }
                }
                byte[] bArr = new byte[i10];
                System.arraycopy(this.zzf, this.zzi, bArr, 0, i15);
                this.zzk += this.zzg;
                this.zzi = 0;
                this.zzg = 0;
                while (i15 < i10) {
                    try {
                        int read = this.zza.read(bArr, i15, i10 - i15);
                        if (read != -1) {
                            this.zzk += read;
                            i15 += read;
                        } else {
                            throw new zzgwz("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                        }
                    } catch (zzgwz e10) {
                        e10.zza();
                        throw e10;
                    }
                }
                return bArr;
            }
            zzC((i14 - i11) - i12);
            throw new zzgwz("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        throw new zzgwz("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit.");
    }

    @Override // com.google.android.gms.internal.ads.zzgvi
    public final boolean zzA() throws IOException {
        return this.zzi == this.zzg && !zzL(1);
    }

    @Override // com.google.android.gms.internal.ads.zzgvi
    public final boolean zzB() throws IOException {
        return zzq() != 0;
    }

    public final void zzC(int i10) throws IOException {
        int i11 = this.zzg;
        int i12 = this.zzi;
        int i13 = i11 - i12;
        if (i10 <= i13 && i10 >= 0) {
            this.zzi = i12 + i10;
        } else if (i10 >= 0) {
            int i14 = this.zzk;
            int i15 = i14 + i12;
            int i16 = this.zzl;
            if (i15 + i10 <= i16) {
                this.zzk = i15;
                this.zzg = 0;
                this.zzi = 0;
                while (i13 < i10) {
                    try {
                        long j10 = i10 - i13;
                        try {
                            long skip = this.zza.skip(j10);
                            int i17 = (skip > 0L ? 1 : (skip == 0L ? 0 : -1));
                            if (i17 < 0 || skip > j10) {
                                throw new IllegalStateException(String.valueOf(this.zza.getClass()) + "#skip returned invalid result: " + skip + "\nThe InputStream implementation is buggy.");
                            } else if (i17 == 0) {
                                break;
                            } else {
                                i13 += (int) skip;
                            }
                        } catch (zzgwz e8) {
                            e8.zza();
                            throw e8;
                        }
                    } finally {
                        this.zzk += i13;
                        zzJ();
                    }
                }
                if (i13 >= i10) {
                    return;
                }
                int i18 = this.zzg;
                int i19 = i18 - this.zzi;
                this.zzi = i18;
                zzK(1);
                while (true) {
                    int i20 = i10 - i19;
                    int i21 = this.zzg;
                    if (i20 <= i21) {
                        this.zzi = i20;
                        return;
                    }
                    i19 += i21;
                    this.zzi = i21;
                    zzK(1);
                }
            } else {
                zzC((i16 - i14) - i12);
                throw new zzgwz("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
            }
        } else {
            throw new zzgwz("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgvi
    public final double zza() throws IOException {
        return Double.longBitsToDouble(zzp());
    }

    @Override // com.google.android.gms.internal.ads.zzgvi
    public final float zzb() throws IOException {
        return Float.intBitsToFloat(zzh());
    }

    @Override // com.google.android.gms.internal.ads.zzgvi
    public final int zzc() {
        return this.zzk + this.zzi;
    }

    @Override // com.google.android.gms.internal.ads.zzgvi
    public final int zzd(int i10) throws zzgwz {
        if (i10 >= 0) {
            int i11 = i10 + this.zzk + this.zzi;
            if (i11 >= 0) {
                int i12 = this.zzl;
                if (i11 <= i12) {
                    this.zzl = i11;
                    zzJ();
                    return i12;
                }
                throw new zzgwz("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
            }
            throw new zzgwz("Failed to parse the message.");
        }
        throw new zzgwz("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }

    @Override // com.google.android.gms.internal.ads.zzgvi
    public final int zze() throws IOException {
        return zzi();
    }

    @Override // com.google.android.gms.internal.ads.zzgvi
    public final int zzf() throws IOException {
        return zzh();
    }

    @Override // com.google.android.gms.internal.ads.zzgvi
    public final int zzg() throws IOException {
        return zzi();
    }

    public final int zzh() throws IOException {
        int i10 = this.zzi;
        if (this.zzg - i10 < 4) {
            zzK(4);
            i10 = this.zzi;
        }
        byte[] bArr = this.zzf;
        this.zzi = i10 + 4;
        int i11 = (bArr[i10 + 1] & 255) << 8;
        return ((bArr[i10 + 3] & 255) << 24) | i11 | (bArr[i10] & 255) | ((bArr[i10 + 2] & 255) << 16);
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x0067, code lost:
        if (r2[r3] < 0) goto L34;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int zzi() throws java.io.IOException {
        /*
            r5 = this;
            int r0 = r5.zzi
            int r1 = r5.zzg
            if (r1 != r0) goto L7
            goto L6d
        L7:
            byte[] r2 = r5.zzf
            int r3 = r0 + 1
            r0 = r2[r0]
            if (r0 < 0) goto L12
            r5.zzi = r3
            return r0
        L12:
            int r1 = r1 - r3
            r4 = 9
            if (r1 < r4) goto L6d
            int r1 = r3 + 1
            r3 = r2[r3]
            int r3 = r3 << 7
            r0 = r0 ^ r3
            if (r0 >= 0) goto L23
            r0 = r0 ^ (-128(0xffffffffffffff80, float:NaN))
            goto L6a
        L23:
            int r3 = r1 + 1
            r1 = r2[r1]
            int r1 = r1 << 14
            r0 = r0 ^ r1
            if (r0 < 0) goto L30
            r0 = r0 ^ 16256(0x3f80, float:2.278E-41)
        L2e:
            r1 = r3
            goto L6a
        L30:
            int r1 = r3 + 1
            r3 = r2[r3]
            int r3 = r3 << 21
            r0 = r0 ^ r3
            if (r0 >= 0) goto L3e
            r2 = -2080896(0xffffffffffe03f80, float:NaN)
            r0 = r0 ^ r2
            goto L6a
        L3e:
            int r3 = r1 + 1
            r1 = r2[r1]
            int r4 = r1 << 28
            r0 = r0 ^ r4
            r4 = 266354560(0xfe03f80, float:2.2112565E-29)
            r0 = r0 ^ r4
            if (r1 >= 0) goto L2e
            int r1 = r3 + 1
            r3 = r2[r3]
            if (r3 >= 0) goto L6a
            int r3 = r1 + 1
            r1 = r2[r1]
            if (r1 >= 0) goto L2e
            int r1 = r3 + 1
            r3 = r2[r3]
            if (r3 >= 0) goto L6a
            int r3 = r1 + 1
            r1 = r2[r1]
            if (r1 >= 0) goto L2e
            int r1 = r3 + 1
            r2 = r2[r3]
            if (r2 >= 0) goto L6a
            goto L6d
        L6a:
            r5.zzi = r1
            return r0
        L6d:
            long r0 = r5.zzr()
            int r0 = (int) r0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzgvf.zzi():int");
    }

    @Override // com.google.android.gms.internal.ads.zzgvi
    public final int zzj() throws IOException {
        return zzh();
    }

    @Override // com.google.android.gms.internal.ads.zzgvi
    public final int zzk() throws IOException {
        return zzgvi.zzD(zzi());
    }

    @Override // com.google.android.gms.internal.ads.zzgvi
    public final int zzl() throws IOException {
        if (zzA()) {
            this.zzj = 0;
            return 0;
        }
        int zzi = zzi();
        this.zzj = zzi;
        if ((zzi >>> 3) != 0) {
            return zzi;
        }
        throw new zzgwz("Protocol message contained an invalid tag (zero).");
    }

    @Override // com.google.android.gms.internal.ads.zzgvi
    public final int zzm() throws IOException {
        return zzi();
    }

    @Override // com.google.android.gms.internal.ads.zzgvi
    public final long zzn() throws IOException {
        return zzp();
    }

    @Override // com.google.android.gms.internal.ads.zzgvi
    public final long zzo() throws IOException {
        return zzq();
    }

    public final long zzp() throws IOException {
        int i10 = this.zzi;
        if (this.zzg - i10 < 8) {
            zzK(8);
            i10 = this.zzi;
        }
        byte[] bArr = this.zzf;
        this.zzi = i10 + 8;
        long j10 = bArr[i10 + 2];
        long j11 = bArr[i10 + 3];
        return ((bArr[i10 + 7] & 255) << 56) | (bArr[i10] & 255) | ((bArr[i10 + 1] & 255) << 8) | ((j10 & 255) << 16) | ((j11 & 255) << 24) | ((bArr[i10 + 4] & 255) << 32) | ((bArr[i10 + 5] & 255) << 40) | ((bArr[i10 + 6] & 255) << 48);
    }

    public final long zzq() throws IOException {
        long j10;
        long j11;
        long j12;
        long j13;
        int i10;
        int i11 = this.zzi;
        int i12 = this.zzg;
        if (i12 != i11) {
            byte[] bArr = this.zzf;
            int i13 = i11 + 1;
            byte b10 = bArr[i11];
            if (b10 >= 0) {
                this.zzi = i13;
                return b10;
            } else if (i12 - i13 >= 9) {
                int i14 = i13 + 1;
                int i15 = b10 ^ (bArr[i13] << 7);
                if (i15 >= 0) {
                    int i16 = i14 + 1;
                    int i17 = i15 ^ (bArr[i14] << 14);
                    if (i17 >= 0) {
                        j10 = i17 ^ 16256;
                    } else {
                        i14 = i16 + 1;
                        int i18 = i17 ^ (bArr[i16] << 21);
                        if (i18 < 0) {
                            i10 = i18 ^ (-2080896);
                        } else {
                            i16 = i14 + 1;
                            long j14 = i18 ^ (bArr[i14] << 28);
                            if (j14 < 0) {
                                int i19 = i16 + 1;
                                long j15 = j14 ^ (bArr[i16] << 35);
                                if (j15 < 0) {
                                    j12 = -34093383808L;
                                } else {
                                    i16 = i19 + 1;
                                    j14 = j15 ^ (bArr[i19] << 42);
                                    if (j14 >= 0) {
                                        j13 = 4363953127296L;
                                    } else {
                                        i19 = i16 + 1;
                                        j15 = j14 ^ (bArr[i16] << 49);
                                        if (j15 < 0) {
                                            j12 = -558586000294016L;
                                        } else {
                                            i16 = i19 + 1;
                                            j10 = (j15 ^ (bArr[i19] << 56)) ^ 71499008037633920L;
                                            if (j10 < 0) {
                                                i19 = i16 + 1;
                                                if (bArr[i16] >= 0) {
                                                    j11 = j10;
                                                    i14 = i19;
                                                    this.zzi = i14;
                                                    return j11;
                                                }
                                            }
                                        }
                                    }
                                }
                                j11 = j12 ^ j15;
                                i14 = i19;
                                this.zzi = i14;
                                return j11;
                            }
                            j13 = 266354560;
                            j10 = j14 ^ j13;
                        }
                    }
                    i14 = i16;
                    j11 = j10;
                    this.zzi = i14;
                    return j11;
                }
                i10 = i15 ^ (-128);
                j11 = i10;
                this.zzi = i14;
                return j11;
            }
        }
        return zzr();
    }

    final long zzr() throws IOException {
        long j10 = 0;
        for (int i10 = 0; i10 < 64; i10 += 7) {
            if (this.zzi == this.zzg) {
                zzK(1);
            }
            byte[] bArr = this.zzf;
            int i11 = this.zzi;
            this.zzi = i11 + 1;
            byte b10 = bArr[i11];
            j10 |= (b10 & Byte.MAX_VALUE) << i10;
            if ((b10 & 128) == 0) {
                return j10;
            }
        }
        throw new zzgwz("CodedInputStream encountered a malformed varint.");
    }

    @Override // com.google.android.gms.internal.ads.zzgvi
    public final long zzs() throws IOException {
        return zzp();
    }

    @Override // com.google.android.gms.internal.ads.zzgvi
    public final long zzt() throws IOException {
        return zzgvi.zzF(zzq());
    }

    @Override // com.google.android.gms.internal.ads.zzgvi
    public final long zzu() throws IOException {
        return zzq();
    }

    @Override // com.google.android.gms.internal.ads.zzgvi
    public final zzgvc zzv() throws IOException {
        int zzi = zzi();
        int i10 = this.zzg;
        int i11 = this.zzi;
        if (zzi <= i10 - i11 && zzi > 0) {
            zzgvc zzv = zzgvc.zzv(this.zzf, i11, zzi);
            this.zzi += zzi;
            return zzv;
        } else if (zzi == 0) {
            return zzgvc.zzb;
        } else {
            if (zzi >= 0) {
                byte[] zzN = zzN(zzi);
                if (zzN != null) {
                    return zzgvc.zzv(zzN, 0, zzN.length);
                }
                int i12 = this.zzi;
                int i13 = this.zzg;
                int i14 = i13 - i12;
                this.zzk += i13;
                this.zzi = 0;
                this.zzg = 0;
                List<byte[]> zzI = zzI(zzi - i14);
                byte[] bArr = new byte[zzi];
                System.arraycopy(this.zzf, i12, bArr, 0, i14);
                for (byte[] bArr2 : zzI) {
                    int length = bArr2.length;
                    System.arraycopy(bArr2, 0, bArr, i14, length);
                    i14 += length;
                }
                zzgvc zzgvcVar = zzgvc.zzb;
                return new zzguz(bArr);
            }
            throw new zzgwz("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgvi
    public final String zzw() throws IOException {
        int zzi = zzi();
        if (zzi > 0) {
            int i10 = this.zzg;
            int i11 = this.zzi;
            if (zzi <= i10 - i11) {
                String str = new String(this.zzf, i11, zzi, zzgwx.zza);
                this.zzi += zzi;
                return str;
            }
        }
        if (zzi == 0) {
            return "";
        }
        if (zzi >= 0) {
            if (zzi <= this.zzg) {
                zzK(zzi);
                String str2 = new String(this.zzf, this.zzi, zzi, zzgwx.zza);
                this.zzi += zzi;
                return str2;
            }
            return new String(zzM(zzi, false), zzgwx.zza);
        }
        throw new zzgwz("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }

    @Override // com.google.android.gms.internal.ads.zzgvi
    public final String zzx() throws IOException {
        byte[] zzM;
        int zzi = zzi();
        int i10 = this.zzi;
        int i11 = this.zzg;
        if (zzi <= i11 - i10 && zzi > 0) {
            zzM = this.zzf;
            this.zzi = i10 + zzi;
        } else if (zzi == 0) {
            return "";
        } else {
            if (zzi < 0) {
                throw new zzgwz("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
            }
            if (zzi <= i11) {
                zzK(zzi);
                zzM = this.zzf;
                this.zzi = zzi;
            } else {
                zzM = zzM(zzi, false);
            }
            i10 = 0;
        }
        return zzgzm.zzh(zzM, i10, zzi);
    }

    @Override // com.google.android.gms.internal.ads.zzgvi
    public final void zzy(int i10) throws zzgwz {
        if (this.zzj != i10) {
            throw new zzgwz("Protocol message end-group tag did not match expected tag.");
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgvi
    public final void zzz(int i10) {
        this.zzl = i10;
        zzJ();
    }
}
