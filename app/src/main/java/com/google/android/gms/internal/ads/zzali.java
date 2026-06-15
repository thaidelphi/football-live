package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.AdRequest;
import java.util.Arrays;
import java.util.Collections;
import java.util.Objects;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzali implements zzalm {
    private static final byte[] zza = {73, 68, 51};
    private final boolean zzb;
    private final String zze;
    private final int zzf;
    private final String zzg;
    private String zzh;
    private zzadp zzi;
    private zzadp zzj;
    private int zzk;
    private int zzl;
    private int zzm;
    private boolean zzn;
    private boolean zzo;
    private int zzr;
    private boolean zzs;
    private int zzu;
    private zzadp zzw;
    private long zzx;
    private final zzdw zzc = new zzdw(new byte[7], 7);
    private final zzdx zzd = new zzdx(Arrays.copyOf(zza, 10));
    private int zzp = -1;
    private int zzq = -1;
    private long zzt = -9223372036854775807L;
    private long zzv = -9223372036854775807L;

    public zzali(boolean z10, String str, int i10, String str2) {
        this.zzb = z10;
        this.zze = str;
        this.zzf = i10;
        this.zzg = str2;
        zzh();
    }

    public static boolean zzf(int i10) {
        return (i10 & 65526) == 65520;
    }

    private final void zzg() {
        this.zzo = false;
        zzh();
    }

    private final void zzh() {
        this.zzk = 0;
        this.zzl = 0;
        this.zzm = 256;
    }

    private final void zzi() {
        this.zzk = 3;
        this.zzl = 0;
    }

    private final void zzj(zzadp zzadpVar, long j10, int i10, int i11) {
        this.zzk = 4;
        this.zzl = i10;
        this.zzw = zzadpVar;
        this.zzx = j10;
        this.zzu = i11;
    }

    private final boolean zzk(zzdx zzdxVar, byte[] bArr, int i10) {
        int min = Math.min(zzdxVar.zzb(), i10 - this.zzl);
        zzdxVar.zzH(bArr, this.zzl, min);
        int i11 = this.zzl + min;
        this.zzl = i11;
        return i11 == i10;
    }

    private static final boolean zzl(byte b10, byte b11) {
        return zzf((b11 & 255) | 65280);
    }

    private static final boolean zzm(zzdx zzdxVar, byte[] bArr, int i10) {
        if (zzdxVar.zzb() < i10) {
            return false;
        }
        zzdxVar.zzH(bArr, 0, i10);
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzalm
    public final void zza(zzdx zzdxVar) throws zzaz {
        int i10;
        int i11;
        int i12;
        int i13;
        Objects.requireNonNull(this.zzi);
        int i14 = zzeh.zza;
        while (zzdxVar.zzb() > 0) {
            int i15 = this.zzk;
            int i16 = 13;
            int i17 = 2;
            if (i15 == 0) {
                byte[] zzN = zzdxVar.zzN();
                int zzd = zzdxVar.zzd();
                int zze = zzdxVar.zze();
                while (true) {
                    if (zzd < zze) {
                        i10 = zzd + 1;
                        i11 = zzN[zzd] & 255;
                        if (this.zzm == 512 && zzl((byte) -1, (byte) i11)) {
                            if (!this.zzo) {
                                int i18 = i10 - 2;
                                zzdxVar.zzL(i18 + 1);
                                if (zzm(zzdxVar, this.zzc.zza, 1)) {
                                    this.zzc.zzl(4);
                                    int zzd2 = this.zzc.zzd(1);
                                    int i19 = this.zzp;
                                    if (i19 == -1 || zzd2 == i19) {
                                        if (this.zzq != -1) {
                                            if (!zzm(zzdxVar, this.zzc.zza, 1)) {
                                                break;
                                            }
                                            this.zzc.zzl(i17);
                                            if (this.zzc.zzd(4) == this.zzq) {
                                                zzdxVar.zzL(i18 + 2);
                                            }
                                        }
                                        if (!zzm(zzdxVar, this.zzc.zza, 4)) {
                                            break;
                                        }
                                        this.zzc.zzl(14);
                                        int zzd3 = this.zzc.zzd(i16);
                                        if (zzd3 >= 7) {
                                            byte[] zzN2 = zzdxVar.zzN();
                                            int zze2 = zzdxVar.zze();
                                            int i20 = i18 + zzd3;
                                            if (i20 < zze2) {
                                                byte b10 = zzN2[i20];
                                                if (b10 != -1) {
                                                    if (b10 == 73) {
                                                        int i21 = i20 + 1;
                                                        if (i21 == zze2) {
                                                            break;
                                                        } else if (zzN2[i21] == 68) {
                                                            int i22 = i20 + 2;
                                                            if (i22 == zze2) {
                                                                break;
                                                            } else if (zzN2[i22] == 51) {
                                                                break;
                                                            }
                                                        }
                                                    }
                                                } else {
                                                    int i23 = i20 + 1;
                                                    if (i23 == zze2) {
                                                        break;
                                                    }
                                                    byte b11 = zzN2[i23];
                                                    if (zzl((byte) -1, b11) && ((b11 & 8) >> 3) == zzd2) {
                                                        break;
                                                    }
                                                }
                                            } else {
                                                break;
                                            }
                                        }
                                    }
                                }
                            } else {
                                break;
                            }
                        }
                        int i24 = this.zzm;
                        int i25 = i24 | i11;
                        if (i25 == 329) {
                            i12 = 2;
                            i13 = 768;
                        } else if (i25 == 511) {
                            i12 = 2;
                            i13 = AdRequest.MAX_CONTENT_URL_LENGTH;
                        } else if (i25 == 836) {
                            i12 = 2;
                            i13 = 1024;
                        } else if (i25 == 1075) {
                            this.zzk = 2;
                            this.zzl = 3;
                            this.zzu = 0;
                            this.zzd.zzL(0);
                            zzdxVar.zzL(i10);
                            break;
                        } else if (i24 != 256) {
                            this.zzm = 256;
                            zzd = i10 - 1;
                            i16 = 13;
                            i17 = 2;
                        } else {
                            i12 = 2;
                            i17 = i12;
                            zzd = i10;
                            i16 = 13;
                        }
                        this.zzm = i13;
                        i17 = i12;
                        zzd = i10;
                        i16 = 13;
                    } else {
                        zzdxVar.zzL(zzd);
                        break;
                    }
                }
                this.zzr = (i11 & 8) >> 3;
                this.zzn = 1 == ((i11 & 1) ^ 1);
                if (this.zzo) {
                    zzi();
                } else {
                    this.zzk = 1;
                    this.zzl = 0;
                }
                zzdxVar.zzL(i10);
            } else if (i15 != 1) {
                if (i15 != 2) {
                    if (i15 != 3) {
                        int min = Math.min(zzdxVar.zzb(), this.zzu - this.zzl);
                        this.zzw.zzr(zzdxVar, min);
                        int i26 = this.zzl + min;
                        this.zzl = i26;
                        if (i26 == this.zzu) {
                            zzcv.zzf(this.zzv != -9223372036854775807L);
                            this.zzw.zzt(this.zzv, 1, this.zzu, 0, null);
                            this.zzv += this.zzx;
                            zzh();
                        }
                    } else {
                        if (zzk(zzdxVar, this.zzc.zza, true != this.zzn ? 5 : 7)) {
                            this.zzc.zzl(0);
                            if (!this.zzs) {
                                int zzd4 = this.zzc.zzd(2) + 1;
                                if (zzd4 != 2) {
                                    zzdn.zzf("AdtsReader", "Detected audio object type: " + zzd4 + ", but assuming AAC LC.");
                                }
                                this.zzc.zzn(5);
                                int zzd5 = this.zzc.zzd(3);
                                int i27 = this.zzq;
                                int i28 = zzabf.zza;
                                byte[] bArr = {(byte) (((i27 >> 1) & 7) | 16), (byte) (((zzd5 << 3) & 120) | ((i27 << 7) & 128))};
                                zzabd zza2 = zzabf.zza(bArr);
                                zzx zzxVar = new zzx();
                                zzxVar.zzO(this.zzh);
                                zzxVar.zzE(this.zzg);
                                zzxVar.zzad("audio/mp4a-latm");
                                zzxVar.zzC(zza2.zzc);
                                zzxVar.zzB(zza2.zzb);
                                zzxVar.zzae(zza2.zza);
                                zzxVar.zzP(Collections.singletonList(bArr));
                                zzxVar.zzS(this.zze);
                                zzxVar.zzab(this.zzf);
                                zzz zzaj = zzxVar.zzaj();
                                this.zzt = 1024000000 / zzaj.zzF;
                                this.zzi.zzm(zzaj);
                                this.zzs = true;
                            } else {
                                this.zzc.zzn(10);
                            }
                            this.zzc.zzn(4);
                            int zzd6 = this.zzc.zzd(13) - 7;
                            if (this.zzn) {
                                zzd6 -= 2;
                            }
                            zzj(this.zzi, this.zzt, 0, zzd6);
                        }
                    }
                } else if (zzk(zzdxVar, this.zzd.zzN(), 10)) {
                    this.zzj.zzr(this.zzd, 10);
                    this.zzd.zzL(6);
                    zzj(this.zzj, 0L, 10, 10 + this.zzd.zzl());
                }
            } else if (zzdxVar.zzb() != 0) {
                zzdw zzdwVar = this.zzc;
                zzdwVar.zza[0] = zzdxVar.zzN()[zzdxVar.zzd()];
                zzdwVar.zzl(2);
                int zzd7 = this.zzc.zzd(4);
                int i29 = this.zzq;
                if (i29 != -1 && zzd7 != i29) {
                    zzg();
                } else {
                    if (!this.zzo) {
                        this.zzo = true;
                        this.zzp = this.zzr;
                        this.zzq = zzd7;
                    }
                    zzi();
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzalm
    public final void zzb(zzacm zzacmVar, zzana zzanaVar) {
        zzanaVar.zzc();
        this.zzh = zzanaVar.zzb();
        zzadp zzw = zzacmVar.zzw(zzanaVar.zza(), 1);
        this.zzi = zzw;
        this.zzw = zzw;
        if (!this.zzb) {
            this.zzj = new zzace();
            return;
        }
        zzanaVar.zzc();
        zzadp zzw2 = zzacmVar.zzw(zzanaVar.zza(), 5);
        this.zzj = zzw2;
        zzx zzxVar = new zzx();
        zzxVar.zzO(zzanaVar.zzb());
        zzxVar.zzE(this.zzg);
        zzxVar.zzad("application/id3");
        zzw2.zzm(zzxVar.zzaj());
    }

    @Override // com.google.android.gms.internal.ads.zzalm
    public final void zzc(boolean z10) {
    }

    @Override // com.google.android.gms.internal.ads.zzalm
    public final void zzd(long j10, int i10) {
        this.zzv = j10;
    }

    @Override // com.google.android.gms.internal.ads.zzalm
    public final void zze() {
        this.zzv = -9223372036854775807L;
        zzg();
    }
}
