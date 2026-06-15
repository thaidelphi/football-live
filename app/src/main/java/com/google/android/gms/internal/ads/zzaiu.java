package com.google.android.gms.internal.ads;

import java.io.IOException;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public abstract class zzaiu {
    private zzadp zzb;
    private zzacm zzc;
    private zzaip zzd;
    private long zze;
    private long zzf;
    private long zzg;
    private int zzh;
    private int zzi;
    private long zzk;
    private boolean zzl;
    private boolean zzm;
    private final zzain zza = new zzain();
    private zzair zzj = new zzair();

    protected abstract long zza(zzdx zzdxVar);

    /* JADX INFO: Access modifiers changed from: protected */
    public void zzb(boolean z10) {
        int i10;
        if (z10) {
            this.zzj = new zzair();
            this.zzf = 0L;
            i10 = 0;
        } else {
            i10 = 1;
        }
        this.zzh = i10;
        this.zze = -1L;
        this.zzg = 0L;
    }

    protected abstract boolean zzc(zzdx zzdxVar, long j10, zzair zzairVar) throws IOException;

    /* JADX INFO: Access modifiers changed from: package-private */
    public final int zze(zzack zzackVar, zzadf zzadfVar) throws IOException {
        zzcv.zzb(this.zzb);
        int i10 = zzeh.zza;
        int i11 = this.zzh;
        if (i11 == 0) {
            while (this.zza.zze(zzackVar)) {
                long zzf = zzackVar.zzf();
                long j10 = this.zzf;
                this.zzk = zzf - j10;
                if (zzc(this.zza.zza(), j10, this.zzj)) {
                    this.zzf = zzackVar.zzf();
                } else {
                    zzz zzzVar = this.zzj.zza;
                    this.zzi = zzzVar.zzF;
                    if (!this.zzm) {
                        this.zzb.zzm(zzzVar);
                        this.zzm = true;
                    }
                    zzaip zzaipVar = this.zzj.zzb;
                    if (zzaipVar != null) {
                        this.zzd = zzaipVar;
                    } else if (zzackVar.zzd() == -1) {
                        this.zzd = new zzais(null);
                    } else {
                        zzaio zzb = this.zza.zzb();
                        this.zzd = new zzaij(this, this.zzf, zzackVar.zzd(), zzb.zzd + zzb.zze, zzb.zzb, (zzb.zza & 4) != 0);
                    }
                    this.zzh = 2;
                    this.zza.zzd();
                }
            }
            this.zzh = 3;
            return -1;
        } else if (i11 == 1) {
            zzackVar.zzk((int) this.zzf);
            this.zzh = 2;
            return 0;
        } else if (i11 != 2) {
            return -1;
        } else {
            long zzd = this.zzd.zzd(zzackVar);
            if (zzd >= 0) {
                zzadfVar.zza = zzd;
                return 1;
            }
            if (zzd < -1) {
                zzi(-(zzd + 2));
            }
            if (!this.zzl) {
                zzadi zze = this.zzd.zze();
                zzcv.zzb(zze);
                this.zzc.zzP(zze);
                this.zzb.zzl(zze.zza());
                this.zzl = true;
            }
            if (this.zzk <= 0 && !this.zza.zze(zzackVar)) {
                this.zzh = 3;
                return -1;
            }
            this.zzk = 0L;
            zzdx zza = this.zza.zza();
            long zza2 = zza(zza);
            if (zza2 >= 0) {
                long j11 = this.zzg;
                if (j11 + zza2 >= this.zze) {
                    long zzf2 = zzf(j11);
                    this.zzb.zzr(zza, zza.zze());
                    this.zzb.zzt(zzf2, 1, zza.zze(), 0, null);
                    this.zze = -1L;
                }
            }
            this.zzg += zza2;
        }
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final long zzf(long j10) {
        return (j10 * 1000000) / this.zzi;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final long zzg(long j10) {
        return (this.zzi * j10) / 1000000;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zzh(zzacm zzacmVar, zzadp zzadpVar) {
        this.zzc = zzacmVar;
        this.zzb = zzadpVar;
        zzb(true);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void zzi(long j10) {
        this.zzg = j10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zzj(long j10, long j11) {
        this.zza.zzc();
        if (j10 == 0) {
            zzb(!this.zzl);
        } else if (this.zzh != 0) {
            long zzg = zzg(j11);
            this.zze = zzg;
            zzaip zzaipVar = this.zzd;
            int i10 = zzeh.zza;
            zzaipVar.zzg(zzg);
            this.zzh = 2;
        }
    }
}
