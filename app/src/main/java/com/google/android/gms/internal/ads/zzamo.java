package com.google.android.gms.internal.ads;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzamo implements zzanb {
    private final zzamn zza;
    private final zzdx zzb = new zzdx(32);
    private int zzc;
    private int zzd;
    private boolean zze;
    private boolean zzf;

    public zzamo(zzamn zzamnVar) {
        this.zza = zzamnVar;
    }

    @Override // com.google.android.gms.internal.ads.zzanb
    public final void zza(zzdx zzdxVar, int i10) {
        int i11 = i10 & 1;
        int zzd = i11 != 0 ? zzdxVar.zzd() + zzdxVar.zzm() : -1;
        if (this.zzf) {
            if (i11 == 0) {
                return;
            }
            this.zzf = false;
            zzdxVar.zzL(zzd);
            this.zzd = 0;
        }
        while (zzdxVar.zzb() > 0) {
            int i12 = this.zzd;
            if (i12 < 3) {
                if (i12 == 0) {
                    int zzm = zzdxVar.zzm();
                    zzdxVar.zzL(zzdxVar.zzd() - 1);
                    if (zzm == 255) {
                        this.zzf = true;
                        return;
                    }
                }
                int min = Math.min(zzdxVar.zzb(), 3 - this.zzd);
                zzdxVar.zzH(this.zzb.zzN(), this.zzd, min);
                int i13 = this.zzd + min;
                this.zzd = i13;
                if (i13 == 3) {
                    this.zzb.zzL(0);
                    this.zzb.zzK(3);
                    this.zzb.zzM(1);
                    zzdx zzdxVar2 = this.zzb;
                    int zzm2 = zzdxVar2.zzm();
                    boolean z10 = (zzm2 & 128) != 0;
                    int zzm3 = zzdxVar2.zzm();
                    this.zze = z10;
                    this.zzc = (zzm3 | ((zzm2 & 15) << 8)) + 3;
                    int zzc = this.zzb.zzc();
                    int i14 = this.zzc;
                    if (zzc < i14) {
                        int zzc2 = this.zzb.zzc();
                        this.zzb.zzF(Math.min(4098, Math.max(i14, zzc2 + zzc2)));
                    }
                }
            } else {
                int min2 = Math.min(zzdxVar.zzb(), this.zzc - i12);
                zzdxVar.zzH(this.zzb.zzN(), this.zzd, min2);
                int i15 = this.zzd + min2;
                this.zzd = i15;
                int i16 = this.zzc;
                if (i15 != i16) {
                    continue;
                } else {
                    if (this.zze) {
                        if (zzeh.zzf(this.zzb.zzN(), 0, i16, -1) == 0) {
                            this.zzb.zzK(this.zzc - 4);
                        } else {
                            this.zzf = true;
                            return;
                        }
                    } else {
                        this.zzb.zzK(i16);
                    }
                    this.zzb.zzL(0);
                    this.zza.zza(this.zzb);
                    this.zzd = 0;
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzanb
    public final void zzb(zzee zzeeVar, zzacm zzacmVar, zzana zzanaVar) {
        this.zza.zzb(zzeeVar, zzacmVar, zzanaVar);
        this.zzf = true;
    }

    @Override // com.google.android.gms.internal.ads.zzanb
    public final void zzc() {
        this.zzf = true;
    }
}
