package com.google.android.gms.internal.ads;

import com.google.android.gms.common.api.Api;
import java.io.IOException;
import java.util.Arrays;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads-lite@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzgvd extends zzgvi {
    private final byte[] zza;
    private int zzf;
    private int zzg;
    private int zzh;
    private final int zzi;
    private int zzj;
    private int zzk;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzgvd(byte[] bArr, int i10, int i11, boolean z10, zzgvh zzgvhVar) {
        super(null);
        this.zzk = Api.BaseClientBuilder.API_PRIORITY_OTHER;
        this.zza = bArr;
        this.zzf = i11 + i10;
        this.zzh = i10;
        this.zzi = i10;
    }

    private final void zzC() {
        int i10 = this.zzf + this.zzg;
        this.zzf = i10;
        int i11 = i10 - this.zzi;
        int i12 = this.zzk;
        if (i11 <= i12) {
            this.zzg = 0;
            return;
        }
        int i13 = i11 - i12;
        this.zzg = i13;
        this.zzf = i10 - i13;
    }

    @Override // com.google.android.gms.internal.ads.zzgvi
    public final boolean zzA() throws IOException {
        return this.zzh == this.zzf;
    }

    @Override // com.google.android.gms.internal.ads.zzgvi
    public final boolean zzB() throws IOException {
        return zzq() != 0;
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
        return this.zzh - this.zzi;
    }

    @Override // com.google.android.gms.internal.ads.zzgvi
    public final int zzd(int i10) throws zzgwz {
        if (i10 >= 0) {
            int i11 = i10 + (this.zzh - this.zzi);
            if (i11 >= 0) {
                int i12 = this.zzk;
                if (i11 <= i12) {
                    this.zzk = i11;
                    zzC();
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
        int i10 = this.zzh;
        if (this.zzf - i10 >= 4) {
            byte[] bArr = this.zza;
            this.zzh = i10 + 4;
            int i11 = (bArr[i10 + 1] & 255) << 8;
            return ((bArr[i10 + 3] & 255) << 24) | i11 | (bArr[i10] & 255) | ((bArr[i10 + 2] & 255) << 16);
        }
        throw new zzgwz("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
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
            int r0 = r5.zzh
            int r1 = r5.zzf
            if (r1 != r0) goto L7
            goto L6d
        L7:
            byte[] r2 = r5.zza
            int r3 = r0 + 1
            r0 = r2[r0]
            if (r0 < 0) goto L12
            r5.zzh = r3
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
            r5.zzh = r1
            return r0
        L6d:
            long r0 = r5.zzr()
            int r0 = (int) r0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzgvd.zzi():int");
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
        int i10 = this.zzh;
        if (this.zzf - i10 >= 8) {
            byte[] bArr = this.zza;
            this.zzh = i10 + 8;
            long j10 = bArr[i10 + 2];
            long j11 = bArr[i10 + 3];
            return ((bArr[i10 + 7] & 255) << 56) | (bArr[i10] & 255) | ((bArr[i10 + 1] & 255) << 8) | ((j10 & 255) << 16) | ((j11 & 255) << 24) | ((bArr[i10 + 4] & 255) << 32) | ((bArr[i10 + 5] & 255) << 40) | ((bArr[i10 + 6] & 255) << 48);
        }
        throw new zzgwz("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    public final long zzq() throws IOException {
        long j10;
        long j11;
        long j12;
        long j13;
        int i10;
        int i11 = this.zzh;
        int i12 = this.zzf;
        if (i12 != i11) {
            byte[] bArr = this.zza;
            int i13 = i11 + 1;
            byte b10 = bArr[i11];
            if (b10 >= 0) {
                this.zzh = i13;
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
                                                    this.zzh = i14;
                                                    return j11;
                                                }
                                            }
                                        }
                                    }
                                }
                                j11 = j12 ^ j15;
                                i14 = i19;
                                this.zzh = i14;
                                return j11;
                            }
                            j13 = 266354560;
                            j10 = j14 ^ j13;
                        }
                    }
                    i14 = i16;
                    j11 = j10;
                    this.zzh = i14;
                    return j11;
                }
                i10 = i15 ^ (-128);
                j11 = i10;
                this.zzh = i14;
                return j11;
            }
        }
        return zzr();
    }

    final long zzr() throws IOException {
        long j10 = 0;
        for (int i10 = 0; i10 < 64; i10 += 7) {
            int i11 = this.zzh;
            if (i11 != this.zzf) {
                byte[] bArr = this.zza;
                this.zzh = i11 + 1;
                byte b10 = bArr[i11];
                j10 |= (b10 & Byte.MAX_VALUE) << i10;
                if ((b10 & 128) == 0) {
                    return j10;
                }
            } else {
                throw new zzgwz("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
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
        if (zzi > 0) {
            int i10 = this.zzf;
            int i11 = this.zzh;
            if (zzi <= i10 - i11) {
                zzgvc zzv = zzgvc.zzv(this.zza, i11, zzi);
                this.zzh += zzi;
                return zzv;
            }
        }
        if (zzi != 0) {
            if (zzi > 0) {
                int i12 = this.zzf;
                int i13 = this.zzh;
                if (zzi <= i12 - i13) {
                    int i14 = zzi + i13;
                    this.zzh = i14;
                    byte[] copyOfRange = Arrays.copyOfRange(this.zza, i13, i14);
                    zzgvc zzgvcVar = zzgvc.zzb;
                    return new zzguz(copyOfRange);
                }
            }
            if (zzi <= 0) {
                throw new zzgwz("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
            }
            throw new zzgwz("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        return zzgvc.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzgvi
    public final String zzw() throws IOException {
        int zzi = zzi();
        if (zzi > 0) {
            int i10 = this.zzf;
            int i11 = this.zzh;
            if (zzi <= i10 - i11) {
                String str = new String(this.zza, i11, zzi, zzgwx.zza);
                this.zzh += zzi;
                return str;
            }
        }
        if (zzi == 0) {
            return "";
        }
        if (zzi < 0) {
            throw new zzgwz("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        throw new zzgwz("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    @Override // com.google.android.gms.internal.ads.zzgvi
    public final String zzx() throws IOException {
        int zzi = zzi();
        if (zzi > 0) {
            int i10 = this.zzf;
            int i11 = this.zzh;
            if (zzi <= i10 - i11) {
                String zzh = zzgzm.zzh(this.zza, i11, zzi);
                this.zzh += zzi;
                return zzh;
            }
        }
        if (zzi == 0) {
            return "";
        }
        if (zzi <= 0) {
            throw new zzgwz("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        throw new zzgwz("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    @Override // com.google.android.gms.internal.ads.zzgvi
    public final void zzy(int i10) throws zzgwz {
        if (this.zzj != i10) {
            throw new zzgwz("Protocol message end-group tag did not match expected tag.");
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgvi
    public final void zzz(int i10) {
        this.zzk = i10;
        zzC();
    }
}
