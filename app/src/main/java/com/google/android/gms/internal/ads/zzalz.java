package com.google.android.gms.internal.ads;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzalz implements zzalm {
    private String zzf;
    private zzadp zzg;
    private boolean zzj;
    private int zzl;
    private int zzm;
    private int zzo;
    private int zzp;
    private int zzt;
    private boolean zzv;
    private final String zza = "video/mp2t";
    private int zze = 0;
    private final zzdx zzb = new zzdx(new byte[15], 2);
    private final zzdw zzc = new zzdw();
    private final zzdx zzd = new zzdx();
    private final zzama zzq = new zzama();
    private int zzr = -2147483647;
    private int zzs = -1;
    private long zzu = -1;
    private boolean zzk = true;
    private boolean zzn = true;
    private double zzh = -9.223372036854776E18d;
    private double zzi = -9.223372036854776E18d;

    public zzalz(String str) {
    }

    private static final void zzf(zzdx zzdxVar, zzdx zzdxVar2, boolean z10) {
        int zzd = zzdxVar.zzd();
        int min = Math.min(zzdxVar.zzb(), zzdxVar2.zzb());
        zzdxVar.zzH(zzdxVar2.zzN(), zzdxVar2.zzd(), min);
        zzdxVar2.zzM(min);
        if (z10) {
            zzdxVar.zzL(zzd);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzalm
    public final void zza(zzdx zzdxVar) throws zzaz {
        int i10;
        zzcv.zzb(this.zzg);
        while (zzdxVar.zzb() > 0) {
            int i11 = this.zze;
            int i12 = 0;
            if (i11 == 0) {
                int i13 = this.zzl;
                if ((i13 & 2) != 0) {
                    if ((i13 & 4) == 0) {
                        while (zzdxVar.zzb() > 0) {
                            int i14 = this.zzm << 8;
                            this.zzm = i14;
                            int zzm = i14 | zzdxVar.zzm();
                            this.zzm = zzm;
                            if ((zzm & 16777215) == 12583333) {
                                zzdxVar.zzL(zzdxVar.zzd() - 3);
                                this.zzm = 0;
                            }
                        }
                    }
                    this.zze = 1;
                    break;
                }
                zzdxVar.zzL(zzdxVar.zze());
            } else if (i11 != 1) {
                int i15 = this.zzq.zza;
                if (i15 == 1 || i15 == 17) {
                    zzf(zzdxVar, this.zzd, true);
                }
                int min = Math.min(zzdxVar.zzb(), this.zzq.zzc - this.zzo);
                this.zzg.zzr(zzdxVar, min);
                int i16 = this.zzo + min;
                this.zzo = i16;
                zzama zzamaVar = this.zzq;
                if (i16 == zzamaVar.zzc) {
                    int i17 = zzamaVar.zza;
                    if (i17 == 1) {
                        byte[] zzN = this.zzd.zzN();
                        zzamb zza = zzamd.zza(new zzdw(zzN, zzN.length));
                        this.zzr = zza.zzb;
                        this.zzs = zza.zzc;
                        long j10 = this.zzu;
                        long j11 = this.zzq.zzb;
                        if (j10 != j11) {
                            this.zzu = j11;
                            int i18 = zza.zza;
                            String concat = i18 != -1 ? "mhm1".concat(String.valueOf(String.format(".%02X", Integer.valueOf(i18)))) : "mhm1";
                            byte[] bArr = zza.zzd;
                            zzfvv zzfvvVar = null;
                            if (bArr != null && bArr.length > 0) {
                                zzfvvVar = zzfvv.zzp(zzeh.zzf, bArr);
                            }
                            zzx zzxVar = new zzx();
                            zzxVar.zzO(this.zzf);
                            zzxVar.zzE(this.zza);
                            zzxVar.zzad("audio/mhm1");
                            zzxVar.zzae(this.zzr);
                            zzxVar.zzC(concat);
                            zzxVar.zzP(zzfvvVar);
                            this.zzg.zzm(zzxVar.zzaj());
                        }
                        this.zzv = true;
                    } else if (i17 == 17) {
                        byte[] zzN2 = this.zzd.zzN();
                        zzdw zzdwVar = new zzdw(zzN2, zzN2.length);
                        if (zzdwVar.zzp()) {
                            zzdwVar.zzn(2);
                            i12 = zzdwVar.zzd(13);
                        }
                        this.zzt = i12;
                    } else if (i17 == 2) {
                        if (this.zzv) {
                            this.zzk = false;
                            i10 = 1;
                        } else {
                            i10 = 0;
                        }
                        int i19 = this.zzs - this.zzt;
                        double d10 = this.zzr;
                        long round = Math.round(this.zzh);
                        if (this.zzj) {
                            this.zzj = false;
                            this.zzh = this.zzi;
                        } else {
                            this.zzh += (i19 * 1000000.0d) / d10;
                        }
                        this.zzg.zzt(round, i10, this.zzp, 0, null);
                        this.zzv = false;
                        this.zzt = 0;
                        this.zzp = 0;
                    }
                    this.zze = 1;
                }
            } else {
                zzf(zzdxVar, this.zzb, false);
                zzdx zzdxVar2 = this.zzb;
                if (zzdxVar2.zzb() == 0) {
                    zzdw zzdwVar2 = this.zzc;
                    int zze = zzdxVar2.zze();
                    zzdwVar2.zzk(zzdxVar2.zzN(), zze);
                    if (zzamd.zzb(this.zzc, this.zzq)) {
                        this.zzo = 0;
                        this.zzp += this.zzq.zzc + zze;
                        this.zzb.zzL(0);
                        zzadp zzadpVar = this.zzg;
                        zzdx zzdxVar3 = this.zzb;
                        zzadpVar.zzr(zzdxVar3, zzdxVar3.zze());
                        this.zzb.zzI(2);
                        this.zzd.zzI(this.zzq.zzc);
                        this.zzn = true;
                        this.zze = 2;
                    } else {
                        zzdx zzdxVar4 = this.zzb;
                        if (zzdxVar4.zze() < 15) {
                            zzdxVar4.zzK(zzdxVar4.zze() + 1);
                        }
                    }
                }
                this.zzn = false;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzalm
    public final void zzb(zzacm zzacmVar, zzana zzanaVar) {
        zzanaVar.zzc();
        this.zzf = zzanaVar.zzb();
        this.zzg = zzacmVar.zzw(zzanaVar.zza(), 1);
    }

    @Override // com.google.android.gms.internal.ads.zzalm
    public final void zzc(boolean z10) {
    }

    @Override // com.google.android.gms.internal.ads.zzalm
    public final void zzd(long j10, int i10) {
        this.zzl = i10;
        if (!this.zzk && (this.zzp != 0 || !this.zzn)) {
            this.zzj = true;
        }
        if (j10 != -9223372036854775807L) {
            double d10 = j10;
            if (this.zzj) {
                this.zzi = d10;
            } else {
                this.zzh = d10;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzalm
    public final void zze() {
        this.zze = 0;
        this.zzm = 0;
        this.zzb.zzI(2);
        this.zzo = 0;
        this.zzp = 0;
        this.zzr = -2147483647;
        this.zzs = -1;
        this.zzt = 0;
        this.zzu = -1L;
        this.zzv = false;
        this.zzj = false;
        this.zzn = true;
        this.zzk = true;
        this.zzh = -9.223372036854776E18d;
        this.zzi = -9.223372036854776E18d;
    }
}
