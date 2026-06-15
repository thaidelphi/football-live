package com.google.android.gms.internal.ads;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzalg implements zzalm {
    private final zzdw zza;
    private final zzdx zzb;
    private final String zzc;
    private final int zzd;
    private final String zze;
    private String zzf;
    private zzadp zzg;
    private int zzh;
    private int zzi;
    private boolean zzj;
    private long zzk;
    private zzz zzl;
    private int zzm;
    private long zzn;

    public zzalg(String str, int i10, String str2) {
        zzdw zzdwVar = new zzdw(new byte[16], 16);
        this.zza = zzdwVar;
        this.zzb = new zzdx(zzdwVar.zza);
        this.zzh = 0;
        this.zzi = 0;
        this.zzj = false;
        this.zzn = -9223372036854775807L;
        this.zzc = str;
        this.zzd = i10;
        this.zze = str2;
    }

    @Override // com.google.android.gms.internal.ads.zzalm
    public final void zza(zzdx zzdxVar) {
        zzcv.zzb(this.zzg);
        while (zzdxVar.zzb() > 0) {
            int i10 = this.zzh;
            if (i10 == 0) {
                while (zzdxVar.zzb() > 0) {
                    if (!this.zzj) {
                        this.zzj = zzdxVar.zzm() == 172;
                    } else {
                        int zzm = zzdxVar.zzm();
                        this.zzj = zzm == 172;
                        if (zzm != 64) {
                            if (zzm == 65) {
                                zzm = 65;
                            }
                        }
                        this.zzh = 1;
                        zzdx zzdxVar2 = this.zzb;
                        zzdxVar2.zzN()[0] = -84;
                        zzdxVar2.zzN()[1] = zzm == 65 ? (byte) 65 : (byte) 64;
                        this.zzi = 2;
                    }
                }
            } else if (i10 != 1) {
                int min = Math.min(zzdxVar.zzb(), this.zzm - this.zzi);
                this.zzg.zzr(zzdxVar, min);
                int i11 = this.zzi + min;
                this.zzi = i11;
                if (i11 == this.zzm) {
                    zzcv.zzf(this.zzn != -9223372036854775807L);
                    this.zzg.zzt(this.zzn, 1, this.zzm, 0, null);
                    this.zzn += this.zzk;
                    this.zzh = 0;
                }
            } else {
                byte[] zzN = this.zzb.zzN();
                int min2 = Math.min(zzdxVar.zzb(), 16 - this.zzi);
                zzdxVar.zzH(zzN, this.zzi, min2);
                int i12 = this.zzi + min2;
                this.zzi = i12;
                if (i12 == 16) {
                    this.zza.zzl(0);
                    zzabk zzb = zzabm.zzb(this.zza);
                    zzz zzzVar = this.zzl;
                    if (zzzVar == null || zzzVar.zzE != 2 || zzb.zza != zzzVar.zzF || !"audio/ac4".equals(zzzVar.zzo)) {
                        zzx zzxVar = new zzx();
                        zzxVar.zzO(this.zzf);
                        zzxVar.zzE(this.zze);
                        zzxVar.zzad("audio/ac4");
                        zzxVar.zzB(2);
                        zzxVar.zzae(zzb.zza);
                        zzxVar.zzS(this.zzc);
                        zzxVar.zzab(this.zzd);
                        zzz zzaj = zzxVar.zzaj();
                        this.zzl = zzaj;
                        this.zzg.zzm(zzaj);
                    }
                    this.zzm = zzb.zzb;
                    this.zzk = (zzb.zzc * 1000000) / this.zzl.zzF;
                    this.zzb.zzL(0);
                    this.zzg.zzr(this.zzb, 16);
                    this.zzh = 2;
                }
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
        this.zzn = j10;
    }

    @Override // com.google.android.gms.internal.ads.zzalm
    public final void zze() {
        this.zzh = 0;
        this.zzi = 0;
        this.zzj = false;
        this.zzn = -9223372036854775807L;
    }
}
