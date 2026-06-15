package com.google.android.gms.internal.ads;

import com.google.protobuf.CodedOutputStream;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzaly implements zzalm {
    private final zzdx zza;
    private final zzadb zzb;
    private final String zzc;
    private final int zzd;
    private final String zze;
    private zzadp zzf;
    private String zzg;
    private int zzh = 0;
    private int zzi;
    private boolean zzj;
    private boolean zzk;
    private long zzl;
    private int zzm;
    private long zzn;

    public zzaly(String str, int i10, String str2) {
        zzdx zzdxVar = new zzdx(4);
        this.zza = zzdxVar;
        zzdxVar.zzN()[0] = -1;
        this.zzb = new zzadb();
        this.zzn = -9223372036854775807L;
        this.zzc = str;
        this.zzd = i10;
        this.zze = str2;
    }

    @Override // com.google.android.gms.internal.ads.zzalm
    public final void zza(zzdx zzdxVar) {
        zzadb zzadbVar;
        zzcv.zzb(this.zzf);
        while (zzdxVar.zzb() > 0) {
            int i10 = this.zzh;
            if (i10 == 0) {
                byte[] zzN = zzdxVar.zzN();
                int zzd = zzdxVar.zzd();
                int zze = zzdxVar.zze();
                while (true) {
                    if (zzd < zze) {
                        int i11 = zzd + 1;
                        byte b10 = zzN[zzd];
                        boolean z10 = (b10 & 255) == 255;
                        boolean z11 = this.zzk && (b10 & 224) == 224;
                        this.zzk = z10;
                        if (z11) {
                            zzdxVar.zzL(i11);
                            this.zzk = false;
                            this.zza.zzN()[1] = zzN[zzd];
                            this.zzi = 2;
                            this.zzh = 1;
                            break;
                        }
                        zzd = i11;
                    } else {
                        zzdxVar.zzL(zze);
                        break;
                    }
                }
            } else if (i10 != 1) {
                int min = Math.min(zzdxVar.zzb(), this.zzm - this.zzi);
                this.zzf.zzr(zzdxVar, min);
                int i12 = this.zzi + min;
                this.zzi = i12;
                if (i12 >= this.zzm) {
                    zzcv.zzf(this.zzn != -9223372036854775807L);
                    this.zzf.zzt(this.zzn, 1, this.zzm, 0, null);
                    this.zzn += this.zzl;
                    this.zzi = 0;
                    this.zzh = 0;
                }
            } else {
                int min2 = Math.min(zzdxVar.zzb(), 4 - this.zzi);
                zzdxVar.zzH(this.zza.zzN(), this.zzi, min2);
                int i13 = this.zzi + min2;
                this.zzi = i13;
                if (i13 >= 4) {
                    this.zza.zzL(0);
                    if (this.zzb.zza(this.zza.zzg())) {
                        this.zzm = this.zzb.zzc;
                        if (!this.zzj) {
                            this.zzl = (zzadbVar.zzg * 1000000) / zzadbVar.zzd;
                            zzx zzxVar = new zzx();
                            zzxVar.zzO(this.zzg);
                            zzxVar.zzE(this.zze);
                            zzxVar.zzad(this.zzb.zzb);
                            zzxVar.zzT(CodedOutputStream.DEFAULT_BUFFER_SIZE);
                            zzxVar.zzB(this.zzb.zze);
                            zzxVar.zzae(this.zzb.zzd);
                            zzxVar.zzS(this.zzc);
                            zzxVar.zzab(this.zzd);
                            this.zzf.zzm(zzxVar.zzaj());
                            this.zzj = true;
                        }
                        this.zza.zzL(0);
                        this.zzf.zzr(this.zza, 4);
                        this.zzh = 2;
                    } else {
                        this.zzi = 0;
                        this.zzh = 1;
                    }
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzalm
    public final void zzb(zzacm zzacmVar, zzana zzanaVar) {
        zzanaVar.zzc();
        this.zzg = zzanaVar.zzb();
        this.zzf = zzacmVar.zzw(zzanaVar.zza(), 1);
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
        this.zzk = false;
        this.zzn = -9223372036854775807L;
    }
}
