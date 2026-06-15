package com.google.android.gms.internal.ads;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzamg implements zzanb {
    private final zzalm zza;
    private final zzdw zzb = new zzdw(new byte[10], 10);
    private int zzc = 0;
    private int zzd;
    private zzee zze;
    private boolean zzf;
    private boolean zzg;
    private boolean zzh;
    private int zzi;
    private int zzj;
    private boolean zzk;

    public zzamg(zzalm zzalmVar) {
        this.zza = zzalmVar;
    }

    private final void zze(int i10) {
        this.zzc = i10;
        this.zzd = 0;
    }

    private final boolean zzf(zzdx zzdxVar, byte[] bArr, int i10) {
        int min = Math.min(zzdxVar.zzb(), i10 - this.zzd);
        if (min <= 0) {
            return true;
        }
        if (bArr == null) {
            zzdxVar.zzM(min);
        } else {
            zzdxVar.zzH(bArr, this.zzd, min);
        }
        int i11 = this.zzd + min;
        this.zzd = i11;
        return i11 == i10;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r6v12 */
    /* JADX WARN: Type inference failed for: r6v5 */
    @Override // com.google.android.gms.internal.ads.zzanb
    public final void zza(zzdx zzdxVar, int i10) throws zzaz {
        int i11;
        boolean z10;
        int i12;
        int i13;
        long j10;
        int i14;
        zzcv.zzb(this.zze);
        int i15 = -1;
        int i16 = 2;
        boolean z11 = 0;
        int i17 = 1;
        if ((i10 & 1) != 0) {
            int i18 = this.zzc;
            if (i18 != 0 && i18 != 1) {
                if (i18 != 2) {
                    int i19 = this.zzj;
                    if (i19 != -1) {
                        zzdn.zzf("PesReader", "Unexpected start indicator: expected " + i19 + " more bytes");
                    }
                    this.zza.zzc(zzdxVar.zze() == 0);
                } else {
                    zzdn.zzf("PesReader", "Unexpected start indicator reading extended header");
                }
            }
            zze(1);
        }
        int i20 = i10;
        while (zzdxVar.zzb() > 0) {
            int i21 = this.zzc;
            if (i21 == 0) {
                i11 = i16;
                z10 = z11;
                i12 = i17;
                zzdxVar.zzM(zzdxVar.zzb());
            } else if (i21 != i17) {
                if (i21 != i16) {
                    int zzb = zzdxVar.zzb();
                    int i22 = this.zzj;
                    int i23 = i22 == i15 ? z11 : zzb - i22;
                    if (i23 > 0) {
                        zzb -= i23;
                        zzdxVar.zzK(zzdxVar.zzd() + zzb);
                    }
                    this.zza.zza(zzdxVar);
                    int i24 = this.zzj;
                    if (i24 != i15) {
                        int i25 = i24 - zzb;
                        this.zzj = i25;
                        if (i25 == 0) {
                            this.zza.zzc(z11);
                            zze(i17);
                        }
                    }
                } else {
                    if (zzf(zzdxVar, this.zzb.zza, Math.min(10, this.zzi)) && zzf(zzdxVar, null, this.zzi)) {
                        this.zzb.zzl(z11);
                        if (this.zzf) {
                            this.zzb.zzn(4);
                            long zzd = this.zzb.zzd(3);
                            this.zzb.zzn(i17);
                            int zzd2 = this.zzb.zzd(15) << 15;
                            this.zzb.zzn(i17);
                            long zzd3 = this.zzb.zzd(15);
                            this.zzb.zzn(i17);
                            if (this.zzh || !this.zzg) {
                                i14 = zzd2;
                            } else {
                                this.zzb.zzn(4);
                                this.zzb.zzn(i17);
                                this.zzb.zzn(i17);
                                long zzd4 = this.zzb.zzd(15);
                                this.zzb.zzn(i17);
                                i14 = zzd2;
                                this.zze.zzb((this.zzb.zzd(3) << 30) | (this.zzb.zzd(15) << 15) | zzd4);
                                this.zzh = true;
                            }
                            j10 = this.zze.zzb((zzd << 30) | i14 | zzd3);
                        } else {
                            j10 = -9223372036854775807L;
                        }
                        i20 |= true != this.zzk ? 0 : 4;
                        this.zza.zzd(j10, i20);
                        zze(3);
                        i15 = -1;
                        i16 = 2;
                        z11 = 0;
                        i17 = 1;
                    }
                }
                i11 = i16;
                z10 = z11;
                i12 = i17;
            } else if (zzf(zzdxVar, this.zzb.zza, 9)) {
                z10 = false;
                this.zzb.zzl(0);
                int zzd5 = this.zzb.zzd(24);
                i12 = 1;
                if (zzd5 != 1) {
                    zzdn.zzf("PesReader", "Unexpected start code prefix: " + zzd5);
                    i15 = -1;
                    this.zzj = -1;
                    i13 = 0;
                    i11 = 2;
                } else {
                    this.zzb.zzn(8);
                    zzdw zzdwVar = this.zzb;
                    int zzd6 = zzdwVar.zzd(16);
                    zzdwVar.zzn(5);
                    this.zzk = this.zzb.zzp();
                    i11 = 2;
                    this.zzb.zzn(2);
                    this.zzf = this.zzb.zzp();
                    this.zzg = this.zzb.zzp();
                    this.zzb.zzn(6);
                    int zzd7 = this.zzb.zzd(8);
                    this.zzi = zzd7;
                    if (zzd6 == 0) {
                        this.zzj = -1;
                        i15 = -1;
                    } else {
                        int i26 = (zzd6 - 3) - zzd7;
                        this.zzj = i26;
                        if (i26 < 0) {
                            zzdn.zzf("PesReader", "Found negative packet payload size: " + i26);
                            i15 = -1;
                            this.zzj = -1;
                        } else {
                            i15 = -1;
                        }
                    }
                    i13 = 2;
                }
                zze(i13);
            } else {
                i15 = -1;
                z10 = false;
                i12 = 1;
                i11 = 2;
            }
            i17 = i12;
            z11 = z10;
            i16 = i11;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzanb
    public final void zzb(zzee zzeeVar, zzacm zzacmVar, zzana zzanaVar) {
        this.zze = zzeeVar;
        this.zza.zzb(zzacmVar, zzanaVar);
    }

    @Override // com.google.android.gms.internal.ads.zzanb
    public final void zzc() {
        this.zzc = 0;
        this.zzd = 0;
        this.zzh = false;
        this.zza.zze();
    }

    public final boolean zzd(boolean z10) {
        return this.zzc == 3 && this.zzj == -1;
    }
}
