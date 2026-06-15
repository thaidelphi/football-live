package com.google.android.gms.internal.ads;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzalw implements zzalm {
    private zzadp zzc;
    private boolean zzd;
    private int zzf;
    private int zzg;
    private final String zza = "video/mp2t";
    private final zzdx zzb = new zzdx(10);
    private long zze = -9223372036854775807L;

    public zzalw(String str) {
    }

    @Override // com.google.android.gms.internal.ads.zzalm
    public final void zza(zzdx zzdxVar) {
        zzcv.zzb(this.zzc);
        if (this.zzd) {
            int zzb = zzdxVar.zzb();
            int i10 = this.zzg;
            if (i10 < 10) {
                int min = Math.min(zzb, 10 - i10);
                System.arraycopy(zzdxVar.zzN(), zzdxVar.zzd(), this.zzb.zzN(), this.zzg, min);
                if (this.zzg + min == 10) {
                    this.zzb.zzL(0);
                    if (this.zzb.zzm() == 73 && this.zzb.zzm() == 68 && this.zzb.zzm() == 51) {
                        this.zzb.zzM(3);
                        this.zzf = this.zzb.zzl() + 10;
                    } else {
                        zzdn.zzf("Id3Reader", "Discarding invalid ID3 tag");
                        this.zzd = false;
                        return;
                    }
                }
            }
            int min2 = Math.min(zzb, this.zzf - this.zzg);
            this.zzc.zzr(zzdxVar, min2);
            this.zzg += min2;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzalm
    public final void zzb(zzacm zzacmVar, zzana zzanaVar) {
        zzanaVar.zzc();
        zzadp zzw = zzacmVar.zzw(zzanaVar.zza(), 5);
        this.zzc = zzw;
        zzx zzxVar = new zzx();
        zzxVar.zzO(zzanaVar.zzb());
        zzxVar.zzE(this.zza);
        zzxVar.zzad("application/id3");
        zzw.zzm(zzxVar.zzaj());
    }

    @Override // com.google.android.gms.internal.ads.zzalm
    public final void zzc(boolean z10) {
        int i10;
        zzcv.zzb(this.zzc);
        if (this.zzd && (i10 = this.zzf) != 0 && this.zzg == i10) {
            zzcv.zzf(this.zze != -9223372036854775807L);
            this.zzc.zzt(this.zze, 1, this.zzf, 0, null);
            this.zzd = false;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzalm
    public final void zzd(long j10, int i10) {
        if ((i10 & 4) == 0) {
            return;
        }
        this.zzd = true;
        this.zze = j10;
        this.zzf = 0;
        this.zzg = 0;
    }

    @Override // com.google.android.gms.internal.ads.zzalm
    public final void zze() {
        this.zzd = false;
        this.zze = -9223372036854775807L;
    }
}
