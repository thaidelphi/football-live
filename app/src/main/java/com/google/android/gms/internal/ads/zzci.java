package com.google.android.gms.internal.ads;

import com.unity3d.ads.gatewayclient.CommonGatewayClient;
import java.nio.ShortBuffer;
import java.util.Arrays;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
final class zzci {
    private final int zza;
    private final int zzb;
    private final float zzc;
    private final float zzd;
    private final float zze;
    private final int zzf;
    private final int zzg;
    private final int zzh;
    private final short[] zzi;
    private short[] zzj;
    private int zzk;
    private short[] zzl;
    private int zzm;
    private short[] zzn;
    private int zzo;
    private int zzp;
    private int zzq;
    private int zzr;
    private int zzs;
    private int zzt;
    private int zzu;
    private int zzv;
    private double zzw;

    public zzci(int i10, int i11, float f10, float f11, int i12) {
        this.zza = i10;
        this.zzb = i11;
        this.zzc = f10;
        this.zzd = f11;
        this.zze = i10 / i12;
        this.zzf = i10 / CommonGatewayClient.CODE_400;
        int i13 = i10 / 65;
        this.zzg = i13;
        int i14 = i13 + i13;
        this.zzh = i14;
        this.zzi = new short[i14];
        int i15 = i14 * i11;
        this.zzj = new short[i15];
        this.zzl = new short[i15];
        this.zzn = new short[i15];
    }

    private final int zzg(short[] sArr, int i10, int i11, int i12) {
        int i13 = 1;
        int i14 = 255;
        int i15 = 0;
        int i16 = 0;
        while (i11 <= i12) {
            int i17 = 0;
            for (int i18 = 0; i18 < i11; i18++) {
                int i19 = this.zzb * i10;
                i17 += Math.abs(sArr[i19 + i18] - sArr[(i19 + i11) + i18]);
            }
            int i20 = i17 * i15;
            int i21 = i13 * i11;
            if (i20 < i21) {
                i13 = i17;
            }
            if (i20 < i21) {
                i15 = i11;
            }
            int i22 = i17 * i14;
            int i23 = i16 * i11;
            if (i22 > i23) {
                i16 = i17;
            }
            if (i22 > i23) {
                i14 = i11;
            }
            i11++;
        }
        this.zzu = i13 / i15;
        this.zzv = i16 / i14;
        return i15;
    }

    private final void zzh(short[] sArr, int i10, int i11) {
        short[] zzl = zzl(this.zzl, this.zzm, i11);
        this.zzl = zzl;
        int i12 = this.zzm;
        int i13 = this.zzb;
        System.arraycopy(sArr, i10 * i13, zzl, i12 * i13, i11 * i13);
        this.zzm += i11;
    }

    private final void zzi(short[] sArr, int i10, int i11) {
        int i12;
        for (int i13 = 0; i13 < this.zzh / i11; i13++) {
            int i14 = 0;
            int i15 = 0;
            while (true) {
                int i16 = this.zzb;
                i12 = i16 * i11;
                if (i14 < i12) {
                    i15 += sArr[(i16 * i10) + (i12 * i13) + i14];
                    i14++;
                }
            }
            this.zzi[i13] = (short) (i15 / i12);
        }
    }

    private static void zzj(int i10, int i11, short[] sArr, int i12, short[] sArr2, int i13, short[] sArr3, int i14) {
        for (int i15 = 0; i15 < i11; i15++) {
            int i16 = (i13 * i11) + i15;
            int i17 = (i14 * i11) + i15;
            int i18 = (i12 * i11) + i15;
            for (int i19 = 0; i19 < i10; i19++) {
                sArr[i18] = (short) (((sArr2[i16] * (i10 - i19)) + (sArr3[i17] * i19)) / i10);
                i18 += i11;
                i16 += i11;
                i17 += i11;
            }
        }
    }

