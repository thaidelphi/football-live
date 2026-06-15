package com.google.android.gms.internal.ads;

import com.google.android.gms.common.api.Api;
import java.io.IOException;
import java.nio.ByteBuffer;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads-lite@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzgvg extends zzgvi {
    public static final /* synthetic */ int zza = 0;
    private final ByteBuffer zzf;
    private final long zzg;
    private long zzh;
    private long zzi;
    private final long zzj;
    private int zzk;
    private int zzl;
    private int zzm;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzgvg(ByteBuffer byteBuffer, boolean z10, zzgvh zzgvhVar) {
        super(null);
        this.zzm = Api.BaseClientBuilder.API_PRIORITY_OTHER;
        this.zzf = byteBuffer.duplicate();
        long zze = zzgzh.zze(byteBuffer);
        this.zzg = zze;
        this.zzh = byteBuffer.limit() + zze;
        long position = zze + byteBuffer.position();
        this.zzi = position;
        this.zzj = position;
    }

    private final int zzC() {
        return (int) (this.zzh - this.zzi);
    }

    private final void zzI() {
        long j10 = this.zzh + this.zzk;
        this.zzh = j10;
        int i10 = (int) (j10 - this.zzj);
        int i11 = this.zzm;
        if (i10 <= i11) {
            this.zzk = 0;
            return;
        }
        int i12 = i10 - i11;
        this.zzk = i12;
        this.zzh = j10 - i12;
    }

    @Override // com.google.android.gms.internal.ads.zzgvi
    public final boolean zzA() throws IOException {
        return this.zzi == this.zzh;
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
        return (int) (this.zzi - this.zzj);
    }

    @Override // com.google.android.gms.internal.ads.zzgvi
    public final int zzd(int i10) throws zzgwz {
        if (i10 >= 0) {
            int zzc = i10 + zzc();
            int i11 = this.zzm;
            if (zzc <= i11) {
                this.zzm = zzc;
                zzI();
                return i11;
            }
            throw new zzgwz("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
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
        long j10 = this.zzi;
        if (this.zzh - j10 >= 4) {
            this.zzi = 4 + j10;
            int zza2 = (zzgzh.zza(1 + j10) & 255) << 8;
            return ((zzgzh.zza(j10 + 3) & 255) << 24) | zza2 | (zzgzh.zza(j10) & 255) | ((zzgzh.zza(2 + j10) & 255) << 16);
        }
        throw new zzgwz("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x0082, code lost:
        if (com.google.android.gms.internal.ads.zzgzh.zza(r4) >= 0) goto L13;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int zzi() throws java.io.IOException {
        /*
            r10 = this;
            long r0 = r10.zzi
            long r2 = r10.zzh
            int r2 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r2 != 0) goto La
            goto L87
        La:
            r2 = 1
            long r4 = r0 + r2
            byte r0 = com.google.android.gms.internal.ads.zzgzh.zza(r0)
            if (r0 < 0) goto L17
            r10.zzi = r4
            return r0
        L17:
            long r6 = r10.zzh
            long r6 = r6 - r4
            r8 = 9
            int r1 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r1 < 0) goto L87
            long r6 = r4 + r2
            byte r1 = com.google.android.gms.internal.ads.zzgzh.zza(r4)
            int r1 = r1 << 7
            r0 = r0 ^ r1
            if (r0 >= 0) goto L2e
            r0 = r0 ^ (-128(0xffffffffffffff80, float:NaN))
            goto L84
        L2e:
            long r4 = r6 + r2
            byte r1 = com.google.android.gms.internal.ads.zzgzh.zza(r6)
            int r1 = r1 << 14
            r0 = r0 ^ r1
            if (r0 < 0) goto L3d
            r0 = r0 ^ 16256(0x3f80, float:2.278E-41)
        L3b:
            r6 = r4
            goto L84
        L3d:
            long r6 = r4 + r2
            byte r1 = com.google.android.gms.internal.ads.zzgzh.zza(r4)
            int r1 = r1 << 21
            r0 = r0 ^ r1
            if (r0 >= 0) goto L4d
            r1 = -2080896(0xffffffffffe03f80, float:NaN)
            r0 = r0 ^ r1
            goto L84
        L4d:
            long r4 = r6 + r2
            byte r1 = com.google.android.gms.internal.ads.zzgzh.zza(r6)
            int r6 = r1 << 28
            r0 = r0 ^ r6
            r6 = 266354560(0xfe03f80, float:2.2112565E-29)
            r0 = r0 ^ r6
            if (r1 >= 0) goto L3b
            long r6 = r4 + r2
            byte r1 = com.google.android.gms.internal.ads.zzgzh.zza(r4)
            if (r1 >= 0) goto L84
            long r4 = r6 + r2
            byte r1 = com.google.android.gms.internal.ads.zzgzh.zza(r6)
            if (r1 >= 0) goto L3b
            long r6 = r4 + r2
            byte r1 = com.google.android.gms.internal.ads.zzgzh.zza(r4)
            if (r1 >= 0) goto L84
            long r4 = r6 + r2
            byte r1 = com.google.android.gms.internal.ads.zzgzh.zza(r6)
            if (r1 >= 0) goto L3b
            long r6 = r4 + r2
            byte r1 = com.google.android.gms.internal.ads.zzgzh.zza(r4)
            if (r1 < 0) goto L87
        L84:
            r10.zzi = r6
            return r0
        L87:
            long r0 = r10.zzr()
            int r0 = (int) r0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzgvg.zzi():int");
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
            this.zzl = 0;
            return 0;
        }
        int zzi = zzi();
        this.zzl = zzi;
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
        long j10 = this.zzi;
        if (this.zzh - j10 >= 8) {
            this.zzi = 8 + j10;
            return ((zzgzh.zza(j10 + 7) & 255) << 56) | (zzgzh.zza(j10) & 255) | ((zzgzh.zza(1 + j10) & 255) << 8) | ((zzgzh.zza(2 + j10) & 255) << 16) | ((zzgzh.zza(3 + j10) & 255) << 24) | ((zzgzh.zza(4 + j10) & 255) << 32) | ((zzgzh.zza(5 + j10) & 255) << 40) | ((zzgzh.zza(6 + j10) & 255) << 48);
        }
        throw new zzgwz("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    public final long zzq() throws IOException {
        long zza2;
        long j10;
        long j11;
        int i10;
        long j12 = this.zzi;
        if (this.zzh != j12) {
            long j13 = j12 + 1;
            byte zza3 = zzgzh.zza(j12);
            if (zza3 >= 0) {
                this.zzi = j13;
                return zza3;
            } else if (this.zzh - j13 >= 9) {
                long j14 = j13 + 1;
                int zza4 = zza3 ^ (zzgzh.zza(j13) << 7);
                if (zza4 >= 0) {
                    long j15 = j14 + 1;
                    int zza5 = zza4 ^ (zzgzh.zza(j14) << 14);
                    if (zza5 >= 0) {
                        zza2 = zza5 ^ 16256;
                    } else {
                        j14 = j15 + 1;
                        int zza6 = zza5 ^ (zzgzh.zza(j15) << 21);
                        if (zza6 < 0) {
                            i10 = zza6 ^ (-2080896);
                        } else {
                            j15 = j14 + 1;
                            long zza7 = zza6 ^ (zzgzh.zza(j14) << 28);
                            if (zza7 < 0) {
                                long j16 = j15 + 1;
                                long zza8 = zza7 ^ (zzgzh.zza(j15) << 35);
                                if (zza8 < 0) {
                                    j10 = -34093383808L;
                                } else {
                                    j15 = j16 + 1;
                                    zza7 = zza8 ^ (zzgzh.zza(j16) << 42);
                                    if (zza7 >= 0) {
                                        j11 = 4363953127296L;
                                    } else {
                                        j16 = j15 + 1;
                                        zza8 = zza7 ^ (zzgzh.zza(j15) << 49);
                                        if (zza8 < 0) {
                                            j10 = -558586000294016L;
                                        } else {
                                            j15 = j16 + 1;
                                            zza2 = (zza8 ^ (zzgzh.zza(j16) << 56)) ^ 71499008037633920L;
                                            if (zza2 < 0) {
                                                long j17 = 1 + j15;
                                                if (zzgzh.zza(j15) >= 0) {
                                                    j14 = j17;
                                                    this.zzi = j14;
                                                    return zza2;
                                                }
                                            }
                                        }
                                    }
                                }
                                zza2 = zza8 ^ j10;
                                j14 = j16;
                                this.zzi = j14;
                                return zza2;
                            }
                            j11 = 266354560;
                            zza2 = zza7 ^ j11;
                        }
                    }
                    j14 = j15;
                    this.zzi = j14;
                    return zza2;
                }
                i10 = zza4 ^ (-128);
                zza2 = i10;
                this.zzi = j14;
                return zza2;
            }
        }
        return zzr();
    }

    final long zzr() throws IOException {
        long j10 = 0;
        for (int i10 = 0; i10 < 64; i10 += 7) {
            long j11 = this.zzi;
            if (j11 != this.zzh) {
                this.zzi = 1 + j11;
                byte zza2 = zzgzh.zza(j11);
                j10 |= (zza2 & Byte.MAX_VALUE) << i10;
                if ((zza2 & 128) == 0) {
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
        if (zzi <= 0 || zzi > zzC()) {
            if (zzi == 0) {
                return zzgvc.zzb;
            }
            if (zzi < 0) {
                throw new zzgwz("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
            }
            throw new zzgwz("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        byte[] bArr = new byte[zzi];
        long j10 = zzi;
        zzgzh.zzo(this.zzi, bArr, 0L, j10);
        this.zzi += j10;
        zzgvc zzgvcVar = zzgvc.zzb;
        return new zzguz(bArr);
    }

    @Override // com.google.android.gms.internal.ads.zzgvi
    public final String zzw() throws IOException {
        int zzi = zzi();
        if (zzi <= 0 || zzi > zzC()) {
            if (zzi == 0) {
                return "";
            }
            if (zzi < 0) {
                throw new zzgwz("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
            }
            throw new zzgwz("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        byte[] bArr = new byte[zzi];
        long j10 = zzi;
        zzgzh.zzo(this.zzi, bArr, 0L, j10);
        String str = new String(bArr, zzgwx.zza);
        this.zzi += j10;
        return str;
    }

    @Override // com.google.android.gms.internal.ads.zzgvi
    public final String zzx() throws IOException {
        int zzi = zzi();
        if (zzi > 0 && zzi <= zzC()) {
            String zzg = zzgzm.zzg(this.zzf, (int) (this.zzi - this.zzg), zzi);
            this.zzi += zzi;
            return zzg;
        } else if (zzi == 0) {
            return "";
        } else {
            if (zzi <= 0) {
                throw new zzgwz("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
            }
            throw new zzgwz("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgvi
    public final void zzy(int i10) throws zzgwz {
        if (this.zzl != i10) {
            throw new zzgwz("Protocol message end-group tag did not match expected tag.");
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgvi
    public final void zzz(int i10) {
        this.zzm = i10;
        zzI();
    }
}
