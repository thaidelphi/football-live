package com.google.android.gms.internal.ads;

import com.google.android.gms.common.api.Api;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.Iterator;
/* compiled from: com.google.android.gms:play-services-ads-lite@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
final class zzgve extends zzgvi {
    private final Iterable zza;
    private final Iterator zzf;
    private ByteBuffer zzg;
    private int zzh;
    private int zzi;
    private int zzj;
    private int zzk;
    private int zzl;
    private long zzm;
    private long zzn;
    private long zzo;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzgve(Iterable iterable, int i10, boolean z10, zzgvh zzgvhVar) {
        super(null);
        this.zzj = Api.BaseClientBuilder.API_PRIORITY_OTHER;
        this.zzh = i10;
        this.zza = iterable;
        this.zzf = iterable.iterator();
        this.zzl = 0;
        if (i10 == 0) {
            this.zzg = zzgwx.zzc;
            this.zzm = 0L;
            this.zzn = 0L;
            this.zzo = 0L;
            return;
        }
        zzM();
    }

    private final int zzI() {
        return (int) (((this.zzh - this.zzl) - this.zzm) + this.zzn);
    }

    private final void zzJ() throws zzgwz {
        if (this.zzf.hasNext()) {
            zzM();
            return;
        }
        throw new zzgwz("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    private final void zzK(byte[] bArr, int i10, int i11) throws IOException {
        if (i11 > zzI()) {
            if (i11 > 0) {
                throw new zzgwz("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
            }
            return;
        }
        int i12 = i11;
        while (i12 > 0) {
            if (this.zzo - this.zzm == 0) {
                zzJ();
            }
            int min = Math.min(i12, (int) (this.zzo - this.zzm));
            long j10 = min;
            zzgzh.zzo(this.zzm, bArr, i11 - i12, j10);
            i12 -= min;
            this.zzm += j10;
        }
    }

    private final void zzL() {
        int i10 = this.zzh + this.zzi;
        this.zzh = i10;
        int i11 = this.zzj;
        if (i10 <= i11) {
            this.zzi = 0;
            return;
        }
        int i12 = i10 - i11;
        this.zzi = i12;
        this.zzh = i10 - i12;
    }

    private final void zzM() {
        ByteBuffer byteBuffer = (ByteBuffer) this.zzf.next();
        this.zzg = byteBuffer;
        this.zzl += (int) (this.zzm - this.zzn);
        long position = byteBuffer.position();
        this.zzm = position;
        this.zzn = position;
        this.zzo = this.zzg.limit();
        long zze = zzgzh.zze(this.zzg);
        this.zzm += zze;
        this.zzn += zze;
        this.zzo += zze;
    }

    @Override // com.google.android.gms.internal.ads.zzgvi
    public final boolean zzA() throws IOException {
        return (((long) this.zzl) + this.zzm) - this.zzn == ((long) this.zzh);
    }

    @Override // com.google.android.gms.internal.ads.zzgvi
    public final boolean zzB() throws IOException {
        return zzr() != 0;
    }

    final long zzC() throws IOException {
        long j10 = 0;
        for (int i10 = 0; i10 < 64; i10 += 7) {
            byte zzh = zzh();
            j10 |= (zzh & Byte.MAX_VALUE) << i10;
            if ((zzh & 128) == 0) {
                return j10;
            }
        }
        throw new zzgwz("CodedInputStream encountered a malformed varint.");
    }

    @Override // com.google.android.gms.internal.ads.zzgvi
    public final double zza() throws IOException {
        return Double.longBitsToDouble(zzq());
    }

    @Override // com.google.android.gms.internal.ads.zzgvi
    public final float zzb() throws IOException {
        return Float.intBitsToFloat(zzi());
    }

    @Override // com.google.android.gms.internal.ads.zzgvi
    public final int zzc() {
        return (int) ((this.zzl + this.zzm) - this.zzn);
    }

    @Override // com.google.android.gms.internal.ads.zzgvi
    public final int zzd(int i10) throws zzgwz {
        if (i10 >= 0) {
            int zzc = i10 + zzc();
            int i11 = this.zzj;
            if (zzc <= i11) {
                this.zzj = zzc;
                zzL();
                return i11;
            }
            throw new zzgwz("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        throw new zzgwz("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }

    @Override // com.google.android.gms.internal.ads.zzgvi
    public final int zze() throws IOException {
        return zzp();
    }

    @Override // com.google.android.gms.internal.ads.zzgvi
    public final int zzf() throws IOException {
        return zzi();
    }

    @Override // com.google.android.gms.internal.ads.zzgvi
    public final int zzg() throws IOException {
        return zzp();
    }

    public final byte zzh() throws IOException {
        if (this.zzo - this.zzm == 0) {
            zzJ();
        }
        long j10 = this.zzm;
        this.zzm = 1 + j10;
        return zzgzh.zza(j10);
    }

    public final int zzi() throws IOException {
        long j10 = this.zzo;
        long j11 = this.zzm;
        if (j10 - j11 >= 4) {
            this.zzm = 4 + j11;
            return (zzgzh.zza(j11) & 255) | ((zzgzh.zza(1 + j11) & 255) << 8) | ((zzgzh.zza(2 + j11) & 255) << 16) | ((zzgzh.zza(j11 + 3) & 255) << 24);
        }
        return (zzh() & 255) | ((zzh() & 255) << 8) | ((zzh() & 255) << 16) | ((zzh() & 255) << 24);
    }

    @Override // com.google.android.gms.internal.ads.zzgvi
    public final int zzj() throws IOException {
        return zzi();
    }

    @Override // com.google.android.gms.internal.ads.zzgvi
    public final int zzk() throws IOException {
        return zzgvi.zzD(zzp());
    }

    @Override // com.google.android.gms.internal.ads.zzgvi
    public final int zzl() throws IOException {
        if (zzA()) {
            this.zzk = 0;
            return 0;
        }
        int zzp = zzp();
        this.zzk = zzp;
        if ((zzp >>> 3) != 0) {
            return zzp;
        }
        throw new zzgwz("Protocol message contained an invalid tag (zero).");
    }

    @Override // com.google.android.gms.internal.ads.zzgvi
    public final int zzm() throws IOException {
        return zzp();
    }

    @Override // com.google.android.gms.internal.ads.zzgvi
    public final long zzn() throws IOException {
        return zzq();
    }

    @Override // com.google.android.gms.internal.ads.zzgvi
    public final long zzo() throws IOException {
        return zzr();
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x0087, code lost:
        if (com.google.android.gms.internal.ads.zzgzh.zza(r4) >= 0) goto L13;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int zzp() throws java.io.IOException {
        /*
            r10 = this;
            long r0 = r10.zzm
            long r2 = r10.zzo
            int r2 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r2 != 0) goto La
            goto L8c
        La:
            r2 = 1
            long r4 = r0 + r2
            byte r0 = com.google.android.gms.internal.ads.zzgzh.zza(r0)
            if (r0 < 0) goto L1a
            long r4 = r10.zzm
            long r4 = r4 + r2
            r10.zzm = r4
            return r0
        L1a:
            long r6 = r10.zzo
            long r8 = r10.zzm
            long r6 = r6 - r8
            r8 = 10
            int r1 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r1 < 0) goto L8c
            long r6 = r4 + r2
            byte r1 = com.google.android.gms.internal.ads.zzgzh.zza(r4)
            int r1 = r1 << 7
            r0 = r0 ^ r1
            if (r0 >= 0) goto L33
            r0 = r0 ^ (-128(0xffffffffffffff80, float:NaN))
            goto L89
        L33:
            long r4 = r6 + r2
            byte r1 = com.google.android.gms.internal.ads.zzgzh.zza(r6)
            int r1 = r1 << 14
            r0 = r0 ^ r1
            if (r0 < 0) goto L42
            r0 = r0 ^ 16256(0x3f80, float:2.278E-41)
        L40:
            r6 = r4
            goto L89
        L42:
            long r6 = r4 + r2
            byte r1 = com.google.android.gms.internal.ads.zzgzh.zza(r4)
            int r1 = r1 << 21
            r0 = r0 ^ r1
            if (r0 >= 0) goto L52
            r1 = -2080896(0xffffffffffe03f80, float:NaN)
            r0 = r0 ^ r1
            goto L89
        L52:
            long r4 = r6 + r2
            byte r1 = com.google.android.gms.internal.ads.zzgzh.zza(r6)
            int r6 = r1 << 28
            r0 = r0 ^ r6
            r6 = 266354560(0xfe03f80, float:2.2112565E-29)
            r0 = r0 ^ r6
            if (r1 >= 0) goto L40
            long r6 = r4 + r2
            byte r1 = com.google.android.gms.internal.ads.zzgzh.zza(r4)
            if (r1 >= 0) goto L89
            long r4 = r6 + r2
            byte r1 = com.google.android.gms.internal.ads.zzgzh.zza(r6)
            if (r1 >= 0) goto L40
            long r6 = r4 + r2
            byte r1 = com.google.android.gms.internal.ads.zzgzh.zza(r4)
            if (r1 >= 0) goto L89
            long r4 = r6 + r2
            byte r1 = com.google.android.gms.internal.ads.zzgzh.zza(r6)
            if (r1 >= 0) goto L40
            long r6 = r4 + r2
            byte r1 = com.google.android.gms.internal.ads.zzgzh.zza(r4)
            if (r1 < 0) goto L8c
        L89:
            r10.zzm = r6
            return r0
        L8c:
            long r0 = r10.zzC()
            int r0 = (int) r0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzgve.zzp():int");
    }

    public final long zzq() throws IOException {
        long j10 = this.zzo;
        long j11 = this.zzm;
        if (j10 - j11 >= 8) {
            this.zzm = 8 + j11;
            long zza = zzgzh.zza(j11) & 255;
            long zza2 = (zzgzh.zza(1 + j11) & 255) << 8;
            return ((zzgzh.zza(j11 + 4) & 255) << 32) | zza | zza2 | ((zzgzh.zza(j11 + 2) & 255) << 16) | ((zzgzh.zza(3 + j11) & 255) << 24) | ((zzgzh.zza(j11 + 5) & 255) << 40) | ((zzgzh.zza(j11 + 6) & 255) << 48) | ((zzgzh.zza(j11 + 7) & 255) << 56);
        }
        long zzh = (zzh() & 255) << 8;
        return (zzh() & 255) | zzh | ((zzh() & 255) << 16) | ((zzh() & 255) << 24) | ((zzh() & 255) << 32) | ((zzh() & 255) << 40) | ((zzh() & 255) << 48) | ((zzh() & 255) << 56);
    }

    public final long zzr() throws IOException {
        long zza;
        long j10;
        long j11;
        int i10;
        long j12 = this.zzm;
        if (this.zzo != j12) {
            long j13 = j12 + 1;
            byte zza2 = zzgzh.zza(j12);
            if (zza2 >= 0) {
                this.zzm++;
                return zza2;
            } else if (this.zzo - this.zzm >= 10) {
                long j14 = j13 + 1;
                int zza3 = zza2 ^ (zzgzh.zza(j13) << 7);
                if (zza3 >= 0) {
                    long j15 = j14 + 1;
                    int zza4 = zza3 ^ (zzgzh.zza(j14) << 14);
                    if (zza4 >= 0) {
                        zza = zza4 ^ 16256;
                    } else {
                        j14 = j15 + 1;
                        int zza5 = zza4 ^ (zzgzh.zza(j15) << 21);
                        if (zza5 < 0) {
                            i10 = zza5 ^ (-2080896);
                        } else {
                            j15 = j14 + 1;
                            long zza6 = zza5 ^ (zzgzh.zza(j14) << 28);
                            if (zza6 < 0) {
                                long j16 = j15 + 1;
                                long zza7 = zza6 ^ (zzgzh.zza(j15) << 35);
                                if (zza7 < 0) {
                                    j10 = -34093383808L;
                                } else {
                                    j15 = j16 + 1;
                                    zza6 = zza7 ^ (zzgzh.zza(j16) << 42);
                                    if (zza6 >= 0) {
                                        j11 = 4363953127296L;
                                    } else {
                                        j16 = j15 + 1;
                                        zza7 = zza6 ^ (zzgzh.zza(j15) << 49);
                                        if (zza7 < 0) {
                                            j10 = -558586000294016L;
                                        } else {
                                            j15 = j16 + 1;
                                            zza = (zza7 ^ (zzgzh.zza(j16) << 56)) ^ 71499008037633920L;
                                            if (zza < 0) {
                                                long j17 = 1 + j15;
                                                if (zzgzh.zza(j15) >= 0) {
                                                    j14 = j17;
                                                    this.zzm = j14;
                                                    return zza;
                                                }
                                            }
                                        }
                                    }
                                }
                                zza = zza7 ^ j10;
                                j14 = j16;
                                this.zzm = j14;
                                return zza;
                            }
                            j11 = 266354560;
                            zza = zza6 ^ j11;
                        }
                    }
                    j14 = j15;
                    this.zzm = j14;
                    return zza;
                }
                i10 = zza3 ^ (-128);
                zza = i10;
                this.zzm = j14;
                return zza;
            }
        }
        return zzC();
    }

    @Override // com.google.android.gms.internal.ads.zzgvi
    public final long zzs() throws IOException {
        return zzq();
    }

    @Override // com.google.android.gms.internal.ads.zzgvi
    public final long zzt() throws IOException {
        return zzgvi.zzF(zzr());
    }

    @Override // com.google.android.gms.internal.ads.zzgvi
    public final long zzu() throws IOException {
        return zzr();
    }

    @Override // com.google.android.gms.internal.ads.zzgvi
    public final zzgvc zzv() throws IOException {
        int zzp = zzp();
        if (zzp > 0) {
            long j10 = this.zzo;
            long j11 = this.zzm;
            long j12 = zzp;
            if (j12 <= j10 - j11) {
                byte[] bArr = new byte[zzp];
                zzgzh.zzo(j11, bArr, 0L, j12);
                this.zzm += j12;
                zzgvc zzgvcVar = zzgvc.zzb;
                return new zzguz(bArr);
            }
        }
        if (zzp > 0 && zzp <= zzI()) {
            byte[] bArr2 = new byte[zzp];
            zzK(bArr2, 0, zzp);
            zzgvc zzgvcVar2 = zzgvc.zzb;
            return new zzguz(bArr2);
        } else if (zzp == 0) {
            return zzgvc.zzb;
        } else {
            if (zzp < 0) {
                throw new zzgwz("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
            }
            throw new zzgwz("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgvi
    public final String zzw() throws IOException {
        int zzp = zzp();
        if (zzp > 0) {
            long j10 = this.zzo;
            long j11 = this.zzm;
            long j12 = zzp;
            if (j12 <= j10 - j11) {
                byte[] bArr = new byte[zzp];
                zzgzh.zzo(j11, bArr, 0L, j12);
                String str = new String(bArr, zzgwx.zza);
                this.zzm += j12;
                return str;
            }
        }
        if (zzp > 0 && zzp <= zzI()) {
            byte[] bArr2 = new byte[zzp];
            zzK(bArr2, 0, zzp);
            return new String(bArr2, zzgwx.zza);
        } else if (zzp == 0) {
            return "";
        } else {
            if (zzp < 0) {
                throw new zzgwz("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
            }
            throw new zzgwz("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgvi
    public final String zzx() throws IOException {
        int zzp = zzp();
        if (zzp > 0) {
            long j10 = this.zzo;
            long j11 = this.zzm;
            long j12 = zzp;
            if (j12 <= j10 - j11) {
                String zzg = zzgzm.zzg(this.zzg, (int) (j11 - this.zzn), zzp);
                this.zzm += j12;
                return zzg;
            }
        }
        if (zzp >= 0 && zzp <= zzI()) {
            byte[] bArr = new byte[zzp];
            zzK(bArr, 0, zzp);
            return zzgzm.zzh(bArr, 0, zzp);
        } else if (zzp == 0) {
            return "";
        } else {
            if (zzp <= 0) {
                throw new zzgwz("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
            }
            throw new zzgwz("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgvi
    public final void zzy(int i10) throws zzgwz {
        if (this.zzk != i10) {
            throw new zzgwz("Protocol message end-group tag did not match expected tag.");
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgvi
    public final void zzz(int i10) {
        this.zzj = i10;
        zzL();
    }
}