    private final void zzk() {
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        long j10;
        long j11;
        int i17;
        double d10 = this.zzc / this.zzd;
        int i18 = (d10 > 1.0000100135803223d ? 1 : (d10 == 1.0000100135803223d ? 0 : -1));
        int i19 = this.zzm;
        int i20 = 0;
        int i21 = 1;
        if (i18 <= 0 && d10 >= 0.9999899864196777d) {
            zzh(this.zzj, 0, this.zzk);
            this.zzk = 0;
        } else {
            int i22 = this.zzk;
            if (i22 >= this.zzh) {
                int i23 = 0;
                while (true) {
                    int i24 = this.zzr;
                    if (i24 > 0) {
                        int min = Math.min(this.zzh, i24);
                        zzh(this.zzj, i23, min);
                        this.zzr -= min;
                        i23 += min;
                    } else {
                        short[] sArr = this.zzj;
                        int i25 = this.zza;
                        int i26 = i25 > 4000 ? i25 / 4000 : i21;
                        if (this.zzb == i21 && i26 == i21) {
                            i10 = zzg(sArr, i23, this.zzf, this.zzg);
                        } else {
                            zzi(sArr, i23, i26);
                            int zzg = zzg(this.zzi, i20, this.zzf / i26, this.zzg / i26);
                            if (i26 != i21) {
                                int i27 = zzg * i26;
                                int i28 = i26 * 4;
                                int i29 = this.zzf;
                                int i30 = i27 - i28;
                                if (i30 >= i29) {
                                    i29 = i30;
                                }
                                int i31 = i27 + i28;
                                int i32 = this.zzg;
                                if (i31 > i32) {
                                    i31 = i32;
                                }
                                if (this.zzb == i21) {
                                    i10 = zzg(sArr, i23, i29, i31);
                                } else {
                                    zzi(sArr, i23, i21);
                                    i10 = zzg(this.zzi, i20, i29, i31);
                                }
                            } else {
                                i10 = zzg;
                            }
                        }
                        int i33 = this.zzu;
                        int i34 = (i33 == 0 || (i13 = this.zzs) == 0 || this.zzv > i33 * 3 || i33 + i33 <= this.zzt * 3) ? i10 : i13;
                        int i35 = i23 + i34;
                        this.zzt = i33;
                        this.zzs = i10;
                        double d11 = i34;
                        if (d10 > 1.0d) {
                            short[] sArr2 = this.zzj;
                            double d12 = (-1.0d) + d10;
                            if (d10 >= 2.0d) {
                                double d13 = (d11 / d12) + this.zzw;
                                int round = (int) Math.round(d13);
                                this.zzw = d13 - round;
                                i12 = round;
                            } else {
                                double d14 = ((d11 * (2.0d - d10)) / d12) + this.zzw;
                                int round2 = (int) Math.round(d14);
                                this.zzr = round2;
                                this.zzw = d14 - round2;
                                i12 = i34;
                            }
                            short[] zzl = zzl(this.zzl, this.zzm, i12);
                            this.zzl = zzl;
                            zzj(i12, this.zzb, zzl, this.zzm, sArr2, i23, sArr2, i35);
                            this.zzm += i12;
                            i23 += i34 + i12;
                        } else {
                            int i36 = i34;
                            short[] sArr3 = this.zzj;
                            double d15 = 1.0d - d10;
                            if (d10 < 0.5d) {
                                double d16 = ((d11 * d10) / d15) + this.zzw;
                                int round3 = (int) Math.round(d16);
                                this.zzw = d16 - round3;
                                i11 = round3;
                            } else {
                                double d17 = ((d11 * ((d10 + d10) - 1.0d)) / d15) + this.zzw;
                                int round4 = (int) Math.round(d17);
                                this.zzr = round4;
                                this.zzw = d17 - round4;
                                i11 = i36;
                            }
                            int i37 = i36 + i11;
                            short[] zzl2 = zzl(this.zzl, this.zzm, i37);
                            this.zzl = zzl2;
                            int i38 = this.zzb;
                            System.arraycopy(sArr3, i23 * i38, zzl2, this.zzm * i38, i38 * i36);
                            zzj(i11, this.zzb, this.zzl, this.zzm + i36, sArr3, i35, sArr3, i23);
                            this.zzm += i37;
                            i23 += i11;
                        }
                    }
                    if (this.zzh + i23 > i22) {
                        break;
                    }
                    i20 = 0;
                    i21 = 1;
                }
                int i39 = this.zzk - i23;
                short[] sArr4 = this.zzj;
                int i40 = this.zzb;
                System.arraycopy(sArr4, i23 * i40, sArr4, 0, i40 * i39);
                this.zzk = i39;
            }
        }
        float f10 = this.zze * this.zzd;
        if (f10 == 1.0f || this.zzm == i19) {
            return;
        }
        int i41 = this.zza;
        long j12 = i41;
        long j13 = i41 / f10;
        while (j13 != 0 && j12 != 0 && j13 % 2 == 0 && j12 % 2 == 0) {
            j13 /= 2;
            j12 /= 2;
        }
        int i42 = this.zzm - i19;
        short[] zzl3 = zzl(this.zzn, this.zzo, i42);
        this.zzn = zzl3;
        short[] sArr5 = this.zzl;
        int i43 = this.zzb;
        System.arraycopy(sArr5, i19 * i43, zzl3, this.zzo * i43, i43 * i42);
        this.zzm = i19;
        this.zzo += i42;
        int i44 = 0;
        while (true) {
            i14 = this.zzo;
            i15 = i14 - 1;
            if (i44 >= i15) {
                break;
            }
            while (true) {
                i16 = this.zzp + 1;
                j10 = i16;
                j11 = this.zzq;
                if (j10 * j13 <= j11 * j12) {
                    break;
                }
                this.zzl = zzl(this.zzl, this.zzm, 1);
                int i45 = 0;
                while (true) {
                    int i46 = this.zzb;
                    if (i45 < i46) {
                        short[] sArr6 = this.zzl;
                        int i47 = this.zzm * i46;
                        short[] sArr7 = this.zzn;
                        int i48 = (i44 * i46) + i45;
                        short s10 = sArr7[i48];
                        short s11 = sArr7[i48 + i46];
                        long j14 = this.zzq * j12;
                        long j15 = j12;
                        long j16 = (i17 + 1) * j13;
                        long j17 = j16 - (this.zzp * j13);
                        long j18 = j16 - j14;
                        sArr6[i47 + i45] = (short) (((j18 * s10) + ((j17 - j18) * s11)) / j17);
                        i45++;
                        j12 = j15;
                        j13 = j13;
                    }
                }
                this.zzq++;
                this.zzm++;
                j12 = j12;
                j13 = j13;
            }
            long j19 = j12;
            long j20 = j13;
            this.zzp = i16;
            if (j10 == j19) {
                this.zzp = 0;
                zzcv.zzf(j11 == j20);
                this.zzq = 0;
            }
            i44++;
            j12 = j19;
            j13 = j20;
        }
        if (i15 != 0) {
            short[] sArr8 = this.zzn;
            int i49 = this.zzb;
            System.arraycopy(sArr8, i15 * i49, sArr8, 0, (i14 - i15) * i49);
            this.zzo -= i15;
        }
    }

