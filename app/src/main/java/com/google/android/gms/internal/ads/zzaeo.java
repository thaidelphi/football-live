package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzaeo implements zzacj {
    private final byte[] zza;
    private final zzdx zzb;
    private final zzacp zzc;
    private zzacm zzd;
    private zzadp zze;
    private int zzf;
    private zzav zzg;
    private zzacu zzh;
    private int zzi;
    private int zzj;
    private zzaen zzk;
    private int zzl;
    private long zzm;

    public zzaeo() {
        throw null;
    }

    public zzaeo(int i10) {
        this.zza = new byte[42];
        this.zzb = new zzdx(new byte[32768], 0);
        this.zzc = new zzacp();
        this.zzf = 0;
    }

    private final long zza(zzdx zzdxVar, boolean z10) {
        boolean z11;
        Objects.requireNonNull(this.zzh);
        int zzd = zzdxVar.zzd();
        while (zzd <= zzdxVar.zze() - 16) {
            zzdxVar.zzL(zzd);
            if (zzacq.zzc(zzdxVar, this.zzh, this.zzj, this.zzc)) {
                zzdxVar.zzL(zzd);
                return this.zzc.zza;
            }
            zzd++;
        }
        if (z10) {
            while (zzd <= zzdxVar.zze() - this.zzi) {
                zzdxVar.zzL(zzd);
                try {
                    z11 = zzacq.zzc(zzdxVar, this.zzh, this.zzj, this.zzc);
                } catch (IndexOutOfBoundsException unused) {
                    z11 = false;
                }
                if (zzdxVar.zzd() <= zzdxVar.zze() && z11) {
                    zzdxVar.zzL(zzd);
                    return this.zzc.zza;
                }
                zzd++;
            }
            zzdxVar.zzL(zzdxVar.zze());
            return -1L;
        }
        zzdxVar.zzL(zzd);
        return -1L;
    }

    private final void zzg() {
        zzacu zzacuVar = this.zzh;
        int i10 = zzeh.zza;
        this.zze.zzt((this.zzm * 1000000) / zzacuVar.zze, 1, this.zzl, 0, null);
    }

    @Override // com.google.android.gms.internal.ads.zzacj
    public final int zzb(zzack zzackVar, zzadf zzadfVar) throws IOException {
        boolean zzp;
        zzadi zzadhVar;
        boolean z10;
        int i10 = this.zzf;
        if (i10 == 0) {
            zzackVar.zzj();
            long zze = zzackVar.zze();
            zzav zza = zzacr.zza(zzackVar, true);
            zzackVar.zzk((int) (zzackVar.zze() - zze));
            this.zzg = zza;
            this.zzf = 1;
            return 0;
        } else if (i10 == 1) {
            zzackVar.zzh(this.zza, 0, 42);
            zzackVar.zzj();
            this.zzf = 2;
            return 0;
        } else if (i10 == 2) {
            zzdx zzdxVar = new zzdx(4);
            zzackVar.zzi(zzdxVar.zzN(), 0, 4);
            if (zzdxVar.zzu() == 1716281667) {
                this.zzf = 3;
                return 0;
            }
            throw zzaz.zza("Failed to read FLAC stream marker.", null);
        } else if (i10 == 3) {
            zzacu zzacuVar = this.zzh;
            do {
                zzackVar.zzj();
                zzdw zzdwVar = new zzdw(new byte[4], 4);
                zzackVar.zzh(zzdwVar.zza, 0, 4);
                zzp = zzdwVar.zzp();
                int zzd = zzdwVar.zzd(7);
                int zzd2 = zzdwVar.zzd(24) + 4;
                if (zzd == 0) {
                    byte[] bArr = new byte[38];
                    zzackVar.zzi(bArr, 0, 38);
                    zzacuVar = new zzacu(bArr, 4);
                } else if (zzacuVar == null) {
                    throw new IllegalArgumentException();
                } else {
                    if (zzd == 3) {
                        zzdx zzdxVar2 = new zzdx(zzd2);
                        zzackVar.zzi(zzdxVar2.zzN(), 0, zzd2);
                        zzacuVar = zzacuVar.zzf(zzacr.zzb(zzdxVar2));
                    } else if (zzd == 4) {
                        zzdx zzdxVar3 = new zzdx(zzd2);
                        zzackVar.zzi(zzdxVar3.zzN(), 0, zzd2);
                        zzdxVar3.zzM(4);
                        zzacuVar = zzacuVar.zzg(Arrays.asList(zzadv.zzc(zzdxVar3, false, false).zza));
                    } else if (zzd == 6) {
                        zzdx zzdxVar4 = new zzdx(zzd2);
                        zzackVar.zzi(zzdxVar4.zzN(), 0, zzd2);
                        zzdxVar4.zzM(4);
                        zzacuVar = zzacuVar.zze(zzfvv.zzo(zzafh.zzb(zzdxVar4)));
                    } else {
                        zzackVar.zzk(zzd2);
                    }
                }
                int i11 = zzeh.zza;
                this.zzh = zzacuVar;
            } while (!zzp);
            Objects.requireNonNull(zzacuVar);
            this.zzi = Math.max(zzacuVar.zzc, 6);
            zzz zzc = this.zzh.zzc(this.zza, this.zzg);
            zzadp zzadpVar = this.zze;
            zzx zzb = zzc.zzb();
            zzb.zzE("audio/flac");
            zzadpVar.zzm(zzb.zzaj());
            this.zze.zzl(this.zzh.zza());
            this.zzf = 4;
            return 0;
        } else if (i10 != 4) {
            Objects.requireNonNull(this.zze);
            zzacu zzacuVar2 = this.zzh;
            Objects.requireNonNull(zzacuVar2);
            zzaen zzaenVar = this.zzk;
            if (zzaenVar == null || !zzaenVar.zze()) {
                if (this.zzm == -1) {
                    this.zzm = zzacq.zzb(zzackVar, zzacuVar2);
                    return 0;
                }
                zzdx zzdxVar5 = this.zzb;
                int zze2 = zzdxVar5.zze();
                if (zze2 < 32768) {
                    int zza2 = zzackVar.zza(zzdxVar5.zzN(), zze2, 32768 - zze2);
                    z10 = zza2 == -1;
                    if (!z10) {
                        this.zzb.zzK(zze2 + zza2);
                    } else if (this.zzb.zzb() == 0) {
                        zzg();
                        return -1;
                    }
                } else {
                    z10 = false;
                }
                zzdx zzdxVar6 = this.zzb;
                int zzd3 = zzdxVar6.zzd();
                int i12 = this.zzl;
                int i13 = this.zzi;
                if (i12 < i13) {
                    zzdxVar6.zzM(Math.min(i13 - i12, zzdxVar6.zzb()));
                }
                long zza3 = zza(this.zzb, z10);
                zzdx zzdxVar7 = this.zzb;
                int zzd4 = zzdxVar7.zzd() - zzd3;
                zzdxVar7.zzL(zzd3);
                this.zze.zzr(this.zzb, zzd4);
                this.zzl += zzd4;
                if (zza3 != -1) {
                    zzg();
                    this.zzl = 0;
                    this.zzm = zza3;
                }
                zzdx zzdxVar8 = this.zzb;
                if (zzdxVar8.zzb() >= 16) {
                    return 0;
                }
                int zzb2 = zzdxVar8.zzb();
                System.arraycopy(zzdxVar8.zzN(), zzdxVar8.zzd(), zzdxVar8.zzN(), 0, zzb2);
                this.zzb.zzL(0);
                this.zzb.zzK(zzb2);
                return 0;
            }
            return zzaenVar.zza(zzackVar, zzadfVar);
        } else {
            zzackVar.zzj();
            zzdx zzdxVar9 = new zzdx(2);
            zzackVar.zzh(zzdxVar9.zzN(), 0, 2);
            int zzq = zzdxVar9.zzq();
            if ((zzq >> 2) == 16382) {
                zzackVar.zzj();
                this.zzj = zzq;
                zzacm zzacmVar = this.zzd;
                int i14 = zzeh.zza;
                long zzf = zzackVar.zzf();
                long zzd5 = zzackVar.zzd();
                zzacu zzacuVar3 = this.zzh;
                Objects.requireNonNull(zzacuVar3);
                if (zzacuVar3.zzk != null) {
                    zzadhVar = new zzacs(zzacuVar3, zzf);
                } else if (zzd5 != -1 && zzacuVar3.zzj > 0) {
                    zzaen zzaenVar2 = new zzaen(zzacuVar3, this.zzj, zzf, zzd5);
                    this.zzk = zzaenVar2;
                    zzadhVar = zzaenVar2.zzb();
                } else {
                    zzadhVar = new zzadh(zzacuVar3.zza(), 0L);
                }
                zzacmVar.zzP(zzadhVar);
                this.zzf = 5;
                return 0;
            }
            zzackVar.zzj();
            throw zzaz.zza("First frame does not start with sync code.", null);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzacj
    public final /* synthetic */ zzacj zzc() {
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzacj
    public final /* synthetic */ List zzd() {
        return zzfvv.zzn();
    }

    @Override // com.google.android.gms.internal.ads.zzacj
    public final void zze(zzacm zzacmVar) {
        this.zzd = zzacmVar;
        this.zze = zzacmVar.zzw(0, 1);
        zzacmVar.zzG();
    }

    @Override // com.google.android.gms.internal.ads.zzacj
    public final void zzf(long j10, long j11) {
        if (j10 == 0) {
            this.zzf = 0;
        } else {
            zzaen zzaenVar = this.zzk;
            if (zzaenVar != null) {
                zzaenVar.zzd(j11);
            }
        }
        this.zzm = j11 != 0 ? -1L : 0L;
        this.zzl = 0;
        this.zzb.zzI(0);
    }

    @Override // com.google.android.gms.internal.ads.zzacj
    public final boolean zzi(zzack zzackVar) throws IOException {
        zzacr.zza(zzackVar, false);
        zzdx zzdxVar = new zzdx(4);
        ((zzaby) zzackVar).zzm(zzdxVar.zzN(), 0, 4, false);
        return zzdxVar.zzu() == 1716281667;
    }
}
