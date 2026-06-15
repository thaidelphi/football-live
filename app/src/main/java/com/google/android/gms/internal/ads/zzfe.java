package com.google.android.gms.internal.ads;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzfe {
    private byte[] zza;
    private int zzb;
    private int zzc;
    private int zzd = 0;

    public zzfe(byte[] bArr, int i10, int i11) {
        this.zza = bArr;
        this.zzc = i10;
        this.zzb = i11;
        zzj();
    }

    private final int zzi() {
        int i10 = 0;
        while (!zzh()) {
            i10++;
        }
        return ((1 << i10) - 1) + (i10 > 0 ? zza(i10) : 0);
    }

    private final void zzj() {
        int i10;
        int i11 = this.zzc;
        boolean z10 = true;
        if (i11 < 0 || (i11 >= (i10 = this.zzb) && (i11 != i10 || this.zzd != 0))) {
            z10 = false;
        }
        zzcv.zzf(z10);
    }

    private final boolean zzk(int i10) {
        if (i10 < 2 || i10 >= this.zzb) {
            return false;
        }
        byte[] bArr = this.zza;
        return bArr[i10] == 3 && bArr[i10 + (-2)] == 0 && bArr[i10 + (-1)] == 0;
    }

    public final int zza(int i10) {
        int i11;
        this.zzd += i10;
        int i12 = 0;
        while (true) {
            i11 = this.zzd;
            if (i11 <= 8) {
                break;
            }
            int i13 = i11 - 8;
            this.zzd = i13;
            byte[] bArr = this.zza;
            int i14 = this.zzc;
            i12 |= (bArr[i14] & 255) << i13;
            if (true != zzk(i14 + 1)) {
                r3 = 1;
            }
            this.zzc = i14 + r3;
        }
        byte[] bArr2 = this.zza;
        int i15 = this.zzc;
        int i16 = i12 | ((bArr2[i15] & 255) >> (8 - i11));
        int i17 = 32 - i10;
        if (i11 == 8) {
            this.zzd = 0;
            this.zzc = i15 + (true != zzk(i15 + 1) ? 1 : 2);
        }
        int i18 = ((-1) >>> i17) & i16;
        zzj();
        return i18;
    }

    public final int zzb() {
        int zzi = zzi();
        return (zzi % 2 == 0 ? -1 : 1) * ((zzi + 1) / 2);
    }

    public final int zzc() {
        return zzi();
    }

    public final void zzd() {
        int i10 = this.zzd;
        if (i10 > 0) {
            zzf(8 - i10);
        }
    }

    public final void zze() {
        int i10 = this.zzd + 1;
        this.zzd = i10;
        if (i10 == 8) {
            this.zzd = 0;
            int i11 = this.zzc;
            this.zzc = i11 + (true == zzk(i11 + 1) ? 2 : 1);
        }
        zzj();
    }

    public final void zzf(int i10) {
        int i11 = this.zzc;
        int i12 = i10 / 8;
        int i13 = i11 + i12;
        this.zzc = i13;
        int i14 = this.zzd + (i10 - (i12 * 8));
        this.zzd = i14;
        if (i14 > 7) {
            this.zzc = i13 + 1;
            this.zzd = i14 - 8;
        }
        while (true) {
            i11++;
            if (i11 > this.zzc) {
                zzj();
                return;
            } else if (zzk(i11)) {
                this.zzc++;
                i11 += 2;
            }
        }
    }

    public final boolean zzg(int i10) {
        int i11 = this.zzc;
        int i12 = i10 / 8;
        int i13 = i11 + i12;
        int i14 = (this.zzd + i10) - (i12 * 8);
        if (i14 > 7) {
            i13++;
            i14 -= 8;
        }
        while (true) {
            i11++;
            if (i11 > i13 || i13 >= this.zzb) {
                break;
            } else if (zzk(i11)) {
                i13++;
                i11 += 2;
            }
        }
        int i15 = this.zzb;
        if (i13 >= i15) {
            return i13 == i15 && i14 == 0;
        }
        return true;
    }

    public final boolean zzh() {
        int i10 = this.zza[this.zzc] & (128 >> this.zzd);
        zze();
        return i10 != 0;
    }
}