    private final short[] zzl(short[] sArr, int i10, int i11) {
        int length = sArr.length;
        int i12 = this.zzb;
        int i13 = length / i12;
        return i10 + i11 <= i13 ? sArr : Arrays.copyOf(sArr, (((i13 * 3) / 2) + i11) * i12);
    }

    public final int zza() {
        zzcv.zzf(this.zzm >= 0);
        int i10 = this.zzm * this.zzb;
        return i10 + i10;
    }

    public final int zzb() {
        int i10 = this.zzk * this.zzb;
        return i10 + i10;
    }

    public final void zzc() {
        this.zzk = 0;
        this.zzm = 0;
        this.zzo = 0;
        this.zzp = 0;
        this.zzq = 0;
        this.zzr = 0;
        this.zzs = 0;
        this.zzt = 0;
        this.zzu = 0;
        this.zzv = 0;
        this.zzw = 0.0d;
    }

    public final void zzd(ShortBuffer shortBuffer) {
        zzcv.zzf(this.zzm >= 0);
        int min = Math.min(shortBuffer.remaining() / this.zzb, this.zzm);
        shortBuffer.put(this.zzl, 0, this.zzb * min);
        int i10 = this.zzm - min;
        this.zzm = i10;
        int i11 = this.zzb;
        short[] sArr = this.zzl;
        System.arraycopy(sArr, min * i11, sArr, 0, i10 * i11);
    }

    public final void zze() {
        int i10;
        int i11 = this.zzk;
        int i12 = this.zzr;
        int i13 = this.zzm;
        float f10 = this.zzc;
        float f11 = this.zzd;
        int i14 = i13 + ((int) (((((((i11 - i12) / (f10 / f11)) + i12) + this.zzw) + this.zzo) / (this.zze * f11)) + 0.5d));
        this.zzw = 0.0d;
        int i15 = this.zzh;
        this.zzj = zzl(this.zzj, i11, i15 + i15 + i11);
        int i16 = 0;
        while (true) {
            int i17 = this.zzh;
            int i18 = this.zzb;
            i10 = i17 + i17;
            if (i16 >= i10 * i18) {
                break;
            }
            this.zzj[(i18 * i11) + i16] = 0;
            i16++;
        }
        this.zzk += i10;
        zzk();
        if (this.zzm > i14) {
            this.zzm = Math.max(i14, 0);
        }
        this.zzk = 0;
        this.zzr = 0;
        this.zzo = 0;
    }

    public final void zzf(ShortBuffer shortBuffer) {
        int remaining = shortBuffer.remaining();
        int i10 = this.zzb;
        int i11 = remaining / i10;
        int i12 = i10 * i11;
        short[] zzl = zzl(this.zzj, this.zzk, i11);
        this.zzj = zzl;
        shortBuffer.get(zzl, this.zzk * this.zzb, (i12 + i12) / 2);
        this.zzk += i11;
        zzk();
    }
}
