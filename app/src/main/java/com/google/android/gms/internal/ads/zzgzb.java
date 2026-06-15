package com.google.android.gms.internal.ads;

import com.ironsource.mediationsdk.logger.IronSourceError;
import java.io.IOException;
import java.util.Arrays;
/* compiled from: com.google.android.gms:play-services-ads-lite@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzgzb {
    private static final zzgzb zza = new zzgzb(0, new int[0], new Object[0], false);
    private int zzb;
    private int[] zzc;
    private Object[] zzd;
    private int zze;
    private boolean zzf;

    private zzgzb() {
        this(0, new int[8], new Object[8], true);
    }

    private zzgzb(int i10, int[] iArr, Object[] objArr, boolean z10) {
        this.zze = -1;
        this.zzb = i10;
        this.zzc = iArr;
        this.zzd = objArr;
        this.zzf = z10;
    }

    public static zzgzb zzc() {
        return zza;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static zzgzb zze(zzgzb zzgzbVar, zzgzb zzgzbVar2) {
        int i10 = zzgzbVar.zzb + zzgzbVar2.zzb;
        int[] copyOf = Arrays.copyOf(zzgzbVar.zzc, i10);
        System.arraycopy(zzgzbVar2.zzc, 0, copyOf, zzgzbVar.zzb, zzgzbVar2.zzb);
        Object[] copyOf2 = Arrays.copyOf(zzgzbVar.zzd, i10);
        System.arraycopy(zzgzbVar2.zzd, 0, copyOf2, zzgzbVar.zzb, zzgzbVar2.zzb);
        return new zzgzb(i10, copyOf, copyOf2, true);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static zzgzb zzf() {
        return new zzgzb();
    }

    private final void zzn(int i10) {
        int[] iArr = this.zzc;
        if (i10 > iArr.length) {
            int i11 = this.zzb;
            int i12 = i11 + (i11 / 2);
            if (i12 >= i10) {
                i10 = i12;
            }
            if (i10 < 8) {
                i10 = 8;
            }
            this.zzc = Arrays.copyOf(iArr, i10);
            this.zzd = Arrays.copyOf(this.zzd, i10);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && (obj instanceof zzgzb)) {
            zzgzb zzgzbVar = (zzgzb) obj;
            int i10 = this.zzb;
            if (i10 == zzgzbVar.zzb) {
                int[] iArr = this.zzc;
                int[] iArr2 = zzgzbVar.zzc;
                int i11 = 0;
                while (true) {
                    if (i11 >= i10) {
                        Object[] objArr = this.zzd;
                        Object[] objArr2 = zzgzbVar.zzd;
                        int i12 = this.zzb;
                        for (int i13 = 0; i13 < i12; i13++) {
                            if (objArr[i13].equals(objArr2[i13])) {
                            }
                        }
                        return true;
                    } else if (iArr[i11] != iArr2[i11]) {
                        break;
                    } else {
                        i11++;
                    }
                }
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        int i10 = this.zzb;
        int i11 = i10 + IronSourceError.ERROR_NON_EXISTENT_INSTANCE;
        int[] iArr = this.zzc;
        int i12 = 17;
        int i13 = 17;
        for (int i14 = 0; i14 < i10; i14++) {
            i13 = (i13 * 31) + iArr[i14];
        }
        int i15 = ((i11 * 31) + i13) * 31;
        Object[] objArr = this.zzd;
        int i16 = this.zzb;
        for (int i17 = 0; i17 < i16; i17++) {
            i12 = (i12 * 31) + objArr[i17].hashCode();
        }
        return i15 + i12;
    }

    public final int zza() {
        int zzD;
        int zzE;
        int i10;
        int i11 = this.zze;
        if (i11 == -1) {
            int i12 = 0;
            for (int i13 = 0; i13 < this.zzb; i13++) {
                int i14 = this.zzc[i13];
                int i15 = i14 >>> 3;
                int i16 = i14 & 7;
                if (i16 != 0) {
                    if (i16 == 1) {
                        ((Long) this.zzd[i13]).longValue();
                        i10 = zzgvp.zzD(i15 << 3) + 8;
                    } else if (i16 == 2) {
                        int zzD2 = zzgvp.zzD(i15 << 3);
                        int zzd = ((zzgvc) this.zzd[i13]).zzd();
                        i10 = zzD2 + zzgvp.zzD(zzd) + zzd;
                    } else if (i16 == 3) {
                        int zzD3 = zzgvp.zzD(i15 << 3);
                        zzD = zzD3 + zzD3;
                        zzE = ((zzgzb) this.zzd[i13]).zza();
                    } else if (i16 == 5) {
                        ((Integer) this.zzd[i13]).intValue();
                        i10 = zzgvp.zzD(i15 << 3) + 4;
                    } else {
                        throw new IllegalStateException(new zzgwy("Protocol message tag had invalid wire type."));
                    }
                    i12 += i10;
                } else {
                    int i17 = i15 << 3;
                    long longValue = ((Long) this.zzd[i13]).longValue();
                    zzD = zzgvp.zzD(i17);
                    zzE = zzgvp.zzE(longValue);
                }
                i10 = zzD + zzE;
                i12 += i10;
            }
            this.zze = i12;
            return i12;
        }
        return i11;
    }

    public final int zzb() {
        int i10 = this.zze;
        if (i10 == -1) {
            int i11 = 0;
            for (int i12 = 0; i12 < this.zzb; i12++) {
                int zzD = zzgvp.zzD(8);
                int zzD2 = zzgvp.zzD(16) + zzgvp.zzD(this.zzc[i12] >>> 3);
                int zzD3 = zzgvp.zzD(24);
                int zzd = ((zzgvc) this.zzd[i12]).zzd();
                i11 += zzD + zzD + zzD2 + zzD3 + zzgvp.zzD(zzd) + zzd;
            }
            this.zze = i11;
            return i11;
        }
        return i10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final zzgzb zzd(zzgzb zzgzbVar) {
        if (zzgzbVar.equals(zza)) {
            return this;
        }
        zzg();
        int i10 = this.zzb + zzgzbVar.zzb;
        zzn(i10);
        System.arraycopy(zzgzbVar.zzc, 0, this.zzc, this.zzb, zzgzbVar.zzb);
        System.arraycopy(zzgzbVar.zzd, 0, this.zzd, this.zzb, zzgzbVar.zzb);
        this.zzb = i10;
        return this;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zzg() {
        if (!this.zzf) {
            throw new UnsupportedOperationException();
        }
    }

    public final void zzh() {
        if (this.zzf) {
            this.zzf = false;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zzi(StringBuilder sb, int i10) {
        for (int i11 = 0; i11 < this.zzb; i11++) {
            zzgxx.zzb(sb, i10, String.valueOf(this.zzc[i11] >>> 3), this.zzd[i11]);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zzj(int i10, Object obj) {
        zzg();
        zzn(this.zzb + 1);
        int[] iArr = this.zzc;
        int i11 = this.zzb;
        iArr[i11] = i10;
        this.zzd[i11] = obj;
        this.zzb = i11 + 1;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zzk(zzgzp zzgzpVar) throws IOException {
        for (int i10 = 0; i10 < this.zzb; i10++) {
            zzgzpVar.zzw(this.zzc[i10] >>> 3, this.zzd[i10]);
        }
    }

    public final void zzl(zzgzp zzgzpVar) throws IOException {
        if (this.zzb != 0) {
            for (int i10 = 0; i10 < this.zzb; i10++) {
                int i11 = this.zzc[i10];
                Object obj = this.zzd[i10];
                int i12 = i11 & 7;
                int i13 = i11 >>> 3;
                if (i12 == 0) {
                    zzgzpVar.zzt(i13, ((Long) obj).longValue());
                } else if (i12 == 1) {
                    zzgzpVar.zzm(i13, ((Long) obj).longValue());
                } else if (i12 == 2) {
                    zzgzpVar.zzd(i13, (zzgvc) obj);
                } else if (i12 == 3) {
                    zzgzpVar.zzF(i13);
                    ((zzgzb) obj).zzl(zzgzpVar);
                    zzgzpVar.zzh(i13);
                } else if (i12 == 5) {
                    zzgzpVar.zzk(i13, ((Integer) obj).intValue());
                } else {
                    throw new RuntimeException(new zzgwy("Protocol message tag had invalid wire type."));
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean zzm(int i10, zzgvi zzgviVar) throws IOException {
        int zzl;
        zzg();
        int i11 = i10 & 7;
        if (i11 == 0) {
            zzj(i10, Long.valueOf(zzgviVar.zzo()));
            return true;
        } else if (i11 == 1) {
            zzj(i10, Long.valueOf(zzgviVar.zzn()));
            return true;
        } else if (i11 == 2) {
            zzj(i10, zzgviVar.zzv());
            return true;
        } else if (i11 != 3) {
            if (i11 == 4) {
                zzgviVar.zzy(0);
                return false;
            } else if (i11 == 5) {
                zzj(i10, Integer.valueOf(zzgviVar.zzf()));
                return true;
            } else {
                throw new zzgwy("Protocol message tag had invalid wire type.");
            }
        } else {
            zzgzb zzgzbVar = new zzgzb();
            do {
                zzl = zzgviVar.zzl();
                if (zzl == 0) {
                    break;
                }
            } while (zzgzbVar.zzm(zzl, zzgviVar));
            zzgviVar.zzy(4 | ((i10 >>> 3) << 3));
            zzj(i10, zzgzbVar);
            return true;
        }
    }
}
