package com.google.android.gms.internal.ads;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzadb {
    public int zza;
    public String zzb;
    public int zzc;
    public int zzd;
    public int zze;
    public int zzf;
    public int zzg;

    public zzadb() {
    }

    public zzadb(zzadb zzadbVar) {
        this.zza = zzadbVar.zza;
        this.zzb = zzadbVar.zzb;
        this.zzc = zzadbVar.zzc;
        this.zzd = zzadbVar.zzd;
        this.zze = zzadbVar.zze;
        this.zzf = zzadbVar.zzf;
        this.zzg = zzadbVar.zzg;
    }

    public final boolean zza(int i10) {
        boolean zzm;
        int i11;
        int i12;
        int i13;
        int i14;
        String[] strArr;
        int[] iArr;
        int zzl;
        int[] iArr2;
        int[] iArr3;
        int i15;
        int[] iArr4;
        int[] iArr5;
        int i16;
        int[] iArr6;
        zzm = zzadc.zzm(i10);
        if (!zzm || (i11 = (i10 >>> 19) & 3) == 1 || (i12 = (i10 >>> 17) & 3) == 0 || (i13 = (i10 >>> 12) & 15) == 0 || i13 == 15 || (i14 = (i10 >>> 10) & 3) == 3) {
            return false;
        }
        int i17 = i13 - 1;
        this.zza = i11;
        strArr = zzadc.zza;
        this.zzb = strArr[3 - i12];
        iArr = zzadc.zzb;
        int i18 = iArr[i14];
        this.zzd = i18;
        if (i11 == 2) {
            i18 /= 2;
            this.zzd = i18;
        } else if (i11 == 0) {
            i18 /= 4;
            this.zzd = i18;
        }
        int i19 = (i10 >>> 9) & 1;
        zzl = zzadc.zzl(i11, i12);
        this.zzg = zzl;
        if (i12 == 3) {
            if (i11 == 3) {
                iArr6 = zzadc.zzc;
                i16 = iArr6[i17];
            } else {
                iArr5 = zzadc.zzd;
                i16 = iArr5[i17];
            }
            this.zzf = i16;
            this.zzc = (((i16 * 12) / i18) + i19) * 4;
        } else {
            if (i11 == 3) {
                if (i12 == 2) {
                    iArr4 = zzadc.zze;
                    i15 = iArr4[i17];
                } else {
                    iArr3 = zzadc.zzf;
                    i15 = iArr3[i17];
                }
                this.zzf = i15;
                this.zzc = ((i15 * 144) / i18) + i19;
            } else {
                iArr2 = zzadc.zzg;
                int i20 = iArr2[i17];
                this.zzf = i20;
                this.zzc = (((i12 == 1 ? 72 : 144) * i20) / i18) + i19;
            }
        }
        this.zze = ((i10 >> 6) & 3) == 3 ? 1 : 2;
        return true;
    }
}
