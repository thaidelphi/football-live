package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
final class zzaiw extends zzaiu {
    private zzaiv zza;
    private int zzb;
    private boolean zzc;
    private zzadu zzd;
    private zzads zze;

    @Override // com.google.android.gms.internal.ads.zzaiu
    protected final long zza(zzdx zzdxVar) {
        if ((zzdxVar.zzN()[0] & 1) == 1) {
            return -1L;
        }
        byte b10 = zzdxVar.zzN()[0];
        zzaiv zzaivVar = this.zza;
        zzcv.zzb(zzaivVar);
        int i10 = !zzaivVar.zzd[(b10 >> 1) & (255 >>> (8 - zzaivVar.zze))].zza ? zzaivVar.zza.zze : zzaivVar.zza.zzf;
        int i11 = this.zzc ? (this.zzb + i10) / 4 : 0;
        if (zzdxVar.zzc() < zzdxVar.zze() + 4) {
            byte[] copyOf = Arrays.copyOf(zzdxVar.zzN(), zzdxVar.zze() + 4);
            zzdxVar.zzJ(copyOf, copyOf.length);
        } else {
            zzdxVar.zzK(zzdxVar.zze() + 4);
        }
        long j10 = i11;
        byte[] zzN = zzdxVar.zzN();
        zzN[zzdxVar.zze() - 4] = (byte) (j10 & 255);
        zzN[zzdxVar.zze() - 3] = (byte) ((j10 >>> 8) & 255);
        zzN[zzdxVar.zze() - 2] = (byte) ((j10 >>> 16) & 255);
        zzN[zzdxVar.zze() - 1] = (byte) ((j10 >>> 24) & 255);
        this.zzc = true;
        this.zzb = i10;
        return j10;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.zzaiu
    public final void zzb(boolean z10) {
        super.zzb(z10);
        if (z10) {
            this.zza = null;
            this.zzd = null;
            this.zze = null;
        }
        this.zzb = 0;
        this.zzc = false;
    }

    @Override // com.google.android.gms.internal.ads.zzaiu
    protected final boolean zzc(zzdx zzdxVar, long j10, zzair zzairVar) throws IOException {
        zzaiv zzaivVar;
        int i10;
        int i11;
        int i12;
        int i13;
        zzadu zzaduVar;
        long j11;
        if (this.zza != null) {
            Objects.requireNonNull(zzairVar.zza);
            return false;
        }
        zzadu zzaduVar2 = this.zzd;
        int i14 = 4;
        if (zzaduVar2 == null) {
            zzadv.zzd(1, zzdxVar, false);
            int zzj = zzdxVar.zzj();
            int zzm = zzdxVar.zzm();
            int zzj2 = zzdxVar.zzj();
            int zzi = zzdxVar.zzi();
            int i15 = zzi <= 0 ? -1 : zzi;
            int zzi2 = zzdxVar.zzi();
            int i16 = zzi2 <= 0 ? -1 : zzi2;
            int zzi3 = zzdxVar.zzi();
            int i17 = zzi3 <= 0 ? -1 : zzi3;
            int zzm2 = zzdxVar.zzm();
            this.zzd = new zzadu(zzj, zzm, zzj2, i15, i16, i17, (int) Math.pow(2.0d, zzm2 & 15), (int) Math.pow(2.0d, (zzm2 & 240) >> 4), 1 == (zzdxVar.zzm() & 1), Arrays.copyOf(zzdxVar.zzN(), zzdxVar.zze()));
        } else {
            zzads zzadsVar = this.zze;
            if (zzadsVar == null) {
                this.zze = zzadv.zzc(zzdxVar, true, true);
            } else {
                byte[] bArr = new byte[zzdxVar.zze()];
                System.arraycopy(zzdxVar.zzN(), 0, bArr, 0, zzdxVar.zze());
                int i18 = zzaduVar2.zza;
                int i19 = 5;
                zzadv.zzd(5, zzdxVar, false);
                int zzm3 = zzdxVar.zzm() + 1;
                zzadr zzadrVar = new zzadr(zzdxVar.zzN());
                zzadrVar.zzc(zzdxVar.zzd() * 8);
                int i20 = 0;
                while (true) {
                    int i21 = 2;
                    int i22 = 16;
                    if (i20 < zzm3) {
                        if (zzadrVar.zzb(24) == 5653314) {
                            int zzb = zzadrVar.zzb(16);
                            int zzb2 = zzadrVar.zzb(24);
                            if (!zzadrVar.zzd()) {
                                boolean zzd = zzadrVar.zzd();
                                for (int i23 = 0; i23 < zzb2; i23++) {
                                    if (zzd) {
                                        if (zzadrVar.zzd()) {
                                            zzadrVar.zzc(5);
                                        }
                                    } else {
                                        zzadrVar.zzc(5);
                                    }
                                }
                            } else {
                                zzadrVar.zzc(5);
                                for (int i24 = 0; i24 < zzb2; i24 += zzadrVar.zzb(zzadv.zza(zzb2 - i24))) {
                                }
                            }
                            int zzb3 = zzadrVar.zzb(i14);
                            if (zzb3 > 2) {
                                throw zzaz.zza("lookup type greater than 2 not decodable: " + zzb3, null);
                            }
                            if (zzb3 == 1) {
                                i21 = zzb3;
                            } else if (zzb3 != 2) {
                                zzaduVar = zzaduVar2;
                                i20++;
                                zzaduVar2 = zzaduVar;
                                i14 = 4;
                            }
                            zzadrVar.zzc(32);
                            zzadrVar.zzc(32);
                            int zzb4 = zzadrVar.zzb(i14) + 1;
                            zzadrVar.zzc(1);
                            if (i21 != 1) {
                                zzaduVar = zzaduVar2;
                                j11 = zzb * zzb2;
                            } else if (zzb != 0) {
                                zzaduVar = zzaduVar2;
                                j11 = (long) Math.floor(Math.pow(zzb2, 1.0d / zzb));
                            } else {
                                zzaduVar = zzaduVar2;
                                j11 = 0;
                            }
                            zzadrVar.zzc((int) (j11 * zzb4));
                            i20++;
                            zzaduVar2 = zzaduVar;
                            i14 = 4;
                        } else {
                            throw zzaz.zza("expected code book to start with [0x56, 0x43, 0x42] at " + zzadrVar.zza(), null);
                        }
                    } else {
                        zzadu zzaduVar3 = zzaduVar2;
                        int i25 = 6;
                        int zzb5 = zzadrVar.zzb(6) + 1;
                        for (int i26 = 0; i26 < zzb5; i26++) {
                            if (zzadrVar.zzb(16) != 0) {
                                throw zzaz.zza("placeholder of time domain transforms not zeroed out", null);
                            }
                        }
                        int i27 = 1;
                        int zzb6 = zzadrVar.zzb(6) + 1;
                        int i28 = 0;
                        while (true) {
                            int i29 = 3;
                            if (i28 < zzb6) {
                                int zzb7 = zzadrVar.zzb(i22);
                                if (zzb7 == 0) {
                                    i12 = zzb6;
                                    int i30 = 8;
                                    zzadrVar.zzc(8);
                                    zzadrVar.zzc(16);
                                    zzadrVar.zzc(16);
                                    zzadrVar.zzc(6);
                                    zzadrVar.zzc(8);
                                    int zzb8 = zzadrVar.zzb(4) + 1;
                                    int i31 = 0;
                                    while (i31 < zzb8) {
                                        zzadrVar.zzc(i30);
                                        i31++;
                                        i30 = 8;
                                    }
                                } else if (zzb7 != i27) {
                                    throw zzaz.zza("floor type greater than 1 not decodable: " + zzb7, null);
                                } else {
                                    int zzb9 = zzadrVar.zzb(i19);
                                    int[] iArr = new int[zzb9];
                                    int i32 = -1;
                                    for (int i33 = 0; i33 < zzb9; i33++) {
                                        int zzb10 = zzadrVar.zzb(4);
                                        iArr[i33] = zzb10;
                                        if (zzb10 > i32) {
                                            i32 = zzb10;
                                        }
                                    }
                                    int i34 = i32 + 1;
                                    int[] iArr2 = new int[i34];
                                    int i35 = 0;
                                    while (i35 < i34) {
                                        iArr2[i35] = zzadrVar.zzb(i29) + 1;
                                        int zzb11 = zzadrVar.zzb(i21);
                                        if (zzb11 > 0) {
                                            i13 = 8;
                                            zzadrVar.zzc(8);
                                        } else {
                                            i13 = 8;
                                        }
                                        int i36 = zzb6;
                                        int i37 = 0;
                                        for (int i38 = 1; i37 < (i38 << zzb11); i38 = 1) {
                                            zzadrVar.zzc(i13);
                                            i37++;
                                            i13 = 8;
                                        }
                                        i35++;
                                        zzb6 = i36;
                                        i21 = 2;
                                        i29 = 3;
                                    }
                                    i12 = zzb6;
                                    zzadrVar.zzc(i21);
                                    int zzb12 = zzadrVar.zzb(4);
                                    int i39 = 0;
                                    int i40 = 0;
                                    for (int i41 = 0; i41 < zzb9; i41++) {
                                        i39 += iArr2[iArr[i41]];
                                        while (i40 < i39) {
                                            zzadrVar.zzc(zzb12);
                                            i40++;
                                        }
                                    }
                                }
                                i28++;
                                zzb6 = i12;
                                i25 = 6;
                                i22 = 16;
                                i21 = 2;
                                i27 = 1;
                                i19 = 5;
                            } else {
                                int i42 = 1;
                                int zzb13 = zzadrVar.zzb(i25) + 1;
                                int i43 = 0;
                                while (i43 < zzb13) {
                                    if (zzadrVar.zzb(16) <= 2) {
                                        zzadrVar.zzc(24);
                                        zzadrVar.zzc(24);
                                        zzadrVar.zzc(24);
                                        int zzb14 = zzadrVar.zzb(i25) + i42;
                                        int i44 = 8;
                                        zzadrVar.zzc(8);
                                        int[] iArr3 = new int[zzb14];
                                        for (int i45 = 0; i45 < zzb14; i45++) {
                                            iArr3[i45] = ((zzadrVar.zzd() ? zzadrVar.zzb(5) : 0) * 8) + zzadrVar.zzb(3);
                                        }
                                        int i46 = 0;
                                        while (i46 < zzb14) {
                                            int i47 = 0;
                                            while (i47 < i44) {
                                                if ((iArr3[i46] & (1 << i47)) != 0) {
                                                    zzadrVar.zzc(i44);
                                                }
                                                i47++;
                                                i44 = 8;
                                            }
                                            i46++;
                                            i44 = 8;
                                        }
                                        i43++;
                                        i25 = 6;
                                        i42 = 1;
                                    } else {
                                        throw zzaz.zza("residueType greater than 2 is not decodable", null);
                                    }
                                }
                                int zzb15 = zzadrVar.zzb(i25) + 1;
                                for (int i48 = 0; i48 < zzb15; i48++) {
                                    int zzb16 = zzadrVar.zzb(16);
                                    if (zzb16 != 0) {
                                        zzdn.zzc("VorbisUtil", "mapping type other than 0 not supported: " + zzb16);
                                    } else {
                                        if (zzadrVar.zzd()) {
                                            i10 = 1;
                                            i11 = zzadrVar.zzb(4) + 1;
                                        } else {
                                            i10 = 1;
                                            i11 = 1;
                                        }
                                        if (zzadrVar.zzd()) {
                                            int zzb17 = zzadrVar.zzb(8) + i10;
                                            for (int i49 = 0; i49 < zzb17; i49++) {
                                                int i50 = i18 - 1;
                                                zzadrVar.zzc(zzadv.zza(i50));
                                                zzadrVar.zzc(zzadv.zza(i50));
                                            }
                                        }
                                        if (zzadrVar.zzb(2) != 0) {
                                            throw zzaz.zza("to reserved bits must be zero after mapping coupling steps", null);
                                        }
                                        if (i11 > 1) {
                                            for (int i51 = 0; i51 < i18; i51++) {
                                                zzadrVar.zzc(4);
                                            }
                                        }
                                        for (int i52 = 0; i52 < i11; i52++) {
                                            zzadrVar.zzc(8);
                                            zzadrVar.zzc(8);
                                            zzadrVar.zzc(8);
                                        }
                                    }
                                }
                                int zzb18 = zzadrVar.zzb(6) + 1;
                                zzadt[] zzadtVarArr = new zzadt[zzb18];
                                for (int i53 = 0; i53 < zzb18; i53++) {
                                    zzadtVarArr[i53] = new zzadt(zzadrVar.zzd(), zzadrVar.zzb(16), zzadrVar.zzb(16), zzadrVar.zzb(8));
                                }
                                if (zzadrVar.zzd()) {
                                    zzaivVar = new zzaiv(zzaduVar3, zzadsVar, bArr, zzadtVarArr, zzadv.zza(zzb18 - 1));
                                } else {
                                    throw zzaz.zza("framing bit after modes not set as expected", null);
                                }
                            }
                        }
                    }
                }
            }
        }
        zzaivVar = null;
        this.zza = zzaivVar;
        if (zzaivVar == null) {
            return true;
        }
        ArrayList arrayList = new ArrayList();
        zzadu zzaduVar4 = zzaivVar.zza;
        arrayList.add(zzaduVar4.zzg);
        arrayList.add(zzaivVar.zzc);
        zzav zzb19 = zzadv.zzb(zzfvv.zzm(zzaivVar.zzb.zza));
        zzx zzxVar = new zzx();
        zzxVar.zzE("audio/ogg");
        zzxVar.zzad("audio/vorbis");
        zzxVar.zzA(zzaduVar4.zzd);
        zzxVar.zzY(zzaduVar4.zzc);
        zzxVar.zzB(zzaduVar4.zza);
        zzxVar.zzae(zzaduVar4.zzb);
        zzxVar.zzP(arrayList);
        zzxVar.zzW(zzb19);
        zzairVar.zza = zzxVar.zzaj();
        return true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.zzaiu
    public final void zzi(long j10) {
        super.zzi(j10);
        this.zzc = j10 != 0;
        zzadu zzaduVar = this.zzd;
        this.zzb = zzaduVar != null ? zzaduVar.zze : 0;
    }
}
