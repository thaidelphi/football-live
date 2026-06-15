package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.List;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzacy {
    public final List zza;
    public final int zzb;
    public final int zzc;
    public final int zzd;
    public final int zze;
    public final int zzf;
    public final int zzg;
    public final int zzh;
    public final int zzi;
    public final float zzj;
    public final int zzk;
    public final String zzl;
    public final zzfa zzm;

    private zzacy(List list, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19, float f10, int i20, String str, zzfa zzfaVar) {
        this.zza = list;
        this.zzb = i10;
        this.zzc = i11;
        this.zzd = i14;
        this.zze = i15;
        this.zzf = i16;
        this.zzg = i17;
        this.zzh = i18;
        this.zzi = i19;
        this.zzj = f10;
        this.zzk = i20;
        this.zzl = str;
        this.zzm = zzfaVar;
    }

    public static zzacy zza(zzdx zzdxVar) throws zzaz {
        return zzc(zzdxVar, false, null);
    }

    public static zzacy zzb(zzdx zzdxVar, zzfa zzfaVar) throws zzaz {
        return zzc(zzdxVar, true, zzfaVar);
    }

    private static zzacy zzc(zzdx zzdxVar, boolean z10, zzfa zzfaVar) throws zzaz {
        boolean z11;
        int i10;
        int i11;
        int i12;
        int i13;
        zzew zzewVar;
        int max;
        boolean z12;
        int max2;
        int i14;
        int i15;
        int i16;
        int i17 = 4;
        boolean z13 = true;
        try {
            if (z10) {
                zzdxVar.zzM(4);
            } else {
                zzdxVar.zzM(21);
            }
            int zzm = zzdxVar.zzm() & 3;
            int zzm2 = zzdxVar.zzm();
            int zzd = zzdxVar.zzd();
            int i18 = 0;
            int i19 = 0;
            for (int i20 = 0; i20 < zzm2; i20++) {
                zzdxVar.zzM(1);
                int zzq = zzdxVar.zzq();
                for (int i21 = 0; i21 < zzq; i21++) {
                    int zzq2 = zzdxVar.zzq();
                    i19 += zzq2 + 4;
                    zzdxVar.zzM(zzq2);
                }
            }
            zzdxVar.zzL(zzd);
            byte[] bArr = new byte[i19];
            zzfa zzfaVar2 = zzfaVar;
            int i22 = 0;
            float f10 = 1.0f;
            int i23 = -1;
            int i24 = -1;
            int i25 = -1;
            int i26 = -1;
            int i27 = -1;
            int i28 = -1;
            int i29 = -1;
            int i30 = -1;
            int i31 = -1;
            int i32 = -1;
            String str = null;
            int i33 = 0;
            while (i33 < zzm2) {
                int zzm3 = zzdxVar.zzm() & 63;
                int zzq3 = zzdxVar.zzq();
                int i34 = i18;
                zzfa zzfaVar3 = zzfaVar2;
                while (i34 < zzq3) {
                    try {
                        int zzq4 = zzdxVar.zzq();
                        int i35 = zzm2;
                        System.arraycopy(zzfd.zza, i18, bArr, i22, i17);
                        int i36 = i22 + 4;
                        System.arraycopy(zzdxVar.zzN(), zzdxVar.zzd(), bArr, i36, zzq4);
                        int i37 = 32;
                        if (zzm3 != 32) {
                            i37 = zzm3;
                        } else if (i34 == 0) {
                            zzfaVar3 = zzfd.zze(bArr, i36, i36 + zzq4);
                            i34 = i18;
                            i10 = zzq3;
                            i11 = zzm3;
                            i22 = i36 + zzq4;
                            zzdxVar.zzM(zzq4);
                            i34++;
                            zzm2 = i35;
                            zzq3 = i10;
                            zzm3 = i11;
                            i17 = 4;
                        }
                        if (i37 != 33) {
                            i10 = zzq3;
                            i11 = zzm3;
                            if (i37 == 39 && i34 == 0) {
                                int i38 = i36 + 2;
                                int i39 = (i36 + zzq4) - 1;
                                while (true) {
                                    byte b10 = bArr[i39];
                                    if (b10 == 0) {
                                        if (i39 <= i38) {
                                            break;
                                        }
                                        i39--;
                                    } else if (b10 != 0 && i39 > i38) {
                                        zzfe zzfeVar = new zzfe(bArr, i38, i39 + 1);
                                        while (zzfeVar.zzg(16)) {
                                            int zza = zzfeVar.zza(8);
                                            int i40 = 0;
                                            while (zza == 255) {
                                                i40 += 255;
                                                zza = zzfeVar.zza(8);
                                            }
                                            int i41 = i40 + zza;
                                            int zza2 = zzfeVar.zza(8);
                                            int i42 = 0;
                                            while (zza2 == 255) {
                                                i42 += 255;
                                                zza2 = zzfeVar.zza(8);
                                            }
                                            int i43 = i42 + zza2;
                                            if (i43 == 0 || !zzfeVar.zzg(i43)) {
                                                break;
                                            } else if (i41 == 176) {
                                                int zzc = zzfeVar.zzc();
                                                boolean zzh = zzfeVar.zzh();
                                                int zzc2 = zzh ? zzfeVar.zzc() : 0;
                                                int zzc3 = zzfeVar.zzc();
                                                int i44 = 0;
                                                int i45 = -1;
                                                int i46 = -1;
                                                int i47 = -1;
                                                int i48 = -1;
                                                int i49 = -1;
                                                int i50 = -1;
                                                while (i44 <= zzc3) {
                                                    i45 = zzfeVar.zzc();
                                                    i46 = zzfeVar.zzc();
                                                    i12 = i34;
                                                    int zza3 = zzfeVar.zza(6);
                                                    if (zza3 != 63) {
                                                        if (zza3 == 0) {
                                                            i13 = i23;
                                                            max = Math.max(0, zzc - 30);
                                                        } else {
                                                            i13 = i23;
                                                            max = Math.max(0, (zza3 + zzc) - 31);
                                                        }
                                                        i48 = zzfeVar.zza(max);
                                                        if (zzh) {
                                                            int zza4 = zzfeVar.zza(6);
                                                            if (zza4 != 63) {
                                                                if (zza4 == 0) {
                                                                    z12 = zzh;
                                                                    max2 = Math.max(0, zzc2 - 30);
                                                                } else {
                                                                    z12 = zzh;
                                                                    max2 = Math.max(0, (zza4 + zzc2) - 31);
                                                                }
                                                                i50 = zzfeVar.zza(max2);
                                                                i49 = zza4;
                                                            }
                                                        } else {
                                                            z12 = zzh;
                                                        }
                                                        if (zzfeVar.zzh()) {
                                                            zzfeVar.zzf(10);
                                                        }
                                                        i44++;
                                                        i47 = zza3;
                                                        i34 = i12;
                                                        zzh = z12;
                                                        i23 = i13;
                                                    }
                                                }
                                                i12 = i34;
                                                i13 = i23;
                                                zzewVar = new zzew(zzc, zzc2, zzc3 + 1, i45, i46, i47, i48, i49, i50);
                                            }
                                        }
                                    }
                                }
                                i12 = i34;
                                i13 = i23;
                                zzewVar = null;
                                if (zzewVar != null && zzfaVar3 != null) {
                                    i18 = 0;
                                    if (zzewVar.zza == ((zzeq) zzfaVar3.zza.get(0)).zzb) {
                                        i34 = i12;
                                        i23 = i13;
                                        i31 = 4;
                                        i22 = i36 + zzq4;
                                        zzdxVar.zzM(zzq4);
                                        i34++;
                                        zzm2 = i35;
                                        zzq3 = i10;
                                        zzm3 = i11;
                                        i17 = 4;
                                    } else {
                                        i31 = 5;
                                        i34 = i12;
                                        i23 = i13;
                                        i22 = i36 + zzq4;
                                        zzdxVar.zzM(zzq4);
                                        i34++;
                                        zzm2 = i35;
                                        zzq3 = i10;
                                        zzm3 = i11;
                                        i17 = 4;
                                    }
                                }
                            }
                            i12 = i34;
                            i13 = i23;
                        } else if (i34 == 0) {
                            zzex zzd2 = zzfd.zzd(bArr, i36, i36 + zzq4, zzfaVar3);
                            int i51 = zzd2.zza + 1;
                            int i52 = zzd2.zze;
                            int i53 = zzd2.zzf;
                            i26 = zzd2.zzc + 8;
                            int i54 = zzd2.zzd + 8;
                            int i55 = zzd2.zzi;
                            int i56 = zzd2.zzj;
                            int i57 = zzd2.zzk;
                            float f11 = zzd2.zzg;
                            int i58 = zzd2.zzh;
                            zzes zzesVar = zzd2.zzb;
                            if (zzesVar != null) {
                                i14 = i58;
                                i15 = i53;
                                i10 = zzq3;
                                i11 = zzm3;
                                i16 = i52;
                                str = zzcx.zzd(zzesVar.zza, zzesVar.zzb, zzesVar.zzc, zzesVar.zzd, zzesVar.zze, zzesVar.zzf);
                            } else {
                                i14 = i58;
                                i15 = i53;
                                i10 = zzq3;
                                i11 = zzm3;
                                i16 = i52;
                            }
                            i23 = i51;
                            i24 = i16;
                            i18 = 0;
                            i27 = i54;
                            i25 = i15;
                            i32 = i14;
                            f10 = f11;
                            i30 = i57;
                            i29 = i56;
                            i28 = i55;
                            i22 = i36 + zzq4;
                            zzdxVar.zzM(zzq4);
                            i34++;
                            zzm2 = i35;
                            zzq3 = i10;
                            zzm3 = i11;
                            i17 = 4;
                        } else {
                            i10 = zzq3;
                            i11 = zzm3;
                            i12 = i34;
                            i13 = i23;
                        }
                        i18 = 0;
                        i34 = i12;
                        i23 = i13;
                        i22 = i36 + zzq4;
                        zzdxVar.zzM(zzq4);
                        i34++;
                        zzm2 = i35;
                        zzq3 = i10;
                        zzm3 = i11;
                        i17 = 4;
                    } catch (ArrayIndexOutOfBoundsException e8) {
                        e = e8;
                        z11 = true;
                        throw zzaz.zza("Error parsing".concat(z11 != z10 ? "HEVC config" : "L-HEVC config"), e);
                    }
                }
                i33++;
                zzfaVar2 = zzfaVar3;
                i17 = 4;
                z13 = true;
            }
            return new zzacy(i19 == 0 ? Collections.emptyList() : Collections.singletonList(bArr), zzm + 1, i23, i24, i25, i26, i27, i28, i29, i30, i31, f10, i32, str, zzfaVar2);
        } catch (ArrayIndexOutOfBoundsException e10) {
            e = e10;
            z11 = z13;
        }
    }
}
