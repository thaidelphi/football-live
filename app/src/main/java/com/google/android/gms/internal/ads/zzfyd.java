package com.google.android.gms.internal.ads;

import java.math.RoundingMode;
import java.util.Arrays;
import java.util.Objects;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzfyd {
    final int zza;
    final int zzb;
    final int zzc;
    final int zzd;
    private final String zze;
    private final char[] zzf;
    private final byte[] zzg;
    private final boolean[] zzh;
    private final boolean zzi;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public zzfyd(java.lang.String r10, char[] r11) {
        /*
            r9 = this;
            r0 = 128(0x80, float:1.794E-43)
            byte[] r1 = new byte[r0]
            r2 = -1
            java.util.Arrays.fill(r1, r2)
            r3 = 0
            r4 = r3
        La:
            int r5 = r11.length
            if (r4 >= r5) goto L2b
            char r5 = r11[r4]
            r6 = 1
            if (r5 >= r0) goto L14
            r7 = r6
            goto L15
        L14:
            r7 = r3
        L15:
            java.lang.String r8 = "Non-ASCII character: %s"
            com.google.android.gms.internal.ads.zzfsv.zzg(r7, r8, r5)
            r7 = r1[r5]
            if (r7 != r2) goto L1f
            goto L20
        L1f:
            r6 = r3
        L20:
            java.lang.String r7 = "Duplicate character: %s"
            com.google.android.gms.internal.ads.zzfsv.zzg(r6, r7, r5)
            byte r6 = (byte) r4
            r1[r5] = r6
            int r4 = r4 + 1
            goto La
        L2b:
            r9.<init>(r10, r11, r1, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzfyd.<init>(java.lang.String, char[]):void");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* bridge */ /* synthetic */ char[] zzf(zzfyd zzfydVar) {
        return zzfydVar.zzf;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof zzfyd) {
            zzfyd zzfydVar = (zzfyd) obj;
            if (this.zzi == zzfydVar.zzi && Arrays.equals(this.zzf, zzfydVar.zzf)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.zzf) + (true != this.zzi ? 1237 : 1231);
    }

    public final String toString() {
        return this.zze;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final char zza(int i10) {
        return this.zzf[i10];
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final int zzb(char c10) throws zzfyg {
        if (c10 <= 127) {
            byte b10 = this.zzg[c10];
            if (b10 == -1) {
                if (c10 > ' ' && c10 != 127) {
                    throw new zzfyg("Unrecognized character: " + c10);
                }
                throw new zzfyg("Unrecognized character: 0x".concat(String.valueOf(Integer.toHexString(c10))));
            }
            return b10;
        }
        throw new zzfyg("Unrecognized character: 0x".concat(String.valueOf(Integer.toHexString(c10))));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v11 */
    public final zzfyd zzc() {
        boolean z10;
        int i10 = 0;
        while (true) {
            char[] cArr = this.zzf;
            if (i10 >= cArr.length) {
                return this;
            }
            if (zzfsb.zze(cArr[i10])) {
                int i11 = 0;
                while (true) {
                    if (i11 >= cArr.length) {
                        z10 = false;
                        break;
                    } else if (zzfsb.zzd(cArr[i11])) {
                        z10 = true;
                        break;
                    } else {
                        i11++;
                    }
                }
                zzfsv.zzm(!z10, "Cannot call lowerCase() on a mixed-case alphabet");
                char[] cArr2 = new char[this.zzf.length];
                int i12 = 0;
                while (true) {
                    char[] cArr3 = this.zzf;
                    if (i12 >= cArr3.length) {
                        break;
                    }
                    char c10 = cArr3[i12];
                    if (zzfsb.zze(c10)) {
                        c10 ^= 32;
                    }
                    cArr2[i12] = (char) c10;
                    i12++;
                }
                zzfyd zzfydVar = new zzfyd(this.zze.concat(".lowerCase()"), cArr2);
                if (!this.zzi || zzfydVar.zzi) {
                    return zzfydVar;
                }
                byte[] bArr = zzfydVar.zzg;
                byte[] copyOf = Arrays.copyOf(bArr, bArr.length);
                for (int i13 = 65; i13 <= 90; i13++) {
                    int i14 = i13 | 32;
                    byte[] bArr2 = zzfydVar.zzg;
                    byte b10 = bArr2[i13];
                    byte b11 = bArr2[i14];
                    if (b10 == -1) {
                        copyOf[i13] = b11;
                    } else {
                        char c11 = (char) i13;
                        char c12 = (char) i14;
                        if (b11 == -1) {
                            copyOf[i14] = b10;
                        } else {
                            throw new IllegalStateException(zzftm.zzb("Can't ignoreCase() since '%s' and '%s' encode different values", Character.valueOf(c11), Character.valueOf(c12)));
                        }
                    }
                }
                return new zzfyd(zzfydVar.zze.concat(".ignoreCase()"), zzfydVar.zzf, copyOf, true);
            }
            i10++;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean zzd(int i10) {
        return this.zzh[i10 % this.zzc];
    }

    public final boolean zze(char c10) {
        byte[] bArr = this.zzg;
        return bArr.length > 61 && bArr[61] != -1;
    }

    private zzfyd(String str, char[] cArr, byte[] bArr, boolean z10) {
        this.zze = str;
        Objects.requireNonNull(cArr);
        this.zzf = cArr;
        try {
            int length = cArr.length;
            int zzc = zzfyr.zzc(length, RoundingMode.UNNECESSARY);
            this.zzb = zzc;
            int numberOfTrailingZeros = Integer.numberOfTrailingZeros(zzc);
            int i10 = 1 << (3 - numberOfTrailingZeros);
            this.zzc = i10;
            this.zzd = zzc >> numberOfTrailingZeros;
            this.zza = length - 1;
            this.zzg = bArr;
            boolean[] zArr = new boolean[i10];
            for (int i11 = 0; i11 < this.zzd; i11++) {
                zArr[zzfyr.zzb(i11 * 8, this.zzb, RoundingMode.CEILING)] = true;
            }
            this.zzh = zArr;
            this.zzi = z10;
        } catch (ArithmeticException e8) {
            int length2 = cArr.length;
            throw new IllegalArgumentException("Illegal alphabet length " + length2, e8);
        }
    }
}
